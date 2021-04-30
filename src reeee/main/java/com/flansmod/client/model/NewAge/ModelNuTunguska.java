//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tunguska
// Model Creator: 
// Created on: 22.08.2017 - 21:31:23
// Last changed on: 22.08.2017 - 21:31:23

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNuTunguska extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 1024;

	public ModelNuTunguska() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[130];
		turretModel = new ModelRendererTurbo[86];
		barrelModel = new ModelRendererTurbo[72];
		leftTrackWheelModels = new ModelRendererTurbo[33];
		rightTrackWheelModels = new ModelRendererTurbo[33];
		leftTrackModel = new ModelRendererTurbo[10];
		rightTrackModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 78
		bodyModel[20] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 79
		bodyModel[21] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 80
		bodyModel[22] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 81
		bodyModel[23] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 82
		bodyModel[24] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 83
		bodyModel[25] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 84
		bodyModel[26] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 223
		bodyModel[27] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 224
		bodyModel[28] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 225
		bodyModel[29] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 226
		bodyModel[30] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 227
		bodyModel[31] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 228
		bodyModel[32] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 229
		bodyModel[33] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 230
		bodyModel[34] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 231
		bodyModel[35] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 232
		bodyModel[36] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 233
		bodyModel[37] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 195
		bodyModel[38] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 196
		bodyModel[39] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 197
		bodyModel[40] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 198
		bodyModel[41] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 199
		bodyModel[42] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 200
		bodyModel[43] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 201
		bodyModel[44] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 202
		bodyModel[45] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 203
		bodyModel[46] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 204
		bodyModel[47] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 205
		bodyModel[48] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 206
		bodyModel[49] = new ModelRendererTurbo(this, 481, 273, textureX, textureY); // Box 207
		bodyModel[50] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 208
		bodyModel[51] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 209
		bodyModel[52] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Box 210
		bodyModel[53] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 211
		bodyModel[54] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 212
		bodyModel[55] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Box 213
		bodyModel[56] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 214
		bodyModel[57] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 215
		bodyModel[58] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 216
		bodyModel[59] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Box 217
		bodyModel[60] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Box 218
		bodyModel[61] = new ModelRendererTurbo(this, 305, 289, textureX, textureY); // Box 219
		bodyModel[62] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Box 220
		bodyModel[63] = new ModelRendererTurbo(this, 449, 289, textureX, textureY); // Box 221
		bodyModel[64] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 222
		bodyModel[65] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 223
		bodyModel[66] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 224
		bodyModel[67] = new ModelRendererTurbo(this, 113, 305, textureX, textureY); // Box 225
		bodyModel[68] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 226
		bodyModel[69] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 227
		bodyModel[70] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Box 228
		bodyModel[71] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Box 253
		bodyModel[72] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Box 254
		bodyModel[73] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 255
		bodyModel[74] = new ModelRendererTurbo(this, 353, 337, textureX, textureY); // Box 256
		bodyModel[75] = new ModelRendererTurbo(this, 377, 337, textureX, textureY); // Box 257
		bodyModel[76] = new ModelRendererTurbo(this, 401, 337, textureX, textureY); // Box 258
		bodyModel[77] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 259
		bodyModel[78] = new ModelRendererTurbo(this, 449, 337, textureX, textureY); // Box 260
		bodyModel[79] = new ModelRendererTurbo(this, 473, 337, textureX, textureY); // Box 261
		bodyModel[80] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 262
		bodyModel[81] = new ModelRendererTurbo(this, 233, 345, textureX, textureY); // Box 263
		bodyModel[82] = new ModelRendererTurbo(this, 257, 345, textureX, textureY); // Box 264
		bodyModel[83] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 265
		bodyModel[84] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 266
		bodyModel[85] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 267
		bodyModel[86] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 268
		bodyModel[87] = new ModelRendererTurbo(this, 209, 441, textureX, textureY); // Box 331
		bodyModel[88] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 332
		bodyModel[89] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 333
		bodyModel[90] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 334
		bodyModel[91] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 335
		bodyModel[92] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 336
		bodyModel[93] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 337
		bodyModel[94] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 338
		bodyModel[95] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 339
		bodyModel[96] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 340
		bodyModel[97] = new ModelRendererTurbo(this, 289, 441, textureX, textureY); // Box 341
		bodyModel[98] = new ModelRendererTurbo(this, 313, 441, textureX, textureY); // Box 342
		bodyModel[99] = new ModelRendererTurbo(this, 313, 441, textureX, textureY); // Box 343
		bodyModel[100] = new ModelRendererTurbo(this, 345, 441, textureX, textureY); // Box 344
		bodyModel[101] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 345
		bodyModel[102] = new ModelRendererTurbo(this, 113, 313, textureX, textureY); // Box 346
		bodyModel[103] = new ModelRendererTurbo(this, 385, 441, textureX, textureY); // Box 347
		bodyModel[104] = new ModelRendererTurbo(this, 465, 345, textureX, textureY); // Box 348
		bodyModel[105] = new ModelRendererTurbo(this, 441, 361, textureX, textureY); // Box 349
		bodyModel[106] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 350
		bodyModel[107] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 351
		bodyModel[108] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 352
		bodyModel[109] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 353
		bodyModel[110] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 354
		bodyModel[111] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 355
		bodyModel[112] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 356
		bodyModel[113] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 357
		bodyModel[114] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 358
		bodyModel[115] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 359
		bodyModel[116] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 360
		bodyModel[117] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 361
		bodyModel[118] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 362
		bodyModel[119] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 363
		bodyModel[120] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 364
		bodyModel[121] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 365
		bodyModel[122] = new ModelRendererTurbo(this, 409, 441, textureX, textureY); // Box 366
		bodyModel[123] = new ModelRendererTurbo(this, 449, 449, textureX, textureY); // Box 367
		bodyModel[124] = new ModelRendererTurbo(this, 1, 457, textureX, textureY); // Box 368
		bodyModel[125] = new ModelRendererTurbo(this, 41, 457, textureX, textureY); // Box 369
		bodyModel[126] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 370
		bodyModel[127] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 371
		bodyModel[128] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 372
		bodyModel[129] = new ModelRendererTurbo(this, 81, 457, textureX, textureY); // Box 373

		bodyModel[0].addShapeBox(0F, 0F, 0F, 105, 12, 56, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-61F, -24F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-84F, -22.5F, -27.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 126, 2, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.01F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-74F, -13F, 19F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0F, 0F, 0F, -1.01F, 3F, 0F, -1.01F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-80F, -10F, 19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 11, 57, 0F,0F, 0.4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-73F, -23F, -28F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0.7F, -1.2F, 0F, 0.7F, -1.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(52F, -12F, 19F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.69F, -0.21F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.69F, -0.21F, -1F, 0F, 0.21F, 0F, -0.5F, 1.3F, 0F, -0.5F, 1.3F, 0F, 0F, 0.21F, 0F); // Box 8
		bodyModel[6].setRotationPoint(55F, -11F, 19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.6F, -0.3F, 0F, -1.01F, 1F, 0F, -1.01F, 1F, -1F, 0.5F, -0.3F, 0F, -2.5F, 0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, -1F, -2.5F, 0.5F, 0F); // Box 9
		bodyModel[7].setRotationPoint(57F, -9F, 19F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 126, 2, 12, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -1.01F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-74F, -13F, -31F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0F, 0F, -1F, -1.01F, 3F, -1F, -1.01F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-80F, -10F, -31F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, -1F, 0.7F, -1.2F, -1F, 0.7F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(52F, -12F, -31F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,-0.69F, -0.21F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -0.69F, -0.21F, 0F, 0F, 0.21F, 0F, -0.5F, 1.3F, 0F, -0.5F, 1.3F, 0F, 0F, 0.21F, 0F); // Box 13
		bodyModel[11].setRotationPoint(55F, -11F, -31F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0.5F, -0.3F, 0F, -1.01F, 1F, -1F, -1.01F, 1F, 0F, 0.6F, -0.3F, 0F, -2.5F, 0.5F, 0F, 3F, -0.5F, -1F, 3F, -0.5F, 0F, -2.5F, 0.5F, 0F); // Box 14
		bodyModel[12].setRotationPoint(57F, -9F, -31F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 123, 12, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-69F, -11F, -19F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 12, 38, 0F,0F, -1.401F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -1.401F, 0F, -11.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.9F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-80.99F, -11F, -19F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 12, 56, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(44F, -23F, -28F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, 0F, 0F, 0.8F, -3F, 0F, 0.8F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.2F, 4.5F, 0F, -2.2F, 4.5F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[16].setRotationPoint(54F, -15F, -28F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, 0F, 0F, 0.8F, -3F, 0F, 0.8F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.2F, 4.5F, 0F, -2.2F, 4.5F, 0F, 0F, -1F, 0F); // Box 20
		bodyModel[17].setRotationPoint(54F, -15F, 19F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 13, 38, 0F,0F, 0F, 0.01F, 0.8F, -3F, 0.01F, 0.8F, -3F, 0.01F, 0F, 0F, 0.01F, 0F, 3F, 0.01F, -3.7F, 0F, 0.01F, -3.7F, 0F, 0.01F, 0F, 3F, 0.01F); // Box 21
		bodyModel[18].setRotationPoint(54F, -15F, -19F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 5F, 0.5F, 0F, 5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 78
		bodyModel[19].setRotationPoint(29F, -25F, -27.8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 2, 9, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 79
		bodyModel[20].setRotationPoint(15F, -25F, -27.8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 7, 12, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[21].setRotationPoint(44F, -22.5F, -27.8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 7, 14, 0F,0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[22].setRotationPoint(44F, -22.5F, -15.7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[23].setRotationPoint(46F, -22.2F, 4.3F);
		bodyModel[23].rotateAngleZ = -0.68067841F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 83
		bodyModel[24].setRotationPoint(43F, -24.2F, 6.3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 7, 8, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[25].setRotationPoint(44F, -22.5F, 19.8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 33, 12, 1, 0F,0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[26].setRotationPoint(-61F, -24F, 28F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[27].setRotationPoint(-63F, -17F, 28.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[28].setRotationPoint(-61F, -21F, 28.3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[29].setRotationPoint(-51.5F, -21F, 28.3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[30].setRotationPoint(-44.5F, -21F, 28.3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[31].setRotationPoint(-37.5F, -21F, 28.3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[32].setRotationPoint(-31.2F, -22.5F, 28.3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 230
		bodyModel[33].setRotationPoint(-55.2F, -20F, 28.3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[34].setRotationPoint(-55.2F, -19F, 28.3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[35].setRotationPoint(-67.5F, -14.8F, 28.3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 233
		bodyModel[36].setRotationPoint(-67.5F, -15.8F, 28.3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 195
		bodyModel[37].setRotationPoint(-26.5F, -21.25F, 27.9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[38].setRotationPoint(-16F, -19.7F, 28F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[39].setRotationPoint(-16F, -15.7F, 28F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[40].setRotationPoint(33F, -14.7F, 28F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[41].setRotationPoint(33F, -18.7F, 28F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 200
		bodyModel[42].setRotationPoint(26.5F, -19.75F, 27.9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 201
		bodyModel[43].setRotationPoint(36.5F, -20.75F, 27.9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[44].setRotationPoint(36F, -15.2F, 28F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[45].setRotationPoint(36F, -19.2F, 28F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[46].setRotationPoint(-33.5F, -22.75F, -28.9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[47].setRotationPoint(-23F, -21.2F, -29F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[48].setRotationPoint(-23F, -17.2F, -29F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[49].setRotationPoint(-18.5F, -21.25F, -28.9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[50].setRotationPoint(-8F, -19.7F, -29F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[51].setRotationPoint(-8F, -15.7F, -29F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[52].setRotationPoint(16.5F, -21.25F, -28.9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[53].setRotationPoint(24F, -19.7F, -29F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[54].setRotationPoint(24F, -15.7F, -29F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 17, 8, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[55].setRotationPoint(31.5F, -20.5F, -28.8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[56].setRotationPoint(48.51F, -20.5F, -28.8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[57].setRotationPoint(-58F, -15.5F, -29F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[58].setRotationPoint(-58F, -19.5F, -29F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 12, 8, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[59].setRotationPoint(-68.5F, -21.05F, -28.9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 30, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.51F, 0F, 0F, -0.51F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.51F, 0.5F, 0F, -0.51F); // Box 218
		bodyModel[60].setRotationPoint(-61F, -24.7F, 13.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 30, 1, 7, 0F,0F, 0F, -0.51F, 0F, 0F, -0.51F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.51F, 0.5F, 0F, -0.51F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 219
		bodyModel[61].setRotationPoint(-61F, -24.7F, -28.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 24, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[62].setRotationPoint(-56F, -24.7F, -18.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[63].setRotationPoint(-57F, -24.7F, -4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 222
		bodyModel[64].setRotationPoint(-57F, -24.7F, 9.01F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,-0.3F, -0.3F, -1.51F, 0F, 0.3F, -1.51F, 0F, 0.3F, 0F, -0.3F, -0.3F, 0F, 0.5F, 0F, -0.51F, 2F, 0F, -0.51F, 2F, 0F, 0F, 0.5F, 0F, 0F); // Box 223
		bodyModel[65].setRotationPoint(-80F, -24.7F, -11.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 20, 2, 3, 0F,-0.3F, -0.3F, 0.01F, 0F, 0.3F, 0.01F, -3F, 0.3F, 0.01F, -0.3F, -0.3F, 0.01F, 0.5F, 0F, 0.01F, 2F, 0F, 0.01F, -1F, 0F, 0.01F, 0.5F, 0F, 0.01F); // Box 224
		bodyModel[66].setRotationPoint(-80F, -24.7F, 9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 17, 2, 5, 0F,-0.3F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1.51F, -0.3F, -0.3F, -1.51F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.51F, 0.5F, 0F, -0.51F); // Box 225
		bodyModel[67].setRotationPoint(-80F, -24.7F, 12.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 226
		bodyModel[68].setRotationPoint(-71F, -26F, 19.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 227
		bodyModel[69].setRotationPoint(-69.01F, -26.5F, 19.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 3, 8, 0F,0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0F, 0.5F); // Box 228
		bodyModel[70].setRotationPoint(-72.5F, -25.9F, -21.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, 0F, 0F); // Box 253
		bodyModel[71].setRotationPoint(31F, 1F, 18.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, 0F, 0F); // Box 254
		bodyModel[72].setRotationPoint(12F, 1F, 18.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, 0F, 0F); // Box 255
		bodyModel[73].setRotationPoint(-6F, 1F, 18.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, 0F, 0F); // Box 256
		bodyModel[74].setRotationPoint(-24F, 1F, 18.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, 0F, 0F); // Box 257
		bodyModel[75].setRotationPoint(-43F, 1F, 18.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, -1F, 0F, 3F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3.5F, 0F, 0F, -3.5F, -1F, 0F, 0F, 0F); // Box 258
		bodyModel[76].setRotationPoint(-60F, 1F, 18.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F, -1F); // Box 259
		bodyModel[77].setRotationPoint(31F, 1F, -21.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F, -1F); // Box 260
		bodyModel[78].setRotationPoint(12F, 1F, -21.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F, -1F); // Box 261
		bodyModel[79].setRotationPoint(-6F, 1F, -21.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F, -1F); // Box 262
		bodyModel[80].setRotationPoint(-24F, 1F, -21.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F, -1F); // Box 263
		bodyModel[81].setRotationPoint(-43F, 1F, -21.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3.5F, -1F, 0F, -3.5F, 0F, 0F, 0F, -1F); // Box 264
		bodyModel[82].setRotationPoint(-60F, 1F, -21.5F);

		bodyModel[83].addShapeBox(-1F, 0F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[83].setRotationPoint(48F, -3F, 19.5F);

		bodyModel[84].addShapeBox(-1F, 0F, -1F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[84].setRotationPoint(48F, -3F, -22.5F);

		bodyModel[85].addShapeBox(-1F, 0F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[85].setRotationPoint(-70F, -3F, 19.5F);

		bodyModel[86].addShapeBox(-1F, 0F, -1F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[86].setRotationPoint(-70F, -3F, -22.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 14, 57, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F); // Box 331
		bodyModel[87].setRotationPoint(-82F, -23.5F, -28F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 332
		bodyModel[88].setRotationPoint(-84F, -23.5F, -25.8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 333
		bodyModel[89].setRotationPoint(-84F, -23.5F, -24.6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 334
		bodyModel[90].setRotationPoint(-84F, -23.5F, -27F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 335
		bodyModel[91].setRotationPoint(-84F, -21.51F, -27.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[92].setRotationPoint(-84F, -22.5F, 23.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 337
		bodyModel[93].setRotationPoint(-84F, -23.5F, 25.8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 338
		bodyModel[94].setRotationPoint(-84F, -23.5F, 24.6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 339
		bodyModel[95].setRotationPoint(-84F, -23.5F, 27F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 340
		bodyModel[96].setRotationPoint(-84F, -21.51F, 23.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[97].setRotationPoint(-83F, -21.5F, -20F);
		bodyModel[97].rotateAngleZ = 0.08726646F;

		bodyModel[98].addShapeBox(0F, 5F, 0F, 2, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 342
		bodyModel[98].setRotationPoint(-83F, -21.5F, -20F);
		bodyModel[98].rotateAngleZ = 0.08726646F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 7, 21, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 343
		bodyModel[99].setRotationPoint(-84F, -17.5F, 1F);
		bodyModel[99].rotateAngleZ = 0.19198622F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 344
		bodyModel[100].setRotationPoint(53F, -19.8F, -27.8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 345
		bodyModel[101].setRotationPoint(53F, -19.51F, -28.1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 346
		bodyModel[102].setRotationPoint(53F, -19.51F, -20.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 347
		bodyModel[103].setRotationPoint(53F, -19.8F, 19.8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 348
		bodyModel[104].setRotationPoint(53F, -19.51F, 27.1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 349
		bodyModel[105].setRotationPoint(53F, -19.51F, 19.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[106].setRotationPoint(54F, -17.8F, -27.1F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[107].setRotationPoint(54F, -18.8F, -27.1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 352
		bodyModel[108].setRotationPoint(54F, -16.8F, -27.1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 353
		bodyModel[109].setRotationPoint(53.2F, -15.7F, -26.6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 354
		bodyModel[110].setRotationPoint(53.2F, -15.7F, -23F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 355
		bodyModel[111].setRotationPoint(54F, -16.8F, -23.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[112].setRotationPoint(54F, -17.8F, -23.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[113].setRotationPoint(54F, -18.8F, -23.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[114].setRotationPoint(54F, -17.8F, 24.1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[115].setRotationPoint(54F, -18.8F, 24.1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 360
		bodyModel[116].setRotationPoint(54F, -16.8F, 24.1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 361
		bodyModel[117].setRotationPoint(53.2F, -15.7F, 24.6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 362
		bodyModel[118].setRotationPoint(53.2F, -15.7F, 21F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 363
		bodyModel[119].setRotationPoint(54F, -16.8F, 20.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[120].setRotationPoint(54F, -17.8F, 20.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[121].setRotationPoint(54F, -18.8F, 20.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[122].setRotationPoint(33F, -24.2F, -14.7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[123].setRotationPoint(22F, -25.2F, 16.3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[124].setRotationPoint(34F, -24.5F, 3.3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[125].setRotationPoint(34F, -23.5F, 3.3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 370
		bodyModel[126].setRotationPoint(32F, -24.2F, 3.3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 371
		bodyModel[127].setRotationPoint(32F, -24.5F, 5.3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 372
		bodyModel[128].setRotationPoint(32F, -24.5F, 11.3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[129].setRotationPoint(33F, -24F, 16.3F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 22
		turretModel[1] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 23
		turretModel[2] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 24
		turretModel[3] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 25
		turretModel[4] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 26
		turretModel[5] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 27
		turretModel[6] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 28
		turretModel[7] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 29
		turretModel[8] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 30
		turretModel[9] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 31
		turretModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		turretModel[11] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 33
		turretModel[12] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 34
		turretModel[13] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 35
		turretModel[14] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 36
		turretModel[15] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 37
		turretModel[16] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 38
		turretModel[17] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 39
		turretModel[18] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 40
		turretModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 41
		turretModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 42
		turretModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 43
		turretModel[22] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 44
		turretModel[23] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 45
		turretModel[24] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 46
		turretModel[25] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 47
		turretModel[26] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 48
		turretModel[27] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 49
		turretModel[28] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 50
		turretModel[29] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 51
		turretModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 52
		turretModel[31] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 53
		turretModel[32] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 54
		turretModel[33] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 55
		turretModel[34] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 56
		turretModel[35] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 57
		turretModel[36] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 58
		turretModel[37] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 59
		turretModel[38] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 60
		turretModel[39] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 61
		turretModel[40] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 62
		turretModel[41] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 63
		turretModel[42] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 64
		turretModel[43] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 65
		turretModel[44] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 66
		turretModel[45] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 67
		turretModel[46] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 68
		turretModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 69
		turretModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 70
		turretModel[49] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 71
		turretModel[50] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 72
		turretModel[51] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 73
		turretModel[52] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 74
		turretModel[53] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 75
		turretModel[54] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 76
		turretModel[55] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 77
		turretModel[56] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 85
		turretModel[57] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 86
		turretModel[58] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 87
		turretModel[59] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 88
		turretModel[60] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 89
		turretModel[61] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 90
		turretModel[62] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 91
		turretModel[63] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 92
		turretModel[64] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 93
		turretModel[65] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 94
		turretModel[66] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 95
		turretModel[67] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 96
		turretModel[68] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 97
		turretModel[69] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 98
		turretModel[70] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 99
		turretModel[71] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 100
		turretModel[72] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 101
		turretModel[73] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 102
		turretModel[74] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 103
		turretModel[75] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 104
		turretModel[76] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 105
		turretModel[77] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 106
		turretModel[78] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 107
		turretModel[79] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 108
		turretModel[80] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 109
		turretModel[81] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 110
		turretModel[82] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 111
		turretModel[83] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 112
		turretModel[84] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 113
		turretModel[85] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 114

		turretModel[0].addShapeBox(0F, 0F, 0F, 8, 5, 52, 0F,0.01F, 0F, 0F, 0.01F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, 0F, 0.01F, 0F, 1F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 1F); // Box 22
		turretModel[0].setRotationPoint(-1F, -27.5F, -26F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 7, 5, 50, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F); // Box 23
		turretModel[1].setRotationPoint(7F, -27.5F, -25F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 6, 5, 42, 0F,0.01F, 0F, 0F, 0.01F, 0F, -6F, 0.01F, 0F, -6F, 0.01F, 0F, 0F, 0.01F, 0F, 1F, 0.01F, 0F, -5F, 0.01F, 0F, -5F, 0.01F, 0F, 1F); // Box 24
		turretModel[2].setRotationPoint(14F, -27.5F, -21F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 4, 5, 30, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F); // Box 25
		turretModel[3].setRotationPoint(20F, -27.5F, -15F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,0.01F, 0F, 0F, 0.01F, 0F, -2.5F, 0.01F, 0F, -2.5F, 0.01F, 0F, 0F, 0.01F, -0.2F, 0.5F, 0.01F, -0.2F, -2F, 0.01F, -0.2F, -2F, 0.01F, -0.2F, 0.5F); // Box 26
		turretModel[4].setRotationPoint(24F, -27.5F, -9F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 2, 3, 13, 0F,0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, 0.3F, -0.2F, -3F, 0.3F, -0.2F, -3F, 0F, -0.2F, 0.5F); // Box 27
		turretModel[5].setRotationPoint(27F, -27.5F, -6.5F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 8, 5, 52, 0F,0.02F, 0F, -1F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, -1F, 0.02F, 0F, 0F, 0.02F, 0F, 1F, 0.02F, 0F, 1F, 0.02F, 0F, 0F); // Box 28
		turretModel[6].setRotationPoint(-9F, -27.5F, -26F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 7, 5, 50, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F); // Box 29
		turretModel[7].setRotationPoint(-16F, -27.5F, -25F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 6, 5, 42, 0F,0.01F, 0F, -6F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -6F, 0.01F, 0F, -5F, 0.01F, 0F, 1F, 0.01F, 0F, 1F, 0.01F, 0F, -5F); // Box 30
		turretModel[8].setRotationPoint(-22F, -27.5F, -21F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 4, 5, 30, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F); // Box 31
		turretModel[9].setRotationPoint(-26F, -27.5F, -15F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 2, 5, 18, 0F,0.01F, 0F, -6F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -6F, 0.01F, 0F, -5F, 0.01F, 0F, 1F, 0.01F, 0F, 1F, 0.01F, 0F, -5F); // Box 32
		turretModel[10].setRotationPoint(-28F, -27.5F, -9F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 49, 17, 24, 0F,-0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F); // Box 33
		turretModel[11].setRotationPoint(-34F, -41.5F, -12F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 4, 17, 7, 0F,0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 34
		turretModel[12].setRotationPoint(15F, -41.5F, -12F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 4, 17, 5, 0F,0F, 0F, 0.01F, 0F, -1.5F, 0.01F, -2F, -1.5F, 0.01F, 0F, 0F, 0.01F, 0F, -0.4F, 0.01F, 0F, -0.4F, 0.01F, -1F, -0.4F, 0.01F, 0F, -0.4F, 0.01F); // Box 35
		turretModel[13].setRotationPoint(15F, -41.5F, -5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 4, 17, 5, 0F,0F, 0F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 36
		turretModel[14].setRotationPoint(15F, -41.5F, 0F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 4, 17, 7, 0F,0F, 0F, 0.01F, 0F, -1.5F, 0.01F, 0F, -1.5F, -2.99F, 0F, 0F, 0.01F, 0F, -0.4F, 0.01F, 0F, -0.4F, 0.01F, 0F, -0.4F, -2.99F, 0F, -0.4F, 0.01F); // Box 37
		turretModel[15].setRotationPoint(15F, -41.5F, 5F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 6, 3, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		turretModel[16].setRotationPoint(21F, -30.5F, -7F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 39
		turretModel[17].setRotationPoint(19F, -30.5F, -7F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 40
		turretModel[18].setRotationPoint(23.5F, -38F, -7F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 41
		turretModel[19].setRotationPoint(23.5F, -38F, 5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F); // Box 42
		turretModel[20].setRotationPoint(24F, -37.5F, 6F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 3, 7, 2, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F); // Box 43
		turretModel[21].setRotationPoint(24F, -37.5F, -8F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 4, 7, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44
		turretModel[22].setRotationPoint(24F, -39F, -5.5F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0.5F, -2F, -0.5F, 0.5F, -2F, -0.5F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 45
		turretModel[23].setRotationPoint(24F, -40F, -5.5F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, -0.5F, 0.5F, -2F, -0.5F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 46
		turretModel[24].setRotationPoint(24F, -32F, -5.5F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 2, 7, 11, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 47
		turretModel[25].setRotationPoint(22.01F, -39F, -5.5F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -1.9F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1.9F, -3F, 0F, 0.99F, -3F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.99F, -3F); // Box 48
		turretModel[26].setRotationPoint(22.01F, -40F, -5.5F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, 0.99F, -3F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.99F, -3F, 0F, -1.9F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, -1.9F, -3F); // Box 49
		turretModel[27].setRotationPoint(22.01F, -32F, -5.5F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 6, 17, 24, 0F,-0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, -1.8F, 0F, 0.01F, -0.4F, 0F, 0.01F, -0.4F, 0F, 0.01F, -1.8F, 0F); // Box 50
		turretModel[28].setRotationPoint(-40F, -41.5F, -12F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 8, 3, 24, 0F,-0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, -2F, 0.01F, 0F, 0F, 1.51F, 0F, 0F, 1.51F, 0F, 0F, 0.01F, 0F, 0F); // Box 51
		turretModel[29].setRotationPoint(-40F, -44.5F, -12F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		turretModel[30].setRotationPoint(-37.5F, -47.5F, -2F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		turretModel[31].setRotationPoint(-37.5F, -49.5F, -5F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 4, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		turretModel[32].setRotationPoint(-31.5F, -59.4F, -4F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		turretModel[33].setRotationPoint(-31.5F, -50.4F, -4F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 56
		turretModel[34].setRotationPoint(-33F, -59.9F, -6F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 1F, 0F, 0.01F, -1F, 0F, 0.01F, 1.5F, 0F, 0.01F, -1.5F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 57
		turretModel[35].setRotationPoint(-34F, -59.9F, -10F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 3F, -0.5F, 0F, -3F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 58
		turretModel[36].setRotationPoint(-35F, -59.9F, -14F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,1F, 0.5F, 0.01F, -1F, 0.5F, 0.01F, 1.5F, 0F, 0.01F, -1.5F, 0F, 0.01F, 2F, -0.5F, 0.01F, -2F, -0.5F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F); // Box 59
		turretModel[37].setRotationPoint(-38F, -60.4F, -17F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 1, 10, 6, 0F,0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 1F, 0F, 0.01F, -1F, 0F, 0.01F, -1F, 0F, 0.01F, 1F, 0F, 0.01F); // Box 60
		turretModel[38].setRotationPoint(-33F, -59.9F, 0F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 61
		turretModel[39].setRotationPoint(-34F, -59.9F, 6F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,-1F, 0F, 0.01F, 1F, 0F, 0.01F, -1.5F, 0.5F, 0.01F, 1.5F, 0.5F, 0.01F, 0.5F, 0F, 0.01F, -0.5F, 0F, 0.01F, -3F, -0.5F, 0.01F, 3F, -0.5F, 0.01F); // Box 62
		turretModel[40].setRotationPoint(-35F, -59.9F, 10F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 2F, -0.5F, 0F); // Box 63
		turretModel[41].setRotationPoint(-38F, -60.4F, 14F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 64
		turretModel[42].setRotationPoint(-32.8F, -62.4F, -3F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F); // Box 65
		turretModel[43].setRotationPoint(-44.5F, -61.4F, -1F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, 0.65F, 0F, 0F, -1.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.5F, 0.65F, 0F, 0.5F, -1.35F, 0F, 0F, -0.35F); // Box 66
		turretModel[44].setRotationPoint(-44.5F, -62.2F, -1F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -1.35F, 0F, 0F, 0.65F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0.5F, -1.35F, 0F, 0.5F, 0.65F, 0F, 0F, -0.35F); // Box 67
		turretModel[45].setRotationPoint(-44.5F, -62.2F, 0F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.35F, 0F, -0.7F, -0.85F, 0F, -0.7F, 0.15F, 0F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 1.5F, -0.85F, 0F, 1.5F, 0.15F, 0F, 0.5F, -0.35F); // Box 68
		turretModel[46].setRotationPoint(-45.5F, -50.2F, 0.3F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.35F, 0F, -0.7F, 0.15F, 0F, -0.7F, -0.85F, 0F, 0F, -0.35F, 0F, 0.5F, -0.35F, 0F, 1.5F, 0.15F, 0F, 1.5F, -0.85F, 0F, 0.5F, -0.35F); // Box 69
		turretModel[47].setRotationPoint(-45.5F, -50.2F, -1.3F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0.5F, 1F, 0.5F); // Box 70
		turretModel[48].setRotationPoint(-45F, -52.4F, -0.5F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 5, 3, 13, 0F,0F, 0.01F, 0F, -0.5F, 0.01F, -1F, -0.5F, 0.01F, -1F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, -0.5F, 0.01F, -1F, -0.5F, 0.01F, -1F, 0F, 0.01F, 0F); // Box 71
		turretModel[49].setRotationPoint(27.5F, -37.5F, -6.5F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F,0F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 72
		turretModel[50].setRotationPoint(27.5F, -39.5F, -6.5F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0.01F, -2F, -0.5F, 0.01F, -4F, -0.5F, 0.01F, -4F, 0F, 0.01F, -2F, 0F, 0.01F, 0F, -0.5F, 0.01F, -1.5F, -0.5F, 0.01F, -1.5F, 0F, 0.01F, 0F); // Box 73
		turretModel[51].setRotationPoint(27.5F, -41.5F, -6F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, -2F, -0.5F, -0.99F, -2F, -0.5F, -0.99F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 74
		turretModel[52].setRotationPoint(27.5F, -42.5F, -4F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -0.5F); // Box 75
		turretModel[53].setRotationPoint(27.5F, -34.5F, -6.5F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0.01F, 0F, -0.5F, 0.01F, -1.5F, -0.5F, 0.01F, -1.5F, 0F, 0.01F, 0F, 0F, 0.01F, -2F, -0.5F, 0.01F, -4F, -0.5F, 0.01F, -4F, 0F, 0.01F, -2F); // Box 76
		turretModel[54].setRotationPoint(27.5F, -32.5F, -6F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -0.99F, -2F, -0.5F, -0.99F, -2F, 0F, 0F, -2F); // Box 77
		turretModel[55].setRotationPoint(27.5F, -30.5F, -4F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 17, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 85
		turretModel[56].setRotationPoint(-17F, -38F, -26F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, -0.3F, 0F, -4.5F, -0.3F, 0F, -4.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F); // Box 86
		turretModel[57].setRotationPoint(0.01F, -38F, -26F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -2.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2.5F, -0.3F); // Box 87
		turretModel[58].setRotationPoint(-20.99F, -38F, -26F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88
		turretModel[59].setRotationPoint(-30.99F, -27.8F, -25F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89
		turretModel[60].setRotationPoint(-30.99F, -27.8F, -19.01F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -7.3F, 0F, -0.3F, 6.7F, 0F, -0.3F, 6.7F, 0F, -0.3F, -7.3F, 0F, -0.3F); // Box 90
		turretModel[61].setRotationPoint(-33.99F, -31.8F, -25F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 91
		turretModel[62].setRotationPoint(-26.5F, -26.2F, -25F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.3F, -0.3F, 0.3F, 2.2F, -0.3F, 0.3F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -2.9F, -0.3F, 0.3F, -1.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 92
		turretModel[63].setRotationPoint(-19.49F, -26.2F, -25F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 93
		turretModel[64].setRotationPoint(-16.99F, -29.5F, -25.8F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 94
		turretModel[65].setRotationPoint(-16.2F, -28.5F, -25.8F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F); // Box 95
		turretModel[66].setRotationPoint(-30.99F, -27.8F, 19F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 96
		turretModel[67].setRotationPoint(-30.99F, -27.8F, 11.01F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -7.3F, 0F, -0.3F, 6.7F, 0F, -0.3F, 6.7F, 0F, -0.3F, -7.3F, 0F, -0.3F); // Box 97
		turretModel[68].setRotationPoint(-33.99F, -31.8F, 19F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 98
		turretModel[69].setRotationPoint(-26.5F, -26.2F, 19F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -0.3F, -0.3F, 0.3F, 0.7F, -0.3F, 0.3F, 2.2F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -1.3F, -0.3F, 0.3F, -2.9F, -0.3F, 0F, -0.3F, -0.3F); // Box 99
		turretModel[70].setRotationPoint(-19.49F, -26.2F, 19F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 100
		turretModel[71].setRotationPoint(-16.99F, -29.5F, 24.8F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -5F); // Box 101
		turretModel[72].setRotationPoint(-16.2F, -28.5F, 24.8F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 17, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 102
		turretModel[73].setRotationPoint(-17F, -38F, 25F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, -0.3F, 0F, -4.5F, -0.3F, 0F, -4.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F); // Box 103
		turretModel[74].setRotationPoint(0.01F, -38F, 25F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F,0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -2.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2.5F, -0.3F); // Box 104
		turretModel[75].setRotationPoint(-20.99F, -38F, 25F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		turretModel[76].setRotationPoint(-24F, -40.5F, -12.5F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		turretModel[77].setRotationPoint(-24F, -36.5F, -12.5F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 107
		turretModel[78].setRotationPoint(-24F, -32.5F, -12.5F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		turretModel[79].setRotationPoint(-24F, -40.5F, 11.5F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		turretModel[80].setRotationPoint(-24F, -36.5F, 11.5F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 110
		turretModel[81].setRotationPoint(-24F, -32.5F, 11.5F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		turretModel[82].setRotationPoint(-39F, -35.5F, -13.5F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 5, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		turretModel[83].setRotationPoint(-39F, -35.5F, 11.5F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		turretModel[84].setRotationPoint(-18.5F, -35.5F, 12.5F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		turretModel[85].setRotationPoint(-18.5F, -35.5F, -25.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 115
		barrelModel[1] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 116
		barrelModel[2] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 117
		barrelModel[3] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 118
		barrelModel[4] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 119
		barrelModel[5] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 120
		barrelModel[6] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 121
		barrelModel[7] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 122
		barrelModel[8] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 123
		barrelModel[9] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 124
		barrelModel[10] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 125
		barrelModel[11] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 126
		barrelModel[12] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 127
		barrelModel[13] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 128
		barrelModel[14] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 129
		barrelModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 130
		barrelModel[16] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 131
		barrelModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 132
		barrelModel[18] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 133
		barrelModel[19] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 134
		barrelModel[20] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 135
		barrelModel[21] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 136
		barrelModel[22] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 137
		barrelModel[23] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 138
		barrelModel[24] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 139
		barrelModel[25] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 140
		barrelModel[26] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Box 141
		barrelModel[27] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 142
		barrelModel[28] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 143
		barrelModel[29] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 144
		barrelModel[30] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 145
		barrelModel[31] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 146
		barrelModel[32] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 147
		barrelModel[33] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 148
		barrelModel[34] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 149
		barrelModel[35] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 150
		barrelModel[36] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 187
		barrelModel[37] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 188
		barrelModel[38] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 189
		barrelModel[39] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 190
		barrelModel[40] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 191
		barrelModel[41] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 192
		barrelModel[42] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 193
		barrelModel[43] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 194
		barrelModel[44] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 195
		barrelModel[45] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 196
		barrelModel[46] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 197
		barrelModel[47] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 198
		barrelModel[48] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 199
		barrelModel[49] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 200
		barrelModel[50] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 201
		barrelModel[51] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 202
		barrelModel[52] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 203
		barrelModel[53] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 204
		barrelModel[54] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 205
		barrelModel[55] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 206
		barrelModel[56] = new ModelRendererTurbo(this, 113, 265, textureX, textureY); // Box 207
		barrelModel[57] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 208
		barrelModel[58] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 209
		barrelModel[59] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 210
		barrelModel[60] = new ModelRendererTurbo(this, 113, 273, textureX, textureY); // Box 211
		barrelModel[61] = new ModelRendererTurbo(this, 225, 273, textureX, textureY); // Box 212
		barrelModel[62] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Box 213
		barrelModel[63] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 214
		barrelModel[64] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 215
		barrelModel[65] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 216
		barrelModel[66] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 217
		barrelModel[67] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 218
		barrelModel[68] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 219
		barrelModel[69] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 220
		barrelModel[70] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 221
		barrelModel[71] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 222

		barrelModel[0].addShapeBox(-4F, -4F, 0F, 10, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		barrelModel[0].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[1].addShapeBox(-8F, -4F, 0F, 4, 5, 4, 0F,-0.5F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 116
		barrelModel[1].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[2].addShapeBox(-11F, -2.5F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 117
		barrelModel[2].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[3].addShapeBox(-9.5F, -2F, -8F, 2, 2, 8, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 118
		barrelModel[3].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[4].addShapeBox(-10F, -6.5F, -2F, 1, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 119
		barrelModel[4].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[5].addShapeBox(6F, -3F, 0.5F, 19, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		barrelModel[5].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[6].addShapeBox(6F, -1F, 0.5F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 121
		barrelModel[6].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[7].addShapeBox(6F, -2F, 0.5F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		barrelModel[7].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[8].addShapeBox(25F, -1.6F, 0.9F, 19, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 123
		barrelModel[8].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[9].addShapeBox(25F, -1.6F, 2.3F, 19, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 124
		barrelModel[9].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[10].addShapeBox(44F, -1.6F, 0.9F, 10, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 125
		barrelModel[10].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[11].addShapeBox(44F, -1.6F, 2.3F, 10, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 126
		barrelModel[11].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[12].addShapeBox(25F, -2.9F, 0.9F, 13, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 127
		barrelModel[12].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[13].addShapeBox(38F, -2.9F, 0.9F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -1.35F, -0.35F, 0F, -1.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0.65F, -0.35F, 0F, 0.65F, -0.35F, 0F, -0.35F, -0.35F); // Box 128
		barrelModel[13].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[14].addShapeBox(32.2F, -3.1F, 0.9F, 1, 2, 1, 0F,-0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F); // Box 129
		barrelModel[14].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[15].addShapeBox(32.2F, -3.1F, 2.3F, 1, 2, 1, 0F,-0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F); // Box 130
		barrelModel[15].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[16].addShapeBox(25F, -2.9F, 2.3F, 13, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 131
		barrelModel[16].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[17].addShapeBox(38F, -2.9F, 2.3F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -1.35F, -0.35F, 0F, -1.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0.65F, -0.35F, 0F, 0.65F, -0.35F, 0F, -0.35F, -0.35F); // Box 132
		barrelModel[17].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[18].addShapeBox(-4F, -1F, -4.5F, 49, 1, 3, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 133
		barrelModel[18].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[19].addShapeBox(-4F, -2.17F, -4.5F, 49, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		barrelModel[19].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[20].addShapeBox(-4F, 0.17F, -4.5F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 135
		barrelModel[20].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[21].addShapeBox(-4F, 1.6F, -4.5F, 49, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		barrelModel[21].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[22].addShapeBox(-4F, 2.77F, -4.5F, 49, 1, 3, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 137
		barrelModel[22].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[23].addShapeBox(-4F, 3.94F, -4.5F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		barrelModel[23].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[24].addShapeBox(-4F, 1.6F, -8.1F, 49, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		barrelModel[24].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[25].addShapeBox(-4F, 2.77F, -8.1F, 49, 1, 3, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 140
		barrelModel[25].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[26].addShapeBox(-4F, 3.94F, -8.1F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 141
		barrelModel[26].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[27].addShapeBox(-4F, -2.17F, -8.1F, 49, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		barrelModel[27].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[28].addShapeBox(-4F, -1F, -8.1F, 49, 1, 3, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 143
		barrelModel[28].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[29].addShapeBox(-4F, 0.17F, -8.1F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 144
		barrelModel[29].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[30].addShapeBox(-8F, -3F, -8.6F, 31, 1, 4, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 145
		barrelModel[30].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[31].addShapeBox(-8F, -3F, -5F, 31, 1, 4, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 146
		barrelModel[31].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[32].addShapeBox(-8.3F, -2.5F, -8.6F, 1, 6, 1, 0F,-0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F); // Box 147
		barrelModel[32].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[33].addShapeBox(-8.3F, -2.5F, -5.6F, 1, 6, 1, 0F,-0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F); // Box 148
		barrelModel[33].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[34].addShapeBox(-8.3F, -2.5F, -2F, 1, 6, 1, 0F,-0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F); // Box 149
		barrelModel[34].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[35].addShapeBox(-8.3F, -2.5F, -5F, 1, 6, 1, 0F,-0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F); // Box 150
		barrelModel[35].setRotationPoint(-18F, -35F, -16.5F);

		barrelModel[36].addShapeBox(-4F, -4F, 0F, 10, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		barrelModel[36].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[37].addShapeBox(-8F, -4F, 0F, 4, 5, 4, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -1.5F); // Box 188
		barrelModel[37].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[38].addShapeBox(-11F, -2.5F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		barrelModel[38].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[39].addShapeBox(-9.5F, -2F, -8F, 2, 2, 8, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 190
		barrelModel[39].setRotationPoint(-18F, -35F, 24.5F);

		barrelModel[40].addShapeBox(-10F, -6.5F, -2F, 1, 4, 4, 0F,0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 191
		barrelModel[40].setRotationPoint(-18F, -35F, 16.5F);

		barrelModel[41].addShapeBox(6F, -3F, 0.5F, 19, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		barrelModel[41].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[42].addShapeBox(6F, -1F, 0.5F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 193
		barrelModel[42].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[43].addShapeBox(6F, -2F, 0.5F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		barrelModel[43].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[44].addShapeBox(25F, -1.6F, 0.9F, 19, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 195
		barrelModel[44].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[45].addShapeBox(25F, -1.6F, 2.3F, 19, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 196
		barrelModel[45].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[46].addShapeBox(44F, -1.6F, 0.9F, 10, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 197
		barrelModel[46].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[47].addShapeBox(44F, -1.6F, 2.3F, 10, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 198
		barrelModel[47].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[48].addShapeBox(25F, -2.9F, 0.9F, 13, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 199
		barrelModel[48].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[49].addShapeBox(38F, -2.9F, 0.9F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -1.35F, -0.35F, 0F, -1.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0.65F, -0.35F, 0F, 0.65F, -0.35F, 0F, -0.35F, -0.35F); // Box 200
		barrelModel[49].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[50].addShapeBox(32.2F, -3.1F, 0.9F, 1, 2, 1, 0F,-0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F); // Box 201
		barrelModel[50].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[51].addShapeBox(32.2F, -3.1F, 2.3F, 1, 2, 1, 0F,-0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F, -0.18F, -0.35F, -0.18F); // Box 202
		barrelModel[51].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[52].addShapeBox(25F, -2.9F, 2.3F, 13, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 203
		barrelModel[52].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[53].addShapeBox(38F, -2.9F, 2.3F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -1.35F, -0.35F, 0F, -1.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0.65F, -0.35F, 0F, 0.65F, -0.35F, 0F, -0.35F, -0.35F); // Box 204
		barrelModel[53].setRotationPoint(-18F, -35F, 12.5F);

		barrelModel[54].addShapeBox(-4F, -1F, -4.5F, 49, 1, 3, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 205
		barrelModel[54].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[55].addShapeBox(-4F, -2.17F, -4.5F, 49, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		barrelModel[55].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[56].addShapeBox(-4F, 0.17F, -4.5F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 207
		barrelModel[56].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[57].addShapeBox(-4F, 1.6F, -4.5F, 49, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		barrelModel[57].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[58].addShapeBox(-4F, 2.77F, -4.5F, 49, 1, 3, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 209
		barrelModel[58].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[59].addShapeBox(-4F, 3.94F, -4.5F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 210
		barrelModel[59].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[60].addShapeBox(-4F, 1.6F, -8.1F, 49, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		barrelModel[60].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[61].addShapeBox(-4F, 2.77F, -8.1F, 49, 1, 3, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 212
		barrelModel[61].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[62].addShapeBox(-4F, 3.94F, -8.1F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 213
		barrelModel[62].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[63].addShapeBox(-4F, -2.17F, -8.1F, 49, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		barrelModel[63].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[64].addShapeBox(-4F, -1F, -8.1F, 49, 1, 3, 0F,0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F, 0F, 0.16F, 0F); // Box 215
		barrelModel[64].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[65].addShapeBox(-4F, 0.17F, -8.1F, 49, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 216
		barrelModel[65].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[66].addShapeBox(-8F, -3F, -8.6F, 31, 1, 4, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 217
		barrelModel[66].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[67].addShapeBox(-8F, -3F, -5F, 31, 1, 4, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 218
		barrelModel[67].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[68].addShapeBox(-8.3F, -2.5F, -8.6F, 1, 6, 1, 0F,-0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F); // Box 219
		barrelModel[68].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[69].addShapeBox(-8.3F, -2.5F, -5.6F, 1, 6, 1, 0F,-0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F); // Box 220
		barrelModel[69].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[70].addShapeBox(-8.3F, -2.5F, -2F, 1, 6, 1, 0F,-0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F); // Box 221
		barrelModel[70].setRotationPoint(-18F, -35F, 26.5F);

		barrelModel[71].addShapeBox(-8.3F, -2.5F, -5F, 1, 6, 1, 0F,-0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, 6.7F, -0.2F, -0.45F, -7.3F, -0.2F, -0.45F); // Box 222
		barrelModel[71].setRotationPoint(-18F, -35F, 26.5F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 229
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 230
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 231
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 232
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 233
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 234
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 235
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 236
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 237
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 238
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 239
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 240
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 241
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 242
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 243
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 244
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 245
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 246
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 247
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 248
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 249
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 250
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 41, 337, textureX, textureY); // Box 251
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 252
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 489, 337, textureX, textureY); // Box 269
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 17, 345, textureX, textureY); // Box 270
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 273, 345, textureX, textureY); // Box 271
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 297, 345, textureX, textureY); // Box 272
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 353, 345, textureX, textureY); // Box 273
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 377, 345, textureX, textureY); // Box 274
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 401, 345, textureX, textureY); // Box 275
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 425, 345, textureX, textureY); // Box 276
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 449, 345, textureX, textureY); // Box 277

		leftTrackWheelModels[0].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		leftTrackWheelModels[0].setRotationPoint(14F, 3F, 21.5F);

		leftTrackWheelModels[1].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 230
		leftTrackWheelModels[1].setRotationPoint(14F, 3F, 21.5F);

		leftTrackWheelModels[2].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		leftTrackWheelModels[2].setRotationPoint(14F, 3F, 21.5F);

		leftTrackWheelModels[3].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftTrackWheelModels[3].setRotationPoint(33F, 3F, 21.5F);

		leftTrackWheelModels[4].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		leftTrackWheelModels[4].setRotationPoint(33F, 3F, 21.5F);

		leftTrackWheelModels[5].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 234
		leftTrackWheelModels[5].setRotationPoint(33F, 3F, 21.5F);

		leftTrackWheelModels[6].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		leftTrackWheelModels[6].setRotationPoint(48F, -3F, 21.5F);

		leftTrackWheelModels[7].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		leftTrackWheelModels[7].setRotationPoint(48F, -3F, 21.5F);

		leftTrackWheelModels[8].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 237
		leftTrackWheelModels[8].setRotationPoint(48F, -3F, 21.5F);

		leftTrackWheelModels[9].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		leftTrackWheelModels[9].setRotationPoint(-4F, 3F, 21.5F);

		leftTrackWheelModels[10].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		leftTrackWheelModels[10].setRotationPoint(-4F, 3F, 21.5F);

		leftTrackWheelModels[11].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 240
		leftTrackWheelModels[11].setRotationPoint(-4F, 3F, 21.5F);

		leftTrackWheelModels[12].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		leftTrackWheelModels[12].setRotationPoint(-23F, 3F, 21.5F);

		leftTrackWheelModels[13].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		leftTrackWheelModels[13].setRotationPoint(-23F, 3F, 21.5F);

		leftTrackWheelModels[14].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 243
		leftTrackWheelModels[14].setRotationPoint(-23F, 3F, 21.5F);

		leftTrackWheelModels[15].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		leftTrackWheelModels[15].setRotationPoint(-41F, 3F, 21.5F);

		leftTrackWheelModels[16].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		leftTrackWheelModels[16].setRotationPoint(-41F, 3F, 21.5F);

		leftTrackWheelModels[17].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 246
		leftTrackWheelModels[17].setRotationPoint(-41F, 3F, 21.5F);

		leftTrackWheelModels[18].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftTrackWheelModels[18].setRotationPoint(-57F, 3F, 21.5F);

		leftTrackWheelModels[19].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftTrackWheelModels[19].setRotationPoint(-57F, 3F, 21.5F);

		leftTrackWheelModels[20].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 249
		leftTrackWheelModels[20].setRotationPoint(-57F, 3F, 21.5F);

		leftTrackWheelModels[21].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftTrackWheelModels[21].setRotationPoint(-70F, -3F, 21.5F);

		leftTrackWheelModels[22].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		leftTrackWheelModels[22].setRotationPoint(-70F, -3F, 21.5F);

		leftTrackWheelModels[23].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 252
		leftTrackWheelModels[23].setRotationPoint(-70F, -3F, 21.5F);

		leftTrackWheelModels[24].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		leftTrackWheelModels[24].setRotationPoint(21.5F, -7.5F, 18.5F);

		leftTrackWheelModels[25].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 270
		leftTrackWheelModels[25].setRotationPoint(21.5F, -7.5F, 18.5F);

		leftTrackWheelModels[26].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftTrackWheelModels[26].setRotationPoint(21.5F, -7.5F, 18.5F);

		leftTrackWheelModels[27].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		leftTrackWheelModels[27].setRotationPoint(-14.5F, -7.5F, 18.5F);

		leftTrackWheelModels[28].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		leftTrackWheelModels[28].setRotationPoint(-14.5F, -7.5F, 18.5F);

		leftTrackWheelModels[29].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 274
		leftTrackWheelModels[29].setRotationPoint(-14.5F, -7.5F, 18.5F);

		leftTrackWheelModels[30].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		leftTrackWheelModels[30].setRotationPoint(-49.5F, -7.5F, 18.5F);

		leftTrackWheelModels[31].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		leftTrackWheelModels[31].setRotationPoint(-49.5F, -7.5F, 18.5F);

		leftTrackWheelModels[32].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 277
		leftTrackWheelModels[32].setRotationPoint(-49.5F, -7.5F, 18.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 278
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 279
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 280
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 281
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 282
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 283
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 284
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 285
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 286
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 287
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 288
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 289
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 290
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 291
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 292
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 293
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 294
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 295
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 296
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 297
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 298
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 299
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 300
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 301
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 302
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 489, 369, textureX, textureY); // Box 303
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 281, 377, textureX, textureY); // Box 304
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 193, 385, textureX, textureY); // Box 305
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 217, 385, textureX, textureY); // Box 306
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 297, 385, textureX, textureY); // Box 307
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 308
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 433, 385, textureX, textureY); // Box 309
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 457, 385, textureX, textureY); // Box 310

		rightTrackWheelModels[0].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		rightTrackWheelModels[0].setRotationPoint(14F, 3F, -29.5F);

		rightTrackWheelModels[1].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 279
		rightTrackWheelModels[1].setRotationPoint(14F, 3F, -29.5F);

		rightTrackWheelModels[2].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightTrackWheelModels[2].setRotationPoint(14F, 3F, -29.5F);

		rightTrackWheelModels[3].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightTrackWheelModels[3].setRotationPoint(33F, 3F, -29.5F);

		rightTrackWheelModels[4].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		rightTrackWheelModels[4].setRotationPoint(33F, 3F, -29.5F);

		rightTrackWheelModels[5].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 283
		rightTrackWheelModels[5].setRotationPoint(33F, 3F, -29.5F);

		rightTrackWheelModels[6].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightTrackWheelModels[6].setRotationPoint(48F, -3F, -29.5F);

		rightTrackWheelModels[7].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightTrackWheelModels[7].setRotationPoint(48F, -3F, -29.5F);

		rightTrackWheelModels[8].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 286
		rightTrackWheelModels[8].setRotationPoint(48F, -3F, -29.5F);

		rightTrackWheelModels[9].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		rightTrackWheelModels[9].setRotationPoint(-4F, 3F, -29.5F);

		rightTrackWheelModels[10].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		rightTrackWheelModels[10].setRotationPoint(-4F, 3F, -29.5F);

		rightTrackWheelModels[11].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 289
		rightTrackWheelModels[11].setRotationPoint(-4F, 3F, -29.5F);

		rightTrackWheelModels[12].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightTrackWheelModels[12].setRotationPoint(-23F, 3F, -29.5F);

		rightTrackWheelModels[13].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		rightTrackWheelModels[13].setRotationPoint(-23F, 3F, -29.5F);

		rightTrackWheelModels[14].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 292
		rightTrackWheelModels[14].setRotationPoint(-23F, 3F, -29.5F);

		rightTrackWheelModels[15].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		rightTrackWheelModels[15].setRotationPoint(-41F, 3F, -29.5F);

		rightTrackWheelModels[16].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		rightTrackWheelModels[16].setRotationPoint(-41F, 3F, -29.5F);

		rightTrackWheelModels[17].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 295
		rightTrackWheelModels[17].setRotationPoint(-41F, 3F, -29.5F);

		rightTrackWheelModels[18].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightTrackWheelModels[18].setRotationPoint(-57F, 3F, -29.5F);

		rightTrackWheelModels[19].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightTrackWheelModels[19].setRotationPoint(-57F, 3F, -29.5F);

		rightTrackWheelModels[20].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 298
		rightTrackWheelModels[20].setRotationPoint(-57F, 3F, -29.5F);

		rightTrackWheelModels[21].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		rightTrackWheelModels[21].setRotationPoint(-70F, -3F, -29.5F);

		rightTrackWheelModels[22].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		rightTrackWheelModels[22].setRotationPoint(-70F, -3F, -29.5F);

		rightTrackWheelModels[23].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 301
		rightTrackWheelModels[23].setRotationPoint(-70F, -3F, -29.5F);

		rightTrackWheelModels[24].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		rightTrackWheelModels[24].setRotationPoint(21.5F, -7.5F, -25.5F);

		rightTrackWheelModels[25].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 303
		rightTrackWheelModels[25].setRotationPoint(21.5F, -7.5F, -25.5F);

		rightTrackWheelModels[26].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		rightTrackWheelModels[26].setRotationPoint(21.5F, -7.5F, -25.5F);

		rightTrackWheelModels[27].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightTrackWheelModels[27].setRotationPoint(-14.5F, -7.5F, -25.5F);

		rightTrackWheelModels[28].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightTrackWheelModels[28].setRotationPoint(-14.5F, -7.5F, -25.5F);

		rightTrackWheelModels[29].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 307
		rightTrackWheelModels[29].setRotationPoint(-14.5F, -7.5F, -25.5F);

		rightTrackWheelModels[30].addShapeBox(-1.5F, -1.5F, 0F, 3, 1, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		rightTrackWheelModels[30].setRotationPoint(-49.5F, -7.5F, -25.5F);

		rightTrackWheelModels[31].addShapeBox(-1.5F, -0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		rightTrackWheelModels[31].setRotationPoint(-49.5F, -7.5F, -25.5F);

		rightTrackWheelModels[32].addShapeBox(-1.5F, 0.5F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 310
		rightTrackWheelModels[32].setRotationPoint(-49.5F, -7.5F, -25.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 73, 425, textureX, textureY); // Box 321
		leftTrackModel[1] = new ModelRendererTurbo(this, 465, 417, textureX, textureY); // Box 322
		leftTrackModel[2] = new ModelRendererTurbo(this, 489, 409, textureX, textureY); // Box 323
		leftTrackModel[3] = new ModelRendererTurbo(this, 345, 425, textureX, textureY); // Box 324
		leftTrackModel[4] = new ModelRendererTurbo(this, 377, 425, textureX, textureY); // Box 325
		leftTrackModel[5] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Box 326
		leftTrackModel[6] = new ModelRendererTurbo(this, 433, 425, textureX, textureY); // Box 327
		leftTrackModel[7] = new ModelRendererTurbo(this, 489, 425, textureX, textureY); // Box 328
		leftTrackModel[8] = new ModelRendererTurbo(this, 457, 433, textureX, textureY); // Box 329
		leftTrackModel[9] = new ModelRendererTurbo(this, 217, 441, textureX, textureY); // Box 330

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 124, 1, 10, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F); // Box 321
		leftTrackModel[0].setRotationPoint(-73F, -10F, 20.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F); // Box 322
		leftTrackModel[1].setRotationPoint(51F, -10F, 20.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, -0.01F, 0F, 0F, 0.99F, 0F, 0F, 0.99F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.99F, 0F, 0F, 0.99F, 0F, 0F, -0.01F, 0F); // Box 323
		leftTrackModel[2].setRotationPoint(54F, -5F, 20.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F); // Box 324
		leftTrackModel[3].setRotationPoint(50F, -1F, 20.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 0F, 0F, -0.01F, 6F, 0F, -0.01F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.01F, -6F, 0F, 1.01F, -6F, 0F, 0F, 0F, 0F); // Box 325
		leftTrackModel[4].setRotationPoint(35F, 9F, 20.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 94, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		leftTrackModel[5].setRotationPoint(-59F, 9F, 20.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F); // Box 327
		leftTrackModel[6].setRotationPoint(-77F, -10F, 20.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0.99F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.99F, 0F, 0F, 0.99F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.99F, 0F); // Box 328
		leftTrackModel[7].setRotationPoint(-77F, -5F, 20.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F); // Box 329
		leftTrackModel[8].setRotationPoint(-76F, -1F, 20.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,-0.01F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 6F, 0F, 1.01F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.01F, -6F, 0F); // Box 330
		leftTrackModel[9].setRotationPoint(-72F, 9F, 20.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 311
		rightTrackModel[1] = new ModelRendererTurbo(this, 473, 385, textureX, textureY); // Box 312
		rightTrackModel[2] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 313
		rightTrackModel[3] = new ModelRendererTurbo(this, 337, 393, textureX, textureY); // Box 314
		rightTrackModel[4] = new ModelRendererTurbo(this, 369, 393, textureX, textureY); // Box 315
		rightTrackModel[5] = new ModelRendererTurbo(this, 265, 409, textureX, textureY); // Box 316
		rightTrackModel[6] = new ModelRendererTurbo(this, 465, 401, textureX, textureY); // Box 317
		rightTrackModel[7] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Box 318
		rightTrackModel[8] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Box 319
		rightTrackModel[9] = new ModelRendererTurbo(this, 33, 417, textureX, textureY); // Box 320

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 124, 1, 10, 0F,-0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F, -1.01F, 0F, 0F); // Box 311
		rightTrackModel[0].setRotationPoint(-73F, -10F, -30.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F); // Box 312
		rightTrackModel[1].setRotationPoint(51F, -10F, -30.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, -0.01F, 0F, 0F, 0.99F, 0F, 0F, 0.99F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.99F, 0F, 0F, 0.99F, 0F, 0F, -0.01F, 0F); // Box 313
		rightTrackModel[2].setRotationPoint(54F, -5F, -30.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F); // Box 314
		rightTrackModel[3].setRotationPoint(50F, -1F, -30.5F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 0F, 0F, -0.01F, 6F, 0F, -0.01F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.01F, -6F, 0F, 1.01F, -6F, 0F, 0F, 0F, 0F); // Box 315
		rightTrackModel[4].setRotationPoint(35F, 9F, -30.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 94, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		rightTrackModel[5].setRotationPoint(-59F, 9F, -30.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F); // Box 317
		rightTrackModel[6].setRotationPoint(-77F, -10F, -30.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0.99F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.99F, 0F, 0F, 0.99F, 0F, 0F, -0.01F, 0F, 0F, -0.01F, 0F, 0F, 0.99F, 0F); // Box 318
		rightTrackModel[7].setRotationPoint(-77F, -5F, -30.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 1F, 0F, 0F); // Box 319
		rightTrackModel[8].setRotationPoint(-76F, -1F, -30.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,-0.01F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.01F, 6F, 0F, 1.01F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.01F, -6F, 0F); // Box 320
		rightTrackModel[9].setRotationPoint(-72F, 9F, -30.5F);
	}
}