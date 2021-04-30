//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelRoma extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelRoma()
	{
		bodyModel = new ModelRendererTurbo[195];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 569, 161, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 961, 105, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 777, 113, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 641, 161, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 737, 161, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 825, 113, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 73
		bodyModel[70] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 74
		bodyModel[71] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 75
		bodyModel[72] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 76
		bodyModel[73] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 77
		bodyModel[74] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 78
		bodyModel[75] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 79
		bodyModel[76] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Box 80
		bodyModel[77] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Box 81
		bodyModel[78] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 82
		bodyModel[79] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box 83
		bodyModel[80] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 84
		bodyModel[81] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 85
		bodyModel[82] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 88
		bodyModel[84] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 89
		bodyModel[85] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 88
		bodyModel[87] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 89
		bodyModel[88] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 90
		bodyModel[89] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 91
		bodyModel[90] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 92
		bodyModel[91] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 93
		bodyModel[92] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 94
		bodyModel[93] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 95
		bodyModel[94] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 97
		bodyModel[96] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 100
		bodyModel[99] = new ModelRendererTurbo(this, 769, 193, textureX, textureY); // Box 101
		bodyModel[100] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 102
		bodyModel[101] = new ModelRendererTurbo(this, 681, 161, textureX, textureY); // Box 103
		bodyModel[102] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 104
		bodyModel[103] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Box 105
		bodyModel[104] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 107
		bodyModel[106] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 108
		bodyModel[107] = new ModelRendererTurbo(this, 529, 193, textureX, textureY); // Box 109
		bodyModel[108] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 110
		bodyModel[109] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 111
		bodyModel[110] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 112
		bodyModel[111] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 113
		bodyModel[112] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Box 114
		bodyModel[113] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 115
		bodyModel[114] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 116
		bodyModel[115] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 120
		bodyModel[119] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Box 121
		bodyModel[120] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 122
		bodyModel[121] = new ModelRendererTurbo(this, 593, 201, textureX, textureY); // Box 123
		bodyModel[122] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 124
		bodyModel[123] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 126
		bodyModel[125] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 127
		bodyModel[126] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 129
		bodyModel[128] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 130
		bodyModel[129] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 131
		bodyModel[130] = new ModelRendererTurbo(this, 841, 193, textureX, textureY); // Box 132
		bodyModel[131] = new ModelRendererTurbo(this, 569, 201, textureX, textureY); // Box 133
		bodyModel[132] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 136
		bodyModel[133] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 137
		bodyModel[134] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 138
		bodyModel[135] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Box 139
		bodyModel[136] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 140
		bodyModel[137] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 141
		bodyModel[138] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 142
		bodyModel[139] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 143
		bodyModel[140] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 144
		bodyModel[141] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 145
		bodyModel[142] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Box 146
		bodyModel[143] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 147
		bodyModel[144] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 148
		bodyModel[145] = new ModelRendererTurbo(this, 649, 209, textureX, textureY); // Box 149
		bodyModel[146] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 150
		bodyModel[147] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 151
		bodyModel[148] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 152
		bodyModel[149] = new ModelRendererTurbo(this, 529, 209, textureX, textureY); // Box 153
		bodyModel[150] = new ModelRendererTurbo(this, 673, 209, textureX, textureY); // Box 154
		bodyModel[151] = new ModelRendererTurbo(this, 705, 209, textureX, textureY); // Box 155
		bodyModel[152] = new ModelRendererTurbo(this, 737, 209, textureX, textureY); // Box 156
		bodyModel[153] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 157
		bodyModel[154] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 158
		bodyModel[155] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 159
		bodyModel[156] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 160
		bodyModel[157] = new ModelRendererTurbo(this, 577, 177, textureX, textureY); // Box 161
		bodyModel[158] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 167
		bodyModel[159] = new ModelRendererTurbo(this, 633, 201, textureX, textureY); // Box 168
		bodyModel[160] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 169
		bodyModel[161] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 170
		bodyModel[162] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 171
		bodyModel[163] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 172
		bodyModel[164] = new ModelRendererTurbo(this, 745, 201, textureX, textureY); // Box 173
		bodyModel[165] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 174
		bodyModel[166] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 175
		bodyModel[167] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 176
		bodyModel[168] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 177
		bodyModel[169] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 178
		bodyModel[170] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 179
		bodyModel[171] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 180
		bodyModel[172] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 181
		bodyModel[173] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 182
		bodyModel[174] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 183
		bodyModel[175] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 184
		bodyModel[176] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 185
		bodyModel[177] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 186
		bodyModel[178] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 187
		bodyModel[179] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 188
		bodyModel[180] = new ModelRendererTurbo(this, 673, 217, textureX, textureY); // Box 189
		bodyModel[181] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 190
		bodyModel[182] = new ModelRendererTurbo(this, 633, 209, textureX, textureY); // Box 191
		bodyModel[183] = new ModelRendererTurbo(this, 705, 217, textureX, textureY); // Box 192
		bodyModel[184] = new ModelRendererTurbo(this, 737, 217, textureX, textureY); // Box 193
		bodyModel[185] = new ModelRendererTurbo(this, 889, 217, textureX, textureY); // Box 194
		bodyModel[186] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 195
		bodyModel[187] = new ModelRendererTurbo(this, 817, 193, textureX, textureY); // Box 196
		bodyModel[188] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 197
		bodyModel[189] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 198
		bodyModel[190] = new ModelRendererTurbo(this, 761, 217, textureX, textureY); // Box 199
		bodyModel[191] = new ModelRendererTurbo(this, 769, 217, textureX, textureY); // Box 200
		bodyModel[192] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 201
		bodyModel[193] = new ModelRendererTurbo(this, 777, 217, textureX, textureY); // Box 202
		bodyModel[194] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 203

		bodyModel[0].addShapeBox(0F, 0F, 0F, 119, 18, 50, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(0F, -15F, -25F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 38, 18, 36, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(119F, -15F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 41, 18, 24, 0F,0F, 0F, 0F, 1F, 2F, -12F, 1F, 2F, -12F, 0F, 0F, 0F, 0F, 0F, -3F, -7F, 0F, -12F, -7F, 0F, -12F, 0F, 0F, -3F); // Box 3
		bodyModel[2].setRotationPoint(157F, -15F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 119, 6, 50, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -5F); // Box 4
		bodyModel[3].setRotationPoint(0F, 3F, -25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 38, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -5F); // Box 5
		bodyModel[4].setRotationPoint(119F, 3F, -18F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 33, 6, 24, 0F,0F, 0F, -3F, 1F, 0F, -12F, 1F, 0F, -12F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -5F); // Box 6
		bodyModel[5].setRotationPoint(157F, 3F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 119, 4, 40, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F); // Box 7
		bodyModel[6].setRotationPoint(0F, 9F, -20F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 38, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F); // Box 8
		bodyModel[7].setRotationPoint(119F, 9F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 33, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, -7F, 0F, 0F, -7F); // Box 9
		bodyModel[8].setRotationPoint(157F, 9F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 95, 18, 50, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 10
		bodyModel[9].setRotationPoint(-95F, -15F, -25F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 95, 6, 50, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -9F); // Box 11
		bodyModel[10].setRotationPoint(-95F, 3F, -25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 95, 4, 40, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, -20F); // Box 12
		bodyModel[11].setRotationPoint(-95F, 9F, -20F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 49, 14, 42, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 13
		bodyModel[12].setRotationPoint(-144F, -11F, -21F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 41, 14, 32, 0F,-4F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -12F, -8F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -13F); // Box 15
		bodyModel[13].setRotationPoint(-185F, -11F, -16F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 49, 6, 42, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F); // Box 16
		bodyModel[14].setRotationPoint(-144F, 3F, -21F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 49, 4, 32, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -7F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, -16F, -7F, 0F, -16F); // Box 17
		bodyModel[15].setRotationPoint(-144F, 9F, -16F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 37, 7, 32, 0F,-4F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -13F, 0F, -16F, 0F, 0F, -9F, 0F, 0F, -9F, -13F, 0F, -16F); // Box 18
		bodyModel[16].setRotationPoint(-181F, 3F, -16F);

		bodyModel[17].addBox(0F, 0F, 0F, 91, 4, 20, 0F); // Box 20
		bodyModel[17].setRotationPoint(-55F, -18F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 26, 5, 13, 0F); // Box 21
		bodyModel[18].setRotationPoint(-66F, -19F, -6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 22
		bodyModel[19].setRotationPoint(-58F, -18F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(34F, -19F, -14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 18, 6, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-20F, -36F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 25
		bodyModel[22].setRotationPoint(-20F, -36F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-14F, -36F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 18, 6, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-14F, -36F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 19, 6, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(9F, -37F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(9F, -37F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 19, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 30
		bodyModel[27].setRotationPoint(3F, -37F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 19, 6, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(3F, -37F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-2F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(-20F, -38F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, -2F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(-14F, -38F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 36
		bodyModel[31].setRotationPoint(-20F, -38F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-14F, -38F, 0F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 38
		bodyModel[33].setRotationPoint(3F, -39F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(9F, -39F, 0F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-2F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(3F, -39F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, -2F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(9F, -39F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(64F, -23F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F); // Box 43
		bodyModel[38].setRotationPoint(53F, -23F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 9, 11, 0F,0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(64F, -23F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 9, 11, 0F,-3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(53F, -23F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(-81F, -19F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,-3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(-92F, -19F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F); // Box 48
		bodyModel[43].setRotationPoint(-81F, -19F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F); // Box 49
		bodyModel[44].setRotationPoint(-92F, -19F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F); // Box 50
		bodyModel[45].setRotationPoint(85F, -16F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,-3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[46].setRotationPoint(85F, -16F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[47].setRotationPoint(96F, -16F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F); // Box 53
		bodyModel[48].setRotationPoint(96F, -16F, 0F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 54
		bodyModel[49].setRotationPoint(-179F, -21F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 24F, 0F, 0F); // Box 55
		bodyModel[50].setRotationPoint(-154.5F, -24F, -0.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 56
		bodyModel[51].setRotationPoint(-154.5F, -24F, -0.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 45, 2, 6, 0F); // Box 57
		bodyModel[52].setRotationPoint(-172F, -13F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 4, 50, 0F,-3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -3F, 0F, -4F, 0F, 0F, -4.35F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4.35F); // Box 58
		bodyModel[53].setRotationPoint(-98F, -15F, -25F);

		bodyModel[54].addBox(0F, 0F, 0F, 45, 4, 28, 0F); // Box 59
		bodyModel[54].setRotationPoint(-11F, -18F, -14F);

		bodyModel[55].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 60
		bodyModel[55].setRotationPoint(2F, -19F, -20F);

		bodyModel[56].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 61
		bodyModel[56].setRotationPoint(-10F, -19F, -19F);

		bodyModel[57].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 62
		bodyModel[57].setRotationPoint(-21F, -19F, -18F);

		bodyModel[58].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 63
		bodyModel[58].setRotationPoint(13F, -19F, -22F);

		bodyModel[59].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 64
		bodyModel[59].setRotationPoint(22F, -19F, -19F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 65
		bodyModel[60].setRotationPoint(31F, -19F, -18F);

		bodyModel[61].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 66
		bodyModel[61].setRotationPoint(2F, -19F, 15F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 67
		bodyModel[62].setRotationPoint(-10F, -19F, 14F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 68
		bodyModel[63].setRotationPoint(-21F, -19F, 13F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 69
		bodyModel[64].setRotationPoint(13F, -19F, 17F);

		bodyModel[65].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 70
		bodyModel[65].setRotationPoint(22F, -19F, 14F);

		bodyModel[66].addBox(0F, 0F, 0F, 5, 7, 5, 0F); // Box 71
		bodyModel[66].setRotationPoint(31F, -19F, 13F);

		bodyModel[67].addBox(0F, 0F, 0F, 35, 2, 20, 0F); // Box 71
		bodyModel[67].setRotationPoint(-9F, -25F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 45, 6, 6, 0F); // Box 72
		bodyModel[68].setRotationPoint(-11F, -23F, -3F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 73
		bodyModel[69].setRotationPoint(0F, -23F, 7F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 74
		bodyModel[70].setRotationPoint(12F, -23F, 7F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 75
		bodyModel[71].setRotationPoint(23F, -23F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 76
		bodyModel[72].setRotationPoint(-9F, -23F, 7F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 77
		bodyModel[73].setRotationPoint(0F, -23F, -10F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 78
		bodyModel[74].setRotationPoint(12F, -23F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 79
		bodyModel[75].setRotationPoint(23F, -23F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 80
		bodyModel[76].setRotationPoint(-9F, -23F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 14, 8, 12, 0F); // Box 81
		bodyModel[77].setRotationPoint(29F, -25F, -6F);

		bodyModel[78].addBox(0F, 0F, 0F, 15, 2, 14, 0F); // Box 82
		bodyModel[78].setRotationPoint(29F, -27F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 12, 3, 6, 0F); // Box 83
		bodyModel[79].setRotationPoint(28F, -41F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 14, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 84
		bodyModel[80].setRotationPoint(28F, -38F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[81].setRotationPoint(28F, -30F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 15, 6, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 86
		bodyModel[82].setRotationPoint(31F, -54F, -3F);

		bodyModel[83].addBox(0F, 0F, 0F, 9, 5, 4, 0F); // Box 88
		bodyModel[83].setRotationPoint(30F, -51F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[84].setRotationPoint(30F, -56F, -4F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 55, 1, 0F); // Box 90
		bodyModel[85].setRotationPoint(23F, -80F, -0.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 3, 6, 2, 0F); // Box 88
		bodyModel[86].setRotationPoint(22F, -55F, -1F);

		bodyModel[87].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 89
		bodyModel[87].setRotationPoint(21F, -55F, -1F);

		bodyModel[88].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 90
		bodyModel[88].setRotationPoint(21F, -42F, -1F);

		bodyModel[89].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 91
		bodyModel[89].setRotationPoint(20F, -32F, -1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[90].setRotationPoint(34F, -56F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 93
		bodyModel[91].setRotationPoint(30F, -56F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 94
		bodyModel[92].setRotationPoint(34F, -56F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 4F, 9, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 95
		bodyModel[93].setRotationPoint(30F, -51F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 4F, 9, 5, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[94].setRotationPoint(30F, -51F, -8F);

		bodyModel[95].addBox(0F, 0F, 0F, 9, 3, 4, 0F); // Box 97
		bodyModel[95].setRotationPoint(30F, -45F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 4F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 98
		bodyModel[96].setRotationPoint(30F, -45F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 4F, 9, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[97].setRotationPoint(30F, -45F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 14, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[98].setRotationPoint(28F, -35F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 14, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[99].setRotationPoint(28F, -33F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[100].setRotationPoint(28F, -30F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 103
		bodyModel[101].setRotationPoint(23F, -55.5F, 1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[102].setRotationPoint(23F, -55.5F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 105
		bodyModel[103].setRotationPoint(32.5F, -50.5F, 2.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[104].setRotationPoint(32.5F, -50.5F, -8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 107
		bodyModel[105].setRotationPoint(32.5F, -45F, 3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[106].setRotationPoint(32.5F, -45F, -7.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 1, 28, 0F); // Box 109
		bodyModel[107].setRotationPoint(23F, -70F, -14F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 110
		bodyModel[108].setRotationPoint(31F, -56.5F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[109].setRotationPoint(31F, -56.5F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[110].setRotationPoint(34F, -56.5F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 113
		bodyModel[111].setRotationPoint(34F, -56.5F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 32, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 114
		bodyModel[112].setRotationPoint(23F, -55.5F, -9F);
		bodyModel[112].rotateAngleX = 0.17453293F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 32, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 115
		bodyModel[113].setRotationPoint(23F, -55.5F, 8F);
		bodyModel[113].rotateAngleX = -0.17453293F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 116
		bodyModel[114].setRotationPoint(23F, -69.5F, -1F);
		bodyModel[114].rotateAngleX = -0.52359878F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 117
		bodyModel[115].setRotationPoint(23F, -69.5F, 0F);
		bodyModel[115].rotateAngleX = 0.52359878F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 118
		bodyModel[116].setRotationPoint(23F, -79.5F, 0F);
		bodyModel[116].rotateAngleX = 0.9250245F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 119
		bodyModel[117].setRotationPoint(23F, -79.5F, -1F);
		bodyModel[117].rotateAngleX = -0.9250245F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 120
		bodyModel[118].setRotationPoint(33F, -60F, -2.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 121
		bodyModel[119].setRotationPoint(33F, -63.5F, -2.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 122
		bodyModel[120].setRotationPoint(33F, -63.5F, -0.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 11, 8, 14, 0F,0F, -8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 123
		bodyModel[121].setRotationPoint(-26F, -26F, -7F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 124
		bodyModel[122].setRotationPoint(-64F, -16F, 16F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 125
		bodyModel[123].setRotationPoint(-70F, -16F, 16F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[124].setRotationPoint(-64F, -16F, -22F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[125].setRotationPoint(-70F, -16F, -22F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(-64F, -16F, -16F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 129
		bodyModel[127].setRotationPoint(-70F, -16F, -16F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[128].setRotationPoint(-70F, -16F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[129].setRotationPoint(-64F, -16F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 132
		bodyModel[130].setRotationPoint(-63F, -19F, 12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 133
		bodyModel[131].setRotationPoint(-70F, -19F, 12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[132].setRotationPoint(-76F, -18F, 15.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[133].setRotationPoint(-76F, -18F, 13.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[134].setRotationPoint(-76F, -18F, 17.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 139
		bodyModel[135].setRotationPoint(-63F, -19F, -20F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 140
		bodyModel[136].setRotationPoint(-70F, -19F, -20F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[137].setRotationPoint(-76F, -18F, -16.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[138].setRotationPoint(-76F, -18F, -14.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[139].setRotationPoint(-76F, -18F, -18.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 144
		bodyModel[140].setRotationPoint(50F, -16F, 16F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 145
		bodyModel[141].setRotationPoint(44F, -16F, 16F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[142].setRotationPoint(50F, -16F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[143].setRotationPoint(44F, -16F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 148
		bodyModel[144].setRotationPoint(49F, -19F, 12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 149
		bodyModel[145].setRotationPoint(44F, -19F, 12F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[146].setRotationPoint(55F, -18F, 17.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[147].setRotationPoint(55F, -18F, 15.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[148].setRotationPoint(55F, -18F, 13.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[149].setRotationPoint(50F, -16F, -22F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[150].setRotationPoint(44F, -16F, -22F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 155
		bodyModel[151].setRotationPoint(50F, -16F, -16F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 156
		bodyModel[152].setRotationPoint(44F, -16F, -16F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 157
		bodyModel[153].setRotationPoint(49F, -19F, -20F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 158
		bodyModel[154].setRotationPoint(44F, -19F, -20F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[155].setRotationPoint(55F, -18F, -18.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[156].setRotationPoint(55F, -18F, -16.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[157].setRotationPoint(55F, -18F, -14.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 167
		bodyModel[158].setRotationPoint(-110F, 5F, -20F);

		bodyModel[159].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 168
		bodyModel[159].setRotationPoint(-123F, 5.5F, -19.5F);

		bodyModel[160].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 169
		bodyModel[160].setRotationPoint(-122F, 6F, -19F);

		bodyModel[161].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 170
		bodyModel[161].setRotationPoint(-122F, 6F, -19F);
		bodyModel[161].rotateAngleX = 2.0943951F;

		bodyModel[162].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 171
		bodyModel[162].setRotationPoint(-122F, 6F, -19F);
		bodyModel[162].rotateAngleX = 4.1887902F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 172
		bodyModel[163].setRotationPoint(-110F, 5F, 18F);

		bodyModel[164].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 173
		bodyModel[164].setRotationPoint(-123F, 5.5F, 18.5F);

		bodyModel[165].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 174
		bodyModel[165].setRotationPoint(-122F, 6F, 19F);

		bodyModel[166].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 175
		bodyModel[166].setRotationPoint(-122F, 6F, 19F);
		bodyModel[166].rotateAngleX = 2.0943951F;

		bodyModel[167].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 176
		bodyModel[167].setRotationPoint(-122F, 6F, 19F);
		bodyModel[167].rotateAngleX = 4.1887902F;

		bodyModel[168].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 177
		bodyModel[168].setRotationPoint(-150F, 4.5F, 15.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 178
		bodyModel[169].setRotationPoint(-137F, 4F, 15F);

		bodyModel[170].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 179
		bodyModel[170].setRotationPoint(-149F, 5F, 16F);
		bodyModel[170].rotateAngleX = 2.0943951F;

		bodyModel[171].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 180
		bodyModel[171].setRotationPoint(-149F, 5F, 16F);

		bodyModel[172].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 181
		bodyModel[172].setRotationPoint(-149F, 5F, 16F);
		bodyModel[172].rotateAngleX = 4.1887902F;

		bodyModel[173].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Box 182
		bodyModel[173].setRotationPoint(-150F, 4.5F, -16.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 26, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 183
		bodyModel[174].setRotationPoint(-137F, 4F, -17F);

		bodyModel[175].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 184
		bodyModel[175].setRotationPoint(-149F, 5F, -16F);
		bodyModel[175].rotateAngleX = 2.0943951F;

		bodyModel[176].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 185
		bodyModel[176].setRotationPoint(-149F, 5F, -16F);

		bodyModel[177].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 186
		bodyModel[177].setRotationPoint(-149F, 5F, -16F);
		bodyModel[177].rotateAngleX = 4.1887902F;

		bodyModel[178].addShapeBox(0F, 0F, 4F, 9, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 187
		bodyModel[178].setRotationPoint(-45F, -33F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 4F, 9, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[179].setRotationPoint(-45F, -33F, -8F);

		bodyModel[180].addBox(0F, 0F, 0F, 9, 4, 4, 0F); // Box 189
		bodyModel[180].setRotationPoint(-45F, -33F, -2F);

		bodyModel[181].addShapeBox(0F, 0F, 4F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 190
		bodyModel[181].setRotationPoint(-44F, -29F, -2F);

		bodyModel[182].addShapeBox(0F, 0F, 4F, 8, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[182].setRotationPoint(-44F, -29F, -8F);

		bodyModel[183].addBox(0F, 0F, 0F, 8, 3, 4, 0F); // Box 192
		bodyModel[183].setRotationPoint(-44F, -29F, -2F);

		bodyModel[184].addShapeBox(0F, 0F, 4F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 193
		bodyModel[184].setRotationPoint(-43F, -26F, -2F);

		bodyModel[185].addShapeBox(0F, 0F, 4F, 7, 8, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[185].setRotationPoint(-43F, -26F, -8F);

		bodyModel[186].addBox(0F, 0F, 0F, 7, 8, 4, 0F); // Box 195
		bodyModel[186].setRotationPoint(-43F, -26F, -2F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 196
		bodyModel[187].setRotationPoint(-63F, -28F, -1F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 8, 2, 0F); // Box 197
		bodyModel[188].setRotationPoint(-42F, -40F, -1F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 198
		bodyModel[189].setRotationPoint(-41F, -48F, -0.5F);

		bodyModel[190].addShapeBox(-0.5F, 0F, 0F, 1, 71, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 199
		bodyModel[190].setRotationPoint(23F, -79.5F, 0F);
		bodyModel[190].rotateAngleX = 1.09955743F;
		bodyModel[190].rotateAngleY = 1.57079633F;

		bodyModel[191].addShapeBox(-0.5F, 0F, 0F, 1, 95, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 200
		bodyModel[191].setRotationPoint(23F, -69.5F, 0F);
		bodyModel[191].rotateAngleX = 1.11701072F;
		bodyModel[191].rotateAngleY = 1.57079633F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 201
		bodyModel[192].setRotationPoint(-47F, -48F, -0.5F);
		bodyModel[192].rotateAngleZ = 0.4712389F;

		bodyModel[193].addShapeBox(-8.1F, 0F, 0F, 9, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 202
		bodyModel[193].setRotationPoint(-47F, -48F, -0.5F);
		bodyModel[193].rotateAngleZ = 0.4712389F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 203
		bodyModel[194].setRotationPoint(197F, -28F, -0.5F);


		backWheelModel = new ModelRendererTurbo[1];
		backWheelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19

		backWheelModel[0].addBox(-12F, 0F, 0F, 12, 10, 2, 0F); // Box 19
		backWheelModel[0].setRotationPoint(-163F, 5F, -1F);



		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[3];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 800, 800, textureX, textureY); // Box 72
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 850, 850, textureX, textureY); // Box 73
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 900, 900, textureX, textureY); // Box 74

		gun_1_Model[0][0].addShapeBox(0F, 0F, -7F, 11, 4, 14, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 1F); // Box 72

		gun_1_Model[0][1].addShapeBox(-10F, 0F, -7F, 10, 4, 14, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 73

		gun_1_Model[0][2].addShapeBox(-11.5F, 0F, -10.5F, 6, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(96F, -20F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[3];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 71
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 74
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 75

		gun_1_Model[2][0].addShapeBox(10F, 1F, -6F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 71

		gun_1_Model[2][1].addShapeBox(10F, 1F, -1F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 74

		gun_1_Model[2][2].addShapeBox(10F, 1F, 4F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 75

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(96F, -20F, 0F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[3];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 800, 800, textureX, textureY); // Box 72
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 850, 850, textureX, textureY); // Box 73
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 900, 900, textureX, textureY); // Box 74

		gun_2_Model[0][0].addShapeBox(0F, 0F, -7F, 11, 4, 14, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 1F); // Box 72

		gun_2_Model[0][1].addShapeBox(-10F, 0F, -7F, 10, 4, 14, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 73

		gun_2_Model[0][2].addShapeBox(-11.5F, 0F, -10.5F, 6, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(64F, -27F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[3];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 71
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 74
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 75

		gun_2_Model[2][0].addShapeBox(10F, 1F, -6F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 71

		gun_2_Model[2][1].addShapeBox(10F, 1F, -1F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 74

		gun_2_Model[2][2].addShapeBox(10F, 1F, 4F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 75

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(64F, -27F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[3];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 800, 800, textureX, textureY); // Box 72
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 850, 850, textureX, textureY); // Box 73
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 900, 900, textureX, textureY); // Box 74

		gun_3_Model[0][0].addShapeBox(0F, 0F, -7F, 11, 4, 14, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 1F); // Box 72

		gun_3_Model[0][1].addShapeBox(-10F, 0F, -7F, 10, 4, 14, 0F,0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 73

		gun_3_Model[0][2].addShapeBox(-11.5F, 0F, -10.5F, 6, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-77F, -23F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[3];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 71
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 74
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 800, 900, textureX, textureY); // Box 75

		gun_3_Model[2][0].addShapeBox(10F, 1F, -6F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 71

		gun_3_Model[2][1].addShapeBox(10F, 1F, -1F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 74

		gun_3_Model[2][2].addShapeBox(10F, 1F, 4F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 75

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(-77F, -23F, 0F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);

		translateAll(0F, 17F, 0F);


		flipAll();
	}
}