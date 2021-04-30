//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.01.2017 - 17:26:05
// Last changed on: 20.01.2017 - 17:26:05

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM56 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM56() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[180];
		barrelModel = new ModelRendererTurbo[34];
		leftTrackWheelModels = new ModelRendererTurbo[14];
		rightTrackWheelModels = new ModelRendererTurbo[14];

		initbodyModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 17
		bodyModel[5] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 18
		bodyModel[6] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 20
		bodyModel[8] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 67
		bodyModel[54] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 68
		bodyModel[55] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 69
		bodyModel[56] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 70
		bodyModel[57] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 71
		bodyModel[58] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 72
		bodyModel[59] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 73
		bodyModel[60] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 74
		bodyModel[61] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 75
		bodyModel[62] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 76
		bodyModel[63] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 77
		bodyModel[64] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 78
		bodyModel[65] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 79
		bodyModel[66] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 80
		bodyModel[67] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 81
		bodyModel[68] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 82
		bodyModel[69] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 83
		bodyModel[70] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 84
		bodyModel[71] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 85
		bodyModel[72] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 86
		bodyModel[73] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 87
		bodyModel[74] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 89
		bodyModel[76] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 93
		bodyModel[80] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 96
		bodyModel[83] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 97
		bodyModel[84] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 98
		bodyModel[85] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 99
		bodyModel[86] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 100
		bodyModel[87] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 101
		bodyModel[88] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 129
		bodyModel[92] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 130
		bodyModel[93] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 131
		bodyModel[94] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 132
		bodyModel[95] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 133
		bodyModel[96] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 134
		bodyModel[97] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 135
		bodyModel[98] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 136
		bodyModel[99] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 123
		bodyModel[100] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 124
		bodyModel[101] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 125
		bodyModel[102] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 126
		bodyModel[103] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 159
		bodyModel[104] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 160
		bodyModel[105] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 161
		bodyModel[106] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 163
		bodyModel[107] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 164
		bodyModel[108] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 165
		bodyModel[109] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 165
		bodyModel[110] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 166
		bodyModel[111] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 167
		bodyModel[112] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 168
		bodyModel[113] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 169
		bodyModel[114] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 170
		bodyModel[115] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 171
		bodyModel[116] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 172
		bodyModel[117] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 173
		bodyModel[118] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 174
		bodyModel[119] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 175
		bodyModel[120] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 175
		bodyModel[121] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 176
		bodyModel[122] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 181
		bodyModel[123] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 186
		bodyModel[124] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 187
		bodyModel[125] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 188
		bodyModel[126] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 185
		bodyModel[127] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 186
		bodyModel[128] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 187
		bodyModel[129] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 188
		bodyModel[130] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 189
		bodyModel[131] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 190
		bodyModel[132] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 191
		bodyModel[133] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 192
		bodyModel[134] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 193
		bodyModel[135] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 194
		bodyModel[136] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 195
		bodyModel[137] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 196
		bodyModel[138] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 197
		bodyModel[139] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 198
		bodyModel[140] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 199
		bodyModel[141] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 200
		bodyModel[142] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 201
		bodyModel[143] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 202
		bodyModel[144] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 203
		bodyModel[145] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 204
		bodyModel[146] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 205
		bodyModel[147] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 206
		bodyModel[148] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 207
		bodyModel[149] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 208
		bodyModel[150] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 209
		bodyModel[151] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 210
		bodyModel[152] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 211
		bodyModel[153] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 212
		bodyModel[154] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 213
		bodyModel[155] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 214
		bodyModel[156] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 215
		bodyModel[157] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 216
		bodyModel[158] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 217
		bodyModel[159] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 218
		bodyModel[160] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 219
		bodyModel[161] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 220
		bodyModel[162] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 221
		bodyModel[163] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 222
		bodyModel[164] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 223
		bodyModel[165] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 224
		bodyModel[166] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 225
		bodyModel[167] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 226
		bodyModel[168] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 227
		bodyModel[169] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 228
		bodyModel[170] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 229
		bodyModel[171] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 230
		bodyModel[172] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 231
		bodyModel[173] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 232
		bodyModel[174] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 233
		bodyModel[175] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 234
		bodyModel[176] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 235
		bodyModel[177] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 236
		bodyModel[178] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 237
		bodyModel[179] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 238

		bodyModel[0].addBox(0F, 0F, 0F, 69, 6, 28, 0F); // Box 13
		bodyModel[0].setRotationPoint(-31F, -4F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 15, 3, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[1].setRotationPoint(38F, -5F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[2].setRotationPoint(38F, -2F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 11, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[3].setRotationPoint(38F, 0F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[4].setRotationPoint(38F, -10F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 16, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[5].setRotationPoint(38F, -6F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 6, 28, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[6].setRotationPoint(37F, -16F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 17, 15, 28, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[7].setRotationPoint(20F, -19F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 39, 8, 1, 0F); // Box 21
		bodyModel[8].setRotationPoint(-1F, -12F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 39, 8, 1, 0F); // Box 22
		bodyModel[9].setRotationPoint(-1F, -12F, 20F);

		bodyModel[10].addBox(0F, 0F, 0F, 13, 8, 28, 0F); // Box 23
		bodyModel[10].setRotationPoint(-14F, -12F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 60, 3, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(-15F, -14F, -18F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 8, 11, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-33F, -12F, -18F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(-37F, -5F, -18F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[14].setRotationPoint(45F, -14F, -18F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 28
		bodyModel[15].setRotationPoint(49F, -13F, -18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[16].setRotationPoint(51F, -12F, -18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 30
		bodyModel[17].setRotationPoint(52F, -11F, -18F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[18].setRotationPoint(53F, -10F, -18F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 32
		bodyModel[19].setRotationPoint(54F, -9F, -18F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(34F, -14F, -19F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(45F, -14F, -19F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(49F, -13F, -19F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[23].setRotationPoint(51F, -12F, -19F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[24].setRotationPoint(52F, -11F, -19F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[25].setRotationPoint(53F, -10F, -19F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(54F, -9F, -19F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 40
		bodyModel[27].setRotationPoint(54F, -9F, 21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 41
		bodyModel[28].setRotationPoint(53F, -10F, 21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 42
		bodyModel[29].setRotationPoint(52F, -11F, 21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 43
		bodyModel[30].setRotationPoint(51F, -12F, 21F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		bodyModel[31].setRotationPoint(49F, -13F, 21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 45
		bodyModel[32].setRotationPoint(45F, -14F, 21F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 60, 3, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[33].setRotationPoint(-15F, -14F, 21F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 18, 8, 11, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[34].setRotationPoint(-33F, -12F, 21F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[35].setRotationPoint(-37F, -5F, 21F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[36].setRotationPoint(45F, -14F, 32F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[37].setRotationPoint(34F, -14F, 32F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[38].setRotationPoint(49F, -13F, 32F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[39].setRotationPoint(51F, -12F, 32F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[40].setRotationPoint(52F, -11F, 32F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(53F, -10F, 32F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[42].setRotationPoint(54F, -9F, 32F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 34, 0F); // Box 56
		bodyModel[43].setRotationPoint(-9F, -13F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 17, 8, 0, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(-31F, -12F, 21F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 17, 8, 0, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[45].setRotationPoint(-31F, -12F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 60, 5, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[46].setRotationPoint(-13F, -12F, 21F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[47].setRotationPoint(-17F, -8F, 21F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[48].setRotationPoint(-23F, -7F, 21F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[49].setRotationPoint(-26F, -6F, 21F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[50].setRotationPoint(-29F, -5F, 21F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[51].setRotationPoint(-30F, -4F, 21F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[52].setRotationPoint(-31F, -3F, 21F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 67
		bodyModel[53].setRotationPoint(-31F, -1F, 21F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 68
		bodyModel[54].setRotationPoint(-30F, 2F, 21F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 69
		bodyModel[55].setRotationPoint(-28F, 4F, 21F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 70
		bodyModel[56].setRotationPoint(-19F, 6F, 21F);

		bodyModel[57].addBox(0F, 0F, 0F, 47, 1, 11, 0F); // Box 71
		bodyModel[57].setRotationPoint(-12F, 7F, 21F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[58].setRotationPoint(35F, 6F, 21F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 10, 11, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[59].setRotationPoint(39F, -3F, 21F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[60].setRotationPoint(49F, -4F, 21F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[61].setRotationPoint(50F, -7F, 21F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 76
		bodyModel[62].setRotationPoint(47F, -12F, 21F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 77
		bodyModel[63].setRotationPoint(49F, -11F, 21F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[64].setRotationPoint(54F, -9F, 21F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 10, 11, 0F,0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[65].setRotationPoint(39F, -3F, -18F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[66].setRotationPoint(49F, -4F, -18F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[67].setRotationPoint(50F, -7F, -18F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 82
		bodyModel[68].setRotationPoint(49F, -11F, -18F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 83
		bodyModel[69].setRotationPoint(47F, -12F, -18F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 60, 5, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[70].setRotationPoint(-13F, -12F, -18F);

		bodyModel[71].addBox(0F, 0F, 0F, 47, 1, 11, 0F); // Box 85
		bodyModel[71].setRotationPoint(-12F, 7F, -18F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[72].setRotationPoint(35F, 6F, -18F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[73].setRotationPoint(-17F, -8F, -18F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[74].setRotationPoint(-23F, -7F, -18F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[75].setRotationPoint(-26F, -6F, -18F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[76].setRotationPoint(-29F, -5F, -18F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[77].setRotationPoint(-30F, -4F, -18F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[78].setRotationPoint(-31F, -3F, -18F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 93
		bodyModel[79].setRotationPoint(-31F, -1F, -18F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 94
		bodyModel[80].setRotationPoint(-30F, 2F, -18F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 3, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 95
		bodyModel[81].setRotationPoint(-28F, 4F, -18F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 96
		bodyModel[82].setRotationPoint(-19F, 6F, -18F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[83].setRotationPoint(9F, -3F, 21F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 98
		bodyModel[84].setRotationPoint(9F, -2F, 21F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[85].setRotationPoint(25F, -3F, 21F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 100
		bodyModel[86].setRotationPoint(25F, -2F, 21F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[87].setRotationPoint(42F, -3F, 21F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		bodyModel[88].setRotationPoint(42F, -2F, 21F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[89].setRotationPoint(-22F, -3F, 21F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 104
		bodyModel[90].setRotationPoint(-22F, -2F, 21F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[91].setRotationPoint(9F, -3F, -12F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 130
		bodyModel[92].setRotationPoint(9F, -2F, -12F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[93].setRotationPoint(-22F, -3F, -12F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 132
		bodyModel[94].setRotationPoint(-22F, -2F, -12F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[95].setRotationPoint(25F, -3F, -12F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 134
		bodyModel[96].setRotationPoint(25F, -2F, -12F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[97].setRotationPoint(42F, -3F, -12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 136
		bodyModel[98].setRotationPoint(42F, -2F, -12F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 12, 12, 12, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[99].setRotationPoint(2F, -15F, 0F);

		bodyModel[100].addBox(-5F, 0F, -5F, 7, 5, 8, 0F); // Box 124
		bodyModel[100].setRotationPoint(10F, -20F, 7F);

		bodyModel[101].addBox(-5F, 0F, -5F, 7, 2, 2, 0F); // Box 125
		bodyModel[101].setRotationPoint(10F, -22F, 7F);

		bodyModel[102].addBox(-5F, 0F, 2F, 7, 2, 1, 0F); // Box 126
		bodyModel[102].setRotationPoint(10F, -22F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 159
		bodyModel[103].setRotationPoint(10F, -20F, 19F);

		bodyModel[104].addBox(0F, 0F, 0F, 5, 7, 28, 0F); // Box 160
		bodyModel[104].setRotationPoint(15F, -19F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[105].setRotationPoint(10F, -23F, 16F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 163
		bodyModel[106].setRotationPoint(10F, -22F, 16F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 164
		bodyModel[107].setRotationPoint(10F, -22F, 22F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 165
		bodyModel[108].setRotationPoint(10F, -20F, 16F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[109].setRotationPoint(54F, -12F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[110].setRotationPoint(54F, -12F, 17F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 4, 10, 0F,0F, 0F, 0F, -12F, 0F, 0F, 0F, -4F, 0F, -12F, -4F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 167
		bodyModel[111].setRotationPoint(42F, -16F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 13, 4, 10, 0F,-12F, -4F, 0F, 0F, -4F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[112].setRotationPoint(42F, -16F, -4F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 169
		bodyModel[113].setRotationPoint(39F, -16F, 5F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 2, 1, 0F); // Box 170
		bodyModel[114].setRotationPoint(39F, -16F, 8F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 171
		bodyModel[115].setRotationPoint(39F, -16F, 5F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 172
		bodyModel[116].setRotationPoint(42F, -16F, 5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 3, 22, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[117].setRotationPoint(42F, -16F, -4F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 174
		bodyModel[118].setRotationPoint(51F, -13F, 6F);
		bodyModel[118].rotateAngleZ = -0.29670597F;

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 175
		bodyModel[119].setRotationPoint(10F, -22F, 19F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 1, 28, 0F); // Box 175
		bodyModel[120].setRotationPoint(-17F, -12F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 28, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 176
		bodyModel[121].setRotationPoint(-18F, -12F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 13, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[122].setRotationPoint(20F, -19F, 23F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 20, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[123].setRotationPoint(-1F, -18F, 25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[124].setRotationPoint(-7F, -16F, 25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[125].setRotationPoint(-7F, -18F, 25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[126].setRotationPoint(-18F, -11F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 186
		bodyModel[127].setRotationPoint(-18F, -9F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[128].setRotationPoint(-18F, -10F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[129].setRotationPoint(-18F, -10F, -3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 189
		bodyModel[130].setRotationPoint(-18F, -9F, -3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[131].setRotationPoint(-18F, -11F, -3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[132].setRotationPoint(-18F, -10F, 1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 192
		bodyModel[133].setRotationPoint(-18F, -9F, 1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[134].setRotationPoint(-18F, -11F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[135].setRotationPoint(-18F, -10F, 5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 195
		bodyModel[136].setRotationPoint(-18F, -9F, 5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[137].setRotationPoint(-18F, -11F, 5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[138].setRotationPoint(-18F, -10F, 9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 198
		bodyModel[139].setRotationPoint(-18F, -9F, 9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[140].setRotationPoint(-18F, -11F, 9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[141].setRotationPoint(-18F, -10F, 13F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 201
		bodyModel[142].setRotationPoint(-18F, -9F, 13F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[143].setRotationPoint(-18F, -11F, 13F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[144].setRotationPoint(-18F, -10F, 17F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 204
		bodyModel[145].setRotationPoint(-18F, -9F, 17F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[146].setRotationPoint(-18F, -11F, 17F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[147].setRotationPoint(-18F, -6F, 18F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 207
		bodyModel[148].setRotationPoint(-18F, -5F, 18F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[149].setRotationPoint(-18F, -7F, 18F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[150].setRotationPoint(-18F, -6F, 14F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 210
		bodyModel[151].setRotationPoint(-18F, -5F, 14F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[152].setRotationPoint(-18F, -7F, 14F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[153].setRotationPoint(-18F, -6F, 10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 213
		bodyModel[154].setRotationPoint(-18F, -5F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[155].setRotationPoint(-18F, -7F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[156].setRotationPoint(-18F, -6F, 6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 216
		bodyModel[157].setRotationPoint(-18F, -5F, 6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[158].setRotationPoint(-18F, -7F, 6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[159].setRotationPoint(-18F, -6F, 2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 219
		bodyModel[160].setRotationPoint(-18F, -5F, 2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[161].setRotationPoint(-18F, -7F, 2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[162].setRotationPoint(-18F, -6F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[163].setRotationPoint(-18F, -5F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[164].setRotationPoint(-18F, -7F, -2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[165].setRotationPoint(-18F, -6F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[166].setRotationPoint(-18F, -5F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[167].setRotationPoint(-18F, -7F, -6F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 28, 0F); // Box 227
		bodyModel[168].setRotationPoint(-17F, -8F, -7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[169].setRotationPoint(37F, -16F, 24F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[170].setRotationPoint(37F, -16F, -15F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[171].setRotationPoint(39F, -16F, -14F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[172].setRotationPoint(39F, -16F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[173].setRotationPoint(39F, -16F, 28F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[174].setRotationPoint(39F, -16F, 25F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[175].setRotationPoint(39F, -17F, 23F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[176].setRotationPoint(39F, -17F, 23F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[177].setRotationPoint(39F, -17F, -16F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[178].setRotationPoint(39F, -17F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 30, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[179].setRotationPoint(-1F, -18F, -16F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 127
		barrelModel[1] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 128
		barrelModel[2] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 129
		barrelModel[3] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 130
		barrelModel[4] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 131
		barrelModel[5] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 132
		barrelModel[6] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 133
		barrelModel[7] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 135
		barrelModel[8] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 136
		barrelModel[9] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 138
		barrelModel[10] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 139
		barrelModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 140
		barrelModel[12] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 141
		barrelModel[13] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 142
		barrelModel[14] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 143
		barrelModel[15] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 144
		barrelModel[16] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 145
		barrelModel[17] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 146
		barrelModel[18] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 147
		barrelModel[19] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 148
		barrelModel[20] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 149
		barrelModel[21] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 150
		barrelModel[22] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 151
		barrelModel[23] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 152
		barrelModel[24] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 153
		barrelModel[25] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 154
		barrelModel[26] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 155
		barrelModel[27] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 156
		barrelModel[28] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 157
		barrelModel[29] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 158
		barrelModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 166
		barrelModel[31] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 177
		barrelModel[32] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 178
		barrelModel[33] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 179

		barrelModel[0].addShapeBox(-6F, -30.5F, -1F, 22, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		barrelModel[0].setRotationPoint(0F, 0F, 0F);

		barrelModel[1].addShapeBox(-6F, -26.5F, -1F, 22, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 128
		barrelModel[1].setRotationPoint(0F, 0F, 0F);

		barrelModel[2].addBox(-6F, -29.5F, -1F, 22, 2, 6, 0F); // Box 129
		barrelModel[2].setRotationPoint(0F, 1F, 0F);

		barrelModel[3].addBox(-6F, -29.5F, 8F, 22, 2, 6, 0F); // Box 130
		barrelModel[3].setRotationPoint(0F, 1F, 0F);

		barrelModel[4].addShapeBox(-6F, -30.5F, 8F, 22, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		barrelModel[4].setRotationPoint(0F, 0F, 0F);

		barrelModel[5].addShapeBox(-6F, -26.5F, 8F, 22, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 132
		barrelModel[5].setRotationPoint(0F, 0F, 0F);

		barrelModel[6].addShapeBox(-7F, -29.5F, -1F, 1, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		barrelModel[6].setRotationPoint(0F, 0F, 0F);

		barrelModel[7].addShapeBox(-7F, -27.5F, -1F, 1, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 135
		barrelModel[7].setRotationPoint(0F, 0F, 0F);

		barrelModel[8].addShapeBox(16F, -27.5F, -1F, 1, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 136
		barrelModel[8].setRotationPoint(0F, 0F, 0F);

		barrelModel[9].addShapeBox(16F, -29.5F, -1F, 1, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		barrelModel[9].setRotationPoint(0F, 0F, 0F);

		barrelModel[10].addBox(-15F, -26.5F, 2F, 32, 7, 9, 0F); // Box 139
		barrelModel[10].setRotationPoint(0F, 0F, 0F);

		barrelModel[11].addBox(-16F, -26.5F, 2F, 1, 7, 2, 0F); // Box 140
		barrelModel[11].setRotationPoint(0F, 0F, 0F);

		barrelModel[12].addBox(-16F, -26.5F, 9F, 1, 7, 2, 0F); // Box 141
		barrelModel[12].setRotationPoint(0F, 0F, 0F);

		barrelModel[13].addBox(-16F, -21.5F, 4F, 1, 2, 5, 0F); // Box 142
		barrelModel[13].setRotationPoint(0F, 0F, 0F);

		barrelModel[14].addBox(4F, -30.5F, 4F, 8, 3, 6, 0F); // Box 143
		barrelModel[14].setRotationPoint(0F, 0F, 0F);

		barrelModel[15].addBox(1F, -30.5F, 4F, 1, 3, 6, 0F); // Box 144
		barrelModel[15].setRotationPoint(0F, 0F, 0F);

		barrelModel[16].addShapeBox(17F, -25.5F, 3F, 18, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		barrelModel[16].setRotationPoint(0F, 0F, 0F);

		barrelModel[17].addBox(17F, -24.5F, 3F, 18, 3, 8, 0F); // Box 146
		barrelModel[17].setRotationPoint(0F, 0F, 0F);

		barrelModel[18].addShapeBox(17F, -21.5F, 3F, 18, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 147
		barrelModel[18].setRotationPoint(0F, 0F, 0F);

		barrelModel[19].addShapeBox(35F, -24.5F, 5.5F, 41, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		barrelModel[19].setRotationPoint(0F, 0F, 0F);

		barrelModel[20].addBox(35F, -23.5F, 5.5F, 41, 1, 3, 0F); // Box 149
		barrelModel[20].setRotationPoint(0F, 0F, 0F);

		barrelModel[21].addShapeBox(35F, -22.5F, 5.5F, 41, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 150
		barrelModel[21].setRotationPoint(0F, 0F, 0F);

		barrelModel[22].addBox(76F, -23.5F, 4.5F, 4, 1, 5, 0F); // Box 151
		barrelModel[22].setRotationPoint(0F, 0F, 0F);

		barrelModel[23].addShapeBox(76F, -25.5F, 4.5F, 6, 2, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		barrelModel[23].setRotationPoint(0F, 0F, 0F);

		barrelModel[24].addShapeBox(76F, -22.5F, 4.5F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 153
		barrelModel[24].setRotationPoint(0F, 0F, 0F);

		barrelModel[25].addBox(81F, -23.5F, 4.5F, 1, 1, 1, 0F); // Box 154
		barrelModel[25].setRotationPoint(0F, 0F, 0F);

		barrelModel[26].addShapeBox(21F, -29.5F, -10F, 1, 2, 33, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		barrelModel[26].setRotationPoint(0F, 0F, 0F);

		barrelModel[27].addShapeBox(21F, -21.5F, -10F, 1, 2, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 156
		barrelModel[27].setRotationPoint(0F, 0F, 0F);

		barrelModel[28].addBox(21F, -27.5F, -10F, 1, 6, 23, 0F); // Box 157
		barrelModel[28].setRotationPoint(0F, 0F, 0F);

		barrelModel[29].addBox(21F, -27.5F, 22F, 1, 6, 1, 0F); // Box 158
		barrelModel[29].setRotationPoint(0F, 0F, 0F);

		barrelModel[30].addBox(81F, -23.5F, 8.5F, 1, 1, 1, 0F); // Box 166
		barrelModel[30].setRotationPoint(0F, 0F, 0F);

		barrelModel[31].addBox(-10F, -26.5F, 1F, 1, 7, 1, 0F); // Box 177
		barrelModel[31].setRotationPoint(0F, 0F, 0F);

		barrelModel[32].addBox(-10F, -26.5F, 11F, 1, 7, 1, 0F); // Box 178
		barrelModel[32].setRotationPoint(0F, 0F, 0F);

		barrelModel[33].addBox(-10F, -27.5F, 1F, 1, 1, 11, 0F); // Box 179
		barrelModel[33].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 105
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 106
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 107
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 108
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 109
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 110
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 111
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 112
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 113
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 114
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 115
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 116
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 239
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 241

		leftTrackWheelModels[0].addShapeBox(-6F, -6F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		leftTrackWheelModels[0].setRotationPoint(18F, 1F, 25F);

		leftTrackWheelModels[1].addShapeBox(-6F, 2F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 106
		leftTrackWheelModels[1].setRotationPoint(18F, 1F, 25F);

		leftTrackWheelModels[2].addBox(-6F, -2F, 0F, 12, 4, 5, 0F); // Box 107
		leftTrackWheelModels[2].setRotationPoint(18F, 1F, 25F);

		leftTrackWheelModels[3].addShapeBox(-6F, 2F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 108
		leftTrackWheelModels[3].setRotationPoint(35F, 1F, 25F);

		leftTrackWheelModels[4].addBox(-6F, -2F, 0F, 12, 4, 5, 0F); // Box 109
		leftTrackWheelModels[4].setRotationPoint(35F, 1F, 25F);

		leftTrackWheelModels[5].addShapeBox(-6F, -6F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftTrackWheelModels[5].setRotationPoint(35F, 1F, 25F);

		leftTrackWheelModels[6].addShapeBox(-6F, -6F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftTrackWheelModels[6].setRotationPoint(1F, 1F, 25F);

		leftTrackWheelModels[7].addBox(-6F, -2F, 0F, 12, 4, 5, 0F); // Box 112
		leftTrackWheelModels[7].setRotationPoint(1F, 1F, 25F);

		leftTrackWheelModels[8].addShapeBox(-6F, 2F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 113
		leftTrackWheelModels[8].setRotationPoint(1F, 1F, 25F);

		leftTrackWheelModels[9].addShapeBox(-6F, -6F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackWheelModels[9].setRotationPoint(-13F, 1F, 25F);

		leftTrackWheelModels[10].addBox(-6F, -2F, 0F, 12, 4, 5, 0F); // Box 115
		leftTrackWheelModels[10].setRotationPoint(-13F, 1F, 25F);

		leftTrackWheelModels[11].addShapeBox(-6F, 2F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 116
		leftTrackWheelModels[11].setRotationPoint(-13F, 1F, 25F);

		leftTrackWheelModels[12].addShapeBox(-6F, -2F, 0F, 12, 4, 5, 0F,-3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F); // Box 239
		leftTrackWheelModels[12].setRotationPoint(-27F, 0F, 25F);

		leftTrackWheelModels[13].addShapeBox(-6F, -2F, 0F, 12, 4, 5, 0F,-3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F); // Box 241
		leftTrackWheelModels[13].setRotationPoint(47F, -8F, 25F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 117
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 118
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 119
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 120
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 121
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 122
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 123
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 124
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 125
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 126
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 127
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 128
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 242
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 243

		rightTrackWheelModels[0].addShapeBox(-6F, -6F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		rightTrackWheelModels[0].setRotationPoint(-13F, 1F, -16F);

		rightTrackWheelModels[1].addBox(-6F, -2F, 0F, 12, 4, 5, 0F); // Box 118
		rightTrackWheelModels[1].setRotationPoint(-13F, 1F, -16F);

		rightTrackWheelModels[2].addShapeBox(-6F, 2F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 119
		rightTrackWheelModels[2].setRotationPoint(-13F, 1F, -16F);

		rightTrackWheelModels[3].addShapeBox(-6F, 2F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 120
		rightTrackWheelModels[3].setRotationPoint(1F, 1F, -16F);

		rightTrackWheelModels[4].addBox(-6F, -2F, 0F, 12, 4, 5, 0F); // Box 121
		rightTrackWheelModels[4].setRotationPoint(1F, 1F, -16F);

		rightTrackWheelModels[5].addShapeBox(-6F, -6F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightTrackWheelModels[5].setRotationPoint(1F, 1F, -16F);

		rightTrackWheelModels[6].addShapeBox(-6F, -6F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		rightTrackWheelModels[6].setRotationPoint(18F, 1F, -16F);

		rightTrackWheelModels[7].addBox(-6F, -2F, 0F, 12, 4, 5, 0F); // Box 124
		rightTrackWheelModels[7].setRotationPoint(18F, 1F, -16F);

		rightTrackWheelModels[8].addShapeBox(-6F, 2F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 125
		rightTrackWheelModels[8].setRotationPoint(18F, 1F, -16F);

		rightTrackWheelModels[9].addShapeBox(-6F, 2F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 126
		rightTrackWheelModels[9].setRotationPoint(35F, 1F, -16F);

		rightTrackWheelModels[10].addBox(-6F, -2F, 0F, 12, 4, 5, 0F); // Box 127
		rightTrackWheelModels[10].setRotationPoint(35F, 1F, -16F);

		rightTrackWheelModels[11].addShapeBox(-6F, -6F, 0F, 12, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		rightTrackWheelModels[11].setRotationPoint(35F, 1F, -16F);

		rightTrackWheelModels[12].addShapeBox(-6F, -2F, 0F, 12, 4, 5, 0F,-3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F); // Box 242
		rightTrackWheelModels[12].setRotationPoint(-27F, 0F, -16F);

		rightTrackWheelModels[13].addShapeBox(-6F, -2F, 0F, 12, 4, 5, 0F,-3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F); // Box 243
		rightTrackWheelModels[13].setRotationPoint(47F, -8F, -16F);
	}
}