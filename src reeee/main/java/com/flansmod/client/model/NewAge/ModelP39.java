//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.03.2017 - 16:42:13
// Last changed on: 18.03.2017 - 16:42:13

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP39 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelP39() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[139];
		tailModel = new ModelRendererTurbo[37];
		leftWingModel = new ModelRendererTurbo[5];
		rightWingModel = new ModelRendererTurbo[5];
		bodyWheelModel = new ModelRendererTurbo[7];
		leftWingWheelModel = new ModelRendererTurbo[10];
		rightWingWheelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 38
		bodyModel[30] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 39
		bodyModel[31] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 40
		bodyModel[32] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Box 45
		bodyModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 50
		bodyModel[41] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 51
		bodyModel[42] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 70
		bodyModel[43] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 71
		bodyModel[44] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 72
		bodyModel[45] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 73
		bodyModel[46] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 74
		bodyModel[47] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 75
		bodyModel[48] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 82
		bodyModel[49] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 83
		bodyModel[50] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 84
		bodyModel[51] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 85
		bodyModel[52] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 89
		bodyModel[54] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 90
		bodyModel[55] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 91
		bodyModel[56] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 98
		bodyModel[57] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Box 121
		bodyModel[58] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 122
		bodyModel[59] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 123
		bodyModel[60] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 124
		bodyModel[61] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 125
		bodyModel[62] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 126
		bodyModel[63] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 127
		bodyModel[64] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 128
		bodyModel[65] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 129
		bodyModel[66] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 130
		bodyModel[67] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 131
		bodyModel[68] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 132
		bodyModel[69] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 133
		bodyModel[70] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 134
		bodyModel[71] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 135
		bodyModel[72] = new ModelRendererTurbo(this, 817, 9, textureX, textureY); // Box 136
		bodyModel[73] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 137
		bodyModel[74] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 138
		bodyModel[75] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 139
		bodyModel[76] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 140
		bodyModel[77] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 141
		bodyModel[78] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 142
		bodyModel[79] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 143
		bodyModel[80] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 144
		bodyModel[81] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 145
		bodyModel[82] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 146
		bodyModel[83] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 147
		bodyModel[84] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 148
		bodyModel[85] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 149
		bodyModel[86] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 150
		bodyModel[87] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 151
		bodyModel[88] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 152
		bodyModel[89] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Box 156
		bodyModel[90] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 157
		bodyModel[91] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 159
		bodyModel[92] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 160
		bodyModel[93] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 161
		bodyModel[94] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 163
		bodyModel[95] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 164
		bodyModel[96] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 165
		bodyModel[97] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 166
		bodyModel[98] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 167
		bodyModel[99] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 168
		bodyModel[100] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 169
		bodyModel[101] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 170
		bodyModel[102] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 171
		bodyModel[103] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 172
		bodyModel[104] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 173
		bodyModel[105] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 174
		bodyModel[106] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 175
		bodyModel[107] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 176
		bodyModel[108] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 177
		bodyModel[109] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 178
		bodyModel[110] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 180
		bodyModel[111] = new ModelRendererTurbo(this, 673, 105, textureX, textureY); // Box 181
		bodyModel[112] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 182
		bodyModel[113] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 183
		bodyModel[114] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 184
		bodyModel[115] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 185
		bodyModel[116] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 186
		bodyModel[117] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 192
		bodyModel[118] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 193
		bodyModel[119] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 194
		bodyModel[120] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 195
		bodyModel[121] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 196
		bodyModel[122] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 197
		bodyModel[123] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 198
		bodyModel[124] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 199
		bodyModel[125] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 200
		bodyModel[126] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 201
		bodyModel[127] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 202
		bodyModel[128] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 203
		bodyModel[129] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 204
		bodyModel[130] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 205
		bodyModel[131] = new ModelRendererTurbo(this, 897, 81, textureX, textureY); // Box 206
		bodyModel[132] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 207
		bodyModel[133] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 208
		bodyModel[134] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 209
		bodyModel[135] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 210
		bodyModel[136] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 211
		bodyModel[137] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 212
		bodyModel[138] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 213

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 3, 16, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-58F, -25F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 29, 2, 14, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-58F, -27F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 29, 2, 12, 0F,0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-58F, -29F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 0F, -3F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-58F, -30F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 29, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 4
		bodyModel[4].setRotationPoint(-58F, -20F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 29, 2, 14, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F); // Box 5
		bodyModel[5].setRotationPoint(-58F, -18F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 29, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-58F, -22F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 29, 2, 12, 0F,0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -2F); // Box 7
		bodyModel[7].setRotationPoint(-58F, -16F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, -3F); // Box 8
		bodyModel[8].setRotationPoint(-58F, -14F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-68F, -22F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-68F, -25F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-68F, -27F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-68F, -28F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 13
		bodyModel[13].setRotationPoint(-68F, -29F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -1F, -3F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, -3F); // Box 14
		bodyModel[14].setRotationPoint(-68F, -15F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 3, 14, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 15
		bodyModel[15].setRotationPoint(-68F, -21F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 1, 12, 0F,0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F); // Box 16
		bodyModel[16].setRotationPoint(-68F, -18F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F); // Box 17
		bodyModel[17].setRotationPoint(-68F, -16F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 29, 3, 16, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-58F, -25F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 29, 2, 14, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-58F, -27F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 29, 2, 12, 0F,0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-58F, -29F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 0F, -3F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-58F, -30F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 29, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-58F, -22F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 29, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 23
		bodyModel[23].setRotationPoint(-58F, -20F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 29, 2, 14, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[24].setRotationPoint(-58F, -18F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 29, 2, 12, 0F,0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -2F); // Box 25
		bodyModel[25].setRotationPoint(-58F, -16F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, -3F); // Box 26
		bodyModel[26].setRotationPoint(-58F, -14F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, 3F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 3F, -1F, 0F, -3F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -3F, 2F); // Box 36
		bodyModel[27].setRotationPoint(27F, -30F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 24, 2, 8, 0F,0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -1F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 2F); // Box 37
		bodyModel[28].setRotationPoint(27F, -29F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 24, 2, 10, 0F,0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F); // Box 38
		bodyModel[29].setRotationPoint(27F, -27F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 24, 3, 12, 0F,0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 39
		bodyModel[30].setRotationPoint(27F, -25F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 24, 2, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 40
		bodyModel[31].setRotationPoint(27F, -22F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 24, 2, 12, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F); // Box 41
		bodyModel[32].setRotationPoint(27F, -20F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 24, 2, 10, 0F,0F, 0F, 2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, 3F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 1F); // Box 42
		bodyModel[33].setRotationPoint(27F, -18F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 24, 2, 8, 0F,0F, -3F, 2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -3F, 2F, 0F, 7F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 7F, -1F); // Box 43
		bodyModel[34].setRotationPoint(27F, -16F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, -7F, 1F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, -7F, 1F, 0F, 7.5F, -1F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 7.5F, -1F); // Box 44
		bodyModel[35].setRotationPoint(27F, -14F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 45
		bodyModel[36].setRotationPoint(0F, -22F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 46
		bodyModel[37].setRotationPoint(0F, -25F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 47
		bodyModel[38].setRotationPoint(0F, -28F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 49
		bodyModel[39].setRotationPoint(0F, -20F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 50
		bodyModel[40].setRotationPoint(0F, -18F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 3F); // Box 51
		bodyModel[41].setRotationPoint(0F, -13F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 70
		bodyModel[42].setRotationPoint(0F, -22F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 71
		bodyModel[43].setRotationPoint(0F, -25F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 72
		bodyModel[44].setRotationPoint(0F, -28F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 73
		bodyModel[45].setRotationPoint(0F, -20F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 74
		bodyModel[46].setRotationPoint(0F, -18F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 75
		bodyModel[47].setRotationPoint(0F, -13F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 27, 2, 6, 0F,0F, -7F, 1F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 1F, 0F, 8F, -2F, 0F, 6.5F, -2F, 0F, 6.5F, -2F, 0F, 8F, -2F); // Box 82
		bodyModel[48].setRotationPoint(0F, -14F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 29, 2, 6, 0F,0F, -3F, 3F, 0F, -7F, 1F, 0F, -7F, 1F, 0F, -3F, 3F, 0F, 4F, 0F, 0F, 8F, -2F, 0F, 8F, -2F, 0F, 4F, 0F); // Box 83
		bodyModel[49].setRotationPoint(-29F, -14F, -3F);

		bodyModel[50].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 84
		bodyModel[50].setRotationPoint(-65F, -30F, 2F);

		bodyModel[51].addBox(0F, 0F, 0F, 21, 1, 1, 0F); // Box 85
		bodyModel[51].setRotationPoint(-65F, -30F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,-5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.3F); // Box 88
		bodyModel[52].setRotationPoint(18F, -32F, 4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,-5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.3F); // Box 89
		bodyModel[53].setRotationPoint(18F, -32F, 4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,-5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 1.3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.7F); // Box 90
		bodyModel[54].setRotationPoint(18F, -32F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[55].setRotationPoint(23F, -33F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 98
		bodyModel[56].setRotationPoint(91F, -30F, -2.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 121
		bodyModel[57].setRotationPoint(-78F, -23F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, -2F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 122
		bodyModel[58].setRotationPoint(-78F, -25F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, -4F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F); // Box 123
		bodyModel[59].setRotationPoint(-78F, -27F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, -5F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F); // Box 124
		bodyModel[60].setRotationPoint(-78F, -28F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, -6F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, -3F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -2F); // Box 125
		bodyModel[61].setRotationPoint(-78F, -29F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, -6F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, -3F); // Box 126
		bodyModel[62].setRotationPoint(-78F, -16F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -6F); // Box 127
		bodyModel[63].setRotationPoint(-78F, -21F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -4F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -5F); // Box 128
		bodyModel[64].setRotationPoint(-78F, -19F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, -5F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F); // Box 129
		bodyModel[65].setRotationPoint(-78F, -17F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[66].setRotationPoint(-80F, -23F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 131
		bodyModel[67].setRotationPoint(-80F, -23F, 0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[68].setRotationPoint(-80F, -23F, -1.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 133
		bodyModel[69].setRotationPoint(-8F, -33F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 134
		bodyModel[70].setRotationPoint(-8F, -36F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[71].setRotationPoint(-8F, -40F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 136
		bodyModel[72].setRotationPoint(-8F, -38F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 137
		bodyModel[73].setRotationPoint(-8F, -38F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 138
		bodyModel[74].setRotationPoint(-8F, -33F, 5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 139
		bodyModel[75].setRotationPoint(-8F, -36F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F); // Box 140
		bodyModel[76].setRotationPoint(-8F, -38F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -1F); // Box 141
		bodyModel[77].setRotationPoint(-8F, -38F, 1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.5F); // Box 142
		bodyModel[78].setRotationPoint(-15F, -36F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F); // Box 143
		bodyModel[79].setRotationPoint(-17F, -36F, 4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 2F, 2F, 0F, 2F); // Box 144
		bodyModel[80].setRotationPoint(-17F, -34F, 4F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.5F); // Box 145
		bodyModel[81].setRotationPoint(-15F, -36F, -5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F); // Box 146
		bodyModel[82].setRotationPoint(-17F, -36F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, 2F, 0F, -2F); // Box 147
		bodyModel[83].setRotationPoint(-17F, -34F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 148
		bodyModel[84].setRotationPoint(-29F, -30F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[85].setRotationPoint(-29F, -30F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[86].setRotationPoint(-18F, -38F, -1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F); // Box 151
		bodyModel[87].setRotationPoint(-18F, -38F, 1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0.3F, -2F, 1F, 1.2F); // Box 152
		bodyModel[88].setRotationPoint(-17F, -37F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[89].setRotationPoint(-18F, -38F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2F, -1F, 1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 1.2F, 1F, 1F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[90].setRotationPoint(-17F, -37F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[91].setRotationPoint(-29F, -32F, 2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[92].setRotationPoint(-22F, -36F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[93].setRotationPoint(-29F, -32F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[94].setRotationPoint(-22F, -36F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 27, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[95].setRotationPoint(0F, -25F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 27, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[96].setRotationPoint(0F, -22F, -5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 27, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[97].setRotationPoint(0F, -18F, -5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 27, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 167
		bodyModel[98].setRotationPoint(0F, -13F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[99].setRotationPoint(-5F, -32F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[100].setRotationPoint(-12F, -40F, -1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 170
		bodyModel[101].setRotationPoint(-12F, -40F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 171
		bodyModel[102].setRotationPoint(-12F, -39F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[103].setRotationPoint(-12F, -40F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[104].setRotationPoint(-12F, -39F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 29, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 174
		bodyModel[105].setRotationPoint(-29F, -26F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 175
		bodyModel[106].setRotationPoint(-29F, -22F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, 1F); // Box 176
		bodyModel[107].setRotationPoint(-29F, -20F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 1F, 1F); // Box 177
		bodyModel[108].setRotationPoint(-29F, -17F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 5F, -3F, 0F, 5F, 4F, 0F, 1F, 1F); // Box 178
		bodyModel[109].setRotationPoint(-29F, -14F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, -2F); // Box 180
		bodyModel[110].setRotationPoint(-29F, -28F, -6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 29, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 181
		bodyModel[111].setRotationPoint(-29F, -26F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 182
		bodyModel[112].setRotationPoint(-29F, -22F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -1F); // Box 183
		bodyModel[113].setRotationPoint(-29F, -20F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 1F, -1F); // Box 184
		bodyModel[114].setRotationPoint(-29F, -17F, 7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 5F, 4F, 0F, 5F, -3F, 0F, 1F, -1F); // Box 185
		bodyModel[115].setRotationPoint(-29F, -14F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 2F); // Box 186
		bodyModel[116].setRotationPoint(-29F, -28F, 5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[117].setRotationPoint(-1F, -38F, -0.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[118].setRotationPoint(13F, -36F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 194
		bodyModel[119].setRotationPoint(-5F, -27F, -5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[120].setRotationPoint(-7F, -14F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[121].setRotationPoint(-13F, -14F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 29, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[122].setRotationPoint(-29F, -12F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[123].setRotationPoint(-3F, -25F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[124].setRotationPoint(-3F, -22F, -7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 200
		bodyModel[125].setRotationPoint(-3F, -14F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[126].setRotationPoint(-17F, -15F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[127].setRotationPoint(-17F, -17F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 203
		bodyModel[128].setRotationPoint(-12F, -17F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[129].setRotationPoint(-17F, -17F, 4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 205
		bodyModel[130].setRotationPoint(-12F, -17F, 4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 206
		bodyModel[131].setRotationPoint(-30F, -19F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[132].setRotationPoint(-30F, -30F, -3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[133].setRotationPoint(-30F, -22F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 209
		bodyModel[134].setRotationPoint(-30F, -26F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 210
		bodyModel[135].setRotationPoint(-28.5F, -29F, -4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 211
		bodyModel[136].setRotationPoint(-28.5F, -29F, 3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[137].setRotationPoint(-22F, -13F, -1.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[138].setRotationPoint(-21F, -20F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 27
		tailModel[1] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 28
		tailModel[2] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 29
		tailModel[3] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 30
		tailModel[4] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 31
		tailModel[5] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 32
		tailModel[6] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 33
		tailModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		tailModel[8] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 35
		tailModel[9] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 92
		tailModel[10] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 93
		tailModel[11] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 94
		tailModel[12] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 95
		tailModel[13] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 96
		tailModel[14] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 97
		tailModel[15] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 99
		tailModel[16] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 100
		tailModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		tailModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 102
		tailModel[19] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 103
		tailModel[20] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 104
		tailModel[21] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 105
		tailModel[22] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 106
		tailModel[23] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 107
		tailModel[24] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 108
		tailModel[25] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 109
		tailModel[26] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 110
		tailModel[27] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 111
		tailModel[28] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 112
		tailModel[29] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 113
		tailModel[30] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 114
		tailModel[31] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 115
		tailModel[32] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 116
		tailModel[33] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 117
		tailModel[34] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 118
		tailModel[35] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 119
		tailModel[36] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 120

		tailModel[0].addShapeBox(0F, 0F, 0F, 40, 3, 12, 0F,0F, 1F, 0F, 0F, 1F, -3.75F, 0F, 1F, -3.75F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -2F, -3.5F, 0F, -2F, -3.5F, 0F, 0F, 1F); // Box 27
		tailModel[0].setRotationPoint(51F, -25F, -6F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 40, 2, 10, 0F,0F, 1F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, -1F, -2.75F, 0F, -1F, -2.75F, 0F, -1F, 1F); // Box 28
		tailModel[1].setRotationPoint(51F, -27F, -5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 40, 2, 8, 0F,0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -1F, 1F); // Box 29
		tailModel[2].setRotationPoint(51F, -29F, -4F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 40, 1, 4, 0F,0F, 2F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, -1F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F); // Box 30
		tailModel[3].setRotationPoint(51F, -30F, -2F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 40, 2, 12, 0F,0F, 0F, 1F, 0F, 2F, -3.5F, 0F, 2F, -3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -3.5F, 0F, -2F, -3.5F, 0F, 0F, 1F); // Box 31
		tailModel[4].setRotationPoint(51F, -22F, -6F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 40, 2, 12, 0F,0F, 0F, 1F, 0F, 2F, -3.5F, 0F, 2F, -3.5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -2F, -3.5F, 0F, -2F, -3.5F, 0F, 1F, 0F); // Box 32
		tailModel[5].setRotationPoint(51F, -20F, -6F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 40, 2, 10, 0F,0F, -1F, 1F, 0F, 2F, -2.5F, 0F, 2F, -2.5F, 0F, -1F, 1F, 0F, 2F, 0F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 2F, 0F); // Box 33
		tailModel[6].setRotationPoint(51F, -18F, -5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 40, 2, 8, 0F,0F, -2F, 1F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, -1F, 1F, 0F, 3F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 3F, 0F); // Box 34
		tailModel[7].setRotationPoint(51F, -16F, -4F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 40, 1, 4, 0F,0F, -3F, 2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 2F, 0F, 5F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 5F, -1F); // Box 35
		tailModel[8].setRotationPoint(51F, -14F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 10, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, 0F); // Box 92
		tailModel[9].setRotationPoint(91F, -24F, -2.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 2F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -0.5F); // Box 93
		tailModel[10].setRotationPoint(91F, -18F, -2.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -0.5F, 0F, 2F, -1.5F, 0F, 2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F); // Box 94
		tailModel[11].setRotationPoint(91F, -17F, -2.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 95
		tailModel[12].setRotationPoint(91F, -26F, -2.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F); // Box 96
		tailModel[13].setRotationPoint(91F, -27F, -2.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F); // Box 97
		tailModel[14].setRotationPoint(91F, -29F, -2.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 10, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		tailModel[15].setRotationPoint(91F, -50F, -1F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 16, 21, 2, 0F,-14F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 100
		tailModel[16].setRotationPoint(75F, -50F, -1F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, -3F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		tailModel[17].setRotationPoint(91F, -55F, -1F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 102
		tailModel[18].setRotationPoint(89F, -52F, -1F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		tailModel[19].setRotationPoint(95F, -54F, -1F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		tailModel[20].setRotationPoint(98F, -55F, -1F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 14, 13, 2, 0F,0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 105
		tailModel[21].setRotationPoint(101F, -50F, -1F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 9, 5, 2, 0F,0F, 0F, -1F, -5F, -1F, -1F, -5F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 106
		tailModel[22].setRotationPoint(101F, -55F, -1F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 14, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 107
		tailModel[23].setRotationPoint(101F, -37F, -1F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 14, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, -1F, -3F, -4F, -1F, 0F, 0F, 0F); // Box 108
		tailModel[24].setRotationPoint(101F, -28F, -1F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 10, 3, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, -1F, 0F); // Box 109
		tailModel[25].setRotationPoint(91F, -31F, 0F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 9, 3, 36, 0F,1F, -1.5F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -11F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -11F, -1.5F, 0F); // Box 110
		tailModel[26].setRotationPoint(82F, -31F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 10, 3, 36, 0F,0F, 0F, 0F, 0F, -1.5F, -7F, -1.5F, -1.5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, -7F, -1.5F, -1.5F, 0F, -3F, -1F, 0F); // Box 111
		tailModel[27].setRotationPoint(101F, -31F, 0F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 10, 3, 36, 0F,-4F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		tailModel[28].setRotationPoint(91F, -31F, -36F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 9, 3, 36, 0F,-11F, -1.5F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, -11F, -1.5F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F); // Box 113
		tailModel[29].setRotationPoint(82F, -31F, -36F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 10, 3, 36, 0F,-3F, -1F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, -7F, 0F, 0F, 0F, -3F, -1F, 0F, -1.5F, -1.5F, 0F, 0F, -1.5F, -7F, 0F, 0F, 0F); // Box 114
		tailModel[30].setRotationPoint(101F, -31F, -36F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,-5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		tailModel[31].setRotationPoint(94F, -30F, -42F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, 0F, 0F, 5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, 0F, 0F, 5F, -0.5F, 0F); // Box 116
		tailModel[32].setRotationPoint(98F, -30F, -42F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.5F, 0F, -2.5F, -0.5F, -2.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, -2.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 117
		tailModel[33].setRotationPoint(104F, -30F, -42F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F); // Box 118
		tailModel[34].setRotationPoint(94F, -30F, 36F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,5F, -0.5F, 0F, -5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 5F, -0.5F, 0F, -5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		tailModel[35].setRotationPoint(98F, -30F, 36F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, -2.5F, 0F, -0.5F, 0F); // Box 120
		tailModel[36].setRotationPoint(104F, -30F, 36F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 187
		leftWingModel[1] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 188
		leftWingModel[2] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 189
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 190
		leftWingModel[4] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 191

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 13, 4, 89, 0F,-5F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 187
		leftWingModel[0].setRotationPoint(-13F, -10F, -94F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 89, 0F,-9F, 10F, 0F, 5F, 11F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -9F, -12F, 0F, 5F, -11F, 0F, 0F, 0F, 4F, 0F, -1F, 3F); // Box 188
		leftWingModel[1].setRotationPoint(-22F, -10F, -94F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 15, 4, 89, 0F,0F, 11F, 0F, -7F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -7F, -12F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 189
		leftWingModel[2].setRotationPoint(0F, -10F, -94F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 16, 3, 89, 0F,7F, 10F, 0F, -16F, 9F, 0F, 0F, -3F, 4F, 0F, 0F, 0F, 7F, -11F, 0F, -16F, -12F, 0F, 0F, 0F, 4F, 0F, 1F, 4F); // Box 190
		leftWingModel[3].setRotationPoint(15F, -10F, -94F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 90, 0F,-9F, 10F, 0F, 9F, 11F, 0F, 0F, 0F, 0F, 1F, -1F, 2F, -9F, -12F, 0F, 9F, -11F, 0F, 0F, 0F, 2F, 1F, -1F, 2F); // Box 191
		leftWingModel[4].setRotationPoint(-23F, -9F, -94F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 705, 57, textureX, textureY); // Box 73
		rightWingModel[1] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 74
		rightWingModel[2] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 75
		rightWingModel[3] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 76
		rightWingModel[4] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 77

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 13, 4, 89, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, -5F, 11F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -11F, 0F, -5F, -11F, 0F); // Box 73
		rightWingModel[0].setRotationPoint(-13F, -10F, 5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 89, 0F,0F, -1F, 1F, 0F, 0F, 0F, 5F, 11F, 0F, -9F, 10F, 0F, 0F, -1F, 3F, 0F, 0F, 4F, 5F, -11F, 0F, -9F, -12F, 0F); // Box 74
		rightWingModel[1].setRotationPoint(-22F, -10F, 5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 15, 4, 89, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 10F, 0F, 0F, 11F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -7F, -12F, 0F, 0F, -11F, 0F); // Box 75
		rightWingModel[2].setRotationPoint(0F, -10F, 5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 16, 3, 89, 0F,0F, 0F, 0F, 0F, -3F, 4F, -16F, 9F, 0F, 7F, 10F, 0F, 0F, 1F, 4F, 0F, 0F, 4F, -16F, -12F, 0F, 7F, -11F, 0F); // Box 76
		rightWingModel[3].setRotationPoint(15F, -10F, 5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 90, 0F,1F, -1F, 2F, 0F, 0F, 0F, 9F, 11F, 0F, -9F, 10F, 0F, 1F, -1F, 2F, 0F, 0F, 2F, 9F, -11F, 0F, -9F, -12F, 0F); // Box 77
		rightWingModel[4].setRotationPoint(-23F, -9F, 4F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 234
		bodyWheelModel[1] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 235
		bodyWheelModel[2] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 236
		bodyWheelModel[3] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 237
		bodyWheelModel[4] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 238
		bodyWheelModel[5] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 239
		bodyWheelModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 240

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyWheelModel[0].setRotationPoint(-58F, -14F, -0.5F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 235
		bodyWheelModel[1].setRotationPoint(-57F, -7F, -0.5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyWheelModel[2].setRotationPoint(-58F, 1F, 0.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyWheelModel[3].setRotationPoint(-58F, 1F, -1.5F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyWheelModel[4].setRotationPoint(-59F, 4F, -0.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 239
		bodyWheelModel[5].setRotationPoint(-60F, 4F, -0.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 240
		bodyWheelModel[6].setRotationPoint(-56F, 4F, -0.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 224
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 537, 97, textureX, textureY); // Box 225
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 226
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 227
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 228
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 229
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 230
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Box 231
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 232
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 761, 105, textureX, textureY); // Box 233

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftWingWheelModel[0].setRotationPoint(-5F, -10F, -29F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		leftWingWheelModel[1].setRotationPoint(-9F, 0F, -29F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		leftWingWheelModel[2].setRotationPoint(-9F, 2F, -29F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		leftWingWheelModel[3].setRotationPoint(-7F, -1F, -29F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		leftWingWheelModel[4].setRotationPoint(-4.5F, -10F, -27.5F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		leftWingWheelModel[5].setRotationPoint(-4F, -2F, -28F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		leftWingWheelModel[6].setRotationPoint(-4F, -2F, -25F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		leftWingWheelModel[7].setRotationPoint(-8F, 3F, -27F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftWingWheelModel[8].setRotationPoint(-8F, 1F, -27F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 233
		leftWingWheelModel[9].setRotationPoint(-8F, 7F, -27F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 214
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 215
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 216
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 217
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 218
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 219
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 220
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 921, 89, textureX, textureY); // Box 221
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 222
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 223

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightWingWheelModel[0].setRotationPoint(-5F, -10F, 28F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		rightWingWheelModel[1].setRotationPoint(-9F, 0F, 28F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightWingWheelModel[2].setRotationPoint(-9F, 2F, 28F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		rightWingWheelModel[3].setRotationPoint(-7F, -1F, 28F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightWingWheelModel[4].setRotationPoint(-4.5F, -10F, 24.5F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		rightWingWheelModel[5].setRotationPoint(-4F, -2F, 27F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightWingWheelModel[6].setRotationPoint(-4F, -2F, 24F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightWingWheelModel[7].setRotationPoint(-8F, 3F, 25F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightWingWheelModel[8].setRotationPoint(-8F, 1F, 25F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 223
		rightWingWheelModel[9].setRotationPoint(-8F, 7F, 25F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-72F, -22F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 8, 176, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 8, 176, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 8, 176, textureX, textureY);
		prop[0].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[1].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[2].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}