//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: J7
// Model Creator: 
// Created on: 07.08.2016 - 16:21:05
// Last changed on: 07.08.2016 - 16:21:05

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJ7 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelJ7() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[86];
		tailModel = new ModelRendererTurbo[12];
		leftWingModel = new ModelRendererTurbo[14];
		rightWingModel = new ModelRendererTurbo[14];
		yawFlapModel = new ModelRendererTurbo[5];
		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel = new ModelRendererTurbo[6];
		rightWingWheelModel = new ModelRendererTurbo[6];
		hudModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		inithudModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Import Box5
		bodyModel[4] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box7
		bodyModel[5] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Import Box8
		bodyModel[6] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Import Box9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box10
		bodyModel[8] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box12
		bodyModel[9] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import Box14
		bodyModel[10] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Import Box16
		bodyModel[11] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Import Box18
		bodyModel[12] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Import Box19
		bodyModel[13] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Import Box20
		bodyModel[14] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Import Box21
		bodyModel[15] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import Box22
		bodyModel[16] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box23
		bodyModel[17] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Import Box24
		bodyModel[18] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Import Box26
		bodyModel[19] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Import Box27
		bodyModel[20] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Import Box28
		bodyModel[21] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Import Box29
		bodyModel[22] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Import Box30
		bodyModel[23] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Import Box31
		bodyModel[24] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Import Box32
		bodyModel[25] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box33
		bodyModel[26] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Import Box34
		bodyModel[27] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Import Box35
		bodyModel[28] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Import Box36
		bodyModel[29] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Import Box37
		bodyModel[30] = new ModelRendererTurbo(this, 601, 145, textureX, textureY); // Import Box38
		bodyModel[31] = new ModelRendererTurbo(this, 697, 145, textureX, textureY); // Import Box39
		bodyModel[32] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box40
		bodyModel[33] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box41
		bodyModel[34] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box42
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box44
		bodyModel[36] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box46
		bodyModel[37] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box48
		bodyModel[38] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Import Box49
		bodyModel[39] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Import Box50
		bodyModel[40] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Import Box51
		bodyModel[41] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Import Box53
		bodyModel[42] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box54
		bodyModel[43] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Import Box55
		bodyModel[44] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Import Box56
		bodyModel[45] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Import Box57
		bodyModel[46] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Import Box58
		bodyModel[47] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box69
		bodyModel[48] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box70
		bodyModel[49] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Import Box73
		bodyModel[50] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box109
		bodyModel[51] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box110
		bodyModel[52] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import Box112
		bodyModel[53] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box113
		bodyModel[54] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box114
		bodyModel[55] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box115
		bodyModel[56] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box116
		bodyModel[57] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box117
		bodyModel[58] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Import Box118
		bodyModel[59] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Import Box119
		bodyModel[60] = new ModelRendererTurbo(this, 929, 201, textureX, textureY); // Import Box120
		bodyModel[61] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box121
		bodyModel[62] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Import Box122
		bodyModel[63] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box123
		bodyModel[64] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box124
		bodyModel[65] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box125
		bodyModel[66] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Import Box126
		bodyModel[67] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Import Box127
		bodyModel[68] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Import Box128
		bodyModel[69] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box129
		bodyModel[70] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Import Box130
		bodyModel[71] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Import Box131
		bodyModel[72] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box132
		bodyModel[73] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Import Box133
		bodyModel[74] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Import Box134
		bodyModel[75] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Import Box135
		bodyModel[76] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Import Box136
		bodyModel[77] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box140
		bodyModel[78] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Import Box148
		bodyModel[79] = new ModelRendererTurbo(this, 969, 209, textureX, textureY); // Import Box149
		bodyModel[80] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Import Box150
		bodyModel[81] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Import Box151
		bodyModel[82] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Import Box149
		bodyModel[83] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box157
		bodyModel[84] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box158
		bodyModel[85] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Import Box159

		bodyModel[0].addShapeBox(0F, 0F, 0F, 42, 5, 25, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		bodyModel[0].setRotationPoint(-65F, -46F, -12.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 24, 5, 25, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[1].setRotationPoint(-23F, -46F, -12.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 67, 5, 25, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box2
		bodyModel[2].setRotationPoint(1F, -46F, -12.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box5
		bodyModel[3].setRotationPoint(-23F, -18F, -11.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 24, 9, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[4].setRotationPoint(-23F, -41F, -15.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 24, 7, 31, 0F); // Import Box8
		bodyModel[5].setRotationPoint(-23F, -32F, -15.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box9
		bodyModel[6].setRotationPoint(-23F, -25F, -15.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 67, 9, 31, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box10
		bodyModel[7].setRotationPoint(1F, -41F, -15.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 67, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box12
		bodyModel[8].setRotationPoint(1F, -32F, -15.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 67, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F); // Import Box14
		bodyModel[9].setRotationPoint(1F, -25F, -15.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 67, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -5F); // Import Box16
		bodyModel[10].setRotationPoint(1F, -18F, -11.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 42, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -5F); // Import Box18
		bodyModel[11].setRotationPoint(-65F, -18F, -11.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 41, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -5F); // Import Box19
		bodyModel[12].setRotationPoint(-106F, -18F, -11.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 22, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -5F); // Import Box20
		bodyModel[13].setRotationPoint(-128F, -18F, -11.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 42, 7, 31, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Box21
		bodyModel[14].setRotationPoint(-65F, -25F, -15.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 42, 7, 31, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box22
		bodyModel[15].setRotationPoint(-65F, -32F, -15.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 42, 9, 31, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box23
		bodyModel[16].setRotationPoint(-65F, -41F, -15.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 41, 7, 30, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box24
		bodyModel[17].setRotationPoint(-106F, -25F, -15.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 41, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[18].setRotationPoint(-106F, -32F, -14.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 41, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[19].setRotationPoint(-106F, -32F, 7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 41, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[20].setRotationPoint(-106F, -41F, 10.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 41, 9, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[21].setRotationPoint(-106F, -41F, -14.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 41, 5, 4, 0F,0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box30
		bodyModel[22].setRotationPoint(-106F, -46F, -11.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 41, 5, 4, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		bodyModel[23].setRotationPoint(-106F, -46F, 7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 22, 3, 23, 0F,0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box32
		bodyModel[24].setRotationPoint(-128F, -44F, -11.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 22, 9, 29, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[25].setRotationPoint(-128F, -41F, -14.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 18, 8, 29, 0F,0F, -1F, -8F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -1F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box34
		bodyModel[26].setRotationPoint(-146F, -40F, -14.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 2, 23, 0F,0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, 1F, -5F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, -5F); // Import Box35
		bodyModel[27].setRotationPoint(-146F, -42F, -11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 22, 7, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[28].setRotationPoint(-128F, -32F, -14.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 22, 7, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box37
		bodyModel[29].setRotationPoint(-128F, -25F, -14.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 18, 7, 29, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box38
		bodyModel[30].setRotationPoint(-146F, -32F, -14.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 18, 7, 29, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F); // Import Box39
		bodyModel[31].setRotationPoint(-146F, -25F, -14.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 2, 23, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -5F); // Import Box40
		bodyModel[32].setRotationPoint(-146F, -18F, -11.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 2, 17, 0F,0F, -4F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, 3F, -4F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 3F, -4F); // Import Box41
		bodyModel[33].setRotationPoint(-154F, -40F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F,0F, -2F, -7F, 0F, 1F, -5F, 0F, 2F, -1F, 0F, -2F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F); // Import Box42
		bodyModel[34].setRotationPoint(-154F, -38F, -11.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box44
		bodyModel[35].setRotationPoint(-154F, -32F, 10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, 0F, -3F, 0F, 1F, 1F, 0F, -3F, 3F); // Import Box46
		bodyModel[36].setRotationPoint(-154F, -25F, -11.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 8, 2, 17, 0F,0F, 3F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, -3F, 0F, -4F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -4F); // Import Box48
		bodyModel[37].setRotationPoint(-154F, -19F, -8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 23, 10, 10, 0F,0F, -5F, -5F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -5F, -5F); // Import Box49
		bodyModel[38].setRotationPoint(-163F, -33F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 30, 1, 1, 0F); // Import Box50
		bodyModel[39].setRotationPoint(-182F, -41F, 3F);

		bodyModel[40].addBox(0F, 0F, 0F, 22, 3, 1, 0F); // Import Box51
		bodyModel[40].setRotationPoint(-152F, -41F, 3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 42, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[41].setRotationPoint(-65F, -53F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 42, 4, 19, 0F,0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box54
		bodyModel[42].setRotationPoint(-65F, -50F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 24, 4, 19, 0F,0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[43].setRotationPoint(-23F, -50F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 24, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		bodyModel[44].setRotationPoint(-23F, -53F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 67, 4, 19, 0F,0F, 0F, -7.5F, 0F, -1F, -7.5F, 0F, -1F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Import Box57
		bodyModel[45].setRotationPoint(1F, -50F, -9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 75, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[46].setRotationPoint(1F, -53F, -2F);

		bodyModel[47].addBox(0F, 0F, 0F, 18, 3, 13, 0F); // Import Box69
		bodyModel[47].setRotationPoint(-88F, -28F, -6.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 6, 9, 0F); // Import Box70
		bodyModel[48].setRotationPoint(-69F, -52F, -4.5F);
		bodyModel[48].rotateAngleZ = -0.08726646F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 18, 15, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[49].setRotationPoint(-106F, -43F, -7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 2F, -2F, -13F, 1F, -2F, -12F, 1.5F, 2F, 13F, 1.5F, 2F); // Import Box109
		bodyModel[50].setRotationPoint(-95F, -54F, 4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 13F, 1.5F, 2F, -12F, 1.5F, 2F, -13F, 1F, -2F, 15F, 2F, -2F); // Import Box110
		bodyModel[51].setRotationPoint(-95F, -54F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		bodyModel[52].setRotationPoint(-81F, -55F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, -3F, -2F, 0F, -3F); // Import Box113
		bodyModel[53].setRotationPoint(-81F, -55F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 3F, -2F, 0F, 3F); // Import Box114
		bodyModel[54].setRotationPoint(-81F, -55F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.8F, 2F, 0F, -1.8F, 2F, 0F, 1.8F, -2F, 0F, 1.8F); // Import Box115
		bodyModel[55].setRotationPoint(-79F, -51F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1.8F, 2F, 0F, 1.8F, 2F, 0F, -1.8F, -2F, 0F, -1.8F); // Import Box116
		bodyModel[56].setRotationPoint(-79F, -51F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, -1F, 2F, 0.8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.8F, -1F); // Import Box117
		bodyModel[57].setRotationPoint(-95F, -54F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F, 0F, 2F, 0.8F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0.8F, -1F); // Import Box118
		bodyModel[58].setRotationPoint(-106F, -46F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import Box119
		bodyModel[59].setRotationPoint(-105F, -46F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box120
		bodyModel[60].setRotationPoint(-105F, -40.8F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		bodyModel[61].setRotationPoint(-99F, -46.5F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box122
		bodyModel[62].setRotationPoint(-95.5F, -46.8F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		bodyModel[63].setRotationPoint(-96.5F, -47.2F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Import Box124
		bodyModel[64].setRotationPoint(-96.5F, -47.8F, -1.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,-0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F); // Import Box125
		bodyModel[65].setRotationPoint(-96.5F, -51.8F, -3F);
		bodyModel[65].rotateAngleZ = -0.57595865F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Import Box126
		bodyModel[66].setRotationPoint(-98.4F, -48.8F, -2.5F);
		bodyModel[66].rotateAngleZ = -0.57595865F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Import Box127
		bodyModel[67].setRotationPoint(-98.4F, -48.8F, 1.5F);
		bodyModel[67].rotateAngleZ = -0.57595865F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		bodyModel[68].setRotationPoint(-105F, -43F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		bodyModel[69].setRotationPoint(-96.5F, -39.8F, 0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		bodyModel[70].setRotationPoint(-104F, -39.8F, -10.4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		bodyModel[71].setRotationPoint(-104F, -39.8F, 7.4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		bodyModel[72].setRotationPoint(-94.95F, -39.8F, -10.4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[73].setRotationPoint(-94.95F, -39.8F, 7.4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box134
		bodyModel[74].setRotationPoint(-90.5F, -34.8F, -10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -2.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box135
		bodyModel[75].setRotationPoint(-92.5F, -34.8F, -10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box136
		bodyModel[76].setRotationPoint(-87.5F, -34.8F, -10.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		bodyModel[77].setRotationPoint(-105F, -32.8F, -2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 4, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		bodyModel[78].setRotationPoint(-69F, -46F, -7.5F);
		bodyModel[78].rotateAngleZ = -0.08726646F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[79].setRotationPoint(-69F, -42F, -7.5F);
		bodyModel[79].rotateAngleZ = -0.08726646F;

		bodyModel[80].addBox(0F, 0F, 0F, 18, 5, 1, 0F); // Import Box150
		bodyModel[80].setRotationPoint(-88F, -30F, -7.5F);
		bodyModel[80].rotateAngleZ = -0.15707963F;

		bodyModel[81].addBox(0F, 0F, 0F, 18, 5, 1, 0F); // Import Box151
		bodyModel[81].setRotationPoint(-88F, -30F, 6.5F);
		bodyModel[81].rotateAngleZ = -0.15707963F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box149
		bodyModel[82].setRotationPoint(-202F, -41F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Import Box157
		bodyModel[83].setRotationPoint(-154F, -32F, -11.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 8, 6, 7, 0F,0F, -2F, 1F, 0F, 2F, -1F, 0F, 1F, -5F, 0F, -2F, -7F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box158
		bodyModel[84].setRotationPoint(-154F, -38F, 4.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, 1F, 1F, 0F, 0F, -3F, 0F, -4F, -5F); // Import Box159
		bodyModel[85].setRotationPoint(-154F, -25F, 7.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box3
		tailModel[1] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box11
		tailModel[2] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Import Box13
		tailModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box15
		tailModel[4] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import Box17
		tailModel[5] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Import Box59
		tailModel[6] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Import Box61
		tailModel[7] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box62
		tailModel[8] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box63
		tailModel[9] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Import Box64
		tailModel[10] = new ModelRendererTurbo(this, 577, 297, textureX, textureY); // Import Box153
		tailModel[11] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Import Box154

		tailModel[0].addShapeBox(0F, 0F, 0F, 84, 6, 23, 0F,0F, 0F, -4F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F); // Import Box3
		tailModel[0].setRotationPoint(68F, -45F, -11.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 84, 9, 31, 0F,0F, 2F, -4F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 2F, -4F, 0F, -2F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -1F); // Import Box11
		tailModel[1].setRotationPoint(68F, -39F, -15.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 84, 7, 29, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box13
		tailModel[2].setRotationPoint(68F, -32F, -14.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 84, 7, 29, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F); // Import Box15
		tailModel[3].setRotationPoint(68F, -25F, -14.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 84, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, -5F); // Import Box17
		tailModel[4].setRotationPoint(68F, -18F, -10.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 84, 7, 15, 0F,0F, 0F, -7.5F, 0F, -6F, -7.5F, 0F, -6F, -7.5F, 0F, 0F, -7.5F, 0F, -2F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -2F, 0F); // Import Box59
		tailModel[5].setRotationPoint(68F, -50F, -7.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		tailModel[6].setRotationPoint(152F, -47F, -1.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box62
		tailModel[7].setRotationPoint(152F, -46F, -1.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box63
		tailModel[8].setRotationPoint(152F, -44F, -1.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 139, 45, 4, 0F,-94F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -94F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		tailModel[9].setRotationPoint(51F, -89F, -2.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 160, 40, 2, 0F,0F, 0F, 0F, -100F, 0F, 0F, -100F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, -100F, -20F, 0F, -100F, -20F, 0F, 0F, -20F, 0F); // Import Box153
		tailModel[10].setRotationPoint(101F, -73F, -2.8F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 160, 40, 2, 0F,0F, 0F, 0F, -100F, 0F, 0F, -100F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, -100F, -20F, 0F, -100F, -20F, 0F, 0F, -20F, 0F); // Import Box154
		tailModel[11].setRotationPoint(101F, -73F, 0.2F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import Box66
		leftWingModel[1] = new ModelRendererTurbo(this, 585, 185, textureX, textureY); // Import Box83
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box84
		leftWingModel[3] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Import Box85
		leftWingModel[4] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Import Box86
		leftWingModel[5] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Import Box87
		leftWingModel[6] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Import Box88
		leftWingModel[7] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Import Box89
		leftWingModel[8] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import Box90
		leftWingModel[9] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Import Box91
		leftWingModel[10] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Import Box92
		leftWingModel[11] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Import Box93
		leftWingModel[12] = new ModelRendererTurbo(this, 833, 257, textureX, textureY); // Import Box151
		leftWingModel[13] = new ModelRendererTurbo(this, 505, 345, textureX, textureY); // Import Box156

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 127, 5, 78, 0F,-115F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Import Box66
		leftWingModel[0].setRotationPoint(-49F, -30F, -91.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 51, 10, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		leftWingModel[1].setRotationPoint(0F, -27F, -51.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		leftWingModel[2].setRotationPoint(-37F, -17F, -53.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		leftWingModel[3].setRotationPoint(-37F, -15F, -53.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box86
		leftWingModel[4].setRotationPoint(-37F, -13F, -53.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Import Box87
		leftWingModel[5].setRotationPoint(-48F, -17F, -53.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box88
		leftWingModel[6].setRotationPoint(-48F, -15F, -53.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Import Box89
		leftWingModel[7].setRotationPoint(-48F, -13F, -53.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box90
		leftWingModel[8].setRotationPoint(51F, -19F, -50.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box91
		leftWingModel[9].setRotationPoint(51F, -13F, -57.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		leftWingModel[10].setRotationPoint(51F, -13F, -50.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		leftWingModel[11].setRotationPoint(51F, -19F, -57.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 46, 10, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		leftWingModel[12].setRotationPoint(25F, -27F, -68.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 40, 2, 160, 0F,-25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 1F, -110F, -25F, 1F, -110F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -110F, -25F, 0F, -110F); // Import Box156
		leftWingModel[13].setRotationPoint(22F, -30F, -69.2F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Import Box65
		rightWingModel[1] = new ModelRendererTurbo(this, 833, 201, textureX, textureY); // Import Box95
		rightWingModel[2] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Import Box96
		rightWingModel[3] = new ModelRendererTurbo(this, 537, 289, textureX, textureY); // Import Box97
		rightWingModel[4] = new ModelRendererTurbo(this, 753, 289, textureX, textureY); // Import Box98
		rightWingModel[5] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Import Box99
		rightWingModel[6] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Import Box100
		rightWingModel[7] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Import Box101
		rightWingModel[8] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Import Box102
		rightWingModel[9] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Import Box103
		rightWingModel[10] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Import Box104
		rightWingModel[11] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import Box105
		rightWingModel[12] = new ModelRendererTurbo(this, 833, 241, textureX, textureY); // Import Box150
		rightWingModel[13] = new ModelRendererTurbo(this, 257, 329, textureX, textureY); // Import Box155

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 127, 5, 78, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -115F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -115F, 0F, 0F); // Import Box65
		rightWingModel[0].setRotationPoint(-49F, -30F, 13.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 51, 10, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		rightWingModel[1].setRotationPoint(0F, -27F, 50.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		rightWingModel[2].setRotationPoint(-37F, -17F, 48.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		rightWingModel[3].setRotationPoint(-37F, -15F, 48.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box98
		rightWingModel[4].setRotationPoint(-37F, -13F, 48.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Import Box99
		rightWingModel[5].setRotationPoint(-48F, -17F, 48.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Box100
		rightWingModel[6].setRotationPoint(-48F, -15F, 48.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Import Box101
		rightWingModel[7].setRotationPoint(-48F, -13F, 48.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box102
		rightWingModel[8].setRotationPoint(51F, -13F, 44.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		rightWingModel[9].setRotationPoint(51F, -19F, 44.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Import Box104
		rightWingModel[10].setRotationPoint(51F, -19F, 51.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		rightWingModel[11].setRotationPoint(51F, -13F, 51.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 46, 10, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		rightWingModel[12].setRotationPoint(25F, -27F, 68.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 40, 1, 160, 0F,-25F, 1F, -110F, 0F, 1F, -110F, 0F, -0.1F, 0F, -25F, -0.1F, 0F, -25F, 0F, -110F, 0F, 0F, -110F, 0F, 0F, 0F, -25F, 0F, 0F); // Import Box155
		rightWingModel[13].setRotationPoint(22F, -29F, -90.8F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Import Box141
		yawFlapModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box142
		yawFlapModel[2] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Import Box143
		yawFlapModel[3] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box144
		yawFlapModel[4] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import Box145

		yawFlapModel[0].addShapeBox(1F, 0F, -7F, 2, 1, 5, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Import Box141
		yawFlapModel[0].setRotationPoint(-98.5F, -26.8F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -7F, 1, 1, 5, 0F,0F, -0.2F, -1.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.4F, 0F, -0.2F, -1.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.4F); // Import Box142
		yawFlapModel[1].setRotationPoint(-98.5F, -26.8F, 0F);

		yawFlapModel[2].addShapeBox(1F, 0F, 2F, 2, 1, 5, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Import Box143
		yawFlapModel[2].setRotationPoint(-98.5F, -26.8F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, 2F, 1, 1, 5, 0F,0F, -0.2F, -1.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.4F, 0F, -0.2F, -1.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.4F); // Import Box144
		yawFlapModel[3].setRotationPoint(-98.5F, -26.8F, 0F);

		yawFlapModel[4].addShapeBox(1F, 0F, -4F, 1, 1, 8, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Import Box145
		yawFlapModel[4].setRotationPoint(-99.5F, -26.8F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box67
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Import Box137
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Import Box138

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 81, 1, 36, 0F,-55F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		pitchFlapLeftModel[0].setRotationPoint(102F, -31F, -47.5F);

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -12F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Import Box137
		pitchFlapLeftModel[1].setRotationPoint(-90.5F, -24.8F, 0F);

		pitchFlapLeftModel[2].addShapeBox(-0.5F, -14F, -0.5F, 1, 2, 1, 0F,0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Import Box138
		pitchFlapLeftModel[2].setRotationPoint(-90.5F, -24.8F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Import Box68

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 81, 1, 36, 0F,0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F); // Import Box68
		pitchFlapRightModel[0].setRotationPoint(102F, -31F, 11.5F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Import Box118
		bodyWheelModel[1] = new ModelRendererTurbo(this, 737, 185, textureX, textureY); // Import Box119
		bodyWheelModel[2] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Import Box120
		bodyWheelModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box121
		bodyWheelModel[4] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Import Box122

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,-5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		bodyWheelModel[0].setRotationPoint(-98F, -6F, -3F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		bodyWheelModel[1].setRotationPoint(-98F, -1F, -3F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F); // Import Box120
		bodyWheelModel[2].setRotationPoint(-98F, 4F, -3F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 3, 11, 3, 0F); // Import Box121
		bodyWheelModel[3].setRotationPoint(-100F, -15F, -2F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box122
		bodyWheelModel[4].setRotationPoint(-100F, -4F, -2F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box106
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box107
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box108
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box109
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Import Box110
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Import Box111

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 28, 2, 0F); // Import Box106
		leftWingWheelModel[0].setRotationPoint(26F, -27F, -41.5F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box107
		leftWingWheelModel[1].setRotationPoint(26F, -2F, -39.5F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 8, 21, 2, 0F); // Import Box108
		leftWingWheelModel[2].setRotationPoint(23F, -27F, -44.5F);

		leftWingWheelModel[3].addBox(0F, 0F, 0F, 18, 6, 5, 0F); // Import Box109
		leftWingWheelModel[3].setRotationPoint(18F, -2F, -37.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Import Box110
		leftWingWheelModel[4].setRotationPoint(18F, 4F, -37.5F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		leftWingWheelModel[5].setRotationPoint(18F, -8F, -37.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Import Box112
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box113
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box114
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Import Box115
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Import Box116
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Import Box117

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 8, 21, 2, 0F); // Import Box112
		rightWingWheelModel[0].setRotationPoint(23F, -27F, 42.5F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 2, 28, 2, 0F); // Import Box113
		rightWingWheelModel[1].setRotationPoint(26F, -27F, 39.5F);

		rightWingWheelModel[2].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box114
		rightWingWheelModel[2].setRotationPoint(26F, -2F, 37.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		rightWingWheelModel[3].setRotationPoint(18F, -8F, 32.5F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 18, 6, 5, 0F); // Import Box116
		rightWingWheelModel[4].setRotationPoint(18F, -2F, 32.5F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Import Box117
		rightWingWheelModel[5].setRotationPoint(18F, 4F, 32.5F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 913, 249, textureX, textureY); // Import Box147

		hudModel[0].addShapeBox(0F, -2F, -2F, 1, 54, 54, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -50.2F, -0.3F, -0.2F, -50.2F, -0.3F, -50.2F, -0.2F, -0.3F, -50.2F, -0.2F, -0.3F, -50.2F, -50.2F, -0.3F, -50.2F, -50.2F); // Import Box147
		hudModel[0].setRotationPoint(-97F, -48.8F, 0F);
	}
}