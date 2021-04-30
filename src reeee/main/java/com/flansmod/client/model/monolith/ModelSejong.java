//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSejong extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSejong() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[252];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 57
		bodyModel[58] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 95
		bodyModel[95] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 98
		bodyModel[98] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 99
		bodyModel[99] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 100
		bodyModel[100] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 101
		bodyModel[101] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 104
		bodyModel[104] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 105
		bodyModel[105] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 106
		bodyModel[106] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 107
		bodyModel[107] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 108
		bodyModel[108] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 109
		bodyModel[109] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 110
		bodyModel[110] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 111
		bodyModel[111] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 112
		bodyModel[112] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 113
		bodyModel[113] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 114
		bodyModel[114] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 115
		bodyModel[115] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 116
		bodyModel[116] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 117
		bodyModel[117] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 118
		bodyModel[118] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 119
		bodyModel[119] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 120
		bodyModel[120] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 121
		bodyModel[121] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 122
		bodyModel[122] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 123
		bodyModel[123] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 124
		bodyModel[124] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 125
		bodyModel[125] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 127
		bodyModel[127] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 130
		bodyModel[130] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 136
		bodyModel[136] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 137
		bodyModel[137] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 138
		bodyModel[138] = new ModelRendererTurbo(this, 593, 105, textureX, textureY); // Box 139
		bodyModel[139] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 141
		bodyModel[141] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 142
		bodyModel[142] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 143
		bodyModel[143] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 146
		bodyModel[146] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 147
		bodyModel[147] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 148
		bodyModel[148] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 149
		bodyModel[149] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 150
		bodyModel[150] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 151
		bodyModel[151] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 152
		bodyModel[152] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 153
		bodyModel[153] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 154
		bodyModel[154] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 155
		bodyModel[155] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 156
		bodyModel[156] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 157
		bodyModel[157] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 158
		bodyModel[158] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 159
		bodyModel[159] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 160
		bodyModel[160] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 161
		bodyModel[161] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 162
		bodyModel[162] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 163
		bodyModel[163] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 164
		bodyModel[164] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 165
		bodyModel[165] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 166
		bodyModel[166] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 167
		bodyModel[167] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 168
		bodyModel[168] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Box 169
		bodyModel[169] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 170
		bodyModel[170] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 171
		bodyModel[171] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 172
		bodyModel[172] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Box 173
		bodyModel[173] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 175
		bodyModel[175] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 177
		bodyModel[177] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 178
		bodyModel[178] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 179
		bodyModel[179] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 180
		bodyModel[180] = new ModelRendererTurbo(this, 721, 89, textureX, textureY); // Box 181
		bodyModel[181] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 182
		bodyModel[182] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 183
		bodyModel[183] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 184
		bodyModel[184] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 185
		bodyModel[185] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 186
		bodyModel[186] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 187
		bodyModel[187] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 188
		bodyModel[188] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 189
		bodyModel[189] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 190
		bodyModel[190] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 191
		bodyModel[191] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 192
		bodyModel[192] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 193
		bodyModel[193] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 194
		bodyModel[194] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 195
		bodyModel[195] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 196
		bodyModel[196] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 197
		bodyModel[197] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 198
		bodyModel[198] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 199
		bodyModel[199] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 200
		bodyModel[200] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 201
		bodyModel[201] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 202
		bodyModel[202] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 203
		bodyModel[203] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 204
		bodyModel[204] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 205
		bodyModel[205] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 206
		bodyModel[206] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 207
		bodyModel[207] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 208
		bodyModel[208] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 209
		bodyModel[209] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 210
		bodyModel[210] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 211
		bodyModel[211] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 212
		bodyModel[212] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 213
		bodyModel[213] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Box 214
		bodyModel[214] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 215
		bodyModel[215] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 216
		bodyModel[216] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 217
		bodyModel[217] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 218
		bodyModel[218] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 219
		bodyModel[219] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 220
		bodyModel[220] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 221
		bodyModel[221] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 223
		bodyModel[222] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 224
		bodyModel[223] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 225
		bodyModel[224] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 226
		bodyModel[225] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 243
		bodyModel[226] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 244
		bodyModel[227] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 245
		bodyModel[228] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 251
		bodyModel[229] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 252
		bodyModel[230] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 254
		bodyModel[231] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 255
		bodyModel[232] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 256
		bodyModel[233] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 257
		bodyModel[234] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 258
		bodyModel[235] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 259
		bodyModel[236] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 260
		bodyModel[237] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 261
		bodyModel[238] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 308
		bodyModel[239] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 313
		bodyModel[240] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 314
		bodyModel[241] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 315
		bodyModel[242] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 316
		bodyModel[243] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 268
		bodyModel[244] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 269
		bodyModel[245] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 270
		bodyModel[246] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 271
		bodyModel[247] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 272
		bodyModel[248] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 273
		bodyModel[249] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 274
		bodyModel[250] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 275
		bodyModel[251] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 276

		bodyModel[0].addShapeBox(0F, 0F, 0F, 141, 10, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1
		bodyModel[0].setRotationPoint(-90F, -21.5F, -17F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 1F); // Box 2
		bodyModel[1].setRotationPoint(-94F, -21.5F, -17F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 41, 8, 34, 0F, 0F, 0F, -2F, 0F, -2F, -0.8F, 0F, -2F, -0.8F, 0F, 0F, -2F, -4F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, -0.5F, -3F); // Box 3
		bodyModel[2].setRotationPoint(-131F, -19.5F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 70, 6, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 4
		bodyModel[3].setRotationPoint(-90F, -11.5F, -15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 71, 6, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F); // Box 5
		bodyModel[4].setRotationPoint(-20F, -11.5F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 37, 6, 28, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, -32F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, -32F, 0F, -10F); // Box 5
		bodyModel[5].setRotationPoint(-127F, -11.5F, -14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 10, 34, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F); // Box 6
		bodyModel[6].setRotationPoint(51F, -21.5F, -17F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 35, 11, 32, 0F, 0F, 0F, 0F, 0F, 3F, -9F, 0F, 3F, -9F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -9F); // Box 7
		bodyModel[7].setRotationPoint(76F, -22.5F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 21, 14, 14, 0F, 0F, 0F, 0F, 0F, 1.5F, -7F, 0F, 1.5F, -7F, 0F, 0F, 0F, 0F, 0F, -4F, -19F, 0F, -7F, -19F, 0F, -7F, 0F, 0F, -4F); // Box 8
		bodyModel[8].setRotationPoint(111F, -25.5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 25, 6, 30, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -5F); // Box 9
		bodyModel[9].setRotationPoint(51F, -11.5F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 35, 6, 14, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F); // Box 10
		bodyModel[10].setRotationPoint(76F, -11.5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1.9999F, 0F, -1.999F, -1.9999F, 0F, -1.999F, 0F, 0F, -2F); // Box 11
		bodyModel[11].setRotationPoint(111F, -11.5F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 70, 5, 26, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, -3F, 0F, -13F); // Box 12
		bodyModel[12].setRotationPoint(-90F, -5.5F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 71, 5, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F); // Box 13
		bodyModel[13].setRotationPoint(-20F, -5.5F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 25, 5, 20, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 14
		bodyModel[14].setRotationPoint(51F, -5.5F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 35, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 15
		bodyModel[15].setRotationPoint(76F, -5.5F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.3F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		bodyModel[16].setRotationPoint(110F, -1F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, -1.3F, -1.5F, 0F, -1.5F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[17].setRotationPoint(110F, -1F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.8F, -1.5F, 0F, -1.5F, -1.3F, -1.5F, 0F, -1F, -1.3F); // Box 18
		bodyModel[18].setRotationPoint(110F, 1F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.3F, -1.5F, -1.3F, -1.5F, -0.8F, -1.5F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[19].setRotationPoint(110F, 1F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F, 0F, 0F, -2F, 0F, 0F, -1.3F, 0F, 2F, 0F, 0F, 0F, 0F, -7F, -0.5F, -1.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F); // Box 20
		bodyModel[20].setRotationPoint(87F, -1F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 23, 3, 2, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1.3F, 0F, 0F, -2F, -7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, -1.8F); // Box 21
		bodyModel[21].setRotationPoint(87F, -1F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, -1.8F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.3F, -6.5F, -1F, -1.5F); // Box 23
		bodyModel[22].setRotationPoint(95F, 1F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 3, 2, 0F, 1F, -0.5F, -1.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -6.5F, -1F, -1.5F, 0F, -1F, -1.3F, 0F, -1F, 0F, -6F, -1F, 0F); // Box 24
		bodyModel[23].setRotationPoint(95F, 1F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 36, 6, 33, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-89.5F, -27.5F, -16.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 6, 28, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(-53.5F, -27.5F, -11.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 6, 26, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-40.5F, -27.5F, -11.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 6, 22, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-27.5F, -27.5F, -11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 6, 22, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-13.5F, -27.5F, -11.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 31, 5, 11, 0F, -0.4F, 0F, -1F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.7F, -0.4F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-44F, -32.5F, -5.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 24, 5, 11, 0F, -0.5F, -0.5F, -1.35F, -0.7F, -0.5F, -0.4F, -0.7F, -0.5F, -0.4F, -0.5F, -0.5F, -1.35F, 0F, 0F, -0.65F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.65F); // Box 31
		bodyModel[30].setRotationPoint(-37.5F, -37.5F, -5.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-53.5F, -27F, -15.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-53.5F, -27.5F, -13.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-42.5F, -27.5F, 13.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-29.5F, -27.5F, 9.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 2, 30, 0F); // Box 36
		bodyModel[35].setRotationPoint(-131F, -21.5F, -15F);

		bodyModel[36].addBox(0F, -2F, 0F, 40, 2, 1, 0F); // Box 37
		bodyModel[36].setRotationPoint(-131F, -19.5F, -15F);
		bodyModel[36].rotateAngleY = -0.02792527F;
		bodyModel[36].rotateAngleZ = -0.05235988F;

		bodyModel[37].addBox(0F, -2F, 0F, 40, 2, 1, 0F); // Box 38
		bodyModel[37].setRotationPoint(-131F, -19.5F, 14F);
		bodyModel[37].rotateAngleY = 0.02792527F;
		bodyModel[37].rotateAngleZ = -0.05235988F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 40, 8, 33, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(1F, -29.5F, -16.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 3, 33, 0F, -1F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -1F, 0F, -0.45F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 40
		bodyModel[39].setRotationPoint(39.5F, -25F, -16.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 3, 33, 0F, -1F, 0F, -0.45F, 0F, 0F, -9.45F, 0F, 0F, -9.45F, -1F, 0F, -0.45F, -1F, 0.5F, 0F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, -1F, 0.5F, 0F); // Box 41
		bodyModel[40].setRotationPoint(49.5F, -25F, -16.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.4F, 0F, 0F, -0.07F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.07F); // Box 42
		bodyModel[41].setRotationPoint(-30.2F, -39F, -4.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 5, 18, 0F, 0F, 0F, -5.00001F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5.00001F, 0F, -5F, -5.0001F, 0F, 0F, -9.0001F, 0F, 0F, -9.00001F, 0F, -5F, -5.0001F); // Box 43
		bodyModel[42].setRotationPoint(-95F, -5.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 7, 31, 0F, -1F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(32F, -36.5F, -15.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 4, 32, 0F, 0F, 0F, -0.45F, 0.5F, 0F, -9F, 0.5F, 0F, -9F, 0F, 0F, -0.45F, 0F, 0.5F, 0F, 1F, 0.5F, -8.8F, 1F, 0.5F, -8.8F, 0F, 0.5F, 0F); // Box 45
		bodyModel[44].setRotationPoint(41F, -29.5F, -16F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 7, 32, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -10F, 0.5F, 0F, -10F, 0F, 0F, -1.5F, -1.50001F, 0F, -0.45F, 2.0001F, 0F, -9F, 2.0001F, 0F, -9F, -1.50001F, 0F, -0.45F); // Box 46
		bodyModel[45].setRotationPoint(39.5F, -36.5F, -16F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 47
		bodyModel[46].setRotationPoint(33F, -39F, -7.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 15, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 48
		bodyModel[47].setRotationPoint(45F, -39F, -7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 1, 17, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 49
		bodyModel[48].setRotationPoint(37F, -39.5F, -8.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 17, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -2F, -0.5F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -2F, -0.5F, -0.25F, -2F, 0F, -0.25F, 0F); // Box 50
		bodyModel[49].setRotationPoint(45F, -39.5F, -8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 31, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 52
		bodyModel[50].setRotationPoint(34F, -39.5F, -15.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, -0.5F, 0F, 0F, 0.02F, 0F, 0F, -1.8F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0.8F, -0.28F, 0.42F, 0.8F, -0.2F, -1.7F, 0.5F, 0F, -2.3F, 0.5F, 0F); // Box 53
		bodyModel[51].setRotationPoint(32.5F, -36.4F, 14.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F, -2.5F, 0F, 0F, -1.8F, 0F, 0F, 0.02F, 0F, 0F, -0.5F, 0F, 0F, -2.3F, 0.5F, 0F, -1.7F, 0.5F, 0F, 0.42F, 0.8F, -0.2F, 0F, 0.8F, -0.28F); // Box 55
		bodyModel[52].setRotationPoint(32.5F, -36.4F, -17.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 11, 31, 0F, -1.9F, 0F, -11.5F, 5.2F, 0F, -1.6F, 5.2F, 0F, -1.6F, -1.9F, 0F, -11.5F, 1F, 0.5F, -10F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 1F, 0.5F, -10F); // Box 56
		bodyModel[53].setRotationPoint(22F, -41F, -15.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 29, 0F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F); // Box 57
		bodyModel[54].setRotationPoint(31F, -39.5F, -14.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 19, 8, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.58F, -5.5F, 0.3F, 0F, 0F, 1F, 0F, 0F, 1F, 0.58F, -5.5F, 0.3F); // Box 55
		bodyModel[55].setRotationPoint(24.5F, -43.5F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(37.5F, -42.5F, 6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[57].setRotationPoint(40.5F, -42.5F, 6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[58].setRotationPoint(44F, -42.5F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 59
		bodyModel[59].setRotationPoint(37.5F, -41F, 6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 60
		bodyModel[60].setRotationPoint(40.5F, -41F, 6.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 61
		bodyModel[61].setRotationPoint(44F, -41F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 9, 4, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 62
		bodyModel[62].setRotationPoint(26F, -52F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 17, 4, 0F, 0F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, 0F, 0F, -0.95F, -2.5F, -0.5F, -0.95F, 2.5F, -0.5F, -0.95F, 2.5F, -0.5F, -0.95F, -2.5F, -0.5F, -0.95F); // Box 63
		bodyModel[63].setRotationPoint(23.5F, -68.5F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 64
		bodyModel[64].setRotationPoint(22.5F, -70F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[65].setRotationPoint(24.5F, -67F, -12F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[66].setRotationPoint(26.5F, -58F, -14F);

		bodyModel[67].addShapeBox(0F, 0.5F, -0.5F, 1, 12, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 67
		bodyModel[67].setRotationPoint(26.5F, -58F, -11F);
		bodyModel[67].rotateAngleX = 1.04719755F;

		bodyModel[68].addShapeBox(0F, 0.5F, -0.25F, 1, 12, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 68
		bodyModel[68].setRotationPoint(26.5F, -58F, 10.5F);
		bodyModel[68].rotateAngleX = -1.04719755F;

		bodyModel[69].addShapeBox(0F, 0.5F, -0.25F, 1, 10, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 69
		bodyModel[69].setRotationPoint(24.5F, -67.2F, 9.5F);
		bodyModel[69].rotateAngleX = -1.04719755F;

		bodyModel[70].addShapeBox(0F, 0.5F, -0.5F, 1, 10, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 70
		bodyModel[70].setRotationPoint(24.5F, -67.2F, -10F);
		bodyModel[70].rotateAngleX = 1.04719755F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 18, 9, 0F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, -0.4F, 2F, 0F, 1.93F, 3F, 0F, 3.6F, 3F, 0F, 3.6F, 2F, 0F, 1.93F); // Box 72
		bodyModel[71].setRotationPoint(0.8F, -39F, -4.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 9, 13, 0F, 0.92F, -0.5F, -0.4F, -0.2F, -0.5F, 6.2F, -0.2F, -0.5F, 6.2F, 0.92F, -0.5F, -0.4F, 2F, 0F, 1.93F, 3F, 0F, 9.6F, 3F, 0F, 9.6F, 2F, 0F, 1.93F); // Box 73
		bodyModel[72].setRotationPoint(0.8F, -30F, -6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[73].setRotationPoint(-35.5F, -40.5F, -1F);

		bodyModel[74].addShapeBox(0F, -2F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[74].setRotationPoint(-35F, -41F, -2F);
		bodyModel[74].rotateAngleZ = -0.78539816F;

		bodyModel[75].addShapeBox(-3F, -0.5F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F); // Box 76
		bodyModel[75].setRotationPoint(-35F, -41F, -0.5F);
		bodyModel[75].rotateAngleZ = -0.78539816F;

		bodyModel[76].addShapeBox(-3F, -0.5F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F); // Box 77
		bodyModel[76].setRotationPoint(-42F, -37F, -0.5F);
		bodyModel[76].rotateAngleZ = -0.78539816F;

		bodyModel[77].addShapeBox(0F, -2F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[77].setRotationPoint(-42F, -37F, -2F);
		bodyModel[77].rotateAngleZ = -0.78539816F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[78].setRotationPoint(-42.5F, -36.5F, -1F);

		bodyModel[79].addShapeBox(-4F, -0.5F, 0F, 3, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.4F); // Box 80
		bodyModel[79].setRotationPoint(37F, -46.5F, -0.5F);
		bodyModel[79].rotateAngleZ = -2.35619449F;

		bodyModel[80].addShapeBox(-1F, -2F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[80].setRotationPoint(37F, -46.5F, -2F);
		bodyModel[80].rotateAngleZ = -2.35619449F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(36.5F, -46.5F, -1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 83
		bodyModel[82].setRotationPoint(129.5F, -37.5F, -0.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F); // Box 84
		bodyModel[83].setRotationPoint(1.8F, -42.5F, -2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F); // Box 85
		bodyModel[84].setRotationPoint(1.8F, -42.5F, -0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F); // Box 86
		bodyModel[85].setRotationPoint(4.3F, -42.5F, -0.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 87
		bodyModel[86].setRotationPoint(4.3F, -42.5F, -2.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 88
		bodyModel[87].setRotationPoint(10.3F, -42.5F, -2.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F); // Box 89
		bodyModel[88].setRotationPoint(7.8F, -42.5F, -2.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F); // Box 90
		bodyModel[89].setRotationPoint(10.3F, -42.5F, -0.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F); // Box 91
		bodyModel[90].setRotationPoint(7.8F, -42.5F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 92
		bodyModel[91].setRotationPoint(-19.7F, -42.5F, -2.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F); // Box 93
		bodyModel[92].setRotationPoint(-22.2F, -42.5F, -2.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F); // Box 94
		bodyModel[93].setRotationPoint(-19.7F, -42.5F, -0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F); // Box 95
		bodyModel[94].setRotationPoint(-22.2F, -42.5F, -0.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 96
		bodyModel[95].setRotationPoint(-26.7F, -42.5F, -2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F); // Box 97
		bodyModel[96].setRotationPoint(-29.2F, -42.5F, -2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F); // Box 98
		bodyModel[97].setRotationPoint(-26.7F, -42.5F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F); // Box 99
		bodyModel[98].setRotationPoint(-29.2F, -42.5F, -0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 1F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[99].setRotationPoint(40.2F, -34.5F, -13F);
		bodyModel[99].rotateAngleY = -0.64577182F;
		bodyModel[99].rotateAngleZ = 0.26179939F;

		bodyModel[100].addShapeBox(0F, 3F, 1F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 101
		bodyModel[100].setRotationPoint(40.2F, -34.5F, -13F);
		bodyModel[100].rotateAngleY = -0.64577182F;
		bodyModel[100].rotateAngleZ = 0.26179939F;

		bodyModel[101].addShapeBox(0F, -1F, 1F, 1, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[101].setRotationPoint(40.2F, -34.5F, -13F);
		bodyModel[101].rotateAngleY = -0.64577182F;
		bodyModel[101].rotateAngleZ = 0.26179939F;

		bodyModel[102].addShapeBox(3.5F, 1F, -2F, 1, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[102].setRotationPoint(40.2F, -34.5F, 7F);
		bodyModel[102].rotateAngleY = 0.64577182F;
		bodyModel[102].rotateAngleZ = 0.26179939F;

		bodyModel[103].addShapeBox(3.5F, 4F, -2F, 1, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 104
		bodyModel[103].setRotationPoint(40.2F, -34.5F, 7F);
		bodyModel[103].rotateAngleY = 0.64577182F;
		bodyModel[103].rotateAngleZ = 0.26179939F;

		bodyModel[104].addShapeBox(3.5F, 0F, -2F, 1, 1, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[104].setRotationPoint(40.2F, -34.5F, 7F);
		bodyModel[104].rotateAngleY = 0.64577182F;
		bodyModel[104].rotateAngleZ = 0.26179939F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[105].setRotationPoint(37.5F, -42.5F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[106].setRotationPoint(40.5F, -42.5F, -8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 108
		bodyModel[107].setRotationPoint(37.5F, -41F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F); // Box 109
		bodyModel[108].setRotationPoint(40.5F, -41F, -8.5F);

		bodyModel[109].addShapeBox(0F, -4F, 0F, 1, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[109].setRotationPoint(27F, -52F, 1F);
		bodyModel[109].rotateAngleX = 0.27925268F;

		bodyModel[110].addShapeBox(0F, -4F, 0F, 1, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[110].setRotationPoint(27F, -52F, -2F);
		bodyModel[110].rotateAngleX = -0.27925268F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[111].setRotationPoint(23.5F, -73F, -1F);

		bodyModel[112].addShapeBox(0F, -1F, 0F, 2, 6, 2, 0F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 113
		bodyModel[112].setRotationPoint(23.5F, -77.5F, -1F);

		bodyModel[113].addShapeBox(0F, -1F, 0F, 2, 2, 2, 0F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F); // Box 114
		bodyModel[113].setRotationPoint(23.5F, -78.7F, -1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 115
		bodyModel[114].setRotationPoint(123F, -21.5F, -1F);
		bodyModel[114].rotateAngleZ = 0.75049158F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[115].setRotationPoint(125F, -21.5F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[116].setRotationPoint(-10.2F, -25F, 9.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 118
		bodyModel[117].setRotationPoint(-10.2F, -25F, -11.5F);

		bodyModel[118].addShapeBox(0F, 0F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[118].setRotationPoint(-6.3F, -25.5F, 9.5F);
		bodyModel[118].rotateAngleX = 0.43633231F;

		bodyModel[119].addShapeBox(0F, 0F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[119].setRotationPoint(-5.1F, -25.5F, 9.5F);
		bodyModel[119].rotateAngleX = 0.43633231F;

		bodyModel[120].addShapeBox(0F, -1.2F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[120].setRotationPoint(-5.1F, -25.5F, 9.5F);
		bodyModel[120].rotateAngleX = 0.43633231F;

		bodyModel[121].addShapeBox(0F, -1.2F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[121].setRotationPoint(-6.3F, -25.5F, 9.5F);
		bodyModel[121].rotateAngleX = 0.43633231F;

		bodyModel[122].addShapeBox(0F, -1.2F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[122].setRotationPoint(-8.1F, -25.5F, 9.5F);
		bodyModel[122].rotateAngleX = 0.43633231F;

		bodyModel[123].addShapeBox(0F, -1.2F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[123].setRotationPoint(-9.3F, -25.5F, 9.5F);
		bodyModel[123].rotateAngleX = 0.43633231F;

		bodyModel[124].addShapeBox(0F, 0F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[124].setRotationPoint(-9.3F, -25.5F, 9.5F);
		bodyModel[124].rotateAngleX = 0.43633231F;

		bodyModel[125].addShapeBox(0F, 0F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[125].setRotationPoint(-8.1F, -25.5F, 9.5F);
		bodyModel[125].rotateAngleX = 0.43633231F;

		bodyModel[126].addShapeBox(0F, 0F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[126].setRotationPoint(-6.3F, -27F, -12.5F);
		bodyModel[126].rotateAngleX = -0.43633231F;

		bodyModel[127].addShapeBox(0F, 0F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(-5.1F, -27F, -12.5F);
		bodyModel[127].rotateAngleX = -0.43633231F;

		bodyModel[128].addShapeBox(0F, -1.2F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[128].setRotationPoint(-5.1F, -27F, -12.5F);
		bodyModel[128].rotateAngleX = -0.43633231F;

		bodyModel[129].addShapeBox(0F, -1.2F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[129].setRotationPoint(-6.3F, -27F, -12.5F);
		bodyModel[129].rotateAngleX = -0.43633231F;

		bodyModel[130].addShapeBox(0F, -1.2F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[130].setRotationPoint(-8.1F, -27F, -12.5F);
		bodyModel[130].rotateAngleX = -0.43633231F;

		bodyModel[131].addShapeBox(0F, -1.2F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[131].setRotationPoint(-9.3F, -27F, -12.5F);
		bodyModel[131].rotateAngleX = -0.43633231F;

		bodyModel[132].addShapeBox(0F, 0F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[132].setRotationPoint(-9.3F, -27F, -12.5F);
		bodyModel[132].rotateAngleX = -0.43633231F;

		bodyModel[133].addShapeBox(0F, 0F, -1F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[133].setRotationPoint(-8.1F, -27F, -12.5F);
		bodyModel[133].rotateAngleX = -0.43633231F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[134].setRotationPoint(-10.2F, -22F, -3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[135].setRotationPoint(-9.7F, -21.8F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[136].setRotationPoint(-6.2F, -21.8F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[137].setRotationPoint(-83.5F, -28.3F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[138].setRotationPoint(-72.5F, -28.3F, -6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 140
		bodyModel[139].setRotationPoint(-81.5F, -28.5F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 141
		bodyModel[140].setRotationPoint(-81.5F, -28.5F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 142
		bodyModel[141].setRotationPoint(-81.5F, -28.5F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 143
		bodyModel[142].setRotationPoint(-81.5F, -28.5F, -2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 144
		bodyModel[143].setRotationPoint(-81.5F, -28.5F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 145
		bodyModel[144].setRotationPoint(-81.5F, -28.5F, 3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 146
		bodyModel[145].setRotationPoint(-81.5F, -28.5F, 2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 147
		bodyModel[146].setRotationPoint(-81.5F, -28.5F, 1F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 148
		bodyModel[147].setRotationPoint(-78F, -28.5F, 1F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 149
		bodyModel[148].setRotationPoint(-78F, -28.5F, 2F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 150
		bodyModel[149].setRotationPoint(-78F, -28.5F, 3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 151
		bodyModel[150].setRotationPoint(-78F, -28.5F, 4F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 152
		bodyModel[151].setRotationPoint(-78F, -28.5F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 153
		bodyModel[152].setRotationPoint(-78F, -28.5F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 154
		bodyModel[153].setRotationPoint(-78F, -28.5F, -4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 155
		bodyModel[154].setRotationPoint(-78F, -28.5F, -5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 156
		bodyModel[155].setRotationPoint(-78F, -28.5F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 157
		bodyModel[156].setRotationPoint(-78F, -28.5F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 158
		bodyModel[157].setRotationPoint(-81.5F, -28.5F, 0F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 159
		bodyModel[158].setRotationPoint(-81.5F, -28.5F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 160
		bodyModel[159].setRotationPoint(-70.7F, -28.5F, -5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 161
		bodyModel[160].setRotationPoint(-70.7F, -28.5F, -4F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 162
		bodyModel[161].setRotationPoint(-70.7F, -28.5F, -3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 163
		bodyModel[162].setRotationPoint(-70.7F, -28.5F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 164
		bodyModel[163].setRotationPoint(-70.7F, -28.5F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 165
		bodyModel[164].setRotationPoint(-70.7F, -28.5F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 166
		bodyModel[165].setRotationPoint(-70.7F, -28.5F, 1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 167
		bodyModel[166].setRotationPoint(-70.7F, -28.5F, 2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 168
		bodyModel[167].setRotationPoint(-70.7F, -28.5F, 3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 169
		bodyModel[168].setRotationPoint(-70.7F, -28.5F, 4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 170
		bodyModel[169].setRotationPoint(-67.2F, -28.5F, 4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 171
		bodyModel[170].setRotationPoint(-67.2F, -28.5F, 3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 172
		bodyModel[171].setRotationPoint(-67.2F, -28.5F, 2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 173
		bodyModel[172].setRotationPoint(-67.2F, -28.5F, 1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 174
		bodyModel[173].setRotationPoint(-67.2F, -28.5F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 175
		bodyModel[174].setRotationPoint(-67.2F, -28.5F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 176
		bodyModel[175].setRotationPoint(-67.2F, -28.5F, -2F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 177
		bodyModel[176].setRotationPoint(-67.2F, -28.5F, -3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 178
		bodyModel[177].setRotationPoint(-67.2F, -28.5F, -4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 179
		bodyModel[178].setRotationPoint(-67.2F, -28.5F, -5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 180
		bodyModel[179].setRotationPoint(-64.2F, -28.5F, -5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 181
		bodyModel[180].setRotationPoint(-64.2F, -28.5F, -4F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 182
		bodyModel[181].setRotationPoint(-64.2F, -28.5F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 183
		bodyModel[182].setRotationPoint(-64.2F, -28.5F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 184
		bodyModel[183].setRotationPoint(-64.2F, -28.5F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 185
		bodyModel[184].setRotationPoint(-64.2F, -28.5F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 186
		bodyModel[185].setRotationPoint(-64.2F, -28.5F, 1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 187
		bodyModel[186].setRotationPoint(-64.2F, -28.5F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 188
		bodyModel[187].setRotationPoint(-64.2F, -28.5F, 3F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 189
		bodyModel[188].setRotationPoint(-64.2F, -28.5F, 4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 190
		bodyModel[189].setRotationPoint(70F, -23F, -2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 191
		bodyModel[190].setRotationPoint(66.5F, -23F, 4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 192
		bodyModel[191].setRotationPoint(66.5F, -23F, 3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 193
		bodyModel[192].setRotationPoint(66.5F, -23F, 2F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 194
		bodyModel[193].setRotationPoint(66.5F, -23F, 1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 195
		bodyModel[194].setRotationPoint(66.5F, -23F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 196
		bodyModel[195].setRotationPoint(66.5F, -23F, -2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 197
		bodyModel[196].setRotationPoint(66.5F, -23F, -3F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 198
		bodyModel[197].setRotationPoint(66.5F, -23F, -4F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 199
		bodyModel[198].setRotationPoint(70F, -23F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 200
		bodyModel[199].setRotationPoint(70F, -23F, -4F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 201
		bodyModel[200].setRotationPoint(70F, -23F, -3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 202
		bodyModel[201].setRotationPoint(66.5F, -23F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 203
		bodyModel[202].setRotationPoint(70F, -23F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 204
		bodyModel[203].setRotationPoint(70F, -23F, 0F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 205
		bodyModel[204].setRotationPoint(70F, -23F, 1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 206
		bodyModel[205].setRotationPoint(70F, -23F, 2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 207
		bodyModel[206].setRotationPoint(70F, -23F, 3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 208
		bodyModel[207].setRotationPoint(70F, -23F, 4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 209
		bodyModel[208].setRotationPoint(66.5F, -23F, -5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 210
		bodyModel[209].setRotationPoint(73F, -23F, -5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 211
		bodyModel[210].setRotationPoint(73F, -23F, -4F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 212
		bodyModel[211].setRotationPoint(73F, -23F, -2F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 213
		bodyModel[212].setRotationPoint(73F, -23F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[213].setRotationPoint(64.7F, -22.8F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 215
		bodyModel[214].setRotationPoint(73F, -23F, 4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 216
		bodyModel[215].setRotationPoint(73F, -23F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 217
		bodyModel[216].setRotationPoint(73F, -23F, 2F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 218
		bodyModel[217].setRotationPoint(73F, -23F, 1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 219
		bodyModel[218].setRotationPoint(73F, -23F, -1F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 220
		bodyModel[219].setRotationPoint(73F, -23F, -3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 221
		bodyModel[220].setRotationPoint(51.7F, -26.5F, -3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 223
		bodyModel[221].setRotationPoint(81.5F, -24F, -2F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 224
		bodyModel[222].setRotationPoint(84.5F, -24F, -2F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F); // Box 225
		bodyModel[223].setRotationPoint(81.5F, -24F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F); // Box 226
		bodyModel[224].setRotationPoint(84.5F, -24F, 0F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 5, 27, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 1.2F, -0.25F, 1F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 1.2F, -0.25F, 1F); // Box 243
		bodyModel[225].setRotationPoint(34.2F, -41.25F, -13.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0.3F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0.3F, 0F, 0.2F); // Box 244
		bodyModel[226].setRotationPoint(-54F, -28.5F, -4.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 245
		bodyModel[227].setRotationPoint(-51.8F, -29.2F, -1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -1F); // Box 251
		bodyModel[228].setRotationPoint(-94F, -21.5F, 15F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[229].setRotationPoint(-89.5F, -24.5F, -12.5F);
		bodyModel[229].rotateAngleZ = -0.19198622F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[230].setRotationPoint(-89.5F, -24.5F, 4.5F);
		bodyModel[230].rotateAngleZ = -0.19198622F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 255
		bodyModel[231].setRotationPoint(-88.5F, -29F, -15F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 256
		bodyModel[232].setRotationPoint(-88.5F, -29F, 13F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 257
		bodyModel[233].setRotationPoint(-88F, -40F, -14.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 258
		bodyModel[234].setRotationPoint(-88F, -40F, 13.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 259
		bodyModel[235].setRotationPoint(-18F, -58F, 3.5F);
		bodyModel[235].rotateAngleZ = 0.13962634F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 260
		bodyModel[236].setRotationPoint(0F, -58F, 3.5F);
		bodyModel[236].rotateAngleZ = 0.13962634F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 261
		bodyModel[237].setRotationPoint(11F, -51F, -4.5F);
		bodyModel[237].rotateAngleZ = 0.13962634F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 308
		bodyModel[238].setRotationPoint(-111F, -4F, 3F);

		bodyModel[239].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[239].setRotationPoint(-103F, -3.5F, 3.5F);
		bodyModel[239].rotateAngleX = 4.1887902F;

		bodyModel[240].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[240].setRotationPoint(-103F, -3.5F, 3.5F);
		bodyModel[240].rotateAngleX = 2.0943951F;

		bodyModel[241].addShapeBox(-10F, 0F, 0F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[241].setRotationPoint(-104F, -4F, 3F);

		bodyModel[242].addShapeBox(-10F, -1.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[242].setRotationPoint(-103F, -4.5F, 3.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 268
		bodyModel[243].setRotationPoint(-111F, -4F, -4F);

		bodyModel[244].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[244].setRotationPoint(-103F, -3.5F, -3.5F);
		bodyModel[244].rotateAngleX = 4.1887902F;

		bodyModel[245].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[245].setRotationPoint(-103F, -3.5F, -3.5F);
		bodyModel[245].rotateAngleX = 2.0943951F;

		bodyModel[246].addShapeBox(-10F, 0F, 0F, 37, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[246].setRotationPoint(-104F, -4F, -4F);

		bodyModel[247].addShapeBox(-10F, -1.5F, -0.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[247].setRotationPoint(-103F, -4.5F, -3.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 273
		bodyModel[248].setRotationPoint(-110F, -9F, 3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 274
		bodyModel[249].setRotationPoint(-110F, -9F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 275
		bodyModel[250].setRotationPoint(-132.5F, -31F, -0.5F);
		bodyModel[250].rotateAngleZ = 0.13962634F;

		bodyModel[251].addShapeBox(-9.2F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 276
		bodyModel[251].setRotationPoint(-132.9F, -31F, -0.5F);
		bodyModel[251].rotateAngleZ = 0.13962634F;


		leftFrontWheelModel = new ModelRendererTurbo[1];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 262

		leftFrontWheelModel[0].addShapeBox(-1F, 0F, -1F, 3, 10, 2, 0F, 1.5F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, -0.3F, 1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 262
		leftFrontWheelModel[0].setRotationPoint(-120.5F, -12F, 0F);


		rightTrackModel = new ModelRendererTurbo[1];
		rightTrackModel[0] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 236

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		rightTrackModel[0].setRotationPoint(55.7F, -27F, -2F);



		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[7];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 228
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 229
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 230
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 231
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 232
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 233
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 234

		gun_1_Model[0][0].addShapeBox(-2F, 2F, -2F, 4, 1, 4, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 228

		gun_1_Model[0][1].addShapeBox(-2F, -1.5F, -1F, 3, 4, 2, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 2F); // Box 229

		gun_1_Model[0][2].addShapeBox(1.5F, -1.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 230

		gun_1_Model[0][3].addShapeBox(1.5F, -1.5F, -2.5F, 1, 4, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 231

		gun_1_Model[0][4].addShapeBox(1.5F, -1.5F, 1.5F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 232

		gun_1_Model[0][5].addShapeBox(-3F, -1.5F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.5F, 0F, 0F); // Box 233

		gun_1_Model[0][6].addShapeBox(-3F, 0.5F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 234

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(84F, -27F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[1];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 809, 105, textureX, textureY); // Box 235

		gun_1_Model[2][0].addShapeBox(-2F, -0.3F, -0.5F, 16, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 235

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(84F, -27F, 0F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[2];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 238
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 240

		gun_2_Model[0][0].addShapeBox(-1F, 0F, -2F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_2_Model[0][1].addShapeBox(-1F, 0F, 1F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(57.5F, -30F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[2];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 241
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 242

		gun_2_Model[2][0].addShapeBox(-2F, -1F, -1F, 4, 2, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 241

		gun_2_Model[2][1].addShapeBox(-2F, 0.6F, -1F, 4, 1, 2, 0F,0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 242

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(57.5F, -30F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[3];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 246
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 228
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 228

		gun_3_Model[0][0].addShapeBox(-1.5F, -1F, -1F, 2, 3, 2, 0F,-0.8F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 246

		gun_3_Model[0][1].addShapeBox(0.6F, -2.8F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 228

		gun_3_Model[0][2].addShapeBox(-0.5F, -2.6F, -0.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 228

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-50.2F, -31F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[2];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 228
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 228

		gun_3_Model[2][0].addShapeBox(1F, -0.4F, -0.5F, 4, 1, 1, 0F,0F, 0.4F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 228

		gun_3_Model[2][1].addShapeBox(3.5F, -0.4F, -0.5F, 4, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 228

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(-50.4F, -31F, 0F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[2];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 238
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 240

		gun_4_Model[0][0].addShapeBox(-1F, 0F, -2F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_4_Model[0][1].addShapeBox(-1F, 0F, 1F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-65.8F, -20F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[2];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 241
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 242

		gun_4_Model[2][0].addShapeBox(-2F, -1F, -1F, 4, 2, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 241

		gun_4_Model[2][1].addShapeBox(-2F, 0.6F, -1F, 4, 1, 2, 0F,0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 242

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(-65.8F, -20F, 0F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[2];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 238
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 240

		gun_5_Model[0][0].addShapeBox(-1F, 0F, -2F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_5_Model[0][1].addShapeBox(-1F, 0F, 1F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-78.8F, -20F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[2];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 241
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 242

		gun_5_Model[2][0].addShapeBox(-2F, -1F, -1F, 4, 2, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 241

		gun_5_Model[2][1].addShapeBox(-2F, 0.6F, -1F, 4, 1, 2, 0F,0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 242

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(-78.8F, -20F, 0F);
		}


		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[2];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 238
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 240

		gun_6_Model[0][0].addShapeBox(-1F, 0F, -2F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_6_Model[0][1].addShapeBox(-1F, 0F, 1F, 2, 3, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(70.8F, -17F, 0F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[0];

		gun_6_Model[2] = new ModelRendererTurbo[2];
		gun_6_Model[2][0] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 241
		gun_6_Model[2][1] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 242

		gun_6_Model[2][0].addShapeBox(-2F, -1F, -1F, 4, 2, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 241

		gun_6_Model[2][1].addShapeBox(-2F, 0.6F, -1F, 4, 1, 2, 0F,0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F); // Box 242

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[2])
		{
			gunPart.setRotationPoint(70.8F, -17F, 0F);
		}


		registerGunModel("PassengerGun6", gun_6_Model);

		translateAll(0F, 14F, 0F);


		flipAll();
	}
}