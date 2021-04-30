//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.04.2016 - 21:43:58
// Last changed on: 04.04.2016 - 21:43:58

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPiatElite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPiatElite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[122];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 19
		gunModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		gunModel[20] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 21
		gunModel[21] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 22
		gunModel[22] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 23
		gunModel[23] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 24
		gunModel[24] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 25
		gunModel[25] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 26
		gunModel[26] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 27
		gunModel[27] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 28
		gunModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 30
		gunModel[29] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 31
		gunModel[30] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 32
		gunModel[31] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 33
		gunModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 44
		gunModel[42] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 45
		gunModel[43] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 46
		gunModel[44] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 47
		gunModel[45] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 48
		gunModel[46] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 49
		gunModel[47] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 50
		gunModel[48] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 51
		gunModel[49] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 52
		gunModel[50] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 53
		gunModel[51] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 54
		gunModel[52] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 55
		gunModel[53] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 56
		gunModel[54] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 57
		gunModel[55] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 58
		gunModel[56] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 59
		gunModel[57] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 60
		gunModel[58] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 61
		gunModel[59] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 62
		gunModel[60] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 63
		gunModel[61] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 64
		gunModel[62] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 65
		gunModel[63] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 66
		gunModel[64] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 67
		gunModel[65] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 68
		gunModel[66] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 69
		gunModel[67] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 70
		gunModel[68] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 71
		gunModel[69] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 72
		gunModel[70] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 73
		gunModel[71] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 74
		gunModel[72] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 75
		gunModel[73] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 76
		gunModel[74] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 77
		gunModel[75] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 78
		gunModel[76] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 79
		gunModel[77] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 80
		gunModel[78] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 81
		gunModel[79] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 82
		gunModel[80] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 83
		gunModel[81] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 84
		gunModel[82] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 85
		gunModel[83] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 86
		gunModel[84] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 87
		gunModel[85] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 88
		gunModel[86] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 89
		gunModel[87] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 90
		gunModel[88] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 91
		gunModel[89] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 92
		gunModel[90] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 93
		gunModel[91] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 94
		gunModel[92] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 95
		gunModel[93] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 96
		gunModel[94] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 97
		gunModel[95] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 98
		gunModel[96] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 99
		gunModel[97] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 100
		gunModel[98] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 101
		gunModel[99] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		gunModel[100] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 103
		gunModel[101] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 104
		gunModel[102] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 105
		gunModel[103] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 106
		gunModel[104] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 107
		gunModel[105] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 108
		gunModel[106] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 109
		gunModel[107] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 110
		gunModel[108] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 111
		gunModel[109] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 112
		gunModel[110] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 113
		gunModel[111] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 114
		gunModel[112] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 115
		gunModel[113] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 116
		gunModel[114] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 117
		gunModel[115] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 118
		gunModel[116] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 119
		gunModel[117] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 120
		gunModel[118] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 121
		gunModel[119] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 122
		gunModel[120] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 123
		gunModel[121] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 124

		gunModel[0].addBox(0F, 0F, 0F, 59, 1, 6, 0F); // Box 0
		gunModel[0].setRotationPoint(-37F, -30F, -4F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 59, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		gunModel[1].setRotationPoint(-37F, -30F, 2F);

		gunModel[2].addBox(0F, 0F, 0F, 59, 6, 1, 0F); // Box 2
		gunModel[2].setRotationPoint(-37F, -27F, 4F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 59, 3, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 3
		gunModel[3].setRotationPoint(-37F, -21F, 2F);

		gunModel[4].addBox(0F, 0F, 0F, 59, 1, 6, 0F); // Box 4
		gunModel[4].setRotationPoint(-37F, -19F, -4F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 59, 3, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(-37F, -21F, -7F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 59, 3, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6
		gunModel[6].setRotationPoint(-37F, -30F, -7F);

		gunModel[7].addBox(0F, 0F, 0F, 59, 6, 1, 0F); // Box 7
		gunModel[7].setRotationPoint(-37F, -27F, -7F);

		gunModel[8].addBox(0F, 0F, 0F, 7, 5, 6, 0F); // Box 9
		gunModel[8].setRotationPoint(22F, -32F, -4F);

		gunModel[9].addBox(0F, 0F, 0F, 7, 3, 6, 0F); // Box 10
		gunModel[9].setRotationPoint(22F, -19F, -4F);

		gunModel[10].addBox(0F, 0F, 0F, 4, 6, 5, 0F); // Box 11
		gunModel[10].setRotationPoint(22F, -27F, -9F);

		gunModel[11].addBox(0F, 0F, 0F, 4, 6, 5, 0F); // Box 12
		gunModel[11].setRotationPoint(22F, -27F, 2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(22F, -32F, 2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 14
		gunModel[13].setRotationPoint(22F, -21F, 2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[14].setRotationPoint(22F, -21F, -9F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[15].setRotationPoint(22F, -32F, -9F);

		gunModel[16].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 17
		gunModel[16].setRotationPoint(22F, -25F, -11F);

		gunModel[17].addBox(0F, 0F, 0F, 18, 4, 6, 0F); // Box 18
		gunModel[17].setRotationPoint(-54F, -31F, -4F);

		gunModel[18].addBox(0F, 0F, 0F, 18, 2, 6, 0F); // Box 19
		gunModel[18].setRotationPoint(-54F, -19F, -4F);

		gunModel[19].addBox(0F, 0F, 0F, 18, 6, 2, 0F); // Box 20
		gunModel[19].setRotationPoint(-54F, -27F, 4F);

		gunModel[20].addBox(0F, 0F, 0F, 18, 6, 3, 0F); // Box 21
		gunModel[20].setRotationPoint(-54F, -27F, -8F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[21].setRotationPoint(-54F, -31F, 2F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 23
		gunModel[22].setRotationPoint(-54F, -21F, 2F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[23].setRotationPoint(-54F, -21F, -8F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[24].setRotationPoint(-54F, -31F, -8F);

		gunModel[25].addBox(0F, 0F, 0F, 22, 2, 6, 0F); // Box 26
		gunModel[25].setRotationPoint(-72F, -29F, -4F);

		gunModel[26].addBox(0F, 0F, 0F, 22, 2, 6, 0F); // Box 27
		gunModel[26].setRotationPoint(-72F, -21F, -4F);

		gunModel[27].addBox(0F, 0F, 0F, 22, 6, 2, 0F); // Box 28
		gunModel[27].setRotationPoint(-72F, -27F, -6F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[28].setRotationPoint(-72F, -29F, 2F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 31
		gunModel[29].setRotationPoint(-72F, -21F, 2F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[30].setRotationPoint(-72F, -21F, -6F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		gunModel[31].setRotationPoint(-72F, -29F, -6F);

		gunModel[32].addBox(0F, 0F, 0F, 22, 6, 2, 0F); // Box 35
		gunModel[32].setRotationPoint(-72F, -27F, 2F);

		gunModel[33].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 36
		gunModel[33].setRotationPoint(-68F, -30F, -4F);

		gunModel[34].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 37
		gunModel[34].setRotationPoint(-68F, -19F, -4F);

		gunModel[35].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 38
		gunModel[35].setRotationPoint(-68F, -27F, 4F);

		gunModel[36].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 39
		gunModel[36].setRotationPoint(-68F, -27F, -7F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[37].setRotationPoint(-68F, -30F, 2F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[38].setRotationPoint(-68F, -30F, -7F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[39].setRotationPoint(-68F, -21F, -7F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 43
		gunModel[40].setRotationPoint(-68F, -21F, 2F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 4, 32, 22, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[41].setRotationPoint(-72F, -40F, -12F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 2, 32, 22, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[42].setRotationPoint(-74F, -40F, -12F);

		gunModel[43].addBox(0F, 0F, 0F, 3, 11, 22, 0F); // Box 46
		gunModel[43].setRotationPoint(-77F, -31F, -12F);

		gunModel[44].addShapeBox(0F, 0F, 0F, 3, 8, 22, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[44].setRotationPoint(-77F, -39F, -12F);

		gunModel[45].addShapeBox(0F, 0F, 0F, 3, 12, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 48
		gunModel[45].setRotationPoint(-77F, -20F, -12F);

		gunModel[46].addShapeBox(0F, 0F, 0F, 1, 13, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 49
		gunModel[46].setRotationPoint(26F, -31F, 2F);

		gunModel[47].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 50
		gunModel[47].setRotationPoint(26F, -31F, 8F);

		gunModel[48].addBox(0F, 0F, 0F, 35, 10, 1, 0F); // Box 51
		gunModel[48].setRotationPoint(27F, -31F, 8F);

		gunModel[49].addShapeBox(0F, 0F, 0F, 35, 3, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 52
		gunModel[49].setRotationPoint(27F, -21F, 6F);

		gunModel[50].addBox(0F, 0F, 0F, 1, 12, 6, 0F); // Box 53
		gunModel[50].setRotationPoint(26F, -31F, -10F);

		gunModel[51].addBox(0F, 0F, 0F, 35, 10, 1, 0F); // Box 54
		gunModel[51].setRotationPoint(27F, -31F, -11F);

		gunModel[52].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[52].setRotationPoint(26F, -31F, -11F);

		gunModel[53].addShapeBox(0F, 0F, 0F, 35, 3, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		gunModel[53].setRotationPoint(27F, -21F, -11F);

		gunModel[54].addBox(0F, 0F, 0F, 35, 1, 14, 0F); // Box 57
		gunModel[54].setRotationPoint(27F, -19F, -8F);

		gunModel[55].addBox(0F, 0F, 0F, 9, 1, 4, 0F); // Box 58
		gunModel[55].setRotationPoint(2F, -30.5F, -3F);

		gunModel[56].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[56].setRotationPoint(2F, -35.5F, 1F);

		gunModel[57].addBox(0F, 0F, 0F, 3, 8, 1, 0F); // Box 60
		gunModel[57].setRotationPoint(5F, -35.5F, 1F);

		gunModel[58].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[58].setRotationPoint(8F, -35.5F, 1F);

		gunModel[59].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		gunModel[59].setRotationPoint(8F, -35.5F, 4F);

		gunModel[60].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 63
		gunModel[60].setRotationPoint(5F, -35.5F, 4F);

		gunModel[61].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		gunModel[61].setRotationPoint(2F, -35.5F, 4F);

		gunModel[62].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[62].setRotationPoint(2F, -34.5F, 1F);

		gunModel[63].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[63].setRotationPoint(10F, -34.5F, 1F);

		gunModel[64].addBox(0F, 0F, 0F, 11, 1, 4, 0F); // Box 67
		gunModel[64].setRotationPoint(-33F, -30.5F, -3F);

		gunModel[65].addBox(0F, 0F, 0F, 8, 7, 1, 0F); // Box 68
		gunModel[65].setRotationPoint(-33F, -35.5F, 1F);

		gunModel[66].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[66].setRotationPoint(-25F, -35.5F, 1F);

		gunModel[67].addBox(0F, 0F, 0F, 8, 9, 1, 0F); // Box 70
		gunModel[67].setRotationPoint(-33F, -35.5F, 4F);

		gunModel[68].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		gunModel[68].setRotationPoint(-25F, -35.5F, 4F);

		gunModel[69].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 72
		gunModel[69].setRotationPoint(-33F, -35.5F, 1F);

		gunModel[70].addBox(0F, 0F, 0F, 1, 8, 4, 0F); // Box 73
		gunModel[70].setRotationPoint(-23F, -34.5F, 1F);

		gunModel[71].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // Box 74
		gunModel[71].setRotationPoint(4F, -19F, -4F);

		gunModel[72].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // Box 75
		gunModel[72].setRotationPoint(-15F, -19F, -4F);

		gunModel[73].addBox(0F, 0F, 0F, 15, 5, 4, 0F); // Box 76
		gunModel[73].setRotationPoint(-11F, -19F, -3F);

		gunModel[74].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 77
		gunModel[74].setRotationPoint(22F, -19F, -2F);

		gunModel[75].addBox(0F, 0F, 0F, 1, 7, 2, 0F); // Box 78
		gunModel[75].setRotationPoint(27F, -19F, -2F);

		gunModel[76].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 79
		gunModel[76].setRotationPoint(24F, -19F, 1F);

		gunModel[77].addBox(0F, 0F, 0F, 2, 7, 1, 0F); // Box 80
		gunModel[77].setRotationPoint(24F, -19F, -4F);

		gunModel[78].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[78].setRotationPoint(22F, -19F, -4F);

		gunModel[79].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 82
		gunModel[79].setRotationPoint(22F, -19F, 0F);

		gunModel[80].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[80].setRotationPoint(26F, -19F, -4F);

		gunModel[81].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 84
		gunModel[81].setRotationPoint(26F, -19F, 0F);

		gunModel[82].addBox(0F, 0F, 0F, 1, 30, 2, 0F); // Box 85
		gunModel[82].setRotationPoint(26F, -19F, -2F);

		gunModel[83].addBox(0F, 0F, 0F, 1, 30, 2, 0F); // Box 86
		gunModel[83].setRotationPoint(23F, -19F, -2F);

		gunModel[84].addBox(0F, 0F, 0F, 2, 30, 1, 0F); // Box 87
		gunModel[84].setRotationPoint(24F, -19F, -3F);

		gunModel[85].addBox(0F, 0F, 0F, 2, 30, 1, 0F); // Box 88
		gunModel[85].setRotationPoint(24F, -19F, 0F);

		gunModel[86].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 89
		gunModel[86].setRotationPoint(23F, -19F, 0F);

		gunModel[87].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[87].setRotationPoint(23F, -19F, -3F);

		gunModel[88].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[88].setRotationPoint(26F, -19F, -3F);

		gunModel[89].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 92
		gunModel[89].setRotationPoint(26F, -19F, 0F);

		gunModel[90].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Box 93
		gunModel[90].setRotationPoint(7F, -16F, -3F);
		gunModel[90].rotateAngleZ = 0.57595865F;

		gunModel[91].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 94
		gunModel[91].setRotationPoint(8.5F, -13.8F, -3F);
		gunModel[91].rotateAngleZ = 0.26179939F;

		gunModel[92].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 95
		gunModel[92].setRotationPoint(9F, -12.15F, -3F);

		gunModel[93].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 96
		gunModel[93].setRotationPoint(9.1F, -8.6F, -3F);
		gunModel[93].rotateAngleZ = -0.43633231F;

		gunModel[94].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 97
		gunModel[94].setRotationPoint(7.65F, -5.3F, -3F);
		gunModel[94].rotateAngleZ = -0.80285146F;

		gunModel[95].addBox(0F, 0F, 0F, 20, 1, 4, 0F); // Box 98
		gunModel[95].setRotationPoint(-14.5F, -2.15F, -3F);
		gunModel[95].rotateAngleZ = 0.03490659F;

		gunModel[96].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 99
		gunModel[96].setRotationPoint(-15F, -15F, -3F);

		gunModel[97].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 100
		gunModel[97].setRotationPoint(-2F, -17F, 0.5F);
		gunModel[97].rotateAngleZ = -0.4712389F;

		gunModel[98].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 101
		gunModel[98].setRotationPoint(-6.1F, -9F, 0.5F);

		gunModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 102
		gunModel[99].setRotationPoint(-5.1F, -6F, 0.5F);
		gunModel[99].rotateAngleZ = 0.41887902F;

		gunModel[100].addBox(0F, 0F, 0F, 16, 1, 22, 0F); // Box 103
		gunModel[100].setRotationPoint(17F, 11F, -12F);

		gunModel[101].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[101].setRotationPoint(17F, 8F, -14F);

		gunModel[102].addShapeBox(0F, 0F, 0F, 16, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[102].setRotationPoint(17F, 8F, 10F);

		gunModel[103].addShapeBox(0F, 0F, 0F, 2, 4, 22, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[103].setRotationPoint(15F, 8F, -12F);

		gunModel[104].addShapeBox(0F, 0F, 0F, 2, 4, 22, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[104].setRotationPoint(33F, 8F, -12F);

		gunModel[105].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 108
		gunModel[105].setRotationPoint(15F, 8F, 10F);

		gunModel[106].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 109
		gunModel[106].setRotationPoint(33F, 8F, 10F);

		gunModel[107].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		gunModel[107].setRotationPoint(33F, 8F, -14F);

		gunModel[108].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		gunModel[108].setRotationPoint(15F, 8F, -14F);

		gunModel[109].addBox(0F, 0F, 0F, 2, 14, 4, 0F); // Box 112
		gunModel[109].setRotationPoint(-17F, -15F, -3F);

		gunModel[110].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 113
		gunModel[110].setRotationPoint(-13F, -15F, -3F);

		gunModel[111].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 114
		gunModel[111].setRotationPoint(-15F, -15F, 2F);

		gunModel[112].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 115
		gunModel[112].setRotationPoint(-15F, -15F, -5F);

		gunModel[113].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 116
		gunModel[113].setRotationPoint(-17F, -15F, 1F);

		gunModel[114].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 117
		gunModel[114].setRotationPoint(-14F, -15F, 1F);

		gunModel[115].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[115].setRotationPoint(-14F, -15F, -5F);

		gunModel[116].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[116].setRotationPoint(-17F, -15F, -5F);

		gunModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[117].setRotationPoint(61F, -34F, 7F);

		gunModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 121
		gunModel[118].setRotationPoint(61F, -34F, -11F);

		gunModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 122
		gunModel[119].setRotationPoint(61F, -36F, -9F);

		gunModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 123
		gunModel[120].setRotationPoint(61F, -36F, 4F);

		gunModel[121].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 124
		gunModel[121].setRotationPoint(61F, -36F, -6F);


		ammoModel = new ModelRendererTurbo[74];
		ammoModel[0] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 122
		ammoModel[1] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 123
		ammoModel[2] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 124
		ammoModel[3] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 125
		ammoModel[4] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 126
		ammoModel[5] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 127
		ammoModel[6] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 128
		ammoModel[7] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 129
		ammoModel[8] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 130
		ammoModel[9] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 131
		ammoModel[10] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 132
		ammoModel[11] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 133
		ammoModel[12] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 134
		ammoModel[13] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 135
		ammoModel[14] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 136
		ammoModel[15] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 137
		ammoModel[16] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 139
		ammoModel[17] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 140
		ammoModel[18] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 141
		ammoModel[19] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 142
		ammoModel[20] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 143
		ammoModel[21] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 144
		ammoModel[22] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 145
		ammoModel[23] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 146
		ammoModel[24] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 156
		ammoModel[25] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 157
		ammoModel[26] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 159
		ammoModel[27] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 160
		ammoModel[28] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 161
		ammoModel[29] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 162
		ammoModel[30] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 163
		ammoModel[31] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 164
		ammoModel[32] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 165
		ammoModel[33] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 166
		ammoModel[34] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 167
		ammoModel[35] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 168
		ammoModel[36] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 169
		ammoModel[37] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 171
		ammoModel[38] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 172
		ammoModel[39] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 173
		ammoModel[40] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 174
		ammoModel[41] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 175
		ammoModel[42] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 176
		ammoModel[43] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 178
		ammoModel[44] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 179
		ammoModel[45] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 180
		ammoModel[46] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 181
		ammoModel[47] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 182
		ammoModel[48] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 183
		ammoModel[49] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 184
		ammoModel[50] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 189
		ammoModel[51] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 191
		ammoModel[52] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 192
		ammoModel[53] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 193
		ammoModel[54] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 194
		ammoModel[55] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 195
		ammoModel[56] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 196
		ammoModel[57] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 197
		ammoModel[58] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 198
		ammoModel[59] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 199
		ammoModel[60] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 200
		ammoModel[61] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 201
		ammoModel[62] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 202
		ammoModel[63] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 203
		ammoModel[64] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 204
		ammoModel[65] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 205
		ammoModel[66] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 206
		ammoModel[67] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 207
		ammoModel[68] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 208
		ammoModel[69] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 209
		ammoModel[70] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 210
		ammoModel[71] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 211
		ammoModel[72] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 212
		ammoModel[73] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 213

		ammoModel[0].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 122
		ammoModel[0].setRotationPoint(34F, -32F, -5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 123
		ammoModel[1].setRotationPoint(34F, -32F, -8F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		ammoModel[2].setRotationPoint(34F, -23F, -8F);

		ammoModel[3].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 125
		ammoModel[3].setRotationPoint(34F, -28F, -8F);

		ammoModel[4].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 126
		ammoModel[4].setRotationPoint(34F, -20F, -5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 127
		ammoModel[5].setRotationPoint(34F, -23F, 3F);

		ammoModel[6].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 128
		ammoModel[6].setRotationPoint(34F, -28F, 5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 129
		ammoModel[7].setRotationPoint(34F, -32F, 3F);

		ammoModel[8].addBox(0F, 0F, 0F, 24, 5, 2, 0F); // Box 130
		ammoModel[8].setRotationPoint(32F, -28F, -2F);

		ammoModel[9].addBox(0F, 0F, 0F, 24, 1, 2, 0F); // Box 131
		ammoModel[9].setRotationPoint(32F, -23F, -2F);

		ammoModel[10].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 132
		ammoModel[10].setRotationPoint(32F, -26F, 1F);

		ammoModel[11].addBox(0F, 0F, 0F, 24, 2, 6, 0F); // Box 133
		ammoModel[11].setRotationPoint(32F, -26F, -4F);

		ammoModel[12].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 134
		ammoModel[12].setRotationPoint(32F, -28F, -4F);

		ammoModel[13].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 135
		ammoModel[13].setRotationPoint(32F, -28F, 0F);

		ammoModel[14].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 136
		ammoModel[14].setRotationPoint(32F, -25F, 0F);

		ammoModel[15].addShapeBox(0F, 0F, 0F, 24, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		ammoModel[15].setRotationPoint(32F, -25F, -4F);

		ammoModel[16].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		ammoModel[16].setRotationPoint(56F, -30F, -2F);

		ammoModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 140
		ammoModel[17].setRotationPoint(56F, -24F, -2F);

		ammoModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		ammoModel[18].setRotationPoint(56F, -26F, -6F);

		ammoModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 142
		ammoModel[19].setRotationPoint(56F, -26F, 0F);

		ammoModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 143
		ammoModel[20].setRotationPoint(56F, -30F, 0F);

		ammoModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 1F, 0F, -3F, -3F); // Box 144
		ammoModel[21].setRotationPoint(56F, -24F, 0F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 145
		ammoModel[22].setRotationPoint(56F, -24F, -6F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, 0F, -4F, -2F, 0F, -3F, 1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		ammoModel[23].setRotationPoint(56F, -30F, -6F);

		ammoModel[24].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		ammoModel[24].setRotationPoint(60F, -31F, -2F);

		ammoModel[25].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 157
		ammoModel[25].setRotationPoint(60F, -24F, -2F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 159
		ammoModel[26].setRotationPoint(60F, -32F, 0F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F, 0F, -5F, 0F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		ammoModel[27].setRotationPoint(60F, -32F, -7F);

		ammoModel[28].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 161
		ammoModel[28].setRotationPoint(60F, -24F, -7F);

		ammoModel[29].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, 0F); // Box 162
		ammoModel[29].setRotationPoint(60F, -24F, 0F);

		ammoModel[30].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		ammoModel[30].setRotationPoint(60F, -26F, -7F);

		ammoModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 164
		ammoModel[31].setRotationPoint(60F, -26F, -2F);

		ammoModel[32].addBox(0F, 0F, 0F, 14, 14, 2, 0F); // Box 165
		ammoModel[32].setRotationPoint(65F, -32F, -2F);

		ammoModel[33].addBox(0F, 0F, 0F, 14, 2, 14, 0F); // Box 166
		ammoModel[33].setRotationPoint(65F, -26F, -8F);

		ammoModel[34].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		ammoModel[34].setRotationPoint(65F, -32F, -8F);

		ammoModel[35].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		ammoModel[35].setRotationPoint(65F, -32F, 0F);

		ammoModel[36].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 169
		ammoModel[36].setRotationPoint(65F, -24F, 0F);

		ammoModel[37].addBox(0F, 0F, 0F, 1, 16, 2, 0F); // Box 171
		ammoModel[37].setRotationPoint(73F, -33F, -2F);

		ammoModel[38].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 172
		ammoModel[38].setRotationPoint(73F, -26F, -9F);

		ammoModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		ammoModel[39].setRotationPoint(73F, -33F, -9F);

		ammoModel[40].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		ammoModel[40].setRotationPoint(73F, -24F, -9F);

		ammoModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 175
		ammoModel[41].setRotationPoint(73F, -24F, 0F);

		ammoModel[42].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		ammoModel[42].setRotationPoint(73F, -33F, 0F);

		ammoModel[43].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		ammoModel[43].setRotationPoint(79F, -32F, -2F);

		ammoModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 179
		ammoModel[44].setRotationPoint(79F, -23F, -2F);

		ammoModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		ammoModel[45].setRotationPoint(79F, -26F, -8F);

		ammoModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 181
		ammoModel[46].setRotationPoint(79F, -26F, 3F);

		ammoModel[47].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		ammoModel[47].setRotationPoint(79F, -32F, -8F);

		ammoModel[48].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 183
		ammoModel[48].setRotationPoint(78F, -26F, 1F);

		ammoModel[49].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 184
		ammoModel[49].setRotationPoint(78F, -26F, -5F);

		ammoModel[50].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		ammoModel[50].setRotationPoint(65F, -24F, -8F);

		ammoModel[51].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 191
		ammoModel[51].setRotationPoint(79F, -24F, -8F);

		ammoModel[52].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -6F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 1F, 0F); // Box 192
		ammoModel[52].setRotationPoint(79F, -33F, 0F);

		ammoModel[53].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, -3F, 0F, -5F, 0F); // Box 193
		ammoModel[53].setRotationPoint(79F, -24F, 0F);

		ammoModel[54].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		ammoModel[54].setRotationPoint(80F, -28F, -2F);

		ammoModel[55].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 195
		ammoModel[55].setRotationPoint(80F, -24F, -2F);

		ammoModel[56].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 196
		ammoModel[56].setRotationPoint(80F, -26F, 0F);

		ammoModel[57].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		ammoModel[57].setRotationPoint(80F, -26F, -4F);

		ammoModel[58].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		ammoModel[58].setRotationPoint(80F, -28F, -4F);

		ammoModel[59].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 199
		ammoModel[59].setRotationPoint(80F, -28F, 0F);

		ammoModel[60].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, 0F); // Box 200
		ammoModel[60].setRotationPoint(80F, -24F, 0F);

		ammoModel[61].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 201
		ammoModel[61].setRotationPoint(80F, -24F, -4F);

		ammoModel[62].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 202
		ammoModel[62].setRotationPoint(88F, -26F, 0F);

		ammoModel[63].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 203
		ammoModel[63].setRotationPoint(88F, -26F, -3F);

		ammoModel[64].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 204
		ammoModel[64].setRotationPoint(88F, -27F, -2F);

		ammoModel[65].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 205
		ammoModel[65].setRotationPoint(88F, -24F, -2F);

		ammoModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		ammoModel[66].setRotationPoint(88F, -27F, -3F);

		ammoModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		ammoModel[67].setRotationPoint(88F, -24F, -3F);

		ammoModel[68].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 208
		ammoModel[68].setRotationPoint(88F, -24F, 0F);

		ammoModel[69].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		ammoModel[69].setRotationPoint(88F, -27F, 0F);

		ammoModel[70].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		ammoModel[70].setRotationPoint(39F, -31.5F, -1.5F);

		ammoModel[71].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 211
		ammoModel[71].setRotationPoint(39F, -23.5F, -1.5F);

		ammoModel[72].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 212
		ammoModel[72].setRotationPoint(39F, -25.5F, 1.5F);

		ammoModel[73].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		ammoModel[73].setRotationPoint(39F, -25.5F, -7.5F);



		translateAll(0F, 0F, 0F);
		
		animationType = EnumAnimationType.END_LOADED;


		flipAll();
	}
}