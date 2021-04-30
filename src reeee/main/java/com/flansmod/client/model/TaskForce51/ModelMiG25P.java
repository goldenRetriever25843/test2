//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.08.2016 - 20:22:06
// Last changed on: 23.08.2016 - 20:22:06

package com.flansmod.client.model.TaskForce51; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMiG25P extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMiG25P() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[139];
		noseModel = new ModelRendererTurbo[33];
		tailModel = new ModelRendererTurbo[36];
		leftWingModel = new ModelRendererTurbo[78];
		rightWingModel = new ModelRendererTurbo[78];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[2];
		bodyWheelModel = new ModelRendererTurbo[23];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 873, 257, textureX, textureY); // Box 93
		bodyModel[42] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 94
		bodyModel[43] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Box 135
		bodyModel[44] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Box 136
		bodyModel[45] = new ModelRendererTurbo(this, 393, 305, textureX, textureY); // Box 137
		bodyModel[46] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 138
		bodyModel[47] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 139
		bodyModel[48] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 140
		bodyModel[49] = new ModelRendererTurbo(this, 545, 305, textureX, textureY); // Box 141
		bodyModel[50] = new ModelRendererTurbo(this, 641, 305, textureX, textureY); // Box 142
		bodyModel[51] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 143
		bodyModel[52] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 145
		bodyModel[53] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 148
		bodyModel[54] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 149
		bodyModel[55] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 150
		bodyModel[56] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 151
		bodyModel[57] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 152
		bodyModel[58] = new ModelRendererTurbo(this, 785, 177, textureX, textureY); // Box 153
		bodyModel[59] = new ModelRendererTurbo(this, 633, 193, textureX, textureY); // Box 154
		bodyModel[60] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Box 155
		bodyModel[61] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 156
		bodyModel[62] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 157
		bodyModel[63] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 158
		bodyModel[64] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Box 159
		bodyModel[65] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Box 168
		bodyModel[66] = new ModelRendererTurbo(this, 521, 329, textureX, textureY); // Box 169
		bodyModel[67] = new ModelRendererTurbo(this, 289, 329, textureX, textureY); // Box 170
		bodyModel[68] = new ModelRendererTurbo(this, 705, 329, textureX, textureY); // Box 171
		bodyModel[69] = new ModelRendererTurbo(this, 849, 329, textureX, textureY); // Box 172
		bodyModel[70] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 173
		bodyModel[71] = new ModelRendererTurbo(this, 369, 353, textureX, textureY); // Box 174
		bodyModel[72] = new ModelRendererTurbo(this, 633, 337, textureX, textureY); // Box 176
		bodyModel[73] = new ModelRendererTurbo(this, 505, 401, textureX, textureY); // Box 177
		bodyModel[74] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 178
		bodyModel[75] = new ModelRendererTurbo(this, 713, 401, textureX, textureY); // Box 179
		bodyModel[76] = new ModelRendererTurbo(this, 209, 369, textureX, textureY); // Box 180
		bodyModel[77] = new ModelRendererTurbo(this, 177, 409, textureX, textureY); // Box 181
		bodyModel[78] = new ModelRendererTurbo(this, 657, 369, textureX, textureY); // Box 182
		bodyModel[79] = new ModelRendererTurbo(this, 905, 377, textureX, textureY); // Box 183
		bodyModel[80] = new ModelRendererTurbo(this, 689, 409, textureX, textureY); // Box 184
		bodyModel[81] = new ModelRendererTurbo(this, 657, 393, textureX, textureY); // Box 225
		bodyModel[82] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 226
		bodyModel[83] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 304
		bodyModel[84] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 307
		bodyModel[85] = new ModelRendererTurbo(this, 81, 353, textureX, textureY); // Box 235
		bodyModel[86] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 2
		bodyModel[87] = new ModelRendererTurbo(this, 801, 257, textureX, textureY); // Box 3
		bodyModel[88] = new ModelRendererTurbo(this, 1001, 345, textureX, textureY); // Box 27
		bodyModel[89] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 5
		bodyModel[90] = new ModelRendererTurbo(this, 1001, 281, textureX, textureY); // Box 6
		bodyModel[91] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 7
		bodyModel[92] = new ModelRendererTurbo(this, 873, 241, textureX, textureY); // Box 8
		bodyModel[93] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 9
		bodyModel[94] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 10
		bodyModel[95] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 11
		bodyModel[96] = new ModelRendererTurbo(this, 737, 249, textureX, textureY); // Box 12
		bodyModel[97] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 13
		bodyModel[98] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 14
		bodyModel[99] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 15
		bodyModel[100] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 16
		bodyModel[101] = new ModelRendererTurbo(this, 705, 73, textureX, textureY); // Box 17
		bodyModel[102] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 18
		bodyModel[103] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 19
		bodyModel[104] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 20
		bodyModel[105] = new ModelRendererTurbo(this, 665, 217, textureX, textureY); // Box 22
		bodyModel[106] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 23
		bodyModel[107] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 24
		bodyModel[108] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 25
		bodyModel[109] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 27
		bodyModel[110] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 28
		bodyModel[111] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 29
		bodyModel[112] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 30
		bodyModel[113] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 31
		bodyModel[114] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 32
		bodyModel[115] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 33
		bodyModel[116] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 35
		bodyModel[117] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 36
		bodyModel[118] = new ModelRendererTurbo(this, 753, 249, textureX, textureY); // Box 37
		bodyModel[119] = new ModelRendererTurbo(this, 537, 305, textureX, textureY); // Box 38
		bodyModel[120] = new ModelRendererTurbo(this, 625, 305, textureX, textureY); // Box 39
		bodyModel[121] = new ModelRendererTurbo(this, 345, 313, textureX, textureY); // Box 40
		bodyModel[122] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 41
		bodyModel[123] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 42
		bodyModel[124] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 43
		bodyModel[125] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 44
		bodyModel[126] = new ModelRendererTurbo(this, 833, 185, textureX, textureY); // Box 45
		bodyModel[127] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 46
		bodyModel[128] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 47
		bodyModel[129] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 48
		bodyModel[130] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 49
		bodyModel[131] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 50
		bodyModel[132] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 51
		bodyModel[133] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 52
		bodyModel[134] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 53
		bodyModel[135] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 54
		bodyModel[136] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 55
		bodyModel[137] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 56
		bodyModel[138] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 57

		bodyModel[0].addShapeBox(0F, 0F, 0F, 62, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-81F, -18F, -13F);

		bodyModel[1].addBox(0F, 0F, 0F, 31, 9, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(-81F, -38F, -13F);

		bodyModel[2].addBox(0F, 0F, 0F, 62, 11, 13, 0F); // Box 2
		bodyModel[2].setRotationPoint(-81F, -29F, -13F);

		bodyModel[3].addBox(0F, 0F, 0F, 17, 3, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-67F, -41F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 4
		bodyModel[4].setRotationPoint(-67F, -47F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 8, 6, 0F,0F, -2F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 5
		bodyModel[5].setRotationPoint(-61F, -49F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 31, 8, 13, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-50F, -49F, -13F);

		bodyModel[7].addBox(0F, 0F, 0F, 31, 12, 13, 0F); // Box 8
		bodyModel[7].setRotationPoint(-50F, -41F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 31, 8, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-50F, -57F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-50F, -58F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-61F, -58F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-67F, -58F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(-67F, -49F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -2F); // Box 15
		bodyModel[13].setRotationPoint(-61F, -50F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-67F, -57F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 17
		bodyModel[15].setRotationPoint(-67F, -55F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, -2.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-81F, -41F, -13F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 9, 6, 0F,0F, -4F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -5F); // Box 19
		bodyModel[17].setRotationPoint(-81F, -47F, -13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 4, 6, 0F,0F, -2F, -5F, 0F, 0F, -1.99999F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3.99999F, -1.99999F, 0F, -3.99999F, -3F, 0F, 0F, -5F); // Box 20
		bodyModel[18].setRotationPoint(-81F, -47F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,-2F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -1F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-81F, -48F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-81F, -47F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-79F, -53F, -5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F); // Box 25
		bodyModel[22].setRotationPoint(-71F, -55F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F); // Box 26
		bodyModel[23].setRotationPoint(-69F, -57F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 38, 7, 10, 0F,0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -6.99999F, -4F, 0F, -4.99999F, 0F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 34
		bodyModel[24].setRotationPoint(-119F, -20F, -13F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 42, 33, 5, 0F,0F, -3.99999F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3.99999F, 0F, 0F, -28.99999F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -28.99999F, 0F); // Box 35
		bodyModel[25].setRotationPoint(-61F, -51F, -32F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 39, 36, 28, 0F,-1F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyModel[26].setRotationPoint(-20F, -54F, -32F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 41, 36, 10, 0F,0F, -6.99999F, -9F, 0F, -2F, -9F, 0F, 0F, 9F, 0F, -6.99999F, 0F, 0F, -28.99999F, -9F, 1F, 0F, -9F, 1F, 0F, 0F, 0F, -28.99999F, 0F); // Box 37
		bodyModel[27].setRotationPoint(-61F, -54F, -23F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 41, 7, 28, 0F,0F, -6F, -4F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -9F, 0F, 0F, -4F, 1F, -3F, 0F, 0F, -2F, -2F, 0F, 0F, -9F); // Box 38
		bodyModel[28].setRotationPoint(-61F, -54F, -32F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 36, 28, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[29].setRotationPoint(19F, -54F, -32F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 23, 36, 28, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[30].setRotationPoint(34F, -54F, -32F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 39, 36, 28, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[31].setRotationPoint(57F, -54F, -32F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 38, 8, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-19F, -57F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 98, 8, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[33].setRotationPoint(19F, -57F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 38, 1, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[34].setRotationPoint(-19F, -58F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 98, 1, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[35].setRotationPoint(19F, -58F, -4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[36].setRotationPoint(19F, -18F, -32F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 38, 5, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -4.99999F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4.99999F, -9F); // Box 48
		bodyModel[37].setRotationPoint(-19F, -18F, -32F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 38, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[38].setRotationPoint(-19F, -18F, -13F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 23, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[39].setRotationPoint(34F, -18F, -32F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 39, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[40].setRotationPoint(57F, -18F, -32F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 57, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[41].setRotationPoint(-13F, -50F, -34F);

		bodyModel[42].addTrapezoid(0F, 0F, 0F, 6, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 94
		bodyModel[42].setRotationPoint(-19F, -50F, -34F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 62, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 135
		bodyModel[43].setRotationPoint(-81F, -18F, 0F);

		bodyModel[44].addBox(0F, 0F, 0F, 31, 9, 1, 0F); // Box 136
		bodyModel[44].setRotationPoint(-81F, -38F, 12F);

		bodyModel[45].addBox(0F, 0F, 0F, 62, 11, 13, 0F); // Box 137
		bodyModel[45].setRotationPoint(-81F, -29F, 0F);

		bodyModel[46].addBox(0F, 0F, 0F, 17, 3, 1, 0F); // Box 138
		bodyModel[46].setRotationPoint(-67F, -41F, 12F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[47].setRotationPoint(-67F, -47F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 8, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[48].setRotationPoint(-61F, -49F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 31, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[49].setRotationPoint(-50F, -49F, 0F);

		bodyModel[50].addBox(0F, 0F, 0F, 31, 12, 13, 0F); // Box 142
		bodyModel[50].setRotationPoint(-50F, -41F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 31, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[51].setRotationPoint(-50F, -57F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 31, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[52].setRotationPoint(-50F, -58F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 148
		bodyModel[53].setRotationPoint(-67F, -49F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, -1F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 149
		bodyModel[54].setRotationPoint(-61F, -50F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[55].setRotationPoint(-67F, -57F, 1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[56].setRotationPoint(-67F, -55F, 3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, -2.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[57].setRotationPoint(-81F, -41F, 12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 14, 9, 6, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -3F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[58].setRotationPoint(-81F, -47F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 14, 4, 6, 0F,0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -1.99999F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, -3.99999F, -3F, 0F, -3.99999F, -1.99999F, 0F, 0F, 0F); // Box 154
		bodyModel[59].setRotationPoint(-81F, -47F, 4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 14, 3, 4, 0F,-2F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -1F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F); // Box 155
		bodyModel[60].setRotationPoint(-81F, -48F, 4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[61].setRotationPoint(-81F, -47F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[62].setRotationPoint(-79F, -53F, 4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 158
		bodyModel[63].setRotationPoint(-71F, -55F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 159
		bodyModel[64].setRotationPoint(-69F, -57F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 42, 33, 5, 0F,0F, -3.99999F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3.99999F, -4F, 0F, -28.99999F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -28.99999F, -4F); // Box 168
		bodyModel[65].setRotationPoint(-61F, -51F, 27F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 39, 36, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F); // Box 169
		bodyModel[66].setRotationPoint(-20F, -54F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 41, 36, 10, 0F,0F, -6.99999F, 0F, 0F, 0F, 9F, 0F, -2F, -9F, 0F, -6.99999F, -9F, 0F, -28.99999F, 0F, 1F, 0F, 0F, 1F, 0F, -9F, 0F, -28.99999F, -9F); // Box 170
		bodyModel[67].setRotationPoint(-61F, -54F, 13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 41, 7, 28, 0F,0F, -6F, -9F, 0F, 0F, 0F, 1F, -3F, 0F, 0F, -6F, -4F, 0F, 0F, -9F, 0F, -2F, -2F, 1F, -3F, 0F, 0F, 0F, -4F); // Box 171
		bodyModel[68].setRotationPoint(-61F, -54F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 15, 36, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[69].setRotationPoint(19F, -54F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 23, 36, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[70].setRotationPoint(34F, -54F, 4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 39, 36, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[71].setRotationPoint(57F, -54F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 38, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 176
		bodyModel[72].setRotationPoint(-19F, -57F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 98, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 177
		bodyModel[73].setRotationPoint(19F, -57F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 38, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[74].setRotationPoint(-19F, -58F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 98, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[75].setRotationPoint(19F, -58F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 15, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 180
		bodyModel[76].setRotationPoint(19F, -18F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 38, 5, 28, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4.99999F, -9F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4.99999F, -4F); // Box 181
		bodyModel[77].setRotationPoint(-19F, -18F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 38, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 182
		bodyModel[78].setRotationPoint(-19F, -18F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 23, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 183
		bodyModel[79].setRotationPoint(34F, -18F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 39, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 184
		bodyModel[80].setRotationPoint(57F, -18F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 57, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[81].setRotationPoint(-13F, -50F, 31F);

		bodyModel[82].addTrapezoid(0F, 0F, 0F, 6, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 226
		bodyModel[82].setRotationPoint(-19F, -50F, 31F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[83].setRotationPoint(-15.5F, -65F, -0.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 307
		bodyModel[84].setRotationPoint(-66.5F, -13F, -0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 17, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[85].setRotationPoint(-70F, -32F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[86].setRotationPoint(-71F, -34F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[87].setRotationPoint(-71F, -34F, 4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 21, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[88].setRotationPoint(-53F, -50F, -4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[89].setRotationPoint(-57F, -50F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 7, 16, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[90].setRotationPoint(-57F, -50F, 4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 7
		bodyModel[91].setRotationPoint(-54F, -48F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[92].setRotationPoint(-54F, -36F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[93].setRotationPoint(-54F, -48F, 2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[94].setRotationPoint(-54F, -39F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[95].setRotationPoint(-54F, -39F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[96].setRotationPoint(-54F, -48F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[97].setRotationPoint(-54.5F, -43F, -2.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[98].setRotationPoint(-54.5F, -43F, 1.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[99].setRotationPoint(-54.5F, -44F, 1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[100].setRotationPoint(-54.5F, -44F, -2.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[101].setRotationPoint(-54.5F, -49F, -2.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[102].setRotationPoint(-54.5F, -49F, 1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[103].setRotationPoint(-53.5F, -50F, -1.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[104].setRotationPoint(-53.5F, -50F, 0.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 22
		bodyModel[105].setRotationPoint(-54.5F, -40F, -4.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -7F, 0.5F, 0F, -7F, 0.5F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[106].setRotationPoint(-54.5F, -40F, 1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[107].setRotationPoint(-53.5F, -50F, -3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[108].setRotationPoint(-53.5F, -50F, 2.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[109].setRotationPoint(-54F, -51F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[110].setRotationPoint(-54F, -52F, -5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29
		bodyModel[111].setRotationPoint(-54F, -51F, 3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[112].setRotationPoint(-54F, -52F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[113].setRotationPoint(-51F, -56F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[114].setRotationPoint(-51F, -56F, 2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[115].setRotationPoint(-51F, -55F, -2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[116].setRotationPoint(-51F, -56F, 0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[117].setRotationPoint(-51F, -56F, -1.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[118].setRotationPoint(-54F, -56F, -3.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[119].setRotationPoint(-54F, -54F, -3.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 39
		bodyModel[120].setRotationPoint(-54F, -52F, -3.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[121].setRotationPoint(-68F, -33F, -4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[122].setRotationPoint(-70F, -33F, -4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[123].setRotationPoint(-70F, -33F, 2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[124].setRotationPoint(-70F, -34F, -1.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[125].setRotationPoint(-69F, -36F, -3.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 45
		bodyModel[126].setRotationPoint(-69F, -36F, 0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[127].setRotationPoint(-71F, -34F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[128].setRotationPoint(-71F, -34F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[129].setRotationPoint(-70F, -36F, 4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[130].setRotationPoint(-70F, -36F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[131].setRotationPoint(-65F, -36F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[132].setRotationPoint(-63F, -37F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[133].setRotationPoint(-62F, -36F, -6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[134].setRotationPoint(-63F, -37F, 5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[135].setRotationPoint(-71F, -32F, -4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[136].setRotationPoint(-71F, -32F, -1.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[137].setRotationPoint(-71F, -32F, 0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[138].setRotationPoint(-71F, -32F, 3F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 10
		noseModel[1] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 27
		noseModel[2] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 28
		noseModel[3] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 29
		noseModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		noseModel[5] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 31
		noseModel[6] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 32
		noseModel[7] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 33
		noseModel[8] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 63
		noseModel[9] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 64
		noseModel[10] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Box 65
		noseModel[11] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 66
		noseModel[12] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 144
		noseModel[13] = new ModelRendererTurbo(this, 681, 249, textureX, textureY); // Box 160
		noseModel[14] = new ModelRendererTurbo(this, 737, 305, textureX, textureY); // Box 161
		noseModel[15] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 162
		noseModel[16] = new ModelRendererTurbo(this, 833, 305, textureX, textureY); // Box 163
		noseModel[17] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 164
		noseModel[18] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 165
		noseModel[19] = new ModelRendererTurbo(this, 921, 321, textureX, textureY); // Box 166
		noseModel[20] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Box 167
		noseModel[21] = new ModelRendererTurbo(this, 313, 433, textureX, textureY); // Box 196
		noseModel[22] = new ModelRendererTurbo(this, 817, 329, textureX, textureY); // Box 197
		noseModel[23] = new ModelRendererTurbo(this, 937, 345, textureX, textureY); // Box 198
		noseModel[24] = new ModelRendererTurbo(this, 761, 369, textureX, textureY); // Box 199
		noseModel[25] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 305
		noseModel[26] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 306
		noseModel[27] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 308
		noseModel[28] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 309
		noseModel[29] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 310
		noseModel[30] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 311
		noseModel[31] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 312
		noseModel[32] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 313

		noseModel[0].addShapeBox(0F, 0F, 0F, 38, 32, 5, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 10
		noseModel[0].setRotationPoint(-119F, -45F, -5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 24, 27, 3, 0F,0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 27
		noseModel[1].setRotationPoint(-143F, -41F, -3F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 38, 9, 7, 0F,0F, -8.99999F, -0.99999F, 0F, -1.99999F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, -0.99999F, 0F, -6.99999F, 0F, 0F, -6.99999F, -2F, 0F, 0F, 0F); // Box 28
		noseModel[2].setRotationPoint(-119F, -45F, -10F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 25, 18, 2, 0F,0F, -9.99999F, -1.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.99999F, 0F, 0F, -7.99999F, -1.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.99999F, 0F); // Box 29
		noseModel[3].setRotationPoint(-168F, -35F, -2F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 38, 9, 10, 0F,0F, -8.99999F, -3.99999F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -8.99999F, 0F, 0F, 0F, -3.99999F, 0F, -1.99999F, 0F, 0F, -1.99999F, 0F, 0F, 0F, 0F); // Box 30
		noseModel[4].setRotationPoint(-119F, -45F, -13F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 38, 12, 10, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 31
		noseModel[5].setRotationPoint(-119F, -38F, -13F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 38, 4, 10, 0F,0F, 0F, -2F, 0F, -3.99999F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		noseModel[6].setRotationPoint(-119F, -30F, -13F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 38, 8, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 33
		noseModel[7].setRotationPoint(-119F, -26F, -13F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 24, 31, 7, 0F,0F, -12F, -3F, 0F, -9F, 0F, 0F, -4F, -1F, 0F, -10F, 0F, 0F, -7F, -2F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -3F, 0F); // Box 63
		noseModel[8].setRotationPoint(-143F, -45F, -9F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 24, 16, 5, 0F,0F, -8F, -3F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -6F, -3F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, -1F, -1F); // Box 64
		noseModel[9].setRotationPoint(-143F, -36F, -11F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 25, 18, 6, 0F,0F, -9.99999F, -5.99999F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -9.99999F, 0F, 0F, -7.99999F, -5.99999F, 0F, -4F, 1F, 0F, 0F, -2F, 0F, -7.99999F, 0F); // Box 65
		noseModel[10].setRotationPoint(-168F, -35F, -6F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 25, 12, 8, 0F,0F, -7.99999F, -7.99999F, 0F, -5F, 0F, 0F, 0F, -6F, 0F, -7.99999F, 0F, 0F, -3.99999F, -7.99999F, 0F, -5F, 0F, 0F, 0F, -7F, 0F, -3.99999F, 0F); // Box 66
		noseModel[11].setRotationPoint(-168F, -33F, -8F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 38, 32, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 144
		noseModel[12].setRotationPoint(-119F, -45F, 0F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 24, 27, 3, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 160
		noseModel[13].setRotationPoint(-143F, -41F, 0F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 38, 9, 7, 0F,0F, -4F, 0F, 0F, 0F, -2F, 0F, -1.99999F, 0F, 0F, -8.99999F, -0.99999F, 0F, 0F, 0F, 0F, -6.99999F, -2F, 0F, -6.99999F, 0F, 0F, 0F, -0.99999F); // Box 161
		noseModel[14].setRotationPoint(-119F, -45F, 3F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 25, 18, 2, 0F,0F, -9.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9.99999F, -1.99999F, 0F, -7.99999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.99999F, -1.99999F); // Box 162
		noseModel[15].setRotationPoint(-168F, -35F, 0F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 38, 9, 10, 0F,0F, -8.99999F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -8.99999F, -3.99999F, 0F, 0F, 0F, 0F, -1.99999F, 0F, 0F, -1.99999F, 0F, 0F, 0F, -3.99999F); // Box 163
		noseModel[16].setRotationPoint(-119F, -45F, 3F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 38, 12, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 164
		noseModel[17].setRotationPoint(-119F, -38F, 3F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 38, 4, 10, 0F,0F, 0F, 0F, 0F, -3.99999F, 0F, 0F, -3.99999F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 165
		noseModel[18].setRotationPoint(-119F, -30F, 3F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 38, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 166
		noseModel[19].setRotationPoint(-119F, -26F, 3F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 38, 7, 10, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -4.99999F, 0F, 0F, -6.99999F, -4F); // Box 167
		noseModel[20].setRotationPoint(-119F, -20F, 3F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 24, 31, 7, 0F,0F, -10F, 0F, 0F, -4F, -1F, 0F, -9F, 0F, 0F, -12F, -3F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -7F, -2F); // Box 196
		noseModel[21].setRotationPoint(-143F, -45F, 2F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 24, 16, 5, 0F,0F, -3F, 0F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -8F, -3F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, -6F, 0F, 0F, -6F, -3F); // Box 197
		noseModel[22].setRotationPoint(-143F, -36F, 6F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 25, 18, 6, 0F,0F, -9.99999F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -9.99999F, -5.99999F, 0F, -7.99999F, 0F, 0F, 0F, -2F, 0F, -4F, 1F, 0F, -7.99999F, -5.99999F); // Box 198
		noseModel[23].setRotationPoint(-168F, -35F, 0F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 25, 12, 8, 0F,0F, -7.99999F, 0F, 0F, 0F, -6F, 0F, -5F, 0F, 0F, -7.99999F, -7.99999F, 0F, -3.99999F, 0F, 0F, 0F, -7F, 0F, -5F, 0F, 0F, -3.99999F, -7.99999F); // Box 199
		noseModel[24].setRotationPoint(-168F, -33F, 0F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		noseModel[25].setRotationPoint(-113.5F, -43F, -0.5F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 306
		noseModel[26].setRotationPoint(-89.5F, -14F, -0.5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 18, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, -3F, 0F, -1F); // Box 308
		noseModel[27].setRotationPoint(-118.5F, -14F, -2.5F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		noseModel[28].setRotationPoint(-198.5F, -25.5F, -0.5F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 310
		noseModel[29].setRotationPoint(-187.5F, -26.5F, -0.5F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 311
		noseModel[30].setRotationPoint(-185.5F, -26.5F, -0.5F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 312
		noseModel[31].setRotationPoint(-185.5F, -24.5F, -0.5F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 313
		noseModel[32].setRotationPoint(-187.5F, -24.5F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 42
		tailModel[1] = new ModelRendererTurbo(this, 609, 113, textureX, textureY); // Box 52
		tailModel[2] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 53
		tailModel[3] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 54
		tailModel[4] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 55
		tailModel[5] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 56
		tailModel[6] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 57
		tailModel[7] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 58
		tailModel[8] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 59
		tailModel[9] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 60
		tailModel[10] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 61
		tailModel[11] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 62
		tailModel[12] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Box 83
		tailModel[13] = new ModelRendererTurbo(this, 681, 217, textureX, textureY); // Box 84
		tailModel[14] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 86
		tailModel[15] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Box 87
		tailModel[16] = new ModelRendererTurbo(this, 825, 241, textureX, textureY); // Box 88
		tailModel[17] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 92
		tailModel[18] = new ModelRendererTurbo(this, 105, 353, textureX, textureY); // Box 175
		tailModel[19] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // Box 185
		tailModel[20] = new ModelRendererTurbo(this, 833, 417, textureX, textureY); // Box 186
		tailModel[21] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 187
		tailModel[22] = new ModelRendererTurbo(this, 385, 425, textureX, textureY); // Box 188
		tailModel[23] = new ModelRendererTurbo(this, 521, 425, textureX, textureY); // Box 189
		tailModel[24] = new ModelRendererTurbo(this, 129, 449, textureX, textureY); // Box 190
		tailModel[25] = new ModelRendererTurbo(this, 777, 217, textureX, textureY); // Box 191
		tailModel[26] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 192
		tailModel[27] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 193
		tailModel[28] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 194
		tailModel[29] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 195
		tailModel[30] = new ModelRendererTurbo(this, 537, 545, textureX, textureY); // Box 216
		tailModel[31] = new ModelRendererTurbo(this, 809, 505, textureX, textureY); // Box 217
		tailModel[32] = new ModelRendererTurbo(this, 945, 433, textureX, textureY); // Box 218
		tailModel[33] = new ModelRendererTurbo(this, 753, 449, textureX, textureY); // Box 219
		tailModel[34] = new ModelRendererTurbo(this, 425, 481, textureX, textureY); // Box 220
		tailModel[35] = new ModelRendererTurbo(this, 897, 529, textureX, textureY); // Box 224

		tailModel[0].addShapeBox(0F, 0F, 0F, 21, 36, 28, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 42
		tailModel[0].setRotationPoint(96F, -54F, -32F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 21, 6, 32, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[1].setRotationPoint(96F, -19F, -32F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 49, 16, 18, 0F,0F, 0F, 0F, 0F, -4F, -7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -11.99999F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		tailModel[2].setRotationPoint(117F, -54F, -32F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 49, 12, 18, 0F,0F, -9F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -4F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 54
		tailModel[3].setRotationPoint(117F, -28F, -32F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 49, 31, 18, 0F,0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -4F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 55
		tailModel[4].setRotationPoint(117F, -50F, -32F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 49, 38, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[5].setRotationPoint(117F, -54F, -14F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 49, 8, 8, 0F,0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 57
		tailModel[6].setRotationPoint(117F, -57F, -8F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 15, 3, 5, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[7].setRotationPoint(166F, -55F, -5F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, -0.99999F, -1F, 0F, -1.99999F, -4F, 0F, -1.99999F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.99999F, -4F, 0F, -0.99999F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[8].setRotationPoint(181F, -55F, -4F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 49, 3, 4, 0F,0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 60
		tailModel[9].setRotationPoint(117F, -58F, -4F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F,0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 61
		tailModel[10].setRotationPoint(166F, -56F, -5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, -3F, 0F, -1.99999F, -3.99999F, 0F, -1.99999F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -3.99999F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 62
		tailModel[11].setRotationPoint(181F, -55F, -4F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 86, 41, 12, 0F,-48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -48F, 0F, -10F, 4F, 0F, -10F, -7F, 0F, -9F, -7F, 0F, 0F, 4F, 0F, 0F); // Box 83
		tailModel[12].setRotationPoint(95F, -91F, -33F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 38, 20, 7, 0F,-25F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -3F, -24F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		tailModel[13].setRotationPoint(143F, -111F, -38F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 8, 8, 24, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		tailModel[14].setRotationPoint(166F, -50F, -26F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 8, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		tailModel[15].setRotationPoint(166F, -42F, -26F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 8, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -7F); // Box 88
		tailModel[16].setRotationPoint(166F, -34F, -26F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 57, 16, 6, 0F,0F, -9F, -2F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -9F, -3F, -7F, 0F, 0F, 0F, -10F, -4F, 0F, -10F, -1F, -7F, 0F, -5F); // Box 92
		tailModel[17].setRotationPoint(112F, -25F, -29F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 21, 36, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 175
		tailModel[18].setRotationPoint(96F, -54F, 4F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 21, 6, 32, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -4F); // Box 185
		tailModel[19].setRotationPoint(96F, -19F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 49, 16, 18, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11.99999F, 0F); // Box 186
		tailModel[20].setRotationPoint(117F, -54F, 14F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 49, 12, 18, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -8F, 0F, 0F, -4F); // Box 187
		tailModel[21].setRotationPoint(117F, -28F, 14F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 49, 31, 18, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, -4F, 0F, 0F, 0F); // Box 188
		tailModel[22].setRotationPoint(117F, -50F, 14F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 49, 38, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 189
		tailModel[23].setRotationPoint(117F, -54F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 49, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -2F); // Box 190
		tailModel[24].setRotationPoint(117F, -57F, 0F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 15, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 191
		tailModel[25].setRotationPoint(166F, -55F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, -1F, 0F, 0F, -1.99999F, 0F, 0F, -1.99999F, -4F, 0F, -0.99999F, -1F, 0F, 0F, 0F, 0F, -0.99999F, 0F, 0F, -0.99999F, -4F, 0F, 0F, 0F); // Box 192
		tailModel[26].setRotationPoint(181F, -55F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 49, 3, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 193
		tailModel[27].setRotationPoint(117F, -58F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 15, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -1F); // Box 194
		tailModel[28].setRotationPoint(166F, -56F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, -1.99999F, 0F, 0F, -1.99999F, -3.99999F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.99999F, 0F, -1F, -1F); // Box 195
		tailModel[29].setRotationPoint(181F, -55F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 86, 41, 12, 0F,-48F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, -48F, 0F, 0F, 4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -9F, 4F, 0F, -10F); // Box 216
		tailModel[30].setRotationPoint(95F, -91F, 21F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 38, 20, 7, 0F,-24F, 0F, -5F, 0F, -7F, -3F, 0F, -7F, -2F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 217
		tailModel[31].setRotationPoint(143F, -111F, 31F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 8, 8, 24, 0F,0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		tailModel[32].setRotationPoint(166F, -50F, 2F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 8, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		tailModel[33].setRotationPoint(166F, -42F, 2F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 8, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 220
		tailModel[34].setRotationPoint(166F, -34F, 2F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 57, 16, 6, 0F,0F, -9F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -2F, -7F, 0F, -5F, 0F, -10F, -1F, 0F, -10F, -4F, -7F, 0F, 0F); // Box 224
		tailModel[35].setRotationPoint(112F, -25F, 23F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 67
		leftWingModel[1] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 68
		leftWingModel[2] = new ModelRendererTurbo(this, 577, 153, textureX, textureY); // Box 69
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 70
		leftWingModel[4] = new ModelRendererTurbo(this, 673, 169, textureX, textureY); // Box 71
		leftWingModel[5] = new ModelRendererTurbo(this, 545, 193, textureX, textureY); // Box 72
		leftWingModel[6] = new ModelRendererTurbo(this, 785, 193, textureX, textureY); // Box 73
		leftWingModel[7] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 74
		leftWingModel[8] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 75
		leftWingModel[9] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 78
		leftWingModel[10] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 79
		leftWingModel[11] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 80
		leftWingModel[12] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 81
		leftWingModel[13] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 89
		leftWingModel[14] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 90
		leftWingModel[15] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 91
		leftWingModel[16] = new ModelRendererTurbo(this, 897, 265, textureX, textureY); // Box 0
		leftWingModel[17] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Box 1
		leftWingModel[18] = new ModelRendererTurbo(this, 729, 281, textureX, textureY); // Box 95
		leftWingModel[19] = new ModelRendererTurbo(this, 857, 281, textureX, textureY); // Box 96
		leftWingModel[20] = new ModelRendererTurbo(this, 409, 297, textureX, textureY); // Box 2
		leftWingModel[21] = new ModelRendererTurbo(this, 529, 297, textureX, textureY); // Box 3
		leftWingModel[22] = new ModelRendererTurbo(this, 649, 297, textureX, textureY); // Box 4
		leftWingModel[23] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 5
		leftWingModel[24] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 6
		leftWingModel[25] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 7
		leftWingModel[26] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 8
		leftWingModel[27] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 9
		leftWingModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 10
		leftWingModel[29] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 11
		leftWingModel[30] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 12
		leftWingModel[31] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 13
		leftWingModel[32] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 14
		leftWingModel[33] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 15
		leftWingModel[34] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 16
		leftWingModel[35] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 18
		leftWingModel[36] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 19
		leftWingModel[37] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 20
		leftWingModel[38] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 21
		leftWingModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 22
		leftWingModel[40] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 23
		leftWingModel[41] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		leftWingModel[42] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 25
		leftWingModel[43] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 26
		leftWingModel[44] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 27
		leftWingModel[45] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 28
		leftWingModel[46] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 29
		leftWingModel[47] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 30
		leftWingModel[48] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 31
		leftWingModel[49] = new ModelRendererTurbo(this, 769, 297, textureX, textureY); // Box 105
		leftWingModel[50] = new ModelRendererTurbo(this, 889, 297, textureX, textureY); // Box 106
		leftWingModel[51] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 107
		leftWingModel[52] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 108
		leftWingModel[53] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 109
		leftWingModel[54] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 110
		leftWingModel[55] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 111
		leftWingModel[56] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 112
		leftWingModel[57] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 113
		leftWingModel[58] = new ModelRendererTurbo(this, 713, 41, textureX, textureY); // Box 114
		leftWingModel[59] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 115
		leftWingModel[60] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 116
		leftWingModel[61] = new ModelRendererTurbo(this, 985, 105, textureX, textureY); // Box 117
		leftWingModel[62] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 118
		leftWingModel[63] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 119
		leftWingModel[64] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 120
		leftWingModel[65] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 121
		leftWingModel[66] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 122
		leftWingModel[67] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 123
		leftWingModel[68] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 124
		leftWingModel[69] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 125
		leftWingModel[70] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 126
		leftWingModel[71] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 127
		leftWingModel[72] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 128
		leftWingModel[73] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 129
		leftWingModel[74] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 130
		leftWingModel[75] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 131
		leftWingModel[76] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 132
		leftWingModel[77] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 133

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 48, 10, 37, 0F,-18F, -5F, 0F, 0F, -6F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -9F, -4F, 0F, 0F, -3F, 0F); // Box 67
		leftWingModel[0].setRotationPoint(57F, -54F, -69F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 39, 8, 37, 0F,-17F, -4F, 0F, 0F, -5F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 68
		leftWingModel[1].setRotationPoint(75F, -49F, -106F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 31, 7, 32, 0F,-15F, -4F, 0F, 0F, -5F, 0F, -9F, -1F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -9F, -3F, 0F, 0F, -3F, 0F); // Box 69
		leftWingModel[2].setRotationPoint(92F, -45F, -138F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 41, 10, 37, 0F,-24F, -5F, 0F, 0F, -5F, 0F, -18F, 0F, 0F, 0F, -1F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, -18F, -3F, 0F, 0F, -3F, 0F); // Box 70
		leftWingModel[3].setRotationPoint(34F, -54F, -69F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 34, 8, 37, 0F,-22F, -5F, 0F, 0F, -4F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, -17F, -3F, 0F, 0F, -3F, 0F); // Box 71
		leftWingModel[4].setRotationPoint(58F, -49F, -106F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 27, 7, 32, 0F,-19F, -5F, 0F, 0F, -4F, 0F, -15F, 0F, 0F, 0F, -1F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, -15F, -3F, 0F, 0F, -3F, 0F); // Box 72
		leftWingModel[5].setRotationPoint(80F, -45F, -138F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 39, 9, 37, 0F,-26F, -6F, 0F, 0F, -4F, 0F, -24F, 0F, 0F, 0F, -3F, 0F, -26F, -2F, 0F, 0F, 0F, 0F, -24F, -3F, 0F, 0F, -5F, 0F); // Box 73
		leftWingModel[6].setRotationPoint(19F, -53F, -69F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 35, 8, 37, 0F,-26F, -6F, 0F, 0F, -5F, 0F, -22F, 0F, 0F, 0F, -2F, 0F, -26F, -1F, 0F, 0F, 0F, 0F, -22F, -3F, 0F, 0F, -5F, 0F); // Box 74
		leftWingModel[7].setRotationPoint(45F, -49F, -106F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 28, 7, 32, 0F,-21F, -6F, 0F, 0F, -5F, 0F, -19F, -1F, 0F, 0F, -2F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, -19F, -3F, 0F, 0F, -4F, 0F); // Box 75
		leftWingModel[8].setRotationPoint(71F, -45F, -138F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 7, 32, 0F,-9F, -4F, 0F, 0F, -4F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -9F, -1F, 0F, 0F, -2F, 0F, -5F, -5F, 0F, 0F, -4F, 0F); // Box 78
		leftWingModel[9].setRotationPoint(114F, -44F, -138F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 57, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftWingModel[10].setRotationPoint(73F, -41F, -141F);

		leftWingModel[11].addTrapezoid(0F, 0F, 0F, 6, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 80
		leftWingModel[11].setRotationPoint(67F, -41F, -141F);

		leftWingModel[12].addTrapezoid(0F, 0F, 0F, 5, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_FRONT); // Box 81
		leftWingModel[12].setRotationPoint(130F, -41F, -141F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 43, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftWingModel[13].setRotationPoint(55F, -53F, -65F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftWingModel[14].setRotationPoint(42F, -53F, -65F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		leftWingModel[15].setRotationPoint(98F, -53F, -65F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 61, 14, 1, 0F,-21F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[16].setRotationPoint(24F, -47F, -65.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 61, 14, 1, 0F,-18F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		leftWingModel[17].setRotationPoint(24F, -47F, -64.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 61, 13, 1, 0F,-18F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 95
		leftWingModel[18].setRotationPoint(45F, -44F, -90.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 61, 13, 1, 0F,-21F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		leftWingModel[19].setRotationPoint(45F, -44F, -91.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 2
		leftWingModel[20].setRotationPoint(24F, -32.5F, -67F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftWingModel[21].setRotationPoint(24F, -31F, -67F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 4
		leftWingModel[22].setRotationPoint(24F, -29F, -67F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 5
		leftWingModel[23].setRotationPoint(21F, -31F, -67F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		leftWingModel[24].setRotationPoint(20F, -30.5F, -66F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 7
		leftWingModel[25].setRotationPoint(21F, -32.5F, -67F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 8
		leftWingModel[26].setRotationPoint(21F, -29.5F, -67F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 9
		leftWingModel[27].setRotationPoint(20F, -29.5F, -66F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 10
		leftWingModel[28].setRotationPoint(20F, -31.5F, -66F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftWingModel[29].setRotationPoint(23F, -33F, -67F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 12
		leftWingModel[30].setRotationPoint(25F, -33F, -67F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftWingModel[31].setRotationPoint(29F, -35F, -69F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftWingModel[32].setRotationPoint(63F, -35F, -69F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 15
		leftWingModel[33].setRotationPoint(77F, -32.5F, -67F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftWingModel[34].setRotationPoint(77F, -31F, -67F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 18
		leftWingModel[35].setRotationPoint(77F, -31F, -63F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 19
		leftWingModel[36].setRotationPoint(77F, -28.5F, -67F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 20
		leftWingModel[37].setRotationPoint(23F, -33F, -64F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 21
		leftWingModel[38].setRotationPoint(25F, -33F, -64F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 22
		leftWingModel[39].setRotationPoint(29F, -35F, -64F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 23
		leftWingModel[40].setRotationPoint(63F, -35F, -64F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		leftWingModel[41].setRotationPoint(23F, -29F, -64F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 25
		leftWingModel[42].setRotationPoint(25F, -29F, -64F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 26
		leftWingModel[43].setRotationPoint(29F, -30F, -64F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		leftWingModel[44].setRotationPoint(63F, -30F, -64F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 28
		leftWingModel[45].setRotationPoint(63F, -30F, -69F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 29
		leftWingModel[46].setRotationPoint(29F, -30F, -69F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 30
		leftWingModel[47].setRotationPoint(25F, -29F, -67F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 31
		leftWingModel[48].setRotationPoint(23F, -29F, -67F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 105
		leftWingModel[49].setRotationPoint(44F, -30.5F, -93F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		leftWingModel[50].setRotationPoint(44F, -29F, -93F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 107
		leftWingModel[51].setRotationPoint(44F, -27F, -93F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 108
		leftWingModel[52].setRotationPoint(41F, -29F, -93F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 109
		leftWingModel[53].setRotationPoint(40F, -28.5F, -92F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 110
		leftWingModel[54].setRotationPoint(41F, -30.5F, -93F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 111
		leftWingModel[55].setRotationPoint(41F, -27.5F, -93F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 112
		leftWingModel[56].setRotationPoint(40F, -27.5F, -92F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 113
		leftWingModel[57].setRotationPoint(40F, -29.5F, -92F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftWingModel[58].setRotationPoint(43F, -31F, -93F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 115
		leftWingModel[59].setRotationPoint(45F, -31F, -93F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		leftWingModel[60].setRotationPoint(49F, -33F, -95F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftWingModel[61].setRotationPoint(83F, -33F, -95F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 118
		leftWingModel[62].setRotationPoint(97F, -30.5F, -93F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftWingModel[63].setRotationPoint(97F, -29F, -93F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 120
		leftWingModel[64].setRotationPoint(97F, -29F, -89F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 121
		leftWingModel[65].setRotationPoint(97F, -26.5F, -93F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 122
		leftWingModel[66].setRotationPoint(43F, -31F, -90F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 123
		leftWingModel[67].setRotationPoint(45F, -31F, -90F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 124
		leftWingModel[68].setRotationPoint(49F, -33F, -90F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 125
		leftWingModel[69].setRotationPoint(83F, -33F, -90F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 126
		leftWingModel[70].setRotationPoint(43F, -27F, -90F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 127
		leftWingModel[71].setRotationPoint(45F, -27F, -90F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 128
		leftWingModel[72].setRotationPoint(49F, -28F, -90F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 129
		leftWingModel[73].setRotationPoint(83F, -28F, -90F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 130
		leftWingModel[74].setRotationPoint(83F, -28F, -95F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 131
		leftWingModel[75].setRotationPoint(49F, -28F, -95F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 132
		leftWingModel[76].setRotationPoint(45F, -27F, -93F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 133
		leftWingModel[77].setRotationPoint(43F, -27F, -93F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 617, 449, textureX, textureY); // Box 200
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 457, textureX, textureY); // Box 201
		rightWingModel[2] = new ModelRendererTurbo(this, 217, 449, textureX, textureY); // Box 202
		rightWingModel[3] = new ModelRendererTurbo(this, 793, 457, textureX, textureY); // Box 203
		rightWingModel[4] = new ModelRendererTurbo(this, 313, 481, textureX, textureY); // Box 204
		rightWingModel[5] = new ModelRendererTurbo(this, 129, 473, textureX, textureY); // Box 205
		rightWingModel[6] = new ModelRendererTurbo(this, 457, 481, textureX, textureY); // Box 206
		rightWingModel[7] = new ModelRendererTurbo(this, 577, 497, textureX, textureY); // Box 207
		rightWingModel[8] = new ModelRendererTurbo(this, 217, 497, textureX, textureY); // Box 208
		rightWingModel[9] = new ModelRendererTurbo(this, 921, 473, textureX, textureY); // Box 211
		rightWingModel[10] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Box 212
		rightWingModel[11] = new ModelRendererTurbo(this, 601, 129, textureX, textureY); // Box 213
		rightWingModel[12] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 214
		rightWingModel[13] = new ModelRendererTurbo(this, 921, 305, textureX, textureY); // Box 221
		rightWingModel[14] = new ModelRendererTurbo(this, 513, 137, textureX, textureY); // Box 222
		rightWingModel[15] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 223
		rightWingModel[16] = new ModelRendererTurbo(this, 97, 513, textureX, textureY); // Box 227
		rightWingModel[17] = new ModelRendererTurbo(this, 129, 537, textureX, textureY); // Box 228
		rightWingModel[18] = new ModelRendererTurbo(this, 1, 553, textureX, textureY); // Box 229
		rightWingModel[19] = new ModelRendererTurbo(this, 129, 553, textureX, textureY); // Box 230
		rightWingModel[20] = new ModelRendererTurbo(this, 217, 489, textureX, textureY); // Box 239
		rightWingModel[21] = new ModelRendererTurbo(this, 97, 529, textureX, textureY); // Box 240
		rightWingModel[22] = new ModelRendererTurbo(this, 1, 569, textureX, textureY); // Box 241
		rightWingModel[23] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 242
		rightWingModel[24] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 243
		rightWingModel[25] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Box 244
		rightWingModel[26] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 245
		rightWingModel[27] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 246
		rightWingModel[28] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 247
		rightWingModel[29] = new ModelRendererTurbo(this, 697, 113, textureX, textureY); // Box 248
		rightWingModel[30] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 249
		rightWingModel[31] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 250
		rightWingModel[32] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 251
		rightWingModel[33] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 252
		rightWingModel[34] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 253
		rightWingModel[35] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 254
		rightWingModel[36] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 255
		rightWingModel[37] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 256
		rightWingModel[38] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 257
		rightWingModel[39] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 258
		rightWingModel[40] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 259
		rightWingModel[41] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 260
		rightWingModel[42] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 261
		rightWingModel[43] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 262
		rightWingModel[44] = new ModelRendererTurbo(this, 673, 169, textureX, textureY); // Box 263
		rightWingModel[45] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 264
		rightWingModel[46] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 265
		rightWingModel[47] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 266
		rightWingModel[48] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 267
		rightWingModel[49] = new ModelRendererTurbo(this, 121, 569, textureX, textureY); // Box 268
		rightWingModel[50] = new ModelRendererTurbo(this, 737, 569, textureX, textureY); // Box 269
		rightWingModel[51] = new ModelRendererTurbo(this, 1, 577, textureX, textureY); // Box 270
		rightWingModel[52] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 271
		rightWingModel[53] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 272
		rightWingModel[54] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 273
		rightWingModel[55] = new ModelRendererTurbo(this, 785, 169, textureX, textureY); // Box 274
		rightWingModel[56] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 275
		rightWingModel[57] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 276
		rightWingModel[58] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 277
		rightWingModel[59] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 278
		rightWingModel[60] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 279
		rightWingModel[61] = new ModelRendererTurbo(this, 785, 193, textureX, textureY); // Box 280
		rightWingModel[62] = new ModelRendererTurbo(this, 537, 129, textureX, textureY); // Box 281
		rightWingModel[63] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 282
		rightWingModel[64] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 283
		rightWingModel[65] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 284
		rightWingModel[66] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Box 285
		rightWingModel[67] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 286
		rightWingModel[68] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 287
		rightWingModel[69] = new ModelRendererTurbo(this, 633, 209, textureX, textureY); // Box 288
		rightWingModel[70] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Box 289
		rightWingModel[71] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 290
		rightWingModel[72] = new ModelRendererTurbo(this, 681, 193, textureX, textureY); // Box 291
		rightWingModel[73] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Box 292
		rightWingModel[74] = new ModelRendererTurbo(this, 985, 209, textureX, textureY); // Box 293
		rightWingModel[75] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 294
		rightWingModel[76] = new ModelRendererTurbo(this, 889, 177, textureX, textureY); // Box 295
		rightWingModel[77] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 296

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 48, 10, 37, 0F,0F, 0F, 0F, -9F, -1F, 0F, 0F, -6F, 0F, -18F, -5F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 0F, 0F, 0F, -18F, 0F, 0F); // Box 200
		rightWingModel[0].setRotationPoint(57F, -54F, 32F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 39, 8, 37, 0F,0F, 0F, 0F, -9F, -1F, 0F, 0F, -5F, 0F, -17F, -4F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, 0F, 0F, 0F, -17F, 0F, 0F); // Box 201
		rightWingModel[1].setRotationPoint(75F, -49F, 69F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 31, 7, 32, 0F,0F, 0F, 0F, -9F, -1F, 0F, 0F, -5F, 0F, -15F, -4F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 202
		rightWingModel[2].setRotationPoint(92F, -45F, 106F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 41, 10, 37, 0F,0F, -1F, 0F, -18F, 0F, 0F, 0F, -5F, 0F, -24F, -5F, 0F, 0F, -3F, 0F, -18F, -3F, 0F, 0F, 0F, 0F, -24F, 0F, 0F); // Box 203
		rightWingModel[3].setRotationPoint(34F, -54F, 32F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 34, 8, 37, 0F,0F, 0F, 0F, -17F, 0F, 0F, 0F, -4F, 0F, -22F, -5F, 0F, 0F, -3F, 0F, -17F, -3F, 0F, 0F, 0F, 0F, -22F, 0F, 0F); // Box 204
		rightWingModel[4].setRotationPoint(58F, -49F, 69F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 27, 7, 32, 0F,0F, -1F, 0F, -15F, 0F, 0F, 0F, -4F, 0F, -19F, -5F, 0F, 0F, -3F, 0F, -15F, -3F, 0F, 0F, 0F, 0F, -19F, 0F, 0F); // Box 205
		rightWingModel[5].setRotationPoint(80F, -45F, 106F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 39, 9, 37, 0F,0F, -3F, 0F, -24F, 0F, 0F, 0F, -4F, 0F, -26F, -6F, 0F, 0F, -5F, 0F, -24F, -3F, 0F, 0F, 0F, 0F, -26F, -2F, 0F); // Box 206
		rightWingModel[6].setRotationPoint(19F, -53F, 32F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 35, 8, 37, 0F,0F, -2F, 0F, -22F, 0F, 0F, 0F, -5F, 0F, -26F, -6F, 0F, 0F, -5F, 0F, -22F, -3F, 0F, 0F, 0F, 0F, -26F, -1F, 0F); // Box 207
		rightWingModel[7].setRotationPoint(45F, -49F, 69F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 28, 7, 32, 0F,0F, -2F, 0F, -19F, -1F, 0F, 0F, -5F, 0F, -21F, -6F, 0F, 0F, -4F, 0F, -19F, -3F, 0F, 0F, 0F, 0F, -21F, 0F, 0F); // Box 208
		rightWingModel[8].setRotationPoint(71F, -45F, 106F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 17, 7, 32, 0F,0F, 0F, 0F, -5F, -1F, 0F, 0F, -4F, 0F, -9F, -4F, 0F, 0F, -4F, 0F, -5F, -5F, 0F, 0F, -2F, 0F, -9F, -1F, 0F); // Box 211
		rightWingModel[9].setRotationPoint(114F, -44F, 106F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 57, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightWingModel[10].setRotationPoint(73F, -41F, 138F);

		rightWingModel[11].addTrapezoid(0F, 0F, 0F, 6, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 213
		rightWingModel[11].setRotationPoint(67F, -41F, 138F);

		rightWingModel[12].addTrapezoid(0F, 0F, 0F, 5, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_BACK); // Box 214
		rightWingModel[12].setRotationPoint(130F, -41F, 138F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 43, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightWingModel[13].setRotationPoint(55F, -53F, 64F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightWingModel[14].setRotationPoint(42F, -53F, 64F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightWingModel[15].setRotationPoint(98F, -53F, 64F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 61, 14, 1, 0F,-18F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 227
		rightWingModel[16].setRotationPoint(24F, -47F, 64.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 61, 14, 1, 0F,-21F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightWingModel[17].setRotationPoint(24F, -47F, 63.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 61, 13, 1, 0F,-21F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightWingModel[18].setRotationPoint(45F, -44F, 89.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 61, 13, 1, 0F,-18F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 230
		rightWingModel[19].setRotationPoint(45F, -44F, 90.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 239
		rightWingModel[20].setRotationPoint(24F, -32.5F, 62F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightWingModel[21].setRotationPoint(24F, -31F, 62F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 241
		rightWingModel[22].setRotationPoint(24F, -29F, 62F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 242
		rightWingModel[23].setRotationPoint(21F, -31F, 62F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 243
		rightWingModel[24].setRotationPoint(20F, -30.5F, 63F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 244
		rightWingModel[25].setRotationPoint(21F, -32.5F, 62F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 245
		rightWingModel[26].setRotationPoint(21F, -29.5F, 62F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 246
		rightWingModel[27].setRotationPoint(20F, -29.5F, 63F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 247
		rightWingModel[28].setRotationPoint(20F, -31.5F, 63F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 248
		rightWingModel[29].setRotationPoint(23F, -33F, 65F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 249
		rightWingModel[30].setRotationPoint(25F, -33F, 65F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 250
		rightWingModel[31].setRotationPoint(29F, -35F, 65F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 251
		rightWingModel[32].setRotationPoint(63F, -35F, 65F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 252
		rightWingModel[33].setRotationPoint(77F, -32.5F, 62F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 253
		rightWingModel[34].setRotationPoint(77F, -31F, 66F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightWingModel[35].setRotationPoint(77F, -31F, 62F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 255
		rightWingModel[36].setRotationPoint(77F, -28.5F, 62F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 256
		rightWingModel[37].setRotationPoint(23F, -33F, 62F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 257
		rightWingModel[38].setRotationPoint(25F, -33F, 62F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightWingModel[39].setRotationPoint(29F, -35F, 60F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightWingModel[40].setRotationPoint(63F, -35F, 60F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 260
		rightWingModel[41].setRotationPoint(23F, -29F, 62F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 261
		rightWingModel[42].setRotationPoint(25F, -29F, 62F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 262
		rightWingModel[43].setRotationPoint(29F, -30F, 60F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 263
		rightWingModel[44].setRotationPoint(63F, -30F, 60F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 264
		rightWingModel[45].setRotationPoint(63F, -30F, 65F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 265
		rightWingModel[46].setRotationPoint(29F, -30F, 65F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 266
		rightWingModel[47].setRotationPoint(25F, -29F, 65F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 267
		rightWingModel[48].setRotationPoint(23F, -29F, 65F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 268
		rightWingModel[49].setRotationPoint(44F, -30.5F, 88F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 53, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightWingModel[50].setRotationPoint(44F, -29F, 88F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 53, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 270
		rightWingModel[51].setRotationPoint(44F, -27F, 88F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 271
		rightWingModel[52].setRotationPoint(41F, -29F, 88F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 272
		rightWingModel[53].setRotationPoint(40F, -28.5F, 89F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Box 273
		rightWingModel[54].setRotationPoint(41F, -30.5F, 88F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F); // Box 274
		rightWingModel[55].setRotationPoint(41F, -27.5F, 88F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 275
		rightWingModel[56].setRotationPoint(40F, -27.5F, 89F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 276
		rightWingModel[57].setRotationPoint(40F, -29.5F, 89F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 277
		rightWingModel[58].setRotationPoint(43F, -31F, 91F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F); // Box 278
		rightWingModel[59].setRotationPoint(45F, -31F, 91F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 279
		rightWingModel[60].setRotationPoint(49F, -33F, 91F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 280
		rightWingModel[61].setRotationPoint(83F, -33F, 91F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 281
		rightWingModel[62].setRotationPoint(97F, -30.5F, 88F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 282
		rightWingModel[63].setRotationPoint(97F, -29F, 92F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		rightWingModel[64].setRotationPoint(97F, -29F, 88F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 284
		rightWingModel[65].setRotationPoint(97F, -26.5F, 88F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightWingModel[66].setRotationPoint(43F, -31F, 88F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 286
		rightWingModel[67].setRotationPoint(45F, -31F, 88F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightWingModel[68].setRotationPoint(49F, -33F, 86F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		rightWingModel[69].setRotationPoint(83F, -33F, 86F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 289
		rightWingModel[70].setRotationPoint(43F, -27F, 88F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 290
		rightWingModel[71].setRotationPoint(45F, -27F, 88F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 291
		rightWingModel[72].setRotationPoint(49F, -28F, 86F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F); // Box 292
		rightWingModel[73].setRotationPoint(83F, -28F, 86F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 293
		rightWingModel[74].setRotationPoint(83F, -28F, 91F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 294
		rightWingModel[75].setRotationPoint(49F, -28F, 91F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 295
		rightWingModel[76].setRotationPoint(45F, -27F, 91F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 296
		rightWingModel[77].setRotationPoint(43F, -27F, 91F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 82

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 69, 3, 54, 0F,-55F, 0F, 0F, 0F, 0F, -10F, -23F, 0F, 0F, 0F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, -10F, -23F, 0F, 0F, 0F, 0F, 0F); // Box 82
		pitchFlapLeftModel[0].setRotationPoint(131F, -33F, -83F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 289, 529, textureX, textureY); // Box 215

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 69, 3, 54, 0F,0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, -10F, -55F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, -10F, -55F, 0F, 0F); // Box 215
		pitchFlapRightModel[0].setRotationPoint(131F, -33F, 29F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 76
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Box 77

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 26, 9, 37, 0F,-9F, -5F, 0F, 0F, -6F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, -5F, -6F, 0F, 0F, -4F, 0F); // Box 76
		pitchFlapLeftWingModel[0].setRotationPoint(96F, -53F, -69F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 21, 7, 37, 0F,-9F, -4F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -1F, 0F, -4F, -5F, 0F, 0F, -3F, 0F); // Box 77
		pitchFlapLeftWingModel[1].setRotationPoint(105F, -48F, -106F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Box 209
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 729, 505, textureX, textureY); // Box 210

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 26, 9, 37, 0F,0F, 0F, 0F, -5F, -2F, 0F, 0F, -6F, 0F, -9F, -5F, 0F, 0F, -4F, 0F, -5F, -6F, 0F, 0F, -2F, 0F, -9F, 0F, 0F); // Box 209
		pitchFlapRightWingModel[0].setRotationPoint(96F, -53F, 32F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, 0F, 21, 7, 37, 0F,0F, 0F, 0F, -4F, -1F, 0F, 0F, -5F, 0F, -9F, -4F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, 0F, -1F, 0F, -9F, 0F, 0F); // Box 210
		pitchFlapRightWingModel[1].setRotationPoint(105F, -48F, 69F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 97
		bodyWheelModel[1] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 98
		bodyWheelModel[2] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 99
		bodyWheelModel[3] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 100
		bodyWheelModel[4] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Box 101
		bodyWheelModel[5] = new ModelRendererTurbo(this, 905, 193, textureX, textureY); // Box 102
		bodyWheelModel[6] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 103
		bodyWheelModel[7] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 104
		bodyWheelModel[8] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 231
		bodyWheelModel[9] = new ModelRendererTurbo(this, 689, 497, textureX, textureY); // Box 232
		bodyWheelModel[10] = new ModelRendererTurbo(this, 257, 537, textureX, textureY); // Box 233
		bodyWheelModel[11] = new ModelRendererTurbo(this, 841, 545, textureX, textureY); // Box 234
		bodyWheelModel[12] = new ModelRendererTurbo(this, 905, 553, textureX, textureY); // Box 235
		bodyWheelModel[13] = new ModelRendererTurbo(this, 905, 513, textureX, textureY); // Box 236
		bodyWheelModel[14] = new ModelRendererTurbo(this, 177, 369, textureX, textureY); // Box 237
		bodyWheelModel[15] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 238
		bodyWheelModel[16] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 297
		bodyWheelModel[17] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 298
		bodyWheelModel[18] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 299
		bodyWheelModel[19] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 300
		bodyWheelModel[20] = new ModelRendererTurbo(this, 985, 225, textureX, textureY); // Box 301
		bodyWheelModel[21] = new ModelRendererTurbo(this, 801, 241, textureX, textureY); // Box 302
		bodyWheelModel[22] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Box 303

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyWheelModel[0].setRotationPoint(29F, -13F, -24F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyWheelModel[1].setRotationPoint(20.5F, -4F, -34F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyWheelModel[2].setRotationPoint(20.5F, -11F, -34F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 100
		bodyWheelModel[3].setRotationPoint(20.5F, 3F, -34F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 101
		bodyWheelModel[4].setRotationPoint(12.5F, -28F, -40F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 48, 6, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 102
		bodyWheelModel[5].setRotationPoint(12.5F, -22F, -42F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 27, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyWheelModel[6].setRotationPoint(12.5F, -16F, -42F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 23, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyWheelModel[7].setRotationPoint(-69.5F, -17F, -10F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyWheelModel[8].setRotationPoint(29F, -13F, 20F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyWheelModel[9].setRotationPoint(20.5F, -4F, 24F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyWheelModel[10].setRotationPoint(20.5F, -11F, 24F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 234
		bodyWheelModel[11].setRotationPoint(20.5F, 3F, 24F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 48, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyWheelModel[12].setRotationPoint(12.5F, -28F, 32F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 48, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyWheelModel[13].setRotationPoint(12.5F, -22F, 38F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 27, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyWheelModel[14].setRotationPoint(12.5F, -16F, 40F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 23, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyWheelModel[15].setRotationPoint(-69.5F, -17F, 8F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyWheelModel[16].setRotationPoint(-72F, -13F, -2F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyWheelModel[17].setRotationPoint(-76F, 2F, -6F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyWheelModel[18].setRotationPoint(-76F, -2F, -6F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 300
		bodyWheelModel[19].setRotationPoint(-76F, 6F, -6F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyWheelModel[20].setRotationPoint(-76F, 2F, 2F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyWheelModel[21].setRotationPoint(-76F, -2F, 2F);

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 303
		bodyWheelModel[22].setRotationPoint(-76F, 6F, 2F);
	}
}