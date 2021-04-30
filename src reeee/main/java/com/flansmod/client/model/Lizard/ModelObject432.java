//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.06.2017 - 13:41:00
// Last changed on: 20.06.2017 - 13:41:00

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelObject432 extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelObject432() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[257];
		turretModel = new ModelRendererTurbo[131];
		barrelModel = new ModelRendererTurbo[16];
		leftTrackWheelModels = new ModelRendererTurbo[96];
		rightTrackWheelModels = new ModelRendererTurbo[96];
		leftTrackModel = new ModelRendererTurbo[9];
		rightTrackModel = new ModelRendererTurbo[9];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1729, 33, textureX, textureY); // Box 205
		bodyModel[1] = new ModelRendererTurbo(this, 1385, 41, textureX, textureY); // Box 206
		bodyModel[2] = new ModelRendererTurbo(this, 1529, 41, textureX, textureY); // Box 207
		bodyModel[3] = new ModelRendererTurbo(this, 1921, 17, textureX, textureY); // Box 208
		bodyModel[4] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 209
		bodyModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 210
		bodyModel[6] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 211
		bodyModel[7] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 212
		bodyModel[8] = new ModelRendererTurbo(this, 1641, 41, textureX, textureY); // Box 213
		bodyModel[9] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 214
		bodyModel[10] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 215
		bodyModel[11] = new ModelRendererTurbo(this, 1233, 57, textureX, textureY); // Box 216
		bodyModel[12] = new ModelRendererTurbo(this, 1481, 41, textureX, textureY); // Box 217
		bodyModel[13] = new ModelRendererTurbo(this, 1513, 17, textureX, textureY); // Box 218
		bodyModel[14] = new ModelRendererTurbo(this, 1921, 17, textureX, textureY); // Box 219
		bodyModel[15] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 220
		bodyModel[16] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 221
		bodyModel[17] = new ModelRendererTurbo(this, 1129, 25, textureX, textureY); // Box 223
		bodyModel[18] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 224
		bodyModel[19] = new ModelRendererTurbo(this, 1321, 25, textureX, textureY); // Box 225
		bodyModel[20] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 226
		bodyModel[21] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 229
		bodyModel[22] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 230
		bodyModel[23] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 231
		bodyModel[24] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 232
		bodyModel[25] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 233
		bodyModel[26] = new ModelRendererTurbo(this, 1073, 73, textureX, textureY); // Box 234
		bodyModel[27] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 235
		bodyModel[28] = new ModelRendererTurbo(this, 1641, 65, textureX, textureY); // Box 236
		bodyModel[29] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 237
		bodyModel[30] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 238
		bodyModel[31] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 239
		bodyModel[32] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 240
		bodyModel[33] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 242
		bodyModel[34] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 243
		bodyModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 244
		bodyModel[36] = new ModelRendererTurbo(this, 1265, 25, textureX, textureY); // Box 245
		bodyModel[37] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 246
		bodyModel[38] = new ModelRendererTurbo(this, 1057, 17, textureX, textureY); // Box 247
		bodyModel[39] = new ModelRendererTurbo(this, 1193, 17, textureX, textureY); // Box 248
		bodyModel[40] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 249
		bodyModel[41] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 250
		bodyModel[42] = new ModelRendererTurbo(this, 1057, 41, textureX, textureY); // Box 251
		bodyModel[43] = new ModelRendererTurbo(this, 1057, 1, textureX, textureY); // Box 106
		bodyModel[44] = new ModelRendererTurbo(this, 1745, 17, textureX, textureY); // Box 110
		bodyModel[45] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 111
		bodyModel[46] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 112
		bodyModel[47] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 121
		bodyModel[48] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 122
		bodyModel[49] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 123
		bodyModel[50] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 126
		bodyModel[51] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 596
		bodyModel[52] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 597
		bodyModel[53] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 649
		bodyModel[54] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 650
		bodyModel[55] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 651
		bodyModel[56] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 652
		bodyModel[57] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 653
		bodyModel[58] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 654
		bodyModel[59] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 655
		bodyModel[60] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 656
		bodyModel[61] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 657
		bodyModel[62] = new ModelRendererTurbo(this, 1217, 1, textureX, textureY); // Box 658
		bodyModel[63] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 659
		bodyModel[64] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 660
		bodyModel[65] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 661
		bodyModel[66] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 662
		bodyModel[67] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 287
		bodyModel[68] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 288
		bodyModel[69] = new ModelRendererTurbo(this, 1353, 1, textureX, textureY); // Box 289
		bodyModel[70] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Box 290
		bodyModel[71] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 291
		bodyModel[72] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 292
		bodyModel[73] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 293
		bodyModel[74] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 294
		bodyModel[75] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 295
		bodyModel[76] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 296
		bodyModel[77] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 297
		bodyModel[78] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 298
		bodyModel[79] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 299
		bodyModel[80] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 300
		bodyModel[81] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 301
		bodyModel[82] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 302
		bodyModel[83] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 303
		bodyModel[84] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 304
		bodyModel[85] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 305
		bodyModel[86] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 306
		bodyModel[87] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 113
		bodyModel[88] = new ModelRendererTurbo(this, 1273, 17, textureX, textureY); // Box 114
		bodyModel[89] = new ModelRendererTurbo(this, 1457, 17, textureX, textureY); // Box 115
		bodyModel[90] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Box 599
		bodyModel[91] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 600
		bodyModel[92] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 687
		bodyModel[93] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 688
		bodyModel[94] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 689
		bodyModel[95] = new ModelRendererTurbo(this, 1761, 17, textureX, textureY); // Box 690
		bodyModel[96] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Box 691
		bodyModel[97] = new ModelRendererTurbo(this, 1897, 17, textureX, textureY); // Box 692
		bodyModel[98] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 693
		bodyModel[99] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 694
		bodyModel[100] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 695
		bodyModel[101] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 696
		bodyModel[102] = new ModelRendererTurbo(this, 1921, 33, textureX, textureY); // Box 697
		bodyModel[103] = new ModelRendererTurbo(this, 2001, 33, textureX, textureY); // Box 698
		bodyModel[104] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 699
		bodyModel[105] = new ModelRendererTurbo(this, 1113, 41, textureX, textureY); // Box 700
		bodyModel[106] = new ModelRendererTurbo(this, 1193, 41, textureX, textureY); // Box 701
		bodyModel[107] = new ModelRendererTurbo(this, 1921, 49, textureX, textureY); // Box 336
		bodyModel[108] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 337
		bodyModel[109] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 573
		bodyModel[110] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 435
		bodyModel[111] = new ModelRendererTurbo(this, 1241, 25, textureX, textureY); // Box 436
		bodyModel[112] = new ModelRendererTurbo(this, 1473, 25, textureX, textureY); // Box 437
		bodyModel[113] = new ModelRendererTurbo(this, 1585, 25, textureX, textureY); // Box 438
		bodyModel[114] = new ModelRendererTurbo(this, 1665, 25, textureX, textureY); // Box 439
		bodyModel[115] = new ModelRendererTurbo(this, 1569, 97, textureX, textureY); // Box 440
		bodyModel[116] = new ModelRendererTurbo(this, 1609, 97, textureX, textureY); // Box 441
		bodyModel[117] = new ModelRendererTurbo(this, 1649, 97, textureX, textureY); // Box 442
		bodyModel[118] = new ModelRendererTurbo(this, 1705, 97, textureX, textureY); // Box 443
		bodyModel[119] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 444
		bodyModel[120] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 445
		bodyModel[121] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 446
		bodyModel[122] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 447
		bodyModel[123] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 448
		bodyModel[124] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 449
		bodyModel[125] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 450
		bodyModel[126] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 451
		bodyModel[127] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 452
		bodyModel[128] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Box 453
		bodyModel[129] = new ModelRendererTurbo(this, 1033, 105, textureX, textureY); // Box 454
		bodyModel[130] = new ModelRendererTurbo(this, 1321, 105, textureX, textureY); // Box 455
		bodyModel[131] = new ModelRendererTurbo(this, 1353, 105, textureX, textureY); // Box 456
		bodyModel[132] = new ModelRendererTurbo(this, 1729, 105, textureX, textureY); // Box 457
		bodyModel[133] = new ModelRendererTurbo(this, 1761, 105, textureX, textureY); // Box 458
		bodyModel[134] = new ModelRendererTurbo(this, 1793, 105, textureX, textureY); // Box 459
		bodyModel[135] = new ModelRendererTurbo(this, 1825, 105, textureX, textureY); // Box 460
		bodyModel[136] = new ModelRendererTurbo(this, 1857, 105, textureX, textureY); // Box 461
		bodyModel[137] = new ModelRendererTurbo(this, 1889, 105, textureX, textureY); // Box 462
		bodyModel[138] = new ModelRendererTurbo(this, 1921, 105, textureX, textureY); // Box 463
		bodyModel[139] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 464
		bodyModel[140] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 465
		bodyModel[141] = new ModelRendererTurbo(this, 1953, 105, textureX, textureY); // Box 466
		bodyModel[142] = new ModelRendererTurbo(this, 1985, 105, textureX, textureY); // Box 467
		bodyModel[143] = new ModelRendererTurbo(this, 2017, 105, textureX, textureY); // Box 468
		bodyModel[144] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 469
		bodyModel[145] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 470
		bodyModel[146] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 471
		bodyModel[147] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 472
		bodyModel[148] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 473
		bodyModel[149] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 474
		bodyModel[150] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 475
		bodyModel[151] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 476
		bodyModel[152] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 477
		bodyModel[153] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 478
		bodyModel[154] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 479
		bodyModel[155] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 480
		bodyModel[156] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 481
		bodyModel[157] = new ModelRendererTurbo(this, 1145, 9, textureX, textureY); // Box 599
		bodyModel[158] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 600
		bodyModel[159] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 601
		bodyModel[160] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 602
		bodyModel[161] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 603
		bodyModel[162] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 604
		bodyModel[163] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 605
		bodyModel[164] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 606
		bodyModel[165] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 607
		bodyModel[166] = new ModelRendererTurbo(this, 1025, 145, textureX, textureY); // Box 608
		bodyModel[167] = new ModelRendererTurbo(this, 1209, 145, textureX, textureY); // Box 609
		bodyModel[168] = new ModelRendererTurbo(this, 1569, 145, textureX, textureY); // Box 610
		bodyModel[169] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 611
		bodyModel[170] = new ModelRendererTurbo(this, 857, 153, textureX, textureY); // Box 612
		bodyModel[171] = new ModelRendererTurbo(this, 1105, 153, textureX, textureY); // Box 613
		bodyModel[172] = new ModelRendererTurbo(this, 1649, 153, textureX, textureY); // Box 614
		bodyModel[173] = new ModelRendererTurbo(this, 1801, 153, textureX, textureY); // Box 615
		bodyModel[174] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 616
		bodyModel[175] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 11
		bodyModel[176] = new ModelRendererTurbo(this, 625, 161, textureX, textureY); // Box 126
		bodyModel[177] = new ModelRendererTurbo(this, 1289, 161, textureX, textureY); // Box 127
		bodyModel[178] = new ModelRendererTurbo(this, 1041, 145, textureX, textureY); // Box 620
		bodyModel[179] = new ModelRendererTurbo(this, 1105, 145, textureX, textureY); // Box 621
		bodyModel[180] = new ModelRendererTurbo(this, 1729, 153, textureX, textureY); // Box 622
		bodyModel[181] = new ModelRendererTurbo(this, 1185, 153, textureX, textureY); // Box 623
		bodyModel[182] = new ModelRendererTurbo(this, 1857, 17, textureX, textureY); // Box 624
		bodyModel[183] = new ModelRendererTurbo(this, 1113, 9, textureX, textureY); // Box 625
		bodyModel[184] = new ModelRendererTurbo(this, 1561, 9, textureX, textureY); // Box 627
		bodyModel[185] = new ModelRendererTurbo(this, 1881, 153, textureX, textureY); // Box 640
		bodyModel[186] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 641
		bodyModel[187] = new ModelRendererTurbo(this, 1649, 145, textureX, textureY); // Box 642
		bodyModel[188] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 643
		bodyModel[189] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 644
		bodyModel[190] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 645
		bodyModel[191] = new ModelRendererTurbo(this, 1289, 153, textureX, textureY); // Box 646
		bodyModel[192] = new ModelRendererTurbo(this, 1785, 153, textureX, textureY); // Box 647
		bodyModel[193] = new ModelRendererTurbo(this, 1977, 153, textureX, textureY); // Box 648
		bodyModel[194] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 649
		bodyModel[195] = new ModelRendererTurbo(this, 1241, 9, textureX, textureY); // Box 652
		bodyModel[196] = new ModelRendererTurbo(this, 1289, 9, textureX, textureY); // Box 653
		bodyModel[197] = new ModelRendererTurbo(this, 1441, 9, textureX, textureY); // Box 654
		bodyModel[198] = new ModelRendererTurbo(this, 1513, 9, textureX, textureY); // Box 655
		bodyModel[199] = new ModelRendererTurbo(this, 1665, 9, textureX, textureY); // Box 656
		bodyModel[200] = new ModelRendererTurbo(this, 1745, 9, textureX, textureY); // Box 657
		bodyModel[201] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 658
		bodyModel[202] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 659
		bodyModel[203] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 660
		bodyModel[204] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 661
		bodyModel[205] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 662
		bodyModel[206] = new ModelRendererTurbo(this, 1617, 25, textureX, textureY); // Box 663
		bodyModel[207] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 664
		bodyModel[208] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 665
		bodyModel[209] = new ModelRendererTurbo(this, 1553, 41, textureX, textureY); // Box 666
		bodyModel[210] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 667
		bodyModel[211] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 668
		bodyModel[212] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 669
		bodyModel[213] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 673
		bodyModel[214] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 674
		bodyModel[215] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 675
		bodyModel[216] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 676
		bodyModel[217] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 677
		bodyModel[218] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 678
		bodyModel[219] = new ModelRendererTurbo(this, 2033, 25, textureX, textureY); // Box 679
		bodyModel[220] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 680
		bodyModel[221] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 681
		bodyModel[222] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 682
		bodyModel[223] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 683
		bodyModel[224] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 684
		bodyModel[225] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 685
		bodyModel[226] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 686
		bodyModel[227] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 687
		bodyModel[228] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 688
		bodyModel[229] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 689
		bodyModel[230] = new ModelRendererTurbo(this, 1073, 17, textureX, textureY); // Box 690
		bodyModel[231] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 694
		bodyModel[232] = new ModelRendererTurbo(this, 625, 161, textureX, textureY); // Box 695
		bodyModel[233] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Box 696
		bodyModel[234] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 697
		bodyModel[235] = new ModelRendererTurbo(this, 1369, 161, textureX, textureY); // Box 698
		bodyModel[236] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 699
		bodyModel[237] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 700
		bodyModel[238] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 701
		bodyModel[239] = new ModelRendererTurbo(this, 1241, 41, textureX, textureY); // Box 702
		bodyModel[240] = new ModelRendererTurbo(this, 1433, 161, textureX, textureY); // Box 703
		bodyModel[241] = new ModelRendererTurbo(this, 1465, 161, textureX, textureY); // Box 704
		bodyModel[242] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 705
		bodyModel[243] = new ModelRendererTurbo(this, 1177, 65, textureX, textureY); // Box 706
		bodyModel[244] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 512
		bodyModel[245] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 513
		bodyModel[246] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 514
		bodyModel[247] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 515
		bodyModel[248] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 516
		bodyModel[249] = new ModelRendererTurbo(this, 1337, 153, textureX, textureY); // Box 968
		bodyModel[250] = new ModelRendererTurbo(this, 1481, 81, textureX, textureY); // Box 969
		bodyModel[251] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 354
		bodyModel[252] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 988
		bodyModel[253] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 989
		bodyModel[254] = new ModelRendererTurbo(this, 1409, 161, textureX, textureY); // Box 990
		bodyModel[255] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 995
		bodyModel[256] = new ModelRendererTurbo(this, 1385, 41, textureX, textureY); // Box 862

		bodyModel[0].addBox(0F, 0F, 0F, 70, 22, 47, 0F); // Box 205
		bodyModel[0].setRotationPoint(-54F, -22F, -23F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 23, 22, 47, 0F,0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -18.1F, 0F, 0F, -18.1F, 0F, 0F, -20F, 0F); // Box 206
		bodyModel[1].setRotationPoint(16F, -22F, -23F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 7, 47, 0F,0F, 0F, -16F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, -16F, 0F, -3F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -3F, 0F); // Box 207
		bodyModel[2].setRotationPoint(39F, -22F, -23F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 7, 47, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -8F, 0F); // Box 208
		bodyModel[3].setRotationPoint(56F, 1F, -23F);

		bodyModel[4].addBox(0F, 0F, 0F, 17, 7, 47, 0F); // Box 209
		bodyModel[4].setRotationPoint(39F, -7F, -23F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 6, 47, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 210
		bodyModel[5].setRotationPoint(-64F, -22F, -23F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 14, 47, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, 0F); // Box 211
		bodyModel[6].setRotationPoint(-64F, -16F, -23F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 47, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F); // Box 212
		bodyModel[7].setRotationPoint(-57.5F, -2F, -23F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 39, 7, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 213
		bodyModel[8].setRotationPoint(-64F, -21.75F, -35F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 40, 1, 12, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[9].setRotationPoint(-65F, -22.75F, -35F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 60, 7, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[10].setRotationPoint(-25F, -21.75F, -35F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 60, 1, 12, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[11].setRotationPoint(-25F, -22.75F, -35F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 29, 5, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[12].setRotationPoint(35F, -19.75F, -35F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.97F, 0F, 0F, 1.97F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[13].setRotationPoint(35F, -20.75F, -35F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, -1F, -0.75F, -1.7F, -1F, -0.75F, -1.7F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.03F, 0F); // Box 219
		bodyModel[14].setRotationPoint(54F, -18.75F, -35F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[15].setRotationPoint(64F, -16.75F, -35F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[16].setRotationPoint(70F, -16.75F, -35F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,-0.25F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.5F, 3F, 0F, -2.5F, 3F, 0F, -0.25F, 0F, 0F); // Box 223
		bodyModel[17].setRotationPoint(74F, -14.75F, -35F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -4.75F, -0.25F, 0F, -2.75F, -0.25F, 1F, 0.75F, 0F, 3F, -1F, 0F, 1.25F, -1F, 0F, 1F, 0.75F, 0F); // Box 224
		bodyModel[18].setRotationPoint(70F, -16.75F, -23F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 6, 3, 0F,2F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 225
		bodyModel[19].setRotationPoint(45F, -16.75F, -23F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -0.25F, 0F, -2F, -0.25F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 226
		bodyModel[20].setRotationPoint(64F, -16.75F, -23F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, -1F, -0.25F, -1.75F, -1.75F, -0.25F, 0.25F, -2F, 0F, 0F, 0F, 0F, 1F, -3.25F, 0F, 1.25F, -1F, 0F, 3F, -1F, 0F, 1F, -3.25F, 0F); // Box 229
		bodyModel[21].setRotationPoint(70F, -16.75F, -38F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, -0.75F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -1F, 1.75F, 0F, -1F, 1.75F, 0F, 0F, 0.75F, 0F); // Box 230
		bodyModel[22].setRotationPoint(64F, -16.75F, -38F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 130, 3, 3, 0F,0F, -0.75F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F); // Box 231
		bodyModel[23].setRotationPoint(-66F, -17F, -38F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -2F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -2F, 0.75F, 0F); // Box 232
		bodyModel[24].setRotationPoint(-69F, -17F, -38F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 39, 7, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 233
		bodyModel[25].setRotationPoint(-64F, -21.75F, 24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 130, 3, 3, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F); // Box 234
		bodyModel[26].setRotationPoint(-66F, -17F, 36F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -2F, -0.25F, -2F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F); // Box 235
		bodyModel[27].setRotationPoint(-69F, -17F, 36F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 40, 1, 12, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[28].setRotationPoint(-65F, -22.75F, 24F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 60, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[29].setRotationPoint(-25F, -22.75F, 24F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 60, 7, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[30].setRotationPoint(-25F, -21.75F, 24F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 29, 5, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[31].setRotationPoint(35F, -19.75F, 24F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.97F, 0F, 0F, 1.97F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[32].setRotationPoint(35F, -20.75F, 24F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.75F, 0F, -1F, 1.75F, 0F, -1F, 1.75F, 0F, 0F, 0.75F, 0F); // Box 242
		bodyModel[33].setRotationPoint(64F, -16.75F, 36F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, -1.75F, -1.75F, -0.25F, 0F, -1F, -0.25F, 1F, -3.25F, 0F, 3F, -1F, 0F, 1.25F, -1F, 0F, 1F, -3.25F, 0F); // Box 243
		bodyModel[34].setRotationPoint(70F, -16.75F, 36F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[35].setRotationPoint(64F, -16.75F, 24F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[36].setRotationPoint(70F, -16.75F, 24F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,-0.25F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.5F, 3F, 0F, -2.5F, 3F, 0F, -0.25F, 0F, 0F); // Box 246
		bodyModel[37].setRotationPoint(74F, -14.75F, 24F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, -2.75F, -0.25F, 0.25F, -4.75F, -0.25F, 0.25F, -2F, 0F, 0F, 0F, 0F, 1F, 0.75F, 0F, 1.25F, -1F, 0F, 3F, -1F, 0F, 1F, 0.75F, 0F); // Box 247
		bodyModel[38].setRotationPoint(70F, -16.75F, 21F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,0F, -2F, -0.25F, 0F, -2.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 248
		bodyModel[39].setRotationPoint(64F, -16.75F, 21F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 19, 6, 3, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 2F, 3F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 249
		bodyModel[40].setRotationPoint(45F, -16.75F, 21F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[41].setRotationPoint(-47F, -23.75F, -33F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[42].setRotationPoint(-47F, -23.75F, 26F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, 0.3F, -0.2F, -0.2F, -0.15F, -0.2F, -0.15F, -0.15F, -0.25F, -0.3F, 0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.55F, 0F, 0.1F, -0.55F, 0F, 0.1F, -0.3F, 0F, -0.2F); // Box 106
		bodyModel[43].setRotationPoint(62.55F, -11.82F, -0.45F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 15F); // Box 110
		bodyModel[44].setRotationPoint(59.3F, -13F, -5.45F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 111
		bodyModel[45].setRotationPoint(41.3F, -21.4F, -2.45F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F); // Box 112
		bodyModel[46].setRotationPoint(41.4F, -21.2F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 121
		bodyModel[47].setRotationPoint(59.2F, -16F, 17.15F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 122
		bodyModel[48].setRotationPoint(59.2F, -17F, 17.15F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 123
		bodyModel[49].setRotationPoint(59.2F, -15F, 17.15F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 126
		bodyModel[50].setRotationPoint(58.3F, -15.5F, 16.1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 596
		bodyModel[51].setRotationPoint(58.2F, -12.6F, 16.15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 597
		bodyModel[52].setRotationPoint(58.3F, -15.5F, 18.1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 649
		bodyModel[53].setRotationPoint(58.8F, -17.75F, 17.7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 650
		bodyModel[54].setRotationPoint(58.3F, -17.5F, 18.7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F); // Box 651
		bodyModel[55].setRotationPoint(58.3F, -17.75F, 17F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 652
		bodyModel[56].setRotationPoint(58.3F, -17.5F, 15.6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 653
		bodyModel[57].setRotationPoint(58.3F, -16.5F, 15.6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 654
		bodyModel[58].setRotationPoint(58.3F, -16.5F, 18.7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 655
		bodyModel[59].setRotationPoint(58.8F, -17.75F, 16.6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F); // Box 656
		bodyModel[60].setRotationPoint(60.3F, -17.75F, 17F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 657
		bodyModel[61].setRotationPoint(60.3F, -17.5F, 15.6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 658
		bodyModel[62].setRotationPoint(60.3F, -17.5F, 18.7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 659
		bodyModel[63].setRotationPoint(60.3F, -16.5F, 18.7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 660
		bodyModel[64].setRotationPoint(60.3F, -16.5F, 15.6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 661
		bodyModel[65].setRotationPoint(58.8F, -16.5F, 15.6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 662
		bodyModel[66].setRotationPoint(58.8F, -16.5F, 18.7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 287
		bodyModel[67].setRotationPoint(59.2F, -16F, -17.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 288
		bodyModel[68].setRotationPoint(59.2F, -17F, -17.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 289
		bodyModel[69].setRotationPoint(59.2F, -15F, -17.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 290
		bodyModel[70].setRotationPoint(58.3F, -15.5F, -18.55F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 291
		bodyModel[71].setRotationPoint(58.2F, -12.6F, -18.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 292
		bodyModel[72].setRotationPoint(58.3F, -15.5F, -16.55F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 293
		bodyModel[73].setRotationPoint(58.8F, -17.75F, -16.95F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 294
		bodyModel[74].setRotationPoint(58.3F, -17.5F, -15.95F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F); // Box 295
		bodyModel[75].setRotationPoint(58.3F, -17.75F, -17.65F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 296
		bodyModel[76].setRotationPoint(58.3F, -17.5F, -19.05F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 297
		bodyModel[77].setRotationPoint(58.3F, -16.5F, -19.05F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 298
		bodyModel[78].setRotationPoint(58.3F, -16.5F, -15.95F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 299
		bodyModel[79].setRotationPoint(58.8F, -17.75F, -18.05F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.3F, -0.25F, -0.4F, 0.3F); // Box 300
		bodyModel[80].setRotationPoint(60.3F, -17.75F, -17.65F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 301
		bodyModel[81].setRotationPoint(60.3F, -17.5F, -19.05F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 302
		bodyModel[82].setRotationPoint(60.3F, -17.5F, -15.95F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 303
		bodyModel[83].setRotationPoint(60.3F, -16.5F, -15.95F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 304
		bodyModel[84].setRotationPoint(60.3F, -16.5F, -19.05F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 305
		bodyModel[85].setRotationPoint(58.8F, -16.5F, -19.05F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 306
		bodyModel[86].setRotationPoint(58.8F, -16.5F, -15.95F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[87].setRotationPoint(31F, -22.6F, -3.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[88].setRotationPoint(31F, -22.6F, -6.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 115
		bodyModel[89].setRotationPoint(31F, -22.6F, 4.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 599
		bodyModel[90].setRotationPoint(64.2F, -9.75F, -12.85F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 1.2F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 600
		bodyModel[91].setRotationPoint(64.2F, -9.75F, 13.15F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		bodyModel[92].setRotationPoint(64.2F, -10.75F, 13.15F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		bodyModel[93].setRotationPoint(64.2F, -10.75F, -12.85F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 6, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[94].setRotationPoint(58F, -6F, -21.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 690
		bodyModel[95].setRotationPoint(58F, -6F, -21.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 691
		bodyModel[96].setRotationPoint(58F, -6F, -13.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 692
		bodyModel[97].setRotationPoint(58F, -6F, -6.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 693
		bodyModel[98].setRotationPoint(58F, -6F, 5.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 694
		bodyModel[99].setRotationPoint(58F, -6F, 12.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F); // Box 695
		bodyModel[100].setRotationPoint(58F, -6F, 18.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 696
		bodyModel[101].setRotationPoint(47F, -5.5F, -6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 697
		bodyModel[102].setRotationPoint(47F, -5.5F, -13.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 698
		bodyModel[103].setRotationPoint(47F, -5.5F, -21.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 699
		bodyModel[104].setRotationPoint(47F, -5.5F, 5.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 700
		bodyModel[105].setRotationPoint(47F, -5.5F, 12.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 701
		bodyModel[106].setRotationPoint(47F, -5.5F, 18.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 0F, 0F, -0.75F, -1.7F, 0F, -0.75F, -1.7F, -1F, 0F, 0F, -1F, 0F, -0.03F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.03F, 0F); // Box 336
		bodyModel[107].setRotationPoint(54F, -18.75F, 24F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 32, 2, 47, 0F,-3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[108].setRotationPoint(-63.5F, -24F, -23F);

		bodyModel[109].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 573
		bodyModel[109].setRotationPoint(51F, 1F, 27F);
		bodyModel[109].rotateAngleZ = 0.55850536F;

		bodyModel[110].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 435
		bodyModel[110].setRotationPoint(32.5F, 1F, 27F);
		bodyModel[110].rotateAngleZ = 0.55850536F;

		bodyModel[111].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 436
		bodyModel[111].setRotationPoint(13F, 1F, 27F);
		bodyModel[111].rotateAngleZ = 0.55850536F;

		bodyModel[112].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 437
		bodyModel[112].setRotationPoint(-3F, 1F, 27F);
		bodyModel[112].rotateAngleZ = 0.55850536F;

		bodyModel[113].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 438
		bodyModel[113].setRotationPoint(-21F, 1F, 27F);
		bodyModel[113].rotateAngleZ = 0.55850536F;

		bodyModel[114].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, 3F, 0F, 1.75F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 439
		bodyModel[114].setRotationPoint(-39F, 1F, 27F);
		bodyModel[114].rotateAngleZ = 0.55850536F;

		bodyModel[115].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 440
		bodyModel[115].setRotationPoint(39.75F, -4.5F, 29F);

		bodyModel[116].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 441
		bodyModel[116].setRotationPoint(39.75F, -4.5F, 29F);

		bodyModel[117].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 442
		bodyModel[117].setRotationPoint(39.75F, -4.5F, 29F);

		bodyModel[118].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 443
		bodyModel[118].setRotationPoint(58F, -4.5F, 29F);

		bodyModel[119].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 444
		bodyModel[119].setRotationPoint(58F, -4.5F, 29F);

		bodyModel[120].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 445
		bodyModel[120].setRotationPoint(58F, -4.5F, 29F);

		bodyModel[121].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 446
		bodyModel[121].setRotationPoint(20.75F, -4.5F, 29F);

		bodyModel[122].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 447
		bodyModel[122].setRotationPoint(20.75F, -4.5F, 29F);

		bodyModel[123].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 448
		bodyModel[123].setRotationPoint(20.75F, -4.5F, 29F);

		bodyModel[124].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 449
		bodyModel[124].setRotationPoint(4.75F, -4.5F, 29F);

		bodyModel[125].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 450
		bodyModel[125].setRotationPoint(4.75F, -4.5F, 29F);

		bodyModel[126].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 451
		bodyModel[126].setRotationPoint(4.75F, -4.5F, 29F);

		bodyModel[127].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 452
		bodyModel[127].setRotationPoint(-12.75F, -4.5F, 29F);

		bodyModel[128].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 453
		bodyModel[128].setRotationPoint(-12.75F, -4.5F, 29F);

		bodyModel[129].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 454
		bodyModel[129].setRotationPoint(-12.75F, -4.5F, 29F);

		bodyModel[130].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 455
		bodyModel[130].setRotationPoint(-30.75F, -4.5F, 29F);

		bodyModel[131].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 456
		bodyModel[131].setRotationPoint(-30.75F, -4.5F, 29F);

		bodyModel[132].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 457
		bodyModel[132].setRotationPoint(-30.75F, -4.5F, 29F);

		bodyModel[133].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 458
		bodyModel[133].setRotationPoint(-30.75F, -4.5F, -22F);

		bodyModel[134].addShapeBox(-2.5F, -1F, -4F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 459
		bodyModel[134].setRotationPoint(-30.75F, -4.5F, -22F);

		bodyModel[135].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 460
		bodyModel[135].setRotationPoint(-30.75F, -4.5F, -22F);

		bodyModel[136].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 461
		bodyModel[136].setRotationPoint(-12.75F, -4.5F, -22F);

		bodyModel[137].addShapeBox(-2.5F, -1F, -4F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 462
		bodyModel[137].setRotationPoint(-12.75F, -4.5F, -22F);

		bodyModel[138].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 463
		bodyModel[138].setRotationPoint(-12.75F, -4.5F, -22F);

		bodyModel[139].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 464
		bodyModel[139].setRotationPoint(-21F, 1F, -24F);
		bodyModel[139].rotateAngleZ = 0.55850536F;

		bodyModel[140].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 465
		bodyModel[140].setRotationPoint(-39F, 1F, -24F);
		bodyModel[140].rotateAngleZ = 0.55850536F;

		bodyModel[141].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 466
		bodyModel[141].setRotationPoint(4.75F, -4.5F, -22F);

		bodyModel[142].addShapeBox(-2.5F, -1F, -4F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 467
		bodyModel[142].setRotationPoint(4.75F, -4.5F, -22F);

		bodyModel[143].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 468
		bodyModel[143].setRotationPoint(4.75F, -4.5F, -22F);

		bodyModel[144].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 469
		bodyModel[144].setRotationPoint(-3F, 1F, -24F);
		bodyModel[144].rotateAngleZ = 0.55850536F;

		bodyModel[145].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 470
		bodyModel[145].setRotationPoint(20.75F, -4.5F, -22F);

		bodyModel[146].addShapeBox(-2.5F, -1F, -4F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 471
		bodyModel[146].setRotationPoint(20.75F, -4.5F, -22F);

		bodyModel[147].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 472
		bodyModel[147].setRotationPoint(20.75F, -4.5F, -22F);

		bodyModel[148].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 473
		bodyModel[148].setRotationPoint(13F, 1F, -24F);
		bodyModel[148].rotateAngleZ = 0.55850536F;

		bodyModel[149].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 474
		bodyModel[149].setRotationPoint(39.75F, -4.5F, -22F);

		bodyModel[150].addShapeBox(-2.5F, -1F, -4F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 475
		bodyModel[150].setRotationPoint(39.75F, -4.5F, -22F);

		bodyModel[151].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 476
		bodyModel[151].setRotationPoint(39.75F, -4.5F, -22F);

		bodyModel[152].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 477
		bodyModel[152].setRotationPoint(32.5F, 1F, -24F);
		bodyModel[152].rotateAngleZ = 0.55850536F;

		bodyModel[153].addShapeBox(-2.5F, -1F, -2F, 13, 2, 2, 0F,0F, -0.25F, 0F, 0F, 1.75F, -1F, 0F, 1.75F, 3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 3F, 0F, -0.25F, 0F); // Box 478
		bodyModel[153].setRotationPoint(51F, 1F, -24F);
		bodyModel[153].rotateAngleZ = 0.55850536F;

		bodyModel[154].addShapeBox(-2.5F, -1F, -4F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 479
		bodyModel[154].setRotationPoint(58F, -4.5F, -22F);

		bodyModel[155].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 480
		bodyModel[155].setRotationPoint(58F, -4.5F, -22F);

		bodyModel[156].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 481
		bodyModel[156].setRotationPoint(58F, -4.5F, -22F);

		bodyModel[157].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 4, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 599
		bodyModel[157].setRotationPoint(67.5F, -7.25F, 31F);

		bodyModel[158].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 600
		bodyModel[158].setRotationPoint(67.5F, -7.25F, 31F);

		bodyModel[159].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 601
		bodyModel[159].setRotationPoint(67.5F, -7.25F, 31F);

		bodyModel[160].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 4, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 602
		bodyModel[160].setRotationPoint(67.5F, -7.25F, -17.8F);

		bodyModel[161].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 603
		bodyModel[161].setRotationPoint(67.5F, -7.25F, -17.8F);

		bodyModel[162].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 604
		bodyModel[162].setRotationPoint(67.5F, -7.25F, -17.8F);

		bodyModel[163].addShapeBox(-2.5F, -2.45F, -8F, 5, 2, 49, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 605
		bodyModel[163].setRotationPoint(-52F, -7F, -15.8F);

		bodyModel[164].addShapeBox(-2.5F, 0.45F, -8F, 5, 2, 49, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 606
		bodyModel[164].setRotationPoint(-52F, -7F, -15.8F);

		bodyModel[165].addShapeBox(-2.5F, -1F, -8F, 5, 2, 49, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 607
		bodyModel[165].setRotationPoint(-52F, -7F, -15.8F);

		bodyModel[166].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 68, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 608
		bodyModel[166].setRotationPoint(-25.75F, -10.75F, -29F);

		bodyModel[167].addShapeBox(-2.5F, -1F, -4F, 5, 2, 68, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 609
		bodyModel[167].setRotationPoint(-25.75F, -10.75F, -29F);

		bodyModel[168].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 68, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 610
		bodyModel[168].setRotationPoint(-25.75F, -10.75F, -29F);

		bodyModel[169].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 68, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 611
		bodyModel[169].setRotationPoint(7.25F, -10.75F, -29F);

		bodyModel[170].addShapeBox(-2.5F, -1F, -4F, 5, 2, 68, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 612
		bodyModel[170].setRotationPoint(7.25F, -10.75F, -29F);

		bodyModel[171].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 68, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 613
		bodyModel[171].setRotationPoint(7.25F, -10.75F, -29F);

		bodyModel[172].addShapeBox(-2.5F, -2.45F, -4F, 5, 2, 68, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 614
		bodyModel[172].setRotationPoint(41.25F, -10.75F, -29F);

		bodyModel[173].addShapeBox(-2.5F, -1F, -4F, 5, 2, 68, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 615
		bodyModel[173].setRotationPoint(41.25F, -10.75F, -29F);

		bodyModel[174].addShapeBox(-2.5F, 0.45F, -4F, 5, 2, 68, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 616
		bodyModel[174].setRotationPoint(41.25F, -10.75F, -29F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 69, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[175].setRotationPoint(-71.75F, -16.25F, -34F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 2, 69, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[176].setRotationPoint(-71.75F, -13.25F, -34F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 69, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 127
		bodyModel[177].setRotationPoint(-71.75F, -14.25F, -34F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 0F, -2F, 0.75F, 0F); // Box 620
		bodyModel[178].setRotationPoint(-69F, -17F, -35.25F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -2F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, -2F, 0.75F, -0.25F); // Box 621
		bodyModel[179].setRotationPoint(-69F, -17F, 23.25F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 2, 47, 0F,0F, -1F, -0.25F, 0F, 2.5F, -0.25F, 0F, 2.5F, 0F, 0F, -1F, 0F, -2F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 0F, -2F, 0.75F, 0F); // Box 622
		bodyModel[180].setRotationPoint(-68.5F, -17.5F, -23.25F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 5, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 623
		bodyModel[181].setRotationPoint(-69F, -22.25F, -12.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 624
		bodyModel[182].setRotationPoint(-69F, -22.25F, -15.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 625
		bodyModel[183].setRotationPoint(-69F, -22.25F, -16.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 627
		bodyModel[184].setRotationPoint(-69F, -22.25F, -13.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 37, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[185].setRotationPoint(-64F, -20.25F, 26.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 24, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		bodyModel[186].setRotationPoint(-24F, -20.25F, 26.25F);
		bodyModel[186].rotateAngleZ = -0.01745329F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[187].setRotationPoint(2F, -19.75F, 26.25F);
		bodyModel[187].rotateAngleZ = -0.01745329F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		bodyModel[188].setRotationPoint(20F, -19.5F, 26.25F);
		bodyModel[188].rotateAngleZ = -0.03490659F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		bodyModel[189].setRotationPoint(38F, -18.75F, 26.25F);
		bodyModel[189].rotateAngleZ = -0.06981317F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[190].setRotationPoint(38F, -18.75F, -35.25F);
		bodyModel[190].rotateAngleZ = -0.06981317F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[191].setRotationPoint(20F, -19.5F, -35.25F);
		bodyModel[191].rotateAngleZ = -0.03490659F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 647
		bodyModel[192].setRotationPoint(2F, -19.75F, -35.25F);
		bodyModel[192].rotateAngleZ = -0.01745329F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 24, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[193].setRotationPoint(-24F, -20.25F, -35.25F);
		bodyModel[193].rotateAngleZ = -0.01745329F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 37, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		bodyModel[194].setRotationPoint(-64F, -20.25F, -35.25F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.75F, 0.05F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -0.75F, 0.05F, 0F, -0.25F, -2F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, -0.25F, -2F, 0F); // Box 652
		bodyModel[195].setRotationPoint(73.75F, -14.75F, -31F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 653
		bodyModel[196].setRotationPoint(70F, -17F, -31F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[197].setRotationPoint(70F, -17F, -34F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[198].setRotationPoint(70F, -17F, -28F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[199].setRotationPoint(70F, -17F, -25F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.75F, 0.05F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -0.75F, 0.05F, 0F, -0.25F, -2F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, -0.25F, -2F, 0F); // Box 657
		bodyModel[200].setRotationPoint(73.75F, -14.75F, -28F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.75F, 0.05F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -0.75F, 0.05F, 0F, -0.25F, -2F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, -0.25F, -2F, 0F); // Box 658
		bodyModel[201].setRotationPoint(73.75F, -14.75F, -25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[202].setRotationPoint(64F, -17F, -34F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[203].setRotationPoint(64F, -17F, -31F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		bodyModel[204].setRotationPoint(64F, -17F, -28F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[205].setRotationPoint(64F, -17F, -25F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.03F, 0F); // Box 663
		bodyModel[206].setRotationPoint(54F, -18.9F, -34F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.03F, 0F); // Box 664
		bodyModel[207].setRotationPoint(54F, -18.9F, -31F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.03F, 0F); // Box 665
		bodyModel[208].setRotationPoint(54F, -18.9F, -28F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.03F, 0F); // Box 666
		bodyModel[209].setRotationPoint(54F, -18.9F, -25F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.97F, 0F, 0F, 1.97F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[210].setRotationPoint(37F, -20.75F, -33F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.97F, 0F, 0F, 1.97F, 0F, 0F, 0F, 0F); // Box 668
		bodyModel[211].setRotationPoint(37F, -20.75F, -26F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.97F, 0F, 0F, 1.97F, 0F, 0F, 0F, 0F); // Box 669
		bodyModel[212].setRotationPoint(37F, -20.75F, -29.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.97F, 0F, 0F, 1.97F, 0F, 0F, 0F, 0F); // Box 673
		bodyModel[213].setRotationPoint(37F, -20.75F, 25.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.97F, 0F, 0F, 1.97F, 0F, 0F, 0F, 0F); // Box 674
		bodyModel[214].setRotationPoint(37F, -20.75F, 29F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.97F, 0F, 0F, 1.97F, 0F, 0F, 0F, 0F); // Box 675
		bodyModel[215].setRotationPoint(37F, -20.75F, 32.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.03F, 0F); // Box 676
		bodyModel[216].setRotationPoint(54F, -18.9F, 24.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[217].setRotationPoint(64F, -17F, 24.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.03F, 0F); // Box 678
		bodyModel[218].setRotationPoint(54F, -18.9F, 27.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 679
		bodyModel[219].setRotationPoint(64F, -17F, 27.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.03F, 0F); // Box 680
		bodyModel[220].setRotationPoint(54F, -18.9F, 30.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		bodyModel[221].setRotationPoint(64F, -17F, 30.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 682
		bodyModel[222].setRotationPoint(64F, -17F, 33.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, -0.03F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -0.03F, 0F); // Box 683
		bodyModel[223].setRotationPoint(54F, -18.9F, 33.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 684
		bodyModel[224].setRotationPoint(70F, -17F, 24.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 685
		bodyModel[225].setRotationPoint(70F, -17F, 27.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.75F, 0.05F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -0.75F, 0.05F, 0F, -0.25F, -2F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, -0.25F, -2F, 0F); // Box 686
		bodyModel[226].setRotationPoint(73.75F, -14.75F, 24.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 687
		bodyModel[227].setRotationPoint(70F, -17F, 30.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.75F, 0.05F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -0.75F, 0.05F, 0F, -0.25F, -2F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, -0.25F, -2F, 0F); // Box 688
		bodyModel[228].setRotationPoint(73.75F, -14.75F, 27.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0.5F, -2.2F, 0F, 0.5F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[229].setRotationPoint(70F, -17F, 33.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.75F, 0.05F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -0.75F, 0.05F, 0F, -0.25F, -2F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, -0.25F, -2F, 0F); // Box 690
		bodyModel[230].setRotationPoint(73.75F, -14.75F, 30.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 6, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 694
		bodyModel[231].setRotationPoint(-69.25F, -21.75F, -10.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 6, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 695
		bodyModel[232].setRotationPoint(-69.25F, -21F, -10.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 696
		bodyModel[233].setRotationPoint(-69.25F, -20.25F, -10.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 6, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 697
		bodyModel[234].setRotationPoint(-69.25F, -19.5F, -10.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 6, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 698
		bodyModel[235].setRotationPoint(-69.25F, -18.75F, -10.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 699
		bodyModel[236].setRotationPoint(-69.5F, -22F, -10.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 700
		bodyModel[237].setRotationPoint(-69.5F, -22F, -6.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 701
		bodyModel[238].setRotationPoint(-69.5F, -22F, 13.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 702
		bodyModel[239].setRotationPoint(-69.5F, -22F, 9.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 6, 4, 25, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // Box 703
		bodyModel[240].setRotationPoint(-69.1F, -21.75F, -10.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 15, 2, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		bodyModel[241].setRotationPoint(-45.5F, -24.5F, -20F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 27, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		bodyModel[242].setRotationPoint(-57.5F, -24.5F, 16.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 706
		bodyModel[243].setRotationPoint(-57.5F, -25.5F, 20.75F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 512
		bodyModel[244].setRotationPoint(-47F, -24F, -18.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 513
		bodyModel[245].setRotationPoint(-47F, -24F, -11.25F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 514
		bodyModel[246].setRotationPoint(-47F, -24F, -4.25F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 515
		bodyModel[247].setRotationPoint(-47F, -24F, 3.25F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 516
		bodyModel[248].setRotationPoint(-47F, -24F, 10.25F);

		bodyModel[249].addShapeBox(-10F, 0F, -14F, 3, 3, 6, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[249].setRotationPoint(-47F, -24F, 3.25F);

		bodyModel[250].addShapeBox(-8F, 0F, 8F, 6, 3, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		bodyModel[250].setRotationPoint(-47F, -24F, 3.25F);

		bodyModel[251].addShapeBox(0F, -0.1F, 0F, 17, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[251].setRotationPoint(15F, -22.1F, -33F);
		bodyModel[251].rotateAngleZ = -0.03490659F;

		bodyModel[252].addShapeBox(0F, -0.1F, 0F, 17, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 988
		bodyModel[252].setRotationPoint(15F, -22.1F, 27F);
		bodyModel[252].rotateAngleZ = -0.03490659F;

		bodyModel[253].addShapeBox(0F, -0.1F, 0F, 17, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 989
		bodyModel[253].setRotationPoint(-15F, -23.1F, 27F);
		bodyModel[253].rotateAngleZ = -0.03490659F;

		bodyModel[254].addShapeBox(0F, -0.1F, 0F, 17, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		bodyModel[254].setRotationPoint(-15F, -23.1F, -33F);
		bodyModel[254].rotateAngleZ = -0.03490659F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 34, 2, 34, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 995
		bodyModel[255].setRotationPoint(-45F, -24.75F, -19.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 23, 22, 47, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		bodyModel[256].setRotationPoint(16F, -22F, -23F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 645
		turretModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 646
		turretModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 647
		turretModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 648
		turretModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 649
		turretModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 650
		turretModel[6] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 651
		turretModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 652
		turretModel[8] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 653
		turretModel[9] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 654
		turretModel[10] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 655
		turretModel[11] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 656
		turretModel[12] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 657
		turretModel[13] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 658
		turretModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 660
		turretModel[15] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 661
		turretModel[16] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 663
		turretModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 664
		turretModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 665
		turretModel[19] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 666
		turretModel[20] = new ModelRendererTurbo(this, 1249, 1, textureX, textureY); // Box 667
		turretModel[21] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 668
		turretModel[22] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 669
		turretModel[23] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 670
		turretModel[24] = new ModelRendererTurbo(this, 1057, 1, textureX, textureY); // Box 671
		turretModel[25] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 672
		turretModel[26] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 673
		turretModel[27] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 674
		turretModel[28] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Box 675
		turretModel[29] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 676
		turretModel[30] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 677
		turretModel[31] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 678
		turretModel[32] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 679
		turretModel[33] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 680
		turretModel[34] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 681
		turretModel[35] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 239
		turretModel[36] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 243
		turretModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 244
		turretModel[38] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 245
		turretModel[39] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 246
		turretModel[40] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 232
		turretModel[41] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 233
		turretModel[42] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 265
		turretModel[43] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 266
		turretModel[44] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 267
		turretModel[45] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 268
		turretModel[46] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 269
		turretModel[47] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 270
		turretModel[48] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 765
		turretModel[49] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 696
		turretModel[50] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 697
		turretModel[51] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 698
		turretModel[52] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 700
		turretModel[53] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 701
		turretModel[54] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 702
		turretModel[55] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 703
		turretModel[56] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 704
		turretModel[57] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 705
		turretModel[58] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 706
		turretModel[59] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 707
		turretModel[60] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 708
		turretModel[61] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 709
		turretModel[62] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 710
		turretModel[63] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 711
		turretModel[64] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 713
		turretModel[65] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Box 714
		turretModel[66] = new ModelRendererTurbo(this, 1665, 1, textureX, textureY); // Box 715
		turretModel[67] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 716
		turretModel[68] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 717
		turretModel[69] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 718
		turretModel[70] = new ModelRendererTurbo(this, 1057, 1, textureX, textureY); // Box 719
		turretModel[71] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 720
		turretModel[72] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 721
		turretModel[73] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 722
		turretModel[74] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 723
		turretModel[75] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 769
		turretModel[76] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 770
		turretModel[77] = new ModelRendererTurbo(this, 1393, 1, textureX, textureY); // Box 771
		turretModel[78] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 772
		turretModel[79] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 773
		turretModel[80] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 774
		turretModel[81] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 775
		turretModel[82] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 776
		turretModel[83] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 777
		turretModel[84] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 778
		turretModel[85] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 779
		turretModel[86] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 780
		turretModel[87] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 781
		turretModel[88] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 782
		turretModel[89] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Box 831
		turretModel[90] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 832
		turretModel[91] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 834
		turretModel[92] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 835
		turretModel[93] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 836
		turretModel[94] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 837
		turretModel[95] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 838
		turretModel[96] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 855
		turretModel[97] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 856
		turretModel[98] = new ModelRendererTurbo(this, 1113, 1, textureX, textureY); // Box 857
		turretModel[99] = new ModelRendererTurbo(this, 1849, 9, textureX, textureY); // Box 858
		turretModel[100] = new ModelRendererTurbo(this, 1921, 9, textureX, textureY); // Box 859
		turretModel[101] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 863
		turretModel[102] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 864
		turretModel[103] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 865
		turretModel[104] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 866
		turretModel[105] = new ModelRendererTurbo(this, 1481, 9, textureX, textureY); // Box 867
		turretModel[106] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 868
		turretModel[107] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 869
		turretModel[108] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Box 870
		turretModel[109] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 871
		turretModel[110] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 910
		turretModel[111] = new ModelRendererTurbo(this, 1953, 137, textureX, textureY); // Box 781
		turretModel[112] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 850
		turretModel[113] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 851
		turretModel[114] = new ModelRendererTurbo(this, 1417, 41, textureX, textureY); // Box 852
		turretModel[115] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 853
		turretModel[116] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 854
		turretModel[117] = new ModelRendererTurbo(this, 1185, 153, textureX, textureY); // Box 897
		turretModel[118] = new ModelRendererTurbo(this, 1233, 153, textureX, textureY); // Box 898
		turretModel[119] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 899
		turretModel[120] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 900
		turretModel[121] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 901
		turretModel[122] = new ModelRendererTurbo(this, 1257, 153, textureX, textureY); // Box 902
		turretModel[123] = new ModelRendererTurbo(this, 1033, 121, textureX, textureY); // Box 954
		turretModel[124] = new ModelRendererTurbo(this, 1361, 73, textureX, textureY); // Box 955
		turretModel[125] = new ModelRendererTurbo(this, 1393, 73, textureX, textureY); // Box 956
		turretModel[126] = new ModelRendererTurbo(this, 1417, 73, textureX, textureY); // Box 957
		turretModel[127] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 958
		turretModel[128] = new ModelRendererTurbo(this, 1697, 153, textureX, textureY); // Box 959
		turretModel[129] = new ModelRendererTurbo(this, 1729, 153, textureX, textureY); // Box 960
		turretModel[130] = new ModelRendererTurbo(this, 1753, 153, textureX, textureY); // Box 961

		turretModel[0].addShapeBox(-1F, -1F, -26F, 11, 1, 53, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 645
		turretModel[0].setRotationPoint(0F, -22.45F, 0F);

		turretModel[1].addShapeBox(10F, -1F, -26F, 9, 1, 53, 0F,0F, 0.5F, 0.5F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, -3F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, -0.5F); // Box 646
		turretModel[1].setRotationPoint(0F, -22.45F, 0F);

		turretModel[2].addShapeBox(19.5F, -1F, -22.5F, 4, 1, 46, 0F,0F, 0.5F, 1.5F, 0.5F, 0.5F, -2F, 0.5F, 0.5F, -3F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, 0F); // Box 647
		turretModel[2].setRotationPoint(0F, -22.45F, 0F);

		turretModel[3].addShapeBox(24F, -1F, -19F, 5, 1, 39, 0F,0F, 0.5F, 1.5F, 1.5F, 0.5F, -7F, 1.5F, 0.5F, -8F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, -8.5F, 0.5F, 0F, -9.5F, 0F, 0F, 0F); // Box 648
		turretModel[3].setRotationPoint(0F, -22.45F, 0F);

		turretModel[4].addShapeBox(-10F, -1F, -26F, 9, 1, 53, 0F,0.5F, 0.5F, -3F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, -4F, 0.5F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -4.5F); // Box 649
		turretModel[4].setRotationPoint(0F, -22.45F, 0F);

		turretModel[5].addShapeBox(-19.5F, -1F, -22.5F, 9, 1, 46, 0F,0.5F, 0.5F, -7F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -7.5F, 0.5F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -8.5F); // Box 650
		turretModel[5].setRotationPoint(0F, -22.45F, 0F);

		turretModel[6].addShapeBox(-25F, -1F, -15F, 5, 1, 30, 0F,1F, 0.5F, -8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 1F, 0.5F, -9F, 0.5F, 0F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -9.5F); // Box 651
		turretModel[6].setRotationPoint(0F, -22.45F, 0F);

		turretModel[7].addShapeBox(-1F, -7.5F, -26F, 11, 6, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 652
		turretModel[7].setRotationPoint(0F, -22.45F, 0F);

		turretModel[8].addShapeBox(10F, -7.5F, -26F, 9, 6, 52, 0F,0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 1.5F); // Box 653
		turretModel[8].setRotationPoint(0F, -22.45F, 0F);

		turretModel[9].addShapeBox(-10F, -7.5F, -26F, 9, 6, 52, 0F,0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.5F, 0F, -3F); // Box 654
		turretModel[9].setRotationPoint(0F, -22.45F, 0F);

		turretModel[10].addShapeBox(-19.5F, -6F, -22.5F, 9, 5, 46, 0F,0.5F, 0.5F, -7F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0.5F, 0.5F, -7.5F, 0.5F, -0.5F, -7F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -7.5F); // Box 655
		turretModel[10].setRotationPoint(0F, -22.45F, 0F);

		turretModel[11].addShapeBox(-25F, -6F, -15F, 5, 4, 30, 0F,2F, 0.5F, -8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 2F, 0.5F, -9F, 1F, 0.5F, -8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 1F, 0.5F, -9F); // Box 656
		turretModel[11].setRotationPoint(0F, -22.45F, 0F);

		turretModel[12].addShapeBox(19.5F, -7.5F, -23.5F, 4, 6, 47, 0F,0F, 0F, -1F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0F, 0F, 0.5F); // Box 657
		turretModel[12].setRotationPoint(0F, -22.45F, 0F);

		turretModel[13].addShapeBox(24F, -7.5F, -20F, 6, 6, 22, 0F,0F, 0F, -1.5F, -1F, 0F, -8.5F, -0.5F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0.5F, 0.5F, 0F, -8F, 0.5F, 0F, -8F, 0F, 0F, -8F); // Box 658
		turretModel[13].setRotationPoint(0F, -22.45F, 0F);

		turretModel[14].addShapeBox(24F, -7.5F, -2F, 5, 6, 21, 0F,0F, 0F, -8F, 0.5F, 0F, -8F, 0F, 0F, -7.5F, 0F, 0F, -0.5F, 0F, 0F, -8F, 1.5F, 0F, -8F, 1.5F, 0F, -7F, 0F, 0F, 1.5F); // Box 660
		turretModel[14].setRotationPoint(0F, -22.45F, 0F);

		turretModel[15].addShapeBox(10F, -10.5F, -26F, 9, 3, 52, 0F,0F, 0F, -3.5F, 0.5F, 0F, -10.5F, 0.5F, 0F, -10.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, 0.5F); // Box 661
		turretModel[15].setRotationPoint(0F, -22.45F, 0F);

		turretModel[16].addShapeBox(19.5F, -10.5F, -22.5F, 4, 3, 46, 0F,0F, 0F, -7F, 0.5F, 0F, -13F, 0.5F, 0F, -16F, 0F, 0F, -8F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -5F, 0F, 0F, -1F); // Box 663
		turretModel[16].setRotationPoint(0F, -22.45F, 0F);

		turretModel[17].addShapeBox(24F, -10.5F, -19F, 5, 3, 21, 0F,0F, 0F, -9.5F, -3F, -1.5F, -10.5F, -3F, -1.5F, -8F, 0F, 0.75F, -7F, 0F, 0F, -0.5F, 0F, 0F, -7.5F, 0.5F, 0F, -8F, 0F, 0F, -8F); // Box 664
		turretModel[17].setRotationPoint(0F, -22.45F, 0F);

		turretModel[18].addShapeBox(24F, -10.5F, -2F, 5, 3, 21, 0F,0F, 0.6F, -7F, -3F, -1.5F, -8F, -3F, -1.5F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, -8F, 0.5F, 0F, -8F, 0F, 0F, -7.5F, 0F, 0F, -0.5F); // Box 665
		turretModel[18].setRotationPoint(0F, -22.45F, 0F);

		turretModel[19].addShapeBox(-1F, -10.5F, -26F, 11, 3, 53, 0F,0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 666
		turretModel[19].setRotationPoint(0F, -22.45F, 0F);

		turretModel[20].addShapeBox(-10F, -10.5F, -26F, 9, 3, 52, 0F,0.5F, 0F, -5F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.5F); // Box 667
		turretModel[20].setRotationPoint(0F, -22.45F, 0F);

		turretModel[21].addShapeBox(-19.5F, -9F, -22.5F, 9, 3, 46, 0F,0.5F, 0.5F, -9.5F, 0F, 1.5F, -1.5F, 0F, 1.5F, -3F, 0.5F, 0.5F, -9.5F, 0.5F, -0.5F, -7F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0.5F, -0.5F, -7.5F); // Box 668
		turretModel[21].setRotationPoint(0F, -22.45F, 0F);

		turretModel[22].addShapeBox(-27F, -9F, -15F, 7, 2, 30, 0F,-0.5F, 0.5F, -8F, 0F, 0.5F, -2F, 0F, 0.5F, -1F, -0.5F, 0.5F, -9F, 0F, 0.5F, -8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, -9F); // Box 669
		turretModel[22].setRotationPoint(0F, -22.45F, 0F);

		turretModel[23].addShapeBox(-1F, -14.5F, -26F, 11, 4, 30, 0F,0F, 0.5F, -18.5F, 0F, -0.25F, -17.5F, 0F, 0F, -4F, 0F, 1.5F, -4F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 670
		turretModel[23].setRotationPoint(0F, -22.45F, 0F);

		turretModel[24].addShapeBox(-1F, -14.5F, -4F, 11, 4, 30, 0F,0F, 1.5F, -4F, 0F, 0F, -4F, 0F, -0.25F, -17.5F, 0F, 1F, -18.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 671
		turretModel[24].setRotationPoint(0F, -22.45F, 0F);

		turretModel[25].addShapeBox(10F, -14.5F, -26F, 9, 4, 29, 0F,0F, -0.25F, -17.5F, 0.5F, -2F, -21.5F, 0.5F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0.5F, 0F, -10.5F, 0.5F, 0F, -3F, 0F, 0F, -3F); // Box 672
		turretModel[25].setRotationPoint(0F, -22.45F, 0F);

		turretModel[26].addShapeBox(10F, -14.5F, -3F, 9, 4, 29, 0F,0F, 0F, -3F, 0.5F, -2F, -3F, 0.5F, -2F, -21.5F, 0F, -0.25F, -17.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -10.5F, 0F, 0F, -3.5F); // Box 673
		turretModel[26].setRotationPoint(0F, -22.45F, 0F);

		turretModel[27].addShapeBox(19.5F, -12.5F, -22.5F, 4, 2, 31, 0F,0F, 0F, -18F, 0.5F, -1F, -19F, 0.5F, -1F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, -7F, 0.5F, 0F, -13F, 0.5F, 0F, -8.5F, 0F, 0F, -8.5F); // Box 674
		turretModel[27].setRotationPoint(0F, -22.45F, 0F);

		turretModel[28].addShapeBox(19.5F, -12.5F, -8.5F, 4, 2, 31, 0F,0F, 0F, -8.5F, 0.5F, -1F, -8.5F, 0.5F, -1F, -19F, 0F, 0F, -18F, 0F, 0F, -8.5F, 0.5F, 0F, -8.5F, 0.5F, 0F, -15F, 0F, 0F, -7F); // Box 675
		turretModel[28].setRotationPoint(0F, -22.45F, 0F);

		turretModel[29].addShapeBox(-10F, -10.5F, -26F, 9, 4, 29, 0F,0.5F, 0.5F, -21F, 0F, 0.5F, -18.5F, 0F, 1.5F, -3F, 0.5F, 1F, -3F, 0.5F, 0F, -5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0.5F, 0F, -3F); // Box 676
		turretModel[29].setRotationPoint(0F, -26.45F, 0F);

		turretModel[30].addShapeBox(-10F, -10.5F, -3F, 9, 4, 29, 0F,0.5F, 1F, -3F, 0F, 1.5F, -3F, 0F, 1F, -18.5F, 0.5F, 1F, -21F, 0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0.5F, 0F, -5.5F); // Box 677
		turretModel[30].setRotationPoint(0F, -26.45F, 0F);

		turretModel[31].addShapeBox(-19.5F, -13F, -22.5F, 9, 4, 25, 0F,0.5F, -1F, -17.5F, 0F, 2F, -17.5F, 0F, 2.5F, -2.5F, 0.5F, -0.75F, -2.5F, 0.5F, -0.5F, -9.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -2.5F, 0.5F, -0.5F, -2.5F); // Box 678
		turretModel[31].setRotationPoint(0F, -22.45F, 0F);

		turretModel[32].addShapeBox(-19.5F, -13F, -2.5F, 9, 4, 25, 0F,0.5F, -0.75F, -2.5F, 0F, 2.5F, -2.5F, 0F, 2.5F, -17.5F, 0.5F, -1F, -17.5F, 0.5F, -0.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2F, 0.5F, -0.5F, -8.5F); // Box 679
		turretModel[32].setRotationPoint(0F, -22.45F, 0F);

		turretModel[33].addShapeBox(-27F, -11F, -15F, 7, 1, 16, 0F,-1.5F, -0.5F, -13.5F, 0F, 1F, -10F, 0F, 1.25F, -1F, -1.5F, -0.5F, -1F, -0.5F, 0.5F, -8F, 0F, 0.5F, -2F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F); // Box 680
		turretModel[33].setRotationPoint(0F, -22.45F, 0F);

		turretModel[34].addShapeBox(-27F, -11F, -1F, 7, 1, 16, 0F,-1.5F, -0.5F, -1F, 0F, 1.25F, -1F, 0F, 1F, -10F, -1.5F, -0.5F, -13.5F, -0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.5F, 0.5F, -9F); // Box 681
		turretModel[34].setRotationPoint(0F, -22.45F, 0F);

		turretModel[35].addShapeBox(-11.3F, -20F, 5.5F, 11, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		turretModel[35].setRotationPoint(0F, -19.2F, 0F);
		turretModel[35].rotateAngleX = -0.12217305F;
		turretModel[35].rotateAngleZ = 0.08726646F;

		turretModel[36].addShapeBox(-11.3F, -20.35F, 2.5F, 11, 4, 3, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		turretModel[36].setRotationPoint(0F, -19.2F, 0F);
		turretModel[36].rotateAngleX = -0.12217305F;
		turretModel[36].rotateAngleZ = 0.08726646F;

		turretModel[37].addShapeBox(-8.8F, -20.55F, 1.5F, 7, 4, 1, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		turretModel[37].setRotationPoint(0F, -19.2F, 0F);
		turretModel[37].rotateAngleX = -0.12217305F;
		turretModel[37].rotateAngleZ = 0.08726646F;

		turretModel[38].addShapeBox(-11.3F, -19F, 12.5F, 11, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.45F, 0F, -2.5F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 245
		turretModel[38].setRotationPoint(0F, -19.2F, 0F);
		turretModel[38].rotateAngleX = -0.12217305F;
		turretModel[38].rotateAngleZ = 0.08726646F;

		turretModel[39].addShapeBox(-8.8F, -18.55F, 15.5F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 246
		turretModel[39].setRotationPoint(0F, -19.2F, 0F);
		turretModel[39].rotateAngleX = -0.12217305F;
		turretModel[39].rotateAngleZ = 0.08726646F;

		turretModel[40].addShapeBox(10.3F, -16.8F, 3.6F, 7, 4, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		turretModel[40].setRotationPoint(0F, -19.1F, 0F);

		turretModel[41].addShapeBox(10.3F, -17.8F, 3.6F, 7, 1, 10, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233
		turretModel[41].setRotationPoint(0F, -19.1F, 0F);

		turretModel[42].addShapeBox(12.5F, -17.4F, 10.6F, 7, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 265
		turretModel[42].setRotationPoint(0F, -19.1F, 0F);

		turretModel[43].addShapeBox(12.5F, -17.4F, 7.6F, 7, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 266
		turretModel[43].setRotationPoint(0F, -19.1F, 0F);

		turretModel[44].addShapeBox(12.5F, -18F, 8.1F, 7, 1, 3, 0F,0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 267
		turretModel[44].setRotationPoint(0F, -19.1F, 0F);

		turretModel[45].addShapeBox(19.5F, -16F, 10.6F, 2, 4, 1, 0F,0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 2F, 0F, -0.4F, 2F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 268
		turretModel[45].setRotationPoint(0F, -19.1F, 0F);

		turretModel[46].addShapeBox(19.5F, -16F, 7.6F, 2, 4, 1, 0F,0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 2F, 0F, -0.4F, 2F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 269
		turretModel[46].setRotationPoint(0F, -19.1F, 0F);

		turretModel[47].addShapeBox(13.5F, -17.9F, 8.1F, 5, 5, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 270
		turretModel[47].setRotationPoint(0F, -19.1F, 0F);

		turretModel[48].addShapeBox(15.5F, -18F, 8.1F, 3, 5, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 765
		turretModel[48].setRotationPoint(1F, -17.5F, 0F);

		turretModel[49].addShapeBox(5.3F, -17.75F, -22.9F, 3, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		turretModel[49].setRotationPoint(0F, -19.1F, 0F);

		turretModel[50].addShapeBox(4.75F, -18F, -13.9F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		turretModel[50].setRotationPoint(0F, -19.1F, 0F);

		turretModel[51].addShapeBox(5.75F, -18F, -20.9F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		turretModel[51].setRotationPoint(0F, -19.1F, 0F);

		turretModel[52].addShapeBox(4.75F, -18.25F, -23F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		turretModel[52].setRotationPoint(0F, -19.1F, 0F);

		turretModel[53].addShapeBox(4.75F, -18.25F, -24F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 701
		turretModel[53].setRotationPoint(0F, -19.1F, 0F);

		turretModel[54].addShapeBox(4.75F, -17.25F, -24F, 4, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		turretModel[54].setRotationPoint(0F, -19.1F, 0F);

		turretModel[55].addShapeBox(5.75F, -17.25F, -24.25F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 703
		turretModel[55].setRotationPoint(0F, -19.1F, 0F);

		turretModel[56].addShapeBox(4.75F, -18F, -8.9F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		turretModel[56].setRotationPoint(0F, -19.1F, 0F);

		turretModel[57].addShapeBox(4.75F, -17F, -21F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		turretModel[57].setRotationPoint(0F, -19.1F, 0F);

		turretModel[58].addShapeBox(8F, -18.5F, -23F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 706
		turretModel[58].setRotationPoint(0F, -19.1F, 0F);

		turretModel[59].addShapeBox(7.8F, -17.5F, -23F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 707
		turretModel[59].setRotationPoint(0F, -19.1F, 0F);

		turretModel[60].addShapeBox(-1.75F, -18F, -19.9F, 5, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 708
		turretModel[60].setRotationPoint(0F, -19.1F, 0F);

		turretModel[61].addShapeBox(-14.75F, -18F, -17.9F, 5, 5, 12, 0F,0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 2F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 7F, 1F, 0F, 0F); // Box 709
		turretModel[61].setRotationPoint(0F, -19.1F, 0F);

		turretModel[62].addShapeBox(-9.75F, -18F, -21.9F, 8, 5, 13, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 710
		turretModel[62].setRotationPoint(0F, -19.1F, 0F);

		turretModel[63].addShapeBox(-14.75F, -19F, -17.9F, 5, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F); // Box 711
		turretModel[63].setRotationPoint(0F, -19.1F, 0F);

		turretModel[64].addShapeBox(-1.75F, -19F, -17.9F, 5, 1, 12, 0F,0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F); // Box 713
		turretModel[64].setRotationPoint(0F, -19.1F, 0F);

		turretModel[65].addShapeBox(-9.75F, -19F, -19.9F, 8, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		turretModel[65].setRotationPoint(0F, -19.1F, 0F);

		turretModel[66].addShapeBox(-8.75F, -20.5F, -18.9F, 6, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		turretModel[66].setRotationPoint(0F, -19.1F, 0F);

		turretModel[67].addShapeBox(-12.75F, -20.5F, -16.9F, 4, 2, 10, 0F,0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F); // Box 716
		turretModel[67].setRotationPoint(0F, -19.1F, 0F);

		turretModel[68].addShapeBox(-2.75F, -20.5F, -16.9F, 4, 2, 10, 0F,0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F); // Box 717
		turretModel[68].setRotationPoint(0F, -19.1F, 0F);

		turretModel[69].addShapeBox(-8.75F, -21.5F, -18.9F, 6, 1, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		turretModel[69].setRotationPoint(0F, -19.1F, 0F);

		turretModel[70].addShapeBox(-12.75F, -21.5F, -16.9F, 4, 1, 10, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F); // Box 719
		turretModel[70].setRotationPoint(0F, -19.1F, 0F);

		turretModel[71].addShapeBox(-2.75F, -21.5F, -16.9F, 4, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F); // Box 720
		turretModel[71].setRotationPoint(0F, -19.1F, 0F);

		turretModel[72].addShapeBox(-8.75F, -21.5F, -17.9F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		turretModel[72].setRotationPoint(0F, -19.1F, 0F);

		turretModel[73].addShapeBox(-8.75F, -23.5F, -17.9F, 5, 2, 11, 0F,0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		turretModel[73].setRotationPoint(0F, -19.1F, 0F);

		turretModel[74].addShapeBox(-11.75F, -22.5F, -18.9F, 5, 1, 13, 0F,0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 723
		turretModel[74].setRotationPoint(0F, -19.1F, 0F);

		turretModel[75].addShapeBox(-3.75F, -22.5F, -18.25F, 3, 1, 12, 0F,0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 769
		turretModel[75].setRotationPoint(0F, -19.1F, 0F);

		turretModel[76].addShapeBox(1.25F, -16.75F, 13.1F, 3, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		turretModel[76].setRotationPoint(0F, -19.1F, 0F);

		turretModel[77].addShapeBox(4.25F, -16.75F, 13.1F, 3, 1, 8, 0F,0F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 771
		turretModel[77].setRotationPoint(0F, -19.1F, 0F);

		turretModel[78].addShapeBox(-1.75F, -16.75F, 13.1F, 3, 1, 8, 0F,-1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 772
		turretModel[78].setRotationPoint(0F, -19.1F, 0F);

		turretModel[79].addShapeBox(1.25F, -15.75F, 13.1F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		turretModel[79].setRotationPoint(0F, -19.1F, 0F);

		turretModel[80].addShapeBox(4.25F, -15.75F, 13.1F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 774
		turretModel[80].setRotationPoint(0F, -19.1F, 0F);

		turretModel[81].addShapeBox(-1.75F, -15.75F, 13.1F, 3, 2, 8, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 775
		turretModel[81].setRotationPoint(0F, -19.1F, 0F);

		turretModel[82].addShapeBox(2.25F, -20.75F, 15.5F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		turretModel[82].setRotationPoint(0F, -19.1F, 0F);

		turretModel[83].addShapeBox(1.25F, -20.75F, 15.5F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		turretModel[83].setRotationPoint(0F, -19.1F, 0F);

		turretModel[84].addShapeBox(4.25F, -20.75F, 15.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 778
		turretModel[84].setRotationPoint(0F, -19.1F, 0F);

		turretModel[85].addShapeBox(0.25F, -19.75F, 15.5F, 1, 4, 3, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 779
		turretModel[85].setRotationPoint(0F, -19.1F, 0F);

		turretModel[86].addShapeBox(1.25F, -19.75F, 14.5F, 3, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
		turretModel[86].setRotationPoint(0F, -19.1F, 0F);

		turretModel[87].addShapeBox(1.25F, -19.75F, 18.5F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 781
		turretModel[87].setRotationPoint(0F, -19.1F, 0F);

		turretModel[88].addShapeBox(4.35F, -20.5F, 15.5F, 1, 1, 3, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 782
		turretModel[88].setRotationPoint(0F, -19F, 0F);

		turretModel[89].addShapeBox(24F, -12F, -5F, 5, 2, 10, 0F,0F, 0F, 0F, 1F, -2.5F, -3F, 1F, -2.5F, -3F, 0F, 0F, 0F, 0F, -0.75F, 1.75F, 2F, 2F, -1F, 2F, 2F, -1F, 0F, -0.75F, 1.75F); // Box 831
		turretModel[89].setRotationPoint(0F, -22.45F, 0F);

		turretModel[90].addShapeBox(24F, -11F, -5F, 7, 7, 10, 0F,0F, -0.25F, 1.75F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -0.25F, 1.75F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F); // Box 832
		turretModel[90].setRotationPoint(0F, -22.45F, 0F);

		turretModel[91].addShapeBox(24F, -4F, -6F, 7, 4, 12, 0F,0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 834
		turretModel[91].setRotationPoint(0F, -22.45F, 0F);

		turretModel[92].addShapeBox(18F, -12F, -5F, 6, 2, 10, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 2F, 1F, 0F, 0F, -0.75F, 1.75F, 0F, -0.75F, 1.75F, 2F, 1F, 0F); // Box 835
		turretModel[92].setRotationPoint(0F, -22.45F, 0F);

		turretModel[93].addShapeBox(24.5F, 0F, -8.75F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 836
		turretModel[93].setRotationPoint(0F, -22.45F, 0F);
		turretModel[93].rotateAngleZ = 0.19198622F;

		turretModel[94].addShapeBox(24.5F, -1F, -8.75F, 6, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 837
		turretModel[94].setRotationPoint(0F, -22.45F, 0F);
		turretModel[94].rotateAngleZ = 0.19198622F;

		turretModel[95].addShapeBox(24.5F, 1F, -8.75F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 838
		turretModel[95].setRotationPoint(0F, -22.45F, 0F);
		turretModel[95].rotateAngleZ = 0.19198622F;

		turretModel[96].addShapeBox(18.7F, -4.5F, 21.4F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F); // Box 855
		turretModel[96].setRotationPoint(0F, -22.45F, 0F);

		turretModel[97].addShapeBox(-7.55F, -4.5F, 24.6F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F); // Box 856
		turretModel[97].setRotationPoint(0F, -22.45F, 0F);

		turretModel[98].addShapeBox(-6.8F, -4.5F, 28.1F, 6, 1, 1, 0F,0F, -0.25F, 1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.5F, 0F, -0.25F, 1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.5F); // Box 857
		turretModel[98].setRotationPoint(0F, -22.45F, 0F);

		turretModel[99].addShapeBox(-0.8F, -4.5F, 28.08F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 858
		turretModel[99].setRotationPoint(0F, -22.45F, 0F);

		turretModel[100].addShapeBox(-1.2F, -4.5F, 29.5F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0.2F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.2F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F); // Box 859
		turretModel[100].setRotationPoint(0F, -22.45F, 0F);
		turretModel[100].rotateAngleY = -0.34906585F;

		turretModel[101].addShapeBox(12.5F, -6F, -25.5F, 3, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 863
		turretModel[101].setRotationPoint(0F, -22.45F, 0F);

		turretModel[102].addShapeBox(9.5F, -6F, 22.25F, 3, 1, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 864
		turretModel[102].setRotationPoint(0F, -22.45F, 0F);

		turretModel[103].addShapeBox(-5.5F, -6F, 21.25F, 3, 1, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 865
		turretModel[103].setRotationPoint(0F, -22.45F, 0F);

		turretModel[104].addShapeBox(2F, -6F, 22F, 3, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 866
		turretModel[104].setRotationPoint(0F, -22.45F, 0F);

		turretModel[105].addShapeBox(-2.3F, -21F, 4.5F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 867
		turretModel[105].setRotationPoint(0F, -19.2F, 0F);
		turretModel[105].rotateAngleX = -0.12217305F;
		turretModel[105].rotateAngleZ = 0.08726646F;

		turretModel[106].addShapeBox(-3.1F, -21F, 5.5F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 868
		turretModel[106].setRotationPoint(0F, -19.2F, 0F);
		turretModel[106].rotateAngleX = -0.12217305F;
		turretModel[106].rotateAngleZ = 0.08726646F;

		turretModel[107].addShapeBox(-3.1F, -20.4F, 11.5F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 869
		turretModel[107].setRotationPoint(0F, -19.2F, 0F);
		turretModel[107].rotateAngleX = -0.12217305F;
		turretModel[107].rotateAngleZ = 0.08726646F;

		turretModel[108].addShapeBox(-3.3F, -20.4F, 7.5F, 4, 4, 3, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		turretModel[108].setRotationPoint(0F, -19.2F, 0F);
		turretModel[108].rotateAngleX = -0.12217305F;
		turretModel[108].rotateAngleZ = 0.08726646F;

		turretModel[109].addShapeBox(-14.5F, -15.5F, -2F, 3, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 871
		turretModel[109].setRotationPoint(0F, -22.45F, 0F);

		turretModel[110].addShapeBox(24.1F, -9.75F, 10.75F, 3, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 910
		turretModel[110].setRotationPoint(0.5F, -19.45F, -1F);

		turretModel[111].addShapeBox(-1.25F, -17.6F, -20.5F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		turretModel[111].setRotationPoint(0F, -19.1F, 0F);

		turretModel[112].addShapeBox(-1F, -2F, -28.5F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 850
		turretModel[112].setRotationPoint(0F, -22.45F, 0F);

		turretModel[113].addShapeBox(-1.2F, -2F, -29.88F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0.2F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0.2F, -0.25F, -1.25F, 0F, -0.25F, -0.25F); // Box 851
		turretModel[113].setRotationPoint(0F, -22.45F, 0F);
		turretModel[113].rotateAngleY = 0.34906585F;

		turretModel[114].addShapeBox(-7F, -2F, -28.5F, 6, 1, 1, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1F); // Box 852
		turretModel[114].setRotationPoint(0F, -22.45F, 0F);

		turretModel[115].addShapeBox(-7.75F, -2F, -27F, 1, 1, 3, 0F,-0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 853
		turretModel[115].setRotationPoint(0F, -22.45F, 0F);

		turretModel[116].addShapeBox(18.5F, -2F, -25.8F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 854
		turretModel[116].setRotationPoint(0F, -22.45F, 0F);

		turretModel[117].addShapeBox(30.5F, -6F, 5.75F, 2, 3, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 897
		turretModel[117].setRotationPoint(0F, -22.45F, 0F);

		turretModel[118].addShapeBox(30.5F, -8.5F, 5.75F, 2, 3, 7, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 898
		turretModel[118].setRotationPoint(0F, -22.45F, 0F);

		turretModel[119].addShapeBox(29.5F, -5.5F, 5.75F, 1, 2, 7, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 899
		turretModel[119].setRotationPoint(0F, -22.45F, 0F);

		turretModel[120].addShapeBox(29.5F, -7.5F, 5.75F, 1, 2, 7, 0F,0F, -1.25F, -2.75F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, -1.25F, -2.75F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 900
		turretModel[120].setRotationPoint(0F, -22.45F, 0F);

		turretModel[121].addShapeBox(29.5F, -3.5F, 5.75F, 1, 2, 7, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.25F, -2.75F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, -1.25F, -2.75F); // Box 901
		turretModel[121].setRotationPoint(0F, -22.45F, 0F);

		turretModel[122].addShapeBox(30.5F, -3.5F, 5.75F, 2, 3, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 902
		turretModel[122].setRotationPoint(0F, -22.45F, 0F);

		turretModel[123].addShapeBox(24.5F, 3.5F, -10F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		turretModel[123].setRotationPoint(0F, -22.45F, 0F);
		turretModel[123].rotateAngleZ = 0.19198622F;

		turretModel[124].addShapeBox(-19F, -17F, 6.5F, 2, 2, 4, 0F,0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		turretModel[124].setRotationPoint(0F, -22.45F, 0F);

		turretModel[125].addShapeBox(-19F, -15.25F, 6.5F, 2, 2, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 956
		turretModel[125].setRotationPoint(0F, -22.45F, 0F);

		turretModel[126].addShapeBox(-19F, -13.5F, 6.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F); // Box 957
		turretModel[126].setRotationPoint(0F, -22.45F, 0F);

		turretModel[127].addShapeBox(-17.25F, -14.5F, 8F, 1, 3, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 958
		turretModel[127].setRotationPoint(0F, -22.45F, 0F);

		turretModel[128].addShapeBox(30.7F, -8.5F, 5.75F, 2, 3, 7, 0F,0F, -0.7F, -2.2F, 0F, -0.7F, -2.2F, 0F, -0.7F, -2.2F, 0F, -0.7F, -2.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F); // Box 959
		turretModel[128].setRotationPoint(0F, -22.45F, 0F);

		turretModel[129].addShapeBox(30.7F, -3.5F, 5.75F, 2, 3, 7, 0F,0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.7F, -2.2F, 0F, -0.7F, -2.2F, 0F, -0.7F, -2.2F, 0F, -0.7F, -2.2F); // Box 960
		turretModel[129].setRotationPoint(0F, -22.45F, 0F);

		turretModel[130].addShapeBox(30.7F, -6F, 5.75F, 2, 3, 7, 0F,0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F); // Box 961
		turretModel[130].setRotationPoint(0F, -22.45F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1921, 73, textureX, textureY); // Box 451
		barrelModel[1] = new ModelRendererTurbo(this, 1521, 81, textureX, textureY); // Box 452
		barrelModel[2] = new ModelRendererTurbo(this, 1641, 81, textureX, textureY); // Box 453
		barrelModel[3] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 454
		barrelModel[4] = new ModelRendererTurbo(this, 1025, 17, textureX, textureY); // Box 455
		barrelModel[5] = new ModelRendererTurbo(this, 1409, 17, textureX, textureY); // Box 456
		barrelModel[6] = new ModelRendererTurbo(this, 1057, 57, textureX, textureY); // Box 484
		barrelModel[7] = new ModelRendererTurbo(this, 1089, 57, textureX, textureY); // Box 485
		barrelModel[8] = new ModelRendererTurbo(this, 1393, 57, textureX, textureY); // Box 486
		barrelModel[9] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 512
		barrelModel[10] = new ModelRendererTurbo(this, 1921, 73, textureX, textureY); // Box 859
		barrelModel[11] = new ModelRendererTurbo(this, 1521, 81, textureX, textureY); // Box 860
		barrelModel[12] = new ModelRendererTurbo(this, 1641, 81, textureX, textureY); // Box 861
		barrelModel[13] = new ModelRendererTurbo(this, 1409, 17, textureX, textureY); // Box 656
		barrelModel[14] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 657
		barrelModel[15] = new ModelRendererTurbo(this, 1025, 17, textureX, textureY); // Box 658

		barrelModel[0].addShapeBox(53.5F, -1F, -2.25F, 17, 2, 4, 0F,0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F); // Box 451
		barrelModel[0].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[1].addShapeBox(53.5F, 0.5F, -2.25F, 17, 2, 4, 0F,0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F); // Box 452
		barrelModel[1].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[2].addShapeBox(53.5F, -2.5F, -2.25F, 17, 2, 4, 0F,0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F); // Box 453
		barrelModel[2].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[3].addShapeBox(70.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 454
		barrelModel[3].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[4].addShapeBox(70.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 455
		barrelModel[4].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[5].addShapeBox(70.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 456
		barrelModel[5].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[6].addShapeBox(100F, -1F, -2.25F, 3, 2, 4, 0F,110F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 110F, -0.4F, -0.15F, 110F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 110F, -0.4F, -0.15F); // Box 484
		barrelModel[6].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[7].addShapeBox(100F, 0.35F, -2.25F, 3, 2, 4, 0F,110F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 110F, -0.25F, -0.15F, 110F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 110F, -0.7F, -1.1F); // Box 485
		barrelModel[7].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[8].addShapeBox(100F, -2.35F, -2.25F, 3, 2, 4, 0F,95F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 0F, -0.7F, -1.1F, 95F, -0.7F, -1.1F, 5F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 110F, -0.25F, -0.15F); // Box 486
		barrelModel[8].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[9].addShapeBox(-2.5F, -1F, -8.5F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 512
		barrelModel[9].setRotationPoint(32F, -27.2F, 0.2F);

		barrelModel[10].addShapeBox(-13.5F, -1F, -2.25F, 17, 2, 4, 0F,0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F); // Box 859
		barrelModel[10].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[11].addShapeBox(-13.5F, 0.5F, -2.25F, 17, 2, 4, 0F,0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F); // Box 860
		barrelModel[11].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[12].addShapeBox(-13.5F, -2.5F, -2.25F, 17, 2, 4, 0F,0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F); // Box 861
		barrelModel[12].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[13].addShapeBox(98.5F, -2.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, -1F, 3F, -0.25F, -1F, 3F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0.5F, 3F, -0.25F, 0.5F, 3F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 656
		barrelModel[13].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[14].addShapeBox(98.5F, 0.5F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 3F, -0.25F, 0.5F, 3F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -1F, 3F, -0.25F, -1F, 3F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 657
		barrelModel[14].setRotationPoint(32F, -27F, 0.2F);

		barrelModel[15].addShapeBox(98.5F, -1F, -2.25F, 1, 2, 4, 0F,0F, -0.25F, 0.5F, 3F, -0.25F, 0.5F, 3F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 3F, -0.25F, 0.5F, 3F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 658
		barrelModel[15].setRotationPoint(32F, -27F, 0.2F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 2001, 49, textureX, textureY); // Box 67
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 68
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 69
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 862
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 1137, 41, textureX, textureY); // Box 863
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 1217, 41, textureX, textureY); // Box 864
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1249, 41, textureX, textureY); // Box 806
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 1737, 41, textureX, textureY); // Box 807
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 808
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 1945, 33, textureX, textureY); // Box 809
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 2025, 33, textureX, textureY); // Box 810
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 811
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 812
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 1073, 57, textureX, textureY); // Box 813
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 1097, 57, textureX, textureY); // Box 814
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 1369, 57, textureX, textureY); // Box 815
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 1401, 57, textureX, textureY); // Box 816
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 817
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1737, 57, textureX, textureY); // Box 818
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1481, 65, textureX, textureY); // Box 819
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 1513, 65, textureX, textureY); // Box 358
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 359
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 360
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 361
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Box 362
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 363
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 364
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 365
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 366
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 367
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 1057, 73, textureX, textureY); // Box 368
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 369
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 1337, 73, textureX, textureY); // Box 370
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 1369, 73, textureX, textureY); // Box 371
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 1969, 73, textureX, textureY); // Box 372
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 2009, 73, textureX, textureY); // Box 373
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 374
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 1401, 73, textureX, textureY); // Box 375
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 376
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 377
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 378
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 379
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 380
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 381
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 1033, 81, textureX, textureY); // Box 382
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 1073, 81, textureX, textureY); // Box 383
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 1105, 81, textureX, textureY); // Box 384
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 1137, 81, textureX, textureY); // Box 385
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 1169, 81, textureX, textureY); // Box 386
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 1209, 81, textureX, textureY); // Box 387
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 1249, 81, textureX, textureY); // Box 388
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 1289, 81, textureX, textureY); // Box 389
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 1313, 81, textureX, textureY); // Box 390
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 1689, 81, textureX, textureY); // Box 391
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 392
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 393
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 394
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 395
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 396
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 397
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 398
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Box 399
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 400
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 401
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 402
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 403
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 1049, 89, textureX, textureY); // Box 404
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 1329, 89, textureX, textureY); // Box 405
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 1361, 89, textureX, textureY); // Box 406
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 1969, 89, textureX, textureY); // Box 407
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 1993, 89, textureX, textureY); // Box 408
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 2017, 89, textureX, textureY); // Box 409
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 410
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 411
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Box 412
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 413
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Box 414
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 415
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 416
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 417
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 418
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 1105, 97, textureX, textureY); // Box 419
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 1137, 97, textureX, textureY); // Box 420
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 1161, 97, textureX, textureY); // Box 421
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 1185, 97, textureX, textureY); // Box 422
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 1209, 97, textureX, textureY); // Box 423
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 1241, 97, textureX, textureY); // Box 424
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 1265, 97, textureX, textureY); // Box 425
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 1297, 97, textureX, textureY); // Box 426
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 1529, 97, textureX, textureY); // Box 427
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 1545, 97, textureX, textureY); // Box 428
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 1585, 97, textureX, textureY); // Box 429
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 1625, 97, textureX, textureY); // Box 430
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 1665, 97, textureX, textureY); // Box 431
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 432
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 433

		leftTrackWheelModels[0].addShapeBox(-6.5F, 1.8F, -9F, 13, 4, 9, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 67
		leftTrackWheelModels[0].setRotationPoint(67.5F, -7.25F, 34.2F);

		leftTrackWheelModels[1].addShapeBox(-6.5F, -1.5F, -9F, 13, 3, 9, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 68
		leftTrackWheelModels[1].setRotationPoint(67.5F, -7.25F, 34.2F);

		leftTrackWheelModels[2].addShapeBox(-6.5F, -5.8F, -9F, 13, 4, 9, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 69
		leftTrackWheelModels[2].setRotationPoint(67.5F, -7.25F, 34.2F);

		leftTrackWheelModels[3].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 9, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 862
		leftTrackWheelModels[3].setRotationPoint(67.5F, -7.25F, 34.2F);

		leftTrackWheelModels[4].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 863
		leftTrackWheelModels[4].setRotationPoint(67.5F, -7.25F, 34.2F);

		leftTrackWheelModels[5].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 864
		leftTrackWheelModels[5].setRotationPoint(67.5F, -7.25F, 34.2F);

		leftTrackWheelModels[6].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 806
		leftTrackWheelModels[6].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[7].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 807
		leftTrackWheelModels[7].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[8].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 808
		leftTrackWheelModels[8].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[9].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 809
		leftTrackWheelModels[9].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[10].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 810
		leftTrackWheelModels[10].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[11].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 811
		leftTrackWheelModels[11].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[12].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 812
		leftTrackWheelModels[12].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[13].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 813
		leftTrackWheelModels[13].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[14].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 814
		leftTrackWheelModels[14].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[15].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 815
		leftTrackWheelModels[15].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[16].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 816
		leftTrackWheelModels[16].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[17].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 817
		leftTrackWheelModels[17].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[18].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 818
		leftTrackWheelModels[18].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[19].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 819
		leftTrackWheelModels[19].setRotationPoint(50F, 2.75F, 37F);

		leftTrackWheelModels[20].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 358
		leftTrackWheelModels[20].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[21].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 359
		leftTrackWheelModels[21].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[22].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 360
		leftTrackWheelModels[22].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[23].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 361
		leftTrackWheelModels[23].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[24].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 362
		leftTrackWheelModels[24].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[25].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 363
		leftTrackWheelModels[25].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[26].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 364
		leftTrackWheelModels[26].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[27].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 365
		leftTrackWheelModels[27].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[28].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 366
		leftTrackWheelModels[28].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[29].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 367
		leftTrackWheelModels[29].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[30].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 368
		leftTrackWheelModels[30].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[31].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 369
		leftTrackWheelModels[31].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[32].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 370
		leftTrackWheelModels[32].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[33].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 371
		leftTrackWheelModels[33].setRotationPoint(31.5F, 2.75F, 37F);

		leftTrackWheelModels[34].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 372
		leftTrackWheelModels[34].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[35].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 373
		leftTrackWheelModels[35].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[36].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 374
		leftTrackWheelModels[36].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[37].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 375
		leftTrackWheelModels[37].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[38].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 376
		leftTrackWheelModels[38].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[39].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 377
		leftTrackWheelModels[39].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[40].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 378
		leftTrackWheelModels[40].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[41].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 379
		leftTrackWheelModels[41].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[42].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 380
		leftTrackWheelModels[42].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[43].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 381
		leftTrackWheelModels[43].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[44].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 382
		leftTrackWheelModels[44].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[45].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 383
		leftTrackWheelModels[45].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[46].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 384
		leftTrackWheelModels[46].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[47].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 385
		leftTrackWheelModels[47].setRotationPoint(12.5F, 2.75F, 37F);

		leftTrackWheelModels[48].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 386
		leftTrackWheelModels[48].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[49].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 387
		leftTrackWheelModels[49].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[50].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 388
		leftTrackWheelModels[50].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[51].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 389
		leftTrackWheelModels[51].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[52].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 390
		leftTrackWheelModels[52].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[53].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 391
		leftTrackWheelModels[53].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[54].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 392
		leftTrackWheelModels[54].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[55].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 393
		leftTrackWheelModels[55].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[56].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 394
		leftTrackWheelModels[56].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[57].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 395
		leftTrackWheelModels[57].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[58].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 396
		leftTrackWheelModels[58].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[59].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 397
		leftTrackWheelModels[59].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[60].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 398
		leftTrackWheelModels[60].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[61].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 399
		leftTrackWheelModels[61].setRotationPoint(-4.5F, 2.75F, 37F);

		leftTrackWheelModels[62].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 400
		leftTrackWheelModels[62].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[63].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 401
		leftTrackWheelModels[63].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[64].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 402
		leftTrackWheelModels[64].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[65].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 403
		leftTrackWheelModels[65].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[66].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 404
		leftTrackWheelModels[66].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[67].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 405
		leftTrackWheelModels[67].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[68].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 406
		leftTrackWheelModels[68].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[69].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 407
		leftTrackWheelModels[69].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[70].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 408
		leftTrackWheelModels[70].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[71].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 409
		leftTrackWheelModels[71].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[72].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 410
		leftTrackWheelModels[72].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[73].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 411
		leftTrackWheelModels[73].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[74].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 412
		leftTrackWheelModels[74].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[75].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 413
		leftTrackWheelModels[75].setRotationPoint(-22.5F, 2.75F, 37F);

		leftTrackWheelModels[76].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 414
		leftTrackWheelModels[76].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[77].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 415
		leftTrackWheelModels[77].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[78].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 416
		leftTrackWheelModels[78].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[79].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 417
		leftTrackWheelModels[79].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[80].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 418
		leftTrackWheelModels[80].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[81].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 419
		leftTrackWheelModels[81].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[82].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 420
		leftTrackWheelModels[82].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[83].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 421
		leftTrackWheelModels[83].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[84].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 422
		leftTrackWheelModels[84].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[85].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 423
		leftTrackWheelModels[85].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[86].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 424
		leftTrackWheelModels[86].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[87].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 425
		leftTrackWheelModels[87].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[88].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 426
		leftTrackWheelModels[88].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[89].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 427
		leftTrackWheelModels[89].setRotationPoint(-40.5F, 2.75F, 37F);

		leftTrackWheelModels[90].addShapeBox(-2.5F, -1F, -8F, 5, 2, 11, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 428
		leftTrackWheelModels[90].setRotationPoint(-52F, -7F, 34.2F);

		leftTrackWheelModels[91].addShapeBox(-2.5F, -2.45F, -8F, 5, 2, 11, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 429
		leftTrackWheelModels[91].setRotationPoint(-52F, -7F, 34.2F);

		leftTrackWheelModels[92].addShapeBox(-2.5F, 0.45F, -8F, 5, 2, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 430
		leftTrackWheelModels[92].setRotationPoint(-52F, -7F, 34.2F);

		leftTrackWheelModels[93].addShapeBox(-6.5F, -5.8F, -8.5F, 13, 4, 11, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 431
		leftTrackWheelModels[93].setRotationPoint(-52F, -7F, 34.2F);

		leftTrackWheelModels[94].addShapeBox(-6.5F, -1.5F, -8.5F, 13, 3, 11, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 432
		leftTrackWheelModels[94].setRotationPoint(-52F, -7F, 34.2F);

		leftTrackWheelModels[95].addShapeBox(-6.5F, 1.8F, -8.5F, 13, 4, 11, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 433
		leftTrackWheelModels[95].setRotationPoint(-52F, -7F, 34.2F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 482
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 483
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 484
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 485
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1057, 113, textureX, textureY); // Box 486
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 1089, 113, textureX, textureY); // Box 487
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 1121, 113, textureX, textureY); // Box 488
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 1161, 113, textureX, textureY); // Box 489
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 1201, 113, textureX, textureY); // Box 490
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 491
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 1241, 113, textureX, textureY); // Box 492
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 1265, 113, textureX, textureY); // Box 493
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 1297, 113, textureX, textureY); // Box 494
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 1377, 113, textureX, textureY); // Box 495
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 1401, 113, textureX, textureY); // Box 496
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 1425, 113, textureX, textureY); // Box 497
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 1457, 113, textureX, textureY); // Box 498
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 1481, 113, textureX, textureY); // Box 499
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 1513, 113, textureX, textureY); // Box 500
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 1545, 113, textureX, textureY); // Box 501
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1577, 113, textureX, textureY); // Box 502
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 1617, 113, textureX, textureY); // Box 503
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 1657, 113, textureX, textureY); // Box 504
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 1697, 113, textureX, textureY); // Box 505
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 506
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 507
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 508
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 509
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 510
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 511
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 512
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 513
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 514
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 515
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 516
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 517
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 1313, 121, textureX, textureY); // Box 518
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 519
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Box 520
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 1353, 121, textureX, textureY); // Box 521
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 1713, 121, textureX, textureY); // Box 522
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 1737, 121, textureX, textureY); // Box 523
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 1761, 121, textureX, textureY); // Box 524
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 1785, 121, textureX, textureY); // Box 525
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 1817, 121, textureX, textureY); // Box 526
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 1841, 121, textureX, textureY); // Box 527
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 1873, 121, textureX, textureY); // Box 528
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 1905, 121, textureX, textureY); // Box 529
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 1937, 121, textureX, textureY); // Box 530
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 1977, 121, textureX, textureY); // Box 531
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 532
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 2017, 121, textureX, textureY); // Box 533
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 534
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 535
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 536
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 537
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 538
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 539
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 540
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 541
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 542
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Box 543
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 544
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 545
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 793, 129, textureX, textureY); // Box 546
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 547
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Box 548
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 549
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 1041, 129, textureX, textureY); // Box 550
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 1065, 129, textureX, textureY); // Box 551
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 1089, 129, textureX, textureY); // Box 552
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 1113, 129, textureX, textureY); // Box 553
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 1145, 129, textureX, textureY); // Box 554
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 1169, 129, textureX, textureY); // Box 555
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 1201, 129, textureX, textureY); // Box 556
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 1233, 129, textureX, textureY); // Box 557
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 1265, 129, textureX, textureY); // Box 558
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 1377, 129, textureX, textureY); // Box 559
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 1417, 129, textureX, textureY); // Box 560
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 1457, 129, textureX, textureY); // Box 561
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 1481, 129, textureX, textureY); // Box 562
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 1505, 129, textureX, textureY); // Box 563
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 1537, 129, textureX, textureY); // Box 564
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 1561, 129, textureX, textureY); // Box 565
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 1585, 129, textureX, textureY); // Box 566
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 1609, 129, textureX, textureY); // Box 567
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 1641, 129, textureX, textureY); // Box 568
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 1665, 129, textureX, textureY); // Box 569
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 570
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 571
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 1681, 129, textureX, textureY); // Box 572
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 573
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 574
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 575
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 576
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 577

		rightTrackWheelModels[0].addShapeBox(-6.5F, 1.8F, -9F, 13, 4, 9, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 482
		rightTrackWheelModels[0].setRotationPoint(67.5F, -7F, -25.8F);

		rightTrackWheelModels[1].addShapeBox(-6.5F, -1.5F, -9F, 13, 3, 9, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 483
		rightTrackWheelModels[1].setRotationPoint(67.5F, -7F, -25.8F);

		rightTrackWheelModels[2].addShapeBox(-6.5F, -5.8F, -9F, 13, 4, 9, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 484
		rightTrackWheelModels[2].setRotationPoint(67.5F, -7F, -25.8F);

		rightTrackWheelModels[3].addShapeBox(-2.5F, -2.45F, -8.5F, 5, 2, 9, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 485
		rightTrackWheelModels[3].setRotationPoint(67.5F, -7F, -26.8F);

		rightTrackWheelModels[4].addShapeBox(-2.5F, -1F, -8.5F, 5, 2, 9, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 486
		rightTrackWheelModels[4].setRotationPoint(67.5F, -7F, -26.8F);

		rightTrackWheelModels[5].addShapeBox(-2.5F, 0.45F, -8.5F, 5, 2, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 487
		rightTrackWheelModels[5].setRotationPoint(67.5F, -7F, -26.8F);

		rightTrackWheelModels[6].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 488
		rightTrackWheelModels[6].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[7].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 489
		rightTrackWheelModels[7].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[8].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 490
		rightTrackWheelModels[8].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[9].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 491
		rightTrackWheelModels[9].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[10].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 492
		rightTrackWheelModels[10].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[11].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 493
		rightTrackWheelModels[11].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[12].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 494
		rightTrackWheelModels[12].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[13].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 495
		rightTrackWheelModels[13].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[14].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 496
		rightTrackWheelModels[14].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 497
		rightTrackWheelModels[15].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[16].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 498
		rightTrackWheelModels[16].setRotationPoint(50F, 2.75F, -23F);

		rightTrackWheelModels[17].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 499
		rightTrackWheelModels[17].setRotationPoint(50F, 2.75F, -23.5F);

		rightTrackWheelModels[18].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 500
		rightTrackWheelModels[18].setRotationPoint(50F, 2.75F, -23.5F);

		rightTrackWheelModels[19].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 501
		rightTrackWheelModels[19].setRotationPoint(50F, 2.75F, -23.5F);

		rightTrackWheelModels[20].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 502
		rightTrackWheelModels[20].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[21].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 503
		rightTrackWheelModels[21].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[22].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 504
		rightTrackWheelModels[22].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[23].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 505
		rightTrackWheelModels[23].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[24].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 506
		rightTrackWheelModels[24].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[25].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 507
		rightTrackWheelModels[25].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[26].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 508
		rightTrackWheelModels[26].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[27].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 509
		rightTrackWheelModels[27].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[28].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 510
		rightTrackWheelModels[28].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[29].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 511
		rightTrackWheelModels[29].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[30].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 512
		rightTrackWheelModels[30].setRotationPoint(31.5F, 2.75F, -23F);

		rightTrackWheelModels[31].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 513
		rightTrackWheelModels[31].setRotationPoint(31.5F, 2.75F, -23.5F);

		rightTrackWheelModels[32].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 514
		rightTrackWheelModels[32].setRotationPoint(31.5F, 2.75F, -23.5F);

		rightTrackWheelModels[33].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 515
		rightTrackWheelModels[33].setRotationPoint(31.5F, 2.75F, -23.5F);

		rightTrackWheelModels[34].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 516
		rightTrackWheelModels[34].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[35].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 517
		rightTrackWheelModels[35].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[36].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 518
		rightTrackWheelModels[36].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[37].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 519
		rightTrackWheelModels[37].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[38].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 520
		rightTrackWheelModels[38].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[39].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 521
		rightTrackWheelModels[39].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[40].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 522
		rightTrackWheelModels[40].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[41].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 523
		rightTrackWheelModels[41].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[42].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 524
		rightTrackWheelModels[42].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[43].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 525
		rightTrackWheelModels[43].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[44].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 526
		rightTrackWheelModels[44].setRotationPoint(12.5F, 2.75F, -23F);

		rightTrackWheelModels[45].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 527
		rightTrackWheelModels[45].setRotationPoint(12.5F, 2.75F, -23.5F);

		rightTrackWheelModels[46].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 528
		rightTrackWheelModels[46].setRotationPoint(12.5F, 2.75F, -23.5F);

		rightTrackWheelModels[47].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 529
		rightTrackWheelModels[47].setRotationPoint(12.5F, 2.75F, -23.5F);

		rightTrackWheelModels[48].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 530
		rightTrackWheelModels[48].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[49].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 531
		rightTrackWheelModels[49].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[50].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 532
		rightTrackWheelModels[50].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[51].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightTrackWheelModels[51].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[52].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 534
		rightTrackWheelModels[52].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[53].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 535
		rightTrackWheelModels[53].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[54].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 536
		rightTrackWheelModels[54].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[55].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 537
		rightTrackWheelModels[55].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[56].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 538
		rightTrackWheelModels[56].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[57].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 539
		rightTrackWheelModels[57].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[58].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 540
		rightTrackWheelModels[58].setRotationPoint(-4.5F, 2.75F, -23F);

		rightTrackWheelModels[59].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 541
		rightTrackWheelModels[59].setRotationPoint(-4.5F, 2.75F, -23.5F);

		rightTrackWheelModels[60].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 542
		rightTrackWheelModels[60].setRotationPoint(-4.5F, 2.75F, -23.5F);

		rightTrackWheelModels[61].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 543
		rightTrackWheelModels[61].setRotationPoint(-4.5F, 2.75F, -23.5F);

		rightTrackWheelModels[62].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 544
		rightTrackWheelModels[62].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[63].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 545
		rightTrackWheelModels[63].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[64].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 546
		rightTrackWheelModels[64].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[65].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 547
		rightTrackWheelModels[65].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[66].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 548
		rightTrackWheelModels[66].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[67].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 549
		rightTrackWheelModels[67].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[68].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 550
		rightTrackWheelModels[68].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[69].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 551
		rightTrackWheelModels[69].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[70].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 552
		rightTrackWheelModels[70].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[71].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 553
		rightTrackWheelModels[71].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[72].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 554
		rightTrackWheelModels[72].setRotationPoint(-22.5F, 2.75F, -23F);

		rightTrackWheelModels[73].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 555
		rightTrackWheelModels[73].setRotationPoint(-22.5F, 2.75F, -23.5F);

		rightTrackWheelModels[74].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 556
		rightTrackWheelModels[74].setRotationPoint(-22.5F, 2.75F, -23.5F);

		rightTrackWheelModels[75].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 557
		rightTrackWheelModels[75].setRotationPoint(-22.5F, 2.75F, -23.5F);

		rightTrackWheelModels[76].addShapeBox(-6F, -2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 558
		rightTrackWheelModels[76].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[77].addShapeBox(-6F, -6F, -9.8F, 12, 4, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 559
		rightTrackWheelModels[77].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[78].addShapeBox(-6F, 2F, -9.8F, 12, 4, 7, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 560
		rightTrackWheelModels[78].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[79].addShapeBox(-7.5F, -2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 561
		rightTrackWheelModels[79].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[80].addShapeBox(5.5F, -2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 562
		rightTrackWheelModels[80].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[81].addShapeBox(-2.5F, -7.5F, -10.8F, 5, 2, 9, 0F,-2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 563
		rightTrackWheelModels[81].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[82].addShapeBox(5.5F, -7.5F, -10.8F, 2, 5, 9, 0F,5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 564
		rightTrackWheelModels[82].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[83].addShapeBox(-7.5F, -7.5F, -10.8F, 2, 5, 9, 0F,-5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 565
		rightTrackWheelModels[83].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[84].addShapeBox(-7.5F, 2.5F, -10.8F, 2, 5, 9, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F); // Box 566
		rightTrackWheelModels[84].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[85].addShapeBox(-2.5F, 5.5F, -10.8F, 5, 2, 9, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 567
		rightTrackWheelModels[85].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[86].addShapeBox(5.5F, 2.5F, -10.8F, 2, 5, 9, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 5F, -0.2F, 0F, -5F, -0.2F, 0F, -5F, -0.2F, 0F, 5F, -0.2F, 0F); // Box 568
		rightTrackWheelModels[86].setRotationPoint(-40.5F, 2.75F, -23F);

		rightTrackWheelModels[87].addShapeBox(-2.5F, 0.45F, -10F, 5, 2, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F); // Box 569
		rightTrackWheelModels[87].setRotationPoint(-40.5F, 2.75F, -23.5F);

		rightTrackWheelModels[88].addShapeBox(-2.5F, -1F, -10F, 5, 2, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 570
		rightTrackWheelModels[88].setRotationPoint(-40.5F, 2.75F, -23.5F);

		rightTrackWheelModels[89].addShapeBox(-2.5F, -2.45F, -10F, 5, 2, 8, 0F,-1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, -1.7F, -0.05F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 571
		rightTrackWheelModels[89].setRotationPoint(-40.5F, 2.75F, -23.5F);

		rightTrackWheelModels[90].addShapeBox(-2.5F, -1F, -8F, 5, 2, 11, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 572
		rightTrackWheelModels[90].setRotationPoint(-52F, -7F, -26.8F);

		rightTrackWheelModels[91].addShapeBox(-2.5F, -2.45F, -8F, 5, 2, 11, 0F,-1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 573
		rightTrackWheelModels[91].setRotationPoint(-52F, -7F, -26.8F);

		rightTrackWheelModels[92].addShapeBox(-2.5F, 0.45F, -8F, 5, 2, 11, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F, -1.7F, -0.1F, 0F); // Box 574
		rightTrackWheelModels[92].setRotationPoint(-52F, -7F, -26.8F);

		rightTrackWheelModels[93].addShapeBox(-6.5F, -5.8F, -8.5F, 13, 4, 11, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 575
		rightTrackWheelModels[93].setRotationPoint(-52F, -7F, -25.8F);

		rightTrackWheelModels[94].addShapeBox(-6.5F, -1.5F, -8.5F, 13, 3, 11, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 576
		rightTrackWheelModels[94].setRotationPoint(-52F, -7F, -25.8F);

		rightTrackWheelModels[95].addShapeBox(-6.5F, 1.8F, -8.5F, 13, 4, 11, 0F,0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 577
		rightTrackWheelModels[95].setRotationPoint(-52F, -7F, -25.8F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1705, 137, textureX, textureY); // Box 10
		leftTrackModel[1] = new ModelRendererTurbo(this, 513, 145, textureX, textureY); // Box 579
		leftTrackModel[2] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 295
		leftTrackModel[3] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 296
		leftTrackModel[4] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 297
		leftTrackModel[5] = new ModelRendererTurbo(this, 1497, 65, textureX, textureY); // Box 298
		leftTrackModel[6] = new ModelRendererTurbo(this, 1297, 137, textureX, textureY); // Box 293
		leftTrackModel[7] = new ModelRendererTurbo(this, 1929, 137, textureX, textureY); // Box 299
		leftTrackModel[8] = new ModelRendererTurbo(this, 1185, 129, textureX, textureY); // Box 302

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 98, 1, 12, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 10
		leftTrackModel[0].setRotationPoint(-44F, 9.5F, 25F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 126, 1, 12, 0F,0.45F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.45F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.2F, 0.25F, 0F); // Box 579
		leftTrackModel[1].setRotationPoint(-55F, -13.5F, 25F);

		leftTrackModel[2].addShapeBox(-18F, 0F, 0F, 20, 1, 12, 0F,0F, 0.25F, 0F, 0.6F, 0.25F, 0F, 0.6F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0.25F, 0F); // Box 295
		leftTrackModel[2].setRotationPoint(68.3F, -0.2F, 25F);
		leftTrackModel[2].rotateAngleZ = 0.5846853F;

		leftTrackModel[3].addShapeBox(-1F, 0F, 0F, 4, 1, 12, 0F,0.15F, 0.25F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, 0.15F, 0.25F, 0F, 1.25F, -0.35F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, -0.35F, 0F); // Box 296
		leftTrackModel[3].setRotationPoint(71.2F, -2.6F, 25F);
		leftTrackModel[3].rotateAngleZ = 0.9424778F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,1.5F, -0.05F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.5F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.05F, 0F); // Box 297
		leftTrackModel[4].setRotationPoint(71.9F, -12.6F, 25F);
		leftTrackModel[4].rotateAngleZ = -0.9424778F;

		leftTrackModel[5].addShapeBox(-1F, 0F, 0F, 1, 5, 12, 0F,0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.6F, -0.1F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, 0.6F, -0.1F, 0F); // Box 298
		leftTrackModel[5].setRotationPoint(74.9F, -9.6F, 25F);

		leftTrackModel[6].addShapeBox(-18F, 0F, 0F, 18, 1, 12, 0F,2F, 6.15F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, 2F, 6.15F, 0F, 2F, -5.75F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 2F, -5.75F, 0F); // Box 293
		leftTrackModel[6].setRotationPoint(-44F, 9.5F, 25F);
		leftTrackModel[6].rotateAngleZ = -0.50614548F;

		leftTrackModel[7].addShapeBox(-1F, 0F, 0F, 5, 1, 12, 0F,1.2F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1.2F, -0.6F, 0F, 1.25F, 0.85F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, 0.85F, 0F); // Box 299
		leftTrackModel[7].setRotationPoint(-58.5F, -11.1F, 25F);
		leftTrackModel[7].rotateAngleZ = 0.82030475F;

		leftTrackModel[8].addShapeBox(-1F, 0F, 0F, 1, 5, 12, 0F,1F, -1.5F, 0F, -0.6F, -1.1F, 0F, -0.6F, -1.1F, 0F, 1F, -1.5F, 0F, -0.6F, 1F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, -0.6F, 1F, 0F); // Box 302
		leftTrackModel[8].setRotationPoint(-57.25F, -10F, 25F);
		leftTrackModel[8].rotateAngleZ = -0.26179939F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1969, 137, textureX, textureY); // Box 588
		rightTrackModel[1] = new ModelRendererTurbo(this, 1353, 145, textureX, textureY); // Box 589
		rightTrackModel[2] = new ModelRendererTurbo(this, 1217, 129, textureX, textureY); // Box 590
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 591
		rightTrackModel[4] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 592
		rightTrackModel[5] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 593
		rightTrackModel[6] = new ModelRendererTurbo(this, 1249, 129, textureX, textureY); // Box 594
		rightTrackModel[7] = new ModelRendererTurbo(this, 2009, 137, textureX, textureY); // Box 595
		rightTrackModel[8] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 596

		rightTrackModel[0].addShapeBox(-1F, 0F, 0F, 5, 1, 12, 0F,1.2F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1.2F, -0.6F, 0F, 1.25F, 0.85F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, 0.85F, 0F); // Box 588
		rightTrackModel[0].setRotationPoint(-58.5F, -11.1F, -36F);
		rightTrackModel[0].rotateAngleZ = 0.82030475F;

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 126, 1, 12, 0F,0.45F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.45F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.2F, 0.25F, 0F); // Box 589
		rightTrackModel[1].setRotationPoint(-55F, -13.5F, -36F);

		rightTrackModel[2].addShapeBox(-1F, 0F, 0F, 1, 5, 12, 0F,1F, -1.5F, 0F, -0.6F, -1.1F, 0F, -0.6F, -1.1F, 0F, 1F, -1.5F, 0F, -0.6F, 1F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, -0.6F, 1F, 0F); // Box 590
		rightTrackModel[2].setRotationPoint(-57.25F, -10F, -36F);
		rightTrackModel[2].rotateAngleZ = -0.26179939F;

		rightTrackModel[3].addShapeBox(-18F, 0F, 0F, 18, 1, 12, 0F,2F, 6.15F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, 2F, 6.15F, 0F, 2F, -5.75F, 0F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 2F, -5.75F, 0F); // Box 591
		rightTrackModel[3].setRotationPoint(-44F, 9.5F, -36F);
		rightTrackModel[3].rotateAngleZ = -0.50614548F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 98, 1, 12, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 592
		rightTrackModel[4].setRotationPoint(-44F, 9.5F, -36F);

		rightTrackModel[5].addShapeBox(-18F, 0F, 0F, 20, 1, 12, 0F,0F, 0.25F, 0F, 0.6F, 0.25F, 0F, 0.6F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0.25F, 0F); // Box 593
		rightTrackModel[5].setRotationPoint(68.3F, -0.2F, -36F);
		rightTrackModel[5].rotateAngleZ = 0.5846853F;

		rightTrackModel[6].addShapeBox(-1F, 0F, 0F, 1, 5, 12, 0F,0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0F, 0F, 0.6F, -0.1F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, 0.6F, -0.1F, 0F); // Box 594
		rightTrackModel[6].setRotationPoint(74.9F, -9.6F, -36F);

		rightTrackModel[7].addShapeBox(-1F, 0F, 0F, 4, 1, 12, 0F,0.15F, 0.25F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, 0.15F, 0.25F, 0F, 1.25F, -0.35F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.25F, -0.35F, 0F); // Box 595
		rightTrackModel[7].setRotationPoint(71.2F, -2.6F, -36F);
		rightTrackModel[7].rotateAngleZ = 0.9424778F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,1.5F, -0.05F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 1.5F, -0.05F, 0F, 0.2F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.05F, 0F); // Box 596
		rightTrackModel[8].setRotationPoint(71.9F, -12.6F, -36F);
		rightTrackModel[8].rotateAngleZ = -0.9424778F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[23];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1897, 9, textureX, textureY); // Box 359
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 360
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 1553, 49, textureX, textureY); // Box 361
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 1209, 17, textureX, textureY); // Box 362
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 1441, 25, textureX, textureY); // Box 368
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 1513, 25, textureX, textureY); // Box 369
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 370
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 371
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 1129, 145, textureX, textureY); // Box 372
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 1721, 9, textureX, textureY); // Box 373
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 2001, 49, textureX, textureY); // Box 374
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 375
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 377
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 378
		gun_1_Model[0][14] = new ModelRendererTurbo(this, 1945, 9, textureX, textureY); // Box 379
		gun_1_Model[0][15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 380
		gun_1_Model[0][16] = new ModelRendererTurbo(this, 1145, 153, textureX, textureY); // Box 388
		gun_1_Model[0][17] = new ModelRendererTurbo(this, 1065, 145, textureX, textureY); // Box 389
		gun_1_Model[0][18] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 398
		gun_1_Model[0][19] = new ModelRendererTurbo(this, 1161, 17, textureX, textureY); // Box 401
		gun_1_Model[0][20] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 402
		gun_1_Model[0][21] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 403
		gun_1_Model[0][22] = new ModelRendererTurbo(this, 2001, 25, textureX, textureY); // Box 404

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
			gunPart.setRotationPoint(3F, -42.5F, -12.2F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[22];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 721, 137, textureX, textureY); // Box 356
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 357
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 2001, 9, textureX, textureY); // Box 358
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 1793, 17, textureX, textureY); // Box 363
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 1569, 17, textureX, textureY); // Box 364
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 1961, 17, textureX, textureY); // Box 366
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 367
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 873, 153, textureX, textureY); // Box 381
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 382
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 1457, 25, textureX, textureY); // Box 383
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 1569, 25, textureX, textureY); // Box 384
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 385
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 386
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 387
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 1697, 25, textureX, textureY); // Box 390
		gun_1_Model[2][15] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 391
		gun_1_Model[2][16] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 392
		gun_1_Model[2][17] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 393
		gun_1_Model[2][18] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 394
		gun_1_Model[2][19] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 395
		gun_1_Model[2][20] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 396
		gun_1_Model[2][21] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 397

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
			gunPart.setRotationPoint(3F, -42.5F, -12.2F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);
	}
}