//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAkula extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAkula() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[161];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 145, 273, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 209, 273, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 273, 273, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 73, 297, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 145, 297, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 313, 305, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 385, 313, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 441, 313, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 73, 321, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 369, 329, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 57, 273, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 201, 329, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 49, 345, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 97, 345, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 137, 345, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 169, 353, textureX, textureY); // Box 92
		bodyModel[87] = new ModelRendererTurbo(this, 273, 353, textureX, textureY); // Box 93
		bodyModel[88] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 94
		bodyModel[89] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 321, 353, textureX, textureY); // Box 97
		bodyModel[92] = new ModelRendererTurbo(this, 353, 353, textureX, textureY); // Box 98
		bodyModel[93] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 99
		bodyModel[94] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 100
		bodyModel[95] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 313
		bodyModel[96] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 314
		bodyModel[97] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 316
		bodyModel[98] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 104
		bodyModel[99] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 393, 353, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 433, 353, textureX, textureY); // Box 108
		bodyModel[103] = new ModelRendererTurbo(this, 473, 353, textureX, textureY); // Box 110
		bodyModel[104] = new ModelRendererTurbo(this, 81, 361, textureX, textureY); // Box 111
		bodyModel[105] = new ModelRendererTurbo(this, 217, 353, textureX, textureY); // Box 112
		bodyModel[106] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 113
		bodyModel[107] = new ModelRendererTurbo(this, 425, 289, textureX, textureY); // Box 114
		bodyModel[108] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 117
		bodyModel[109] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 118
		bodyModel[110] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Box 119
		bodyModel[111] = new ModelRendererTurbo(this, 361, 369, textureX, textureY); // Box 120
		bodyModel[112] = new ModelRendererTurbo(this, 25, 369, textureX, textureY); // Box 121
		bodyModel[113] = new ModelRendererTurbo(this, 169, 369, textureX, textureY); // Box 122
		bodyModel[114] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Box 123
		bodyModel[115] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Box 124
		bodyModel[116] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 125
		bodyModel[117] = new ModelRendererTurbo(this, 73, 385, textureX, textureY); // Box 126
		bodyModel[118] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 127
		bodyModel[119] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 128
		bodyModel[120] = new ModelRendererTurbo(this, 457, 369, textureX, textureY); // Box 129
		bodyModel[121] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 130
		bodyModel[122] = new ModelRendererTurbo(this, 201, 297, textureX, textureY); // Box 131
		bodyModel[123] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 134
		bodyModel[124] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 135
		bodyModel[125] = new ModelRendererTurbo(this, 241, 385, textureX, textureY); // Box 137
		bodyModel[126] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 138
		bodyModel[127] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 139
		bodyModel[128] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 140
		bodyModel[129] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 141
		bodyModel[130] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 142
		bodyModel[131] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 143
		bodyModel[132] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 144
		bodyModel[133] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 145
		bodyModel[134] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 146
		bodyModel[135] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 147
		bodyModel[136] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 148
		bodyModel[137] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 149
		bodyModel[138] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 150
		bodyModel[139] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 151
		bodyModel[140] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 152
		bodyModel[141] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 153
		bodyModel[142] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 154
		bodyModel[143] = new ModelRendererTurbo(this, 129, 297, textureX, textureY); // Box 155
		bodyModel[144] = new ModelRendererTurbo(this, 57, 321, textureX, textureY); // Box 156
		bodyModel[145] = new ModelRendererTurbo(this, 129, 321, textureX, textureY); // Box 157
		bodyModel[146] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 158
		bodyModel[147] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 159
		bodyModel[148] = new ModelRendererTurbo(this, 33, 345, textureX, textureY); // Box 160
		bodyModel[149] = new ModelRendererTurbo(this, 81, 345, textureX, textureY); // Box 161
		bodyModel[150] = new ModelRendererTurbo(this, 417, 353, textureX, textureY); // Box 162
		bodyModel[151] = new ModelRendererTurbo(this, 457, 353, textureX, textureY); // Box 163
		bodyModel[152] = new ModelRendererTurbo(this, 489, 369, textureX, textureY); // Box 164
		bodyModel[153] = new ModelRendererTurbo(this, 145, 385, textureX, textureY); // Box 165
		bodyModel[154] = new ModelRendererTurbo(this, 169, 385, textureX, textureY); // Box 166
		bodyModel[155] = new ModelRendererTurbo(this, 313, 385, textureX, textureY); // Box 167
		bodyModel[156] = new ModelRendererTurbo(this, 337, 385, textureX, textureY); // Box 168
		bodyModel[157] = new ModelRendererTurbo(this, 361, 385, textureX, textureY); // Box 169
		bodyModel[158] = new ModelRendererTurbo(this, 385, 385, textureX, textureY); // Box 170
		bodyModel[159] = new ModelRendererTurbo(this, 409, 385, textureX, textureY); // Box 171
		bodyModel[160] = new ModelRendererTurbo(this, 433, 385, textureX, textureY); // Box 172

		bodyModel[0].addShapeBox(0F, 0F, 0F, 165, 2, 10, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-58F, -3F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 165, 2, 10, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-58F, -3F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 6F); // Box 2
		bodyModel[2].setRotationPoint(-74F, -1F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 165, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-58F, -1F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 165, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 4
		bodyModel[4].setRotationPoint(-58F, 6F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 165, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-58F, 6F, -18F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 165, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 6
		bodyModel[6].setRotationPoint(-58F, 11F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 165, 5, 18, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-58F, 11F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 165, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 8
		bodyModel[8].setRotationPoint(-58F, 16F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 165, 5, 17, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-58F, 16F, -17F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 165, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F); // Box 10
		bodyModel[10].setRotationPoint(-58F, 21F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 165, 6, 14, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-58F, 21F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 2, 10, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(107F, -3F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 8F); // Box 14
		bodyModel[13].setRotationPoint(107F, -1F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 21, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(107F, -1F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F); // Box 16
		bodyModel[15].setRotationPoint(107F, 6F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 21, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(107F, 6F, -18F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 21, 2, 10, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(107F, -3F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 21, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F); // Box 19
		bodyModel[18].setRotationPoint(107F, 11F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 21, 5, 18, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(107F, 11F, -18F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 21, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F); // Box 21
		bodyModel[20].setRotationPoint(107F, 16F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 21, 5, 17, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(107F, 16F, -17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 21, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4.5F, -7F, 0F, -1.5F, -4F); // Box 23
		bodyModel[22].setRotationPoint(107F, 21F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 21, 6, 14, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -4.5F, -7F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(107F, 21F, -14F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 7, 6, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 7F); // Box 25
		bodyModel[24].setRotationPoint(128F, -1F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F); // Box 27
		bodyModel[25].setRotationPoint(128F, 6F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 5, 14, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(128F, 6F, -14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 7, 6, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(128F, -1F, -6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F); // Box 30
		bodyModel[28].setRotationPoint(128F, 11F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 5, 13, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(128F, 11F, -13F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -9F, 0F, 0F, -1F); // Box 32
		bodyModel[30].setRotationPoint(128F, 16F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -9F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(128F, 16F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -6F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6.5F, -7F, 0F, -1.5F, -2F); // Box 35
		bodyModel[32].setRotationPoint(128F, 21F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F, 0F, 0F, 2F, 0F, 4F, -6F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -6.5F, -7F, 0F, -6F, 0F, 0F, -1F, 0F); // Box 37
		bodyModel[33].setRotationPoint(128F, 21F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[34].setRotationPoint(138F, 4F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -5F, 0F, -2F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[35].setRotationPoint(138F, 4F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 40
		bodyModel[36].setRotationPoint(138F, 6F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, 0F, -1F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(138F, 6F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F); // Box 42
		bodyModel[38].setRotationPoint(138F, 11F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[39].setRotationPoint(138F, 11F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -8F, 0F, 0F, -5F); // Box 44
		bodyModel[40].setRotationPoint(138F, 16F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(138F, 16F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -0.5F, -1F); // Box 46
		bodyModel[42].setRotationPoint(138F, 17F, 0F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(138F, 17F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 48
		bodyModel[44].setRotationPoint(-74F, -3F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[45].setRotationPoint(-74F, -3F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 165, 7, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F); // Box 50
		bodyModel[46].setRotationPoint(-58F, -1F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 7, 10, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[47].setRotationPoint(-74F, -1F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 52
		bodyModel[48].setRotationPoint(-74F, 6F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[49].setRotationPoint(-74F, 6F, -18F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(-74F, 11F, -18F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 5, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 55
		bodyModel[51].setRotationPoint(-74F, 11F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 16, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 56
		bodyModel[52].setRotationPoint(-74F, 16F, 0F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 16, 5, 17, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[53].setRotationPoint(-74F, 16F, -17F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 16, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -7F); // Box 58
		bodyModel[54].setRotationPoint(-74F, 21F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -7F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 60
		bodyModel[55].setRotationPoint(-74F, 21F, -14F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 7, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 6F); // Box 61
		bodyModel[56].setRotationPoint(-92F, -1F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 18, 7, 8, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 6F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[57].setRotationPoint(-92F, -1F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 2, 8, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 63
		bodyModel[58].setRotationPoint(-92F, -3F, 0F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 18, 2, 8, 0F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 64
		bodyModel[59].setRotationPoint(-92F, -3F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 65
		bodyModel[60].setRotationPoint(-92F, 6F, 0F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[61].setRotationPoint(-92F, 6F, -16F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 67
		bodyModel[62].setRotationPoint(-92F, 11F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 18, 5, 16, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[63].setRotationPoint(-92F, 11F, -16F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 18, 5, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 69
		bodyModel[64].setRotationPoint(-92F, 16F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 5, 15, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[65].setRotationPoint(-92F, 16F, -15F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, -5F, 0F, -3.5F, -7F); // Box 71
		bodyModel[66].setRotationPoint(-92F, 21F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 18, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -7F, 0F, -1.5F, -5F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 72
		bodyModel[67].setRotationPoint(-92F, 21F, -12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 73
		bodyModel[68].setRotationPoint(-110F, 6F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(-110F, 6F, -14F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 7, 6, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 5.5F); // Box 75
		bodyModel[70].setRotationPoint(-110F, -1F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 18, 7, 6, 0F, 0F, -5F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 5.5F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[71].setRotationPoint(-110F, -1F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F); // Box 78
		bodyModel[72].setRotationPoint(-110F, 11F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 18, 5, 14, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-110F, 11F, -14F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 18, 5, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.5F, -7F); // Box 80
		bodyModel[74].setRotationPoint(-110F, 16F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 18, 5, 13, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 81
		bodyModel[75].setRotationPoint(-110F, 16F, -13F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 18, 6, 10, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2.5F, -4F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3.5F, -5F, 0F, -8.5F, -4F); // Box 82
		bodyModel[76].setRotationPoint(-110F, 21F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 18, 6, 10, 0F, 0F, 2.5F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -8.5F, -4F, 0F, -3.5F, -5F, 0F, -3F, 0F, 0F, -8F, 0F); // Box 83
		bodyModel[77].setRotationPoint(-110F, 21F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -5F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 1F, 1.5F); // Box 84
		bodyModel[78].setRotationPoint(-120F, 1F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F, 0F, -5F, -3F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 1F, 1.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 85
		bodyModel[79].setRotationPoint(-120F, 1F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F); // Box 86
		bodyModel[80].setRotationPoint(-120F, 6F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F, 0F, -1F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[81].setRotationPoint(-120F, 6F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -5.5F); // Box 88
		bodyModel[82].setRotationPoint(-120F, 11F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 5, 11, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 89
		bodyModel[83].setRotationPoint(-120F, 11F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 1F, -3.5F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -3F, 0F, -5F, -3.5F); // Box 90
		bodyModel[84].setRotationPoint(-120F, 16F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 4, 9, 0F, 0F, 1F, -3.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, -3.5F, 0F, -1.5F, -3F, 0F, -1F, 0F, 0F, -5F, 0F); // Box 91
		bodyModel[85].setRotationPoint(-120F, 16F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 92
		bodyModel[86].setRotationPoint(-133F, 7F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F, 0F, -1F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[87].setRotationPoint(-133F, 7F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F); // Box 94
		bodyModel[88].setRotationPoint(-133F, 6F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[89].setRotationPoint(-133F, 6F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0F); // Box 96
		bodyModel[90].setRotationPoint(-133F, 11F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 13, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 97
		bodyModel[91].setRotationPoint(-133F, 11F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[92].setRotationPoint(-142F, 8F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 99
		bodyModel[93].setRotationPoint(-122F, 9F, 9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 100
		bodyModel[94].setRotationPoint(-122F, 9F, -11.5F);

		bodyModel[95].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[95].setRotationPoint(-111.5F, 9.5F, 10.5F);
		bodyModel[95].rotateAngleX = 4.1887902F;

		bodyModel[96].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[96].setRotationPoint(-111.5F, 9.5F, 10.5F);
		bodyModel[96].rotateAngleX = 2.0943951F;

		bodyModel[97].addShapeBox(-10F, -1.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[97].setRotationPoint(-111.5F, 8.5F, 10.5F);

		bodyModel[98].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[98].setRotationPoint(-111.5F, 9.5F, -10.5F);
		bodyModel[98].rotateAngleX = 4.1887902F;

		bodyModel[99].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[99].setRotationPoint(-111.5F, 9.5F, -10.5F);
		bodyModel[99].rotateAngleX = 2.0943951F;

		bodyModel[100].addShapeBox(-10F, -1.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[100].setRotationPoint(-111.5F, 8.5F, -10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[101].setRotationPoint(-109F, 9F, 11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 108
		bodyModel[102].setRotationPoint(-114F, 9F, 11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[103].setRotationPoint(-109F, 9F, -22F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 111
		bodyModel[104].setRotationPoint(-114F, 9F, -22F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[105].setRotationPoint(-119F, -12F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 18, 2, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[106].setRotationPoint(-119F, 10F, -1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[107].setRotationPoint(-127F, 4F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 117
		bodyModel[108].setRotationPoint(99F, 3F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 118
		bodyModel[109].setRotationPoint(99F, 3F, -24F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 41, 6, 5, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 119
		bodyModel[110].setRotationPoint(-37F, -7F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 41, 6, 5, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[111].setRotationPoint(-37F, -7F, -5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 14, 6, 5, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, 3F); // Box 121
		bodyModel[112].setRotationPoint(-51F, -7F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 14, 6, 5, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 1F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[113].setRotationPoint(-51F, -7F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 0F, 3F); // Box 123
		bodyModel[114].setRotationPoint(4F, -7F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 6, 5, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[115].setRotationPoint(4F, -7F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 28, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 125
		bodyModel[116].setRotationPoint(-27F, -13.5F, 0F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 28, 9, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[117].setRotationPoint(-27F, -13.5F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 127
		bodyModel[118].setRotationPoint(1F, -13.5F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 9, 5, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[119].setRotationPoint(1F, -13.5F, -5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 9, 5, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[120].setRotationPoint(-37F, -13.5F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 10, 9, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F); // Box 130
		bodyModel[121].setRotationPoint(-37F, -13.5F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 28, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131
		bodyModel[122].setRotationPoint(-27F, -15.5F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 134
		bodyModel[123].setRotationPoint(1F, -15.5F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F); // Box 135
		bodyModel[124].setRotationPoint(-37F, -15.5F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 28, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[125].setRotationPoint(-27F, -15.5F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[126].setRotationPoint(1F, -15.5F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 2, 5, 0F, -1F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[127].setRotationPoint(-37F, -15.5F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 140
		bodyModel[128].setRotationPoint(-1F, -19.5F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 141
		bodyModel[129].setRotationPoint(-6F, -20.5F, -2.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 142
		bodyModel[130].setRotationPoint(-6F, -21.5F, -2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 143
		bodyModel[131].setRotationPoint(-14F, -20.5F, -0.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 144
		bodyModel[132].setRotationPoint(-17F, -20.5F, -0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[133].setRotationPoint(-17F, -22.5F, -0.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[134].setRotationPoint(-14F, -22.5F, -0.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 147
		bodyModel[135].setRotationPoint(-21F, -28.5F, -0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 148
		bodyModel[136].setRotationPoint(-25F, -28.5F, -0.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 149
		bodyModel[137].setRotationPoint(-27F, -22.5F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 150
		bodyModel[138].setRotationPoint(-27F, -22.5F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 151
		bodyModel[139].setRotationPoint(-23F, -21.5F, -0.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[140].setRotationPoint(-23F, -22.5F, -0.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[141].setRotationPoint(17F, -1.5F, -7F);
		bodyModel[141].rotateAngleX = -0.10471976F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[142].setRotationPoint(23F, -1.5F, -7F);
		bodyModel[142].rotateAngleX = -0.10471976F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[143].setRotationPoint(35F, -1.5F, -7F);
		bodyModel[143].rotateAngleX = -0.10471976F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[144].setRotationPoint(29F, -1.5F, -7F);
		bodyModel[144].rotateAngleX = -0.10471976F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[145].setRotationPoint(41F, -1.5F, -7F);
		bodyModel[145].rotateAngleX = -0.10471976F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[146].setRotationPoint(71F, -1.5F, -7F);
		bodyModel[146].rotateAngleX = -0.10471976F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[147].setRotationPoint(47F, -1.5F, -7F);
		bodyModel[147].rotateAngleX = -0.10471976F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[148].setRotationPoint(53F, -1.5F, -7F);
		bodyModel[148].rotateAngleX = -0.10471976F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[149].setRotationPoint(59F, -1.5F, -7F);
		bodyModel[149].rotateAngleX = -0.10471976F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[150].setRotationPoint(65F, -1.5F, -7F);
		bodyModel[150].rotateAngleX = -0.10471976F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[151].setRotationPoint(17F, -1F, 1F);
		bodyModel[151].rotateAngleX = 0.10471976F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[152].setRotationPoint(23F, -1F, 1F);
		bodyModel[152].rotateAngleX = 0.10471976F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[153].setRotationPoint(35F, -1F, 1F);
		bodyModel[153].rotateAngleX = 0.10471976F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[154].setRotationPoint(29F, -1F, 1F);
		bodyModel[154].rotateAngleX = 0.10471976F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[155].setRotationPoint(41F, -1F, 1F);
		bodyModel[155].rotateAngleX = 0.10471976F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[156].setRotationPoint(71F, -1F, 1F);
		bodyModel[156].rotateAngleX = 0.10471976F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[157].setRotationPoint(47F, -1F, 1F);
		bodyModel[157].rotateAngleX = 0.10471976F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[158].setRotationPoint(53F, -1F, 1F);
		bodyModel[158].rotateAngleX = 0.10471976F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[159].setRotationPoint(59F, -1F, 1F);
		bodyModel[159].rotateAngleX = 0.10471976F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[160].setRotationPoint(65F, -1F, 1F);
		bodyModel[160].rotateAngleX = 0.10471976F;


		leftFrontWheelModel = new ModelRendererTurbo[2];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 145, 361, textureX, textureY); // Box 115
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 116

		leftFrontWheelModel[0].addShapeBox(-8F, 0F, -1F, 8, 16, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftFrontWheelModel[0].setRotationPoint(-119F, -12F, 0F);

		leftFrontWheelModel[1].addShapeBox(-8F, 0F, -1F, 8, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 116
		leftFrontWheelModel[1].setRotationPoint(-119F, 17F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}