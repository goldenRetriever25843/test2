//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ME163
// Model Creator: 
// Created on: 27.07.2016 - 13:42:44
// Last changed on: 27.07.2016 - 13:42:44

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMe163 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMe163() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[153];
		tailModel = new ModelRendererTurbo[14];
		bayModel = new ModelRendererTurbo[2];
		leftWingModel = new ModelRendererTurbo[2];
		rightWingModel = new ModelRendererTurbo[2];
		yawFlapModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initbodyWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 37
		bodyModel[27] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 52
		bodyModel[38] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 54
		bodyModel[40] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 58
		bodyModel[42] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 59
		bodyModel[43] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 60
		bodyModel[44] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 61
		bodyModel[45] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 64
		bodyModel[46] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 65
		bodyModel[47] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 66
		bodyModel[48] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 67
		bodyModel[49] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 68
		bodyModel[50] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 71
		bodyModel[53] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 78
		bodyModel[58] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 79
		bodyModel[59] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 80
		bodyModel[60] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 82
		bodyModel[61] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 84
		bodyModel[63] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 85
		bodyModel[64] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 87
		bodyModel[66] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 89
		bodyModel[67] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 90
		bodyModel[68] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 91
		bodyModel[69] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 92
		bodyModel[70] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 93
		bodyModel[71] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 94
		bodyModel[72] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 95
		bodyModel[73] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 96
		bodyModel[74] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 103
		bodyModel[75] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 105
		bodyModel[76] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 106
		bodyModel[77] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 107
		bodyModel[78] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 108
		bodyModel[79] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 109
		bodyModel[80] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 96
		bodyModel[81] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 97
		bodyModel[82] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 100
		bodyModel[83] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 101
		bodyModel[84] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 102
		bodyModel[85] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 103
		bodyModel[86] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 104
		bodyModel[87] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 105
		bodyModel[88] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 106
		bodyModel[89] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 107
		bodyModel[90] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 109
		bodyModel[91] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 110
		bodyModel[92] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 111
		bodyModel[93] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 113
		bodyModel[94] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 114
		bodyModel[95] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 115
		bodyModel[96] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 116
		bodyModel[97] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 118
		bodyModel[98] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 119
		bodyModel[99] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 120
		bodyModel[100] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 121
		bodyModel[101] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 122
		bodyModel[102] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 123
		bodyModel[103] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 124
		bodyModel[104] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 128
		bodyModel[105] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 129
		bodyModel[106] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 130
		bodyModel[107] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 131
		bodyModel[108] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 132
		bodyModel[109] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 133
		bodyModel[110] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 134
		bodyModel[111] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 143
		bodyModel[112] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 144
		bodyModel[113] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 145
		bodyModel[114] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 146
		bodyModel[115] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 147
		bodyModel[116] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 148
		bodyModel[117] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 149
		bodyModel[118] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 150
		bodyModel[119] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 151
		bodyModel[120] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 152
		bodyModel[121] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 153
		bodyModel[122] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 154
		bodyModel[123] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 157
		bodyModel[124] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 159
		bodyModel[125] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 160
		bodyModel[126] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 161
		bodyModel[127] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 162
		bodyModel[128] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 163
		bodyModel[129] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 164
		bodyModel[130] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 165
		bodyModel[131] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 166
		bodyModel[132] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 167
		bodyModel[133] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 169
		bodyModel[134] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 170
		bodyModel[135] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 171
		bodyModel[136] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 172
		bodyModel[137] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 173
		bodyModel[138] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 181
		bodyModel[139] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 182
		bodyModel[140] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 183
		bodyModel[141] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 184
		bodyModel[142] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 185
		bodyModel[143] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 186
		bodyModel[144] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 187
		bodyModel[145] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 188
		bodyModel[146] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 189
		bodyModel[147] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 190
		bodyModel[148] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 191
		bodyModel[149] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 192
		bodyModel[150] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 193
		bodyModel[151] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 194
		bodyModel[152] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 195

		bodyModel[0].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-23F, -35F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, -2F, 0F, 1F, 0F); // Box 1
		bodyModel[1].setRotationPoint(4F, -33F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, 0F, 0F, -8.75F, 0F, 0F, -9F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 8.75F, 0F, 0F, 9F, -2F, 0F, 2F, 0F); // Box 2
		bodyModel[2].setRotationPoint(31F, -29F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-23F, -35F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 27, 1, 5, 0F,0F, -1F, 0F, 0F, -6F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 6F, -2F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(4F, -33F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, -2F, 0F, 0F, -9F, -2F, 0F, -8.75F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 9F, -2F, 0F, 8.75F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(31F, -29F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 27, 4, 1, 0F,0F, 0F, 0F, 0F, -5F, 2F, 0F, -4F, -3F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, 0F, 3F); // Box 7
		bodyModel[6].setRotationPoint(4F, -31F, 5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, -7F, 2F, 0F, -6F, -3F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 4F, 2F, 0F, 4F, -2F, 0F, 0F, 3F); // Box 8
		bodyModel[7].setRotationPoint(31F, -26F, 3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 27, 4, 1, 0F,0F, 1F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 3F, 0F, 2F, 3F, 0F, 2F, -3F, 4F, 0F, -3F); // Box 9
		bodyModel[8].setRotationPoint(-23F, -33F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 27, 4, 1, 0F,0F, 1F, -1F, 0F, -4F, -3F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 4F, 1F, 0F, 4F, -1F, 0F, 0F, -3F); // Box 10
		bodyModel[9].setRotationPoint(4F, -31F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 1F, -1F, 0F, -6F, -3F, 0F, -7F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 4F, -2F, 0F, 4F, 2F, 0F, 0F, -3F); // Box 11
		bodyModel[10].setRotationPoint(31F, -26F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F); // Box 14
		bodyModel[11].setRotationPoint(4F, -27F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, -4F, 5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 4.5F, 0F, 2F, -4.5F, 0F, 0F, 2F); // Box 15
		bodyModel[12].setRotationPoint(31F, -23F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 32, 7, 1, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, -2F); // Box 16
		bodyModel[13].setRotationPoint(-28F, -29F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F); // Box 17
		bodyModel[14].setRotationPoint(4F, -27F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, 5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -4.5F, 0F, 2F, 4.5F, 0F, 0F, -2F); // Box 18
		bodyModel[15].setRotationPoint(31F, -23F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 19
		bodyModel[16].setRotationPoint(-28F, -22F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 27, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(4F, -21F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 27, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(4F, -21F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 32, 6, 1, 0F,0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, -3F, 3F, 0F, -4F, 4F, 0F, -3F, -5F, 0F, -2F, -4F); // Box 26
		bodyModel[19].setRotationPoint(-28F, -10F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -5F, 5F, 0F, -4F, -6F, 0F, -1F, -5F); // Box 27
		bodyModel[20].setRotationPoint(4F, -12F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 32, 6, 1, 0F,0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, -2F, -4F, 0F, -3F, -5F, 0F, -4F, 4F, 0F, -3F, 3F); // Box 29
		bodyModel[21].setRotationPoint(-28F, -10F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -4F, -6F, 0F, -5F, 5F, 0F, -2F, 4F); // Box 30
		bodyModel[22].setRotationPoint(4F, -12F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 32, 10, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F); // Box 32
		bodyModel[23].setRotationPoint(-28F, -22F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 3F, 0F); // Box 33
		bodyModel[24].setRotationPoint(-28F, -7F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 35
		bodyModel[25].setRotationPoint(4F, -8F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 32, 1, 4, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 37
		bodyModel[26].setRotationPoint(-28F, -7F, 3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 38
		bodyModel[27].setRotationPoint(4F, -8F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[28].setRotationPoint(-28F, -4F, -3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[29].setRotationPoint(4F, -6F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 32, 1, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[30].setRotationPoint(-28F, -4F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[31].setRotationPoint(4F, -6F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[32].setRotationPoint(62F, -20F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[33].setRotationPoint(62F, -19F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[34].setRotationPoint(62F, -20F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 49
		bodyModel[35].setRotationPoint(62F, -19F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 8, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[36].setRotationPoint(44F, -51F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 29, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 8F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -5F, -2F); // Box 52
		bodyModel[37].setRotationPoint(39F, -51F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 53
		bodyModel[38].setRotationPoint(44F, -55F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-2F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 54
		bodyModel[39].setRotationPoint(39F, -55F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F,0F, 0F, -2F, -2F, -2F, -2F, -2F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 55
		bodyModel[40].setRotationPoint(52F, -55F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 27, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, 1F, -1F, 4F, 0F, -3F, 0F, 2F, -3F, 0F, 2F, 3F, 4F, 0F, 3F); // Box 58
		bodyModel[41].setRotationPoint(-23F, -33F, 5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 32, 7, 1, 0F,-1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 2F); // Box 59
		bodyModel[42].setRotationPoint(-28F, -29F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, -2F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, 1F, -2F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 60
		bodyModel[43].setRotationPoint(-41F, -29F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 6F, 0F, -2F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, -2F, 3F); // Box 61
		bodyModel[44].setRotationPoint(-51F, -27F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 15, 7, 1, 0F,0F, -2F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, -2F, 0F, -2F, -2F, 0F, 2F, 0F, 0F, 1F); // Box 64
		bodyModel[45].setRotationPoint(-41F, -29F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,-1F, 0F, 6F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -6F, -1F, -2F, 3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -2F, -3F); // Box 65
		bodyModel[46].setRotationPoint(-51F, -27F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 4F); // Box 66
		bodyModel[47].setRotationPoint(-51F, -27F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F); // Box 67
		bodyModel[48].setRotationPoint(-41F, -22F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,-1F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, -5F, 2F); // Box 68
		bodyModel[49].setRotationPoint(-51F, -24F, 5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 69
		bodyModel[50].setRotationPoint(-43F, -4F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 70
		bodyModel[51].setRotationPoint(-56F, -8F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 4.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 4.75F, -1F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -4.75F, -1F); // Box 71
		bodyModel[52].setRotationPoint(-64F, -11F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 72
		bodyModel[53].setRotationPoint(-43F, -4F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 73
		bodyModel[54].setRotationPoint(-56F, -8F, -2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 4F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, -2F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, -2F); // Box 75
		bodyModel[55].setRotationPoint(-43F, -4F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,-2F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, -2F, 0F, 0F, 0F, -3F, 3F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, -2F, -4F); // Box 76
		bodyModel[56].setRotationPoint(-43F, -12F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 4F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 5F, -3F, 0F, -4F, 1F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -5F, -3F); // Box 78
		bodyModel[57].setRotationPoint(-56F, -8F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, -1F, 1F, 2F, -4F, -1F, 2F, -4F, 1F, 0F, -1F, -1F, 0F, 0F, 3F, 0F, 4F, 2F, 0F, 5F, -3F, 0F, 1F, -4F); // Box 79
		bodyModel[58].setRotationPoint(-56F, -16F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 1F, 10F, 4F, -1F, 10F, 4F, 1F, 0F, 1F, -1F); // Box 80
		bodyModel[59].setRotationPoint(-56F, -19F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 5F, -3F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 4F, 1F, 0F, -5F, -3F, 0F, -1F, -2F, 0F, 0F, 1F, 0F, -4F, 1F); // Box 82
		bodyModel[60].setRotationPoint(-56F, -8F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, -1F, -1F, 2F, -4F, 1F, 2F, -4F, -1F, 0F, -1F, 1F, 0F, 1F, -4F, 0F, 5F, -3F, 0F, 4F, 2F, 0F, 0F, 3F); // Box 83
		bodyModel[61].setRotationPoint(-56F, -16F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 10F, 4F, 1F, 10F, 4F, -1F, 0F, 1F, 1F); // Box 84
		bodyModel[62].setRotationPoint(-56F, -19F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F); // Box 85
		bodyModel[63].setRotationPoint(-41F, -22F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 5F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, -5F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 86
		bodyModel[64].setRotationPoint(-43F, -4F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,-2F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, -2F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -3F, 3F); // Box 87
		bodyModel[65].setRotationPoint(-43F, -12F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, -4F, -1F, 0F, 4F, -1F, 0F); // Box 89
		bodyModel[66].setRotationPoint(-51F, -27F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 3.75F, 2F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 4.75F, -4F, 0F, -3.75F, 2F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -4.75F, -4F); // Box 90
		bodyModel[67].setRotationPoint(-64F, -12F, 3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 2F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, -1F, -2F, 0F, 0.25F, 2F, 0F, 4F, 0F, 0F, 5F, -1F, 0F, 1.25F, -3F); // Box 91
		bodyModel[68].setRotationPoint(-64F, -18F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 2F, -3F, 0F, 2F, 3F, 0F, 0F, -1F); // Box 92
		bodyModel[69].setRotationPoint(-64F, -19F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 4.75F, -1F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 4.5F, 0F, 0F, -4.75F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F); // Box 93
		bodyModel[70].setRotationPoint(-64F, -11F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 4.75F, -4F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 3.75F, 2F, 0F, -4.75F, -4F, 0F, -1F, -2F, 0F, 0F, 1F, 0F, -3.75F, 2F); // Box 94
		bodyModel[71].setRotationPoint(-64F, -12F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, -2F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, -1F, 2F, 0F, 1.25F, -3F, 0F, 5F, -1F, 0F, 4F, 0F, 0F, 0.25F, 2F); // Box 95
		bodyModel[72].setRotationPoint(-64F, -18F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, 0F, 1F); // Box 96
		bodyModel[73].setRotationPoint(-64F, -19F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 32, 6, 10, 0F,0F, 4F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[74].setRotationPoint(-20F, -22F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 13, 6, 10, 0F,8F, -2F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 8F, -3F, -1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 105
		bodyModel[75].setRotationPoint(-33F, -22F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, 3F, 0F, 10F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 106
		bodyModel[76].setRotationPoint(12F, -18F, 9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 32, 6, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F); // Box 107
		bodyModel[77].setRotationPoint(-20F, -22F, -19F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 13, 6, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 8F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 8F, -3F, -1F); // Box 108
		bodyModel[78].setRotationPoint(-33F, -22F, -19F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 10F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 10F, -3F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[79].setRotationPoint(12F, -18F, -19F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -1F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 96
		bodyModel[80].setRotationPoint(-56F, -24F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.25F, 0F, -1F, 0F, 0F, 3F, -1F, 2F, 0F, -2.25F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 1F, 0F, 1F, 0F); // Box 97
		bodyModel[81].setRotationPoint(-56F, -25F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -1F, 1F, 0F, 2F, -2F, 0F, 1.75F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 100
		bodyModel[82].setRotationPoint(-64F, -21F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, -1.25F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 101
		bodyModel[83].setRotationPoint(-56F, -24F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -2.25F, 1F, 3F, -1F, 2F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 4F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[84].setRotationPoint(-56F, -25F, -4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.25F, 0F, 0F, 3.75F, 0F, 0F, 1.75F, 4F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -4F, 0F, 0F, -3F, 3F, 0F, 0F, 0F); // Box 103
		bodyModel[85].setRotationPoint(-64F, -21F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -2F, 0F, 1.75F, 2F, 0F, 2F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 104
		bodyModel[86].setRotationPoint(-64F, -21F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 1.75F, 4F, 0F, 3.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -4F, 0F, 0F, -0.25F, 0F); // Box 105
		bodyModel[87].setRotationPoint(-64F, -21F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 106
		bodyModel[88].setRotationPoint(-67F, -19F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 107
		bodyModel[89].setRotationPoint(-67F, -19F, 2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F); // Box 109
		bodyModel[90].setRotationPoint(-67F, -21F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 110
		bodyModel[91].setRotationPoint(-67F, -21F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F); // Box 111
		bodyModel[92].setRotationPoint(-67F, -16F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 2F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 113
		bodyModel[93].setRotationPoint(-67F, -16F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[94].setRotationPoint(-67F, -21F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 115
		bodyModel[95].setRotationPoint(-67F, -21F, 1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -1F, 0F, -2F, -2F); // Box 116
		bodyModel[96].setRotationPoint(-67F, -17F, 1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -0.75F, -1F, 0F, 0.25F, 0F, 0F, -2F, 0F); // Box 118
		bodyModel[97].setRotationPoint(-67F, -17F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[98].setRotationPoint(-68F, -19.5F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[99].setRotationPoint(-68F, -19.5F, -1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 121
		bodyModel[100].setRotationPoint(-68F, -19.5F, 0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 122
		bodyModel[101].setRotationPoint(-69F, -19.5F, -0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 123
		bodyModel[102].setRotationPoint(-69F, -19.5F, -1.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 124
		bodyModel[103].setRotationPoint(-69F, -19.5F, 0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 22, 4, 6, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 128
		bodyModel[104].setRotationPoint(-29F, -4F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 49, 1, 4, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[105].setRotationPoint(-7F, 0F, -2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 49, 4, 6, 0F,0F, 1F, 1F, 0F, 8F, 1F, 0F, 8F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, -1F); // Box 130
		bodyModel[106].setRotationPoint(-7F, -4F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 131
		bodyModel[107].setRotationPoint(-36F, -5F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, -1F); // Box 132
		bodyModel[108].setRotationPoint(-43F, -7F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[109].setRotationPoint(-48F, -9F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -2F, -1F); // Box 134
		bodyModel[110].setRotationPoint(-48F, -8F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 143
		bodyModel[111].setRotationPoint(-45F, -32F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.2F, 0F, -4F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1.3F, 0F, 3F, -1.7F); // Box 144
		bodyModel[112].setRotationPoint(-45F, -31F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[113].setRotationPoint(-45F, -32F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -4F, -0.6F, 0F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1.7F, 0F, 3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[114].setRotationPoint(-45F, -31F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 22, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[115].setRotationPoint(-23F, -34F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[116].setRotationPoint(-23F, -33F, 5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 22, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[117].setRotationPoint(-23F, -34F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 21, 4, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[118].setRotationPoint(-23F, -33F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 31, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[119].setRotationPoint(-52F, -13F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 152
		bodyModel[120].setRotationPoint(-48F, -13F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 31, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[121].setRotationPoint(-52F, -13F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[122].setRotationPoint(-48F, -13F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[123].setRotationPoint(-51F, -20F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, -1F, 0F, 0F, 0F, -5F, 2F, 0F, 2F, 3F, 0F, 2F, -3F, 0F, -5F, -2F); // Box 159
		bodyModel[124].setRotationPoint(-51F, -24F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[125].setRotationPoint(-52F, -13F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 161
		bodyModel[126].setRotationPoint(-52F, -13F, 5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[127].setRotationPoint(-51F, -20F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[128].setRotationPoint(-51F, -24F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[129].setRotationPoint(-51F, -27F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[130].setRotationPoint(-51F, -24F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[131].setRotationPoint(-51F, -27F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[132].setRotationPoint(-50F, -27F, -3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 169
		bodyModel[133].setRotationPoint(-50F, -27F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 170
		bodyModel[134].setRotationPoint(-45F, -26F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[135].setRotationPoint(-45F, -26F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 172
		bodyModel[136].setRotationPoint(-47F, -18F, 2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 173
		bodyModel[137].setRotationPoint(-47F, -18F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[138].setRotationPoint(-36F, -14F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[139].setRotationPoint(-36F, -14F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[140].setRotationPoint(-36F, -15F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[141].setRotationPoint(-27F, -15F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 185
		bodyModel[142].setRotationPoint(-26F, -28F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 186
		bodyModel[143].setRotationPoint(-27F, -28F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 187
		bodyModel[144].setRotationPoint(-27F, -28F, 4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[145].setRotationPoint(-36F, -16F, 4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[146].setRotationPoint(-27F, -14F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[147].setRotationPoint(-27F, -14F, 4F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[148].setRotationPoint(-36F, -16F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 22, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[149].setRotationPoint(-44F, -19F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 22, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[150].setRotationPoint(-44F, -19F, 5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[151].setRotationPoint(-44.8F, -26F, -6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[152].setRotationPoint(-44.8F, -26F, 4F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 28
		tailModel[1] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 31
		tailModel[2] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 36
		tailModel[3] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 39
		tailModel[4] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 42
		tailModel[5] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 45
		tailModel[6] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 135
		tailModel[7] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 136
		tailModel[8] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 137
		tailModel[9] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 138
		tailModel[10] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 139
		tailModel[11] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 140
		tailModel[12] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 141
		tailModel[13] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 142

		tailModel[0].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, 3F, 5.5F, 0F, 3F, -5.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, 5.5F, 0F, -5F, -6F, 0F, 1F, -3F); // Box 28
		tailModel[0].setRotationPoint(31F, -14F, 7F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, 3F, -5.5F, 0F, 3F, 5.5F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -5F, -6F, 0F, -6F, 5.5F, 0F, 0F, 2F); // Box 31
		tailModel[1].setRotationPoint(31F, -14F, -8F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, 0F, 0F, 6F, -3.5F, 0F, 5F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -5F, 2F, 0F, 2F, 0F); // Box 36
		tailModel[2].setRotationPoint(31F, -11F, -5F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, -2F, 0F, 0F, 5F, 2F, 0F, 6F, -3.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, 2F, 0F, -6F, -3F, 0F, 0F, 0F); // Box 39
		tailModel[3].setRotationPoint(31F, -11F, 3F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, 0F, 0F, 7F, -2F, 0F, 6.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -6.75F, 0F, 0F, 0F, 0F); // Box 42
		tailModel[4].setRotationPoint(31F, -9F, -3F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, 0F, 0F, 6.75F, 0F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.75F, 0F, 0F, -7F, -2F, 0F, 0F, 0F); // Box 45
		tailModel[5].setRotationPoint(31F, -9F, 0F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 1F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 135
		tailModel[6].setRotationPoint(42F, -11F, -3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 11, 5, 6, 0F,0F, 2F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -1F); // Box 136
		tailModel[7].setRotationPoint(47F, -11F, -3F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		tailModel[8].setRotationPoint(42F, -6F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 138
		tailModel[9].setRotationPoint(47F, -6F, -2F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		tailModel[10].setRotationPoint(58F, -3F, -1F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		tailModel[11].setRotationPoint(58F, -14F, -1F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 141
		tailModel[12].setRotationPoint(60F, -3F, -1F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 2, 11, 2, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 142
		tailModel[13].setRotationPoint(60F, -14F, -1F);
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 21
		bayModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24

		bayModel[0].addShapeBox(0F, 0F, 0F, 33, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 6.5F, 0F, -2F, -6.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 6.5F, 0F, -3F, -6.5F, 0F, 0F, -1F); // Box 21
		bayModel[0].setRotationPoint(31F, -20F, 8F);

		bayModel[1].addShapeBox(0F, 0F, 0F, 33, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, -6.5F, 0F, -2F, 6.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -6.5F, 0F, -3F, 6.5F, 0F, 0F, 1F); // Box 24
		bayModel[1].setRotationPoint(31F, -20F, -9F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 100
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 101

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 32, 6, 81, 0F,-34F, -2F, 0F, 17F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -34F, -2F, 0F, 17F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftWingModel[0].setRotationPoint(-20F, -22F, -100F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 13, 6, 81, 0F,-42F, -3F, 0F, 34F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -42F, -3F, 0F, 34F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 101
		leftWingModel[1].setRotationPoint(-33F, -22F, -100F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 97
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 98

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 32, 6, 81, 0F,0F, 0F, 0F, 0F, -4F, 0F, 17F, -3F, 0F, -34F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 17F, -2F, 0F, -34F, -2F, 0F); // Box 97
		rightWingModel[0].setRotationPoint(-20F, -22F, 19F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 13, 6, 81, 0F,0F, -3F, 0F, 0F, 0F, 0F, 34F, -2F, 0F, -42F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 34F, -2F, 0F, -42F, -3F, 0F); // Box 98
		rightWingModel[1].setRotationPoint(-33F, -22F, 19F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 56

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 8, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 2F, -1F, 3F, 2F, -1F, 0F, 0F, 1F); // Box 56
		yawFlapModel[0].setRotationPoint(52F, -51F, -1F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 99

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 81, 0F,0F, 0F, 0F, 0F, -1F, 0F, 12F, 0F, 0F, -17F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 12F, -2F, 0F, -17F, -2F, 0F); // Box 99
		pitchFlapRightModel[0].setRotationPoint(12F, -18F, 19F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 102

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 81, 0F,-17F, 1F, 0F, 12F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -17F, -2F, 0F, 12F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 102
		pitchFlapLeftWingModel[0].setRotationPoint(12F, -18F, -100F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 125
		bodyWheelModel[1] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 126
		bodyWheelModel[2] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 127
		bodyWheelModel[3] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 174
		bodyWheelModel[4] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 175
		bodyWheelModel[5] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 176
		bodyWheelModel[6] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 177
		bodyWheelModel[7] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 178
		bodyWheelModel[8] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 179

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyWheelModel[0].setRotationPoint(-29F, 0F, -2F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 126
		bodyWheelModel[1].setRotationPoint(-36F, -1F, -2F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 127
		bodyWheelModel[2].setRotationPoint(-43F, -4F, -2F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 174
		bodyWheelModel[3].setRotationPoint(-43F, -2F, -2F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 175
		bodyWheelModel[4].setRotationPoint(-36F, 1F, -2F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 22, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyWheelModel[5].setRotationPoint(-29F, 2F, -2F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyWheelModel[6].setRotationPoint(-37F, -3F, -1F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyWheelModel[7].setRotationPoint(-23F, -2F, -1F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyWheelModel[8].setRotationPoint(-11F, -2F, -1F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-67F, -18F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 34, 122, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 34, 122, textureX, textureY);
		prop[0].addBox(-0.5F, -5F, -0.5F, 1, 5, 1, 0.0F);
		prop[1].addBox(-0.5F, -5F, -0.5F, 1, 5, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}