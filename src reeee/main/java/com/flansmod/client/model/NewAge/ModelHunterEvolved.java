//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.07.2017 - 13:01:34
// Last changed on: 26.07.2017 - 13:01:34

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHunterEvolved extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelHunterEvolved() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[120];
		tailModel = new ModelRendererTurbo[42];
		leftWingModel = new ModelRendererTurbo[11];
		rightWingModel = new ModelRendererTurbo[7];
		bodyWheelModel = new ModelRendererTurbo[13];
		leftWingWheelModel = new ModelRendererTurbo[15];
		rightWingWheelModel = new ModelRendererTurbo[15];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 55
		bodyModel[10] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 56
		bodyModel[11] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 57
		bodyModel[12] = new ModelRendererTurbo(this, 825, 73, textureX, textureY); // Box 58
		bodyModel[13] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 59
		bodyModel[14] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 62
		bodyModel[15] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 63
		bodyModel[16] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 64
		bodyModel[17] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 65
		bodyModel[18] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 66
		bodyModel[19] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 69
		bodyModel[22] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 70
		bodyModel[23] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 71
		bodyModel[24] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 72
		bodyModel[25] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 73
		bodyModel[26] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 74
		bodyModel[27] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 75
		bodyModel[28] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 76
		bodyModel[29] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 77
		bodyModel[30] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 78
		bodyModel[31] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 79
		bodyModel[32] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 80
		bodyModel[33] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 81
		bodyModel[34] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 82
		bodyModel[35] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 64
		bodyModel[36] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 65
		bodyModel[37] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 67
		bodyModel[39] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 68
		bodyModel[40] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 69
		bodyModel[41] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 70
		bodyModel[42] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 71
		bodyModel[43] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 72
		bodyModel[44] = new ModelRendererTurbo(this, 841, 105, textureX, textureY); // Box 74
		bodyModel[45] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 75
		bodyModel[46] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 76
		bodyModel[47] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 77
		bodyModel[48] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 78
		bodyModel[49] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 79
		bodyModel[50] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 80
		bodyModel[51] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 81
		bodyModel[52] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 82
		bodyModel[53] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 83
		bodyModel[54] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 84
		bodyModel[55] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 85
		bodyModel[56] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 86
		bodyModel[57] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 87
		bodyModel[58] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 88
		bodyModel[59] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 89
		bodyModel[60] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 92
		bodyModel[61] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 93
		bodyModel[62] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 94
		bodyModel[63] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 95
		bodyModel[64] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 96
		bodyModel[65] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 97
		bodyModel[66] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 98
		bodyModel[67] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 99
		bodyModel[68] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 100
		bodyModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 122
		bodyModel[70] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 123
		bodyModel[71] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 124
		bodyModel[72] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 125
		bodyModel[73] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 126
		bodyModel[74] = new ModelRendererTurbo(this, 809, 209, textureX, textureY); // Box 127
		bodyModel[75] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 131
		bodyModel[76] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 132
		bodyModel[77] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 133
		bodyModel[78] = new ModelRendererTurbo(this, 689, 9, textureX, textureY); // Box 134
		bodyModel[79] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 145
		bodyModel[80] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 146
		bodyModel[81] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 147
		bodyModel[82] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 148
		bodyModel[83] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 149
		bodyModel[84] = new ModelRendererTurbo(this, 697, 105, textureX, textureY); // Box 150
		bodyModel[85] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 151
		bodyModel[86] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 152
		bodyModel[87] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 153
		bodyModel[88] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 154
		bodyModel[89] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 155
		bodyModel[90] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 154
		bodyModel[91] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 155
		bodyModel[92] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 156
		bodyModel[93] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 157
		bodyModel[94] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 158
		bodyModel[95] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 159
		bodyModel[96] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 160
		bodyModel[97] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 161
		bodyModel[98] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 162
		bodyModel[99] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 163
		bodyModel[100] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 165
		bodyModel[101] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 166
		bodyModel[102] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 168
		bodyModel[103] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 169
		bodyModel[104] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 180
		bodyModel[105] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 186
		bodyModel[106] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 227
		bodyModel[107] = new ModelRendererTurbo(this, 817, 73, textureX, textureY); // Box 256
		bodyModel[108] = new ModelRendererTurbo(this, 857, 169, textureX, textureY); // Box 257
		bodyModel[109] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 258
		bodyModel[110] = new ModelRendererTurbo(this, 737, 97, textureX, textureY); // Box 259
		bodyModel[111] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 260
		bodyModel[112] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 261
		bodyModel[113] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 262
		bodyModel[114] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 263
		bodyModel[115] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 264
		bodyModel[116] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 265
		bodyModel[117] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 266
		bodyModel[118] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 267
		bodyModel[119] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 268

		bodyModel[0].addShapeBox(0F, 0F, 0F, 100, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 1
		bodyModel[0].setRotationPoint(-9F, -26F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 100, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 2
		bodyModel[1].setRotationPoint(-9F, -30F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 100, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 3
		bodyModel[2].setRotationPoint(-9F, -33F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 100, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 4
		bodyModel[3].setRotationPoint(-9F, -35F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 100, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-9F, -22F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 100, 4, 22, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-9F, -19F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 100, 4, 16, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-9F, -15F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 100, 2, 10, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(-9F, -11F, -5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 100, 1, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(-9F, -9F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 32, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[9].setRotationPoint(-41F, -22F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 32, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[10].setRotationPoint(-41F, -26F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 32, 4, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[11].setRotationPoint(-41F, -30F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 32, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[12].setRotationPoint(-41F, -19F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 32, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 59
		bodyModel[13].setRotationPoint(-41F, -15F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 32, 2, 8, 0F,0F, 0F, 3F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 62
		bodyModel[14].setRotationPoint(-41F, -12F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, 0F, 2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 63
		bodyModel[15].setRotationPoint(-41F, -10F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 32, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 64
		bodyModel[16].setRotationPoint(-41F, -22F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 32, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 65
		bodyModel[17].setRotationPoint(-41F, -26F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 32, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 66
		bodyModel[18].setRotationPoint(-41F, -30F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 32, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 67
		bodyModel[19].setRotationPoint(-41F, -19F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 32, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 68
		bodyModel[20].setRotationPoint(-41F, -15F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 69
		bodyModel[21].setRotationPoint(-57F, -15F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 70
		bodyModel[22].setRotationPoint(-57F, -19F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 71
		bodyModel[23].setRotationPoint(-57F, -22F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72
		bodyModel[24].setRotationPoint(-57F, -26F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 4, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 73
		bodyModel[25].setRotationPoint(-57F, -30F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 16, 3, 7, 0F,0F, 1F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 74
		bodyModel[26].setRotationPoint(-57F, -15F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 75
		bodyModel[27].setRotationPoint(-57F, -19F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 16, 3, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[28].setRotationPoint(-57F, -22F, -11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[29].setRotationPoint(-57F, -26F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 4, 8, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[30].setRotationPoint(-57F, -30F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F,0F, 0F, 3F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 79
		bodyModel[31].setRotationPoint(-57F, -13F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 2F, 0F, -0.25F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, -0.5F); // Box 80
		bodyModel[32].setRotationPoint(-57F, -11F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 16, 2, 14, 0F,0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 81
		bodyModel[33].setRotationPoint(-57F, -31F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, -3F, 0F, 1F, -2F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 82
		bodyModel[34].setRotationPoint(-57F, -32F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[35].setRotationPoint(-83F, -22F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[36].setRotationPoint(-73F, -26F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 66
		bodyModel[37].setRotationPoint(-73F, -29F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 67
		bodyModel[38].setRotationPoint(-73F, -31F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 16, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 68
		bodyModel[39].setRotationPoint(-73F, -22F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 4, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 69
		bodyModel[40].setRotationPoint(-73F, -26F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F); // Box 70
		bodyModel[41].setRotationPoint(-73F, -29F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 71
		bodyModel[42].setRotationPoint(-73F, -31F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
		bodyModel[43].setRotationPoint(-73F, -22F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, -2F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[44].setRotationPoint(-83F, -25F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 75
		bodyModel[45].setRotationPoint(-83F, -22F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 76
		bodyModel[46].setRotationPoint(-83F, -25F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 77
		bodyModel[47].setRotationPoint(-83F, -20F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -6F); // Box 78
		bodyModel[48].setRotationPoint(-83F, -20F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 3, 10, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[49].setRotationPoint(-73F, -19F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 80
		bodyModel[50].setRotationPoint(-73F, -16F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 81
		bodyModel[51].setRotationPoint(-73F, -13F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 16, 3, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -5F); // Box 82
		bodyModel[52].setRotationPoint(-73F, -16F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F); // Box 83
		bodyModel[53].setRotationPoint(-73F, -13F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 16, 3, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F); // Box 84
		bodyModel[54].setRotationPoint(-73F, -19F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -4F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 85
		bodyModel[55].setRotationPoint(-83F, -27F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -4F); // Box 86
		bodyModel[56].setRotationPoint(-83F, -27F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, -4F); // Box 87
		bodyModel[57].setRotationPoint(-83F, -29F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, -4F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 88
		bodyModel[58].setRotationPoint(-83F, -27F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, -6F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 3F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 89
		bodyModel[59].setRotationPoint(-83F, -29F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 3F, -4F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -6F, -4F); // Box 92
		bodyModel[60].setRotationPoint(-83F, -16F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -4F); // Box 93
		bodyModel[61].setRotationPoint(-83F, -18F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 3F, -4F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -6F, -4F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -6F, 0F); // Box 94
		bodyModel[62].setRotationPoint(-83F, -16F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 1F, -4F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 95
		bodyModel[63].setRotationPoint(-83F, -18F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, -1F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F); // Box 96
		bodyModel[64].setRotationPoint(-73F, -30F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, -2F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, 2.75F, -3.5F, 0F, 2.75F, -3.5F, 0F, -1F, -4F); // Box 97
		bodyModel[65].setRotationPoint(-73F, -14F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 98
		bodyModel[66].setRotationPoint(-84F, -22F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F); // Box 99
		bodyModel[67].setRotationPoint(-84F, -23F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, -1.5F); // Box 100
		bodyModel[68].setRotationPoint(-84F, -20F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 122
		bodyModel[69].setRotationPoint(-16F, -33F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 123
		bodyModel[70].setRotationPoint(-10F, -37F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 30, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[71].setRotationPoint(-9F, -35F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 30, 2, 10, 0F,0F, 0F, -2F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 125
		bodyModel[72].setRotationPoint(-9F, -37F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 30, 1, 6, 0F,0F, 0F, -2F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F); // Box 126
		bodyModel[73].setRotationPoint(-9F, -38F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 86, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[74].setRotationPoint(21F, -37F, -0.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[75].setRotationPoint(-10F, -38F, 1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[76].setRotationPoint(-10F, -38F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 133
		bodyModel[77].setRotationPoint(-10F, -35F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 134
		bodyModel[78].setRotationPoint(-16F, -34F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[79].setRotationPoint(-10F, -33F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[80].setRotationPoint(-10F, -37F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[81].setRotationPoint(-10F, -38F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 148
		bodyModel[82].setRotationPoint(-10F, -35F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 149
		bodyModel[83].setRotationPoint(-10F, -34F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, -3F, -3.3F, 0F, 0F, -1F, 0F, -3F, 0.8F, 0F, -3F, 0.3F, 0F, 2F, -3.3F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0.3F); // Box 150
		bodyModel[84].setRotationPoint(-31F, -33F, 5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -3F, -0.2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[85].setRotationPoint(-16F, -33F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1F); // Box 152
		bodyModel[86].setRotationPoint(-16F, -34F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, -3F, 0.3F, 0F, -3F, 0.8F, 0F, 0F, -1F, 0F, -3F, -3.3F, 0F, 2F, 0.3F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 2F, -3.3F); // Box 153
		bodyModel[87].setRotationPoint(-31F, -33F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 154
		bodyModel[88].setRotationPoint(-10F, -34F, 5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Box 155
		bodyModel[89].setRotationPoint(-10F, -33F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[90].setRotationPoint(-39F, -41F, 1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 155
		bodyModel[91].setRotationPoint(-39F, -41F, 2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 156
		bodyModel[92].setRotationPoint(-39F, -40F, 4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 1F); // Box 157
		bodyModel[93].setRotationPoint(-39F, -38F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 1F, -2F, 0F, 1F); // Box 158
		bodyModel[94].setRotationPoint(-38F, -35F, 6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[95].setRotationPoint(-39F, -41F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[96].setRotationPoint(-39F, -41F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[97].setRotationPoint(-39F, -40F, -5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, -1F); // Box 162
		bodyModel[98].setRotationPoint(-39F, -38F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -1F, -2F, 0F, -1F); // Box 163
		bodyModel[99].setRotationPoint(-38F, -35F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 165
		bodyModel[100].setRotationPoint(-45F, -36F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 5F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 2F, 5F, 0F, 2F); // Box 166
		bodyModel[101].setRotationPoint(-40F, -40F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 168
		bodyModel[102].setRotationPoint(-45F, -36F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 5F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, -2F, 5F, 0F, -2F); // Box 169
		bodyModel[103].setRotationPoint(-40F, -40F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[104].setRotationPoint(-41F, -32F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[105].setRotationPoint(-41F, -32F, 7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[106].setRotationPoint(-48F, 4F, -1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[107].setRotationPoint(-39F, -41F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 34, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[108].setRotationPoint(-41F, -17F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 34, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[109].setRotationPoint(-22F, -29F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[110].setRotationPoint(-39F, -27F, -0.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 260
		bodyModel[111].setRotationPoint(-24F, -33F, -4.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 261
		bodyModel[112].setRotationPoint(-25F, -33F, -4.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 262
		bodyModel[113].setRotationPoint(-25F, -33F, 3.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[114].setRotationPoint(-25F, -39F, -2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 264
		bodyModel[115].setRotationPoint(-26F, -39F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[116].setRotationPoint(-29F, -20F, -4.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[117].setRotationPoint(-34F, -22F, -4.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 34, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 267
		bodyModel[118].setRotationPoint(-39F, -26F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 34, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 268
		bodyModel[119].setRotationPoint(-39F, -26F, 5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 16
		tailModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 21
		tailModel[2] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 22
		tailModel[3] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 23
		tailModel[4] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 24
		tailModel[5] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 25
		tailModel[6] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 26
		tailModel[7] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 27
		tailModel[8] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 28
		tailModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 29
		tailModel[10] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 30
		tailModel[11] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 31
		tailModel[12] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 32
		tailModel[13] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 34
		tailModel[14] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 35
		tailModel[15] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 36
		tailModel[16] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 37
		tailModel[17] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 39
		tailModel[18] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 41
		tailModel[19] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 42
		tailModel[20] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 43
		tailModel[21] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 44
		tailModel[22] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 45
		tailModel[23] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 47
		tailModel[24] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 48
		tailModel[25] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 49
		tailModel[26] = new ModelRendererTurbo(this, 633, 57, textureX, textureY); // Box 50
		tailModel[27] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 51
		tailModel[28] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 54
		tailModel[29] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 128
		tailModel[30] = new ModelRendererTurbo(this, 857, 153, textureX, textureY); // Box 129
		tailModel[31] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 130
		tailModel[32] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 135
		tailModel[33] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 136
		tailModel[34] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 137
		tailModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 138
		tailModel[36] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 139
		tailModel[37] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 140
		tailModel[38] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 141
		tailModel[39] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 142
		tailModel[40] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 143
		tailModel[41] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 144

		tailModel[0].addShapeBox(0F, 0F, 0F, 78, 3, 24, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 16
		tailModel[0].setRotationPoint(91F, -22F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 78, 4, 22, 0F,0F, 0F, 1F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 21
		tailModel[1].setRotationPoint(91F, -19F, -11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 78, 4, 16, 0F,0F, 0F, 3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 22
		tailModel[2].setRotationPoint(91F, -15F, -8F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 78, 2, 10, 0F,0F, 0F, 3F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 23
		tailModel[3].setRotationPoint(91F, -11F, -5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 78, 1, 4, 0F,0F, 0F, 3F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -5.5F, -1F, 0F, -5.5F, -1F, 0F, 0F, 0F); // Box 24
		tailModel[4].setRotationPoint(91F, -9F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 78, 4, 22, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 1F); // Box 25
		tailModel[5].setRotationPoint(91F, -26F, -11F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 78, 4, 18, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 2F); // Box 26
		tailModel[6].setRotationPoint(91F, -30F, -9F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 78, 3, 12, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 3F); // Box 27
		tailModel[7].setRotationPoint(91F, -33F, -6F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 78, 2, 4, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 4F); // Box 28
		tailModel[8].setRotationPoint(91F, -35F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 0F); // Box 29
		tailModel[9].setRotationPoint(169F, -24F, -9F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 30
		tailModel[10].setRotationPoint(169F, -27F, -8F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, -1F); // Box 31
		tailModel[11].setRotationPoint(169F, -29F, -7F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 2F, -1F, 0F, 3F, 0F, 0F, 0F, -3F); // Box 32
		tailModel[12].setRotationPoint(169F, -31F, -4F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 34
		tailModel[13].setRotationPoint(169F, -24F, 8F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 1F); // Box 35
		tailModel[14].setRotationPoint(169F, -27F, 7F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, 3F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, 1F); // Box 36
		tailModel[15].setRotationPoint(169F, -29F, 6F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 3F, 0F, 0F, 2F, -1F, 0F, 0F, 3F); // Box 37
		tailModel[16].setRotationPoint(169F, -31F, 3F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 1F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 39
		tailModel[17].setRotationPoint(169F, -21F, -8F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 1F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, -4F, 0F, -4F, 3F, 0F, 0F, 1F); // Box 41
		tailModel[18].setRotationPoint(169F, -18F, -7F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 3F, 0F, 3F, 0F, 0F, 4F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -5F, 1F, 0F, 0F, 0F); // Box 42
		tailModel[19].setRotationPoint(169F, -16F, -3F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, -1F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 43
		tailModel[20].setRotationPoint(169F, -21F, 7F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, -1F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 3F, 0F, -3F, -4F, 0F, 0F, -1F); // Box 44
		tailModel[21].setRotationPoint(169F, -18F, 6F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, -3F, 0F, 4F, -1F, 0F, 3F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 45
		tailModel[22].setRotationPoint(169F, -16F, 2F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 47
		tailModel[23].setRotationPoint(169F, -32F, 1F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -1F, 1F, 0F, -4F, -2F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, 1F, 0F, 0F, 0F); // Box 48
		tailModel[24].setRotationPoint(169F, -32F, -3F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F); // Box 49
		tailModel[25].setRotationPoint(169F, -32F, -1F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -0.5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0.5F, 0F); // Box 50
		tailModel[26].setRotationPoint(169F, -15F, -1F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -1F, 0F, 0F, 4F, -2F, 0F, 4F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 1F, 0F, 0.5F, 0F); // Box 51
		tailModel[27].setRotationPoint(169F, -15F, -3F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -0.5F, 0F, 0F, 4F, 1F, 0F, 4F, -2F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -4F, 1F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 54
		tailModel[28].setRotationPoint(169F, -15F, 1F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 59, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 128
		tailModel[29].setRotationPoint(107F, -37F, -0.5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 65, 14, 1, 0F,-37F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -37F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 129
		tailModel[30].setRotationPoint(107F, -51F, -0.5F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 28, 20, 1, 0F,-26F, -2F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -26F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		tailModel[31].setRotationPoint(144F, -71F, -0.5F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 6F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 6F, 0F, 0F); // Box 135
		tailModel[32].setRotationPoint(172F, -51F, -0.5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 136
		tailModel[33].setRotationPoint(166F, -37F, -0.5F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 0F, -0.5F, 0F); // Box 137
		tailModel[34].setRotationPoint(166F, -34F, -0.5F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 5, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, -0.5F, -7F, 0F, -0.5F, 8F, 0F, 0F); // Box 138
		tailModel[35].setRotationPoint(180F, -71F, -0.5F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 20, 2, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 21F, -1F, 0F, -31F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 21F, -1F, 0F, -31F, -1F, 0F); // Box 139
		tailModel[36].setRotationPoint(145F, -42F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 34, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 31F, -1F, 0F, -33F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 31F, -1F, 0F, -33F, -1F, 0F); // Box 140
		tailModel[37].setRotationPoint(140F, -42F, 0F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 11, 2, 34, 0F,0F, 0F, 0F, 0F, -1F, -1F, 15F, -1F, 0F, -21F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 15F, -1F, 0F, -21F, -1F, 0F); // Box 141
		tailModel[38].setRotationPoint(165F, -42F, 0F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 20, 2, 34, 0F,-31F, -1F, 0F, 21F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, -1F, 0F, 21F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		tailModel[39].setRotationPoint(145F, -42F, -34F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 34, 0F,-33F, -1F, 0F, 31F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -33F, -1F, 0F, 31F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 143
		tailModel[40].setRotationPoint(140F, -42F, -34F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 11, 2, 34, 0F,-21F, -1F, 0F, 15F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, -21F, -1F, 0F, 15F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 144
		tailModel[41].setRotationPoint(165F, -42F, -34F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 111
		leftWingModel[1] = new ModelRendererTurbo(this, 553, 129, textureX, textureY); // Box 112
		leftWingModel[2] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 113
		leftWingModel[3] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 114
		leftWingModel[4] = new ModelRendererTurbo(this, 665, 209, textureX, textureY); // Box 115
		leftWingModel[5] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 116
		leftWingModel[6] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 117
		leftWingModel[7] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Box 118
		leftWingModel[8] = new ModelRendererTurbo(this, 665, 137, textureX, textureY); // Box 119
		leftWingModel[9] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 120
		leftWingModel[10] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 121

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 27, 5, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 111
		leftWingModel[0].setRotationPoint(38F, -24F, -18F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 20, 3, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 12F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 12F, -2F, 0F, 0F, 1F, 0F); // Box 112
		leftWingModel[1].setRotationPoint(65F, -23F, -18F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 32, 5, 82, 0F,-48F, -5F, 0F, 33F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, 33F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 113
		leftWingModel[2].setRotationPoint(38F, -24F, -100F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 15, 3, 82, 0F,-33F, -4F, 0F, 36F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -33F, 1F, 0F, 36F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 114
		leftWingModel[3].setRotationPoint(70F, -23F, -100F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 30, 5, 76, 0F,-68F, -5F, 0F, 48F, -5F, 0F, 0F, 0F, 6F, 0F, -2.5F, 0F, -68F, 0F, 0F, 48F, 0F, 0F, 0F, 0F, 6F, 0F, -2.5F, 0F); // Box 115
		leftWingModel[4].setRotationPoint(8F, -24F, -100F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 38, 1, 7, 0F,-8F, -2.5F, 6F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 1F, -8F, 1.5F, 6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 1F); // Box 116
		leftWingModel[5].setRotationPoint(0F, -24F, -18F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,-8F, -6F, 0F, 8F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 6F, 0F, 8F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftWingModel[6].setRotationPoint(-1F, -28F, -24F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,-8F, 5F, 0F, 8F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, 8F, -6.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 118
		leftWingModel[7].setRotationPoint(-1F, -17F, -24F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 38, 1, 7, 0F,-8F, 0.5F, 6F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 1F, -8F, -1.5F, 6F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 4F, 1F); // Box 119
		leftWingModel[8].setRotationPoint(0F, -21F, -18F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, -6.5F, 0F, -8F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 4.5F, 0F, -8F, 6F, 0F); // Box 120
		leftWingModel[9].setRotationPoint(-1F, -28F, 10F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 4.5F, 0F, -8F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 8F, -6.5F, 0F, -8F, -5F, 0F); // Box 121
		leftWingModel[10].setRotationPoint(-1F, -17F, 10F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 101
		rightWingModel[1] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Box 102
		rightWingModel[2] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 103
		rightWingModel[3] = new ModelRendererTurbo(this, 737, 121, textureX, textureY); // Box 104
		rightWingModel[4] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 105
		rightWingModel[5] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Box 107
		rightWingModel[6] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 108

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 27, 5, 7, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 101
		rightWingModel[0].setRotationPoint(38F, -24F, 11F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 20, 3, 7, 0F,0F, 1F, 0F, 12F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 12F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 102
		rightWingModel[1].setRotationPoint(65F, -23F, 11F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 32, 5, 82, 0F,0F, 0F, 0F, 0F, -1F, 0F, 33F, -5F, 0F, -48F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 33F, 0F, 0F, -48F, 0F, 0F); // Box 103
		rightWingModel[2].setRotationPoint(38F, -24F, 18F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 15, 3, 82, 0F,0F, 0F, 0F, 0F, -1F, 0F, 36F, -4F, 0F, -33F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 36F, 1F, 0F, -33F, 1F, 0F); // Box 104
		rightWingModel[3].setRotationPoint(70F, -23F, 18F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 30, 5, 76, 0F,0F, -2.5F, 0F, 0F, 0F, 6F, 48F, -5F, 0F, -68F, -5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 6F, 48F, 0F, 0F, -68F, 0F, 0F); // Box 105
		rightWingModel[4].setRotationPoint(8F, -24F, 24F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 38, 1, 7, 0F,0F, 4F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, -8F, -2.5F, 6F, 0F, -4F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, -8F, 1.5F, 6F); // Box 107
		rightWingModel[5].setRotationPoint(0F, -24F, 11F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 38, 1, 7, 0F,0F, -4F, 1F, 0F, -3F, 0F, 0F, -1F, 0F, -8F, 0.5F, 6F, 0F, 4F, 1F, 0F, 3F, 0F, 0F, 1F, 0F, -8F, -1.5F, 6F); // Box 108
		rightWingModel[6].setRotationPoint(0F, -21F, 11F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 217
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 218
		bodyWheelModel[2] = new ModelRendererTurbo(this, 857, 121, textureX, textureY); // Box 219
		bodyWheelModel[3] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 220
		bodyWheelModel[4] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 221
		bodyWheelModel[5] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 222
		bodyWheelModel[6] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 223
		bodyWheelModel[7] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 224
		bodyWheelModel[8] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 225
		bodyWheelModel[9] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 226
		bodyWheelModel[10] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 228
		bodyWheelModel[11] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 229
		bodyWheelModel[12] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 230

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyWheelModel[0].setRotationPoint(-75F, -16F, -2F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 218
		bodyWheelModel[1].setRotationPoint(-75F, -11F, -2F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 219
		bodyWheelModel[2].setRotationPoint(-48F, -11F, -2F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyWheelModel[3].setRotationPoint(-50F, -11F, -0.5F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyWheelModel[4].setRotationPoint(-50.5F, -8F, -1F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 222
		bodyWheelModel[5].setRotationPoint(-50F, -7F, -0.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyWheelModel[6].setRotationPoint(-52F, -2F, -0.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 224
		bodyWheelModel[7].setRotationPoint(-53F, 0F, -2.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, 4.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 4.5F, 0F, 3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -3.5F, 0F); // Box 225
		bodyWheelModel[8].setRotationPoint(-48.5F, 4.5F, -2.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, 4.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 4.5F, 0F, 3.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -3.5F, 0F); // Box 226
		bodyWheelModel[9].setRotationPoint(-48.5F, 4.5F, 1.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyWheelModel[10].setRotationPoint(-51.5F, 3F, -1F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,-2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyWheelModel[11].setRotationPoint(-51.5F, 1F, -1F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F); // Box 230
		bodyWheelModel[12].setRotationPoint(-51.5F, 6F, -1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 793, 137, textureX, textureY); // Box 231
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 232
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 233
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 234
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 233
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 617, 137, textureX, textureY); // Box 245
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 246
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 247
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 248
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 249
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 250
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 251
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 252
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 253
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 255

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 231
		leftWingWheelModel[0].setRotationPoint(64F, -20F, -44F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 232
		leftWingWheelModel[1].setRotationPoint(56F, -8F, -44F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 233
		leftWingWheelModel[2].setRotationPoint(52F, -5F, -44F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 234
		leftWingWheelModel[3].setRotationPoint(52F, 1F, -44F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		leftWingWheelModel[4].setRotationPoint(50F, 0F, -44F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 245
		leftWingWheelModel[5].setRotationPoint(64F, -20F, -42F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 246
		leftWingWheelModel[6].setRotationPoint(62F, -9F, -41.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, 0F, -1F); // Box 247
		leftWingWheelModel[7].setRotationPoint(61F, -5F, -41.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 248
		leftWingWheelModel[8].setRotationPoint(59F, -2F, -42.5F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftWingWheelModel[9].setRotationPoint(52F, 0F, -40.5F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftWingWheelModel[10].setRotationPoint(52F, -3F, -40.5F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,-2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftWingWheelModel[11].setRotationPoint(54F, -4F, -40.5F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 252
		leftWingWheelModel[12].setRotationPoint(52F, 4F, -40.5F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F); // Box 253
		leftWingWheelModel[13].setRotationPoint(54F, 7F, -40.5F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		leftWingWheelModel[14].setRotationPoint(58F, 2F, -41.5F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 235
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 236
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 237
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 234
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 235
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 236
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 237
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 238
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 239
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 240
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 241
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 242
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 243
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 244
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 254

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 235
		rightWingWheelModel[0].setRotationPoint(64F, -20F, 43F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 236
		rightWingWheelModel[1].setRotationPoint(56F, -8F, 43F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 237
		rightWingWheelModel[2].setRotationPoint(52F, -5F, 43F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 234
		rightWingWheelModel[3].setRotationPoint(52F, 1F, 43F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightWingWheelModel[4].setRotationPoint(50F, 0F, 43F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 236
		rightWingWheelModel[5].setRotationPoint(64F, -20F, 40F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 237
		rightWingWheelModel[6].setRotationPoint(62F, -9F, 40.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 2F, 0F, 1F); // Box 238
		rightWingWheelModel[7].setRotationPoint(61F, -5F, 40.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 239
		rightWingWheelModel[8].setRotationPoint(59F, -2F, 41.5F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightWingWheelModel[9].setRotationPoint(52F, 0F, 36.5F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightWingWheelModel[10].setRotationPoint(52F, -3F, 36.5F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,-2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightWingWheelModel[11].setRotationPoint(54F, -4F, 36.5F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 243
		rightWingWheelModel[12].setRotationPoint(52F, 4F, 36.5F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F); // Box 244
		rightWingWheelModel[13].setRotationPoint(54F, 7F, 36.5F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightWingWheelModel[14].setRotationPoint(58F, 2F, 40.5F);
	}
}