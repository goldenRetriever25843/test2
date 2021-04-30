//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ouragan
// Model Creator: 
// Created on: 10.07.2015 - 12:02:04
// Last changed on: 10.07.2015 - 12:02:04

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOuragan extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelOuragan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[62];
		noseModel = new ModelRendererTurbo[12];
		tailModel = new ModelRendererTurbo[4];
		leftWingModel = new ModelRendererTurbo[9];
		rightWingModel = new ModelRendererTurbo[9];
		yawFlapModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		bodyWheelModel = new ModelRendererTurbo[10];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 265
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 266
		bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 267
		bodyModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 268
		bodyModel[4] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 269
		bodyModel[5] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 270
		bodyModel[6] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 275
		bodyModel[7] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 30
		bodyModel[11] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 31
		bodyModel[12] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 32
		bodyModel[13] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 33
		bodyModel[14] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 35
		bodyModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 38
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 39
		bodyModel[20] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 40
		bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 41
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 42
		bodyModel[23] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 43
		bodyModel[24] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 45
		bodyModel[25] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 47
		bodyModel[26] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 50
		bodyModel[27] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 52
		bodyModel[28] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 54
		bodyModel[29] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 60
		bodyModel[30] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 61
		bodyModel[31] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 62
		bodyModel[32] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 63
		bodyModel[33] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 64
		bodyModel[34] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 70
		bodyModel[35] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 75
		bodyModel[36] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 76
		bodyModel[37] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 77
		bodyModel[38] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 85
		bodyModel[40] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 86
		bodyModel[41] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 88
		bodyModel[42] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 89
		bodyModel[43] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 90
		bodyModel[44] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 91
		bodyModel[45] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 92
		bodyModel[46] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 104
		bodyModel[47] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 149
		bodyModel[48] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 151
		bodyModel[49] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 152
		bodyModel[50] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 155
		bodyModel[51] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 156
		bodyModel[52] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 157
		bodyModel[53] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 149
		bodyModel[54] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 150
		bodyModel[55] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 151
		bodyModel[56] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 153
		bodyModel[57] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 155
		bodyModel[58] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 157
		bodyModel[59] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 160
		bodyModel[60] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 161
		bodyModel[61] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 162

		bodyModel[0].addShapeBox(0F, 5F, 0F, 45, 10, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 265
		bodyModel[0].setRotationPoint(-5F, -23F, -13.5F);

		bodyModel[1].addShapeBox(0F, -4F, 0F, 45, 10, 27, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[1].setRotationPoint(-5F, -24F, -13.5F);

		bodyModel[2].addShapeBox(0F, -13F, 0F, 45, 9, 27, 0F,0F, 0F, -9F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[2].setRotationPoint(-5F, -24F, -13.5F);

		bodyModel[3].addShapeBox(49F, -13F, 0F, 58, 9, 27, 0F,0F, -2F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -2F, -9F, 0F, 1F, 0F, 0F, 5F, -5F, 0F, 5F, -5F, 0F, 1F, 0F); // Box 268
		bodyModel[3].setRotationPoint(-9F, -24F, -13.5F);

		bodyModel[4].addShapeBox(49F, -4F, 0F, 58, 10, 27, 0F,0F, -1F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 269
		bodyModel[4].setRotationPoint(-9F, -24F, -13.5F);

		bodyModel[5].addShapeBox(49F, 5F, 0F, 58, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, -9F, 0F, -5F, -9F, 0F, -5F, -9F, 0F, 1F, -9F); // Box 270
		bodyModel[5].setRotationPoint(-9F, -23F, -13.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 36, 3, 0F,-49F, 2.5F, 0F, 57F, 2.5F, 0F, 57F, 2.5F, 0F, -49F, 2.5F, 0F, -12F, 0F, 0F, 43F, 2F, 0F, 43F, 2F, 0F, -12F, 0F, 0F); // Box 275
		bodyModel[6].setRotationPoint(49F, -64F, -1.5F);

		bodyModel[7].addShapeBox(0F, -13F, 0F, 21, 6, 24, 0F,0F, -4F, -9F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -9F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 13
		bodyModel[7].setRotationPoint(-77F, -22F, -12F);

		bodyModel[8].addShapeBox(0F, -13F, 0F, 21, 10, 24, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 16
		bodyModel[8].setRotationPoint(-77F, -16F, -12F);

		bodyModel[9].addShapeBox(0F, -13F, 0F, 21, 8, 24, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -9F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -9F); // Box 17
		bodyModel[9].setRotationPoint(-77F, -6F, -12F);

		bodyModel[10].addShapeBox(0F, -13F, 0F, 15, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 30
		bodyModel[10].setRotationPoint(-56F, -16F, -12F);

		bodyModel[11].addShapeBox(0F, -13F, 0F, 15, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 31
		bodyModel[11].setRotationPoint(-56F, -16F, 11F);

		bodyModel[12].addShapeBox(0F, -13F, 0F, 36, 10, 1, 0F,0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, 0.5F, 0F, 0F, 0F); // Box 32
		bodyModel[12].setRotationPoint(-41F, -16F, 12F);

		bodyModel[13].addShapeBox(0F, -13F, 0F, 36, 10, 1, 0F,0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 33
		bodyModel[13].setRotationPoint(-41F, -16F, -13F);

		bodyModel[14].addShapeBox(0F, -13F, 0F, 15, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0F, -8F); // Box 34
		bodyModel[14].setRotationPoint(-56F, -6F, -12F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 35, 8, 24, 0F,0F, 0F, 1F, 1F, -2F, 1.5F, 1F, -2F, 1.5F, 0F, 0F, 1F, 0F, 1F, -8F, 0.5F, 3F, -7.5F, 0.5F, 3F, -7.5F, 0F, 1F, -8F); // Box 35
		bodyModel[15].setRotationPoint(-41F, -19F, -12F);

		bodyModel[16].addShapeBox(-0.5F, -1.5F, -1.5F, 3, 5, 3, 0F,0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[16].setRotationPoint(-51F, -36F, 0F);
		bodyModel[16].rotateAngleZ = -0.90757121F;

		bodyModel[17].addShapeBox(-0.5F, -5.5F, -3F, 1, 6, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 37
		bodyModel[17].setRotationPoint(-52F, -37F, 0F);
		bodyModel[17].rotateAngleZ = -1.04719755F;

		bodyModel[18].addShapeBox(-0.5F, -7.5F, -3F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 38
		bodyModel[18].setRotationPoint(-52F, -37F, 0F);
		bodyModel[18].rotateAngleZ = -1.04719755F;

		bodyModel[19].addShapeBox(-0.5F, -9.5F, -2.5F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 39
		bodyModel[19].setRotationPoint(-52F, -37F, 0F);
		bodyModel[19].rotateAngleZ = -1.04719755F;

		bodyModel[20].addShapeBox(-0.5F, -5.5F, 3F, 1, 6, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 40
		bodyModel[20].setRotationPoint(-52F, -37F, -1F);
		bodyModel[20].rotateAngleZ = -1.04719755F;

		bodyModel[21].addShapeBox(-0.5F, -7.5F, 3F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 41
		bodyModel[21].setRotationPoint(-52F, -37F, -1F);
		bodyModel[21].rotateAngleZ = -1.04719755F;

		bodyModel[22].addShapeBox(-0.5F, -9.5F, 2.5F, 1, 2, 1, 0F,-0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 42
		bodyModel[22].setRotationPoint(-52F, -37F, -1F);
		bodyModel[22].rotateAngleZ = -1.04719755F;

		bodyModel[23].addShapeBox(-0.5F, -10F, -1F, 1, 1, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F); // Box 43
		bodyModel[23].setRotationPoint(-52F, -37F, 0F);
		bodyModel[23].rotateAngleZ = -1.04719755F;

		bodyModel[24].addShapeBox(-5.5F, -0.5F, -0.5F, 13, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 45
		bodyModel[24].setRotationPoint(-48F, -36F, -5F);
		bodyModel[24].rotateAngleY = -0.29670597F;

		bodyModel[25].addShapeBox(-0.5F, -0.5F, -0.5F, 21, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 47
		bodyModel[25].setRotationPoint(-41F, -36F, -7.3F);
		bodyModel[25].rotateAngleY = 0.13962634F;
		bodyModel[25].rotateAngleZ = 0.05235988F;

		bodyModel[26].addShapeBox(-5.5F, -0.5F, -0.5F, 13, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 50
		bodyModel[26].setRotationPoint(-48F, -36F, 5F);
		bodyModel[26].rotateAngleY = 0.31415927F;

		bodyModel[27].addShapeBox(-0.5F, -0.5F, -0.5F, 21, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 52
		bodyModel[27].setRotationPoint(-41F, -36F, 7.3F);
		bodyModel[27].rotateAngleY = -0.13962634F;
		bodyModel[27].rotateAngleZ = 0.05235988F;

		bodyModel[28].addShapeBox(-0.5F, -1.5F, -0.5F, 16, 7, 5, 0F,0F, -0.5F, -1F, 2F, -5.8F, -2.3F, 2F, -5.8F, -2.3F, 0F, -0.5F, -1F, 3F, 0F, 2.5F, 4F, -0.8F, -2F, 4F, -0.8F, -2F, 3F, 0F, 2.5F); // Box 54
		bodyModel[28].setRotationPoint(-20F, -41.5F, -2F);

		bodyModel[29].addShapeBox(-0.2F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 60
		bodyModel[29].setRotationPoint(-43F, -42.2F, 0F);
		bodyModel[29].rotateAngleZ = 0.27925268F;

		bodyModel[30].addShapeBox(-0.2F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 61
		bodyModel[30].setRotationPoint(-43F, -42.1F, 1F);
		bodyModel[30].rotateAngleX = -0.38397244F;
		bodyModel[30].rotateAngleZ = 0.27925268F;

		bodyModel[31].addShapeBox(-1F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 62
		bodyModel[31].setRotationPoint(-42F, -41.6F, 2.8F);
		bodyModel[31].rotateAngleX = -0.50614548F;
		bodyModel[31].rotateAngleZ = 0.27925268F;

		bodyModel[32].addShapeBox(-1F, -0.5F, 1.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[32].setRotationPoint(-42F, -41.6F, 2.8F);
		bodyModel[32].rotateAngleX = -0.50614548F;
		bodyModel[32].rotateAngleZ = 0.27925268F;

		bodyModel[33].addShapeBox(-1F, -0.2F, 3.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -3.1F, 1.2F, 0F, -2.8F, 0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 2.7F, 0.5F, 0F, 2F, 0.3F); // Box 64
		bodyModel[33].setRotationPoint(-42F, -41.6F, 2.8F);
		bodyModel[33].rotateAngleX = -0.50614548F;
		bodyModel[33].rotateAngleZ = 0.27925268F;

		bodyModel[34].addShapeBox(-1F, -0.2F, 3.5F, 2, 1, 2, 0F,0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.8F, 0.7F, 0.1F, -3.1F, 1.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 2F, 0.3F, 0F, 2.7F, 0.5F); // Box 70
		bodyModel[34].setRotationPoint(-42F, -41.6F, -2.8F);
		bodyModel[34].rotateAngleX = -0.50614548F;
		bodyModel[34].rotateAngleY = -3.14159265F;
		bodyModel[34].rotateAngleZ = -0.27925268F;

		bodyModel[35].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 75
		bodyModel[35].setRotationPoint(-43F, -41.7F, -1.9F);
		bodyModel[35].rotateAngleX = 0.38397244F;
		bodyModel[35].rotateAngleZ = 0.27925268F;

		bodyModel[36].addShapeBox(-0.8F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 76
		bodyModel[36].setRotationPoint(-42F, -41.1F, -3.7F);
		bodyModel[36].rotateAngleX = 0.50614548F;
		bodyModel[36].rotateAngleZ = 0.27925268F;

		bodyModel[37].addShapeBox(-0.8F, -0.5F, -4.8F, 2, 1, 2, 0F,0F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 77
		bodyModel[37].setRotationPoint(-42.3F, -42.1F, -1.7F);
		bodyModel[37].rotateAngleX = 0.50614548F;
		bodyModel[37].rotateAngleZ = 0.27925268F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 15, 8, 1, 0F,0F, -2F, -8F, 0F, -1.5F, -4.5F, 0F, -1.5F, 5F, 0F, -2F, 8.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 84
		bodyModel[38].setRotationPoint(-56F, -37F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 15, 8, 1, 0F,0F, -2F, 8.5F, 0F, -1.5F, 5F, 0F, -1.5F, -4.5F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 85
		bodyModel[39].setRotationPoint(-56F, -37F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, -1.5F, 4F, 0F, -1.5F, 4F, 0F, 0F, 1F, 0F, 0.15F, 1.1F, 0F, 0.15F, -1.1F, 0F, 0F, -1F); // Box 86
		bodyModel[40].setRotationPoint(-41F, -37F, -12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1.5F, 4F, 0F, -1.5F, 4F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, -1F, 0F, 0.15F, -1.1F, 0F, 0.15F, 1.1F, 0F, 0F, 1F); // Box 88
		bodyModel[41].setRotationPoint(-41F, -37F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, -1.5F, -4.5F, 0F, -1.2F, -5.4F, 0F, -1.2F, 4.9F, 0F, -1.5F, 4F, 0F, 0.15F, 1.1F, 0F, 0.4F, 1.2F, 0F, 0.4F, -1.2F, 0F, 0.15F, -1.1F); // Box 89
		bodyModel[42].setRotationPoint(-37F, -37F, -12F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, -1.5F, 4F, 0F, -1.2F, 4.9F, 0F, -1.2F, -5.4F, 0F, -1.5F, -4.5F, 0F, 0.15F, -1.1F, 0F, 0.4F, -1.2F, 0F, 0.4F, 1.2F, 0F, 0.15F, 1.1F); // Box 90
		bodyModel[43].setRotationPoint(-37F, -37F, 11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, -1.2F, -5.4F, 0.5F, 0F, -7.5F, 0.5F, 0F, 11F, 0F, -1.2F, 4.9F, 0F, 0.4F, 1.2F, 0F, 1F, 1.5F, 0F, 1F, -1.5F, 0F, 0.4F, -1.2F); // Box 91
		bodyModel[44].setRotationPoint(-29F, -37F, -12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, -1.2F, 4.9F, 0.5F, 0F, 11F, 0.5F, 0F, -7.5F, 0F, -1.2F, -5.4F, 0F, 0.4F, -1.2F, 0F, 1F, -1.5F, 0F, 1F, 1.5F, 0F, 0.4F, 1.2F); // Box 92
		bodyModel[45].setRotationPoint(-29F, -37F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 18, 1, 36, 0F,-12F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -12F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 104
		bodyModel[46].setRotationPoint(83F, -46F, -37.5F);

		bodyModel[47].addShapeBox(0F, -3F, 0F, 3, 25, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[47].setRotationPoint(-27F, -39F, -3.5F);
		bodyModel[47].rotateAngleZ = -0.13962634F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[48].setRotationPoint(-37F, -24F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[49].setRotationPoint(-53F, -34.5F, -4.5F);
		bodyModel[49].rotateAngleZ = 0.06981317F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 12, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[50].setRotationPoint(-55F, -29.5F, -1.5F);
		bodyModel[50].rotateAngleZ = 0.17453293F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[51].setRotationPoint(-53F, -33.5F, -8.2F);
		bodyModel[51].rotateAngleZ = 0.06981317F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[52].setRotationPoint(-53F, -33.5F, 4.2F);
		bodyModel[52].rotateAngleZ = 0.06981317F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 20, 14, 3, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[53].setRotationPoint(59F, -46F, -1.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 25, 13, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[54].setRotationPoint(41F, -39F, -1.5F);

		bodyModel[55].addShapeBox(0F, -4F, 0F, 48, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 2F, 0F, 10F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 1F, 0F, 10F, 3F, 1F); // Box 151
		bodyModel[55].setRotationPoint(-11F, -12F, -16.5F);
		bodyModel[55].rotateAngleZ = -0.03490659F;

		bodyModel[56].addShapeBox(0F, -4F, 0F, 48, 4, 11, 0F,10F, 2F, 0F, 8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 3F, 1F, 8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[56].setRotationPoint(-11F, -12F, 5.5F);
		bodyModel[56].rotateAngleZ = -0.03490659F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 1, 36, 0F,4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -12F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -12F, 0F, 0F); // Box 155
		bodyModel[57].setRotationPoint(83F, -46F, 1.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 23, 2, 3, 0F,-4F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F); // Box 157
		bodyModel[58].setRotationPoint(98F, -69F, -1.5F);

		bodyModel[59].addShapeBox(-1F, -3F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[59].setRotationPoint(-27F, -39F, -3F);
		bodyModel[59].rotateAngleZ = -0.13962634F;

		bodyModel[60].addShapeBox(-1F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[60].setRotationPoint(-37F, -24F, -3.5F);

		bodyModel[61].addShapeBox(-0.5F, 0F, -0.5F, 5, 3, 7, 0F,-1.5F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, -1.5F, 1F, 0F, -1F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, 1F, 0F, -1F); // Box 162
		bodyModel[61].setRotationPoint(-56F, -37.5F, -3F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		noseModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
		noseModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 20
		noseModel[3] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 21
		noseModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 22
		noseModel[5] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 23
		noseModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		noseModel[7] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 25
		noseModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 26
		noseModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 27
		noseModel[10] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 28
		noseModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 29

		noseModel[0].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 18
		noseModel[0].setRotationPoint(-82F, -27F, -8F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 19
		noseModel[1].setRotationPoint(-82F, -27F, 7F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Box 20
		noseModel[2].setRotationPoint(-82F, -31F, -3F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 21
		noseModel[3].setRotationPoint(-82F, -16F, -3F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 22
		noseModel[4].setRotationPoint(-82F, -31F, 3F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, -1.5F, -5F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 23
		noseModel[5].setRotationPoint(-82F, -31F, -8F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -1.5F, -5F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 24
		noseModel[6].setRotationPoint(-82F, -19F, -8F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5F); // Box 25
		noseModel[7].setRotationPoint(-82F, -19F, 3F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F); // Box 26
		noseModel[8].setRotationPoint(-79F, -23F, 0F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 27
		noseModel[9].setRotationPoint(-79F, -23F, -3F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 28
		noseModel[10].setRotationPoint(-79F, -29F, 0F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,1F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		noseModel[11].setRotationPoint(-79F, -29F, -3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 272
		tailModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 273
		tailModel[2] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 274
		tailModel[3] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 277

		tailModel[0].addShapeBox(110F, -3.5F, 0F, 1, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 272
		tailModel[0].setRotationPoint(-12F, -19F, -7.5F);

		tailModel[1].addShapeBox(110F, 1.5F, 0F, 1, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 273
		tailModel[1].setRotationPoint(-12F, -21F, -7.5F);

		tailModel[2].addShapeBox(110F, -8.5F, 0F, 1, 5, 15, 0F,0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 274
		tailModel[2].setRotationPoint(-12F, -19F, -7.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -1F, 0F, -1F, -1.5F, 0F, 0F, 2F, 0F); // Box 277
		tailModel[3].setRotationPoint(96.5F, -32.8F, -1.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 152
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 167
		leftWingModel[2] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 168
		leftWingModel[3] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 169
		leftWingModel[4] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 170
		leftWingModel[5] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 128
		leftWingModel[6] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 129
		leftWingModel[7] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 130
		leftWingModel[8] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 131

		leftWingModel[0].addShapeBox(0F, -4F, 0F, 48, 3, 96, 0F,-30F, 5F, 0F, 2F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -30F, -6F, 0F, 2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		leftWingModel[0].setRotationPoint(-11F, -11F, -112.5F);
		leftWingModel[0].rotateAngleZ = -0.03490659F;

		leftWingModel[1].addShapeBox(0F, -4F, 0F, 18, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftWingModel[1].setRotationPoint(20F, -19.5F, -124F);

		leftWingModel[2].addShapeBox(0F, -4F, 0F, 27, 11, 11, 0F,0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, 0F); // Box 168
		leftWingModel[2].setRotationPoint(38F, -19.5F, -124F);

		leftWingModel[3].addShapeBox(0F, -4F, 0F, 12, 11, 11, 0F,0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F); // Box 169
		leftWingModel[3].setRotationPoint(8F, -19.5F, -124F);

		leftWingModel[4].addShapeBox(0F, -4F, 0F, 2, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F); // Box 170
		leftWingModel[4].setRotationPoint(6F, -16F, -120.5F);

		leftWingModel[5].addShapeBox(0F, -4F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingModel[5].setRotationPoint(2F, -11F, -56F);
		leftWingModel[5].rotateAngleZ = -0.03490659F;

		leftWingModel[6].addShapeBox(0F, -4F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		leftWingModel[6].setRotationPoint(1F, -6.5F, -60F);

		leftWingModel[7].addShapeBox(0F, -4F, 0F, 7, 9, 9, 0F,0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F); // Box 130
		leftWingModel[7].setRotationPoint(-6F, -6.5F, -60F);

		leftWingModel[8].addShapeBox(0F, -4F, 0F, 7, 9, 9, 0F,0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F); // Box 131
		leftWingModel[8].setRotationPoint(28F, -6.5F, -60F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 154
		rightWingModel[1] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 163
		rightWingModel[2] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 164
		rightWingModel[3] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 165
		rightWingModel[4] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 166
		rightWingModel[5] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 124
		rightWingModel[6] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 125
		rightWingModel[7] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 126
		rightWingModel[8] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 127

		rightWingModel[0].addShapeBox(0F, -4F, 0F, 48, 3, 96, 0F,0F, 1F, 0F, 0F, 1F, 0F, 2F, 5F, 0F, -30F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -6F, 0F, -30F, -6F, 0F); // Box 154
		rightWingModel[0].setRotationPoint(-11F, -11F, 16.5F);
		rightWingModel[0].rotateAngleZ = -0.03490659F;

		rightWingModel[1].addShapeBox(0F, -4F, 0F, 18, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rightWingModel[1].setRotationPoint(20F, -19.5F, 113F);

		rightWingModel[2].addShapeBox(0F, -4F, 0F, 27, 11, 11, 0F,0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, 0F); // Box 164
		rightWingModel[2].setRotationPoint(38F, -19.5F, 113F);

		rightWingModel[3].addShapeBox(0F, -4F, 0F, 12, 11, 11, 0F,0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F); // Box 165
		rightWingModel[3].setRotationPoint(8F, -19.5F, 113F);

		rightWingModel[4].addShapeBox(0F, -4F, 0F, 2, 4, 4, 0F,0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -1.2F); // Box 166
		rightWingModel[4].setRotationPoint(6F, -16F, 116.5F);

		rightWingModel[5].addShapeBox(0F, -4F, 0F, 20, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		rightWingModel[5].setRotationPoint(2F, -11F, 55F);
		rightWingModel[5].rotateAngleZ = -0.03490659F;

		rightWingModel[6].addShapeBox(0F, -4F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		rightWingModel[6].setRotationPoint(1F, -6.5F, 51F);

		rightWingModel[7].addShapeBox(0F, -4F, 0F, 7, 9, 9, 0F,0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F); // Box 126
		rightWingModel[7].setRotationPoint(-6F, -6.5F, 51F);

		rightWingModel[8].addShapeBox(0F, -4F, 0F, 7, 9, 9, 0F,0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F); // Box 127
		rightWingModel[8].setRotationPoint(28F, -6.5F, 51F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 93
		yawFlapModel[1] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 159
		yawFlapModel[2] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 161

		yawFlapModel[0].addShapeBox(0F, -20F, 0F, 3, 32, 3, 0F,0F, 3.5F, -0.3F, 7F, 6.8F, -0.3F, 7F, 6.8F, -0.3F, 0F, 3.5F, -0.3F, 0F, 0F, -0.3F, 9F, -4F, -0.3F, 9F, -4F, -0.3F, 0F, 0F, -0.3F); // Box 93
		yawFlapModel[0].setRotationPoint(103F, -44.5F, -1.5F);
		yawFlapModel[0].rotateAngleZ = -0.33161256F;

		yawFlapModel[1].addShapeBox(-2F, 0F, 3F, 3, 1, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 159
		yawFlapModel[1].setRotationPoint(-52F, -21.5F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.55850536F;

		yawFlapModel[2].addShapeBox(-2F, 0F, -6F, 3, 1, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 161
		yawFlapModel[2].setRotationPoint(-52F, -21.5F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.55850536F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 105
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 158
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 156

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, -19F, 4, 1, 36, 0F,0F, 0F, 3F, 2F, 0F, 4.5F, 3F, 0F, -7F, 0F, 0F, -2.5F, 0F, 0F, 3F, 2F, 0F, 3F, 3F, 0F, -7F, 0F, 0F, -2.5F); // Box 105
		pitchFlapLeftModel[0].setRotationPoint(100.5F, -46F, -16F);
		pitchFlapLeftModel[0].rotateAngleY = 0.21816616F;

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -14F, -0.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		pitchFlapLeftModel[1].setRotationPoint(-44F, -18.5F, 0F);
		pitchFlapLeftModel[1].rotateAngleZ = 0.06981317F;

		pitchFlapLeftModel[2].addShapeBox(0F, 0F, -19F, 4, 1, 36, 0F,0F, 0F, -2.5F, 3F, 0F, -7F, 2F, 0F, 4.5F, 0F, 0F, 3F, 0F, 0F, -2.5F, 3F, 0F, -7F, 2F, 0F, 3F, 0F, 0F, 3F); // Box 156
		pitchFlapLeftModel[2].setRotationPoint(100.5F, -46F, 18F);
		pitchFlapLeftModel[2].rotateAngleY = -0.21816616F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 116
		bodyWheelModel[1] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 117
		bodyWheelModel[2] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 118
		bodyWheelModel[3] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 119
		bodyWheelModel[4] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 120
		bodyWheelModel[5] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 121
		bodyWheelModel[6] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 122
		bodyWheelModel[7] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 123
		bodyWheelModel[8] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 124
		bodyWheelModel[9] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 158

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyWheelModel[0].setRotationPoint(-46.5F, 4.5F, -1.5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 117
		bodyWheelModel[1].setRotationPoint(-46.5F, 7.5F, -1.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyWheelModel[2].setRotationPoint(-46.5F, 1.5F, -1.5F);

		bodyWheelModel[3].addShapeBox(3F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyWheelModel[3].setRotationPoint(-48.5F, -1.5F, -2.5F);
		bodyWheelModel[3].rotateAngleZ = -0.6981317F;

		bodyWheelModel[4].addShapeBox(0F, -7F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyWheelModel[4].setRotationPoint(-47.5F, -1.5F, -0.5F);
		bodyWheelModel[4].rotateAngleZ = -0.6981317F;

		bodyWheelModel[5].addShapeBox(0F, 0.5F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyWheelModel[5].setRotationPoint(-48.5F, -1.5F, -1.5F);
		bodyWheelModel[5].rotateAngleZ = -0.6981317F;

		bodyWheelModel[6].addShapeBox(0F, -7F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 122
		bodyWheelModel[6].setRotationPoint(-46.5F, 4.5F, -0.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 123
		bodyWheelModel[7].setRotationPoint(-73F, -15.5F, 3F);
		bodyWheelModel[7].rotateAngleZ = -0.27925268F;

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 124
		bodyWheelModel[8].setRotationPoint(-59F, -12.5F, -4F);
		bodyWheelModel[8].rotateAngleZ = -0.12217305F;

		bodyWheelModel[9].addShapeBox(0F, -7F, 0F, 1, 13, 1, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 158
		bodyWheelModel[9].setRotationPoint(-42.5F, -3.5F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 125
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 126
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 127
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 128
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 129
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 130
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 131
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 132
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 133
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 134

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftWingWheelModel[0].setRotationPoint(16.5F, 0.5F, -30.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingWheelModel[1].setRotationPoint(16.5F, -4.5F, -30.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 127
		leftWingWheelModel[2].setRotationPoint(16.5F, 5.5F, -30.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingWheelModel[3].setRotationPoint(21F, -8.5F, -31.5F);
		leftWingWheelModel[3].rotateAngleX = 0.01745329F;
		leftWingWheelModel[3].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 129
		leftWingWheelModel[4].setRotationPoint(21F, -8.5F, -31.5F);
		leftWingWheelModel[4].rotateAngleX = 0.01745329F;
		leftWingWheelModel[4].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[5].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0.3F, -1F, 0.3F, 0.3F, -1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 130
		leftWingWheelModel[5].setRotationPoint(21F, -8.5F, -25.5F);
		leftWingWheelModel[5].rotateAngleX = -0.99483767F;
		leftWingWheelModel[5].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 131
		leftWingWheelModel[6].setRotationPoint(21F, -8.5F, -25.5F);
		leftWingWheelModel[6].rotateAngleX = -0.99483767F;
		leftWingWheelModel[6].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 132
		leftWingWheelModel[7].setRotationPoint(18F, -4.5F, -32.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,-1F, 0F, -0.3F, -5F, 0F, -0.3F, -5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 133
		leftWingWheelModel[8].setRotationPoint(15F, -1.5F, -32.5F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.5F, 0F, -0.3F, -6F, 0F, -0.3F, -6F, 0F, -0.3F, -2.5F, 0F, -0.3F); // Box 134
		leftWingWheelModel[9].setRotationPoint(15F, 3.5F, -32.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 135
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 136
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 137
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 138
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 139
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 140
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 141
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 142
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 143
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 144

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		rightWingWheelModel[0].setRotationPoint(16.5F, 0.5F, 27.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rightWingWheelModel[1].setRotationPoint(16.5F, -4.5F, 27.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 137
		rightWingWheelModel[2].setRotationPoint(16.5F, 5.5F, 27.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		rightWingWheelModel[3].setRotationPoint(21F, -8.5F, 30.5F);
		rightWingWheelModel[3].rotateAngleX = 0.01745329F;
		rightWingWheelModel[3].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 139
		rightWingWheelModel[4].setRotationPoint(21F, -8.5F, 30.5F);
		rightWingWheelModel[4].rotateAngleX = 0.01745329F;
		rightWingWheelModel[4].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[5].addShapeBox(0F, -10.5F, 0F, 1, 11, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -2F, 0.3F, 0.3F, -2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 140
		rightWingWheelModel[5].setRotationPoint(21F, -8.5F, 24.5F);
		rightWingWheelModel[5].rotateAngleX = 0.99483767F;
		rightWingWheelModel[5].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[6].addShapeBox(0F, 0.5F, 0F, 1, 7, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 141
		rightWingWheelModel[6].setRotationPoint(21F, -8.5F, 24.5F);
		rightWingWheelModel[6].rotateAngleX = 0.99483767F;
		rightWingWheelModel[6].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 142
		rightWingWheelModel[7].setRotationPoint(18F, -4.5F, 31.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,-1F, 0F, -0.3F, -5F, 0F, -0.3F, -5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 143
		rightWingWheelModel[8].setRotationPoint(15F, -1.5F, 31.5F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.5F, 0F, -0.3F, -6F, 0F, -0.3F, -6F, 0F, -0.3F, -2.5F, 0F, -0.3F); // Box 144
		rightWingWheelModel[9].setRotationPoint(15F, 3.5F, 31.5F);
	}
}