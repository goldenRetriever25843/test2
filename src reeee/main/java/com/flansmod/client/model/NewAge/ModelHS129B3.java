//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.07.2017 - 01:29:57
// Last changed on: 23.07.2017 - 01:29:57

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHS129B3 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelHS129B3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[91];
		tailModel = new ModelRendererTurbo[50];
		leftWingModel = new ModelRendererTurbo[60];
		rightWingModel = new ModelRendererTurbo[39];
		tailWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel = new ModelRendererTurbo[11];
		rightWingWheelModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 41
		bodyModel[17] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 45
		bodyModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 47
		bodyModel[19] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 62
		bodyModel[20] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 63
		bodyModel[21] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 65
		bodyModel[22] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 67
		bodyModel[23] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 70
		bodyModel[24] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 71
		bodyModel[25] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 72
		bodyModel[26] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 73
		bodyModel[27] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 74
		bodyModel[28] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 75
		bodyModel[29] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 77
		bodyModel[30] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 78
		bodyModel[31] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 80
		bodyModel[32] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 81
		bodyModel[33] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 82
		bodyModel[34] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 83
		bodyModel[35] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 84
		bodyModel[36] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 85
		bodyModel[37] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 86
		bodyModel[38] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 87
		bodyModel[39] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 88
		bodyModel[40] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 89
		bodyModel[41] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 91
		bodyModel[42] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 92
		bodyModel[43] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 93
		bodyModel[44] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 94
		bodyModel[45] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 95
		bodyModel[46] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 268
		bodyModel[47] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 269
		bodyModel[48] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 270
		bodyModel[49] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 271
		bodyModel[50] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 272
		bodyModel[51] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 273
		bodyModel[52] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 274
		bodyModel[53] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Box 275
		bodyModel[54] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 276
		bodyModel[55] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 277
		bodyModel[56] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 278
		bodyModel[57] = new ModelRendererTurbo(this, 969, 145, textureX, textureY); // Box 279
		bodyModel[58] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 281
		bodyModel[59] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 282
		bodyModel[60] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 283
		bodyModel[61] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 284
		bodyModel[62] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 285
		bodyModel[63] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 286
		bodyModel[64] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 287
		bodyModel[65] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 288
		bodyModel[66] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 289
		bodyModel[67] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 290
		bodyModel[68] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 291
		bodyModel[69] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 292
		bodyModel[70] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 293
		bodyModel[71] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 294
		bodyModel[72] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 295
		bodyModel[73] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 296
		bodyModel[74] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 297
		bodyModel[75] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 298
		bodyModel[76] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Box 299
		bodyModel[77] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 300
		bodyModel[78] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 370
		bodyModel[79] = new ModelRendererTurbo(this, 553, 185, textureX, textureY); // Box 371
		bodyModel[80] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 372
		bodyModel[81] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 374
		bodyModel[82] = new ModelRendererTurbo(this, 577, 169, textureX, textureY); // Box 375
		bodyModel[83] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 376
		bodyModel[84] = new ModelRendererTurbo(this, 777, 185, textureX, textureY); // Box 377
		bodyModel[85] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Box 378
		bodyModel[86] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 379
		bodyModel[87] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 380
		bodyModel[88] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 381
		bodyModel[89] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 382
		bodyModel[90] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 385

		bodyModel[0].addShapeBox(0F, 0F, 0F, 69, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-30F, -58F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 69, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 2
		bodyModel[1].setRotationPoint(-30F, -58F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 69, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 3
		bodyModel[2].setRotationPoint(-30F, -47F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 94, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-55F, -29F, -15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 94, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 5
		bodyModel[4].setRotationPoint(-55F, -27F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 69, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 6
		bodyModel[5].setRotationPoint(-30F, -58F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 69, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 7
		bodyModel[6].setRotationPoint(-30F, -47F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 94, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-55F, -29F, 14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 94, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 9
		bodyModel[8].setRotationPoint(-55F, -27F, 14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 94, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-55F, -26F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-51F, -58F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-51F, -58F, 4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-53F, -58F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 14
		bodyModel[13].setRotationPoint(-35F, -58F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-40F, -58F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 20
		bodyModel[15].setRotationPoint(-35F, -58F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, -4F, 0F, -3F, 4F, 0F, 0F, -1F); // Box 41
		bodyModel[16].setRotationPoint(147F, -38F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 4F, 0F, -3F, -4F, 0F, 0F, 1F); // Box 45
		bodyModel[17].setRotationPoint(147F, -38F, 4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 26, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[18].setRotationPoint(114F, -52F, -1.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 2F, 0F, 2F); // Box 62
		bodyModel[19].setRotationPoint(-53F, -57F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 2F, 0F, 1F); // Box 63
		bodyModel[20].setRotationPoint(-53F, -57F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 1F); // Box 65
		bodyModel[21].setRotationPoint(-55F, -49F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 25, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 67
		bodyModel[22].setRotationPoint(-55F, -47F, 9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, 2F, 0F, -2F); // Box 70
		bodyModel[23].setRotationPoint(-53F, -57F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, 0F, -1F); // Box 71
		bodyModel[24].setRotationPoint(-53F, -57F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, -1F, 0F, 0F, -1F); // Box 72
		bodyModel[25].setRotationPoint(-55F, -49F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 73
		bodyModel[26].setRotationPoint(-55F, -47F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 74
		bodyModel[27].setRotationPoint(-55F, -49F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 23, 18, 1, 0F,0F, -13F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 2F, 0F, -3F, -2F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -3F, 2F); // Box 75
		bodyModel[28].setRotationPoint(-78F, -47F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 23, 2, 16, 0F,0F, 0F, -5F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -11F, 1F, 0F, -11F, 1F, 0F, -1F, -5F); // Box 77
		bodyModel[29].setRotationPoint(-78F, -38F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, 1F, -1F, 0F, 12F, 4F, 0F, 10F, -6F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -13F, 6F, 0F, -13F, -6F, 0F, 0F, -4F); // Box 78
		bodyModel[30].setRotationPoint(-78F, -37F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 10F, -6F, 0F, 12F, 4F, 0F, 1F, -1F, 0F, 0F, -4F, 0F, -13F, -6F, 0F, -13F, 6F, 0F, 0F, 4F); // Box 80
		bodyModel[31].setRotationPoint(-78F, -37F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F,0F, 0F, 0F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 8F, 0F, 2F, 8F, 0F, 0F, 0F); // Box 81
		bodyModel[32].setRotationPoint(-78F, -28F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, 7F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 7F, 0F, 3F, -7F, 0F, 0F, 0F); // Box 82
		bodyModel[33].setRotationPoint(-78F, -32F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, -1F, 0F, 0F, -4F, 7F, 0F, -4F, -7F, 0F, -1F, 0F, 0F, 1F, -4F, 0F, 3F, 4F, 0F, 2F, -5F, 0F, 0F, 3F); // Box 83
		bodyModel[34].setRotationPoint(-78F, -31F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 23, 18, 1, 0F,0F, -13F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -2F, 0F, -3F, 2F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -3F, -2F); // Box 84
		bodyModel[35].setRotationPoint(-78F, -47F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, -7F, 0F, -3F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -7F, 0F, 3F, 7F, 0F, 0F, 0F); // Box 85
		bodyModel[36].setRotationPoint(-78F, -32F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, -1F, 0F, 0F, -4F, -7F, 0F, -4F, 7F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 2F, -5F, 0F, 3F, 4F, 0F, 1F, -4F); // Box 86
		bodyModel[37].setRotationPoint(-78F, -31F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -1F, -1F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F); // Box 87
		bodyModel[38].setRotationPoint(-83F, -34F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, -1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, -1F); // Box 88
		bodyModel[39].setRotationPoint(-83F, -32F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 6F, 0F, 1F, -6F, 0F, 0F, 0F); // Box 89
		bodyModel[40].setRotationPoint(-83F, -33F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, 6F, 0F, 0F, 0F); // Box 91
		bodyModel[41].setRotationPoint(-83F, -33F, 1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 4F, -2F, 0F, 5F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -6F, 0F, -2F, 6F, 0F, -1F, 0F); // Box 92
		bodyModel[42].setRotationPoint(-83F, -33F, 1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 1F, 0F, 4F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -2F, 6F, 0F, -2F, -6F, 0F, -1F, -1F); // Box 93
		bodyModel[43].setRotationPoint(-83F, -33F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, -1F, 0F, -2F, -6F, 0F, -2F, 6F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 3F, -3F, 0F, 4F, 2F, 0F, 0F, 0F); // Box 94
		bodyModel[44].setRotationPoint(-83F, -32F, 1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -2F, 6F, 0F, -2F, -6F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 3F, -3F, 0F, 0F, -1F); // Box 95
		bodyModel[45].setRotationPoint(-83F, -32F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 268
		bodyModel[46].setRotationPoint(-30F, -57F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 18, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 269
		bodyModel[47].setRotationPoint(-30F, -47F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[48].setRotationPoint(-33F, -29F, -14F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 271
		bodyModel[49].setRotationPoint(-30F, -27F, -14F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 24, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[50].setRotationPoint(-54F, -37F, -12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 24, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[51].setRotationPoint(-54F, -29F, -14F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 24, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 274
		bodyModel[52].setRotationPoint(-54F, -27F, -14F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 24, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 275
		bodyModel[53].setRotationPoint(-54F, -37F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 24, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[54].setRotationPoint(-54F, -29F, 8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 24, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 277
		bodyModel[55].setRotationPoint(-54F, -27F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[56].setRotationPoint(-53F, -42F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 279
		bodyModel[57].setRotationPoint(-55F, -47F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[58].setRotationPoint(-58F, -43F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[59].setRotationPoint(-55F, -42F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 24, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[60].setRotationPoint(-54F, -31F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 24, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 284
		bodyModel[61].setRotationPoint(-78F, -31F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[62].setRotationPoint(-58F, -42F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 286
		bodyModel[63].setRotationPoint(-55F, -43F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[64].setRotationPoint(-55F, -37F, -12F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 288
		bodyModel[65].setRotationPoint(-55F, -43F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[66].setRotationPoint(-55F, -37F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 290
		bodyModel[67].setRotationPoint(-63F, -42F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 291
		bodyModel[68].setRotationPoint(-63F, -37F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[69].setRotationPoint(-63F, -43F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[70].setRotationPoint(-63F, -38F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 294
		bodyModel[71].setRotationPoint(-58F, -40F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[72].setRotationPoint(-62F, -37F, 4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 296
		bodyModel[73].setRotationPoint(-58F, -40F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[74].setRotationPoint(-62F, -37F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 11, 1, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[75].setRotationPoint(-50F, -35F, -7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[76].setRotationPoint(-34F, -34F, -7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 16, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 300
		bodyModel[77].setRotationPoint(-37F, -50F, -7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 51, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 370
		bodyModel[78].setRotationPoint(-45F, -25F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 51, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 371
		bodyModel[79].setRotationPoint(-45F, -20F, -6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -2F); // Box 372
		bodyModel[80].setRotationPoint(6F, -25F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -1F, -4F, -2F, -1F, -4F, 0F, 0F, -3F); // Box 374
		bodyModel[81].setRotationPoint(6F, -20F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, -1F, -4F); // Box 375
		bodyModel[82].setRotationPoint(-49F, -20F, -6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -3F); // Box 376
		bodyModel[83].setRotationPoint(-51F, -25F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 43, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[84].setRotationPoint(-92F, -23F, -0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 43, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 378
		bodyModel[85].setRotationPoint(-92F, -23F, 0.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 43, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[86].setRotationPoint(-92F, -23F, -1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 27, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[87].setRotationPoint(-118F, -24F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F); // Box 381
		bodyModel[88].setRotationPoint(-118F, -24F, 1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[89].setRotationPoint(-118F, -24F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 27, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[90].setRotationPoint(-118F, -22F, -1F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		tailModel[1] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 15
		tailModel[2] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 16
		tailModel[3] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 17
		tailModel[4] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 18
		tailModel[5] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 21
		tailModel[6] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 22
		tailModel[7] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 23
		tailModel[8] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 24
		tailModel[9] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 25
		tailModel[10] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 26
		tailModel[11] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 27
		tailModel[12] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 28
		tailModel[13] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 29
		tailModel[14] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 30
		tailModel[15] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 31
		tailModel[16] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 32
		tailModel[17] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 33
		tailModel[18] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 34
		tailModel[19] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 35
		tailModel[20] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 36
		tailModel[21] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 37
		tailModel[22] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 38
		tailModel[23] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 39
		tailModel[24] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 40
		tailModel[25] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 42
		tailModel[26] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 43
		tailModel[27] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 44
		tailModel[28] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 48
		tailModel[29] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 49
		tailModel[30] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 50
		tailModel[31] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 51
		tailModel[32] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 52
		tailModel[33] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 53
		tailModel[34] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 54
		tailModel[35] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 55
		tailModel[36] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 56
		tailModel[37] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 57
		tailModel[38] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 108
		tailModel[39] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 109
		tailModel[40] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 110
		tailModel[41] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 111
		tailModel[42] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 112
		tailModel[43] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 113
		tailModel[44] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 114
		tailModel[45] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 115
		tailModel[46] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 116
		tailModel[47] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 117
		tailModel[48] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 118
		tailModel[49] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 119

		tailModel[0].addShapeBox(0F, 0F, 0F, 75, 1, 14, 0F,0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 0F, 0F); // Box 1
		tailModel[0].setRotationPoint(39F, -58F, -7F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 75, 11, 1, 0F,0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 15
		tailModel[1].setRotationPoint(39F, -58F, -7F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 75, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F, -5F); // Box 16
		tailModel[2].setRotationPoint(39F, -47F, -10F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 75, 11, 1, 0F,0F, 0F, 0F, 0F, -6F, 2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 17
		tailModel[3].setRotationPoint(39F, -58F, 6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 75, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F, 5F); // Box 18
		tailModel[4].setRotationPoint(39F, -47F, 9F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 75, 1, 24, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 21
		tailModel[5].setRotationPoint(39F, -26F, -12F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 75, 2, 1, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 22
		tailModel[6].setRotationPoint(39F, -29F, -15F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 75, 2, 1, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, -3F, 4F, 0F, -1F, 2F); // Box 23
		tailModel[7].setRotationPoint(39F, -27F, -15F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 75, 2, 1, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 24
		tailModel[8].setRotationPoint(39F, -29F, 14F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 75, 2, 1, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -3F, 4F, 0F, -2F, -5F, 0F, 0F, -3F); // Box 25
		tailModel[9].setRotationPoint(39F, -27F, 14F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 33, 1, 10, 0F,0F, 0F, 0F, 0F, -8F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -3F, 0F, 8F, -3F, 0F, 0F, 0F); // Box 26
		tailModel[10].setRotationPoint(114F, -52F, -5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 33, 5, 1, 0F,0F, 0F, 0F, 0F, -8F, -3F, 0F, -8F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, -2F); // Box 27
		tailModel[11].setRotationPoint(114F, -52F, -5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 33, 16, 1, 0F,0F, 0F, 0F, 0F, -9F, -2F, 0F, -9F, 2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, -6F); // Box 28
		tailModel[12].setRotationPoint(114F, -47F, -7F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 33, 16, 1, 0F,0F, 0F, 0F, 0F, -9F, 2F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, 1F, 0F, -4F, -1F, 0F, 0F, 6F); // Box 29
		tailModel[13].setRotationPoint(114F, -47F, 6F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 33, 5, 1, 0F,0F, 0F, 0F, 0F, -8F, 3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 2F); // Box 30
		tailModel[14].setRotationPoint(114F, -52F, 4F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F,0F, 0F, 0F, 0F, 4F, -7F, 0F, 4F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, 0F, -4F, 7F, 0F, 0F, 0F); // Box 31
		tailModel[15].setRotationPoint(114F, -31F, -13F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F,0F, 0F, 0F, 0F, 4F, -7F, 0F, 4F, 7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -10F, 0F, -5F, 9F, 0F, -1F, 2F); // Box 32
		tailModel[16].setRotationPoint(114F, -29F, -13F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F,0F, 0F, 0F, 0F, 4F, 7F, 0F, 4F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 7F, 0F, -4F, -7F, 0F, 0F, 0F); // Box 33
		tailModel[17].setRotationPoint(114F, -31F, 12F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F,0F, 0F, 0F, 0F, 4F, 7F, 0F, 4F, -7F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -5F, 9F, 0F, -4F, -10F, 0F, 0F, -3F); // Box 34
		tailModel[18].setRotationPoint(114F, -29F, 12F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 33, 1, 20, 0F,0F, 0F, 0F, 0F, 4F, -7F, 0F, 4F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -7F, 0F, -4F, -7F, 0F, 0F, 0F); // Box 35
		tailModel[19].setRotationPoint(114F, -28F, -10F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 36
		tailModel[20].setRotationPoint(147F, -44F, -2F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F); // Box 37
		tailModel[21].setRotationPoint(147F, -32F, -3F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F); // Box 38
		tailModel[22].setRotationPoint(147F, -44F, -2F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 5F, -5F, 0F, 5F, 4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -5F, 0F, -7F, 4F, 0F, -1F, 2F); // Box 39
		tailModel[23].setRotationPoint(147F, -33F, -6F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 5F, 0F, 0F, 0F); // Box 40
		tailModel[24].setRotationPoint(147F, -35F, -6F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F); // Box 42
		tailModel[25].setRotationPoint(147F, -44F, 1F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 5F, 4F, 0F, 5F, -5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -7F, 4F, 0F, -7F, -5F, 0F, 0F, -3F); // Box 43
		tailModel[26].setRotationPoint(147F, -33F, 5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, 5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 5F, 0F, -5F, -5F, 0F, 0F, 0F); // Box 44
		tailModel[27].setRotationPoint(147F, -35F, 5F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 26, 42, 3, 0F,-9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[28].setRotationPoint(114F, -94F, -1.5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 17, 5, 3, 0F,-4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 49
		tailModel[29].setRotationPoint(123F, -99F, -1.5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,-4F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 50
		tailModel[30].setRotationPoint(127F, -101F, -1.5F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 15, 48, 3, 0F,0F, 0F, 0F, -8F, 0F, -1.5F, -8F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 51
		tailModel[31].setRotationPoint(140F, -94F, -1.5F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, -1.5F, 0F, 7F, -1.5F, 0F, 0F, 0F); // Box 52
		tailModel[32].setRotationPoint(139F, -46F, -1.5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,0F, 0F, -1F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 53
		tailModel[33].setRotationPoint(140F, -99F, -1.5F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1F); // Box 54
		tailModel[34].setRotationPoint(140F, -101F, -1.5F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 1, 41, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 12F, 1F, -0.5F, -9F, 1F, 1F, -9F, 1F, 1F, 12F, 1F, -0.5F); // Box 55
		tailModel[35].setRotationPoint(122F, -94F, -0.5F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 4F, 1F, -0.5F, -4F, 1F, 0F, -4F, 1F, 0F, 4F, 1F, -0.5F); // Box 56
		tailModel[36].setRotationPoint(126F, -99F, -0.5F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, 1F, -0.5F, -4F, 1F, 0F, -4F, 1F, 0F, 4F, 1F, -0.5F); // Box 57
		tailModel[37].setRotationPoint(130F, -101F, -0.5F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 44, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -1F, 0F); // Box 108
		tailModel[38].setRotationPoint(137F, -38F, -48F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		tailModel[39].setRotationPoint(143F, -38F, -53F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 6, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		tailModel[40].setRotationPoint(143F, -38F, -48F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,-2F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 111
		tailModel[41].setRotationPoint(137F, -38F, -53F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 6, 2, 44, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 112
		tailModel[42].setRotationPoint(149F, -38F, -48F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 113
		tailModel[43].setRotationPoint(149F, -38F, -53F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 6, 2, 44, 0F,8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 114
		tailModel[44].setRotationPoint(137F, -38F, 4F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 115
		tailModel[45].setRotationPoint(143F, -38F, 48F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 6, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		tailModel[46].setRotationPoint(143F, -38F, 4F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -2F); // Box 117
		tailModel[47].setRotationPoint(137F, -38F, 48F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 6, 2, 44, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 118
		tailModel[48].setRotationPoint(149F, -38F, 4F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F); // Box 119
		tailModel[49].setRotationPoint(149F, -38F, 48F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 120
		leftWingModel[1] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 121
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 122
		leftWingModel[3] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 123
		leftWingModel[4] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 124
		leftWingModel[5] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 184
		leftWingModel[6] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 185
		leftWingModel[7] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 186
		leftWingModel[8] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 187
		leftWingModel[9] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 188
		leftWingModel[10] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 189
		leftWingModel[11] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 190
		leftWingModel[12] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 191
		leftWingModel[13] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Box 192
		leftWingModel[14] = new ModelRendererTurbo(this, 617, 105, textureX, textureY); // Box 193
		leftWingModel[15] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 194
		leftWingModel[16] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 195
		leftWingModel[17] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 196
		leftWingModel[18] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 197
		leftWingModel[19] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 198
		leftWingModel[20] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 199
		leftWingModel[21] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 200
		leftWingModel[22] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 201
		leftWingModel[23] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 202
		leftWingModel[24] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 203
		leftWingModel[25] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 204
		leftWingModel[26] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 205
		leftWingModel[27] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 206
		leftWingModel[28] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 207
		leftWingModel[29] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 208
		leftWingModel[30] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 225
		leftWingModel[31] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 240
		leftWingModel[32] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 241
		leftWingModel[33] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 242
		leftWingModel[34] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 243
		leftWingModel[35] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 244
		leftWingModel[36] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 245
		leftWingModel[37] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 246
		leftWingModel[38] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 247
		leftWingModel[39] = new ModelRendererTurbo(this, 969, 97, textureX, textureY); // Box 248
		leftWingModel[40] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 249
		leftWingModel[41] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 259
		leftWingModel[42] = new ModelRendererTurbo(this, 721, 105, textureX, textureY); // Box 260
		leftWingModel[43] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 261
		leftWingModel[44] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 262
		leftWingModel[45] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 263
		leftWingModel[46] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 264
		leftWingModel[47] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 265
		leftWingModel[48] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 266
		leftWingModel[49] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Box 267
		leftWingModel[50] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 305
		leftWingModel[51] = new ModelRendererTurbo(this, 713, 169, textureX, textureY); // Box 356
		leftWingModel[52] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Box 357
		leftWingModel[53] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 358
		leftWingModel[54] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 359
		leftWingModel[55] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 360
		leftWingModel[56] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 361
		leftWingModel[57] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 362
		leftWingModel[58] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 363
		leftWingModel[59] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 364

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 8, 9, 148, 0F,1F, 5F, 0F, -5F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 1F, -10F, 0F, -5F, -10F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 120
		leftWingModel[0].setRotationPoint(-16F, -40F, -158F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 4, 9, 148, 0F,0F, 4F, 0F, -1F, 5F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, -11F, 0F, -1F, -10F, 0F, 0F, 5F, 0F, 0F, 3F, 0F); // Box 121
		leftWingModel[1].setRotationPoint(-20F, -40F, -158F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 3, 7, 148, 0F,-1F, 4F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, 3F, -1F, 0F, -1F, -11F, 0F, 0F, -10F, 0F, 0F, 4F, 0F, 3F, -1F, 0F); // Box 122
		leftWingModel[2].setRotationPoint(-23F, -39F, -158F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 17, 9, 148, 0F,5F, 5F, 0F, -15F, 4F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 5F, -10F, 0F, -15F, -11F, 0F, 0F, 3F, 0F, 0F, 5F, 0F); // Box 123
		leftWingModel[3].setRotationPoint(-8F, -40F, -158F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 27, 7, 148, 0F,15F, 5F, 0F, -35F, 4F, 0F, -4F, -5F, 0F, 0F, 2F, 0F, 15F, -10F, 0F, -35F, -11F, 0F, -4F, -2F, 0F, 0F, 4F, 0F); // Box 124
		leftWingModel[4].setRotationPoint(9F, -39F, -158F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 21, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		leftWingModel[5].setRotationPoint(-51F, -39F, -55F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 21, 4, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		leftWingModel[6].setRotationPoint(-51F, -43F, -55F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 21, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 186
		leftWingModel[7].setRotationPoint(-51F, -30F, -55F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 21, 2, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		leftWingModel[8].setRotationPoint(-51F, -45F, -52F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 21, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 188
		leftWingModel[9].setRotationPoint(-51F, -26F, -52F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 20, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		leftWingModel[10].setRotationPoint(-30F, -38F, -52F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 15, 2, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		leftWingModel[11].setRotationPoint(-30F, -43F, -49F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 20, 3, 17, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		leftWingModel[12].setRotationPoint(-30F, -41F, -52F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 20, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 192
		leftWingModel[13].setRotationPoint(-30F, -31F, -52F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 20, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 193
		leftWingModel[14].setRotationPoint(-30F, -28F, -49F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 16, 7, 17, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 194
		leftWingModel[15].setRotationPoint(-10F, -38F, -52F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F); // Box 195
		leftWingModel[16].setRotationPoint(-10F, -28F, -49F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F); // Box 196
		leftWingModel[17].setRotationPoint(-10F, -31F, -52F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 197
		leftWingModel[18].setRotationPoint(-54F, -45F, -49F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 2F, -1F); // Box 198
		leftWingModel[19].setRotationPoint(-54F, -45F, -39F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 199
		leftWingModel[20].setRotationPoint(-54F, -43F, -37F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 200
		leftWingModel[21].setRotationPoint(-54F, -39F, -34F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 201
		leftWingModel[22].setRotationPoint(-54F, -39F, -55F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 202
		leftWingModel[23].setRotationPoint(-54F, -43F, -52F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 203
		leftWingModel[24].setRotationPoint(-54F, -45F, -52F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 204
		leftWingModel[25].setRotationPoint(-54F, -30F, -52F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 205
		leftWingModel[26].setRotationPoint(-54F, -30F, -37F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 206
		leftWingModel[27].setRotationPoint(-54F, -25F, -39F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 207
		leftWingModel[28].setRotationPoint(-54F, -25F, -49F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 2F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 208
		leftWingModel[29].setRotationPoint(-54F, -25F, -52F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 16, 7, 17, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 225
		leftWingModel[30].setRotationPoint(-10F, -38F, 35F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 8, 8, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		leftWingModel[31].setRotationPoint(-59F, -39F, -50F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 5, 8, 8, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 241
		leftWingModel[32].setRotationPoint(-64F, -39F, -48F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		leftWingModel[33].setRotationPoint(-59F, -41F, -48F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftWingModel[34].setRotationPoint(-59F, -39F, -48F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 8, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 244
		leftWingModel[35].setRotationPoint(-59F, -39F, -40F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 245
		leftWingModel[36].setRotationPoint(-59F, -31F, -48F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 246
		leftWingModel[37].setRotationPoint(-59F, -31F, -49F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingModel[38].setRotationPoint(-59F, -41F, -49F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 248
		leftWingModel[39].setRotationPoint(-59F, -41F, -40F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F); // Box 249
		leftWingModel[40].setRotationPoint(-59F, -31F, -40F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 8, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 259
		leftWingModel[41].setRotationPoint(-59F, -39F, 48F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 5, 8, 8, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 260
		leftWingModel[42].setRotationPoint(-64F, -39F, 40F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftWingModel[43].setRotationPoint(-59F, -41F, 40F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 8, 8, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftWingModel[44].setRotationPoint(-59F, -39F, 38F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 263
		leftWingModel[45].setRotationPoint(-59F, -31F, 40F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F); // Box 264
		leftWingModel[46].setRotationPoint(-59F, -31F, 48F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 265
		leftWingModel[47].setRotationPoint(-59F, -41F, 48F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		leftWingModel[48].setRotationPoint(-59F, -41F, 39F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 267
		leftWingModel[49].setRotationPoint(-59F, -31F, 39F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		leftWingModel[50].setRotationPoint(-10F, -36F, -45F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 13, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		leftWingModel[51].setRotationPoint(-15.5F, -40F, -45F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		leftWingModel[52].setRotationPoint(-15.5F, -42F, -45F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		leftWingModel[53].setRotationPoint(-12.5F, -43F, -45F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 359
		leftWingModel[54].setRotationPoint(-17.5F, -40F, -45F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F); // Box 360
		leftWingModel[55].setRotationPoint(-18.5F, -37F, -45F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 361
		leftWingModel[56].setRotationPoint(-15.5F, -27F, -45F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 362
		leftWingModel[57].setRotationPoint(-12.5F, -25F, -45F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 363
		leftWingModel[58].setRotationPoint(-2.5F, -40F, -45F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F); // Box 364
		leftWingModel[59].setRotationPoint(-0.5F, -37F, -45F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 553, 249, textureX, textureY); // Box 210
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 211
		rightWingModel[2] = new ModelRendererTurbo(this, 721, 265, textureX, textureY); // Box 212
		rightWingModel[3] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 213
		rightWingModel[4] = new ModelRendererTurbo(this, 161, 409, textureX, textureY); // Box 214
		rightWingModel[5] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 215
		rightWingModel[6] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 216
		rightWingModel[7] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 217
		rightWingModel[8] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 218
		rightWingModel[9] = new ModelRendererTurbo(this, 553, 129, textureX, textureY); // Box 219
		rightWingModel[10] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Box 220
		rightWingModel[11] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 221
		rightWingModel[12] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 222
		rightWingModel[13] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 223
		rightWingModel[14] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 224
		rightWingModel[15] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 226
		rightWingModel[16] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 227
		rightWingModel[17] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 228
		rightWingModel[18] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 229
		rightWingModel[19] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 230
		rightWingModel[20] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 231
		rightWingModel[21] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 232
		rightWingModel[22] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 233
		rightWingModel[23] = new ModelRendererTurbo(this, 577, 89, textureX, textureY); // Box 234
		rightWingModel[24] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 235
		rightWingModel[25] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 236
		rightWingModel[26] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 237
		rightWingModel[27] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 238
		rightWingModel[28] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 239
		rightWingModel[29] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 302
		rightWingModel[30] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 347
		rightWingModel[31] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 348
		rightWingModel[32] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 349
		rightWingModel[33] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 350
		rightWingModel[34] = new ModelRendererTurbo(this, 553, 129, textureX, textureY); // Box 351
		rightWingModel[35] = new ModelRendererTurbo(this, 673, 169, textureX, textureY); // Box 352
		rightWingModel[36] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 353
		rightWingModel[37] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 354
		rightWingModel[38] = new ModelRendererTurbo(this, 617, 129, textureX, textureY); // Box 355

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 8, 9, 148, 0F,0F, 5F, 0F, 0F, 5F, 0F, -5F, 5F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -5F, -10F, 0F, 1F, -10F, 0F); // Box 210
		rightWingModel[0].setRotationPoint(-16F, -40F, 10F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 4, 9, 148, 0F,0F, 3F, 0F, 0F, 5F, 0F, -1F, 5F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, -1F, -10F, 0F, 0F, -11F, 0F); // Box 211
		rightWingModel[1].setRotationPoint(-20F, -40F, 10F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 3, 7, 148, 0F,3F, -1F, 0F, 0F, 4F, 0F, 0F, 5F, 0F, -1F, 4F, 0F, 3F, -1F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, -1F, -11F, 0F); // Box 212
		rightWingModel[2].setRotationPoint(-23F, -39F, 10F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 17, 9, 148, 0F,0F, 5F, 0F, 0F, 1F, 0F, -15F, 4F, 0F, 5F, 5F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, -15F, -11F, 0F, 5F, -10F, 0F); // Box 213
		rightWingModel[3].setRotationPoint(-8F, -40F, 10F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 27, 7, 148, 0F,0F, 2F, 0F, -4F, -5F, 0F, -35F, 4F, 0F, 15F, 5F, 0F, 0F, 4F, 0F, -4F, -2F, 0F, -35F, -11F, 0F, 15F, -10F, 0F); // Box 214
		rightWingModel[4].setRotationPoint(9F, -39F, 10F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 21, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightWingModel[5].setRotationPoint(-51F, -39F, 33F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 21, 4, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightWingModel[6].setRotationPoint(-51F, -43F, 33F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 21, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 217
		rightWingModel[7].setRotationPoint(-51F, -30F, 33F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 21, 2, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightWingModel[8].setRotationPoint(-51F, -45F, 36F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 21, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 219
		rightWingModel[9].setRotationPoint(-51F, -26F, 36F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 20, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightWingModel[10].setRotationPoint(-30F, -38F, 35F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 15, 2, 11, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightWingModel[11].setRotationPoint(-30F, -43F, 38F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 20, 3, 17, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightWingModel[12].setRotationPoint(-30F, -41F, 35F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 20, 3, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 223
		rightWingModel[13].setRotationPoint(-30F, -31F, 35F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 20, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 224
		rightWingModel[14].setRotationPoint(-30F, -28F, 38F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F); // Box 226
		rightWingModel[15].setRotationPoint(-10F, -28F, 38F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -3F); // Box 227
		rightWingModel[16].setRotationPoint(-10F, -31F, 35F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 228
		rightWingModel[17].setRotationPoint(-54F, -45F, 39F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 229
		rightWingModel[18].setRotationPoint(-54F, -45F, 36F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 230
		rightWingModel[19].setRotationPoint(-54F, -43F, 36F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 231
		rightWingModel[20].setRotationPoint(-54F, -39F, 33F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 232
		rightWingModel[21].setRotationPoint(-54F, -39F, 54F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 233
		rightWingModel[22].setRotationPoint(-54F, -43F, 51F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 2F, -1F); // Box 234
		rightWingModel[23].setRotationPoint(-54F, -45F, 49F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 235
		rightWingModel[24].setRotationPoint(-54F, -30F, 51F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 236
		rightWingModel[25].setRotationPoint(-54F, -30F, 36F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 2F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 237
		rightWingModel[26].setRotationPoint(-54F, -25F, 36F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 238
		rightWingModel[27].setRotationPoint(-54F, -25F, 39F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 239
		rightWingModel[28].setRotationPoint(-54F, -25F, 49F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightWingModel[29].setRotationPoint(-10F, -36F, 42F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 13, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		rightWingModel[30].setRotationPoint(-15.5F, -40F, 42F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		rightWingModel[31].setRotationPoint(-15.5F, -42F, 42F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		rightWingModel[32].setRotationPoint(-12.5F, -43F, 42F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 350
		rightWingModel[33].setRotationPoint(-17.5F, -40F, 42F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F); // Box 351
		rightWingModel[34].setRotationPoint(-18.5F, -37F, 42F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 352
		rightWingModel[35].setRotationPoint(-15.5F, -27F, 42F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 353
		rightWingModel[36].setRotationPoint(-12.5F, -25F, 42F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 354
		rightWingModel[37].setRotationPoint(-2.5F, -40F, 42F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F); // Box 355
		rightWingModel[38].setRotationPoint(-0.5F, -37F, 42F);
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 365
		tailWheelModel[1] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 366
		tailWheelModel[2] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 367
		tailWheelModel[3] = new ModelRendererTurbo(this, 793, 105, textureX, textureY); // Box 368
		tailWheelModel[4] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 369

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		tailWheelModel[0].setRotationPoint(139F, -31F, 2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		tailWheelModel[1].setRotationPoint(139F, -25F, 0F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		tailWheelModel[2].setRotationPoint(136F, -26F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		tailWheelModel[3].setRotationPoint(136F, -28F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 369
		tailWheelModel[4].setRotationPoint(136F, -23F, -1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 307
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 308
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 310
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 311
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 318
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 319
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Box 320
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 330
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 331
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Box 332
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 333

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 13, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		leftWingWheelModel[0].setRotationPoint(-33.5F, -14F, -45F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		leftWingWheelModel[1].setRotationPoint(-30.5F, -17F, -45F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		leftWingWheelModel[2].setRotationPoint(-28F, -8F, -42F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		leftWingWheelModel[3].setRotationPoint(-28F, -29F, -40F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		leftWingWheelModel[4].setRotationPoint(-33.5F, -16F, -45F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F); // Box 319
		leftWingWheelModel[5].setRotationPoint(-36.5F, -11F, -45F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 320
		leftWingWheelModel[6].setRotationPoint(-33.5F, -1F, -45F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 330
		leftWingWheelModel[7].setRotationPoint(-35.5F, -14F, -45F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F); // Box 331
		leftWingWheelModel[8].setRotationPoint(-18.5F, -11F, -45F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 332
		leftWingWheelModel[9].setRotationPoint(-20.5F, -14F, -45F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 333
		leftWingWheelModel[10].setRotationPoint(-30.5F, 1F, -45F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 905, 161, textureX, textureY); // Box 334
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 335
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 336
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 337
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 338
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 339
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 340
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 341
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 342
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 343
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 344

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 13, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		rightWingWheelModel[0].setRotationPoint(-33.5F, -14F, 42F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		rightWingWheelModel[1].setRotationPoint(-30.5F, -17F, 42F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		rightWingWheelModel[2].setRotationPoint(-28F, -8F, 40F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightWingWheelModel[3].setRotationPoint(-28F, -29F, 38F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		rightWingWheelModel[4].setRotationPoint(-33.5F, -16F, 42F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F); // Box 339
		rightWingWheelModel[5].setRotationPoint(-36.5F, -11F, 42F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 13, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 340
		rightWingWheelModel[6].setRotationPoint(-33.5F, -1F, 42F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 341
		rightWingWheelModel[7].setRotationPoint(-35.5F, -14F, 42F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F); // Box 342
		rightWingWheelModel[8].setRotationPoint(-18.5F, -11F, 42F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 343
		rightWingWheelModel[9].setRotationPoint(-20.5F, -14F, 42F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 344
		rightWingWheelModel[10].setRotationPoint(-30.5F, 1F, 42F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-57F, -35F, 44F);
		propellerModels[1] = makeProp2(-57F, -35F, -44F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 30, 512, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 30, 512, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 30, 512, textureX, textureY);
		prop[0].addBox(-0.5F, -27F, -1.5F, 1, 27, 3, 0.0F);
		prop[1].addBox(-0.5F, -27F, -1.5F, 1, 27, 3, 0.0F);
		prop[2].addBox(-0.5F, -27F, -1.5F, 1, 27, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 30, 510, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 30, 510, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 30, 510, textureX, textureY);
		prop[0].addBox(-0.5F, -27F, -1.5F, 1, 27, 3, 0.0F);
		prop[1].addBox(-0.5F, -27F, -1.5F, 1, 27, 3, 0.0F);
		prop[2].addBox(-0.5F, -27F, -1.5F, 1, 27, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}