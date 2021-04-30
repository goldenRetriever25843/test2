//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.07.2016 - 17:35:05
// Last changed on: 05.07.2016 - 17:35:05

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKoksan extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKoksan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[155];
		barrelModel = new ModelRendererTurbo[22];
		leftTrackWheelModels = new ModelRendererTurbo[21];
		rightTrackWheelModels = new ModelRendererTurbo[21];

		initbodyModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 58
		bodyModel[44] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 59
		bodyModel[45] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 60
		bodyModel[46] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 61
		bodyModel[47] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 62
		bodyModel[48] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 63
		bodyModel[49] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 64
		bodyModel[50] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 65
		bodyModel[51] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 66
		bodyModel[52] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 67
		bodyModel[53] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 68
		bodyModel[54] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 13
		bodyModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[56] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[57] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 18
		bodyModel[58] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 23
		bodyModel[59] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 24
		bodyModel[60] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 25
		bodyModel[61] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 26
		bodyModel[62] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 27
		bodyModel[63] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 28
		bodyModel[64] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 29
		bodyModel[65] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 30
		bodyModel[66] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 31
		bodyModel[67] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 32
		bodyModel[68] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 15
		bodyModel[69] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 24
		bodyModel[70] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		bodyModel[71] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
		bodyModel[72] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 31
		bodyModel[73] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 50
		bodyModel[74] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 51
		bodyModel[75] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 140
		bodyModel[76] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 141
		bodyModel[77] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 142
		bodyModel[78] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 143
		bodyModel[79] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 144
		bodyModel[80] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 145
		bodyModel[81] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 147
		bodyModel[82] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 148
		bodyModel[83] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 149
		bodyModel[84] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 150
		bodyModel[85] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 24
		bodyModel[86] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 28
		bodyModel[87] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 29
		bodyModel[88] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		bodyModel[89] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 50
		bodyModel[90] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 51
		bodyModel[91] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 354
		bodyModel[92] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 355
		bodyModel[93] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 358
		bodyModel[94] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 359
		bodyModel[95] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 360
		bodyModel[96] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 361
		bodyModel[97] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 362
		bodyModel[98] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Box 363
		bodyModel[99] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 364
		bodyModel[100] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 379
		bodyModel[101] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 380
		bodyModel[102] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Box 384
		bodyModel[103] = new ModelRendererTurbo(this, 425, 313, textureX, textureY); // Box 392
		bodyModel[104] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 393
		bodyModel[105] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 394
		bodyModel[106] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Box 395
		bodyModel[107] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Box 396
		bodyModel[108] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 397
		bodyModel[109] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 398
		bodyModel[110] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 399
		bodyModel[111] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 400
		bodyModel[112] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 401
		bodyModel[113] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 402
		bodyModel[114] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 403
		bodyModel[115] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 404
		bodyModel[116] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 405
		bodyModel[117] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 406
		bodyModel[118] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 407
		bodyModel[119] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 408
		bodyModel[120] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 409
		bodyModel[121] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 410
		bodyModel[122] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 411
		bodyModel[123] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 412
		bodyModel[124] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 413
		bodyModel[125] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 414
		bodyModel[126] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 415
		bodyModel[127] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 416
		bodyModel[128] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 417
		bodyModel[129] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 418
		bodyModel[130] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 419
		bodyModel[131] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 420
		bodyModel[132] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Box 421
		bodyModel[133] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 422
		bodyModel[134] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 423
		bodyModel[135] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 424
		bodyModel[136] = new ModelRendererTurbo(this, 11, -8, textureX, textureY); // Box 425
		bodyModel[137] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 426
		bodyModel[138] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 427
		bodyModel[139] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 428
		bodyModel[140] = new ModelRendererTurbo(this, 449, 281, textureX, textureY); // Box 429
		bodyModel[141] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 430
		bodyModel[142] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Box 431
		bodyModel[143] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 432
		bodyModel[144] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 433
		bodyModel[145] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 434
		bodyModel[146] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 435
		bodyModel[147] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 436
		bodyModel[148] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 437
		bodyModel[149] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 438
		bodyModel[150] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 439
		bodyModel[151] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 440
		bodyModel[152] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 441
		bodyModel[153] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 442
		bodyModel[154] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 443

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 1, 32, 0F,0.3F, 11.45F, 0.1F, -2F, 7.03F, 0.1F, -2F, 7.03F, -0.35F, 0.3F, 11.45F, -0.35F, 1F, 0F, 0.1F, 3F, -1F, 0.1F, 3F, -1F, -0.35F, 1F, 0F, -0.35F); // Box 0
		bodyModel[0].setRotationPoint(31.7F, -2.3F, -16.05F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 61, 18, 32, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 1
		bodyModel[1].setRotationPoint(-29.6F, -13.75F, -16F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 32, 0F,18F, 0F, 0.1F, 3F, 0.02F, 0.1F, 3F, 0.02F, -0.1F, 18F, 0F, -0.35F, 16.3F, 0.15F, 0.1F, -17F, -0.15F, 0.1F, -17F, -0.15F, -0.35F, 16.3F, 0.15F, -0.35F); // Box 6
		bodyModel[2].setRotationPoint(47.7F, -2.3F, -16.05F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 12, 32, 0F,2.6F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, -0.4F, 2.6F, -0.25F, -0.4F, 0F, 0.05F, 0.1F, -0.35F, 0.05F, 0.1F, -0.35F, 0.05F, -0.4F, 0F, 0.05F, -0.4F); // Box 7
		bodyModel[3].setRotationPoint(-47.3F, -12F, -16F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 4, 32, 0F,2.6F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.4F, 2.6F, -0.25F, -0.4F, -4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, -4F, 0F, -0.4F); // Box 8
		bodyModel[4].setRotationPoint(-44.7F, -0.2F, -16F);

		bodyModel[5].addShapeBox(1F, 0F, 0F, 18, 2, 32, 0F,-0.6F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, 1.9F, -0.49F, 0.1F, 0.25F, -0.49F, 0.1F, 0.25F, -0.49F, -0.4F, 1.9F, -0.49F, -0.4F); // Box 10
		bodyModel[5].setRotationPoint(-49F, -13.27F, -16F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 89, 1, 11, 0F,0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-43.1F, -10F, -26.95F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 89, 1, 11, 0F,0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F); // Box 12
		bodyModel[7].setRotationPoint(-43.1F, -10.01F, 15.3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.5F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.5F, -0.12F, 0F, 0.4F, -0.12F, 0F, 0.2F, -0.12F, 0F, 0.2F, -0.12F, 0F, 0.4F, -0.12F, 0F); // Box 14
		bodyModel[8].setRotationPoint(-45.3F, -9.5F, -26.95F);
		bodyModel[8].rotateAngleZ = 0.2268928F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-47.6F, -8.3F, -26.95F);
		bodyModel[9].rotateAngleZ = 0.54105207F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.1F, -0.16F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, 0.1F, -0.16F, 0F, -0.1F, -0.08F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.08F, 0F); // Box 16
		bodyModel[10].setRotationPoint(-49.2F, -7.1F, -26.95F);
		bodyModel[10].rotateAngleZ = 0.64577182F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.5F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.5F, -0.12F, 0F, 0.4F, -0.12F, 0F, 0.2F, -0.12F, 0F, 0.2F, -0.12F, 0F, 0.4F, -0.12F, 0F); // Box 19
		bodyModel[11].setRotationPoint(-45.3F, -9.5F, 15.3F);
		bodyModel[11].rotateAngleZ = 0.2268928F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F); // Box 20
		bodyModel[12].setRotationPoint(-47.6F, -8.3F, 15.3F);
		bodyModel[12].rotateAngleZ = 0.54105207F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.1F, -0.16F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, 0.1F, -0.16F, 0F, -0.1F, -0.08F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.08F, 0F); // Box 21
		bodyModel[13].setRotationPoint(-49.2F, -7.1F, 15.3F);
		bodyModel[13].rotateAngleZ = 0.64577182F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 18
		bodyModel[14].setRotationPoint(-16.5F, -5.5F, -26.15F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0.2F, 1F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, -1.4F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -1.4F, 0.2F); // Box 19
		bodyModel[15].setRotationPoint(-39.9F, -5.5F, -26.15F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 31, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 21
		bodyModel[16].setRotationPoint(11.9F, -5.5F, -26.15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 61, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 22
		bodyModel[17].setRotationPoint(-31.4F, 8.9F, -26.15F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F); // Box 23
		bodyModel[18].setRotationPoint(-42.3F, -6.7F, -26.15F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.6F, -0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, -0.1F, 0.2F, 0.4F, -0.3F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 24
		bodyModel[19].setRotationPoint(-44.7F, -6.7F, -26.15F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 25
		bodyModel[20].setRotationPoint(-46.9F, -5.75F, -26.15F);
		bodyModel[20].rotateAngleZ = 0.36651914F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.6F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.6F, -0.2F, 0.2F); // Box 26
		bodyModel[21].setRotationPoint(-48.1F, -3.55F, -26.15F);
		bodyModel[21].rotateAngleZ = 0.95993109F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 27
		bodyModel[22].setRotationPoint(-48.45F, -0.71F, -26.15F);
		bodyModel[22].rotateAngleZ = 1.3962634F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 29
		bodyModel[23].setRotationPoint(-47.68F, 1.4F, -26.15F);
		bodyModel[23].rotateAngleZ = 1.74532925F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 30
		bodyModel[24].setRotationPoint(-46.09F, 3.02F, -26.15F);
		bodyModel[24].rotateAngleZ = 2.18166156F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0.4F, 4F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.4F, 4F, 0.2F, 0.4F, -4.4F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.4F, -4.4F, 0.2F); // Box 31
		bodyModel[25].setRotationPoint(-45.9F, 6.32F, -26.15F);
		bodyModel[25].rotateAngleZ = -0.12217305F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, -0.35F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.35F, 0.2F, -0.1F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.1F, 0F, 0.2F); // Box 33
		bodyModel[26].setRotationPoint(-36F, 7.35F, -26.15F);
		bodyModel[26].rotateAngleZ = -0.33161256F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 34
		bodyModel[27].setRotationPoint(29.65F, 8.9F, -26.15F);
		bodyModel[27].rotateAngleZ = 0.2443461F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 35
		bodyModel[28].setRotationPoint(32.75F, 8.1F, -26.15F);
		bodyModel[28].rotateAngleZ = 0.50614548F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 36
		bodyModel[29].setRotationPoint(43F, -7.1F, -26.15F);
		bodyModel[29].rotateAngleZ = -0.10471976F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 37
		bodyModel[30].setRotationPoint(45F, -6.6F, -26.15F);
		bodyModel[30].rotateAngleZ = -0.4712389F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.5F, -0.15F, 0.2F, 0.5F, -0.15F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 38
		bodyModel[31].setRotationPoint(46.57F, -5.5F, -26.15F);
		bodyModel[31].rotateAngleZ = -0.90757121F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.5F, -0.1F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.5F, -0.2F, 0.2F); // Box 39
		bodyModel[32].setRotationPoint(47.1F, -1.4F, -26.15F);
		bodyModel[32].rotateAngleZ = 1.34390352F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.5F, -0.15F, 0.2F, 0.5F, -0.15F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 40
		bodyModel[33].setRotationPoint(46.57F, -5.5F, -26.15F);
		bodyModel[33].rotateAngleZ = -0.90757121F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, 0.2F, 0.2F, 0.4F, -0.15F, 0.2F, 0.4F, -0.15F, 0.2F, 0.2F, 0.2F, 0.2F, 0.3F, -0.6F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.3F, -0.6F, 0.2F); // Box 41
		bodyModel[34].setRotationPoint(45.85F, 1.2F, -26.15F);
		bodyModel[34].rotateAngleZ = 1.08210414F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 48
		bodyModel[35].setRotationPoint(32.75F, 8.1F, 16.85F);
		bodyModel[35].rotateAngleZ = 0.50614548F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, 0.2F, 0.2F, 0.4F, -0.15F, 0.2F, 0.4F, -0.15F, 0.2F, 0.2F, 0.2F, 0.2F, 0.3F, -0.6F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.3F, -0.6F, 0.2F); // Box 49
		bodyModel[36].setRotationPoint(45.85F, 1.2F, 16.85F);
		bodyModel[36].rotateAngleZ = 1.08210414F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.5F, -0.1F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.5F, -0.2F, 0.2F); // Box 50
		bodyModel[37].setRotationPoint(47.1F, -1.4F, 16.85F);
		bodyModel[37].rotateAngleZ = 1.34390352F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.5F, -0.15F, 0.2F, 0.5F, -0.15F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 51
		bodyModel[38].setRotationPoint(46.57F, -5.5F, 16.85F);
		bodyModel[38].rotateAngleZ = -0.90757121F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 52
		bodyModel[39].setRotationPoint(45F, -6.6F, 16.85F);
		bodyModel[39].rotateAngleZ = -0.4712389F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 53
		bodyModel[40].setRotationPoint(43F, -7.1F, 16.85F);
		bodyModel[40].rotateAngleZ = -0.10471976F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 31, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 54
		bodyModel[41].setRotationPoint(11.9F, -5.5F, 16.85F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 55
		bodyModel[42].setRotationPoint(-16.5F, -5.5F, 16.85F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F); // Box 58
		bodyModel[43].setRotationPoint(-42.3F, -6.7F, 16.85F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.6F, -0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, -0.1F, 0.2F, 0.4F, -0.3F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 59
		bodyModel[44].setRotationPoint(-44.7F, -6.7F, 16.85F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 60
		bodyModel[45].setRotationPoint(-46.9F, -5.75F, 16.85F);
		bodyModel[45].rotateAngleZ = 0.36651914F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.6F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.6F, -0.2F, 0.2F); // Box 61
		bodyModel[46].setRotationPoint(-48.1F, -3.55F, 16.85F);
		bodyModel[46].rotateAngleZ = 0.95993109F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 62
		bodyModel[47].setRotationPoint(-48.45F, -0.71F, 16.85F);
		bodyModel[47].rotateAngleZ = 1.3962634F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 63
		bodyModel[48].setRotationPoint(-47.68F, 1.4F, 16.85F);
		bodyModel[48].rotateAngleZ = 1.74532925F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 64
		bodyModel[49].setRotationPoint(-46.09F, 3.02F, 16.85F);
		bodyModel[49].rotateAngleZ = 2.18166156F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0.4F, 4F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.4F, 4F, 0.2F, 0.4F, -4.4F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.4F, -4.4F, 0.2F); // Box 65
		bodyModel[50].setRotationPoint(-45.9F, 6.32F, 16.85F);
		bodyModel[50].rotateAngleZ = -0.12217305F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, -0.35F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.35F, 0.2F, -0.1F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.1F, 0F, 0.2F); // Box 66
		bodyModel[51].setRotationPoint(-36F, 7.35F, 16.85F);
		bodyModel[51].rotateAngleZ = -0.33161256F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 61, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 67
		bodyModel[52].setRotationPoint(-31.4F, 8.9F, 16.85F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 68
		bodyModel[53].setRotationPoint(29.65F, 8.9F, 16.85F);
		bodyModel[53].rotateAngleZ = 0.2443461F;

		bodyModel[54].addBox(0F, 0F, 0F, 5, 3, 9, 0F); // Box 13
		bodyModel[54].setRotationPoint(-48.1F, -13F, -26.35F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F); // Box 14
		bodyModel[55].setRotationPoint(-47.9F, -10F, -25.7F);
		bodyModel[55].rotateAngleZ = 0.34906585F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F); // Box 15
		bodyModel[56].setRotationPoint(-47.9F, -10F, -18.6F);
		bodyModel[56].rotateAngleZ = 0.34906585F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, -2F, -0.2F, -0.4F, -2F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 18
		bodyModel[57].setRotationPoint(-43.2F, -11.9F, -26.55F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 23
		bodyModel[58].setRotationPoint(-43.3F, -11.9F, 14.45F);

		bodyModel[59].addBox(0F, 0F, 0F, 8, 1, 15, 0F); // Box 24
		bodyModel[59].setRotationPoint(-39.5F, -13.7F, -15.65F);

		bodyModel[60].addBox(0F, 0F, 0F, 6, 1, 31, 0F); // Box 25
		bodyModel[60].setRotationPoint(-46.5F, -13.7F, -15.65F);

		bodyModel[61].addBox(0F, 0F, 0F, 8, 1, 15, 0F); // Box 26
		bodyModel[61].setRotationPoint(-39.5F, -13.7F, 0.350000000000001F);

		bodyModel[62].addBox(0F, 0F, 0F, 7, 1, 14, 0F); // Box 27
		bodyModel[62].setRotationPoint(-39F, -13.75F, 0.850000000000001F);

		bodyModel[63].addBox(0F, 0F, 0F, 7, 1, 14, 0F); // Box 28
		bodyModel[63].setRotationPoint(-39F, -13.75F, -15.15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.7F, 0F, -0.1F); // Box 29
		bodyModel[64].setRotationPoint(-32.9F, -14F, -14.6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.6F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.6F, 0F, -0.1F); // Box 30
		bodyModel[65].setRotationPoint(-30.8F, -14.6F, -14.6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F); // Box 31
		bodyModel[66].setRotationPoint(-30.8F, -15.3F, -14.6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 32, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, -0.3F); // Box 32
		bodyModel[67].setRotationPoint(-31.1F, -14.6F, -16.05F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0.2F, 1F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, -1.4F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -1.4F, 0.2F); // Box 15
		bodyModel[68].setRotationPoint(-39.9F, -5.5F, 16.85F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 24
		bodyModel[69].setRotationPoint(33.8F, -11.8F, -11.4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 28
		bodyModel[70].setRotationPoint(33.65F, -11.8F, -8.3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 29
		bodyModel[71].setRotationPoint(33.65F, -11.8F, -5.05F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -1.35F, -0.35F, -0.2F, -1.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0.65F, -0.35F, -0.2F, 0.65F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 31
		bodyModel[72].setRotationPoint(34.4F, -11.6F, -11.4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.35F, 0F, -1.55F, -0.35F, 0F, -1.55F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.1F, 0.85F, -0.35F, 0.1F, 0.85F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 50
		bodyModel[73].setRotationPoint(34.4F, -11.6F, -8.35F);
		bodyModel[73].rotateAngleZ = -0.15707963F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.35F, 0F, -1.55F, -0.35F, 0F, -1.55F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.1F, 0.85F, -0.35F, 0.1F, 0.85F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 51
		bodyModel[74].setRotationPoint(34.4F, -11.6F, -5.05F);
		bodyModel[74].rotateAngleZ = -0.15707963F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[75].setRotationPoint(-48.4F, -2.85F, -16.15F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.35F, 0.4F, 0F); // Box 141
		bodyModel[76].setRotationPoint(-48.4F, -0.85F, -16.15F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F); // Box 142
		bodyModel[77].setRotationPoint(-48.05F, 1.55F, -16.15F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.6F, 0F, 0F); // Box 143
		bodyModel[78].setRotationPoint(-46.7F, 3.55F, -16.15F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -2.2F, -0.1F, 0F); // Box 144
		bodyModel[79].setRotationPoint(-45.7F, 4.55F, -16.15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -2.2F, -0.1F, 0F); // Box 145
		bodyModel[80].setRotationPoint(-45.7F, 4.55F, 13.6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.6F, 0F, 0F); // Box 147
		bodyModel[81].setRotationPoint(-46.7F, 3.55F, 13.6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F); // Box 148
		bodyModel[82].setRotationPoint(-48.05F, 1.55F, 13.6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.35F, 0.4F, 0F); // Box 149
		bodyModel[83].setRotationPoint(-48.4F, -0.85F, 13.6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[84].setRotationPoint(-48.4F, -2.85F, 13.6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 24
		bodyModel[85].setRotationPoint(33.8F, -11.8F, -11.4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 28
		bodyModel[86].setRotationPoint(33.65F, -11.8F, -8.3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 29
		bodyModel[87].setRotationPoint(33.65F, -11.8F, -5.05F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -1.35F, -0.35F, -0.2F, -1.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0.65F, -0.35F, -0.2F, 0.65F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 31
		bodyModel[88].setRotationPoint(34.4F, -11.6F, -11.4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.35F, 0F, -1.55F, -0.35F, 0F, -1.55F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.1F, 0.85F, -0.35F, 0.1F, 0.85F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 50
		bodyModel[89].setRotationPoint(34.4F, -11.6F, -8.35F);
		bodyModel[89].rotateAngleZ = -0.15707963F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.35F, 0F, -1.55F, -0.35F, 0F, -1.55F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.1F, 0.85F, -0.35F, 0.1F, 0.85F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 51
		bodyModel[90].setRotationPoint(34.4F, -11.6F, -5.05F);
		bodyModel[90].rotateAngleZ = -0.15707963F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 21, 10, 10, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 354
		bodyModel[91].setRotationPoint(-31.6F, -18.75F, -26F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 21, 10, 10, 0F,0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 355
		bodyModel[92].setRotationPoint(-31.6F, -18.75F, 15.3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 15, 18, 26, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 358
		bodyModel[93].setRotationPoint(-2F, -23.75F, -13F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 35, 9, 54, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, -0.4F, 0.2F, -0.5F, -0.4F); // Box 359
		bodyModel[94].setRotationPoint(11.5F, -17.5F, -27F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 35, 3, 54, 0F,0.2F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0.2F, 0F, -3.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 360
		bodyModel[95].setRotationPoint(11.5F, -20.5F, -27F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 19, 9, 54, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.5F, 0.1F, 6F, -2F, 0.1F, 6F, -2F, -0.4F, 0.2F, -0.5F, -0.4F); // Box 361
		bodyModel[96].setRotationPoint(46.5F, -17.5F, -27F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 18, 8, 54, 0F,0F, -0.5F, 0.1F, 6.5F, 1F, 0.1F, 6.5F, 1F, -0.4F, 0.2F, -0.5F, -0.4F, -4F, -0.5F, 0.4F, -14F, -0.5F, 0.1F, -14F, -0.5F, -0.1F, -4F, -0.5F, -0.4F); // Box 362
		bodyModel[97].setRotationPoint(47F, -9.5F, -27F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 19, 3, 54, 0F,0F, 0F, -3.5F, -3F, 0F, -3.5F, -3F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 363
		bodyModel[98].setRotationPoint(46.5F, -20.5F, -27F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 18, 6, 32, 0F,0F, -0.8F, -1F, -5.3F, -0.8F, -1F, -5.3F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[99].setRotationPoint(44.5F, -26.5F, -16F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 43, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 379
		bodyModel[100].setRotationPoint(45.5F, -52.5F, -27.6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 96, 42, 1, 0F,-40F, -18F, -0.45F, -32F, -14F, -0.45F, -32F, -14F, -0.45F, -40F, -18F, -0.45F, -39F, -13F, -0.45F, -32F, -17F, -0.45F, -32F, -17F, -0.45F, -39F, -13F, -0.45F); // Box 380
		bodyModel[101].setRotationPoint(-18F, -65.5F, -27.6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 32, 18, 28, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 384
		bodyModel[102].setRotationPoint(-41.6F, -14.75F, -14F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 26, 18, 14, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 392
		bodyModel[103].setRotationPoint(-36.6F, -18F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 33, 2, 2, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, 0.6F, 0.1F, 0F, 3.6F, 0.1F, 0F, 3.6F, -0.4F, 0.2F, 0.6F, -0.4F); // Box 393
		bodyModel[104].setRotationPoint(-57.6F, -20F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 33, 2, 2, 0F,0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0.6F, -0.4F, 0F, 3.6F, -0.4F, 0F, 3.6F, 0.1F, 0F, 0.6F, 0.1F); // Box 394
		bodyModel[105].setRotationPoint(-57.6F, -20F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 395
		bodyModel[106].setRotationPoint(-63.6F, -20.2F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 396
		bodyModel[107].setRotationPoint(-63.6F, -20.2F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 397
		bodyModel[108].setRotationPoint(-62.6F, -28.2F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 398
		bodyModel[109].setRotationPoint(-62.6F, -28.2F, 7.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 399
		bodyModel[110].setRotationPoint(-53.6F, -28.2F, 7.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 400
		bodyModel[111].setRotationPoint(-45.6F, -28.2F, 7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 401
		bodyModel[112].setRotationPoint(-37.6F, -28.2F, 7.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 402
		bodyModel[113].setRotationPoint(-62.6F, -24.2F, 7.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 403
		bodyModel[114].setRotationPoint(-62.6F, -28.2F, -8.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 404
		bodyModel[115].setRotationPoint(-62.6F, -28.2F, -8.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 405
		bodyModel[116].setRotationPoint(-53.6F, -28.2F, -8.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 406
		bodyModel[117].setRotationPoint(-45.6F, -28.2F, -8.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 407
		bodyModel[118].setRotationPoint(-37.6F, -28.2F, -8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 408
		bodyModel[119].setRotationPoint(-62.6F, -24.2F, -8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 15, 4, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[120].setRotationPoint(-27.6F, -22F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 17, 6, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 410
		bodyModel[121].setRotationPoint(-39.6F, -31F, -3F);

		bodyModel[122].addBox(3F, 0F, 0F, 20, 3, 2, 0F); // Box 411
		bodyModel[122].setRotationPoint(-72.1F, -15F, -15.5F);
		bodyModel[122].rotateAngleZ = -0.15707963F;

		bodyModel[123].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 412
		bodyModel[123].setRotationPoint(-57.1F, -11F, -16F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 413
		bodyModel[124].setRotationPoint(-57.1F, -8F, -16F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[125].setRotationPoint(-57.1F, -14F, -16F);

		bodyModel[126].addBox(3F, 0F, 0F, 20, 3, 2, 0F); // Box 415
		bodyModel[126].setRotationPoint(-72.1F, -15F, 13.5F);
		bodyModel[126].rotateAngleZ = -0.15707963F;

		bodyModel[127].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 416
		bodyModel[127].setRotationPoint(-57.1F, -11F, 13F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 417
		bodyModel[128].setRotationPoint(-57.1F, -8F, 13F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[129].setRotationPoint(-57.1F, -14F, 13F);

		bodyModel[130].addShapeBox(-5F, 0F, 0F, 8, 3, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 419
		bodyModel[130].setRotationPoint(-72.1F, -15F, -15.5F);
		bodyModel[130].rotateAngleZ = -0.15707963F;

		bodyModel[131].addShapeBox(0F, 2F, 0F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[131].setRotationPoint(-80.1F, -19F, -20.5F);
		bodyModel[131].rotateAngleZ = 0.27925268F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[132].setRotationPoint(-77.1F, -15F, -20.5F);
		bodyModel[132].rotateAngleZ = -1.18682389F;

		bodyModel[133].addShapeBox(-5F, 0F, 0F, 8, 3, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 422
		bodyModel[133].setRotationPoint(-72.1F, -15F, 13.5F);
		bodyModel[133].rotateAngleZ = -0.15707963F;

		bodyModel[134].addShapeBox(0F, 2F, 0F, 2, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[134].setRotationPoint(-80.1F, -19F, 8.5F);
		bodyModel[134].rotateAngleZ = 0.27925268F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[135].setRotationPoint(-77.1F, -15F, 8.5F);
		bodyModel[135].rotateAngleZ = -1.18682389F;

		bodyModel[136].addShapeBox(0F, 3.2F, 0F, 1, 20, 500, 0F,0F, 1.5F, 20F, 0F, 1.5F, 20F, 0F, 1.5F, -475F, 0F, 1.5F, -475F, 0F, -19F, 20F, 0F, -19F, 20F, 0F, -19F, -475F, 0F, -19F, -475F); // Box 425
		bodyModel[136].setRotationPoint(67.85F, -13.5F, -2.75F);
		bodyModel[136].rotateAngleZ = 0.6981317F;

		bodyModel[137].addShapeBox(-2F, 1F, 0F, 2, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[137].setRotationPoint(58.3F, -25F, -13F);
		bodyModel[137].rotateAngleZ = 0.78539816F;

		bodyModel[138].addShapeBox(-2F, 1F, 0F, 2, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[138].setRotationPoint(58.3F, -25F, 5F);
		bodyModel[138].rotateAngleZ = 0.78539816F;

		bodyModel[139].addShapeBox(-1.5F, 7F, -3F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F); // Box 428
		bodyModel[139].setRotationPoint(58.3F, -25F, -13F);
		bodyModel[139].rotateAngleZ = 0.78539816F;

		bodyModel[140].addShapeBox(-1.5F, 7F, -3F, 2, 1, 16, 0F,0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[140].setRotationPoint(58.3F, -25F, 3F);
		bodyModel[140].rotateAngleZ = 0.78539816F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[141].setRotationPoint(47.5F, -26.5F, -13F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[142].setRotationPoint(47.5F, -26.5F, 3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 432
		bodyModel[143].setRotationPoint(62.5F, -20.4F, -23F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[144].setRotationPoint(62.5F, -20.4F, -17F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 434
		bodyModel[145].setRotationPoint(62.5F, -20.4F, -24F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 435
		bodyModel[146].setRotationPoint(63F, -20.3F, -23F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 436
		bodyModel[147].setRotationPoint(62.5F, -20.4F, 17F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 437
		bodyModel[148].setRotationPoint(62.5F, -20.4F, 16F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[149].setRotationPoint(62.5F, -20.4F, 23F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 439
		bodyModel[150].setRotationPoint(63F, -20.3F, 17F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 440
		bodyModel[151].setRotationPoint(63.2F, -19.3F, -22.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 441
		bodyModel[152].setRotationPoint(63.2F, -19.3F, -19.7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 442
		bodyModel[153].setRotationPoint(63.2F, -19.3F, 20.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 443
		bodyModel[154].setRotationPoint(63.2F, -19.3F, 17.7F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 365
		barrelModel[1] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 366
		barrelModel[2] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 367
		barrelModel[3] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 368
		barrelModel[4] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 369
		barrelModel[5] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 371
		barrelModel[6] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 372
		barrelModel[7] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 373
		barrelModel[8] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 374
		barrelModel[9] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 375
		barrelModel[10] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 376
		barrelModel[11] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 377
		barrelModel[12] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 378
		barrelModel[13] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 381
		barrelModel[14] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 383
		barrelModel[15] = new ModelRendererTurbo(this, 265, 297, textureX, textureY); // Box 385
		barrelModel[16] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 386
		barrelModel[17] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 387
		barrelModel[18] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Box 388
		barrelModel[19] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 389
		barrelModel[20] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 390
		barrelModel[21] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 391

		barrelModel[0].addBox(0F, -2F, -1F, 41, 6, 2, 0F); // Box 365
		barrelModel[0].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[1].addShapeBox(0F, -2F, -3F, 41, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		barrelModel[1].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[2].addShapeBox(0F, -2F, 1F, 41, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 367
		barrelModel[2].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[3].addShapeBox(41F, -2F, -3F, 29, 6, 2, 0F,0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 368
		barrelModel[3].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[4].addShapeBox(41F, -2F, 1F, 29, 6, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F); // Box 369
		barrelModel[4].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[5].addShapeBox(41F, -2F, -1F, 29, 6, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 371
		barrelModel[5].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[6].addShapeBox(70F, -2F, -2F, 76, 2, 4, 0F,0F, 0F, -1F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 372
		barrelModel[6].setRotationPoint(-38F, -30.5F, 0F);

		barrelModel[7].addShapeBox(70F, 0F, -2F, 76, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, 0F, -1F); // Box 373
		barrelModel[7].setRotationPoint(-38F, -30.5F, 0F);

		barrelModel[8].addShapeBox(146F, -2F, -2F, 5, 2, 4, 0F,0F, -0.2F, -1.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 374
		barrelModel[8].setRotationPoint(-38F, -30.5F, 0F);

		barrelModel[9].addShapeBox(146F, 0F, -2F, 5, 2, 4, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -1.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, -1.2F); // Box 375
		barrelModel[9].setRotationPoint(-38F, -30.5F, 0F);

		barrelModel[10].addShapeBox(151F, -2F, 1F, 8, 6, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F); // Box 376
		barrelModel[10].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[11].addShapeBox(151F, -2F, -1F, 8, 6, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 377
		barrelModel[11].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[12].addShapeBox(151F, -2F, -3F, 8, 6, 2, 0F,0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 378
		barrelModel[12].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[13].addShapeBox(-2F, -2F, 5F, 3, 34, 3, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 381
		barrelModel[13].setRotationPoint(-31F, -32F, 0F);

		barrelModel[14].addShapeBox(-2F, -2F, -8F, 3, 34, 3, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 383
		barrelModel[14].setRotationPoint(-31F, -32F, 0F);

		barrelModel[15].addBox(-13F, -3.5F, -5F, 26, 8, 10, 0F); // Box 385
		barrelModel[15].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[16].addBox(-9F, -4.5F, -6.5F, 41, 3, 3, 0F); // Box 386
		barrelModel[16].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[17].addBox(-9F, -4.5F, 3.5F, 41, 3, 3, 0F); // Box 387
		barrelModel[17].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[18].addBox(-6F, -6.5F, -1.5F, 47, 3, 3, 0F); // Box 388
		barrelModel[18].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[19].addBox(-9F, 4.5F, -5F, 42, 2, 10, 0F); // Box 389
		barrelModel[19].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[20].addBox(-21F, 6F, -6F, 28, 2, 2, 0F); // Box 390
		barrelModel[20].setRotationPoint(-38F, -31.5F, 0F);

		barrelModel[21].addBox(-21F, 6F, 4F, 28, 2, 2, 0F); // Box 391
		barrelModel[21].setRotationPoint(-38F, -31.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 69
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 70
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 71
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 72
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 73
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 74
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 512
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 513
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 514
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 515
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 516
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 517
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 518
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 519
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 520
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 521
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 522
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 523
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 539
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 540
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 541

		leftTrackWheelModels[0].addShapeBox(-4.5F, -4F, 0F, 9, 2, 6, 0F,-2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 69
		leftTrackWheelModels[0].setRotationPoint(42.3F, -2F, 18.15F);

		leftTrackWheelModels[1].addShapeBox(-4.5F, -2F, 0F, 9, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 70
		leftTrackWheelModels[1].setRotationPoint(42.3F, -2F, 18.15F);

		leftTrackWheelModels[2].addShapeBox(-4.5F, 2F, 0F, 9, 2, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F); // Box 71
		leftTrackWheelModels[2].setRotationPoint(42.3F, -2F, 18.15F);

		leftTrackWheelModels[3].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 72
		leftTrackWheelModels[3].setRotationPoint(29.5F, 2.5F, 18.15F);

		leftTrackWheelModels[4].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 73
		leftTrackWheelModels[4].setRotationPoint(29.5F, 2.5F, 18.15F);

		leftTrackWheelModels[5].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 74
		leftTrackWheelModels[5].setRotationPoint(29.5F, 2.5F, 18.15F);

		leftTrackWheelModels[6].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 512
		leftTrackWheelModels[6].setRotationPoint(11.5F, 2.5F, 18.15F);

		leftTrackWheelModels[7].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 513
		leftTrackWheelModels[7].setRotationPoint(11.5F, 2.5F, 18.15F);

		leftTrackWheelModels[8].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 514
		leftTrackWheelModels[8].setRotationPoint(11.5F, 2.5F, 18.15F);

		leftTrackWheelModels[9].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 515
		leftTrackWheelModels[9].setRotationPoint(-2.5F, 2.5F, 18.15F);

		leftTrackWheelModels[10].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 516
		leftTrackWheelModels[10].setRotationPoint(-2.5F, 2.5F, 18.15F);

		leftTrackWheelModels[11].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 517
		leftTrackWheelModels[11].setRotationPoint(-2.5F, 2.5F, 18.15F);

		leftTrackWheelModels[12].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 518
		leftTrackWheelModels[12].setRotationPoint(-16.5F, 2.5F, 18.15F);

		leftTrackWheelModels[13].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 519
		leftTrackWheelModels[13].setRotationPoint(-16.5F, 2.5F, 18.15F);

		leftTrackWheelModels[14].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 520
		leftTrackWheelModels[14].setRotationPoint(-16.5F, 2.5F, 18.15F);

		leftTrackWheelModels[15].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 521
		leftTrackWheelModels[15].setRotationPoint(-30.5F, 2.5F, 18.15F);

		leftTrackWheelModels[16].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 522
		leftTrackWheelModels[16].setRotationPoint(-30.5F, 2.5F, 18.15F);

		leftTrackWheelModels[17].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 523
		leftTrackWheelModels[17].setRotationPoint(-30.5F, 2.5F, 18.15F);

		leftTrackWheelModels[18].addShapeBox(-4.5F, -2F, 0F, 9, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 539
		leftTrackWheelModels[18].setRotationPoint(-42.5F, -1.5F, 18.15F);

		leftTrackWheelModels[19].addShapeBox(-4.5F, 2F, 0F, 9, 2, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F); // Box 540
		leftTrackWheelModels[19].setRotationPoint(-42.5F, -1.5F, 18.15F);

		leftTrackWheelModels[20].addShapeBox(-4.5F, -4F, 0F, 9, 2, 6, 0F,-2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 541
		leftTrackWheelModels[20].setRotationPoint(-42.5F, -1.5F, 18.15F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 524
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 525
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 526
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 527
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 528
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 529
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 530
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 531
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 532
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 533
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 534
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 535
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 536
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 537
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 538
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 542
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 543
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 544
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 545
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 546
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 547

		rightTrackWheelModels[0].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 524
		rightTrackWheelModels[0].setRotationPoint(29.5F, 2.5F, -23.85F);

		rightTrackWheelModels[1].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 525
		rightTrackWheelModels[1].setRotationPoint(29.5F, 2.5F, -23.85F);

		rightTrackWheelModels[2].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 526
		rightTrackWheelModels[2].setRotationPoint(29.5F, 2.5F, -23.85F);

		rightTrackWheelModels[3].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 527
		rightTrackWheelModels[3].setRotationPoint(11.5F, 2.5F, -23.85F);

		rightTrackWheelModels[4].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 528
		rightTrackWheelModels[4].setRotationPoint(11.5F, 2.5F, -23.85F);

		rightTrackWheelModels[5].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 529
		rightTrackWheelModels[5].setRotationPoint(11.5F, 2.5F, -23.85F);

		rightTrackWheelModels[6].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 530
		rightTrackWheelModels[6].setRotationPoint(-2.5F, 2.5F, -23.85F);

		rightTrackWheelModels[7].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 531
		rightTrackWheelModels[7].setRotationPoint(-2.5F, 2.5F, -23.85F);

		rightTrackWheelModels[8].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 532
		rightTrackWheelModels[8].setRotationPoint(-2.5F, 2.5F, -23.85F);

		rightTrackWheelModels[9].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 533
		rightTrackWheelModels[9].setRotationPoint(-16.5F, 2.5F, -23.85F);

		rightTrackWheelModels[10].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 534
		rightTrackWheelModels[10].setRotationPoint(-16.5F, 2.5F, -23.85F);

		rightTrackWheelModels[11].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 535
		rightTrackWheelModels[11].setRotationPoint(-16.5F, 2.5F, -23.85F);

		rightTrackWheelModels[12].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 536
		rightTrackWheelModels[12].setRotationPoint(-30.5F, 2.5F, -23.85F);

		rightTrackWheelModels[13].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 537
		rightTrackWheelModels[13].setRotationPoint(-30.5F, 2.5F, -23.85F);

		rightTrackWheelModels[14].addShapeBox(-6F, -6.5F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 538
		rightTrackWheelModels[14].setRotationPoint(-30.5F, 2.5F, -23.85F);

		rightTrackWheelModels[15].addShapeBox(-4.5F, -4F, 0F, 9, 2, 6, 0F,-2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 542
		rightTrackWheelModels[15].setRotationPoint(42.3F, -2F, -23.85F);

		rightTrackWheelModels[16].addShapeBox(-4.5F, -2F, 0F, 9, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 543
		rightTrackWheelModels[16].setRotationPoint(42.3F, -2F, -23.85F);

		rightTrackWheelModels[17].addShapeBox(-4.5F, 2F, 0F, 9, 2, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F); // Box 544
		rightTrackWheelModels[17].setRotationPoint(42.3F, -2F, -23.85F);

		rightTrackWheelModels[18].addShapeBox(-4.5F, -2F, 0F, 9, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 545
		rightTrackWheelModels[18].setRotationPoint(-42.5F, -1.5F, -23.85F);

		rightTrackWheelModels[19].addShapeBox(-4.5F, 2F, 0F, 9, 2, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F); // Box 546
		rightTrackWheelModels[19].setRotationPoint(-42.5F, -1.5F, -23.85F);

		rightTrackWheelModels[20].addShapeBox(-4.5F, -4F, 0F, 9, 2, 6, 0F,-2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 547
		rightTrackWheelModels[20].setRotationPoint(-42.5F, -1.5F, -23.85F);
	}
}