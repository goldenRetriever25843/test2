//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hibiki
// Model Creator: 
// Created on: 03.06.2016 - 20:55:10
// Last changed on: 03.06.2016 - 20:55:10

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIkazuchi extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelIkazuchi() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[181];
		turretModel = new ModelRendererTurbo[30];

		initbodyModel_1();
		initturretModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 12, 844, textureX, textureY); // Box 8
		bodyModel[1] = new ModelRendererTurbo(this, 259, 933, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 282, 836, textureX, textureY); // Box 20
		bodyModel[3] = new ModelRendererTurbo(this, 276, 753, textureX, textureY); // Box 21
		bodyModel[4] = new ModelRendererTurbo(this, 4, 689, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 536, 535, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 532, 462, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 371, 614, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 362, 691, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 534, 296, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 661, 296, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 386, 239, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 586, 235, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 504, 237, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 604, 140, textureX, textureY); // Box 79
		bodyModel[15] = new ModelRendererTurbo(this, 537, 139, textureX, textureY); // Box 80
		bodyModel[16] = new ModelRendererTurbo(this, 473, 135, textureX, textureY); // Box 81
		bodyModel[17] = new ModelRendererTurbo(this, 621, 175, textureX, textureY); // Box 82
		bodyModel[18] = new ModelRendererTurbo(this, 675, 145, textureX, textureY); // Box 83
		bodyModel[19] = new ModelRendererTurbo(this, 502, 211, textureX, textureY); // Box 84
		bodyModel[20] = new ModelRendererTurbo(this, 646, 241, textureX, textureY); // Box 85
		bodyModel[21] = new ModelRendererTurbo(this, 36, 95, textureX, textureY); // Box 116
		bodyModel[22] = new ModelRendererTurbo(this, 39, 81, textureX, textureY); // Box 117
		bodyModel[23] = new ModelRendererTurbo(this, 39, 81, textureX, textureY); // Box 118
		bodyModel[24] = new ModelRendererTurbo(this, 131, 228, textureX, textureY); // Box 119
		bodyModel[25] = new ModelRendererTurbo(this, 553, 176, textureX, textureY); // Box 120
		bodyModel[26] = new ModelRendererTurbo(this, 485, 177, textureX, textureY); // Box 121
		bodyModel[27] = new ModelRendererTurbo(this, 389, 173, textureX, textureY); // Box 122
		bodyModel[28] = new ModelRendererTurbo(this, 375, 206, textureX, textureY); // Box 123
		bodyModel[29] = new ModelRendererTurbo(this, 409, 104, textureX, textureY); // Box 124
		bodyModel[30] = new ModelRendererTurbo(this, 439, 105, textureX, textureY); // Box 125
		bodyModel[31] = new ModelRendererTurbo(this, 384, 104, textureX, textureY); // Box 126
		bodyModel[32] = new ModelRendererTurbo(this, 454, 167, textureX, textureY); // Box 127
		bodyModel[33] = new ModelRendererTurbo(this, 350, 137, textureX, textureY); // Box 128
		bodyModel[34] = new ModelRendererTurbo(this, 399, 140, textureX, textureY); // Box 129
		bodyModel[35] = new ModelRendererTurbo(this, 374, 137, textureX, textureY); // Box 130
		bodyModel[36] = new ModelRendererTurbo(this, 355, 122, textureX, textureY); // Box 131
		bodyModel[37] = new ModelRendererTurbo(this, 378, 170, textureX, textureY); // Box 132
		bodyModel[38] = new ModelRendererTurbo(this, 408, 86, textureX, textureY); // Box 133
		bodyModel[39] = new ModelRendererTurbo(this, 457, 138, textureX, textureY); // Box 134
		bodyModel[40] = new ModelRendererTurbo(this, 435, 86, textureX, textureY); // Box 135
		bodyModel[41] = new ModelRendererTurbo(this, 359, 103, textureX, textureY); // Box 136
		bodyModel[42] = new ModelRendererTurbo(this, 386, 85, textureX, textureY); // Box 137
		bodyModel[43] = new ModelRendererTurbo(this, 361, 84, textureX, textureY); // Box 138
		bodyModel[44] = new ModelRendererTurbo(this, 633, 417, textureX, textureY); // Box 140
		bodyModel[45] = new ModelRendererTurbo(this, 604, 417, textureX, textureY); // Box 141
		bodyModel[46] = new ModelRendererTurbo(this, 637, 435, textureX, textureY); // Box 142
		bodyModel[47] = new ModelRendererTurbo(this, 660, 421, textureX, textureY); // Box 143
		bodyModel[48] = new ModelRendererTurbo(this, 629, 393, textureX, textureY); // Box 144
		bodyModel[49] = new ModelRendererTurbo(this, 608, 395, textureX, textureY); // Box 145
		bodyModel[50] = new ModelRendererTurbo(this, 611, 438, textureX, textureY); // Box 146
		bodyModel[51] = new ModelRendererTurbo(this, 546, 436, textureX, textureY); // Box 147
		bodyModel[52] = new ModelRendererTurbo(this, 540, 397, textureX, textureY); // Box 149
		bodyModel[53] = new ModelRendererTurbo(this, 587, 206, textureX, textureY); // Box 150
		bodyModel[54] = new ModelRendererTurbo(this, 642, 202, textureX, textureY); // Box 151
		bodyModel[55] = new ModelRendererTurbo(this, 641, 335, textureX, textureY); // Box 152
		bodyModel[56] = new ModelRendererTurbo(this, 585, 335, textureX, textureY); // Box 153
		bodyModel[57] = new ModelRendererTurbo(this, 617, 335, textureX, textureY); // Box 154
		bodyModel[58] = new ModelRendererTurbo(this, 544, 348, textureX, textureY); // Box 155
		bodyModel[59] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Box 186
		bodyModel[60] = new ModelRendererTurbo(this, 8, 228, textureX, textureY); // Box 187
		bodyModel[61] = new ModelRendererTurbo(this, 70, 231, textureX, textureY); // Box 188
		bodyModel[62] = new ModelRendererTurbo(this, 19, 604, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 8, 466, textureX, textureY); // Box 93
		bodyModel[64] = new ModelRendererTurbo(this, 82, 336, textureX, textureY); // Box 94
		bodyModel[65] = new ModelRendererTurbo(this, 88, 335, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 217, 206, textureX, textureY); // Box 96
		bodyModel[67] = new ModelRendererTurbo(this, 190, 245, textureX, textureY); // Box 97
		bodyModel[68] = new ModelRendererTurbo(this, 75, 187, textureX, textureY); // Box 98
		bodyModel[69] = new ModelRendererTurbo(this, 252, 249, textureX, textureY); // Box 99
		bodyModel[70] = new ModelRendererTurbo(this, 107, 225, textureX, textureY); // Box 100
		bodyModel[71] = new ModelRendererTurbo(this, 139, 201, textureX, textureY); // Box 101
		bodyModel[72] = new ModelRendererTurbo(this, 202, 184, textureX, textureY); // Box 102
		bodyModel[73] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 103
		bodyModel[74] = new ModelRendererTurbo(this, 50, 184, textureX, textureY); // Box 104
		bodyModel[75] = new ModelRendererTurbo(this, 30, 212, textureX, textureY); // Box 105
		bodyModel[76] = new ModelRendererTurbo(this, 3, 213, textureX, textureY); // Box 106
		bodyModel[77] = new ModelRendererTurbo(this, 3, 230, textureX, textureY); // Box 107
		bodyModel[78] = new ModelRendererTurbo(this, 171, 228, textureX, textureY); // Box 108
		bodyModel[79] = new ModelRendererTurbo(this, 227, 245, textureX, textureY); // Box 109
		bodyModel[80] = new ModelRendererTurbo(this, 193, 252, textureX, textureY); // Box 110
		bodyModel[81] = new ModelRendererTurbo(this, 195, 239, textureX, textureY); // Box 111
		bodyModel[82] = new ModelRendererTurbo(this, 195, 226, textureX, textureY); // Box 112
		bodyModel[83] = new ModelRendererTurbo(this, 31, 613, textureX, textureY); // Box 113
		bodyModel[84] = new ModelRendererTurbo(this, 76, 330, textureX, textureY); // Box 114
		bodyModel[85] = new ModelRendererTurbo(this, 96, 374, textureX, textureY); // Box 115
		bodyModel[86] = new ModelRendererTurbo(this, 7, 334, textureX, textureY); // Box 116
		bodyModel[87] = new ModelRendererTurbo(this, 94, 365, textureX, textureY); // Box 117
		bodyModel[88] = new ModelRendererTurbo(this, 24, 368, textureX, textureY); // Box 118
		bodyModel[89] = new ModelRendererTurbo(this, 2, 330, textureX, textureY); // Box 119
		bodyModel[90] = new ModelRendererTurbo(this, 96, 359, textureX, textureY); // Box 120
		bodyModel[91] = new ModelRendererTurbo(this, 96, 351, textureX, textureY); // Box 121
		bodyModel[92] = new ModelRendererTurbo(this, 2, 357, textureX, textureY); // Box 122
		bodyModel[93] = new ModelRendererTurbo(this, 99, 343, textureX, textureY); // Box 123
		bodyModel[94] = new ModelRendererTurbo(this, 631, 433, textureX, textureY); // Box 124
		bodyModel[95] = new ModelRendererTurbo(this, 586, 352, textureX, textureY); // Box 125
		bodyModel[96] = new ModelRendererTurbo(this, 605, 353, textureX, textureY); // Box 126
		bodyModel[97] = new ModelRendererTurbo(this, 102, 337, textureX, textureY); // Box 127
		bodyModel[98] = new ModelRendererTurbo(this, 281, 890, textureX, textureY); // Box 128
		bodyModel[99] = new ModelRendererTurbo(this, 16, 923, textureX, textureY); // Box 129
		bodyModel[100] = new ModelRendererTurbo(this, 17, 765, textureX, textureY); // Box 130
		bodyModel[101] = new ModelRendererTurbo(this, 4, 613, textureX, textureY); // Box 131
		bodyModel[102] = new ModelRendererTurbo(this, 356, 542, textureX, textureY); // Box 132
		bodyModel[103] = new ModelRendererTurbo(this, 355, 465, textureX, textureY); // Box 133
		bodyModel[104] = new ModelRendererTurbo(this, 534, 615, textureX, textureY); // Box 134
		bodyModel[105] = new ModelRendererTurbo(this, 494, 697, textureX, textureY); // Box 135
		bodyModel[106] = new ModelRendererTurbo(this, 253, 289, textureX, textureY); // Box 136
		bodyModel[107] = new ModelRendererTurbo(this, 92, 290, textureX, textureY); // Box 137
		bodyModel[108] = new ModelRendererTurbo(this, 253, 281, textureX, textureY); // Box 138
		bodyModel[109] = new ModelRendererTurbo(this, 92, 283, textureX, textureY); // Box 139
		bodyModel[110] = new ModelRendererTurbo(this, 3, 57, textureX, textureY); // Box 140
		bodyModel[111] = new ModelRendererTurbo(this, 3, 57, textureX, textureY); // Box 141
		bodyModel[112] = new ModelRendererTurbo(this, 3, 57, textureX, textureY); // Box 142
		bodyModel[113] = new ModelRendererTurbo(this, 3, 57, textureX, textureY); // Box 143
		bodyModel[114] = new ModelRendererTurbo(this, 3, 57, textureX, textureY); // Box 144
		bodyModel[115] = new ModelRendererTurbo(this, 3, 57, textureX, textureY); // Box 145
		bodyModel[116] = new ModelRendererTurbo(this, 321, 279, textureX, textureY); // Box 146
		bodyModel[117] = new ModelRendererTurbo(this, 320, 286, textureX, textureY); // Box 147
		bodyModel[118] = new ModelRendererTurbo(this, 305, 286, textureX, textureY); // Box 148
		bodyModel[119] = new ModelRendererTurbo(this, 306, 275, textureX, textureY); // Box 149
		bodyModel[120] = new ModelRendererTurbo(this, 217, 290, textureX, textureY); // Box 150
		bodyModel[121] = new ModelRendererTurbo(this, 218, 281, textureX, textureY); // Box 151
		bodyModel[122] = new ModelRendererTurbo(this, 282, 798, textureX, textureY); // Box 152
		bodyModel[123] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Box 156
		bodyModel[124] = new ModelRendererTurbo(this, 6, 110, textureX, textureY); // Box 157
		bodyModel[125] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Box 158
		bodyModel[126] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Box 159
		bodyModel[127] = new ModelRendererTurbo(this, 7, 82, textureX, textureY); // Box 160
		bodyModel[128] = new ModelRendererTurbo(this, 7, 97, textureX, textureY); // Box 161
		bodyModel[129] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 162
		bodyModel[130] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 163
		bodyModel[131] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 164
		bodyModel[132] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 165
		bodyModel[133] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 166
		bodyModel[134] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 167
		bodyModel[135] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 168
		bodyModel[136] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 169
		bodyModel[137] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Box 170
		bodyModel[138] = new ModelRendererTurbo(this, 139, 201, textureX, textureY); // Box 168
		bodyModel[139] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 169
		bodyModel[140] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 170
		bodyModel[141] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 171
		bodyModel[142] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 172
		bodyModel[143] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 173
		bodyModel[144] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 174
		bodyModel[145] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 175
		bodyModel[146] = new ModelRendererTurbo(this, 139, 201, textureX, textureY); // Box 176
		bodyModel[147] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 177
		bodyModel[148] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 178
		bodyModel[149] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 179
		bodyModel[150] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 180
		bodyModel[151] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 181
		bodyModel[152] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 182
		bodyModel[153] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 183
		bodyModel[154] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 194
		bodyModel[155] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 195
		bodyModel[156] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 196
		bodyModel[157] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 197
		bodyModel[158] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 198
		bodyModel[159] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 199
		bodyModel[160] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 200
		bodyModel[161] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 201
		bodyModel[162] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 202
		bodyModel[163] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 203
		bodyModel[164] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 204
		bodyModel[165] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 205
		bodyModel[166] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 206
		bodyModel[167] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 207
		bodyModel[168] = new ModelRendererTurbo(this, 139, 201, textureX, textureY); // Box 208
		bodyModel[169] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 209
		bodyModel[170] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 210
		bodyModel[171] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 211
		bodyModel[172] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 212
		bodyModel[173] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 213
		bodyModel[174] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 214
		bodyModel[175] = new ModelRendererTurbo(this, 154, 201, textureX, textureY); // Box 215
		bodyModel[176] = new ModelRendererTurbo(this, 139, 201, textureX, textureY); // Box 216
		bodyModel[177] = new ModelRendererTurbo(this, 139, 201, textureX, textureY); // Box 217
		bodyModel[178] = new ModelRendererTurbo(this, 139, 201, textureX, textureY); // Box 218
		bodyModel[179] = new ModelRendererTurbo(this, 139, 201, textureX, textureY); // Box 219
		bodyModel[180] = new ModelRendererTurbo(this, 534, 296, textureX, textureY); // Box 221

		bodyModel[0].addShapeBox(0F, 0F, 0F, 77, 14, 44, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 8
		bodyModel[0].setRotationPoint(-26F, -1F, -22F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 79, 21, 32, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 19
		bodyModel[1].setRotationPoint(51F, -8F, -16F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 55, 21, 14, 0F,0F, 0F, 9F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F); // Box 20
		bodyModel[2].setRotationPoint(130F, -8F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 25, 14, 0F,0F, -1F, 0F, 1F, 1F, -4F, 1F, 1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, 0F, 0F, 0F); // Box 21
		bodyModel[3].setRotationPoint(185F, -12F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 124, 14, 44, 0F); // Box 5
		bodyModel[4].setRotationPoint(-150F, -1F, -22F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 40, 14, 44, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 5
		bodyModel[5].setRotationPoint(-190F, -1F, -22F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 40, 14, 42, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 6
		bodyModel[6].setRotationPoint(-230F, -1F, -21F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 26, 14, 36, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 7
		bodyModel[7].setRotationPoint(-256F, -1F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 26, 14, 28, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 8
		bodyModel[8].setRotationPoint(-282F, -1F, -14F);

		bodyModel[9].addBox(0F, 0F, 0F, 35, 9, 24, 0F); // Box 9
		bodyModel[9].setRotationPoint(-188F, -10F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 9, 24, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 10
		bodyModel[10].setRotationPoint(-193F, -10F, -12F);

		bodyModel[11].addBox(0F, 0F, 0F, 23, 6, 25, 0F); // Box 11
		bodyModel[11].setRotationPoint(-42F, -7F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 6, 25, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 12
		bodyModel[12].setRotationPoint(-51F, -7F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 6, 25, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-19F, -7F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 4, 23, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 79
		bodyModel[14].setRotationPoint(-9F, -5F, -12F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 4, 23, 0F); // Box 80
		bodyModel[15].setRotationPoint(-3F, -5F, -12F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 81
		bodyModel[16].setRotationPoint(3F, -5F, -12F);

		bodyModel[17].addBox(0F, 0F, 0F, 11, 4, 18, 0F); // Box 82
		bodyModel[17].setRotationPoint(9F, -5F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 83
		bodyModel[18].setRotationPoint(20F, -5F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 23, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[19].setRotationPoint(29F, -5F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 85
		bodyModel[20].setRotationPoint(33F, -5F, 7F);

		bodyModel[21].addBox(0F, 0F, 0F, 6, 1, 12, 0F); // Box 116
		bodyModel[21].setRotationPoint(-4F, -6F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 117
		bodyModel[22].setRotationPoint(-7F, -6F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 118
		bodyModel[23].setRotationPoint(2F, -6F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 18, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 119
		bodyModel[24].setRotationPoint(80F, -26F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[25].setRotationPoint(29F, -13F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 5, 14, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[26].setRotationPoint(29F, -18F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 24, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[27].setRotationPoint(-47F, -17F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 38, 5, 18, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[28].setRotationPoint(-49F, -22F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 124
		bodyModel[29].setRotationPoint(30F, -38F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -2F); // Box 125
		bodyModel[30].setRotationPoint(28F, -38F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F); // Box 126
		bodyModel[31].setRotationPoint(35F, -38F, -4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[32].setRotationPoint(20F, -6F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -2F); // Box 128
		bodyModel[33].setRotationPoint(-52F, -37F, -4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 20, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 129
		bodyModel[34].setRotationPoint(-50F, -37F, -4F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 20, 8, 0F,5F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 130
		bodyModel[35].setRotationPoint(-25F, -37F, -4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[36].setRotationPoint(30F, -42F, -4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,-1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 132
		bodyModel[37].setRotationPoint(28F, -42F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 133
		bodyModel[38].setRotationPoint(35F, -42F, -4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[39].setRotationPoint(-40F, -43F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[40].setRotationPoint(-50F, -41F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 7, 8, 0F,1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 136
		bodyModel[41].setRotationPoint(-30F, -44F, -4F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 4, 8, 0F); // Box 137
		bodyModel[42].setRotationPoint(-42F, -41F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -2F); // Box 138
		bodyModel[43].setRotationPoint(-53F, -41F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 140
		bodyModel[44].setRotationPoint(-62F, -25F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 141
		bodyModel[45].setRotationPoint(-55F, -25F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[46].setRotationPoint(-60F, -25F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[47].setRotationPoint(-59F, -27F, -1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[48].setRotationPoint(-58F, -33F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 145
		bodyModel[49].setRotationPoint(-61F, -33F, -3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 146
		bodyModel[50].setRotationPoint(-60F, -21F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 22, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[51].setRotationPoint(-72F, -17F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -7F, 0F, 0F); // Box 149
		bodyModel[52].setRotationPoint(-72F, -14F, -5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 14, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -4F, 0F, 0F); // Box 150
		bodyModel[53].setRotationPoint(-65F, -7F, -5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 13, 12, 0F,0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F); // Box 151
		bodyModel[54].setRotationPoint(-51F, -14F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 152
		bodyModel[55].setRotationPoint(-112F, -13F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[56].setRotationPoint(-109F, -13F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 154
		bodyModel[57].setRotationPoint(-103F, -13F, -4F);

		bodyModel[58].addBox(0F, 0F, 0F, 10, 8, 16, 0F); // Box 155
		bodyModel[58].setRotationPoint(-111F, -9F, -8F);

		bodyModel[59].addBox(0F, 0F, 0F, 13, 18, 22, 0F); // Box 186
		bodyModel[59].setRotationPoint(67F, -26F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 18, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 187
		bodyModel[60].setRotationPoint(61F, -26F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 18, 18, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F); // Box 188
		bodyModel[61].setRotationPoint(54F, -26F, -9F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 27, 1, 0F); // Box 92
		bodyModel[62].setRotationPoint(-279F, -28F, -0.5F);

		bodyModel[63].addShapeBox(-72F, -55F, 0F, 160, 120, 1, 0F,-72F, -55F, -0.45F, -72F, -55F, -0.45F, -72F, -55F, -0.45F, -72F, -55F, -0.45F, -72F, -55F, -0.45F, -72F, -55F, -0.45F, -72F, -55F, -0.45F, -72F, -55F, -0.45F); // Box 93
		bodyModel[63].setRotationPoint(-295F, -26F, -0.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 46, 1, 0F); // Box 94
		bodyModel[64].setRotationPoint(-159F, -55F, -0.5F);
		bodyModel[64].rotateAngleZ = 0.12217305F;

		bodyModel[65].addBox(0F, 0F, -0.5F, 1, 52, 1, 0F); // Box 95
		bodyModel[65].setRotationPoint(46F, -79F, 0F);
		bodyModel[65].rotateAngleZ = 0.12217305F;

		bodyModel[66].addBox(0F, 0F, 0F, 13, 10, 22, 0F); // Box 96
		bodyModel[66].setRotationPoint(67F, -36F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 10, 22, 0F,0F, 0F, 0F, 2F, -2F, -6F, 2F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 97
		bodyModel[67].setRotationPoint(80F, -36F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 10, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 98
		bodyModel[68].setRotationPoint(61F, -36F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 10, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 99
		bodyModel[69].setRotationPoint(54F, -36F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 100
		bodyModel[70].setRotationPoint(46F, -28F, -6F);

		bodyModel[71].addBox(0F, 0F, 0F, 23, 5, 14, 0F); // Box 101
		bodyModel[71].setRotationPoint(53F, -41F, -7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 102
		bodyModel[72].setRotationPoint(76F, -41F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[73].setRotationPoint(55F, -41F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 104
		bodyModel[74].setRotationPoint(55F, -41F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 105
		bodyModel[75].setRotationPoint(67F, -44F, -4.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 3, 9, 0F); // Box 106
		bodyModel[76].setRotationPoint(64F, -44F, -4.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 107
		bodyModel[77].setRotationPoint(62F, -47F, -4.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 6, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 108
		bodyModel[78].setRotationPoint(56F, -47F, -4.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 6, 9, 0F); // Box 109
		bodyModel[79].setRotationPoint(58F, -47F, -4.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 5, 5, 0F); // Box 110
		bodyModel[80].setRotationPoint(58.5F, -52F, -2.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 111
		bodyModel[81].setRotationPoint(61.5F, -52F, -2.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 112
		bodyModel[82].setRotationPoint(57.5F, -52F, -2.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 113
		bodyModel[83].setRotationPoint(195.5F, -23F, -0.5F);

		bodyModel[84].addBox(0F, 0F, -0.5F, 1, 44, 1, 0F); // Box 114
		bodyModel[84].setRotationPoint(48F, -61F, 0F);
		bodyModel[84].rotateAngleZ = -0.12217305F;

		bodyModel[85].addShapeBox(0F, 0F, -0.5F, 160, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 115
		bodyModel[85].setRotationPoint(46F, -76F, 0F);
		bodyModel[85].rotateAngleZ = -0.34906585F;

		bodyModel[86].addBox(0F, 0F, 0F, 2, 12, 2, 0F); // Box 116
		bodyModel[86].setRotationPoint(-154F, -12F, -1F);

		bodyModel[87].addShapeBox(0F, 0F, -0.5F, 206, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 117
		bodyModel[87].setRotationPoint(-158F, -53F, 0F);
		bodyModel[87].rotateAngleY = 0.03490659F;
		bodyModel[87].rotateAngleZ = 0.1134464F;

		bodyModel[88].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 118
		bodyModel[88].setRotationPoint(45.5F, -76F, -8F);
		bodyModel[88].rotateAngleZ = 0.12217305F;

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 24, 0F); // Box 119
		bodyModel[89].setRotationPoint(47.5F, -62F, -12F);
		bodyModel[89].rotateAngleZ = 0.12217305F;

		bodyModel[90].addShapeBox(0F, 0F, -0.5F, 206, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 120
		bodyModel[90].setRotationPoint(-158F, -53F, 0F);
		bodyModel[90].rotateAngleY = -0.03490659F;
		bodyModel[90].rotateAngleZ = 0.1134464F;

		bodyModel[91].addShapeBox(0F, 0F, -0.5F, 206, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 121
		bodyModel[91].setRotationPoint(-158F, -52F, 7F);
		bodyModel[91].rotateAngleY = 0.01745329F;
		bodyModel[91].rotateAngleZ = 0.05235988F;

		bodyModel[92].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 122
		bodyModel[92].setRotationPoint(-158.5F, -52F, -8F);
		bodyModel[92].rotateAngleZ = 0.12217305F;

		bodyModel[93].addShapeBox(0F, 0F, -0.5F, 206, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 123
		bodyModel[93].setRotationPoint(-158F, -52F, -7F);
		bodyModel[93].rotateAngleY = -0.01745329F;
		bodyModel[93].rotateAngleZ = 0.05235988F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[94].setRotationPoint(-107F, -17F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[95].setRotationPoint(-107.5F, -19F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[96].setRotationPoint(-112F, -18.5F, -0.5F);

		bodyModel[97].addShapeBox(0F, 0F, -0.5F, 122, 1, 1, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Box 127
		bodyModel[97].setRotationPoint(-278F, -28F, 0F);
		bodyModel[97].rotateAngleZ = 0.21816616F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 55, 15, 14, 0F,0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 6F); // Box 128
		bodyModel[98].setRotationPoint(130F, 13F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 79, 15, 32, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F); // Box 129
		bodyModel[99].setRotationPoint(51F, 13F, -16F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 77, 15, 44, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 130
		bodyModel[100].setRotationPoint(-26F, 13F, -22F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 124, 15, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 131
		bodyModel[101].setRotationPoint(-150F, 13F, -22F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 40, 15, 44, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 132
		bodyModel[102].setRotationPoint(-190F, 13F, -22F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 40, 15, 42, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -7F); // Box 133
		bodyModel[103].setRotationPoint(-230F, 13F, -21F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 26, 10, 36, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -3F, -7F); // Box 134
		bodyModel[104].setRotationPoint(-256F, 13F, -18F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 26, 7, 28, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -4F, -9F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -9F); // Box 135
		bodyModel[105].setRotationPoint(-282F, 13F, -14F);

		bodyModel[106].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 136
		bodyModel[106].setRotationPoint(-208F, 25.5F, -10F);

		bodyModel[107].addBox(0F, 0F, 0F, 60, 1, 1, 0F); // Box 137
		bodyModel[107].setRotationPoint(-258F, 26F, -9.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[108].setRotationPoint(-208F, 25.5F, 8F);

		bodyModel[109].addBox(0F, 0F, 0F, 60, 1, 1, 0F); // Box 139
		bodyModel[109].setRotationPoint(-258F, 26F, 8.5F);

		bodyModel[110].addBox(0F, 0F, -0.5F, 1, 6, 1, 0F); // Box 140
		bodyModel[110].setRotationPoint(-257F, 26.5F, 9F);

		bodyModel[111].addBox(0F, 0F, -0.5F, 1, 6, 1, 0F); // Box 141
		bodyModel[111].setRotationPoint(-257F, 26.5F, 9F);
		bodyModel[111].rotateAngleX = 2.0943951F;

		bodyModel[112].addBox(0F, 0F, -0.5F, 1, 6, 1, 0F); // Box 142
		bodyModel[112].setRotationPoint(-257F, 26.5F, 9F);
		bodyModel[112].rotateAngleX = -2.0943951F;

		bodyModel[113].addBox(0F, 0F, -0.5F, 1, 6, 1, 0F); // Box 143
		bodyModel[113].setRotationPoint(-257F, 26.5F, -9F);
		bodyModel[113].rotateAngleX = 2.0943951F;

		bodyModel[114].addBox(0F, 0F, -0.5F, 1, 6, 1, 0F); // Box 144
		bodyModel[114].setRotationPoint(-257F, 26.5F, -9F);
		bodyModel[114].rotateAngleX = -2.0943951F;

		bodyModel[115].addBox(0F, 0F, -0.5F, 1, 6, 1, 0F); // Box 145
		bodyModel[115].setRotationPoint(-257F, 26.5F, -9F);

		bodyModel[116].addBox(0F, 0F, -0.5F, 1, 2, 1, 0F); // Box 146
		bodyModel[116].setRotationPoint(-269F, 17.5F, 0F);

		bodyModel[117].addBox(0F, 0F, -0.5F, 8, 6, 1, 0F); // Box 147
		bodyModel[117].setRotationPoint(-276F, 19.5F, 0F);

		bodyModel[118].addBox(0F, 0F, -0.5F, 3, 7, 1, 0F); // Box 148
		bodyModel[118].setRotationPoint(-252F, 19F, 9F);

		bodyModel[119].addBox(0F, 0F, -0.5F, 3, 7, 1, 0F); // Box 149
		bodyModel[119].setRotationPoint(-252F, 19F, -9F);

		bodyModel[120].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 150
		bodyModel[120].setRotationPoint(-255F, 25.5F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Box 151
		bodyModel[121].setRotationPoint(-255F, 25.5F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 7, 15, 14, 0F,0F, 0F, 0F, 1F, 0F, -5F, 1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, -2F); // Box 152
		bodyModel[122].setRotationPoint(185F, 13F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 156
		bodyModel[123].setRotationPoint(-140F, -3F, -5F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 157
		bodyModel[124].setRotationPoint(-137F, -3F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 158
		bodyModel[125].setRotationPoint(-133F, -3F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 159
		bodyModel[126].setRotationPoint(-84F, -3F, -5F);

		bodyModel[127].addBox(0F, 0F, 0F, 4, 2, 10, 0F); // Box 160
		bodyModel[127].setRotationPoint(-88F, -3F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 161
		bodyModel[128].setRotationPoint(-91F, -3F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 162
		bodyModel[129].setRotationPoint(-171F, -12F, -6F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 163
		bodyModel[130].setRotationPoint(-167F, -12F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 164
		bodyModel[131].setRotationPoint(-163F, -12F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 165
		bodyModel[132].setRotationPoint(-214F, -3F, -6F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 166
		bodyModel[133].setRotationPoint(-210F, -3F, -6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 167
		bodyModel[134].setRotationPoint(-206F, -3F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 168
		bodyModel[135].setRotationPoint(129F, -10F, -6F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 2, 12, 0F); // Box 169
		bodyModel[136].setRotationPoint(125F, -10F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 170
		bodyModel[137].setRotationPoint(121F, -10F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 23, 5, 14, 0F,2F, -1F, 1F, -6F, -1F, -2F, -6F, -1F, -2F, 2F, -1F, 1F, 2F, -1F, 1F, -6F, -1F, -2F, -6F, -1F, -2F, 2F, -1F, 1F); // Box 168
		bodyModel[138].setRotationPoint(84F, -18F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[139].setRotationPoint(90F, -22F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[140].setRotationPoint(95F, -21.5F, -0.5F);
		bodyModel[140].rotateAngleZ = 0.19198622F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[141].setRotationPoint(95F, -21.5F, 1.5F);
		bodyModel[141].rotateAngleZ = 0.19198622F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[142].setRotationPoint(95F, -21.5F, -2.5F);
		bodyModel[142].rotateAngleZ = 0.19198622F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[143].setRotationPoint(92F, -25F, -2.5F);
		bodyModel[143].rotateAngleZ = -0.15707963F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[144].setRotationPoint(92F, -25F, -0.5F);
		bodyModel[144].rotateAngleZ = -0.15707963F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[145].setRotationPoint(92F, -25F, 1.5F);
		bodyModel[145].rotateAngleZ = -0.15707963F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 19, 5, 14, 0F,0F, -1.5F, -1.75F, -6F, -1.5F, -1.75F, -6F, -1.5F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, -1.75F, -6F, -1.5F, -1.75F, -6F, -1.5F, -1.75F, 0F, -1.5F, -1.75F); // Box 176
		bodyModel[146].setRotationPoint(-113F, -18F, -19F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[147].setRotationPoint(-110F, -21F, -16F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[148].setRotationPoint(-105F, -20.5F, -10.5F);
		bodyModel[148].rotateAngleZ = 0.19198622F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[149].setRotationPoint(-105F, -20.5F, -12.5F);
		bodyModel[149].rotateAngleZ = 0.19198622F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[150].setRotationPoint(-105F, -20.5F, -14.5F);
		bodyModel[150].rotateAngleZ = 0.19198622F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[151].setRotationPoint(-108F, -24F, -14.5F);
		bodyModel[151].rotateAngleZ = -0.15707963F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[152].setRotationPoint(-108F, -24F, -12.5F);
		bodyModel[152].rotateAngleZ = -0.15707963F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[153].setRotationPoint(-108F, -24F, -10.5F);
		bodyModel[153].rotateAngleZ = -0.15707963F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[154].setRotationPoint(-168F, -17F, -5F);

		bodyModel[155].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[155].setRotationPoint(-164F, -20F, 0.5F);
		bodyModel[155].rotateAngleZ = 0.15707963F;

		bodyModel[156].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[156].setRotationPoint(-164F, -20F, -3.5F);
		bodyModel[156].rotateAngleZ = 0.15707963F;

		bodyModel[157].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[157].setRotationPoint(-164F, -20F, -1.5F);
		bodyModel[157].rotateAngleZ = 0.15707963F;

		bodyModel[158].addShapeBox(-8F, 0.2F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[158].setRotationPoint(-166F, -16.5F, -3.5F);
		bodyModel[158].rotateAngleZ = -0.19198622F;

		bodyModel[159].addShapeBox(-8F, 0.2F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[159].setRotationPoint(-166F, -16.5F, -1.5F);
		bodyModel[159].rotateAngleZ = -0.19198622F;

		bodyModel[160].addShapeBox(-8F, 0.2F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[160].setRotationPoint(-166F, -16.5F, 0.5F);
		bodyModel[160].rotateAngleZ = -0.19198622F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[161].setRotationPoint(-186F, -15F, -5F);

		bodyModel[162].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[162].setRotationPoint(-182F, -18F, 0.5F);
		bodyModel[162].rotateAngleZ = 0.15707963F;

		bodyModel[163].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[163].setRotationPoint(-182F, -18F, -3.5F);
		bodyModel[163].rotateAngleZ = 0.15707963F;

		bodyModel[164].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[164].setRotationPoint(-182F, -18F, -1.5F);
		bodyModel[164].rotateAngleZ = 0.15707963F;

		bodyModel[165].addShapeBox(-8F, 0.2F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[165].setRotationPoint(-184F, -14.5F, -3.5F);
		bodyModel[165].rotateAngleZ = -0.19198622F;

		bodyModel[166].addShapeBox(-8F, 0.2F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[166].setRotationPoint(-184F, -14.5F, -1.5F);
		bodyModel[166].rotateAngleZ = -0.19198622F;

		bodyModel[167].addShapeBox(-8F, 0.2F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[167].setRotationPoint(-184F, -14.5F, 0.5F);
		bodyModel[167].rotateAngleZ = -0.19198622F;

		bodyModel[168].addShapeBox(0F, 0F, 0F, 19, 5, 14, 0F,0F, -1.5F, -1.75F, -6F, -1.5F, -1.75F, -6F, -1.5F, -1.75F, 0F, -1.5F, -1.75F, 0F, -1.5F, -1.75F, -6F, -1.5F, -1.75F, -6F, -1.5F, -1.75F, 0F, -1.5F, -1.75F); // Box 208
		bodyModel[168].setRotationPoint(-113F, -18F, 6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[169].setRotationPoint(-110F, -21F, 9F);

		bodyModel[170].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[170].setRotationPoint(-106F, -24F, 14.5F);
		bodyModel[170].rotateAngleZ = 0.15707963F;

		bodyModel[171].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[171].setRotationPoint(-106F, -24F, 12.5F);
		bodyModel[171].rotateAngleZ = 0.15707963F;

		bodyModel[172].addShapeBox(-3F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[172].setRotationPoint(-106F, -24F, 10.5F);
		bodyModel[172].rotateAngleZ = 0.15707963F;

		bodyModel[173].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[173].setRotationPoint(-109F, -20.5F, 14.5F);
		bodyModel[173].rotateAngleZ = -0.19198622F;

		bodyModel[174].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[174].setRotationPoint(-109F, -20.5F, 12.5F);
		bodyModel[174].rotateAngleZ = -0.19198622F;

		bodyModel[175].addShapeBox(-8F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[175].setRotationPoint(-109F, -20.5F, 10.5F);
		bodyModel[175].rotateAngleZ = -0.19198622F;

		bodyModel[176].addShapeBox(0F, 0F, 0F, 19, 5, 14, 0F,-8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F); // Box 216
		bodyModel[176].setRotationPoint(-112F, -16F, -22F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 19, 5, 14, 0F,-8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F); // Box 217
		bodyModel[177].setRotationPoint(-120F, -16F, -22F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 19, 5, 14, 0F,-8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F); // Box 218
		bodyModel[178].setRotationPoint(-112F, -16F, 9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 19, 5, 14, 0F,-8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, -1.5F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F, -8F, 12F, -5.75F); // Box 219
		bodyModel[179].setRotationPoint(-120F, -16F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 7, 5, 24, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[180].setRotationPoint(-257F, -6F, -14F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 2, 401, textureX, textureY); // Box 15
		turretModel[1] = new ModelRendererTurbo(this, 58, 401, textureX, textureY); // Box 16
		turretModel[2] = new ModelRendererTurbo(this, 106, 401, textureX, textureY); // Box 17
		turretModel[3] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 20
		turretModel[4] = new ModelRendererTurbo(this, 72, 71, textureX, textureY); // Box 23
		turretModel[5] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 24
		turretModel[6] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 25
		turretModel[7] = new ModelRendererTurbo(this, 72, 71, textureX, textureY); // Box 26
		turretModel[8] = new ModelRendererTurbo(this, 71, 76, textureX, textureY); // Box 27
		turretModel[9] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 28
		turretModel[10] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 29
		turretModel[11] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 30
		turretModel[12] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 31
		turretModel[13] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 32
		turretModel[14] = new ModelRendererTurbo(this, 8, 71, textureX, textureY); // Box 33
		turretModel[15] = new ModelRendererTurbo(this, 72, 71, textureX, textureY); // Box 34
		turretModel[16] = new ModelRendererTurbo(this, 72, 71, textureX, textureY); // Box 35
		turretModel[17] = new ModelRendererTurbo(this, 71, 76, textureX, textureY); // Box 36
		turretModel[18] = new ModelRendererTurbo(this, 72, 71, textureX, textureY); // Box 37
		turretModel[19] = new ModelRendererTurbo(this, 72, 71, textureX, textureY); // Box 38
		turretModel[20] = new ModelRendererTurbo(this, 71, 76, textureX, textureY); // Box 39
		turretModel[21] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 40
		turretModel[22] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 41
		turretModel[23] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 42
		turretModel[24] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 43
		turretModel[25] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 44
		turretModel[26] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 45
		turretModel[27] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 46
		turretModel[28] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 47
		turretModel[29] = new ModelRendererTurbo(this, 71, 82, textureX, textureY); // Box 48

		turretModel[0].addBox(-2.5F, -14.5F, -10F, 6, 9, 19, 0F); // Box 15
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addShapeBox(3.5F, -14.5F, -10F, 2, 9, 19, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 16
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addShapeBox(-10.5F, -14.5F, -10F, 8, 9, 19, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 17
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addBox(-14.5F, -10F, 2F, 28, 1, 3, 0F); // Box 20
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addShapeBox(13.5F, -11F, 2F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addShapeBox(-14.5F, -11F, 2F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addShapeBox(-14.5F, -9F, 2F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addShapeBox(13.5F, -10F, 2F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 26
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addShapeBox(13.5F, -9F, 2F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		turretModel[8].setRotationPoint(0F, 0F, 0F);

		turretModel[9].addShapeBox(-14.5F, -11F, -2F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addBox(-14.5F, -10F, -2F, 28, 1, 3, 0F); // Box 29
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addShapeBox(-14.5F, -9F, -2F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addShapeBox(-14.5F, -9F, -6F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		turretModel[12].setRotationPoint(0F, 0F, 0F);

		turretModel[13].addBox(-14.5F, -10F, -6F, 28, 1, 3, 0F); // Box 32
		turretModel[13].setRotationPoint(0F, 0F, 0F);

		turretModel[14].addShapeBox(-14.5F, -11F, -6F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[14].setRotationPoint(0F, 0F, 0F);

		turretModel[15].addShapeBox(13.5F, -11F, -2F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[15].setRotationPoint(0F, 0F, 0F);

		turretModel[16].addShapeBox(13.5F, -10F, -2F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[16].setRotationPoint(0F, 0F, 0F);

		turretModel[17].addShapeBox(13.5F, -9F, -2F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		turretModel[17].setRotationPoint(0F, 0F, 0F);

		turretModel[18].addShapeBox(13.5F, -11F, -6F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37
		turretModel[18].setRotationPoint(0F, 0F, 0F);

		turretModel[19].addShapeBox(13.5F, -10F, -6F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[19].setRotationPoint(0F, 0F, 0F);

		turretModel[20].addShapeBox(13.5F, -9F, -6F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		turretModel[20].setRotationPoint(0F, 0F, 0F);

		turretModel[21].addShapeBox(-15F, -11.75F, 1.5F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 40
		turretModel[21].setRotationPoint(0F, 0F, 0F);

		turretModel[22].addShapeBox(-15F, -8.25F, 1.5F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 41
		turretModel[22].setRotationPoint(0F, 0F, 0F);

		turretModel[23].addShapeBox(-15F, -9.75F, 1.5F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 42
		turretModel[23].setRotationPoint(0F, 0F, 0F);

		turretModel[24].addShapeBox(-15F, -11.75F, -2.5F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 43
		turretModel[24].setRotationPoint(0F, 0F, 0F);

		turretModel[25].addShapeBox(-15F, -9.75F, -2.5F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 44
		turretModel[25].setRotationPoint(0F, 0F, 0F);

		turretModel[26].addShapeBox(-15F, -8.25F, -2.5F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 45
		turretModel[26].setRotationPoint(0F, 0F, 0F);

		turretModel[27].addShapeBox(-15F, -11.75F, -6.5F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 46
		turretModel[27].setRotationPoint(0F, 0F, 0F);

		turretModel[28].addShapeBox(-15F, -9.75F, -6.5F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 47
		turretModel[28].setRotationPoint(0F, 0F, 0F);

		turretModel[29].addShapeBox(-15F, -8.25F, -6.5F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 48
		turretModel[29].setRotationPoint(0F, 0F, 0F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[14];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 2, 301, textureX, textureY); // Box 156
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 42, 301, textureX, textureY); // Box 157
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 98, 301, textureX, textureY); // Box 159
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 2, 301, textureX, textureY); // Box 164
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 146, 301, textureX, textureY); // Box 165
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 202, 301, textureX, textureY); // Box 166
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 250, 309, textureX, textureY); // Box 177
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 274, 309, textureX, textureY); // Box 178
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 290, 309, textureX, textureY); // Box 180
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 322, 309, textureX, textureY); // Box 181
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 354, 309, textureX, textureY); // Box 182
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 498, 301, textureX, textureY); // Box 183
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 186, 309, textureX, textureY); // Box 184
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 378, 309, textureX, textureY); // Box 185

		gun_1_Model[0][0].addShapeBox(-8F, -1F, -8F, 8, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156

		gun_1_Model[0][1].addShapeBox(0F, 2F, -5F, 8, 4, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157

		gun_1_Model[0][2].addShapeBox(-14F, -1F, -8F, 6, 7, 16, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 159

		gun_1_Model[0][3].addShapeBox(0F, -4F, 5F, 3, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 164

		gun_1_Model[0][4].addShapeBox(-8F, -3F, -8F, 8, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165

		gun_1_Model[0][5].addShapeBox(-14F, -3F, -8F, 6, 2, 16, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 166

		gun_1_Model[0][6].addShapeBox(0F, 1F, -8F, 8, 5, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177

		gun_1_Model[0][7].addShapeBox(0F, 1F, 5F, 8, 5, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178

		gun_1_Model[0][8].addShapeBox(0F, -2.5F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180

		gun_1_Model[0][9].addBox(0F, -1.5F, -5F, 3, 1, 10, 0F); // Box 181

		gun_1_Model[0][10].addShapeBox(0F, -0.5F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 182

		gun_1_Model[0][11].addShapeBox(0F, -4F, -8F, 3, 3, 3, 0F,0F, -1F, -0.5F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 3F, 0.5F, -0.25F, 3F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 183

		gun_1_Model[0][12].addShapeBox(0F, -2F, 5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 184

		gun_1_Model[0][13].addShapeBox(0F, -2F, -8F, 8, 1, 3, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 185

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(127F, -15F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[12];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 74, 301, textureX, textureY); // Box 158
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 130, 301, textureX, textureY); // Box 161
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 234, 301, textureX, textureY); // Box 167
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 274, 301, textureX, textureY); // Box 168
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 186, 301, textureX, textureY); // Box 169
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 314, 301, textureX, textureY); // Box 170
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 346, 301, textureX, textureY); // Box 171
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 386, 301, textureX, textureY); // Box 172
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 426, 301, textureX, textureY); // Box 173
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 466, 301, textureX, textureY); // Box 174
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 82, 309, textureX, textureY); // Box 175
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 130, 309, textureX, textureY); // Box 176

		gun_1_Model[1][0].addShapeBox(-2F, -2F, -4.5F, 13, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158

		gun_1_Model[1][1].addShapeBox(11F, -1F, -4F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161

		gun_1_Model[1][2].addShapeBox(-2F, 0F, -4.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1F, -0.75F); // Box 167

		gun_1_Model[1][3].addShapeBox(-2F, -1F, -4.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168

		gun_1_Model[1][4].addShapeBox(11F, -2F, -4F, 12, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169

		gun_1_Model[1][5].addShapeBox(11F, 0F, -4F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170

		gun_1_Model[1][6].addShapeBox(-2F, -2F, 1.5F, 13, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171

		gun_1_Model[1][7].addShapeBox(-2F, -1F, 1.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172

		gun_1_Model[1][8].addShapeBox(-2F, 0F, 1.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1F, -0.75F); // Box 173

		gun_1_Model[1][9].addShapeBox(11F, -2F, 2F, 12, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174

		gun_1_Model[1][10].addShapeBox(11F, -1F, 2F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175

		gun_1_Model[1][11].addShapeBox(11F, 0F, 2F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 176

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(127F, -15F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[30];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 2, 401, textureX, textureY); // Box 15
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 58, 401, textureX, textureY); // Box 16
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 106, 401, textureX, textureY); // Box 17
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 146, 401, textureX, textureY); // Box 20
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 2, 401, textureX, textureY); // Box 23
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 210, 401, textureX, textureY); // Box 24
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 274, 401, textureX, textureY); // Box 25
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 34, 401, textureX, textureY); // Box 26
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 58, 401, textureX, textureY); // Box 27
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 338, 401, textureX, textureY); // Box 28
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 402, 401, textureX, textureY); // Box 29
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 146, 409, textureX, textureY); // Box 30
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 210, 409, textureX, textureY); // Box 31
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 274, 409, textureX, textureY); // Box 32
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 338, 409, textureX, textureY); // Box 33
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 82, 401, textureX, textureY); // Box 34
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 106, 401, textureX, textureY); // Box 35
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 466, 401, textureX, textureY); // Box 36
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 482, 401, textureX, textureY); // Box 37
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 2, 409, textureX, textureY); // Box 38
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 34, 409, textureX, textureY); // Box 39
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 50, 409, textureX, textureY); // Box 40
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 66, 409, textureX, textureY); // Box 41
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 82, 409, textureX, textureY); // Box 42
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 98, 409, textureX, textureY); // Box 43
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 114, 409, textureX, textureY); // Box 44
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 402, 409, textureX, textureY); // Box 45
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 418, 409, textureX, textureY); // Box 46
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 434, 409, textureX, textureY); // Box 47
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 450, 409, textureX, textureY); // Box 48

		gun_2_Model[0][0].addBox(0F, -5F, -9.5F, 6, 8, 19, 0F); // Box 15

		gun_2_Model[0][1].addShapeBox(6F, -5F, -9.5F, 2, 8, 19, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 16

		gun_2_Model[0][2].addShapeBox(-8F, -5F, -9.5F, 8, 8, 19, 0F,0F, -2F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3.5F); // Box 17

		gun_2_Model[0][3].addBox(-12F, -0.5F, 2.5F, 28, 1, 3, 0F); // Box 20

		gun_2_Model[0][4].addShapeBox(16F, -1.5F, 2.5F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_2_Model[0][5].addShapeBox(-12F, -1.5F, 2.5F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24

		gun_2_Model[0][6].addShapeBox(-12F, 0.5F, 2.5F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25

		gun_2_Model[0][7].addShapeBox(16F, -0.5F, 2.5F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 26

		gun_2_Model[0][8].addShapeBox(16F, 0.5F, 2.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27

		gun_2_Model[0][9].addShapeBox(-12F, -1.5F, -1.5F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_2_Model[0][10].addBox(-12F, -0.5F, -1.5F, 28, 1, 3, 0F); // Box 29

		gun_2_Model[0][11].addShapeBox(-12F, 0.5F, -1.5F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30

		gun_2_Model[0][12].addShapeBox(-12F, 0.5F, -5.5F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31

		gun_2_Model[0][13].addBox(-12F, -0.5F, -5.5F, 28, 1, 3, 0F); // Box 32

		gun_2_Model[0][14].addShapeBox(-12F, -1.5F, -5.5F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_2_Model[0][15].addShapeBox(16F, -1.5F, -1.5F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_2_Model[0][16].addShapeBox(16F, -0.5F, -1.5F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_2_Model[0][17].addShapeBox(16F, 0.5F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36

		gun_2_Model[0][18].addShapeBox(16F, -1.5F, -5.5F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_2_Model[0][19].addShapeBox(16F, -0.5F, -5.5F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38

		gun_2_Model[0][20].addShapeBox(16F, 0.5F, -5.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39

		gun_2_Model[0][21].addShapeBox(-12.5F, -2.25F, 2F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 40

		gun_2_Model[0][22].addShapeBox(-12.5F, 1.25F, 2F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 41

		gun_2_Model[0][23].addShapeBox(-12.5F, -0.25F, 2F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 42

		gun_2_Model[0][24].addShapeBox(-12.5F, -2.25F, -2F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 43

		gun_2_Model[0][25].addShapeBox(-12.5F, -0.25F, -2F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 44

		gun_2_Model[0][26].addShapeBox(-12.5F, 1.25F, -2F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 45

		gun_2_Model[0][27].addShapeBox(-12.5F, -2.25F, -6F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 46

		gun_2_Model[0][28].addShapeBox(-12.5F, -0.25F, -6F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 47

		gun_2_Model[0][29].addShapeBox(-12.5F, 1.25F, -6F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 48

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-86F, -5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[30];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 2, 401, textureX, textureY); // Box 15
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 58, 401, textureX, textureY); // Box 16
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 106, 401, textureX, textureY); // Box 17
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 146, 401, textureX, textureY); // Box 20
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 2, 401, textureX, textureY); // Box 23
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 210, 401, textureX, textureY); // Box 24
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 274, 401, textureX, textureY); // Box 25
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 34, 401, textureX, textureY); // Box 26
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 58, 401, textureX, textureY); // Box 27
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 338, 401, textureX, textureY); // Box 28
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 402, 401, textureX, textureY); // Box 29
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 146, 409, textureX, textureY); // Box 30
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 210, 409, textureX, textureY); // Box 31
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 274, 409, textureX, textureY); // Box 32
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 338, 409, textureX, textureY); // Box 33
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 82, 401, textureX, textureY); // Box 34
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 106, 401, textureX, textureY); // Box 35
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 466, 401, textureX, textureY); // Box 36
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 482, 401, textureX, textureY); // Box 37
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 2, 409, textureX, textureY); // Box 38
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 34, 409, textureX, textureY); // Box 39
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 50, 409, textureX, textureY); // Box 40
		gun_3_Model[0][22] = new ModelRendererTurbo(this, 66, 409, textureX, textureY); // Box 41
		gun_3_Model[0][23] = new ModelRendererTurbo(this, 82, 409, textureX, textureY); // Box 42
		gun_3_Model[0][24] = new ModelRendererTurbo(this, 98, 409, textureX, textureY); // Box 43
		gun_3_Model[0][25] = new ModelRendererTurbo(this, 114, 409, textureX, textureY); // Box 44
		gun_3_Model[0][26] = new ModelRendererTurbo(this, 402, 409, textureX, textureY); // Box 45
		gun_3_Model[0][27] = new ModelRendererTurbo(this, 418, 409, textureX, textureY); // Box 46
		gun_3_Model[0][28] = new ModelRendererTurbo(this, 434, 409, textureX, textureY); // Box 47
		gun_3_Model[0][29] = new ModelRendererTurbo(this, 450, 409, textureX, textureY); // Box 48

		gun_3_Model[0][0].addBox(0F, -5F, -9.5F, 6, 8, 19, 0F); // Box 15

		gun_3_Model[0][1].addShapeBox(6F, -5F, -9.5F, 2, 8, 19, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 16

		gun_3_Model[0][2].addShapeBox(-8F, -5F, -9.5F, 8, 8, 19, 0F,0F, -2F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3.5F); // Box 17

		gun_3_Model[0][3].addBox(-12F, -0.5F, 2.5F, 28, 1, 3, 0F); // Box 20

		gun_3_Model[0][4].addShapeBox(16F, -1.5F, 2.5F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_3_Model[0][5].addShapeBox(-12F, -1.5F, 2.5F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24

		gun_3_Model[0][6].addShapeBox(-12F, 0.5F, 2.5F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25

		gun_3_Model[0][7].addShapeBox(16F, -0.5F, 2.5F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 26

		gun_3_Model[0][8].addShapeBox(16F, 0.5F, 2.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27

		gun_3_Model[0][9].addShapeBox(-12F, -1.5F, -1.5F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_3_Model[0][10].addBox(-12F, -0.5F, -1.5F, 28, 1, 3, 0F); // Box 29

		gun_3_Model[0][11].addShapeBox(-12F, 0.5F, -1.5F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30

		gun_3_Model[0][12].addShapeBox(-12F, 0.5F, -5.5F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31

		gun_3_Model[0][13].addBox(-12F, -0.5F, -5.5F, 28, 1, 3, 0F); // Box 32

		gun_3_Model[0][14].addShapeBox(-12F, -1.5F, -5.5F, 28, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_3_Model[0][15].addShapeBox(16F, -1.5F, -1.5F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_3_Model[0][16].addShapeBox(16F, -0.5F, -1.5F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_3_Model[0][17].addShapeBox(16F, 0.5F, -1.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36

		gun_3_Model[0][18].addShapeBox(16F, -1.5F, -5.5F, 5, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_3_Model[0][19].addShapeBox(16F, -0.5F, -5.5F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 38

		gun_3_Model[0][20].addShapeBox(16F, 0.5F, -5.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39

		gun_3_Model[0][21].addShapeBox(-12.5F, -2.25F, 2F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 40

		gun_3_Model[0][22].addShapeBox(-12.5F, 1.25F, 2F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 41

		gun_3_Model[0][23].addShapeBox(-12.5F, -0.25F, 2F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 42

		gun_3_Model[0][24].addShapeBox(-12.5F, -2.25F, -2F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 43

		gun_3_Model[0][25].addShapeBox(-12.5F, -0.25F, -2F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 44

		gun_3_Model[0][26].addShapeBox(-12.5F, 1.25F, -2F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 45

		gun_3_Model[0][27].addShapeBox(-12.5F, -2.25F, -6F, 1, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 46

		gun_3_Model[0][28].addShapeBox(-12.5F, -0.25F, -6F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 47

		gun_3_Model[0][29].addShapeBox(-12.5F, 1.25F, -6F, 1, 1, 4, 0F,0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 48

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-135F, -5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[14];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 2, 301, textureX, textureY); // Box 156
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 42, 301, textureX, textureY); // Box 157
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 98, 301, textureX, textureY); // Box 159
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 2, 301, textureX, textureY); // Box 164
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 146, 301, textureX, textureY); // Box 165
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 202, 301, textureX, textureY); // Box 166
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 250, 309, textureX, textureY); // Box 177
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 274, 309, textureX, textureY); // Box 178
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 290, 309, textureX, textureY); // Box 180
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 322, 309, textureX, textureY); // Box 181
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 354, 309, textureX, textureY); // Box 182
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 498, 301, textureX, textureY); // Box 183
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 186, 309, textureX, textureY); // Box 184
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 378, 309, textureX, textureY); // Box 185

		gun_4_Model[0][0].addShapeBox(-8F, -1F, -8F, 8, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156

		gun_4_Model[0][1].addShapeBox(0F, 2F, -5F, 8, 4, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157

		gun_4_Model[0][2].addShapeBox(-14F, -1F, -8F, 6, 7, 16, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F); // Box 159

		gun_4_Model[0][3].addShapeBox(0F, -4F, 5F, 3, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 164

		gun_4_Model[0][4].addShapeBox(-8F, -3F, -8F, 8, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165

		gun_4_Model[0][5].addShapeBox(-14F, -3F, -8F, 6, 2, 16, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 166

		gun_4_Model[0][6].addShapeBox(0F, 1F, -8F, 8, 5, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177

		gun_4_Model[0][7].addShapeBox(0F, 1F, 5F, 8, 5, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178

		gun_4_Model[0][8].addShapeBox(0F, -2.5F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180

		gun_4_Model[0][9].addBox(0F, -1.5F, -5F, 3, 1, 10, 0F); // Box 181

		gun_4_Model[0][10].addShapeBox(0F, -0.5F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 182

		gun_4_Model[0][11].addShapeBox(0F, -4F, -8F, 3, 3, 3, 0F,0F, -1F, -0.5F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 3F, 0.5F, -0.25F, 3F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 183

		gun_4_Model[0][12].addShapeBox(0F, -2F, 5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 184

		gun_4_Model[0][13].addShapeBox(0F, -2F, -8F, 8, 1, 3, 0F,0F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 185

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-208F, -8F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[12];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 74, 301, textureX, textureY); // Box 158
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 130, 301, textureX, textureY); // Box 161
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 234, 301, textureX, textureY); // Box 167
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 274, 301, textureX, textureY); // Box 168
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 186, 301, textureX, textureY); // Box 169
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 314, 301, textureX, textureY); // Box 170
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 346, 301, textureX, textureY); // Box 171
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 386, 301, textureX, textureY); // Box 172
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 426, 301, textureX, textureY); // Box 173
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 466, 301, textureX, textureY); // Box 174
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 82, 309, textureX, textureY); // Box 175
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 130, 309, textureX, textureY); // Box 176

		gun_4_Model[1][0].addShapeBox(-2F, -2F, -4.5F, 13, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158

		gun_4_Model[1][1].addShapeBox(11F, -1F, -4F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161

		gun_4_Model[1][2].addShapeBox(-2F, 0F, -4.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1F, -0.75F); // Box 167

		gun_4_Model[1][3].addShapeBox(-2F, -1F, -4.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168

		gun_4_Model[1][4].addShapeBox(11F, -2F, -4F, 12, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169

		gun_4_Model[1][5].addShapeBox(11F, 0F, -4F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 170

		gun_4_Model[1][6].addShapeBox(-2F, -2F, 1.5F, 13, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171

		gun_4_Model[1][7].addShapeBox(-2F, -1F, 1.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172

		gun_4_Model[1][8].addShapeBox(-2F, 0F, 1.5F, 13, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1F, -0.75F); // Box 173

		gun_4_Model[1][9].addShapeBox(11F, -2F, 2F, 12, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174

		gun_4_Model[1][10].addShapeBox(11F, -1F, 2F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175

		gun_4_Model[1][11].addShapeBox(11F, 0F, 2F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 176

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-208F, -8F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);
	}
}