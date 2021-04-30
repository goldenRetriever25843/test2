//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mirage3
// Model Creator: 
// Created on: 10.07.2015 - 12:02:04
// Last changed on: 10.07.2015 - 12:02:04

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMirage3 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMirage3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[73];
		tailModel = new ModelRendererTurbo[6];
		leftWingModel = new ModelRendererTurbo[3];
		rightWingModel = new ModelRendererTurbo[3];
		yawFlapModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		bodyWheelModel = new ModelRendererTurbo[22];
		leftWingWheelModel = new ModelRendererTurbo[14];
		rightWingWheelModel = new ModelRendererTurbo[14];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 7
		bodyModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 388
		bodyModel[18] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 397
		bodyModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 399
		bodyModel[20] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 54
		bodyModel[21] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 60
		bodyModel[22] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 61
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 62
		bodyModel[24] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 72
		bodyModel[26] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 74
		bodyModel[27] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 75
		bodyModel[28] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 76
		bodyModel[29] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 77
		bodyModel[30] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 78
		bodyModel[31] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 79
		bodyModel[32] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 80
		bodyModel[33] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 81
		bodyModel[34] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 82
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 405
		bodyModel[36] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 407
		bodyModel[37] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 408
		bodyModel[38] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 409
		bodyModel[39] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 410
		bodyModel[40] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 141
		bodyModel[41] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 142
		bodyModel[42] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 143
		bodyModel[43] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 144
		bodyModel[44] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 145
		bodyModel[45] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 421
		bodyModel[46] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 481
		bodyModel[47] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 482
		bodyModel[48] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 523
		bodyModel[49] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 527
		bodyModel[50] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 530
		bodyModel[51] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 532
		bodyModel[52] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 153
		bodyModel[53] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 154
		bodyModel[54] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 152
		bodyModel[55] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 153
		bodyModel[56] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 154
		bodyModel[57] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 155
		bodyModel[58] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 156
		bodyModel[59] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 157
		bodyModel[60] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 158
		bodyModel[61] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 159
		bodyModel[62] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 160
		bodyModel[63] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 161
		bodyModel[64] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 133
		bodyModel[65] = new ModelRendererTurbo(this, 377, 313, textureX, textureY); // Box 134
		bodyModel[66] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 135
		bodyModel[67] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 136
		bodyModel[68] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 137
		bodyModel[69] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 138
		bodyModel[70] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 139
		bodyModel[71] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 140
		bodyModel[72] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 141

		bodyModel[0].addShapeBox(0F, 0F, 0F, 41, 9, 11, 0F,0F, 0F, 0F, 0F, 2.5F, 2.5F, 0F, -3.5F, -6F, 0F, -5F, -1.5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 3F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-16F, -38F, 6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 55, 7, 21, 0F,0F, 3F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 3F, -7F, 0F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1.5F); // Box 7
		bodyModel[1].setRotationPoint(56F, -36.5F, -10.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 55, 7, 21, 0F,0F, 3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 8
		bodyModel[2].setRotationPoint(56F, -29.5F, -10.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 31, 6, 21, 0F,0F, 1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 1F, -7F, 0F, -1F, 0.5F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -1F, 0.5F); // Box 10
		bodyModel[3].setRotationPoint(25F, -39.5F, -10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 37, 1, 7, 0F,0F, 0F, 0F, 0F, 4.5F, 3F, 0F, -0.5F, -0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 0F, -0.5F, 0F, 2F, -1F); // Box 11
		bodyModel[4].setRotationPoint(-53F, -33.5F, 9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 37, 7, 1, 0F,0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Box 12
		bodyModel[5].setRotationPoint(-53F, -33F, 14.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 37, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, -2F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F); // Box 13
		bodyModel[6].setRotationPoint(-53F, -26F, 14.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 37, 1, 7, 0F,0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0F, -0.5F, -0.5F, 0F, -2F, -1F); // Box 14
		bodyModel[7].setRotationPoint(-53F, -19.5F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 37, 14, 1, 0F,0F, 0F, 0F, 0F, 4.5F, 3F, 0F, 3.5F, -3F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 2.5F, 3F, 0F, 2.5F, -3F, 0F, 0.5F, -1F); // Box 20
		bodyModel[8].setRotationPoint(-53F, -33.5F, 9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 23, 7, 6, 0F,0F, -6.8F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -6.8F, -5.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F); // Box 22
		bodyModel[9].setRotationPoint(-58F, -33.5F, 9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 23, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, -6.8F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -6.8F, -5.8F); // Box 23
		bodyModel[10].setRotationPoint(-58F, -26.5F, 9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 41, 9, 11, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1.5F, 2.5F, 0F, -3.5F, -5F, 0F, -5F, -2.5F); // Box 26
		bodyModel[11].setRotationPoint(-16F, -23F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 76, 6, 7, 0F,1F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -0.5F, 0F, 3.1F, 0F, 3.5F, 0F, 2F, 7.5F, 0F, 2F, 7.5F, 3.1F, 0F, 3.5F); // Box 29
		bodyModel[12].setRotationPoint(-51F, -42.5F, -3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 64, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0.5F); // Box 30
		bodyModel[13].setRotationPoint(-54F, -36.5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 79, 3, 13, 0F,0F, 0F, 1F, 0F, 3F, 4F, 0F, 3F, 4F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -2F); // Box 31
		bodyModel[14].setRotationPoint(-54F, -19.5F, -6.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 64, 9, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[15].setRotationPoint(-39F, -28.5F, -7.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 55, 7, 21, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 1F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 1F, -6F); // Box 34
		bodyModel[16].setRotationPoint(56F, -22.5F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 70, 30, 1, 0F,-50F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -50F, 0F, 0F, 12F, 0F, 0F, -16F, 1F, 0F, -16F, 1F, 0F, 12F, 0F, 0F); // Box 388
		bodyModel[17].setRotationPoint(50F, -66.5F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 23F, 0F, 0F); // Box 397
		bodyModel[18].setRotationPoint(115F, -74.5F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 2F, 0.4F, 0F); // Box 399
		bodyModel[19].setRotationPoint(108F, -42F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 41, 2, 13, 0F,0F, 0F, -1.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.7F, 0F, -0.5F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, -3F); // Box 54
		bodyModel[20].setRotationPoint(-95F, -19.5F, -6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 15, 5, 15, 0F,0F, 2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -2F, 0F, -3F, -5F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, -3F, -5F); // Box 60
		bodyModel[21].setRotationPoint(-110F, -21.5F, -7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 28, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 61
		bodyModel[22].setRotationPoint(69F, -38.8F, -1.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 30, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F); // Box 62
		bodyModel[23].setRotationPoint(97F, -38.8F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 63
		bodyModel[24].setRotationPoint(127F, -38.8F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 41, 13, 1, 0F,0F, -4F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.2F); // Box 72
		bodyModel[25].setRotationPoint(-95F, -32.5F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 41, 13, 1, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -4F, 1F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -2F, 1F); // Box 74
		bodyModel[26].setRotationPoint(-95F, -32.5F, 4.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 15, 7, 13, 0F,0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 75
		bodyModel[27].setRotationPoint(-110F, -28.5F, -6.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 15, 2, 13, 0F,0F, -2F, -3.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -2F, -3.5F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // Box 76
		bodyModel[28].setRotationPoint(-110F, -30.5F, -6.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 5, 15, 0F,0F, 2F, -7.4F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 2F, -7.4F, 0F, -6.8F, -7.4F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -6.8F, -7.4F); // Box 77
		bodyModel[29].setRotationPoint(-127F, -21.5F, -7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 4, 15, 0F,0F, -6F, -7.4F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, -6F, -7.4F, 0F, 2.2F, -7.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2.2F, -7.4F); // Box 78
		bodyModel[30].setRotationPoint(-127F, -29.5F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 17, 4, 11, 0F,0F, -2F, -5.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5.4F, 0F, -1.8F, -5.4F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, -5.4F); // Box 79
		bodyModel[31].setRotationPoint(-127F, -25.5F, -5.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,-3F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -1F, 0F, 0F, -1F, 2F, 0F, 3F, 2F, 0F, 3F, 0F, 0F, -1F); // Box 80
		bodyModel[32].setRotationPoint(-97F, -34F, -2.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 3.5F, 0F, 5F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 81
		bodyModel[33].setRotationPoint(-95F, -31.5F, -3.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, 0F, 0.5F, 0F, 5F, -3.5F, 0F, 5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 1F); // Box 82
		bodyModel[34].setRotationPoint(-95F, -31.5F, 2.5F);

		bodyModel[35].addShapeBox(0F, 1F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 405
		bodyModel[35].setRotationPoint(-75F, -42F, 0F);
		bodyModel[35].rotateAngleZ = 0.41887902F;

		bodyModel[36].addShapeBox(0F, 1F, 2.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 407
		bodyModel[36].setRotationPoint(-75F, -42F, -1F);
		bodyModel[36].rotateAngleZ = 0.41887902F;

		bodyModel[37].addShapeBox(0F, 5F, 6.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[37].setRotationPoint(-75F, -42F, -1F);
		bodyModel[37].rotateAngleZ = 0.41887902F;

		bodyModel[38].addShapeBox(0F, 1F, -6.5F, 1, 1, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 409
		bodyModel[38].setRotationPoint(-75F, -42F, 1F);
		bodyModel[38].rotateAngleZ = 0.41887902F;

		bodyModel[39].addShapeBox(0F, 5F, -7.5F, 1, 8, 1, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 410
		bodyModel[39].setRotationPoint(-75F, -42F, 1F);
		bodyModel[39].rotateAngleZ = 0.41887902F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F); // Box 141
		bodyModel[40].setRotationPoint(-89F, -33F, -2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 4, 11, 0F,0F, -2.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 142
		bodyModel[41].setRotationPoint(-84F, -35F, -5.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 143
		bodyModel[42].setRotationPoint(-77.5F, -37.5F, -1.5F);
		bodyModel[42].rotateAngleZ = -0.08726646F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		bodyModel[43].setRotationPoint(-76.5F, -39F, -1.8F);
		bodyModel[43].rotateAngleZ = -0.08726646F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[44].setRotationPoint(-76.5F, -39F, 0.8F);
		bodyModel[44].rotateAngleZ = -0.08726646F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[45].setRotationPoint(-57.5F, -35F, -3F);
		bodyModel[45].rotateAngleZ = -0.26179939F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,-0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[46].setRotationPoint(-58.5F, -40F, -3F);
		bodyModel[46].rotateAngleZ = 0.17453293F;

		bodyModel[47].addShapeBox(0F, -1F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[47].setRotationPoint(-53F, -39.5F, -3F);
		bodyModel[47].rotateAngleZ = -0.31415927F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[48].setRotationPoint(-66.5F, -28F, -3F);

		bodyModel[49].addShapeBox(7.4F, 3F, 0F, 8, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[49].setRotationPoint(-89.5F, -31.4F, -1F);
		bodyModel[49].rotateAngleZ = 0.34906585F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[50].setRotationPoint(-75.5F, -31F, -5.5F);

		bodyModel[51].addShapeBox(0F, 3F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[51].setRotationPoint(-79.5F, -27.4F, -5F);
		bodyModel[51].rotateAngleZ = 1.43116999F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[52].setRotationPoint(-75.5F, -31F, 3.5F);

		bodyModel[53].addShapeBox(0F, 3F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[53].setRotationPoint(-79.5F, -27.4F, 3F);
		bodyModel[53].rotateAngleZ = 1.43116999F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 31, 10, 21, 0F,0F, 0.5F, 3.5F, 0F, -3F, 1.5F, 0F, -3F, 1.5F, 0F, 0.5F, 3.5F, 0F, -2F, 1.5F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, -2F, 1.5F); // Box 152
		bodyModel[54].setRotationPoint(25F, -25.5F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 41, 9, 11, 0F,0F, -5F, -1.5F, 0F, -3.5F, -6F, 0F, 2.5F, 2.5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 153
		bodyModel[55].setRotationPoint(-16F, -38F, -17F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 37, 1, 7, 0F,0F, -2F, -1F, 0F, -0.5F, -0.5F, 0F, 4.5F, 3F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, -0.5F, 0F, -4F, 3F, 0F, 0F, 0F); // Box 154
		bodyModel[56].setRotationPoint(-53F, -33.5F, -16F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 37, 7, 1, 0F,0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 155
		bodyModel[57].setRotationPoint(-53F, -33F, -15.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 37, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, 1.5F); // Box 156
		bodyModel[58].setRotationPoint(-53F, -26F, -15.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 37, 1, 7, 0F,0F, 2F, -1F, 0F, 0F, -0.5F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -0.5F, -0.5F, 0F, 1.5F, 1F, 0F, 0F, 0F); // Box 157
		bodyModel[59].setRotationPoint(-53F, -19.5F, -15F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 37, 14, 1, 0F,0F, 0F, 0F, 0F, 3.5F, -3F, 0F, 4.5F, 3F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 2.5F, -3F, 0F, 2.5F, 3F, 0F, 1F, 1F); // Box 158
		bodyModel[60].setRotationPoint(-53F, -33.5F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 23, 7, 6, 0F,0F, -6.8F, -5.8F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -6.8F, 0F, 0F, 0F, -5.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[61].setRotationPoint(-58F, -33.5F, -15.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 23, 7, 6, 0F,0F, 0F, -5.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.8F, -5.8F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -6.8F, 0F); // Box 160
		bodyModel[62].setRotationPoint(-58F, -26.5F, -15.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 41, 9, 11, 0F,0F, 3F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -5F, -2.5F, 0F, -3.5F, -5F, 0F, -1.5F, 2.5F, 0F, -3F, 0F); // Box 161
		bodyModel[63].setRotationPoint(-16F, -23F, -17F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 30, 13, 14, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 133
		bodyModel[64].setRotationPoint(-54F, -32.5F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 31, 8, 22, 0F,0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.5F, 3F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0.5F, 3F); // Box 134
		bodyModel[65].setRotationPoint(25F, -34.5F, -11F);

		bodyModel[66].addShapeBox(-8.5F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[66].setRotationPoint(-127F, -23.7F, -0.5F);

		bodyModel[67].addShapeBox(-10.5F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F); // Box 136
		bodyModel[67].setRotationPoint(-127F, -23.7F, -0.5F);

		bodyModel[68].addShapeBox(-16.5F, 0F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 137
		bodyModel[68].setRotationPoint(-127F, -23.7F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 60, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -9F, -3F); // Box 138
		bodyModel[69].setRotationPoint(32F, -18.5F, -3.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 25, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 0F, -1F); // Box 139
		bodyModel[70].setRotationPoint(92F, -18.5F, -3.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -0.5F, -1F); // Box 140
		bodyModel[71].setRotationPoint(-86F, -19.5F, -4.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 5, 9, 0F,3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 0F, -2.5F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.5F, -3F); // Box 141
		bodyModel[72].setRotationPoint(-93F, -19.5F, -4.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		tailModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		tailModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		tailModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 4
		tailModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 5
		tailModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6

		tailModel[0].addShapeBox(0F, 0F, 0F, 12, 7, 21, 0F,0F, 0F, -7F, 0F, -1.5F, -7.5F, 0F, -1.5F, -7.5F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F); // Box 1
		tailModel[0].setRotationPoint(111F, -36.5F, -10.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 12, 7, 21, 0F,0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F); // Box 2
		tailModel[1].setRotationPoint(111F, -29.5F, -10.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 12, 7, 21, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1.5F, -7.5F, 0F, -1.5F, -7.5F, 0F, 0F, -7F); // Box 3
		tailModel[2].setRotationPoint(111F, -22.5F, -10.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 4, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -5F); // Box 4
		tailModel[3].setRotationPoint(123F, -23F, -8F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 4, 6, 16, 0F,0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 5
		tailModel[4].setRotationPoint(123F, -35F, -8F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 4, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 6
		tailModel[5].setRotationPoint(123F, -29F, -8F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 89, 305, textureX, textureY); // Box 162
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 142
		leftWingModel[2] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 144

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 111, 5, 62, 0F,-109F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -109F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 7F, 0F, 0F, 10F); // Box 162
		leftWingModel[0].setRotationPoint(-36F, -22F, -73F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftWingModel[1].setRotationPoint(58F, -18.5F, -59.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 144
		leftWingModel[2].setRotationPoint(58F, -17.5F, -36.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 37
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 140
		rightWingModel[2] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 143

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 111, 5, 62, 0F,-4F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, -109F, -3F, 0F, 0F, 0F, 10F, 0F, 0F, 7F, 0F, -1F, 0F, -109F, -1F, 0F); // Box 37
		rightWingModel[0].setRotationPoint(-36F, -22F, 11F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 140
		rightWingModel[1].setRotationPoint(58F, -18.5F, 58.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 28, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 143
		rightWingModel[2].setRotationPoint(58F, -17.5F, 35.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 389

		yawFlapModel[0].addShapeBox(-2F, -11F, -0.5F, 12, 25, 1, 0F,-4F, 0.5F, 0F, -0.5F, 3.5F, 0F, -0.5F, 3.5F, 0F, -4F, 0.5F, 0F, 0.5F, -2F, 0F, -2.2F, -6F, 0F, -2.2F, -6F, 0F, 0.5F, -2F, 0F); // Box 389
		yawFlapModel[0].setRotationPoint(115F, -52.5F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.37524579F;
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 163
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 164

		pitchFlapLeftWingModel[0].addShapeBox(0F, -0.5F, 0F, 15, 1, 35, 0F,0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		pitchFlapLeftWingModel[0].setRotationPoint(75F, -18.5F, -73F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, -0.5F, 0F, 15, 1, 24, 0F,0F, 1.5F, 0F, 0F, 1F, 0F, 1.5F, 2F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 0F, 0.5F, 0F); // Box 164
		pitchFlapLeftWingModel[1].setRotationPoint(75F, -18.5F, -37.8F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 45
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 46

		pitchFlapRightWingModel[0].addShapeBox(0F, -0.5F, 0F, 15, 1, 35, 0F,0F, 1.5F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 45
		pitchFlapRightWingModel[0].setRotationPoint(75F, -18.5F, 38F);

		pitchFlapRightWingModel[1].addShapeBox(0F, -0.5F, 0F, 15, 1, 24, 0F,0F, 2.5F, 0F, 1.5F, 2F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		pitchFlapRightWingModel[1].setRotationPoint(75F, -18.5F, 13.8F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 422
		bodyWheelModel[1] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 423
		bodyWheelModel[2] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 424
		bodyWheelModel[3] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 425
		bodyWheelModel[4] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 426
		bodyWheelModel[5] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 427
		bodyWheelModel[6] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 428
		bodyWheelModel[7] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 429
		bodyWheelModel[8] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 430
		bodyWheelModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 431
		bodyWheelModel[10] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 432
		bodyWheelModel[11] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 433
		bodyWheelModel[12] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 434
		bodyWheelModel[13] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 435
		bodyWheelModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 436
		bodyWheelModel[15] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 437
		bodyWheelModel[16] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 438
		bodyWheelModel[17] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 439
		bodyWheelModel[18] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 440
		bodyWheelModel[19] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 441
		bodyWheelModel[20] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 442
		bodyWheelModel[21] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 109

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyWheelModel[0].setRotationPoint(-58.25F, 1.5F, -4.5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyWheelModel[1].setRotationPoint(-58.25F, 4.5F, -4.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 424
		bodyWheelModel[2].setRotationPoint(-58.25F, 7.5F, -4.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyWheelModel[3].setRotationPoint(-58.25F, 1.5F, -5.5F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyWheelModel[4].setRotationPoint(-58.25F, 4.5F, -5.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 427
		bodyWheelModel[5].setRotationPoint(-58.25F, 7.5F, -5.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 428
		bodyWheelModel[6].setRotationPoint(-58.25F, 1.5F, -3.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 429
		bodyWheelModel[7].setRotationPoint(-58.25F, 4.5F, -3.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F); // Box 430
		bodyWheelModel[8].setRotationPoint(-58.25F, 7.5F, -3.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyWheelModel[9].setRotationPoint(-58.25F, 1.5F, 3.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyWheelModel[10].setRotationPoint(-58.25F, 4.5F, 3.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 433
		bodyWheelModel[11].setRotationPoint(-58.25F, 7.5F, 3.5F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 434
		bodyWheelModel[12].setRotationPoint(-58.25F, 1.5F, 4.5F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 435
		bodyWheelModel[13].setRotationPoint(-58.25F, 4.5F, 4.5F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F); // Box 436
		bodyWheelModel[14].setRotationPoint(-58.25F, 7.5F, 4.5F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyWheelModel[15].setRotationPoint(-58.25F, 1.5F, 2.5F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyWheelModel[16].setRotationPoint(-58.25F, 4.5F, 2.5F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 439
		bodyWheelModel[17].setRotationPoint(-58.25F, 7.5F, 2.5F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyWheelModel[18].setRotationPoint(-54.25F, 5.5F, -3.5F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyWheelModel[19].setRotationPoint(-55.25F, 0.5F, -1F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 2, 23, 2, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 442
		bodyWheelModel[20].setRotationPoint(-55.25F, -21.5F, -1F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 1, 26, 2, 0F,-0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 109
		bodyWheelModel[21].setRotationPoint(-64.25F, -21.5F, -1F);
		bodyWheelModel[21].rotateAngleZ = 0.34906585F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 126
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 127
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 128
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 129
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 130
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 131
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 132
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 133
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 134
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 135
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 136
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 137
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 138
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 139

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingWheelModel[0].setRotationPoint(28F, -3.5F, -31.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 127
		leftWingWheelModel[1].setRotationPoint(31F, -5.5F, -28F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingWheelModel[2].setRotationPoint(32F, 0.5F, -30.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 129
		leftWingWheelModel[3].setRotationPoint(28F, -3.5F, -29.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftWingWheelModel[4].setRotationPoint(28F, -3.5F, -30.5F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		leftWingWheelModel[5].setRotationPoint(28F, -0.5F, -30.5F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftWingWheelModel[6].setRotationPoint(28F, -0.5F, -31.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 133
		leftWingWheelModel[7].setRotationPoint(28F, -0.5F, -29.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F); // Box 134
		leftWingWheelModel[8].setRotationPoint(28F, 2.5F, -29.5F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 135
		leftWingWheelModel[9].setRotationPoint(28F, 2.5F, -30.5F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 136
		leftWingWheelModel[10].setRotationPoint(28F, 2.5F, -31.5F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 137
		leftWingWheelModel[11].setRotationPoint(31F, -7.5F, -29.5F);
		leftWingWheelModel[11].rotateAngleX = 0.45378561F;

		leftWingWheelModel[12].addShapeBox(0F, -3.5F, 0F, 2, 4, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 138
		leftWingWheelModel[12].setRotationPoint(31F, -7.5F, -29.5F);
		leftWingWheelModel[12].rotateAngleX = 0.26179939F;

		leftWingWheelModel[13].addShapeBox(0F, -11.5F, 0F, 2, 10, 2, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 139
		leftWingWheelModel[13].setRotationPoint(31F, -7.5F, -29.5F);
		leftWingWheelModel[13].rotateAngleX = 0.26179939F;
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 111
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 113
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 114
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 115
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 116
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 117
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 118
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 119
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 120
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 121
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 122
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 123
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 124
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 125

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 111
		rightWingWheelModel[0].setRotationPoint(28F, -3.5F, 30.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 113
		rightWingWheelModel[1].setRotationPoint(31F, -5.5F, 26F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		rightWingWheelModel[2].setRotationPoint(32F, 0.5F, 26.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		rightWingWheelModel[3].setRotationPoint(28F, -3.5F, 28.5F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		rightWingWheelModel[4].setRotationPoint(28F, -3.5F, 29.5F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		rightWingWheelModel[5].setRotationPoint(28F, -0.5F, 29.5F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 118
		rightWingWheelModel[6].setRotationPoint(28F, -0.5F, 30.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		rightWingWheelModel[7].setRotationPoint(28F, -0.5F, 28.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 120
		rightWingWheelModel[8].setRotationPoint(28F, 2.5F, 28.5F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 121
		rightWingWheelModel[9].setRotationPoint(28F, 2.5F, 29.5F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F); // Box 122
		rightWingWheelModel[10].setRotationPoint(28F, 2.5F, 30.5F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 123
		rightWingWheelModel[11].setRotationPoint(31F, -8.5F, 27.5F);
		rightWingWheelModel[11].rotateAngleX = -0.45378561F;

		rightWingWheelModel[12].addShapeBox(0F, -3.5F, 0F, 2, 4, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 124
		rightWingWheelModel[12].setRotationPoint(31F, -8.5F, 27.5F);
		rightWingWheelModel[12].rotateAngleX = -0.26179939F;

		rightWingWheelModel[13].addShapeBox(0F, -11.5F, 0F, 2, 10, 2, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 125
		rightWingWheelModel[13].setRotationPoint(31F, -8.5F, 27.5F);
		rightWingWheelModel[13].rotateAngleX = -0.26179939F;
	}
}