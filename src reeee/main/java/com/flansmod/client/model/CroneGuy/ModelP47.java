//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.CroneGuy;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelP47 extends ModelPlane
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelP47()
	{
		bodyModel = new ModelRendererTurbo[111];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 50
		bodyModel[41] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 54
		bodyModel[42] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 1
		bodyModel[54] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 9
		bodyModel[56] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 10
		bodyModel[57] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 11
		bodyModel[58] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 12
		bodyModel[59] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 1
		bodyModel[61] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 2
		bodyModel[62] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 3
		bodyModel[63] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 4
		bodyModel[64] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 5
		bodyModel[65] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 7
		bodyModel[66] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box 8
		bodyModel[67] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 11
		bodyModel[68] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 12
		bodyModel[69] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 13
		bodyModel[70] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 14
		bodyModel[71] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 15
		bodyModel[72] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 16
		bodyModel[73] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Box 17
		bodyModel[74] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 18
		bodyModel[75] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 19
		bodyModel[76] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 20
		bodyModel[77] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 21
		bodyModel[78] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 36
		bodyModel[79] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 57
		bodyModel[80] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 109
		bodyModel[81] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 110
		bodyModel[82] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 171
		bodyModel[83] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 172
		bodyModel[84] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 173
		bodyModel[85] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 175
		bodyModel[86] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 176
		bodyModel[87] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 177
		bodyModel[88] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 179
		bodyModel[89] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 180
		bodyModel[90] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 181
		bodyModel[91] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 182
		bodyModel[92] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 183
		bodyModel[93] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 188
		bodyModel[94] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 189
		bodyModel[95] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 190
		bodyModel[96] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 191
		bodyModel[97] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 219
		bodyModel[98] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 220
		bodyModel[99] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 221
		bodyModel[100] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 222
		bodyModel[101] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 223
		bodyModel[102] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 224
		bodyModel[103] = new ModelRendererTurbo(this, 215, 327, textureX, textureY); // Box 14
		bodyModel[104] = new ModelRendererTurbo(this, 177, 336, textureX, textureY); // Box 15
		bodyModel[105] = new ModelRendererTurbo(this, 35, 219, textureX, textureY); // Box 17
		bodyModel[106] = new ModelRendererTurbo(this, 7, 491, textureX, textureY); // Box 18
		bodyModel[107] = new ModelRendererTurbo(this, 254, 378, textureX, textureY); // Box 19
		bodyModel[108] = new ModelRendererTurbo(this, 254, 378, textureX, textureY); // Box 20
		bodyModel[109] = new ModelRendererTurbo(this, 10, 736, textureX, textureY); // Box 22
		bodyModel[110] = new ModelRendererTurbo(this, 2, 816, textureX, textureY); // Box 24

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 14, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-39F, -41F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 20, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-39F, -37F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 5, 24, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-39F, -33F, -12F);

		bodyModel[3].addBox(0F, 0F, 0F, 9, 5, 24, 0F); // Box 4
		bodyModel[3].setRotationPoint(-39F, -28F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 5
		bodyModel[4].setRotationPoint(-39F, -23F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 6
		bodyModel[5].setRotationPoint(-39F, -14F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 7
		bodyModel[6].setRotationPoint(-39F, -9F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, -6F); // Box 8
		bodyModel[7].setRotationPoint(-48F, -9F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 9
		bodyModel[8].setRotationPoint(-48F, -14F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 10
		bodyModel[9].setRotationPoint(-48F, -23F, -12F);

		bodyModel[10].addBox(0F, 0F, 0F, 9, 5, 24, 0F); // Box 11
		bodyModel[10].setRotationPoint(-48F, -28F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 5, 24, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-48F, -33F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 4, 20, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-48F, -37F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 4, 14, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-48F, -41F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 17, 5, 20, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -5F); // Box 16
		bodyModel[14].setRotationPoint(-65F, -14F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 17, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F); // Box 17
		bodyModel[15].setRotationPoint(-65F, -23F, -12F);

		bodyModel[16].addBox(0F, 0F, 0F, 17, 5, 24, 0F); // Box 18
		bodyModel[16].setRotationPoint(-65F, -28F, -12F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 17, 5, 24, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-65F, -33F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 17, 4, 20, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-65F, -37F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 17, 3, 14, 0F, 0F, -2F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 21
		bodyModel[19].setRotationPoint(-65F, -40F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 1, 12, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, -6F); // Box 22
		bodyModel[20].setRotationPoint(-65F, -9F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 5, 24, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 23
		bodyModel[21].setRotationPoint(-76F, -28F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 5, 24, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 24
		bodyModel[22].setRotationPoint(-76F, -33F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 4, 20, 0F, 0F, -1F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 25
		bodyModel[23].setRotationPoint(-76F, -37F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 2, 12, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F); // Box 26
		bodyModel[24].setRotationPoint(-76F, -38F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 7, 24, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -4F); // Box 28
		bodyModel[25].setRotationPoint(-76F, -23F, -12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 5, 20, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, -7F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, -7F); // Box 29
		bodyModel[26].setRotationPoint(-76F, -16F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 1, 10, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -3F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, -5F); // Box 30
		bodyModel[27].setRotationPoint(-76F, -11F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 20, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -4F); // Box 31
		bodyModel[28].setRotationPoint(-78F, -23F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 5, 20, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 32
		bodyModel[29].setRotationPoint(-78F, -28F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 20, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 33
		bodyModel[30].setRotationPoint(-78F, -33F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F, 0F, -1F, -7F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 34
		bodyModel[31].setRotationPoint(-78F, -36F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 4, 16, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -7F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, -7F); // Box 35
		bodyModel[32].setRotationPoint(-78F, -18F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F); // Box 36
		bodyModel[33].setRotationPoint(-78F, -14F, -3F);

		bodyModel[34].addBox(0F, 0F, 0F, 15, 5, 24, 0F); // Box 42
		bodyModel[34].setRotationPoint(6F, -28F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 5, 24, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[35].setRotationPoint(6F, -33F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 15, 6, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -2F); // Box 44
		bodyModel[36].setRotationPoint(6F, -23F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 15, 5, 20, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0F, -10F); // Box 45
		bodyModel[37].setRotationPoint(6F, -17F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 15, 6, 20, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[38].setRotationPoint(6F, -39F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 15, 2, 8, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(6F, -41F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 5, 24, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 50
		bodyModel[40].setRotationPoint(21F, -28F, -12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 21, 5, 24, 0F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 54
		bodyModel[41].setRotationPoint(21F, -33F, -12F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 21, 7, 20, 0F, 0F, 0F, -6F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F); // Box 55
		bodyModel[42].setRotationPoint(21F, -39F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 21, 2, 8, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 56
		bodyModel[43].setRotationPoint(21F, -40F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 21, 5, 24, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 57
		bodyModel[44].setRotationPoint(21F, -23F, -12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 21, 3, 16, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, -8F); // Box 58
		bodyModel[45].setRotationPoint(21F, -18F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 17, 2, 18, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 59
		bodyModel[46].setRotationPoint(42F, -28F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 17, 5, 18, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -3F); // Box 60
		bodyModel[47].setRotationPoint(42F, -26F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 17, 3, 12, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F); // Box 61
		bodyModel[48].setRotationPoint(42F, -21F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 17, 4, 18, 0F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 62
		bodyModel[49].setRotationPoint(42F, -32F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 17, 7, 14, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 63
		bodyModel[50].setRotationPoint(42F, -38F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 17, 2, 8, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F); // Box 64
		bodyModel[51].setRotationPoint(42F, -39F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 36, 9, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[52].setRotationPoint(-30F, -23F, -12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 36, 5, 20, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0F, -4F); // Box 1
		bodyModel[53].setRotationPoint(-30F, -14F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 36, 2, 12, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5F, -6F, 0F, -5F, -6F, 0F, 0F, -6F); // Box 2
		bodyModel[54].setRotationPoint(-30F, -9F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 9
		bodyModel[55].setRotationPoint(-30F, -41F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 10
		bodyModel[56].setRotationPoint(-30F, -37F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 11
		bodyModel[57].setRotationPoint(-30F, -38F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 36, 5, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[58].setRotationPoint(-30F, -33F, -12F);

		bodyModel[59].addBox(0F, 0F, 0F, 36, 5, 1, 0F); // Box 0
		bodyModel[59].setRotationPoint(-30F, -28F, -12F);

		bodyModel[60].addBox(0F, 0F, 0F, 36, 5, 1, 0F); // Box 1
		bodyModel[60].setRotationPoint(-30F, -28F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[61].setRotationPoint(-30F, -41F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[62].setRotationPoint(-30F, -37F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[63].setRotationPoint(-30F, -38F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 36, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[64].setRotationPoint(-30F, -33F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[65].setRotationPoint(-8F, -37F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 8
		bodyModel[66].setRotationPoint(-8F, -37F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -1.9F); // Box 11
		bodyModel[67].setRotationPoint(-8F, -38F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 12
		bodyModel[68].setRotationPoint(-1F, -39F, -5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 13
		bodyModel[69].setRotationPoint(-1F, -38F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -1.9F); // Box 14
		bodyModel[70].setRotationPoint(-8F, -39F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[71].setRotationPoint(-1F, -39F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1.9F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 16
		bodyModel[72].setRotationPoint(-8F, -39F, 4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[73].setRotationPoint(-8F, -37F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1.9F, 0F, 0F, -0.9F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 18
		bodyModel[74].setRotationPoint(-8F, -38F, 5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[75].setRotationPoint(-1F, -38F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 20
		bodyModel[76].setRotationPoint(-1F, -41F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[77].setRotationPoint(-1F, -41F, 1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, 0F); // Box 36
		bodyModel[78].setRotationPoint(-7F, -20F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[79].setRotationPoint(-7F, -20F, -16F);

		bodyModel[80].addBox(0F, -9F, 0F, 1, 9, 1, 0F); // Box 109
		bodyModel[80].setRotationPoint(-22F, -38F, -6F);
		bodyModel[80].rotateAngleX = -0.27925268F;

		bodyModel[81].addBox(0F, -9F, -1F, 1, 9, 1, 0F); // Box 110
		bodyModel[81].setRotationPoint(-22F, -38F, 6F);
		bodyModel[81].rotateAngleX = 0.27925268F;

		bodyModel[82].addBox(0F, -13F, 0F, 1, 13, 1, 0F); // Box 171
		bodyModel[82].setRotationPoint(-32F, -39F, -4F);
		bodyModel[82].rotateAngleX = -0.03490659F;
		bodyModel[82].rotateAngleZ = -0.90757121F;

		bodyModel[83].addBox(0F, -13F, -1F, 1, 13, 1, 0F); // Box 172
		bodyModel[83].setRotationPoint(-32F, -39F, 4F);
		bodyModel[83].rotateAngleX = 0.03490659F;
		bodyModel[83].rotateAngleZ = -0.90757121F;

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 173
		bodyModel[84].setRotationPoint(-22F, -47F, -3.5F);

		bodyModel[85].addBox(0F, -2F, 0F, 13, 2, 1, 0F); // Box 175
		bodyModel[85].setRotationPoint(-21F, -38F, -6F);
		bodyModel[85].rotateAngleX = -0.27925268F;

		bodyModel[86].addBox(0F, -2F, -1F, 13, 2, 1, 0F); // Box 176
		bodyModel[86].setRotationPoint(-21F, -38F, 6F);
		bodyModel[86].rotateAngleX = 0.27925268F;

		bodyModel[87].addBox(0F, -2F, 0F, 7, 2, 1, 0F); // Box 177
		bodyModel[87].setRotationPoint(-8F, -38F, -6F);
		bodyModel[87].rotateAngleX = -0.27925268F;
		bodyModel[87].rotateAngleY = 0.2443461F;
		bodyModel[87].rotateAngleZ = 0.03490659F;

		bodyModel[88].addBox(-0.1F, -2F, 0F, 8, 2, 1, 0F); // Box 179
		bodyModel[88].setRotationPoint(-1F, -38.3F, -4.3F);
		bodyModel[88].rotateAngleX = -0.27925268F;
		bodyModel[88].rotateAngleY = 0.34906585F;
		bodyModel[88].rotateAngleZ = 0.10471976F;

		bodyModel[89].addBox(-0.1F, -2F, -1F, 8, 2, 1, 0F); // Box 180
		bodyModel[89].setRotationPoint(-1F, -38.3F, 4.3F);
		bodyModel[89].rotateAngleX = 0.27925268F;
		bodyModel[89].rotateAngleY = -0.34906585F;
		bodyModel[89].rotateAngleZ = 0.10471976F;

		bodyModel[90].addBox(0F, -2F, -1F, 7, 2, 1, 0F); // Box 181
		bodyModel[90].setRotationPoint(-8F, -38F, 6F);
		bodyModel[90].rotateAngleX = 0.27925268F;
		bodyModel[90].rotateAngleY = -0.2443461F;
		bodyModel[90].rotateAngleZ = 0.03490659F;

		bodyModel[91].addBox(0F, 0F, 0F, 7, 2, 2, 0F); // Box 182
		bodyModel[91].setRotationPoint(-85F, -28F, -1F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 6, 6, 0F); // Box 183
		bodyModel[92].setRotationPoint(-80F, -30F, -3F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 1, 7, 0F); // Box 188
		bodyModel[93].setRotationPoint(-21F, -47F, -3.5F);
		bodyModel[93].rotateAngleZ = 0.2443461F;

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 7, 0F); // Box 189
		bodyModel[94].setRotationPoint(-17F, -48F, -3.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 8, 1, 7, 0F); // Box 190
		bodyModel[95].setRotationPoint(-15F, -48F, -3.5F);
		bodyModel[95].rotateAngleZ = -0.17453293F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 191
		bodyModel[96].setRotationPoint(-7.2F, -46.7F, -3.5F);
		bodyModel[96].rotateAngleZ = -0.40142573F;

		bodyModel[97].addBox(0F, 0F, 0F, 9, 7, 10, 0F); // Box 219
		bodyModel[97].setRotationPoint(-17F, -30F, -5F);

		bodyModel[98].addBox(0F, 0F, 0F, 36, 1, 22, 0F); // Box 220
		bodyModel[98].setRotationPoint(-30F, -25F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 16, 8, 0F); // Box 221
		bodyModel[99].setRotationPoint(-9F, -40F, -4F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 7, 6, 0F); // Box 222
		bodyModel[100].setRotationPoint(-8F, -44F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 223
		bodyModel[101].setRotationPoint(-24F, -27F, -1.5F);

		bodyModel[102].addBox(0F, -8F, 0F, 1, 7, 1, 0F); // Box 224
		bodyModel[102].setRotationPoint(-23F, -26F, -0.5F);
		bodyModel[102].rotateAngleZ = -0.17453293F;

		bodyModel[103].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 14
		bodyModel[103].setRotationPoint(-30F, -41F, -2F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 15
		bodyModel[104].setRotationPoint(-30F, -40F, -2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 200, 200, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -197F, 0F, 0F, -197F, 0F, -197F, 0F, 0F, -197F, 0F, 0F, -197F, -197F, 0F, -197F, -197F); // Box 17
		bodyModel[105].setRotationPoint(-29F, -44F, -1.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 68, 150, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -136F, 0F, 0F, -136F, 0F, -59F, 0F, 0F, -59F, 0F, 0F, -59F, -136F, 0F, -59F, -136F); // Box 18
		bodyModel[106].setRotationPoint(-29.9F, -37F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 72, 17, 1, 0F, 0F, 0F, 0F, -58F, 0F, 0F, -58F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -58F, -14F, 0F, -58F, -14F, 0F, 0F, -14F, 0F); // Box 19
		bodyModel[107].setRotationPoint(63F, -44F, -0.6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 72, 17, 1, 0F, 0F, 0F, 0F, -58F, 0F, 0F, -58F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -58F, -14F, 0F, -58F, -14F, 0F, 0F, -14F, 0F); // Box 20
		bodyModel[108].setRotationPoint(77F, -44F, 0.6F);
		bodyModel[108].rotateAngleY = 3.14159265F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 300, 65, 1, 0F, 0F, 0F, 0F, -280F, 0F, 0F, -280F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, -280F, -60F, 0F, -280F, -60F, 0F, 0F, -60F, 0F); // Box 22
		bodyModel[109].setRotationPoint(-25F, -37F, -7.1F);
		bodyModel[109].rotateAngleX = -0.62831853F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 300, 74, 1, 0F, 0F, 0F, 0F, -280F, 0F, 0F, -280F, 0F, 0F, 0F, 0F, 0F, 0F, -69F, 0F, -280F, -69F, 0F, -280F, -69F, 0F, 0F, -69F, 0F); // Box 24
		bodyModel[110].setRotationPoint(-25F, -33F, -10.1F);
		bodyModel[110].rotateAngleX = -0.36651914F;


		tailModel = new ModelRendererTurbo[48];
		tailModel[0] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 65
		tailModel[1] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 66
		tailModel[2] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Box 67
		tailModel[3] = new ModelRendererTurbo(this, 745, 81, textureX, textureY); // Box 68
		tailModel[4] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 69
		tailModel[5] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 70
		tailModel[6] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 67
		tailModel[7] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 68
		tailModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 69
		tailModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 70
		tailModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 71
		tailModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 72
		tailModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 73
		tailModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 74
		tailModel[14] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 75
		tailModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 76
		tailModel[16] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 77
		tailModel[17] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 78
		tailModel[18] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 79
		tailModel[19] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 80
		tailModel[20] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 81
		tailModel[21] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 82
		tailModel[22] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 83
		tailModel[23] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 84
		tailModel[24] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 85
		tailModel[25] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 86
		tailModel[26] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 87
		tailModel[27] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 88
		tailModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 89
		tailModel[29] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 90
		tailModel[30] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 91
		tailModel[31] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 92
		tailModel[32] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 93
		tailModel[33] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 94
		tailModel[34] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 95
		tailModel[35] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 96
		tailModel[36] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 97
		tailModel[37] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 98
		tailModel[38] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 99
		tailModel[39] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 100
		tailModel[40] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 101
		tailModel[41] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 102
		tailModel[42] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 103
		tailModel[43] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 104
		tailModel[44] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 105
		tailModel[45] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 106
		tailModel[46] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 107
		tailModel[47] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 108

		tailModel[0].addShapeBox(0F, 0F, 0F, 24, 3, 8, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, -4F); // Box 65
		tailModel[0].setRotationPoint(59F, -24F, -4F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 24, 3, 12, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -2F); // Box 66
		tailModel[1].setRotationPoint(59F, -27F, -6F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 24, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 67
		tailModel[2].setRotationPoint(59F, -28F, -6F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 24, 3, 12, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 68
		tailModel[3].setRotationPoint(59F, -31F, -6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 24, 6, 10, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F); // Box 69
		tailModel[4].setRotationPoint(59F, -36F, -5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 24, 3, 6, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 0F); // Box 70
		tailModel[5].setRotationPoint(59F, -38F, -3F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 16, 23, 1, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 67
		tailModel[6].setRotationPoint(57F, -59F, -0.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 17, 23, 1, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		tailModel[7].setRotationPoint(66F, -59F, -0.5F);

		tailModel[8].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 69
		tailModel[8].setRotationPoint(73F, -64F, -0.5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		tailModel[9].setRotationPoint(73F, -65F, -0.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[10].setRotationPoint(78F, -64F, -0.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		tailModel[11].setRotationPoint(81F, -62F, -0.5F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		tailModel[12].setRotationPoint(70F, -64F, -0.5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		tailModel[13].setRotationPoint(83F, -59F, -0.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		tailModel[14].setRotationPoint(83F, -54F, -0.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		tailModel[15].setRotationPoint(83F, -49F, -0.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		tailModel[16].setRotationPoint(83F, -43F, -0.5F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 78
		tailModel[17].setRotationPoint(83F, -35F, -0.5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 79
		tailModel[18].setRotationPoint(83F, -31F, -0.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 80
		tailModel[19].setRotationPoint(83F, -28F, -0.5F);

		tailModel[20].addBox(0F, 0F, 0F, 13, 1, 31, 0F); // Box 81
		tailModel[20].setRotationPoint(70F, -35F, 5F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 82
		tailModel[21].setRotationPoint(83F, -35F, 29F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 83
		tailModel[22].setRotationPoint(83F, -35F, 19F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		tailModel[23].setRotationPoint(83F, -35F, 10F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		tailModel[24].setRotationPoint(83F, -35F, 7F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		tailModel[25].setRotationPoint(83F, -35F, 5F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		tailModel[26].setRotationPoint(76F, -35F, 1F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 88
		tailModel[27].setRotationPoint(61F, -35F, 2F);

		tailModel[28].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 89
		tailModel[28].setRotationPoint(70F, -35F, 1F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 90
		tailModel[29].setRotationPoint(70F, -35F, 36F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 91
		tailModel[30].setRotationPoint(73F, -35F, 36F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 92
		tailModel[31].setRotationPoint(75F, -35F, 36F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 93
		tailModel[32].setRotationPoint(78F, -35F, 36F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 94
		tailModel[33].setRotationPoint(80F, -35F, 36F);

		tailModel[34].addBox(0F, 0F, 0F, 13, 1, 31, 0F); // Box 95
		tailModel[34].setRotationPoint(70F, -35F, -36F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		tailModel[35].setRotationPoint(83F, -35F, -36F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		tailModel[36].setRotationPoint(83F, -35F, -29F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		tailModel[37].setRotationPoint(83F, -35F, -19F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 99
		tailModel[38].setRotationPoint(83F, -35F, -10F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 100
		tailModel[39].setRotationPoint(83F, -35F, -7F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 101
		tailModel[40].setRotationPoint(76F, -35F, -5F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 9, 1, 34, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		tailModel[41].setRotationPoint(61F, -35F, -36F);

		tailModel[42].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 103
		tailModel[42].setRotationPoint(70F, -35F, -5F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		tailModel[43].setRotationPoint(70F, -35F, -41F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		tailModel[44].setRotationPoint(73F, -35F, -42F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		tailModel[45].setRotationPoint(75F, -35F, -42F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		tailModel[46].setRotationPoint(78F, -35F, -41F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		tailModel[47].setRotationPoint(80F, -35F, -40F);


		leftWingModel = new ModelRendererTurbo[23];
		leftWingModel[0] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 45
		leftWingModel[1] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 46
		leftWingModel[2] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Box 47
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 48
		leftWingModel[4] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 49
		leftWingModel[5] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 50
		leftWingModel[6] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 51
		leftWingModel[7] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 52
		leftWingModel[8] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 53
		leftWingModel[9] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Box 54
		leftWingModel[10] = new ModelRendererTurbo(this, 769, 193, textureX, textureY); // Box 55
		leftWingModel[11] = new ModelRendererTurbo(this, 894, 199, textureX, textureY); // Box 56
		leftWingModel[12] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 58
		leftWingModel[13] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 59
		leftWingModel[14] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 60
		leftWingModel[15] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 61
		leftWingModel[16] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 62
		leftWingModel[17] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 63
		leftWingModel[18] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 64
		leftWingModel[19] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 66
		leftWingModel[20] = new ModelRendererTurbo(this, 859, 218, textureX, textureY); // Box 2
		leftWingModel[21] = new ModelRendererTurbo(this, 793, 200, textureX, textureY); // Box 3
		leftWingModel[22] = new ModelRendererTurbo(this, 790, 224, textureX, textureY); // Box 4

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 5, 9, 80, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftWingModel[0].setRotationPoint(-34F, -23F, -90F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 8, 9, 80, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftWingModel[1].setRotationPoint(-42F, -23F, -90F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 6, 7, 80, 0F, -4F, 6F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -13F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 47
		leftWingModel[2].setRotationPoint(-48F, -21F, -90F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 11, 9, 80, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -14F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 48
		leftWingModel[3].setRotationPoint(-29F, -23F, -90F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[4].setRotationPoint(-34F, -29F, -102F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftWingModel[5].setRotationPoint(-39F, -29F, -102F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftWingModel[6].setRotationPoint(-42F, -29F, -101F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 52
		leftWingModel[7].setRotationPoint(-44F, -29F, -98F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F, 0F, 0F, -0.5F, 0F, 0F, -5F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -5F, 0F, -1.1F, 0F, 0F, 0F, 0F); // Box 53
		leftWingModel[8].setRotationPoint(-29F, -29F, -102F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -0.55F, 0F, 0F, -3F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1.1F, 0F); // Box 54
		leftWingModel[9].setRotationPoint(-23F, -29F, -97F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 5, 9, 70, 0F, 0F, 4.25F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -12.4F, 0F, 0F, -12F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Box 55
		leftWingModel[10].setRotationPoint(-18F, -23F, -80F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 6, 9, 45, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -8.3F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F); // Box 56
		leftWingModel[11].setRotationPoint(-13F, -23F, -55F);

		leftWingModel[12].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 58
		leftWingModel[12].setRotationPoint(-53F, -22F, -45F);

		leftWingModel[13].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 59
		leftWingModel[13].setRotationPoint(-51F, -22.5F, -49F);

		leftWingModel[14].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 60
		leftWingModel[14].setRotationPoint(-49F, -23F, -53F);

		leftWingModel[15].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 61
		leftWingModel[15].setRotationPoint(-47F, -23.5F, -56.5F);

		leftWingModel[16].addBox(0F, 0F, 0F, 14, 8, 1, 0F); // Box 62
		leftWingModel[16].setRotationPoint(-39F, -23F, -57.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 63
		leftWingModel[17].setRotationPoint(-25F, -23F, -57.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 64
		leftWingModel[18].setRotationPoint(-42F, -23F, -57.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftWingModel[19].setRotationPoint(-35F, -29F, -102F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, 0F, -2F, 0F, 0F, -2.4F, 0F); // Box 2
		leftWingModel[20].setRotationPoint(-18F, -28F, -90F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F, 0F, 0F, 0F, -2F, -0.9F, 0F, 0F, -1.9F, 0F, 0F, -0.7F, 0F, 0F, -1.7F, 0F, -2F, -2.1F, 0F, 0F, -1.1F, 0F, 0F, -0.4F, 0F); // Box 3
		leftWingModel[21].setRotationPoint(-13F, -24.9F, -64F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, -1.1F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F); // Box 4
		leftWingModel[22].setRotationPoint(-13F, -26F, -80F);


		rightWingModel = new ModelRendererTurbo[24];
		rightWingModel[0] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 22
		rightWingModel[1] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 23
		rightWingModel[2] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 24
		rightWingModel[3] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 25
		rightWingModel[4] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 26
		rightWingModel[5] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 27
		rightWingModel[6] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 28
		rightWingModel[7] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 29
		rightWingModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		rightWingModel[9] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 31
		rightWingModel[10] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 33
		rightWingModel[11] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 37
		rightWingModel[12] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 38
		rightWingModel[13] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 39
		rightWingModel[14] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 40
		rightWingModel[15] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 41
		rightWingModel[16] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 42
		rightWingModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 43
		rightWingModel[18] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 44
		rightWingModel[19] = new ModelRendererTurbo(this, 858, 338, textureX, textureY); // Box 5
		rightWingModel[20] = new ModelRendererTurbo(this, 767, 349, textureX, textureY); // Box 6
		rightWingModel[21] = new ModelRendererTurbo(this, 879, 362, textureX, textureY); // Box 7
		rightWingModel[22] = new ModelRendererTurbo(this, 852, 334, textureX, textureY); // Box 8
		rightWingModel[23] = new ModelRendererTurbo(this, 801, 317, textureX, textureY); // Box 9

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 5, 9, 80, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 22
		rightWingModel[0].setRotationPoint(-34F, -23F, 10F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 8, 9, 80, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 23
		rightWingModel[1].setRotationPoint(-42F, -23F, 10F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 6, 7, 80, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -4F, 6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -4F, -13F, 0F); // Box 24
		rightWingModel[2].setRotationPoint(-48F, -21F, 10F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 11, 9, 80, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -14F, 0F, 0F, -12F, 0F); // Box 25
		rightWingModel[3].setRotationPoint(-29F, -23F, 10F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, 0F); // Box 26
		rightWingModel[4].setRotationPoint(-34F, -29F, 90F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F, 0F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F); // Box 27
		rightWingModel[5].setRotationPoint(-39F, -29F, 90F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 28
		rightWingModel[6].setRotationPoint(-35F, -29F, 90F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F); // Box 29
		rightWingModel[7].setRotationPoint(-42F, -29F, 90F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F); // Box 30
		rightWingModel[8].setRotationPoint(-44F, -29F, 90F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, -3F, -5F, 0F, -3F, -0.5F); // Box 31
		rightWingModel[9].setRotationPoint(-29F, -29F, 90F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 5, 3, 7, 0F, 0F, -0.55F, 0F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -3F, 0F); // Box 33
		rightWingModel[10].setRotationPoint(-23F, -29F, 90F);

		rightWingModel[11].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 37
		rightWingModel[11].setRotationPoint(-53F, -22F, 44F);

		rightWingModel[12].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 38
		rightWingModel[12].setRotationPoint(-51F, -22.5F, 48F);

		rightWingModel[13].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 39
		rightWingModel[13].setRotationPoint(-49F, -23F, 52F);

		rightWingModel[14].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 40
		rightWingModel[14].setRotationPoint(-47F, -23.5F, 55.5F);

		rightWingModel[15].addBox(0F, 0F, 0F, 14, 8, 1, 0F); // Box 41
		rightWingModel[15].setRotationPoint(-39F, -23F, 56.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 42
		rightWingModel[16].setRotationPoint(-25F, -23F, 56.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 43
		rightWingModel[17].setRotationPoint(-42F, -23F, 56.5F);

		rightWingModel[18].addBox(0F, 0F, 0F, 20, 1, 1, 0F); // Box 44
		rightWingModel[18].setRotationPoint(-60F, -27F, 82.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 5, 9, 70, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 4.25F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -12F, 0F, 0F, -12.4F, 0F); // Box 5
		rightWingModel[19].setRotationPoint(-18F, -23F, 10F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 6, 9, 45, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -8.3F, 0F); // Box 6
		rightWingModel[20].setRotationPoint(-13F, -23F, 10F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.4F, 0F, 0F, -2F, 0F, -5F, -4F, 0F, 0F, -4F, 0F); // Box 7
		rightWingModel[21].setRotationPoint(-18F, -28F, 80F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F, 0F, -0.7F, 0F, 0F, -1.9F, 0F, -2F, -0.9F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -1.1F, 0F, -2F, -2.1F, 0F, 0F, -1.7F, 0F); // Box 8
		rightWingModel[22].setRotationPoint(-13F, -24.9F, 55F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F, 0F, -1.1F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, -4F, -3F, 0F, 0F, -3F, 0F); // Box 9
		rightWingModel[23].setRotationPoint(-13F, -26F, 64F);


		tailWheelModel = new ModelRendererTurbo[6];
		tailWheelModel[0] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 213
		tailWheelModel[1] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 214
		tailWheelModel[2] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 215
		tailWheelModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 216
		tailWheelModel[4] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 217
		tailWheelModel[5] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 218

		tailWheelModel[0].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 213
		tailWheelModel[0].setRotationPoint(79.5F, -26F, -0.5F);

		tailWheelModel[1].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 214
		tailWheelModel[1].setRotationPoint(79.5F, -23F, -0.5F);
		tailWheelModel[1].rotateAngleZ = 0.78539816F;

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		tailWheelModel[2].setRotationPoint(80F, -24F, -2F);

		tailWheelModel[3].addBox(0F, 0F, 0F, 6, 2, 4, 0F); // Box 216
		tailWheelModel[3].setRotationPoint(80F, -22F, -2F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 217
		tailWheelModel[4].setRotationPoint(80F, -20F, -2F);

		tailWheelModel[5].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 218
		tailWheelModel[5].setRotationPoint(82.5F, -21.5F, -2.5F);


		leftWingWheelModel = new ModelRendererTurbo[8];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 809, 97, textureX, textureY); // Box 193
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 194
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 195
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 196
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 201
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 202
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 203
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 204

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 5, 15, 1, 0F); // Box 193
		leftWingWheelModel[0].setRotationPoint(-34F, -19F, -43F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 194
		leftWingWheelModel[1].setRotationPoint(-37F, 5F, -41F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 9, 3, 4, 0F); // Box 195
		leftWingWheelModel[2].setRotationPoint(-37F, 2F, -41F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		leftWingWheelModel[3].setRotationPoint(-37F, -1F, -41F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftWingWheelModel[4].setRotationPoint(-38F, -4F, -42F);

		leftWingWheelModel[5].addBox(0F, 0F, 0F, 11, 4, 1, 0F); // Box 202
		leftWingWheelModel[5].setRotationPoint(-38F, 0F, -42F);

		leftWingWheelModel[6].addBox(0F, 0F, 0F, 3, 15, 2, 0F); // Box 203
		leftWingWheelModel[6].setRotationPoint(-33.5F, -19F, -42F);

		leftWingWheelModel[7].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 204
		leftWingWheelModel[7].setRotationPoint(-33.5F, -4F, -41F);


		rightWingWheelModel = new ModelRendererTurbo[8];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Box 205
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 206
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 207
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 208
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 209
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 210
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 211
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 212

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 5, 15, 1, 0F); // Box 205
		rightWingWheelModel[0].setRotationPoint(-34F, -19F, 42F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 206
		rightWingWheelModel[1].setRotationPoint(-37F, 5F, 37F);

		rightWingWheelModel[2].addBox(0F, 0F, 0F, 9, 3, 4, 0F); // Box 207
		rightWingWheelModel[2].setRotationPoint(-37F, 2F, 37F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		rightWingWheelModel[3].setRotationPoint(-37F, -1F, 37F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		rightWingWheelModel[4].setRotationPoint(-38F, -4F, 41F);

		rightWingWheelModel[5].addBox(0F, 0F, 0F, 11, 4, 1, 0F); // Box 210
		rightWingWheelModel[5].setRotationPoint(-38F, 0F, 41F);

		rightWingWheelModel[6].addBox(0F, 0F, 0F, 3, 15, 2, 0F); // Box 211
		rightWingWheelModel[6].setRotationPoint(-33.5F, -19F, 40F);

		rightWingWheelModel[7].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 212
		rightWingWheelModel[7].setRotationPoint(-33.5F, -4F, 40F);
		

		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0][0] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Prop
		propellerModels[0][1] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Prop
		propellerModels[0][2] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Prop
		propellerModels[0][3] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Prop
		propellerModels[0][0].addBox(0F, -2F, 2F, 1, 4, 28, 0F); // Prop
		propellerModels[0][1].addBox(0F, -2F, 2F, 1, 4, 28, 0F); // Prop
		propellerModels[0][2].addBox(0F, -2F, 2F, 1, 4, 28, 0F); // Prop
		propellerModels[0][3].addBox(0F, -2F, 2F, 1, 4, 28, 0F); // Prop
		propellerModels[0][0].setRotationPoint(-81F, -27F, 0F);
		propellerModels[0][1].setRotationPoint(-81F, -27F, 0F);
		propellerModels[0][2].setRotationPoint(-81F, -27F, 0F);	
		propellerModels[0][3].setRotationPoint(-81F, -27F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}