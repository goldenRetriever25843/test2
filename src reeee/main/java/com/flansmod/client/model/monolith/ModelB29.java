//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2016 - 13:44:28
// Last changed on: 26.06.2016 - 13:44:28

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelB29 extends ModelPlane //Same as Filename
{
	int textureX = 4096;
	int textureY = 4096;

	public ModelB29() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[154];
		tailModel = new ModelRendererTurbo[93];
		leftWingModel = new ModelRendererTurbo[91];
		rightWingModel = new ModelRendererTurbo[83];
		bodyWheelModel = new ModelRendererTurbo[13];
		leftWingWheelModel = new ModelRendererTurbo[24];
		rightWingWheelModel = new ModelRendererTurbo[33];

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
		bodyModel[1] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1601, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 2121, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 2641, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 3161, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 1065, 17, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 3681, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 3745, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 3817, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 3881, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 3945, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 4009, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1593, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 1665, 17, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1737, 17, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1793, 17, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 2681, 105, textureX, textureY); // Box 89
		bodyModel[21] = new ModelRendererTurbo(this, 2713, 121, textureX, textureY); // Box 90
		bodyModel[22] = new ModelRendererTurbo(this, 2417, 137, textureX, textureY); // Box 91
		bodyModel[23] = new ModelRendererTurbo(this, 2953, 137, textureX, textureY); // Box 92
		bodyModel[24] = new ModelRendererTurbo(this, 2193, 153, textureX, textureY); // Box 93
		bodyModel[25] = new ModelRendererTurbo(this, 2713, 153, textureX, textureY); // Box 94
		bodyModel[26] = new ModelRendererTurbo(this, 2193, 169, textureX, textureY); // Box 95
		bodyModel[27] = new ModelRendererTurbo(this, 2713, 169, textureX, textureY); // Box 96
		bodyModel[28] = new ModelRendererTurbo(this, 2193, 185, textureX, textureY); // Box 97
		bodyModel[29] = new ModelRendererTurbo(this, 2729, 185, textureX, textureY); // Box 98
		bodyModel[30] = new ModelRendererTurbo(this, 3137, 49, textureX, textureY); // Box 99
		bodyModel[31] = new ModelRendererTurbo(this, 3329, 49, textureX, textureY); // Box 100
		bodyModel[32] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 101
		bodyModel[33] = new ModelRendererTurbo(this, 1337, 65, textureX, textureY); // Box 102
		bodyModel[34] = new ModelRendererTurbo(this, 1441, 65, textureX, textureY); // Box 103
		bodyModel[35] = new ModelRendererTurbo(this, 1969, 65, textureX, textureY); // Box 104
		bodyModel[36] = new ModelRendererTurbo(this, 3137, 65, textureX, textureY); // Box 105
		bodyModel[37] = new ModelRendererTurbo(this, 3329, 65, textureX, textureY); // Box 106
		bodyModel[38] = new ModelRendererTurbo(this, 3665, 65, textureX, textureY); // Box 107
		bodyModel[39] = new ModelRendererTurbo(this, 4017, 65, textureX, textureY); // Box 108
		bodyModel[40] = new ModelRendererTurbo(this, 1441, 121, textureX, textureY); // Box 176
		bodyModel[41] = new ModelRendererTurbo(this, 3945, 33, textureX, textureY); // Box 177
		bodyModel[42] = new ModelRendererTurbo(this, 2057, 121, textureX, textureY); // Box 178
		bodyModel[43] = new ModelRendererTurbo(this, 4049, 33, textureX, textureY); // Box 179
		bodyModel[44] = new ModelRendererTurbo(this, 3665, 129, textureX, textureY); // Box 180
		bodyModel[45] = new ModelRendererTurbo(this, 1097, 49, textureX, textureY); // Box 181
		bodyModel[46] = new ModelRendererTurbo(this, 3393, 153, textureX, textureY); // Box 182
		bodyModel[47] = new ModelRendererTurbo(this, 1721, 121, textureX, textureY); // Box 183
		bodyModel[48] = new ModelRendererTurbo(this, 1185, 161, textureX, textureY); // Box 183
		bodyModel[49] = new ModelRendererTurbo(this, 1441, 137, textureX, textureY); // Box 184
		bodyModel[50] = new ModelRendererTurbo(this, 1713, 137, textureX, textureY); // Box 185
		bodyModel[51] = new ModelRendererTurbo(this, 2057, 137, textureX, textureY); // Box 186
		bodyModel[52] = new ModelRendererTurbo(this, 1257, 161, textureX, textureY); // Box 188
		bodyModel[53] = new ModelRendererTurbo(this, 1969, 161, textureX, textureY); // Box 189
		bodyModel[54] = new ModelRendererTurbo(this, 2041, 161, textureX, textureY); // Box 190
		bodyModel[55] = new ModelRendererTurbo(this, 3601, 161, textureX, textureY); // Box 191
		bodyModel[56] = new ModelRendererTurbo(this, 3665, 161, textureX, textureY); // Box 192
		bodyModel[57] = new ModelRendererTurbo(this, 1729, 49, textureX, textureY); // Box 193
		bodyModel[58] = new ModelRendererTurbo(this, 2073, 49, textureX, textureY); // Box 194
		bodyModel[59] = new ModelRendererTurbo(this, 1097, 65, textureX, textureY); // Box 195
		bodyModel[60] = new ModelRendererTurbo(this, 1729, 65, textureX, textureY); // Box 196
		bodyModel[61] = new ModelRendererTurbo(this, 2073, 65, textureX, textureY); // Box 198
		bodyModel[62] = new ModelRendererTurbo(this, 4041, 121, textureX, textureY); // Box 199
		bodyModel[63] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 200
		bodyModel[64] = new ModelRendererTurbo(this, 697, 81, textureX, textureY); // Box 201
		bodyModel[65] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 202
		bodyModel[66] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 209
		bodyModel[67] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 210
		bodyModel[68] = new ModelRendererTurbo(this, 585, 105, textureX, textureY); // Box 211
		bodyModel[69] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 212
		bodyModel[70] = new ModelRendererTurbo(this, 3713, 81, textureX, textureY); // Box 213
		bodyModel[71] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 214
		bodyModel[72] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 215
		bodyModel[73] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 216
		bodyModel[74] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 217
		bodyModel[75] = new ModelRendererTurbo(this, 1857, 17, textureX, textureY); // Box 218
		bodyModel[76] = new ModelRendererTurbo(this, 2345, 17, textureX, textureY); // Box 219
		bodyModel[77] = new ModelRendererTurbo(this, 3721, 33, textureX, textureY); // Box 220
		bodyModel[78] = new ModelRendererTurbo(this, 1593, 9, textureX, textureY); // Box 221
		bodyModel[79] = new ModelRendererTurbo(this, 3601, 33, textureX, textureY); // Box 222
		bodyModel[80] = new ModelRendererTurbo(this, 3673, 33, textureX, textureY); // Box 223
		bodyModel[81] = new ModelRendererTurbo(this, 3721, 41, textureX, textureY); // Box 224
		bodyModel[82] = new ModelRendererTurbo(this, 2113, 9, textureX, textureY); // Box 225
		bodyModel[83] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 226
		bodyModel[84] = new ModelRendererTurbo(this, 3809, 9, textureX, textureY); // Box 227
		bodyModel[85] = new ModelRendererTurbo(this, 3817, 33, textureX, textureY); // Box 228
		bodyModel[86] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 229
		bodyModel[87] = new ModelRendererTurbo(this, 1185, 49, textureX, textureY); // Box 228
		bodyModel[88] = new ModelRendererTurbo(this, 3817, 41, textureX, textureY); // Box 229
		bodyModel[89] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 230
		bodyModel[90] = new ModelRendererTurbo(this, 4081, 41, textureX, textureY); // Box 231
		bodyModel[91] = new ModelRendererTurbo(this, 3873, 9, textureX, textureY); // Box 232
		bodyModel[92] = new ModelRendererTurbo(this, 1377, 49, textureX, textureY); // Box 233
		bodyModel[93] = new ModelRendererTurbo(this, 1057, 25, textureX, textureY); // Box 234
		bodyModel[94] = new ModelRendererTurbo(this, 1625, 49, textureX, textureY); // Box 235
		bodyModel[95] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 236
		bodyModel[96] = new ModelRendererTurbo(this, 1689, 49, textureX, textureY); // Box 237
		bodyModel[97] = new ModelRendererTurbo(this, 1201, 49, textureX, textureY); // Box 238
		bodyModel[98] = new ModelRendererTurbo(this, 1817, 49, textureX, textureY); // Box 239
		bodyModel[99] = new ModelRendererTurbo(this, 1585, 25, textureX, textureY); // Box 240
		bodyModel[100] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 241
		bodyModel[101] = new ModelRendererTurbo(this, 2009, 49, textureX, textureY); // Box 242
		bodyModel[102] = new ModelRendererTurbo(this, 2193, 49, textureX, textureY); // Box 243
		bodyModel[103] = new ModelRendererTurbo(this, 3681, 1, textureX, textureY); // Box 244
		bodyModel[104] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 245
		bodyModel[105] = new ModelRendererTurbo(this, 2337, 49, textureX, textureY); // Box 246
		bodyModel[106] = new ModelRendererTurbo(this, 1657, 25, textureX, textureY); // Box 247
		bodyModel[107] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 248
		bodyModel[108] = new ModelRendererTurbo(this, 2481, 49, textureX, textureY); // Box 249
		bodyModel[109] = new ModelRendererTurbo(this, 2657, 49, textureX, textureY); // Box 250
		bodyModel[110] = new ModelRendererTurbo(this, 1657, 17, textureX, textureY); // Box 251
		bodyModel[111] = new ModelRendererTurbo(this, 1873, 17, textureX, textureY); // Box 252
		bodyModel[112] = new ModelRendererTurbo(this, 1481, 49, textureX, textureY); // Box 253
		bodyModel[113] = new ModelRendererTurbo(this, 2625, 49, textureX, textureY); // Box 255
		bodyModel[114] = new ModelRendererTurbo(this, 2801, 49, textureX, textureY); // Box 256
		bodyModel[115] = new ModelRendererTurbo(this, 2945, 49, textureX, textureY); // Box 257
		bodyModel[116] = new ModelRendererTurbo(this, 2985, 49, textureX, textureY); // Box 258
		bodyModel[117] = new ModelRendererTurbo(this, 3601, 49, textureX, textureY); // Box 260
		bodyModel[118] = new ModelRendererTurbo(this, 3649, 49, textureX, textureY); // Box 261
		bodyModel[119] = new ModelRendererTurbo(this, 1729, 25, textureX, textureY); // Box 263
		bodyModel[120] = new ModelRendererTurbo(this, 4073, 1, textureX, textureY); // Box 267
		bodyModel[121] = new ModelRendererTurbo(this, 4089, 25, textureX, textureY); // Box 268
		bodyModel[122] = new ModelRendererTurbo(this, 3673, 49, textureX, textureY); // Box 269
		bodyModel[123] = new ModelRendererTurbo(this, 3497, 25, textureX, textureY); // Box 270
		bodyModel[124] = new ModelRendererTurbo(this, 3649, 33, textureX, textureY); // Box 271
		bodyModel[125] = new ModelRendererTurbo(this, 3745, 33, textureX, textureY); // Box 272
		bodyModel[126] = new ModelRendererTurbo(this, 1641, 49, textureX, textureY); // Box 273
		bodyModel[127] = new ModelRendererTurbo(this, 3001, 49, textureX, textureY); // Box 274
		bodyModel[128] = new ModelRendererTurbo(this, 1441, 313, textureX, textureY); // Box 382
		bodyModel[129] = new ModelRendererTurbo(this, 2193, 217, textureX, textureY); // Box 383
		bodyModel[130] = new ModelRendererTurbo(this, 2033, 217, textureX, textureY); // Box 384
		bodyModel[131] = new ModelRendererTurbo(this, 2521, 201, textureX, textureY); // Box 385
		bodyModel[132] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 386
		bodyModel[133] = new ModelRendererTurbo(this, 225, 393, textureX, textureY); // Box 481
		bodyModel[134] = new ModelRendererTurbo(this, 900, 1442, textureX, textureY); // Box 471
		bodyModel[135] = new ModelRendererTurbo(this, 2001, 1442, textureX, textureY); // Box 472
		bodyModel[136] = new ModelRendererTurbo(this, 2001, 1442, textureX, textureY); // Box 473
		bodyModel[137] = new ModelRendererTurbo(this, 914, 1442, textureX, textureY); // Box 474
		bodyModel[138] = new ModelRendererTurbo(this, 353, 2818, textureX, textureY); // Box 475
		bodyModel[139] = new ModelRendererTurbo(this, 353, 2818, textureX, textureY); // Box 476
		bodyModel[140] = new ModelRendererTurbo(this, 1689, 97, textureX, textureY); // Box 477
		bodyModel[141] = new ModelRendererTurbo(this, 1689, 97, textureX, textureY); // Box 478
		bodyModel[142] = new ModelRendererTurbo(this, 1689, 97, textureX, textureY); // Box 479
		bodyModel[143] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 480
		bodyModel[144] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 481
		bodyModel[145] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 482
		bodyModel[146] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 483
		bodyModel[147] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 484
		bodyModel[148] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 485
		bodyModel[149] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 486
		bodyModel[150] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 487
		bodyModel[151] = new ModelRendererTurbo(this, 1689, 97, textureX, textureY); // Box 488
		bodyModel[152] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 489
		bodyModel[153] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 490

		bodyModel[0].addShapeBox(0F, 0F, 0F, 256, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-237F, -84F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 256, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-237F, -83F, 11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 256, 2, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 6F, -3F, 0F, 6F, -3F); // Box 2
		bodyModel[2].setRotationPoint(-237F, -75F, 22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 256, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 3
		bodyModel[3].setRotationPoint(-237F, -67F, 27F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 256, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-237F, -57F, 30F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 256, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 5
		bodyModel[5].setRotationPoint(-237F, -50F, 30F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 256, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 6F, 0F, -2F, 6F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 6
		bodyModel[6].setRotationPoint(-237F, -39F, 27F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 256, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-237F, -25F, 14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 256, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-237F, -22F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 256, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-237F, -21F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 26, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-263F, -84F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, -8F, -1F, 0F, -8F, -2F, 0F, 0.5F, 1F, 0F, -0.5F, 0F, 0F, 6F, -3F, 0F, 6F, -4F); // Box 11
		bodyModel[11].setRotationPoint(-263F, -75F, 22F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 26, 7, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 12
		bodyModel[12].setRotationPoint(-263F, -57F, 30F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 26, 10, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 2F); // Box 13
		bodyModel[13].setRotationPoint(-263F, -67F, 27F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -2F, -3F); // Box 14
		bodyModel[14].setRotationPoint(-263F, -50F, 30F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 6F, 0F, -2F, 6F, 0F, 0F, -8F, 0F, -2F, -8F); // Box 15
		bodyModel[15].setRotationPoint(-263F, -39F, 27F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 26, 2, 7, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-263F, -25F, 14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-263F, -22F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-263F, -21F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 26, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -8.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, 8.5F, -1F); // Box 19
		bodyModel[19].setRotationPoint(-263F, -83F, 11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 256, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[20].setRotationPoint(-237F, -84F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 256, 2, 11, 0F,0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[21].setRotationPoint(-237F, -83F, -22F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 256, 2, 8, 0F,0F, -8F, -1F, 0F, -8F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 6F, -3F, 0F, 6F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 91
		bodyModel[22].setRotationPoint(-237F, -75F, -30F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 256, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 92
		bodyModel[23].setRotationPoint(-237F, -67F, -29F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 256, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[24].setRotationPoint(-237F, -57F, -32F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 256, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 94
		bodyModel[25].setRotationPoint(-237F, -50F, -32F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 256, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, 6F, 0F, -2F, 6F); // Box 95
		bodyModel[26].setRotationPoint(-237F, -39F, -29F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 256, 2, 7, 0F,0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[27].setRotationPoint(-237F, -25F, -21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 256, 2, 8, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[28].setRotationPoint(-237F, -22F, -14F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 256, 2, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[29].setRotationPoint(-237F, -21F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 26, 2, 11, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 99
		bodyModel[30].setRotationPoint(-263F, -84F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, -8F, -2F, 0F, -8F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, 6F, -4F, 0F, 6F, -3F, 0F, -0.5F, 0F, 0F, 0.5F, 1F); // Box 100
		bodyModel[31].setRotationPoint(-263F, -75F, -30F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 26, 7, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 101
		bodyModel[32].setRotationPoint(-263F, -57F, -32F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 26, 10, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 102
		bodyModel[33].setRotationPoint(-263F, -67F, -29F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -2F, 3F); // Box 103
		bodyModel[34].setRotationPoint(-263F, -50F, -32F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -8F, 0F, 0F, -8F, 0F, -2F, 6F, 0F, -4F, 6F); // Box 104
		bodyModel[35].setRotationPoint(-263F, -39F, -29F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 26, 2, 7, 0F,0F, 7F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 105
		bodyModel[36].setRotationPoint(-263F, -25F, -21F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 106
		bodyModel[37].setRotationPoint(-263F, -22F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 107
		bodyModel[38].setRotationPoint(-263F, -21F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 26, 2, 11, 0F,0F, -8.5F, -1F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 8.5F, -1F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 108
		bodyModel[39].setRotationPoint(-263F, -83F, -22F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 26, 7, 2, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 176
		bodyModel[40].setRotationPoint(-289F, -57F, 29F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 7, 2, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F); // Box 177
		bodyModel[41].setRotationPoint(-305F, -57F, 26F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 26, 10, 2, 0F,0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 178
		bodyModel[42].setRotationPoint(-289F, -67F, 26F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 9, 2, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -4F); // Box 179
		bodyModel[43].setRotationPoint(-305F, -66F, 23F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 7F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, 0F); // Box 180
		bodyModel[44].setRotationPoint(-289F, -23F, 0F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F,0F, 8F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 9F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -9F, 0F); // Box 181
		bodyModel[45].setRotationPoint(-305F, -29F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 2F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, -4F, 0F); // Box 182
		bodyModel[46].setRotationPoint(-289F, -29F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,0F, 2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 4F, -2F, 0F, -2F, 0F, 0F, 5F, 0F, 0F, 3F, 0F, 0F, -4F, -2F); // Box 183
		bodyModel[47].setRotationPoint(-305F, -36F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 26, 2, 7, 0F,0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -5F, -1F); // Box 183
		bodyModel[48].setRotationPoint(-289F, -32F, 14F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, -2F, 3F, 0F, -4F, -1F, 0F, -4F, 1F, 0F, -2F, -3F, 0F, -3F, 6F, 0F, 2F, 5F, 0F, 4F, -7F, 0F, -1F, -8F); // Box 184
		bodyModel[49].setRotationPoint(-289F, -45F, 26F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 26, 7, 2, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 6F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, 0F, -6F); // Box 185
		bodyModel[50].setRotationPoint(-289F, -50F, 29F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 26, 7, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 186
		bodyModel[51].setRotationPoint(-289F, -57F, -31F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 26, 2, 6, 0F,0F, 8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Box 188
		bodyModel[52].setRotationPoint(-289F, -23F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 4F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, -2F, 0F); // Box 189
		bodyModel[53].setRotationPoint(-289F, -29F, -14F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 26, 2, 7, 0F,0F, 5F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -1F, 0F); // Box 190
		bodyModel[54].setRotationPoint(-289F, -32F, -21F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 26, 11, 2, 0F,0F, -2F, -3F, 0F, -4F, 1F, 0F, -4F, -1F, 0F, -2F, 3F, 0F, -1F, -8F, 0F, 4F, -7F, 0F, 2F, 5F, 0F, -3F, 6F); // Box 191
		bodyModel[55].setRotationPoint(-289F, -45F, -28F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 26, 7, 2, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -6F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, 0F, 6F); // Box 192
		bodyModel[56].setRotationPoint(-289F, -50F, -31F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 16, 6, 2, 0F,0F, 1F, 3F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 1F, -3F, 0F, 0F, 5F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 0F, -5F); // Box 193
		bodyModel[57].setRotationPoint(-305F, -51F, 22F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 16, 6, 2, 0F,0F, 1F, 2F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 1F, -2F, 0F, -4F, 3F, 0F, 1F, -1F, 0F, 3F, -1F, 0F, -2F, -5F); // Box 194
		bodyModel[58].setRotationPoint(-305F, -44F, 19F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F,0F, 2F, 2F, 0F, -5F, 0F, 0F, -1F, 2F, 0F, 4F, -2F, 0F, -2F, 2F, 0F, 5F, 0F, 0F, 1F, 2F, 0F, -4F, -2F); // Box 195
		bodyModel[59].setRotationPoint(-305F, -38F, 14F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 16, 7, 2, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 7F); // Box 196
		bodyModel[60].setRotationPoint(-305F, -57F, -28F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 16, 2, 6, 0F,0F, 9F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 8F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -8F, 0F); // Box 198
		bodyModel[61].setRotationPoint(-305F, -29F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 2, 8, 0F,0F, 4F, -2F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, -4F, -2F, 0F, 3F, 0F, 0F, 5F, 0F, 0F, -2F, 0F); // Box 199
		bodyModel[62].setRotationPoint(-305F, -36F, -14F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 6, 2, 0F,0F, 1F, -3F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 1F, 3F, 0F, 0F, -5F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 0F, 5F); // Box 200
		bodyModel[63].setRotationPoint(-305F, -51F, -24F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 16, 6, 2, 0F,0F, 1F, -2F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 1F, 2F, 0F, -2F, -5F, 0F, 3F, -1F, 0F, 1F, -1F, 0F, -4F, 3F); // Box 201
		bodyModel[64].setRotationPoint(-305F, -44F, -21F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 16, 2, 4, 0F,0F, 4F, -2F, 0F, -1F, 2F, 0F, -5F, 0F, 0F, 2F, 2F, 0F, -4F, -2F, 0F, 1F, 2F, 0F, 5F, 0F, 0F, -2F, 2F); // Box 202
		bodyModel[65].setRotationPoint(-305F, -38F, -18F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -8.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, 8.5F, -1F); // Box 209
		bodyModel[66].setRotationPoint(-273F, -82F, 11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 210
		bodyModel[67].setRotationPoint(-273F, -83F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F); // Box 211
		bodyModel[68].setRotationPoint(-283F, -82F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 26, 10, 2, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 212
		bodyModel[69].setRotationPoint(-289F, -67F, -28F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 16, 9, 2, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 4F); // Box 213
		bodyModel[70].setRotationPoint(-305F, -66F, -25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 2, 10, 0F,0F, -8.5F, -1F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 8.5F, -1F, 0F, 7.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 214
		bodyModel[71].setRotationPoint(-273F, -82F, -21F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 215
		bodyModel[72].setRotationPoint(-273F, -83F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 216
		bodyModel[73].setRotationPoint(-283F, -82F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 217
		bodyModel[74].setRotationPoint(-273F, -73.5F, 20F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 218
		bodyModel[75].setRotationPoint(-283F, -79F, 11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 2F, 0F, -8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 219
		bodyModel[76].setRotationPoint(-283F, -74F, 18F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 1F, 0F, 0F, 1.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0F); // Box 220
		bodyModel[77].setRotationPoint(-283F, -73F, 18F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -7F, 2F, 0F, -7F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[78].setRotationPoint(-273F, -73.5F, -25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[79].setRotationPoint(-283F, -79F, -18F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -8F, 2F, 0F, -8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[80].setRotationPoint(-283F, -74F, -24F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 1.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -1.5F, -1F, 0F, -1F, 0F); // Box 224
		bodyModel[81].setRotationPoint(-283F, -73F, -19F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 225
		bodyModel[82].setRotationPoint(-293F, -73F, 16F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F); // Box 226
		bodyModel[83].setRotationPoint(-293F, -76F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 227
		bodyModel[84].setRotationPoint(-293F, -76F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 228
		bodyModel[85].setRotationPoint(-292F, -73F, 15F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[86].setRotationPoint(-293F, -73F, 15F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[87].setRotationPoint(-293F, -77F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 229
		bodyModel[88].setRotationPoint(-293F, -77F, 1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[89].setRotationPoint(-283F, -79F, -18F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -8F, 2F, 0F, -8F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[90].setRotationPoint(-283F, -74F, -24F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -7F, 2F, 0F, -7F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[91].setRotationPoint(-293F, -73F, -21F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 1F); // Box 233
		bodyModel[92].setRotationPoint(-293F, -76F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[93].setRotationPoint(-293F, -76F, -15F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -3F, 0F, -1F, 0F); // Box 235
		bodyModel[94].setRotationPoint(-292F, -73F, -16F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 236
		bodyModel[95].setRotationPoint(-293F, -73F, -16F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[96].setRotationPoint(-293F, -77F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[97].setRotationPoint(-293F, -77F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[98].setRotationPoint(-305F, -74F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 240
		bodyModel[99].setRotationPoint(-305F, -72F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[100].setRotationPoint(-305F, -72F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0.5F, 0F, 0F, 2F, -5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, -5F, 0F, -1F, 5F, 0F, 0F, 0F); // Box 242
		bodyModel[101].setRotationPoint(-304F, -72F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 1F, 0F, 3F, -3F, 0F, 3F, 3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0F, -1F); // Box 243
		bodyModel[102].setRotationPoint(-305F, -73F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 244
		bodyModel[103].setRotationPoint(-305F, -73F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 1F, 0F); // Box 245
		bodyModel[104].setRotationPoint(-305F, -74F, 1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[105].setRotationPoint(-305F, -74F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -6F, 2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[106].setRotationPoint(-305F, -72F, -16F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 248
		bodyModel[107].setRotationPoint(-305F, -72F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 5F, 0F, 2F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 5F, 0F, -2F, -5F, 0F, -0.5F, 0F); // Box 249
		bodyModel[108].setRotationPoint(-304F, -72F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, -1F, 0F, 3F, 3F, 0F, 3F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0F, 1F); // Box 250
		bodyModel[109].setRotationPoint(-305F, -73F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[110].setRotationPoint(-305F, -73F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[111].setRotationPoint(-305F, -74F, -5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[112].setRotationPoint(-312F, -65F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[113].setRotationPoint(-312F, -65F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -6F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 11F, 0F, 6F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 11F); // Box 256
		bodyModel[114].setRotationPoint(-312F, -66F, -18F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 6F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 12F, 0F, -6F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 12F); // Box 257
		bodyModel[115].setRotationPoint(-312F, -46F, -19F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 2F); // Box 258
		bodyModel[116].setRotationPoint(-312F, -47F, 2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -6F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -11F, 0F, 6F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -11F); // Box 260
		bodyModel[117].setRotationPoint(-312F, -66F, 16F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 6F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -12F, 0F, -6F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -12F); // Box 261
		bodyModel[118].setRotationPoint(-312F, -46F, 17F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 3F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 263
		bodyModel[119].setRotationPoint(-312F, -65F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[120].setRotationPoint(-312F, -60F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 268
		bodyModel[121].setRotationPoint(-312F, -52F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 2F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, -2F); // Box 269
		bodyModel[122].setRotationPoint(-312F, -47F, -4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -5F, 2F, 0F, -5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[123].setRotationPoint(-312F, -65F, -5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[124].setRotationPoint(-312F, -60F, -7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 272
		bodyModel[125].setRotationPoint(-312F, -52F, -7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 273
		bodyModel[126].setRotationPoint(-312F, -54F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[127].setRotationPoint(-312F, -54F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 34, 2, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[128].setRotationPoint(-263F, -47F, -29F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 26, 2, 50, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 383
		bodyModel[129].setRotationPoint(-289F, -47F, -25F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 16, 2, 36, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 384
		bodyModel[130].setRotationPoint(-305F, -47F, -18F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 385
		bodyModel[131].setRotationPoint(-305F, -45F, -18F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 386
		bodyModel[132].setRotationPoint(-305F, -40F, -13F);

		bodyModel[133].addBox(0F, 0F, 0F, 246, 2, 56, 0F); // Box 481
		bodyModel[133].setRotationPoint(-229F, -40F, -28F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1050, 1050, 2, 0F,-515F, -515F, -1.8F, -515F, -515F, 0F, -515F, -515F, 0F, -515F, -515F, 1.8F, -515F, -515F, -1.8F, -515F, -515F, 0F, -515F, -515F, 0F, -515F, -515F, 1.8F); // Box 471
		bodyModel[134].setRotationPoint(-491F, -582F, 29.2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1050, 1050, 2, 0F,-515F, -515F, 1.8F, -515F, -515F, 0F, -515F, -515F, 0F, -515F, -515F, -1.8F, -515F, -515F, 1.8F, -515F, -515F, 0F, -515F, -515F, 0F, -515F, -515F, -1.8F); // Box 472
		bodyModel[135].setRotationPoint(-491F, -582F, -30.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1050, 1050, 2, 0F,-506F, -507F, 0F, -506F, -507F, 0F, -506F, -507F, 0F, -506F, -507F, 0F, -506F, -507F, 0.6F, -506F, -507F, 0.6F, -506F, -507F, 0F, -506F, -507F, 0F); // Box 473
		bodyModel[136].setRotationPoint(-298F, -665F, -4.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1050, 1050, 2, 0F,-506F, -507F, 0F, -506F, -507F, 0F, -506F, -507F, 0F, -506F, -507F, 0F, -506F, -507F, 0F, -506F, -507F, 0F, -506F, -507F, 0.6F, -506F, -507F, 0.6F); // Box 474
		bodyModel[137].setRotationPoint(-298F, -665F, 4.7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1050, 2, 1050, 0F,-488F, 5.5F, -485F, -488F, 1F, -485F, -488F, 1F, -485F, -488F, 5.5F, -485F, -488F, 0F, -485F, -488F, 1F, -485F, -488F, 1F, -485F, -488F, 1F, -485F); // Box 475
		bodyModel[138].setRotationPoint(-586F, -70.9F, -788F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1050, 2, 1050, 0F,-488F, 5.5F, -485F, -488F, 1F, -485F, -488F, 1F, -485F, -488F, 5.5F, -485F, -488F, 0F, -485F, -488F, 1F, -485F, -488F, 1F, -485F, -488F, 1F, -485F); // Box 476
		bodyModel[139].setRotationPoint(-586F, -70.9F, -269F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F); // Box 477
		bodyModel[140].setRotationPoint(-209F, -88F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F); // Box 478
		bodyModel[141].setRotationPoint(25F, -88F, -4F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F); // Box 479
		bodyModel[142].setRotationPoint(-209F, -18F, -4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 480
		bodyModel[143].setRotationPoint(-226F, -93F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 481
		bodyModel[144].setRotationPoint(-226F, -93F, -5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 482
		bodyModel[145].setRotationPoint(-226F, -20F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 483
		bodyModel[146].setRotationPoint(-226F, -20F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 484
		bodyModel[147].setRotationPoint(26F, -93F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 485
		bodyModel[148].setRotationPoint(26F, -93F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 486
		bodyModel[149].setRotationPoint(299F, -80F, 0F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 487
		bodyModel[150].setRotationPoint(299F, -80F, -5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F, 4.5F, 2F, 2F); // Box 488
		bodyModel[151].setRotationPoint(-22F, -88F, -4F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 489
		bodyModel[152].setRotationPoint(-21F, -93F, 0F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F, 0F, -4.7F, -2.7F); // Box 490
		bodyModel[153].setRotationPoint(-21F, -93F, -5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1873, 17, textureX, textureY); // Box 20
		tailModel[1] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 45
		tailModel[2] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 46
		tailModel[3] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Box 47
		tailModel[4] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 48
		tailModel[5] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 49
		tailModel[6] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 50
		tailModel[7] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 51
		tailModel[8] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 52
		tailModel[9] = new ModelRendererTurbo(this, 993, 225, textureX, textureY); // Box 158
		tailModel[10] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 160
		tailModel[11] = new ModelRendererTurbo(this, 801, 313, textureX, textureY); // Box 161
		tailModel[12] = new ModelRendererTurbo(this, 225, 329, textureX, textureY); // Box 162
		tailModel[13] = new ModelRendererTurbo(this, 801, 329, textureX, textureY); // Box 164
		tailModel[14] = new ModelRendererTurbo(this, 761, 169, textureX, textureY); // Box 168
		tailModel[15] = new ModelRendererTurbo(this, 3969, 169, textureX, textureY); // Box 169
		tailModel[16] = new ModelRendererTurbo(this, 993, 145, textureX, textureY); // Box 170
		tailModel[17] = new ModelRendererTurbo(this, 3385, 97, textureX, textureY); // Box 171
		tailModel[18] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 172
		tailModel[19] = new ModelRendererTurbo(this, 3969, 113, textureX, textureY); // Box 173
		tailModel[20] = new ModelRendererTurbo(this, 1337, 121, textureX, textureY); // Box 174
		tailModel[21] = new ModelRendererTurbo(this, 3209, 97, textureX, textureY); // Box 175
		tailModel[22] = new ModelRendererTurbo(this, 1089, 121, textureX, textureY); // Box 176
		tailModel[23] = new ModelRendererTurbo(this, 225, 345, textureX, textureY); // Box 203
		tailModel[24] = new ModelRendererTurbo(this, 809, 345, textureX, textureY); // Box 204
		tailModel[25] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 205
		tailModel[26] = new ModelRendererTurbo(this, 809, 361, textureX, textureY); // Box 206
		tailModel[27] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 207
		tailModel[28] = new ModelRendererTurbo(this, 3817, 161, textureX, textureY); // Box 210
		tailModel[29] = new ModelRendererTurbo(this, 1057, 49, textureX, textureY); // Box 212
		tailModel[30] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 213
		tailModel[31] = new ModelRendererTurbo(this, 4081, 1, textureX, textureY); // Box 214
		tailModel[32] = new ModelRendererTurbo(this, 4089, 1, textureX, textureY); // Box 215
		tailModel[33] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 281
		tailModel[34] = new ModelRendererTurbo(this, 1625, 169, textureX, textureY); // Box 282
		tailModel[35] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 283
		tailModel[36] = new ModelRendererTurbo(this, 3713, 129, textureX, textureY); // Box 284
		tailModel[37] = new ModelRendererTurbo(this, 1401, 49, textureX, textureY); // Box 285
		tailModel[38] = new ModelRendererTurbo(this, 225, 377, textureX, textureY); // Box 287
		tailModel[39] = new ModelRendererTurbo(this, 3393, 169, textureX, textureY); // Box 290
		tailModel[40] = new ModelRendererTurbo(this, 1353, 145, textureX, textureY); // Box 292
		tailModel[41] = new ModelRendererTurbo(this, 3713, 97, textureX, textureY); // Box 293
		tailModel[42] = new ModelRendererTurbo(this, 3721, 49, textureX, textureY); // Box 295
		tailModel[43] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 300
		tailModel[44] = new ModelRendererTurbo(this, 2193, 89, textureX, textureY); // Box 301
		tailModel[45] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 303
		tailModel[46] = new ModelRendererTurbo(this, 4057, 161, textureX, textureY); // Box 304
		tailModel[47] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 307
		tailModel[48] = new ModelRendererTurbo(this, 1185, 105, textureX, textureY); // Box 308
		tailModel[49] = new ModelRendererTurbo(this, 3417, 185, textureX, textureY); // Box 309
		tailModel[50] = new ModelRendererTurbo(this, 3449, 185, textureX, textureY); // Box 310
		tailModel[51] = new ModelRendererTurbo(this, 1673, 169, textureX, textureY); // Box 311
		tailModel[52] = new ModelRendererTurbo(this, 3081, 201, textureX, textureY); // Box 292
		tailModel[53] = new ModelRendererTurbo(this, 2681, 241, textureX, textureY); // Box 293
		tailModel[54] = new ModelRendererTurbo(this, 1289, 313, textureX, textureY); // Box 294
		tailModel[55] = new ModelRendererTurbo(this, 1969, 137, textureX, textureY); // Box 295
		tailModel[56] = new ModelRendererTurbo(this, 1273, 177, textureX, textureY); // Box 296
		tailModel[57] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 297
		tailModel[58] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 376
		tailModel[59] = new ModelRendererTurbo(this, 721, 201, textureX, textureY); // Box 377
		tailModel[60] = new ModelRendererTurbo(this, 1793, 209, textureX, textureY); // Box 378
		tailModel[61] = new ModelRendererTurbo(this, 1825, 209, textureX, textureY); // Box 379
		tailModel[62] = new ModelRendererTurbo(this, 2001, 217, textureX, textureY); // Box 380
		tailModel[63] = new ModelRendererTurbo(this, 729, 113, textureX, textureY); // Box 381
		tailModel[64] = new ModelRendererTurbo(this, 3393, 169, textureX, textureY); // Box 461
		tailModel[65] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 462
		tailModel[66] = new ModelRendererTurbo(this, 801, 313, textureX, textureY); // Box 463
		tailModel[67] = new ModelRendererTurbo(this, 225, 329, textureX, textureY); // Box 464
		tailModel[68] = new ModelRendererTurbo(this, 801, 329, textureX, textureY); // Box 465
		tailModel[69] = new ModelRendererTurbo(this, 225, 345, textureX, textureY); // Box 466
		tailModel[70] = new ModelRendererTurbo(this, 809, 345, textureX, textureY); // Box 467
		tailModel[71] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 468
		tailModel[72] = new ModelRendererTurbo(this, 809, 361, textureX, textureY); // Box 469
		tailModel[73] = new ModelRendererTurbo(this, 225, 377, textureX, textureY); // Box 470
		tailModel[74] = new ModelRendererTurbo(this, 3713, 97, textureX, textureY); // Box 471
		tailModel[75] = new ModelRendererTurbo(this, 3721, 49, textureX, textureY); // Box 472
		tailModel[76] = new ModelRendererTurbo(this, 3081, 201, textureX, textureY); // Box 473
		tailModel[77] = new ModelRendererTurbo(this, 2681, 241, textureX, textureY); // Box 474
		tailModel[78] = new ModelRendererTurbo(this, 1289, 313, textureX, textureY); // Box 475
		tailModel[79] = new ModelRendererTurbo(this, 1969, 137, textureX, textureY); // Box 476
		tailModel[80] = new ModelRendererTurbo(this, 1273, 177, textureX, textureY); // Box 477
		tailModel[81] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 478
		tailModel[82] = new ModelRendererTurbo(this, 3393, 169, textureX, textureY); // Box 479
		tailModel[83] = new ModelRendererTurbo(this, 3393, 169, textureX, textureY); // Box 480
		tailModel[84] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 482
		tailModel[85] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 483
		tailModel[86] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 484
		tailModel[87] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 485
		tailModel[88] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 486
		tailModel[89] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 487
		tailModel[90] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 488
		tailModel[91] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 489
		tailModel[92] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 490

		tailModel[0].addShapeBox(0F, 0F, 0F, 228, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 0F); // Box 20
		tailModel[0].setRotationPoint(19F, -84F, 0F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 28, 94, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 45
		tailModel[1].setRotationPoint(219F, -177F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 28, 94, 8, 0F,0F, -51F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -51F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 46
		tailModel[2].setRotationPoint(191F, -177F, 0F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 28, 43, 8, 0F,0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -19F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 47
		tailModel[3].setRotationPoint(163F, -126F, 0F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 28, 24, 8, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -10F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 48
		tailModel[4].setRotationPoint(135F, -107F, 0F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 20, 14, 8, 0F,0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -7F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 49
		tailModel[5].setRotationPoint(115F, -97F, 0F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 23, 7, 8, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -6F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 50
		tailModel[6].setRotationPoint(92F, -90F, 0F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 28, 14, 1, 0F,-9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -9F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		tailModel[7].setRotationPoint(219F, -191F, 0F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 25, 14, 1, 0F,0F, 0F, 0F, -9F, -3F, 0F, -9F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[8].setRotationPoint(247F, -191F, 0F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 228, 2, 11, 0F,0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		tailModel[9].setRotationPoint(19F, -84F, -11F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 282, 7, 2, 0F,0F, 0F, 0F, 0F, 16F, -21F, 0F, 16F, 21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, -24F, 0F, -19F, 24F, 0F, 0F, 0F); // Box 160
		tailModel[10].setRotationPoint(19F, -57F, -32F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 282, 2, 8, 0F,0F, -8F, -1F, 0F, 1F, -19F, 0F, 5.5F, 14F, 0F, 0.5F, 0F, 0F, 6F, -3F, 0F, -3F, -21F, 0F, -6.5F, 15F, 0F, -0.5F, 0F); // Box 161
		tailModel[11].setRotationPoint(19F, -75F, -30F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 282, 10, 2, 0F,0F, 0F, 0F, 0F, 9F, -18F, 0F, 9F, 18F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -16F, -18F, 0F, -16F, 18F, 0F, 0F, -3F); // Box 162
		tailModel[12].setRotationPoint(19F, -67F, -29F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 282, 11, 2, 0F,0F, 0F, 0F, 0F, 19F, -24F, 0F, 19F, 24F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -28F, -27F, 0F, -29F, 25F, 0F, 0F, 3F); // Box 164
		tailModel[13].setRotationPoint(19F, -50F, -32F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 28, 94, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		tailModel[14].setRotationPoint(219F, -177F, -8F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 28, 94, 8, 0F,0F, -51F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -51F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		tailModel[15].setRotationPoint(191F, -177F, -8F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 28, 43, 8, 0F,0F, -19F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		tailModel[16].setRotationPoint(163F, -126F, -8F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 28, 24, 8, 0F,0F, -10F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		tailModel[17].setRotationPoint(135F, -107F, -8F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 20, 14, 8, 0F,0F, -7F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		tailModel[18].setRotationPoint(115F, -97F, -8F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 23, 7, 8, 0F,0F, -6F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		tailModel[19].setRotationPoint(92F, -90F, -8F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 28, 14, 1, 0F,-9F, -3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		tailModel[20].setRotationPoint(219F, -191F, -1F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 25, 14, 1, 0F,0F, 0F, -1F, -9F, -3F, -1F, -9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		tailModel[21].setRotationPoint(247F, -191F, -1F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 25, 70, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 5.2F, 16F, 0F, -1F, 16F, 0F, -1F, 0F, 0F, 5.2F); // Box 176
		tailModel[22].setRotationPoint(247F, -177F, -1F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 282, 2, 6, 0F,0F, 1F, 0F, 0F, 46F, -5F, 0F, 46F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -46F, -5F, 0F, -46F, 0F, 0F, 0F, 0F); // Box 203
		tailModel[23].setRotationPoint(19F, -21F, -6F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 282, 11, 2, 0F,0F, 0F, 0F, 0F, 29F, -24F, 0F, 29F, 22F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -39F, -24F, 0F, -40F, 22F, 0F, -2F, 6F); // Box 204
		tailModel[24].setRotationPoint(19F, -39F, -29F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 282, 2, 7, 0F,0F, 5F, 0F, 0F, 43F, -16F, 0F, 43F, 11F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -44F, -16F, 0F, -43F, 11F, 0F, 0F, 0F); // Box 205
		tailModel[25].setRotationPoint(19F, -25F, -21F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 282, 2, 8, 0F,0F, 3F, 0F, 0F, 46F, -11F, 0F, 45F, 5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -46F, -11F, 0F, -45F, 5F, 0F, 0F, 0F); // Box 206
		tailModel[26].setRotationPoint(19F, -22F, -14F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 12, 26, 1, 0F,0F, 0F, -2F, 0F, 0F, -2.6F, 0F, -2F, 2.6F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		tailModel[27].setRotationPoint(248F, -107F, -10F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 40, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 210
		tailModel[28].setRotationPoint(248F, -107F, -8F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 12, 26, 1, 0F,0F, -2F, 2F, 0F, -2F, 2.6F, 0F, 0F, -2.6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		tailModel[29].setRotationPoint(248F, -107F, 9F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 9, 27, 20, 0F,0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 213
		tailModel[30].setRotationPoint(239F, -107F, -10F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2.3F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		tailModel[31].setRotationPoint(272F, -107F, 8F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, -2.2F, 0F, 0F, -2.3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		tailModel[32].setRotationPoint(272F, -107F, -9F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 28, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 281
		tailModel[33].setRotationPoint(260F, -91F, 8F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 28, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 282
		tailModel[34].setRotationPoint(260F, -91F, -9F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, 0F, -2.9F, 0F, 0F, -3F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 283
		tailModel[35].setRotationPoint(286F, -107F, -9F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 2, 10, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		tailModel[36].setRotationPoint(286F, -91F, -9F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 2, 16, 1, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -3F, 0F, 0F, -2.9F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		tailModel[37].setRotationPoint(286F, -107F, 8F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 282, 2, 11, 0F,0F, -7.5F, 0F, 0F, -2.5F, -14F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 7.5F, 0F, 0F, 1.5F, -15F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 287
		tailModel[38].setRotationPoint(19F, -83F, -22F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 290
		tailModel[39].setRotationPoint(248F, -81F, -10F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 1, 10, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		tailModel[40].setRotationPoint(287F, -81F, -9F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,0F, 0F, 0.2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 293
		tailModel[41].setRotationPoint(288F, -83F, -7F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		tailModel[42].setRotationPoint(288F, -84F, -1F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 2, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		tailModel[43].setRotationPoint(299F, -82F, -4F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 2, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		tailModel[44].setRotationPoint(299F, -82F, 0F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 2, 28, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 303
		tailModel[45].setRotationPoint(16F, -67F, -29F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 2, 59, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 304
		tailModel[46].setRotationPoint(16F, -82F, -11F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 2, 43, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 307
		tailModel[47].setRotationPoint(16F, -73F, -22F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 2, 28, 7, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		tailModel[48].setRotationPoint(16F, -67F, 22F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 2, 59, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		tailModel[49].setRotationPoint(16F, -82F, 0F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 2, 43, 11, 0F,0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		tailModel[50].setRotationPoint(16F, -73F, 11F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 11, 12, 18, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 311
		tailModel[51].setRotationPoint(288F, -91F, -9F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 16, 4, 104, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 23F, 0F, 0F); // Box 292
		tailModel[52].setRotationPoint(228F, -73F, -117F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 3, 4, 104, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, -23F, 0F, 0F, 23F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -23F, 0F, 0F, 23F, -2F, 0F); // Box 293
		tailModel[53].setRotationPoint(225F, -73F, -117F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 21, 3, 104, 0F,0F, 0F, 0F, 0F, -2F, 0F, 11F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 11F, -1F, 0F, 0F, 0.5F, 0F); // Box 294
		tailModel[54].setRotationPoint(244F, -72.5F, -117F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		tailModel[55].setRotationPoint(228F, -72.5F, -125F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 21, 3, 8, 0F,0F, 0F, 0F, -8F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 296
		tailModel[56].setRotationPoint(244F, -72.5F, -125F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, -2F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, 8F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, 8F, -2F, 0F); // Box 297
		tailModel[57].setRotationPoint(233F, -73F, -125F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 2, 28, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 376
		tailModel[58].setRotationPoint(-231F, -67F, -29F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 2, 59, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 377
		tailModel[59].setRotationPoint(-231F, -82F, -11F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 2, 43, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Box 378
		tailModel[60].setRotationPoint(-231F, -73F, -22F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 2, 59, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		tailModel[61].setRotationPoint(-231F, -82F, 0F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 2, 43, 11, 0F,0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		tailModel[62].setRotationPoint(-231F, -73F, 11F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 2, 28, 7, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		tailModel[63].setRotationPoint(-231F, -67F, 22F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 39, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		tailModel[64].setRotationPoint(248F, -72F, -9F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 282, 7, 2, 0F,0F, 0F, 0F, 0F, 16F, 21F, 0F, 16F, -21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 24F, 0F, -19F, -24F, 0F, 0F, 0F); // Box 462
		tailModel[65].setRotationPoint(19F, -57F, 30F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 282, 2, 8, 0F,0F, 0.5F, 0F, 0F, 5.5F, 14F, 0F, 1F, -19F, 0F, -8F, -1F, 0F, -0.5F, 0F, 0F, -6.5F, 15F, 0F, -3F, -21F, 0F, 6F, -3F); // Box 463
		tailModel[66].setRotationPoint(19F, -75F, 22F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 282, 10, 2, 0F,0F, 0F, 0F, 0F, 9F, 18F, 0F, 9F, -18F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -16F, 18F, 0F, -16F, -18F, 0F, 0F, 3F); // Box 464
		tailModel[67].setRotationPoint(19F, -67F, 27F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 282, 11, 2, 0F,0F, 0F, 0F, 0F, 19F, 24F, 0F, 19F, -24F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -29F, 25F, 0F, -28F, -27F, 0F, 0F, -3F); // Box 465
		tailModel[68].setRotationPoint(19F, -50F, 30F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 282, 2, 6, 0F,0F, 0F, 0F, 0F, 46F, 0F, 0F, 46F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -46F, 0F, 0F, -46F, -5F, 0F, -1F, 0F); // Box 466
		tailModel[69].setRotationPoint(19F, -21F, 0F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 282, 11, 2, 0F,0F, 0F, 0F, 0F, 29F, 22F, 0F, 29F, -24F, 0F, 0F, 0F, 0F, -2F, 6F, 0F, -40F, 22F, 0F, -39F, -24F, 0F, 0F, -8F); // Box 467
		tailModel[70].setRotationPoint(19F, -39F, 27F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 282, 2, 7, 0F,0F, 0F, 0F, 0F, 43F, 11F, 0F, 43F, -16F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -43F, 11F, 0F, -44F, -16F, 0F, -5F, 0F); // Box 468
		tailModel[71].setRotationPoint(19F, -25F, 14F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 282, 2, 8, 0F,0F, 0F, 0F, 0F, 45F, 5F, 0F, 46F, -11F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -45F, 5F, 0F, -46F, -11F, 0F, -3F, 0F); // Box 469
		tailModel[72].setRotationPoint(19F, -22F, 6F);

		tailModel[73].addShapeBox(0F, 0F, 0F, 282, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, -2.5F, -14F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 1.5F, -15F, 0F, 7.5F, 0F); // Box 470
		tailModel[73].setRotationPoint(19F, -83F, 11F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F); // Box 471
		tailModel[74].setRotationPoint(288F, -83F, 1F);

		tailModel[75].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		tailModel[75].setRotationPoint(288F, -84F, -1F);

		tailModel[76].addShapeBox(0F, 0F, 0F, 16, 4, 104, 0F,23F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 473
		tailModel[76].setRotationPoint(228F, -73F, 13F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 3, 4, 104, 0F,23F, -2F, 0F, -23F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 23F, -2F, 0F, -23F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 474
		tailModel[77].setRotationPoint(225F, -73F, 13F);

		tailModel[78].addShapeBox(0F, 0F, 0F, 21, 3, 104, 0F,0F, 0.5F, 0F, 11F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 11F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 475
		tailModel[78].setRotationPoint(244F, -72.5F, 13F);

		tailModel[79].addShapeBox(0F, 0F, 0F, 16, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 476
		tailModel[79].setRotationPoint(228F, -72.5F, 117F);

		tailModel[80].addShapeBox(0F, 0F, 0F, 21, 3, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F); // Box 477
		tailModel[80].setRotationPoint(244F, -72.5F, 117F);

		tailModel[81].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,8F, -2F, 0F, -8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 8F, -2F, 0F, -8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 478
		tailModel[81].setRotationPoint(233F, -73F, 117F);

		tailModel[82].addShapeBox(0F, 0F, 0F, 40, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 479
		tailModel[82].setRotationPoint(248F, -81F, 9F);

		tailModel[83].addShapeBox(0F, 0F, 0F, 1, 12, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		tailModel[83].setRotationPoint(247F, -81F, -9F);

		tailModel[84].addShapeBox(0F, 0F, 0F, 2, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		tailModel[84].setRotationPoint(299F, -82F, -7F);

		tailModel[85].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		tailModel[85].setRotationPoint(299F, -80F, -8F);

		tailModel[86].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		tailModel[86].setRotationPoint(299F, -78F, -9F);

		tailModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		tailModel[87].setRotationPoint(299F, -69F, -6F);

		tailModel[88].addShapeBox(0F, 0F, 0F, 2, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		tailModel[88].setRotationPoint(299F, -82F, 0F);

		tailModel[89].addShapeBox(0F, 0F, 0F, 2, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		tailModel[89].setRotationPoint(299F, -82F, 3F);

		tailModel[90].addShapeBox(0F, 0F, 0F, 2, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		tailModel[90].setRotationPoint(299F, -80F, 7F);

		tailModel[91].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		tailModel[91].setRotationPoint(299F, -78F, 8F);

		tailModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		tailModel[92].setRotationPoint(299F, -69F, 4F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 2097, 201, textureX, textureY); // Box 109
		leftWingModel[1] = new ModelRendererTurbo(this, 3697, 193, textureX, textureY); // Box 110
		leftWingModel[2] = new ModelRendererTurbo(this, 2713, 201, textureX, textureY); // Box 111
		leftWingModel[3] = new ModelRendererTurbo(this, 2465, 201, textureX, textureY); // Box 112
		leftWingModel[4] = new ModelRendererTurbo(this, 1625, 217, textureX, textureY); // Box 113
		leftWingModel[5] = new ModelRendererTurbo(this, 3081, 297, textureX, textureY); // Box 114
		leftWingModel[6] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 115
		leftWingModel[7] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 116
		leftWingModel[8] = new ModelRendererTurbo(this, 1065, 89, textureX, textureY); // Box 117
		leftWingModel[9] = new ModelRendererTurbo(this, 1697, 89, textureX, textureY); // Box 118
		leftWingModel[10] = new ModelRendererTurbo(this, 2393, 97, textureX, textureY); // Box 119
		leftWingModel[11] = new ModelRendererTurbo(this, 3241, 97, textureX, textureY); // Box 120
		leftWingModel[12] = new ModelRendererTurbo(this, 2001, 217, textureX, textureY); // Box 121
		leftWingModel[13] = new ModelRendererTurbo(this, 3457, 297, textureX, textureY); // Box 122
		leftWingModel[14] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 123
		leftWingModel[15] = new ModelRendererTurbo(this, 1185, 105, textureX, textureY); // Box 124
		leftWingModel[16] = new ModelRendererTurbo(this, 3817, 113, textureX, textureY); // Box 125
		leftWingModel[17] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 126
		leftWingModel[18] = new ModelRendererTurbo(this, 1817, 137, textureX, textureY); // Box 127
		leftWingModel[19] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 128
		leftWingModel[20] = new ModelRendererTurbo(this, 3249, 153, textureX, textureY); // Box 129
		leftWingModel[21] = new ModelRendererTurbo(this, 1305, 177, textureX, textureY); // Box 130
		leftWingModel[22] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 131
		leftWingModel[23] = new ModelRendererTurbo(this, 3225, 193, textureX, textureY); // Box 132
		leftWingModel[24] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 133
		leftWingModel[25] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 134
		leftWingModel[26] = new ModelRendererTurbo(this, 1625, 97, textureX, textureY); // Box 135
		leftWingModel[27] = new ModelRendererTurbo(this, 3601, 113, textureX, textureY); // Box 136
		leftWingModel[28] = new ModelRendererTurbo(this, 4025, 81, textureX, textureY); // Box 137
		leftWingModel[29] = new ModelRendererTurbo(this, 3433, 49, textureX, textureY); // Box 138
		leftWingModel[30] = new ModelRendererTurbo(this, 3433, 65, textureX, textureY); // Box 139
		leftWingModel[31] = new ModelRendererTurbo(this, 3321, 97, textureX, textureY); // Box 140
		leftWingModel[32] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 141
		leftWingModel[33] = new ModelRendererTurbo(this, 3673, 89, textureX, textureY); // Box 142
		leftWingModel[34] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 143
		leftWingModel[35] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 144
		leftWingModel[36] = new ModelRendererTurbo(this, 1377, 121, textureX, textureY); // Box 145
		leftWingModel[37] = new ModelRendererTurbo(this, 1993, 121, textureX, textureY); // Box 146
		leftWingModel[38] = new ModelRendererTurbo(this, 3977, 129, textureX, textureY); // Box 147
		leftWingModel[39] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 148
		leftWingModel[40] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 149
		leftWingModel[41] = new ModelRendererTurbo(this, 3873, 33, textureX, textureY); // Box 150
		leftWingModel[42] = new ModelRendererTurbo(this, 1449, 81, textureX, textureY); // Box 151
		leftWingModel[43] = new ModelRendererTurbo(this, 3601, 193, textureX, textureY); // Box 152
		leftWingModel[44] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 153
		leftWingModel[45] = new ModelRendererTurbo(this, 2681, 201, textureX, textureY); // Box 154
		leftWingModel[46] = new ModelRendererTurbo(this, 2681, 89, textureX, textureY); // Box 155
		leftWingModel[47] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 156
		leftWingModel[48] = new ModelRendererTurbo(this, 1625, 137, textureX, textureY); // Box 157
		leftWingModel[49] = new ModelRendererTurbo(this, 1625, 185, textureX, textureY); // Box 328
		leftWingModel[50] = new ModelRendererTurbo(this, 1737, 209, textureX, textureY); // Box 367
		leftWingModel[51] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 411
		leftWingModel[52] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 412
		leftWingModel[53] = new ModelRendererTurbo(this, 1377, 137, textureX, textureY); // Box 413
		leftWingModel[54] = new ModelRendererTurbo(this, 2297, 217, textureX, textureY); // Box 414
		leftWingModel[55] = new ModelRendererTurbo(this, 649, 225, textureX, textureY); // Box 415
		leftWingModel[56] = new ModelRendererTurbo(this, 1625, 137, textureX, textureY); // Box 416
		leftWingModel[57] = new ModelRendererTurbo(this, 3617, 137, textureX, textureY); // Box 417
		leftWingModel[58] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 418
		leftWingModel[59] = new ModelRendererTurbo(this, 3817, 137, textureX, textureY); // Box 419
		leftWingModel[60] = new ModelRendererTurbo(this, 1393, 145, textureX, textureY); // Box 420
		leftWingModel[61] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 421
		leftWingModel[62] = new ModelRendererTurbo(this, 1473, 153, textureX, textureY); // Box 422
		leftWingModel[63] = new ModelRendererTurbo(this, 1753, 153, textureX, textureY); // Box 423
		leftWingModel[64] = new ModelRendererTurbo(this, 3465, 153, textureX, textureY); // Box 424
		leftWingModel[65] = new ModelRendererTurbo(this, 4073, 153, textureX, textureY); // Box 425
		leftWingModel[66] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 426
		leftWingModel[67] = new ModelRendererTurbo(this, 1329, 161, textureX, textureY); // Box 427
		leftWingModel[68] = new ModelRendererTurbo(this, 3913, 225, textureX, textureY); // Box 428
		leftWingModel[69] = new ModelRendererTurbo(this, 1817, 161, textureX, textureY); // Box 429
		leftWingModel[70] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 430
		leftWingModel[71] = new ModelRendererTurbo(this, 841, 185, textureX, textureY); // Box 431
		leftWingModel[72] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 432
		leftWingModel[73] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 433
		leftWingModel[74] = new ModelRendererTurbo(this, 2465, 233, textureX, textureY); // Box 434
		leftWingModel[75] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 435
		leftWingModel[76] = new ModelRendererTurbo(this, 3241, 169, textureX, textureY); // Box 436
		leftWingModel[77] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 437
		leftWingModel[78] = new ModelRendererTurbo(this, 2873, 233, textureX, textureY); // Box 438
		leftWingModel[79] = new ModelRendererTurbo(this, 1977, 185, textureX, textureY); // Box 439
		leftWingModel[80] = new ModelRendererTurbo(this, 3433, 185, textureX, textureY); // Box 440
		leftWingModel[81] = new ModelRendererTurbo(this, 3465, 185, textureX, textureY); // Box 441
		leftWingModel[82] = new ModelRendererTurbo(this, 3377, 193, textureX, textureY); // Box 442
		leftWingModel[83] = new ModelRendererTurbo(this, 3081, 233, textureX, textureY); // Box 443
		leftWingModel[84] = new ModelRendererTurbo(this, 3601, 193, textureX, textureY); // Box 444
		leftWingModel[85] = new ModelRendererTurbo(this, 3801, 193, textureX, textureY); // Box 445
		leftWingModel[86] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 456
		leftWingModel[87] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 457
		leftWingModel[88] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 458
		leftWingModel[89] = new ModelRendererTurbo(this, 1217, 209, textureX, textureY); // Box 459
		leftWingModel[90] = new ModelRendererTurbo(this, 1249, 209, textureX, textureY); // Box 460

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 57, 11, 249, 0F,-36F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -28F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		leftWingModel[0].setRotationPoint(-133F, -62F, -279F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 29, 7, 152, 0F,-22F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -17F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftWingModel[1].setRotationPoint(-105F, -74F, -431F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 57, 11, 249, 0F,-28F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -36F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 2F, -10F, 0F, 2F); // Box 111
		leftWingModel[2].setRotationPoint(-133F, -51F, -279F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 29, 5, 152, 0F,-17F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 112
		leftWingModel[3].setRotationPoint(-105F, -67F, -431F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 63, 11, 249, 0F,0F, 12F, 0F, -44F, 10F, 0F, -37F, -2F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -11F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		leftWingModel[4].setRotationPoint(-76F, -62F, -279F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 63, 11, 249, 0F,0F, 16F, 0F, -11F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, -44F, -22F, 0F, -37F, -2F, 2F, 0F, 0F, 2F); // Box 114
		leftWingModel[5].setRotationPoint(-76F, -51F, -279F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 21, 0F,-8F, 1F, -4F, 0F, 1F, -1F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftWingModel[6].setRotationPoint(-88F, -83F, -452F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 12, 3, 21, 0F,-6F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -4F, -3F, 0F, -4F, -1F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 116
		leftWingModel[7].setRotationPoint(-88F, -79F, -452F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftWingModel[8].setRotationPoint(-76F, -83F, -452F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 14, 3, 21, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftWingModel[9].setRotationPoint(-76F, -79F, -452F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 31, 3, 21, 0F,0F, 3F, 0F, -1F, 1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, -1F, -4F, -9F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 119
		leftWingModel[10].setRotationPoint(-62F, -79F, -452F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 31, 4, 21, 0F,0F, 1F, -1F, -1F, -3F, -9F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftWingModel[11].setRotationPoint(-62F, -83F, -452F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 19, 7, 152, 0F,0F, 9F, 0F, -5F, 9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -5F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftWingModel[12].setRotationPoint(-76F, -74F, -431F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 19, 7, 152, 0F,0F, 10F, 0F, -5F, 10F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -5F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftWingModel[13].setRotationPoint(-76F, -69F, -431F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 33, 10, 152, 0F,5F, 11F, 0F, -7F, 7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 5F, -14F, 0F, -7F, -17F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 123
		leftWingModel[14].setRotationPoint(-57F, -72F, -431F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 56, 18, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		leftWingModel[15].setRotationPoint(-167F, -65F, -109F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 56, 7, 36, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		leftWingModel[16].setRotationPoint(-167F, -72F, -109F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 56, 5, 28, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		leftWingModel[17].setRotationPoint(-167F, -77F, -105F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 56, 7, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 127
		leftWingModel[18].setRotationPoint(-167F, -47F, -109F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 56, 5, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 128
		leftWingModel[19].setRotationPoint(-167F, -40F, -105F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 56, 5, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 129
		leftWingModel[20].setRotationPoint(-154F, -46F, -219F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 56, 7, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 130
		leftWingModel[21].setRotationPoint(-154F, -53F, -223F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 56, 18, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		leftWingModel[22].setRotationPoint(-154F, -71F, -223F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 56, 7, 36, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftWingModel[23].setRotationPoint(-154F, -78F, -223F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 56, 5, 28, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		leftWingModel[24].setRotationPoint(-154F, -83F, -219F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 10, 7, 36, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 134
		leftWingModel[25].setRotationPoint(-111F, -72F, -109F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 12, 5, 32, 0F,0F, 0F, -4F, 0F, -5F, -14F, 0F, -5F, -14F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, 0F, 0F); // Box 135
		leftWingModel[26].setRotationPoint(-101F, -69F, -107F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 10, 8, 36, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftWingModel[27].setRotationPoint(-111F, -65F, -109F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 28, 0F,0F, 0F, -5F, 5F, -5F, -8F, 5F, -5F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 5F, 3F, -2F, 5F, 3F, -2F, 0F, 0F, 0F); // Box 137
		leftWingModel[28].setRotationPoint(-111F, -77F, -105F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 2F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 2F, 0F, 0F, 0F, 6F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, 0F, 6F); // Box 138
		leftWingModel[29].setRotationPoint(-101F, -70F, -97F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 2F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 2F, 0F, 0F, 0F, 6F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, 0F, 6F); // Box 139
		leftWingModel[30].setRotationPoint(-88F, -76F, -211F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 12, 5, 32, 0F,0F, 0F, -4F, 0F, -5F, -14F, 0F, -5F, -14F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, 0F, 0F); // Box 140
		leftWingModel[31].setRotationPoint(-88F, -75F, -221F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 10, 7, 36, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, 0F); // Box 141
		leftWingModel[32].setRotationPoint(-98F, -78F, -223F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 5, 5, 28, 0F,0F, 0F, -5F, 5F, -5F, -8F, 5F, -5F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 5F, 3F, -2F, 5F, 3F, -2F, 0F, 0F, 0F); // Box 142
		leftWingModel[33].setRotationPoint(-98F, -83F, -219F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 10, 8, 36, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		leftWingModel[34].setRotationPoint(-98F, -71F, -223F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 10, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 144
		leftWingModel[35].setRotationPoint(-98F, -61F, -223F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 10, 7, 36, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 145
		leftWingModel[36].setRotationPoint(-98F, -53F, -223F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 12, 5, 32, 0F,0F, 0F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -14F, 0F, -5F, -14F, 0F, 0F, -4F); // Box 146
		leftWingModel[37].setRotationPoint(-88F, -54F, -221F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 12, 7, 32, 0F,0F, 0F, 2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, -1F, -10F, 0F, 0F, 0F); // Box 147
		leftWingModel[38].setRotationPoint(-88F, -61F, -221F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 5, 5, 28, 0F,0F, 0F, 0F, 5F, 3F, -2F, 5F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 5F, -5F, -8F, 5F, -5F, -8F, 0F, 0F, -5F); // Box 148
		leftWingModel[39].setRotationPoint(-98F, -46F, -219F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 6F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, 0F, 6F, 0F, 2F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 2F, 0F); // Box 149
		leftWingModel[40].setRotationPoint(-88F, -49F, -211F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -4F); // Box 150
		leftWingModel[41].setRotationPoint(-76F, -55F, -211F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 4, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F); // Box 151
		leftWingModel[42].setRotationPoint(-76F, -61F, -215F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 79, 7, 36, 0F,0F, 0F, 0F, 0F, 4F, -8F, 0F, 4F, -8F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -12F, 0F, -6F, -12F, 0F, 0F, -4F); // Box 152
		leftWingModel[43].setRotationPoint(-111F, -47F, -109F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 30, 5, 20, 0F,0F, 0F, 0F, 0F, 2F, -10F, 0F, 2F, -10F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, -10F, 0F, -7F, -10F, 0F, 0F, -4F); // Box 153
		leftWingModel[44].setRotationPoint(-32F, -51F, -101F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 74, 5, 28, 0F,0F, 0F, 0F, 5F, 6F, -8F, 5F, 6F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 5F, -10F, -12F, 5F, -10F, -12F, 0F, 0F, -5F); // Box 154
		leftWingModel[45].setRotationPoint(-111F, -40F, -105F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 30, 1, 12, 0F,0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, 0F, -4F); // Box 155
		leftWingModel[46].setRotationPoint(-32F, -46F, -97F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 79, 7, 36, 0F,0F, 0F, -4F, 0F, 2F, -12F, 0F, 2F, -12F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, 0F); // Box 156
		leftWingModel[47].setRotationPoint(-111F, -54F, -109F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 30, 5, 20, 0F,0F, 0F, -4F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 0F); // Box 157
		leftWingModel[48].setRotationPoint(-32F, -56F, -101F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		leftWingModel[49].setRotationPoint(-285F, -6F, 4F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 18, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		leftWingModel[50].setRotationPoint(-118.5F, -14F, 79F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		leftWingModel[51].setRotationPoint(-172F, -65F, -76F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 412
		leftWingModel[52].setRotationPoint(-172F, -72F, -80F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 413
		leftWingModel[53].setRotationPoint(-172F, -77F, -85F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		leftWingModel[54].setRotationPoint(-172F, -77F, -100F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		leftWingModel[55].setRotationPoint(-172F, -38F, -100F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		leftWingModel[56].setRotationPoint(-172F, -40F, -85F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		leftWingModel[57].setRotationPoint(-172F, -47F, -80F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		leftWingModel[58].setRotationPoint(-172F, -65F, -109F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 419
		leftWingModel[59].setRotationPoint(-172F, -72F, -105F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		leftWingModel[60].setRotationPoint(-172F, -47F, -105F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 421
		leftWingModel[61].setRotationPoint(-172F, -77F, -100F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		leftWingModel[62].setRotationPoint(-172F, -40F, -100F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 423
		leftWingModel[63].setRotationPoint(-159F, -83F, -214F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		leftWingModel[64].setRotationPoint(-159F, -46F, -214F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		leftWingModel[65].setRotationPoint(-159F, -53F, -219F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		leftWingModel[66].setRotationPoint(-159F, -71F, -223F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 427
		leftWingModel[67].setRotationPoint(-159F, -78F, -219F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		leftWingModel[68].setRotationPoint(-159F, -83F, -214F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 429
		leftWingModel[69].setRotationPoint(-159F, -83F, -199F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 430
		leftWingModel[70].setRotationPoint(-159F, -78F, -194F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		leftWingModel[71].setRotationPoint(-159F, -71F, -190F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		leftWingModel[72].setRotationPoint(-159F, -53F, -194F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		leftWingModel[73].setRotationPoint(-159F, -46F, -199F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		leftWingModel[74].setRotationPoint(-159F, -44F, -214F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 435
		leftWingModel[75].setRotationPoint(-176F, -63F, -95F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		leftWingModel[76].setRotationPoint(-172F, -55F, -80F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		leftWingModel[77].setRotationPoint(-172F, -48F, -85F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		leftWingModel[78].setRotationPoint(-172F, -46F, -100F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		leftWingModel[79].setRotationPoint(-172F, -48F, -100F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		leftWingModel[80].setRotationPoint(-172F, -55F, -105F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		leftWingModel[81].setRotationPoint(-159F, -61F, -194F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		leftWingModel[82].setRotationPoint(-159F, -54F, -199F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		leftWingModel[83].setRotationPoint(-159F, -52F, -214F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		leftWingModel[84].setRotationPoint(-159F, -54F, -214F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		leftWingModel[85].setRotationPoint(-159F, -61F, -219F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		leftWingModel[86].setRotationPoint(-182F, -63F, -95F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 457
		leftWingModel[87].setRotationPoint(-185F, -63F, -95F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 458
		leftWingModel[88].setRotationPoint(-172F, -69F, -209F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		leftWingModel[89].setRotationPoint(-169F, -69F, -209F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 460
		leftWingModel[90].setRotationPoint(-163F, -69F, -209F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 3233, 33, textureX, textureY); // Box 30
		rightWingModel[1] = new ModelRendererTurbo(this, 3601, 33, textureX, textureY); // Box 31
		rightWingModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 32
		rightWingModel[3] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 33
		rightWingModel[4] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 34
		rightWingModel[5] = new ModelRendererTurbo(this, 1249, 49, textureX, textureY); // Box 35
		rightWingModel[6] = new ModelRendererTurbo(this, 3601, 33, textureX, textureY); // Box 36
		rightWingModel[7] = new ModelRendererTurbo(this, 3673, 33, textureX, textureY); // Box 37
		rightWingModel[8] = new ModelRendererTurbo(this, 3817, 33, textureX, textureY); // Box 38
		rightWingModel[9] = new ModelRendererTurbo(this, 3889, 33, textureX, textureY); // Box 39
		rightWingModel[10] = new ModelRendererTurbo(this, 3961, 33, textureX, textureY); // Box 40
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 41
		rightWingModel[12] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 42
		rightWingModel[13] = new ModelRendererTurbo(this, 1625, 49, textureX, textureY); // Box 43
		rightWingModel[14] = new ModelRendererTurbo(this, 1969, 49, textureX, textureY); // Box 44
		rightWingModel[15] = new ModelRendererTurbo(this, 1185, 49, textureX, textureY); // Box 53
		rightWingModel[16] = new ModelRendererTurbo(this, 1817, 49, textureX, textureY); // Box 54
		rightWingModel[17] = new ModelRendererTurbo(this, 2193, 49, textureX, textureY); // Box 55
		rightWingModel[18] = new ModelRendererTurbo(this, 2329, 49, textureX, textureY); // Box 56
		rightWingModel[19] = new ModelRendererTurbo(this, 2481, 49, textureX, textureY); // Box 57
		rightWingModel[20] = new ModelRendererTurbo(this, 2657, 49, textureX, textureY); // Box 58
		rightWingModel[21] = new ModelRendererTurbo(this, 2793, 49, textureX, textureY); // Box 59
		rightWingModel[22] = new ModelRendererTurbo(this, 2985, 49, textureX, textureY); // Box 60
		rightWingModel[23] = new ModelRendererTurbo(this, 3177, 49, textureX, textureY); // Box 61
		rightWingModel[24] = new ModelRendererTurbo(this, 3817, 65, textureX, textureY); // Box 62
		rightWingModel[25] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 63
		rightWingModel[26] = new ModelRendererTurbo(this, 1377, 49, textureX, textureY); // Box 64
		rightWingModel[27] = new ModelRendererTurbo(this, 1625, 49, textureX, textureY); // Box 65
		rightWingModel[28] = new ModelRendererTurbo(this, 1057, 49, textureX, textureY); // Box 66
		rightWingModel[29] = new ModelRendererTurbo(this, 1337, 49, textureX, textureY); // Box 67
		rightWingModel[30] = new ModelRendererTurbo(this, 1441, 49, textureX, textureY); // Box 68
		rightWingModel[31] = new ModelRendererTurbo(this, 2009, 49, textureX, textureY); // Box 69
		rightWingModel[32] = new ModelRendererTurbo(this, 3369, 49, textureX, textureY); // Box 70
		rightWingModel[33] = new ModelRendererTurbo(this, 1689, 49, textureX, textureY); // Box 71
		rightWingModel[34] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 72
		rightWingModel[35] = new ModelRendererTurbo(this, 3601, 65, textureX, textureY); // Box 73
		rightWingModel[36] = new ModelRendererTurbo(this, 3953, 65, textureX, textureY); // Box 74
		rightWingModel[37] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 75
		rightWingModel[38] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 76
		rightWingModel[39] = new ModelRendererTurbo(this, 2945, 49, textureX, textureY); // Box 77
		rightWingModel[40] = new ModelRendererTurbo(this, 1969, 49, textureX, textureY); // Box 78
		rightWingModel[41] = new ModelRendererTurbo(this, 3649, 33, textureX, textureY); // Box 79
		rightWingModel[42] = new ModelRendererTurbo(this, 2625, 49, textureX, textureY); // Box 80
		rightWingModel[43] = new ModelRendererTurbo(this, 2481, 89, textureX, textureY); // Box 83
		rightWingModel[44] = new ModelRendererTurbo(this, 1353, 89, textureX, textureY); // Box 84
		rightWingModel[45] = new ModelRendererTurbo(this, 1817, 97, textureX, textureY); // Box 85
		rightWingModel[46] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 86
		rightWingModel[47] = new ModelRendererTurbo(this, 2193, 97, textureX, textureY); // Box 87
		rightWingModel[48] = new ModelRendererTurbo(this, 2001, 89, textureX, textureY); // Box 88
		rightWingModel[49] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 387
		rightWingModel[50] = new ModelRendererTurbo(this, 2625, 57, textureX, textureY); // Box 388
		rightWingModel[51] = new ModelRendererTurbo(this, 2657, 57, textureX, textureY); // Box 389
		rightWingModel[52] = new ModelRendererTurbo(this, 3705, 161, textureX, textureY); // Box 390
		rightWingModel[53] = new ModelRendererTurbo(this, 3801, 193, textureX, textureY); // Box 391
		rightWingModel[54] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 392
		rightWingModel[55] = new ModelRendererTurbo(this, 1481, 81, textureX, textureY); // Box 393
		rightWingModel[56] = new ModelRendererTurbo(this, 3465, 113, textureX, textureY); // Box 394
		rightWingModel[57] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 395
		rightWingModel[58] = new ModelRendererTurbo(this, 1441, 89, textureX, textureY); // Box 396
		rightWingModel[59] = new ModelRendererTurbo(this, 3665, 89, textureX, textureY); // Box 397
		rightWingModel[60] = new ModelRendererTurbo(this, 3329, 97, textureX, textureY); // Box 398
		rightWingModel[61] = new ModelRendererTurbo(this, 3601, 113, textureX, textureY); // Box 399
		rightWingModel[62] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 400
		rightWingModel[63] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 401
		rightWingModel[64] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 402
		rightWingModel[65] = new ModelRendererTurbo(this, 1057, 121, textureX, textureY); // Box 403
		rightWingModel[66] = new ModelRendererTurbo(this, 2105, 217, textureX, textureY); // Box 404
		rightWingModel[67] = new ModelRendererTurbo(this, 2209, 121, textureX, textureY); // Box 405
		rightWingModel[68] = new ModelRendererTurbo(this, 3617, 121, textureX, textureY); // Box 406
		rightWingModel[69] = new ModelRendererTurbo(this, 1817, 137, textureX, textureY); // Box 407
		rightWingModel[70] = new ModelRendererTurbo(this, 3601, 129, textureX, textureY); // Box 408
		rightWingModel[71] = new ModelRendererTurbo(this, 585, 137, textureX, textureY); // Box 409
		rightWingModel[72] = new ModelRendererTurbo(this, 2193, 217, textureX, textureY); // Box 410
		rightWingModel[73] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 446
		rightWingModel[74] = new ModelRendererTurbo(this, 737, 201, textureX, textureY); // Box 447
		rightWingModel[75] = new ModelRendererTurbo(this, 3129, 233, textureX, textureY); // Box 448
		rightWingModel[76] = new ModelRendererTurbo(this, 1457, 201, textureX, textureY); // Box 449
		rightWingModel[77] = new ModelRendererTurbo(this, 1481, 201, textureX, textureY); // Box 450
		rightWingModel[78] = new ModelRendererTurbo(this, 2681, 201, textureX, textureY); // Box 451
		rightWingModel[79] = new ModelRendererTurbo(this, 3225, 201, textureX, textureY); // Box 452
		rightWingModel[80] = new ModelRendererTurbo(this, 4049, 233, textureX, textureY); // Box 453
		rightWingModel[81] = new ModelRendererTurbo(this, 3393, 201, textureX, textureY); // Box 454
		rightWingModel[82] = new ModelRendererTurbo(this, 3617, 201, textureX, textureY); // Box 455

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 57, 11, 249, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, -36F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, -28F, -16F, 0F); // Box 30
		rightWingModel[0].setRotationPoint(-133F, -62F, 30F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 29, 7, 152, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, -22F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -17F, -12F, 0F); // Box 31
		rightWingModel[1].setRotationPoint(-105F, -74F, 279F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 57, 11, 249, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, -28F, 16F, 0F, -10F, 0F, 2F, 0F, 0F, 2F, 0F, -22F, 0F, -36F, -22F, 0F); // Box 32
		rightWingModel[2].setRotationPoint(-133F, -51F, 30F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 29, 5, 152, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, -17F, 12F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -23F, -14F, 0F); // Box 33
		rightWingModel[3].setRotationPoint(-105F, -67F, 279F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 63, 11, 249, 0F,0F, 0F, 0F, -37F, -2F, 0F, -44F, 10F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -16F, 0F, 0F, -16F, 0F); // Box 34
		rightWingModel[4].setRotationPoint(-76F, -62F, 30F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 63, 11, 249, 0F,0F, 0F, 0F, 0F, 0F, 0F, -11F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 2F, -37F, -2F, 2F, -44F, -22F, 0F, 0F, -22F, 0F); // Box 35
		rightWingModel[5].setRotationPoint(-76F, -51F, 30F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 12, 4, 21, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -8F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -6F, -3F, -3F); // Box 36
		rightWingModel[6].setRotationPoint(-88F, -83F, 431F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -6F, 3F, -3F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, -8F, -4F, -3F); // Box 37
		rightWingModel[7].setRotationPoint(-88F, -79F, 431F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 14, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 38
		rightWingModel[8].setRotationPoint(-76F, -83F, 431F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 14, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F); // Box 39
		rightWingModel[9].setRotationPoint(-76F, -79F, 431F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 31, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -9F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, -9F, 0F, -4F, -1F); // Box 40
		rightWingModel[10].setRotationPoint(-62F, -79F, 431F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 31, 4, 21, 0F,0F, 0F, 0F, 0F, -4F, 0F, -1F, -3F, -9F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -9F, 0F, -3F, 0F); // Box 41
		rightWingModel[11].setRotationPoint(-62F, -83F, 431F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 19, 7, 152, 0F,0F, 0F, 0F, 0F, -2F, 0F, -5F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -12F, 0F, 0F, -12F, 0F); // Box 42
		rightWingModel[12].setRotationPoint(-76F, -74F, 279F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 19, 7, 152, 0F,0F, 0F, 0F, 0F, -2F, 0F, -5F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -14F, 0F, 0F, -14F, 0F); // Box 43
		rightWingModel[13].setRotationPoint(-76F, -69F, 279F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 33, 10, 152, 0F,0F, 0F, 0F, 0F, -5F, 0F, -7F, 7F, 0F, 5F, 11F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -7F, -17F, 0F, 5F, -14F, 0F); // Box 44
		rightWingModel[14].setRotationPoint(-57F, -72F, 279F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 56, 18, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightWingModel[15].setRotationPoint(-167F, -65F, 73F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 56, 7, 36, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightWingModel[16].setRotationPoint(-167F, -72F, 73F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 56, 5, 28, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightWingModel[17].setRotationPoint(-167F, -77F, 77F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 56, 7, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 56
		rightWingModel[18].setRotationPoint(-167F, -47F, 73F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 56, 5, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 57
		rightWingModel[19].setRotationPoint(-167F, -40F, 77F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 56, 5, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 58
		rightWingModel[20].setRotationPoint(-154F, -46F, 191F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 56, 7, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 59
		rightWingModel[21].setRotationPoint(-154F, -53F, 187F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 56, 18, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		rightWingModel[22].setRotationPoint(-154F, -71F, 187F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 56, 7, 36, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightWingModel[23].setRotationPoint(-154F, -78F, 187F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 56, 5, 28, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightWingModel[24].setRotationPoint(-154F, -83F, 191F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 10, 7, 36, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 63
		rightWingModel[25].setRotationPoint(-111F, -72F, 73F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 12, 5, 32, 0F,0F, 0F, -4F, 0F, -5F, -14F, 0F, -5F, -14F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, -1F, 0F); // Box 64
		rightWingModel[26].setRotationPoint(-101F, -69F, 75F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 10, 8, 36, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightWingModel[27].setRotationPoint(-111F, -65F, 73F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 28, 0F,0F, 0F, -5F, 5F, -5F, -8F, 5F, -5F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 5F, 3F, -2F, 5F, 3F, -2F, 0F, 0F, 0F); // Box 66
		rightWingModel[28].setRotationPoint(-111F, -77F, 77F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 2F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 2F, 0F, 0F, 0F, 6F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, 0F, 6F); // Box 67
		rightWingModel[29].setRotationPoint(-101F, -70F, 85F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 2F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 2F, 0F, 0F, 0F, 6F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, 0F, 6F); // Box 68
		rightWingModel[30].setRotationPoint(-88F, -76F, 199F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 12, 5, 32, 0F,0F, 0F, -4F, 0F, -5F, -14F, 0F, -5F, -14F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, -1F, 0F); // Box 69
		rightWingModel[31].setRotationPoint(-88F, -75F, 189F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 10, 7, 36, 0F,0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 70
		rightWingModel[32].setRotationPoint(-98F, -78F, 187F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 5, 5, 28, 0F,0F, 0F, -5F, 5F, -5F, -8F, 5F, -5F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 5F, 3F, -2F, 5F, 3F, -2F, 0F, 0F, 0F); // Box 71
		rightWingModel[33].setRotationPoint(-98F, -83F, 191F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 10, 8, 36, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		rightWingModel[34].setRotationPoint(-98F, -71F, 187F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 10, 8, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 73
		rightWingModel[35].setRotationPoint(-98F, -61F, 187F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 10, 7, 36, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -4F); // Box 74
		rightWingModel[36].setRotationPoint(-98F, -53F, 187F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 12, 5, 32, 0F,0F, 0F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -14F, 0F, -5F, -14F, 0F, 0F, -4F); // Box 75
		rightWingModel[37].setRotationPoint(-88F, -54F, 189F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 12, 7, 32, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, -10F, 0F, -1F, -10F, 0F, 0F, 0F); // Box 76
		rightWingModel[38].setRotationPoint(-88F, -61F, 189F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 5, 5, 28, 0F,0F, 0F, 0F, 5F, 3F, -2F, 5F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 5F, -5F, -8F, 5F, -5F, -8F, 0F, 0F, -5F); // Box 77
		rightWingModel[39].setRotationPoint(-98F, -46F, 191F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 6F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, 0F, 6F, 0F, 2F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 2F, 0F); // Box 78
		rightWingModel[40].setRotationPoint(-88F, -49F, 199F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, -4F); // Box 79
		rightWingModel[41].setRotationPoint(-76F, -55F, 199F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 4, 6, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, -4F); // Box 80
		rightWingModel[42].setRotationPoint(-76F, -61F, 195F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 79, 7, 36, 0F,0F, 0F, 0F, 0F, 4F, -8F, 0F, 4F, -8F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, -12F, 0F, -6F, -12F, 0F, 0F, -4F); // Box 83
		rightWingModel[43].setRotationPoint(-111F, -47F, 73F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 30, 5, 20, 0F,0F, 0F, 0F, 0F, 2F, -10F, 0F, 2F, -10F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -7F, -10F, 0F, -7F, -10F, 0F, 0F, -4F); // Box 84
		rightWingModel[44].setRotationPoint(-32F, -51F, 81F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 74, 5, 28, 0F,0F, 0F, 0F, 5F, 6F, -8F, 5F, 6F, -8F, 0F, 0F, 0F, 0F, 0F, -5F, 5F, -10F, -12F, 5F, -10F, -12F, 0F, 0F, -5F); // Box 85
		rightWingModel[45].setRotationPoint(-111F, -40F, 77F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 30, 1, 12, 0F,0F, 0F, 0F, 0F, 7F, -6F, 0F, 7F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -8F, -6F, 0F, -8F, -6F, 0F, 0F, -4F); // Box 86
		rightWingModel[46].setRotationPoint(-32F, -46F, 85F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 79, 7, 36, 0F,0F, 0F, -4F, 0F, 2F, -12F, 0F, 2F, -12F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, -4F, -8F, 0F, 0F, 0F); // Box 87
		rightWingModel[47].setRotationPoint(-111F, -54F, 73F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 30, 5, 20, 0F,0F, 0F, -4F, 0F, -3F, -10F, 0F, -3F, -10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, 0F, 0F); // Box 88
		rightWingModel[48].setRotationPoint(-32F, -56F, 81F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		rightWingModel[49].setRotationPoint(-172F, -65F, 73F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 388
		rightWingModel[50].setRotationPoint(-172F, -72F, 77F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 389
		rightWingModel[51].setRotationPoint(-172F, -77F, 82F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		rightWingModel[52].setRotationPoint(-172F, -77F, 82F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		rightWingModel[53].setRotationPoint(-172F, -38F, 82F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		rightWingModel[54].setRotationPoint(-172F, -40F, 82F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		rightWingModel[55].setRotationPoint(-172F, -47F, 77F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		rightWingModel[56].setRotationPoint(-172F, -65F, 106F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 395
		rightWingModel[57].setRotationPoint(-172F, -72F, 102F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightWingModel[58].setRotationPoint(-172F, -47F, 102F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 397
		rightWingModel[59].setRotationPoint(-172F, -77F, 97F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		rightWingModel[60].setRotationPoint(-172F, -40F, 97F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 399
		rightWingModel[61].setRotationPoint(-159F, -83F, 211F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		rightWingModel[62].setRotationPoint(-159F, -46F, 211F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		rightWingModel[63].setRotationPoint(-159F, -53F, 216F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		rightWingModel[64].setRotationPoint(-159F, -71F, 220F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 403
		rightWingModel[65].setRotationPoint(-159F, -78F, 216F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		rightWingModel[66].setRotationPoint(-159F, -83F, 196F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 405
		rightWingModel[67].setRotationPoint(-159F, -83F, 196F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 406
		rightWingModel[68].setRotationPoint(-159F, -78F, 191F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		rightWingModel[69].setRotationPoint(-159F, -71F, 187F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		rightWingModel[70].setRotationPoint(-159F, -53F, 191F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		rightWingModel[71].setRotationPoint(-159F, -46F, 196F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		rightWingModel[72].setRotationPoint(-159F, -44F, 196F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		rightWingModel[73].setRotationPoint(-172F, -55F, 77F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		rightWingModel[74].setRotationPoint(-172F, -48F, 82F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		rightWingModel[75].setRotationPoint(-172F, -46F, 82F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		rightWingModel[76].setRotationPoint(-172F, -48F, 97F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		rightWingModel[77].setRotationPoint(-172F, -55F, 102F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		rightWingModel[78].setRotationPoint(-159F, -61F, 191F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		rightWingModel[79].setRotationPoint(-159F, -54F, 196F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		rightWingModel[80].setRotationPoint(-159F, -52F, 196F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		rightWingModel[81].setRotationPoint(-159F, -54F, 211F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 5, 7, 3, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		rightWingModel[82].setRotationPoint(-159F, -61F, 216F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 3921, 161, textureX, textureY); // Box 316
		bodyWheelModel[1] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 317
		bodyWheelModel[2] = new ModelRendererTurbo(this, 4065, 57, textureX, textureY); // Box 319
		bodyWheelModel[3] = new ModelRendererTurbo(this, 2065, 177, textureX, textureY); // Box 321
		bodyWheelModel[4] = new ModelRendererTurbo(this, 2985, 65, textureX, textureY); // Box 322
		bodyWheelModel[5] = new ModelRendererTurbo(this, 2193, 57, textureX, textureY); // Box 323
		bodyWheelModel[6] = new ModelRendererTurbo(this, 2337, 57, textureX, textureY); // Box 324
		bodyWheelModel[7] = new ModelRendererTurbo(this, 2481, 57, textureX, textureY); // Box 325
		bodyWheelModel[8] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 326
		bodyWheelModel[9] = new ModelRendererTurbo(this, 1817, 73, textureX, textureY); // Box 327
		bodyWheelModel[10] = new ModelRendererTurbo(this, 2801, 57, textureX, textureY); // Box 329
		bodyWheelModel[11] = new ModelRendererTurbo(this, 1817, 185, textureX, textureY); // Box 330
		bodyWheelModel[12] = new ModelRendererTurbo(this, 3665, 81, textureX, textureY); // Box 331

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 18, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyWheelModel[0].setRotationPoint(-285F, -6F, -9F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 18, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyWheelModel[1].setRotationPoint(-285F, -10F, -9F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyWheelModel[2].setRotationPoint(-281F, -11F, -9F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 321
		bodyWheelModel[3].setRotationPoint(-285F, 4F, -9F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 322
		bodyWheelModel[4].setRotationPoint(-281F, 8F, -9F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 323
		bodyWheelModel[5].setRotationPoint(-286F, -6F, -9F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 324
		bodyWheelModel[6].setRotationPoint(-267F, -6F, -9F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 325
		bodyWheelModel[7].setRotationPoint(-267F, -6F, 4F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 18, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyWheelModel[8].setRotationPoint(-285F, -10F, 4F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyWheelModel[9].setRotationPoint(-281F, -11F, 4F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 329
		bodyWheelModel[10].setRotationPoint(-286F, -6F, 4F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 18, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 330
		bodyWheelModel[11].setRotationPoint(-285F, 4F, 4F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 331
		bodyWheelModel[12].setRotationPoint(-281F, 8F, 4F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 2465, 201, textureX, textureY); // Box 304
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 2865, 201, textureX, textureY); // Box 305
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 3625, 65, textureX, textureY); // Box 306
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1129, 73, textureX, textureY); // Box 307
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 308
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1817, 57, textureX, textureY); // Box 309
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 3913, 193, textureX, textureY); // Box 332
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1865, 185, textureX, textureY); // Box 333
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 2761, 89, textureX, textureY); // Box 334
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 1921, 185, textureX, textureY); // Box 335
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 3233, 153, textureX, textureY); // Box 336
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 3817, 65, textureX, textureY); // Box 337
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 2945, 57, textureX, textureY); // Box 338
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 3961, 65, textureX, textureY); // Box 339
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 340
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 341
		leftWingWheelModel[16] = new ModelRendererTurbo(this, 1753, 81, textureX, textureY); // Box 342
		leftWingWheelModel[17] = new ModelRendererTurbo(this, 2097, 81, textureX, textureY); // Box 343
		leftWingWheelModel[18] = new ModelRendererTurbo(this, 2561, 201, textureX, textureY); // Box 344
		leftWingWheelModel[19] = new ModelRendererTurbo(this, 1457, 169, textureX, textureY); // Box 345
		leftWingWheelModel[20] = new ModelRendererTurbo(this, 4065, 81, textureX, textureY); // Box 346
		leftWingWheelModel[21] = new ModelRendererTurbo(this, 665, 209, textureX, textureY); // Box 347
		leftWingWheelModel[22] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 348
		leftWingWheelModel[23] = new ModelRendererTurbo(this, 1625, 209, textureX, textureY); // Box 349

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 43, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		leftWingWheelModel[0].setRotationPoint(-135F, -47F, -109F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 43, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		leftWingWheelModel[1].setRotationPoint(-135F, -47F, -75F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 28, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		leftWingWheelModel[2].setRotationPoint(-111F, -36F, -92F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 3, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 307
		leftWingWheelModel[3].setRotationPoint(-111F, -36F, -90F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 28, 1, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		leftWingWheelModel[4].setRotationPoint(-111F, -36F, -93F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		leftWingWheelModel[5].setRotationPoint(-111F, -8F, -95F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 18, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		leftWingWheelModel[6].setRotationPoint(-118.5F, -14F, -103F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		leftWingWheelModel[7].setRotationPoint(-118.5F, -17F, -103F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		leftWingWheelModel[8].setRotationPoint(-114.5F, -18F, -103F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 335
		leftWingWheelModel[9].setRotationPoint(-118.5F, 4F, -103F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 336
		leftWingWheelModel[10].setRotationPoint(-114.5F, 7F, -103F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 3, 18, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 337
		leftWingWheelModel[11].setRotationPoint(-121.5F, -14F, -103F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 338
		leftWingWheelModel[12].setRotationPoint(-122.5F, -9F, -103F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 3, 18, 8, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 339
		leftWingWheelModel[13].setRotationPoint(-100.5F, -14F, -103F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 340
		leftWingWheelModel[14].setRotationPoint(-97.5F, -9F, -103F);

		leftWingWheelModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 341
		leftWingWheelModel[15].setRotationPoint(-97.5F, -9F, -87F);

		leftWingWheelModel[16].addShapeBox(0F, 0F, 0F, 3, 18, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 342
		leftWingWheelModel[16].setRotationPoint(-121.5F, -14F, -87F);

		leftWingWheelModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 343
		leftWingWheelModel[17].setRotationPoint(-122.5F, -9F, -87F);

		leftWingWheelModel[18].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		leftWingWheelModel[18].setRotationPoint(-118.5F, -17F, -87F);

		leftWingWheelModel[19].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		leftWingWheelModel[19].setRotationPoint(-114.5F, -18F, -87F);

		leftWingWheelModel[20].addShapeBox(0F, 0F, 0F, 3, 18, 8, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 346
		leftWingWheelModel[20].setRotationPoint(-100.5F, -14F, -87F);

		leftWingWheelModel[21].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 347
		leftWingWheelModel[21].setRotationPoint(-118.5F, 4F, -87F);

		leftWingWheelModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 348
		leftWingWheelModel[22].setRotationPoint(-114.5F, 7F, -87F);

		leftWingWheelModel[23].addShapeBox(0F, 0F, 0F, 18, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftWingWheelModel[23].setRotationPoint(-118.5F, -14F, -87F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 3081, 201, textureX, textureY); // Box 310
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 569, 209, textureX, textureY); // Box 311
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 1681, 209, textureX, textureY); // Box 350
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 993, 209, textureX, textureY); // Box 351
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 352
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1049, 209, textureX, textureY); // Box 353
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1457, 185, textureX, textureY); // Box 354
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1625, 97, textureX, textureY); // Box 355
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 4017, 81, textureX, textureY); // Box 356
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 1817, 97, textureX, textureY); // Box 357
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 2001, 89, textureX, textureY); // Box 358
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 2393, 97, textureX, textureY); // Box 359
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 3817, 105, textureX, textureY); // Box 360
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 2481, 97, textureX, textureY); // Box 361
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 1105, 209, textureX, textureY); // Box 362
		rightWingWheelModel[15] = new ModelRendererTurbo(this, 1737, 185, textureX, textureY); // Box 363
		rightWingWheelModel[16] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 364
		rightWingWheelModel[17] = new ModelRendererTurbo(this, 1161, 209, textureX, textureY); // Box 365
		rightWingWheelModel[18] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 366
		rightWingWheelModel[19] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 368
		rightWingWheelModel[20] = new ModelRendererTurbo(this, 3465, 81, textureX, textureY); // Box 369
		rightWingWheelModel[21] = new ModelRendererTurbo(this, 2217, 89, textureX, textureY); // Box 370
		rightWingWheelModel[22] = new ModelRendererTurbo(this, 1057, 97, textureX, textureY); // Box 371
		rightWingWheelModel[23] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 372
		rightWingWheelModel[24] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 373
		rightWingWheelModel[25] = new ModelRendererTurbo(this, 2505, 97, textureX, textureY); // Box 374
		rightWingWheelModel[26] = new ModelRendererTurbo(this, 1689, 97, textureX, textureY); // Box 375
		rightWingWheelModel[27] = new ModelRendererTurbo(this, 2033, 217, textureX, textureY); // Box 467
		rightWingWheelModel[28] = new ModelRendererTurbo(this, 2561, 217, textureX, textureY); // Box 468
		rightWingWheelModel[29] = new ModelRendererTurbo(this, 841, 209, textureX, textureY); // Box 469
		rightWingWheelModel[30] = new ModelRendererTurbo(this, 3377, 209, textureX, textureY); // Box 470
		rightWingWheelModel[31] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 471
		rightWingWheelModel[32] = new ModelRendererTurbo(this, 681, 225, textureX, textureY); // Box 472

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 43, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		rightWingWheelModel[0].setRotationPoint(-135F, -47F, 107F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 43, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		rightWingWheelModel[1].setRotationPoint(-135F, -47F, 73F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 18, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		rightWingWheelModel[2].setRotationPoint(-118.5F, -14F, 95F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		rightWingWheelModel[3].setRotationPoint(-118.5F, -17F, 95F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		rightWingWheelModel[4].setRotationPoint(-114.5F, -18F, 95F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 353
		rightWingWheelModel[5].setRotationPoint(-118.5F, 4F, 95F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 354
		rightWingWheelModel[6].setRotationPoint(-114.5F, 7F, 95F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 3, 18, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 355
		rightWingWheelModel[7].setRotationPoint(-121.5F, -14F, 95F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 356
		rightWingWheelModel[8].setRotationPoint(-122.5F, -9F, 95F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 3, 18, 8, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 357
		rightWingWheelModel[9].setRotationPoint(-100.5F, -14F, 95F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 358
		rightWingWheelModel[10].setRotationPoint(-97.5F, -9F, 95F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 359
		rightWingWheelModel[11].setRotationPoint(-97.5F, -9F, 79F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 3, 18, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 360
		rightWingWheelModel[12].setRotationPoint(-121.5F, -14F, 79F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 361
		rightWingWheelModel[13].setRotationPoint(-122.5F, -9F, 79F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		rightWingWheelModel[14].setRotationPoint(-118.5F, -17F, 79F);

		rightWingWheelModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		rightWingWheelModel[15].setRotationPoint(-114.5F, -18F, 79F);

		rightWingWheelModel[16].addShapeBox(0F, 0F, 0F, 3, 18, 8, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 364
		rightWingWheelModel[16].setRotationPoint(-100.5F, -14F, 79F);

		rightWingWheelModel[17].addShapeBox(0F, 0F, 0F, 18, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 365
		rightWingWheelModel[17].setRotationPoint(-118.5F, 4F, 79F);

		rightWingWheelModel[18].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 366
		rightWingWheelModel[18].setRotationPoint(-114.5F, 7F, 79F);

		rightWingWheelModel[19].addShapeBox(0F, 0F, 0F, 3, 28, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		rightWingWheelModel[19].setRotationPoint(-111F, -36F, 90F);

		rightWingWheelModel[20].addShapeBox(0F, 0F, 0F, 3, 28, 1, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		rightWingWheelModel[20].setRotationPoint(-111F, -36F, 89F);

		rightWingWheelModel[21].addShapeBox(0F, 0F, 0F, 3, 28, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 370
		rightWingWheelModel[21].setRotationPoint(-111F, -36F, 92F);

		rightWingWheelModel[22].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		rightWingWheelModel[22].setRotationPoint(-111F, -8F, 87F);

		rightWingWheelModel[23].addShapeBox(0F, 0F, 0F, 3, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 372
		rightWingWheelModel[23].setRotationPoint(-277F, -27F, 1F);

		rightWingWheelModel[24].addShapeBox(0F, 0F, 0F, 3, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		rightWingWheelModel[24].setRotationPoint(-277F, -27F, -1F);

		rightWingWheelModel[25].addShapeBox(0F, 0F, 0F, 3, 24, 1, 0F,-0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		rightWingWheelModel[25].setRotationPoint(-277F, -27F, -2F);

		rightWingWheelModel[26].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		rightWingWheelModel[26].setRotationPoint(-277F, -3F, -4F);

		rightWingWheelModel[27].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 467
		rightWingWheelModel[27].setRotationPoint(-176F, -63F, 88F);

		rightWingWheelModel[28].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		rightWingWheelModel[28].setRotationPoint(-182F, -63F, 88F);

		rightWingWheelModel[29].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 469
		rightWingWheelModel[29].setRotationPoint(-185F, -63F, 88F);

		rightWingWheelModel[30].addShapeBox(0F, 0F, 0F, 3, 7, 7, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 470
		rightWingWheelModel[30].setRotationPoint(-172F, -69F, 202F);

		rightWingWheelModel[31].addShapeBox(0F, 0F, 0F, 6, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		rightWingWheelModel[31].setRotationPoint(-169F, -69F, 202F);

		rightWingWheelModel[32].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F); // Box 472
		rightWingWheelModel[32].setRotationPoint(-163F, -69F, 202F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][4];
		propellerModels[0] = makeProp1(-176F, -59.5F, 91.5F);
		propellerModels[1] = makeProp2(-163F, -65.5F, 204.5F);
		propellerModels[2] = makeProp3(-176F, -59.5F, -91.5F);
		propellerModels[3] = makeProp4(-163F, -65.5F, -204.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[1].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[2].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[3].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[1].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[2].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[3].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[1].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[2].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[3].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
		prop[0].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[1].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[2].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[3].addBox(-0.5F, -55F, -2.5F, 1, 55, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[0];

		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[0];

		gun_5_Model[1] = new ModelRendererTurbo[0];

		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[0];

		gun_6_Model[1] = new ModelRendererTurbo[0];

		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);
	}
}