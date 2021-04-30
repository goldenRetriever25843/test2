//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.05.2016 - 11:47:27
// Last changed on: 07.05.2016 - 11:47:27

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFokkerDr1 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelFokkerDr1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[163];
		tailModel = new ModelRendererTurbo[17];
		leftWingModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 68
		bodyModel[54] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 69
		bodyModel[55] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 70
		bodyModel[56] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 71
		bodyModel[57] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 76
		bodyModel[61] = new ModelRendererTurbo(this, 2, 361, textureX, textureY); // Box 82
		bodyModel[62] = new ModelRendererTurbo(this, 1, 689, textureX, textureY); // Box 83
		bodyModel[63] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Box 84
		bodyModel[64] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 88
		bodyModel[65] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 89
		bodyModel[66] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 90
		bodyModel[67] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 94
		bodyModel[68] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Box 95
		bodyModel[69] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 96
		bodyModel[70] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 101
		bodyModel[71] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 102
		bodyModel[72] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 103
		bodyModel[73] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 104
		bodyModel[74] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 105
		bodyModel[75] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 106
		bodyModel[76] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 107
		bodyModel[77] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 108
		bodyModel[78] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Box 109
		bodyModel[79] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 110
		bodyModel[80] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 111
		bodyModel[81] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 112
		bodyModel[82] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 113
		bodyModel[83] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 114
		bodyModel[84] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 115
		bodyModel[85] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 116
		bodyModel[86] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 117
		bodyModel[87] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 118
		bodyModel[88] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 119
		bodyModel[89] = new ModelRendererTurbo(this, 697, 89, textureX, textureY); // Box 120
		bodyModel[90] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 121
		bodyModel[91] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 122
		bodyModel[92] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 129
		bodyModel[93] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 130
		bodyModel[94] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 131
		bodyModel[95] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 132
		bodyModel[96] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 133
		bodyModel[97] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 135
		bodyModel[98] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 136
		bodyModel[99] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 137
		bodyModel[100] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 138
		bodyModel[101] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 139
		bodyModel[102] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 140
		bodyModel[103] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 141
		bodyModel[104] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 142
		bodyModel[105] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 143
		bodyModel[106] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 144
		bodyModel[107] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 145
		bodyModel[108] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 146
		bodyModel[109] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 147
		bodyModel[110] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 148
		bodyModel[111] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 149
		bodyModel[112] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 150
		bodyModel[113] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 151
		bodyModel[114] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 152
		bodyModel[115] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 153
		bodyModel[116] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 154
		bodyModel[117] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 155
		bodyModel[118] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 156
		bodyModel[119] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 157
		bodyModel[120] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 158
		bodyModel[121] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 159
		bodyModel[122] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 160
		bodyModel[123] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 161
		bodyModel[124] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 162
		bodyModel[125] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 166
		bodyModel[126] = new ModelRendererTurbo(this, 913, 145, textureX, textureY); // Box 167
		bodyModel[127] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Box 168
		bodyModel[128] = new ModelRendererTurbo(this, 913, 153, textureX, textureY); // Box 169
		bodyModel[129] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 170
		bodyModel[130] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 171
		bodyModel[131] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 172
		bodyModel[132] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 173
		bodyModel[133] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 174
		bodyModel[134] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 175
		bodyModel[135] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 176
		bodyModel[136] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 177
		bodyModel[137] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 178
		bodyModel[138] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 179
		bodyModel[139] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 180
		bodyModel[140] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 181
		bodyModel[141] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Box 182
		bodyModel[142] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 183
		bodyModel[143] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 184
		bodyModel[144] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 185
		bodyModel[145] = new ModelRendererTurbo(this, 601, 169, textureX, textureY); // Box 186
		bodyModel[146] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 187
		bodyModel[147] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 189
		bodyModel[148] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 190
		bodyModel[149] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 191
		bodyModel[150] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 192
		bodyModel[151] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 193
		bodyModel[152] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 194
		bodyModel[153] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 195
		bodyModel[154] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 196
		bodyModel[155] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 198
		bodyModel[156] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 199
		bodyModel[157] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 200
		bodyModel[158] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 201
		bodyModel[159] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 202
		bodyModel[160] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 203
		bodyModel[161] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 204
		bodyModel[162] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 205

		bodyModel[0].addBox(0F, 0F, 0F, 50, 1, 25, 0F); // Box 0
		bodyModel[0].setRotationPoint(-25F, -18F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 114, 1, 21, 0F,0F, 0F, 0F, 0F, 24F, -9F, 0F, 24F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, -9F, 0F, -24F, -9F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(44F, -20F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 1, 25, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(25F, -18F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 25, 1, 25, 0F,0F, 9F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -4F, 0F, -9F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -5F); // Box 3
		bodyModel[3].setRotationPoint(-50F, -18F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 34, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(22F, -52F, 11F);

		bodyModel[5].addBox(0F, 0F, 0F, 32, 34, 1, 0F); // Box 5
		bodyModel[5].setRotationPoint(-25F, -52F, 11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 114, 32, 1, 0F,0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 9F, 0F, -24F, -9F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(44F, -52F, 9F);

		bodyModel[7].addBox(0F, 0F, 0F, 32, 34, 1, 0F); // Box 9
		bodyModel[7].setRotationPoint(-25F, -52F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 22, 34, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(22F, -52F, -13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 114, 32, 1, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, -9F, 0F, -24F, 9F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(44F, -52F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 114, 32, 9, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -24F, -8F, 0F, -24F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(44F, -52F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(32F, -52F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -8F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(21F, -52F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 1, 11, 0F,-8F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(21F, -52F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 35, 11, 0F,0F, 2F, 0F, -8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-1F, -52F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 35, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-1F, -52F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 24, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-25F, -52F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 23, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 4F); // Box 19
		bodyModel[17].setRotationPoint(-48F, -32F, -13F);

		bodyModel[18].addBox(0F, 0F, 0F, 23, 11, 1, 0F); // Box 20
		bodyModel[18].setRotationPoint(-48F, -43F, -13F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 23, 9, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-48F, -52F, -13F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 23, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F); // Box 22
		bodyModel[20].setRotationPoint(-48F, -32F, 11F);

		bodyModel[21].addBox(0F, 0F, 0F, 23, 11, 1, 0F); // Box 23
		bodyModel[21].setRotationPoint(-48F, -43F, 11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 23, 9, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-48F, -52F, 11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 114, 32, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -9F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(44F, -52F, 0F);

		bodyModel[24].addBox(0F, 0F, 0F, 129, 3, 1, 0F); // Box 27
		bodyModel[24].setRotationPoint(29F, -54F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(32F, -52F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -5F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -5F, 4F); // Box 30
		bodyModel[26].setRotationPoint(-58F, -32F, -13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -5F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -5F, -4F); // Box 31
		bodyModel[27].setRotationPoint(-58F, -32F, 11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 32
		bodyModel[28].setRotationPoint(-58F, -43F, 11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 33
		bodyModel[29].setRotationPoint(-58F, -43F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 24, 1, 11, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-25F, -52F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 57, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F); // Box 34
		bodyModel[31].setRotationPoint(-58F, -54F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 21, 34, 11, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-48F, -52F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 21, 34, 11, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F); // Box 36
		bodyModel[33].setRotationPoint(-48F, -52F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[34].setRotationPoint(-58F, -52F, -13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 9, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(-58F, -52F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-58F, -52F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(-58F, -52F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 15, 31, 1, 0F); // Box 43
		bodyModel[38].setRotationPoint(7F, -49F, -13F);

		bodyModel[39].addBox(0F, 0F, 0F, 15, 31, 1, 0F); // Box 44
		bodyModel[39].setRotationPoint(7F, -49F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(7F, -52F, -13F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(16F, -52F, -13F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(16F, -52F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[43].setRotationPoint(7F, -52F, 11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(-60F, -52F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 50
		bodyModel[45].setRotationPoint(-60F, -52F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 51
		bodyModel[46].setRotationPoint(-60F, -54F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[47].setRotationPoint(-60F, -52F, -13F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, 4F); // Box 53
		bodyModel[48].setRotationPoint(-60F, -43F, -13F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[49].setRotationPoint(-60F, -43F, 11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, -1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[50].setRotationPoint(-60F, -52F, 11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -2F, 4F); // Box 56
		bodyModel[51].setRotationPoint(-60F, -35F, -13F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -2F, -4F); // Box 57
		bodyModel[52].setRotationPoint(-60F, -35F, 11F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 7, 23, 0F); // Box 68
		bodyModel[53].setRotationPoint(-60F, -43F, -12F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 8, 21, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 69
		bodyModel[54].setRotationPoint(-60F, -51F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 70
		bodyModel[55].setRotationPoint(-60F, -52F, -8F);

		bodyModel[56].addBox(0F, 0F, 0F, 16, 2, 25, 0F); // Box 71
		bodyModel[56].setRotationPoint(-24F, -17F, -13F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 3, 126, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[57].setRotationPoint(-26F, -18F, -139F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 3, 126, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[58].setRotationPoint(-26F, -18F, 12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 32, 4, 126, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[59].setRotationPoint(-16F, -19F, 12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 32, 4, 124, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[60].setRotationPoint(-27F, -55F, -152F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 32, 4, 318, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[61].setRotationPoint(-28F, -94F, -160F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 3, 318, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 83
		bodyModel[62].setRotationPoint(-38F, -93F, -160F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 38, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 4F, 8F, 0F, 4F, 8F, 0F, -4F, -8F, 0F, -4F); // Box 84
		bodyModel[63].setRotationPoint(-26F, -91F, 126F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 12, 4, 56, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[64].setRotationPoint(-27F, -55F, -28F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 20, 2, 18, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F); // Box 89
		bodyModel[65].setRotationPoint(-15F, -53F, -28F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 20, 2, 18, 0F,0F, 0F, 0F, 0F, -1F, -16F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[66].setRotationPoint(-15F, -53F, 9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 36, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 4F, 8F, 0F, 4F, 8F, 0F, -4F, -8F, 0F, -4F); // Box 94
		bodyModel[67].setRotationPoint(-18F, -53F, 122F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 38, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -4F, 8F, 0F, -4F, 8F, 0F, 4F, -8F, 0F, 4F); // Box 95
		bodyModel[68].setRotationPoint(-26F, -91F, -129F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 38, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -4F, 8F, 0F, -4F, 8F, 0F, 4F, -8F, 0F, 4F); // Box 96
		bodyModel[69].setRotationPoint(-18F, -54F, -125F);

		bodyModel[70].addBox(0F, 0F, 0F, 12, 3, 47, 0F); // Box 101
		bodyModel[70].setRotationPoint(-33F, -90F, -24F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 26, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 5F, 11F, 0F, 5F, 11F, 0F, -5F, -11F, 0F, -5F); // Box 102
		bodyModel[71].setRotationPoint(-28F, -87F, 18F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 8, 3, 0F); // Box 103
		bodyModel[72].setRotationPoint(-17F, -61F, 13F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 8, 3, 0F); // Box 104
		bodyModel[73].setRotationPoint(-17F, -61F, -17F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 26, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -5F, 11F, 0F, -5F, 11F, 0F, 5F, -11F, 0F, 5F); // Box 105
		bodyModel[74].setRotationPoint(-28F, -87F, -22F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[75].setRotationPoint(145F, -44F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[76].setRotationPoint(151F, -39F, -1F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 36, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, 10F, 10F, 0F, 10F); // Box 108
		bodyModel[77].setRotationPoint(-32F, -87F, -22F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 36, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 10F, -10F, 0F, 10F, -10F, 0F, -10F, 10F, 0F, -10F); // Box 109
		bodyModel[78].setRotationPoint(-32F, -87F, 18F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 3, 23, 0F); // Box 110
		bodyModel[79].setRotationPoint(-42F, -51F, -12F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 55, 31, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[80].setRotationPoint(44F, -51F, -1F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 7, 3, 0F); // Box 112
		bodyModel[81].setRotationPoint(-24F, -17F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 4F, 6F, 0F, 4F); // Box 113
		bodyModel[82].setRotationPoint(-24F, -10F, 9F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 7, 3, 0F); // Box 114
		bodyModel[83].setRotationPoint(-24F, -17F, -13F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 4F, -6F, 0F, 4F, -6F, 0F, -4F, 6F, 0F, -4F); // Box 115
		bodyModel[84].setRotationPoint(-24F, -10F, -13F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 4, 39, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[85].setRotationPoint(-35F, 11F, -20F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 21, 4, 39, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[86].setRotationPoint(-30F, 11F, -20F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 33, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 8F, 16F, 0F, 8F, 16F, 0F, -8F, -16F, 0F, -8F); // Box 118
		bodyModel[87].setRotationPoint(-49F, -26F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 33, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -8F, 16F, 0F, -8F, 16F, 0F, 8F, -16F, 0F, 8F); // Box 119
		bodyModel[88].setRotationPoint(-49F, -26F, 4F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 120
		bodyModel[89].setRotationPoint(-33F, 7F, -16F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 121
		bodyModel[90].setRotationPoint(-33F, 7F, 12F);

		bodyModel[91].addBox(0F, 0F, 0F, 9, 18, 2, 0F); // Box 122
		bodyModel[91].setRotationPoint(-29F, 6F, -22F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[92].setRotationPoint(-34F, 6F, -22F);

		bodyModel[93].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Box 130
		bodyModel[93].setRotationPoint(-34F, 11F, 19F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 131
		bodyModel[94].setRotationPoint(-34F, 19F, -22F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[95].setRotationPoint(-20F, 6F, -22F);

		bodyModel[96].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Box 133
		bodyModel[96].setRotationPoint(-20F, 11F, -22F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[97].setRotationPoint(-20F, 19F, -22F);

		bodyModel[98].addBox(0F, 0F, 0F, 9, 18, 2, 0F); // Box 136
		bodyModel[98].setRotationPoint(-29F, 6F, 19F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[99].setRotationPoint(-34F, 6F, 19F);

		bodyModel[100].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Box 138
		bodyModel[100].setRotationPoint(-34F, 11F, -22F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[101].setRotationPoint(-20F, 6F, 19F);

		bodyModel[102].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Box 140
		bodyModel[102].setRotationPoint(-20F, 11F, 19F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[103].setRotationPoint(-20F, 19F, 19F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 142
		bodyModel[104].setRotationPoint(-34F, 19F, 19F);

		bodyModel[105].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Box 143
		bodyModel[105].setRotationPoint(-63F, -40F, -1.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 4, 6, 6, 0F); // Box 144
		bodyModel[106].setRotationPoint(-66F, -42F, -3.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 3, 13, 3, 0F); // Box 145
		bodyModel[107].setRotationPoint(-57F, -41F, -2F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 7, 9, 0F); // Box 146
		bodyModel[108].setRotationPoint(-58F, -41F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 19, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[109].setRotationPoint(24F, -51F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 19, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 148
		bodyModel[110].setRotationPoint(24F, -51F, 3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 19, 5, 0F,3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[111].setRotationPoint(24F, -51F, -9F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 13, 3, 0F); // Box 150
		bodyModel[112].setRotationPoint(-57F, -41F, 0F);
		bodyModel[112].rotateAngleX = -0.78539816F;

		bodyModel[113].addBox(0F, 0F, 0F, 3, 13, 3, 0F); // Box 151
		bodyModel[113].setRotationPoint(-57F, -39F, -3F);
		bodyModel[113].rotateAngleX = 0.78539816F;

		bodyModel[114].addBox(0F, 0F, 0F, 3, 3, 13, 0F); // Box 152
		bodyModel[114].setRotationPoint(-57F, -40F, -3F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 3, 13, 0F); // Box 153
		bodyModel[115].setRotationPoint(-57F, -40F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 13, 3, 0F); // Box 154
		bodyModel[116].setRotationPoint(-57F, -53F, -2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 13, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[117].setRotationPoint(11F, -32F, -4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[118].setRotationPoint(11F, -32F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[119].setRotationPoint(11F, -32F, 3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[120].setRotationPoint(6F, -38F, -1.5F);
		bodyModel[120].rotateAngleZ = -0.31415927F;

		bodyModel[121].addBox(0F, 0F, 0F, 2, 2, 9, 0F); // Box 159
		bodyModel[121].setRotationPoint(2F, -52F, -5F);

		bodyModel[122].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 160
		bodyModel[122].setRotationPoint(2F, -56F, -6F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Box 161
		bodyModel[123].setRotationPoint(2F, -56F, 4F);

		bodyModel[124].addBox(0F, 0F, 0F, 30, 3, 1, 0F); // Box 162
		bodyModel[124].setRotationPoint(-35F, -56F, -5.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[125].setRotationPoint(-35F, -56F, -6.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 30, 1, 3, 0F); // Box 167
		bodyModel[126].setRotationPoint(-35F, -55F, -6.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 168
		bodyModel[127].setRotationPoint(-35F, -54F, -4.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[128].setRotationPoint(-35F, -56F, -4.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[129].setRotationPoint(-35F, -54F, -6.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 171
		bodyModel[130].setRotationPoint(-37F, -54.8F, -5.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 172
		bodyModel[131].setRotationPoint(-4F, -56F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[132].setRotationPoint(-4F, -56F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[133].setRotationPoint(-4F, -56F, -4F);

		bodyModel[134].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 175
		bodyModel[134].setRotationPoint(-8F, -55F, -5.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 176
		bodyModel[135].setRotationPoint(-4F, -56F, 4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[136].setRotationPoint(-4F, -56F, 6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[137].setRotationPoint(-4F, -56F, 2F);

		bodyModel[138].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 179
		bodyModel[138].setRotationPoint(-8F, -55F, 4.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 30, 3, 1, 0F); // Box 180
		bodyModel[139].setRotationPoint(-35F, -56F, 4.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 181
		bodyModel[140].setRotationPoint(-37F, -54.8F, 4.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[141].setRotationPoint(-35F, -56F, 5.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[142].setRotationPoint(-35F, -56F, 3.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 30, 1, 3, 0F); // Box 184
		bodyModel[143].setRotationPoint(-35F, -55F, 3.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 185
		bodyModel[144].setRotationPoint(-35F, -54F, 5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[145].setRotationPoint(-35F, -54F, 3.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 10, 1, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F); // Box 187
		bodyModel[146].setRotationPoint(1F, -91F, -165F);

		bodyModel[147].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 189
		bodyModel[147].setRotationPoint(-34F, -57F, 4.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[148].setRotationPoint(-34F, -57F, 3.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 191
		bodyModel[149].setRotationPoint(-34F, -58F, 3.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[150].setRotationPoint(-34F, -59F, 3.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 193
		bodyModel[151].setRotationPoint(-34F, -59F, 4.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[152].setRotationPoint(-34F, -59F, 5.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 195
		bodyModel[153].setRotationPoint(-34F, -58F, 5.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 196
		bodyModel[154].setRotationPoint(-34F, -57F, 5.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 198
		bodyModel[155].setRotationPoint(-34F, -57F, -5.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[156].setRotationPoint(-34F, -57F, -6.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 200
		bodyModel[157].setRotationPoint(-34F, -57F, -4.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[158].setRotationPoint(-34F, -59F, -6.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 202
		bodyModel[159].setRotationPoint(-34F, -58F, -6.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 203
		bodyModel[160].setRotationPoint(-34F, -58F, -4.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 204
		bodyModel[161].setRotationPoint(-34F, -59F, -5.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[162].setRotationPoint(-34F, -59F, -4.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 58
		tailModel[1] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 59
		tailModel[2] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 60
		tailModel[3] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 61
		tailModel[4] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 62
		tailModel[5] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 63
		tailModel[6] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 64
		tailModel[7] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 65
		tailModel[8] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 66
		tailModel[9] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 67
		tailModel[10] = new ModelRendererTurbo(this, 753, 177, textureX, textureY); // Box 91
		tailModel[11] = new ModelRendererTurbo(this, 737, 249, textureX, textureY); // Box 92
		tailModel[12] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box 93
		tailModel[13] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 97
		tailModel[14] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 98
		tailModel[15] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 99
		tailModel[16] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 100

		tailModel[0].addShapeBox(0F, 0F, 0F, 15, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[0].setRotationPoint(157F, -54F, -1F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[1].setRotationPoint(172F, -54F, -1F);

		tailModel[2].addBox(0F, 0F, 0F, 9, 9, 1, 0F); // Box 60
		tailModel[2].setRotationPoint(172F, -63F, -1F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[3].setRotationPoint(172F, -74F, -1F);

		tailModel[4].addBox(0F, 0F, 0F, 10, 20, 1, 0F); // Box 62
		tailModel[4].setRotationPoint(162F, -74F, -1F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		tailModel[5].setRotationPoint(157F, -74F, -1F);

		tailModel[6].addBox(0F, 0F, 0F, 9, 4, 1, 0F); // Box 64
		tailModel[6].setRotationPoint(153F, -63F, -1F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 65
		tailModel[7].setRotationPoint(153F, -59F, -1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		tailModel[8].setRotationPoint(153F, -72F, -1F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		tailModel[9].setRotationPoint(177F, -70F, -1F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 56, 1, 56, 0F,-47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		tailModel[10].setRotationPoint(100F, -54F, -61F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 56, 1, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -47F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -47F, 0F, 0F); // Box 92
		tailModel[11].setRotationPoint(100F, -54F, 4F);

		tailModel[12].addBox(0F, 0F, 0F, 38, 1, 9, 0F); // Box 93
		tailModel[12].setRotationPoint(109F, -54F, -5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 97
		tailModel[13].setRotationPoint(152F, -54F, -5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		tailModel[14].setRotationPoint(152F, -54F, 1F);

		tailModel[15].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 99
		tailModel[15].setRotationPoint(147F, -54F, 1F);

		tailModel[16].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 100
		tailModel[16].setRotationPoint(147F, -54F, -5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 72
		leftWingModel[1] = new ModelRendererTurbo(this, 545, 249, textureX, textureY); // Box 78
		leftWingModel[2] = new ModelRendererTurbo(this, 345, 689, textureX, textureY); // Box 85
		leftWingModel[3] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 188

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 32, 4, 126, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftWingModel[0].setRotationPoint(-16F, -19F, -139F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 32, 4, 124, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftWingModel[1].setRotationPoint(-27F, -55F, 27F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 303, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 85
		leftWingModel[2].setRotationPoint(-37F, -54F, -152F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 48, 0F,0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		leftWingModel[3].setRotationPoint(1F, -91F, 115F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][2];
		propellerModels[0] = makeProp1(-63F, -39.5F, -0.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 311, 219, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 311, 219, textureX, textureY);
		prop[0].addBox(-0.5F, -38F, -2F, 1, 38, 4, 0.0F);
		prop[1].addBox(-0.5F, -38F, -2F, 1, 38, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}
}