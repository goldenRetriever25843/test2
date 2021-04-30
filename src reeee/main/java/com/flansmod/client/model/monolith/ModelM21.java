//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM21 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM21() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[113];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 18
		gunModel[6] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 19
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		gunModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		gunModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 23
		gunModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 24
		gunModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25
		gunModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 26
		gunModel[13] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		gunModel[14] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 28
		gunModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		gunModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 30
		gunModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 31
		gunModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 32
		gunModel[19] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 33
		gunModel[20] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 34
		gunModel[21] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 35
		gunModel[22] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 36
		gunModel[23] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 37
		gunModel[24] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 41
		gunModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 42
		gunModel[26] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 43
		gunModel[27] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 44
		gunModel[28] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 45
		gunModel[29] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 46
		gunModel[30] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 47
		gunModel[31] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 48
		gunModel[32] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 49
		gunModel[33] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 50
		gunModel[34] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 51
		gunModel[35] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 53
		gunModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 55
		gunModel[37] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 57
		gunModel[38] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 58
		gunModel[39] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 59
		gunModel[40] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 60
		gunModel[41] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 61
		gunModel[42] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 62
		gunModel[43] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 63
		gunModel[44] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 64
		gunModel[45] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 65
		gunModel[46] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 67
		gunModel[47] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 68
		gunModel[48] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 69
		gunModel[49] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 70
		gunModel[50] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 71
		gunModel[51] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 72
		gunModel[52] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 73
		gunModel[53] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 74
		gunModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 75
		gunModel[55] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 76
		gunModel[56] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 77
		gunModel[57] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 78
		gunModel[58] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 79
		gunModel[59] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 80
		gunModel[60] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 81
		gunModel[61] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 82
		gunModel[62] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 83
		gunModel[63] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 84
		gunModel[64] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 85
		gunModel[65] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 86
		gunModel[66] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 87
		gunModel[67] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 88
		gunModel[68] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 0
		gunModel[69] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 1
		gunModel[70] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 2
		gunModel[71] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 3
		gunModel[72] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 4
		gunModel[73] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 5
		gunModel[74] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 6
		gunModel[75] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 7
		gunModel[76] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 1
		gunModel[77] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 2
		gunModel[78] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 3
		gunModel[79] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 4
		gunModel[80] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 5
		gunModel[81] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 6
		gunModel[82] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 7
		gunModel[83] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 8
		gunModel[84] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 9
		gunModel[85] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 10
		gunModel[86] = new ModelRendererTurbo(this, 222, 191, textureX, textureY); // Box 0
		gunModel[87] = new ModelRendererTurbo(this, 337, 223, textureX, textureY); // Box 1
		gunModel[88] = new ModelRendererTurbo(this, 325, 195, textureX, textureY); // Box 2
		gunModel[89] = new ModelRendererTurbo(this, 62, 195, textureX, textureY); // Box 4
		gunModel[90] = new ModelRendererTurbo(this, 153, 143, textureX, textureY); // Box 5
		gunModel[91] = new ModelRendererTurbo(this, 260, 154, textureX, textureY); // Box 6
		gunModel[92] = new ModelRendererTurbo(this, 387, 161, textureX, textureY); // Box 8
		gunModel[93] = new ModelRendererTurbo(this, 426, 228, textureX, textureY); // Box 9
		gunModel[94] = new ModelRendererTurbo(this, 339, 151, textureX, textureY); // Box 10
		gunModel[95] = new ModelRendererTurbo(this, 272, 198, textureX, textureY); // Box 11
		gunModel[96] = new ModelRendererTurbo(this, 322, 183, textureX, textureY); // Box 12
		gunModel[97] = new ModelRendererTurbo(this, 325, 208, textureX, textureY); // Box 13
		gunModel[98] = new ModelRendererTurbo(this, 375, 131, textureX, textureY); // Box 14
		gunModel[99] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 15
		gunModel[100] = new ModelRendererTurbo(this, 273, 172, textureX, textureY); // Box 0
		gunModel[101] = new ModelRendererTurbo(this, 288, 150, textureX, textureY); // Box 1
		gunModel[102] = new ModelRendererTurbo(this, 211, 164, textureX, textureY); // Box 2
		gunModel[103] = new ModelRendererTurbo(this, 169, 170, textureX, textureY); // Box 3
		gunModel[104] = new ModelRendererTurbo(this, 207, 143, textureX, textureY); // Box 4
		gunModel[105] = new ModelRendererTurbo(this, 162, 215, textureX, textureY); // Box 0
		gunModel[106] = new ModelRendererTurbo(this, 109, 195, textureX, textureY); // Box 1
		gunModel[107] = new ModelRendererTurbo(this, 54, 163, textureX, textureY); // Box 2
		gunModel[108] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 3
		gunModel[109] = new ModelRendererTurbo(this, 431, 206, textureX, textureY); // Box 4
		gunModel[110] = new ModelRendererTurbo(this, 432, 179, textureX, textureY); // Box 5
		gunModel[111] = new ModelRendererTurbo(this, 273, 220, textureX, textureY); // Box 6
		gunModel[112] = new ModelRendererTurbo(this, 220, 223, textureX, textureY); // Box 7

		gunModel[0].addShapeBox(0F, 0F, 0F, 21, 13, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(20F, -33F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 45, 11, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(41F, -33F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 44, 8, 12, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 2
		gunModel[2].setRotationPoint(86F, -33F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 77, 5, 12, 0F, 0F, 0F, -2F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(54F, -42F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 45, 2, 12, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 9
		gunModel[4].setRotationPoint(86F, -37F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 56, 5, 5, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 18
		gunModel[5].setRotationPoint(130F, -38F, 3.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 32, 3, 3, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 19
		gunModel[6].setRotationPoint(120F, -32F, 4.5F);

		gunModel[7].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 21
		gunModel[7].setRotationPoint(180F, -41F, 3.5F);

		gunModel[8].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 22
		gunModel[8].setRotationPoint(180F, -44F, 3.5F);

		gunModel[9].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 23
		gunModel[9].setRotationPoint(184F, -44F, 3.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[10].setRotationPoint(180F, -45F, 3.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[11].setRotationPoint(182F, -44F, 3.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 26
		gunModel[12].setRotationPoint(183F, -44F, 3.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[13].setRotationPoint(183F, -42F, 3.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[14].setRotationPoint(182F, -42F, 3.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[15].setRotationPoint(180F, -45F, 7.5F);

		gunModel[16].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 30
		gunModel[16].setRotationPoint(180F, -44F, 7.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[17].setRotationPoint(182F, -44F, 7.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 32
		gunModel[18].setRotationPoint(183F, -44F, 7.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[19].setRotationPoint(183F, -42F, 7.5F);

		gunModel[20].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 34
		gunModel[20].setRotationPoint(184F, -44F, 7.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		gunModel[21].setRotationPoint(182F, -42F, 7.5F);

		gunModel[22].addBox(0F, 0F, 0F, 6, 3, 1, 0F); // Box 36
		gunModel[22].setRotationPoint(180F, -41F, 7.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[23].setRotationPoint(180F, -43F, 5.5F);

		gunModel[24].addBox(0F, 0F, 0F, 32, 4, 10, 0F); // Box 41
		gunModel[24].setRotationPoint(54F, -37F, 1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 44, 2, 12, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 42
		gunModel[25].setRotationPoint(86F, -34.5F, 0F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 44, 1, 10, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 43
		gunModel[26].setRotationPoint(86F, -35F, 1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 5, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 44
		gunModel[27].setRotationPoint(52F, -42F, 0F);

		gunModel[28].addBox(0F, 0F, 0F, 7, 5, 10, 0F); // Box 45
		gunModel[28].setRotationPoint(47F, -38F, 1F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[29].setRotationPoint(47F, -39F, 1F);

		gunModel[30].addBox(0F, 0F, 0F, 7, 7, 10, 0F); // Box 47
		gunModel[30].setRotationPoint(41F, -40F, 1F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		gunModel[31].setRotationPoint(48F, -42F, 1F);

		gunModel[32].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 49
		gunModel[32].setRotationPoint(43F, -42F, 1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[33].setRotationPoint(38F, -42F, 2F);

		gunModel[34].addBox(0F, 0F, 0F, 34, 4, 10, 0F); // Box 51
		gunModel[34].setRotationPoint(7F, -37F, 1F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[35].setRotationPoint(21F, -42F, 1.5F);

		gunModel[36].addBox(0F, 0F, 0F, 24, 13, 12, 0F); // Box 55
		gunModel[36].setRotationPoint(-4F, -33F, 0F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[37].setRotationPoint(-3F, -38F, 1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 14, 22, 12, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[38].setRotationPoint(-18F, -33F, 0F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 18, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[39].setRotationPoint(-20F, -28F, 0F);

		gunModel[40].addBox(0F, 0F, 0F, 5, 18, 12, 0F); // Box 60
		gunModel[40].setRotationPoint(-25F, -28F, 0F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 9, 19, 12, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[41].setRotationPoint(-34F, -29F, 0F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 48, 19, 12, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 62
		gunModel[42].setRotationPoint(-82F, -29F, 0F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 47, 15, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -2F, 0F, 0F); // Box 63
		gunModel[43].setRotationPoint(-81F, -10F, 0F);

		gunModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 64
		gunModel[44].setRotationPoint(10F, -45F, 3.5F);

		gunModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 65
		gunModel[45].setRotationPoint(10F, -45F, 7.5F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 67
		gunModel[46].setRotationPoint(10F, -44F, 6.5F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 68
		gunModel[47].setRotationPoint(10F, -46F, 3.5F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[48].setRotationPoint(10F, -46F, 6.5F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[49].setRotationPoint(10F, -44F, 3.5F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[50].setRotationPoint(10F, -47F, 4.5F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 72
		gunModel[51].setRotationPoint(10F, -43F, 4.5F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[52].setRotationPoint(8F, -46F, 1.5F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[53].setRotationPoint(8F, -44F, 1.5F);

		gunModel[54].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[54].setRotationPoint(8F, -46F, 9.5F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[55].setRotationPoint(8F, -44F, 9.5F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[56].setRotationPoint(83F, -35F, 0F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 78
		gunModel[57].setRotationPoint(83F, -37F, 0F);

		gunModel[58].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 79
		gunModel[58].setRotationPoint(0F, -20F, 3F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 80
		gunModel[59].setRotationPoint(1F, -14F, 3F);

		gunModel[60].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Box 81
		gunModel[60].setRotationPoint(11F, -20F, 3F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[61].setRotationPoint(10F, -16F, 3F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 83
		gunModel[62].setRotationPoint(0F, -16F, 3F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[63].setRotationPoint(4F, -20F, 5F);

		gunModel[64].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 85
		gunModel[64].setRotationPoint(4F, -19F, 5F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 86
		gunModel[65].setRotationPoint(4F, -16F, 5F);

		gunModel[66].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 87
		gunModel[66].setRotationPoint(14F, -20F, 4F);

		gunModel[67].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 88
		gunModel[67].setRotationPoint(12F, -18F, 4F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F, 0F, -2F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 0
		gunModel[68].setRotationPoint(-4F, -38F, 1F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 3, 6, 10, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[69].setRotationPoint(5F, -39F, 1F);

		gunModel[70].addShapeBox(0F, 0F, 0F, 14, 5, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[70].setRotationPoint(7F, -42F, 1.5F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 14, 5, 3, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[71].setRotationPoint(7F, -42F, 7.5F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[72].setRotationPoint(7F, -42F, 5.5F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[73].setRotationPoint(7F, -42F, 4.5F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[74].setRotationPoint(7F, -42F, 6.5F);

		gunModel[75].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 7
		gunModel[75].setRotationPoint(10F, -42F, 5.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1
		gunModel[76].setRotationPoint(131F, -40.5F, 1F);

		gunModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[77].setRotationPoint(131F, -37F, 1F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		gunModel[78].setRotationPoint(130F, -33F, 1F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[79].setRotationPoint(130F, -35F, 1F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 19, 5, 5, 0F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.3F); // Box 5
		gunModel[80].setRotationPoint(186F, -38F, 3.5F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 6
		gunModel[81].setRotationPoint(152F, -32F, 4.5F);

		gunModel[82].addShapeBox(0F, 0F, 0F, 6, 6, 5, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F); // Box 7
		gunModel[82].setRotationPoint(142F, -38.5F, 3.5F);

		gunModel[83].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 8
		gunModel[83].setRotationPoint(142F, -32.5F, 4.5F);

		gunModel[84].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F); // Box 9
		gunModel[84].setRotationPoint(132F, -38.5F, 3.5F);

		gunModel[85].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F); // Box 10
		gunModel[85].setRotationPoint(132F, -32.5F, 4.5F);

		gunModel[86].addBox(0F, 0F, 0F, 18, 12, 2, 0F); // Box 0
		gunModel[86].setRotationPoint(29F, -48F, 11F);

		gunModel[87].addBox(0F, 0F, 0F, 31, 3, 4, 0F); // Box 1
		gunModel[87].setRotationPoint(19F, -48F, 4F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 43, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		gunModel[88].setRotationPoint(7F, -50F, 3F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, -1F, -4F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -1F, -4F); // Box 4
		gunModel[89].setRotationPoint(60F, -50F, 0.5F);

		gunModel[90].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		gunModel[90].setRotationPoint(70F, -56.5F, 0.5F);

		gunModel[91].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		gunModel[91].setRotationPoint(40F, -56F, 3F);

		gunModel[92].addBox(0F, 0F, 0F, 7, 3, 7, 0F); // Box 8
		gunModel[92].setRotationPoint(11F, -53F, 2.5F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -3F); // Box 9
		gunModel[93].setRotationPoint(4F, -50F, 1F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[94].setRotationPoint(-5F, -56F, 1F);

		gunModel[95].addBox(0F, 0F, 0F, 18, 3, 3, 0F); // Box 11
		gunModel[95].setRotationPoint(29F, -48F, 8F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 43, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[96].setRotationPoint(7F, -54F, 3F);

		gunModel[97].addBox(0F, 0F, 0F, 43, 2, 6, 0F); // Box 13
		gunModel[97].setRotationPoint(7F, -52F, 3F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[98].setRotationPoint(11F, -56F, 2.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 15
		gunModel[99].setRotationPoint(11F, -50F, 2.5F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 0
		gunModel[100].setRotationPoint(36F, -56F, 3F);

		gunModel[101].addBox(0F, 0F, 0F, 2, 4, 6, 0F); // Box 1
		gunModel[101].setRotationPoint(38F, -56F, 3F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		gunModel[102].setRotationPoint(50F, -55F, 2F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		gunModel[103].setRotationPoint(50F, -52F, 2F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -3F); // Box 4
		gunModel[104].setRotationPoint(50F, -50F, 2F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F, 0F, -1F, -4F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -1F, -4F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F); // Box 0
		gunModel[105].setRotationPoint(60F, -56F, 0.5F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F); // Box 1
		gunModel[106].setRotationPoint(60F, -53F, 0.5F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 2
		gunModel[107].setRotationPoint(70F, -49.5F, 0.5F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[108].setRotationPoint(70F, -53F, 0.5F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 4
		gunModel[109].setRotationPoint(4F, -56F, 1F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 5
		gunModel[110].setRotationPoint(4F, -53F, 1F);

		gunModel[111].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[111].setRotationPoint(-5F, -53F, 1F);

		gunModel[112].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 7
		gunModel[112].setRotationPoint(-5F, -49F, 1F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 12
		ammoModel[1] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 13
		ammoModel[2] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 14
		ammoModel[3] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 15
		ammoModel[4] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 16

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 28, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		ammoModel[0].setRotationPoint(25F, -25F, 2F);
		ammoModel[0].rotateAngleZ = 0.08726646F;

		ammoModel[1].addShapeBox(1F, 0F, 0F, 1, 28, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		ammoModel[1].setRotationPoint(25F, -25F, 2.5F);
		ammoModel[1].rotateAngleZ = 0.08726646F;

		ammoModel[2].addShapeBox(12F, 0F, 0F, 2, 28, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		ammoModel[2].setRotationPoint(25F, -25F, 2.5F);
		ammoModel[2].rotateAngleZ = 0.08726646F;

		ammoModel[3].addShapeBox(2F, 0F, 0F, 10, 28, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		ammoModel[3].setRotationPoint(25F, -25F, 2F);
		ammoModel[3].rotateAngleZ = 0.08726646F;

		ammoModel[4].addShapeBox(14F, 0F, 0F, 4, 28, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		ammoModel[4].setRotationPoint(25F, -25F, 2F);
		ammoModel[4].rotateAngleZ = 0.08726646F;


		slideModel = new ModelRendererTurbo[2];
		slideModel[0] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 54
		slideModel[1] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 8

		slideModel[0].addBox(0F, 0F, 0F, 18, 3, 8, 0F); // Box 54
		slideModel[0].setRotationPoint(23F, -40F, 2F);

		slideModel[1].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 8
		slideModel[1].setRotationPoint(37F, -39.5F, -4F);

		animationType = EnumAnimationType.PISTOL_CLIP;

		translateAll(0F, -1F, -6F);
		gunSlideDistance = 1F;

		flipAll();
	}
}