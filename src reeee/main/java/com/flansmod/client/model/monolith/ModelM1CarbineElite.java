//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.04.2016 - 22:08:51
// Last changed on: 06.04.2016 - 22:08:51

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM1CarbineElite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM1CarbineElite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[117];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 17
		gunModel[9] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 18
		gunModel[10] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 19
		gunModel[11] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 20
		gunModel[12] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 21
		gunModel[13] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 22
		gunModel[14] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 23
		gunModel[15] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 24
		gunModel[16] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 26
		gunModel[17] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 27
		gunModel[18] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 28
		gunModel[19] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 29
		gunModel[20] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 30
		gunModel[21] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 31
		gunModel[22] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 32
		gunModel[23] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 33
		gunModel[24] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 34
		gunModel[25] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 35
		gunModel[26] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 36
		gunModel[27] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 37
		gunModel[28] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 38
		gunModel[29] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 39
		gunModel[30] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 40
		gunModel[31] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 42
		gunModel[32] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 43
		gunModel[33] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 44
		gunModel[34] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 45
		gunModel[35] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 46
		gunModel[36] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 47
		gunModel[37] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 48
		gunModel[38] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 49
		gunModel[39] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 50
		gunModel[40] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 52
		gunModel[41] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 53
		gunModel[42] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 54
		gunModel[43] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 55
		gunModel[44] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 56
		gunModel[45] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 57
		gunModel[46] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 58
		gunModel[47] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 59
		gunModel[48] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 60
		gunModel[49] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 61
		gunModel[50] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 62
		gunModel[51] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 63
		gunModel[52] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 64
		gunModel[53] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 65
		gunModel[54] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 66
		gunModel[55] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 67
		gunModel[56] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 68
		gunModel[57] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 70
		gunModel[58] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 71
		gunModel[59] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 72
		gunModel[60] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 73
		gunModel[61] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 74
		gunModel[62] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 75
		gunModel[63] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 76
		gunModel[64] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 77
		gunModel[65] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 79
		gunModel[66] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 80
		gunModel[67] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 78
		gunModel[68] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 79
		gunModel[69] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 80
		gunModel[70] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 81
		gunModel[71] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 82
		gunModel[72] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 83
		gunModel[73] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 84
		gunModel[74] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		gunModel[75] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 87
		gunModel[76] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 88
		gunModel[77] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 89
		gunModel[78] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 90
		gunModel[79] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 91
		gunModel[80] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 92
		gunModel[81] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 93
		gunModel[82] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 94
		gunModel[83] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 95
		gunModel[84] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 96
		gunModel[85] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 97
		gunModel[86] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 98
		gunModel[87] = new ModelRendererTurbo(this, 137, 257, textureX, textureY); // Box 99
		gunModel[88] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 100
		gunModel[89] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 101
		gunModel[90] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 102
		gunModel[91] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 103
		gunModel[92] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 104
		gunModel[93] = new ModelRendererTurbo(this, 441, 257, textureX, textureY); // Box 105
		gunModel[94] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 106
		gunModel[95] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 107
		gunModel[96] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 108
		gunModel[97] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Box 109
		gunModel[98] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 110
		gunModel[99] = new ModelRendererTurbo(this, 265, 265, textureX, textureY); // Box 111
		gunModel[100] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 112
		gunModel[101] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 113
		gunModel[102] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 114
		gunModel[103] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 115
		gunModel[104] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 116
		gunModel[105] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 117
		gunModel[106] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 118
		gunModel[107] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 119
		gunModel[108] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 120
		gunModel[109] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 121
		gunModel[110] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 122
		gunModel[111] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Box 123
		gunModel[112] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 136
		gunModel[113] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 137
		gunModel[114] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 138
		gunModel[115] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 139
		gunModel[116] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 140

		gunModel[0].addBox(0F, 0F, 0F, 67, 6, 8, 0F); // Box 0
		gunModel[0].setRotationPoint(67F, -54F, 2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 18, 19, 8, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(134F, -54F, 2F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 67, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 2
		gunModel[2].setRotationPoint(67F, -54F, 10F);

		gunModel[3].addBox(0F, 0F, 0F, 67, 4, 1, 0F); // Box 3
		gunModel[3].setRotationPoint(67F, -50F, 14F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 67, 12, 5, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 4
		gunModel[4].setRotationPoint(67F, -54F, -3F);

		gunModel[5].addBox(0F, 0F, 0F, 67, 4, 1, 0F); // Box 5
		gunModel[5].setRotationPoint(67F, -50F, -3F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, -3F, 0F, 4F, 0F); // Box 6
		gunModel[6].setRotationPoint(134F, -54F, 10F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, -3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(134F, -54F, -3F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 135, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[8].setRotationPoint(-1F, -45.8F, 14F);

		gunModel[9].addBox(0F, 0F, 0F, 67, 2, 1, 0F); // Box 18
		gunModel[9].setRotationPoint(67F, -46.8F, 13.5F);

		gunModel[10].addBox(0F, 0F, 0F, 67, 2, 1, 0F); // Box 19
		gunModel[10].setRotationPoint(67F, -46.8F, -2.5F);

		gunModel[11].addBox(0F, 0F, 0F, 135, 9, 1, 0F); // Box 20
		gunModel[11].setRotationPoint(-1F, -45.8F, -3F);

		gunModel[12].addBox(0F, 0F, 0F, 18, 7, 3, 0F); // Box 21
		gunModel[12].setRotationPoint(152F, -45.8F, 9F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 6F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 22
		gunModel[13].setRotationPoint(134F, -45.8F, 14F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 18, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 23
		gunModel[14].setRotationPoint(134F, -45.8F, -3F);

		gunModel[15].addBox(0F, 0F, 0F, 18, 7, 9, 0F); // Box 24
		gunModel[15].setRotationPoint(152F, -45.8F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 26
		gunModel[16].setRotationPoint(134F, -50F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 27
		gunModel[17].setRotationPoint(134F, -50F, 11F);

		gunModel[18].addBox(0F, 0F, 0F, 8, 7, 1, 0F); // Box 28
		gunModel[18].setRotationPoint(155F, -46F, 12F);

		gunModel[19].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 29
		gunModel[19].setRotationPoint(155F, -47F, 9F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[20].setRotationPoint(155F, -47F, 12F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[21].setRotationPoint(155F, -50F, 8F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[22].setRotationPoint(155F, -50F, 2F);

		gunModel[23].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 33
		gunModel[23].setRotationPoint(155F, -48F, 9F);

		gunModel[24].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 34
		gunModel[24].setRotationPoint(155F, -48F, 2F);

		gunModel[25].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 35
		gunModel[25].setRotationPoint(155F, -47F, 0F);

		gunModel[26].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 36
		gunModel[26].setRotationPoint(155F, -50F, 4F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 135, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 37
		gunModel[27].setRotationPoint(-1F, -36.8F, 9F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 135, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		gunModel[28].setRotationPoint(-1F, -36.8F, -3F);

		gunModel[29].addBox(0F, 0F, 0F, 78, 1, 6, 0F); // Box 39
		gunModel[29].setRotationPoint(56F, -31.8F, 3F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 18, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -8F, -3F, 0F, -6F, 0F); // Box 40
		gunModel[30].setRotationPoint(134F, -38.8F, 9F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 18, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[31].setRotationPoint(134F, -38.8F, -3F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[32].setRotationPoint(134F, -31.8F, 3F);

		gunModel[33].addBox(0F, 0F, 0F, 38, 1, 6, 0F); // Box 44
		gunModel[33].setRotationPoint(-1F, -31.8F, 3F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 45
		gunModel[34].setRotationPoint(170F, -45.8F, 9F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 3, 7, 9, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[35].setRotationPoint(170F, -45.8F, 0F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 47
		gunModel[36].setRotationPoint(170F, -42.8F, 0F);

		gunModel[37].addBox(0F, 0F, 0F, 8, 7, 1, 0F); // Box 48
		gunModel[37].setRotationPoint(155F, -46F, -1F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[38].setRotationPoint(155F, -47F, -1F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 16, 9, 18, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[39].setRotationPoint(-17F, -45.8F, -3F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 10, 11, 18, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[40].setRotationPoint(-27F, -42.8F, -3F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[41].setRotationPoint(-27F, -42.8F, 14F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 6, 13, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		gunModel[42].setRotationPoint(-33F, -38.8F, 14F);

		gunModel[43].addShapeBox(0F, 0F, 0F, 6, 6, 18, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[43].setRotationPoint(-33F, -38.8F, -3F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 6, 9, 18, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[44].setRotationPoint(-39F, -34.8F, -3F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 6, 10, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[45].setRotationPoint(-36F, -34.8F, -3F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		gunModel[46].setRotationPoint(-49F, -34.8F, 14F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 10, 2, 18, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[47].setRotationPoint(-49F, -34.8F, -3F);

		gunModel[48].addShapeBox(0F, 0F, 0F, 86, 15, 18, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[48].setRotationPoint(-135F, -35.8F, -3F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 86, 15, 2, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[49].setRotationPoint(-135F, -35.8F, 13F);

		gunModel[50].addShapeBox(0F, 0F, 0F, 38, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[50].setRotationPoint(-130F, -20.8F, 13F);

		gunModel[51].addShapeBox(0F, 0F, 0F, 38, 13, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Box 63
		gunModel[51].setRotationPoint(-130F, -0.800000000000001F, 13F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 43, 30, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[52].setRotationPoint(-92F, -20.8F, 13F);

		gunModel[53].addBox(0F, 0F, 0F, 5, 36, 2, 0F); // Box 65
		gunModel[53].setRotationPoint(-135F, -20.8F, 13F);

		gunModel[54].addBox(0F, 0F, 0F, 5, 36, 16, 0F); // Box 66
		gunModel[54].setRotationPoint(-135F, -20.8F, -3F);

		gunModel[55].addShapeBox(0F, 0F, 0F, 14, 29, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[55].setRotationPoint(-49F, -32.8F, 13F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 43, 30, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[56].setRotationPoint(-92F, -20.8F, -3F);

		gunModel[57].addShapeBox(0F, 0F, 0F, 19, 19, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[57].setRotationPoint(-35F, -19.8F, 13F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 26, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[58].setRotationPoint(-35F, -25.8F, 13F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 21, 11, 18, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		gunModel[59].setRotationPoint(-30F, -36.8F, -3F);

		gunModel[60].addShapeBox(0F, 0F, 0F, 14, 29, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 73
		gunModel[60].setRotationPoint(-49F, -32.8F, -3F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 16, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 74
		gunModel[61].setRotationPoint(-17F, -36.8F, -3F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 19, 19, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[62].setRotationPoint(-35F, -19.8F, -3F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 26, 6, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[63].setRotationPoint(-35F, -25.8F, -3F);

		gunModel[64].addShapeBox(0F, 0F, 0F, 25, 29, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F); // Box 77
		gunModel[64].setRotationPoint(-117F, -24.8F, -3F);

		gunModel[65].addShapeBox(0F, 0F, 0F, 38, 9, 16, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Box 79
		gunModel[65].setRotationPoint(-130F, 3.2F, -3F);

		gunModel[66].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Box 80
		gunModel[66].setRotationPoint(170F, -43.8F, 2F);

		gunModel[67].addShapeBox(0F, 0F, 0F, 14, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 78
		gunModel[67].setRotationPoint(19F, -31.8F, 4F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 79
		gunModel[68].setRotationPoint(23F, -25.8F, 4F);

		gunModel[69].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 80
		gunModel[69].setRotationPoint(14F, -21.8F, 4F);

		gunModel[70].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 81
		gunModel[70].setRotationPoint(10F, -20.8F, 4F);

		gunModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 82
		gunModel[71].setRotationPoint(6F, -20.8F, 4F);

		gunModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 83
		gunModel[72].setRotationPoint(5F, -27.8F, 4F);

		gunModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 84
		gunModel[73].setRotationPoint(5F, -30.8F, 4F);

		gunModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 86
		gunModel[74].setRotationPoint(9F, -30.8F, 5.5F);

		gunModel[75].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 87
		gunModel[75].setRotationPoint(9F, -27.8F, 5.5F);

		gunModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, -1F, 0F); // Box 88
		gunModel[76].setRotationPoint(9F, -24.8F, 5.5F);

		gunModel[77].addBox(0F, 0F, 0F, 5, 1, 6, 0F); // Box 89
		gunModel[77].setRotationPoint(62F, -49F, 3F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[78].setRotationPoint(62F, -49F, 9F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[79].setRotationPoint(62F, -49F, 0F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[80].setRotationPoint(62F, -46F, 12F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[81].setRotationPoint(62F, -46F, -2F);

		gunModel[82].addBox(0F, 0F, 0F, 40, 1, 4, 0F); // Box 94
		gunModel[82].setRotationPoint(24F, -48F, 4F);

		gunModel[83].addBox(0F, 0F, 0F, 40, 1, 4, 0F); // Box 95
		gunModel[83].setRotationPoint(24F, -43F, 4F);

		gunModel[84].addBox(0F, 0F, 0F, 40, 4, 1, 0F); // Box 96
		gunModel[84].setRotationPoint(24F, -47F, 3F);

		gunModel[85].addBox(0F, 0F, 0F, 40, 4, 1, 0F); // Box 97
		gunModel[85].setRotationPoint(24F, -47F, 8F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[86].setRotationPoint(24F, -48F, 8F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 99
		gunModel[87].setRotationPoint(24F, -43F, 8F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[88].setRotationPoint(24F, -43F, 3F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 40, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[89].setRotationPoint(24F, -48F, 3F);

		gunModel[90].addBox(0F, 0F, 0F, 44, 2, 17, 0F); // Box 102
		gunModel[90].setRotationPoint(24F, -46F, -2F);

		gunModel[91].addBox(0F, 0F, 0F, 6, 5, 16, 0F); // Box 103
		gunModel[91].setRotationPoint(18F, -49F, -2F);

		gunModel[92].addShapeBox(0F, 0F, 0F, 2, 7, 16, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[92].setRotationPoint(16F, -51F, -2F);

		gunModel[93].addShapeBox(0F, 0F, 0F, 11, 7, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[93].setRotationPoint(5F, -51F, -2F);

		gunModel[94].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[94].setRotationPoint(2F, -58F, 1F);

		gunModel[95].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[95].setRotationPoint(2F, -58F, 9F);

		gunModel[96].addShapeBox(0F, 0F, 0F, 5, 7, 16, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		gunModel[96].setRotationPoint(0F, -51F, -2F);

		gunModel[97].addBox(0F, 0F, 0F, 5, 2, 16, 0F); // Box 109
		gunModel[97].setRotationPoint(-1F, -47F, -2F);

		gunModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[98].setRotationPoint(-2F, -47F, -2F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[99].setRotationPoint(-3F, -46F, -2F);

		gunModel[100].addShapeBox(0F, 0F, 0F, 12, 8, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		gunModel[100].setRotationPoint(2F, -54F, 1F);

		gunModel[101].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 113
		gunModel[101].setRotationPoint(3F, -57F, 5.5F);

		gunModel[102].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 114
		gunModel[102].setRotationPoint(3F, -58F, 4F);

		gunModel[103].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 115
		gunModel[103].setRotationPoint(3F, -62F, 4F);

		gunModel[104].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 116
		gunModel[104].setRotationPoint(3F, -61F, 8F);

		gunModel[105].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 117
		gunModel[105].setRotationPoint(3F, -61F, 3F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[106].setRotationPoint(3F, -58F, 3F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[107].setRotationPoint(3F, -62F, 3F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[108].setRotationPoint(3F, -62F, 8F);

		gunModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 121
		gunModel[109].setRotationPoint(3F, -58F, 8F);

		gunModel[110].addShapeBox(0F, 0F, 0F, 43, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[110].setRotationPoint(-92F, -4.8F, -1F);

		gunModel[111].addBox(0F, 0F, 0F, 7, 36, 1, 0F); // Box 123
		gunModel[111].setRotationPoint(-132F, -24.8F, -3F);

		gunModel[112].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 136
		gunModel[112].setRotationPoint(151F, -52F, 2F);

		gunModel[113].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 137
		gunModel[113].setRotationPoint(151F, -52F, 9F);

		gunModel[114].addBox(0F, 0F, 0F, 8, 1, 12, 0F); // Box 138
		gunModel[114].setRotationPoint(155F, -39F, 0F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		gunModel[115].setRotationPoint(155F, -39F, -1F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 140
		gunModel[116].setRotationPoint(155F, -39F, 12F);


		defaultBarrelModel = new ModelRendererTurbo[20];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 8
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 9
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 10
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 11
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 12
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 13
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 14
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 15
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 124
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 125
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 126
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 127
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 128
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 129
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 130
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 131
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 132
		defaultBarrelModel[17] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 133
		defaultBarrelModel[18] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 134
		defaultBarrelModel[19] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 135

		defaultBarrelModel[0].addShapeBox(0F, 0F, 0F, 100, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		defaultBarrelModel[0].setRotationPoint(151F, -49F, 4F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 100, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		defaultBarrelModel[1].setRotationPoint(151F, -44F, 4F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, 0F, 100, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		defaultBarrelModel[2].setRotationPoint(151F, -48F, 8F);

		defaultBarrelModel[3].addShapeBox(0F, 0F, 0F, 100, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		defaultBarrelModel[3].setRotationPoint(151F, -49F, 8F);

		defaultBarrelModel[4].addShapeBox(0F, 0F, 0F, 100, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 12
		defaultBarrelModel[4].setRotationPoint(151F, -44F, 8F);

		defaultBarrelModel[5].addShapeBox(0F, 0F, 0F, 100, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		defaultBarrelModel[5].setRotationPoint(151F, -44F, 3F);

		defaultBarrelModel[6].addShapeBox(0F, 0F, 0F, 100, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		defaultBarrelModel[6].setRotationPoint(151F, -48F, 3F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, 0F, 100, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		defaultBarrelModel[7].setRotationPoint(151F, -49F, 3F);

		defaultBarrelModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		defaultBarrelModel[8].setRotationPoint(240F, -50F, 4F);

		defaultBarrelModel[9].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		defaultBarrelModel[9].setRotationPoint(239F, -50F, 8F);

		defaultBarrelModel[10].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		defaultBarrelModel[10].setRotationPoint(239F, -47F, 9F);

		defaultBarrelModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 127
		defaultBarrelModel[11].setRotationPoint(239F, -44F, 8F);

		defaultBarrelModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		defaultBarrelModel[12].setRotationPoint(239F, -44F, 4F);

		defaultBarrelModel[13].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		defaultBarrelModel[13].setRotationPoint(239F, -44F, 2F);

		defaultBarrelModel[14].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		defaultBarrelModel[14].setRotationPoint(239F, -47F, 2F);

		defaultBarrelModel[15].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		defaultBarrelModel[15].setRotationPoint(239F, -50F, 2F);

		defaultBarrelModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		defaultBarrelModel[16].setRotationPoint(241F, -54F, 4F);

		defaultBarrelModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		defaultBarrelModel[17].setRotationPoint(241F, -54F, 7F);

		defaultBarrelModel[18].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		defaultBarrelModel[18].setRotationPoint(239F, -54F, 7F);

		defaultBarrelModel[19].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		defaultBarrelModel[19].setRotationPoint(239F, -54F, 4F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 81
		ammoModel[1] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 82
		ammoModel[2] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 83

		ammoModel[0].addBox(0F, 0F, 0F, 6, 31, 6, 0F); // Box 81
		ammoModel[0].setRotationPoint(50F, -31.8F, 3F);

		ammoModel[1].addBox(0F, 0F, 0F, 13, 33, 10, 0F); // Box 82
		ammoModel[1].setRotationPoint(37F, -33.8F, 1F);

		ammoModel[2].addBox(0F, 0F, 0F, 4, 31, 6, 0F); // Box 83
		ammoModel[2].setRotationPoint(33F, -31.8F, 3F);



		translateAll(0F, -10F, -6F);
		animationType = EnumAnimationType.BOTTOM_CLIP;


		flipAll();
	}
}