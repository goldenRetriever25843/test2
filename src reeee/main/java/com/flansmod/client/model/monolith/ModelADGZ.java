//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Cromwell
// Model Creator: 
// Created on: 04.04.2016 - 20:31:24
// Last changed on: 04.04.2016 - 20:31:24

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelADGZ extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelADGZ() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[145];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 202
		bodyModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 202
		bodyModel[3] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 202
		bodyModel[4] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 202
		bodyModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 86
		bodyModel[6] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 87
		bodyModel[7] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 88
		bodyModel[8] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 89
		bodyModel[9] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 202
		bodyModel[10] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 202
		bodyModel[11] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 94
		bodyModel[12] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 95
		bodyModel[13] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 96
		bodyModel[14] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 102
		bodyModel[15] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 104
		bodyModel[16] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 105
		bodyModel[17] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 106
		bodyModel[18] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 107
		bodyModel[19] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 121
		bodyModel[20] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 125
		bodyModel[21] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 126
		bodyModel[22] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 127
		bodyModel[23] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 128
		bodyModel[24] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 129
		bodyModel[25] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 130
		bodyModel[26] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 132
		bodyModel[27] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 135
		bodyModel[28] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 136
		bodyModel[29] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 202
		bodyModel[30] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 202
		bodyModel[31] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 202
		bodyModel[32] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 202
		bodyModel[33] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 143
		bodyModel[34] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 144
		bodyModel[35] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 145
		bodyModel[36] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 146
		bodyModel[37] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 147
		bodyModel[38] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 148
		bodyModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 149
		bodyModel[40] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 150
		bodyModel[41] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 151
		bodyModel[42] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 153
		bodyModel[43] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 154
		bodyModel[44] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 155
		bodyModel[45] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 156
		bodyModel[46] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 159
		bodyModel[47] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 160
		bodyModel[48] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 161
		bodyModel[49] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 162
		bodyModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 163
		bodyModel[51] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 164
		bodyModel[52] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 202
		bodyModel[53] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 175
		bodyModel[54] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 176
		bodyModel[55] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 164
		bodyModel[56] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 165
		bodyModel[57] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 169
		bodyModel[58] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 170
		bodyModel[59] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 171
		bodyModel[60] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 172
		bodyModel[61] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 202
		bodyModel[62] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 202
		bodyModel[63] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 202
		bodyModel[64] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 202
		bodyModel[65] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 177
		bodyModel[66] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 178
		bodyModel[67] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 181
		bodyModel[68] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 168
		bodyModel[69] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 169
		bodyModel[70] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 170
		bodyModel[71] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 171
		bodyModel[72] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 175
		bodyModel[73] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 176
		bodyModel[74] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 177
		bodyModel[75] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 178
		bodyModel[76] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 180
		bodyModel[77] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 181
		bodyModel[78] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 182
		bodyModel[79] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 183
		bodyModel[80] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 184
		bodyModel[81] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 185
		bodyModel[82] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 186
		bodyModel[83] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 187
		bodyModel[84] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 188
		bodyModel[85] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 189
		bodyModel[86] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 190
		bodyModel[87] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 191
		bodyModel[88] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 192
		bodyModel[89] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 193
		bodyModel[90] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 194
		bodyModel[91] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 195
		bodyModel[92] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 196
		bodyModel[93] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 197
		bodyModel[94] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 198
		bodyModel[95] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 199
		bodyModel[96] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 201
		bodyModel[97] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 203
		bodyModel[98] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 205
		bodyModel[99] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 200
		bodyModel[100] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 201
		bodyModel[101] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 202
		bodyModel[102] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 203
		bodyModel[103] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 204
		bodyModel[104] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 205
		bodyModel[105] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 206
		bodyModel[106] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 207
		bodyModel[107] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 208
		bodyModel[108] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 209
		bodyModel[109] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 210
		bodyModel[110] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 211
		bodyModel[111] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 212
		bodyModel[112] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 213
		bodyModel[113] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 214
		bodyModel[114] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Box 215
		bodyModel[115] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 216
		bodyModel[116] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 217
		bodyModel[117] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 218
		bodyModel[118] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 202
		bodyModel[119] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 202
		bodyModel[120] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 202
		bodyModel[121] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 202
		bodyModel[122] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 202
		bodyModel[123] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 202
		bodyModel[124] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 202
		bodyModel[125] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 202
		bodyModel[126] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 202
		bodyModel[127] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 202
		bodyModel[128] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 202
		bodyModel[129] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 202
		bodyModel[130] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 202
		bodyModel[131] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // Box 202
		bodyModel[132] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Box 202
		bodyModel[133] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 202
		bodyModel[134] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 202
		bodyModel[135] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 202
		bodyModel[136] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 202
		bodyModel[137] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 202
		bodyModel[138] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 202
		bodyModel[139] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 202
		bodyModel[140] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 202
		bodyModel[141] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 202
		bodyModel[142] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 202
		bodyModel[143] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 202
		bodyModel[144] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 202

		bodyModel[0].addShapeBox(0F, 0F, 0F, 112, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -6F, 0F, -6F, -6F, 0F, -6F, -3F, 0F, -3F); // Box 14
		bodyModel[0].setRotationPoint(-54F, -5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 3, 38, 0F); // Box 202
		bodyModel[1].setRotationPoint(40.5F, -1F, -19F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 3, 38, 0F); // Box 202
		bodyModel[2].setRotationPoint(-43.5F, -1F, -19F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 3, 42, 0F); // Box 202
		bodyModel[3].setRotationPoint(-11.5F, -1F, -21F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 3, 42, 0F); // Box 202
		bodyModel[4].setRotationPoint(8.5F, -1F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 22, 10, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, -6F); // Box 86
		bodyModel[5].setRotationPoint(15F, -9.5F, 4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 22, 10, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, -6F); // Box 87
		bodyModel[6].setRotationPoint(-37F, -9.5F, 4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 22, 10, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 88
		bodyModel[7].setRotationPoint(-37F, -9.5F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 22, 10, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 89
		bodyModel[8].setRotationPoint(15F, -9.5F, -18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 23, 9, 2, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[9].setRotationPoint(-11.5F, -9F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 23, 9, 2, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[10].setRotationPoint(-11.5F, -9F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 9, 16, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[11].setRotationPoint(-54F, -14F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 11, 1, 10, 0F); // Box 95
		bodyModel[12].setRotationPoint(40F, -14F, 8F);
		bodyModel[12].rotateAngleZ = -0.45378561F;

		bodyModel[13].addBox(0F, 0F, 0F, 11, 1, 10, 0F); // Box 96
		bodyModel[13].setRotationPoint(40F, -14F, -18F);
		bodyModel[13].rotateAngleZ = -0.45378561F;

		bodyModel[14].addBox(0F, 0F, 0F, 15, 1, 10, 0F); // Box 102
		bodyModel[14].setRotationPoint(-53.3F, -7.3F, 8F);
		bodyModel[14].rotateAngleZ = 0.4712389F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[15].setRotationPoint(47F, -10.6F, 8F);
		bodyModel[15].rotateAngleZ = -0.45378561F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 10, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[16].setRotationPoint(47F, -10.6F, -18F);
		bodyModel[16].rotateAngleZ = -0.45378561F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 80, 4, 3, 0F, -12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 106
		bodyModel[17].setRotationPoint(-40F, -18F, -18F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 56, 7, 5, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 107
		bodyModel[18].setRotationPoint(-28F, -25F, -17F);

		bodyModel[19].addBox(0F, -1F, 0F, 21, 1, 1, 0F); // Box 121
		bodyModel[19].setRotationPoint(36F, -15.5F, 6F);
		bodyModel[19].rotateAngleZ = -0.45378561F;

		bodyModel[20].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 125
		bodyModel[20].setRotationPoint(54.4F, -10.5F, -7F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 126
		bodyModel[21].setRotationPoint(51.4F, -12F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 127
		bodyModel[22].setRotationPoint(48.4F, -13.6F, -7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 128
		bodyModel[23].setRotationPoint(45.4F, -15.1F, -7F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 129
		bodyModel[24].setRotationPoint(42.4F, -16.6F, -7F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 130
		bodyModel[25].setRotationPoint(39.4F, -18.2F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Box 132
		bodyModel[26].setRotationPoint(36.4F, -19.3F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 22, 3, 16, 0F, -4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[27].setRotationPoint(-50F, -17.01F, -8F);

		bodyModel[28].addTrapezoid(0F, 0F, 0F, 3, 3, 3, 0F, 2.00F, ModelRendererTurbo.MR_LEFT); // Box 136
		bodyModel[28].setRotationPoint(-55.5F, -7F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 202
		bodyModel[29].setRotationPoint(-52.9F, -8.9F, 8.5F);
		bodyModel[29].rotateAngleZ = 0.45378561F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[30].setRotationPoint(-53.35F, -9.8F, 8.5F);
		bodyModel[30].rotateAngleZ = 0.45378561F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[31].setRotationPoint(-53.8F, -10.7F, 8.5F);
		bodyModel[31].rotateAngleZ = 0.45378561F;

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 202
		bodyModel[32].setRotationPoint(-54F, -8.8F, 9.5F);
		bodyModel[32].rotateAngleZ = 0.55850536F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[33].setRotationPoint(-46F, -13F, 8F);
		bodyModel[33].rotateAngleZ = 0.43633231F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 144
		bodyModel[34].setRotationPoint(50F, -10.5F, 13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 145
		bodyModel[35].setRotationPoint(50F, -10.5F, -17F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 146
		bodyModel[36].setRotationPoint(-51F, -10.5F, -17F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 147
		bodyModel[37].setRotationPoint(-51F, -10.5F, 13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[38].setRotationPoint(50F, -12.5F, 13F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[39].setRotationPoint(50F, -12.5F, -17F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[40].setRotationPoint(-51F, -12.5F, 13F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[41].setRotationPoint(-51F, -12.5F, -17F);

		bodyModel[42].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.50F, ModelRendererTurbo.MR_LEFT); // Box 153
		bodyModel[42].setRotationPoint(26F, -24F, -0.5F);

		bodyModel[43].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.50F, ModelRendererTurbo.MR_LEFT); // Box 154
		bodyModel[43].setRotationPoint(26F, -25F, -3F);

		bodyModel[44].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.50F, ModelRendererTurbo.MR_LEFT); // Box 155
		bodyModel[44].setRotationPoint(26F, -25F, 2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F); // Box 156
		bodyModel[45].setRotationPoint(24F, -25F, -3.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 159
		bodyModel[46].setRotationPoint(24F, -23F, -13.5F);
		bodyModel[46].rotateAngleZ = 0.48869219F;

		bodyModel[47].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 160
		bodyModel[47].setRotationPoint(24F, -23F, 6.5F);
		bodyModel[47].rotateAngleZ = 0.48869219F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[48].setRotationPoint(-26F, -23.5F, -13.5F);
		bodyModel[48].rotateAngleZ = -0.48869219F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[49].setRotationPoint(-26F, -23.5F, 6.5F);
		bodyModel[49].rotateAngleZ = -0.48869219F;

		bodyModel[50].addTrapezoid(0F, 0F, 0F, 2, 1, 1, 0F, 1.00F, ModelRendererTurbo.MR_RIGHT); // Box 163
		bodyModel[50].setRotationPoint(27F, -20F, 9.5F);

		bodyModel[51].addTrapezoid(0F, 0F, 0F, 2, 1, 1, 0F, 1.00F, ModelRendererTurbo.MR_LEFT); // Box 164
		bodyModel[51].setRotationPoint(-29F, -20F, 9.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[52].setRotationPoint(-35F, -20.05F, 9.47F);
		bodyModel[52].rotateAngleY = -0.01745329F;
		bodyModel[52].rotateAngleZ = 0.01745329F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 16, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 175
		bodyModel[53].setRotationPoint(13.5F, -13F, 18.1F);
		bodyModel[53].rotateAngleX = -0.50614548F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 176
		bodyModel[54].setRotationPoint(13.5F, -23.5F, 15.1F);
		bodyModel[54].rotateAngleX = 0.26179939F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[55].setRotationPoint(-29.5F, -13F, 18.1F);
		bodyModel[55].rotateAngleX = -0.50614548F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 165
		bodyModel[56].setRotationPoint(-29.5F, -23.5F, 15.1F);
		bodyModel[56].rotateAngleX = 0.26179939F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[57].setRotationPoint(13.5F, -24F, -17.1F);
		bodyModel[57].rotateAngleX = -0.26179939F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 16, 12, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 170
		bodyModel[58].setRotationPoint(13.5F, -12F, -20F);
		bodyModel[58].rotateAngleX = 0.50614548F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 16, 12, 2, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[59].setRotationPoint(-29.5F, -12F, -20F);
		bodyModel[59].rotateAngleX = 0.50614548F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[60].setRotationPoint(-29.5F, -24F, -17.1F);
		bodyModel[60].rotateAngleX = -0.26179939F;

		bodyModel[61].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 202
		bodyModel[61].setRotationPoint(41.5F, -11F, 10F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 202
		bodyModel[62].setRotationPoint(-42.5F, -11F, 10F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 202
		bodyModel[63].setRotationPoint(-42.5F, -11F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 202
		bodyModel[64].setRotationPoint(41.5F, -11F, -11F);

		bodyModel[65].addBox(0F, -1F, 0F, 21, 1, 1, 0F); // Box 177
		bodyModel[65].setRotationPoint(36F, -15.5F, -7F);
		bodyModel[65].rotateAngleZ = -0.45378561F;

		bodyModel[66].addBox(0F, 0F, 0F, 15, 1, 10, 0F); // Box 178
		bodyModel[66].setRotationPoint(-53.3F, -7.3F, -18F);
		bodyModel[66].rotateAngleZ = 0.4712389F;

		bodyModel[67].addShapeBox(-2F, 0F, 0F, 80, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F); // Box 181
		bodyModel[67].setRotationPoint(-38F, -14F, 17F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 168
		bodyModel[68].setRotationPoint(50F, -11F, 13F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 169
		bodyModel[69].setRotationPoint(50F, -11F, 17F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 170
		bodyModel[70].setRotationPoint(50F, -11F, -13F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 171
		bodyModel[71].setRotationPoint(50F, -11F, -17F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 175
		bodyModel[72].setRotationPoint(50F, -12.8F, -16.1F);
		bodyModel[72].rotateAngleX = -0.4712389F;

		bodyModel[73].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 176
		bodyModel[73].setRotationPoint(50F, -12.8F, 13.9F);
		bodyModel[73].rotateAngleX = -0.4712389F;

		bodyModel[74].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 177
		bodyModel[74].setRotationPoint(50F, -12.8F, 16.1F);
		bodyModel[74].rotateAngleX = 0.4712389F;

		bodyModel[75].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 178
		bodyModel[75].setRotationPoint(50F, -12.8F, -13.9F);
		bodyModel[75].rotateAngleX = 0.4712389F;

		bodyModel[76].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 180
		bodyModel[76].setRotationPoint(50F, -12.8F, 14F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 181
		bodyModel[77].setRotationPoint(50F, -12.8F, -16F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[78].setRotationPoint(-51F, -11F, -17F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[79].setRotationPoint(-51F, -11F, -13F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[80].setRotationPoint(-51F, -11F, 13F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[81].setRotationPoint(-51F, -11F, 17F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 186
		bodyModel[82].setRotationPoint(-51F, -12.8F, -16.1F);
		bodyModel[82].rotateAngleX = -0.4712389F;

		bodyModel[83].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 187
		bodyModel[83].setRotationPoint(-51F, -12.8F, -13.9F);
		bodyModel[83].rotateAngleX = 0.4712389F;

		bodyModel[84].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 188
		bodyModel[84].setRotationPoint(-51F, -12.8F, -16F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 189
		bodyModel[85].setRotationPoint(-51F, -12.8F, 16.1F);
		bodyModel[85].rotateAngleX = 0.4712389F;

		bodyModel[86].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 190
		bodyModel[86].setRotationPoint(-51F, -12.8F, 14F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 191
		bodyModel[87].setRotationPoint(-51F, -12.8F, 13.9F);
		bodyModel[87].rotateAngleX = -0.4712389F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[88].setRotationPoint(-51.05F, -12F, 13F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[89].setRotationPoint(-51.05F, -12F, -17F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[90].setRotationPoint(-51.05F, -12F, -17F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[91].setRotationPoint(52.05F, -12F, -17F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[92].setRotationPoint(52.05F, -12F, -17F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[93].setRotationPoint(52.05F, -12F, 13F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[94].setRotationPoint(52.05F, -12F, 13F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[95].setRotationPoint(52.05F, -10F, 13F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[96].setRotationPoint(52.05F, -10F, -17F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[97].setRotationPoint(-51.05F, -10F, -17F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[98].setRotationPoint(-51.05F, -10F, 13F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 56, 7, 5, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[99].setRotationPoint(-28F, -25F, 12F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 7, 34, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 201
		bodyModel[100].setRotationPoint(19F, -25F, -17F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 48, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[101].setRotationPoint(-24F, -25F, -15F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 7, 34, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[102].setRotationPoint(-28F, -25F, -17F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 80, 4, 3, 0F, -12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[103].setRotationPoint(-40F, -18F, 15F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 13, 4, 36, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[104].setRotationPoint(27F, -18F, -18F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 13, 4, 36, 0F, -12F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[105].setRotationPoint(-40F, -18F, -18F);

		bodyModel[106].addShapeBox(-2F, 0F, 0F, 13, 5, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 9F, -0.5F, 0F); // Box 207
		bodyModel[106].setRotationPoint(-38F, -14F, -18F);

		bodyModel[107].addShapeBox(-2F, 0F, 0F, 80, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F); // Box 208
		bodyModel[107].setRotationPoint(-38F, -14F, 17F);

		bodyModel[108].addShapeBox(-2F, 0F, 0F, 80, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F); // Box 209
		bodyModel[108].setRotationPoint(-38F, -14F, -18F);

		bodyModel[109].addShapeBox(-2F, 0F, 0F, 13, 5, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[109].setRotationPoint(29F, -14F, -18F);

		bodyModel[110].addShapeBox(-2F, 0F, 0F, 80, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 211
		bodyModel[110].setRotationPoint(-38F, -10F, 8F);

		bodyModel[111].addShapeBox(-2F, 0F, 0F, 80, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 212
		bodyModel[111].setRotationPoint(-38F, -10F, -18F);

		bodyModel[112].addShapeBox(-2F, 0F, 0F, 80, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F); // Box 213
		bodyModel[112].setRotationPoint(-38F, -14F, -18F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 30, 9, 16, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[113].setRotationPoint(28F, -14F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 55, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[114].setRotationPoint(-27F, -10F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 23, 7, 34, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[115].setRotationPoint(-11.5F, -25F, -17F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 23, 4, 36, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[116].setRotationPoint(-11.5F, -18F, -18F);

		bodyModel[117].addShapeBox(-2F, 0F, 0F, 23, 5, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 218
		bodyModel[117].setRotationPoint(-9.5F, -14F, -18F);

		bodyModel[118].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 202
		bodyModel[118].setRotationPoint(23F, -19.9F, 9.6F);
		bodyModel[118].rotateAngleY = -0.01745329F;
		bodyModel[118].rotateAngleZ = 0.01745329F;

		bodyModel[119].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 202
		bodyModel[119].setRotationPoint(-29F, -20F, 9.5F);
		bodyModel[119].rotateAngleY = -0.01745329F;
		bodyModel[119].rotateAngleZ = 0.01745329F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 202
		bodyModel[120].setRotationPoint(-24F, -19.1F, 9.4F);
		bodyModel[120].rotateAngleY = -0.01745329F;
		bodyModel[120].rotateAngleZ = 0.01745329F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 202
		bodyModel[121].setRotationPoint(23.5F, -20.25F, 9F);
		bodyModel[121].rotateAngleY = -0.01745329F;
		bodyModel[121].rotateAngleZ = 0.01745329F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 202
		bodyModel[122].setRotationPoint(-24.75F, -20.25F, 10F);
		bodyModel[122].rotateAngleY = -0.01745329F;
		bodyModel[122].rotateAngleZ = 0.01745329F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[123].setRotationPoint(-27F, -15F, -5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[124].setRotationPoint(-27F, -20F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[125].setRotationPoint(22F, -15F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 5, 10, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[126].setRotationPoint(22F, -20F, -5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 202
		bodyModel[127].setRotationPoint(-14F, -17F, 4F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 202
		bodyModel[128].setRotationPoint(-14F, -17F, -14F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 202
		bodyModel[129].setRotationPoint(13F, -17F, -14F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 202
		bodyModel[130].setRotationPoint(13F, -17F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 5, 35, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[131].setRotationPoint(22F, -15F, -17.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 5, 35, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[132].setRotationPoint(-27F, -15F, -17.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 202
		bodyModel[133].setRotationPoint(23F, -19F, 9.5F);
		bodyModel[133].rotateAngleY = -0.01745329F;
		bodyModel[133].rotateAngleZ = 0.01745329F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[134].setRotationPoint(28F, -20.1F, 9.4F);
		bodyModel[134].rotateAngleY = -0.01745329F;
		bodyModel[134].rotateAngleZ = 0.01745329F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.85F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.85F); // Box 202
		bodyModel[135].setRotationPoint(24F, -20F, 10.3F);
		bodyModel[135].rotateAngleY = -0.01745329F;
		bodyModel[135].rotateAngleZ = 0.01745329F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.85F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.85F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 202
		bodyModel[136].setRotationPoint(-25F, -20F, 8F);
		bodyModel[136].rotateAngleY = -0.01745329F;
		bodyModel[136].rotateAngleZ = 0.01745329F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 202
		bodyModel[137].setRotationPoint(23F, -16F, -11.5F);
		bodyModel[137].rotateAngleZ = -0.78539816F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 202
		bodyModel[138].setRotationPoint(22F, -15.5F, -12.5F);
		bodyModel[138].rotateAngleZ = 0.78539816F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 202
		bodyModel[139].setRotationPoint(-25.5F, -13.2F, -11.5F);
		bodyModel[139].rotateAngleZ = 0.78539816F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F); // Box 202
		bodyModel[140].setRotationPoint(21.3F, -14.8F, -12.5F);
		bodyModel[140].rotateAngleZ = 0.78539816F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 202
		bodyModel[141].setRotationPoint(22.7F, -16.2F, -12.5F);
		bodyModel[141].rotateAngleZ = 0.78539816F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 202
		bodyModel[142].setRotationPoint(-22.4F, -16.2F, -12.5F);
		bodyModel[142].rotateAngleZ = -0.78539816F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F); // Box 202
		bodyModel[143].setRotationPoint(-23.1F, -16.9F, -12.5F);
		bodyModel[143].rotateAngleZ = -0.78539816F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F); // Box 202
		bodyModel[144].setRotationPoint(-21.7F, -15.5F, -12.5F);
		bodyModel[144].rotateAngleZ = -0.78539816F;


		turretModel = new ModelRendererTurbo[15];
		turretModel[0] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 110
		turretModel[1] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 112
		turretModel[2] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 113
		turretModel[3] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 114
		turretModel[4] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 115
		turretModel[5] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 116
		turretModel[6] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 117
		turretModel[7] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 118
		turretModel[8] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 112
		turretModel[9] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 114
		turretModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 116
		turretModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 117
		turretModel[12] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 119
		turretModel[13] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 120
		turretModel[14] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 157

		turretModel[0].addBox(0F, 0F, 0F, 7, 1, 25, 0F); // Box 110
		turretModel[0].setRotationPoint(-3F, -26F, -12.5F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 9, 1, 25, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 112
		turretModel[1].setRotationPoint(4F, -26F, -12.5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 25, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 113
		turretModel[2].setRotationPoint(-12F, -26F, -12.5F);

		turretModel[3].addShapeBox(-1F, 0F, 0F, 16, 5, 27, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 114
		turretModel[3].setRotationPoint(1F, -38F, -13.5F);

		turretModel[4].addShapeBox(-1F, 0F, 0F, 16, 7, 27, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 115
		turretModel[4].setRotationPoint(1F, -33F, -13.5F);

		turretModel[5].addShapeBox(-1F, 0F, 0F, 5, 10, 27, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 116
		turretModel[5].setRotationPoint(-4F, -36F, -13.5F);

		turretModel[6].addShapeBox(-1F, 0F, 0F, 5, 8, 25, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 117
		turretModel[6].setRotationPoint(-9F, -34F, -12.5F);

		turretModel[7].addShapeBox(-1F, 0F, 0F, 5, 6, 19, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 118
		turretModel[7].setRotationPoint(-14F, -32F, -9.5F);

		turretModel[8].addShapeBox(-1F, 0F, 0F, 5, 2, 25, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 112
		turretModel[8].setRotationPoint(-9F, -36.01F, -12.5F);

		turretModel[9].addShapeBox(-1F, 0F, 0F, 5, 2, 19, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 114
		turretModel[9].setRotationPoint(-14F, -34.01F, -9.5F);

		turretModel[10].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, 1.00F, ModelRendererTurbo.MR_RIGHT); // Box 116
		turretModel[10].setRotationPoint(16F, -31F, 4.5F);

		turretModel[11].addTrapezoid(0F, 0F, 0F, 2, 2, 2, 0F, 1.50F, ModelRendererTurbo.MR_RIGHT); // Box 117
		turretModel[11].setRotationPoint(15F, -31F, -6.5F);

		turretModel[12].addTrapezoid(0F, -1F, 0F, 2, 2, 2, 0F, 1.00F, ModelRendererTurbo.MR_RIGHT); // Box 119
		turretModel[12].setRotationPoint(18F, -30F, 4.5F);

		turretModel[13].addShapeBox(-1F, 0F, 0F, 5, 2, 27, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 120
		turretModel[13].setRotationPoint(-4F, -38.01F, -13.5F);

		turretModel[14].addBox(2F, -0.5F, 0F, 5, 1, 1, 0F); // Box 157
		turretModel[14].setRotationPoint(18F, -30F, 5F);


		barrelModel = new ModelRendererTurbo[2];
		barrelModel[0] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 118
		barrelModel[1] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 158

		barrelModel[0].addTrapezoid(0F, 0F, -1F, 2, 2, 2, 0F, 1.50F, ModelRendererTurbo.MR_RIGHT); // Box 118
		barrelModel[0].setRotationPoint(17F, -30F, -5.5F);

		barrelModel[1].addBox(2F, 0.5F, -0.5F, 15, 1, 1, 0F); // Box 158
		barrelModel[1].setRotationPoint(17F, -30F, -5.5F);


		leftFrontWheelModel = new ModelRendererTurbo[6];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 181
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 182
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 195
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 76
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 77
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 78

		leftFrontWheelModel[0].addShapeBox(-9F, 4.5F, -2F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 181
		leftFrontWheelModel[0].setRotationPoint(42F, 0.5F, 15F);

		leftFrontWheelModel[1].addShapeBox(-9F, -3.5F, -2F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		leftFrontWheelModel[1].setRotationPoint(42F, 0.5F, 15F);

		leftFrontWheelModel[2].addShapeBox(-9F, -8.5F, -2F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		leftFrontWheelModel[2].setRotationPoint(42F, 0.5F, 15F);

		leftFrontWheelModel[3].addShapeBox(-6F, -2.5F, -3F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		leftFrontWheelModel[3].setRotationPoint(42F, 0.5F, 15F);

		leftFrontWheelModel[4].addShapeBox(-6F, -5.5F, -3F, 12, 3, 6, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		leftFrontWheelModel[4].setRotationPoint(42F, 0.5F, 15F);

		leftFrontWheelModel[5].addShapeBox(-6F, 3.5F, -3F, 12, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 78
		leftFrontWheelModel[5].setRotationPoint(42F, 0.5F, 15F);


		rightFrontWheelModel = new ModelRendererTurbo[6];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 200
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 201
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 202
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 203
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 204
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 205

		rightFrontWheelModel[0].addShapeBox(-9F, -8.5F, -2F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rightFrontWheelModel[0].setRotationPoint(42F, 0.5F, -15F);

		rightFrontWheelModel[1].addShapeBox(-6F, -2.5F, -3F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		rightFrontWheelModel[1].setRotationPoint(42F, 0.5F, -15F);

		rightFrontWheelModel[2].addShapeBox(-9F, -3.5F, -2F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		rightFrontWheelModel[2].setRotationPoint(42F, 0.5F, -15F);

		rightFrontWheelModel[3].addShapeBox(-6F, 3.5F, -3F, 12, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 203
		rightFrontWheelModel[3].setRotationPoint(42F, 0.5F, -15F);

		rightFrontWheelModel[4].addShapeBox(-9F, 4.5F, -2F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 204
		rightFrontWheelModel[4].setRotationPoint(42F, 0.5F, -15F);

		rightFrontWheelModel[5].addShapeBox(-6F, -5.5F, -3F, 12, 3, 6, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightFrontWheelModel[5].setRotationPoint(42F, 0.5F, -15F);


		leftBackWheelModel = new ModelRendererTurbo[12];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 206
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 207
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 208
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 209
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 210
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 211
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 212
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 213
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 214
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 215
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 216
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 217

		leftBackWheelModel[0].addShapeBox(-9F, -8.5F, -2F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftBackWheelModel[0].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[1].addShapeBox(-6F, -2.5F, -3F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftBackWheelModel[1].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[2].addShapeBox(-6F, -5.5F, -3F, 12, 3, 6, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		leftBackWheelModel[2].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[3].addShapeBox(-9F, -3.5F, -2F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftBackWheelModel[3].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[4].addShapeBox(-6F, 3.5F, -3F, 12, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 210
		leftBackWheelModel[4].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[5].addShapeBox(-9F, 4.5F, -2F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 211
		leftBackWheelModel[5].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[6].addShapeBox(-9F, -8.5F, -2F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		leftBackWheelModel[6].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[7].addShapeBox(-6F, -2.5F, -3F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		leftBackWheelModel[7].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[8].addShapeBox(-6F, -5.5F, -3F, 12, 3, 6, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		leftBackWheelModel[8].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[9].addShapeBox(-9F, -3.5F, -2F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		leftBackWheelModel[9].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[10].addShapeBox(-6F, 3.5F, -3F, 12, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 216
		leftBackWheelModel[10].setRotationPoint(-42F, 0.5F, 15F);

		leftBackWheelModel[11].addShapeBox(-9F, 4.5F, -2F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 217
		leftBackWheelModel[11].setRotationPoint(-42F, 0.5F, 15F);


		rightBackWheelModel = new ModelRendererTurbo[34];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 218
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 219
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 220
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 221
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 222
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 223
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 267
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 268
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 269
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 270
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 271
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 272
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 273
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 274
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 275
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 276
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 277
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 278
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 279
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 280
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 281
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 282
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 283
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 284
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 285
		rightBackWheelModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 286
		rightBackWheelModel[26] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 287
		rightBackWheelModel[27] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 288
		rightBackWheelModel[28] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 289
		rightBackWheelModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 290
		rightBackWheelModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 291
		rightBackWheelModel[31] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 292
		rightBackWheelModel[32] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 293
		rightBackWheelModel[33] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 294

		rightBackWheelModel[0].addShapeBox(-9F, -8.5F, -2F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		rightBackWheelModel[0].setRotationPoint(-42F, 0.5F, -15F);

		rightBackWheelModel[1].addShapeBox(-6F, -2.5F, -3F, 12, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		rightBackWheelModel[1].setRotationPoint(-42F, 0.5F, -15F);

		rightBackWheelModel[2].addShapeBox(-6F, -5.5F, -3F, 12, 3, 6, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightBackWheelModel[2].setRotationPoint(-42F, 0.5F, -15F);

		rightBackWheelModel[3].addShapeBox(-9F, -3.5F, -2F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightBackWheelModel[3].setRotationPoint(-42F, 0.5F, -15F);

		rightBackWheelModel[4].addShapeBox(-6F, 3.5F, -3F, 12, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 222
		rightBackWheelModel[4].setRotationPoint(-42F, 0.5F, -15F);

		rightBackWheelModel[5].addShapeBox(-9F, 4.5F, -2F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 223
		rightBackWheelModel[5].setRotationPoint(-42F, 0.5F, -15F);

		rightBackWheelModel[6].addShapeBox(-6F, 3.5F, -3F, 12, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 267
		rightBackWheelModel[6].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[7].addShapeBox(-9F, 4.5F, 0F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 268
		rightBackWheelModel[7].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[8].addShapeBox(-9F, -3.5F, 0F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		rightBackWheelModel[8].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[9].addShapeBox(-9F, -8.5F, 0F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		rightBackWheelModel[9].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[10].addShapeBox(-6F, -5.5F, -3F, 12, 3, 8, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		rightBackWheelModel[10].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[11].addShapeBox(-6F, -2.5F, -3F, 12, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		rightBackWheelModel[11].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[12].addBox(-4F, 6.5F, -5F, 8, 3, 4, 0F); // Box 273
		rightBackWheelModel[12].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[13].addShapeBox(-4F, 2.5F, -5F, 3, 7, 4, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 274
		rightBackWheelModel[13].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[14].addBox(-9F, -3.5F, -5F, 3, 8, 4, 0F); // Box 275
		rightBackWheelModel[14].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[15].addShapeBox(-10F, -8.5F, -5F, 3, 7, 4, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 276
		rightBackWheelModel[15].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[16].addBox(-4F, -8.5F, -5F, 8, 3, 4, 0F); // Box 277
		rightBackWheelModel[16].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[17].addShapeBox(7F, -8.5F, -5F, 3, 7, 4, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 278
		rightBackWheelModel[17].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[18].addBox(6F, -3.5F, -5F, 3, 8, 4, 0F); // Box 279
		rightBackWheelModel[18].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[19].addShapeBox(1F, 2.5F, -5F, 3, 7, 4, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 280
		rightBackWheelModel[19].setRotationPoint(10F, 0.5F, -17F);

		rightBackWheelModel[20].addBox(-4F, 6.5F, -5F, 8, 3, 4, 0F); // Box 281
		rightBackWheelModel[20].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[21].addShapeBox(-9F, 4.5F, 0F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 282
		rightBackWheelModel[21].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[22].addShapeBox(-4F, 2.5F, -5F, 3, 7, 4, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 283
		rightBackWheelModel[22].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[23].addShapeBox(1F, 2.5F, -5F, 3, 7, 4, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 284
		rightBackWheelModel[23].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[24].addShapeBox(-9F, -3.5F, 0F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightBackWheelModel[24].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[25].addBox(-9F, -3.5F, -5F, 3, 8, 4, 0F); // Box 286
		rightBackWheelModel[25].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[26].addShapeBox(-10F, -8.5F, -5F, 3, 7, 4, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 287
		rightBackWheelModel[26].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[27].addBox(-4F, -8.5F, -5F, 8, 3, 4, 0F); // Box 288
		rightBackWheelModel[27].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[28].addShapeBox(7F, -8.5F, -5F, 3, 7, 4, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 289
		rightBackWheelModel[28].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[29].addBox(6F, -3.5F, -5F, 3, 8, 4, 0F); // Box 290
		rightBackWheelModel[29].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[30].addShapeBox(-9F, -8.5F, 0F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightBackWheelModel[30].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[31].addShapeBox(-6F, 3.5F, -3F, 12, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 292
		rightBackWheelModel[31].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[32].addShapeBox(-6F, -2.5F, -3F, 12, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightBackWheelModel[32].setRotationPoint(-10F, 0.5F, -17F);

		rightBackWheelModel[33].addShapeBox(-6F, -5.5F, -3F, 12, 3, 8, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightBackWheelModel[33].setRotationPoint(-10F, 0.5F, -17F);


		leftTrackWheelModels = new ModelRendererTurbo[28];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 205
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 224
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 225
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 226
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 227
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 228
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 229
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 233
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 234
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 235
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 236
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 237
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 238
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 239
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 240
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 241
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 242
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 243
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 244
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 245
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 246
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 247
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 248
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 249
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 250
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 251
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 252

		leftTrackWheelModels[0].addBox(6F, -3.5F, 3F, 3, 8, 4, 0F); // Box 79
		leftTrackWheelModels[0].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[1].addShapeBox(-10F, -8.5F, 3F, 3, 7, 4, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 205
		leftTrackWheelModels[1].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[2].addShapeBox(-9F, 4.5F, -2F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 224
		leftTrackWheelModels[2].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[3].addShapeBox(-6F, 3.5F, -3F, 12, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 225
		leftTrackWheelModels[3].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[4].addShapeBox(-6F, -2.5F, -3F, 12, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		leftTrackWheelModels[4].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[5].addShapeBox(-9F, -3.5F, -2F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		leftTrackWheelModels[5].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[6].addShapeBox(-9F, -8.5F, -2F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		leftTrackWheelModels[6].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[7].addShapeBox(-6F, -5.5F, -3F, 12, 3, 8, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		leftTrackWheelModels[7].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[8].addBox(-9F, -3.5F, 3F, 3, 8, 4, 0F); // Box 233
		leftTrackWheelModels[8].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[9].addBox(-4F, 6.5F, 3F, 8, 3, 4, 0F); // Box 234
		leftTrackWheelModels[9].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[10].addBox(-4F, -8.5F, 3F, 8, 3, 4, 0F); // Box 235
		leftTrackWheelModels[10].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[11].addShapeBox(7F, -8.5F, 3F, 3, 7, 4, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 236
		leftTrackWheelModels[11].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[12].addShapeBox(1F, 2.5F, 3F, 3, 7, 4, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 237
		leftTrackWheelModels[12].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[13].addShapeBox(-4F, 2.5F, 3F, 3, 7, 4, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 238
		leftTrackWheelModels[13].setRotationPoint(10F, 0.5F, 15F);

		leftTrackWheelModels[14].addShapeBox(-9F, 4.5F, -2F, 18, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 239
		leftTrackWheelModels[14].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[15].addShapeBox(-9F, -3.5F, -2F, 18, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		leftTrackWheelModels[15].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[16].addShapeBox(-6F, -2.5F, -3F, 12, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		leftTrackWheelModels[16].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[17].addShapeBox(-6F, 3.5F, -3F, 12, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 242
		leftTrackWheelModels[17].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[18].addShapeBox(-6F, -5.5F, -3F, 12, 3, 8, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftTrackWheelModels[18].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[19].addShapeBox(-9F, -8.5F, -2F, 18, 5, 4, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftTrackWheelModels[19].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[20].addShapeBox(-10F, -8.5F, 3F, 3, 7, 4, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 245
		leftTrackWheelModels[20].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[21].addBox(-4F, -8.5F, 3F, 8, 3, 4, 0F); // Box 246
		leftTrackWheelModels[21].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[22].addShapeBox(7F, -8.5F, 3F, 3, 7, 4, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 247
		leftTrackWheelModels[22].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[23].addBox(6F, -3.5F, 3F, 3, 8, 4, 0F); // Box 248
		leftTrackWheelModels[23].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[24].addShapeBox(1F, 2.5F, 3F, 3, 7, 4, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F); // Box 249
		leftTrackWheelModels[24].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[25].addBox(-4F, 6.5F, 3F, 8, 3, 4, 0F); // Box 250
		leftTrackWheelModels[25].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[26].addShapeBox(-4F, 2.5F, 3F, 3, 7, 4, 0F, 5F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F); // Box 251
		leftTrackWheelModels[26].setRotationPoint(-10F, 0.5F, 15F);

		leftTrackWheelModels[27].addBox(-9F, -3.5F, 3F, 3, 8, 4, 0F); // Box 252
		leftTrackWheelModels[27].setRotationPoint(-10F, 0.5F, 15F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}