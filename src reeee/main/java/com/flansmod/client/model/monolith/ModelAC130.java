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

public class ModelAC130 extends ModelPlane //Same as Filename
{
	int textureX = 4096;
	int textureY = 2048;

	public ModelAC130() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[547];
		tailModel = new ModelRendererTurbo[110];
		leftWingModel = new ModelRendererTurbo[148];
		rightWingModel = new ModelRendererTurbo[148];
		bodyWheelModel = new ModelRendererTurbo[89];
		tailDoorOpenModel = new ModelRendererTurbo[16];
		tailDoorCloseModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		initbodyModel_2();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
		inittailDoorOpenModel_1();
		inittailDoorCloseModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 93
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 92
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 90
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 89
		bodyModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 88
		bodyModel[10] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 87
		bodyModel[11] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 86
		bodyModel[12] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 84
		bodyModel[13] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 83
		bodyModel[14] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 81
		bodyModel[15] = new ModelRendererTurbo(this, 1249, 1, textureX, textureY); // Box 80
		bodyModel[16] = new ModelRendererTurbo(this, 1265, 1, textureX, textureY); // Box 8
		bodyModel[17] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 8
		bodyModel[18] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 8
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[20] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 79
		bodyModel[21] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 7
		bodyModel[22] = new ModelRendererTurbo(this, 1369, 1, textureX, textureY); // Box 7
		bodyModel[23] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		bodyModel[24] = new ModelRendererTurbo(this, 2937, 1, textureX, textureY); // Box 6
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[26] = new ModelRendererTurbo(this, 3489, 1, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 2105, 1, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 3601, 1, textureX, textureY); // Box 59
		bodyModel[30] = new ModelRendererTurbo(this, 3657, 1, textureX, textureY); // Box 58
		bodyModel[31] = new ModelRendererTurbo(this, 3713, 1, textureX, textureY); // Box 57
		bodyModel[32] = new ModelRendererTurbo(this, 3777, 1, textureX, textureY); // Box 55
		bodyModel[33] = new ModelRendererTurbo(this, 3841, 1, textureX, textureY); // Box 54
		bodyModel[34] = new ModelRendererTurbo(this, 3921, 1, textureX, textureY); // Box 53
		bodyModel[35] = new ModelRendererTurbo(this, 3993, 1, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 2849, 1, textureX, textureY); // Box 5
		bodyModel[37] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 5
		bodyModel[38] = new ModelRendererTurbo(this, 3009, 1, textureX, textureY); // Box 5
		bodyModel[39] = new ModelRendererTurbo(this, 4065, 1, textureX, textureY); // Box 5
		bodyModel[40] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 3481, 1, textureX, textureY); // Box 4
		bodyModel[46] = new ModelRendererTurbo(this, 2745, 9, textureX, textureY); // Box 3
		bodyModel[47] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 3
		bodyModel[48] = new ModelRendererTurbo(this, 1385, 17, textureX, textureY); // Box 3
		bodyModel[49] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 3
		bodyModel[50] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 3
		bodyModel[51] = new ModelRendererTurbo(this, 2721, 33, textureX, textureY); // Box 27
		bodyModel[52] = new ModelRendererTurbo(this, 1321, 25, textureX, textureY); // Box 265
		bodyModel[53] = new ModelRendererTurbo(this, 1809, 25, textureX, textureY); // Box 264
		bodyModel[54] = new ModelRendererTurbo(this, 1937, 25, textureX, textureY); // Box 263
		bodyModel[55] = new ModelRendererTurbo(this, 1961, 25, textureX, textureY); // Box 262
		bodyModel[56] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 261
		bodyModel[57] = new ModelRendererTurbo(this, 1921, 17, textureX, textureY); // Box 2
		bodyModel[58] = new ModelRendererTurbo(this, 777, 33, textureX, textureY); // Box 2
		bodyModel[59] = new ModelRendererTurbo(this, 1849, 9, textureX, textureY); // Box 2
		bodyModel[60] = new ModelRendererTurbo(this, 3833, 1, textureX, textureY); // Box 2
		bodyModel[61] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 18
		bodyModel[62] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[65] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[66] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 13
		bodyModel[67] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 12
		bodyModel[68] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[69] = new ModelRendererTurbo(this, 2241, 17, textureX, textureY); // Box 12
		bodyModel[70] = new ModelRendererTurbo(this, 2833, 25, textureX, textureY); // Box 12
		bodyModel[71] = new ModelRendererTurbo(this, 1065, 9, textureX, textureY); // Box 11
		bodyModel[72] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[73] = new ModelRendererTurbo(this, 3033, 25, textureX, textureY); // Box 11
		bodyModel[74] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		bodyModel[75] = new ModelRendererTurbo(this, 3033, 57, textureX, textureY); // Box 10
		bodyModel[76] = new ModelRendererTurbo(this, 3881, 33, textureX, textureY); // Box 10
		bodyModel[77] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[78] = new ModelRendererTurbo(this, 1777, 41, textureX, textureY); // Box 10
		bodyModel[79] = new ModelRendererTurbo(this, 2121, 25, textureX, textureY); // Box 1
		bodyModel[80] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 1
		bodyModel[81] = new ModelRendererTurbo(this, 2537, 1, textureX, textureY); // Box 1
		bodyModel[82] = new ModelRendererTurbo(this, 1905, 41, textureX, textureY); // Box 1
		bodyModel[83] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 1
		bodyModel[84] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 1
		bodyModel[85] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 1
		bodyModel[86] = new ModelRendererTurbo(this, 3025, 73, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 2617, 49, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 3529, 41, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 2737, 25, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 1249, 33, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 2809, 1, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 3489, 97, textureX, textureY); // Box 368
		bodyModel[97] = new ModelRendererTurbo(this, 1345, 97, textureX, textureY); // Box 370
		bodyModel[98] = new ModelRendererTurbo(this, 3921, 81, textureX, textureY); // Box 371
		bodyModel[99] = new ModelRendererTurbo(this, 737, 41, textureX, textureY); // Box 372
		bodyModel[100] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 373
		bodyModel[101] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 374
		bodyModel[102] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 375
		bodyModel[103] = new ModelRendererTurbo(this, 2897, 1, textureX, textureY); // Box 376
		bodyModel[104] = new ModelRendererTurbo(this, 513, 89, textureX, textureY); // Box 1
		bodyModel[105] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 2
		bodyModel[106] = new ModelRendererTurbo(this, 3225, 81, textureX, textureY); // Box 3
		bodyModel[107] = new ModelRendererTurbo(this, 2193, 65, textureX, textureY); // Box 176
		bodyModel[108] = new ModelRendererTurbo(this, 1777, 73, textureX, textureY); // Box 177
		bodyModel[109] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 178
		bodyModel[110] = new ModelRendererTurbo(this, 2417, 89, textureX, textureY); // Box 179
		bodyModel[111] = new ModelRendererTurbo(this, 3489, 73, textureX, textureY); // Box 180
		bodyModel[112] = new ModelRendererTurbo(this, 2985, 105, textureX, textureY); // Box 181
		bodyModel[113] = new ModelRendererTurbo(this, 2337, 49, textureX, textureY); // Box 182
		bodyModel[114] = new ModelRendererTurbo(this, 3273, 49, textureX, textureY); // Box 183
		bodyModel[115] = new ModelRendererTurbo(this, 3601, 41, textureX, textureY); // Box 184
		bodyModel[116] = new ModelRendererTurbo(this, 1553, 97, textureX, textureY); // Box 185
		bodyModel[117] = new ModelRendererTurbo(this, 2193, 81, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 3689, 41, textureX, textureY); // Box 1
		bodyModel[119] = new ModelRendererTurbo(this, 2289, 81, textureX, textureY); // Box 2
		bodyModel[120] = new ModelRendererTurbo(this, 1865, 97, textureX, textureY); // Box 3
		bodyModel[121] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 4
		bodyModel[122] = new ModelRendererTurbo(this, 1777, 57, textureX, textureY); // Box 5
		bodyModel[123] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 6
		bodyModel[124] = new ModelRendererTurbo(this, 2137, 65, textureX, textureY); // Box 7
		bodyModel[125] = new ModelRendererTurbo(this, 1193, 33, textureX, textureY); // Box 8
		bodyModel[126] = new ModelRendererTurbo(this, 1513, 41, textureX, textureY); // Box 9
		bodyModel[127] = new ModelRendererTurbo(this, 4041, 81, textureX, textureY); // Box 10
		bodyModel[128] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 11
		bodyModel[129] = new ModelRendererTurbo(this, 3225, 49, textureX, textureY); // Box 12
		bodyModel[130] = new ModelRendererTurbo(this, 1313, 57, textureX, textureY); // Box 14
		bodyModel[131] = new ModelRendererTurbo(this, 1753, 89, textureX, textureY); // Box 16
		bodyModel[132] = new ModelRendererTurbo(this, 4033, 49, textureX, textureY); // Box 17
		bodyModel[133] = new ModelRendererTurbo(this, 1049, 57, textureX, textureY); // Box 192
		bodyModel[134] = new ModelRendererTurbo(this, 3121, 57, textureX, textureY); // Box 193
		bodyModel[135] = new ModelRendererTurbo(this, 4057, 41, textureX, textureY); // Box 194
		bodyModel[136] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 195
		bodyModel[137] = new ModelRendererTurbo(this, 1641, 65, textureX, textureY); // Box 196
		bodyModel[138] = new ModelRendererTurbo(this, 3297, 65, textureX, textureY); // Box 197
		bodyModel[139] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 198
		bodyModel[140] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 199
		bodyModel[141] = new ModelRendererTurbo(this, 3089, 73, textureX, textureY); // Box 200
		bodyModel[142] = new ModelRendererTurbo(this, 2137, 81, textureX, textureY); // Box 202
		bodyModel[143] = new ModelRendererTurbo(this, 3025, 89, textureX, textureY); // Box 203
		bodyModel[144] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 204
		bodyModel[145] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 205
		bodyModel[146] = new ModelRendererTurbo(this, 3225, 97, textureX, textureY); // Box 206
		bodyModel[147] = new ModelRendererTurbo(this, 2937, 1, textureX, textureY); // Box 207
		bodyModel[148] = new ModelRendererTurbo(this, 1937, 17, textureX, textureY); // Box 208
		bodyModel[149] = new ModelRendererTurbo(this, 4073, 17, textureX, textureY); // Box 209
		bodyModel[150] = new ModelRendererTurbo(this, 2969, 1, textureX, textureY); // Box 210
		bodyModel[151] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 211
		bodyModel[152] = new ModelRendererTurbo(this, 2761, 1, textureX, textureY); // Box 384
		bodyModel[153] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 385
		bodyModel[154] = new ModelRendererTurbo(this, 1145, 9, textureX, textureY); // Box 386
		bodyModel[155] = new ModelRendererTurbo(this, 1793, 9, textureX, textureY); // Box 387
		bodyModel[156] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 388
		bodyModel[157] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 389
		bodyModel[158] = new ModelRendererTurbo(this, 3593, 73, textureX, textureY); // Box 390
		bodyModel[159] = new ModelRendererTurbo(this, 3121, 73, textureX, textureY); // Box 391
		bodyModel[160] = new ModelRendererTurbo(this, 1993, 9, textureX, textureY); // Box 392
		bodyModel[161] = new ModelRendererTurbo(this, 2105, 9, textureX, textureY); // Box 393
		bodyModel[162] = new ModelRendererTurbo(this, 2153, 9, textureX, textureY); // Box 394
		bodyModel[163] = new ModelRendererTurbo(this, 3857, 33, textureX, textureY); // Box 395
		bodyModel[164] = new ModelRendererTurbo(this, 1105, 65, textureX, textureY); // Box 396
		bodyModel[165] = new ModelRendererTurbo(this, 3537, 57, textureX, textureY); // Box 397
		bodyModel[166] = new ModelRendererTurbo(this, 1209, 65, textureX, textureY); // Box 398
		bodyModel[167] = new ModelRendererTurbo(this, 1241, 65, textureX, textureY); // Box 399
		bodyModel[168] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 400
		bodyModel[169] = new ModelRendererTurbo(this, 1793, 89, textureX, textureY); // Box 401
		bodyModel[170] = new ModelRendererTurbo(this, 3009, 9, textureX, textureY); // Box 402
		bodyModel[171] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 403
		bodyModel[172] = new ModelRendererTurbo(this, 1345, 65, textureX, textureY); // Box 404
		bodyModel[173] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 405
		bodyModel[174] = new ModelRendererTurbo(this, 3497, 17, textureX, textureY); // Box 406
		bodyModel[175] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 407
		bodyModel[176] = new ModelRendererTurbo(this, 1929, 97, textureX, textureY); // Box 408
		bodyModel[177] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 409
		bodyModel[178] = new ModelRendererTurbo(this, 2289, 97, textureX, textureY); // Box 410
		bodyModel[179] = new ModelRendererTurbo(this, 1953, 1, textureX, textureY); // Box 411
		bodyModel[180] = new ModelRendererTurbo(this, 3545, 17, textureX, textureY); // Box 412
		bodyModel[181] = new ModelRendererTurbo(this, 2569, 89, textureX, textureY); // Box 413
		bodyModel[182] = new ModelRendererTurbo(this, 2625, 89, textureX, textureY); // Box 414
		bodyModel[183] = new ModelRendererTurbo(this, 2681, 89, textureX, textureY); // Box 415
		bodyModel[184] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Box 416
		bodyModel[185] = new ModelRendererTurbo(this, 2417, 105, textureX, textureY); // Box 417
		bodyModel[186] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 418
		bodyModel[187] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 420
		bodyModel[188] = new ModelRendererTurbo(this, 1953, 25, textureX, textureY); // Box 422
		bodyModel[189] = new ModelRendererTurbo(this, 1513, 65, textureX, textureY); // Box 423
		bodyModel[190] = new ModelRendererTurbo(this, 2313, 25, textureX, textureY); // Box 424
		bodyModel[191] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 425
		bodyModel[192] = new ModelRendererTurbo(this, 2737, 89, textureX, textureY); // Box 426
		bodyModel[193] = new ModelRendererTurbo(this, 1865, 89, textureX, textureY); // Box 427
		bodyModel[194] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 428
		bodyModel[195] = new ModelRendererTurbo(this, 1249, 41, textureX, textureY); // Box 429
		bodyModel[196] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 430
		bodyModel[197] = new ModelRendererTurbo(this, 3633, 9, textureX, textureY); // Box 431
		bodyModel[198] = new ModelRendererTurbo(this, 2337, 65, textureX, textureY); // Box 435
		bodyModel[199] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 436
		bodyModel[200] = new ModelRendererTurbo(this, 2769, 89, textureX, textureY); // Box 437
		bodyModel[201] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 438
		bodyModel[202] = new ModelRendererTurbo(this, 1377, 41, textureX, textureY); // Box 439
		bodyModel[203] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 440
		bodyModel[204] = new ModelRendererTurbo(this, 1969, 97, textureX, textureY); // Box 441
		bodyModel[205] = new ModelRendererTurbo(this, 2137, 97, textureX, textureY); // Box 442
		bodyModel[206] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 443
		bodyModel[207] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 444
		bodyModel[208] = new ModelRendererTurbo(this, 3961, 113, textureX, textureY); // Box 445
		bodyModel[209] = new ModelRendererTurbo(this, 2289, 57, textureX, textureY); // Box 449
		bodyModel[210] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 450
		bodyModel[211] = new ModelRendererTurbo(this, 2225, 57, textureX, textureY); // Box 451
		bodyModel[212] = new ModelRendererTurbo(this, 1377, 33, textureX, textureY); // Box 452
		bodyModel[213] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 453
		bodyModel[214] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 454
		bodyModel[215] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 455
		bodyModel[216] = new ModelRendererTurbo(this, 9, 18, textureX, textureY); // Box 456
		bodyModel[217] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Box 457
		bodyModel[218] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 458
		bodyModel[219] = new ModelRendererTurbo(this, 3545, 25, textureX, textureY); // Box 459
		bodyModel[220] = new ModelRendererTurbo(this, 11, 4, textureX, textureY); // Box 460
		bodyModel[221] = new ModelRendererTurbo(this, 2801, 89, textureX, textureY); // Box 461
		bodyModel[222] = new ModelRendererTurbo(this, 1345, 113, textureX, textureY); // Box 462
		bodyModel[223] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 463
		bodyModel[224] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 464
		bodyModel[225] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 465
		bodyModel[226] = new ModelRendererTurbo(this, 1332, 340, textureX, textureY); // Box 466
		bodyModel[227] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 467
		bodyModel[228] = new ModelRendererTurbo(this, 1409, 113, textureX, textureY); // Box 468
		bodyModel[229] = new ModelRendererTurbo(this, 4, 7, textureX, textureY); // Box 469
		bodyModel[230] = new ModelRendererTurbo(this, 1065, 105, textureX, textureY); // Box 470
		bodyModel[231] = new ModelRendererTurbo(this, 2337, 81, textureX, textureY); // Box 471
		bodyModel[232] = new ModelRendererTurbo(this, 809, 121, textureX, textureY); // Box 472
		bodyModel[233] = new ModelRendererTurbo(this, 3673, 9, textureX, textureY); // Box 473
		bodyModel[234] = new ModelRendererTurbo(this, 1633, 113, textureX, textureY); // Box 474
		bodyModel[235] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 475
		bodyModel[236] = new ModelRendererTurbo(this, 3057, 89, textureX, textureY); // Box 476
		bodyModel[237] = new ModelRendererTurbo(this, 1777, 113, textureX, textureY); // Box 477
		bodyModel[238] = new ModelRendererTurbo(this, 1865, 121, textureX, textureY); // Box 478
		bodyModel[239] = new ModelRendererTurbo(this, 1465, 113, textureX, textureY); // Box 479
		bodyModel[240] = new ModelRendererTurbo(this, 2193, 121, textureX, textureY); // Box 480
		bodyModel[241] = new ModelRendererTurbo(this, 2481, 113, textureX, textureY); // Box 481
		bodyModel[242] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 482
		bodyModel[243] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Box 483
		bodyModel[244] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 484
		bodyModel[245] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 485
		bodyModel[246] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 486
		bodyModel[247] = new ModelRendererTurbo(this, 3713, 9, textureX, textureY); // Box 487
		bodyModel[248] = new ModelRendererTurbo(this, 2569, 185, textureX, textureY); // Box 488
		bodyModel[249] = new ModelRendererTurbo(this, 1337, 137, textureX, textureY); // Box 489
		bodyModel[250] = new ModelRendererTurbo(this, 1641, 129, textureX, textureY); // Box 490
		bodyModel[251] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 491
		bodyModel[252] = new ModelRendererTurbo(this, 3281, 113, textureX, textureY); // Box 492
		bodyModel[253] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 493
		bodyModel[254] = new ModelRendererTurbo(this, 2169, 65, textureX, textureY); // Box 494
		bodyModel[255] = new ModelRendererTurbo(this, 4081, 17, textureX, textureY); // Box 495
		bodyModel[256] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 498
		bodyModel[257] = new ModelRendererTurbo(this, 1865, 137, textureX, textureY); // Box 499
		bodyModel[258] = new ModelRendererTurbo(this, 513, 137, textureX, textureY); // Box 500
		bodyModel[259] = new ModelRendererTurbo(this, 2961, 113, textureX, textureY); // Box 501
		bodyModel[260] = new ModelRendererTurbo(this, 3225, 121, textureX, textureY); // Box 502
		bodyModel[261] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 503
		bodyModel[262] = new ModelRendererTurbo(this, 649, 137, textureX, textureY); // Box 504
		bodyModel[263] = new ModelRendererTurbo(this, 2257, 121, textureX, textureY); // Box 505
		bodyModel[264] = new ModelRendererTurbo(this, 2169, 137, textureX, textureY); // Box 506
		bodyModel[265] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 507
		bodyModel[266] = new ModelRendererTurbo(this, 3489, 97, textureX, textureY); // Box 508
		bodyModel[267] = new ModelRendererTurbo(this, 2481, 105, textureX, textureY); // Box 509
		bodyModel[268] = new ModelRendererTurbo(this, 2305, 137, textureX, textureY); // Box 510
		bodyModel[269] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 511
		bodyModel[270] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 512
		bodyModel[271] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 513
		bodyModel[272] = new ModelRendererTurbo(this, 1729, 129, textureX, textureY); // Box 514
		bodyModel[273] = new ModelRendererTurbo(this, 3937, 113, textureX, textureY); // Box 515
		bodyModel[274] = new ModelRendererTurbo(this, 881, 129, textureX, textureY); // Box 516
		bodyModel[275] = new ModelRendererTurbo(this, 1553, 129, textureX, textureY); // Box 517
		bodyModel[276] = new ModelRendererTurbo(this, 3977, 113, textureX, textureY); // Box 518
		bodyModel[277] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 519
		bodyModel[278] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 520
		bodyModel[279] = new ModelRendererTurbo(this, 2993, 129, textureX, textureY); // Box 521
		bodyModel[280] = new ModelRendererTurbo(this, 2393, 137, textureX, textureY); // Box 522
		bodyModel[281] = new ModelRendererTurbo(this, 1865, 97, textureX, textureY); // Box 523
		bodyModel[282] = new ModelRendererTurbo(this, 1945, 121, textureX, textureY); // Box 524
		bodyModel[283] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 525
		bodyModel[284] = new ModelRendererTurbo(this, 3225, 97, textureX, textureY); // Box 526
		bodyModel[285] = new ModelRendererTurbo(this, 4065, 97, textureX, textureY); // Box 527
		bodyModel[286] = new ModelRendererTurbo(this, 3121, 105, textureX, textureY); // Box 528
		bodyModel[287] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 529
		bodyModel[288] = new ModelRendererTurbo(this, 1073, 121, textureX, textureY); // Box 530
		bodyModel[289] = new ModelRendererTurbo(this, 3489, 113, textureX, textureY); // Box 531
		bodyModel[290] = new ModelRendererTurbo(this, 1793, 129, textureX, textureY); // Box 532
		bodyModel[291] = new ModelRendererTurbo(this, 3954, 383, textureX, textureY); // Box 533
		bodyModel[292] = new ModelRendererTurbo(this, 1585, 137, textureX, textureY); // Box 534
		bodyModel[293] = new ModelRendererTurbo(this, 1609, 137, textureX, textureY); // Box 535
		bodyModel[294] = new ModelRendererTurbo(this, 2441, 137, textureX, textureY); // Box 536
		bodyModel[295] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 537
		bodyModel[296] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 538
		bodyModel[297] = new ModelRendererTurbo(this, 1153, 145, textureX, textureY); // Box 539
		bodyModel[298] = new ModelRendererTurbo(this, 1617, 145, textureX, textureY); // Box 540
		bodyModel[299] = new ModelRendererTurbo(this, 4089, 1, textureX, textureY); // Box 541
		bodyModel[300] = new ModelRendererTurbo(this, 1337, 25, textureX, textureY); // Box 542
		bodyModel[301] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 543
		bodyModel[302] = new ModelRendererTurbo(this, 1417, 17, textureX, textureY); // Box 544
		bodyModel[303] = new ModelRendererTurbo(this, 2137, 129, textureX, textureY); // Box 545
		bodyModel[304] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 932
		bodyModel[305] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 934
		bodyModel[306] = new ModelRendererTurbo(this, 3905, 1, textureX, textureY); // Box 935
		bodyModel[307] = new ModelRendererTurbo(this, 3553, 9, textureX, textureY); // Box 936
		bodyModel[308] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 937
		bodyModel[309] = new ModelRendererTurbo(this, 1865, 33, textureX, textureY); // Box 938
		bodyModel[310] = new ModelRendererTurbo(this, 2577, 33, textureX, textureY); // Box 939
		bodyModel[311] = new ModelRendererTurbo(this, 3969, 17, textureX, textureY); // Box 940
		bodyModel[312] = new ModelRendererTurbo(this, 2849, 9, textureX, textureY); // Box 941
		bodyModel[313] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 942
		bodyModel[314] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 943
		bodyModel[315] = new ModelRendererTurbo(this, 1921, 17, textureX, textureY); // Box 944
		bodyModel[316] = new ModelRendererTurbo(this, 3225, 33, textureX, textureY); // Box 945
		bodyModel[317] = new ModelRendererTurbo(this, 3305, 33, textureX, textureY); // Box 946
		bodyModel[318] = new ModelRendererTurbo(this, 3321, 33, textureX, textureY); // Box 947
		bodyModel[319] = new ModelRendererTurbo(this, 4009, 17, textureX, textureY); // Box 948
		bodyModel[320] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 971
		bodyModel[321] = new ModelRendererTurbo(this, 3697, 225, textureX, textureY); // Box 972
		bodyModel[322] = new ModelRendererTurbo(this, 2049, 201, textureX, textureY); // Box 973
		bodyModel[323] = new ModelRendererTurbo(this, 1929, 113, textureX, textureY); // Box 974
		bodyModel[324] = new ModelRendererTurbo(this, 761, 217, textureX, textureY); // Box 975
		bodyModel[325] = new ModelRendererTurbo(this, 2137, 153, textureX, textureY); // Box 976
		bodyModel[326] = new ModelRendererTurbo(this, 3457, 153, textureX, textureY); // Box 977
		bodyModel[327] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Box 978
		bodyModel[328] = new ModelRendererTurbo(this, 513, 209, textureX, textureY); // Box 979
		bodyModel[329] = new ModelRendererTurbo(this, 2417, 209, textureX, textureY); // Box 980
		bodyModel[330] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 981
		bodyModel[331] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 982
		bodyModel[332] = new ModelRendererTurbo(this, 3985, 225, textureX, textureY); // Box 983
		bodyModel[333] = new ModelRendererTurbo(this, 1721, 217, textureX, textureY); // Box 984
		bodyModel[334] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 985
		bodyModel[335] = new ModelRendererTurbo(this, 1337, 153, textureX, textureY); // Box 986
		bodyModel[336] = new ModelRendererTurbo(this, 4033, 81, textureX, textureY); // Box 987
		bodyModel[337] = new ModelRendererTurbo(this, 2345, 89, textureX, textureY); // Box 988
		bodyModel[338] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 989
		bodyModel[339] = new ModelRendererTurbo(this, 3993, 161, textureX, textureY); // Box 990
		bodyModel[340] = new ModelRendererTurbo(this, 2761, 113, textureX, textureY); // Box 991
		bodyModel[341] = new ModelRendererTurbo(this, 4073, 129, textureX, textureY); // Box 992
		bodyModel[342] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 993
		bodyModel[343] = new ModelRendererTurbo(this, 1793, 217, textureX, textureY); // Box 994
		bodyModel[344] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 995
		bodyModel[345] = new ModelRendererTurbo(this, 2201, 201, textureX, textureY); // Box 996
		bodyModel[346] = new ModelRendererTurbo(this, 2289, 217, textureX, textureY); // Box 997
		bodyModel[347] = new ModelRendererTurbo(this, 1577, 169, textureX, textureY); // Box 998
		bodyModel[348] = new ModelRendererTurbo(this, 1041, 177, textureX, textureY); // Box 999
		bodyModel[349] = new ModelRendererTurbo(this, 2465, 217, textureX, textureY); // Box 1000
		bodyModel[350] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 1001
		bodyModel[351] = new ModelRendererTurbo(this, 3297, 225, textureX, textureY); // Box 1002
		bodyModel[352] = new ModelRendererTurbo(this, 737, 97, textureX, textureY); // Box 1003
		bodyModel[353] = new ModelRendererTurbo(this, 3737, 225, textureX, textureY); // Box 1004
		bodyModel[354] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 1005
		bodyModel[355] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 1006
		bodyModel[356] = new ModelRendererTurbo(this, 593, 241, textureX, textureY); // Box 1007
		bodyModel[357] = new ModelRendererTurbo(this, 2969, 241, textureX, textureY); // Box 1008
		bodyModel[358] = new ModelRendererTurbo(this, 1409, 241, textureX, textureY); // Box 1009
		bodyModel[359] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 1010
		bodyModel[360] = new ModelRendererTurbo(this, 1793, 105, textureX, textureY); // Box 1011
		bodyModel[361] = new ModelRendererTurbo(this, 3025, 241, textureX, textureY); // Box 1012
		bodyModel[362] = new ModelRendererTurbo(this, 3425, 241, textureX, textureY); // Box 1013
		bodyModel[363] = new ModelRendererTurbo(this, 3481, 241, textureX, textureY); // Box 1014
		bodyModel[364] = new ModelRendererTurbo(this, 3537, 241, textureX, textureY); // Box 1015
		bodyModel[365] = new ModelRendererTurbo(this, 1865, 113, textureX, textureY); // Box 1016
		bodyModel[366] = new ModelRendererTurbo(this, 3225, 113, textureX, textureY); // Box 1017
		bodyModel[367] = new ModelRendererTurbo(this, 3633, 241, textureX, textureY); // Box 1018
		bodyModel[368] = new ModelRendererTurbo(this, 1297, 249, textureX, textureY); // Box 1019
		bodyModel[369] = new ModelRendererTurbo(this, 3673, 241, textureX, textureY); // Box 1020
		bodyModel[370] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 1021
		bodyModel[371] = new ModelRendererTurbo(this, 3985, 241, textureX, textureY); // Box 1022
		bodyModel[372] = new ModelRendererTurbo(this, 1729, 185, textureX, textureY); // Box 1023
		bodyModel[373] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 1024
		bodyModel[374] = new ModelRendererTurbo(this, 3305, 185, textureX, textureY); // Box 1025
		bodyModel[375] = new ModelRendererTurbo(this, 1857, 249, textureX, textureY); // Box 1026
		bodyModel[376] = new ModelRendererTurbo(this, 4033, 17, textureX, textureY); // Box 1029
		bodyModel[377] = new ModelRendererTurbo(this, 2321, 1, textureX, textureY); // Box 1030
		bodyModel[378] = new ModelRendererTurbo(this, 2577, 1, textureX, textureY); // Box 1031
		bodyModel[379] = new ModelRendererTurbo(this, 3553, 1, textureX, textureY); // Box 1032
		bodyModel[380] = new ModelRendererTurbo(this, 3777, 1, textureX, textureY); // Box 1033
		bodyModel[381] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 1034
		bodyModel[382] = new ModelRendererTurbo(this, 3601, 9, textureX, textureY); // Box 1035
		bodyModel[383] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 1036
		bodyModel[384] = new ModelRendererTurbo(this, 1529, 89, textureX, textureY); // Box 1037
		bodyModel[385] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 1038
		bodyModel[386] = new ModelRendererTurbo(this, 1977, 25, textureX, textureY); // Box 1039
		bodyModel[387] = new ModelRendererTurbo(this, 1809, 25, textureX, textureY); // Box 1040
		bodyModel[388] = new ModelRendererTurbo(this, 2241, 25, textureX, textureY); // Box 1041
		bodyModel[389] = new ModelRendererTurbo(this, 3057, 25, textureX, textureY); // Box 1042
		bodyModel[390] = new ModelRendererTurbo(this, 2177, 249, textureX, textureY); // Box 1043
		bodyModel[391] = new ModelRendererTurbo(this, 841, 249, textureX, textureY); // Box 1044
		bodyModel[392] = new ModelRendererTurbo(this, 1385, 249, textureX, textureY); // Box 1045
		bodyModel[393] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 1046
		bodyModel[394] = new ModelRendererTurbo(this, 2233, 249, textureX, textureY); // Box 1
		bodyModel[395] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 2
		bodyModel[396] = new ModelRendererTurbo(this, 1081, 9, textureX, textureY); // Box 3
		bodyModel[397] = new ModelRendererTurbo(this, 1257, 9, textureX, textureY); // Box 9
		bodyModel[398] = new ModelRendererTurbo(this, 2809, 9, textureX, textureY); // Box 10
		bodyModel[399] = new ModelRendererTurbo(this, 3761, 9, textureX, textureY); // Box 11
		bodyModel[400] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 12
		bodyModel[401] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 13
		bodyModel[402] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 14
		bodyModel[403] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 16
		bodyModel[404] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 17
		bodyModel[405] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 18
		bodyModel[406] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 19
		bodyModel[407] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 20
		bodyModel[408] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 21
		bodyModel[409] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 22
		bodyModel[410] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 23
		bodyModel[411] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 24
		bodyModel[412] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 25
		bodyModel[413] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 26
		bodyModel[414] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 27
		bodyModel[415] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 28
		bodyModel[416] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 30
		bodyModel[417] = new ModelRendererTurbo(this, 889, 17, textureX, textureY); // Box 32
		bodyModel[418] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 33
		bodyModel[419] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 34
		bodyModel[420] = new ModelRendererTurbo(this, 1065, 17, textureX, textureY); // Box 35
		bodyModel[421] = new ModelRendererTurbo(this, 1073, 17, textureX, textureY); // Box 36
		bodyModel[422] = new ModelRendererTurbo(this, 1081, 17, textureX, textureY); // Box 37
		bodyModel[423] = new ModelRendererTurbo(this, 1089, 17, textureX, textureY); // Box 38
		bodyModel[424] = new ModelRendererTurbo(this, 1097, 17, textureX, textureY); // Box 39
		bodyModel[425] = new ModelRendererTurbo(this, 1265, 17, textureX, textureY); // Box 40
		bodyModel[426] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Box 41
		bodyModel[427] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Box 42
		bodyModel[428] = new ModelRendererTurbo(this, 2049, 17, textureX, textureY); // Box 43
		bodyModel[429] = new ModelRendererTurbo(this, 2057, 17, textureX, textureY); // Box 44
		bodyModel[430] = new ModelRendererTurbo(this, 2065, 17, textureX, textureY); // Box 45
		bodyModel[431] = new ModelRendererTurbo(this, 2193, 17, textureX, textureY); // Box 46
		bodyModel[432] = new ModelRendererTurbo(this, 2201, 17, textureX, textureY); // Box 47
		bodyModel[433] = new ModelRendererTurbo(this, 2761, 17, textureX, textureY); // Box 48
		bodyModel[434] = new ModelRendererTurbo(this, 2809, 17, textureX, textureY); // Box 49
		bodyModel[435] = new ModelRendererTurbo(this, 2817, 17, textureX, textureY); // Box 50
		bodyModel[436] = new ModelRendererTurbo(this, 2825, 17, textureX, textureY); // Box 51
		bodyModel[437] = new ModelRendererTurbo(this, 2937, 17, textureX, textureY); // Box 52
		bodyModel[438] = new ModelRendererTurbo(this, 3881, 225, textureX, textureY); // Box 53
		bodyModel[439] = new ModelRendererTurbo(this, 3761, 241, textureX, textureY); // Box 54
		bodyModel[440] = new ModelRendererTurbo(this, 177, 233, textureX, textureY); // Box 55
		bodyModel[441] = new ModelRendererTurbo(this, 1649, 209, textureX, textureY); // Box 56
		bodyModel[442] = new ModelRendererTurbo(this, 761, 249, textureX, textureY); // Box 57
		bodyModel[443] = new ModelRendererTurbo(this, 1497, 249, textureX, textureY); // Box 58
		bodyModel[444] = new ModelRendererTurbo(this, 2305, 249, textureX, textureY); // Box 59
		bodyModel[445] = new ModelRendererTurbo(this, 857, 217, textureX, textureY); // Box 60
		bodyModel[446] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 61
		bodyModel[447] = new ModelRendererTurbo(this, 633, 249, textureX, textureY); // Box 62
		bodyModel[448] = new ModelRendererTurbo(this, 1521, 257, textureX, textureY); // Box 63
		bodyModel[449] = new ModelRendererTurbo(this, 1569, 257, textureX, textureY); // Box 64
		bodyModel[450] = new ModelRendererTurbo(this, 2945, 17, textureX, textureY); // Box 65
		bodyModel[451] = new ModelRendererTurbo(this, 2961, 17, textureX, textureY); // Box 66
		bodyModel[452] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 67
		bodyModel[453] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 68
		bodyModel[454] = new ModelRendererTurbo(this, 1345, 25, textureX, textureY); // Box 69
		bodyModel[455] = new ModelRendererTurbo(this, 1385, 25, textureX, textureY); // Box 70
		bodyModel[456] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 71
		bodyModel[457] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 72
		bodyModel[458] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 73
		bodyModel[459] = new ModelRendererTurbo(this, 2193, 33, textureX, textureY); // Box 74
		bodyModel[460] = new ModelRendererTurbo(this, 2649, 33, textureX, textureY); // Box 75
		bodyModel[461] = new ModelRendererTurbo(this, 2697, 33, textureX, textureY); // Box 76
		bodyModel[462] = new ModelRendererTurbo(this, 3457, 33, textureX, textureY); // Box 77
		bodyModel[463] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 78
		bodyModel[464] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 79
		bodyModel[465] = new ModelRendererTurbo(this, 1153, 41, textureX, textureY); // Box 80
		bodyModel[466] = new ModelRendererTurbo(this, 1729, 41, textureX, textureY); // Box 81
		bodyModel[467] = new ModelRendererTurbo(this, 1769, 41, textureX, textureY); // Box 82
		bodyModel[468] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 85
		bodyModel[469] = new ModelRendererTurbo(this, 3185, 217, textureX, textureY); // Box 86
		bodyModel[470] = new ModelRendererTurbo(this, 3425, 217, textureX, textureY); // Box 87
		bodyModel[471] = new ModelRendererTurbo(this, 3633, 217, textureX, textureY); // Box 88
		bodyModel[472] = new ModelRendererTurbo(this, 2777, 257, textureX, textureY); // Box 89
		bodyModel[473] = new ModelRendererTurbo(this, 2913, 257, textureX, textureY); // Box 96
		bodyModel[474] = new ModelRendererTurbo(this, 2969, 257, textureX, textureY); // Box 97
		bodyModel[475] = new ModelRendererTurbo(this, 3801, 185, textureX, textureY); // Box 98
		bodyModel[476] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 99
		bodyModel[477] = new ModelRendererTurbo(this, 1681, 233, textureX, textureY); // Box 100
		bodyModel[478] = new ModelRendererTurbo(this, 1905, 217, textureX, textureY); // Box 101
		bodyModel[479] = new ModelRendererTurbo(this, 3465, 257, textureX, textureY); // Box 102
		bodyModel[480] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Box 103
		bodyModel[481] = new ModelRendererTurbo(this, 2993, 201, textureX, textureY); // Box 104
		bodyModel[482] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 105
		bodyModel[483] = new ModelRendererTurbo(this, 1713, 233, textureX, textureY); // Box 106
		bodyModel[484] = new ModelRendererTurbo(this, 3217, 225, textureX, textureY); // Box 107
		bodyModel[485] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Box 108
		bodyModel[486] = new ModelRendererTurbo(this, 577, 265, textureX, textureY); // Box 109
		bodyModel[487] = new ModelRendererTurbo(this, 625, 209, textureX, textureY); // Box 110
		bodyModel[488] = new ModelRendererTurbo(this, 3761, 225, textureX, textureY); // Box 111
		bodyModel[489] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 112
		bodyModel[490] = new ModelRendererTurbo(this, 633, 233, textureX, textureY); // Box 113
		bodyModel[491] = new ModelRendererTurbo(this, 3465, 241, textureX, textureY); // Box 114
		bodyModel[492] = new ModelRendererTurbo(this, 1897, 249, textureX, textureY); // Box 115
		bodyModel[493] = new ModelRendererTurbo(this, 2569, 225, textureX, textureY); // Box 116
		bodyModel[494] = new ModelRendererTurbo(this, 3729, 249, textureX, textureY); // Box 117
		bodyModel[495] = new ModelRendererTurbo(this, 945, 265, textureX, textureY); // Box 118
		bodyModel[496] = new ModelRendererTurbo(this, 1001, 265, textureX, textureY); // Box 119
		bodyModel[497] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Box 120
		bodyModel[498] = new ModelRendererTurbo(this, 2601, 225, textureX, textureY); // Box 121
		bodyModel[499] = new ModelRendererTurbo(this, 3601, 25, textureX, textureY); // Box 123

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

		bodyModel[35].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F); // Box 52
		bodyModel[35].setRotationPoint(-164F, -9F, 14F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0.5F, 4F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, 0.5F, 0F, 4F, -2F, 1.5F, -6F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0.5F, 1F, -6F, -2F); // Box 5
		bodyModel[36].setRotationPoint(-217F, -24F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, 5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -5.5F, 0F, 0F, 5F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, -5.5F); // Box 5
		bodyModel[37].setRotationPoint(-214F, -30F, 16F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 2.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 4F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 5
		bodyModel[38].setRotationPoint(-194F, -28F, 23F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 5
		bodyModel[39].setRotationPoint(-169F, -67F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, 1F, 6F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 1F, -6F); // Box 4
		bodyModel[40].setRotationPoint(-205F, -30F, 21F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -4F, 1F, 0F, -2F, 1F, 0F, -5F, 1F, 0F, -5F, -3F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, -3F); // Box 4
		bodyModel[41].setRotationPoint(-179F, -66F, 15F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 208, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 4
		bodyModel[42].setRotationPoint(-137F, -68F, 14F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2.25F, -0.7F, 0F, -2.15F, -0.45F, 0F, 1.7F, -1.9F, 0F, -1.7F, -1.9F, 0F, -1.4F, -1F, 0F, 1.4F, -1F, 0F); // Box 4
		bodyModel[43].setRotationPoint(-200F, -44F, 5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, 7.5F, -1.5F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -7.5F, -1.5F); // Box 4
		bodyModel[44].setRotationPoint(-214F, -19F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 4
		bodyModel[45].setRotationPoint(-194F, -30F, 23F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4.5F, 0F, -3F, 4F, 0F, -0.5F, 0.5F, 0F, 0.5F, -1F, 0F, -2.5F, -4.5F); // Box 3
		bodyModel[46].setRotationPoint(-214F, -27F, 15F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 3
		bodyModel[47].setRotationPoint(-194F, -37F, 23F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 4.5F, 4.5F, 0F, 2F, 0.5F, 0F, 1F, -0.5F, 0F, 3F, -5F, 0F, -7F, 6.5F, 0F, -3F, 4.5F, 0F, -1F, -5.5F, 0F, -5F, -7.5F); // Box 3
		bodyModel[48].setRotationPoint(-205F, -19F, 18F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 8F, -4F); // Box 3
		bodyModel[49].setRotationPoint(-164F, -60F, 29F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 1F, 0F, -2F, 1F, 0F, -4F, 0F, 0F, -6F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 3F, 0F, 0F, 4F, 1F); // Box 3
		bodyModel[50].setRotationPoint(-169F, -67F, 15F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 208, 15, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[51].setRotationPoint(-137F, -44F, 36F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 265
		bodyModel[52].setRotationPoint(-128F, -50F, 34F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 264
		bodyModel[53].setRotationPoint(-128F, -57F, 29F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 50, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 263
		bodyModel[54].setRotationPoint(-128F, -62F, 22F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 56, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[55].setRotationPoint(-128F, -65F, 14F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 58, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[56].setRotationPoint(-128F, -66F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-2.1F, -0.45F, 0F, 2.05F, -0.7F, 0F, 4.8F, -1.5F, 0.5F, -5F, -1F, 0.5F, 1.4F, -3F, 0F, -1.4F, -3F, 0F, 3F, 1F, 2F, -4F, 1F, 3F); // Box 2
		bodyModel[57].setRotationPoint(-200F, -44F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 27, 3, 7, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -11F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 10F, 0F); // Box 2
		bodyModel[58].setRotationPoint(-164F, -65F, 22F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -4F, 0F, 0F, -2F, 1F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, 3F, 0F, 0F, 4F, 0F); // Box 2
		bodyModel[59].setRotationPoint(-169F, -65F, 19F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 3F, 2F, -2F, 3F, -1F, -2F, 3F, 1F, 0F, 3F, -2F); // Box 2
		bodyModel[60].setRotationPoint(-193F, -43F, 22F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F,0F, 4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F); // Box 18
		bodyModel[61].setRotationPoint(-189F, -9F, 5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 208, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[62].setRotationPoint(-137F, -8F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 208, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 15
		bodyModel[63].setRotationPoint(-137F, -9F, 14F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 208, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 14
		bodyModel[64].setRotationPoint(-137F, -12F, 22F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 208, 3, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F); // Box 13
		bodyModel[65].setRotationPoint(-137F, -16F, 29F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -4F, 2F, 0F, -2F, 1F, 0F, -3.5F, -2.5F, 0F, -4F, -5F, 0F, 2F, 2F, 0F, 0F, 1F, 0F, 1.5F, -2.5F, 0F, 2F, -5F); // Box 13
		bodyModel[66].setRotationPoint(-187F, -60F, 13F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -4F, 2F, 0F, -2F, 1F, 0F, -5.5F, 0F, 0F, -5.5F, -3.5F, 0F, 2F, 2F, 0F, 0F, 1F, 0F, 3.5F, 0F, 0F, 3.5F, -3.5F); // Box 12
		bodyModel[67].setRotationPoint(-185F, -62F, 14F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 208, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 12
		bodyModel[68].setRotationPoint(-137F, -23F, 34F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 2.5F, 4.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1.5F, -5F, 0F, -2.5F, 5.5F, 0F, 0F, 1.5F, 0F, 1F, -1.5F, 0F, -1F, -6F); // Box 12
		bodyModel[69].setRotationPoint(-205F, -23F, 19F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 4F, 5F, 0F, 4F, 2F, 0F, 4F, 0F, 0F, 4F, -5F, 0F, -1F, 6F, 0F, 1F, 2F, 0F, 0F, -1F, 0F, 0F, -6F); // Box 12
		bodyModel[70].setRotationPoint(-164F, -34F, 38F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -4F, 2F, 0F, -2F, 1F, 0F, -3F, -3F, 0F, -7.5F, -1F, 0F, 2F, 2F, 0F, 0F, 1F, 0F, 1F, -3F, 0F, 5.5F, -1F); // Box 11
		bodyModel[71].setRotationPoint(-182F, -64F, 15F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 208, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F); // Box 11
		bodyModel[72].setRotationPoint(-137F, -34F, 38F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 4.5F, 5.5F, 0F, 0.5F, 2.5F, 0F, -1F, -3F, 0F, 3.5F, -6F, 0F, -8.5F, 6.5F, 0F, -3F, 4.5F, 0F, -1F, -5.5F, 0F, -6.5F, -7.5F); // Box 11
		bodyModel[73].setRotationPoint(-214F, -23F, 16F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 208, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 101
		bodyModel[74].setRotationPoint(-137F, -60F, 29F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 10
		bodyModel[75].setRotationPoint(-164F, -8F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 23, 3, 4, 0F,0F, -5F, 8F, 0F, -3F, -2F, 0F, -8F, 0F, 0F, -10F, -10F, 0F, 2F, 9F, 0F, 1F, -1F, 0F, 7F, -1F, 0F, 7F, -11F); // Box 10
		bodyModel[76].setRotationPoint(-187F, -53F, 29F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 208, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 10
		bodyModel[77].setRotationPoint(-137F, -45F, 38F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -6.5F, 0F, 0.3F, -4.1F, 0F, 0.6F, -5F, -2F, 0F, -8F, -1.5F, 0F, 6F, 0F, 1.4F, 2.1F, 0F, 1.7F, 3F, -2.1F, 0F, 7.5F, -1.5F); // Box 10
		bodyModel[78].setRotationPoint(-208F, -47F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-5F, -2F, 2F, 0F, -3F, -2F, -2F, -9F, 0F, -2F, -9F, -2.5F, -6F, -1F, 2F, 0F, 0F, -1F, -2F, 6F, -1F, -2.75F, 6.5F, -2.5F); // Box 1
		bodyModel[79].setRotationPoint(-197F, -52F, 15F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 27, 3, 7, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 6F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, -3F); // Box 1
		bodyModel[80].setRotationPoint(-164F, -12F, 22F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 1
		bodyModel[81].setRotationPoint(-196F, -37F, 20F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,-3F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, -8F, -2F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, -2F, 5F, -3F); // Box 1
		bodyModel[82].setRotationPoint(-172F, -61F, 22F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F); // Box 1
		bodyModel[83].setRotationPoint(-164F, -68F, 14F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, -5F, 0F, -2.5F, 5.5F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, -1.5F, -6F); // Box 1
		bodyModel[84].setRotationPoint(-205F, -27F, 20F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 4F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0.5F, 0F, 6F, -1.5F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0.5F, 0F, -6F, -1.5F); // Box 1
		bodyModel[85].setRotationPoint(-205F, -15F, 5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F); // Box 0
		bodyModel[86].setRotationPoint(-164F, -69F, 5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 27, 3, 4, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 6F, -6F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -5F); // Box 0
		bodyModel[87].setRotationPoint(-164F, -23F, 34F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F); // Box 0
		bodyModel[88].setRotationPoint(-164F, -9F, 14F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,-2F, -4F, -1F, 0F, -3F, -3F, 0F, -7F, 0F, 0F, -7.75F, -3.5F, -2F, 1F, 0F, 0F, 2F, -3F, 0F, 5F, -1F, -0.75F, 5.25F, -4.25F); // Box 0
		bodyModel[89].setRotationPoint(-172F, -57F, 26F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-4F, -2F, 2F, 0F, -3F, -2F, 0F, -8F, 0F, -2F, -8F, -4F, -4F, -1F, 3F, 0F, 0F, -1F, 0F, 5F, -1F, -2F, 5F, -5F); // Box 0
		bodyModel[90].setRotationPoint(-194F, -51F, 19F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 7F, -1F, 0F, -7F, -1F, 0F, -2.25F, 0.5F, 3.5F, 2F, 0F, 3.5F); // Box 0
		bodyModel[91].setRotationPoint(-193F, -50F, 5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 1F, 4F, 1F, 1F, 4F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[92].setRotationPoint(-195F, -33F, 21F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 3F, 4F, 0F, 0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 2.5F, -4.5F, 0F, -4.5F, 4.5F, 0F, -0.5F, 1.5F, 0F, 1F, -2F, 0F, -3.5F, -5F); // Box 0
		bodyModel[93].setRotationPoint(-214F, -25F, 15F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 208, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[94].setRotationPoint(-137F, -69F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,1.2F, 4F, 8.1F, 0F, 0F, 0F, 0F, 0F, 0F, 2.4F, 4F, -9F, -1.9F, -1.4F, 0.2F, 1F, 2F, -2F, 1F, 2F, 2F, -1.9F, -1.4F, -0.2F); // Box 0
		bodyModel[95].setRotationPoint(-199F, -38F, 18F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 207, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, 0F, -3F, -8F); // Box 368
		bodyModel[96].setRotationPoint(-136F, -17F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 86, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 370
		bodyModel[97].setRotationPoint(-214F, -25F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 51, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 0F); // Box 371
		bodyModel[98].setRotationPoint(-188F, -25F, 14F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -1F); // Box 372
		bodyModel[99].setRotationPoint(-205F, -25F, 14F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -3F); // Box 373
		bodyModel[100].setRotationPoint(-215F, -25F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[101].setRotationPoint(-208F, -40F, 5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[102].setRotationPoint(-208F, -39F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 376
		bodyModel[103].setRotationPoint(-208F, -37F, 12F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 55, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, -2F, 5F); // Box 1
		bodyModel[104].setRotationPoint(-30F, -35F, 38F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 55, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 2
		bodyModel[105].setRotationPoint(-30F, -30F, 43F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 45, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 3
		bodyModel[106].setRotationPoint(-30F, -19F, 43F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, -1F, 3F); // Box 176
		bodyModel[107].setRotationPoint(-49F, -35F, 38F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 19, 13, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F); // Box 177
		bodyModel[108].setRotationPoint(-49F, -30F, 43F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 5F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -3F, -5F); // Box 178
		bodyModel[109].setRotationPoint(-49F, -19F, 43F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 179
		bodyModel[110].setRotationPoint(-30F, -11F, 41F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 45, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[111].setRotationPoint(-30F, -7F, 34F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 55, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[112].setRotationPoint(-30F, -6F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 182
		bodyModel[113].setRotationPoint(15F, -19F, 43F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183
		bodyModel[114].setRotationPoint(15F, -11F, 41F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[115].setRotationPoint(15F, -7F, 34F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 45, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[116].setRotationPoint(-30F, -6F, 26F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -5F, 6F, 0F, -3F, 3F, 0F, -2F, -4F, 0F, -4F, -7F); // Box 0
		bodyModel[117].setRotationPoint(-49F, -11F, 41F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 1
		bodyModel[118].setRotationPoint(-49F, -7F, 34F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F); // Box 2
		bodyModel[119].setRotationPoint(-49F, -6F, 26F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 19, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 3
		bodyModel[120].setRotationPoint(-49F, -6F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 1F, 0F); // Box 4
		bodyModel[121].setRotationPoint(-61F, -35F, 38F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, -3F, 5F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, -3F, -5F, 0F, -3F, 5F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -3F, -5F); // Box 5
		bodyModel[122].setRotationPoint(-61F, -30F, 43F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F,0F, 1F, 5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, -5F, 0F, -4F, 9F, 0F, -3F, 5F, 0F, -3F, -5F, 0F, -4F, -9F); // Box 6
		bodyModel[123].setRotationPoint(-61F, -19F, 43F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 2F, 7F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 2F, -7F, 0F, -8F, 10F, 0F, -5F, 6F, 0F, -4F, -7F, 0F, -7F, -11F); // Box 7
		bodyModel[124].setRotationPoint(-61F, -11F, 41F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 8
		bodyModel[125].setRotationPoint(-68F, -27F, 38F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 9F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -1F, -10F); // Box 9
		bodyModel[126].setRotationPoint(-68F, -20F, 38F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 5F, 0F, 0F, 2F, 0F, 0F, 3F, 1F, 0F, 6F, -3F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -3F, 1F, 0F, -6F, -3F); // Box 10
		bodyModel[127].setRotationPoint(-61F, -6F, 26F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 12, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F); // Box 11
		bodyModel[128].setRotationPoint(-61F, -6F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 3F, 12F, 0F, 2F, 7F, 0F, 2F, -7F, 0F, 3F, -13F, 0F, -7F, 17F, 0F, -8F, 10F, 0F, -7F, -11F, 0F, -7F, -18F); // Box 12
		bodyModel[129].setRotationPoint(-68F, -11F, 41F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 3F, 4F, 0F, 5F, 0F, 0F, 6F, -3F, 0F, 5F, -10F, 0F, -4F, 4F, 0F, -5F, 0F, 0F, -6F, -3F, 0F, -6F, -10F); // Box 14
		bodyModel[130].setRotationPoint(-68F, -6F, 26F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 7, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, -4F); // Box 16
		bodyModel[131].setRotationPoint(-68F, -6F, 5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -2F); // Box 17
		bodyModel[132].setRotationPoint(-68F, -35F, 38F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -2F, -2F); // Box 192
		bodyModel[133].setRotationPoint(25F, -19F, 43F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -4F, 6F, 0F, -3F, -7F, 0F, -2F, -4F); // Box 193
		bodyModel[134].setRotationPoint(25F, -11F, 41F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, -3F, 0F, 0F, 0F); // Box 194
		bodyModel[135].setRotationPoint(25F, -7F, 34F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 2F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, -2F, 5F, 0F, -2F, 15F, 0F, -2F, -15F, 0F, -2F, -5F); // Box 195
		bodyModel[136].setRotationPoint(35F, -19F, 43F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 3F, 0F, 0F, 13F, 0F, 0F, -13F, 0F, 0F, -3F, 0F, -4F, 6F, 0F, -6F, 15F, 0F, -5F, -16F, 0F, -3F, -7F); // Box 196
		bodyModel[137].setRotationPoint(35F, -11F, 41F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -2F, 0F); // Box 197
		bodyModel[138].setRotationPoint(25F, -30F, 43F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, -2F, 5F); // Box 198
		bodyModel[139].setRotationPoint(25F, -35F, 38F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 6F, 0F, -2F, -5F, 0F, -2F, 0F); // Box 199
		bodyModel[140].setRotationPoint(35F, -30F, 41F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F, 3F); // Box 200
		bodyModel[141].setRotationPoint(35F, -35F, 38F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[142].setRotationPoint(15F, -6F, 26F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 203
		bodyModel[143].setRotationPoint(25F, -6F, 26F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[144].setRotationPoint(25F, -6F, 5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, -8F, 0F, 2F, 1F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, -8F, 0F, -2F, 1F); // Box 205
		bodyModel[145].setRotationPoint(35F, -6F, 26F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 206
		bodyModel[146].setRotationPoint(35F, -6F, 5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 1F); // Box 207
		bodyModel[147].setRotationPoint(45F, -35F, 38F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -2F, 6F, 0F, -2F, 8F, 0F, -2F, -9F, 0F, -2F, -5F); // Box 208
		bodyModel[148].setRotationPoint(45F, -30F, 41F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 8F, 0F, 0F, 10F, 0F, 0F, -11F, 0F, 0F, -7F, 0F, -2F, 15F, 0F, -3F, 18F, 0F, -3F, -19F, 0F, -2F, -15F); // Box 209
		bodyModel[149].setRotationPoint(45F, -19F, 43F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 13F, 0F, 1F, 16F, 0F, 1F, -17F, 0F, 0F, -13F, 0F, -6F, 15F, 0F, -6F, 18F, 0F, -6F, -19F, 0F, -5F, -16F); // Box 210
		bodyModel[150].setRotationPoint(45F, -11F, 41F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -4F, 0F); // Box 211
		bodyModel[151].setRotationPoint(45F, -6F, 5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, -1F, -5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, -1F, -1F, 4F); // Box 384
		bodyModel[152].setRotationPoint(-218F, -28F, -2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, -6F, 0F, -1.5F, -1.5F, 0F, -1F, 1F, -1F, -1F, 5F, 0F, -1F, -6F, 0F, 0.5F, -2F, 0F, -0.5F, 1.5F, -1F, -1F, 5F); // Box 385
		bodyModel[153].setRotationPoint(-218F, -29F, -3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -4F, -8F, 0F, -1F, -5.5F, 0F, -2.5F, 4.5F, -1F, -4F, 7F, 0F, -1F, -8F, 0F, -0.5F, -3.5F, 0F, -0.5F, 3F, -1F, -1F, 7F); // Box 386
		bodyModel[154].setRotationPoint(-218F, -37F, -5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.5F, 1.5F, 0F, 3F, 0F, -1F, 4F, 2F, -1F, 4F, -2F, 0F, 3F, 0F); // Box 387
		bodyModel[155].setRotationPoint(-196F, -43F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -8F, -1.5F, 0F, -5F, -0.5F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, 7.5F, -1.5F, 0F, 4.5F, -0.5F, 0F, 3F, 0F, 0F, 5.5F, 0F); // Box 388
		bodyModel[156].setRotationPoint(-214F, -44F, -1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, -7F, -5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 4F, -6F, 0F, 4F, -3F, 0F, -4F, 2F, 0F, -1F, 6F); // Box 389
		bodyModel[157].setRotationPoint(-164F, -45F, -29F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 27, 3, 4, 0F,0F, -8F, -5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, 7F, -6F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 1F, 4F); // Box 390
		bodyModel[158].setRotationPoint(-164F, -53F, -28F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-1F, -4F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 391
		bodyModel[159].setRotationPoint(-188F, -60F, -2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -8F, 0F, -1.5F, -4F, 0F, -0.5F, 3.5F, -1F, 0F, 7F, 0F, -5F, -8F, 0F, -1.5F, -5.5F, 0F, -3.5F, 4.5F, -1F, -5F, 7F); // Box 392
		bodyModel[160].setRotationPoint(-218F, -28F, -5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 0.5F, -6F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, -0.5F, 0.5F, 5F, 0F, 0F, -6F, 0F, 0F, -1.5F, 0F, 0F, 1F, -1F, 0F, 5F); // Box 393
		bodyModel[161].setRotationPoint(-218F, -30F, -3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -6F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1F, -1F, 0F, 5F, 0.5F, -0.5F, -6F, 0F, 0.5F, -1.5F, 0F, 0.5F, 1F, 0F, -0.5F, 5.5F); // Box 394
		bodyModel[162].setRotationPoint(-218F, -33F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -3F, -4.5F, 0F, -2.5F, 0F, -3F, 0F, 2.5F, 0F, -3F, 3.5F, 0F, 1.5F, -4.5F, 0F, -0.5F, 0F, -3F, -1.5F, 2.5F, 0F, 1.5F, 3.5F); // Box 395
		bodyModel[163].setRotationPoint(-214F, -39F, -4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,2.1F, 0F, -10.5F, -6.4F, 3F, -11F, -6.4F, 2.5F, 10F, 2.1F, -1.5F, 9.4F, -1F, -0.5F, -7F, -2.1F, -0.4F, -2.1F, -2.2F, -0.4F, 2.2F, -1F, -0.5F, 7F); // Box 396
		bodyModel[164].setRotationPoint(-206F, -39F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -4.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 3.5F, 0F, 0.5F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 2F); // Box 397
		bodyModel[165].setRotationPoint(-214F, -36F, -4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,-1F, -0.5F, -7F, -2.1F, -0.6F, -2.2F, -2.1F, -0.6F, 2.2F, -1F, -0.5F, 7F, -1F, 1F, -5.5F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 5.5F); // Box 398
		bodyModel[166].setRotationPoint(-206F, -37F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, -0.5F, -5.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -0.5F, 5F, 0F, 0.5F, -5.5F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 5F); // Box 399
		bodyModel[167].setRotationPoint(-214F, -33F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, -4F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[168].setRotationPoint(-185F, -62F, -3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 4F, -0.5F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -4F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 401
		bodyModel[169].setRotationPoint(-194F, -13F, -4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,1F, -6F, -2F, 0F, -3F, 0.5F, 0F, -1F, 0F, 1.5F, -6F, 0F, 0F, 4F, -2F, 0F, 2.5F, 0.5F, 0F, 0.5F, 0F, 0.5F, 4F, 0F); // Box 402
		bodyModel[170].setRotationPoint(-217F, -39F, 1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 208, 3, 4, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[171].setRotationPoint(-137F, -53F, -28F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, -6.5F, -1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 6.5F, 0F, 0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 6F); // Box 404
		bodyModel[172].setRotationPoint(-205F, -33F, -12F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 405
		bodyModel[173].setRotationPoint(-182F, -63F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0.5F, 0F, -2F, -5.5F, 0F, -1F, -5F, 0F, -3F, 4F, 0F, -4F, 4.5F); // Box 406
		bodyModel[174].setRotationPoint(-194F, -18F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 407
		bodyModel[175].setRotationPoint(-219F, -33F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 10, 3, 9, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[176].setRotationPoint(-179F, -65F, -4F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 208, 3, 7, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[177].setRotationPoint(-137F, -65F, -19F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, 6F, -5F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -8F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 3F); // Box 410
		bodyModel[178].setRotationPoint(-164F, -17F, -24F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 411
		bodyModel[179].setRotationPoint(-219F, -30F, 3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, -2F, -3.5F, 0F, 0F, -3F, 0F, -1F, 3F, 0F, -3F, 3.5F); // Box 412
		bodyModel[180].setRotationPoint(-194F, -23F, -12F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 25, 3, 1, 0F,0F, -8F, -10F, 0F, -7F, 0F, 0F, 0F, 0F, -2F, -2F, 10F, 0F, 5F, -11F, 0F, 4F, -1F, 0F, -1F, 1F, -2F, -1F, 11F); // Box 413
		bodyModel[181].setRotationPoint(-189F, -45F, -24F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 25, 6, 1, 0F,0F, 3F, -10F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 10F, 0F, -2F, -10F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -2F, 10F); // Box 414
		bodyModel[182].setRotationPoint(-189F, -34F, -24F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 25, 3, 4, 0F,0F, 7F, -10F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 6F, 6F, 0F, -10F, -9F, 0F, -8F, 0F, 0F, -2F, -1F, 0F, -8F, 5F); // Box 415
		bodyModel[183].setRotationPoint(-189F, -23F, -23F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 25, 3, 5, 0F,0F, 10F, -8F, 0F, 4F, -2F, 0F, -1F, 0F, 0F, 5F, 5F, 0F, -12F, -7F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, -7F, 4F); // Box 416
		bodyModel[184].setRotationPoint(-189F, -19F, -21F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 25, 3, 7, 0F,0F, 10F, -8F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 5F, 4F, 0F, -12F, -7F, 0F, -5F, -3F, 0F, -1F, 0F, 0F, -7F, 3F); // Box 417
		bodyModel[185].setRotationPoint(-189F, -14F, -19F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 25, 3, 8, 0F,0F, 9F, -4F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -11F, -3F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -7F, 0F); // Box 418
		bodyModel[186].setRotationPoint(-189F, -10F, -12F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 420
		bodyModel[187].setRotationPoint(-164F, -9F, -12F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 4F, -2F, 0F, 2.5F, 0.5F, 0F, 0.5F, 0F, 0.5F, 4F, 0F, 1F, -6F, -2F, 0F, -2.5F, 0.5F, 0F, -0.5F, 0F, 1.5F, -6F, 0F); // Box 422
		bodyModel[188].setRotationPoint(-217F, -24F, 1F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, -5.5F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 5F, 0F, 0F, -5.5F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 5F); // Box 423
		bodyModel[189].setRotationPoint(-214F, -30F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2.5F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 4F); // Box 424
		bodyModel[190].setRotationPoint(-194F, -28F, -14F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 425
		bodyModel[191].setRotationPoint(-169F, -67F, -4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 6F, 0F, 1F, -6F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 6F); // Box 426
		bodyModel[192].setRotationPoint(-205F, -30F, -12F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -5F, -3F, 0F, -5F, 1F, 0F, -2F, 1F, 0F, -4F, 1F, 0F, 3F, -3F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 2F, 1F); // Box 427
		bodyModel[193].setRotationPoint(-179F, -66F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 208, 3, 8, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[194].setRotationPoint(-137F, -68F, -12F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-2.15F, -0.45F, 0F, 2.25F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, -1F, 0F, -1.4F, -1F, 0F, -1.7F, -1.9F, 0F, 1.7F, -1.9F, 0F); // Box 429
		bodyModel[195].setRotationPoint(-200F, -44F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0F, 7.5F, -1.5F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, -7.5F, -1.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, -5.5F, 0F); // Box 430
		bodyModel[196].setRotationPoint(-214F, -19F, -1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2.5F); // Box 431
		bodyModel[197].setRotationPoint(-194F, -30F, -14F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 1F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, -2.5F, -4.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -3F, 4F); // Box 435
		bodyModel[198].setRotationPoint(-214F, -27F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,-1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 436
		bodyModel[199].setRotationPoint(-194F, -37F, -14F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 3F, -5F, 0F, 1F, -0.5F, 0F, 2F, 0.5F, 0F, 4.5F, 4.5F, 0F, -5F, -7.5F, 0F, -1F, -5.5F, 0F, -3F, 4.5F, 0F, -7F, 6.5F); // Box 437
		bodyModel[200].setRotationPoint(-205F, -19F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 27, 3, 5, 0F,0F, -10F, -3F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 8F, -4F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 438
		bodyModel[201].setRotationPoint(-164F, -60F, -24F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -6F, 1F, 0F, -4F, 0F, 0F, -2F, 1F, 0F, -3F, 1F, 0F, 4F, 1F, 0F, 3F, 0F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 439
		bodyModel[202].setRotationPoint(-169F, -67F, -8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 24, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 440
		bodyModel[203].setRotationPoint(-137F, -44F, -28F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 27, 2, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[204].setRotationPoint(-128F, -50F, -26F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 41, 5, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[205].setRotationPoint(-128F, -57F, -24F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 50, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		bodyModel[206].setRotationPoint(-128F, -62F, -19F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 56, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[207].setRotationPoint(-128F, -65F, -12F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 58, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[208].setRotationPoint(-128F, -66F, -4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-5F, -1F, 0.5F, 4.8F, -1.5F, 0.5F, 2.05F, -0.7F, 0F, -2.1F, -0.45F, 0F, -4F, 1F, 3F, 3F, 1F, 2F, -1.4F, -3F, 0F, 1.4F, -3F, 0F); // Box 449
		bodyModel[209].setRotationPoint(-200F, -44F, -6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 27, 3, 7, 0F,0F, -11F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 10F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 450
		bodyModel[210].setRotationPoint(-164F, -65F, -19F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -6F, 0F, 0F, -4F, 0F, 0F, -2F, 1F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 1F, 1F, 0F, 2F, 0F); // Box 451
		bodyModel[211].setRotationPoint(-169F, -65F, -12F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, 0F, 3F, -2F, -2F, 3F, 1F, -2F, 3F, -1F, 0F, 3F, 2F); // Box 452
		bodyModel[212].setRotationPoint(-193F, -43F, -13F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 25, 3, 9, 0F,0F, 7F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 453
		bodyModel[213].setRotationPoint(-189F, -9F, -4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 208, 3, 9, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[214].setRotationPoint(-137F, -8F, -4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 208, 3, 8, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[215].setRotationPoint(-137F, -9F, -12F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 208, 3, 7, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[216].setRotationPoint(-137F, -12F, -19F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 208, 3, 5, 0F,0F, 7F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 457
		bodyModel[217].setRotationPoint(-137F, -16F, -24F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -4F, -5F, 0F, -3.5F, -2.5F, 0F, -2F, 1F, 0F, -4F, 2F, 0F, 2F, -5F, 0F, 1.5F, -2.5F, 0F, 0F, 1F, 0F, 2F, 2F); // Box 458
		bodyModel[218].setRotationPoint(-187F, -60F, -6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -5.5F, -3.5F, 0F, -5.5F, 0F, 0F, -2F, 1F, 0F, -4F, 2F, 0F, 3.5F, -3.5F, 0F, 3.5F, 0F, 0F, 0F, 1F, 0F, 2F, 2F); // Box 459
		bodyModel[219].setRotationPoint(-185F, -62F, -7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 208, 3, 4, 0F,0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[220].setRotationPoint(-137F, -23F, -28F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 1.5F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2.5F, 4.5F, 0F, -1F, -6F, 0F, 1F, -1.5F, 0F, 0F, 1.5F, 0F, -2.5F, 5.5F); // Box 461
		bodyModel[221].setRotationPoint(-205F, -23F, -10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 27, 6, 1, 0F,0F, 4F, -5F, 0F, 4F, 0F, 0F, 4F, 2F, 0F, 4F, 5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 1F, 2F, 0F, -1F, 6F); // Box 462
		bodyModel[222].setRotationPoint(-164F, -34F, -29F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, -7.5F, -1F, 0F, -3F, -3F, 0F, -2F, 1F, 0F, -4F, 2F, 0F, 5.5F, -1F, 0F, 1F, -3F, 0F, 0F, 1F, 0F, 2F, 2F); // Box 463
		bodyModel[223].setRotationPoint(-182F, -64F, -8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 24, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[224].setRotationPoint(-137F, -34F, -29F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 3.5F, -6F, 0F, -1F, -3F, 0F, 0.5F, 2.5F, 0F, 4.5F, 5.5F, 0F, -6.5F, -7.5F, 0F, -1F, -5.5F, 0F, -3F, 4.5F, 0F, -8.5F, 6.5F); // Box 465
		bodyModel[225].setRotationPoint(-214F, -23F, -7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 208, 3, 5, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[226].setRotationPoint(-137F, -60F, -24F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 467
		bodyModel[227].setRotationPoint(-164F, -8F, -4F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 23, 3, 4, 0F,0F, -10F, -10F, 0F, -8F, 0F, 0F, -3F, -2F, 0F, -5F, 8F, 0F, 7F, -11F, 0F, 7F, -1F, 0F, 1F, -1F, 0F, 2F, 9F); // Box 468
		bodyModel[228].setRotationPoint(-187F, -53F, -23F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 208, 3, 1, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 469
		bodyModel[229].setRotationPoint(-137F, -45F, -29F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -8F, -1.5F, 0.6F, -5F, -2F, 0.3F, -4.1F, 0F, 0F, -6.5F, 0F, 0F, 7.5F, -1.5F, 1.7F, 3F, -2.1F, 1.4F, 2.1F, 0F, 0F, 6F, 0F); // Box 470
		bodyModel[230].setRotationPoint(-208F, -47F, -2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-2F, -9F, -2.5F, -2F, -9F, 0F, 0F, -3F, -2F, -5F, -2F, 2F, -2.75F, 6.5F, -2.5F, -2F, 6F, -1F, 0F, 0F, -1F, -6F, -1F, 2F); // Box 471
		bodyModel[231].setRotationPoint(-197F, -52F, -9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 27, 3, 7, 0F,0F, 6F, -3F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -7F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 472
		bodyModel[232].setRotationPoint(-164F, -12F, -19F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 1F, 0F); // Box 473
		bodyModel[233].setRotationPoint(-196F, -37F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,-2F, -8F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -2F, 5F, -3F, 0F, 6F, 0F, 0F, -1F, 0F, -3F, 0F, 0F); // Box 474
		bodyModel[234].setRotationPoint(-172F, -61F, -19F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 475
		bodyModel[235].setRotationPoint(-164F, -68F, -12F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, -5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 5F, 0F, -1.5F, -6F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -2.5F, 5.5F); // Box 476
		bodyModel[236].setRotationPoint(-205F, -27F, -11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 6F, -1.5F, 0F, 2F, 0.5F, 0F, -0.5F, 0F, 0F, 4F, 0F, 0F, -6F, -1.5F, 0F, -2F, 0.5F, 0F, 0.5F, 0F, 0F, -4F, 0F); // Box 477
		bodyModel[237].setRotationPoint(-205F, -15F, -3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 27, 3, 9, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 478
		bodyModel[238].setRotationPoint(-164F, -69F, -4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 27, 3, 4, 0F,0F, 6F, -6F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -8F, -5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 4F); // Box 479
		bodyModel[239].setRotationPoint(-164F, -23F, -28F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 27, 3, 8, 0F,0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 480
		bodyModel[240].setRotationPoint(-164F, -9F, -12F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0F, -7.75F, -3.5F, 0F, -7F, 0F, 0F, -3F, -3F, -2F, -4F, -1F, -0.75F, 5.25F, -4.25F, 0F, 5F, -1F, 0F, 2F, -3F, -2F, 1F, 0F); // Box 481
		bodyModel[241].setRotationPoint(-172F, -57F, -21F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-2F, -8F, -4F, 0F, -8F, 0F, 0F, -3F, -2F, -4F, -2F, 2F, -2F, 5F, -5F, 0F, 5F, -1F, 0F, 0F, -1F, -4F, -1F, 3F); // Box 482
		bodyModel[242].setRotationPoint(-194F, -51F, -13F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3.5F, -2.25F, 0.5F, 3.5F, -7F, -1F, 0F, 7F, -1F, 0F); // Box 483
		bodyModel[243].setRotationPoint(-193F, -50F, -3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 1F, 4F, -1F, 1F, 4F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 484
		bodyModel[244].setRotationPoint(-195F, -33F, -12F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 2.5F, -4.5F, 0F, -0.5F, -1F, 0F, 0.5F, 0.5F, 0F, 3F, 4F, 0F, -3.5F, -5F, 0F, 1F, -2F, 0F, -0.5F, 1.5F, 0F, -4.5F, 4.5F); // Box 485
		bodyModel[245].setRotationPoint(-214F, -25F, -6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 208, 3, 9, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[246].setRotationPoint(-137F, -69F, -4F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,2.4F, 4F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 4F, 8.1F, -1.9F, -1.4F, -0.2F, 1F, 2F, 2F, 1F, 2F, -2F, -1.9F, -1.4F, 0.2F); // Box 487
		bodyModel[247].setRotationPoint(-199F, -38F, -9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 198, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, 0F, -3F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[248].setRotationPoint(-127F, -17F, -21F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 86, 2, 9, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		bodyModel[249].setRotationPoint(-214F, -25F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 44, 2, 8, 0F,0F, 0F, 1F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[250].setRotationPoint(-188F, -25F, -12F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[251].setRotationPoint(-205F, -25F, -5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,-3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 492
		bodyModel[252].setRotationPoint(-215F, -25F, -4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[253].setRotationPoint(-208F, -40F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 15, 2, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[254].setRotationPoint(-208F, -39F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[255].setRotationPoint(-208F, -37F, -4F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 55, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -2F, -5F); // Box 498
		bodyModel[256].setRotationPoint(-30F, -35F, -29F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 55, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 499
		bodyModel[257].setRotationPoint(-30F, -30F, -34F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 45, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F); // Box 500
		bodyModel[258].setRotationPoint(-30F, -19F, -34F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, -1F, -3F); // Box 501
		bodyModel[259].setRotationPoint(-49F, -35F, -29F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 19, 13, 1, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 2F); // Box 502
		bodyModel[260].setRotationPoint(-49F, -30F, -34F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 19, 10, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, -5F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -3F, 5F); // Box 503
		bodyModel[261].setRotationPoint(-49F, -19F, -34F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -3F, 3F, 0F, -3F, 3F); // Box 504
		bodyModel[262].setRotationPoint(-30F, -11F, -32F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 45, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 505
		bodyModel[263].setRotationPoint(-30F, -7F, -28F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 55, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[264].setRotationPoint(-30F, -6F, -16F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F); // Box 507
		bodyModel[265].setRotationPoint(15F, -19F, -34F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -3F, 3F, 0F, -3F, 3F); // Box 508
		bodyModel[266].setRotationPoint(15F, -11F, -32F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 509
		bodyModel[267].setRotationPoint(15F, -7F, -28F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 45, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[268].setRotationPoint(-30F, -6F, -24F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, -4F, -7F, 0F, -2F, -4F, 0F, -3F, 3F, 0F, -5F, 6F); // Box 511
		bodyModel[269].setRotationPoint(-49F, -11F, -32F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 2F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, -1F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F); // Box 512
		bodyModel[270].setRotationPoint(-49F, -7F, -28F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 513
		bodyModel[271].setRotationPoint(-49F, -6F, -24F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 19, 1, 21, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[272].setRotationPoint(-49F, -6F, -16F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 1F, 0F); // Box 515
		bodyModel[273].setRotationPoint(-61F, -35F, -29F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, -3F, -5F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, -3F, 5F, 0F, -3F, -5F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -3F, 5F); // Box 516
		bodyModel[274].setRotationPoint(-61F, -30F, -34F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 12, 10, 1, 0F,0F, 1F, -5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 1F, 5F, 0F, -4F, -9F, 0F, -3F, -5F, 0F, -3F, 5F, 0F, -4F, 9F); // Box 517
		bodyModel[275].setRotationPoint(-61F, -19F, -34F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 2F, -7F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 2F, 7F, 0F, -7F, -11F, 0F, -4F, -7F, 0F, -5F, 6F, 0F, -8F, 10F); // Box 518
		bodyModel[276].setRotationPoint(-61F, -11F, -32F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 519
		bodyModel[277].setRotationPoint(-68F, -27F, -29F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -10F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, -1F, 9F); // Box 520
		bodyModel[278].setRotationPoint(-68F, -20F, -29F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 6F, -3F, 0F, 3F, 1F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, -6F, -3F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, -5F, 0F); // Box 521
		bodyModel[279].setRotationPoint(-61F, -6F, -24F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 12, 1, 21, 0F,0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[280].setRotationPoint(-61F, -6F, -16F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 3F, -13F, 0F, 2F, -7F, 0F, 2F, 7F, 0F, 3F, 12F, 0F, -7F, -18F, 0F, -7F, -11F, 0F, -8F, 10F, 0F, -7F, 17F); // Box 523
		bodyModel[281].setRotationPoint(-68F, -11F, -32F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, 5F, -10F, 0F, 6F, -3F, 0F, 5F, 0F, 0F, 3F, 4F, 0F, -6F, -10F, 0F, -6F, -3F, 0F, -5F, 0F, 0F, -4F, 4F); // Box 524
		bodyModel[282].setRotationPoint(-68F, -6F, -24F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 7, 1, 21, 0F,0F, 3F, -4F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[283].setRotationPoint(-68F, -6F, -16F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 7, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F); // Box 526
		bodyModel[284].setRotationPoint(-68F, -35F, -29F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, -2F, 2F); // Box 527
		bodyModel[285].setRotationPoint(25F, -19F, -34F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -3F, -7F, 0F, -4F, 6F, 0F, -3F, 3F); // Box 528
		bodyModel[286].setRotationPoint(25F, -11F, -32F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -1F, 0F, 1F, 0F); // Box 529
		bodyModel[287].setRotationPoint(25F, -7F, -28F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 8F, 0F, 0F, 2F, 0F, -2F, -5F, 0F, -2F, -15F, 0F, -2F, 15F, 0F, -2F, 5F); // Box 530
		bodyModel[288].setRotationPoint(35F, -19F, -34F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, -3F, 0F, 0F, -13F, 0F, 0F, 13F, 0F, 0F, 3F, 0F, -3F, -7F, 0F, -5F, -16F, 0F, -6F, 15F, 0F, -4F, 6F); // Box 531
		bodyModel[289].setRotationPoint(35F, -11F, -32F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 0F); // Box 532
		bodyModel[290].setRotationPoint(25F, -30F, -34F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, -2F, -5F); // Box 533
		bodyModel[291].setRotationPoint(25F, -35F, -29F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -5F, 0F, -2F, 6F, 0F, -2F, 0F); // Box 534
		bodyModel[292].setRotationPoint(35F, -30F, -32F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, -2F, -3F); // Box 535
		bodyModel[293].setRotationPoint(35F, -35F, -29F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[294].setRotationPoint(15F, -6F, -24F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[295].setRotationPoint(25F, -6F, -24F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[296].setRotationPoint(25F, -6F, -16F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 2F, 1F, 0F, 4F, -8F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -4F, -8F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 539
		bodyModel[297].setRotationPoint(35F, -6F, -24F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[298].setRotationPoint(35F, -6F, -16F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, -1F); // Box 541
		bodyModel[299].setRotationPoint(45F, -35F, -29F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -2F, -5F, 0F, -2F, -9F, 0F, -2F, 8F, 0F, -2F, 6F); // Box 542
		bodyModel[300].setRotationPoint(45F, -30F, -32F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, -7F, 0F, 0F, -11F, 0F, 0F, 10F, 0F, 0F, 8F, 0F, -2F, -15F, 0F, -3F, -19F, 0F, -3F, 18F, 0F, -2F, 15F); // Box 543
		bodyModel[301].setRotationPoint(45F, -19F, -34F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, -13F, 0F, 1F, -17F, 0F, 1F, 16F, 0F, 0F, 13F, 0F, -5F, -16F, 0F, -6F, -19F, 0F, -6F, 18F, 0F, -6F, 15F); // Box 544
		bodyModel[302].setRotationPoint(45F, -11F, -32F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 21, 0F,0F, 4F, 0F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[303].setRotationPoint(45F, -6F, -16F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 932
		bodyModel[304].setRotationPoint(-182F, -56.5F, 16F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -3.375F, -0.4F, 0F, 3.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4.25F, -0.65F, 0F, 3.975F, 0F, 0F, 0F); // Box 934
		bodyModel[305].setRotationPoint(-177F, -56.5F, 20F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.625F, 0F, 1F, -1F, 1.1F, -0.5F, -3.5F, -1.3F, -0.5F, -3.9F, -1.3F, -0.5F, 3.85F, 1.2F, -0.5F, 3.4F); // Box 935
		bodyModel[306].setRotationPoint(-173F, -60F, 17.4F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.175F, 0F, 1F, -1.2F, 0F, 1F, -1.575F, 1.65F, -0.5F, -1.95F, -2F, -0.5F, -2.4F, -2.4F, -0.5F, 2.15F, 2.15F, -0.5F, 1.6F); // Box 936
		bodyModel[307].setRotationPoint(-177F, -60F, 16.4F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 1.7F, 0F, -3.3F, -1.7F, -0.1F, -3.9F, -1.7F, -0.5F, 3.8F, 1.7F, -0.4F, 3.4F); // Box 937
		bodyModel[308].setRotationPoint(-174.3F, -55.5F, 21.45F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.3F, 0F, -0.2F, 0F, 0F, -0.7F, -0.2F, 0F, 0.4F, 0F, 0F, -0.25F, 3.3F, 0.3F, -3.5F, -3F, 0.3F, -4.1F, -3.2F, 0.1F, 4F, 3.3F, 0.1F, 3.5F); // Box 938
		bodyModel[309].setRotationPoint(-179.3F, -55.5F, 18.45F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -1.4F, -0.2F, 1F, 0.4F, 0F, 1F, -0.55F, 4.5F, 0.3F, -3.8F, -4.8F, 0.5F, -4.4F, -5.1F, 0.5F, 4.4F, 4.9F, 0.2F, 3.3F); // Box 939
		bodyModel[310].setRotationPoint(-182.85F, -55.5F, 15.6F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.8F, 1.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 4.1F, 0F, -2F, -4.2F, 0F, -1.7F, -4F, 0F, 2F, 4F, 0F, 2F); // Box 940
		bodyModel[311].setRotationPoint(-188F, -55F, 10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.9F); // Box 941
		bodyModel[312].setRotationPoint(-182F, -56.5F, -7F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.4F, 0F, 3.1F, 0F, 0F, -3.375F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.65F, 0F, 3.975F, 0F, 0F, -4.25F, 0F, 0F, 0F); // Box 942
		bodyModel[313].setRotationPoint(-177F, -56.5F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, -1F, 0F, 1F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -0.5F, 3.4F, -1.3F, -0.5F, 3.85F, -1.3F, -0.5F, -3.9F, 1.1F, -0.5F, -3.5F); // Box 943
		bodyModel[314].setRotationPoint(-173F, -60F, -8.4F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1F, -1.575F, 0F, 1F, -1.2F, 0F, 0F, 0.175F, 0F, 0F, 0.6F, 2.15F, -0.5F, 1.6F, -2.4F, -0.5F, 2.15F, -2F, -0.5F, -2.4F, 1.65F, -0.5F, -1.95F); // Box 944
		bodyModel[315].setRotationPoint(-177F, -60F, -7.4F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.7F, -0.4F, 3.4F, -1.7F, -0.5F, 3.8F, -1.7F, -0.1F, -3.9F, 1.7F, 0F, -3.3F); // Box 945
		bodyModel[316].setRotationPoint(-174.3F, -55.5F, -12.45F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.25F, -0.2F, 0F, 0.4F, 0F, 0F, -0.7F, -0.3F, 0F, -0.2F, 3.3F, 0.1F, 3.5F, -3.2F, 0.1F, 4F, -3F, 0.3F, -4.1F, 3.3F, 0.3F, -3.5F); // Box 946
		bodyModel[317].setRotationPoint(-179.3F, -55.5F, -9.45F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 1F, -0.55F, -0.2F, 1F, 0.4F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 4.9F, 0.2F, 3.3F, -5.1F, 0.5F, 4.4F, -4.8F, 0.5F, -4.4F, 4.5F, 0.3F, -3.8F); // Box 947
		bodyModel[318].setRotationPoint(-182.85F, -55.5F, -6.6F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1F, 1F, 0F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.8F, 1.2F, 0F, 4F, 0F, 2F, -4F, 0F, 2F, -4.2F, 0F, -1.7F, 4.1F, 0F, -2F); // Box 948
		bodyModel[319].setRotationPoint(-188F, -55F, -1F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		bodyModel[320].setRotationPoint(-144F, -18F, -8F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 16, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 972
		bodyModel[321].setRotationPoint(-144F, -13F, -12F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 973
		bodyModel[322].setRotationPoint(-144F, -23F, -4F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		bodyModel[323].setRotationPoint(-144F, -16F, -8F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 13, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		bodyModel[324].setRotationPoint(-145F, -23F, -5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		bodyModel[325].setRotationPoint(-145F, -23F, -12F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		bodyModel[326].setRotationPoint(-145F, -23F, -17F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 978
		bodyModel[327].setRotationPoint(-145F, -23F, -21F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 979
		bodyModel[328].setRotationPoint(-144F, -21F, -15F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 16, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		bodyModel[329].setRotationPoint(-144F, -25F, -20F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 36, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 981
		bodyModel[330].setRotationPoint(-164F, -41F, 22F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 982
		bodyModel[331].setRotationPoint(-170F, -41F, 27F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 25, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 983
		bodyModel[332].setRotationPoint(-153F, -54F, 29F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 11, 13, 2, 0F,0F, 4F, 4F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 984
		bodyModel[333].setRotationPoint(-164F, -54F, 28F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 13, 1, 0F,0F, 0F, 2F, 0F, 3F, 5F, 0F, 0F, -1F, 0F, 0F, -3F, 1F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 985
		bodyModel[334].setRotationPoint(-167F, -54F, 29F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 25, 4, 1, 0F,0F, 0F, 4F, 0F, 2F, 4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 986
		bodyModel[335].setRotationPoint(-153F, -58F, 29F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 987
		bodyModel[336].setRotationPoint(-152.5F, -54F, 28F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 988
		bodyModel[337].setRotationPoint(-147.25F, -54F, 28F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 989
		bodyModel[338].setRotationPoint(-142F, -54F, 28F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		bodyModel[339].setRotationPoint(-146.25F, -48.75F, 28F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 991
		bodyModel[340].setRotationPoint(-152F, -48.75F, 28F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 7, 5, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 992
		bodyModel[341].setRotationPoint(-161F, -48.75F, 23.85F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, 2F, 0F, 0F, 0.5F); // Box 993
		bodyModel[342].setRotationPoint(-159F, -54.75F, 23.85F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 994
		bodyModel[343].setRotationPoint(-145F, -29F, 9F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 12, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 995
		bodyModel[344].setRotationPoint(-145F, -32F, 8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 12, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 996
		bodyModel[345].setRotationPoint(-145F, -38F, 7F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 997
		bodyModel[346].setRotationPoint(-145F, -46F, 6F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 998
		bodyModel[347].setRotationPoint(-146F, -38F, 7F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 999
		bodyModel[348].setRotationPoint(-133F, -38F, 7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1000
		bodyModel[349].setRotationPoint(-164F, -34F, -1F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1001
		bodyModel[350].setRotationPoint(-164F, -37F, -2F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1002
		bodyModel[351].setRotationPoint(-151F, -43F, -2F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 1003
		bodyModel[352].setRotationPoint(-158F, -43F, -3F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1004
		bodyModel[353].setRotationPoint(-150F, -51F, -2F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.5F, 0F); // Box 1005
		bodyModel[354].setRotationPoint(-158F, -43F, 10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1006
		bodyModel[355].setRotationPoint(-168F, -51F, -9F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		bodyModel[356].setRotationPoint(-182F, -34F, -8F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		bodyModel[357].setRotationPoint(-182F, -37F, -9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1009
		bodyModel[358].setRotationPoint(-169F, -43F, -9F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 1010
		bodyModel[359].setRotationPoint(-176F, -43F, -10F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.5F, 0F); // Box 1011
		bodyModel[360].setRotationPoint(-176F, -43F, 3F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1012
		bodyModel[361].setRotationPoint(-168F, -51F, 8F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1013
		bodyModel[362].setRotationPoint(-182F, -34F, 9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 14, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1014
		bodyModel[363].setRotationPoint(-182F, -37F, 8F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 1015
		bodyModel[364].setRotationPoint(-169F, -43F, 8F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F); // Box 1016
		bodyModel[365].setRotationPoint(-176F, -43F, 7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.375F, 0F, 0F, 0F, -0.5F, 0F); // Box 1017
		bodyModel[366].setRotationPoint(-176F, -43F, 20F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 16, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		bodyModel[367].setRotationPoint(-166F, -30F, -4F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 21, 5, 39, 0F,0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 6F, 0F, 0F, -1F); // Box 1019
		bodyModel[368].setRotationPoint(-187F, -30F, -15F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 9, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 1020
		bodyModel[369].setRotationPoint(-196F, -30F, -10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 9, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 1021
		bodyModel[370].setRotationPoint(-205F, -30F, -5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 8, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 1022
		bodyModel[371].setRotationPoint(-207F, -30F, -4F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 8F, 0F, 0F, 0F); // Box 1023
		bodyModel[372].setRotationPoint(-192F, -50F, 5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		bodyModel[373].setRotationPoint(-187F, -44F, -3F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 8F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 1025
		bodyModel[374].setRotationPoint(-192F, -50F, -3F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 9, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		bodyModel[375].setRotationPoint(-137F, -25F, 14F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1029
		bodyModel[376].setRotationPoint(-185F, -44.5F, -3.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		bodyModel[377].setRotationPoint(-186F, -44F, -3F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		bodyModel[378].setRotationPoint(-185F, -42.5F, -3F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, 2F, 0F, -0.5F, 2F); // Box 1032
		bodyModel[379].setRotationPoint(-185F, -43F, -6F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1033
		bodyModel[380].setRotationPoint(-185F, -45F, -6F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1034
		bodyModel[381].setRotationPoint(-185F, -45F, 0F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.5F, -3F, 0F, 0.5F, -3F); // Box 1035
		bodyModel[382].setRotationPoint(-185F, -43F, 0F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1036
		bodyModel[383].setRotationPoint(-185F, -45F, 11F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1037
		bodyModel[384].setRotationPoint(-187F, -44F, 14F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		bodyModel[385].setRotationPoint(-185F, -42.5F, 14F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		bodyModel[386].setRotationPoint(-185F, -44.5F, 13.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, -0.5F, 2F, 0F, -0.5F, 2F); // Box 1040
		bodyModel[387].setRotationPoint(-185F, -43F, 11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.5F, -3F, 0F, 0.5F, -3F); // Box 1041
		bodyModel[388].setRotationPoint(-185F, -43F, 17F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		bodyModel[389].setRotationPoint(-185F, -45F, 17F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 18, 9, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		bodyModel[390].setRotationPoint(-201F, -37F, 2F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 7F, 0F, 0F); // Box 1044
		bodyModel[391].setRotationPoint(-190F, -43F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F,11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1045
		bodyModel[392].setRotationPoint(-190F, -43F, 5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1046
		bodyModel[393].setRotationPoint(-186F, -44F, 14F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 25, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 1
		bodyModel[394].setRotationPoint(28F, -27F, 26F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 25, 19, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[395].setRotationPoint(28F, -46F, 26F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 3
		bodyModel[396].setRotationPoint(49F, -44F, 25F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 9
		bodyModel[397].setRotationPoint(45F, -44F, 25F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 10
		bodyModel[398].setRotationPoint(41F, -44F, 25F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[399].setRotationPoint(37F, -44F, 25F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 12
		bodyModel[400].setRotationPoint(33F, -44F, 25F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[401].setRotationPoint(29F, -44F, 25F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 14
		bodyModel[402].setRotationPoint(48F, -42F, 25F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 16
		bodyModel[403].setRotationPoint(44F, -42F, 25F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 17
		bodyModel[404].setRotationPoint(40F, -42F, 25F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 18
		bodyModel[405].setRotationPoint(36F, -42F, 25F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 19
		bodyModel[406].setRotationPoint(32F, -42F, 25F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 20
		bodyModel[407].setRotationPoint(31F, -40F, 25F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 21
		bodyModel[408].setRotationPoint(35F, -40F, 25F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 22
		bodyModel[409].setRotationPoint(39F, -40F, 25F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 23
		bodyModel[410].setRotationPoint(43F, -40F, 25F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 24
		bodyModel[411].setRotationPoint(47F, -40F, 25F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 25
		bodyModel[412].setRotationPoint(34F, -38F, 25F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 26
		bodyModel[413].setRotationPoint(38F, -38F, 25F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 27
		bodyModel[414].setRotationPoint(42F, -38F, 25F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 28
		bodyModel[415].setRotationPoint(46F, -38F, 25F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 30
		bodyModel[416].setRotationPoint(29F, -38F, 25F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 32
		bodyModel[417].setRotationPoint(46F, -30F, 25F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 33
		bodyModel[418].setRotationPoint(42F, -30F, 25F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		bodyModel[419].setRotationPoint(38F, -30F, 25F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 35
		bodyModel[420].setRotationPoint(34F, -30F, 25F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 36
		bodyModel[421].setRotationPoint(29F, -30F, 25F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 37
		bodyModel[422].setRotationPoint(31F, -32F, 25F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 38
		bodyModel[423].setRotationPoint(32F, -34F, 25F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 39
		bodyModel[424].setRotationPoint(33F, -36F, 25F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 40
		bodyModel[425].setRotationPoint(29F, -36F, 25F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 41
		bodyModel[426].setRotationPoint(36F, -34F, 25F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 42
		bodyModel[427].setRotationPoint(37F, -36F, 25F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 43
		bodyModel[428].setRotationPoint(41F, -36F, 25F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[429].setRotationPoint(40F, -34F, 25F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 45
		bodyModel[430].setRotationPoint(43F, -32F, 25F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 46
		bodyModel[431].setRotationPoint(44F, -34F, 25F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 47
		bodyModel[432].setRotationPoint(45F, -36F, 25F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 48
		bodyModel[433].setRotationPoint(48F, -34F, 25F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		bodyModel[434].setRotationPoint(49F, -36F, 25F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 50
		bodyModel[435].setRotationPoint(47F, -32F, 25F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 51
		bodyModel[436].setRotationPoint(39F, -32F, 25F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 52
		bodyModel[437].setRotationPoint(35F, -32F, 25F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 56, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[438].setRotationPoint(-5F, -65F, -12F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 3, 50, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[439].setRotationPoint(-5F, -62F, -19F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 3, 41, 5, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[440].setRotationPoint(-5F, -57F, -24F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 27, 2, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[441].setRotationPoint(-5F, -50F, -26F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 3, 56, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[442].setRotationPoint(-5F, -65F, 14F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 50, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 58
		bodyModel[443].setRotationPoint(-5F, -62F, 22F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 59
		bodyModel[444].setRotationPoint(-5F, -57F, 29F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 60
		bodyModel[445].setRotationPoint(-5F, -50F, 34F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 20, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[446].setRotationPoint(-5F, -66F, -4F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 20, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[447].setRotationPoint(-5F, -66F, 5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 11, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 63
		bodyModel[448].setRotationPoint(16F, -27F, 26F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 11, 19, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[449].setRotationPoint(16F, -46F, 26F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 65
		bodyModel[450].setRotationPoint(17F, -38F, 25F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 66
		bodyModel[451].setRotationPoint(22F, -38F, 25F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 67
		bodyModel[452].setRotationPoint(17F, -36.5F, 25F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 68
		bodyModel[453].setRotationPoint(22F, -36.5F, 25F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 69
		bodyModel[454].setRotationPoint(17F, -39.5F, 25F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 70
		bodyModel[455].setRotationPoint(22F, -39.5F, 25F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 71
		bodyModel[456].setRotationPoint(17F, -41.5F, 25F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 72
		bodyModel[457].setRotationPoint(22F, -41.5F, 25F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 73
		bodyModel[458].setRotationPoint(17F, -43.5F, 25F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 74
		bodyModel[459].setRotationPoint(22F, -43.5F, 25F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 75
		bodyModel[460].setRotationPoint(17F, -34.5F, 25F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 76
		bodyModel[461].setRotationPoint(22F, -34.5F, 25F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 77
		bodyModel[462].setRotationPoint(17F, -32.5F, 25F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 78
		bodyModel[463].setRotationPoint(22F, -32.5F, 25F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 79
		bodyModel[464].setRotationPoint(17F, -30.5F, 25F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 80
		bodyModel[465].setRotationPoint(22F, -30.5F, 25F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 81
		bodyModel[466].setRotationPoint(17F, -28.5F, 25F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 82
		bodyModel[467].setRotationPoint(22F, -28.5F, 25F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[468].setRotationPoint(-26F, -28F, -26F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[469].setRotationPoint(-41F, -28F, -26F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[470].setRotationPoint(-56F, -28F, -26F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[471].setRotationPoint(-71F, -28F, -26F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 61, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[472].setRotationPoint(-71F, -29F, -26F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[473].setRotationPoint(-69F, -21F, -14F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 12, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[474].setRotationPoint(-69F, -24F, -15F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.375F); // Box 98
		bodyModel[475].setRotationPoint(-70F, -30F, -9F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[476].setRotationPoint(-69F, -36F, -22F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,-4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[477].setRotationPoint(-69F, -38F, -1F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.25F); // Box 101
		bodyModel[478].setRotationPoint(-57F, -30F, -9F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[479].setRotationPoint(-54F, -21F, -14F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 12, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[480].setRotationPoint(-54F, -24F, -15F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 12, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 104
		bodyModel[481].setRotationPoint(-54F, -30F, -2F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.375F); // Box 105
		bodyModel[482].setRotationPoint(-55F, -30F, -9F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,-4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 106
		bodyModel[483].setRotationPoint(-54F, -38F, -1F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.25F); // Box 107
		bodyModel[484].setRotationPoint(-42F, -30F, -9F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 12, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[485].setRotationPoint(-24F, -24F, -15F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[486].setRotationPoint(-24F, -21F, -14F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 12, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 110
		bodyModel[487].setRotationPoint(-24F, -30F, -2F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.25F); // Box 111
		bodyModel[488].setRotationPoint(-12F, -30F, -9F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,-4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 112
		bodyModel[489].setRotationPoint(-24F, -38F, -1F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.375F); // Box 113
		bodyModel[490].setRotationPoint(-25F, -30F, -9F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.25F); // Box 114
		bodyModel[491].setRotationPoint(-27F, -30F, -9F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F,-4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 115
		bodyModel[492].setRotationPoint(-39F, -38F, -1F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 12, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 116
		bodyModel[493].setRotationPoint(-39F, -30F, -2F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.375F); // Box 117
		bodyModel[494].setRotationPoint(-40F, -30F, -9F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 12, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[495].setRotationPoint(-39F, -24F, -15F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[496].setRotationPoint(-39F, -21F, -14F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[497].setRotationPoint(-11F, -28F, -26F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 12, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 121
		bodyModel[498].setRotationPoint(-69F, -30F, -2F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[499].setRotationPoint(-65F, -30F, -22F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 1393, 153, textureX, textureY); // Box 124
		bodyModel[501] = new ModelRendererTurbo(this, 3641, 25, textureX, textureY); // Box 125
		bodyModel[502] = new ModelRendererTurbo(this, 1417, 153, textureX, textureY); // Box 126
		bodyModel[503] = new ModelRendererTurbo(this, 3721, 25, textureX, textureY); // Box 127
		bodyModel[504] = new ModelRendererTurbo(this, 1585, 161, textureX, textureY); // Box 128
		bodyModel[505] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 129
		bodyModel[506] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 132
		bodyModel[507] = new ModelRendererTurbo(this, 1617, 257, textureX, textureY); // Box 133
		bodyModel[508] = new ModelRendererTurbo(this, 1641, 257, textureX, textureY); // Box 134
		bodyModel[509] = new ModelRendererTurbo(this, 3521, 257, textureX, textureY); // Box 135
		bodyModel[510] = new ModelRendererTurbo(this, 1129, 257, textureX, textureY); // Box 136
		bodyModel[511] = new ModelRendererTurbo(this, 3185, 257, textureX, textureY); // Box 137
		bodyModel[512] = new ModelRendererTurbo(this, 817, 265, textureX, textureY); // Box 138
		bodyModel[513] = new ModelRendererTurbo(this, 1057, 265, textureX, textureY); // Box 139
		bodyModel[514] = new ModelRendererTurbo(this, 3561, 257, textureX, textureY); // Box 140
		bodyModel[515] = new ModelRendererTurbo(this, 1081, 265, textureX, textureY); // Box 141
		bodyModel[516] = new ModelRendererTurbo(this, 2017, 161, textureX, textureY); // Box 142
		bodyModel[517] = new ModelRendererTurbo(this, 2185, 161, textureX, textureY); // Box 143
		bodyModel[518] = new ModelRendererTurbo(this, 2265, 41, textureX, textureY); // Box 144
		bodyModel[519] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 145
		bodyModel[520] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 146
		bodyModel[521] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 147
		bodyModel[522] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 148
		bodyModel[523] = new ModelRendererTurbo(this, 3225, 65, textureX, textureY); // Box 149
		bodyModel[524] = new ModelRendererTurbo(this, 2065, 185, textureX, textureY); // Box 150
		bodyModel[525] = new ModelRendererTurbo(this, 2633, 225, textureX, textureY); // Box 0
		bodyModel[526] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 1049
		bodyModel[527] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1050
		bodyModel[528] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1051
		bodyModel[529] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1052
		bodyModel[530] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 1053
		bodyModel[531] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1054
		bodyModel[532] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 1055
		bodyModel[533] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1056
		bodyModel[534] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1057
		bodyModel[535] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1059
		bodyModel[536] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1060
		bodyModel[537] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1061
		bodyModel[538] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1062
		bodyModel[539] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1063
		bodyModel[540] = new ModelRendererTurbo(this, 1270, 328, textureX, textureY); // Box 1066
		bodyModel[541] = new ModelRendererTurbo(this, 513, 177, textureX, textureY); // Box 1071
		bodyModel[542] = new ModelRendererTurbo(this, 2569, 153, textureX, textureY); // Box 1072
		bodyModel[543] = new ModelRendererTurbo(this, 501, 301, textureX, textureY); // Box 1072
		bodyModel[544] = new ModelRendererTurbo(this, 501, 301, textureX, textureY); // Box 1074
		bodyModel[545] = new ModelRendererTurbo(this, 501, 301, textureX, textureY); // Box 1075
		bodyModel[546] = new ModelRendererTurbo(this, 501, 301, textureX, textureY); // Box 1076

		bodyModel[500].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[500].setRotationPoint(-53F, -36F, -22F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[501].setRotationPoint(-49F, -30F, -22F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[502].setRotationPoint(-37F, -36F, -22F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[503].setRotationPoint(-33F, -30F, -22F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[504].setRotationPoint(-23F, -36F, -22F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[505].setRotationPoint(-19F, -30F, -22F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 3, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 132
		bodyModel[506].setRotationPoint(-78F, -50F, 34F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 3, 41, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 133
		bodyModel[507].setRotationPoint(-78F, -57F, 29F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 50, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 134
		bodyModel[508].setRotationPoint(-78F, -62F, 22F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 3, 56, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[509].setRotationPoint(-78F, -65F, 14F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 3, 20, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[510].setRotationPoint(-78F, -66F, 5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 3, 20, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[511].setRotationPoint(-78F, -66F, -4F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 3, 56, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[512].setRotationPoint(-78F, -65F, -12F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 3, 50, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[513].setRotationPoint(-78F, -62F, -19F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 3, 41, 5, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[514].setRotationPoint(-78F, -57F, -24F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 3, 27, 2, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[515].setRotationPoint(-78F, -50F, -26F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[516].setRotationPoint(59F, -29F, -21F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[517].setRotationPoint(53F, -29F, -21F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[518].setRotationPoint(53F, -29F, -21F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[519].setRotationPoint(53F, -29F, -17F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 146
		bodyModel[520].setRotationPoint(53F, -29F, -17F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 147
		bodyModel[521].setRotationPoint(53F, -21F, -17F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[522].setRotationPoint(53F, -21F, -17F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[523].setRotationPoint(53F, -21F, -21F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 7, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 150
		bodyModel[524].setRotationPoint(53F, -20F, -21F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 24, 3, 5, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 0
		bodyModel[525].setRotationPoint(-111F, -20F, -19F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1049
		bodyModel[526].setRotationPoint(-103F, -34F, -29F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 3, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1050
		bodyModel[527].setRotationPoint(-103F, -44F, -28F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 115, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1051
		bodyModel[528].setRotationPoint(-90F, -34F, -29F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 116, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1052
		bodyModel[529].setRotationPoint(-90F, -44F, -28F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1053
		bodyModel[530].setRotationPoint(35F, -34F, -29F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 22, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1054
		bodyModel[531].setRotationPoint(26F, -44F, -28F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1055
		bodyModel[532].setRotationPoint(67F, -34F, -29F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 4, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1056
		bodyModel[533].setRotationPoint(67F, -44F, -28F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 19, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1057
		bodyModel[534].setRotationPoint(48F, -44F, -28F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1059
		bodyModel[535].setRotationPoint(-100F, -44F, -28F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 10, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1060
		bodyModel[536].setRotationPoint(-113F, -44F, -28F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1061
		bodyModel[537].setRotationPoint(-113F, -31F, -28F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1062
		bodyModel[538].setRotationPoint(-100F, -31F, -28F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1063
		bodyModel[539].setRotationPoint(48F, -31F, -28F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1066
		bodyModel[540].setRotationPoint(25F, -34F, -29F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1071
		bodyModel[541].setRotationPoint(56F, -34F, -29F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 3, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 1072
		bodyModel[542].setRotationPoint(56F, -44F, -28F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1072
		bodyModel[543].setRotationPoint(-113F, -34F, -29F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1074
		bodyModel[544].setRotationPoint(-100F, -34F, -29F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1075
		bodyModel[545].setRotationPoint(48F, -34F, -29F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1076
		bodyModel[546].setRotationPoint(59F, -34F, -29F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 9
		tailModel[1] = new ModelRendererTurbo(this, 2321, 1, textureX, textureY); // Box 7
		tailModel[2] = new ModelRendererTurbo(this, 2577, 1, textureX, textureY); // Box 7
		tailModel[3] = new ModelRendererTurbo(this, 1465, 9, textureX, textureY); // Box 5
		tailModel[4] = new ModelRendererTurbo(this, 2329, 17, textureX, textureY); // Box 4
		tailModel[5] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 3
		tailModel[6] = new ModelRendererTurbo(this, 1465, 25, textureX, textureY); // Box 3
		tailModel[7] = new ModelRendererTurbo(this, 1985, 33, textureX, textureY); // Box 2
		tailModel[8] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 2
		tailModel[9] = new ModelRendererTurbo(this, 1105, 33, textureX, textureY); // Box 157
		tailModel[10] = new ModelRendererTurbo(this, 1337, 33, textureX, textureY); // Box 156
		tailModel[11] = new ModelRendererTurbo(this, 1385, 33, textureX, textureY); // Box 155
		tailModel[12] = new ModelRendererTurbo(this, 2313, 33, textureX, textureY); // Box 154
		tailModel[13] = new ModelRendererTurbo(this, 2265, 33, textureX, textureY); // Box 153
		tailModel[14] = new ModelRendererTurbo(this, 2417, 33, textureX, textureY); // Box 152
		tailModel[15] = new ModelRendererTurbo(this, 2505, 33, textureX, textureY); // Box 151
		tailModel[16] = new ModelRendererTurbo(this, 3041, 33, textureX, textureY); // Box 150
		tailModel[17] = new ModelRendererTurbo(this, 3225, 33, textureX, textureY); // Box 15
		tailModel[18] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 149
		tailModel[19] = new ModelRendererTurbo(this, 3329, 33, textureX, textureY); // Box 148
		tailModel[20] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 147
		tailModel[21] = new ModelRendererTurbo(this, 1841, 33, textureX, textureY); // Box 146
		tailModel[22] = new ModelRendererTurbo(this, 3377, 33, textureX, textureY); // Box 145
		tailModel[23] = new ModelRendererTurbo(this, 4089, 17, textureX, textureY); // Box 144
		tailModel[24] = new ModelRendererTurbo(this, 2177, 33, textureX, textureY); // Box 143
		tailModel[25] = new ModelRendererTurbo(this, 3417, 33, textureX, textureY); // Box 142
		tailModel[26] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 141
		tailModel[27] = new ModelRendererTurbo(this, 3465, 33, textureX, textureY); // Box 140
		tailModel[28] = new ModelRendererTurbo(this, 1513, 41, textureX, textureY); // Box 14
		tailModel[29] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 139
		tailModel[30] = new ModelRendererTurbo(this, 1665, 41, textureX, textureY); // Box 138
		tailModel[31] = new ModelRendererTurbo(this, 1737, 41, textureX, textureY); // Box 137
		tailModel[32] = new ModelRendererTurbo(this, 1865, 41, textureX, textureY); // Box 136
		tailModel[33] = new ModelRendererTurbo(this, 1985, 41, textureX, textureY); // Box 135
		tailModel[34] = new ModelRendererTurbo(this, 2857, 57, textureX, textureY); // Box 134
		tailModel[35] = new ModelRendererTurbo(this, 3881, 41, textureX, textureY); // Box 133
		tailModel[36] = new ModelRendererTurbo(this, 2097, 41, textureX, textureY); // Box 130
		tailModel[37] = new ModelRendererTurbo(this, 2497, 49, textureX, textureY); // Box 13
		tailModel[38] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 129
		tailModel[39] = new ModelRendererTurbo(this, 3985, 1, textureX, textureY); // Box 128
		tailModel[40] = new ModelRendererTurbo(this, 2137, 41, textureX, textureY); // Box 127
		tailModel[41] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 126
		tailModel[42] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 125
		tailModel[43] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 124
		tailModel[44] = new ModelRendererTurbo(this, 4009, 17, textureX, textureY); // Box 123
		tailModel[45] = new ModelRendererTurbo(this, 3721, 25, textureX, textureY); // Box 122
		tailModel[46] = new ModelRendererTurbo(this, 2697, 25, textureX, textureY); // Box 12
		tailModel[47] = new ModelRendererTurbo(this, 2489, 33, textureX, textureY); // Box 115
		tailModel[48] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 113
		tailModel[49] = new ModelRendererTurbo(this, 2849, 73, textureX, textureY); // Box 100
		tailModel[50] = new ModelRendererTurbo(this, 2841, 81, textureX, textureY); // Box 1
		tailModel[51] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 1
		tailModel[52] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 0
		tailModel[53] = new ModelRendererTurbo(this, 1601, 65, textureX, textureY); // Box 375
		tailModel[54] = new ModelRendererTurbo(this, 3089, 65, textureX, textureY); // Box 376
		tailModel[55] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 497
		tailModel[56] = new ModelRendererTurbo(this, 3065, 129, textureX, textureY); // Box 868
		tailModel[57] = new ModelRendererTurbo(this, 1985, 217, textureX, textureY); // Box 869
		tailModel[58] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 870
		tailModel[59] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 871
		tailModel[60] = new ModelRendererTurbo(this, 2713, 225, textureX, textureY); // Box 872
		tailModel[61] = new ModelRendererTurbo(this, 809, 137, textureX, textureY); // Box 873
		tailModel[62] = new ModelRendererTurbo(this, 1985, 233, textureX, textureY); // Box 874
		tailModel[63] = new ModelRendererTurbo(this, 3001, 145, textureX, textureY); // Box 875
		tailModel[64] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); // Box 876
		tailModel[65] = new ModelRendererTurbo(this, 1609, 201, textureX, textureY); // Box 877
		tailModel[66] = new ModelRendererTurbo(this, 1793, 201, textureX, textureY); // Box 878
		tailModel[67] = new ModelRendererTurbo(this, 2009, 201, textureX, textureY); // Box 879
		tailModel[68] = new ModelRendererTurbo(this, 2473, 201, textureX, textureY); // Box 880
		tailModel[69] = new ModelRendererTurbo(this, 2961, 217, textureX, textureY); // Box 881
		tailModel[70] = new ModelRendererTurbo(this, 1017, 209, textureX, textureY); // Box 882
		tailModel[71] = new ModelRendererTurbo(this, 3225, 209, textureX, textureY); // Box 883
		tailModel[72] = new ModelRendererTurbo(this, 2225, 241, textureX, textureY); // Box 884
		tailModel[73] = new ModelRendererTurbo(this, 3697, 209, textureX, textureY); // Box 885
		tailModel[74] = new ModelRendererTurbo(this, 3801, 225, textureX, textureY); // Box 886
		tailModel[75] = new ModelRendererTurbo(this, 3801, 201, textureX, textureY); // Box 887
		tailModel[76] = new ModelRendererTurbo(this, 1665, 201, textureX, textureY); // Box 888
		tailModel[77] = new ModelRendererTurbo(this, 3361, 201, textureX, textureY); // Box 889
		tailModel[78] = new ModelRendererTurbo(this, 3385, 209, textureX, textureY); // Box 890
		tailModel[79] = new ModelRendererTurbo(this, 4089, 177, textureX, textureY); // Box 891
		tailModel[80] = new ModelRendererTurbo(this, 3849, 201, textureX, textureY); // Box 892
		tailModel[81] = new ModelRendererTurbo(this, 713, 217, textureX, textureY); // Box 893
		tailModel[82] = new ModelRendererTurbo(this, 4041, 209, textureX, textureY); // Box 894
		tailModel[83] = new ModelRendererTurbo(this, 793, 209, textureX, textureY); // Box 895
		tailModel[84] = new ModelRendererTurbo(this, 3425, 217, textureX, textureY); // Box 896
		tailModel[85] = new ModelRendererTurbo(this, 3865, 201, textureX, textureY); // Box 897
		tailModel[86] = new ModelRendererTurbo(this, 3113, 217, textureX, textureY); // Box 898
		tailModel[87] = new ModelRendererTurbo(this, 881, 209, textureX, textureY); // Box 899
		tailModel[88] = new ModelRendererTurbo(this, 817, 217, textureX, textureY); // Box 900
		tailModel[89] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 901
		tailModel[90] = new ModelRendererTurbo(this, 1153, 225, textureX, textureY); // Box 902
		tailModel[91] = new ModelRendererTurbo(this, 1881, 201, textureX, textureY); // Box 904
		tailModel[92] = new ModelRendererTurbo(this, 3193, 145, textureX, textureY); // Box 905
		tailModel[93] = new ModelRendererTurbo(this, 1497, 217, textureX, textureY); // Box 906
		tailModel[94] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 907
		tailModel[95] = new ModelRendererTurbo(this, 1409, 217, textureX, textureY); // Box 908
		tailModel[96] = new ModelRendererTurbo(this, 1609, 217, textureX, textureY); // Box 909
		tailModel[97] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 910
		tailModel[98] = new ModelRendererTurbo(this, 3297, 209, textureX, textureY); // Box 911
		tailModel[99] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 912
		tailModel[100] = new ModelRendererTurbo(this, 993, 209, textureX, textureY); // Box 913
		tailModel[101] = new ModelRendererTurbo(this, 3273, 129, textureX, textureY); // Box 914
		tailModel[102] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 915
		tailModel[103] = new ModelRendererTurbo(this, 2409, 241, textureX, textureY); // Box 916
		tailModel[104] = new ModelRendererTurbo(this, 2569, 177, textureX, textureY); // Box 917
		tailModel[105] = new ModelRendererTurbo(this, 2585, 241, textureX, textureY); // Box 919
		tailModel[106] = new ModelRendererTurbo(this, 2209, 217, textureX, textureY); // Box 920
		tailModel[107] = new ModelRendererTurbo(this, 1313, 225, textureX, textureY); // Box 921
		tailModel[108] = new ModelRendererTurbo(this, 3185, 217, textureX, textureY); // Box 922
		tailModel[109] = new ModelRendererTurbo(this, 2761, 177, textureX, textureY); // Box 923

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

		tailModel[50].addShapeBox(0F, 0F, 0F, 88, 3, 5, 0F,0F, 1F, 0F, 0F, 31F, -1F, 0F, 33F, -3F, 0F, 7F, 0F, 0F, -1F, 0F, 0F, -32F, -1F, 0F, -34F, -2F, 0F, -7F, 0F); // Box 1
		tailModel[50].setRotationPoint(71F, -16F, 29F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 33, 3, 6, 0F,0F, 0F, 0F, 0F, -0.5F, 4F, 0F, -1F, -9F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, -9F, 0F, 1F, -3F); // Box 1
		tailModel[51].setRotationPoint(231F, -67F, 14F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 31, 2, 21, 0F,0F, -9F, 0F, 0F, -5F, 0F, 0F, -5F, -16F, 0F, -10F, -9F, 0F, 9F, 0F, 0F, 5F, 0F, 0F, 5F, -17F, 0F, 8F, -9F); // Box 0
		tailModel[52].setRotationPoint(233F, -70F, 5F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 7F, -8F, -1F, 0F, 0F, 0F); // Box 375
		tailModel[53].setRotationPoint(71F, -44F, 36F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 1, 14, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 376
		tailModel[54].setRotationPoint(179F, -66F, 5F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 14, 15, 2, 0F,0F, 0F, 0F, 6F, -1F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 7F, -8F, -2F, 0F, -3F, 0F, 0F, 2F, 0F); // Box 497
		tailModel[55].setRotationPoint(71F, -44F, -28F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 4F, 1F, 0F, 6.7F, -2.8F, 0F, 4.5F, 2.05F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -6.5F, -3.05F, 0F, -6.5F, 2.05F, 0F, 0F, -1F); // Box 868
		tailModel[56].setRotationPoint(159F, -49F, -22F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 104, 3, 5, 0F,0F, -7F, 0F, -16F, -7F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -16F, 7F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 869
		tailModel[57].setRotationPoint(71F, -60F, -24F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 58, 3, 5, 0F,15F, -7F, -1F, 1F, 3F, -15F, -1F, 5F, 12F, 0F, 0F, 0F, 15F, 7F, -1F, 1F, -6F, -16F, -1F, -6F, 12F, 0F, 0F, 0F); // Box 870
		tailModel[58].setRotationPoint(174F, -60F, -24F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 160, 3, 7, 0F,0F, -5F, 0F, -57F, -5F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 5F, 0F, -57F, 5F, 0F, 0F, -1F, 5F, 0F, 0F, 0F); // Box 871
		tailModel[59].setRotationPoint(71F, -65F, -19F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 160, 3, 8, 0F,0F, -3F, 0F, 0F, -3F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, -5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 872
		tailModel[60].setRotationPoint(71F, -68F, -12F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 33, 2, 1, 0F,0F, 0F, -1F, 0F, 1F, -7F, 0F, 1F, 6F, 0F, 0F, 0F, -2F, 0F, 1F, 0F, -2F, -7F, 0F, -2F, 6F, 0F, 0F, 0F); // Box 873
		tailModel[61].setRotationPoint(231F, -65F, -8F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 160, 3, 9, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 874
		tailModel[62].setRotationPoint(71F, -69F, -4F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 88, 3, 4, 0F,0F, 8F, 0F, 0F, 26F, -7F, 0F, 26F, 3F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -30F, -5F, 0F, -27F, 2F, 0F, 0F, 0F); // Box 875
		tailModel[63].setRotationPoint(71F, -23F, -28F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 31, 3, 1, 0F,0F, 0F, 0F, 0F, 2F, -8F, 0F, 2F, 8F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -9F, 0F, -3F, 9F, 0F, 0F, 1F); // Box 876
		tailModel[64].setRotationPoint(233F, -63F, -9F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 1F, 0F); // Box 877
		tailModel[65].setRotationPoint(213F, -67F, -120F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, -1F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F); // Box 878
		tailModel[66].setRotationPoint(213F, -68F, -120F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 12, 0, 8, 0F,-1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, -3F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 879
		tailModel[67].setRotationPoint(201F, -65F, -120F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, 1F, 0F); // Box 880
		tailModel[68].setRotationPoint(201F, -68F, -120F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 27, 4, 95, 0F,0F, 1F, 0F, -13F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -13F, -4F, -0.25F, 0F, -2.75F, 0F, 0F, -0.15F, 0F); // Box 881
		tailModel[69].setRotationPoint(213F, -67F, -112F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 27, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 882
		tailModel[70].setRotationPoint(213F, -66F, -17F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 27, 1, 13, 0F,0F, 0.1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 883
		tailModel[71].setRotationPoint(213F, -67F, -17F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 37, 2, 103, 0F,-22F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -25F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 884
		tailModel[72].setRotationPoint(176F, -65F, -112F);

		tailModel[73].addShapeBox(0F, 0F, 0F, 33, 3, 9, 0F,0F, -2F, 0F, 0F, -2.5F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 885
		tailModel[73].setRotationPoint(231F, -69F, -4F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 37, 1, 103, 0F,-25F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 4F, 0F, 0F, 0F, -22F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 886
		tailModel[74].setRotationPoint(176F, -66F, -112F);

		tailModel[75].addShapeBox(0F, 0F, 0F, 15, 107, 6, 0F,0F, -108F, 0F, 0F, -107F, -6F, 0F, -107F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 887
		tailModel[75].setRotationPoint(235F, -174F, -2F);

		tailModel[76].addShapeBox(0F, 0F, 0F, 1, 110, 6, 0F,0F, -111F, 0F, 0F, -111F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 888
		tailModel[76].setRotationPoint(234F, -177F, -2F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 5, 114, 6, 0F,0F, -115F, 0F, 0F, -115F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 889
		tailModel[77].setRotationPoint(229F, -181F, -2F);

		tailModel[78].addShapeBox(0F, 0F, 0F, 15, 108, 1, 0F,0F, -1F, 0F, 0F, -108F, 0F, 0F, -108F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 890
		tailModel[78].setRotationPoint(235F, -175F, 4F);

		tailModel[79].addShapeBox(0F, 0F, 0F, 1, 111, 1, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 891
		tailModel[79].setRotationPoint(234F, -178F, 4F);

		tailModel[80].addShapeBox(0F, 0F, 0F, 5, 115, 1, 0F,0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 892
		tailModel[80].setRotationPoint(229F, -182F, 4F);

		tailModel[81].addShapeBox(0F, 0F, 0F, 16, 114, 6, 0F,0F, -115F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 893
		tailModel[81].setRotationPoint(213F, -181F, -2F);

		tailModel[82].addShapeBox(0F, 0F, 0F, 16, 115, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 894
		tailModel[82].setRotationPoint(213F, -182F, 4F);

		tailModel[83].addShapeBox(0F, 0F, 0F, 5, 114, 6, 0F,0F, -115F, 0F, 0F, -115F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 895
		tailModel[83].setRotationPoint(208F, -181F, -2F);

		tailModel[84].addShapeBox(0F, 0F, 0F, 54, 2, 21, 0F,0F, 2F, 0F, 0F, 8F, -9F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, -9F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 896
		tailModel[84].setRotationPoint(179F, -52F, -16F);

		tailModel[85].addShapeBox(0F, 0F, 0F, 5, 115, 1, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 897
		tailModel[85].setRotationPoint(208F, -182F, 4F);

		tailModel[86].addShapeBox(0F, 0F, 0F, 27, 81, 6, 0F,0F, -82F, 0F, 0F, -82F, 0F, 0F, 31F, 0F, 0F, -19F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 898
		tailModel[86].setRotationPoint(181F, -148F, -2F);

		tailModel[87].addShapeBox(0F, 0F, 0F, 12, 59, 6, 0F,0F, -60F, 0F, 0F, -60F, 0F, 0F, 3F, 0F, 0F, -19F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 899
		tailModel[87].setRotationPoint(169F, -126F, -2F);

		tailModel[88].addShapeBox(0F, 0F, 0F, 12, 36, 6, 0F,0F, -37F, 0F, 0F, -37F, 0F, 0F, 3F, 0F, 0F, -19F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 900
		tailModel[88].setRotationPoint(157F, -104F, -2F);

		tailModel[89].addShapeBox(0F, 0F, 0F, 51, 113, 1, 0F,0F, -95F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -94F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 901
		tailModel[89].setRotationPoint(157F, -180F, 4F);

		tailModel[90].addShapeBox(0F, 0F, 0F, 88, 7, 1, 0F,0F, 0F, -1F, 0F, 8F, -6F, 0F, 8F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -12F, -6F, 0F, -13F, 6F, 0F, 0F, 0F); // Box 902
		tailModel[90].setRotationPoint(71F, -45F, -29F);

		tailModel[91].addShapeBox(0F, 0F, 0F, 11, 16, 5, 0F,0F, -17F, 0F, 0F, -17F, 1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 904
		tailModel[91].setRotationPoint(146F, -84F, -1F);

		tailModel[92].addShapeBox(0F, 0F, 0F, 54, 2, 3, 0F,0F, 1F, 0F, 0F, 9F, -10F, 0F, 9F, 8F, 0F, 0F, 0F, 0F, -1.5F, -0.1F, 0F, -9F, -11F, 0F, -8F, 9F, 0F, 0F, 0F); // Box 905
		tailModel[92].setRotationPoint(179F, -54F, -19F);

		tailModel[93].addShapeBox(0F, 0F, 0F, 16, 13, 5, 0F,0F, -14F, 0F, 0F, -14F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 906
		tailModel[93].setRotationPoint(130F, -81F, -1F);

		tailModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 907
		tailModel[94].setRotationPoint(66F, -69F, 4F);

		tailModel[95].addShapeBox(0F, 0F, 0F, 11, 11, 6, 0F,0F, -12F, 0F, 0F, -12F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 908
		tailModel[95].setRotationPoint(119F, -79F, -2F);

		tailModel[96].addShapeBox(0F, 0F, 0F, 11, 9, 6, 0F,0F, -10F, 0F, 0F, -10F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 909
		tailModel[96].setRotationPoint(108F, -77F, -2F);

		tailModel[97].addShapeBox(0F, 0F, 0F, 10, 7, 6, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 910
		tailModel[97].setRotationPoint(98F, -75F, -2F);

		tailModel[98].addShapeBox(0F, 0F, 0F, 10, 5, 6, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 911
		tailModel[98].setRotationPoint(88F, -73F, -2F);

		tailModel[99].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		tailModel[99].setRotationPoint(72F, -71F, -3F);

		tailModel[100].addShapeBox(0F, 0F, 0F, 10, 3, 7, 0F,0F, -4F, 0F, 0F, -4F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 913
		tailModel[100].setRotationPoint(78F, -71F, -3F);

		tailModel[101].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 2F, 0F, 0F, 8F, -2.35F, 0F, 8F, 1.4F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -8.45F, -2.05F, 0F, -8.45F, 1.05F, 0F, 0F, 0F); // Box 914
		tailModel[101].setRotationPoint(159F, -47F, -21F);

		tailModel[102].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,-3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 915
		tailModel[102].setRotationPoint(66F, -69F, -3F);

		tailModel[103].addShapeBox(0F, 0F, 0F, 85, 20, 1, 0F,0F, -17F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 916
		tailModel[103].setRotationPoint(72F, -86F, 4F);

		tailModel[104].addShapeBox(0F, 0F, 0F, 88, 3, 4, 0F,0F, -8F, 0F, -88F, -8F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 8F, 0F, -88F, 8F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 917
		tailModel[104].setRotationPoint(71F, -53F, -28F);

		tailModel[105].addShapeBox(0F, 0F, 0F, 88, 3, 5, 0F,0F, 7F, 0F, 0F, 33F, -3F, 0F, 31F, -1F, 0F, 1F, 0F, 0F, -7F, 0F, 0F, -34F, -2F, 0F, -32F, -1F, 0F, -1F, 0F); // Box 919
		tailModel[105].setRotationPoint(71F, -16F, -24F);

		tailModel[106].addShapeBox(0F, 0F, 0F, 33, 3, 6, 0F,0F, -2F, -3F, 0F, -1F, -9F, 0F, -0.5F, 4F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, -9F, 0F, -1F, 4F, 0F, 0F, 0F); // Box 920
		tailModel[106].setRotationPoint(231F, -67F, -10F);

		tailModel[107].addShapeBox(0F, 0F, 0F, 31, 2, 21, 0F,0F, -10F, -9F, 0F, -5F, -16F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, 8F, -9F, 0F, 5F, -17F, 0F, 5F, 0F, 0F, 9F, 0F); // Box 921
		tailModel[107].setRotationPoint(233F, -70F, -16F);

		tailModel[108].addShapeBox(0F, 0F, 0F, 1, 14, 24, 0F,0F, -4F, -5F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 922
		tailModel[108].setRotationPoint(179F, -66F, -19F);

		tailModel[109].addShapeBox(0F, 0F, 0F, 86, 6, 1, 0F,0F, 4F, 0F, 2F, 17F, -6F, 2F, 17F, 6F, 0F, 4F, 0F, 0F, -10F, 0F, 2F, -22F, -6F, 2F, -21F, 7F, 0F, 0F, 0F); // Box 923
		tailModel[109].setRotationPoint(71F, -34F, -29F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 419
		leftWingModel[1] = new ModelRendererTurbo(this, 1145, 33, textureX, textureY); // Box 421
		leftWingModel[2] = new ModelRendererTurbo(this, 2193, 97, textureX, textureY); // Box 432
		leftWingModel[3] = new ModelRendererTurbo(this, 4017, 97, textureX, textureY); // Box 433
		leftWingModel[4] = new ModelRendererTurbo(this, 3273, 97, textureX, textureY); // Box 434
		leftWingModel[5] = new ModelRendererTurbo(this, 1553, 113, textureX, textureY); // Box 446
		leftWingModel[6] = new ModelRendererTurbo(this, 1585, 113, textureX, textureY); // Box 447
		leftWingModel[7] = new ModelRendererTurbo(this, 1737, 113, textureX, textureY); // Box 448
		leftWingModel[8] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 549
		leftWingModel[9] = new ModelRendererTurbo(this, 1681, 145, textureX, textureY); // Box 550
		leftWingModel[10] = new ModelRendererTurbo(this, 1289, 145, textureX, textureY); // Box 551
		leftWingModel[11] = new ModelRendererTurbo(this, 929, 153, textureX, textureY); // Box 552
		leftWingModel[12] = new ModelRendererTurbo(this, 809, 153, textureX, textureY); // Box 553
		leftWingModel[13] = new ModelRendererTurbo(this, 969, 153, textureX, textureY); // Box 554
		leftWingModel[14] = new ModelRendererTurbo(this, 3913, 145, textureX, textureY); // Box 555
		leftWingModel[15] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 556
		leftWingModel[16] = new ModelRendererTurbo(this, 2305, 153, textureX, textureY); // Box 557
		leftWingModel[17] = new ModelRendererTurbo(this, 2441, 153, textureX, textureY); // Box 558
		leftWingModel[18] = new ModelRendererTurbo(this, 1969, 161, textureX, textureY); // Box 559
		leftWingModel[19] = new ModelRendererTurbo(this, 2321, 161, textureX, textureY); // Box 560
		leftWingModel[20] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Box 561
		leftWingModel[21] = new ModelRendererTurbo(this, 2017, 161, textureX, textureY); // Box 562
		leftWingModel[22] = new ModelRendererTurbo(this, 881, 153, textureX, textureY); // Box 563
		leftWingModel[23] = new ModelRendererTurbo(this, 2137, 161, textureX, textureY); // Box 564
		leftWingModel[24] = new ModelRendererTurbo(this, 1729, 153, textureX, textureY); // Box 565
		leftWingModel[25] = new ModelRendererTurbo(this, 2185, 161, textureX, textureY); // Box 566
		leftWingModel[26] = new ModelRendererTurbo(this, 2233, 161, textureX, textureY); // Box 567
		leftWingModel[27] = new ModelRendererTurbo(this, 3993, 161, textureX, textureY); // Box 568
		leftWingModel[28] = new ModelRendererTurbo(this, 1585, 169, textureX, textureY); // Box 569
		leftWingModel[29] = new ModelRendererTurbo(this, 3825, 169, textureX, textureY); // Box 570
		leftWingModel[30] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 571
		leftWingModel[31] = new ModelRendererTurbo(this, 1769, 153, textureX, textureY); // Box 572
		leftWingModel[32] = new ModelRendererTurbo(this, 1857, 153, textureX, textureY); // Box 573
		leftWingModel[33] = new ModelRendererTurbo(this, 1905, 153, textureX, textureY); // Box 574
		leftWingModel[34] = new ModelRendererTurbo(this, 3881, 169, textureX, textureY); // Box 575
		leftWingModel[35] = new ModelRendererTurbo(this, 1633, 169, textureX, textureY); // Box 576
		leftWingModel[36] = new ModelRendererTurbo(this, 993, 177, textureX, textureY); // Box 577
		leftWingModel[37] = new ModelRendererTurbo(this, 513, 185, textureX, textureY); // Box 578
		leftWingModel[38] = new ModelRendererTurbo(this, 553, 185, textureX, textureY); // Box 579
		leftWingModel[39] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 580
		leftWingModel[40] = new ModelRendererTurbo(this, 4049, 161, textureX, textureY); // Box 581
		leftWingModel[41] = new ModelRendererTurbo(this, 601, 185, textureX, textureY); // Box 582
		leftWingModel[42] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 583
		leftWingModel[43] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 584
		leftWingModel[44] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Box 585
		leftWingModel[45] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 586
		leftWingModel[46] = new ModelRendererTurbo(this, 1937, 153, textureX, textureY); // Box 587
		leftWingModel[47] = new ModelRendererTurbo(this, 777, 185, textureX, textureY); // Box 588
		leftWingModel[48] = new ModelRendererTurbo(this, 817, 185, textureX, textureY); // Box 589
		leftWingModel[49] = new ModelRendererTurbo(this, 1681, 185, textureX, textureY); // Box 590
		leftWingModel[50] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 591
		leftWingModel[51] = new ModelRendererTurbo(this, 3633, 17, textureX, textureY); // Box 592
		leftWingModel[52] = new ModelRendererTurbo(this, 3057, 1, textureX, textureY); // Box 593
		leftWingModel[53] = new ModelRendererTurbo(this, 3921, 1, textureX, textureY); // Box 594
		leftWingModel[54] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 595
		leftWingModel[55] = new ModelRendererTurbo(this, 1689, 185, textureX, textureY); // Box 596
		leftWingModel[56] = new ModelRendererTurbo(this, 1465, 9, textureX, textureY); // Box 597
		leftWingModel[57] = new ModelRendererTurbo(this, 3753, 9, textureX, textureY); // Box 598
		leftWingModel[58] = new ModelRendererTurbo(this, 1881, 17, textureX, textureY); // Box 599
		leftWingModel[59] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 600
		leftWingModel[60] = new ModelRendererTurbo(this, 1065, 161, textureX, textureY); // Box 601
		leftWingModel[61] = new ModelRendererTurbo(this, 1793, 185, textureX, textureY); // Box 602
		leftWingModel[62] = new ModelRendererTurbo(this, 2289, 185, textureX, textureY); // Box 603
		leftWingModel[63] = new ModelRendererTurbo(this, 3025, 185, textureX, textureY); // Box 604
		leftWingModel[64] = new ModelRendererTurbo(this, 2417, 161, textureX, textureY); // Box 605
		leftWingModel[65] = new ModelRendererTurbo(this, 1881, 185, textureX, textureY); // Box 606
		leftWingModel[66] = new ModelRendererTurbo(this, 2025, 185, textureX, textureY); // Box 607
		leftWingModel[67] = new ModelRendererTurbo(this, 1793, 185, textureX, textureY); // Box 608
		leftWingModel[68] = new ModelRendererTurbo(this, 2417, 185, textureX, textureY); // Box 609
		leftWingModel[69] = new ModelRendererTurbo(this, 3169, 185, textureX, textureY); // Box 610
		leftWingModel[70] = new ModelRendererTurbo(this, 1921, 185, textureX, textureY); // Box 611
		leftWingModel[71] = new ModelRendererTurbo(this, 2465, 185, textureX, textureY); // Box 612
		leftWingModel[72] = new ModelRendererTurbo(this, 3217, 185, textureX, textureY); // Box 613
		leftWingModel[73] = new ModelRendererTurbo(this, 2193, 185, textureX, textureY); // Box 614
		leftWingModel[74] = new ModelRendererTurbo(this, 3257, 185, textureX, textureY); // Box 615
		leftWingModel[75] = new ModelRendererTurbo(this, 3185, 185, textureX, textureY); // Box 616
		leftWingModel[76] = new ModelRendererTurbo(this, 2993, 185, textureX, textureY); // Box 617
		leftWingModel[77] = new ModelRendererTurbo(this, 3361, 185, textureX, textureY); // Box 618
		leftWingModel[78] = new ModelRendererTurbo(this, 3393, 185, textureX, textureY); // Box 619
		leftWingModel[79] = new ModelRendererTurbo(this, 3433, 185, textureX, textureY); // Box 620
		leftWingModel[80] = new ModelRendererTurbo(this, 3505, 185, textureX, textureY); // Box 621
		leftWingModel[81] = new ModelRendererTurbo(this, 3145, 185, textureX, textureY); // Box 622
		leftWingModel[82] = new ModelRendererTurbo(this, 3553, 185, textureX, textureY); // Box 623
		leftWingModel[83] = new ModelRendererTurbo(this, 3601, 185, textureX, textureY); // Box 624
		leftWingModel[84] = new ModelRendererTurbo(this, 3633, 185, textureX, textureY); // Box 625
		leftWingModel[85] = new ModelRendererTurbo(this, 3681, 185, textureX, textureY); // Box 626
		leftWingModel[86] = new ModelRendererTurbo(this, 3721, 185, textureX, textureY); // Box 627
		leftWingModel[87] = new ModelRendererTurbo(this, 3641, 185, textureX, textureY); // Box 628
		leftWingModel[88] = new ModelRendererTurbo(this, 3929, 185, textureX, textureY); // Box 629
		leftWingModel[89] = new ModelRendererTurbo(this, 1153, 193, textureX, textureY); // Box 630
		leftWingModel[90] = new ModelRendererTurbo(this, 1233, 193, textureX, textureY); // Box 631
		leftWingModel[91] = new ModelRendererTurbo(this, 1289, 193, textureX, textureY); // Box 632
		leftWingModel[92] = new ModelRendererTurbo(this, 1337, 193, textureX, textureY); // Box 633
		leftWingModel[93] = new ModelRendererTurbo(this, 1393, 193, textureX, textureY); // Box 634
		leftWingModel[94] = new ModelRendererTurbo(this, 3481, 185, textureX, textureY); // Box 635
		leftWingModel[95] = new ModelRendererTurbo(this, 1329, 193, textureX, textureY); // Box 636
		leftWingModel[96] = new ModelRendererTurbo(this, 1497, 193, textureX, textureY); // Box 637
		leftWingModel[97] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 638
		leftWingModel[98] = new ModelRendererTurbo(this, 3673, 17, textureX, textureY); // Box 639
		leftWingModel[99] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 640
		leftWingModel[100] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 641
		leftWingModel[101] = new ModelRendererTurbo(this, 1273, 17, textureX, textureY); // Box 642
		leftWingModel[102] = new ModelRendererTurbo(this, 3929, 17, textureX, textureY); // Box 643
		leftWingModel[103] = new ModelRendererTurbo(this, 1465, 25, textureX, textureY); // Box 644
		leftWingModel[104] = new ModelRendererTurbo(this, 1513, 193, textureX, textureY); // Box 645
		leftWingModel[105] = new ModelRendererTurbo(this, 3881, 193, textureX, textureY); // Box 646
		leftWingModel[106] = new ModelRendererTurbo(this, 1801, 25, textureX, textureY); // Box 647
		leftWingModel[107] = new ModelRendererTurbo(this, 4057, 177, textureX, textureY); // Box 648
		leftWingModel[108] = new ModelRendererTurbo(this, 3969, 193, textureX, textureY); // Box 649
		leftWingModel[109] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 650
		leftWingModel[110] = new ModelRendererTurbo(this, 2137, 193, textureX, textureY); // Box 651
		leftWingModel[111] = new ModelRendererTurbo(this, 2233, 193, textureX, textureY); // Box 652
		leftWingModel[112] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 653
		leftWingModel[113] = new ModelRendererTurbo(this, 1969, 193, textureX, textureY); // Box 654
		leftWingModel[114] = new ModelRendererTurbo(this, 513, 209, textureX, textureY); // Box 655
		leftWingModel[115] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 656
		leftWingModel[116] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 657
		leftWingModel[117] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 658
		leftWingModel[118] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 659
		leftWingModel[119] = new ModelRendererTurbo(this, 3433, 209, textureX, textureY); // Box 660
		leftWingModel[120] = new ModelRendererTurbo(this, 1785, 217, textureX, textureY); // Box 661
		leftWingModel[121] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Box 662
		leftWingModel[122] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 663
		leftWingModel[123] = new ModelRendererTurbo(this, 1337, 97, textureX, textureY); // Box 664
		leftWingModel[124] = new ModelRendererTurbo(this, 2481, 137, textureX, textureY); // Box 665
		leftWingModel[125] = new ModelRendererTurbo(this, 4073, 137, textureX, textureY); // Box 666
		leftWingModel[126] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 667
		leftWingModel[127] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 668
		leftWingModel[128] = new ModelRendererTurbo(this, 1665, 145, textureX, textureY); // Box 669
		leftWingModel[129] = new ModelRendererTurbo(this, 3713, 17, textureX, textureY); // Box 670
		leftWingModel[130] = new ModelRendererTurbo(this, 2289, 161, textureX, textureY); // Box 671
		leftWingModel[131] = new ModelRendererTurbo(this, 713, 185, textureX, textureY); // Box 672
		leftWingModel[132] = new ModelRendererTurbo(this, 2337, 185, textureX, textureY); // Box 673
		leftWingModel[133] = new ModelRendererTurbo(this, 1209, 193, textureX, textureY); // Box 674
		leftWingModel[134] = new ModelRendererTurbo(this, 3001, 97, textureX, textureY); // Box 675
		leftWingModel[135] = new ModelRendererTurbo(this, 3065, 97, textureX, textureY); // Box 676
		leftWingModel[136] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 677
		leftWingModel[137] = new ModelRendererTurbo(this, 1809, 113, textureX, textureY); // Box 678
		leftWingModel[138] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 679
		leftWingModel[139] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 680
		leftWingModel[140] = new ModelRendererTurbo(this, 2353, 153, textureX, textureY); // Box 681
		leftWingModel[141] = new ModelRendererTurbo(this, 2489, 153, textureX, textureY); // Box 682
		leftWingModel[142] = new ModelRendererTurbo(this, 2273, 193, textureX, textureY); // Box 683
		leftWingModel[143] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 684
		leftWingModel[144] = new ModelRendererTurbo(this, 4017, 193, textureX, textureY); // Box 685
		leftWingModel[145] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 686
		leftWingModel[146] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 687
		leftWingModel[147] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 688

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 419
		leftWingModel[0].setRotationPoint(-87F, -61F, -163F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 421
		leftWingModel[1].setRotationPoint(-87F, -61F, -157F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		leftWingModel[2].setRotationPoint(-13F, -69F, -162F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		leftWingModel[3].setRotationPoint(-13F, -67F, -166F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		leftWingModel[4].setRotationPoint(-13F, -68F, -164F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		leftWingModel[5].setRotationPoint(-27F, -69F, -162F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		leftWingModel[6].setRotationPoint(-27F, -67F, -166F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		leftWingModel[7].setRotationPoint(-27F, -68F, -164F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 14, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 549
		leftWingModel[8].setRotationPoint(-13F, -57F, -84F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 550
		leftWingModel[9].setRotationPoint(-13F, -62F, -84F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		leftWingModel[10].setRotationPoint(-13F, -69F, -78F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		leftWingModel[11].setRotationPoint(-13F, -67F, -82F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		leftWingModel[12].setRotationPoint(-13F, -68F, -80F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		leftWingModel[13].setRotationPoint(-13F, -65F, -84F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 555
		leftWingModel[14].setRotationPoint(-27F, -44F, -79F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 556
		leftWingModel[15].setRotationPoint(-27F, -46F, -82F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 557
		leftWingModel[16].setRotationPoint(-27F, -53F, -84F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 558
		leftWingModel[17].setRotationPoint(-27F, -60F, -84F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 559
		leftWingModel[18].setRotationPoint(-55F, -52F, -168F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 17, 9, 57, 0F,0F, 2.2F, 0F, -12F, 2F, 0F, -6.2F, 0.6F, 0F, 0F, 1F, 0F, 0F, -5.7F, 0F, -12F, -6F, 0F, -6.2F, -3.65F, 0F, 0F, -3F, 0F); // Box 560
		leftWingModel[19].setRotationPoint(2F, -69F, -214F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		leftWingModel[20].setRotationPoint(-27F, -69F, -78F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		leftWingModel[21].setRotationPoint(-27F, -67F, -82F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		leftWingModel[22].setRotationPoint(-27F, -68F, -80F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 564
		leftWingModel[23].setRotationPoint(-27F, -65F, -84F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		leftWingModel[24].setRotationPoint(-72F, -67F, -78F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		leftWingModel[25].setRotationPoint(-72F, -65F, -82F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 17, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 567
		leftWingModel[26].setRotationPoint(-72F, -63F, -84F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 568
		leftWingModel[27].setRotationPoint(-72F, -58F, -84F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 569
		leftWingModel[28].setRotationPoint(-72F, -44F, -82F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 570
		leftWingModel[29].setRotationPoint(-72F, -51F, -84F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 22, 7, 12, 0F,0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 571
		leftWingModel[30].setRotationPoint(19F, -68F, -95F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 572
		leftWingModel[31].setRotationPoint(-55F, -43F, -163F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 573
		leftWingModel[32].setRotationPoint(-72F, -42F, -79F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 574
		leftWingModel[33].setRotationPoint(-55F, -68F, -78F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 575
		leftWingModel[34].setRotationPoint(-55F, -66F, -82F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 576
		leftWingModel[35].setRotationPoint(-55F, -64F, -84F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 577
		leftWingModel[36].setRotationPoint(-55F, -59F, -84F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 578
		leftWingModel[37].setRotationPoint(-55F, -45F, -82F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 579
		leftWingModel[38].setRotationPoint(-55F, -52F, -84F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 580
		leftWingModel[39].setRotationPoint(-55F, -43F, -79F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 581
		leftWingModel[40].setRotationPoint(-41F, -44F, -79F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 582
		leftWingModel[41].setRotationPoint(-41F, -46F, -82F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 583
		leftWingModel[42].setRotationPoint(-41F, -44F, -163F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 17, 9, 12, 0F,0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.55F, 0F, 0F, -1.65F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F); // Box 584
		leftWingModel[43].setRotationPoint(2F, -69F, -95F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 585
		leftWingModel[44].setRotationPoint(-41F, -53F, -84F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 586
		leftWingModel[45].setRotationPoint(-41F, -69F, -78F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 587
		leftWingModel[46].setRotationPoint(-41F, -68F, -80F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 588
		leftWingModel[47].setRotationPoint(-41F, -67F, -82F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 589
		leftWingModel[48].setRotationPoint(-41F, -65F, -84F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 590
		leftWingModel[49].setRotationPoint(-41F, -60F, -84F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		leftWingModel[50].setRotationPoint(-74F, -51F, -164F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		leftWingModel[51].setRotationPoint(-74F, -42F, -160F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 593
		leftWingModel[52].setRotationPoint(-74F, -42F, -163F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 594
		leftWingModel[53].setRotationPoint(-74F, -42F, -155F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 595
		leftWingModel[54].setRotationPoint(-41F, -46F, -166F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 17, 9, 62, 0F,0F, 1F, 0F, -6.2F, 0.6F, 0F, 0F, -1F, 0F, 0F, 0.65F, 0F, 0F, -3F, 0F, -6.2F, -3.65F, 0F, 0F, -1F, 0F, 0F, -1.65F, 0F); // Box 596
		leftWingModel[55].setRotationPoint(2F, -69F, -157F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 597
		leftWingModel[56].setRotationPoint(-74F, -44F, -152F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 598
		leftWingModel[57].setRotationPoint(-74F, -44F, -166F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 599
		leftWingModel[58].setRotationPoint(-74F, -51F, -165F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 600
		leftWingModel[59].setRotationPoint(-74F, -51F, -153F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 2, 13, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 601
		leftWingModel[60].setRotationPoint(-74F, -63F, -165F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 17, 9, 50, 0F,0F, 0.55F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, -1.4F, 0F, 0F, -1F, 0F, 0F, -1.45F, 0F, 0F, -0.25F, 0F); // Box 602
		leftWingModel[61].setRotationPoint(2F, -69F, -83F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 603
		leftWingModel[62].setRotationPoint(-41F, -53F, -168F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 49, 9, 21, 0F,0F, 0.25F, 0F, -10F, -5F, 0F, 0F, 0F, 17F, 0F, 0F, 17F, 0F, -0.3F, 0F, -10F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 604
		leftWingModel[63].setRotationPoint(2F, -69F, -33F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 605
		leftWingModel[64].setRotationPoint(-41F, -69F, -162F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		leftWingModel[65].setRotationPoint(-72F, -66F, -164F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 607
		leftWingModel[66].setRotationPoint(-55F, -67F, -164F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 608
		leftWingModel[67].setRotationPoint(-13F, -47F, -163F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 609
		leftWingModel[68].setRotationPoint(-13F, -48F, -166F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 14, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 610
		leftWingModel[69].setRotationPoint(-13F, -57F, -168F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 611
		leftWingModel[70].setRotationPoint(-13F, -62F, -168F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		leftWingModel[71].setRotationPoint(-13F, -69F, -162F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 613
		leftWingModel[72].setRotationPoint(-13F, -67F, -166F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 614
		leftWingModel[73].setRotationPoint(-13F, -68F, -164F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 615
		leftWingModel[74].setRotationPoint(-13F, -65F, -168F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 12, 8, 145, 0F,5F, 3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 5F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		leftWingModel[75].setRotationPoint(-10F, -71F, -302F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 617
		leftWingModel[76].setRotationPoint(-41F, -68F, -164F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 618
		leftWingModel[77].setRotationPoint(-27F, -44F, -163F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 619
		leftWingModel[78].setRotationPoint(-27F, -46F, -166F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 620
		leftWingModel[79].setRotationPoint(-27F, -53F, -168F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 621
		leftWingModel[80].setRotationPoint(-27F, -60F, -168F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		leftWingModel[81].setRotationPoint(-27F, -69F, -162F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		leftWingModel[82].setRotationPoint(-27F, -67F, -166F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		leftWingModel[83].setRotationPoint(-27F, -68F, -164F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 625
		leftWingModel[84].setRotationPoint(-27F, -65F, -168F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		leftWingModel[85].setRotationPoint(-72F, -67F, -162F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		leftWingModel[86].setRotationPoint(-72F, -65F, -166F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 7, 8, 145, 0F,5F, 4F, 0F, 0F, 2F, 0F, 0F, 1F, 17F, 0F, 1F, 17F, 5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 628
		leftWingModel[87].setRotationPoint(-5F, -68F, -157F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 629
		leftWingModel[88].setRotationPoint(-41F, -67F, -166F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 17, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 630
		leftWingModel[89].setRotationPoint(-72F, -63F, -168F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 631
		leftWingModel[90].setRotationPoint(-72F, -58F, -168F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 632
		leftWingModel[91].setRotationPoint(-72F, -44F, -166F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 633
		leftWingModel[92].setRotationPoint(-72F, -51F, -168F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 634
		leftWingModel[93].setRotationPoint(-72F, -42F, -163F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 635
		leftWingModel[94].setRotationPoint(-55F, -68F, -162F);

		leftWingModel[95].addShapeBox(0F, 0F, 0F, 22, 7, 119, 0F,12F, 3F, 0F, -18.75F, 0.25F, 0.75F, -1F, -2.75F, -2.75F, 0F, 0F, 0F, 12F, -5F, 0F, -18.75F, -7F, 0.75F, -1F, -3.75F, -2.75F, 0F, 0F, 0F); // Box 636
		leftWingModel[95].setRotationPoint(19F, -68F, -214F);

		leftWingModel[96].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 637
		leftWingModel[96].setRotationPoint(-55F, -66F, -166F);

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 638
		leftWingModel[97].setRotationPoint(-74F, -51F, -80F);

		leftWingModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 639
		leftWingModel[98].setRotationPoint(-74F, -42F, -76F);

		leftWingModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 640
		leftWingModel[99].setRotationPoint(-74F, -42F, -79F);

		leftWingModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 641
		leftWingModel[100].setRotationPoint(-74F, -42F, -71F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 642
		leftWingModel[101].setRotationPoint(-74F, -44F, -68F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 643
		leftWingModel[102].setRotationPoint(-74F, -44F, -82F);

		leftWingModel[103].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 644
		leftWingModel[103].setRotationPoint(-74F, -51F, -81F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 22, 7, 50, 0F,0F, 0F, 0F, 0F, -2.75F, -0.5F, 0F, -4.25F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.75F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.4F, 0F); // Box 645
		leftWingModel[104].setRotationPoint(19F, -68F, -83F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 646
		leftWingModel[105].setRotationPoint(-55F, -64F, -168F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 647
		leftWingModel[106].setRotationPoint(-74F, -51F, -69F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 2, 13, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 648
		leftWingModel[107].setRotationPoint(-74F, -63F, -81F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 649
		leftWingModel[108].setRotationPoint(-55F, -59F, -168F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 5, 5, 88, 0F,0F, 1F, 0F, -1.5F, 0.5F, 0F, 11F, -2F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5.5F, 0F, 11F, -2F, -1F, 0F, 0F, 0F); // Box 650
		leftWingModel[109].setRotationPoint(7F, -71F, -302F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		leftWingModel[110].setRotationPoint(-72F, -66F, -80F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 652
		leftWingModel[111].setRotationPoint(-55F, -67F, -80F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 20, 4, 145, 0F,-2F, 4F, 0F, -5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -6F, 0F, -5F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 653
		leftWingModel[112].setRotationPoint(-30F, -67F, -302F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 654
		leftWingModel[113].setRotationPoint(-13F, -47F, -79F);

		leftWingModel[114].addShapeBox(0F, 0F, 0F, 25, 5, 145, 0F,1F, 2F, 0F, -6F, 2F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -1F, -3F, 0F, -6F, -3F, 0F, -1F, 0F, -7F, 0F, 0F, -7F); // Box 655
		leftWingModel[114].setRotationPoint(-29F, -65F, -157F);

		leftWingModel[115].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 656
		leftWingModel[115].setRotationPoint(-13F, -48F, -82F);

		leftWingModel[116].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 657
		leftWingModel[116].setRotationPoint(-55F, -45F, -166F);

		leftWingModel[117].addShapeBox(0F, 0F, 0F, 5, 5, 88, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 658
		leftWingModel[117].setRotationPoint(2F, -71F, -302F);

		leftWingModel[118].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 659
		leftWingModel[118].setRotationPoint(-41F, -65F, -168F);

		leftWingModel[119].addShapeBox(0F, 0F, 0F, 24, 3, 145, 0F,-3F, 4F, 0F, -10F, 6F, 0F, -5F, 4F, 0F, 0F, 1F, 0F, -1F, -6F, 0F, -10F, -7F, 0F, -5F, -2F, 0F, 1F, -2F, 0F); // Box 660
		leftWingModel[119].setRotationPoint(-29F, -68F, -302F);

		leftWingModel[120].addShapeBox(0F, 0F, 0F, 24, 3, 145, 0F,0F, 1F, 0F, -5F, 4F, 0F, 0F, 1F, 17F, -3F, 1F, 17F, 1F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 661
		leftWingModel[120].setRotationPoint(-29F, -68F, -157F);

		leftWingModel[121].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 662
		leftWingModel[121].setRotationPoint(-41F, -60F, -168F);

		leftWingModel[122].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 663
		leftWingModel[122].setRotationPoint(-87F, -55F, -163F);

		leftWingModel[123].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 664
		leftWingModel[123].setRotationPoint(-87F, -55F, -157F);

		leftWingModel[124].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 665
		leftWingModel[124].setRotationPoint(-82F, -54F, -165F);

		leftWingModel[125].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 666
		leftWingModel[125].setRotationPoint(-82F, -54F, -156F);

		leftWingModel[126].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 667
		leftWingModel[126].setRotationPoint(-82F, -63F, -156F);

		leftWingModel[127].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 668
		leftWingModel[127].setRotationPoint(-82F, -63F, -165F);

		leftWingModel[128].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F); // Box 669
		leftWingModel[128].setRotationPoint(-87F, -59F, -156F);

		leftWingModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 670
		leftWingModel[129].setRotationPoint(-88F, -58F, -160F);

		leftWingModel[130].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F); // Box 671
		leftWingModel[130].setRotationPoint(-87F, -54F, -161F);

		leftWingModel[131].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 672
		leftWingModel[131].setRotationPoint(-87F, -64F, -161F);

		leftWingModel[132].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 673
		leftWingModel[132].setRotationPoint(-87F, -59F, -166F);

		leftWingModel[133].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 674
		leftWingModel[133].setRotationPoint(-87F, -59F, -161F);

		leftWingModel[134].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 675
		leftWingModel[134].setRotationPoint(-87F, -61F, -79F);

		leftWingModel[135].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 676
		leftWingModel[135].setRotationPoint(-87F, -55F, -79F);

		leftWingModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 677
		leftWingModel[136].setRotationPoint(-87F, -55F, -73F);

		leftWingModel[137].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 678
		leftWingModel[137].setRotationPoint(-87F, -61F, -73F);

		leftWingModel[138].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 679
		leftWingModel[138].setRotationPoint(-82F, -54F, -81F);

		leftWingModel[139].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 680
		leftWingModel[139].setRotationPoint(-82F, -54F, -72F);

		leftWingModel[140].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 681
		leftWingModel[140].setRotationPoint(-82F, -63F, -72F);

		leftWingModel[141].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 682
		leftWingModel[141].setRotationPoint(-82F, -63F, -81F);

		leftWingModel[142].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F); // Box 683
		leftWingModel[142].setRotationPoint(-87F, -59F, -72F);

		leftWingModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 684
		leftWingModel[143].setRotationPoint(-88F, -58F, -76F);

		leftWingModel[144].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F); // Box 685
		leftWingModel[144].setRotationPoint(-87F, -54F, -77F);

		leftWingModel[145].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 686
		leftWingModel[145].setRotationPoint(-87F, -64F, -77F);

		leftWingModel[146].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 687
		leftWingModel[146].setRotationPoint(-87F, -59F, -82F);

		leftWingModel[147].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 688
		leftWingModel[147].setRotationPoint(-87F, -59F, -77F);
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
		rightWingModel[27] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Box 76
		rightWingModel[28] = new ModelRendererTurbo(this, 2057, 1, textureX, textureY); // Box 75
		rightWingModel[29] = new ModelRendererTurbo(this, 2105, 1, textureX, textureY); // Box 74
		rightWingModel[30] = new ModelRendererTurbo(this, 2145, 1, textureX, textureY); // Box 73
		rightWingModel[31] = new ModelRendererTurbo(this, 2193, 1, textureX, textureY); // Box 72
		rightWingModel[32] = new ModelRendererTurbo(this, 2241, 1, textureX, textureY); // Box 71
		rightWingModel[33] = new ModelRendererTurbo(this, 2273, 1, textureX, textureY); // Box 70
		rightWingModel[34] = new ModelRendererTurbo(this, 2537, 1, textureX, textureY); // Box 7
		rightWingModel[35] = new ModelRendererTurbo(this, 2697, 1, textureX, textureY); // Box 7
		rightWingModel[36] = new ModelRendererTurbo(this, 2761, 1, textureX, textureY); // Box 69
		rightWingModel[37] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 68
		rightWingModel[38] = new ModelRendererTurbo(this, 2809, 1, textureX, textureY); // Box 67
		rightWingModel[39] = new ModelRendererTurbo(this, 2849, 1, textureX, textureY); // Box 66
		rightWingModel[40] = new ModelRendererTurbo(this, 2889, 1, textureX, textureY); // Box 65
		rightWingModel[41] = new ModelRendererTurbo(this, 2961, 1, textureX, textureY); // Box 64
		rightWingModel[42] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 63
		rightWingModel[43] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 62
		rightWingModel[44] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 61
		rightWingModel[45] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 60
		rightWingModel[46] = new ModelRendererTurbo(this, 3009, 1, textureX, textureY); // Box 6
		rightWingModel[47] = new ModelRendererTurbo(this, 3497, 1, textureX, textureY); // Box 6
		rightWingModel[48] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 59
		rightWingModel[49] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 57
		rightWingModel[50] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 56
		rightWingModel[51] = new ModelRendererTurbo(this, 1201, 1, textureX, textureY); // Box 55
		rightWingModel[52] = new ModelRendererTurbo(this, 3897, 1, textureX, textureY); // Box 54
		rightWingModel[53] = new ModelRendererTurbo(this, 2233, 1, textureX, textureY); // Box 53
		rightWingModel[54] = new ModelRendererTurbo(this, 2745, 1, textureX, textureY); // Box 52
		rightWingModel[55] = new ModelRendererTurbo(this, 4057, 1, textureX, textureY); // Box 51
		rightWingModel[56] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 50
		rightWingModel[57] = new ModelRendererTurbo(this, 1377, 9, textureX, textureY); // Box 5
		rightWingModel[58] = new ModelRendererTurbo(this, 577, 9, textureX, textureY); // Box 5
		rightWingModel[59] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 49
		rightWingModel[60] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 48
		rightWingModel[61] = new ModelRendererTurbo(this, 1801, 9, textureX, textureY); // Box 47
		rightWingModel[62] = new ModelRendererTurbo(this, 1825, 9, textureX, textureY); // Box 46
		rightWingModel[63] = new ModelRendererTurbo(this, 3601, 9, textureX, textureY); // Box 45
		rightWingModel[64] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 44
		rightWingModel[65] = new ModelRendererTurbo(this, 3641, 9, textureX, textureY); // Box 43
		rightWingModel[66] = new ModelRendererTurbo(this, 3681, 9, textureX, textureY); // Box 42
		rightWingModel[67] = new ModelRendererTurbo(this, 3721, 9, textureX, textureY); // Box 41
		rightWingModel[68] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 40
		rightWingModel[69] = new ModelRendererTurbo(this, 3737, 17, textureX, textureY); // Box 4
		rightWingModel[70] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 4
		rightWingModel[71] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 39
		rightWingModel[72] = new ModelRendererTurbo(this, 1345, 17, textureX, textureY); // Box 38
		rightWingModel[73] = new ModelRendererTurbo(this, 1841, 17, textureX, textureY); // Box 37
		rightWingModel[74] = new ModelRendererTurbo(this, 1873, 17, textureX, textureY); // Box 36
		rightWingModel[75] = new ModelRendererTurbo(this, 2193, 17, textureX, textureY); // Box 35
		rightWingModel[76] = new ModelRendererTurbo(this, 2649, 17, textureX, textureY); // Box 34
		rightWingModel[77] = new ModelRendererTurbo(this, 3505, 17, textureX, textureY); // Box 33
		rightWingModel[78] = new ModelRendererTurbo(this, 3929, 17, textureX, textureY); // Box 33
		rightWingModel[79] = new ModelRendererTurbo(this, 3961, 17, textureX, textureY); // Box 32
		rightWingModel[80] = new ModelRendererTurbo(this, 4025, 17, textureX, textureY); // Box 32
		rightWingModel[81] = new ModelRendererTurbo(this, 3857, 17, textureX, textureY); // Box 31
		rightWingModel[82] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 31
		rightWingModel[83] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 30
		rightWingModel[84] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 3
		rightWingModel[85] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 3
		rightWingModel[86] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 29
		rightWingModel[87] = new ModelRendererTurbo(this, 1257, 25, textureX, textureY); // Box 28
		rightWingModel[88] = new ModelRendererTurbo(this, 1145, 25, textureX, textureY); // Box 27
		rightWingModel[89] = new ModelRendererTurbo(this, 2265, 25, textureX, textureY); // Box 26
		rightWingModel[90] = new ModelRendererTurbo(this, 2241, 25, textureX, textureY); // Box 25
		rightWingModel[91] = new ModelRendererTurbo(this, 3601, 25, textureX, textureY); // Box 25
		rightWingModel[92] = new ModelRendererTurbo(this, 3633, 25, textureX, textureY); // Box 24
		rightWingModel[93] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		rightWingModel[94] = new ModelRendererTurbo(this, 3681, 25, textureX, textureY); // Box 23
		rightWingModel[95] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 23
		rightWingModel[96] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 22
		rightWingModel[97] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 21
		rightWingModel[98] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 20
		rightWingModel[99] = new ModelRendererTurbo(this, 1681, 25, textureX, textureY); // Box 2
		rightWingModel[100] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 2
		rightWingModel[101] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 19
		rightWingModel[102] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 18
		rightWingModel[103] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 17
		rightWingModel[104] = new ModelRendererTurbo(this, 1193, 33, textureX, textureY); // Box 16
		rightWingModel[105] = new ModelRendererTurbo(this, 2577, 33, textureX, textureY); // Box 15
		rightWingModel[106] = new ModelRendererTurbo(this, 3489, 33, textureX, textureY); // Box 14
		rightWingModel[107] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 13
		rightWingModel[108] = new ModelRendererTurbo(this, 1465, 41, textureX, textureY); // Box 13
		rightWingModel[109] = new ModelRendererTurbo(this, 3761, 1, textureX, textureY); // Box 126
		rightWingModel[110] = new ModelRendererTurbo(this, 2153, 1, textureX, textureY); // Box 125
		rightWingModel[111] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 124
		rightWingModel[112] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 123
		rightWingModel[113] = new ModelRendererTurbo(this, 1345, 1, textureX, textureY); // Box 122
		rightWingModel[114] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 121
		rightWingModel[115] = new ModelRendererTurbo(this, 2193, 1, textureX, textureY); // Box 120
		rightWingModel[116] = new ModelRendererTurbo(this, 2193, 57, textureX, textureY); // Box 12
		rightWingModel[117] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 12
		rightWingModel[118] = new ModelRendererTurbo(this, 2281, 1, textureX, textureY); // Box 119
		rightWingModel[119] = new ModelRendererTurbo(this, 3297, 33, textureX, textureY); // Box 118
		rightWingModel[120] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 117
		rightWingModel[121] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 116
		rightWingModel[122] = new ModelRendererTurbo(this, 2833, 17, textureX, textureY); // Box 115
		rightWingModel[123] = new ModelRendererTurbo(this, 1401, 25, textureX, textureY); // Box 114
		rightWingModel[124] = new ModelRendererTurbo(this, 2625, 33, textureX, textureY); // Box 113
		rightWingModel[125] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 112
		rightWingModel[126] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 111
		rightWingModel[127] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 110
		rightWingModel[128] = new ModelRendererTurbo(this, 3225, 49, textureX, textureY); // Box 11
		rightWingModel[129] = new ModelRendererTurbo(this, 1449, 65, textureX, textureY); // Box 11
		rightWingModel[130] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 109
		rightWingModel[131] = new ModelRendererTurbo(this, 2769, 1, textureX, textureY); // Box 108
		rightWingModel[132] = new ModelRendererTurbo(this, 1105, 49, textureX, textureY); // Box 107
		rightWingModel[133] = new ModelRendererTurbo(this, 1337, 49, textureX, textureY); // Box 106
		rightWingModel[134] = new ModelRendererTurbo(this, 2193, 49, textureX, textureY); // Box 105
		rightWingModel[135] = new ModelRendererTurbo(this, 3489, 49, textureX, textureY); // Box 104
		rightWingModel[136] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 103
		rightWingModel[137] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 102
		rightWingModel[138] = new ModelRendererTurbo(this, 1945, 65, textureX, textureY); // Box 102
		rightWingModel[139] = new ModelRendererTurbo(this, 4041, 49, textureX, textureY); // Box 101
		rightWingModel[140] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 101
		rightWingModel[141] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 100
		rightWingModel[142] = new ModelRendererTurbo(this, 2289, 57, textureX, textureY); // Box 10
		rightWingModel[143] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 10
		rightWingModel[144] = new ModelRendererTurbo(this, 1553, 65, textureX, textureY); // Box 1
		rightWingModel[145] = new ModelRendererTurbo(this, 2369, 89, textureX, textureY); // Box 1
		rightWingModel[146] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 0
		rightWingModel[147] = new ModelRendererTurbo(this, 1889, 65, textureX, textureY); // Box 0

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

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 53
		rightWingModel[53].setRotationPoint(-87F, -61F, 170F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 52
		rightWingModel[54].setRotationPoint(-87F, -55F, 170F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 51
		rightWingModel[55].setRotationPoint(-87F, -55F, 164F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 50
		rightWingModel[56].setRotationPoint(-87F, -61F, 164F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 17, 9, 50, 0F,0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.55F, 0F, 0F, -0.25F, 0F, 0F, -1.45F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F); // Box 5
		rightWingModel[57].setRotationPoint(2F, -69F, 43F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F); // Box 5
		rightWingModel[58].setRotationPoint(-41F, -53F, 159F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 49
		rightWingModel[59].setRotationPoint(-82F, -54F, 171F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 48
		rightWingModel[60].setRotationPoint(-82F, -54F, 162F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 47
		rightWingModel[61].setRotationPoint(-82F, -63F, 162F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 46
		rightWingModel[62].setRotationPoint(-82F, -63F, 171F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 45
		rightWingModel[63].setRotationPoint(-87F, -59F, 161F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 44
		rightWingModel[64].setRotationPoint(-88F, -58F, 167F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F); // Box 43
		rightWingModel[65].setRotationPoint(-87F, -54F, 166F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 42
		rightWingModel[66].setRotationPoint(-87F, -64F, 166F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F); // Box 41
		rightWingModel[67].setRotationPoint(-87F, -59F, 171F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 40
		rightWingModel[68].setRotationPoint(-87F, -59F, 166F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 49, 9, 21, 0F,0F, 0F, 17F, 0F, 0F, 17F, -10F, -5F, 0F, 0F, 0.25F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -10F, -3F, 0F, 0F, -0.3F, 0F); // Box 4
		rightWingModel[69].setRotationPoint(2F, -69F, 22F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 4
		rightWingModel[70].setRotationPoint(-41F, -69F, 165F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		rightWingModel[71].setRotationPoint(-72F, -66F, 163F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 38
		rightWingModel[72].setRotationPoint(-55F, -67F, 163F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 37
		rightWingModel[73].setRotationPoint(-13F, -47F, 164F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 36
		rightWingModel[74].setRotationPoint(-13F, -48F, 161F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 14, 9, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -2F); // Box 35
		rightWingModel[75].setRotationPoint(-13F, -57F, 159F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 34
		rightWingModel[76].setRotationPoint(-13F, -62F, 159F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightWingModel[77].setRotationPoint(-13F, -69F, 165F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightWingModel[78].setRotationPoint(-13F, -69F, 165F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightWingModel[79].setRotationPoint(-13F, -67F, 161F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightWingModel[80].setRotationPoint(-13F, -67F, 161F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightWingModel[81].setRotationPoint(-13F, -68F, 163F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightWingModel[82].setRotationPoint(-13F, -68F, 163F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 14, 3, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 30
		rightWingModel[83].setRotationPoint(-13F, -65F, 159F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 12, 8, 145, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 5F, -6F, 0F); // Box 3
		rightWingModel[84].setRotationPoint(-10F, -71F, 167F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 3
		rightWingModel[85].setRotationPoint(-41F, -68F, 163F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 29
		rightWingModel[86].setRotationPoint(-27F, -44F, 164F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F); // Box 28
		rightWingModel[87].setRotationPoint(-27F, -46F, 161F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F); // Box 27
		rightWingModel[88].setRotationPoint(-27F, -53F, 159F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 26
		rightWingModel[89].setRotationPoint(-27F, -60F, 159F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightWingModel[90].setRotationPoint(-27F, -69F, 165F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightWingModel[91].setRotationPoint(-27F, -69F, 165F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[92].setRotationPoint(-27F, -67F, 161F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[93].setRotationPoint(-27F, -67F, 161F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightWingModel[94].setRotationPoint(-27F, -68F, 163F);

		rightWingModel[95].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightWingModel[95].setRotationPoint(-27F, -68F, 163F);

		rightWingModel[96].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 22
		rightWingModel[96].setRotationPoint(-27F, -65F, 159F);

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 17, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		rightWingModel[97].setRotationPoint(-72F, -67F, 165F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightWingModel[98].setRotationPoint(-72F, -65F, 161F);

		rightWingModel[99].addShapeBox(0F, 0F, 0F, 7, 8, 145, 0F,0F, 1F, 17F, 0F, 1F, 17F, 0F, 2F, 0F, 5F, 4F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, 0F, 5F, -3F, 0F); // Box 2
		rightWingModel[99].setRotationPoint(-5F, -68F, 22F);

		rightWingModel[100].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 2
		rightWingModel[100].setRotationPoint(-41F, -67F, 161F);

		rightWingModel[101].addShapeBox(0F, 0F, 0F, 17, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 19
		rightWingModel[101].setRotationPoint(-72F, -63F, 159F);

		rightWingModel[102].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 18
		rightWingModel[102].setRotationPoint(-72F, -58F, 159F);

		rightWingModel[103].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 17
		rightWingModel[103].setRotationPoint(-72F, -44F, 161F);

		rightWingModel[104].addShapeBox(0F, 0F, 0F, 17, 7, 19, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 16
		rightWingModel[104].setRotationPoint(-72F, -51F, 159F);

		rightWingModel[105].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 15
		rightWingModel[105].setRotationPoint(-72F, -42F, 164F);

		rightWingModel[106].addShapeBox(0F, 0F, 0F, 14, 1, 7, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 14
		rightWingModel[106].setRotationPoint(-55F, -68F, 165F);

		rightWingModel[107].addShapeBox(0F, 0F, 0F, 22, 7, 119, 0F,0F, 0F, 0F, -1F, -2.75F, -2.75F, -18.75F, 0.25F, 0.75F, 12F, 3F, 0F, 0F, 0F, 0F, -1F, -3.75F, -2.75F, -18.75F, -7F, 0.75F, 12F, -5F, 0F); // Box 13
		rightWingModel[107].setRotationPoint(19F, -68F, 105F);

		rightWingModel[108].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 13
		rightWingModel[108].setRotationPoint(-55F, -66F, 161F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		rightWingModel[109].setRotationPoint(-74F, -51F, 79F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		rightWingModel[110].setRotationPoint(-74F, -42F, 83F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 124
		rightWingModel[111].setRotationPoint(-74F, -42F, 88F);

		rightWingModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 123
		rightWingModel[112].setRotationPoint(-74F, -42F, 80F);

		rightWingModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 122
		rightWingModel[113].setRotationPoint(-74F, -44F, 77F);

		rightWingModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 121
		rightWingModel[114].setRotationPoint(-74F, -44F, 91F);

		rightWingModel[115].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 120
		rightWingModel[115].setRotationPoint(-74F, -51F, 90F);

		rightWingModel[116].addShapeBox(0F, 0F, 0F, 22, 7, 50, 0F,0F, -1F, 0F, 0F, -4.25F, -0.5F, 0F, -2.75F, -0.5F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -2.25F, -0.5F, 0F, -3.75F, -0.5F, 0F, 0F, 0F); // Box 12
		rightWingModel[116].setRotationPoint(19F, -68F, 43F);

		rightWingModel[117].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 12
		rightWingModel[117].setRotationPoint(-55F, -64F, 159F);

		rightWingModel[118].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 119
		rightWingModel[118].setRotationPoint(-74F, -51F, 78F);

		rightWingModel[119].addShapeBox(0F, 0F, 0F, 2, 13, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 118
		rightWingModel[119].setRotationPoint(-74F, -63F, 78F);

		rightWingModel[120].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 117
		rightWingModel[120].setRotationPoint(-87F, -61F, 86F);

		rightWingModel[121].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 116
		rightWingModel[121].setRotationPoint(-87F, -55F, 86F);

		rightWingModel[122].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 115
		rightWingModel[122].setRotationPoint(-87F, -55F, 80F);

		rightWingModel[123].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 114
		rightWingModel[123].setRotationPoint(-87F, -61F, 80F);

		rightWingModel[124].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 113
		rightWingModel[124].setRotationPoint(-82F, -54F, 87F);

		rightWingModel[125].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 112
		rightWingModel[125].setRotationPoint(-82F, -54F, 78F);

		rightWingModel[126].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 111
		rightWingModel[126].setRotationPoint(-82F, -63F, 78F);

		rightWingModel[127].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 110
		rightWingModel[127].setRotationPoint(-82F, -63F, 87F);

		rightWingModel[128].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 11
		rightWingModel[128].setRotationPoint(-55F, -59F, 159F);

		rightWingModel[129].addShapeBox(0F, 0F, 0F, 5, 5, 88, 0F,0F, 0F, 0F, 11F, -2F, -1F, -1.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 11F, -2F, -1F, -1.5F, -5.5F, 0F, 0F, -5F, 0F); // Box 11
		rightWingModel[129].setRotationPoint(7F, -71F, 224F);

		rightWingModel[130].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, -5F, -1F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 109
		rightWingModel[130].setRotationPoint(-87F, -59F, 77F);

		rightWingModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 108
		rightWingModel[131].setRotationPoint(-88F, -58F, 83F);

		rightWingModel[132].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F); // Box 107
		rightWingModel[132].setRotationPoint(-87F, -54F, 82F);

		rightWingModel[133].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,-5F, -3F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -3F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 106
		rightWingModel[133].setRotationPoint(-87F, -64F, 82F);

		rightWingModel[134].addShapeBox(0F, 0F, 0F, 12, 5, 5, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, -1F, -3F); // Box 105
		rightWingModel[134].setRotationPoint(-87F, -59F, 87F);

		rightWingModel[135].addShapeBox(0F, 0F, 0F, 15, 5, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 104
		rightWingModel[135].setRotationPoint(-87F, -59F, 82F);

		rightWingModel[136].addShapeBox(0F, 0F, 0F, 17, 1, 11, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightWingModel[136].setRotationPoint(-72F, -66F, 79F);

		rightWingModel[137].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 102
		rightWingModel[137].setRotationPoint(-55F, -67F, 79F);

		rightWingModel[138].addShapeBox(0F, 0F, 0F, 20, 4, 145, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 5F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, -7F, -6F, 0F); // Box 102
		rightWingModel[138].setRotationPoint(-30F, -67F, 167F);

		rightWingModel[139].addShapeBox(0F, 0F, 0F, 14, 1, 9, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 101
		rightWingModel[139].setRotationPoint(-13F, -47F, 80F);

		rightWingModel[140].addShapeBox(0F, 0F, 0F, 25, 5, 145, 0F,4F, 0F, 0F, -1F, 0F, 0F, -6F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, -7F, -1F, 0F, -7F, -6F, -3F, 0F, -1F, -3F, 0F); // Box 101
		rightWingModel[140].setRotationPoint(-29F, -65F, 22F);

		rightWingModel[141].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, 0F, -3F); // Box 100
		rightWingModel[141].setRotationPoint(-13F, -48F, 77F);

		rightWingModel[142].addShapeBox(0F, 0F, 0F, 14, 2, 15, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -3F); // Box 10
		rightWingModel[142].setRotationPoint(-55F, -45F, 161F);

		rightWingModel[143].addShapeBox(0F, 0F, 0F, 5, 5, 88, 0F,0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F); // Box 10
		rightWingModel[143].setRotationPoint(2F, -71F, 224F);

		rightWingModel[144].addShapeBox(0F, 0F, 0F, 14, 5, 19, 0F,0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 1
		rightWingModel[144].setRotationPoint(-41F, -65F, 159F);

		rightWingModel[145].addShapeBox(0F, 0F, 0F, 24, 3, 145, 0F,0F, 1F, 0F, -5F, 4F, 0F, -10F, 6F, 0F, -3F, 4F, 0F, 1F, -2F, 0F, -5F, -2F, 0F, -10F, -7F, 0F, -1F, -6F, 0F); // Box 1
		rightWingModel[145].setRotationPoint(-29F, -68F, 167F);

		rightWingModel[146].addShapeBox(0F, 0F, 0F, 24, 3, 145, 0F,-3F, 1F, 17F, 0F, 1F, 17F, -5F, 4F, 0F, 0F, 1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 1F, -2F, 0F); // Box 0
		rightWingModel[146].setRotationPoint(-29F, -68F, 22F);

		rightWingModel[147].addShapeBox(0F, 0F, 0F, 14, 7, 19, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 0
		rightWingModel[147].setRotationPoint(-41F, -60F, 159F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 3937, 97, textureX, textureY); // Box 212
		bodyWheelModel[1] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 213
		bodyWheelModel[2] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 214
		bodyWheelModel[3] = new ModelRendererTurbo(this, 2233, 49, textureX, textureY); // Box 231
		bodyWheelModel[4] = new ModelRendererTurbo(this, 889, 81, textureX, textureY); // Box 232
		bodyWheelModel[5] = new ModelRendererTurbo(this, 1305, 25, textureX, textureY); // Box 233
		bodyWheelModel[6] = new ModelRendererTurbo(this, 2681, 49, textureX, textureY); // Box 235
		bodyWheelModel[7] = new ModelRendererTurbo(this, 3937, 33, textureX, textureY); // Box 236
		bodyWheelModel[8] = new ModelRendererTurbo(this, 609, 41, textureX, textureY); // Box 237
		bodyWheelModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 238
		bodyWheelModel[10] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Box 239
		bodyWheelModel[11] = new ModelRendererTurbo(this, 1249, 9, textureX, textureY); // Box 240
		bodyWheelModel[12] = new ModelRendererTurbo(this, 1057, 33, textureX, textureY); // Box 241
		bodyWheelModel[13] = new ModelRendererTurbo(this, 2769, 9, textureX, textureY); // Box 242
		bodyWheelModel[14] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 243
		bodyWheelModel[15] = new ModelRendererTurbo(this, 1649, 41, textureX, textureY); // Box 244
		bodyWheelModel[16] = new ModelRendererTurbo(this, 1657, 41, textureX, textureY); // Box 245
		bodyWheelModel[17] = new ModelRendererTurbo(this, 1633, 81, textureX, textureY); // Box 246
		bodyWheelModel[18] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 247
		bodyWheelModel[19] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 248
		bodyWheelModel[20] = new ModelRendererTurbo(this, 3857, 17, textureX, textureY); // Box 249
		bodyWheelModel[21] = new ModelRendererTurbo(this, 1465, 41, textureX, textureY); // Box 250
		bodyWheelModel[22] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 251
		bodyWheelModel[23] = new ModelRendererTurbo(this, 1905, 57, textureX, textureY); // Box 253
		bodyWheelModel[24] = new ModelRendererTurbo(this, 3097, 57, textureX, textureY); // Box 254
		bodyWheelModel[25] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 255
		bodyWheelModel[26] = new ModelRendererTurbo(this, 2417, 33, textureX, textureY); // Box 256
		bodyWheelModel[27] = new ModelRendererTurbo(this, 3681, 25, textureX, textureY); // Box 257
		bodyWheelModel[28] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 258
		bodyWheelModel[29] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 259
		bodyWheelModel[30] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 260
		bodyWheelModel[31] = new ModelRendererTurbo(this, 1193, 145, textureX, textureY); // Box 546
		bodyWheelModel[32] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Box 547
		bodyWheelModel[33] = new ModelRendererTurbo(this, 649, 153, textureX, textureY); // Box 548
		bodyWheelModel[34] = new ModelRendererTurbo(this, 2417, 121, textureX, textureY); // Box 783
		bodyWheelModel[35] = new ModelRendererTurbo(this, 3929, 161, textureX, textureY); // Box 784
		bodyWheelModel[36] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 785
		bodyWheelModel[37] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 786
		bodyWheelModel[38] = new ModelRendererTurbo(this, 2449, 121, textureX, textureY); // Box 787
		bodyWheelModel[39] = new ModelRendererTurbo(this, 2337, 113, textureX, textureY); // Box 788
		bodyWheelModel[40] = new ModelRendererTurbo(this, 1929, 121, textureX, textureY); // Box 789
		bodyWheelModel[41] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 790
		bodyWheelModel[42] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 791
		bodyWheelModel[43] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 792
		bodyWheelModel[44] = new ModelRendererTurbo(this, 2161, 97, textureX, textureY); // Box 793
		bodyWheelModel[45] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 794
		bodyWheelModel[46] = new ModelRendererTurbo(this, 3321, 65, textureX, textureY); // Box 795
		bodyWheelModel[47] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 796
		bodyWheelModel[48] = new ModelRendererTurbo(this, 1065, 73, textureX, textureY); // Box 797
		bodyWheelModel[49] = new ModelRendererTurbo(this, 1065, 193, textureX, textureY); // Box 798
		bodyWheelModel[50] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 799
		bodyWheelModel[51] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 800
		bodyWheelModel[52] = new ModelRendererTurbo(this, 3273, 97, textureX, textureY); // Box 801
		bodyWheelModel[53] = new ModelRendererTurbo(this, 745, 105, textureX, textureY); // Box 802
		bodyWheelModel[54] = new ModelRendererTurbo(this, 2161, 113, textureX, textureY); // Box 803
		bodyWheelModel[55] = new ModelRendererTurbo(this, 3313, 97, textureX, textureY); // Box 804
		bodyWheelModel[56] = new ModelRendererTurbo(this, 3033, 129, textureX, textureY); // Box 805
		bodyWheelModel[57] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 806
		bodyWheelModel[58] = new ModelRendererTurbo(this, 1737, 113, textureX, textureY); // Box 807
		bodyWheelModel[59] = new ModelRendererTurbo(this, 4073, 113, textureX, textureY); // Box 808
		bodyWheelModel[60] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 809
		bodyWheelModel[61] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Box 810
		bodyWheelModel[62] = new ModelRendererTurbo(this, 3321, 113, textureX, textureY); // Box 811
		bodyWheelModel[63] = new ModelRendererTurbo(this, 1817, 121, textureX, textureY); // Box 812
		bodyWheelModel[64] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 948
		bodyWheelModel[65] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 949
		bodyWheelModel[66] = new ModelRendererTurbo(this, 1313, 49, textureX, textureY); // Box 950
		bodyWheelModel[67] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 951
		bodyWheelModel[68] = new ModelRendererTurbo(this, 2825, 89, textureX, textureY); // Box 952
		bodyWheelModel[69] = new ModelRendererTurbo(this, 2065, 161, textureX, textureY); // Box 953
		bodyWheelModel[70] = new ModelRendererTurbo(this, 1073, 137, textureX, textureY); // Box 954
		bodyWheelModel[71] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Box 955
		bodyWheelModel[72] = new ModelRendererTurbo(this, 3921, 137, textureX, textureY); // Box 956
		bodyWheelModel[73] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 957
		bodyWheelModel[74] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 958
		bodyWheelModel[75] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 959
		bodyWheelModel[76] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 960
		bodyWheelModel[77] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 961
		bodyWheelModel[78] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 962
		bodyWheelModel[79] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 963
		bodyWheelModel[80] = new ModelRendererTurbo(this, 2569, 185, textureX, textureY); // Box 964
		bodyWheelModel[81] = new ModelRendererTurbo(this, 1553, 145, textureX, textureY); // Box 965
		bodyWheelModel[82] = new ModelRendererTurbo(this, 3369, 145, textureX, textureY); // Box 966
		bodyWheelModel[83] = new ModelRendererTurbo(this, 1065, 153, textureX, textureY); // Box 967
		bodyWheelModel[84] = new ModelRendererTurbo(this, 1977, 153, textureX, textureY); // Box 968
		bodyWheelModel[85] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 969
		bodyWheelModel[86] = new ModelRendererTurbo(this, 3393, 145, textureX, textureY); // Box 970
		bodyWheelModel[87] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 1067
		bodyWheelModel[88] = new ModelRendererTurbo(this, 3313, 97, textureX, textureY); // Box 1068

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 45, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, -6F, 6F, 0F, -6F, 6F); // Box 212
		bodyWheelModel[0].setRotationPoint(-30F, -19F, 43F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, -3F, 2F); // Box 213
		bodyWheelModel[1].setRotationPoint(-30F, -15F, 49F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 1F, 0F, -3F, 1F); // Box 214
		bodyWheelModel[2].setRotationPoint(-30F, -11F, 51F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 231
		bodyWheelModel[3].setRotationPoint(-25F, 5F, 34F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyWheelModel[4].setRotationPoint(-25F, -5F, 34F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 233
		bodyWheelModel[5].setRotationPoint(-15F, -5F, 34F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyWheelModel[6].setRotationPoint(-25F, -7F, 34F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyWheelModel[7].setRotationPoint(-23F, -7.5F, 34F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F); // Box 237
		bodyWheelModel[8].setRotationPoint(-23F, 6.5F, 34F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 238
		bodyWheelModel[9].setRotationPoint(-27F, -5F, 34F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F); // Box 239
		bodyWheelModel[10].setRotationPoint(-27.5F, -3F, 34F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 240
		bodyWheelModel[11].setRotationPoint(-23.5F, -4F, 31F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyWheelModel[12].setRotationPoint(-21.5F, -4F, 31F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 242
		bodyWheelModel[13].setRotationPoint(-18.5F, -4F, 31F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyWheelModel[14].setRotationPoint(-21F, -19F, 31F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyWheelModel[15].setRotationPoint(-21F, -19F, 32F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 245
		bodyWheelModel[16].setRotationPoint(-21F, -19F, 33F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyWheelModel[17].setRotationPoint(1F, -5F, 34F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 247
		bodyWheelModel[18].setRotationPoint(1F, 5F, 34F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F); // Box 248
		bodyWheelModel[19].setRotationPoint(3F, 6.5F, 34F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F); // Box 249
		bodyWheelModel[20].setRotationPoint(-1.5F, -3F, 34F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 250
		bodyWheelModel[21].setRotationPoint(-1F, -5F, 34F);

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 251
		bodyWheelModel[22].setRotationPoint(11F, -5F, 34F);

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyWheelModel[23].setRotationPoint(1F, -7F, 34F);

		bodyWheelModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyWheelModel[24].setRotationPoint(3F, -7.5F, 34F);

		bodyWheelModel[25].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 255
		bodyWheelModel[25].setRotationPoint(2.5F, -4F, 31F);

		bodyWheelModel[26].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyWheelModel[26].setRotationPoint(4.5F, -4F, 31F);

		bodyWheelModel[27].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 257
		bodyWheelModel[27].setRotationPoint(7.5F, -4F, 31F);

		bodyWheelModel[28].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyWheelModel[28].setRotationPoint(5F, -19F, 31F);

		bodyWheelModel[29].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyWheelModel[29].setRotationPoint(5F, -19F, 32F);

		bodyWheelModel[30].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 260
		bodyWheelModel[30].setRotationPoint(5F, -19F, 33F);

		bodyWheelModel[31].addShapeBox(0F, 0F, 0F, 45, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 6F, 0F, -6F, 6F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 546
		bodyWheelModel[31].setRotationPoint(-30F, -19F, -34F);

		bodyWheelModel[32].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, -3F, -2F); // Box 547
		bodyWheelModel[32].setRotationPoint(-30F, -15F, -40F);

		bodyWheelModel[33].addShapeBox(0F, 0F, 0F, 45, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, -1F, 0F, -3F, -1F); // Box 548
		bodyWheelModel[33].setRotationPoint(-30F, -11F, -42F);

		bodyWheelModel[34].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 783
		bodyWheelModel[34].setRotationPoint(-25F, 5F, -28F);

		bodyWheelModel[35].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		bodyWheelModel[35].setRotationPoint(-25F, -5F, -28F);

		bodyWheelModel[36].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 785
		bodyWheelModel[36].setRotationPoint(-15F, -5F, -28F);

		bodyWheelModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 786
		bodyWheelModel[37].setRotationPoint(-13.5F, -3F, -28F);

		bodyWheelModel[38].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 787
		bodyWheelModel[38].setRotationPoint(-25F, -7F, -28F);

		bodyWheelModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		bodyWheelModel[39].setRotationPoint(-23F, -7.5F, -28F);

		bodyWheelModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F); // Box 789
		bodyWheelModel[40].setRotationPoint(-23F, 6.5F, -28F);

		bodyWheelModel[41].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 790
		bodyWheelModel[41].setRotationPoint(-27F, -5F, -28F);

		bodyWheelModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F); // Box 791
		bodyWheelModel[42].setRotationPoint(-27.5F, -3F, -28F);

		bodyWheelModel[43].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 792
		bodyWheelModel[43].setRotationPoint(-23.5F, -4F, -24F);

		bodyWheelModel[44].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		bodyWheelModel[44].setRotationPoint(-21.5F, -4F, -24F);

		bodyWheelModel[45].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 794
		bodyWheelModel[45].setRotationPoint(-18.5F, -4F, -24F);

		bodyWheelModel[46].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 795
		bodyWheelModel[46].setRotationPoint(-21F, -19F, -22F);

		bodyWheelModel[47].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		bodyWheelModel[47].setRotationPoint(-21F, -19F, -23F);

		bodyWheelModel[48].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 797
		bodyWheelModel[48].setRotationPoint(-21F, -19F, -24F);

		bodyWheelModel[49].addShapeBox(0F, 0F, 0F, 10, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		bodyWheelModel[49].setRotationPoint(1F, -5F, -28F);

		bodyWheelModel[50].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 799
		bodyWheelModel[50].setRotationPoint(1F, 5F, -28F);

		bodyWheelModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F); // Box 800
		bodyWheelModel[51].setRotationPoint(3F, 6.5F, -28F);

		bodyWheelModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F); // Box 801
		bodyWheelModel[52].setRotationPoint(-1.5F, -3F, -28F);

		bodyWheelModel[53].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 802
		bodyWheelModel[53].setRotationPoint(-1F, -5F, -28F);

		bodyWheelModel[54].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 803
		bodyWheelModel[54].setRotationPoint(11F, -5F, -28F);

		bodyWheelModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 804
		bodyWheelModel[55].setRotationPoint(12.5F, -3F, -28F);

		bodyWheelModel[56].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,-2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		bodyWheelModel[56].setRotationPoint(1F, -7F, -28F);

		bodyWheelModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		bodyWheelModel[57].setRotationPoint(3F, -7.5F, -28F);

		bodyWheelModel[58].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 807
		bodyWheelModel[58].setRotationPoint(2.5F, -4F, -24F);

		bodyWheelModel[59].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		bodyWheelModel[59].setRotationPoint(4.5F, -4F, -24F);

		bodyWheelModel[60].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 809
		bodyWheelModel[60].setRotationPoint(7.5F, -4F, -24F);

		bodyWheelModel[61].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 810
		bodyWheelModel[61].setRotationPoint(5F, -19F, -22F);

		bodyWheelModel[62].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 811
		bodyWheelModel[62].setRotationPoint(5F, -19F, -23F);

		bodyWheelModel[63].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		bodyWheelModel[63].setRotationPoint(5F, -19F, -24F);

		bodyWheelModel[64].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 948
		bodyWheelModel[64].setRotationPoint(-169.85F, -8F, 5.5F);

		bodyWheelModel[65].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 949
		bodyWheelModel[65].setRotationPoint(-169.85F, -8F, 3.5F);

		bodyWheelModel[66].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		bodyWheelModel[66].setRotationPoint(-169.85F, -8F, 4.5F);

		bodyWheelModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 951
		bodyWheelModel[67].setRotationPoint(-169.85F, -1.5F, 3.5F);

		bodyWheelModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 952
		bodyWheelModel[68].setRotationPoint(-170.85F, 0.5F, 3F);

		bodyWheelModel[69].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 953
		bodyWheelModel[69].setRotationPoint(-172.85F, -2.5F, -1F);

		bodyWheelModel[70].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		bodyWheelModel[70].setRotationPoint(-172.85F, -3.5F, -1F);

		bodyWheelModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		bodyWheelModel[71].setRotationPoint(-171.85F, -4.5F, -1F);

		bodyWheelModel[72].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 956
		bodyWheelModel[72].setRotationPoint(-172.85F, 5.5F, -1F);

		bodyWheelModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 957
		bodyWheelModel[73].setRotationPoint(-171.85F, 6.5F, -1F);

		bodyWheelModel[74].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 958
		bodyWheelModel[74].setRotationPoint(-173.85F, -2.5F, -1F);

		bodyWheelModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 959
		bodyWheelModel[75].setRotationPoint(-174.85F, -1.5F, -1F);

		bodyWheelModel[76].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 960
		bodyWheelModel[76].setRotationPoint(-164.85F, -2.5F, -1F);

		bodyWheelModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 961
		bodyWheelModel[77].setRotationPoint(-163.85F, -1.5F, -1F);

		bodyWheelModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 962
		bodyWheelModel[78].setRotationPoint(-163.85F, -1.5F, 7F);

		bodyWheelModel[79].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 963
		bodyWheelModel[79].setRotationPoint(-164.85F, -2.5F, 7F);

		bodyWheelModel[80].addShapeBox(0F, 0F, 0F, 8, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyWheelModel[80].setRotationPoint(-172.85F, -2.5F, 7F);

		bodyWheelModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		bodyWheelModel[81].setRotationPoint(-172.85F, -3.5F, 7F);

		bodyWheelModel[82].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		bodyWheelModel[82].setRotationPoint(-171.85F, -4.5F, 7F);

		bodyWheelModel[83].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 967
		bodyWheelModel[83].setRotationPoint(-173.85F, -2.5F, 7F);

		bodyWheelModel[84].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 968
		bodyWheelModel[84].setRotationPoint(-174.85F, -1.5F, 7F);

		bodyWheelModel[85].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 969
		bodyWheelModel[85].setRotationPoint(-172.85F, 5.5F, 7F);

		bodyWheelModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 970
		bodyWheelModel[86].setRotationPoint(-171.85F, 6.5F, 7F);

		bodyWheelModel[87].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 1067
		bodyWheelModel[87].setRotationPoint(-13.5F, -3F, 34F);

		bodyWheelModel[88].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F); // Box 1068
		bodyWheelModel[88].setRotationPoint(12.5F, -3F, 34F);
	}

	private void inittailDoorOpenModel_1()
	{
		tailDoorOpenModel[0] = new ModelRendererTurbo(this, 809, 81, textureX, textureY); // Box 374
		tailDoorOpenModel[1] = new ModelRendererTurbo(this, 2769, 113, textureX, textureY); // Box 377
		tailDoorOpenModel[2] = new ModelRendererTurbo(this, 1153, 129, textureX, textureY); // Box 378
		tailDoorOpenModel[3] = new ModelRendererTurbo(this, 1345, 121, textureX, textureY); // Box 379
		tailDoorOpenModel[4] = new ModelRendererTurbo(this, 1137, 57, textureX, textureY); // Box 380
		tailDoorOpenModel[5] = new ModelRendererTurbo(this, 1161, 57, textureX, textureY); // Box 381
		tailDoorOpenModel[6] = new ModelRendererTurbo(this, 3529, 33, textureX, textureY); // Box 382
		tailDoorOpenModel[7] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 383
		tailDoorOpenModel[8] = new ModelRendererTurbo(this, 2769, 241, textureX, textureY); // Box 924
		tailDoorOpenModel[9] = new ModelRendererTurbo(this, 945, 249, textureX, textureY); // Box 925
		tailDoorOpenModel[10] = new ModelRendererTurbo(this, 1145, 249, textureX, textureY); // Box 926
		tailDoorOpenModel[11] = new ModelRendererTurbo(this, 1681, 217, textureX, textureY); // Box 927
		tailDoorOpenModel[12] = new ModelRendererTurbo(this, 3937, 209, textureX, textureY); // Box 928
		tailDoorOpenModel[13] = new ModelRendererTurbo(this, 3105, 129, textureX, textureY); // Box 929
		tailDoorOpenModel[14] = new ModelRendererTurbo(this, 3633, 217, textureX, textureY); // Box 930
		tailDoorOpenModel[15] = new ModelRendererTurbo(this, 3217, 233, textureX, textureY); // Box 935

		tailDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 23, 9, 26, 0F,0F, 0F, 0F, -8F, -13F, 0F, -7F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -20F, -3F, -8F, 0F, -3F, -8F); // Box 374
		tailDoorOpenModel[0].setRotationPoint(71F, -17F, 5F);

		tailDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 88, 3, 9, 0F,0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 12F, 0F, 0F, -1F, 0F); // Box 377
		tailDoorOpenModel[1].setRotationPoint(71F, -8F, 5F);

		tailDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -13F, 4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 11F, 4F, 0F, -3F, 0F); // Box 378
		tailDoorOpenModel[2].setRotationPoint(71F, -9F, 14F);

		tailDoorOpenModel[3].addShapeBox(0F, 0F, 0F, 88, 3, 7, 0F,0F, 0F, 0F, 0F, -16F, -4F, 0F, -16F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 14F, -4F, 0F, 14F, 1F, 0F, -5F, 0F); // Box 379
		tailDoorOpenModel[3].setRotationPoint(71F, -12F, 22F);

		tailDoorOpenModel[4].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 380
		tailDoorOpenModel[4].setRotationPoint(159F, 6F, 5F);

		tailDoorOpenModel[5].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 381
		tailDoorOpenModel[5].setRotationPoint(159F, 6F, 14F);

		tailDoorOpenModel[6].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 2F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 382
		tailDoorOpenModel[6].setRotationPoint(159F, 6F, 26F);

		tailDoorOpenModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 6F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F); // Box 383
		tailDoorOpenModel[7].setRotationPoint(159F, -52F, 5F);

		tailDoorOpenModel[8].addShapeBox(0F, 0F, 0F, 88, 3, 9, 0F,0F, 1F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 12F, 0F, 0F, 13F, 0F, 0F, 0F, 0F); // Box 924
		tailDoorOpenModel[8].setRotationPoint(71F, -8F, -4F);

		tailDoorOpenModel[9].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F,0F, 3F, 0F, 0F, -13F, 4F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 11F, 4F, 0F, 13F, 0F, 0F, 0F, 0F); // Box 925
		tailDoorOpenModel[9].setRotationPoint(71F, -9F, -12F);

		tailDoorOpenModel[10].addShapeBox(0F, 0F, 0F, 88, 3, 7, 0F,0F, 5F, 0F, 0F, -16F, 1F, 0F, -16F, -4F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 14F, 1F, 0F, 14F, -4F, 0F, 0F, 0F); // Box 926
		tailDoorOpenModel[10].setRotationPoint(71F, -12F, -19F);

		tailDoorOpenModel[11].addShapeBox(0F, 0F, 0F, 8, 2, 9, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		tailDoorOpenModel[11].setRotationPoint(159F, 6F, -4F);

		tailDoorOpenModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 2F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 928
		tailDoorOpenModel[12].setRotationPoint(159F, 6F, -16F);

		tailDoorOpenModel[13].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 2F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 929
		tailDoorOpenModel[13].setRotationPoint(159F, 6F, -20F);

		tailDoorOpenModel[14].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 930
		tailDoorOpenModel[14].setRotationPoint(159F, -52F, -16F);

		tailDoorOpenModel[15].addShapeBox(0F, 0F, 0F, 23, 9, 26, 0F,0F, 0F, 0F, -7F, -8F, -8F, -8F, -13F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, -20F, -3F, -8F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 935
		tailDoorOpenModel[15].setRotationPoint(71F, -17F, -21F);
	}

	private void inittailDoorCloseModel_1()
	{
		tailDoorCloseModel[0] = new ModelRendererTurbo(this, 1249, 49, textureX, textureY); // Box 11
		tailDoorCloseModel[1] = new ModelRendererTurbo(this, 1377, 49, textureX, textureY); // Box 10
		tailDoorCloseModel[2] = new ModelRendererTurbo(this, 1153, 97, textureX, textureY); // Box 0
		tailDoorCloseModel[3] = new ModelRendererTurbo(this, 1153, 113, textureX, textureY); // Box 372
		tailDoorCloseModel[4] = new ModelRendererTurbo(this, 2569, 113, textureX, textureY); // Box 373
		tailDoorCloseModel[5] = new ModelRendererTurbo(this, 3993, 121, textureX, textureY); // Box 496
		tailDoorCloseModel[6] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 918
		tailDoorCloseModel[7] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 931
		tailDoorCloseModel[8] = new ModelRendererTurbo(this, 1985, 249, textureX, textureY); // Box 932
		tailDoorCloseModel[9] = new ModelRendererTurbo(this, 1681, 257, textureX, textureY); // Box 933
		tailDoorCloseModel[10] = new ModelRendererTurbo(this, 2577, 257, textureX, textureY); // Box 934
		tailDoorCloseModel[11] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Box 936

		tailDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 11F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -11F, 0F, 0F, -2F, 0F); // Box 11
		tailDoorCloseModel[0].setRotationPoint(159F, -43F, 5F);

		tailDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 10F, -1.4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -10.5F, -1.05F, 0F, -2F, 0F); // Box 10
		tailDoorCloseModel[1].setRotationPoint(159F, -45F, 26F);

		tailDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 88, 3, 7, 0F,0F, 0F, 0F, 0F, 33F, -4F, 0F, 35F, 1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -34F, -4F, 0F, -36F, 1F, 0F, -5F, 0F); // Box 0
		tailDoorCloseModel[2].setRotationPoint(71F, -12F, 22F);

		tailDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F,0F, 0F, 0F, 0F, 35F, 0F, 0F, 36F, 4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -35.75F, 0F, 0F, -37F, 4F, 0F, -3F, 0F); // Box 372
		tailDoorCloseModel[3].setRotationPoint(71F, -9F, 14F);

		tailDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 88, 3, 9, 0F,0F, 0F, 0F, 0F, 35F, 0F, 0F, 36F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -36F, 0F, 0F, -36.875F, 0F, 0F, -1F, 0F); // Box 373
		tailDoorCloseModel[4].setRotationPoint(71F, -8F, 5F);

		tailDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 23, 9, 26, 0F,0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -8F, -20F, -3F, -8F, -18F, 0F, 0F, 0F, 0F, 0F); // Box 496
		tailDoorCloseModel[5].setRotationPoint(71F, -17F, -21F);

		tailDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 20, 2, 4, 0F,0F, 2F, 0F, 0F, 10F, -1.4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10.5F, -1.05F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 918
		tailDoorCloseModel[6].setRotationPoint(159F, -45F, -20F);

		tailDoorCloseModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 2F, 0F, 0F, 11F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 931
		tailDoorCloseModel[7].setRotationPoint(159F, -43F, -16F);

		tailDoorCloseModel[8].addShapeBox(0F, 0F, 0F, 88, 3, 7, 0F,0F, 5F, 0F, 0F, 35F, 1F, 0F, 33F, -4F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -36F, 1F, 0F, -34F, -4F, 0F, 0F, 0F); // Box 932
		tailDoorCloseModel[8].setRotationPoint(71F, -12F, -19F);

		tailDoorCloseModel[9].addShapeBox(0F, 0F, 0F, 88, 3, 8, 0F,0F, 3F, 0F, 0F, 36F, 4F, 0F, 35F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -37F, 4F, 0F, -35.75F, 0F, 0F, 0F, 0F); // Box 933
		tailDoorCloseModel[9].setRotationPoint(71F, -9F, -12F);

		tailDoorCloseModel[10].addShapeBox(0F, 0F, 0F, 88, 3, 9, 0F,0F, 1F, 0F, 0F, 36F, 0F, 0F, 35F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -36.875F, 0F, 0F, -36F, 0F, 0F, 0F, 0F); // Box 934
		tailDoorCloseModel[10].setRotationPoint(71F, -8F, -4F);

		tailDoorCloseModel[11].addShapeBox(0F, 0F, 0F, 23, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -20F, -3F, -8F, 0F, -3F, -8F); // Box 936
		tailDoorCloseModel[11].setRotationPoint(71F, -17F, 5F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][4];
		propellerModels[0] = makeProp1(-82F, -57F, 85F);
		propellerModels[1] = makeProp2(-81F, -57F, 169F);
		propellerModels[2] = makeProp3(-82F, -57F, -75F);
		propellerModels[3] = makeProp4(-81F, -57F, -158F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
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
		prop[0] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
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
		prop[0] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
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
		prop[0] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 20, 450, textureX, textureY);
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

	private void initGuns() {
	}
	{

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[0];

		gun_4_Model[1] = new ModelRendererTurbo[27];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 21, 372, textureX, textureY); // Box 0
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 53, 372, textureX, textureY); // Box 3
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 165, 372, textureX, textureY); // Box 4
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 205, 372, textureX, textureY); // Box 5
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 245, 372, textureX, textureY); // Box 6
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 285, 372, textureX, textureY); // Box 7
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 293, 372, textureX, textureY); // Box 8
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 325, 372, textureX, textureY); // Box 9
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 357, 372, textureX, textureY); // Box 10
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 469, 372, textureX, textureY); // Box 12
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 477, 372, textureX, textureY); // Box 13
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 485, 372, textureX, textureY); // Box 14
		gun_4_Model[1][12] = new ModelRendererTurbo(this, 493, 372, textureX, textureY); // Box 15
		gun_4_Model[1][13] = new ModelRendererTurbo(this, 501, 372, textureX, textureY); // Box 0
		gun_4_Model[1][14] = new ModelRendererTurbo(this, 557, 372, textureX, textureY); // Box 2
		gun_4_Model[1][15] = new ModelRendererTurbo(this, 613, 372, textureX, textureY); // Box 3
		gun_4_Model[1][16] = new ModelRendererTurbo(this, 661, 372, textureX, textureY); // Box 4
		gun_4_Model[1][17] = new ModelRendererTurbo(this, 685, 372, textureX, textureY); // Box 5
		gun_4_Model[1][18] = new ModelRendererTurbo(this, 965, 372, textureX, textureY); // Box 25
		gun_4_Model[1][19] = new ModelRendererTurbo(this, 1077, 372, textureX, textureY); // Box 26
		gun_4_Model[1][20] = new ModelRendererTurbo(this, 1101, 372, textureX, textureY); // Box 27
		gun_4_Model[1][21] = new ModelRendererTurbo(this, 1125, 372, textureX, textureY); // Box 28
		gun_4_Model[1][22] = new ModelRendererTurbo(this, 1149, 372, textureX, textureY); // Box 30
		gun_4_Model[1][23] = new ModelRendererTurbo(this, 317, 372, textureX, textureY); // Box 31
		gun_4_Model[1][24] = new ModelRendererTurbo(this, 741, 372, textureX, textureY); // Box 32
		gun_4_Model[1][25] = new ModelRendererTurbo(this, 1181, 372, textureX, textureY); // Box 33
		gun_4_Model[1][26] = new ModelRendererTurbo(this, 1189, 372, textureX, textureY); // Box 34

		gun_4_Model[1][0].addShapeBox(-19F, -2F, 2F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0

		gun_4_Model[1][1].addShapeBox(-20F, -1F, 1F, 51, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 3

		gun_4_Model[1][2].addShapeBox(31F, -2F, -0.5F, 16, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_4_Model[1][3].addShapeBox(31F, -2F, -2.5F, 16, 5, 2, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5

		gun_4_Model[1][4].addShapeBox(31F, -2F, 1.5F, 16, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 6

		gun_4_Model[1][5].addBox(20F, -2F, 0F, 1, 1, 1, 0F); // Box 7

		gun_4_Model[1][6].addShapeBox(9F, 1F, 2F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_4_Model[1][7].addShapeBox(9F, 1F, -2F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_4_Model[1][8].addShapeBox(-20F, -1F, -1F, 51, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_4_Model[1][9].addShapeBox(12F, -2F, -2F, 2, 3, 1, 0F,0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12

		gun_4_Model[1][10].addShapeBox(12F, -2F, 2F, 2, 3, 1, 0F,0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_4_Model[1][11].addShapeBox(20F, -1F, 2F, 1, 2, 1, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_4_Model[1][12].addShapeBox(20F, -1F, -2F, 1, 2, 1, 0F,0F, 1F, -2F, 0F, 1F, -2F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_4_Model[1][13].addShapeBox(-13F, -1.7F, 1F, 25, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 0

		gun_4_Model[1][14].addShapeBox(-13F, -1.7F, 0.5F, 25, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2

		gun_4_Model[1][15].addShapeBox(-13F, -1.7F, 1.5F, 25, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 3

		gun_4_Model[1][16].addShapeBox(3F, 1F, -2F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_4_Model[1][17].addShapeBox(3F, 2F, -2F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5

		gun_4_Model[1][18].addShapeBox(-20F, -1F, 0F, 51, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_4_Model[1][19].addShapeBox(-28F, 1F, -1F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26

		gun_4_Model[1][20].addShapeBox(-28F, 0F, -1F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27

		gun_4_Model[1][21].addShapeBox(-28F, 0F, 1F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28

		gun_4_Model[1][22].addShapeBox(-19F, -2F, -2F, 12, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30

		gun_4_Model[1][23].addShapeBox(-19F, -2F, -5F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 31

		gun_4_Model[1][24].addShapeBox(-19F, -2F, 3F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 32

		gun_4_Model[1][25].addShapeBox(-19F, -3F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_4_Model[1][26].addShapeBox(-19F, -3F, 5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(54F, -24F, -22F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[19];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 709, 372, textureX, textureY); // Box 8
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 749, 372, textureX, textureY); // Box 8
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 789, 372, textureX, textureY); // Box 8
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 797, 372, textureX, textureY); // Box 8
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 805, 372, textureX, textureY); // Box 8
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 813, 372, textureX, textureY); // Box 8
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 821, 372, textureX, textureY); // Box 8
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 829, 372, textureX, textureY); // Box 8
		gun_4_Model[2][8] = new ModelRendererTurbo(this, 837, 372, textureX, textureY); // Box 8
		gun_4_Model[2][9] = new ModelRendererTurbo(this, 877, 372, textureX, textureY); // Box 8
		gun_4_Model[2][10] = new ModelRendererTurbo(this, 885, 372, textureX, textureY); // Box 8
		gun_4_Model[2][11] = new ModelRendererTurbo(this, 893, 372, textureX, textureY); // Box 8
		gun_4_Model[2][12] = new ModelRendererTurbo(this, 901, 372, textureX, textureY); // Box 8
		gun_4_Model[2][13] = new ModelRendererTurbo(this, 941, 372, textureX, textureY); // Box 8
		gun_4_Model[2][14] = new ModelRendererTurbo(this, 949, 372, textureX, textureY); // Box 8
		gun_4_Model[2][15] = new ModelRendererTurbo(this, 957, 372, textureX, textureY); // Box 8
		gun_4_Model[2][16] = new ModelRendererTurbo(this, 37, 372, textureX, textureY); // Box 8
		gun_4_Model[2][17] = new ModelRendererTurbo(this, 1197, 372, textureX, textureY); // Box 8
		gun_4_Model[2][18] = new ModelRendererTurbo(this, 1229, 372, textureX, textureY); // Box 8

		gun_4_Model[2][0].addBox(-36F, -5F, -5F, 15, 1, 1, 0F); // Box 8

		gun_4_Model[2][1].addBox(-36F, 4F, -5F, 15, 1, 1, 0F); // Box 8

		gun_4_Model[2][2].addShapeBox(-21F, -5F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 8

		gun_4_Model[2][3].addShapeBox(-38F, -5F, -5F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 8

		gun_4_Model[2][4].addShapeBox(-38F, 4F, -5F, 2, 1, 1, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 8

		gun_4_Model[2][5].addShapeBox(-21F, 4F, -5F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 8

		gun_4_Model[2][6].addBox(-38F, -3F, -5F, 1, 6, 1, 0F); // Box 8

		gun_4_Model[2][7].addBox(-20F, -3F, -5F, 1, 6, 1, 0F); // Box 8

		gun_4_Model[2][8].addBox(-36F, -5F, 5F, 15, 1, 1, 0F); // Box 8

		gun_4_Model[2][9].addShapeBox(-38F, -5F, 5F, 2, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 8

		gun_4_Model[2][10].addBox(-38F, -3F, 5F, 1, 6, 1, 0F); // Box 8

		gun_4_Model[2][11].addShapeBox(-38F, 4F, 5F, 2, 1, 1, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 8

		gun_4_Model[2][12].addBox(-36F, 4F, 5F, 15, 1, 1, 0F); // Box 8

		gun_4_Model[2][13].addShapeBox(-21F, 4F, 5F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 8

		gun_4_Model[2][14].addBox(-20F, -3F, 5F, 1, 6, 1, 0F); // Box 8

		gun_4_Model[2][15].addShapeBox(-21F, -5F, 5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 8

		gun_4_Model[2][16].addBox(-29F, 4.5F, -5F, 1, 1, 11, 0F); // Box 8

		gun_4_Model[2][17].addShapeBox(-18F, 0F, -4F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 8

		gun_4_Model[2][18].addShapeBox(-18F, 0F, 4F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 8

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(54F, -24F, -22F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[0];

		gun_5_Model[1] = new ModelRendererTurbo[30];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 21, 401, textureX, textureY); // Box 0
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 93, 401, textureX, textureY); // Box 0
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 165, 401, textureX, textureY); // Box 0
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 237, 401, textureX, textureY); // Box 0
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 245, 401, textureX, textureY); // Box 0
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 253, 401, textureX, textureY); // Box 0
		gun_5_Model[1][6] = new ModelRendererTurbo(this, 261, 401, textureX, textureY); // Box 0
		gun_5_Model[1][7] = new ModelRendererTurbo(this, 269, 401, textureX, textureY); // Box 0
		gun_5_Model[1][8] = new ModelRendererTurbo(this, 277, 401, textureX, textureY); // Box 0
		gun_5_Model[1][9] = new ModelRendererTurbo(this, 285, 401, textureX, textureY); // Box 0
		gun_5_Model[1][10] = new ModelRendererTurbo(this, 293, 401, textureX, textureY); // Box 0
		gun_5_Model[1][11] = new ModelRendererTurbo(this, 301, 401, textureX, textureY); // Box 0
		gun_5_Model[1][12] = new ModelRendererTurbo(this, 349, 401, textureX, textureY); // Box 1
		gun_5_Model[1][13] = new ModelRendererTurbo(this, 365, 401, textureX, textureY); // Box 2
		gun_5_Model[1][14] = new ModelRendererTurbo(this, 381, 401, textureX, textureY); // Box 4
		gun_5_Model[1][15] = new ModelRendererTurbo(this, 397, 401, textureX, textureY); // Box 5
		gun_5_Model[1][16] = new ModelRendererTurbo(this, 413, 401, textureX, textureY); // Box 6
		gun_5_Model[1][17] = new ModelRendererTurbo(this, 429, 401, textureX, textureY); // Box 7
		gun_5_Model[1][18] = new ModelRendererTurbo(this, 445, 401, textureX, textureY); // Box 0
		gun_5_Model[1][19] = new ModelRendererTurbo(this, 461, 401, textureX, textureY); // Box 1
		gun_5_Model[1][20] = new ModelRendererTurbo(this, 477, 401, textureX, textureY); // Box 2
		gun_5_Model[1][21] = new ModelRendererTurbo(this, 493, 401, textureX, textureY); // Box 3
		gun_5_Model[1][22] = new ModelRendererTurbo(this, 525, 401, textureX, textureY); // Box 4
		gun_5_Model[1][23] = new ModelRendererTurbo(this, 341, 401, textureX, textureY); // Box 5
		gun_5_Model[1][24] = new ModelRendererTurbo(this, 557, 401, textureX, textureY); // Box 6
		gun_5_Model[1][25] = new ModelRendererTurbo(this, 565, 401, textureX, textureY); // Box 7
		gun_5_Model[1][26] = new ModelRendererTurbo(this, 573, 401, textureX, textureY); // Box 8
		gun_5_Model[1][27] = new ModelRendererTurbo(this, 605, 401, textureX, textureY); // Box 9
		gun_5_Model[1][28] = new ModelRendererTurbo(this, 637, 401, textureX, textureY); // Box 10
		gun_5_Model[1][29] = new ModelRendererTurbo(this, 645, 401, textureX, textureY); // Box 11

		gun_5_Model[1][0].addShapeBox(-9F, -1F, 0F, 31, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[1][1].addShapeBox(-9F, -1F, 1F, 31, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 0

		gun_5_Model[1][2].addShapeBox(-9F, -1F, -1F, 31, 2, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[1][3].addShapeBox(22F, -1F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_5_Model[1][4].addShapeBox(22F, 1F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 0

		gun_5_Model[1][5].addShapeBox(22F, -0.25F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F); // Box 0

		gun_5_Model[1][6].addShapeBox(22F, -0.25F, 0.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 0

		gun_5_Model[1][7].addShapeBox(22F, -1F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F); // Box 0

		gun_5_Model[1][8].addShapeBox(22F, -1F, -1F, 2, 1, 1, 0F,0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 0

		gun_5_Model[1][9].addShapeBox(22F, 0F, -1F, 2, 1, 1, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[1][10].addShapeBox(22F, 0F, 1F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F); // Box 0

		gun_5_Model[1][11].addBox(-20F, -2F, -2F, 17, 6, 5, 0F); // Box 0

		gun_5_Model[1][12].addBox(-19F, -3F, -1F, 6, 6, 1, 0F); // Box 1

		gun_5_Model[1][13].addBox(-19F, -3F, 1F, 6, 6, 1, 0F); // Box 2

		gun_5_Model[1][14].addShapeBox(-18F, -6F, -1F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 4

		gun_5_Model[1][15].addShapeBox(-18F, -6F, 1F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 5

		gun_5_Model[1][16].addShapeBox(-17F, -7F, 1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 6

		gun_5_Model[1][17].addShapeBox(-17F, -7F, -1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 7

		gun_5_Model[1][18].addShapeBox(-24F, -2F, -1F, 4, 3, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0

		gun_5_Model[1][19].addShapeBox(-24F, -2F, -1F, 4, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 1

		gun_5_Model[1][20].addShapeBox(-24F, -2F, 1F, 4, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 2

		gun_5_Model[1][21].addShapeBox(-16F, 0F, 3F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_5_Model[1][22].addShapeBox(-16F, -2F, 3F, 13, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_5_Model[1][23].addShapeBox(-14F, 0F, 4F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5

		gun_5_Model[1][24].addShapeBox(-14F, -1F, 4F, 2, 1, 1, 0F,-0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6

		gun_5_Model[1][25].addShapeBox(-14F, 1F, 4F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 7

		gun_5_Model[1][26].addShapeBox(-16F, 0F, -3F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_5_Model[1][27].addShapeBox(-16F, -2F, -3F, 13, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_5_Model[1][28].addShapeBox(-8F, 0F, 3F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_5_Model[1][29].addShapeBox(-8F, 0F, -3F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(31F, -23F, -24F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[1];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 1036, 430, textureX, textureY); // Box 9

		gun_6_Model[0][0].addBox(-3F, 1.75F, -1.25F, 2, 7, 2, 0F); // Box 9

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-96F, -24F, -19F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[34];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 20, 430, textureX, textureY); // Box 0
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 60, 430, textureX, textureY); // Box 0
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 100, 430, textureX, textureY); // Box 0
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 0
		gun_6_Model[1][4] = new ModelRendererTurbo(this, 180, 430, textureX, textureY); // Box 0
		gun_6_Model[1][5] = new ModelRendererTurbo(this, 220, 430, textureX, textureY); // Box 0
		gun_6_Model[1][6] = new ModelRendererTurbo(this, 260, 430, textureX, textureY); // Box 0
		gun_6_Model[1][7] = new ModelRendererTurbo(this, 300, 430, textureX, textureY); // Box 0
		gun_6_Model[1][8] = new ModelRendererTurbo(this, 340, 430, textureX, textureY); // Box 0
		gun_6_Model[1][9] = new ModelRendererTurbo(this, 380, 430, textureX, textureY); // Box 0
		gun_6_Model[1][10] = new ModelRendererTurbo(this, 420, 430, textureX, textureY); // Box 0
		gun_6_Model[1][11] = new ModelRendererTurbo(this, 460, 430, textureX, textureY); // Box 0
		gun_6_Model[1][12] = new ModelRendererTurbo(this, 500, 430, textureX, textureY); // Box 0
		gun_6_Model[1][13] = new ModelRendererTurbo(this, 540, 430, textureX, textureY); // Box 0
		gun_6_Model[1][14] = new ModelRendererTurbo(this, 580, 430, textureX, textureY); // Box 0
		gun_6_Model[1][15] = new ModelRendererTurbo(this, 620, 430, textureX, textureY); // Box 0
		gun_6_Model[1][16] = new ModelRendererTurbo(this, 660, 430, textureX, textureY); // Box 0
		gun_6_Model[1][17] = new ModelRendererTurbo(this, 700, 430, textureX, textureY); // Box 0
		gun_6_Model[1][18] = new ModelRendererTurbo(this, 740, 430, textureX, textureY); // Box 0
		gun_6_Model[1][19] = new ModelRendererTurbo(this, 780, 430, textureX, textureY); // Box 0
		gun_6_Model[1][20] = new ModelRendererTurbo(this, 796, 430, textureX, textureY); // Box 0
		gun_6_Model[1][21] = new ModelRendererTurbo(this, 812, 430, textureX, textureY); // Box 0
		gun_6_Model[1][22] = new ModelRendererTurbo(this, 828, 430, textureX, textureY); // Box 0
		gun_6_Model[1][23] = new ModelRendererTurbo(this, 844, 430, textureX, textureY); // Box 0
		gun_6_Model[1][24] = new ModelRendererTurbo(this, 860, 430, textureX, textureY); // Box 0
		gun_6_Model[1][25] = new ModelRendererTurbo(this, 892, 430, textureX, textureY); // Box 0
		gun_6_Model[1][26] = new ModelRendererTurbo(this, 908, 430, textureX, textureY); // Box 0
		gun_6_Model[1][27] = new ModelRendererTurbo(this, 940, 430, textureX, textureY); // Box 0
		gun_6_Model[1][28] = new ModelRendererTurbo(this, 972, 430, textureX, textureY); // Box 0
		gun_6_Model[1][29] = new ModelRendererTurbo(this, 988, 430, textureX, textureY); // Box 0
		gun_6_Model[1][30] = new ModelRendererTurbo(this, 1004, 430, textureX, textureY); // Box 0
		gun_6_Model[1][31] = new ModelRendererTurbo(this, 1020, 430, textureX, textureY); // Box 0
		gun_6_Model[1][32] = new ModelRendererTurbo(this, 884, 430, textureX, textureY); // Box 0
		gun_6_Model[1][33] = new ModelRendererTurbo(this, 788, 430, textureX, textureY); // Box 0

		gun_6_Model[1][0].addShapeBox(0F, -0.1F, -1F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_6_Model[1][1].addShapeBox(0F, -0.1F, -1.5F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_6_Model[1][2].addShapeBox(0F, -0.1F, -1.25F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_6_Model[1][3].addShapeBox(0F, 0.4F, -0.5F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_6_Model[1][4].addShapeBox(0F, 0.4F, -0.75F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_6_Model[1][5].addShapeBox(0F, 0.4F, -0.25F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_6_Model[1][6].addShapeBox(0F, -0.1F, 0.25F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_6_Model[1][7].addShapeBox(0F, -0.1F, 0.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_6_Model[1][8].addShapeBox(0F, -0.1F, 0F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_6_Model[1][9].addShapeBox(0F, -1F, 0.25F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_6_Model[1][10].addShapeBox(0F, -1F, 0.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_6_Model[1][11].addShapeBox(0F, -1F, -1.5F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_6_Model[1][12].addShapeBox(0F, -1F, -1F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_6_Model[1][13].addShapeBox(0F, -1F, -1.25F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_6_Model[1][14].addShapeBox(0F, -1.4F, -0.75F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_6_Model[1][15].addShapeBox(0F, -1.4F, -0.25F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_6_Model[1][16].addShapeBox(0F, -1.4F, -0.5F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_6_Model[1][17].addShapeBox(0F, -1F, 0F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_6_Model[1][18].addShapeBox(0F, -0.25F, -0.25F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 0

		gun_6_Model[1][19].addShapeBox(17F, -1.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 0

		gun_6_Model[1][20].addShapeBox(17F, 0.25F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 0

		gun_6_Model[1][21].addShapeBox(17F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 0

		gun_6_Model[1][22].addShapeBox(15F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 0

		gun_6_Model[1][23].addShapeBox(15F, 0.25F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 0

		gun_6_Model[1][24].addShapeBox(-7F, -2F, -2F, 9, 1, 4, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 0

		gun_6_Model[1][25].addShapeBox(15F, -1.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 0

		gun_6_Model[1][26].addShapeBox(-7F, -1F, -2F, 9, 2, 4, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 0

		gun_6_Model[1][27].addShapeBox(-7F, 0.75F, -2F, 9, 1, 4, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 0

		gun_6_Model[1][28].addShapeBox(5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 0

		gun_6_Model[1][29].addShapeBox(5F, -1.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 0

		gun_6_Model[1][30].addShapeBox(5F, 0.25F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 0

		gun_6_Model[1][31].addShapeBox(-3F, -0.5F, 1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 0

		gun_6_Model[1][32].addShapeBox(-3F, 1.5F, 4.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 0

		gun_6_Model[1][33].addShapeBox(-3F, 6.5F, 6F, 1, 1, 1, 0F,0F, 2F, -0.5F, 0.5F, 2F, -0.5F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 0

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-96F, -24F, -19F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[1];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 1036, 430, textureX, textureY); // Box 9

		gun_7_Model[0][0].addBox(-3F, 1.75F, -1.25F, 2, 7, 2, 0F); // Box 9

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(-108F, -24F, -19F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[34];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 20, 430, textureX, textureY); // Box 0
		gun_7_Model[1][1] = new ModelRendererTurbo(this, 60, 430, textureX, textureY); // Box 0
		gun_7_Model[1][2] = new ModelRendererTurbo(this, 100, 430, textureX, textureY); // Box 0
		gun_7_Model[1][3] = new ModelRendererTurbo(this, 140, 430, textureX, textureY); // Box 0
		gun_7_Model[1][4] = new ModelRendererTurbo(this, 180, 430, textureX, textureY); // Box 0
		gun_7_Model[1][5] = new ModelRendererTurbo(this, 220, 430, textureX, textureY); // Box 0
		gun_7_Model[1][6] = new ModelRendererTurbo(this, 260, 430, textureX, textureY); // Box 0
		gun_7_Model[1][7] = new ModelRendererTurbo(this, 300, 430, textureX, textureY); // Box 0
		gun_7_Model[1][8] = new ModelRendererTurbo(this, 340, 430, textureX, textureY); // Box 0
		gun_7_Model[1][9] = new ModelRendererTurbo(this, 380, 430, textureX, textureY); // Box 0
		gun_7_Model[1][10] = new ModelRendererTurbo(this, 420, 430, textureX, textureY); // Box 0
		gun_7_Model[1][11] = new ModelRendererTurbo(this, 460, 430, textureX, textureY); // Box 0
		gun_7_Model[1][12] = new ModelRendererTurbo(this, 500, 430, textureX, textureY); // Box 0
		gun_7_Model[1][13] = new ModelRendererTurbo(this, 540, 430, textureX, textureY); // Box 0
		gun_7_Model[1][14] = new ModelRendererTurbo(this, 580, 430, textureX, textureY); // Box 0
		gun_7_Model[1][15] = new ModelRendererTurbo(this, 620, 430, textureX, textureY); // Box 0
		gun_7_Model[1][16] = new ModelRendererTurbo(this, 660, 430, textureX, textureY); // Box 0
		gun_7_Model[1][17] = new ModelRendererTurbo(this, 700, 430, textureX, textureY); // Box 0
		gun_7_Model[1][18] = new ModelRendererTurbo(this, 740, 430, textureX, textureY); // Box 0
		gun_7_Model[1][19] = new ModelRendererTurbo(this, 780, 430, textureX, textureY); // Box 0
		gun_7_Model[1][20] = new ModelRendererTurbo(this, 796, 430, textureX, textureY); // Box 0
		gun_7_Model[1][21] = new ModelRendererTurbo(this, 812, 430, textureX, textureY); // Box 0
		gun_7_Model[1][22] = new ModelRendererTurbo(this, 828, 430, textureX, textureY); // Box 0
		gun_7_Model[1][23] = new ModelRendererTurbo(this, 844, 430, textureX, textureY); // Box 0
		gun_7_Model[1][24] = new ModelRendererTurbo(this, 860, 430, textureX, textureY); // Box 0
		gun_7_Model[1][25] = new ModelRendererTurbo(this, 892, 430, textureX, textureY); // Box 0
		gun_7_Model[1][26] = new ModelRendererTurbo(this, 908, 430, textureX, textureY); // Box 0
		gun_7_Model[1][27] = new ModelRendererTurbo(this, 940, 430, textureX, textureY); // Box 0
		gun_7_Model[1][28] = new ModelRendererTurbo(this, 972, 430, textureX, textureY); // Box 0
		gun_7_Model[1][29] = new ModelRendererTurbo(this, 988, 430, textureX, textureY); // Box 0
		gun_7_Model[1][30] = new ModelRendererTurbo(this, 1004, 430, textureX, textureY); // Box 0
		gun_7_Model[1][31] = new ModelRendererTurbo(this, 1020, 430, textureX, textureY); // Box 0
		gun_7_Model[1][32] = new ModelRendererTurbo(this, 884, 430, textureX, textureY); // Box 0
		gun_7_Model[1][33] = new ModelRendererTurbo(this, 788, 430, textureX, textureY); // Box 0

		gun_7_Model[1][0].addShapeBox(0F, -0.1F, -1F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_7_Model[1][1].addShapeBox(0F, -0.1F, -1.5F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_7_Model[1][2].addShapeBox(0F, -0.1F, -1.25F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_7_Model[1][3].addShapeBox(0F, 0.4F, -0.5F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_7_Model[1][4].addShapeBox(0F, 0.4F, -0.75F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_7_Model[1][5].addShapeBox(0F, 0.4F, -0.25F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_7_Model[1][6].addShapeBox(0F, -0.1F, 0.25F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_7_Model[1][7].addShapeBox(0F, -0.1F, 0.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_7_Model[1][8].addShapeBox(0F, -0.1F, 0F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_7_Model[1][9].addShapeBox(0F, -1F, 0.25F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_7_Model[1][10].addShapeBox(0F, -1F, 0.5F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_7_Model[1][11].addShapeBox(0F, -1F, -1.5F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_7_Model[1][12].addShapeBox(0F, -1F, -1F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_7_Model[1][13].addShapeBox(0F, -1F, -1.25F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_7_Model[1][14].addShapeBox(0F, -1.4F, -0.75F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_7_Model[1][15].addShapeBox(0F, -1.4F, -0.25F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0

		gun_7_Model[1][16].addShapeBox(0F, -1.4F, -0.5F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 0

		gun_7_Model[1][17].addShapeBox(0F, -1F, 0F, 18, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0

		gun_7_Model[1][18].addShapeBox(0F, -0.25F, -0.25F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 0

		gun_7_Model[1][19].addShapeBox(17F, -1.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 0

		gun_7_Model[1][20].addShapeBox(17F, 0.25F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 0

		gun_7_Model[1][21].addShapeBox(17F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 0

		gun_7_Model[1][22].addShapeBox(15F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 0

		gun_7_Model[1][23].addShapeBox(15F, 0.25F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 0

		gun_7_Model[1][24].addShapeBox(-7F, -2F, -2F, 9, 1, 4, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 0

		gun_7_Model[1][25].addShapeBox(15F, -1.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 0

		gun_7_Model[1][26].addShapeBox(-7F, -1F, -2F, 9, 2, 4, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 0

		gun_7_Model[1][27].addShapeBox(-7F, 0.75F, -2F, 9, 1, 4, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 0

		gun_7_Model[1][28].addShapeBox(5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 0

		gun_7_Model[1][29].addShapeBox(5F, -1.5F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 0

		gun_7_Model[1][30].addShapeBox(5F, 0.25F, -1.5F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.5F, 0F, -1F); // Box 0

		gun_7_Model[1][31].addShapeBox(-3F, -0.5F, 1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 0

		gun_7_Model[1][32].addShapeBox(-3F, 1.5F, 4.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 2F, -0.5F, 0F, 2F, -0.5F); // Box 0

		gun_7_Model[1][33].addShapeBox(-3F, 6.5F, 6F, 1, 1, 1, 0F,0F, 2F, -0.5F, 0.5F, 2F, -0.5F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 0

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(-108F, -24F, -19F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun7", gun_7_Model);
	}
}