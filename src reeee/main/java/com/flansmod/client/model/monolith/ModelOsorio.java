//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Osorio
// Model Creator: 
// Created on: 04.07.2016 - 21:54:16
// Last changed on: 04.07.2016 - 21:54:16

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOsorio extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelOsorio() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[204];
		turretModel = new ModelRendererTurbo[91];
		barrelModel = new ModelRendererTurbo[24];
		leftTrackWheelModels = new ModelRendererTurbo[212];
		rightTrackWheelModels = new ModelRendererTurbo[190];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 56, 1776, textureX, textureY); // Import ImportBox0
		bodyModel[1] = new ModelRendererTurbo(this, 82, 1606, textureX, textureY); // Import ImportBox1
		bodyModel[2] = new ModelRendererTurbo(this, 194, 1736, textureX, textureY); // Import ImportBox10
		bodyModel[3] = new ModelRendererTurbo(this, 84, 300, textureX, textureY); // Import ImportBox100
		bodyModel[4] = new ModelRendererTurbo(this, 204, 272, textureX, textureY); // Import ImportBox101
		bodyModel[5] = new ModelRendererTurbo(this, 10, 272, textureX, textureY); // Import ImportBox102
		bodyModel[6] = new ModelRendererTurbo(this, 226, 272, textureX, textureY); // Import ImportBox103
		bodyModel[7] = new ModelRendererTurbo(this, 242, 272, textureX, textureY); // Import ImportBox104
		bodyModel[8] = new ModelRendererTurbo(this, 540, 304, textureX, textureY); // Import ImportBox141
		bodyModel[9] = new ModelRendererTurbo(this, 586, 337, textureX, textureY); // Import ImportBox142
		bodyModel[10] = new ModelRendererTurbo(this, 636, 313, textureX, textureY); // Import ImportBox143
		bodyModel[11] = new ModelRendererTurbo(this, 540, 320, textureX, textureY); // Import ImportBox145
		bodyModel[12] = new ModelRendererTurbo(this, 540, 308, textureX, textureY); // Import ImportBox146
		bodyModel[13] = new ModelRendererTurbo(this, 541, 312, textureX, textureY); // Import ImportBox147
		bodyModel[14] = new ModelRendererTurbo(this, 279, 1433, textureX, textureY); // Import ImportBox150
		bodyModel[15] = new ModelRendererTurbo(this, 255, 1421, textureX, textureY); // Import ImportBox151
		bodyModel[16] = new ModelRendererTurbo(this, 232, 1428, textureX, textureY); // Import ImportBox152
		bodyModel[17] = new ModelRendererTurbo(this, 441, 1418, textureX, textureY); // Import ImportBox153
		bodyModel[18] = new ModelRendererTurbo(this, 457, 1418, textureX, textureY); // Import ImportBox154
		bodyModel[19] = new ModelRendererTurbo(this, 245, 1430, textureX, textureY); // Import ImportBox155
		bodyModel[20] = new ModelRendererTurbo(this, 22, 1878, textureX, textureY); // Import ImportBox156
		bodyModel[21] = new ModelRendererTurbo(this, 144, 1160, textureX, textureY); // Import ImportBox157
		bodyModel[22] = new ModelRendererTurbo(this, 174, 1840, textureX, textureY); // Import ImportBox158
		bodyModel[23] = new ModelRendererTurbo(this, 113, 1726, textureX, textureY); // Import ImportBox2
		bodyModel[24] = new ModelRendererTurbo(this, 106, 1818, textureX, textureY); // Import ImportBox26
		bodyModel[25] = new ModelRendererTurbo(this, 224, 1463, textureX, textureY); // Import ImportBox27
		bodyModel[26] = new ModelRendererTurbo(this, 68, 1922, textureX, textureY); // Import ImportBox28
		bodyModel[27] = new ModelRendererTurbo(this, 268, 1876, textureX, textureY); // Import ImportBox29
		bodyModel[28] = new ModelRendererTurbo(this, 180, 1960, textureX, textureY); // Import ImportBox3
		bodyModel[29] = new ModelRendererTurbo(this, 350, 1888, textureX, textureY); // Import ImportBox30
		bodyModel[30] = new ModelRendererTurbo(this, 207, 1435, textureX, textureY); // Import ImportBox301
		bodyModel[31] = new ModelRendererTurbo(this, 232, 1434, textureX, textureY); // Import ImportBox302
		bodyModel[32] = new ModelRendererTurbo(this, 250, 1437, textureX, textureY); // Import ImportBox303
		bodyModel[33] = new ModelRendererTurbo(this, 299, 1433, textureX, textureY); // Import ImportBox304
		bodyModel[34] = new ModelRendererTurbo(this, 217, 1428, textureX, textureY); // Import ImportBox305
		bodyModel[35] = new ModelRendererTurbo(this, 586, 304, textureX, textureY); // Import ImportBox307
		bodyModel[36] = new ModelRendererTurbo(this, 255, 1431, textureX, textureY); // Import ImportBox308
		bodyModel[37] = new ModelRendererTurbo(this, 151, 1439, textureX, textureY); // Import ImportBox309
		bodyModel[38] = new ModelRendererTurbo(this, 175, 1453, textureX, textureY); // Import ImportBox310
		bodyModel[39] = new ModelRendererTurbo(this, 175, 1453, textureX, textureY); // Import ImportBox311
		bodyModel[40] = new ModelRendererTurbo(this, 204, 1437, textureX, textureY); // Import ImportBox312
		bodyModel[41] = new ModelRendererTurbo(this, 586, 304, textureX, textureY); // Import ImportBox313
		bodyModel[42] = new ModelRendererTurbo(this, 92, 1700, textureX, textureY); // Import ImportBox32
		bodyModel[43] = new ModelRendererTurbo(this, 449, 1647, textureX, textureY); // Import ImportBox34
		bodyModel[44] = new ModelRendererTurbo(this, 428, 1726, textureX, textureY); // Import ImportBox4
		bodyModel[45] = new ModelRendererTurbo(this, 6, 1898, textureX, textureY); // Import ImportBox6
		bodyModel[46] = new ModelRendererTurbo(this, 30, 1542, textureX, textureY); // Import ImportBox7
		bodyModel[47] = new ModelRendererTurbo(this, 12, 1864, textureX, textureY); // Import ImportBox8
		bodyModel[48] = new ModelRendererTurbo(this, 152, 1588, textureX, textureY); // Import ImportBox9
		bodyModel[49] = new ModelRendererTurbo(this, 15, 235, textureX, textureY); // Import ImportBox97
		bodyModel[50] = new ModelRendererTurbo(this, 15, 297, textureX, textureY); // Import ImportBox98
		bodyModel[51] = new ModelRendererTurbo(this, 126, 299, textureX, textureY); // Import ImportBox99
		bodyModel[52] = new ModelRendererTurbo(this, 175, 1453, textureX, textureY); // Import ImportBox342
		bodyModel[53] = new ModelRendererTurbo(this, 175, 1453, textureX, textureY); // Import ImportBox343
		bodyModel[54] = new ModelRendererTurbo(this, 217, 1433, textureX, textureY); // Import ImportBox354
		bodyModel[55] = new ModelRendererTurbo(this, 255, 1485, textureX, textureY); // Import ImportBox356
		bodyModel[56] = new ModelRendererTurbo(this, 251, 1441, textureX, textureY); // Import ImportBox358
		bodyModel[57] = new ModelRendererTurbo(this, 285, 1373, textureX, textureY); // Import ImportBox360
		bodyModel[58] = new ModelRendererTurbo(this, 242, 1461, textureX, textureY); // Import ImportBox361
		bodyModel[59] = new ModelRendererTurbo(this, 243, 1450, textureX, textureY); // Import ImportBox416
		bodyModel[60] = new ModelRendererTurbo(this, 322, 1370, textureX, textureY); // Import ImportBox417
		bodyModel[61] = new ModelRendererTurbo(this, 220, 1442, textureX, textureY); // Import ImportBox418
		bodyModel[62] = new ModelRendererTurbo(this, 222, 1446, textureX, textureY); // Import ImportBox419
		bodyModel[63] = new ModelRendererTurbo(this, 271, 1434, textureX, textureY); // Import ImportBox420
		bodyModel[64] = new ModelRendererTurbo(this, 275, 1424, textureX, textureY); // Import ImportBox431
		bodyModel[65] = new ModelRendererTurbo(this, 251, 1444, textureX, textureY); // Import ImportBox432
		bodyModel[66] = new ModelRendererTurbo(this, 353, 1372, textureX, textureY); // Import ImportBox433
		bodyModel[67] = new ModelRendererTurbo(this, 318, 1431, textureX, textureY); // Import ImportBox434
		bodyModel[68] = new ModelRendererTurbo(this, 218, 1432, textureX, textureY); // Import ImportBox435
		bodyModel[69] = new ModelRendererTurbo(this, 199, 1685, textureX, textureY); // Import ImportBox434
		bodyModel[70] = new ModelRendererTurbo(this, 98, 1868, textureX, textureY); // Import ImportBox435
		bodyModel[71] = new ModelRendererTurbo(this, 212, 1728, textureX, textureY); // Import ImportBox436
		bodyModel[72] = new ModelRendererTurbo(this, 67, 1634, textureX, textureY); // Import ImportBox437
		bodyModel[73] = new ModelRendererTurbo(this, -7, 1954, textureX, textureY); // Import ImportBox438
		bodyModel[74] = new ModelRendererTurbo(this, 384, 2016, textureX, textureY); // Import ImportBox439
		bodyModel[75] = new ModelRendererTurbo(this, 394, 1781, textureX, textureY); // Import ImportBox440
		bodyModel[76] = new ModelRendererTurbo(this, 63, 1827, textureX, textureY); // Import ImportBox441
		bodyModel[77] = new ModelRendererTurbo(this, 540, 316, textureX, textureY); // Import ImportBox426
		bodyModel[78] = new ModelRendererTurbo(this, 419, 1637, textureX, textureY); // Import ImportBox427
		bodyModel[79] = new ModelRendererTurbo(this, 84, 1167, textureX, textureY); // Import ImportBox428
		bodyModel[80] = new ModelRendererTurbo(this, 624, 333, textureX, textureY); // Import ImportBox429
		bodyModel[81] = new ModelRendererTurbo(this, 610, 316, textureX, textureY); // Import ImportBox430
		bodyModel[82] = new ModelRendererTurbo(this, 409, 1791, textureX, textureY); // Import ImportBox414
		bodyModel[83] = new ModelRendererTurbo(this, 385, 1703, textureX, textureY); // Import ImportBox415
		bodyModel[84] = new ModelRendererTurbo(this, 244, 1548, textureX, textureY); // Import ImportBox416
		bodyModel[85] = new ModelRendererTurbo(this, 290, 1998, textureX, textureY); // Import ImportBox417
		bodyModel[86] = new ModelRendererTurbo(this, 97, 1693, textureX, textureY); // Import ImportBox418
		bodyModel[87] = new ModelRendererTurbo(this, 394, 1677, textureX, textureY); // Import ImportBox419
		bodyModel[88] = new ModelRendererTurbo(this, 225, 1991, textureX, textureY); // Import ImportBox420
		bodyModel[89] = new ModelRendererTurbo(this, 324, 1892, textureX, textureY); // Import ImportBox421
		bodyModel[90] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox432
		bodyModel[91] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox433
		bodyModel[92] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox434
		bodyModel[93] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox435
		bodyModel[94] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox436
		bodyModel[95] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox437
		bodyModel[96] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox438
		bodyModel[97] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox439
		bodyModel[98] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox440
		bodyModel[99] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox441
		bodyModel[100] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox442
		bodyModel[101] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox443
		bodyModel[102] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox444
		bodyModel[103] = new ModelRendererTurbo(this, 380, 6, textureX, textureY); // Import ImportBox445
		bodyModel[104] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox449
		bodyModel[105] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox450
		bodyModel[106] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox451
		bodyModel[107] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox452
		bodyModel[108] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox454
		bodyModel[109] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox455
		bodyModel[110] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox456
		bodyModel[111] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox457
		bodyModel[112] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox458
		bodyModel[113] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox459
		bodyModel[114] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox460
		bodyModel[115] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox461
		bodyModel[116] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox462
		bodyModel[117] = new ModelRendererTurbo(this, 399, 6, textureX, textureY); // Import ImportBox463
		bodyModel[118] = new ModelRendererTurbo(this, 264, 1440, textureX, textureY); // Import ImportBox646
		bodyModel[119] = new ModelRendererTurbo(this, 264, 1440, textureX, textureY); // Import ImportBox647
		bodyModel[120] = new ModelRendererTurbo(this, 264, 1440, textureX, textureY); // Import ImportBox648
		bodyModel[121] = new ModelRendererTurbo(this, 586, 337, textureX, textureY); // Import ImportBox649
		bodyModel[122] = new ModelRendererTurbo(this, 540, 320, textureX, textureY); // Import ImportBox650
		bodyModel[123] = new ModelRendererTurbo(this, 540, 304, textureX, textureY); // Import ImportBox651
		bodyModel[124] = new ModelRendererTurbo(this, 636, 313, textureX, textureY); // Import ImportBox652
		bodyModel[125] = new ModelRendererTurbo(this, 540, 308, textureX, textureY); // Import ImportBox653
		bodyModel[126] = new ModelRendererTurbo(this, 325, 295, textureX, textureY); // Import ImportBox657
		bodyModel[127] = new ModelRendererTurbo(this, 51, 291, textureX, textureY); // Import ImportBox658
		bodyModel[128] = new ModelRendererTurbo(this, 177, 294, textureX, textureY); // Import ImportBox659
		bodyModel[129] = new ModelRendererTurbo(this, 675, 1530, textureX, textureY); // Import ImportBox663
		bodyModel[130] = new ModelRendererTurbo(this, 675, 1530, textureX, textureY); // Import ImportBox664
		bodyModel[131] = new ModelRendererTurbo(this, 215, 1009, textureX, textureY); // Box 707
		bodyModel[132] = new ModelRendererTurbo(this, 204, 928, textureX, textureY); // Box 710
		bodyModel[133] = new ModelRendererTurbo(this, 156, 920, textureX, textureY); // Box 711
		bodyModel[134] = new ModelRendererTurbo(this, 124, 944, textureX, textureY); // Box 712
		bodyModel[135] = new ModelRendererTurbo(this, 136, 936, textureX, textureY); // Box 715
		bodyModel[136] = new ModelRendererTurbo(this, 68, 924, textureX, textureY); // Box 716
		bodyModel[137] = new ModelRendererTurbo(this, 232, 920, textureX, textureY); // Box 717
		bodyModel[138] = new ModelRendererTurbo(this, 124, 944, textureX, textureY); // Box 718
		bodyModel[139] = new ModelRendererTurbo(this, 180, 940, textureX, textureY); // Box 719
		bodyModel[140] = new ModelRendererTurbo(this, 120, 1304, textureX, textureY); // Box 720
		bodyModel[141] = new ModelRendererTurbo(this, 352, 1284, textureX, textureY); // Box 721
		bodyModel[142] = new ModelRendererTurbo(this, 224, 1304, textureX, textureY); // Box 722
		bodyModel[143] = new ModelRendererTurbo(this, 116, 936, textureX, textureY); // Box 723
		bodyModel[144] = new ModelRendererTurbo(this, 236, 960, textureX, textureY); // Box 724
		bodyModel[145] = new ModelRendererTurbo(this, 88, 944, textureX, textureY); // Box 725
		bodyModel[146] = new ModelRendererTurbo(this, 188, 936, textureX, textureY); // Box 726
		bodyModel[147] = new ModelRendererTurbo(this, 100, 932, textureX, textureY); // Box 727
		bodyModel[148] = new ModelRendererTurbo(this, 76, 944, textureX, textureY); // Box 728
		bodyModel[149] = new ModelRendererTurbo(this, 112, 928, textureX, textureY); // Box 729
		bodyModel[150] = new ModelRendererTurbo(this, 116, 924, textureX, textureY); // Box 730
		bodyModel[151] = new ModelRendererTurbo(this, 204, 928, textureX, textureY); // Box 710
		bodyModel[152] = new ModelRendererTurbo(this, 156, 920, textureX, textureY); // Box 711
		bodyModel[153] = new ModelRendererTurbo(this, 134, 1016, textureX, textureY); // Box 712
		bodyModel[154] = new ModelRendererTurbo(this, 136, 936, textureX, textureY); // Box 715
		bodyModel[155] = new ModelRendererTurbo(this, 68, 924, textureX, textureY); // Box 716
		bodyModel[156] = new ModelRendererTurbo(this, 232, 920, textureX, textureY); // Box 717
		bodyModel[157] = new ModelRendererTurbo(this, 124, 944, textureX, textureY); // Box 718
		bodyModel[158] = new ModelRendererTurbo(this, 180, 940, textureX, textureY); // Box 719
		bodyModel[159] = new ModelRendererTurbo(this, 256, 1178, textureX, textureY); // Box 739
		bodyModel[160] = new ModelRendererTurbo(this, 236, 1176, textureX, textureY); // Box 740
		bodyModel[161] = new ModelRendererTurbo(this, 218, 1170, textureX, textureY); // Box 741
		bodyModel[162] = new ModelRendererTurbo(this, 234, 1164, textureX, textureY); // Box 742
		bodyModel[163] = new ModelRendererTurbo(this, 200, 1168, textureX, textureY); // Box 743
		bodyModel[164] = new ModelRendererTurbo(this, 176, 1162, textureX, textureY); // Box 744
		bodyModel[165] = new ModelRendererTurbo(this, 250, 1032, textureX, textureY); // Box 745
		bodyModel[166] = new ModelRendererTurbo(this, 186, 1036, textureX, textureY); // Box 746
		bodyModel[167] = new ModelRendererTurbo(this, 156, 1032, textureX, textureY); // Box 747
		bodyModel[168] = new ModelRendererTurbo(this, 110, 1028, textureX, textureY); // Box 748
		bodyModel[169] = new ModelRendererTurbo(this, 108, 1044, textureX, textureY); // Box 749
		bodyModel[170] = new ModelRendererTurbo(this, 216, 1046, textureX, textureY); // Box 750
		bodyModel[171] = new ModelRendererTurbo(this, 172, 1012, textureX, textureY); // Box 751
		bodyModel[172] = new ModelRendererTurbo(this, 224, 1034, textureX, textureY); // Box 752
		bodyModel[173] = new ModelRendererTurbo(this, 188, 850, textureX, textureY); // Box 753
		bodyModel[174] = new ModelRendererTurbo(this, 152, 854, textureX, textureY); // Box 754
		bodyModel[175] = new ModelRendererTurbo(this, 152, 854, textureX, textureY); // Box 755
		bodyModel[176] = new ModelRendererTurbo(this, 188, 850, textureX, textureY); // Box 756
		bodyModel[177] = new ModelRendererTurbo(this, 100, 1472, textureX, textureY); // Box 760
		bodyModel[178] = new ModelRendererTurbo(this, 92, 1442, textureX, textureY); // Box 762
		bodyModel[179] = new ModelRendererTurbo(this, 136, 1468, textureX, textureY); // Box 763
		bodyModel[180] = new ModelRendererTurbo(this, 188, 1456, textureX, textureY); // Box 759
		bodyModel[181] = new ModelRendererTurbo(this, 124, 1440, textureX, textureY); // Box 760
		bodyModel[182] = new ModelRendererTurbo(this, 132, 1468, textureX, textureY); // Box 762
		bodyModel[183] = new ModelRendererTurbo(this, 100, 1472, textureX, textureY); // Box 763
		bodyModel[184] = new ModelRendererTurbo(this, 124, 1440, textureX, textureY); // Box 764
		bodyModel[185] = new ModelRendererTurbo(this, 132, 1468, textureX, textureY); // Box 765
		bodyModel[186] = new ModelRendererTurbo(this, 188, 1456, textureX, textureY); // Box 766
		bodyModel[187] = new ModelRendererTurbo(this, 92, 1442, textureX, textureY); // Box 767
		bodyModel[188] = new ModelRendererTurbo(this, 136, 1468, textureX, textureY); // Box 768
		bodyModel[189] = new ModelRendererTurbo(this, 60, 1020, textureX, textureY); // Box 765
		bodyModel[190] = new ModelRendererTurbo(this, 60, 1020, textureX, textureY); // Box 766
		bodyModel[191] = new ModelRendererTurbo(this, 60, 1020, textureX, textureY); // Box 767
		bodyModel[192] = new ModelRendererTurbo(this, 60, 1020, textureX, textureY); // Box 768
		bodyModel[193] = new ModelRendererTurbo(this, 325, 295, textureX, textureY); // Box 769
		bodyModel[194] = new ModelRendererTurbo(this, 242, 272, textureX, textureY); // Box 770
		bodyModel[195] = new ModelRendererTurbo(this, 226, 272, textureX, textureY); // Box 771
		bodyModel[196] = new ModelRendererTurbo(this, 10, 272, textureX, textureY); // Box 772
		bodyModel[197] = new ModelRendererTurbo(this, 51, 291, textureX, textureY); // Box 773
		bodyModel[198] = new ModelRendererTurbo(this, 177, 294, textureX, textureY); // Box 774
		bodyModel[199] = new ModelRendererTurbo(this, 15, 235, textureX, textureY); // Box 775
		bodyModel[200] = new ModelRendererTurbo(this, 15, 297, textureX, textureY); // Box 776
		bodyModel[201] = new ModelRendererTurbo(this, 126, 299, textureX, textureY); // Box 777
		bodyModel[202] = new ModelRendererTurbo(this, 84, 300, textureX, textureY); // Box 778
		bodyModel[203] = new ModelRendererTurbo(this, 204, 272, textureX, textureY); // Box 779

		bodyModel[0].addShapeBox(0F, 0F, 0F, 11, 32, 40, 0F,10F, 0F, 0F, -21F, 4F, 0F, -21F, 4F, 0F, 10F, 0F, 0F, 10F, -28F, 0F, 10F, -28F, 0F, 10F, -28F, 0F, 10F, -28F, 0F); // Import ImportBox0
		bodyModel[0].setRotationPoint(50F, -20F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 136, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		bodyModel[1].setRotationPoint(-64F, -19F, -32F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 105, 16, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 1F, -11F, 0F); // Import ImportBox10
		bodyModel[2].setRotationPoint(-65F, -24F, 20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, -7F, -2F); // Import ImportBox100
		bodyModel[3].setRotationPoint(-66F, -12F, -30F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,0F, -1F, 0F, -5F, 5F, 0F, -5F, 5F, -2F, 0F, -1F, -2F, -1F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, -2F, -1F, 0F, -2F); // Import ImportBox101
		bodyModel[4].setRotationPoint(-66F, -13F, -30F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 127, 1, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, -2F); // Import ImportBox102
		bodyModel[5].setRotationPoint(-60F, -18F, -30F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, -2F); // Import ImportBox103
		bodyModel[6].setRotationPoint(67F, -16F, -30F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,0F, 0F, 0F, -10F, -4F, 0F, -10F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -11F, 3F, 0F, -11F, 3F, -2F, 0F, 0F, -2F); // Import ImportBox104
		bodyModel[7].setRotationPoint(75F, -13F, -30F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox141
		bodyModel[8].setRotationPoint(72F, -14F, -21F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import ImportBox142
		bodyModel[9].setRotationPoint(73F, -19F, -32F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox143
		bodyModel[10].setRotationPoint(77F, -16F, -32F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox145
		bodyModel[11].setRotationPoint(72F, -16F, -21F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox146
		bodyModel[12].setRotationPoint(72F, -14F, -32F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox147
		bodyModel[13].setRotationPoint(72F, -16F, -32F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import ImportBox150
		bodyModel[14].setRotationPoint(-52F, -24F, -16F);
		bodyModel[14].rotateAngleX = 1.57079633F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import ImportBox151
		bodyModel[15].setRotationPoint(-52F, -24F, -7F);
		bodyModel[15].rotateAngleX = 1.57079633F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox152
		bodyModel[16].setRotationPoint(-47F, -28F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import ImportBox153
		bodyModel[17].setRotationPoint(-47F, -28F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import ImportBox154
		bodyModel[18].setRotationPoint(-52F, -24F, 12F);
		bodyModel[18].rotateAngleX = 1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import ImportBox155
		bodyModel[19].setRotationPoint(-52F, -24F, 3F);
		bodyModel[19].rotateAngleX = 1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 60, 16, 40, 0F,1F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 1F, 0F, 0F, 1F, -11F, 0F, -30F, -11F, 0F, -30F, -11F, 0F, 1F, -11F, 0F); // Import ImportBox156
		bodyModel[20].setRotationPoint(-65F, -24F, -20F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 2F, -2F, 0F); // Import ImportBox157
		bodyModel[21].setRotationPoint(-66F, -19F, 20F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 30, 16, 40, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F); // Import ImportBox158
		bodyModel[22].setRotationPoint(-65F, -19F, -20F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 136, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		bodyModel[23].setRotationPoint(-64F, -19F, 20F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 16, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Import ImportBox26
		bodyModel[24].setRotationPoint(-65F, -16F, -20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 104, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox27
		bodyModel[25].setRotationPoint(-57F, -1F, -20F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 16, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -1F, -12F, 0F); // Import ImportBox28
		bodyModel[26].setRotationPoint(-65F, -12F, -20F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 16, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -2F, -12F, 0F); // Import ImportBox29
		bodyModel[27].setRotationPoint(-64F, -8F, -20F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 15, 32, 40, 0F,8F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, 8F, -29F, 0F, 2F, -29F, 0F, 2F, -29F, 0F, 8F, -29F, 0F); // Import ImportBox3
		bodyModel[28].setRotationPoint(55F, -16F, -20F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 16, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -3F, -12F, 0F); // Import ImportBox30
		bodyModel[29].setRotationPoint(-62F, -4F, -20F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox301
		bodyModel[30].setRotationPoint(66F, -22F, 21F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F); // Import ImportBox302
		bodyModel[31].setRotationPoint(66F, -20F, 21F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import ImportBox303
		bodyModel[32].setRotationPoint(66F, -21F, 21F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import ImportBox304
		bodyModel[33].setRotationPoint(66F, -21F, 25F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportBox305
		bodyModel[34].setRotationPoint(67F, -21F, 23F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import ImportBox307
		bodyModel[35].setRotationPoint(66F, -21F, 22F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F); // Import ImportBox308
		bodyModel[36].setRotationPoint(66F, -20F, -26F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox309
		bodyModel[37].setRotationPoint(66F, -22F, -26F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import ImportBox310
		bodyModel[38].setRotationPoint(66F, -21F, -22F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import ImportBox311
		bodyModel[39].setRotationPoint(66F, -21F, -26F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportBox312
		bodyModel[40].setRotationPoint(67F, -21F, -24F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import ImportBox313
		bodyModel[41].setRotationPoint(66F, -21F, -25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 104, 15, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox32
		bodyModel[42].setRotationPoint(-57F, -16F, -20F);

		bodyModel[43].addBox(0F, 0F, 0F, 15, 5, 1, 0F); // Import ImportBox34
		bodyModel[43].setRotationPoint(57F, -18F, -21F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 21, 32, 40, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -19F, 0F, -14F, -19F, 0F, -14F, -19F, 0F, 4F, -19F, 0F); // Import ImportBox4
		bodyModel[44].setRotationPoint(51F, -13F, -20F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 75, 8, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox6
		bodyModel[45].setRotationPoint(-35F, -24F, -20F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 18, 16, 12, 0F,0F, 1F, 0F, -18F, 1F, 0F, -18F, 1F, -3F, 0F, 1F, -3F, 0F, -12F, 0F, 1F, -12F, 0F, 1F, -12F, 0F, 0F, -12F, 0F); // Import ImportBox7
		bodyModel[46].setRotationPoint(40F, -23F, 20F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 16, 12, 0F,0F, 1F, -3F, -18F, 1F, -3F, -18F, 1F, 0F, 0F, 1F, 0F, 0F, -12F, 0F, 1F, -12F, 0F, 1F, -12F, 0F, 0F, -12F, 0F); // Import ImportBox8
		bodyModel[47].setRotationPoint(40F, -23F, -32F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 105, 16, 12, 0F,1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 1F, -11F, 0F); // Import ImportBox9
		bodyModel[48].setRotationPoint(-65F, -24F, -32F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 110, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Import ImportBox97
		bodyModel[49].setRotationPoint(-53F, 8F, -30F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, -3F, 0F, 8F, -4F, 0F, 8F, -4F, -2F, -9F, -3F, -2F); // Import ImportBox98
		bodyModel[50].setRotationPoint(-62F, 1F, -30F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, -2F, -4F, -2F, -2F); // Import ImportBox99
		bodyModel[51].setRotationPoint(-66F, -8F, -30F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox342
		bodyModel[52].setRotationPoint(65F, -20F, -24F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox343
		bodyModel[53].setRotationPoint(65F, -20F, 23F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox354
		bodyModel[54].setRotationPoint(43F, -23F, 15F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox356
		bodyModel[55].setRotationPoint(43F, -25F, 15F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox358
		bodyModel[56].setRotationPoint(43F, -25F, 16F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox360
		bodyModel[57].setRotationPoint(44F, -24F, 16F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox361
		bodyModel[58].setRotationPoint(43F, -25F, 18F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox416
		bodyModel[59].setRotationPoint(43F, -25F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox417
		bodyModel[60].setRotationPoint(44F, -24F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox418
		bodyModel[61].setRotationPoint(43F, -23F, 9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox419
		bodyModel[62].setRotationPoint(43F, -25F, 12F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox420
		bodyModel[63].setRotationPoint(43F, -25F, 9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox431
		bodyModel[64].setRotationPoint(43F, -25F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox432
		bodyModel[65].setRotationPoint(43F, -25F, 3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox433
		bodyModel[66].setRotationPoint(44F, -24F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox434
		bodyModel[67].setRotationPoint(43F, -23F, 3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox435
		bodyModel[68].setRotationPoint(43F, -25F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 36, 32, 1, 0F,-15F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -15F, 0F, 0F, -11F, -27F, 0F, -10F, -19F, 0F, -10F, -19F, 0F, -11F, -27F, 0F); // Import ImportBox434
		bodyModel[69].setRotationPoint(-79F, -18F, 31F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 40, 32, 1, 0F,-15F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -15F, 0F, 0F, -15F, -19F, 0F, -10F, -18F, 0F, -10F, -18F, 0F, -15F, -19F, 0F); // Import ImportBox435
		bodyModel[70].setRotationPoint(-68F, -18F, 31F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 45, 32, 1, 0F,-10F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -10F, 0F, 0F, -10F, -18F, 0F, -15F, -20F, 0F, -15F, -20F, 0F, -10F, -18F, 0F); // Import ImportBox436
		bodyModel[71].setRotationPoint(-48F, -18F, 31F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 45, 32, 1, 0F,-15F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -15F, 0F, 0F, -15F, -20F, 0F, -10F, -18F, 0F, -10F, -18F, 0F, -15F, -20F, 0F); // Import ImportBox437
		bodyModel[72].setRotationPoint(-33F, -18F, 31F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 45, 32, 1, 0F,-10F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -10F, 0F, 0F, -10F, -18F, 0F, -15F, -20F, 0F, -15F, -20F, 0F, -10F, -18F, 0F); // Import ImportBox438
		bodyModel[73].setRotationPoint(-8F, -18F, 31F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 45, 32, 1, 0F,-15F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -15F, 0F, 0F, -15F, -20F, 0F, -10F, -18F, 0F, -10F, -18F, 0F, -15F, -20F, 0F); // Import ImportBox439
		bodyModel[74].setRotationPoint(7F, -18F, 31F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 41, 32, 1, 0F,-10F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -10F, 0F, 0F, -10F, -18F, 0F, -15F, -20F, 0F, -15F, -20F, 0F, -10F, -18F, 0F); // Import ImportBox440
		bodyModel[75].setRotationPoint(32F, -18F, 31F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 39, 32, 1, 0F,-10F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -10F, 0F, 0F, -10F, -20F, 0F, -15F, -27F, 0F, -15F, -27F, 0F, -10F, -20F, 0F); // Import ImportBox441
		bodyModel[76].setRotationPoint(48F, -18F, 31F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox426
		bodyModel[77].setRotationPoint(72F, -16F, 20F);

		bodyModel[78].addBox(0F, 0F, 0F, 15, 5, 1, 0F); // Import ImportBox427
		bodyModel[78].setRotationPoint(57F, -18F, 20F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 2F, -2F, 0F); // Import ImportBox428
		bodyModel[79].setRotationPoint(-66F, -19F, -32F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox429
		bodyModel[80].setRotationPoint(72F, -19F, -32F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox430
		bodyModel[81].setRotationPoint(72F, -19F, 20F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 39, 32, 1, 0F,-10F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -10F, 0F, 0F, -10F, -20F, 0F, -15F, -27F, 0F, -15F, -27F, 0F, -10F, -20F, 0F); // Import ImportBox414
		bodyModel[82].setRotationPoint(48F, -18F, -32F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 41, 32, 1, 0F,-10F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -10F, 0F, 0F, -10F, -18F, 0F, -15F, -20F, 0F, -15F, -20F, 0F, -10F, -18F, 0F); // Import ImportBox415
		bodyModel[83].setRotationPoint(32F, -18F, -32F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 45, 32, 1, 0F,-15F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -15F, 0F, 0F, -15F, -20F, 0F, -10F, -18F, 0F, -10F, -18F, 0F, -15F, -20F, 0F); // Import ImportBox416
		bodyModel[84].setRotationPoint(7F, -18F, -32F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 45, 32, 1, 0F,-10F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -10F, 0F, 0F, -10F, -18F, 0F, -15F, -20F, 0F, -15F, -20F, 0F, -10F, -18F, 0F); // Import ImportBox417
		bodyModel[85].setRotationPoint(-8F, -18F, -32F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 45, 32, 1, 0F,-15F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -15F, 0F, 0F, -15F, -20F, 0F, -10F, -18F, 0F, -10F, -18F, 0F, -15F, -20F, 0F); // Import ImportBox418
		bodyModel[86].setRotationPoint(-33F, -18F, -32F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 45, 32, 1, 0F,-10F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -10F, 0F, 0F, -10F, -18F, 0F, -15F, -20F, 0F, -15F, -20F, 0F, -10F, -18F, 0F); // Import ImportBox419
		bodyModel[87].setRotationPoint(-48F, -18F, -32F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 40, 32, 1, 0F,-15F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -15F, 0F, 0F, -15F, -19F, 0F, -10F, -18F, 0F, -10F, -18F, 0F, -15F, -19F, 0F); // Import ImportBox420
		bodyModel[88].setRotationPoint(-68F, -18F, -32F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 36, 32, 1, 0F,-15F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -15F, 0F, 0F, -11F, -27F, 0F, -10F, -19F, 0F, -10F, -19F, 0F, -11F, -27F, 0F); // Import ImportBox421
		bodyModel[89].setRotationPoint(-79F, -18F, -32F);

		bodyModel[90].addShapeBox(-9F, -8F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox432
		bodyModel[90].setRotationPoint(75F, -1F, -18F);

		bodyModel[91].addShapeBox(-5F, -6F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox433
		bodyModel[91].setRotationPoint(55F, 5F, -18F);

		bodyModel[92].addShapeBox(-5F, -6F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox434
		bodyModel[92].setRotationPoint(36F, 5F, -18F);

		bodyModel[93].addShapeBox(-5F, -6F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox435
		bodyModel[93].setRotationPoint(14F, 5F, -18F);

		bodyModel[94].addShapeBox(-5F, -6F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox436
		bodyModel[94].setRotationPoint(-7F, 5F, -18F);

		bodyModel[95].addShapeBox(-5F, -6F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox437
		bodyModel[95].setRotationPoint(-27F, 5F, -18F);

		bodyModel[96].addShapeBox(-5F, -6F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox438
		bodyModel[96].setRotationPoint(-44F, 5F, -18F);

		bodyModel[97].addShapeBox(-5F, -6F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox439
		bodyModel[97].setRotationPoint(-44F, 5F, 19F);

		bodyModel[98].addShapeBox(-5F, -6F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox440
		bodyModel[98].setRotationPoint(-27F, 5F, 19F);

		bodyModel[99].addShapeBox(-5F, -6F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox441
		bodyModel[99].setRotationPoint(-7F, 5F, 19F);

		bodyModel[100].addShapeBox(-5F, -6F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox442
		bodyModel[100].setRotationPoint(14F, 5F, 19F);

		bodyModel[101].addShapeBox(-5F, -6F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox443
		bodyModel[101].setRotationPoint(36F, 5F, 19F);

		bodyModel[102].addShapeBox(-5F, -6F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox444
		bodyModel[102].setRotationPoint(55F, 5F, 19F);

		bodyModel[103].addShapeBox(-2F, -6F, 2F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox445
		bodyModel[103].setRotationPoint(68F, -3F, 19F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox449
		bodyModel[104].setRotationPoint(69F, -8F, -21F);
		bodyModel[104].rotateAngleZ = -1.78023584F;

		bodyModel[105].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox450
		bodyModel[105].setRotationPoint(69F, -8F, 20F);
		bodyModel[105].rotateAngleZ = -1.78023584F;

		bodyModel[106].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox451
		bodyModel[106].setRotationPoint(53F, 0F, 20F);
		bodyModel[106].rotateAngleZ = -1.8675023F;

		bodyModel[107].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox452
		bodyModel[107].setRotationPoint(34F, 0F, 20F);
		bodyModel[107].rotateAngleZ = -1.8675023F;

		bodyModel[108].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox454
		bodyModel[108].setRotationPoint(12F, 0F, 20F);
		bodyModel[108].rotateAngleZ = -1.8675023F;

		bodyModel[109].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox455
		bodyModel[109].setRotationPoint(-9F, 0F, 20F);
		bodyModel[109].rotateAngleZ = -1.8675023F;

		bodyModel[110].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox456
		bodyModel[110].setRotationPoint(-29F, 0F, 20F);
		bodyModel[110].rotateAngleZ = -1.8675023F;

		bodyModel[111].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox457
		bodyModel[111].setRotationPoint(-46F, 0F, 20F);
		bodyModel[111].rotateAngleZ = -1.8675023F;

		bodyModel[112].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox458
		bodyModel[112].setRotationPoint(12F, 0F, -21F);
		bodyModel[112].rotateAngleZ = -1.8675023F;

		bodyModel[113].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox459
		bodyModel[113].setRotationPoint(-46F, 0F, -21F);
		bodyModel[113].rotateAngleZ = -1.8675023F;

		bodyModel[114].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox460
		bodyModel[114].setRotationPoint(-29F, 0F, -21F);
		bodyModel[114].rotateAngleZ = -1.8675023F;

		bodyModel[115].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox461
		bodyModel[115].setRotationPoint(-9F, 0F, -21F);
		bodyModel[115].rotateAngleZ = -1.8675023F;

		bodyModel[116].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox462
		bodyModel[116].setRotationPoint(34F, 0F, -21F);
		bodyModel[116].rotateAngleZ = -1.8675023F;

		bodyModel[117].addBox(0F, 0F, 0F, 2, 8, 1, 0F); // Import ImportBox463
		bodyModel[117].setRotationPoint(53F, 0F, -21F);
		bodyModel[117].rotateAngleZ = -1.8675023F;

		bodyModel[118].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Import ImportBox646
		bodyModel[118].setRotationPoint(43F, -24F, 16F);

		bodyModel[119].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Import ImportBox647
		bodyModel[119].setRotationPoint(43F, -24F, 10F);

		bodyModel[120].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Import ImportBox648
		bodyModel[120].setRotationPoint(43F, -24F, 4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Import ImportBox649
		bodyModel[121].setRotationPoint(73F, -19F, 20F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox650
		bodyModel[122].setRotationPoint(72F, -16F, 31F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox651
		bodyModel[123].setRotationPoint(72F, -14F, 31F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import ImportBox652
		bodyModel[124].setRotationPoint(77F, -16F, 20F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox653
		bodyModel[125].setRotationPoint(72F, -14F, 20F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -6F, -2F); // Import ImportBox657
		bodyModel[126].setRotationPoint(75F, -9F, -30F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, -2F, 7F, -4F, 0F, -7F, -3F, 0F, -7F, -3F, -2F, 7F, -4F, -2F); // Import ImportBox658
		bodyModel[127].setRotationPoint(75F, -5F, -30F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,-1F, 4F, 0F, 1F, 3F, 0F, 1F, 3F, -2F, -1F, 4F, -2F, 10F, -9F, 0F, -11F, -8F, 0F, -11F, -8F, -2F, 10F, -9F, -2F); // Import ImportBox659
		bodyModel[128].setRotationPoint(67F, 6F, -30F);

		bodyModel[129].addShapeBox(-133F, 0F, -1.9F, 150, 150, 1, 0F,-134F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -134F, 0F, 0F, -134F, -134F, 0F, 0F, -134F, 0F, 0F, -134F, 0F, -134F, -134F, 0F); // Import ImportBox663
		bodyModel[129].setRotationPoint(41F, -20F, 33F);

		bodyModel[130].addShapeBox(0F, 0F, 1.1F, 150, 150, 1, 0F,0F, 0F, 0F, -134F, 0F, 0F, -134F, 0F, 0F, 0F, 0F, 0F, 0F, -134F, 0F, -134F, -134F, 0F, -134F, -134F, 0F, 0F, -134F, 0F); // Import ImportBox664
		bodyModel[130].setRotationPoint(58F, -20F, -30F);
		bodyModel[130].rotateAngleY = -3.14159265F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		bodyModel[131].setRotationPoint(-70F, -24F, 23F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 710
		bodyModel[132].setRotationPoint(-68F, -24F, -27F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F); // Box 711
		bodyModel[133].setRotationPoint(-68F, -24F, -27F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 712
		bodyModel[134].setRotationPoint(-68F, -24F, -27F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 715
		bodyModel[135].setRotationPoint(-68F, -21F, -27F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F); // Box 716
		bodyModel[136].setRotationPoint(-68F, -21F, -27F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 717
		bodyModel[137].setRotationPoint(-68F, -21F, -27F);

		bodyModel[138].addShapeBox(0F, 0F, -0.25F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		bodyModel[138].setRotationPoint(-68F, -22F, -28F);

		bodyModel[139].addShapeBox(0F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		bodyModel[139].setRotationPoint(-68F, -22F, -25F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.75F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 720
		bodyModel[140].setRotationPoint(-67F, -22F, -26F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F, 0.75F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 721
		bodyModel[141].setRotationPoint(-67F, -23F, -26F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.75F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.75F, -0.25F, -0.5F); // Box 722
		bodyModel[142].setRotationPoint(-67F, -21F, -26F);

		bodyModel[143].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.875F, 1.25F, -0.75F, -0.875F, 1.25F, -0.75F, -0.875F, 0.25F, -0.75F, -0.875F, 0.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F); // Box 723
		bodyModel[143].setRotationPoint(-68F, -22F, -26F);

		bodyModel[144].addShapeBox(-0.25F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.875F, 1.25F, -0.75F, -0.875F, 1.25F, -0.75F, -0.875F, 0.25F, -0.75F, -0.875F, 0.25F); // Box 724
		bodyModel[144].setRotationPoint(-68F, -22F, -26F);

		bodyModel[145].addShapeBox(-0.25F, 0.6F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.875F, 1.25F, -0.75F, -0.875F, 1.25F, -0.75F, -0.875F, 0.25F, -0.75F, -0.875F, 0.25F); // Box 725
		bodyModel[145].setRotationPoint(-68F, -22F, -26F);

		bodyModel[146].addShapeBox(-0.25F, 1.3F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.875F, 1.25F, -0.75F, -0.875F, 1.25F, -0.75F, -0.875F, 0.25F, -0.75F, -0.875F, 0.25F); // Box 726
		bodyModel[146].setRotationPoint(-68F, -23F, -26F);

		bodyModel[147].addShapeBox(-0.25F, -0.4F, 0F, 1, 1, 1, 0F,-0.75F, -0.875F, 0.75F, -0.75F, -0.875F, 0.75F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 727
		bodyModel[147].setRotationPoint(-68F, -21F, -26F);

		bodyModel[148].addShapeBox(-0.25F, -0.7F, 0F, 1, 1, 1, 0F,-0.75F, -0.875F, 1F, -0.75F, -0.875F, 1F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 728
		bodyModel[148].setRotationPoint(-68F, -21F, -26F);

		bodyModel[149].addShapeBox(-0.25F, -1.2F, 0F, 1, 1, 1, 0F,-0.75F, -0.875F, 1F, -0.75F, -0.875F, 1F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 729
		bodyModel[149].setRotationPoint(-68F, -22F, -26F);

		bodyModel[150].addShapeBox(-0.25F, -0.45F, 0F, 1, 1, 1, 0F,-0.75F, -0.875F, 0.75F, -0.75F, -0.875F, 0.75F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 730
		bodyModel[150].setRotationPoint(-68F, -23F, -26F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 710
		bodyModel[151].setRotationPoint(-68F, -24F, -21F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F); // Box 711
		bodyModel[152].setRotationPoint(-68F, -24F, -21F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 712
		bodyModel[153].setRotationPoint(-68F, -24F, -21F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 715
		bodyModel[154].setRotationPoint(-68F, -21F, -21F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F); // Box 716
		bodyModel[155].setRotationPoint(-68F, -21F, -21F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 717
		bodyModel[156].setRotationPoint(-68F, -21F, -21F);

		bodyModel[157].addShapeBox(0F, 0F, -0.25F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		bodyModel[157].setRotationPoint(-68F, -22F, -22F);

		bodyModel[158].addShapeBox(0F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		bodyModel[158].setRotationPoint(-68F, -22F, -19F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 739
		bodyModel[159].setRotationPoint(-67F, -23F, -20F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 740
		bodyModel[160].setRotationPoint(-67F, -22F, -20F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Box 741
		bodyModel[161].setRotationPoint(-67F, -21F, -20F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 742
		bodyModel[162].setRotationPoint(-67F, -23F, 20F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 743
		bodyModel[163].setRotationPoint(-67F, -22F, 20F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F); // Box 744
		bodyModel[164].setRotationPoint(-67F, -21F, 20F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 745
		bodyModel[165].setRotationPoint(-68F, -24F, 19F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 746
		bodyModel[166].setRotationPoint(-68F, -24F, 19F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F); // Box 747
		bodyModel[167].setRotationPoint(-68F, -24F, 19F);

		bodyModel[168].addShapeBox(0F, 0F, -0.25F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[168].setRotationPoint(-68F, -22F, 18F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F); // Box 749
		bodyModel[169].setRotationPoint(-68F, -21F, 19F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 750
		bodyModel[170].setRotationPoint(-68F, -21F, 19F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 751
		bodyModel[171].setRotationPoint(-68F, -21F, 19F);

		bodyModel[172].addShapeBox(0F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		bodyModel[172].setRotationPoint(-68F, -22F, 21F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.625F, 0F, -0.5F, -0.625F, 0.25F, -0.5F, -0.625F, 0.25F, -0.25F, -0.625F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 753
		bodyModel[173].setRotationPoint(-68F, -21.75F, -20.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.625F, 0F, -0.5F, -0.625F, 0.25F, -0.5F, -0.625F, 0.25F, -0.25F, -0.625F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 754
		bodyModel[174].setRotationPoint(-68F, -22.75F, -20.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.625F, 0F, -0.5F, -0.625F, 0.25F, -0.5F, -0.625F, 0.25F, -0.25F, -0.625F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 755
		bodyModel[175].setRotationPoint(-68F, -22.75F, 19.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.625F, 0F, -0.5F, -0.625F, 0.25F, -0.5F, -0.625F, 0.25F, -0.25F, -0.625F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 756
		bodyModel[176].setRotationPoint(-68F, -21.75F, 19.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 760
		bodyModel[177].setRotationPoint(-68F, -22F, 10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F); // Box 762
		bodyModel[178].setRotationPoint(-69F, -22F, 10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F); // Box 763
		bodyModel[179].setRotationPoint(-67F, -22F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 759
		bodyModel[180].setRotationPoint(-68F, -23F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 760
		bodyModel[181].setRotationPoint(-68F, -23F, 13F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.75F, 0F, -0.75F, 1.75F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 762
		bodyModel[182].setRotationPoint(-68F, -22.75F, 12F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 763
		bodyModel[183].setRotationPoint(-68F, -22F, 4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 764
		bodyModel[184].setRotationPoint(-68F, -23F, 7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1.75F, 0F, -0.75F, 1.75F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Box 765
		bodyModel[185].setRotationPoint(-68F, -22.75F, 6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 766
		bodyModel[186].setRotationPoint(-68F, -23F, 4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F); // Box 767
		bodyModel[187].setRotationPoint(-69F, -22F, 4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F); // Box 768
		bodyModel[188].setRotationPoint(-67F, -22F, 4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.9F, 0F, -1.75F, -0.9F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 765
		bodyModel[189].setRotationPoint(-69.91F, -21F, 11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.9F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.9F, 0F, -1.75F); // Box 766
		bodyModel[190].setRotationPoint(-69.91F, -21F, 11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.9F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.9F, 0F, -1.75F); // Box 767
		bodyModel[191].setRotationPoint(-69.91F, -21F, 5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.9F, 0F, -1.75F, -0.9F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 768
		bodyModel[192].setRotationPoint(-69.91F, -21F, 5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -6F, -2F); // Box 769
		bodyModel[193].setRotationPoint(75F, -9F, 21F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,0F, 0F, 0F, -10F, -4F, 0F, -10F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -11F, 3F, 0F, -11F, 3F, -2F, 0F, 0F, -2F); // Box 770
		bodyModel[194].setRotationPoint(75F, -13F, 21F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 1, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 0F, -2F); // Box 771
		bodyModel[195].setRotationPoint(67F, -16F, 21F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 127, 1, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, -2F); // Box 772
		bodyModel[196].setRotationPoint(-60F, -18F, 21F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, -2F, 7F, -4F, 0F, -7F, -3F, 0F, -7F, -3F, -2F, 7F, -4F, -2F); // Box 773
		bodyModel[197].setRotationPoint(75F, -5F, 21F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,-1F, 4F, 0F, 1F, 3F, 0F, 1F, 3F, -2F, -1F, 4F, -2F, 10F, -9F, 0F, -11F, -8F, 0F, -11F, -8F, -2F, 10F, -9F, -2F); // Box 774
		bodyModel[198].setRotationPoint(67F, 6F, 21F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 110, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 775
		bodyModel[199].setRotationPoint(-53F, 8F, 21F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -9F, -3F, 0F, 8F, -4F, 0F, 8F, -4F, -2F, -9F, -3F, -2F); // Box 776
		bodyModel[200].setRotationPoint(-62F, 1F, 21F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, -2F, 0F, 4F, -2F, 0F, 4F, -2F, -2F, -4F, -2F, -2F); // Box 777
		bodyModel[201].setRotationPoint(-66F, -8F, 21F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, -7F, -2F); // Box 778
		bodyModel[202].setRotationPoint(-66F, -12F, 21F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,0F, -1F, 0F, -5F, 5F, 0F, -5F, 5F, -2F, 0F, -1F, -2F, -1F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, -2F, -1F, 0F, -2F); // Box 779
		bodyModel[203].setRotationPoint(-66F, -13F, 21F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 634, 590, textureX, textureY); // Import ImportBox665
		turretModel[1] = new ModelRendererTurbo(this, 634, 590, textureX, textureY); // Import ImportBox666
		turretModel[2] = new ModelRendererTurbo(this, 270, 1548, textureX, textureY); // Import ImportBox11
		turretModel[3] = new ModelRendererTurbo(this, 196, 1588, textureX, textureY); // Import ImportBox12
		turretModel[4] = new ModelRendererTurbo(this, 144, 1644, textureX, textureY); // Import ImportBox13
		turretModel[5] = new ModelRendererTurbo(this, 452, 1610, textureX, textureY); // Import ImportBox14
		turretModel[6] = new ModelRendererTurbo(this, 156, 1805, textureX, textureY); // Import ImportBox15
		turretModel[7] = new ModelRendererTurbo(this, 252, 1505, textureX, textureY); // Import ImportBox16
		turretModel[8] = new ModelRendererTurbo(this, 60, 1596, textureX, textureY); // Import ImportBox17
		turretModel[9] = new ModelRendererTurbo(this, 78, 1902, textureX, textureY); // Import ImportBox18
		turretModel[10] = new ModelRendererTurbo(this, 160, 1946, textureX, textureY); // Import ImportBox19
		turretModel[11] = new ModelRendererTurbo(this, 228, 1966, textureX, textureY); // Import ImportBox21
		turretModel[12] = new ModelRendererTurbo(this, 414, 1736, textureX, textureY); // Import ImportBox22
		turretModel[13] = new ModelRendererTurbo(this, 304, 1704, textureX, textureY); // Import ImportBox23
		turretModel[14] = new ModelRendererTurbo(this, 196, 1914, textureX, textureY); // Import ImportBox24
		turretModel[15] = new ModelRendererTurbo(this, 406, 1559, textureX, textureY); // Import ImportBox25
		turretModel[16] = new ModelRendererTurbo(this, 243, 1992, textureX, textureY); // Import ImportBox309
		turretModel[17] = new ModelRendererTurbo(this, 390, 1928, textureX, textureY); // Import ImportBox310
		turretModel[18] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox312
		turretModel[19] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox313
		turretModel[20] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox314
		turretModel[21] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox315
		turretModel[22] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox316
		turretModel[23] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox317
		turretModel[24] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox318
		turretModel[25] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox319
		turretModel[26] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox320
		turretModel[27] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox321
		turretModel[28] = new ModelRendererTurbo(this, 141, 1250, textureX, textureY); // Import ImportBox322
		turretModel[29] = new ModelRendererTurbo(this, 141, 1250, textureX, textureY); // Import ImportBox323
		turretModel[30] = new ModelRendererTurbo(this, 141, 1250, textureX, textureY); // Import ImportBox324
		turretModel[31] = new ModelRendererTurbo(this, 141, 1250, textureX, textureY); // Import ImportBox325
		turretModel[32] = new ModelRendererTurbo(this, 141, 1250, textureX, textureY); // Import ImportBox326
		turretModel[33] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox327
		turretModel[34] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox328
		turretModel[35] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox329
		turretModel[36] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox330
		turretModel[37] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox331
		turretModel[38] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox332
		turretModel[39] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox333
		turretModel[40] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox334
		turretModel[41] = new ModelRendererTurbo(this, 214, 1234, textureX, textureY); // Import ImportBox335
		turretModel[42] = new ModelRendererTurbo(this, 181, 1214, textureX, textureY); // Import ImportBox336
		turretModel[43] = new ModelRendererTurbo(this, 254, 1230, textureX, textureY); // Import ImportBox337
		turretModel[44] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox338
		turretModel[45] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox339
		turretModel[46] = new ModelRendererTurbo(this, 94, 1230, textureX, textureY); // Import ImportBox340
		turretModel[47] = new ModelRendererTurbo(this, 314, 1786, textureX, textureY); // Import ImportBox353
		turretModel[48] = new ModelRendererTurbo(this, 488, 1459, textureX, textureY); // Import ImportBox354
		turretModel[49] = new ModelRendererTurbo(this, 243, 1443, textureX, textureY); // Import ImportBox355
		turretModel[50] = new ModelRendererTurbo(this, 239, 1428, textureX, textureY); // Import ImportBox356
		turretModel[51] = new ModelRendererTurbo(this, 238, 1452, textureX, textureY); // Import ImportBox358
		turretModel[52] = new ModelRendererTurbo(this, 197, 1288, textureX, textureY); // Import ImportBox360
		turretModel[53] = new ModelRendererTurbo(this, 273, 1428, textureX, textureY); // Import ImportBox361
		turretModel[54] = new ModelRendererTurbo(this, 403, 1440, textureX, textureY); // Import ImportBox362
		turretModel[55] = new ModelRendererTurbo(this, 321, 1420, textureX, textureY); // Import ImportBox363
		turretModel[56] = new ModelRendererTurbo(this, 478, 1460, textureX, textureY); // Import ImportBox354
		turretModel[57] = new ModelRendererTurbo(this, 204, 1433, textureX, textureY); // Import ImportBox355
		turretModel[58] = new ModelRendererTurbo(this, 236, 1430, textureX, textureY); // Import ImportBox356
		turretModel[59] = new ModelRendererTurbo(this, 252, 1436, textureX, textureY); // Import ImportBox358
		turretModel[60] = new ModelRendererTurbo(this, 257, 1306, textureX, textureY); // Import ImportBox360
		turretModel[61] = new ModelRendererTurbo(this, 369, 1426, textureX, textureY); // Import ImportBox361
		turretModel[62] = new ModelRendererTurbo(this, 217, 1458, textureX, textureY); // Import ImportBox362
		turretModel[63] = new ModelRendererTurbo(this, 395, 1418, textureX, textureY); // Import ImportBox363
		turretModel[64] = new ModelRendererTurbo(this, 440, 1432, textureX, textureY); // Import ImportBox372
		turretModel[65] = new ModelRendererTurbo(this, 470, 1438, textureX, textureY); // Import ImportBox361
		turretModel[66] = new ModelRendererTurbo(this, 408, 1444, textureX, textureY); // Import ImportBox362
		turretModel[67] = new ModelRendererTurbo(this, 418, 1420, textureX, textureY); // Import ImportBox363
		turretModel[68] = new ModelRendererTurbo(this, 472, 1430, textureX, textureY); // Import ImportBox364
		turretModel[69] = new ModelRendererTurbo(this, 330, 1434, textureX, textureY); // Import ImportBox366
		turretModel[70] = new ModelRendererTurbo(this, 480, 1479, textureX, textureY); // Import ImportBox367
		turretModel[71] = new ModelRendererTurbo(this, 290, 1436, textureX, textureY); // Import ImportBox368
		turretModel[72] = new ModelRendererTurbo(this, 347, 1441, textureX, textureY); // Import ImportBox369
		turretModel[73] = new ModelRendererTurbo(this, 370, 1426, textureX, textureY); // Import ImportBox370
		turretModel[74] = new ModelRendererTurbo(this, 268, 1420, textureX, textureY); // Import ImportBox355
		turretModel[75] = new ModelRendererTurbo(this, 334, 1422, textureX, textureY); // Import ImportBox356
		turretModel[76] = new ModelRendererTurbo(this, 385, 1413, textureX, textureY); // Import ImportBox358
		turretModel[77] = new ModelRendererTurbo(this, 283, 1287, textureX, textureY); // Import ImportBox360
		turretModel[78] = new ModelRendererTurbo(this, 236, 1426, textureX, textureY); // Import ImportBox362
		turretModel[79] = new ModelRendererTurbo(this, 310, 1418, textureX, textureY); // Import ImportBox379
		turretModel[80] = new ModelRendererTurbo(this, 446, 1422, textureX, textureY); // Import ImportBox380
		turretModel[81] = new ModelRendererTurbo(this, 206, 1480, textureX, textureY); // Import ImportBox381
		turretModel[82] = new ModelRendererTurbo(this, 484, 1421, textureX, textureY); // Import ImportBox382
		turretModel[83] = new ModelRendererTurbo(this, 338, 1430, textureX, textureY); // Import ImportBox383
		turretModel[84] = new ModelRendererTurbo(this, 234, 1430, textureX, textureY); // Import ImportBox384
		turretModel[85] = new ModelRendererTurbo(this, 284, 1430, textureX, textureY); // Import ImportBox385
		turretModel[86] = new ModelRendererTurbo(this, 246, 1466, textureX, textureY); // Import ImportBox386
		turretModel[87] = new ModelRendererTurbo(this, 404, 1434, textureX, textureY); // Import ImportBox387
		turretModel[88] = new ModelRendererTurbo(this, 60, 1617, textureX, textureY); // Import ImportBox388
		turretModel[89] = new ModelRendererTurbo(this, 252, 1505, textureX, textureY); // Box 769
		turretModel[90] = new ModelRendererTurbo(this, 270, 1548, textureX, textureY); // Box 770

		turretModel[0].addShapeBox(-550F, 0F, -0.1F, 550, 550, 1, 0F,-540F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -540F, 0F, 0F, -540F, -540F, 0F, 0F, -540F, 0F, 0F, -540F, 0F, -540F, -540F, 0F); // Import ImportBox665
		turretModel[0].setRotationPoint(-10F, -42F, 24F);
		turretModel[0].rotateAngleY = -3.14159265F;

		turretModel[1].addShapeBox(-540F, 0F, 0.9F, 550, 550, 1, 0F,-540F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -540F, 0F, 0F, -540F, -540F, 0F, 0F, -540F, 0F, 0F, -540F, 0F, -540F, -540F, 0F); // Import ImportBox666
		turretModel[1].setRotationPoint(-10F, -42F, -25F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 16, 32, 30, 0F,4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -25F, 4F, -2F, -25F, 4F, -24F, 0F, -10F, -24F, 0F, -10F, -24F, -25F, 4F, -24F, -25F); // Import ImportBox11
		turretModel[2].setRotationPoint(34F, -32F, -15F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 16, 32, 9, 0F,4F, -2F, 0F, 0F, -2F, 0F, -14F, -2F, 0F, 4F, -2F, 0F, 4F, -24F, 0F, -10F, -24F, 0F, -18F, -24F, 0F, 4F, -24F, 0F); // Import ImportBox12
		turretModel[3].setRotationPoint(34F, -32F, 15F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 16, 32, 9, 0F,4F, -2F, 0F, -14F, -2F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, 4F, -24F, 0F, -18F, -24F, 0F, -10F, -24F, 0F, 4F, -24F, 0F); // Import ImportBox13
		turretModel[4].setRotationPoint(34F, -32F, -24F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 16, 32, 9, 0F,4F, 0F, 0F, -10F, 0F, 0F, -18F, 0F, 0F, 4F, 0F, 0F, 4F, -26F, 0F, 0F, -26F, 0F, -14F, -26F, 0F, 4F, -26F, 0F); // Import ImportBox14
		turretModel[5].setRotationPoint(34F, -36F, 15F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 16, 32, 9, 0F,4F, 0F, 0F, -18F, 0F, 0F, -10F, 0F, 0F, 4F, 0F, 0F, 4F, -26F, 0F, -14F, -26F, 0F, 0F, -26F, 0F, 4F, -26F, 0F); // Import ImportBox15
		turretModel[6].setRotationPoint(34F, -36F, -24F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 16, 32, 30, 0F,4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -25F, 4F, 0F, -25F, 4F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, -25F, 4F, -26F, -25F); // Import ImportBox16
		turretModel[7].setRotationPoint(34F, -36F, -15F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 30, 32, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F); // Import ImportBox17
		turretModel[8].setRotationPoint(0F, -30F, -24F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 30, 32, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F); // Import ImportBox18
		turretModel[9].setRotationPoint(0F, -36F, -24F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 40, 32, 30, 0F,0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F); // Import ImportBox19
		turretModel[10].setRotationPoint(0F, -42F, -15F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 40, 32, 9, 0F,0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, -8F, -26F, 0F, 0F, -26F, 0F); // Import ImportBox21
		turretModel[11].setRotationPoint(0F, -42F, 15F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 40, 32, 9, 0F,0F, 0F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, -8F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F); // Import ImportBox22
		turretModel[12].setRotationPoint(0F, -42F, -24F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 36, 32, 48, 0F,-4F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F); // Import ImportBox23
		turretModel[13].setRotationPoint(-36F, -40F, -24F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 36, 32, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -27F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, -4F, -27F, 0F); // Import ImportBox24
		turretModel[14].setRotationPoint(-36F, -32F, -24F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 48, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		turretModel[15].setRotationPoint(-2F, -27F, -24F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 7, 32, 1, 0F,5F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 3F, 5F, 1F, 3F, 5F, -23F, 0F, 0F, -23F, 0F, 0F, -25F, 4F, 5F, -25F, 4F); // Import ImportBox309
		turretModel[16].setRotationPoint(23F, -34F, 24F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 7, 32, 1, 0F,5F, 5F, 0F, 0F, 5F, 0F, 0F, 3F, 3F, 5F, 3F, 3F, 5F, -23F, 0F, 0F, -23F, 0F, 0F, -25F, 4F, 5F, -25F, 4F); // Import ImportBox310
		turretModel[17].setRotationPoint(9F, -34F, 24F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox312
		turretModel[18].setRotationPoint(3F, -26F, -29F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox313
		turretModel[19].setRotationPoint(27F, -26F, -29F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox314
		turretModel[20].setRotationPoint(9F, -26F, -29F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox315
		turretModel[21].setRotationPoint(15F, -26F, -29F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox316
		turretModel[22].setRotationPoint(21F, -26F, -29F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox317
		turretModel[23].setRotationPoint(3F, -35F, -29F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox318
		turretModel[24].setRotationPoint(9F, -35F, -29F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox319
		turretModel[25].setRotationPoint(15F, -35F, -29F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox320
		turretModel[26].setRotationPoint(21F, -35F, -29F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox321
		turretModel[27].setRotationPoint(27F, -35F, -29F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox322
		turretModel[28].setRotationPoint(1F, -36F, -29F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox323
		turretModel[29].setRotationPoint(4F, -33F, -29F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox324
		turretModel[30].setRotationPoint(10F, -33F, -29F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox325
		turretModel[31].setRotationPoint(16F, -33F, -29F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox326
		turretModel[32].setRotationPoint(22F, -33F, -29F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox327
		turretModel[33].setRotationPoint(22F, -30F, -29F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox328
		turretModel[34].setRotationPoint(16F, -30F, -29F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox329
		turretModel[35].setRotationPoint(10F, -30F, -29F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox330
		turretModel[36].setRotationPoint(4F, -30F, -29F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox331
		turretModel[37].setRotationPoint(1F, -33F, -29F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox332
		turretModel[38].setRotationPoint(1F, -30F, -29F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox333
		turretModel[39].setRotationPoint(28F, -30F, -29F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox334
		turretModel[40].setRotationPoint(28F, -33F, -29F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox335
		turretModel[41].setRotationPoint(29F, -33F, -28F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox336
		turretModel[42].setRotationPoint(29F, -30F, -28F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox337
		turretModel[43].setRotationPoint(29F, -36F, -28F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox338
		turretModel[44].setRotationPoint(1F, -36F, -28F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox339
		turretModel[45].setRotationPoint(1F, -33F, -28F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox340
		turretModel[46].setRotationPoint(1F, -30F, -28F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 40, 32, 6, 0F,-4F, -2F, 0F, -36F, 0F, 0F, -36F, 0F, 0F, -4F, -2F, 0F, -38F, -25F, 0F, -6F, -27F, 0F, -6F, -27F, 0F, -38F, -25F, 0F); // Import ImportBox353
		turretModel[47].setRotationPoint(0F, -43F, -16F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox354
		turretModel[48].setRotationPoint(30F, -39F, -15F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox355
		turretModel[49].setRotationPoint(30F, -42F, -14F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox356
		turretModel[50].setRotationPoint(31F, -42F, -15F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox358
		turretModel[51].setRotationPoint(31F, -42F, -14F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox360
		turretModel[52].setRotationPoint(31F, -41F, -14F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox361
		turretModel[53].setRotationPoint(31F, -42F, -12F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox362
		turretModel[54].setRotationPoint(30F, -42F, -15F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox363
		turretModel[55].setRotationPoint(30F, -42F, -12F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox354
		turretModel[56].setRotationPoint(9F, -42F, -15F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox355
		turretModel[57].setRotationPoint(9F, -47F, -14F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox356
		turretModel[58].setRotationPoint(10F, -47F, -15F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox358
		turretModel[59].setRotationPoint(10F, -47F, -14F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox360
		turretModel[60].setRotationPoint(10F, -46F, -14F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox361
		turretModel[61].setRotationPoint(10F, -47F, -12F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox362
		turretModel[62].setRotationPoint(9F, -47F, -15F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox363
		turretModel[63].setRotationPoint(9F, -47F, -12F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 10, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox372
		turretModel[64].setRotationPoint(-6F, -45F, -19F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportBox361
		turretModel[65].setRotationPoint(4F, -45F, -19F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox362
		turretModel[66].setRotationPoint(-9F, -45F, -19F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox363
		turretModel[67].setRotationPoint(-6F, -45F, -21F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox364
		turretModel[68].setRotationPoint(-6F, -45F, -7F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import ImportBox366
		turretModel[69].setRotationPoint(1F, -43F, 8F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox367
		turretModel[70].setRotationPoint(-8F, -43F, 17F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox368
		turretModel[71].setRotationPoint(-8F, -43F, 8F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox369
		turretModel[72].setRotationPoint(-8F, -43F, 6F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox370
		turretModel[73].setRotationPoint(-10F, -43F, 8F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox355
		turretModel[74].setRotationPoint(-20F, -47F, -2F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox356
		turretModel[75].setRotationPoint(-19F, -47F, -3F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox358
		turretModel[76].setRotationPoint(-19F, -47F, -2F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox360
		turretModel[77].setRotationPoint(-19F, -46F, -2F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox362
		turretModel[78].setRotationPoint(-20F, -47F, -3F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox379
		turretModel[79].setRotationPoint(-19F, -44F, -3F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Import ImportBox380
		turretModel[80].setRotationPoint(-20F, -44F, -3F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Import ImportBox381
		turretModel[81].setRotationPoint(-20F, -44F, -2F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import ImportBox382
		turretModel[82].setRotationPoint(-19F, -42F, -2F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox383
		turretModel[83].setRotationPoint(-19F, -47F, 1F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox384
		turretModel[84].setRotationPoint(-20F, -47F, 1F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Import ImportBox385
		turretModel[85].setRotationPoint(-20F, -44F, 1F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Import ImportBox386
		turretModel[86].setRotationPoint(-19F, -44F, 1F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox387
		turretModel[87].setRotationPoint(-22F, -45F, -2F);

		turretModel[88].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox388
		turretModel[88].setRotationPoint(14F, -45F, 11F);

		turretModel[89].addShapeBox(0F, 0F, 0F, 16, 32, 30, 0F,4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -25F, 4F, 0F, -25F, 4F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, -25F, 4F, -26F, -25F); // Box 769
		turretModel[89].setRotationPoint(34F, -36F, 10F);

		turretModel[90].addShapeBox(0F, 0F, 0F, 16, 32, 30, 0F,4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -25F, 4F, -2F, -25F, 4F, -24F, 0F, -10F, -24F, 0F, -10F, -24F, -25F, 4F, -24F, -25F); // Box 770
		turretModel[90].setRotationPoint(34F, -32F, 10F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1525, 1208, textureX, textureY); // Import ImportBox365
		barrelModel[1] = new ModelRendererTurbo(this, 354, 1432, textureX, textureY); // Import ImportBox133
		barrelModel[2] = new ModelRendererTurbo(this, 135, 573, textureX, textureY); // Import ImportBox86
		barrelModel[3] = new ModelRendererTurbo(this, 386, 1426, textureX, textureY); // Import ImportBox87
		barrelModel[4] = new ModelRendererTurbo(this, 397, 1519, textureX, textureY); // Import ImportBox88
		barrelModel[5] = new ModelRendererTurbo(this, 180, 1103, textureX, textureY); // Import ImportBox347
		barrelModel[6] = new ModelRendererTurbo(this, 420, 1852, textureX, textureY); // Import ImportBox427
		barrelModel[7] = new ModelRendererTurbo(this, 172, 1179, textureX, textureY); // Import ImportBox654
		barrelModel[8] = new ModelRendererTurbo(this, 412, 1543, textureX, textureY); // Import ImportBox655
		barrelModel[9] = new ModelRendererTurbo(this, 135, 549, textureX, textureY); // Import ImportBox660
		barrelModel[10] = new ModelRendererTurbo(this, 163, 573, textureX, textureY); // Import ImportBox661
		barrelModel[11] = new ModelRendererTurbo(this, 45, 1567, textureX, textureY); // Box 344
		barrelModel[12] = new ModelRendererTurbo(this, 63, 1620, textureX, textureY); // Box 345
		barrelModel[13] = new ModelRendererTurbo(this, 407, 2007, textureX, textureY); // Box 134
		barrelModel[14] = new ModelRendererTurbo(this, 269, 1781, textureX, textureY); // Box 135
		barrelModel[15] = new ModelRendererTurbo(this, 177, 1727, textureX, textureY); // Box 422
		barrelModel[16] = new ModelRendererTurbo(this, 411, 1825, textureX, textureY); // Box 429
		barrelModel[17] = new ModelRendererTurbo(this, 94, 1860, textureX, textureY); // Box 82
		barrelModel[18] = new ModelRendererTurbo(this, 65, 1655, textureX, textureY); // Box 84
		barrelModel[19] = new ModelRendererTurbo(this, 376, 1899, textureX, textureY); // Box 80
		barrelModel[20] = new ModelRendererTurbo(this, 182, 1728, textureX, textureY); // Box 14
		barrelModel[21] = new ModelRendererTurbo(this, 109, 1677, textureX, textureY); // Box 15
		barrelModel[22] = new ModelRendererTurbo(this, 166, 1510, textureX, textureY); // Box 16
		barrelModel[23] = new ModelRendererTurbo(this, 166, 1510, textureX, textureY); // Box 17

		barrelModel[0].addShapeBox(4F, -4F, -8F, 3, 3, 3, 0F,1F, -2F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox365
		barrelModel[0].setRotationPoint(42F, -30F, 0F);

		barrelModel[1].addShapeBox(3F, -2F, -2F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox133
		barrelModel[1].setRotationPoint(42F, -30F, 0F);

		barrelModel[2].addShapeBox(69F, -0.5F, -1F, 23, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox86
		barrelModel[2].setRotationPoint(43F, -30F, 0F);

		barrelModel[3].addShapeBox(69F, 0.5F, -1F, 23, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import ImportBox87
		barrelModel[3].setRotationPoint(43F, -30F, 0F);

		barrelModel[4].addShapeBox(69F, -1.5F, -1F, 23, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Import ImportBox88
		barrelModel[4].setRotationPoint(43F, -30F, 0F);

		barrelModel[5].addBox(3F, -3F, 6F, 8, 1, 1, 0F); // Import ImportBox347
		barrelModel[5].setRotationPoint(42F, -30F, 0F);

		barrelModel[6].addShapeBox(10F, -2F, -2F, 25, 4, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import ImportBox427
		barrelModel[6].setRotationPoint(43F, -30F, 0F);

		barrelModel[7].addShapeBox(11F, -3F, 6F, 8, 1, 1, 0F,0F, 0F, 0F, -6.5F, 0.25F, 0.25F, -6.5F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0.25F, 0.25F, -6.5F, 0.25F, 0.25F, 0F, 0F, 0F); // Import ImportBox654
		barrelModel[7].setRotationPoint(42F, -30F, 0F);

		barrelModel[8].addShapeBox(3F, -3F, 6F, 8, 1, 1, 0F,0F, 0.25F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import ImportBox655
		barrelModel[8].setRotationPoint(42F, -30F, 0F);

		barrelModel[9].addShapeBox(69F, -0.5F, 0.75F, 23, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox660
		barrelModel[9].setRotationPoint(43F, -30F, 0F);

		barrelModel[10].addShapeBox(69F, -0.5F, 0F, 1, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import ImportBox661
		barrelModel[10].setRotationPoint(43F, -30F, 0F);

		barrelModel[11].addShapeBox(0F, -6F, -10F, 8, 32, 20, 0F,3F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 3F, 0F, 0F, 3F, -26F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 3F, -26F, 0F); // Box 344
		barrelModel[11].setRotationPoint(42F, -30F, 0F);

		barrelModel[12].addShapeBox(1F, -2F, -10F, 7, 32, 20, 0F,4F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 4F, -2F, 0F, 4F, -24F, 0F, -10F, -24F, 0F, -10F, -24F, 0F, 4F, -24F, 0F); // Box 345
		barrelModel[12].setRotationPoint(42F, -30F, 0F);

		barrelModel[13].addShapeBox(2F, -4F, -3F, 10, 2, 6, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 134
		barrelModel[13].setRotationPoint(43F, -30F, 0F);

		barrelModel[14].addShapeBox(2F, 2F, -3F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 135
		barrelModel[14].setRotationPoint(43F, -30F, 0F);

		barrelModel[15].addShapeBox(12F, -3.75F, -3F, 23, 2, 6, 0F,0F, -1.25F, -2.75F, 0F, -1.25F, -2.75F, 0F, -1.25F, -2.75F, 0F, -1.25F, -2.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 422
		barrelModel[15].setRotationPoint(43F, -30F, 0F);

		barrelModel[16].addShapeBox(12F, 1.75F, -3F, 23, 2, 6, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -1.25F, -2.75F, 0F, -1.25F, -2.75F, 0F, -1.25F, -2.75F, 0F, -1.25F, -2.75F); // Box 429
		barrelModel[16].setRotationPoint(43F, -30F, 0F);

		barrelModel[17].addShapeBox(35F, 1F, -2F, 34, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 82
		barrelModel[17].setRotationPoint(43F, -30F, 0F);

		barrelModel[18].addShapeBox(35F, -2F, -2F, 34, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		barrelModel[18].setRotationPoint(43F, -30F, 0F);

		barrelModel[19].addShapeBox(35F, -1F, -2F, 34, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		barrelModel[19].setRotationPoint(43F, -30F, 0F);

		barrelModel[20].addShapeBox(12F, -1F, 1.75F, 23, 2, 1, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 14
		barrelModel[20].setRotationPoint(43F, -30F, 0F);

		barrelModel[21].addShapeBox(12F, -1F, -2.75F, 23, 2, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 15
		barrelModel[21].setRotationPoint(43F, -30F, 0F);

		barrelModel[22].addShapeBox(2F, -3F, 2F, 10, 6, 3, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, 0F); // Box 16
		barrelModel[22].setRotationPoint(43F, -30F, 0F);

		barrelModel[23].addShapeBox(2F, -3F, -5F, 10, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 17
		barrelModel[23].setRotationPoint(43F, -30F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 22, 4, textureX, textureY); // Import ImportBox183
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 11, 4, textureX, textureY); // Import ImportBox224
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Import ImportBox225
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 54, 3, textureX, textureY); // Import ImportBox226
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Import ImportBox228
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Import ImportBox229
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox230
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 78, 7, textureX, textureY); // Import ImportBox238
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 44, 136, textureX, textureY); // Import ImportBox77
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 87, 161, textureX, textureY); // Import ImportBox78
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 87, 186, textureX, textureY); // Import ImportBox79
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox21
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox22
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox23
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox24
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox25
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox26
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox27
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox28
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox29
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox30
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox31
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox32
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox33
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox34
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox35
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox36
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox37
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox38
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox39
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox40
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox41
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox43
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox44
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox45
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox46
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox47
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox48
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox49
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox50
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox51
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox53
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox54
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox55
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox56
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox57
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox58
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox59
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox60
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox61
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox62
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox63
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox64
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox65
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox66
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox67
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox68
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox69
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox70
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox71
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox72
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox73
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox74
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox75
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox76
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox77
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox78
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox79
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox80
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox81
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox82
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox83
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox84
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox85
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox86
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox87
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox88
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox89
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox90
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox91
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox92
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox93
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox94
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox95
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox96
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox97
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox98
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox99
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox100
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox101
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox102
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox103
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox104
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox105
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox106
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox107
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox108
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox109
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox110
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox111
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox112
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox113
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox114
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox115
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox116
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox117
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox118
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox119
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox120
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox121
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox122
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox123
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox124
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox125
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox293
		leftTrackWheelModels[115] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox294
		leftTrackWheelModels[116] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox295
		leftTrackWheelModels[117] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox296
		leftTrackWheelModels[118] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox297
		leftTrackWheelModels[119] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox298
		leftTrackWheelModels[120] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox300
		leftTrackWheelModels[121] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Import ImportBox303
		leftTrackWheelModels[122] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox304
		leftTrackWheelModels[123] = new ModelRendererTurbo(this, 22, 4, textureX, textureY); // Import ImportBox305
		leftTrackWheelModels[124] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Import ImportBox306
		leftTrackWheelModels[125] = new ModelRendererTurbo(this, 11, 4, textureX, textureY); // Import ImportBox307
		leftTrackWheelModels[126] = new ModelRendererTurbo(this, 78, 7, textureX, textureY); // Import ImportBox308
		leftTrackWheelModels[127] = new ModelRendererTurbo(this, 54, 3, textureX, textureY); // Import ImportBox309
		leftTrackWheelModels[128] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Import ImportBox310
		leftTrackWheelModels[129] = new ModelRendererTurbo(this, 35, 3, textureX, textureY); // Import ImportBox311
		leftTrackWheelModels[130] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox312
		leftTrackWheelModels[131] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox313
		leftTrackWheelModels[132] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox322
		leftTrackWheelModels[133] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox323
		leftTrackWheelModels[134] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox324
		leftTrackWheelModels[135] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox325
		leftTrackWheelModels[136] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox326
		leftTrackWheelModels[137] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox327
		leftTrackWheelModels[138] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox329
		leftTrackWheelModels[139] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox331
		leftTrackWheelModels[140] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox340
		leftTrackWheelModels[141] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox341
		leftTrackWheelModels[142] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox342
		leftTrackWheelModels[143] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox343
		leftTrackWheelModels[144] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox344
		leftTrackWheelModels[145] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox345
		leftTrackWheelModels[146] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox346
		leftTrackWheelModels[147] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox347
		leftTrackWheelModels[148] = new ModelRendererTurbo(this, 21, 17, textureX, textureY); // Import ImportBox348
		leftTrackWheelModels[149] = new ModelRendererTurbo(this, 19, 10, textureX, textureY); // Import ImportBox349
		leftTrackWheelModels[150] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox350
		leftTrackWheelModels[151] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox351
		leftTrackWheelModels[152] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox352
		leftTrackWheelModels[153] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox353
		leftTrackWheelModels[154] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox354
		leftTrackWheelModels[155] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox355
		leftTrackWheelModels[156] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox357
		leftTrackWheelModels[157] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox358
		leftTrackWheelModels[158] = new ModelRendererTurbo(this, 31, 8, textureX, textureY); // Import ImportBox359
		leftTrackWheelModels[159] = new ModelRendererTurbo(this, 87, 161, textureX, textureY); // Import ImportBox361
		leftTrackWheelModels[160] = new ModelRendererTurbo(this, 44, 136, textureX, textureY); // Import ImportBox362
		leftTrackWheelModels[161] = new ModelRendererTurbo(this, 22, 4, textureX, textureY); // Import ImportBox363
		leftTrackWheelModels[162] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox364
		leftTrackWheelModels[163] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox365
		leftTrackWheelModels[164] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox366
		leftTrackWheelModels[165] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox367
		leftTrackWheelModels[166] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Import ImportBox368
		leftTrackWheelModels[167] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox369
		leftTrackWheelModels[168] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox370
		leftTrackWheelModels[169] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Import ImportBox371
		leftTrackWheelModels[170] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox372
		leftTrackWheelModels[171] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox373
		leftTrackWheelModels[172] = new ModelRendererTurbo(this, 11, 4, textureX, textureY); // Import ImportBox374
		leftTrackWheelModels[173] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox375
		leftTrackWheelModels[174] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox376
		leftTrackWheelModels[175] = new ModelRendererTurbo(this, 78, 7, textureX, textureY); // Import ImportBox377
		leftTrackWheelModels[176] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox378
		leftTrackWheelModels[177] = new ModelRendererTurbo(this, 54, 3, textureX, textureY); // Import ImportBox379
		leftTrackWheelModels[178] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox380
		leftTrackWheelModels[179] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox381
		leftTrackWheelModels[180] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox382
		leftTrackWheelModels[181] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Import ImportBox383
		leftTrackWheelModels[182] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox384
		leftTrackWheelModels[183] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox385
		leftTrackWheelModels[184] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox386
		leftTrackWheelModels[185] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox387
		leftTrackWheelModels[186] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox388
		leftTrackWheelModels[187] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox389
		leftTrackWheelModels[188] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox390
		leftTrackWheelModels[189] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox391
		leftTrackWheelModels[190] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Import ImportBox392
		leftTrackWheelModels[191] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox393
		leftTrackWheelModels[192] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox394
		leftTrackWheelModels[193] = new ModelRendererTurbo(this, 32, 66, textureX, textureY); // Import ImportBox395
		leftTrackWheelModels[194] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox396
		leftTrackWheelModels[195] = new ModelRendererTurbo(this, 11, 4, textureX, textureY); // Import ImportBox397
		leftTrackWheelModels[196] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox398
		leftTrackWheelModels[197] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox399
		leftTrackWheelModels[198] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox400
		leftTrackWheelModels[199] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox401
		leftTrackWheelModels[200] = new ModelRendererTurbo(this, 77, 7, textureX, textureY); // Import ImportBox402
		leftTrackWheelModels[201] = new ModelRendererTurbo(this, 78, 10, textureX, textureY); // Import ImportBox403
		leftTrackWheelModels[202] = new ModelRendererTurbo(this, 54, 3, textureX, textureY); // Import ImportBox404
		leftTrackWheelModels[203] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox405
		leftTrackWheelModels[204] = new ModelRendererTurbo(this, 28, 3, textureX, textureY); // Import ImportBox406
		leftTrackWheelModels[205] = new ModelRendererTurbo(this, 26, 48, textureX, textureY); // Import ImportBox407
		leftTrackWheelModels[206] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox408
		leftTrackWheelModels[207] = new ModelRendererTurbo(this, 43, 1, textureX, textureY); // Import ImportBox409
		leftTrackWheelModels[208] = new ModelRendererTurbo(this, 22, 4, textureX, textureY); // Import ImportBox410
		leftTrackWheelModels[209] = new ModelRendererTurbo(this, 8, 10, textureX, textureY); // Import ImportBox411
		leftTrackWheelModels[210] = new ModelRendererTurbo(this, 35, 3, textureX, textureY); // Import ImportBox412
		leftTrackWheelModels[211] = new ModelRendererTurbo(this, 87, 186, textureX, textureY); // Import ImportBox413

		leftTrackWheelModels[0].addShapeBox(-5F, -3F, -1F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox183
		leftTrackWheelModels[0].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[1].addShapeBox(2F, 5F, -1F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox224
		leftTrackWheelModels[1].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[2].addShapeBox(2F, -6F, -1F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox225
		leftTrackWheelModels[2].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[3].addShapeBox(-5F, 2F, -1F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox226
		leftTrackWheelModels[3].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[4].addShapeBox(5F, -2F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox228
		leftTrackWheelModels[4].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[5].addShapeBox(-6F, -2F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox229
		leftTrackWheelModels[5].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[6].addShapeBox(-2F, -6F, -1F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox230
		leftTrackWheelModels[6].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[7].addShapeBox(-2F, 5F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox238
		leftTrackWheelModels[7].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[8].addShapeBox(-6F, -6F, -6F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox77
		leftTrackWheelModels[8].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[9].addShapeBox(-6F, -2F, -6F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox78
		leftTrackWheelModels[9].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[10].addShapeBox(-6F, 2F, -6F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox79
		leftTrackWheelModels[10].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[11].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		leftTrackWheelModels[11].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[12].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		leftTrackWheelModels[12].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[13].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox23
		leftTrackWheelModels[13].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[14].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox24
		leftTrackWheelModels[14].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[15].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		leftTrackWheelModels[15].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[16].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox26
		leftTrackWheelModels[16].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[17].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox27
		leftTrackWheelModels[17].setRotationPoint(33F, 1F, 28F);

		leftTrackWheelModels[18].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox28
		leftTrackWheelModels[18].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[19].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox29
		leftTrackWheelModels[19].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[20].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox30
		leftTrackWheelModels[20].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[21].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox31
		leftTrackWheelModels[21].setRotationPoint(33F, 1F, 24F);

		leftTrackWheelModels[22].addBox(-1F, -1F, -7F, 2, 2, 2, 0F); // Import ImportBox32
		leftTrackWheelModels[22].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[23].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox33
		leftTrackWheelModels[23].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[24].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox34
		leftTrackWheelModels[24].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[25].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox35
		leftTrackWheelModels[25].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[26].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox36
		leftTrackWheelModels[26].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[27].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox37
		leftTrackWheelModels[27].setRotationPoint(33F, 1F, 28F);

		leftTrackWheelModels[28].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox38
		leftTrackWheelModels[28].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[29].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox39
		leftTrackWheelModels[29].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[30].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox40
		leftTrackWheelModels[30].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[31].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox41
		leftTrackWheelModels[31].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[32].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox43
		leftTrackWheelModels[32].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[33].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox44
		leftTrackWheelModels[33].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[34].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox45
		leftTrackWheelModels[34].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[35].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox46
		leftTrackWheelModels[35].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[36].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox47
		leftTrackWheelModels[36].setRotationPoint(11F, 1F, 28F);

		leftTrackWheelModels[37].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox48
		leftTrackWheelModels[37].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[38].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox49
		leftTrackWheelModels[38].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[39].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox50
		leftTrackWheelModels[39].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[40].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox51
		leftTrackWheelModels[40].setRotationPoint(11F, 1F, 24F);

		leftTrackWheelModels[41].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox53
		leftTrackWheelModels[41].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[42].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox54
		leftTrackWheelModels[42].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[43].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox55
		leftTrackWheelModels[43].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[44].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox56
		leftTrackWheelModels[44].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[45].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox57
		leftTrackWheelModels[45].setRotationPoint(11F, 1F, 28F);

		leftTrackWheelModels[46].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox58
		leftTrackWheelModels[46].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[47].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox59
		leftTrackWheelModels[47].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[48].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox60
		leftTrackWheelModels[48].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[49].addBox(-1F, -1F, -2F, 2, 2, 1, 0F); // Import ImportBox61
		leftTrackWheelModels[49].setRotationPoint(33F, 1F, 29F);

		leftTrackWheelModels[50].addBox(-1F, -1F, -2F, 2, 2, 1, 0F); // Import ImportBox62
		leftTrackWheelModels[50].setRotationPoint(11F, 1F, 29F);

		leftTrackWheelModels[51].addBox(-1F, -1F, -2F, 2, 2, 1, 0F); // Import ImportBox63
		leftTrackWheelModels[51].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[52].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox64
		leftTrackWheelModels[52].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[53].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox65
		leftTrackWheelModels[53].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[54].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
		leftTrackWheelModels[54].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[55].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox67
		leftTrackWheelModels[55].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[56].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox68
		leftTrackWheelModels[56].setRotationPoint(-10F, 1F, 28F);

		leftTrackWheelModels[57].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox69
		leftTrackWheelModels[57].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[58].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox70
		leftTrackWheelModels[58].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[59].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox71
		leftTrackWheelModels[59].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[60].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox72
		leftTrackWheelModels[60].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[61].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox73
		leftTrackWheelModels[61].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[62].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox74
		leftTrackWheelModels[62].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[63].addBox(-1F, -1F, -7F, 2, 2, 2, 0F); // Import ImportBox75
		leftTrackWheelModels[63].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[64].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox76
		leftTrackWheelModels[64].setRotationPoint(-10F, 1F, 28F);

		leftTrackWheelModels[65].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox77
		leftTrackWheelModels[65].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[66].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox78
		leftTrackWheelModels[66].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[67].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox79
		leftTrackWheelModels[67].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[68].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox80
		leftTrackWheelModels[68].setRotationPoint(-10F, 1F, 24F);

		leftTrackWheelModels[69].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox81
		leftTrackWheelModels[69].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[70].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox82
		leftTrackWheelModels[70].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[71].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox83
		leftTrackWheelModels[71].setRotationPoint(-10F, 1F, 29F);

		leftTrackWheelModels[72].addBox(-1F, -1F, -2F, 2, 2, 1, 0F); // Import ImportBox84
		leftTrackWheelModels[72].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[73].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox85
		leftTrackWheelModels[73].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[74].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox86
		leftTrackWheelModels[74].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[75].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox87
		leftTrackWheelModels[75].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[76].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox88
		leftTrackWheelModels[76].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[77].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox89
		leftTrackWheelModels[77].setRotationPoint(-30F, 1F, 28F);

		leftTrackWheelModels[78].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox90
		leftTrackWheelModels[78].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[79].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox91
		leftTrackWheelModels[79].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[80].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox92
		leftTrackWheelModels[80].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[81].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox93
		leftTrackWheelModels[81].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[82].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox94
		leftTrackWheelModels[82].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[83].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox95
		leftTrackWheelModels[83].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[84].addBox(-1F, -1F, -7F, 2, 2, 2, 0F); // Import ImportBox96
		leftTrackWheelModels[84].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[85].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox97
		leftTrackWheelModels[85].setRotationPoint(-30F, 1F, 28F);

		leftTrackWheelModels[86].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox98
		leftTrackWheelModels[86].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[87].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox99
		leftTrackWheelModels[87].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[88].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox100
		leftTrackWheelModels[88].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[89].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox101
		leftTrackWheelModels[89].setRotationPoint(-30F, 1F, 24F);

		leftTrackWheelModels[90].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox102
		leftTrackWheelModels[90].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[91].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox103
		leftTrackWheelModels[91].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[92].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox104
		leftTrackWheelModels[92].setRotationPoint(-30F, 1F, 29F);

		leftTrackWheelModels[93].addBox(-1F, -1F, -2F, 2, 2, 1, 0F); // Import ImportBox105
		leftTrackWheelModels[93].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[94].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox106
		leftTrackWheelModels[94].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[95].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox107
		leftTrackWheelModels[95].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[96].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox108
		leftTrackWheelModels[96].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[97].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox109
		leftTrackWheelModels[97].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[98].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox110
		leftTrackWheelModels[98].setRotationPoint(-47F, 1F, 28F);

		leftTrackWheelModels[99].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox111
		leftTrackWheelModels[99].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[100].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox112
		leftTrackWheelModels[100].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[101].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox113
		leftTrackWheelModels[101].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[102].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox114
		leftTrackWheelModels[102].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[103].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox115
		leftTrackWheelModels[103].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[104].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox116
		leftTrackWheelModels[104].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[105].addBox(-1F, -1F, -7F, 2, 2, 2, 0F); // Import ImportBox117
		leftTrackWheelModels[105].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[106].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox118
		leftTrackWheelModels[106].setRotationPoint(-47F, 1F, 28F);

		leftTrackWheelModels[107].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox119
		leftTrackWheelModels[107].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[108].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox120
		leftTrackWheelModels[108].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[109].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox121
		leftTrackWheelModels[109].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[110].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox122
		leftTrackWheelModels[110].setRotationPoint(-47F, 1F, 24F);

		leftTrackWheelModels[111].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox123
		leftTrackWheelModels[111].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[112].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox124
		leftTrackWheelModels[112].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[113].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox125
		leftTrackWheelModels[113].setRotationPoint(-47F, 1F, 29F);

		leftTrackWheelModels[114].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox293
		leftTrackWheelModels[114].setRotationPoint(52F, 1F, 29F);

		leftTrackWheelModels[115].addShapeBox(4F, -5F, -1F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox294
		leftTrackWheelModels[115].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[116].addShapeBox(4F, 4F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox295
		leftTrackWheelModels[116].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[117].addShapeBox(-5F, 4F, -1F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox296
		leftTrackWheelModels[117].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[118].addShapeBox(-5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox297
		leftTrackWheelModels[118].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[119].addShapeBox(6F, -2F, -1F, 2, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Import ImportBox298
		leftTrackWheelModels[119].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[120].addShapeBox(-8F, -2F, -1F, 2, 4, 2, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import ImportBox300
		leftTrackWheelModels[120].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[121].addShapeBox(2F, -6F, -8F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox303
		leftTrackWheelModels[121].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[122].addShapeBox(-2F, -6F, -8F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox304
		leftTrackWheelModels[122].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[123].addShapeBox(-5F, -3F, -8F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox305
		leftTrackWheelModels[123].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[124].addShapeBox(5F, -2F, -8F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox306
		leftTrackWheelModels[124].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[125].addShapeBox(2F, 5F, -8F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox307
		leftTrackWheelModels[125].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[126].addShapeBox(-2F, 5F, -8F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox308
		leftTrackWheelModels[126].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[127].addShapeBox(-5F, 2F, -8F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox309
		leftTrackWheelModels[127].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[128].addShapeBox(-6F, -2F, -8F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox310
		leftTrackWheelModels[128].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[129].addShapeBox(-1F, -1F, -8F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox311
		leftTrackWheelModels[129].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[130].addShapeBox(-2F, -7F, -1F, 4, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox312
		leftTrackWheelModels[130].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[131].addShapeBox(-2F, 6F, -1F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Import ImportBox313
		leftTrackWheelModels[131].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[132].addShapeBox(-2F, 6F, -8F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Import ImportBox322
		leftTrackWheelModels[132].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[133].addShapeBox(4F, 4F, -8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox323
		leftTrackWheelModels[133].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[134].addShapeBox(6F, -2F, -8F, 2, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Import ImportBox324
		leftTrackWheelModels[134].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[135].addShapeBox(4F, -5F, -8F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox325
		leftTrackWheelModels[135].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[136].addShapeBox(-2F, -7F, -8F, 4, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox326
		leftTrackWheelModels[136].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[137].addShapeBox(-5F, -5F, -8F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox327
		leftTrackWheelModels[137].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[138].addShapeBox(-5F, 4F, -8F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox329
		leftTrackWheelModels[138].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[139].addShapeBox(-8F, -2F, -8F, 2, 4, 2, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import ImportBox331
		leftTrackWheelModels[139].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[140].addShapeBox(-7.5F, -1F, -1F, 2, 4, 2, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import ImportBox340
		leftTrackWheelModels[140].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[140].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[141].addShapeBox(-5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox341
		leftTrackWheelModels[141].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[141].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[142].addShapeBox(-3F, -6.5F, -1F, 4, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox342
		leftTrackWheelModels[142].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[142].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[143].addShapeBox(4F, -5F, -1F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox343
		leftTrackWheelModels[143].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[143].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[144].addShapeBox(5.5F, -3F, -1F, 2, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Import ImportBox344
		leftTrackWheelModels[144].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[144].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[145].addShapeBox(4F, 4F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox345
		leftTrackWheelModels[145].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[145].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[146].addShapeBox(-1.5F, 5.8F, -1F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Import ImportBox346
		leftTrackWheelModels[146].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[146].rotateAngleZ = -0.52359878F;

		leftTrackWheelModels[147].addShapeBox(-5F, 4F, -1F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox347
		leftTrackWheelModels[147].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[147].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[148].addShapeBox(-2F, -2F, -1F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox348
		leftTrackWheelModels[148].setRotationPoint(-59F, -10F, -24F);

		leftTrackWheelModels[149].addShapeBox(-2F, -2F, -7F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox349
		leftTrackWheelModels[149].setRotationPoint(-59F, -10F, -22F);

		leftTrackWheelModels[150].addShapeBox(-7.5F, -1F, -8F, 2, 4, 2, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import ImportBox350
		leftTrackWheelModels[150].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[150].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[151].addShapeBox(-5F, -5F, -8F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox351
		leftTrackWheelModels[151].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[151].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[152].addShapeBox(-3F, -6.5F, -8F, 4, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox352
		leftTrackWheelModels[152].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[152].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[153].addShapeBox(4F, -5F, -8F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox353
		leftTrackWheelModels[153].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[153].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[154].addShapeBox(5.5F, -3F, -8F, 2, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Import ImportBox354
		leftTrackWheelModels[154].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[154].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[155].addShapeBox(4F, 4F, -8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox355
		leftTrackWheelModels[155].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[155].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[156].addShapeBox(-5F, 4F, -8F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox357
		leftTrackWheelModels[156].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[156].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[157].addShapeBox(-1.5F, 5.8F, -8F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Import ImportBox358
		leftTrackWheelModels[157].setRotationPoint(-59F, -10F, -22F);
		leftTrackWheelModels[157].rotateAngleZ = -0.52359878F;

		leftTrackWheelModels[158].addShapeBox(-2F, -2F, -9F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox359
		leftTrackWheelModels[158].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[159].addShapeBox(-6F, -2F, -6F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox361
		leftTrackWheelModels[159].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[160].addShapeBox(-6F, -6F, -6F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox362
		leftTrackWheelModels[160].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[161].addShapeBox(-5F, -3F, -8F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox363
		leftTrackWheelModels[161].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[162].addShapeBox(-2F, -6F, -8F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox364
		leftTrackWheelModels[162].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[163].addShapeBox(-5F, -5F, -8F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox365
		leftTrackWheelModels[163].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[163].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[164].addShapeBox(-2F, -7F, -8F, 4, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox366
		leftTrackWheelModels[164].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[165].addShapeBox(-3F, -6.5F, -8F, 4, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox367
		leftTrackWheelModels[165].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[165].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[166].addShapeBox(2F, -6F, -8F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox368
		leftTrackWheelModels[166].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[167].addShapeBox(4F, -5F, -8F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox369
		leftTrackWheelModels[167].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[168].addShapeBox(4F, -5F, -8F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox370
		leftTrackWheelModels[168].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[168].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[169].addShapeBox(5F, -2F, -8F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox371
		leftTrackWheelModels[169].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[170].addShapeBox(6F, -2F, -8F, 2, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Import ImportBox372
		leftTrackWheelModels[170].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[171].addShapeBox(5.5F, -3F, -8F, 2, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Import ImportBox373
		leftTrackWheelModels[171].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[171].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[172].addShapeBox(2F, 5F, -8F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox374
		leftTrackWheelModels[172].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[173].addShapeBox(4F, 4F, -8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox375
		leftTrackWheelModels[173].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[174].addShapeBox(4F, 4F, -8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox376
		leftTrackWheelModels[174].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[174].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[175].addShapeBox(-2F, 5F, -8F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox377
		leftTrackWheelModels[175].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[176].addShapeBox(-2F, 6F, -8F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Import ImportBox378
		leftTrackWheelModels[176].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[177].addShapeBox(-5F, 2F, -8F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox379
		leftTrackWheelModels[177].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[178].addShapeBox(-1.5F, 5.8F, -8F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Import ImportBox380
		leftTrackWheelModels[178].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[178].rotateAngleZ = -0.52359878F;

		leftTrackWheelModels[179].addShapeBox(-5F, 4F, -8F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox381
		leftTrackWheelModels[179].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[180].addShapeBox(-5F, 4F, -8F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox382
		leftTrackWheelModels[180].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[180].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[181].addShapeBox(-6F, -2F, -8F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox383
		leftTrackWheelModels[181].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[182].addShapeBox(-8F, -2F, -8F, 2, 4, 2, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import ImportBox384
		leftTrackWheelModels[182].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[183].addShapeBox(-7.5F, -1F, -8F, 2, 4, 2, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import ImportBox385
		leftTrackWheelModels[183].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[183].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[184].addShapeBox(-5F, -5F, -8F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox386
		leftTrackWheelModels[184].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[185].addShapeBox(-5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox387
		leftTrackWheelModels[185].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[186].addShapeBox(-5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox388
		leftTrackWheelModels[186].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[186].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[187].addShapeBox(-2F, -7F, -1F, 4, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox389
		leftTrackWheelModels[187].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[188].addShapeBox(-2F, -6F, -1F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox390
		leftTrackWheelModels[188].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[189].addShapeBox(-3F, -6.5F, -1F, 4, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportBox391
		leftTrackWheelModels[189].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[189].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[190].addShapeBox(2F, -6F, -1F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox392
		leftTrackWheelModels[190].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[191].addShapeBox(4F, -5F, -1F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox393
		leftTrackWheelModels[191].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[192].addShapeBox(4F, -5F, -1F, 1, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import ImportBox394
		leftTrackWheelModels[192].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[192].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[193].addShapeBox(5F, -2F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox395
		leftTrackWheelModels[193].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[194].addShapeBox(6F, -2F, -1F, 2, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Import ImportBox396
		leftTrackWheelModels[194].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[195].addShapeBox(2F, 5F, -1F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox397
		leftTrackWheelModels[195].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[196].addShapeBox(5.5F, -3F, -1F, 2, 4, 2, 0F,0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F); // Import ImportBox398
		leftTrackWheelModels[196].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[196].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[197].addShapeBox(4F, 4F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox399
		leftTrackWheelModels[197].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[198].addShapeBox(4F, 4F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox400
		leftTrackWheelModels[198].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[198].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[199].addShapeBox(-2F, 6F, -1F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Import ImportBox401
		leftTrackWheelModels[199].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[200].addShapeBox(-2F, 5F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox402
		leftTrackWheelModels[200].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[201].addShapeBox(-1.5F, 5.8F, -1F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Import ImportBox403
		leftTrackWheelModels[201].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[201].rotateAngleZ = -0.52359878F;

		leftTrackWheelModels[202].addShapeBox(-5F, 2F, -1F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox404
		leftTrackWheelModels[202].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[203].addShapeBox(-5F, 4F, -1F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox405
		leftTrackWheelModels[203].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[204].addShapeBox(-5F, 4F, -1F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox406
		leftTrackWheelModels[204].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[204].rotateAngleZ = -0.45378561F;

		leftTrackWheelModels[205].addShapeBox(-6F, -2F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox407
		leftTrackWheelModels[205].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[206].addShapeBox(-8F, -2F, -1F, 2, 4, 2, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import ImportBox408
		leftTrackWheelModels[206].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[207].addShapeBox(-7.5F, -1F, -1F, 2, 4, 2, 0F,-0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -2F, 0F); // Import ImportBox409
		leftTrackWheelModels[207].setRotationPoint(-59F, -10F, 29F);
		leftTrackWheelModels[207].rotateAngleZ = -0.55850536F;

		leftTrackWheelModels[208].addShapeBox(-5F, -3F, -1F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox410
		leftTrackWheelModels[208].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[209].addShapeBox(-2F, -2F, -1F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox411
		leftTrackWheelModels[209].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[210].addShapeBox(-1F, -1F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox412
		leftTrackWheelModels[210].setRotationPoint(-59F, -10F, 29F);

		leftTrackWheelModels[211].addShapeBox(-6F, 2F, -6F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox413
		leftTrackWheelModels[211].setRotationPoint(-59F, -10F, 29F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox160
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox176
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox205
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox206
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox214
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox215
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox217
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox247
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox248
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox35
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox36
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox37
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox12
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox13
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox14
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox15
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox16
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox17
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox18
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox19
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox20
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox42
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox52
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox126
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox127
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox128
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox129
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox130
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox131
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox132
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox133
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox134
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox135
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox136
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox137
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox138
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox139
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox140
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox141
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox142
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox143
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox144
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox145
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox146
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox147
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox148
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox149
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox150
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox151
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox152
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox153
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox154
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox155
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox156
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox157
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox158
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox159
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox160
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox161
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox162
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox163
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox164
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox165
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox166
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox167
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox168
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox169
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox170
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox171
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox172
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox173
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox174
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox175
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox176
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox177
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox178
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox179
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox180
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox181
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox182
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 36, 51, textureX, textureY); // Import ImportBox183
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox184
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox185
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox186
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox187
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox188
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox189
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox190
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox191
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox192
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox193
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox194
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 36, 51, textureX, textureY); // Import ImportBox195
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox196
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox197
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox198
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox199
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox200
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox201
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox202
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox203
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox204
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox205
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox206
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox207
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox208
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox209
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox210
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox211
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox212
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox213
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox214
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox215
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox216
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox217
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox218
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox219
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox220
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox221
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox222
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox223
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 36, 51, textureX, textureY); // Import ImportBox224
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox225
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox226
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox227
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox228
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox229
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox230
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox231
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox232
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox233
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox234
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox235
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox236
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox237
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox238
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox239
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox240
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox241
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 36, 51, textureX, textureY); // Import ImportBox242
		rightTrackWheelModels[140] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox243
		rightTrackWheelModels[141] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox244
		rightTrackWheelModels[142] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox245
		rightTrackWheelModels[143] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox246
		rightTrackWheelModels[144] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox247
		rightTrackWheelModels[145] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox248
		rightTrackWheelModels[146] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox249
		rightTrackWheelModels[147] = new ModelRendererTurbo(this, 2, 136, textureX, textureY); // Import ImportBox250
		rightTrackWheelModels[148] = new ModelRendererTurbo(this, 36, 51, textureX, textureY); // Import ImportBox251
		rightTrackWheelModels[149] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox252
		rightTrackWheelModels[150] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox253
		rightTrackWheelModels[151] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox254
		rightTrackWheelModels[152] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox255
		rightTrackWheelModels[153] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox256
		rightTrackWheelModels[154] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox257
		rightTrackWheelModels[155] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox258
		rightTrackWheelModels[156] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox259
		rightTrackWheelModels[157] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox260
		rightTrackWheelModels[158] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox261
		rightTrackWheelModels[159] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox262
		rightTrackWheelModels[160] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox263
		rightTrackWheelModels[161] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox264
		rightTrackWheelModels[162] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox265
		rightTrackWheelModels[163] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox266
		rightTrackWheelModels[164] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox267
		rightTrackWheelModels[165] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox268
		rightTrackWheelModels[166] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox269
		rightTrackWheelModels[167] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox270
		rightTrackWheelModels[168] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox271
		rightTrackWheelModels[169] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox272
		rightTrackWheelModels[170] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox273
		rightTrackWheelModels[171] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox274
		rightTrackWheelModels[172] = new ModelRendererTurbo(this, 87, 148, textureX, textureY); // Import ImportBox275
		rightTrackWheelModels[173] = new ModelRendererTurbo(this, 130, 187, textureX, textureY); // Import ImportBox276
		rightTrackWheelModels[174] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox277
		rightTrackWheelModels[175] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox278
		rightTrackWheelModels[176] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox279
		rightTrackWheelModels[177] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox280
		rightTrackWheelModels[178] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox281
		rightTrackWheelModels[179] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox282
		rightTrackWheelModels[180] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox283
		rightTrackWheelModels[181] = new ModelRendererTurbo(this, 11, 16, textureX, textureY); // Import ImportBox284
		rightTrackWheelModels[182] = new ModelRendererTurbo(this, 47, 16, textureX, textureY); // Import ImportBox285
		rightTrackWheelModels[183] = new ModelRendererTurbo(this, 16, 31, textureX, textureY); // Import ImportBox286
		rightTrackWheelModels[184] = new ModelRendererTurbo(this, 36, 50, textureX, textureY); // Import ImportBox287
		rightTrackWheelModels[185] = new ModelRendererTurbo(this, 21, 61, textureX, textureY); // Import ImportBox288
		rightTrackWheelModels[186] = new ModelRendererTurbo(this, 6, 19, textureX, textureY); // Import ImportBox289
		rightTrackWheelModels[187] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Import ImportBox290
		rightTrackWheelModels[188] = new ModelRendererTurbo(this, 16, 37, textureX, textureY); // Import ImportBox291
		rightTrackWheelModels[189] = new ModelRendererTurbo(this, 11, 68, textureX, textureY); // Import ImportBox292

		rightTrackWheelModels[0].addBox(-1F, -1F, -2F, 2, 2, 2, 0F); // Import ImportBox160
		rightTrackWheelModels[0].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[1].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox176
		rightTrackWheelModels[1].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[2].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox205
		rightTrackWheelModels[2].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[3].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox206
		rightTrackWheelModels[3].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[4].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox214
		rightTrackWheelModels[4].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[5].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox215
		rightTrackWheelModels[5].setRotationPoint(52F, 1F, -23F);

		rightTrackWheelModels[6].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox217
		rightTrackWheelModels[6].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[7].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox247
		rightTrackWheelModels[7].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[8].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox248
		rightTrackWheelModels[8].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[9].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox35
		rightTrackWheelModels[9].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[10].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox36
		rightTrackWheelModels[10].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[11].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox37
		rightTrackWheelModels[11].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[12].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox12
		rightTrackWheelModels[12].setRotationPoint(52F, 1F, -27F);

		rightTrackWheelModels[13].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox13
		rightTrackWheelModels[13].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[14].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox14
		rightTrackWheelModels[14].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[15].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox15
		rightTrackWheelModels[15].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[16].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox16
		rightTrackWheelModels[16].setRotationPoint(52F, 1F, -23F);

		rightTrackWheelModels[17].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox17
		rightTrackWheelModels[17].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[18].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox18
		rightTrackWheelModels[18].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[19].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox19
		rightTrackWheelModels[19].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[20].addBox(-1F, -1F, -6F, 2, 2, 1, 0F); // Import ImportBox20
		rightTrackWheelModels[20].setRotationPoint(52F, 1F, -22F);

		rightTrackWheelModels[21].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox42
		rightTrackWheelModels[21].setRotationPoint(11F, 1F, 29F);

		rightTrackWheelModels[22].addBox(-1F, -1F, -7F, 2, 2, 2, 0F); // Import ImportBox52
		rightTrackWheelModels[22].setRotationPoint(11F, 1F, 29F);

		rightTrackWheelModels[23].addBox(-1F, -1F, -6F, 2, 2, 1, 0F); // Import ImportBox126
		rightTrackWheelModels[23].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[24].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox127
		rightTrackWheelModels[24].setRotationPoint(68F, -7F, -27F);

		rightTrackWheelModels[25].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox128
		rightTrackWheelModels[25].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[26].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox129
		rightTrackWheelModels[26].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[27].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox130
		rightTrackWheelModels[27].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[28].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox131
		rightTrackWheelModels[28].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[29].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox132
		rightTrackWheelModels[29].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[30].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox133
		rightTrackWheelModels[30].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[31].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox134
		rightTrackWheelModels[31].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[32].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox135
		rightTrackWheelModels[32].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[33].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox136
		rightTrackWheelModels[33].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[34].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox137
		rightTrackWheelModels[34].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[35].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox138
		rightTrackWheelModels[35].setRotationPoint(68F, -7F, -23F);

		rightTrackWheelModels[36].addBox(-1F, -1F, -2F, 2, 2, 2, 0F); // Import ImportBox139
		rightTrackWheelModels[36].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[37].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox140
		rightTrackWheelModels[37].setRotationPoint(68F, -7F, -23F);

		rightTrackWheelModels[38].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox141
		rightTrackWheelModels[38].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[39].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox142
		rightTrackWheelModels[39].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[40].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox143
		rightTrackWheelModels[40].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[41].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox144
		rightTrackWheelModels[41].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[42].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox145
		rightTrackWheelModels[42].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[43].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox146
		rightTrackWheelModels[43].setRotationPoint(68F, -7F, -22F);

		rightTrackWheelModels[44].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox147
		rightTrackWheelModels[44].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[45].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox148
		rightTrackWheelModels[45].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[46].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox149
		rightTrackWheelModels[46].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[47].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox150
		rightTrackWheelModels[47].setRotationPoint(33F, 1F, -23F);

		rightTrackWheelModels[48].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox151
		rightTrackWheelModels[48].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[49].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox152
		rightTrackWheelModels[49].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[50].addBox(-1F, -1F, -6F, 2, 2, 1, 0F); // Import ImportBox153
		rightTrackWheelModels[50].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[51].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox154
		rightTrackWheelModels[51].setRotationPoint(33F, 1F, -27F);

		rightTrackWheelModels[52].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox155
		rightTrackWheelModels[52].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[53].addShapeBox(-7F, 3F, -6F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox156
		rightTrackWheelModels[53].setRotationPoint(33F, 1F, -21F);

		rightTrackWheelModels[54].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox157
		rightTrackWheelModels[54].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[55].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox158
		rightTrackWheelModels[55].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[56].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox159
		rightTrackWheelModels[56].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[57].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox160
		rightTrackWheelModels[57].setRotationPoint(33F, 1F, -23F);

		rightTrackWheelModels[58].addBox(-1F, -1F, -2F, 2, 2, 2, 0F); // Import ImportBox161
		rightTrackWheelModels[58].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[59].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox162
		rightTrackWheelModels[59].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[60].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox163
		rightTrackWheelModels[60].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[61].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox164
		rightTrackWheelModels[61].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[62].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox165
		rightTrackWheelModels[62].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[63].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox166
		rightTrackWheelModels[63].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[64].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox167
		rightTrackWheelModels[64].setRotationPoint(33F, 1F, -22F);

		rightTrackWheelModels[65].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox168
		rightTrackWheelModels[65].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[66].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox169
		rightTrackWheelModels[66].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[67].addBox(-1F, -1F, -2F, 2, 2, 2, 0F); // Import ImportBox170
		rightTrackWheelModels[67].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[68].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox171
		rightTrackWheelModels[68].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[69].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox172
		rightTrackWheelModels[69].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[70].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox173
		rightTrackWheelModels[70].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[71].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox174
		rightTrackWheelModels[71].setRotationPoint(-30F, 1F, -23F);

		rightTrackWheelModels[72].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox175
		rightTrackWheelModels[72].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[73].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox176
		rightTrackWheelModels[73].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[74].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox177
		rightTrackWheelModels[74].setRotationPoint(-30F, 1F, -27F);

		rightTrackWheelModels[75].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox178
		rightTrackWheelModels[75].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[76].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox179
		rightTrackWheelModels[76].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[77].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox180
		rightTrackWheelModels[77].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[78].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox181
		rightTrackWheelModels[78].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[79].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox182
		rightTrackWheelModels[79].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[80].addBox(-1F, -1F, -6F, 2, 2, 1, 0F); // Import ImportBox183
		rightTrackWheelModels[80].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[81].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox184
		rightTrackWheelModels[81].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[82].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox185
		rightTrackWheelModels[82].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[83].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox186
		rightTrackWheelModels[83].setRotationPoint(-30F, 1F, -23F);

		rightTrackWheelModels[84].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox187
		rightTrackWheelModels[84].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[85].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox188
		rightTrackWheelModels[85].setRotationPoint(-30F, 1F, -22F);

		rightTrackWheelModels[86].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox189
		rightTrackWheelModels[86].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[87].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox190
		rightTrackWheelModels[87].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[88].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox191
		rightTrackWheelModels[88].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[89].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox192
		rightTrackWheelModels[89].setRotationPoint(-47F, 1F, -27F);

		rightTrackWheelModels[90].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox193
		rightTrackWheelModels[90].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[91].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox194
		rightTrackWheelModels[91].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[92].addBox(-1F, -1F, -6F, 2, 2, 1, 0F); // Import ImportBox195
		rightTrackWheelModels[92].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[93].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox196
		rightTrackWheelModels[93].setRotationPoint(-47F, 1F, -23F);

		rightTrackWheelModels[94].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox197
		rightTrackWheelModels[94].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[95].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox198
		rightTrackWheelModels[95].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[96].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox199
		rightTrackWheelModels[96].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[97].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox200
		rightTrackWheelModels[97].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[98].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox201
		rightTrackWheelModels[98].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[99].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox202
		rightTrackWheelModels[99].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[100].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox203
		rightTrackWheelModels[100].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[101].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox204
		rightTrackWheelModels[101].setRotationPoint(-47F, 1F, -23F);

		rightTrackWheelModels[102].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox205
		rightTrackWheelModels[102].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[103].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox206
		rightTrackWheelModels[103].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[104].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox207
		rightTrackWheelModels[104].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[105].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox208
		rightTrackWheelModels[105].setRotationPoint(-47F, 1F, -22F);

		rightTrackWheelModels[106].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox209
		rightTrackWheelModels[106].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[107].addBox(-1F, -1F, -2F, 2, 2, 2, 0F); // Import ImportBox210
		rightTrackWheelModels[107].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[108].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox211
		rightTrackWheelModels[108].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[109].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox212
		rightTrackWheelModels[109].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[110].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox213
		rightTrackWheelModels[110].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[111].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox214
		rightTrackWheelModels[111].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[112].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox215
		rightTrackWheelModels[112].setRotationPoint(-10F, 1F, -23F);

		rightTrackWheelModels[113].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox216
		rightTrackWheelModels[113].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[114].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox217
		rightTrackWheelModels[114].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[115].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox218
		rightTrackWheelModels[115].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[116].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox219
		rightTrackWheelModels[116].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[117].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox220
		rightTrackWheelModels[117].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[118].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox221
		rightTrackWheelModels[118].setRotationPoint(-10F, 1F, -27F);

		rightTrackWheelModels[119].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox222
		rightTrackWheelModels[119].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[120].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox223
		rightTrackWheelModels[120].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[121].addBox(-1F, -1F, -6F, 2, 2, 1, 0F); // Import ImportBox224
		rightTrackWheelModels[121].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[122].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox225
		rightTrackWheelModels[122].setRotationPoint(-10F, 1F, -23F);

		rightTrackWheelModels[123].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox226
		rightTrackWheelModels[123].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[124].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox227
		rightTrackWheelModels[124].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[125].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox228
		rightTrackWheelModels[125].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[126].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox229
		rightTrackWheelModels[126].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[127].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox230
		rightTrackWheelModels[127].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[128].addBox(-1F, -1F, -2F, 2, 2, 2, 0F); // Import ImportBox231
		rightTrackWheelModels[128].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[129].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox232
		rightTrackWheelModels[129].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[130].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox233
		rightTrackWheelModels[130].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[131].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox234
		rightTrackWheelModels[131].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[132].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox235
		rightTrackWheelModels[132].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[133].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox236
		rightTrackWheelModels[133].setRotationPoint(11F, 1F, -23F);

		rightTrackWheelModels[134].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox237
		rightTrackWheelModels[134].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[135].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox238
		rightTrackWheelModels[135].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[136].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox239
		rightTrackWheelModels[136].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[137].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox240
		rightTrackWheelModels[137].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[138].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox241
		rightTrackWheelModels[138].setRotationPoint(11F, 1F, -27F);

		rightTrackWheelModels[139].addBox(-1F, -1F, -6F, 2, 2, 1, 0F); // Import ImportBox242
		rightTrackWheelModels[139].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[140].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox243
		rightTrackWheelModels[140].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[141].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox244
		rightTrackWheelModels[141].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[142].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox245
		rightTrackWheelModels[142].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[143].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox246
		rightTrackWheelModels[143].setRotationPoint(11F, 1F, -23F);

		rightTrackWheelModels[144].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox247
		rightTrackWheelModels[144].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[145].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox248
		rightTrackWheelModels[145].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[146].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox249
		rightTrackWheelModels[146].setRotationPoint(11F, 1F, -22F);

		rightTrackWheelModels[147].addShapeBox(-7F, 3F, -5F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import ImportBox250
		rightTrackWheelModels[147].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[148].addBox(-1F, -1F, -2F, 2, 2, 1, 0F); // Import ImportBox251
		rightTrackWheelModels[148].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[149].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox252
		rightTrackWheelModels[149].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[150].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox253
		rightTrackWheelModels[150].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[151].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox254
		rightTrackWheelModels[151].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[152].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox255
		rightTrackWheelModels[152].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[153].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox256
		rightTrackWheelModels[153].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[154].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox257
		rightTrackWheelModels[154].setRotationPoint(68F, -7F, 28F);

		rightTrackWheelModels[155].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox258
		rightTrackWheelModels[155].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[156].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox259
		rightTrackWheelModels[156].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[157].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox260
		rightTrackWheelModels[157].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[158].addBox(-1F, -1F, -7F, 2, 2, 2, 0F); // Import ImportBox261
		rightTrackWheelModels[158].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[159].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox262
		rightTrackWheelModels[159].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[160].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox263
		rightTrackWheelModels[160].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[161].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox264
		rightTrackWheelModels[161].setRotationPoint(68F, -7F, 28F);

		rightTrackWheelModels[162].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox265
		rightTrackWheelModels[162].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[163].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox266
		rightTrackWheelModels[163].setRotationPoint(68F, -7F, 24F);

		rightTrackWheelModels[164].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox267
		rightTrackWheelModels[164].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[165].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox268
		rightTrackWheelModels[165].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[166].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox269
		rightTrackWheelModels[166].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[167].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox270
		rightTrackWheelModels[167].setRotationPoint(68F, -7F, 29F);

		rightTrackWheelModels[168].addBox(-1F, -1F, -1F, 2, 2, 2, 0F); // Import ImportBox271
		rightTrackWheelModels[168].setRotationPoint(-47F, 1F, -23F);

		rightTrackWheelModels[169].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox272
		rightTrackWheelModels[169].setRotationPoint(-10F, 1F, -22F);

		rightTrackWheelModels[170].addShapeBox(3F, 6F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox273
		rightTrackWheelModels[170].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[171].addBox(-1F, -1F, -2F, 2, 2, 1, 0F); // Import ImportBox274
		rightTrackWheelModels[171].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[172].addShapeBox(-7F, -3F, -5F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox275
		rightTrackWheelModels[172].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[173].addShapeBox(-7F, -7F, -5F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox276
		rightTrackWheelModels[173].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[174].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox277
		rightTrackWheelModels[174].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[175].addShapeBox(3F, -7F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox278
		rightTrackWheelModels[175].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[176].addShapeBox(-3F, -7F, -2F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox279
		rightTrackWheelModels[176].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[177].addShapeBox(-6F, -4F, -2F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox280
		rightTrackWheelModels[177].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[178].addBox(-7F, -3F, -1F, 1, 6, 2, 0F); // Import ImportBox281
		rightTrackWheelModels[178].setRotationPoint(52F, 1F, 28F);

		rightTrackWheelModels[179].addShapeBox(-6F, 3F, -2F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox282
		rightTrackWheelModels[179].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[180].addShapeBox(-3F, 6F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox283
		rightTrackWheelModels[180].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[181].addShapeBox(-6F, 3F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox284
		rightTrackWheelModels[181].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[182].addShapeBox(-3F, 6F, -7F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import ImportBox285
		rightTrackWheelModels[182].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[183].addShapeBox(3F, 6F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox286
		rightTrackWheelModels[183].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[184].addBox(-1F, -1F, -7F, 2, 2, 2, 0F); // Import ImportBox287
		rightTrackWheelModels[184].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[185].addBox(6F, -3F, -2F, 1, 6, 2, 0F); // Import ImportBox288
		rightTrackWheelModels[185].setRotationPoint(52F, 1F, 24F);

		rightTrackWheelModels[186].addShapeBox(3F, -7F, -7F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F); // Import ImportBox289
		rightTrackWheelModels[186].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[187].addShapeBox(-3F, -7F, -7F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox290
		rightTrackWheelModels[187].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[188].addShapeBox(-6F, -4F, -7F, 1, 1, 2, 0F,-3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, -3F, 3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Import ImportBox291
		rightTrackWheelModels[188].setRotationPoint(52F, 1F, 29F);

		rightTrackWheelModels[189].addBox(-7F, -3F, -6F, 1, 6, 2, 0F); // Import ImportBox292
		rightTrackWheelModels[189].setRotationPoint(52F, 1F, 28F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}