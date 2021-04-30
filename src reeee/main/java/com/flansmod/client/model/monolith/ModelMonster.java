//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.04.2016 - 18:42:01
// Last changed on: 19.04.2016 - 18:42:01

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMonster extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelMonster() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[318];
		turretModel = new ModelRendererTurbo[7];
		barrelModel = new ModelRendererTurbo[22];
		leftTrackModel = new ModelRendererTurbo[91];
		rightTrackModel = new ModelRendererTurbo[63];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 89
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 90
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 91
		bodyModel[7] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 92
		bodyModel[8] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 93
		bodyModel[9] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 94
		bodyModel[10] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 95
		bodyModel[11] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 96
		bodyModel[12] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 97
		bodyModel[13] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 98
		bodyModel[14] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 99
		bodyModel[15] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 100
		bodyModel[16] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 101
		bodyModel[17] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 102
		bodyModel[18] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 103
		bodyModel[19] = new ModelRendererTurbo(this, 1169, 1, textureX, textureY); // Box 104
		bodyModel[20] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 105
		bodyModel[21] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 106
		bodyModel[22] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 107
		bodyModel[23] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 108
		bodyModel[24] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 109
		bodyModel[25] = new ModelRendererTurbo(this, 1313, 1, textureX, textureY); // Box 110
		bodyModel[26] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 111
		bodyModel[27] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Box 112
		bodyModel[28] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 113
		bodyModel[29] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 114
		bodyModel[30] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 115
		bodyModel[31] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 116
		bodyModel[32] = new ModelRendererTurbo(this, 1497, 1, textureX, textureY); // Box 117
		bodyModel[33] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 118
		bodyModel[34] = new ModelRendererTurbo(this, 1577, 1, textureX, textureY); // Box 119
		bodyModel[35] = new ModelRendererTurbo(this, 1593, 1, textureX, textureY); // Box 120
		bodyModel[36] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 121
		bodyModel[37] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 122
		bodyModel[38] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 123
		bodyModel[39] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 124
		bodyModel[40] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 126
		bodyModel[41] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 127
		bodyModel[42] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 129
		bodyModel[44] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 130
		bodyModel[45] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 131
		bodyModel[46] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 132
		bodyModel[47] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 133
		bodyModel[48] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 134
		bodyModel[49] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 135
		bodyModel[50] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 136
		bodyModel[51] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 137
		bodyModel[52] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 138
		bodyModel[53] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 139
		bodyModel[54] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 140
		bodyModel[55] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 141
		bodyModel[56] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 142
		bodyModel[57] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 143
		bodyModel[58] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 144
		bodyModel[59] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 145
		bodyModel[60] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 146
		bodyModel[61] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 147
		bodyModel[62] = new ModelRendererTurbo(this, 1137, 1, textureX, textureY); // Box 148
		bodyModel[63] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 149
		bodyModel[64] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 150
		bodyModel[65] = new ModelRendererTurbo(this, 1169, 1, textureX, textureY); // Box 151
		bodyModel[66] = new ModelRendererTurbo(this, 1185, 1, textureX, textureY); // Box 152
		bodyModel[67] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 153
		bodyModel[68] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Box 154
		bodyModel[69] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 155
		bodyModel[70] = new ModelRendererTurbo(this, 1233, 1, textureX, textureY); // Box 156
		bodyModel[71] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 157
		bodyModel[72] = new ModelRendererTurbo(this, 1257, 1, textureX, textureY); // Box 158
		bodyModel[73] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 159
		bodyModel[74] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 160
		bodyModel[75] = new ModelRendererTurbo(this, 1289, 1, textureX, textureY); // Box 161
		bodyModel[76] = new ModelRendererTurbo(this, 1305, 1, textureX, textureY); // Box 162
		bodyModel[77] = new ModelRendererTurbo(this, 1313, 1, textureX, textureY); // Box 163
		bodyModel[78] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 164
		bodyModel[79] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 165
		bodyModel[80] = new ModelRendererTurbo(this, 1353, 1, textureX, textureY); // Box 166
		bodyModel[81] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Box 167
		bodyModel[82] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 168
		bodyModel[83] = new ModelRendererTurbo(this, 1385, 1, textureX, textureY); // Box 169
		bodyModel[84] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 170
		bodyModel[85] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 171
		bodyModel[86] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 172
		bodyModel[87] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Box 173
		bodyModel[88] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Box 174
		bodyModel[89] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 177
		bodyModel[90] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 178
		bodyModel[91] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 179
		bodyModel[92] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 180
		bodyModel[93] = new ModelRendererTurbo(this, 1161, 25, textureX, textureY); // Box 193
		bodyModel[94] = new ModelRendererTurbo(this, 1809, 1, textureX, textureY); // Box 194
		bodyModel[95] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 195
		bodyModel[96] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 196
		bodyModel[97] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 197
		bodyModel[98] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 198
		bodyModel[99] = new ModelRendererTurbo(this, 1889, 65, textureX, textureY); // Box 199
		bodyModel[100] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 200
		bodyModel[101] = new ModelRendererTurbo(this, 1497, 1, textureX, textureY); // Box 201
		bodyModel[102] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 202
		bodyModel[103] = new ModelRendererTurbo(this, 1785, 73, textureX, textureY); // Box 224
		bodyModel[104] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 225
		bodyModel[105] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 226
		bodyModel[106] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 227
		bodyModel[107] = new ModelRendererTurbo(this, 1633, 1, textureX, textureY); // Box 228
		bodyModel[108] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 229
		bodyModel[109] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Box 230
		bodyModel[110] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 231
		bodyModel[111] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 232
		bodyModel[112] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 233
		bodyModel[113] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 234
		bodyModel[114] = new ModelRendererTurbo(this, 1569, 97, textureX, textureY); // Box 235
		bodyModel[115] = new ModelRendererTurbo(this, 577, 169, textureX, textureY); // Box 264
		bodyModel[116] = new ModelRendererTurbo(this, 1249, 193, textureX, textureY); // Box 267
		bodyModel[117] = new ModelRendererTurbo(this, 1313, 217, textureX, textureY); // Box 268
		bodyModel[118] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Box 521
		bodyModel[119] = new ModelRendererTurbo(this, 1881, 73, textureX, textureY); // Box 522
		bodyModel[120] = new ModelRendererTurbo(this, 2041, 89, textureX, textureY); // Box 523
		bodyModel[121] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 524
		bodyModel[122] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 525
		bodyModel[123] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 526
		bodyModel[124] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 527
		bodyModel[125] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 528
		bodyModel[126] = new ModelRendererTurbo(this, 1737, 1, textureX, textureY); // Box 529
		bodyModel[127] = new ModelRendererTurbo(this, 1753, 1, textureX, textureY); // Box 530
		bodyModel[128] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 531
		bodyModel[129] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Box 532
		bodyModel[130] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 533
		bodyModel[131] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 534
		bodyModel[132] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 535
		bodyModel[133] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 536
		bodyModel[134] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 537
		bodyModel[135] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 538
		bodyModel[136] = new ModelRendererTurbo(this, 1345, 9, textureX, textureY); // Box 539
		bodyModel[137] = new ModelRendererTurbo(this, 1361, 9, textureX, textureY); // Box 540
		bodyModel[138] = new ModelRendererTurbo(this, 1385, 9, textureX, textureY); // Box 541
		bodyModel[139] = new ModelRendererTurbo(this, 1985, 97, textureX, textureY); // Box 542
		bodyModel[140] = new ModelRendererTurbo(this, 2033, 97, textureX, textureY); // Box 543
		bodyModel[141] = new ModelRendererTurbo(this, 1401, 9, textureX, textureY); // Box 544
		bodyModel[142] = new ModelRendererTurbo(this, 1425, 9, textureX, textureY); // Box 545
		bodyModel[143] = new ModelRendererTurbo(this, 1441, 9, textureX, textureY); // Box 546
		bodyModel[144] = new ModelRendererTurbo(this, 1465, 9, textureX, textureY); // Box 547
		bodyModel[145] = new ModelRendererTurbo(this, 1497, 9, textureX, textureY); // Box 548
		bodyModel[146] = new ModelRendererTurbo(this, 1561, 9, textureX, textureY); // Box 549
		bodyModel[147] = new ModelRendererTurbo(this, 1609, 9, textureX, textureY); // Box 550
		bodyModel[148] = new ModelRendererTurbo(this, 1673, 9, textureX, textureY); // Box 551
		bodyModel[149] = new ModelRendererTurbo(this, 1689, 9, textureX, textureY); // Box 552
		bodyModel[150] = new ModelRendererTurbo(this, 1705, 9, textureX, textureY); // Box 553
		bodyModel[151] = new ModelRendererTurbo(this, 1721, 9, textureX, textureY); // Box 554
		bodyModel[152] = new ModelRendererTurbo(this, 1737, 9, textureX, textureY); // Box 555
		bodyModel[153] = new ModelRendererTurbo(this, 1753, 9, textureX, textureY); // Box 556
		bodyModel[154] = new ModelRendererTurbo(this, 1769, 9, textureX, textureY); // Box 557
		bodyModel[155] = new ModelRendererTurbo(this, 1801, 9, textureX, textureY); // Box 558
		bodyModel[156] = new ModelRendererTurbo(this, 1889, 9, textureX, textureY); // Box 559
		bodyModel[157] = new ModelRendererTurbo(this, 1921, 9, textureX, textureY); // Box 560
		bodyModel[158] = new ModelRendererTurbo(this, 1713, 97, textureX, textureY); // Box 601
		bodyModel[159] = new ModelRendererTurbo(this, 1185, 17, textureX, textureY); // Box 602
		bodyModel[160] = new ModelRendererTurbo(this, 1241, 17, textureX, textureY); // Box 603
		bodyModel[161] = new ModelRendererTurbo(this, 1841, 9, textureX, textureY); // Box 604
		bodyModel[162] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 605
		bodyModel[163] = new ModelRendererTurbo(this, 1689, 17, textureX, textureY); // Box 606
		bodyModel[164] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 607
		bodyModel[165] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 608
		bodyModel[166] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 609
		bodyModel[167] = new ModelRendererTurbo(this, 1033, 81, textureX, textureY); // Box 610
		bodyModel[168] = new ModelRendererTurbo(this, 1081, 81, textureX, textureY); // Box 611
		bodyModel[169] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Box 612
		bodyModel[170] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 613
		bodyModel[171] = new ModelRendererTurbo(this, 1033, 89, textureX, textureY); // Box 614
		bodyModel[172] = new ModelRendererTurbo(this, 1081, 89, textureX, textureY); // Box 615
		bodyModel[173] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 616
		bodyModel[174] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 617
		bodyModel[175] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 618
		bodyModel[176] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 619
		bodyModel[177] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 620
		bodyModel[178] = new ModelRendererTurbo(this, 1793, 345, textureX, textureY); // Box 621
		bodyModel[179] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 622
		bodyModel[180] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 623
		bodyModel[181] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 624
		bodyModel[182] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 625
		bodyModel[183] = new ModelRendererTurbo(this, 745, 361, textureX, textureY); // Box 626
		bodyModel[184] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 627
		bodyModel[185] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 628
		bodyModel[186] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 629
		bodyModel[187] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 630
		bodyModel[188] = new ModelRendererTurbo(this, 1529, 129, textureX, textureY); // Box 631
		bodyModel[189] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 632
		bodyModel[190] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 633
		bodyModel[191] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 634
		bodyModel[192] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 635
		bodyModel[193] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 636
		bodyModel[194] = new ModelRendererTurbo(this, 1937, 9, textureX, textureY); // Box 637
		bodyModel[195] = new ModelRendererTurbo(this, 2001, 9, textureX, textureY); // Box 638
		bodyModel[196] = new ModelRendererTurbo(this, 2009, 9, textureX, textureY); // Box 639
		bodyModel[197] = new ModelRendererTurbo(this, 2033, 9, textureX, textureY); // Box 640
		bodyModel[198] = new ModelRendererTurbo(this, 2041, 9, textureX, textureY); // Box 641
		bodyModel[199] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 642
		bodyModel[200] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 643
		bodyModel[201] = new ModelRendererTurbo(this, 1249, 169, textureX, textureY); // Box 644
		bodyModel[202] = new ModelRendererTurbo(this, 1409, 169, textureX, textureY); // Box 645
		bodyModel[203] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 646
		bodyModel[204] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 647
		bodyModel[205] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 648
		bodyModel[206] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 649
		bodyModel[207] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 650
		bodyModel[208] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 651
		bodyModel[209] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 652
		bodyModel[210] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 653
		bodyModel[211] = new ModelRendererTurbo(this, 1249, 177, textureX, textureY); // Box 688
		bodyModel[212] = new ModelRendererTurbo(this, 1409, 177, textureX, textureY); // Box 689
		bodyModel[213] = new ModelRendererTurbo(this, 1249, 185, textureX, textureY); // Box 690
		bodyModel[214] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 691
		bodyModel[215] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 692
		bodyModel[216] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 693
		bodyModel[217] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Box 694
		bodyModel[218] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 695
		bodyModel[219] = new ModelRendererTurbo(this, 1097, 17, textureX, textureY); // Box 696
		bodyModel[220] = new ModelRendererTurbo(this, 1113, 17, textureX, textureY); // Box 697
		bodyModel[221] = new ModelRendererTurbo(this, 1121, 17, textureX, textureY); // Box 698
		bodyModel[222] = new ModelRendererTurbo(this, 1409, 185, textureX, textureY); // Box 699
		bodyModel[223] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 700
		bodyModel[224] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 701
		bodyModel[225] = new ModelRendererTurbo(this, 1137, 17, textureX, textureY); // Box 702
		bodyModel[226] = new ModelRendererTurbo(this, 1145, 17, textureX, textureY); // Box 703
		bodyModel[227] = new ModelRendererTurbo(this, 1161, 17, textureX, textureY); // Box 704
		bodyModel[228] = new ModelRendererTurbo(this, 1169, 17, textureX, textureY); // Box 705
		bodyModel[229] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 706
		bodyModel[230] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 707
		bodyModel[231] = new ModelRendererTurbo(this, 1193, 25, textureX, textureY); // Box 708
		bodyModel[232] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 709
		bodyModel[233] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 712
		bodyModel[234] = new ModelRendererTurbo(this, 1769, 41, textureX, textureY); // Box 713
		bodyModel[235] = new ModelRendererTurbo(this, 1889, 73, textureX, textureY); // Box 714
		bodyModel[236] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 715
		bodyModel[237] = new ModelRendererTurbo(this, 1785, 41, textureX, textureY); // Box 716
		bodyModel[238] = new ModelRendererTurbo(this, 1969, 65, textureX, textureY); // Box 717
		bodyModel[239] = new ModelRendererTurbo(this, 1865, 145, textureX, textureY); // Box 718
		bodyModel[240] = new ModelRendererTurbo(this, 2009, 145, textureX, textureY); // Box 719
		bodyModel[241] = new ModelRendererTurbo(this, 753, 401, textureX, textureY); // Box 529
		bodyModel[242] = new ModelRendererTurbo(this, 1665, 161, textureX, textureY); // Box 530
		bodyModel[243] = new ModelRendererTurbo(this, 1025, 401, textureX, textureY); // Box 531
		bodyModel[244] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 534
		bodyModel[245] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 535
		bodyModel[246] = new ModelRendererTurbo(this, 217, 417, textureX, textureY); // Box 536
		bodyModel[247] = new ModelRendererTurbo(this, 945, 313, textureX, textureY); // Box 541
		bodyModel[248] = new ModelRendererTurbo(this, 1881, 345, textureX, textureY); // Box 542
		bodyModel[249] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 543
		bodyModel[250] = new ModelRendererTurbo(this, 241, 433, textureX, textureY); // Box 544
		bodyModel[251] = new ModelRendererTurbo(this, 1713, 369, textureX, textureY); // Box 407
		bodyModel[252] = new ModelRendererTurbo(this, 1873, 73, textureX, textureY); // Box 408
		bodyModel[253] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 409
		bodyModel[254] = new ModelRendererTurbo(this, 1129, 81, textureX, textureY); // Box 410
		bodyModel[255] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 411
		bodyModel[256] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 412
		bodyModel[257] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Box 413
		bodyModel[258] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 414
		bodyModel[259] = new ModelRendererTurbo(this, 1193, 41, textureX, textureY); // Box 415
		bodyModel[260] = new ModelRendererTurbo(this, 1801, 41, textureX, textureY); // Box 416
		bodyModel[261] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 417
		bodyModel[262] = new ModelRendererTurbo(this, 1985, 65, textureX, textureY); // Box 418
		bodyModel[263] = new ModelRendererTurbo(this, 1849, 73, textureX, textureY); // Box 419
		bodyModel[264] = new ModelRendererTurbo(this, 665, 425, textureX, textureY); // Box 420
		bodyModel[265] = new ModelRendererTurbo(this, 1089, 401, textureX, textureY); // Box 421
		bodyModel[266] = new ModelRendererTurbo(this, 1297, 17, textureX, textureY); // Box 422
		bodyModel[267] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 423
		bodyModel[268] = new ModelRendererTurbo(this, 1737, 17, textureX, textureY); // Box 424
		bodyModel[269] = new ModelRendererTurbo(this, 1753, 17, textureX, textureY); // Box 425
		bodyModel[270] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 426
		bodyModel[271] = new ModelRendererTurbo(this, 1857, 73, textureX, textureY); // Box 427
		bodyModel[272] = new ModelRendererTurbo(this, 1889, 73, textureX, textureY); // Box 428
		bodyModel[273] = new ModelRendererTurbo(this, 1913, 73, textureX, textureY); // Box 429
		bodyModel[274] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 430
		bodyModel[275] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 431
		bodyModel[276] = new ModelRendererTurbo(this, 1713, 417, textureX, textureY); // Box 432
		bodyModel[277] = new ModelRendererTurbo(this, 1769, 97, textureX, textureY); // Box 433
		bodyModel[278] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 434
		bodyModel[279] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Box 435
		bodyModel[280] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 436
		bodyModel[281] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 437
		bodyModel[282] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 438
		bodyModel[283] = new ModelRendererTurbo(this, 1857, 81, textureX, textureY); // Box 439
		bodyModel[284] = new ModelRendererTurbo(this, 1865, 81, textureX, textureY); // Box 440
		bodyModel[285] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 441
		bodyModel[286] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 442
		bodyModel[287] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 443
		bodyModel[288] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 444
		bodyModel[289] = new ModelRendererTurbo(this, 769, 425, textureX, textureY); // Box 445
		bodyModel[290] = new ModelRendererTurbo(this, 1497, 401, textureX, textureY); // Box 446
		bodyModel[291] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 447
		bodyModel[292] = new ModelRendererTurbo(this, 1529, 97, textureX, textureY); // Box 448
		bodyModel[293] = new ModelRendererTurbo(this, 1585, 97, textureX, textureY); // Box 449
		bodyModel[294] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 450
		bodyModel[295] = new ModelRendererTurbo(this, 1625, 97, textureX, textureY); // Box 451
		bodyModel[296] = new ModelRendererTurbo(this, 1681, 97, textureX, textureY); // Box 452
		bodyModel[297] = new ModelRendererTurbo(this, 1993, 97, textureX, textureY); // Box 453
		bodyModel[298] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 454
		bodyModel[299] = new ModelRendererTurbo(this, 1585, 105, textureX, textureY); // Box 455
		bodyModel[300] = new ModelRendererTurbo(this, 1625, 105, textureX, textureY); // Box 456
		bodyModel[301] = new ModelRendererTurbo(this, 1601, 353, textureX, textureY); // Box 458
		bodyModel[302] = new ModelRendererTurbo(this, 697, 361, textureX, textureY); // Box 459
		bodyModel[303] = new ModelRendererTurbo(this, 1681, 105, textureX, textureY); // Box 460
		bodyModel[304] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 496
		bodyModel[305] = new ModelRendererTurbo(this, 1945, 433, textureX, textureY); // Box 497
		bodyModel[306] = new ModelRendererTurbo(this, 585, 449, textureX, textureY); // Box 498
		bodyModel[307] = new ModelRendererTurbo(this, 1065, 449, textureX, textureY); // Box 499
		bodyModel[308] = new ModelRendererTurbo(this, 89, 473, textureX, textureY); // Box 500
		bodyModel[309] = new ModelRendererTurbo(this, 193, 473, textureX, textureY); // Box 501
		bodyModel[310] = new ModelRendererTurbo(this, 297, 473, textureX, textureY); // Box 502
		bodyModel[311] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 503
		bodyModel[312] = new ModelRendererTurbo(this, 641, 473, textureX, textureY); // Box 504
		bodyModel[313] = new ModelRendererTurbo(this, 745, 473, textureX, textureY); // Box 505
		bodyModel[314] = new ModelRendererTurbo(this, 361, 481, textureX, textureY); // Box 506
		bodyModel[315] = new ModelRendererTurbo(this, 1201, 497, textureX, textureY); // Box 509
		bodyModel[316] = new ModelRendererTurbo(this, 1833, 441, textureX, textureY); // Box 515
		bodyModel[317] = new ModelRendererTurbo(this, 697, 473, textureX, textureY); // Box 516

		bodyModel[0].addBox(0F, 0F, 0F, 307, 29, 57, 0F); // Box 2
		bodyModel[0].setRotationPoint(-186F, -44F, -28.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 17, 57, 0F,0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[1].setRotationPoint(95F, -61F, -28.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 67, 17, 57, 0F); // Box 5
		bodyModel[2].setRotationPoint(-186F, -61F, -28.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 52, 1, 0F); // Box 88
		bodyModel[3].setRotationPoint(-187F, -61F, -5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 52, 1, 0F); // Box 89
		bodyModel[4].setRotationPoint(-187F, -61F, -5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 52, 1, 0F); // Box 90
		bodyModel[5].setRotationPoint(-187F, -61F, 4F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 91
		bodyModel[6].setRotationPoint(-187F, -59F, -4F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 92
		bodyModel[7].setRotationPoint(-187F, -54F, -4F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 93
		bodyModel[8].setRotationPoint(-187F, -49F, -4F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 94
		bodyModel[9].setRotationPoint(-187F, -44F, -4F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 95
		bodyModel[10].setRotationPoint(-187F, -39F, -4F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 96
		bodyModel[11].setRotationPoint(-187F, -34F, -4F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 97
		bodyModel[12].setRotationPoint(-187F, -29F, -4F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 98
		bodyModel[13].setRotationPoint(-187F, -24F, -4F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 99
		bodyModel[14].setRotationPoint(-187F, -19F, -4F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 100
		bodyModel[15].setRotationPoint(-187F, -14F, -4F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 101
		bodyModel[16].setRotationPoint(-187F, -11.5F, -4F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 102
		bodyModel[17].setRotationPoint(-187F, -56.5F, -4F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 103
		bodyModel[18].setRotationPoint(-187F, -51.5F, -4F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 104
		bodyModel[19].setRotationPoint(-187F, -46.5F, -4F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 105
		bodyModel[20].setRotationPoint(-187F, -41.5F, -4F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 106
		bodyModel[21].setRotationPoint(-187F, -36.5F, -4F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 107
		bodyModel[22].setRotationPoint(-187F, -31.5F, -4F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 108
		bodyModel[23].setRotationPoint(-187F, -26.5F, -4F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 109
		bodyModel[24].setRotationPoint(-187F, -21.5F, -4F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 110
		bodyModel[25].setRotationPoint(-187F, -16.5F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 111
		bodyModel[26].setRotationPoint(-190F, -54F, -23.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 5, 15, 0F); // Box 112
		bodyModel[27].setRotationPoint(-188F, -54F, -23.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 113
		bodyModel[28].setRotationPoint(-188F, -43F, -23.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 114
		bodyModel[29].setRotationPoint(-190F, -43F, -23.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 14, 3, 0F); // Box 115
		bodyModel[30].setRotationPoint(-189F, -57F, -21.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 14, 3, 0F); // Box 116
		bodyModel[31].setRotationPoint(-189F, -57F, -14.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 117
		bodyModel[32].setRotationPoint(-190F, -54F, 8.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 5, 15, 0F); // Box 118
		bodyModel[33].setRotationPoint(-188F, -54F, 8.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 14, 3, 0F); // Box 119
		bodyModel[34].setRotationPoint(-189F, -57F, 11.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 14, 3, 0F); // Box 120
		bodyModel[35].setRotationPoint(-189F, -57F, 18.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 15, 0F); // Box 121
		bodyModel[36].setRotationPoint(-188F, -43F, 8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 122
		bodyModel[37].setRotationPoint(-190F, -43F, 8.5F);

		bodyModel[38].addBox(0F, 2F, 0F, 1, 14, 11, 0F); // Box 123
		bodyModel[38].setRotationPoint(-187F, -26F, 9.5F);

		bodyModel[39].addBox(0F, 2F, 0F, 1, 14, 11, 0F); // Box 124
		bodyModel[39].setRotationPoint(-187F, -26F, -19.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 126
		bodyModel[40].setRotationPoint(-186.5F, -60F, -27.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 127
		bodyModel[41].setRotationPoint(-187F, -60F, -27.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[42].setRotationPoint(-186.5F, -60F, 26.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 129
		bodyModel[43].setRotationPoint(-186.5F, -58F, 26.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 130
		bodyModel[44].setRotationPoint(-186.5F, -58F, -27.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 131
		bodyModel[45].setRotationPoint(-186.5F, -56F, 26.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[46].setRotationPoint(-186.5F, -56F, -27.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		bodyModel[47].setRotationPoint(-186.5F, -50F, 26.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[48].setRotationPoint(-186.5F, -50F, -27.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135
		bodyModel[49].setRotationPoint(-186.5F, -52F, 26.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 136
		bodyModel[50].setRotationPoint(-186.5F, -54F, 26.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 137
		bodyModel[51].setRotationPoint(-186.5F, -52F, -27.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 138
		bodyModel[52].setRotationPoint(-186.5F, -54F, -27.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 139
		bodyModel[53].setRotationPoint(-186.5F, -44F, 26.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 140
		bodyModel[54].setRotationPoint(-186.5F, -44F, -27.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 141
		bodyModel[55].setRotationPoint(-186.5F, -46F, 26.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 142
		bodyModel[56].setRotationPoint(-186.5F, -48F, 26.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 143
		bodyModel[57].setRotationPoint(-186.5F, -46F, -27.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 144
		bodyModel[58].setRotationPoint(-186.5F, -48F, -27.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 145
		bodyModel[59].setRotationPoint(-186.5F, -38F, 26.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 146
		bodyModel[60].setRotationPoint(-186.5F, -38F, -27.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 147
		bodyModel[61].setRotationPoint(-186.5F, -40F, 26.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 148
		bodyModel[62].setRotationPoint(-186.5F, -42F, 26.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[63].setRotationPoint(-186.5F, -40F, -27.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 150
		bodyModel[64].setRotationPoint(-186.5F, -42F, -27.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 151
		bodyModel[65].setRotationPoint(-186.5F, -32F, 26.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 152
		bodyModel[66].setRotationPoint(-186.5F, -32F, -27.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 153
		bodyModel[67].setRotationPoint(-186.5F, -34F, 26.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 154
		bodyModel[68].setRotationPoint(-186.5F, -36F, 26.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 155
		bodyModel[69].setRotationPoint(-186.5F, -34F, -27.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 156
		bodyModel[70].setRotationPoint(-186.5F, -36F, -27.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 157
		bodyModel[71].setRotationPoint(-186.5F, -26F, 26.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 158
		bodyModel[72].setRotationPoint(-186.5F, -26F, -27.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 159
		bodyModel[73].setRotationPoint(-186.5F, -28F, 26.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 160
		bodyModel[74].setRotationPoint(-186.5F, -30F, 26.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 161
		bodyModel[75].setRotationPoint(-186.5F, -28F, -27.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 162
		bodyModel[76].setRotationPoint(-186.5F, -30F, -27.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 163
		bodyModel[77].setRotationPoint(-186.5F, -20F, 26.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 164
		bodyModel[78].setRotationPoint(-186.5F, -20F, -27.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 165
		bodyModel[79].setRotationPoint(-186.5F, -22F, 26.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 166
		bodyModel[80].setRotationPoint(-186.5F, -24F, 26.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 167
		bodyModel[81].setRotationPoint(-186.5F, -22F, -27.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 168
		bodyModel[82].setRotationPoint(-186.5F, -24F, -27.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 169
		bodyModel[83].setRotationPoint(-186.5F, -14F, 26.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 170
		bodyModel[84].setRotationPoint(-186.5F, -14F, -27.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 171
		bodyModel[85].setRotationPoint(-186.5F, -16F, 26.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 172
		bodyModel[86].setRotationPoint(-186.5F, -18F, 26.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 173
		bodyModel[87].setRotationPoint(-186.5F, -16F, -27.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 174
		bodyModel[88].setRotationPoint(-186.5F, -18F, -27.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 177
		bodyModel[89].setRotationPoint(-186.5F, -10F, 26.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 178
		bodyModel[90].setRotationPoint(-186.5F, -12F, 26.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 179
		bodyModel[91].setRotationPoint(-186.5F, -10F, -27.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 180
		bodyModel[92].setRotationPoint(-186.5F, -12F, -27.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 281, 28, 39, 0F); // Box 193
		bodyModel[93].setRotationPoint(-186F, -63F, -67.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 20, 28, 39, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[94].setRotationPoint(95F, -63F, -67.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 13, 17, 39, 0F,0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[95].setRotationPoint(115F, -52F, -67.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 15, 18, 0F); // Box 196
		bodyModel[96].setRotationPoint(124F, -35F, -67.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 15, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F); // Box 197
		bodyModel[97].setRotationPoint(124F, -35F, -49.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 310, 15, 4, 0F); // Box 198
		bodyModel[98].setRotationPoint(-186F, -35F, -67.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 7, 55, 39, 0F,0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[99].setRotationPoint(-193F, -63F, -67.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 6, 6, 8, 0F); // Box 200
		bodyModel[100].setRotationPoint(109F, -55F, -37.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 201
		bodyModel[101].setRotationPoint(115F, -54F, -36.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 202
		bodyModel[102].setRotationPoint(115F, -54F, -32.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 20, 28, 20, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[103].setRotationPoint(96F, -63F, -61.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 20, 28, 20, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[104].setRotationPoint(96F, -63F, 41.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 20, 28, 39, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[105].setRotationPoint(95F, -63F, 28.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 281, 28, 39, 0F); // Box 227
		bodyModel[106].setRotationPoint(-186F, -63F, 28.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 6, 6, 8, 0F); // Box 228
		bodyModel[107].setRotationPoint(109F, -55F, 29.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 229
		bodyModel[108].setRotationPoint(115F, -54F, 30.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 230
		bodyModel[109].setRotationPoint(115F, -54F, 34.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 13, 17, 39, 0F,0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[110].setRotationPoint(115F, -52F, 28.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 15, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[111].setRotationPoint(124F, -35F, 28.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 15, 18, 0F); // Box 233
		bodyModel[112].setRotationPoint(124F, -35F, 49.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 310, 15, 4, 0F); // Box 234
		bodyModel[113].setRotationPoint(-186F, -35F, 63.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 55, 39, 0F,0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[114].setRotationPoint(-193F, -63F, 28.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 307, 6, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[115].setRotationPoint(-186F, -15F, -28.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 319, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[116].setRotationPoint(-192F, -20F, 63.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 319, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[117].setRotationPoint(-192F, -20F, -67.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 521
		bodyModel[118].setRotationPoint(59F, -11F, -68.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 55, 1, 0F); // Box 522
		bodyModel[119].setRotationPoint(58F, -63F, -68.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 55, 1, 0F); // Box 523
		bodyModel[120].setRotationPoint(64F, -63F, -68.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 524
		bodyModel[121].setRotationPoint(59F, -14F, -68.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 525
		bodyModel[122].setRotationPoint(59F, -17F, -68.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 526
		bodyModel[123].setRotationPoint(59F, -20F, -68.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 527
		bodyModel[124].setRotationPoint(59F, -23F, -68.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 528
		bodyModel[125].setRotationPoint(59F, -26F, -68.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 529
		bodyModel[126].setRotationPoint(59F, -29F, -68.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 530
		bodyModel[127].setRotationPoint(59F, -32F, -68.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 531
		bodyModel[128].setRotationPoint(59F, -35F, -68.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 532
		bodyModel[129].setRotationPoint(59F, -38F, -68.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 533
		bodyModel[130].setRotationPoint(59F, -41F, -68.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 534
		bodyModel[131].setRotationPoint(59F, -44F, -68.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 535
		bodyModel[132].setRotationPoint(59F, -47F, -68.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 536
		bodyModel[133].setRotationPoint(59F, -50F, -68.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 537
		bodyModel[134].setRotationPoint(59F, -53F, -68.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 538
		bodyModel[135].setRotationPoint(59F, -56F, -68.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 539
		bodyModel[136].setRotationPoint(59F, -59F, -68.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 540
		bodyModel[137].setRotationPoint(59F, -62F, -68.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 541
		bodyModel[138].setRotationPoint(59F, -11F, 67.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 55, 1, 0F); // Box 542
		bodyModel[139].setRotationPoint(58F, -63F, 67.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 55, 1, 0F); // Box 543
		bodyModel[140].setRotationPoint(64F, -63F, 67.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 544
		bodyModel[141].setRotationPoint(59F, -14F, 67.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 545
		bodyModel[142].setRotationPoint(59F, -17F, 67.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 546
		bodyModel[143].setRotationPoint(59F, -20F, 67.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 547
		bodyModel[144].setRotationPoint(59F, -23F, 67.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 548
		bodyModel[145].setRotationPoint(59F, -26F, 67.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 549
		bodyModel[146].setRotationPoint(59F, -29F, 67.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 550
		bodyModel[147].setRotationPoint(59F, -32F, 67.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 551
		bodyModel[148].setRotationPoint(59F, -35F, 67.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 552
		bodyModel[149].setRotationPoint(59F, -38F, 67.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 553
		bodyModel[150].setRotationPoint(59F, -41F, 67.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 554
		bodyModel[151].setRotationPoint(59F, -44F, 67.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 555
		bodyModel[152].setRotationPoint(59F, -47F, 67.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 556
		bodyModel[153].setRotationPoint(59F, -50F, 67.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 557
		bodyModel[154].setRotationPoint(59F, -53F, 67.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 558
		bodyModel[155].setRotationPoint(59F, -56F, 67.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 559
		bodyModel[156].setRotationPoint(59F, -59F, 67.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 560
		bodyModel[157].setRotationPoint(59F, -62F, 67.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 25, 25, 1, 0F); // Box 601
		bodyModel[158].setRotationPoint(-124F, -57F, -68F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[159].setRotationPoint(-124F, -57F, -69F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[160].setRotationPoint(-124F, -34F, -69F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[161].setRotationPoint(-124F, -55F, -69F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[162].setRotationPoint(-101F, -55F, -69F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[163].setRotationPoint(-122F, -54F, -69F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[164].setRotationPoint(-122F, -52F, -69F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[165].setRotationPoint(-122F, -50F, -69F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[166].setRotationPoint(-122F, -48F, -69F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[167].setRotationPoint(-122F, -46F, -69F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 611
		bodyModel[168].setRotationPoint(-122F, -44F, -69F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		bodyModel[169].setRotationPoint(-122F, -42F, -69F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		bodyModel[170].setRotationPoint(-122F, -40F, -69F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		bodyModel[171].setRotationPoint(-122F, -38F, -69F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[172].setRotationPoint(-122F, -36F, -69F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 616
		bodyModel[173].setRotationPoint(-122F, -36F, 68F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 617
		bodyModel[174].setRotationPoint(-122F, -38F, 68F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 618
		bodyModel[175].setRotationPoint(-122F, -40F, 68F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 619
		bodyModel[176].setRotationPoint(-122F, -42F, 68F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 620
		bodyModel[177].setRotationPoint(-122F, -44F, 68F);

		bodyModel[178].addBox(0F, 0F, 0F, 25, 25, 1, 0F); // Box 621
		bodyModel[178].setRotationPoint(-124F, -57F, 67F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 622
		bodyModel[179].setRotationPoint(-122F, -46F, 68F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 623
		bodyModel[180].setRotationPoint(-122F, -48F, 68F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 624
		bodyModel[181].setRotationPoint(-122F, -50F, 68F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 625
		bodyModel[182].setRotationPoint(-122F, -52F, 68F);

		bodyModel[183].addBox(0F, 0F, 0F, 25, 25, 1, 0F); // Box 626
		bodyModel[183].setRotationPoint(-124F, -57F, 67F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 627
		bodyModel[184].setRotationPoint(-122F, -54F, 68F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 628
		bodyModel[185].setRotationPoint(-124F, -57F, 68F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 629
		bodyModel[186].setRotationPoint(-124F, -55F, 68F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 630
		bodyModel[187].setRotationPoint(-101F, -55F, 68F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 25, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 631
		bodyModel[188].setRotationPoint(-124F, -34F, 68F);

		bodyModel[189].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 632
		bodyModel[189].setRotationPoint(-29F, -51F, -68.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 633
		bodyModel[190].setRotationPoint(-29F, -49F, -68.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 634
		bodyModel[191].setRotationPoint(-29F, -47F, -68.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		bodyModel[192].setRotationPoint(-28F, -52F, -68.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyModel[193].setRotationPoint(-18F, -52F, -68.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		bodyModel[194].setRotationPoint(-8F, -52F, -68.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		bodyModel[195].setRotationPoint(2F, -52F, -68.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		bodyModel[196].setRotationPoint(12F, -52F, -68.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[197].setRotationPoint(22F, -52F, -68.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[198].setRotationPoint(32F, -52F, -68.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[199].setRotationPoint(42F, -52F, -68.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 643
		bodyModel[200].setRotationPoint(-29F, -51F, 67.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 644
		bodyModel[201].setRotationPoint(-29F, -49F, 67.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 645
		bodyModel[202].setRotationPoint(-29F, -47F, 67.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 646
		bodyModel[203].setRotationPoint(-28F, -52F, 67.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 647
		bodyModel[204].setRotationPoint(-18F, -52F, 67.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 648
		bodyModel[205].setRotationPoint(-8F, -52F, 67.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 649
		bodyModel[206].setRotationPoint(2F, -52F, 67.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 650
		bodyModel[207].setRotationPoint(12F, -52F, 67.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 651
		bodyModel[208].setRotationPoint(22F, -52F, 67.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 652
		bodyModel[209].setRotationPoint(32F, -52F, 67.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 653
		bodyModel[210].setRotationPoint(42F, -52F, 67.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 688
		bodyModel[211].setRotationPoint(-29F, -19F, -68.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 689
		bodyModel[212].setRotationPoint(-29F, -17F, -68.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 690
		bodyModel[213].setRotationPoint(-29F, -21F, -68.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[214].setRotationPoint(-28F, -22F, -68.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		bodyModel[215].setRotationPoint(-18F, -22F, -68.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		bodyModel[216].setRotationPoint(-8F, -22F, -68.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		bodyModel[217].setRotationPoint(2F, -22F, -68.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[218].setRotationPoint(12F, -22F, -68.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		bodyModel[219].setRotationPoint(22F, -22F, -68.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		bodyModel[220].setRotationPoint(32F, -22F, -68.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		bodyModel[221].setRotationPoint(42F, -22F, -68.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 699
		bodyModel[222].setRotationPoint(-29F, -19F, 67.5F);

		bodyModel[223].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 700
		bodyModel[223].setRotationPoint(-29F, -17F, 67.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 77, 1, 1, 0F); // Box 701
		bodyModel[224].setRotationPoint(-29F, -21F, 67.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 702
		bodyModel[225].setRotationPoint(-28F, -22F, 67.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 703
		bodyModel[226].setRotationPoint(-18F, -22F, 67.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 704
		bodyModel[227].setRotationPoint(-8F, -22F, 67.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 705
		bodyModel[228].setRotationPoint(2F, -22F, 67.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 706
		bodyModel[229].setRotationPoint(12F, -22F, 67.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 707
		bodyModel[230].setRotationPoint(22F, -22F, 67.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 708
		bodyModel[231].setRotationPoint(32F, -22F, 67.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 709
		bodyModel[232].setRotationPoint(42F, -22F, 67.5F);

		bodyModel[233].addBox(0F, 16F, 0F, 3, 14, 3, 0F); // Box 712
		bodyModel[233].setRotationPoint(-189F, -57F, -21.5F);

		bodyModel[234].addBox(0F, 16F, 0F, 3, 14, 3, 0F); // Box 713
		bodyModel[234].setRotationPoint(-189F, -57F, -14.5F);

		bodyModel[235].addBox(0F, 16F, 0F, 2, 2, 15, 0F); // Box 714
		bodyModel[235].setRotationPoint(-188F, -43F, -23.5F);

		bodyModel[236].addShapeBox(0F, 16F, 0F, 2, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 715
		bodyModel[236].setRotationPoint(-190F, -43F, -23.5F);

		bodyModel[237].addBox(0F, 16F, 0F, 3, 14, 3, 0F); // Box 716
		bodyModel[237].setRotationPoint(-189F, -57F, 11.5F);

		bodyModel[238].addBox(0F, 16F, 0F, 3, 14, 3, 0F); // Box 717
		bodyModel[238].setRotationPoint(-189F, -57F, 18.5F);

		bodyModel[239].addBox(0F, 16F, 0F, 2, 2, 15, 0F); // Box 718
		bodyModel[239].setRotationPoint(-188F, -43F, 8.5F);

		bodyModel[240].addShapeBox(0F, 16F, 0F, 2, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 719
		bodyModel[240].setRotationPoint(-190F, -43F, 8.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 20, 25, 0F,8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[241].setRotationPoint(70F, -81F, 13.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 20, 11, 0F,8F, 0F, 0F, -8F, 0F, 0F, -16F, -2F, -2F, 16F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 530
		bodyModel[242].setRotationPoint(70F, -81F, 38.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 20, 25, 0F,8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[243].setRotationPoint(70F, -81F, -38.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 16, 14, 0F,8F, 0F, 0F, -8F, 0F, 0F, -14F, -6F, -4F, 14F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, -14F, 0F, 0F, 14F, 0F, -1F); // Box 534
		bodyModel[244].setRotationPoint(62F, -79F, 47.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, -5F, 4F, 2F, 0F, 6F, 2F, -2F, 0F, 0F, 5F, 0F, 0F, -8F, 4F, 0F, -3F, 6F, 0F, 2F, 0F, 0F, 8F); // Box 535
		bodyModel[245].setRotationPoint(42F, -71F, 57.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 228, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 536
		bodyModel[246].setRotationPoint(-186F, -71F, 62.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 20, 11, 0F,16F, -2F, -2F, -16F, -2F, -2F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[247].setRotationPoint(70F, -81F, -49.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 16, 14, 0F,14F, -6F, -4F, -14F, -6F, -4F, -8F, 0F, 0F, 8F, 0F, 0F, 14F, 0F, -1F, -14F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 542
		bodyModel[248].setRotationPoint(62F, -79F, -61.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 5F, 6F, 2F, -2F, 4F, 2F, 0F, 0F, 0F, -5F, 0F, 0F, 8F, 6F, 0F, 2F, 4F, 0F, -3F, 0F, 0F, -8F); // Box 543
		bodyModel[249].setRotationPoint(42F, -71F, -59.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 228, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 544
		bodyModel[250].setRotationPoint(-186F, -71F, -64.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 10, 42, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, 1F, 0F, -6F, 1F, 0F, 8F, 1F, 0F, 8F); // Box 407
		bodyModel[251].setRotationPoint(-136F, -105F, 57.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 42, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 408
		bodyModel[252].setRotationPoint(-132F, -105F, 50.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[253].setRotationPoint(-136F, -113F, 51.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 10, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 410
		bodyModel[254].setRotationPoint(-136F, -113F, 57.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 10, 10, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[255].setRotationPoint(-136F, -113F, 48.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -8F, -4F, 0F, -8F, -4F, 0F, 8F, 4F, 0F, 8F); // Box 412
		bodyModel[256].setRotationPoint(-132F, -103F, 51.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, 4F, 0F, -8F, 4F, 0F, 8F, -4F, 0F, 8F); // Box 413
		bodyModel[257].setRotationPoint(-131F, -103F, 51.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, -6F, -4F, 0F, -6F); // Box 414
		bodyModel[258].setRotationPoint(-136F, -94F, 59.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 9F, 4F, 0F, 9F); // Box 415
		bodyModel[259].setRotationPoint(-132F, -84F, 53.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, -6F, -4F, 0F, -6F); // Box 416
		bodyModel[260].setRotationPoint(-136F, -74F, 62.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, 4F, 0F, -6F); // Box 417
		bodyModel[261].setRotationPoint(-127F, -74F, 62.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, 4F, 0F, -9F, 4F, 0F, 9F, -4F, 0F, 9F); // Box 418
		bodyModel[262].setRotationPoint(-131F, -84F, 53.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, 4F, 0F, -6F); // Box 419
		bodyModel[263].setRotationPoint(-127F, -94F, 59.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 1, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[264].setRotationPoint(-133F, -111F, 10.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[265].setRotationPoint(-132F, -107F, 10.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 422
		bodyModel[266].setRotationPoint(-134F, -111F, 11.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[267].setRotationPoint(-134F, -111F, 7.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[268].setRotationPoint(-134F, -111F, 6.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 425
		bodyModel[269].setRotationPoint(-131.5F, -107F, 11.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[270].setRotationPoint(-131.5F, -107F, 16.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 427
		bodyModel[271].setRotationPoint(-131.5F, -107F, 21.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 428
		bodyModel[272].setRotationPoint(-131.5F, -107F, 41.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[273].setRotationPoint(-131.5F, -107F, 36.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 430
		bodyModel[274].setRotationPoint(-131.5F, -107F, 31.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[275].setRotationPoint(-131.5F, -107F, 26.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 10, 42, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 8F, 1F, 0F, 8F, 1F, 0F, -6F, 1F, 0F, -6F); // Box 432
		bodyModel[276].setRotationPoint(-151F, -105F, -59.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 42, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 433
		bodyModel[277].setRotationPoint(-147F, -105F, -51.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 10, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[278].setRotationPoint(-151F, -113F, -57.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 10, 10, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[279].setRotationPoint(-151F, -113F, -60.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 10, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 436
		bodyModel[280].setRotationPoint(-151F, -113F, -51.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 8F, -4F, 0F, 8F, -4F, 0F, -8F, 4F, 0F, -8F); // Box 437
		bodyModel[281].setRotationPoint(-147F, -103F, -52.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 8F, 4F, 0F, 8F, 4F, 0F, -8F, -4F, 0F, -8F); // Box 438
		bodyModel[282].setRotationPoint(-146F, -103F, -52.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, 4F, 0F, -6F, 4F, 0F, 6F, -4F, 0F, 6F); // Box 439
		bodyModel[283].setRotationPoint(-151F, -94F, -60.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 9F, -4F, 0F, 9F, -4F, 0F, -9F, 4F, 0F, -9F); // Box 440
		bodyModel[284].setRotationPoint(-147F, -84F, -54.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, 4F, 0F, -6F, 4F, 0F, 6F, -4F, 0F, 6F); // Box 441
		bodyModel[285].setRotationPoint(-151F, -74F, -63.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 6F, 4F, 0F, 6F); // Box 442
		bodyModel[286].setRotationPoint(-142F, -74F, -63.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 9F, 4F, 0F, 9F, 4F, 0F, -9F, -4F, 0F, -9F); // Box 443
		bodyModel[287].setRotationPoint(-146F, -84F, -54.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 6F, 4F, 0F, 6F); // Box 444
		bodyModel[288].setRotationPoint(-142F, -94F, -60.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 1, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[289].setRotationPoint(-148F, -111F, -51.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[290].setRotationPoint(-147F, -107F, -51.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[291].setRotationPoint(-149F, -111F, -12.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[292].setRotationPoint(-149F, -111F, -11.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 449
		bodyModel[293].setRotationPoint(-149F, -111F, -7.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[294].setRotationPoint(-146.5F, -107F, -17.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 451
		bodyModel[295].setRotationPoint(-146.5F, -107F, -22.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[296].setRotationPoint(-146.5F, -107F, -27.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[297].setRotationPoint(-146.5F, -107F, -47.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 454
		bodyModel[298].setRotationPoint(-146.5F, -107F, -42.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[299].setRotationPoint(-146.5F, -107F, -37.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 456
		bodyModel[300].setRotationPoint(-146.5F, -107F, -32.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 20, 10, 0F,8F, 0F, 0F, -8F, 0F, 0F, -3F, -15F, 0F, 3F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[301].setRotationPoint(70F, -81F, -13.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 20, 10, 0F,3F, -15F, 0F, -3F, -15F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[302].setRotationPoint(70F, -81F, 3.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 460
		bodyModel[303].setRotationPoint(67F, -66F, -3.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 14, 7, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[304].setRotationPoint(-186F, -68F, 21.5F);

		bodyModel[305].addBox(0F, 0F, 0F, 7, 3, 41, 0F); // Box 497
		bodyModel[305].setRotationPoint(-182.5F, -65F, 24.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 7, 2, 41, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[306].setRotationPoint(-182.5F, -67F, 24.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 7, 2, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 499
		bodyModel[307].setRotationPoint(-182.5F, -62F, 24.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 7, 2, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 500
		bodyModel[308].setRotationPoint(-182.5F, -62F, -21.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 7, 2, 43, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[309].setRotationPoint(-182.5F, -67F, -21.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 7, 3, 43, 0F); // Box 502
		bodyModel[310].setRotationPoint(-182.5F, -65F, -21.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 14, 7, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[311].setRotationPoint(-186F, -68F, -24.5F);

		bodyModel[312].addBox(0F, 0F, 0F, 7, 3, 41, 0F); // Box 504
		bodyModel[312].setRotationPoint(-182.5F, -65F, -65.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 7, 2, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 505
		bodyModel[313].setRotationPoint(-182.5F, -62F, -65.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 7, 2, 41, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[314].setRotationPoint(-182.5F, -67F, -65.5F);

		bodyModel[315].addBox(0F, 0F, 0F, 186, 17, 58, 0F); // Box 509
		bodyModel[315].setRotationPoint(-92F, -61F, -28.5F);

		bodyModel[316].addBox(0F, 0F, 0F, 27, 17, 16, 0F); // Box 515
		bodyModel[316].setRotationPoint(-119F, -61F, -28.5F);

		bodyModel[317].addBox(0F, 0F, 0F, 27, 17, 16, 0F); // Box 516
		bodyModel[317].setRotationPoint(-119F, -61F, 12.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 425, 465, textureX, textureY); // Box 491
		turretModel[1] = new ModelRendererTurbo(this, 969, 465, textureX, textureY); // Box 492
		turretModel[2] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 493
		turretModel[3] = new ModelRendererTurbo(this, 1, 473, textureX, textureY); // Box 495
		turretModel[4] = new ModelRendererTurbo(this, 1425, 433, textureX, textureY); // Box 507
		turretModel[5] = new ModelRendererTurbo(this, 417, 497, textureX, textureY); // Box 517
		turretModel[6] = new ModelRendererTurbo(this, 1, 521, textureX, textureY); // Box 518

		turretModel[0].addShapeBox(-6F, -5F, -13.5F, 52, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		turretModel[0].setRotationPoint(-75F, -58F, 0F);

		turretModel[1].addShapeBox(-15F, -13F, -13.5F, 61, 10, 2, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		turretModel[1].setRotationPoint(-75F, -58F, 0F);

		turretModel[2].addShapeBox(0F, -20F, -13.5F, 31, 7, 2, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		turretModel[2].setRotationPoint(-75F, -58F, 0F);

		turretModel[3].addShapeBox(-15F, -13F, 11.5F, 61, 10, 2, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		turretModel[3].setRotationPoint(-75F, -58F, 0F);

		turretModel[4].addShapeBox(0F, -20F, 11.5F, 31, 7, 2, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		turretModel[4].setRotationPoint(-75F, -58F, 0F);

		turretModel[5].addShapeBox(-13F, -14F, -21.5F, 130, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		turretModel[5].setRotationPoint(-75F, -58F, 0F);

		turretModel[6].addShapeBox(-13F, -14F, 21.5F, 130, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		turretModel[6].setRotationPoint(-75F, -58F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 825, 433, textureX, textureY); // Box 462
		barrelModel[1] = new ModelRendererTurbo(this, 1201, 433, textureX, textureY); // Box 473
		barrelModel[2] = new ModelRendererTurbo(this, 1313, 433, textureX, textureY); // Box 474
		barrelModel[3] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 475
		barrelModel[4] = new ModelRendererTurbo(this, 1577, 433, textureX, textureY); // Box 476
		barrelModel[5] = new ModelRendererTurbo(this, 73, 449, textureX, textureY); // Box 478
		barrelModel[6] = new ModelRendererTurbo(this, 185, 449, textureX, textureY); // Box 479
		barrelModel[7] = new ModelRendererTurbo(this, 1201, 465, textureX, textureY); // Box 480
		barrelModel[8] = new ModelRendererTurbo(this, 1481, 465, textureX, textureY); // Box 481
		barrelModel[9] = new ModelRendererTurbo(this, 449, 449, textureX, textureY); // Box 482
		barrelModel[10] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 484
		barrelModel[11] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 485
		barrelModel[12] = new ModelRendererTurbo(this, 969, 449, textureX, textureY); // Box 486
		barrelModel[13] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 487
		barrelModel[14] = new ModelRendererTurbo(this, 161, 353, textureX, textureY); // Box 488
		barrelModel[15] = new ModelRendererTurbo(this, 1425, 449, textureX, textureY); // Box 489
		barrelModel[16] = new ModelRendererTurbo(this, 305, 353, textureX, textureY); // Box 490
		barrelModel[17] = new ModelRendererTurbo(this, 1889, 201, textureX, textureY); // Box 508
		barrelModel[18] = new ModelRendererTurbo(this, 1161, 57, textureX, textureY); // Box 510
		barrelModel[19] = new ModelRendererTurbo(this, 1889, 97, textureX, textureY); // Box 512
		barrelModel[20] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 513
		barrelModel[21] = new ModelRendererTurbo(this, 1625, 129, textureX, textureY); // Box 514

		barrelModel[0].addShapeBox(-25F, -31F, -5.5F, 48, 21, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		barrelModel[0].setRotationPoint(-65F, -55F, 0F);

		barrelModel[1].addShapeBox(-25F, -31F, 5.5F, 48, 21, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 473
		barrelModel[1].setRotationPoint(-65F, -55F, 0F);

		barrelModel[2].addShapeBox(-25F, -31F, -11.5F, 48, 21, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		barrelModel[2].setRotationPoint(-65F, -55F, 0F);

		barrelModel[3].addShapeBox(23F, -29F, -9.5F, 48, 17, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		barrelModel[3].setRotationPoint(-65F, -55F, 0F);

		barrelModel[4].addShapeBox(23F, -29F, -5.5F, 48, 17, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		barrelModel[4].setRotationPoint(-65F, -55F, 0F);

		barrelModel[5].addShapeBox(23F, -29F, 5.5F, 48, 17, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 478
		barrelModel[5].setRotationPoint(-65F, -55F, 0F);

		barrelModel[6].addShapeBox(71F, -28F, -7.5F, 127, 15, 3, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		barrelModel[6].setRotationPoint(-65F, -55F, 0F);

		barrelModel[7].addShapeBox(71F, -28F, -4.5F, 127, 15, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		barrelModel[7].setRotationPoint(-65F, -55F, 0F);

		barrelModel[8].addShapeBox(71F, -28F, 4.5F, 127, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 481
		barrelModel[8].setRotationPoint(-65F, -55F, 0F);

		barrelModel[9].addShapeBox(198F, -28F, -4.5F, 65, 1, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 482
		barrelModel[9].setRotationPoint(-65F, -55F, 0F);

		barrelModel[10].addShapeBox(198F, -28F, 4.5F, 65, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, -2F, 0F, 3F, -2F); // Box 484
		barrelModel[10].setRotationPoint(-65F, -55F, 0F);

		barrelModel[11].addShapeBox(198F, -24F, -7.5F, 65, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 485
		barrelModel[11].setRotationPoint(-65F, -55F, 0F);

		barrelModel[12].addShapeBox(198F, -24F, 6.5F, 65, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 486
		barrelModel[12].setRotationPoint(-65F, -55F, 0F);

		barrelModel[13].addShapeBox(198F, -28F, -7.5F, 65, 1, 3, 0F,0F, -4F, 0F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 487
		barrelModel[13].setRotationPoint(-65F, -55F, 0F);

		barrelModel[14].addShapeBox(198F, -14F, -7.5F, 65, 1, 3, 0F,0F, 3F, -2F, 0F, 3F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 488
		barrelModel[14].setRotationPoint(-65F, -55F, 0F);

		barrelModel[15].addShapeBox(198F, -14F, -4.5F, 65, 1, 9, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 489
		barrelModel[15].setRotationPoint(-65F, -55F, 0F);

		barrelModel[16].addShapeBox(198F, -14F, 4.5F, 65, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -1F, 0F, -4F, 0F); // Box 490
		barrelModel[16].setRotationPoint(-65F, -55F, 0F);

		barrelModel[17].addShapeBox(-40F, -12F, -5.5F, 15, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		barrelModel[17].setRotationPoint(-65F, -55F, 0F);

		barrelModel[18].addShapeBox(-40F, -20F, 9.5F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		barrelModel[18].setRotationPoint(-65F, -55F, 0F);

		barrelModel[19].addShapeBox(-40F, -20F, -11.5F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		barrelModel[19].setRotationPoint(-65F, -55F, 0F);

		barrelModel[20].addShapeBox(-40F, -16F, -11.5F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -6F, 0F, 2F, -6F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 513
		barrelModel[20].setRotationPoint(-65F, -55F, 0F);

		barrelModel[21].addShapeBox(-40F, -16F, 9.5F, 15, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, -6F, 0F, 2F, -6F); // Box 514
		barrelModel[21].setRotationPoint(-65F, -55F, 0F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1665, 97, textureX, textureY); // Box 293
		leftTrackModel[1] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 294
		leftTrackModel[2] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 295
		leftTrackModel[3] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 296
		leftTrackModel[4] = new ModelRendererTurbo(this, 1713, 129, textureX, textureY); // Box 297
		leftTrackModel[5] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 298
		leftTrackModel[6] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 299
		leftTrackModel[7] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Box 300
		leftTrackModel[8] = new ModelRendererTurbo(this, 1097, 17, textureX, textureY); // Box 301
		leftTrackModel[9] = new ModelRendererTurbo(this, 1121, 17, textureX, textureY); // Box 302
		leftTrackModel[10] = new ModelRendererTurbo(this, 1145, 17, textureX, textureY); // Box 303
		leftTrackModel[11] = new ModelRendererTurbo(this, 1801, 129, textureX, textureY); // Box 304
		leftTrackModel[12] = new ModelRendererTurbo(this, 1961, 129, textureX, textureY); // Box 305
		leftTrackModel[13] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 306
		leftTrackModel[14] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 307
		leftTrackModel[15] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 308
		leftTrackModel[16] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 309
		leftTrackModel[17] = new ModelRendererTurbo(this, 1169, 17, textureX, textureY); // Box 310
		leftTrackModel[18] = new ModelRendererTurbo(this, 2025, 49, textureX, textureY); // Box 311
		leftTrackModel[19] = new ModelRendererTurbo(this, 1945, 65, textureX, textureY); // Box 312
		leftTrackModel[20] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 313
		leftTrackModel[21] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 341
		leftTrackModel[22] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 342
		leftTrackModel[23] = new ModelRendererTurbo(this, 1969, 65, textureX, textureY); // Box 343
		leftTrackModel[24] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 344
		leftTrackModel[25] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 345
		leftTrackModel[26] = new ModelRendererTurbo(this, 1529, 97, textureX, textureY); // Box 346
		leftTrackModel[27] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 347
		leftTrackModel[28] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 348
		leftTrackModel[29] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 349
		leftTrackModel[30] = new ModelRendererTurbo(this, 1625, 97, textureX, textureY); // Box 350
		leftTrackModel[31] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 351
		leftTrackModel[32] = new ModelRendererTurbo(this, 681, 137, textureX, textureY); // Box 352
		leftTrackModel[33] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 353
		leftTrackModel[34] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 354
		leftTrackModel[35] = new ModelRendererTurbo(this, 1761, 129, textureX, textureY); // Box 355
		leftTrackModel[36] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 356
		leftTrackModel[37] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 357
		leftTrackModel[38] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 358
		leftTrackModel[39] = new ModelRendererTurbo(this, 529, 185, textureX, textureY); // Box 359
		leftTrackModel[40] = new ModelRendererTurbo(this, 769, 233, textureX, textureY); // Box 360
		leftTrackModel[41] = new ModelRendererTurbo(this, 849, 233, textureX, textureY); // Box 361
		leftTrackModel[42] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 362
		leftTrackModel[43] = new ModelRendererTurbo(this, 1017, 233, textureX, textureY); // Box 363
		leftTrackModel[44] = new ModelRendererTurbo(this, 1105, 233, textureX, textureY); // Box 364
		leftTrackModel[45] = new ModelRendererTurbo(this, 1193, 233, textureX, textureY); // Box 365
		leftTrackModel[46] = new ModelRendererTurbo(this, 1249, 241, textureX, textureY); // Box 366
		leftTrackModel[47] = new ModelRendererTurbo(this, 1329, 241, textureX, textureY); // Box 367
		leftTrackModel[48] = new ModelRendererTurbo(this, 1417, 241, textureX, textureY); // Box 368
		leftTrackModel[49] = new ModelRendererTurbo(this, 1505, 241, textureX, textureY); // Box 369
		leftTrackModel[50] = new ModelRendererTurbo(this, 1593, 241, textureX, textureY); // Box 370
		leftTrackModel[51] = new ModelRendererTurbo(this, 1673, 241, textureX, textureY); // Box 371
		leftTrackModel[52] = new ModelRendererTurbo(this, 1753, 241, textureX, textureY); // Box 372
		leftTrackModel[53] = new ModelRendererTurbo(this, 1841, 241, textureX, textureY); // Box 373
		leftTrackModel[54] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Box 374
		leftTrackModel[55] = new ModelRendererTurbo(this, 745, 265, textureX, textureY); // Box 375
		leftTrackModel[56] = new ModelRendererTurbo(this, 825, 265, textureX, textureY); // Box 376
		leftTrackModel[57] = new ModelRendererTurbo(this, 905, 265, textureX, textureY); // Box 377
		leftTrackModel[58] = new ModelRendererTurbo(this, 993, 265, textureX, textureY); // Box 378
		leftTrackModel[59] = new ModelRendererTurbo(this, 1081, 265, textureX, textureY); // Box 379
		leftTrackModel[60] = new ModelRendererTurbo(this, 1169, 265, textureX, textureY); // Box 380
		leftTrackModel[61] = new ModelRendererTurbo(this, 1225, 273, textureX, textureY); // Box 381
		leftTrackModel[62] = new ModelRendererTurbo(this, 1305, 273, textureX, textureY); // Box 382
		leftTrackModel[63] = new ModelRendererTurbo(this, 1393, 273, textureX, textureY); // Box 383
		leftTrackModel[64] = new ModelRendererTurbo(this, 1481, 273, textureX, textureY); // Box 384
		leftTrackModel[65] = new ModelRendererTurbo(this, 1569, 273, textureX, textureY); // Box 385
		leftTrackModel[66] = new ModelRendererTurbo(this, 1649, 273, textureX, textureY); // Box 386
		leftTrackModel[67] = new ModelRendererTurbo(this, 1729, 273, textureX, textureY); // Box 387
		leftTrackModel[68] = new ModelRendererTurbo(this, 1817, 273, textureX, textureY); // Box 388
		leftTrackModel[69] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Box 389
		leftTrackModel[70] = new ModelRendererTurbo(this, 1881, 281, textureX, textureY); // Box 390
		leftTrackModel[71] = new ModelRendererTurbo(this, 833, 361, textureX, textureY); // Box 509
		leftTrackModel[72] = new ModelRendererTurbo(this, 1017, 361, textureX, textureY); // Box 510
		leftTrackModel[73] = new ModelRendererTurbo(this, 1081, 369, textureX, textureY); // Box 511
		leftTrackModel[74] = new ModelRendererTurbo(this, 1201, 369, textureX, textureY); // Box 512
		leftTrackModel[75] = new ModelRendererTurbo(this, 1289, 369, textureX, textureY); // Box 513
		leftTrackModel[76] = new ModelRendererTurbo(this, 1369, 369, textureX, textureY); // Box 514
		leftTrackModel[77] = new ModelRendererTurbo(this, 1449, 369, textureX, textureY); // Box 515
		leftTrackModel[78] = new ModelRendererTurbo(this, 1537, 369, textureX, textureY); // Box 516
		leftTrackModel[79] = new ModelRendererTurbo(this, 1625, 369, textureX, textureY); // Box 517
		leftTrackModel[80] = new ModelRendererTurbo(this, 849, 401, textureX, textureY); // Box 518
		leftTrackModel[81] = new ModelRendererTurbo(this, 1057, 401, textureX, textureY); // Box 519
		leftTrackModel[82] = new ModelRendererTurbo(this, 1201, 401, textureX, textureY); // Box 520
		leftTrackModel[83] = new ModelRendererTurbo(this, 1289, 401, textureX, textureY); // Box 521
		leftTrackModel[84] = new ModelRendererTurbo(this, 1377, 401, textureX, textureY); // Box 522
		leftTrackModel[85] = new ModelRendererTurbo(this, 1465, 401, textureX, textureY); // Box 523
		leftTrackModel[86] = new ModelRendererTurbo(this, 1545, 401, textureX, textureY); // Box 524
		leftTrackModel[87] = new ModelRendererTurbo(this, 1625, 401, textureX, textureY); // Box 525
		leftTrackModel[88] = new ModelRendererTurbo(this, 1833, 409, textureX, textureY); // Box 526
		leftTrackModel[89] = new ModelRendererTurbo(this, 73, 417, textureX, textureY); // Box 527
		leftTrackModel[90] = new ModelRendererTurbo(this, 161, 417, textureX, textureY); // Box 528

		leftTrackModel[0].addBox(-2F, 0F, 0F, 5, 26, 35, 0F); // Box 293
		leftTrackModel[0].setRotationPoint(119F, -35F, 28.5F);

		leftTrackModel[1].addBox(3F, 0F, 0F, 1, 26, 10, 0F); // Box 294
		leftTrackModel[1].setRotationPoint(119F, -35F, 30.5F);

		leftTrackModel[2].addBox(3F, 0F, 0F, 1, 26, 10, 0F); // Box 295
		leftTrackModel[2].setRotationPoint(119F, -35F, 41F);

		leftTrackModel[3].addBox(3F, 0F, 0F, 1, 26, 10, 0F); // Box 296
		leftTrackModel[3].setRotationPoint(119F, -35F, 51.5F);

		leftTrackModel[4].addShapeBox(-6F, 1F, 0F, 5, 25, 35, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 297
		leftTrackModel[4].setRotationPoint(123F, -9F, 28.5F);
		leftTrackModel[4].rotateAngleZ = -0.80285146F;

		leftTrackModel[5].addBox(-1F, 0F, 0F, 1, 26, 10, 0F); // Box 298
		leftTrackModel[5].setRotationPoint(123F, -9F, 30.5F);
		leftTrackModel[5].rotateAngleZ = -0.80285146F;

		leftTrackModel[6].addBox(-1F, 0F, 0F, 1, 26, 10, 0F); // Box 299
		leftTrackModel[6].setRotationPoint(123F, -9F, 41F);
		leftTrackModel[6].rotateAngleZ = -0.80285146F;

		leftTrackModel[7].addBox(-1F, 0F, 0F, 1, 26, 10, 0F); // Box 300
		leftTrackModel[7].setRotationPoint(123F, -9F, 51.5F);
		leftTrackModel[7].rotateAngleZ = -0.80285146F;

		leftTrackModel[8].addBox(-3F, 0F, 0F, 1, 26, 10, 0F); // Box 301
		leftTrackModel[8].setRotationPoint(-180F, -35F, 41F);

		leftTrackModel[9].addBox(-3F, 0F, 0F, 1, 26, 10, 0F); // Box 302
		leftTrackModel[9].setRotationPoint(-180F, -35F, 30.5F);

		leftTrackModel[10].addBox(-3F, 0F, 0F, 1, 26, 10, 0F); // Box 303
		leftTrackModel[10].setRotationPoint(-180F, -35F, 51.5F);

		leftTrackModel[11].addBox(-2F, 0F, 0F, 5, 26, 35, 0F); // Box 304
		leftTrackModel[11].setRotationPoint(-180F, -35F, 28.5F);

		leftTrackModel[12].addBox(-6F, 1F, 0F, 5, 268, 35, 0F); // Box 305
		leftTrackModel[12].setRotationPoint(105.2F, 9F, 28.5F);
		leftTrackModel[12].rotateAngleZ = -1.57079633F;

		leftTrackModel[13].addBox(-1F, 0F, 0F, 1, 268, 10, 0F); // Box 306
		leftTrackModel[13].setRotationPoint(104.2F, 9F, 51.5F);
		leftTrackModel[13].rotateAngleZ = -1.57079633F;

		leftTrackModel[14].addBox(-1F, 0F, 0F, 1, 268, 10, 0F); // Box 307
		leftTrackModel[14].setRotationPoint(104.2F, 9F, 41F);
		leftTrackModel[14].rotateAngleZ = -1.57079633F;

		leftTrackModel[15].addBox(-1F, 0F, 0F, 1, 268, 10, 0F); // Box 308
		leftTrackModel[15].setRotationPoint(104.2F, 9F, 30.5F);
		leftTrackModel[15].rotateAngleZ = -1.57079633F;

		leftTrackModel[16].addShapeBox(1F, 1F, 0F, 5, 25, 35, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 309
		leftTrackModel[16].setRotationPoint(-184F, -9.2F, 28.5F);
		leftTrackModel[16].rotateAngleZ = 0.82030475F;

		leftTrackModel[17].addBox(0F, 1F, 0F, 1, 26, 10, 0F); // Box 310
		leftTrackModel[17].setRotationPoint(-184F, -9.2F, 51.5F);
		leftTrackModel[17].rotateAngleZ = 0.82030475F;

		leftTrackModel[18].addBox(0F, 1F, 0F, 1, 26, 10, 0F); // Box 311
		leftTrackModel[18].setRotationPoint(-184F, -9.2F, 41F);
		leftTrackModel[18].rotateAngleZ = 0.82030475F;

		leftTrackModel[19].addBox(0F, 1F, 0F, 1, 26, 10, 0F); // Box 312
		leftTrackModel[19].setRotationPoint(-184F, -9.2F, 30.5F);
		leftTrackModel[19].rotateAngleZ = 0.82030475F;

		leftTrackModel[20].addShapeBox(-2F, 0F, 0F, 300, 40, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F); // Box 313
		leftTrackModel[20].setRotationPoint(-183F, -35F, 40.5F);

		leftTrackModel[21].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 341
		leftTrackModel[21].setRotationPoint(97F, -20F, 35.5F);

		leftTrackModel[22].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftTrackModel[22].setRotationPoint(97F, -24F, 35.5F);

		leftTrackModel[23].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		leftTrackModel[23].setRotationPoint(100F, -27F, 35.5F);

		leftTrackModel[24].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 344
		leftTrackModel[24].setRotationPoint(97F, -13F, 35.5F);

		leftTrackModel[25].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 345
		leftTrackModel[25].setRotationPoint(100F, -9F, 35.5F);

		leftTrackModel[26].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 346
		leftTrackModel[26].setRotationPoint(73F, 0F, 35.5F);

		leftTrackModel[27].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 347
		leftTrackModel[27].setRotationPoint(70F, -4F, 35.5F);

		leftTrackModel[28].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 348
		leftTrackModel[28].setRotationPoint(70F, -11F, 35.5F);

		leftTrackModel[29].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftTrackModel[29].setRotationPoint(70F, -15F, 35.5F);

		leftTrackModel[30].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftTrackModel[30].setRotationPoint(73F, -18F, 35.5F);

		leftTrackModel[31].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 351
		leftTrackModel[31].setRotationPoint(19F, 0F, 35.5F);

		leftTrackModel[32].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 352
		leftTrackModel[32].setRotationPoint(16F, -4F, 35.5F);

		leftTrackModel[33].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 353
		leftTrackModel[33].setRotationPoint(16F, -11F, 35.5F);

		leftTrackModel[34].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		leftTrackModel[34].setRotationPoint(16F, -15F, 35.5F);

		leftTrackModel[35].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		leftTrackModel[35].setRotationPoint(19F, -18F, 35.5F);

		leftTrackModel[36].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		leftTrackModel[36].setRotationPoint(-7F, -18F, 35.5F);

		leftTrackModel[37].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		leftTrackModel[37].setRotationPoint(-10F, -15F, 35.5F);

		leftTrackModel[38].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 358
		leftTrackModel[38].setRotationPoint(-10F, -11F, 35.5F);

		leftTrackModel[39].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 359
		leftTrackModel[39].setRotationPoint(-10F, -4F, 35.5F);

		leftTrackModel[40].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 360
		leftTrackModel[40].setRotationPoint(-7F, 0F, 35.5F);

		leftTrackModel[41].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		leftTrackModel[41].setRotationPoint(-33F, -18F, 35.5F);

		leftTrackModel[42].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		leftTrackModel[42].setRotationPoint(-36F, -15F, 35.5F);

		leftTrackModel[43].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 363
		leftTrackModel[43].setRotationPoint(-36F, -11F, 35.5F);

		leftTrackModel[44].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 364
		leftTrackModel[44].setRotationPoint(-36F, -4F, 35.5F);

		leftTrackModel[45].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 365
		leftTrackModel[45].setRotationPoint(-33F, 0F, 35.5F);

		leftTrackModel[46].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		leftTrackModel[46].setRotationPoint(-60F, -18F, 35.5F);

		leftTrackModel[47].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		leftTrackModel[47].setRotationPoint(-63F, -15F, 35.5F);

		leftTrackModel[48].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 368
		leftTrackModel[48].setRotationPoint(-63F, -11F, 35.5F);

		leftTrackModel[49].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 369
		leftTrackModel[49].setRotationPoint(-63F, -4F, 35.5F);

		leftTrackModel[50].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 370
		leftTrackModel[50].setRotationPoint(-60F, 0F, 35.5F);

		leftTrackModel[51].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		leftTrackModel[51].setRotationPoint(-86F, -18F, 35.5F);

		leftTrackModel[52].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		leftTrackModel[52].setRotationPoint(-89F, -15F, 35.5F);

		leftTrackModel[53].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 373
		leftTrackModel[53].setRotationPoint(-89F, -11F, 35.5F);

		leftTrackModel[54].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 374
		leftTrackModel[54].setRotationPoint(-89F, -4F, 35.5F);

		leftTrackModel[55].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 375
		leftTrackModel[55].setRotationPoint(-86F, 0F, 35.5F);

		leftTrackModel[56].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		leftTrackModel[56].setRotationPoint(-112F, -18F, 35.5F);

		leftTrackModel[57].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		leftTrackModel[57].setRotationPoint(-115F, -15F, 35.5F);

		leftTrackModel[58].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 378
		leftTrackModel[58].setRotationPoint(-115F, -11F, 35.5F);

		leftTrackModel[59].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 379
		leftTrackModel[59].setRotationPoint(-115F, -4F, 35.5F);

		leftTrackModel[60].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 380
		leftTrackModel[60].setRotationPoint(-112F, 0F, 35.5F);

		leftTrackModel[61].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		leftTrackModel[61].setRotationPoint(-138F, -18F, 35.5F);

		leftTrackModel[62].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		leftTrackModel[62].setRotationPoint(-141F, -15F, 35.5F);

		leftTrackModel[63].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 383
		leftTrackModel[63].setRotationPoint(-141F, -11F, 35.5F);

		leftTrackModel[64].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 384
		leftTrackModel[64].setRotationPoint(-141F, -4F, 35.5F);

		leftTrackModel[65].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 385
		leftTrackModel[65].setRotationPoint(-138F, 0F, 35.5F);

		leftTrackModel[66].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		leftTrackModel[66].setRotationPoint(-164F, -18F, 35.5F);

		leftTrackModel[67].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		leftTrackModel[67].setRotationPoint(-167F, -15F, 35.5F);

		leftTrackModel[68].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 388
		leftTrackModel[68].setRotationPoint(-167F, -11F, 35.5F);

		leftTrackModel[69].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 389
		leftTrackModel[69].setRotationPoint(-167F, -4F, 35.5F);

		leftTrackModel[70].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 390
		leftTrackModel[70].setRotationPoint(-164F, 0F, 35.5F);

		leftTrackModel[71].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 509
		leftTrackModel[71].setRotationPoint(43F, -11F, 35.5F);

		leftTrackModel[72].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		leftTrackModel[72].setRotationPoint(43F, -15F, 35.5F);

		leftTrackModel[73].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		leftTrackModel[73].setRotationPoint(46F, -18F, 35.5F);

		leftTrackModel[74].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 512
		leftTrackModel[74].setRotationPoint(43F, -4F, 35.5F);

		leftTrackModel[75].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 513
		leftTrackModel[75].setRotationPoint(46F, 0F, 35.5F);

		leftTrackModel[76].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 514
		leftTrackModel[76].setRotationPoint(46F, 0F, -56.5F);

		leftTrackModel[77].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 515
		leftTrackModel[77].setRotationPoint(43F, -4F, -56.5F);

		leftTrackModel[78].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 516
		leftTrackModel[78].setRotationPoint(43F, -11F, -56.5F);

		leftTrackModel[79].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		leftTrackModel[79].setRotationPoint(43F, -15F, -56.5F);

		leftTrackModel[80].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		leftTrackModel[80].setRotationPoint(46F, -18F, -56.5F);

		leftTrackModel[81].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		leftTrackModel[81].setRotationPoint(73F, -18F, -56.5F);

		leftTrackModel[82].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		leftTrackModel[82].setRotationPoint(70F, -15F, -56.5F);

		leftTrackModel[83].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 521
		leftTrackModel[83].setRotationPoint(70F, -4F, -56.5F);

		leftTrackModel[84].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 522
		leftTrackModel[84].setRotationPoint(70F, -11F, -56.5F);

		leftTrackModel[85].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 523
		leftTrackModel[85].setRotationPoint(73F, 0F, -56.5F);

		leftTrackModel[86].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 524
		leftTrackModel[86].setRotationPoint(100F, -9F, -56.5F);

		leftTrackModel[87].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 525
		leftTrackModel[87].setRotationPoint(97F, -13F, -56.5F);

		leftTrackModel[88].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 526
		leftTrackModel[88].setRotationPoint(97F, -20F, -56.5F);

		leftTrackModel[89].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		leftTrackModel[89].setRotationPoint(97F, -24F, -56.5F);

		leftTrackModel[90].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		leftTrackModel[90].setRotationPoint(100F, -27F, -56.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Box 391
		rightTrackModel[1] = new ModelRendererTurbo(this, 305, 289, textureX, textureY); // Box 392
		rightTrackModel[2] = new ModelRendererTurbo(this, 393, 289, textureX, textureY); // Box 393
		rightTrackModel[3] = new ModelRendererTurbo(this, 481, 289, textureX, textureY); // Box 394
		rightTrackModel[4] = new ModelRendererTurbo(this, 569, 289, textureX, textureY); // Box 395
		rightTrackModel[5] = new ModelRendererTurbo(this, 649, 289, textureX, textureY); // Box 396
		rightTrackModel[6] = new ModelRendererTurbo(this, 73, 297, textureX, textureY); // Box 397
		rightTrackModel[7] = new ModelRendererTurbo(this, 705, 297, textureX, textureY); // Box 398
		rightTrackModel[8] = new ModelRendererTurbo(this, 793, 297, textureX, textureY); // Box 399
		rightTrackModel[9] = new ModelRendererTurbo(this, 881, 297, textureX, textureY); // Box 400
		rightTrackModel[10] = new ModelRendererTurbo(this, 961, 297, textureX, textureY); // Box 401
		rightTrackModel[11] = new ModelRendererTurbo(this, 1041, 297, textureX, textureY); // Box 402
		rightTrackModel[12] = new ModelRendererTurbo(this, 1121, 297, textureX, textureY); // Box 403
		rightTrackModel[13] = new ModelRendererTurbo(this, 1185, 305, textureX, textureY); // Box 404
		rightTrackModel[14] = new ModelRendererTurbo(this, 1273, 305, textureX, textureY); // Box 405
		rightTrackModel[15] = new ModelRendererTurbo(this, 1353, 305, textureX, textureY); // Box 406
		rightTrackModel[16] = new ModelRendererTurbo(this, 1441, 305, textureX, textureY); // Box 407
		rightTrackModel[17] = new ModelRendererTurbo(this, 1521, 305, textureX, textureY); // Box 408
		rightTrackModel[18] = new ModelRendererTurbo(this, 1609, 305, textureX, textureY); // Box 409
		rightTrackModel[19] = new ModelRendererTurbo(this, 1697, 305, textureX, textureY); // Box 410
		rightTrackModel[20] = new ModelRendererTurbo(this, 1777, 305, textureX, textureY); // Box 411
		rightTrackModel[21] = new ModelRendererTurbo(this, 1841, 313, textureX, textureY); // Box 412
		rightTrackModel[22] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); // Box 413
		rightTrackModel[23] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Box 414
		rightTrackModel[24] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 415
		rightTrackModel[25] = new ModelRendererTurbo(this, 401, 321, textureX, textureY); // Box 416
		rightTrackModel[26] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 417
		rightTrackModel[27] = new ModelRendererTurbo(this, 569, 321, textureX, textureY); // Box 418
		rightTrackModel[28] = new ModelRendererTurbo(this, 73, 329, textureX, textureY); // Box 419
		rightTrackModel[29] = new ModelRendererTurbo(this, 625, 329, textureX, textureY); // Box 420
		rightTrackModel[30] = new ModelRendererTurbo(this, 713, 329, textureX, textureY); // Box 421
		rightTrackModel[31] = new ModelRendererTurbo(this, 793, 329, textureX, textureY); // Box 422
		rightTrackModel[32] = new ModelRendererTurbo(this, 881, 329, textureX, textureY); // Box 423
		rightTrackModel[33] = new ModelRendererTurbo(this, 961, 329, textureX, textureY); // Box 424
		rightTrackModel[34] = new ModelRendererTurbo(this, 1049, 329, textureX, textureY); // Box 425
		rightTrackModel[35] = new ModelRendererTurbo(this, 1113, 337, textureX, textureY); // Box 426
		rightTrackModel[36] = new ModelRendererTurbo(this, 1193, 337, textureX, textureY); // Box 427
		rightTrackModel[37] = new ModelRendererTurbo(this, 1281, 337, textureX, textureY); // Box 428
		rightTrackModel[38] = new ModelRendererTurbo(this, 1361, 337, textureX, textureY); // Box 429
		rightTrackModel[39] = new ModelRendererTurbo(this, 1449, 337, textureX, textureY); // Box 430
		rightTrackModel[40] = new ModelRendererTurbo(this, 1537, 337, textureX, textureY); // Box 431
		rightTrackModel[41] = new ModelRendererTurbo(this, 1617, 337, textureX, textureY); // Box 432
		rightTrackModel[42] = new ModelRendererTurbo(this, 73, 361, textureX, textureY); // Box 444
		rightTrackModel[43] = new ModelRendererTurbo(this, 1745, 337, textureX, textureY); // Box 445
		rightTrackModel[44] = new ModelRendererTurbo(this, 1833, 345, textureX, textureY); // Box 446
		rightTrackModel[45] = new ModelRendererTurbo(this, 697, 361, textureX, textureY); // Box 447
		rightTrackModel[46] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 448
		rightTrackModel[47] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 449
		rightTrackModel[48] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 450
		rightTrackModel[49] = new ModelRendererTurbo(this, 2009, 97, textureX, textureY); // Box 451
		rightTrackModel[50] = new ModelRendererTurbo(this, 1857, 113, textureX, textureY); // Box 452
		rightTrackModel[51] = new ModelRendererTurbo(this, 1897, 161, textureX, textureY); // Box 453
		rightTrackModel[52] = new ModelRendererTurbo(this, 1921, 313, textureX, textureY); // Box 454
		rightTrackModel[53] = new ModelRendererTurbo(this, 945, 345, textureX, textureY); // Box 455
		rightTrackModel[54] = new ModelRendererTurbo(this, 1177, 353, textureX, textureY); // Box 456
		rightTrackModel[55] = new ModelRendererTurbo(this, 785, 361, textureX, textureY); // Box 457
		rightTrackModel[56] = new ModelRendererTurbo(this, 1921, 161, textureX, textureY); // Box 458
		rightTrackModel[57] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 459
		rightTrackModel[58] = new ModelRendererTurbo(this, 1929, 241, textureX, textureY); // Box 460
		rightTrackModel[59] = new ModelRendererTurbo(this, 969, 361, textureX, textureY); // Box 461
		rightTrackModel[60] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Box 462
		rightTrackModel[61] = new ModelRendererTurbo(this, 1025, 313, textureX, textureY); // Box 463
		rightTrackModel[62] = new ModelRendererTurbo(this, 1337, 321, textureX, textureY); // Box 464

		rightTrackModel[0].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		rightTrackModel[0].setRotationPoint(-164F, -18F, -56.5F);

		rightTrackModel[1].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		rightTrackModel[1].setRotationPoint(-167F, -15F, -56.5F);

		rightTrackModel[2].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 393
		rightTrackModel[2].setRotationPoint(-167F, -11F, -56.5F);

		rightTrackModel[3].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 394
		rightTrackModel[3].setRotationPoint(-167F, -4F, -56.5F);

		rightTrackModel[4].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 395
		rightTrackModel[4].setRotationPoint(-164F, 0F, -56.5F);

		rightTrackModel[5].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightTrackModel[5].setRotationPoint(-138F, -18F, -56.5F);

		rightTrackModel[6].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		rightTrackModel[6].setRotationPoint(-141F, -15F, -56.5F);

		rightTrackModel[7].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 398
		rightTrackModel[7].setRotationPoint(-141F, -11F, -56.5F);

		rightTrackModel[8].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 399
		rightTrackModel[8].setRotationPoint(-141F, -4F, -56.5F);

		rightTrackModel[9].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 400
		rightTrackModel[9].setRotationPoint(-138F, 0F, -56.5F);

		rightTrackModel[10].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		rightTrackModel[10].setRotationPoint(-112F, -18F, -56.5F);

		rightTrackModel[11].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		rightTrackModel[11].setRotationPoint(-112F, -18F, -56.5F);

		rightTrackModel[12].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		rightTrackModel[12].setRotationPoint(-115F, -15F, -56.5F);

		rightTrackModel[13].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 404
		rightTrackModel[13].setRotationPoint(-115F, -11F, -56.5F);

		rightTrackModel[14].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 405
		rightTrackModel[14].setRotationPoint(-112F, 0F, -56.5F);

		rightTrackModel[15].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 406
		rightTrackModel[15].setRotationPoint(-115F, -4F, -56.5F);

		rightTrackModel[16].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 407
		rightTrackModel[16].setRotationPoint(-86F, 0F, -56.5F);

		rightTrackModel[17].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 408
		rightTrackModel[17].setRotationPoint(-89F, -4F, -56.5F);

		rightTrackModel[18].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 409
		rightTrackModel[18].setRotationPoint(-89F, -11F, -56.5F);

		rightTrackModel[19].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		rightTrackModel[19].setRotationPoint(-86F, -18F, -56.5F);

		rightTrackModel[20].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		rightTrackModel[20].setRotationPoint(-89F, -15F, -56.5F);

		rightTrackModel[21].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		rightTrackModel[21].setRotationPoint(-60F, -18F, -56.5F);

		rightTrackModel[22].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		rightTrackModel[22].setRotationPoint(-63F, -15F, -56.5F);

		rightTrackModel[23].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		rightTrackModel[23].setRotationPoint(-63F, -15F, -56.5F);

		rightTrackModel[24].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 415
		rightTrackModel[24].setRotationPoint(-63F, -11F, -56.5F);

		rightTrackModel[25].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 416
		rightTrackModel[25].setRotationPoint(-63F, -4F, -56.5F);

		rightTrackModel[26].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 417
		rightTrackModel[26].setRotationPoint(-60F, 0F, -56.5F);

		rightTrackModel[27].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 418
		rightTrackModel[27].setRotationPoint(-33F, 0F, -56.5F);

		rightTrackModel[28].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 419
		rightTrackModel[28].setRotationPoint(-36F, -4F, -56.5F);

		rightTrackModel[29].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 420
		rightTrackModel[29].setRotationPoint(-36F, -11F, -56.5F);

		rightTrackModel[30].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		rightTrackModel[30].setRotationPoint(-33F, -18F, -56.5F);

		rightTrackModel[31].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		rightTrackModel[31].setRotationPoint(-36F, -15F, -56.5F);

		rightTrackModel[32].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		rightTrackModel[32].setRotationPoint(-7F, -18F, -56.5F);

		rightTrackModel[33].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		rightTrackModel[33].setRotationPoint(-10F, -15F, -56.5F);

		rightTrackModel[34].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 425
		rightTrackModel[34].setRotationPoint(-10F, -11F, -56.5F);

		rightTrackModel[35].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 426
		rightTrackModel[35].setRotationPoint(-7F, 0F, -56.5F);

		rightTrackModel[36].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 427
		rightTrackModel[36].setRotationPoint(-10F, -4F, -56.5F);

		rightTrackModel[37].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 428
		rightTrackModel[37].setRotationPoint(19F, 0F, -56.5F);

		rightTrackModel[38].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 429
		rightTrackModel[38].setRotationPoint(16F, -4F, -56.5F);

		rightTrackModel[39].addBox(-2F, 0F, 0F, 21, 7, 21, 0F); // Box 430
		rightTrackModel[39].setRotationPoint(16F, -11F, -56.5F);

		rightTrackModel[40].addShapeBox(-2F, 0F, 0F, 15, 3, 21, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		rightTrackModel[40].setRotationPoint(19F, -18F, -56.5F);

		rightTrackModel[41].addShapeBox(-2F, 0F, 0F, 21, 4, 21, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		rightTrackModel[41].setRotationPoint(16F, -15F, -56.5F);

		rightTrackModel[42].addShapeBox(-2F, 0F, 0F, 300, 40, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F); // Box 444
		rightTrackModel[42].setRotationPoint(-183F, -35F, -50.5F);

		rightTrackModel[43].addBox(-6F, 1F, 0F, 5, 267, 35, 0F); // Box 445
		rightTrackModel[43].setRotationPoint(104.2F, 9F, -63.5F);
		rightTrackModel[43].rotateAngleZ = -1.57079633F;

		rightTrackModel[44].addShapeBox(-6F, 1F, 0F, 5, 25, 35, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 446
		rightTrackModel[44].setRotationPoint(123F, -9F, -63.5F);
		rightTrackModel[44].rotateAngleZ = -0.80285146F;

		rightTrackModel[45].addBox(-2F, 0F, 0F, 5, 26, 35, 0F); // Box 447
		rightTrackModel[45].setRotationPoint(119F, -35F, -63.5F);

		rightTrackModel[46].addBox(3F, 0F, 0F, 1, 26, 10, 0F); // Box 448
		rightTrackModel[46].setRotationPoint(119F, -35F, -40.5F);

		rightTrackModel[47].addBox(3F, 0F, 0F, 1, 26, 10, 0F); // Box 449
		rightTrackModel[47].setRotationPoint(119F, -35F, -51F);

		rightTrackModel[48].addBox(3F, 0F, 0F, 1, 26, 10, 0F); // Box 450
		rightTrackModel[48].setRotationPoint(119F, -35F, -61.5F);

		rightTrackModel[49].addBox(-1F, 0F, 0F, 1, 26, 10, 0F); // Box 451
		rightTrackModel[49].setRotationPoint(123F, -9F, -40.5F);
		rightTrackModel[49].rotateAngleZ = -0.80285146F;

		rightTrackModel[50].addBox(-1F, 0F, 0F, 1, 26, 10, 0F); // Box 452
		rightTrackModel[50].setRotationPoint(123F, -9F, -51F);
		rightTrackModel[50].rotateAngleZ = -0.80285146F;

		rightTrackModel[51].addBox(-1F, 0F, 0F, 1, 26, 10, 0F); // Box 453
		rightTrackModel[51].setRotationPoint(123F, -9F, -61.5F);
		rightTrackModel[51].rotateAngleZ = -0.80285146F;

		rightTrackModel[52].addBox(-1F, 0F, 0F, 1, 268, 10, 0F); // Box 454
		rightTrackModel[52].setRotationPoint(104.2F, 9F, -40.5F);
		rightTrackModel[52].rotateAngleZ = -1.57079633F;

		rightTrackModel[53].addBox(-1F, 0F, 0F, 1, 268, 10, 0F); // Box 455
		rightTrackModel[53].setRotationPoint(104.2F, 9F, -51F);
		rightTrackModel[53].rotateAngleZ = -1.57079633F;

		rightTrackModel[54].addBox(-1F, 0F, 0F, 1, 268, 10, 0F); // Box 456
		rightTrackModel[54].setRotationPoint(104.2F, 9F, -61.5F);
		rightTrackModel[54].rotateAngleZ = -1.57079633F;

		rightTrackModel[55].addShapeBox(1F, 1F, 0F, 5, 25, 35, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 457
		rightTrackModel[55].setRotationPoint(-184F, -9.2F, -63.5F);
		rightTrackModel[55].rotateAngleZ = 0.82030475F;

		rightTrackModel[56].addBox(0F, 1F, 0F, 1, 26, 10, 0F); // Box 458
		rightTrackModel[56].setRotationPoint(-184F, -9.2F, -61.5F);
		rightTrackModel[56].rotateAngleZ = 0.82030475F;

		rightTrackModel[57].addBox(0F, 1F, 0F, 1, 26, 10, 0F); // Box 459
		rightTrackModel[57].setRotationPoint(-184F, -9.2F, -51F);
		rightTrackModel[57].rotateAngleZ = 0.82030475F;

		rightTrackModel[58].addBox(0F, 1F, 0F, 1, 26, 10, 0F); // Box 460
		rightTrackModel[58].setRotationPoint(-184F, -9.2F, -40.5F);
		rightTrackModel[58].rotateAngleZ = 0.82030475F;

		rightTrackModel[59].addBox(-2F, 0F, 0F, 5, 26, 35, 0F); // Box 461
		rightTrackModel[59].setRotationPoint(-180F, -35F, -63.5F);

		rightTrackModel[60].addBox(-3F, 0F, 0F, 1, 26, 10, 0F); // Box 462
		rightTrackModel[60].setRotationPoint(-180F, -35F, -51F);

		rightTrackModel[61].addBox(-3F, 0F, 0F, 1, 26, 10, 0F); // Box 463
		rightTrackModel[61].setRotationPoint(-180F, -35F, -61.5F);

		rightTrackModel[62].addBox(-3F, 0F, 0F, 1, 26, 10, 0F); // Box 464
		rightTrackModel[62].setRotationPoint(-180F, -35F, -40.5F);
	}
}