//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHeavyCataphract extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelHeavyCataphract() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[133];
		leftArmModel = new ModelRendererTurbo[67];
		rightArmModel = new ModelRendererTurbo[67];
		leftLegModel = new ModelRendererTurbo[63];
		rightLegModel = new ModelRendererTurbo[62];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 249
		bodyModel[1] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 289
		bodyModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 290
		bodyModel[3] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 291
		bodyModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 292
		bodyModel[5] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 293
		bodyModel[6] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 294
		bodyModel[7] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 295
		bodyModel[8] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 296
		bodyModel[9] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 298
		bodyModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 309
		bodyModel[11] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 310
		bodyModel[12] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 311
		bodyModel[13] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 312
		bodyModel[14] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 313
		bodyModel[15] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 314
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 315
		bodyModel[17] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 316
		bodyModel[18] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 317
		bodyModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 318
		bodyModel[20] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 319
		bodyModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 320
		bodyModel[22] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 321
		bodyModel[23] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 322
		bodyModel[24] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 323
		bodyModel[25] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 324
		bodyModel[26] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 325
		bodyModel[27] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 326
		bodyModel[28] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 327
		bodyModel[29] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 328
		bodyModel[30] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 329
		bodyModel[31] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 330
		bodyModel[32] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 331
		bodyModel[33] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 332
		bodyModel[34] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 333
		bodyModel[35] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 334
		bodyModel[36] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 335
		bodyModel[37] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 336
		bodyModel[38] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 337
		bodyModel[39] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 338
		bodyModel[40] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 339
		bodyModel[41] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 340
		bodyModel[42] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 341
		bodyModel[43] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 342
		bodyModel[44] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 343
		bodyModel[45] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 344
		bodyModel[46] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 345
		bodyModel[47] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 346
		bodyModel[48] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 347
		bodyModel[49] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 348
		bodyModel[50] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 349
		bodyModel[51] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 350
		bodyModel[52] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 351
		bodyModel[53] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 352
		bodyModel[54] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 353
		bodyModel[55] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 354
		bodyModel[56] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 355
		bodyModel[57] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 356
		bodyModel[58] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 357
		bodyModel[59] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 358
		bodyModel[60] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 359
		bodyModel[61] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 360
		bodyModel[62] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 361
		bodyModel[63] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 362
		bodyModel[64] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 363
		bodyModel[65] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 364
		bodyModel[66] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 365
		bodyModel[67] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 366
		bodyModel[68] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 367
		bodyModel[69] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 368
		bodyModel[70] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 369
		bodyModel[71] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 370
		bodyModel[72] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 371
		bodyModel[73] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 372
		bodyModel[74] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 373
		bodyModel[75] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 374
		bodyModel[76] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 375
		bodyModel[77] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 376
		bodyModel[78] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 377
		bodyModel[79] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 378
		bodyModel[80] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 379
		bodyModel[81] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 380
		bodyModel[82] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 381
		bodyModel[83] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 382
		bodyModel[84] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 383
		bodyModel[85] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 384
		bodyModel[86] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 385
		bodyModel[87] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 386
		bodyModel[88] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 387
		bodyModel[89] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 388
		bodyModel[90] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 389
		bodyModel[91] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 390
		bodyModel[92] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 391
		bodyModel[93] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 392
		bodyModel[94] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 393
		bodyModel[95] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 394
		bodyModel[96] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 395
		bodyModel[97] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 396
		bodyModel[98] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 397
		bodyModel[99] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 398
		bodyModel[100] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 399
		bodyModel[101] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 400
		bodyModel[102] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 401
		bodyModel[103] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 402
		bodyModel[104] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 403
		bodyModel[105] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 404
		bodyModel[106] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 412
		bodyModel[107] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 318
		bodyModel[108] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 248
		bodyModel[109] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 249
		bodyModel[110] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 250
		bodyModel[111] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 251
		bodyModel[112] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 252
		bodyModel[113] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 253
		bodyModel[114] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 254
		bodyModel[115] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 255
		bodyModel[116] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 256
		bodyModel[117] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 257
		bodyModel[118] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 260
		bodyModel[119] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 261
		bodyModel[120] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 262
		bodyModel[121] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 263
		bodyModel[122] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 264
		bodyModel[123] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 265
		bodyModel[124] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 266
		bodyModel[125] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 267
		bodyModel[126] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 268
		bodyModel[127] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 269
		bodyModel[128] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 24
		bodyModel[129] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 403
		bodyModel[130] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 404
		bodyModel[131] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 405
		bodyModel[132] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 406

		bodyModel[0].addShapeBox(-4F, 10.8F, -2F, 8, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.5F, 0.3F, 0.1F, 0.5F, 0.3F, 0.1F, 0.5F, 0.3F, 0.1F, 0.5F); // Box 249
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, 0.5F, -2.1F, 1, 11, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 289
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0.5F, -2.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 290
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(3F, 0.5F, -2.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 291
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, 0.4F, -2.1F, 6, 1, 1, 0F,0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 292
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 3.6F, -2.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 293
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3.5F, 3.6F, -2.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 294
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(3F, 0.5F, 1.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 295
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3F, 0.4F, 1.1F, 6, 1, 1, 0F,0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 296
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 0.5F, 1.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 298
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 309
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3F, 2.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 310
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, 2.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 311
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 312
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1F, 2.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 313
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 314
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-1F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 315
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 316
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 317
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-1F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 318
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-2F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 319
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 320
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 321
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 322
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 323
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 324
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 325
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 326
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 327
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(1F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 328
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(2F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 329
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2F, 2.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 330
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1F, 2.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 331
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0F, 2.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 332
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 333
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 334
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(0F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 335
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(0F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 336
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 337
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(1F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 338
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 339
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(3F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 340
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(3F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 341
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(2F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 342
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(3F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 343
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(2F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 344
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 345
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-2F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 346
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-1F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 347
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-1F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 348
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-2F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 349
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 350
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 351
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-4F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 352
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-4F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 353
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-4F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 354
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 355
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-3F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 356
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-2F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 357
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-1F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 358
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-1F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 359
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-2F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 360
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-2F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 361
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-1F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 362
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(0F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 363
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(0F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 364
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(0F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 365
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(0F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 366
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(0F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 367
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(1F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 368
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(2F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 369
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(2F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 370
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(1F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 371
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(1F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 372
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(2F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 373
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(3F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 374
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(3F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 375
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(3F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 376
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(2F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 377
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(2F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 378
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(1F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 379
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(1F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 380
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-4F, 6.7F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 381
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-4F, 6.7F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 382
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-4F, 6.7F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 383
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-4F, 6.7F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 384
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-4F, 5.5F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 385
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-4F, 5.5F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 386
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-4F, 5.5F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 387
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-4F, 5.5F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 388
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-4F, 4.3F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 389
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-4F, 4.3F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 390
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-4F, 4.3F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 391
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-4F, 4.3F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 392
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(3F, 4.3F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 393
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(3F, 4.3F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 394
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(3F, 4.3F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 395
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(3F, 4.3F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 396
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(3F, 5.5F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 397
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(3F, 5.5F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 398
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(3F, 6.7F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 399
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(3F, 6.7F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 400
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(3F, 6.7F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 401
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(3F, 5.5F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 402
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(3F, 5.5F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 403
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(3F, 6.7F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 404
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-4.2F, 9.3F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 412
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-4F, 4.5F, -2F, 8, 1, 4, 0F,0.5F, -0.5F, 0.6F, 0.5F, -0.5F, 0.6F, 0.5F, -0.5F, 0.6F, 0.5F, -0.5F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F); // Box 318
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-4F, 7.5F, -2F, 8, 1, 4, 0F,0.5F, -0.5F, 0.6F, 0.5F, -0.5F, 0.6F, 0.5F, -0.5F, 0.6F, 0.5F, -0.5F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F); // Box 248
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-4F, 10.5F, -2F, 8, 1, 4, 0F,0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 249
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-4F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 250
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-3F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 251
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-2F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 252
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-1F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 253
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(0F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 254
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(1F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 255
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(2F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 256
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(3F, 8.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 257
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(3F, 8.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 260
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(2F, 8.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 261
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(1F, 8.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 262
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(0F, 8.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 263
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-1F, 8.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 264
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-2F, 8.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 265
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-3F, 8.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 266
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-4F, 8.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 267
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-1F, 9.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 268
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(0F, 9.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 269
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F); // Box 24
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(3F, 7.7F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 403
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(3F, 7.7F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 404
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(-4F, 7.7F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 405
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-4F, 7.7F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 406
		bodyModel[132].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		leftArmModel[1] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 364
		leftArmModel[2] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 365
		leftArmModel[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 366
		leftArmModel[4] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 367
		leftArmModel[5] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 368
		leftArmModel[6] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 369
		leftArmModel[7] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 370
		leftArmModel[8] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 371
		leftArmModel[9] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 372
		leftArmModel[10] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 373
		leftArmModel[11] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 374
		leftArmModel[12] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 375
		leftArmModel[13] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 376
		leftArmModel[14] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 377
		leftArmModel[15] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 378
		leftArmModel[16] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 379
		leftArmModel[17] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 387
		leftArmModel[18] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 388
		leftArmModel[19] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 389
		leftArmModel[20] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 390
		leftArmModel[21] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 391
		leftArmModel[22] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 392
		leftArmModel[23] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 393
		leftArmModel[24] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 394
		leftArmModel[25] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 395
		leftArmModel[26] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 396
		leftArmModel[27] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 397
		leftArmModel[28] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 398
		leftArmModel[29] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 399
		leftArmModel[30] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 400
		leftArmModel[31] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 401
		leftArmModel[32] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 402
		leftArmModel[33] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 403
		leftArmModel[34] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 404
		leftArmModel[35] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 405
		leftArmModel[36] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 406
		leftArmModel[37] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 407
		leftArmModel[38] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 408
		leftArmModel[39] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 409
		leftArmModel[40] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 410
		leftArmModel[41] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 466
		leftArmModel[42] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 467
		leftArmModel[43] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 468
		leftArmModel[44] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 469
		leftArmModel[45] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 470
		leftArmModel[46] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 471
		leftArmModel[47] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 472
		leftArmModel[48] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 473
		leftArmModel[49] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 474
		leftArmModel[50] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 475
		leftArmModel[51] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 476
		leftArmModel[52] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 477
		leftArmModel[53] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 388
		leftArmModel[54] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 389
		leftArmModel[55] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 390
		leftArmModel[56] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 391
		leftArmModel[57] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 392
		leftArmModel[58] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 393
		leftArmModel[59] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 394
		leftArmModel[60] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 395
		leftArmModel[61] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 397
		leftArmModel[62] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 399
		leftArmModel[63] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 411
		leftArmModel[64] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 412
		leftArmModel[65] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 413
		leftArmModel[66] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 414

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 11, 4, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 16
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2.8F, 1.3F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 364
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2.8F, 1.3F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 365
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.6F, -2.2F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 366
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2.6F, -2.2F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 367
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2.7F, -0.7F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 368
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.7F, -0.7F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 369
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2.8F, 1.3F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 370
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2.6F, -2.2F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 371
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(2.7F, -0.7F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 372
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(2.6F, -2.2F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 373
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2.7F, -0.7F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 374
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(2.8F, 1.3F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 375
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(2.8F, 2.8F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 376
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.8F, 2.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 377
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(2.8F, 2.8F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 378
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(2.8F, 2.8F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 379
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(2.2F, 2.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 387
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(1.2F, 2.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 388
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(0.2F, 2.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 389
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(1.2F, 1.3F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 390
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(2.2F, 1.3F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 391
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(0.2F, 1.3F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 392
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(1.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 393
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(2.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 394
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(0.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 395
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(1.2F, -2.2F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 396
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(2.2F, -2.2F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 397
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(0.2F, -2.2F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 398
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(0.2F, 2.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 399
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(0.2F, 1.3F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 400
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(0.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 401
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(0.2F, -2.2F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 402
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);

		leftArmModel[33].addShapeBox(1.2F, -2.2F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 403
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);

		leftArmModel[34].addShapeBox(2.2F, -2.2F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 404
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);

		leftArmModel[35].addShapeBox(2.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 405
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);

		leftArmModel[36].addShapeBox(1.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 406
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);

		leftArmModel[37].addShapeBox(1.2F, 1.3F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 407
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);

		leftArmModel[38].addShapeBox(2.2F, 1.3F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 408
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);

		leftArmModel[39].addShapeBox(2.2F, 2.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 409
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);

		leftArmModel[40].addShapeBox(1.2F, 2.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 410
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);

		leftArmModel[41].addShapeBox(1.5F, -2.4F, 1F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 466
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);

		leftArmModel[42].addShapeBox(1.5F, -2.4F, -2F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 467
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);

		leftArmModel[43].addShapeBox(1.5F, -2.4F, -1F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 468
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);

		leftArmModel[44].addShapeBox(1.5F, -2.4F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 469
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);

		leftArmModel[45].addShapeBox(0.5F, -2.4F, -2F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 470
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);

		leftArmModel[46].addShapeBox(0.5F, -2.4F, -1F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 471
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);

		leftArmModel[47].addShapeBox(0.5F, -2.4F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 472
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);

		leftArmModel[48].addShapeBox(0.5F, -2.4F, 1F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 473
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);

		leftArmModel[49].addShapeBox(-0.5F, -2.4F, 1F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 474
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);

		leftArmModel[50].addShapeBox(-0.5F, -2.4F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 475
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);

		leftArmModel[51].addShapeBox(-0.5F, -2.4F, -1F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 476
		leftArmModel[51].setRotationPoint(0F, 0F, 0F);

		leftArmModel[52].addShapeBox(-0.5F, -2.4F, -2F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 477
		leftArmModel[52].setRotationPoint(0F, 0F, 0F);

		leftArmModel[53].addShapeBox(-0.8F, -2.2F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 388
		leftArmModel[53].setRotationPoint(0F, 0F, 0F);

		leftArmModel[54].addShapeBox(-0.8F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 389
		leftArmModel[54].setRotationPoint(0F, 0F, 0F);

		leftArmModel[55].addShapeBox(-0.8F, 1.3F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 390
		leftArmModel[55].setRotationPoint(0F, 0F, 0F);

		leftArmModel[56].addShapeBox(-0.8F, 2.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 391
		leftArmModel[56].setRotationPoint(0F, 0F, 0F);

		leftArmModel[57].addShapeBox(-0.8F, -2.2F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 392
		leftArmModel[57].setRotationPoint(0F, 0F, 0F);

		leftArmModel[58].addShapeBox(-0.8F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 393
		leftArmModel[58].setRotationPoint(0F, 0F, 0F);

		leftArmModel[59].addShapeBox(-0.8F, 1.3F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 394
		leftArmModel[59].setRotationPoint(0F, 0F, 0F);

		leftArmModel[60].addShapeBox(-0.8F, 2.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 395
		leftArmModel[60].setRotationPoint(0F, 0F, 0F);

		leftArmModel[61].addShapeBox(-0.8F, 0.8F, -2F, 4, 1, 4, 0F,0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F); // Box 397
		leftArmModel[61].setRotationPoint(0F, 0F, 0F);

		leftArmModel[62].addShapeBox(-0.8F, 4.2F, -2F, 4, 1, 4, 0F,0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F); // Box 399
		leftArmModel[62].setRotationPoint(0F, 0F, 0F);

		leftArmModel[63].addShapeBox(-1.5F, -2.4F, -2F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 411
		leftArmModel[63].setRotationPoint(0F, 0F, 0F);

		leftArmModel[64].addShapeBox(-1.5F, -2.4F, -1F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 412
		leftArmModel[64].setRotationPoint(0F, 0F, 0F);

		leftArmModel[65].addShapeBox(-1.5F, -2.4F, 0F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 413
		leftArmModel[65].setRotationPoint(0F, 0F, 0F);

		leftArmModel[66].addShapeBox(-1.5F, -2.4F, 1F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.5F, 0.3F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 414
		leftArmModel[66].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box20
		rightArmModel[1] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 411
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 412
		rightArmModel[3] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 413
		rightArmModel[4] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 414
		rightArmModel[5] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 415
		rightArmModel[6] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 416
		rightArmModel[7] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 417
		rightArmModel[8] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 418
		rightArmModel[9] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 419
		rightArmModel[10] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 420
		rightArmModel[11] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 421
		rightArmModel[12] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 422
		rightArmModel[13] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 423
		rightArmModel[14] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 424
		rightArmModel[15] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 425
		rightArmModel[16] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 426
		rightArmModel[17] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 427
		rightArmModel[18] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 428
		rightArmModel[19] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 429
		rightArmModel[20] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 430
		rightArmModel[21] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 431
		rightArmModel[22] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 432
		rightArmModel[23] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 433
		rightArmModel[24] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 434
		rightArmModel[25] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 435
		rightArmModel[26] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 436
		rightArmModel[27] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 437
		rightArmModel[28] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 438
		rightArmModel[29] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 439
		rightArmModel[30] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 440
		rightArmModel[31] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 441
		rightArmModel[32] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 442
		rightArmModel[33] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 443
		rightArmModel[34] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 444
		rightArmModel[35] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 445
		rightArmModel[36] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 446
		rightArmModel[37] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 447
		rightArmModel[38] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 448
		rightArmModel[39] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 449
		rightArmModel[40] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 450
		rightArmModel[41] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 451
		rightArmModel[42] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 455
		rightArmModel[43] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 456
		rightArmModel[44] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 457
		rightArmModel[45] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 458
		rightArmModel[46] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 459
		rightArmModel[47] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 460
		rightArmModel[48] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 461
		rightArmModel[49] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 462
		rightArmModel[50] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 463
		rightArmModel[51] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 464
		rightArmModel[52] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 465
		rightArmModel[53] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 380
		rightArmModel[54] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 381
		rightArmModel[55] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 382
		rightArmModel[56] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 383
		rightArmModel[57] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 384
		rightArmModel[58] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 385
		rightArmModel[59] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 386
		rightArmModel[60] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 387
		rightArmModel[61] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 396
		rightArmModel[62] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 398
		rightArmModel[63] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 407
		rightArmModel[64] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 408
		rightArmModel[65] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 409
		rightArmModel[66] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 410

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 11, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import Box20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.2F, 2.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 411
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.2F, -2.2F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 412
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 413
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.2F, 1.3F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 414
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-2.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 415
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-2.2F, 1.3F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 416
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-2.2F, 2.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 417
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-1.2F, 2.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 418
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-1.2F, 1.3F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 419
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-1.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 420
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-1.2F, -2.2F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 421
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-2.2F, -2.2F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 422
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.6F, -2.2F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 423
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.6F, -2.2F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 424
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3.6F, -2.2F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 425
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3.6F, -2.2F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 426
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3.5F, -0.7F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 427
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-3.5F, -0.7F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 428
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-3.5F, -0.7F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 429
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-3.5F, -0.7F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 430
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-3.4F, 1.3F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 431
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-3.4F, 1.3F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 432
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-3.4F, 1.3F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 433
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(-3.4F, 1.3F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 434
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(-3.4F, 2.8F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 435
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(-3.4F, 2.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 436
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);

		rightArmModel[27].addShapeBox(-3.4F, 2.8F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 437
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(-3.4F, 2.8F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 438
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(-3.2F, 2.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 439
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);

		rightArmModel[30].addShapeBox(-3.2F, -2.2F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 440
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);

		rightArmModel[31].addShapeBox(-3.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 441
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);

		rightArmModel[32].addShapeBox(-3.2F, 1.3F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 442
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);

		rightArmModel[33].addShapeBox(-2.2F, 1.3F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 443
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);

		rightArmModel[34].addShapeBox(-2.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 444
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);

		rightArmModel[35].addShapeBox(-2.2F, -2.2F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 445
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);

		rightArmModel[36].addShapeBox(-1.2F, -2.2F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 446
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);

		rightArmModel[37].addShapeBox(-1.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 447
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);

		rightArmModel[38].addShapeBox(-1.2F, 1.3F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 448
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);

		rightArmModel[39].addShapeBox(-1.2F, 2.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 449
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);

		rightArmModel[40].addShapeBox(-2.2F, 2.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 450
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);

		rightArmModel[41].addShapeBox(-3.5F, -2.4F, -2F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 451
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);

		rightArmModel[42].addShapeBox(-3.5F, -2.4F, -1F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 455
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);

		rightArmModel[43].addShapeBox(-3.5F, -2.4F, 0F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 456
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);

		rightArmModel[44].addShapeBox(-3.5F, -2.4F, 1F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 457
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);

		rightArmModel[45].addShapeBox(-2.5F, -2.4F, 1F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 458
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);

		rightArmModel[46].addShapeBox(-2.5F, -2.4F, -2F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 459
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);

		rightArmModel[47].addShapeBox(-2.5F, -2.4F, -1F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 460
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);

		rightArmModel[48].addShapeBox(-2.5F, -2.4F, 0F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 461
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);

		rightArmModel[49].addShapeBox(-1.5F, -2.4F, 1F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 462
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);

		rightArmModel[50].addShapeBox(-1.5F, -2.4F, -2F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 463
		rightArmModel[50].setRotationPoint(0F, 0F, 0F);

		rightArmModel[51].addShapeBox(-1.5F, -2.4F, -1F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 464
		rightArmModel[51].setRotationPoint(0F, 0F, 0F);

		rightArmModel[52].addShapeBox(-1.5F, -2.4F, 0F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 465
		rightArmModel[52].setRotationPoint(0F, 0F, 0F);

		rightArmModel[53].addShapeBox(-0.2F, -2.2F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 380
		rightArmModel[53].setRotationPoint(0F, 0F, 0F);

		rightArmModel[54].addShapeBox(-0.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 381
		rightArmModel[54].setRotationPoint(0F, 0F, 0F);

		rightArmModel[55].addShapeBox(-0.2F, 1.3F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 382
		rightArmModel[55].setRotationPoint(0F, 0F, 0F);

		rightArmModel[56].addShapeBox(-0.2F, 2.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 383
		rightArmModel[56].setRotationPoint(0F, 0F, 0F);

		rightArmModel[57].addShapeBox(-0.2F, -2.2F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 384
		rightArmModel[57].setRotationPoint(0F, 0F, 0F);

		rightArmModel[58].addShapeBox(-0.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 385
		rightArmModel[58].setRotationPoint(0F, 0F, 0F);

		rightArmModel[59].addShapeBox(-0.2F, 1.3F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 386
		rightArmModel[59].setRotationPoint(0F, 0F, 0F);

		rightArmModel[60].addShapeBox(-0.2F, 2.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 387
		rightArmModel[60].setRotationPoint(0F, 0F, 0F);

		rightArmModel[61].addShapeBox(-3.2F, 0.8F, -2F, 4, 1, 4, 0F,0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F); // Box 396
		rightArmModel[61].setRotationPoint(0F, 0F, 0F);

		rightArmModel[62].addShapeBox(-3.2F, 4.2F, -2F, 4, 1, 4, 0F,0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F); // Box 398
		rightArmModel[62].setRotationPoint(0F, 0F, 0F);

		rightArmModel[63].addShapeBox(-0.5F, -2.4F, 1F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 407
		rightArmModel[63].setRotationPoint(0F, 0F, 0F);

		rightArmModel[64].addShapeBox(-0.5F, -2.4F, 0F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 408
		rightArmModel[64].setRotationPoint(0F, 0F, 0F);

		rightArmModel[65].addShapeBox(-0.5F, -2.4F, -1F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 409
		rightArmModel[65].setRotationPoint(0F, 0F, 0F);

		rightArmModel[66].addShapeBox(-0.5F, -2.4F, -2F, 2, 1, 1, 0F,0.3F, 0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.1F, 0.1F, 0.5F, 0.3F, 0.1F, -0.1F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F); // Box 410
		rightArmModel[66].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 239
		leftLegModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 240
		leftLegModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 241
		leftLegModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 242
		leftLegModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 267
		leftLegModel[5] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 300
		leftLegModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 302
		leftLegModel[7] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 303
		leftLegModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 306
		leftLegModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 308
		leftLegModel[10] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 487
		leftLegModel[11] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 488
		leftLegModel[12] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 493
		leftLegModel[13] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 494
		leftLegModel[14] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 495
		leftLegModel[15] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 496
		leftLegModel[16] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 501
		leftLegModel[17] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 502
		leftLegModel[18] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 503
		leftLegModel[19] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 505
		leftLegModel[20] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 515
		leftLegModel[21] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 516
		leftLegModel[22] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 517
		leftLegModel[23] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 518
		leftLegModel[24] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 519
		leftLegModel[25] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 520
		leftLegModel[26] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 521
		leftLegModel[27] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 522
		leftLegModel[28] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 523
		leftLegModel[29] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 524
		leftLegModel[30] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 525
		leftLegModel[31] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 526
		leftLegModel[32] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 527
		leftLegModel[33] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 528
		leftLegModel[34] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 529
		leftLegModel[35] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 530
		leftLegModel[36] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 531
		leftLegModel[37] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 532
		leftLegModel[38] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 541
		leftLegModel[39] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 542
		leftLegModel[40] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 543
		leftLegModel[41] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 546
		leftLegModel[42] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 547
		leftLegModel[43] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 548
		leftLegModel[44] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 549
		leftLegModel[45] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 550
		leftLegModel[46] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 551
		leftLegModel[47] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 554
		leftLegModel[48] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 555
		leftLegModel[49] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 556
		leftLegModel[50] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 557
		leftLegModel[51] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 558
		leftLegModel[52] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 559
		leftLegModel[53] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 243
		leftLegModel[54] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 244
		leftLegModel[55] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 245
		leftLegModel[56] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 246
		leftLegModel[57] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 247
		leftLegModel[58] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 258
		leftLegModel[59] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 271
		leftLegModel[60] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 286
		leftLegModel[61] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 275
		leftLegModel[62] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 401

		leftLegModel[0].addShapeBox(-2F, 5.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 239
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 240
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 241
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 8.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 242
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 4.7F, -2F, 4, 7, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F); // Box 267
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.3F, -0.800000000000001F, -2.1F, 1, 6, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 300
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-0.8F, 4.2F, -3.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.3F, -0.800000000000001F, 3.1F, 1, 6, 1, 0F,-0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F); // Box 303
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-0.8F, 4.2F, 2.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(2.3F, 4.2F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(1.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 487
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(0.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 488
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(0.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 493
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(1.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 494
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(1.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 495
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);

		leftLegModel[15].addShapeBox(0.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 496
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);

		leftLegModel[16].addShapeBox(0.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 501
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);

		leftLegModel[17].addShapeBox(1.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 502
		leftLegModel[17].setRotationPoint(0F, 0F, 0F);

		leftLegModel[18].addShapeBox(1.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 503
		leftLegModel[18].setRotationPoint(0F, 0F, 0F);

		leftLegModel[19].addShapeBox(0.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 505
		leftLegModel[19].setRotationPoint(0F, 0F, 0F);

		leftLegModel[20].addShapeBox(1.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 515
		leftLegModel[20].setRotationPoint(0F, 0F, 0F);

		leftLegModel[21].addShapeBox(1.2F, -2.7F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 516
		leftLegModel[21].setRotationPoint(0F, 0F, 0F);

		leftLegModel[22].addShapeBox(1.2F, -2.7F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 517
		leftLegModel[22].setRotationPoint(0F, 0F, 0F);

		leftLegModel[23].addShapeBox(1.2F, -2.7F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 518
		leftLegModel[23].setRotationPoint(0F, 0F, 0F);

		leftLegModel[24].addShapeBox(1.3F, -1.2F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 519
		leftLegModel[24].setRotationPoint(0F, 0F, 0F);

		leftLegModel[25].addShapeBox(1.3F, -1.2F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 520
		leftLegModel[25].setRotationPoint(0F, 0F, 0F);

		leftLegModel[26].addShapeBox(1.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 521
		leftLegModel[26].setRotationPoint(0F, 0F, 0F);

		leftLegModel[27].addShapeBox(1.5F, 0.300000000000001F, -1.7F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 522
		leftLegModel[27].setRotationPoint(0F, 0F, 0F);

		leftLegModel[28].addShapeBox(1.5F, 0.300000000000001F, -0.7F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 523
		leftLegModel[28].setRotationPoint(0F, 0F, 0F);

		leftLegModel[29].addShapeBox(1.5F, 0.300000000000001F, 0.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 524
		leftLegModel[29].setRotationPoint(0F, 0F, 0F);

		leftLegModel[30].addShapeBox(1.6F, 1.8F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 525
		leftLegModel[30].setRotationPoint(0F, 0F, 0F);

		leftLegModel[31].addShapeBox(1.6F, 1.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 526
		leftLegModel[31].setRotationPoint(0F, 0F, 0F);

		leftLegModel[32].addShapeBox(1.6F, 1.8F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 527
		leftLegModel[32].setRotationPoint(0F, 0F, 0F);

		leftLegModel[33].addShapeBox(1.6F, 1.8F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 528
		leftLegModel[33].setRotationPoint(0F, 0F, 0F);

		leftLegModel[34].addShapeBox(1.8F, 2.8F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 529
		leftLegModel[34].setRotationPoint(0F, 0F, 0F);

		leftLegModel[35].addShapeBox(1.8F, 2.8F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 530
		leftLegModel[35].setRotationPoint(0F, 0F, 0F);

		leftLegModel[36].addShapeBox(1.8F, 2.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 531
		leftLegModel[36].setRotationPoint(0F, 0F, 0F);

		leftLegModel[37].addShapeBox(1.8F, 2.8F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 532
		leftLegModel[37].setRotationPoint(0F, 0F, 0F);

		leftLegModel[38].addShapeBox(1.2F, -2.7F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 541
		leftLegModel[38].setRotationPoint(0F, 0F, 0F);

		leftLegModel[39].addShapeBox(0.2F, -2.7F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 542
		leftLegModel[39].setRotationPoint(0F, 0F, 0F);

		leftLegModel[40].addShapeBox(-0.8F, -2.7F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 543
		leftLegModel[40].setRotationPoint(0F, 0F, 0F);

		leftLegModel[41].addShapeBox(-0.7F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 546
		leftLegModel[41].setRotationPoint(0F, 0F, 0F);

		leftLegModel[42].addShapeBox(0.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 547
		leftLegModel[42].setRotationPoint(0F, 0F, 0F);

		leftLegModel[43].addShapeBox(1.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 548
		leftLegModel[43].setRotationPoint(0F, 0F, 0F);

		leftLegModel[44].addShapeBox(1.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 549
		leftLegModel[44].setRotationPoint(0F, 0F, 0F);

		leftLegModel[45].addShapeBox(0.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 550
		leftLegModel[45].setRotationPoint(0F, 0F, 0F);

		leftLegModel[46].addShapeBox(-0.6F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 551
		leftLegModel[46].setRotationPoint(0F, 0F, 0F);

		leftLegModel[47].addShapeBox(-0.6F, 1.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 554
		leftLegModel[47].setRotationPoint(0F, 0F, 0F);

		leftLegModel[48].addShapeBox(0.4F, 1.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 555
		leftLegModel[48].setRotationPoint(0F, 0F, 0F);

		leftLegModel[49].addShapeBox(1.4F, 1.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 556
		leftLegModel[49].setRotationPoint(0F, 0F, 0F);

		leftLegModel[50].addShapeBox(1.5F, 2.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 557
		leftLegModel[50].setRotationPoint(0F, 0F, 0F);

		leftLegModel[51].addShapeBox(-0.5F, 2.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 558
		leftLegModel[51].setRotationPoint(0F, 0F, 0F);

		leftLegModel[52].addShapeBox(0.5F, 2.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 559
		leftLegModel[52].setRotationPoint(0F, 0F, 0F);

		leftLegModel[53].addShapeBox(-0.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 243
		leftLegModel[53].setRotationPoint(0F, 0F, 0F);

		leftLegModel[54].addShapeBox(-0.6F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 244
		leftLegModel[54].setRotationPoint(0F, 0F, 0F);

		leftLegModel[55].addShapeBox(-0.6F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 245
		leftLegModel[55].setRotationPoint(0F, 0F, 0F);

		leftLegModel[56].addShapeBox(-0.7F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 246
		leftLegModel[56].setRotationPoint(0F, 0F, 0F);

		leftLegModel[57].addShapeBox(-0.8F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 247
		leftLegModel[57].setRotationPoint(0F, 0F, 0F);

		leftLegModel[58].addShapeBox(-1.8F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 258
		leftLegModel[58].setRotationPoint(0F, 0F, 0F);

		leftLegModel[59].addShapeBox(-2F, 4.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 271
		leftLegModel[59].setRotationPoint(0F, 0F, 0F);

		leftLegModel[60].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 286
		leftLegModel[60].setRotationPoint(0F, 0F, 0F);

		leftLegModel[61].addShapeBox(-2F, 9.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 275
		leftLegModel[61].setRotationPoint(0F, 0F, 0F);

		leftLegModel[62].addShapeBox(-2F, 6.7F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 401
		leftLegModel[62].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 239
		rightLegModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 240
		rightLegModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 241
		rightLegModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 242
		rightLegModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 267
		rightLegModel[5] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 299
		rightLegModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 301
		rightLegModel[7] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 304
		rightLegModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 305
		rightLegModel[9] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 307
		rightLegModel[10] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 407
		rightLegModel[11] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 408
		rightLegModel[12] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 409
		rightLegModel[13] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 410
		rightLegModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 411
		rightLegModel[15] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 413
		rightLegModel[16] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 414
		rightLegModel[17] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 415
		rightLegModel[18] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 419
		rightLegModel[19] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 420
		rightLegModel[20] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 421
		rightLegModel[21] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 422
		rightLegModel[22] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 423
		rightLegModel[23] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 424
		rightLegModel[24] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 425
		rightLegModel[25] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 426
		rightLegModel[26] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 430
		rightLegModel[27] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 431
		rightLegModel[28] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 432
		rightLegModel[29] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 433
		rightLegModel[30] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 434
		rightLegModel[31] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 435
		rightLegModel[32] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 436
		rightLegModel[33] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 437
		rightLegModel[34] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 454
		rightLegModel[35] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 457
		rightLegModel[36] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 458
		rightLegModel[37] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 461
		rightLegModel[38] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 467
		rightLegModel[39] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 468
		rightLegModel[40] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 469
		rightLegModel[41] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 471
		rightLegModel[42] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 472
		rightLegModel[43] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 473
		rightLegModel[44] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 479
		rightLegModel[45] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 480
		rightLegModel[46] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 481
		rightLegModel[47] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 482
		rightLegModel[48] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 483
		rightLegModel[49] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 484
		rightLegModel[50] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 485
		rightLegModel[51] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 486
		rightLegModel[52] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 237
		rightLegModel[53] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 238
		rightLegModel[54] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 239
		rightLegModel[55] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 240
		rightLegModel[56] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 241
		rightLegModel[57] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 259
		rightLegModel[58] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 270
		rightLegModel[59] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 25
		rightLegModel[60] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 274
		rightLegModel[61] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 402

		rightLegModel[0].addShapeBox(-2F, 5.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 239
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 240
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 241
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 8.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 242
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 6.7F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 267
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(0.3F, -0.800000000000001F, -2.1F, 1, 6, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 299
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3.2F, 4.2F, -3.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(0.3F, -0.800000000000001F, 3.1F, 1, 6, 1, 0F,-0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F); // Box 304
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-3.2F, 4.2F, 2.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-3.3F, 4.2F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-1.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 407
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 408
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-2.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 409
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-2.2F, -2.7F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 410
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-2.2F, -2.7F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 411
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);

		rightLegModel[15].addShapeBox(-2.2F, -2.7F, 1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 413
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);

		rightLegModel[16].addShapeBox(-1.2F, -2.7F, 1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 414
		rightLegModel[16].setRotationPoint(0F, 0F, 0F);

		rightLegModel[17].addShapeBox(-0.2F, -2.7F, 1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 415
		rightLegModel[17].setRotationPoint(0F, 0F, 0F);

		rightLegModel[18].addShapeBox(-1.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 419
		rightLegModel[18].setRotationPoint(0F, 0F, 0F);

		rightLegModel[19].addShapeBox(-2.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 420
		rightLegModel[19].setRotationPoint(0F, 0F, 0F);

		rightLegModel[20].addShapeBox(-2.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 421
		rightLegModel[20].setRotationPoint(0F, 0F, 0F);

		rightLegModel[21].addShapeBox(-2.3F, -1.2F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 422
		rightLegModel[21].setRotationPoint(0F, 0F, 0F);

		rightLegModel[22].addShapeBox(-2.3F, -1.2F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 423
		rightLegModel[22].setRotationPoint(0F, 0F, 0F);

		rightLegModel[23].addShapeBox(-2.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 424
		rightLegModel[23].setRotationPoint(0F, 0F, 0F);

		rightLegModel[24].addShapeBox(-1.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 425
		rightLegModel[24].setRotationPoint(0F, 0F, 0F);

		rightLegModel[25].addShapeBox(-0.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 426
		rightLegModel[25].setRotationPoint(0F, 0F, 0F);

		rightLegModel[26].addShapeBox(-1.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 430
		rightLegModel[26].setRotationPoint(0F, 0F, 0F);

		rightLegModel[27].addShapeBox(-2.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 431
		rightLegModel[27].setRotationPoint(0F, 0F, 0F);

		rightLegModel[28].addShapeBox(-2.5F, 0.300000000000001F, -1.7F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 432
		rightLegModel[28].setRotationPoint(0F, 0F, 0F);

		rightLegModel[29].addShapeBox(-2.5F, 0.300000000000001F, -0.7F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 433
		rightLegModel[29].setRotationPoint(0F, 0F, 0F);

		rightLegModel[30].addShapeBox(-2.5F, 0.300000000000001F, 0.5F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 434
		rightLegModel[30].setRotationPoint(0F, 0F, 0F);

		rightLegModel[31].addShapeBox(-2.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 435
		rightLegModel[31].setRotationPoint(0F, 0F, 0F);

		rightLegModel[32].addShapeBox(-1.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 436
		rightLegModel[32].setRotationPoint(0F, 0F, 0F);

		rightLegModel[33].addShapeBox(-0.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 437
		rightLegModel[33].setRotationPoint(0F, 0F, 0F);

		rightLegModel[34].addShapeBox(-2.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 454
		rightLegModel[34].setRotationPoint(0F, 0F, 0F);

		rightLegModel[35].addShapeBox(-1.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 457
		rightLegModel[35].setRotationPoint(0F, 0F, 0F);

		rightLegModel[36].addShapeBox(-2.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 458
		rightLegModel[36].setRotationPoint(0F, 0F, 0F);

		rightLegModel[37].addShapeBox(-1.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 461
		rightLegModel[37].setRotationPoint(0F, 0F, 0F);

		rightLegModel[38].addShapeBox(-2.5F, 2.8F, 1.7F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 467
		rightLegModel[38].setRotationPoint(0F, 0F, 0F);

		rightLegModel[39].addShapeBox(-1.5F, 2.8F, 1.7F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 468
		rightLegModel[39].setRotationPoint(0F, 0F, 0F);

		rightLegModel[40].addShapeBox(-0.5F, 2.8F, 1.7F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 469
		rightLegModel[40].setRotationPoint(0F, 0F, 0F);

		rightLegModel[41].addShapeBox(-2.4F, 1.8F, 1.5F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 471
		rightLegModel[41].setRotationPoint(0F, 0F, 0F);

		rightLegModel[42].addShapeBox(-1.4F, 1.8F, 1.5F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 472
		rightLegModel[42].setRotationPoint(0F, 0F, 0F);

		rightLegModel[43].addShapeBox(-0.4F, 1.8F, 1.5F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 473
		rightLegModel[43].setRotationPoint(0F, 0F, 0F);

		rightLegModel[44].addShapeBox(-2.8F, 2.8F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 479
		rightLegModel[44].setRotationPoint(0F, 0F, 0F);

		rightLegModel[45].addShapeBox(-2.8F, 2.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 480
		rightLegModel[45].setRotationPoint(0F, 0F, 0F);

		rightLegModel[46].addShapeBox(-2.8F, 2.8F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 481
		rightLegModel[46].setRotationPoint(0F, 0F, 0F);

		rightLegModel[47].addShapeBox(-2.8F, 2.8F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 482
		rightLegModel[47].setRotationPoint(0F, 0F, 0F);

		rightLegModel[48].addShapeBox(-2.6F, 1.8F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 483
		rightLegModel[48].setRotationPoint(0F, 0F, 0F);

		rightLegModel[49].addShapeBox(-2.6F, 1.8F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 484
		rightLegModel[49].setRotationPoint(0F, 0F, 0F);

		rightLegModel[50].addShapeBox(-2.6F, 1.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 485
		rightLegModel[50].setRotationPoint(0F, 0F, 0F);

		rightLegModel[51].addShapeBox(-2.6F, 1.8F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 486
		rightLegModel[51].setRotationPoint(0F, 0F, 0F);

		rightLegModel[52].addShapeBox(-0.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 237
		rightLegModel[52].setRotationPoint(0F, 0F, 0F);

		rightLegModel[53].addShapeBox(-0.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 238
		rightLegModel[53].setRotationPoint(0F, 0F, 0F);

		rightLegModel[54].addShapeBox(-0.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 239
		rightLegModel[54].setRotationPoint(0F, 0F, 0F);

		rightLegModel[55].addShapeBox(-0.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 240
		rightLegModel[55].setRotationPoint(0F, 0F, 0F);

		rightLegModel[56].addShapeBox(-0.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 241
		rightLegModel[56].setRotationPoint(0F, 0F, 0F);

		rightLegModel[57].addShapeBox(0.8F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 259
		rightLegModel[57].setRotationPoint(0F, 0F, 0F);

		rightLegModel[58].addShapeBox(-2F, 4.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 270
		rightLegModel[58].setRotationPoint(0F, 0F, 0F);

		rightLegModel[59].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 25
		rightLegModel[59].setRotationPoint(0F, 0F, 0F);

		rightLegModel[60].addShapeBox(-2F, 9.7F, -2F, 4, 1, 3, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 274
		rightLegModel[60].setRotationPoint(0F, 0F, 0F);

		rightLegModel[61].addShapeBox(-2F, 4.7F, -2F, 4, 7, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F); // Box 402
		rightLegModel[61].setRotationPoint(0F, 0F, 0F);
	}
}