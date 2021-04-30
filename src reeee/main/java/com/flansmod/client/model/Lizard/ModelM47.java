//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.07.2017 - 21:46:54
// Last changed on: 17.07.2017 - 21:46:54

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM47 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelM47() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[180];
		turretModel = new ModelRendererTurbo[145];
		barrelModel = new ModelRendererTurbo[33];
		leftTrackWheelModels = new ModelRendererTurbo[46];
		rightTrackWheelModels = new ModelRendererTurbo[36];
		leftTrackModel = new ModelRendererTurbo[12];
		rightTrackModel = new ModelRendererTurbo[12];

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
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 88
		bodyModel[29] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 89
		bodyModel[30] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 90
		bodyModel[31] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 91
		bodyModel[32] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 92
		bodyModel[33] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 93
		bodyModel[34] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 94
		bodyModel[35] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 95
		bodyModel[36] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 96
		bodyModel[37] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 97
		bodyModel[38] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 98
		bodyModel[39] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 865, 129, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 105
		bodyModel[46] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 106
		bodyModel[47] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 107
		bodyModel[48] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 108
		bodyModel[49] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 109
		bodyModel[50] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 110
		bodyModel[51] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 111
		bodyModel[52] = new ModelRendererTurbo(this, 913, 129, textureX, textureY); // Box 121
		bodyModel[53] = new ModelRendererTurbo(this, 641, 137, textureX, textureY); // Box 123
		bodyModel[54] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 124
		bodyModel[55] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 125
		bodyModel[56] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 126
		bodyModel[57] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 127
		bodyModel[58] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 129
		bodyModel[60] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 130
		bodyModel[61] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 131
		bodyModel[62] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 132
		bodyModel[63] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 133
		bodyModel[64] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 134
		bodyModel[65] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 135
		bodyModel[66] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 136
		bodyModel[67] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 137
		bodyModel[68] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 138
		bodyModel[69] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 139
		bodyModel[70] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 140
		bodyModel[71] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 141
		bodyModel[72] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 142
		bodyModel[73] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 143
		bodyModel[74] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 144
		bodyModel[75] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 145
		bodyModel[76] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 146
		bodyModel[77] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 147
		bodyModel[78] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 148
		bodyModel[79] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 149
		bodyModel[80] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 150
		bodyModel[81] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 157
		bodyModel[82] = new ModelRendererTurbo(this, 617, 185, textureX, textureY); // Box 158
		bodyModel[83] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Box 159
		bodyModel[84] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 160
		bodyModel[85] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 161
		bodyModel[86] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 162
		bodyModel[87] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 163
		bodyModel[88] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 164
		bodyModel[89] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 165
		bodyModel[90] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 166
		bodyModel[91] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 167
		bodyModel[92] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 168
		bodyModel[93] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 395
		bodyModel[94] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 396
		bodyModel[95] = new ModelRendererTurbo(this, 769, 241, textureX, textureY); // Box 397
		bodyModel[96] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 478
		bodyModel[97] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 479
		bodyModel[98] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 480
		bodyModel[99] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 481
		bodyModel[100] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 482
		bodyModel[101] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 490
		bodyModel[102] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 491
		bodyModel[103] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 500
		bodyModel[104] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 412
		bodyModel[105] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 413
		bodyModel[106] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 414
		bodyModel[107] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 415
		bodyModel[108] = new ModelRendererTurbo(this, 793, 137, textureX, textureY); // Box 416
		bodyModel[109] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 417
		bodyModel[110] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 418
		bodyModel[111] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 421
		bodyModel[112] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 422
		bodyModel[113] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 423
		bodyModel[114] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 484
		bodyModel[115] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 485
		bodyModel[116] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 486
		bodyModel[117] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 487
		bodyModel[118] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 488
		bodyModel[119] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 489
		bodyModel[120] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 394
		bodyModel[121] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 395
		bodyModel[122] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 396
		bodyModel[123] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 397
		bodyModel[124] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 469
		bodyModel[125] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 470
		bodyModel[126] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 472
		bodyModel[127] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 952
		bodyModel[128] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 953
		bodyModel[129] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 954
		bodyModel[130] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 816
		bodyModel[131] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 817
		bodyModel[132] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 818
		bodyModel[133] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 828
		bodyModel[134] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 829
		bodyModel[135] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 830
		bodyModel[136] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 831
		bodyModel[137] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 416
		bodyModel[138] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 417
		bodyModel[139] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 418
		bodyModel[140] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 422
		bodyModel[141] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 423
		bodyModel[142] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 424
		bodyModel[143] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 427
		bodyModel[144] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Box 428
		bodyModel[145] = new ModelRendererTurbo(this, 521, 201, textureX, textureY); // Box 433
		bodyModel[146] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 436
		bodyModel[147] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 436
		bodyModel[148] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 437
		bodyModel[149] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 438
		bodyModel[150] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 439
		bodyModel[151] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 440
		bodyModel[152] = new ModelRendererTurbo(this, 609, 169, textureX, textureY); // Box 441
		bodyModel[153] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 442
		bodyModel[154] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 443
		bodyModel[155] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 444
		bodyModel[156] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 445
		bodyModel[157] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 446
		bodyModel[158] = new ModelRendererTurbo(this, 537, 129, textureX, textureY); // Box 447
		bodyModel[159] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 448
		bodyModel[160] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Box 449
		bodyModel[161] = new ModelRendererTurbo(this, 625, 201, textureX, textureY); // Box 450
		bodyModel[162] = new ModelRendererTurbo(this, 209, 273, textureX, textureY); // Box 451
		bodyModel[163] = new ModelRendererTurbo(this, 681, 201, textureX, textureY); // Box 452
		bodyModel[164] = new ModelRendererTurbo(this, 865, 129, textureX, textureY); // Box 453
		bodyModel[165] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 454
		bodyModel[166] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Box 455
		bodyModel[167] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 456
		bodyModel[168] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 457
		bodyModel[169] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 458
		bodyModel[170] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Box 902
		bodyModel[171] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 455
		bodyModel[172] = new ModelRendererTurbo(this, 969, 177, textureX, textureY); // Box 456
		bodyModel[173] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 457
		bodyModel[174] = new ModelRendererTurbo(this, 761, 137, textureX, textureY); // Box 458
		bodyModel[175] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 459
		bodyModel[176] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 460
		bodyModel[177] = new ModelRendererTurbo(this, 753, 273, textureX, textureY); // Box 461
		bodyModel[178] = new ModelRendererTurbo(this, 569, 281, textureX, textureY); // Box 462
		bodyModel[179] = new ModelRendererTurbo(this, 905, 281, textureX, textureY); // Box 463

		bodyModel[0].addBox(0F, 0F, 0F, 67, 23, 25, 0F); // Box 0
		bodyModel[0].setRotationPoint(-39F, -21.25F, -11.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 23, 25, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(28F, -21.25F, -11.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 67, 23, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-39F, -21.25F, -17.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 67, 23, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-39F, -21.25F, 13.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 23, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 4
		bodyModel[4].setRotationPoint(28F, -21.25F, 13.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 23, 6, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(28F, -21.25F, -17.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 21, 25, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -3F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(41F, -19.25F, -11.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 23, 6, 0F,0F, -2.5F, 0F, 0F, -12.5F, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -3F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(41F, -21.25F, -17.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 23, 6, 0F,0F, -2F, 0F, 0F, -12F, 0F, 0F, -12.5F, 0F, 0F, -2.5F, 0F, -3F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -6F, 0F); // Box 8
		bodyModel[8].setRotationPoint(41F, -21.25F, 13.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 13, 23, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 9
		bodyModel[9].setRotationPoint(28F, -21.25F, 13.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 23, 25, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.5F, -1F); // Box 10
		bodyModel[10].setRotationPoint(-52F, -21.25F, -11.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 5, 6, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 11
		bodyModel[11].setRotationPoint(-52F, -21.25F, -17.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 13, 9, 6, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -4F, 0F, 3F, 0F, 0F, 9F, 0F, 0F, -0.5F, 1F); // Box 12
		bodyModel[12].setRotationPoint(-52F, -16.25F, -17.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 9, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, 1F, 0F, 9F, 0F, 0F, 3F, 0F, 0F, -0.5F, -4F); // Box 13
		bodyModel[13].setRotationPoint(-52F, -16.25F, 13.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 5, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 14
		bodyModel[14].setRotationPoint(-52F, -21.25F, 13.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 90, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		bodyModel[15].setRotationPoint(-39F, -17.25F, 19.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 1, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 16
		bodyModel[16].setRotationPoint(-50F, -17.25F, -30F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 90, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		bodyModel[17].setRotationPoint(-39F, -17.25F, -30F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 18
		bodyModel[18].setRotationPoint(51F, -17.25F, 19.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[19].setRotationPoint(56F, -15.25F, 19.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F); // Box 20
		bodyModel[20].setRotationPoint(58F, -11.25F, 19.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F); // Box 21
		bodyModel[21].setRotationPoint(58F, -11.25F, -30F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 13, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[22].setRotationPoint(56F, -15.25F, -30F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 23
		bodyModel[23].setRotationPoint(51F, -17.25F, -30F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 3F, -0.5F); // Box 24
		bodyModel[24].setRotationPoint(-57F, -15.25F, -30F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,-1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -2F, -0.5F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 2F, -0.5F); // Box 25
		bodyModel[25].setRotationPoint(-55F, -17.25F, -30F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 3F, -0.5F); // Box 26
		bodyModel[26].setRotationPoint(-57F, -15.25F, 15F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,-1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -2F, -0.5F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 2F, -0.5F); // Box 27
		bodyModel[27].setRotationPoint(-55F, -17.25F, 15F);

		bodyModel[28].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 88
		bodyModel[28].setRotationPoint(4.25F, -0.2F, -12.75F);

		bodyModel[29].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 89
		bodyModel[29].setRotationPoint(4.25F, -0.2F, -12.75F);

		bodyModel[30].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 90
		bodyModel[30].setRotationPoint(4.25F, -0.2F, -12.75F);

		bodyModel[31].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 91
		bodyModel[31].setRotationPoint(17.25F, -0.2F, -12.75F);

		bodyModel[32].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 92
		bodyModel[32].setRotationPoint(17.25F, -0.2F, -12.75F);

		bodyModel[33].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 93
		bodyModel[33].setRotationPoint(17.25F, -0.2F, -12.75F);

		bodyModel[34].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 94
		bodyModel[34].setRotationPoint(30.25F, -0.2F, -12.75F);

		bodyModel[35].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 95
		bodyModel[35].setRotationPoint(30.25F, -0.2F, -12.75F);

		bodyModel[36].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 96
		bodyModel[36].setRotationPoint(30.25F, -0.2F, -12.75F);

		bodyModel[37].addShapeBox(-3F, -1.7F, -5F, 6, 3, 8, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 97
		bodyModel[37].setRotationPoint(34.25F, -0.2F, -12.75F);

		bodyModel[38].addShapeBox(-3F, 0.3F, -5F, 6, 3, 8, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 98
		bodyModel[38].setRotationPoint(34.25F, -0.2F, -12.75F);

		bodyModel[39].addShapeBox(-3F, -3.7F, -5F, 6, 3, 8, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 99
		bodyModel[39].setRotationPoint(34.25F, -0.2F, -12.75F);

		bodyModel[40].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 100
		bodyModel[40].setRotationPoint(-8.75F, -0.2F, -12.75F);

		bodyModel[41].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 101
		bodyModel[41].setRotationPoint(-8.75F, -0.2F, -12.75F);

		bodyModel[42].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 102
		bodyModel[42].setRotationPoint(-8.75F, -0.2F, -12.75F);

		bodyModel[43].addShapeBox(-3F, -3.7F, -5F, 6, 3, 38, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 103
		bodyModel[43].setRotationPoint(-21.75F, -0.2F, -12.75F);

		bodyModel[44].addShapeBox(-3F, -1.7F, -5F, 6, 3, 38, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 104
		bodyModel[44].setRotationPoint(-21.75F, -0.2F, -12.75F);

		bodyModel[45].addShapeBox(-3F, 0.3F, -5F, 6, 3, 38, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 105
		bodyModel[45].setRotationPoint(-21.75F, -0.2F, -12.75F);

		bodyModel[46].addShapeBox(-3F, -3.7F, -5F, 6, 3, 9, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 106
		bodyModel[46].setRotationPoint(-34.25F, -1.5F, 16.25F);

		bodyModel[47].addShapeBox(-3F, -1.7F, -5F, 6, 3, 9, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 107
		bodyModel[47].setRotationPoint(-34.25F, -1.5F, 16.25F);

		bodyModel[48].addShapeBox(-3F, 0.3F, -5F, 6, 3, 9, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 108
		bodyModel[48].setRotationPoint(-34.25F, -1.5F, 16.25F);

		bodyModel[49].addShapeBox(-3F, 0.3F, -5F, 6, 3, 9, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 109
		bodyModel[49].setRotationPoint(34.25F, -0.2F, 16.25F);

		bodyModel[50].addShapeBox(-3F, -1.7F, -5F, 6, 3, 9, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 110
		bodyModel[50].setRotationPoint(34.25F, -0.2F, 16.25F);

		bodyModel[51].addShapeBox(-3F, -3.7F, -5F, 6, 3, 9, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 111
		bodyModel[51].setRotationPoint(34.25F, -0.2F, 16.25F);

		bodyModel[52].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[52].setRotationPoint(31.75F, -0.2F, -14.75F);

		bodyModel[53].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[53].setRotationPoint(35.75F, -0.2F, -14.75F);

		bodyModel[54].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[54].setRotationPoint(18.75F, -0.2F, -14.75F);

		bodyModel[55].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[55].setRotationPoint(5.75F, -0.2F, -14.75F);

		bodyModel[56].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[56].setRotationPoint(-7.25F, -0.2F, -14.75F);

		bodyModel[57].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[57].setRotationPoint(-20.25F, -0.2F, -14.75F);

		bodyModel[58].addShapeBox(-3F, -1.7F, -5F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-32.75F, -1.2F, -14.75F);

		bodyModel[59].addShapeBox(-1.8F, -1.7F, -5F, 2, 6, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 129
		bodyModel[59].setRotationPoint(-7.25F, -9.2F, -14.75F);
		bodyModel[59].rotateAngleZ = -0.59341195F;

		bodyModel[60].addShapeBox(-1.8F, -1.7F, -5F, 2, 6, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 130
		bodyModel[60].setRotationPoint(-20.25F, -9.2F, -14.75F);
		bodyModel[60].rotateAngleZ = -0.59341195F;

		bodyModel[61].addShapeBox(-1.8F, -1.7F, -5F, 2, 6, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 131
		bodyModel[61].setRotationPoint(27.75F, -10.2F, -14.75F);

		bodyModel[62].addShapeBox(-1.8F, -3.7F, -5F, 2, 6, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 132
		bodyModel[62].setRotationPoint(33.75F, -10.2F, -14.75F);
		bodyModel[62].rotateAngleZ = 0.78539816F;

		bodyModel[63].addShapeBox(-1.8F, -1.7F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[63].setRotationPoint(33.75F, -10.2F, -14.65F);
		bodyModel[63].rotateAngleZ = 0.78539816F;

		bodyModel[64].addShapeBox(-1.8F, 0.3F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[64].setRotationPoint(-6.6F, -10.2F, -14.65F);
		bodyModel[64].rotateAngleZ = -0.59341195F;

		bodyModel[65].addShapeBox(-1.8F, 0.3F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[65].setRotationPoint(-19.6F, -10.2F, -14.65F);
		bodyModel[65].rotateAngleZ = -0.59341195F;

		bodyModel[66].addShapeBox(-1.8F, 0.3F, -5F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[66].setRotationPoint(27.75F, -10.2F, -14.65F);

		bodyModel[67].addShapeBox(-1.8F, 0.3F, -5F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[67].setRotationPoint(27.75F, -10.2F, 25F);

		bodyModel[68].addShapeBox(-1.8F, -1.7F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[68].setRotationPoint(33.75F, -10.2F, 25F);
		bodyModel[68].rotateAngleZ = 0.78539816F;

		bodyModel[69].addShapeBox(-1.8F, 0.3F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[69].setRotationPoint(-6.6F, -10.2F, 25F);
		bodyModel[69].rotateAngleZ = -0.59341195F;

		bodyModel[70].addShapeBox(-1.8F, 0.3F, -5F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[70].setRotationPoint(-19.6F, -10.2F, 25F);
		bodyModel[70].rotateAngleZ = -0.59341195F;

		bodyModel[71].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[71].setRotationPoint(23.75F, -6.2F, -14.65F);

		bodyModel[72].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[72].setRotationPoint(10.75F, -6.2F, -14.65F);

		bodyModel[73].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[73].setRotationPoint(-2.25F, -6.2F, -14.65F);

		bodyModel[74].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[74].setRotationPoint(-15.25F, -6.2F, -14.65F);

		bodyModel[75].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[75].setRotationPoint(-28.25F, -6.2F, -14.65F);

		bodyModel[76].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[76].setRotationPoint(-28.25F, -6.2F, 24.5F);

		bodyModel[77].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[77].setRotationPoint(-15.25F, -6.2F, 24.5F);

		bodyModel[78].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[78].setRotationPoint(-2.25F, -6.2F, 24.5F);

		bodyModel[79].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[79].setRotationPoint(10.75F, -6.2F, 24.5F);

		bodyModel[80].addShapeBox(-1.8F, 0.3F, -5F, 2, 5, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[80].setRotationPoint(23.75F, -6.2F, 24.5F);

		bodyModel[81].addShapeBox(-1.8F, -2.7F, -5F, 2, 5, 42, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 157
		bodyModel[81].setRotationPoint(38.75F, -9.2F, -15.75F);
		bodyModel[81].rotateAngleZ = 0.78539816F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 59, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[82].setRotationPoint(-41.5F, -21.25F, -27F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 59, 4, 3, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[83].setRotationPoint(-41.5F, -21.25F, -30F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 14, 5, 9, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[84].setRotationPoint(19F, -21.25F, -28.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 14, 5, 9, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[85].setRotationPoint(19F, -21.25F, 21F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 33, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[86].setRotationPoint(-14.25F, -21.25F, 20F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 27, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[87].setRotationPoint(-41.5F, -21.25F, 20F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 27, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[88].setRotationPoint(-41.5F, -21.25F, 29F);

		bodyModel[89].addShapeBox(-1.8F, 0.3F, -5F, 6, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 165
		bodyModel[89].setRotationPoint(-38.25F, -2.5F, 24.5F);

		bodyModel[90].addShapeBox(-1.8F, 0.3F, -5F, 2, 2, 3, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 166
		bodyModel[90].setRotationPoint(-38.25F, -0.25F, 25.5F);

		bodyModel[91].addShapeBox(-1.8F, 0.3F, -5F, 2, 2, 3, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 167
		bodyModel[91].setRotationPoint(-38.25F, -0.25F, -16.5F);

		bodyModel[92].addShapeBox(-1.8F, 0.3F, -5F, 6, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 168
		bodyModel[92].setRotationPoint(-38.25F, -2.5F, -14.5F);

		bodyModel[93].addShapeBox(-20F, -16F, 7F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[93].setRotationPoint(15F, -6F, 8F);

		bodyModel[94].addShapeBox(-20F, -16F, 7F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[94].setRotationPoint(16F, -6F, -22.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 9, 6, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 397
		bodyModel[95].setRotationPoint(-55F, -19.25F, -2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, 4F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F); // Box 478
		bodyModel[96].setRotationPoint(-50.7F, -8.4F, -7.1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, 4F, 0F, 2F, -0.2F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F); // Box 479
		bodyModel[97].setRotationPoint(-50.7F, -8.4F, 8.2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 480
		bodyModel[98].setRotationPoint(-52.2F, -7.6F, 8.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 481
		bodyModel[99].setRotationPoint(-52.2F, -7.6F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 482
		bodyModel[100].setRotationPoint(-52.2F, -7.6F, 9.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 490
		bodyModel[101].setRotationPoint(-51.7F, -8F, -0.8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 491
		bodyModel[102].setRotationPoint(-54.5F, -8F, -0.2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -0.35F, 0F); // Box 500
		bodyModel[103].setRotationPoint(-57F, -8F, 0.8F);

		bodyModel[104].addShapeBox(11.25F, 2.22044604925031E-16F, 0F, 1, 2, 4, 0F,-0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F); // Box 412
		bodyModel[104].setRotationPoint(40.5F, -14F, -12.5F);

		bodyModel[105].addShapeBox(11.25F, -1.3F, 0F, 1, 2, 4, 0F,-0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F); // Box 413
		bodyModel[105].setRotationPoint(40.5F, -14F, -12.5F);

		bodyModel[106].addShapeBox(11.25F, 1.3F, 0F, 1, 2, 4, 0F,-0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F); // Box 414
		bodyModel[106].setRotationPoint(40.5F, -14F, -12.5F);

		bodyModel[107].addShapeBox(9.25F, 1.3F, 0F, 3, 2, 4, 0F,-0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F, -0.25F, -0.35F, -1.25F); // Box 415
		bodyModel[107].setRotationPoint(40F, -14F, -12.5F);

		bodyModel[108].addShapeBox(7.25F, 2.22044604925031E-16F, 0F, 5, 2, 4, 0F,-0.25F, -0.35F, 3.85F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, 3.8F, -0.25F, -0.35F, 5F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, 6.3F); // Box 416
		bodyModel[108].setRotationPoint(40F, -14F, -12.5F);

		bodyModel[109].addShapeBox(7.25F, -1.3F, 0F, 5, 2, 4, 0F,-0.25F, 1F, 0.65F, -0.25F, -0.5F, -1.35F, -0.25F, -0.5F, -1.35F, -0.25F, 1F, 0.65F, -0.25F, -0.35F, 3.85F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, 3.85F); // Box 417
		bodyModel[109].setRotationPoint(40F, -14F, -12.5F);

		bodyModel[110].addShapeBox(7.25F, 1.3F, 0F, 5, 2, 4, 0F,-0.25F, -0.35F, 4.85F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, 6.6F, -0.25F, 1.5F, 0.65F, -0.25F, -0.5F, -1.35F, -0.25F, -0.5F, -1.35F, -0.25F, 1.5F, 1.65F); // Box 418
		bodyModel[110].setRotationPoint(40F, -14F, -12.5F);

		bodyModel[111].addShapeBox(2.75F, -1.3F, 0F, 5, 2, 4, 0F,-0.25F, 1F, 0.65F, -0.25F, 1F, 0.65F, -0.25F, 1F, 0.65F, -0.25F, 1F, 0.65F, -0.25F, -0.35F, 3.85F, -0.25F, -0.35F, 3.85F, -0.25F, -0.35F, 3.85F, -0.25F, -0.35F, 5.65F); // Box 421
		bodyModel[111].setRotationPoint(40F, -14F, -12.5F);

		bodyModel[112].addShapeBox(11.25F, 2.22044604925031E-16F, 1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[112].setRotationPoint(40.5F, -14F, -12.5F);

		bodyModel[113].addShapeBox(11.5F, 0F, 1F, 5, 2, 2, 0F,0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F); // Box 423
		bodyModel[113].setRotationPoint(40.5F, -14F, -12.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 4F, -0.3F, 2F, -0.2F, -0.3F, 2F, -0.2F, 0F, 0F, 4F, 0F, 0F, -1F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, 0F, 0F, -1F, 0F); // Box 484
		bodyModel[114].setRotationPoint(48.3F, -7.4F, 10.2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 485
		bodyModel[115].setRotationPoint(52.8F, -6.6F, 10.2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 486
		bodyModel[116].setRotationPoint(52.8F, -6.6F, 11.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 4F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, -0.3F, 0F, 4F, -0.3F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, -0.3F, 0F, -1F, -0.3F); // Box 487
		bodyModel[117].setRotationPoint(48.3F, -7.4F, -9.1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 488
		bodyModel[118].setRotationPoint(52.8F, -6.6F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 489
		bodyModel[119].setRotationPoint(52.8F, -6.6F, -10.1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[120].setRotationPoint(49.8F, -12.6F, 6.8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, 1F, 0F); // Box 395
		bodyModel[121].setRotationPoint(54.8F, -12.6F, 6.8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 2F, 1F, 0F); // Box 396
		bodyModel[122].setRotationPoint(54.8F, -12.6F, -5.8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[123].setRotationPoint(49.8F, -12.6F, -5.8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 469
		bodyModel[124].setRotationPoint(49F, -18F, 16.8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 470
		bodyModel[125].setRotationPoint(49F, -18F, 9.8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F); // Box 472
		bodyModel[126].setRotationPoint(49F, -18.6F, 9.8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 952
		bodyModel[127].setRotationPoint(47F, -17.25F, 14F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 953
		bodyModel[128].setRotationPoint(47F, -16.25F, 14F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 954
		bodyModel[129].setRotationPoint(47F, -15.25F, 14F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 816
		bodyModel[130].setRotationPoint(47F, -15.25F, 10.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 817
		bodyModel[131].setRotationPoint(47F, -16.25F, 10.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 818
		bodyModel[132].setRotationPoint(47F, -17.25F, 10.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 828
		bodyModel[133].setRotationPoint(46F, -18.6F, 15.3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 829
		bodyModel[134].setRotationPoint(44F, -16.53F, 15.3F);
		bodyModel[134].rotateAngleZ = 0.78539816F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 830
		bodyModel[135].setRotationPoint(46F, -18.6F, 11.3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 831
		bodyModel[136].setRotationPoint(44F, -16.53F, 11.3F);
		bodyModel[136].rotateAngleZ = 0.78539816F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 416
		bodyModel[137].setRotationPoint(45F, -20F, -14.4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F); // Box 417
		bodyModel[138].setRotationPoint(45F, -20F, -17.8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F); // Box 418
		bodyModel[139].setRotationPoint(45F, -20.6F, -17.8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F); // Box 422
		bodyModel[140].setRotationPoint(43F, -17.25F, -17.1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 423
		bodyModel[141].setRotationPoint(43F, -18.25F, -17.1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 424
		bodyModel[142].setRotationPoint(43F, -19.25F, -17.1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 427
		bodyModel[143].setRotationPoint(42F, -20.6F, -16.1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F); // Box 428
		bodyModel[144].setRotationPoint(40F, -18.53F, -16.1F);
		bodyModel[144].rotateAngleZ = 0.78539816F;

		bodyModel[145].addShapeBox(-20F, -16F, 7F, 6, 10, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[145].setRotationPoint(51F, -5.5F, 3F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 436
		bodyModel[146].setRotationPoint(-45.5F, -20.4F, -25.3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 436
		bodyModel[147].setRotationPoint(-45.5F, -20.4F, 25.7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[148].setRotationPoint(-54F, -19.25F, -0.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[149].setRotationPoint(-54F, -19.25F, 3.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[150].setRotationPoint(-54F, -19.25F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 440
		bodyModel[151].setRotationPoint(-54F, -18.25F, -2.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 441
		bodyModel[152].setRotationPoint(-54F, -15.75F, -2.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[153].setRotationPoint(-55.5F, -19F, 3.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F); // Box 443
		bodyModel[154].setRotationPoint(-54.5F, -11.5F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 12, 1, 25, 0F,0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F); // Box 444
		bodyModel[155].setRotationPoint(-51F, -22.25F, -11.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 445
		bodyModel[156].setRotationPoint(-38F, -22.25F, -11.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 446
		bodyModel[157].setRotationPoint(-23F, -22.25F, -11.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 447
		bodyModel[158].setRotationPoint(-23F, -22.25F, 10.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 12, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[159].setRotationPoint(-23F, -22.25F, -2.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[160].setRotationPoint(-27.5F, -23.25F, -27F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[161].setRotationPoint(-27.5F, -23.25F, 20F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 2, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[162].setRotationPoint(-26.5F, -23F, -18F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[163].setRotationPoint(-27F, -23.5F, -4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 453
		bodyModel[164].setRotationPoint(-38F, -22.25F, 11.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[165].setRotationPoint(-38F, -22.25F, -3.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[166].setRotationPoint(-15F, -22.75F, -1.5F);

		bodyModel[167].addShapeBox(-20F, -16F, 7F, 2, 2, 4, 0F,-0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 456
		bodyModel[167].setRotationPoint(54F, -6.5F, 5F);

		bodyModel[168].addShapeBox(-20F, -16F, 7F, 6, 10, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[168].setRotationPoint(51F, -5.5F, -23F);

		bodyModel[169].addShapeBox(-20F, -16F, 7F, 2, 2, 4, 0F,-0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 458
		bodyModel[169].setRotationPoint(54F, -6.5F, -21F);

		bodyModel[170].addShapeBox(1.5F, 12F, -10F, 30, 1, 30, 0F,-10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F); // Box 902
		bodyModel[170].setRotationPoint(60.6F, -20.3F, -15.5F);
		bodyModel[170].rotateAngleX = 0.61086524F;
		bodyModel[170].rotateAngleY = 1.57079633F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 455
		bodyModel[171].setRotationPoint(51F, -16.25F, -17.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[172].setRotationPoint(34F, -16.25F, -17.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -0.5F, 2F, 0F, -0.5F); // Box 457
		bodyModel[173].setRotationPoint(56F, -14.25F, -17.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 458
		bodyModel[174].setRotationPoint(51F, -16.25F, 19F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 459
		bodyModel[175].setRotationPoint(34F, -16.25F, 19F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.5F, 0F, 0F, -0.5F, 2F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, -0.5F, 2F, 0F, -0.5F); // Box 460
		bodyModel[176].setRotationPoint(56F, -14.25F, 19F);

		bodyModel[177].addShapeBox(-1F, -1.7F, -49F, 2, 3, 44, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 461
		bodyModel[177].setRotationPoint(3.5F, -10F, 28.25F);

		bodyModel[178].addShapeBox(-1F, -1.7F, -49F, 2, 3, 44, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 462
		bodyModel[178].setRotationPoint(-23.5F, -10F, 28.25F);

		bodyModel[179].addShapeBox(-1F, -1.7F, -49F, 2, 3, 44, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 463
		bodyModel[179].setRotationPoint(30.5F, -10F, 28.25F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 721, 185, textureX, textureY); // Box 199
		turretModel[1] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 200
		turretModel[2] = new ModelRendererTurbo(this, 521, 201, textureX, textureY); // Box 201
		turretModel[3] = new ModelRendererTurbo(this, 625, 201, textureX, textureY); // Box 214
		turretModel[4] = new ModelRendererTurbo(this, 785, 201, textureX, textureY); // Box 215
		turretModel[5] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 216
		turretModel[6] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Box 217
		turretModel[7] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 218
		turretModel[8] = new ModelRendererTurbo(this, 585, 201, textureX, textureY); // Box 219
		turretModel[9] = new ModelRendererTurbo(this, 681, 201, textureX, textureY); // Box 222
		turretModel[10] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 223
		turretModel[11] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 224
		turretModel[12] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 225
		turretModel[13] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 226
		turretModel[14] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 227
		turretModel[15] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 228
		turretModel[16] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 229
		turretModel[17] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 230
		turretModel[18] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Box 231
		turretModel[19] = new ModelRendererTurbo(this, 897, 201, textureX, textureY); // Box 232
		turretModel[20] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 233
		turretModel[21] = new ModelRendererTurbo(this, 713, 225, textureX, textureY); // Box 234
		turretModel[22] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 235
		turretModel[23] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 236
		turretModel[24] = new ModelRendererTurbo(this, 561, 241, textureX, textureY); // Box 237
		turretModel[25] = new ModelRendererTurbo(this, 625, 241, textureX, textureY); // Box 238
		turretModel[26] = new ModelRendererTurbo(this, 817, 241, textureX, textureY); // Box 239
		turretModel[27] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 240
		turretModel[28] = new ModelRendererTurbo(this, 665, 241, textureX, textureY); // Box 242
		turretModel[29] = new ModelRendererTurbo(this, 857, 241, textureX, textureY); // Box 243
		turretModel[30] = new ModelRendererTurbo(this, 913, 241, textureX, textureY); // Box 244
		turretModel[31] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 245
		turretModel[32] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 246
		turretModel[33] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 247
		turretModel[34] = new ModelRendererTurbo(this, 961, 241, textureX, textureY); // Box 248
		turretModel[35] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 249
		turretModel[36] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 251
		turretModel[37] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 252
		turretModel[38] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 253
		turretModel[39] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 254
		turretModel[40] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 255
		turretModel[41] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 256
		turretModel[42] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 257
		turretModel[43] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 258
		turretModel[44] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 652
		turretModel[45] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 653
		turretModel[46] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 654
		turretModel[47] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 296
		turretModel[48] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 297
		turretModel[49] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 298
		turretModel[50] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 299
		turretModel[51] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 614
		turretModel[52] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 615
		turretModel[53] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 616
		turretModel[54] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 617
		turretModel[55] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 622
		turretModel[56] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 651
		turretModel[57] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Box 363
		turretModel[58] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 364
		turretModel[59] = new ModelRendererTurbo(this, 657, 265, textureX, textureY); // Box 365
		turretModel[60] = new ModelRendererTurbo(this, 593, 249, textureX, textureY); // Box 309
		turretModel[61] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 310
		turretModel[62] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 311
		turretModel[63] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 312
		turretModel[64] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 313
		turretModel[65] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 314
		turretModel[66] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 315
		turretModel[67] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 316
		turretModel[68] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 317
		turretModel[69] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 318
		turretModel[70] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 319
		turretModel[71] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 320
		turretModel[72] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 321
		turretModel[73] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 322
		turretModel[74] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 323
		turretModel[75] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 324
		turretModel[76] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 325
		turretModel[77] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 326
		turretModel[78] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 327
		turretModel[79] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 328
		turretModel[80] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 329
		turretModel[81] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 330
		turretModel[82] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 331
		turretModel[83] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 332
		turretModel[84] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 333
		turretModel[85] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 334
		turretModel[86] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 335
		turretModel[87] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 336
		turretModel[88] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 337
		turretModel[89] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 338
		turretModel[90] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 339
		turretModel[91] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 340
		turretModel[92] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 341
		turretModel[93] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 342
		turretModel[94] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 343
		turretModel[95] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 344
		turretModel[96] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Box 345
		turretModel[97] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 346
		turretModel[98] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 347
		turretModel[99] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 348
		turretModel[100] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 349
		turretModel[101] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 350
		turretModel[102] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 351
		turretModel[103] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 352
		turretModel[104] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 353
		turretModel[105] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 354
		turretModel[106] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 355
		turretModel[107] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 671
		turretModel[108] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 672
		turretModel[109] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 673
		turretModel[110] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 674
		turretModel[111] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 675
		turretModel[112] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 676
		turretModel[113] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 677
		turretModel[114] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 363
		turretModel[115] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 364
		turretModel[116] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 365
		turretModel[117] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 366
		turretModel[118] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 367
		turretModel[119] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 368
		turretModel[120] = new ModelRendererTurbo(this, 937, 145, textureX, textureY); // Box 369
		turretModel[121] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 655
		turretModel[122] = new ModelRendererTurbo(this, 529, 169, textureX, textureY); // Box 656
		turretModel[123] = new ModelRendererTurbo(this, 585, 169, textureX, textureY); // Box 657
		turretModel[124] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 373
		turretModel[125] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 374
		turretModel[126] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 375
		turretModel[127] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 376
		turretModel[128] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 377
		turretModel[129] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 378
		turretModel[130] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 379
		turretModel[131] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 380
		turretModel[132] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 381
		turretModel[133] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 382
		turretModel[134] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 383
		turretModel[135] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 384
		turretModel[136] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 385
		turretModel[137] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 775
		turretModel[138] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 776
		turretModel[139] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 777
		turretModel[140] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 392
		turretModel[141] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Box 393
		turretModel[142] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 394
		turretModel[143] = new ModelRendererTurbo(this, 729, 273, textureX, textureY); // Box 904
		turretModel[144] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 460

		turretModel[0].addShapeBox(-6.75F, 0.25F, -18.5F, 13, 2, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		turretModel[0].setRotationPoint(14F, -23F, 1F);

		turretModel[1].addShapeBox(-18.75F, 0.25F, -18.5F, 12, 2, 37, 0F,-0.5F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -12F, -0.5F, -0.5F, -12F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -12F); // Box 200
		turretModel[1].setRotationPoint(14F, -23F, 1F);

		turretModel[2].addShapeBox(6.25F, 0.25F, -18.5F, 12, 2, 37, 0F,0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -12F, 0F, -0.5F, -12F, 0F, -0.5F, 0F); // Box 201
		turretModel[2].setRotationPoint(14F, -23F, 1F);

		turretModel[3].addShapeBox(-6.75F, -0.75F, -18.5F, 6, 1, 37, 0F,0F, 0.5F, 1.75F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.25F, 0F, 0.5F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		turretModel[3].setRotationPoint(14F, -23F, 1F);

		turretModel[4].addShapeBox(-0.75F, -0.75F, -18.5F, 7, 1, 37, 0F,0F, 0.5F, 2.5F, 0F, 0.5F, 1.75F, 0F, 0.5F, 1.75F, 0F, 0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		turretModel[4].setRotationPoint(14F, -23F, 1F);

		turretModel[5].addShapeBox(6.25F, -0.75F, -17.5F, 7, 1, 35, 0F,0F, 0.5F, 2.75F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, 2.75F, 0F, 0F, 1F, 0F, 0F, -5.45F, 0F, 0F, -4.85F, 0F, 0F, 1F); // Box 216
		turretModel[5].setRotationPoint(14F, -23F, 1F);

		turretModel[6].addShapeBox(13.25F, -0.75F, -17.5F, 5, 1, 35, 0F,0F, 0.5F, -1.25F, 0F, 2.25F, -6.25F, 0F, 2.25F, -5.5F, 0F, 0.5F, -1.25F, 0F, 0F, -5.45F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, -4.85F); // Box 217
		turretModel[6].setRotationPoint(14F, -23F, 1F);

		turretModel[7].addShapeBox(18.25F, -2.75F, -17.5F, 3, 3, 32, 0F,0F, 0.25F, -6.25F, 0F, 0.25F, -11F, 0F, 0.25F, -14F, 0F, 0.25F, -14F, 0F, 0F, -10F, -0.5F, -1F, -14.5F, -0.5F, -0.5F, -14F, 0F, 1F, -14F); // Box 218
		turretModel[7].setRotationPoint(14F, -23F, 1F);

		turretModel[8].addShapeBox(18.25F, -2.75F, -13.5F, 3, 3, 32, 0F,0F, 0.25F, -14F, 0F, 0.25F, -14F, 0F, 0.25F, -11F, 0F, 0.25F, -6.5F, 0F, 1F, -14F, -0.5F, -0.5F, -14F, -0.5F, -1F, -14.5F, 0F, 0F, -10F); // Box 219
		turretModel[8].setRotationPoint(14F, -23F, 1F);

		turretModel[9].addShapeBox(18.25F, -9.75F, -18F, 3, 3, 32, 0F,0F, 0.5F, -10F, -1F, 0F, -11.5F, -1F, 0F, -13.75F, 0F, 1F, -13.75F, 0F, 0.25F, -7.5F, 0.5F, 0.25F, -11F, 0.5F, 0.25F, -13.75F, 0F, 0.25F, -13.75F); // Box 222
		turretModel[9].setRotationPoint(14F, -23F, 1F);

		turretModel[10].addShapeBox(18.25F, -6.5F, -18F, 3, 3, 40, 0F,0F, 0F, -7.5F, 0.5F, 0F, -11F, 0.5F, 0F, -14.5F, 0F, 0F, -11F, 0F, 0.5F, -6.75F, 0F, 0.5F, -11.5F, 0F, 0.5F, -14.5F, 0F, 0.5F, -10F); // Box 223
		turretModel[10].setRotationPoint(14F, -23F, 1F);

		turretModel[11].addShapeBox(-6.75F, -11.25F, -20.25F, 6, 10, 41, 0F,0F, 0.5F, -4F, 0F, 0.5F, -4.5F, 0F, 0.5F, -6.25F, 0F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 224
		turretModel[11].setRotationPoint(14F, -23F, 1F);

		turretModel[12].addShapeBox(-0.75F, -11.25F, -20.25F, 7, 10, 41, 0F,0F, 0.5F, -4.5F, 0F, 0.5F, -5F, 0F, 0.5F, -6.75F, 0F, 0.5F, -6.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 225
		turretModel[12].setRotationPoint(14F, -23F, 1F);

		turretModel[13].addShapeBox(6.25F, -11.25F, -19.25F, 7, 10, 39, 0F,0F, 0.5F, -4F, -1F, 0.5F, -6F, -1F, 0.5F, -6.75F, 0F, 0.5F, -5.75F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 0.5F); // Box 226
		turretModel[13].setRotationPoint(14F, -23F, 1F);

		turretModel[14].addShapeBox(13.25F, -4.25F, -17.5F, 5, 1, 35, 0F,0.53F, 2.5F, -2.82F, 0F, 2.25F, -7F, 0F, 2.25F, -6.5F, 0.52F, 2.5F, -2.95F, 0F, 2F, -1.25F, 0F, 0.25F, -6.25F, 0F, 0.25F, -5.5F, 0F, 2F, -1.25F); // Box 227
		turretModel[14].setRotationPoint(14F, -23F, 1F);

		turretModel[15].addShapeBox(13.25F, -11.75F, -17.5F, 5, 5, 35, 0F,1F, 0F, -4.25F, 0F, -1.5F, -9.5F, 0F, -1.5F, -9F, 1F, 0F, -4.5F, 0.52F, 0F, -2.82F, 0F, 0.25F, -7F, 0F, 0.25F, -6.5F, 0.52F, 0F, -2.95F); // Box 228
		turretModel[15].setRotationPoint(14F, -23F, 1F);

		turretModel[16].addShapeBox(12.25F, -15.75F, -7.75F, 6, 6, 16, 0F,-1F, 0F, 4F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, 0F, 4F, 0F, -2F, 5.5F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -2F, 4.75F); // Box 229
		turretModel[16].setRotationPoint(14F, -23F, 1F);

		turretModel[17].addShapeBox(18.25F, -9.75F, -13.5F, 3, 3, 32, 0F,0F, 1F, -13.75F, -1F, 0F, -13.75F, -1F, 0F, -11.5F, 0F, 0.5F, -10F, 0F, 0.25F, -13.75F, 0.5F, 0.25F, -13.75F, 0.5F, 0.25F, -11F, 0F, 0.25F, -7.5F); // Box 230
		turretModel[17].setRotationPoint(14F, -23F, 1F);

		turretModel[18].addShapeBox(6.25F, -15.75F, -15.25F, 6, 4, 29, 0F,0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, -1.67F, -1F, 0F, -0.59F, 0F, 0F, 0.25F); // Box 231
		turretModel[18].setRotationPoint(14F, -23F, 1F);

		turretModel[19].addShapeBox(11.75F, -15.75F, -13.25F, 1, 4, 26, 0F,0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0.41F); // Box 232
		turretModel[19].setRotationPoint(14F, -23F, 1F);

		turretModel[20].addShapeBox(-0.75F, -15.75F, -20.25F, 7, 4, 41, 0F,0F, 0F, -5.5F, 0F, 0F, -6F, 0F, 0F, -7.25F, -1F, 0F, -7F, 0F, 0F, -4.5F, 0F, 0F, -5F, 0F, 0F, -6.75F, 0F, 0F, -6.25F); // Box 233
		turretModel[20].setRotationPoint(14F, -23F, 1F);

		turretModel[21].addShapeBox(-6.75F, -15.75F, -20.25F, 7, 4, 41, 0F,0F, 0F, -4F, -1F, 0F, -5.5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, -1F, 0F, -4.5F, -1F, 0F, -6.25F, 0F, 0F, -5.5F); // Box 234
		turretModel[21].setRotationPoint(14F, -23F, 1F);

		turretModel[22].addShapeBox(-13.75F, -0.75F, -18.5F, 7, 1, 37, 0F,0.5F, 2F, -1.25F, 0F, 0.5F, 1.75F, 0F, 0.5F, 1.75F, 0.5F, 2F, -3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 235
		turretModel[22].setRotationPoint(14F, -23F, 1F);

		turretModel[23].addShapeBox(-13.75F, -11.75F, -18.5F, 7, 9, 37, 0F,0.5F, 2F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -3.25F, 0.5F, 2F, -5.5F, 0.5F, 0F, -1.25F, 0F, 1.5F, 1.75F, 0F, 1.5F, 1.75F, 0.5F, 0F, -3F); // Box 236
		turretModel[23].setRotationPoint(14F, -23F, 1F);

		turretModel[24].addShapeBox(-18.75F, -2.75F, -13.5F, 4, 3, 25, 0F,0.5F, 0F, -4F, 0.5F, 0F, 3.75F, 0.5F, 0F, 4F, 0.5F, 0F, -3F, -0.5F, 0F, -7F, 1F, 0F, -2F, 1F, 0F, 0F, -0.5F, 0F, -5F); // Box 237
		turretModel[24].setRotationPoint(14F, -23F, 1F);

		turretModel[25].addShapeBox(-18.75F, -4.75F, -13.5F, 4, 2, 25, 0F,2.5F, -0.5F, -1.5F, 0.5F, -0.5F, 3.61F, 0.5F, -0.5F, 3.67F, 2.5F, -0.5F, 0.25F, 0.5F, 0F, -4F, 0.5F, 0F, 3.75F, 0.5F, 0F, 4F, 0.5F, 0F, -3F); // Box 238
		turretModel[25].setRotationPoint(14F, -23F, 1F);

		turretModel[26].addShapeBox(-34.5F, -14.75F, -10.5F, 15, 9, 21, 0F,0.5F, -1.5F, -3F, 0.5F, -0.5F, 0F, 3.75F, -0.5F, 1.25F, 0.5F, -1.5F, -3F, 0.5F, 0F, 0.5F, 0F, -0.25F, 3.5F, -0.5F, -0.25F, 3.25F, 0.5F, 0F, 0.5F); // Box 239
		turretModel[26].setRotationPoint(14F, -23F, 1F);

		turretModel[27].addShapeBox(-33F, -16.25F, -10.5F, 14, 3, 21, 0F,1F, -1.5F, -5F, 0F, -0.5F, -2F, 3.25F, -0.25F, -0.75F, 1F, -1.5F, -5F, 2F, 0F, -3F, 0F, -1F, 0F, 3.25F, -1F, 1.25F, 2F, 0F, -3F); // Box 240
		turretModel[27].setRotationPoint(14F, -23F, 1F);

		turretModel[28].addShapeBox(-34.5F, -5.75F, -10.5F, 15, 1, 21, 0F,0.5F, 0F, 0.5F, 0F, 0.25F, 3.5F, -0.5F, 0.25F, 3.25F, 0.5F, 0F, 0.5F, -1.5F, 0.5F, -1.5F, -1.75F, 0.5F, 1.5F, -1.75F, 0.5F, 1.25F, -1.5F, 0.5F, -1.5F); // Box 242
		turretModel[28].setRotationPoint(14F, -23F, 1F);

		turretModel[29].addShapeBox(-13.75F, -15.75F, -18.5F, 7, 4, 37, 0F,0.5F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -4.75F, 0.5F, 0F, -8F, 0.5F, -2F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -3.25F, 0.5F, -2F, -5.5F); // Box 243
		turretModel[29].setRotationPoint(14F, -23F, 1F);

		turretModel[30].addShapeBox(-19F, -6.25F, -16.5F, 5, 2, 31, 0F,0.5F, -0.25F, -2.5F, -0.25F, -0.25F, 0.45F, -0.25F, -0.25F, 0.26F, 1F, -0.25F, -0.75F, 2.25F, 0F, -4.5F, -0.25F, 0F, 0.61F, -0.25F, 0F, 0.67F, 2.25F, 0F, -2.74F); // Box 244
		turretModel[30].setRotationPoint(14F, -23F, 1F);

		turretModel[31].addShapeBox(-18.25F, -13.75F, -16F, 4, 8, 29, 0F,0.75F, 0.5F, -5.5F, 0F, 0F, 0.25F, 0F, 0F, 0.01F, -2.5F, 0.5F, -1.25F, 1.25F, -0.25F, -2F, 0F, -0.25F, 1F, 0F, -0.25F, 1.76F, 1.75F, -0.25F, 0.75F); // Box 245
		turretModel[31].setRotationPoint(14F, -23F, 1F);

		turretModel[32].addShapeBox(-15.75F, -15.75F, -18.5F, 2, 2, 31, 0F,3.25F, 0F, -10F, -0.5F, 0F, -2.25F, -0.5F, 0F, -2F, 0F, 0.25F, -2.75F, 3.25F, -0.5F, -8F, -0.5F, 0F, -2.25F, -0.5F, 0F, 0.5F, 0F, -0.5F, -0.75F); // Box 246
		turretModel[32].setRotationPoint(14F, -23F, 1F);

		turretModel[33].addShapeBox(0.75F, -16.5F, -12.75F, 11, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 247
		turretModel[33].setRotationPoint(14F, -23F, 1F);

		turretModel[34].addShapeBox(11.75F, -16.5F, -12.75F, 2, 2, 25, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 248
		turretModel[34].setRotationPoint(14F, -23F, 1F);

		turretModel[35].addShapeBox(-14.25F, -17.75F, -16.25F, 8, 2, 15, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 249
		turretModel[35].setRotationPoint(14F, -23F, 1F);

		turretModel[36].addShapeBox(-17.75F, -17.75F, -16.25F, 4, 2, 15, 0F,-1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -6F, 0.25F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -5.5F); // Box 251
		turretModel[36].setRotationPoint(14F, -23F, 1F);

		turretModel[37].addShapeBox(-7.25F, -17.75F, -16.25F, 5, 2, 15, 0F,-0.5F, 0F, -1F, -0.5F, 0.75F, -3F, -0.5F, 0.75F, -3F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F); // Box 252
		turretModel[37].setRotationPoint(14F, -23F, 1F);

		turretModel[38].addShapeBox(-3.25F, -17.75F, -13.25F, 4, 2, 9, 0F,-0.5F, 0.75F, 0F, -0.5F, 0.75F, -3F, -0.5F, 0.75F, -3F, -0.5F, 0.75F, 0F, -0.5F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 1F); // Box 253
		turretModel[38].setRotationPoint(14F, -23F, 1F);

		turretModel[39].addShapeBox(-14.25F, -18.75F, -15.25F, 4, 1, 13, 0F,-0.5F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 254
		turretModel[39].setRotationPoint(14F, -23F, 1F);

		turretModel[40].addShapeBox(-10.25F, -18.75F, -15.25F, 4, 1, 13, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		turretModel[40].setRotationPoint(14F, -23F, 1F);

		turretModel[41].addShapeBox(-17.75F, -18.75F, -16.25F, 4, 1, 15, 0F,-1.5F, 0.5F, -6F, 0F, 0.5F, -2F, 0F, 0.5F, -1.75F, -1.5F, 0.5F, -6F, -1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -6F); // Box 256
		turretModel[41].setRotationPoint(14F, -23F, 1F);

		turretModel[42].addShapeBox(-6.75F, -18.75F, -15.25F, 5, 1, 13, 0F,0F, 0.5F, -0.75F, -0.5F, 0.5F, -2.75F, -0.5F, 0.5F, -2.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -2.75F, -0.5F, 0F, -2.75F, 0F, 0F, -0.75F); // Box 257
		turretModel[42].setRotationPoint(14F, -23F, 1F);

		turretModel[43].addShapeBox(-2.75F, -18.75F, -12.5F, 3, 1, 8, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, -2.5F, -0.5F, 0.5F, -2.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F); // Box 258
		turretModel[43].setRotationPoint(14F, -23F, 1F);

		turretModel[44].addShapeBox(-31.5F, -16.25F, -3.5F, 3, 9, 7, 0F,-0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F); // Box 652
		turretModel[44].setRotationPoint(14F, -23F, 1F);

		turretModel[45].addShapeBox(-29F, -16.25F, -3.5F, 3, 9, 7, 0F,-0.25F, 0F, 0.2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, 0F, 0.2F); // Box 653
		turretModel[45].setRotationPoint(14F, -23F, 1F);

		turretModel[46].addShapeBox(-34F, -16.25F, -3.5F, 3, 9, 7, 0F,-0.5F, 0F, -2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, 0F, -2F); // Box 654
		turretModel[46].setRotationPoint(14F, -23F, 1F);

		turretModel[47].addShapeBox(-10.25F, -15.75F, 13F, 3, 5, 2, 0F,0F, 0F, 0.75F, 0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, -2F); // Box 296
		turretModel[47].setRotationPoint(14F, -23F, 1F);

		turretModel[48].addShapeBox(-10.25F, -15.75F, 13F, 3, 4, 2, 0F,0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 297
		turretModel[48].setRotationPoint(14F, -23F, 1F);

		turretModel[49].addShapeBox(-4.25F, -15.75F, 13.75F, 5, 6, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0.1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.2F, 0F, 0.5F); // Box 298
		turretModel[49].setRotationPoint(14F, -23F, 1F);

		turretModel[50].addShapeBox(-6.45F, -15.75F, 13.75F, 2, 6, 2, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.8F, 0F, -0.75F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.1F, 0F, -0.75F); // Box 299
		turretModel[50].setRotationPoint(14F, -23F, 1F);

		turretModel[51].addShapeBox(-4F, -16.5F, 5F, 3, 10, 9, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F); // Box 614
		turretModel[51].setRotationPoint(14F, -23F, 1F);

		turretModel[52].addShapeBox(-6F, -16.5F, 5F, 2, 10, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 615
		turretModel[52].setRotationPoint(14F, -23F, 1F);

		turretModel[53].addShapeBox(-7F, -16.5F, 5F, 1, 10, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 616
		turretModel[53].setRotationPoint(14F, -23F, 1F);

		turretModel[54].addShapeBox(-1F, -16.5F, 6.5F, 1, 10, 6, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 617
		turretModel[54].setRotationPoint(14F, -23F, 1F);

		turretModel[55].addShapeBox(-7.5F, -16.5F, 6F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		turretModel[55].setRotationPoint(14F, -23.15F, 1F);

		turretModel[56].addShapeBox(-7.5F, -16.5F, 11F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		turretModel[56].setRotationPoint(14F, -23.15F, 1F);

		turretModel[57].addShapeBox(6F, -15.5F, -15.5F, 5, 2, 30, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 363
		turretModel[57].setRotationPoint(14F, -23F, 1F);

		turretModel[58].addShapeBox(6F, -14F, -15.5F, 5, 2, 30, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 364
		turretModel[58].setRotationPoint(14F, -23F, 1F);

		turretModel[59].addShapeBox(6F, -12.5F, -15.5F, 5, 2, 30, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 365
		turretModel[59].setRotationPoint(14F, -23F, 1F);

		turretModel[60].addShapeBox(3.75F, -15.7F, -15.75F, 1, 1, 27, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 309
		turretModel[60].setRotationPoint(14F, -23F, 1F);

		turretModel[61].addShapeBox(-4.5F, -15.7F, -16.5F, 9, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 310
		turretModel[61].setRotationPoint(14F, -23F, 1F);

		turretModel[62].addShapeBox(1.75F, -12.75F, 15.5F, 3, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F); // Box 311
		turretModel[62].setRotationPoint(14F, -23F, 1F);

		turretModel[63].addShapeBox(4.5F, -12.75F, 12.25F, 1, 1, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F); // Box 312
		turretModel[63].setRotationPoint(14F, -23F, 1F);

		turretModel[64].addShapeBox(-6.75F, -12.75F, 15.5F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -0.25F); // Box 313
		turretModel[64].setRotationPoint(14F, -23F, 1F);

		turretModel[65].addShapeBox(-2.5F, -12.75F, 16F, 4, 1, 1, 0F,0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F); // Box 314
		turretModel[65].setRotationPoint(14F, -23F, 1F);

		turretModel[66].addShapeBox(-32.75F, -12.75F, 15F, 26, 1, 1, 0F,0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F); // Box 315
		turretModel[66].setRotationPoint(14F, -23F, 1F);

		turretModel[67].addShapeBox(-32.5F, -12.75F, 6.5F, 1, 1, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 316
		turretModel[67].setRotationPoint(14F, -23F, 1F);

		turretModel[68].addShapeBox(-32.75F, -7.5F, 18F, 26, 1, 1, 0F,0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F); // Box 317
		turretModel[68].setRotationPoint(14F, -23F, 1F);

		turretModel[69].addShapeBox(-32.75F, -7.5F, 19.25F, 26, 1, 1, 0F,0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, -5.25F); // Box 318
		turretModel[69].setRotationPoint(14F, -23F, 1F);

		turretModel[70].addShapeBox(-33.5F, -7.5F, 10F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F); // Box 319
		turretModel[70].setRotationPoint(14F, -23F, 1F);

		turretModel[71].addShapeBox(-20.5F, -7.5F, 12.25F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 320
		turretModel[71].setRotationPoint(14F, -23F, 1F);

		turretModel[72].addShapeBox(-7.5F, -7.5F, 15.25F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 321
		turretModel[72].setRotationPoint(14F, -23F, 1F);

		turretModel[73].addShapeBox(3.5F, -7.5F, 15.25F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 322
		turretModel[73].setRotationPoint(14F, -23F, 1F);

		turretModel[74].addShapeBox(-6.75F, -7.5F, 19.75F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F); // Box 323
		turretModel[74].setRotationPoint(14F, -23F, 1F);

		turretModel[75].addShapeBox(-6.75F, -7.5F, 18.5F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F); // Box 324
		turretModel[75].setRotationPoint(14F, -23F, 1F);

		turretModel[76].addShapeBox(0.25F, -7.5F, 20.75F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F); // Box 325
		turretModel[76].setRotationPoint(14F, -23F, 1F);

		turretModel[77].addShapeBox(0.25F, -7.5F, 19.5F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F); // Box 326
		turretModel[77].setRotationPoint(14F, -23F, 1F);

		turretModel[78].addShapeBox(-2.75F, -7.5F, 19.5F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 327
		turretModel[78].setRotationPoint(14F, -23F, 1F);

		turretModel[79].addShapeBox(-2.75F, -7.5F, 20.75F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 328
		turretModel[79].setRotationPoint(14F, -23F, 1F);

		turretModel[80].addShapeBox(4.25F, -7.5F, 19.75F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F); // Box 329
		turretModel[80].setRotationPoint(14F, -23F, 1F);

		turretModel[81].addShapeBox(8.25F, -7.5F, 16.75F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 2.75F, 0F, -0.25F, -3.25F, 0F, -0.25F, -0.25F); // Box 330
		turretModel[81].setRotationPoint(14F, -23F, 1F);

		turretModel[82].addShapeBox(-10.75F, -9.1F, -19.25F, 15, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 331
		turretModel[82].setRotationPoint(14F, -23F, 1F);

		turretModel[83].addShapeBox(-10.75F, -9.1F, -21F, 16, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332
		turretModel[83].setRotationPoint(14F, -23F, 1F);

		turretModel[84].addShapeBox(3.5F, -9.1F, -20.75F, 1, 1, 5, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 333
		turretModel[84].setRotationPoint(14F, -23F, 1F);

		turretModel[85].addShapeBox(6.75F, -9.1F, -20.75F, 1, 1, 5, 0F,1.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 334
		turretModel[85].setRotationPoint(14F, -23F, 1F);

		turretModel[86].addShapeBox(-14.75F, -9.1F, -19.25F, 4, 1, 1, 0F,0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F); // Box 335
		turretModel[86].setRotationPoint(14F, -23F, 1F);

		turretModel[87].addShapeBox(-14.75F, -9.1F, -21F, 4, 1, 1, 0F,0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.75F); // Box 336
		turretModel[87].setRotationPoint(14F, -23F, 1F);

		turretModel[88].addShapeBox(-16.75F, -9.1F, -18.25F, 2, 1, 1, 0F,0.25F, -0.25F, -2.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F, 0.25F, -0.25F, -2.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F); // Box 337
		turretModel[88].setRotationPoint(14F, -23F, 1F);

		turretModel[89].addShapeBox(-17.75F, -9.1F, -20F, 3, 1, 1, 0F,-0.05F, -0.25F, -2.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F, -0.05F, -0.25F, -2.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F); // Box 338
		turretModel[89].setRotationPoint(14F, -23F, 1F);

		turretModel[90].addShapeBox(-10.5F, -9.1F, -23.15F, 1, 1, 5, 0F,-0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 339
		turretModel[90].setRotationPoint(14F, -23F, 1F);
		turretModel[90].rotateAngleY = -0.38397244F;

		turretModel[91].addShapeBox(-10.53F, -15.7F, -22.15F, 1, 1, 5, 0F,-0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 340
		turretModel[91].setRotationPoint(14F, -23F, 1F);
		turretModel[91].rotateAngleY = -0.38397244F;

		turretModel[92].addShapeBox(-17.4F, -15.7F, -19.05F, 3, 1, 1, 0F,-0.05F, -0.25F, -2.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F, -0.05F, -0.25F, -2.2F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 1.75F); // Box 341
		turretModel[92].setRotationPoint(14F, -23F, 1F);

		turretModel[93].addShapeBox(-14.4F, -15.7F, -20.05F, 6, 1, 1, 0F,0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F); // Box 342
		turretModel[93].setRotationPoint(14F, -23F, 1F);

		turretModel[94].addShapeBox(-8.4F, -15.7F, -19.05F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, -0.05F, -0.25F, -2.8F, -0.1F, -0.25F, 2.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.05F, -0.25F, -2.8F, -0.1F, -0.25F, 2.3F, 0F, -0.25F, -0.25F); // Box 343
		turretModel[94].setRotationPoint(14F, -23F, 1F);

		turretModel[95].addShapeBox(0.75F, -16.5F, -14.75F, 7, 1, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		turretModel[95].setRotationPoint(14F, -23F, 1F);

		turretModel[96].addShapeBox(-45F, -15.75F, -8F, 9, 9, 16, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 3F); // Box 345
		turretModel[96].setRotationPoint(14F, -23F, 1F);

		turretModel[97].addShapeBox(-45F, -6.25F, -8F, 9, 2, 16, 0F,0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 3F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F); // Box 346
		turretModel[97].setRotationPoint(14F, -23F, 1F);

		turretModel[98].addShapeBox(-37F, -12.75F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		turretModel[98].setRotationPoint(14F, -23F, 1F);

		turretModel[99].addShapeBox(-37F, -6.75F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		turretModel[99].setRotationPoint(14F, -23F, 1F);

		turretModel[100].addShapeBox(-37F, -6.75F, 5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		turretModel[100].setRotationPoint(14F, -23F, 1F);

		turretModel[101].addShapeBox(-37F, -12.75F, 5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		turretModel[101].setRotationPoint(14F, -23F, 1F);

		turretModel[102].addShapeBox(-37F, -12.75F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		turretModel[102].setRotationPoint(14F, -23F, 1F);

		turretModel[103].addShapeBox(-37F, -6.75F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		turretModel[103].setRotationPoint(14F, -23F, 1F);

		turretModel[104].addShapeBox(-20F, -16.5F, 7F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		turretModel[104].setRotationPoint(14F, -23F, 1F);

		turretModel[105].addShapeBox(-32F, -16F, -8F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		turretModel[105].setRotationPoint(14F, -23F, 1F);

		turretModel[106].addShapeBox(2F, -17.5F, 7F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 355
		turretModel[106].setRotationPoint(14F, -23F, 1F);

		turretModel[107].addShapeBox(2.25F, -17.75F, -14.3F, 3, 4, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 671
		turretModel[107].setRotationPoint(14F, -24F, 1F);

		turretModel[108].addShapeBox(2.25F, -17.75F, -7.8F, 3, 4, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 672
		turretModel[108].setRotationPoint(14F, -24F, 1F);

		turretModel[109].addShapeBox(2.25F, -18.4F, -13.55F, 3, 1, 6, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F); // Box 673
		turretModel[109].setRotationPoint(14F, -24F, 1F);

		turretModel[110].addShapeBox(4.1F, -17F, -13.1F, 1, 1, 5, 0F,-0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 674
		turretModel[110].setRotationPoint(14F, -24F, 1F);

		turretModel[111].addShapeBox(3F, -17F, -13.1F, 2, 1, 5, 0F,-1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 675
		turretModel[111].setRotationPoint(14F, -24F, 1F);

		turretModel[112].addShapeBox(2F, -16F, -13.6F, 3, 9, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 676
		turretModel[112].setRotationPoint(14F, -24F, 1F);

		turretModel[113].addShapeBox(4.5F, -16F, -13.6F, 2, 9, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F); // Box 677
		turretModel[113].setRotationPoint(14F, -24F, 1F);

		turretModel[114].addShapeBox(-5.75F, -20.5F, -12.3F, 3, 4, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 363
		turretModel[114].setRotationPoint(14F, -24F, 1F);

		turretModel[115].addShapeBox(-5.75F, -20.5F, -5.8F, 3, 4, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 364
		turretModel[115].setRotationPoint(14F, -24F, 1F);

		turretModel[116].addShapeBox(-5.75F, -21.15F, -11.55F, 3, 1, 6, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F, 0F, -0.35F, 0.4F); // Box 365
		turretModel[116].setRotationPoint(14F, -24F, 1F);

		turretModel[117].addShapeBox(-3.9F, -19.75F, -11.1F, 1, 1, 5, 0F,-0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F); // Box 366
		turretModel[117].setRotationPoint(14F, -24F, 1F);

		turretModel[118].addShapeBox(-5F, -19.75F, -11.1F, 2, 1, 5, 0F,-1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 367
		turretModel[118].setRotationPoint(14F, -24F, 1F);

		turretModel[119].addShapeBox(-6F, -18.75F, -11.6F, 3, 9, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 368
		turretModel[119].setRotationPoint(14F, -24F, 1F);

		turretModel[120].addShapeBox(-3.5F, -18.75F, -11.6F, 2, 9, 6, 0F,-0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.25F, 0F, 0F); // Box 369
		turretModel[120].setRotationPoint(14F, -24F, 1F);

		turretModel[121].addShapeBox(-9.5F, -19.5F, -12.85F, 3, 9, 8, 0F,0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 655
		turretModel[121].setRotationPoint(14F, -23F, 1F);

		turretModel[122].addShapeBox(-13F, -19.5F, -12.85F, 4, 9, 8, 0F,-0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F); // Box 656
		turretModel[122].setRotationPoint(14F, -23F, 1F);

		turretModel[123].addShapeBox(-15.5F, -19.5F, -12.85F, 3, 9, 8, 0F,0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 657
		turretModel[123].setRotationPoint(14F, -23F, 1F);

		turretModel[124].addShapeBox(-18F, -20F, -11.5F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 373
		turretModel[124].setRotationPoint(14F, -23F, 1F);

		turretModel[125].addShapeBox(-18F, -20F, -6.5F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F); // Box 374
		turretModel[125].setRotationPoint(14F, -23F, 1F);

		turretModel[126].addShapeBox(-19F, -20F, -11.5F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 375
		turretModel[126].setRotationPoint(14F, -23F, 1F);

		turretModel[127].addShapeBox(-19F, -20F, -6.5F, 2, 3, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 376
		turretModel[127].setRotationPoint(14F, -23F, 1F);

		turretModel[128].addShapeBox(-20F, -18F, -12.5F, 5, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F); // Box 377
		turretModel[128].setRotationPoint(14F, -23F, 1F);

		turretModel[129].addShapeBox(-20F, -18F, -10.5F, 5, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F); // Box 378
		turretModel[129].setRotationPoint(14F, -23F, 1F);

		turretModel[130].addShapeBox(-20F, -18F, -5.5F, 5, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F); // Box 379
		turretModel[130].setRotationPoint(14F, -23F, 1F);

		turretModel[131].addShapeBox(-20F, -18F, -7.5F, 5, 2, 1, 0F,-0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F); // Box 380
		turretModel[131].setRotationPoint(14F, -23F, 1F);

		turretModel[132].addShapeBox(-19F, -18F, -13.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		turretModel[132].setRotationPoint(14F, -23F, 1F);

		turretModel[133].addShapeBox(-19F, -18F, -6.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		turretModel[133].setRotationPoint(14F, -23F, 1F);

		turretModel[134].addShapeBox(-19F, -18F, -15.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 383
		turretModel[134].setRotationPoint(14F, -23F, 1F);

		turretModel[135].addShapeBox(-19F, -18F, -4.5F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 384
		turretModel[135].setRotationPoint(14F, -23F, 1F);

		turretModel[136].addShapeBox(-10.5F, -19.75F, -9.75F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 385
		turretModel[136].setRotationPoint(14F, -23F, 1F);

		turretModel[137].addShapeBox(-44F, 6.5F, 8F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		turretModel[137].setRotationPoint(14F, -34F, 1F);
		turretModel[137].rotateAngleX = 0.45378561F;

		turretModel[138].addShapeBox(-44F, 5.5F, 8F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		turretModel[138].setRotationPoint(14F, -34F, 1F);
		turretModel[138].rotateAngleX = 0.45378561F;

		turretModel[139].addShapeBox(-38F, 5.5F, 8F, 1, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		turretModel[139].setRotationPoint(14F, -34F, 1F);
		turretModel[139].rotateAngleX = 0.45378561F;

		turretModel[140].addShapeBox(-44F, 5.5F, -10.5F, 1, 1, 3, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		turretModel[140].setRotationPoint(14F, -34F, 1F);
		turretModel[140].rotateAngleX = -0.45378561F;

		turretModel[141].addShapeBox(-44F, 6.5F, -11.5F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		turretModel[141].setRotationPoint(14F, -34F, 1F);
		turretModel[141].rotateAngleX = -0.45378561F;

		turretModel[142].addShapeBox(-38F, 5.5F, -10.5F, 1, 1, 3, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		turretModel[142].setRotationPoint(14F, -34F, 1F);
		turretModel[142].rotateAngleX = -0.45378561F;

		turretModel[143].addShapeBox(-13.75F, -13.2F, -17.95F, 32, 32, 1, 0F,-11F, -11F, 0.5F, -11F, -11F, -0.5F, -11F, -11F, 0F, -11F, -11F, -0.25F, -11F, -11F, 1F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, -1.25F); // Box 904
		turretModel[143].setRotationPoint(14F, -26.3F, 1F);
		turretModel[143].rotateAngleX = -0.40142573F;
		turretModel[143].rotateAngleY = -0.06981317F;

		turretModel[144].addShapeBox(-19F, -11.2F, 16.75F, 32, 32, 1, 0F,-11F, -11F, 0.5F, -11F, -11F, 0.75F, -11F, -11F, -0.5F, -11F, -11F, -0.25F, -11F, -11F, 1F, -11F, -11F, 0F, -11F, -11F, 0F, -11F, -11F, -0.5F); // Box 460
		turretModel[144].setRotationPoint(14F, -26.3F, 1F);
		turretModel[144].rotateAngleX = 0.48869219F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 606
		barrelModel[1] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 607
		barrelModel[2] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 608
		barrelModel[3] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 265
		barrelModel[4] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 266
		barrelModel[5] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 269
		barrelModel[6] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 270
		barrelModel[7] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 271
		barrelModel[8] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 272
		barrelModel[9] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 273
		barrelModel[10] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 274
		barrelModel[11] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 275
		barrelModel[12] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 276
		barrelModel[13] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 277
		barrelModel[14] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 278
		barrelModel[15] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 279
		barrelModel[16] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 280
		barrelModel[17] = new ModelRendererTurbo(this, 977, 201, textureX, textureY); // Box 282
		barrelModel[18] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 283
		barrelModel[19] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 284
		barrelModel[20] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 286
		barrelModel[21] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 287
		barrelModel[22] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 288
		barrelModel[23] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 289
		barrelModel[24] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 290
		barrelModel[25] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 291
		barrelModel[26] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 293
		barrelModel[27] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 294
		barrelModel[28] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 295
		barrelModel[29] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 429
		barrelModel[30] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 430
		barrelModel[31] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 431
		barrelModel[32] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 432

		barrelModel[0].addShapeBox(2F, -0.6F, -1.75F, 53, 1, 3, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 606
		barrelModel[0].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[1].addShapeBox(2F, -1.4F, -1.75F, 53, 1, 3, 0F,0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 607
		barrelModel[1].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[2].addShapeBox(2F, 0.2F, -1.75F, 53, 1, 3, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F); // Box 608
		barrelModel[2].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[3].addShapeBox(42F, 1.4F, -1.75F, 12, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 265
		barrelModel[3].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[4].addShapeBox(42F, 0.6F, -1.75F, 12, 1, 3, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 266
		barrelModel[4].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[5].addShapeBox(42F, 2.2F, -1.75F, 12, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 269
		barrelModel[5].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[6].addShapeBox(55F, 0.6F, -1.75F, 3, 1, 3, 0F,0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 270
		barrelModel[6].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[7].addShapeBox(55F, 1.4F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 271
		barrelModel[7].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[8].addShapeBox(55F, 2.2F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F); // Box 272
		barrelModel[8].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[9].addShapeBox(57F, -1.4F, -4F, 3, 1, 7, 0F,-1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F); // Box 273
		barrelModel[9].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[10].addShapeBox(57F, -0.6F, -4F, 3, 1, 7, 0F,-0.25F, -0.1F, 0F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F); // Box 274
		barrelModel[10].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[11].addShapeBox(57F, 0.2F, -4F, 3, 1, 7, 0F,-0.25F, -0.1F, 0F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F, -1.1F, -0.05F, 0F); // Box 275
		barrelModel[11].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[12].addShapeBox(57F, -0.6F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 276
		barrelModel[12].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[13].addShapeBox(57F, -1.4F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 277
		barrelModel[13].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[14].addShapeBox(57F, 0.2F, -1.75F, 3, 1, 3, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F, 0F, -0.1F, -1.1F); // Box 278
		barrelModel[14].setRotationPoint(34.5F, -28F, 1.5F);

		barrelModel[15].addShapeBox(7.5F, 0.6F, -1.75F, 7, 1, 3, 0F,0F, 0.5F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0.5F, -0.95F, 0F, -0.3F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, 0.5F); // Box 279
		barrelModel[15].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[16].addShapeBox(7.5F, 1.4F, -1.75F, 7, 1, 3, 0F,0F, 0.1F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, 0.5F); // Box 280
		barrelModel[16].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[17].addShapeBox(2F, 0F, -7.75F, 4, 3, 15, 0F,-0.25F, -0.5F, 0.25F, -0.5F, -1F, -5.5F, -0.5F, -1F, -5.5F, -0.25F, -0.5F, 0.25F, 0.25F, 1F, -0.25F, -0.5F, 0F, -5.5F, -0.5F, 0F, -5.5F, 0.25F, 1F, 0.25F); // Box 282
		barrelModel[17].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[18].addShapeBox(1F, -3F, -7.75F, 4, 3, 15, 0F,1.25F, 2F, -1.25F, 0.25F, -2.75F, -6.75F, 0.25F, -2.75F, -6.75F, 1.25F, 2F, -0.75F, -1.25F, 0.5F, 0.25F, 0.5F, 1F, -5.5F, 0.5F, 1F, -5.5F, -1.25F, 0.5F, 0.25F); // Box 283
		barrelModel[18].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[19].addShapeBox(-1.25F, -3F, -7.75F, 1, 2, 15, 0F,0F, 2F, -0.75F, 0F, 2F, -1.25F, 0F, 2F, -0.75F, 0F, 2F, -0.5F, -2.25F, 1.5F, 1F, 2.5F, 1.5F, 0.25F, 2.5F, 1.5F, 0.25F, -2.25F, 1.5F, 1.25F); // Box 284
		barrelModel[19].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[20].addShapeBox(1F, 0.5F, -8.75F, 1, 3, 17, 0F,0F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0.25F, 0.5F, 0.5F, -0.5F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -0.75F, 0.5F, 0.5F, 0F); // Box 286
		barrelModel[20].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[21].addShapeBox(0.5F, 4F, -8.75F, 1, 3, 17, 0F,0F, 0F, -0.5F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, -5.5F, -0.25F, -0.5F, -7.25F, -0.25F, -0.5F, -6.75F, 0.5F, 0F, -5F); // Box 287
		barrelModel[21].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[22].addShapeBox(1.75F, 4F, -8.75F, 4, 3, 17, 0F,0F, 0F, -1.25F, -0.25F, 1F, -6.5F, -0.25F, 1F, -6.5F, 0F, 0F, -0.75F, 0.5F, -0.5F, -7.25F, -0.5F, -2.75F, -7.8F, -0.5F, -2.75F, -7.8F, 0.5F, -0.5F, -6.75F); // Box 288
		barrelModel[22].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[23].addShapeBox(7.5F, 2.2F, -1.75F, 7, 1, 3, 0F,0F, -0.3F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, 0.5F, 0F, 0.5F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0.5F, -0.95F); // Box 289
		barrelModel[23].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[24].addShapeBox(5.5F, 1.4F, -1.75F, 2, 1, 3, 0F,0F, 0.4F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.6F, 0.5F); // Box 290
		barrelModel[24].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[25].addShapeBox(5.5F, 0.2F, -1.75F, 2, 1, 3, 0F,0.25F, 0.45F, -0.7F, 0F, 0.1F, -0.95F, 0F, 0.1F, -0.95F, 0.25F, 0.45F, -0.75F, 0F, -0.2F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.2F, 0.5F); // Box 291
		barrelModel[25].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[26].addShapeBox(5.5F, 2.8F, -1.75F, 2, 1, 3, 0F,0F, -0.2F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, -0.2F, 0.5F, 0.25F, 0.45F, -0.8F, 0F, -0.1F, -0.95F, 0F, -0.1F, -0.95F, 0.25F, 0.45F, -0.8F); // Box 293
		barrelModel[26].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[27].addShapeBox(-2F, -1.5F, 5.25F, 5, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 294
		barrelModel[27].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[28].addShapeBox(0F, -1.5F, 5.25F, 5, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 295
		barrelModel[28].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[29].addShapeBox(-1.25F, -6F, -5.75F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		barrelModel[29].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[30].addShapeBox(-1.25F, -7F, -5.75F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		barrelModel[30].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[31].addShapeBox(-1.25F, -7F, 3.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		barrelModel[31].setRotationPoint(34.5F, -30F, 1.5F);

		barrelModel[32].addShapeBox(-1.25F, -6F, 3.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		barrelModel[32].setRotationPoint(34.5F, -30F, 1.5F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 523
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 524
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 525
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 31
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 32
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 33
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 34
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 35
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 36
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 37
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 38
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 39
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 40
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 41
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 42
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 43
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 44
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 45
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 46
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 47
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 48
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 49
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 50
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 51
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 80
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 81
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 82
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 83
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 84
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 85
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 86
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 87
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 154
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 155
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 156
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 181
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 182
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 183
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 184
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 185
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 186
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 697, 169, textureX, textureY); // Box 398
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 399
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 769, 225, textureX, textureY); // Box 401
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 977, 225, textureX, textureY); // Box 402

		leftTrackWheelModels[0].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		leftTrackWheelModels[0].setRotationPoint(-2F, 2.2F, 29F);

		leftTrackWheelModels[1].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 524
		leftTrackWheelModels[1].setRotationPoint(-2F, 2.2F, 29F);

		leftTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 525
		leftTrackWheelModels[2].setRotationPoint(-2F, 2.2F, 29F);

		leftTrackWheelModels[3].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		leftTrackWheelModels[3].setRotationPoint(-15.5F, 2.2F, 29F);

		leftTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 32
		leftTrackWheelModels[4].setRotationPoint(-15.5F, 2.2F, 29F);

		leftTrackWheelModels[5].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 33
		leftTrackWheelModels[5].setRotationPoint(-15.5F, 2.2F, 29F);

		leftTrackWheelModels[6].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[6].setRotationPoint(-28.5F, 2.2F, 29F);

		leftTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 35
		leftTrackWheelModels[7].setRotationPoint(-28.5F, 2.2F, 29F);

		leftTrackWheelModels[8].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 36
		leftTrackWheelModels[8].setRotationPoint(-28.5F, 2.2F, 29F);

		leftTrackWheelModels[9].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftTrackWheelModels[9].setRotationPoint(10.75F, 2.2F, 29F);

		leftTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 38
		leftTrackWheelModels[10].setRotationPoint(10.75F, 2.2F, 29F);

		leftTrackWheelModels[11].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 39
		leftTrackWheelModels[11].setRotationPoint(10.75F, 2.2F, 29F);

		leftTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackWheelModels[12].setRotationPoint(23.75F, 2.2F, 29F);

		leftTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 41
		leftTrackWheelModels[13].setRotationPoint(23.75F, 2.2F, 29F);

		leftTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 42
		leftTrackWheelModels[14].setRotationPoint(23.75F, 2.2F, 29F);

		leftTrackWheelModels[15].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftTrackWheelModels[15].setRotationPoint(39F, 2.2F, 29F);

		leftTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 44
		leftTrackWheelModels[16].setRotationPoint(39F, 2.2F, 29F);

		leftTrackWheelModels[17].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 45
		leftTrackWheelModels[17].setRotationPoint(39F, 2.2F, 29F);

		leftTrackWheelModels[18].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackWheelModels[18].setRotationPoint(48.75F, -7.8F, 29.25F);

		leftTrackWheelModels[19].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 47
		leftTrackWheelModels[19].setRotationPoint(48.75F, -7.8F, 29.25F);

		leftTrackWheelModels[20].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 48
		leftTrackWheelModels[20].setRotationPoint(48.75F, -7.8F, 29.25F);

		leftTrackWheelModels[21].addShapeBox(-5.75F, -6F, -7F, 12, 4, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftTrackWheelModels[21].setRotationPoint(-48.5F, -6.5F, 28.25F);

		leftTrackWheelModels[22].addBox(-5.75F, -2F, -7F, 12, 4, 9, 0F); // Box 50
		leftTrackWheelModels[22].setRotationPoint(-48.5F, -6.5F, 28.25F);

		leftTrackWheelModels[23].addShapeBox(-5.75F, 2F, -7F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 51
		leftTrackWheelModels[23].setRotationPoint(-48.5F, -6.5F, 28.25F);

		leftTrackWheelModels[24].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 79
		leftTrackWheelModels[24].setRotationPoint(3.5F, -10F, 28.25F);

		leftTrackWheelModels[25].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 80
		leftTrackWheelModels[25].setRotationPoint(3.5F, -10F, 28.25F);

		leftTrackWheelModels[26].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 81
		leftTrackWheelModels[26].setRotationPoint(3.5F, -10F, 28.25F);

		leftTrackWheelModels[27].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 82
		leftTrackWheelModels[27].setRotationPoint(30F, -10F, 28.25F);

		leftTrackWheelModels[28].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 83
		leftTrackWheelModels[28].setRotationPoint(30F, -10F, 28.25F);

		leftTrackWheelModels[29].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 84
		leftTrackWheelModels[29].setRotationPoint(30F, -10F, 28.25F);

		leftTrackWheelModels[30].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 85
		leftTrackWheelModels[30].setRotationPoint(-23.5F, -10F, 28.25F);

		leftTrackWheelModels[31].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 86
		leftTrackWheelModels[31].setRotationPoint(-23.5F, -10F, 28.25F);

		leftTrackWheelModels[32].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 87
		leftTrackWheelModels[32].setRotationPoint(-23.5F, -10F, 28.25F);

		leftTrackWheelModels[33].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 154
		leftTrackWheelModels[33].setRotationPoint(-39F, 1.25F, 28F);

		leftTrackWheelModels[34].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 155
		leftTrackWheelModels[34].setRotationPoint(-39F, 1.25F, 28F);

		leftTrackWheelModels[35].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 156
		leftTrackWheelModels[35].setRotationPoint(-39F, 1.25F, 28F);

		leftTrackWheelModels[36].addShapeBox(-5.75F, -6F, -7F, 14, 4, 5, 0F,-4F, 3F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		leftTrackWheelModels[36].setRotationPoint(-48.5F, -6.5F, 21.75F);

		leftTrackWheelModels[37].addBox(-5.75F, -2F, -7F, 14, 4, 5, 0F); // Box 182
		leftTrackWheelModels[37].setRotationPoint(-48.5F, -6.5F, 21.75F);

		leftTrackWheelModels[38].addShapeBox(-5.75F, 2F, -7F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 183
		leftTrackWheelModels[38].setRotationPoint(-48.5F, -6.5F, 21.75F);

		leftTrackWheelModels[39].addShapeBox(-5.75F, -6F, -7F, 14, 4, 5, 0F,-4F, 4F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftTrackWheelModels[39].setRotationPoint(-48.5F, -6.5F, -10.75F);

		leftTrackWheelModels[40].addBox(-5.75F, -2F, -7F, 14, 4, 5, 0F); // Box 185
		leftTrackWheelModels[40].setRotationPoint(-48.5F, -6.5F, -10.75F);

		leftTrackWheelModels[41].addShapeBox(-5.75F, 2F, -7F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 186
		leftTrackWheelModels[41].setRotationPoint(-48.5F, -6.5F, -10.75F);

		leftTrackWheelModels[42].addShapeBox(-5.75F, 2F, -7F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 398
		leftTrackWheelModels[42].setRotationPoint(45.5F, -6.5F, 21.5F);

		leftTrackWheelModels[43].addBox(-5.75F, -2F, -7F, 14, 4, 5, 0F); // Box 399
		leftTrackWheelModels[43].setRotationPoint(45.5F, -6.5F, 21.5F);

		leftTrackWheelModels[44].addBox(-5.75F, -2F, -7F, 14, 4, 5, 0F); // Box 401
		leftTrackWheelModels[44].setRotationPoint(45.5F, -6.5F, -10.5F);

		leftTrackWheelModels[45].addShapeBox(-5.75F, 2F, -7F, 14, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 402
		leftTrackWheelModels[45].setRotationPoint(45.5F, -6.5F, -10.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 52
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 53
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 54
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 55
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 56
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 57
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 58
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 59
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 60
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 61
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 62
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 63
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 64
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 65
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 66
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 67
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 68
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 69
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 70
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 71
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 72
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 73
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 74
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 75
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 112
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 113
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 114
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 115
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 116
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 117
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 118
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 119
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 120
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 977, 89, textureX, textureY); // Box 151
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 152
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 153

		rightTrackWheelModels[0].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		rightTrackWheelModels[0].setRotationPoint(-48.5F, -6.5F, -20.75F);

		rightTrackWheelModels[1].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 53
		rightTrackWheelModels[1].setRotationPoint(-48.5F, -6.5F, -20.75F);

		rightTrackWheelModels[2].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 54
		rightTrackWheelModels[2].setRotationPoint(-48.5F, -6.5F, -20.75F);

		rightTrackWheelModels[3].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightTrackWheelModels[3].setRotationPoint(-28.5F, 2.2F, -20.75F);

		rightTrackWheelModels[4].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 56
		rightTrackWheelModels[4].setRotationPoint(-28.5F, 2.2F, -20.75F);

		rightTrackWheelModels[5].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 57
		rightTrackWheelModels[5].setRotationPoint(-28.5F, 2.2F, -20.75F);

		rightTrackWheelModels[6].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightTrackWheelModels[6].setRotationPoint(-15.5F, 2.2F, -20.75F);

		rightTrackWheelModels[7].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 59
		rightTrackWheelModels[7].setRotationPoint(-15.5F, 2.2F, -20.75F);

		rightTrackWheelModels[8].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 60
		rightTrackWheelModels[8].setRotationPoint(-15.5F, 2.2F, -20.75F);

		rightTrackWheelModels[9].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightTrackWheelModels[9].setRotationPoint(-2F, 2.2F, -20.75F);

		rightTrackWheelModels[10].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 62
		rightTrackWheelModels[10].setRotationPoint(-2F, 2.2F, -20.75F);

		rightTrackWheelModels[11].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 63
		rightTrackWheelModels[11].setRotationPoint(-2F, 2.2F, -20.75F);

		rightTrackWheelModels[12].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		rightTrackWheelModels[12].setRotationPoint(10.75F, 2.2F, -20.75F);

		rightTrackWheelModels[13].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 65
		rightTrackWheelModels[13].setRotationPoint(10.75F, 2.2F, -20.75F);

		rightTrackWheelModels[14].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 66
		rightTrackWheelModels[14].setRotationPoint(10.75F, 2.2F, -20.75F);

		rightTrackWheelModels[15].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rightTrackWheelModels[15].setRotationPoint(23.75F, 2.2F, -20.75F);

		rightTrackWheelModels[16].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 68
		rightTrackWheelModels[16].setRotationPoint(23.75F, 2.2F, -20.75F);

		rightTrackWheelModels[17].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 69
		rightTrackWheelModels[17].setRotationPoint(23.75F, 2.2F, -20.75F);

		rightTrackWheelModels[18].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightTrackWheelModels[18].setRotationPoint(38.75F, 2.2F, -20.75F);

		rightTrackWheelModels[19].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 71
		rightTrackWheelModels[19].setRotationPoint(38.75F, 2.2F, -20.75F);

		rightTrackWheelModels[20].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 72
		rightTrackWheelModels[20].setRotationPoint(38.75F, 2.2F, -20.75F);

		rightTrackWheelModels[21].addShapeBox(-5.75F, 2F, -7F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 73
		rightTrackWheelModels[21].setRotationPoint(48.75F, -7.8F, -20.75F);

		rightTrackWheelModels[22].addBox(-5.75F, -2F, -7F, 12, 4, 8, 0F); // Box 74
		rightTrackWheelModels[22].setRotationPoint(48.75F, -7.8F, -20.75F);

		rightTrackWheelModels[23].addShapeBox(-5.75F, -6F, -7F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		rightTrackWheelModels[23].setRotationPoint(48.75F, -7.8F, -20.75F);

		rightTrackWheelModels[24].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 112
		rightTrackWheelModels[24].setRotationPoint(30F, -10F, -21F);

		rightTrackWheelModels[25].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 113
		rightTrackWheelModels[25].setRotationPoint(30F, -10F, -21F);

		rightTrackWheelModels[26].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 114
		rightTrackWheelModels[26].setRotationPoint(30F, -10F, -21F);

		rightTrackWheelModels[27].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 115
		rightTrackWheelModels[27].setRotationPoint(3.5F, -10F, -21F);

		rightTrackWheelModels[28].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 116
		rightTrackWheelModels[28].setRotationPoint(3.5F, -10F, -21F);

		rightTrackWheelModels[29].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 117
		rightTrackWheelModels[29].setRotationPoint(3.5F, -10F, -21F);

		rightTrackWheelModels[30].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 118
		rightTrackWheelModels[30].setRotationPoint(-23.5F, -10F, -21F);

		rightTrackWheelModels[31].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 119
		rightTrackWheelModels[31].setRotationPoint(-23.5F, -10F, -21F);

		rightTrackWheelModels[32].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 120
		rightTrackWheelModels[32].setRotationPoint(-23.5F, -10F, -21F);

		rightTrackWheelModels[33].addShapeBox(-3F, -1.7F, -5F, 6, 3, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 151
		rightTrackWheelModels[33].setRotationPoint(-39F, 1.25F, -21F);

		rightTrackWheelModels[34].addShapeBox(-3F, -3.7F, -5F, 6, 3, 5, 0F,-2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 152
		rightTrackWheelModels[34].setRotationPoint(-39F, 1.25F, -21F);

		rightTrackWheelModels[35].addShapeBox(-3F, 0.3F, -5F, 6, 3, 5, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F); // Box 153
		rightTrackWheelModels[35].setRotationPoint(-39F, 1.25F, -21F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 795
		leftTrackModel[1] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Box 170
		leftTrackModel[2] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 171
		leftTrackModel[3] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 172
		leftTrackModel[4] = new ModelRendererTurbo(this, 697, 137, textureX, textureY); // Box 173
		leftTrackModel[5] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 174
		leftTrackModel[6] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 175
		leftTrackModel[7] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 176
		leftTrackModel[8] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 177
		leftTrackModel[9] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 178
		leftTrackModel[10] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 179
		leftTrackModel[11] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 180

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 71, 1, 12, 0F,0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F); // Box 795
		leftTrackModel[0].setRotationPoint(-29.5F, 8.6F, 20F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 63, 1, 12, 0F,0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F); // Box 170
		leftTrackModel[1].setRotationPoint(-31.5F, -14.5F, 20F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0.35F, -0.2F, 0F, 1.35F, -0.2F, 0F, 1.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.2F, 0F, 0.35F, -0.2F); // Box 171
		leftTrackModel[2].setRotationPoint(31.5F, -14.5F, 20F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, -0.45F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, -0.45F, -0.2F, 0F, 1.25F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 1.25F, -0.2F); // Box 172
		leftTrackModel[3].setRotationPoint(-50.5F, -14.5F, 20F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 22, 1, 12, 0F,-1F, 9.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, -1F, 9.25F, -0.2F, -1F, -8.45F, -0.2F, 0F, 0.45F, -0.2F, 0F, 0.45F, -0.2F, -1F, -8.45F, -0.2F); // Box 173
		leftTrackModel[4].setRotationPoint(-51.5F, 8.5F, 20F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0.3F, -0.2F, -1.5F, 14.5F, -0.2F, -1.5F, 14.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.45F, -0.2F, -0.5F, -14.45F, -0.2F, -0.5F, -14.45F, -0.2F, 0F, 0.45F, -0.2F); // Box 174
		leftTrackModel[5].setRotationPoint(41.5F, 8.5F, 20F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 1.35F, -0.2F, 0.2F, 0.8F, -0.2F, 0.2F, 0.8F, -0.2F, 0F, 1.35F, -0.2F, 0F, -0.55F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.55F, -0.2F); // Box 175
		leftTrackModel[6].setRotationPoint(47.5F, -14.5F, 20F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.55F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0F, -0.2F, -0.35F, 0.55F, -0.2F, -0.35F, 0.55F, -0.2F, 0.55F, 0F, -0.2F); // Box 176
		leftTrackModel[7].setRotationPoint(55.35F, -9.5F, 20F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,4F, -0.45F, -0.2F, -4.65F, 1.25F, -0.2F, -4.65F, 1.25F, -0.2F, 4F, -0.45F, -0.2F, 0.55F, 0.3F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0.55F, 0.3F, -0.2F); // Box 177
		leftTrackModel[8].setRotationPoint(55.35F, -14F, 20F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Box 178
		leftTrackModel[9].setRotationPoint(-55.5F, -8.4F, 20F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,-5F, -0.35F, -0.2F, 4F, -2.15F, -0.2F, 4F, -2.15F, -0.2F, -5F, -0.35F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Box 179
		leftTrackModel[10].setRotationPoint(-55.5F, -14.4F, 20F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, -5F, -0.55F, -0.2F, 4F, -2.3F, -0.2F, 4F, -2.3F, -0.2F, -5F, -0.55F, -0.2F); // Box 180
		leftTrackModel[11].setRotationPoint(-55.5F, -4.4F, 20F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 187
		rightTrackModel[1] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 188
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 189
		rightTrackModel[3] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 190
		rightTrackModel[4] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 191
		rightTrackModel[5] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 192
		rightTrackModel[6] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 193
		rightTrackModel[7] = new ModelRendererTurbo(this, 841, 145, textureX, textureY); // Box 194
		rightTrackModel[8] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 195
		rightTrackModel[9] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 196
		rightTrackModel[10] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Box 197
		rightTrackModel[11] = new ModelRendererTurbo(this, 969, 153, textureX, textureY); // Box 198

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 71, 1, 12, 0F,0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F); // Box 187
		rightTrackModel[0].setRotationPoint(-29.5F, 8.6F, -30F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 22, 1, 12, 0F,-1F, 9.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, -1F, 9.25F, -0.2F, -1F, -8.45F, -0.2F, 0F, 0.45F, -0.2F, 0F, 0.45F, -0.2F, -1F, -8.45F, -0.2F); // Box 188
		rightTrackModel[1].setRotationPoint(-51.5F, 8.5F, -30F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, -5F, -0.55F, -0.2F, 4F, -2.3F, -0.2F, 4F, -2.3F, -0.2F, -5F, -0.55F, -0.2F); // Box 189
		rightTrackModel[2].setRotationPoint(-55.5F, -4.4F, -30F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Box 190
		rightTrackModel[3].setRotationPoint(-55.5F, -8.4F, -30F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,-5F, -0.35F, -0.2F, 4F, -2.15F, -0.2F, 4F, -2.15F, -0.2F, -5F, -0.35F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F, 0.35F, 0F, -0.2F); // Box 191
		rightTrackModel[4].setRotationPoint(-55.5F, -14.4F, -30F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, -0.45F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, -0.45F, -0.2F, 0F, 1.25F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 1.25F, -0.2F); // Box 192
		rightTrackModel[5].setRotationPoint(-50.5F, -14.5F, -30F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 63, 1, 12, 0F,0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F); // Box 193
		rightTrackModel[6].setRotationPoint(-31.5F, -14.5F, -30F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0.35F, -0.2F, 0F, 1.35F, -0.2F, 0F, 1.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, -0.55F, -0.2F, 0F, -0.55F, -0.2F, 0F, 0.35F, -0.2F); // Box 194
		rightTrackModel[7].setRotationPoint(31.5F, -14.5F, -30F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 1.35F, -0.2F, 0.2F, 0.8F, -0.2F, 0.2F, 0.8F, -0.2F, 0F, 1.35F, -0.2F, 0F, -0.55F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.55F, -0.2F); // Box 195
		rightTrackModel[8].setRotationPoint(47.5F, -14.5F, -30F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,4F, -0.45F, -0.2F, -4.65F, 1.25F, -0.2F, -4.65F, 1.25F, -0.2F, 4F, -0.45F, -0.2F, 0.55F, 0.3F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0.55F, 0.3F, -0.2F); // Box 196
		rightTrackModel[9].setRotationPoint(55.35F, -14F, -30F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.55F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0F, 0.25F, -0.2F, 0.55F, 0.2F, -0.2F, 0.55F, 0F, -0.2F, -0.35F, 0.55F, -0.2F, -0.35F, 0.55F, -0.2F, 0.55F, 0F, -0.2F); // Box 197
		rightTrackModel[10].setRotationPoint(55.35F, -9.5F, -30F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 15, 1, 12, 0F,0F, 0.3F, -0.2F, -1.5F, 14.5F, -0.2F, -1.5F, 14.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.45F, -0.2F, -0.5F, -14.45F, -0.2F, -0.5F, -14.45F, -0.2F, 0F, 0.45F, -0.2F); // Box 198
		rightTrackModel[11].setRotationPoint(41.5F, 8.5F, -30F);
	}

	
}