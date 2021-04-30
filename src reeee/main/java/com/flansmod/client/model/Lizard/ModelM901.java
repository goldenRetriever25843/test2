//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.10.2016 - 12:09:13
// Last changed on: 05.10.2016 - 12:09:13

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM901 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelM901() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[149];
		bodyDoorCloseModel = new ModelRendererTurbo[19];
		turretModel = new ModelRendererTurbo[52];
		barrelModel = new ModelRendererTurbo[48];
		leftTrackWheelModels = new ModelRendererTurbo[6];
		rightTrackWheelModels = new ModelRendererTurbo[267];
		leftTrackModel = new ModelRendererTurbo[13];
		rightTrackModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		initbodyDoorCloseModel_1();
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Body
		bodyModel[13] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Body
		bodyModel[14] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Body
		bodyModel[15] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Body
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Body
		bodyModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Body
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Body
		bodyModel[19] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 34
		bodyModel[20] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 35
		bodyModel[21] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 44
		bodyModel[23] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 99
		bodyModel[24] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 102
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Body
		bodyModel[26] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Body
		bodyModel[27] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 109
		bodyModel[28] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 110
		bodyModel[29] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 117
		bodyModel[30] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 118
		bodyModel[31] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 119
		bodyModel[32] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 120
		bodyModel[33] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 125
		bodyModel[34] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 126
		bodyModel[35] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 127
		bodyModel[36] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 128
		bodyModel[37] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 131
		bodyModel[40] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 132
		bodyModel[41] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 133
		bodyModel[42] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 134
		bodyModel[43] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 135
		bodyModel[44] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 136
		bodyModel[45] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 138
		bodyModel[46] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 139
		bodyModel[47] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 159
		bodyModel[48] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 160
		bodyModel[49] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 161
		bodyModel[50] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 162
		bodyModel[51] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 163
		bodyModel[52] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 164
		bodyModel[53] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 165
		bodyModel[54] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 166
		bodyModel[55] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 172
		bodyModel[56] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 173
		bodyModel[57] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 174
		bodyModel[58] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 175
		bodyModel[59] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 176
		bodyModel[60] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 204
		bodyModel[61] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 205
		bodyModel[62] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 206
		bodyModel[63] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 207
		bodyModel[64] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 208
		bodyModel[65] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 209
		bodyModel[66] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 300
		bodyModel[67] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 301
		bodyModel[68] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 302
		bodyModel[69] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 290
		bodyModel[70] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 297
		bodyModel[71] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 298
		bodyModel[72] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 273
		bodyModel[73] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 353
		bodyModel[74] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 354
		bodyModel[75] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 355
		bodyModel[76] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 356
		bodyModel[77] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 357
		bodyModel[78] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 361
		bodyModel[79] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 362
		bodyModel[80] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 363
		bodyModel[81] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 364
		bodyModel[82] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 365
		bodyModel[83] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 366
		bodyModel[84] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 367
		bodyModel[85] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 368
		bodyModel[86] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 369
		bodyModel[87] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 370
		bodyModel[88] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 371
		bodyModel[89] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 372
		bodyModel[90] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 373
		bodyModel[91] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 374
		bodyModel[92] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 375
		bodyModel[93] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 376
		bodyModel[94] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 377
		bodyModel[95] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 378
		bodyModel[96] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 379
		bodyModel[97] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 380
		bodyModel[98] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 381
		bodyModel[99] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 382
		bodyModel[100] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 409
		bodyModel[101] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 410
		bodyModel[102] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 411
		bodyModel[103] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 412
		bodyModel[104] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 697
		bodyModel[105] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 698
		bodyModel[106] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 699
		bodyModel[107] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 621
		bodyModel[108] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 44
		bodyModel[109] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 99
		bodyModel[110] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 100
		bodyModel[111] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 101
		bodyModel[112] = new ModelRendererTurbo(this, 537, 129, textureX, textureY); // Box 697
		bodyModel[113] = new ModelRendererTurbo(this, 537, 129, textureX, textureY); // Box 17
		bodyModel[114] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 88
		bodyModel[115] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 89
		bodyModel[116] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 90
		bodyModel[117] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 554
		bodyModel[118] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Box 555
		bodyModel[119] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 556
		bodyModel[120] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 557
		bodyModel[121] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 558
		bodyModel[122] = new ModelRendererTurbo(this, 553, 129, textureX, textureY); // Box 559
		bodyModel[123] = new ModelRendererTurbo(this, 825, 153, textureX, textureY); // Box 560
		bodyModel[124] = new ModelRendererTurbo(this, 841, 153, textureX, textureY); // Box 561
		bodyModel[125] = new ModelRendererTurbo(this, 857, 153, textureX, textureY); // Box 562
		bodyModel[126] = new ModelRendererTurbo(this, 873, 153, textureX, textureY); // Box 563
		bodyModel[127] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 564
		bodyModel[128] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 565
		bodyModel[129] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 566
		bodyModel[130] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 567
		bodyModel[131] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 568
		bodyModel[132] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 569
		bodyModel[133] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 580
		bodyModel[134] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 581
		bodyModel[135] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 582
		bodyModel[136] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 583
		bodyModel[137] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 584
		bodyModel[138] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 585
		bodyModel[139] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 586
		bodyModel[140] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 587
		bodyModel[141] = new ModelRendererTurbo(this, 641, 137, textureX, textureY); // Box 588
		bodyModel[142] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 589
		bodyModel[143] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Box 700
		bodyModel[144] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 701
		bodyModel[145] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 702
		bodyModel[146] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 703
		bodyModel[147] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 704
		bodyModel[148] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 705

		bodyModel[0].addShapeBox(0F, 0F, 0F, 83, 7, 33, 0F,0.7F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-38.9F, -6.5F, -16.7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 4, 33, 0F,-4F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, -0.2F, 0F, -2F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 3
		bodyModel[1].setRotationPoint(38.6F, -10.1F, -16.7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 17, 49, 0F,12F, -0.2F, -0.5F, -17.5F, -0.2F, -0.5F, -17.5F, -0.2F, 0F, 12F, -0.2F, 0F, -4F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, -0.2F, 0F); // Box 4
		bodyModel[2].setRotationPoint(38.6F, -26.7F, -24.7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 64, 17, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-38.4F, -26.7F, -24.7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 49, 2, 46, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.3F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-41.9F, -26.7F, -23.2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 81, 7, 1, 0F,2.05F, -0.2F, -0.5F, -1.8F, -0.2F, -0.5F, -1.8F, -0.2F, 0F, 2.05F, -0.2F, 0F, 0.6F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-37.9F, -13.1F, -16.7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-37.85F, -13.15F, -23.2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 81, 7, 1, 0F,2.1F, -0.2F, -0.5F, -1.8F, -0.2F, -0.5F, -1.8F, -0.2F, 0F, 2.1F, -0.2F, 0F, 0.6F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-37.9F, -13.1F, 15.3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-37.85F, -13.15F, 15.8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -15F, 0.5F, -0.5F, 16F, 0F, -0.5F, 16F, 0F, 0F, -15F, 0.5F, 0F); // Box 15
		bodyModel[9].setRotationPoint(26.6F, -26.6F, 1.3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 21
		bodyModel[10].setRotationPoint(12.1F, -27.5F, -10.2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 14, 2, 12, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 22
		bodyModel[11].setRotationPoint(15.1F, -27.5F, -23.6F);

		bodyModel[12].addBox(0F, 0F, 0F, 12, 3, 4, 0F); // Body
		bodyModel[12].setRotationPoint(13.5F, -27.5F, 11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Body
		bodyModel[13].setRotationPoint(13.5F, -27.5F, 15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[14].setRotationPoint(13.5F, -27.5F, 7F);

		bodyModel[15].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[15].setRotationPoint(27F, -27.8F, 11F);

		bodyModel[16].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[16].setRotationPoint(26F, -27.8F, 16F);
		bodyModel[16].rotateAngleY = 0.78539816F;

		bodyModel[17].addShapeBox(0F, -0.25F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[17].setRotationPoint(18.5F, -27.8F, 19.5F);

		bodyModel[18].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[18].setRotationPoint(23.5F, -27.8F, 7F);
		bodyModel[18].rotateAngleY = -0.78539816F;

		bodyModel[19].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 34
		bodyModel[19].setRotationPoint(14.5F, -28F, 11.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 35
		bodyModel[20].setRotationPoint(14.5F, -28F, 14.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,-3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[21].setRotationPoint(14.5F, -28F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 13, 32, 0F,8F, -0.2F, -0.5F, -13.5F, -0.2F, -0.5F, -13.5F, -0.2F, 0F, 8F, -0.2F, 0F, -6F, 0.8F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -6F, 0.8F, 0F); // Box 44
		bodyModel[22].setRotationPoint(38.5F, -23.7F, -16.3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 99
		bodyModel[23].setRotationPoint(38F, -19.3F, 8.9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, 1F, 0F, -0.4F, -2F, -0.6F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -2F, -0.6F, -0.4F); // Box 102
		bodyModel[24].setRotationPoint(30F, -26.4F, 11.7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Body
		bodyModel[25].setRotationPoint(-42.4F, -10.5F, -24F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[26].setRotationPoint(-47.4F, -10.5F, -24F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,-1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 109
		bodyModel[27].setRotationPoint(-47.4F, -10.5F, 16F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Box 110
		bodyModel[28].setRotationPoint(-42.4F, -10.5F, 16F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 117
		bodyModel[29].setRotationPoint(-23.1F, -27.7F, -21.3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 118
		bodyModel[30].setRotationPoint(9.7F, -27.7F, -22.3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 119
		bodyModel[31].setRotationPoint(6.7F, -27.7F, 18.7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F); // Box 120
		bodyModel[32].setRotationPoint(-36.1F, -27.7F, -20.3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 125
		bodyModel[33].setRotationPoint(-39.5F, -29.1F, 5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 34, 0F,-0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F); // Box 126
		bodyModel[34].setRotationPoint(-41.9F, -27.9F, -17.2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		bodyModel[35].setRotationPoint(44.6F, -9.9F, -24.2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[36].setRotationPoint(44.6F, -9.9F, 16.3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -3F, 0F, 0F, -2.2F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 48
		bodyModel[37].setRotationPoint(37.5F, -13F, 24.3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, -0.2F, 0F, -1.3F, -3F, 0F, -2.6F, -3F, 0F, 0.5F, -1.7F, 0F, 1F, 7.2F, 0F, -1F, 7.2F, 0F, -2F, 7.2F, 0F, 1F, 7.2F, 0F); // Box 49
		bodyModel[38].setRotationPoint(42.5F, -11.7F, 24.3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, -1.7F, 0F, -2.6F, -3F, 0F, -1.3F, -3F, 0F, 0.5F, -0.2F, 0F, 1F, 7.2F, 0F, -2F, 7.2F, 0F, -1F, 7.2F, 0F, 1F, 7.2F, 0F); // Box 131
		bodyModel[39].setRotationPoint(42.5F, -11.7F, -26.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -2.2F, 0F, -0.5F, -3F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 132
		bodyModel[40].setRotationPoint(37.5F, -13F, -26.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-2.6F, -3F, 0F, 0.5F, -1.7F, 0F, 0.5F, -0.2F, 0F, -1.3F, -3F, 0F, -2F, 7.2F, 0F, 1F, 7.2F, 0F, 1F, 7.2F, 0F, -1F, 7.2F, 0F); // Box 133
		bodyModel[41].setRotationPoint(-45F, -11.7F, -26.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-0.5F, -3F, 0F, 0.5F, -2.2F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1F, 4.5F, 0F, 0.5F, 4.5F, 0F, 0.5F, 4.5F, 0F, -1F, 4.5F, 0F); // Box 134
		bodyModel[42].setRotationPoint(-40F, -13F, -26.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, -2.2F, 0F, -0.5F, -3F, 0F, -1F, 4.5F, 0F, 0.5F, 4.5F, 0F, 0.5F, 4.5F, 0F, -1F, 4.5F, 0F); // Box 135
		bodyModel[43].setRotationPoint(-40F, -13F, 24.3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.3F, -3F, 0F, 0.5F, -0.2F, 0F, 0.5F, -1.7F, 0F, -2.6F, -3F, 0F, -1F, 7.2F, 0F, 1F, 7.2F, 0F, 1F, 7.2F, 0F, -2F, 7.2F, 0F); // Box 136
		bodyModel[44].setRotationPoint(-45F, -11.7F, 24.3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 72, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 138
		bodyModel[45].setRotationPoint(-34.5F, -13F, 24.3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 72, 5, 2, 0F,0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 139
		bodyModel[46].setRotationPoint(-34.5F, -13F, -26.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 159
		bodyModel[47].setRotationPoint(32.4F, -25.5F, -22.05F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 160
		bodyModel[48].setRotationPoint(33.3F, -26F, -22F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 161
		bodyModel[49].setRotationPoint(33.3F, -25F, -22F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 162
		bodyModel[50].setRotationPoint(33.3F, -24F, -22F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 163
		bodyModel[51].setRotationPoint(33.3F, -26F, -19F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 164
		bodyModel[52].setRotationPoint(33.3F, -25F, -19F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 165
		bodyModel[53].setRotationPoint(33.3F, -24F, -19F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 166
		bodyModel[54].setRotationPoint(32.4F, -25.5F, -19.05F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 172
		bodyModel[55].setRotationPoint(33.5F, -26.9F, -23.1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 173
		bodyModel[56].setRotationPoint(33.5F, -26.3F, -23.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 174
		bodyModel[57].setRotationPoint(33.5F, -26.3F, -17.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 175
		bodyModel[58].setRotationPoint(32.5F, -22.3F, -23.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 176
		bodyModel[59].setRotationPoint(32.5F, -22.3F, -17.5F);

		bodyModel[60].addShapeBox(-6F, -4.5F, -7F, 12, 3, 3, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 204
		bodyModel[60].setRotationPoint(39.3F, -3.3F, 19.8F);

		bodyModel[61].addShapeBox(-5F, -1.5F, -7F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[61].setRotationPoint(39.3F, -3.3F, 19.8F);

		bodyModel[62].addShapeBox(-6F, 1.5F, -7F, 12, 3, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 206
		bodyModel[62].setRotationPoint(39.3F, -3.3F, 19.8F);

		bodyModel[63].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 3, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 207
		bodyModel[63].setRotationPoint(39.3F, -3.3F, -9.6F);

		bodyModel[64].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[64].setRotationPoint(39.3F, -3.3F, -9.6F);

		bodyModel[65].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 209
		bodyModel[65].setRotationPoint(39.3F, -3.3F, -9.6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 17, 49, 0F,15F, -0.2F, -0.5F, -17F, -0.2F, -0.5F, -17F, -0.2F, 0F, 15F, -0.2F, 0F, 15F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, 15F, -0.2F, 0F); // Box 300
		bodyModel[66].setRotationPoint(40.6F, -26.7F, -24.7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 17, 2, 0F,15.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 15.5F, -0.2F, 0F, 12.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 12.5F, -0.2F, 0F); // Box 301
		bodyModel[67].setRotationPoint(-27.4F, -26.7F, -24.7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 64, 17, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 302
		bodyModel[68].setRotationPoint(-38.4F, -26.7F, 22.3F);

		bodyModel[69].addShapeBox(50F, 0F, 0F, 18, 2, 46, 0F,0.95F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.95F, -0.2F, 0F, 0.95F, -0.3F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.95F, -0.3F, 0F); // Box 290
		bodyModel[69].setRotationPoint(-41.9F, -26.7F, -23.2F);

		bodyModel[70].addShapeBox(0F, -7.95F, 0F, 1, 21, 8, 0F,0F, -0.02F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.02F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 297
		bodyModel[70].setRotationPoint(-41.5F, -18.7F, -23.2F);
		bodyModel[70].rotateAngleZ = 0.17889625F;

		bodyModel[71].addShapeBox(0F, -7.95F, 0F, 1, 21, 8, 0F,0F, -0.02F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.02F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 298
		bodyModel[71].setRotationPoint(-41.5F, -18.7F, 14.8F);
		bodyModel[71].rotateAngleZ = 0.17889625F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 17, 2, 0F,15.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 15.5F, -0.2F, 0F, 12.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 12.5F, -0.2F, 0F); // Box 273
		bodyModel[72].setRotationPoint(-27.4F, -26.7F, 22.3F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 353
		bodyModel[73].setRotationPoint(12.5F, -27.75F, 9.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 354
		bodyModel[74].setRotationPoint(12F, -28.5F, 10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 355
		bodyModel[75].setRotationPoint(12F, -28.5F, 14.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 356
		bodyModel[76].setRotationPoint(12.5F, -28F, 16.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 357
		bodyModel[77].setRotationPoint(12.5F, -28F, 8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 361
		bodyModel[78].setRotationPoint(-39.5F, -27.1F, 16.7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F); // Box 362
		bodyModel[79].setRotationPoint(-38F, -27.7F, 18.2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 363
		bodyModel[80].setRotationPoint(33.3F, -25F, 21F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 364
		bodyModel[81].setRotationPoint(33.3F, -26F, 21F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 365
		bodyModel[82].setRotationPoint(33.3F, -24F, 21F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 366
		bodyModel[83].setRotationPoint(32.4F, -25.5F, 20.95F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 367
		bodyModel[84].setRotationPoint(32.5F, -22.3F, 22.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 368
		bodyModel[85].setRotationPoint(33.5F, -26.3F, 22.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 369
		bodyModel[86].setRotationPoint(33.5F, -26.9F, 16.9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 370
		bodyModel[87].setRotationPoint(33.5F, -26.3F, 16.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 371
		bodyModel[88].setRotationPoint(32.5F, -22.3F, 16.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 372
		bodyModel[89].setRotationPoint(32.4F, -25.5F, 17.95F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 373
		bodyModel[90].setRotationPoint(33.3F, -25F, 18F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 374
		bodyModel[91].setRotationPoint(33.3F, -26F, 18F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 375
		bodyModel[92].setRotationPoint(33.3F, -24F, 18F);

		bodyModel[93].addShapeBox(-5F, -1.5F, -6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[93].setRotationPoint(47.5F, -6.3F, -4.6F);

		bodyModel[94].addShapeBox(-5F, -1.5F, -6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[94].setRotationPoint(47.5F, -6.3F, 16.4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 378
		bodyModel[95].setRotationPoint(-24.5F, -0.5F, -17.2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 379
		bodyModel[96].setRotationPoint(-12F, -0.5F, -17.2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 380
		bodyModel[97].setRotationPoint(0.5F, -0.5F, -17.2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 381
		bodyModel[98].setRotationPoint(13.5F, -0.5F, -17.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 382
		bodyModel[99].setRotationPoint(26F, -0.5F, -17.2F);

		bodyModel[100].addShapeBox(-1F, -5.95F, 5.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[100].setRotationPoint(-41.5F, -18.7F, 14.8F);
		bodyModel[100].rotateAngleZ = 0.17889625F;

		bodyModel[101].addShapeBox(-1F, -5.95F, 1.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[101].setRotationPoint(-41.5F, -18.7F, 14.8F);
		bodyModel[101].rotateAngleZ = 0.17889625F;

		bodyModel[102].addShapeBox(-1F, -5.95F, -33F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[102].setRotationPoint(-41.5F, -18.7F, 14.8F);
		bodyModel[102].rotateAngleZ = 0.17889625F;

		bodyModel[103].addShapeBox(-1F, -5.95F, -37F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[103].setRotationPoint(-41.5F, -18.7F, 14.8F);
		bodyModel[103].rotateAngleZ = 0.17889625F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 697
		bodyModel[104].setRotationPoint(38F, -19.3F, -11.1F);

		bodyModel[105].addShapeBox(1F, -0.25F, 1F, 15, 2, 13, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 698
		bodyModel[105].setRotationPoint(12.1F, -27.5F, -10.2F);

		bodyModel[106].addShapeBox(3.5F, -0.25F, -13F, 13, 2, 11, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 699
		bodyModel[106].setRotationPoint(12.1F, -27.5F, -10.2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 64, 16, 47, 0F,3F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 3F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 621
		bodyModel[107].setRotationPoint(-38.4F, -25.7F, -23.7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 13, 32, 0F,8F, -0.2F, -0.5F, -13.5F, -0.2F, -0.5F, -13.5F, -0.2F, 0F, 8F, -0.2F, 0F, -6F, 0.8F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -6F, 0.8F, 0F); // Box 44
		bodyModel[108].setRotationPoint(38.5F, -23.7F, -16.3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 99
		bodyModel[109].setRotationPoint(38F, -19.3F, 8.9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2F, 0F, -0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, 2F, 0F, -0.1F, -2F, 1F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -2F, 1F, -0.1F); // Box 100
		bodyModel[110].setRotationPoint(41.8F, -16.1F, -7.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2F, 0F, -0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, 2F, 0F, -0.1F, -2F, 1F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -2F, 1F, -0.1F); // Box 101
		bodyModel[111].setRotationPoint(29.9F, -27.2F, -5.8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 697
		bodyModel[112].setRotationPoint(38F, -19.3F, -11.1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 16, 3, 24, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 17
		bodyModel[113].setRotationPoint(-30.4F, -28.1F, -12.2F);

		bodyModel[114].addShapeBox(0F, 0F, -1F, 1, 2, 16, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 88
		bodyModel[114].setRotationPoint(-32F, -28.2F, -7.2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 89
		bodyModel[115].setRotationPoint(-33.5F, -29F, -7.2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 90
		bodyModel[116].setRotationPoint(-33.5F, -29F, 4.8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 554
		bodyModel[117].setRotationPoint(-26.4F, -30.1F, -16.2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 555
		bodyModel[118].setRotationPoint(-26.4F, -30.1F, 13.8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 556
		bodyModel[119].setRotationPoint(-38.4F, -34.1F, -15.2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F); // Box 557
		bodyModel[120].setRotationPoint(-38.4F, -34.25F, -15.2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F); // Box 558
		bodyModel[121].setRotationPoint(-38.4F, -34.25F, 14.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 559
		bodyModel[122].setRotationPoint(-38.4F, -34.1F, 14.5F);

		bodyModel[123].addShapeBox(2.4F, 0.5F, -0.25F, 2, 3, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 560
		bodyModel[123].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[123].rotateAngleY = -0.43633231F;
		bodyModel[123].rotateAngleZ = -0.75049158F;

		bodyModel[124].addShapeBox(4.5F, 0.5F, -1F, 2, 3, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 561
		bodyModel[124].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[124].rotateAngleY = -0.43633231F;
		bodyModel[124].rotateAngleZ = -0.75049158F;

		bodyModel[125].addShapeBox(5F, 0.5F, -3.25F, 2, 3, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 562
		bodyModel[125].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[125].rotateAngleY = -0.43633231F;
		bodyModel[125].rotateAngleZ = -0.75049158F;

		bodyModel[126].addShapeBox(2.8F, 0.5F, -4.5F, 2, 3, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 563
		bodyModel[126].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[126].rotateAngleY = -0.43633231F;
		bodyModel[126].rotateAngleZ = -0.75049158F;

		bodyModel[127].addShapeBox(6.4F, 1.5F, -3.75F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F); // Box 564
		bodyModel[127].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[127].rotateAngleY = -0.43633231F;
		bodyModel[127].rotateAngleZ = -0.75049158F;

		bodyModel[128].addShapeBox(2.9F, 1.5F, -5.2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[128].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[128].rotateAngleY = -0.43633231F;
		bodyModel[128].rotateAngleZ = -0.75049158F;

		bodyModel[129].addShapeBox(4.9F, 1.5F, -5.2F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0F); // Box 566
		bodyModel[129].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[129].rotateAngleY = -0.43633231F;
		bodyModel[129].rotateAngleZ = -0.75049158F;

		bodyModel[130].addShapeBox(4.9F, 1.5F, 1.05F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 567
		bodyModel[130].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[130].rotateAngleY = -0.43633231F;
		bodyModel[130].rotateAngleZ = -0.75049158F;

		bodyModel[131].addShapeBox(2.9F, 1.5F, 1.05F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[131].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[131].rotateAngleY = -0.43633231F;
		bodyModel[131].rotateAngleZ = -0.75049158F;

		bodyModel[132].addShapeBox(3.5F, 2.5F, -3F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[132].setRotationPoint(37.3F, -25F, -19F);
		bodyModel[132].rotateAngleY = -0.43633231F;
		bodyModel[132].rotateAngleZ = -0.75049158F;

		bodyModel[133].addShapeBox(4F, 1.5F, -3.25F, 2, 3, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 580
		bodyModel[133].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[133].rotateAngleY = 0.43633231F;
		bodyModel[133].rotateAngleZ = -0.75049158F;

		bodyModel[134].addShapeBox(1.8F, 1.5F, -4.5F, 2, 3, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 581
		bodyModel[134].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[134].rotateAngleY = 0.43633231F;
		bodyModel[134].rotateAngleZ = -0.75049158F;

		bodyModel[135].addShapeBox(3.5F, 1.5F, -1F, 2, 3, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 582
		bodyModel[135].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[135].rotateAngleY = 0.43633231F;
		bodyModel[135].rotateAngleZ = -0.75049158F;

		bodyModel[136].addShapeBox(1.4F, 1.5F, -0.25F, 2, 3, 2, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 583
		bodyModel[136].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[136].rotateAngleY = 0.43633231F;
		bodyModel[136].rotateAngleZ = -0.75049158F;

		bodyModel[137].addShapeBox(1.9F, 2.5F, -5.2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[137].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[137].rotateAngleY = 0.43633231F;
		bodyModel[137].rotateAngleZ = -0.75049158F;

		bodyModel[138].addShapeBox(3.9F, 2.5F, -5.2F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0F); // Box 585
		bodyModel[138].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[138].rotateAngleY = 0.43633231F;
		bodyModel[138].rotateAngleZ = -0.75049158F;

		bodyModel[139].addShapeBox(5.4F, 2.5F, -3.75F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F); // Box 586
		bodyModel[139].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[139].rotateAngleY = 0.43633231F;
		bodyModel[139].rotateAngleZ = -0.75049158F;

		bodyModel[140].addShapeBox(3.9F, 2.5F, 1.05F, 2, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 587
		bodyModel[140].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[140].rotateAngleY = 0.43633231F;
		bodyModel[140].rotateAngleZ = -0.75049158F;

		bodyModel[141].addShapeBox(1.9F, 2.5F, 1.05F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		bodyModel[141].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[141].rotateAngleY = 0.43633231F;
		bodyModel[141].rotateAngleZ = -0.75049158F;

		bodyModel[142].addShapeBox(2.5F, 3.5F, -3F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[142].setRotationPoint(37.3F, -25F, 23F);
		bodyModel[142].rotateAngleY = 0.43633231F;
		bodyModel[142].rotateAngleZ = -0.75049158F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 700
		bodyModel[143].setRotationPoint(15.1F, -26.2F, -25F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 701
		bodyModel[144].setRotationPoint(-3.9F, -26.2F, -25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 702
		bodyModel[145].setRotationPoint(-22.9F, -26.2F, -25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 703
		bodyModel[146].setRotationPoint(-22.9F, -26.2F, 22.6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 704
		bodyModel[147].setRotationPoint(-3.9F, -26.2F, 22.6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 705
		bodyModel[148].setRotationPoint(15.1F, -26.2F, 22.6F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 181
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 391
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 392
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 393
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 394
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 395
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 396
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 397
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 398
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Box 399
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 400
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 401
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 402
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 403
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 404
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 405
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 406
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 407
		bodyDoorCloseModel[18] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 408

		bodyDoorCloseModel[0].addShapeBox(-1.5F, -28.5F, 0.5F, 3, 24, 31, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 181
		bodyDoorCloseModel[0].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[1].addShapeBox(-2.25F, -29.5F, 1F, 3, 5, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 391
		bodyDoorCloseModel[1].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[2].addShapeBox(-2.25F, -29.5F, 29F, 3, 5, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 392
		bodyDoorCloseModel[2].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[3].addShapeBox(-2.25F, -28.5F, 16F, 3, 2, 13, 0F,-0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 393
		bodyDoorCloseModel[3].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[4].addShapeBox(-2.25F, -26.5F, 16F, 3, 14, 13, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 394
		bodyDoorCloseModel[4].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[5].addShapeBox(-2.25F, -12.5F, 16F, 3, 4, 13, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -3.25F, -0.25F, 0.5F, -3.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 395
		bodyDoorCloseModel[5].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[5].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[6].addShapeBox(-2.25F, -8.5F, 19F, 3, 1, 10, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0F, -1.25F); // Box 396
		bodyDoorCloseModel[6].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[6].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[7].addShapeBox(-2.75F, -24.5F, 15F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 397
		bodyDoorCloseModel[7].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[7].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[8].addShapeBox(-2.75F, -14.5F, 15F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 398
		bodyDoorCloseModel[8].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[8].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[9].addShapeBox(-2.65F, -25.5F, 15.4F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F); // Box 399
		bodyDoorCloseModel[9].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[9].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[10].addShapeBox(-2.65F, -15.5F, 15.4F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F); // Box 400
		bodyDoorCloseModel[10].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[10].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[11].addShapeBox(-1.75F, -20.5F, 4F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyDoorCloseModel[11].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[11].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[12].addShapeBox(-3.25F, -11.5F, 2F, 3, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyDoorCloseModel[12].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[12].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[13].addShapeBox(-3.25F, -11.5F, 11F, 3, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 403
		bodyDoorCloseModel[13].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[13].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[14].addShapeBox(-3.25F, -14.5F, 2F, 3, 3, 2, 0F,-0.25F, 0F, -2.25F, -0.25F, -0.2F, -2.25F, -0.25F, -0.2F, 1.75F, -0.25F, 0F, 1.75F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 404
		bodyDoorCloseModel[14].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[14].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[15].addShapeBox(-3.25F, -14.5F, 11F, 3, 3, 2, 0F,-0.25F, 0F, 1.75F, -0.25F, -0.2F, 1.75F, -0.25F, -0.2F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 405
		bodyDoorCloseModel[15].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[15].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[16].addShapeBox(-3.25F, -9.5F, 11F, 3, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -0.25F, -0.2F, 1.75F, -0.25F, -0.2F, -2.25F, -0.25F, 0F, -2.25F); // Box 406
		bodyDoorCloseModel[16].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[16].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[17].addShapeBox(-3.25F, -9.5F, 2F, 3, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.25F, -0.25F, -0.2F, -2.25F, -0.25F, -0.2F, 1.75F, -0.25F, 0F, 1.75F); // Box 407
		bodyDoorCloseModel[17].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[17].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[18].addShapeBox(-2.75F, -26.5F, 24F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyDoorCloseModel[18].setRotationPoint(-37F, 2.7F, -16F);
		bodyDoorCloseModel[18].rotateAngleZ = 0.18325957F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 445
		turretModel[1] = new ModelRendererTurbo(this, 665, 129, textureX, textureY); // Box 446
		turretModel[2] = new ModelRendererTurbo(this, 721, 129, textureX, textureY); // Box 447
		turretModel[3] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 449
		turretModel[4] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 450
		turretModel[5] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 451
		turretModel[6] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 452
		turretModel[7] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 453
		turretModel[8] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Box 454
		turretModel[9] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 455
		turretModel[10] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 456
		turretModel[11] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 457
		turretModel[12] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 458
		turretModel[13] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Box 459
		turretModel[14] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 460
		turretModel[15] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Box 461
		turretModel[16] = new ModelRendererTurbo(this, 785, 129, textureX, textureY); // Box 462
		turretModel[17] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 465
		turretModel[18] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Box 466
		turretModel[19] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 467
		turretModel[20] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 468
		turretModel[21] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 469
		turretModel[22] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 470
		turretModel[23] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 471
		turretModel[24] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 472
		turretModel[25] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Box 473
		turretModel[26] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 474
		turretModel[27] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 475
		turretModel[28] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 476
		turretModel[29] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 477
		turretModel[30] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 478
		turretModel[31] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 480
		turretModel[32] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 481
		turretModel[33] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 482
		turretModel[34] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 483
		turretModel[35] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 484
		turretModel[36] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 485
		turretModel[37] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 489
		turretModel[38] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 490
		turretModel[39] = new ModelRendererTurbo(this, 537, 137, textureX, textureY); // Box 491
		turretModel[40] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 492
		turretModel[41] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 493
		turretModel[42] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Box 494
		turretModel[43] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 495
		turretModel[44] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 496
		turretModel[45] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 497
		turretModel[46] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 498
		turretModel[47] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 499
		turretModel[48] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 500
		turretModel[49] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 501
		turretModel[50] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 502
		turretModel[51] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 503

		turretModel[0].addShapeBox(-3F, 0F, -7.5F, 6, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 2F, 1F, -0.25F, 2F, 1F, -0.25F, 2F, 1F, -0.25F, 2F); // Box 445
		turretModel[0].setRotationPoint(0F, -29F, 0F);

		turretModel[1].addShapeBox(-4F, 1.75F, -9.5F, 8, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 446
		turretModel[1].setRotationPoint(0F, -29F, 0F);

		turretModel[2].addShapeBox(3.5F, 1.75F, -9.5F, 6, 2, 19, 0F,-0.5F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -6F, 0F, -0.25F, -6F, -0.5F, -0.25F, 0F); // Box 447
		turretModel[2].setRotationPoint(0F, -29F, 0F);

		turretModel[3].addShapeBox(3F, 0F, -7.5F, 6, 2, 15, 0F,0F, 0F, 0F, -1.5F, 0F, -5F, -1.5F, 0F, -5F, 0F, 0F, 0F, -1F, -0.25F, 2F, 0.5F, -0.25F, -4F, 0.5F, -0.25F, -4F, -1F, -0.25F, 2F); // Box 449
		turretModel[3].setRotationPoint(0F, -29F, 0F);

		turretModel[4].addShapeBox(-9F, 0F, -7.5F, 6, 2, 15, 0F,-1.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -5F, 0.5F, -0.25F, -4F, -1F, -0.25F, 2F, -1F, -0.25F, 2F, 0.5F, -0.25F, -4F); // Box 450
		turretModel[4].setRotationPoint(0F, -29F, 0F);

		turretModel[5].addShapeBox(-9.5F, 1.75F, -9.5F, 6, 2, 19, 0F,0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, -0.25F, -2F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -2F); // Box 451
		turretModel[5].setRotationPoint(0F, -29F, 0F);

		turretModel[6].addShapeBox(-2.5F, -1.5F, -6.5F, 6, 2, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 452
		turretModel[6].setRotationPoint(0F, -29F, 0F);

		turretModel[7].addShapeBox(3.5F, -1.5F, -6.5F, 3, 2, 13, 0F,0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0.5F, -0.25F, 0F); // Box 453
		turretModel[7].setRotationPoint(0F, -29F, 0F);

		turretModel[8].addShapeBox(-6.5F, -1.5F, -6.5F, 4, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F); // Box 454
		turretModel[8].setRotationPoint(0F, -29F, 0F);

		turretModel[9].addShapeBox(6.5F, -1F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		turretModel[9].setRotationPoint(0F, -29F, 0F);

		turretModel[10].addShapeBox(6.5F, -1F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		turretModel[10].setRotationPoint(0F, -29F, 0F);

		turretModel[11].addShapeBox(2F, -1F, -7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		turretModel[11].setRotationPoint(0F, -29F, 0F);

		turretModel[12].addShapeBox(2F, -1F, 6.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		turretModel[12].setRotationPoint(0F, -29F, 0F);

		turretModel[13].addShapeBox(-3F, -1F, 6.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		turretModel[13].setRotationPoint(0F, -29F, 0F);

		turretModel[14].addShapeBox(-3F, -1F, -7.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		turretModel[14].setRotationPoint(0F, -29F, 0F);

		turretModel[15].addShapeBox(6.5F, -2F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F); // Box 461
		turretModel[15].setRotationPoint(0F, -29F, 0F);

		turretModel[16].addShapeBox(-4F, -2F, -7.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		turretModel[16].setRotationPoint(0F, -29F, 0F);

		turretModel[17].addShapeBox(3.5F, -2F, -7.5F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0.5F, 0F, 0F); // Box 465
		turretModel[17].setRotationPoint(0F, -29F, 0F);

		turretModel[18].addShapeBox(3.5F, -2F, 6.5F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0.5F, 0F, 0F); // Box 466
		turretModel[18].setRotationPoint(0F, -29F, 0F);

		turretModel[19].addShapeBox(-4F, -2F, 6.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		turretModel[19].setRotationPoint(0F, -29F, 0F);

		turretModel[20].addShapeBox(-7F, -2.5F, -3.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		turretModel[20].setRotationPoint(0F, -29F, 0F);

		turretModel[21].addShapeBox(-7F, -3F, -4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 469
		turretModel[21].setRotationPoint(0F, -29F, 0F);

		turretModel[22].addShapeBox(-7F, -3F, 3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 470
		turretModel[22].setRotationPoint(0F, -29F, 0F);

		turretModel[23].addShapeBox(-13F, -4.75F, -7.65F, 4, 6, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 471
		turretModel[23].setRotationPoint(0F, -28F, 0F);

		turretModel[24].addShapeBox(-9F, -3.75F, -7.65F, 4, 3, 3, 0F,0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 472
		turretModel[24].setRotationPoint(0F, -28F, 0F);

		turretModel[25].addShapeBox(-9F, -3.75F, 4.75F, 4, 3, 3, 0F,0F, 0.5F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F); // Box 473
		turretModel[25].setRotationPoint(0F, -28F, 0F);

		turretModel[26].addShapeBox(-13F, -4.75F, 4.75F, 4, 6, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 474
		turretModel[26].setRotationPoint(0F, -28F, 0F);

		turretModel[27].addShapeBox(-13F, -12.5F, -9F, 4, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		turretModel[27].setRotationPoint(0F, -28F, 0F);
		turretModel[27].rotateAngleZ = -0.10471976F;

		turretModel[28].addShapeBox(-13F, -5.5F, -4F, 4, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		turretModel[28].setRotationPoint(0F, -28F, 0F);
		turretModel[28].rotateAngleZ = -0.10471976F;

		turretModel[29].addShapeBox(-14F, -15.5F, -11F, 6, 12, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Box 477
		turretModel[29].setRotationPoint(0F, -28F, 0F);
		turretModel[29].rotateAngleZ = -0.10471976F;

		turretModel[30].addShapeBox(-14F, -2.5F, -11F, 6, 3, 2, 0F,0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.2F, 0.5F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 478
		turretModel[30].setRotationPoint(0F, -28F, 0F);
		turretModel[30].rotateAngleZ = -0.10471976F;

		turretModel[31].addShapeBox(-14F, -18F, -11F, 6, 2, 2, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 480
		turretModel[31].setRotationPoint(0F, -28F, 0F);
		turretModel[31].rotateAngleZ = -0.10471976F;

		turretModel[32].addShapeBox(-14F, -12.25F, -12.25F, 6, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 481
		turretModel[32].setRotationPoint(0F, -28F, 0F);
		turretModel[32].rotateAngleZ = -0.10471976F;

		turretModel[33].addShapeBox(-14F, -15.5F, 9F, 6, 12, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F); // Box 482
		turretModel[33].setRotationPoint(0F, -28F, 0F);
		turretModel[33].rotateAngleZ = -0.10471976F;

		turretModel[34].addShapeBox(-14F, -2.5F, 9F, 6, 3, 2, 0F,0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.2F, 0.5F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 483
		turretModel[34].setRotationPoint(0F, -28F, 0F);
		turretModel[34].rotateAngleZ = -0.10471976F;

		turretModel[35].addShapeBox(-14F, -18F, 9F, 6, 2, 2, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 484
		turretModel[35].setRotationPoint(0F, -28F, 0F);
		turretModel[35].rotateAngleZ = -0.10471976F;

		turretModel[36].addShapeBox(-14F, -12.25F, 8.75F, 6, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 485
		turretModel[36].setRotationPoint(0F, -28F, 0F);
		turretModel[36].rotateAngleZ = -0.10471976F;

		turretModel[37].addShapeBox(-11.5F, -16.25F, 7.5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		turretModel[37].setRotationPoint(0F, -28F, 0F);

		turretModel[38].addShapeBox(-11.5F, -17.5F, 7.5F, 4, 1, 4, 0F,-1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 490
		turretModel[38].setRotationPoint(0F, -28F, 0F);

		turretModel[39].addShapeBox(-11.5F, -15F, 7.5F, 4, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 491
		turretModel[39].setRotationPoint(0F, -28F, 0F);

		turretModel[40].addShapeBox(-11.5F, -15F, -11.5F, 4, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 492
		turretModel[40].setRotationPoint(0F, -28F, 0F);

		turretModel[41].addShapeBox(-11.5F, -16.25F, -11.5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		turretModel[41].setRotationPoint(0F, -28F, 0F);

		turretModel[42].addShapeBox(-11.5F, -17.5F, -11.5F, 4, 1, 4, 0F,-1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 494
		turretModel[42].setRotationPoint(0F, -28F, 0F);

		turretModel[43].addShapeBox(-12.5F, -5F, 5F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		turretModel[43].setRotationPoint(0F, -28F, 0F);

		turretModel[44].addShapeBox(-12.5F, -6.25F, 5F, 4, 1, 7, 0F,-1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 496
		turretModel[44].setRotationPoint(0F, -28F, 0F);

		turretModel[45].addShapeBox(-12.5F, -3.75F, 5F, 4, 1, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 497
		turretModel[45].setRotationPoint(0F, -28F, 0F);

		turretModel[46].addShapeBox(-12.5F, -5F, -11.5F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		turretModel[46].setRotationPoint(0F, -28F, 0F);

		turretModel[47].addShapeBox(-12.5F, -6.25F, -11.5F, 4, 1, 7, 0F,-1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 499
		turretModel[47].setRotationPoint(0F, -28F, 0F);

		turretModel[48].addShapeBox(-12.5F, -3.75F, -11.5F, 4, 1, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 500
		turretModel[48].setRotationPoint(0F, -28F, 0F);

		turretModel[49].addShapeBox(-11.5F, -17.5F, -2.35F, 4, 1, 5, 0F,-1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 501
		turretModel[49].setRotationPoint(0F, -28F, 0F);

		turretModel[50].addShapeBox(-11.5F, -16.25F, -2.35F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		turretModel[50].setRotationPoint(0F, -28F, 0F);

		turretModel[51].addShapeBox(-11.5F, -15F, -2.35F, 4, 1, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F); // Box 503
		turretModel[51].setRotationPoint(0F, -28F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 504
		barrelModel[1] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 506
		barrelModel[2] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 507
		barrelModel[3] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 508
		barrelModel[4] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 509
		barrelModel[5] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 510
		barrelModel[6] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 511
		barrelModel[7] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 512
		barrelModel[8] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 513
		barrelModel[9] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 514
		barrelModel[10] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 515
		barrelModel[11] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 516
		barrelModel[12] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Box 517
		barrelModel[13] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 518
		barrelModel[14] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 519
		barrelModel[15] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 520
		barrelModel[16] = new ModelRendererTurbo(this, 905, 145, textureX, textureY); // Box 521
		barrelModel[17] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 522
		barrelModel[18] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 523
		barrelModel[19] = new ModelRendererTurbo(this, 913, 145, textureX, textureY); // Box 524
		barrelModel[20] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 526
		barrelModel[21] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 527
		barrelModel[22] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 528
		barrelModel[23] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 529
		barrelModel[24] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 530
		barrelModel[25] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 531
		barrelModel[26] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 532
		barrelModel[27] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Box 533
		barrelModel[28] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 534
		barrelModel[29] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 535
		barrelModel[30] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 536
		barrelModel[31] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 537
		barrelModel[32] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 538
		barrelModel[33] = new ModelRendererTurbo(this, 937, 145, textureX, textureY); // Box 539
		barrelModel[34] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 540
		barrelModel[35] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 541
		barrelModel[36] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 542
		barrelModel[37] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 543
		barrelModel[38] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 544
		barrelModel[39] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 545
		barrelModel[40] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 546
		barrelModel[41] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Box 547
		barrelModel[42] = new ModelRendererTurbo(this, 649, 153, textureX, textureY); // Box 548
		barrelModel[43] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 549
		barrelModel[44] = new ModelRendererTurbo(this, 681, 153, textureX, textureY); // Box 550
		barrelModel[45] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 551
		barrelModel[46] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 552
		barrelModel[47] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 553

		barrelModel[0].addShapeBox(-0.5F, 2.5F, -6F, 1, 1, 16, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 504
		barrelModel[0].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[1].addShapeBox(-7.5F, -3.25F, -7F, 17, 5, 18, 0F,0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 506
		barrelModel[1].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[2].addShapeBox(-6.75F, -5.75F, -7F, 7, 2, 18, 0F,1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F); // Box 507
		barrelModel[2].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[3].addShapeBox(1F, -5.75F, -2F, 8, 2, 8, 0F,0.75F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.75F, 0.25F, 0F); // Box 508
		barrelModel[3].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[4].addShapeBox(-15F, -5.75F, -7F, 7, 2, 18, 0F,0.75F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0.75F, 1F, 0F); // Box 509
		barrelModel[4].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[5].addShapeBox(-15F, -1.5F, -7F, 7, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 1F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.75F, 1F, 0F); // Box 510
		barrelModel[5].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[6].addShapeBox(-15F, -1.5F, -3F, 7, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 1F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.75F, 1F, 0F); // Box 511
		barrelModel[6].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[7].addShapeBox(-15F, -2.5F, -7F, 7, 1, 1, 0F,0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0.75F, 0.75F, 0.25F, 0.75F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 512
		barrelModel[7].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[8].addShapeBox(-15F, -2.5F, -3F, 7, 1, 1, 0F,0.75F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.75F, 0.25F, 0.75F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 513
		barrelModel[8].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[9].addShapeBox(-15F, -1.5F, 10F, 7, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 1F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.75F, 1F, 0F); // Box 514
		barrelModel[9].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[10].addShapeBox(-15F, -2.5F, 6F, 7, 1, 1, 0F,0.75F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.75F, 0.25F, 0.75F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 515
		barrelModel[10].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[11].addShapeBox(-15F, -1.5F, 6F, 7, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 1F, 0F, 0.25F, 2.5F, 0F, 0.25F, 2.5F, 0F, 0.75F, 1F, 0F); // Box 516
		barrelModel[11].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[12].addShapeBox(-15F, -2.5F, 10F, 7, 1, 1, 0F,0.75F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 517
		barrelModel[12].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[13].addShapeBox(-14.5F, -5.5F, -9F, 5, 3, 2, 0F,0.75F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 1.5F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0.75F, 1.5F, 0F); // Box 518
		barrelModel[13].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[14].addShapeBox(-14.5F, -5.5F, 11F, 5, 3, 2, 0F,0.75F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.75F, -0.25F, 0F, 0.75F, 1.5F, 0F, 0.25F, 2F, 0F, 0.25F, 2F, 0F, 0.75F, 1.5F, 0F); // Box 519
		barrelModel[14].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[15].addShapeBox(9.75F, -3.75F, -7F, 1, 5, 18, 0F,0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 5.5F, -0.5F, 0F, 5.5F, -0.5F, 0F, 5.5F, 0.25F, 0F, 5.5F); // Box 520
		barrelModel[15].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[16].addShapeBox(9.75F, -6F, -2F, 1, 2, 8, 0F,0.25F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, 5F, 0.25F, 0F, 5F); // Box 521
		barrelModel[16].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[17].addShapeBox(9.75F, 1.25F, -12F, 1, 1, 5, 0F,0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 522
		barrelModel[17].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[18].addShapeBox(9.75F, 1.25F, 11F, 1, 1, 5, 0F,0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 523
		barrelModel[18].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[19].addShapeBox(9.75F, 1.25F, -6F, 1, 1, 16, 0F,0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F); // Box 524
		barrelModel[19].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[20].addShapeBox(9.75F, 2.25F, -2F, 1, 1, 8, 0F,0.25F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0.25F, -0.25F, -1F); // Box 526
		barrelModel[20].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[21].addShapeBox(-4.75F, -8.75F, 1.75F, 4, 3, 3, 0F,1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 1F, 0.25F, 0.5F); // Box 527
		barrelModel[21].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[22].addShapeBox(9.75F, -3.5F, -6F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		barrelModel[22].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[23].addShapeBox(9.75F, -3.5F, 6F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		barrelModel[23].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[24].addShapeBox(9.5F, -1.5F, -0.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		barrelModel[24].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[25].addShapeBox(9.5F, -5.5F, -0.5F, 1, 4, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		barrelModel[25].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[26].addShapeBox(10F, -2.5F, -5.5F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 532
		barrelModel[26].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[27].addShapeBox(10F, -1.75F, -5.5F, 1, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 533
		barrelModel[27].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[28].addShapeBox(10F, -3.25F, -5.5F, 1, 2, 3, 0F,0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 534
		barrelModel[28].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[29].addShapeBox(10F, -1.75F, 6.5F, 1, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 535
		barrelModel[29].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[30].addShapeBox(10F, -2.5F, 6.5F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 536
		barrelModel[30].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[31].addShapeBox(10F, -3.25F, 6.5F, 1, 2, 3, 0F,0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 537
		barrelModel[31].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[32].addShapeBox(10F, -1.25F, 0.5F, 1, 2, 3, 0F,0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 538
		barrelModel[32].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[33].addShapeBox(10F, -0.5F, 0.5F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 539
		barrelModel[33].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[34].addShapeBox(10F, 0.25F, 0.5F, 1, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 540
		barrelModel[34].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[35].addShapeBox(-4.5F, -8.5F, 1.9F, 4, 3, 3, 0F,1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.3F, 1F, 0.25F, -0.3F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.2F, 1F, 0.25F, 0.2F); // Box 541
		barrelModel[35].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[36].addShapeBox(-8F, -2F, -6.05F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 542
		barrelModel[36].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[37].addShapeBox(-8F, -2.75F, -6.05F, 1, 2, 3, 0F,0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 543
		barrelModel[37].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[38].addShapeBox(-8F, -1.25F, -6.05F, 1, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 544
		barrelModel[38].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[39].addShapeBox(-8F, -2F, -1.5F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 545
		barrelModel[39].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[40].addShapeBox(-8F, -2.75F, -1.5F, 1, 2, 3, 0F,0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 546
		barrelModel[40].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[41].addShapeBox(-8F, -1.25F, -1.5F, 1, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 547
		barrelModel[41].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[42].addShapeBox(-8F, -2F, 2.5F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 548
		barrelModel[42].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[43].addShapeBox(-8F, -2.75F, 2.5F, 1, 2, 3, 0F,0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 549
		barrelModel[43].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[44].addShapeBox(-8F, -1.25F, 2.5F, 1, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 550
		barrelModel[44].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[45].addShapeBox(-8F, -2F, 7F, 1, 2, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 551
		barrelModel[45].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[46].addShapeBox(-8F, -2.75F, 7F, 1, 2, 3, 0F,0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 552
		barrelModel[46].setRotationPoint(-9.5F, -46F, -2F);

		barrelModel[47].addShapeBox(-8F, -1.25F, 7F, 1, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 553
		barrelModel[47].setRotationPoint(-9.5F, -46F, -2F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 242
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 243
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 244
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 201
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 202
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 203

		leftTrackWheelModels[0].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 242
		leftTrackWheelModels[0].setRotationPoint(39.3F, -2.3F, 23.5F);

		leftTrackWheelModels[1].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 243
		leftTrackWheelModels[1].setRotationPoint(39.3F, -2.3F, 23.5F);

		leftTrackWheelModels[2].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 244
		leftTrackWheelModels[2].setRotationPoint(39.3F, -2.3F, 23.5F);

		leftTrackWheelModels[3].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 201
		leftTrackWheelModels[3].setRotationPoint(-36.3F, -0.5F, 23.5F);

		leftTrackWheelModels[4].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 202
		leftTrackWheelModels[4].setRotationPoint(-36.3F, -0.5F, 23.5F);

		leftTrackWheelModels[5].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 203
		leftTrackWheelModels[5].setRotationPoint(-36.3F, -0.5F, 23.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 416
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 417
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 418
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 425
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 426
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 427
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 431
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 432
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 433
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 434
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 437
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 438
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 439
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 440
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 441
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 442
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 443
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 444
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 445
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 446
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 449
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 451
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 453
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 454
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 455
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 456
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 457
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 458
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 459
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 460
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 461
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 462
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 463
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 464
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 465
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 466
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 467
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 468
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 469
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 470
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 471
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 472
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 473
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 474
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 475
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 476
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 477
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 478
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 479
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 480
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 481
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 482
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 483
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 484
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 485
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 487
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 488
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 489
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 490
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 491
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 492
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 493
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 494
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 495
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 496
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 497
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 498
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 499
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 500
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 501
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 502
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 503
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 504
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 505
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 506
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 507
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Box 508
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 509
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 510
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 511
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 512
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 513
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 514
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 515
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 516
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 517
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 518
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 519
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 520
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 521
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 522
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 523
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 524
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 525
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 526
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 527
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 528
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 529
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 530
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 531
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 532
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 533
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 534
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 535
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 536
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 537
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 538
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Box 539
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 540
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 541
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 737, 97, textureX, textureY); // Box 542
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 543
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 544
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 545
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 546
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 547
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 548
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 549
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 550
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 551
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 552
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 553
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 554
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 555
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 556
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 557
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 558
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 559
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 560
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 561
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 562
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 563
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 564
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 565
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 566
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 567
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 568
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 569
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 570
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 571
		rightTrackWheelModels[140] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 572
		rightTrackWheelModels[141] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 573
		rightTrackWheelModels[142] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 574
		rightTrackWheelModels[143] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 575
		rightTrackWheelModels[144] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 576
		rightTrackWheelModels[145] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 577
		rightTrackWheelModels[146] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 578
		rightTrackWheelModels[147] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 579
		rightTrackWheelModels[148] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 580
		rightTrackWheelModels[149] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 581
		rightTrackWheelModels[150] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 582
		rightTrackWheelModels[151] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 583
		rightTrackWheelModels[152] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 584
		rightTrackWheelModels[153] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 585
		rightTrackWheelModels[154] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 586
		rightTrackWheelModels[155] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 587
		rightTrackWheelModels[156] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 588
		rightTrackWheelModels[157] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 589
		rightTrackWheelModels[158] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 590
		rightTrackWheelModels[159] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 591
		rightTrackWheelModels[160] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 592
		rightTrackWheelModels[161] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 593
		rightTrackWheelModels[162] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 594
		rightTrackWheelModels[163] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 595
		rightTrackWheelModels[164] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 596
		rightTrackWheelModels[165] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 597
		rightTrackWheelModels[166] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 598
		rightTrackWheelModels[167] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 599
		rightTrackWheelModels[168] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 600
		rightTrackWheelModels[169] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 601
		rightTrackWheelModels[170] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 602
		rightTrackWheelModels[171] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 603
		rightTrackWheelModels[172] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 604
		rightTrackWheelModels[173] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 605
		rightTrackWheelModels[174] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 606
		rightTrackWheelModels[175] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 607
		rightTrackWheelModels[176] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 608
		rightTrackWheelModels[177] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 609
		rightTrackWheelModels[178] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 610
		rightTrackWheelModels[179] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 611
		rightTrackWheelModels[180] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 612
		rightTrackWheelModels[181] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 613
		rightTrackWheelModels[182] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 614
		rightTrackWheelModels[183] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 615
		rightTrackWheelModels[184] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 616
		rightTrackWheelModels[185] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 617
		rightTrackWheelModels[186] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 618
		rightTrackWheelModels[187] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 619
		rightTrackWheelModels[188] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 620
		rightTrackWheelModels[189] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 621
		rightTrackWheelModels[190] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 622
		rightTrackWheelModels[191] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 623
		rightTrackWheelModels[192] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 624
		rightTrackWheelModels[193] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 625
		rightTrackWheelModels[194] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 626
		rightTrackWheelModels[195] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 627
		rightTrackWheelModels[196] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 628
		rightTrackWheelModels[197] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 629
		rightTrackWheelModels[198] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 630
		rightTrackWheelModels[199] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 631
		rightTrackWheelModels[200] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 632
		rightTrackWheelModels[201] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 633
		rightTrackWheelModels[202] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 634
		rightTrackWheelModels[203] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 635
		rightTrackWheelModels[204] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 636
		rightTrackWheelModels[205] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 637
		rightTrackWheelModels[206] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 638
		rightTrackWheelModels[207] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 639
		rightTrackWheelModels[208] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 640
		rightTrackWheelModels[209] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 641
		rightTrackWheelModels[210] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 642
		rightTrackWheelModels[211] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 643
		rightTrackWheelModels[212] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 644
		rightTrackWheelModels[213] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 645
		rightTrackWheelModels[214] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 646
		rightTrackWheelModels[215] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 647
		rightTrackWheelModels[216] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 648
		rightTrackWheelModels[217] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 649
		rightTrackWheelModels[218] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 650
		rightTrackWheelModels[219] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 651
		rightTrackWheelModels[220] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 652
		rightTrackWheelModels[221] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 653
		rightTrackWheelModels[222] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 654
		rightTrackWheelModels[223] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 655
		rightTrackWheelModels[224] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 656
		rightTrackWheelModels[225] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 657
		rightTrackWheelModels[226] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Box 658
		rightTrackWheelModels[227] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 659
		rightTrackWheelModels[228] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 660
		rightTrackWheelModels[229] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Box 661
		rightTrackWheelModels[230] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 662
		rightTrackWheelModels[231] = new ModelRendererTurbo(this, 641, 121, textureX, textureY); // Box 663
		rightTrackWheelModels[232] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 664
		rightTrackWheelModels[233] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 665
		rightTrackWheelModels[234] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 666
		rightTrackWheelModels[235] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 667
		rightTrackWheelModels[236] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 668
		rightTrackWheelModels[237] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 669
		rightTrackWheelModels[238] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Box 670
		rightTrackWheelModels[239] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 671
		rightTrackWheelModels[240] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 672
		rightTrackWheelModels[241] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 673
		rightTrackWheelModels[242] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 674
		rightTrackWheelModels[243] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 675
		rightTrackWheelModels[244] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 676
		rightTrackWheelModels[245] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 677
		rightTrackWheelModels[246] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 678
		rightTrackWheelModels[247] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Box 679
		rightTrackWheelModels[248] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 680
		rightTrackWheelModels[249] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Box 681
		rightTrackWheelModels[250] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 682
		rightTrackWheelModels[251] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 683
		rightTrackWheelModels[252] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 684
		rightTrackWheelModels[253] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 685
		rightTrackWheelModels[254] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 686
		rightTrackWheelModels[255] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 687
		rightTrackWheelModels[256] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 688
		rightTrackWheelModels[257] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 689
		rightTrackWheelModels[258] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 690
		rightTrackWheelModels[259] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 691
		rightTrackWheelModels[260] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 692
		rightTrackWheelModels[261] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 693
		rightTrackWheelModels[262] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 694
		rightTrackWheelModels[263] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 695
		rightTrackWheelModels[264] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 696
		rightTrackWheelModels[265] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 576
		rightTrackWheelModels[266] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 577

		rightTrackWheelModels[0].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 416
		rightTrackWheelModels[0].setRotationPoint(39.3F, -2.3F, -15.5F);

		rightTrackWheelModels[1].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 417
		rightTrackWheelModels[1].setRotationPoint(39.3F, -2.3F, -15.5F);

		rightTrackWheelModels[2].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 418
		rightTrackWheelModels[2].setRotationPoint(39.3F, -2.3F, -15.5F);

		rightTrackWheelModels[3].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 425
		rightTrackWheelModels[3].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[4].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 426
		rightTrackWheelModels[4].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[5].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 427
		rightTrackWheelModels[5].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[6].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 431
		rightTrackWheelModels[6].setRotationPoint(-36.3F, -0.5F, -15.5F);

		rightTrackWheelModels[7].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 432
		rightTrackWheelModels[7].setRotationPoint(-36.3F, -0.5F, -15.5F);

		rightTrackWheelModels[8].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 433
		rightTrackWheelModels[8].setRotationPoint(-36.3F, -0.5F, -15.5F);

		rightTrackWheelModels[9].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		rightTrackWheelModels[9].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[10].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 437
		rightTrackWheelModels[10].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[11].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 438
		rightTrackWheelModels[11].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[12].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 439
		rightTrackWheelModels[12].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[13].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 440
		rightTrackWheelModels[13].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[14].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 441
		rightTrackWheelModels[14].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[15].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 442
		rightTrackWheelModels[15].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[16].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 443
		rightTrackWheelModels[16].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[17].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 444
		rightTrackWheelModels[17].setRotationPoint(-10.5F, 1.3F, -15.5F);
		rightTrackWheelModels[17].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[18].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 445
		rightTrackWheelModels[18].setRotationPoint(-10.5F, 1.3F, -15.5F);
		rightTrackWheelModels[18].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[19].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 446
		rightTrackWheelModels[19].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[20].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		rightTrackWheelModels[20].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[21].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 451
		rightTrackWheelModels[21].setRotationPoint(-10.5F, 1.3F, -15.5F);
		rightTrackWheelModels[21].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[22].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 453
		rightTrackWheelModels[22].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[23].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 454
		rightTrackWheelModels[23].setRotationPoint(-10.5F, 1.3F, -15.5F);
		rightTrackWheelModels[23].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[24].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 455
		rightTrackWheelModels[24].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[25].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 456
		rightTrackWheelModels[25].setRotationPoint(-10.5F, 1.3F, -15.5F);
		rightTrackWheelModels[25].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[26].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 457
		rightTrackWheelModels[26].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[27].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 458
		rightTrackWheelModels[27].setRotationPoint(-10.5F, 1.3F, -15.5F);
		rightTrackWheelModels[27].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[28].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 459
		rightTrackWheelModels[28].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[29].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 460
		rightTrackWheelModels[29].setRotationPoint(-10.5F, 1.3F, -15.5F);
		rightTrackWheelModels[29].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[30].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackWheelModels[30].setRotationPoint(-10.5F, 1.3F, -15.5F);

		rightTrackWheelModels[31].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 462
		rightTrackWheelModels[31].setRotationPoint(-10.5F, 1.3F, -15.5F);
		rightTrackWheelModels[31].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[32].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 463
		rightTrackWheelModels[32].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[33].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 464
		rightTrackWheelModels[33].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[34].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 465
		rightTrackWheelModels[34].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[35].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightTrackWheelModels[35].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[36].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 467
		rightTrackWheelModels[36].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[37].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 468
		rightTrackWheelModels[37].setRotationPoint(-24F, 1.3F, -15.5F);
		rightTrackWheelModels[37].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[38].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 469
		rightTrackWheelModels[38].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[39].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 470
		rightTrackWheelModels[39].setRotationPoint(-24F, 1.3F, -15.5F);
		rightTrackWheelModels[39].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[40].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 471
		rightTrackWheelModels[40].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[41].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 472
		rightTrackWheelModels[41].setRotationPoint(-24F, 1.3F, -15.5F);
		rightTrackWheelModels[41].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[42].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		rightTrackWheelModels[42].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[43].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 474
		rightTrackWheelModels[43].setRotationPoint(-24F, 1.3F, -15.5F);
		rightTrackWheelModels[43].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[44].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 475
		rightTrackWheelModels[44].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[45].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 476
		rightTrackWheelModels[45].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[46].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 477
		rightTrackWheelModels[46].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[47].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 478
		rightTrackWheelModels[47].setRotationPoint(-24F, 1.3F, -15.5F);
		rightTrackWheelModels[47].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[48].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 479
		rightTrackWheelModels[48].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[49].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 480
		rightTrackWheelModels[49].setRotationPoint(-24F, 1.3F, -15.5F);
		rightTrackWheelModels[49].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[50].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		rightTrackWheelModels[50].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[51].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 482
		rightTrackWheelModels[51].setRotationPoint(-24F, 1.3F, -15.5F);
		rightTrackWheelModels[51].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[52].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 483
		rightTrackWheelModels[52].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[53].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 484
		rightTrackWheelModels[53].setRotationPoint(-24F, 1.3F, -15.5F);
		rightTrackWheelModels[53].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[54].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 485
		rightTrackWheelModels[54].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[55].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 487
		rightTrackWheelModels[55].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[56].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 488
		rightTrackWheelModels[56].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[57].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 489
		rightTrackWheelModels[57].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[58].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 490
		rightTrackWheelModels[58].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[59].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 491
		rightTrackWheelModels[59].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[60].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		rightTrackWheelModels[60].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[61].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 493
		rightTrackWheelModels[61].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[62].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 494
		rightTrackWheelModels[62].setRotationPoint(2F, 1.3F, -15.5F);
		rightTrackWheelModels[62].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[63].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 495
		rightTrackWheelModels[63].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[64].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 496
		rightTrackWheelModels[64].setRotationPoint(2F, 1.3F, -15.5F);
		rightTrackWheelModels[64].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[65].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 497
		rightTrackWheelModels[65].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[66].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 498
		rightTrackWheelModels[66].setRotationPoint(2F, 1.3F, -15.5F);
		rightTrackWheelModels[66].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[67].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		rightTrackWheelModels[67].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[68].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 500
		rightTrackWheelModels[68].setRotationPoint(2F, 1.3F, -15.5F);
		rightTrackWheelModels[68].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[69].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 501
		rightTrackWheelModels[69].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[70].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 502
		rightTrackWheelModels[70].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[71].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 503
		rightTrackWheelModels[71].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[72].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 504
		rightTrackWheelModels[72].setRotationPoint(2F, 1.3F, -15.5F);
		rightTrackWheelModels[72].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[73].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 505
		rightTrackWheelModels[73].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[74].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 506
		rightTrackWheelModels[74].setRotationPoint(2F, 1.3F, -15.5F);
		rightTrackWheelModels[74].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[75].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		rightTrackWheelModels[75].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[76].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 508
		rightTrackWheelModels[76].setRotationPoint(2F, 1.3F, -15.5F);
		rightTrackWheelModels[76].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[77].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 509
		rightTrackWheelModels[77].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[78].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 510
		rightTrackWheelModels[78].setRotationPoint(2F, 1.3F, -15.5F);
		rightTrackWheelModels[78].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[79].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 511
		rightTrackWheelModels[79].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[80].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 512
		rightTrackWheelModels[80].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[81].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 513
		rightTrackWheelModels[81].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[82].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 514
		rightTrackWheelModels[82].setRotationPoint(2F, 1.3F, -15.5F);

		rightTrackWheelModels[83].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 515
		rightTrackWheelModels[83].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[84].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 516
		rightTrackWheelModels[84].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[85].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 517
		rightTrackWheelModels[85].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[86].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		rightTrackWheelModels[86].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[87].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 519
		rightTrackWheelModels[87].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[88].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 520
		rightTrackWheelModels[88].setRotationPoint(15F, 1.3F, -15.5F);
		rightTrackWheelModels[88].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[89].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 521
		rightTrackWheelModels[89].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[90].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 522
		rightTrackWheelModels[90].setRotationPoint(15F, 1.3F, -15.5F);
		rightTrackWheelModels[90].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[91].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 523
		rightTrackWheelModels[91].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[92].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 524
		rightTrackWheelModels[92].setRotationPoint(15F, 1.3F, -15.5F);
		rightTrackWheelModels[92].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[93].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightTrackWheelModels[93].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[94].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 526
		rightTrackWheelModels[94].setRotationPoint(15F, 1.3F, -15.5F);
		rightTrackWheelModels[94].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[95].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 527
		rightTrackWheelModels[95].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[96].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 528
		rightTrackWheelModels[96].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[97].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 529
		rightTrackWheelModels[97].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[98].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 530
		rightTrackWheelModels[98].setRotationPoint(15F, 1.3F, -15.5F);
		rightTrackWheelModels[98].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[99].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 531
		rightTrackWheelModels[99].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[100].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 532
		rightTrackWheelModels[100].setRotationPoint(15F, 1.3F, -15.5F);
		rightTrackWheelModels[100].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[101].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightTrackWheelModels[101].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[102].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 534
		rightTrackWheelModels[102].setRotationPoint(15F, 1.3F, -15.5F);
		rightTrackWheelModels[102].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[103].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 535
		rightTrackWheelModels[103].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[104].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 536
		rightTrackWheelModels[104].setRotationPoint(15F, 1.3F, -15.5F);
		rightTrackWheelModels[104].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[105].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 537
		rightTrackWheelModels[105].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[106].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 538
		rightTrackWheelModels[106].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[107].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 539
		rightTrackWheelModels[107].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[108].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 540
		rightTrackWheelModels[108].setRotationPoint(15F, 1.3F, -15.5F);

		rightTrackWheelModels[109].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 541
		rightTrackWheelModels[109].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[110].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 542
		rightTrackWheelModels[110].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[111].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 543
		rightTrackWheelModels[111].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[112].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		rightTrackWheelModels[112].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[113].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 545
		rightTrackWheelModels[113].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[114].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 546
		rightTrackWheelModels[114].setRotationPoint(28F, 1.3F, -15.5F);
		rightTrackWheelModels[114].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[115].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 547
		rightTrackWheelModels[115].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[116].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 548
		rightTrackWheelModels[116].setRotationPoint(28F, 1.3F, -15.5F);
		rightTrackWheelModels[116].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[117].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 549
		rightTrackWheelModels[117].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[118].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 550
		rightTrackWheelModels[118].setRotationPoint(28F, 1.3F, -15.5F);
		rightTrackWheelModels[118].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[119].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		rightTrackWheelModels[119].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[120].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 552
		rightTrackWheelModels[120].setRotationPoint(28F, 1.3F, -15.5F);
		rightTrackWheelModels[120].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[121].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 553
		rightTrackWheelModels[121].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[122].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 554
		rightTrackWheelModels[122].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[123].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 555
		rightTrackWheelModels[123].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[124].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 556
		rightTrackWheelModels[124].setRotationPoint(28F, 1.3F, -15.5F);
		rightTrackWheelModels[124].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[125].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 557
		rightTrackWheelModels[125].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[126].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 558
		rightTrackWheelModels[126].setRotationPoint(28F, 1.3F, -15.5F);
		rightTrackWheelModels[126].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[127].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightTrackWheelModels[127].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[128].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 560
		rightTrackWheelModels[128].setRotationPoint(28F, 1.3F, -15.5F);
		rightTrackWheelModels[128].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[129].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 561
		rightTrackWheelModels[129].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[130].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 562
		rightTrackWheelModels[130].setRotationPoint(28F, 1.3F, -15.5F);
		rightTrackWheelModels[130].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[131].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 563
		rightTrackWheelModels[131].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[132].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 564
		rightTrackWheelModels[132].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[133].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 565
		rightTrackWheelModels[133].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[134].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 566
		rightTrackWheelModels[134].setRotationPoint(28F, 1.3F, -15.5F);

		rightTrackWheelModels[135].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 567
		rightTrackWheelModels[135].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[136].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 568
		rightTrackWheelModels[136].setRotationPoint(28F, 1.3F, 23.5F);
		rightTrackWheelModels[136].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[137].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		rightTrackWheelModels[137].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[138].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 570
		rightTrackWheelModels[138].setRotationPoint(28F, 1.3F, 23.5F);
		rightTrackWheelModels[138].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[139].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 571
		rightTrackWheelModels[139].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[140].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 572
		rightTrackWheelModels[140].setRotationPoint(28F, 1.3F, 23.5F);
		rightTrackWheelModels[140].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[141].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 573
		rightTrackWheelModels[141].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[142].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 574
		rightTrackWheelModels[142].setRotationPoint(28F, 1.3F, 23.5F);
		rightTrackWheelModels[142].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[143].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 575
		rightTrackWheelModels[143].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[144].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 576
		rightTrackWheelModels[144].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[145].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 577
		rightTrackWheelModels[145].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[146].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		rightTrackWheelModels[146].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[147].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 579
		rightTrackWheelModels[147].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[148].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 580
		rightTrackWheelModels[148].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[149].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 581
		rightTrackWheelModels[149].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[150].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 582
		rightTrackWheelModels[150].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[151].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 583
		rightTrackWheelModels[151].setRotationPoint(28F, 1.3F, 23.5F);
		rightTrackWheelModels[151].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[152].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 584
		rightTrackWheelModels[152].setRotationPoint(28F, 1.3F, 23.5F);
		rightTrackWheelModels[152].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[153].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 585
		rightTrackWheelModels[153].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[154].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 586
		rightTrackWheelModels[154].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[155].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 587
		rightTrackWheelModels[155].setRotationPoint(28F, 1.3F, 23.5F);
		rightTrackWheelModels[155].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[156].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		rightTrackWheelModels[156].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[157].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 589
		rightTrackWheelModels[157].setRotationPoint(28F, 1.3F, 23.5F);
		rightTrackWheelModels[157].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[158].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 590
		rightTrackWheelModels[158].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[159].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 591
		rightTrackWheelModels[159].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[160].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 592
		rightTrackWheelModels[160].setRotationPoint(28F, 1.3F, 23.5F);

		rightTrackWheelModels[161].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightTrackWheelModels[161].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[162].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 594
		rightTrackWheelModels[162].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[163].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 595
		rightTrackWheelModels[163].setRotationPoint(15F, 1.3F, 23.5F);
		rightTrackWheelModels[163].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[164].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 596
		rightTrackWheelModels[164].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[165].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 597
		rightTrackWheelModels[165].setRotationPoint(15F, 1.3F, 23.5F);
		rightTrackWheelModels[165].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[166].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 598
		rightTrackWheelModels[166].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[167].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 599
		rightTrackWheelModels[167].setRotationPoint(15F, 1.3F, 23.5F);
		rightTrackWheelModels[167].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[168].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		rightTrackWheelModels[168].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[169].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 601
		rightTrackWheelModels[169].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[170].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 602
		rightTrackWheelModels[170].setRotationPoint(15F, 1.3F, 23.5F);
		rightTrackWheelModels[170].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[171].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 603
		rightTrackWheelModels[171].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[172].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 604
		rightTrackWheelModels[172].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[173].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 605
		rightTrackWheelModels[173].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[174].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 606
		rightTrackWheelModels[174].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[175].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 607
		rightTrackWheelModels[175].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[176].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 608
		rightTrackWheelModels[176].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[177].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 609
		rightTrackWheelModels[177].setRotationPoint(15F, 1.3F, 23.5F);
		rightTrackWheelModels[177].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[178].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 610
		rightTrackWheelModels[178].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[179].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 611
		rightTrackWheelModels[179].setRotationPoint(15F, 1.3F, 23.5F);
		rightTrackWheelModels[179].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[180].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 612
		rightTrackWheelModels[180].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[181].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 613
		rightTrackWheelModels[181].setRotationPoint(15F, 1.3F, 23.5F);
		rightTrackWheelModels[181].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[182].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 614
		rightTrackWheelModels[182].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[183].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		rightTrackWheelModels[183].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[184].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 616
		rightTrackWheelModels[184].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[185].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 617
		rightTrackWheelModels[185].setRotationPoint(15F, 1.3F, 23.5F);

		rightTrackWheelModels[186].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 618
		rightTrackWheelModels[186].setRotationPoint(15F, 1.3F, 23.5F);
		rightTrackWheelModels[186].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[187].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		rightTrackWheelModels[187].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[188].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 620
		rightTrackWheelModels[188].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[189].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 621
		rightTrackWheelModels[189].setRotationPoint(2F, 1.3F, 23.5F);
		rightTrackWheelModels[189].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[190].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 622
		rightTrackWheelModels[190].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[191].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 623
		rightTrackWheelModels[191].setRotationPoint(2F, 1.3F, 23.5F);
		rightTrackWheelModels[191].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[192].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 624
		rightTrackWheelModels[192].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[193].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 625
		rightTrackWheelModels[193].setRotationPoint(2F, 1.3F, 23.5F);
		rightTrackWheelModels[193].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[194].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		rightTrackWheelModels[194].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[195].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 627
		rightTrackWheelModels[195].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[196].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 628
		rightTrackWheelModels[196].setRotationPoint(2F, 1.3F, 23.5F);
		rightTrackWheelModels[196].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[197].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 629
		rightTrackWheelModels[197].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[198].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 630
		rightTrackWheelModels[198].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[199].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 631
		rightTrackWheelModels[199].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[200].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 632
		rightTrackWheelModels[200].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[201].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 633
		rightTrackWheelModels[201].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[202].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 634
		rightTrackWheelModels[202].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[203].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 635
		rightTrackWheelModels[203].setRotationPoint(2F, 1.3F, 23.5F);
		rightTrackWheelModels[203].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[204].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 636
		rightTrackWheelModels[204].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[205].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 637
		rightTrackWheelModels[205].setRotationPoint(2F, 1.3F, 23.5F);
		rightTrackWheelModels[205].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[206].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 638
		rightTrackWheelModels[206].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[207].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 639
		rightTrackWheelModels[207].setRotationPoint(2F, 1.3F, 23.5F);
		rightTrackWheelModels[207].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[208].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 640
		rightTrackWheelModels[208].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[209].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		rightTrackWheelModels[209].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[210].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 642
		rightTrackWheelModels[210].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[211].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 643
		rightTrackWheelModels[211].setRotationPoint(2F, 1.3F, 23.5F);

		rightTrackWheelModels[212].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 644
		rightTrackWheelModels[212].setRotationPoint(2F, 1.3F, 23.5F);
		rightTrackWheelModels[212].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[213].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		rightTrackWheelModels[213].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[214].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 646
		rightTrackWheelModels[214].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[215].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 647
		rightTrackWheelModels[215].setRotationPoint(-11F, 1.3F, 23.5F);
		rightTrackWheelModels[215].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[216].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 648
		rightTrackWheelModels[216].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[217].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 649
		rightTrackWheelModels[217].setRotationPoint(-11F, 1.3F, 23.5F);
		rightTrackWheelModels[217].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[218].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 650
		rightTrackWheelModels[218].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[219].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 651
		rightTrackWheelModels[219].setRotationPoint(-11F, 1.3F, 23.5F);
		rightTrackWheelModels[219].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[220].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		rightTrackWheelModels[220].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[221].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 653
		rightTrackWheelModels[221].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[222].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 654
		rightTrackWheelModels[222].setRotationPoint(-11F, 1.3F, 23.5F);
		rightTrackWheelModels[222].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[223].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 655
		rightTrackWheelModels[223].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[224].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 656
		rightTrackWheelModels[224].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[225].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 657
		rightTrackWheelModels[225].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[226].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 658
		rightTrackWheelModels[226].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[227].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 659
		rightTrackWheelModels[227].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[228].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 660
		rightTrackWheelModels[228].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[229].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 661
		rightTrackWheelModels[229].setRotationPoint(-11F, 1.3F, 23.5F);
		rightTrackWheelModels[229].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[230].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 662
		rightTrackWheelModels[230].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[231].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 663
		rightTrackWheelModels[231].setRotationPoint(-11F, 1.3F, 23.5F);
		rightTrackWheelModels[231].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[232].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 664
		rightTrackWheelModels[232].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[233].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 665
		rightTrackWheelModels[233].setRotationPoint(-11F, 1.3F, 23.5F);
		rightTrackWheelModels[233].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[234].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 666
		rightTrackWheelModels[234].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[235].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		rightTrackWheelModels[235].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[236].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 668
		rightTrackWheelModels[236].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[237].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 669
		rightTrackWheelModels[237].setRotationPoint(-11F, 1.3F, 23.5F);

		rightTrackWheelModels[238].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 670
		rightTrackWheelModels[238].setRotationPoint(-11F, 1.3F, 23.5F);
		rightTrackWheelModels[238].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[239].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		rightTrackWheelModels[239].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[240].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 672
		rightTrackWheelModels[240].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[241].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 673
		rightTrackWheelModels[241].setRotationPoint(-24.5F, 1.3F, 23.5F);
		rightTrackWheelModels[241].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[242].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 674
		rightTrackWheelModels[242].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[243].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 675
		rightTrackWheelModels[243].setRotationPoint(-24.5F, 1.3F, 23.5F);
		rightTrackWheelModels[243].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[244].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 676
		rightTrackWheelModels[244].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[245].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 677
		rightTrackWheelModels[245].setRotationPoint(-24.5F, 1.3F, 23.5F);
		rightTrackWheelModels[245].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[246].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		rightTrackWheelModels[246].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[247].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 679
		rightTrackWheelModels[247].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[248].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 680
		rightTrackWheelModels[248].setRotationPoint(-24.5F, 1.3F, 23.5F);
		rightTrackWheelModels[248].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[249].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 681
		rightTrackWheelModels[249].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[250].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 682
		rightTrackWheelModels[250].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[251].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 683
		rightTrackWheelModels[251].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[252].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 684
		rightTrackWheelModels[252].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[253].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 685
		rightTrackWheelModels[253].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[254].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 686
		rightTrackWheelModels[254].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[255].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 687
		rightTrackWheelModels[255].setRotationPoint(-24.5F, 1.3F, 23.5F);
		rightTrackWheelModels[255].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[256].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 688
		rightTrackWheelModels[256].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[257].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 689
		rightTrackWheelModels[257].setRotationPoint(-24.5F, 1.3F, 23.5F);
		rightTrackWheelModels[257].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[258].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 690
		rightTrackWheelModels[258].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[259].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 691
		rightTrackWheelModels[259].setRotationPoint(-24.5F, 1.3F, 23.5F);
		rightTrackWheelModels[259].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[260].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 692
		rightTrackWheelModels[260].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[261].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		rightTrackWheelModels[261].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[262].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 694
		rightTrackWheelModels[262].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[263].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 695
		rightTrackWheelModels[263].setRotationPoint(-24.5F, 1.3F, 23.5F);

		rightTrackWheelModels[264].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 696
		rightTrackWheelModels[264].setRotationPoint(-24.5F, 1.3F, 23.5F);
		rightTrackWheelModels[264].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[265].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 576
		rightTrackWheelModels[265].setRotationPoint(-24F, 1.3F, -15.5F);

		rightTrackWheelModels[266].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 577
		rightTrackWheelModels[266].setRotationPoint(-24F, 1.3F, -15.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 231
		leftTrackModel[1] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 232
		leftTrackModel[2] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 233
		leftTrackModel[3] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 234
		leftTrackModel[4] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 235
		leftTrackModel[5] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 236
		leftTrackModel[6] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 237
		leftTrackModel[7] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 238
		leftTrackModel[8] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 239
		leftTrackModel[9] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 240
		leftTrackModel[10] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 241
		leftTrackModel[11] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 242
		leftTrackModel[12] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 243

		leftTrackModel[0].addShapeBox(-6.5F, 1.5F, -6.5F, 51, 1, 7, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 3F, 0.8F, 0F, 3F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 231
		leftTrackModel[0].setRotationPoint(-17.1F, 5.2F, 22.5F);

		leftTrackModel[1].addShapeBox(-6.5F, 1.5F, -6.5F, 57, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 232
		leftTrackModel[1].setRotationPoint(-22.1F, -7.3F, 22.5F);

		leftTrackModel[2].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 233
		leftTrackModel[2].setRotationPoint(-20.1F, 5.2F, 22.5F);

		leftTrackModel[3].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 1, 7, 0F,0.8F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, 1F, 0F, 0F, -0.2F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, 0F, -0.2F, 0F); // Box 234
		leftTrackModel[3].setRotationPoint(-33.1F, 2.2F, 22.5F);

		leftTrackModel[4].addShapeBox(-3.5F, 1.5F, -6.5F, 12, 1, 7, 0F,0F, -3F, 0F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 0F, -3F, 0F, 0F, 3.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 3.8F, 0F); // Box 235
		leftTrackModel[4].setRotationPoint(33.9F, 2.2F, 22.5F);

		leftTrackModel[5].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,-2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F); // Box 236
		leftTrackModel[5].setRotationPoint(48.9F, -3.8F, 22.5F);

		leftTrackModel[6].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,2F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0.6F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F); // Box 237
		leftTrackModel[6].setRotationPoint(48.9F, -8.8F, 22.5F);

		leftTrackModel[7].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 238
		leftTrackModel[7].setRotationPoint(-34.1F, -1.8F, 22.5F);

		leftTrackModel[8].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,-0.4F, 0F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, -0.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F); // Box 239
		leftTrackModel[8].setRotationPoint(-34.1F, -6.8F, 22.5F);

		leftTrackModel[9].addShapeBox(-6.5F, 1.5F, -6.5F, 7, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 240
		leftTrackModel[9].setRotationPoint(-29.1F, -7.3F, 22.5F);

		leftTrackModel[10].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 241
		leftTrackModel[10].setRotationPoint(-32.1F, -7.7F, 22.5F);

		leftTrackModel[11].addShapeBox(-6.5F, 1.5F, -6.5F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.8F, 0F); // Box 242
		leftTrackModel[11].setRotationPoint(34.9F, -7.3F, 22.5F);

		leftTrackModel[12].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 243
		leftTrackModel[12].setRotationPoint(43.9F, -9.5F, 22.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 244
		rightTrackModel[1] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 245
		rightTrackModel[2] = new ModelRendererTurbo(this, 521, 57, textureX, textureY); // Box 246
		rightTrackModel[3] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 247
		rightTrackModel[4] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 248
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 249
		rightTrackModel[6] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 250
		rightTrackModel[7] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 251
		rightTrackModel[8] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 252
		rightTrackModel[9] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 253
		rightTrackModel[10] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 254
		rightTrackModel[11] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 255
		rightTrackModel[12] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 256

		rightTrackModel[0].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 244
		rightTrackModel[0].setRotationPoint(43.9F, -9.5F, -16.8F);

		rightTrackModel[1].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,2F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0.6F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F); // Box 245
		rightTrackModel[1].setRotationPoint(48.9F, -8.8F, -16.8F);

		rightTrackModel[2].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,-2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F); // Box 246
		rightTrackModel[2].setRotationPoint(48.9F, -3.8F, -16.8F);

		rightTrackModel[3].addShapeBox(-3.5F, 1.5F, -6.5F, 12, 1, 7, 0F,0F, -3F, 0F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 0F, -3F, 0F, 0F, 3.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 3.8F, 0F); // Box 247
		rightTrackModel[3].setRotationPoint(33.9F, 2.2F, -16.8F);

		rightTrackModel[4].addShapeBox(-6.5F, 1.5F, -6.5F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.8F, 0F); // Box 248
		rightTrackModel[4].setRotationPoint(34.9F, -7.3F, -16.8F);

		rightTrackModel[5].addShapeBox(-6.5F, 1.5F, -6.5F, 57, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 249
		rightTrackModel[5].setRotationPoint(-22.1F, -7.3F, -16.8F);

		rightTrackModel[6].addShapeBox(-6.5F, 1.5F, -6.5F, 51, 1, 7, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 3F, 0.8F, 0F, 3F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 250
		rightTrackModel[6].setRotationPoint(-17.1F, 5.2F, -16.8F);

		rightTrackModel[7].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 1, 7, 0F,0.8F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, 1F, 0F, 0F, -0.2F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, 0F, -0.2F, 0F); // Box 251
		rightTrackModel[7].setRotationPoint(-33.1F, 2.2F, -16.8F);

		rightTrackModel[8].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 252
		rightTrackModel[8].setRotationPoint(-20.1F, 5.2F, -16.8F);

		rightTrackModel[9].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 253
		rightTrackModel[9].setRotationPoint(-34.1F, -1.8F, -16.8F);

		rightTrackModel[10].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,-0.4F, 0F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, -0.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F); // Box 254
		rightTrackModel[10].setRotationPoint(-34.1F, -6.8F, -16.8F);

		rightTrackModel[11].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 255
		rightTrackModel[11].setRotationPoint(-32.1F, -7.7F, -16.8F);

		rightTrackModel[12].addShapeBox(-6.5F, 1.5F, -6.5F, 7, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 256
		rightTrackModel[12].setRotationPoint(-29.1F, -7.3F, -16.8F);
	}
}