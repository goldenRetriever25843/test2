//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMig21 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMig21() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[89];
		tailModel = new ModelRendererTurbo[11];
		leftWingModel = new ModelRendererTurbo[13];
		rightWingModel = new ModelRendererTurbo[13];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 536, 121, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 644, 132, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 745, 129, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 601, 153, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 48
		bodyModel[41] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 49
		bodyModel[42] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 50
		bodyModel[43] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 51
		bodyModel[44] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 569, 185, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 913, 300, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 977, 185, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 109
		bodyModel[54] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 110
		bodyModel[55] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 112
		bodyModel[56] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 113
		bodyModel[57] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 114
		bodyModel[58] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 115
		bodyModel[59] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 116
		bodyModel[60] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 117
		bodyModel[61] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 118
		bodyModel[62] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 119
		bodyModel[63] = new ModelRendererTurbo(this, 937, 209, textureX, textureY); // Box 120
		bodyModel[64] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 121
		bodyModel[65] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 122
		bodyModel[66] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 123
		bodyModel[67] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 124
		bodyModel[68] = new ModelRendererTurbo(this, 169, 350, textureX, textureY); // Box 125
		bodyModel[69] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 126
		bodyModel[70] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 127
		bodyModel[71] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 128
		bodyModel[72] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 129
		bodyModel[73] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Box 130
		bodyModel[74] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 131
		bodyModel[75] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 132
		bodyModel[76] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 133
		bodyModel[77] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 134
		bodyModel[78] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 135
		bodyModel[79] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 136
		bodyModel[80] = new ModelRendererTurbo(this, 961, 241, textureX, textureY); // Box 139
		bodyModel[81] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 140
		bodyModel[82] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 146
		bodyModel[83] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 148
		bodyModel[84] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 149
		bodyModel[85] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 150
		bodyModel[86] = new ModelRendererTurbo(this, 913, 177, textureX, textureY); // Box 151
		bodyModel[87] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 149
		bodyModel[88] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 152

		bodyModel[0].addShapeBox(0F, 0F, 0F, 42, 5, 25, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[0].setRotationPoint(-65F, -46F, -12.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 24, 5, 25, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-23F, -46F, -12.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 67, 5, 25, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(1F, -46F, -12.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 5
		bodyModel[3].setRotationPoint(-23F, -18F, -11.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 24, 9, 31, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-23F, -41F, -15.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 24, 7, 31, 0F); // Box 8
		bodyModel[5].setRotationPoint(-23F, -32F, -15.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 24, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 9
		bodyModel[6].setRotationPoint(-23F, -25F, -15.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 67, 9, 31, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(1F, -41F, -15.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 67, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		bodyModel[8].setRotationPoint(1F, -32F, -15.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 67, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F); // Box 14
		bodyModel[9].setRotationPoint(1F, -25F, -15.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 67, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -5F); // Box 16
		bodyModel[10].setRotationPoint(1F, -18F, -11.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 42, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 18
		bodyModel[11].setRotationPoint(-65F, -18F, -11.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 41, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 19
		bodyModel[12].setRotationPoint(-106F, -18F, -11.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 22, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 20
		bodyModel[13].setRotationPoint(-128F, -18F, -11.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 42, 7, 31, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 21
		bodyModel[14].setRotationPoint(-65F, -25F, -15.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 42, 7, 31, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 22
		bodyModel[15].setRotationPoint(-65F, -32F, -15.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 42, 9, 31, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 23
		bodyModel[16].setRotationPoint(-65F, -41F, -15.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 41, 7, 30, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 24
		bodyModel[17].setRotationPoint(-106F, -25F, -15.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 41, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[18].setRotationPoint(-106F, -32F, -14.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 41, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[19].setRotationPoint(-106F, -32F, 7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 41, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[20].setRotationPoint(-106F, -41F, 10.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 41, 9, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[21].setRotationPoint(-106F, -41F, -14.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 41, 5, 4, 0F,0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 30
		bodyModel[22].setRotationPoint(-106F, -46F, -11.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 41, 5, 4, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[23].setRotationPoint(-106F, -46F, 7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 22, 3, 23, 0F,0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 32
		bodyModel[24].setRotationPoint(-128F, -44F, -11.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 22, 9, 29, 0F,0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[25].setRotationPoint(-128F, -41F, -14.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 18, 8, 29, 0F,0F, -1F, -8F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -1F, -8F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 34
		bodyModel[26].setRotationPoint(-146F, -40F, -14.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 18, 2, 23, 0F,0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, 1F, -5F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, -5F); // Box 35
		bodyModel[27].setRotationPoint(-146F, -42F, -11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 22, 7, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[28].setRotationPoint(-128F, -32F, -14.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 22, 7, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 37
		bodyModel[29].setRotationPoint(-128F, -25F, -14.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 18, 7, 29, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 38
		bodyModel[30].setRotationPoint(-146F, -32F, -14.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 18, 7, 29, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F); // Box 39
		bodyModel[31].setRotationPoint(-146F, -25F, -14.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 18, 2, 23, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -5F); // Box 40
		bodyModel[32].setRotationPoint(-146F, -18F, -11.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 17, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -3F); // Box 41
		bodyModel[33].setRotationPoint(-152F, -40F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F,0F, 0F, -6F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 42
		bodyModel[34].setRotationPoint(-152F, -38F, -11.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[35].setRotationPoint(-152F, -38F, 4.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 7, 1, 0F); // Box 44
		bodyModel[36].setRotationPoint(-152F, -32F, 10.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 7, 1, 0F); // Box 45
		bodyModel[37].setRotationPoint(-152F, -32F, -11.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 46
		bodyModel[38].setRotationPoint(-152F, -25F, -11.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F); // Box 47
		bodyModel[39].setRotationPoint(-152F, -25F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 2, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F); // Box 48
		bodyModel[40].setRotationPoint(-152F, -19F, -8.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 23, 10, 10, 0F,0F, -5F, -5F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -5F, -5F); // Box 49
		bodyModel[41].setRotationPoint(-173F, -34F, -5F);

		bodyModel[42].addBox(0F, 0F, 0F, 30, 1, 1, 0F); // Box 50
		bodyModel[42].setRotationPoint(-179F, -42F, 5F);

		bodyModel[43].addBox(0F, 0F, 0F, 22, 3, 1, 0F); // Box 51
		bodyModel[43].setRotationPoint(-149F, -42F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 42, 5, 17, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 53
		bodyModel[44].setRotationPoint(-65F, -55F, -8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 42, 4, 19, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 54
		bodyModel[45].setRotationPoint(-65F, -50F, -9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 24, 4, 19, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[46].setRotationPoint(-23F, -50F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 24, 5, 17, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[47].setRotationPoint(-23F, -55F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 67, 4, 19, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 57
		bodyModel[48].setRotationPoint(1F, -50F, -9.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 67, 5, 17, 0F,0F, 0F, -3F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 58
		bodyModel[49].setRotationPoint(1F, -55F, -8.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 18, 3, 13, 0F); // Box 69
		bodyModel[50].setRotationPoint(-88F, -28F, -6.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 6, 9, 0F); // Box 70
		bodyModel[51].setRotationPoint(-69F, -53F, -4.5F);
		bodyModel[51].rotateAngleZ = -0.08726646F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 18, 15, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[52].setRotationPoint(-106F, -43F, -7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 2F, -2F, -13F, 1F, -2F, -12F, 1.5F, 2F, 13F, 1.5F, 2F); // Box 109
		bodyModel[53].setRotationPoint(-95F, -54F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 13F, 1.5F, 2F, -12F, 1.5F, 2F, -13F, 1F, -2F, 15F, 2F, -2F); // Box 110
		bodyModel[54].setRotationPoint(-95F, -54F, -4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, -1F, 2F, 0.8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.8F, -1F); // Box 112
		bodyModel[55].setRotationPoint(-95F, -54F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, -3F, -2F, 0F, -3F); // Box 113
		bodyModel[56].setRotationPoint(-95F, -54F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 3F, -2F, 0F, 3F); // Box 114
		bodyModel[57].setRotationPoint(-95F, -54F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.8F, 2F, 0F, -1.8F, 2F, 0F, 1.8F, -2F, 0F, 1.8F); // Box 115
		bodyModel[58].setRotationPoint(-93F, -50F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1.8F, 2F, 0F, 1.8F, 2F, 0F, -1.8F, -2F, 0F, -1.8F); // Box 116
		bodyModel[59].setRotationPoint(-93F, -50F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, -1F, 2F, 0.8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.8F, -1F); // Box 117
		bodyModel[60].setRotationPoint(-95F, -54F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2.5F, 0F, 2F, 0.8F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0.8F, -1F); // Box 118
		bodyModel[61].setRotationPoint(-106F, -46F, -5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 119
		bodyModel[62].setRotationPoint(-105F, -46F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[63].setRotationPoint(-105F, -40.8F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[64].setRotationPoint(-99F, -46.5F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 122
		bodyModel[65].setRotationPoint(-95.5F, -46.8F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[66].setRotationPoint(-96.5F, -47.2F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 124
		bodyModel[67].setRotationPoint(-96.5F, -47.8F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,-0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F); // Box 125
		bodyModel[68].setRotationPoint(-96.5F, -51.8F, -3F);
		bodyModel[68].rotateAngleZ = -0.57595865F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 126
		bodyModel[69].setRotationPoint(-98.4F, -48.8F, -2.5F);
		bodyModel[69].rotateAngleZ = -0.57595865F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 127
		bodyModel[70].setRotationPoint(-98.4F, -48.8F, 1.5F);
		bodyModel[70].rotateAngleZ = -0.57595865F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[71].setRotationPoint(-105F, -43F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[72].setRotationPoint(-96.5F, -39.8F, 0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[73].setRotationPoint(-104F, -39.8F, -10.4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[74].setRotationPoint(-104F, -39.8F, 7.4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[75].setRotationPoint(-94.95F, -39.8F, -10.4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[76].setRotationPoint(-94.95F, -39.8F, 7.4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 134
		bodyModel[77].setRotationPoint(-90.5F, -34.8F, -10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -2.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 135
		bodyModel[78].setRotationPoint(-92.5F, -34.8F, -10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 136
		bodyModel[79].setRotationPoint(-87.5F, -34.8F, -10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[80].setRotationPoint(-105F, -40.8F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[81].setRotationPoint(-105F, -32.8F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 146
		bodyModel[82].setRotationPoint(-95.5F, -46.8F, -1.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 4, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[83].setRotationPoint(-69F, -46F, -7.5F);
		bodyModel[83].rotateAngleZ = -0.08726646F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[84].setRotationPoint(-69F, -42F, -7.5F);
		bodyModel[84].rotateAngleZ = -0.08726646F;

		bodyModel[85].addBox(0F, 0F, 0F, 18, 5, 1, 0F); // Box 150
		bodyModel[85].setRotationPoint(-88F, -30F, -7.5F);
		bodyModel[85].rotateAngleZ = -0.15707963F;

		bodyModel[86].addBox(0F, 0F, 0F, 18, 5, 1, 0F); // Box 151
		bodyModel[86].setRotationPoint(-88F, -30F, 6.5F);
		bodyModel[86].rotateAngleZ = -0.15707963F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 149
		bodyModel[87].setRotationPoint(-199F, -42F, 5F);

		bodyModel[88].addBox(0F, 0F, 0F, 22, 3, 1, 0F); // Box 152
		bodyModel[88].setRotationPoint(-112F, -17F, -8F);
		bodyModel[88].rotateAngleZ = 0.06981317F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 3
		tailModel[1] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 11
		tailModel[2] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Box 13
		tailModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 15
		tailModel[4] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 17
		tailModel[5] = new ModelRendererTurbo(this, 729, 193, textureX, textureY); // Box 59
		tailModel[6] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 60
		tailModel[7] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 61
		tailModel[8] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 62
		tailModel[9] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 63
		tailModel[10] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 64

		tailModel[0].addShapeBox(0F, 0F, 0F, 84, 6, 23, 0F,0F, 0F, -4F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F); // Box 3
		tailModel[0].setRotationPoint(68F, -45F, -11.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 84, 9, 31, 0F,0F, 2F, -4F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 2F, -4F, 0F, -2F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -1F); // Box 11
		tailModel[1].setRotationPoint(68F, -39F, -15.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 84, 7, 29, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 13
		tailModel[2].setRotationPoint(68F, -32F, -14.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 84, 7, 29, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F); // Box 15
		tailModel[3].setRotationPoint(68F, -25F, -14.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 84, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, 0F, -5F); // Box 17
		tailModel[4].setRotationPoint(68F, -18F, -10.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 84, 7, 15, 0F,0F, 0F, -2F, 0F, -6F, -5F, 0F, -6F, -5F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -2F, 0F); // Box 59
		tailModel[5].setRotationPoint(68F, -50F, -7.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 84, 8, 11, 0F,0F, 0F, -2F, 0F, -6F, -5F, 0F, -6F, -5F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -5F, 0F); // Box 60
		tailModel[6].setRotationPoint(68F, -53F, -5.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[7].setRotationPoint(152F, -47F, -1.5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 62
		tailModel[8].setRotationPoint(152F, -46F, -1.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 63
		tailModel[9].setRotationPoint(152F, -44F, -1.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 139, 42, 2, 0F,-94F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -94F, 0F, 0F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F); // Box 64
		tailModel[10].setRotationPoint(51F, -89F, -1.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 66
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 83
		leftWingModel[2] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 84
		leftWingModel[3] = new ModelRendererTurbo(this, 809, 297, textureX, textureY); // Box 85
		leftWingModel[4] = new ModelRendererTurbo(this, 337, 305, textureX, textureY); // Box 86
		leftWingModel[5] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 87
		leftWingModel[6] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 88
		leftWingModel[7] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 89
		leftWingModel[8] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 90
		leftWingModel[9] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 91
		leftWingModel[10] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 92
		leftWingModel[11] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 93
		leftWingModel[12] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 151

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 127, 5, 78, 0F,-115F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 66
		leftWingModel[0].setRotationPoint(-49F, -30F, -91.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 51, 10, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		leftWingModel[1].setRotationPoint(0F, -27F, -51.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		leftWingModel[2].setRotationPoint(-37F, -17F, -53.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftWingModel[3].setRotationPoint(-37F, -15F, -53.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 86
		leftWingModel[4].setRotationPoint(-37F, -13F, -53.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 87
		leftWingModel[5].setRotationPoint(-48F, -17F, -53.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 88
		leftWingModel[6].setRotationPoint(-48F, -15F, -53.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 89
		leftWingModel[7].setRotationPoint(-48F, -13F, -53.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 90
		leftWingModel[8].setRotationPoint(51F, -19F, -50.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 91
		leftWingModel[9].setRotationPoint(51F, -13F, -57.5F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftWingModel[10].setRotationPoint(51F, -13F, -50.5F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftWingModel[11].setRotationPoint(51F, -19F, -57.5F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 46, 10, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftWingModel[12].setRotationPoint(25F, -27F, -68.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 65
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 95
		rightWingModel[2] = new ModelRendererTurbo(this, 553, 305, textureX, textureY); // Box 96
		rightWingModel[3] = new ModelRendererTurbo(this, 769, 305, textureX, textureY); // Box 97
		rightWingModel[4] = new ModelRendererTurbo(this, 337, 313, textureX, textureY); // Box 98
		rightWingModel[5] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 99
		rightWingModel[6] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 100
		rightWingModel[7] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 101
		rightWingModel[8] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 102
		rightWingModel[9] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 103
		rightWingModel[10] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 104
		rightWingModel[11] = new ModelRendererTurbo(this, 961, 137, textureX, textureY); // Box 105
		rightWingModel[12] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 150

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 127, 5, 78, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -115F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -115F, 0F, 0F); // Box 65
		rightWingModel[0].setRotationPoint(-49F, -30F, 13.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 51, 10, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		rightWingModel[1].setRotationPoint(0F, -27F, 50.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		rightWingModel[2].setRotationPoint(-37F, -17F, 48.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		rightWingModel[3].setRotationPoint(-37F, -15F, 48.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 100, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 98
		rightWingModel[4].setRotationPoint(-37F, -13F, 48.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 99
		rightWingModel[5].setRotationPoint(-48F, -17F, 48.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 100
		rightWingModel[6].setRotationPoint(-48F, -15F, 48.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 101
		rightWingModel[7].setRotationPoint(-48F, -13F, 48.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 102
		rightWingModel[8].setRotationPoint(51F, -13F, 44.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightWingModel[9].setRotationPoint(51F, -19F, 44.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 104
		rightWingModel[10].setRotationPoint(51F, -19F, 51.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		rightWingModel[11].setRotationPoint(51F, -13F, 51.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 46, 10, 1, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		rightWingModel[12].setRotationPoint(25F, -27F, 68.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 141
		yawFlapModel[1] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 142
		yawFlapModel[2] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 143
		yawFlapModel[3] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 144
		yawFlapModel[4] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 145

		yawFlapModel[0].addShapeBox(1F, 0F, -7F, 2, 1, 5, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 141
		yawFlapModel[0].setRotationPoint(-98.5F, -26.8F, 0F);

		yawFlapModel[1].addShapeBox(0F, 0F, -7F, 1, 1, 5, 0F,0F, -0.2F, -1.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.4F, 0F, -0.2F, -1.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.4F); // Box 142
		yawFlapModel[1].setRotationPoint(-98.5F, -26.8F, 0F);

		yawFlapModel[2].addShapeBox(1F, 0F, 2F, 2, 1, 5, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 143
		yawFlapModel[2].setRotationPoint(-98.5F, -26.8F, 0F);

		yawFlapModel[3].addShapeBox(0F, 0F, 2F, 1, 1, 5, 0F,0F, -0.2F, -1.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.4F, 0F, -0.2F, -1.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -1.4F); // Box 144
		yawFlapModel[3].setRotationPoint(-98.5F, -26.8F, 0F);

		yawFlapModel[4].addShapeBox(1F, 0F, -4F, 1, 1, 8, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 145
		yawFlapModel[4].setRotationPoint(-99.5F, -26.8F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 737, 217, textureX, textureY); // Box 67
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Box 137
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 138

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 81, 1, 36, 0F,-55F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F); // Box 67
		pitchFlapLeftModel[0].setRotationPoint(102F, -31F, -47.5F);

		pitchFlapLeftModel[1].addShapeBox(-0.5F, -12F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 137
		pitchFlapLeftModel[1].setRotationPoint(-90.5F, -24.8F, 0F);

		pitchFlapLeftModel[2].addShapeBox(-0.5F, -14F, -0.5F, 1, 2, 1, 0F,0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 138
		pitchFlapLeftModel[2].setRotationPoint(-90.5F, -24.8F, 0F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 737, 257, textureX, textureY); // Box 68

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 81, 1, 36, 0F,0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F); // Box 68
		pitchFlapRightModel[0].setRotationPoint(102F, -31F, 11.5F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 118
		bodyWheelModel[1] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Box 119
		bodyWheelModel[2] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Box 120
		bodyWheelModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 121
		bodyWheelModel[4] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 122

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,-5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyWheelModel[0].setRotationPoint(-98F, -6F, -3F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyWheelModel[1].setRotationPoint(-98F, -1F, -3F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 13, 5, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F); // Box 120
		bodyWheelModel[2].setRotationPoint(-98F, 4F, -3F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 3, 11, 3, 0F); // Box 121
		bodyWheelModel[3].setRotationPoint(-100F, -15F, -2F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 122
		bodyWheelModel[4].setRotationPoint(-100F, -4F, -2F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 106
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 107
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 108
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 109
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 110
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 111

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 28, 2, 0F); // Box 106
		leftWingWheelModel[0].setRotationPoint(26F, -27F, -41.5F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 107
		leftWingWheelModel[1].setRotationPoint(26F, -2F, -39.5F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 8, 21, 2, 0F); // Box 108
		leftWingWheelModel[2].setRotationPoint(23F, -27F, -44.5F);

		leftWingWheelModel[3].addBox(0F, 0F, 0F, 18, 6, 5, 0F); // Box 109
		leftWingWheelModel[3].setRotationPoint(18F, -2F, -37.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 110
		leftWingWheelModel[4].setRotationPoint(18F, 4F, -37.5F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingWheelModel[5].setRotationPoint(18F, -8F, -37.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 112
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 113
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 114
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 115
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 116
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 117

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 8, 21, 2, 0F); // Box 112
		rightWingWheelModel[0].setRotationPoint(23F, -27F, 42.5F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 2, 28, 2, 0F); // Box 113
		rightWingWheelModel[1].setRotationPoint(26F, -27F, 39.5F);

		rightWingWheelModel[2].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 114
		rightWingWheelModel[2].setRotationPoint(26F, -2F, 37.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		rightWingWheelModel[3].setRotationPoint(18F, -8F, 32.5F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 18, 6, 5, 0F); // Box 116
		rightWingWheelModel[4].setRotationPoint(18F, -2F, 32.5F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 117
		rightWingWheelModel[5].setRotationPoint(18F, 4F, 32.5F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 1009, 300, textureX, textureY); // Box 147

		hudModel[0].addShapeBox(0F, -2F, -2F, 1, 54, 54, 0F,-0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -50.2F, -0.3F, -0.2F, -50.2F, -0.3F, -50.2F, -0.2F, -0.3F, -50.2F, -0.2F, -0.3F, -50.2F, -50.2F, -0.3F, -50.2F, -50.2F); // Box 147
		hudModel[0].setRotationPoint(-97F, -48.8F, 0F);
	}
}