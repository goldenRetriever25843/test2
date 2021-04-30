//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ImperialBattleship
// Model Creator: 
// Created on: 08.08.2016 - 20:08:58
// Last changed on: 08.08.2016 - 20:08:58

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelImperialBattleship extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelImperialBattleship() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[143];
		noseModel = new ModelRendererTurbo[71];

		initbodyModel_1();
		initnoseModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 1385, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 1577, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 1545, 41, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 1081, 49, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 1297, 57, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 1497, 97, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 1881, 1, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 1913, 25, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 745, 57, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 1913, 57, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 1945, 81, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 1153, 105, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 1353, 1, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 1257, 113, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 1417, 113, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 1473, 137, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 1481, 113, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 135
		bodyModel[61] = new ModelRendererTurbo(this, 641, 209, textureX, textureY); // Box 136
		bodyModel[62] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Box 137
		bodyModel[63] = new ModelRendererTurbo(this, 1161, 209, textureX, textureY); // Box 138
		bodyModel[64] = new ModelRendererTurbo(this, 1809, 161, textureX, textureY); // Box 139
		bodyModel[65] = new ModelRendererTurbo(this, 1801, 193, textureX, textureY); // Box 140
		bodyModel[66] = new ModelRendererTurbo(this, 1585, 113, textureX, textureY); // Box 141
		bodyModel[67] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 142
		bodyModel[68] = new ModelRendererTurbo(this, 1049, 49, textureX, textureY); // Box 143
		bodyModel[69] = new ModelRendererTurbo(this, 1977, 113, textureX, textureY); // Box 144
		bodyModel[70] = new ModelRendererTurbo(this, 1297, 137, textureX, textureY); // Box 145
		bodyModel[71] = new ModelRendererTurbo(this, 1865, 137, textureX, textureY); // Box 146
		bodyModel[72] = new ModelRendererTurbo(this, 1977, 137, textureX, textureY); // Box 147
		bodyModel[73] = new ModelRendererTurbo(this, 1425, 209, textureX, textureY); // Box 148
		bodyModel[74] = new ModelRendererTurbo(this, 1497, 209, textureX, textureY); // Box 149
		bodyModel[75] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 150
		bodyModel[76] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 151
		bodyModel[77] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 152
		bodyModel[78] = new ModelRendererTurbo(this, 1265, 49, textureX, textureY); // Box 153
		bodyModel[79] = new ModelRendererTurbo(this, 1729, 49, textureX, textureY); // Box 154
		bodyModel[80] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 155
		bodyModel[81] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 156
		bodyModel[82] = new ModelRendererTurbo(this, 1521, 57, textureX, textureY); // Box 157
		bodyModel[83] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 158
		bodyModel[84] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 159
		bodyModel[85] = new ModelRendererTurbo(this, 1265, 65, textureX, textureY); // Box 160
		bodyModel[86] = new ModelRendererTurbo(this, 1737, 65, textureX, textureY); // Box 161
		bodyModel[87] = new ModelRendererTurbo(this, 1569, 217, textureX, textureY); // Box 162
		bodyModel[88] = new ModelRendererTurbo(this, 945, 121, textureX, textureY); // Box 163
		bodyModel[89] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 164
		bodyModel[90] = new ModelRendererTurbo(this, 1833, 217, textureX, textureY); // Box 165
		bodyModel[91] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 166
		bodyModel[92] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 167
		bodyModel[93] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 168
		bodyModel[94] = new ModelRendererTurbo(this, 1377, 233, textureX, textureY); // Box 169
		bodyModel[95] = new ModelRendererTurbo(this, 1521, 233, textureX, textureY); // Box 170
		bodyModel[96] = new ModelRendererTurbo(this, 1665, 233, textureX, textureY); // Box 171
		bodyModel[97] = new ModelRendererTurbo(this, 1809, 233, textureX, textureY); // Box 172
		bodyModel[98] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 173
		bodyModel[99] = new ModelRendererTurbo(this, 1905, 249, textureX, textureY); // Box 174
		bodyModel[100] = new ModelRendererTurbo(this, 97, 257, textureX, textureY); // Box 175
		bodyModel[101] = new ModelRendererTurbo(this, 601, 257, textureX, textureY); // Box 176
		bodyModel[102] = new ModelRendererTurbo(this, 745, 257, textureX, textureY); // Box 177
		bodyModel[103] = new ModelRendererTurbo(this, 889, 257, textureX, textureY); // Box 178
		bodyModel[104] = new ModelRendererTurbo(this, 1065, 257, textureX, textureY); // Box 179
		bodyModel[105] = new ModelRendererTurbo(this, 1241, 257, textureX, textureY); // Box 180
		bodyModel[106] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 181
		bodyModel[107] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 182
		bodyModel[108] = new ModelRendererTurbo(this, 1369, 289, textureX, textureY); // Box 183
		bodyModel[109] = new ModelRendererTurbo(this, 1545, 289, textureX, textureY); // Box 184
		bodyModel[110] = new ModelRendererTurbo(this, 545, 289, textureX, textureY); // Box 185
		bodyModel[111] = new ModelRendererTurbo(this, 1665, 289, textureX, textureY); // Box 186
		bodyModel[112] = new ModelRendererTurbo(this, 1793, 305, textureX, textureY); // Box 187
		bodyModel[113] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 188
		bodyModel[114] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 189
		bodyModel[115] = new ModelRendererTurbo(this, 121, 313, textureX, textureY); // Box 190
		bodyModel[116] = new ModelRendererTurbo(this, 609, 313, textureX, textureY); // Box 191
		bodyModel[117] = new ModelRendererTurbo(this, 737, 321, textureX, textureY); // Box 192
		bodyModel[118] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 193
		bodyModel[119] = new ModelRendererTurbo(this, 953, 321, textureX, textureY); // Box 194
		bodyModel[120] = new ModelRendererTurbo(this, 1169, 321, textureX, textureY); // Box 195
		bodyModel[121] = new ModelRendererTurbo(this, 145, 345, textureX, textureY); // Box 196
		bodyModel[122] = new ModelRendererTurbo(this, 297, 345, textureX, textureY); // Box 197
		bodyModel[123] = new ModelRendererTurbo(this, 1241, 377, textureX, textureY); // Box 198
		bodyModel[124] = new ModelRendererTurbo(this, 1617, 401, textureX, textureY); // Box 199
		bodyModel[125] = new ModelRendererTurbo(this, 913, 393, textureX, textureY); // Box 200
		bodyModel[126] = new ModelRendererTurbo(this, 521, 361, textureX, textureY); // Box 201
		bodyModel[127] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 202
		bodyModel[128] = new ModelRendererTurbo(this, 257, 409, textureX, textureY); // Box 203
		bodyModel[129] = new ModelRendererTurbo(this, 441, 433, textureX, textureY); // Box 204
		bodyModel[130] = new ModelRendererTurbo(this, 1089, 441, textureX, textureY); // Box 205
		bodyModel[131] = new ModelRendererTurbo(this, 1497, 449, textureX, textureY); // Box 206
		bodyModel[132] = new ModelRendererTurbo(this, 89, 417, textureX, textureY); // Box 207
		bodyModel[133] = new ModelRendererTurbo(this, 1649, 449, textureX, textureY); // Box 208
		bodyModel[134] = new ModelRendererTurbo(this, 793, 433, textureX, textureY); // Box 209
		bodyModel[135] = new ModelRendererTurbo(this, 2009, 185, textureX, textureY); // Box 210
		bodyModel[136] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 211
		bodyModel[137] = new ModelRendererTurbo(this, 1537, 57, textureX, textureY); // Box 212
		bodyModel[138] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 213
		bodyModel[139] = new ModelRendererTurbo(this, 1705, 97, textureX, textureY); // Box 214
		bodyModel[140] = new ModelRendererTurbo(this, 1673, 113, textureX, textureY); // Box 215
		bodyModel[141] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 216
		bodyModel[142] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 217

		bodyModel[0].addBox(-2F, 0F, 0F, 6, 10, 27, 0F); // Box 1
		bodyModel[0].setRotationPoint(212F, -92F, 9F);
		bodyModel[0].rotateAngleZ = -0.15707963F;

		bodyModel[1].addShapeBox(-2F, -21F, 0F, 6, 21, 27, 0F,0F, -1F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(212F, -92F, 9F);
		bodyModel[1].rotateAngleZ = -0.15707963F;

		bodyModel[2].addShapeBox(-2F, 10F, 0F, 6, 7, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, -5F); // Box 3
		bodyModel[2].setRotationPoint(212F, -92F, 9F);
		bodyModel[2].rotateAngleZ = -0.15707963F;

		bodyModel[3].addShapeBox(-2F, 10F, 0F, 103, 10, 32, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, -5F); // Box 5
		bodyModel[3].setRotationPoint(110F, -92F, 6.5F);

		bodyModel[4].addShapeBox(-2F, 0F, 0F, 36, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(178F, -92F, 6.5F);

		bodyModel[5].addShapeBox(-2F, -21F, 0F, 27, 23, 30, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 1F); // Box 7
		bodyModel[5].setRotationPoint(190F, -94F, 7.5F);

		bodyModel[6].addBox(-2F, 0F, 0F, 6, 10, 27, 0F); // Box 8
		bodyModel[6].setRotationPoint(212F, -92F, -36F);
		bodyModel[6].rotateAngleZ = -0.15707963F;

		bodyModel[7].addShapeBox(-2F, -21F, 0F, 6, 21, 27, 0F,0F, -1F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(212F, -92F, -36F);
		bodyModel[7].rotateAngleZ = -0.15707963F;

		bodyModel[8].addShapeBox(-2F, 10F, 0F, 6, 7, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, -5F); // Box 10
		bodyModel[8].setRotationPoint(212F, -92F, -36F);
		bodyModel[8].rotateAngleZ = -0.15707963F;

		bodyModel[9].addShapeBox(-2F, 10F, 0F, 103, 10, 32, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, -5F); // Box 11
		bodyModel[9].setRotationPoint(110F, -92F, -38.5F);

		bodyModel[10].addShapeBox(-2F, 0F, 0F, 36, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(178F, -92F, -38.5F);

		bodyModel[11].addShapeBox(-2F, -21F, 0F, 27, 23, 30, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 1F); // Box 13
		bodyModel[11].setRotationPoint(190F, -94F, -37.5F);

		bodyModel[12].addShapeBox(-2F, -4F, 0F, 6, 21, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1F, -7F); // Box 14
		bodyModel[12].setRotationPoint(218F, -51F, -13.5F);
		bodyModel[12].rotateAngleZ = 0.15707963F;

		bodyModel[13].addBox(-2F, -13F, 0F, 6, 9, 27, 0F); // Box 15
		bodyModel[13].setRotationPoint(218F, -51F, -13.5F);
		bodyModel[13].rotateAngleZ = 0.15707963F;

		bodyModel[14].addShapeBox(-2F, -21F, 0F, 6, 8, 27, 0F,0F, 1F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(218F, -51F, -13.5F);
		bodyModel[14].rotateAngleZ = 0.15707963F;

		bodyModel[15].addShapeBox(0F, -13F, 0F, 60, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(156F, -52F, -16F);

		bodyModel[16].addShapeBox(0F, -13F, 0F, 62, 22, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, -9F, 3F, 0F, -9F, 0F, 0F, -9F); // Box 18
		bodyModel[16].setRotationPoint(155.5F, -42F, -16F);

		bodyModel[17].addShapeBox(0F, -13F, 0F, 72, 9, 32, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(142.5F, -61F, -16F);

		bodyModel[18].addShapeBox(0F, -13F, 0F, 77, 17, 28, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(137.5F, -34F, -14F);

		bodyModel[19].addShapeBox(0F, -13F, 0F, 77, 11, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(137.5F, -17F, -14F);

		bodyModel[20].addShapeBox(0F, -13F, 0F, 77, 27, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -75F, -0.2F, 0F, -75F, -0.2F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(137.5F, -6F, -14F);

		bodyModel[21].addShapeBox(0F, -13F, 0F, 73, 55, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[21].setRotationPoint(64.5F, -34F, -14F);

		bodyModel[22].addShapeBox(0F, -13F, 0F, 93, 43, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -91F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -91F, -0.2F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-28.5F, -22F, -14F);

		bodyModel[23].addShapeBox(0F, -13F, 0F, 93, 43, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -91F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -91F, -0.2F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-28.5F, -22F, 9F);

		bodyModel[24].addShapeBox(0F, -13F, 0F, 88, 43, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -86F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -86F, -0.2F, 0F); // Box 26
		bodyModel[24].setRotationPoint(-23.5F, -22F, -9F);

		bodyModel[25].addShapeBox(0F, -13F, 0F, 93, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(-28.5F, -33F, -14F);

		bodyModel[26].addShapeBox(0F, -13F, 0F, 93, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(-28.5F, -33F, 9F);

		bodyModel[27].addShapeBox(0F, -13F, 0F, 93, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(-28.5F, -36F, 7F);

		bodyModel[28].addShapeBox(0F, -13F, 0F, 93, 3, 7, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(-28.5F, -36F, -14F);

		bodyModel[29].addShapeBox(0F, -13F, 0F, 88, 14, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(-23.5F, -36F, -9F);

		bodyModel[30].addShapeBox(0F, -13F, 0F, 41, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 5F); // Box 32
		bodyModel[30].setRotationPoint(-37.5F, -81F, 8F);

		bodyModel[31].addShapeBox(0F, -13F, 0F, 41, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1F); // Box 33
		bodyModel[31].setRotationPoint(-37.5F, -69F, 8F);

		bodyModel[32].addShapeBox(0F, -13F, 0F, 41, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 34
		bodyModel[32].setRotationPoint(-37.5F, -53F, 8F);

		bodyModel[33].addShapeBox(0F, -13F, 0F, 41, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -9F); // Box 35
		bodyModel[33].setRotationPoint(-37.5F, -39F, 8F);

		bodyModel[34].addShapeBox(0F, -13F, 0F, 20, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F); // Box 36
		bodyModel[34].setRotationPoint(3.5F, -81F, 8F);

		bodyModel[35].addShapeBox(0F, -13F, 0F, 20, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 37
		bodyModel[35].setRotationPoint(3.5F, -69F, 8F);

		bodyModel[36].addShapeBox(0F, -13F, 0F, 20, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 38
		bodyModel[36].setRotationPoint(3.5F, -39F, 8F);

		bodyModel[37].addShapeBox(0F, -13F, 0F, 20, 14, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 39
		bodyModel[37].setRotationPoint(3.5F, -53F, 8F);

		bodyModel[38].addShapeBox(0F, -13F, 0F, 41, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[38].setRotationPoint(-37.5F, -81F, -13F);

		bodyModel[39].addShapeBox(0F, -13F, 0F, 41, 16, 10, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[39].setRotationPoint(-37.5F, -69F, -18F);

		bodyModel[40].addShapeBox(0F, -13F, 0F, 41, 14, 10, 0F,0F, 0F, 1F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[40].setRotationPoint(-37.5F, -53F, -18F);

		bodyModel[41].addShapeBox(0F, -13F, 0F, 41, 4, 10, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 43
		bodyModel[41].setRotationPoint(-37.5F, -39F, -18F);

		bodyModel[42].addShapeBox(0F, -13F, 0F, 20, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[42].setRotationPoint(3.5F, -81F, -13F);

		bodyModel[43].addShapeBox(0F, -13F, 0F, 20, 16, 10, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[43].setRotationPoint(3.5F, -69F, -18F);

		bodyModel[44].addShapeBox(0F, -13F, 0F, 20, 4, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[44].setRotationPoint(3.5F, -39F, -18F);

		bodyModel[45].addShapeBox(0F, -13F, 0F, 20, 14, 10, 0F,0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[45].setRotationPoint(3.5F, -53F, -18F);

		bodyModel[46].addShapeBox(0F, -13F, 0F, 61, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[46].setRotationPoint(-37.5F, -84F, 8F);

		bodyModel[47].addShapeBox(0F, -13F, 0F, 61, 3, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[47].setRotationPoint(-37.5F, -84F, -13F);

		bodyModel[48].addShapeBox(0F, -13F, 0F, 61, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[48].setRotationPoint(-37.5F, -84.2F, -8F);

		bodyModel[49].addShapeBox(0F, -13F, 0F, 20, 14, 10, 0F,3F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[49].setRotationPoint(-57.5F, -53F, -18F);

		bodyModel[50].addShapeBox(0F, -13F, 0F, 163, 3, 12, 0F,0F, 0F, -5F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 7F, -9F, 0F, 7F, -1F, 0F, 0F, 0F); // Box 52
		bodyModel[50].setRotationPoint(-200.5F, -45F, -18F);

		bodyModel[51].addShapeBox(0F, -13F, 0F, 20, 16, 10, 0F,3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 53
		bodyModel[51].setRotationPoint(-57.5F, -69F, -18F);

		bodyModel[52].addShapeBox(0F, -13F, 0F, 20, 12, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 54
		bodyModel[52].setRotationPoint(-57.5F, -81F, -13F);

		bodyModel[53].addShapeBox(0F, -13F, 0F, 20, 14, 10, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F); // Box 55
		bodyModel[53].setRotationPoint(-57.5F, -53F, 8F);

		bodyModel[54].addShapeBox(0F, -13F, 0F, 20, 16, 10, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -5F); // Box 56
		bodyModel[54].setRotationPoint(-57.5F, -69F, 8F);

		bodyModel[55].addShapeBox(0F, -13F, 0F, 20, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 3F, 0F, 0F); // Box 57
		bodyModel[55].setRotationPoint(-57.5F, -81F, 8F);

		bodyModel[56].addShapeBox(0F, -13F, 0F, 163, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, 7F, -9F, 0F, 0F, -9F); // Box 58
		bodyModel[56].setRotationPoint(-200.5F, -45F, 6F);

		bodyModel[57].addShapeBox(0F, -13F, 0F, 163, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 1F, 0F, 7F, 1F, 0F, 0F, 0F); // Box 59
		bodyModel[57].setRotationPoint(-200.5F, -45F, -6F);

		bodyModel[58].addShapeBox(0F, -13F, 0F, 181, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[58].setRotationPoint(-161.5F, -86F, -5.5F);

		bodyModel[59].addShapeBox(0F, -13F, 0F, 39, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 61
		bodyModel[59].setRotationPoint(-200.5F, -86F, -4.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 121, 39, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 135
		bodyModel[60].setRotationPoint(-160.5F, -94F, 9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 121, 39, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[61].setRotationPoint(-160.5F, -94F, -13F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 125, 39, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[62].setRotationPoint(-160.5F, -94F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 125, 39, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[63].setRotationPoint(-160.5F, -94F, 5F);

		bodyModel[64].addShapeBox(0F, -13F, 0F, 88, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[64].setRotationPoint(-47.5F, -38F, -7F);

		bodyModel[65].addShapeBox(0F, -13F, 0F, 88, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 140
		bodyModel[65].setRotationPoint(-47.5F, -24F, -7F);

		bodyModel[66].addShapeBox(0F, -13F, 0F, 35, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[66].setRotationPoint(-81.5F, -38F, -4F);

		bodyModel[67].addShapeBox(0F, -13F, 0F, 1, 12, 8, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[67].setRotationPoint(-82.5F, -38.5F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 12, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 143
		bodyModel[68].setRotationPoint(-84.5F, -43.5F, -5.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[69].setRotationPoint(-24F, -86F, -25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[70].setRotationPoint(-24F, -78F, -25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 146
		bodyModel[71].setRotationPoint(-24F, -70F, -25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[72].setRotationPoint(-24F, -86F, 17F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[73].setRotationPoint(-24F, -78F, 17F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 149
		bodyModel[74].setRotationPoint(-24F, -70F, 17F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[75].setRotationPoint(-31F, -70F, 16F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 151
		bodyModel[76].setRotationPoint(-31F, -66F, 16F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[77].setRotationPoint(-31F, -68F, 16F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[78].setRotationPoint(-31F, -70F, -22F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 154
		bodyModel[79].setRotationPoint(-31F, -66F, -22F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[80].setRotationPoint(-31F, -68F, -22F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[81].setRotationPoint(-23F, -62F, -21F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 157
		bodyModel[82].setRotationPoint(-23F, -58F, -21F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[83].setRotationPoint(-23F, -60F, -21F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[84].setRotationPoint(-23F, -62F, 15F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[85].setRotationPoint(-23F, -58F, 15F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[86].setRotationPoint(-23F, -60F, 15F);

		bodyModel[87].addShapeBox(0F, -13F, 0F, 122, 4, 7, 0F,0F, -4F, -4F, 0F, -0.2F, -3F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 162
		bodyModel[87].setRotationPoint(-159.5F, -84.3F, -12F);

		bodyModel[88].addShapeBox(0F, -13F, 0F, 63, 4, 7, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[88].setRotationPoint(-120.5F, -80.7F, -12F);

		bodyModel[89].addShapeBox(0F, -13F, 0F, 122, 4, 7, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -4F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -3F); // Box 164
		bodyModel[89].setRotationPoint(-159.5F, -84.3F, 5F);

		bodyModel[90].addShapeBox(0F, -13F, 0F, 63, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[90].setRotationPoint(-120.5F, -80.7F, 5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 166
		bodyModel[91].setRotationPoint(89F, -77F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[92].setRotationPoint(89F, -85F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[93].setRotationPoint(89F, -93F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 169
		bodyModel[94].setRotationPoint(89F, -77F, -46F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[95].setRotationPoint(89F, -85F, -46F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[96].setRotationPoint(89F, -93F, -46F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 172
		bodyModel[97].setRotationPoint(81F, -47F, -46F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[98].setRotationPoint(81F, -55F, -46F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[99].setRotationPoint(81F, -63F, -46F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 175
		bodyModel[100].setRotationPoint(81F, -47F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[101].setRotationPoint(81F, -55F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 24, 8, 46, 0F,-8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[102].setRotationPoint(81F, -63F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 36, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[103].setRotationPoint(42F, -73F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 36, 12, 48, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[104].setRotationPoint(42F, -85F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 36, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 180
		bodyModel[105].setRotationPoint(42F, -61F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 36, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[106].setRotationPoint(42F, -73F, -48F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 36, 12, 48, 0F,-12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[107].setRotationPoint(42F, -85F, -48F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 36, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F); // Box 183
		bodyModel[108].setRotationPoint(42F, -61F, -48F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 28, 58, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[109].setRotationPoint(127F, -69F, 16F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 35, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[110].setRotationPoint(155F, -68F, 17F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 33, 58, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[111].setRotationPoint(94F, -69F, 16F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 79, 58, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, 0F); // Box 187
		bodyModel[112].setRotationPoint(15F, -69F, 16F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 9, 10, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 188
		bodyModel[113].setRotationPoint(6F, -52F, 16F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 28, 58, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[114].setRotationPoint(127F, -69F, -44F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 35, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[115].setRotationPoint(155F, -68F, -43F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 33, 58, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[116].setRotationPoint(94F, -69F, -44F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 79, 58, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -31F, 0F); // Box 192
		bodyModel[117].setRotationPoint(15F, -69F, -44F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 9, 10, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 193
		bodyModel[118].setRotationPoint(6F, -52F, -44F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 65, 27, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[119].setRotationPoint(24F, -126F, -44F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 12, 27, 39, 0F,0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[120].setRotationPoint(12F, -126F, -44F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 34, 27, 39, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[121].setRotationPoint(89F, -126F, -44F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 71, 19, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[122].setRotationPoint(123F, -118F, -44F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 166, 19, 37, 0F,0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[123].setRotationPoint(16F, -99F, -43F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 166, 4, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[124].setRotationPoint(16F, -80F, -43F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 65, 27, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[125].setRotationPoint(24F, -126F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 12, 27, 39, 0F,0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[126].setRotationPoint(12F, -126F, 5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 34, 27, 39, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[127].setRotationPoint(89F, -126F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 71, 19, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[128].setRotationPoint(123F, -118F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 166, 19, 37, 0F,0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[129].setRotationPoint(16F, -99F, 6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 166, 4, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 205
		bodyModel[130].setRotationPoint(16F, -80F, 6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 62, 54, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[131].setRotationPoint(16F, -118F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 47, 55, 60, 0F,0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[132].setRotationPoint(78F, -118F, -30F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 22, 47, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[133].setRotationPoint(145F, -108F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 20, 47, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[134].setRotationPoint(125F, -108F, -30F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 8, 54, 10, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[135].setRotationPoint(8F, -118F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[136].setRotationPoint(4F, -110F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[137].setRotationPoint(-5F, -110F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 213
		bodyModel[138].setRotationPoint(-10F, -110F, -5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 8, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 214
		bodyModel[139].setRotationPoint(-10F, -106.5F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[140].setRotationPoint(-5F, -106.5F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 216
		bodyModel[141].setRotationPoint(-9.5F, -108F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[142].setRotationPoint(-4.5F, -108F, -4.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 62
		noseModel[1] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 63
		noseModel[2] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 64
		noseModel[3] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 65
		noseModel[4] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Box 66
		noseModel[5] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 67
		noseModel[6] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 68
		noseModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 69
		noseModel[8] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 70
		noseModel[9] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 71
		noseModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 72
		noseModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 73
		noseModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 74
		noseModel[13] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 75
		noseModel[14] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 76
		noseModel[15] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 77
		noseModel[16] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 78
		noseModel[17] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Box 79
		noseModel[18] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Box 80
		noseModel[19] = new ModelRendererTurbo(this, 1041, 161, textureX, textureY); // Box 82
		noseModel[20] = new ModelRendererTurbo(this, 1425, 161, textureX, textureY); // Box 83
		noseModel[21] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 84
		noseModel[22] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 85
		noseModel[23] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Box 86
		noseModel[24] = new ModelRendererTurbo(this, 1657, 1, textureX, textureY); // Box 87
		noseModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 88
		noseModel[26] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 89
		noseModel[27] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 91
		noseModel[28] = new ModelRendererTurbo(this, 1945, 113, textureX, textureY); // Box 92
		noseModel[29] = new ModelRendererTurbo(this, 1513, 9, textureX, textureY); // Box 93
		noseModel[30] = new ModelRendererTurbo(this, 1705, 41, textureX, textureY); // Box 94
		noseModel[31] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 95
		noseModel[32] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 96
		noseModel[33] = new ModelRendererTurbo(this, 2017, 49, textureX, textureY); // Box 97
		noseModel[34] = new ModelRendererTurbo(this, 1497, 57, textureX, textureY); // Box 98
		noseModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 99
		noseModel[36] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 100
		noseModel[37] = new ModelRendererTurbo(this, 1577, 1, textureX, textureY); // Box 102
		noseModel[38] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 103
		noseModel[39] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Box 104
		noseModel[40] = new ModelRendererTurbo(this, 1969, 1, textureX, textureY); // Box 105
		noseModel[41] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 106
		noseModel[42] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 107
		noseModel[43] = new ModelRendererTurbo(this, 1545, 9, textureX, textureY); // Box 108
		noseModel[44] = new ModelRendererTurbo(this, 1617, 9, textureX, textureY); // Box 109
		noseModel[45] = new ModelRendererTurbo(this, 1641, 9, textureX, textureY); // Box 110
		noseModel[46] = new ModelRendererTurbo(this, 1977, 9, textureX, textureY); // Box 111
		noseModel[47] = new ModelRendererTurbo(this, 2001, 9, textureX, textureY); // Box 112
		noseModel[48] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 113
		noseModel[49] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 114
		noseModel[50] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 115
		noseModel[51] = new ModelRendererTurbo(this, 1209, 17, textureX, textureY); // Box 116
		noseModel[52] = new ModelRendererTurbo(this, 1225, 17, textureX, textureY); // Box 117
		noseModel[53] = new ModelRendererTurbo(this, 1241, 17, textureX, textureY); // Box 118
		noseModel[54] = new ModelRendererTurbo(this, 1257, 17, textureX, textureY); // Box 119
		noseModel[55] = new ModelRendererTurbo(this, 1585, 17, textureX, textureY); // Box 120
		noseModel[56] = new ModelRendererTurbo(this, 1977, 17, textureX, textureY); // Box 121
		noseModel[57] = new ModelRendererTurbo(this, 1993, 17, textureX, textureY); // Box 122
		noseModel[58] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 123
		noseModel[59] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 124
		noseModel[60] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 125
		noseModel[61] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 126
		noseModel[62] = new ModelRendererTurbo(this, 1209, 25, textureX, textureY); // Box 127
		noseModel[63] = new ModelRendererTurbo(this, 1233, 25, textureX, textureY); // Box 128
		noseModel[64] = new ModelRendererTurbo(this, 1881, 25, textureX, textureY); // Box 129
		noseModel[65] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 130
		noseModel[66] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 132
		noseModel[67] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 133
		noseModel[68] = new ModelRendererTurbo(this, 1473, 25, textureX, textureY); // Box 134
		noseModel[69] = new ModelRendererTurbo(this, 1737, 449, textureX, textureY); // Box 218
		noseModel[70] = new ModelRendererTurbo(this, 961, 489, textureX, textureY); // Box 219

		noseModel[0].addShapeBox(0F, -13F, 0F, 155, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 62
		noseModel[0].setRotationPoint(-355.5F, -86F, -4.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 10, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		noseModel[1].setRotationPoint(-357.5F, -93F, -4.5F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 10, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 64
		noseModel[2].setRotationPoint(-357.5F, -82F, -4.5F);

		noseModel[3].addShapeBox(0F, -13F, 0F, 145, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		noseModel[3].setRotationPoint(-345.5F, -45F, -6F);

		noseModel[4].addShapeBox(0F, -13F, 0F, 7, 14, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 66
		noseModel[4].setRotationPoint(-352.5F, -53F, -6F);

		noseModel[5].addShapeBox(0F, -13F, 0F, 4, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 67
		noseModel[5].setRotationPoint(-356.5F, -48F, -6F);

		noseModel[6].addShapeBox(0F, -13F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		noseModel[6].setRotationPoint(-356.5F, -53F, -6F);

		noseModel[7].addShapeBox(0F, -13F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		noseModel[7].setRotationPoint(-356.5F, -51F, -1F);

		noseModel[8].addShapeBox(0F, -13F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		noseModel[8].setRotationPoint(-356.5F, -51F, 4F);

		noseModel[9].addShapeBox(0F, -13F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		noseModel[9].setRotationPoint(-356.5F, -51F, -6F);

		noseModel[10].addShapeBox(0F, -13F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		noseModel[10].setRotationPoint(-356.5F, -49F, 3F);

		noseModel[11].addShapeBox(0F, -13F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		noseModel[11].setRotationPoint(-356.5F, -49F, -4F);

		noseModel[12].addShapeBox(0F, -13F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		noseModel[12].setRotationPoint(-356.5F, -49F, -2F);

		noseModel[13].addShapeBox(0F, -13F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		noseModel[13].setRotationPoint(-356.5F, -49F, 1F);

		noseModel[14].addShapeBox(0F, -13F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 76
		noseModel[14].setRotationPoint(-356.5F, -51F, 1F);

		noseModel[15].addShapeBox(0F, -13F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		noseModel[15].setRotationPoint(-356.5F, -51F, -2F);

		noseModel[16].addShapeBox(0F, -13F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		noseModel[16].setRotationPoint(-356.5F, -51F, 3F);

		noseModel[17].addShapeBox(0F, -13F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		noseModel[17].setRotationPoint(-356.5F, -51F, -4F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 185, 39, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		noseModel[18].setRotationPoint(-345.5F, -94F, -13F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 185, 39, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 82
		noseModel[19].setRotationPoint(-345.5F, -94F, 9F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 185, 39, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		noseModel[20].setRotationPoint(-345.5F, -94F, -9F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 185, 39, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		noseModel[21].setRotationPoint(-345.5F, -94F, 3F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 5, 39, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85
		noseModel[22].setRotationPoint(-350.5F, -94F, 3F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		noseModel[23].setRotationPoint(-352.5F, -92F, 3F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 87
		noseModel[24].setRotationPoint(-352.5F, -72F, 3F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		noseModel[25].setRotationPoint(-352.5F, -77F, 3F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		noseModel[26].setRotationPoint(-352.5F, -82F, 3F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 7, 25, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 91
		noseModel[27].setRotationPoint(-352.5F, -87F, 10F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 5, 39, 7, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92
		noseModel[28].setRotationPoint(-350.5F, -94F, -10F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F,0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		noseModel[29].setRotationPoint(-352.5F, -92F, -10F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 94
		noseModel[30].setRotationPoint(-352.5F, -72F, -10F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		noseModel[31].setRotationPoint(-352.5F, -77F, -9F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		noseModel[32].setRotationPoint(-352.5F, -82F, -9F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 7, 25, 3, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		noseModel[33].setRotationPoint(-352.5F, -87F, -13F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 2, 21, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 98
		noseModel[34].setRotationPoint(-352.5F, -85F, -6F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 99
		noseModel[35].setRotationPoint(-352.5F, -85F, -10F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 2, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 100
		noseModel[36].setRotationPoint(-352.5F, -85F, 9F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 102
		noseModel[37].setRotationPoint(-352.5F, -75F, 6F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		noseModel[38].setRotationPoint(-352.5F, -73F, 6F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		noseModel[39].setRotationPoint(-352.5F, -73F, 8F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		noseModel[40].setRotationPoint(-352.5F, -75F, 8F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		noseModel[41].setRotationPoint(-352.5F, -75F, -7F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		noseModel[42].setRotationPoint(-352.5F, -73F, -7F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		noseModel[43].setRotationPoint(-352.5F, -73F, -9F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 109
		noseModel[44].setRotationPoint(-352.5F, -75F, -9F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		noseModel[45].setRotationPoint(-352.5F, -80F, -7F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		noseModel[46].setRotationPoint(-352.5F, -78F, -7F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		noseModel[47].setRotationPoint(-352.5F, -78F, -9F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 113
		noseModel[48].setRotationPoint(-352.5F, -80F, -9F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 114
		noseModel[49].setRotationPoint(-352.5F, -80F, 6F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		noseModel[50].setRotationPoint(-352.5F, -78F, 6F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		noseModel[51].setRotationPoint(-352.5F, -78F, 8F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		noseModel[52].setRotationPoint(-352.5F, -80F, 8F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 118
		noseModel[53].setRotationPoint(-352.5F, -85F, 6F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		noseModel[54].setRotationPoint(-352.5F, -83F, 6F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		noseModel[55].setRotationPoint(-352.5F, -83F, 8F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		noseModel[56].setRotationPoint(-352.5F, -85F, 8F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		noseModel[57].setRotationPoint(-352.5F, -85F, -7F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		noseModel[58].setRotationPoint(-352.5F, -83F, -7F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		noseModel[59].setRotationPoint(-352.5F, -83F, -9F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 125
		noseModel[60].setRotationPoint(-352.5F, -85F, -9F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 126
		noseModel[61].setRotationPoint(-352.5F, -91F, 10F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,-2F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -0.3F, -4F, -1.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 0.5F); // Box 127
		noseModel[62].setRotationPoint(-352.5F, -94F, 9F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,-4F, -1.5F, -1.5F, 0F, -2F, -0.3F, 0F, 0F, 0F, -2F, -1F, 0F, -5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 128
		noseModel[63].setRotationPoint(-352.5F, -94F, -12F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,-5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		noseModel[64].setRotationPoint(-352.5F, -91F, -13F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		noseModel[65].setRotationPoint(-352.5F, -62F, -13F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,-4.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -3.5F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, -2F, -1F, -1F); // Box 132
		noseModel[66].setRotationPoint(-352.5F, -60F, -12F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 7, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -4.5F, 0F, 0.5F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 1F, -5F, -3.5F, 0F); // Box 133
		noseModel[67].setRotationPoint(-352.5F, -60F, 9F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -0.5F); // Box 134
		noseModel[68].setRotationPoint(-352.5F, -62F, 10F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 90, 90, 1, 0F,-30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F); // Box 218
		noseModel[69].setRotationPoint(-224.5F, -120F, -13.5F);

		noseModel[70].addShapeBox(0F, 0F, 0F, 90, 90, 1, 0F,-30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F, -30F, -30F, 0F); // Box 219
		noseModel[70].setRotationPoint(-224.5F, -120F, 12.5F);
	}
}