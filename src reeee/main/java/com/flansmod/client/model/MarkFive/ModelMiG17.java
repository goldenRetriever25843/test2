//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MiG17
// Model Creator: 
// Created on: 10.07.2015 - 12:02:04
// Last changed on: 10.07.2015 - 12:02:04

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMiG17 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMiG17() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[85];
		noseModel = new ModelRendererTurbo[12];
		tailModel = new ModelRendererTurbo[4];
		leftWingModel = new ModelRendererTurbo[4];
		rightWingModel = new ModelRendererTurbo[5];
		yawFlapModel = new ModelRendererTurbo[4];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		bodyWheelModel = new ModelRendererTurbo[13];
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
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 266
		bodyModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 267
		bodyModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 268
		bodyModel[4] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 269
		bodyModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 270
		bodyModel[6] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 275
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 276
		bodyModel[8] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 277
		bodyModel[9] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 30
		bodyModel[13] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 43
		bodyModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 45
		bodyModel[28] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 46
		bodyModel[29] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 47
		bodyModel[30] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 48
		bodyModel[31] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 53
		bodyModel[36] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 54
		bodyModel[37] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 55
		bodyModel[38] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 56
		bodyModel[39] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 57
		bodyModel[40] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 58
		bodyModel[41] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 59
		bodyModel[42] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 62
		bodyModel[45] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 64
		bodyModel[47] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 70
		bodyModel[48] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 75
		bodyModel[49] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 76
		bodyModel[50] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 77
		bodyModel[51] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 81
		bodyModel[53] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 82
		bodyModel[54] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 83
		bodyModel[55] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 84
		bodyModel[56] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 85
		bodyModel[57] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 86
		bodyModel[58] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 88
		bodyModel[59] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 89
		bodyModel[60] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 90
		bodyModel[61] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 91
		bodyModel[62] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 95
		bodyModel[64] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 96
		bodyModel[65] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 103
		bodyModel[66] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 104
		bodyModel[67] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 107
		bodyModel[68] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 108
		bodyModel[69] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 111
		bodyModel[70] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 112
		bodyModel[71] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 113
		bodyModel[72] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 114
		bodyModel[73] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 115
		bodyModel[74] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 149
		bodyModel[75] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 150
		bodyModel[76] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 151
		bodyModel[77] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 152
		bodyModel[78] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 153
		bodyModel[79] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 154
		bodyModel[80] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 155
		bodyModel[81] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 156
		bodyModel[82] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 157
		bodyModel[83] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 162
		bodyModel[84] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 163

		bodyModel[0].addShapeBox(0F, 5F, 0F, 49, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 265
		bodyModel[0].setRotationPoint(-20F, -17F, -13.5F);
		bodyModel[0].rotateAngleZ = -0.03490659F;

		bodyModel[1].addShapeBox(0F, -4F, 0F, 49, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 266
		bodyModel[1].setRotationPoint(-20F, -17F, -13.5F);
		bodyModel[1].rotateAngleZ = -0.03490659F;

		bodyModel[2].addShapeBox(0F, -13F, 0F, 49, 9, 27, 0F,0F, 0F, -9F, 0F, -1F, -9F, 0F, -1F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 267
		bodyModel[2].setRotationPoint(-20F, -17F, -13.5F);
		bodyModel[2].rotateAngleZ = -0.03490659F;

		bodyModel[3].addShapeBox(49F, -13F, 0F, 61, 9, 27, 0F,0F, -1F, -9F, 0F, -5F, -9F, 0F, -5F, -9F, 0F, -1F, -9F, 0F, 0F, -1F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, -1F); // Box 268
		bodyModel[3].setRotationPoint(-20F, -17F, -13.5F);
		bodyModel[3].rotateAngleZ = -0.03490659F;

		bodyModel[4].addShapeBox(49F, -4F, 0F, 61, 9, 27, 0F,0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F); // Box 269
		bodyModel[4].setRotationPoint(-20F, -17F, -13.5F);
		bodyModel[4].rotateAngleZ = -0.03490659F;

		bodyModel[5].addShapeBox(49F, 5F, 0F, 61, 9, 27, 0F,0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -9F, 0F, -5F, -9F, 0F, -5F, -9F, 0F, 0F, -9F); // Box 270
		bodyModel[5].setRotationPoint(-20F, -17F, -13.5F);
		bodyModel[5].rotateAngleZ = -0.03490659F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 73, 36, 3, 0F,-62F, -1.5F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -62F, -1.5F, 0F, 4F, 0F, 0F, -33F, 2F, 0F, -33F, 2F, 0F, 4F, 0F, 0F); // Box 275
		bodyModel[6].setRotationPoint(49F, -59F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[7].setRotationPoint(123.5F, -58F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, 0F); // Box 277
		bodyModel[8].setRotationPoint(88.5F, -23F, -1.5F);

		bodyModel[9].addShapeBox(0F, -13F, 0F, 18, 8, 24, 0F,0F, -2F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 13
		bodyModel[9].setRotationPoint(-77F, -17F, -12F);

		bodyModel[10].addShapeBox(0F, -13F, 0F, 18, 8, 24, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 16
		bodyModel[10].setRotationPoint(-77F, -9F, -12F);

		bodyModel[11].addShapeBox(0F, -13F, 0F, 18, 8, 24, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F); // Box 17
		bodyModel[11].setRotationPoint(-77F, -1F, -12F);

		bodyModel[12].addShapeBox(0F, -13F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 30
		bodyModel[12].setRotationPoint(-59F, -9F, -12F);

		bodyModel[13].addShapeBox(0F, -13F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 31
		bodyModel[13].setRotationPoint(-59F, -9F, 11F);

		bodyModel[14].addShapeBox(0F, -13F, 0F, 28, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, 0.5F, 0F, 0F, 0F); // Box 32
		bodyModel[14].setRotationPoint(-48F, -9F, 12F);

		bodyModel[15].addShapeBox(0F, -13F, 0F, 28, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 33
		bodyModel[15].setRotationPoint(-48F, -9F, -13F);

		bodyModel[16].addShapeBox(0F, -13F, 0F, 11, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 1F, -8F, 0F, 1F, -8F, 0F, 0F, -8F); // Box 34
		bodyModel[16].setRotationPoint(-59F, -1F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 27, 8, 24, 0F,0F, 0F, 1F, 1F, -2F, 1.5F, 1F, -2F, 1.5F, 0F, 0F, 1F, 0F, 1F, -8F, 0.5F, 3F, -7.5F, 0.5F, 3F, -7.5F, 0F, 1F, -8F); // Box 35
		bodyModel[17].setRotationPoint(-48F, -14F, -12F);

		bodyModel[18].addShapeBox(-0.5F, -1.5F, -3F, 1, 2, 6, 0F,0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[18].setRotationPoint(-59F, -30F, 0F);
		bodyModel[18].rotateAngleZ = -0.90757121F;

		bodyModel[19].addShapeBox(-0.5F, -5.5F, -3F, 1, 5, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 37
		bodyModel[19].setRotationPoint(-59F, -30F, 0F);
		bodyModel[19].rotateAngleZ = -0.90757121F;

		bodyModel[20].addShapeBox(-0.5F, -7.5F, -3F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 38
		bodyModel[20].setRotationPoint(-59F, -30F, 0F);
		bodyModel[20].rotateAngleZ = -0.90757121F;

		bodyModel[21].addShapeBox(-0.5F, -9.5F, -2.5F, 1, 2, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 39
		bodyModel[21].setRotationPoint(-59F, -30F, 0F);
		bodyModel[21].rotateAngleZ = -0.90757121F;

		bodyModel[22].addShapeBox(-0.5F, -5.5F, 3F, 1, 5, 1, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // Box 40
		bodyModel[22].setRotationPoint(-59F, -30F, -1F);
		bodyModel[22].rotateAngleZ = -0.90757121F;

		bodyModel[23].addShapeBox(-0.5F, -7.5F, 3F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 41
		bodyModel[23].setRotationPoint(-59F, -30F, -1F);
		bodyModel[23].rotateAngleZ = -0.90757121F;

		bodyModel[24].addShapeBox(-0.5F, -9.5F, 2.5F, 1, 2, 1, 0F,-0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 42
		bodyModel[24].setRotationPoint(-59F, -30F, -1F);
		bodyModel[24].rotateAngleZ = -0.90757121F;

		bodyModel[25].addShapeBox(-0.5F, -10F, -1F, 1, 1, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F); // Box 43
		bodyModel[25].setRotationPoint(-59F, -30F, 0F);
		bodyModel[25].rotateAngleZ = -0.90757121F;

		bodyModel[26].addShapeBox(-4.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 44
		bodyModel[26].setRotationPoint(-55F, -30F, -5F);
		bodyModel[26].rotateAngleY = -0.61086524F;
		bodyModel[26].rotateAngleZ = -0.12217305F;

		bodyModel[27].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, -0.5F, 0F, -0.3F); // Box 45
		bodyModel[27].setRotationPoint(-55F, -30F, -5F);
		bodyModel[27].rotateAngleY = -0.31415927F;
		bodyModel[27].rotateAngleZ = -0.01745329F;

		bodyModel[28].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 46
		bodyModel[28].setRotationPoint(-48F, -30F, -7.3F);
		bodyModel[28].rotateAngleZ = -0.01745329F;

		bodyModel[29].addShapeBox(-0.5F, -0.5F, -0.5F, 9, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 47
		bodyModel[29].setRotationPoint(-44.5F, -29.5F, -7.3F);
		bodyModel[29].rotateAngleY = 0.10471976F;
		bodyModel[29].rotateAngleZ = 0.01745329F;

		bodyModel[30].addShapeBox(-0.5F, -1.5F, -0.5F, 13, 2, 1, 0F,-0.5F, -0.3F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.7F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.7F, -0.3F); // Box 48
		bodyModel[30].setRotationPoint(-36F, -28.5F, -6.4F);
		bodyModel[30].rotateAngleY = 0.34906585F;
		bodyModel[30].rotateAngleZ = 0.10471976F;

		bodyModel[31].addShapeBox(-4.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 49
		bodyModel[31].setRotationPoint(-55F, -30F, 5F);
		bodyModel[31].rotateAngleY = 0.61086524F;
		bodyModel[31].rotateAngleZ = -0.12217305F;

		bodyModel[32].addShapeBox(-0.5F, -0.5F, -0.5F, 8, 1, 1, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, -0.5F, 0F, -0.3F); // Box 50
		bodyModel[32].setRotationPoint(-55F, -30F, 5F);
		bodyModel[32].rotateAngleY = 0.31415927F;
		bodyModel[32].rotateAngleZ = -0.01745329F;

		bodyModel[33].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 51
		bodyModel[33].setRotationPoint(-48F, -30F, 7.3F);
		bodyModel[33].rotateAngleZ = -0.01745329F;

		bodyModel[34].addShapeBox(-0.5F, -0.5F, -0.5F, 9, 2, 1, 0F,-0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, 0F, -0.3F); // Box 52
		bodyModel[34].setRotationPoint(-44.5F, -29.5F, 7.3F);
		bodyModel[34].rotateAngleY = -0.10471976F;
		bodyModel[34].rotateAngleZ = 0.01745329F;

		bodyModel[35].addShapeBox(-0.5F, -1.5F, -0.5F, 13, 2, 1, 0F,-0.5F, -0.3F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.7F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.7F, -0.3F); // Box 53
		bodyModel[35].setRotationPoint(-36F, -28.5F, 6.4F);
		bodyModel[35].rotateAngleY = -0.34906585F;
		bodyModel[35].rotateAngleZ = 0.10471976F;

		bodyModel[36].addShapeBox(-0.5F, -1.5F, -0.5F, 5, 3, 5, 0F,0F, -0.5F, -1F, 0F, -2F, -2.3F, 0F, -2F, -2.3F, 0F, -0.5F, -1F, 0F, -1F, 0.5F, 0F, -0.8F, -2F, 0F, -0.8F, -2F, 0F, -1F, 0.5F); // Box 54
		bodyModel[36].setRotationPoint(-24F, -30.5F, -2F);

		bodyModel[37].addShapeBox(-0.5F, -0.5F, -0.5F, 10, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 55
		bodyModel[37].setRotationPoint(-32.5F, -34.5F, 0F);
		bodyModel[37].rotateAngleZ = -0.36651914F;

		bodyModel[38].addShapeBox(-0.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 56
		bodyModel[38].setRotationPoint(-37F, -35.7F, 0F);
		bodyModel[38].rotateAngleZ = -0.26179939F;

		bodyModel[39].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 57
		bodyModel[39].setRotationPoint(-41F, -36.5F, 0F);
		bodyModel[39].rotateAngleZ = -0.17453293F;

		bodyModel[40].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 58
		bodyModel[40].setRotationPoint(-45F, -37F, 0F);
		bodyModel[40].rotateAngleZ = -0.12217305F;

		bodyModel[41].addShapeBox(-0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 59
		bodyModel[41].setRotationPoint(-49F, -36.7F, 0F);
		bodyModel[41].rotateAngleZ = 0.10471976F;

		bodyModel[42].addShapeBox(-0.5F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 60
		bodyModel[42].setRotationPoint(-51F, -36.2F, 0F);
		bodyModel[42].rotateAngleZ = 0.27925268F;

		bodyModel[43].addShapeBox(-0.2F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 61
		bodyModel[43].setRotationPoint(-51F, -36.1F, 1F);
		bodyModel[43].rotateAngleX = -0.38397244F;
		bodyModel[43].rotateAngleZ = 0.27925268F;

		bodyModel[44].addShapeBox(-1F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 62
		bodyModel[44].setRotationPoint(-50F, -35.6F, 2.8F);
		bodyModel[44].rotateAngleX = -0.50614548F;
		bodyModel[44].rotateAngleZ = 0.27925268F;

		bodyModel[45].addShapeBox(-1F, -0.5F, 1.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[45].setRotationPoint(-50F, -35.6F, 2.8F);
		bodyModel[45].rotateAngleX = -0.50614548F;
		bodyModel[45].rotateAngleZ = 0.27925268F;

		bodyModel[46].addShapeBox(-1F, -0.2F, 3.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -3.1F, 1.2F, 0F, -2.8F, 0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, 2.7F, 1.5F, 0F, 2F, 0.3F); // Box 64
		bodyModel[46].setRotationPoint(-50F, -35.6F, 2.8F);
		bodyModel[46].rotateAngleX = -0.50614548F;
		bodyModel[46].rotateAngleZ = 0.27925268F;

		bodyModel[47].addShapeBox(-1F, -0.2F, 3.5F, 2, 1, 2, 0F,0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.8F, 0.7F, 0.1F, -3.1F, 1.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 2F, 0.3F, 1F, 2.7F, 1.5F); // Box 70
		bodyModel[47].setRotationPoint(-50F, -35.6F, -2.8F);
		bodyModel[47].rotateAngleX = -0.50614548F;
		bodyModel[47].rotateAngleY = -3.14159265F;
		bodyModel[47].rotateAngleZ = -0.27925268F;

		bodyModel[48].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 75
		bodyModel[48].setRotationPoint(-51F, -35.7F, -1.9F);
		bodyModel[48].rotateAngleX = 0.38397244F;
		bodyModel[48].rotateAngleZ = 0.27925268F;

		bodyModel[49].addShapeBox(-0.8F, -0.5F, -0.5F, 2, 1, 2, 0F,0F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 76
		bodyModel[49].setRotationPoint(-50F, -35.1F, -3.7F);
		bodyModel[49].rotateAngleX = 0.50614548F;
		bodyModel[49].rotateAngleZ = 0.27925268F;

		bodyModel[50].addShapeBox(-0.8F, -0.5F, -4.8F, 2, 1, 2, 0F,0F, -0.6F, 0F, 0.1F, -0.6F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 77
		bodyModel[50].setRotationPoint(-50.3F, -36.1F, -1.7F);
		bodyModel[50].rotateAngleX = 0.50614548F;
		bodyModel[50].rotateAngleZ = 0.27925268F;

		bodyModel[51].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 3, 0F,0F, -1.6F, 0F, 0F, -1.6F, -0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -0.2F, 0F, 0F, -0.3F, 0F); // Box 80
		bodyModel[51].setRotationPoint(-32.5F, -34.5F, -3F);

		bodyModel[52].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0F,0F, -3.7F, 0F, 0F, -3.7F, -0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, 3F, 0F, 0F, 3F, -0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F); // Box 81
		bodyModel[52].setRotationPoint(-32.5F, -33.2F, -5F);

		bodyModel[53].addShapeBox(-0.5F, -0.5F, 0.5F, 1, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -1.6F, -0.5F, 0F, -1.6F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F); // Box 82
		bodyModel[53].setRotationPoint(-32.5F, -34.5F, 0F);

		bodyModel[54].addShapeBox(-0.5F, -0.5F, 0.5F, 1, 1, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -3.7F, -0.5F, 0F, -3.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, 0F); // Box 83
		bodyModel[54].setRotationPoint(-32.5F, -33.2F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, -8F, 0F, -1.5F, -4.5F, 0F, -1.5F, 4F, 0F, 0F, 8.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 84
		bodyModel[55].setRotationPoint(-59F, -30F, -12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 8.5F, 0F, -1.5F, 4F, 0F, -1.5F, -4.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 85
		bodyModel[56].setRotationPoint(-59F, -30F, 11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, -1.5F, 4F, 0F, -1.5F, 4F, 0F, 0F, 1F, 0F, 0.15F, 1.1F, 0F, 0.15F, -1.1F, 0F, 0F, -1F); // Box 86
		bodyModel[57].setRotationPoint(-48F, -30F, -12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1.5F, 4F, 0F, -1.5F, 4F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, 0F, -1F, 0F, 0.15F, -1.1F, 0F, 0.15F, 1.1F, 0F, 0F, 1F); // Box 88
		bodyModel[58].setRotationPoint(-48F, -30F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, -1.5F, -4.5F, 0F, -1.2F, -5.4F, 0F, -1.2F, 4.9F, 0F, -1.5F, 4F, 0F, 0.15F, 1.1F, 0F, 0.4F, 1.2F, 0F, 0.4F, -1.2F, 0F, 0.15F, -1.1F); // Box 89
		bodyModel[59].setRotationPoint(-44F, -30F, -12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, -1.5F, 4F, 0F, -1.2F, 4.9F, 0F, -1.2F, -5.4F, 0F, -1.5F, -4.5F, 0F, 0.15F, -1.1F, 0F, 0.4F, -1.2F, 0F, 0.4F, 1.2F, 0F, 0.15F, 1.1F); // Box 90
		bodyModel[60].setRotationPoint(-44F, -30F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 16, 8, 1, 0F,0F, -1.2F, -5.4F, 0.5F, 0F, -7.5F, 0.5F, 0F, 11F, 0F, -1.2F, 4.9F, 0F, 0.4F, 1.2F, 0F, 1F, 1.5F, 0F, 1F, -1.5F, 0F, 0.4F, -1.2F); // Box 91
		bodyModel[61].setRotationPoint(-36F, -30F, -12F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 8, 1, 0F,0F, -1.2F, 4.9F, 0.5F, 0F, 11F, 0.5F, 0F, -7.5F, 0F, -1.2F, -5.4F, 0F, 0.4F, -1.2F, 0F, 1F, -1.5F, 0F, 1F, 1.5F, 0F, 0.4F, 1.2F); // Box 92
		bodyModel[62].setRotationPoint(-36F, -30F, 11F);

		bodyModel[63].addShapeBox(0F, -4F, 0F, 54, 3, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 13F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 13F, 1F, 0F); // Box 95
		bodyModel[63].setRotationPoint(-32F, -15F, -25.5F);
		bodyModel[63].rotateAngleZ = -0.03490659F;

		bodyModel[64].addShapeBox(0F, -4F, 0F, 54, 3, 13, 0F,13F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 13F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[64].setRotationPoint(-32F, -15F, 12.5F);
		bodyModel[64].rotateAngleZ = -0.03490659F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 20, 1, 27, 0F,0F, 0F, 0F, -4F, 0F, 0F, 19F, 0F, 0F, -31F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 19F, 0F, 0F, -31F, 0F, -1F); // Box 103
		bodyModel[65].setRotationPoint(96F, -41F, 1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 20, 1, 27, 0F,-31F, 0F, -1F, 19F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -31F, 0F, -1F, 19F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[66].setRotationPoint(96F, -41F, -28.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[67].setRotationPoint(-32F, -16F, 24F);
		bodyModel[67].rotateAngleZ = -0.03490659F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[68].setRotationPoint(-32F, -16F, -25F);
		bodyModel[68].rotateAngleZ = -0.03490659F;

		bodyModel[69].addShapeBox(0F, -0.5F, -0.5F, 16, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.3F, 0.3F); // Box 111
		bodyModel[69].setRotationPoint(-75F, -9.5F, -5.3F);
		bodyModel[69].rotateAngleY = -0.05235988F;
		bodyModel[69].rotateAngleZ = -0.05235988F;

		bodyModel[70].addShapeBox(-7F, -0.5F, -0.5F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 112
		bodyModel[70].setRotationPoint(-75F, -9.5F, -5.3F);
		bodyModel[70].rotateAngleY = -0.05235988F;
		bodyModel[70].rotateAngleZ = -0.05235988F;

		bodyModel[71].addShapeBox(0F, -0.5F, -0.5F, 16, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.3F, 0.3F); // Box 113
		bodyModel[71].setRotationPoint(-68.5F, -8F, -4.6F);
		bodyModel[71].rotateAngleY = -0.01745329F;
		bodyModel[71].rotateAngleZ = -0.03490659F;

		bodyModel[72].addShapeBox(0F, -0.5F, -0.5F, 35, 1, 1, 0F,0F, 0.3F, 0.3F, 3F, 0.3F, 0.3F, 2F, 1.3F, -0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -5F, -0.3F, -0.3F, -8F, -0.3F, -0.3F, 0F, 0.3F, 0.3F); // Box 114
		bodyModel[72].setRotationPoint(-77F, -9.5F, 5.2F);
		bodyModel[72].rotateAngleY = 0.04363323F;
		bodyModel[72].rotateAngleZ = -0.10471976F;

		bodyModel[73].addShapeBox(-5.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F); // Box 115
		bodyModel[73].setRotationPoint(-77F, -9.5F, 5.2F);
		bodyModel[73].rotateAngleY = 0.04363323F;
		bodyModel[73].rotateAngleZ = -0.10471976F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 22, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[74].setRotationPoint(-40F, -34F, -4F);
		bodyModel[74].rotateAngleZ = -0.13962634F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 18, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[75].setRotationPoint(-37F, -26F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[76].setRotationPoint(-50F, -19F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 7, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[77].setRotationPoint(-59F, -29.5F, -4.5F);
		bodyModel[77].rotateAngleZ = 0.06981317F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 18, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[78].setRotationPoint(-55F, -22.5F, -9F);
		bodyModel[78].rotateAngleZ = 0.06981317F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 18, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[79].setRotationPoint(-55F, -22.5F, 5F);
		bodyModel[79].rotateAngleZ = 0.06981317F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 10, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[80].setRotationPoint(-61F, -23.5F, -1.5F);
		bodyModel[80].rotateAngleZ = 0.06981317F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[81].setRotationPoint(-60F, -27.5F, -8.2F);
		bodyModel[81].rotateAngleZ = 0.06981317F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[82].setRotationPoint(-60F, -27.5F, 4.2F);
		bodyModel[82].rotateAngleZ = 0.06981317F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 162
		bodyModel[83].setRotationPoint(-55.5F, -32F, -1F);
		bodyModel[83].rotateAngleZ = -0.17453293F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 52, 52, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -50F, -0.2F, 0.2F, -50F, -0.2F, -50.2F, 0F, -0.2F, -50.2F, 0F, -0.2F, -50.2F, -50F, -0.2F, -50.2F, -50F); // Box 163
		bodyModel[84].setRotationPoint(-54.5F, -33.8F, -1F);
		bodyModel[84].rotateAngleZ = -0.36651914F;
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 18
		noseModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		noseModel[2] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 20
		noseModel[3] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 21
		noseModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		noseModel[5] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 23
		noseModel[6] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 24
		noseModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25
		noseModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 26
		noseModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		noseModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 28
		noseModel[11] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 29

		noseModel[0].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 18
		noseModel[0].setRotationPoint(-82F, -22F, -9F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 19
		noseModel[1].setRotationPoint(-82F, -22F, 8F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F); // Box 20
		noseModel[2].setRotationPoint(-82F, -28F, -4F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 21
		noseModel[3].setRotationPoint(-82F, -11F, -4F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 22
		noseModel[4].setRotationPoint(-82F, -28F, 4F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, -1.5F, -5F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 23
		noseModel[5].setRotationPoint(-82F, -28F, -9F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -1.5F, -5F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 24
		noseModel[6].setRotationPoint(-82F, -14F, -9F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5F); // Box 25
		noseModel[7].setRotationPoint(-82F, -14F, 4F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 0F); // Box 26
		noseModel[8].setRotationPoint(-79F, -19F, 0F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 27
		noseModel[9].setRotationPoint(-79F, -19F, -3F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 28
		noseModel[10].setRotationPoint(-79F, -26F, 0F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,1F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		noseModel[11].setRotationPoint(-79F, -26F, -3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 271
		tailModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 272
		tailModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 273
		tailModel[3] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 274

		tailModel[0].addShapeBox(110F, -13F, 0F, 13, 9, 27, 0F,0F, -5F, -9F, 0F, -6F, -12F, 0F, -6F, -12F, 0F, -5F, -9F, 0F, 2F, -5F, 0F, -2F, -11F, 0F, -2F, -11F, 0F, 2F, -5F); // Box 271
		tailModel[0].setRotationPoint(-20F, -17F, -13.5F);
		tailModel[0].rotateAngleZ = -0.03490659F;

		tailModel[1].addShapeBox(110F, -3.5F, 0F, 4, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 272
		tailModel[1].setRotationPoint(-20F, -15F, -7.5F);
		tailModel[1].rotateAngleZ = -0.03490659F;

		tailModel[2].addShapeBox(110F, 1.5F, 0F, 4, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 273
		tailModel[2].setRotationPoint(-20F, -15F, -7.5F);
		tailModel[2].rotateAngleZ = -0.03490659F;

		tailModel[3].addShapeBox(110F, -8.5F, 0F, 4, 5, 15, 0F,0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 274
		tailModel[3].setRotationPoint(-20F, -15F, -7.5F);
		tailModel[3].rotateAngleZ = -0.03490659F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 97
		leftWingModel[1] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 98
		leftWingModel[2] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 99
		leftWingModel[3] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 109

		leftWingModel[0].addShapeBox(0F, -4F, 0F, 54, 3, 47, 0F,-52F, -4F, 0F, 45F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -52F, 4F, 0F, 45F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftWingModel[0].setRotationPoint(-32F, -15F, -72.5F);
		leftWingModel[0].rotateAngleZ = -0.03490659F;

		leftWingModel[1].addShapeBox(0F, -4F, 0F, 47, 3, 6, 0F,-6.5F, -0.5F, 0F, 4F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6.5F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		leftWingModel[1].setRotationPoint(20F, -9.2F, -78.5F);
		leftWingModel[1].rotateAngleZ = -0.03490659F;

		leftWingModel[2].addShapeBox(0F, -4F, 0F, 47, 3, 11, 0F,-20F, -1F, 0F, -1F, -3F, 0F, 4F, -2.5F, 0F, -6.5F, -0.5F, 0F, -20F, 1F, 0F, -1F, 1F, 0F, 4F, 0.5F, 0F, -6.5F, 0.5F, 0F); // Box 99
		leftWingModel[2].setRotationPoint(20F, -9.2F, -89.5F);
		leftWingModel[2].rotateAngleZ = -0.03490659F;

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 109
		leftWingModel[3].setRotationPoint(-18F, -15.5F, -36F);
		leftWingModel[3].rotateAngleZ = -0.03490659F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 100
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 101
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 102
		rightWingModel[3] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 106
		rightWingModel[4] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 110

		rightWingModel[0].addShapeBox(0F, -4F, 0F, 54, 3, 47, 0F,0F, 0F, 0F, 0F, -2F, 0F, 45F, -6F, 0F, -52F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 4F, 0F, -52F, 4F, 0F); // Box 100
		rightWingModel[0].setRotationPoint(-32F, -15F, 25.5F);
		rightWingModel[0].rotateAngleZ = -0.03490659F;

		rightWingModel[1].addShapeBox(0F, -4F, 0F, 47, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 4F, -2.5F, 0F, -6.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0.5F, 0F, -6.5F, 0.5F, 0F); // Box 101
		rightWingModel[1].setRotationPoint(20F, -9.2F, 72.5F);
		rightWingModel[1].rotateAngleZ = -0.03490659F;

		rightWingModel[2].addShapeBox(0F, -4F, 0F, 47, 3, 11, 0F,-6.5F, -0.5F, 0F, 4F, -2.5F, 0F, -1F, -3F, 0F, -20F, -1F, 0F, -6.5F, 0.5F, 0F, 4F, 0.5F, 0F, -1F, 1F, 0F, -20F, 1F, 0F); // Box 102
		rightWingModel[2].setRotationPoint(20F, -9.2F, 78.5F);
		rightWingModel[2].rotateAngleZ = -0.03490659F;

		rightWingModel[3].addShapeBox(0F, 0F, -19F, 4, 1, 36, 0F,0F, 0F, 0F, 3.2F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.2F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		rightWingModel[3].setRotationPoint(124F, -41F, 15.5F);
		rightWingModel[3].rotateAngleY = -0.70685835F;

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 110
		rightWingModel[4].setRotationPoint(-18F, -15.5F, 35F);
		rightWingModel[4].rotateAngleZ = -0.03490659F;
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 93
		yawFlapModel[1] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 94
		yawFlapModel[2] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 159
		yawFlapModel[3] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 161

		yawFlapModel[0].addShapeBox(0F, -16F, 0F, 17, 32, 3, 0F,-12F, -3.7F, -0.2F, 5F, -3.7F, -0.2F, 5F, -3.7F, -0.2F, -12F, -3.7F, -0.2F, 16F, 0F, -0.2F, -18F, 0F, -0.2F, -18F, 0F, -0.2F, 16F, 0F, -0.2F); // Box 93
		yawFlapModel[0].setRotationPoint(107.5F, -39.5F, -1.5F);

		yawFlapModel[1].addShapeBox(5F, -16.5F, 0F, 9, 4, 3, 0F,-3.5F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -3.5F, -0.1F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 94
		yawFlapModel[1].setRotationPoint(115.5F, -39.5F, -1.5F);

		yawFlapModel[2].addShapeBox(-2F, 0F, 2F, 3, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 159
		yawFlapModel[2].setRotationPoint(-57F, -16.5F, 0F);
		yawFlapModel[2].rotateAngleZ = 0.06981317F;

		yawFlapModel[3].addShapeBox(-2F, 0F, -4F, 3, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 161
		yawFlapModel[3].setRotationPoint(-57F, -16.5F, 0F);
		yawFlapModel[3].rotateAngleZ = 0.06981317F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 105
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 158

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, -19F, 4, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3.2F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.2F, 0F, -6.5F, 0F, 0F, 0F); // Box 105
		pitchFlapLeftModel[0].setRotationPoint(122.9F, -41F, -14F);
		pitchFlapLeftModel[0].rotateAngleY = 0.70685835F;

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -14F, -0.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		pitchFlapLeftModel[1].setRotationPoint(-51F, -13.5F, 0F);
		pitchFlapLeftModel[1].rotateAngleZ = 0.06981317F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 116
		bodyWheelModel[1] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 117
		bodyWheelModel[2] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 118
		bodyWheelModel[3] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 119
		bodyWheelModel[4] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 120
		bodyWheelModel[5] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 121
		bodyWheelModel[6] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 122
		bodyWheelModel[7] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 123
		bodyWheelModel[8] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 124
		bodyWheelModel[9] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 145
		bodyWheelModel[10] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 146
		bodyWheelModel[11] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 147
		bodyWheelModel[12] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 148

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyWheelModel[0].setRotationPoint(-65.5F, 3.5F, -1.5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 117
		bodyWheelModel[1].setRotationPoint(-65.5F, 6.5F, -1.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyWheelModel[2].setRotationPoint(-65.5F, 0.5F, -1.5F);

		bodyWheelModel[3].addShapeBox(3F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyWheelModel[3].setRotationPoint(-67.5F, -2.5F, -2.5F);
		bodyWheelModel[3].rotateAngleZ = -0.6981317F;

		bodyWheelModel[4].addShapeBox(0F, -7F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyWheelModel[4].setRotationPoint(-66.5F, -2.5F, -0.5F);
		bodyWheelModel[4].rotateAngleZ = -0.6981317F;

		bodyWheelModel[5].addShapeBox(0F, 0.5F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyWheelModel[5].setRotationPoint(-67.5F, -2.5F, -1.5F);
		bodyWheelModel[5].rotateAngleZ = -0.6981317F;

		bodyWheelModel[6].addShapeBox(0F, -7F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 122
		bodyWheelModel[6].setRotationPoint(-65.5F, 3.5F, -0.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 123
		bodyWheelModel[7].setRotationPoint(-77F, -10.5F, -4F);
		bodyWheelModel[7].rotateAngleZ = -0.2268928F;

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 124
		bodyWheelModel[8].setRotationPoint(-77F, -10.5F, 3F);
		bodyWheelModel[8].rotateAngleZ = -0.2268928F;

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 24, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -1F, 0F, -0.3F); // Box 145
		bodyWheelModel[9].setRotationPoint(-21.5F, -15.5F, -14.5F);
		bodyWheelModel[9].rotateAngleX = -0.08726646F;

		bodyWheelModel[10].addShapeBox(1F, 9F, 0F, 8, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, -0.5F, -1F, -0.3F, -4.5F, 2F, -0.3F, -4.5F, 2F, -0.3F, -0.5F, -1F, -0.3F); // Box 146
		bodyWheelModel[10].setRotationPoint(-21.5F, -15.5F, -14.5F);
		bodyWheelModel[10].rotateAngleX = -0.08726646F;

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 24, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -1F, 0F, -0.3F); // Box 147
		bodyWheelModel[11].setRotationPoint(-21.5F, -15.5F, 13.5F);
		bodyWheelModel[11].rotateAngleX = 0.08726646F;

		bodyWheelModel[12].addShapeBox(1F, 9F, 0F, 8, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, -0.5F, -1F, -0.3F, -4.5F, 2F, -0.3F, -4.5F, 2F, -0.3F, -0.5F, -1F, -0.3F); // Box 148
		bodyWheelModel[12].setRotationPoint(-21.5F, -15.5F, 13.5F);
		bodyWheelModel[12].rotateAngleX = 0.08726646F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 125
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 126
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 127
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 128
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 129
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 130
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 131
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 132
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 133
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 134

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftWingWheelModel[0].setRotationPoint(-4F, 0.5F, -37.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingWheelModel[1].setRotationPoint(-4F, -4.5F, -37.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 127
		leftWingWheelModel[2].setRotationPoint(-4F, 5.5F, -37.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftWingWheelModel[3].setRotationPoint(0.5F, -10.5F, -38.5F);
		leftWingWheelModel[3].rotateAngleX = 0.01745329F;
		leftWingWheelModel[3].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 129
		leftWingWheelModel[4].setRotationPoint(0.5F, -10.5F, -38.5F);
		leftWingWheelModel[4].rotateAngleX = 0.01745329F;
		leftWingWheelModel[4].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[5].addShapeBox(0F, -11F, 0F, 1, 11, 1, 0F,0.3F, -1F, 0.3F, 0.3F, -1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 130
		leftWingWheelModel[5].setRotationPoint(0.5F, -10.5F, -32.5F);
		leftWingWheelModel[5].rotateAngleX = -0.99483767F;
		leftWingWheelModel[5].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 131
		leftWingWheelModel[6].setRotationPoint(0.5F, -10.5F, -32.5F);
		leftWingWheelModel[6].rotateAngleX = -0.99483767F;
		leftWingWheelModel[6].rotateAngleZ = -0.03490659F;

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 132
		leftWingWheelModel[7].setRotationPoint(-2.5F, -6.5F, -39.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,-1F, 0F, -0.3F, -5F, 0F, -0.3F, -5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 133
		leftWingWheelModel[8].setRotationPoint(-5.5F, -3.5F, -39.5F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.5F, 0F, -0.3F, -6F, 0F, -0.3F, -6F, 0F, -0.3F, -2.5F, 0F, -0.3F); // Box 134
		leftWingWheelModel[9].setRotationPoint(-5.5F, 1.5F, -39.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 135
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 136
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 137
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 138
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 139
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 140
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 141
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 142
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 143
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 144

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		rightWingWheelModel[0].setRotationPoint(-4F, 0.5F, 34.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rightWingWheelModel[1].setRotationPoint(-4F, -4.5F, 34.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 137
		rightWingWheelModel[2].setRotationPoint(-4F, 5.5F, 34.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		rightWingWheelModel[3].setRotationPoint(0.5F, -10.5F, 37.5F);
		rightWingWheelModel[3].rotateAngleX = 0.01745329F;
		rightWingWheelModel[3].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[4].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 139
		rightWingWheelModel[4].setRotationPoint(0.5F, -10.5F, 37.5F);
		rightWingWheelModel[4].rotateAngleX = 0.01745329F;
		rightWingWheelModel[4].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[5].addShapeBox(0F, -10.5F, 0F, 1, 11, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -2F, 0.3F, 0.3F, -2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 140
		rightWingWheelModel[5].setRotationPoint(0.5F, -10.5F, 31.5F);
		rightWingWheelModel[5].rotateAngleX = 0.99483767F;
		rightWingWheelModel[5].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[6].addShapeBox(0F, 0.5F, 0F, 1, 7, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 141
		rightWingWheelModel[6].setRotationPoint(0.5F, -10.5F, 31.5F);
		rightWingWheelModel[6].rotateAngleX = 0.99483767F;
		rightWingWheelModel[6].rotateAngleZ = -0.03490659F;

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 142
		rightWingWheelModel[7].setRotationPoint(-2.5F, -6.5F, 38.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 17, 5, 1, 0F,-1F, 0F, -0.3F, -5F, 0F, -0.3F, -5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 143
		rightWingWheelModel[8].setRotationPoint(-5.5F, -3.5F, 38.5F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 17, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.5F, 0F, -0.3F, -6F, 0F, -0.3F, -6F, 0F, -0.3F, -2.5F, 0F, -0.3F); // Box 144
		rightWingWheelModel[9].setRotationPoint(-5.5F, 1.5F, 38.5F);
	}
}