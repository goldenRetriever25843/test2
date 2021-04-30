//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.07.2016 - 16:54:27
// Last changed on: 20.07.2016 - 16:54:27

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSopwith extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelSopwith() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[145];
		tailModel = new ModelRendererTurbo[17];
		leftWingModel = new ModelRendererTurbo[21];
		rightWingModel = new ModelRendererTurbo[20];
		yawFlapModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];
		pitchFlapRightWingModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 769, 9, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 513, 25, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 889, 25, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 65
		bodyModel[60] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 66
		bodyModel[61] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 132
		bodyModel[63] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 133
		bodyModel[64] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 134
		bodyModel[65] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 135
		bodyModel[66] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 136
		bodyModel[67] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 137
		bodyModel[68] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 138
		bodyModel[69] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 139
		bodyModel[70] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 140
		bodyModel[71] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 141
		bodyModel[72] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 142
		bodyModel[73] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 143
		bodyModel[74] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 144
		bodyModel[75] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 145
		bodyModel[76] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 146
		bodyModel[77] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 147
		bodyModel[78] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 148
		bodyModel[79] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 149
		bodyModel[80] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 150
		bodyModel[81] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 151
		bodyModel[82] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 152
		bodyModel[83] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 153
		bodyModel[84] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 154
		bodyModel[85] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 155
		bodyModel[86] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 156
		bodyModel[87] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 157
		bodyModel[88] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 158
		bodyModel[89] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 159
		bodyModel[90] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 160
		bodyModel[91] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 161
		bodyModel[92] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 162
		bodyModel[93] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 163
		bodyModel[94] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 164
		bodyModel[95] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 165
		bodyModel[96] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 166
		bodyModel[97] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 167
		bodyModel[98] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 168
		bodyModel[99] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 169
		bodyModel[100] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 170
		bodyModel[101] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 171
		bodyModel[102] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 172
		bodyModel[103] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 173
		bodyModel[104] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 174
		bodyModel[105] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 175
		bodyModel[106] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 176
		bodyModel[107] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 177
		bodyModel[108] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 178
		bodyModel[109] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 179
		bodyModel[110] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 180
		bodyModel[111] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 181
		bodyModel[112] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 182
		bodyModel[113] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 183
		bodyModel[114] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 184
		bodyModel[115] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 185
		bodyModel[116] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 186
		bodyModel[117] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 187
		bodyModel[118] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 188
		bodyModel[119] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 189
		bodyModel[120] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 190
		bodyModel[121] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 191
		bodyModel[122] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 192
		bodyModel[123] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 193
		bodyModel[124] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 194
		bodyModel[125] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 195
		bodyModel[126] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 196
		bodyModel[127] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 197
		bodyModel[128] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 198
		bodyModel[129] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 199
		bodyModel[130] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 200
		bodyModel[131] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 201
		bodyModel[132] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 202
		bodyModel[133] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 203
		bodyModel[134] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 204
		bodyModel[135] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 205
		bodyModel[136] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 206
		bodyModel[137] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 207
		bodyModel[138] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 208
		bodyModel[139] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 209
		bodyModel[140] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 210
		bodyModel[141] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 211
		bodyModel[142] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 212
		bodyModel[143] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 213
		bodyModel[144] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 214

		bodyModel[0].addShapeBox(0F, 0F, 0F, 39, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-50F, -39F, 8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[1].setRotationPoint(-60F, -39F, 8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(-67F, -42F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 25, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 7
		bodyModel[3].setRotationPoint(-67F, -42F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 8
		bodyModel[4].setRotationPoint(-67F, -37F, 11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[5].setRotationPoint(-67F, -43F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 10
		bodyModel[6].setRotationPoint(-67F, -17F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[7].setRotationPoint(-70F, -43F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-70F, -43F, 3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 4F, -3F); // Box 13
		bodyModel[9].setRotationPoint(-70F, -42F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -1F); // Box 14
		bodyModel[10].setRotationPoint(-70F, -21F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-70F, -20F, 3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-70F, -20F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 17
		bodyModel[13].setRotationPoint(-70F, -32F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -3F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 18
		bodyModel[14].setRotationPoint(-70F, -37F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 19
		bodyModel[15].setRotationPoint(-70F, -27F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0.5F, 1F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-29F, -45F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 1.5F, 1F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-29F, -44F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F,0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 1F, 6F, -4F, 1.6F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 6F, 3F, 0.6F); // Box 22
		bodyModel[18].setRotationPoint(-30F, -43F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 2F, 0F); // Box 23
		bodyModel[19].setRotationPoint(-60F, -45F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 1.5F, -1F, 0F, 0F, -2F, 1F, 0F, 1F, 0F, 0.5F, 0F, 0F, 1.5F, 1F, 0F, 0F, 2F, 1F); // Box 24
		bodyModel[20].setRotationPoint(-60F, -44F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -1F, 0F, 0.5F, 0F, 1F, 6F, -4F, 0.6F, 0F, -4F, 1F, 0F, 1F, 0F, 0.5F, 0F, 1F, 6F, 3F, -0.4F, 0F, 3F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-60F, -43F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, -2F, 2F, 0F, -3F, 2F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-60F, -37F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-60F, -32F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -3F, 2F, 0F, -1F, -4F, 0F, 0F, -2F); // Box 28
		bodyModel[24].setRotationPoint(-60F, -27F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 3F, -3F); // Box 29
		bodyModel[25].setRotationPoint(-60F, -42F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 30
		bodyModel[26].setRotationPoint(-60F, -22F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[27].setRotationPoint(-60F, -19F, 4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[28].setRotationPoint(-60F, -18F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 39, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 33
		bodyModel[29].setRotationPoint(-50F, -19F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 39, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[30].setRotationPoint(-50F, -18F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 39, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-50F, -39F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[32].setRotationPoint(-60F, -39F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 7, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(-67F, -42F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 25, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[34].setRotationPoint(-67F, -42F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 15, 2, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[35].setRotationPoint(-67F, -37F, -13F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[36].setRotationPoint(-67F, -43F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[37].setRotationPoint(-67F, -17F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[38].setRotationPoint(-70F, -43F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[39].setRotationPoint(-70F, -43F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[40].setRotationPoint(-70F, -42F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 4F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 47
		bodyModel[41].setRotationPoint(-70F, -21F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[42].setRotationPoint(-70F, -20F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[43].setRotationPoint(-70F, -20F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 50
		bodyModel[44].setRotationPoint(-70F, -32F, -13F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -3F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 51
		bodyModel[45].setRotationPoint(-70F, -37F, -13F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -3F, 2F); // Box 52
		bodyModel[46].setRotationPoint(-70F, -27F, -13F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 1, 3, 0F,0.5F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[47].setRotationPoint(-29F, -45F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,1.5F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 1.5F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F); // Box 54
		bodyModel[48].setRotationPoint(-29F, -44F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 19, 1, 2, 0F,6F, -4F, 1.6F, 0F, -4F, 1F, 0F, -1F, 0F, 0.5F, 0F, 0F, 6F, 3F, 0.6F, 0F, 3F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[49].setRotationPoint(-30F, -43F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, -2F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 56
		bodyModel[50].setRotationPoint(-60F, -45F, -3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -2F, 1F, 1.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 1F, 1.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F); // Box 57
		bodyModel[51].setRotationPoint(-60F, -44F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -4F, 1F, 6F, -4F, 0.6F, 0.5F, 0F, 1F, 0F, -1F, 0F, 0F, 3F, 0F, 6F, 3F, -0.4F, 0.5F, 0F, 1F, 0F, 1F, 0F); // Box 58
		bodyModel[52].setRotationPoint(-60F, -43F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, -2F, 0F, -1F, -4F, 0F, -3F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 59
		bodyModel[53].setRotationPoint(-60F, -37F, -13F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 60
		bodyModel[54].setRotationPoint(-60F, -32F, -13F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -3F, 2F, 0F, -2F, 2F); // Box 61
		bodyModel[55].setRotationPoint(-60F, -27F, -13F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 4, 5, 0F,0F, -5F, 0F, 0F, -6F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[56].setRotationPoint(-60F, -42F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[57].setRotationPoint(-60F, -22F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 64
		bodyModel[58].setRotationPoint(-60F, -19F, -9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[59].setRotationPoint(-60F, -18F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 39, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 66
		bodyModel[60].setRotationPoint(-50F, -19F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 39, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[61].setRotationPoint(-50F, -18F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -6F, 8F, 0F, -6F, 8F, 0F, 6F, -8F, 0F, 6F); // Box 132
		bodyModel[62].setRotationPoint(-59F, -19F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, -6F, -14F, 0F, -6F, -14F, 0F, 6F, 14F, 0F, 6F); // Box 133
		bodyModel[63].setRotationPoint(-37F, -19F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[64].setRotationPoint(-51F, 0F, 14F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[65].setRotationPoint(-50.5F, 0.5F, -14F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 6F, 8F, 0F, 6F, 8F, 0F, -6F, -8F, 0F, -6F); // Box 136
		bodyModel[66].setRotationPoint(-59F, -19F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 6F, -14F, 0F, 6F, -14F, 0F, -6F, 14F, 0F, -6F); // Box 137
		bodyModel[67].setRotationPoint(-37F, -19F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[68].setRotationPoint(-51F, 0F, -16F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[69].setRotationPoint(-55F, -4F, -18F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[70].setRotationPoint(-55F, -7F, -18F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[71].setRotationPoint(-55F, -8F, -18F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 142
		bodyModel[72].setRotationPoint(-55F, 9F, -18F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[73].setRotationPoint(-55F, 6F, -18F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[74].setRotationPoint(-58F, -4F, -18F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[75].setRotationPoint(-45F, -4F, -18F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 146
		bodyModel[76].setRotationPoint(-59F, -4F, -18F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[77].setRotationPoint(-42F, -4F, -18F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[78].setRotationPoint(-58F, -7F, -18F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[79].setRotationPoint(-45F, -7F, -18F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[80].setRotationPoint(-45F, 6F, -18F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F); // Box 151
		bodyModel[81].setRotationPoint(-58F, 6F, -18F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[82].setRotationPoint(-55F, -4F, 16F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[83].setRotationPoint(-55F, -7F, 16F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[84].setRotationPoint(-55F, -8F, 16F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 155
		bodyModel[85].setRotationPoint(-55F, 9F, 16F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[86].setRotationPoint(-55F, 6F, 16F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[87].setRotationPoint(-58F, -4F, 16F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[88].setRotationPoint(-45F, -4F, 16F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 159
		bodyModel[89].setRotationPoint(-59F, -4F, 16F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[90].setRotationPoint(-42F, -4F, 16F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[91].setRotationPoint(-58F, -7F, 16F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[92].setRotationPoint(-45F, -7F, 16F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[93].setRotationPoint(-45F, 6F, 16F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F); // Box 164
		bodyModel[94].setRotationPoint(-58F, 6F, 16F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F,-4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[95].setRotationPoint(-56F, -5F, -20F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F); // Box 166
		bodyModel[96].setRotationPoint(-56F, -5F, 18F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[97].setRotationPoint(-69F, -32F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[98].setRotationPoint(-69F, -39F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[99].setRotationPoint(-69F, -26F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[100].setRotationPoint(-69F, -30F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[101].setRotationPoint(-69F, -30F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 172
		bodyModel[102].setRotationPoint(-69F, -36F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[103].setRotationPoint(-69F, -36F, 3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[104].setRotationPoint(-69F, -24F, 3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 175
		bodyModel[105].setRotationPoint(-69F, -24F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[106].setRotationPoint(-74F, -31F, -2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[107].setRotationPoint(-50F, -39F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[108].setRotationPoint(-50F, -42F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[109].setRotationPoint(-50F, -43F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[110].setRotationPoint(-46F, -43F, -5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[111].setRotationPoint(-46F, -42F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[112].setRotationPoint(-46F, -39F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[113].setRotationPoint(-46F, -44F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 26, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[114].setRotationPoint(-50F, -22F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 17, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[115].setRotationPoint(-29F, -39F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[116].setRotationPoint(-29F, -42F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[117].setRotationPoint(-29F, -43F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[118].setRotationPoint(-29F, -44F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[119].setRotationPoint(-43F, -31F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 190
		bodyModel[120].setRotationPoint(-43F, -34F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 191
		bodyModel[121].setRotationPoint(-43F, -34F, 0.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[122].setRotationPoint(-43F, -35F, -1.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[123].setRotationPoint(-40F, -23F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[124].setRotationPoint(-31F, -29F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[125].setRotationPoint(-40F, -25F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[126].setRotationPoint(-40F, -25F, 6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[127].setRotationPoint(-67F, -45F, 2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[128].setRotationPoint(-67F, -46F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 199
		bodyModel[129].setRotationPoint(-67F, -43F, 2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[130].setRotationPoint(-67F, -45F, 1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 201
		bodyModel[131].setRotationPoint(-67F, -45F, 4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[132].setRotationPoint(-67F, -45F, -4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[133].setRotationPoint(-67F, -46F, -4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 204
		bodyModel[134].setRotationPoint(-67F, -43F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 205
		bodyModel[135].setRotationPoint(-67F, -45F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[136].setRotationPoint(-67F, -45F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[137].setRotationPoint(-67.5F, -44.5F, -3.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[138].setRotationPoint(-67.5F, -44.5F, 2.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[139].setRotationPoint(-53F, -45F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[140].setRotationPoint(-53F, -45F, 2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[141].setRotationPoint(-45.7F, -40F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[142].setRotationPoint(-45.7F, -40F, 3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[143].setRotationPoint(-45.7F, -37F, 3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[144].setRotationPoint(-45.7F, -42F, -1F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 17
		tailModel[2] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 18
		tailModel[3] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 19
		tailModel[4] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 35
		tailModel[5] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 36
		tailModel[6] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 68
		tailModel[7] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 69
		tailModel[8] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 70
		tailModel[9] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 71
		tailModel[10] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 72
		tailModel[11] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 73
		tailModel[12] = new ModelRendererTurbo(this, 665, 121, textureX, textureY); // Box 125
		tailModel[13] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 126
		tailModel[14] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 128
		tailModel[15] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 129
		tailModel[16] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 131

		tailModel[0].addShapeBox(0F, 0F, 0F, 70, 20, 1, 0F,0F, 0F, 0F, 0F, -3F, 7F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 7F, 0F, -9F, -7F, 0F, 0F, 0F); // Box 0
		tailModel[0].setRotationPoint(-11F, -39F, 7F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, 2F, 0F, 0F, -4F, 4F, 0F, -4F, -6F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, 3F, 4F, 0F, 3F, -7F, 0F, 0F, 0F); // Box 17
		tailModel[1].setRotationPoint(-11F, -40F, 5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, 1F, 0F, 0F, -5F, 3F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 3F, 0F, 5F, -4F, 0F, 0F, 0F); // Box 18
		tailModel[2].setRotationPoint(-11F, -42F, 3F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 1F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F, -3F, 0F, 0F, 0F); // Box 19
		tailModel[3].setRotationPoint(-11F, -43F, 0F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, -1F, 0F, 0F, 9F, 4F, 0F, 9F, -8F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -9F, 4F, 0F, -10F, -7F, 0F, -1F, 0F); // Box 35
		tailModel[4].setRotationPoint(-11F, -19F, 4F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, -4F, 0F, 0F, 0F); // Box 36
		tailModel[5].setRotationPoint(-11F, -18F, 0F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 70, 20, 1, 0F,0F, 0F, 0F, 0F, -3F, -7F, 0F, -3F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -7F, 0F, -9F, 7F, 0F, 0F, 0F); // Box 68
		tailModel[6].setRotationPoint(-11F, -39F, -8F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, -1F, 1F, 0F, -4F, -6F, 0F, -4F, 4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, -7F, 0F, 3F, 4F, 0F, -2F, 0F); // Box 69
		tailModel[7].setRotationPoint(-11F, -40F, -7F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, 0F, 0F, 0F, -6F, -4F, 0F, -5F, 3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 5F, -4F, 0F, 5F, 3F, 0F, -1F, 0F); // Box 70
		tailModel[8].setRotationPoint(-11F, -42F, -5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 70, 1, 3, 0F,0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 5F, -3F, 0F, 5F, 0F, 0F, -1F, 0F); // Box 71
		tailModel[9].setRotationPoint(-11F, -43F, -3F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, 0F, -1F, 0F, 9F, -8F, 0F, 9F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -10F, -7F, 0F, -9F, 4F, 0F, 1F, 0F); // Box 72
		tailModel[10].setRotationPoint(-11F, -19F, -8F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, 0F, 0F, 0F, 10F, -4F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -4F, 0F, -10F, 0F, 0F, 0F, 0F); // Box 73
		tailModel[11].setRotationPoint(-11F, -18F, -4F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 11, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		tailModel[12].setRotationPoint(48F, -36F, -29F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 27, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 126
		tailModel[13].setRotationPoint(46F, -36F, -29F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 128
		tailModel[14].setRotationPoint(48F, -36F, 0F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 27, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 129
		tailModel[15].setRotationPoint(46F, -36F, 2F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 131
		tailModel[16].setRotationPoint(55F, -28F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 89
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 90
		leftWingModel[2] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 91
		leftWingModel[3] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Box 92
		leftWingModel[4] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 93
		leftWingModel[5] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 94
		leftWingModel[6] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 95
		leftWingModel[7] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 96
		leftWingModel[8] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 98
		leftWingModel[9] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 100
		leftWingModel[10] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 101
		leftWingModel[11] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 102
		leftWingModel[12] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 106
		leftWingModel[13] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 107
		leftWingModel[14] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 108
		leftWingModel[15] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 110
		leftWingModel[16] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 111
		leftWingModel[17] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 115
		leftWingModel[18] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 116
		leftWingModel[19] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 117
		leftWingModel[20] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 121

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 18, 3, 63, 0F,0F, 5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		leftWingModel[0].setRotationPoint(-31F, -23F, -71F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 62, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 90
		leftWingModel[1].setRotationPoint(-49F, -23F, -71F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 62, 0F,0F, 4F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 91
		leftWingModel[2].setRotationPoint(-51F, -23F, -71F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 87, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92
		leftWingModel[3].setRotationPoint(-62F, -64F, -96F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 87, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftWingModel[4].setRotationPoint(-60F, -64F, -96F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 62, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94
		leftWingModel[5].setRotationPoint(-42F, -64F, -71F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 18, 3, 25, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftWingModel[6].setRotationPoint(-49F, -28F, -96F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 25, 0F,0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 96
		leftWingModel[7].setRotationPoint(-51F, -28F, -96F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 18, 3, 12, 0F,-13F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		leftWingModel[8].setRotationPoint(-49F, -30F, -108F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-13F, 0F, 0F, 13F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -13F, -2F, 0F, 13F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 100
		leftWingModel[9].setRotationPoint(-51F, -30F, -108F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-13F, -1F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -13F, -1F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 101
		leftWingModel[10].setRotationPoint(-62F, -64F, -108F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 18, 3, 12, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		leftWingModel[11].setRotationPoint(-60F, -64F, -108F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 18, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		leftWingModel[12].setRotationPoint(-60F, -64F, -9F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 107
		leftWingModel[13].setRotationPoint(-62F, -64F, -9F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 18, 3, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -10F, -1F, 0F, 0F, 0F, 0F); // Box 108
		leftWingModel[14].setRotationPoint(-42F, -64F, -9F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftWingModel[15].setRotationPoint(-60F, -64F, -2F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 111
		leftWingModel[16].setRotationPoint(-62F, -64F, -2F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 115
		leftWingModel[17].setRotationPoint(-41F, -61F, -80F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 116
		leftWingModel[18].setRotationPoint(-56F, -61F, -80F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 12F); // Box 117
		leftWingModel[19].setRotationPoint(-56F, -61F, -18F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 12F); // Box 121
		leftWingModel[20].setRotationPoint(-37F, -61F, -21F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 74
		rightWingModel[1] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 75
		rightWingModel[2] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 76
		rightWingModel[3] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 78
		rightWingModel[4] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 79
		rightWingModel[5] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 80
		rightWingModel[6] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 81
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 82
		rightWingModel[8] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 84
		rightWingModel[9] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 86
		rightWingModel[10] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 87
		rightWingModel[11] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 88
		rightWingModel[12] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 103
		rightWingModel[13] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 104
		rightWingModel[14] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 105
		rightWingModel[15] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 109
		rightWingModel[16] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 113
		rightWingModel[17] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 114
		rightWingModel[18] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 118
		rightWingModel[19] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 119

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 18, 3, 63, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F); // Box 74
		rightWingModel[0].setRotationPoint(-31F, -23F, 8F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 62, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 75
		rightWingModel[1].setRotationPoint(-49F, -23F, 9F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 62, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F); // Box 76
		rightWingModel[2].setRotationPoint(-51F, -23F, 9F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 87, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 78
		rightWingModel[3].setRotationPoint(-62F, -64F, 9F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 87, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		rightWingModel[4].setRotationPoint(-60F, -64F, 9F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 62, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 80
		rightWingModel[5].setRotationPoint(-42F, -64F, 9F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 18, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 81
		rightWingModel[6].setRotationPoint(-49F, -28F, 71F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 25, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F); // Box 82
		rightWingModel[7].setRotationPoint(-51F, -28F, 71F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 18, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -13F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -13F, -1F, 0F); // Box 84
		rightWingModel[8].setRotationPoint(-49F, -30F, 96F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 13F, 1F, 0F, -13F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 13F, -1F, 0F, -13F, -2F, 0F); // Box 86
		rightWingModel[9].setRotationPoint(-51F, -30F, 96F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, -1F, 0F); // Box 87
		rightWingModel[10].setRotationPoint(-62F, -64F, 96F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 18, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F); // Box 88
		rightWingModel[11].setRotationPoint(-60F, -64F, 96F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 18, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightWingModel[12].setRotationPoint(-60F, -64F, 2F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 104
		rightWingModel[13].setRotationPoint(-62F, -64F, 2F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 18, 3, 7, 0F,0F, 0F, 0F, -10F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 105
		rightWingModel[14].setRotationPoint(-42F, -64F, 2F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, -10F, -1F, 0F, 0F, 0F, 0F); // Box 109
		rightWingModel[15].setRotationPoint(-42F, -64F, -2F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 113
		rightWingModel[16].setRotationPoint(-41F, -61F, 79F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 2, 33, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F); // Box 114
		rightWingModel[17].setRotationPoint(-56F, -61F, 79F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 2, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 118
		rightWingModel[18].setRotationPoint(-56F, -61F, 17F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 2, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 119
		rightWingModel[19].setRotationPoint(-37F, -61F, 20F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 122
		yawFlapModel[1] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 123
		yawFlapModel[2] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 124

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 7, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		yawFlapModel[0].setRotationPoint(59F, -53F, -1F);

		yawFlapModel[1].addShapeBox(7F, 0F, 0F, 7, 26, 2, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, 0F, 0F); // Box 123
		yawFlapModel[1].setRotationPoint(59F, -53F, -1F);

		yawFlapModel[2].addShapeBox(-16F, 0F, 0F, 16, 14, 2, 0F,0F, -10F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F); // Box 124
		yawFlapModel[2].setRotationPoint(59F, -53F, -1F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 127

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 11, 2, 28, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, 0F, 4F); // Box 127
		pitchFlapLeftModel[0].setRotationPoint(59F, -36F, -33F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 130

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 11, 2, 28, 0F,0F, 0F, 4F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 130
		pitchFlapRightModel[0].setRotationPoint(59F, -36F, 5F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 97
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 99

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 18, 3, 37, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 97
		pitchFlapLeftWingModel[0].setRotationPoint(-42F, -64F, -108F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 37, 0F,0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 99
		pitchFlapLeftWingModel[1].setRotationPoint(-31F, -28F, -108F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 83
		pitchFlapRightWingModel[1] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 85

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 18, 3, 37, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 83
		pitchFlapRightWingModel[0].setRotationPoint(-42F, -64F, 71F);

		pitchFlapRightWingModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 37, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F); // Box 85
		pitchFlapRightWingModel[1].setRotationPoint(-31F, -28F, 71F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-73F, -29F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 216, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 216, textureX, textureY);
		prop[0].addBox(-0.5F, -27F, -2F, 1, 27, 4, 0.0F);
		prop[1].addBox(-0.5F, -27F, -2F, 1, 27, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}