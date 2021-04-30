//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.08.2017 - 12:47:26
// Last changed on: 01.08.2017 - 12:47:26

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHe162 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelHe162() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[161];
		tailModel = new ModelRendererTurbo[12];
		leftWingModel = new ModelRendererTurbo[14];
		rightWingModel = new ModelRendererTurbo[14];
		bodyWheelModel = new ModelRendererTurbo[25];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 16
		bodyModel[10] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 22
		bodyModel[16] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 95
		bodyModel[56] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 96
		bodyModel[57] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 97
		bodyModel[58] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 98
		bodyModel[59] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 99
		bodyModel[60] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 100
		bodyModel[61] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 101
		bodyModel[62] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 102
		bodyModel[63] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Box 103
		bodyModel[64] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 104
		bodyModel[65] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 105
		bodyModel[66] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 106
		bodyModel[67] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 108
		bodyModel[68] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 109
		bodyModel[69] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 110
		bodyModel[70] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 112
		bodyModel[71] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 113
		bodyModel[72] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 114
		bodyModel[73] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 115
		bodyModel[74] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 116
		bodyModel[75] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 117
		bodyModel[76] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 118
		bodyModel[77] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 119
		bodyModel[78] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 120
		bodyModel[79] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 121
		bodyModel[80] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 122
		bodyModel[81] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 123
		bodyModel[82] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 124
		bodyModel[83] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 125
		bodyModel[84] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 126
		bodyModel[85] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 127
		bodyModel[86] = new ModelRendererTurbo(this, 961, 105, textureX, textureY); // Box 128
		bodyModel[87] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 129
		bodyModel[88] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 130
		bodyModel[89] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 131
		bodyModel[90] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 132
		bodyModel[91] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 133
		bodyModel[92] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 134
		bodyModel[93] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 135
		bodyModel[94] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 136
		bodyModel[95] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 137
		bodyModel[96] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 138
		bodyModel[97] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 139
		bodyModel[98] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 146
		bodyModel[99] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 147
		bodyModel[100] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 148
		bodyModel[101] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 149
		bodyModel[102] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 150
		bodyModel[103] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 151
		bodyModel[104] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 152
		bodyModel[105] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 153
		bodyModel[106] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 154
		bodyModel[107] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 155
		bodyModel[108] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 156
		bodyModel[109] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 157
		bodyModel[110] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 158
		bodyModel[111] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 189
		bodyModel[112] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 190
		bodyModel[113] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 191
		bodyModel[114] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 192
		bodyModel[115] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 193
		bodyModel[116] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 195
		bodyModel[117] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 196
		bodyModel[118] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 197
		bodyModel[119] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 198
		bodyModel[120] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 199
		bodyModel[121] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 200
		bodyModel[122] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 201
		bodyModel[123] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 202
		bodyModel[124] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 203
		bodyModel[125] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 204
		bodyModel[126] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 205
		bodyModel[127] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 206
		bodyModel[128] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 207
		bodyModel[129] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 208
		bodyModel[130] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 209
		bodyModel[131] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 210
		bodyModel[132] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 211
		bodyModel[133] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 212
		bodyModel[134] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 213
		bodyModel[135] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 215
		bodyModel[136] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 216
		bodyModel[137] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 222
		bodyModel[138] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 223
		bodyModel[139] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 224
		bodyModel[140] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 225
		bodyModel[141] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 226
		bodyModel[142] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 227
		bodyModel[143] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 228
		bodyModel[144] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 229
		bodyModel[145] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 230
		bodyModel[146] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 231
		bodyModel[147] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 232
		bodyModel[148] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Box 233
		bodyModel[149] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 234
		bodyModel[150] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 235
		bodyModel[151] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 236
		bodyModel[152] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 237
		bodyModel[153] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 238
		bodyModel[154] = new ModelRendererTurbo(this, 753, 129, textureX, textureY); // Box 239
		bodyModel[155] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 240
		bodyModel[156] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 241
		bodyModel[157] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 242
		bodyModel[158] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 243
		bodyModel[159] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 244
		bodyModel[160] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 250

		bodyModel[0].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[0].setRotationPoint(-103F, -11.5F, -0.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 36, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-3F, -14F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 36, 4, 20, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -1F); // Box 2
		bodyModel[2].setRotationPoint(-3F, -9F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 3, 18, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -3F); // Box 3
		bodyModel[3].setRotationPoint(-3F, -5F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 36, 1, 12, 0F,0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -3F); // Box 4
		bodyModel[4].setRotationPoint(-3F, -2F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 36, 5, 20, 0F,0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-3F, -19F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 36, 3, 16, 0F,0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-3F, -22F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 36, 2, 12, 0F,0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-3F, -24F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 52, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 15
		bodyModel[8].setRotationPoint(33F, -14F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 52, 3, 16, 0F,0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 16
		bodyModel[9].setRotationPoint(33F, -17F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 52, 2, 14, 0F,0F, 0F, -1F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 17
		bodyModel[10].setRotationPoint(33F, -19F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 52, 2, 12, 0F,0F, 0F, -4F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, 0F); // Box 18
		bodyModel[11].setRotationPoint(33F, -21F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 52, 3, 16, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -1F); // Box 19
		bodyModel[12].setRotationPoint(33F, -11F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 52, 2, 14, 0F,0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -2F); // Box 20
		bodyModel[13].setRotationPoint(33F, -8F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 52, 2, 10, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, -4F); // Box 21
		bodyModel[14].setRotationPoint(33F, -6F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 2, 8, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 22
		bodyModel[15].setRotationPoint(85F, -14F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 21, 2, 8, 0F,0F, 0F, -1F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F); // Box 23
		bodyModel[16].setRotationPoint(85F, -16F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F,0F, 0F, -1F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 1F); // Box 24
		bodyModel[17].setRotationPoint(85F, -17F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F,0F, 0F, 1F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -1F); // Box 25
		bodyModel[18].setRotationPoint(85F, -10F, -2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 21, 2, 8, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -1F); // Box 26
		bodyModel[19].setRotationPoint(85F, -12F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 36, 4, 22, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 27
		bodyModel[20].setRotationPoint(-39F, -14F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 36, 6, 20, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[21].setRotationPoint(-39F, -20F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 36, 3, 10, 0F,0F, 0F, -4F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F); // Box 30
		bodyModel[22].setRotationPoint(-39F, -27F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 36, 4, 22, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -1F); // Box 31
		bodyModel[23].setRotationPoint(-39F, -10F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 36, 3, 20, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, -3F); // Box 25
		bodyModel[24].setRotationPoint(-39F, -6F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 36, 1, 14, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, -4F); // Box 26
		bodyModel[25].setRotationPoint(-39F, -3F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 27
		bodyModel[26].setRotationPoint(-55F, -20F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-55F, -14F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 29
		bodyModel[28].setRotationPoint(-55F, -10F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -2F); // Box 30
		bodyModel[29].setRotationPoint(-55F, -6F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 1, 12, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 1F, -4F); // Box 31
		bodyModel[30].setRotationPoint(-55F, -4F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 6, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 32
		bodyModel[31].setRotationPoint(-55F, -20F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-55F, -14F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 34
		bodyModel[33].setRotationPoint(-55F, -10F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 16, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 35
		bodyModel[34].setRotationPoint(-71F, -6F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 1F, -4F); // Box 36
		bodyModel[35].setRotationPoint(-71F, -5F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 37
		bodyModel[36].setRotationPoint(-71F, -10F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 38
		bodyModel[37].setRotationPoint(-71F, -14F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(-71F, -19F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 40
		bodyModel[39].setRotationPoint(-71F, -10F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(-71F, -14F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(-71F, -19F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(-83F, -14F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(-83F, -17F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -1F); // Box 45
		bodyModel[44].setRotationPoint(-83F, -10F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 3, 6, 0F,0F, -2F, -2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(-83F, -18F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -1F); // Box 47
		bodyModel[46].setRotationPoint(-83F, -7F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F); // Box 48
		bodyModel[47].setRotationPoint(-83F, -6F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 49
		bodyModel[48].setRotationPoint(-89F, -13F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, 0F); // Box 50
		bodyModel[49].setRotationPoint(-89F, -15F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 1F, 0F); // Box 51
		bodyModel[50].setRotationPoint(-89F, -15F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, -1F, 0F); // Box 52
		bodyModel[51].setRotationPoint(-89F, -10F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, 0F); // Box 53
		bodyModel[52].setRotationPoint(-89F, -10F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1F, 0F); // Box 54
		bodyModel[53].setRotationPoint(-89F, -10F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 55
		bodyModel[54].setRotationPoint(-90F, -12F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 36, 9, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[55].setRotationPoint(-3F, -28F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 22, 9, 10, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 96
		bodyModel[56].setRotationPoint(33F, -25F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 1F); // Box 97
		bodyModel[57].setRotationPoint(55F, -24F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 7, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 98
		bodyModel[58].setRotationPoint(-21F, -28F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 7, 10, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 99
		bodyModel[59].setRotationPoint(-26F, -28F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 100
		bodyModel[60].setRotationPoint(-27F, -28F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 46, 5, 12, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 0F, 1F); // Box 101
		bodyModel[61].setRotationPoint(-14F, -40F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 46, 5, 12, 0F,0F, 0F, 1F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[62].setRotationPoint(-14F, -35F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 46, 3, 10, 0F,0F, 0F, -1F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 6F, 1F, 0F, 6F, 1F, 0F, 0F, 1F); // Box 103
		bodyModel[63].setRotationPoint(-14F, -43F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 46, 1, 6, 0F,0F, 0F, -2F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 7F, 1F, 0F, 7F, 1F, 0F, 0F, 1F); // Box 104
		bodyModel[64].setRotationPoint(-14F, -44F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 46, 2, 10, 0F,0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0F, -1F); // Box 105
		bodyModel[65].setRotationPoint(-14F, -30F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 106
		bodyModel[66].setRotationPoint(-22F, -40F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F); // Box 108
		bodyModel[67].setRotationPoint(-22F, -35F, -6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[68].setRotationPoint(-22F, -43F, -4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 110
		bodyModel[69].setRotationPoint(-22F, -40F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 112
		bodyModel[70].setRotationPoint(-22F, -43F, 1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[71].setRotationPoint(-22F, -44F, -4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 3F); // Box 114
		bodyModel[72].setRotationPoint(-22F, -31F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 115
		bodyModel[73].setRotationPoint(-22F, -35F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 116
		bodyModel[74].setRotationPoint(-22F, -31F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, -1F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 117
		bodyModel[75].setRotationPoint(-29F, -40F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, -2F); // Box 118
		bodyModel[76].setRotationPoint(-29F, -35F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 119
		bodyModel[77].setRotationPoint(-29F, -40F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, -1F, 0F); // Box 120
		bodyModel[78].setRotationPoint(-29F, -35F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, -3F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 2F, 0F, 0F, -1F); // Box 121
		bodyModel[79].setRotationPoint(-29F, -43F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -3F, 2F, 0F, 0F, -1F, 0F, -1F, 2F, 0F, -1F, 1F, 0F, 0F, -1F); // Box 122
		bodyModel[80].setRotationPoint(-29F, -43F, -4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, -0.875F, -4F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, -0.875F, -4F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F); // Box 123
		bodyModel[81].setRotationPoint(-29F, -41F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, 3F, 0F, -1F, 4F, 0F, -1F, -3F, 0F, -2F, -5F); // Box 124
		bodyModel[82].setRotationPoint(-29F, -31F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -1F, -3F, 0F, -1F, 4F, 0F, -2F, 3F); // Box 125
		bodyModel[83].setRotationPoint(-29F, -31F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 14, 6, 0F,0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F); // Box 126
		bodyModel[84].setRotationPoint(-23F, -41F, -3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -5F, 0F, 0F, 0F); // Box 127
		bodyModel[85].setRotationPoint(32F, -34F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 128
		bodyModel[86].setRotationPoint(32F, -30F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 129
		bodyModel[87].setRotationPoint(32F, -26F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, -1F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 130
		bodyModel[88].setRotationPoint(32F, -36F, -4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -1F, 0F, 0F, 2F); // Box 131
		bodyModel[89].setRotationPoint(32F, -36F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, -2.75F, -2F, 0F, -2.75F, -2F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 2F); // Box 132
		bodyModel[90].setRotationPoint(32F, -37F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -1F, 0F, 0F, 1F); // Box 133
		bodyModel[91].setRotationPoint(32F, -34F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 11, 4, 6, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 134
		bodyModel[92].setRotationPoint(32F, -30F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 135
		bodyModel[93].setRotationPoint(32F, -26F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 136
		bodyModel[94].setRotationPoint(31F, -30F, -1.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 137
		bodyModel[95].setRotationPoint(31F, -31F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F); // Box 138
		bodyModel[96].setRotationPoint(31F, -27F, -1.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 139
		bodyModel[97].setRotationPoint(31F, -31F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,1F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 1F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 146
		bodyModel[98].setRotationPoint(-55F, -24F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 3F, 0F); // Box 147
		bodyModel[99].setRotationPoint(-56F, -27F, 1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 148
		bodyModel[100].setRotationPoint(-56F, -27F, -1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,1F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 149
		bodyModel[101].setRotationPoint(-55F, -24F, 6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, -4F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 150
		bodyModel[102].setRotationPoint(-56F, -27F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-8F, 3F, 1F, 0F, 5F, 1F, 0F, 5F, -1F, -8F, 3F, -1F, 0F, 0F, 0F, 1F, -2F, 2F, 1F, -2F, -2F, 0F, 0F, 0F); // Box 151
		bodyModel[103].setRotationPoint(-71F, -18F, -5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 4F, -5F, 0F, 6F, -5F, 0F, 5F, 4F, 0F, 3F, 4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[104].setRotationPoint(-63F, -22F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[105].setRotationPoint(-63F, -26F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,-8F, 3F, -1F, 0F, 5F, -1F, 0F, 5F, 1F, -8F, 3F, 1F, 0F, 0F, 0F, 1F, -2F, -2F, 1F, -2F, 2F, 0F, 0F, 0F); // Box 154
		bodyModel[106].setRotationPoint(-71F, -18F, 4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 3F, 4F, 0F, 5F, 4F, 0F, 6F, -5F, 0F, 4F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[107].setRotationPoint(-63F, -22F, 5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 0F, 0F); // Box 156
		bodyModel[108].setRotationPoint(-71F, -19F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 1F, -3F, 0F, 8F, -4F, 0F, 7F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 157
		bodyModel[109].setRotationPoint(-71F, -18F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 2F, 0F, 7F, 3F, 0F, 8F, -4F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 158
		bodyModel[110].setRotationPoint(-71F, -18F, 4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[111].setRotationPoint(-71F, -9F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 11, 5, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[112].setRotationPoint(-69F, -14F, -3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[113].setRotationPoint(-66F, -16F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[114].setRotationPoint(-44F, -18F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[115].setRotationPoint(-48F, -18F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 195
		bodyModel[116].setRotationPoint(-56F, -18F, 6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[117].setRotationPoint(-44F, -18F, -8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[118].setRotationPoint(-48F, -18F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[119].setRotationPoint(-52F, -18F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 13, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[120].setRotationPoint(-56F, -18F, -8F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[121].setRotationPoint(-52F, -18F, 7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[122].setRotationPoint(-50F, -15F, 4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[123].setRotationPoint(-54F, -16F, 4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[124].setRotationPoint(-43F, -17F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 204
		bodyModel[125].setRotationPoint(-62F, -16F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[126].setRotationPoint(-62F, -20F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[127].setRotationPoint(-62F, -21F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[128].setRotationPoint(-61F, -20.2F, -2.2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[129].setRotationPoint(-61F, -20.2F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[130].setRotationPoint(-61F, -18F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[131].setRotationPoint(-61F, -18F, -2.2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[132].setRotationPoint(-61F, -19.6F, 2.2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[133].setRotationPoint(-61F, -18.4F, 2.2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[134].setRotationPoint(-61F, -17.2F, 2.2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[135].setRotationPoint(-61F, -18.4F, 3.4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[136].setRotationPoint(-61F, -17.2F, 3.4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[137].setRotationPoint(-61F, -20.2F, -4.4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[138].setRotationPoint(-61F, -17.5F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[139].setRotationPoint(-71F, -14.5F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[140].setRotationPoint(-60F, -14.5F, -5.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[141].setRotationPoint(-61F, -15F, 5.2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[142].setRotationPoint(-63F, -12F, 3.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 228
		bodyModel[143].setRotationPoint(-66F, -11F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[144].setRotationPoint(-65F, -10F, 4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[145].setRotationPoint(-65F, -10F, -5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 231
		bodyModel[146].setRotationPoint(-66F, -11F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[147].setRotationPoint(-63F, -12F, -5.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[148].setRotationPoint(-59F, -8F, 6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[149].setRotationPoint(-41F, -20F, -4F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[150].setRotationPoint(-41F, -24F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[151].setRotationPoint(-41F, -25F, -3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[152].setRotationPoint(-51F, -8F, -4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[153].setRotationPoint(-44F, -8F, -4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[154].setRotationPoint(-50F, -15F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[155].setRotationPoint(-54F, -15F, -7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[156].setRotationPoint(-54F, -16F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 242
		bodyModel[157].setRotationPoint(-52.5F, -18F, -6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 243
		bodyModel[158].setRotationPoint(-52.5F, -18F, -6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 36, 4, 16, 0F,0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[159].setRotationPoint(-39F, -24F, -8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[160].setRotationPoint(-56F, -14F, 0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 82
		tailModel[1] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 83
		tailModel[2] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 84
		tailModel[3] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 85
		tailModel[4] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 86
		tailModel[5] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 87
		tailModel[6] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 88
		tailModel[7] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 89
		tailModel[8] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 90
		tailModel[9] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 91
		tailModel[10] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 92
		tailModel[11] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 94

		tailModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -7F, 1F); // Box 82
		tailModel[0].setRotationPoint(86F, -16F, 0F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 28, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, -7F, 1F); // Box 83
		tailModel[1].setRotationPoint(95F, -16F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 28, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 6F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -8F, 1F); // Box 84
		tailModel[2].setRotationPoint(85F, -16F, 0F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 28, 0F,0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -7F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		tailModel[3].setRotationPoint(86F, -16F, -28F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 8, 2, 28, 0F,0F, 7F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 1F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 86
		tailModel[4].setRotationPoint(95F, -16F, -28F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 28, 0F,0F, 6F, 1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 1F, 0F, -7F, 1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 87
		tailModel[5].setRotationPoint(85F, -16F, -28F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 9, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 88
		tailModel[6].setRotationPoint(86F, -36F, -25F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 8, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 6F, 0F, 0F, -8F, 0F, 0F, -7F); // Box 89
		tailModel[7].setRotationPoint(95F, -36F, -25F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 9, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 90
		tailModel[8].setRotationPoint(86F, -36F, 23F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 8, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 6F, 0F, 0F, 7F); // Box 91
		tailModel[9].setRotationPoint(95F, -36F, 23F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -8F); // Box 92
		tailModel[10].setRotationPoint(84F, -36F, -25F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 6F); // Box 94
		tailModel[11].setRotationPoint(84F, -36F, 23F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 60
		leftWingModel[1] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 61
		leftWingModel[2] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 62
		leftWingModel[3] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 66
		leftWingModel[4] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 67
		leftWingModel[5] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 68
		leftWingModel[6] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 72
		leftWingModel[7] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 73
		leftWingModel[8] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 74
		leftWingModel[9] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 79
		leftWingModel[10] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 80
		leftWingModel[11] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 81
		leftWingModel[12] = new ModelRendererTurbo(this, 12, 155, textureX, textureY); // Box 252
		leftWingModel[13] = new ModelRendererTurbo(this, 236, 275, textureX, textureY); // Box 253

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftWingModel[0].setRotationPoint(-7F, -23F, -10F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 7, 5, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 61
		leftWingModel[1].setRotationPoint(-14F, -23F, -10F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 0F, 0F, 0F, -5F, 0F, 10F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftWingModel[2].setRotationPoint(9F, -23F, -10F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 7, 5, 38, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 66
		leftWingModel[3].setRotationPoint(-14F, -23F, -48F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 16, 5, 38, 0F,0F, 1F, 0F, -8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftWingModel[4].setRotationPoint(-7F, -23F, -48F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 12, 5, 38, 0F,8F, 1F, 0F, -6F, -2F, 0F, 10F, -5F, 0F, 0F, 0F, 0F, 8F, -3F, 0F, -6F, -3F, 0F, 10F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftWingModel[5].setRotationPoint(9F, -23F, -48F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 12, 5, 24, 0F,5F, 1F, 0F, -6F, -1F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 5F, -5F, 0F, -6F, -4F, 0F, 2F, -2F, 0F, 0F, -2F, 0F); // Box 72
		leftWingModel[6].setRotationPoint(1F, -24F, -72F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingModel[7].setRotationPoint(-7F, -24F, -72F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 24, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 74
		leftWingModel[8].setRotationPoint(-14F, -24F, -72F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, -4.8F, 0F, -7F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4.1F, -0.1F, -7F, 4.1F, -0.1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 79
		leftWingModel[9].setRotationPoint(-4F, -25F, -77F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -5F, 0F, 0F, -4.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.1F, 0F, 4.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftWingModel[10].setRotationPoint(-7F, -25F, -77F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,-3F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 4F, -0.1F, 0F, 4F, -0.1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 81
		leftWingModel[11].setRotationPoint(-14F, -25F, -77F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 100, 1, 100, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, -80F, 0F, 0F, -80F); // Box 252
		leftWingModel[12].setRotationPoint(11F, -21.8F, -59F);
		leftWingModel[12].rotateAngleX = 0.10471976F;
		leftWingModel[12].rotateAngleZ = -3.14159265F;

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 100, 100, 1, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, -80F, -80F, 0F, -80F, -80F, 0F, 0F, -80F, 0F); // Box 253
		leftWingModel[13].setRotationPoint(9F, -24.2F, -51F);
		leftWingModel[13].rotateAngleX = 1.58824962F;
		leftWingModel[13].rotateAngleZ = 3.14159265F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 57
		rightWingModel[1] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 58
		rightWingModel[2] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 59
		rightWingModel[3] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 63
		rightWingModel[4] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 64
		rightWingModel[5] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 65
		rightWingModel[6] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 69
		rightWingModel[7] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 70
		rightWingModel[8] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 71
		rightWingModel[9] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 75
		rightWingModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 76
		rightWingModel[11] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 77
		rightWingModel[12] = new ModelRendererTurbo(this, 12, 155, textureX, textureY); // Box 246
		rightWingModel[13] = new ModelRendererTurbo(this, 236, 275, textureX, textureY); // Box 249

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 16, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		rightWingModel[0].setRotationPoint(-7F, -23F, 0F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 7, 5, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 58
		rightWingModel[1].setRotationPoint(-14F, -23F, 0F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 0F, 0F, 10F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightWingModel[2].setRotationPoint(9F, -23F, 0F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 7, 5, 38, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F); // Box 63
		rightWingModel[3].setRotationPoint(-14F, -23F, 10F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 16, 5, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, 0F, -3F, 0F); // Box 64
		rightWingModel[4].setRotationPoint(-7F, -23F, 10F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 12, 5, 38, 0F,0F, 0F, 0F, 10F, -5F, 0F, -6F, -2F, 0F, 8F, 1F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -6F, -3F, 0F, 8F, -3F, 0F); // Box 65
		rightWingModel[5].setRotationPoint(9F, -23F, 10F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 12, 5, 24, 0F,0F, 0F, 0F, 2F, -3F, 0F, -6F, -1F, 0F, 5F, 1F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, -6F, -4F, 0F, 5F, -5F, 0F); // Box 69
		rightWingModel[6].setRotationPoint(1F, -24F, 48F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 0F, -3F, 0F); // Box 70
		rightWingModel[7].setRotationPoint(-7F, -24F, 48F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 7, 3, 24, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F); // Box 71
		rightWingModel[8].setRotationPoint(-14F, -24F, 48F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, -7F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -7F, 4F, 0F, 0F, 4F, 0F); // Box 75
		rightWingModel[9].setRotationPoint(-4F, -25F, 72F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 76
		rightWingModel[10].setRotationPoint(-7F, -25F, 72F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -3F, 4F, 0F); // Box 77
		rightWingModel[11].setRotationPoint(-14F, -25F, 72F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 100, 1, 100, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, -80F, 0F, 0F, -80F); // Box 246
		rightWingModel[12].setRotationPoint(10F, -19.8F, 37F);
		rightWingModel[12].rotateAngleX = -0.08726646F;
		rightWingModel[12].rotateAngleZ = -3.14159265F;

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 100, 100, 1, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, -80F, -80F, 0F, -80F, -80F, 0F, 0F, -80F, 0F); // Box 249
		rightWingModel[13].setRotationPoint(9F, -24F, 32F);
		rightWingModel[13].rotateAngleX = 1.55334303F;
		rightWingModel[13].rotateAngleZ = 3.10668607F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 159
		bodyWheelModel[1] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 160
		bodyWheelModel[2] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 161
		bodyWheelModel[3] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 162
		bodyWheelModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 163
		bodyWheelModel[5] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 164
		bodyWheelModel[6] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 168
		bodyWheelModel[7] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 169
		bodyWheelModel[8] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 170
		bodyWheelModel[9] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 171
		bodyWheelModel[10] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 172
		bodyWheelModel[11] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 173
		bodyWheelModel[12] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 174
		bodyWheelModel[13] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 175
		bodyWheelModel[14] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 176
		bodyWheelModel[15] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 177
		bodyWheelModel[16] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 178
		bodyWheelModel[17] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 181
		bodyWheelModel[18] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 182
		bodyWheelModel[19] = new ModelRendererTurbo(this, 657, 25, textureX, textureY); // Box 183
		bodyWheelModel[20] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 184
		bodyWheelModel[21] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 185
		bodyWheelModel[22] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 186
		bodyWheelModel[23] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 187
		bodyWheelModel[24] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 188

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 6F); // Box 159
		bodyWheelModel[0].setRotationPoint(15F, -11F, 8F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -13F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -1F, -13F, 0F, -1F); // Box 160
		bodyWheelModel[1].setRotationPoint(15F, -4F, 14F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -6F); // Box 161
		bodyWheelModel[2].setRotationPoint(15F, -11F, -9F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, -13F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 1F, -13F, 0F, 1F); // Box 162
		bodyWheelModel[3].setRotationPoint(15F, -4F, -15F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 163
		bodyWheelModel[4].setRotationPoint(15F, -6F, 5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyWheelModel[5].setRotationPoint(15F, 3F, 6F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 168
		bodyWheelModel[6].setRotationPoint(15F, -6F, -6F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyWheelModel[7].setRotationPoint(15F, 3F, -8F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyWheelModel[8].setRotationPoint(11F, 2F, -10F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyWheelModel[9].setRotationPoint(11F, -1F, -10F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 172
		bodyWheelModel[10].setRotationPoint(11F, 5F, -10F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyWheelModel[11].setRotationPoint(11F, 2F, 8F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyWheelModel[12].setRotationPoint(11F, -1F, 8F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 175
		bodyWheelModel[13].setRotationPoint(11F, 5F, 8F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyWheelModel[14].setRotationPoint(-80F, 2F, -1F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyWheelModel[15].setRotationPoint(-80F, 0F, -1F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 178
		bodyWheelModel[16].setRotationPoint(-80F, 5F, -1F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 181
		bodyWheelModel[17].setRotationPoint(-76F, 0F, -2F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 182
		bodyWheelModel[18].setRotationPoint(-76F, 0F, 1F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyWheelModel[19].setRotationPoint(-76F, -1F, -2F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 184
		bodyWheelModel[20].setRotationPoint(-74F, -6F, -1F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 185
		bodyWheelModel[21].setRotationPoint(-72F, -5F, -5F);

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyWheelModel[22].setRotationPoint(-72F, -2F, -6F);

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyWheelModel[23].setRotationPoint(-72F, 1F, -5F);

		bodyWheelModel[24].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 188
		bodyWheelModel[24].setRotationPoint(-81F, -2F, -6F);
	}
}