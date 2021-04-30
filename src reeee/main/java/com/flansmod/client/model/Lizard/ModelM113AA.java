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

public class ModelM113AA extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelM113AA() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[123];
		bodyDoorCloseModel = new ModelRendererTurbo[19];
		turretModel = new ModelRendererTurbo[76];
		barrelModel = new ModelRendererTurbo[60];
		leftTrackModel = new ModelRendererTurbo[19];
		rightTrackModel = new ModelRendererTurbo[281];

		initbodyModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
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
		bodyModel[24] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 101
		bodyModel[25] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 102
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Body
		bodyModel[27] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Body
		bodyModel[28] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 109
		bodyModel[29] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 110
		bodyModel[30] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 117
		bodyModel[31] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 118
		bodyModel[32] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 119
		bodyModel[33] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 120
		bodyModel[34] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 125
		bodyModel[35] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 126
		bodyModel[36] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 127
		bodyModel[37] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 128
		bodyModel[38] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 131
		bodyModel[41] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 132
		bodyModel[42] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 133
		bodyModel[43] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 134
		bodyModel[44] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 135
		bodyModel[45] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 136
		bodyModel[46] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 138
		bodyModel[47] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 139
		bodyModel[48] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 159
		bodyModel[49] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 160
		bodyModel[50] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 161
		bodyModel[51] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 162
		bodyModel[52] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 163
		bodyModel[53] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 164
		bodyModel[54] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 165
		bodyModel[55] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 166
		bodyModel[56] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 172
		bodyModel[57] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 173
		bodyModel[58] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 174
		bodyModel[59] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 175
		bodyModel[60] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 176
		bodyModel[61] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 204
		bodyModel[62] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 205
		bodyModel[63] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 206
		bodyModel[64] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 207
		bodyModel[65] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 208
		bodyModel[66] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 209
		bodyModel[67] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 300
		bodyModel[68] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 301
		bodyModel[69] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 302
		bodyModel[70] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 290
		bodyModel[71] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 297
		bodyModel[72] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 298
		bodyModel[73] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 273
		bodyModel[74] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 353
		bodyModel[75] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 354
		bodyModel[76] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 355
		bodyModel[77] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 356
		bodyModel[78] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 357
		bodyModel[79] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 361
		bodyModel[80] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 362
		bodyModel[81] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 363
		bodyModel[82] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 364
		bodyModel[83] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 365
		bodyModel[84] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 366
		bodyModel[85] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 367
		bodyModel[86] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 368
		bodyModel[87] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 369
		bodyModel[88] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 370
		bodyModel[89] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 371
		bodyModel[90] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 372
		bodyModel[91] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 373
		bodyModel[92] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 374
		bodyModel[93] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 375
		bodyModel[94] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 376
		bodyModel[95] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 377
		bodyModel[96] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 378
		bodyModel[97] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 379
		bodyModel[98] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 380
		bodyModel[99] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 381
		bodyModel[100] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 382
		bodyModel[101] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 409
		bodyModel[102] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 410
		bodyModel[103] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 411
		bodyModel[104] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 412
		bodyModel[105] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 697
		bodyModel[106] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 698
		bodyModel[107] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 699
		bodyModel[108] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 621
		bodyModel[109] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 286
		bodyModel[110] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 287
		bodyModel[111] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Box 386
		bodyModel[112] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 388
		bodyModel[113] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 389
		bodyModel[114] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 372
		bodyModel[115] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Box 373
		bodyModel[116] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 374
		bodyModel[117] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 375
		bodyModel[118] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 376
		bodyModel[119] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 377
		bodyModel[120] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 378
		bodyModel[121] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 379
		bodyModel[122] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 380

		bodyModel[0].addShapeBox(0F, 0F, 0F, 83, 7, 33, 0F,0.7F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-32.9F, -7F, -16.7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 4, 33, 0F,-4F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, -0.2F, 0F, -2F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 3
		bodyModel[1].setRotationPoint(44.6F, -10.6F, -16.7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 17, 49, 0F,12F, -0.2F, -0.5F, -17.5F, -0.2F, -0.5F, -17.5F, -0.2F, 0F, 12F, -0.2F, 0F, -4F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, -0.2F, 0F); // Box 4
		bodyModel[2].setRotationPoint(44.6F, -27.2F, -24.7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 64, 17, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-32.4F, -27.2F, -24.7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 49, 2, 46, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.3F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-35.9F, -27.2F, -23.2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 81, 7, 1, 0F,2.05F, -0.2F, -0.5F, -1.8F, -0.2F, -0.5F, -1.8F, -0.2F, 0F, 2.05F, -0.2F, 0F, 0.6F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-31.9F, -13.6F, -16.7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-31.85F, -13.65F, -23.2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 81, 7, 1, 0F,2.1F, -0.2F, -0.5F, -1.8F, -0.2F, -0.5F, -1.8F, -0.2F, 0F, 2.1F, -0.2F, 0F, 0.6F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-31.9F, -13.6F, 15.3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-31.85F, -13.65F, 15.8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -15F, 0.5F, -0.5F, 16F, 0F, -0.5F, 16F, 0F, 0F, -15F, 0.5F, 0F); // Box 15
		bodyModel[9].setRotationPoint(32.6F, -27.1F, 1.3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 21
		bodyModel[10].setRotationPoint(18.1F, -28F, -10.2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 14, 2, 12, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 22
		bodyModel[11].setRotationPoint(21.1F, -28F, -23.6F);

		bodyModel[12].addBox(0F, 0F, 0F, 12, 3, 4, 0F); // Body
		bodyModel[12].setRotationPoint(19.5F, -28F, 11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Body
		bodyModel[13].setRotationPoint(19.5F, -28F, 15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[14].setRotationPoint(19.5F, -28F, 7F);

		bodyModel[15].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[15].setRotationPoint(33F, -28.3F, 11F);

		bodyModel[16].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[16].setRotationPoint(32F, -28.3F, 16F);
		bodyModel[16].rotateAngleY = 0.78539816F;

		bodyModel[17].addShapeBox(0F, -0.25F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[17].setRotationPoint(24.5F, -28.3F, 19.5F);

		bodyModel[18].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[18].setRotationPoint(29.5F, -28.3F, 7F);
		bodyModel[18].rotateAngleY = -0.78539816F;

		bodyModel[19].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 34
		bodyModel[19].setRotationPoint(20.5F, -28.5F, 11.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 35
		bodyModel[20].setRotationPoint(20.5F, -28.5F, 14.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,-3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[21].setRotationPoint(20.5F, -28.5F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 13, 32, 0F,8F, -0.2F, -0.5F, -13.5F, -0.2F, -0.5F, -13.5F, -0.2F, 0F, 8F, -0.2F, 0F, -6F, 0.8F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -6F, 0.8F, 0F); // Box 44
		bodyModel[22].setRotationPoint(44.5F, -24.2F, -16.3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 99
		bodyModel[23].setRotationPoint(44F, -19.8F, 8.9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2F, 0F, -0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, 2F, 0F, -0.1F, -2F, 1F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -2F, 1F, -0.1F); // Box 101
		bodyModel[24].setRotationPoint(35.9F, -27.7F, -5.8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, 1F, 0F, -0.4F, -2F, -0.6F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -2F, -0.6F, -0.4F); // Box 102
		bodyModel[25].setRotationPoint(36F, -26.9F, 11.7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Body
		bodyModel[26].setRotationPoint(-36.4F, -11F, -24F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[27].setRotationPoint(-41.4F, -11F, -24F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,-1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 109
		bodyModel[28].setRotationPoint(-41.4F, -11F, 16F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Box 110
		bodyModel[29].setRotationPoint(-36.4F, -11F, 16F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 117
		bodyModel[30].setRotationPoint(-17.1F, -28.2F, -21.3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 118
		bodyModel[31].setRotationPoint(15.7F, -28.2F, -22.3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 119
		bodyModel[32].setRotationPoint(12.7F, -28.2F, 18.7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F); // Box 120
		bodyModel[33].setRotationPoint(-30.1F, -28.2F, -20.3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 125
		bodyModel[34].setRotationPoint(-33.5F, -29.6F, 5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 34, 0F,-0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F); // Box 126
		bodyModel[35].setRotationPoint(-35.9F, -28.4F, -17.2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		bodyModel[36].setRotationPoint(50.6F, -10.4F, -24.2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[37].setRotationPoint(50.6F, -10.4F, 16.3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -3F, 0F, 0F, -2.2F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 48
		bodyModel[38].setRotationPoint(43.5F, -13.5F, 24.3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, -0.2F, 0F, -1.3F, -3F, 0F, -2.6F, -3F, 0F, 0.5F, -1.7F, 0F, 1F, 7.2F, 0F, -1F, 7.2F, 0F, -2F, 7.2F, 0F, 1F, 7.2F, 0F); // Box 49
		bodyModel[39].setRotationPoint(48.5F, -12.2F, 24.3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, -1.7F, 0F, -2.6F, -3F, 0F, -1.3F, -3F, 0F, 0.5F, -0.2F, 0F, 1F, 7.2F, 0F, -2F, 7.2F, 0F, -1F, 7.2F, 0F, 1F, 7.2F, 0F); // Box 131
		bodyModel[40].setRotationPoint(48.5F, -12.2F, -26.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -2.2F, 0F, -0.5F, -3F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 132
		bodyModel[41].setRotationPoint(43.5F, -13.5F, -26.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-2.6F, -3F, 0F, 0.5F, -1.7F, 0F, 0.5F, -0.2F, 0F, -1.3F, -3F, 0F, -2F, 7.2F, 0F, 1F, 7.2F, 0F, 1F, 7.2F, 0F, -1F, 7.2F, 0F); // Box 133
		bodyModel[42].setRotationPoint(-39F, -12.2F, -26.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-0.5F, -3F, 0F, 0.5F, -2.2F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1F, 4.5F, 0F, 0.5F, 4.5F, 0F, 0.5F, 4.5F, 0F, -1F, 4.5F, 0F); // Box 134
		bodyModel[43].setRotationPoint(-34F, -13.5F, -26.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, -2.2F, 0F, -0.5F, -3F, 0F, -1F, 4.5F, 0F, 0.5F, 4.5F, 0F, 0.5F, 4.5F, 0F, -1F, 4.5F, 0F); // Box 135
		bodyModel[44].setRotationPoint(-34F, -13.5F, 24.3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.3F, -3F, 0F, 0.5F, -0.2F, 0F, 0.5F, -1.7F, 0F, -2.6F, -3F, 0F, -1F, 7.2F, 0F, 1F, 7.2F, 0F, 1F, 7.2F, 0F, -2F, 7.2F, 0F); // Box 136
		bodyModel[45].setRotationPoint(-39F, -12.2F, 24.3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 72, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 138
		bodyModel[46].setRotationPoint(-28.5F, -13.5F, 24.3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 72, 5, 2, 0F,0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 139
		bodyModel[47].setRotationPoint(-28.5F, -13.5F, -26.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 159
		bodyModel[48].setRotationPoint(38.4F, -26F, -22.05F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 160
		bodyModel[49].setRotationPoint(39.3F, -26.5F, -22F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 161
		bodyModel[50].setRotationPoint(39.3F, -25.5F, -22F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 162
		bodyModel[51].setRotationPoint(39.3F, -24.5F, -22F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 163
		bodyModel[52].setRotationPoint(39.3F, -26.5F, -19F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 164
		bodyModel[53].setRotationPoint(39.3F, -25.5F, -19F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 165
		bodyModel[54].setRotationPoint(39.3F, -24.5F, -19F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 166
		bodyModel[55].setRotationPoint(38.4F, -26F, -19.05F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 172
		bodyModel[56].setRotationPoint(39.5F, -27.4F, -23.1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 173
		bodyModel[57].setRotationPoint(39.5F, -26.8F, -23.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 174
		bodyModel[58].setRotationPoint(39.5F, -26.8F, -17.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 175
		bodyModel[59].setRotationPoint(38.5F, -22.8F, -23.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 176
		bodyModel[60].setRotationPoint(38.5F, -22.8F, -17.5F);

		bodyModel[61].addShapeBox(-6F, -4.5F, -7F, 12, 3, 3, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 204
		bodyModel[61].setRotationPoint(45.3F, -3.8F, 19.8F);

		bodyModel[62].addShapeBox(-5F, -1.5F, -7F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[62].setRotationPoint(45.3F, -3.8F, 19.8F);

		bodyModel[63].addShapeBox(-6F, 1.5F, -7F, 12, 3, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 206
		bodyModel[63].setRotationPoint(45.3F, -3.8F, 19.8F);

		bodyModel[64].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 3, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 207
		bodyModel[64].setRotationPoint(45.3F, -3.8F, -9.6F);

		bodyModel[65].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[65].setRotationPoint(45.3F, -3.8F, -9.6F);

		bodyModel[66].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 209
		bodyModel[66].setRotationPoint(45.3F, -3.8F, -9.6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 17, 49, 0F,15F, -0.2F, -0.5F, -17F, -0.2F, -0.5F, -17F, -0.2F, 0F, 15F, -0.2F, 0F, 15F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, 15F, -0.2F, 0F); // Box 300
		bodyModel[67].setRotationPoint(46.6F, -27.2F, -24.7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 17, 2, 0F,15.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 15.5F, -0.2F, 0F, 12.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 12.5F, -0.2F, 0F); // Box 301
		bodyModel[68].setRotationPoint(-21.4F, -27.2F, -24.7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 64, 17, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 302
		bodyModel[69].setRotationPoint(-32.4F, -27.2F, 22.3F);

		bodyModel[70].addShapeBox(50F, 0F, 0F, 18, 2, 46, 0F,0.95F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.95F, -0.2F, 0F, 0.95F, -0.3F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.95F, -0.3F, 0F); // Box 290
		bodyModel[70].setRotationPoint(-35.9F, -27.2F, -23.2F);

		bodyModel[71].addShapeBox(0F, -7.95F, 0F, 1, 21, 8, 0F,0F, -0.02F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.02F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 297
		bodyModel[71].setRotationPoint(-35.5F, -19.2F, -23.2F);
		bodyModel[71].rotateAngleZ = 0.17889625F;

		bodyModel[72].addShapeBox(0F, -7.95F, 0F, 1, 21, 8, 0F,0F, -0.02F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.02F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 298
		bodyModel[72].setRotationPoint(-35.5F, -19.2F, 14.8F);
		bodyModel[72].rotateAngleZ = 0.17889625F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 17, 2, 0F,15.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 15.5F, -0.2F, 0F, 12.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 12.5F, -0.2F, 0F); // Box 273
		bodyModel[73].setRotationPoint(-21.4F, -27.2F, 22.3F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 353
		bodyModel[74].setRotationPoint(18.5F, -28.25F, 9.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 354
		bodyModel[75].setRotationPoint(18F, -29F, 10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 355
		bodyModel[76].setRotationPoint(18F, -29F, 14.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 356
		bodyModel[77].setRotationPoint(18.5F, -28.5F, 16.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 357
		bodyModel[78].setRotationPoint(18.5F, -28.5F, 8.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 361
		bodyModel[79].setRotationPoint(-33.5F, -27.6F, 16.7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F); // Box 362
		bodyModel[80].setRotationPoint(-32F, -28.2F, 18.2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 363
		bodyModel[81].setRotationPoint(39.3F, -25.5F, 21F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 364
		bodyModel[82].setRotationPoint(39.3F, -26.5F, 21F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 365
		bodyModel[83].setRotationPoint(39.3F, -24.5F, 21F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 366
		bodyModel[84].setRotationPoint(38.4F, -26F, 20.95F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 367
		bodyModel[85].setRotationPoint(38.5F, -22.8F, 22.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 368
		bodyModel[86].setRotationPoint(39.5F, -26.8F, 22.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 369
		bodyModel[87].setRotationPoint(39.5F, -27.4F, 16.9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 370
		bodyModel[88].setRotationPoint(39.5F, -26.8F, 16.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 371
		bodyModel[89].setRotationPoint(38.5F, -22.8F, 16.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 372
		bodyModel[90].setRotationPoint(38.4F, -26F, 17.95F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 373
		bodyModel[91].setRotationPoint(39.3F, -25.5F, 18F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 374
		bodyModel[92].setRotationPoint(39.3F, -26.5F, 18F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 375
		bodyModel[93].setRotationPoint(39.3F, -24.5F, 18F);

		bodyModel[94].addShapeBox(-5F, -1.5F, -6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[94].setRotationPoint(53.5F, -6.8F, -4.6F);

		bodyModel[95].addShapeBox(-5F, -1.5F, -6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[95].setRotationPoint(53.5F, -6.8F, 16.4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 378
		bodyModel[96].setRotationPoint(-18.5F, -1F, -17.2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 379
		bodyModel[97].setRotationPoint(-6F, -1F, -17.2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 380
		bodyModel[98].setRotationPoint(6.5F, -1F, -17.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 381
		bodyModel[99].setRotationPoint(19.5F, -1F, -17.2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 382
		bodyModel[100].setRotationPoint(32F, -1F, -17.2F);

		bodyModel[101].addShapeBox(-1F, -5.95F, 5.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[101].setRotationPoint(-35.5F, -19.2F, 14.8F);
		bodyModel[101].rotateAngleZ = 0.17889625F;

		bodyModel[102].addShapeBox(-1F, -5.95F, 1.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[102].setRotationPoint(-35.5F, -19.2F, 14.8F);
		bodyModel[102].rotateAngleZ = 0.17889625F;

		bodyModel[103].addShapeBox(-1F, -5.95F, -33F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[103].setRotationPoint(-35.5F, -19.2F, 14.8F);
		bodyModel[103].rotateAngleZ = 0.17889625F;

		bodyModel[104].addShapeBox(-1F, -5.95F, -37F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[104].setRotationPoint(-35.5F, -19.2F, 14.8F);
		bodyModel[104].rotateAngleZ = 0.17889625F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 697
		bodyModel[105].setRotationPoint(44F, -19.8F, -11.1F);

		bodyModel[106].addShapeBox(1F, -0.25F, 1F, 15, 2, 13, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 698
		bodyModel[106].setRotationPoint(18.1F, -28F, -10.2F);

		bodyModel[107].addShapeBox(3.5F, -0.25F, -13F, 13, 2, 11, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 699
		bodyModel[107].setRotationPoint(18.1F, -28F, -10.2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 64, 16, 47, 0F,3F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 3F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 621
		bodyModel[108].setRotationPoint(-32.4F, -26.2F, -23.7F);

		bodyModel[109].addShapeBox(1F, 0F, 0F, 65, 13, 4, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 13F, -0.2F, -0.5F, 17F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 286
		bodyModel[109].setRotationPoint(-34.4F, -25.2F, -28F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 65, 13, 4, 0F,0F, -0.2F, 0F, 3F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 17F, -0.2F, 0F, 13F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 287
		bodyModel[110].setRotationPoint(-33.4F, -25.2F, 24.35F);

		bodyModel[111].addShapeBox(0F, -3F, 0F, 11, 12, 30, 0F,3F, -0.5F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 3F, -0.5F, 0F, -9.2F, 1F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, -9.2F, 1F, 0F); // Box 386
		bodyModel[111].setRotationPoint(41.6F, -21F, -15.6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, 1F, 0F, -0.4F, -2F, -0.6F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -2F, -0.6F, -0.4F); // Box 388
		bodyModel[112].setRotationPoint(45F, -22.9F, 11.7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, 1F, 0F, -0.4F, -2F, -0.6F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -2F, -0.6F, -0.4F); // Box 389
		bodyModel[113].setRotationPoint(45F, -22.9F, -15F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 372
		bodyModel[114].setRotationPoint(-30.5F, -28F, -6F);

		bodyModel[115].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Box 373
		bodyModel[115].setRotationPoint(-30.5F, -28F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[116].setRotationPoint(-30.5F, -28F, -14F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 375
		bodyModel[117].setRotationPoint(-32.1F, -28.2F, -1.3F);

		bodyModel[118].addShapeBox(0.2F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 376
		bodyModel[118].setRotationPoint(-33.1F, -28.2F, -1.3F);

		bodyModel[119].addShapeBox(5.2F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 377
		bodyModel[119].setRotationPoint(-33.1F, -28.2F, -1.3F);

		bodyModel[120].addShapeBox(12.2F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 378
		bodyModel[120].setRotationPoint(-33.1F, -28.2F, -1.3F);

		bodyModel[121].addShapeBox(10.2F, 0F, -2F, 1, 2, 3, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 379
		bodyModel[121].setRotationPoint(-33.1F, -28.2F, -1.3F);

		bodyModel[122].addShapeBox(5.2F, 0F, -2F, 1, 2, 3, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 380
		bodyModel[122].setRotationPoint(-33.1F, -28.2F, -1.3F);
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
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 397
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 398
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 399
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
		bodyDoorCloseModel[0].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[1].addShapeBox(-2.25F, -29.5F, 1F, 3, 5, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 391
		bodyDoorCloseModel[1].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[2].addShapeBox(-2.25F, -29.5F, 29F, 3, 5, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 392
		bodyDoorCloseModel[2].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[3].addShapeBox(-2.25F, -28.5F, 16F, 3, 2, 13, 0F,-0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 393
		bodyDoorCloseModel[3].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[4].addShapeBox(-2.25F, -26.5F, 16F, 3, 14, 13, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 394
		bodyDoorCloseModel[4].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[5].addShapeBox(-2.25F, -12.5F, 16F, 3, 4, 13, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -3.25F, -0.25F, 0.5F, -3.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 395
		bodyDoorCloseModel[5].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[5].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[6].addShapeBox(-2.25F, -8.5F, 19F, 3, 1, 10, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0F, -1.25F); // Box 396
		bodyDoorCloseModel[6].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[6].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[7].addShapeBox(-2.75F, -24.5F, 15F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 397
		bodyDoorCloseModel[7].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[7].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[8].addShapeBox(-2.75F, -14.5F, 15F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 398
		bodyDoorCloseModel[8].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[8].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[9].addShapeBox(-2.65F, -25.5F, 15.4F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F); // Box 399
		bodyDoorCloseModel[9].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[9].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[10].addShapeBox(-2.65F, -15.5F, 15.4F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F); // Box 400
		bodyDoorCloseModel[10].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[10].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[11].addShapeBox(-1.75F, -20.5F, 4F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyDoorCloseModel[11].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[11].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[12].addShapeBox(-3.25F, -11.5F, 2F, 3, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyDoorCloseModel[12].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[12].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[13].addShapeBox(-3.25F, -11.5F, 11F, 3, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 403
		bodyDoorCloseModel[13].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[13].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[14].addShapeBox(-3.25F, -14.5F, 2F, 3, 3, 2, 0F,-0.25F, 0F, -2.25F, -0.25F, -0.2F, -2.25F, -0.25F, -0.2F, 1.75F, -0.25F, 0F, 1.75F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 404
		bodyDoorCloseModel[14].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[14].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[15].addShapeBox(-3.25F, -14.5F, 11F, 3, 3, 2, 0F,-0.25F, 0F, 1.75F, -0.25F, -0.2F, 1.75F, -0.25F, -0.2F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 405
		bodyDoorCloseModel[15].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[15].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[16].addShapeBox(-3.25F, -9.5F, 11F, 3, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -0.25F, -0.2F, 1.75F, -0.25F, -0.2F, -2.25F, -0.25F, 0F, -2.25F); // Box 406
		bodyDoorCloseModel[16].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[16].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[17].addShapeBox(-3.25F, -9.5F, 2F, 3, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.25F, -0.25F, -0.2F, -2.25F, -0.25F, -0.2F, 1.75F, -0.25F, 0F, 1.75F); // Box 407
		bodyDoorCloseModel[17].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[17].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[18].addShapeBox(-2.75F, -26.5F, 24F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyDoorCloseModel[18].setRotationPoint(-31F, 2.2F, -16F);
		bodyDoorCloseModel[18].rotateAngleZ = 0.18325957F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 209
		turretModel[1] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 210
		turretModel[2] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 211
		turretModel[3] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Box 212
		turretModel[4] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 213
		turretModel[5] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 214
		turretModel[6] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 215
		turretModel[7] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 216
		turretModel[8] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 218
		turretModel[9] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 219
		turretModel[10] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 220
		turretModel[11] = new ModelRendererTurbo(this, 753, 9, textureX, textureY); // Box 224
		turretModel[12] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 225
		turretModel[13] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 226
		turretModel[14] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 227
		turretModel[15] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 228
		turretModel[16] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 229
		turretModel[17] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 230
		turretModel[18] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 232
		turretModel[19] = new ModelRendererTurbo(this, 769, 137, textureX, textureY); // Box 233
		turretModel[20] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 237
		turretModel[21] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 238
		turretModel[22] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 240
		turretModel[23] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 241
		turretModel[24] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Box 242
		turretModel[25] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 243
		turretModel[26] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 244
		turretModel[27] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 245
		turretModel[28] = new ModelRendererTurbo(this, 849, 137, textureX, textureY); // Box 246
		turretModel[29] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 248
		turretModel[30] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 249
		turretModel[31] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 250
		turretModel[32] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 251
		turretModel[33] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 252
		turretModel[34] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 253
		turretModel[35] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Box 254
		turretModel[36] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 255
		turretModel[37] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 259
		turretModel[38] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 260
		turretModel[39] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 262
		turretModel[40] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 304
		turretModel[41] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 305
		turretModel[42] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 306
		turretModel[43] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 307
		turretModel[44] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 329
		turretModel[45] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 330
		turretModel[46] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 331
		turretModel[47] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 332
		turretModel[48] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 341
		turretModel[49] = new ModelRendererTurbo(this, 593, 145, textureX, textureY); // Box 342
		turretModel[50] = new ModelRendererTurbo(this, 817, 145, textureX, textureY); // Box 343
		turretModel[51] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 344
		turretModel[52] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 345
		turretModel[53] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 346
		turretModel[54] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 347
		turretModel[55] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 348
		turretModel[56] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 349
		turretModel[57] = new ModelRendererTurbo(this, 937, 145, textureX, textureY); // Box 350
		turretModel[58] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 352
		turretModel[59] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 353
		turretModel[60] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 354
		turretModel[61] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 355
		turretModel[62] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 356
		turretModel[63] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 357
		turretModel[64] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 358
		turretModel[65] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 360
		turretModel[66] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 361
		turretModel[67] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 362
		turretModel[68] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 363
		turretModel[69] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 364
		turretModel[70] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 366
		turretModel[71] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 367
		turretModel[72] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 368
		turretModel[73] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 369
		turretModel[74] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 370
		turretModel[75] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 371

		turretModel[0].addBox(-4F, 0F, -12F, 8, 1, 24, 0F); // Box 209
		turretModel[0].setRotationPoint(0F, -28F, 0F);

		turretModel[1].addShapeBox(4F, 0F, -12F, 8, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 210
		turretModel[1].setRotationPoint(0F, -28F, 0F);

		turretModel[2].addShapeBox(-12F, 0F, -12F, 8, 1, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 211
		turretModel[2].setRotationPoint(0F, -28F, 0F);

		turretModel[3].addShapeBox(-4F, -9F, -9F, 8, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 212
		turretModel[3].setRotationPoint(0F, -28F, 0F);

		turretModel[4].addShapeBox(-4F, -9F, 8F, 8, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 213
		turretModel[4].setRotationPoint(0F, -28F, 0F);

		turretModel[5].addShapeBox(-9F, -9F, -4F, 1, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 214
		turretModel[5].setRotationPoint(0F, -28F, 0F);

		turretModel[6].addShapeBox(-9F, -9F, 4F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 2F, -5F, 0F, 3F); // Box 215
		turretModel[6].setRotationPoint(0F, -28F, 0F);

		turretModel[7].addShapeBox(-9F, -9F, -9F, 1, 9, 5, 0F,-5F, 0F, 0F, 4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, 4F, 0F, 2F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 216
		turretModel[7].setRotationPoint(0F, -28F, 0F);

		turretModel[8].addShapeBox(8F, -9F, -9F, 1, 9, 5, 0F,4F, 0F, -1F, -5F, 0F, 0F, -2.5F, 0F, -2F, 2F, 0F, -1.5F, 4F, 0F, 2F, -5F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2.5F); // Box 218
		turretModel[8].setRotationPoint(0F, -28F, 0F);

		turretModel[9].addShapeBox(8F, -4F, 4F, 1, 4, 5, 0F,1F, 0F, -2F, -1.5F, 0F, -2.5F, -5F, 0F, 1.7F, 4F, 0F, 0.7F, 0F, 0F, -2.5F, 0F, 0F, -3F, -5F, 0F, 3F, 4F, 0F, 2F); // Box 219
		turretModel[9].setRotationPoint(0F, -28F, 0F);

		turretModel[10].addShapeBox(0F, -11F, -9F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		turretModel[10].setRotationPoint(0F, -28F, 0F);

		turretModel[11].addShapeBox(8F, -11F, -9F, 1, 2, 5, 0F,4F, 0F, -1F, -5F, 0F, 0F, -2.5F, 0F, -2F, 2F, 0F, -1.5F, 4F, 0F, -1F, -5F, 0F, 0F, -2.5F, 0F, -2F, 2F, 0F, -1.5F); // Box 224
		turretModel[11].setRotationPoint(0F, -28F, 0F);

		turretModel[12].addShapeBox(-4F, -11F, 8F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		turretModel[12].setRotationPoint(0F, -28F, 0F);

		turretModel[13].addShapeBox(-9F, -11F, -2F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		turretModel[13].setRotationPoint(0F, -28F, 0F);

		turretModel[14].addShapeBox(-9F, -11F, 4F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F); // Box 227
		turretModel[14].setRotationPoint(0F, -28F, 0F);

		turretModel[15].addShapeBox(-14F, -8.8F, -0.5F, 5, 5, 1, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -1F, 0F, -0.3F, -0.85F, 0F, -0.3F, -0.85F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 228
		turretModel[15].setRotationPoint(0F, -28F, 0F);

		turretModel[16].addShapeBox(-1.3F, -8.8F, 8.5F, 1, 5, 5, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.35F, -0.3F, 0F, -1.35F, -0.3F, 0F, -0.85F, -0.3F, 0F, -0.85F); // Box 229
		turretModel[16].setRotationPoint(0F, -28F, 0F);

		turretModel[17].addShapeBox(-14.2F, -8.8F, -0.2F, 1, 5, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0.2F, -0.9F, 0F, 0.3F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 1.3F, 0F, 0F, -1.8F, 0F, 0F); // Box 230
		turretModel[17].setRotationPoint(0F, -28F, 0F);

		turretModel[18].addShapeBox(-4.5F, -8.8F, 12.8F, 4, 5, 1, 0F,-0.2F, 0F, 0.1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.7F, -0.5F, 0F, 1F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1.15F, -0.5F, 0F, -1.6F); // Box 232
		turretModel[18].setRotationPoint(0F, -28F, 0F);

		turretModel[19].addShapeBox(-8F, -8.8F, 12.4F, 4, 5, 1, 0F,0F, 0F, 1.7F, -0.3F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0.3F, 0F, -2.4F, -0.5F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, -1.2F, -0.4F, 0F, -3.1F); // Box 233
		turretModel[19].setRotationPoint(0F, -28F, 0F);

		turretModel[20].addShapeBox(-13.6F, -8.8F, 4.1F, 1, 5, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0.1F, 1.7F, 0F, -0.3F, -2.4F, 0F, 0F, -1.2F, 0F, 0.3F, 0.7F, 0F, 0.3F, 2.7F, 0F, -0.7F, -3.2F, 0F, -0.5F); // Box 237
		turretModel[20].setRotationPoint(0F, -28F, 0F);

		turretModel[21].addShapeBox(-10.9F, -8.8F, 7.5F, 4, 5, 1, 0F,0F, 0F, -0.3F, -1F, 0F, -3.3F, -1.4F, 0F, 2.5F, 0.3F, 0F, -0.4F, -1F, 0F, 0.1F, -0.6F, 0F, -2.5F, -0.7F, 0F, 1.8F, -0.5F, 0F, -0.9F); // Box 238
		turretModel[21].setRotationPoint(0F, -28F, 0F);

		turretModel[22].addShapeBox(-4F, -4.5F, 10F, 3, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F); // Box 240
		turretModel[22].setRotationPoint(0F, -28F, 0F);

		turretModel[23].addShapeBox(-12.5F, -4.5F, -0.2F, 2, 1, 4, 0F,0.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 241
		turretModel[23].setRotationPoint(0F, -28F, 0F);

		turretModel[24].addShapeBox(-7F, -4.5F, 9.5F, 3, 1, 2, 0F,0F, -0.3F, 2F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.5F, 0.6F, -0.3F, -1.4F, 0F, -0.3F, 2F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.5F, 0.6F, -0.3F, -1.4F); // Box 242
		turretModel[24].setRotationPoint(0F, -28F, 0F);

		turretModel[25].addShapeBox(-10.6F, -4.5F, 6F, 3, 1, 2, 0F,-2F, -0.3F, 0.5F, 0.6F, -0.3F, -1.4F, 0F, -0.3F, 2F, -0.5F, -0.3F, -0.2F, -2F, -0.3F, 0.5F, 0.6F, -0.3F, -1.4F, 0F, -0.3F, 2F, -0.5F, -0.3F, -0.2F); // Box 243
		turretModel[25].setRotationPoint(0F, -28F, 0F);

		turretModel[26].addShapeBox(-11.6F, -4.5F, 3.7F, 1, 1, 4, 0F,0.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 4F, -0.3F, 0F, -1.2F, -0.3F, -0.2F, 0.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 4F, -0.3F, 0F, -1.3F, -0.3F, -0.2F); // Box 244
		turretModel[26].setRotationPoint(0F, -28F, 0F);

		turretModel[27].addShapeBox(-13F, -11F, -2F, 4, 8, 1, 0F,0F, 0F, 2.75F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.75F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, -3F); // Box 245
		turretModel[27].setRotationPoint(0F, -28F, 0F);

		turretModel[28].addShapeBox(-13F, -11F, -11.75F, 1, 8, 7, 0F,-5F, 0F, 0F, 5F, 0F, 0F, -0.3F, 0F, 0.5F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, -0.5F, 0F, 0.7F, 0F, 0F, 0F); // Box 246
		turretModel[28].setRotationPoint(0F, -28F, 0F);

		turretModel[29].addShapeBox(-7F, -9F, -11.75F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 248
		turretModel[29].setRotationPoint(0F, -28F, 0F);

		turretModel[30].addShapeBox(-2F, -9F, -11.75F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -2.75F, -0.5F, 0F, 2.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, 0F); // Box 249
		turretModel[30].setRotationPoint(0F, -28F, 0F);

		turretModel[31].addShapeBox(3F, -6F, 4.25F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		turretModel[31].setRotationPoint(0F, -28F, 0F);

		turretModel[32].addShapeBox(3F, -6F, -5.25F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		turretModel[32].setRotationPoint(0F, -28F, 0F);

		turretModel[33].addShapeBox(-5F, -11F, 4.25F, 8, 11, 1, 0F,-1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -0.5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -10F, 0F); // Box 252
		turretModel[33].setRotationPoint(0F, -28F, 0F);

		turretModel[34].addShapeBox(-5F, -11F, -5.25F, 8, 11, 1, 0F,-1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -0.5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -10F, 0F); // Box 253
		turretModel[34].setRotationPoint(0F, -28F, 0F);

		turretModel[35].addShapeBox(-6F, -11F, 4.25F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		turretModel[35].setRotationPoint(0F, -28F, 0F);

		turretModel[36].addShapeBox(-6F, -11F, -5.25F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		turretModel[36].setRotationPoint(0F, -28F, 0F);

		turretModel[37].addShapeBox(-12.95F, -4F, -11.7F, 3, 1, 7, 0F,-5F, 0F, 0F, 7F, 0F, -0.5F, -0.6F, 0F, 1.5F, 0F, 0F, 0F, -5F, 0F, 0F, 7F, 0F, -0.5F, -1F, 0F, 1.9F, 0F, 0F, 0F); // Box 259
		turretModel[37].setRotationPoint(0F, -28F, 0F);

		turretModel[38].addShapeBox(-12F, -9.3F, -10.5F, 2, 5, 6, 0F,-3.5F, 0F, 0F, 4.25F, 0F, -2F, 0.25F, 0F, 1.5F, 0.1F, 0F, 0F, -3.5F, 0F, 0F, 4.25F, 0F, -2F, -0.25F, 0F, 0.5F, 0.1F, 0F, 0F); // Box 260
		turretModel[38].setRotationPoint(0F, -28F, 0F);

		turretModel[39].addShapeBox(9F, -2F, -4F, 1, 2, 8, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		turretModel[39].setRotationPoint(0F, -28F, 0F);

		turretModel[40].addShapeBox(4F, -6.7F, -22F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -1.2F); // Box 304
		turretModel[40].setRotationPoint(0F, -28F, 0F);

		turretModel[41].addShapeBox(4F, -16.2F, -22.3F, 1, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 305
		turretModel[41].setRotationPoint(0F, -28F, 0F);

		turretModel[42].addShapeBox(4F, -16.2F, -13.5F, 1, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 306
		turretModel[42].setRotationPoint(0F, -28F, 0F);

		turretModel[43].addShapeBox(4F, -6.7F, -22F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -0.1F, 0F, 5F, -1.2F); // Box 307
		turretModel[43].setRotationPoint(0F, -28F, 0F);

		turretModel[44].addShapeBox(2F, -6.7F, -18F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, -0.2F, 4F, 3F, -0.2F); // Box 329
		turretModel[44].setRotationPoint(0F, -28F, 0F);

		turretModel[45].addShapeBox(2.2F, -6.7F, -18.8F, 2, 1, 1, 0F,-1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 330
		turretModel[45].setRotationPoint(0F, -28F, 0F);

		turretModel[46].addShapeBox(-7F, -12F, -19.75F, 5, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 331
		turretModel[46].setRotationPoint(0F, -28F, 0F);

		turretModel[47].addShapeBox(-7.5F, -12F, -19.75F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F); // Box 332
		turretModel[47].setRotationPoint(0F, -28F, 0F);

		turretModel[48].addShapeBox(1F, -17.5F, -20F, 1, 10, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 341
		turretModel[48].setRotationPoint(0F, -28F, 0F);

		turretModel[49].addShapeBox(1F, -17.5F, -23F, 1, 10, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 342
		turretModel[49].setRotationPoint(0F, -28F, 0F);

		turretModel[50].addShapeBox(1F, -17.5F, -16F, 1, 10, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 343
		turretModel[50].setRotationPoint(0F, -28F, 0F);

		turretModel[51].addShapeBox(2F, -17.5F, -23F, 2, 10, 4, 0F,0F, -4F, 0F, 0F, -4.5F, -3F, 0F, -3F, 0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -4F, -3F, 0F, -2.5F, 0.5F, 0F, 0.5F, -0.5F); // Box 344
		turretModel[51].setRotationPoint(0F, -28F, 0F);

		turretModel[52].addShapeBox(2F, -17.5F, -20F, 2, 10, 5, 0F,0F, 0F, -0.5F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2.5F, -1.5F, 0F, -2.5F, -1.5F, 0F, 0.5F, -0.5F); // Box 345
		turretModel[52].setRotationPoint(0F, -28F, 0F);

		turretModel[53].addShapeBox(2F, -17.5F, -16F, 2, 10, 4, 0F,0F, 0F, -0.5F, 0F, -3F, 0.5F, 0F, -4.5F, -3F, 0F, -4F, 0F, 0F, 0.5F, -0.5F, 0F, -2.5F, 0.5F, 0F, -4F, -3F, 0F, -3.5F, 0F); // Box 346
		turretModel[53].setRotationPoint(0F, -28F, 0F);

		turretModel[54].addShapeBox(-1F, -17.5F, -23F, 2, 10, 4, 0F,0F, -4.5F, -3F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0.5F, 0F, -4F, -3F, 0F, -3.5F, 0F, 0F, 0.5F, -0.5F, 0F, -2.5F, 0.5F); // Box 347
		turretModel[54].setRotationPoint(0F, -28F, 0F);

		turretModel[55].addShapeBox(-1F, -17.5F, -16F, 2, 10, 4, 0F,0F, -3F, 0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4.5F, -3F, 0F, -2.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, -3.5F, 0F, 0F, -4F, -3F); // Box 348
		turretModel[55].setRotationPoint(0F, -28F, 0F);

		turretModel[56].addShapeBox(-1F, -17.5F, -20F, 2, 10, 5, 0F,0F, -3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -1.5F, 0F, -2.5F, -1.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -2.5F, -1.5F); // Box 349
		turretModel[56].setRotationPoint(0F, -28F, 0F);

		turretModel[57].addShapeBox(-3.5F, -13.5F, -18.75F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		turretModel[57].setRotationPoint(0F, -28F, 0F);

		turretModel[58].addShapeBox(-3F, -15F, -18.25F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		turretModel[58].setRotationPoint(0F, -28F, 0F);

		turretModel[59].addShapeBox(-3F, -15.6F, -18.25F, 1, 1, 1, 0F,0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F); // Box 353
		turretModel[59].setRotationPoint(0F, -28F, 0F);

		turretModel[60].addShapeBox(-4.5F, -14F, -18.25F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		turretModel[60].setRotationPoint(0F, -28F, 0F);

		turretModel[61].addShapeBox(-3F, -14F, -18.25F, 1, 1, 1, 0F,0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F); // Box 355
		turretModel[61].setRotationPoint(0F, -28F, 0F);

		turretModel[62].addShapeBox(-3F, -13F, -17F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		turretModel[62].setRotationPoint(0F, -28F, 0F);

		turretModel[63].addShapeBox(-5.9F, -12F, -15F, 1, 1, 3, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 357
		turretModel[63].setRotationPoint(0F, -28F, 0F);

		turretModel[64].addShapeBox(-5F, -12F, -16F, 4, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F); // Box 358
		turretModel[64].setRotationPoint(0F, -28F, 0F);

		turretModel[65].addShapeBox(-5.9F, -12F, -12F, 1, 1, 4, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, -2F, -1F, -1.7F, -2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 2.3F, 2F, -1F, -1.7F, 2F, 0F); // Box 360
		turretModel[65].setRotationPoint(0F, -28F, 0F);

		turretModel[66].addShapeBox(-3.5F, -12.5F, -14.75F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		turretModel[66].setRotationPoint(0F, -28F, 0F);

		turretModel[67].addShapeBox(-3F, -12F, -15F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		turretModel[67].setRotationPoint(0F, -28F, 0F);

		turretModel[68].addShapeBox(0F, -12F, 6.7F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		turretModel[68].setRotationPoint(0F, -28F, 0F);

		turretModel[69].addShapeBox(0.5F, -13F, 7.2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		turretModel[69].setRotationPoint(0F, -28F, 0F);

		turretModel[70].addShapeBox(-11F, -12F, -6.3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		turretModel[70].setRotationPoint(0F, -28F, 0F);

		turretModel[71].addShapeBox(-10.5F, -13F, -5.8F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		turretModel[71].setRotationPoint(0F, -28F, 0F);

		turretModel[72].addShapeBox(-10.5F, -25F, -5.8F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 368
		turretModel[72].setRotationPoint(0F, -28F, 0F);

		turretModel[73].addShapeBox(-10.5F, -37F, -5.8F, 1, 12, 1, 0F,0.7F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 369
		turretModel[73].setRotationPoint(0F, -28F, 0F);

		turretModel[74].addShapeBox(0.5F, -25F, 7.2F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 370
		turretModel[74].setRotationPoint(0F, -28F, 0F);

		turretModel[75].addShapeBox(0.5F, -37F, 7.2F, 1, 12, 1, 0F,0.7F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 371
		turretModel[75].setRotationPoint(0F, -28F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 326
		barrelModel[1] = new ModelRendererTurbo(this, 873, 145, textureX, textureY); // Box 336
		barrelModel[2] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 263
		barrelModel[3] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 264
		barrelModel[4] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 265
		barrelModel[5] = new ModelRendererTurbo(this, 857, 145, textureX, textureY); // Box 269
		barrelModel[6] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 270
		barrelModel[7] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 271
		barrelModel[8] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 272
		barrelModel[9] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 273
		barrelModel[10] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 274
		barrelModel[11] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Box 275
		barrelModel[12] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 276
		barrelModel[13] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Box 277
		barrelModel[14] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 278
		barrelModel[15] = new ModelRendererTurbo(this, 641, 153, textureX, textureY); // Box 279
		barrelModel[16] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 280
		barrelModel[17] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 281
		barrelModel[18] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 282
		barrelModel[19] = new ModelRendererTurbo(this, 569, 153, textureX, textureY); // Box 283
		barrelModel[20] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 284
		barrelModel[21] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 285
		barrelModel[22] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 286
		barrelModel[23] = new ModelRendererTurbo(this, 849, 137, textureX, textureY); // Box 287
		barrelModel[24] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 289
		barrelModel[25] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 290
		barrelModel[26] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Box 291
		barrelModel[27] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 292
		barrelModel[28] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Box 293
		barrelModel[29] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 294
		barrelModel[30] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 295
		barrelModel[31] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 296
		barrelModel[32] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 297
		barrelModel[33] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 298
		barrelModel[34] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 299
		barrelModel[35] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 300
		barrelModel[36] = new ModelRendererTurbo(this, 681, 153, textureX, textureY); // Box 301
		barrelModel[37] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 302
		barrelModel[38] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 303
		barrelModel[39] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 308
		barrelModel[40] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 309
		barrelModel[41] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 311
		barrelModel[42] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 312
		barrelModel[43] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 313
		barrelModel[44] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 314
		barrelModel[45] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 315
		barrelModel[46] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 316
		barrelModel[47] = new ModelRendererTurbo(this, 833, 153, textureX, textureY); // Box 317
		barrelModel[48] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 318
		barrelModel[49] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 319
		barrelModel[50] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Box 320
		barrelModel[51] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 321
		barrelModel[52] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 322
		barrelModel[53] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Box 323
		barrelModel[54] = new ModelRendererTurbo(this, 969, 161, textureX, textureY); // Box 324
		barrelModel[55] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 327
		barrelModel[56] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 328
		barrelModel[57] = new ModelRendererTurbo(this, 841, 153, textureX, textureY); // Box 337
		barrelModel[58] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 338
		barrelModel[59] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 339

		barrelModel[0].addShapeBox(1F, -0.5F, -6F, 13, 1, 1, 0F,0F, -7.5F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F); // Box 326
		barrelModel[0].setRotationPoint(5F, -35F, 0F);

		barrelModel[1].addShapeBox(1F, -0.5F, 5F, 13, 1, 1, 0F,0F, -7.5F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F); // Box 336
		barrelModel[1].setRotationPoint(5F, -35F, 0F);

		barrelModel[2].addShapeBox(3.5F, -3.5F, -0.5F, 8, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 263
		barrelModel[2].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[3].addShapeBox(3.5F, -3.5F, -2.25F, 8, 4, 1, 0F,0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 264
		barrelModel[3].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[4].addShapeBox(3.5F, -3.5F, 1.25F, 8, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 265
		barrelModel[4].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[5].addShapeBox(1.7F, -2.9F, -4.5F, 1, 3, 9, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 269
		barrelModel[5].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[6].addShapeBox(1.7F, -4.9F, -4.5F, 1, 2, 9, 0F,-2.5F, 0.2F, 0F, 2F, 0.2F, 0F, 2F, 0.2F, 0F, -2.5F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 270
		barrelModel[6].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[7].addShapeBox(4.2F, -5.4F, -4.5F, 5, 1, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 271
		barrelModel[7].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[8].addShapeBox(9.2F, -5.4F, -0.5F, 1, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 272
		barrelModel[8].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[9].addShapeBox(8.2F, -5F, -4.5F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 2.7F, 0F, -0.3F, 2.7F, 0F, -0.3F, 2.7F, -3F, -0.3F, 2.7F, -3F); // Box 273
		barrelModel[9].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[10].addShapeBox(9.2F, -5F, -0.5F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, -4.9F, -0.3F, 0.7F, -4.9F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F); // Box 274
		barrelModel[10].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[11].addShapeBox(6.2F, -2.2F, -4.5F, 2, 1, 4, 0F,0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F); // Box 275
		barrelModel[11].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[12].addShapeBox(2.4F, -3F, -2.8F, 3, 2, 5, 0F,0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F); // Box 276
		barrelModel[12].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[13].addShapeBox(2.4F, -5.6F, -2.8F, 6, 3, 5, 0F,-2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, -2F, -0.6F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F); // Box 277
		barrelModel[13].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[14].addShapeBox(2F, -0.6F, -4.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		barrelModel[14].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[15].addShapeBox(2F, -0.6F, 3.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		barrelModel[15].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[16].addShapeBox(13F, -0.6F, -4.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		barrelModel[16].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[17].addShapeBox(13F, -0.6F, 1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		barrelModel[17].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[18].addShapeBox(13F, 0.4F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		barrelModel[18].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[19].addShapeBox(0.699999999999999F, -0.9F, -4.5F, 3, 1, 9, 0F,0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 283
		barrelModel[19].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[20].addShapeBox(11F, -1.6F, 3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		barrelModel[20].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[21].addShapeBox(11F, -1.6F, -4.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		barrelModel[21].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[22].addShapeBox(11F, -4.6F, 4.2F, 1, 4, 1, 0F,0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 286
		barrelModel[22].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[23].addShapeBox(11F, -4.6F, -5.2F, 1, 4, 1, 0F,0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 287
		barrelModel[23].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[24].addShapeBox(3F, -6.6F, -5.2F, 6, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.6F, 0F, -0.3F, 0.6F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 289
		barrelModel[24].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[25].addShapeBox(9F, -6.6F, -5.2F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.2F, 0F, -0.3F, 1.2F, 0F, -0.3F, 1.2F, 0F, -0.3F, -1.2F, 0F, -0.3F); // Box 290
		barrelModel[25].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[26].addShapeBox(9F, -6.6F, 4.2F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1.2F, 0F, -0.3F, 1.2F, 0F, -0.3F, 1.2F, 0F, -0.3F, -1.2F, 0F, -0.3F); // Box 291
		barrelModel[26].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[27].addShapeBox(3F, -6.6F, 4.2F, 6, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.6F, 0F, -0.3F, 0.6F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 292
		barrelModel[27].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[28].addShapeBox(2F, -6.6F, -6.2F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 293
		barrelModel[28].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[29].addShapeBox(2F, -6.6F, 3.2F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 294
		barrelModel[29].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[30].addShapeBox(1F, -6.7F, 4.8F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 295
		barrelModel[30].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[31].addShapeBox(0F, -6.7F, 4.8F, 1, 1, 1, 0F,0.2F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -1.2F, 0.2F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -1.2F); // Box 296
		barrelModel[31].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[32].addShapeBox(0F, -6.7F, -5.7F, 1, 1, 1, 0F,0.2F, -0.2F, -1.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, 0.8F, 0.2F, -0.2F, -1.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, 0.8F); // Box 297
		barrelModel[32].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[33].addShapeBox(1F, -6.7F, -5.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 298
		barrelModel[33].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[34].addShapeBox(-3.2F, -6.7F, -4.7F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 299
		barrelModel[34].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[35].addShapeBox(-3.2F, -6.7F, 3.8F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 300
		barrelModel[35].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[36].addShapeBox(-3.2F, -6.7F, 1.2F, 3, 1, 3, 0F,0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 301
		barrelModel[36].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[37].addShapeBox(-3.2F, -6.7F, -4.1F, 3, 1, 3, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 302
		barrelModel[37].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[38].addShapeBox(-3.2F, -7.5F, -0.95F, 3, 1, 2, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 303
		barrelModel[38].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[39].addShapeBox(19.75F, -3.6F, -0.5F, 1, 4, 1, 0F,-0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 308
		barrelModel[39].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[40].addShapeBox(19.75F, -3.6F, -1.6F, 1, 4, 1, 0F,-0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 309
		barrelModel[40].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[41].addShapeBox(19.75F, -3.6F, 0.6F, 1, 4, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F); // Box 311
		barrelModel[41].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[42].addShapeBox(31.75F, -3.6F, 0.6F, 1, 4, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F); // Box 312
		barrelModel[42].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[43].addShapeBox(31.75F, -3.6F, -0.5F, 1, 4, 1, 0F,-0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 313
		barrelModel[43].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[44].addShapeBox(31.75F, -3.6F, -1.6F, 1, 4, 1, 0F,-0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 314
		barrelModel[44].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[45].addShapeBox(34.75F, -3.6F, 0.6F, 1, 4, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F); // Box 315
		barrelModel[45].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[46].addShapeBox(34.75F, -3.6F, -0.5F, 1, 4, 1, 0F,-0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 316
		barrelModel[46].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[47].addShapeBox(34.75F, -3.6F, -1.6F, 1, 4, 1, 0F,-0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 317
		barrelModel[47].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[48].addShapeBox(10.75F, -3.2F, -0.5F, 26, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 318
		barrelModel[48].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[49].addShapeBox(10.75F, -1.2F, -0.5F, 26, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 319
		barrelModel[49].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[50].addShapeBox(10.75F, -2.2F, -0.5F, 26, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 320
		barrelModel[50].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[51].addShapeBox(10.75F, -2.6F, 0.4F, 26, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 321
		barrelModel[51].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[52].addShapeBox(10.75F, -1.6F, 0.4F, 26, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 322
		barrelModel[52].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[53].addShapeBox(10.75F, -1.6F, -1.4F, 26, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 323
		barrelModel[53].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[54].addShapeBox(10.75F, -2.6F, -1.4F, 26, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 324
		barrelModel[54].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[55].addShapeBox(14F, -0.6F, -4.5F, 1, 1, 1, 0F,0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 327
		barrelModel[55].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[56].addShapeBox(14F, -0.6F, 3.5F, 1, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F); // Box 328
		barrelModel[56].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[57].addShapeBox(-3.75F, -10.5F, -1.6F, 4, 4, 1, 0F,-0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 337
		barrelModel[57].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[58].addShapeBox(-3.75F, -10.5F, -0.5F, 4, 4, 1, 0F,-0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 338
		barrelModel[58].setRotationPoint(5F, -35.5F, 0F);

		barrelModel[59].addShapeBox(-3.75F, -10.5F, 0.6F, 4, 4, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F); // Box 339
		barrelModel[59].setRotationPoint(5F, -35.5F, 0F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 242
		leftTrackModel[1] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 243
		leftTrackModel[2] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 244
		leftTrackModel[3] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 201
		leftTrackModel[4] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 202
		leftTrackModel[5] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 203
		leftTrackModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 231
		leftTrackModel[7] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 232
		leftTrackModel[8] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 233
		leftTrackModel[9] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 234
		leftTrackModel[10] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 235
		leftTrackModel[11] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 236
		leftTrackModel[12] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 237
		leftTrackModel[13] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 238
		leftTrackModel[14] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 239
		leftTrackModel[15] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 240
		leftTrackModel[16] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 241
		leftTrackModel[17] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 242
		leftTrackModel[18] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 243

		leftTrackModel[0].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 242
		leftTrackModel[0].setRotationPoint(45.3F, -2.8F, 23.5F);

		leftTrackModel[1].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 243
		leftTrackModel[1].setRotationPoint(45.3F, -2.8F, 23.5F);

		leftTrackModel[2].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 244
		leftTrackModel[2].setRotationPoint(45.3F, -2.8F, 23.5F);

		leftTrackModel[3].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 201
		leftTrackModel[3].setRotationPoint(-30.3F, -1F, 23.5F);

		leftTrackModel[4].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 202
		leftTrackModel[4].setRotationPoint(-30.3F, -1F, 23.5F);

		leftTrackModel[5].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 203
		leftTrackModel[5].setRotationPoint(-30.3F, -1F, 23.5F);

		leftTrackModel[6].addShapeBox(-6.5F, 1.5F, -6.5F, 51, 1, 7, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 3F, 0.8F, 0F, 3F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 231
		leftTrackModel[6].setRotationPoint(-11.1F, 4.7F, 22.5F);

		leftTrackModel[7].addShapeBox(-6.5F, 1.5F, -6.5F, 57, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 232
		leftTrackModel[7].setRotationPoint(-16.1F, -7.8F, 22.5F);

		leftTrackModel[8].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 233
		leftTrackModel[8].setRotationPoint(-14.1F, 4.7F, 22.5F);

		leftTrackModel[9].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 1, 7, 0F,0.8F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, 1F, 0F, 0F, -0.2F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, 0F, -0.2F, 0F); // Box 234
		leftTrackModel[9].setRotationPoint(-27.1F, 1.7F, 22.5F);

		leftTrackModel[10].addShapeBox(-3.5F, 1.5F, -6.5F, 12, 1, 7, 0F,0F, -3F, 0F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 0F, -3F, 0F, 0F, 3.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 3.8F, 0F); // Box 235
		leftTrackModel[10].setRotationPoint(39.9F, 1.7F, 22.5F);

		leftTrackModel[11].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,-2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F); // Box 236
		leftTrackModel[11].setRotationPoint(54.9F, -4.3F, 22.5F);

		leftTrackModel[12].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,2F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0.6F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F); // Box 237
		leftTrackModel[12].setRotationPoint(54.9F, -9.3F, 22.5F);

		leftTrackModel[13].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 238
		leftTrackModel[13].setRotationPoint(-28.1F, -2.3F, 22.5F);

		leftTrackModel[14].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,-0.4F, 0F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, -0.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F); // Box 239
		leftTrackModel[14].setRotationPoint(-28.1F, -7.3F, 22.5F);

		leftTrackModel[15].addShapeBox(-6.5F, 1.5F, -6.5F, 7, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 240
		leftTrackModel[15].setRotationPoint(-23.1F, -7.8F, 22.5F);

		leftTrackModel[16].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 241
		leftTrackModel[16].setRotationPoint(-26.1F, -8.2F, 22.5F);

		leftTrackModel[17].addShapeBox(-6.5F, 1.5F, -6.5F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.8F, 0F); // Box 242
		leftTrackModel[17].setRotationPoint(40.9F, -7.8F, 22.5F);

		leftTrackModel[18].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 243
		leftTrackModel[18].setRotationPoint(49.9F, -10F, 22.5F);
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
		rightTrackModel[13] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 416
		rightTrackModel[14] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 417
		rightTrackModel[15] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 418
		rightTrackModel[16] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 425
		rightTrackModel[17] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 426
		rightTrackModel[18] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 427
		rightTrackModel[19] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 431
		rightTrackModel[20] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 432
		rightTrackModel[21] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 433
		rightTrackModel[22] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 434
		rightTrackModel[23] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 437
		rightTrackModel[24] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 438
		rightTrackModel[25] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 439
		rightTrackModel[26] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 440
		rightTrackModel[27] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 441
		rightTrackModel[28] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 442
		rightTrackModel[29] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 443
		rightTrackModel[30] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 444
		rightTrackModel[31] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 445
		rightTrackModel[32] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 446
		rightTrackModel[33] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 449
		rightTrackModel[34] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 451
		rightTrackModel[35] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 453
		rightTrackModel[36] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 454
		rightTrackModel[37] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 455
		rightTrackModel[38] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 456
		rightTrackModel[39] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 457
		rightTrackModel[40] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 458
		rightTrackModel[41] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 459
		rightTrackModel[42] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 460
		rightTrackModel[43] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 461
		rightTrackModel[44] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 462
		rightTrackModel[45] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 463
		rightTrackModel[46] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 464
		rightTrackModel[47] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 465
		rightTrackModel[48] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 466
		rightTrackModel[49] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 467
		rightTrackModel[50] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 468
		rightTrackModel[51] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 469
		rightTrackModel[52] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 470
		rightTrackModel[53] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 471
		rightTrackModel[54] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 472
		rightTrackModel[55] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 473
		rightTrackModel[56] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 474
		rightTrackModel[57] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 475
		rightTrackModel[58] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 476
		rightTrackModel[59] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 477
		rightTrackModel[60] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 478
		rightTrackModel[61] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 479
		rightTrackModel[62] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 480
		rightTrackModel[63] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 481
		rightTrackModel[64] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 482
		rightTrackModel[65] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 483
		rightTrackModel[66] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 484
		rightTrackModel[67] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 485
		rightTrackModel[68] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 486
		rightTrackModel[69] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 487
		rightTrackModel[70] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 488
		rightTrackModel[71] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 489
		rightTrackModel[72] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 490
		rightTrackModel[73] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 491
		rightTrackModel[74] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 492
		rightTrackModel[75] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 493
		rightTrackModel[76] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 494
		rightTrackModel[77] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 495
		rightTrackModel[78] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 496
		rightTrackModel[79] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 497
		rightTrackModel[80] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 498
		rightTrackModel[81] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 499
		rightTrackModel[82] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 500
		rightTrackModel[83] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 501
		rightTrackModel[84] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 502
		rightTrackModel[85] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 503
		rightTrackModel[86] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 504
		rightTrackModel[87] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 505
		rightTrackModel[88] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 506
		rightTrackModel[89] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Box 507
		rightTrackModel[90] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 508
		rightTrackModel[91] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 509
		rightTrackModel[92] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 510
		rightTrackModel[93] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 511
		rightTrackModel[94] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 512
		rightTrackModel[95] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 513
		rightTrackModel[96] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 514
		rightTrackModel[97] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 515
		rightTrackModel[98] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 516
		rightTrackModel[99] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 517
		rightTrackModel[100] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 518
		rightTrackModel[101] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 519
		rightTrackModel[102] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 520
		rightTrackModel[103] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 521
		rightTrackModel[104] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 522
		rightTrackModel[105] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 523
		rightTrackModel[106] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 524
		rightTrackModel[107] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 525
		rightTrackModel[108] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 526
		rightTrackModel[109] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 527
		rightTrackModel[110] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 528
		rightTrackModel[111] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 529
		rightTrackModel[112] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 530
		rightTrackModel[113] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 531
		rightTrackModel[114] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 532
		rightTrackModel[115] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 533
		rightTrackModel[116] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 534
		rightTrackModel[117] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 535
		rightTrackModel[118] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 536
		rightTrackModel[119] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 537
		rightTrackModel[120] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 538
		rightTrackModel[121] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 539
		rightTrackModel[122] = new ModelRendererTurbo(this, 737, 97, textureX, textureY); // Box 540
		rightTrackModel[123] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 541
		rightTrackModel[124] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 542
		rightTrackModel[125] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 543
		rightTrackModel[126] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 544
		rightTrackModel[127] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 545
		rightTrackModel[128] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 546
		rightTrackModel[129] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 547
		rightTrackModel[130] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 548
		rightTrackModel[131] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 549
		rightTrackModel[132] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 550
		rightTrackModel[133] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 551
		rightTrackModel[134] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 552
		rightTrackModel[135] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 553
		rightTrackModel[136] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 554
		rightTrackModel[137] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 555
		rightTrackModel[138] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 556
		rightTrackModel[139] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 557
		rightTrackModel[140] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 558
		rightTrackModel[141] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 559
		rightTrackModel[142] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 560
		rightTrackModel[143] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 561
		rightTrackModel[144] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 562
		rightTrackModel[145] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 563
		rightTrackModel[146] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 564
		rightTrackModel[147] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 565
		rightTrackModel[148] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Box 566
		rightTrackModel[149] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 567
		rightTrackModel[150] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 568
		rightTrackModel[151] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 569
		rightTrackModel[152] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 570
		rightTrackModel[153] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 571
		rightTrackModel[154] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 572
		rightTrackModel[155] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 573
		rightTrackModel[156] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 574
		rightTrackModel[157] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 575
		rightTrackModel[158] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 576
		rightTrackModel[159] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 577
		rightTrackModel[160] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 578
		rightTrackModel[161] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 579
		rightTrackModel[162] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 580
		rightTrackModel[163] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 581
		rightTrackModel[164] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 582
		rightTrackModel[165] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 583
		rightTrackModel[166] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 584
		rightTrackModel[167] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 585
		rightTrackModel[168] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 586
		rightTrackModel[169] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 587
		rightTrackModel[170] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 588
		rightTrackModel[171] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 589
		rightTrackModel[172] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 590
		rightTrackModel[173] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 591
		rightTrackModel[174] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 592
		rightTrackModel[175] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 593
		rightTrackModel[176] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 594
		rightTrackModel[177] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 595
		rightTrackModel[178] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 596
		rightTrackModel[179] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 597
		rightTrackModel[180] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 598
		rightTrackModel[181] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 599
		rightTrackModel[182] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 600
		rightTrackModel[183] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 601
		rightTrackModel[184] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 602
		rightTrackModel[185] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 603
		rightTrackModel[186] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 604
		rightTrackModel[187] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 605
		rightTrackModel[188] = new ModelRendererTurbo(this, 529, 113, textureX, textureY); // Box 606
		rightTrackModel[189] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 607
		rightTrackModel[190] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 608
		rightTrackModel[191] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 609
		rightTrackModel[192] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 610
		rightTrackModel[193] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 611
		rightTrackModel[194] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 612
		rightTrackModel[195] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 613
		rightTrackModel[196] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 614
		rightTrackModel[197] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 615
		rightTrackModel[198] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 616
		rightTrackModel[199] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 617
		rightTrackModel[200] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 618
		rightTrackModel[201] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Box 619
		rightTrackModel[202] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 620
		rightTrackModel[203] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 621
		rightTrackModel[204] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 622
		rightTrackModel[205] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 623
		rightTrackModel[206] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 624
		rightTrackModel[207] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 625
		rightTrackModel[208] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 626
		rightTrackModel[209] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 627
		rightTrackModel[210] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 628
		rightTrackModel[211] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 629
		rightTrackModel[212] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 630
		rightTrackModel[213] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 631
		rightTrackModel[214] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 632
		rightTrackModel[215] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 633
		rightTrackModel[216] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 634
		rightTrackModel[217] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 635
		rightTrackModel[218] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 636
		rightTrackModel[219] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 637
		rightTrackModel[220] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 638
		rightTrackModel[221] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 639
		rightTrackModel[222] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 640
		rightTrackModel[223] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 641
		rightTrackModel[224] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 642
		rightTrackModel[225] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 643
		rightTrackModel[226] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 644
		rightTrackModel[227] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 645
		rightTrackModel[228] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 646
		rightTrackModel[229] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 647
		rightTrackModel[230] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 648
		rightTrackModel[231] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 649
		rightTrackModel[232] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 650
		rightTrackModel[233] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 651
		rightTrackModel[234] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 652
		rightTrackModel[235] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 653
		rightTrackModel[236] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 654
		rightTrackModel[237] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 655
		rightTrackModel[238] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 656
		rightTrackModel[239] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 657
		rightTrackModel[240] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 658
		rightTrackModel[241] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 659
		rightTrackModel[242] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Box 660
		rightTrackModel[243] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 661
		rightTrackModel[244] = new ModelRendererTurbo(this, 617, 121, textureX, textureY); // Box 662
		rightTrackModel[245] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 663
		rightTrackModel[246] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 664
		rightTrackModel[247] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 665
		rightTrackModel[248] = new ModelRendererTurbo(this, 673, 121, textureX, textureY); // Box 666
		rightTrackModel[249] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 667
		rightTrackModel[250] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 668
		rightTrackModel[251] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 669
		rightTrackModel[252] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 670
		rightTrackModel[253] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Box 671
		rightTrackModel[254] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 672
		rightTrackModel[255] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 673
		rightTrackModel[256] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 674
		rightTrackModel[257] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 675
		rightTrackModel[258] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 676
		rightTrackModel[259] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 677
		rightTrackModel[260] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 678
		rightTrackModel[261] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 679
		rightTrackModel[262] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Box 680
		rightTrackModel[263] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 681
		rightTrackModel[264] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Box 682
		rightTrackModel[265] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 683
		rightTrackModel[266] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 684
		rightTrackModel[267] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 685
		rightTrackModel[268] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 686
		rightTrackModel[269] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 687
		rightTrackModel[270] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 688
		rightTrackModel[271] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 689
		rightTrackModel[272] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 690
		rightTrackModel[273] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 691
		rightTrackModel[274] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 692
		rightTrackModel[275] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 693
		rightTrackModel[276] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 694
		rightTrackModel[277] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 695
		rightTrackModel[278] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 696
		rightTrackModel[279] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 576
		rightTrackModel[280] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 577

		rightTrackModel[0].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 244
		rightTrackModel[0].setRotationPoint(49.9F, -10F, -16.8F);

		rightTrackModel[1].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,2F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0.6F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F); // Box 245
		rightTrackModel[1].setRotationPoint(54.9F, -9.3F, -16.8F);

		rightTrackModel[2].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,-2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F); // Box 246
		rightTrackModel[2].setRotationPoint(54.9F, -4.3F, -16.8F);

		rightTrackModel[3].addShapeBox(-3.5F, 1.5F, -6.5F, 12, 1, 7, 0F,0F, -3F, 0F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 0F, -3F, 0F, 0F, 3.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 3.8F, 0F); // Box 247
		rightTrackModel[3].setRotationPoint(39.9F, 1.7F, -16.8F);

		rightTrackModel[4].addShapeBox(-6.5F, 1.5F, -6.5F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.8F, 0F); // Box 248
		rightTrackModel[4].setRotationPoint(40.9F, -7.8F, -16.8F);

		rightTrackModel[5].addShapeBox(-6.5F, 1.5F, -6.5F, 57, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 249
		rightTrackModel[5].setRotationPoint(-16.1F, -7.8F, -16.8F);

		rightTrackModel[6].addShapeBox(-6.5F, 1.5F, -6.5F, 51, 1, 7, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 3F, 0.8F, 0F, 3F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 250
		rightTrackModel[6].setRotationPoint(-11.1F, 4.7F, -16.8F);

		rightTrackModel[7].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 1, 7, 0F,0.8F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, 1F, 0F, 0F, -0.2F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, 0F, -0.2F, 0F); // Box 251
		rightTrackModel[7].setRotationPoint(-27.1F, 1.7F, -16.8F);

		rightTrackModel[8].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 252
		rightTrackModel[8].setRotationPoint(-14.1F, 4.7F, -16.8F);

		rightTrackModel[9].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 253
		rightTrackModel[9].setRotationPoint(-28.1F, -2.3F, -16.8F);

		rightTrackModel[10].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,-0.4F, 0F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, -0.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F); // Box 254
		rightTrackModel[10].setRotationPoint(-28.1F, -7.3F, -16.8F);

		rightTrackModel[11].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 255
		rightTrackModel[11].setRotationPoint(-26.1F, -8.2F, -16.8F);

		rightTrackModel[12].addShapeBox(-6.5F, 1.5F, -6.5F, 7, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 256
		rightTrackModel[12].setRotationPoint(-23.1F, -7.8F, -16.8F);

		rightTrackModel[13].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 416
		rightTrackModel[13].setRotationPoint(45.3F, -2.8F, -15.5F);

		rightTrackModel[14].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 417
		rightTrackModel[14].setRotationPoint(45.3F, -2.8F, -15.5F);

		rightTrackModel[15].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 418
		rightTrackModel[15].setRotationPoint(45.3F, -2.8F, -15.5F);

		rightTrackModel[16].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 425
		rightTrackModel[16].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[17].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 426
		rightTrackModel[17].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[18].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 427
		rightTrackModel[18].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[19].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 431
		rightTrackModel[19].setRotationPoint(-30.3F, -1F, -15.5F);

		rightTrackModel[20].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 432
		rightTrackModel[20].setRotationPoint(-30.3F, -1F, -15.5F);

		rightTrackModel[21].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 433
		rightTrackModel[21].setRotationPoint(-30.3F, -1F, -15.5F);

		rightTrackModel[22].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		rightTrackModel[22].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[23].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 437
		rightTrackModel[23].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[24].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 438
		rightTrackModel[24].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[25].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 439
		rightTrackModel[25].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[26].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 440
		rightTrackModel[26].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[27].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 441
		rightTrackModel[27].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[28].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 442
		rightTrackModel[28].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[29].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 443
		rightTrackModel[29].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[30].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 444
		rightTrackModel[30].setRotationPoint(-4.5F, 0.8F, -15.5F);
		rightTrackModel[30].rotateAngleZ = -0.75049158F;

		rightTrackModel[31].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 445
		rightTrackModel[31].setRotationPoint(-4.5F, 0.8F, -15.5F);
		rightTrackModel[31].rotateAngleZ = 0.75049158F;

		rightTrackModel[32].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 446
		rightTrackModel[32].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[33].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		rightTrackModel[33].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[34].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 451
		rightTrackModel[34].setRotationPoint(-4.5F, 0.8F, -15.5F);
		rightTrackModel[34].rotateAngleZ = 0.75049158F;

		rightTrackModel[35].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 453
		rightTrackModel[35].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[36].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 454
		rightTrackModel[36].setRotationPoint(-4.5F, 0.8F, -15.5F);
		rightTrackModel[36].rotateAngleZ = -0.75049158F;

		rightTrackModel[37].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 455
		rightTrackModel[37].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[38].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 456
		rightTrackModel[38].setRotationPoint(-4.5F, 0.8F, -15.5F);
		rightTrackModel[38].rotateAngleZ = -0.75049158F;

		rightTrackModel[39].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 457
		rightTrackModel[39].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[40].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 458
		rightTrackModel[40].setRotationPoint(-4.5F, 0.8F, -15.5F);
		rightTrackModel[40].rotateAngleZ = 0.75049158F;

		rightTrackModel[41].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 459
		rightTrackModel[41].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[42].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 460
		rightTrackModel[42].setRotationPoint(-4.5F, 0.8F, -15.5F);
		rightTrackModel[42].rotateAngleZ = 0.75049158F;

		rightTrackModel[43].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackModel[43].setRotationPoint(-4.5F, 0.8F, -15.5F);

		rightTrackModel[44].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 462
		rightTrackModel[44].setRotationPoint(-4.5F, 0.8F, -15.5F);
		rightTrackModel[44].rotateAngleZ = -0.75049158F;

		rightTrackModel[45].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 463
		rightTrackModel[45].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[46].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 464
		rightTrackModel[46].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[47].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 465
		rightTrackModel[47].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[48].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightTrackModel[48].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[49].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 467
		rightTrackModel[49].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[50].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 468
		rightTrackModel[50].setRotationPoint(-18F, 0.8F, -15.5F);
		rightTrackModel[50].rotateAngleZ = -0.75049158F;

		rightTrackModel[51].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 469
		rightTrackModel[51].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[52].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 470
		rightTrackModel[52].setRotationPoint(-18F, 0.8F, -15.5F);
		rightTrackModel[52].rotateAngleZ = 0.75049158F;

		rightTrackModel[53].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 471
		rightTrackModel[53].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[54].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 472
		rightTrackModel[54].setRotationPoint(-18F, 0.8F, -15.5F);
		rightTrackModel[54].rotateAngleZ = -0.75049158F;

		rightTrackModel[55].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		rightTrackModel[55].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[56].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 474
		rightTrackModel[56].setRotationPoint(-18F, 0.8F, -15.5F);
		rightTrackModel[56].rotateAngleZ = 0.75049158F;

		rightTrackModel[57].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 475
		rightTrackModel[57].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[58].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 476
		rightTrackModel[58].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[59].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 477
		rightTrackModel[59].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[60].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 478
		rightTrackModel[60].setRotationPoint(-18F, 0.8F, -15.5F);
		rightTrackModel[60].rotateAngleZ = -0.75049158F;

		rightTrackModel[61].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 479
		rightTrackModel[61].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[62].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 480
		rightTrackModel[62].setRotationPoint(-18F, 0.8F, -15.5F);
		rightTrackModel[62].rotateAngleZ = 0.75049158F;

		rightTrackModel[63].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		rightTrackModel[63].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[64].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 482
		rightTrackModel[64].setRotationPoint(-18F, 0.8F, -15.5F);
		rightTrackModel[64].rotateAngleZ = -0.75049158F;

		rightTrackModel[65].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 483
		rightTrackModel[65].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[66].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 484
		rightTrackModel[66].setRotationPoint(-18F, 0.8F, -15.5F);
		rightTrackModel[66].rotateAngleZ = 0.75049158F;

		rightTrackModel[67].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 485
		rightTrackModel[67].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[68].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 486
		rightTrackModel[68].setRotationPoint(-18F, -11.2F, -15.5F);

		rightTrackModel[69].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 487
		rightTrackModel[69].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[70].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 488
		rightTrackModel[70].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[71].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 489
		rightTrackModel[71].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[72].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 490
		rightTrackModel[72].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[73].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 491
		rightTrackModel[73].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[74].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		rightTrackModel[74].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[75].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 493
		rightTrackModel[75].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[76].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 494
		rightTrackModel[76].setRotationPoint(8F, 0.8F, -15.5F);
		rightTrackModel[76].rotateAngleZ = -0.75049158F;

		rightTrackModel[77].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 495
		rightTrackModel[77].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[78].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 496
		rightTrackModel[78].setRotationPoint(8F, 0.8F, -15.5F);
		rightTrackModel[78].rotateAngleZ = 0.75049158F;

		rightTrackModel[79].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 497
		rightTrackModel[79].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[80].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 498
		rightTrackModel[80].setRotationPoint(8F, 0.8F, -15.5F);
		rightTrackModel[80].rotateAngleZ = -0.75049158F;

		rightTrackModel[81].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		rightTrackModel[81].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[82].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 500
		rightTrackModel[82].setRotationPoint(8F, 0.8F, -15.5F);
		rightTrackModel[82].rotateAngleZ = 0.75049158F;

		rightTrackModel[83].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 501
		rightTrackModel[83].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[84].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 502
		rightTrackModel[84].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[85].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 503
		rightTrackModel[85].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[86].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 504
		rightTrackModel[86].setRotationPoint(8F, 0.8F, -15.5F);
		rightTrackModel[86].rotateAngleZ = -0.75049158F;

		rightTrackModel[87].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 505
		rightTrackModel[87].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[88].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 506
		rightTrackModel[88].setRotationPoint(8F, 0.8F, -15.5F);
		rightTrackModel[88].rotateAngleZ = 0.75049158F;

		rightTrackModel[89].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		rightTrackModel[89].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[90].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 508
		rightTrackModel[90].setRotationPoint(8F, 0.8F, -15.5F);
		rightTrackModel[90].rotateAngleZ = -0.75049158F;

		rightTrackModel[91].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 509
		rightTrackModel[91].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[92].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 510
		rightTrackModel[92].setRotationPoint(8F, 0.8F, -15.5F);
		rightTrackModel[92].rotateAngleZ = 0.75049158F;

		rightTrackModel[93].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 511
		rightTrackModel[93].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[94].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 512
		rightTrackModel[94].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[95].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 513
		rightTrackModel[95].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[96].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 514
		rightTrackModel[96].setRotationPoint(8F, 0.8F, -15.5F);

		rightTrackModel[97].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 515
		rightTrackModel[97].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[98].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 516
		rightTrackModel[98].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[99].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 517
		rightTrackModel[99].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[100].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		rightTrackModel[100].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[101].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 519
		rightTrackModel[101].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[102].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 520
		rightTrackModel[102].setRotationPoint(21F, 0.8F, -15.5F);
		rightTrackModel[102].rotateAngleZ = -0.75049158F;

		rightTrackModel[103].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 521
		rightTrackModel[103].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[104].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 522
		rightTrackModel[104].setRotationPoint(21F, 0.8F, -15.5F);
		rightTrackModel[104].rotateAngleZ = 0.75049158F;

		rightTrackModel[105].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 523
		rightTrackModel[105].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[106].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 524
		rightTrackModel[106].setRotationPoint(21F, 0.8F, -15.5F);
		rightTrackModel[106].rotateAngleZ = -0.75049158F;

		rightTrackModel[107].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightTrackModel[107].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[108].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 526
		rightTrackModel[108].setRotationPoint(21F, 0.8F, -15.5F);
		rightTrackModel[108].rotateAngleZ = 0.75049158F;

		rightTrackModel[109].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 527
		rightTrackModel[109].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[110].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 528
		rightTrackModel[110].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[111].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 529
		rightTrackModel[111].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[112].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 530
		rightTrackModel[112].setRotationPoint(21F, 0.8F, -15.5F);
		rightTrackModel[112].rotateAngleZ = -0.75049158F;

		rightTrackModel[113].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 531
		rightTrackModel[113].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[114].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 532
		rightTrackModel[114].setRotationPoint(21F, 0.8F, -15.5F);
		rightTrackModel[114].rotateAngleZ = 0.75049158F;

		rightTrackModel[115].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightTrackModel[115].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[116].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 534
		rightTrackModel[116].setRotationPoint(21F, 0.8F, -15.5F);
		rightTrackModel[116].rotateAngleZ = -0.75049158F;

		rightTrackModel[117].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 535
		rightTrackModel[117].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[118].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 536
		rightTrackModel[118].setRotationPoint(21F, 0.8F, -15.5F);
		rightTrackModel[118].rotateAngleZ = 0.75049158F;

		rightTrackModel[119].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 537
		rightTrackModel[119].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[120].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 538
		rightTrackModel[120].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[121].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 539
		rightTrackModel[121].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[122].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 540
		rightTrackModel[122].setRotationPoint(21F, 0.8F, -15.5F);

		rightTrackModel[123].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 541
		rightTrackModel[123].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[124].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 542
		rightTrackModel[124].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[125].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 543
		rightTrackModel[125].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[126].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		rightTrackModel[126].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[127].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 545
		rightTrackModel[127].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[128].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 546
		rightTrackModel[128].setRotationPoint(34F, 0.8F, -15.5F);
		rightTrackModel[128].rotateAngleZ = -0.75049158F;

		rightTrackModel[129].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 547
		rightTrackModel[129].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[130].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 548
		rightTrackModel[130].setRotationPoint(34F, 0.8F, -15.5F);
		rightTrackModel[130].rotateAngleZ = 0.75049158F;

		rightTrackModel[131].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 549
		rightTrackModel[131].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[132].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 550
		rightTrackModel[132].setRotationPoint(34F, 0.8F, -15.5F);
		rightTrackModel[132].rotateAngleZ = -0.75049158F;

		rightTrackModel[133].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		rightTrackModel[133].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[134].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 552
		rightTrackModel[134].setRotationPoint(34F, 0.8F, -15.5F);
		rightTrackModel[134].rotateAngleZ = 0.75049158F;

		rightTrackModel[135].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 553
		rightTrackModel[135].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[136].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 554
		rightTrackModel[136].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[137].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 555
		rightTrackModel[137].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[138].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 556
		rightTrackModel[138].setRotationPoint(34F, 0.8F, -15.5F);
		rightTrackModel[138].rotateAngleZ = -0.75049158F;

		rightTrackModel[139].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 557
		rightTrackModel[139].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[140].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 558
		rightTrackModel[140].setRotationPoint(34F, 0.8F, -15.5F);
		rightTrackModel[140].rotateAngleZ = 0.75049158F;

		rightTrackModel[141].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightTrackModel[141].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[142].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 560
		rightTrackModel[142].setRotationPoint(34F, 0.8F, -15.5F);
		rightTrackModel[142].rotateAngleZ = -0.75049158F;

		rightTrackModel[143].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 561
		rightTrackModel[143].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[144].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 562
		rightTrackModel[144].setRotationPoint(34F, 0.8F, -15.5F);
		rightTrackModel[144].rotateAngleZ = 0.75049158F;

		rightTrackModel[145].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 563
		rightTrackModel[145].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[146].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 564
		rightTrackModel[146].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[147].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 565
		rightTrackModel[147].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[148].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 566
		rightTrackModel[148].setRotationPoint(34F, 0.8F, -15.5F);

		rightTrackModel[149].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 567
		rightTrackModel[149].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[150].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 568
		rightTrackModel[150].setRotationPoint(34F, 0.8F, 23.5F);
		rightTrackModel[150].rotateAngleZ = 0.75049158F;

		rightTrackModel[151].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		rightTrackModel[151].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[152].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 570
		rightTrackModel[152].setRotationPoint(34F, 0.8F, 23.5F);
		rightTrackModel[152].rotateAngleZ = -0.75049158F;

		rightTrackModel[153].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 571
		rightTrackModel[153].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[154].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 572
		rightTrackModel[154].setRotationPoint(34F, 0.8F, 23.5F);
		rightTrackModel[154].rotateAngleZ = 0.75049158F;

		rightTrackModel[155].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 573
		rightTrackModel[155].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[156].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 574
		rightTrackModel[156].setRotationPoint(34F, 0.8F, 23.5F);
		rightTrackModel[156].rotateAngleZ = -0.75049158F;

		rightTrackModel[157].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 575
		rightTrackModel[157].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[158].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 576
		rightTrackModel[158].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[159].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 577
		rightTrackModel[159].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[160].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		rightTrackModel[160].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[161].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 579
		rightTrackModel[161].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[162].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 580
		rightTrackModel[162].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[163].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 581
		rightTrackModel[163].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[164].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 582
		rightTrackModel[164].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[165].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 583
		rightTrackModel[165].setRotationPoint(34F, 0.8F, 23.5F);
		rightTrackModel[165].rotateAngleZ = 0.75049158F;

		rightTrackModel[166].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 584
		rightTrackModel[166].setRotationPoint(34F, 0.8F, 23.5F);
		rightTrackModel[166].rotateAngleZ = -0.75049158F;

		rightTrackModel[167].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 585
		rightTrackModel[167].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[168].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 586
		rightTrackModel[168].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[169].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 587
		rightTrackModel[169].setRotationPoint(34F, 0.8F, 23.5F);
		rightTrackModel[169].rotateAngleZ = -0.75049158F;

		rightTrackModel[170].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		rightTrackModel[170].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[171].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 589
		rightTrackModel[171].setRotationPoint(34F, 0.8F, 23.5F);
		rightTrackModel[171].rotateAngleZ = 0.75049158F;

		rightTrackModel[172].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 590
		rightTrackModel[172].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[173].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 591
		rightTrackModel[173].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[174].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 592
		rightTrackModel[174].setRotationPoint(34F, 0.8F, 23.5F);

		rightTrackModel[175].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightTrackModel[175].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[176].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 594
		rightTrackModel[176].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[177].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 595
		rightTrackModel[177].setRotationPoint(21F, 0.8F, 23.5F);
		rightTrackModel[177].rotateAngleZ = -0.75049158F;

		rightTrackModel[178].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 596
		rightTrackModel[178].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[179].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 597
		rightTrackModel[179].setRotationPoint(21F, 0.8F, 23.5F);
		rightTrackModel[179].rotateAngleZ = 0.75049158F;

		rightTrackModel[180].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 598
		rightTrackModel[180].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[181].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 599
		rightTrackModel[181].setRotationPoint(21F, 0.8F, 23.5F);
		rightTrackModel[181].rotateAngleZ = -0.75049158F;

		rightTrackModel[182].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		rightTrackModel[182].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[183].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 601
		rightTrackModel[183].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[184].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 602
		rightTrackModel[184].setRotationPoint(21F, 0.8F, 23.5F);
		rightTrackModel[184].rotateAngleZ = 0.75049158F;

		rightTrackModel[185].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 603
		rightTrackModel[185].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[186].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 604
		rightTrackModel[186].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[187].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 605
		rightTrackModel[187].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[188].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 606
		rightTrackModel[188].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[189].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 607
		rightTrackModel[189].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[190].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 608
		rightTrackModel[190].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[191].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 609
		rightTrackModel[191].setRotationPoint(21F, 0.8F, 23.5F);
		rightTrackModel[191].rotateAngleZ = -0.75049158F;

		rightTrackModel[192].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 610
		rightTrackModel[192].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[193].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 611
		rightTrackModel[193].setRotationPoint(21F, 0.8F, 23.5F);
		rightTrackModel[193].rotateAngleZ = -0.75049158F;

		rightTrackModel[194].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 612
		rightTrackModel[194].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[195].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 613
		rightTrackModel[195].setRotationPoint(21F, 0.8F, 23.5F);
		rightTrackModel[195].rotateAngleZ = 0.75049158F;

		rightTrackModel[196].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 614
		rightTrackModel[196].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[197].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		rightTrackModel[197].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[198].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 616
		rightTrackModel[198].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[199].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 617
		rightTrackModel[199].setRotationPoint(21F, 0.8F, 23.5F);

		rightTrackModel[200].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 618
		rightTrackModel[200].setRotationPoint(21F, 0.8F, 23.5F);
		rightTrackModel[200].rotateAngleZ = 0.75049158F;

		rightTrackModel[201].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		rightTrackModel[201].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[202].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 620
		rightTrackModel[202].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[203].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 621
		rightTrackModel[203].setRotationPoint(8F, 0.8F, 23.5F);
		rightTrackModel[203].rotateAngleZ = -0.75049158F;

		rightTrackModel[204].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 622
		rightTrackModel[204].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[205].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 623
		rightTrackModel[205].setRotationPoint(8F, 0.8F, 23.5F);
		rightTrackModel[205].rotateAngleZ = 0.75049158F;

		rightTrackModel[206].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 624
		rightTrackModel[206].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[207].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 625
		rightTrackModel[207].setRotationPoint(8F, 0.8F, 23.5F);
		rightTrackModel[207].rotateAngleZ = -0.75049158F;

		rightTrackModel[208].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		rightTrackModel[208].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[209].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 627
		rightTrackModel[209].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[210].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 628
		rightTrackModel[210].setRotationPoint(8F, 0.8F, 23.5F);
		rightTrackModel[210].rotateAngleZ = 0.75049158F;

		rightTrackModel[211].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 629
		rightTrackModel[211].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[212].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 630
		rightTrackModel[212].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[213].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 631
		rightTrackModel[213].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[214].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 632
		rightTrackModel[214].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[215].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 633
		rightTrackModel[215].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[216].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 634
		rightTrackModel[216].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[217].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 635
		rightTrackModel[217].setRotationPoint(8F, 0.8F, 23.5F);
		rightTrackModel[217].rotateAngleZ = -0.75049158F;

		rightTrackModel[218].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 636
		rightTrackModel[218].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[219].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 637
		rightTrackModel[219].setRotationPoint(8F, 0.8F, 23.5F);
		rightTrackModel[219].rotateAngleZ = -0.75049158F;

		rightTrackModel[220].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 638
		rightTrackModel[220].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[221].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 639
		rightTrackModel[221].setRotationPoint(8F, 0.8F, 23.5F);
		rightTrackModel[221].rotateAngleZ = 0.75049158F;

		rightTrackModel[222].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 640
		rightTrackModel[222].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[223].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		rightTrackModel[223].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[224].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 642
		rightTrackModel[224].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[225].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 643
		rightTrackModel[225].setRotationPoint(8F, 0.8F, 23.5F);

		rightTrackModel[226].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 644
		rightTrackModel[226].setRotationPoint(8F, 0.8F, 23.5F);
		rightTrackModel[226].rotateAngleZ = 0.75049158F;

		rightTrackModel[227].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		rightTrackModel[227].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[228].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 646
		rightTrackModel[228].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[229].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 647
		rightTrackModel[229].setRotationPoint(-5F, 0.8F, 23.5F);
		rightTrackModel[229].rotateAngleZ = -0.75049158F;

		rightTrackModel[230].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 648
		rightTrackModel[230].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[231].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 649
		rightTrackModel[231].setRotationPoint(-5F, 0.8F, 23.5F);
		rightTrackModel[231].rotateAngleZ = 0.75049158F;

		rightTrackModel[232].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 650
		rightTrackModel[232].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[233].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 651
		rightTrackModel[233].setRotationPoint(-5F, 0.8F, 23.5F);
		rightTrackModel[233].rotateAngleZ = -0.75049158F;

		rightTrackModel[234].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		rightTrackModel[234].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[235].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 653
		rightTrackModel[235].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[236].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 654
		rightTrackModel[236].setRotationPoint(-5F, 0.8F, 23.5F);
		rightTrackModel[236].rotateAngleZ = 0.75049158F;

		rightTrackModel[237].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 655
		rightTrackModel[237].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[238].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 656
		rightTrackModel[238].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[239].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 657
		rightTrackModel[239].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[240].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 658
		rightTrackModel[240].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[241].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 659
		rightTrackModel[241].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[242].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 660
		rightTrackModel[242].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[243].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 661
		rightTrackModel[243].setRotationPoint(-5F, 0.8F, 23.5F);
		rightTrackModel[243].rotateAngleZ = -0.75049158F;

		rightTrackModel[244].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 662
		rightTrackModel[244].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[245].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 663
		rightTrackModel[245].setRotationPoint(-5F, 0.8F, 23.5F);
		rightTrackModel[245].rotateAngleZ = -0.75049158F;

		rightTrackModel[246].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 664
		rightTrackModel[246].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[247].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 665
		rightTrackModel[247].setRotationPoint(-5F, 0.8F, 23.5F);
		rightTrackModel[247].rotateAngleZ = 0.75049158F;

		rightTrackModel[248].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 666
		rightTrackModel[248].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[249].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		rightTrackModel[249].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[250].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 668
		rightTrackModel[250].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[251].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 669
		rightTrackModel[251].setRotationPoint(-5F, 0.8F, 23.5F);

		rightTrackModel[252].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 670
		rightTrackModel[252].setRotationPoint(-5F, 0.8F, 23.5F);
		rightTrackModel[252].rotateAngleZ = 0.75049158F;

		rightTrackModel[253].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		rightTrackModel[253].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[254].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 672
		rightTrackModel[254].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[255].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 673
		rightTrackModel[255].setRotationPoint(-18.5F, 0.8F, 23.5F);
		rightTrackModel[255].rotateAngleZ = -0.75049158F;

		rightTrackModel[256].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 674
		rightTrackModel[256].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[257].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 675
		rightTrackModel[257].setRotationPoint(-18.5F, 0.8F, 23.5F);
		rightTrackModel[257].rotateAngleZ = 0.75049158F;

		rightTrackModel[258].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 676
		rightTrackModel[258].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[259].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 677
		rightTrackModel[259].setRotationPoint(-18.5F, 0.8F, 23.5F);
		rightTrackModel[259].rotateAngleZ = -0.75049158F;

		rightTrackModel[260].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		rightTrackModel[260].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[261].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 679
		rightTrackModel[261].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[262].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 680
		rightTrackModel[262].setRotationPoint(-18.5F, 0.8F, 23.5F);
		rightTrackModel[262].rotateAngleZ = 0.75049158F;

		rightTrackModel[263].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 681
		rightTrackModel[263].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[264].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 682
		rightTrackModel[264].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[265].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 683
		rightTrackModel[265].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[266].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 684
		rightTrackModel[266].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[267].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 685
		rightTrackModel[267].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[268].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 686
		rightTrackModel[268].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[269].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 687
		rightTrackModel[269].setRotationPoint(-18.5F, 0.8F, 23.5F);
		rightTrackModel[269].rotateAngleZ = -0.75049158F;

		rightTrackModel[270].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 688
		rightTrackModel[270].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[271].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 689
		rightTrackModel[271].setRotationPoint(-18.5F, 0.8F, 23.5F);
		rightTrackModel[271].rotateAngleZ = -0.75049158F;

		rightTrackModel[272].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 690
		rightTrackModel[272].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[273].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 691
		rightTrackModel[273].setRotationPoint(-18.5F, 0.8F, 23.5F);
		rightTrackModel[273].rotateAngleZ = 0.75049158F;

		rightTrackModel[274].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 692
		rightTrackModel[274].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[275].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		rightTrackModel[275].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[276].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 694
		rightTrackModel[276].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[277].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 695
		rightTrackModel[277].setRotationPoint(-18.5F, 0.8F, 23.5F);

		rightTrackModel[278].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 696
		rightTrackModel[278].setRotationPoint(-18.5F, 0.8F, 23.5F);
		rightTrackModel[278].rotateAngleZ = 0.75049158F;

		rightTrackModel[279].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 576
		rightTrackModel[279].setRotationPoint(-18F, 0.8F, -15.5F);

		rightTrackModel[280].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 577
		rightTrackModel[280].setRotationPoint(-18F, 0.8F, -15.5F);
	}
}