//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.07.2016 - 17:16:32
// Last changed on: 21.07.2016 - 17:16:32

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDo335A1 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelDo335A1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[185];
		tailModel = new ModelRendererTurbo[78];
		leftWingModel = new ModelRendererTurbo[4];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[15];
		leftWingWheelModel = new ModelRendererTurbo[15];
		rightWingWheelModel = new ModelRendererTurbo[15];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 1049, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 1209, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 1337, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 1585, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 1025, 9, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 1145, 9, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 1465, 9, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 1721, 9, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 1137, 17, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 1297, 17, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 1425, 17, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 1553, 17, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 1673, 17, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 1809, 17, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 1953, 17, textureX, textureY); // Box 59
		bodyModel[35] = new ModelRendererTurbo(this, 1993, 17, textureX, textureY); // Box 61
		bodyModel[36] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 62
		bodyModel[37] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 1257, 9, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 1289, 9, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 1841, 9, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 1041, 25, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 1105, 25, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 1153, 25, textureX, textureY); // Box 55
		bodyModel[50] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 1185, 25, textureX, textureY); // Box 57
		bodyModel[52] = new ModelRendererTurbo(this, 1217, 25, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 1241, 25, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 1289, 25, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 1553, 25, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 1817, 25, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 64
		bodyModel[59] = new ModelRendererTurbo(this, 1401, 33, textureX, textureY); // Box 65
		bodyModel[60] = new ModelRendererTurbo(this, 1513, 33, textureX, textureY); // Box 66
		bodyModel[61] = new ModelRendererTurbo(this, 1625, 33, textureX, textureY); // Box 67
		bodyModel[62] = new ModelRendererTurbo(this, 1921, 33, textureX, textureY); // Box 68
		bodyModel[63] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 69
		bodyModel[64] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 70
		bodyModel[65] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 71
		bodyModel[66] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 1721, 33, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 75
		bodyModel[70] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 76
		bodyModel[71] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 81
		bodyModel[76] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 82
		bodyModel[77] = new ModelRendererTurbo(this, 1769, 33, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 1065, 41, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 1105, 41, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 1369, 25, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 1265, 25, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 1505, 41, textureX, textureY); // Box 92
		bodyModel[87] = new ModelRendererTurbo(this, 1785, 41, textureX, textureY); // Box 93
		bodyModel[88] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 94
		bodyModel[89] = new ModelRendererTurbo(this, 1209, 33, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 2017, 33, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 2017, 9, textureX, textureY); // Box 97
		bodyModel[92] = new ModelRendererTurbo(this, 1313, 41, textureX, textureY); // Box 98
		bodyModel[93] = new ModelRendererTurbo(this, 1865, 41, textureX, textureY); // Box 99
		bodyModel[94] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 100
		bodyModel[95] = new ModelRendererTurbo(this, 1297, 41, textureX, textureY); // Box 101
		bodyModel[96] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 102
		bodyModel[97] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 104
		bodyModel[99] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 108
		bodyModel[103] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 109
		bodyModel[104] = new ModelRendererTurbo(this, 1305, 49, textureX, textureY); // Box 118
		bodyModel[105] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 119
		bodyModel[106] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 120
		bodyModel[107] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 121
		bodyModel[108] = new ModelRendererTurbo(this, 1649, 49, textureX, textureY); // Box 123
		bodyModel[109] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 152
		bodyModel[110] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 153
		bodyModel[111] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 154
		bodyModel[112] = new ModelRendererTurbo(this, 2033, 25, textureX, textureY); // Box 155
		bodyModel[113] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 156
		bodyModel[114] = new ModelRendererTurbo(this, 2017, 65, textureX, textureY); // Box 157
		bodyModel[115] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 158
		bodyModel[116] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 201
		bodyModel[117] = new ModelRendererTurbo(this, 1993, 49, textureX, textureY); // Box 202
		bodyModel[118] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 211
		bodyModel[119] = new ModelRendererTurbo(this, 1561, 57, textureX, textureY); // Box 217
		bodyModel[120] = new ModelRendererTurbo(this, 1689, 57, textureX, textureY); // Box 218
		bodyModel[121] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 219
		bodyModel[122] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 220
		bodyModel[123] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 221
		bodyModel[124] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 222
		bodyModel[125] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 223
		bodyModel[126] = new ModelRendererTurbo(this, 1865, 41, textureX, textureY); // Box 226
		bodyModel[127] = new ModelRendererTurbo(this, 1105, 57, textureX, textureY); // Box 227
		bodyModel[128] = new ModelRendererTurbo(this, 1209, 65, textureX, textureY); // Box 292
		bodyModel[129] = new ModelRendererTurbo(this, 1161, 97, textureX, textureY); // Box 294
		bodyModel[130] = new ModelRendererTurbo(this, 1233, 49, textureX, textureY); // Box 295
		bodyModel[131] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 296
		bodyModel[132] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 297
		bodyModel[133] = new ModelRendererTurbo(this, 1689, 65, textureX, textureY); // Box 298
		bodyModel[134] = new ModelRendererTurbo(this, 2041, 33, textureX, textureY); // Box 299
		bodyModel[135] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 300
		bodyModel[136] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 301
		bodyModel[137] = new ModelRendererTurbo(this, 1025, 25, textureX, textureY); // Box 302
		bodyModel[138] = new ModelRendererTurbo(this, 1449, 1, textureX, textureY); // Box 303
		bodyModel[139] = new ModelRendererTurbo(this, 1985, 17, textureX, textureY); // Box 307
		bodyModel[140] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 308
		bodyModel[141] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 309
		bodyModel[142] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 311
		bodyModel[143] = new ModelRendererTurbo(this, 1073, 97, textureX, textureY); // Box 312
		bodyModel[144] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 313
		bodyModel[145] = new ModelRendererTurbo(this, 1105, 25, textureX, textureY); // Box 314
		bodyModel[146] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 315
		bodyModel[147] = new ModelRendererTurbo(this, 1201, 97, textureX, textureY); // Box 316
		bodyModel[148] = new ModelRendererTurbo(this, 1945, 25, textureX, textureY); // Box 317
		bodyModel[149] = new ModelRendererTurbo(this, 2017, 25, textureX, textureY); // Box 318
		bodyModel[150] = new ModelRendererTurbo(this, 1113, 49, textureX, textureY); // Box 319
		bodyModel[151] = new ModelRendererTurbo(this, 1353, 41, textureX, textureY); // Box 320
		bodyModel[152] = new ModelRendererTurbo(this, 1145, 25, textureX, textureY); // Box 321
		bodyModel[153] = new ModelRendererTurbo(this, 1577, 41, textureX, textureY); // Box 322
		bodyModel[154] = new ModelRendererTurbo(this, 1353, 49, textureX, textureY); // Box 323
		bodyModel[155] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 324
		bodyModel[156] = new ModelRendererTurbo(this, 2017, 41, textureX, textureY); // Box 325
		bodyModel[157] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 326
		bodyModel[158] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 327
		bodyModel[159] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 328
		bodyModel[160] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Box 329
		bodyModel[161] = new ModelRendererTurbo(this, 1313, 89, textureX, textureY); // Box 330
		bodyModel[162] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 331
		bodyModel[163] = new ModelRendererTurbo(this, 1409, 89, textureX, textureY); // Box 332
		bodyModel[164] = new ModelRendererTurbo(this, 1145, 33, textureX, textureY); // Box 333
		bodyModel[165] = new ModelRendererTurbo(this, 2033, 89, textureX, textureY); // Box 334
		bodyModel[166] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 335
		bodyModel[167] = new ModelRendererTurbo(this, 1233, 33, textureX, textureY); // Box 336
		bodyModel[168] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 337
		bodyModel[169] = new ModelRendererTurbo(this, 1313, 41, textureX, textureY); // Box 338
		bodyModel[170] = new ModelRendererTurbo(this, 1593, 97, textureX, textureY); // Box 303
		bodyModel[171] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 304
		bodyModel[172] = new ModelRendererTurbo(this, 1857, 41, textureX, textureY); // Box 305
		bodyModel[173] = new ModelRendererTurbo(this, 1505, 97, textureX, textureY); // Box 306
		bodyModel[174] = new ModelRendererTurbo(this, 1849, 97, textureX, textureY); // Box 307
		bodyModel[175] = new ModelRendererTurbo(this, 1161, 105, textureX, textureY); // Box 308
		bodyModel[176] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 309
		bodyModel[177] = new ModelRendererTurbo(this, 1505, 105, textureX, textureY); // Box 310
		bodyModel[178] = new ModelRendererTurbo(this, 1593, 105, textureX, textureY); // Box 311
		bodyModel[179] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 312
		bodyModel[180] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 313
		bodyModel[181] = new ModelRendererTurbo(this, 1697, 105, textureX, textureY); // Box 314
		bodyModel[182] = new ModelRendererTurbo(this, 1281, 105, textureX, textureY); // Box 315
		bodyModel[183] = new ModelRendererTurbo(this, 1801, 105, textureX, textureY); // Box 316
		bodyModel[184] = new ModelRendererTurbo(this, 1873, 105, textureX, textureY); // Box 317

		bodyModel[0].addShapeBox(0F, 0F, 0F, 60, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 5
		bodyModel[0].setRotationPoint(-50F, -61F, -13.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 55, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 5F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 5F, 0F, -2.5F); // Box 6
		bodyModel[1].setRotationPoint(-45F, -71F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 53, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, -1F, 2F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -3F, 2F, 0F, -4F); // Box 7
		bodyModel[2].setRotationPoint(-43F, -76F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 53, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, -1F, -1F, 0F); // Box 8
		bodyModel[3].setRotationPoint(-43F, -76F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 52, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[4].setRotationPoint(-42F, -77F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 74, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(10F, -61F, -13.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 74, 10, 1, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F); // Box 11
		bodyModel[6].setRotationPoint(10F, -71F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 74, 5, 1, 0F,0F, 0F, 0F, 0F, -4.5F, -3F, 0F, -5.5F, 2F, 0F, -1F, -1F, 0F, 0F, 6F, 0F, 3F, 3F, 0F, 3F, -3F, 0F, 0F, -6F); // Box 13
		bodyModel[7].setRotationPoint(10F, -76F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F,0F, 0F, 0F, 0F, -4.5F, -3F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 4.5F, -3F, 0F, 4.5F, 0F, 0F, -0.5F, 0F); // Box 14
		bodyModel[8].setRotationPoint(10F, -76F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 60, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-50F, -53F, -14.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 60, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 16
		bodyModel[10].setRotationPoint(-50F, -47F, -14.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 3F, -5F, 0F, 2F, 4F, 0F, 0F, 4F); // Box 17
		bodyModel[11].setRotationPoint(-50F, -40F, -13.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 60, 1, 8, 0F,0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 18
		bodyModel[12].setRotationPoint(-50F, -35F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 74, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 19
		bodyModel[13].setRotationPoint(10F, -53F, -13.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 74, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 20
		bodyModel[14].setRotationPoint(10F, -47F, -13.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 74, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 1F, -4F, 0F, -1F, -7F, 0F, -2F, 6F, 0F, 0F, 3F); // Box 21
		bodyModel[15].setRotationPoint(10F, -40F, -12.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 74, 1, 8, 0F,0F, 0F, 0.5F, 0F, 2F, -2.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -2F, -2.5F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 22
		bodyModel[16].setRotationPoint(10F, -33F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 60, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 23
		bodyModel[17].setRotationPoint(-50F, -61F, 12.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 55, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 5F, 0F, 2.5F); // Box 24
		bodyModel[18].setRotationPoint(-45F, -71F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 53, 5, 1, 0F,0F, -1F, -1F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 3F, 2F, 0F, 4F); // Box 25
		bodyModel[19].setRotationPoint(-43F, -76F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 53, 1, 2, 0F,-1F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 26
		bodyModel[20].setRotationPoint(-43F, -76F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 52, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 27
		bodyModel[21].setRotationPoint(-42F, -77F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 74, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 28
		bodyModel[22].setRotationPoint(10F, -61F, 12.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 74, 10, 1, 0F,0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 3.5F); // Box 29
		bodyModel[23].setRotationPoint(10F, -71F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 74, 5, 1, 0F,0F, -1F, -1F, 0F, -5.5F, 2F, 0F, -4.5F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 3F, -3F, 0F, 3F, 3F, 0F, 0F, 6F); // Box 30
		bodyModel[24].setRotationPoint(10F, -76F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F,0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, -3F, 0F, 0F, 0F); // Box 31
		bodyModel[25].setRotationPoint(10F, -76F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 60, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[26].setRotationPoint(-50F, -53F, 13.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 60, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 33
		bodyModel[27].setRotationPoint(-50F, -47F, 13.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 60, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 4F, 0F, 3F, -5F, 0F, 1F, -5F); // Box 34
		bodyModel[28].setRotationPoint(-50F, -40F, 12.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 60, 1, 8, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0.5F); // Box 35
		bodyModel[29].setRotationPoint(-50F, -35F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 74, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 1F); // Box 36
		bodyModel[30].setRotationPoint(10F, -53F, 12.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 74, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(10F, -47F, 12.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 74, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, -2F, 6F, 0F, -1F, -7F, 0F, 1F, -4F); // Box 38
		bodyModel[32].setRotationPoint(10F, -40F, 11.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 74, 1, 8, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, -2.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -2.5F, 0F, 0F, 0.5F); // Box 39
		bodyModel[33].setRotationPoint(10F, -33F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, -1F, 0F, 0F, -2F, 0.5F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, 0.5F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 59
		bodyModel[34].setRotationPoint(-61F, -37F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 61
		bodyModel[35].setRotationPoint(-61F, -61F, -13.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 62
		bodyModel[36].setRotationPoint(-61F, -54F, -14F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 1F); // Box 38
		bodyModel[37].setRotationPoint(-61F, -48F, -14.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -5.5F, 0F, 2F, -5F, 0F, 1F, 4F, 0F, 0F, 4.5F); // Box 39
		bodyModel[38].setRotationPoint(-61F, -41F, -13.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0.5F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 2F, 0.5F, 0F, 1F, 0F); // Box 40
		bodyModel[39].setRotationPoint(-61F, -37F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 1F); // Box 41
		bodyModel[40].setRotationPoint(-61F, -61F, 12.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F); // Box 42
		bodyModel[41].setRotationPoint(-61F, -54F, 13F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 43
		bodyModel[42].setRotationPoint(-61F, -48F, 13.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 1F, 4F, 0F, 2F, -5F, 0F, 1F, -5.5F); // Box 44
		bodyModel[43].setRotationPoint(-61F, -41F, 12.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 45
		bodyModel[44].setRotationPoint(-74F, -61F, -13.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 46
		bodyModel[45].setRotationPoint(-74F, -54F, -14F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 47
		bodyModel[46].setRotationPoint(-74F, -48F, -14.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 3.5F, 0F, -2F, 3.5F); // Box 48
		bodyModel[47].setRotationPoint(-74F, -41F, -12.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F,0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 2F, 0F); // Box 49
		bodyModel[48].setRotationPoint(-74F, -39F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 55
		bodyModel[49].setRotationPoint(-74F, -61F, 12.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 56
		bodyModel[50].setRotationPoint(-74F, -54F, 13F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 57
		bodyModel[51].setRotationPoint(-74F, -48F, 13.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 13, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 3.5F, 0F, 0F, 3.5F, 0F, 1F, -4.5F, 0F, -1F, -4.5F); // Box 58
		bodyModel[52].setRotationPoint(-74F, -41F, 11.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F,0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Box 59
		bodyModel[53].setRotationPoint(-74F, -39F, 0F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 51, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, -1F, -2F); // Box 60
		bodyModel[54].setRotationPoint(-125F, -61F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 51, 6, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, -1F, 0.5F); // Box 61
		bodyModel[55].setRotationPoint(-125F, -54F, -12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 51, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, -3F, 3F); // Box 62
		bodyModel[56].setRotationPoint(-125F, -49F, -11.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 51, 5, 1, 0F,0F, 0F, 0F, 0F, -4F, 4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, -2.5F, -2.5F, 0F, 3F, -0.5F, 0F, 2F, -0.5F, 0F, -3.5F, 1.5F); // Box 63
		bodyModel[57].setRotationPoint(-125F, -45F, -8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 51, 1, 8, 0F,0F, -1.5F, -2F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, -2F, 0F, 7F, 0F, 0F, 8F, 0F, 0F, 2.5F, 0F); // Box 64
		bodyModel[58].setRotationPoint(-125F, -45F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 51, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, -1F, 2F); // Box 65
		bodyModel[59].setRotationPoint(-125F, -61F, 9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 51, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, -1F, -0.5F); // Box 66
		bodyModel[60].setRotationPoint(-125F, -54F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 51, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, -3F, -3F); // Box 67
		bodyModel[61].setRotationPoint(-125F, -49F, 10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 51, 5, 1, 0F,0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, 4F, 0F, 0F, 0F, 0F, -3.5F, 1.5F, 0F, 2F, -0.5F, 0F, 3F, -0.5F, 0F, -2.5F, -2.5F); // Box 68
		bodyModel[62].setRotationPoint(-125F, -45F, 7.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 51, 1, 8, 0F,0F, -2.5F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, -1.5F, -2F, 0F, 2.5F, 0F, 0F, 8F, 0F, 0F, 7F, 0F, 0F, 1.5F, -2F); // Box 69
		bodyModel[63].setRotationPoint(-125F, -45F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 51, 4, 1, 0F,0F, 0F, -1F, -1F, 1F, 4F, -1F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, 3F, 0F, -1F, 7F, 0F, -1F, -7F, 0F, -1F, -3F); // Box 70
		bodyModel[64].setRotationPoint(-125F, -64F, -6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 50, 1, 5, 0F,0F, 0F, 0F, 0F, 1F, 5F, -1F, 4F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, -1F, 5F, -1F, -4F, 0.5F, 0F, -1F, 0.5F); // Box 71
		bodyModel[65].setRotationPoint(-125F, -64F, -5.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 51, 4, 1, 0F,0F, -1F, 0F, -1F, 0F, -5F, -1F, 1F, 4F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -1F, -7F, 0F, -1F, 7F, 0F, -1F, 3F); // Box 72
		bodyModel[66].setRotationPoint(-125F, -64F, 5.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 50, 1, 5, 0F,0F, 1F, 0.5F, -1F, 4F, 0.5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, -1F, 0.5F, -1F, -4F, 0.5F, 0F, -1F, 5F, 0F, 0F, 0F); // Box 73
		bodyModel[67].setRotationPoint(-125F, -64F, 0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[68].setRotationPoint(-139F, -60F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 16, 3, 14, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[69].setRotationPoint(-139F, -63F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 16, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[70].setRotationPoint(-139F, -60F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, -1.25F, -1.25F, 0F, 0.25F, 0.25F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[71].setRotationPoint(-139F, -63F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 16, 14, 1, 0F,0F, -5F, 0F, 0F, -4F, 2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 2.5F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 78
		bodyModel[72].setRotationPoint(-139F, -60F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[73].setRotationPoint(-139F, -64F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 16, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 80
		bodyModel[74].setRotationPoint(-139F, -60F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 81
		bodyModel[75].setRotationPoint(-139F, -63F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 16, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 2.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, 2.5F, 0F, -5F, 0F); // Box 82
		bodyModel[76].setRotationPoint(-139F, -60F, 10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0.25F, 0.25F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[77].setRotationPoint(-139F, -46F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0.25F, 0F, -1.25F, -1.25F); // Box 84
		bodyModel[78].setRotationPoint(-139F, -46F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 16, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[79].setRotationPoint(-139F, -46F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 16, 1, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, -4F); // Box 86
		bodyModel[80].setRotationPoint(-139F, -43F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 36, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[81].setRotationPoint(-74F, -47F, -13.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 15, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 88
		bodyModel[82].setRotationPoint(-75F, -61F, -13F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 2F); // Box 89
		bodyModel[83].setRotationPoint(-76F, -64F, -10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 11F, 1F, 0F, 11F, 1F, 0F, 11F, -1F, 0F, 11F); // Box 90
		bodyModel[84].setRotationPoint(-77F, -68F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 110, 190, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -170F, 0F, 0F, -170F, 0F, -100F, 4F, 2F, -100F, 4F, 2F, -100F, -166F, 0F, -100F, -166F); // Box 91
		bodyModel[85].setRotationPoint(-75F, -65F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 29, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[86].setRotationPoint(-74F, -55F, -13.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 29, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[87].setRotationPoint(-74F, -55F, 6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 1F); // Box 94
		bodyModel[88].setRotationPoint(-47F, -61F, -13F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 3F); // Box 95
		bodyModel[89].setRotationPoint(-45F, -71F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 4F, 3F, 0F, 4F); // Box 96
		bodyModel[90].setRotationPoint(-42F, -76F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[91].setRotationPoint(-51F, -56F, -13.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[92].setRotationPoint(-61F, -56F, 6.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 12, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[93].setRotationPoint(-62F, -49F, -6.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 100
		bodyModel[94].setRotationPoint(-49F, -55F, -6.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 9, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 101
		bodyModel[95].setRotationPoint(-47F, -64F, -6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[96].setRotationPoint(-62F, -48F, -6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[97].setRotationPoint(-68F, -57F, -1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[98].setRotationPoint(-67F, -57F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[99].setRotationPoint(-65F, -59F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[100].setRotationPoint(-65F, -61F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[101].setRotationPoint(-65F, -61F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 36, 6, 120, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -12F, 0F, 13F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 5F, 13F, 14F, 5F); // Box 108
		bodyModel[102].setRotationPoint(-20F, -53F, -133.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 27, 6, 120, 0F,-20F, -2F, 0F, 0F, 0F, 0F, -13F, -5F, 0F, 8F, -9F, 0F, -20F, -2F, 0F, 0F, 0F, 0F, -13F, 14F, 5F, 8F, 10F, 4F); // Box 109
		bodyModel[103].setRotationPoint(-47F, -53F, -133.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 36, 6, 120, 0F,13F, -5F, 0F, 0F, -12F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 13F, 14F, 5F, 0F, 14F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[104].setRotationPoint(-20F, -53F, 13.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 27, 6, 120, 0F,8F, -9F, 0F, -13F, -5F, 0F, 0F, 0F, 0F, -20F, -2F, 0F, 8F, 10F, 4F, -13F, 14F, 5F, 0F, 0F, 0F, -20F, -2F, 0F); // Box 119
		bodyModel[105].setRotationPoint(-47F, -53F, 13.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 36, 6, 22, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -7F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F); // Box 120
		bodyModel[106].setRotationPoint(-20F, -53F, 133.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 14, 6, 22, 0F,0F, -2F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, 0F, -3F, 0F, -5F, -4F, 0F); // Box 121
		bodyModel[107].setRotationPoint(-27F, -53F, 133.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 2, 22, 0F,0F, -2F, 0F, 0F, -4F, 0F, -2F, -1F, -3F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -2F, -1F, -3F, 0F, 0F, 0F); // Box 123
		bodyModel[108].setRotationPoint(16F, -52F, 133.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 37, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[109].setRotationPoint(83F, -71F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 37, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 153
		bodyModel[110].setRotationPoint(83F, -71F, 1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 32, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F); // Box 154
		bodyModel[111].setRotationPoint(83F, -68F, 6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[112].setRotationPoint(83F, -61F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 37, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[113].setRotationPoint(83F, -71F, -6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 32, 4, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[114].setRotationPoint(83F, -68F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[115].setRotationPoint(83F, -61F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, -3.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -3.5F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 201
		bodyModel[116].setRotationPoint(-149F, -60.5F, -3.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[117].setRotationPoint(-149F, -59.5F, -6.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, -2F, -3.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -3.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 211
		bodyModel[118].setRotationPoint(-149F, -56.5F, -7.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 217
		bodyModel[119].setRotationPoint(-149F, -59.5F, 3.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 218
		bodyModel[120].setRotationPoint(-149F, -49.5F, 3.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 219
		bodyModel[121].setRotationPoint(-149F, -49.5F, -6.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -3.5F, -2F); // Box 220
		bodyModel[122].setRotationPoint(-149F, -46.5F, -3.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -3.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -3.5F); // Box 221
		bodyModel[123].setRotationPoint(-149F, -56.5F, 6.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -3F, 3F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -3F, -4F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -3F, -4F); // Box 222
		bodyModel[124].setRotationPoint(-152F, -56.5F, 3.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, -4F, -3F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -4F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F); // Box 223
		bodyModel[125].setRotationPoint(-152F, -57.5F, -3.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -3F, -4F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, -4F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -3F, 3F); // Box 226
		bodyModel[126].setRotationPoint(-152F, -56.5F, -4.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, -4F, -3F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -4F, -3F); // Box 227
		bodyModel[127].setRotationPoint(-152F, -49.5F, -3.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 292
		bodyModel[128].setRotationPoint(-58F, -74F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 294
		bodyModel[129].setRotationPoint(-58F, -74F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 295
		bodyModel[130].setRotationPoint(-67F, -72F, 4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 296
		bodyModel[131].setRotationPoint(-67F, -72F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, 1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 1F, 0F, 0F, 0F); // Box 297
		bodyModel[132].setRotationPoint(-77F, -67F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.3F, 0F, 0F, 5F, 1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, -1F, 0F, 0F, 0F); // Box 298
		bodyModel[133].setRotationPoint(-77F, -67F, -4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.4F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.3F, 8.5F, 4.5F, -0.3F, 8.5F, 4.5F, -0.3F, -8.5F, -4.5F, -0.3F, -8.5F); // Box 299
		bodyModel[134].setRotationPoint(-71F, -70F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0F, -0.4F, -4.5F, -0.3F, -8.5F, 4.5F, -0.3F, -8.5F, 4.5F, -0.3F, 8.5F, -4.5F, -0.3F, 8.5F); // Box 300
		bodyModel[135].setRotationPoint(-71F, -70F, 4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[136].setRotationPoint(-71F, -70F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.6F, 0F); // Box 302
		bodyModel[137].setRotationPoint(-60F, -73F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0.8F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.8F, 0F, 0F, -0.7F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.7F, 0F); // Box 303
		bodyModel[138].setRotationPoint(-48F, -74.5F, -6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 307
		bodyModel[139].setRotationPoint(-56F, -69F, 10.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, -9F, 0.5F, 2.5F, -9F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -2.5F, 7.5F, -0.5F, 2.5F, 7.5F, -0.5F); // Box 308
		bodyModel[140].setRotationPoint(-56F, -69F, 12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -0.3F, 0F, -0.1F, 0F, 0F, 0.6F, -0.7F, 0F, 0.5F, -0.8F, 1.5F, 0F, -4.5F, -1.5F, 0F, -4.5F, -2F, 0F, 4.5F, 2F, 0F, 4.5F); // Box 309
		bodyModel[141].setRotationPoint(-54F, -74F, 6F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 311
		bodyModel[142].setRotationPoint(-55F, -69F, 10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0.6F, 0.5F, 4F, -1.5F, 0F, 4F, 1.5F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0.5F, -4F, -2F, 0F, -4F, 1.7F, 0F, 0F, 0.2F); // Box 312
		bodyModel[143].setRotationPoint(-68F, -65F, 9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,2.5F, -9F, 0.5F, -2.5F, -9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2.5F, 7.5F, -0.5F, -2.5F, 7.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 313
		bodyModel[144].setRotationPoint(-56F, -69F, -13F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.5F, -0.8F, 0F, 0.6F, -0.7F, 0F, -0.1F, 0F, 0F, -0.5F, -0.3F, 2F, 0F, 4.5F, -2F, 0F, 4.5F, -1.5F, 0F, -4.5F, 1.5F, 0F, -4.5F); // Box 314
		bodyModel[145].setRotationPoint(-54F, -74F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -1F, 0F, -0.5F, -1F, 0F); // Box 315
		bodyModel[146].setRotationPoint(-55F, -69F, -11.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -0.6F, 0F, 4F, 1.5F, 0.5F, 4F, -1.5F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, -4F, 1.7F, 0.5F, -4F, -2F, 0F, 0F, -0.2F); // Box 316
		bodyModel[147].setRotationPoint(-68F, -65F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[148].setRotationPoint(-69F, -55.2F, -9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[149].setRotationPoint(-69F, -55.2F, -12F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[150].setRotationPoint(-66F, -55.2F, -12F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[151].setRotationPoint(-66F, -55.2F, -8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[152].setRotationPoint(-58F, -60F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[153].setRotationPoint(-67F, -55.2F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[154].setRotationPoint(-67F, -55.2F, 7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[155].setRotationPoint(-70F, -55.2F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[156].setRotationPoint(-71F, -55.2F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[157].setRotationPoint(-60F, -56.2F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[158].setRotationPoint(-60F, -56.2F, 11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[159].setRotationPoint(-55F, -56.2F, 7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[160].setRotationPoint(-56F, -56.2F, 11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[161].setRotationPoint(-61F, -55.2F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[162].setRotationPoint(-75F, -64F, -7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[163].setRotationPoint(-75F, -64F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[164].setRotationPoint(-75F, -64F, 4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[165].setRotationPoint(-74F, -60F, -3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[166].setRotationPoint(-74F, -60F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[167].setRotationPoint(-74F, -60F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[168].setRotationPoint(-74F, -60F, 4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[169].setRotationPoint(-74F, -60F, 7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 29, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[170].setRotationPoint(-115F, -67F, -3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 29, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[171].setRotationPoint(-115F, -67F, 2F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[172].setRotationPoint(-154F, -53.5F, -0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[173].setRotationPoint(37F, -28F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 307
		bodyModel[174].setRotationPoint(37F, -28F, 3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[175].setRotationPoint(53F, -28F, 0F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 309
		bodyModel[176].setRotationPoint(37F, -34F, 7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -1F, 0F, -2F, 1F); // Box 310
		bodyModel[177].setRotationPoint(53F, -28F, 3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, -5F, 2F, 0F, -5F, -3F, 0F, 0F, -1F); // Box 311
		bodyModel[178].setRotationPoint(53F, -34F, 7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[179].setRotationPoint(37F, -28F, -3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 16, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[180].setRotationPoint(37F, -28F, -6F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[181].setRotationPoint(53F, -28F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 315
		bodyModel[182].setRotationPoint(37F, -34F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 30, 1, 3, 0F,0F, 1F, 0F, 0F, 6F, -1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -7F, -1F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[183].setRotationPoint(53F, -28F, -6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 30, 5, 1, 0F,0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -3F, 0F, -5F, 2F, 0F, 0F, 1F); // Box 317
		bodyModel[184].setRotationPoint(53F, -34F, -8F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1233, 41, textureX, textureY); // Box 115
		tailModel[1] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 116
		tailModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 117
		tailModel[3] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 118
		tailModel[4] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 119
		tailModel[5] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 120
		tailModel[6] = new ModelRendererTurbo(this, 1057, 57, textureX, textureY); // Box 121
		tailModel[7] = new ModelRendererTurbo(this, 1505, 57, textureX, textureY); // Box 123
		tailModel[8] = new ModelRendererTurbo(this, 1785, 57, textureX, textureY); // Box 124
		tailModel[9] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 126
		tailModel[10] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 127
		tailModel[11] = new ModelRendererTurbo(this, 1993, 57, textureX, textureY); // Box 128
		tailModel[12] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 129
		tailModel[13] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 130
		tailModel[14] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 131
		tailModel[15] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 132
		tailModel[16] = new ModelRendererTurbo(this, 1041, 65, textureX, textureY); // Box 133
		tailModel[17] = new ModelRendererTurbo(this, 1281, 65, textureX, textureY); // Box 134
		tailModel[18] = new ModelRendererTurbo(this, 1505, 65, textureX, textureY); // Box 135
		tailModel[19] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 136
		tailModel[20] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 137
		tailModel[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 138
		tailModel[22] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 139
		tailModel[23] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 140
		tailModel[24] = new ModelRendererTurbo(this, 1073, 73, textureX, textureY); // Box 141
		tailModel[25] = new ModelRendererTurbo(this, 1169, 73, textureX, textureY); // Box 142
		tailModel[26] = new ModelRendererTurbo(this, 1281, 73, textureX, textureY); // Box 143
		tailModel[27] = new ModelRendererTurbo(this, 1505, 73, textureX, textureY); // Box 144
		tailModel[28] = new ModelRendererTurbo(this, 1713, 73, textureX, textureY); // Box 145
		tailModel[29] = new ModelRendererTurbo(this, 1801, 73, textureX, textureY); // Box 146
		tailModel[30] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 147
		tailModel[31] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Box 148
		tailModel[32] = new ModelRendererTurbo(this, 1321, 9, textureX, textureY); // Box 149
		tailModel[33] = new ModelRendererTurbo(this, 1809, 25, textureX, textureY); // Box 150
		tailModel[34] = new ModelRendererTurbo(this, 1329, 9, textureX, textureY); // Box 151
		tailModel[35] = new ModelRendererTurbo(this, 1585, 41, textureX, textureY); // Box 159
		tailModel[36] = new ModelRendererTurbo(this, 1049, 41, textureX, textureY); // Box 161
		tailModel[37] = new ModelRendererTurbo(this, 1361, 41, textureX, textureY); // Box 162
		tailModel[38] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 163
		tailModel[39] = new ModelRendererTurbo(this, 1625, 49, textureX, textureY); // Box 167
		tailModel[40] = new ModelRendererTurbo(this, 1401, 25, textureX, textureY); // Box 171
		tailModel[41] = new ModelRendererTurbo(this, 1209, 33, textureX, textureY); // Box 173
		tailModel[42] = new ModelRendererTurbo(this, 1049, 49, textureX, textureY); // Box 174
		tailModel[43] = new ModelRendererTurbo(this, 1689, 49, textureX, textureY); // Box 175
		tailModel[44] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 176
		tailModel[45] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 177
		tailModel[46] = new ModelRendererTurbo(this, 1329, 57, textureX, textureY); // Box 178
		tailModel[47] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 180
		tailModel[48] = new ModelRendererTurbo(this, 1929, 25, textureX, textureY); // Box 181
		tailModel[49] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 182
		tailModel[50] = new ModelRendererTurbo(this, 1113, 41, textureX, textureY); // Box 183
		tailModel[51] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 184
		tailModel[52] = new ModelRendererTurbo(this, 1369, 73, textureX, textureY); // Box 185
		tailModel[53] = new ModelRendererTurbo(this, 1889, 73, textureX, textureY); // Box 186
		tailModel[54] = new ModelRendererTurbo(this, 1929, 73, textureX, textureY); // Box 187
		tailModel[55] = new ModelRendererTurbo(this, 1977, 73, textureX, textureY); // Box 188
		tailModel[56] = new ModelRendererTurbo(this, 1873, 57, textureX, textureY); // Box 189
		tailModel[57] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 190
		tailModel[58] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 191
		tailModel[59] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 192
		tailModel[60] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 193
		tailModel[61] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 194
		tailModel[62] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 195
		tailModel[63] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 198
		tailModel[64] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 199
		tailModel[65] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 213
		tailModel[66] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 214
		tailModel[67] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 216
		tailModel[68] = new ModelRendererTurbo(this, 1529, 65, textureX, textureY); // Box 228
		tailModel[69] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 229
		tailModel[70] = new ModelRendererTurbo(this, 1769, 41, textureX, textureY); // Box 231
		tailModel[71] = new ModelRendererTurbo(this, 1289, 41, textureX, textureY); // Box 232
		tailModel[72] = new ModelRendererTurbo(this, 1993, 41, textureX, textureY); // Box 234
		tailModel[73] = new ModelRendererTurbo(this, 1737, 65, textureX, textureY); // Box 235
		tailModel[74] = new ModelRendererTurbo(this, 1073, 81, textureX, textureY); // Box 236
		tailModel[75] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 238
		tailModel[76] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 239
		tailModel[77] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 240

		tailModel[0].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 115
		tailModel[0].setRotationPoint(84F, -71.5F, -1F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 39, 1, 2, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F); // Box 116
		tailModel[1].setRotationPoint(106F, -69.5F, -1F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F,0F, 1.5F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 5F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, -5F); // Box 117
		tailModel[2].setRotationPoint(84F, -70F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3.5F); // Box 118
		tailModel[3].setRotationPoint(84F, -68F, -7F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 119
		tailModel[4].setRotationPoint(84F, -61F, -10.5F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 1F, 1F); // Box 120
		tailModel[5].setRotationPoint(84F, -53F, -11.5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 22, 1, 5, 0F,0F, 0F, 0.5F, 0F, 5F, -1.5F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -5F, -1.5F, 0F, -4F, 0F, 0F, 1F, 0F); // Box 121
		tailModel[6].setRotationPoint(84F, -35F, -5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 22, 1, 5, 0F,0F, -1F, 0F, 0F, 4F, 0F, 0F, 5F, -1.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -5F, -1.5F, 0F, 0F, 0.5F); // Box 123
		tailModel[7].setRotationPoint(84F, -35F, 0F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 39, 1, 3, 0F,0F, 0F, 0.5F, 0F, 13F, -0.5F, 0F, 12F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, -13F, -0.5F, 0F, -12F, 0F, 0F, 1F, 0F); // Box 124
		tailModel[8].setRotationPoint(106F, -40F, -3F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 22, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 1F, 2F); // Box 126
		tailModel[9].setRotationPoint(84F, -47F, -10.5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 22, 6, 1, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -5F, 0F, -6F, 4F, 0F, -1F, 2F); // Box 127
		tailModel[10].setRotationPoint(84F, -40F, -8.5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, -5F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 5F); // Box 128
		tailModel[11].setRotationPoint(84F, -70F, 1F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3.5F); // Box 129
		tailModel[12].setRotationPoint(84F, -68F, 6F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 22, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 130
		tailModel[13].setRotationPoint(84F, -61F, 9.5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 1F, -1F); // Box 131
		tailModel[14].setRotationPoint(84F, -53F, 10.5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 22, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 1F, -2F); // Box 132
		tailModel[15].setRotationPoint(84F, -47F, 9.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 22, 6, 1, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -6F, 4F, 0F, -5F, -5F, 0F, 0F, -3F); // Box 133
		tailModel[16].setRotationPoint(84F, -40F, 7.5F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 39, 1, 5, 0F,0F, 0F, 0F, 0F, -6F, -2F, 0F, -4.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 5F, -3F, 0F, 4.5F, 0F, 0F, -2.5F, 0F); // Box 134
		tailModel[17].setRotationPoint(106F, -67F, -6F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 39, 6, 1, 0F,0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -4F); // Box 135
		tailModel[18].setRotationPoint(106F, -67F, -6F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 39, 6, 1, 0F,0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 4F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 1F, -0.5F); // Box 136
		tailModel[19].setRotationPoint(106F, -61F, -10F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 39, 5, 1, 0F,0F, 0F, 0F, 0F, 2F, -4.5F, 0F, 2F, 4.5F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -6F, -5F, 0F, -6F, 5F, 0F, 1F, 2F); // Box 137
		tailModel[20].setRotationPoint(106F, -54F, -10.5F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 39, 6, 1, 0F,0F, 0F, 0F, 0F, 7F, -3F, 0F, 7F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -11F, -4F, 0F, -12F, 3F, 0F, 0F, 2F); // Box 138
		tailModel[21].setRotationPoint(106F, -48F, -8.5F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 39, 3, 1, 0F,0F, 0F, 0F, 0F, 11F, -2F, 0F, 13F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -13F, -4F, 0F, -14F, 3F, 0F, -1F, 4F); // Box 139
		tailModel[22].setRotationPoint(106F, -42F, -6.5F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 39, 1, 3, 0F,0F, -1F, 0F, 0F, 12F, 0F, 0F, 13F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, -12F, 0F, 0F, -13F, -0.5F, 0F, 0F, 0.5F); // Box 140
		tailModel[23].setRotationPoint(106F, -40F, 0F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 39, 1, 5, 0F,0F, 2.5F, 0F, 0F, -4.5F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 4.5F, 0F, 0F, 5F, -3F, 0F, 0F, 0F); // Box 141
		tailModel[24].setRotationPoint(106F, -67F, 1F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 39, 6, 1, 0F,0F, 0F, 0F, 0F, -6F, 2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 4F); // Box 142
		tailModel[25].setRotationPoint(106F, -67F, 5F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 39, 6, 1, 0F,0F, 0F, 0F, 0F, -3F, 4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 1F, 0.5F); // Box 143
		tailModel[26].setRotationPoint(106F, -61F, 9F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 39, 6, 1, 0F,0F, 0F, 0F, 0F, 7F, 3F, 0F, 7F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -12F, 3F, 0F, -11F, -4F, 0F, 0F, -2F); // Box 144
		tailModel[27].setRotationPoint(106F, -48F, 7.5F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 39, 3, 1, 0F,0F, 0F, 0F, 0F, 13F, 1F, 0F, 11F, -2F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -14F, 3F, 0F, -13F, -4F, 0F, 0F, -3F); // Box 145
		tailModel[28].setRotationPoint(106F, -42F, 5.5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 39, 5, 1, 0F,0F, 0F, 0F, 0F, 2F, 4.5F, 0F, 2F, -4.5F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, -6F, 5F, 0F, -6F, -5F, 0F, 1F, -2F); // Box 146
		tailModel[29].setRotationPoint(106F, -54F, 9.5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		tailModel[30].setRotationPoint(144F, -62.5F, -1F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		tailModel[31].setRotationPoint(144F, -61.5F, -3F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 149
		tailModel[32].setRotationPoint(144F, -58.5F, -5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		tailModel[33].setRotationPoint(144F, -61.5F, 1F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		tailModel[34].setRotationPoint(144F, -58.5F, 3F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 11, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		tailModel[35].setRotationPoint(145F, -59.5F, -2.5F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		tailModel[36].setRotationPoint(145F, -59.5F, -4.5F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		tailModel[37].setRotationPoint(145F, -61.5F, -2.5F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		tailModel[38].setRotationPoint(145F, -61.5F, -4.5F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, -0.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 167
		tailModel[39].setRotationPoint(145F, -62.5F, -2.5F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 171
		tailModel[40].setRotationPoint(145F, -59.5F, -5.5F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 173
		tailModel[41].setRotationPoint(156F, -59.5F, -2.5F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 174
		tailModel[42].setRotationPoint(145F, -54.5F, -4.5F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 175
		tailModel[43].setRotationPoint(145F, -61.5F, 2.5F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -0.75F, -0.75F); // Box 176
		tailModel[44].setRotationPoint(145F, -54.5F, 2.5F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, -0.5F); // Box 177
		tailModel[45].setRotationPoint(145F, -59.5F, 4.5F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, -0.5F, -1F); // Box 178
		tailModel[46].setRotationPoint(145F, -52.5F, -2.5F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.5F, -1F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F); // Box 180
		tailModel[47].setRotationPoint(156F, -60.5F, -2.5F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -1F, -0.5F, 0F, -2F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -3F, 0F, -2F, 2F, 0F, 0F, 0F); // Box 181
		tailModel[48].setRotationPoint(156F, -59.5F, -3.5F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, -1F, -0.5F); // Box 182
		tailModel[49].setRotationPoint(156F, -59.5F, 2.5F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -0.5F, -1F); // Box 183
		tailModel[50].setRotationPoint(156F, -54.5F, -2.5F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 14, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 184
		tailModel[51].setRotationPoint(129F, -50.5F, -5F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 18, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		tailModel[52].setRotationPoint(111F, -50.5F, -5F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 14, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, 0F); // Box 186
		tailModel[53].setRotationPoint(129F, -50.5F, 0F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 18, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		tailModel[54].setRotationPoint(111F, -50.5F, 0F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 3F); // Box 188
		tailModel[55].setRotationPoint(111F, -50.5F, -9F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		tailModel[56].setRotationPoint(111F, -43.5F, -8F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		tailModel[57].setRotationPoint(111F, -51.5F, -9F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 191
		tailModel[58].setRotationPoint(111F, -50.5F, 8F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 192
		tailModel[59].setRotationPoint(111F, -43.5F, 4F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 193
		tailModel[60].setRotationPoint(111F, -51.5F, 5F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 20, 38, 4, 0F,-13F, -10F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -13F, -10F, -2F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -2F); // Box 194
		tailModel[61].setRotationPoint(106F, -101.5F, -2F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 6, 38, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		tailModel[62].setRotationPoint(126F, -101.5F, -2F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 9, 32, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 3F, -5F, 0F, 3F, -5F, 0F, 0F, -5F); // Box 198
		tailModel[63].setRotationPoint(120F, -42.5F, -5F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 14, 32, 4, 0F,5F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 5F, 0F, -2F, -13F, -10F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -13F, -10F, -2F); // Box 199
		tailModel[64].setRotationPoint(106F, -42.5F, -2F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 10, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		tailModel[65].setRotationPoint(-149F, -56.5F, -3.5F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		tailModel[66].setRotationPoint(-149F, -57.5F, -3.5F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 216
		tailModel[67].setRotationPoint(-152F, -56.5F, -3.5F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 57, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, -0.5F, 0F); // Box 228
		tailModel[68].setRotationPoint(116F, -58.5F, -64F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 12, 1, 57, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 229
		tailModel[69].setRotationPoint(119F, -58.5F, -64F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		tailModel[70].setRotationPoint(131F, -58.5F, -65F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		tailModel[71].setRotationPoint(131F, -58.5F, -68F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 234
		tailModel[72].setRotationPoint(125F, -58.5F, -68F);

		tailModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 57, 0F,10F, -0.5F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 10F, -0.5F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 235
		tailModel[73].setRotationPoint(116F, -58.5F, 7F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 12, 1, 57, 0F,10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 236
		tailModel[74].setRotationPoint(119F, -58.5F, 7F);

		tailModel[75].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 238
		tailModel[75].setRotationPoint(131F, -58.5F, 62F);

		tailModel[76].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 239
		tailModel[76].setRotationPoint(131F, -58.5F, 65F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 240
		tailModel[77].setRotationPoint(125F, -58.5F, 65F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1897, 41, textureX, textureY); // Box 110
		leftWingModel[1] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 111
		leftWingModel[2] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 116
		leftWingModel[3] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 117

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 36, 6, 22, 0F,-7F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftWingModel[0].setRotationPoint(-20F, -53F, -155.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 14, 6, 22, 0F,-5F, 0F, 0F, 0F, 1F, 0F, -7F, 0F, 0F, 0F, -2F, 0F, -5F, -4F, 0F, 0F, -3F, 0F, -7F, 0F, 0F, 0F, -2F, 0F); // Box 111
		leftWingModel[1].setRotationPoint(-27F, -53F, -155.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 120, 0F,0F, 0F, 0F, 0F, -2F, 0F, 6F, -12F, 2F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F, 9F, 2F, 0F, 14F, 5F); // Box 116
		leftWingModel[2].setRotationPoint(16F, -50F, -133.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 22, 0F,0F, 0F, 0F, -2F, -1F, -3F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -1F, -3F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 117
		leftWingModel[3].setRotationPoint(16F, -52F, -155.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 196
		yawFlapModel[1] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 197

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 11, 38, 4, 0F,0F, 0F, -2F, -4F, -3F, -2F, -4F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 196
		yawFlapModel[0].setRotationPoint(132F, -101.5F, -2F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 11, 35, 10, 0F,0F, 0F, 0F, 1F, 0F, -5F, 1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, -4F, -5F, -5F, -4F, -5F, -5F, 0F, 0F, -5F); // Box 197
		yawFlapModel[1].setRotationPoint(129F, -42.5F, -5F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 230

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 55, 0F,0F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		pitchFlapLeftModel[0].setRotationPoint(131F, -58.5F, -62F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1281, 81, textureX, textureY); // Box 237

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 55, 0F,0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 237
		pitchFlapRightModel[0].setRotationPoint(131F, -58.5F, 7F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1137, 57, textureX, textureY); // Box 122

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 120, 0F,0F, -9F, 0F, 6F, -12F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 14F, 5F, 6F, 9F, 2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 122
		pitchFlapRightWingModel[0].setRotationPoint(16F, -50F, 13.5F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1161, 81, textureX, textureY); // Box 241
		bodyWheelModel[1] = new ModelRendererTurbo(this, 1593, 81, textureX, textureY); // Box 242
		bodyWheelModel[2] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 276
		bodyWheelModel[3] = new ModelRendererTurbo(this, 1033, 81, textureX, textureY); // Box 278
		bodyWheelModel[4] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 279
		bodyWheelModel[5] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 280
		bodyWheelModel[6] = new ModelRendererTurbo(this, 1905, 41, textureX, textureY); // Box 281
		bodyWheelModel[7] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 282
		bodyWheelModel[8] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 283
		bodyWheelModel[9] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 284
		bodyWheelModel[10] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 285
		bodyWheelModel[11] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 286
		bodyWheelModel[12] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 287
		bodyWheelModel[13] = new ModelRendererTurbo(this, 1833, 9, textureX, textureY); // Box 288
		bodyWheelModel[14] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 289

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 43, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 5F, 1F, 0F, 5F, -1F, 0F, 0F, -1F); // Box 241
		bodyWheelModel[0].setRotationPoint(-102F, -40F, -6F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 43, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 5F, -1F, 0F, 5F, 1F, 0F, 0F, 1F); // Box 242
		bodyWheelModel[1].setRotationPoint(-102F, -40F, 5F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 34, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 276
		bodyWheelModel[2].setRotationPoint(-96F, -39F, -0.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 3, 34, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 278
		bodyWheelModel[3].setRotationPoint(-96F, -39F, -1.5F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 34, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, 7F, 0F, 0F); // Box 279
		bodyWheelModel[4].setRotationPoint(-96F, -39F, 0.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyWheelModel[5].setRotationPoint(-104F, -5F, -5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyWheelModel[6].setRotationPoint(-104F, -4F, -5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyWheelModel[7].setRotationPoint(-104F, -4F, 4F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyWheelModel[8].setRotationPoint(-106.5F, 1F, -3F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyWheelModel[9].setRotationPoint(-106.5F, 0F, -3F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 285
		bodyWheelModel[10].setRotationPoint(-108.5F, 1F, -3F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 286
		bodyWheelModel[11].setRotationPoint(-98.5F, 1F, -3F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 287
		bodyWheelModel[12].setRotationPoint(-106.5F, 9F, -3F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyWheelModel[13].setRotationPoint(-103F, 5F, -4F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyWheelModel[14].setRotationPoint(-103F, 5F, 3F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 252
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1505, 81, textureX, textureY); // Box 253
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1545, 81, textureX, textureY); // Box 254
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1689, 81, textureX, textureY); // Box 255
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1729, 81, textureX, textureY); // Box 256
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1665, 25, textureX, textureY); // Box 257
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1361, 89, textureX, textureY); // Box 267
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1721, 89, textureX, textureY); // Box 268
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 1105, 89, textureX, textureY); // Box 269
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 1673, 89, textureX, textureY); // Box 270
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 1889, 89, textureX, textureY); // Box 271
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 1937, 89, textureX, textureY); // Box 272
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 1977, 89, textureX, textureY); // Box 273
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 274
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 275

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 12F, 0F, -2F, 12F, 0F, 0F, -14F, 0F, 0F, -14F); // Box 252
		leftWingWheelModel[0].setRotationPoint(-16F, -40F, -53F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 253
		leftWingWheelModel[1].setRotationPoint(-22F, -40F, -66F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 254
		leftWingWheelModel[2].setRotationPoint(-24F, -32F, -66F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 15, 12, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, -2F, 4F, 0F, -2F); // Box 255
		leftWingWheelModel[3].setRotationPoint(-22F, -15F, -67F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 23, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		leftWingWheelModel[4].setRotationPoint(-26F, -3F, -68F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		leftWingWheelModel[5].setRotationPoint(-16F, -1F, -67F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 14, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		leftWingWheelModel[6].setRotationPoint(-22F, -7F, -65F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		leftWingWheelModel[7].setRotationPoint(-22F, -9F, -65F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 14, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 269
		leftWingWheelModel[8].setRotationPoint(-24F, -7F, -65F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 14, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 270
		leftWingWheelModel[9].setRotationPoint(-8F, -7F, -65F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 271
		leftWingWheelModel[10].setRotationPoint(-22F, 7F, -65F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		leftWingWheelModel[11].setRotationPoint(-19F, -10F, -65F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 273
		leftWingWheelModel[12].setRotationPoint(-19F, 9F, -65F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 9, 0F,-0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F); // Box 274
		leftWingWheelModel[13].setRotationPoint(-25F, -4F, -65F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 9, 0F,0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F); // Box 275
		leftWingWheelModel[14].setRotationPoint(-6F, -4F, -65F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 2033, 65, textureX, textureY); // Box 243
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 246
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 247
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 1073, 81, textureX, textureY); // Box 248
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 1281, 81, textureX, textureY); // Box 249
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1577, 9, textureX, textureY); // Box 251
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Box 258
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1849, 81, textureX, textureY); // Box 259
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 260
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 1769, 81, textureX, textureY); // Box 261
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 262
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 263
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 1281, 89, textureX, textureY); // Box 264
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 1649, 49, textureX, textureY); // Box 265
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 266

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, -2F, 12F, 0F, -2F, 12F); // Box 243
		rightWingWheelModel[0].setRotationPoint(-16F, -40F, 51F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 246
		rightWingWheelModel[1].setRotationPoint(-22F, -40F, 65F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 247
		rightWingWheelModel[2].setRotationPoint(-24F, -32F, 65F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 15, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 1F, 4F, 0F, 1F); // Box 248
		rightWingWheelModel[3].setRotationPoint(-22F, -15F, 65F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 23, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightWingWheelModel[4].setRotationPoint(-26F, -3F, 67F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		rightWingWheelModel[5].setRotationPoint(-16F, -1F, 65F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 14, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightWingWheelModel[6].setRotationPoint(-22F, -7F, 56F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightWingWheelModel[7].setRotationPoint(-22F, -9F, 56F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 14, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 260
		rightWingWheelModel[8].setRotationPoint(-24F, -7F, 56F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 14, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 261
		rightWingWheelModel[9].setRotationPoint(-8F, -7F, 56F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 262
		rightWingWheelModel[10].setRotationPoint(-22F, 7F, 56F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,-2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		rightWingWheelModel[11].setRotationPoint(-19F, -10F, 56F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 264
		rightWingWheelModel[12].setRotationPoint(-19F, 9F, 56F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 9, 0F,-0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F); // Box 265
		rightWingWheelModel[13].setRotationPoint(-25F, -4F, 56F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 9, 0F,0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F); // Box 266
		rightWingWheelModel[14].setRotationPoint(-6F, -4F, 56F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-143F, -53F, 0F);
		propellerModels[1] = makeProp2(148F, -58F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[0].addBox(-0.5F, -49F, -2F, 1, 49, 4, 0.0F);
		prop[1].addBox(-0.5F, -49F, -2F, 1, 49, 4, 0.0F);
		prop[2].addBox(-0.5F, -49F, -2F, 1, 49, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
		prop[0].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[1].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[2].addBox(-0.5F, -46F, -2F, 1, 46, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 3.14159265F;
		prop[1].rotateAngleY = 3.14159265F;
		prop[2].rotateAngleY = 3.14159265F;
		return prop;
	}
}