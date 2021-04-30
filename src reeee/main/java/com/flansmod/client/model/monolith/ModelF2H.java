//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelF2H extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelF2H() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[144];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 64
		bodyModel[57] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 65
		bodyModel[58] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 66
		bodyModel[59] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 67
		bodyModel[60] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 68
		bodyModel[61] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 69
		bodyModel[62] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 70
		bodyModel[63] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 71
		bodyModel[64] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 1
		bodyModel[66] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 4
		bodyModel[68] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 5
		bodyModel[69] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 6
		bodyModel[70] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 7
		bodyModel[71] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 8
		bodyModel[72] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 9
		bodyModel[73] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 10
		bodyModel[74] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 11
		bodyModel[75] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 12
		bodyModel[76] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 13
		bodyModel[77] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 14
		bodyModel[78] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 16
		bodyModel[79] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 17
		bodyModel[80] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 18
		bodyModel[81] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 19
		bodyModel[82] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 20
		bodyModel[83] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 21
		bodyModel[84] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 22
		bodyModel[85] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 23
		bodyModel[86] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 1
		bodyModel[88] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 3
		bodyModel[90] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 4
		bodyModel[91] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 5
		bodyModel[92] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 6
		bodyModel[93] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 7
		bodyModel[94] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 8
		bodyModel[95] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 9
		bodyModel[96] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 10
		bodyModel[97] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 11
		bodyModel[98] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 12
		bodyModel[99] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 13
		bodyModel[100] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 14
		bodyModel[101] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 15
		bodyModel[102] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 16
		bodyModel[103] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 17
		bodyModel[104] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 18
		bodyModel[105] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 19
		bodyModel[106] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 20
		bodyModel[107] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 21
		bodyModel[108] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 22
		bodyModel[109] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 25
		bodyModel[110] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 27
		bodyModel[111] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 28
		bodyModel[112] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 29
		bodyModel[113] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 31
		bodyModel[114] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 32
		bodyModel[115] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 1
		bodyModel[117] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 2
		bodyModel[118] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 4
		bodyModel[119] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 5
		bodyModel[120] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 6
		bodyModel[121] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 7
		bodyModel[122] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 8
		bodyModel[123] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 9
		bodyModel[124] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 10
		bodyModel[125] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 11
		bodyModel[126] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 12
		bodyModel[127] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 13
		bodyModel[128] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 14
		bodyModel[129] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 15
		bodyModel[130] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 16
		bodyModel[131] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 17
		bodyModel[132] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 18
		bodyModel[133] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 19
		bodyModel[134] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 20
		bodyModel[135] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 21
		bodyModel[136] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 22
		bodyModel[137] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 23
		bodyModel[138] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 24
		bodyModel[139] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 25
		bodyModel[140] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 26
		bodyModel[141] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 27
		bodyModel[142] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 28
		bodyModel[143] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 57

		bodyModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-64F, -3F, -6F);
		bodyModel[0].rotateAngleZ = 0.13962634F;

		bodyModel[1].addBox(0F, 0F, 0F, 2, 14, 8, 0F); // Box 1
		bodyModel[1].setRotationPoint(-51F, -18F, -4F);
		bodyModel[1].rotateAngleZ = -0.06981317F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 2
		bodyModel[2].setRotationPoint(-68F, -6F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(-68F, -6F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-68F, -9F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-68F, -9F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-64F, -8F, -7F);

		bodyModel[7].addBox(0F, 0F, 0F, 18, 6, 1, 0F); // Box 8
		bodyModel[7].setRotationPoint(-68F, -15F, -9F);

		bodyModel[8].addBox(0F, 0F, 0F, 18, 6, 1, 0F); // Box 9
		bodyModel[8].setRotationPoint(-68F, -15F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-68F, -20F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 4, 2, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-64F, -8F, 5F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Box 13
		bodyModel[11].setRotationPoint(-68F, -6F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 5, 2, 10, 0F); // Box 14
		bodyModel[12].setRotationPoint(-68F, -8F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 8, 16, 0F, 0F, 0F, -1F, -1F, 1F, -1F, -1F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-68F, -16F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 18, 5, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-68F, -20F, 8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-68F, -17F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Box 18
		bodyModel[16].setRotationPoint(-68F, -6F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 5, 4, 2, 0F); // Box 19
		bodyModel[17].setRotationPoint(-68F, -6F, 4F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 20
		bodyModel[18].setRotationPoint(-68F, -3F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 21
		bodyModel[19].setRotationPoint(-68F, -6F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -1F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-63F, -10F, -0.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 23
		bodyModel[21].setRotationPoint(-62F, -12F, -0.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 24
		bodyModel[22].setRotationPoint(-61F, -13F, -0.5F);
		bodyModel[22].rotateAngleZ = -0.52359878F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-68F, -21F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(-68F, -21F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(-67F, -19F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(-64F, -22F, -2F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 5, 6, 0F); // Box 29
		bodyModel[27].setRotationPoint(-50F, -24F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(-49F, -20F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(-49F, -20F, 1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(-50F, -25F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(-50F, -25F, 2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 81, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(-68F, -2F, -6F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 36
		bodyModel[33].setRotationPoint(-68F, -19F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 6, 18, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 37
		bodyModel[34].setRotationPoint(-77F, -15F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 38
		bodyModel[35].setRotationPoint(-77F, -20F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 40
		bodyModel[36].setRotationPoint(-77F, -20F, -4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 41
		bodyModel[37].setRotationPoint(-77F, -20F, 4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 42
		bodyModel[38].setRotationPoint(-77F, -6F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 44
		bodyModel[39].setRotationPoint(-77F, -6F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(-65F, -23F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(-66F, -26F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(-66F, -26F, 4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[43].setRotationPoint(-65F, -23F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F); // Box 49
		bodyModel[44].setRotationPoint(-67F, -27F, -3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 50
		bodyModel[45].setRotationPoint(-76F, -21F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[46].setRotationPoint(-75F, -23F, 1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -3F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[47].setRotationPoint(-75F, -23F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -3F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[48].setRotationPoint(-72F, -26F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -3F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[49].setRotationPoint(-72F, -26F, 2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[50].setRotationPoint(-77F, -2F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F); // Box 57
		bodyModel[51].setRotationPoint(-77F, -2F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 58
		bodyModel[52].setRotationPoint(-77F, -9F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 59
		bodyModel[53].setRotationPoint(-77F, -9F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 15, 6, 16, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 60
		bodyModel[54].setRotationPoint(-92F, -15F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F, 0F, -5F, -1F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 2F, 0F); // Box 61
		bodyModel[55].setRotationPoint(-92F, -20F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 64
		bodyModel[56].setRotationPoint(-92F, -20F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 15, 3, 8, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[57].setRotationPoint(-92F, -9F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 15, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F); // Box 66
		bodyModel[58].setRotationPoint(-92F, -9F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -5F, -1F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 2F, 0F); // Box 67
		bodyModel[59].setRotationPoint(-92F, -20F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 15, 4, 7, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 68
		bodyModel[60].setRotationPoint(-92F, -6F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 15, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -5F); // Box 69
		bodyModel[61].setRotationPoint(-92F, -6F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[62].setRotationPoint(-92F, -3F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 15, 1, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, -5F); // Box 71
		bodyModel[63].setRotationPoint(-92F, -3F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F, 0F, -6F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-102F, -16F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 1
		bodyModel[65].setRotationPoint(-102F, -16F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F, 3F, -5F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F); // Box 2
		bodyModel[66].setRotationPoint(-99F, -16F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 5, 5, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, -3F, 0F); // Box 4
		bodyModel[67].setRotationPoint(-102F, -8F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, -4F, -3F); // Box 5
		bodyModel[68].setRotationPoint(-102F, -8F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[69].setRotationPoint(-103F, -12F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
		bodyModel[70].setRotationPoint(-103F, -12F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[71].setRotationPoint(-103F, -8F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 9
		bodyModel[72].setRotationPoint(-103F, -8F, 0F);

		bodyModel[73].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 10
		bodyModel[73].setRotationPoint(-103F, -8F, -2.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 11
		bodyModel[74].setRotationPoint(-103F, -8F, 1.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 12
		bodyModel[75].setRotationPoint(-104F, -8F, -1.25F);

		bodyModel[76].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 13
		bodyModel[76].setRotationPoint(-104F, -8F, 0.25F);

		bodyModel[77].addBox(0F, 0F, 0F, 83, 6, 18, 0F); // Box 14
		bodyModel[77].setRotationPoint(-50F, -15F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 83, 5, 1, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[78].setRotationPoint(-50F, -20F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 83, 5, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[79].setRotationPoint(-50F, -20F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0F, -1F, -2F, 0F, 1F, -6F, 0F, 1F, 6F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[80].setRotationPoint(-50F, -21F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F, 0F, -1F, 2F, 0F, 1F, 6F, 0F, 1F, -6F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[81].setRotationPoint(-50F, -21F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -1F, -2F, -2F, 0F, 0F, -1F, 0F, 1F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 1F, 0F); // Box 20
		bodyModel[82].setRotationPoint(-41F, -25F, -3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 67, 3, 7, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[83].setRotationPoint(-34F, -22F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 67, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[84].setRotationPoint(-34F, -22F, 0F);

		bodyModel[85].addBox(0F, 0F, 0F, 15, 5, 8, 0F); // Box 23
		bodyModel[85].setRotationPoint(-48F, -20F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 3F, -5F, -3F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, -3F); // Box 0
		bodyModel[86].setRotationPoint(-99F, -16F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 63, 3, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[87].setRotationPoint(-50F, -9F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 63, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[88].setRotationPoint(-50F, -9F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 63, 4, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 3
		bodyModel[89].setRotationPoint(-50F, -6F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 63, 4, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 4
		bodyModel[90].setRotationPoint(-50F, -6F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 81, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 5
		bodyModel[91].setRotationPoint(-68F, -2F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[92].setRotationPoint(13F, -9F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[93].setRotationPoint(13F, -9F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 5F, 0F, 0F, 5F); // Box 8
		bodyModel[94].setRotationPoint(13F, -6F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, -2F, 5F, 0F, -2F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[95].setRotationPoint(13F, -6F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[96].setRotationPoint(13F, -2F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F); // Box 11
		bodyModel[97].setRotationPoint(13F, -2F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 36, 6, 18, 0F, 0F, 0F, 0F, 0F, 4F, -6F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, 0F); // Box 12
		bodyModel[98].setRotationPoint(33F, -15F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F, 0F, -1F, -2F, 0F, 1F, -7F, 0F, 1F, 7F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 6F, 0F, 0F, 0F); // Box 13
		bodyModel[99].setRotationPoint(33F, -20F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F, 0F, -1F, 2F, 0F, 1F, 7F, 0F, 1F, -7F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -4F, 6F, 0F, -4F, -6F, 0F, 0F, 0F); // Box 14
		bodyModel[100].setRotationPoint(33F, -20F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 36, 3, 7, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[101].setRotationPoint(33F, -22F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 36, 3, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, 0F, 0F); // Box 16
		bodyModel[102].setRotationPoint(33F, -22F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F, 0F, 0F, 1F, 0F, 4F, -5F, 0F, 4F, 5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -5F, -6F, 0F, -5F, 6F, 0F, -1F, 0F); // Box 17
		bodyModel[103].setRotationPoint(33F, -9F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F, 0F, 0F, -1F, 0F, 4F, 5F, 0F, 4F, -5F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -5F, 6F, 0F, -5F, -6F, 0F, -1F, 0F); // Box 18
		bodyModel[104].setRotationPoint(33F, -9F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F, 0F, 0F, 1F, 0F, 4F, -5F, 0F, 4F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, -6F, 0F, -6F, 6F, 0F, 0F, 5F); // Box 19
		bodyModel[105].setRotationPoint(33F, -7F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 36, 3, 1, 0F, 0F, 0F, -1F, 0F, 4F, 5F, 0F, 4F, -5F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, -6F, 6F, 0F, -6F, -6F, 0F, 0F, -1F); // Box 20
		bodyModel[106].setRotationPoint(33F, -7F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 36, 1, 6, 0F, 0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -6F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[107].setRotationPoint(33F, -4F, -6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 36, 1, 6, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -6F, 0F, 0F, -3F); // Box 22
		bodyModel[108].setRotationPoint(33F, -4F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 25
		bodyModel[109].setRotationPoint(69F, -22F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 26, 1, 4, 0F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, -1F); // Box 27
		bodyModel[110].setRotationPoint(69F, -11F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 31, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 0F); // Box 28
		bodyModel[111].setRotationPoint(-28F, -12F, -19F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 31, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 29
		bodyModel[112].setRotationPoint(-28F, -12F, 18F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 31, 3, 11, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[113].setRotationPoint(-28F, -15F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 31, 3, 11, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 32
		bodyModel[114].setRotationPoint(-28F, -9F, -19F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 31, 3, 11, 0F, -11F, -3F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -11F, 4F, 0F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, 7F, 0F); // Box 0
		bodyModel[115].setRotationPoint(-28F, -15F, -30F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 24, 3, 11, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 1
		bodyModel[116].setRotationPoint(3F, -12F, 8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 31, 3, 11, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 2
		bodyModel[117].setRotationPoint(-28F, -9F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 31, 3, 11, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -11F, -3F, 0F, 0F, 7F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, -11F, 4F, 0F); // Box 4
		bodyModel[118].setRotationPoint(-28F, -15F, 19F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 33, 5, 11, 0F, 0F, -1F, 0F, -8F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[119].setRotationPoint(3F, -12F, -30F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 33, 5, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -8F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[120].setRotationPoint(3F, -12F, 19F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 31, 3, 11, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 7
		bodyModel[121].setRotationPoint(-28F, -15F, -19F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 24, 3, 11, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 8
		bodyModel[122].setRotationPoint(3F, -12F, -19F);

		bodyModel[123].addFlexTrapezoid(0F, 0F, 0F, 45, 4, 10, 0F, 0.00F, 0.00F, -3.00F, -3.00F, -3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 9
		bodyModel[123].setRotationPoint(-15F, -14F, -19F);

		bodyModel[124].addFlexTrapezoid(0F, 0F, 0F, 45, 4, 10, 0F, 0.00F, 0.00F, -3.00F, -3.00F, -3.00F, -3.00F, ModelRendererTurbo.MR_BOTTOM); // Box 10
		bodyModel[124].setRotationPoint(-15F, -10F, -19F);

		bodyModel[125].addFlexTrapezoid(0F, 0F, 0F, 45, 4, 10, 0F, 0.00F, 0.00F, -3.00F, -3.00F, -3.00F, -3.00F, ModelRendererTurbo.MR_TOP); // Box 11
		bodyModel[125].setRotationPoint(-15F, -14F, 9F);

		bodyModel[126].addFlexTrapezoid(0F, 0F, 0F, 45, 4, 10, 0F, 0.00F, 0.00F, -3.00F, -3.00F, -3.00F, -3.00F, ModelRendererTurbo.MR_BOTTOM); // Box 12
		bodyModel[126].setRotationPoint(-15F, -10F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[127].setRotationPoint(30F, -14F, -16F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[128].setRotationPoint(30F, -7F, -16F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -4F, -1F, 0F, -4F, -2F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, -1F, 3F, -3F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[129].setRotationPoint(30F, -14F, -20F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 3F, -1F, -1F, 3F, -3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -4F, -1F, 0F, -4F, -2F, 1F, -1F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[130].setRotationPoint(30F, -7F, -20F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -4F, -2F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 3F, -3F, 0F, 3F, -1F); // Box 17
		bodyModel[131].setRotationPoint(30F, -14F, -12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 3F, -3F, 0F, 3F, -1F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -4F, -2F, 0F, -4F, -1F); // Box 18
		bodyModel[132].setRotationPoint(30F, -7F, -12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[133].setRotationPoint(30F, -14F, 12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[134].setRotationPoint(30F, -7F, 12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -4F, -2F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 3F, -3F, 0F, 3F, -1F); // Box 21
		bodyModel[135].setRotationPoint(30F, -14F, 16F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 3F, -3F, 0F, 3F, -1F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -4F, -2F, 0F, -4F, -1F); // Box 22
		bodyModel[136].setRotationPoint(30F, -7F, 16F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, -4F, -1F, 0F, -4F, -2F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, -1F, 3F, -3F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 23
		bodyModel[137].setRotationPoint(30F, -14F, 8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F, 0F, 3F, -1F, -1F, 3F, -3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -4F, -1F, 0F, -4F, -2F, 1F, -1F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[138].setRotationPoint(30F, -7F, 8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 25
		bodyModel[139].setRotationPoint(-14F, -12F, -39F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 17, 4, 9, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 26
		bodyModel[140].setRotationPoint(-14F, -12F, 30F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 25, 5, 9, 0F, 0F, -1F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -6F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[141].setRotationPoint(3F, -12F, -39F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 25, 5, 9, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -6F, -3F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[142].setRotationPoint(3F, -12F, 30F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 57
		bodyModel[143].setRotationPoint(-73F, -1F, -1F);
		bodyModel[143].rotateAngleZ = -0.01745329F;


		tailModel = new ModelRendererTurbo[10];
		tailModel[0] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 23
		tailModel[1] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 24
		tailModel[2] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 26
		tailModel[3] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 47
		tailModel[4] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 48
		tailModel[5] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 49
		tailModel[6] = new ModelRendererTurbo(this, 25, 249, textureX, textureY); // Box 50
		tailModel[7] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Box 51
		tailModel[8] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 52
		tailModel[9] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 53

		tailModel[0].addShapeBox(0F, 0F, 0F, 26, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 23
		tailModel[0].setRotationPoint(69F, -19F, -3F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 24
		tailModel[1].setRotationPoint(69F, -21F, -3F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -1F); // Box 26
		tailModel[2].setRotationPoint(69F, -13F, -3F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 17, 28, 1, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 47
		tailModel[3].setRotationPoint(69F, -49F, -0.5F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[4].setRotationPoint(76F, -52F, -0.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 8, 32, 1, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[5].setRotationPoint(86F, -52F, -0.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 9, 1, 37, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 50
		tailModel[6].setRotationPoint(71F, -28F, -37F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 37, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		tailModel[7].setRotationPoint(71F, -28F, 0F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 36, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[8].setRotationPoint(80F, -28F, -37F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 53
		tailModel[9].setRotationPoint(80F, -28F, 1F);


		leftWingModel = new ModelRendererTurbo[9];
		leftWingModel[0] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 29
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 31
		leftWingModel[2] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 33
		leftWingModel[3] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 35
		leftWingModel[4] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 36
		leftWingModel[5] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 37
		leftWingModel[6] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 38
		leftWingModel[7] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 43
		leftWingModel[8] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 44

		leftWingModel[0].addBox(0F, 0F, 0F, 5, 2, 48, 0F); // Box 29
		leftWingModel[0].setRotationPoint(-14F, -11F, -87F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 20, 2, 48, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		leftWingModel[1].setRotationPoint(-9F, -11F, -87F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 11, 2, 48, 0F, 12F, 0F, 0F, -18F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -18F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 33
		leftWingModel[2].setRotationPoint(11F, -11F, -87F);

		leftWingModel[3].addFlexTrapezoid(0F, 0F, 0F, 27, 4, 9, 0F, 0F, 0.00F, -2.00F, -2.00F, -2.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 35
		leftWingModel[3].setRotationPoint(-27F, -14F, -96F);

		leftWingModel[4].addFlexTrapezoid(0F, 0F, 0F, 27, 4, 9, 0F, 0F, 0.00F, -2.00F, -2.00F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 36
		leftWingModel[4].setRotationPoint(-27F, -10F, -96F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F, -2F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 37
		leftWingModel[5].setRotationPoint(-35F, -14F, -96F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -1F, -3F); // Box 38
		leftWingModel[6].setRotationPoint(-35F, -10F, -96F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 19, 4, 9, 0F, 0F, 0F, -2F, -8F, -2F, -4F, -8F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 43
		leftWingModel[7].setRotationPoint(0F, -14F, -96F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 19, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, -2F, -4F, -8F, -2F, -4F, 0F, 0F, -2F); // Box 44
		leftWingModel[8].setRotationPoint(0F, -10F, -96F);


		rightWingModel = new ModelRendererTurbo[9];
		rightWingModel[0] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 30
		rightWingModel[1] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 32
		rightWingModel[2] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 34
		rightWingModel[3] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 39
		rightWingModel[4] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 40
		rightWingModel[5] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 41
		rightWingModel[6] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 42
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 45
		rightWingModel[8] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 46

		rightWingModel[0].addBox(0F, 0F, 0F, 5, 2, 48, 0F); // Box 30
		rightWingModel[0].setRotationPoint(-14F, -11F, 39F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 20, 2, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightWingModel[1].setRotationPoint(-9F, -11F, 39F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 11, 2, 48, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -18F, -1F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -18F, -1F, 0F, 12F, 0F, 0F); // Box 34
		rightWingModel[2].setRotationPoint(11F, -11F, 39F);

		rightWingModel[3].addFlexTrapezoid(0F, 0F, 0F, 27, 4, 9, 0F, 0F, 0.00F, -2.00F, -2.00F, -2.00F, -2.00F, ModelRendererTurbo.MR_TOP); // Box 39
		rightWingModel[3].setRotationPoint(-27F, -14F, 87F);

		rightWingModel[4].addFlexTrapezoid(0F, 0F, 0F, 27, 4, 9, 0F, 0F, 0.00F, -2.00F, -2.00F, -2.00F, -2.00F, ModelRendererTurbo.MR_BOTTOM); // Box 40
		rightWingModel[4].setRotationPoint(-27F, -10F, 87F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F, -2F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 41
		rightWingModel[5].setRotationPoint(-35F, -14F, 87F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -1F, -3F); // Box 42
		rightWingModel[6].setRotationPoint(-35F, -10F, 87F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 19, 4, 9, 0F, 0F, 0F, -2F, -8F, -2F, -4F, -8F, -2F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 45
		rightWingModel[7].setRotationPoint(0F, -14F, 87F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 19, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -8F, -2F, -4F, -8F, -2F, -4F, 0F, 0F, -2F); // Box 46
		rightWingModel[8].setRotationPoint(0F, -10F, 87F);


		bodyWheelModel = new ModelRendererTurbo[13];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 54
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 55
		bodyWheelModel[2] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 56
		bodyWheelModel[3] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 58
		bodyWheelModel[4] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 59
		bodyWheelModel[5] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 60
		bodyWheelModel[6] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 61
		bodyWheelModel[7] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 62
		bodyWheelModel[8] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 63
		bodyWheelModel[9] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 64
		bodyWheelModel[10] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 65
		bodyWheelModel[11] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 66
		bodyWheelModel[12] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 67

		bodyWheelModel[0].addBox(0F, 0F, 0F, 7, 7, 2, 0F); // Box 54
		bodyWheelModel[0].setRotationPoint(-76F, 3F, -1F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 55
		bodyWheelModel[1].setRotationPoint(-73F, 2F, -2F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 1, 5, 2, 0F); // Box 56
		bodyWheelModel[2].setRotationPoint(-76F, -1F, -1F);
		bodyWheelModel[2].rotateAngleZ = 0.55850536F;

		bodyWheelModel[3].addBox(0F, 0F, 0F, 20, 4, 1, 0F); // Box 58
		bodyWheelModel[3].setRotationPoint(-76F, -2F, -3F);
		bodyWheelModel[3].rotateAngleZ = -0.01745329F;

		bodyWheelModel[4].addBox(0F, 0F, 0F, 20, 4, 1, 0F); // Box 59
		bodyWheelModel[4].setRotationPoint(-76F, -2F, 2F);
		bodyWheelModel[4].rotateAngleZ = -0.01745329F;

		bodyWheelModel[5].addBox(0F, 0F, 0F, 8, 8, 2, 0F); // Box 60
		bodyWheelModel[5].setRotationPoint(-8F, 1F, -31F);

		bodyWheelModel[6].addBox(0F, 0F, 0F, 4, 6, 2, 0F); // Box 61
		bodyWheelModel[6].setRotationPoint(-6F, 0F, -30F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 62
		bodyWheelModel[7].setRotationPoint(-5F, -9F, -30F);

		bodyWheelModel[8].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 63
		bodyWheelModel[8].setRotationPoint(-5F, -9F, -35F);
		bodyWheelModel[8].rotateAngleX = 0.57595865F;

		bodyWheelModel[9].addBox(0F, 0F, 0F, 8, 8, 2, 0F); // Box 64
		bodyWheelModel[9].setRotationPoint(-8F, 1F, 29F);

		bodyWheelModel[10].addBox(0F, 0F, 0F, 4, 6, 2, 0F); // Box 65
		bodyWheelModel[10].setRotationPoint(-6F, 0F, 28F);

		bodyWheelModel[11].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 66
		bodyWheelModel[11].setRotationPoint(-5F, -9F, 29F);

		bodyWheelModel[12].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 67
		bodyWheelModel[12].setRotationPoint(-5F, -9F, 34F);
		bodyWheelModel[12].rotateAngleX = -0.57595865F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}