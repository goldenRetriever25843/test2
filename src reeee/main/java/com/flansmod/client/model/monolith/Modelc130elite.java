//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.05.2016 - 19:47:28
// Last changed on: 09.05.2016 - 19:47:28

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelc130elite extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public Modelc130elite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[455];
		tailModel = new ModelRendererTurbo[112];
		leftWingModel = new ModelRendererTurbo[124];
		rightWingModel = new ModelRendererTurbo[114];
		bodyWheelModel = new ModelRendererTurbo[83];
		tailDoorOpenModel = new ModelRendererTurbo[14];
		tailDoorCloseModel = new ModelRendererTurbo[12];
		planeModeParts = new ModelRendererTurbo[54];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
		inittailDoorOpenModel_1();
		inittailDoorCloseModel_1();
		initplaneModeParts_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 252, 1896, textureX, textureY); // Box 93
		bodyModel[1] = new ModelRendererTurbo(this, 275, 1807, textureX, textureY); // Box 92
		bodyModel[2] = new ModelRendererTurbo(this, 154, 1923, textureX, textureY); // Box 90
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 407, 1880, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 539, 1394, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 496, 1802, textureX, textureY); // Box 89
		bodyModel[9] = new ModelRendererTurbo(this, 109, 1895, textureX, textureY); // Box 88
		bodyModel[10] = new ModelRendererTurbo(this, 75, 1837, textureX, textureY); // Box 87
		bodyModel[11] = new ModelRendererTurbo(this, 419, 1878, textureX, textureY); // Box 86
		bodyModel[12] = new ModelRendererTurbo(this, 410, 1934, textureX, textureY); // Box 84
		bodyModel[13] = new ModelRendererTurbo(this, 391, 2023, textureX, textureY); // Box 83
		bodyModel[14] = new ModelRendererTurbo(this, 393, 1991, textureX, textureY); // Box 81
		bodyModel[15] = new ModelRendererTurbo(this, 372, 1959, textureX, textureY); // Box 80
		bodyModel[16] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 8
		bodyModel[17] = new ModelRendererTurbo(this, 3, 1725, textureX, textureY); // Box 8
		bodyModel[18] = new ModelRendererTurbo(this, 106, 1908, textureX, textureY); // Box 8
		bodyModel[19] = new ModelRendererTurbo(this, 49, 1410, textureX, textureY); // Box 8
		bodyModel[20] = new ModelRendererTurbo(this, 153, 2044, textureX, textureY); // Box 79
		bodyModel[21] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 7
		bodyModel[22] = new ModelRendererTurbo(this, 250, 1749, textureX, textureY); // Box 7
		bodyModel[23] = new ModelRendererTurbo(this, 81, 1942, textureX, textureY); // Box 7
		bodyModel[24] = new ModelRendererTurbo(this, 1913, 17, textureX, textureY); // Box 6
		bodyModel[25] = new ModelRendererTurbo(this, 46, 1425, textureX, textureY); // Box 6
		bodyModel[26] = new ModelRendererTurbo(this, 1585, 25, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 42, 1966, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 80, 1741, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 59
		bodyModel[30] = new ModelRendererTurbo(this, 1273, 25, textureX, textureY); // Box 58
		bodyModel[31] = new ModelRendererTurbo(this, 1697, 25, textureX, textureY); // Box 57
		bodyModel[32] = new ModelRendererTurbo(this, 1761, 25, textureX, textureY); // Box 55
		bodyModel[33] = new ModelRendererTurbo(this, 1856, 1278, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 579, 691, textureX, textureY); // Box 53
		bodyModel[35] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 53
		bodyModel[36] = new ModelRendererTurbo(this, 537, 1360, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 441, 1993, textureX, textureY); // Box 5
		bodyModel[39] = new ModelRendererTurbo(this, 432, 1919, textureX, textureY); // Box 5
		bodyModel[40] = new ModelRendererTurbo(this, 197, 1748, textureX, textureY); // Box 5
		bodyModel[41] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Box 5
		bodyModel[42] = new ModelRendererTurbo(this, 136, 1971, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 43, 1435, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 420, 1805, textureX, textureY); // Box 4
		bodyModel[47] = new ModelRendererTurbo(this, 322, 1756, textureX, textureY); // Box 4
		bodyModel[48] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 33
		bodyModel[49] = new ModelRendererTurbo(this, 1393, 49, textureX, textureY); // Box 32
		bodyModel[50] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 31
		bodyModel[51] = new ModelRendererTurbo(this, 494, 1915, textureX, textureY); // Box 3
		bodyModel[52] = new ModelRendererTurbo(this, 349, 1745, textureX, textureY); // Box 3
		bodyModel[53] = new ModelRendererTurbo(this, 342, 1997, textureX, textureY); // Box 3
		bodyModel[54] = new ModelRendererTurbo(this, 544, 1416, textureX, textureY); // Box 3
		bodyModel[55] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 3
		bodyModel[56] = new ModelRendererTurbo(this, 1065, 73, textureX, textureY); // Box 27
		bodyModel[57] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 265
		bodyModel[58] = new ModelRendererTurbo(this, 1489, 65, textureX, textureY); // Box 264
		bodyModel[59] = new ModelRendererTurbo(this, 1825, 65, textureX, textureY); // Box 263
		bodyModel[60] = new ModelRendererTurbo(this, 1849, 65, textureX, textureY); // Box 262
		bodyModel[61] = new ModelRendererTurbo(this, 1873, 65, textureX, textureY); // Box 261
		bodyModel[62] = new ModelRendererTurbo(this, 1953, 65, textureX, textureY); // Box 25
		bodyModel[63] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 24
		bodyModel[64] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 23
		bodyModel[65] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 2
		bodyModel[66] = new ModelRendererTurbo(this, 523, 1372, textureX, textureY); // Box 2
		bodyModel[67] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 2
		bodyModel[68] = new ModelRendererTurbo(this, 431, 1662, textureX, textureY); // Box 2
		bodyModel[69] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 18
		bodyModel[70] = new ModelRendererTurbo(this, 44, 1348, textureX, textureY); // Box 16
		bodyModel[71] = new ModelRendererTurbo(this, 45, 1363, textureX, textureY); // Box 15
		bodyModel[72] = new ModelRendererTurbo(this, 46, 1374, textureX, textureY); // Box 14
		bodyModel[73] = new ModelRendererTurbo(this, 48, 1384, textureX, textureY); // Box 13
		bodyModel[74] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 13
		bodyModel[75] = new ModelRendererTurbo(this, 1385, 17, textureX, textureY); // Box 12
		bodyModel[76] = new ModelRendererTurbo(this, 49, 1392, textureX, textureY); // Box 12
		bodyModel[77] = new ModelRendererTurbo(this, 408, 1951, textureX, textureY); // Box 12
		bodyModel[78] = new ModelRendererTurbo(this, 545, 1376, textureX, textureY); // Box 12
		bodyModel[79] = new ModelRendererTurbo(this, 1409, 17, textureX, textureY); // Box 11
		bodyModel[80] = new ModelRendererTurbo(this, 52, 1399, textureX, textureY); // Box 11
		bodyModel[81] = new ModelRendererTurbo(this, 509, 1835, textureX, textureY); // Box 11
		bodyModel[82] = new ModelRendererTurbo(this, 48, 1417, textureX, textureY); // Box 101
		bodyModel[83] = new ModelRendererTurbo(this, 536, 1321, textureX, textureY); // Box 10
		bodyModel[84] = new ModelRendererTurbo(this, 406, 858, textureX, textureY); // Box 10
		bodyModel[85] = new ModelRendererTurbo(this, 52, 1406, textureX, textureY); // Box 10
		bodyModel[86] = new ModelRendererTurbo(this, 349, 1835, textureX, textureY); // Box 10
		bodyModel[87] = new ModelRendererTurbo(this, 323, 39, textureX, textureY); // Box 1
		bodyModel[88] = new ModelRendererTurbo(this, 538, 1382, textureX, textureY); // Box 1
		bodyModel[89] = new ModelRendererTurbo(this, 1457, 9, textureX, textureY); // Box 1
		bodyModel[90] = new ModelRendererTurbo(this, 693, 974, textureX, textureY); // Box 1
		bodyModel[91] = new ModelRendererTurbo(this, 559, 1403, textureX, textureY); // Box 1
		bodyModel[92] = new ModelRendererTurbo(this, 238, 2006, textureX, textureY); // Box 1
		bodyModel[93] = new ModelRendererTurbo(this, 290, 1818, textureX, textureY); // Box 1
		bodyModel[94] = new ModelRendererTurbo(this, 1521, 161, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 546, 1376, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 468, 788, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 1454, 57, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 203, 832, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 298, 1903, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 40, 1433, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 151, 1821, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 1662, 1942, textureX, textureY); // Box 368
		bodyModel[105] = new ModelRendererTurbo(this, 753, 241, textureX, textureY); // Box 370
		bodyModel[106] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 371
		bodyModel[107] = new ModelRendererTurbo(this, 1697, 81, textureX, textureY); // Box 372
		bodyModel[108] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 373
		bodyModel[109] = new ModelRendererTurbo(this, 1841, 129, textureX, textureY); // Box 374
		bodyModel[110] = new ModelRendererTurbo(this, 1913, 65, textureX, textureY); // Box 375
		bodyModel[111] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 376
		bodyModel[112] = new ModelRendererTurbo(this, 1001, 201, textureX, textureY); // Box 1
		bodyModel[113] = new ModelRendererTurbo(this, 765, 1371, textureX, textureY); // Box 2
		bodyModel[114] = new ModelRendererTurbo(this, 1521, 177, textureX, textureY); // Box 3
		bodyModel[115] = new ModelRendererTurbo(this, 1001, 169, textureX, textureY); // Box 176
		bodyModel[116] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 177
		bodyModel[117] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 178
		bodyModel[118] = new ModelRendererTurbo(this, 1337, 249, textureX, textureY); // Box 179
		bodyModel[119] = new ModelRendererTurbo(this, 601, 153, textureX, textureY); // Box 180
		bodyModel[120] = new ModelRendererTurbo(this, 1489, 265, textureX, textureY); // Box 181
		bodyModel[121] = new ModelRendererTurbo(this, 1417, 153, textureX, textureY); // Box 182
		bodyModel[122] = new ModelRendererTurbo(this, 1417, 137, textureX, textureY); // Box 183
		bodyModel[123] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 184
		bodyModel[124] = new ModelRendererTurbo(this, 1825, 265, textureX, textureY); // Box 185
		bodyModel[125] = new ModelRendererTurbo(this, 1097, 177, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 449, 154, textureX, textureY); // Box 1
		bodyModel[127] = new ModelRendererTurbo(this, 1385, 270, textureX, textureY); // Box 2
		bodyModel[128] = new ModelRendererTurbo(this, 1670, 1703, textureX, textureY); // Box 3
		bodyModel[129] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 4
		bodyModel[130] = new ModelRendererTurbo(this, 1705, 185, textureX, textureY); // Box 5
		bodyModel[131] = new ModelRendererTurbo(this, 1865, 201, textureX, textureY); // Box 6
		bodyModel[132] = new ModelRendererTurbo(this, 1777, 177, textureX, textureY); // Box 7
		bodyModel[133] = new ModelRendererTurbo(this, 1489, 145, textureX, textureY); // Box 8
		bodyModel[134] = new ModelRendererTurbo(this, 1033, 153, textureX, textureY); // Box 9
		bodyModel[135] = new ModelRendererTurbo(this, 609, 248, textureX, textureY); // Box 10
		bodyModel[136] = new ModelRendererTurbo(this, 449, 307, textureX, textureY); // Box 11
		bodyModel[137] = new ModelRendererTurbo(this, 1313, 169, textureX, textureY); // Box 12
		bodyModel[138] = new ModelRendererTurbo(this, 569, 209, textureX, textureY); // Box 14
		bodyModel[139] = new ModelRendererTurbo(this, 1033, 225, textureX, textureY); // Box 16
		bodyModel[140] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); // Box 17
		bodyModel[141] = new ModelRendererTurbo(this, 841, 185, textureX, textureY); // Box 192
		bodyModel[142] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 193
		bodyModel[143] = new ModelRendererTurbo(this, 1929, 97, textureX, textureY); // Box 194
		bodyModel[144] = new ModelRendererTurbo(this, 681, 209, textureX, textureY); // Box 195
		bodyModel[145] = new ModelRendererTurbo(this, 1121, 201, textureX, textureY); // Box 196
		bodyModel[146] = new ModelRendererTurbo(this, 753, 209, textureX, textureY); // Box 197
		bodyModel[147] = new ModelRendererTurbo(this, 1361, 201, textureX, textureY); // Box 198
		bodyModel[148] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 199
		bodyModel[149] = new ModelRendererTurbo(this, 1385, 201, textureX, textureY); // Box 200
		bodyModel[150] = new ModelRendererTurbo(this, 1361, 225, textureX, textureY); // Box 202
		bodyModel[151] = new ModelRendererTurbo(this, 1521, 225, textureX, textureY); // Box 203
		bodyModel[152] = new ModelRendererTurbo(this, 457, 257, textureX, textureY); // Box 204
		bodyModel[153] = new ModelRendererTurbo(this, 1921, 233, textureX, textureY); // Box 205
		bodyModel[154] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 206
		bodyModel[155] = new ModelRendererTurbo(this, 1537, 9, textureX, textureY); // Box 207
		bodyModel[156] = new ModelRendererTurbo(this, 2041, 25, textureX, textureY); // Box 208
		bodyModel[157] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 209
		bodyModel[158] = new ModelRendererTurbo(this, 2041, 9, textureX, textureY); // Box 210
		bodyModel[159] = new ModelRendererTurbo(this, 1449, 185, textureX, textureY); // Box 211
		bodyModel[160] = new ModelRendererTurbo(this, 1937, 265, textureX, textureY); // Box 212
		bodyModel[161] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 213
		bodyModel[162] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Box 214
		bodyModel[163] = new ModelRendererTurbo(this, 468, 1879, textureX, textureY); // Box 384
		bodyModel[164] = new ModelRendererTurbo(this, 250, 1838, textureX, textureY); // Box 385
		bodyModel[165] = new ModelRendererTurbo(this, 299, 1929, textureX, textureY); // Box 386
		bodyModel[166] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 387
		bodyModel[167] = new ModelRendererTurbo(this, 247, 1877, textureX, textureY); // Box 388
		bodyModel[168] = new ModelRendererTurbo(this, 544, 1261, textureX, textureY); // Box 389
		bodyModel[169] = new ModelRendererTurbo(this, 541, 1254, textureX, textureY); // Box 390
		bodyModel[170] = new ModelRendererTurbo(this, 801, 209, textureX, textureY); // Box 391
		bodyModel[171] = new ModelRendererTurbo(this, 411, 1881, textureX, textureY); // Box 392
		bodyModel[172] = new ModelRendererTurbo(this, 256, 1971, textureX, textureY); // Box 393
		bodyModel[173] = new ModelRendererTurbo(this, 109, 2006, textureX, textureY); // Box 394
		bodyModel[174] = new ModelRendererTurbo(this, 311, 2007, textureX, textureY); // Box 395
		bodyModel[175] = new ModelRendererTurbo(this, 148, 2011, textureX, textureY); // Box 396
		bodyModel[176] = new ModelRendererTurbo(this, 204, 1918, textureX, textureY); // Box 397
		bodyModel[177] = new ModelRendererTurbo(this, 342, 1903, textureX, textureY); // Box 398
		bodyModel[178] = new ModelRendererTurbo(this, 192, 1848, textureX, textureY); // Box 399
		bodyModel[179] = new ModelRendererTurbo(this, 649, 217, textureX, textureY); // Box 400
		bodyModel[180] = new ModelRendererTurbo(this, 376, 1747, textureX, textureY); // Box 401
		bodyModel[181] = new ModelRendererTurbo(this, 159, 1881, textureX, textureY); // Box 402
		bodyModel[182] = new ModelRendererTurbo(this, 46, 1262, textureX, textureY); // Box 403
		bodyModel[183] = new ModelRendererTurbo(this, 464, 1885, textureX, textureY); // Box 404
		bodyModel[184] = new ModelRendererTurbo(this, 1001, 225, textureX, textureY); // Box 405
		bodyModel[185] = new ModelRendererTurbo(this, 484, 1705, textureX, textureY); // Box 406
		bodyModel[186] = new ModelRendererTurbo(this, 543, 2027, textureX, textureY); // Box 407
		bodyModel[187] = new ModelRendererTurbo(this, 435, 805, textureX, textureY); // Box 408
		bodyModel[188] = new ModelRendererTurbo(this, 42, 1239, textureX, textureY); // Box 409
		bodyModel[189] = new ModelRendererTurbo(this, 540, 1279, textureX, textureY); // Box 410
		bodyModel[190] = new ModelRendererTurbo(this, 322, 1894, textureX, textureY); // Box 411
		bodyModel[191] = new ModelRendererTurbo(this, 153, 1746, textureX, textureY); // Box 412
		bodyModel[192] = new ModelRendererTurbo(this, 1521, 193, textureX, textureY); // Box 413
		bodyModel[193] = new ModelRendererTurbo(this, 690, 1058, textureX, textureY); // Box 414
		bodyModel[194] = new ModelRendererTurbo(this, 17, 231, textureX, textureY); // Box 415
		bodyModel[195] = new ModelRendererTurbo(this, 1985, 259, textureX, textureY); // Box 416
		bodyModel[196] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Box 417
		bodyModel[197] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Box 418
		bodyModel[198] = new ModelRendererTurbo(this, 537, 1297, textureX, textureY); // Box 420
		bodyModel[199] = new ModelRendererTurbo(this, 198, 1896, textureX, textureY); // Box 422
		bodyModel[200] = new ModelRendererTurbo(this, 504, 1975, textureX, textureY); // Box 423
		bodyModel[201] = new ModelRendererTurbo(this, 292, 1754, textureX, textureY); // Box 424
		bodyModel[202] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 425
		bodyModel[203] = new ModelRendererTurbo(this, 283, 1967, textureX, textureY); // Box 426
		bodyModel[204] = new ModelRendererTurbo(this, 1577, 193, textureX, textureY); // Box 427
		bodyModel[205] = new ModelRendererTurbo(this, 41, 1227, textureX, textureY); // Box 428
		bodyModel[206] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 429
		bodyModel[207] = new ModelRendererTurbo(this, 194, 1980, textureX, textureY); // Box 430
		bodyModel[208] = new ModelRendererTurbo(this, 438, 1746, textureX, textureY); // Box 431
		bodyModel[209] = new ModelRendererTurbo(this, 397, 1899, textureX, textureY); // Box 435
		bodyModel[210] = new ModelRendererTurbo(this, 1137, 169, textureX, textureY); // Box 436
		bodyModel[211] = new ModelRendererTurbo(this, 249, 1926, textureX, textureY); // Box 437
		bodyModel[212] = new ModelRendererTurbo(this, 540, 1246, textureX, textureY); // Box 438
		bodyModel[213] = new ModelRendererTurbo(this, 339, 966, textureX, textureY); // Box 439
		bodyModel[214] = new ModelRendererTurbo(this, 1001, 305, textureX, textureY); // Box 440
		bodyModel[215] = new ModelRendererTurbo(this, 2033, 185, textureX, textureY); // Box 441
		bodyModel[216] = new ModelRendererTurbo(this, 1649, 249, textureX, textureY); // Box 442
		bodyModel[217] = new ModelRendererTurbo(this, 897, 273, textureX, textureY); // Box 443
		bodyModel[218] = new ModelRendererTurbo(this, 921, 273, textureX, textureY); // Box 444
		bodyModel[219] = new ModelRendererTurbo(this, 1721, 281, textureX, textureY); // Box 445
		bodyModel[220] = new ModelRendererTurbo(this, 1889, 177, textureX, textureY); // Box 449
		bodyModel[221] = new ModelRendererTurbo(this, 538, 1236, textureX, textureY); // Box 450
		bodyModel[222] = new ModelRendererTurbo(this, 649, 163, textureX, textureY); // Box 451
		bodyModel[223] = new ModelRendererTurbo(this, 523, 783, textureX, textureY); // Box 452
		bodyModel[224] = new ModelRendererTurbo(this, 1873, 281, textureX, textureY); // Box 453
		bodyModel[225] = new ModelRendererTurbo(this, 44, 1336, textureX, textureY); // Box 454
		bodyModel[226] = new ModelRendererTurbo(this, 45, 1325, textureX, textureY); // Box 455
		bodyModel[227] = new ModelRendererTurbo(this, 46, 1313, textureX, textureY); // Box 456
		bodyModel[228] = new ModelRendererTurbo(this, 49, 1302, textureX, textureY); // Box 457
		bodyModel[229] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 458
		bodyModel[230] = new ModelRendererTurbo(this, 2033, 73, textureX, textureY); // Box 459
		bodyModel[231] = new ModelRendererTurbo(this, 52, 1292, textureX, textureY); // Box 460
		bodyModel[232] = new ModelRendererTurbo(this, 208, 1951, textureX, textureY); // Box 461
		bodyModel[233] = new ModelRendererTurbo(this, 544, 1265, textureX, textureY); // Box 462
		bodyModel[234] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 463
		bodyModel[235] = new ModelRendererTurbo(this, 51, 1282, textureX, textureY); // Box 464
		bodyModel[236] = new ModelRendererTurbo(this, 364, 1936, textureX, textureY); // Box 465
		bodyModel[237] = new ModelRendererTurbo(this, 44, 1251, textureX, textureY); // Box 466
		bodyModel[238] = new ModelRendererTurbo(this, 536, 1309, textureX, textureY); // Box 467
		bodyModel[239] = new ModelRendererTurbo(this, 905, 810, textureX, textureY); // Box 468
		bodyModel[240] = new ModelRendererTurbo(this, 49, 1272, textureX, textureY); // Box 469
		bodyModel[241] = new ModelRendererTurbo(this, 468, 2003, textureX, textureY); // Box 470
		bodyModel[242] = new ModelRendererTurbo(this, 1841, 209, textureX, textureY); // Box 471
		bodyModel[243] = new ModelRendererTurbo(this, 538, 1287, textureX, textureY); // Box 472
		bodyModel[244] = new ModelRendererTurbo(this, 1793, 9, textureX, textureY); // Box 473
		bodyModel[245] = new ModelRendererTurbo(this, 1617, 249, textureX, textureY); // Box 474
		bodyModel[246] = new ModelRendererTurbo(this, 537, 1225, textureX, textureY); // Box 475
		bodyModel[247] = new ModelRendererTurbo(this, 311, 1942, textureX, textureY); // Box 476
		bodyModel[248] = new ModelRendererTurbo(this, 433, 1947, textureX, textureY); // Box 477
		bodyModel[249] = new ModelRendererTurbo(this, 536, 1213, textureX, textureY); // Box 478
		bodyModel[250] = new ModelRendererTurbo(this, 541, 1272, textureX, textureY); // Box 479
		bodyModel[251] = new ModelRendererTurbo(this, 625, 297, textureX, textureY); // Box 480
		bodyModel[252] = new ModelRendererTurbo(this, 1001, 241, textureX, textureY); // Box 481
		bodyModel[253] = new ModelRendererTurbo(this, 1073, 225, textureX, textureY); // Box 482
		bodyModel[254] = new ModelRendererTurbo(this, 1049, 210, textureX, textureY); // Box 483
		bodyModel[255] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 484
		bodyModel[256] = new ModelRendererTurbo(this, 361, 1831, textureX, textureY); // Box 485
		bodyModel[257] = new ModelRendererTurbo(this, 40, 1215, textureX, textureY); // Box 486
		bodyModel[258] = new ModelRendererTurbo(this, 44, 1951, textureX, textureY); // Box 487
		bodyModel[259] = new ModelRendererTurbo(this, 1649, 1949, textureX, textureY); // Box 488
		bodyModel[260] = new ModelRendererTurbo(this, 1809, 297, textureX, textureY); // Box 489
		bodyModel[261] = new ModelRendererTurbo(this, 1561, 297, textureX, textureY); // Box 490
		bodyModel[262] = new ModelRendererTurbo(this, 1185, 233, textureX, textureY); // Box 491
		bodyModel[263] = new ModelRendererTurbo(this, 545, 281, textureX, textureY); // Box 492
		bodyModel[264] = new ModelRendererTurbo(this, 1585, 225, textureX, textureY); // Box 493
		bodyModel[265] = new ModelRendererTurbo(this, 1801, 153, textureX, textureY); // Box 494
		bodyModel[266] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 495
		bodyModel[267] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 498
		bodyModel[268] = new ModelRendererTurbo(this, 1450, 1689, textureX, textureY); // Box 499
		bodyModel[269] = new ModelRendererTurbo(this, 561, 313, textureX, textureY); // Box 500
		bodyModel[270] = new ModelRendererTurbo(this, 1753, 305, textureX, textureY); // Box 501
		bodyModel[271] = new ModelRendererTurbo(this, 657, 313, textureX, textureY); // Box 502
		bodyModel[272] = new ModelRendererTurbo(this, 1569, 313, textureX, textureY); // Box 503
		bodyModel[273] = new ModelRendererTurbo(this, 1793, 313, textureX, textureY); // Box 504
		bodyModel[274] = new ModelRendererTurbo(this, 1889, 313, textureX, textureY); // Box 505
		bodyModel[275] = new ModelRendererTurbo(this, 1865, 321, textureX, textureY); // Box 506
		bodyModel[276] = new ModelRendererTurbo(this, 1073, 277, textureX, textureY); // Box 507
		bodyModel[277] = new ModelRendererTurbo(this, 1483, 271, textureX, textureY); // Box 508
		bodyModel[278] = new ModelRendererTurbo(this, 1225, 233, textureX, textureY); // Box 509
		bodyModel[279] = new ModelRendererTurbo(this, 449, 321, textureX, textureY); // Box 510
		bodyModel[280] = new ModelRendererTurbo(this, 1617, 313, textureX, textureY); // Box 511
		bodyModel[281] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 512
		bodyModel[282] = new ModelRendererTurbo(this, 1569, 329, textureX, textureY); // Box 513
		bodyModel[283] = new ModelRendererTurbo(this, 1729, 329, textureX, textureY); // Box 514
		bodyModel[284] = new ModelRendererTurbo(this, 1737, 281, textureX, textureY); // Box 515
		bodyModel[285] = new ModelRendererTurbo(this, 2001, 321, textureX, textureY); // Box 516
		bodyModel[286] = new ModelRendererTurbo(this, 1625, 329, textureX, textureY); // Box 517
		bodyModel[287] = new ModelRendererTurbo(this, 2009, 281, textureX, textureY); // Box 518
		bodyModel[288] = new ModelRendererTurbo(this, 1649, 225, textureX, textureY); // Box 519
		bodyModel[289] = new ModelRendererTurbo(this, 449, 301, textureX, textureY); // Box 520
		bodyModel[290] = new ModelRendererTurbo(this, 1793, 329, textureX, textureY); // Box 521
		bodyModel[291] = new ModelRendererTurbo(this, 1817, 329, textureX, textureY); // Box 522
		bodyModel[292] = new ModelRendererTurbo(this, 1961, 285, textureX, textureY); // Box 523
		bodyModel[293] = new ModelRendererTurbo(this, 865, 313, textureX, textureY); // Box 524
		bodyModel[294] = new ModelRendererTurbo(this, 881, 337, textureX, textureY); // Box 525
		bodyModel[295] = new ModelRendererTurbo(this, 1721, 241, textureX, textureY); // Box 526
		bodyModel[296] = new ModelRendererTurbo(this, 505, 264, textureX, textureY); // Box 527
		bodyModel[297] = new ModelRendererTurbo(this, 681, 257, textureX, textureY); // Box 528
		bodyModel[298] = new ModelRendererTurbo(this, 1065, 249, textureX, textureY); // Box 529
		bodyModel[299] = new ModelRendererTurbo(this, 1625, 265, textureX, textureY); // Box 530
		bodyModel[300] = new ModelRendererTurbo(this, 1721, 257, textureX, textureY); // Box 531
		bodyModel[301] = new ModelRendererTurbo(this, 873, 273, textureX, textureY); // Box 532
		bodyModel[302] = new ModelRendererTurbo(this, 681, 273, textureX, textureY); // Box 533
		bodyModel[303] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 534
		bodyModel[304] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 535
		bodyModel[305] = new ModelRendererTurbo(this, 1881, 345, textureX, textureY); // Box 536
		bodyModel[306] = new ModelRendererTurbo(this, 1921, 345, textureX, textureY); // Box 537
		bodyModel[307] = new ModelRendererTurbo(this, 1937, 345, textureX, textureY); // Box 538
		bodyModel[308] = new ModelRendererTurbo(this, 1985, 345, textureX, textureY); // Box 539
		bodyModel[309] = new ModelRendererTurbo(this, 1609, 361, textureX, textureY); // Box 540
		bodyModel[310] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 541
		bodyModel[311] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 542
		bodyModel[312] = new ModelRendererTurbo(this, 1617, 97, textureX, textureY); // Box 543
		bodyModel[313] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 544
		bodyModel[314] = new ModelRendererTurbo(this, 2001, 337, textureX, textureY); // Box 545
		bodyModel[315] = new ModelRendererTurbo(this, 1081, 698, textureX, textureY); // Box 546
		bodyModel[316] = new ModelRendererTurbo(this, 753, 321, textureX, textureY); // Box 547
		bodyModel[317] = new ModelRendererTurbo(this, 879, 686, textureX, textureY); // Box 548
		bodyModel[318] = new ModelRendererTurbo(this, 930, 1973, textureX, textureY); // Box 932
		bodyModel[319] = new ModelRendererTurbo(this, 685, 2000, textureX, textureY); // Box 934
		bodyModel[320] = new ModelRendererTurbo(this, 583, 1998, textureX, textureY); // Box 935
		bodyModel[321] = new ModelRendererTurbo(this, 898, 2002, textureX, textureY); // Box 936
		bodyModel[322] = new ModelRendererTurbo(this, 1303, 1995, textureX, textureY); // Box 937
		bodyModel[323] = new ModelRendererTurbo(this, 669, 1956, textureX, textureY); // Box 938
		bodyModel[324] = new ModelRendererTurbo(this, 911, 2009, textureX, textureY); // Box 939
		bodyModel[325] = new ModelRendererTurbo(this, 694, 2005, textureX, textureY); // Box 940
		bodyModel[326] = new ModelRendererTurbo(this, 918, 2024, textureX, textureY); // Box 941
		bodyModel[327] = new ModelRendererTurbo(this, 754, 1992, textureX, textureY); // Box 942
		bodyModel[328] = new ModelRendererTurbo(this, 886, 1998, textureX, textureY); // Box 943
		bodyModel[329] = new ModelRendererTurbo(this, 663, 1981, textureX, textureY); // Box 944
		bodyModel[330] = new ModelRendererTurbo(this, 854, 1939, textureX, textureY); // Box 945
		bodyModel[331] = new ModelRendererTurbo(this, 710, 1972, textureX, textureY); // Box 946
		bodyModel[332] = new ModelRendererTurbo(this, 630, 1981, textureX, textureY); // Box 947
		bodyModel[333] = new ModelRendererTurbo(this, 758, 1988, textureX, textureY); // Box 948
		bodyModel[334] = new ModelRendererTurbo(this, 777, 489, textureX, textureY); // Box 971
		bodyModel[335] = new ModelRendererTurbo(this, 113, 497, textureX, textureY); // Box 972
		bodyModel[336] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 973
		bodyModel[337] = new ModelRendererTurbo(this, 1921, 361, textureX, textureY); // Box 974
		bodyModel[338] = new ModelRendererTurbo(this, 889, 449, textureX, textureY); // Box 975
		bodyModel[339] = new ModelRendererTurbo(this, 993, 449, textureX, textureY); // Box 976
		bodyModel[340] = new ModelRendererTurbo(this, 97, 425, textureX, textureY); // Box 977
		bodyModel[341] = new ModelRendererTurbo(this, 1089, 409, textureX, textureY); // Box 978
		bodyModel[342] = new ModelRendererTurbo(this, 689, 465, textureX, textureY); // Box 979
		bodyModel[343] = new ModelRendererTurbo(this, 833, 465, textureX, textureY); // Box 980
		bodyModel[344] = new ModelRendererTurbo(this, 1617, 497, textureX, textureY); // Box 981
		bodyModel[345] = new ModelRendererTurbo(this, 345, 425, textureX, textureY); // Box 982
		bodyModel[346] = new ModelRendererTurbo(this, 1513, 497, textureX, textureY); // Box 983
		bodyModel[347] = new ModelRendererTurbo(this, 1393, 449, textureX, textureY); // Box 984
		bodyModel[348] = new ModelRendererTurbo(this, 369, 409, textureX, textureY); // Box 985
		bodyModel[349] = new ModelRendererTurbo(this, 1193, 457, textureX, textureY); // Box 986
		bodyModel[350] = new ModelRendererTurbo(this, 1857, 161, textureX, textureY); // Box 987
		bodyModel[351] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 988
		bodyModel[352] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 989
		bodyModel[353] = new ModelRendererTurbo(this, 465, 417, textureX, textureY); // Box 990
		bodyModel[354] = new ModelRendererTurbo(this, 929, 361, textureX, textureY); // Box 991
		bodyModel[355] = new ModelRendererTurbo(this, 201, 425, textureX, textureY); // Box 992
		bodyModel[356] = new ModelRendererTurbo(this, 1329, 201, textureX, textureY); // Box 993
		bodyModel[357] = new ModelRendererTurbo(this, 561, 497, textureX, textureY); // Box 994
		bodyModel[358] = new ModelRendererTurbo(this, 1969, 505, textureX, textureY); // Box 995
		bodyModel[359] = new ModelRendererTurbo(this, 537, 449, textureX, textureY); // Box 996
		bodyModel[360] = new ModelRendererTurbo(this, 201, 457, textureX, textureY); // Box 997
		bodyModel[361] = new ModelRendererTurbo(this, 161, 441, textureX, textureY); // Box 998
		bodyModel[362] = new ModelRendererTurbo(this, 1873, 449, textureX, textureY); // Box 999
		bodyModel[363] = new ModelRendererTurbo(this, 137, 513, textureX, textureY); // Box 1000
		bodyModel[364] = new ModelRendererTurbo(this, 489, 481, textureX, textureY); // Box 1001
		bodyModel[365] = new ModelRendererTurbo(this, 1449, 457, textureX, textureY); // Box 1002
		bodyModel[366] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 1003
		bodyModel[367] = new ModelRendererTurbo(this, 1145, 481, textureX, textureY); // Box 1004
		bodyModel[368] = new ModelRendererTurbo(this, 1033, 241, textureX, textureY); // Box 1005
		bodyModel[369] = new ModelRendererTurbo(this, 313, 489, textureX, textureY); // Box 1006
		bodyModel[370] = new ModelRendererTurbo(this, 281, 513, textureX, textureY); // Box 1007
		bodyModel[371] = new ModelRendererTurbo(this, 817, 489, textureX, textureY); // Box 1008
		bodyModel[372] = new ModelRendererTurbo(this, 1721, 489, textureX, textureY); // Box 1009
		bodyModel[373] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 1010
		bodyModel[374] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Box 1011
		bodyModel[375] = new ModelRendererTurbo(this, 1569, 497, textureX, textureY); // Box 1012
		bodyModel[376] = new ModelRendererTurbo(this, 1377, 513, textureX, textureY); // Box 1013
		bodyModel[377] = new ModelRendererTurbo(this, 1417, 521, textureX, textureY); // Box 1014
		bodyModel[378] = new ModelRendererTurbo(this, 1145, 505, textureX, textureY); // Box 1015
		bodyModel[379] = new ModelRendererTurbo(this, 1801, 257, textureX, textureY); // Box 1016
		bodyModel[380] = new ModelRendererTurbo(this, 1865, 257, textureX, textureY); // Box 1017
		bodyModel[381] = new ModelRendererTurbo(this, 65, 529, textureX, textureY); // Box 1018
		bodyModel[382] = new ModelRendererTurbo(this, 1297, 569, textureX, textureY); // Box 1019
		bodyModel[383] = new ModelRendererTurbo(this, 1113, 545, textureX, textureY); // Box 1020
		bodyModel[384] = new ModelRendererTurbo(this, 425, 553, textureX, textureY); // Box 1021
		bodyModel[385] = new ModelRendererTurbo(this, 1969, 529, textureX, textureY); // Box 1022
		bodyModel[386] = new ModelRendererTurbo(this, 1617, 433, textureX, textureY); // Box 1023
		bodyModel[387] = new ModelRendererTurbo(this, 1601, 225, textureX, textureY); // Box 1024
		bodyModel[388] = new ModelRendererTurbo(this, 1840, 1598, textureX, textureY); // Box 1025
		bodyModel[389] = new ModelRendererTurbo(this, 113, 537, textureX, textureY); // Box 1026
		bodyModel[390] = new ModelRendererTurbo(this, 1857, 41, textureX, textureY); // Box 1029
		bodyModel[391] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 1030
		bodyModel[392] = new ModelRendererTurbo(this, 1577, 9, textureX, textureY); // Box 1031
		bodyModel[393] = new ModelRendererTurbo(this, 1649, 25, textureX, textureY); // Box 1032
		bodyModel[394] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 1033
		bodyModel[395] = new ModelRendererTurbo(this, 1417, 33, textureX, textureY); // Box 1034
		bodyModel[396] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1035
		bodyModel[397] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 1036
		bodyModel[398] = new ModelRendererTurbo(this, 1921, 225, textureX, textureY); // Box 1037
		bodyModel[399] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 1038
		bodyModel[400] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 1039
		bodyModel[401] = new ModelRendererTurbo(this, 1401, 49, textureX, textureY); // Box 1040
		bodyModel[402] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Box 1041
		bodyModel[403] = new ModelRendererTurbo(this, 1697, 49, textureX, textureY); // Box 1042
		bodyModel[404] = new ModelRendererTurbo(this, 1369, 537, textureX, textureY); // Box 1043
		bodyModel[405] = new ModelRendererTurbo(this, 1697, 497, textureX, textureY); // Box 1044
		bodyModel[406] = new ModelRendererTurbo(this, 1881, 505, textureX, textureY); // Box 1045
		bodyModel[407] = new ModelRendererTurbo(this, 1081, 9, textureX, textureY); // Box 1046
		bodyModel[408] = new ModelRendererTurbo(this, 1689, 529, textureX, textureY); // Box 1045
		bodyModel[409] = new ModelRendererTurbo(this, 289, 537, textureX, textureY); // Box 1046
		bodyModel[410] = new ModelRendererTurbo(this, 1425, 537, textureX, textureY); // Box 1047
		bodyModel[411] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 1048
		bodyModel[412] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 1049
		bodyModel[413] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 1050
		bodyModel[414] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 1051
		bodyModel[415] = new ModelRendererTurbo(this, 1513, 537, textureX, textureY); // Box 1052
		bodyModel[416] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 1053
		bodyModel[417] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 1054
		bodyModel[418] = new ModelRendererTurbo(this, 1569, 537, textureX, textureY); // Box 1055
		bodyModel[419] = new ModelRendererTurbo(this, 1977, 81, textureX, textureY); // Box 1056
		bodyModel[420] = new ModelRendererTurbo(this, 465, 553, textureX, textureY); // Box 1057
		bodyModel[421] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 1058
		bodyModel[422] = new ModelRendererTurbo(this, 521, 553, textureX, textureY); // Box 1059
		bodyModel[423] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 1060
		bodyModel[424] = new ModelRendererTurbo(this, 1693, 1873, textureX, textureY); // Box 1061
		bodyModel[425] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 1062
		bodyModel[426] = new ModelRendererTurbo(this, 1734, 1865, textureX, textureY); // Box 1063
		bodyModel[427] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 1064
		bodyModel[428] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 1067
		bodyModel[429] = new ModelRendererTurbo(this, 473, 569, textureX, textureY); // Box 1068
		bodyModel[430] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Box 1069
		bodyModel[431] = new ModelRendererTurbo(this, 529, 569, textureX, textureY); // Box 1070
		bodyModel[432] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 1071
		bodyModel[433] = new ModelRendererTurbo(this, 657, 569, textureX, textureY); // Box 1072
		bodyModel[434] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 1073
		bodyModel[435] = new ModelRendererTurbo(this, 713, 569, textureX, textureY); // Box 1074
		bodyModel[436] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 1075
		bodyModel[437] = new ModelRendererTurbo(this, 881, 569, textureX, textureY); // Box 1076
		bodyModel[438] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 1077
		bodyModel[439] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 1078
		bodyModel[440] = new ModelRendererTurbo(this, 961, 569, textureX, textureY); // Box 1079
		bodyModel[441] = new ModelRendererTurbo(this, 1609, 129, textureX, textureY); // Box 1080
		bodyModel[442] = new ModelRendererTurbo(this, 1385, 569, textureX, textureY); // Box 1081
		bodyModel[443] = new ModelRendererTurbo(this, 1777, 129, textureX, textureY); // Box 1082
		bodyModel[444] = new ModelRendererTurbo(this, 1553, 569, textureX, textureY); // Box 1083
		bodyModel[445] = new ModelRendererTurbo(this, 1793, 129, textureX, textureY); // Box 1084
		bodyModel[446] = new ModelRendererTurbo(this, 1969, 569, textureX, textureY); // Box 1085
		bodyModel[447] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 1086
		bodyModel[448] = new ModelRendererTurbo(this, 1939, 1866, textureX, textureY); // Box 1090
		bodyModel[449] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 1091
		bodyModel[450] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 1092
		bodyModel[451] = new ModelRendererTurbo(this, 1838, 1866, textureX, textureY); // Box 960
		bodyModel[452] = new ModelRendererTurbo(this, 1469, 1865, textureX, textureY); // Box 961
		bodyModel[453] = new ModelRendererTurbo(this, 442, 1452, textureX, textureY); // Box 962
		bodyModel[454] = new ModelRendererTurbo(this, 1240, 1452, textureX, textureY); // Box 963

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -5F, -1F, -1F, 4F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -5F); // Box 93
		bodyModel[0].setRotationPoint(-218F, -28F, 11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, -1F, 5F, 0F, -1F, 1F, 0F, -1.5F, -1.5F, 0F, -1F, -6F, -1F, -1F, 5F, 0F, -0.5F, 1.5F, 0F, 0.5F, -2F, 0F, -1F, -6F); // Box 92
		bodyModel[1].setRotationPoint(-218F, -29F, 12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-1F, -4F, 7F, 0F, -2.5F, 4.5F, 0F, -1F, -5.5F, 0F, -4F, -8F, -1F, -1F, 7F, 0F, -0.5F, 3F, 0F, -0.5F, -3.5F, 0F, -1F, -8F); // Box 90
		bodyModel[2].setRotationPoint(-218F, -37F, 14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1.75F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.5F, 0F, 3F, 0F, -1F, 4F, -2F, -1F, 4F, 2F, 0F, 3F, 0F); // Box 9
		bodyModel[3].setRotationPoint(-196F, -43F, 18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -6F, 0F, 0F, -3.5F, 0F, 0F, -5F, -0.5F, 0F, -8F, -1.5F, 0F, 5.5F, 0F, 0F, 3F, 0F, 0F, 4.5F, -0.5F, 0F, 7.5F, -1.5F); // Box 9
		bodyModel[4].setRotationPoint(-214F, -44F, 5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -5F, 0F, -1F, 6F, 0F, -4F, 2F, 0F, 4F, -3F, 0F, 4F, -6F); // Box 9
		bodyModel[5].setRotationPoint(-164F, -45F, 38F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 27, 3, 4, 0F,0F, -3F, 3F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -5F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 7F, -6F); // Box 9
		bodyModel[6].setRotationPoint(-164F, -53F, 34F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F, -1F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 2F, -1F); // Box 9
		bodyModel[7].setRotationPoint(-188F, -60F, 5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-1F, 0F, 7F, 0F, -0.5F, 3.5F, 0F, -1.5F, -4F, 0F, 0F, -8F, -1F, -5F, 7F, 0F, -3.5F, 4.5F, 0F, -1.5F, -5.5F, 0F, -5F, -8F); // Box 89
		bodyModel[8].setRotationPoint(-218F, -28F, 14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, 0.5F, 5F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0.5F, 0.5F, -6F, -1F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -6F); // Box 88
		bodyModel[9].setRotationPoint(-218F, -30F, 12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 5F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0F, 0F, -6F, 0F, -0.5F, 5.5F, 0F, 0.5F, 1F, 0F, 0.5F, -1.5F, 0.5F, -0.5F, -6F); // Box 87
		bodyModel[10].setRotationPoint(-218F, -33F, 12F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -3F, 3.5F, -3F, 0F, 2.5F, 0F, -2.5F, 0F, 0F, -3F, -4.5F, 0F, 1.5F, 3.5F, -3F, -1.5F, 2.5F, 0F, -0.5F, 0F, 0F, 1.5F, -4.5F); // Box 86
		bodyModel[11].setRotationPoint(-214F, -39F, 13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,2.1F, -1.5F, 9.4F, -6.4F, 2.5F, 10F, -6.4F, 3F, -11F, 2.1F, 0F, -10.5F, -1F, -0.5F, 7F, -2.2F, -0.4F, 2.2F, -2.1F, -0.4F, -2.1F, -1F, -0.5F, -7F); // Box 84
		bodyModel[12].setRotationPoint(-206F, -39F, 20F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -1.5F, 3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -4.5F, 0F, 0.5F, 2F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0.5F, -2.5F); // Box 83
		bodyModel[13].setRotationPoint(-214F, -36F, 13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,-1F, -0.5F, 7F, -2.1F, -0.6F, 2.2F, -2.1F, -0.6F, -2.2F, -1F, -0.5F, -7F, -1F, 1F, 5.5F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, -5.5F); // Box 81
		bodyModel[14].setRotationPoint(-206F, -37F, 20F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.5F, 5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -5.5F, 0F, 0.5F, 5F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, -5.5F); // Box 80
		bodyModel[15].setRotationPoint(-214F, -33F, 16F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 8
		bodyModel[16].setRotationPoint(-185F, -62F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -0.5F); // Box 8
		bodyModel[17].setRotationPoint(-194F, -13F, 5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,1.5F, -6F, 0F, 0F, -1F, 0F, 0F, -3F, 0.5F, 1F, -6F, -2F, 0.5F, 4F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0.5F, 0F, 4F, -2F); // Box 8
		bodyModel[18].setRotationPoint(-217F, -39F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 208, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 8
		bodyModel[19].setRotationPoint(-137F, -53F, 34F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 6.5F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -6.5F, 0F, 0.5F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -6F); // Box 79
		bodyModel[20].setRotationPoint(-205F, -33F, 21F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, -1F); // Box 7
		bodyModel[21].setRotationPoint(-182F, -63F, 5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 3F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, -4F, 4.5F, 0F, -3F, 4F, 0F, -1F, -5F, 0F, -2F, -5.5F); // Box 7
		bodyModel[22].setRotationPoint(-194F, -18F, 18F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 7
		bodyModel[23].setRotationPoint(-219F, -33F, 5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 6
		bodyModel[24].setRotationPoint(-179F, -65F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 208, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 6
		bodyModel[25].setRotationPoint(-137F, -65F, 22F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, 1F, 3F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, -5F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, -4F); // Box 6
		bodyModel[26].setRotationPoint(-164F, -17F, 29F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[27].setRotationPoint(-219F, -30F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 1F, 2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 3.5F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, -2F, -3.5F); // Box 6
		bodyModel[28].setRotationPoint(-194F, -23F, 21F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F,-2F, -2F, 10F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, -10F, -2F, -1F, 11F, 0F, -1F, 1F, 0F, 4F, -1F, 0F, 5F, -11F); // Box 59
		bodyModel[29].setRotationPoint(-189F, -45F, 33F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 3F, 10F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, -10F, 0F, -2F, 10F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, -2F, -10F); // Box 58
		bodyModel[30].setRotationPoint(-189F, -34F, 33F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 6F, 6F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, 7F, -10F, 0F, -8F, 5F, 0F, -2F, -1F, 0F, -8F, 0F, 0F, -10F, -9F); // Box 57
		bodyModel[31].setRotationPoint(-189F, -23F, 29F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 25, 3, 5, 0F,0F, 5F, 5F, 0F, -1F, 0F, 0F, 4F, -2F, 0F, 10F, -8F, 0F, -7F, 4F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -12F, -7F); // Box 55
		bodyModel[32].setRotationPoint(-189F, -19F, 26F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 25, 3, 7, 0F,0F, 5F, 4F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 10F, -8F, 0F, -7F, 3F, 0F, -1F, 0F, 0F, -5F, -3F, 0F, -12F, -7F); // Box 54
		bodyModel[33].setRotationPoint(-189F, -14F, 22F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 25, 3, 8, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 9F, -4F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -11F, -3F); // Box 53
		bodyModel[34].setRotationPoint(-189F, -10F, 14F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 53
		bodyModel[35].setRotationPoint(-87F, -61F, 170F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F); // Box 52
		bodyModel[36].setRotationPoint(-164F, -9F, 14F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 50
		bodyModel[37].setRotationPoint(-87F, -61F, 164F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0.5F, 4F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0.5F, 0F, 4F, -2F, 1.5F, -6F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0.5F, 1F, -6F, -2F); // Box 5
		bodyModel[38].setRotationPoint(-217F, -24F, 5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, 5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -5.5F, 0F, 0F, 5F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, -5.5F); // Box 5
		bodyModel[39].setRotationPoint(-214F, -30F, 16F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 2.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 4F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 5
		bodyModel[40].setRotationPoint(-194F, -28F, 23F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 5
		bodyModel[41].setRotationPoint(-169F, -67F, 5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, 1F, 6F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, -6F); // Box 4
		bodyModel[42].setRotationPoint(-205F, -30F, 21F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -4F, 1F, 0F, -2F, 1F, 0F, -5F, 1F, 0F, -5F, -3F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, -3F); // Box 4
		bodyModel[43].setRotationPoint(-179F, -66F, 15F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 208, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 4
		bodyModel[44].setRotationPoint(-137F, -68F, 14F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.7F, 0F, -2.15F, -0.45F, 0F, 1.7F, -1.9F, 0F, -1.7F, -1.9F, 0F, -1.4F, -1F, 0F, 1.4F, -1F, 0F); // Box 4
		bodyModel[45].setRotationPoint(-200F, -44F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, 7.5F, -1.5F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -7.5F, -1.5F); // Box 4
		bodyModel[46].setRotationPoint(-214F, -19F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 4
		bodyModel[47].setRotationPoint(-194F, -30F, 23F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[48].setRotationPoint(-13F, -69F, 165F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[49].setRotationPoint(-13F, -67F, 161F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[50].setRotationPoint(-13F, -68F, 163F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4.5F, 0F, -3F, 4F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1F, 0F, -2.5F, -4.5F); // Box 3
		bodyModel[51].setRotationPoint(-214F, -27F, 15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 3
		bodyModel[52].setRotationPoint(-194F, -37F, 23F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 4.5F, 4.5F, 0F, 2F, 0.5F, 0F, 1F, -0.5F, 0F, 3F, -5F, 0F, -7F, 6.5F, 0F, -3F, 4.5F, 0F, -1F, -5.5F, 0F, -5F, -7.5F); // Box 3
		bodyModel[53].setRotationPoint(-205F, -19F, 18F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 8F, -4F); // Box 3
		bodyModel[54].setRotationPoint(-164F, -60F, 29F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 1F, 0F, -2F, 1F, 0F, -4F, 0F, 0F, -6F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 3F, 0F, 0F, 4F, 1F); // Box 3
		bodyModel[55].setRotationPoint(-169F, -67F, 15F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 208, 15, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[56].setRotationPoint(-137F, -44F, 36F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 265
		bodyModel[57].setRotationPoint(-128F, -50F, 34F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 264
		bodyModel[58].setRotationPoint(-128F, -57F, 29F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 50, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 263
		bodyModel[59].setRotationPoint(-128F, -62F, 22F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 56, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[60].setRotationPoint(-128F, -65F, 14F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 58, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[61].setRotationPoint(-128F, -66F, 5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[62].setRotationPoint(-27F, -69F, 165F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[63].setRotationPoint(-27F, -67F, 161F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[64].setRotationPoint(-27F, -68F, 163F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-2.1F, -0.45F, 0F, 2.05F, -0.7F, 0F, 4.8F, -1.5F, 0.5F, -5F, -1F, 0.5F, 1.4F, -3F, 0F, -1.4F, -3F, 0F, 3F, 1F, 2F, -4F, 1F, 3F); // Box 2
		bodyModel[65].setRotationPoint(-200F, -44F, 10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 27, 3, 7, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -11F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 10F, 0F); // Box 2
		bodyModel[66].setRotationPoint(-164F, -65F, 22F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -4F, 0F, 0F, -2F, 1F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, 3F, 0F, 0F, 4F, 0F); // Box 2
		bodyModel[67].setRotationPoint(-169F, -65F, 19F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 3F, 2F, -2F, 3F, -1F, -2F, 3F, 1F, 0F, 3F, -2F); // Box 2
		bodyModel[68].setRotationPoint(-193F, -43F, 22F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F,0F, 4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F); // Box 18
		bodyModel[69].setRotationPoint(-189F, -9F, 5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 208, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[70].setRotationPoint(-137F, -8F, 5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 208, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 15
		bodyModel[71].setRotationPoint(-137F, -9F, 14F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 208, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 14
		bodyModel[72].setRotationPoint(-137F, -12F, 22F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 208, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 13
		bodyModel[73].setRotationPoint(-137F, -16F, 29F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -4F, 2F, 0F, -2F, 1F, 0F, -3.5F, -2.5F, 0F, -4F, -5F, 0F, 2F, 2F, 0F, 0F, 1F, 0F, 1.5F, -2.5F, 0F, 2F, -5F); // Box 13
		bodyModel[74].setRotationPoint(-187F, -60F, 13F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -4F, 2F, 0F, -2F, 1F, 0F, -5.5F, 0F, 0F, -5.5F, -3.5F, 0F, 2F, 2F, 0F, 0F, 1F, 0F, 3.5F, 0F, 0F, 3.5F, -3.5F); // Box 12
		bodyModel[75].setRotationPoint(-185F, -62F, 14F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 208, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 12
		bodyModel[76].setRotationPoint(-137F, -23F, 34F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 2.5F, 4.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1.5F, -5F, 0F, -2.5F, 5.5F, 0F, 0F, 1.5F, 0F, 1F, -1.5F, 0F, -1F, -6F); // Box 12
		bodyModel[77].setRotationPoint(-205F, -23F, 19F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 4F, 5F, 0F, 4F, 2F, 0F, 4F, 0F, 0F, 4F, -5F, 0F, -1F, 6F, 0F, 1F, 2F, 0F, 0F, -1F, 0F, 0F, -6F); // Box 12
		bodyModel[78].setRotationPoint(-164F, -34F, 38F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -4F, 2F, 0F, -2F, 1F, 0F, -3F, -3F, 0F, -7.5F, -1F, 0F, 2F, 2F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, 5.5F, -1F); // Box 11
		bodyModel[79].setRotationPoint(-182F, -64F, 15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 208, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F); // Box 11
		bodyModel[80].setRotationPoint(-137F, -34F, 38F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 4.5F, 5.5F, 0F, 0.5F, 2.5F, 0F, -1F, -3F, 0F, 3.5F, -6F, 0F, -8.5F, 6.5F, 0F, -3F, 4.5F, 0F, -1F, -5.5F, 0F, -6.5F, -7.5F); // Box 11
		bodyModel[81].setRotationPoint(-214F, -23F, 16F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 208, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 101
		bodyModel[82].setRotationPoint(-137F, -60F, 29F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 10
		bodyModel[83].setRotationPoint(-164F, -8F, 5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 23, 3, 4, 0F,0F, -5F, 8F, 0F, -3F, -2F, 0F, -8F, 0F, 0F, -10F, -10F, 0F, 2F, 9F, 0F, 1F, -1F, 0F, 7F, -1F, 0F, 7F, -11F); // Box 10
		bodyModel[84].setRotationPoint(-187F, -53F, 29F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 208, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 10
		bodyModel[85].setRotationPoint(-137F, -45F, 38F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -6.5F, 0F, 0.3F, -4.1F, 0F, 0.6F, -5F, -2F, 0F, -8F, -1.5F, 0F, 6F, 0F, 1.4F, 2.1F, 0F, 1.7F, 3F, -2.1F, 0F, 7.5F, -1.5F); // Box 10
		bodyModel[86].setRotationPoint(-208F, -47F, 5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-5F, -2F, 2F, 0F, -3F, -2F, -2F, -9F, 0F, -2F, -9F, -2.5F, -6F, -1F, 2F, 0F, 0F, -1F, -2F, 6F, -1F, -2.75F, 6.5F, -2.5F); // Box 1
		bodyModel[87].setRotationPoint(-197F, -52F, 15F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 27, 3, 7, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 6F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, -3F); // Box 1
		bodyModel[88].setRotationPoint(-164F, -12F, 22F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 1
		bodyModel[89].setRotationPoint(-196F, -37F, 20F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,-3F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -8F, -2F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, -2F, 5F, -3F); // Box 1
		bodyModel[90].setRotationPoint(-172F, -61F, 22F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F); // Box 1
		bodyModel[91].setRotationPoint(-164F, -68F, 14F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, -5F, 0F, -2.5F, 5.5F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, -1.5F, -6F); // Box 1
		bodyModel[92].setRotationPoint(-205F, -27F, 20F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 4F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0.5F, 0F, 6F, -1.5F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0.5F, 0F, -6F, -1.5F); // Box 1
		bodyModel[93].setRotationPoint(-205F, -15F, 5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F); // Box 0
		bodyModel[94].setRotationPoint(-164F, -69F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 27, 3, 4, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 6F, -6F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -5F); // Box 0
		bodyModel[95].setRotationPoint(-164F, -23F, 34F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F); // Box 0
		bodyModel[96].setRotationPoint(-164F, -9F, 14F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,-2F, -4F, -1F, 0F, -3F, -3F, 0F, -7F, 0F, 0F, -7.75F, -3.5F, -2F, 1F, 0F, 0F, 2F, -3F, 0F, 5F, -1F, -0.75F, 5.25F, -4.25F); // Box 0
		bodyModel[97].setRotationPoint(-172F, -57F, 26F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-4F, -2F, 2F, 0F, -3F, -2F, 0F, -8F, 0F, -2F, -8F, -4F, -4F, -1F, 3F, 0F, 0F, -1F, 0F, 5F, -1F, -2F, 5F, -5F); // Box 0
		bodyModel[98].setRotationPoint(-194F, -51F, 19F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 7F, -1F, 0F, -7F, -1F, 0F, -2.25F, 0.5F, 3.5F, 2F, 0F, 3.5F); // Box 0
		bodyModel[99].setRotationPoint(-193F, -50F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 1F, 4F, 1F, 1F, 4F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[100].setRotationPoint(-195F, -33F, 21F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 3F, 4F, 0F, 0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 2.5F, -4.5F, 0F, -4.5F, 4.5F, 0F, -0.5F, 1.5F, 0F, 1F, -2F, 0F, -3.5F, -5F); // Box 0
		bodyModel[101].setRotationPoint(-214F, -25F, 15F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 208, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[102].setRotationPoint(-137F, -69F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,1.2F, 4F, 8.1F, 0F, 0F, 0F, 0F, 0F, 0F, 2.4F, 4F, -9F, -1.9F, -1.4F, 0.2F, 1F, 2F, -2F, 1F, 2F, 2F, -1.9F, -1.4F, -0.2F); // Box 0
		bodyModel[103].setRotationPoint(-199F, -38F, 18F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 207, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, 0F, -3F, -8F); // Box 368
		bodyModel[104].setRotationPoint(-136F, -17F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 86, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 370
		bodyModel[105].setRotationPoint(-214F, -25F, 5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 51, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 0F); // Box 371
		bodyModel[106].setRotationPoint(-188F, -25F, 14F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -1F); // Box 372
		bodyModel[107].setRotationPoint(-205F, -25F, 14F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -3F); // Box 373
		bodyModel[108].setRotationPoint(-215F, -25F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[109].setRotationPoint(-208F, -40F, 5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[110].setRotationPoint(-208F, -39F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 376
		bodyModel[111].setRotationPoint(-208F, -37F, 12F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 55, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, -2F, 5F); // Box 1
		bodyModel[112].setRotationPoint(-30F, -35F, 38F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 55, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[113].setRotationPoint(-30F, -30F, 43F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 45, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 3
		bodyModel[114].setRotationPoint(-30F, -19F, 43F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, -1F, 3F); // Box 176
		bodyModel[115].setRotationPoint(-49F, -35F, 38F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 19, 13, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F); // Box 177
		bodyModel[116].setRotationPoint(-49F, -30F, 43F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 5F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -3F, -5F); // Box 178
		bodyModel[117].setRotationPoint(-49F, -19F, 43F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 179
		bodyModel[118].setRotationPoint(-30F, -11F, 41F);

		bodyModel[119].addShapeBox(0F, -2F, 0F, 45, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[119].setRotationPoint(-30F, -7F, 34F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 55, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[120].setRotationPoint(-30F, -6F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 182
		bodyModel[121].setRotationPoint(15F, -19F, 43F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183
		bodyModel[122].setRotationPoint(15F, -11F, 41F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[123].setRotationPoint(15F, -7F, 34F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 45, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[124].setRotationPoint(-30F, -6F, 26F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -5F, 6F, 0F, -3F, 3F, 0F, -2F, -4F, 0F, -4F, -7F); // Box 0
		bodyModel[125].setRotationPoint(-49F, -11F, 41F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 1
		bodyModel[126].setRotationPoint(-49F, -7F, 34F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F); // Box 2
		bodyModel[127].setRotationPoint(-49F, -6F, 26F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 19, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[128].setRotationPoint(-49F, -6F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 1F, 0F); // Box 4
		bodyModel[129].setRotationPoint(-61F, -35F, 38F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, -3F, 5F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -3F, -5F, 0F, -3F, 5F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -3F, -5F); // Box 5
		bodyModel[130].setRotationPoint(-61F, -30F, 43F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F,0F, 1F, 5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -5F, 0F, -4F, 9F, 0F, -3F, 5F, 0F, -3F, -5F, 0F, -4F, -9F); // Box 6
		bodyModel[131].setRotationPoint(-61F, -19F, 43F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 2F, 7F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 2F, -7F, 0F, -8F, 10F, 0F, -5F, 6F, 0F, -4F, -7F, 0F, -7F, -11F); // Box 7
		bodyModel[132].setRotationPoint(-61F, -11F, 41F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 8
		bodyModel[133].setRotationPoint(-68F, -27F, 38F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 9F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -10F); // Box 9
		bodyModel[134].setRotationPoint(-68F, -20F, 38F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 5F, 0F, 0F, 2F, 0F, 0F, 3F, 1F, 0F, 6F, -3F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -3F, 1F, 0F, -6F, -3F); // Box 10
		bodyModel[135].setRotationPoint(-61F, -6F, 26F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 12, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F); // Box 11
		bodyModel[136].setRotationPoint(-61F, -6F, 5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 3F, 12F, 0F, 2F, 7F, 0F, 2F, -7F, 0F, 3F, -13F, 0F, -7F, 17F, 0F, -8F, 10F, 0F, -7F, -11F, 0F, -7F, -18F); // Box 12
		bodyModel[137].setRotationPoint(-68F, -11F, 41F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 3F, 4F, 0F, 5F, 0F, 0F, 6F, -3F, 0F, 5F, -10F, 0F, -4F, 4F, 0F, -5F, 0F, 0F, -6F, -3F, 0F, -6F, -10F); // Box 14
		bodyModel[138].setRotationPoint(-68F, -6F, 26F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 7, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, -4F); // Box 16
		bodyModel[139].setRotationPoint(-68F, -6F, 5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F); // Box 17
		bodyModel[140].setRotationPoint(-68F, -35F, 38F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -2F, -2F); // Box 192
		bodyModel[141].setRotationPoint(25F, -19F, 43F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -4F, 6F, 0F, -3F, -7F, 0F, -2F, -4F); // Box 193
		bodyModel[142].setRotationPoint(25F, -11F, 41F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 194
		bodyModel[143].setRotationPoint(25F, -7F, 34F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 2F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, -2F, 5F, 0F, -2F, 15F, 0F, -2F, -15F, 0F, -2F, -5F); // Box 195
		bodyModel[144].setRotationPoint(35F, -19F, 43F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F, -3F, 0F, -4F, 6F, 0F, -6F, 15F, 0F, -5F, -16F, 0F, -3F, -7F); // Box 196
		bodyModel[145].setRotationPoint(35F, -11F, 41F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -2F, 0F); // Box 197
		bodyModel[146].setRotationPoint(25F, -30F, 43F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, -2F, 5F); // Box 198
		bodyModel[147].setRotationPoint(25F, -35F, 38F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 6F, 0F, -2F, -5F, 0F, -2F, 0F); // Box 199
		bodyModel[148].setRotationPoint(35F, -30F, 41F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F, 3F); // Box 200
		bodyModel[149].setRotationPoint(35F, -35F, 38F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[150].setRotationPoint(15F, -6F, 26F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 203
		bodyModel[151].setRotationPoint(25F, -6F, 26F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[152].setRotationPoint(25F, -6F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, -8F, 0F, 2F, 1F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, -8F, 0F, -2F, 1F); // Box 205
		bodyModel[153].setRotationPoint(35F, -6F, 26F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 206
		bodyModel[154].setRotationPoint(35F, -6F, 5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 1F); // Box 207
		bodyModel[155].setRotationPoint(45F, -35F, 38F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -2F, 6F, 0F, -2F, 8F, 0F, -2F, -9F, 0F, -2F, -5F); // Box 208
		bodyModel[156].setRotationPoint(45F, -30F, 41F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 8F, 0F, 0F, 10F, 0F, 0F, -11F, 0F, 0F, -7F, 0F, -2F, 15F, 0F, -3F, 18F, 0F, -3F, -19F, 0F, -2F, -15F); // Box 209
		bodyModel[157].setRotationPoint(45F, -19F, 43F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 13F, 0F, 1F, 16F, 0F, 1F, -17F, 0F, 0F, -13F, 0F, -6F, 15F, 0F, -6F, 18F, 0F, -6F, -19F, 0F, -5F, -16F); // Box 210
		bodyModel[158].setRotationPoint(45F, -11F, 41F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -4F, 0F); // Box 211
		bodyModel[159].setRotationPoint(45F, -6F, 5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 45, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 6F, 0F, -6F, 6F); // Box 212
		bodyModel[160].setRotationPoint(-30F, -19F, 43F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, -3F, 2F); // Box 213
		bodyModel[161].setRotationPoint(-30F, -15F, 49F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, -3F, 1F); // Box 214
		bodyModel[162].setRotationPoint(-30F, -11F, 51F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, -1F, -5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1F, -1F, 4F); // Box 384
		bodyModel[163].setRotationPoint(-218F, -28F, -2F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, -6F, 0F, -1.5F, -1.5F, 0F, -1F, 1F, -1F, -1F, 5F, 0F, -1F, -6F, 0F, 0.5F, -2F, 0F, -0.5F, 1.5F, -1F, -1F, 5F); // Box 385
		bodyModel[164].setRotationPoint(-218F, -29F, -3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -4F, -8F, 0F, -1F, -5.5F, 0F, -2.5F, 4.5F, -1F, -4F, 7F, 0F, -1F, -8F, 0F, -0.5F, -3.5F, 0F, -0.5F, 3F, -1F, -1F, 7F); // Box 386
		bodyModel[165].setRotationPoint(-218F, -37F, -5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 1.5F, 0F, 3F, 0F, -1F, 4F, 2F, -1F, 4F, -2F, 0F, 3F, 0F); // Box 387
		bodyModel[166].setRotationPoint(-196F, -43F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -8F, -1.5F, 0F, -5F, -0.5F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, 7.5F, -1.5F, 0F, 4.5F, -0.5F, 0F, 3F, 0F, 0F, 5.5F, 0F); // Box 388
		bodyModel[167].setRotationPoint(-214F, -44F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, -7F, -5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 4F, -6F, 0F, 4F, -3F, 0F, -4F, 2F, 0F, -1F, 6F); // Box 389
		bodyModel[168].setRotationPoint(-164F, -45F, -29F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 27, 3, 4, 0F,0F, -8F, -5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 7F, -6F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 1F, 4F); // Box 390
		bodyModel[169].setRotationPoint(-164F, -53F, -28F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-1F, -4F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 391
		bodyModel[170].setRotationPoint(-188F, -60F, -2F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -8F, 0F, -1.5F, -4F, 0F, -0.5F, 3.5F, -1F, 0F, 7F, 0F, -5F, -8F, 0F, -1.5F, -5.5F, 0F, -3.5F, 4.5F, -1F, -5F, 7F); // Box 392
		bodyModel[171].setRotationPoint(-218F, -28F, -5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 0.5F, -6F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, -0.5F, 0.5F, 5F, 0F, 0F, -6F, 0F, 0F, -1.5F, 0F, 0F, 1F, -1F, 0F, 5F); // Box 393
		bodyModel[172].setRotationPoint(-218F, -30F, -3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -6F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, -1F, 0F, 5F, 0.5F, -0.5F, -6F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1F, 0F, -0.5F, 5.5F); // Box 394
		bodyModel[173].setRotationPoint(-218F, -33F, -3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -3F, -4.5F, 0F, -2.5F, 0F, -3F, 0F, 2.5F, 0F, -3F, 3.5F, 0F, 1.5F, -4.5F, 0F, -0.5F, 0F, -3F, -1.5F, 2.5F, 0F, 1.5F, 3.5F); // Box 395
		bodyModel[174].setRotationPoint(-214F, -39F, -4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,2.1F, 0F, -10.5F, -6.4F, 3F, -11F, -6.4F, 2.5F, 10F, 2.1F, -1.5F, 9.4F, -1F, -0.5F, -7F, -2.1F, -0.4F, -2.1F, -2.2F, -0.4F, 2.2F, -1F, -0.5F, 7F); // Box 396
		bodyModel[175].setRotationPoint(-206F, -39F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -4.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 3.5F, 0F, 0.5F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 2F); // Box 397
		bodyModel[176].setRotationPoint(-214F, -36F, -4F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,-1F, -0.5F, -7F, -2.1F, -0.6F, -2.2F, -2.1F, -0.6F, 2.2F, -1F, -0.5F, 7F, -1F, 1F, -5.5F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 5.5F); // Box 398
		bodyModel[177].setRotationPoint(-206F, -37F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.5F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 5F, 0F, 0.5F, -5.5F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 5F); // Box 399
		bodyModel[178].setRotationPoint(-214F, -33F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, -4F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[179].setRotationPoint(-185F, -62F, -3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 4F, -0.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -4F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 401
		bodyModel[180].setRotationPoint(-194F, -13F, -4F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,1F, -6F, -2F, 0F, -3F, 0.5F, 0F, -1F, 0F, 1.5F, -6F, 0F, 0F, 4F, -2F, 0F, 2.5F, 0.5F, 0F, 0.5F, 0F, 0.5F, 4F, 0F); // Box 402
		bodyModel[181].setRotationPoint(-217F, -39F, 1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 208, 3, 4, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[182].setRotationPoint(-137F, -53F, -28F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, -6.5F, -1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 6.5F, 0F, 0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 6F); // Box 404
		bodyModel[183].setRotationPoint(-205F, -33F, -12F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 405
		bodyModel[184].setRotationPoint(-182F, -63F, -4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0.5F, 0F, -2F, -5.5F, 0F, -1F, -5F, 0F, -3F, 4F, 0F, -4F, 4.5F); // Box 406
		bodyModel[185].setRotationPoint(-194F, -18F, -9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 407
		bodyModel[186].setRotationPoint(-219F, -33F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[187].setRotationPoint(-179F, -65F, -4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 208, 3, 7, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[188].setRotationPoint(-137F, -65F, -19F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, 6F, -5F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -8F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 3F); // Box 410
		bodyModel[189].setRotationPoint(-164F, -17F, -24F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 411
		bodyModel[190].setRotationPoint(-219F, -30F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -2F, -3.5F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -3F, 3.5F); // Box 412
		bodyModel[191].setRotationPoint(-194F, -23F, -12F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F,0F, -8F, -10F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -2F, 10F, 0F, 5F, -11F, 0F, 4F, -1F, 0F, -1F, 1F, -2F, -1F, 11F); // Box 413
		bodyModel[192].setRotationPoint(-189F, -45F, -24F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 3F, -10F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 10F, 0F, -2F, -10F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -2F, 10F); // Box 414
		bodyModel[193].setRotationPoint(-189F, -34F, -24F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 7F, -10F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 6F, 6F, 0F, -10F, -9F, 0F, -8F, 0F, 0F, -2F, -1F, 0F, -8F, 5F); // Box 415
		bodyModel[194].setRotationPoint(-189F, -23F, -23F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 25, 3, 5, 0F,0F, 10F, -8F, 0F, 4F, -2F, 0F, -1F, 0F, 0F, 5F, 5F, 0F, -12F, -7F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -7F, 4F); // Box 416
		bodyModel[195].setRotationPoint(-189F, -19F, -21F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 25, 3, 7, 0F,0F, 10F, -8F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 5F, 4F, 0F, -12F, -7F, 0F, -5F, -3F, 0F, -1F, 0F, 0F, -7F, 3F); // Box 417
		bodyModel[196].setRotationPoint(-189F, -14F, -19F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 25, 3, 8, 0F,0F, 9F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -11F, -3F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -7F, 0F); // Box 418
		bodyModel[197].setRotationPoint(-189F, -10F, -12F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 420
		bodyModel[198].setRotationPoint(-164F, -9F, -12F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 4F, -2F, 0F, 2.5F, 0.5F, 0F, 0.5F, 0F, 0.5F, 4F, 0F, 1F, -6F, -2F, 0F, -2.5F, 0.5F, 0F, -0.5F, 0F, 1.5F, -6F, 0F); // Box 422
		bodyModel[199].setRotationPoint(-217F, -24F, 1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, -5.5F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 5F, 0F, 0F, -5.5F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 5F); // Box 423
		bodyModel[200].setRotationPoint(-214F, -30F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2.5F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 4F); // Box 424
		bodyModel[201].setRotationPoint(-194F, -28F, -14F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 425
		bodyModel[202].setRotationPoint(-169F, -67F, -4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 6F, 0F, 1F, -6F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 6F); // Box 426
		bodyModel[203].setRotationPoint(-205F, -30F, -12F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -5F, -3F, 0F, -5F, 1F, 0F, -2F, 1F, 0F, -4F, 1F, 0F, 3F, -3F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 2F, 1F); // Box 427
		bodyModel[204].setRotationPoint(-179F, -66F, -8F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 208, 3, 8, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[205].setRotationPoint(-137F, -68F, -12F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-2.15F, -0.45F, 0F, 2.25F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, -1F, 0F, -1.4F, -1F, 0F, -1.7F, -1.9F, 0F, 1.7F, -1.9F, 0F); // Box 429
		bodyModel[206].setRotationPoint(-200F, -44F, 0F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 7.5F, -1.5F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -7.5F, -1.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -5.5F, 0F); // Box 430
		bodyModel[207].setRotationPoint(-214F, -19F, -1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2.5F); // Box 431
		bodyModel[208].setRotationPoint(-194F, -30F, -14F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 1F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, -2.5F, -4.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -3F, 4F); // Box 435
		bodyModel[209].setRotationPoint(-214F, -27F, -6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 436
		bodyModel[210].setRotationPoint(-194F, -37F, -14F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 3F, -5F, 0F, 1F, -0.5F, 0F, 2F, 0.5F, 0F, 4.5F, 4.5F, 0F, -5F, -7.5F, 0F, -1F, -5.5F, 0F, -3F, 4.5F, 0F, -7F, 6.5F); // Box 437
		bodyModel[211].setRotationPoint(-205F, -19F, -9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, -10F, -3F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 8F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 438
		bodyModel[212].setRotationPoint(-164F, -60F, -24F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -6F, 1F, 0F, -4F, 0F, 0F, -2F, 1F, 0F, -3F, 1F, 0F, 4F, 1F, 0F, 3F, 0F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 439
		bodyModel[213].setRotationPoint(-169F, -67F, -8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 208, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 440
		bodyModel[214].setRotationPoint(-137F, -44F, -28F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 27, 2, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[215].setRotationPoint(-128F, -50F, -26F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 41, 5, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[216].setRotationPoint(-128F, -57F, -24F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 50, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[217].setRotationPoint(-128F, -62F, -19F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 56, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[218].setRotationPoint(-128F, -65F, -12F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 58, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[219].setRotationPoint(-128F, -66F, -4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-5F, -1F, 0.5F, 4.8F, -1.5F, 0.5F, 2.05F, -0.7F, 0F, -2.1F, -0.45F, 0F, -4F, 1F, 3F, 3F, 1F, 2F, -1.4F, -3F, 0F, 1.4F, -3F, 0F); // Box 449
		bodyModel[220].setRotationPoint(-200F, -44F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 27, 3, 7, 0F,0F, -11F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 450
		bodyModel[221].setRotationPoint(-164F, -65F, -19F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -6F, 0F, 0F, -4F, 0F, 0F, -2F, 1F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 1F, 1F, 0F, 2F, 0F); // Box 451
		bodyModel[222].setRotationPoint(-169F, -65F, -12F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 3F, -2F, -2F, 3F, 1F, -2F, 3F, -1F, 0F, 3F, 2F); // Box 452
		bodyModel[223].setRotationPoint(-193F, -43F, -13F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F,0F, 7F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 453
		bodyModel[224].setRotationPoint(-189F, -9F, -4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 208, 3, 9, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[225].setRotationPoint(-137F, -8F, -4F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 208, 3, 8, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[226].setRotationPoint(-137F, -9F, -12F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 208, 3, 7, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[227].setRotationPoint(-137F, -12F, -19F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 208, 3, 5, 0F,0F, 7F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 457
		bodyModel[228].setRotationPoint(-137F, -16F, -24F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -4F, -5F, 0F, -3.5F, -2.5F, 0F, -2F, 1F, 0F, -4F, 2F, 0F, 2F, -5F, 0F, 1.5F, -2.5F, 0F, 0F, 1F, 0F, 2F, 2F); // Box 458
		bodyModel[229].setRotationPoint(-187F, -60F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -5.5F, -3.5F, 0F, -5.5F, 0F, 0F, -2F, 1F, 0F, -4F, 2F, 0F, 3.5F, -3.5F, 0F, 3.5F, 0F, 0F, 0F, 1F, 0F, 2F, 2F); // Box 459
		bodyModel[230].setRotationPoint(-185F, -62F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 208, 3, 4, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[231].setRotationPoint(-137F, -23F, -28F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 1.5F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2.5F, 4.5F, 0F, -1F, -6F, 0F, 1F, -1.5F, 0F, 0F, 1.5F, 0F, -2.5F, 5.5F); // Box 461
		bodyModel[232].setRotationPoint(-205F, -23F, -10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 4F, -5F, 0F, 4F, 0F, 0F, 4F, 2F, 0F, 4F, 5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 1F, 2F, 0F, -1F, 6F); // Box 462
		bodyModel[233].setRotationPoint(-164F, -34F, -29F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -7.5F, -1F, 0F, -3F, -3F, 0F, -2F, 1F, 0F, -4F, 2F, 0F, 5.5F, -1F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 2F, 2F); // Box 463
		bodyModel[234].setRotationPoint(-182F, -64F, -8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 208, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[235].setRotationPoint(-137F, -34F, -29F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 3.5F, -6F, 0F, -1F, -3F, 0F, 0.5F, 2.5F, 0F, 4.5F, 5.5F, 0F, -6.5F, -7.5F, 0F, -1F, -5.5F, 0F, -3F, 4.5F, 0F, -8.5F, 6.5F); // Box 465
		bodyModel[236].setRotationPoint(-214F, -23F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 208, 3, 5, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[237].setRotationPoint(-137F, -60F, -24F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 467
		bodyModel[238].setRotationPoint(-164F, -8F, -4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 23, 3, 4, 0F,0F, -10F, -10F, 0F, -8F, 0F, 0F, -3F, -2F, 0F, -5F, 8F, 0F, 7F, -11F, 0F, 7F, -1F, 0F, 1F, -1F, 0F, 2F, 9F); // Box 468
		bodyModel[239].setRotationPoint(-187F, -53F, -23F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 208, 3, 1, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 469
		bodyModel[240].setRotationPoint(-137F, -45F, -29F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -8F, -1.5F, 0.6F, -5F, -2F, 0.3F, -4.1F, 0F, 0F, -6.5F, 0F, 0F, 7.5F, -1.5F, 1.7F, 3F, -2.1F, 1.4F, 2.1F, 0F, 0F, 6F, 0F); // Box 470
		bodyModel[241].setRotationPoint(-208F, -47F, -2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-2F, -9F, -2.5F, -2F, -9F, 0F, 0F, -3F, -2F, -5F, -2F, 2F, -2.75F, 6.5F, -2.5F, -2F, 6F, -1F, 0F, 0F, -1F, -6F, -1F, 2F); // Box 471
		bodyModel[242].setRotationPoint(-197F, -52F, -9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 27, 3, 7, 0F,0F, 6F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -7F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 472
		bodyModel[243].setRotationPoint(-164F, -12F, -19F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 1F, 0F); // Box 473
		bodyModel[244].setRotationPoint(-196F, -37F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,-2F, -8F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -2F, 5F, -3F, 0F, 6F, 0F, 0F, -1F, 0F, -3F, 0F, 0F); // Box 474
		bodyModel[245].setRotationPoint(-172F, -61F, -19F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 475
		bodyModel[246].setRotationPoint(-164F, -68F, -12F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, -5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 5F, 0F, -1.5F, -6F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -2.5F, 5.5F); // Box 476
		bodyModel[247].setRotationPoint(-205F, -27F, -11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 6F, -1.5F, 0F, 2F, 0.5F, 0F, -0.5F, 0F, 0F, 4F, 0F, 0F, -6F, -1.5F, 0F, -2F, 0.5F, 0F, 0.5F, 0F, 0F, -4F, 0F); // Box 477
		bodyModel[248].setRotationPoint(-205F, -15F, -3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 478
		bodyModel[249].setRotationPoint(-164F, -69F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 27, 3, 4, 0F,0F, 6F, -6F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -8F, -5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 4F); // Box 479
		bodyModel[250].setRotationPoint(-164F, -23F, -28F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 480
		bodyModel[251].setRotationPoint(-164F, -9F, -12F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -7.75F, -3.5F, 0F, -7F, 0F, 0F, -3F, -3F, -2F, -4F, -1F, -0.75F, 5.25F, -4.25F, 0F, 5F, -1F, 0F, 2F, -3F, -2F, 1F, 0F); // Box 481
		bodyModel[252].setRotationPoint(-172F, -57F, -21F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-2F, -8F, -4F, 0F, -8F, 0F, 0F, -3F, -2F, -4F, -2F, 2F, -2F, 5F, -5F, 0F, 5F, -1F, 0F, 0F, -1F, -4F, -1F, 3F); // Box 482
		bodyModel[253].setRotationPoint(-194F, -51F, -13F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3.5F, -2.25F, 0.5F, 3.5F, -7F, -1F, 0F, 7F, -1F, 0F); // Box 483
		bodyModel[254].setRotationPoint(-193F, -50F, -3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 1F, 4F, -1F, 1F, 4F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 484
		bodyModel[255].setRotationPoint(-195F, -33F, -12F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 2.5F, -4.5F, 0F, -0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 3F, 4F, 0F, -3.5F, -5F, 0F, 1F, -2F, 0F, -0.5F, 1.5F, 0F, -4.5F, 4.5F); // Box 485
		bodyModel[256].setRotationPoint(-214F, -25F, -6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 208, 3, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[257].setRotationPoint(-137F, -69F, -4F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,2.4F, 4F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 4F, 8.1F, -1.9F, -1.4F, -0.2F, 1F, 2F, 2F, 1F, 2F, -2F, -1.9F, -1.4F, 0.2F); // Box 487
		bodyModel[258].setRotationPoint(-199F, -38F, -9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 207, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[259].setRotationPoint(-136F, -17F, -21F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 86, 2, 9, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[260].setRotationPoint(-214F, -25F, -4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 44, 2, 8, 0F,0F, 0F, 1F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[261].setRotationPoint(-188F, -25F, -12F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[262].setRotationPoint(-205F, -25F, -5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,-3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 492
		bodyModel[263].setRotationPoint(-215F, -25F, -4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[264].setRotationPoint(-208F, -40F, 0F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[265].setRotationPoint(-208F, -39F, -2F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[266].setRotationPoint(-208F, -37F, -4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 55, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -2F, -5F); // Box 498
		bodyModel[267].setRotationPoint(-30F, -35F, -29F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 55, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 499
		bodyModel[268].setRotationPoint(-30F, -30F, -34F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 45, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F); // Box 500
		bodyModel[269].setRotationPoint(-30F, -19F, -34F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -1F, -3F); // Box 501
		bodyModel[270].setRotationPoint(-49F, -35F, -29F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 19, 13, 1, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 2F); // Box 502
		bodyModel[271].setRotationPoint(-49F, -30F, -34F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, -5F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -3F, 5F); // Box 503
		bodyModel[272].setRotationPoint(-49F, -19F, -34F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -3F, 3F, 0F, -3F, 3F); // Box 504
		bodyModel[273].setRotationPoint(-30F, -11F, -32F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 45, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 505
		bodyModel[274].setRotationPoint(-30F, -7F, -28F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 55, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[275].setRotationPoint(-30F, -6F, -16F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F); // Box 507
		bodyModel[276].setRotationPoint(15F, -19F, -34F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -3F, 3F, 0F, -3F, 3F); // Box 508
		bodyModel[277].setRotationPoint(15F, -11F, -32F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 509
		bodyModel[278].setRotationPoint(15F, -7F, -28F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 45, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[279].setRotationPoint(-30F, -6F, -24F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -4F, -7F, 0F, -2F, -4F, 0F, -3F, 3F, 0F, -5F, 6F); // Box 511
		bodyModel[280].setRotationPoint(-49F, -11F, -32F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 2F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F); // Box 512
		bodyModel[281].setRotationPoint(-49F, -7F, -28F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 513
		bodyModel[282].setRotationPoint(-49F, -6F, -24F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 19, 1, 21, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[283].setRotationPoint(-49F, -6F, -16F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 1F, 0F); // Box 515
		bodyModel[284].setRotationPoint(-61F, -35F, -29F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, -3F, -5F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, -3F, 5F, 0F, -3F, -5F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -3F, 5F); // Box 516
		bodyModel[285].setRotationPoint(-61F, -30F, -34F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F,0F, 1F, -5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 5F, 0F, -4F, -9F, 0F, -3F, -5F, 0F, -3F, 5F, 0F, -4F, 9F); // Box 517
		bodyModel[286].setRotationPoint(-61F, -19F, -34F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 2F, -7F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 2F, 7F, 0F, -7F, -11F, 0F, -4F, -7F, 0F, -5F, 6F, 0F, -8F, 10F); // Box 518
		bodyModel[287].setRotationPoint(-61F, -11F, -32F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 519
		bodyModel[288].setRotationPoint(-68F, -27F, -29F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -10F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 9F); // Box 520
		bodyModel[289].setRotationPoint(-68F, -20F, -29F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 6F, -3F, 0F, 3F, 1F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, -6F, -3F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, -5F, 0F); // Box 521
		bodyModel[290].setRotationPoint(-61F, -6F, -24F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 12, 1, 21, 0F,0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[291].setRotationPoint(-61F, -6F, -16F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 3F, -13F, 0F, 2F, -7F, 0F, 2F, 7F, 0F, 3F, 12F, 0F, -7F, -18F, 0F, -7F, -11F, 0F, -8F, 10F, 0F, -7F, 17F); // Box 523
		bodyModel[292].setRotationPoint(-68F, -11F, -32F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 5F, -10F, 0F, 6F, -3F, 0F, 5F, 0F, 0F, 3F, 4F, 0F, -6F, -10F, 0F, -6F, -3F, 0F, -5F, 0F, 0F, -4F, 4F); // Box 524
		bodyModel[293].setRotationPoint(-68F, -6F, -24F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 7, 1, 21, 0F,0F, 3F, -4F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[294].setRotationPoint(-68F, -6F, -16F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F); // Box 526
		bodyModel[295].setRotationPoint(-68F, -35F, -29F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, -2F, 2F); // Box 527
		bodyModel[296].setRotationPoint(25F, -19F, -34F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -3F, -7F, 0F, -4F, 6F, 0F, -3F, 3F); // Box 528
		bodyModel[297].setRotationPoint(25F, -11F, -32F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 1F, 0F); // Box 529
		bodyModel[298].setRotationPoint(25F, -7F, -28F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 8F, 0F, 0F, 2F, 0F, -2F, -5F, 0F, -2F, -15F, 0F, -2F, 15F, 0F, -2F, 5F); // Box 530
		bodyModel[299].setRotationPoint(35F, -19F, -34F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 3F, 0F, -3F, -7F, 0F, -5F, -16F, 0F, -6F, 15F, 0F, -4F, 6F); // Box 531
		bodyModel[300].setRotationPoint(35F, -11F, -32F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 0F); // Box 532
		bodyModel[301].setRotationPoint(25F, -30F, -34F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, -2F, -5F); // Box 533
		bodyModel[302].setRotationPoint(25F, -35F, -29F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, -2F, 6F, 0F, -2F, 0F); // Box 534
		bodyModel[303].setRotationPoint(35F, -30F, -32F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, -2F, -3F); // Box 535
		bodyModel[304].setRotationPoint(35F, -35F, -29F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[305].setRotationPoint(15F, -6F, -24F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[306].setRotationPoint(25F, -6F, -24F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[307].setRotationPoint(25F, -6F, -16F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 2F, 1F, 0F, 4F, -8F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -4F, -8F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 539
		bodyModel[308].setRotationPoint(35F, -6F, -24F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[309].setRotationPoint(35F, -6F, -16F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, -1F); // Box 541
		bodyModel[310].setRotationPoint(45F, -35F, -29F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -2F, -5F, 0F, -2F, -9F, 0F, -2F, 8F, 0F, -2F, 6F); // Box 542
		bodyModel[311].setRotationPoint(45F, -30F, -32F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -7F, 0F, 0F, -11F, 0F, 0F, 10F, 0F, 0F, 8F, 0F, -2F, -15F, 0F, -3F, -19F, 0F, -3F, 18F, 0F, -2F, 15F); // Box 543
		bodyModel[312].setRotationPoint(45F, -19F, -34F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -13F, 0F, 1F, -17F, 0F, 1F, 16F, 0F, 0F, 13F, 0F, -5F, -16F, 0F, -6F, -19F, 0F, -6F, 18F, 0F, -6F, 15F); // Box 544
		bodyModel[313].setRotationPoint(45F, -11F, -32F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 4F, 0F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[314].setRotationPoint(45F, -6F, -16F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 45, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 6F, 0F, -6F, 6F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 546
		bodyModel[315].setRotationPoint(-30F, -19F, -34F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, -3F, -2F); // Box 547
		bodyModel[316].setRotationPoint(-30F, -15F, -40F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, -3F, -1F); // Box 548
		bodyModel[317].setRotationPoint(-30F, -11F, -42F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 932
		bodyModel[318].setRotationPoint(-182F, -56.5F, 16F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -3.375F, -0.4F, 0F, 3.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4.25F, -0.65F, 0F, 3.975F, 0F, 0F, 0F); // Box 934
		bodyModel[319].setRotationPoint(-177F, -56.5F, 20F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.625F, 0F, 1F, -1F, 1.1F, -0.5F, -3.5F, -1.3F, -0.5F, -3.9F, -1.3F, -0.5F, 3.85F, 1.2F, -0.5F, 3.4F); // Box 935
		bodyModel[320].setRotationPoint(-173F, -60F, 17.4F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.175F, 0F, 1F, -1.2F, 0F, 1F, -1.575F, 1.65F, -0.5F, -1.95F, -2F, -0.5F, -2.4F, -2.4F, -0.5F, 2.15F, 2.15F, -0.5F, 1.6F); // Box 936
		bodyModel[321].setRotationPoint(-177F, -60F, 16.4F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 1.7F, 0F, -3.3F, -1.7F, -0.1F, -3.9F, -1.7F, -0.5F, 3.8F, 1.7F, -0.4F, 3.4F); // Box 937
		bodyModel[322].setRotationPoint(-174.3F, -55.5F, 21.45F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.3F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, 0F, 0.4F, 0F, 0F, -0.25F, 3.3F, 0.3F, -3.5F, -3F, 0.3F, -4.1F, -3.2F, 0.1F, 4F, 3.3F, 0.1F, 3.5F); // Box 938
		bodyModel[323].setRotationPoint(-179.3F, -55.5F, 18.45F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -1.4F, -0.2F, 1F, 0.4F, 0F, 1F, -0.55F, 4.5F, 0.3F, -3.8F, -4.8F, 0.5F, -4.4F, -5.1F, 0.5F, 4.4F, 4.9F, 0.2F, 3.3F); // Box 939
		bodyModel[324].setRotationPoint(-182.85F, -55.5F, 15.6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.8F, 1.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 4.1F, 0F, -2F, -4.2F, 0F, -1.7F, -4F, 0F, 2F, 4F, 0F, 2F); // Box 940
		bodyModel[325].setRotationPoint(-188F, -55F, 10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.9F); // Box 941
		bodyModel[326].setRotationPoint(-182F, -56.5F, -7F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.4F, 0F, 3.1F, 0F, 0F, -3.375F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.65F, 0F, 3.975F, 0F, 0F, -4.25F, 0F, 0F, 0F); // Box 942
		bodyModel[327].setRotationPoint(-177F, -56.5F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, -1F, 0F, 1F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -0.5F, 3.4F, -1.3F, -0.5F, 3.85F, -1.3F, -0.5F, -3.9F, 1.1F, -0.5F, -3.5F); // Box 943
		bodyModel[328].setRotationPoint(-173F, -60F, -8.4F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, -1.575F, 0F, 1F, -1.2F, 0F, 0F, 0.175F, 0F, 0F, 0.6F, 2.15F, -0.5F, 1.6F, -2.4F, -0.5F, 2.15F, -2F, -0.5F, -2.4F, 1.65F, -0.5F, -1.95F); // Box 944
		bodyModel[329].setRotationPoint(-177F, -60F, -7.4F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.7F, -0.4F, 3.4F, -1.7F, -0.5F, 3.8F, -1.7F, -0.1F, -3.9F, 1.7F, 0F, -3.3F); // Box 945
		bodyModel[330].setRotationPoint(-174.3F, -55.5F, -12.45F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, -0.2F, 0F, 0.4F, 0F, 0F, -0.7F, -0.3F, 0F, -0.2F, 3.3F, 0.1F, 3.5F, -3.2F, 0.1F, 4F, -3F, 0.3F, -4.1F, 3.3F, 0.3F, -3.5F); // Box 946
		bodyModel[331].setRotationPoint(-179.3F, -55.5F, -9.45F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 1F, -0.55F, -0.2F, 1F, 0.4F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 4.9F, 0.2F, 3.3F, -5.1F, 0.5F, 4.4F, -4.8F, 0.5F, -4.4F, 4.5F, 0.3F, -3.8F); // Box 947
		bodyModel[332].setRotationPoint(-182.85F, -55.5F, -6.6F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1F, 1F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.8F, 1.2F, 0F, 4F, 0F, 2F, -4F, 0F, 2F, -4.2F, 0F, -1.7F, 4.1F, 0F, -2F); // Box 948
		bodyModel[333].setRotationPoint(-188F, -55F, -1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		bodyModel[334].setRotationPoint(-144F, -18F, -8F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		bodyModel[335].setRotationPoint(-144F, -13F, -12F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 973
		bodyModel[336].setRotationPoint(-144F, -23F, -4F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		bodyModel[337].setRotationPoint(-144F, -16F, -8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 13, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		bodyModel[338].setRotationPoint(-145F, -23F, -5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		bodyModel[339].setRotationPoint(-145F, -23F, -12F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		bodyModel[340].setRotationPoint(-145F, -23F, -17F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 978
		bodyModel[341].setRotationPoint(-145F, -23F, -21F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 979
		bodyModel[342].setRotationPoint(-144F, -21F, -15F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		bodyModel[343].setRotationPoint(-144F, -25F, -20F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 36, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 981
		bodyModel[344].setRotationPoint(-164F, -41F, 22F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 982
		bodyModel[345].setRotationPoint(-170F, -41F, 27F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 25, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 983
		bodyModel[346].setRotationPoint(-153F, -54F, 29F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 11, 13, 2, 0F,0F, 4F, 4F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 984
		bodyModel[347].setRotationPoint(-164F, -54F, 28F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,0F, 0F, 2F, 0F, 3F, 5F, 0F, 0F, -1F, 0F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 985
		bodyModel[348].setRotationPoint(-167F, -54F, 29F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 25, 4, 1, 0F,0F, 0F, 4F, 0F, 2F, 4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 986
		bodyModel[349].setRotationPoint(-153F, -58F, 29F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 987
		bodyModel[350].setRotationPoint(-152.5F, -54F, 28F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 988
		bodyModel[351].setRotationPoint(-147.25F, -54F, 28F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 989
		bodyModel[352].setRotationPoint(-142F, -54F, 28F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		bodyModel[353].setRotationPoint(-146.25F, -48.75F, 28F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 991
		bodyModel[354].setRotationPoint(-152F, -48.75F, 28F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 992
		bodyModel[355].setRotationPoint(-161F, -48.75F, 23.85F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0.5F); // Box 993
		bodyModel[356].setRotationPoint(-159F, -54.75F, 23.85F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 994
		bodyModel[357].setRotationPoint(-145F, -29F, 9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 12, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 995
		bodyModel[358].setRotationPoint(-145F, -32F, 8F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 12, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 996
		bodyModel[359].setRotationPoint(-145F, -38F, 7F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 997
		bodyModel[360].setRotationPoint(-145F, -46F, 6F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 998
		bodyModel[361].setRotationPoint(-146F, -38F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 999
		bodyModel[362].setRotationPoint(-133F, -38F, 7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1000
		bodyModel[363].setRotationPoint(-164F, -34F, -1F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1001
		bodyModel[364].setRotationPoint(-164F, -37F, -2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1002
		bodyModel[365].setRotationPoint(-151F, -43F, -2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 1003
		bodyModel[366].setRotationPoint(-158F, -43F, -3F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1004
		bodyModel[367].setRotationPoint(-150F, -51F, -2F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.5F, 0F); // Box 1005
		bodyModel[368].setRotationPoint(-158F, -43F, 10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1006
		bodyModel[369].setRotationPoint(-168F, -51F, -9F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		bodyModel[370].setRotationPoint(-182F, -34F, -8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		bodyModel[371].setRotationPoint(-182F, -37F, -9F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1009
		bodyModel[372].setRotationPoint(-169F, -43F, -9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 1010
		bodyModel[373].setRotationPoint(-176F, -43F, -10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.5F, 0F); // Box 1011
		bodyModel[374].setRotationPoint(-176F, -43F, 3F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1012
		bodyModel[375].setRotationPoint(-168F, -51F, 8F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1013
		bodyModel[376].setRotationPoint(-182F, -34F, 9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		bodyModel[377].setRotationPoint(-182F, -37F, 8F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1015
		bodyModel[378].setRotationPoint(-169F, -43F, 8F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 1016
		bodyModel[379].setRotationPoint(-176F, -43F, 7F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.5F, 0F); // Box 1017
		bodyModel[380].setRotationPoint(-176F, -43F, 20F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 16, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		bodyModel[381].setRotationPoint(-166F, -30F, -4F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 21, 5, 39, 0F,0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, -1F); // Box 1019
		bodyModel[382].setRotationPoint(-187F, -30F, -15F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 9, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 1020
		bodyModel[383].setRotationPoint(-196F, -30F, -10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 9, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 1021
		bodyModel[384].setRotationPoint(-205F, -30F, -5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 8, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 1022
		bodyModel[385].setRotationPoint(-207F, -30F, -4F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 8F, 0F, 0F, 0F); // Box 1023
		bodyModel[386].setRotationPoint(-192F, -50F, 5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		bodyModel[387].setRotationPoint(-187F, -44F, -3F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 8F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 1025
		bodyModel[388].setRotationPoint(-192F, -50F, -3F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 9, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		bodyModel[389].setRotationPoint(-137F, -25F, 14F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1029
		bodyModel[390].setRotationPoint(-185F, -44.5F, -3.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		bodyModel[391].setRotationPoint(-186F, -44F, -3F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		bodyModel[392].setRotationPoint(-185F, -42.5F, -3F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, 2F, 0F, -0.5F, 2F); // Box 1032
		bodyModel[393].setRotationPoint(-185F, -43F, -6F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1033
		bodyModel[394].setRotationPoint(-185F, -45F, -6F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1034
		bodyModel[395].setRotationPoint(-185F, -45F, 0F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.5F, -3F, 0F, 0.5F, -3F); // Box 1035
		bodyModel[396].setRotationPoint(-185F, -43F, 0F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1036
		bodyModel[397].setRotationPoint(-185F, -45F, 11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1037
		bodyModel[398].setRotationPoint(-187F, -44F, 14F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		bodyModel[399].setRotationPoint(-185F, -42.5F, 14F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		bodyModel[400].setRotationPoint(-185F, -44.5F, 13.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, 2F, 0F, -0.5F, 2F); // Box 1040
		bodyModel[401].setRotationPoint(-185F, -43F, 11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.5F, -3F, 0F, 0.5F, -3F); // Box 1041
		bodyModel[402].setRotationPoint(-185F, -43F, 17F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		bodyModel[403].setRotationPoint(-185F, -45F, 17F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 18, 9, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		bodyModel[404].setRotationPoint(-201F, -37F, 2F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 7F, 0F, 0F); // Box 1044
		bodyModel[405].setRotationPoint(-190F, -43F, -11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1045
		bodyModel[406].setRotationPoint(-190F, -43F, 5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1046
		bodyModel[407].setRotationPoint(-186F, -44F, 14F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1045
		bodyModel[408].setRotationPoint(-111F, -24F, -25F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1046
		bodyModel[409].setRotationPoint(-98F, -24F, -25F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1047
		bodyModel[410].setRotationPoint(-85F, -24F, -25F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1048
		bodyModel[411].setRotationPoint(-111F, -23F, -13F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1049
		bodyModel[412].setRotationPoint(-99F, -23F, -13F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050
		bodyModel[413].setRotationPoint(-86F, -23F, -13F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1051
		bodyModel[414].setRotationPoint(-73F, -23F, -13F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1052
		bodyModel[415].setRotationPoint(-72F, -24F, -25F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1053
		bodyModel[416].setRotationPoint(-60F, -23F, -13F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1054
		bodyModel[417].setRotationPoint(-47F, -23F, -13F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1055
		bodyModel[418].setRotationPoint(-59F, -24F, -25F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1056
		bodyModel[419].setRotationPoint(-14F, -23F, -13F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1057
		bodyModel[420].setRotationPoint(-14F, -24F, -25F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1058
		bodyModel[421].setRotationPoint(-2F, -23F, -13F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1059
		bodyModel[422].setRotationPoint(-1F, -24F, -25F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1060
		bodyModel[423].setRotationPoint(11F, -23F, -13F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1061
		bodyModel[424].setRotationPoint(12F, -24F, -25F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1062
		bodyModel[425].setRotationPoint(24F, -23F, -13F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1063
		bodyModel[426].setRotationPoint(25F, -24F, -25F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1064
		bodyModel[427].setRotationPoint(37F, -23F, -13F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1067
		bodyModel[428].setRotationPoint(-20F, -23F, 22F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1068
		bodyModel[429].setRotationPoint(-20F, -24F, 22F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1069
		bodyModel[430].setRotationPoint(-8F, -23F, 22F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1070
		bodyModel[431].setRotationPoint(-7F, -24F, 22F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1071
		bodyModel[432].setRotationPoint(5F, -23F, 22F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1072
		bodyModel[433].setRotationPoint(6F, -24F, 22F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1073
		bodyModel[434].setRotationPoint(18F, -23F, 22F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1074
		bodyModel[435].setRotationPoint(19F, -24F, 22F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1075
		bodyModel[436].setRotationPoint(31F, -23F, 22F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 26, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1076
		bodyModel[437].setRotationPoint(32F, -24F, 22F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1077
		bodyModel[438].setRotationPoint(57F, -23F, 22F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1078
		bodyModel[439].setRotationPoint(-108F, -23F, 22F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1079
		bodyModel[440].setRotationPoint(-108F, -24F, 22F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1080
		bodyModel[441].setRotationPoint(-96F, -23F, 22F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081
		bodyModel[442].setRotationPoint(-95F, -24F, 22F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1082
		bodyModel[443].setRotationPoint(-83F, -23F, 22F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1083
		bodyModel[444].setRotationPoint(-82F, -24F, 22F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1084
		bodyModel[445].setRotationPoint(-70F, -23F, 22F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1085
		bodyModel[446].setRotationPoint(-69F, -24F, 22F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1086
		bodyModel[447].setRotationPoint(-57F, -23F, 22F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1090
		bodyModel[448].setRotationPoint(38F, -24F, -25F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1091
		bodyModel[449].setRotationPoint(50F, -23F, -13F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1092
		bodyModel[450].setRotationPoint(44F, -23F, 22F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 187, 15, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		bodyModel[451].setRotationPoint(-127F, -44F, 35F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 182, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 961
		bodyModel[452].setRotationPoint(-127F, -44F, -27F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 800, 106, 1, 0F,-370F, -48F, 3.2F, -370F, -48F, 3.2F, -370F, -48F, -3.2F, -370F, -48F, -3.2F, -370F, -48F, -1F, -370F, -48F, -1F, -370F, -48F, 1.6F, -370F, -48F, 1.6F); // Box 962
		bodyModel[453].setRotationPoint(-505F, -104F, 34.9F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 800, 106, 1, 0F,-370F, -48F, -3.2F, -370F, -48F, -3.2F, -370F, -48F, 3.2F, -370F, -48F, 3.2F, -370F, -48F, 1.6F, -370F, -48F, 1.6F, -370F, -48F, -1F, -370F, -48F, -1F); // Box 963
		bodyModel[454].setRotationPoint(-505F, -104F, -25.9F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 9
		tailModel[1] = new ModelRendererTurbo(this, 1577, 9, textureX, textureY); // Box 7
		tailModel[2] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 7
		tailModel[3] = new ModelRendererTurbo(this, 633, 43, textureX, textureY); // Box 5
		tailModel[4] = new ModelRendererTurbo(this, 1697, 49, textureX, textureY); // Box 4
		tailModel[5] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Box 3
		tailModel[6] = new ModelRendererTurbo(this, 811, 1246, textureX, textureY); // Box 3
		tailModel[7] = new ModelRendererTurbo(this, 1049, 40, textureX, textureY); // Box 2
		tailModel[8] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 2
		tailModel[9] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 157
		tailModel[10] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 156
		tailModel[11] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 155
		tailModel[12] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 154
		tailModel[13] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 153
		tailModel[14] = new ModelRendererTurbo(this, 1521, 89, textureX, textureY); // Box 152
		tailModel[15] = new ModelRendererTurbo(this, 1153, 621, textureX, textureY); // Box 151
		tailModel[16] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 150
		tailModel[17] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 15
		tailModel[18] = new ModelRendererTurbo(this, 1521, 97, textureX, textureY); // Box 149
		tailModel[19] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Box 148
		tailModel[20] = new ModelRendererTurbo(this, 953, 81, textureX, textureY); // Box 147
		tailModel[21] = new ModelRendererTurbo(this, 1905, 97, textureX, textureY); // Box 146
		tailModel[22] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 145
		tailModel[23] = new ModelRendererTurbo(this, 1441, 97, textureX, textureY); // Box 144
		tailModel[24] = new ModelRendererTurbo(this, 1809, 97, textureX, textureY); // Box 143
		tailModel[25] = new ModelRendererTurbo(this, 1929, 105, textureX, textureY); // Box 142
		tailModel[26] = new ModelRendererTurbo(this, 1977, 105, textureX, textureY); // Box 141
		tailModel[27] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 140
		tailModel[28] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 14
		tailModel[29] = new ModelRendererTurbo(this, 2017, 105, textureX, textureY); // Box 139
		tailModel[30] = new ModelRendererTurbo(this, 1705, 97, textureX, textureY); // Box 138
		tailModel[31] = new ModelRendererTurbo(this, 1449, 97, textureX, textureY); // Box 137
		tailModel[32] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 136
		tailModel[33] = new ModelRendererTurbo(this, 1153, 113, textureX, textureY); // Box 135
		tailModel[34] = new ModelRendererTurbo(this, 253, 652, textureX, textureY); // Box 134
		tailModel[35] = new ModelRendererTurbo(this, 31, 774, textureX, textureY); // Box 133
		tailModel[36] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 130
		tailModel[37] = new ModelRendererTurbo(this, 1737, 41, textureX, textureY); // Box 13
		tailModel[38] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 129
		tailModel[39] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 128
		tailModel[40] = new ModelRendererTurbo(this, 1521, 113, textureX, textureY); // Box 127
		tailModel[41] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 126
		tailModel[42] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 125
		tailModel[43] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 124
		tailModel[44] = new ModelRendererTurbo(this, 1625, 41, textureX, textureY); // Box 123
		tailModel[45] = new ModelRendererTurbo(this, 1737, 73, textureX, textureY); // Box 122
		tailModel[46] = new ModelRendererTurbo(this, 1937, 41, textureX, textureY); // Box 12
		tailModel[47] = new ModelRendererTurbo(this, 1569, 49, textureX, textureY); // Box 115
		tailModel[48] = new ModelRendererTurbo(this, 529, 185, textureX, textureY); // Box 113
		tailModel[49] = new ModelRendererTurbo(this, 569, 973, textureX, textureY); // Box 100
		tailModel[50] = new ModelRendererTurbo(this, 1521, 81, textureX, textureY); // Box 10
		tailModel[51] = new ModelRendererTurbo(this, 87, 872, textureX, textureY); // Box 1
		tailModel[52] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 1
		tailModel[53] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); // Box 0
		tailModel[54] = new ModelRendererTurbo(this, 1097, 153, textureX, textureY); // Box 375
		tailModel[55] = new ModelRendererTurbo(this, 649, 209, textureX, textureY); // Box 376
		tailModel[56] = new ModelRendererTurbo(this, 2001, 297, textureX, textureY); // Box 497
		tailModel[57] = new ModelRendererTurbo(this, 1793, 345, textureX, textureY); // Box 868
		tailModel[58] = new ModelRendererTurbo(this, 638, 1254, textureX, textureY); // Box 869
		tailModel[59] = new ModelRendererTurbo(this, 657, 489, textureX, textureY); // Box 870
		tailModel[60] = new ModelRendererTurbo(this, 646, 1241, textureX, textureY); // Box 871
		tailModel[61] = new ModelRendererTurbo(this, 642, 1217, textureX, textureY); // Box 872
		tailModel[62] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 873
		tailModel[63] = new ModelRendererTurbo(this, 657, 553, textureX, textureY); // Box 874
		tailModel[64] = new ModelRendererTurbo(this, 686, 1286, textureX, textureY); // Box 875
		tailModel[65] = new ModelRendererTurbo(this, 265, 369, textureX, textureY); // Box 876
		tailModel[66] = new ModelRendererTurbo(this, 473, 449, textureX, textureY); // Box 877
		tailModel[67] = new ModelRendererTurbo(this, 689, 449, textureX, textureY); // Box 878
		tailModel[68] = new ModelRendererTurbo(this, 889, 425, textureX, textureY); // Box 879
		tailModel[69] = new ModelRendererTurbo(this, 833, 449, textureX, textureY); // Box 880
		tailModel[70] = new ModelRendererTurbo(this, 1561, 553, textureX, textureY); // Box 881
		tailModel[71] = new ModelRendererTurbo(this, 1513, 457, textureX, textureY); // Box 882
		tailModel[72] = new ModelRendererTurbo(this, 825, 991, textureX, textureY); // Box 883
		tailModel[73] = new ModelRendererTurbo(this, 1705, 553, textureX, textureY); // Box 884
		tailModel[74] = new ModelRendererTurbo(this, 241, 473, textureX, textureY); // Box 885
		tailModel[75] = new ModelRendererTurbo(this, 697, 569, textureX, textureY); // Box 886
		tailModel[76] = new ModelRendererTurbo(this, 1112, 824, textureX, textureY); // Box 887
		tailModel[77] = new ModelRendererTurbo(this, 1025, 449, textureX, textureY); // Box 888
		tailModel[78] = new ModelRendererTurbo(this, 401, 517, textureX, textureY); // Box 889
		tailModel[79] = new ModelRendererTurbo(this, 1193, 473, textureX, textureY); // Box 890
		tailModel[80] = new ModelRendererTurbo(this, 2041, 401, textureX, textureY); // Box 891
		tailModel[81] = new ModelRendererTurbo(this, 1297, 473, textureX, textureY); // Box 892
		tailModel[82] = new ModelRendererTurbo(this, 1890, 944, textureX, textureY); // Box 893
		tailModel[83] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 894
		tailModel[84] = new ModelRendererTurbo(this, 1283, 750, textureX, textureY); // Box 895
		tailModel[85] = new ModelRendererTurbo(this, 425, 497, textureX, textureY); // Box 896
		tailModel[86] = new ModelRendererTurbo(this, 2025, 473, textureX, textureY); // Box 897
		tailModel[87] = new ModelRendererTurbo(this, 1713, 553, textureX, textureY); // Box 898
		tailModel[88] = new ModelRendererTurbo(this, 298, 759, textureX, textureY); // Box 899
		tailModel[89] = new ModelRendererTurbo(this, 100, 655, textureX, textureY); // Box 900
		tailModel[90] = new ModelRendererTurbo(this, 1441, 569, textureX, textureY); // Box 901
		tailModel[91] = new ModelRendererTurbo(this, 677, 1270, textureX, textureY); // Box 902
		tailModel[92] = new ModelRendererTurbo(this, 577, 449, textureX, textureY); // Box 904
		tailModel[93] = new ModelRendererTurbo(this, 1617, 489, textureX, textureY); // Box 905
		tailModel[94] = new ModelRendererTurbo(this, 929, 449, textureX, textureY); // Box 906
		tailModel[95] = new ModelRendererTurbo(this, 1569, 81, textureX, textureY); // Box 907
		tailModel[96] = new ModelRendererTurbo(this, 1425, 449, textureX, textureY); // Box 908
		tailModel[97] = new ModelRendererTurbo(this, 1905, 449, textureX, textureY); // Box 909
		tailModel[98] = new ModelRendererTurbo(this, 97, 457, textureX, textureY); // Box 910
		tailModel[99] = new ModelRendererTurbo(this, 153, 457, textureX, textureY); // Box 911
		tailModel[100] = new ModelRendererTurbo(this, 1513, 409, textureX, textureY); // Box 912
		tailModel[101] = new ModelRendererTurbo(this, 425, 457, textureX, textureY); // Box 913
		tailModel[102] = new ModelRendererTurbo(this, 857, 353, textureX, textureY); // Box 914
		tailModel[103] = new ModelRendererTurbo(this, 841, 393, textureX, textureY); // Box 915
		tailModel[104] = new ModelRendererTurbo(this, 425, 521, textureX, textureY); // Box 916
		tailModel[105] = new ModelRendererTurbo(this, 670, 1262, textureX, textureY); // Box 917
		tailModel[106] = new ModelRendererTurbo(this, 337, 369, textureX, textureY); // Box 918
		tailModel[107] = new ModelRendererTurbo(this, 41, 697, textureX, textureY); // Box 919
		tailModel[108] = new ModelRendererTurbo(this, 1513, 481, textureX, textureY); // Box 920
		tailModel[109] = new ModelRendererTurbo(this, 1377, 489, textureX, textureY); // Box 921
		tailModel[110] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Box 922
		tailModel[111] = new ModelRendererTurbo(this, 845, 1275, textureX, textureY); // Box 923

		tailModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F, 0F, 4.5F, 2.05F, 0F, 6.7F, -2.8F, 0F, 4F, 1F, 0F, 0F, -1F, 0F, -6.5F, 2.05F, 0F, -6.5F, -3.05F, 0F, -3F, 1F); // Box 9
		tailModel[0].setRotationPoint(159F, -49F, 31F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 104, 3, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -16F, -7F, -1F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -16F, 7F, -1F, 0F, 7F, 0F); // Box 7
		tailModel[1].setRotationPoint(71F, -60F, 29F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 58, 3, 5, 0F,0F, 0F, 0F, -1F, 5F, 12F, 1F, 3F, -15F, 15F, -7F, -1F, 0F, 0F, 0F, -1F, -6F, 12F, 1F, -6F, -16F, 15F, 7F, -1F); // Box 7
		tailModel[2].setRotationPoint(174F, -60F, 29F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 160, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 5F, -57F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 5F, -57F, 5F, 0F, 0F, 5F, 0F); // Box 5
		tailModel[3].setRotationPoint(71F, -65F, 22F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 160, 3, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -5F, 0F, 3F, 0F); // Box 4
		tailModel[4].setRotationPoint(71F, -68F, 14F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 6F, 0F, 1F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 6F, 0F, -2F, -7F, -2F, 0F, 1F); // Box 3
		tailModel[5].setRotationPoint(231F, -65F, 17F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 160, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F); // Box 3
		tailModel[6].setRotationPoint(71F, -69F, 5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 88, 3, 4, 0F,0F, 0F, 0F, 0F, 26F, 3F, 0F, 26F, -7F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -27F, 2F, 0F, -30F, -5F, 0F, -8F, 0F); // Box 2
		tailModel[7].setRotationPoint(71F, -23F, 34F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 31, 3, 1, 0F,0F, 0F, 0F, 0F, 2F, 8F, 0F, 2F, -8F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 9F, 0F, -3F, -9F, 0F, -1F, -1F); // Box 2
		tailModel[8].setRotationPoint(233F, -63F, 18F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 1F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F); // Box 157
		tailModel[9].setRotationPoint(213F, -67F, 122F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 2F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 156
		tailModel[10].setRotationPoint(213F, -68F, 122F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 12, 0, 8, 0F,3F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -0.5F, 0F); // Box 155
		tailModel[11].setRotationPoint(201F, -65F, 122F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 154
		tailModel[12].setRotationPoint(201F, -68F, 122F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 27, 4, 95, 0F,0F, 0F, 0F, 0F, -1F, 0F, -13F, 0.5F, -0.25F, 0F, 1F, 0F, 0F, -0.15F, 0F, 0F, -2.75F, 0F, -13F, -4F, -0.25F, 0F, -2F, 0F); // Box 153
		tailModel[13].setRotationPoint(213F, -67F, 27F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 27, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1F, 0F, -0.15F, 0F); // Box 152
		tailModel[14].setRotationPoint(213F, -66F, 14F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 27, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 151
		tailModel[15].setRotationPoint(213F, -67F, 14F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 37, 2, 103, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 0F, -22F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -25F, -2F, 0F); // Box 150
		tailModel[16].setRotationPoint(176F, -65F, 19F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 33, 3, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 2F, 0F); // Box 15
		tailModel[17].setRotationPoint(231F, -69F, 5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 37, 1, 103, 0F,0F, 0F, 0F, 0F, 1F, 4F, 0F, 2F, 0F, -25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, -22F, -1F, 0F); // Box 149
		tailModel[18].setRotationPoint(176F, -66F, 19F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 15, 107, 6, 0F,0F, 0F, 0F, 0F, -107F, 0F, 0F, -107F, -6F, 0F, -108F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 0F); // Box 148
		tailModel[19].setRotationPoint(235F, -174F, 6F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 1, 110, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -111F, 0F, 0F, -111F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 147
		tailModel[20].setRotationPoint(234F, -177F, 6F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 5, 114, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -115F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 146
		tailModel[21].setRotationPoint(229F, -181F, 6F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 15, 108, 1, 0F,0F, 0F, 0F, 0F, -108F, 0F, 0F, -108F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		tailModel[22].setRotationPoint(235F, -175F, 5F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 1, 111, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		tailModel[23].setRotationPoint(234F, -178F, 5F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 5, 115, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		tailModel[24].setRotationPoint(229F, -182F, 5F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 16, 114, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -115F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 142
		tailModel[25].setRotationPoint(213F, -181F, 6F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 16, 115, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		tailModel[26].setRotationPoint(213F, -182F, 5F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 5, 114, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -115F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 140
		tailModel[27].setRotationPoint(208F, -181F, 6F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 54, 2, 21, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 8F, -9F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -10F, -9F, 0F, -2F, 0F); // Box 14
		tailModel[28].setRotationPoint(179F, -52F, 5F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 5, 115, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		tailModel[29].setRotationPoint(208F, -182F, 5F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 27, 81, 6, 0F,0F, -19F, 0F, 0F, 31F, 0F, 0F, -82F, 0F, 0F, -82F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 138
		tailModel[30].setRotationPoint(181F, -148F, 6F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 12, 59, 6, 0F,0F, -19F, 0F, 0F, 3F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 137
		tailModel[31].setRotationPoint(169F, -126F, 6F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 12, 36, 6, 0F,0F, -19F, 0F, 0F, 3F, 0F, 0F, -37F, 0F, 0F, -37F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 136
		tailModel[32].setRotationPoint(157F, -104F, 6F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 51, 113, 1, 0F,0F, -94F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		tailModel[33].setRotationPoint(157F, -180F, 5F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 88, 7, 1, 0F,0F, 0F, 1F, 0F, 8F, 5F, 0F, 8F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -13F, 6F, 0F, -12F, -6F, 0F, 0F, 0F); // Box 134
		tailModel[34].setRotationPoint(71F, -45F, 38F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 86, 6, 1, 0F,0F, 4F, 0F, 2F, 17F, 6F, 2F, 17F, -6F, 0F, 4F, 0F, 0F, 0F, 0F, 2F, -21F, 7F, 2F, -22F, -6F, 0F, -10F, 0F); // Box 133
		tailModel[35].setRotationPoint(71F, -34F, 38F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 11, 16, 5, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, -17F, 1F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 0F); // Box 130
		tailModel[36].setRotationPoint(146F, -84F, 6F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 54, 2, 3, 0F,0F, 0F, 0F, 0F, 9F, 8F, 0F, 9F, -10F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -8F, 9F, 0F, -9F, -11F, 0F, -1.5F, -0.1F); // Box 13
		tailModel[37].setRotationPoint(179F, -54F, 26F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 16, 13, 5, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 129
		tailModel[38].setRotationPoint(130F, -81F, 6F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		tailModel[39].setRotationPoint(66F, -69F, 5F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 11, 11, 6, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, -12F, -1F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F); // Box 127
		tailModel[40].setRotationPoint(119F, -79F, 6F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 11, 9, 6, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 126
		tailModel[41].setRotationPoint(108F, -77F, 6F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 10, 7, 6, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 125
		tailModel[42].setRotationPoint(98F, -75F, 6F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F); // Box 124
		tailModel[43].setRotationPoint(88F, -73F, 6F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 123
		tailModel[44].setRotationPoint(72F, -71F, 6F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F); // Box 122
		tailModel[45].setRotationPoint(78F, -71F, 6F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0F, 0F, 8F, 1.4F, 0F, 8F, -2.35F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -8.45F, 1.05F, 0F, -8.45F, -2.05F, 0F, -2F, 1F); // Box 12
		tailModel[46].setRotationPoint(159F, -47F, 30F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 115
		tailModel[47].setRotationPoint(66F, -69F, 6F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 85, 20, 1, 0F,0F, -16F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		tailModel[48].setRotationPoint(72F, -86F, 5F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 88, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, -88F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -88F, 8F, 0F, 0F, 8F, 0F); // Box 100
		tailModel[49].setRotationPoint(71F, -53F, 34F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 10F, -1.4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -10.5F, -1.05F, 0F, -2F, 0F); // Box 10
		tailModel[50].setRotationPoint(159F, -45F, 26F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 88, 3, 5, 0F,0F, 1F, 0F, 0F, 31F, -1F, 0F, 33F, -3F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, -32F, -1F, 0F, -34F, -2F, 0F, -7F, 0F); // Box 1
		tailModel[51].setRotationPoint(71F, -16F, 29F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 33, 3, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 4F, 0F, -1F, -9F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -9F, 0F, 1F, -3F); // Box 1
		tailModel[52].setRotationPoint(231F, -67F, 14F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 31, 2, 21, 0F,0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, -16F, 0F, -10F, -9F, 0F, 9F, 0F, 0F, 5F, 0F, 0F, 5F, -17F, 0F, 8F, -9F); // Box 0
		tailModel[53].setRotationPoint(233F, -70F, 5F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 7F, -8F, -1F, 0F, 0F, 0F); // Box 375
		tailModel[54].setRotationPoint(71F, -44F, 36F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 1, 14, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 376
		tailModel[55].setRotationPoint(179F, -66F, 5F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,0F, 0F, 0F, 6F, -1F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 7F, -8F, -2F, 0F, -3F, 0F, 0F, 2F, 0F); // Box 497
		tailModel[56].setRotationPoint(71F, -44F, -28F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 4F, 1F, 0F, 6.7F, -2.8F, 0F, 4.5F, 2.05F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -6.5F, -3.05F, 0F, -6.5F, 2.05F, 0F, 0F, -1F); // Box 868
		tailModel[57].setRotationPoint(159F, -49F, -22F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 104, 3, 5, 0F,0F, -7F, 0F, -16F, -7F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -16F, 7F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 869
		tailModel[58].setRotationPoint(71F, -60F, -24F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 58, 3, 5, 0F,15F, -7F, -1F, 1F, 3F, -15F, -1F, 5F, 12F, 0F, 0F, 0F, 15F, 7F, -1F, 1F, -6F, -16F, -1F, -6F, 12F, 0F, 0F, 0F); // Box 870
		tailModel[59].setRotationPoint(174F, -60F, -24F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 160, 3, 7, 0F,0F, -5F, 0F, -57F, -5F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 5F, 0F, -57F, 5F, 0F, 0F, -1F, 5F, 0F, 0F, 0F); // Box 871
		tailModel[60].setRotationPoint(71F, -65F, -19F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 160, 3, 8, 0F,0F, -3F, 0F, 0F, -3F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, -5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 872
		tailModel[61].setRotationPoint(71F, -68F, -12F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F,0F, 0F, -1F, 0F, 1F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, -2F, -7F, 0F, -2F, 6F, 0F, 0F, 0F); // Box 873
		tailModel[62].setRotationPoint(231F, -65F, -8F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 160, 3, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		tailModel[63].setRotationPoint(71F, -69F, -4F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 88, 3, 4, 0F,0F, 8F, 0F, 0F, 26F, -7F, 0F, 26F, 3F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -30F, -5F, 0F, -27F, 2F, 0F, 0F, 0F); // Box 875
		tailModel[64].setRotationPoint(71F, -23F, -28F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 31, 3, 1, 0F,0F, 0F, 0F, 0F, 2F, -8F, 0F, 2F, 8F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -9F, 0F, -3F, 9F, 0F, 0F, 1F); // Box 876
		tailModel[65].setRotationPoint(233F, -63F, -9F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 1F, 0F); // Box 877
		tailModel[66].setRotationPoint(213F, -67F, -120F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F); // Box 878
		tailModel[67].setRotationPoint(213F, -68F, -120F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 12, 0, 8, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, -3F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		tailModel[68].setRotationPoint(201F, -65F, -120F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, 1F, 0F); // Box 880
		tailModel[69].setRotationPoint(201F, -68F, -120F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 27, 4, 95, 0F,0F, 1F, 0F, -13F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -13F, -4F, -0.25F, 0F, -2.75F, 0F, 0F, -0.15F, 0F); // Box 881
		tailModel[70].setRotationPoint(213F, -67F, -112F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 27, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		tailModel[71].setRotationPoint(213F, -66F, -17F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 27, 1, 13, 0F,0F, 0.1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 883
		tailModel[72].setRotationPoint(213F, -67F, -17F);

		tailModel[73].addShapeBox(0F, 0F, 0F, 37, 2, 103, 0F,-22F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		tailModel[73].setRotationPoint(176F, -65F, -112F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 33, 3, 9, 0F,0F, -2F, 0F, 0F, -2.5F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 885
		tailModel[74].setRotationPoint(231F, -69F, -4F);

		tailModel[75].addShapeBox(0F, 0F, 0F, 37, 1, 103, 0F,-25F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 4F, 0F, 0F, 0F, -22F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 886
		tailModel[75].setRotationPoint(176F, -66F, -112F);

		tailModel[76].addShapeBox(0F, 0F, 0F, 15, 107, 6, 0F,0F, -108F, 0F, 0F, -107F, -6F, 0F, -107F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 887
		tailModel[76].setRotationPoint(235F, -174F, -2F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 1, 110, 6, 0F,0F, -111F, 0F, 0F, -111F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 888
		tailModel[77].setRotationPoint(234F, -177F, -2F);

		tailModel[78].addShapeBox(0F, 0F, 0F, 5, 114, 6, 0F,0F, -115F, 0F, 0F, -115F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
		tailModel[78].setRotationPoint(229F, -181F, -2F);

		tailModel[79].addShapeBox(0F, 0F, 0F, 15, 108, 1, 0F,0F, -1F, 0F, 0F, -108F, 0F, 0F, -108F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		tailModel[79].setRotationPoint(235F, -175F, 4F);

		tailModel[80].addShapeBox(0F, 0F, 0F, 1, 111, 1, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		tailModel[80].setRotationPoint(234F, -178F, 4F);

		tailModel[81].addShapeBox(0F, 0F, 0F, 5, 115, 1, 0F,0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 892
		tailModel[81].setRotationPoint(229F, -182F, 4F);

		tailModel[82].addShapeBox(0F, 0F, 0F, 16, 114, 6, 0F,0F, -115F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 893
		tailModel[82].setRotationPoint(213F, -181F, -2F);

		tailModel[83].addShapeBox(0F, 0F, 0F, 16, 115, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		tailModel[83].setRotationPoint(213F, -182F, 4F);

		tailModel[84].addShapeBox(0F, 0F, 0F, 5, 114, 6, 0F,0F, -115F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 895
		tailModel[84].setRotationPoint(208F, -181F, -2F);

		tailModel[85].addShapeBox(0F, 0F, 0F, 54, 2, 21, 0F,0F, 2F, 0F, 0F, 8F, -9F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, -9F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 896
		tailModel[85].setRotationPoint(179F, -52F, -16F);

		tailModel[86].addShapeBox(0F, 0F, 0F, 5, 115, 1, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 897
		tailModel[86].setRotationPoint(208F, -182F, 4F);

		tailModel[87].addShapeBox(0F, 0F, 0F, 27, 81, 6, 0F,0F, -82F, 0F, 0F, -82F, 0F, 0F, 31F, 0F, 0F, -19F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		tailModel[87].setRotationPoint(181F, -148F, -2F);

		tailModel[88].addShapeBox(0F, 0F, 0F, 12, 59, 6, 0F,0F, -60F, 0F, 0F, -60F, 0F, 0F, 3F, 0F, 0F, -19F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		tailModel[88].setRotationPoint(169F, -126F, -2F);

		tailModel[89].addShapeBox(0F, 0F, 0F, 12, 36, 6, 0F,0F, -37F, 0F, 0F, -37F, 0F, 0F, 3F, 0F, 0F, -19F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		tailModel[89].setRotationPoint(157F, -104F, -2F);

		tailModel[90].addShapeBox(0F, 0F, 0F, 51, 113, 1, 0F,0F, -95F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -94F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 901
		tailModel[90].setRotationPoint(157F, -180F, 4F);

		tailModel[91].addShapeBox(0F, 0F, 0F, 88, 7, 1, 0F,0F, 0F, -1F, 0F, 8F, -6F, 0F, 8F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -12F, -6F, 0F, -13F, 6F, 0F, 0F, 0F); // Box 902
		tailModel[91].setRotationPoint(71F, -45F, -29F);

		tailModel[92].addShapeBox(0F, 0F, 0F, 11, 16, 5, 0F,0F, -17F, 0F, 0F, -17F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		tailModel[92].setRotationPoint(146F, -84F, -1F);

		tailModel[93].addShapeBox(0F, 0F, 0F, 54, 2, 3, 0F,0F, 1F, 0F, 0F, 9F, -10F, 0F, 9F, 8F, 0F, 0F, 0F, 0F, -1.5F, -0.1F, 0F, -9F, -11F, 0F, -8F, 9F, 0F, 0F, 0F); // Box 905
		tailModel[93].setRotationPoint(179F, -54F, -19F);

		tailModel[94].addShapeBox(0F, 0F, 0F, 16, 13, 5, 0F,0F, -14F, 0F, 0F, -14F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
		tailModel[94].setRotationPoint(130F, -81F, -1F);

		tailModel[95].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		tailModel[95].setRotationPoint(66F, -69F, 4F);

		tailModel[96].addShapeBox(0F, 0F, 0F, 11, 11, 6, 0F,0F, -12F, 0F, 0F, -12F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		tailModel[96].setRotationPoint(119F, -79F, -2F);

		tailModel[97].addShapeBox(0F, 0F, 0F, 11, 9, 6, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		tailModel[97].setRotationPoint(108F, -77F, -2F);

		tailModel[98].addShapeBox(0F, 0F, 0F, 10, 7, 6, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		tailModel[98].setRotationPoint(98F, -75F, -2F);

		tailModel[99].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		tailModel[99].setRotationPoint(88F, -73F, -2F);

		tailModel[100].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		tailModel[100].setRotationPoint(72F, -71F, -3F);

		tailModel[101].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, -4F, 0F, 0F, -4F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		tailModel[101].setRotationPoint(78F, -71F, -3F);

		tailModel[102].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 2F, 0F, 0F, 8F, -2.35F, 0F, 8F, 1.4F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -8.45F, -2.05F, 0F, -8.45F, 1.05F, 0F, 0F, 0F); // Box 914
		tailModel[102].setRotationPoint(159F, -47F, -21F);

		tailModel[103].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,-3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 915
		tailModel[103].setRotationPoint(66F, -69F, -3F);

		tailModel[104].addShapeBox(0F, 0F, 0F, 85, 20, 1, 0F,0F, -17F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916
		tailModel[104].setRotationPoint(72F, -86F, 4F);

		tailModel[105].addShapeBox(0F, 0F, 0F, 88, 3, 4, 0F,0F, -8F, 0F, -88F, -8F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 8F, 0F, -88F, 8F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 917
		tailModel[105].setRotationPoint(71F, -53F, -28F);

		tailModel[106].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 2F, 0F, 0F, 10F, -1.4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10.5F, -1.05F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 918
		tailModel[106].setRotationPoint(159F, -45F, -20F);

		tailModel[107].addShapeBox(0F, 0F, 0F, 88, 3, 5, 0F,0F, 7F, 0F, 0F, 33F, -3F, 0F, 31F, -1F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -34F, -2F, 0F, -32F, -1F, 0F, -1F, 0F); // Box 919
		tailModel[107].setRotationPoint(71F, -16F, -24F);

		tailModel[108].addShapeBox(0F, 0F, 0F, 33, 3, 6, 0F,0F, -2F, -3F, 0F, -1F, -9F, 0F, -0.5F, 4F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, -9F, 0F, -1F, 4F, 0F, 0F, 0F); // Box 920
		tailModel[108].setRotationPoint(231F, -67F, -10F);

		tailModel[109].addShapeBox(0F, 0F, 0F, 31, 2, 21, 0F,0F, -10F, -9F, 0F, -5F, -16F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, 8F, -9F, 0F, 5F, -17F, 0F, 5F, 0F, 0F, 9F, 0F); // Box 921
		tailModel[109].setRotationPoint(233F, -70F, -16F);

		tailModel[110].addShapeBox(0F, 0F, 0F, 1, 14, 24, 0F,0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		tailModel[110].setRotationPoint(179F, -66F, -19F);

		tailModel[111].addShapeBox(0F, 0F, 0F, 86, 6, 1, 0F,0F, 4F, 0F, 2F, 17F, -6F, 2F, 17F, 6F, 0F, 4F, 0F, 0F, -10F, 0F, 2F, -22F, -6F, 2F, -21F, 7F, 0F, 0F, 0F); // Box 923
		tailModel[111].setRotationPoint(71F, -34F, -29F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1865, 241, textureX, textureY); // Box 432
		leftWingModel[1] = new ModelRendererTurbo(this, 593, 273, textureX, textureY); // Box 433
		leftWingModel[2] = new ModelRendererTurbo(this, 641, 273, textureX, textureY); // Box 434
		leftWingModel[3] = new ModelRendererTurbo(this, 825, 273, textureX, textureY); // Box 446
		leftWingModel[4] = new ModelRendererTurbo(this, 1753, 281, textureX, textureY); // Box 447
		leftWingModel[5] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 448
		leftWingModel[6] = new ModelRendererTurbo(this, 1737, 361, textureX, textureY); // Box 549
		leftWingModel[7] = new ModelRendererTurbo(this, 1809, 361, textureX, textureY); // Box 550
		leftWingModel[8] = new ModelRendererTurbo(this, 1585, 345, textureX, textureY); // Box 551
		leftWingModel[9] = new ModelRendererTurbo(this, 1857, 361, textureX, textureY); // Box 552
		leftWingModel[10] = new ModelRendererTurbo(this, 1993, 361, textureX, textureY); // Box 553
		leftWingModel[11] = new ModelRendererTurbo(this, 1121, 369, textureX, textureY); // Box 554
		leftWingModel[12] = new ModelRendererTurbo(this, 1169, 369, textureX, textureY); // Box 555
		leftWingModel[13] = new ModelRendererTurbo(this, 1201, 369, textureX, textureY); // Box 556
		leftWingModel[14] = new ModelRendererTurbo(this, 1241, 369, textureX, textureY); // Box 557
		leftWingModel[15] = new ModelRendererTurbo(this, 1897, 369, textureX, textureY); // Box 558
		leftWingModel[16] = new ModelRendererTurbo(this, 873, 377, textureX, textureY); // Box 559
		leftWingModel[17] = new ModelRendererTurbo(this, 889, 377, textureX, textureY); // Box 560
		leftWingModel[18] = new ModelRendererTurbo(this, 857, 361, textureX, textureY); // Box 561
		leftWingModel[19] = new ModelRendererTurbo(this, 1945, 369, textureX, textureY); // Box 562
		leftWingModel[20] = new ModelRendererTurbo(this, 841, 377, textureX, textureY); // Box 563
		leftWingModel[21] = new ModelRendererTurbo(this, 985, 377, textureX, textureY); // Box 564
		leftWingModel[22] = new ModelRendererTurbo(this, 1033, 377, textureX, textureY); // Box 565
		leftWingModel[23] = new ModelRendererTurbo(this, 1313, 377, textureX, textureY); // Box 566
		leftWingModel[24] = new ModelRendererTurbo(this, 1065, 377, textureX, textureY); // Box 567
		leftWingModel[25] = new ModelRendererTurbo(this, 1361, 377, textureX, textureY); // Box 568
		leftWingModel[26] = new ModelRendererTurbo(this, 1417, 377, textureX, textureY); // Box 569
		leftWingModel[27] = new ModelRendererTurbo(this, 1465, 377, textureX, textureY); // Box 570
		leftWingModel[28] = new ModelRendererTurbo(this, 1545, 377, textureX, textureY); // Box 571
		leftWingModel[29] = new ModelRendererTurbo(this, 1665, 377, textureX, textureY); // Box 572
		leftWingModel[30] = new ModelRendererTurbo(this, 1617, 385, textureX, textureY); // Box 573
		leftWingModel[31] = new ModelRendererTurbo(this, 1585, 361, textureX, textureY); // Box 574
		leftWingModel[32] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 575
		leftWingModel[33] = new ModelRendererTurbo(this, 41, 393, textureX, textureY); // Box 576
		leftWingModel[34] = new ModelRendererTurbo(this, 113, 393, textureX, textureY); // Box 577
		leftWingModel[35] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Box 578
		leftWingModel[36] = new ModelRendererTurbo(this, 201, 393, textureX, textureY); // Box 579
		leftWingModel[37] = new ModelRendererTurbo(this, 2001, 385, textureX, textureY); // Box 580
		leftWingModel[38] = new ModelRendererTurbo(this, 249, 393, textureX, textureY); // Box 581
		leftWingModel[39] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Box 582
		leftWingModel[40] = new ModelRendererTurbo(this, 329, 393, textureX, textureY); // Box 583
		leftWingModel[41] = new ModelRendererTurbo(this, 1129, 393, textureX, textureY); // Box 584
		leftWingModel[42] = new ModelRendererTurbo(this, 1193, 393, textureX, textureY); // Box 585
		leftWingModel[43] = new ModelRendererTurbo(this, 1785, 361, textureX, textureY); // Box 586
		leftWingModel[44] = new ModelRendererTurbo(this, 1665, 393, textureX, textureY); // Box 587
		leftWingModel[45] = new ModelRendererTurbo(this, 1705, 393, textureX, textureY); // Box 588
		leftWingModel[46] = new ModelRendererTurbo(this, 1745, 393, textureX, textureY); // Box 589
		leftWingModel[47] = new ModelRendererTurbo(this, 1817, 393, textureX, textureY); // Box 590
		leftWingModel[48] = new ModelRendererTurbo(this, 1073, 17, textureX, textureY); // Box 591
		leftWingModel[49] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 592
		leftWingModel[50] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 593
		leftWingModel[51] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 594
		leftWingModel[52] = new ModelRendererTurbo(this, 1953, 393, textureX, textureY); // Box 595
		leftWingModel[53] = new ModelRendererTurbo(this, 1201, 401, textureX, textureY); // Box 596
		leftWingModel[54] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 597
		leftWingModel[55] = new ModelRendererTurbo(this, 1273, 17, textureX, textureY); // Box 598
		leftWingModel[56] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 599
		leftWingModel[57] = new ModelRendererTurbo(this, 1433, 97, textureX, textureY); // Box 600
		leftWingModel[58] = new ModelRendererTurbo(this, 1865, 385, textureX, textureY); // Box 601
		leftWingModel[59] = new ModelRendererTurbo(this, 329, 393, textureX, textureY); // Box 602
		leftWingModel[60] = new ModelRendererTurbo(this, 1305, 401, textureX, textureY); // Box 603
		leftWingModel[61] = new ModelRendererTurbo(this, 1383, 1167, textureX, textureY); // Box 604
		leftWingModel[62] = new ModelRendererTurbo(this, 89, 393, textureX, textureY); // Box 605
		leftWingModel[63] = new ModelRendererTurbo(this, 1889, 401, textureX, textureY); // Box 606
		leftWingModel[64] = new ModelRendererTurbo(this, 1425, 401, textureX, textureY); // Box 607
		leftWingModel[65] = new ModelRendererTurbo(this, 857, 409, textureX, textureY); // Box 608
		leftWingModel[66] = new ModelRendererTurbo(this, 985, 409, textureX, textureY); // Box 609
		leftWingModel[67] = new ModelRendererTurbo(this, 1041, 409, textureX, textureY); // Box 610
		leftWingModel[68] = new ModelRendererTurbo(this, 1353, 409, textureX, textureY); // Box 611
		leftWingModel[69] = new ModelRendererTurbo(this, 1793, 393, textureX, textureY); // Box 612
		leftWingModel[70] = new ModelRendererTurbo(this, 257, 417, textureX, textureY); // Box 613
		leftWingModel[71] = new ModelRendererTurbo(this, 1089, 409, textureX, textureY); // Box 614
		leftWingModel[72] = new ModelRendererTurbo(this, 297, 417, textureX, textureY); // Box 615
		leftWingModel[73] = new ModelRendererTurbo(this, 1207, 953, textureX, textureY); // Box 616
		leftWingModel[74] = new ModelRendererTurbo(this, 1641, 409, textureX, textureY); // Box 617
		leftWingModel[75] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 618
		leftWingModel[76] = new ModelRendererTurbo(this, 417, 417, textureX, textureY); // Box 619
		leftWingModel[77] = new ModelRendererTurbo(this, 465, 417, textureX, textureY); // Box 620
		leftWingModel[78] = new ModelRendererTurbo(this, 537, 417, textureX, textureY); // Box 621
		leftWingModel[79] = new ModelRendererTurbo(this, 897, 409, textureX, textureY); // Box 622
		leftWingModel[80] = new ModelRendererTurbo(this, 585, 417, textureX, textureY); // Box 623
		leftWingModel[81] = new ModelRendererTurbo(this, 633, 417, textureX, textureY); // Box 624
		leftWingModel[82] = new ModelRendererTurbo(this, 665, 417, textureX, textureY); // Box 625
		leftWingModel[83] = new ModelRendererTurbo(this, 713, 417, textureX, textureY); // Box 626
		leftWingModel[84] = new ModelRendererTurbo(this, 753, 417, textureX, textureY); // Box 627
		leftWingModel[85] = new ModelRendererTurbo(this, 1144, 939, textureX, textureY); // Box 628
		leftWingModel[86] = new ModelRendererTurbo(this, 1129, 417, textureX, textureY); // Box 629
		leftWingModel[87] = new ModelRendererTurbo(this, 801, 417, textureX, textureY); // Box 630
		leftWingModel[88] = new ModelRendererTurbo(this, 1401, 417, textureX, textureY); // Box 631
		leftWingModel[89] = new ModelRendererTurbo(this, 1681, 417, textureX, textureY); // Box 632
		leftWingModel[90] = new ModelRendererTurbo(this, 1865, 417, textureX, textureY); // Box 633
		leftWingModel[91] = new ModelRendererTurbo(this, 1921, 417, textureX, textureY); // Box 634
		leftWingModel[92] = new ModelRendererTurbo(this, 513, 417, textureX, textureY); // Box 635
		leftWingModel[93] = new ModelRendererTurbo(this, 1007, 1157, textureX, textureY); // Box 636
		leftWingModel[94] = new ModelRendererTurbo(this, 1961, 417, textureX, textureY); // Box 637
		leftWingModel[95] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 638
		leftWingModel[96] = new ModelRendererTurbo(this, 1521, 25, textureX, textureY); // Box 639
		leftWingModel[97] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 640
		leftWingModel[98] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 641
		leftWingModel[99] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 642
		leftWingModel[100] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 643
		leftWingModel[101] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 644
		leftWingModel[102] = new ModelRendererTurbo(this, 613, 783, textureX, textureY); // Box 645
		leftWingModel[103] = new ModelRendererTurbo(this, 97, 425, textureX, textureY); // Box 646
		leftWingModel[104] = new ModelRendererTurbo(this, 1617, 129, textureX, textureY); // Box 647
		leftWingModel[105] = new ModelRendererTurbo(this, 2009, 401, textureX, textureY); // Box 648
		leftWingModel[106] = new ModelRendererTurbo(this, 201, 425, textureX, textureY); // Box 649
		leftWingModel[107] = new ModelRendererTurbo(this, 785, 425, textureX, textureY); // Box 650
		leftWingModel[108] = new ModelRendererTurbo(this, 1177, 425, textureX, textureY); // Box 651
		leftWingModel[109] = new ModelRendererTurbo(this, 1801, 425, textureX, textureY); // Box 652
		leftWingModel[110] = new ModelRendererTurbo(this, 465, 441, textureX, textureY); // Box 653
		leftWingModel[111] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Box 654
		leftWingModel[112] = new ModelRendererTurbo(this, 897, 441, textureX, textureY); // Box 655
		leftWingModel[113] = new ModelRendererTurbo(this, 1305, 433, textureX, textureY); // Box 656
		leftWingModel[114] = new ModelRendererTurbo(this, 1513, 433, textureX, textureY); // Box 657
		leftWingModel[115] = new ModelRendererTurbo(this, 1513, 433, textureX, textureY); // Box 658
		leftWingModel[116] = new ModelRendererTurbo(this, 1617, 433, textureX, textureY); // Box 659
		leftWingModel[117] = new ModelRendererTurbo(this, 1535, 739, textureX, textureY); // Box 660
		leftWingModel[118] = new ModelRendererTurbo(this, 1098, 954, textureX, textureY); // Box 661
		leftWingModel[119] = new ModelRendererTurbo(this, 249, 441, textureX, textureY); // Box 662
		leftWingModel[120] = new ModelRendererTurbo(this, 569, 1559, textureX, textureY); // Box 964
		leftWingModel[121] = new ModelRendererTurbo(this, 572, 1559, textureX, textureY); // Box 965
		leftWingModel[122] = new ModelRendererTurbo(this, 256, 1560, textureX, textureY); // Box 966
		leftWingModel[123] = new ModelRendererTurbo(this, 848, 1564, textureX, textureY); // Box 967

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		leftWingModel[0].setRotationPoint(-13F, -69F, -162F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		leftWingModel[1].setRotationPoint(-13F, -67F, -166F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		leftWingModel[2].setRotationPoint(-13F, -68F, -164F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		leftWingModel[3].setRotationPoint(-27F, -69F, -162F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		leftWingModel[4].setRotationPoint(-27F, -67F, -166F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		leftWingModel[5].setRotationPoint(-27F, -68F, -164F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 14, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 549
		leftWingModel[6].setRotationPoint(-13F, -57F, -84F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 550
		leftWingModel[7].setRotationPoint(-13F, -62F, -84F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftWingModel[8].setRotationPoint(-13F, -69F, -78F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		leftWingModel[9].setRotationPoint(-13F, -67F, -82F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		leftWingModel[10].setRotationPoint(-13F, -68F, -80F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		leftWingModel[11].setRotationPoint(-13F, -65F, -84F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 555
		leftWingModel[12].setRotationPoint(-27F, -44F, -79F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 556
		leftWingModel[13].setRotationPoint(-27F, -46F, -82F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 557
		leftWingModel[14].setRotationPoint(-27F, -53F, -84F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 558
		leftWingModel[15].setRotationPoint(-27F, -60F, -84F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 559
		leftWingModel[16].setRotationPoint(-55F, -52F, -168F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 17, 9, 57, 0F,0F, 2.2F, 0F, -12F, 2F, 0F, -6.2F, 0.6F, 0F, 0F, 1F, 0F, 0F, -5.7F, 0F, -12F, -6F, 0F, -6.2F, -3.65F, 0F, 0F, -3F, 0F); // Box 560
		leftWingModel[17].setRotationPoint(2F, -69F, -214F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		leftWingModel[18].setRotationPoint(-27F, -69F, -78F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		leftWingModel[19].setRotationPoint(-27F, -67F, -82F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		leftWingModel[20].setRotationPoint(-27F, -68F, -80F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 564
		leftWingModel[21].setRotationPoint(-27F, -65F, -84F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		leftWingModel[22].setRotationPoint(-72F, -67F, -78F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		leftWingModel[23].setRotationPoint(-72F, -65F, -82F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 17, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 567
		leftWingModel[24].setRotationPoint(-72F, -63F, -84F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 568
		leftWingModel[25].setRotationPoint(-72F, -58F, -84F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 569
		leftWingModel[26].setRotationPoint(-72F, -44F, -82F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		leftWingModel[27].setRotationPoint(-72F, -51F, -84F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 22, 7, 12, 0F,0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 571
		leftWingModel[28].setRotationPoint(19F, -68F, -95F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 572
		leftWingModel[29].setRotationPoint(-55F, -43F, -163F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 573
		leftWingModel[30].setRotationPoint(-72F, -42F, -79F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 574
		leftWingModel[31].setRotationPoint(-55F, -68F, -78F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 575
		leftWingModel[32].setRotationPoint(-55F, -66F, -82F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 576
		leftWingModel[33].setRotationPoint(-55F, -64F, -84F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 577
		leftWingModel[34].setRotationPoint(-55F, -59F, -84F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 578
		leftWingModel[35].setRotationPoint(-55F, -45F, -82F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 579
		leftWingModel[36].setRotationPoint(-55F, -52F, -84F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 580
		leftWingModel[37].setRotationPoint(-55F, -43F, -79F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 581
		leftWingModel[38].setRotationPoint(-41F, -44F, -79F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 582
		leftWingModel[39].setRotationPoint(-41F, -46F, -82F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 583
		leftWingModel[40].setRotationPoint(-41F, -44F, -163F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 17, 9, 12, 0F,0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.55F, 0F, 0F, -1.65F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F); // Box 584
		leftWingModel[41].setRotationPoint(2F, -69F, -95F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 585
		leftWingModel[42].setRotationPoint(-41F, -53F, -84F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 586
		leftWingModel[43].setRotationPoint(-41F, -69F, -78F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 587
		leftWingModel[44].setRotationPoint(-41F, -68F, -80F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 588
		leftWingModel[45].setRotationPoint(-41F, -67F, -82F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 589
		leftWingModel[46].setRotationPoint(-41F, -65F, -84F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 590
		leftWingModel[47].setRotationPoint(-41F, -60F, -84F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		leftWingModel[48].setRotationPoint(-74F, -51F, -164F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		leftWingModel[49].setRotationPoint(-74F, -42F, -160F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 593
		leftWingModel[50].setRotationPoint(-74F, -42F, -163F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 594
		leftWingModel[51].setRotationPoint(-74F, -42F, -155F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 595
		leftWingModel[52].setRotationPoint(-41F, -46F, -166F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 17, 9, 62, 0F,0F, 1F, 0F, -6.2F, 0.6F, 0F, 0F, -1F, 0F, 0F, 0.65F, 0F, 0F, -3F, 0F, -6.2F, -3.65F, 0F, 0F, -1F, 0F, 0F, -1.65F, 0F); // Box 596
		leftWingModel[53].setRotationPoint(2F, -69F, -157F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 597
		leftWingModel[54].setRotationPoint(-74F, -44F, -152F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 598
		leftWingModel[55].setRotationPoint(-74F, -44F, -166F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 599
		leftWingModel[56].setRotationPoint(-74F, -51F, -165F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 600
		leftWingModel[57].setRotationPoint(-74F, -51F, -153F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 2, 13, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 601
		leftWingModel[58].setRotationPoint(-74F, -63F, -165F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 17, 9, 50, 0F,0F, 0.55F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1.45F, 0F, 0F, -0.25F, 0F); // Box 602
		leftWingModel[59].setRotationPoint(2F, -69F, -83F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 603
		leftWingModel[60].setRotationPoint(-41F, -53F, -168F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 49, 9, 21, 0F,0F, 0.25F, 0F, -10F, -5F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, -0.3F, 0F, -10F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 604
		leftWingModel[61].setRotationPoint(2F, -69F, -33F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 605
		leftWingModel[62].setRotationPoint(-41F, -69F, -162F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		leftWingModel[63].setRotationPoint(-72F, -66F, -164F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 607
		leftWingModel[64].setRotationPoint(-55F, -67F, -164F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 608
		leftWingModel[65].setRotationPoint(-13F, -47F, -163F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 609
		leftWingModel[66].setRotationPoint(-13F, -48F, -166F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 14, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 610
		leftWingModel[67].setRotationPoint(-13F, -57F, -168F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 611
		leftWingModel[68].setRotationPoint(-13F, -62F, -168F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		leftWingModel[69].setRotationPoint(-13F, -69F, -162F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		leftWingModel[70].setRotationPoint(-13F, -67F, -166F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		leftWingModel[71].setRotationPoint(-13F, -68F, -164F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 615
		leftWingModel[72].setRotationPoint(-13F, -65F, -168F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 12, 8, 145, 0F,5F, 3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 5F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		leftWingModel[73].setRotationPoint(-10F, -71F, -302F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 617
		leftWingModel[74].setRotationPoint(-41F, -68F, -164F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 618
		leftWingModel[75].setRotationPoint(-27F, -44F, -163F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 619
		leftWingModel[76].setRotationPoint(-27F, -46F, -166F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 620
		leftWingModel[77].setRotationPoint(-27F, -53F, -168F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 621
		leftWingModel[78].setRotationPoint(-27F, -60F, -168F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		leftWingModel[79].setRotationPoint(-27F, -69F, -162F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		leftWingModel[80].setRotationPoint(-27F, -67F, -166F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		leftWingModel[81].setRotationPoint(-27F, -68F, -164F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 625
		leftWingModel[82].setRotationPoint(-27F, -65F, -168F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		leftWingModel[83].setRotationPoint(-72F, -67F, -162F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		leftWingModel[84].setRotationPoint(-72F, -65F, -166F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 7, 8, 145, 0F,5F, 4F, 0F, 0F, 2F, 0F, 0F, 1F, 17F, 0F, 1F, 17F, 5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 628
		leftWingModel[85].setRotationPoint(-5F, -68F, -157F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 629
		leftWingModel[86].setRotationPoint(-41F, -67F, -166F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 17, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 630
		leftWingModel[87].setRotationPoint(-72F, -63F, -168F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 631
		leftWingModel[88].setRotationPoint(-72F, -58F, -168F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 632
		leftWingModel[89].setRotationPoint(-72F, -44F, -166F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 633
		leftWingModel[90].setRotationPoint(-72F, -51F, -168F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 634
		leftWingModel[91].setRotationPoint(-72F, -42F, -163F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 635
		leftWingModel[92].setRotationPoint(-55F, -68F, -162F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 22, 7, 119, 0F,12F, 3F, 0F, -18.75F, 0.25F, 0.75F, -1F, -2.75F, -2.75F, 0F, 0F, 0F, 12F, -5F, 0F, -18.75F, -7F, 0.75F, -1F, -3.75F, -2.75F, 0F, 0F, 0F); // Box 636
		leftWingModel[93].setRotationPoint(19F, -68F, -214F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 637
		leftWingModel[94].setRotationPoint(-55F, -66F, -166F);

		leftWingModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		leftWingModel[95].setRotationPoint(-74F, -51F, -80F);

		leftWingModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		leftWingModel[96].setRotationPoint(-74F, -42F, -76F);

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 640
		leftWingModel[97].setRotationPoint(-74F, -42F, -79F);

		leftWingModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 641
		leftWingModel[98].setRotationPoint(-74F, -42F, -71F);

		leftWingModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 642
		leftWingModel[99].setRotationPoint(-74F, -44F, -68F);

		leftWingModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 643
		leftWingModel[100].setRotationPoint(-74F, -44F, -82F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 644
		leftWingModel[101].setRotationPoint(-74F, -51F, -81F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 22, 7, 50, 0F,0F, 0F, 0F, 0F, -2.75F, -0.5F, 0F, -4.25F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.75F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.4F, 0F); // Box 645
		leftWingModel[102].setRotationPoint(19F, -68F, -83F);

		leftWingModel[103].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 646
		leftWingModel[103].setRotationPoint(-55F, -64F, -168F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 647
		leftWingModel[104].setRotationPoint(-74F, -51F, -69F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 2, 13, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 648
		leftWingModel[105].setRotationPoint(-74F, -63F, -81F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 649
		leftWingModel[106].setRotationPoint(-55F, -59F, -168F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 5, 5, 88, 0F,0F, 1F, 0F, -1.5F, 0.5F, 0F, 11F, -2F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5.5F, 0F, 11F, -2F, -1F, 0F, 0F, 0F); // Box 650
		leftWingModel[107].setRotationPoint(7F, -71F, -302F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		leftWingModel[108].setRotationPoint(-72F, -66F, -80F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 652
		leftWingModel[109].setRotationPoint(-55F, -67F, -80F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 20, 4, 145, 0F,-2F, 4F, 0F, -5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 653
		leftWingModel[110].setRotationPoint(-30F, -67F, -302F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 654
		leftWingModel[111].setRotationPoint(-13F, -47F, -79F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 25, 5, 145, 0F,1F, 2F, 0F, -6F, 2F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -1F, -3F, 0F, -6F, -3F, 0F, -1F, 0F, -7F, 0F, 0F, -7F); // Box 655
		leftWingModel[112].setRotationPoint(-29F, -65F, -157F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 656
		leftWingModel[113].setRotationPoint(-13F, -48F, -82F);

		leftWingModel[114].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 657
		leftWingModel[114].setRotationPoint(-55F, -45F, -166F);

		leftWingModel[115].addShapeBox(0F, 0F, 0F, 5, 5, 88, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 658
		leftWingModel[115].setRotationPoint(2F, -71F, -302F);

		leftWingModel[116].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 659
		leftWingModel[116].setRotationPoint(-41F, -65F, -168F);

		leftWingModel[117].addShapeBox(0F, 0F, 0F, 24, 3, 145, 0F,-3F, 4F, 0F, -10F, 6F, 0F, -5F, 4F, 0F, 0F, 1F, 0F, -1F, -6F, 0F, -10F, -7F, 0F, -5F, -2F, 0F, 1F, -2F, 0F); // Box 660
		leftWingModel[117].setRotationPoint(-29F, -68F, -302F);

		leftWingModel[118].addShapeBox(0F, 0F, 0F, 24, 3, 145, 0F,0F, 1F, 0F, -5F, 4F, 0F, 0F, 1F, 17F, -3F, 1F, 17F, 1F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 661
		leftWingModel[118].setRotationPoint(-29F, -68F, -157F);

		leftWingModel[119].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 662
		leftWingModel[119].setRotationPoint(-41F, -60F, -168F);

		leftWingModel[120].addShapeBox(0F, 0F, 0F, 160, 1, 290, 0F,-60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F); // Box 964
		leftWingModel[120].setRotationPoint(-81F, -72.18F, -302F);

		leftWingModel[121].addShapeBox(0F, 0F, 0F, 160, 1, 290, 0F,-60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F); // Box 965
		leftWingModel[121].setRotationPoint(-84F, -63F, 70F);

		leftWingModel[122].addShapeBox(0F, 0F, 0F, 160, 1, 290, 0F,-60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F); // Box 966
		leftWingModel[122].setRotationPoint(-80F, -72.18F, 16F);

		leftWingModel[123].addShapeBox(0F, 0F, 0F, 160, 1, 290, 0F,-60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F, -60F, 0F, -109F); // Box 967
		leftWingModel[123].setRotationPoint(-86F, -63F, -353F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 99
		rightWingModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 98
		rightWingModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 97
		rightWingModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 96
		rightWingModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 95
		rightWingModel[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 94
		rightWingModel[6] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 93
		rightWingModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 92
		rightWingModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 91
		rightWingModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 90
		rightWingModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 9
		rightWingModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 9
		rightWingModel[12] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 89
		rightWingModel[13] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 88
		rightWingModel[14] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 87
		rightWingModel[15] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 86
		rightWingModel[16] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 85
		rightWingModel[17] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 84
		rightWingModel[18] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 83
		rightWingModel[19] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Box 82
		rightWingModel[20] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 81
		rightWingModel[21] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 80
		rightWingModel[22] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 8
		rightWingModel[23] = new ModelRendererTurbo(this, 1377, 1, textureX, textureY); // Box 8
		rightWingModel[24] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 79
		rightWingModel[25] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 78
		rightWingModel[26] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 77
		rightWingModel[27] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 76
		rightWingModel[28] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 75
		rightWingModel[29] = new ModelRendererTurbo(this, 1409, 9, textureX, textureY); // Box 74
		rightWingModel[30] = new ModelRendererTurbo(this, 1449, 9, textureX, textureY); // Box 73
		rightWingModel[31] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 72
		rightWingModel[32] = new ModelRendererTurbo(this, 1497, 9, textureX, textureY); // Box 71
		rightWingModel[33] = new ModelRendererTurbo(this, 1529, 9, textureX, textureY); // Box 70
		rightWingModel[34] = new ModelRendererTurbo(this, 1793, 9, textureX, textureY); // Box 7
		rightWingModel[35] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 7
		rightWingModel[36] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 69
		rightWingModel[37] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 68
		rightWingModel[38] = new ModelRendererTurbo(this, 1345, 17, textureX, textureY); // Box 67
		rightWingModel[39] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Box 66
		rightWingModel[40] = new ModelRendererTurbo(this, 1865, 17, textureX, textureY); // Box 65
		rightWingModel[41] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 64
		rightWingModel[42] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 63
		rightWingModel[43] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 62
		rightWingModel[44] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 61
		rightWingModel[45] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 60
		rightWingModel[46] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 6
		rightWingModel[47] = new ModelRendererTurbo(this, 951, 993, textureX, textureY); // Box 6
		rightWingModel[48] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 59
		rightWingModel[49] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 57
		rightWingModel[50] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 56
		rightWingModel[51] = new ModelRendererTurbo(this, 1201, 1, textureX, textureY); // Box 55
		rightWingModel[52] = new ModelRendererTurbo(this, 1385, 17, textureX, textureY); // Box 54
		rightWingModel[53] = new ModelRendererTurbo(this, 1063, 976, textureX, textureY); // Box 5
		rightWingModel[54] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 5
		rightWingModel[55] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 4
		rightWingModel[56] = new ModelRendererTurbo(this, 1697, 33, textureX, textureY); // Box 4
		rightWingModel[57] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 39
		rightWingModel[58] = new ModelRendererTurbo(this, 1545, 33, textureX, textureY); // Box 38
		rightWingModel[59] = new ModelRendererTurbo(this, 2001, 33, textureX, textureY); // Box 37
		rightWingModel[60] = new ModelRendererTurbo(this, 1441, 41, textureX, textureY); // Box 36
		rightWingModel[61] = new ModelRendererTurbo(this, 1577, 41, textureX, textureY); // Box 35
		rightWingModel[62] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		rightWingModel[63] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 33
		rightWingModel[64] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 32
		rightWingModel[65] = new ModelRendererTurbo(this, 1489, 49, textureX, textureY); // Box 31
		rightWingModel[66] = new ModelRendererTurbo(this, 1521, 57, textureX, textureY); // Box 30
		rightWingModel[67] = new ModelRendererTurbo(this, 1520, 1144, textureX, textureY); // Box 3
		rightWingModel[68] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 3
		rightWingModel[69] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 29
		rightWingModel[70] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 28
		rightWingModel[71] = new ModelRendererTurbo(this, 1753, 65, textureX, textureY); // Box 27
		rightWingModel[72] = new ModelRendererTurbo(this, 1905, 65, textureX, textureY); // Box 26
		rightWingModel[73] = new ModelRendererTurbo(this, 1697, 65, textureX, textureY); // Box 25
		rightWingModel[74] = new ModelRendererTurbo(this, 1985, 65, textureX, textureY); // Box 24
		rightWingModel[75] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 23
		rightWingModel[76] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 22
		rightWingModel[77] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 21
		rightWingModel[78] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 20
		rightWingModel[79] = new ModelRendererTurbo(this, 1139, 954, textureX, textureY); // Box 2
		rightWingModel[80] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 2
		rightWingModel[81] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 19
		rightWingModel[82] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 18
		rightWingModel[83] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 17
		rightWingModel[84] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 16
		rightWingModel[85] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 15
		rightWingModel[86] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 14
		rightWingModel[87] = new ModelRendererTurbo(this, 1520, 955, textureX, textureY); // Box 13
		rightWingModel[88] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 13
		rightWingModel[89] = new ModelRendererTurbo(this, 569, 2007, textureX, textureY); // Box 126
		rightWingModel[90] = new ModelRendererTurbo(this, 843, 1958, textureX, textureY); // Box 125
		rightWingModel[91] = new ModelRendererTurbo(this, 934, 1975, textureX, textureY); // Box 124
		rightWingModel[92] = new ModelRendererTurbo(this, 646, 1967, textureX, textureY); // Box 123
		rightWingModel[93] = new ModelRendererTurbo(this, 798, 1991, textureX, textureY); // Box 122
		rightWingModel[94] = new ModelRendererTurbo(this, 950, 2022, textureX, textureY); // Box 121
		rightWingModel[95] = new ModelRendererTurbo(this, 993, 1996, textureX, textureY); // Box 120
		rightWingModel[96] = new ModelRendererTurbo(this, 523, 789, textureX, textureY); // Box 12
		rightWingModel[97] = new ModelRendererTurbo(this, 1537, 113, textureX, textureY); // Box 12
		rightWingModel[98] = new ModelRendererTurbo(this, 953, 1992, textureX, textureY); // Box 119
		rightWingModel[99] = new ModelRendererTurbo(this, 706, 2005, textureX, textureY); // Box 118
		rightWingModel[100] = new ModelRendererTurbo(this, 1313, 121, textureX, textureY); // Box 11
		rightWingModel[101] = new ModelRendererTurbo(this, 1737, 129, textureX, textureY); // Box 11
		rightWingModel[102] = new ModelRendererTurbo(this, 1369, 137, textureX, textureY); // Box 103
		rightWingModel[103] = new ModelRendererTurbo(this, 1097, 137, textureX, textureY); // Box 102
		rightWingModel[104] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 102
		rightWingModel[105] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); // Box 101
		rightWingModel[106] = new ModelRendererTurbo(this, 1521, 209, textureX, textureY); // Box 101
		rightWingModel[107] = new ModelRendererTurbo(this, 1841, 137, textureX, textureY); // Box 100
		rightWingModel[108] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 10
		rightWingModel[109] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 10
		rightWingModel[110] = new ModelRendererTurbo(this, 1369, 153, textureX, textureY); // Box 1
		rightWingModel[111] = new ModelRendererTurbo(this, 801, 225, textureX, textureY); // Box 1
		rightWingModel[112] = new ModelRendererTurbo(this, 1284, 1151, textureX, textureY); // Box 0
		rightWingModel[113] = new ModelRendererTurbo(this, 1313, 169, textureX, textureY); // Box 0

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 14, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 99
		rightWingModel[0].setRotationPoint(-13F, -57F, 75F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 98
		rightWingModel[1].setRotationPoint(-13F, -62F, 75F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		rightWingModel[2].setRotationPoint(-13F, -69F, 81F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		rightWingModel[3].setRotationPoint(-13F, -67F, 77F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		rightWingModel[4].setRotationPoint(-13F, -68F, 79F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		rightWingModel[5].setRotationPoint(-13F, -65F, 75F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 93
		rightWingModel[6].setRotationPoint(-27F, -44F, 80F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 92
		rightWingModel[7].setRotationPoint(-27F, -46F, 77F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 91
		rightWingModel[8].setRotationPoint(-27F, -53F, 75F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 90
		rightWingModel[9].setRotationPoint(-27F, -60F, 75F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 9
		rightWingModel[10].setRotationPoint(-55F, -52F, 159F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 17, 9, 57, 0F,0F, 1F, 0F, -6.2F, 0.6F, 0F, -12F, 2F, 0F, 0F, 2.2F, 0F, 0F, -3F, 0F, -6.2F, -3.65F, 0F, -12F, -6F, 0F, 0F, -5.7F, 0F); // Box 9
		rightWingModel[11].setRotationPoint(2F, -69F, 167F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		rightWingModel[12].setRotationPoint(-27F, -69F, 81F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		rightWingModel[13].setRotationPoint(-27F, -67F, 77F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		rightWingModel[14].setRotationPoint(-27F, -68F, 79F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 86
		rightWingModel[15].setRotationPoint(-27F, -65F, 75F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		rightWingModel[16].setRotationPoint(-72F, -67F, 81F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		rightWingModel[17].setRotationPoint(-72F, -65F, 77F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 17, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 83
		rightWingModel[18].setRotationPoint(-72F, -63F, 75F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 82
		rightWingModel[19].setRotationPoint(-72F, -58F, 75F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 81
		rightWingModel[20].setRotationPoint(-72F, -44F, 77F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 80
		rightWingModel[21].setRotationPoint(-72F, -51F, 75F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 22, 7, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 8
		rightWingModel[22].setRotationPoint(19F, -68F, 93F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 8
		rightWingModel[23].setRotationPoint(-55F, -43F, 164F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 79
		rightWingModel[24].setRotationPoint(-72F, -42F, 80F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 78
		rightWingModel[25].setRotationPoint(-55F, -68F, 81F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 77
		rightWingModel[26].setRotationPoint(-55F, -66F, 77F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 76
		rightWingModel[27].setRotationPoint(-55F, -64F, 75F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 75
		rightWingModel[28].setRotationPoint(-55F, -59F, 75F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 74
		rightWingModel[29].setRotationPoint(-55F, -45F, 77F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 73
		rightWingModel[30].setRotationPoint(-55F, -52F, 75F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 72
		rightWingModel[31].setRotationPoint(-55F, -43F, 80F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 71
		rightWingModel[32].setRotationPoint(-41F, -44F, 80F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 70
		rightWingModel[33].setRotationPoint(-41F, -46F, 77F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 7
		rightWingModel[34].setRotationPoint(-41F, -44F, 164F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 17, 9, 12, 0F,0F, 0.55F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.65F, 0F); // Box 7
		rightWingModel[35].setRotationPoint(2F, -69F, 93F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 69
		rightWingModel[36].setRotationPoint(-41F, -53F, 75F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 68
		rightWingModel[37].setRotationPoint(-41F, -69F, 81F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 67
		rightWingModel[38].setRotationPoint(-41F, -68F, 79F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 66
		rightWingModel[39].setRotationPoint(-41F, -67F, 77F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 65
		rightWingModel[40].setRotationPoint(-41F, -65F, 75F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 64
		rightWingModel[41].setRotationPoint(-41F, -60F, 75F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		rightWingModel[42].setRotationPoint(-74F, -51F, 163F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightWingModel[43].setRotationPoint(-74F, -42F, 167F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 61
		rightWingModel[44].setRotationPoint(-74F, -42F, 172F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 60
		rightWingModel[45].setRotationPoint(-74F, -42F, 164F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 6
		rightWingModel[46].setRotationPoint(-41F, -46F, 161F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 17, 9, 62, 0F,0F, 0.65F, 0F, 0F, -1F, 0F, -6.2F, 0.6F, 0F, 0F, 1F, 0F, 0F, -1.65F, 0F, 0F, -1F, 0F, -6.2F, -3.65F, 0F, 0F, -3F, 0F); // Box 6
		rightWingModel[47].setRotationPoint(2F, -69F, 105F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 59
		rightWingModel[48].setRotationPoint(-74F, -44F, 161F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 57
		rightWingModel[49].setRotationPoint(-74F, -44F, 175F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 56
		rightWingModel[50].setRotationPoint(-74F, -51F, 174F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		rightWingModel[51].setRotationPoint(-74F, -51F, 162F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 2, 13, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 54
		rightWingModel[52].setRotationPoint(-74F, -63F, 162F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 17, 9, 50, 0F,0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.55F, 0F, 0F, -0.25F, 0F, 0F, -1.45F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F); // Box 5
		rightWingModel[53].setRotationPoint(2F, -69F, 43F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 5
		rightWingModel[54].setRotationPoint(-41F, -53F, 159F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 49, 9, 21, 0F,0F, 0F, 17F, 0F, 0F, 17F, -10F, -5F, 0F, 0F, 0.25F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -10F, -3F, 0F, 0F, -0.3F, 0F); // Box 4
		rightWingModel[55].setRotationPoint(2F, -69F, 22F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 4
		rightWingModel[56].setRotationPoint(-41F, -69F, 165F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		rightWingModel[57].setRotationPoint(-72F, -66F, 163F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		rightWingModel[58].setRotationPoint(-55F, -67F, 163F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 37
		rightWingModel[59].setRotationPoint(-13F, -47F, 164F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 36
		rightWingModel[60].setRotationPoint(-13F, -48F, 161F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 14, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 35
		rightWingModel[61].setRotationPoint(-13F, -57F, 159F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 34
		rightWingModel[62].setRotationPoint(-13F, -62F, 159F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightWingModel[63].setRotationPoint(-13F, -69F, 165F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightWingModel[64].setRotationPoint(-13F, -67F, 161F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightWingModel[65].setRotationPoint(-13F, -68F, 163F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 30
		rightWingModel[66].setRotationPoint(-13F, -65F, 159F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 12, 8, 145, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 5F, -6F, 0F); // Box 3
		rightWingModel[67].setRotationPoint(-10F, -71F, 167F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 3
		rightWingModel[68].setRotationPoint(-41F, -68F, 163F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 29
		rightWingModel[69].setRotationPoint(-27F, -44F, 164F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 28
		rightWingModel[70].setRotationPoint(-27F, -46F, 161F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 27
		rightWingModel[71].setRotationPoint(-27F, -53F, 159F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 26
		rightWingModel[72].setRotationPoint(-27F, -60F, 159F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightWingModel[73].setRotationPoint(-27F, -69F, 165F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[74].setRotationPoint(-27F, -67F, 161F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightWingModel[75].setRotationPoint(-27F, -68F, 163F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 22
		rightWingModel[76].setRotationPoint(-27F, -65F, 159F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		rightWingModel[77].setRotationPoint(-72F, -67F, 165F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightWingModel[78].setRotationPoint(-72F, -65F, 161F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 7, 8, 145, 0F,0F, 1F, 17F, 0F, 1F, 17F, 0F, 2F, 0F, 5F, 4F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, 0F, 5F, -3F, 0F); // Box 2
		rightWingModel[79].setRotationPoint(-5F, -68F, 22F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 2
		rightWingModel[80].setRotationPoint(-41F, -67F, 161F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 17, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 19
		rightWingModel[81].setRotationPoint(-72F, -63F, 159F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 18
		rightWingModel[82].setRotationPoint(-72F, -58F, 159F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 17
		rightWingModel[83].setRotationPoint(-72F, -44F, 161F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 16
		rightWingModel[84].setRotationPoint(-72F, -51F, 159F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 15
		rightWingModel[85].setRotationPoint(-72F, -42F, 164F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 14
		rightWingModel[86].setRotationPoint(-55F, -68F, 165F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 22, 7, 119, 0F,0F, 0F, 0F, -1F, -2.75F, -2.75F, -18.75F, 0.25F, 0.75F, 12F, 3F, 0F, 0F, 0F, 0F, -1F, -3.75F, -2.75F, -18.75F, -7F, 0.75F, 12F, -5F, 0F); // Box 13
		rightWingModel[87].setRotationPoint(19F, -68F, 105F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 13
		rightWingModel[88].setRotationPoint(-55F, -66F, 161F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		rightWingModel[89].setRotationPoint(-74F, -51F, 79F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		rightWingModel[90].setRotationPoint(-74F, -42F, 83F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 124
		rightWingModel[91].setRotationPoint(-74F, -42F, 88F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 123
		rightWingModel[92].setRotationPoint(-74F, -42F, 80F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 122
		rightWingModel[93].setRotationPoint(-74F, -44F, 77F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 121
		rightWingModel[94].setRotationPoint(-74F, -44F, 91F);

		rightWingModel[95].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 120
		rightWingModel[95].setRotationPoint(-74F, -51F, 90F);

		rightWingModel[96].addShapeBox(0F, 0F, 0F, 22, 7, 50, 0F,0F, -1F, 0F, 0F, -4.25F, -0.5F, 0F, -2.75F, -0.5F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -2.25F, -0.5F, 0F, -3.75F, -0.5F, 0F, 0F, 0F); // Box 12
		rightWingModel[96].setRotationPoint(19F, -68F, 43F);

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 12
		rightWingModel[97].setRotationPoint(-55F, -64F, 159F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 119
		rightWingModel[98].setRotationPoint(-74F, -51F, 78F);

		rightWingModel[99].addShapeBox(0F, 0F, 0F, 2, 13, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 118
		rightWingModel[99].setRotationPoint(-74F, -63F, 78F);

		rightWingModel[100].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 11
		rightWingModel[100].setRotationPoint(-55F, -59F, 159F);

		rightWingModel[101].addShapeBox(0F, 0F, 0F, 5, 5, 88, 0F,0F, 0F, 0F, 11F, -2F, -1F, -1.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 11F, -2F, -1F, -1.5F, -5.5F, 0F, 0F, -5F, 0F); // Box 11
		rightWingModel[101].setRotationPoint(7F, -71F, 224F);

		rightWingModel[102].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightWingModel[102].setRotationPoint(-72F, -66F, 79F);

		rightWingModel[103].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 102
		rightWingModel[103].setRotationPoint(-55F, -67F, 79F);

		rightWingModel[104].addShapeBox(0F, 0F, 0F, 20, 4, 145, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 5F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, -7F, -6F, 0F); // Box 102
		rightWingModel[104].setRotationPoint(-30F, -67F, 167F);

		rightWingModel[105].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 101
		rightWingModel[105].setRotationPoint(-13F, -47F, 80F);

		rightWingModel[106].addShapeBox(0F, 0F, 0F, 25, 5, 145, 0F,4F, 0F, 0F, -1F, 0F, 0F, -6F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, -7F, -1F, 0F, -7F, -6F, -3F, 0F, -1F, -3F, 0F); // Box 101
		rightWingModel[106].setRotationPoint(-29F, -65F, 22F);

		rightWingModel[107].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 100
		rightWingModel[107].setRotationPoint(-13F, -48F, 77F);

		rightWingModel[108].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 10
		rightWingModel[108].setRotationPoint(-55F, -45F, 161F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 5, 5, 88, 0F,0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F); // Box 10
		rightWingModel[109].setRotationPoint(2F, -71F, 224F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 1
		rightWingModel[110].setRotationPoint(-41F, -65F, 159F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 24, 3, 145, 0F,0F, 1F, 0F, -5F, 4F, 0F, -10F, 6F, 0F, -3F, 4F, 0F, 1F, -2F, 0F, -5F, -2F, 0F, -10F, -7F, 0F, -1F, -6F, 0F); // Box 1
		rightWingModel[111].setRotationPoint(-29F, -68F, 167F);

		rightWingModel[112].addShapeBox(0F, 0F, 0F, 24, 3, 145, 0F,-3F, 1F, 17F, 0F, 1F, 17F, -5F, 4F, 0F, 0F, 1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 1F, -2F, 0F); // Box 0
		rightWingModel[112].setRotationPoint(-29F, -68F, 22F);

		rightWingModel[113].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 0
		rightWingModel[113].setRotationPoint(-41F, -60F, 159F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 479, 1924, textureX, textureY); // Box 231
		bodyWheelModel[1] = new ModelRendererTurbo(this, 286, 1929, textureX, textureY); // Box 232
		bodyWheelModel[2] = new ModelRendererTurbo(this, 42, 1865, textureX, textureY); // Box 233
		bodyWheelModel[3] = new ModelRendererTurbo(this, 44, 1882, textureX, textureY); // Box 234
		bodyWheelModel[4] = new ModelRendererTurbo(this, 405, 1839, textureX, textureY); // Box 235
		bodyWheelModel[5] = new ModelRendererTurbo(this, 399, 1933, textureX, textureY); // Box 236
		bodyWheelModel[6] = new ModelRendererTurbo(this, 487, 1998, textureX, textureY); // Box 237
		bodyWheelModel[7] = new ModelRendererTurbo(this, 427, 1897, textureX, textureY); // Box 238
		bodyWheelModel[8] = new ModelRendererTurbo(this, 260, 1825, textureX, textureY); // Box 239
		bodyWheelModel[9] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 240
		bodyWheelModel[10] = new ModelRendererTurbo(this, 1137, 137, textureX, textureY); // Box 241
		bodyWheelModel[11] = new ModelRendererTurbo(this, 1097, 137, textureX, textureY); // Box 242
		bodyWheelModel[12] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 243
		bodyWheelModel[13] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 244
		bodyWheelModel[14] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 245
		bodyWheelModel[15] = new ModelRendererTurbo(this, 168, 1942, textureX, textureY); // Box 246
		bodyWheelModel[16] = new ModelRendererTurbo(this, 171, 1886, textureX, textureY); // Box 247
		bodyWheelModel[17] = new ModelRendererTurbo(this, 313, 1799, textureX, textureY); // Box 248
		bodyWheelModel[18] = new ModelRendererTurbo(this, 484, 1945, textureX, textureY); // Box 249
		bodyWheelModel[19] = new ModelRendererTurbo(this, 41, 1839, textureX, textureY); // Box 250
		bodyWheelModel[20] = new ModelRendererTurbo(this, 170, 1887, textureX, textureY); // Box 251
		bodyWheelModel[21] = new ModelRendererTurbo(this, 130, 1970, textureX, textureY); // Box 252
		bodyWheelModel[22] = new ModelRendererTurbo(this, 395, 1838, textureX, textureY); // Box 253
		bodyWheelModel[23] = new ModelRendererTurbo(this, 336, 1823, textureX, textureY); // Box 254
		bodyWheelModel[24] = new ModelRendererTurbo(this, 1889, 161, textureX, textureY); // Box 255
		bodyWheelModel[25] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Box 256
		bodyWheelModel[26] = new ModelRendererTurbo(this, 2033, 169, textureX, textureY); // Box 257
		bodyWheelModel[27] = new ModelRendererTurbo(this, 1801, 129, textureX, textureY); // Box 258
		bodyWheelModel[28] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 259
		bodyWheelModel[29] = new ModelRendererTurbo(this, 1593, 145, textureX, textureY); // Box 260
		bodyWheelModel[30] = new ModelRendererTurbo(this, 375, 1965, textureX, textureY); // Box 783
		bodyWheelModel[31] = new ModelRendererTurbo(this, 46, 1932, textureX, textureY); // Box 784
		bodyWheelModel[32] = new ModelRendererTurbo(this, 267, 1875, textureX, textureY); // Box 785
		bodyWheelModel[33] = new ModelRendererTurbo(this, 473, 1915, textureX, textureY); // Box 786
		bodyWheelModel[34] = new ModelRendererTurbo(this, 339, 1837, textureX, textureY); // Box 787
		bodyWheelModel[35] = new ModelRendererTurbo(this, 485, 1831, textureX, textureY); // Box 788
		bodyWheelModel[36] = new ModelRendererTurbo(this, 366, 1982, textureX, textureY); // Box 789
		bodyWheelModel[37] = new ModelRendererTurbo(this, 507, 1883, textureX, textureY); // Box 790
		bodyWheelModel[38] = new ModelRendererTurbo(this, 484, 1988, textureX, textureY); // Box 791
		bodyWheelModel[39] = new ModelRendererTurbo(this, 2033, 361, textureX, textureY); // Box 792
		bodyWheelModel[40] = new ModelRendererTurbo(this, 1121, 377, textureX, textureY); // Box 793
		bodyWheelModel[41] = new ModelRendererTurbo(this, 1249, 369, textureX, textureY); // Box 794
		bodyWheelModel[42] = new ModelRendererTurbo(this, 1897, 193, textureX, textureY); // Box 795
		bodyWheelModel[43] = new ModelRendererTurbo(this, 2041, 273, textureX, textureY); // Box 796
		bodyWheelModel[44] = new ModelRendererTurbo(this, 1425, 305, textureX, textureY); // Box 797
		bodyWheelModel[45] = new ModelRendererTurbo(this, 440, 1825, textureX, textureY); // Box 798
		bodyWheelModel[46] = new ModelRendererTurbo(this, 79, 2014, textureX, textureY); // Box 799
		bodyWheelModel[47] = new ModelRendererTurbo(this, 330, 1900, textureX, textureY); // Box 800
		bodyWheelModel[48] = new ModelRendererTurbo(this, 233, 1839, textureX, textureY); // Box 801
		bodyWheelModel[49] = new ModelRendererTurbo(this, 523, 1988, textureX, textureY); // Box 802
		bodyWheelModel[50] = new ModelRendererTurbo(this, 50, 1914, textureX, textureY); // Box 803
		bodyWheelModel[51] = new ModelRendererTurbo(this, 202, 1900, textureX, textureY); // Box 804
		bodyWheelModel[52] = new ModelRendererTurbo(this, 286, 1838, textureX, textureY); // Box 805
		bodyWheelModel[53] = new ModelRendererTurbo(this, 248, 1805, textureX, textureY); // Box 806
		bodyWheelModel[54] = new ModelRendererTurbo(this, 1369, 377, textureX, textureY); // Box 807
		bodyWheelModel[55] = new ModelRendererTurbo(this, 417, 393, textureX, textureY); // Box 808
		bodyWheelModel[56] = new ModelRendererTurbo(this, 1473, 377, textureX, textureY); // Box 809
		bodyWheelModel[57] = new ModelRendererTurbo(this, 1657, 321, textureX, textureY); // Box 810
		bodyWheelModel[58] = new ModelRendererTurbo(this, 1353, 401, textureX, textureY); // Box 811
		bodyWheelModel[59] = new ModelRendererTurbo(this, 1641, 401, textureX, textureY); // Box 812
		bodyWheelModel[60] = new ModelRendererTurbo(this, 521, 185, textureX, textureY); // Box 948
		bodyWheelModel[61] = new ModelRendererTurbo(this, 1737, 185, textureX, textureY); // Box 949
		bodyWheelModel[62] = new ModelRendererTurbo(this, 1721, 217, textureX, textureY); // Box 950
		bodyWheelModel[63] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 951
		bodyWheelModel[64] = new ModelRendererTurbo(this, 1865, 281, textureX, textureY); // Box 952
		bodyWheelModel[65] = new ModelRendererTurbo(this, 54, 1840, textureX, textureY); // Box 953
		bodyWheelModel[66] = new ModelRendererTurbo(this, 59, 1829, textureX, textureY); // Box 954
		bodyWheelModel[67] = new ModelRendererTurbo(this, 55, 1935, textureX, textureY); // Box 955
		bodyWheelModel[68] = new ModelRendererTurbo(this, 299, 1839, textureX, textureY); // Box 956
		bodyWheelModel[69] = new ModelRendererTurbo(this, 190, 1822, textureX, textureY); // Box 957
		bodyWheelModel[70] = new ModelRendererTurbo(this, 490, 1874, textureX, textureY); // Box 958
		bodyWheelModel[71] = new ModelRendererTurbo(this, 450, 1879, textureX, textureY); // Box 959
		bodyWheelModel[72] = new ModelRendererTurbo(this, 474, 1874, textureX, textureY); // Box 960
		bodyWheelModel[73] = new ModelRendererTurbo(this, 465, 1889, textureX, textureY); // Box 961
		bodyWheelModel[74] = new ModelRendererTurbo(this, 125, 1876, textureX, textureY); // Box 962
		bodyWheelModel[75] = new ModelRendererTurbo(this, 133, 1906, textureX, textureY); // Box 963
		bodyWheelModel[76] = new ModelRendererTurbo(this, 123, 1789, textureX, textureY); // Box 964
		bodyWheelModel[77] = new ModelRendererTurbo(this, 138, 1886, textureX, textureY); // Box 965
		bodyWheelModel[78] = new ModelRendererTurbo(this, 149, 1847, textureX, textureY); // Box 966
		bodyWheelModel[79] = new ModelRendererTurbo(this, 385, 1929, textureX, textureY); // Box 967
		bodyWheelModel[80] = new ModelRendererTurbo(this, 75, 1897, textureX, textureY); // Box 968
		bodyWheelModel[81] = new ModelRendererTurbo(this, 262, 1902, textureX, textureY); // Box 969
		bodyWheelModel[82] = new ModelRendererTurbo(this, 162, 1869, textureX, textureY); // Box 970

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 231
		bodyWheelModel[0].setRotationPoint(-25F, 5F, 34F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyWheelModel[1].setRotationPoint(-25F, -5F, 34F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 233
		bodyWheelModel[2].setRotationPoint(-15F, -5F, 34F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 234
		bodyWheelModel[3].setRotationPoint(-13.5F, -3F, 34F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyWheelModel[4].setRotationPoint(-25F, -7F, 34F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyWheelModel[5].setRotationPoint(-23F, -7.5F, 34F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F); // Box 237
		bodyWheelModel[6].setRotationPoint(-23F, 6.5F, 34F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 238
		bodyWheelModel[7].setRotationPoint(-27F, -5F, 34F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F); // Box 239
		bodyWheelModel[8].setRotationPoint(-27.5F, -3F, 34F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 240
		bodyWheelModel[9].setRotationPoint(-23.5F, -4F, 31F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyWheelModel[10].setRotationPoint(-21.5F, -4F, 31F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 242
		bodyWheelModel[11].setRotationPoint(-18.5F, -4F, 31F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyWheelModel[12].setRotationPoint(-21F, -19F, 31F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyWheelModel[13].setRotationPoint(-21F, -19F, 32F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 245
		bodyWheelModel[14].setRotationPoint(-21F, -19F, 33F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyWheelModel[15].setRotationPoint(1F, -5F, 34F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 247
		bodyWheelModel[16].setRotationPoint(1F, 5F, 34F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F); // Box 248
		bodyWheelModel[17].setRotationPoint(3F, 6.5F, 34F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F); // Box 249
		bodyWheelModel[18].setRotationPoint(-1.5F, -3F, 34F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 250
		bodyWheelModel[19].setRotationPoint(-1F, -5F, 34F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 251
		bodyWheelModel[20].setRotationPoint(11F, -5F, 34F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 252
		bodyWheelModel[21].setRotationPoint(12.5F, -3F, 34F);

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyWheelModel[22].setRotationPoint(1F, -7F, 34F);

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyWheelModel[23].setRotationPoint(3F, -7.5F, 34F);

		bodyWheelModel[24].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 255
		bodyWheelModel[24].setRotationPoint(2.5F, -4F, 31F);

		bodyWheelModel[25].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyWheelModel[25].setRotationPoint(4.5F, -4F, 31F);

		bodyWheelModel[26].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 257
		bodyWheelModel[26].setRotationPoint(7.5F, -4F, 31F);

		bodyWheelModel[27].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyWheelModel[27].setRotationPoint(5F, -19F, 31F);

		bodyWheelModel[28].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyWheelModel[28].setRotationPoint(5F, -19F, 32F);

		bodyWheelModel[29].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 260
		bodyWheelModel[29].setRotationPoint(5F, -19F, 33F);

		bodyWheelModel[30].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 783
		bodyWheelModel[30].setRotationPoint(-25F, 5F, -28F);

		bodyWheelModel[31].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		bodyWheelModel[31].setRotationPoint(-25F, -5F, -28F);

		bodyWheelModel[32].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 785
		bodyWheelModel[32].setRotationPoint(-15F, -5F, -28F);

		bodyWheelModel[33].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 786
		bodyWheelModel[33].setRotationPoint(-13.5F, -3F, -28F);

		bodyWheelModel[34].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		bodyWheelModel[34].setRotationPoint(-25F, -7F, -28F);

		bodyWheelModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		bodyWheelModel[35].setRotationPoint(-23F, -7.5F, -28F);

		bodyWheelModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F); // Box 789
		bodyWheelModel[36].setRotationPoint(-23F, 6.5F, -28F);

		bodyWheelModel[37].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 790
		bodyWheelModel[37].setRotationPoint(-27F, -5F, -28F);

		bodyWheelModel[38].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F); // Box 791
		bodyWheelModel[38].setRotationPoint(-27.5F, -3F, -28F);

		bodyWheelModel[39].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 792
		bodyWheelModel[39].setRotationPoint(-23.5F, -4F, -24F);

		bodyWheelModel[40].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		bodyWheelModel[40].setRotationPoint(-21.5F, -4F, -24F);

		bodyWheelModel[41].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 794
		bodyWheelModel[41].setRotationPoint(-18.5F, -4F, -24F);

		bodyWheelModel[42].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 795
		bodyWheelModel[42].setRotationPoint(-21F, -19F, -22F);

		bodyWheelModel[43].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		bodyWheelModel[43].setRotationPoint(-21F, -19F, -23F);

		bodyWheelModel[44].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		bodyWheelModel[44].setRotationPoint(-21F, -19F, -24F);

		bodyWheelModel[45].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		bodyWheelModel[45].setRotationPoint(1F, -5F, -28F);

		bodyWheelModel[46].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 799
		bodyWheelModel[46].setRotationPoint(1F, 5F, -28F);

		bodyWheelModel[47].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F); // Box 800
		bodyWheelModel[47].setRotationPoint(3F, 6.5F, -28F);

		bodyWheelModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F); // Box 801
		bodyWheelModel[48].setRotationPoint(-1.5F, -3F, -28F);

		bodyWheelModel[49].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 802
		bodyWheelModel[49].setRotationPoint(-1F, -5F, -28F);

		bodyWheelModel[50].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 803
		bodyWheelModel[50].setRotationPoint(11F, -5F, -28F);

		bodyWheelModel[51].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 804
		bodyWheelModel[51].setRotationPoint(12.5F, -3F, -28F);

		bodyWheelModel[52].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		bodyWheelModel[52].setRotationPoint(1F, -7F, -28F);

		bodyWheelModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		bodyWheelModel[53].setRotationPoint(3F, -7.5F, -28F);

		bodyWheelModel[54].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 807
		bodyWheelModel[54].setRotationPoint(2.5F, -4F, -24F);

		bodyWheelModel[55].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		bodyWheelModel[55].setRotationPoint(4.5F, -4F, -24F);

		bodyWheelModel[56].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 809
		bodyWheelModel[56].setRotationPoint(7.5F, -4F, -24F);

		bodyWheelModel[57].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 810
		bodyWheelModel[57].setRotationPoint(5F, -19F, -22F);

		bodyWheelModel[58].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		bodyWheelModel[58].setRotationPoint(5F, -19F, -23F);

		bodyWheelModel[59].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		bodyWheelModel[59].setRotationPoint(5F, -19F, -24F);

		bodyWheelModel[60].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 948
		bodyWheelModel[60].setRotationPoint(-169.85F, -8F, 5.5F);

		bodyWheelModel[61].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 949
		bodyWheelModel[61].setRotationPoint(-169.85F, -8F, 3.5F);

		bodyWheelModel[62].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		bodyWheelModel[62].setRotationPoint(-169.85F, -8F, 4.5F);

		bodyWheelModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 951
		bodyWheelModel[63].setRotationPoint(-169.85F, -1.5F, 3.5F);

		bodyWheelModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 952
		bodyWheelModel[64].setRotationPoint(-170.85F, 0.5F, 3F);

		bodyWheelModel[65].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 953
		bodyWheelModel[65].setRotationPoint(-172.85F, -2.5F, -1F);

		bodyWheelModel[66].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		bodyWheelModel[66].setRotationPoint(-172.85F, -3.5F, -1F);

		bodyWheelModel[67].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		bodyWheelModel[67].setRotationPoint(-171.85F, -4.5F, -1F);

		bodyWheelModel[68].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 956
		bodyWheelModel[68].setRotationPoint(-172.85F, 5.5F, -1F);

		bodyWheelModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 957
		bodyWheelModel[69].setRotationPoint(-171.85F, 6.5F, -1F);

		bodyWheelModel[70].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 958
		bodyWheelModel[70].setRotationPoint(-173.85F, -2.5F, -1F);

		bodyWheelModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 959
		bodyWheelModel[71].setRotationPoint(-174.85F, -1.5F, -1F);

		bodyWheelModel[72].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 960
		bodyWheelModel[72].setRotationPoint(-164.85F, -2.5F, -1F);

		bodyWheelModel[73].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 961
		bodyWheelModel[73].setRotationPoint(-163.85F, -1.5F, -1F);

		bodyWheelModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 962
		bodyWheelModel[74].setRotationPoint(-163.85F, -1.5F, 7F);

		bodyWheelModel[75].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 963
		bodyWheelModel[75].setRotationPoint(-164.85F, -2.5F, 7F);

		bodyWheelModel[76].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyWheelModel[76].setRotationPoint(-172.85F, -2.5F, 7F);

		bodyWheelModel[77].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		bodyWheelModel[77].setRotationPoint(-172.85F, -3.5F, 7F);

		bodyWheelModel[78].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		bodyWheelModel[78].setRotationPoint(-171.85F, -4.5F, 7F);

		bodyWheelModel[79].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 967
		bodyWheelModel[79].setRotationPoint(-173.85F, -2.5F, 7F);

		bodyWheelModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 968
		bodyWheelModel[80].setRotationPoint(-174.85F, -1.5F, 7F);

		bodyWheelModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 969
		bodyWheelModel[81].setRotationPoint(-172.85F, 5.5F, 7F);

		bodyWheelModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 970
		bodyWheelModel[82].setRotationPoint(-171.85F, 6.5F, 7F);
	}

	private void inittailDoorOpenModel_1()
	{
		tailDoorOpenModel[0] = new ModelRendererTurbo(this, 201, 257, textureX, textureY); // Box 377
		tailDoorOpenModel[1] = new ModelRendererTurbo(this, 753, 257, textureX, textureY); // Box 378
		tailDoorOpenModel[2] = new ModelRendererTurbo(this, 1129, 265, textureX, textureY); // Box 379
		tailDoorOpenModel[3] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 380
		tailDoorOpenModel[4] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 381
		tailDoorOpenModel[5] = new ModelRendererTurbo(this, 1737, 65, textureX, textureY); // Box 382
		tailDoorOpenModel[6] = new ModelRendererTurbo(this, 1801, 241, textureX, textureY); // Box 383
		tailDoorOpenModel[7] = new ModelRendererTurbo(this, 1612, 1658, textureX, textureY); // Box 924
		tailDoorOpenModel[8] = new ModelRendererTurbo(this, 1614, 1579, textureX, textureY); // Box 925
		tailDoorOpenModel[9] = new ModelRendererTurbo(this, 1612, 1617, textureX, textureY); // Box 926
		tailDoorOpenModel[10] = new ModelRendererTurbo(this, 473, 465, textureX, textureY); // Box 927
		tailDoorOpenModel[11] = new ModelRendererTurbo(this, 305, 457, textureX, textureY); // Box 928
		tailDoorOpenModel[12] = new ModelRendererTurbo(this, 1753, 321, textureX, textureY); // Box 929
		tailDoorOpenModel[13] = new ModelRendererTurbo(this, 249, 489, textureX, textureY); // Box 930

		tailDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 88, 3, 9, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 12F, 0F, 0F, -1F, 0F); // Box 377
		tailDoorOpenModel[0].setRotationPoint(71F, -8F, 5F);

		tailDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -13F, 4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 11F, 4F, 0F, -3F, 0F); // Box 378
		tailDoorOpenModel[1].setRotationPoint(71F, -9F, 14F);

		tailDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 88, 3, 7, 0F,0F, 0F, 0F, 0F, -16F, -4F, 0F, -15.5F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 14F, -4F, 0F, 14F, 1F, 0F, -5F, 0F); // Box 379
		tailDoorOpenModel[2].setRotationPoint(71F, -12F, 22F);

		tailDoorOpenModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 380
		tailDoorOpenModel[3].setRotationPoint(159F, 6F, 5F);

		tailDoorOpenModel[4].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 381
		tailDoorOpenModel[4].setRotationPoint(159F, 6F, 14F);

		tailDoorOpenModel[5].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 382
		tailDoorOpenModel[5].setRotationPoint(159F, 6F, 26F);

		tailDoorOpenModel[6].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Box 383
		tailDoorOpenModel[6].setRotationPoint(159F, -52F, 5F);

		tailDoorOpenModel[7].addShapeBox(0F, 0F, 0F, 88, 3, 9, 0F,0F, 1F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 12F, 0F, 0F, 13F, 0F, 0F, 0F, 0F); // Box 924
		tailDoorOpenModel[7].setRotationPoint(71F, -8F, -4F);

		tailDoorOpenModel[8].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F,0F, 3F, 0F, 0F, -13F, 4F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 11F, 4F, 0F, 13F, 0F, 0F, 0F, 0F); // Box 925
		tailDoorOpenModel[8].setRotationPoint(71F, -9F, -12F);

		tailDoorOpenModel[9].addShapeBox(0F, 0F, 0F, 88, 3, 7, 0F,0F, 5F, 0F, 0F, -15.5F, 1F, 0F, -16F, -4F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 14F, 1F, 0F, 14F, -4F, 0F, 0F, 0F); // Box 926
		tailDoorOpenModel[9].setRotationPoint(71F, -12F, -19F);

		tailDoorOpenModel[10].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		tailDoorOpenModel[10].setRotationPoint(159F, 6F, -4F);

		tailDoorOpenModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 928
		tailDoorOpenModel[11].setRotationPoint(159F, 6F, -16F);

		tailDoorOpenModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 2.5F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 929
		tailDoorOpenModel[12].setRotationPoint(159F, 6F, -20F);

		tailDoorOpenModel[13].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 930
		tailDoorOpenModel[13].setRotationPoint(159F, -52F, -16F);
	}

	private void inittailDoorCloseModel_1()
	{
		tailDoorCloseModel[0] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 11
		tailDoorCloseModel[1] = new ModelRendererTurbo(this, 1721, 225, textureX, textureY); // Box 0
		tailDoorCloseModel[2] = new ModelRendererTurbo(this, 1137, 249, textureX, textureY); // Box 372
		tailDoorCloseModel[3] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 373
		tailDoorCloseModel[4] = new ModelRendererTurbo(this, 1519, 1704, textureX, textureY); // Box 374
		tailDoorCloseModel[5] = new ModelRendererTurbo(this, 1489, 313, textureX, textureY); // Box 496
		tailDoorCloseModel[6] = new ModelRendererTurbo(this, 937, 489, textureX, textureY); // Box 931
		tailDoorCloseModel[7] = new ModelRendererTurbo(this, 193, 609, textureX, textureY); // Box 932
		tailDoorCloseModel[8] = new ModelRendererTurbo(this, 385, 609, textureX, textureY); // Box 933
		tailDoorCloseModel[9] = new ModelRendererTurbo(this, 585, 609, textureX, textureY); // Box 934
		tailDoorCloseModel[10] = new ModelRendererTurbo(this, 1801, 505, textureX, textureY); // Box 935
		tailDoorCloseModel[11] = new ModelRendererTurbo(this, 201, 513, textureX, textureY); // Box 936

		tailDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 11F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -11F, 0F, 0F, -2F, 0F); // Box 11
		tailDoorCloseModel[0].setRotationPoint(159F, -43F, 5F);

		tailDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 88, 3, 7, 0F,0F, 0F, 0F, 0F, 33F, -4F, 0F, 35F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -34F, -4F, 0F, -36F, 1F, 0F, -5F, 0F); // Box 0
		tailDoorCloseModel[1].setRotationPoint(71F, -12F, 22F);

		tailDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F,0F, 0F, 0F, 0F, 35F, 0F, 0F, 36F, 4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -35.75F, 0F, 0F, -37F, 4F, 0F, -3F, 0F); // Box 372
		tailDoorCloseModel[2].setRotationPoint(71F, -9F, 14F);

		tailDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 88, 3, 9, 0F,0F, 0F, 0F, 0F, 35F, 0F, 0F, 36F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36.875F, 0F, 0F, -1F, 0F); // Box 373
		tailDoorCloseModel[3].setRotationPoint(71F, -8F, 5F);

		tailDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 23, 9, 26, 0F,0F, 0F, 0F, -8F, -13F, 0F, -7F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -20F, -3F, -8F, 0F, -3F, -8F); // Box 374
		tailDoorCloseModel[4].setRotationPoint(71F, -17F, 5F);

		tailDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 23, 9, 26, 0F,0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, -20F, -3F, -8F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 496
		tailDoorCloseModel[5].setRotationPoint(71F, -17F, -21F);

		tailDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 2F, 0F, 0F, 11F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 931
		tailDoorCloseModel[6].setRotationPoint(159F, -43F, -16F);

		tailDoorCloseModel[7].addShapeBox(0F, 0F, 0F, 88, 3, 7, 0F,0F, 5F, 0F, 0F, 35F, 1F, 0F, 33F, -4F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -36F, 1F, 0F, -34F, -4F, 0F, 0F, 0F); // Box 932
		tailDoorCloseModel[7].setRotationPoint(71F, -12F, -19F);

		tailDoorCloseModel[8].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F,0F, 3F, 0F, 0F, 36F, 4F, 0F, 35F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -37F, 4F, 0F, -35.75F, 0F, 0F, 0F, 0F); // Box 933
		tailDoorCloseModel[8].setRotationPoint(71F, -9F, -12F);

		tailDoorCloseModel[9].addShapeBox(0F, 0F, 0F, 88, 3, 9, 0F,0F, 1F, 0F, 0F, 36F, 0F, 0F, 35F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -36.875F, 0F, 0F, -36F, 0F, 0F, 0F, 0F); // Box 934
		tailDoorCloseModel[9].setRotationPoint(71F, -8F, -4F);

		tailDoorCloseModel[10].addShapeBox(0F, 0F, 0F, 23, 9, 26, 0F,0F, 0F, 0F, -7F, -8F, -8F, -8F, -13F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, -20F, -3F, -8F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 935
		tailDoorCloseModel[10].setRotationPoint(71F, -17F, -21F);

		tailDoorCloseModel[11].addShapeBox(0F, 0F, 0F, 23, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -20F, -3F, -8F, 0F, -3F, -8F); // Box 936
		tailDoorCloseModel[11].setRotationPoint(71F, -17F, 5F);
	}

	private void initplaneModeParts_1()
	{
		planeModeParts[0] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 52
		planeModeParts[1] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 51
		planeModeParts[2] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 49
		planeModeParts[3] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 48
		planeModeParts[4] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 47
		planeModeParts[5] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 46
		planeModeParts[6] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 45
		planeModeParts[7] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 44
		planeModeParts[8] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 43
		planeModeParts[9] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 42
		planeModeParts[10] = new ModelRendererTurbo(this, 1417, 33, textureX, textureY); // Box 41
		planeModeParts[11] = new ModelRendererTurbo(this, 1513, 33, textureX, textureY); // Box 40
		planeModeParts[12] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 117
		planeModeParts[13] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 116
		planeModeParts[14] = new ModelRendererTurbo(this, 1489, 41, textureX, textureY); // Box 115
		planeModeParts[15] = new ModelRendererTurbo(this, 1985, 41, textureX, textureY); // Box 114
		planeModeParts[16] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 113
		planeModeParts[17] = new ModelRendererTurbo(this, 1889, 65, textureX, textureY); // Box 112
		planeModeParts[18] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 111
		planeModeParts[19] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 110
		planeModeParts[20] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 109
		planeModeParts[21] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 108
		planeModeParts[22] = new ModelRendererTurbo(this, 1361, 121, textureX, textureY); // Box 107
		planeModeParts[23] = new ModelRendererTurbo(this, 1401, 121, textureX, textureY); // Box 106
		planeModeParts[24] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 105
		planeModeParts[25] = new ModelRendererTurbo(this, 115, 1995, textureX, textureY); // Box 104
		planeModeParts[26] = new ModelRendererTurbo(this, 1865, 65, textureX, textureY); // Box 419
		planeModeParts[27] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 421
		planeModeParts[28] = new ModelRendererTurbo(this, 1393, 225, textureX, textureY); // Box 663
		planeModeParts[29] = new ModelRendererTurbo(this, 1561, 233, textureX, textureY); // Box 664
		planeModeParts[30] = new ModelRendererTurbo(this, 1489, 305, textureX, textureY); // Box 665
		planeModeParts[31] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 666
		planeModeParts[32] = new ModelRendererTurbo(this, 1489, 321, textureX, textureY); // Box 667
		planeModeParts[33] = new ModelRendererTurbo(this, 921, 345, textureX, textureY); // Box 668
		planeModeParts[34] = new ModelRendererTurbo(this, 1289, 377, textureX, textureY); // Box 669
		planeModeParts[35] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 670
		planeModeParts[36] = new ModelRendererTurbo(this, 1521, 377, textureX, textureY); // Box 671
		planeModeParts[37] = new ModelRendererTurbo(this, 1177, 393, textureX, textureY); // Box 672
		planeModeParts[38] = new ModelRendererTurbo(this, 145, 425, textureX, textureY); // Box 673
		planeModeParts[39] = new ModelRendererTurbo(this, 1841, 425, textureX, textureY); // Box 674
		planeModeParts[40] = new ModelRendererTurbo(this, 1801, 241, textureX, textureY); // Box 675
		planeModeParts[41] = new ModelRendererTurbo(this, 1801, 249, textureX, textureY); // Box 676
		planeModeParts[42] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 677
		planeModeParts[43] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 678
		planeModeParts[44] = new ModelRendererTurbo(this, 1633, 345, textureX, textureY); // Box 679
		planeModeParts[45] = new ModelRendererTurbo(this, 905, 361, textureX, textureY); // Box 680
		planeModeParts[46] = new ModelRendererTurbo(this, 921, 377, textureX, textureY); // Box 681
		planeModeParts[47] = new ModelRendererTurbo(this, 1705, 377, textureX, textureY); // Box 682
		planeModeParts[48] = new ModelRendererTurbo(this, 1225, 425, textureX, textureY); // Box 683
		planeModeParts[49] = new ModelRendererTurbo(this, 1937, 33, textureX, textureY); // Box 684
		planeModeParts[50] = new ModelRendererTurbo(this, 1561, 433, textureX, textureY); // Box 685
		planeModeParts[51] = new ModelRendererTurbo(this, 729, 441, textureX, textureY); // Box 686
		planeModeParts[52] = new ModelRendererTurbo(this, 769, 441, textureX, textureY); // Box 687
		planeModeParts[53] = new ModelRendererTurbo(this, 1097, 441, textureX, textureY); // Box 688

		planeModeParts[0].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 52
		planeModeParts[0].setRotationPoint(-87F, -55F, 170F);

		planeModeParts[1].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 51
		planeModeParts[1].setRotationPoint(-87F, -55F, 164F);

		planeModeParts[2].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 49
		planeModeParts[2].setRotationPoint(-82F, -54F, 171F);

		planeModeParts[3].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 48
		planeModeParts[3].setRotationPoint(-82F, -54F, 162F);

		planeModeParts[4].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 47
		planeModeParts[4].setRotationPoint(-82F, -63F, 162F);

		planeModeParts[5].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 46
		planeModeParts[5].setRotationPoint(-82F, -63F, 171F);

		planeModeParts[6].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 45
		planeModeParts[6].setRotationPoint(-87F, -59F, 161F);

		planeModeParts[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 44
		planeModeParts[7].setRotationPoint(-88F, -58F, 167F);

		planeModeParts[8].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F); // Box 43
		planeModeParts[8].setRotationPoint(-87F, -54F, 166F);

		planeModeParts[9].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 42
		planeModeParts[9].setRotationPoint(-87F, -64F, 166F);

		planeModeParts[10].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F); // Box 41
		planeModeParts[10].setRotationPoint(-87F, -59F, 171F);

		planeModeParts[11].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 40
		planeModeParts[11].setRotationPoint(-87F, -59F, 166F);

		planeModeParts[12].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 117
		planeModeParts[12].setRotationPoint(-87F, -61F, 86F);

		planeModeParts[13].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 116
		planeModeParts[13].setRotationPoint(-87F, -55F, 86F);

		planeModeParts[14].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 115
		planeModeParts[14].setRotationPoint(-87F, -55F, 80F);

		planeModeParts[15].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 114
		planeModeParts[15].setRotationPoint(-87F, -61F, 80F);

		planeModeParts[16].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 113
		planeModeParts[16].setRotationPoint(-82F, -54F, 87F);

		planeModeParts[17].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 112
		planeModeParts[17].setRotationPoint(-82F, -54F, 78F);

		planeModeParts[18].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 111
		planeModeParts[18].setRotationPoint(-82F, -63F, 78F);

		planeModeParts[19].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 110
		planeModeParts[19].setRotationPoint(-82F, -63F, 87F);

		planeModeParts[20].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 109
		planeModeParts[20].setRotationPoint(-87F, -59F, 77F);

		planeModeParts[21].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 108
		planeModeParts[21].setRotationPoint(-88F, -58F, 83F);

		planeModeParts[22].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F); // Box 107
		planeModeParts[22].setRotationPoint(-87F, -54F, 82F);

		planeModeParts[23].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 106
		planeModeParts[23].setRotationPoint(-87F, -64F, 82F);

		planeModeParts[24].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F); // Box 105
		planeModeParts[24].setRotationPoint(-87F, -59F, 87F);

		planeModeParts[25].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 104
		planeModeParts[25].setRotationPoint(-87F, -59F, 82F);

		planeModeParts[26].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 419
		planeModeParts[26].setRotationPoint(-87F, -61F, -163F);

		planeModeParts[27].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 421
		planeModeParts[27].setRotationPoint(-87F, -61F, -157F);

		planeModeParts[28].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 663
		planeModeParts[28].setRotationPoint(-87F, -55F, -163F);

		planeModeParts[29].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 664
		planeModeParts[29].setRotationPoint(-87F, -55F, -157F);

		planeModeParts[30].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 665
		planeModeParts[30].setRotationPoint(-82F, -54F, -165F);

		planeModeParts[31].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 666
		planeModeParts[31].setRotationPoint(-82F, -54F, -156F);

		planeModeParts[32].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 667
		planeModeParts[32].setRotationPoint(-82F, -63F, -156F);

		planeModeParts[33].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 668
		planeModeParts[33].setRotationPoint(-82F, -63F, -165F);

		planeModeParts[34].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F); // Box 669
		planeModeParts[34].setRotationPoint(-87F, -59F, -156F);

		planeModeParts[35].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 670
		planeModeParts[35].setRotationPoint(-88F, -58F, -160F);

		planeModeParts[36].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F); // Box 671
		planeModeParts[36].setRotationPoint(-87F, -54F, -161F);

		planeModeParts[37].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 672
		planeModeParts[37].setRotationPoint(-87F, -64F, -161F);

		planeModeParts[38].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 673
		planeModeParts[38].setRotationPoint(-87F, -59F, -166F);

		planeModeParts[39].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 674
		planeModeParts[39].setRotationPoint(-87F, -59F, -161F);

		planeModeParts[40].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 675
		planeModeParts[40].setRotationPoint(-87F, -61F, -79F);

		planeModeParts[41].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 676
		planeModeParts[41].setRotationPoint(-87F, -55F, -79F);

		planeModeParts[42].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 677
		planeModeParts[42].setRotationPoint(-87F, -55F, -73F);

		planeModeParts[43].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 678
		planeModeParts[43].setRotationPoint(-87F, -61F, -73F);

		planeModeParts[44].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 679
		planeModeParts[44].setRotationPoint(-82F, -54F, -81F);

		planeModeParts[45].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 680
		planeModeParts[45].setRotationPoint(-82F, -54F, -72F);

		planeModeParts[46].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 681
		planeModeParts[46].setRotationPoint(-82F, -63F, -72F);

		planeModeParts[47].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 682
		planeModeParts[47].setRotationPoint(-82F, -63F, -81F);

		planeModeParts[48].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F); // Box 683
		planeModeParts[48].setRotationPoint(-87F, -59F, -72F);

		planeModeParts[49].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 684
		planeModeParts[49].setRotationPoint(-88F, -58F, -76F);

		planeModeParts[50].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F); // Box 685
		planeModeParts[50].setRotationPoint(-87F, -54F, -77F);

		planeModeParts[51].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 686
		planeModeParts[51].setRotationPoint(-87F, -64F, -77F);

		planeModeParts[52].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 687
		planeModeParts[52].setRotationPoint(-87F, -59F, -82F);

		planeModeParts[53].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 688
		planeModeParts[53].setRotationPoint(-87F, -59F, -77F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][4];
		propellerModels[0] = makeProp1(-80F, -56F, 85F);
		propellerModels[1] = makeProp2(-81F, -57F, 169F);
		propellerModels[2] = makeProp3(-80F, -56F, -74F);
		propellerModels[3] = makeProp4(-81F, -57F, -158F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[0].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[1].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[2].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[3].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[0].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[1].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[2].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[3].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[0].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[1].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[2].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[3].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 650, textureX, textureY);
		prop[0].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[1].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[2].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[3].addBox(-1F, -40F, -3.5F, 2, 40, 7, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}