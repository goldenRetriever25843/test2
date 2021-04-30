//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType99Cow extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelType99Cow() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[139];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Shape 38
		bodyModel[37] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Shape 42
		bodyModel[38] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Shape 43
		bodyModel[39] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Shape 44
		bodyModel[40] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Shape 45
		bodyModel[41] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Shape 46
		bodyModel[42] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Shape 47
		bodyModel[43] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Shape 48
		bodyModel[44] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Shape 49
		bodyModel[45] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Shape 50
		bodyModel[46] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Shape 51
		bodyModel[47] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Shape 52
		bodyModel[48] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Shape 53
		bodyModel[49] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Shape 54
		bodyModel[50] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Shape 55
		bodyModel[51] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Shape 56
		bodyModel[52] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 68
		bodyModel[63] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 905, 193, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 977, 201, textureX, textureY); // Box 92
		bodyModel[87] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Box 93
		bodyModel[88] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 94
		bodyModel[89] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 905, 225, textureX, textureY); // Box 97
		bodyModel[92] = new ModelRendererTurbo(this, 945, 249, textureX, textureY); // Box 98
		bodyModel[93] = new ModelRendererTurbo(this, 849, 265, textureX, textureY); // Box 99
		bodyModel[94] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 100
		bodyModel[95] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 101
		bodyModel[96] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 102
		bodyModel[97] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 104
		bodyModel[99] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 108
		bodyModel[103] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 109
		bodyModel[104] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 110
		bodyModel[105] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 111
		bodyModel[106] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 112
		bodyModel[107] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 113
		bodyModel[108] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 114
		bodyModel[109] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 115
		bodyModel[110] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 116
		bodyModel[111] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 117
		bodyModel[112] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 118
		bodyModel[113] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 119
		bodyModel[114] = new ModelRendererTurbo(this, 857, 265, textureX, textureY); // Box 120
		bodyModel[115] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 121
		bodyModel[116] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 123
		bodyModel[118] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 124
		bodyModel[119] = new ModelRendererTurbo(this, 553, 281, textureX, textureY); // Box 175
		bodyModel[120] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 176
		bodyModel[121] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 178
		bodyModel[122] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 182
		bodyModel[123] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 184
		bodyModel[124] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 188
		bodyModel[125] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 189
		bodyModel[126] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 190
		bodyModel[127] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 191
		bodyModel[128] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 192
		bodyModel[129] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 193
		bodyModel[130] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 194
		bodyModel[131] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 195
		bodyModel[132] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 196
		bodyModel[133] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 197
		bodyModel[134] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 198
		bodyModel[135] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 199
		bodyModel[136] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 200
		bodyModel[137] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 201
		bodyModel[138] = new ModelRendererTurbo(this, 649, 377, textureX, textureY); // Box 202

		bodyModel[0].addBox(0F, 0F, 0F, 165, 13, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-84F, -17F, 48.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 13, 1, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-106F, -17F, 48.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(81F, -17F, 48.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(99F, -17F, 48.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-84F, -4F, 48.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-57F, -4F, 48.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-29F, -4F, 48.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-1F, -4F, 48.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(25F, -4F, 48.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(52F, -4F, 48.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 165, 13, 1, 0F); // Box 10
		bodyModel[10].setRotationPoint(-84F, -17F, -49.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 13, 1, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-106F, -17F, -49.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 13, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(81F, -17F, -49.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(99F, -17F, -49.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-84F, -4F, -49.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-57F, -4F, -49.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-29F, -4F, -49.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-1F, -4F, -49.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(25F, -4F, -49.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(52F, -4F, -49.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 180, 1, 22, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-97F, -18F, 27.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 180, 1, 22, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-97F, -18F, -49.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 11, 15, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-98.5F, -17F, 32F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 9, 15, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-98.5F, -6F, 32F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 25, 10, 15, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-92.5F, 3F, 32F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 150, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(-70.5F, 13F, 32F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 24, 13, 15, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(76.5F, 0F, 32F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 8, 15, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(97.5F, -8F, 32F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 8, 15, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(93.5F, -16F, 32F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 8, 15, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(93.5F, -16F, -47F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 8, 15, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(97.5F, -8F, -47F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 24, 13, 15, 0F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(76.5F, 0F, -47F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 150, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-70.5F, 13F, -47F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 25, 10, 15, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-92.5F, 3F, -47F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 11, 15, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-98.5F, -17F, -47F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 9, 15, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-98.5F, -6F, -47F);

		bodyModel[36].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 38
		bodyModel[36].setRotationPoint(0F, 13F, 46F);

		bodyModel[37].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 42
		bodyModel[37].setRotationPoint(31F, 13F, 46F);

		bodyModel[38].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 43
		bodyModel[38].setRotationPoint(59F, 13F, 46F);

		bodyModel[39].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 44
		bodyModel[39].setRotationPoint(84F, 13F, 46F);

		bodyModel[40].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 45
		bodyModel[40].setRotationPoint(-31F, 13F, 46F);

		bodyModel[41].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 46
		bodyModel[41].setRotationPoint(-55F, 13F, 46F);

		bodyModel[42].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 13, 11, 11, 40, 13, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 47
		bodyModel[42].setRotationPoint(99F, -1F, 47F);

		bodyModel[43].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 13, 11, 11, 40, 13, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 48
		bodyModel[43].setRotationPoint(-83F, 1F, 47F);

		bodyModel[44].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 13, 11, 11, 40, 13, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 49
		bodyModel[44].setRotationPoint(99F, -1F, -32F);

		bodyModel[45].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 50
		bodyModel[45].setRotationPoint(84F, 13F, -33F);

		bodyModel[46].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 51
		bodyModel[46].setRotationPoint(59F, 13F, -33F);

		bodyModel[47].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 52
		bodyModel[47].setRotationPoint(31F, 13F, -33F);

		bodyModel[48].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 53
		bodyModel[48].setRotationPoint(0F, 13F, -33F);

		bodyModel[49].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 54
		bodyModel[49].setRotationPoint(-31F, 13F, -33F);

		bodyModel[50].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(5, 0, 5, 0), new Coord2D(14, 0, 14, 0), new Coord2D(19, 6, 19, 6), new Coord2D(19, 13, 19, 13), new Coord2D(14, 19, 14, 19), new Coord2D(5, 19, 5, 19), new Coord2D(0, 13, 0, 13), new Coord2D(0, 6, 0, 6) }), 13, 19, 19, 64, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,8 ,9 ,8 ,7 ,8 ,9}); // Shape 55
		bodyModel[50].setRotationPoint(-55F, 13F, -33F);

		bodyModel[51].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(8, 0, 8, 0), new Coord2D(11, 3, 11, 3), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8), new Coord2D(0, 3, 0, 3) }), 13, 11, 11, 40, 13, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,5 ,5 ,5 ,5 ,5 ,5}); // Shape 56
		bodyModel[51].setRotationPoint(-83F, 1F, -32F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 26, 14, 58, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[52].setRotationPoint(62.5F, -21F, -29F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 9, 58, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[53].setRotationPoint(88.5F, -13F, -29F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 16, 1, 22, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[54].setRotationPoint(83F, -18F, 27.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 1, 22, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[55].setRotationPoint(83F, -18F, -49.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 6, 22, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 61
		bodyModel[56].setRotationPoint(99F, -17F, 27.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 6, 22, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 62
		bodyModel[57].setRotationPoint(99F, -17F, -49.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 15, 8, 1, 0F); // Box 63
		bodyModel[58].setRotationPoint(75F, -17F, -28.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[59].setRotationPoint(90F, -17F, -29.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[60].setRotationPoint(90F, -17F, 27.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 15, 8, 1, 0F); // Box 67
		bodyModel[61].setRotationPoint(75F, -17F, 27.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 33, 14, 58, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[62].setRotationPoint(29.5F, -23F, -29F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 33, 14, 58, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[63].setRotationPoint(-3.5F, -24F, -29F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 35, 14, 58, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[64].setRotationPoint(-38.5F, -25F, -29F);

		bodyModel[65].addBox(0F, 0F, 0F, 53, 14, 58, 0F); // Box 71
		bodyModel[65].setRotationPoint(-91.5F, -25F, -29F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 13, 19, 58, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 72
		bodyModel[66].setRotationPoint(-104.5F, -25F, -29F);

		bodyModel[67].addBox(0F, 0F, 0F, 158, 13, 58, 0F); // Box 73
		bodyModel[67].setRotationPoint(-83.5F, -11F, -29F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 8, 58, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 74
		bodyModel[68].setRotationPoint(-101.5F, -6F, -29F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 14, 9, 58, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[69].setRotationPoint(74.5F, -7F, -29F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 21, 3, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[70].setRotationPoint(63F, -21F, 28.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 28, 5, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[71].setRotationPoint(32F, -23F, 28.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 34, 6, 20, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[72].setRotationPoint(-4F, -24F, 28.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 25, 7, 20, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-31F, -25F, 28.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 26, 7, 20, 0F); // Box 80
		bodyModel[74].setRotationPoint(-59F, -25F, 28.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 18, 7, 20, 0F); // Box 81
		bodyModel[75].setRotationPoint(-80F, -25F, 28.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 8, 21, 0F); // Box 82
		bodyModel[76].setRotationPoint(-62F, -26F, 28.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 8, 21, 0F); // Box 83
		bodyModel[77].setRotationPoint(-33F, -26F, 28.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 7, 21, 0F); // Box 84
		bodyModel[78].setRotationPoint(-6F, -25F, 28.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 6, 21, 0F); // Box 85
		bodyModel[79].setRotationPoint(30F, -24F, 28.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 4, 21, 0F); // Box 86
		bodyModel[80].setRotationPoint(60F, -22F, 28.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 31, 7, 20, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[81].setRotationPoint(-93F, -25F, -48.5F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 8, 21, 0F); // Box 88
		bodyModel[82].setRotationPoint(-62F, -26F, -49.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 26, 7, 20, 0F); // Box 89
		bodyModel[83].setRotationPoint(-59F, -25F, -48.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 25, 7, 20, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[84].setRotationPoint(-31F, -25F, -48.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 8, 21, 0F); // Box 91
		bodyModel[85].setRotationPoint(-33F, -26F, -49.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 2, 7, 21, 0F); // Box 92
		bodyModel[86].setRotationPoint(-6F, -25F, -49.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 34, 6, 20, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[87].setRotationPoint(-4F, -24F, -48.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 6, 21, 0F); // Box 94
		bodyModel[88].setRotationPoint(30F, -24F, -49.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 28, 5, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[89].setRotationPoint(32F, -23F, -48.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 4, 21, 0F); // Box 96
		bodyModel[90].setRotationPoint(60F, -22F, -49.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 21, 3, 20, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[91].setRotationPoint(63F, -21F, -48.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 7, 20, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[92].setRotationPoint(-106F, -17F, 28.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 9, 7, 20, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[93].setRotationPoint(-106F, -17F, -48.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[94].setRotationPoint(84F, -19F, 28.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[95].setRotationPoint(84F, -19F, 41.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[96].setRotationPoint(84F, -19F, -35.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 2, 7, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[97].setRotationPoint(84F, -19F, -48.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 13, 7, 9, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[98].setRotationPoint(-93F, -25F, 28.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 9, 4, 3, 0F); // Box 105
		bodyModel[99].setRotationPoint(-91F, -22F, 37.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 10, 5, 7, 0F); // Box 106
		bodyModel[100].setRotationPoint(-91F, -23F, 40.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 0, 2, 0F); // Box 107
		bodyModel[101].setRotationPoint(-87F, -18.05F, 47.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 4, 15, 0F); // Box 108
		bodyModel[102].setRotationPoint(-97F, -22F, 28.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 109
		bodyModel[103].setRotationPoint(-98F, -22F, 35F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 110
		bodyModel[104].setRotationPoint(-99F, -21F, 35F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 111
		bodyModel[105].setRotationPoint(-99F, -21F, 41F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 112
		bodyModel[106].setRotationPoint(-99F, -21F, 38F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 4, 15, 0F); // Box 113
		bodyModel[107].setRotationPoint(-102F, -17F, 28.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 4, 15, 0F); // Box 114
		bodyModel[108].setRotationPoint(-102F, -17F, -43.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 4, 15, 0F); // Box 115
		bodyModel[109].setRotationPoint(-97F, -22F, -43.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 116
		bodyModel[110].setRotationPoint(-98F, -22F, -43F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 117
		bodyModel[111].setRotationPoint(-99F, -21F, -43F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 118
		bodyModel[112].setRotationPoint(-99F, -21F, -40F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 119
		bodyModel[113].setRotationPoint(-99F, -21F, -37F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 2, 54, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[114].setRotationPoint(-102.5F, -22F, -27F);
		bodyModel[114].rotateAngleZ = 0.34906585F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 19, 2, 54, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[115].setRotationPoint(-90.5F, -26.5F, -27F);

		bodyModel[116].addBox(0F, 0F, 0F, 16, 2, 15, 0F); // Box 122
		bodyModel[116].setRotationPoint(-70.5F, -26.5F, -27F);

		bodyModel[117].addBox(0F, 0F, 0F, 16, 2, 15, 0F); // Box 123
		bodyModel[117].setRotationPoint(-70.5F, -26.5F, 12F);

		bodyModel[118].addBox(0F, 0F, 0F, 16, 2, 15, 0F); // Box 124
		bodyModel[118].setRotationPoint(-70.5F, -26.5F, -7.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 2, 9, 24, 0F); // Box 175
		bodyModel[119].setRotationPoint(-104.5F, -16F, -12F);
		bodyModel[119].rotateAngleZ = 0.15707963F;

		bodyModel[120].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 176
		bodyModel[120].setRotationPoint(78F, -20F, 16.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 178
		bodyModel[121].setRotationPoint(73F, -21F, 16.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 182
		bodyModel[122].setRotationPoint(78F, -20F, 23.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 184
		bodyModel[123].setRotationPoint(73F, -21F, 23.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 188
		bodyModel[124].setRotationPoint(75F, -20F, 17.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 189
		bodyModel[125].setRotationPoint(74F, -21F, 16.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 190
		bodyModel[126].setRotationPoint(74F, -21F, 23.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 191
		bodyModel[127].setRotationPoint(73F, -21F, 17.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 192
		bodyModel[128].setRotationPoint(78F, -21F, 17.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 193
		bodyModel[129].setRotationPoint(78F, -21F, -23.5F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 194
		bodyModel[130].setRotationPoint(74F, -21F, -17.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 195
		bodyModel[131].setRotationPoint(78F, -20F, -17.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 196
		bodyModel[132].setRotationPoint(78F, -20F, -24.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 197
		bodyModel[133].setRotationPoint(73F, -21F, -23.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 198
		bodyModel[134].setRotationPoint(74F, -21F, -24.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 199
		bodyModel[135].setRotationPoint(73F, -21F, -17.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 200
		bodyModel[136].setRotationPoint(73F, -21F, -24.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 201
		bodyModel[137].setRotationPoint(75F, -20F, -23.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 40, 2, 40, 0F); // Box 202
		bodyModel[138].setRotationPoint(-15.5F, -24F, -20F);


		turretModel = new ModelRendererTurbo[56];
		turretModel[0] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Box 125
		turretModel[1] = new ModelRendererTurbo(this, 545, 281, textureX, textureY); // Box 126
		turretModel[2] = new ModelRendererTurbo(this, 745, 281, textureX, textureY); // Box 127
		turretModel[3] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Box 128
		turretModel[4] = new ModelRendererTurbo(this, 681, 281, textureX, textureY); // Box 130
		turretModel[5] = new ModelRendererTurbo(this, 937, 281, textureX, textureY); // Box 131
		turretModel[6] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 133
		turretModel[7] = new ModelRendererTurbo(this, 809, 225, textureX, textureY); // Box 134
		turretModel[8] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 135
		turretModel[9] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 136
		turretModel[10] = new ModelRendererTurbo(this, 529, 281, textureX, textureY); // Box 137
		turretModel[11] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 138
		turretModel[12] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 139
		turretModel[13] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 140
		turretModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 141
		turretModel[15] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 142
		turretModel[16] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 143
		turretModel[17] = new ModelRendererTurbo(this, 737, 281, textureX, textureY); // Box 144
		turretModel[18] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 145
		turretModel[19] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 146
		turretModel[20] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 147
		turretModel[21] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 148
		turretModel[22] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 149
		turretModel[23] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 150
		turretModel[24] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 151
		turretModel[25] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 152
		turretModel[26] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 153
		turretModel[27] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 154
		turretModel[28] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 155
		turretModel[29] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 159
		turretModel[30] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 161
		turretModel[31] = new ModelRendererTurbo(this, 537, 361, textureX, textureY); // Box 162
		turretModel[32] = new ModelRendererTurbo(this, 689, 321, textureX, textureY); // Box 163
		turretModel[33] = new ModelRendererTurbo(this, 105, 329, textureX, textureY); // Box 164
		turretModel[34] = new ModelRendererTurbo(this, 281, 329, textureX, textureY); // Box 165
		turretModel[35] = new ModelRendererTurbo(this, 873, 329, textureX, textureY); // Box 166
		turretModel[36] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 167
		turretModel[37] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 168
		turretModel[38] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 169
		turretModel[39] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 170
		turretModel[40] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 171
		turretModel[41] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Box 172
		turretModel[42] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); // Box 173
		turretModel[43] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Box 174
		turretModel[44] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 203
		turretModel[45] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 204
		turretModel[46] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 205
		turretModel[47] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 206
		turretModel[48] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 207
		turretModel[49] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 208
		turretModel[50] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 209
		turretModel[51] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 210
		turretModel[52] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 211
		turretModel[53] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 212
		turretModel[54] = new ModelRendererTurbo(this, 681, 281, textureX, textureY); // Box 198
		turretModel[55] = new ModelRendererTurbo(this, 937, 281, textureX, textureY); // Box 199

		turretModel[0].addShapeBox(-15F, 0F, -36F, 23, 16, 72, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F); // Box 125
		turretModel[0].setRotationPoint(0F, -40F, 0F);

		turretModel[1].addShapeBox(-49F, 0F, -31F, 34, 16, 62, 0F, -2F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 126
		turretModel[1].setRotationPoint(0F, -40F, 0F);

		turretModel[2].addShapeBox(8F, 0F, -37F, 14, 16, 74, 0F, 0F, 0F, -6F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 127
		turretModel[2].setRotationPoint(0F, -40F, 0F);

		turretModel[3].addShapeBox(22F, 0F, -35F, 11, 16, 70, 0F, 0F, 0F, -7F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 128
		turretModel[3].setRotationPoint(0F, -40F, 0F);

		turretModel[4].addShapeBox(33F, 0F, 5F, 13, 8, 24, 0F, 0F, 0F, 0F, 5F, -7F, -1F, -5F, -7F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 5F, 0F, -1F, -5F, 0F, -4F, 0F, 0F, -0.5F); // Box 130
		turretModel[4].setRotationPoint(0F, -38F, 0F);

		turretModel[5].addShapeBox(33F, 0F, 5F, 13, 6, 26, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -5F, 0F, -6F, 0F, 0F, -2.5F, 0F, 0F, 0F, 5F, -5F, -1F, -4F, -6F, -5F, 0F, 0F, 0F); // Box 131
		turretModel[5].setRotationPoint(0F, -30F, 0F);

		turretModel[6].addShapeBox(33F, 0F, -5F, 14, 7, 10, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		turretModel[6].setRotationPoint(0F, -38F, 0F);

		turretModel[7].addShapeBox(33F, 0F, -5F, 14, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 134
		turretModel[7].setRotationPoint(0F, -31F, 0F);

		turretModel[8].addBox(-5F, 0F, -24F, 6, 3, 16, 0F); // Box 135
		turretModel[8].setRotationPoint(0F, -43F, 0F);

		turretModel[9].addShapeBox(-10F, 0F, -24F, 5, 3, 16, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 136
		turretModel[9].setRotationPoint(0F, -43F, 0F);

		turretModel[10].addShapeBox(1F, 0F, -24F, 5, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 137
		turretModel[10].setRotationPoint(0F, -43F, 0F);

		turretModel[11].addBox(-6F, 0F, -26F, 8, 3, 1, 0F); // Box 138
		turretModel[11].setRotationPoint(0F, -43F, 0F);

		turretModel[12].addBox(-6F, 0F, -7F, 8, 3, 1, 0F); // Box 139
		turretModel[12].setRotationPoint(0F, -43F, 0F);

		turretModel[13].addBox(7F, 0F, -20F, 1, 3, 8, 0F); // Box 140
		turretModel[13].setRotationPoint(0F, -43F, 0F);

		turretModel[14].addBox(-12F, 0F, -20F, 1, 3, 8, 0F); // Box 141
		turretModel[14].setRotationPoint(0F, -43F, 0F);

		turretModel[15].addShapeBox(12F, 0F, -20F, 6, 4, 8, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		turretModel[15].setRotationPoint(0F, -44F, 0F);

		turretModel[16].addBox(7F, 0F, 12F, 6, 4, 11, 0F); // Box 143
		turretModel[16].setRotationPoint(0F, -44F, 0F);

		turretModel[17].addBox(-12F, 0F, 6F, 14, 1, 17, 0F); // Box 144
		turretModel[17].setRotationPoint(0F, -41F, 0F);

		turretModel[18].addBox(2F, 0F, 6F, 2, 2, 17, 0F); // Box 145
		turretModel[18].setRotationPoint(0F, -42F, 0F);

		turretModel[19].addBox(-3F, 0F, 8F, 5, 1, 2, 0F); // Box 146
		turretModel[19].setRotationPoint(0F, -41.5F, 0F);

		turretModel[20].addBox(-3F, 0F, 19F, 5, 1, 2, 0F); // Box 147
		turretModel[20].setRotationPoint(0F, -41.5F, 0F);

		turretModel[21].addBox(5F, 0F, -26F, 1, 4, 1, 0F); // Box 148
		turretModel[21].setRotationPoint(0F, -47F, 0F);

		turretModel[22].addBox(1F, 0F, -26.5F, 9, 3, 2, 0F); // Box 149
		turretModel[22].setRotationPoint(0F, -50F, 0F);

		turretModel[23].addBox(10F, 0F, -26F, 7, 1, 1, 0F); // Box 150
		turretModel[23].setRotationPoint(0F, -49F, 0F);

		turretModel[24].addBox(2F, 0F, -26F, 1, 1, 1, 0F); // Box 151
		turretModel[24].setRotationPoint(0F, -51F, 0F);

		turretModel[25].addBox(7F, 0F, -26F, 2, 1, 1, 0F); // Box 152
		turretModel[25].setRotationPoint(0F, -50.5F, 0F);

		turretModel[26].addBox(4F, 0F, -24.5F, 2, 3, 3, 0F); // Box 153
		turretModel[26].setRotationPoint(0F, -49.5F, 0F);

		turretModel[27].addBox(4F, 0F, -24.5F, 2, 1, 1, 0F); // Box 154
		turretModel[27].setRotationPoint(0F, -50.5F, 0F);

		turretModel[28].addBox(4.5F, 0F, -26.5F, 2, 3, 2, 0F); // Box 155
		turretModel[28].setRotationPoint(0F, -43F, 0F);

		turretModel[29].addBox(-30F, 0F, -11F, 1, 14, 1, 0F); // Box 159
		turretModel[29].setRotationPoint(0F, -53F, 0F);

		turretModel[30].addShapeBox(-59F, 0F, 26F, 61, 14, 14, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -3F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -3F, -13F); // Box 161
		turretModel[30].setRotationPoint(0F, -39F, 0F);

		turretModel[31].addShapeBox(-59F, 0F, -40F, 61, 14, 14, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, -3F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, -3F, 0F); // Box 162
		turretModel[31].setRotationPoint(0F, -39F, 0F);

		turretModel[32].addBox(-59F, 0F, -26F, 1, 1, 52, 0F); // Box 163
		turretModel[32].setRotationPoint(0F, -39F, 0F);

		turretModel[33].addBox(-59F, 0F, -26F, 1, 1, 52, 0F); // Box 164
		turretModel[33].setRotationPoint(0F, -29F, 0F);

		turretModel[34].addBox(-59F, 0F, -26F, 1, 1, 52, 0F); // Box 165
		turretModel[34].setRotationPoint(0F, -32F, 0F);

		turretModel[35].addBox(-59F, 0F, -26F, 1, 1, 52, 0F); // Box 166
		turretModel[35].setRotationPoint(0F, -36F, 0F);

		turretModel[36].addBox(-59F, 0F, -18F, 1, 9, 1, 0F); // Box 167
		turretModel[36].setRotationPoint(0F, -38F, 0F);

		turretModel[37].addBox(-59F, 0F, 17F, 1, 9, 1, 0F); // Box 168
		turretModel[37].setRotationPoint(0F, -38F, 0F);

		turretModel[38].addBox(-59F, 0F, 5F, 1, 9, 1, 0F); // Box 169
		turretModel[38].setRotationPoint(0F, -38F, 0F);

		turretModel[39].addBox(-59F, 0F, -6F, 1, 9, 1, 0F); // Box 170
		turretModel[39].setRotationPoint(0F, -38F, 0F);

		turretModel[40].addBox(-11F, 0F, -37F, 1, 1, 74, 0F); // Box 171
		turretModel[40].setRotationPoint(0F, -37F, 0F);

		turretModel[41].addBox(-11F, 0F, -37F, 1, 1, 74, 0F); // Box 172
		turretModel[41].setRotationPoint(0F, -28F, 0F);

		turretModel[42].addBox(-32F, 0F, -32F, 1, 1, 64, 0F); // Box 173
		turretModel[42].setRotationPoint(0F, -28F, 0F);

		turretModel[43].addBox(-32F, 0F, -32F, 1, 1, 64, 0F); // Box 174
		turretModel[43].setRotationPoint(0F, -37F, 0F);

		turretModel[44].addBox(-20F, 0F, 17F, 5, 2, 5, 0F); // Box 203
		turretModel[44].setRotationPoint(0F, -42F, 0F);

		turretModel[45].addBox(-19F, 0F, 18F, 3, 3, 3, 0F); // Box 204
		turretModel[45].setRotationPoint(0F, -45F, 0F);

		turretModel[46].addBox(-23F, 0F, 16F, 10, 7, 7, 0F); // Box 205
		turretModel[46].setRotationPoint(0F, -52F, 0F);

		turretModel[47].addBox(-23F, 0F, 12F, 9, 7, 4, 0F); // Box 206
		turretModel[47].setRotationPoint(0F, -52F, 0F);

		turretModel[48].addBox(-25F, 0F, 23F, 11, 7, 4, 0F); // Box 207
		turretModel[48].setRotationPoint(0F, -52F, 0F);

		turretModel[49].addBox(-14F, 0F, 24F, 4, 2, 2, 0F); // Box 208
		turretModel[49].setRotationPoint(0F, -51F, 0F);

		turretModel[50].addBox(-14F, 0F, 13F, 1, 2, 2, 0F); // Box 209
		turretModel[50].setRotationPoint(0F, -51F, 0F);

		turretModel[51].addBox(-14F, 0F, 13F, 1, 2, 2, 0F); // Box 210
		turretModel[51].setRotationPoint(0F, -48F, 0F);

		turretModel[52].addBox(-59F, 0F, 17F, 12, 1, 1, 0F); // Box 211
		turretModel[52].setRotationPoint(0F, -34F, 0F);

		turretModel[53].addBox(-59F, 0F, -18F, 12, 1, 1, 0F); // Box 212
		turretModel[53].setRotationPoint(0F, -34F, 0F);

		turretModel[54].addShapeBox(33F, 0F, -29F, 13, 8, 24, 0F, 0F, 0F, -4F, -5F, -7F, -4F, 5F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5F, 0F, -4F, 5F, 0F, -1F, 0F, 0F, 0F); // Box 198
		turretModel[54].setRotationPoint(0F, -38F, 0F);

		turretModel[55].addShapeBox(33F, 0F, -29F, 13, 6, 26, 0F, 0F, 0F, -2.5F, -5F, 0F, -6F, 5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, -5F, 5F, -5F, -1F, 0F, 0F, 0F); // Box 199
		turretModel[55].setRotationPoint(0F, -30F, -2F);


		barrelModel = new ModelRendererTurbo[3];
		barrelModel[0] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Box 156
		barrelModel[1] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Box 157
		barrelModel[2] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 158

		barrelModel[0].addBox(6F, -2.5F, -2.5F, 43, 5, 5, 0F); // Box 156
		barrelModel[0].setRotationPoint(40F, -30F, 0F);

		barrelModel[1].addBox(75F, -2.5F, -2.5F, 44, 5, 5, 0F); // Box 157
		barrelModel[1].setRotationPoint(40F, -30F, 0F);

		barrelModel[2].addBox(49F, -3.5F, -3.5F, 26, 7, 7, 0F); // Box 158
		barrelModel[2].setRotationPoint(40F, -30F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}