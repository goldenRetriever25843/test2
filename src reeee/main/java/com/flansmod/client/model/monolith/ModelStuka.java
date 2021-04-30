//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.06.2016 - 19:55:04
// Last changed on: 18.06.2016 - 19:55:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStuka extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelStuka() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[331];
		tailModel = new ModelRendererTurbo[59];
		leftWingModel = new ModelRendererTurbo[27];
		rightWingModel = new ModelRendererTurbo[42];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 1321, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 1457, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 1833, 9, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 1441, 9, textureX, textureY); // Box 42
		bodyModel[22] = new ModelRendererTurbo(this, 1905, 9, textureX, textureY); // Box 43
		bodyModel[23] = new ModelRendererTurbo(this, 1529, 9, textureX, textureY); // Box 44
		bodyModel[24] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 45
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		bodyModel[26] = new ModelRendererTurbo(this, 1217, 9, textureX, textureY); // Box 47
		bodyModel[27] = new ModelRendererTurbo(this, 1225, 9, textureX, textureY); // Box 48
		bodyModel[28] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 49
		bodyModel[29] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 50
		bodyModel[30] = new ModelRendererTurbo(this, 1233, 9, textureX, textureY); // Box 51
		bodyModel[31] = new ModelRendererTurbo(this, 1081, 9, textureX, textureY); // Box 52
		bodyModel[32] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 53
		bodyModel[33] = new ModelRendererTurbo(this, 1593, 9, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 1601, 9, textureX, textureY); // Box 55
		bodyModel[35] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 56
		bodyModel[36] = new ModelRendererTurbo(this, 1617, 9, textureX, textureY); // Box 57
		bodyModel[37] = new ModelRendererTurbo(this, 1777, 9, textureX, textureY); // Box 58
		bodyModel[38] = new ModelRendererTurbo(this, 1681, 1, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 1793, 9, textureX, textureY); // Box 63
		bodyModel[40] = new ModelRendererTurbo(this, 1945, 9, textureX, textureY); // Box 64
		bodyModel[41] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 65
		bodyModel[42] = new ModelRendererTurbo(this, 1977, 9, textureX, textureY); // Box 65
		bodyModel[43] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 66
		bodyModel[44] = new ModelRendererTurbo(this, 1897, 9, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 68
		bodyModel[46] = new ModelRendererTurbo(this, 1985, 9, textureX, textureY); // Box 69
		bodyModel[47] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 70
		bodyModel[48] = new ModelRendererTurbo(this, 1937, 9, textureX, textureY); // Box 71
		bodyModel[49] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 72
		bodyModel[50] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 1961, 9, textureX, textureY); // Box 75
		bodyModel[52] = new ModelRendererTurbo(this, 2025, 9, textureX, textureY); // Box 76
		bodyModel[53] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 77
		bodyModel[54] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 78
		bodyModel[55] = new ModelRendererTurbo(this, 1601, 9, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 83
		bodyModel[57] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 84
		bodyModel[58] = new ModelRendererTurbo(this, 1241, 41, textureX, textureY); // Box 85
		bodyModel[59] = new ModelRendererTurbo(this, 1593, 41, textureX, textureY); // Box 86
		bodyModel[60] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 87
		bodyModel[61] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 88
		bodyModel[62] = new ModelRendererTurbo(this, 1049, 17, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 1241, 17, textureX, textureY); // Box 93
		bodyModel[64] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 94
		bodyModel[65] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 96
		bodyModel[67] = new ModelRendererTurbo(this, 1441, 17, textureX, textureY); // Box 100
		bodyModel[68] = new ModelRendererTurbo(this, 1625, 17, textureX, textureY); // Box 101
		bodyModel[69] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 122
		bodyModel[70] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 123
		bodyModel[71] = new ModelRendererTurbo(this, 1833, 17, textureX, textureY); // Box 124
		bodyModel[72] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 125
		bodyModel[73] = new ModelRendererTurbo(this, 1137, 17, textureX, textureY); // Box 126
		bodyModel[74] = new ModelRendererTurbo(this, 1953, 9, textureX, textureY); // Box 127
		bodyModel[75] = new ModelRendererTurbo(this, 1609, 9, textureX, textureY); // Box 128
		bodyModel[76] = new ModelRendererTurbo(this, 1169, 17, textureX, textureY); // Box 129
		bodyModel[77] = new ModelRendererTurbo(this, 1529, 17, textureX, textureY); // Box 130
		bodyModel[78] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 131
		bodyModel[79] = new ModelRendererTurbo(this, 1777, 9, textureX, textureY); // Box 132
		bodyModel[80] = new ModelRendererTurbo(this, 1537, 17, textureX, textureY); // Box 133
		bodyModel[81] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 134
		bodyModel[82] = new ModelRendererTurbo(this, 1785, 9, textureX, textureY); // Box 135
		bodyModel[83] = new ModelRendererTurbo(this, 1545, 17, textureX, textureY); // Box 139
		bodyModel[84] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 140
		bodyModel[85] = new ModelRendererTurbo(this, 2041, 9, textureX, textureY); // Box 141
		bodyModel[86] = new ModelRendererTurbo(this, 1601, 17, textureX, textureY); // Box 145
		bodyModel[87] = new ModelRendererTurbo(this, 1777, 17, textureX, textureY); // Box 146
		bodyModel[88] = new ModelRendererTurbo(this, 1049, 17, textureX, textureY); // Box 147
		bodyModel[89] = new ModelRendererTurbo(this, 1609, 17, textureX, textureY); // Box 148
		bodyModel[90] = new ModelRendererTurbo(this, 1881, 17, textureX, textureY); // Box 149
		bodyModel[91] = new ModelRendererTurbo(this, 1217, 17, textureX, textureY); // Box 150
		bodyModel[92] = new ModelRendererTurbo(this, 1977, 25, textureX, textureY); // Box 151
		bodyModel[93] = new ModelRendererTurbo(this, 1985, 17, textureX, textureY); // Box 153
		bodyModel[94] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 154
		bodyModel[95] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Box 155
		bodyModel[96] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 156
		bodyModel[97] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 157
		bodyModel[98] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 158
		bodyModel[99] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 159
		bodyModel[100] = new ModelRendererTurbo(this, 1889, 17, textureX, textureY); // Box 161
		bodyModel[101] = new ModelRendererTurbo(this, 1049, 33, textureX, textureY); // Box 170
		bodyModel[102] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 173
		bodyModel[103] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 201
		bodyModel[104] = new ModelRendererTurbo(this, 1761, 81, textureX, textureY); // Box 202
		bodyModel[105] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 203
		bodyModel[106] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 205
		bodyModel[107] = new ModelRendererTurbo(this, 1297, 89, textureX, textureY); // Box 206
		bodyModel[108] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 207
		bodyModel[109] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 210
		bodyModel[110] = new ModelRendererTurbo(this, 1481, 25, textureX, textureY); // Box 212
		bodyModel[111] = new ModelRendererTurbo(this, 1281, 33, textureX, textureY); // Box 213
		bodyModel[112] = new ModelRendererTurbo(this, 1617, 25, textureX, textureY); // Box 214
		bodyModel[113] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 215
		bodyModel[114] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 216
		bodyModel[115] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 217
		bodyModel[116] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 211
		bodyModel[117] = new ModelRendererTurbo(this, 1393, 41, textureX, textureY); // Box 212
		bodyModel[118] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 213
		bodyModel[119] = new ModelRendererTurbo(this, 1745, 41, textureX, textureY); // Box 214
		bodyModel[120] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 215
		bodyModel[121] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 216
		bodyModel[122] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 219
		bodyModel[123] = new ModelRendererTurbo(this, 1753, 49, textureX, textureY); // Box 222
		bodyModel[124] = new ModelRendererTurbo(this, 1977, 49, textureX, textureY); // Box 223
		bodyModel[125] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 224
		bodyModel[126] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 225
		bodyModel[127] = new ModelRendererTurbo(this, 1049, 57, textureX, textureY); // Box 226
		bodyModel[128] = new ModelRendererTurbo(this, 1465, 57, textureX, textureY); // Box 227
		bodyModel[129] = new ModelRendererTurbo(this, 1257, 57, textureX, textureY); // Box 233
		bodyModel[130] = new ModelRendererTurbo(this, 1521, 57, textureX, textureY); // Box 235
		bodyModel[131] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 236
		bodyModel[132] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 237
		bodyModel[133] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 238
		bodyModel[134] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 239
		bodyModel[135] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 242
		bodyModel[136] = new ModelRendererTurbo(this, 1441, 41, textureX, textureY); // Box 260
		bodyModel[137] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 261
		bodyModel[138] = new ModelRendererTurbo(this, 1529, 49, textureX, textureY); // Box 262
		bodyModel[139] = new ModelRendererTurbo(this, 1873, 49, textureX, textureY); // Box 263
		bodyModel[140] = new ModelRendererTurbo(this, 2017, 49, textureX, textureY); // Box 265
		bodyModel[141] = new ModelRendererTurbo(this, 2033, 49, textureX, textureY); // Box 266
		bodyModel[142] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 268
		bodyModel[143] = new ModelRendererTurbo(this, 1105, 57, textureX, textureY); // Box 269
		bodyModel[144] = new ModelRendererTurbo(this, 1409, 57, textureX, textureY); // Box 270
		bodyModel[145] = new ModelRendererTurbo(this, 1121, 57, textureX, textureY); // Box 271
		bodyModel[146] = new ModelRendererTurbo(this, 1873, 57, textureX, textureY); // Box 272
		bodyModel[147] = new ModelRendererTurbo(this, 2017, 57, textureX, textureY); // Box 273
		bodyModel[148] = new ModelRendererTurbo(this, 2033, 57, textureX, textureY); // Box 274
		bodyModel[149] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 275
		bodyModel[150] = new ModelRendererTurbo(this, 1105, 65, textureX, textureY); // Box 276
		bodyModel[151] = new ModelRendererTurbo(this, 1121, 65, textureX, textureY); // Box 277
		bodyModel[152] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 278
		bodyModel[153] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Box 279
		bodyModel[154] = new ModelRendererTurbo(this, 1305, 25, textureX, textureY); // Box 280
		bodyModel[155] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 281
		bodyModel[156] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 282
		bodyModel[157] = new ModelRendererTurbo(this, 1289, 65, textureX, textureY); // Box 283
		bodyModel[158] = new ModelRendererTurbo(this, 1409, 65, textureX, textureY); // Box 284
		bodyModel[159] = new ModelRendererTurbo(this, 1729, 65, textureX, textureY); // Box 285
		bodyModel[160] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 292
		bodyModel[161] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 293
		bodyModel[162] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 294
		bodyModel[163] = new ModelRendererTurbo(this, 1153, 89, textureX, textureY); // Box 295
		bodyModel[164] = new ModelRendererTurbo(this, 1297, 89, textureX, textureY); // Box 296
		bodyModel[165] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 297
		bodyModel[166] = new ModelRendererTurbo(this, 1409, 73, textureX, textureY); // Box 298
		bodyModel[167] = new ModelRendererTurbo(this, 1465, 81, textureX, textureY); // Box 299
		bodyModel[168] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 300
		bodyModel[169] = new ModelRendererTurbo(this, 1257, 73, textureX, textureY); // Box 301
		bodyModel[170] = new ModelRendererTurbo(this, 1465, 73, textureX, textureY); // Box 302
		bodyModel[171] = new ModelRendererTurbo(this, 2009, 73, textureX, textureY); // Box 303
		bodyModel[172] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Box 304
		bodyModel[173] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 305
		bodyModel[174] = new ModelRendererTurbo(this, 1369, 89, textureX, textureY); // Box 310
		bodyModel[175] = new ModelRendererTurbo(this, 1497, 89, textureX, textureY); // Box 311
		bodyModel[176] = new ModelRendererTurbo(this, 1481, 73, textureX, textureY); // Box 312
		bodyModel[177] = new ModelRendererTurbo(this, 1537, 89, textureX, textureY); // Box 319
		bodyModel[178] = new ModelRendererTurbo(this, 1913, 89, textureX, textureY); // Box 320
		bodyModel[179] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 321
		bodyModel[180] = new ModelRendererTurbo(this, 1833, 89, textureX, textureY); // Box 322
		bodyModel[181] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 323
		bodyModel[182] = new ModelRendererTurbo(this, 1609, 89, textureX, textureY); // Box 324
		bodyModel[183] = new ModelRendererTurbo(this, 1977, 89, textureX, textureY); // Box 325
		bodyModel[184] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 326
		bodyModel[185] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 327
		bodyModel[186] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 328
		bodyModel[187] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 329
		bodyModel[188] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 330
		bodyModel[189] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 331
		bodyModel[190] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 332
		bodyModel[191] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 333
		bodyModel[192] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 334
		bodyModel[193] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 335
		bodyModel[194] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 336
		bodyModel[195] = new ModelRendererTurbo(this, 1465, 97, textureX, textureY); // Box 337
		bodyModel[196] = new ModelRendererTurbo(this, 1545, 97, textureX, textureY); // Box 338
		bodyModel[197] = new ModelRendererTurbo(this, 1577, 97, textureX, textureY); // Box 339
		bodyModel[198] = new ModelRendererTurbo(this, 1609, 97, textureX, textureY); // Box 340
		bodyModel[199] = new ModelRendererTurbo(this, 1833, 97, textureX, textureY); // Box 341
		bodyModel[200] = new ModelRendererTurbo(this, 1913, 97, textureX, textureY); // Box 342
		bodyModel[201] = new ModelRendererTurbo(this, 1969, 97, textureX, textureY); // Box 343
		bodyModel[202] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 344
		bodyModel[203] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 345
		bodyModel[204] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 346
		bodyModel[205] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 347
		bodyModel[206] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 348
		bodyModel[207] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 349
		bodyModel[208] = new ModelRendererTurbo(this, 1153, 105, textureX, textureY); // Box 350
		bodyModel[209] = new ModelRendererTurbo(this, 1297, 105, textureX, textureY); // Box 351
		bodyModel[210] = new ModelRendererTurbo(this, 1369, 105, textureX, textureY); // Box 352
		bodyModel[211] = new ModelRendererTurbo(this, 1465, 105, textureX, textureY); // Box 353
		bodyModel[212] = new ModelRendererTurbo(this, 1545, 105, textureX, textureY); // Box 354
		bodyModel[213] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 358
		bodyModel[214] = new ModelRendererTurbo(this, 1977, 17, textureX, textureY); // Box 359
		bodyModel[215] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 360
		bodyModel[216] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 362
		bodyModel[217] = new ModelRendererTurbo(this, 1545, 49, textureX, textureY); // Box 363
		bodyModel[218] = new ModelRendererTurbo(this, 2017, 33, textureX, textureY); // Box 364
		bodyModel[219] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 365
		bodyModel[220] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Box 366
		bodyModel[221] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 367
		bodyModel[222] = new ModelRendererTurbo(this, 1601, 113, textureX, textureY); // Box 368
		bodyModel[223] = new ModelRendererTurbo(this, 1833, 113, textureX, textureY); // Box 369
		bodyModel[224] = new ModelRendererTurbo(this, 1041, 89, textureX, textureY); // Box 370
		bodyModel[225] = new ModelRendererTurbo(this, 1913, 113, textureX, textureY); // Box 371
		bodyModel[226] = new ModelRendererTurbo(this, 2009, 97, textureX, textureY); // Box 374
		bodyModel[227] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 375
		bodyModel[228] = new ModelRendererTurbo(this, 1985, 113, textureX, textureY); // Box 376
		bodyModel[229] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 377
		bodyModel[230] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 379
		bodyModel[231] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 380
		bodyModel[232] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 382
		bodyModel[233] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 383
		bodyModel[234] = new ModelRendererTurbo(this, 977, 89, textureX, textureY); // Box 384
		bodyModel[235] = new ModelRendererTurbo(this, 1185, 89, textureX, textureY); // Box 385
		bodyModel[236] = new ModelRendererTurbo(this, 1329, 89, textureX, textureY); // Box 388
		bodyModel[237] = new ModelRendererTurbo(this, 1409, 89, textureX, textureY); // Box 389
		bodyModel[238] = new ModelRendererTurbo(this, 2033, 73, textureX, textureY); // Box 391
		bodyModel[239] = new ModelRendererTurbo(this, 1297, 57, textureX, textureY); // Box 392
		bodyModel[240] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Box 393
		bodyModel[241] = new ModelRendererTurbo(this, 1801, 89, textureX, textureY); // Box 394
		bodyModel[242] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 395
		bodyModel[243] = new ModelRendererTurbo(this, 2025, 89, textureX, textureY); // Box 396
		bodyModel[244] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Box 397
		bodyModel[245] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 398
		bodyModel[246] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 399
		bodyModel[247] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 402
		bodyModel[248] = new ModelRendererTurbo(this, 1065, 89, textureX, textureY); // Box 403
		bodyModel[249] = new ModelRendererTurbo(this, 1193, 97, textureX, textureY); // Box 404
		bodyModel[250] = new ModelRendererTurbo(this, 1337, 97, textureX, textureY); // Box 405
		bodyModel[251] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 406
		bodyModel[252] = new ModelRendererTurbo(this, 1409, 97, textureX, textureY); // Box 407
		bodyModel[253] = new ModelRendererTurbo(this, 1505, 97, textureX, textureY); // Box 408
		bodyModel[254] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 409
		bodyModel[255] = new ModelRendererTurbo(this, 1801, 97, textureX, textureY); // Box 410
		bodyModel[256] = new ModelRendererTurbo(this, 1873, 97, textureX, textureY); // Box 411
		bodyModel[257] = new ModelRendererTurbo(this, 1953, 97, textureX, textureY); // Box 412
		bodyModel[258] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 413
		bodyModel[259] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 414
		bodyModel[260] = new ModelRendererTurbo(this, 1273, 73, textureX, textureY); // Box 415
		bodyModel[261] = new ModelRendererTurbo(this, 1521, 73, textureX, textureY); // Box 416
		bodyModel[262] = new ModelRendererTurbo(this, 1537, 73, textureX, textureY); // Box 417
		bodyModel[263] = new ModelRendererTurbo(this, 1089, 81, textureX, textureY); // Box 418
		bodyModel[264] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 419
		bodyModel[265] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 420
		bodyModel[266] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 383
		bodyModel[267] = new ModelRendererTurbo(this, 2017, 113, textureX, textureY); // Box 384
		bodyModel[268] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 385
		bodyModel[269] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 386
		bodyModel[270] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 387
		bodyModel[271] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 388
		bodyModel[272] = new ModelRendererTurbo(this, 593, 121, textureX, textureY); // Box 389
		bodyModel[273] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 390
		bodyModel[274] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 391
		bodyModel[275] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 392
		bodyModel[276] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 395
		bodyModel[277] = new ModelRendererTurbo(this, 777, 121, textureX, textureY); // Box 396
		bodyModel[278] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 397
		bodyModel[279] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 398
		bodyModel[280] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 399
		bodyModel[281] = new ModelRendererTurbo(this, 1049, 121, textureX, textureY); // Box 400
		bodyModel[282] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 401
		bodyModel[283] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 402
		bodyModel[284] = new ModelRendererTurbo(this, 1793, 49, textureX, textureY); // Box 403
		bodyModel[285] = new ModelRendererTurbo(this, 1889, 49, textureX, textureY); // Box 405
		bodyModel[286] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 406
		bodyModel[287] = new ModelRendererTurbo(this, 1793, 57, textureX, textureY); // Box 407
		bodyModel[288] = new ModelRendererTurbo(this, 1049, 49, textureX, textureY); // Box 408
		bodyModel[289] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 409
		bodyModel[290] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 410
		bodyModel[291] = new ModelRendererTurbo(this, 1409, 57, textureX, textureY); // Box 411
		bodyModel[292] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 412
		bodyModel[293] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 413
		bodyModel[294] = new ModelRendererTurbo(this, 1193, 113, textureX, textureY); // Box 414
		bodyModel[295] = new ModelRendererTurbo(this, 1873, 113, textureX, textureY); // Box 415
		bodyModel[296] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 416
		bodyModel[297] = new ModelRendererTurbo(this, 1801, 105, textureX, textureY); // Box 417
		bodyModel[298] = new ModelRendererTurbo(this, 1153, 121, textureX, textureY); // Box 418
		bodyModel[299] = new ModelRendererTurbo(this, 1297, 121, textureX, textureY); // Box 419
		bodyModel[300] = new ModelRendererTurbo(this, 1321, 121, textureX, textureY); // Box 420
		bodyModel[301] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 421
		bodyModel[302] = new ModelRendererTurbo(this, 1545, 121, textureX, textureY); // Box 422
		bodyModel[303] = new ModelRendererTurbo(this, 1585, 121, textureX, textureY); // Box 423
		bodyModel[304] = new ModelRendererTurbo(this, 1641, 113, textureX, textureY); // Box 424
		bodyModel[305] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 425
		bodyModel[306] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 426
		bodyModel[307] = new ModelRendererTurbo(this, 1889, 57, textureX, textureY); // Box 427
		bodyModel[308] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 428
		bodyModel[309] = new ModelRendererTurbo(this, 849, 105, textureX, textureY); // Box 430
		bodyModel[310] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 431
		bodyModel[311] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 432
		bodyModel[312] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 433
		bodyModel[313] = new ModelRendererTurbo(this, 1425, 65, textureX, textureY); // Box 434
		bodyModel[314] = new ModelRendererTurbo(this, 1745, 65, textureX, textureY); // Box 435
		bodyModel[315] = new ModelRendererTurbo(this, 1793, 65, textureX, textureY); // Box 436
		bodyModel[316] = new ModelRendererTurbo(this, 2041, 65, textureX, textureY); // Box 437
		bodyModel[317] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 438
		bodyModel[318] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 439
		bodyModel[319] = new ModelRendererTurbo(this, 1977, 121, textureX, textureY); // Box 440
		bodyModel[320] = new ModelRendererTurbo(this, 1177, 121, textureX, textureY); // Box 443
		bodyModel[321] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 444
		bodyModel[322] = new ModelRendererTurbo(this, 1617, 121, textureX, textureY); // Box 445
		bodyModel[323] = new ModelRendererTurbo(this, 1833, 121, textureX, textureY); // Box 446
		bodyModel[324] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 449
		bodyModel[325] = new ModelRendererTurbo(this, 1129, 73, textureX, textureY); // Box 450
		bodyModel[326] = new ModelRendererTurbo(this, 1913, 121, textureX, textureY); // Box 451
		bodyModel[327] = new ModelRendererTurbo(this, 2041, 81, textureX, textureY); // Box 452
		bodyModel[328] = new ModelRendererTurbo(this, 1209, 89, textureX, textureY); // Box 453
		bodyModel[329] = new ModelRendererTurbo(this, 1417, 153, textureX, textureY); // Box 454
		bodyModel[330] = new ModelRendererTurbo(this, 1345, 113, textureX, textureY); // Box 455

		bodyModel[0].addShapeBox(0F, 0F, 0F, 73, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -32F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 73, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-38F, -47F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 73, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 4
		bodyModel[2].setRotationPoint(-38F, -37F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 73, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 5
		bodyModel[3].setRotationPoint(-38F, -33F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 31, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-38F, -53F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 42, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-7F, -53F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 31, 5, 1, 0F,0F, -1.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-38F, -58F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, -2.75F, 2F, 0F, -1F, 3F, 1F, 4F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 2F, 1F, -4F, 0F, 0F, 0.5F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-38F, -59F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 31, 1, 6, 0F,0F, -1F, 0F, 1F, 4F, 0F, 0F, 5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, -4F, 0F, 0F, -5F, 0F, 0F, 0.5F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-38F, -59F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 37, 1, 8, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 12
		bodyModel[9].setRotationPoint(35F, -32F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 37, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0F, 2F); // Box 13
		bodyModel[10].setRotationPoint(35F, -37F, -12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 37, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -4F, 0F, -3F, 3F, 0F, -1F, 1F); // Box 14
		bodyModel[11].setRotationPoint(35F, -33F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 37, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(35F, -47F, -12F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 37, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(35F, -53F, -12F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-61F, -55F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F,0F, -1F, 0F, 0F, 2.25F, 1F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -3.5F, -1F, 0F, -4.5F, 0F, 0F, -1F, 0F); // Box 18
		bodyModel[15].setRotationPoint(-61F, -54F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,0F, -5F, -2F, 0F, -1.75F, -1F, 0F, -1.5F, 2F, 0F, -5F, 2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-61F, -58F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 23, 6, 1, 0F,0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -3F, 2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 20
		bodyModel[17].setRotationPoint(-61F, -53F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 23, 10, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 2F); // Box 21
		bodyModel[18].setRotationPoint(-61F, -47F, -12F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[19].setRotationPoint(-7F, -58F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[20].setRotationPoint(4F, -54F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, 1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, 1.15F, 0F, 0F, 0F); // Box 42
		bodyModel[21].setRotationPoint(35F, -54F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0.85F, 0F, 0F, 0F); // Box 43
		bodyModel[22].setRotationPoint(56F, -54F, -9.85F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,-1F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 44
		bodyModel[23].setRotationPoint(-7F, -63F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[24].setRotationPoint(3F, -71.5F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, -1F, -1F); // Box 46
		bodyModel[25].setRotationPoint(3F, -70.5F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 47
		bodyModel[26].setRotationPoint(3F, -69.5F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 48
		bodyModel[27].setRotationPoint(8.5F, -69.5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[28].setRotationPoint(8.5F, -71.5F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, -1F, -1F); // Box 50
		bodyModel[29].setRotationPoint(8.5F, -70.5F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 51
		bodyModel[30].setRotationPoint(14F, -69.5F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[31].setRotationPoint(14F, -71.5F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, -1F, -1F); // Box 53
		bodyModel[32].setRotationPoint(14F, -70.5F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 3F, -5.5F, 0F, 3F, -5.5F, 0F, -3F, 5F, 0F, -3F); // Box 54
		bodyModel[33].setRotationPoint(21.5F, -69.5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[34].setRotationPoint(22.5F, -71.5F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 1F, -1.5F, -1F, 1F, -1.5F, -1F, -1F, 1F, -1F, -1F); // Box 56
		bodyModel[35].setRotationPoint(22.5F, -70.5F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 57
		bodyModel[36].setRotationPoint(27.5F, -69.5F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[37].setRotationPoint(27.5F, -71.5F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, -1F, -1F); // Box 59
		bodyModel[38].setRotationPoint(27.5F, -70.5F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 63
		bodyModel[39].setRotationPoint(40.5F, -69.5F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[40].setRotationPoint(40.5F, -71.5F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, -1F, -1F); // Box 65
		bodyModel[41].setRotationPoint(40.5F, -70.5F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 65
		bodyModel[42].setRotationPoint(3.5F, -69.5F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, -1F, -0.5F, 1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, -1F, -1F); // Box 66
		bodyModel[43].setRotationPoint(3.5F, -70.5F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[44].setRotationPoint(3.5F, -71.5F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 32, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 68
		bodyModel[45].setRotationPoint(4F, -59F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 3F, -1F, 0F, 0F, -1.55F, 0F, 0F, 1.55F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, 0F, 1.15F, 0F, 0F, 0.05F); // Box 69
		bodyModel[46].setRotationPoint(36F, -56F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[47].setRotationPoint(40.5F, -71.5F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[48].setRotationPoint(40.5F, -71.5F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 7F, 0F, -0.5F, 7F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[49].setRotationPoint(48F, -71.5F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, -1.55F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 1.55F, 0F, 0F, -1.15F, 0F, 0F, -2.5F, 0F, 0F, 2.55F, 0F, 0F, 1.15F); // Box 73
		bodyModel[50].setRotationPoint(56F, -56F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 75
		bodyModel[51].setRotationPoint(68F, -61F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.5F, -1.2F, 1.5F, 0F, -1F, 1F, 0F, 2.5F, 0F, -0.5F, 4F, 0F, -0.5F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -4F, 0F); // Box 76
		bodyModel[52].setRotationPoint(68F, -58F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, -0.8F, 0.1F, 0.5F, 2.5F, -5F, 0.5F, 2.5F, 5F, 0.5F, -0.8F, 0F, 0F, 0F, 0F, 0.5F, -0.8F, -1.5F, 0.4F, -0.8F, 1.5F, 0F, 0F, -0.2F); // Box 77
		bodyModel[53].setRotationPoint(59F, -57F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.8F, -0.5F, 0F, 2.8F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 78
		bodyModel[54].setRotationPoint(55.5F, -65.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.8F, -2F, -0.5F, 0.5F, -2F, -0.5F, -0.5F, 1F, 0F, -0.2F, 1F, 0F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -1F, -1F, 0F, -1F, -1F); // Box 79
		bodyModel[55].setRotationPoint(55.5F, -66.5F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 73, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[56].setRotationPoint(-38F, -32F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 73, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[57].setRotationPoint(-38F, -47F, 11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 73, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 85
		bodyModel[58].setRotationPoint(-38F, -37F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 73, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 86
		bodyModel[59].setRotationPoint(-38F, -33F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 31, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[60].setRotationPoint(-38F, -53F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 42, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[61].setRotationPoint(-7F, -53F, 11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 37, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 92
		bodyModel[62].setRotationPoint(35F, -32F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 37, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0F, -2F); // Box 93
		bodyModel[63].setRotationPoint(35F, -37F, 11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 37, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -3F, 3F, 0F, -2F, -4F, 0F, 0F, -2F); // Box 94
		bodyModel[64].setRotationPoint(35F, -33F, 9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 37, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 95
		bodyModel[65].setRotationPoint(35F, -47F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 37, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 96
		bodyModel[66].setRotationPoint(35F, -53F, 11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 23, 6, 1, 0F,0F, -3F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 100
		bodyModel[67].setRotationPoint(-61F, -53F, 11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 23, 10, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F); // Box 101
		bodyModel[68].setRotationPoint(-61F, -47F, 11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[69].setRotationPoint(-7F, -58F, 10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 32, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[70].setRotationPoint(3F, -54F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F); // Box 124
		bodyModel[71].setRotationPoint(35F, -54F, 10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.35F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F); // Box 125
		bodyModel[72].setRotationPoint(56F, -54F, 8.85F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,-1F, -1F, 3F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 126
		bodyModel[73].setRotationPoint(-7F, -63F, 9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[74].setRotationPoint(3F, -71.5F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, -1F, 1F); // Box 128
		bodyModel[75].setRotationPoint(3F, -70.5F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F); // Box 129
		bodyModel[76].setRotationPoint(3F, -69.5F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F); // Box 130
		bodyModel[77].setRotationPoint(8.5F, -69.5F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[78].setRotationPoint(8.5F, -71.5F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, -1F, 1F); // Box 132
		bodyModel[79].setRotationPoint(8.5F, -70.5F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F); // Box 133
		bodyModel[80].setRotationPoint(14F, -69.5F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[81].setRotationPoint(14F, -71.5F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, -1F, 1F); // Box 135
		bodyModel[82].setRotationPoint(14F, -70.5F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F); // Box 139
		bodyModel[83].setRotationPoint(27.5F, -69.5F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[84].setRotationPoint(27.5F, -71.5F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, -1F, 1F); // Box 141
		bodyModel[85].setRotationPoint(27.5F, -70.5F, 5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 14, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F); // Box 145
		bodyModel[86].setRotationPoint(40.5F, -69.5F, 6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[87].setRotationPoint(40.5F, -71.5F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, -1F, 1F); // Box 147
		bodyModel[88].setRotationPoint(40.5F, -70.5F, 5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 3F, 0F, 0F, 3F); // Box 148
		bodyModel[89].setRotationPoint(3.5F, -69.5F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, -1F, 1F); // Box 149
		bodyModel[90].setRotationPoint(3.5F, -70.5F, 5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[91].setRotationPoint(3.5F, -71.5F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 32, 5, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 151
		bodyModel[92].setRotationPoint(4F, -59F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[93].setRotationPoint(40.5F, -71.5F, 3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[94].setRotationPoint(40.5F, -71.5F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 7F, 0F, -0.5F, 7F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[95].setRotationPoint(48F, -71.5F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 16, 2, 1, 0F,0F, 0F, 1.55F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, -1.55F, 0F, 0F, 1.15F, 0F, 0F, 2.55F, 0F, 0F, -2.5F, 0F, 0F, -1.15F); // Box 156
		bodyModel[96].setRotationPoint(56F, -56F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F); // Box 157
		bodyModel[97].setRotationPoint(68F, -61F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.5F, 4F, 0F, 0F, 2.5F, 0F, 0F, -1F, 1F, -0.5F, -1.2F, 1.5F, -0.5F, -4F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, 0.2F, 0.5F); // Box 158
		bodyModel[98].setRotationPoint(68F, -58F, 1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0.5F, -0.8F, 0F, 0.5F, 2.5F, 5F, 0.5F, 2.5F, -5F, 0.5F, -0.8F, 0.1F, 0F, 0F, -0.2F, 0.4F, -0.8F, 1.5F, 0.5F, -0.8F, -1.5F, 0F, 0F, 0F); // Box 159
		bodyModel[99].setRotationPoint(59F, -57F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0.5F, -2F, 0F, 0.8F, -2F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 1F, 0F, -1F, 1F); // Box 161
		bodyModel[100].setRotationPoint(55.5F, -66.5F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 17, 8, 4, 0F,1F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 20F, 1F, 0F, 1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 20F, -2F, 0F); // Box 170
		bodyModel[101].setRotationPoint(139F, -54F, -4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[102].setRotationPoint(167F, -53F, -2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 15, 3, 62, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[103].setRotationPoint(154F, -59.5F, 3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 3, 62, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 202
		bodyModel[104].setRotationPoint(150F, -59.5F, 3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 62, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[105].setRotationPoint(149F, -58.75F, 3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 15, 3, 62, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 205
		bodyModel[106].setRotationPoint(154F, -59.5F, -65F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 3, 62, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 206
		bodyModel[107].setRotationPoint(150F, -59.5F, -65F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 62, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[108].setRotationPoint(149F, -58.75F, -65F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[109].setRotationPoint(60.5F, -64.5F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, -3F, 1F, -0.5F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, 1F, -0.5F, 3F, -1F, 0F, 0F, 0F); // Box 212
		bodyModel[110].setRotationPoint(60.5F, -64.5F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, -1.9F, -1F, -0.5F, -1.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 1.4F, -1.4F, -0.5F, 1F, 1F, 0F, 0F, 0F); // Box 213
		bodyModel[111].setRotationPoint(64F, -61.5F, -5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[112].setRotationPoint(60.5F, -64.5F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, -3F, -1F, -0.5F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 3F, -1F, -0.5F, 3F, 1F, 0F, 0F, 0F); // Box 215
		bodyModel[113].setRotationPoint(60.5F, -64.5F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, -1.1F, 1F, -0.5F, -1.9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 1F, -1.8F, 1.4F, -1.4F, 0F, 0F, 0F); // Box 216
		bodyModel[114].setRotationPoint(64F, -61.5F, 4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 2.8F, 0F, 0F, 2.8F); // Box 217
		bodyModel[115].setRotationPoint(55.5F, -65.5F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 23, 4, 1, 0F,0F, 6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 2F, 0F, -5F, -6F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -5F, 6F); // Box 211
		bodyModel[116].setRotationPoint(-61F, -37F, -12F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 4F, 0F, -5F, -7F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -6F, 6F); // Box 212
		bodyModel[117].setRotationPoint(-61F, -33F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F,0F, 5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F); // Box 213
		bodyModel[118].setRotationPoint(-61F, -32F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 23, 4, 1, 0F,0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, -5F, 6F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -5F, -6F); // Box 214
		bodyModel[119].setRotationPoint(-61F, -37F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 23, 2, 1, 0F,0F, 5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -4F, 0F, -6F, 6F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, -5F, -7F); // Box 215
		bodyModel[120].setRotationPoint(-61F, -33F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 23, 1, 8, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -5F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -5F, -5F); // Box 216
		bodyModel[121].setRotationPoint(-61F, -32F, 0F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 219
		bodyModel[122].setRotationPoint(-7F, -32F, -39.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 16, 24, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 222
		bodyModel[123].setRotationPoint(-7F, -32F, -40.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 16, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[124].setRotationPoint(-7F, -32F, -37.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,-7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[125].setRotationPoint(-19F, -11F, -43F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[126].setRotationPoint(4F, -5F, -43F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F); // Box 226
		bodyModel[127].setRotationPoint(-19F, -5F, -43F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,-4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[128].setRotationPoint(-19F, -11F, -40F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 15, 6, 3, 0F,0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[129].setRotationPoint(4F, -11F, -40F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 15, 6, 2, 0F,0F, -1F, 1F, -3F, -4F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[130].setRotationPoint(4F, -11F, -42F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 15, 6, 2, 0F,0F, 0F, 0F, -5F, -2F, 0F, -3F, -4F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F); // Box 236
		bodyModel[131].setRotationPoint(4F, -11F, -37F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F); // Box 237
		bodyModel[132].setRotationPoint(-19F, -5F, -40F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[133].setRotationPoint(-19F, -5F, -37F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[134].setRotationPoint(4F, -5F, -40F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, -1F, 0F, 0F, 0F); // Box 242
		bodyModel[135].setRotationPoint(4F, -5F, -37F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 260
		bodyModel[136].setRotationPoint(-67F, -54F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -1F, -1F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 261
		bodyModel[137].setRotationPoint(-67F, -52F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -5F, -2F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, -5F, 2F, 0F, 3F, -0.75F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 3F, 0.75F); // Box 262
		bodyModel[138].setRotationPoint(-67F, -56F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -3F, -1.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 1.75F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 263
		bodyModel[139].setRotationPoint(-67F, -51F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -2F, 3F); // Box 265
		bodyModel[140].setRotationPoint(-67F, -43F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 266
		bodyModel[141].setRotationPoint(-67F, -47F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -0.5F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -4F, 2F); // Box 268
		bodyModel[142].setRotationPoint(-67F, -40F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -1F, 0F, 0F, -3F, 1F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, -4F, -3F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -5F, 2F); // Box 269
		bodyModel[143].setRotationPoint(-67F, -39F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0.75F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 270
		bodyModel[144].setRotationPoint(-67F, -54F, 0F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, -2F); // Box 271
		bodyModel[145].setRotationPoint(-67F, -52F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -5F, 2F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, -5F, -2F, 0F, 3F, 1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 3F, -1F); // Box 272
		bodyModel[146].setRotationPoint(-67F, -56F, 8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, -3F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 273
		bodyModel[147].setRotationPoint(-67F, -51F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1.5F, -3F); // Box 274
		bodyModel[148].setRotationPoint(-67F, -43F, 7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F); // Box 275
		bodyModel[149].setRotationPoint(-67F, -47F, 7.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -0.5F, 0F, 0F, -4F, 2F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -3F, -3F); // Box 276
		bodyModel[150].setRotationPoint(-67F, -40F, 4F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, -1F, 0F, -2F, -2F, 0F, -3F, 1F, 0F, -1F, 0F, 0F, -5F, 2F, 0F, -3F, 1F, 0F, -2F, -2F, 0F, -4F, -3F); // Box 277
		bodyModel[151].setRotationPoint(-67F, -39F, 1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 278
		bodyModel[152].setRotationPoint(-67F, -52F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 279
		bodyModel[153].setRotationPoint(-67F, -49F, -8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[154].setRotationPoint(-67F, -42F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[155].setRotationPoint(-67F, -52F, 0F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[156].setRotationPoint(-67F, -49F, 6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 283
		bodyModel[157].setRotationPoint(-67F, -42F, 0F);

		bodyModel[158].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 284
		bodyModel[158].setRotationPoint(-18F, -35F, -53F);

		bodyModel[159].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 285
		bodyModel[159].setRotationPoint(-18F, -35F, 52F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[160].setRotationPoint(-79F, -49F, -2.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[161].setRotationPoint(-79F, -54F, -2.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F); // Box 294
		bodyModel[162].setRotationPoint(-79F, -44F, -2.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[163].setRotationPoint(-79F, -49F, -7.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F); // Box 296
		bodyModel[164].setRotationPoint(-79F, -49F, 2.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 297
		bodyModel[165].setRotationPoint(-74F, -54F, 2.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, -3F, -3F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[166].setRotationPoint(-74F, -54F, -7.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 299
		bodyModel[167].setRotationPoint(-74F, -44F, -7.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, -3F); // Box 300
		bodyModel[168].setRotationPoint(-74F, -44F, 2.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[169].setRotationPoint(-79F, -52F, -5.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 302
		bodyModel[170].setRotationPoint(-79F, -52F, 2.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 303
		bodyModel[171].setRotationPoint(-79F, -44F, 2.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 304
		bodyModel[172].setRotationPoint(-79F, -44F, -5.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 305
		bodyModel[173].setRotationPoint(-82F, -49F, -2.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 3F, 0F, 0F, -2.5F, 0F, 0F, -4.5F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 310
		bodyModel[174].setRotationPoint(-54F, -37F, -10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 1.5F); // Box 311
		bodyModel[175].setRotationPoint(-54F, -29F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, -2F, -3F, 1.5F, -3F, -3.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -2F, 2F, 2.5F, -3F, 3.5F, -2F, 0F, 0.5F, 0F); // Box 312
		bodyModel[176].setRotationPoint(-54F, -28F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 31, 5, 1, 0F,0F, -1.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 319
		bodyModel[177].setRotationPoint(-38F, -58F, 9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, -1F, 0F, 1F, 4F, 0F, 0F, -1F, 3F, 0F, -2.75F, 2F, 0F, 0.5F, 0F, 1F, -4F, 0F, 0F, 0F, 2F, 0F, 1.5F, 0F); // Box 320
		bodyModel[178].setRotationPoint(-38F, -59F, 6F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 31, 1, 6, 0F,0F, -0.5F, 0F, 0F, 5F, 0F, 1F, 4F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 1F, -4F, 0F, 0F, 0.5F, 0F); // Box 321
		bodyModel[179].setRotationPoint(-38F, -59F, 0F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, 1F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[180].setRotationPoint(-61F, -55F, 0F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 23, 1, 2, 0F,0F, 1F, 0F, 0F, 4F, 0F, 0F, 2.25F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, -1F, 0F, 0F, -1F); // Box 323
		bodyModel[181].setRotationPoint(-61F, -54F, 6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,0F, -5F, 2F, 0F, -1.5F, 2F, 0F, -1.75F, -1F, 0F, -5F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 324
		bodyModel[182].setRotationPoint(-61F, -58F, 9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[183].setRotationPoint(-48F, -59F, -6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[184].setRotationPoint(-48F, -59F, -8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[185].setRotationPoint(-48F, -59F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 3F, -1F); // Box 328
		bodyModel[186].setRotationPoint(-48F, -59F, 6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, -3F, 1.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[187].setRotationPoint(-54F, -27.5F, -6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 18, 8, 1, 0F,0F, 2F, 0F, 0F, -4.5F, 0F, 0F, -2.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 330
		bodyModel[188].setRotationPoint(-54F, -37F, 9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, -3F, -3.5F, -1.5F, -2F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, 3.5F, -2F, -2F, 2F, 2.5F, 0F, 0F, 0.5F); // Box 331
		bodyModel[189].setRotationPoint(-54F, -28F, 6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 2F, 0F, 0F, 0F); // Box 332
		bodyModel[190].setRotationPoint(-54F, -27.5F, 0F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, -2F); // Box 333
		bodyModel[191].setRotationPoint(-54F, -29F, 8.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[192].setRotationPoint(-39F, -31F, -5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[193].setRotationPoint(-39F, -31F, -1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 10, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 336
		bodyModel[194].setRotationPoint(-39F, -31F, 1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, 0F, 1F); // Box 337
		bodyModel[195].setRotationPoint(-29F, -31F, -5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, 0F, -1F); // Box 338
		bodyModel[196].setRotationPoint(-29F, -31F, 4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F); // Box 339
		bodyModel[197].setRotationPoint(-29F, -28F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 340
		bodyModel[198].setRotationPoint(-53F, -28.5F, -8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
		bodyModel[199].setRotationPoint(-53F, -29.5F, -9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 342
		bodyModel[200].setRotationPoint(-53F, -30.5F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 343
		bodyModel[201].setRotationPoint(-53F, -31.5F, -9F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 344
		bodyModel[202].setRotationPoint(-53F, -32.5F, -9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 345
		bodyModel[203].setRotationPoint(-53F, -33.5F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 346
		bodyModel[204].setRotationPoint(-53F, -34.5F, -9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F); // Box 347
		bodyModel[205].setRotationPoint(-53F, -28.5F, 0F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 348
		bodyModel[206].setRotationPoint(-53F, -29.5F, 0F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 349
		bodyModel[207].setRotationPoint(-53F, -30.5F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 350
		bodyModel[208].setRotationPoint(-53F, -31.5F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[209].setRotationPoint(-53F, -32.5F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 352
		bodyModel[210].setRotationPoint(-53F, -33.5F, 0F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 353
		bodyModel[211].setRotationPoint(-53F, -34.5F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,-4F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 354
		bodyModel[212].setRotationPoint(-19F, -11F, -37F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -3F, -5.5F, 0F, -3F, -5.5F, 0F, 3F, 5F, 0F, 3F); // Box 358
		bodyModel[213].setRotationPoint(21.5F, -69.5F, 6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[214].setRotationPoint(22.5F, -71.5F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, 0F, 1F, -1F, 1F, -1F, -1F, -1.5F, -1F, -1F, -1.5F, -1F, 1F, 1F, -1F, 1F); // Box 360
		bodyModel[215].setRotationPoint(22.5F, -70.5F, 5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 362
		bodyModel[216].setRotationPoint(-1F, -71.5F, 3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, 0F, 0F, -0.5F); // Box 363
		bodyModel[217].setRotationPoint(-7F, -63.5F, 3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F); // Box 364
		bodyModel[218].setRotationPoint(-3F, -69.5F, 3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[219].setRotationPoint(-1F, -71.5F, -4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 6F, -0.5F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -6F, -0.5F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[220].setRotationPoint(-7F, -63.5F, -4F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[221].setRotationPoint(-3F, -69.5F, -4F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[222].setRotationPoint(-13F, -32F, -7F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[223].setRotationPoint(-13F, -32F, 6F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[224].setRotationPoint(-2F, -29F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 32, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[225].setRotationPoint(0F, -26F, -0.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[226].setRotationPoint(6F, -26F, 1.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[227].setRotationPoint(6F, -28F, -0.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[228].setRotationPoint(6F, -24F, -0.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[229].setRotationPoint(6F, -26F, -2.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[230].setRotationPoint(6F, -28F, -2.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[231].setRotationPoint(6F, -28F, 1.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[232].setRotationPoint(6F, -24F, -2.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 16, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 383
		bodyModel[233].setRotationPoint(6F, -24F, 1.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,-3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[234].setRotationPoint(-2F, -28F, -0.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,-3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[235].setRotationPoint(-2F, -26F, -2.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F); // Box 388
		bodyModel[236].setRotationPoint(-2F, -24F, -0.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F); // Box 389
		bodyModel[237].setRotationPoint(-2F, -26F, 1.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1.15F, -1.15F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[238].setRotationPoint(1F, -28F, -2.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, -2F, 0F, -1.15F, -1.15F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[239].setRotationPoint(-2F, -28F, -2.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.15F, -1.15F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 393
		bodyModel[240].setRotationPoint(-2F, -28F, 1.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -1.15F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 394
		bodyModel[241].setRotationPoint(1F, -28F, 1.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.15F, -1.15F, 0F, -2F, -2F); // Box 395
		bodyModel[242].setRotationPoint(-2F, -24F, 1.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -1.15F, -1.15F); // Box 396
		bodyModel[243].setRotationPoint(1F, -24F, 1.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1.15F, -1.15F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 397
		bodyModel[244].setRotationPoint(-2F, -24F, -2.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, -1.15F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 398
		bodyModel[245].setRotationPoint(1F, -24F, -2.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F); // Box 399
		bodyModel[246].setRotationPoint(-3F, -26F, -0.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[247].setRotationPoint(22F, -26F, -2.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1.15F, -1.15F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[248].setRotationPoint(27F, -28F, -2.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -1.15F, -1.15F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[249].setRotationPoint(22F, -28F, -2.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[250].setRotationPoint(22F, -28F, -0.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -1.15F, -1.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 406
		bodyModel[251].setRotationPoint(27F, -28F, 1.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.15F, -1.15F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 407
		bodyModel[252].setRotationPoint(22F, -28F, 1.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, 0F); // Box 408
		bodyModel[253].setRotationPoint(22F, -26F, 1.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -1.15F, -1.15F); // Box 409
		bodyModel[254].setRotationPoint(27F, -24F, 1.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.15F, -1.15F, 0F, -0.75F, -0.75F); // Box 410
		bodyModel[255].setRotationPoint(22F, -24F, 1.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[256].setRotationPoint(22F, -24F, -0.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -1.15F, -1.15F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[257].setRotationPoint(22F, -24F, -2.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.15F, -1.15F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -0.5F, 0F); // Box 413
		bodyModel[258].setRotationPoint(27F, -24F, -2.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 414
		bodyModel[259].setRotationPoint(30F, -26F, -0.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 415
		bodyModel[260].setRotationPoint(29F, -27F, -1.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.75F, 0F, 1F, -1.75F); // Box 416
		bodyModel[261].setRotationPoint(29F, -27F, 1.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 417
		bodyModel[262].setRotationPoint(29F, -24F, 1.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, 1F, 1F, 0F, 1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F); // Box 418
		bodyModel[263].setRotationPoint(29F, -24F, -1.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[264].setRotationPoint(8F, -26F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[265].setRotationPoint(8F, -26F, 2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[266].setRotationPoint(-23F, -49F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[267].setRotationPoint(-23F, -40F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[268].setRotationPoint(-23F, -57F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[269].setRotationPoint(-23F, -60F, -9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[270].setRotationPoint(-23F, -49F, 0F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 388
		bodyModel[271].setRotationPoint(-23F, -40F, 0F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[272].setRotationPoint(-23F, -57F, 0F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[273].setRotationPoint(-23F, -60F, 0F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 3F, 1F, 0F, 0F, 1.55F, 0F, 0F, -1.55F, 0F, 3F, -1F, 0F, 0F, 0.05F, 0F, 0F, 1.15F, 0F, 0F, -1.15F, 0F, 0F, 0F); // Box 391
		bodyModel[274].setRotationPoint(36F, -56F, 10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[275].setRotationPoint(-9F, -58F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,0F, -1F, -4F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[276].setRotationPoint(-10F, -63F, -9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 8, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[277].setRotationPoint(-9F, -58F, 0F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[278].setRotationPoint(-10F, -63F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[279].setRotationPoint(-9F, -50F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[280].setRotationPoint(-9F, -50F, 7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[281].setRotationPoint(-8.8F, -58F, -5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[282].setRotationPoint(76.2F, -43F, -0.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[283].setRotationPoint(74.2F, -46F, -0.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[284].setRotationPoint(0.2F, -47F, -3.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[285].setRotationPoint(0.2F, -51F, -3.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 406
		bodyModel[286].setRotationPoint(0.2F, -51F, 0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 407
		bodyModel[287].setRotationPoint(0.2F, -47F, 0.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[288].setRotationPoint(0.2F, -47F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[289].setRotationPoint(0.2F, -49F, -2.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[290].setRotationPoint(0.2F, -51F, -0.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[291].setRotationPoint(0.2F, -49F, 1.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 71, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[292].setRotationPoint(-38F, -37F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 71, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 413
		bodyModel[293].setRotationPoint(-38F, -37F, 0F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[294].setRotationPoint(71F, -49F, -9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[295].setRotationPoint(71F, -40F, -9F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[296].setRotationPoint(71F, -57F, -9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, -0.5F, -5F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[297].setRotationPoint(71F, -61F, -6F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[298].setRotationPoint(71F, -49F, 0F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -3F, -1F); // Box 419
		bodyModel[299].setRotationPoint(71F, -40F, 0F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[300].setRotationPoint(71F, -57F, 0F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[301].setRotationPoint(71F, -61F, 0F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[302].setRotationPoint(7F, -41F, -6F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 1F, -1F, -1F); // Box 423
		bodyModel[303].setRotationPoint(20F, -49F, -7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 3F); // Box 424
		bodyModel[304].setRotationPoint(22F, -57F, -4F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F); // Box 425
		bodyModel[305].setRotationPoint(14F, -45F, -7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 426
		bodyModel[306].setRotationPoint(9F, -45F, -7F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 427
		bodyModel[307].setRotationPoint(7F, -43F, -7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, 0.45F, 0F, 0F, 0F); // Box 428
		bodyModel[308].setRotationPoint(14F, -49F, -7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 430
		bodyModel[309].setRotationPoint(14F, -45F, 6F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 431
		bodyModel[310].setRotationPoint(9F, -45F, 6F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 432
		bodyModel[311].setRotationPoint(7F, -43F, 6F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F); // Box 433
		bodyModel[312].setRotationPoint(14F, -49F, 6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[313].setRotationPoint(7.5F, -40F, -5.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[314].setRotationPoint(13.5F, -40F, -5.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[315].setRotationPoint(17.5F, -40F, -5.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[316].setRotationPoint(7.5F, -40F, 4.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[317].setRotationPoint(13.5F, -40F, 4.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[318].setRotationPoint(17.5F, -40F, 4.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 22, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 440
		bodyModel[319].setRotationPoint(22.5F, -59F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 443
		bodyModel[320].setRotationPoint(22.5F, -67F, -6F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 18, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[321].setRotationPoint(23.5F, -55F, -9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 4, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[322].setRotationPoint(26.5F, -53F, -5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[323].setRotationPoint(26.5F, -45F, -5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[324].setRotationPoint(49.2F, -39F, -3F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[325].setRotationPoint(47.2F, -39F, -3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[326].setRotationPoint(44.2F, -40F, -4F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[327].setRotationPoint(49.2F, -39F, 2F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[328].setRotationPoint(47.2F, -39F, 2F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 10, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[329].setRotationPoint(61.2F, -50F, -7F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[330].setRotationPoint(63.2F, -58F, -1.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1681, 1, textureX, textureY); // Box 22
		tailModel[1] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 23
		tailModel[2] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 24
		tailModel[3] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 25
		tailModel[4] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 26
		tailModel[5] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 27
		tailModel[6] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 28
		tailModel[7] = new ModelRendererTurbo(this, 1089, 9, textureX, textureY); // Box 29
		tailModel[8] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 79
		tailModel[9] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 81
		tailModel[10] = new ModelRendererTurbo(this, 1049, 49, textureX, textureY); // Box 102
		tailModel[11] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Box 103
		tailModel[12] = new ModelRendererTurbo(this, 1369, 49, textureX, textureY); // Box 104
		tailModel[13] = new ModelRendererTurbo(this, 1593, 49, textureX, textureY); // Box 105
		tailModel[14] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 106
		tailModel[15] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 107
		tailModel[16] = new ModelRendererTurbo(this, 1217, 25, textureX, textureY); // Box 108
		tailModel[17] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 109
		tailModel[18] = new ModelRendererTurbo(this, 1833, 25, textureX, textureY); // Box 162
		tailModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 163
		tailModel[20] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 164
		tailModel[21] = new ModelRendererTurbo(this, 1441, 25, textureX, textureY); // Box 165
		tailModel[22] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 166
		tailModel[23] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 167
		tailModel[24] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 168
		tailModel[25] = new ModelRendererTurbo(this, 1145, 25, textureX, textureY); // Box 171
		tailModel[26] = new ModelRendererTurbo(this, 1777, 25, textureX, textureY); // Box 172
		tailModel[27] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 174
		tailModel[28] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 175
		tailModel[29] = new ModelRendererTurbo(this, 1089, 33, textureX, textureY); // Box 176
		tailModel[30] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 177
		tailModel[31] = new ModelRendererTurbo(this, 1833, 33, textureX, textureY); // Box 178
		tailModel[32] = new ModelRendererTurbo(this, 1977, 33, textureX, textureY); // Box 179
		tailModel[33] = new ModelRendererTurbo(this, 1241, 33, textureX, textureY); // Box 180
		tailModel[34] = new ModelRendererTurbo(this, 1121, 33, textureX, textureY); // Box 181
		tailModel[35] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 182
		tailModel[36] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 183
		tailModel[37] = new ModelRendererTurbo(this, 1625, 33, textureX, textureY); // Box 184
		tailModel[38] = new ModelRendererTurbo(this, 1873, 33, textureX, textureY); // Box 185
		tailModel[39] = new ModelRendererTurbo(this, 2025, 33, textureX, textureY); // Box 186
		tailModel[40] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 187
		tailModel[41] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 188
		tailModel[42] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 189
		tailModel[43] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 190
		tailModel[44] = new ModelRendererTurbo(this, 1153, 33, textureX, textureY); // Box 191
		tailModel[45] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 192
		tailModel[46] = new ModelRendererTurbo(this, 1217, 33, textureX, textureY); // Box 194
		tailModel[47] = new ModelRendererTurbo(this, 1529, 33, textureX, textureY); // Box 195
		tailModel[48] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 196
		tailModel[49] = new ModelRendererTurbo(this, 1649, 33, textureX, textureY); // Box 198
		tailModel[50] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 286
		tailModel[51] = new ModelRendererTurbo(this, 1593, 25, textureX, textureY); // Box 287
		tailModel[52] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 288
		tailModel[53] = new ModelRendererTurbo(this, 1873, 17, textureX, textureY); // Box 289
		tailModel[54] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 290
		tailModel[55] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 291
		tailModel[56] = new ModelRendererTurbo(this, 1873, 65, textureX, textureY); // Box 292
		tailModel[57] = new ModelRendererTurbo(this, 2017, 65, textureX, textureY); // Box 293
		tailModel[58] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 361

		tailModel[0].addShapeBox(0F, 0F, 0F, 75, 1, 6, 0F,0F, 0F, 0F, 0F, 5F, -4F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 2F, 0F); // Box 22
		tailModel[0].setRotationPoint(72F, -34F, -6F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 75, 2, 1, 0F,0F, 3F, -1F, 0F, 7F, -6F, 0F, 7F, 6F, 0F, 3F, 1F, 0F, -2F, -4F, 0F, -7F, -8F, 0F, -8F, 7F, 0F, -3F, 3F); // Box 23
		tailModel[1].setRotationPoint(72F, -33F, -10F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 75, 4, 1, 0F,0F, 0F, -3F, 0F, 3F, -8F, 0F, 3F, 8F, 0F, 0F, 3F, 0F, -3F, -3F, 0F, -7F, -8F, 0F, -7F, 8F, 0F, -3F, 3F); // Box 24
		tailModel[2].setRotationPoint(72F, -37F, -12F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 75, 10, 1, 0F,0F, 0F, -2F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -3F, -8F, 0F, -3F, 8F, 0F, 0F, 3F); // Box 25
		tailModel[3].setRotationPoint(72F, -47F, -12F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 75, 6, 1, 0F,0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -7.5F, 0F, 0F, 7.5F, 0F, 0F, 2F); // Box 26
		tailModel[4].setRotationPoint(72F, -53F, -12F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 44, 4, 1, 0F,0F, 0F, -4F, 0F, -1.5F, -9F, 0F, -2.5F, 8F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, -4.9F, 0F, 0F, 4.9F, 0F, 0F, 2F); // Box 27
		tailModel[5].setRotationPoint(72F, -57F, -11F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 44, 4, 1, 0F,0F, -0.5F, 0F, 0F, -5F, -1F, 0F, -6F, 0F, 0F, -1.5F, -1F, 0F, 0F, 6F, 0F, 1.5F, 1F, 0F, 2.5F, -2F, 0F, 0F, -6F); // Box 28
		tailModel[6].setRotationPoint(72F, -61F, -1F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, -0.5F, 0F, 0F, -5F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 5F, -1F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 29
		tailModel[7].setRotationPoint(72F, -61F, -1F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, -1F, 1.1F, 0F, -1F, -1F, 0F, 1F, 3F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 3F, 0F, -1.5F, 2F); // Box 79
		tailModel[8].setRotationPoint(116F, -54F, -5F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 31, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 81
		tailModel[9].setRotationPoint(116F, -56F, -2F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 75, 1, 6, 0F,0F, -2F, 0F, 0F, 4F, 0F, 0F, 5F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, 0F, 0F); // Box 102
		tailModel[10].setRotationPoint(72F, -34F, 0F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 75, 2, 1, 0F,0F, 3F, 1F, 0F, 7F, 6F, 0F, 7F, -6F, 0F, 3F, -1F, 0F, -3F, 3F, 0F, -8F, 7F, 0F, -7F, -8F, 0F, -2F, -4F); // Box 103
		tailModel[11].setRotationPoint(72F, -33F, 9F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 75, 4, 1, 0F,0F, 0F, 3F, 0F, 3F, 8F, 0F, 3F, -8F, 0F, 0F, -3F, 0F, -3F, 3F, 0F, -7F, 8F, 0F, -7F, -8F, 0F, -3F, -3F); // Box 104
		tailModel[12].setRotationPoint(72F, -37F, 11F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 75, 10, 1, 0F,0F, 0F, 2F, 0F, 0F, 7.5F, 0F, 0F, -7.5F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, -3F, 8F, 0F, -3F, -8F, 0F, 0F, -3F); // Box 105
		tailModel[13].setRotationPoint(72F, -47F, 11F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 75, 6, 1, 0F,0F, 0F, 3F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 7.5F, 0F, 0F, -7.5F, 0F, 0F, -2F); // Box 106
		tailModel[14].setRotationPoint(72F, -53F, 11F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 44, 4, 1, 0F,0F, 0F, 4F, 0F, -2.5F, 8F, 0F, -1.5F, -9F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 4.9F, 0F, 0F, -4.9F, 0F, 0F, -2F); // Box 107
		tailModel[15].setRotationPoint(72F, -57F, 10F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 44, 4, 1, 0F,0F, -1.5F, -1F, 0F, -6F, 0F, 0F, -5F, -1F, 0F, -0.5F, 0F, 0F, 0F, -6F, 0F, 2.5F, -2F, 0F, 1.5F, 1F, 0F, 0F, 6F); // Box 108
		tailModel[16].setRotationPoint(72F, -61F, 0F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -1F, 0F, 0.5F, 0F); // Box 109
		tailModel[17].setRotationPoint(72F, -61F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, 1.5F, 2F, 0F, 1F, 3F, 0F, -1F, -1F, 0F, -1F, 1.1F, 0F, -1.5F, 2F, 0F, -1F, 3F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 162
		tailModel[18].setRotationPoint(116F, -54F, 4F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 31, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0.5F, 0F); // Box 163
		tailModel[19].setRotationPoint(116F, -56F, 0F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 16, 35, 2, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 18F, 0F, 0F); // Box 164
		tailModel[20].setRotationPoint(157F, -88F, -2F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,-10F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 20F, 0F, 0F); // Box 165
		tailModel[21].setRotationPoint(139F, -60F, -4F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-11F, 0F, -2.25F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		tailModel[22].setRotationPoint(141F, -63F, -3F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 11, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		tailModel[23].setRotationPoint(156F, -60F, -3F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		tailModel[24].setRotationPoint(156F, -63F, -3F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 171
		tailModel[25].setRotationPoint(147F, -53F, -4F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 172
		tailModel[26].setRotationPoint(147F, -47F, -4F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 174
		tailModel[27].setRotationPoint(156F, -47F, -3F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, -1F, 1.5F, 0F, -1F, 0.5F); // Box 175
		tailModel[28].setRotationPoint(147F, -40F, -3.5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1.5F, 0.5F, 0F, -1F, 0F); // Box 176
		tailModel[29].setRotationPoint(156F, -40F, -2F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F); // Box 177
		tailModel[30].setRotationPoint(167F, -40F, -1.5F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 16, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 18F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F); // Box 178
		tailModel[31].setRotationPoint(157F, -88F, 0F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 17, 5, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, -1F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 1F, 0F); // Box 179
		tailModel[32].setRotationPoint(139F, -60F, 0F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -11F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 180
		tailModel[33].setRotationPoint(141F, -63F, 0F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 11, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 181
		tailModel[34].setRotationPoint(156F, -60F, 1F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 182
		tailModel[35].setRotationPoint(156F, -63F, 1F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 17, 8, 4, 0F,20F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 1F, 0F, 0F, 20F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, 0F, 0F); // Box 183
		tailModel[36].setRotationPoint(139F, -54F, 0F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0.7F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 184
		tailModel[37].setRotationPoint(147F, -53F, 3F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 185
		tailModel[38].setRotationPoint(147F, -47F, 3F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 7, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 186
		tailModel[39].setRotationPoint(167F, -53F, 0F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 187
		tailModel[40].setRotationPoint(156F, -47F, 2F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 1.5F, 0F, 0F, -2F, 0F, 0F, -1.5F); // Box 188
		tailModel[41].setRotationPoint(147F, -40F, 2.5F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.5F); // Box 189
		tailModel[42].setRotationPoint(156F, -40F, 1F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 190
		tailModel[43].setRotationPoint(167F, -40F, 0.5F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F); // Box 191
		tailModel[44].setRotationPoint(156F, -39F, -1F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 192
		tailModel[45].setRotationPoint(147F, -38F, -2F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -0.25F, 0F); // Box 194
		tailModel[46].setRotationPoint(167F, -39F, -1F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F); // Box 195
		tailModel[47].setRotationPoint(156F, -39F, 0F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F); // Box 196
		tailModel[48].setRotationPoint(147F, -38F, 0F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.25F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -0.5F, 0F); // Box 198
		tailModel[49].setRotationPoint(167F, -39F, 0F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 286
		tailModel[50].setRotationPoint(163F, -39F, -0.5F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 287
		tailModel[51].setRotationPoint(162F, -34F, -0.5F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F); // Box 288
		tailModel[52].setRotationPoint(163F, -32F, -0.5F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		tailModel[53].setRotationPoint(165F, -32F, -2.5F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 290
		tailModel[54].setRotationPoint(166F, -32F, -2.5F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 291
		tailModel[55].setRotationPoint(166F, -32F, 1.5F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		tailModel[56].setRotationPoint(167F, -31F, -1F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		tailModel[57].setRotationPoint(167F, -33F, -1F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 361
		tailModel[58].setRotationPoint(167F, -29F, -1F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1153, 9, textureX, textureY); // Box 27
		leftWingModel[1] = new ModelRendererTurbo(this, 1297, 9, textureX, textureY); // Box 28
		leftWingModel[2] = new ModelRendererTurbo(this, 1465, 9, textureX, textureY); // Box 29
		leftWingModel[3] = new ModelRendererTurbo(this, 1649, 9, textureX, textureY); // Box 31
		leftWingModel[4] = new ModelRendererTurbo(this, 1489, 9, textureX, textureY); // Box 32
		leftWingModel[5] = new ModelRendererTurbo(this, 1737, 9, textureX, textureY); // Box 33
		leftWingModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		leftWingModel[7] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 35
		leftWingModel[8] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 36
		leftWingModel[9] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 37
		leftWingModel[10] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 38
		leftWingModel[11] = new ModelRendererTurbo(this, 1833, 17, textureX, textureY); // Box 39
		leftWingModel[12] = new ModelRendererTurbo(this, 569, 65, textureX, textureY); // Box 243
		leftWingModel[13] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 244
		leftWingModel[14] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 245
		leftWingModel[15] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 246
		leftWingModel[16] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 247
		leftWingModel[17] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 248
		leftWingModel[18] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 249
		leftWingModel[19] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 465
		leftWingModel[20] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Box 466
		leftWingModel[21] = new ModelRendererTurbo(this, 1097, 161, textureX, textureY); // Box 467
		leftWingModel[22] = new ModelRendererTurbo(this, 1193, 105, textureX, textureY); // Box 468
		leftWingModel[23] = new ModelRendererTurbo(this, 1337, 105, textureX, textureY); // Box 469
		leftWingModel[24] = new ModelRendererTurbo(this, 1409, 105, textureX, textureY); // Box 470
		leftWingModel[25] = new ModelRendererTurbo(this, 1505, 105, textureX, textureY); // Box 471
		leftWingModel[26] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 472

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 5, 27, 0F,-6F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, -4F, -2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftWingModel[0].setRotationPoint(-15F, -42F, -38F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 56, 5, 26, 0F,0F, -5F, 0F, -24F, -10F, 0F, -19F, -4F, 1F, 0F, 0F, 0F, 0F, 5F, 0F, -8F, 8F, 0F, 3F, 2F, 3F, 0F, 0F, 0F); // Box 28
		leftWingModel[1].setRotationPoint(1F, -42F, -38F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 16, 5, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -4F, -3F, 0F, 0F, -1F, 0F, 0F, -5F, 2F, -3F, -8F, 1F); // Box 29
		leftWingModel[2].setRotationPoint(-15F, -32F, -38F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 49, 4, 27, 0F,0F, 0F, 0F, -1F, -3F, 0F, 10F, 3F, 2F, 0F, 5F, 0F, 0F, 0F, 0F, -28F, 0F, 0F, -24F, -5F, 2F, 0F, -4F, 2F); // Box 31
		leftWingModel[3].setRotationPoint(1F, -32F, -38F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 16, 5, 68, 0F,-10F, 2F, 0F, 0F, 3F, 0F, 0F, -5F, 0F, -6F, -7F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 32
		leftWingModel[4].setRotationPoint(-15F, -42F, -106F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 66, 0F,-7F, 6.5F, 0F, -1F, 7F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -4F, -9F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		leftWingModel[5].setRotationPoint(-11F, -45F, -172F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 46, 4, 68, 0F,0F, 0F, 0F, -27F, -2.8F, 0F, -14F, -13F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -12F, 1F, 0F, 2F, 12F, 0F, 0F, 9F, 0F); // Box 34
		leftWingModel[6].setRotationPoint(1F, -45F, -106F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 35, 2, 66, 0F,0F, 0F, 0F, -30F, -1F, 0F, -15F, -9.8F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 10F, 0F, -1F, 9F, 0F); // Box 35
		leftWingModel[7].setRotationPoint(0F, -52F, -172F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 16, 5, 68, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, -9F, 0F, 4F, -9F, 0F, -5F, -3F, 0F, -4F, -2F, 0F, -4F, 8F, 0F, 0F, 6F, 0F); // Box 36
		leftWingModel[8].setRotationPoint(-11F, -41F, -106F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 5, 66, 0F,0F, 0F, 0F, -4F, 0F, 0F, -3F, -9F, 0F, 4F, -9F, 0F, -5F, -4F, 0F, -4F, -4F, 0F, -3F, 7F, 0F, -1F, 6F, 0F); // Box 37
		leftWingModel[9].setRotationPoint(-7F, -50F, -172F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 34, 3, 68, 0F,0F, 0F, 0F, 0F, -1F, 0F, 14F, -12F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -13F, 10F, 0F, 0F, 10F, 0F); // Box 38
		leftWingModel[10].setRotationPoint(1F, -41F, -106F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 35, 1, 66, 0F,0F, 0F, 0F, -25F, 0F, 0F, 0F, -10F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, -31F, -0.5F, 0F, -18F, 11F, 0F, -1F, 11F, 0F); // Box 39
		leftWingModel[11].setRotationPoint(0F, -50F, -172F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 15, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftWingModel[12].setRotationPoint(-16F, 0F, -40.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 244
		leftWingModel[13].setRotationPoint(-16F, 6F, -40.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 245
		leftWingModel[14].setRotationPoint(-12F, 9F, -40.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 246
		leftWingModel[15].setRotationPoint(-18F, 0F, -40.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 247
		leftWingModel[16].setRotationPoint(-19F, -1F, -40.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 248
		leftWingModel[17].setRotationPoint(1F, -1F, -40.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 249
		leftWingModel[18].setRotationPoint(-1F, 0F, -40.5F);

		leftWingModel[19].addShapeBox(15F, 9F, 0F, 10, 1, 26, 0F,9F, -4F, 0F, -8F, -4F, 0F, -2F, 0F, -2F, 0F, 1F, 0F, 9F, 4.25F, 0F, -8F, 3.25F, 0F, -2F, -0.75F, -2F, 0F, -0.75F, 0F); // Box 465
		leftWingModel[19].setRotationPoint(43F, -42F, -38F);

		leftWingModel[20].addShapeBox(15F, 9F, 0F, 10, 1, 67, 0F,14F, 11F, 0F, -14F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, -9.75F, 0F, -14F, -9.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F); // Box 466
		leftWingModel[20].setRotationPoint(35F, -38F, -105.3F);

		leftWingModel[21].addShapeBox(15F, 9F, 0F, 10, 1, 67, 0F,24F, 11F, 0F, -26F, 10F, -1F, 1F, -1F, 0F, -1F, 1F, 0F, 24F, -10.75F, 0F, -26F, -10.75F, -1F, 1F, 0.25F, 0F, -1F, -0.75F, 0F); // Box 467
		leftWingModel[21].setRotationPoint(19F, -48F, -172.6F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 468
		leftWingModel[22].setRotationPoint(32F, -40F, -105.6F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 469
		leftWingModel[23].setRotationPoint(19F, -45F, -136.6F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 470
		leftWingModel[24].setRotationPoint(36F, -36F, -81.6F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 471
		leftWingModel[25].setRotationPoint(46F, -29.5F, -38.6F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 472
		leftWingModel[26].setRotationPoint(54F, -33.5F, -16.6F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 110
		rightWingModel[1] = new ModelRendererTurbo(this, 1113, 57, textureX, textureY); // Box 111
		rightWingModel[2] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 112
		rightWingModel[3] = new ModelRendererTurbo(this, 1281, 57, textureX, textureY); // Box 113
		rightWingModel[4] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 114
		rightWingModel[5] = new ModelRendererTurbo(this, 1369, 57, textureX, textureY); // Box 115
		rightWingModel[6] = new ModelRendererTurbo(this, 1593, 81, textureX, textureY); // Box 116
		rightWingModel[7] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 117
		rightWingModel[8] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 118
		rightWingModel[9] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 119
		rightWingModel[10] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 120
		rightWingModel[11] = new ModelRendererTurbo(this, 1153, 89, textureX, textureY); // Box 121
		rightWingModel[12] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 250
		rightWingModel[13] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 251
		rightWingModel[14] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 252
		rightWingModel[15] = new ModelRendererTurbo(this, 1593, 65, textureX, textureY); // Box 254
		rightWingModel[16] = new ModelRendererTurbo(this, 1633, 65, textureX, textureY); // Box 255
		rightWingModel[17] = new ModelRendererTurbo(this, 1689, 65, textureX, textureY); // Box 258
		rightWingModel[18] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 259
		rightWingModel[19] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 260
		rightWingModel[20] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 261
		rightWingModel[21] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 262
		rightWingModel[22] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 263
		rightWingModel[23] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 264
		rightWingModel[24] = new ModelRendererTurbo(this, 1049, 73, textureX, textureY); // Box 265
		rightWingModel[25] = new ModelRendererTurbo(this, 1089, 73, textureX, textureY); // Box 266
		rightWingModel[26] = new ModelRendererTurbo(this, 1097, 41, textureX, textureY); // Box 267
		rightWingModel[27] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 268
		rightWingModel[28] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 269
		rightWingModel[29] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 270
		rightWingModel[30] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 271
		rightWingModel[31] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 355
		rightWingModel[32] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 356
		rightWingModel[33] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 357
		rightWingModel[34] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 457
		rightWingModel[35] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 458
		rightWingModel[36] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 459
		rightWingModel[37] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 460
		rightWingModel[38] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 461
		rightWingModel[39] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 462
		rightWingModel[40] = new ModelRendererTurbo(this, 1057, 105, textureX, textureY); // Box 463
		rightWingModel[41] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Box 464

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 16, 5, 27, 0F,-4F, -2F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 110
		rightWingModel[0].setRotationPoint(-15F, -42F, 11F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 56, 5, 26, 0F,0F, 0F, 0F, -19F, -4F, 1F, -24F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 3F, 2F, 3F, -8F, 8F, 0F, 0F, 5F, 0F); // Box 111
		rightWingModel[1].setRotationPoint(1F, -42F, 12F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 16, 5, 27, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, 1F, 0F, -5F, 2F, 0F, -1F, 0F, -4F, -3F, 0F); // Box 112
		rightWingModel[2].setRotationPoint(-15F, -32F, 11F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 49, 4, 27, 0F,0F, 5F, 0F, 10F, 3F, 2F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, -24F, -5F, 2F, -28F, 0F, 0F, 0F, 0F, 0F); // Box 113
		rightWingModel[3].setRotationPoint(1F, -32F, 11F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 16, 5, 68, 0F,-6F, -7F, 0F, 0F, -5F, 0F, 0F, 3F, 0F, -10F, 2F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -4F, 0F, -4F, -4F, 0F); // Box 114
		rightWingModel[4].setRotationPoint(-15F, -42F, 38F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 12, 4, 66, 0F,-6F, -1F, 0F, 0F, 0F, 0F, -1F, 7F, 0F, -7F, 6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9F, 0F, -4F, -9F, 0F); // Box 115
		rightWingModel[5].setRotationPoint(-11F, -45F, 106F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 46, 4, 68, 0F,0F, -8F, 0F, -14F, -13F, 0F, -27F, -2.8F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 2F, 12F, 0F, -12F, 1F, 0F, 0F, 0F, 0F); // Box 116
		rightWingModel[6].setRotationPoint(1F, -45F, 38F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 35, 2, 66, 0F,-1F, -7F, 0F, -15F, -9.8F, 0F, -30F, -1F, 0F, 0F, 0F, 0F, -1F, 9F, 0F, 0F, 10F, 0F, -25F, 0F, 0F, 0F, 0F, 0F); // Box 117
		rightWingModel[7].setRotationPoint(0F, -52F, 106F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 16, 5, 68, 0F,4F, -9F, 0F, -4F, -9F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -4F, 8F, 0F, -4F, -2F, 0F, -5F, -3F, 0F); // Box 118
		rightWingModel[8].setRotationPoint(-11F, -41F, 38F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 5, 66, 0F,4F, -9F, 0F, -3F, -9F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 6F, 0F, -3F, 7F, 0F, -4F, -4F, 0F, -5F, -4F, 0F); // Box 119
		rightWingModel[9].setRotationPoint(-7F, -50F, 106F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 34, 3, 68, 0F,0F, -9F, 0F, 14F, -12F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, -13F, 10F, 0F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 120
		rightWingModel[10].setRotationPoint(1F, -41F, 38F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 35, 1, 66, 0F,-1F, -9F, 0F, 0F, -10F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, -1F, 11F, 0F, -18F, 11F, 0F, -31F, -0.5F, 0F, 0F, 0F, 0F); // Box 121
		rightWingModel[11].setRotationPoint(0F, -50F, 106F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 16, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 250
		rightWingModel[12].setRotationPoint(-7F, -32F, 37.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 16, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightWingModel[13].setRotationPoint(-7F, -32F, 39.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 16, 24, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 252
		rightWingModel[14].setRotationPoint(-7F, -32F, 36.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, -1F, 0F, 0F, 0F); // Box 254
		rightWingModel[15].setRotationPoint(4F, -5F, 40F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 255
		rightWingModel[16].setRotationPoint(-19F, -5F, 40F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 15, 6, 3, 0F,0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightWingModel[17].setRotationPoint(4F, -11F, 37F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 15, 6, 2, 0F,0F, 0F, 0F, -5F, -2F, 0F, -3F, -4F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F); // Box 259
		rightWingModel[18].setRotationPoint(4F, -11F, 40F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 15, 6, 2, 0F,0F, -1F, 1F, -3F, -4F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		rightWingModel[19].setRotationPoint(4F, -11F, 35F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F); // Box 261
		rightWingModel[20].setRotationPoint(-19F, -5F, 37F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F); // Box 262
		rightWingModel[21].setRotationPoint(-19F, -5F, 34F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 263
		rightWingModel[22].setRotationPoint(4F, -5F, 37F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 15, 5, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 264
		rightWingModel[23].setRotationPoint(4F, -5F, 34F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 15, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		rightWingModel[24].setRotationPoint(-16F, 0F, 36.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 15, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 266
		rightWingModel[25].setRotationPoint(-16F, 6F, 36.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 267
		rightWingModel[26].setRotationPoint(-12F, 9F, 36.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 268
		rightWingModel[27].setRotationPoint(-18F, 0F, 36.5F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 269
		rightWingModel[28].setRotationPoint(-19F, -1F, 36.5F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 270
		rightWingModel[29].setRotationPoint(1F, -1F, 36.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 271
		rightWingModel[30].setRotationPoint(-1F, 0F, 36.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,-4F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 355
		rightWingModel[31].setRotationPoint(-19F, -11F, 40F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,-4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		rightWingModel[32].setRotationPoint(-19F, -11F, 37F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 23, 6, 3, 0F,-7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		rightWingModel[33].setRotationPoint(-19F, -11F, 34F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 10, 1, 26, 0F,0F, 1F, 0F, -2F, 0F, -2F, -8F, -4F, 0F, 9F, -4F, 0F, 0F, -0.75F, 0F, -2F, -0.75F, -2F, -8F, 3.25F, 0F, 9F, 4.25F, 0F); // Box 457
		rightWingModel[34].setRotationPoint(59F, -33F, 12F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 10, 1, 67, 0F,0F, 0F, 0F, 0F, 0F, 0F, -14F, 9F, 0F, 14F, 11F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -14F, -9.75F, 0F, 14F, -10.75F, 0F); // Box 458
		rightWingModel[35].setRotationPoint(50F, -29F, 38.3F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 67, 0F,-1F, 1F, 0F, 1F, -1F, 0F, -26F, 10F, -1F, 24F, 11F, 0F, -1F, -0.75F, 0F, 1F, 0.25F, 0F, -26F, -10.75F, -1F, 24F, -10.75F, 0F); // Box 459
		rightWingModel[36].setRotationPoint(35F, -39F, 105.6F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 460
		rightWingModel[37].setRotationPoint(32F, -40F, 104.6F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 461
		rightWingModel[38].setRotationPoint(19F, -45F, 135.6F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 462
		rightWingModel[39].setRotationPoint(36F, -36F, 80.6F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 463
		rightWingModel[40].setRotationPoint(46F, -29.5F, 37.6F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 464
		rightWingModel[41].setRotationPoint(54F, -33.5F, 15.6F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1761, 81, textureX, textureY); // Box 199
		yawFlapModel[1] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 200

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 16, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 4F, -4F, -2F, 4F, -4F, 0F, -1F, 0F, 0F); // Box 199
		yawFlapModel[0].setRotationPoint(173F, -88F, -2F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 16, 48, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, -4F, 0F, 4F, -4F, -2F, -1F, 0F, -0.5F); // Box 200
		yawFlapModel[1].setRotationPoint(173F, -88F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1465, 97, textureX, textureY); // Box 208

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 64, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 208
		pitchFlapLeftModel[0].setRotationPoint(169.1F, -58.5F, -65F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1833, 89, textureX, textureY); // Box 204

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 64, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 204
		pitchFlapRightModel[0].setRotationPoint(169.1F, -58.5F, 1F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-71F, -47F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[0].addBox(-0.5F, -38F, -2F, 1, 38, 4, 0.0F);
		prop[1].addBox(-0.5F, -38F, -2F, 1, 38, 4, 0.0F);
		prop[2].addBox(-0.5F, -38F, -2F, 1, 38, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[18];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 72, 51, textureX, textureY); // MG 1
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 72, 51, textureX, textureY); // MG 1 Inner
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 72, 54, textureX, textureY); // MG 2 Lauf
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 72, 57, textureX, textureY); // MG 3
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 91, 57, textureX, textureY); // MG 4
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 101, 51, textureX, textureY); // MG 5
		gun_1_Model[1][6] = new ModelRendererTurbo(this, 106, 51, textureX, textureY); // MG 6
		gun_1_Model[1][7] = new ModelRendererTurbo(this, 72, 62, textureX, textureY); // MG 7
		gun_1_Model[1][8] = new ModelRendererTurbo(this, 79, 62, textureX, textureY); // MG 8
		gun_1_Model[1][9] = new ModelRendererTurbo(this, 79, 62, textureX, textureY); // MG 8 Inner
		gun_1_Model[1][10] = new ModelRendererTurbo(this, 86, 62, textureX, textureY); // MG 9
		gun_1_Model[1][11] = new ModelRendererTurbo(this, 86, 62, textureX, textureY); // MG 10
		gun_1_Model[1][12] = new ModelRendererTurbo(this, 95, 61, textureX, textureY); // MG 11
		gun_1_Model[1][13] = new ModelRendererTurbo(this, 72, 67, textureX, textureY); // Ammo 1
		gun_1_Model[1][14] = new ModelRendererTurbo(this, 72, 67, textureX, textureY); // Ammo 2
		gun_1_Model[1][15] = new ModelRendererTurbo(this, 78, 67, textureX, textureY); // Ammo 3
		gun_1_Model[1][16] = new ModelRendererTurbo(this, 89, 67, textureX, textureY); // Ammo 4
		gun_1_Model[1][17] = new ModelRendererTurbo(this, 89, 67, textureX, textureY); // Ammo 5

		gun_1_Model[1][0].addBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F); // MG 1

		gun_1_Model[1][1].addBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F); // MG 1 Inner

		gun_1_Model[1][2].addShapeBox(-2F, -0.5F, -0.5F, 13, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // MG 2 Lauf

		gun_1_Model[1][3].addBox(-9F, -1F, -1F, 7, 2, 2, 0F); // MG 3

		gun_1_Model[1][4].addShapeBox(-6F, -1.5F, -1F, 4, 1, 2, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // MG 4

		gun_1_Model[1][5].addShapeBox(9F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 5

		gun_1_Model[1][6].addShapeBox(-4F, -2F, -0.5F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 6

		gun_1_Model[1][7].addShapeBox(-8.2F, 1F, -0.5F, 2, 3, 1, 0F,-1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, -1F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, -1F, -0.1F); // MG 7

		gun_1_Model[1][8].addShapeBox(-7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 8

		gun_1_Model[1][9].addShapeBox(-7F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // MG 8 Inner

		gun_1_Model[1][10].addBox(-5.5F, -0.5F, 0.2F, 3, 1, 1, 0F); // MG 9

		gun_1_Model[1][11].addBox(-5.5F, -0.5F, -1.2F, 3, 1, 1, 0F); // MG 10

		gun_1_Model[1][12].addShapeBox(-2F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.25F, -0.25F); // MG 11

		gun_1_Model[1][13].addShapeBox(-5F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo 1

		gun_1_Model[1][14].addShapeBox(-5F, 0F, -3F, 2, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Ammo 2

		gun_1_Model[1][15].addBox(-5F, 1F, -3F, 2, 1, 6, 0F); // Ammo 3

		gun_1_Model[1][16].addShapeBox(-5F, 2F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Ammo 4

		gun_1_Model[1][17].addShapeBox(-5F, 2F, -3F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Ammo 5

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(69F, -62F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}