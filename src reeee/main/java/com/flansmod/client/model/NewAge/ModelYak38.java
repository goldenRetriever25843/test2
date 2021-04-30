//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Yak38
// Model Creator: 
// Created on: 08.08.2017 - 15:26:38
// Last changed on: 08.08.2017 - 15:26:38

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYak38 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelYak38() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[115];
		tailModel = new ModelRendererTurbo[9];
		leftWingModel = new ModelRendererTurbo[10];
		rightWingModel = new ModelRendererTurbo[10];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[15];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 81
		bodyModel[77] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 82
		bodyModel[78] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 85
		bodyModel[79] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 86
		bodyModel[80] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 87
		bodyModel[81] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 88
		bodyModel[82] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 89
		bodyModel[83] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 91
		bodyModel[85] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 92
		bodyModel[86] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 93
		bodyModel[87] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 94
		bodyModel[88] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 100
		bodyModel[89] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 116
		bodyModel[94] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 117
		bodyModel[95] = new ModelRendererTurbo(this, 121, 261, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 119
		bodyModel[97] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 120
		bodyModel[98] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 121
		bodyModel[99] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 122
		bodyModel[100] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 123
		bodyModel[101] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 124
		bodyModel[102] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 125
		bodyModel[103] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 126
		bodyModel[104] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 127
		bodyModel[105] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 129
		bodyModel[107] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 130
		bodyModel[108] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 131
		bodyModel[109] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 132
		bodyModel[110] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 133
		bodyModel[111] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 134
		bodyModel[112] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 147
		bodyModel[113] = new ModelRendererTurbo(this, 121, 261, textureX, textureY); // Box 148
		bodyModel[114] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 149

		bodyModel[0].addShapeBox(0F, 0F, 0F, 14, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6F, -27F, 6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 7, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-32F, -27F, 6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 26, 7, 8, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F); // Box 2
		bodyModel[2].setRotationPoint(-32F, -11F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 3
		bodyModel[3].setRotationPoint(-6F, -11F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 40, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-32F, -20F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 26, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-32F, -11F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 26, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 2F); // Box 6
		bodyModel[6].setRotationPoint(-32F, -11F, -14F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-6F, -11F, -14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-6F, -11F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 7, 8, 0F,0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-6F, -27F, -14F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 26, 7, 8, 0F,0F, -3F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-32F, -27F, -14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 40, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-32F, -20F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 14, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-6F, -27F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 26, 16, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-32F, -27F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 26, 3, 12, 0F,0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-32F, -29F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 30, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-62F, -14F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F,0F, -1F, -3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-62F, -20F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 30, 4, 12, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -2F); // Box 18
		bodyModel[17].setRotationPoint(-62F, -10F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 30, 1, 8, 0F,0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -3F); // Box 19
		bodyModel[18].setRotationPoint(-62F, -7F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F); // Box 20
		bodyModel[19].setRotationPoint(-67F, -14F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 5, 12, 0F,0F, -2F, -4.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -4.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F); // Box 21
		bodyModel[20].setRotationPoint(-67F, -19F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 3, 12, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F); // Box 22
		bodyModel[21].setRotationPoint(-67F, -10F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 23
		bodyModel[22].setRotationPoint(-67F, -7F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 3, 11, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 1.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -1F); // Box 24
		bodyModel[23].setRotationPoint(-77F, -13F, -5.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -3F); // Box 25
		bodyModel[24].setRotationPoint(-77F, -6.5F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F,0F, 0F, 0.5F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F); // Box 26
		bodyModel[25].setRotationPoint(-77F, -8.5F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F,0F, 0F, -3F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 0F, 0.5F); // Box 27
		bodyModel[26].setRotationPoint(-77F, -14F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -3.5F); // Box 28
		bodyModel[27].setRotationPoint(-88F, -7.5F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, -0.5F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 29
		bodyModel[28].setRotationPoint(-88F, -8.5F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, -2.5F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -2.5F, -1F, 0F, 1F, -1F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 1F, -1F); // Box 30
		bodyModel[29].setRotationPoint(-88F, -11F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F,0F, -3F, -2.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -3F, -2.5F, 0F, 2.5F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 2.5F, -1F); // Box 31
		bodyModel[30].setRotationPoint(-88F, -13F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 32
		bodyModel[31].setRotationPoint(-92F, -8.5F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 33
		bodyModel[32].setRotationPoint(-92F, -9.5F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F); // Box 34
		bodyModel[33].setRotationPoint(-92F, -7.5F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 52, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F); // Box 35
		bodyModel[34].setRotationPoint(8F, -11F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 52, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[35].setRotationPoint(8F, -11F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 52, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(8F, -11F, -14F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 52, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(8F, -20F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 52, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(8F, -27F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 52, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(8F, -20F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 52, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(8F, -27F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 52, 7, 8, 0F,0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(8F, -27F, -14F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 13, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(60F, -27F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(73F, -27F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -2F, -5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 45
		bodyModel[44].setRotationPoint(89F, -27F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 7, 8, 0F,0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(60F, -27F, -14F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 16, 7, 8, 0F,0F, -1F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(73F, -27F, -14F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 6, 7, 0F,0F, -1F, -3F, 0F, -2F, -5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(89F, -27F, -13F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[48].setRotationPoint(60F, -27F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(73F, -27F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 6, 12, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 51
		bodyModel[50].setRotationPoint(89F, -27F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 24, 4, 12, 0F,0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1F); // Box 52
		bodyModel[51].setRotationPoint(102F, -26F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 24, 4, 4, 0F,0F, 0F, 1F, 0F, -2F, 5F, 0F, -2F, -8F, 0F, -1F, -2F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 53
		bodyModel[52].setRotationPoint(102F, -26F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 24, 6, 8, 0F,0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 6F); // Box 55
		bodyModel[53].setRotationPoint(102F, -22F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 13, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[54].setRotationPoint(60F, -20F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 9, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 57
		bodyModel[55].setRotationPoint(73F, -20F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, 0F, 1F); // Box 58
		bodyModel[56].setRotationPoint(89F, -21F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 13, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[57].setRotationPoint(60F, -20F, -14F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 16, 9, 8, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[58].setRotationPoint(73F, -20F, -14F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 13, 7, 6, 0F,0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 61
		bodyModel[59].setRotationPoint(89F, -21F, -12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 24, 4, 8, 0F,0F, 0F, 1F, 0F, 4F, -1.5F, 0F, 4F, -1.5F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, -7F, -1.5F, 0F, -7F, -1.5F, 0F, 1F, 1F); // Box 62
		bodyModel[60].setRotationPoint(102F, -16F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 24, 4, 2, 0F,0F, 0F, 1F, 0F, 4F, 3.5F, 0F, 4F, -5F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, -7F, 3.5F, 0F, -7F, -5.5F, 0F, 0F, 0F); // Box 63
		bodyModel[61].setRotationPoint(102F, -16F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 13, 5, 6, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -2F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -3F, -4F, 0F, 0F, -2F); // Box 65
		bodyModel[62].setRotationPoint(89F, -14F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, 0F, 1F, -3.5F, 1F, 1F, 0F, -2F, 1F, 0F, -3F, -3F, -3.5F, 0F, -2F); // Box 66
		bodyModel[63].setRotationPoint(73F, -11F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, -3F, 0F, 0F, -3F); // Box 67
		bodyModel[64].setRotationPoint(60F, -11F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 13, 5, 6, 0F,0F, 0F, 1F, 0F, 2F, -2F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, -2F, 1F, 0F, 1F, 0F); // Box 68
		bodyModel[65].setRotationPoint(89F, -14F, -12F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 13, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[66].setRotationPoint(60F, -20F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 0F, 1F, -3.5F, 0F, -2F, 0F, -3F, -3F, 0F, -2F, 1F, -3.5F, 1F, 1F); // Box 72
		bodyModel[67].setRotationPoint(73F, -11F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 1F, 0F, 0F, 1F, 0F); // Box 73
		bodyModel[68].setRotationPoint(60F, -11F, -14F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 16, 16, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(73F, -20F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 5, 10, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 1F); // Box 75
		bodyModel[70].setRotationPoint(89F, -14F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[71].setRotationPoint(-6F, -29F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 77
		bodyModel[72].setRotationPoint(-30F, -27F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[73].setRotationPoint(8F, -29F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 14, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[74].setRotationPoint(-6F, -29F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(-30F, -27F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[76].setRotationPoint(8F, -29F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 29, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 82
		bodyModel[77].setRotationPoint(34F, -30F, -1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[78].setRotationPoint(63F, -30F, -1.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 40, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[79].setRotationPoint(86F, -33F, -1.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 40, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[80].setRotationPoint(86F, -27F, -1.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 33, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[81].setRotationPoint(96F, -39F, -1.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 26, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[82].setRotationPoint(106F, -45F, -1.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 16, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[83].setRotationPoint(116F, -51F, -1.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[84].setRotationPoint(106F, -51F, -1.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[85].setRotationPoint(96F, -45F, -1.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[86].setRotationPoint(86F, -39F, -1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 13, 8, 2, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[87].setRotationPoint(116F, -59F, -1.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 8, 1, 27, 0F,-7F, 0F, 0F, 0F, 0F, 0F, -8F, 3F, 0F, 19F, 3F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, 19F, -3F, 0F); // Box 100
		bodyModel[88].setRotationPoint(115F, -19F, -30.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 27, 0F,19F, 3F, 0F, -8F, 3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 19F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 102
		bodyModel[89].setRotationPoint(115F, -19F, 3.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 24, 4, 4, 0F,0F, -1F, -2F, 0F, -2F, -8F, 0F, -2F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 5F, 0F, 0F, 1F); // Box 103
		bodyModel[90].setRotationPoint(102F, -26F, -10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 24, 6, 8, 0F,0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 6F); // Box 104
		bodyModel[91].setRotationPoint(102F, -22F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 24, 4, 2, 0F,0F, 0F, 2F, 0F, 4F, -5F, 0F, 4F, 3.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -7F, -5.5F, 0F, -7F, 3.5F, 0F, 1F, 1F); // Box 105
		bodyModel[92].setRotationPoint(102F, -16F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[93].setRotationPoint(60F, -13F, 5F);
		bodyModel[93].rotateAngleY = 0.13962634F;
		bodyModel[93].rotateAngleZ = -0.26179939F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[94].setRotationPoint(60F, -13F, -11F);
		bodyModel[94].rotateAngleY = -0.13962634F;
		bodyModel[94].rotateAngleZ = -0.26179939F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 18, 9, 2, 0F,-18F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -18F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[95].setRotationPoint(-62F, -23F, 4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[96].setRotationPoint(-41F, -19F, -14F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 120
		bodyModel[97].setRotationPoint(-41F, -24F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -3F, 0F, 2F, -3F, 0F, 1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[98].setRotationPoint(-41F, -22F, -14F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, -3F, 0F, 1F, 2F, 0F, -1F, 2F); // Box 122
		bodyModel[99].setRotationPoint(-41F, -12F, -14F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[100].setRotationPoint(-41F, -8F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[101].setRotationPoint(-41F, -19F, 13F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 125
		bodyModel[102].setRotationPoint(-41F, -24F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -1F, 2F, 0F, 1F, 2F, 0F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[103].setRotationPoint(-41F, -22F, 13F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 2F, -3F, 0F, 0F, -3F); // Box 127
		bodyModel[104].setRotationPoint(-41F, -12F, 13F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 128
		bodyModel[105].setRotationPoint(-41F, -8F, 6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[106].setRotationPoint(-44F, -26F, 4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 12, 4, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[107].setRotationPoint(-44F, -26F, -6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,3F, 1.5F, -4F, 0F, 2F, -4F, 0F, 2F, -4F, 3F, 1.5F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[108].setRotationPoint(-44F, -27F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 4, 8, 0F,0F, 0F, -2F, 0F, 2.5F, -2F, 0F, 2.5F, -2F, 0F, 0F, -2F, -2F, 0.75F, 0.75F, 3F, -1F, 2F, 3F, -1F, 2F, -2F, 0.75F, 0.75F); // Box 132
		bodyModel[109].setRotationPoint(-54F, -26F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 7, 5, 8, 0F,1F, -5.5F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, -5.5F, -1F, 1F, 2F, -1F, 2F, -0.25F, 0.75F, 2F, -0.25F, 0.75F, 1F, 2F, -1F); // Box 133
		bodyModel[110].setRotationPoint(-61F, -26F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -4F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F); // Box 134
		bodyModel[111].setRotationPoint(-67F, -21F, -3F);

		bodyModel[112].addFlexTrapezoid(0F, 0F, 0F, 18, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 147
		bodyModel[112].setRotationPoint(-44F, -22F, 4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 18, 9, 2, 0F,-18F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -18F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[113].setRotationPoint(-62F, -23F, -6F);

		bodyModel[114].addFlexTrapezoid(0F, 0F, 0F, 18, 8, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 149
		bodyModel[114].setRotationPoint(-44F, -22F, -6F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 95
		tailModel[1] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 96
		tailModel[2] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 97
		tailModel[3] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 98
		tailModel[4] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 99
		tailModel[5] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 101
		tailModel[6] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 150
		tailModel[7] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 151
		tailModel[8] = new ModelRendererTurbo(this, 153, 241, textureX, textureY); // Box 153

		tailModel[0].addShapeBox(0F, 0F, 0F, 9, 8, 2, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		tailModel[0].setRotationPoint(129F, -59F, -1.5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 6, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 96
		tailModel[1].setRotationPoint(132F, -51F, -1.5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 97
		tailModel[2].setRotationPoint(129F, -39F, -1.5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 98
		tailModel[3].setRotationPoint(126F, -33F, -1.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 12, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, -11F, 3F, 0F, 8F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -3F, 0F, 8F, -3F, 0F); // Box 99
		tailModel[4].setRotationPoint(123F, -19F, -30.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 12, 1, 27, 0F,8F, 3F, 0F, -11F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -3F, 0F, -11F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		tailModel[5].setRotationPoint(123F, -19F, 3.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0.5F, 0F); // Box 150
		tailModel[6].setRotationPoint(126F, -23.5F, -3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F); // Box 151
		tailModel[7].setRotationPoint(126F, -22F, -3F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0.5F, 0F, 0F, 1.5F, -1.5F, 0F, 1.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0.5F, -0.5F); // Box 153
		tailModel[8].setRotationPoint(126F, -20.5F, -3F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 111
		leftWingModel[1] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 112
		leftWingModel[2] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 114
		leftWingModel[3] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 115
		leftWingModel[4] = new ModelRendererTurbo(this, 4, 420, textureX, textureY); // Box 149
		leftWingModel[5] = new ModelRendererTurbo(this, 2, 420, textureX, textureY); // Box 150
		leftWingModel[6] = new ModelRendererTurbo(this, 2, 420, textureX, textureY); // Box 151
		leftWingModel[7] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 152
		leftWingModel[8] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 153
		leftWingModel[9] = new ModelRendererTurbo(this, 4, 420, textureX, textureY); // Box 159

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftWingModel[0].setRotationPoint(26F, -20F, -34F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 18, 4, 20, 0F,-17F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -17F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 112
		leftWingModel[1].setRotationPoint(8F, -20F, -34F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 8, 4, 24, 0F,0F, -4F, 0F, 0F, -4.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 114
		leftWingModel[2].setRotationPoint(52F, -17F, -58F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 27, 2, 24, 0F,-23F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftWingModel[3].setRotationPoint(25F, -17F, -58F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,-4F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -4F, 0F, -9F, 0F, 2F, -9F, 0F, 2F, -9F, 0F, 2F, -9F, 0F, 2F, -9F); // Box 149
		leftWingModel[4].setRotationPoint(26F, -15F, -43F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,2F, 0F, -6.5F, 2F, 0F, -6.5F, 2F, 0F, -6.5F, 2F, 0F, -6.5F, 2F, 2F, -6.5F, 2F, 2F, -6.5F, 2F, 2F, -6.5F, 2F, 2F, -6.5F); // Box 150
		leftWingModel[5].setRotationPoint(28F, -11F, -43F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,-9F, -1.5F, -8.5F, -9F, 0F, -6.5F, -9F, 0F, -6.5F, -9F, -1.5F, -8.5F, -9F, -0.5F, -8.5F, -9F, 2F, -6.5F, -9F, 2F, -6.5F, -9F, -0.5F, -8.5F); // Box 151
		leftWingModel[6].setRotationPoint(9F, -11F, -43F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F); // Box 152
		leftWingModel[7].setRotationPoint(15F, -11F, -34.7F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F); // Box 153
		leftWingModel[8].setRotationPoint(15F, -11F, -33.3F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,-4F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -4F, 0F, -9F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 1F, -9F); // Box 159
		leftWingModel[9].setRotationPoint(15F, -17.5F, -33F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 106
		rightWingModel[1] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 107
		rightWingModel[2] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 109
		rightWingModel[3] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 110
		rightWingModel[4] = new ModelRendererTurbo(this, 4, 420, textureX, textureY); // Box 154
		rightWingModel[5] = new ModelRendererTurbo(this, 2, 420, textureX, textureY); // Box 155
		rightWingModel[6] = new ModelRendererTurbo(this, 2, 420, textureX, textureY); // Box 156
		rightWingModel[7] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 157
		rightWingModel[8] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 158
		rightWingModel[9] = new ModelRendererTurbo(this, 4, 420, textureX, textureY); // Box 160

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 106
		rightWingModel[0].setRotationPoint(26F, -20F, 14F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 18, 4, 20, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -17F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -17F, 1F, 0F); // Box 107
		rightWingModel[1].setRotationPoint(8F, -20F, 14F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 8, 4, 24, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4.25F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F); // Box 109
		rightWingModel[2].setRotationPoint(52F, -17F, 34F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 27, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -23F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -23F, 3F, 0F); // Box 110
		rightWingModel[3].setRotationPoint(25F, -17F, 34F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,-4F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -4F, 0F, -9F, 0F, 2F, -9F, 0F, 2F, -9F, 0F, 2F, -9F, 0F, 2F, -9F); // Box 154
		rightWingModel[4].setRotationPoint(26F, -15F, 23F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,2F, 0F, -6.5F, 2F, 0F, -6.5F, 2F, 0F, -6.5F, 2F, 0F, -6.5F, 2F, 2F, -6.5F, 2F, 2F, -6.5F, 2F, 2F, -6.5F, 2F, 2F, -6.5F); // Box 155
		rightWingModel[5].setRotationPoint(28F, -11F, 23F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,-9F, -1.5F, -8.5F, -9F, 0F, -6.5F, -9F, 0F, -6.5F, -9F, -1.5F, -8.5F, -9F, -0.5F, -8.5F, -9F, 2F, -6.5F, -9F, 2F, -6.5F, -9F, -0.5F, -8.5F); // Box 156
		rightWingModel[6].setRotationPoint(9F, -11F, 23F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F); // Box 157
		rightWingModel[7].setRotationPoint(15F, -11F, 32.7F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, -0.7F); // Box 158
		rightWingModel[8].setRotationPoint(15F, -11F, 31.3F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 26, 4, 20, 0F,-4F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -4F, 0F, -9F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 1F, -9F); // Box 160
		rightWingModel[9].setRotationPoint(15F, -17.5F, 13F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 113

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 8, 4, 20, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 113
		pitchFlapLeftWingModel[0].setRotationPoint(52F, -20F, -34F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 108

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 8, 4, 20, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 108
		pitchFlapRightWingModel[0].setRotationPoint(52F, -20F, 14F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 135
		bodyWheelModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 136
		bodyWheelModel[2] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 137
		bodyWheelModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 138
		bodyWheelModel[4] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 139
		bodyWheelModel[5] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 140
		bodyWheelModel[6] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Box 141
		bodyWheelModel[7] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 142
		bodyWheelModel[8] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 143
		bodyWheelModel[9] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 144
		bodyWheelModel[10] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 145
		bodyWheelModel[11] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 146
		bodyWheelModel[12] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 147
		bodyWheelModel[13] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 148
		bodyWheelModel[14] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 149

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 135
		bodyWheelModel[0].setRotationPoint(37F, -11F, -15F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyWheelModel[1].setRotationPoint(37F, 4F, -22F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 137
		bodyWheelModel[2].setRotationPoint(37F, -11F, 13F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyWheelModel[3].setRotationPoint(37F, 4F, 17F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyWheelModel[4].setRotationPoint(34F, 3F, -24F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyWheelModel[5].setRotationPoint(34F, 1F, -24F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 141
		bodyWheelModel[6].setRotationPoint(34F, 8F, -24F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyWheelModel[7].setRotationPoint(34F, 3F, 22F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyWheelModel[8].setRotationPoint(34F, 1F, 22F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 144
		bodyWheelModel[9].setRotationPoint(34F, 8F, 22F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyWheelModel[10].setRotationPoint(-51F, 4.5F, -1F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyWheelModel[11].setRotationPoint(-51F, 2.5F, -1F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 147
		bodyWheelModel[12].setRotationPoint(-51F, 7.5F, -1F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyWheelModel[13].setRotationPoint(-51F, 0.5F, -2.5F);
		bodyWheelModel[13].rotateAngleZ = -0.9424778F;

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyWheelModel[14].setRotationPoint(-53F, -5.5F, -1.5F);
	}
}