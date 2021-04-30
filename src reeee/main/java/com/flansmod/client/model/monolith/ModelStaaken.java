//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.04.2016 - 17:07:41
// Last changed on: 21.04.2016 - 17:07:41

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStaaken extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelStaaken() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[156];
		tailModel = new ModelRendererTurbo[30];
		bayModel = new ModelRendererTurbo[2];
		leftWingModel = new ModelRendererTurbo[36];
		rightWingModel = new ModelRendererTurbo[78];

		initbodyModel_1();
		inittailModel_1();
		initbayModel_1();
		initleftWingModel_1();
		initrightWingModel_1();

		initPropeller();

	

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1057, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1409, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 1457, 1, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 1281, 1, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 897, 9, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 2033, 1, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 69
		bodyModel[30] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 70
		bodyModel[31] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 71
		bodyModel[32] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 72
		bodyModel[33] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 73
		bodyModel[34] = new ModelRendererTurbo(this, 553, 585, textureX, textureY); // Box 12
		bodyModel[35] = new ModelRendererTurbo(this, 1433, 617, textureX, textureY); // Box 13
		bodyModel[36] = new ModelRendererTurbo(this, 1921, 105, textureX, textureY); // Box 14
		bodyModel[37] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 15
		bodyModel[38] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 16
		bodyModel[39] = new ModelRendererTurbo(this, 1777, 9, textureX, textureY); // Box 17
		bodyModel[40] = new ModelRendererTurbo(this, 1913, 25, textureX, textureY); // Box 18
		bodyModel[41] = new ModelRendererTurbo(this, 1713, 185, textureX, textureY); // Box 19
		bodyModel[42] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 20
		bodyModel[43] = new ModelRendererTurbo(this, 553, 849, textureX, textureY); // Box 21
		bodyModel[44] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 22
		bodyModel[45] = new ModelRendererTurbo(this, 1313, 1, textureX, textureY); // Box 23
		bodyModel[46] = new ModelRendererTurbo(this, 1425, 1, textureX, textureY); // Box 24
		bodyModel[47] = new ModelRendererTurbo(this, 1441, 1, textureX, textureY); // Box 25
		bodyModel[48] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 26
		bodyModel[49] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 27
		bodyModel[50] = new ModelRendererTurbo(this, 1537, 1, textureX, textureY); // Box 28
		bodyModel[51] = new ModelRendererTurbo(this, 681, 9, textureX, textureY); // Box 29
		bodyModel[52] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 1
		bodyModel[54] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 2
		bodyModel[55] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 3
		bodyModel[56] = new ModelRendererTurbo(this, 713, 9, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 1745, 9, textureX, textureY); // Box 5
		bodyModel[58] = new ModelRendererTurbo(this, 1849, 41, textureX, textureY); // Box 6
		bodyModel[59] = new ModelRendererTurbo(this, 1409, 33, textureX, textureY); // Box 7
		bodyModel[60] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 8
		bodyModel[61] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 9
		bodyModel[62] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 10
		bodyModel[63] = new ModelRendererTurbo(this, 1273, 9, textureX, textureY); // Box 11
		bodyModel[64] = new ModelRendererTurbo(this, 1105, 9, textureX, textureY); // Box 12
		bodyModel[65] = new ModelRendererTurbo(this, 1313, 9, textureX, textureY); // Box 13
		bodyModel[66] = new ModelRendererTurbo(this, 1465, 33, textureX, textureY); // Box 193
		bodyModel[67] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 194
		bodyModel[68] = new ModelRendererTurbo(this, 1297, 1, textureX, textureY); // Box 214
		bodyModel[69] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 215
		bodyModel[70] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 216
		bodyModel[71] = new ModelRendererTurbo(this, 1633, 9, textureX, textureY); // Box 217
		bodyModel[72] = new ModelRendererTurbo(this, 545, 209, textureX, textureY); // Box 218
		bodyModel[73] = new ModelRendererTurbo(this, 1729, 1, textureX, textureY); // Box 220
		bodyModel[74] = new ModelRendererTurbo(this, 1377, 193, textureX, textureY); // Box 221
		bodyModel[75] = new ModelRendererTurbo(this, 1673, 17, textureX, textureY); // Box 222
		bodyModel[76] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 223
		bodyModel[77] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 224
		bodyModel[78] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 225
		bodyModel[79] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 226
		bodyModel[80] = new ModelRendererTurbo(this, 1337, 65, textureX, textureY); // Box 227
		bodyModel[81] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 228
		bodyModel[82] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 229
		bodyModel[83] = new ModelRendererTurbo(this, 1473, 209, textureX, textureY); // Box 255
		bodyModel[84] = new ModelRendererTurbo(this, 1777, 9, textureX, textureY); // Box 256
		bodyModel[85] = new ModelRendererTurbo(this, 1801, 9, textureX, textureY); // Box 257
		bodyModel[86] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 258
		bodyModel[87] = new ModelRendererTurbo(this, 1945, 25, textureX, textureY); // Box 259
		bodyModel[88] = new ModelRendererTurbo(this, 1441, 33, textureX, textureY); // Box 260
		bodyModel[89] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 261
		bodyModel[90] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 262
		bodyModel[91] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 263
		bodyModel[92] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 264
		bodyModel[93] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 265
		bodyModel[94] = new ModelRendererTurbo(this, 1097, 1, textureX, textureY); // Box 266
		bodyModel[95] = new ModelRendererTurbo(this, 1177, 1, textureX, textureY); // Box 267
		bodyModel[96] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Box 268
		bodyModel[97] = new ModelRendererTurbo(this, 1569, 1, textureX, textureY); // Box 269
		bodyModel[98] = new ModelRendererTurbo(this, 1665, 1, textureX, textureY); // Box 270
		bodyModel[99] = new ModelRendererTurbo(this, 1737, 1, textureX, textureY); // Box 271
		bodyModel[100] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 272
		bodyModel[101] = new ModelRendererTurbo(this, 1225, 9, textureX, textureY); // Box 273
		bodyModel[102] = new ModelRendererTurbo(this, 1633, 25, textureX, textureY); // Box 274
		bodyModel[103] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 275
		bodyModel[104] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 276
		bodyModel[105] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Box 277
		bodyModel[106] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 278
		bodyModel[107] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 279
		bodyModel[108] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 280
		bodyModel[109] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 281
		bodyModel[110] = new ModelRendererTurbo(this, 1097, 9, textureX, textureY); // Box 282
		bodyModel[111] = new ModelRendererTurbo(this, 1353, 9, textureX, textureY); // Box 283
		bodyModel[112] = new ModelRendererTurbo(this, 1361, 9, textureX, textureY); // Box 284
		bodyModel[113] = new ModelRendererTurbo(this, 1393, 9, textureX, textureY); // Box 285
		bodyModel[114] = new ModelRendererTurbo(this, 1401, 9, textureX, textureY); // Box 286
		bodyModel[115] = new ModelRendererTurbo(this, 1513, 9, textureX, textureY); // Box 287
		bodyModel[116] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 290
		bodyModel[117] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 291
		bodyModel[118] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 292
		bodyModel[119] = new ModelRendererTurbo(this, 1921, 209, textureX, textureY); // Box 293
		bodyModel[120] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 294
		bodyModel[121] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 295
		bodyModel[122] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 296
		bodyModel[123] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 297
		bodyModel[124] = new ModelRendererTurbo(this, 1281, 233, textureX, textureY); // Box 298
		bodyModel[125] = new ModelRendererTurbo(this, 1313, 233, textureX, textureY); // Box 299
		bodyModel[126] = new ModelRendererTurbo(this, 1353, 233, textureX, textureY); // Box 300
		bodyModel[127] = new ModelRendererTurbo(this, 1393, 233, textureX, textureY); // Box 301
		bodyModel[128] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 302
		bodyModel[129] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 303
		bodyModel[130] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 304
		bodyModel[131] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 305
		bodyModel[132] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 306
		bodyModel[133] = new ModelRendererTurbo(this, 745, 273, textureX, textureY); // Box 307
		bodyModel[134] = new ModelRendererTurbo(this, 785, 273, textureX, textureY); // Box 309
		bodyModel[135] = new ModelRendererTurbo(this, 817, 273, textureX, textureY); // Box 310
		bodyModel[136] = new ModelRendererTurbo(this, 1001, 281, textureX, textureY); // Box 311
		bodyModel[137] = new ModelRendererTurbo(this, 1569, 289, textureX, textureY); // Box 312
		bodyModel[138] = new ModelRendererTurbo(this, 1601, 289, textureX, textureY); // Box 313
		bodyModel[139] = new ModelRendererTurbo(this, 1681, 289, textureX, textureY); // Box 314
		bodyModel[140] = new ModelRendererTurbo(this, 1713, 289, textureX, textureY); // Box 315
		bodyModel[141] = new ModelRendererTurbo(this, 1745, 289, textureX, textureY); // Box 316
		bodyModel[142] = new ModelRendererTurbo(this, 1777, 289, textureX, textureY); // Box 317
		bodyModel[143] = new ModelRendererTurbo(this, 1873, 289, textureX, textureY); // Box 318
		bodyModel[144] = new ModelRendererTurbo(this, 1841, 217, textureX, textureY); // Box 317
		bodyModel[145] = new ModelRendererTurbo(this, 1433, 233, textureX, textureY); // Box 320
		bodyModel[146] = new ModelRendererTurbo(this, 1641, 185, textureX, textureY); // Box 323
		bodyModel[147] = new ModelRendererTurbo(this, 1753, 185, textureX, textureY); // Box 324
		bodyModel[148] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 322
		bodyModel[149] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 323
		bodyModel[150] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 324
		bodyModel[151] = new ModelRendererTurbo(this, 1905, 289, textureX, textureY); // Box 325
		bodyModel[152] = new ModelRendererTurbo(this, 1433, 249, textureX, textureY); // Box 326
		bodyModel[153] = new ModelRendererTurbo(this, 1153, 297, textureX, textureY); // Box 327
		bodyModel[154] = new ModelRendererTurbo(this, 1137, 297, textureX, textureY); // Box 325
		bodyModel[155] = new ModelRendererTurbo(this, 1193, 297, textureX, textureY); // Box 326

		bodyModel[0].addShapeBox(0F, 0F, 0F, 246, 1, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-236F, -20F, -32F);
		bodyModel[0].rotateAngleZ = 0.02617994F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 22, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		bodyModel[1].setRotationPoint(9.9F, -26.6F, -32F);
		bodyModel[1].rotateAngleZ = 2.04203522F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 207, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 2
		bodyModel[2].setRotationPoint(28.5F, -36.1F, -31F);
		bodyModel[2].rotateAngleZ = 1.67551608F;

		bodyModel[3].addBox(0F, 0F, 0F, 1, 20, 44, 0F); // Box 3
		bodyModel[3].setRotationPoint(234.3F, -57.6F, -24F);
		bodyModel[3].rotateAngleZ = 1.81514242F;

		bodyModel[4].addBox(0F, 0F, 0F, 1, 18, 44, 0F); // Box 4
		bodyModel[4].setRotationPoint(253.6F, -62.4F, -24F);
		bodyModel[4].rotateAngleZ = 2.04203522F;

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 14, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(269.6F, -70.55F, -24F);
		bodyModel[5].rotateAngleZ = 2.30383461F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 281, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 6
		bodyModel[6].setRotationPoint(279.3F, -80.68F, -24F);
		bodyModel[6].rotateAngleZ = 4.73856892F;

		bodyModel[7].addBox(0F, 0F, 0F, 5, 231, 58, 0F); // Box 7
		bodyModel[7].setRotationPoint(-0.7F, -73.4F, -31F);
		bodyModel[7].rotateAngleZ = 4.71238898F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 30, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-287.7F, -53.48F, -3F);
		bodyModel[8].rotateAngleZ = 6.28318531F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-287.7F, -23.48F, -7F);
		bodyModel[9].rotateAngleZ = 0.57595865F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 24, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-286.1F, -21F, -14F);
		bodyModel[10].rotateAngleZ = 1.15191731F;

		bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 60, 0F); // Box 12
		bodyModel[11].setRotationPoint(9.1F, -25.9F, -32F);
		bodyModel[11].rotateAngleZ = 1.06465084F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 19, 48, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-281.6F, -19F, -26F);
		bodyModel[12].rotateAngleZ = 1.57079633F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 27, 60, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-262.6F, -19F, -32F);
		bodyModel[13].rotateAngleZ = 1.57079633F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 34, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-286.3F, -53.48F, 2.55F);
		bodyModel[14].rotateAngleY = -0.55850536F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 36, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -1.5F, 0F); // Box 18
		bodyModel[15].setRotationPoint(-281.55F, -53.48F, 10.1F);
		bodyModel[15].rotateAngleY = -1.00880031F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 36, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -1.5F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-262.5F, -53.48F, -24.9F);
		bodyModel[16].rotateAngleY = -1.79419847F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 34, 246, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-236F, -53.48F, 28F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 34, 246, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 22
		bodyModel[18].setRotationPoint(-236F, -53.48F, -31.04F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 36, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -1.5F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-262.1F, -53.48F, 22.3F);
		bodyModel[19].rotateAngleY = -1.35786616F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 36, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, -1.5F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-280.85F, -53.48F, -13.3F);
		bodyModel[20].rotateAngleY = -2.13279235F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 33, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[21].setRotationPoint(-287.7F, -53.48F, -1F);
		bodyModel[21].rotateAngleY = -0.36651914F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 33, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[22].setRotationPoint(-286.75F, -53.48F, -2.65F);
		bodyModel[22].rotateAngleY = -2.74016693F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 34, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F); // Box 29
		bodyModel[23].setRotationPoint(-285.3F, -53.48F, -6F);
		bodyModel[23].rotateAngleY = -2.58308729F;

		bodyModel[24].addBox(0F, 0F, 0F, 2, 1, 60, 0F); // Box 30
		bodyModel[24].setRotationPoint(9.1F, -25.9F, -32F);
		bodyModel[24].rotateAngleZ = 1.06465084F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 13, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 31
		bodyModel[25].setRotationPoint(-231.7F, -73.4F, -31F);
		bodyModel[25].rotateAngleZ = 4.71238898F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 7, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 32
		bodyModel[26].setRotationPoint(-244.7F, -73.4F, -19F);
		bodyModel[26].rotateAngleZ = 4.71238898F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 30, 60, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(-261.6F, -53F, -32F);
		bodyModel[27].rotateAngleZ = 1.57079633F;

		bodyModel[28].addBox(0F, 0F, 0F, 2, 73, 2, 0F); // Box 40
		bodyModel[28].setRotationPoint(-69F, -140.48F, -2F);
		bodyModel[28].rotateAngleY = -1.57079633F;
		bodyModel[28].rotateAngleZ = 0.34906585F;

		bodyModel[29].addBox(0F, 0F, 0F, 2, 73, 2, 0F); // Box 69
		bodyModel[29].setRotationPoint(-69F, -140.48F, -2F);
		bodyModel[29].rotateAngleX = 0.34906585F;

		bodyModel[30].addBox(0F, 0F, 0F, 2, 73, 2, 0F); // Box 70
		bodyModel[30].setRotationPoint(-142F, -140.48F, -2F);
		bodyModel[30].rotateAngleX = 0.34906585F;

		bodyModel[31].addBox(0F, 0F, 0F, 2, 73, 2, 0F); // Box 71
		bodyModel[31].setRotationPoint(-142F, -140.48F, -2F);
		bodyModel[31].rotateAngleY = -1.57079633F;
		bodyModel[31].rotateAngleZ = 0.34906585F;

		bodyModel[32].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 72
		bodyModel[32].setRotationPoint(-142F, -140.48F, -1F);
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 73
		bodyModel[33].setRotationPoint(-69F, -140.48F, -1F);
		bodyModel[33].rotateAngleY = -1.57079633F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 20, 241, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[34].setRotationPoint(-231F, -73.48F, 28F);
		bodyModel[34].rotateAngleY = -1.57079633F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 20, 241, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[35].setRotationPoint(-231F, -73.48F, -31F);
		bodyModel[35].rotateAngleY = -1.57079633F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 20, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[36].setRotationPoint(-244.7F, -73.48F, -19F);
		bodyModel[36].rotateAngleY = -2.26892803F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 20, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[37].setRotationPoint(-245.4F, -73.48F, 15.7F);
		bodyModel[37].rotateAngleY = -0.87266463F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 20, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[38].setRotationPoint(-251.7F, -73.48F, -7F);
		bodyModel[38].rotateAngleY = -2.60926723F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 20, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[39].setRotationPoint(-252.7F, -73.48F, 3.5F);
		bodyModel[39].rotateAngleY = -0.53232542F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 20, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[40].setRotationPoint(-252.7F, -73.48F, -7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 34, 1, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[41].setRotationPoint(-232.6F, -20F, -30F);
		bodyModel[41].rotateAngleZ = 1.57079633F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 43, 1, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[42].setRotationPoint(1.4F, -26F, -31F);
		bodyModel[42].rotateAngleZ = 1.57079633F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 246, 1, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[43].setRotationPoint(-236F, -33F, -32F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[44].setRotationPoint(-214.6F, -31F, -20F);
		bodyModel[44].rotateAngleZ = 1.57079633F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[45].setRotationPoint(-214.6F, -31F, -11F);
		bodyModel[45].rotateAngleZ = 1.57079633F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[46].setRotationPoint(-206.6F, -31F, -11F);
		bodyModel[46].rotateAngleZ = 1.57079633F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[47].setRotationPoint(-206.6F, -31F, -20F);
		bodyModel[47].rotateAngleZ = 1.57079633F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 11, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[48].setRotationPoint(-215.6F, -37F, -21F);
		bodyModel[48].rotateAngleZ = 1.57079633F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[49].setRotationPoint(-205.6F, -41F, -21F);
		bodyModel[49].rotateAngleZ = 1.57079633F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[50].setRotationPoint(-206.6F, -32F, -11F);
		bodyModel[50].rotateAngleZ = 2.565634F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[51].setRotationPoint(-206.6F, -32F, -20F);
		bodyModel[51].rotateAngleZ = 2.565634F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[52].setRotationPoint(-210.6F, -41F, -21F);
		bodyModel[52].rotateAngleZ = 1.57079633F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[53].setRotationPoint(-210.6F, -41F, -10F);
		bodyModel[53].rotateAngleZ = 1.57079633F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 11, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[54].setRotationPoint(-215.6F, -37F, 2F);
		bodyModel[54].rotateAngleZ = 1.57079633F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[55].setRotationPoint(-210.6F, -41F, 13F);
		bodyModel[55].rotateAngleZ = 1.57079633F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(-210.6F, -41F, 2F);
		bodyModel[56].rotateAngleZ = 1.57079633F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 5
		bodyModel[57].setRotationPoint(-205.6F, -53F, -21F);
		bodyModel[57].rotateAngleZ = 1.57079633F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[58].setRotationPoint(-205.6F, -41F, 2F);
		bodyModel[58].rotateAngleZ = 1.57079633F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 7
		bodyModel[59].setRotationPoint(-205.6F, -53F, 2F);
		bodyModel[59].rotateAngleZ = 1.57079633F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[60].setRotationPoint(-206.6F, -32F, 12F);
		bodyModel[60].rotateAngleZ = 2.565634F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[61].setRotationPoint(-206.6F, -31F, 12F);
		bodyModel[61].rotateAngleZ = 1.57079633F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[62].setRotationPoint(-214.6F, -31F, 12F);
		bodyModel[62].rotateAngleZ = 1.57079633F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[63].setRotationPoint(-206.6F, -32F, 3F);
		bodyModel[63].rotateAngleZ = 2.565634F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[64].setRotationPoint(-206.6F, -31F, 3F);
		bodyModel[64].rotateAngleZ = 1.57079633F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[65].setRotationPoint(-214.6F, -31F, 3F);
		bodyModel[65].rotateAngleZ = 1.57079633F;

		bodyModel[66].addBox(0F, 0F, 0F, 19, 2, 2, 0F); // Box 193
		bodyModel[66].setRotationPoint(246.3F, -46.6F, -3F);
		bodyModel[66].rotateAngleZ = 2.49582083F;

		bodyModel[67].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 194
		bodyModel[67].setRotationPoint(250.3F, -46.6F, -3F);
		bodyModel[67].rotateAngleZ = 3.14159265F;

		bodyModel[68].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 214
		bodyModel[68].setRotationPoint(-280F, -19.5F, -2F);
		bodyModel[68].rotateAngleX = 0.2443461F;
		bodyModel[68].rotateAngleZ = 0.6981317F;

		bodyModel[69].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Box 215
		bodyModel[69].setRotationPoint(-280F, -19.5F, -3F);
		bodyModel[69].rotateAngleX = -0.2443461F;
		bodyModel[69].rotateAngleZ = 0.6981317F;

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 216
		bodyModel[70].setRotationPoint(-270F, -8F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 217
		bodyModel[71].setRotationPoint(-272F, -13F, -10F);

		bodyModel[72].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 218
		bodyModel[72].setRotationPoint(-270F, -8F, 2F);
		bodyModel[72].rotateAngleY = 0.12217305F;
		bodyModel[72].rotateAngleZ = 0.27925268F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 220
		bodyModel[73].setRotationPoint(-226F, -53F, 9F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 221
		bodyModel[74].setRotationPoint(-226F, -35F, -13F);

		bodyModel[75].addBox(0F, 0F, 0F, 7, 2, 6, 0F); // Box 222
		bodyModel[75].setRotationPoint(-228F, -42F, -4F);
		bodyModel[75].rotateAngleZ = -0.48869219F;

		bodyModel[76].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 223
		bodyModel[76].setRotationPoint(-225F, -39F, 0F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 224
		bodyModel[77].setRotationPoint(-228F, -41F, 0F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 225
		bodyModel[78].setRotationPoint(-225F, -53F, 9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[79].setRotationPoint(-224F, -53F, 9F);

		bodyModel[80].addBox(0F, 0F, 0F, 26, 1, 6, 0F); // Box 227
		bodyModel[80].setRotationPoint(-286.7F, -27.5F, -5F);

		bodyModel[81].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 228
		bodyModel[81].setRotationPoint(-28F, -62F, -19F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 229
		bodyModel[82].setRotationPoint(-43F, -62F, -14F);

		bodyModel[83].addBox(0F, 0F, 0F, 64, 1, 1, 0F); // Box 255
		bodyModel[83].setRotationPoint(-270F, -8F, -7F);
		bodyModel[83].rotateAngleY = -0.12217305F;
		bodyModel[83].rotateAngleZ = 0.27925268F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[84].setRotationPoint(-267F, -13F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 257
		bodyModel[85].setRotationPoint(-275F, -13F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 258
		bodyModel[86].setRotationPoint(-275F, -13F, 5F);

		bodyModel[87].addBox(0F, 0F, 0F, 5, 11, 1, 0F); // Box 259
		bodyModel[87].setRotationPoint(-272F, -13F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[88].setRotationPoint(-267F, -13F, 5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[89].setRotationPoint(-224F, -52F, 9F);
		bodyModel[89].rotateAngleX = 1.57079633F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[90].setRotationPoint(-224F, -52F, 10F);
		bodyModel[90].rotateAngleX = 3.14159265F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[91].setRotationPoint(-224F, -53F, 10F);
		bodyModel[91].rotateAngleX = 4.71238898F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[92].setRotationPoint(-224F, -57F, 9F);
		bodyModel[92].rotateAngleX = -0.78539816F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[93].setRotationPoint(-224F, -53F, 14F);
		bodyModel[93].rotateAngleX = 3.92699082F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[94].setRotationPoint(-224F, -55F, 7F);
		bodyModel[94].rotateAngleX = -0.78539816F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[95].setRotationPoint(-224F, -55F, 12F);
		bodyModel[95].rotateAngleX = 3.92699082F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[96].setRotationPoint(-224F, -48F, 10F);
		bodyModel[96].rotateAngleX = 2.35619449F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[97].setRotationPoint(-224F, -50F, 12F);
		bodyModel[97].rotateAngleX = 2.35619449F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[98].setRotationPoint(-224F, -52F, 5F);
		bodyModel[98].rotateAngleX = 0.78539816F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[99].setRotationPoint(-224F, -50F, 7F);
		bodyModel[99].rotateAngleX = 0.78539816F;

		bodyModel[100].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 272
		bodyModel[100].setRotationPoint(-228F, -41F, -3F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 273
		bodyModel[101].setRotationPoint(-225F, -39F, -3F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 274
		bodyModel[102].setRotationPoint(-226F, -53F, -14F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[103].setRotationPoint(-224F, -52F, -18F);
		bodyModel[103].rotateAngleX = 0.78539816F;

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 276
		bodyModel[104].setRotationPoint(-225F, -53F, -14F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[105].setRotationPoint(-224F, -52F, -13F);
		bodyModel[105].rotateAngleX = 3.14159265F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[106].setRotationPoint(-224F, -53F, -14F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[107].setRotationPoint(-224F, -53F, -13F);
		bodyModel[107].rotateAngleX = 4.71238898F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[108].setRotationPoint(-224F, -52F, -14F);
		bodyModel[108].rotateAngleX = 1.57079633F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[109].setRotationPoint(-224F, -50F, -16F);
		bodyModel[109].rotateAngleX = 0.78539816F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[110].setRotationPoint(-224F, -57F, -14F);
		bodyModel[110].rotateAngleX = -0.78539816F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[111].setRotationPoint(-224F, -55F, -16F);
		bodyModel[111].rotateAngleX = -0.78539816F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[112].setRotationPoint(-224F, -55F, -11F);
		bodyModel[112].rotateAngleX = 3.92699082F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[113].setRotationPoint(-224F, -53F, -9F);
		bodyModel[113].rotateAngleX = 3.92699082F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[114].setRotationPoint(-224F, -50F, -11F);
		bodyModel[114].rotateAngleX = 2.35619449F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[115].setRotationPoint(-224F, -48F, -13F);
		bodyModel[115].rotateAngleX = 2.35619449F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 290
		bodyModel[116].setRotationPoint(-55F, -62F, -14F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 291
		bodyModel[117].setRotationPoint(-70F, -62F, -14F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 292
		bodyModel[118].setRotationPoint(-82F, -62F, -14F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 293
		bodyModel[119].setRotationPoint(-82F, -62F, 17F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 294
		bodyModel[120].setRotationPoint(-70F, -62F, 17F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 295
		bodyModel[121].setRotationPoint(-56F, -62F, 17F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 296
		bodyModel[122].setRotationPoint(-44F, -62F, 17F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 297
		bodyModel[123].setRotationPoint(-28F, -62F, 17F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 298
		bodyModel[124].setRotationPoint(-28F, -62F, -14F);

		bodyModel[125].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 299
		bodyModel[125].setRotationPoint(-43F, -62F, -19F);

		bodyModel[126].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 300
		bodyModel[126].setRotationPoint(-55F, -62F, -19F);

		bodyModel[127].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 301
		bodyModel[127].setRotationPoint(-70F, -62F, -19F);

		bodyModel[128].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 302
		bodyModel[128].setRotationPoint(-82F, -62F, -19F);

		bodyModel[129].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 303
		bodyModel[129].setRotationPoint(-82F, -62F, 12F);

		bodyModel[130].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 304
		bodyModel[130].setRotationPoint(-70F, -62F, 12F);

		bodyModel[131].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 305
		bodyModel[131].setRotationPoint(-56F, -62F, 12F);

		bodyModel[132].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 306
		bodyModel[132].setRotationPoint(-44F, -62F, 12F);

		bodyModel[133].addBox(0F, 0F, 0F, 11, 29, 5, 0F); // Box 307
		bodyModel[133].setRotationPoint(-28F, -62F, 12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[134].setRotationPoint(-28F, -62F, -23F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[135].setRotationPoint(-43F, -62F, -23F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[136].setRotationPoint(-55F, -62F, -23F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[137].setRotationPoint(-70F, -62F, -23F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[138].setRotationPoint(-82F, -62F, -23F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[139].setRotationPoint(-82F, -62F, 8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[140].setRotationPoint(-70F, -62F, 8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[141].setRotationPoint(-56F, -62F, 8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[142].setRotationPoint(-44F, -62F, 8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 11, 29, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[143].setRotationPoint(-28F, -62F, 8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 26, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F); // Box 317
		bodyModel[144].setRotationPoint(-286.7F, -27.5F, 1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 26, 1, 8, 0F,-8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[145].setRotationPoint(-286.7F, -27.5F, -13F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 27, 6, 0F); // Box 323
		bodyModel[146].setRotationPoint(-286.7F, -54.5F, -5F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 27, 6, 0F); // Box 324
		bodyModel[147].setRotationPoint(-261.7F, -54.5F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 27, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 322
		bodyModel[148].setRotationPoint(-286.7F, -54.5F, 1F);
		bodyModel[148].rotateAngleY = -0.78539816F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 27, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[149].setRotationPoint(-278.7F, -54.5F, 9F);
		bodyModel[149].rotateAngleY = -1.57079633F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 27, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 324
		bodyModel[150].setRotationPoint(-268.7F, -54.5F, 9F);
		bodyModel[150].rotateAngleY = -2.35619449F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 27, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 325
		bodyModel[151].setRotationPoint(-260.7F, -54.5F, -5F);
		bodyModel[151].rotateAngleY = -3.92699082F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 27, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[152].setRotationPoint(-268.7F, -54.5F, -13F);
		bodyModel[152].rotateAngleY = -4.71238898F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 27, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 327
		bodyModel[153].setRotationPoint(-278.7F, -54.5F, -13F);
		bodyModel[153].rotateAngleY = -5.49778714F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 19, 48, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[154].setRotationPoint(-281.6F, -53F, -26F);
		bodyModel[154].rotateAngleZ = 1.57079633F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 5, 24, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[155].setRotationPoint(-286.6F, -53F, -14F);
		bodyModel[155].rotateAngleZ = 1.57079633F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 48
		tailModel[1] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 49
		tailModel[2] = new ModelRendererTurbo(this, 1681, 457, textureX, textureY); // Box 51
		tailModel[3] = new ModelRendererTurbo(this, 945, 497, textureX, textureY); // Box 52
		tailModel[4] = new ModelRendererTurbo(this, 1729, 577, textureX, textureY); // Box 53
		tailModel[5] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Box 54
		tailModel[6] = new ModelRendererTurbo(this, 993, 337, textureX, textureY); // Box 55
		tailModel[7] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 56
		tailModel[8] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 57
		tailModel[9] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 60
		tailModel[10] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 61
		tailModel[11] = new ModelRendererTurbo(this, 1105, 1, textureX, textureY); // Box 62
		tailModel[12] = new ModelRendererTurbo(this, 1225, 1, textureX, textureY); // Box 63
		tailModel[13] = new ModelRendererTurbo(this, 1353, 1, textureX, textureY); // Box 64
		tailModel[14] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 65
		tailModel[15] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 66
		tailModel[16] = new ModelRendererTurbo(this, 1577, 1, textureX, textureY); // Box 67
		tailModel[17] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 68
		tailModel[18] = new ModelRendererTurbo(this, 1953, 185, textureX, textureY); // Box 56
		tailModel[19] = new ModelRendererTurbo(this, 1409, 9, textureX, textureY); // Box 57
		tailModel[20] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 58
		tailModel[21] = new ModelRendererTurbo(this, 1185, 1, textureX, textureY); // Box 59
		tailModel[22] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 60
		tailModel[23] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 61
		tailModel[24] = new ModelRendererTurbo(this, 553, 585, textureX, textureY); // Box 62
		tailModel[25] = new ModelRendererTurbo(this, 1465, 9, textureX, textureY); // Box 63
		tailModel[26] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 64
		tailModel[27] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 65
		tailModel[28] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 2
		tailModel[29] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 6

		tailModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 109, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		tailModel[0].setRotationPoint(266.6F, -80.55F, -112F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 12, 1, 113, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		tailModel[1].setRotationPoint(266.6F, -80.55F, -3F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 36, 1, 113, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -8F); // Box 51
		tailModel[2].setRotationPoint(230.6F, -80.55F, -3F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 36, 1, 109, 0F,-14F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		tailModel[3].setRotationPoint(230.6F, -80.55F, -112F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 36, 1, 109, 0F,-14F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		tailModel[4].setRotationPoint(230.6F, -127.55F, -112F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 36, 1, 113, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -8F); // Box 54
		tailModel[5].setRotationPoint(230.6F, -127.55F, -3F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 113, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		tailModel[6].setRotationPoint(266.6F, -127.55F, -3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 12, 1, 109, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[7].setRotationPoint(266.6F, -127.55F, -112F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 31, 4, 1, 0F,-3F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		tailModel[8].setRotationPoint(244.6F, -126.55F, -91F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		tailModel[9].setRotationPoint(243.6F, -122.55F, -91F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 33, 32, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[10].setRotationPoint(243.6F, -119.55F, -91F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 31, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -3F, 0F, 0F); // Box 62
		tailModel[11].setRotationPoint(244.6F, -84.55F, -91F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 63
		tailModel[12].setRotationPoint(243.6F, -87.55F, -91F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 31, 4, 1, 0F,-3F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		tailModel[13].setRotationPoint(244.6F, -126.55F, 88F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		tailModel[14].setRotationPoint(243.6F, -122.55F, 88F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 33, 32, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		tailModel[15].setRotationPoint(243.6F, -119.55F, 88F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 67
		tailModel[16].setRotationPoint(243.6F, -87.55F, 88F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 31, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -3F, 0F, 0F); // Box 68
		tailModel[17].setRotationPoint(244.6F, -84.55F, 88F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 37, 207, 1, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		tailModel[18].setRotationPoint(234.3F, -79.28F, -25F);
		tailModel[18].rotateAngleY = 0.0296706F;
		tailModel[18].rotateAngleZ = 4.73856892F;

		tailModel[19].addShapeBox(0F, 0F, 0F, 21, 19, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		tailModel[19].setRotationPoint(253.3F, -79.28F, -24F);
		tailModel[19].rotateAngleY = 0.04712389F;
		tailModel[19].rotateAngleZ = 4.73856892F;

		tailModel[20].addShapeBox(0F, 0F, 0F, 16, 19, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 58
		tailModel[20].setRotationPoint(269.3F, -79.28F, -24F);
		tailModel[20].rotateAngleY = 0.0122173F;
		tailModel[20].rotateAngleZ = 4.73856892F;

		tailModel[21].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 59
		tailModel[21].setRotationPoint(279.3F, -80.28F, -24F);
		tailModel[21].rotateAngleY = 0.0122173F;
		tailModel[21].rotateAngleZ = 4.73856892F;

		tailModel[22].addShapeBox(0F, 0F, 0F, 46, 18, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		tailModel[22].setRotationPoint(27.5F, -73.88F, -31.14F);
		tailModel[22].rotateAngleY = 0.04712389F;
		tailModel[22].rotateAngleZ = 4.73856892F;

		tailModel[23].addShapeBox(0F, 0F, 0F, 46, 18, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		tailModel[23].setRotationPoint(27.5F, -73.88F, 25.86F);
		tailModel[23].rotateAngleY = -0.04712389F;
		tailModel[23].rotateAngleZ = 4.73856892F;

		tailModel[24].addShapeBox(0F, 0F, 0F, 37, 207, 1, 0F,0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		tailModel[24].setRotationPoint(234.3F, -79.28F, 20F);
		tailModel[24].rotateAngleY = -0.0296706F;
		tailModel[24].rotateAngleZ = 4.73856892F;

		tailModel[25].addShapeBox(0F, 0F, 0F, 21, 19, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		tailModel[25].setRotationPoint(253.3F, -79.28F, 19F);
		tailModel[25].rotateAngleY = -0.04712389F;
		tailModel[25].rotateAngleZ = 4.73856892F;

		tailModel[26].addShapeBox(0F, 0F, 0F, 16, 19, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 64
		tailModel[26].setRotationPoint(269.3F, -79.28F, 19F);
		tailModel[26].rotateAngleY = -0.0122173F;
		tailModel[26].rotateAngleZ = 4.73856892F;

		tailModel[27].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 65
		tailModel[27].setRotationPoint(279.3F, -80.28F, 19F);
		tailModel[27].rotateAngleY = -0.0296706F;
		tailModel[27].rotateAngleZ = 4.73856892F;

		tailModel[28].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		tailModel[28].setRotationPoint(-143F, -49F, -110F);
		tailModel[28].rotateAngleX = -0.20943951F;

		tailModel[29].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		tailModel[29].setRotationPoint(-95F, -49F, -110F);
		tailModel[29].rotateAngleX = -0.20943951F;
	}

	private void initbayModel_1()
	{
		bayModel[0] = new ModelRendererTurbo(this, 1489, 289, textureX, textureY); // Box 41
		bayModel[1] = new ModelRendererTurbo(this, 1489, 449, textureX, textureY); // Box 47

		bayModel[0].addShapeBox(0F, 0F, 0F, 20, 4, 151, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 41
		bayModel[0].setRotationPoint(-76.55F, -139.48F, -355F);
		bayModel[0].rotateAngleX = 3.14159265F;

		bayModel[1].addShapeBox(0F, 0F, 0F, 20, 4, 151, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 47
		bayModel[1].setRotationPoint(-76.55F, -24.48F, -355F);
		bayModel[1].rotateAngleX = 3.14159265F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 961, 289, textureX, textureY); // Box 39
		leftWingModel[1] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 40
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 585, textureX, textureY); // Box 42
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 46
		leftWingModel[4] = new ModelRendererTurbo(this, 1473, 89, textureX, textureY); // Box 36
		leftWingModel[5] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 37
		leftWingModel[6] = new ModelRendererTurbo(this, 1281, 121, textureX, textureY); // Box 38
		leftWingModel[7] = new ModelRendererTurbo(this, 1537, 89, textureX, textureY); // Box 39
		leftWingModel[8] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 40
		leftWingModel[9] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 41
		leftWingModel[10] = new ModelRendererTurbo(this, 1713, 121, textureX, textureY); // Box 42
		leftWingModel[11] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 43
		leftWingModel[12] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 44
		leftWingModel[13] = new ModelRendererTurbo(this, 1969, 129, textureX, textureY); // Box 45
		leftWingModel[14] = new ModelRendererTurbo(this, 1857, 129, textureX, textureY); // Box 46
		leftWingModel[15] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 47
		leftWingModel[16] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 48
		leftWingModel[17] = new ModelRendererTurbo(this, 1609, 137, textureX, textureY); // Box 49
		leftWingModel[18] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 50
		leftWingModel[19] = new ModelRendererTurbo(this, 1473, 153, textureX, textureY); // Box 51
		leftWingModel[20] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 52
		leftWingModel[21] = new ModelRendererTurbo(this, 1281, 161, textureX, textureY); // Box 53
		leftWingModel[22] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 54
		leftWingModel[23] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 55
		leftWingModel[24] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 66
		leftWingModel[25] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 67
		leftWingModel[26] = new ModelRendererTurbo(this, 1801, 65, textureX, textureY); // Box 0
		leftWingModel[27] = new ModelRendererTurbo(this, 1817, 65, textureX, textureY); // Box 1
		leftWingModel[28] = new ModelRendererTurbo(this, 1081, 1, textureX, textureY); // Box 4
		leftWingModel[29] = new ModelRendererTurbo(this, 1649, 1, textureX, textureY); // Box 5
		leftWingModel[30] = new ModelRendererTurbo(this, 2033, 185, textureX, textureY); // Box 6
		leftWingModel[31] = new ModelRendererTurbo(this, 1489, 289, textureX, textureY); // Box 7
		leftWingModel[32] = new ModelRendererTurbo(this, 1505, 289, textureX, textureY); // Box 8
		leftWingModel[33] = new ModelRendererTurbo(this, 1521, 289, textureX, textureY); // Box 9
		leftWingModel[34] = new ModelRendererTurbo(this, 1537, 289, textureX, textureY); // Box 10
		leftWingModel[35] = new ModelRendererTurbo(this, 1553, 289, textureX, textureY); // Box 11

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 101, 4, 322, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 39
		leftWingModel[0].setRotationPoint(-157.55F, -24.48F, -32F);
		leftWingModel[0].rotateAngleX = 3.14159265F;

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 68, 4, 151, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -20F); // Box 40
		leftWingModel[1].setRotationPoint(-144.55F, -139.48F, -355F);
		leftWingModel[1].rotateAngleX = 3.14159265F;

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 98, 4, 353, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 42
		leftWingModel[2].setRotationPoint(-154.55F, -139.48F, -2F);
		leftWingModel[2].rotateAngleX = 3.14159265F;

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 71, 4, 151, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -20F); // Box 46
		leftWingModel[3].setRotationPoint(-147.55F, -24.48F, -355F);
		leftWingModel[3].rotateAngleX = 3.14159265F;

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 14, 39, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		leftWingModel[4].setRotationPoint(-153F, -87F, -111F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 32, 39, 17, 0F,0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -13F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -4F); // Box 37
		leftWingModel[5].setRotationPoint(-185F, -87F, -111F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 29, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftWingModel[6].setRotationPoint(-139F, -65F, -111F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 23, 39, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 39
		leftWingModel[7].setRotationPoint(-110F, -87F, -111F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 19, 37, 17, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 40
		leftWingModel[8].setRotationPoint(-87F, -86F, -111F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 33, 17, 0F,0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 41
		leftWingModel[9].setRotationPoint(-68F, -84F, -111F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 32, 39, 11, 0F,0F, -7F, 4F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, -10F, 0F, -13F, 4F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -20F, -10F); // Box 42
		leftWingModel[10].setRotationPoint(-185F, -87F, -94F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 14, 39, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F); // Box 43
		leftWingModel[11].setRotationPoint(-153F, -87F, -94F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 29, 39, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F); // Box 44
		leftWingModel[12].setRotationPoint(-139F, -87F, -94F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 23, 39, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -14F, -1F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -14F, -1F, 0F, -13F, 0F); // Box 45
		leftWingModel[13].setRotationPoint(-110F, -87F, -94F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 19, 37, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -15F, -2F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -15F, -2F, 0F, -13F, 0F); // Box 46
		leftWingModel[14].setRotationPoint(-87F, -86F, -94F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 17, 33, 8, 0F,0F, 0F, 0F, 0F, -5F, 2F, 0F, -13F, -5F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, -13F, -5F, 0F, -13F, 0F); // Box 47
		leftWingModel[15].setRotationPoint(-68F, -84F, -94F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 17, 33, 8, 0F,0F, -13F, 0F, 0F, -13F, -5F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, -5F, 0F, -5F, 2F, 0F, 0F, 0F); // Box 48
		leftWingModel[16].setRotationPoint(-68F, -84F, -119F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 19, 37, 10, 0F,0F, -13F, 0F, 0F, -15F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -15F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[17].setRotationPoint(-87F, -86F, -121F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 23, 39, 11, 0F,0F, -13F, 0F, 0F, -14F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -14F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 50
		leftWingModel[18].setRotationPoint(-110F, -87F, -122F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 29, 39, 11, 0F,0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftWingModel[19].setRotationPoint(-139F, -87F, -122F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 14, 39, 11, 0F,0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftWingModel[20].setRotationPoint(-153F, -87F, -122F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 32, 39, 11, 0F,0F, -12F, -10F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -7F, 5F, 0F, -20F, -10F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 5F); // Box 53
		leftWingModel[21].setRotationPoint(-185F, -87F, -122F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftWingModel[22].setRotationPoint(-189F, -72F, -103F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftWingModel[23].setRotationPoint(-55F, -69F, -104F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 2, 57, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftWingModel[24].setRotationPoint(-143F, -141F, -105F);
		leftWingModel[24].rotateAngleX = -0.10471976F;

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 2, 57, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftWingModel[25].setRotationPoint(-143F, -141F, -105F);
		leftWingModel[25].rotateAngleX = 0.15707963F;

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 2, 57, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[26].setRotationPoint(-95F, -141F, -105F);
		leftWingModel[26].rotateAngleX = 0.15707963F;

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 2, 57, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		leftWingModel[27].setRotationPoint(-95F, -141F, -105F);
		leftWingModel[27].rotateAngleX = -0.10471976F;

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftWingModel[28].setRotationPoint(-143F, -49F, -97F);
		leftWingModel[28].rotateAngleX = 0.20943951F;

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftWingModel[29].setRotationPoint(-95F, -49F, -97F);
		leftWingModel[29].rotateAngleX = 0.20943951F;

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 2, 114, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftWingModel[30].setRotationPoint(-140F, -141F, -214F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 2, 114, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftWingModel[31].setRotationPoint(-140F, -141F, -344F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 2, 114, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		leftWingModel[32].setRotationPoint(-126F, -141F, -483F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 2, 114, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftWingModel[33].setRotationPoint(-75F, -141F, -214F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 2, 114, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		leftWingModel[34].setRotationPoint(-75F, -141F, -344F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 2, 114, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		leftWingModel[35].setRotationPoint(-80F, -141F, -483F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 43
		rightWingModel[1] = new ModelRendererTurbo(this, 1281, 73, textureX, textureY); // Box 44
		rightWingModel[2] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 48
		rightWingModel[3] = new ModelRendererTurbo(this, 905, 617, textureX, textureY); // Box 43
		rightWingModel[4] = new ModelRendererTurbo(this, 697, 337, textureX, textureY); // Box 44
		rightWingModel[5] = new ModelRendererTurbo(this, 1681, 297, textureX, textureY); // Box 45
		rightWingModel[6] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 3
		rightWingModel[7] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 4
		rightWingModel[8] = new ModelRendererTurbo(this, 1105, 9, textureX, textureY); // Box 5
		rightWingModel[9] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 6
		rightWingModel[10] = new ModelRendererTurbo(this, 1281, 65, textureX, textureY); // Box 7
		rightWingModel[11] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 8
		rightWingModel[12] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 9
		rightWingModel[13] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 12
		rightWingModel[14] = new ModelRendererTurbo(this, 1857, 73, textureX, textureY); // Box 13
		rightWingModel[15] = new ModelRendererTurbo(this, 1361, 73, textureX, textureY); // Box 14
		rightWingModel[16] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 15
		rightWingModel[17] = new ModelRendererTurbo(this, 1225, 9, textureX, textureY); // Box 16
		rightWingModel[18] = new ModelRendererTurbo(this, 1945, 73, textureX, textureY); // Box 17
		rightWingModel[19] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 19
		rightWingModel[20] = new ModelRendererTurbo(this, 617, 89, textureX, textureY); // Box 21
		rightWingModel[21] = new ModelRendererTurbo(this, 1353, 9, textureX, textureY); // Box 22
		rightWingModel[22] = new ModelRendererTurbo(this, 1625, 81, textureX, textureY); // Box 23
		rightWingModel[23] = new ModelRendererTurbo(this, 1513, 9, textureX, textureY); // Box 24
		rightWingModel[24] = new ModelRendererTurbo(this, 1577, 9, textureX, textureY); // Box 26
		rightWingModel[25] = new ModelRendererTurbo(this, 681, 1, textureX, textureY); // Box 27
		rightWingModel[26] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 28
		rightWingModel[27] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 29
		rightWingModel[28] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 30
		rightWingModel[29] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 31
		rightWingModel[30] = new ModelRendererTurbo(this, 1329, 1, textureX, textureY); // Box 32
		rightWingModel[31] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 33
		rightWingModel[32] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 34
		rightWingModel[33] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 35
		rightWingModel[34] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Box 0
		rightWingModel[35] = new ModelRendererTurbo(this, 1017, 161, textureX, textureY); // Box 1
		rightWingModel[36] = new ModelRendererTurbo(this, 1033, 161, textureX, textureY); // Box 2
		rightWingModel[37] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Box 3
		rightWingModel[38] = new ModelRendererTurbo(this, 713, 185, textureX, textureY); // Box 4
		rightWingModel[39] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Box 5
		rightWingModel[40] = new ModelRendererTurbo(this, 1201, 17, textureX, textureY); // Box 174
		rightWingModel[41] = new ModelRendererTurbo(this, 1025, 65, textureX, textureY); // Box 175
		rightWingModel[42] = new ModelRendererTurbo(this, 1041, 65, textureX, textureY); // Box 176
		rightWingModel[43] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 177
		rightWingModel[44] = new ModelRendererTurbo(this, 1513, 161, textureX, textureY); // Box 178
		rightWingModel[45] = new ModelRendererTurbo(this, 1377, 129, textureX, textureY); // Box 179
		rightWingModel[46] = new ModelRendererTurbo(this, 1921, 145, textureX, textureY); // Box 180
		rightWingModel[47] = new ModelRendererTurbo(this, 1569, 153, textureX, textureY); // Box 181
		rightWingModel[48] = new ModelRendererTurbo(this, 1369, 161, textureX, textureY); // Box 182
		rightWingModel[49] = new ModelRendererTurbo(this, 545, 177, textureX, textureY); // Box 183
		rightWingModel[50] = new ModelRendererTurbo(this, 1657, 177, textureX, textureY); // Box 184
		rightWingModel[51] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 185
		rightWingModel[52] = new ModelRendererTurbo(this, 1025, 97, textureX, textureY); // Box 186
		rightWingModel[53] = new ModelRendererTurbo(this, 1801, 121, textureX, textureY); // Box 187
		rightWingModel[54] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 188
		rightWingModel[55] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 189
		rightWingModel[56] = new ModelRendererTurbo(this, 1673, 137, textureX, textureY); // Box 190
		rightWingModel[57] = new ModelRendererTurbo(this, 1801, 145, textureX, textureY); // Box 191
		rightWingModel[58] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 192
		rightWingModel[59] = new ModelRendererTurbo(this, 2033, 81, textureX, textureY); // Box 195
		rightWingModel[60] = new ModelRendererTurbo(this, 1417, 129, textureX, textureY); // Box 196
		rightWingModel[61] = new ModelRendererTurbo(this, 1409, 169, textureX, textureY); // Box 197
		rightWingModel[62] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 198
		rightWingModel[63] = new ModelRendererTurbo(this, 1585, 185, textureX, textureY); // Box 199
		rightWingModel[64] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 200
		rightWingModel[65] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 201
		rightWingModel[66] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 202
		rightWingModel[67] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 203
		rightWingModel[68] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Box 204
		rightWingModel[69] = new ModelRendererTurbo(this, 1593, 177, textureX, textureY); // Box 205
		rightWingModel[70] = new ModelRendererTurbo(this, 1713, 185, textureX, textureY); // Box 206
		rightWingModel[71] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 207
		rightWingModel[72] = new ModelRendererTurbo(this, 1841, 185, textureX, textureY); // Box 208
		rightWingModel[73] = new ModelRendererTurbo(this, 601, 185, textureX, textureY); // Box 209
		rightWingModel[74] = new ModelRendererTurbo(this, 1881, 185, textureX, textureY); // Box 210
		rightWingModel[75] = new ModelRendererTurbo(this, 1569, 185, textureX, textureY); // Box 211
		rightWingModel[76] = new ModelRendererTurbo(this, 1921, 185, textureX, textureY); // Box 212
		rightWingModel[77] = new ModelRendererTurbo(this, 1369, 193, textureX, textureY); // Box 213

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 68, 4, 151, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -20F); // Box 43
		rightWingModel[0].setRotationPoint(-144.55F, -143.48F, 351F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 20, 4, 151, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 44
		rightWingModel[1].setRotationPoint(-76.55F, -143.48F, 351F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 98, 4, 353, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 48
		rightWingModel[2].setRotationPoint(-154.55F, -143.48F, -2F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 101, 4, 323, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 43
		rightWingModel[3].setRotationPoint(-157.55F, -28.48F, 28F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 71, 4, 151, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, -20F); // Box 44
		rightWingModel[4].setRotationPoint(-147.55F, -28.48F, 351F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 20, 4, 151, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 45
		rightWingModel[5].setRotationPoint(-76.55F, -28.48F, 351F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 32, 39, 17, 0F,0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -4F, 0F, -13F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, -4F); // Box 3
		rightWingModel[6].setRotationPoint(-185F, -87F, 88F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 14, 39, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightWingModel[7].setRotationPoint(-153F, -87F, 88F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 29, 17, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		rightWingModel[8].setRotationPoint(-139F, -65F, 88F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 23, 39, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 6
		rightWingModel[9].setRotationPoint(-110F, -87F, 88F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 19, 37, 17, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 7
		rightWingModel[10].setRotationPoint(-87F, -86F, 88F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 17, 33, 17, 0F,0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F); // Box 8
		rightWingModel[11].setRotationPoint(-68F, -84F, 88F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 32, 39, 11, 0F,0F, -7F, 4F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, -10F, 0F, -13F, 4F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -20F, -10F); // Box 9
		rightWingModel[12].setRotationPoint(-185F, -87F, 105F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 14, 39, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F); // Box 12
		rightWingModel[13].setRotationPoint(-153F, -87F, 105F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 29, 39, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F); // Box 13
		rightWingModel[14].setRotationPoint(-139F, -87F, 105F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 23, 39, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -14F, -1F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -14F, -1F, 0F, -13F, 0F); // Box 14
		rightWingModel[15].setRotationPoint(-110F, -87F, 105F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 19, 37, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -15F, -2F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -15F, -2F, 0F, -13F, 0F); // Box 15
		rightWingModel[16].setRotationPoint(-87F, -86F, 105F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 17, 33, 8, 0F,0F, 0F, 0F, 0F, -5F, 2F, 0F, -13F, -5F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -5F, 2F, 0F, -13F, -5F, 0F, -13F, 0F); // Box 16
		rightWingModel[17].setRotationPoint(-68F, -84F, 105F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 32, 39, 11, 0F,0F, -12F, -10F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -7F, 5F, 0F, -20F, -10F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, -13F, 5F); // Box 17
		rightWingModel[18].setRotationPoint(-185F, -87F, 77F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightWingModel[19].setRotationPoint(-189F, -72F, 96F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 29, 39, 11, 0F,0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		rightWingModel[20].setRotationPoint(-139F, -87F, 77F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 14, 39, 11, 0F,0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		rightWingModel[21].setRotationPoint(-153F, -87F, 77F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 23, 39, 11, 0F,0F, -13F, 0F, 0F, -14F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -14F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 23
		rightWingModel[22].setRotationPoint(-110F, -87F, 77F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 19, 37, 10, 0F,0F, -13F, 0F, 0F, -15F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -15F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[23].setRotationPoint(-87F, -86F, 78F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 17, 33, 8, 0F,0F, -13F, 0F, 0F, -13F, -5F, 0F, -5F, 2F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, -5F, 0F, -5F, 2F, 0F, 0F, 0F); // Box 26
		rightWingModel[24].setRotationPoint(-68F, -84F, 80F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		rightWingModel[25].setRotationPoint(-55F, -69F, 96F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		rightWingModel[26].setRotationPoint(-143F, -49F, 89F);
		rightWingModel[26].rotateAngleX = -0.20943951F;

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		rightWingModel[27].setRotationPoint(-143F, -49F, 102F);
		rightWingModel[27].rotateAngleX = 0.20943951F;

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		rightWingModel[28].setRotationPoint(-95F, -49F, 89F);
		rightWingModel[28].rotateAngleX = -0.20943951F;

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightWingModel[29].setRotationPoint(-95F, -49F, 102F);
		rightWingModel[29].rotateAngleX = 0.20943951F;

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 2, 57, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		rightWingModel[30].setRotationPoint(-143F, -141F, 94F);
		rightWingModel[30].rotateAngleX = 0.15707963F;

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 2, 57, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		rightWingModel[31].setRotationPoint(-143F, -141F, 94F);
		rightWingModel[31].rotateAngleX = -0.10471976F;

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 2, 57, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightWingModel[32].setRotationPoint(-95F, -141F, 94F);
		rightWingModel[32].rotateAngleX = 0.15707963F;

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 2, 57, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightWingModel[33].setRotationPoint(-95F, -141F, 94F);
		rightWingModel[33].rotateAngleX = -0.10471976F;

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 2, 113, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightWingModel[34].setRotationPoint(-140F, -141F, 211F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 2, 113, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		rightWingModel[35].setRotationPoint(-140F, -141F, 341F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 2, 113, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightWingModel[36].setRotationPoint(-126F, -141F, 479F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 2, 113, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		rightWingModel[37].setRotationPoint(-75F, -141F, 341F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 2, 113, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightWingModel[38].setRotationPoint(-80F, -141F, 479F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 2, 113, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		rightWingModel[39].setRotationPoint(-75F, -141F, 211F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		rightWingModel[40].setRotationPoint(-143F, -25F, 84F);
		rightWingModel[40].rotateAngleX = -0.20943951F;
		rightWingModel[40].rotateAngleZ = 0.80285146F;

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightWingModel[41].setRotationPoint(-143F, -25F, 107F);
		rightWingModel[41].rotateAngleX = 0.20943951F;
		rightWingModel[41].rotateAngleZ = 0.80285146F;

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightWingModel[42].setRotationPoint(-95F, -26F, 83F);
		rightWingModel[42].rotateAngleX = -0.17453293F;
		rightWingModel[42].rotateAngleZ = -0.80285146F;

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightWingModel[43].setRotationPoint(-95F, -26F, 107F);
		rightWingModel[43].rotateAngleX = 0.20943951F;
		rightWingModel[43].rotateAngleZ = -0.80285146F;

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rightWingModel[44].setRotationPoint(-119F, -3F, 74F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 7, 18, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		rightWingModel[45].setRotationPoint(-121.5F, -11F, 65F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 180
		rightWingModel[46].setRotationPoint(-114.5F, -11F, 65F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 181
		rightWingModel[47].setRotationPoint(-126.5F, -11F, 65F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 182
		rightWingModel[48].setRotationPoint(-126.5F, -11F, 118F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 7, 18, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		rightWingModel[49].setRotationPoint(-121.5F, -11F, 118F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 184
		rightWingModel[50].setRotationPoint(-114.5F, -11F, 118F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 185
		rightWingModel[51].setRotationPoint(-109.5F, -7F, 118F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 186
		rightWingModel[52].setRotationPoint(-127.5F, -7F, 118F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F); // Box 187
		rightWingModel[53].setRotationPoint(-121.5F, -11F, 118F);
		rightWingModel[53].rotateAngleZ = 1.57079633F;

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,-0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F); // Box 188
		rightWingModel[54].setRotationPoint(-121.5F, 8F, 118F);
		rightWingModel[54].rotateAngleZ = 1.57079633F;

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 189
		rightWingModel[55].setRotationPoint(-127.5F, -7F, 65F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F); // Box 190
		rightWingModel[56].setRotationPoint(-121.5F, -11F, 65F);
		rightWingModel[56].rotateAngleZ = 1.57079633F;

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 191
		rightWingModel[57].setRotationPoint(-109.5F, -7F, 65F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,-0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F); // Box 192
		rightWingModel[58].setRotationPoint(-121.5F, 8F, 65F);
		rightWingModel[58].rotateAngleZ = 1.57079633F;

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rightWingModel[59].setRotationPoint(-95F, -27F, -115F);
		rightWingModel[59].rotateAngleX = -0.17453293F;
		rightWingModel[59].rotateAngleZ = -0.80285146F;

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 2, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		rightWingModel[60].setRotationPoint(-143F, -25F, -114F);
		rightWingModel[60].rotateAngleX = -0.20943951F;
		rightWingModel[60].rotateAngleZ = 0.80285146F;

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightWingModel[61].setRotationPoint(-95F, -26F, -92F);
		rightWingModel[61].rotateAngleX = 0.20943951F;
		rightWingModel[61].rotateAngleZ = -0.80285146F;

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 2, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		rightWingModel[62].setRotationPoint(-143F, -25F, -92F);
		rightWingModel[62].rotateAngleX = 0.20943951F;
		rightWingModel[62].rotateAngleZ = 0.80285146F;

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 2, 2, 45, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightWingModel[63].setRotationPoint(-119F, -3F, -124F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 7, 18, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		rightWingModel[64].setRotationPoint(-121.5F, -11F, -82F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 7, 18, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		rightWingModel[65].setRotationPoint(-121.5F, -11F, -134F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 202
		rightWingModel[66].setRotationPoint(-126.5F, -11F, -82F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 203
		rightWingModel[67].setRotationPoint(-127.5F, -7F, -82F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,-0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F); // Box 204
		rightWingModel[68].setRotationPoint(-121.5F, 8F, -82F);
		rightWingModel[68].rotateAngleZ = 1.57079633F;

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F); // Box 205
		rightWingModel[69].setRotationPoint(-121.5F, -11F, -82F);
		rightWingModel[69].rotateAngleZ = 1.57079633F;

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 206
		rightWingModel[70].setRotationPoint(-114.5F, -11F, -82F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 207
		rightWingModel[71].setRotationPoint(-109.5F, -7F, -82F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 208
		rightWingModel[72].setRotationPoint(-126.5F, -11F, -134F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 209
		rightWingModel[73].setRotationPoint(-127.5F, -7F, -134F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 5, 18, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 210
		rightWingModel[74].setRotationPoint(-114.5F, -11F, -134F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,-0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F); // Box 211
		rightWingModel[75].setRotationPoint(-121.5F, 8F, -134F);
		rightWingModel[75].rotateAngleZ = 1.57079633F;

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 1, 10, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 212
		rightWingModel[76].setRotationPoint(-109.5F, -7F, -134F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F); // Box 213
		rightWingModel[77].setRotationPoint(-121.5F, -11F, -134F);
		rightWingModel[77].rotateAngleZ = 1.57079633F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][2];
		propellerModels[0] = makeProp1(-189F, -71F, 97F);
		propellerModels[1] = makeProp2(-49F, -68F, 97F);
		propellerModels[2] = makeProp3(-189F, -71F, -102F);
		propellerModels[3] = makeProp4(-49F, -68F, -103F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[1].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[1].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 3.14159265F;
		prop[1].rotateAngleY = 3.14159265F;
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[1].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[2];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[1].addBox(-0.5F, -37F, -2F, 1, 37, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[0].rotateAngleY = 3.14159265F;
		prop[1].rotateAngleY = 3.14159265F;
		return prop;
	}

	
}