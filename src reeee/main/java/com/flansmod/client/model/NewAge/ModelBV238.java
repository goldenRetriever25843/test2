//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BV238
// Model Creator: 
// Created on: 06.10.2016 - 18:53:27
// Last changed on: 06.10.2016 - 18:53:27

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBV238 extends ModelPlane //Same as Filename
{
	int textureX = 4096;
	int textureY = 2048;

	public ModelBV238() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[404];
		tailModel = new ModelRendererTurbo[124];
		leftWingModel = new ModelRendererTurbo[187];
		rightWingModel = new ModelRendererTurbo[166];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 2297, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 2769, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 3233, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 2305, 9, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 3697, 1, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 3713, 1, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 3769, 1, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 2769, 9, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 3233, 9, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 3825, 1, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 3881, 1, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 3937, 1, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 4001, 1, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 3521, 9, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 4049, 1, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 4065, 1, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 4081, 1, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 3577, 9, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 3593, 9, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 3609, 9, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 2761, 1, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 3625, 9, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 3641, 9, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 3657, 9, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 3673, 9, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 4049, 9, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 4065, 9, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 4081, 9, textureX, textureY); // Box 48
		bodyModel[41] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 49
		bodyModel[42] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 50
		bodyModel[43] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 51
		bodyModel[44] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 52
		bodyModel[45] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 53
		bodyModel[46] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 54
		bodyModel[47] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 55
		bodyModel[48] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 56
		bodyModel[49] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 57
		bodyModel[50] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 62
		bodyModel[55] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Box 67
		bodyModel[58] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 2081, 17, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 2169, 17, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 2257, 17, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 2345, 17, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 2425, 17, textureX, textureY); // Box 65
		bodyModel[64] = new ModelRendererTurbo(this, 2521, 17, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 2521, 25, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 3233, 25, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 1121, 33, textureX, textureY); // Box 70
		bodyModel[68] = new ModelRendererTurbo(this, 1825, 33, textureX, textureY); // Box 71
		bodyModel[69] = new ModelRendererTurbo(this, 2257, 33, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 2785, 33, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 2969, 33, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 3489, 33, textureX, textureY); // Box 76
		bodyModel[73] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 92
		bodyModel[75] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 94
		bodyModel[76] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 95
		bodyModel[77] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 96
		bodyModel[78] = new ModelRendererTurbo(this, 3953, 17, textureX, textureY); // Box 97
		bodyModel[79] = new ModelRendererTurbo(this, 2257, 41, textureX, textureY); // Box 99
		bodyModel[80] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 100
		bodyModel[81] = new ModelRendererTurbo(this, 1825, 41, textureX, textureY); // Box 101
		bodyModel[82] = new ModelRendererTurbo(this, 3489, 65, textureX, textureY); // Box 102
		bodyModel[83] = new ModelRendererTurbo(this, 2065, 81, textureX, textureY); // Box 103
		bodyModel[84] = new ModelRendererTurbo(this, 2537, 81, textureX, textureY); // Box 104
		bodyModel[85] = new ModelRendererTurbo(this, 3489, 81, textureX, textureY); // Box 105
		bodyModel[86] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 106
		bodyModel[87] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 107
		bodyModel[88] = new ModelRendererTurbo(this, 1361, 33, textureX, textureY); // Box 108
		bodyModel[89] = new ModelRendererTurbo(this, 1417, 33, textureX, textureY); // Box 109
		bodyModel[90] = new ModelRendererTurbo(this, 953, 89, textureX, textureY); // Box 110
		bodyModel[91] = new ModelRendererTurbo(this, 2721, 49, textureX, textureY); // Box 111
		bodyModel[92] = new ModelRendererTurbo(this, 1473, 33, textureX, textureY); // Box 112
		bodyModel[93] = new ModelRendererTurbo(this, 1529, 33, textureX, textureY); // Box 113
		bodyModel[94] = new ModelRendererTurbo(this, 3969, 33, textureX, textureY); // Box 114
		bodyModel[95] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 115
		bodyModel[96] = new ModelRendererTurbo(this, 4033, 33, textureX, textureY); // Box 116
		bodyModel[97] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 117
		bodyModel[98] = new ModelRendererTurbo(this, 2609, 17, textureX, textureY); // Box 118
		bodyModel[99] = new ModelRendererTurbo(this, 2625, 17, textureX, textureY); // Box 119
		bodyModel[100] = new ModelRendererTurbo(this, 2641, 17, textureX, textureY); // Box 120
		bodyModel[101] = new ModelRendererTurbo(this, 2657, 17, textureX, textureY); // Box 121
		bodyModel[102] = new ModelRendererTurbo(this, 2673, 17, textureX, textureY); // Box 122
		bodyModel[103] = new ModelRendererTurbo(this, 2689, 17, textureX, textureY); // Box 123
		bodyModel[104] = new ModelRendererTurbo(this, 2705, 17, textureX, textureY); // Box 124
		bodyModel[105] = new ModelRendererTurbo(this, 2721, 17, textureX, textureY); // Box 125
		bodyModel[106] = new ModelRendererTurbo(this, 3689, 9, textureX, textureY); // Box 126
		bodyModel[107] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 127
		bodyModel[108] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Box 128
		bodyModel[109] = new ModelRendererTurbo(this, 2073, 17, textureX, textureY); // Box 129
		bodyModel[110] = new ModelRendererTurbo(this, 2737, 17, textureX, textureY); // Box 130
		bodyModel[111] = new ModelRendererTurbo(this, 2753, 17, textureX, textureY); // Box 131
		bodyModel[112] = new ModelRendererTurbo(this, 3953, 17, textureX, textureY); // Box 132
		bodyModel[113] = new ModelRendererTurbo(this, 4049, 17, textureX, textureY); // Box 133
		bodyModel[114] = new ModelRendererTurbo(this, 4065, 17, textureX, textureY); // Box 134
		bodyModel[115] = new ModelRendererTurbo(this, 4081, 17, textureX, textureY); // Box 135
		bodyModel[116] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 136
		bodyModel[117] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 137
		bodyModel[118] = new ModelRendererTurbo(this, 2257, 25, textureX, textureY); // Box 138
		bodyModel[119] = new ModelRendererTurbo(this, 2273, 25, textureX, textureY); // Box 139
		bodyModel[120] = new ModelRendererTurbo(this, 2289, 25, textureX, textureY); // Box 140
		bodyModel[121] = new ModelRendererTurbo(this, 2305, 25, textureX, textureY); // Box 141
		bodyModel[122] = new ModelRendererTurbo(this, 2321, 25, textureX, textureY); // Box 142
		bodyModel[123] = new ModelRendererTurbo(this, 2337, 25, textureX, textureY); // Box 143
		bodyModel[124] = new ModelRendererTurbo(this, 2353, 25, textureX, textureY); // Box 144
		bodyModel[125] = new ModelRendererTurbo(this, 2369, 25, textureX, textureY); // Box 145
		bodyModel[126] = new ModelRendererTurbo(this, 2385, 25, textureX, textureY); // Box 146
		bodyModel[127] = new ModelRendererTurbo(this, 2401, 25, textureX, textureY); // Box 147
		bodyModel[128] = new ModelRendererTurbo(this, 3481, 25, textureX, textureY); // Box 148
		bodyModel[129] = new ModelRendererTurbo(this, 3497, 25, textureX, textureY); // Box 149
		bodyModel[130] = new ModelRendererTurbo(this, 1377, 49, textureX, textureY); // Box 150
		bodyModel[131] = new ModelRendererTurbo(this, 2721, 65, textureX, textureY); // Box 154
		bodyModel[132] = new ModelRendererTurbo(this, 1465, 49, textureX, textureY); // Box 155
		bodyModel[133] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 158
		bodyModel[134] = new ModelRendererTurbo(this, 2169, 49, textureX, textureY); // Box 159
		bodyModel[135] = new ModelRendererTurbo(this, 3977, 49, textureX, textureY); // Box 160
		bodyModel[136] = new ModelRendererTurbo(this, 2065, 57, textureX, textureY); // Box 161
		bodyModel[137] = new ModelRendererTurbo(this, 1417, 81, textureX, textureY); // Box 162
		bodyModel[138] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 163
		bodyModel[139] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 164
		bodyModel[140] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 165
		bodyModel[141] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 166
		bodyModel[142] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 167
		bodyModel[143] = new ModelRendererTurbo(this, 2065, 89, textureX, textureY); // Box 168
		bodyModel[144] = new ModelRendererTurbo(this, 3897, 81, textureX, textureY); // Box 172
		bodyModel[145] = new ModelRendererTurbo(this, 3841, 113, textureX, textureY); // Box 173
		bodyModel[146] = new ModelRendererTurbo(this, 1457, 137, textureX, textureY); // Box 197
		bodyModel[147] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 198
		bodyModel[148] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 199
		bodyModel[149] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 200
		bodyModel[150] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 201
		bodyModel[151] = new ModelRendererTurbo(this, 1761, 81, textureX, textureY); // Box 202
		bodyModel[152] = new ModelRendererTurbo(this, 4033, 1, textureX, textureY); // Box 201
		bodyModel[153] = new ModelRendererTurbo(this, 1105, 129, textureX, textureY); // Box 202
		bodyModel[154] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 203
		bodyModel[155] = new ModelRendererTurbo(this, 561, 153, textureX, textureY); // Box 271
		bodyModel[156] = new ModelRendererTurbo(this, 1457, 129, textureX, textureY); // Box 272
		bodyModel[157] = new ModelRendererTurbo(this, 4041, 97, textureX, textureY); // Box 278
		bodyModel[158] = new ModelRendererTurbo(this, 3513, 25, textureX, textureY); // Box 279
		bodyModel[159] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 280
		bodyModel[160] = new ModelRendererTurbo(this, 3401, 177, textureX, textureY); // Box 281
		bodyModel[161] = new ModelRendererTurbo(this, 3457, 177, textureX, textureY); // Box 282
		bodyModel[162] = new ModelRendererTurbo(this, 521, 177, textureX, textureY); // Box 283
		bodyModel[163] = new ModelRendererTurbo(this, 913, 129, textureX, textureY); // Box 285
		bodyModel[164] = new ModelRendererTurbo(this, 2809, 121, textureX, textureY); // Box 288
		bodyModel[165] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 289
		bodyModel[166] = new ModelRendererTurbo(this, 3009, 193, textureX, textureY); // Box 290
		bodyModel[167] = new ModelRendererTurbo(this, 4041, 113, textureX, textureY); // Box 291
		bodyModel[168] = new ModelRendererTurbo(this, 945, 129, textureX, textureY); // Box 292
		bodyModel[169] = new ModelRendererTurbo(this, 905, 201, textureX, textureY); // Box 306
		bodyModel[170] = new ModelRendererTurbo(this, 1249, 145, textureX, textureY); // Box 313
		bodyModel[171] = new ModelRendererTurbo(this, 2121, 201, textureX, textureY); // Box 314
		bodyModel[172] = new ModelRendererTurbo(this, 569, 129, textureX, textureY); // Box 315
		bodyModel[173] = new ModelRendererTurbo(this, 3993, 193, textureX, textureY); // Box 316
		bodyModel[174] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 317
		bodyModel[175] = new ModelRendererTurbo(this, 793, 129, textureX, textureY); // Box 297
		bodyModel[176] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 298
		bodyModel[177] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Box 299
		bodyModel[178] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Box 300
		bodyModel[179] = new ModelRendererTurbo(this, 3761, 129, textureX, textureY); // Box 301
		bodyModel[180] = new ModelRendererTurbo(this, 2721, 41, textureX, textureY); // Box 302
		bodyModel[181] = new ModelRendererTurbo(this, 2161, 57, textureX, textureY); // Box 303
		bodyModel[182] = new ModelRendererTurbo(this, 1105, 129, textureX, textureY); // Box 305
		bodyModel[183] = new ModelRendererTurbo(this, 729, 209, textureX, textureY); // Box 306
		bodyModel[184] = new ModelRendererTurbo(this, 3001, 145, textureX, textureY); // Box 308
		bodyModel[185] = new ModelRendererTurbo(this, 2201, 201, textureX, textureY); // Box 309
		bodyModel[186] = new ModelRendererTurbo(this, 785, 209, textureX, textureY); // Box 310
		bodyModel[187] = new ModelRendererTurbo(this, 1249, 169, textureX, textureY); // Box 311
		bodyModel[188] = new ModelRendererTurbo(this, 3841, 105, textureX, textureY); // Box 312
		bodyModel[189] = new ModelRendererTurbo(this, 1689, 113, textureX, textureY); // Box 313
		bodyModel[190] = new ModelRendererTurbo(this, 3449, 129, textureX, textureY); // Box 316
		bodyModel[191] = new ModelRendererTurbo(this, 3697, 129, textureX, textureY); // Box 320
		bodyModel[192] = new ModelRendererTurbo(this, 1841, 137, textureX, textureY); // Box 322
		bodyModel[193] = new ModelRendererTurbo(this, 2161, 137, textureX, textureY); // Box 323
		bodyModel[194] = new ModelRendererTurbo(this, 3449, 137, textureX, textureY); // Box 324
		bodyModel[195] = new ModelRendererTurbo(this, 2241, 137, textureX, textureY); // Box 325
		bodyModel[196] = new ModelRendererTurbo(this, 2961, 145, textureX, textureY); // Box 326
		bodyModel[197] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 327
		bodyModel[198] = new ModelRendererTurbo(this, 2209, 57, textureX, textureY); // Box 328
		bodyModel[199] = new ModelRendererTurbo(this, 1425, 73, textureX, textureY); // Box 329
		bodyModel[200] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 330
		bodyModel[201] = new ModelRendererTurbo(this, 2865, 97, textureX, textureY); // Box 331
		bodyModel[202] = new ModelRendererTurbo(this, 1745, 113, textureX, textureY); // Box 332
		bodyModel[203] = new ModelRendererTurbo(this, 2497, 33, textureX, textureY); // Box 333
		bodyModel[204] = new ModelRendererTurbo(this, 2249, 113, textureX, textureY); // Box 334
		bodyModel[205] = new ModelRendererTurbo(this, 3833, 137, textureX, textureY); // Box 335
		bodyModel[206] = new ModelRendererTurbo(this, 3449, 145, textureX, textureY); // Box 336
		bodyModel[207] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 337
		bodyModel[208] = new ModelRendererTurbo(this, 3489, 33, textureX, textureY); // Box 338
		bodyModel[209] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 339
		bodyModel[210] = new ModelRendererTurbo(this, 521, 153, textureX, textureY); // Box 340
		bodyModel[211] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 341
		bodyModel[212] = new ModelRendererTurbo(this, 793, 153, textureX, textureY); // Box 342
		bodyModel[213] = new ModelRendererTurbo(this, 2993, 81, textureX, textureY); // Box 343
		bodyModel[214] = new ModelRendererTurbo(this, 849, 209, textureX, textureY); // Box 373
		bodyModel[215] = new ModelRendererTurbo(this, 1801, 209, textureX, textureY); // Box 374
		bodyModel[216] = new ModelRendererTurbo(this, 529, 217, textureX, textureY); // Box 375
		bodyModel[217] = new ModelRendererTurbo(this, 3169, 225, textureX, textureY); // Box 376
		bodyModel[218] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 377
		bodyModel[219] = new ModelRendererTurbo(this, 3993, 233, textureX, textureY); // Box 378
		bodyModel[220] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 379
		bodyModel[221] = new ModelRendererTurbo(this, 785, 241, textureX, textureY); // Box 380
		bodyModel[222] = new ModelRendererTurbo(this, 1457, 241, textureX, textureY); // Box 381
		bodyModel[223] = new ModelRendererTurbo(this, 1537, 241, textureX, textureY); // Box 382
		bodyModel[224] = new ModelRendererTurbo(this, 1617, 241, textureX, textureY); // Box 383
		bodyModel[225] = new ModelRendererTurbo(this, 1801, 241, textureX, textureY); // Box 384
		bodyModel[226] = new ModelRendererTurbo(this, 2209, 241, textureX, textureY); // Box 385
		bodyModel[227] = new ModelRendererTurbo(this, 2297, 241, textureX, textureY); // Box 386
		bodyModel[228] = new ModelRendererTurbo(this, 4065, 25, textureX, textureY); // Box 621
		bodyModel[229] = new ModelRendererTurbo(this, 3489, 41, textureX, textureY); // Box 623
		bodyModel[230] = new ModelRendererTurbo(this, 2065, 49, textureX, textureY); // Box 624
		bodyModel[231] = new ModelRendererTurbo(this, 3521, 89, textureX, textureY); // Box 625
		bodyModel[232] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 626
		bodyModel[233] = new ModelRendererTurbo(this, 2969, 65, textureX, textureY); // Box 627
		bodyModel[234] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 628
		bodyModel[235] = new ModelRendererTurbo(this, 4081, 65, textureX, textureY); // Box 629
		bodyModel[236] = new ModelRendererTurbo(this, 3961, 65, textureX, textureY); // Box 630
		bodyModel[237] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 631
		bodyModel[238] = new ModelRendererTurbo(this, 1665, 81, textureX, textureY); // Box 632
		bodyModel[239] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 633
		bodyModel[240] = new ModelRendererTurbo(this, 3929, 89, textureX, textureY); // Box 634
		bodyModel[241] = new ModelRendererTurbo(this, 3897, 105, textureX, textureY); // Box 635
		bodyModel[242] = new ModelRendererTurbo(this, 1809, 105, textureX, textureY); // Box 636
		bodyModel[243] = new ModelRendererTurbo(this, 3865, 1, textureX, textureY); // Box 637
		bodyModel[244] = new ModelRendererTurbo(this, 4073, 113, textureX, textureY); // Box 638
		bodyModel[245] = new ModelRendererTurbo(this, 1889, 121, textureX, textureY); // Box 639
		bodyModel[246] = new ModelRendererTurbo(this, 3049, 129, textureX, textureY); // Box 640
		bodyModel[247] = new ModelRendererTurbo(this, 2297, 1, textureX, textureY); // Box 641
		bodyModel[248] = new ModelRendererTurbo(this, 4089, 33, textureX, textureY); // Box 642
		bodyModel[249] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 643
		bodyModel[250] = new ModelRendererTurbo(this, 1881, 153, textureX, textureY); // Box 644
		bodyModel[251] = new ModelRendererTurbo(this, 2233, 65, textureX, textureY); // Box 645
		bodyModel[252] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 646
		bodyModel[253] = new ModelRendererTurbo(this, 2521, 17, textureX, textureY); // Box 647
		bodyModel[254] = new ModelRendererTurbo(this, 641, 505, textureX, textureY); // Box 648
		bodyModel[255] = new ModelRendererTurbo(this, 833, 505, textureX, textureY); // Box 649
		bodyModel[256] = new ModelRendererTurbo(this, 1073, 505, textureX, textureY); // Box 650
		bodyModel[257] = new ModelRendererTurbo(this, 1281, 505, textureX, textureY); // Box 651
		bodyModel[258] = new ModelRendererTurbo(this, 3753, 489, textureX, textureY); // Box 652
		bodyModel[259] = new ModelRendererTurbo(this, 3905, 313, textureX, textureY); // Box 653
		bodyModel[260] = new ModelRendererTurbo(this, 3121, 225, textureX, textureY); // Box 654
		bodyModel[261] = new ModelRendererTurbo(this, 3017, 81, textureX, textureY); // Box 655
		bodyModel[262] = new ModelRendererTurbo(this, 3937, 113, textureX, textureY); // Box 656
		bodyModel[263] = new ModelRendererTurbo(this, 2505, 33, textureX, textureY); // Box 657
		bodyModel[264] = new ModelRendererTurbo(this, 2129, 225, textureX, textureY); // Box 658
		bodyModel[265] = new ModelRendererTurbo(this, 2473, 313, textureX, textureY); // Box 659
		bodyModel[266] = new ModelRendererTurbo(this, 1057, 241, textureX, textureY); // Box 660
		bodyModel[267] = new ModelRendererTurbo(this, 2841, 121, textureX, textureY); // Box 661
		bodyModel[268] = new ModelRendererTurbo(this, 889, 129, textureX, textureY); // Box 662
		bodyModel[269] = new ModelRendererTurbo(this, 1361, 49, textureX, textureY); // Box 663
		bodyModel[270] = new ModelRendererTurbo(this, 593, 241, textureX, textureY); // Box 664
		bodyModel[271] = new ModelRendererTurbo(this, 2665, 241, textureX, textureY); // Box 665
		bodyModel[272] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 666
		bodyModel[273] = new ModelRendererTurbo(this, 3825, 129, textureX, textureY); // Box 667
		bodyModel[274] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 668
		bodyModel[275] = new ModelRendererTurbo(this, 785, 241, textureX, textureY); // Box 669
		bodyModel[276] = new ModelRendererTurbo(this, 2905, 321, textureX, textureY); // Box 670
		bodyModel[277] = new ModelRendererTurbo(this, 1457, 241, textureX, textureY); // Box 671
		bodyModel[278] = new ModelRendererTurbo(this, 2985, 137, textureX, textureY); // Box 672
		bodyModel[279] = new ModelRendererTurbo(this, 3865, 137, textureX, textureY); // Box 673
		bodyModel[280] = new ModelRendererTurbo(this, 3881, 137, textureX, textureY); // Box 674
		bodyModel[281] = new ModelRendererTurbo(this, 3249, 249, textureX, textureY); // Box 675
		bodyModel[282] = new ModelRendererTurbo(this, 2937, 257, textureX, textureY); // Box 676
		bodyModel[283] = new ModelRendererTurbo(this, 1841, 153, textureX, textureY); // Box 677
		bodyModel[284] = new ModelRendererTurbo(this, 3449, 153, textureX, textureY); // Box 678
		bodyModel[285] = new ModelRendererTurbo(this, 3465, 153, textureX, textureY); // Box 679
		bodyModel[286] = new ModelRendererTurbo(this, 1537, 241, textureX, textureY); // Box 680
		bodyModel[287] = new ModelRendererTurbo(this, 561, 329, textureX, textureY); // Box 681
		bodyModel[288] = new ModelRendererTurbo(this, 1665, 241, textureX, textureY); // Box 682
		bodyModel[289] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 683
		bodyModel[290] = new ModelRendererTurbo(this, 1057, 161, textureX, textureY); // Box 684
		bodyModel[291] = new ModelRendererTurbo(this, 1313, 169, textureX, textureY); // Box 685
		bodyModel[292] = new ModelRendererTurbo(this, 4073, 257, textureX, textureY); // Box 686
		bodyModel[293] = new ModelRendererTurbo(this, 3121, 265, textureX, textureY); // Box 687
		bodyModel[294] = new ModelRendererTurbo(this, 2273, 169, textureX, textureY); // Box 688
		bodyModel[295] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 689
		bodyModel[296] = new ModelRendererTurbo(this, 3689, 169, textureX, textureY); // Box 690
		bodyModel[297] = new ModelRendererTurbo(this, 1801, 241, textureX, textureY); // Box 691
		bodyModel[298] = new ModelRendererTurbo(this, 1025, 329, textureX, textureY); // Box 692
		bodyModel[299] = new ModelRendererTurbo(this, 2257, 241, textureX, textureY); // Box 693
		bodyModel[300] = new ModelRendererTurbo(this, 1057, 177, textureX, textureY); // Box 694
		bodyModel[301] = new ModelRendererTurbo(this, 1313, 177, textureX, textureY); // Box 695
		bodyModel[302] = new ModelRendererTurbo(this, 3353, 177, textureX, textureY); // Box 696
		bodyModel[303] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Box 697
		bodyModel[304] = new ModelRendererTurbo(this, 1361, 505, textureX, textureY); // Box 698
		bodyModel[305] = new ModelRendererTurbo(this, 2657, 209, textureX, textureY); // Box 699
		bodyModel[306] = new ModelRendererTurbo(this, 3689, 329, textureX, textureY); // Box 700
		bodyModel[307] = new ModelRendererTurbo(this, 3377, 217, textureX, textureY); // Box 701
		bodyModel[308] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 702
		bodyModel[309] = new ModelRendererTurbo(this, 3233, 25, textureX, textureY); // Box 703
		bodyModel[310] = new ModelRendererTurbo(this, 4089, 25, textureX, textureY); // Box 704
		bodyModel[311] = new ModelRendererTurbo(this, 2073, 33, textureX, textureY); // Box 705
		bodyModel[312] = new ModelRendererTurbo(this, 2961, 161, textureX, textureY); // Box 725
		bodyModel[313] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 726
		bodyModel[314] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 727
		bodyModel[315] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 728
		bodyModel[316] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 729
		bodyModel[317] = new ModelRendererTurbo(this, 2721, 41, textureX, textureY); // Box 730
		bodyModel[318] = new ModelRendererTurbo(this, 3929, 9, textureX, textureY); // Box 731
		bodyModel[319] = new ModelRendererTurbo(this, 2777, 41, textureX, textureY); // Box 732
		bodyModel[320] = new ModelRendererTurbo(this, 1553, 49, textureX, textureY); // Box 733
		bodyModel[321] = new ModelRendererTurbo(this, 1577, 49, textureX, textureY); // Box 734
		bodyModel[322] = new ModelRendererTurbo(this, 4073, 49, textureX, textureY); // Box 735
		bodyModel[323] = new ModelRendererTurbo(this, 3993, 9, textureX, textureY); // Box 736
		bodyModel[324] = new ModelRendererTurbo(this, 4089, 49, textureX, textureY); // Box 737
		bodyModel[325] = new ModelRendererTurbo(this, 2065, 57, textureX, textureY); // Box 738
		bodyModel[326] = new ModelRendererTurbo(this, 2153, 57, textureX, textureY); // Box 739
		bodyModel[327] = new ModelRendererTurbo(this, 2249, 57, textureX, textureY); // Box 740
		bodyModel[328] = new ModelRendererTurbo(this, 3513, 17, textureX, textureY); // Box 741
		bodyModel[329] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 742
		bodyModel[330] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Box 743
		bodyModel[331] = new ModelRendererTurbo(this, 2721, 65, textureX, textureY); // Box 744
		bodyModel[332] = new ModelRendererTurbo(this, 3017, 65, textureX, textureY); // Box 745
		bodyModel[333] = new ModelRendererTurbo(this, 1409, 41, textureX, textureY); // Box 746
		bodyModel[334] = new ModelRendererTurbo(this, 2985, 161, textureX, textureY); // Box 747
		bodyModel[335] = new ModelRendererTurbo(this, 2297, 241, textureX, textureY); // Box 748
		bodyModel[336] = new ModelRendererTurbo(this, 1801, 225, textureX, textureY); // Box 749
		bodyModel[337] = new ModelRendererTurbo(this, 2345, 241, textureX, textureY); // Box 750
		bodyModel[338] = new ModelRendererTurbo(this, 593, 257, textureX, textureY); // Box 751
		bodyModel[339] = new ModelRendererTurbo(this, 3489, 65, textureX, textureY); // Box 752
		bodyModel[340] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 753
		bodyModel[341] = new ModelRendererTurbo(this, 3249, 225, textureX, textureY); // Box 754
		bodyModel[342] = new ModelRendererTurbo(this, 2497, 241, textureX, textureY); // Box 755
		bodyModel[343] = new ModelRendererTurbo(this, 1937, 257, textureX, textureY); // Box 756
		bodyModel[344] = new ModelRendererTurbo(this, 4073, 217, textureX, textureY); // Box 757
		bodyModel[345] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 758
		bodyModel[346] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 759
		bodyModel[347] = new ModelRendererTurbo(this, 4089, 73, textureX, textureY); // Box 760
		bodyModel[348] = new ModelRendererTurbo(this, 2297, 113, textureX, textureY); // Box 761
		bodyModel[349] = new ModelRendererTurbo(this, 3065, 121, textureX, textureY); // Box 762
		bodyModel[350] = new ModelRendererTurbo(this, 2881, 249, textureX, textureY); // Box 763
		bodyModel[351] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 764
		bodyModel[352] = new ModelRendererTurbo(this, 1801, 297, textureX, textureY); // Box 765
		bodyModel[353] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 766
		bodyModel[354] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Box 767
		bodyModel[355] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 768
		bodyModel[356] = new ModelRendererTurbo(this, 1497, 185, textureX, textureY); // Box 769
		bodyModel[357] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 770
		bodyModel[358] = new ModelRendererTurbo(this, 1377, 73, textureX, textureY); // Box 771
		bodyModel[359] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 772
		bodyModel[360] = new ModelRendererTurbo(this, 1417, 73, textureX, textureY); // Box 773
		bodyModel[361] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 774
		bodyModel[362] = new ModelRendererTurbo(this, 1321, 433, textureX, textureY); // Box 775
		bodyModel[363] = new ModelRendererTurbo(this, 3689, 433, textureX, textureY); // Box 776
		bodyModel[364] = new ModelRendererTurbo(this, 3873, 521, textureX, textureY); // Box 777
		bodyModel[365] = new ModelRendererTurbo(this, 2705, 489, textureX, textureY); // Box 778
		bodyModel[366] = new ModelRendererTurbo(this, 3441, 337, textureX, textureY); // Box 779
		bodyModel[367] = new ModelRendererTurbo(this, 3065, 329, textureX, textureY); // Box 780
		bodyModel[368] = new ModelRendererTurbo(this, 313, 353, textureX, textureY); // Box 781
		bodyModel[369] = new ModelRendererTurbo(this, 2969, 361, textureX, textureY); // Box 782
		bodyModel[370] = new ModelRendererTurbo(this, 3377, 377, textureX, textureY); // Box 783
		bodyModel[371] = new ModelRendererTurbo(this, 993, 385, textureX, textureY); // Box 784
		bodyModel[372] = new ModelRendererTurbo(this, 2497, 257, textureX, textureY); // Box 785
		bodyModel[373] = new ModelRendererTurbo(this, 3169, 257, textureX, textureY); // Box 786
		bodyModel[374] = new ModelRendererTurbo(this, 2881, 313, textureX, textureY); // Box 787
		bodyModel[375] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box 788
		bodyModel[376] = new ModelRendererTurbo(this, 1321, 129, textureX, textureY); // Box 789
		bodyModel[377] = new ModelRendererTurbo(this, 3369, 177, textureX, textureY); // Box 790
		bodyModel[378] = new ModelRendererTurbo(this, 2297, 129, textureX, textureY); // Box 791
		bodyModel[379] = new ModelRendererTurbo(this, 3513, 257, textureX, textureY); // Box 792
		bodyModel[380] = new ModelRendererTurbo(this, 3025, 257, textureX, textureY); // Box 793
		bodyModel[381] = new ModelRendererTurbo(this, 1657, 321, textureX, textureY); // Box 794
		bodyModel[382] = new ModelRendererTurbo(this, 3993, 201, textureX, textureY); // Box 795
		bodyModel[383] = new ModelRendererTurbo(this, 2849, 129, textureX, textureY); // Box 796
		bodyModel[384] = new ModelRendererTurbo(this, 1009, 209, textureX, textureY); // Box 797
		bodyModel[385] = new ModelRendererTurbo(this, 2281, 137, textureX, textureY); // Box 798
		bodyModel[386] = new ModelRendererTurbo(this, 4089, 137, textureX, textureY); // Box 799
		bodyModel[387] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 800
		bodyModel[388] = new ModelRendererTurbo(this, 1321, 145, textureX, textureY); // Box 801
		bodyModel[389] = new ModelRendererTurbo(this, 3945, 321, textureX, textureY); // Box 802
		bodyModel[390] = new ModelRendererTurbo(this, 3481, 257, textureX, textureY); // Box 803
		bodyModel[391] = new ModelRendererTurbo(this, 1297, 265, textureX, textureY); // Box 804
		bodyModel[392] = new ModelRendererTurbo(this, 2537, 265, textureX, textureY); // Box 805
		bodyModel[393] = new ModelRendererTurbo(this, 1025, 353, textureX, textureY); // Box 806
		bodyModel[394] = new ModelRendererTurbo(this, 3761, 265, textureX, textureY); // Box 807
		bodyModel[395] = new ModelRendererTurbo(this, 2481, 361, textureX, textureY); // Box 808
		bodyModel[396] = new ModelRendererTurbo(this, 1665, 257, textureX, textureY); // Box 809
		bodyModel[397] = new ModelRendererTurbo(this, 2257, 257, textureX, textureY); // Box 810
		bodyModel[398] = new ModelRendererTurbo(this, 3993, 265, textureX, textureY); // Box 811
		bodyModel[399] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Box 812
		bodyModel[400] = new ModelRendererTurbo(this, 2289, 377, textureX, textureY); // Box 813
		bodyModel[401] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 878
		bodyModel[402] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 879
		bodyModel[403] = new ModelRendererTurbo(this, 1457, 137, textureX, textureY); // Box 880

		bodyModel[0].addShapeBox(0F, 0F, 0F, 228, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-294F, -143F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 41, 1, 9, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-335F, -141F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-360F, -138F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 228, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-294F, -117F, 29F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 228, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-294F, -74F, 29F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 118, 71, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-66F, -117F, 29F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 228, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 9
		bodyModel[6].setRotationPoint(-294F, -143F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 228, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 10
		bodyModel[7].setRotationPoint(-294F, -141F, 19F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 228, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 11
		bodyModel[8].setRotationPoint(-294F, -139F, 23F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 228, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 12
		bodyModel[9].setRotationPoint(-294F, -135F, 27F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 228, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-294F, -131F, 29F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[11].setRotationPoint(-294F, -125F, 29F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[12].setRotationPoint(-275F, -125F, 29F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[13].setRotationPoint(-240F, -125F, 29F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 228, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[14].setRotationPoint(-294F, -46F, 29F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 140, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[15].setRotationPoint(-206F, -125F, 29F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[16].setRotationPoint(-294F, -82F, 29F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[17].setRotationPoint(-262F, -82F, 29F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 28, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[18].setRotationPoint(-230F, -82F, 29F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 22, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[19].setRotationPoint(-194F, -82F, 29F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[20].setRotationPoint(-164F, -82F, 29F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 65, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[21].setRotationPoint(-131F, -82F, 29F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[22].setRotationPoint(-288F, -125F, 29F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 31
		bodyModel[23].setRotationPoint(-279F, -125F, 29F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[24].setRotationPoint(-279F, -119F, 29F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[25].setRotationPoint(-288F, -119F, 29F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(-244F, -119F, 29F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[27].setRotationPoint(-252F, -119F, 29F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 36
		bodyModel[28].setRotationPoint(-244F, -125F, 29F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[29].setRotationPoint(-252F, -125F, 29F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[30].setRotationPoint(-208F, -119F, 29F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 39
		bodyModel[31].setRotationPoint(-208F, -125F, 29F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(-215F, -119F, 29F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[33].setRotationPoint(-215F, -125F, 29F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[34].setRotationPoint(-270F, -77F, 29F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[35].setRotationPoint(-265F, -77F, 29F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 44
		bodyModel[36].setRotationPoint(-265F, -82F, 29F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[37].setRotationPoint(-270F, -82F, 29F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 46
		bodyModel[38].setRotationPoint(-233F, -82F, 29F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(-238F, -82F, 29F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[40].setRotationPoint(-238F, -77F, 29F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[41].setRotationPoint(-233F, -77F, 29F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 50
		bodyModel[42].setRotationPoint(-197F, -82F, 29F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[43].setRotationPoint(-202F, -82F, 29F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[44].setRotationPoint(-202F, -77F, 29F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[45].setRotationPoint(-197F, -77F, 29F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 54
		bodyModel[46].setRotationPoint(-167F, -82F, 29F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[47].setRotationPoint(-172F, -82F, 29F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[48].setRotationPoint(-172F, -77F, 29F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[49].setRotationPoint(-167F, -77F, 29F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 58
		bodyModel[50].setRotationPoint(-134F, -82F, 29F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[51].setRotationPoint(-139F, -82F, 29F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[52].setRotationPoint(-139F, -77F, 29F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[53].setRotationPoint(-134F, -77F, 29F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 41, 16, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -3F); // Box 62
		bodyModel[54].setRotationPoint(-335F, -46F, 29F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 25, 11, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, -4F); // Box 63
		bodyModel[55].setRotationPoint(-360F, -46F, 26F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, -5F); // Box 65
		bodyModel[56].setRotationPoint(-381F, -46F, 22F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 118, 1, 9, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 67
		bodyModel[57].setRotationPoint(-66F, -143F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 41, 28, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 59
		bodyModel[58].setRotationPoint(-335F, -74F, 29F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 41, 33, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 60
		bodyModel[59].setRotationPoint(-335F, -107F, 29F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 41, 24, 1, 0F,0F, -5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 61
		bodyModel[60].setRotationPoint(-335F, -131F, 29F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 41, 4, 1, 0F,0F, -3F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 5F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 5F, -2F); // Box 63
		bodyModel[61].setRotationPoint(-335F, -135F, 27F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 41, 4, 1, 0F,0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 3F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 3F, 0F); // Box 64
		bodyModel[62].setRotationPoint(-335F, -139F, 23F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 41, 1, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, -2F); // Box 65
		bodyModel[63].setRotationPoint(-335F, -143F, 9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 41, 1, 5, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -3F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 3F, -4F); // Box 66
		bodyModel[64].setRotationPoint(-335F, -141F, 19F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 118, 1, 10, 0F,0F, 0F, 0F, 0F, -4F, 2F, 0F, -5F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 2F, 0F, 5F, -4F, 0F, 2F, 0F); // Box 68
		bodyModel[65].setRotationPoint(-66F, -143F, 9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 118, 1, 5, 0F,0F, 0F, 0F, 0F, -3F, 4F, 0F, -5F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, 4F, 0F, 4F, -4F, 0F, 1F, -1F); // Box 69
		bodyModel[66].setRotationPoint(-66F, -141F, 19F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 118, 4, 1, 0F,0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 4F); // Box 70
		bodyModel[67].setRotationPoint(-66F, -139F, 23F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 118, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 2F); // Box 71
		bodyModel[68].setRotationPoint(-66F, -135F, 27F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 118, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 72
		bodyModel[69].setRotationPoint(-66F, -131F, 29F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 118, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 73
		bodyModel[70].setRotationPoint(-66F, -125F, 29F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 228, 8, 60, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 2F, -21F, 0F, 2F, -21F, 0F, 0F, -21F); // Box 74
		bodyModel[71].setRotationPoint(-294F, -26F, -30F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 228, 7, 18, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); // Box 76
		bodyModel[72].setRotationPoint(-294F, -18F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 118, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 2F, 0F, -12F, -2F, 0F, 0F, 0F); // Box 90
		bodyModel[73].setRotationPoint(-66F, -46F, 29F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 118, 8, 60, 0F,0F, 0F, 0F, 0F, 12F, -2F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -12F, -23F, 0F, -12F, -23F, 0F, 0F, -21F); // Box 92
		bodyModel[74].setRotationPoint(-66F, -27F, -30F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 7, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[75].setRotationPoint(-67F, -27F, -29F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 118, 4, 18, 0F,0F, 0F, 0F, 0F, 12F, -2F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, 0F, -9F); // Box 95
		bodyModel[76].setRotationPoint(-66F, -19F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 228, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[77].setRotationPoint(-294F, -143F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 41, 1, 9, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[78].setRotationPoint(-335F, -141F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 228, 35, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[79].setRotationPoint(-294F, -117F, -30F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 228, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[80].setRotationPoint(-294F, -74F, -30F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 118, 71, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 101
		bodyModel[81].setRotationPoint(-66F, -117F, -30F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 228, 1, 10, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[82].setRotationPoint(-294F, -143F, -19F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 228, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[83].setRotationPoint(-294F, -141F, -24F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 228, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 104
		bodyModel[84].setRotationPoint(-294F, -139F, -24F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 228, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 105
		bodyModel[85].setRotationPoint(-294F, -135F, -28F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 228, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[86].setRotationPoint(-294F, -131F, -30F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[87].setRotationPoint(-294F, -125F, -30F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[88].setRotationPoint(-275F, -125F, -30F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[89].setRotationPoint(-240F, -125F, -30F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 228, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[90].setRotationPoint(-294F, -46F, -30F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 140, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[91].setRotationPoint(-206F, -125F, -30F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[92].setRotationPoint(-294F, -82F, -30F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 24, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[93].setRotationPoint(-262F, -82F, -30F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 28, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[94].setRotationPoint(-230F, -82F, -30F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 22, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[95].setRotationPoint(-194F, -82F, -30F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 25, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[96].setRotationPoint(-164F, -82F, -30F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 65, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[97].setRotationPoint(-131F, -82F, -30F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[98].setRotationPoint(-288F, -125F, -30F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 119
		bodyModel[99].setRotationPoint(-279F, -125F, -30F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[100].setRotationPoint(-279F, -119F, -30F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[101].setRotationPoint(-288F, -119F, -30F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[102].setRotationPoint(-244F, -119F, -30F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[103].setRotationPoint(-252F, -119F, -30F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 124
		bodyModel[104].setRotationPoint(-244F, -125F, -30F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[105].setRotationPoint(-252F, -125F, -30F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[106].setRotationPoint(-208F, -119F, -30F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 127
		bodyModel[107].setRotationPoint(-208F, -125F, -30F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[108].setRotationPoint(-215F, -119F, -30F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[109].setRotationPoint(-215F, -125F, -30F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[110].setRotationPoint(-270F, -77F, -30F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[111].setRotationPoint(-265F, -77F, -30F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 132
		bodyModel[112].setRotationPoint(-265F, -82F, -30F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[113].setRotationPoint(-270F, -82F, -30F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 134
		bodyModel[114].setRotationPoint(-233F, -82F, -30F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[115].setRotationPoint(-238F, -82F, -30F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[116].setRotationPoint(-238F, -77F, -30F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[117].setRotationPoint(-233F, -77F, -30F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 138
		bodyModel[118].setRotationPoint(-197F, -82F, -30F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[119].setRotationPoint(-202F, -82F, -30F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[120].setRotationPoint(-202F, -77F, -30F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[121].setRotationPoint(-197F, -77F, -30F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 142
		bodyModel[122].setRotationPoint(-167F, -82F, -30F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[123].setRotationPoint(-172F, -82F, -30F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[124].setRotationPoint(-172F, -77F, -30F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[125].setRotationPoint(-167F, -77F, -30F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 146
		bodyModel[126].setRotationPoint(-134F, -82F, -30F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[127].setRotationPoint(-139F, -82F, -30F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[128].setRotationPoint(-139F, -77F, -30F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[129].setRotationPoint(-134F, -77F, -30F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 41, 16, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 3F); // Box 150
		bodyModel[130].setRotationPoint(-335F, -46F, -30F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 118, 1, 9, 0F,0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[131].setRotationPoint(-66F, -143F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 41, 28, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 155
		bodyModel[132].setRotationPoint(-335F, -74F, -30F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 41, 4, 1, 0F,0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 4F, 0F, 5F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 5F, 2F); // Box 158
		bodyModel[133].setRotationPoint(-335F, -135F, -28F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 41, 4, 1, 0F,0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 3F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 3F, 0F); // Box 159
		bodyModel[134].setRotationPoint(-335F, -139F, -24F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 41, 1, 10, 0F,0F, -4F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 160
		bodyModel[135].setRotationPoint(-335F, -143F, -19F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 41, 1, 5, 0F,0F, -4F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 3F, -4F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 2F, 2F); // Box 161
		bodyModel[136].setRotationPoint(-335F, -141F, -24F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 118, 1, 10, 0F,0F, -2F, 0F, 0F, -5F, -4F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, -4F, 0F, 4F, 2F, 0F, 0F, 0F); // Box 162
		bodyModel[137].setRotationPoint(-66F, -143F, -19F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 118, 1, 5, 0F,0F, -2F, 0F, 0F, -5F, -3F, 0F, -3F, 4F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 4F, -4F, 0F, 3F, 4F, 0F, 0F, 0F); // Box 163
		bodyModel[138].setRotationPoint(-66F, -141F, -24F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 118, 4, 1, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, -4F); // Box 164
		bodyModel[139].setRotationPoint(-66F, -139F, -24F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 118, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, -2F); // Box 165
		bodyModel[140].setRotationPoint(-66F, -135F, -28F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 118, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 166
		bodyModel[141].setRotationPoint(-66F, -131F, -30F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 118, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 167
		bodyModel[142].setRotationPoint(-66F, -125F, -30F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 118, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, 2F, 0F, 0F, 0F); // Box 168
		bodyModel[143].setRotationPoint(-66F, -46F, -30F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 41, 8, 54, 0F,0F, 0F, 0F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 4F, -18F, 0F, 4F, -18F, 0F, 0F, -21F); // Box 172
		bodyModel[144].setRotationPoint(-335F, -30F, -27F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 41, 8, 12, 0F,0F, 0F, 0F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 3F, -6F, 0F, 3F, -6F, 0F, 0F, -6F); // Box 173
		bodyModel[145].setRotationPoint(-335F, -22F, -6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 160, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[146].setRotationPoint(-294F, -96F, -29F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 35, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[147].setRotationPoint(-135F, -131F, -29F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 58, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[148].setRotationPoint(-135F, -135F, -29F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 54, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[149].setRotationPoint(-135F, -139F, -27F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 46, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[150].setRotationPoint(-135F, -140F, -23F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 38, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[151].setRotationPoint(-135F, -141F, -19F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 27, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[152].setRotationPoint(-135F, -142F, -13F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 41, 1, 58, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 202
		bodyModel[153].setRotationPoint(-335F, -96F, -29F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 227, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[154].setRotationPoint(-294F, -27F, -29F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 25, 61, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 271
		bodyModel[155].setRotationPoint(-360F, -107F, 26F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 21, 61, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 272
		bodyModel[156].setRotationPoint(-381F, -107F, 22F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 25, 11, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 4F); // Box 278
		bodyModel[157].setRotationPoint(-360F, -46F, -27F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 21, 5, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 5F); // Box 279
		bodyModel[158].setRotationPoint(-381F, -46F, -23F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -1F, -6F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 6F); // Box 280
		bodyModel[159].setRotationPoint(-396F, -46F, -18F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 25, 61, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 281
		bodyModel[160].setRotationPoint(-360F, -107F, -27F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 21, 61, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 282
		bodyModel[161].setRotationPoint(-381F, -107F, -23F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 15, 61, 1, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 283
		bodyModel[162].setRotationPoint(-396F, -107F, -18F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 14, 47, 1, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 285
		bodyModel[163].setRotationPoint(-410F, -107F, -12F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 7, 32, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F); // Box 288
		bodyModel[164].setRotationPoint(-417F, -92F, -5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 6F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, -6F); // Box 289
		bodyModel[165].setRotationPoint(-396F, -46F, 17F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 15, 61, 1, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 290
		bodyModel[166].setRotationPoint(-396F, -107F, 17F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 14, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, -15F, 0F); // Box 291
		bodyModel[167].setRotationPoint(-410F, -60F, 4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 14, 47, 1, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 292
		bodyModel[168].setRotationPoint(-410F, -107F, 11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 25, 8, 46, 0F,0F, 0F, 0F, 0F, -5F, 4F, 0F, -5F, 4F, 0F, 0F, 0F, 3F, 1F, -20F, 0F, 5F, -17F, 0F, 5F, -17F, 3F, 1F, -20F); // Box 306
		bodyModel[169].setRotationPoint(-360F, -35F, -23F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 28, 11, 6, 0F,0F, -1F, 0F, 0F, -5F, 3F, 0F, -5F, 3F, 0F, -1F, 0F, 4F, 0F, -3F, 0F, 2F, -3F, 0F, 2F, -3F, 4F, 0F, -3F); // Box 313
		bodyModel[170].setRotationPoint(-363F, -27F, -3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 20, 8, 36, 0F,0F, 0F, 0F, 1F, -6F, 5F, 1F, -6F, 5F, 0F, 0F, 0F, 3F, 1F, -17F, -2F, 7F, -15F, -2F, 7F, -15F, 3F, 1F, -17F); // Box 314
		bodyModel[171].setRotationPoint(-381F, -41F, -18F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 21, 11, 6, 0F,0F, -1F, -2F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -1F, -2F, 3F, -1F, -3F, -4F, 6F, -3F, -4F, 6F, -3F, 3F, -1F, -3F); // Box 315
		bodyModel[172].setRotationPoint(-384F, -33F, -3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 14, 8, 24, 0F,0F, 0F, 0F, 1F, -4F, 6F, 1F, -4F, 6F, 0F, 0F, 0F, 1F, -3F, -11F, -2F, 5F, -11F, -2F, 5F, -11F, 1F, -3F, -11F); // Box 316
		bodyModel[173].setRotationPoint(-396F, -45F, -12F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 13, 11, 6, 0F,0F, -1F, -2F, 0F, -9F, -2F, 0F, -9F, -2F, 0F, -1F, -2F, 1F, -1F, -3F, -3F, 7F, -3F, -3F, 7F, -3F, 1F, -1F, -3F); // Box 317
		bodyModel[174].setRotationPoint(-397F, -41F, -3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 14, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, -15F, 0F); // Box 297
		bodyModel[175].setRotationPoint(-410F, -60F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 14, 8, 10, 0F,0F, 0F, 0F, 0F, -15F, 7F, 0F, -15F, 7F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 12F, -4F, -1F, 12F, -4F, -1F, 0F, -4F); // Box 298
		bodyModel[176].setRotationPoint(-410F, -60F, -5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 13, 11, 6, 0F,0F, -1F, -2F, -1F, -13F, -2F, -1F, -13F, -2F, 0F, -1F, -2F, 0F, -10F, -2F, -2F, 11F, -3F, -2F, 11F, -3F, 0F, -10F, -2F); // Box 299
		bodyModel[177].setRotationPoint(-409F, -53F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 8, 10, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -3F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, -4F, -3F, 0F, -4F); // Box 300
		bodyModel[178].setRotationPoint(-412F, -60F, -5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 25, 1, 8, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 2F, -1F); // Box 301
		bodyModel[179].setRotationPoint(-360F, -138F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F,0F, -2F, 2F, 0F, 1F, 1F, 0F, -1F, -2F, 0F, -4F, -4F, 0F, 2F, 2F, 0F, -1F, 1F, 0F, 0F, -3F, 0F, 3F, -5F); // Box 302
		bodyModel[180].setRotationPoint(-360F, -138F, 18F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 25, 4, 1, 0F,0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 0F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 3F, 0F); // Box 303
		bodyModel[181].setRotationPoint(-360F, -137F, 20F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 25, 18, 1, 0F,0F, -5F, 2F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, -5F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F); // Box 305
		bodyModel[182].setRotationPoint(-360F, -125F, 24F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 25, 61, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 306
		bodyModel[183].setRotationPoint(-360F, -107F, 26F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 25, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[184].setRotationPoint(-360F, -138F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 41, 33, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 309
		bodyModel[185].setRotationPoint(-335F, -107F, -30F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 41, 24, 1, 0F,0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 310
		bodyModel[186].setRotationPoint(-335F, -131F, -30F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 25, 1, 8, 0F,0F, -2F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[187].setRotationPoint(-360F, -138F, -17F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 25, 1, 5, 0F,0F, -4F, -4F, 0F, -1F, -2F, 0F, 1F, 1F, 0F, -2F, 2F, 0F, 3F, -5F, 0F, 0F, -3F, 0F, -1F, 1F, 0F, 2F, 2F); // Box 312
		bodyModel[188].setRotationPoint(-360F, -138F, -23F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 25, 4, 1, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, 0F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 3F, 0F); // Box 313
		bodyModel[189].setRotationPoint(-360F, -137F, -21F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F,0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 7F, 1F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 7F, -1F); // Box 316
		bodyModel[190].setRotationPoint(-360F, -132F, 23F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 7, 24, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 320
		bodyModel[191].setRotationPoint(-417F, -116F, -5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 21, 13, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 322
		bodyModel[192].setRotationPoint(-381F, -120F, 22F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 25, 18, 1, 0F,0F, -5F, -2F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, -5F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F); // Box 323
		bodyModel[193].setRotationPoint(-360F, -125F, -25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 25, 5, 1, 0F,0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 7F, -1F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 7F, 1F); // Box 324
		bodyModel[194].setRotationPoint(-360F, -132F, -24F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, -2F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 325
		bodyModel[195].setRotationPoint(-396F, -120F, 17F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F,0F, 0F, 7F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 326
		bodyModel[196].setRotationPoint(-410F, -116F, 11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 327
		bodyModel[197].setRotationPoint(-410F, -121F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 328
		bodyModel[198].setRotationPoint(-396F, -122F, -3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, 0F, 1F, 0F, 1F, -1F, 0F, -1F, 2F, 0F, -2F, -2F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 1F, -3F); // Box 329
		bodyModel[199].setRotationPoint(-410F, -121F, 2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, 1F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, 7F, 0F, 0F, 0F); // Box 330
		bodyModel[200].setRotationPoint(-410F, -119F, 4F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 3F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 2F, 0F, 1F, 0F); // Box 331
		bodyModel[201].setRotationPoint(-396F, -122F, 3F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -3F, -10F, 0F, -3F, 10F, 0F, -1F, 4F); // Box 332
		bodyModel[202].setRotationPoint(-396F, -120F, 7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -10F, 0F, 0F, -11F, 0F, 0F, 11F, 0F, 0F, 10F); // Box 333
		bodyModel[203].setRotationPoint(-381F, -122F, 7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 14, 1, 4, 0F,0F, -2F, -2F, 0F, -1F, 2F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, 0F, 1F); // Box 334
		bodyModel[204].setRotationPoint(-410F, -121F, -6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, -1F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 7F, 0F, -2F, -7F, 0F, 0F, 0F); // Box 335
		bodyModel[205].setRotationPoint(-410F, -119F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -2F, 1F, 0F, 0F, 3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 2F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 336
		bodyModel[206].setRotationPoint(-396F, -122F, -7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -3F, 10F, 0F, -3F, -10F, 0F, -1F, -4F); // Box 337
		bodyModel[207].setRotationPoint(-396F, -120F, -8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 10F, 0F, 0F, 11F, 0F, 0F, -11F, 0F, 0F, -10F); // Box 338
		bodyModel[208].setRotationPoint(-381F, -122F, -8F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 21, 13, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 339
		bodyModel[209].setRotationPoint(-381F, -120F, -23F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 15, 13, 1, 0F,0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 340
		bodyModel[210].setRotationPoint(-396F, -120F, -18F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 14, 9, 1, 0F,0F, 0F, -7F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 341
		bodyModel[211].setRotationPoint(-410F, -116F, -12F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F,-3F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 342
		bodyModel[212].setRotationPoint(-417F, -119F, -5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,-4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 343
		bodyModel[213].setRotationPoint(-414F, -121F, -4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 8F, 0F); // Box 373
		bodyModel[214].setRotationPoint(-54F, -28F, -27F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 8F, 0F); // Box 374
		bodyModel[215].setRotationPoint(-37F, -30F, -27F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 8F, 0F); // Box 375
		bodyModel[216].setRotationPoint(-22F, -31F, -27F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 4F, 8F, 0F); // Box 376
		bodyModel[217].setRotationPoint(-5F, -33F, -27F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 4F, 9F, 0F); // Box 377
		bodyModel[218].setRotationPoint(12F, -35F, -27F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 4F, 9F, 0F); // Box 378
		bodyModel[219].setRotationPoint(28F, -37F, -27F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, 0F, 0F, 1F, 1F, 0F, 1F, -8F, 0F, 0F, -9F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 4F, 9F, 0F); // Box 379
		bodyModel[220].setRotationPoint(45F, -39F, -27F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, -9F, 0F, 1F, -8F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 380
		bodyModel[221].setRotationPoint(-54F, -28F, 0F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, -9F, 0F, 1F, -8F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 381
		bodyModel[222].setRotationPoint(-37F, -30F, 0F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, -9F, 0F, 1F, -8F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 382
		bodyModel[223].setRotationPoint(-22F, -31F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, -9F, 0F, 1F, -8F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 4F, 8F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 383
		bodyModel[224].setRotationPoint(-5F, -33F, 0F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, -9F, 0F, 1F, -8F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 4F, 9F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 384
		bodyModel[225].setRotationPoint(12F, -35F, 0F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, -9F, 0F, 1F, -8F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 4F, 9F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 385
		bodyModel[226].setRotationPoint(28F, -37F, 0F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 9, 2, 27, 0F,0F, -9F, 0F, 1F, -8F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 4F, 9F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 386
		bodyModel[227].setRotationPoint(45F, -39F, 0F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[228].setRotationPoint(-370F, -134F, 6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 623
		bodyModel[229].setRotationPoint(-376F, -130F, 5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 7F, -2F, 0F, 7F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, 2F, 0F, 0F, 0F); // Box 624
		bodyModel[230].setRotationPoint(-381F, -123F, 3F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[231].setRotationPoint(-370F, -134F, -7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 626
		bodyModel[232].setRotationPoint(-376F, -130F, -6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 7F, 2F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 0F, -7F, -2F, 0F, 0F, 0F); // Box 627
		bodyModel[233].setRotationPoint(-381F, -123F, -4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[234].setRotationPoint(-370F, -132F, 15F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 629
		bodyModel[235].setRotationPoint(-376F, -128F, 14F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 7F, -2F, 0F, 7F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, 2F, 0F, 0F, 0F); // Box 630
		bodyModel[236].setRotationPoint(-381F, -121F, 12F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[237].setRotationPoint(-370F, -132F, -16F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 1F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 632
		bodyModel[238].setRotationPoint(-376F, -128F, -15F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 7F, 2F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 0F, -7F, -2F, 0F, 0F, 0F); // Box 633
		bodyModel[239].setRotationPoint(-381F, -121F, -13F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 634
		bodyModel[240].setRotationPoint(-369F, -128F, 18F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 1F, 0F, -1F); // Box 635
		bodyModel[241].setRotationPoint(-375F, -128F, 15F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 636
		bodyModel[242].setRotationPoint(-376F, -130F, 6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 637
		bodyModel[243].setRotationPoint(-376F, -130F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 638
		bodyModel[244].setRotationPoint(-369F, -128F, -19F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,1F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 639
		bodyModel[245].setRotationPoint(-375F, -128F, -16F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 640
		bodyModel[246].setRotationPoint(-376F, -130F, -15F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 0F, 2F, -1F, 0F, 2F, -1F, 1F, -3F, 1F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F); // Box 641
		bodyModel[247].setRotationPoint(-369F, -131F, 18F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.2F, 0F, 0F, 2F, 0F, 0F, 1.8F); // Box 642
		bodyModel[248].setRotationPoint(-369F, -128F, 18F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 2F, 0F, 0F, -2.2F, 0F, 0F, -2F); // Box 643
		bodyModel[249].setRotationPoint(-369F, -128F, -19F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 644
		bodyModel[250].setRotationPoint(-370F, -134F, 7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[251].setRotationPoint(-370F, -134F, -7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		bodyModel[252].setRotationPoint(-370F, -134F, -15F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 1F, -3F, -1F, 1F, -3F, -1F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 647
		bodyModel[253].setRotationPoint(-369F, -131F, -19F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 25, 1, 52, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 648
		bodyModel[254].setRotationPoint(-360F, -96F, -26F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 21, 1, 44, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 649
		bodyModel[255].setRotationPoint(-381F, -96F, -22F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 15, 55, 34, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -6F); // Box 650
		bodyModel[256].setRotationPoint(-396F, -96F, -17F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 14, 36, 22, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 651
		bodyModel[257].setRotationPoint(-410F, -96F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 24, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		bodyModel[258].setRotationPoint(-382F, -120F, -17F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 34, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		bodyModel[259].setRotationPoint(-382F, -122F, -17F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[260].setRotationPoint(-294F, -131F, -29F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[261].setRotationPoint(-294F, -135F, -29F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[262].setRotationPoint(-294F, -139F, -27F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 657
		bodyModel[263].setRotationPoint(-294F, -140F, -23F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 658
		bodyModel[264].setRotationPoint(-294F, -140F, -19F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[265].setRotationPoint(-294F, -142F, -9F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[266].setRotationPoint(-294F, -131F, 27F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 661
		bodyModel[267].setRotationPoint(-294F, -135F, 27F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[268].setRotationPoint(-294F, -139F, 25F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 663
		bodyModel[269].setRotationPoint(-294F, -140F, 19F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		bodyModel[270].setRotationPoint(-294F, -140F, 9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 665
		bodyModel[271].setRotationPoint(-238F, -131F, 27F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		bodyModel[272].setRotationPoint(-238F, -135F, 27F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		bodyModel[273].setRotationPoint(-238F, -139F, 25F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 668
		bodyModel[274].setRotationPoint(-238F, -140F, 19F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		bodyModel[275].setRotationPoint(-238F, -140F, 9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		bodyModel[276].setRotationPoint(-238F, -142F, -9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 671
		bodyModel[277].setRotationPoint(-238F, -140F, -19F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		bodyModel[278].setRotationPoint(-238F, -139F, -27F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 673
		bodyModel[279].setRotationPoint(-238F, -140F, -23F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		bodyModel[280].setRotationPoint(-238F, -135F, -29F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		bodyModel[281].setRotationPoint(-238F, -131F, -29F);

		bodyModel[282].addShapeBox(0F, 0F, -2F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		bodyModel[282].setRotationPoint(-174F, -131F, 29F);

		bodyModel[283].addShapeBox(0F, 0F, -2F, 3, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		bodyModel[283].setRotationPoint(-174F, -135F, 29F);

		bodyModel[284].addShapeBox(0F, 0F, -2F, 3, 4, 2, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		bodyModel[284].setRotationPoint(-174F, -139F, 27F);

		bodyModel[285].addShapeBox(0F, 0F, -2F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 679
		bodyModel[285].setRotationPoint(-174F, -140F, 21F);

		bodyModel[286].addShapeBox(0F, 0F, -2F, 3, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 680
		bodyModel[286].setRotationPoint(-174F, -140F, 11F);

		bodyModel[287].addShapeBox(0F, 0F, -2F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 681
		bodyModel[287].setRotationPoint(-174F, -142F, -7F);

		bodyModel[288].addShapeBox(0F, 0F, -2F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 682
		bodyModel[288].setRotationPoint(-174F, -140F, -17F);

		bodyModel[289].addShapeBox(0F, 0F, -2F, 3, 4, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 683
		bodyModel[289].setRotationPoint(-174F, -139F, -25F);

		bodyModel[290].addShapeBox(0F, 0F, -2F, 3, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 684
		bodyModel[290].setRotationPoint(-174F, -140F, -21F);

		bodyModel[291].addShapeBox(0F, 0F, -2F, 3, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		bodyModel[291].setRotationPoint(-174F, -135F, -27F);

		bodyModel[292].addShapeBox(0F, 0F, -2F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 686
		bodyModel[292].setRotationPoint(-174F, -131F, -27F);

		bodyModel[293].addShapeBox(0F, 0F, -2F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 687
		bodyModel[293].setRotationPoint(-269F, -131F, 29F);

		bodyModel[294].addShapeBox(0F, 0F, -2F, 3, 4, 2, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 688
		bodyModel[294].setRotationPoint(-269F, -135F, 29F);

		bodyModel[295].addShapeBox(0F, 0F, -2F, 3, 4, 2, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 689
		bodyModel[295].setRotationPoint(-269F, -139F, 27F);

		bodyModel[296].addShapeBox(0F, 0F, -2F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 690
		bodyModel[296].setRotationPoint(-269F, -140F, 21F);

		bodyModel[297].addShapeBox(0F, 0F, -2F, 3, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		bodyModel[297].setRotationPoint(-269F, -140F, 11F);

		bodyModel[298].addShapeBox(0F, 0F, -2F, 3, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 692
		bodyModel[298].setRotationPoint(-269F, -142F, -7F);

		bodyModel[299].addShapeBox(0F, 0F, -2F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 693
		bodyModel[299].setRotationPoint(-269F, -140F, -17F);

		bodyModel[300].addShapeBox(0F, 0F, -2F, 3, 4, 2, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		bodyModel[300].setRotationPoint(-269F, -139F, -25F);

		bodyModel[301].addShapeBox(0F, 0F, -2F, 3, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 695
		bodyModel[301].setRotationPoint(-269F, -140F, -21F);

		bodyModel[302].addShapeBox(0F, 0F, -2F, 3, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		bodyModel[302].setRotationPoint(-269F, -135F, -27F);

		bodyModel[303].addShapeBox(0F, 0F, -2F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		bodyModel[303].setRotationPoint(-269F, -131F, -27F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 8, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		bodyModel[304].setRotationPoint(-381F, -120F, -17F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		bodyModel[305].setRotationPoint(-381F, -112F, -17F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 700
		bodyModel[306].setRotationPoint(-381F, -112F, -9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 701
		bodyModel[307].setRotationPoint(-381F, -112F, 12F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		bodyModel[308].setRotationPoint(-377.9F, -119F, -15F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 703
		bodyModel[309].setRotationPoint(-377.9F, -114F, -14F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		bodyModel[310].setRotationPoint(-377.9F, -114F, -12F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		bodyModel[311].setRotationPoint(-377.9F, -116F, -14F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 725
		bodyModel[312].setRotationPoint(-381F, -111F, 10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		bodyModel[313].setRotationPoint(-377.9F, -114F, -16F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		bodyModel[314].setRotationPoint(-377.9F, -114F, -5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		bodyModel[315].setRotationPoint(-377.9F, -114F, -9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		bodyModel[316].setRotationPoint(-377.9F, -114F, -7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		bodyModel[317].setRotationPoint(-377.9F, -116F, -7F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[318].setRotationPoint(-377.9F, -119F, -8F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		bodyModel[319].setRotationPoint(-377.9F, -114F, 1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[320].setRotationPoint(-377.9F, -114F, -3F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[321].setRotationPoint(-377.9F, -114F, -1F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		bodyModel[322].setRotationPoint(-377.9F, -116F, -1F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 736
		bodyModel[323].setRotationPoint(-377.9F, -119F, -2F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		bodyModel[324].setRotationPoint(-377.9F, -114F, 7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 738
		bodyModel[325].setRotationPoint(-377.9F, -114F, 3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 739
		bodyModel[326].setRotationPoint(-377.9F, -114F, 5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 740
		bodyModel[327].setRotationPoint(-377.9F, -116F, 5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 741
		bodyModel[328].setRotationPoint(-377.9F, -119F, 4F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		bodyModel[329].setRotationPoint(-377.9F, -114F, 14F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 743
		bodyModel[330].setRotationPoint(-377.9F, -114F, 10F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		bodyModel[331].setRotationPoint(-377.9F, -114F, 12F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		bodyModel[332].setRotationPoint(-377.9F, -116F, 12F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[333].setRotationPoint(-377.9F, -119F, 11F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[334].setRotationPoint(-381F, -111F, -11F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 5, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[335].setRotationPoint(-381F, -102F, -4F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		bodyModel[336].setRotationPoint(-381F, -104F, -4F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[337].setRotationPoint(-381F, -107F, -4F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 751
		bodyModel[338].setRotationPoint(-381F, -105F, -4F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 752
		bodyModel[339].setRotationPoint(-375F, -105F, -3F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[340].setRotationPoint(-375F, -105F, 2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		bodyModel[341].setRotationPoint(-373F, -105F, -4F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 755
		bodyModel[342].setRotationPoint(-368F, -102F, -13F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[343].setRotationPoint(-370F, -103F, -15F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 757
		bodyModel[344].setRotationPoint(-359F, -115F, -15F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		bodyModel[345].setRotationPoint(-370F, -104F, -15F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 759
		bodyModel[346].setRotationPoint(-370F, -104F, -6F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 760
		bodyModel[347].setRotationPoint(-360F, -115F, -15F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 761
		bodyModel[348].setRotationPoint(-360F, -115F, -6F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 762
		bodyModel[349].setRotationPoint(-360F, -115F, 14F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 763
		bodyModel[350].setRotationPoint(-368F, -102F, 7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		bodyModel[351].setRotationPoint(-370F, -104F, 14F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		bodyModel[352].setRotationPoint(-370F, -103F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 766
		bodyModel[353].setRotationPoint(-359F, -115F, 5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[354].setRotationPoint(-370F, -104F, 5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 768
		bodyModel[355].setRotationPoint(-360F, -115F, 5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 769
		bodyModel[356].setRotationPoint(-371F, -112F, -14F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 770
		bodyModel[357].setRotationPoint(-371F, -115F, -14F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		bodyModel[358].setRotationPoint(-371F, -115F, -8F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 772
		bodyModel[359].setRotationPoint(-371F, -112F, 7F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		bodyModel[360].setRotationPoint(-371F, -115F, 13F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		bodyModel[361].setRotationPoint(-371F, -115F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 46, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		bodyModel[362].setRotationPoint(-230F, -110F, 16F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 50, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		bodyModel[363].setRotationPoint(-232F, -111F, 14F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 46, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 777
		bodyModel[364].setRotationPoint(-230F, -110F, -27F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 50, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 778
		bodyModel[365].setRotationPoint(-232F, -111F, -29F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 16, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		bodyModel[366].setRotationPoint(-288F, -110F, 20F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
		bodyModel[367].setRotationPoint(-290F, -111F, 18F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 16, 14, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		bodyModel[368].setRotationPoint(-257F, -110F, -28F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 20, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		bodyModel[369].setRotationPoint(-259F, -111F, -29F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 8, 14, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		bodyModel[370].setRotationPoint(-320F, -110F, -26F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 16, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		bodyModel[371].setRotationPoint(-322F, -111F, -27F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 785
		bodyModel[372].setRotationPoint(-304F, -102F, -21F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 786
		bodyModel[373].setRotationPoint(-295F, -115F, -23F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		bodyModel[374].setRotationPoint(-306F, -103F, -23F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		bodyModel[375].setRotationPoint(-306F, -104F, -23F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 789
		bodyModel[376].setRotationPoint(-296F, -115F, -23F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		bodyModel[377].setRotationPoint(-306F, -104F, -14F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 791
		bodyModel[378].setRotationPoint(-296F, -115F, -14F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 792
		bodyModel[379].setRotationPoint(-284F, -102F, 9F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 793
		bodyModel[380].setRotationPoint(-286F, -115F, 5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 794
		bodyModel[381].setRotationPoint(-286F, -103F, 7F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 795
		bodyModel[382].setRotationPoint(-286F, -104F, 7F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 796
		bodyModel[383].setRotationPoint(-286F, -115F, 6F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		bodyModel[384].setRotationPoint(-277F, -104F, 7F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 798
		bodyModel[385].setRotationPoint(-277F, -115F, 6F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 799
		bodyModel[386].setRotationPoint(-254F, -115F, -8F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 800
		bodyModel[387].setRotationPoint(-254F, -115F, -7F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 801
		bodyModel[388].setRotationPoint(-245F, -115F, -8F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		bodyModel[389].setRotationPoint(-254F, -103F, -18F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 803
		bodyModel[390].setRotationPoint(-245F, -104F, -18F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 804
		bodyModel[391].setRotationPoint(-254F, -104F, -18F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 805
		bodyModel[392].setRotationPoint(-252F, -102F, -16F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 13, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		bodyModel[393].setRotationPoint(-227F, -117F, 18F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		bodyModel[394].setRotationPoint(-210F, -117F, 20F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 13, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		bodyModel[395].setRotationPoint(-199F, -117F, 18F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		bodyModel[396].setRotationPoint(-284F, -115F, 22F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		bodyModel[397].setRotationPoint(-252F, -115F, -28F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		bodyModel[398].setRotationPoint(-223F, -115F, -28F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 8, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		bodyModel[399].setRotationPoint(-193F, -117F, -25F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 13, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
		bodyModel[400].setRotationPoint(-210F, -117F, -24F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 35, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 878
		bodyModel[401].setRotationPoint(-109F, -95F, -29F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 35, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		bodyModel[402].setRotationPoint(-109F, -61F, -29F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 26, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 880
		bodyModel[403].setRotationPoint(-134F, -96F, -29F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 3569, 17, textureX, textureY); // Box 66
		tailModel[1] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 67
		tailModel[2] = new ModelRendererTurbo(this, 2305, 89, textureX, textureY); // Box 169
		tailModel[3] = new ModelRendererTurbo(this, 3553, 89, textureX, textureY); // Box 170
		tailModel[4] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 171
		tailModel[5] = new ModelRendererTurbo(this, 1417, 97, textureX, textureY); // Box 172
		tailModel[6] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 173
		tailModel[7] = new ModelRendererTurbo(this, 1417, 105, textureX, textureY); // Box 174
		tailModel[8] = new ModelRendererTurbo(this, 2681, 105, textureX, textureY); // Box 175
		tailModel[9] = new ModelRendererTurbo(this, 3017, 105, textureX, textureY); // Box 177
		tailModel[10] = new ModelRendererTurbo(this, 3449, 105, textureX, textureY); // Box 178
		tailModel[11] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 181
		tailModel[12] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 182
		tailModel[13] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 183
		tailModel[14] = new ModelRendererTurbo(this, 1129, 113, textureX, textureY); // Box 184
		tailModel[15] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 185
		tailModel[16] = new ModelRendererTurbo(this, 1129, 121, textureX, textureY); // Box 186
		tailModel[17] = new ModelRendererTurbo(this, 1505, 121, textureX, textureY); // Box 187
		tailModel[18] = new ModelRendererTurbo(this, 1897, 121, textureX, textureY); // Box 190
		tailModel[19] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 184
		tailModel[20] = new ModelRendererTurbo(this, 2681, 89, textureX, textureY); // Box 204
		tailModel[21] = new ModelRendererTurbo(this, 3513, 129, textureX, textureY); // Box 205
		tailModel[22] = new ModelRendererTurbo(this, 2297, 169, textureX, textureY); // Box 206
		tailModel[23] = new ModelRendererTurbo(this, 2297, 177, textureX, textureY); // Box 207
		tailModel[24] = new ModelRendererTurbo(this, 2297, 185, textureX, textureY); // Box 208
		tailModel[25] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 209
		tailModel[26] = new ModelRendererTurbo(this, 1937, 137, textureX, textureY); // Box 210
		tailModel[27] = new ModelRendererTurbo(this, 2065, 65, textureX, textureY); // Box 211
		tailModel[28] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 212
		tailModel[29] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 213
		tailModel[30] = new ModelRendererTurbo(this, 2681, 97, textureX, textureY); // Box 214
		tailModel[31] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 215
		tailModel[32] = new ModelRendererTurbo(this, 3761, 145, textureX, textureY); // Box 216
		tailModel[33] = new ModelRendererTurbo(this, 1937, 161, textureX, textureY); // Box 217
		tailModel[34] = new ModelRendererTurbo(this, 3761, 161, textureX, textureY); // Box 218
		tailModel[35] = new ModelRendererTurbo(this, 1505, 113, textureX, textureY); // Box 219
		tailModel[36] = new ModelRendererTurbo(this, 2065, 113, textureX, textureY); // Box 220
		tailModel[37] = new ModelRendererTurbo(this, 1937, 177, textureX, textureY); // Box 221
		tailModel[38] = new ModelRendererTurbo(this, 3169, 177, textureX, textureY); // Box 222
		tailModel[39] = new ModelRendererTurbo(this, 3513, 177, textureX, textureY); // Box 223
		tailModel[40] = new ModelRendererTurbo(this, 3761, 177, textureX, textureY); // Box 224
		tailModel[41] = new ModelRendererTurbo(this, 1937, 185, textureX, textureY); // Box 226
		tailModel[42] = new ModelRendererTurbo(this, 3169, 185, textureX, textureY); // Box 227
		tailModel[43] = new ModelRendererTurbo(this, 729, 193, textureX, textureY); // Box 228
		tailModel[44] = new ModelRendererTurbo(this, 1105, 193, textureX, textureY); // Box 229
		tailModel[45] = new ModelRendererTurbo(this, 1937, 193, textureX, textureY); // Box 230
		tailModel[46] = new ModelRendererTurbo(this, 2297, 193, textureX, textureY); // Box 231
		tailModel[47] = new ModelRendererTurbo(this, 3169, 193, textureX, textureY); // Box 232
		tailModel[48] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 233
		tailModel[49] = new ModelRendererTurbo(this, 3513, 193, textureX, textureY); // Box 234
		tailModel[50] = new ModelRendererTurbo(this, 729, 201, textureX, textureY); // Box 235
		tailModel[51] = new ModelRendererTurbo(this, 1105, 201, textureX, textureY); // Box 236
		tailModel[52] = new ModelRendererTurbo(this, 1457, 201, textureX, textureY); // Box 237
		tailModel[53] = new ModelRendererTurbo(this, 1681, 201, textureX, textureY); // Box 238
		tailModel[54] = new ModelRendererTurbo(this, 1937, 201, textureX, textureY); // Box 237
		tailModel[55] = new ModelRendererTurbo(this, 2961, 121, textureX, textureY); // Box 239
		tailModel[56] = new ModelRendererTurbo(this, 3753, 1, textureX, textureY); // Box 238
		tailModel[57] = new ModelRendererTurbo(this, 793, 129, textureX, textureY); // Box 239
		tailModel[58] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Box 240
		tailModel[59] = new ModelRendererTurbo(this, 2169, 137, textureX, textureY); // Box 241
		tailModel[60] = new ModelRendererTurbo(this, 2297, 201, textureX, textureY); // Box 242
		tailModel[61] = new ModelRendererTurbo(this, 1553, 49, textureX, textureY); // Box 243
		tailModel[62] = new ModelRendererTurbo(this, 3009, 49, textureX, textureY); // Box 244
		tailModel[63] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 246
		tailModel[64] = new ModelRendererTurbo(this, 2457, 201, textureX, textureY); // Box 247
		tailModel[65] = new ModelRendererTurbo(this, 3001, 121, textureX, textureY); // Box 248
		tailModel[66] = new ModelRendererTurbo(this, 3169, 201, textureX, textureY); // Box 249
		tailModel[67] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 250
		tailModel[68] = new ModelRendererTurbo(this, 3513, 201, textureX, textureY); // Box 252
		tailModel[69] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 268
		tailModel[70] = new ModelRendererTurbo(this, 3921, 97, textureX, textureY); // Box 269
		tailModel[71] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 293
		tailModel[72] = new ModelRendererTurbo(this, 2129, 161, textureX, textureY); // Box 294
		tailModel[73] = new ModelRendererTurbo(this, 2961, 121, textureX, textureY); // Box 295
		tailModel[74] = new ModelRendererTurbo(this, 3049, 193, textureX, textureY); // Box 296
		tailModel[75] = new ModelRendererTurbo(this, 1249, 129, textureX, textureY); // Box 297
		tailModel[76] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 298
		tailModel[77] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 299
		tailModel[78] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 300
		tailModel[79] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 301
		tailModel[80] = new ModelRendererTurbo(this, 3945, 193, textureX, textureY); // Box 303
		tailModel[81] = new ModelRendererTurbo(this, 2065, 33, textureX, textureY); // Box 304
		tailModel[82] = new ModelRendererTurbo(this, 1457, 209, textureX, textureY); // Box 344
		tailModel[83] = new ModelRendererTurbo(this, 1457, 225, textureX, textureY); // Box 345
		tailModel[84] = new ModelRendererTurbo(this, 1105, 209, textureX, textureY); // Box 346
		tailModel[85] = new ModelRendererTurbo(this, 2297, 225, textureX, textureY); // Box 347
		tailModel[86] = new ModelRendererTurbo(this, 1105, 217, textureX, textureY); // Box 348
		tailModel[87] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Box 351
		tailModel[88] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 352
		tailModel[89] = new ModelRendererTurbo(this, 4073, 49, textureX, textureY); // Box 353
		tailModel[90] = new ModelRendererTurbo(this, 2953, 89, textureX, textureY); // Box 354
		tailModel[91] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 355
		tailModel[92] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 356
		tailModel[93] = new ModelRendererTurbo(this, 2417, 25, textureX, textureY); // Box 357
		tailModel[94] = new ModelRendererTurbo(this, 1105, 153, textureX, textureY); // Box 358
		tailModel[95] = new ModelRendererTurbo(this, 3489, 89, textureX, textureY); // Box 359
		tailModel[96] = new ModelRendererTurbo(this, 3561, 25, textureX, textureY); // Box 360
		tailModel[97] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 362
		tailModel[98] = new ModelRendererTurbo(this, 1841, 153, textureX, textureY); // Box 363
		tailModel[99] = new ModelRendererTurbo(this, 4065, 121, textureX, textureY); // Box 364
		tailModel[100] = new ModelRendererTurbo(this, 353, 505, textureX, textureY); // Box 365
		tailModel[101] = new ModelRendererTurbo(this, 2809, 209, textureX, textureY); // Box 366
		tailModel[102] = new ModelRendererTurbo(this, 2385, 241, textureX, textureY); // Box 367
		tailModel[103] = new ModelRendererTurbo(this, 833, 505, textureX, textureY); // Box 369
		tailModel[104] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 370
		tailModel[105] = new ModelRendererTurbo(this, 1473, 385, textureX, textureY); // Box 371
		tailModel[106] = new ModelRendererTurbo(this, 1073, 521, textureX, textureY); // Box 372
		tailModel[107] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 387
		tailModel[108] = new ModelRendererTurbo(this, 2633, 553, textureX, textureY); // Box 388
		tailModel[109] = new ModelRendererTurbo(this, 2249, 313, textureX, textureY); // Box 814
		tailModel[110] = new ModelRendererTurbo(this, 2809, 289, textureX, textureY); // Box 815
		tailModel[111] = new ModelRendererTurbo(this, 3913, 273, textureX, textureY); // Box 816
		tailModel[112] = new ModelRendererTurbo(this, 1625, 241, textureX, textureY); // Box 817
		tailModel[113] = new ModelRendererTurbo(this, 4057, 329, textureX, textureY); // Box 818
		tailModel[114] = new ModelRendererTurbo(this, 1041, 289, textureX, textureY); // Box 819
		tailModel[115] = new ModelRendererTurbo(this, 1457, 273, textureX, textureY); // Box 828
		tailModel[116] = new ModelRendererTurbo(this, 2633, 361, textureX, textureY); // Box 880
		tailModel[117] = new ModelRendererTurbo(this, 2537, 281, textureX, textureY); // Box 881
		tailModel[118] = new ModelRendererTurbo(this, 3993, 281, textureX, textureY); // Box 882
		tailModel[119] = new ModelRendererTurbo(this, 2113, 177, textureX, textureY); // Box 883
		tailModel[120] = new ModelRendererTurbo(this, 2913, 289, textureX, textureY); // Box 896
		tailModel[121] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 897
		tailModel[122] = new ModelRendererTurbo(this, 2969, 297, textureX, textureY); // Box 898
		tailModel[123] = new ModelRendererTurbo(this, 2449, 393, textureX, textureY); // Box 899

		tailModel[0].addShapeBox(0F, 0F, 0F, 186, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		tailModel[0].setRotationPoint(52F, -139F, 0F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 87, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 67
		tailModel[1].setRotationPoint(238F, -139F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 186, 71, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 2F, 0F, -12F, -2F, 0F, 0F, 0F); // Box 169
		tailModel[2].setRotationPoint(52F, -117F, 27F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 186, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 170
		tailModel[3].setRotationPoint(52F, -125F, 27F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 186, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 171
		tailModel[4].setRotationPoint(52F, -129F, 27F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 186, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 172
		tailModel[5].setRotationPoint(52F, -133F, 24F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 186, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 4F); // Box 173
		tailModel[6].setRotationPoint(52F, -136F, 20F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 186, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F); // Box 174
		tailModel[7].setRotationPoint(52F, -138F, 15F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 186, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 175
		tailModel[8].setRotationPoint(52F, -139F, 7F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 186, 8, 56, 0F,0F, 0F, 0F, 0F, 7F, -10F, 0F, 7F, -10F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -12F, -23F, 0F, -12F, -23F, 0F, 0F, -21F); // Box 177
		tailModel[9].setRotationPoint(52F, -39F, -28F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 186, 4, 14, 0F,0F, 0F, 0F, 0F, 12F, -2F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, 3F, -7F, 0F, -14F, -7F, 0F, -14F, -7F, 0F, 3F, -7F); // Box 178
		tailModel[10].setRotationPoint(52F, -31F, -7F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 186, 71, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, 2F, 0F, 0F, 0F); // Box 181
		tailModel[11].setRotationPoint(52F, -117F, -28F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 186, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 182
		tailModel[12].setRotationPoint(52F, -125F, -28F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 186, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 183
		tailModel[13].setRotationPoint(52F, -129F, -28F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 186, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 184
		tailModel[14].setRotationPoint(52F, -133F, -25F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 186, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 185
		tailModel[15].setRotationPoint(52F, -136F, -21F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 186, 1, 3, 0F,0F, -2F, 3F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		tailModel[16].setRotationPoint(52F, -138F, -18F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 186, 1, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		tailModel[17].setRotationPoint(52F, -139F, -15F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 186, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		tailModel[18].setRotationPoint(52F, -139F, -7F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 59, 4, 2, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 184
		tailModel[19].setRotationPoint(179F, -38F, -1F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 107, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 204
		tailModel[20].setRotationPoint(325F, -139F, 0F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 87, 41, 1, 0F,0F, 0F, 0F, 0F, 3F, 6F, 0F, 3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 6F, 0F, -23F, -6F, 0F, 0F, 0F); // Box 205
		tailModel[21].setRotationPoint(238F, -117F, 25F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 186, 4, 1, 0F,0F, 0F, 0F, 0F, 12F, -2F, 0F, 12F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -5F, 0F, -10F, 5F, 0F, 0F, 0F); // Box 206
		tailModel[22].setRotationPoint(52F, -46F, -28F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 186, 3, 1, 0F,0F, 0F, 0F, 0F, 10F, -5F, 0F, 10F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -10F, 0F, -7F, 10F, 0F, 0F, 0F); // Box 207
		tailModel[23].setRotationPoint(52F, -42F, -28F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 186, 4, 1, 0F,0F, 0F, 0F, 0F, 12F, 2F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 5F, 0F, -10F, -5F, 0F, 0F, 0F); // Box 208
		tailModel[24].setRotationPoint(52F, -46F, 27F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 186, 3, 1, 0F,0F, 0F, 0F, 0F, 10F, 5F, 0F, 10F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 10F, 0F, -7F, -10F, 0F, 0F, 0F); // Box 209
		tailModel[25].setRotationPoint(52F, -42F, 27F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 107, 21, 1, 0F,0F, 0F, 0F, 0F, 8F, 11F, 0F, 8F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 11F, 0F, -24F, -11F, 0F, 0F, 0F); // Box 210
		tailModel[26].setRotationPoint(325F, -120F, 19F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 87, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 6F, 0F, -3F, -6F, 0F, 0F, 0F); // Box 211
		tailModel[27].setRotationPoint(238F, -125F, 25F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 87, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 212
		tailModel[28].setRotationPoint(238F, -129F, 25F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 87, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 2F); // Box 213
		tailModel[29].setRotationPoint(238F, -133F, 22F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 87, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 4F); // Box 214
		tailModel[30].setRotationPoint(238F, -136F, 18F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F, -2F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, -3F, 0F, 1F, 2F); // Box 215
		tailModel[31].setRotationPoint(238F, -138F, 15F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 87, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, -5F, 0F, 1F, 0F); // Box 216
		tailModel[32].setRotationPoint(238F, -139F, 7F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 87, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		tailModel[33].setRotationPoint(238F, -139F, -7F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 87, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 6F, 0F, 0F, 0F); // Box 218
		tailModel[34].setRotationPoint(238F, -125F, -26F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 87, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 219
		tailModel[35].setRotationPoint(238F, -129F, -26F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 87, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -2F); // Box 220
		tailModel[36].setRotationPoint(238F, -133F, -23F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 87, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -4F); // Box 221
		tailModel[37].setRotationPoint(238F, -136F, -19F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, -2F, 3F, 0F, -2F, -2F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -3F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 222
		tailModel[38].setRotationPoint(238F, -138F, -16F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 87, 1, 8, 0F,0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -5F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 223
		tailModel[39].setRotationPoint(238F, -139F, -15F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 87, 41, 1, 0F,0F, 0F, 0F, 0F, 3F, -6F, 0F, 3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, -6F, 0F, -23F, 6F, 0F, 0F, 0F); // Box 224
		tailModel[40].setRotationPoint(238F, -117F, -26F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 107, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -6F, 0F, 1F, 0F); // Box 226
		tailModel[41].setRotationPoint(325F, -139F, 5F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 107, 5, 1, 0F,0F, 0F, 0F, 0F, 5F, 11F, 0F, 5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 11F, 0F, -8F, -11F, 0F, 0F, 0F); // Box 227
		tailModel[42].setRotationPoint(325F, -125F, 19F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 107, 4, 1, 0F,0F, 0F, 1F, 0F, 2F, 11F, 0F, 2F, -11F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 11F, 0F, -5F, -11F, 0F, 0F, 0F); // Box 228
		tailModel[43].setRotationPoint(325F, -129F, 19F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 107, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 9F, 0F, 1F, -9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 8F, 0F, -2F, -8F, 0F, 0F, 2F); // Box 229
		tailModel[44].setRotationPoint(325F, -133F, 16F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 107, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 6F, 0F, -1F, -6F, 0F, 0F, 3F); // Box 230
		tailModel[45].setRotationPoint(325F, -136F, 13F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 107, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, -2F, -4.5F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 1F, -5.5F, 0F, 1F, 2F); // Box 231
		tailModel[46].setRotationPoint(325F, -138F, 10F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 107, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		tailModel[47].setRotationPoint(325F, -139F, -5F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 107, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, -6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -6F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 233
		tailModel[48].setRotationPoint(325F, -139F, -10F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 107, 5, 1, 0F,0F, 0F, 0F, 0F, 5F, -11F, 0F, 5F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -11F, 0F, -8F, 11F, 0F, 0F, 0F); // Box 234
		tailModel[49].setRotationPoint(325F, -125F, -20F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 107, 4, 1, 0F,0F, 0F, -1F, 0F, 2F, -11F, 0F, 2F, 11F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, -11F, 0F, -5F, 11F, 0F, 0F, 0F); // Box 235
		tailModel[50].setRotationPoint(325F, -129F, -20F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 107, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, -9F, 0F, 1F, 9F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -8F, 0F, -2F, 8F, 0F, 0F, -2F); // Box 236
		tailModel[51].setRotationPoint(325F, -133F, -17F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 107, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -6F, 0F, -1F, 6F, 0F, 0F, -3F); // Box 237
		tailModel[52].setRotationPoint(325F, -136F, -14F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 107, 1, 1, 0F,0F, -2F, 3F, 0F, -2F, -4.5F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -5.5F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 238
		tailModel[53].setRotationPoint(325F, -138F, -11F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 107, 21, 1, 0F,0F, 0F, 0F, 0F, 8F, -11F, 0F, 8F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, -11F, 0F, -24F, 11F, 0F, 0F, 0F); // Box 237
		tailModel[54].setRotationPoint(325F, -120F, -20F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 36, 0F,0F, 0F, 0F, 1F, 0F, -18F, 1F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -13F); // Box 239
		tailModel[55].setRotationPoint(238F, -46F, -18F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 0, 2, 10, 0F,0F, 0F, 0F, 1F, 0F, -5F, 1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -5F); // Box 238
		tailModel[56].setRotationPoint(238F, -43F, -5F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 2, 6, 46, 0F,0F, 0F, 0F, 2F, 0F, -23F, 2F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -5F); // Box 239
		tailModel[57].setRotationPoint(238F, -52F, -23F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 4, 6, 52, 0F,0F, 0F, 0F, 3F, 0F, -22F, 3F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, -3F); // Box 240
		tailModel[58].setRotationPoint(238F, -58F, -26F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 7, 7, 52, 0F,0F, 0F, 0F, 5F, 0F, -19F, 5F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F); // Box 241
		tailModel[59].setRotationPoint(238F, -65F, -26F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 87, 11, 1, 0F,0F, 0F, 0F, 0F, 23F, -6F, 0F, 23F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -28F, -10F, 0F, -29F, 9F, 0F, 0F, 0F); // Box 242
		tailModel[60].setRotationPoint(238F, -76F, -26F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F,0F, 0F, 0F, 14F, 6F, -6F, 14F, 6F, 0F, 0F, 0F, 0F, 5F, 0F, -3F, -5F, -4F, -7F, -5F, -4F, 0F, 5F, 0F, 0F); // Box 243
		tailModel[61].setRotationPoint(250F, -65F, -7F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 3F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, 3F, 0F, 0F); // Box 244
		tailModel[62].setRotationPoint(245F, -58F, -4F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -4F, 0F, 0F, 0F, 3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, 3F, 0F, -4F); // Box 246
		tailModel[63].setRotationPoint(245F, -58F, 0F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 87, 1, 19, 0F,0F, 1F, 0F, 0F, 28F, -10F, 0F, 24F, 2F, -12F, 1F, 0F, 0F, 0F, 0F, 0F, -28F, -10F, 0F, -23F, 2F, -12F, 0F, 0F); // Box 247
		tailModel[64].setRotationPoint(238F, -66F, -26F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 12, 2, 19, 0F,0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		tailModel[65].setRotationPoint(238F, -67F, -26F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 87, 1, 19, 0F,-12F, 1F, 0F, 0F, 24F, 2F, 0F, 28F, -10F, 0F, 1F, 0F, -12F, 0F, 0F, 0F, -23F, 2F, 0F, -28F, -10F, 0F, 0F, 0F); // Box 249
		tailModel[66].setRotationPoint(238F, -66F, 7F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 12, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 250
		tailModel[67].setRotationPoint(238F, -67F, 7F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 87, 11, 1, 0F,0F, 0F, 0F, 0F, 23F, 6F, 0F, 23F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 9F, 0F, -28F, -10F, 0F, 0F, 0F); // Box 252
		tailModel[68].setRotationPoint(238F, -76F, 25F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 75, 2, 14, 0F,0F, 0F, 0F, 0F, 23F, -2F, 0F, 23F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, -2F, 0F, -23F, -2F, 0F, 0F, 0F); // Box 268
		tailModel[69].setRotationPoint(250F, -67F, -7F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F,0F, 0F, 0F, 14F, 6F, 0F, 14F, 6F, -6F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, -4F, 0F, -5F, -4F, -7F, 5F, 0F, -3F); // Box 269
		tailModel[70].setRotationPoint(250F, -65F, 0F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 85, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 7F, 0F, 2F); // Box 293
		tailModel[71].setRotationPoint(285F, -149F, -3F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 37, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 294
		tailModel[72].setRotationPoint(370F, -149F, -3F);

		tailModel[73].addShapeBox(0F, 0F, 0F, 8, 12, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F); // Box 295
		tailModel[73].setRotationPoint(407F, -149F, -2F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 29, 127, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 59F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 1F, 59F, 0F, 1F); // Box 296
		tailModel[74].setRotationPoint(344F, -276F, -2F);

		tailModel[75].addShapeBox(0F, 0F, 0F, 30, 7, 4, 0F,-7F, 0F, -1F, 6F, 0F, -1F, 6F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		tailModel[75].setRotationPoint(343F, -283F, -2F);

		tailModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		tailModel[76].setRotationPoint(372F, -273F, -1F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		tailModel[77].setRotationPoint(370F, -235F, -1F);

		tailModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		tailModel[78].setRotationPoint(369F, -204F, -1F);

		tailModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		tailModel[79].setRotationPoint(368F, -172F, -2F);

		tailModel[80].addShapeBox(0F, 0F, -2F, 16, 119, 4, 0F,0F, 0F, 0F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 0F, 0F, 5F, 0F, 1F, 29F, 0F, -2F, 29F, 0F, -2F, 5F, 0F, 1F); // Box 303
		tailModel[80].setRotationPoint(375F, -273F, 0F);

		tailModel[81].addShapeBox(3F, -8F, -2F, 1, 8, 4, 0F,0F, 0F, -1F, 3F, 0F, -2F, 3F, 0F, -2F, 0F, 0F, -1F, 3F, 0F, 0F, 15F, 0F, -2F, 15F, 0F, -2F, 3F, 0F, 0F); // Box 304
		tailModel[81].setRotationPoint(375F, -273F, 0F);

		tailModel[82].addShapeBox(0F, 0F, 0F, 107, 2, 10, 0F,0F, 0F, 0F, 0F, 23F, -2F, 0F, 23F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, -2F, 0F, -23F, -2F, 0F, 0F, 0F); // Box 344
		tailModel[82].setRotationPoint(325F, -90F, -5F);

		tailModel[83].addShapeBox(0F, 0F, 0F, 107, 1, 11, 0F,0F, 0F, 0F, 0F, 24F, -9F, 0F, 19F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -23F, -9F, 0F, -18F, 2F, 0F, 5F, 0F); // Box 345
		tailModel[83].setRotationPoint(325F, -94F, -16F);

		tailModel[84].addShapeBox(0F, 0F, 0F, 107, 5, 1, 0F,0F, 0F, 0F, 0F, 24F, -11F, 0F, 24F, 11F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, -22F, -13F, 0F, -24F, 12F, 0F, 0F, 3F); // Box 346
		tailModel[84].setRotationPoint(325F, -99F, -20F);

		tailModel[85].addShapeBox(0F, 0F, 0F, 107, 1, 11, 0F,0F, -4F, 0F, 0F, 19F, 2F, 0F, 24F, -9F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -18F, 2F, 0F, -23F, -9F, 0F, 0F, 0F); // Box 347
		tailModel[85].setRotationPoint(325F, -94F, 5F);

		tailModel[86].addShapeBox(0F, 0F, 0F, 107, 5, 1, 0F,0F, 0F, 0F, 0F, 24F, 11F, 0F, 24F, -11F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -24F, 12F, 0F, -22F, -13F, 0F, 1F, -4F); // Box 348
		tailModel[86].setRotationPoint(325F, -99F, 19F);

		tailModel[87].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 351
		tailModel[87].setRotationPoint(432F, -113F, -3F);

		tailModel[88].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -2F, -1F, 0F, -2F, -2F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 5F, 0F); // Box 352
		tailModel[88].setRotationPoint(432F, -118F, -7F);

		tailModel[89].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 353
		tailModel[89].setRotationPoint(444F, -114F, -3F);

		tailModel[90].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 354
		tailModel[90].setRotationPoint(432F, -118F, -7F);

		tailModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		tailModel[91].setRotationPoint(447F, -118F, -3F);

		tailModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 356
		tailModel[92].setRotationPoint(444F, -118F, -5F);

		tailModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, -2F, 0F, 0F, -2F, 0F); // Box 357
		tailModel[93].setRotationPoint(444F, -116F, -5F);

		tailModel[94].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -5F, 0F, 0F, -4F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 358
		tailModel[94].setRotationPoint(432F, -118F, 3F);

		tailModel[95].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 359
		tailModel[95].setRotationPoint(432F, -118F, 6F);

		tailModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 360
		tailModel[96].setRotationPoint(444F, -118F, 3F);

		tailModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, -2F, -2F); // Box 362
		tailModel[97].setRotationPoint(444F, -116F, 3F);

		tailModel[98].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 363
		tailModel[98].setRotationPoint(432F, -118F, -6F);

		tailModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 364
		tailModel[99].setRotationPoint(444F, -118F, -5F);

		tailModel[100].addShapeBox(0F, 0F, 0F, 49, 10, 140, 0F,0F, 0F, 0F, 0F, -2F, 0F, 7F, -4F, 0F, -36F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F, -4F, 0F, -36F, -4F, 0F); // Box 365
		tailModel[100].setRotationPoint(315F, -184F, 2F);

		tailModel[101].addShapeBox(0F, 0F, 0F, 6, 10, 140, 0F,0F, -1F, 0F, 0F, 0F, 0F, 36F, -3F, 0F, -39F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 36F, -4F, 0F, -39F, -5F, 0F); // Box 366
		tailModel[101].setRotationPoint(309F, -184F, 2F);

		tailModel[102].addShapeBox(0F, 0F, 0F, 5, 8, 140, 0F,0F, -3F, 0F, 0F, 0F, 0F, 39F, -3F, 0F, -44F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 39F, -4F, 0F, -44F, -4F, 0F); // Box 367
		tailModel[102].setRotationPoint(304F, -183F, 2F);

		tailModel[103].addShapeBox(0F, 0F, 0F, 49, 10, 140, 0F,-36F, -3F, 0F, 7F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -36F, -4F, 0F, 7F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 369
		tailModel[103].setRotationPoint(315F, -184F, -142F);

		tailModel[104].addShapeBox(0F, 0F, 0F, 6, 10, 140, 0F,-39F, -4F, 0F, 36F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -39F, -5F, 0F, 36F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 370
		tailModel[104].setRotationPoint(309F, -184F, -142F);

		tailModel[105].addShapeBox(0F, 0F, 0F, 5, 8, 140, 0F,-44F, -3F, 0F, 39F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -44F, -4F, 0F, 39F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 371
		tailModel[105].setRotationPoint(304F, -183F, -142F);

		tailModel[106].addShapeBox(-4F, -5F, -68F, 32, 10, 140, 0F,-7F, -4F, 0F, -13F, -5F, 0F, 0F, -5F, -9F, 0F, -2F, 0F, -7F, -4F, 0F, -13F, -5F, 0F, 0F, -5F, -9F, 0F, 0F, 0F); // Box 372
		tailModel[106].setRotationPoint(368F, -179F, -74F);

		tailModel[107].addShapeBox(0F, 0F, 0F, 1, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		tailModel[107].setRotationPoint(431F, -131F, -9F);

		tailModel[108].addShapeBox(-4F, -5F, -68F, 32, 10, 140, 0F,0F, -2F, 0F, 0F, -5F, -9F, -13F, -5F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, -9F, -13F, -5F, 0F, -7F, -4F, 0F); // Box 388
		tailModel[108].setRotationPoint(368F, -179F, 70F);

		tailModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		tailModel[109].setRotationPoint(431F, -134F, -9F);

		tailModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 815
		tailModel[110].setRotationPoint(431F, -136F, -8F);

		tailModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 816
		tailModel[111].setRotationPoint(431F, -138F, -7F);

		tailModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 817
		tailModel[112].setRotationPoint(431F, -139F, -4F);

		tailModel[113].addShapeBox(0F, 0F, 0F, 1, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 818
		tailModel[113].setRotationPoint(431F, -123F, -9F);

		tailModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 819
		tailModel[114].setRotationPoint(431F, -116F, -7F);

		tailModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 828
		tailModel[115].setRotationPoint(48F, -120F, 381F);

		tailModel[116].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 880
		tailModel[116].setRotationPoint(432F, -138F, -7F);

		tailModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F); // Box 881
		tailModel[117].setRotationPoint(438F, -138F, -6F);

		tailModel[118].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 882
		tailModel[118].setRotationPoint(432F, -139F, -4F);

		tailModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 883
		tailModel[119].setRotationPoint(438F, -139F, -3F);

		tailModel[120].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 896
		tailModel[120].setRotationPoint(-428F, -116F, -4F);

		tailModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 897
		tailModel[121].setRotationPoint(-431F, -116F, -3F);

		tailModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F); // Box 898
		tailModel[122].setRotationPoint(-431F, -115F, -6F);

		tailModel[123].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 899
		tailModel[123].setRotationPoint(-428F, -115F, -7F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 2809, 121, textureX, textureY); // Box 185
		leftWingModel[1] = new ModelRendererTurbo(this, 1825, 361, textureX, textureY); // Box 186
		leftWingModel[2] = new ModelRendererTurbo(this, 2809, 177, textureX, textureY); // Box 187
		leftWingModel[3] = new ModelRendererTurbo(this, 1105, 385, textureX, textureY); // Box 188
		leftWingModel[4] = new ModelRendererTurbo(this, 1473, 425, textureX, textureY); // Box 189
		leftWingModel[5] = new ModelRendererTurbo(this, 3281, 489, textureX, textureY); // Box 190
		leftWingModel[6] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Box 191
		leftWingModel[7] = new ModelRendererTurbo(this, 3625, 393, textureX, textureY); // Box 192
		leftWingModel[8] = new ModelRendererTurbo(this, 577, 505, textureX, textureY); // Box 193
		leftWingModel[9] = new ModelRendererTurbo(this, 2401, 513, textureX, textureY); // Box 194
		leftWingModel[10] = new ModelRendererTurbo(this, 1377, 73, textureX, textureY); // Box 261
		leftWingModel[11] = new ModelRendererTurbo(this, 4041, 81, textureX, textureY); // Box 262
		leftWingModel[12] = new ModelRendererTurbo(this, 3945, 161, textureX, textureY); // Box 263
		leftWingModel[13] = new ModelRendererTurbo(this, 3009, 177, textureX, textureY); // Box 264
		leftWingModel[14] = new ModelRendererTurbo(this, 2913, 89, textureX, textureY); // Box 265
		leftWingModel[15] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 266
		leftWingModel[16] = new ModelRendererTurbo(this, 3945, 177, textureX, textureY); // Box 267
		leftWingModel[17] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 268
		leftWingModel[18] = new ModelRendererTurbo(this, 2857, 561, textureX, textureY); // Box 349
		leftWingModel[19] = new ModelRendererTurbo(this, 1593, 209, textureX, textureY); // Box 350
		leftWingModel[20] = new ModelRendererTurbo(this, 2809, 209, textureX, textureY); // Box 351
		leftWingModel[21] = new ModelRendererTurbo(this, 3513, 217, textureX, textureY); // Box 352
		leftWingModel[22] = new ModelRendererTurbo(this, 3625, 217, textureX, textureY); // Box 355
		leftWingModel[23] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 356
		leftWingModel[24] = new ModelRendererTurbo(this, 1105, 225, textureX, textureY); // Box 357
		leftWingModel[25] = new ModelRendererTurbo(this, 2481, 393, textureX, textureY); // Box 505
		leftWingModel[26] = new ModelRendererTurbo(this, 3513, 393, textureX, textureY); // Box 506
		leftWingModel[27] = new ModelRendererTurbo(this, 2921, 209, textureX, textureY); // Box 507
		leftWingModel[28] = new ModelRendererTurbo(this, 2137, 313, textureX, textureY); // Box 508
		leftWingModel[29] = new ModelRendererTurbo(this, 1937, 337, textureX, textureY); // Box 509
		leftWingModel[30] = new ModelRendererTurbo(this, 2649, 225, textureX, textureY); // Box 510
		leftWingModel[31] = new ModelRendererTurbo(this, 3873, 393, textureX, textureY); // Box 511
		leftWingModel[32] = new ModelRendererTurbo(this, 3657, 393, textureX, textureY); // Box 512
		leftWingModel[33] = new ModelRendererTurbo(this, 1817, 401, textureX, textureY); // Box 513
		leftWingModel[34] = new ModelRendererTurbo(this, 2809, 401, textureX, textureY); // Box 514
		leftWingModel[35] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 515
		leftWingModel[36] = new ModelRendererTurbo(this, 1625, 401, textureX, textureY); // Box 516
		leftWingModel[37] = new ModelRendererTurbo(this, 2289, 361, textureX, textureY); // Box 517
		leftWingModel[38] = new ModelRendererTurbo(this, 3985, 345, textureX, textureY); // Box 518
		leftWingModel[39] = new ModelRendererTurbo(this, 513, 249, textureX, textureY); // Box 519
		leftWingModel[40] = new ModelRendererTurbo(this, 3001, 361, textureX, textureY); // Box 520
		leftWingModel[41] = new ModelRendererTurbo(this, 921, 385, textureX, textureY); // Box 521
		leftWingModel[42] = new ModelRendererTurbo(this, 3401, 377, textureX, textureY); // Box 522
		leftWingModel[43] = new ModelRendererTurbo(this, 1849, 249, textureX, textureY); // Box 523
		leftWingModel[44] = new ModelRendererTurbo(this, 3665, 297, textureX, textureY); // Box 524
		leftWingModel[45] = new ModelRendererTurbo(this, 1585, 257, textureX, textureY); // Box 525
		leftWingModel[46] = new ModelRendererTurbo(this, 1305, 385, textureX, textureY); // Box 526
		leftWingModel[47] = new ModelRendererTurbo(this, 1473, 385, textureX, textureY); // Box 527
		leftWingModel[48] = new ModelRendererTurbo(this, 553, 305, textureX, textureY); // Box 528
		leftWingModel[49] = new ModelRendererTurbo(this, 3449, 257, textureX, textureY); // Box 529
		leftWingModel[50] = new ModelRendererTurbo(this, 1265, 265, textureX, textureY); // Box 530
		leftWingModel[51] = new ModelRendererTurbo(this, 2969, 241, textureX, textureY); // Box 531
		leftWingModel[52] = new ModelRendererTurbo(this, 3905, 241, textureX, textureY); // Box 532
		leftWingModel[53] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Box 533
		leftWingModel[54] = new ModelRendererTurbo(this, 2897, 257, textureX, textureY); // Box 534
		leftWingModel[55] = new ModelRendererTurbo(this, 3377, 257, textureX, textureY); // Box 535
		leftWingModel[56] = new ModelRendererTurbo(this, 3169, 225, textureX, textureY); // Box 536
		leftWingModel[57] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 537
		leftWingModel[58] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 538
		leftWingModel[59] = new ModelRendererTurbo(this, 1977, 401, textureX, textureY); // Box 539
		leftWingModel[60] = new ModelRendererTurbo(this, 1849, 273, textureX, textureY); // Box 540
		leftWingModel[61] = new ModelRendererTurbo(this, 1505, 153, textureX, textureY); // Box 541
		leftWingModel[62] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 542
		leftWingModel[63] = new ModelRendererTurbo(this, 1105, 161, textureX, textureY); // Box 543
		leftWingModel[64] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 544
		leftWingModel[65] = new ModelRendererTurbo(this, 761, 169, textureX, textureY); // Box 545
		leftWingModel[66] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 546
		leftWingModel[67] = new ModelRendererTurbo(this, 1153, 169, textureX, textureY); // Box 547
		leftWingModel[68] = new ModelRendererTurbo(this, 1625, 425, textureX, textureY); // Box 548
		leftWingModel[69] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Box 549
		leftWingModel[70] = new ModelRendererTurbo(this, 3169, 425, textureX, textureY); // Box 550
		leftWingModel[71] = new ModelRendererTurbo(this, 3313, 425, textureX, textureY); // Box 551
		leftWingModel[72] = new ModelRendererTurbo(this, 3873, 433, textureX, textureY); // Box 552
		leftWingModel[73] = new ModelRendererTurbo(this, 1817, 449, textureX, textureY); // Box 553
		leftWingModel[74] = new ModelRendererTurbo(this, 3873, 481, textureX, textureY); // Box 554
		leftWingModel[75] = new ModelRendererTurbo(this, 1105, 433, textureX, textureY); // Box 555
		leftWingModel[76] = new ModelRendererTurbo(this, 2289, 433, textureX, textureY); // Box 556
		leftWingModel[77] = new ModelRendererTurbo(this, 801, 273, textureX, textureY); // Box 557
		leftWingModel[78] = new ModelRendererTurbo(this, 4025, 305, textureX, textureY); // Box 558
		leftWingModel[79] = new ModelRendererTurbo(this, 265, 393, textureX, textureY); // Box 559
		leftWingModel[80] = new ModelRendererTurbo(this, 2961, 409, textureX, textureY); // Box 560
		leftWingModel[81] = new ModelRendererTurbo(this, 1473, 425, textureX, textureY); // Box 561
		leftWingModel[82] = new ModelRendererTurbo(this, 2049, 441, textureX, textureY); // Box 562
		leftWingModel[83] = new ModelRendererTurbo(this, 1625, 465, textureX, textureY); // Box 563
		leftWingModel[84] = new ModelRendererTurbo(this, 1833, 321, textureX, textureY); // Box 564
		leftWingModel[85] = new ModelRendererTurbo(this, 2297, 273, textureX, textureY); // Box 565
		leftWingModel[86] = new ModelRendererTurbo(this, 1105, 265, textureX, textureY); // Box 566
		leftWingModel[87] = new ModelRendererTurbo(this, 1009, 281, textureX, textureY); // Box 567
		leftWingModel[88] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 568
		leftWingModel[89] = new ModelRendererTurbo(this, 2137, 265, textureX, textureY); // Box 569
		leftWingModel[90] = new ModelRendererTurbo(this, 3377, 273, textureX, textureY); // Box 570
		leftWingModel[91] = new ModelRendererTurbo(this, 2881, 289, textureX, textureY); // Box 571
		leftWingModel[92] = new ModelRendererTurbo(this, 3985, 369, textureX, textureY); // Box 572
		leftWingModel[93] = new ModelRendererTurbo(this, 1265, 289, textureX, textureY); // Box 573
		leftWingModel[94] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Box 574
		leftWingModel[95] = new ModelRendererTurbo(this, 3993, 233, textureX, textureY); // Box 575
		leftWingModel[96] = new ModelRendererTurbo(this, 209, 433, textureX, textureY); // Box 576
		leftWingModel[97] = new ModelRendererTurbo(this, 1817, 489, textureX, textureY); // Box 577
		leftWingModel[98] = new ModelRendererTurbo(this, 2609, 321, textureX, textureY); // Box 578
		leftWingModel[99] = new ModelRendererTurbo(this, 1505, 169, textureX, textureY); // Box 579
		leftWingModel[100] = new ModelRendererTurbo(this, 4081, 177, textureX, textureY); // Box 580
		leftWingModel[101] = new ModelRendererTurbo(this, 2657, 193, textureX, textureY); // Box 581
		leftWingModel[102] = new ModelRendererTurbo(this, 3121, 193, textureX, textureY); // Box 582
		leftWingModel[103] = new ModelRendererTurbo(this, 3993, 193, textureX, textureY); // Box 583
		leftWingModel[104] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Box 584
		leftWingModel[105] = new ModelRendererTurbo(this, 3169, 201, textureX, textureY); // Box 585
		leftWingModel[106] = new ModelRendererTurbo(this, 2289, 489, textureX, textureY); // Box 586
		leftWingModel[107] = new ModelRendererTurbo(this, 921, 433, textureX, textureY); // Box 587
		leftWingModel[108] = new ModelRendererTurbo(this, 3609, 489, textureX, textureY); // Box 588
		leftWingModel[109] = new ModelRendererTurbo(this, 1961, 489, textureX, textureY); // Box 589
		leftWingModel[110] = new ModelRendererTurbo(this, 1, 505, textureX, textureY); // Box 590
		leftWingModel[111] = new ModelRendererTurbo(this, 1817, 529, textureX, textureY); // Box 591
		leftWingModel[112] = new ModelRendererTurbo(this, 2433, 497, textureX, textureY); // Box 592
		leftWingModel[113] = new ModelRendererTurbo(this, 2465, 433, textureX, textureY); // Box 593
		leftWingModel[114] = new ModelRendererTurbo(this, 3513, 433, textureX, textureY); // Box 594
		leftWingModel[115] = new ModelRendererTurbo(this, 3449, 281, textureX, textureY); // Box 595
		leftWingModel[116] = new ModelRendererTurbo(this, 3329, 337, textureX, textureY); // Box 596
		leftWingModel[117] = new ModelRendererTurbo(this, 1473, 473, textureX, textureY); // Box 597
		leftWingModel[118] = new ModelRendererTurbo(this, 1689, 473, textureX, textureY); // Box 598
		leftWingModel[119] = new ModelRendererTurbo(this, 2633, 489, textureX, textureY); // Box 599
		leftWingModel[120] = new ModelRendererTurbo(this, 353, 505, textureX, textureY); // Box 600
		leftWingModel[121] = new ModelRendererTurbo(this, 3073, 361, textureX, textureY); // Box 601
		leftWingModel[122] = new ModelRendererTurbo(this, 921, 297, textureX, textureY); // Box 602
		leftWingModel[123] = new ModelRendererTurbo(this, 1105, 281, textureX, textureY); // Box 603
		leftWingModel[124] = new ModelRendererTurbo(this, 1009, 305, textureX, textureY); // Box 604
		leftWingModel[125] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Box 605
		leftWingModel[126] = new ModelRendererTurbo(this, 2137, 281, textureX, textureY); // Box 606
		leftWingModel[127] = new ModelRendererTurbo(this, 2969, 281, textureX, textureY); // Box 607
		leftWingModel[128] = new ModelRendererTurbo(this, 1265, 313, textureX, textureY); // Box 608
		leftWingModel[129] = new ModelRendererTurbo(this, 3033, 409, textureX, textureY); // Box 609
		leftWingModel[130] = new ModelRendererTurbo(this, 73, 313, textureX, textureY); // Box 610
		leftWingModel[131] = new ModelRendererTurbo(this, 3681, 281, textureX, textureY); // Box 611
		leftWingModel[132] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 612
		leftWingModel[133] = new ModelRendererTurbo(this, 593, 505, textureX, textureY); // Box 612
		leftWingModel[134] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 613
		leftWingModel[135] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 614
		leftWingModel[136] = new ModelRendererTurbo(this, 937, 209, textureX, textureY); // Box 615
		leftWingModel[137] = new ModelRendererTurbo(this, 1849, 209, textureX, textureY); // Box 616
		leftWingModel[138] = new ModelRendererTurbo(this, 1881, 209, textureX, textureY); // Box 617
		leftWingModel[139] = new ModelRendererTurbo(this, 3121, 209, textureX, textureY); // Box 618
		leftWingModel[140] = new ModelRendererTurbo(this, 4073, 209, textureX, textureY); // Box 619
		leftWingModel[141] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 620
		leftWingModel[142] = new ModelRendererTurbo(this, 2289, 569, textureX, textureY); // Box 840
		leftWingModel[143] = new ModelRendererTurbo(this, 3153, 577, textureX, textureY); // Box 841
		leftWingModel[144] = new ModelRendererTurbo(this, 1817, 585, textureX, textureY); // Box 842
		leftWingModel[145] = new ModelRendererTurbo(this, 1473, 593, textureX, textureY); // Box 843
		leftWingModel[146] = new ModelRendererTurbo(this, 2289, 593, textureX, textureY); // Box 844
		leftWingModel[147] = new ModelRendererTurbo(this, 3153, 609, textureX, textureY); // Box 845
		leftWingModel[148] = new ModelRendererTurbo(this, 1473, 617, textureX, textureY); // Box 846
		leftWingModel[149] = new ModelRendererTurbo(this, 2969, 377, textureX, textureY); // Box 847
		leftWingModel[150] = new ModelRendererTurbo(this, 1665, 273, textureX, textureY); // Box 848
		leftWingModel[151] = new ModelRendererTurbo(this, 2193, 185, textureX, textureY); // Box 849
		leftWingModel[152] = new ModelRendererTurbo(this, 2961, 97, textureX, textureY); // Box 850
		leftWingModel[153] = new ModelRendererTurbo(this, 2241, 185, textureX, textureY); // Box 851
		leftWingModel[154] = new ModelRendererTurbo(this, 2681, 105, textureX, textureY); // Box 852
		leftWingModel[155] = new ModelRendererTurbo(this, 3129, 201, textureX, textureY); // Box 853
		leftWingModel[156] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 854
		leftWingModel[157] = new ModelRendererTurbo(this, 3065, 105, textureX, textureY); // Box 855
		leftWingModel[158] = new ModelRendererTurbo(this, 3913, 105, textureX, textureY); // Box 856
		leftWingModel[159] = new ModelRendererTurbo(this, 2593, 193, textureX, textureY); // Box 857
		leftWingModel[160] = new ModelRendererTurbo(this, 2609, 289, textureX, textureY); // Box 858
		leftWingModel[161] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 859
		leftWingModel[162] = new ModelRendererTurbo(this, 3993, 521, textureX, textureY); // Box 860
		leftWingModel[163] = new ModelRendererTurbo(this, 2025, 529, textureX, textureY); // Box 861
		leftWingModel[164] = new ModelRendererTurbo(this, 1625, 505, textureX, textureY); // Box 862
		leftWingModel[165] = new ModelRendererTurbo(this, 1265, 385, textureX, textureY); // Box 863
		leftWingModel[166] = new ModelRendererTurbo(this, 2809, 337, textureX, textureY); // Box 864
		leftWingModel[167] = new ModelRendererTurbo(this, 3609, 529, textureX, textureY); // Box 865
		leftWingModel[168] = new ModelRendererTurbo(this, 2593, 489, textureX, textureY); // Box 866
		leftWingModel[169] = new ModelRendererTurbo(this, 1377, 385, textureX, textureY); // Box 867
		leftWingModel[170] = new ModelRendererTurbo(this, 1785, 113, textureX, textureY); // Box 868
		leftWingModel[171] = new ModelRendererTurbo(this, 3705, 185, textureX, textureY); // Box 869
		leftWingModel[172] = new ModelRendererTurbo(this, 609, 217, textureX, textureY); // Box 870
		leftWingModel[173] = new ModelRendererTurbo(this, 2625, 193, textureX, textureY); // Box 871
		leftWingModel[174] = new ModelRendererTurbo(this, 3841, 113, textureX, textureY); // Box 872
		leftWingModel[175] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 873
		leftWingModel[176] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 874
		leftWingModel[177] = new ModelRendererTurbo(this, 2281, 121, textureX, textureY); // Box 875
		leftWingModel[178] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Box 876
		leftWingModel[179] = new ModelRendererTurbo(this, 2809, 121, textureX, textureY); // Box 877
		leftWingModel[180] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 878
		leftWingModel[181] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Box 879
		leftWingModel[182] = new ModelRendererTurbo(this, 1305, 185, textureX, textureY); // Box 884
		leftWingModel[183] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Box 885
		leftWingModel[184] = new ModelRendererTurbo(this, 1665, 289, textureX, textureY); // Box 886
		leftWingModel[185] = new ModelRendererTurbo(this, 1545, 385, textureX, textureY); // Box 887
		leftWingModel[186] = new ModelRendererTurbo(this, 3241, 753, textureX, textureY); // Box 877

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 52, 37, 45, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 185
		leftWingModel[0].setRotationPoint(-90F, -143F, -364F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 61, 32, 335, 0F,0F, 0F, 0F, 0F, -12F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -20F, 0F, 0F, -19F, 0F, 0F, -2F, 0F); // Box 186
		leftWingModel[1].setRotationPoint(-38F, -139F, -364F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 10, 37, 335, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		leftWingModel[2].setRotationPoint(-100F, -143F, -364F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 15, 37, 335, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 188
		leftWingModel[3].setRotationPoint(-115F, -143F, -364F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 4, 17, 335, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 189
		leftWingModel[4].setRotationPoint(-119F, -133F, -364F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 52, 37, 223, 0F,0F, 0F, 0F, -14F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -14F, -29F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 190
		leftWingModel[5].setRotationPoint(-90F, -143F, -587F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 61, 32, 223, 0F,14F, 0F, 0F, -49F, -3F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 14F, -28F, 0F, -49F, -29F, 0F, 0F, -20F, 0F, 0F, -2F, 0F); // Box 191
		leftWingModel[6].setRotationPoint(-38F, -139F, -587F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 10, 37, 223, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		leftWingModel[7].setRotationPoint(-100F, -143F, -587F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 15, 37, 223, 0F,-6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -6F, -29F, 0F, 0F, -27F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 193
		leftWingModel[8].setRotationPoint(-115F, -143F, -587F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 4, 17, 223, 0F,-8F, 6F, 0F, 6F, 8F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -8F, -21F, 0F, 6F, -19F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 194
		leftWingModel[9].setRotationPoint(-119F, -133F, -587F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 15, 10, 5, 0F,-15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 261
		leftWingModel[10].setRotationPoint(-115F, -143F, -29F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 262
		leftWingModel[11].setRotationPoint(-100F, -143F, -29F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 52, 10, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 263
		leftWingModel[12].setRotationPoint(-90F, -143F, -29F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 61, 10, 5, 0F,0F, 0F, 0F, 0F, -13F, -1F, 0F, -13F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -4F, 0F, -5F, -3F); // Box 264
		leftWingModel[13].setRotationPoint(-38F, -139F, -29F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 15, 10, 5, 0F,-15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -15F, 0F, 10F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -9F, 7F); // Box 265
		leftWingModel[14].setRotationPoint(-115F, -143F, -24F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 266
		leftWingModel[15].setRotationPoint(-100F, -143F, -24F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 52, 8, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 10F, 0F, 0F, 10F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, 4F, 0F, -5F, 0F); // Box 267
		leftWingModel[16].setRotationPoint(-90F, -143F, -24F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 13, 1, 15, 0F,0F, -3F, 0F, 0F, -6F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		leftWingModel[17].setRotationPoint(-38F, -142F, -24F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 52, 37, 190, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 349
		leftWingModel[18].setRotationPoint(-90F, -143F, -219F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 52, 8, 101, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		leftWingModel[19].setRotationPoint(-90F, -143F, -319F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 351
		leftWingModel[20].setRotationPoint(-90F, -142F, -304F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 352
		leftWingModel[21].setRotationPoint(-90F, -142F, -287F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 355
		leftWingModel[22].setRotationPoint(-90F, -142F, -236F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 356
		leftWingModel[23].setRotationPoint(-90F, -142F, -253F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 357
		leftWingModel[24].setRotationPoint(-90F, -142F, -270F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 61, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		leftWingModel[25].setRotationPoint(-163F, -116F, -120F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F); // Box 506
		leftWingModel[26].setRotationPoint(-163F, -96F, -120F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 507
		leftWingModel[27].setRotationPoint(-102F, -107F, -95F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		leftWingModel[28].setRotationPoint(-163F, -107F, -95F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		leftWingModel[29].setRotationPoint(-163F, -107F, -120F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 510
		leftWingModel[30].setRotationPoint(-102F, -107F, -120F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		leftWingModel[31].setRotationPoint(-163F, -121F, -120F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		leftWingModel[32].setRotationPoint(-163F, -126F, -123F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 61, 6, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		leftWingModel[33].setRotationPoint(-163F, -132F, -125F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 514
		leftWingModel[34].setRotationPoint(-163F, -137F, -123F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 87, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 515
		leftWingModel[35].setRotationPoint(-163F, -142F, -120F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 87, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 516
		leftWingModel[36].setRotationPoint(-163F, -145F, -116F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 87, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 517
		leftWingModel[37].setRotationPoint(-163F, -147F, -110F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 23, 3, 19, 0F,0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 4F); // Box 518
		leftWingModel[38].setRotationPoint(-76F, -145F, -116F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 23, 2, 7, 0F,0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 6F); // Box 519
		leftWingModel[39].setRotationPoint(-76F, -147F, -110F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 16, 6, 37, 0F,0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F); // Box 520
		leftWingModel[40].setRotationPoint(-179F, -132F, -125F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F, 0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F); // Box 521
		leftWingModel[41].setRotationPoint(-179F, -137F, -125F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F, 0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F); // Box 522
		leftWingModel[42].setRotationPoint(-179F, -142F, -123F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F, 0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F); // Box 523
		leftWingModel[43].setRotationPoint(-179F, -147F, -110F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F); // Box 524
		leftWingModel[44].setRotationPoint(-179F, -145F, -116F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F); // Box 525
		leftWingModel[45].setRotationPoint(-179F, -113F, -110F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F, 0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F); // Box 526
		leftWingModel[46].setRotationPoint(-179F, -126F, -125F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F, 0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F); // Box 527
		leftWingModel[47].setRotationPoint(-179F, -121F, -123F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F); // Box 528
		leftWingModel[48].setRotationPoint(-179F, -116F, -116F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F); // Box 529
		leftWingModel[49].setRotationPoint(-187F, -131F, -113F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F, 0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F); // Box 530
		leftWingModel[50].setRotationPoint(-187F, -133F, -113F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F, 0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F); // Box 531
		leftWingModel[51].setRotationPoint(-187F, -135F, -111F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F, 0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F); // Box 532
		leftWingModel[52].setRotationPoint(-187F, -136F, -111F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F, 0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F); // Box 533
		leftWingModel[53].setRotationPoint(-187F, -129F, -113F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F, 0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F); // Box 534
		leftWingModel[54].setRotationPoint(-187F, -127F, -111F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F, 0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F); // Box 535
		leftWingModel[55].setRotationPoint(-187F, -126F, -111F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 536
		leftWingModel[56].setRotationPoint(-102F, -107F, -214F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 537
		leftWingModel[57].setRotationPoint(-102F, -107F, -189F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		leftWingModel[58].setRotationPoint(-163F, -107F, -214F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F); // Box 539
		leftWingModel[59].setRotationPoint(-163F, -96F, -214F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 3, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		leftWingModel[60].setRotationPoint(-157F, -107F, -212F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		leftWingModel[61].setRotationPoint(-160F, -107F, -201F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		leftWingModel[62].setRotationPoint(-160F, -107F, -204F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 543
		leftWingModel[63].setRotationPoint(-160F, -107F, -207F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		leftWingModel[64].setRotationPoint(-160F, -107F, -210F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		leftWingModel[65].setRotationPoint(-160F, -107F, -198F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		leftWingModel[66].setRotationPoint(-160F, -107F, -195F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		leftWingModel[67].setRotationPoint(-160F, -107F, -192F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 61, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		leftWingModel[68].setRotationPoint(-163F, -116F, -214F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		leftWingModel[69].setRotationPoint(-163F, -107F, -189F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		leftWingModel[70].setRotationPoint(-163F, -121F, -214F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftWingModel[71].setRotationPoint(-163F, -126F, -217F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 61, 6, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		leftWingModel[72].setRotationPoint(-163F, -132F, -219F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 87, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 553
		leftWingModel[73].setRotationPoint(-163F, -142F, -214F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 554
		leftWingModel[74].setRotationPoint(-163F, -137F, -217F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 87, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 555
		leftWingModel[75].setRotationPoint(-163F, -145F, -210F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 87, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 556
		leftWingModel[76].setRotationPoint(-163F, -147F, -204F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F, 0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F); // Box 557
		leftWingModel[77].setRotationPoint(-179F, -147F, -204F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F); // Box 558
		leftWingModel[78].setRotationPoint(-179F, -145F, -210F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F, 0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F); // Box 559
		leftWingModel[79].setRotationPoint(-179F, -142F, -217F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F, 0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F); // Box 560
		leftWingModel[80].setRotationPoint(-179F, -137F, -219F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 16, 6, 37, 0F,0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F); // Box 561
		leftWingModel[81].setRotationPoint(-179F, -132F, -219F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F, 0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F); // Box 562
		leftWingModel[82].setRotationPoint(-179F, -126F, -219F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F, 0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F); // Box 563
		leftWingModel[83].setRotationPoint(-179F, -121F, -217F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F); // Box 564
		leftWingModel[84].setRotationPoint(-179F, -116F, -210F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F); // Box 565
		leftWingModel[85].setRotationPoint(-179F, -113F, -204F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F, 0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F); // Box 566
		leftWingModel[86].setRotationPoint(-187F, -126F, -205F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F, 0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F); // Box 567
		leftWingModel[87].setRotationPoint(-187F, -129F, -207F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F); // Box 568
		leftWingModel[88].setRotationPoint(-187F, -131F, -207F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F, 0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F); // Box 569
		leftWingModel[89].setRotationPoint(-187F, -136F, -205F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F, 0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F); // Box 570
		leftWingModel[90].setRotationPoint(-187F, -135F, -205F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F, 0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F); // Box 571
		leftWingModel[91].setRotationPoint(-187F, -133F, -207F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 23, 3, 19, 0F,0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 4F); // Box 572
		leftWingModel[92].setRotationPoint(-76F, -145F, -210F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 23, 2, 7, 0F,0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 6F); // Box 573
		leftWingModel[93].setRotationPoint(-76F, -147F, -204F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 574
		leftWingModel[94].setRotationPoint(-102F, -107F, -303F);

		leftWingModel[95].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 575
		leftWingModel[95].setRotationPoint(-102F, -107F, -278F);

		leftWingModel[96].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		leftWingModel[96].setRotationPoint(-163F, -107F, -303F);

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F); // Box 577
		leftWingModel[97].setRotationPoint(-163F, -96F, -303F);

		leftWingModel[98].addShapeBox(0F, 0F, 0F, 3, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		leftWingModel[98].setRotationPoint(-157F, -107F, -301F);

		leftWingModel[99].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		leftWingModel[99].setRotationPoint(-160F, -107F, -290F);

		leftWingModel[100].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		leftWingModel[100].setRotationPoint(-160F, -107F, -293F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		leftWingModel[101].setRotationPoint(-160F, -107F, -296F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		leftWingModel[102].setRotationPoint(-160F, -107F, -299F);

		leftWingModel[103].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		leftWingModel[103].setRotationPoint(-160F, -107F, -287F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		leftWingModel[104].setRotationPoint(-160F, -107F, -284F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		leftWingModel[105].setRotationPoint(-160F, -107F, -281F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 61, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		leftWingModel[106].setRotationPoint(-163F, -116F, -303F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		leftWingModel[107].setRotationPoint(-163F, -107F, -278F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		leftWingModel[108].setRotationPoint(-163F, -121F, -303F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		leftWingModel[109].setRotationPoint(-163F, -126F, -306F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 61, 6, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		leftWingModel[110].setRotationPoint(-163F, -132F, -308F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 87, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 591
		leftWingModel[111].setRotationPoint(-163F, -142F, -303F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 592
		leftWingModel[112].setRotationPoint(-163F, -137F, -306F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 87, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 593
		leftWingModel[113].setRotationPoint(-163F, -145F, -299F);

		leftWingModel[114].addShapeBox(0F, 0F, 0F, 87, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 594
		leftWingModel[114].setRotationPoint(-163F, -147F, -293F);

		leftWingModel[115].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F, 0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F); // Box 595
		leftWingModel[115].setRotationPoint(-179F, -147F, -293F);

		leftWingModel[116].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F); // Box 596
		leftWingModel[116].setRotationPoint(-179F, -145F, -299F);

		leftWingModel[117].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F, 0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F); // Box 597
		leftWingModel[117].setRotationPoint(-179F, -137F, -308F);

		leftWingModel[118].addShapeBox(0F, 0F, 0F, 16, 6, 37, 0F,0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F); // Box 598
		leftWingModel[118].setRotationPoint(-179F, -132F, -308F);

		leftWingModel[119].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F, 0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F); // Box 599
		leftWingModel[119].setRotationPoint(-179F, -126F, -308F);

		leftWingModel[120].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F, 0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F); // Box 600
		leftWingModel[120].setRotationPoint(-179F, -121F, -306F);

		leftWingModel[121].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F); // Box 601
		leftWingModel[121].setRotationPoint(-179F, -116F, -299F);

		leftWingModel[122].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F); // Box 602
		leftWingModel[122].setRotationPoint(-179F, -113F, -293F);

		leftWingModel[123].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F, 0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F); // Box 603
		leftWingModel[123].setRotationPoint(-187F, -126F, -294F);

		leftWingModel[124].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F, 0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F); // Box 604
		leftWingModel[124].setRotationPoint(-187F, -129F, -296F);

		leftWingModel[125].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F); // Box 605
		leftWingModel[125].setRotationPoint(-187F, -131F, -296F);

		leftWingModel[126].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F, 0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F); // Box 606
		leftWingModel[126].setRotationPoint(-187F, -136F, -294F);

		leftWingModel[127].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F, 0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F); // Box 607
		leftWingModel[127].setRotationPoint(-187F, -135F, -294F);

		leftWingModel[128].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F, 0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F); // Box 608
		leftWingModel[128].setRotationPoint(-187F, -133F, -296F);

		leftWingModel[129].addShapeBox(0F, 0F, 0F, 23, 3, 19, 0F,0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 4F); // Box 609
		leftWingModel[129].setRotationPoint(-76F, -145F, -299F);

		leftWingModel[130].addShapeBox(0F, 0F, 0F, 23, 2, 7, 0F,0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 6F); // Box 610
		leftWingModel[130].setRotationPoint(-76F, -147F, -293F);

		leftWingModel[131].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F, 0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F); // Box 611
		leftWingModel[131].setRotationPoint(-187F, -127F, -205F);

		leftWingModel[132].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F, 0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F); // Box 612
		leftWingModel[132].setRotationPoint(-187F, -127F, -294F);

		leftWingModel[133].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F, 0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F); // Box 612
		leftWingModel[133].setRotationPoint(-179F, -142F, -306F);

		leftWingModel[134].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		leftWingModel[134].setRotationPoint(-160F, -107F, -98F);

		leftWingModel[135].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		leftWingModel[135].setRotationPoint(-160F, -107F, -101F);

		leftWingModel[136].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		leftWingModel[136].setRotationPoint(-160F, -107F, -107F);

		leftWingModel[137].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		leftWingModel[137].setRotationPoint(-160F, -107F, -104F);

		leftWingModel[138].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		leftWingModel[138].setRotationPoint(-160F, -107F, -116F);

		leftWingModel[139].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		leftWingModel[139].setRotationPoint(-160F, -107F, -113F);

		leftWingModel[140].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		leftWingModel[140].setRotationPoint(-160F, -107F, -110F);

		leftWingModel[141].addShapeBox(0F, 0F, 0F, 3, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		leftWingModel[141].setRotationPoint(-157F, -107F, -118F);

		leftWingModel[142].addShapeBox(0F, 0F, 0F, 118, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 840
		leftWingModel[142].setRotationPoint(-82F, -118F, -393F);

		leftWingModel[143].addShapeBox(0F, 0F, 0F, 118, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 841
		leftWingModel[143].setRotationPoint(-82F, -125F, -395F);

		leftWingModel[144].addShapeBox(0F, 0F, 0F, 118, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 842
		leftWingModel[144].setRotationPoint(-82F, -133F, -395F);

		leftWingModel[145].addShapeBox(0F, 0F, 0F, 118, 3, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843
		leftWingModel[145].setRotationPoint(-82F, -136F, -395F);

		leftWingModel[146].addShapeBox(0F, 0F, 0F, 118, 2, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		leftWingModel[146].setRotationPoint(-82F, -138F, -394F);

		leftWingModel[147].addShapeBox(0F, 0F, 0F, 118, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 845
		leftWingModel[147].setRotationPoint(-82F, -140F, -393F);

		leftWingModel[148].addShapeBox(0F, 0F, 0F, 118, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 846
		leftWingModel[148].setRotationPoint(-82F, -141F, -390F);

		leftWingModel[149].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 847
		leftWingModel[149].setRotationPoint(36F, -120F, -392F);

		leftWingModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 848
		leftWingModel[150].setRotationPoint(48F, -120F, -391F);

		leftWingModel[151].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 849
		leftWingModel[151].setRotationPoint(36F, -120F, -380F);

		leftWingModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 850
		leftWingModel[152].setRotationPoint(48F, -120F, -383F);

		leftWingModel[153].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 851
		leftWingModel[153].setRotationPoint(36F, -120F, -393F);

		leftWingModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 852
		leftWingModel[154].setRotationPoint(48F, -120F, -391F);

		leftWingModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 853
		leftWingModel[155].setRotationPoint(51F, -120F, -389F);

		leftWingModel[156].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 854
		leftWingModel[156].setRotationPoint(48F, -116F, -389F);

		leftWingModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 855
		leftWingModel[157].setRotationPoint(48F, -118F, -383F);

		leftWingModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, -2F, 0F); // Box 856
		leftWingModel[158].setRotationPoint(48F, -118F, -391F);

		leftWingModel[159].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -2F, -1F, 0F, -2F, -2F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 5F, 0F); // Box 857
		leftWingModel[159].setRotationPoint(36F, -120F, -393F);

		leftWingModel[160].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 858
		leftWingModel[160].setRotationPoint(36F, -115F, -389F);

		leftWingModel[161].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -5F, 0F, 0F, -4F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 859
		leftWingModel[161].setRotationPoint(36F, -120F, -383F);

		leftWingModel[162].addShapeBox(0F, 0F, 0F, 23, 3, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 860
		leftWingModel[162].setRotationPoint(-422F, -111F, -9F);

		leftWingModel[163].addShapeBox(0F, 0F, 0F, 23, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 861
		leftWingModel[163].setRotationPoint(-422F, -108F, -9F);

		leftWingModel[164].addShapeBox(0F, 0F, 0F, 23, 2, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 862
		leftWingModel[164].setRotationPoint(-422F, -113F, -8F);

		leftWingModel[165].addShapeBox(0F, 0F, 0F, 23, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 863
		leftWingModel[165].setRotationPoint(-422F, -115F, -7F);

		leftWingModel[166].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 864
		leftWingModel[166].setRotationPoint(-422F, -116F, -4F);

		leftWingModel[167].addShapeBox(0F, 0F, 0F, 23, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 865
		leftWingModel[167].setRotationPoint(-422F, -100F, -9F);

		leftWingModel[168].addShapeBox(0F, 0F, 0F, 23, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 866
		leftWingModel[168].setRotationPoint(-422F, -93F, -7F);

		leftWingModel[169].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 867
		leftWingModel[169].setRotationPoint(-434F, -95F, -6F);

		leftWingModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 868
		leftWingModel[170].setRotationPoint(-435F, -95F, -5F);

		leftWingModel[171].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 869
		leftWingModel[171].setRotationPoint(-434F, -95F, -7F);

		leftWingModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 870
		leftWingModel[172].setRotationPoint(-438F, -95F, -3F);

		leftWingModel[173].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 871
		leftWingModel[173].setRotationPoint(-434F, -95F, 6F);

		leftWingModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 872
		leftWingModel[174].setRotationPoint(-435F, -95F, 3F);

		leftWingModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 873
		leftWingModel[175].setRotationPoint(-437F, -95F, -5F);

		leftWingModel[176].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -2F, -2F, 0F, -2F, -1F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 4F, 0F); // Box 874
		leftWingModel[176].setRotationPoint(-434F, -95F, -7F);

		leftWingModel[177].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-1F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, -1F, 0F, 0F); // Box 875
		leftWingModel[177].setRotationPoint(-435F, -93F, -5F);

		leftWingModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,-1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 876
		leftWingModel[178].setRotationPoint(-438F, -91F, -3F);

		leftWingModel[179].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 877
		leftWingModel[179].setRotationPoint(-435F, -93F, 3F);

		leftWingModel[180].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -4F, 0F, 0F, -5F, 0F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 878
		leftWingModel[180].setRotationPoint(-434F, -95F, 3F);

		leftWingModel[181].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 879
		leftWingModel[181].setRotationPoint(-434F, -90F, -3F);

		leftWingModel[182].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 884
		leftWingModel[182].setRotationPoint(42F, -141F, -389F);

		leftWingModel[183].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F); // Box 885
		leftWingModel[183].setRotationPoint(42F, -140F, -392F);

		leftWingModel[184].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 886
		leftWingModel[184].setRotationPoint(36F, -141F, -390F);

		leftWingModel[185].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 887
		leftWingModel[185].setRotationPoint(36F, -140F, -393F);

		leftWingModel[186].addShapeBox(0F, 0F, 0F, 52, 4, 101, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 877
		leftWingModel[186].setRotationPoint(-90F, -110F, -319F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 2345, 121, textureX, textureY); // Box 175
		rightWingModel[1] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 176
		rightWingModel[2] = new ModelRendererTurbo(this, 737, 129, textureX, textureY); // Box 177
		rightWingModel[3] = new ModelRendererTurbo(this, 3169, 129, textureX, textureY); // Box 178
		rightWingModel[4] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 180
		rightWingModel[5] = new ModelRendererTurbo(this, 1105, 129, textureX, textureY); // Box 181
		rightWingModel[6] = new ModelRendererTurbo(this, 3513, 129, textureX, textureY); // Box 182
		rightWingModel[7] = new ModelRendererTurbo(this, 1681, 137, textureX, textureY); // Box 183
		rightWingModel[8] = new ModelRendererTurbo(this, 2065, 113, textureX, textureY); // Box 184
		rightWingModel[9] = new ModelRendererTurbo(this, 2977, 65, textureX, textureY); // Box 252
		rightWingModel[10] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Box 253
		rightWingModel[11] = new ModelRendererTurbo(this, 3969, 65, textureX, textureY); // Box 254
		rightWingModel[12] = new ModelRendererTurbo(this, 3953, 145, textureX, textureY); // Box 255
		rightWingModel[13] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 256
		rightWingModel[14] = new ModelRendererTurbo(this, 537, 73, textureX, textureY); // Box 257
		rightWingModel[15] = new ModelRendererTurbo(this, 1681, 81, textureX, textureY); // Box 258
		rightWingModel[16] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 260
		rightWingModel[17] = new ModelRendererTurbo(this, 1937, 225, textureX, textureY); // Box 358
		rightWingModel[18] = new ModelRendererTurbo(this, 1969, 729, textureX, textureY); // Box 359
		rightWingModel[19] = new ModelRendererTurbo(this, 3169, 225, textureX, textureY); // Box 360
		rightWingModel[20] = new ModelRendererTurbo(this, 1217, 225, textureX, textureY); // Box 361
		rightWingModel[21] = new ModelRendererTurbo(this, 2537, 225, textureX, textureY); // Box 362
		rightWingModel[22] = new ModelRendererTurbo(this, 3761, 225, textureX, textureY); // Box 363
		rightWingModel[23] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 364
		rightWingModel[24] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 365
		rightWingModel[25] = new ModelRendererTurbo(this, 2345, 249, textureX, textureY); // Box 389
		rightWingModel[26] = new ModelRendererTurbo(this, 833, 257, textureX, textureY); // Box 390
		rightWingModel[27] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Box 391
		rightWingModel[28] = new ModelRendererTurbo(this, 3377, 241, textureX, textureY); // Box 392
		rightWingModel[29] = new ModelRendererTurbo(this, 2089, 249, textureX, textureY); // Box 393
		rightWingModel[30] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 394
		rightWingModel[31] = new ModelRendererTurbo(this, 1809, 81, textureX, textureY); // Box 396
		rightWingModel[32] = new ModelRendererTurbo(this, 4073, 81, textureX, textureY); // Box 397
		rightWingModel[33] = new ModelRendererTurbo(this, 1809, 97, textureX, textureY); // Box 398
		rightWingModel[34] = new ModelRendererTurbo(this, 3449, 105, textureX, textureY); // Box 399
		rightWingModel[35] = new ModelRendererTurbo(this, 3001, 121, textureX, textureY); // Box 401
		rightWingModel[36] = new ModelRendererTurbo(this, 3049, 121, textureX, textureY); // Box 402
		rightWingModel[37] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 403
		rightWingModel[38] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Box 405
		rightWingModel[39] = new ModelRendererTurbo(this, 3513, 257, textureX, textureY); // Box 401
		rightWingModel[40] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 402
		rightWingModel[41] = new ModelRendererTurbo(this, 1105, 265, textureX, textureY); // Box 403
		rightWingModel[42] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Box 404
		rightWingModel[43] = new ModelRendererTurbo(this, 1457, 273, textureX, textureY); // Box 405
		rightWingModel[44] = new ModelRendererTurbo(this, 2297, 289, textureX, textureY); // Box 406
		rightWingModel[45] = new ModelRendererTurbo(this, 729, 297, textureX, textureY); // Box 407
		rightWingModel[46] = new ModelRendererTurbo(this, 2809, 249, textureX, textureY); // Box 408
		rightWingModel[47] = new ModelRendererTurbo(this, 1841, 169, textureX, textureY); // Box 409
		rightWingModel[48] = new ModelRendererTurbo(this, 3833, 225, textureX, textureY); // Box 410
		rightWingModel[49] = new ModelRendererTurbo(this, 3377, 257, textureX, textureY); // Box 411
		rightWingModel[50] = new ModelRendererTurbo(this, 3169, 257, textureX, textureY); // Box 412
		rightWingModel[51] = new ModelRendererTurbo(this, 2241, 153, textureX, textureY); // Box 414
		rightWingModel[52] = new ModelRendererTurbo(this, 985, 257, textureX, textureY); // Box 415
		rightWingModel[53] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 416
		rightWingModel[54] = new ModelRendererTurbo(this, 2137, 265, textureX, textureY); // Box 417
		rightWingModel[55] = new ModelRendererTurbo(this, 2537, 265, textureX, textureY); // Box 418
		rightWingModel[56] = new ModelRendererTurbo(this, 2969, 257, textureX, textureY); // Box 419
		rightWingModel[57] = new ModelRendererTurbo(this, 1105, 161, textureX, textureY); // Box 420
		rightWingModel[58] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 421
		rightWingModel[59] = new ModelRendererTurbo(this, 969, 169, textureX, textureY); // Box 422
		rightWingModel[60] = new ModelRendererTurbo(this, 2241, 169, textureX, textureY); // Box 423
		rightWingModel[61] = new ModelRendererTurbo(this, 4049, 185, textureX, textureY); // Box 424
		rightWingModel[62] = new ModelRendererTurbo(this, 3697, 169, textureX, textureY); // Box 425
		rightWingModel[63] = new ModelRendererTurbo(this, 3697, 201, textureX, textureY); // Box 426
		rightWingModel[64] = new ModelRendererTurbo(this, 4065, 161, textureX, textureY); // Box 427
		rightWingModel[65] = new ModelRendererTurbo(this, 1041, 201, textureX, textureY); // Box 428
		rightWingModel[66] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 429
		rightWingModel[67] = new ModelRendererTurbo(this, 3761, 273, textureX, textureY); // Box 430
		rightWingModel[68] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 431
		rightWingModel[69] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 432
		rightWingModel[70] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 433
		rightWingModel[71] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 434
		rightWingModel[72] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 435
		rightWingModel[73] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 436
		rightWingModel[74] = new ModelRendererTurbo(this, 1057, 129, textureX, textureY); // Box 437
		rightWingModel[75] = new ModelRendererTurbo(this, 1505, 137, textureX, textureY); // Box 438
		rightWingModel[76] = new ModelRendererTurbo(this, 3513, 297, textureX, textureY); // Box 439
		rightWingModel[77] = new ModelRendererTurbo(this, 2809, 273, textureX, textureY); // Box 440
		rightWingModel[78] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Box 441
		rightWingModel[79] = new ModelRendererTurbo(this, 161, 313, textureX, textureY); // Box 442
		rightWingModel[80] = new ModelRendererTurbo(this, 3169, 337, textureX, textureY); // Box 443
		rightWingModel[81] = new ModelRendererTurbo(this, 729, 313, textureX, textureY); // Box 444
		rightWingModel[82] = new ModelRendererTurbo(this, 1105, 313, textureX, textureY); // Box 445
		rightWingModel[83] = new ModelRendererTurbo(this, 1937, 313, textureX, textureY); // Box 446
		rightWingModel[84] = new ModelRendererTurbo(this, 2297, 313, textureX, textureY); // Box 447
		rightWingModel[85] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 448
		rightWingModel[86] = new ModelRendererTurbo(this, 3665, 257, textureX, textureY); // Box 449
		rightWingModel[87] = new ModelRendererTurbo(this, 3993, 265, textureX, textureY); // Box 450
		rightWingModel[88] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 451
		rightWingModel[89] = new ModelRendererTurbo(this, 2809, 289, textureX, textureY); // Box 452
		rightWingModel[90] = new ModelRendererTurbo(this, 2969, 289, textureX, textureY); // Box 453
		rightWingModel[91] = new ModelRendererTurbo(this, 937, 297, textureX, textureY); // Box 454
		rightWingModel[92] = new ModelRendererTurbo(this, 2609, 265, textureX, textureY); // Box 455
		rightWingModel[93] = new ModelRendererTurbo(this, 1017, 177, textureX, textureY); // Box 456
		rightWingModel[94] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Box 457
		rightWingModel[95] = new ModelRendererTurbo(this, 1849, 209, textureX, textureY); // Box 458
		rightWingModel[96] = new ModelRendererTurbo(this, 577, 217, textureX, textureY); // Box 459
		rightWingModel[97] = new ModelRendererTurbo(this, 2969, 209, textureX, textureY); // Box 460
		rightWingModel[98] = new ModelRendererTurbo(this, 1937, 225, textureX, textureY); // Box 461
		rightWingModel[99] = new ModelRendererTurbo(this, 3217, 225, textureX, textureY); // Box 462
		rightWingModel[100] = new ModelRendererTurbo(this, 729, 273, textureX, textureY); // Box 463
		rightWingModel[101] = new ModelRendererTurbo(this, 1841, 185, textureX, textureY); // Box 464
		rightWingModel[102] = new ModelRendererTurbo(this, 3369, 201, textureX, textureY); // Box 465
		rightWingModel[103] = new ModelRendererTurbo(this, 1801, 209, textureX, textureY); // Box 466
		rightWingModel[104] = new ModelRendererTurbo(this, 2537, 305, textureX, textureY); // Box 467
		rightWingModel[105] = new ModelRendererTurbo(this, 3761, 313, textureX, textureY); // Box 468
		rightWingModel[106] = new ModelRendererTurbo(this, 561, 249, textureX, textureY); // Box 469
		rightWingModel[107] = new ModelRendererTurbo(this, 1889, 137, textureX, textureY); // Box 470
		rightWingModel[108] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 471
		rightWingModel[109] = new ModelRendererTurbo(this, 1057, 145, textureX, textureY); // Box 472
		rightWingModel[110] = new ModelRendererTurbo(this, 3489, 145, textureX, textureY); // Box 473
		rightWingModel[111] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 474
		rightWingModel[112] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Box 475
		rightWingModel[113] = new ModelRendererTurbo(this, 1145, 153, textureX, textureY); // Box 476
		rightWingModel[114] = new ModelRendererTurbo(this, 1681, 321, textureX, textureY); // Box 477
		rightWingModel[115] = new ModelRendererTurbo(this, 3377, 305, textureX, textureY); // Box 478
		rightWingModel[116] = new ModelRendererTurbo(this, 161, 353, textureX, textureY); // Box 479
		rightWingModel[117] = new ModelRendererTurbo(this, 2809, 361, textureX, textureY); // Box 480
		rightWingModel[118] = new ModelRendererTurbo(this, 1105, 385, textureX, textureY); // Box 481
		rightWingModel[119] = new ModelRendererTurbo(this, 3169, 385, textureX, textureY); // Box 482
		rightWingModel[120] = new ModelRendererTurbo(this, 2289, 393, textureX, textureY); // Box 483
		rightWingModel[121] = new ModelRendererTurbo(this, 1457, 321, textureX, textureY); // Box 484
		rightWingModel[122] = new ModelRendererTurbo(this, 3513, 337, textureX, textureY); // Box 485
		rightWingModel[123] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Box 486
		rightWingModel[124] = new ModelRendererTurbo(this, 1801, 273, textureX, textureY); // Box 487
		rightWingModel[125] = new ModelRendererTurbo(this, 3953, 305, textureX, textureY); // Box 488
		rightWingModel[126] = new ModelRendererTurbo(this, 2537, 321, textureX, textureY); // Box 489
		rightWingModel[127] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 490
		rightWingModel[128] = new ModelRendererTurbo(this, 953, 337, textureX, textureY); // Box 491
		rightWingModel[129] = new ModelRendererTurbo(this, 3369, 337, textureX, textureY); // Box 492
		rightWingModel[130] = new ModelRendererTurbo(this, 2209, 273, textureX, textureY); // Box 493
		rightWingModel[131] = new ModelRendererTurbo(this, 2089, 225, textureX, textureY); // Box 494
		rightWingModel[132] = new ModelRendererTurbo(this, 2969, 225, textureX, textureY); // Box 495
		rightWingModel[133] = new ModelRendererTurbo(this, 2905, 233, textureX, textureY); // Box 496
		rightWingModel[134] = new ModelRendererTurbo(this, 4041, 233, textureX, textureY); // Box 497
		rightWingModel[135] = new ModelRendererTurbo(this, 3905, 225, textureX, textureY); // Box 498
		rightWingModel[136] = new ModelRendererTurbo(this, 1865, 233, textureX, textureY); // Box 499
		rightWingModel[137] = new ModelRendererTurbo(this, 1505, 241, textureX, textureY); // Box 500
		rightWingModel[138] = new ModelRendererTurbo(this, 3169, 297, textureX, textureY); // Box 501
		rightWingModel[139] = new ModelRendererTurbo(this, 833, 241, textureX, textureY); // Box 502
		rightWingModel[140] = new ModelRendererTurbo(this, 1585, 241, textureX, textureY); // Box 503
		rightWingModel[141] = new ModelRendererTurbo(this, 1937, 241, textureX, textureY); // Box 504
		rightWingModel[142] = new ModelRendererTurbo(this, 2841, 489, textureX, textureY); // Box 820
		rightWingModel[143] = new ModelRendererTurbo(this, 1473, 537, textureX, textureY); // Box 821
		rightWingModel[144] = new ModelRendererTurbo(this, 2289, 537, textureX, textureY); // Box 822
		rightWingModel[145] = new ModelRendererTurbo(this, 3169, 489, textureX, textureY); // Box 823
		rightWingModel[146] = new ModelRendererTurbo(this, 3153, 553, textureX, textureY); // Box 824
		rightWingModel[147] = new ModelRendererTurbo(this, 1473, 569, textureX, textureY); // Box 825
		rightWingModel[148] = new ModelRendererTurbo(this, 1817, 569, textureX, textureY); // Box 826
		rightWingModel[149] = new ModelRendererTurbo(this, 2233, 297, textureX, textureY); // Box 827
		rightWingModel[150] = new ModelRendererTurbo(this, 961, 185, textureX, textureY); // Box 829
		rightWingModel[151] = new ModelRendererTurbo(this, 2529, 81, textureX, textureY); // Box 830
		rightWingModel[152] = new ModelRendererTurbo(this, 2161, 185, textureX, textureY); // Box 831
		rightWingModel[153] = new ModelRendererTurbo(this, 2905, 89, textureX, textureY); // Box 832
		rightWingModel[154] = new ModelRendererTurbo(this, 2273, 177, textureX, textureY); // Box 833
		rightWingModel[155] = new ModelRendererTurbo(this, 3169, 241, textureX, textureY); // Box 834
		rightWingModel[156] = new ModelRendererTurbo(this, 4089, 89, textureX, textureY); // Box 835
		rightWingModel[157] = new ModelRendererTurbo(this, 2905, 97, textureX, textureY); // Box 836
		rightWingModel[158] = new ModelRendererTurbo(this, 2513, 193, textureX, textureY); // Box 837
		rightWingModel[159] = new ModelRendererTurbo(this, 561, 289, textureX, textureY); // Box 838
		rightWingModel[160] = new ModelRendererTurbo(this, 2553, 193, textureX, textureY); // Box 839
		rightWingModel[161] = new ModelRendererTurbo(this, 2153, 193, textureX, textureY); // Box 892
		rightWingModel[162] = new ModelRendererTurbo(this, 593, 289, textureX, textureY); // Box 893
		rightWingModel[163] = new ModelRendererTurbo(this, 2649, 289, textureX, textureY); // Box 894
		rightWingModel[164] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Box 895
		rightWingModel[165] = new ModelRendererTurbo(this, 3737, 657, textureX, textureY); // Box 876

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 61, 32, 335, 0F,0F, 0F, 0F, 0F, -13F, 1F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -19F, 1F, 0F, -20F, 0F, 0F, -2F, 0F); // Box 175
		rightWingModel[0].setRotationPoint(-38F, -139F, 29F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 10, 37, 335, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightWingModel[1].setRotationPoint(-100F, -143F, 29F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 15, 37, 335, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 177
		rightWingModel[2].setRotationPoint(-115F, -143F, 29F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 4, 17, 335, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 178
		rightWingModel[3].setRotationPoint(-119F, -133F, 29F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 52, 37, 223, 0F,0F, 0F, 0F, 0F, -4F, 0F, -14F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -14F, -29F, 0F, 0F, -27F, 0F); // Box 180
		rightWingModel[4].setRotationPoint(-90F, -143F, 364F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 61, 32, 223, 0F,0F, 0F, 0F, 0F, -12F, 0F, -49F, -3F, 0F, 14F, 0F, 0F, 0F, -2F, 0F, 0F, -20F, 0F, -49F, -29F, 0F, 14F, -28F, 0F); // Box 181
		rightWingModel[5].setRotationPoint(-38F, -139F, 364F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 10, 37, 223, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F); // Box 182
		rightWingModel[6].setRotationPoint(-100F, -143F, 364F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 15, 37, 223, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -6F, -29F, 0F); // Box 183
		rightWingModel[7].setRotationPoint(-115F, -143F, 364F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 4, 17, 223, 0F,0F, -6F, 0F, 0F, 0F, 0F, 6F, 8F, 0F, -8F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 6F, -19F, 0F, -8F, -21F, 0F); // Box 184
		rightWingModel[8].setRotationPoint(-119F, -133F, 364F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 15, 10, 5, 0F,-15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		rightWingModel[9].setRotationPoint(-115F, -143F, 24F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 10, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		rightWingModel[10].setRotationPoint(-100F, -143F, 24F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 52, 10, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightWingModel[11].setRotationPoint(-90F, -143F, 24F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 61, 10, 5, 0F,0F, 0F, 0F, 0F, -13F, -4F, 0F, -13F, -1F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 3F, -4F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 255
		rightWingModel[12].setRotationPoint(-38F, -139F, 24F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 15, 10, 5, 0F,-15F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, -9F, 7F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, -5F, 0F); // Box 256
		rightWingModel[13].setRotationPoint(-115F, -143F, 19F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 10, 8, 5, 0F,0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 257
		rightWingModel[14].setRotationPoint(-100F, -143F, 19F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 52, 8, 5, 0F,0F, 0F, 10F, 0F, -2F, 10F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 4F, 0F, -3F, 0F, 0F, -4F, 0F); // Box 258
		rightWingModel[15].setRotationPoint(-90F, -143F, 19F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 13, 1, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 1F, 0F, 3F, 0F); // Box 260
		rightWingModel[16].setRotationPoint(-38F, -142F, 9F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 52, 37, 45, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 358
		rightWingModel[17].setRotationPoint(-90F, -143F, 319F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 52, 37, 190, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 359
		rightWingModel[18].setRotationPoint(-90F, -143F, 29F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 52, 8, 101, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		rightWingModel[19].setRotationPoint(-90F, -143F, 218F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 361
		rightWingModel[20].setRotationPoint(-90F, -142F, 302F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 362
		rightWingModel[21].setRotationPoint(-90F, -142F, 285F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 363
		rightWingModel[22].setRotationPoint(-90F, -142F, 234F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 364
		rightWingModel[23].setRotationPoint(-90F, -142F, 251F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 52, 33, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 365
		rightWingModel[24].setRotationPoint(-90F, -142F, 268F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 61, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		rightWingModel[25].setRotationPoint(-163F, -116F, 93F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -20F, 0F, 0F); // Box 390
		rightWingModel[26].setRotationPoint(-163F, -96F, 93F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 391
		rightWingModel[27].setRotationPoint(-102F, -107F, 93F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		rightWingModel[28].setRotationPoint(-163F, -107F, 93F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		rightWingModel[29].setRotationPoint(-163F, -107F, 118F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 394
		rightWingModel[30].setRotationPoint(-102F, -107F, 118F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightWingModel[31].setRotationPoint(-160F, -107F, 97F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		rightWingModel[32].setRotationPoint(-160F, -107F, 100F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		rightWingModel[33].setRotationPoint(-160F, -107F, 106F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		rightWingModel[34].setRotationPoint(-160F, -107F, 103F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		rightWingModel[35].setRotationPoint(-160F, -107F, 115F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		rightWingModel[36].setRotationPoint(-160F, -107F, 112F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		rightWingModel[37].setRotationPoint(-160F, -107F, 109F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 3, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		rightWingModel[38].setRotationPoint(-157F, -107F, 95F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		rightWingModel[39].setRotationPoint(-163F, -121F, 93F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		rightWingModel[40].setRotationPoint(-163F, -126F, 90F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 61, 6, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		rightWingModel[41].setRotationPoint(-163F, -132F, 88F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 404
		rightWingModel[42].setRotationPoint(-163F, -137F, 90F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 87, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 405
		rightWingModel[43].setRotationPoint(-163F, -142F, 93F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 87, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 406
		rightWingModel[44].setRotationPoint(-163F, -145F, 97F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 87, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 407
		rightWingModel[45].setRotationPoint(-163F, -147F, 103F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 23, 3, 19, 0F,0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 4F); // Box 408
		rightWingModel[46].setRotationPoint(-76F, -145F, 97F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 23, 2, 7, 0F,0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 6F); // Box 409
		rightWingModel[47].setRotationPoint(-76F, -147F, 103F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 16, 6, 37, 0F,0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F); // Box 410
		rightWingModel[48].setRotationPoint(-179F, -132F, 88F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F, 0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F); // Box 411
		rightWingModel[49].setRotationPoint(-179F, -137F, 88F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F, 0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F); // Box 412
		rightWingModel[50].setRotationPoint(-179F, -142F, 90F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F, 0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F); // Box 414
		rightWingModel[51].setRotationPoint(-179F, -147F, 103F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F); // Box 415
		rightWingModel[52].setRotationPoint(-179F, -145F, 97F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F); // Box 416
		rightWingModel[53].setRotationPoint(-179F, -113F, 103F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F, 0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F); // Box 417
		rightWingModel[54].setRotationPoint(-179F, -126F, 88F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F, 0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F); // Box 418
		rightWingModel[55].setRotationPoint(-179F, -121F, 90F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F); // Box 419
		rightWingModel[56].setRotationPoint(-179F, -116F, 97F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F); // Box 420
		rightWingModel[57].setRotationPoint(-187F, -131F, 100F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F, 0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F); // Box 421
		rightWingModel[58].setRotationPoint(-187F, -133F, 100F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F, 0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F); // Box 422
		rightWingModel[59].setRotationPoint(-187F, -135F, 102F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F, 0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F); // Box 423
		rightWingModel[60].setRotationPoint(-187F, -136F, 102F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F, 0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F); // Box 424
		rightWingModel[61].setRotationPoint(-187F, -129F, 100F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F, 0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F); // Box 425
		rightWingModel[62].setRotationPoint(-187F, -127F, 102F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F, 0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F); // Box 426
		rightWingModel[63].setRotationPoint(-187F, -126F, 102F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 427
		rightWingModel[64].setRotationPoint(-102F, -107F, 212F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 428
		rightWingModel[65].setRotationPoint(-102F, -107F, 187F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		rightWingModel[66].setRotationPoint(-163F, -107F, 212F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -20F, 0F, 0F); // Box 430
		rightWingModel[67].setRotationPoint(-163F, -96F, 187F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 3, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		rightWingModel[68].setRotationPoint(-157F, -107F, 189F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		rightWingModel[69].setRotationPoint(-160F, -107F, 200F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		rightWingModel[70].setRotationPoint(-160F, -107F, 203F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		rightWingModel[71].setRotationPoint(-160F, -107F, 206F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		rightWingModel[72].setRotationPoint(2450F, -107F, 209F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		rightWingModel[73].setRotationPoint(-160F, -107F, 197F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		rightWingModel[74].setRotationPoint(-160F, -107F, 194F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		rightWingModel[75].setRotationPoint(-160F, -107F, 191F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 61, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		rightWingModel[76].setRotationPoint(-163F, -116F, 187F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		rightWingModel[77].setRotationPoint(-163F, -107F, 187F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		rightWingModel[78].setRotationPoint(-163F, -121F, 187F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		rightWingModel[79].setRotationPoint(-163F, -126F, 184F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 61, 6, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		rightWingModel[80].setRotationPoint(-163F, -132F, 182F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 87, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 444
		rightWingModel[81].setRotationPoint(-163F, -142F, 187F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 445
		rightWingModel[82].setRotationPoint(-163F, -137F, 184F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 87, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 446
		rightWingModel[83].setRotationPoint(-163F, -145F, 191F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 87, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 447
		rightWingModel[84].setRotationPoint(-163F, -147F, 197F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F, 0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F); // Box 448
		rightWingModel[85].setRotationPoint(-179F, -147F, 197F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F); // Box 449
		rightWingModel[86].setRotationPoint(-179F, -145F, 191F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F, 0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F); // Box 450
		rightWingModel[87].setRotationPoint(-179F, -142F, 184F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F, 0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F); // Box 451
		rightWingModel[88].setRotationPoint(-179F, -137F, 182F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 16, 6, 37, 0F,0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F); // Box 452
		rightWingModel[89].setRotationPoint(-179F, -132F, 182F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F, 0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F); // Box 453
		rightWingModel[90].setRotationPoint(-179F, -126F, 182F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F, 0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F); // Box 454
		rightWingModel[91].setRotationPoint(-179F, -121F, 184F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F); // Box 455
		rightWingModel[92].setRotationPoint(-179F, -116F, 191F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F); // Box 456
		rightWingModel[93].setRotationPoint(-179F, -113F, 197F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F, 0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F); // Box 457
		rightWingModel[94].setRotationPoint(-187F, -126F, 196F);

		rightWingModel[95].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F, 0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F); // Box 458
		rightWingModel[95].setRotationPoint(-187F, -129F, 194F);

		rightWingModel[96].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F); // Box 459
		rightWingModel[96].setRotationPoint(-187F, -131F, 194F);

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F, 0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F); // Box 460
		rightWingModel[97].setRotationPoint(-187F, -136F, 196F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F, 0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F); // Box 461
		rightWingModel[98].setRotationPoint(-187F, -135F, 196F);

		rightWingModel[99].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F, 0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F); // Box 462
		rightWingModel[99].setRotationPoint(-187F, -133F, 194F);

		rightWingModel[100].addShapeBox(0F, 0F, 0F, 23, 3, 19, 0F,0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 4F); // Box 463
		rightWingModel[100].setRotationPoint(-76F, -145F, 191F);

		rightWingModel[101].addShapeBox(0F, 0F, 0F, 23, 2, 7, 0F,0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 6F); // Box 464
		rightWingModel[101].setRotationPoint(-76F, -147F, 197F);

		rightWingModel[102].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 465
		rightWingModel[102].setRotationPoint(-102F, -107F, 301F);

		rightWingModel[103].addShapeBox(0F, 0F, 0F, 10, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 466
		rightWingModel[103].setRotationPoint(-102F, -107F, 276F);

		rightWingModel[104].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		rightWingModel[104].setRotationPoint(-163F, -107F, 301F);

		rightWingModel[105].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -20F, 0F, 0F); // Box 468
		rightWingModel[105].setRotationPoint(-163F, -96F, 276F);

		rightWingModel[106].addShapeBox(0F, 0F, 0F, 3, 11, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightWingModel[106].setRotationPoint(-157F, -107F, 278F);

		rightWingModel[107].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		rightWingModel[107].setRotationPoint(-160F, -107F, 289F);

		rightWingModel[108].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		rightWingModel[108].setRotationPoint(-160F, -107F, 292F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		rightWingModel[109].setRotationPoint(-160F, -107F, 295F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		rightWingModel[110].setRotationPoint(-160F, -107F, 298F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		rightWingModel[111].setRotationPoint(-160F, -107F, 286F);

		rightWingModel[112].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		rightWingModel[112].setRotationPoint(-160F, -107F, 283F);

		rightWingModel[113].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		rightWingModel[113].setRotationPoint(-160F, -107F, 280F);

		rightWingModel[114].addShapeBox(0F, 0F, 0F, 61, 9, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		rightWingModel[114].setRotationPoint(-163F, -116F, 276F);

		rightWingModel[115].addShapeBox(0F, 0F, 0F, 61, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		rightWingModel[115].setRotationPoint(-163F, -107F, 276F);

		rightWingModel[116].addShapeBox(0F, 0F, 0F, 61, 5, 27, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		rightWingModel[116].setRotationPoint(-163F, -121F, 276F);

		rightWingModel[117].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		rightWingModel[117].setRotationPoint(-163F, -126F, 273F);

		rightWingModel[118].addShapeBox(0F, 0F, 0F, 61, 6, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		rightWingModel[118].setRotationPoint(-163F, -132F, 271F);

		rightWingModel[119].addShapeBox(0F, 0F, 0F, 87, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 482
		rightWingModel[119].setRotationPoint(-163F, -142F, 276F);

		rightWingModel[120].addShapeBox(0F, 0F, 0F, 61, 5, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 483
		rightWingModel[120].setRotationPoint(-163F, -137F, 273F);

		rightWingModel[121].addShapeBox(0F, 0F, 0F, 87, 3, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 484
		rightWingModel[121].setRotationPoint(-163F, -145F, 280F);

		rightWingModel[122].addShapeBox(0F, 0F, 0F, 87, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 485
		rightWingModel[122].setRotationPoint(-163F, -147F, 286F);

		rightWingModel[123].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F, 0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F); // Box 486
		rightWingModel[123].setRotationPoint(-179F, -147F, 286F);

		rightWingModel[124].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F, 0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F); // Box 487
		rightWingModel[124].setRotationPoint(-179F, -145F, 280F);

		rightWingModel[125].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F, 0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F); // Box 488
		rightWingModel[125].setRotationPoint(-179F, -142F, 273F);

		rightWingModel[126].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F, 0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F); // Box 489
		rightWingModel[126].setRotationPoint(-179F, -137F, 271F);

		rightWingModel[127].addShapeBox(0F, 0F, 0F, 16, 6, 37, 0F,0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F); // Box 490
		rightWingModel[127].setRotationPoint(-179F, -132F, 271F);

		rightWingModel[128].addShapeBox(0F, 0F, 0F, 16, 5, 37, 0F,0F, 1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -12F, 0F, -4F, -13F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, -13F); // Box 491
		rightWingModel[128].setRotationPoint(-179F, -126F, 271F);

		rightWingModel[129].addShapeBox(0F, 0F, 0F, 16, 5, 33, 0F,0F, 4F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -11F, 0F, -7F, -13F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -7F, -13F); // Box 492
		rightWingModel[129].setRotationPoint(-179F, -121F, 273F);

		rightWingModel[130].addShapeBox(0F, 0F, 0F, 16, 3, 19, 0F,0F, 7F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 7F, -6F, 0F, -9F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -8F); // Box 493
		rightWingModel[130].setRotationPoint(-179F, -116F, 280F);

		rightWingModel[131].addShapeBox(0F, 0F, 0F, 16, 2, 7, 0F,0F, 9F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 9F, -2F, 0F, -11F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -2F); // Box 494
		rightWingModel[131].setRotationPoint(-179F, -113F, 286F);

		rightWingModel[132].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F, 0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F); // Box 495
		rightWingModel[132].setRotationPoint(-187F, -126F, 285F);

		rightWingModel[133].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F, 0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F); // Box 496
		rightWingModel[133].setRotationPoint(-187F, -129F, 283F);

		rightWingModel[134].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F); // Box 497
		rightWingModel[134].setRotationPoint(-187F, -131F, 283F);

		rightWingModel[135].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -6.5F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6.5F, -4F, 0F, 2.5F, -4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 2.5F, -4F); // Box 498
		rightWingModel[135].setRotationPoint(-187F, -136F, 285F);

		rightWingModel[136].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F, 0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F); // Box 499
		rightWingModel[136].setRotationPoint(-187F, -135F, 285F);

		rightWingModel[137].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, -3.5F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3.5F, -6F, 0F, -0.5F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, -6F); // Box 500
		rightWingModel[137].setRotationPoint(-187F, -133F, 283F);

		rightWingModel[138].addShapeBox(0F, 0F, 0F, 23, 3, 19, 0F,0F, 0F, 0F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 4F); // Box 501
		rightWingModel[138].setRotationPoint(-76F, -145F, 280F);

		rightWingModel[139].addShapeBox(0F, 0F, 0F, 23, 2, 7, 0F,0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 6F); // Box 502
		rightWingModel[139].setRotationPoint(-76F, -147F, 286F);

		rightWingModel[140].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F, 0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F); // Box 503
		rightWingModel[140].setRotationPoint(-187F, -127F, 196F);

		rightWingModel[141].addShapeBox(0F, 0F, 0F, 8, 4, 9, 0F,0F, 1.5F, -4F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1.5F, -4F, 0F, -5.5F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, -4F); // Box 504
		rightWingModel[141].setRotationPoint(-187F, -127F, 285F);

		rightWingModel[142].addShapeBox(0F, 0F, 0F, 118, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 820
		rightWingModel[142].setRotationPoint(-82F, -118F, 379F);

		rightWingModel[143].addShapeBox(0F, 0F, 0F, 118, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 821
		rightWingModel[143].setRotationPoint(-82F, -125F, 377F);

		rightWingModel[144].addShapeBox(0F, 0F, 0F, 118, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 822
		rightWingModel[144].setRotationPoint(-82F, -133F, 377F);

		rightWingModel[145].addShapeBox(0F, 0F, 0F, 118, 3, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
		rightWingModel[145].setRotationPoint(-82F, -136F, 377F);

		rightWingModel[146].addShapeBox(0F, 0F, 0F, 118, 2, 16, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 824
		rightWingModel[146].setRotationPoint(-82F, -138F, 378F);

		rightWingModel[147].addShapeBox(0F, 0F, 0F, 118, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 825
		rightWingModel[147].setRotationPoint(-82F, -140F, 379F);

		rightWingModel[148].addShapeBox(0F, 0F, 0F, 118, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		rightWingModel[148].setRotationPoint(-82F, -141F, 382F);

		rightWingModel[149].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 827
		rightWingModel[149].setRotationPoint(36F, -120F, 380F);

		rightWingModel[150].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 829
		rightWingModel[150].setRotationPoint(36F, -120F, 379F);

		rightWingModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 830
		rightWingModel[151].setRotationPoint(48F, -120F, 381F);

		rightWingModel[152].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 831
		rightWingModel[152].setRotationPoint(36F, -120F, 392F);

		rightWingModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 832
		rightWingModel[153].setRotationPoint(48F, -120F, 389F);

		rightWingModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		rightWingModel[154].setRotationPoint(51F, -120F, 383F);

		rightWingModel[155].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 834
		rightWingModel[155].setRotationPoint(48F, -116F, 383F);

		rightWingModel[156].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, -2F, 0F, 0F, -2F, 0F); // Box 835
		rightWingModel[156].setRotationPoint(48F, -118F, 381F);

		rightWingModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, -2F, -2F); // Box 836
		rightWingModel[157].setRotationPoint(48F, -118F, 389F);

		rightWingModel[158].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -5F, 0F, 0F, -4F, 0F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 5F, 0F, 0F, 4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 837
		rightWingModel[158].setRotationPoint(36F, -120F, 389F);

		rightWingModel[159].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 838
		rightWingModel[159].setRotationPoint(36F, -115F, 383F);

		rightWingModel[160].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -2F, -1F, 0F, -2F, -2F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, 5F, 0F); // Box 839
		rightWingModel[160].setRotationPoint(36F, -120F, 379F);

		rightWingModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 892
		rightWingModel[161].setRotationPoint(42F, -141F, 383F);

		rightWingModel[162].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F); // Box 893
		rightWingModel[162].setRotationPoint(42F, -140F, 380F);

		rightWingModel[163].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 894
		rightWingModel[163].setRotationPoint(36F, -141F, 382F);

		rightWingModel[164].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 895
		rightWingModel[164].setRotationPoint(36F, -140F, 379F);

		rightWingModel[165].addShapeBox(0F, 0F, 0F, 52, 4, 101, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 876
		rightWingModel[165].setRotationPoint(-90F, -110F, 218F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[6][3];
		propellerModels[0] = makeProp1(-178F, -129.5F, 289.5F);
		propellerModels[1] = makeProp2(-178F, -129.5F, 200.5F);
		propellerModels[2] = makeProp3(-178F, -129.5F, 106.5F);
		propellerModels[3] = makeProp4(-178F, -129.5F, -106.5F);
		propellerModels[4] = makeProp5(-178F, -129.5F, -200.5F);
		propellerModels[5] = makeProp6(-178F, -129.5F, -289.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[0].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[1].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[2].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[0].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[1].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[2].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[0].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[1].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[2].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[0].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[1].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[2].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp5(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[0].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[1].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[2].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp6(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 50, 900, textureX, textureY);
		prop[0].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[1].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[2].addBox(-0.5F, -44F, -2.5F, 1, 44, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[22];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1113, 360, textureX, textureY); // Box 12
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 1153, 360, textureX, textureY); // Box 13
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 1169, 360, textureX, textureY); // Box 14
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 1185, 360, textureX, textureY); // Box 15
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 1193, 360, textureX, textureY); // Box 16
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 1201, 360, textureX, textureY); // Box 17
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 1217, 360, textureX, textureY); // Box 18
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 1233, 360, textureX, textureY); // Box 19
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 1249, 360, textureX, textureY); // Box 20
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 1265, 360, textureX, textureY); // Box 21
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 1281, 360, textureX, textureY); // Box 22
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 1297, 360, textureX, textureY); // Box 23
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 1145, 360, textureX, textureY); // Box 24
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 1313, 360, textureX, textureY); // Box 25
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 1337, 360, textureX, textureY); // Box 26
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 1353, 360, textureX, textureY); // Box 27
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 1369, 360, textureX, textureY); // Box 28
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 1393, 360, textureX, textureY); // Box 29
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 1209, 360, textureX, textureY); // Box 30
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 1409, 360, textureX, textureY); // Box 31
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 1609, 360, textureX, textureY); // Box 42
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 1529, 360, textureX, textureY); // Box 43

		gun_2_Model[0][0].addShapeBox(-8F, -9F, -2F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_2_Model[0][1].addShapeBox(4F, -9F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13

		gun_2_Model[0][2].addShapeBox(6F, -8F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 14

		gun_2_Model[0][3].addShapeBox(7F, -6F, -2F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_2_Model[0][4].addShapeBox(7F, -6F, 1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_2_Model[0][5].addShapeBox(7F, -1F, -2F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_2_Model[0][6].addShapeBox(4F, 5F, 2F, 4, 4, 1, 0F,0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 18

		gun_2_Model[0][7].addShapeBox(-2F, 5F, 4F, 6, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 19

		gun_2_Model[0][8].addShapeBox(-8F, 5F, 5F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20

		gun_2_Model[0][9].addShapeBox(4F, 5F, -3F, 4, 4, 1, 0F,0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21

		gun_2_Model[0][10].addShapeBox(-2F, 5F, -5F, 6, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 22

		gun_2_Model[0][11].addShapeBox(-8F, 5F, -6F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_2_Model[0][12].addShapeBox(-8F, -8F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 24

		gun_2_Model[0][13].addShapeBox(-8F, -6F, 5F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_2_Model[0][14].addShapeBox(-1F, -6F, 5F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 26

		gun_2_Model[0][15].addShapeBox(-8F, -8F, -3F, 3, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 27

		gun_2_Model[0][16].addShapeBox(-8F, -6F, -6F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_2_Model[0][17].addShapeBox(-1F, -6F, -6F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 29

		gun_2_Model[0][18].addShapeBox(-1F, -8F, -3F, 1, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, -3F); // Box 30

		gun_2_Model[0][19].addShapeBox(-1F, -8F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 3F); // Box 31

		gun_2_Model[0][20].addShapeBox(7F, -0.5F, -1.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_2_Model[0][21].addShapeBox(11F, -0.5F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 43

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-430F, -104F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[4];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 1497, 360, textureX, textureY); // Box 38
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 1537, 360, textureX, textureY); // Box 39
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 1577, 360, textureX, textureY); // Box 40
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 1113, 368, textureX, textureY); // Box 41

		gun_2_Model[1][0].addBox(-2F, -4F, 7F, 16, 1, 1, 0F); // Box 38

		gun_2_Model[1][1].addBox(-2F, 2F, 7F, 16, 1, 1, 0F); // Box 39

		gun_2_Model[1][2].addBox(-2F, -4F, -8F, 16, 1, 1, 0F); // Box 40

		gun_2_Model[1][3].addBox(-2F, 2F, -8F, 16, 1, 1, 0F); // Box 41

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-430F, -104F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[4];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 1417, 360, textureX, textureY); // Box 34
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 1433, 360, textureX, textureY); // Box 35
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 1457, 360, textureX, textureY); // Box 36
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 1473, 360, textureX, textureY); // Box 37

		gun_2_Model[2][0].addShapeBox(-1F, -6F, -9F, 4, 11, 3, 0F,0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 34

		gun_2_Model[2][1].addShapeBox(-8F, -6F, -9F, 7, 11, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_2_Model[2][2].addShapeBox(-1F, -6F, 6F, 4, 11, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F); // Box 36

		gun_2_Model[2][3].addShapeBox(-8F, -6F, 6F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 37

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-430F, -104F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[22];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 621, 1188, textureX, textureY); // Box 12
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 661, 1188, textureX, textureY); // Box 13
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 677, 1188, textureX, textureY); // Box 14
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 693, 1188, textureX, textureY); // Box 15
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 701, 1188, textureX, textureY); // Box 16
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 709, 1188, textureX, textureY); // Box 17
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 725, 1188, textureX, textureY); // Box 18
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 741, 1188, textureX, textureY); // Box 19
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 757, 1188, textureX, textureY); // Box 20
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 773, 1188, textureX, textureY); // Box 21
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 789, 1188, textureX, textureY); // Box 22
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 805, 1188, textureX, textureY); // Box 23
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 653, 1188, textureX, textureY); // Box 24
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 821, 1188, textureX, textureY); // Box 25
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 845, 1188, textureX, textureY); // Box 26
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 861, 1188, textureX, textureY); // Box 27
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 877, 1188, textureX, textureY); // Box 28
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 901, 1188, textureX, textureY); // Box 29
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 717, 1188, textureX, textureY); // Box 30
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 917, 1188, textureX, textureY); // Box 31
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 1117, 1188, textureX, textureY); // Box 42
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 1037, 1188, textureX, textureY); // Box 43

		gun_3_Model[0][0].addShapeBox(-8F, -9F, -2F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_3_Model[0][1].addShapeBox(4F, -9F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13

		gun_3_Model[0][2].addShapeBox(6F, -8F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 14

		gun_3_Model[0][3].addShapeBox(7F, -6F, -2F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_3_Model[0][4].addShapeBox(7F, -6F, 1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_3_Model[0][5].addShapeBox(7F, -1F, -2F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_3_Model[0][6].addShapeBox(4F, 5F, 2F, 4, 4, 1, 0F,0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 18

		gun_3_Model[0][7].addShapeBox(-2F, 5F, 4F, 6, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 19

		gun_3_Model[0][8].addShapeBox(-8F, 5F, 5F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20

		gun_3_Model[0][9].addShapeBox(4F, 5F, -3F, 4, 4, 1, 0F,0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21

		gun_3_Model[0][10].addShapeBox(-2F, 5F, -5F, 6, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 22

		gun_3_Model[0][11].addShapeBox(-8F, 5F, -6F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_3_Model[0][12].addShapeBox(-8F, -8F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 24

		gun_3_Model[0][13].addShapeBox(-8F, -6F, 5F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_3_Model[0][14].addShapeBox(-1F, -6F, 5F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 26

		gun_3_Model[0][15].addShapeBox(-8F, -8F, -3F, 3, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 27

		gun_3_Model[0][16].addShapeBox(-8F, -6F, -6F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_3_Model[0][17].addShapeBox(-1F, -6F, -6F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 29

		gun_3_Model[0][18].addShapeBox(-1F, -8F, -3F, 1, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, -3F); // Box 30

		gun_3_Model[0][19].addShapeBox(-1F, -8F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 3F); // Box 31

		gun_3_Model[0][20].addShapeBox(7F, -0.5F, -1.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_3_Model[0][21].addShapeBox(11F, -0.5F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 43

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(44F, -129F, 386F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[4];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 1005, 1188, textureX, textureY); // Box 38
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 1045, 1188, textureX, textureY); // Box 39
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 1085, 1188, textureX, textureY); // Box 40
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 621, 1196, textureX, textureY); // Box 41

		gun_3_Model[1][0].addBox(-2F, -4F, 7F, 16, 1, 1, 0F); // Box 38

		gun_3_Model[1][1].addBox(-2F, 2F, 7F, 16, 1, 1, 0F); // Box 39

		gun_3_Model[1][2].addBox(-2F, -4F, -8F, 16, 1, 1, 0F); // Box 40

		gun_3_Model[1][3].addBox(-2F, 2F, -8F, 16, 1, 1, 0F); // Box 41

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(44F, -129F, 386F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[4];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 925, 1188, textureX, textureY); // Box 34
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 941, 1188, textureX, textureY); // Box 35
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 965, 1188, textureX, textureY); // Box 36
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 981, 1188, textureX, textureY); // Box 37

		gun_3_Model[2][0].addShapeBox(-1F, -6F, -9F, 4, 11, 3, 0F,0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 34

		gun_3_Model[2][1].addShapeBox(-8F, -6F, -9F, 7, 11, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_3_Model[2][2].addShapeBox(-1F, -6F, 6F, 4, 11, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F); // Box 36

		gun_3_Model[2][3].addShapeBox(-8F, -6F, 6F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 37

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(44F, -129F, 386F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[22];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 120, 471, textureX, textureY); // Box 12
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 160, 471, textureX, textureY); // Box 13
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 176, 471, textureX, textureY); // Box 14
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 192, 471, textureX, textureY); // Box 15
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 200, 471, textureX, textureY); // Box 16
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 208, 471, textureX, textureY); // Box 17
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 224, 471, textureX, textureY); // Box 18
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 240, 471, textureX, textureY); // Box 19
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 256, 471, textureX, textureY); // Box 20
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 272, 471, textureX, textureY); // Box 21
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 288, 471, textureX, textureY); // Box 22
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 304, 471, textureX, textureY); // Box 23
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 152, 471, textureX, textureY); // Box 24
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 320, 471, textureX, textureY); // Box 25
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 344, 471, textureX, textureY); // Box 26
		gun_4_Model[0][15] = new ModelRendererTurbo(this, 360, 471, textureX, textureY); // Box 27
		gun_4_Model[0][16] = new ModelRendererTurbo(this, 376, 471, textureX, textureY); // Box 28
		gun_4_Model[0][17] = new ModelRendererTurbo(this, 400, 471, textureX, textureY); // Box 29
		gun_4_Model[0][18] = new ModelRendererTurbo(this, 216, 471, textureX, textureY); // Box 30
		gun_4_Model[0][19] = new ModelRendererTurbo(this, 416, 471, textureX, textureY); // Box 31
		gun_4_Model[0][20] = new ModelRendererTurbo(this, 616, 471, textureX, textureY); // Box 42
		gun_4_Model[0][21] = new ModelRendererTurbo(this, 536, 471, textureX, textureY); // Box 43

		gun_4_Model[0][0].addShapeBox(-8F, -9F, -2F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_4_Model[0][1].addShapeBox(4F, -9F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13

		gun_4_Model[0][2].addShapeBox(6F, -8F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 14

		gun_4_Model[0][3].addShapeBox(7F, -6F, -2F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_4_Model[0][4].addShapeBox(7F, -6F, 1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_4_Model[0][5].addShapeBox(7F, -1F, -2F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_4_Model[0][6].addShapeBox(4F, 5F, 2F, 4, 4, 1, 0F,0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 18

		gun_4_Model[0][7].addShapeBox(-2F, 5F, 4F, 6, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 19

		gun_4_Model[0][8].addShapeBox(-8F, 5F, 5F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20

		gun_4_Model[0][9].addShapeBox(4F, 5F, -3F, 4, 4, 1, 0F,0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21

		gun_4_Model[0][10].addShapeBox(-2F, 5F, -5F, 6, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 22

		gun_4_Model[0][11].addShapeBox(-8F, 5F, -6F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_4_Model[0][12].addShapeBox(-8F, -8F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 24

		gun_4_Model[0][13].addShapeBox(-8F, -6F, 5F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_4_Model[0][14].addShapeBox(-1F, -6F, 5F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 26

		gun_4_Model[0][15].addShapeBox(-8F, -8F, -3F, 3, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 27

		gun_4_Model[0][16].addShapeBox(-8F, -6F, -6F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_4_Model[0][17].addShapeBox(-1F, -6F, -6F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 29

		gun_4_Model[0][18].addShapeBox(-1F, -8F, -3F, 1, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, -3F); // Box 30

		gun_4_Model[0][19].addShapeBox(-1F, -8F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 3F); // Box 31

		gun_4_Model[0][20].addShapeBox(7F, -0.5F, -1.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_4_Model[0][21].addShapeBox(11F, -0.5F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 43

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(44F, -129F, -386F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[4];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 504, 471, textureX, textureY); // Box 38
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 544, 471, textureX, textureY); // Box 39
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 584, 471, textureX, textureY); // Box 40
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 120, 479, textureX, textureY); // Box 41

		gun_4_Model[1][0].addBox(-2F, -4F, 7F, 16, 1, 1, 0F); // Box 38

		gun_4_Model[1][1].addBox(-2F, 2F, 7F, 16, 1, 1, 0F); // Box 39

		gun_4_Model[1][2].addBox(-2F, -4F, -8F, 16, 1, 1, 0F); // Box 40

		gun_4_Model[1][3].addBox(-2F, 2F, -8F, 16, 1, 1, 0F); // Box 41

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(44F, -129F, -386F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[4];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 424, 471, textureX, textureY); // Box 34
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 440, 471, textureX, textureY); // Box 35
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 464, 471, textureX, textureY); // Box 36
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 480, 471, textureX, textureY); // Box 37

		gun_4_Model[2][0].addShapeBox(-1F, -6F, -9F, 4, 11, 3, 0F,0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 34

		gun_4_Model[2][1].addShapeBox(-8F, -6F, -9F, 7, 11, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_4_Model[2][2].addShapeBox(-1F, -6F, 6F, 4, 11, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F); // Box 36

		gun_4_Model[2][3].addShapeBox(-8F, -6F, 6F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 37

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(44F, -129F, -386F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[22];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 48, 477, textureX, textureY); // Box 12
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 88, 477, textureX, textureY); // Box 13
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 104, 477, textureX, textureY); // Box 14
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Box 15
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 128, 477, textureX, textureY); // Box 16
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 136, 477, textureX, textureY); // Box 17
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 152, 477, textureX, textureY); // Box 18
		gun_5_Model[0][7] = new ModelRendererTurbo(this, 168, 477, textureX, textureY); // Box 19
		gun_5_Model[0][8] = new ModelRendererTurbo(this, 184, 477, textureX, textureY); // Box 20
		gun_5_Model[0][9] = new ModelRendererTurbo(this, 200, 477, textureX, textureY); // Box 21
		gun_5_Model[0][10] = new ModelRendererTurbo(this, 216, 477, textureX, textureY); // Box 22
		gun_5_Model[0][11] = new ModelRendererTurbo(this, 232, 477, textureX, textureY); // Box 23
		gun_5_Model[0][12] = new ModelRendererTurbo(this, 80, 477, textureX, textureY); // Box 24
		gun_5_Model[0][13] = new ModelRendererTurbo(this, 248, 477, textureX, textureY); // Box 25
		gun_5_Model[0][14] = new ModelRendererTurbo(this, 272, 477, textureX, textureY); // Box 26
		gun_5_Model[0][15] = new ModelRendererTurbo(this, 288, 477, textureX, textureY); // Box 27
		gun_5_Model[0][16] = new ModelRendererTurbo(this, 304, 477, textureX, textureY); // Box 28
		gun_5_Model[0][17] = new ModelRendererTurbo(this, 328, 477, textureX, textureY); // Box 29
		gun_5_Model[0][18] = new ModelRendererTurbo(this, 144, 477, textureX, textureY); // Box 30
		gun_5_Model[0][19] = new ModelRendererTurbo(this, 344, 477, textureX, textureY); // Box 31
		gun_5_Model[0][20] = new ModelRendererTurbo(this, 544, 477, textureX, textureY); // Box 42
		gun_5_Model[0][21] = new ModelRendererTurbo(this, 464, 477, textureX, textureY); // Box 43

		gun_5_Model[0][0].addShapeBox(-8F, -9F, -2F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_5_Model[0][1].addShapeBox(4F, -9F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 13

		gun_5_Model[0][2].addShapeBox(6F, -8F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 14

		gun_5_Model[0][3].addShapeBox(7F, -6F, -2F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_5_Model[0][4].addShapeBox(7F, -6F, 1F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_5_Model[0][5].addShapeBox(7F, -1F, -2F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_5_Model[0][6].addShapeBox(4F, 5F, 2F, 4, 4, 1, 0F,0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 18

		gun_5_Model[0][7].addShapeBox(-2F, 5F, 4F, 6, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 19

		gun_5_Model[0][8].addShapeBox(-8F, 5F, 5F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20

		gun_5_Model[0][9].addShapeBox(4F, 5F, -3F, 4, 4, 1, 0F,0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 21

		gun_5_Model[0][10].addShapeBox(-2F, 5F, -5F, 6, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 22

		gun_5_Model[0][11].addShapeBox(-8F, 5F, -6F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_5_Model[0][12].addShapeBox(-8F, -8F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 24

		gun_5_Model[0][13].addShapeBox(-8F, -6F, 5F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_5_Model[0][14].addShapeBox(-1F, -6F, 5F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 26

		gun_5_Model[0][15].addShapeBox(-8F, -8F, -3F, 3, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 27

		gun_5_Model[0][16].addShapeBox(-8F, -6F, -6F, 7, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_5_Model[0][17].addShapeBox(-1F, -6F, -6F, 4, 11, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 29

		gun_5_Model[0][18].addShapeBox(-1F, -8F, -3F, 1, 2, 1, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, -3F); // Box 30

		gun_5_Model[0][19].addShapeBox(-1F, -8F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 3F); // Box 31

		gun_5_Model[0][20].addShapeBox(7F, -0.5F, -1.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_5_Model[0][21].addShapeBox(11F, -0.5F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 43

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(440F, -127F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[4];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 432, 477, textureX, textureY); // Box 38
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 472, 477, textureX, textureY); // Box 39
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 512, 477, textureX, textureY); // Box 40
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 48, 485, textureX, textureY); // Box 41

		gun_5_Model[1][0].addBox(-2F, -4F, 7F, 16, 1, 1, 0F); // Box 38

		gun_5_Model[1][1].addBox(-2F, 2F, 7F, 16, 1, 1, 0F); // Box 39

		gun_5_Model[1][2].addBox(-2F, -4F, -8F, 16, 1, 1, 0F); // Box 40

		gun_5_Model[1][3].addBox(-2F, 2F, -8F, 16, 1, 1, 0F); // Box 41

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(440F, -127F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[4];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 352, 477, textureX, textureY); // Box 34
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 368, 477, textureX, textureY); // Box 35
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 392, 477, textureX, textureY); // Box 36
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 408, 477, textureX, textureY); // Box 37

		gun_5_Model[2][0].addShapeBox(-1F, -6F, -9F, 4, 11, 3, 0F,0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 34

		gun_5_Model[2][1].addShapeBox(-8F, -6F, -9F, 7, 11, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_5_Model[2][2].addShapeBox(-1F, -6F, 6F, 4, 11, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -5F, 0F, 0F, -1F, 0F); // Box 36

		gun_5_Model[2][3].addShapeBox(-8F, -6F, 6F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 37

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(440F, -127F, 0F);
		}


		registerGunModel("PassengerGun5", gun_5_Model);
	}
}