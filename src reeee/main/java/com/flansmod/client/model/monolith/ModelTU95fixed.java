//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.09.2016 - 13:40:19
// Last changed on: 18.09.2016 - 13:40:19

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTU95fixed extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelTU95fixed() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[169];
		tailModel = new ModelRendererTurbo[52];
		leftWingModel = new ModelRendererTurbo[64];
		rightWingModel = new ModelRendererTurbo[80];
		bodyWheelModel = new ModelRendererTurbo[15];
		leftWingWheelModel = new ModelRendererTurbo[50];
		rightWingWheelModel = new ModelRendererTurbo[51];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1249, 49, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 1729, 273, textureX, textureY); // Box 76
		bodyModel[17] = new ModelRendererTurbo(this, 1729, 289, textureX, textureY); // Box 77
		bodyModel[18] = new ModelRendererTurbo(this, 1729, 305, textureX, textureY); // Box 78
		bodyModel[19] = new ModelRendererTurbo(this, 297, 361, textureX, textureY); // Box 79
		bodyModel[20] = new ModelRendererTurbo(this, 1785, 65, textureX, textureY); // Box 82
		bodyModel[21] = new ModelRendererTurbo(this, 1777, 97, textureX, textureY); // Box 83
		bodyModel[22] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 84
		bodyModel[23] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 85
		bodyModel[24] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Box 86
		bodyModel[25] = new ModelRendererTurbo(this, 2009, 25, textureX, textureY); // Box 87
		bodyModel[26] = new ModelRendererTurbo(this, 1833, 33, textureX, textureY); // Box 88
		bodyModel[27] = new ModelRendererTurbo(this, 1833, 65, textureX, textureY); // Box 89
		bodyModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		bodyModel[29] = new ModelRendererTurbo(this, 1825, 97, textureX, textureY); // Box 91
		bodyModel[30] = new ModelRendererTurbo(this, 1905, 97, textureX, textureY); // Box 92
		bodyModel[31] = new ModelRendererTurbo(this, 1913, 129, textureX, textureY); // Box 93
		bodyModel[32] = new ModelRendererTurbo(this, 1961, 129, textureX, textureY); // Box 94
		bodyModel[33] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 95
		bodyModel[34] = new ModelRendererTurbo(this, 2025, 9, textureX, textureY); // Box 96
		bodyModel[35] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 97
		bodyModel[36] = new ModelRendererTurbo(this, 1841, 41, textureX, textureY); // Box 98
		bodyModel[37] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 99
		bodyModel[38] = new ModelRendererTurbo(this, 1985, 97, textureX, textureY); // Box 100
		bodyModel[39] = new ModelRendererTurbo(this, 1833, 73, textureX, textureY); // Box 101
		bodyModel[40] = new ModelRendererTurbo(this, 1825, 105, textureX, textureY); // Box 102
		bodyModel[41] = new ModelRendererTurbo(this, 1849, 105, textureX, textureY); // Box 104
		bodyModel[42] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 105
		bodyModel[43] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 106
		bodyModel[44] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Box 107
		bodyModel[45] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 108
		bodyModel[46] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 109
		bodyModel[47] = new ModelRendererTurbo(this, 857, 145, textureX, textureY); // Box 110
		bodyModel[48] = new ModelRendererTurbo(this, 1977, 57, textureX, textureY); // Box 111
		bodyModel[49] = new ModelRendererTurbo(this, 2009, 105, textureX, textureY); // Box 112
		bodyModel[50] = new ModelRendererTurbo(this, 1281, 113, textureX, textureY); // Box 113
		bodyModel[51] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 115
		bodyModel[52] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 116
		bodyModel[53] = new ModelRendererTurbo(this, 913, 145, textureX, textureY); // Box 117
		bodyModel[54] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 118
		bodyModel[55] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 119
		bodyModel[56] = new ModelRendererTurbo(this, 2009, 113, textureX, textureY); // Box 120
		bodyModel[57] = new ModelRendererTurbo(this, 1881, 1, textureX, textureY); // Box 121
		bodyModel[58] = new ModelRendererTurbo(this, 1073, 145, textureX, textureY); // Box 122
		bodyModel[59] = new ModelRendererTurbo(this, 1161, 145, textureX, textureY); // Box 123
		bodyModel[60] = new ModelRendererTurbo(this, 1209, 145, textureX, textureY); // Box 124
		bodyModel[61] = new ModelRendererTurbo(this, 1593, 129, textureX, textureY); // Box 125
		bodyModel[62] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 126
		bodyModel[63] = new ModelRendererTurbo(this, 1913, 145, textureX, textureY); // Box 127
		bodyModel[64] = new ModelRendererTurbo(this, 1961, 145, textureX, textureY); // Box 124
		bodyModel[65] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 125
		bodyModel[66] = new ModelRendererTurbo(this, 2009, 129, textureX, textureY); // Box 126
		bodyModel[67] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 127
		bodyModel[68] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 128
		bodyModel[69] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 129
		bodyModel[70] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 130
		bodyModel[71] = new ModelRendererTurbo(this, 1601, 137, textureX, textureY); // Box 131
		bodyModel[72] = new ModelRendererTurbo(this, 1873, 17, textureX, textureY); // Box 132
		bodyModel[73] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 134
		bodyModel[74] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 135
		bodyModel[75] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Box 136
		bodyModel[76] = new ModelRendererTurbo(this, 713, 153, textureX, textureY); // Box 137
		bodyModel[77] = new ModelRendererTurbo(this, 801, 153, textureX, textureY); // Box 138
		bodyModel[78] = new ModelRendererTurbo(this, 1249, 145, textureX, textureY); // Box 139
		bodyModel[79] = new ModelRendererTurbo(this, 1953, 153, textureX, textureY); // Box 140
		bodyModel[80] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 141
		bodyModel[81] = new ModelRendererTurbo(this, 2001, 137, textureX, textureY); // Box 142
		bodyModel[82] = new ModelRendererTurbo(this, 1121, 145, textureX, textureY); // Box 143
		bodyModel[83] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 144
		bodyModel[84] = new ModelRendererTurbo(this, 1193, 153, textureX, textureY); // Box 145
		bodyModel[85] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 146
		bodyModel[86] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 147
		bodyModel[87] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 148
		bodyModel[88] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 149
		bodyModel[89] = new ModelRendererTurbo(this, 1873, 153, textureX, textureY); // Box 150
		bodyModel[90] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 151
		bodyModel[91] = new ModelRendererTurbo(this, 1753, 17, textureX, textureY); // Box 279
		bodyModel[92] = new ModelRendererTurbo(this, 921, 161, textureX, textureY); // Box 280
		bodyModel[93] = new ModelRendererTurbo(this, 1265, 161, textureX, textureY); // Box 281
		bodyModel[94] = new ModelRendererTurbo(this, 1841, 129, textureX, textureY); // Box 282
		bodyModel[95] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 283
		bodyModel[96] = new ModelRendererTurbo(this, 2041, 17, textureX, textureY); // Box 284
		bodyModel[97] = new ModelRendererTurbo(this, 1601, 145, textureX, textureY); // Box 285
		bodyModel[98] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Box 286
		bodyModel[99] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 287
		bodyModel[100] = new ModelRendererTurbo(this, 1801, 33, textureX, textureY); // Box 288
		bodyModel[101] = new ModelRendererTurbo(this, 1601, 153, textureX, textureY); // Box 289
		bodyModel[102] = new ModelRendererTurbo(this, 1281, 145, textureX, textureY); // Box 290
		bodyModel[103] = new ModelRendererTurbo(this, 2033, 33, textureX, textureY); // Box 291
		bodyModel[104] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 292
		bodyModel[105] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 293
		bodyModel[106] = new ModelRendererTurbo(this, 2041, 25, textureX, textureY); // Box 294
		bodyModel[107] = new ModelRendererTurbo(this, 1777, 33, textureX, textureY); // Box 295
		bodyModel[108] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 296
		bodyModel[109] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 297
		bodyModel[110] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 298
		bodyModel[111] = new ModelRendererTurbo(this, 1601, 169, textureX, textureY); // Box 299
		bodyModel[112] = new ModelRendererTurbo(this, 1, 993, textureX, textureY); // Box 300
		bodyModel[113] = new ModelRendererTurbo(this, 2017, 161, textureX, textureY); // Box 301
		bodyModel[114] = new ModelRendererTurbo(this, 801, 169, textureX, textureY); // Box 302
		bodyModel[115] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 303
		bodyModel[116] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 304
		bodyModel[117] = new ModelRendererTurbo(this, 1601, 217, textureX, textureY); // Box 305
		bodyModel[118] = new ModelRendererTurbo(this, 1, 673, textureX, textureY); // Box 306
		bodyModel[119] = new ModelRendererTurbo(this, 1105, 689, textureX, textureY); // Box 307
		bodyModel[120] = new ModelRendererTurbo(this, 1121, 225, textureX, textureY); // Box 308
		bodyModel[121] = new ModelRendererTurbo(this, 2017, 233, textureX, textureY); // Box 309
		bodyModel[122] = new ModelRendererTurbo(this, 1849, 137, textureX, textureY); // Box 310
		bodyModel[123] = new ModelRendererTurbo(this, 529, 249, textureX, textureY); // Box 311
		bodyModel[124] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 312
		bodyModel[125] = new ModelRendererTurbo(this, 753, 289, textureX, textureY); // Box 313
		bodyModel[126] = new ModelRendererTurbo(this, 1873, 169, textureX, textureY); // Box 314
		bodyModel[127] = new ModelRendererTurbo(this, 529, 209, textureX, textureY); // Box 315
		bodyModel[128] = new ModelRendererTurbo(this, 1849, 161, textureX, textureY); // Box 316
		bodyModel[129] = new ModelRendererTurbo(this, 529, 169, textureX, textureY); // Box 317
		bodyModel[130] = new ModelRendererTurbo(this, 1249, 441, textureX, textureY); // Box 318
		bodyModel[131] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 319
		bodyModel[132] = new ModelRendererTurbo(this, 1241, 49, textureX, textureY); // Box 320
		bodyModel[133] = new ModelRendererTurbo(this, 2017, 57, textureX, textureY); // Box 321
		bodyModel[134] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 322
		bodyModel[135] = new ModelRendererTurbo(this, 945, 273, textureX, textureY); // Box 323
		bodyModel[136] = new ModelRendererTurbo(this, 761, 161, textureX, textureY); // Box 324
		bodyModel[137] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Box 325
		bodyModel[138] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 326
		bodyModel[139] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 327
		bodyModel[140] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 328
		bodyModel[141] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box 329
		bodyModel[142] = new ModelRendererTurbo(this, 1873, 129, textureX, textureY); // Box 330
		bodyModel[143] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Box 331
		bodyModel[144] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 332
		bodyModel[145] = new ModelRendererTurbo(this, 969, 161, textureX, textureY); // Box 333
		bodyModel[146] = new ModelRendererTurbo(this, 1129, 161, textureX, textureY); // Box 334
		bodyModel[147] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box 336
		bodyModel[148] = new ModelRendererTurbo(this, 1865, 33, textureX, textureY); // Box 337
		bodyModel[149] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 338
		bodyModel[150] = new ModelRendererTurbo(this, 1777, 65, textureX, textureY); // Box 339
		bodyModel[151] = new ModelRendererTurbo(this, 1985, 65, textureX, textureY); // Box 340
		bodyModel[152] = new ModelRendererTurbo(this, 1993, 65, textureX, textureY); // Box 341
		bodyModel[153] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 342
		bodyModel[154] = new ModelRendererTurbo(this, 2025, 65, textureX, textureY); // Box 343
		bodyModel[155] = new ModelRendererTurbo(this, 1857, 73, textureX, textureY); // Box 344
		bodyModel[156] = new ModelRendererTurbo(this, 1753, 81, textureX, textureY); // Box 345
		bodyModel[157] = new ModelRendererTurbo(this, 1161, 161, textureX, textureY); // Box 346
		bodyModel[158] = new ModelRendererTurbo(this, 2025, 81, textureX, textureY); // Box 347
		bodyModel[159] = new ModelRendererTurbo(this, 1897, 105, textureX, textureY); // Box 348
		bodyModel[160] = new ModelRendererTurbo(this, 1953, 105, textureX, textureY); // Box 349
		bodyModel[161] = new ModelRendererTurbo(this, 1961, 121, textureX, textureY); // Box 350
		bodyModel[162] = new ModelRendererTurbo(this, 1985, 105, textureX, textureY); // Box 351
		bodyModel[163] = new ModelRendererTurbo(this, 1873, 25, textureX, textureY); // Box 352
		bodyModel[164] = new ModelRendererTurbo(this, 1969, 121, textureX, textureY); // Box 353
		bodyModel[165] = new ModelRendererTurbo(this, 2025, 121, textureX, textureY); // Box 354
		bodyModel[166] = new ModelRendererTurbo(this, 1297, 129, textureX, textureY); // Box 355
		bodyModel[167] = new ModelRendererTurbo(this, 342, 1198, textureX, textureY); // Box 477
		bodyModel[168] = new ModelRendererTurbo(this, 342, 1198, textureX, textureY); // Box 480

		bodyModel[0].addShapeBox(0F, 0F, 0F, 439, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-279F, -87F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 430, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F); // Box 1
		bodyModel[1].setRotationPoint(-270F, -85F, 10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 430, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 2
		bodyModel[2].setRotationPoint(-270F, -79F, 18F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 439, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 3
		bodyModel[3].setRotationPoint(-279F, -71F, 24F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 439, 10, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-279F, -60F, 24F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 439, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 5F, 0F, -1F, 5F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 5
		bodyModel[5].setRotationPoint(-279F, -50F, 24F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 300, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-279F, -36F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 300, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-279F, -34F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 439, 1, 10, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-279F, -87F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 430, 1, 9, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-270F, -85F, -19F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 430, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 10
		bodyModel[10].setRotationPoint(-270F, -79F, -19F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 439, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 11
		bodyModel[11].setRotationPoint(-279F, -71F, -25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 439, 10, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-279F, -60F, -25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 439, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 5F, 0F, -1F, 5F); // Box 13
		bodyModel[13].setRotationPoint(-279F, -50F, -25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 300, 1, 9, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-279F, -36F, -19F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 300, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-279F, -34F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 139, 1, 9, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[16].setRotationPoint(21F, -36F, -19F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 139, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[17].setRotationPoint(21F, -34F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 139, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 78
		bodyModel[18].setRotationPoint(21F, -36F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 139, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 79
		bodyModel[19].setRotationPoint(21F, -34F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 11, 1, 0F,0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 82
		bodyModel[20].setRotationPoint(-299F, -71F, -25F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 1F, -5F); // Box 83
		bodyModel[21].setRotationPoint(-318F, -69F, -17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 69, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[22].setRotationPoint(-376F, -76F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 69, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 85
		bodyModel[23].setRotationPoint(-376F, -76F, 1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 69, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[24].setRotationPoint(-376F, -76F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[25].setRotationPoint(-387F, -75F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[26].setRotationPoint(-387F, -75F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 89
		bodyModel[27].setRotationPoint(-387F, -75F, 1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 90
		bodyModel[28].setRotationPoint(-389F, -75F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 37, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[29].setRotationPoint(-344F, -73F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 23, 7, 1, 0F,0F, 0F, 0F, 0F, 4F, 6F, 0F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 11F, 0F, -1F, -11F, 0F, 0F, -3F); // Box 92
		bodyModel[30].setRotationPoint(-341F, -65F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 20, 11, 1, 0F,0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 93
		bodyModel[31].setRotationPoint(-299F, -71F, 24F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 1F, 5F); // Box 94
		bodyModel[32].setRotationPoint(-318F, -69F, 16F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 23, 7, 1, 0F,0F, 0F, 0F, 0F, 4F, -6F, 0F, 4F, 6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -11F, 0F, -1F, 11F, 0F, 0F, 3F); // Box 95
		bodyModel[33].setRotationPoint(-341F, -65F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 3F, 5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 8F, 0F, -1F, -8F, 0F, 0F, -3F); // Box 96
		bodyModel[34].setRotationPoint(-350F, -62F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, -5F, 0F, 6F, 5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -2F, -8F, 0F, -2F, 8F, 0F, -1F, -1F); // Box 97
		bodyModel[35].setRotationPoint(-354F, -56F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -8F, 0F, -1F, 8F, 0F, 0F, 3F); // Box 98
		bodyModel[36].setRotationPoint(-350F, -62F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 6F, 5F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 8F, 0F, -2F, -8F, 0F, -1F, 0F); // Box 99
		bodyModel[37].setRotationPoint(-354F, -56F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,-10F, -1F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, -10F, -1F, 2F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 2F, 0F); // Box 100
		bodyModel[38].setRotationPoint(-299F, -74F, -22F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,1F, 3F, -15F, 0F, -1F, -2F, 0F, -1F, 2F, 1F, 2F, 14F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 2F, 0F, 0F, 0F); // Box 101
		bodyModel[39].setRotationPoint(-299F, -74F, -22F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,1F, 2F, 14F, 0F, -1F, 2F, 0F, -1F, -2F, 1F, 3F, -15F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 102
		bodyModel[40].setRotationPoint(-299F, -74F, 21F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,-10F, -1F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, -10F, -1F, -2F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 2F, 0F); // Box 104
		bodyModel[41].setRotationPoint(-299F, -74F, 21F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 18, 1, 12, 0F,0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F); // Box 105
		bodyModel[42].setRotationPoint(-318F, -75F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 0F, 0F, 0F, 2F, -1F, 1F, -6F, 6F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, -2F, -1F, 1F, 5F, 5F, 0F, 5F, 0F); // Box 106
		bodyModel[43].setRotationPoint(-318F, -75F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, -6F, 1F, 1F, -6F, 6F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 5F, 0F, 1F, 5F, 5F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 107
		bodyModel[44].setRotationPoint(-318F, -75F, -16F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, 0F, 0F, 0F, 5F, 3F, 0F, 5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 3F, 0F, -5F, 3F, 0F, 0F, 0F); // Box 108
		bodyModel[45].setRotationPoint(-341F, -70F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,0F, 0F, 0F, 0F, 5F, 3F, 0F, 4F, -4F, 0F, -1F, -1F, 0F, 0F, 8F, 0F, -4F, 14F, 0F, -4F, -14F, 0F, 0F, -8F); // Box 109
		bodyModel[46].setRotationPoint(-341F, -70F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,0F, -1F, -1F, 0F, 4F, -4F, 0F, 5F, 3F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -4F, -14F, 0F, -4F, 14F, 0F, 0F, 8F); // Box 110
		bodyModel[47].setRotationPoint(-341F, -70F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, 0F, -1F, 0F, 4F, 2F, 0F, 4F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, -1F); // Box 111
		bodyModel[48].setRotationPoint(-350F, -66F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 4F, 3F, 0F, 3F, -4F, 0F, -1F, -1F, 0F, 0F, 6F, 0F, -3F, 11F, 0F, -3F, -11F, 0F, 0F, -6F); // Box 112
		bodyModel[49].setRotationPoint(-350F, -66F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -1F, -1F, 0F, 3F, -4F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, -11F, 0F, -3F, 11F, 0F, 0F, 6F); // Box 113
		bodyModel[50].setRotationPoint(-350F, -66F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 10F, 0F, 0F, 6F, 5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, -7F, 4F, 0F, -1F, -1F); // Box 115
		bodyModel[51].setRotationPoint(-354F, -56F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 6F, 5F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -7F, 4F, 0F, -10F, 0F, 0F, -1F, 0F); // Box 116
		bodyModel[52].setRotationPoint(-354F, -56F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 20, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 117
		bodyModel[53].setRotationPoint(-299F, -60F, -25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, 1F); // Box 118
		bodyModel[54].setRotationPoint(-318F, -59F, -22F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,0F, 0F, 0F, 0F, 1F, 8F, 0F, 1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 7F, 0F, 1F, -7F, 0F, 0F, 0F); // Box 119
		bodyModel[55].setRotationPoint(-341F, -58F, -14F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 120
		bodyModel[56].setRotationPoint(-350F, -57F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, -8F, 0F, 1F, 8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -1F); // Box 121
		bodyModel[57].setRotationPoint(-354F, -56F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 20, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 122
		bodyModel[58].setRotationPoint(-299F, -60F, 24F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 19, 7, 1, 0F,0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, -1F); // Box 123
		bodyModel[59].setRotationPoint(-318F, -59F, 21F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,0F, 0F, 0F, 0F, 1F, -8F, 0F, 1F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, 1F, 7F, 0F, 0F, 0F); // Box 124
		bodyModel[60].setRotationPoint(-341F, -58F, 13F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 125
		bodyModel[61].setRotationPoint(-350F, -57F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -1F, 0F, 1F, 8F, 0F, 1F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 126
		bodyModel[62].setRotationPoint(-354F, -56F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, -2F, 0F, 0F, -6F, 0F, -1F, 5F, 0F, -5F, 1F); // Box 127
		bodyModel[63].setRotationPoint(-299F, -50F, -25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 2F, 0F, 1F, -3F, 0F, -1F, -1F); // Box 124
		bodyModel[64].setRotationPoint(-318F, -52F, -21F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 7F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 8F, 0F, 0F, -8F, 0F, -1F, -2F); // Box 125
		bodyModel[65].setRotationPoint(-341F, -53F, -14F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 7F, 0F, -1F, -7F, 1F, -1F, 0F); // Box 126
		bodyModel[66].setRotationPoint(-350F, -53F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 1F, 8F, -1F, 0F, -8F, 1F, -1F, 0F); // Box 127
		bodyModel[67].setRotationPoint(-354F, -53F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 20, 9, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, 1F, 0F, -1F, 5F, 0F, 0F, -6F, 0F, -4F, -2F); // Box 128
		bodyModel[68].setRotationPoint(-299F, -50F, 24F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 19, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -3F, 0F, 2F, 2F, 0F, 0F, 1F); // Box 129
		bodyModel[69].setRotationPoint(-318F, -52F, 20F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 23, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 7F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -8F, 0F, 1F, 8F, 0F, 0F, 2F); // Box 130
		bodyModel[70].setRotationPoint(-341F, -53F, 13F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 7F, 2F, 0F, 0F); // Box 131
		bodyModel[71].setRotationPoint(-350F, -53F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F, -1F, 1F, -1F, 0F, -1F, 0F, -8F, -2F, 1F, 8F, 2F, 0F, -1F); // Box 132
		bodyModel[72].setRotationPoint(-354F, -53F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 20, 1, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 134
		bodyModel[73].setRotationPoint(-299F, -34F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 20, 1, 10, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[74].setRotationPoint(-299F, -34F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 19, 1, 10, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 136
		bodyModel[75].setRotationPoint(-318F, -35F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 19, 1, 10, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 137
		bodyModel[76].setRotationPoint(-318F, -35F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 23, 1, 10, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 138
		bodyModel[77].setRotationPoint(-341F, -39F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 2F, -3F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -2F, -3F); // Box 139
		bodyModel[78].setRotationPoint(-351F, -44F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 23, 1, 10, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -1F, 0F); // Box 140
		bodyModel[79].setRotationPoint(-341F, -39F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F,0F, 2F, -3F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F, -3F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, -1F, 0F); // Box 141
		bodyModel[80].setRotationPoint(-351F, -44F, -10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, -4F, -1F, 1F, 1F, 0F, 0F, 0F, 5F, 0F, 0F, 4F, 0F, -3F, 1F, 2F); // Box 142
		bodyModel[81].setRotationPoint(-355F, -50F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,-4F, -1F, 1F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, 1F, 2F, 0F, 4F, 0F, 0F, 5F, 0F, 1F, 0F, 0F); // Box 143
		bodyModel[82].setRotationPoint(-355F, -50F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 20, 1, 9, 0F,0F, 10F, 4F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[83].setRotationPoint(-299F, -36F, -19F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, 12F, 2F, 0F, 10F, 4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -12F, 3F, 0F, -10F, 4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 145
		bodyModel[84].setRotationPoint(-318F, -36F, -19F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 20, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 10F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -10F, 4F); // Box 146
		bodyModel[85].setRotationPoint(-299F, -36F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 10F, 4F, 0F, 12F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -10F, 4F, 0F, -12F, 3F); // Box 147
		bodyModel[86].setRotationPoint(-318F, -36F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 23, 1, 7, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, 8F, 4F, 0F, 9F, -2F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, -8F, 5F, 0F, -9F, -1F); // Box 148
		bodyModel[87].setRotationPoint(-341F, -40F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 23, 1, 7, 0F,0F, 9F, -2F, 0F, 8F, 4F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -9F, -1F, 0F, -8F, 5F, 0F, 3F, 0F, 0F, -1F, 0F); // Box 149
		bodyModel[88].setRotationPoint(-341F, -40F, -17F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 1F, 0F, 0F, -4F, -3F, 0F, 4F, 0F, 0F, 4F, -7F, 0F, -1F, 0F, 0F, 4F, -3F, 0F, -4F, 1F, 1F, -4F, -6F); // Box 150
		bodyModel[89].setRotationPoint(-351F, -45F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 4F, -7F, 0F, 4F, 0F, 0F, -4F, -3F, 0F, 1F, 0F, 1F, -4F, -6F, 0F, -4F, 1F, 0F, 4F, -3F, 0F, -1F, 0F); // Box 151
		bodyModel[90].setRotationPoint(-351F, -45F, -15F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, -10F); // Box 279
		bodyModel[91].setRotationPoint(-281F, -85F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,-2F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 280
		bodyModel[92].setRotationPoint(-287F, -87F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 2F, -3F); // Box 281
		bodyModel[93].setRotationPoint(-287F, -87F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[94].setRotationPoint(-281F, -79F, -19F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 3.4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0.2F, -3.4F); // Box 283
		bodyModel[95].setRotationPoint(-281F, -78F, -19F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 10F); // Box 284
		bodyModel[96].setRotationPoint(-281F, -85F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[97].setRotationPoint(-281F, -79F, 18F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.2F, -3.4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0.2F, 3.4F); // Box 286
		bodyModel[98].setRotationPoint(-281F, -78F, 18F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -6F, 0F, 3F, 6F, 1F, 0F, 0F); // Box 287
		bodyModel[99].setRotationPoint(-289F, -82F, 12F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 1F, 0F, -1F); // Box 288
		bodyModel[100].setRotationPoint(-294F, -82F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[101].setRotationPoint(-295F, -82F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,1F, 0F, 0F, 0F, -3F, 6F, 0F, -3F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 6F, 0F, 3F, -6F, 0F, 0F, 0F); // Box 290
		bodyModel[102].setRotationPoint(-289F, -82F, -13F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 291
		bodyModel[103].setRotationPoint(-294F, -82F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[104].setRotationPoint(-290F, -82F, -13F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[105].setRotationPoint(-290F, -82F, 12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 294
		bodyModel[106].setRotationPoint(-290F, -81F, 12F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 295
		bodyModel[107].setRotationPoint(-290F, -81F, -13F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 296
		bodyModel[108].setRotationPoint(-294F, -82F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, 2F, 0F, 0F, 0F); // Box 297
		bodyModel[109].setRotationPoint(-294F, -82F, 4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[110].setRotationPoint(-294F, -82F, -0.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 31, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[111].setRotationPoint(-265F, -86F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 439, 3, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[112].setRotationPoint(-279F, -55F, -25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 29, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[113].setRotationPoint(-265F, -84F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 24, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[114].setRotationPoint(-265F, -79F, 18F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 31, 10, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[115].setRotationPoint(-265F, -86F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 29, 8, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[116].setRotationPoint(-265F, -84F, -18F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 24, 8, 0F,0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[117].setRotationPoint(-265F, -79F, -26F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 17, 3, 50, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 306
		bodyModel[118].setRotationPoint(-296F, -55F, -25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 47, 3, 26, 0F,0F, 0F, -1F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, -1F); // Box 307
		bodyModel[119].setRotationPoint(-343F, -55F, -13F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 20, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[120].setRotationPoint(-308F, -75F, -6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 20, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -5.5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[121].setRotationPoint(-308F, -75F, 6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[122].setRotationPoint(-308F, -69F, 19F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 20, 13, 0F,0F, -6F, 0F, 0F, -5.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[123].setRotationPoint(-308F, -75F, -19F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 15, 3, 0F,0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[124].setRotationPoint(-308F, -69F, -22F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 11, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[125].setRotationPoint(-302F, -76F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[126].setRotationPoint(-302F, -76F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 11, 13, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[127].setRotationPoint(-302F, -76F, -21F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[128].setRotationPoint(-306F, -76F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 5, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[129].setRotationPoint(-306F, -76F, 4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 24, 11, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[130].setRotationPoint(-285F, -66F, 18F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[131].setRotationPoint(-276F, -61F, -17F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[132].setRotationPoint(-284F, -61F, -17F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[133].setRotationPoint(-284F, -61F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[134].setRotationPoint(-276F, -61F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[135].setRotationPoint(-287F, -63F, -18F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[136].setRotationPoint(-273F, -77F, -18F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[137].setRotationPoint(-281F, -67F, -18F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[138].setRotationPoint(-281F, -67F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[139].setRotationPoint(-276F, -61F, 15F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[140].setRotationPoint(-284F, -61F, 15F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[141].setRotationPoint(-284F, -61F, 8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[142].setRotationPoint(-276F, -61F, 8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 16, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[143].setRotationPoint(-287F, -63F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 14, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[144].setRotationPoint(-273F, -77F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[145].setRotationPoint(-281F, -67F, 17F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[146].setRotationPoint(-281F, -67F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[147].setRotationPoint(-297F, -71F, -13F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[148].setRotationPoint(-295F, -71F, -12.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[149].setRotationPoint(-293F, -71F, -13F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[150].setRotationPoint(-293F, -71F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[151].setRotationPoint(-293F, -73F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 341
		bodyModel[152].setRotationPoint(-293F, -70F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[153].setRotationPoint(-293F, -68F, -14F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[154].setRotationPoint(-293F, -71F, -15F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 344
		bodyModel[155].setRotationPoint(-293F, -70F, -16F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[156].setRotationPoint(-293F, -73F, -16F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[157].setRotationPoint(-297F, -71F, 11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[158].setRotationPoint(-295F, -71F, 11.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[159].setRotationPoint(-293F, -71F, 11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[160].setRotationPoint(-293F, -71F, 9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[161].setRotationPoint(-293F, -73F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 351
		bodyModel[162].setRotationPoint(-293F, -70F, 8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[163].setRotationPoint(-293F, -68F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[164].setRotationPoint(-293F, -71F, 13F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 354
		bodyModel[165].setRotationPoint(-293F, -70F, 15F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[166].setRotationPoint(-293F, -73F, 15F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 400, 200, 0, 0F,0F, 0F, 0F, -300F, 0F, 0F, -300F, 0F, 0F, 0F, 0F, 0F, 0F, -150F, 0F, -300F, -150F, 0F, -300F, -150F, 0F, 0F, -150F, 0F); // Box 477
		bodyModel[167].setRotationPoint(-260F, -85F, -26.9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 400, 200, 0, 0F,0F, 0F, 0F, -300F, 0F, 0F, -300F, 0F, 0F, 0F, 0F, 0F, 0F, -150F, 0F, -300F, -150F, 0F, -300F, -150F, 0F, 0F, -150F, 0F); // Box 480
		bodyModel[168].setRotationPoint(-160F, -85F, 26.9F);
		bodyModel[168].rotateAngleY = -3.14159265F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 25
		tailModel[1] = new ModelRendererTurbo(this, 1297, 113, textureX, textureY); // Box 26
		tailModel[2] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 28
		tailModel[3] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 29
		tailModel[4] = new ModelRendererTurbo(this, 585, 401, textureX, textureY); // Box 48
		tailModel[5] = new ModelRendererTurbo(this, 585, 417, textureX, textureY); // Box 49
		tailModel[6] = new ModelRendererTurbo(this, 585, 433, textureX, textureY); // Box 50
		tailModel[7] = new ModelRendererTurbo(this, 585, 449, textureX, textureY); // Box 51
		tailModel[8] = new ModelRendererTurbo(this, 585, 465, textureX, textureY); // Box 52
		tailModel[9] = new ModelRendererTurbo(this, 585, 481, textureX, textureY); // Box 53
		tailModel[10] = new ModelRendererTurbo(this, 585, 497, textureX, textureY); // Box 54
		tailModel[11] = new ModelRendererTurbo(this, 585, 513, textureX, textureY); // Box 55
		tailModel[12] = new ModelRendererTurbo(this, 585, 529, textureX, textureY); // Box 56
		tailModel[13] = new ModelRendererTurbo(this, 585, 545, textureX, textureY); // Box 57
		tailModel[14] = new ModelRendererTurbo(this, 585, 561, textureX, textureY); // Box 58
		tailModel[15] = new ModelRendererTurbo(this, 585, 577, textureX, textureY); // Box 59
		tailModel[16] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 68
		tailModel[17] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 69
		tailModel[18] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Box 70
		tailModel[19] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 71
		tailModel[20] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 72
		tailModel[21] = new ModelRendererTurbo(this, 1753, 17, textureX, textureY); // Box 73
		tailModel[22] = new ModelRendererTurbo(this, 1753, 81, textureX, textureY); // Box 74
		tailModel[23] = new ModelRendererTurbo(this, 1881, 17, textureX, textureY); // Box 75
		tailModel[24] = new ModelRendererTurbo(this, 1937, 1, textureX, textureY); // Box 56
		tailModel[25] = new ModelRendererTurbo(this, 1425, 129, textureX, textureY); // Box 58
		tailModel[26] = new ModelRendererTurbo(this, 1865, 33, textureX, textureY); // Box 59
		tailModel[27] = new ModelRendererTurbo(this, 1865, 57, textureX, textureY); // Box 60
		tailModel[28] = new ModelRendererTurbo(this, 1729, 129, textureX, textureY); // Box 61
		tailModel[29] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 62
		tailModel[30] = new ModelRendererTurbo(this, 2033, 49, textureX, textureY); // Box 63
		tailModel[31] = new ModelRendererTurbo(this, 1257, 401, textureX, textureY); // Box 64
		tailModel[32] = new ModelRendererTurbo(this, 1729, 129, textureX, textureY); // Box 65
		tailModel[33] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 66
		tailModel[34] = new ModelRendererTurbo(this, 1985, 57, textureX, textureY); // Box 70
		tailModel[35] = new ModelRendererTurbo(this, 1953, 97, textureX, textureY); // Box 71
		tailModel[36] = new ModelRendererTurbo(this, 1777, 33, textureX, textureY); // Box 72
		tailModel[37] = new ModelRendererTurbo(this, 1977, 105, textureX, textureY); // Box 73
		tailModel[38] = new ModelRendererTurbo(this, 1873, 129, textureX, textureY); // Box 74
		tailModel[39] = new ModelRendererTurbo(this, 1809, 33, textureX, textureY); // Box 75
		tailModel[40] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 76
		tailModel[41] = new ModelRendererTurbo(this, 833, 593, textureX, textureY); // Box 84
		tailModel[42] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 85
		tailModel[43] = new ModelRendererTurbo(this, 249, 833, textureX, textureY); // Box 86
		tailModel[44] = new ModelRendererTurbo(this, 2025, 137, textureX, textureY); // Box 358
		tailModel[45] = new ModelRendererTurbo(this, 1145, 145, textureX, textureY); // Box 359
		tailModel[46] = new ModelRendererTurbo(this, 4, 1196, textureX, textureY); // Box 475
		tailModel[47] = new ModelRendererTurbo(this, 4, 1196, textureX, textureY); // Box 478
		tailModel[48] = new ModelRendererTurbo(this, 4, 1196, textureX, textureY); // Box 479
		tailModel[49] = new ModelRendererTurbo(this, 4, 1196, textureX, textureY); // Box 480
		tailModel[50] = new ModelRendererTurbo(this, 4, 1196, textureX, textureY); // Box 481
		tailModel[51] = new ModelRendererTurbo(this, 4, 1196, textureX, textureY); // Box 482

		tailModel[0].addShapeBox(0F, 0F, 0F, 322, 1, 10, 0F,0F, 0F, 0F, 0F, -11F, 0F, 0F, -12F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 12F, -6F, 0F, 2F, 0F); // Box 25
		tailModel[0].setRotationPoint(160F, -87F, 0F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 322, 1, 9, 0F,0F, 0F, 0F, 0F, -10F, 6F, 0F, -12F, -13F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 10F, 6F, 0F, 11F, -14F, 0F, 5F, -1F); // Box 26
		tailModel[1].setRotationPoint(160F, -85F, 10F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 322, 8, 1, 0F,0F, 0F, 0F, 0F, -6F, 13F, 0F, -6F, -13F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 1F, 11F, 0F, 1F, -11F, 0F, 0F, 6F); // Box 28
		tailModel[2].setRotationPoint(160F, -79F, 18F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 322, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 17F, 0F, -1F, -17F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, 16F, 0F, -6F, -16F, 0F, 0F, 2F); // Box 29
		tailModel[3].setRotationPoint(160F, -71F, 24F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 322, 1, 10, 0F,0F, 0F, 0F, 0F, 21F, 0F, 0F, 22F, -7F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -22F, -7F, 0F, -2F, 0F); // Box 48
		tailModel[4].setRotationPoint(160F, -34F, 0F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 322, 10, 1, 0F,0F, 0F, -2F, 0F, 6F, 16F, 0F, 6F, -16F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -11F, 17F, 0F, -11F, -17F, 0F, 0F, 0F); // Box 49
		tailModel[5].setRotationPoint(160F, -60F, 24F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 322, 9, 1, 0F,0F, 0F, 0F, 0F, 11F, 17F, 0F, 11F, -17F, 0F, 0F, 0F, 0F, -1F, 5F, 0F, -17F, 19F, 0F, -16F, -20F, 0F, 0F, -6F); // Box 50
		tailModel[6].setRotationPoint(160F, -50F, 24F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 322, 1, 9, 0F,0F, 0F, 0F, 0F, 20F, 7F, 0F, 22F, -14F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -20F, 7F, 0F, -22F, -14F, 0F, -6F, 0F); // Box 51
		tailModel[7].setRotationPoint(160F, -36F, 10F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 322, 1, 10, 0F,0F, -2F, 0F, 0F, -12F, -6F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 12F, -6F, 0F, 11F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[8].setRotationPoint(160F, -87F, -10F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 322, 1, 9, 0F,0F, -6F, 0F, 0F, -12F, -13F, 0F, -10F, 6F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 11F, -14F, 0F, 10F, 6F, 0F, 0F, 0F); // Box 53
		tailModel[9].setRotationPoint(160F, -85F, -19F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 322, 8, 1, 0F,0F, 0F, 0F, 0F, -6F, -13F, 0F, -6F, 13F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 1F, -11F, 0F, 1F, 11F, 0F, 0F, -6F); // Box 54
		tailModel[10].setRotationPoint(160F, -79F, -19F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 322, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, -17F, 0F, -1F, 17F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -6F, -16F, 0F, -6F, 16F, 0F, 0F, -2F); // Box 55
		tailModel[11].setRotationPoint(160F, -71F, -25F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 322, 1, 10, 0F,0F, 2F, 0F, 0F, 22F, -7F, 0F, 21F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -22F, -7F, 0F, -21F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[12].setRotationPoint(160F, -34F, -10F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 322, 10, 1, 0F,0F, 0F, 2F, 0F, 6F, -16F, 0F, 6F, 16F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -11F, -17F, 0F, -11F, 17F, 0F, 0F, 0F); // Box 57
		tailModel[13].setRotationPoint(160F, -60F, -25F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 322, 9, 1, 0F,0F, 0F, 0F, 0F, 11F, -17F, 0F, 11F, 17F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -16F, -20F, 0F, -17F, 19F, 0F, -1F, 5F); // Box 58
		tailModel[14].setRotationPoint(160F, -50F, -25F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 322, 1, 9, 0F,0F, 6F, 0F, 0F, 22F, -14F, 0F, 20F, 7F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -22F, -14F, 0F, -20F, 7F, 0F, 0F, 0F); // Box 59
		tailModel[15].setRotationPoint(160F, -36F, -19F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,-6F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 68
		tailModel[16].setRotationPoint(289F, -87F, -4F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,2F, -5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 2F, -5F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 69
		tailModel[17].setRotationPoint(289F, -87F, -3F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,-4F, 0F, -4F, 1F, -3F, 0F, 1F, -3F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 70
		tailModel[18].setRotationPoint(295F, -91F, -4F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[19].setRotationPoint(299F, -87F, -4F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		tailModel[20].setRotationPoint(299F, -82F, -4F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 53, 3, 8, 0F,1F, 0F, -4F, 0F, 9F, -1F, 0F, 9F, -1F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		tailModel[21].setRotationPoint(300F, -91F, -4F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 131, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 2F, 0F, 7F, 2F, 0F, 0F, 0F); // Box 74
		tailModel[22].setRotationPoint(300F, -88F, -4F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 54, 1, 8, 0F,0F, -1F, -4F, 0F, 10F, -4F, 0F, 10F, -4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 0F, -4F); // Box 75
		tailModel[23].setRotationPoint(299F, -92F, -4F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 32, 7, 8, 0F,0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 7F, 2F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 2F); // Box 56
		tailModel[24].setRotationPoint(431F, -88F, -4F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 78, 113, 6, 0F,-116F, 0F, -2F, 66F, 0F, -2F, 66F, 0F, -2F, -116F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[25].setRotationPoint(353F, -213F, -3F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 78, 12, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[26].setRotationPoint(353F, -100F, -4F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 51, 12, 6, 0F,0F, 0F, 0F, 1F, -10F, -2F, 1F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 1F); // Box 60
		tailModel[27].setRotationPoint(431F, -100F, -3F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 52, 113, 6, 0F,-66F, 0F, -2F, 44F, 0F, -3F, 44F, 0F, -3F, -66F, 0F, -2F, 0F, 0F, 0F, 0F, 10F, -3F, 0F, 10F, -3F, 0F, 0F, 0F); // Box 61
		tailModel[28].setRotationPoint(431F, -213F, -3F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 62
		tailModel[29].setRotationPoint(289F, -82F, -3F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 1, 113, 6, 0F,-115F, 0F, -3F, 116F, 0F, -2F, 116F, 0F, -2F, -115F, 0F, -3F, -1F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -3F); // Box 63
		tailModel[30].setRotationPoint(352F, -213F, -3F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 65, 5, 138, 0F,0F, 0F, 0F, 0F, 0F, 0F, 82F, -3F, 0F, -136F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 82F, 0F, 0F, -136F, 0F, 0F); // Box 64
		tailModel[31].setRotationPoint(358F, -95F, 3F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 138, 0F,2F, -2F, 0F, 0F, 0F, 0F, 136F, -3F, 0F, -135F, -4F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 136F, 0F, 0F, -135F, -1F, 0F); // Box 65
		tailModel[32].setRotationPoint(357F, -95F, 3F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 41, 5, 138, 0F,0F, 0F, 0F, -11F, -2F, 1F, 68F, -4F, 0F, -81F, -3F, 0F, 0F, 0F, 0F, -11F, -3F, 1F, 68F, -1F, 0F, -81F, 0F, 0F); // Box 66
		tailModel[33].setRotationPoint(424F, -95F, 3F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 7, 4, 16, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F); // Box 70
		tailModel[34].setRotationPoint(482F, -70F, -8F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F,0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F); // Box 71
		tailModel[35].setRotationPoint(482F, -73F, -6F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 7, 3, 8, 0F,0F, 0F, 0F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, 2F); // Box 72
		tailModel[36].setRotationPoint(482F, -75F, -4F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 7, 5, 16, 0F,0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F); // Box 73
		tailModel[37].setRotationPoint(482F, -66F, -8F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 7, 5, 12, 0F,0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, -1F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -1F); // Box 74
		tailModel[38].setRotationPoint(482F, -62F, -6F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, -1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -3.5F, -2.5F, 0F, -3.5F, -2.5F, 0F, 0F, 0F); // Box 75
		tailModel[39].setRotationPoint(482F, -58F, -3F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 3.5F, -2.5F, 0F, 3.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4.5F, -2.5F, 0F, -4.5F, -2.5F, 0F, 0F, -3F); // Box 76
		tailModel[40].setRotationPoint(482F, -55F, -3F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 65, 5, 138, 0F,-136F, -3F, 0F, 82F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -136F, 0F, 0F, 82F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		tailModel[41].setRotationPoint(358F, -95F, -141F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 138, 0F,-135F, -4F, 0F, 136F, -3F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -135F, -1F, 0F, 136F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F); // Box 85
		tailModel[42].setRotationPoint(357F, -95F, -141F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 41, 5, 138, 0F,-81F, -3F, 0F, 68F, -4F, 0F, -11F, -2F, 1F, 0F, 0F, 0F, -81F, 0F, 0F, 68F, -1F, 0F, -11F, -3F, 1F, 0F, 0F, 0F); // Box 86
		tailModel[43].setRotationPoint(424F, -95F, -141F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 358
		tailModel[44].setRotationPoint(480F, -86F, -2F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 359
		tailModel[45].setRotationPoint(480F, -86F, 1F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 100, 100, 0, 0F,0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, -25F, -25F, 0F, -25F, -25F, 0F, 0F, -25F, 0F); // Box 475
		tailModel[46].setRotationPoint(422F, -188F, -3F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 100, 100, 0, 0F,0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, -25F, -25F, 0F, -25F, -25F, 0F, 0F, -25F, 0F); // Box 478
		tailModel[47].setRotationPoint(498F, -188F, 3F);
		tailModel[47].rotateAngleY = -3.14159265F;

		tailModel[48].addShapeBox(0F, 0F, 0F, 100, 100, 0, 0F,0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, -25F, -25F, 0F, -25F, -25F, 0F, 0F, -25F, 0F); // Box 479
		tailModel[48].setRotationPoint(16F, -43F, 290F);
		tailModel[48].rotateAngleX = 1.55334303F;
		tailModel[48].rotateAngleY = -1.57079633F;

		tailModel[49].addShapeBox(0F, 0F, 0F, 100, 100, 0, 0F,0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, -25F, -25F, 0F, -25F, -25F, 0F, 0F, -25F, 0F); // Box 480
		tailModel[49].setRotationPoint(16F, -55F, -274F);
		tailModel[49].rotateAngleX = 1.60570291F;
		tailModel[49].rotateAngleY = -1.57079633F;
		tailModel[49].rotateAngleZ = 3.08923278F;

		tailModel[50].addShapeBox(0F, 0F, 0F, 100, 100, 0, 0F,0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, -25F, -25F, 0F, -25F, -25F, 0F, 0F, -25F, 0F); // Box 481
		tailModel[50].setRotationPoint(16F, -45F, -202F);
		tailModel[50].rotateAngleX = 1.58824962F;
		tailModel[50].rotateAngleY = -1.57079633F;
		tailModel[50].rotateAngleZ = -0.05235988F;

		tailModel[51].addShapeBox(0F, 0F, 0F, 100, 100, 0, 0F,0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, -25F, -25F, 0F, -25F, -25F, 0F, 0F, -25F, 0F); // Box 482
		tailModel[51].setRotationPoint(16F, -56F, 213F);
		tailModel[51].rotateAngleX = 1.51843645F;
		tailModel[51].rotateAngleY = -1.57079633F;
		tailModel[51].rotateAngleZ = 3.14159265F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 1425, 249, textureX, textureY); // Box 191
		leftWingModel[1] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 192
		leftWingModel[2] = new ModelRendererTurbo(this, 1873, 241, textureX, textureY); // Box 193
		leftWingModel[3] = new ModelRendererTurbo(this, 801, 265, textureX, textureY); // Box 194
		leftWingModel[4] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Box 195
		leftWingModel[5] = new ModelRendererTurbo(this, 1017, 225, textureX, textureY); // Box 196
		leftWingModel[6] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 197
		leftWingModel[7] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 198
		leftWingModel[8] = new ModelRendererTurbo(this, 1057, 225, textureX, textureY); // Box 199
		leftWingModel[9] = new ModelRendererTurbo(this, 1081, 241, textureX, textureY); // Box 200
		leftWingModel[10] = new ModelRendererTurbo(this, 801, 297, textureX, textureY); // Box 201
		leftWingModel[11] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 202
		leftWingModel[12] = new ModelRendererTurbo(this, 1729, 249, textureX, textureY); // Box 203
		leftWingModel[13] = new ModelRendererTurbo(this, 1161, 257, textureX, textureY); // Box 204
		leftWingModel[14] = new ModelRendererTurbo(this, 1993, 209, textureX, textureY); // Box 205
		leftWingModel[15] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 206
		leftWingModel[16] = new ModelRendererTurbo(this, 1561, 249, textureX, textureY); // Box 207
		leftWingModel[17] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 208
		leftWingModel[18] = new ModelRendererTurbo(this, 1793, 345, textureX, textureY); // Box 209
		leftWingModel[19] = new ModelRendererTurbo(this, 1793, 385, textureX, textureY); // Box 210
		leftWingModel[20] = new ModelRendererTurbo(this, 225, 417, textureX, textureY); // Box 211
		leftWingModel[21] = new ModelRendererTurbo(this, 1425, 345, textureX, textureY); // Box 212
		leftWingModel[22] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 238
		leftWingModel[23] = new ModelRendererTurbo(this, 1801, 249, textureX, textureY); // Box 239
		leftWingModel[24] = new ModelRendererTurbo(this, 1225, 265, textureX, textureY); // Box 240
		leftWingModel[25] = new ModelRendererTurbo(this, 1545, 297, textureX, textureY); // Box 241
		leftWingModel[26] = new ModelRendererTurbo(this, 801, 329, textureX, textureY); // Box 242
		leftWingModel[27] = new ModelRendererTurbo(this, 729, 257, textureX, textureY); // Box 243
		leftWingModel[28] = new ModelRendererTurbo(this, 1921, 465, textureX, textureY); // Box 244
		leftWingModel[29] = new ModelRendererTurbo(this, 449, 425, textureX, textureY); // Box 245
		leftWingModel[30] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Box 246
		leftWingModel[31] = new ModelRendererTurbo(this, 1529, 481, textureX, textureY); // Box 247
		leftWingModel[32] = new ModelRendererTurbo(this, 1241, 289, textureX, textureY); // Box 248
		leftWingModel[33] = new ModelRendererTurbo(this, 1241, 513, textureX, textureY); // Box 249
		leftWingModel[34] = new ModelRendererTurbo(this, 1, 593, textureX, textureY); // Box 250
		leftWingModel[35] = new ModelRendererTurbo(this, 305, 617, textureX, textureY); // Box 251
		leftWingModel[36] = new ModelRendererTurbo(this, 537, 617, textureX, textureY); // Box 252
		leftWingModel[37] = new ModelRendererTurbo(this, 1793, 561, textureX, textureY); // Box 253
		leftWingModel[38] = new ModelRendererTurbo(this, 1105, 593, textureX, textureY); // Box 254
		leftWingModel[39] = new ModelRendererTurbo(this, 1377, 617, textureX, textureY); // Box 255
		leftWingModel[40] = new ModelRendererTurbo(this, 1633, 617, textureX, textureY); // Box 256
		leftWingModel[41] = new ModelRendererTurbo(this, 1849, 617, textureX, textureY); // Box 257
		leftWingModel[42] = new ModelRendererTurbo(this, 1105, 625, textureX, textureY); // Box 258
		leftWingModel[43] = new ModelRendererTurbo(this, 1, 633, textureX, textureY); // Box 259
		leftWingModel[44] = new ModelRendererTurbo(this, 537, 657, textureX, textureY); // Box 260
		leftWingModel[45] = new ModelRendererTurbo(this, 1377, 657, textureX, textureY); // Box 261
		leftWingModel[46] = new ModelRendererTurbo(this, 1849, 657, textureX, textureY); // Box 262
		leftWingModel[47] = new ModelRendererTurbo(this, 1105, 657, textureX, textureY); // Box 263
		leftWingModel[48] = new ModelRendererTurbo(this, 305, 665, textureX, textureY); // Box 264
		leftWingModel[49] = new ModelRendererTurbo(this, 537, 689, textureX, textureY); // Box 265
		leftWingModel[50] = new ModelRendererTurbo(this, 1377, 705, textureX, textureY); // Box 266
		leftWingModel[51] = new ModelRendererTurbo(this, 537, 729, textureX, textureY); // Box 267
		leftWingModel[52] = new ModelRendererTurbo(this, 1633, 665, textureX, textureY); // Box 268
		leftWingModel[53] = new ModelRendererTurbo(this, 945, 361, textureX, textureY); // Box 269
		leftWingModel[54] = new ModelRendererTurbo(this, 385, 505, textureX, textureY); // Box 270
		leftWingModel[55] = new ModelRendererTurbo(this, 1, 513, textureX, textureY); // Box 271
		leftWingModel[56] = new ModelRendererTurbo(this, 833, 593, textureX, textureY); // Box 272
		leftWingModel[57] = new ModelRendererTurbo(this, 1569, 481, textureX, textureY); // Box 273
		leftWingModel[58] = new ModelRendererTurbo(this, 833, 633, textureX, textureY); // Box 274
		leftWingModel[59] = new ModelRendererTurbo(this, 665, 617, textureX, textureY); // Box 275
		leftWingModel[60] = new ModelRendererTurbo(this, 873, 329, textureX, textureY); // Box 276
		leftWingModel[61] = new ModelRendererTurbo(this, 1505, 617, textureX, textureY); // Box 277
		leftWingModel[62] = new ModelRendererTurbo(this, 697, 361, textureX, textureY); // Box 278
		leftWingModel[63] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 417

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 50, 9, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		leftWingModel[0].setRotationPoint(-99F, -53F, -242F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 50, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		leftWingModel[1].setRotationPoint(-99F, -60F, -242F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 50, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		leftWingModel[2].setRotationPoint(-99F, -64F, -237F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 50, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 194
		leftWingModel[3].setRotationPoint(-99F, -37F, -237F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 50, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 195
		leftWingModel[4].setRotationPoint(-99F, -44F, -242F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 4, 9, 31, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 196
		leftWingModel[5].setRotationPoint(-103F, -53F, -242F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 4, 7, 31, 0F,0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 197
		leftWingModel[6].setRotationPoint(-103F, -60F, -242F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 21, 0F,0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 198
		leftWingModel[7].setRotationPoint(-103F, -64F, -237F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 21, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F); // Box 199
		leftWingModel[8].setRotationPoint(-103F, -37F, -237F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 4, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F); // Box 200
		leftWingModel[9].setRotationPoint(-103F, -44F, -242F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 25, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 1F, -7F); // Box 201
		leftWingModel[10].setRotationPoint(-76F, -37F, -237F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 23, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		leftWingModel[11].setRotationPoint(-126F, -52F, -233F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftWingModel[12].setRotationPoint(-126F, -56F, -233F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 204
		leftWingModel[13].setRotationPoint(-126F, -46F, -233F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 13, 6, 12, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 205
		leftWingModel[14].setRotationPoint(-139F, -52F, -233F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -6F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -5F); // Box 206
		leftWingModel[15].setRotationPoint(-139F, -46F, -233F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -6F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F); // Box 207
		leftWingModel[16].setRotationPoint(-139F, -56F, -233F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 82, 4, 21, 0F,0F, 0F, -7F, 0F, -9F, -7F, 0F, -8F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 6F, -3F, 0F, 6F, -2F, 0F, 0F, 0F); // Box 208
		leftWingModel[17].setRotationPoint(-49F, -64F, -237F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 82, 7, 31, 0F,0F, 0F, -5F, 0F, -6F, -8F, 0F, -6F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 209
		leftWingModel[18].setRotationPoint(-49F, -60F, -242F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 95, 9, 31, 0F,0F, 0F, 0F, -13F, 0F, -8F, -13F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, 0F); // Box 210
		leftWingModel[19].setRotationPoint(-49F, -53F, -242F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 95, 7, 31, 0F,0F, 0F, 0F, 0F, 4F, -8F, 0F, 4F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -13F, 0F, -9F, -13F, 0F, 0F, -5F); // Box 211
		leftWingModel[20].setRotationPoint(-49F, -44F, -242F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 95, 4, 21, 0F,0F, 0F, 0F, 0F, 9F, -8F, 0F, 9F, -8F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -12F, -10F, 0F, -12F, -10F, 0F, 0F, -7F); // Box 212
		leftWingModel[21].setRotationPoint(-49F, -37F, -237F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 13, 6, 12, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 238
		leftWingModel[22].setRotationPoint(-209F, -49F, -122F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -6F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F); // Box 239
		leftWingModel[23].setRotationPoint(-209F, -53F, -122F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		leftWingModel[24].setRotationPoint(-196F, -53F, -122F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 23, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		leftWingModel[25].setRotationPoint(-196F, -49F, -122F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 242
		leftWingModel[26].setRotationPoint(-196F, -43F, -122F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -6F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -5F); // Box 243
		leftWingModel[27].setRotationPoint(-209F, -43F, -122F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 4, 9, 31, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 244
		leftWingModel[28].setRotationPoint(-173F, -50F, -131F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 4, 7, 31, 0F,0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 245
		leftWingModel[29].setRotationPoint(-173F, -57F, -131F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 4, 4, 21, 0F,0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 246
		leftWingModel[30].setRotationPoint(-173F, -61F, -126F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 4, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F); // Box 247
		leftWingModel[31].setRotationPoint(-173F, -41F, -131F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 21, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F); // Box 248
		leftWingModel[32].setRotationPoint(-173F, -34F, -126F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 249
		leftWingModel[33].setRotationPoint(-169F, -34F, -126F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 250
		leftWingModel[34].setRotationPoint(-169F, -41F, -131F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 48, 9, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftWingModel[35].setRotationPoint(-169F, -50F, -131F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		leftWingModel[36].setRotationPoint(-169F, -57F, -131F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		leftWingModel[37].setRotationPoint(-169F, -61F, -126F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, -7F, 0F, 7F, -7F, 0F, 7F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 254
		leftWingModel[38].setRotationPoint(-121F, -61F, -126F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, -5F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 255
		leftWingModel[39].setRotationPoint(-121F, -57F, -131F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 48, 9, 31, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 256
		leftWingModel[40].setRotationPoint(-121F, -50F, -131F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F); // Box 257
		leftWingModel[41].setRotationPoint(-121F, -41F, -131F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, -7F); // Box 258
		leftWingModel[42].setRotationPoint(-121F, -34F, -126F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 259
		leftWingModel[43].setRotationPoint(-73F, -46F, -131F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 260
		leftWingModel[44].setRotationPoint(-73F, -39F, -126F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 48, 11, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		leftWingModel[45].setRotationPoint(-73F, -57F, -131F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		leftWingModel[46].setRotationPoint(-73F, -64F, -131F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		leftWingModel[47].setRotationPoint(-73F, -68F, -126F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 74, 4, 21, 0F,0F, 7F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 264
		leftWingModel[48].setRotationPoint(-25F, -61F, -126F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 74, 7, 31, 0F,0F, 7F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 7F, -5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 265
		leftWingModel[49].setRotationPoint(-25F, -57F, -131F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 74, 9, 31, 0F,0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 266
		leftWingModel[50].setRotationPoint(-25F, -50F, -131F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 74, 7, 31, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -5F); // Box 267
		leftWingModel[51].setRotationPoint(-25F, -41F, -131F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 74, 4, 21, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, -7F); // Box 268
		leftWingModel[52].setRotationPoint(-25F, -34F, -126F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 28, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftWingModel[53].setRotationPoint(49F, -61F, -126F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 28, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		leftWingModel[54].setRotationPoint(49F, -57F, -131F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 28, 9, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftWingModel[55].setRotationPoint(49F, -50F, -131F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 28, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 272
		leftWingModel[56].setRotationPoint(49F, -41F, -131F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 28, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 273
		leftWingModel[57].setRotationPoint(49F, -34F, -126F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 35, 9, 31, 0F,0F, 0F, 0F, 0F, -3F, -12F, 0F, -3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, -3F, -12F, 0F, 0F, 0F); // Box 274
		leftWingModel[58].setRotationPoint(77F, -50F, -131F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 0F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, 0F, 5F); // Box 275
		leftWingModel[59].setRotationPoint(77F, -57F, -126F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 35, 7, 7, 0F,0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F, 0F, -3F, 7F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -3F, 7F); // Box 276
		leftWingModel[60].setRotationPoint(77F, -61F, -119F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 5F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, 0F, 0F); // Box 277
		leftWingModel[61].setRotationPoint(77F, -41F, -126F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 35, 7, 7, 0F,0F, -3F, 7F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -3F, 7F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F); // Box 278
		leftWingModel[62].setRotationPoint(77F, -37F, -119F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 417
		leftWingModel[63].setRotationPoint(22F, 22F, -107F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1057, 129, textureX, textureY); // Box 33
		rightWingModel[1] = new ModelRendererTurbo(this, 1425, 129, textureX, textureY); // Box 34
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 35
		rightWingModel[3] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 36
		rightWingModel[4] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 37
		rightWingModel[5] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 38
		rightWingModel[6] = new ModelRendererTurbo(this, 1425, 345, textureX, textureY); // Box 39
		rightWingModel[7] = new ModelRendererTurbo(this, 337, 401, textureX, textureY); // Box 40
		rightWingModel[8] = new ModelRendererTurbo(this, 1009, 545, textureX, textureY); // Box 76
		rightWingModel[9] = new ModelRendererTurbo(this, 1, 561, textureX, textureY); // Box 77
		rightWingModel[10] = new ModelRendererTurbo(this, 537, 593, textureX, textureY); // Box 78
		rightWingModel[11] = new ModelRendererTurbo(this, 305, 617, textureX, textureY); // Box 79
		rightWingModel[12] = new ModelRendererTurbo(this, 1377, 617, textureX, textureY); // Box 80
		rightWingModel[13] = new ModelRendererTurbo(this, 1633, 617, textureX, textureY); // Box 81
		rightWingModel[14] = new ModelRendererTurbo(this, 833, 817, textureX, textureY); // Box 82
		rightWingModel[15] = new ModelRendererTurbo(this, 1, 777, textureX, textureY); // Box 83
		rightWingModel[16] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 152
		rightWingModel[17] = new ModelRendererTurbo(this, 1873, 169, textureX, textureY); // Box 153
		rightWingModel[18] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 154
		rightWingModel[19] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 155
		rightWingModel[20] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 156
		rightWingModel[21] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 157
		rightWingModel[22] = new ModelRendererTurbo(this, 1049, 161, textureX, textureY); // Box 158
		rightWingModel[23] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 159
		rightWingModel[24] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Box 160
		rightWingModel[25] = new ModelRendererTurbo(this, 1225, 161, textureX, textureY); // Box 161
		rightWingModel[26] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 162
		rightWingModel[27] = new ModelRendererTurbo(this, 1161, 169, textureX, textureY); // Box 163
		rightWingModel[28] = new ModelRendererTurbo(this, 1161, 193, textureX, textureY); // Box 164
		rightWingModel[29] = new ModelRendererTurbo(this, 665, 201, textureX, textureY); // Box 165
		rightWingModel[30] = new ModelRendererTurbo(this, 1089, 161, textureX, textureY); // Box 166
		rightWingModel[31] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 167
		rightWingModel[32] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Box 168
		rightWingModel[33] = new ModelRendererTurbo(this, 737, 201, textureX, textureY); // Box 169
		rightWingModel[34] = new ModelRendererTurbo(this, 1017, 201, textureX, textureY); // Box 170
		rightWingModel[35] = new ModelRendererTurbo(this, 1073, 201, textureX, textureY); // Box 171
		rightWingModel[36] = new ModelRendererTurbo(this, 1225, 201, textureX, textureY); // Box 172
		rightWingModel[37] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 173
		rightWingModel[38] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 174
		rightWingModel[39] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 175
		rightWingModel[40] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 176
		rightWingModel[41] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Box 177
		rightWingModel[42] = new ModelRendererTurbo(this, 529, 209, textureX, textureY); // Box 178
		rightWingModel[43] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 179
		rightWingModel[44] = new ModelRendererTurbo(this, 1873, 209, textureX, textureY); // Box 180
		rightWingModel[45] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 181
		rightWingModel[46] = new ModelRendererTurbo(this, 801, 217, textureX, textureY); // Box 182
		rightWingModel[47] = new ModelRendererTurbo(this, 569, 225, textureX, textureY); // Box 183
		rightWingModel[48] = new ModelRendererTurbo(this, 1161, 225, textureX, textureY); // Box 184
		rightWingModel[49] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 185
		rightWingModel[50] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 186
		rightWingModel[51] = new ModelRendererTurbo(this, 529, 265, textureX, textureY); // Box 187
		rightWingModel[52] = new ModelRendererTurbo(this, 1017, 289, textureX, textureY); // Box 188
		rightWingModel[53] = new ModelRendererTurbo(this, 529, 305, textureX, textureY); // Box 189
		rightWingModel[54] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 190
		rightWingModel[55] = new ModelRendererTurbo(this, 1425, 297, textureX, textureY); // Box 213
		rightWingModel[56] = new ModelRendererTurbo(this, 1233, 401, textureX, textureY); // Box 214
		rightWingModel[57] = new ModelRendererTurbo(this, 1793, 433, textureX, textureY); // Box 215
		rightWingModel[58] = new ModelRendererTurbo(this, 225, 457, textureX, textureY); // Box 216
		rightWingModel[59] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 217
		rightWingModel[60] = new ModelRendererTurbo(this, 353, 465, textureX, textureY); // Box 218
		rightWingModel[61] = new ModelRendererTurbo(this, 577, 361, textureX, textureY); // Box 219
		rightWingModel[62] = new ModelRendererTurbo(this, 1233, 465, textureX, textureY); // Box 220
		rightWingModel[63] = new ModelRendererTurbo(this, 1793, 481, textureX, textureY); // Box 221
		rightWingModel[64] = new ModelRendererTurbo(this, 801, 361, textureX, textureY); // Box 222
		rightWingModel[65] = new ModelRendererTurbo(this, 225, 505, textureX, textureY); // Box 223
		rightWingModel[66] = new ModelRendererTurbo(this, 1793, 521, textureX, textureY); // Box 224
		rightWingModel[67] = new ModelRendererTurbo(this, 1377, 545, textureX, textureY); // Box 225
		rightWingModel[68] = new ModelRendererTurbo(this, 305, 561, textureX, textureY); // Box 226
		rightWingModel[69] = new ModelRendererTurbo(this, 1, 561, textureX, textureY); // Box 227
		rightWingModel[70] = new ModelRendererTurbo(this, 897, 297, textureX, textureY); // Box 228
		rightWingModel[71] = new ModelRendererTurbo(this, 1529, 401, textureX, textureY); // Box 229
		rightWingModel[72] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 230
		rightWingModel[73] = new ModelRendererTurbo(this, 1529, 441, textureX, textureY); // Box 231
		rightWingModel[74] = new ModelRendererTurbo(this, 1193, 337, textureX, textureY); // Box 232
		rightWingModel[75] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 233
		rightWingModel[76] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 234
		rightWingModel[77] = new ModelRendererTurbo(this, 569, 209, textureX, textureY); // Box 235
		rightWingModel[78] = new ModelRendererTurbo(this, 1921, 433, textureX, textureY); // Box 236
		rightWingModel[79] = new ModelRendererTurbo(this, 1929, 321, textureX, textureY); // Box 237

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 61, 22, 245, 0F,0F, 0F, 0F, 0F, 0F, 0F, 153F, -22F, 0F, -166F, -21F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 153F, 9F, 0F, -174F, 8F, 0F); // Box 33
		rightWingModel[0].setRotationPoint(-138F, -74F, 22F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 48, 9, 201, 0F,0F, 0F, 0F, 0F, -1F, 0F, 126F, -20F, 0F, -136F, -16F, 0F, -8F, 0F, 0F, 0F, 1F, 0F, 126F, 11F, 0F, -136F, 12F, 0F); // Box 34
		rightWingModel[1].setRotationPoint(28F, -53F, 267F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 23, 22, 245, 0F,-4F, -4F, 0F, 0F, 0F, 0F, 166F, -21F, 0F, -175F, -22F, 0F, -5F, -8F, 0F, 24F, 0F, 0F, 174F, 8F, 0F, -175F, 7F, 0F); // Box 35
		rightWingModel[2].setRotationPoint(-161F, -74F, 22F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 14, 7, 201, 0F,0F, 0F, 0F, 0F, 1F, 0F, 136F, -15F, 0F, -140F, -15F, 0F, 0F, 0F, 0F, 8F, 1F, 0F, 136F, 13F, 0F, -140F, 12F, 0F); // Box 36
		rightWingModel[3].setRotationPoint(14F, -52F, 267F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 4, 10, 245, 0F,2F, -5F, 0F, 0F, 0F, 0F, 171F, -18F, 0F, -171F, -22F, 0F, 2F, -5F, 0F, 1F, 0F, 0F, 171F, 15F, 0F, -171F, 12F, 0F); // Box 37
		rightWingModel[4].setRotationPoint(-161F, -70F, 22F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 4, 7, 201, 0F,0F, -4F, 0F, 0F, 0F, 0F, 140F, -15F, 0F, -142F, -18F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 140F, 12F, 0F, -142F, 11F, 0F); // Box 38
		rightWingModel[5].setRotationPoint(10F, -52F, 267F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 61, 22, 245, 0F,0F, 0F, 0F, 14F, -16F, 0F, 126F, -29F, 0F, -153F, -22F, 0F, 0F, 0F, 0F, 14F, -6F, 0F, 126F, 7F, 0F, -153F, 9F, 0F); // Box 39
		rightWingModel[6].setRotationPoint(-77F, -74F, 22F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 20, 9, 201, 0F,0F, 0F, 0F, 14F, -7F, 0F, 106F, -19F, 0F, -126F, -19F, 0F, 0F, 0F, 0F, 14F, -2F, 0F, 106F, 10F, 0F, -126F, 10F, 0F); // Box 40
		rightWingModel[7].setRotationPoint(76F, -52F, 267F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 61, 22, 245, 0F,-166F, -21F, 0F, 153F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -174F, 8F, 0F, 153F, 9F, 0F, 0F, 0F, 0F, -24F, 0F, 0F); // Box 76
		rightWingModel[8].setRotationPoint(-138F, -74F, -267F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 48, 9, 201, 0F,-136F, -16F, 0F, 126F, -20F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -136F, 12F, 0F, 126F, 11F, 0F, 0F, 1F, 0F, -8F, 0F, 0F); // Box 77
		rightWingModel[9].setRotationPoint(28F, -53F, -468F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 23, 22, 245, 0F,-175F, -22F, 0F, 166F, -21F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -175F, 7F, 0F, 174F, 8F, 0F, 24F, 0F, 0F, -5F, -8F, 0F); // Box 78
		rightWingModel[10].setRotationPoint(-161F, -74F, -267F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 14, 7, 201, 0F,-140F, -15F, 0F, 136F, -15F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -140F, 12F, 0F, 136F, 13F, 0F, 8F, 1F, 0F, 0F, 0F, 0F); // Box 79
		rightWingModel[11].setRotationPoint(14F, -52F, -468F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 4, 10, 245, 0F,-171F, -22F, 0F, 171F, -18F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -171F, 12F, 0F, 171F, 15F, 0F, 1F, 0F, 0F, 2F, -5F, 0F); // Box 80
		rightWingModel[12].setRotationPoint(-161F, -70F, -267F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 4, 7, 201, 0F,-142F, -18F, 0F, 140F, -15F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -142F, 11F, 0F, 140F, 12F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 81
		rightWingModel[13].setRotationPoint(10F, -52F, -468F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 61, 22, 245, 0F,-153F, -22F, 0F, 126F, -29F, 0F, 14F, -16F, 0F, 0F, 0F, 0F, -153F, 9F, 0F, 126F, 7F, 0F, 14F, -6F, 0F, 0F, 0F, 0F); // Box 82
		rightWingModel[14].setRotationPoint(-77F, -74F, -267F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 20, 9, 201, 0F,-126F, -19F, 0F, 106F, -19F, 0F, 14F, -7F, 0F, 0F, 0F, 0F, -126F, 10F, 0F, 106F, 10F, 0F, 14F, -2F, 0F, 0F, 0F, 0F); // Box 83
		rightWingModel[15].setRotationPoint(76F, -52F, -468F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 50, 9, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightWingModel[16].setRotationPoint(-99F, -53F, 211F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 50, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightWingModel[17].setRotationPoint(-99F, -60F, 211F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 50, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightWingModel[18].setRotationPoint(-99F, -64F, 216F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 50, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 155
		rightWingModel[19].setRotationPoint(-99F, -37F, 216F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 50, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 156
		rightWingModel[20].setRotationPoint(-99F, -44F, 211F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 4, 9, 31, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 157
		rightWingModel[21].setRotationPoint(-103F, -53F, 211F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 4, 7, 31, 0F,0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 158
		rightWingModel[22].setRotationPoint(-103F, -60F, 211F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 21, 0F,0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 159
		rightWingModel[23].setRotationPoint(-103F, -64F, 216F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 21, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F); // Box 160
		rightWingModel[24].setRotationPoint(-103F, -37F, 216F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 4, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F); // Box 161
		rightWingModel[25].setRotationPoint(-103F, -44F, 211F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 25, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 1F, -7F); // Box 162
		rightWingModel[26].setRotationPoint(-76F, -37F, 216F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 23, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		rightWingModel[27].setRotationPoint(-126F, -52F, 221F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightWingModel[28].setRotationPoint(-126F, -56F, 221F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 165
		rightWingModel[29].setRotationPoint(-126F, -46F, 221F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 13, 6, 12, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 166
		rightWingModel[30].setRotationPoint(-139F, -52F, 221F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -6F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -5F); // Box 167
		rightWingModel[31].setRotationPoint(-139F, -46F, 221F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -6F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F); // Box 168
		rightWingModel[32].setRotationPoint(-139F, -56F, 221F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 13, 6, 12, 0F,0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 169
		rightWingModel[33].setRotationPoint(-209F, -49F, 110F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, -6F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F); // Box 170
		rightWingModel[34].setRotationPoint(-209F, -53F, 110F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		rightWingModel[35].setRotationPoint(-196F, -53F, 110F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 23, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightWingModel[36].setRotationPoint(-196F, -49F, 110F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 23, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 173
		rightWingModel[37].setRotationPoint(-196F, -43F, 110F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 13, 4, 12, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, -6F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, -5F); // Box 174
		rightWingModel[38].setRotationPoint(-209F, -43F, 110F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 4, 9, 31, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 175
		rightWingModel[39].setRotationPoint(-173F, -50F, 100F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 4, 7, 31, 0F,0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 176
		rightWingModel[40].setRotationPoint(-173F, -57F, 100F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 4, 4, 21, 0F,0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 177
		rightWingModel[41].setRotationPoint(-173F, -61F, 105F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 4, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -1F, -10F); // Box 178
		rightWingModel[42].setRotationPoint(-173F, -41F, 100F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 21, 0F,0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, -4F, -9F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -4F, -9F); // Box 179
		rightWingModel[43].setRotationPoint(-173F, -34F, 105F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 180
		rightWingModel[44].setRotationPoint(-169F, -34F, 105F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 181
		rightWingModel[45].setRotationPoint(-169F, -41F, 100F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 48, 9, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		rightWingModel[46].setRotationPoint(-169F, -50F, 100F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		rightWingModel[47].setRotationPoint(-169F, -57F, 100F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		rightWingModel[48].setRotationPoint(-169F, -61F, 105F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 25, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -7F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 1F, -7F); // Box 185
		rightWingModel[49].setRotationPoint(-146F, -34F, 105F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 82, 4, 21, 0F,0F, 0F, -7F, 0F, -8F, -7F, 0F, -9F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, 6F, -3F, 0F, 0F, 0F); // Box 186
		rightWingModel[50].setRotationPoint(-49F, -64F, 216F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 82, 7, 31, 0F,0F, 0F, -5F, 0F, -6F, -7F, 0F, -6F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 187
		rightWingModel[51].setRotationPoint(-49F, -60F, 211F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 95, 9, 31, 0F,0F, 0F, 0F, -13F, 0F, -7F, -13F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, 0F); // Box 188
		rightWingModel[52].setRotationPoint(-49F, -53F, 211F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 95, 7, 31, 0F,0F, 0F, 0F, 0F, 4F, -8F, 0F, 4F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -9F, -13F, 0F, -9F, -13F, 0F, 0F, -5F); // Box 189
		rightWingModel[53].setRotationPoint(-49F, -44F, 211F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 95, 4, 21, 0F,0F, 0F, 0F, 0F, 9F, -8F, 0F, 9F, -8F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -12F, -10F, 0F, -12F, -10F, 0F, 0F, -7F); // Box 190
		rightWingModel[54].setRotationPoint(-49F, -37F, 216F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, -7F, 0F, 7F, -7F, 0F, 7F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 213
		rightWingModel[55].setRotationPoint(-121F, -61F, 105F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, -5F, 0F, 7F, -5F, 0F, 7F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 214
		rightWingModel[56].setRotationPoint(-121F, -57F, 100F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 48, 9, 31, 0F,0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 215
		rightWingModel[57].setRotationPoint(-121F, -50F, 100F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F); // Box 216
		rightWingModel[58].setRotationPoint(-121F, -41F, 100F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -5F, -7F, 0F, -5F, -7F, 0F, 0F, -7F); // Box 217
		rightWingModel[59].setRotationPoint(-121F, -34F, 105F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 218
		rightWingModel[60].setRotationPoint(-73F, -46F, 100F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 219
		rightWingModel[61].setRotationPoint(-73F, -39F, 105F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 48, 11, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightWingModel[62].setRotationPoint(-73F, -57F, 100F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 48, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		rightWingModel[63].setRotationPoint(-73F, -64F, 100F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 48, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		rightWingModel[64].setRotationPoint(-73F, -68F, 105F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 74, 4, 21, 0F,0F, 7F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 223
		rightWingModel[65].setRotationPoint(-25F, -61F, 105F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 74, 7, 31, 0F,0F, 7F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 7F, -5F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 224
		rightWingModel[66].setRotationPoint(-25F, -57F, 100F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 74, 9, 31, 0F,0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 225
		rightWingModel[67].setRotationPoint(-25F, -50F, 100F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 74, 7, 31, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -5F, -5F); // Box 226
		rightWingModel[68].setRotationPoint(-25F, -41F, 100F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 74, 4, 21, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -5F, -7F); // Box 227
		rightWingModel[69].setRotationPoint(-25F, -34F, 105F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 28, 4, 21, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightWingModel[70].setRotationPoint(49F, -61F, 105F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 28, 7, 31, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		rightWingModel[71].setRotationPoint(49F, -57F, 100F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 28, 9, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightWingModel[72].setRotationPoint(49F, -50F, 100F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 28, 7, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 231
		rightWingModel[73].setRotationPoint(49F, -41F, 100F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 28, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 232
		rightWingModel[74].setRotationPoint(49F, -34F, 105F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 35, 9, 31, 0F,0F, 0F, 0F, 0F, -3F, -12F, 0F, -3F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -12F, 0F, -3F, -12F, 0F, 0F, 0F); // Box 233
		rightWingModel[75].setRotationPoint(77F, -50F, 100F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 0F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, 0F, 5F); // Box 234
		rightWingModel[76].setRotationPoint(77F, -57F, 105F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 35, 7, 7, 0F,0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F, 0F, -3F, 7F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -3F, 7F); // Box 235
		rightWingModel[77].setRotationPoint(77F, -61F, 112F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 35, 7, 21, 0F,0F, 0F, 5F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -8F, -9F, 0F, -8F, -9F, 0F, 0F, 0F); // Box 236
		rightWingModel[78].setRotationPoint(77F, -41F, 105F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 35, 7, 7, 0F,0F, -3F, 7F, 0F, 5F, -2F, 0F, 5F, -2F, 0F, -3F, 7F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F); // Box 237
		rightWingModel[79].setRotationPoint(77F, -37F, 112F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 1529, 521, textureX, textureY); // Box 357
		bodyWheelModel[1] = new ModelRendererTurbo(this, 225, 537, textureX, textureY); // Box 358
		bodyWheelModel[2] = new ModelRendererTurbo(this, 1849, 193, textureX, textureY); // Box 359
		bodyWheelModel[3] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 360
		bodyWheelModel[4] = new ModelRendererTurbo(this, 2033, 273, textureX, textureY); // Box 361
		bodyWheelModel[5] = new ModelRendererTurbo(this, 233, 313, textureX, textureY); // Box 362
		bodyWheelModel[6] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 363
		bodyWheelModel[7] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 364
		bodyWheelModel[8] = new ModelRendererTurbo(this, 657, 177, textureX, textureY); // Box 365
		bodyWheelModel[9] = new ModelRendererTurbo(this, 1993, 337, textureX, textureY); // Box 366
		bodyWheelModel[10] = new ModelRendererTurbo(this, 729, 345, textureX, textureY); // Box 367
		bodyWheelModel[11] = new ModelRendererTurbo(this, 1993, 353, textureX, textureY); // Box 368
		bodyWheelModel[12] = new ModelRendererTurbo(this, 1025, 361, textureX, textureY); // Box 369
		bodyWheelModel[13] = new ModelRendererTurbo(this, 1081, 361, textureX, textureY); // Box 370
		bodyWheelModel[14] = new ModelRendererTurbo(this, 1137, 361, textureX, textureY); // Box 371

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 43, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyWheelModel[0].setRotationPoint(-273F, -39F, 14F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 43, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyWheelModel[1].setRotationPoint(-273F, -39F, -15F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 47, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyWheelModel[2].setRotationPoint(-273F, -39F, -1.5F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyWheelModel[3].setRotationPoint(-273F, 8F, -3F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 47, 3, 0F,-19F, 0F, -4F, 19F, 0F, -4F, 19F, 0F, 4F, -19F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyWheelModel[4].setRotationPoint(-267F, -39F, 0F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 47, 3, 0F,-19F, 0F, 4F, 19F, 0F, 4F, 19F, 0F, -4F, -19F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyWheelModel[5].setRotationPoint(-267F, -39F, -3F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyWheelModel[6].setRotationPoint(-273F, 15F, -3F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyWheelModel[7].setRotationPoint(-272F, 26F, -1.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyWheelModel[8].setRotationPoint(-272F, 31F, -5.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 19, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyWheelModel[9].setRotationPoint(-280F, 29F, -10.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 19, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 367
		bodyWheelModel[10].setRotationPoint(-280F, 36F, -10.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 19, 6, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyWheelModel[11].setRotationPoint(-280F, 23F, -10.5F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 19, 6, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyWheelModel[12].setRotationPoint(-280F, 23F, 5.5F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 19, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyWheelModel[13].setRotationPoint(-280F, 29F, 5.5F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 19, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 371
		bodyWheelModel[14].setRotationPoint(-280F, 36F, 5.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1993, 465, textureX, textureY); // Box 372
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1561, 545, textureX, textureY); // Box 373
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1145, 169, textureX, textureY); // Box 374
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 375
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1617, 257, textureX, textureY); // Box 376
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 481, 465, textureX, textureY); // Box 377
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1313, 441, textureX, textureY); // Box 378
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1265, 177, textureX, textureY); // Box 379
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 209, 273, textureX, textureY); // Box 380
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 381
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 1905, 161, textureX, textureY); // Box 382
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 383
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 801, 217, textureX, textureY); // Box 384
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 569, 225, textureX, textureY); // Box 385
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 386
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 1233, 169, textureX, textureY); // Box 387
		leftWingWheelModel[16] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 388
		leftWingWheelModel[17] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 389
		leftWingWheelModel[18] = new ModelRendererTurbo(this, 1913, 561, textureX, textureY); // Box 390
		leftWingWheelModel[19] = new ModelRendererTurbo(this, 1017, 225, textureX, textureY); // Box 391
		leftWingWheelModel[20] = new ModelRendererTurbo(this, 729, 281, textureX, textureY); // Box 392
		leftWingWheelModel[21] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 393
		leftWingWheelModel[22] = new ModelRendererTurbo(this, 1089, 225, textureX, textureY); // Box 394
		leftWingWheelModel[23] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Box 395
		leftWingWheelModel[24] = new ModelRendererTurbo(this, 801, 233, textureX, textureY); // Box 396
		leftWingWheelModel[25] = new ModelRendererTurbo(this, 873, 297, textureX, textureY); // Box 397
		leftWingWheelModel[26] = new ModelRendererTurbo(this, 929, 233, textureX, textureY); // Box 398
		leftWingWheelModel[27] = new ModelRendererTurbo(this, 593, 169, textureX, textureY); // Box 399
		leftWingWheelModel[28] = new ModelRendererTurbo(this, 969, 233, textureX, textureY); // Box 400
		leftWingWheelModel[29] = new ModelRendererTurbo(this, 817, 169, textureX, textureY); // Box 401
		leftWingWheelModel[30] = new ModelRendererTurbo(this, 193, 321, textureX, textureY); // Box 402
		leftWingWheelModel[31] = new ModelRendererTurbo(this, 1017, 241, textureX, textureY); // Box 403
		leftWingWheelModel[32] = new ModelRendererTurbo(this, 1593, 569, textureX, textureY); // Box 404
		leftWingWheelModel[33] = new ModelRendererTurbo(this, 777, 193, textureX, textureY); // Box 405
		leftWingWheelModel[34] = new ModelRendererTurbo(this, 977, 201, textureX, textureY); // Box 406
		leftWingWheelModel[35] = new ModelRendererTurbo(this, 969, 249, textureX, textureY); // Box 407
		leftWingWheelModel[36] = new ModelRendererTurbo(this, 1089, 185, textureX, textureY); // Box 408
		leftWingWheelModel[37] = new ModelRendererTurbo(this, 753, 321, textureX, textureY); // Box 409
		leftWingWheelModel[38] = new ModelRendererTurbo(this, 1425, 249, textureX, textureY); // Box 410
		leftWingWheelModel[39] = new ModelRendererTurbo(this, 473, 505, textureX, textureY); // Box 411
		leftWingWheelModel[40] = new ModelRendererTurbo(this, 129, 593, textureX, textureY); // Box 412
		leftWingWheelModel[41] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 413
		leftWingWheelModel[42] = new ModelRendererTurbo(this, 961, 329, textureX, textureY); // Box 414
		leftWingWheelModel[43] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 415
		leftWingWheelModel[44] = new ModelRendererTurbo(this, 1425, 265, textureX, textureY); // Box 416
		leftWingWheelModel[45] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Box 418
		leftWingWheelModel[46] = new ModelRendererTurbo(this, 921, 361, textureX, textureY); // Box 419
		leftWingWheelModel[47] = new ModelRendererTurbo(this, 1161, 217, textureX, textureY); // Box 420
		leftWingWheelModel[48] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Box 421
		leftWingWheelModel[49] = new ModelRendererTurbo(this, 1873, 209, textureX, textureY); // Box 422

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 69, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		leftWingWheelModel[0].setRotationPoint(16F, -39F, -119F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 45, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		leftWingWheelModel[1].setRotationPoint(-4F, 22F, -119F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 63, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		leftWingWheelModel[2].setRotationPoint(29F, -38F, -116F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 63, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 30F, 0F, 0F); // Box 375
		leftWingWheelModel[3].setRotationPoint(49F, -38F, -120F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 63, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 30F, 0F, 0F); // Box 376
		leftWingWheelModel[4].setRotationPoint(49F, -38F, -112F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		leftWingWheelModel[5].setRotationPoint(-2F, 26F, -127F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 28, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		leftWingWheelModel[6].setRotationPoint(-14F, 22F, -128F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		leftWingWheelModel[7].setRotationPoint(-6F, 14F, -128F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		leftWingWheelModel[8].setRotationPoint(-6F, 34F, -128F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		leftWingWheelModel[9].setRotationPoint(-14F, 14F, -128F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		leftWingWheelModel[10].setRotationPoint(-6F, 13F, -128F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		leftWingWheelModel[11].setRotationPoint(6F, 14F, -128F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 384
		leftWingWheelModel[12].setRotationPoint(6F, 34F, -128F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 385
		leftWingWheelModel[13].setRotationPoint(-14F, 34F, -128F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 386
		leftWingWheelModel[14].setRotationPoint(-6F, 42F, -128F);

		leftWingWheelModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 387
		leftWingWheelModel[15].setRotationPoint(-15F, 22F, -128F);

		leftWingWheelModel[16].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 388
		leftWingWheelModel[16].setRotationPoint(14F, 22F, -128F);

		leftWingWheelModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 389
		leftWingWheelModel[17].setRotationPoint(14F, 22F, -107F);

		leftWingWheelModel[18].addShapeBox(0F, 0F, 0F, 28, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		leftWingWheelModel[18].setRotationPoint(-14F, 22F, -107F);

		leftWingWheelModel[19].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 391
		leftWingWheelModel[19].setRotationPoint(6F, 34F, -107F);

		leftWingWheelModel[20].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		leftWingWheelModel[20].setRotationPoint(-6F, 34F, -107F);

		leftWingWheelModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 393
		leftWingWheelModel[21].setRotationPoint(-6F, 42F, -107F);

		leftWingWheelModel[22].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 394
		leftWingWheelModel[22].setRotationPoint(-14F, 34F, -107F);

		leftWingWheelModel[23].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 395
		leftWingWheelModel[23].setRotationPoint(-15F, 22F, -107F);

		leftWingWheelModel[24].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		leftWingWheelModel[24].setRotationPoint(-14F, 14F, -107F);

		leftWingWheelModel[25].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		leftWingWheelModel[25].setRotationPoint(-6F, 14F, -107F);

		leftWingWheelModel[26].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		leftWingWheelModel[26].setRotationPoint(6F, 14F, -107F);

		leftWingWheelModel[27].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		leftWingWheelModel[27].setRotationPoint(-6F, 13F, -107F);

		leftWingWheelModel[28].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		leftWingWheelModel[28].setRotationPoint(43F, 14F, -128F);

		leftWingWheelModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		leftWingWheelModel[29].setRotationPoint(31F, 13F, -128F);

		leftWingWheelModel[30].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		leftWingWheelModel[30].setRotationPoint(31F, 14F, -128F);

		leftWingWheelModel[31].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		leftWingWheelModel[31].setRotationPoint(23F, 14F, -128F);

		leftWingWheelModel[32].addShapeBox(0F, 0F, 0F, 28, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		leftWingWheelModel[32].setRotationPoint(23F, 22F, -128F);

		leftWingWheelModel[33].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 405
		leftWingWheelModel[33].setRotationPoint(22F, 22F, -128F);

		leftWingWheelModel[34].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 406
		leftWingWheelModel[34].setRotationPoint(51F, 22F, -128F);

		leftWingWheelModel[35].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 407
		leftWingWheelModel[35].setRotationPoint(43F, 34F, -128F);

		leftWingWheelModel[36].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 408
		leftWingWheelModel[36].setRotationPoint(31F, 42F, -128F);

		leftWingWheelModel[37].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		leftWingWheelModel[37].setRotationPoint(31F, 34F, -128F);

		leftWingWheelModel[38].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 410
		leftWingWheelModel[38].setRotationPoint(23F, 34F, -128F);

		leftWingWheelModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		leftWingWheelModel[39].setRotationPoint(35F, 26F, -127F);

		leftWingWheelModel[40].addShapeBox(0F, 0F, 0F, 28, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		leftWingWheelModel[40].setRotationPoint(23F, 22F, -107F);

		leftWingWheelModel[41].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		leftWingWheelModel[41].setRotationPoint(23F, 14F, -107F);

		leftWingWheelModel[42].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		leftWingWheelModel[42].setRotationPoint(31F, 14F, -107F);

		leftWingWheelModel[43].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		leftWingWheelModel[43].setRotationPoint(31F, 13F, -107F);

		leftWingWheelModel[44].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		leftWingWheelModel[44].setRotationPoint(43F, 14F, -107F);

		leftWingWheelModel[45].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 418
		leftWingWheelModel[45].setRotationPoint(23F, 34F, -107F);

		leftWingWheelModel[46].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		leftWingWheelModel[46].setRotationPoint(31F, 34F, -107F);

		leftWingWheelModel[47].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 420
		leftWingWheelModel[47].setRotationPoint(31F, 42F, -107F);

		leftWingWheelModel[48].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 421
		leftWingWheelModel[48].setRotationPoint(43F, 34F, -107F);

		leftWingWheelModel[49].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 422
		leftWingWheelModel[49].setRotationPoint(51F, 22F, -107F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 161, 617, textureX, textureY); // Box 423
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 657, 657, textureX, textureY); // Box 424
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 1649, 401, textureX, textureY); // Box 425
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 121, 417, textureX, textureY); // Box 426
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 521, 417, textureX, textureY); // Box 427
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1985, 545, textureX, textureY); // Box 428
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 433, 617, textureX, textureY); // Box 429
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 89, 513, textureX, textureY); // Box 430
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 1625, 513, textureX, textureY); // Box 431
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 1017, 289, textureX, textureY); // Box 432
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 433
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 1273, 289, textureX, textureY); // Box 434
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Box 435
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 529, 305, textureX, textureY); // Box 436
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Box 437
		rightWingWheelModel[15] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 438
		rightWingWheelModel[16] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 439
		rightWingWheelModel[17] = new ModelRendererTurbo(this, 1065, 217, textureX, textureY); // Box 440
		rightWingWheelModel[18] = new ModelRendererTurbo(this, 1761, 617, textureX, textureY); // Box 441
		rightWingWheelModel[19] = new ModelRendererTurbo(this, 1017, 305, textureX, textureY); // Box 442
		rightWingWheelModel[20] = new ModelRendererTurbo(this, 89, 529, textureX, textureY); // Box 443
		rightWingWheelModel[21] = new ModelRendererTurbo(this, 553, 249, textureX, textureY); // Box 444
		rightWingWheelModel[22] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 445
		rightWingWheelModel[23] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 446
		rightWingWheelModel[24] = new ModelRendererTurbo(this, 529, 321, textureX, textureY); // Box 447
		rightWingWheelModel[25] = new ModelRendererTurbo(this, 321, 537, textureX, textureY); // Box 448
		rightWingWheelModel[26] = new ModelRendererTurbo(this, 1273, 321, textureX, textureY); // Box 449
		rightWingWheelModel[27] = new ModelRendererTurbo(this, 1225, 257, textureX, textureY); // Box 450
		rightWingWheelModel[28] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Box 451
		rightWingWheelModel[29] = new ModelRendererTurbo(this, 1265, 257, textureX, textureY); // Box 452
		rightWingWheelModel[30] = new ModelRendererTurbo(this, 361, 545, textureX, textureY); // Box 453
		rightWingWheelModel[31] = new ModelRendererTurbo(this, 1273, 337, textureX, textureY); // Box 454
		rightWingWheelModel[32] = new ModelRendererTurbo(this, 1977, 617, textureX, textureY); // Box 455
		rightWingWheelModel[33] = new ModelRendererTurbo(this, 769, 225, textureX, textureY); // Box 456
		rightWingWheelModel[34] = new ModelRendererTurbo(this, 1161, 225, textureX, textureY); // Box 457
		rightWingWheelModel[35] = new ModelRendererTurbo(this, 1641, 345, textureX, textureY); // Box 458
		rightWingWheelModel[36] = new ModelRendererTurbo(this, 1017, 273, textureX, textureY); // Box 459
		rightWingWheelModel[37] = new ModelRendererTurbo(this, 401, 545, textureX, textureY); // Box 460
		rightWingWheelModel[38] = new ModelRendererTurbo(this, 1793, 345, textureX, textureY); // Box 461
		rightWingWheelModel[39] = new ModelRendererTurbo(this, 1985, 641, textureX, textureY); // Box 462
		rightWingWheelModel[40] = new ModelRendererTurbo(this, 1537, 649, textureX, textureY); // Box 463
		rightWingWheelModel[41] = new ModelRendererTurbo(this, 1793, 361, textureX, textureY); // Box 464
		rightWingWheelModel[42] = new ModelRendererTurbo(this, 441, 545, textureX, textureY); // Box 465
		rightWingWheelModel[43] = new ModelRendererTurbo(this, 1561, 273, textureX, textureY); // Box 466
		rightWingWheelModel[44] = new ModelRendererTurbo(this, 1793, 385, textureX, textureY); // Box 467
		rightWingWheelModel[45] = new ModelRendererTurbo(this, 2017, 385, textureX, textureY); // Box 468
		rightWingWheelModel[46] = new ModelRendererTurbo(this, 481, 545, textureX, textureY); // Box 469
		rightWingWheelModel[47] = new ModelRendererTurbo(this, 945, 289, textureX, textureY); // Box 470
		rightWingWheelModel[48] = new ModelRendererTurbo(this, 1361, 401, textureX, textureY); // Box 471
		rightWingWheelModel[49] = new ModelRendererTurbo(this, 1281, 225, textureX, textureY); // Box 472
		rightWingWheelModel[50] = new ModelRendererTurbo(this, 1065, 217, textureX, textureY); // Box 473

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 69, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		rightWingWheelModel[0].setRotationPoint(16F, -39F, 111F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 45, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		rightWingWheelModel[1].setRotationPoint(-4F, 22F, 111F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 63, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		rightWingWheelModel[2].setRotationPoint(29F, -38F, 114F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 63, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 30F, 0F, 0F); // Box 426
		rightWingWheelModel[3].setRotationPoint(49F, -38F, 118F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 63, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 30F, 0F, 0F); // Box 427
		rightWingWheelModel[4].setRotationPoint(49F, -38F, 110F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		rightWingWheelModel[5].setRotationPoint(-2F, 26F, 104F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 28, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		rightWingWheelModel[6].setRotationPoint(-14F, 22F, 123F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		rightWingWheelModel[7].setRotationPoint(-6F, 14F, 123F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		rightWingWheelModel[8].setRotationPoint(-6F, 34F, 123F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		rightWingWheelModel[9].setRotationPoint(-14F, 14F, 123F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		rightWingWheelModel[10].setRotationPoint(-6F, 13F, 123F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		rightWingWheelModel[11].setRotationPoint(6F, 14F, 123F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 435
		rightWingWheelModel[12].setRotationPoint(6F, 34F, 123F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 436
		rightWingWheelModel[13].setRotationPoint(-14F, 34F, 123F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 437
		rightWingWheelModel[14].setRotationPoint(-6F, 42F, 123F);

		rightWingWheelModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 438
		rightWingWheelModel[15].setRotationPoint(-15F, 22F, 123F);

		rightWingWheelModel[16].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 439
		rightWingWheelModel[16].setRotationPoint(14F, 22F, 123F);

		rightWingWheelModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 440
		rightWingWheelModel[17].setRotationPoint(14F, 22F, 102F);

		rightWingWheelModel[18].addShapeBox(0F, 0F, 0F, 28, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		rightWingWheelModel[18].setRotationPoint(-14F, 22F, 102F);

		rightWingWheelModel[19].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 442
		rightWingWheelModel[19].setRotationPoint(6F, 34F, 102F);

		rightWingWheelModel[20].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		rightWingWheelModel[20].setRotationPoint(-6F, 34F, 102F);

		rightWingWheelModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 444
		rightWingWheelModel[21].setRotationPoint(-6F, 42F, 102F);

		rightWingWheelModel[22].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 445
		rightWingWheelModel[22].setRotationPoint(-14F, 34F, 102F);

		rightWingWheelModel[23].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 446
		rightWingWheelModel[23].setRotationPoint(-15F, 22F, 102F);

		rightWingWheelModel[24].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightWingWheelModel[24].setRotationPoint(-14F, 14F, 102F);

		rightWingWheelModel[25].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		rightWingWheelModel[25].setRotationPoint(-6F, 14F, 102F);

		rightWingWheelModel[26].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		rightWingWheelModel[26].setRotationPoint(6F, 14F, 102F);

		rightWingWheelModel[27].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		rightWingWheelModel[27].setRotationPoint(-6F, 13F, 102F);

		rightWingWheelModel[28].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightWingWheelModel[28].setRotationPoint(43F, 14F, 123F);

		rightWingWheelModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		rightWingWheelModel[29].setRotationPoint(31F, 13F, 123F);

		rightWingWheelModel[30].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		rightWingWheelModel[30].setRotationPoint(31F, 14F, 123F);

		rightWingWheelModel[31].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		rightWingWheelModel[31].setRotationPoint(23F, 14F, 123F);

		rightWingWheelModel[32].addShapeBox(0F, 0F, 0F, 28, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		rightWingWheelModel[32].setRotationPoint(23F, 22F, 123F);

		rightWingWheelModel[33].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 456
		rightWingWheelModel[33].setRotationPoint(22F, 22F, 123F);

		rightWingWheelModel[34].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 457
		rightWingWheelModel[34].setRotationPoint(51F, 22F, 123F);

		rightWingWheelModel[35].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 458
		rightWingWheelModel[35].setRotationPoint(43F, 34F, 123F);

		rightWingWheelModel[36].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 459
		rightWingWheelModel[36].setRotationPoint(31F, 42F, 123F);

		rightWingWheelModel[37].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		rightWingWheelModel[37].setRotationPoint(31F, 34F, 123F);

		rightWingWheelModel[38].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 461
		rightWingWheelModel[38].setRotationPoint(23F, 34F, 123F);

		rightWingWheelModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		rightWingWheelModel[39].setRotationPoint(35F, 26F, 104F);

		rightWingWheelModel[40].addShapeBox(0F, 0F, 0F, 28, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		rightWingWheelModel[40].setRotationPoint(23F, 22F, 102F);

		rightWingWheelModel[41].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,-3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		rightWingWheelModel[41].setRotationPoint(23F, 14F, 102F);

		rightWingWheelModel[42].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		rightWingWheelModel[42].setRotationPoint(31F, 14F, 102F);

		rightWingWheelModel[43].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightWingWheelModel[43].setRotationPoint(31F, 13F, 102F);

		rightWingWheelModel[44].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		rightWingWheelModel[44].setRotationPoint(43F, 14F, 102F);

		rightWingWheelModel[45].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 468
		rightWingWheelModel[45].setRotationPoint(23F, 34F, 102F);

		rightWingWheelModel[46].addShapeBox(0F, 0F, 0F, 12, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		rightWingWheelModel[46].setRotationPoint(31F, 34F, 102F);

		rightWingWheelModel[47].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 470
		rightWingWheelModel[47].setRotationPoint(31F, 42F, 102F);

		rightWingWheelModel[48].addShapeBox(0F, 0F, 0F, 8, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F); // Box 471
		rightWingWheelModel[48].setRotationPoint(43F, 34F, 102F);

		rightWingWheelModel[49].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 472
		rightWingWheelModel[49].setRotationPoint(51F, 22F, 102F);

		rightWingWheelModel[50].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 473
		rightWingWheelModel[50].setRotationPoint(22F, 22F, 102F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[8][4];
		propellerModels[0] = makeProp1(-182F, -46F, 116F);
		propellerModels[1] = makeProp2(-193F, -46F, 116F);
		propellerModels[2] = makeProp3(-111F, -49F, 227F);
		propellerModels[3] = makeProp4(-123F, -49F, 227F);
		propellerModels[4] = makeProp5(-182F, -46F, -116F);
		propellerModels[5] = makeProp6(-193F, -46F, -116F);
		propellerModels[6] = makeProp7(-111F, -49F, -227F);
		propellerModels[7] = makeProp8(-123F, -49F, -227F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[1].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[2].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[3].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[1].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[2].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[3].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 3.14159265F;
		prop[1].rotateAngleY = 3.14159265F;
		prop[2].rotateAngleY = 3.14159265F;
		prop[3].rotateAngleY = 3.14159265F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[1].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[2].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[3].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[1].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[2].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[3].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = -3.14159265F;
		prop[1].rotateAngleY = -3.14159265F;
		prop[2].rotateAngleY = -3.14159265F;
		prop[3].rotateAngleY = -3.14159265F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp5(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[1].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[2].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[3].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp6(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[1].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[2].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[3].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 3.14159265F;
		prop[1].rotateAngleY = 3.14159265F;
		prop[2].rotateAngleY = 3.14159265F;
		prop[3].rotateAngleY = 3.14159265F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp7(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[1].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[2].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[3].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp8(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 800, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[1].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[2].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[3].addBox(-0.5F, -55F, -3F, 1, 55, 6, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = -3.14159265F;
		prop[1].rotateAngleY = -3.14159265F;
		prop[2].rotateAngleY = -3.14159265F;
		prop[3].rotateAngleY = -3.14159265F;
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[45];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 22, 1085, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 86, 1085, textureX, textureY); // Box 18
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 126, 1085, textureX, textureY); // Box 19
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 158, 1085, textureX, textureY); // Box 20
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 206, 1085, textureX, textureY); // Box 33
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 238, 1085, textureX, textureY); // Box 34
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 118, 1101, textureX, textureY); // Box 35
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 70, 1085, textureX, textureY); // Box 40
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 158, 1101, textureX, textureY); // Box 41
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 182, 1101, textureX, textureY); // Box 48
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 222, 1093, textureX, textureY); // Box 49
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 70, 1101, textureX, textureY); // Box 50
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 22, 1109, textureX, textureY); // Box 51
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 246, 1101, textureX, textureY); // Box 52
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 94, 1109, textureX, textureY); // Box 53
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 110, 1085, textureX, textureY); // Box 54
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 142, 1085, textureX, textureY); // Box 55
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 190, 1085, textureX, textureY); // Box 56
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 222, 1085, textureX, textureY); // Box 57
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 118, 1117, textureX, textureY); // Box 58
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 62, 1117, textureX, textureY); // Box 59
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 158, 1117, textureX, textureY); // Box 60
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 190, 1117, textureX, textureY); // Box 61
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 254, 1085, textureX, textureY); // Box 62
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 222, 1117, textureX, textureY); // Box 63
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 238, 1117, textureX, textureY); // Box 64
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 46, 1117, textureX, textureY); // Box 65
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 22, 1125, textureX, textureY); // Box 66
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 78, 1117, textureX, textureY); // Box 67
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 94, 1125, textureX, textureY); // Box 68
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 142, 1117, textureX, textureY); // Box 69
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 174, 1117, textureX, textureY); // Box 70
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 206, 1117, textureX, textureY); // Box 71
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 118, 1125, textureX, textureY); // Box 72
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 254, 1125, textureX, textureY); // Box 73
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 254, 1117, textureX, textureY); // Box 74
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 46, 1133, textureX, textureY); // Box 75
		gun_2_Model[0][37] = new ModelRendererTurbo(this, 78, 1133, textureX, textureY); // Box 76
		gun_2_Model[0][38] = new ModelRendererTurbo(this, 142, 1133, textureX, textureY); // Box 77
		gun_2_Model[0][39] = new ModelRendererTurbo(this, 174, 1133, textureX, textureY); // Box 78
		gun_2_Model[0][40] = new ModelRendererTurbo(this, 214, 1133, textureX, textureY); // Box 79
		gun_2_Model[0][41] = new ModelRendererTurbo(this, 22, 1141, textureX, textureY); // Box 80
		gun_2_Model[0][42] = new ModelRendererTurbo(this, 54, 1141, textureX, textureY); // Box 81
		gun_2_Model[0][43] = new ModelRendererTurbo(this, 134, 1141, textureX, textureY); // Box 82
		gun_2_Model[0][44] = new ModelRendererTurbo(this, 158, 1141, textureX, textureY); // Box 83

		gun_2_Model[0][0].addShapeBox(-7F, -2F, -7F, 14, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][1].addShapeBox(7F, -2F, -7F, 2, 4, 14, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 18

		gun_2_Model[0][2].addShapeBox(8.5F, -2F, -5F, 2, 4, 10, 0F,0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0F, 0F, 0F); // Box 19

		gun_2_Model[0][3].addShapeBox(-5F, -6F, -5F, 10, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F); // Box 20

		gun_2_Model[0][4].addShapeBox(8.5F, -6F, -5F, 2, 4, 10, 0F,2.5F, 0F, -1F, -3F, 0F, -4F, -3F, 0F, -4F, 2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0F, 0F, 0F); // Box 33

		gun_2_Model[0][5].addShapeBox(5F, -6F, -5F, 2, 4, 10, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 2F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 2F); // Box 34

		gun_2_Model[0][6].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 35

		gun_2_Model[0][7].addShapeBox(6F, -8F, -4F, 2, 2, 8, 0F,1F, 0F, -1.25F, -2.25F, 0F, -4F, -2.25F, 0F, -4F, 1F, 0F, -1.25F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F); // Box 40

		gun_2_Model[0][8].addShapeBox(5F, -8F, -4F, 1, 2, 8, 0F,1F, 0F, 0F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 41

		gun_2_Model[0][9].addShapeBox(-5F, 2F, -5F, 10, 4, 10, 0F,2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48

		gun_2_Model[0][10].addShapeBox(5F, 2F, -5F, 2, 4, 10, 0F,-2F, 0F, 2F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 49

		gun_2_Model[0][11].addShapeBox(8.5F, 2F, -5F, 2, 4, 10, 0F,0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0F, 0F, 0F, 2.5F, 0F, -1F, -3F, 0F, -4F, -3F, 0F, -4F, 2.5F, 0F, -1F); // Box 50

		gun_2_Model[0][12].addShapeBox(-4F, 6F, -4F, 8, 2, 8, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_2_Model[0][13].addShapeBox(5F, 6F, -4F, 1, 2, 8, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, 1F, 0F, 0F); // Box 52

		gun_2_Model[0][14].addShapeBox(6F, 6F, -4F, 2, 2, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -1.25F, -2.25F, 0F, -4F, -2.25F, 0F, -4F, 1F, 0F, -1.25F); // Box 53

		gun_2_Model[0][15].addShapeBox(-4F, 6F, 5F, 8, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F); // Box 54

		gun_2_Model[0][16].addShapeBox(-5F, 2F, 8.5F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -1F, 0F, 2.5F, -1F, 0F, 2.5F, -4F, 0F, -3F, -4F, 0F, -3F); // Box 55

		gun_2_Model[0][17].addShapeBox(-4F, 6F, 6F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -1.25F, 0F, 1F, -1.25F, 0F, 1F, -4F, 0F, -2.25F, -4F, 0F, -2.25F); // Box 56

		gun_2_Model[0][18].addShapeBox(-5F, 2F, 5F, 10, 4, 2, 0F,2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 57

		gun_2_Model[0][19].addShapeBox(-7F, -2F, 7F, 14, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 58

		gun_2_Model[0][20].addShapeBox(-5F, -2F, 8.5F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 59

		gun_2_Model[0][21].addShapeBox(-5F, -6F, 8.5F, 10, 4, 2, 0F,-1F, 0F, 2.5F, -1F, 0F, 2.5F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 60

		gun_2_Model[0][22].addShapeBox(-5F, -6F, 5F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 61

		gun_2_Model[0][23].addShapeBox(-4F, -8F, 5F, 8, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62

		gun_2_Model[0][24].addShapeBox(-4F, -8F, 6F, 8, 2, 2, 0F,-1.25F, 0F, 1F, -1.25F, 0F, 1F, -4F, 0F, -2.25F, -4F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 63

		gun_2_Model[0][25].addShapeBox(-6F, 6F, -4F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -1.25F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.25F); // Box 64

		gun_2_Model[0][26].addShapeBox(-10.5F, 2F, -5F, 2, 4, 10, 0F,-0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -3F, 0F, -4F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, -3F, 0F, -4F); // Box 65

		gun_2_Model[0][27].addShapeBox(-8F, 6F, -4F, 2, 2, 8, 0F,-0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -2.25F, 0F, -4F, 1F, 0F, -1.25F, 1F, 0F, -1.25F, -2.25F, 0F, -4F); // Box 66

		gun_2_Model[0][28].addShapeBox(-7F, 2F, -5F, 2, 4, 10, 0F,1.5F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, 1.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 67

		gun_2_Model[0][29].addShapeBox(-9F, -2F, -7F, 2, 4, 14, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 68

		gun_2_Model[0][30].addShapeBox(-10.5F, -2F, -5F, 2, 4, 10, 0F,-0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F); // Box 69

		gun_2_Model[0][31].addShapeBox(-10.5F, -6F, -5F, 2, 4, 10, 0F,-3F, 0F, -4F, 2.5F, 0F, -1F, 2.5F, 0F, -1F, -3F, 0F, -4F, -0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F); // Box 70

		gun_2_Model[0][32].addShapeBox(-7F, -6F, -5F, 2, 4, 10, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1.5F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, 1.5F, 0F, 0F); // Box 71

		gun_2_Model[0][33].addShapeBox(-6F, -8F, -4F, 1, 2, 8, 0F,-1F, 0F, -1.25F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72

		gun_2_Model[0][34].addShapeBox(-8F, -8F, -4F, 2, 2, 8, 0F,-2.25F, 0F, -4F, 1F, 0F, -1.25F, 1F, 0F, -1.25F, -2.25F, 0F, -4F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F); // Box 73

		gun_2_Model[0][35].addShapeBox(-4F, 6F, -6F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 74

		gun_2_Model[0][36].addShapeBox(-5F, 2F, -10.5F, 10, 4, 2, 0F,-3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -1F, 0F, 2.5F, -1F, 0F, 2.5F); // Box 75

		gun_2_Model[0][37].addShapeBox(-4F, 6F, -8F, 8, 2, 2, 0F,-3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2.25F, -4F, 0F, -2.25F, -1.25F, 0F, 1F, -1.25F, 0F, 1F); // Box 76

		gun_2_Model[0][38].addShapeBox(-5F, 2F, -7F, 10, 4, 2, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 2F, 0F, -2F, 2F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77

		gun_2_Model[0][39].addShapeBox(-7F, -2F, -9F, 14, 4, 2, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78

		gun_2_Model[0][40].addShapeBox(-5F, -2F, -10.5F, 10, 4, 2, 0F,-3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79

		gun_2_Model[0][41].addShapeBox(-5F, -6F, -10.5F, 10, 4, 2, 0F,-4F, 0F, -3F, -4F, 0F, -3F, -1F, 0F, 2.5F, -1F, 0F, 2.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80

		gun_2_Model[0][42].addShapeBox(-5F, -6F, -7F, 10, 4, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 2F, 0F, -2F, 2F, 0F, -2F); // Box 81

		gun_2_Model[0][43].addShapeBox(-4F, -8F, -6F, 8, 2, 1, 0F,-1.25F, 0F, -1F, -1.25F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 82

		gun_2_Model[0][44].addShapeBox(-4F, -8F, -8F, 8, 2, 2, 0F,-4F, 0F, -2.25F, -4F, 0F, -2.25F, -1.25F, 0F, 1F, -1.25F, 0F, 1F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(482F, -65F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[4];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 182, 1141, textureX, textureY); // Box 84
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 214, 1141, textureX, textureY); // Box 85
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 22, 1085, textureX, textureY); // Box 47
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 86, 1085, textureX, textureY); // Box 48

		gun_2_Model[1][0].addShapeBox(8.5F, 0F, -5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84

		gun_2_Model[1][1].addShapeBox(8.5F, 0F, 4F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85

		gun_2_Model[1][2].addShapeBox(8.5F, -0.5F, 3.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47

		gun_2_Model[1][3].addShapeBox(8.5F, -0.5F, -5.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(482F, -65F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);
	}
}