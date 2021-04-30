//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.02.2016 - 11:14:34
// Last changed on: 20.02.2016 - 11:14:34

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelH6K extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelH6K() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[182];
		leftWingModel = new ModelRendererTurbo[18];
		rightWingModel = new ModelRendererTurbo[6];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 649, 73, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 1
		bodyModel[25] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 48
		bodyModel[41] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 49
		bodyModel[42] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 50
		bodyModel[43] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 51
		bodyModel[44] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 52
		bodyModel[45] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 53
		bodyModel[46] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 54
		bodyModel[47] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 921, 161, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 713, 169, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 62
		bodyModel[52] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 64
		bodyModel[53] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 145, 393, textureX, textureY); // Box 72
		bodyModel[61] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 73
		bodyModel[62] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 74
		bodyModel[63] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 75
		bodyModel[64] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 76
		bodyModel[65] = new ModelRendererTurbo(this, 649, 201, textureX, textureY); // Box 77
		bodyModel[66] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 78
		bodyModel[67] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 79
		bodyModel[68] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 80
		bodyModel[69] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 84
		bodyModel[70] = new ModelRendererTurbo(this, 953, 201, textureX, textureY); // Box 85
		bodyModel[71] = new ModelRendererTurbo(this, 729, 209, textureX, textureY); // Box 86
		bodyModel[72] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 87
		bodyModel[73] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 88
		bodyModel[74] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 89
		bodyModel[75] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 90
		bodyModel[76] = new ModelRendererTurbo(this, 897, 241, textureX, textureY); // Box 91
		bodyModel[77] = new ModelRendererTurbo(this, 953, 249, textureX, textureY); // Box 92
		bodyModel[78] = new ModelRendererTurbo(this, 833, 217, textureX, textureY); // Box 93
		bodyModel[79] = new ModelRendererTurbo(this, 697, 257, textureX, textureY); // Box 94
		bodyModel[80] = new ModelRendererTurbo(this, 185, 289, textureX, textureY); // Box 95
		bodyModel[81] = new ModelRendererTurbo(this, 897, 265, textureX, textureY); // Box 96
		bodyModel[82] = new ModelRendererTurbo(this, 897, 217, textureX, textureY); // Box 97
		bodyModel[83] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 98
		bodyModel[84] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 99
		bodyModel[85] = new ModelRendererTurbo(this, 953, 273, textureX, textureY); // Box 100
		bodyModel[86] = new ModelRendererTurbo(this, 89, 281, textureX, textureY); // Box 101
		bodyModel[87] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Box 102
		bodyModel[88] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 103
		bodyModel[89] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 104
		bodyModel[90] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 105
		bodyModel[91] = new ModelRendererTurbo(this, 697, 289, textureX, textureY); // Box 106
		bodyModel[92] = new ModelRendererTurbo(this, 937, 297, textureX, textureY); // Box 107
		bodyModel[93] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Box 108
		bodyModel[94] = new ModelRendererTurbo(this, 697, 273, textureX, textureY); // Box 109
		bodyModel[95] = new ModelRendererTurbo(this, 857, 305, textureX, textureY); // Box 110
		bodyModel[96] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Box 111
		bodyModel[97] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Box 112
		bodyModel[98] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 113
		bodyModel[99] = new ModelRendererTurbo(this, 89, 305, textureX, textureY); // Box 114
		bodyModel[100] = new ModelRendererTurbo(this, 753, 305, textureX, textureY); // Box 115
		bodyModel[101] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Box 116
		bodyModel[102] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 117
		bodyModel[103] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 118
		bodyModel[104] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 119
		bodyModel[105] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 120
		bodyModel[106] = new ModelRendererTurbo(this, 697, 313, textureX, textureY); // Box 121
		bodyModel[107] = new ModelRendererTurbo(this, 425, 321, textureX, textureY); // Box 122
		bodyModel[108] = new ModelRendererTurbo(this, 937, 321, textureX, textureY); // Box 123
		bodyModel[109] = new ModelRendererTurbo(this, 857, 329, textureX, textureY); // Box 124
		bodyModel[110] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 125
		bodyModel[111] = new ModelRendererTurbo(this, 753, 329, textureX, textureY); // Box 126
		bodyModel[112] = new ModelRendererTurbo(this, 81, 337, textureX, textureY); // Box 127
		bodyModel[113] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 185, 337, textureX, textureY); // Box 129
		bodyModel[115] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 130
		bodyModel[116] = new ModelRendererTurbo(this, 697, 337, textureX, textureY); // Box 131
		bodyModel[117] = new ModelRendererTurbo(this, 929, 337, textureX, textureY); // Box 132
		bodyModel[118] = new ModelRendererTurbo(this, 377, 337, textureX, textureY); // Box 133
		bodyModel[119] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 134
		bodyModel[120] = new ModelRendererTurbo(this, 833, 161, textureX, textureY); // Box 135
		bodyModel[121] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 136
		bodyModel[122] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 138
		bodyModel[123] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 139
		bodyModel[124] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 140
		bodyModel[125] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 141
		bodyModel[126] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Box 143
		bodyModel[127] = new ModelRendererTurbo(this, 657, 473, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 121, 489, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 146
		bodyModel[130] = new ModelRendererTurbo(this, 273, 497, textureX, textureY); // Box 147
		bodyModel[131] = new ModelRendererTurbo(this, 425, 609, textureX, textureY); // Box 148
		bodyModel[132] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 377, 353, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 89, 353, textureX, textureY); // Box 151
		bodyModel[135] = new ModelRendererTurbo(this, 857, 353, textureX, textureY); // Box 152
		bodyModel[136] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 153
		bodyModel[137] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 154
		bodyModel[138] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Box 155
		bodyModel[139] = new ModelRendererTurbo(this, 185, 361, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 265, 361, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 697, 361, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 937, 361, textureX, textureY); // Box 159
		bodyModel[143] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 160
		bodyModel[144] = new ModelRendererTurbo(this, 521, 257, textureX, textureY); // Box 161
		bodyModel[145] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 162
		bodyModel[146] = new ModelRendererTurbo(this, 857, 377, textureX, textureY); // Box 163
		bodyModel[147] = new ModelRendererTurbo(this, 937, 377, textureX, textureY); // Box 164
		bodyModel[148] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 165
		bodyModel[149] = new ModelRendererTurbo(this, 521, 281, textureX, textureY); // Box 166
		bodyModel[150] = new ModelRendererTurbo(this, 777, 353, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 377, 401, textureX, textureY); // Box 168
		bodyModel[152] = new ModelRendererTurbo(this, 537, 401, textureX, textureY); // Box 169
		bodyModel[153] = new ModelRendererTurbo(this, 617, 401, textureX, textureY); // Box 170
		bodyModel[154] = new ModelRendererTurbo(this, 697, 401, textureX, textureY); // Box 171
		bodyModel[155] = new ModelRendererTurbo(this, 289, 337, textureX, textureY); // Box 172
		bodyModel[156] = new ModelRendererTurbo(this, 449, 345, textureX, textureY); // Box 173
		bodyModel[157] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 175
		bodyModel[158] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 176
		bodyModel[159] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 177
		bodyModel[160] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 178
		bodyModel[161] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 179
		bodyModel[162] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 180
		bodyModel[163] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 181
		bodyModel[164] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 182
		bodyModel[165] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 185
		bodyModel[166] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 186
		bodyModel[167] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 189
		bodyModel[168] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 190
		bodyModel[169] = new ModelRendererTurbo(this, 537, 369, textureX, textureY); // Box 191
		bodyModel[170] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 192
		bodyModel[171] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 193
		bodyModel[172] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 194
		bodyModel[173] = new ModelRendererTurbo(this, 937, 401, textureX, textureY); // Box 195
		bodyModel[174] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); // Box 198
		bodyModel[175] = new ModelRendererTurbo(this, 697, 377, textureX, textureY); // Box 204
		bodyModel[176] = new ModelRendererTurbo(this, 609, 417, textureX, textureY); // Box 211
		bodyModel[177] = new ModelRendererTurbo(this, 609, 417, textureX, textureY); // Box 212
		bodyModel[178] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); // Box 228
		bodyModel[179] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); // Box 229
		bodyModel[180] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); // Box 230
		bodyModel[181] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 225

		bodyModel[0].addShapeBox(0F, 0F, 0F, 37, 2, 25, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-113F, -46.01F, -12.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-122.5F, -46.01F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-122.51F, -46F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 3
		bodyModel[3].setRotationPoint(-122.5F, -46F, -0.5F);
		bodyModel[3].rotateAngleZ = -0.52359878F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -3F, 0F, 0.5F, 1F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0.5F, -2F, -1F, 0.5F); // Box 4
		bodyModel[4].setRotationPoint(-120.5F, -46F, 6.01F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0.5F, 1F, -1F, 0.5F, 0F, -1F, 0F, 1F, -1F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-120.5F, -46F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-2.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, -1F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, -1.5F, -1F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-120F, -46F, -12.04F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -2.5F, 0F, 0.5F, -1.5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1.5F, -1F, 0.5F); // Box 7
		bodyModel[7].setRotationPoint(-120F, -46F, 11.01F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3.5F, 2F, 0F, 4F, 0F, 0F, -2F, 1F, 0F, -2F); // Box 8
		bodyModel[8].setRotationPoint(-117.5F, -46F, -12.5F);
		bodyModel[8].rotateAngleZ = -0.43633231F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 4F, -1F, 0F, 3.5F); // Box 9
		bodyModel[9].setRotationPoint(-117.5F, -46F, 11.5F);
		bodyModel[9].rotateAngleZ = -0.43633231F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 39, 18, 25, 0F,0F, 1F, -1F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 1F, -1F, 6F, -3F, 4F, 0F, 8F, 13F, 0F, 8F, 13F, 6F, -3F, 4F); // Box 10
		bodyModel[10].setRotationPoint(-158F, -42F, -12.5F);

		bodyModel[11].addShapeBox(0F, 0F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-99.5F, -44F, -13F);
		bodyModel[11].rotateAngleX = -0.38397244F;

		bodyModel[12].addShapeBox(0F, 0F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-99.5F, -44F, 13F);
		bodyModel[12].rotateAngleX = 0.38397244F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 62, 44, 49, 0F,0F, 0F, -10F, 0F, -7F, -10F, 0F, -7F, -10F, 0F, 0F, -10F, 0F, -8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 2F); // Box 13
		bodyModel[13].setRotationPoint(-76.02F, -42F, -24.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 80, 34, 47, 0F,0F, 0F, -9F, 0F, -5F, -13F, 0F, -5F, -13F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-14F, -35F, -23.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 60, 30, 36, 0F,0F, 0F, -7.5F, 0F, 1F, -11F, 0F, 1F, -11F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(66.01F, -30F, -18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 40, 25, 14, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -4F, 5F, 0F, -4F, 5F, 0F, 0F, 7F); // Box 16
		bodyModel[16].setRotationPoint(126F, -31F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 24, 12, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 17
		bodyModel[17].setRotationPoint(166.01F, -34F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 48, 28, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -5F, 2F, 0F, -5F, 2F, 0F, 0F, 6F); // Box 18
		bodyModel[18].setRotationPoint(177F, -38F, -6.01F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 51, 1, 162, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, 14F, 0F, 0F, 8F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-51F, -74F, -162.02F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 51, 1, 162, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 14F, 0F, 0F, 6F, 0F, 0F, 1F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-51F, -74F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 1, 162, 0F,0F, 1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 12F, 0F, 0F, 8F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-58F, -78.01F, -162F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 1, 162, 0F,0F, -7F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, 12F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-58F, -78F, 0.01F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 18, 25, 0F,0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, -4F, 0F, -6F, -2F, 4F, -6F, -2F, 4F, 0F, -4F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-173.01F, -43F, -12.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 14, 25, 0F,0F, -1F, -12F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, -12F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -12F); // Box 1
		bodyModel[24].setRotationPoint(-183.02F, -43F, -12.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 80, 10, 47, 0F,0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 1F, -2F, -23.5F, -1F, -2F, -23.5F, -1F, -2F, -23.5F, 1F, -2F, -23.5F); // Box 26
		bodyModel[25].setRotationPoint(-14F, -1F, -23.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 63, 10, 53, 0F,0F, 0F, 0F, -1F, -8F, -2F, -1F, -8F, -2F, 0F, 0F, 0F, 0F, -2F, -26.5F, -2F, 5F, -26.5F, -2F, 5F, -26.5F, 0F, -2F, -26.5F); // Box 27
		bodyModel[26].setRotationPoint(-76F, -6F, -26.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 43, 22, 2, 0F,0F, 0F, 0F, 0F, -4F, 0.7F, 0F, -4F, -0.7F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 10F, 10F, 0F, 10F, -10F, 0F, 0F, -9F); // Box 28
		bodyModel[27].setRotationPoint(-119F, -38F, -16.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 43, 22, 2, 0F,0F, 0F, 0F, 0F, -4F, -0.7F, 0F, -4F, 0.7F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 10F, -10F, 0F, 10F, 10F, 0F, 0F, 9F); // Box 29
		bodyModel[28].setRotationPoint(-119F, -38F, 14.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 45, 10, 53, 0F,0F, 0F, -1F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 0F, -1F, 0F, 2F, -26.5F, -2F, 8F, -26.5F, -2F, 8F, -26.5F, 0F, 2F, -26.5F); // Box 30
		bodyModel[29].setRotationPoint(-119F, -16F, -26.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 47, 10, 53, 0F,0F, 0F, -10F, -2F, -11F, -1F, -2F, -11F, -1F, 0F, 0F, -10F, 0F, 2F, -26.5F, -2F, 13F, -26.5F, -2F, 13F, -26.5F, 0F, 2F, -26.5F); // Box 31
		bodyModel[30].setRotationPoint(-164F, -27F, -26.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 9, 14, 25, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, -6F, -12.5F, 0F, 0F, -12.5F, 0F, 0F, -12.5F, 0F, -6F, -12.5F); // Box 32
		bodyModel[31].setRotationPoint(-173F, -29F, -12.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 14, 25, 0F,0F, 0F, -12F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, -12F, -3F, -10F, -12.5F, 1F, -4F, -12.5F, 1F, -4F, -12.5F, -3F, -10F, -12.5F); // Box 33
		bodyModel[32].setRotationPoint(-183F, -31F, -12.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 60, 10, 36, 0F,0F, 0F, 0F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, 0F, 0F, 1F, -5F, -18F, -1F, -12F, -18F, -1F, -12F, -18F, 1F, -5F, -18F); // Box 34
		bodyModel[33].setRotationPoint(66F, 0F, -18F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 40, 10, 28, 0F,0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 1F, -6F, -14F, 0F, -11F, -14F, 0F, -11F, -14F, 1F, -6F, -14F); // Box 35
		bodyModel[34].setRotationPoint(126F, -6F, -14F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, -12F); // Box 36
		bodyModel[35].setRotationPoint(166F, -10F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 48, 3, 24, 0F,0F, 0F, 0F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -7F, -12F, 0F, -7F, -12F, 0F, -1F, -12F); // Box 37
		bodyModel[36].setRotationPoint(177F, -10F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -8F, -3F, 0F, -8F, -3F, 0F, 8F, 3F, 0F, 8F); // Box 45
		bodyModel[37].setRotationPoint(-34F, -35F, 15F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 29, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -8F, -3F, 0F, -8F, -3F, 0F, 8F, 3F, 0F, 8F); // Box 46
		bodyModel[38].setRotationPoint(-28F, -34F, 15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(-34F, -33F, 16F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[40].setRotationPoint(-35F, -27F, 18F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[41].setRotationPoint(-36F, -20F, 20F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[42].setRotationPoint(-36F, -15F, 21F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[43].setRotationPoint(-37F, -8F, 23F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 22, 4, 46, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 52
		bodyModel[44].setRotationPoint(177F, -39F, 4.99F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 22, 4, 22, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -7F, -1F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -3F, -5F); // Box 53
		bodyModel[45].setRotationPoint(177F, -39F, 50.99F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 20, 4, 22, 0F,0F, -1F, 0F, 0F, -3F, 1F, -8F, -3F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -8F, -1F, -8F, 0F, -2F, 0F); // Box 54
		bodyModel[46].setRotationPoint(199F, -39F, 50.99F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 22, 4, 46, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 56
		bodyModel[47].setRotationPoint(177F, -39F, -50.99F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 22, 4, 22, 0F,-7F, -1F, -5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -7F, -3F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 57
		bodyModel[48].setRotationPoint(177F, -39F, -72.99F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 20, 4, 22, 0F,0F, -2F, 0F, -8F, -3F, -8F, 0F, -3F, 1F, 0F, -1F, 0F, 0F, -2F, 0F, -8F, -1F, -8F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 58
		bodyModel[49].setRotationPoint(199F, -39F, -72.99F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 34, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -2F, 0F, -1F, 13F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 13F, 0F, -1F); // Box 60
		bodyModel[50].setRotationPoint(191F, -72F, -38.99F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 34, 1, 0F,-2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, 13F, 0F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, 13F, 0F, 0F); // Box 62
		bodyModel[51].setRotationPoint(191F, -72F, 37.99F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 64
		bodyModel[52].setRotationPoint(-42F, -73F, 167.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 66
		bodyModel[53].setRotationPoint(-16F, -69F, 168.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 67
		bodyModel[54].setRotationPoint(-16F, -69F, 167.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 68
		bodyModel[55].setRotationPoint(-42F, -73F, 168.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 69
		bodyModel[56].setRotationPoint(-42F, -73F, -168.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 70
		bodyModel[57].setRotationPoint(-16F, -69F, -169.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // Box 71
		bodyModel[58].setRotationPoint(-16F, -69F, -168.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F); // Box 72
		bodyModel[59].setRotationPoint(-42F, -73F, -169.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 43, 2, 41, 0F,0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1F, 0F, 4F, 1F, 0F, 0F, 0F); // Box 72
		bodyModel[60].setRotationPoint(-119F, -24.01F, -20.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[61].setRotationPoint(-63F, -75F, 26.01F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[62].setRotationPoint(-63F, -79F, 26.01F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[63].setRotationPoint(-63F, -81F, 28.01F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 28, 2, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, -4F); // Box 76
		bodyModel[64].setRotationPoint(-63F, -67F, 28.01F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 28, 4, 17, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -2F); // Box 77
		bodyModel[65].setRotationPoint(-63F, -71F, 26.01F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 78
		bodyModel[66].setRotationPoint(-47F, -78F, 26.01F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F,0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 79
		bodyModel[67].setRotationPoint(-47F, -79F, 28.01F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 1F, -4F, -5F, 1F, -4F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 80
		bodyModel[68].setRotationPoint(-31F, -76F, 28.01F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[69].setRotationPoint(-79F, -81F, 28.01F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[70].setRotationPoint(-79F, -79F, 26.01F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[71].setRotationPoint(-79F, -75F, 26.01F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 87
		bodyModel[72].setRotationPoint(-79F, -71F, 26.01F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 88
		bodyModel[73].setRotationPoint(-79F, -67F, 28.01F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, 0F, -4F, 1F, -4F, -5F, 1F, -4F, -5F, 0F, 0F, -3F); // Box 89
		bodyModel[74].setRotationPoint(-35F, -66F, 28.01F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, -5F, 0F, 0F, -2F); // Box 90
		bodyModel[75].setRotationPoint(-35F, -68F, 26.01F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[76].setRotationPoint(-63F, -75F, -43.01F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[77].setRotationPoint(-63F, -79F, -43.01F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[78].setRotationPoint(-63F, -81F, -41.01F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 28, 2, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, -4F); // Box 94
		bodyModel[79].setRotationPoint(-63F, -67F, -41.01F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 28, 4, 17, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -2F); // Box 95
		bodyModel[80].setRotationPoint(-63F, -71F, -43.01F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 96
		bodyModel[81].setRotationPoint(-47F, -78F, -43.01F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F,0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 97
		bodyModel[82].setRotationPoint(-47F, -79F, -41.01F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -3F, 1F, -4F, -5F, 1F, -4F, -5F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 98
		bodyModel[83].setRotationPoint(-31F, -76F, -40.01F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[84].setRotationPoint(-79F, -81F, -41.01F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[85].setRotationPoint(-79F, -79F, -43.01F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[86].setRotationPoint(-79F, -75F, -43.01F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 102
		bodyModel[87].setRotationPoint(-79F, -71F, -43.01F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 103
		bodyModel[88].setRotationPoint(-79F, -67F, -41.01F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -3F, 1F, -4F, -5F, 1F, -4F, -5F, 0F, 0F, -4F); // Box 104
		bodyModel[89].setRotationPoint(-35F, -66F, -40.01F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 105
		bodyModel[90].setRotationPoint(-35F, -68F, -43.01F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[91].setRotationPoint(-61F, -77F, -103.01F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[92].setRotationPoint(-61F, -81F, -103.01F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[93].setRotationPoint(-61F, -83F, -101.01F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 28, 2, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, -4F); // Box 109
		bodyModel[94].setRotationPoint(-61F, -69F, -101.01F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 28, 4, 17, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -2F); // Box 110
		bodyModel[95].setRotationPoint(-61F, -73F, -103.01F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 111
		bodyModel[96].setRotationPoint(-45F, -80F, -103.01F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F,0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 112
		bodyModel[97].setRotationPoint(-45F, -81F, -101.01F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -3F, 1F, -4F, -5F, 1F, -4F, -5F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 113
		bodyModel[98].setRotationPoint(-29F, -78F, -100.01F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[99].setRotationPoint(-77F, -83F, -101.01F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[100].setRotationPoint(-77F, -81F, -103.01F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[101].setRotationPoint(-77F, -77F, -103.01F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 117
		bodyModel[102].setRotationPoint(-77F, -73F, -103.01F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 118
		bodyModel[103].setRotationPoint(-77F, -69F, -101.01F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, -3F, 1F, -4F, -5F, 1F, -4F, -5F, 0F, 0F, -4F); // Box 119
		bodyModel[104].setRotationPoint(-33F, -68F, -100.01F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 120
		bodyModel[105].setRotationPoint(-33F, -70F, -103.01F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[106].setRotationPoint(-61F, -77F, 86.01F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[107].setRotationPoint(-61F, -81F, 86.01F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[108].setRotationPoint(-61F, -83F, 88.01F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 28, 2, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, -4F); // Box 124
		bodyModel[109].setRotationPoint(-61F, -69F, 88.01F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 28, 4, 17, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, -2F); // Box 125
		bodyModel[110].setRotationPoint(-61F, -73F, 86.01F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 16, 3, 17, 0F,0F, 0F, -2F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 126
		bodyModel[111].setRotationPoint(-45F, -80F, 86.01F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F,0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 127
		bodyModel[112].setRotationPoint(-45F, -81F, 88.01F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, 0F, -4F, 1F, -4F, -5F, 1F, -4F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F); // Box 128
		bodyModel[113].setRotationPoint(-29F, -78F, 88.01F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[114].setRotationPoint(-77F, -83F, 88.01F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[115].setRotationPoint(-77F, -81F, 86.01F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[116].setRotationPoint(-77F, -77F, 86.01F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 16, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 132
		bodyModel[117].setRotationPoint(-77F, -73F, 86.01F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 133
		bodyModel[118].setRotationPoint(-77F, -69F, 88.01F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 4, 12, 0F,0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, 0F, -4F, 1F, -4F, -5F, 1F, -4F, -5F, 0F, 0F, -3F); // Box 134
		bodyModel[119].setRotationPoint(-33F, -68F, 88.01F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, -5F, 0F, 0F, -2F); // Box 135
		bodyModel[120].setRotationPoint(-33F, -70F, 86.01F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 3F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, 8F, 3F, 0F, 8F); // Box 136
		bodyModel[121].setRotationPoint(-50.02F, -54F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 16, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 8F, -1F, 0F, 8F, -1F, 0F, -8F, 3F, 0F, -8F); // Box 138
		bodyModel[122].setRotationPoint(-50.02F, -54F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 17, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 8F, -1F, 0F, 8F, -1F, 0F, -8F, 3F, 0F, -8F); // Box 139
		bodyModel[123].setRotationPoint(-17.02F, -51F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 7, 17, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 3F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, 8F, 3F, 0F, 8F); // Box 140
		bodyModel[124].setRotationPoint(-17.02F, -51F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 11, 1, 0F,1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[125].setRotationPoint(-17.02F, -62F, -0.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 8, 1, 0F,-7F, 3F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, -7F, 3F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 143
		bodyModel[126].setRotationPoint(-48.02F, -62F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 147, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 63F, 0F, 0F, 63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F); // Box 144
		bodyModel[127].setRotationPoint(-21F, -8F, 22F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 147, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 63F, 0F, 0F, 63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F); // Box 145
		bodyModel[128].setRotationPoint(-48F, -10F, 21F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[129].setRotationPoint(-48F, -34.5F, 76F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 147, 0F,0F, 63F, 0F, 0F, 63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[130].setRotationPoint(-21F, -8F, -169F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 147, 0F,0F, 63F, 0F, 0F, 63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -63F, 0F, 0F, -63F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[131].setRotationPoint(-48F, -10F, -168F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 29, 2, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[132].setRotationPoint(-48F, -34.5F, -78F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 28, 12, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 150
		bodyModel[133].setRotationPoint(-53F, -34F, 168.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 27, 12, 9, 0F,0F, -1F, 0F, 0F, -7F, 0F, -12F, -7F, -6F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 1F, -5F, 0F, 0F, -0.3F); // Box 151
		bodyModel[134].setRotationPoint(-25F, -34F, 168.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 27, 12, 9, 0F,0F, -4F, -3F, -12F, -7F, -6F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, -11F, 1F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[135].setRotationPoint(-25F, -34F, 159.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 28, 12, 9, 0F,0F, -3F, -3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 153
		bodyModel[136].setRotationPoint(-53F, -34F, 159.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 14, 12, 9, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -6F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -5F, -4F); // Box 154
		bodyModel[137].setRotationPoint(-67F, -34F, 168.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 14, 12, 9, 0F,-6F, -3F, -6F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, -5F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Box 155
		bodyModel[138].setRotationPoint(-67F, -34F, 159.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -3F); // Box 156
		bodyModel[139].setRotationPoint(-53F, -24F, 168.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 157
		bodyModel[140].setRotationPoint(-53F, -24F, 159.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 27, 5, 9, 0F,0F, 0F, -0.3F, -11F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -13F, -1F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[141].setRotationPoint(-25F, -22F, 159.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 27, 5, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -1F, -5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -1F, -9F, 0F, 0F, -9F); // Box 159
		bodyModel[142].setRotationPoint(-25F, -22F, 168.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 14, 7, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -2F, -4F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -8F, -3F, -4F); // Box 160
		bodyModel[143].setRotationPoint(-67F, -29F, 168.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 7, 9, 0F,-5F, -2F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -3F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, -7F, -1F, 0F); // Box 161
		bodyModel[144].setRotationPoint(-67F, -29F, 159.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 28, 12, 9, 0F,0F, -3F, -3F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 162
		bodyModel[145].setRotationPoint(-53F, -34F, -177.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 27, 12, 9, 0F,0F, -4F, -3F, -12F, -7F, -6F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, -0.3F, -11F, 1F, -5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[146].setRotationPoint(-25F, -34F, -177.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 27, 12, 9, 0F,0F, -1F, 0F, 0F, -7F, 0F, -12F, -7F, -6F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 1F, -5F, 0F, 0F, -0.3F); // Box 164
		bodyModel[147].setRotationPoint(-25F, -34F, -168.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 28, 12, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 165
		bodyModel[148].setRotationPoint(-53F, -34F, -168.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 14, 12, 9, 0F,-6F, -3F, -6F, 0F, -3F, -3F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, -5F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Box 166
		bodyModel[149].setRotationPoint(-67F, -34F, -177.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 14, 12, 9, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -6F, -3F, -6F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, -5F, -4F); // Box 167
		bodyModel[150].setRotationPoint(-67F, -34F, -168.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 168
		bodyModel[151].setRotationPoint(-53F, -24F, -177.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -3F); // Box 169
		bodyModel[152].setRotationPoint(-53F, -24F, -168.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 27, 5, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, -11F, -1F, -5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -1F, -9F, 0F, 0F, -9F); // Box 170
		bodyModel[153].setRotationPoint(-25F, -22F, -168.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 27, 5, 9, 0F,0F, 0F, -0.3F, -11F, -1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -13F, -1F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[154].setRotationPoint(-25F, -22F, -177.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 14, 7, 9, 0F,-5F, -2F, -4F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -8F, -3F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, -7F, -1F, 0F); // Box 172
		bodyModel[155].setRotationPoint(-67F, -29F, -177.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 14, 7, 9, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -2F, -4F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, -8F, -3F, -4F); // Box 173
		bodyModel[156].setRotationPoint(-67F, -29F, -168.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[157].setRotationPoint(-119.5F, -39F, -4F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[158].setRotationPoint(-119.5F, -37F, 4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[159].setRotationPoint(-119.5F, -37F, -16F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[160].setRotationPoint(-119.5F, -45F, -4F);
		bodyModel[160].rotateAngleZ = -0.12217305F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[161].setRotationPoint(-101.5F, -41F, -12F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[162].setRotationPoint(-101.5F, -41F, 4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 20, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[163].setRotationPoint(-77.5F, -39F, -13F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 20, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[164].setRotationPoint(-77.5F, -39F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[165].setRotationPoint(-109.5F, -29F, 4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[166].setRotationPoint(-109.5F, -29F, -12F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 189
		bodyModel[167].setRotationPoint(-120F, -45.5F, 7.5F);
		bodyModel[167].rotateAngleZ = -0.52359878F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 190
		bodyModel[168].setRotationPoint(-120F, -45.5F, -8.5F);
		bodyModel[168].rotateAngleZ = -0.52359878F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 191
		bodyModel[169].setRotationPoint(225F, -17F, -8.01F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 192
		bodyModel[170].setRotationPoint(225F, -23F, -8.01F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 193
		bodyModel[171].setRotationPoint(225F, -23F, 3.01F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[172].setRotationPoint(231F, -23F, -3.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[173].setRotationPoint(66.01F, -30.5F, -8F);
		bodyModel[173].rotateAngleZ = 0.01745329F;

		bodyModel[174].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 198
		bodyModel[174].setRotationPoint(-89F, -76.5F, 31.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[175].setRotationPoint(-169.01F, -43.2F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 13, 8, 8, 0F,0F, 0F, 0F, -3F, -2F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[176].setRotationPoint(55F, -30F, -18.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 13, 8, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, -3F, 0F, 0F, 0F); // Box 212
		bodyModel[177].setRotationPoint(44F, -30F, 10.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 228
		bodyModel[178].setRotationPoint(-89F, -76.5F, -37.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 229
		bodyModel[179].setRotationPoint(-86F, -78.5F, -97.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 230
		bodyModel[180].setRotationPoint(-86F, -78.5F, 91.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F); // Box 225
		bodyModel[181].setRotationPoint(-85.5F, -26F, -12F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 417, 457, textureX, textureY); // Box 42
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 43
		leftWingModel[2] = new ModelRendererTurbo(this, 521, 473, textureX, textureY); // Box 44
		leftWingModel[3] = new ModelRendererTurbo(this, 57, 393, textureX, textureY); // Box 174
		leftWingModel[4] = new ModelRendererTurbo(this, 857, 401, textureX, textureY); // Box 175
		leftWingModel[5] = new ModelRendererTurbo(this, 273, 393, textureX, textureY); // Box 176
		leftWingModel[6] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 214
		leftWingModel[7] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 215
		leftWingModel[8] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 216
		leftWingModel[9] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 217
		leftWingModel[10] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 219
		leftWingModel[11] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 220
		leftWingModel[12] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 221
		leftWingModel[13] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 222
		leftWingModel[14] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 223
		leftWingModel[15] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 224
		leftWingModel[16] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 225
		leftWingModel[17] = new ModelRendererTurbo(this, 100, 900, textureX, textureY); // Box 226

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 51, 0, 126, 0F,-8F, 5F, 0F, -10F, 0F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, -8F, 0F, 0F, -10F, 2F, 0F, 0F, 14F, 0F, 0F, 9F, 0F); // Box 42
		leftWingModel[0].setRotationPoint(-51F, -81F, -288F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 7, 2, 126, 0F,-8F, -1F, 0F, 8F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, -8F, 0F, 0F, 8F, 3F, 0F, 0F, 12F, 0F, 0F, 7F, 0F); // Box 43
		leftWingModel[1].setRotationPoint(-58F, -86F, -288.01F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 14, 7, 126, 0F,10F, 7F, 0F, -15F, 5F, 0F, 2F, -6F, -1F, 0F, 0F, 0F, 10F, -12F, 0F, -15F, -12F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 44
		leftWingModel[2].setRotationPoint(0F, -74F, -288F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 24, 0F,0F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, 3F, 0F, 6F, 0F, 0F); // Box 174
		leftWingModel[3].setRotationPoint(-44F, -86F, -312.01F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 27, 6, 24, 0F,0F, 0F, 0F, -9F, -3F, 0F, 0F, -5F, 0F, 6F, 0F, 0F, 0F, -3F, 0F, -9F, -1F, 0F, 0F, 1F, 0F, 6F, -1F, 0F); // Box 175
		leftWingModel[4].setRotationPoint(-37F, -86F, -312F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 24, 0F,0F, 0F, 0F, 0F, -2F, 0F, 11F, -4F, 0F, -9F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 11F, 3F, 0F, -9F, 3F, 0F); // Box 176
		leftWingModel[5].setRotationPoint(-19F, -83F, -312.01F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 214
		leftWingModel[6].setRotationPoint(-34F, -84.7F, -285F);
		leftWingModel[6].rotateAngleX = -0.03490659F;
		leftWingModel[6].rotateAngleZ = -0.13962634F;

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 215
		leftWingModel[7].setRotationPoint(-34F, -84F, 267F);
		leftWingModel[7].rotateAngleX = 0.03490659F;
		leftWingModel[7].rotateAngleZ = -0.13962634F;

		leftWingModel[8].addShapeBox(6F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		leftWingModel[8].setRotationPoint(-34F, -84F, 267F);
		leftWingModel[8].rotateAngleX = 0.03490659F;
		leftWingModel[8].rotateAngleZ = -0.13962634F;

		leftWingModel[9].addShapeBox(12F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 217
		leftWingModel[9].setRotationPoint(-34F, -84F, 267F);
		leftWingModel[9].rotateAngleX = 0.03490659F;
		leftWingModel[9].rotateAngleZ = -0.13962634F;

		leftWingModel[10].addShapeBox(6F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		leftWingModel[10].setRotationPoint(-34F, -84.7F, -285F);
		leftWingModel[10].rotateAngleX = -0.03490659F;
		leftWingModel[10].rotateAngleZ = -0.13962634F;

		leftWingModel[11].addShapeBox(12F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 220
		leftWingModel[11].setRotationPoint(-34F, -84.7F, -285F);
		leftWingModel[11].rotateAngleX = -0.03490659F;
		leftWingModel[11].rotateAngleZ = -0.13962634F;

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 221
		leftWingModel[12].setRotationPoint(-34F, -80.7F, -285F);
		leftWingModel[12].rotateAngleX = -0.08726646F;
		leftWingModel[12].rotateAngleZ = -0.06981317F;

		leftWingModel[13].addShapeBox(6F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		leftWingModel[13].setRotationPoint(-34F, -80.7F, -285F);
		leftWingModel[13].rotateAngleX = -0.08726646F;
		leftWingModel[13].rotateAngleZ = -0.06981317F;

		leftWingModel[14].addShapeBox(12F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 223
		leftWingModel[14].setRotationPoint(-34F, -80.7F, -285F);
		leftWingModel[14].rotateAngleX = -0.08726646F;
		leftWingModel[14].rotateAngleZ = -0.06981317F;

		leftWingModel[15].addShapeBox(6F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftWingModel[15].setRotationPoint(-34F, -79F, 267F);
		leftWingModel[15].rotateAngleX = 0.08726646F;
		leftWingModel[15].rotateAngleZ = -0.06981317F;

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 225
		leftWingModel[16].setRotationPoint(-34F, -79F, 267F);
		leftWingModel[16].rotateAngleX = 0.08726646F;
		leftWingModel[16].rotateAngleZ = -0.06981317F;

		leftWingModel[17].addShapeBox(12F, 0F, 0F, 6, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 226
		leftWingModel[17].setRotationPoint(-34F, -79F, 267F);
		leftWingModel[17].rotateAngleX = 0.08726646F;
		leftWingModel[17].rotateAngleZ = -0.06981317F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 38
		rightWingModel[1] = new ModelRendererTurbo(this, 553, 265, textureX, textureY); // Box 39
		rightWingModel[2] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 41
		rightWingModel[3] = new ModelRendererTurbo(this, 433, 401, textureX, textureY); // Box 177
		rightWingModel[4] = new ModelRendererTurbo(this, 665, 417, textureX, textureY); // Box 178
		rightWingModel[5] = new ModelRendererTurbo(this, 753, 401, textureX, textureY); // Box 179

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 51, 0, 126, 0F,0F, 1F, 0F, 0F, -7F, 0F, -10F, 0F, 0F, -8F, 5F, 0F, 0F, 9F, 0F, 0F, 14F, 0F, -10F, 2F, 0F, -8F, 0F, 0F); // Box 38
		rightWingModel[0].setRotationPoint(-51F, -81F, 162F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 7, 2, 126, 0F,0F, -7F, 0F, 0F, -4F, 0F, 8F, 0F, 0F, -8F, -1F, 0F, 0F, 7F, 0F, 0F, 12F, 0F, 8F, 3F, 0F, -8F, 0F, 0F); // Box 39
		rightWingModel[1].setRotationPoint(-58F, -86F, 162.01F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 14, 7, 126, 0F,0F, 0F, 0F, 2F, -6F, -1F, -15F, 5F, 0F, 10F, 7F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -15F, -12F, 0F, 10F, -12F, 0F); // Box 41
		rightWingModel[2].setRotationPoint(0F, -74F, 162F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 24, 0F,6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F, 0F, 0F, -6F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 177
		rightWingModel[3].setRotationPoint(-44F, -86F, 288.01F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 27, 6, 24, 0F,6F, 0F, 0F, 0F, -5F, 0F, -9F, -3F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 0F, 1F, 0F, -9F, -1F, 0F, 0F, -3F, 0F); // Box 178
		rightWingModel[4].setRotationPoint(-37F, -86F, 288F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 24, 0F,-9F, -2F, 0F, 11F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, 11F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 179
		rightWingModel[5].setRotationPoint(-19F, -83F, 288.01F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 61
		yawFlapModel[1] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 63

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 22, 33, 1, 0F,0F, 0F, 0F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, -2F, -0.5F, -3F, -2F, -0.5F, 1F, 0F, 0F); // Box 61
		yawFlapModel[0].setRotationPoint(199F, -72F, -39F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 22, 33, 1, 0F,0F, 0F, 0F, -4F, -2F, -0.5F, -4F, -2F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, -2F, -0.5F, -3F, -2F, -0.5F, 1F, 0F, 0F); // Box 63
		yawFlapModel[1].setRotationPoint(199F, -72F, 39F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Box 40
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 59

		pitchFlapLeftModel[0].addShapeBox(0F, 3F, 0F, 15, 7, 160, 0F,0F, 7F, 0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 40
		pitchFlapLeftModel[0].setRotationPoint(0F, -69F, -162F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 19, 4, 46, 0F,0F, -1F, 0F, 0F, -3F, -1F, 0F, -4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 59
		pitchFlapLeftModel[1].setRotationPoint(199F, -39F, -50.99F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 665, 305, textureX, textureY); // Box 39
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 833, 161, textureX, textureY); // Box 55

		pitchFlapRightModel[0].addShapeBox(0F, -3F, 0F, 15, 7, 160, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -9F, 0F, 0F, -8F, 0F); // Box 39
		pitchFlapRightModel[0].setRotationPoint(0F, -63F, 2F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 19, 4, 46, 0F,0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 55
		pitchFlapRightModel[1].setRotationPoint(199F, -39F, 4.99F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][3];
		propellerModels[0] = makeProp1(-80F, -75.5F, 94.5F);
		propellerModels[1] = makeProp2(-80F, -75.5F, -94.5F);
		propellerModels[2] = makeProp3(-83F, -73.5F, -34.5F);
		propellerModels[3] = makeProp4(-83F, -73.5F, 34.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[0].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[1].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[2].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[0].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[1].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[2].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[0].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[1].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[2].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 950, 950, textureX, textureY);
		prop[0].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[1].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[2].addBox(-0.5F, -24F, -1F, 1, 24, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[1];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 3

		gun_4_Model[0][0].addShapeBox(-1F, -1.5F, -2F, 2, 4, 4, 0F,-0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F); // Box 3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-170F, -45F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[3];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 201
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 202
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 203

		gun_4_Model[2][0].addShapeBox(-2F, -2F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 201

		gun_4_Model[2][1].addShapeBox(3F, -2F, -1F, 10, 2, 2, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 202

		gun_4_Model[2][2].addShapeBox(2F, -3.5F, -2F, 2, 4, 4, 0F,1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F); // Box 203

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(-170F, -45F, 0F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[1];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 3

		gun_5_Model[0][0].addShapeBox(-1F, -1.5F, -2F, 2, 4, 4, 0F,-0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F); // Box 3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(48F, -25F, 14F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[3];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 201
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 202
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 203

		gun_5_Model[2][0].addShapeBox(-2F, -2F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 201

		gun_5_Model[2][1].addShapeBox(3F, -2F, -1F, 10, 2, 2, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 202

		gun_5_Model[2][2].addShapeBox(2F, -3.5F, -2F, 2, 4, 4, 0F,1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F); // Box 203

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(48F, -25F, 14F);
		}


		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[1];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 3

		gun_6_Model[0][0].addShapeBox(-1F, -1.5F, -2F, 2, 4, 4, 0F,-0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F); // Box 3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(59F, -25F, -14F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[0];

		gun_6_Model[2] = new ModelRendererTurbo[3];
		gun_6_Model[2][0] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 201
		gun_6_Model[2][1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 202
		gun_6_Model[2][2] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 203

		gun_6_Model[2][0].addShapeBox(-2F, -2F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 201

		gun_6_Model[2][1].addShapeBox(3F, -2F, -1F, 10, 2, 2, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 202

		gun_6_Model[2][2].addShapeBox(2F, -3.5F, -2F, 2, 4, 4, 0F,1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F); // Box 203

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[2])
		{
			gunPart.setRotationPoint(59F, -25F, -14F);
		}


		registerGunModel("PassengerGun6", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[1];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 3

		gun_7_Model[0][0].addShapeBox(-1F, -1.5F, -2F, 2, 4, 4, 0F,-0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -1.5F); // Box 3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(83F, -32F, 0F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[0];

		gun_7_Model[2] = new ModelRendererTurbo[3];
		gun_7_Model[2][0] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 201
		gun_7_Model[2][1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 202
		gun_7_Model[2][2] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 203

		gun_7_Model[2][0].addShapeBox(-2F, -2F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 201

		gun_7_Model[2][1].addShapeBox(3F, -2F, -1F, 10, 2, 2, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 202

		gun_7_Model[2][2].addShapeBox(2F, -3.5F, -2F, 2, 4, 4, 0F,1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F); // Box 203

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[2])
		{
			gunPart.setRotationPoint(83F, -32F, 0F);
		}


		registerGunModel("PassengerGun7", gun_7_Model);

		// Passenger 9
		ModelRendererTurbo[][] gun_8_Model = new ModelRendererTurbo[3][];

		gun_8_Model[0] = new ModelRendererTurbo[0];

		gun_8_Model[1] = new ModelRendererTurbo[0];

		gun_8_Model[2] = new ModelRendererTurbo[3];
		gun_8_Model[2][0] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 201
		gun_8_Model[2][1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 202
		gun_8_Model[2][2] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 203

		gun_8_Model[2][0].addShapeBox(-2F, -2F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 201

		gun_8_Model[2][1].addShapeBox(10F, -2F, -1F, 10, 2, 2, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 202

		gun_8_Model[2][2].addShapeBox(2F, -1F, -2F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_8_Model[2])
		{
			gunPart.setRotationPoint(231F, -24F, 0F);
		}


		registerGunModel("PassengerGun8", gun_8_Model);
	}
}