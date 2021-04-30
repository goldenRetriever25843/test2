//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.08.2016 - 13:48:00
// Last changed on: 31.08.2016 - 13:48:00

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBTRD extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBTRD() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[380];
		turretModel = new ModelRendererTurbo[123];
		barrelModel = new ModelRendererTurbo[124];
		leftTrackWheelModels = new ModelRendererTurbo[45];
		rightTrackWheelModels = new ModelRendererTurbo[69];
		leftTrackModel = new ModelRendererTurbo[8];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 643
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 645
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 647
		bodyModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 648
		bodyModel[4] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 649
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 653
		bodyModel[6] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 654
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 655
		bodyModel[8] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 656
		bodyModel[9] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 657
		bodyModel[10] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 658
		bodyModel[11] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 659
		bodyModel[12] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 105
		bodyModel[13] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 106
		bodyModel[14] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 108
		bodyModel[15] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 109
		bodyModel[16] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 110
		bodyModel[17] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 111
		bodyModel[18] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 112
		bodyModel[19] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 113
		bodyModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 116
		bodyModel[21] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 117
		bodyModel[22] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 118
		bodyModel[23] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 119
		bodyModel[24] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 120
		bodyModel[25] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 124
		bodyModel[26] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 127
		bodyModel[27] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 128
		bodyModel[28] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 129
		bodyModel[29] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 131
		bodyModel[30] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 134
		bodyModel[31] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 135
		bodyModel[32] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 136
		bodyModel[33] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 137
		bodyModel[34] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 138
		bodyModel[35] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 139
		bodyModel[36] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 140
		bodyModel[37] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 141
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 142
		bodyModel[39] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 143
		bodyModel[40] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 144
		bodyModel[41] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 145
		bodyModel[42] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 146
		bodyModel[43] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 147
		bodyModel[44] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 148
		bodyModel[45] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 149
		bodyModel[46] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 150
		bodyModel[47] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 151
		bodyModel[48] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 152
		bodyModel[49] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 153
		bodyModel[50] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 160
		bodyModel[51] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 161
		bodyModel[52] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 130
		bodyModel[53] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 131
		bodyModel[54] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 132
		bodyModel[55] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 118
		bodyModel[56] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 119
		bodyModel[57] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 120
		bodyModel[58] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 245
		bodyModel[59] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 246
		bodyModel[60] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 247
		bodyModel[61] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 233
		bodyModel[62] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 234
		bodyModel[63] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 235
		bodyModel[64] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 236
		bodyModel[65] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 237
		bodyModel[66] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 238
		bodyModel[67] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 239
		bodyModel[68] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 240
		bodyModel[69] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 241
		bodyModel[70] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 201
		bodyModel[71] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 202
		bodyModel[72] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 203
		bodyModel[73] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 204
		bodyModel[74] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 205
		bodyModel[75] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 206
		bodyModel[76] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 281
		bodyModel[77] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 287
		bodyModel[78] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 288
		bodyModel[79] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 289
		bodyModel[80] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 290
		bodyModel[81] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 212
		bodyModel[82] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 213
		bodyModel[83] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 214
		bodyModel[84] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 215
		bodyModel[85] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 216
		bodyModel[86] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 217
		bodyModel[87] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 218
		bodyModel[88] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 219
		bodyModel[89] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 228
		bodyModel[90] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 229
		bodyModel[91] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 230
		bodyModel[92] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 231
		bodyModel[93] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 232
		bodyModel[94] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 233
		bodyModel[95] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 234
		bodyModel[96] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 235
		bodyModel[97] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 236
		bodyModel[98] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 237
		bodyModel[99] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 238
		bodyModel[100] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 239
		bodyModel[101] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 241
		bodyModel[102] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 242
		bodyModel[103] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 243
		bodyModel[104] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 246
		bodyModel[105] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 247
		bodyModel[106] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 248
		bodyModel[107] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 249
		bodyModel[108] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 250
		bodyModel[109] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 251
		bodyModel[110] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 252
		bodyModel[111] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 253
		bodyModel[112] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 254
		bodyModel[113] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 255
		bodyModel[114] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 256
		bodyModel[115] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 257
		bodyModel[116] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 258
		bodyModel[117] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 259
		bodyModel[118] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 260
		bodyModel[119] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 261
		bodyModel[120] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 262
		bodyModel[121] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 263
		bodyModel[122] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 264
		bodyModel[123] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 265
		bodyModel[124] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 423
		bodyModel[125] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 424
		bodyModel[126] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 425
		bodyModel[127] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 426
		bodyModel[128] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 270
		bodyModel[129] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 271
		bodyModel[130] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 272
		bodyModel[131] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 273
		bodyModel[132] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 274
		bodyModel[133] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 275
		bodyModel[134] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 276
		bodyModel[135] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 277
		bodyModel[136] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 278
		bodyModel[137] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 279
		bodyModel[138] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 280
		bodyModel[139] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 281
		bodyModel[140] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 547
		bodyModel[141] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 548
		bodyModel[142] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 549
		bodyModel[143] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 559
		bodyModel[144] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 560
		bodyModel[145] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 561
		bodyModel[146] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 622
		bodyModel[147] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 398
		bodyModel[148] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 399
		bodyModel[149] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 400
		bodyModel[150] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 401
		bodyModel[151] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 402
		bodyModel[152] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 403
		bodyModel[153] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 404
		bodyModel[154] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 405
		bodyModel[155] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 406
		bodyModel[156] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 407
		bodyModel[157] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 408
		bodyModel[158] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 409
		bodyModel[159] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 410
		bodyModel[160] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 411
		bodyModel[161] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 412
		bodyModel[162] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 413
		bodyModel[163] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 414
		bodyModel[164] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 415
		bodyModel[165] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 416
		bodyModel[166] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 417
		bodyModel[167] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 418
		bodyModel[168] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 419
		bodyModel[169] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 420
		bodyModel[170] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 421
		bodyModel[171] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 422
		bodyModel[172] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 423
		bodyModel[173] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 424
		bodyModel[174] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 425
		bodyModel[175] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 577
		bodyModel[176] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 578
		bodyModel[177] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 579
		bodyModel[178] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 595
		bodyModel[179] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 596
		bodyModel[180] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 597
		bodyModel[181] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 620
		bodyModel[182] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 433
		bodyModel[183] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 434
		bodyModel[184] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 435
		bodyModel[185] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 436
		bodyModel[186] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 437
		bodyModel[187] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 438
		bodyModel[188] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 439
		bodyModel[189] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 440
		bodyModel[190] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 441
		bodyModel[191] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 442
		bodyModel[192] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 443
		bodyModel[193] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 444
		bodyModel[194] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 445
		bodyModel[195] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 446
		bodyModel[196] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 447
		bodyModel[197] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 448
		bodyModel[198] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 449
		bodyModel[199] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 450
		bodyModel[200] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 451
		bodyModel[201] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 452
		bodyModel[202] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 453
		bodyModel[203] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 454
		bodyModel[204] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 455
		bodyModel[205] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 456
		bodyModel[206] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 457
		bodyModel[207] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 458
		bodyModel[208] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 459
		bodyModel[209] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 460
		bodyModel[210] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 461
		bodyModel[211] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 462
		bodyModel[212] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 463
		bodyModel[213] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 464
		bodyModel[214] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 465
		bodyModel[215] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 466
		bodyModel[216] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 467
		bodyModel[217] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 468
		bodyModel[218] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 202
		bodyModel[219] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 447
		bodyModel[220] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 347
		bodyModel[221] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 348
		bodyModel[222] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 349
		bodyModel[223] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 350
		bodyModel[224] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 368
		bodyModel[225] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 369
		bodyModel[226] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 370
		bodyModel[227] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 371
		bodyModel[228] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 372
		bodyModel[229] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 373
		bodyModel[230] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 374
		bodyModel[231] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 375
		bodyModel[232] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 376
		bodyModel[233] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 377
		bodyModel[234] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 378
		bodyModel[235] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 379
		bodyModel[236] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 380
		bodyModel[237] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 381
		bodyModel[238] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 382
		bodyModel[239] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 383
		bodyModel[240] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 384
		bodyModel[241] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 385
		bodyModel[242] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 386
		bodyModel[243] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 387
		bodyModel[244] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 388
		bodyModel[245] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 389
		bodyModel[246] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 390
		bodyModel[247] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 391
		bodyModel[248] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 392
		bodyModel[249] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 393
		bodyModel[250] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 394
		bodyModel[251] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 395
		bodyModel[252] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 396
		bodyModel[253] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 397
		bodyModel[254] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 398
		bodyModel[255] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Box 399
		bodyModel[256] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Box 400
		bodyModel[257] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 401
		bodyModel[258] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 402
		bodyModel[259] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 403
		bodyModel[260] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 404
		bodyModel[261] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 405
		bodyModel[262] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 406
		bodyModel[263] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 407
		bodyModel[264] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 408
		bodyModel[265] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 409
		bodyModel[266] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Box 410
		bodyModel[267] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 411
		bodyModel[268] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 412
		bodyModel[269] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 414
		bodyModel[270] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 415
		bodyModel[271] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 416
		bodyModel[272] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 417
		bodyModel[273] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 418
		bodyModel[274] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 419
		bodyModel[275] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Box 420
		bodyModel[276] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 421
		bodyModel[277] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Box 422
		bodyModel[278] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 423
		bodyModel[279] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 424
		bodyModel[280] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Box 425
		bodyModel[281] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Box 426
		bodyModel[282] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 427
		bodyModel[283] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 428
		bodyModel[284] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 429
		bodyModel[285] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 430
		bodyModel[286] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Box 730
		bodyModel[287] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 731
		bodyModel[288] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Box 732
		bodyModel[289] = new ModelRendererTurbo(this, 457, 273, textureX, textureY); // Box 733
		bodyModel[290] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 1034
		bodyModel[291] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Box 1035
		bodyModel[292] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Box 1037
		bodyModel[293] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 1038
		bodyModel[294] = new ModelRendererTurbo(this, 361, 329, textureX, textureY); // Box 1039
		bodyModel[295] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 1040
		bodyModel[296] = new ModelRendererTurbo(this, 505, 313, textureX, textureY); // Box 1041
		bodyModel[297] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 1042
		bodyModel[298] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 1043
		bodyModel[299] = new ModelRendererTurbo(this, 425, 329, textureX, textureY); // Box 1044
		bodyModel[300] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 1045
		bodyModel[301] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 1046
		bodyModel[302] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 1047
		bodyModel[303] = new ModelRendererTurbo(this, 345, 329, textureX, textureY); // Box 1048
		bodyModel[304] = new ModelRendererTurbo(this, 361, 329, textureX, textureY); // Box 1049
		bodyModel[305] = new ModelRendererTurbo(this, 33, 321, textureX, textureY); // Box 1050
		bodyModel[306] = new ModelRendererTurbo(this, 137, 337, textureX, textureY); // Box 1087
		bodyModel[307] = new ModelRendererTurbo(this, 409, 289, textureX, textureY); // Box 1088
		bodyModel[308] = new ModelRendererTurbo(this, 169, 313, textureX, textureY); // Box 1089
		bodyModel[309] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 1090
		bodyModel[310] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 1091
		bodyModel[311] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 1092
		bodyModel[312] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Box 1093
		bodyModel[313] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 1094
		bodyModel[314] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 1095
		bodyModel[315] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Box 1104
		bodyModel[316] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 1105
		bodyModel[317] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Box 1106
		bodyModel[318] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Box 1107
		bodyModel[319] = new ModelRendererTurbo(this, 105, 345, textureX, textureY); // Box 1108
		bodyModel[320] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 1109
		bodyModel[321] = new ModelRendererTurbo(this, 193, 337, textureX, textureY); // Box 702
		bodyModel[322] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Box 703
		bodyModel[323] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Box 704
		bodyModel[324] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Box 705
		bodyModel[325] = new ModelRendererTurbo(this, 89, 345, textureX, textureY); // Box 707
		bodyModel[326] = new ModelRendererTurbo(this, 137, 345, textureX, textureY); // Box 708
		bodyModel[327] = new ModelRendererTurbo(this, 313, 345, textureX, textureY); // Box 709
		bodyModel[328] = new ModelRendererTurbo(this, 401, 345, textureX, textureY); // Box 710
		bodyModel[329] = new ModelRendererTurbo(this, 457, 345, textureX, textureY); // Box 711
		bodyModel[330] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 712
		bodyModel[331] = new ModelRendererTurbo(this, 337, 345, textureX, textureY); // Box 713
		bodyModel[332] = new ModelRendererTurbo(this, 481, 345, textureX, textureY); // Box 714
		bodyModel[333] = new ModelRendererTurbo(this, 193, 345, textureX, textureY); // Box 715
		bodyModel[334] = new ModelRendererTurbo(this, 33, 353, textureX, textureY); // Box 716
		bodyModel[335] = new ModelRendererTurbo(this, 57, 353, textureX, textureY); // Box 717
		bodyModel[336] = new ModelRendererTurbo(this, 73, 353, textureX, textureY); // Box 718
		bodyModel[337] = new ModelRendererTurbo(this, 233, 345, textureX, textureY); // Box 719
		bodyModel[338] = new ModelRendererTurbo(this, 137, 353, textureX, textureY); // Box 720
		bodyModel[339] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Box 721
		bodyModel[340] = new ModelRendererTurbo(this, 361, 353, textureX, textureY); // Box 722
		bodyModel[341] = new ModelRendererTurbo(this, 385, 353, textureX, textureY); // Box 723
		bodyModel[342] = new ModelRendererTurbo(this, 481, 353, textureX, textureY); // Box 724
		bodyModel[343] = new ModelRendererTurbo(this, 449, 345, textureX, textureY); // Box 725
		bodyModel[344] = new ModelRendererTurbo(this, 161, 361, textureX, textureY); // Box 726
		bodyModel[345] = new ModelRendererTurbo(this, 185, 361, textureX, textureY); // Box 727
		bodyModel[346] = new ModelRendererTurbo(this, 201, 361, textureX, textureY); // Box 728
		bodyModel[347] = new ModelRendererTurbo(this, 25, 353, textureX, textureY); // Box 729
		bodyModel[348] = new ModelRendererTurbo(this, 233, 361, textureX, textureY); // Box 730
		bodyModel[349] = new ModelRendererTurbo(this, 97, 353, textureX, textureY); // Box 731
		bodyModel[350] = new ModelRendererTurbo(this, 265, 361, textureX, textureY); // Box 732
		bodyModel[351] = new ModelRendererTurbo(this, 289, 361, textureX, textureY); // Box 733
		bodyModel[352] = new ModelRendererTurbo(this, 305, 361, textureX, textureY); // Box 734
		bodyModel[353] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 735
		bodyModel[354] = new ModelRendererTurbo(this, 337, 361, textureX, textureY); // Box 736
		bodyModel[355] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Box 737
		bodyModel[356] = new ModelRendererTurbo(this, 409, 361, textureX, textureY); // Box 738
		bodyModel[357] = new ModelRendererTurbo(this, 257, 361, textureX, textureY); // Box 739
		bodyModel[358] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 740
		bodyModel[359] = new ModelRendererTurbo(this, 265, 345, textureX, textureY); // Box 741
		bodyModel[360] = new ModelRendererTurbo(this, 425, 345, textureX, textureY); // Box 742
		bodyModel[361] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 744
		bodyModel[362] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Box 745
		bodyModel[363] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 746
		bodyModel[364] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 747
		bodyModel[365] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 748
		bodyModel[366] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 749
		bodyModel[367] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 750
		bodyModel[368] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 751
		bodyModel[369] = new ModelRendererTurbo(this, 441, 361, textureX, textureY); // Box 752
		bodyModel[370] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 753
		bodyModel[371] = new ModelRendererTurbo(this, 457, 361, textureX, textureY); // Box 754
		bodyModel[372] = new ModelRendererTurbo(this, 329, 361, textureX, textureY); // Box 755
		bodyModel[373] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 756
		bodyModel[374] = new ModelRendererTurbo(this, 17, 369, textureX, textureY); // Box 757
		bodyModel[375] = new ModelRendererTurbo(this, 33, 369, textureX, textureY); // Box 758
		bodyModel[376] = new ModelRendererTurbo(this, 57, 369, textureX, textureY); // Box 759
		bodyModel[377] = new ModelRendererTurbo(this, 81, 369, textureX, textureY); // Box 760
		bodyModel[378] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 761
		bodyModel[379] = new ModelRendererTurbo(this, 97, 377, textureX, textureY); // Box 762

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 8, 51, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 643
		bodyModel[0].setRotationPoint(-15F, -17.2F, -25.4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 48, 8, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 645
		bodyModel[1].setRotationPoint(-63.5F, -17.2F, 12.3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 27, 1, 13, 0F,-0.35F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.35F, 0.5F, 0F, 1F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 1F, 0F, 0F); // Box 647
		bodyModel[2].setRotationPoint(-62.5F, -18.2F, 12.3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 48, 8, 13, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 648
		bodyModel[3].setRotationPoint(-63.5F, -17.2F, -25.1F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 27, 1, 13, 0F,-0.35F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.35F, 0.5F, 0F, 1F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 1F, 0F, 0F); // Box 649
		bodyModel[4].setRotationPoint(-62.5F, -18.2F, -25.1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F,0F, -2.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 653
		bodyModel[5].setRotationPoint(-68.5F, -14.2F, -25.1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,0F, -3.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 654
		bodyModel[6].setRotationPoint(-66.5F, -17.2F, -25.1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 9, 13, 0F,0F, -3.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 655
		bodyModel[7].setRotationPoint(-66.5F, -17.2F, 12.3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F,0F, -2.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		bodyModel[8].setRotationPoint(-68.5F, -14.2F, 12.3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 94, 11, 41, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		bodyModel[9].setRotationPoint(-65F, -9.2F, -20.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 19, 8, 51, 0F,0F, 0F, -0.3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.3F); // Box 658
		bodyModel[10].setRotationPoint(14F, -17.2F, -25.4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 8, 43, 0F,0F, 0F, 0F, 0.3F, -2.5F, -1.4F, 0.3F, -2.5F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -1.4F, 0.3F, 0F, -1.6F, 0F, 0F, 0F); // Box 659
		bodyModel[11].setRotationPoint(33F, -17.2F, -21.4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,-0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4F, -0.25F, 0.5F, 0F, -5.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9F, 0F, 0F); // Box 105
		bodyModel[12].setRotationPoint(-35.75F, -18.2F, 12.3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,-0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.65F, -4F, -0.25F, 0.5F, -4F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 106
		bodyModel[13].setRotationPoint(-30F, -18.2F, 12.3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,-0.25F, 0.5F, 0F, 0F, 0.5F, -4.05F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -5.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9F, 0F, 0F); // Box 108
		bodyModel[14].setRotationPoint(-35.75F, -18.2F, -25.1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 1, 13, 0F,-0.25F, 0.5F, -4.05F, 0F, 0.65F, -4.05F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 109
		bodyModel[15].setRotationPoint(-30F, -18.2F, -25.1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.25F, 0.65F, -4.05F, -0.25F, 0.65F, -4F, -0.25F, 0.65F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 110
		bodyModel[16].setRotationPoint(-17.25F, -18.2F, -25.1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 29, 2, 51, 0F,0.5F, -0.35F, -4.3F, 0F, -0.35F, -4.3F, 0F, -0.35F, -4.3F, 0.5F, -0.35F, -4.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F); // Box 111
		bodyModel[17].setRotationPoint(-15F, -19.2F, -25.4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,-0.25F, 0.5F, 0F, -0.25F, 0.65F, 0F, -0.25F, 0.65F, -4F, -0.25F, 0.65F, -4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 112
		bodyModel[18].setRotationPoint(-17.25F, -18.2F, 12.3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 2, 51, 0F,0.5F, -0.35F, -4.3F, 1F, -0.6F, -11.7F, 1F, -0.6F, -11.7F, 0.5F, -0.35F, -4.3F, 0.5F, 0F, -0.3F, 3.5F, 0F, -4F, 3.5F, 0F, -4F, 0.5F, 0F, -0.3F); // Box 113
		bodyModel[19].setRotationPoint(14.5F, -19.2F, -25.4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 1.5F, 1.3F, 0.5F, -1.6F, -0.7F, 0.2F, -1.6F, -0.6F, 0F, 1.5F, 0F, -1.1F, 0F, 0F, 0.5F, -2.05F, -1F, 0.2F, -2F, -0.6F, 0F, 0F, 0F); // Box 116
		bodyModel[20].setRotationPoint(42.3F, -13.2F, 16F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0.3F, -2.5F, -1.4F, 1.2F, -2.3F, -1.3F, 2.5F, 1.4F, -0.3F, 0F, -3F, 0F, 0.3F, -0.5F, -1.4F, 4.2F, 3.5F, -1.3F, 0F, -3F, 0F); // Box 117
		bodyModel[21].setRotationPoint(33F, -17.2F, -21.4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,2.5F, 1.4F, -0.3F, 1.2F, -2.3F, -1.3F, 0.3F, -2.5F, -1.4F, 0F, 0F, 0F, 0F, -3F, 0F, 4.2F, 3.5F, -1.3F, 0.3F, -0.5F, -1.4F, 0F, -3F, 0F); // Box 118
		bodyModel[22].setRotationPoint(33F, -17.2F, 13.6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F,0F, 0F, 0F, -0.3F, -3.7F, 1F, -0.3F, -2.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 119
		bodyModel[23].setRotationPoint(30.5F, -18.6F, -13.7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 4, 14, 0F,0F, 0F, -0.2F, -0.3F, -2.5F, -0.2F, -0.3F, -3.7F, 1F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 1F, 0F, 0F, 0F); // Box 120
		bodyModel[24].setRotationPoint(30.5F, -18.6F, -0.1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 4, 15, 0F,0.06F, 2.1F, 0F, 4.7F, -0.5F, 0F, 0.5F, -0.6F, -1F, 0.1F, 0.9F, -0.4F, -6.75F, -1F, 0F, 4.7F, -3.4F, 0F, 0.5F, -3.4F, -1F, -2.5F, -1.25F, 1.7F); // Box 124
		bodyModel[25].setRotationPoint(43.3F, -14F, 0.3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 13, 11, 41, 0F,0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -12.8F, 0F, 0F, -12.8F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[26].setRotationPoint(29F, -9.2F, -20.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 13, 11, 21, 0F,0F, 0F, 0F, 0.2F, 0F, -0.2F, 6.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -12.8F, 0F, 0F, -11.8F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[27].setRotationPoint(29F, -9.2F, -20.2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 11, 21, 0F,0F, 0F, -0.5F, 6.2F, 0F, -0.5F, 0.2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.5F, -11.8F, 0F, -0.5F, -12.8F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[28].setRotationPoint(29F, -9.2F, -0.2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,-5.94F, 0.2F, 0F, 4.7F, 0F, 0F, 0.5F, 0.25F, 1.7F, -1.9F, 0.2F, 1F, -6.7F, -0.2F, 0F, 2.9F, -0.2F, 0F, -1.9F, -0.2F, 0.7F, -2.4F, -0.2F, 0F); // Box 131
		bodyModel[29].setRotationPoint(40.3F, -11F, 0.3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,-1.9F, 0.2F, 1F, 0.5F, 0.2F, 2.3F, 4.7F, 0F, 0F, -5.94F, 0.2F, 0F, -2.4F, -0.2F, 0F, -1.9F, -0.2F, 1.3F, 2.9F, -0.2F, 0F, -6.7F, -0.2F, 0F); // Box 134
		bodyModel[30].setRotationPoint(40.3F, -11F, -14.7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 1.5F, 0F, 0.2F, -1.6F, -0.6F, 0.5F, -1.6F, -0.7F, 0F, 1.5F, 1.3F, 0F, 0F, 0F, 0.2F, -2F, -0.6F, 0.5F, -2F, -1F, -1.1F, 0F, 0F); // Box 135
		bodyModel[31].setRotationPoint(42.3F, -13.2F, -20F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 4, 15, 0F,0.1F, 0.9F, 0F, 0.5F, -0.6F, -0.4F, 4.7F, -0.5F, 0F, 0.06F, 2.1F, 0F, -2.5F, -1.2F, 2.3F, 0.5F, -3.4F, -0.4F, 4.7F, -3.4F, 0F, -6.75F, -1F, 0F); // Box 136
		bodyModel[32].setRotationPoint(43.3F, -14F, -14.7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 34, 4, 25, 0F,-8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -8F, 0F, 0F, 3.5F, 1.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 3.5F, 1.3F, 0F); // Box 137
		bodyModel[33].setRotationPoint(-65F, -13.5F, -12.2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 8, 41, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.7F, -0.5F, 0F); // Box 138
		bodyModel[34].setRotationPoint(-68F, -8.2F, -20.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 21, 0F,0.3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0.3F, 0F, 1F, 0F, -0.8F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.8F, 0F); // Box 139
		bodyModel[35].setRotationPoint(-67F, -0.7F, -10.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.8F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.3F, -0.8F, 0F); // Box 140
		bodyModel[36].setRotationPoint(-67F, -0.7F, -20.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.8F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.3F, -0.8F, 0F); // Box 141
		bodyModel[37].setRotationPoint(-67F, -0.7F, 10.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.13F, 0F, 1.72F, 0F, 0F, 1F); // Box 142
		bodyModel[38].setRotationPoint(41.2F, -14.9F, 10.9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2.13F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[39].setRotationPoint(41.2F, -14.9F, -14.8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 21, 5, 4, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, -4F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -4F, 0F, -0.3F); // Box 144
		bodyModel[40].setRotationPoint(-61.5F, -18.6F, 8.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, -0.3F, 0.5F, -2F, -0.3F, 0.5F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 145
		bodyModel[41].setRotationPoint(-40F, -18.6F, 8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0.5F, -6.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -6.3F, -0.3F, -1F, 4F, -0.3F, 4F, 0F, -0.3F, 4F, 0F, -0.3F, -1F, 4F, -0.3F); // Box 146
		bodyModel[42].setRotationPoint(-66.5F, -18.6F, 8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0.5F, -6.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -6.3F, -0.3F, -1F, 4F, -0.3F, 4F, 0F, -0.3F, 4F, 0F, -0.3F, -1F, 4F, -0.3F); // Box 147
		bodyModel[43].setRotationPoint(-66.5F, -18.6F, -12.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 21, 5, 4, 0F,0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, -4F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -4F, 0F, -0.3F); // Box 148
		bodyModel[44].setRotationPoint(-61.5F, -18.6F, -12.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, -0.3F, 0.5F, -2F, -0.3F, 0.5F, -2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 149
		bodyModel[45].setRotationPoint(-40F, -18.6F, -12.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 15, 7, 19, 0F,-1F, 0F, -0.3F, 0F, 0.2F, 1.5F, 0F, 0.2F, 1.5F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0.5F, 0F, -0.3F); // Box 150
		bodyModel[46].setRotationPoint(-37.5F, -21F, -9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 7, 3, 0F,-1F, -1.5F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -2.1F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F); // Box 151
		bodyModel[47].setRotationPoint(-37.5F, -21F, -11.9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 15, 7, 3, 0F,-1F, 0F, -0.3F, 0F, 0.2F, -2.1F, 0F, 0.2F, -0.3F, -1F, -1.5F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F); // Box 152
		bodyModel[48].setRotationPoint(-37.5F, -21F, 8.9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 153
		bodyModel[49].setRotationPoint(-26.5F, -23F, -19F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 160
		bodyModel[50].setRotationPoint(-17F, -19.5F, -16F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 161
		bodyModel[51].setRotationPoint(-17F, -19.5F, -20F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 130
		bodyModel[52].setRotationPoint(-23.3F, -19.4F, 21.3F);
		bodyModel[52].rotateAngleY = -0.38397244F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 131
		bodyModel[53].setRotationPoint(-23.5F, -20.5F, 21F);
		bodyModel[53].rotateAngleY = -0.38397244F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 132
		bodyModel[54].setRotationPoint(-23.5F, -20F, 21F);
		bodyModel[54].rotateAngleY = -0.38397244F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 118
		bodyModel[55].setRotationPoint(-23F, -19.2F, -22.4F);
		bodyModel[55].rotateAngleY = 0.34906585F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 119
		bodyModel[56].setRotationPoint(-23.2F, -20.3F, -22.1F);
		bodyModel[56].rotateAngleY = 0.34906585F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 120
		bodyModel[57].setRotationPoint(-23.2F, -19.8F, -22.1F);
		bodyModel[57].rotateAngleY = 0.34906585F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[58].setRotationPoint(26F, -19.5F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 246
		bodyModel[59].setRotationPoint(29F, -19.5F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 247
		bodyModel[60].setRotationPoint(23F, -19.5F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 233
		bodyModel[61].setRotationPoint(31.5F, -20F, -6.5F);
		bodyModel[61].rotateAngleY = 0.99483767F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 234
		bodyModel[62].setRotationPoint(31.5F, -19.5F, -6.5F);
		bodyModel[62].rotateAngleY = 0.99483767F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 235
		bodyModel[63].setRotationPoint(31.7F, -18.9F, -6.7F);
		bodyModel[63].rotateAngleY = 0.99483767F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 236
		bodyModel[64].setRotationPoint(33.25F, -19.3F, 3.5F);
		bodyModel[64].rotateAngleY = 2.19911486F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 237
		bodyModel[65].setRotationPoint(33.5F, -18.7F, 3.7F);
		bodyModel[65].rotateAngleY = 2.19911486F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 238
		bodyModel[66].setRotationPoint(33.25F, -19.8F, 3.5F);
		bodyModel[66].rotateAngleY = 2.19911486F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 239
		bodyModel[67].setRotationPoint(32.75F, -20F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F); // Box 240
		bodyModel[68].setRotationPoint(32.75F, -19.5F, -2F);
		bodyModel[68].rotateAngleZ = -0.01745329F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F); // Box 241
		bodyModel[69].setRotationPoint(33F, -18.9F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 201
		bodyModel[70].setRotationPoint(27.1F, -19.7F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 202
		bodyModel[71].setRotationPoint(-20.5F, -19.7F, -6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 203
		bodyModel[72].setRotationPoint(-53.3F, -18.8F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 204
		bodyModel[73].setRotationPoint(-53.3F, -18.8F, -12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,-3.7F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -3.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -0.7F, 0F, -0.3F); // Box 205
		bodyModel[74].setRotationPoint(-67.3F, -17.2F, -12F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,-3.7F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -3.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -0.7F, 0F, -0.3F); // Box 206
		bodyModel[75].setRotationPoint(-67.3F, -17.2F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 281
		bodyModel[76].setRotationPoint(-36F, -20.5F, 22F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,4.65F, 0F, -0.35F, -5.35F, 0F, -0.35F, -5.35F, 0F, -0.35F, 4.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 287
		bodyModel[77].setRotationPoint(-41.5F, -51.5F, 22.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,3.65F, 0F, -0.35F, -4.35F, 0F, -0.35F, -4.35F, 0F, -0.35F, 3.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 288
		bodyModel[78].setRotationPoint(-37.5F, -45.5F, 22.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,1.65F, 0F, -0.35F, -2.35F, 0F, -0.35F, -2.35F, 0F, -0.35F, 1.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 289
		bodyModel[79].setRotationPoint(-35.5F, -36.5F, 22.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 290
		bodyModel[80].setRotationPoint(-35.5F, -27.5F, 22.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 212
		bodyModel[81].setRotationPoint(35F, -18.3F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 213
		bodyModel[82].setRotationPoint(36.4F, -17.9F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 214
		bodyModel[83].setRotationPoint(37.8F, -17.5F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 215
		bodyModel[84].setRotationPoint(39.2F, -17.1F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 216
		bodyModel[85].setRotationPoint(40.6F, -16.7F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 217
		bodyModel[86].setRotationPoint(42F, -16.3F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 218
		bodyModel[87].setRotationPoint(43.4F, -15.9F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 219
		bodyModel[88].setRotationPoint(33.6F, -18.7F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-1.4F, -0.2F, 0F, 1.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.2F, 0F, -1.4F, -0.25F, 0F, 1.9F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 228
		bodyModel[89].setRotationPoint(44F, -15.7F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 229
		bodyModel[90].setRotationPoint(33.6F, -18.7F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 230
		bodyModel[91].setRotationPoint(35F, -18.3F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 231
		bodyModel[92].setRotationPoint(36.4F, -17.9F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 232
		bodyModel[93].setRotationPoint(37.8F, -17.5F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 233
		bodyModel[94].setRotationPoint(39.2F, -17.1F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 234
		bodyModel[95].setRotationPoint(40.6F, -16.7F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 235
		bodyModel[96].setRotationPoint(42F, -16.3F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 236
		bodyModel[97].setRotationPoint(43.4F, -15.9F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.2F, -0.2F, 0F, 0.2F, -0.55F, 0F, 1.9F, -0.55F, 0F, -1.4F, -0.2F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 1.9F, -0.25F, 0F, -1.4F, -0.25F, 0F); // Box 237
		bodyModel[98].setRotationPoint(44F, -15.7F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -0.2F, -0.1F, 0.4F, -3.3F, -0.1F, 0.4F, -3.3F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 238
		bodyModel[99].setRotationPoint(36.6F, -18.5F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,2F, -0.2F, 0F, -1.1F, -1.55F, 0F, 1.9F, -1.55F, -1F, -1.4F, -0.2F, 1F, 2F, -0.25F, 0F, -1.1F, -0.25F, 0F, 1.9F, -0.25F, -1F, -1.4F, -0.25F, 1F); // Box 239
		bodyModel[100].setRotationPoint(46.5F, -15.3F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,-0.8F, -0.25F, -1F, 1.9F, -1.55F, -1F, -1.1F, -1.55F, 0F, 2F, -0.2F, 0F, -1.4F, -0.25F, 1F, 1.9F, -0.25F, -1F, -1.1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 241
		bodyModel[101].setRotationPoint(46.5F, -15.3F, -1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,-2F, -1F, 0F, -0.7F, -1.55F, 0F, -0.1F, -1.55F, 0F, 0F, -0.2F, 0F, -2F, -0.25F, 0F, -0.7F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 242
		bodyModel[102].setRotationPoint(44.5F, -15.3F, -13F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.2F, 0F, -0.1F, -1.55F, 0F, -0.7F, -1.55F, 0F, -2F, -1F, 0F, 0F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.7F, -0.25F, 0F, -2F, -0.25F, 0F); // Box 243
		bodyModel[103].setRotationPoint(44.5F, -15.3F, 11F);

		bodyModel[104].addShapeBox(3F, -1.78F, -2.55F, 7, 1, 5, 0F,0F, -0.6F, -1.9F, -0.5F, -0.6F, -1.9F, -0.5F, -0.6F, -1.9F, 0F, -0.6F, -1.9F, 0F, 0.5F, -1.15F, 0F, 0.5F, -1.15F, 0F, 0.5F, -1.15F, 0F, 0.5F, -1.15F); // Box 246
		bodyModel[104].setRotationPoint(34.25F, -13.15F, -17.4F);

		bodyModel[105].addShapeBox(3F, -0.48F, -2.55F, 7, 1, 5, 0F,0F, -0.2F, -1.15F, -0.5F, -0.2F, -1.15F, -0.5F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F); // Box 247
		bodyModel[105].setRotationPoint(34.75F, -13.15F, -17.4F);

		bodyModel[106].addShapeBox(3F, 0.83F, -2.55F, 7, 1, 5, 0F,0F, 0.5F, -1.15F, -0.5F, 0.51F, -1.15F, -0.5F, 0.51F, -1.15F, 0F, 0.5F, -1.15F, 0F, -0.7F, -1.9F, 0F, -0.7F, -1.9F, 0F, -0.7F, -1.9F, 0F, -0.7F, -1.9F); // Box 248
		bodyModel[106].setRotationPoint(35.25F, -13.15F, -17.4F);

		bodyModel[107].addShapeBox(3F, -1.78F, -2.55F, 7, 1, 5, 0F,0F, -0.6F, -1.9F, -0.5F, -0.6F, -1.9F, -0.5F, -0.6F, -1.9F, 0F, -0.6F, -1.9F, 0F, 0.5F, -1.15F, 0F, 0.5F, -1.15F, 0F, 0.5F, -1.15F, 0F, 0.5F, -1.15F); // Box 249
		bodyModel[107].setRotationPoint(34.25F, -13.25F, 17.6F);

		bodyModel[108].addShapeBox(3F, -0.48F, -2.55F, 7, 1, 5, 0F,0F, -0.2F, -1.15F, -0.5F, -0.2F, -1.15F, -0.5F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F); // Box 250
		bodyModel[108].setRotationPoint(34.75F, -13.25F, 17.6F);

		bodyModel[109].addShapeBox(3F, 0.83F, -2.55F, 7, 1, 5, 0F,0F, 0.5F, -1.15F, -0.5F, 0.51F, -1.15F, -0.5F, 0.51F, -1.15F, 0F, 0.5F, -1.15F, 0F, -0.7F, -1.9F, 0F, -0.7F, -1.9F, 0F, -0.7F, -1.9F, 0F, -0.7F, -1.9F); // Box 251
		bodyModel[109].setRotationPoint(35.25F, -13.25F, 17.6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 252
		bodyModel[110].setRotationPoint(43.5F, -13.8F, -18F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 253
		bodyModel[111].setRotationPoint(43.5F, -13.8F, 17F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,-6.7F, 0F, -0.3F, 2.3F, 0F, -0.3F, 2.3F, 0F, -0.3F, -6.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -0.7F, 0F, -0.3F); // Box 254
		bodyModel[112].setRotationPoint(-66.8F, -12.5F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,-6.7F, 0F, -0.3F, 2.3F, 0F, -0.3F, 2.3F, 0F, -0.3F, -6.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -0.7F, 0F, -0.3F); // Box 255
		bodyModel[113].setRotationPoint(-66.8F, -12.5F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 256
		bodyModel[114].setRotationPoint(-47.3F, -18.8F, -12F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 257
		bodyModel[115].setRotationPoint(-47.3F, -18.8F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 258
		bodyModel[116].setRotationPoint(-19.3F, -17.8F, 25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 259
		bodyModel[117].setRotationPoint(-19.3F, -16.8F, 25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 260
		bodyModel[118].setRotationPoint(3.7F, -17.8F, 25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 261
		bodyModel[119].setRotationPoint(3.7F, -16.8F, 25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 262
		bodyModel[120].setRotationPoint(3.7F, -17.8F, -26F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 263
		bodyModel[121].setRotationPoint(3.7F, -16.8F, -26F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 264
		bodyModel[122].setRotationPoint(-19.3F, -17.8F, -26F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 265
		bodyModel[123].setRotationPoint(-19.3F, -16.8F, -26F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 423
		bodyModel[124].setRotationPoint(32.3F, -16.9F, 23.35F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 424
		bodyModel[125].setRotationPoint(33.2F, -15.4F, 23.4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 425
		bodyModel[126].setRotationPoint(33.2F, -16.4F, 23.4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 426
		bodyModel[127].setRotationPoint(33.2F, -17.4F, 23.4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 270
		bodyModel[128].setRotationPoint(32.3F, -14.65F, 21.6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 271
		bodyModel[129].setRotationPoint(32.3F, -14.65F, -23.7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 272
		bodyModel[130].setRotationPoint(32.3F, -16.9F, -24.45F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 273
		bodyModel[131].setRotationPoint(33.2F, -17.4F, -24.4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 274
		bodyModel[132].setRotationPoint(33.2F, -16.4F, -24.4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 275
		bodyModel[133].setRotationPoint(33.2F, -15.4F, -24.4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.1F, 0F); // Box 276
		bodyModel[134].setRotationPoint(15.7F, -10.65F, -25.7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.1F, 0F, 0F, -2.1F, 0F, 0F, -2.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -0.3F, 0F); // Box 277
		bodyModel[135].setRotationPoint(33.7F, -9.65F, -25.7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.1F, 0F, 0F, -2.1F, 0F, 0F, -2.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, 1.7F, 0F, 0F, 1.7F, 0F, 0F, -0.3F, 0F); // Box 278
		bodyModel[136].setRotationPoint(33.7F, -9.65F, 19.6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 18, 1, 6, 0F,0F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.1F, 0F); // Box 279
		bodyModel[137].setRotationPoint(15.7F, -10.65F, 19.6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,-4F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -4F, 0F, -0.3F, -2.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -2.3F, 0F, -0.3F); // Box 280
		bodyModel[138].setRotationPoint(-51.3F, -18F, -17F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,-4F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -4F, 0F, -0.3F, -2.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -2.3F, 0F, -0.3F); // Box 281
		bodyModel[139].setRotationPoint(-51.3F, -18F, 14F);

		bodyModel[140].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 547
		bodyModel[140].setRotationPoint(25.8F, 0.7F, 18.2F);

		bodyModel[141].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 548
		bodyModel[141].setRotationPoint(25.8F, 0.7F, 18.2F);

		bodyModel[142].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 549
		bodyModel[142].setRotationPoint(25.8F, 0.7F, 18.2F);

		bodyModel[143].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 559
		bodyModel[143].setRotationPoint(19.8F, 3.7F, 19.8F);

		bodyModel[144].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 560
		bodyModel[144].setRotationPoint(19.8F, 3.7F, 19.8F);

		bodyModel[145].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 561
		bodyModel[145].setRotationPoint(19.8F, 3.7F, 19.8F);

		bodyModel[146].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 622
		bodyModel[146].setRotationPoint(24.8F, 0.7F, 18F);
		bodyModel[146].rotateAngleZ = -1.06465084F;

		bodyModel[147].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 398
		bodyModel[147].setRotationPoint(12.8F, 0.7F, 18.2F);

		bodyModel[148].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 399
		bodyModel[148].setRotationPoint(12.8F, 0.7F, 18.2F);

		bodyModel[149].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 400
		bodyModel[149].setRotationPoint(12.8F, 0.7F, 18.2F);

		bodyModel[150].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 401
		bodyModel[150].setRotationPoint(11.8F, 0.7F, 18F);
		bodyModel[150].rotateAngleZ = -1.06465084F;

		bodyModel[151].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 402
		bodyModel[151].setRotationPoint(6.8F, 3.7F, 19.8F);

		bodyModel[152].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 403
		bodyModel[152].setRotationPoint(6.8F, 3.7F, 19.8F);

		bodyModel[153].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 404
		bodyModel[153].setRotationPoint(6.8F, 3.7F, 19.8F);

		bodyModel[154].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 405
		bodyModel[154].setRotationPoint(-1.2F, 0.7F, 18.2F);

		bodyModel[155].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 406
		bodyModel[155].setRotationPoint(-1.2F, 0.7F, 18.2F);

		bodyModel[156].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 407
		bodyModel[156].setRotationPoint(-1.2F, 0.7F, 18.2F);

		bodyModel[157].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 408
		bodyModel[157].setRotationPoint(-2.2F, 0.7F, 18F);
		bodyModel[157].rotateAngleZ = -1.06465084F;

		bodyModel[158].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 409
		bodyModel[158].setRotationPoint(-7.2F, 3.7F, 19.8F);

		bodyModel[159].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 410
		bodyModel[159].setRotationPoint(-7.2F, 3.7F, 19.8F);

		bodyModel[160].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 411
		bodyModel[160].setRotationPoint(-7.2F, 3.7F, 19.8F);

		bodyModel[161].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 412
		bodyModel[161].setRotationPoint(-15.2F, 0.7F, 18.2F);

		bodyModel[162].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 413
		bodyModel[162].setRotationPoint(-15.2F, 0.7F, 18.2F);

		bodyModel[163].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 414
		bodyModel[163].setRotationPoint(-15.2F, 0.7F, 18.2F);

		bodyModel[164].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 415
		bodyModel[164].setRotationPoint(-16.2F, 0.7F, 18F);
		bodyModel[164].rotateAngleZ = -1.06465084F;

		bodyModel[165].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 416
		bodyModel[165].setRotationPoint(-21.2F, 3.7F, 19.8F);

		bodyModel[166].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 417
		bodyModel[166].setRotationPoint(-21.2F, 3.7F, 19.8F);

		bodyModel[167].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 418
		bodyModel[167].setRotationPoint(-21.2F, 3.7F, 19.8F);

		bodyModel[168].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 419
		bodyModel[168].setRotationPoint(-28.2F, 0.7F, 18.2F);

		bodyModel[169].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 420
		bodyModel[169].setRotationPoint(-28.2F, 0.7F, 18.2F);

		bodyModel[170].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 421
		bodyModel[170].setRotationPoint(-28.2F, 0.7F, 18.2F);

		bodyModel[171].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 422
		bodyModel[171].setRotationPoint(-29.2F, 0.7F, 18F);
		bodyModel[171].rotateAngleZ = -1.06465084F;

		bodyModel[172].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 423
		bodyModel[172].setRotationPoint(-34.2F, 3.7F, 19.8F);

		bodyModel[173].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 424
		bodyModel[173].setRotationPoint(-34.2F, 3.7F, 19.8F);

		bodyModel[174].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 425
		bodyModel[174].setRotationPoint(-34.2F, 3.7F, 19.8F);

		bodyModel[175].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 577
		bodyModel[175].setRotationPoint(19.8F, 3.7F, -23.2F);

		bodyModel[176].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 578
		bodyModel[176].setRotationPoint(19.8F, 3.7F, -23.2F);

		bodyModel[177].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 579
		bodyModel[177].setRotationPoint(19.8F, 3.7F, -23.2F);

		bodyModel[178].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 595
		bodyModel[178].setRotationPoint(25.8F, 0.7F, -22.2F);

		bodyModel[179].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 596
		bodyModel[179].setRotationPoint(25.8F, 0.7F, -22.2F);

		bodyModel[180].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 597
		bodyModel[180].setRotationPoint(25.8F, 0.7F, -22.2F);

		bodyModel[181].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 620
		bodyModel[181].setRotationPoint(24.8F, 0.7F, -23.5F);
		bodyModel[181].rotateAngleZ = -1.06465084F;

		bodyModel[182].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 433
		bodyModel[182].setRotationPoint(5.8F, 3.7F, -23.2F);

		bodyModel[183].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 434
		bodyModel[183].setRotationPoint(5.8F, 3.7F, -23.2F);

		bodyModel[184].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 435
		bodyModel[184].setRotationPoint(5.8F, 3.7F, -23.2F);

		bodyModel[185].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 436
		bodyModel[185].setRotationPoint(12.2F, 0.7F, -22.2F);

		bodyModel[186].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 437
		bodyModel[186].setRotationPoint(12.2F, 0.7F, -22.2F);

		bodyModel[187].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 438
		bodyModel[187].setRotationPoint(12.2F, 0.7F, -22.2F);

		bodyModel[188].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 439
		bodyModel[188].setRotationPoint(11.2F, 0.7F, -23.5F);
		bodyModel[188].rotateAngleZ = -1.06465084F;

		bodyModel[189].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 440
		bodyModel[189].setRotationPoint(-7.2F, 3.7F, -23.2F);

		bodyModel[190].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 441
		bodyModel[190].setRotationPoint(-7.2F, 3.7F, -23.2F);

		bodyModel[191].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 442
		bodyModel[191].setRotationPoint(-7.2F, 3.7F, -23.2F);

		bodyModel[192].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 443
		bodyModel[192].setRotationPoint(-1.2F, 0.7F, -22.2F);

		bodyModel[193].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 444
		bodyModel[193].setRotationPoint(-1.2F, 0.7F, -22.2F);

		bodyModel[194].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 445
		bodyModel[194].setRotationPoint(-1.2F, 0.7F, -22.2F);

		bodyModel[195].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 446
		bodyModel[195].setRotationPoint(-2.2F, 0.7F, -23.5F);
		bodyModel[195].rotateAngleZ = -1.06465084F;

		bodyModel[196].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 447
		bodyModel[196].setRotationPoint(-21.2F, 3.7F, -23.2F);

		bodyModel[197].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 448
		bodyModel[197].setRotationPoint(-21.2F, 3.7F, -23.2F);

		bodyModel[198].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 449
		bodyModel[198].setRotationPoint(-21.2F, 3.7F, -23.2F);

		bodyModel[199].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 450
		bodyModel[199].setRotationPoint(-15.2F, 0.7F, -22.2F);

		bodyModel[200].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 451
		bodyModel[200].setRotationPoint(-15.2F, 0.7F, -22.2F);

		bodyModel[201].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 452
		bodyModel[201].setRotationPoint(-15.2F, 0.7F, -22.2F);

		bodyModel[202].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 453
		bodyModel[202].setRotationPoint(-16.2F, 0.7F, -23.5F);
		bodyModel[202].rotateAngleZ = -1.06465084F;

		bodyModel[203].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 454
		bodyModel[203].setRotationPoint(-35.2F, 3.7F, -23.2F);

		bodyModel[204].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 455
		bodyModel[204].setRotationPoint(-35.2F, 3.7F, -23.2F);

		bodyModel[205].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 456
		bodyModel[205].setRotationPoint(-35.2F, 3.7F, -23.2F);

		bodyModel[206].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 457
		bodyModel[206].setRotationPoint(-29.2F, 0.7F, -22.2F);

		bodyModel[207].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 458
		bodyModel[207].setRotationPoint(-29.2F, 0.7F, -22.2F);

		bodyModel[208].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 459
		bodyModel[208].setRotationPoint(-29.2F, 0.7F, -22.2F);

		bodyModel[209].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 460
		bodyModel[209].setRotationPoint(-30.2F, 0.7F, -23.5F);
		bodyModel[209].rotateAngleZ = -1.06465084F;

		bodyModel[210].addShapeBox(-1F, -1.2F, 0.2F, 2, 1, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 461
		bodyModel[210].setRotationPoint(4.8F, -2.3F, -21.2F);

		bodyModel[211].addShapeBox(-1F, -1.2F, 0.2F, 2, 1, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 462
		bodyModel[211].setRotationPoint(19.8F, -2.3F, -21.2F);

		bodyModel[212].addShapeBox(-1F, -1.2F, 0.2F, 2, 1, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 463
		bodyModel[212].setRotationPoint(-9.2F, -2.3F, -21.2F);

		bodyModel[213].addShapeBox(-1F, -1.2F, 0.2F, 2, 1, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 464
		bodyModel[213].setRotationPoint(-23.2F, -2.3F, -21.2F);

		bodyModel[214].addShapeBox(-1F, -1.2F, 0.2F, 2, 1, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 465
		bodyModel[214].setRotationPoint(-23.2F, -2.3F, 17.8F);

		bodyModel[215].addShapeBox(-1F, -1.2F, 0.2F, 2, 1, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 466
		bodyModel[215].setRotationPoint(-9.2F, -2.3F, 17.8F);

		bodyModel[216].addShapeBox(-1F, -1.2F, 0.2F, 2, 1, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 467
		bodyModel[216].setRotationPoint(4.8F, -2.3F, 17.8F);

		bodyModel[217].addShapeBox(-1F, -1.2F, 0.2F, 2, 1, 3, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 468
		bodyModel[217].setRotationPoint(19.8F, -2.3F, 17.8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.3F, -0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, -0.2F, 0F, -0.4F); // Box 202
		bodyModel[218].setRotationPoint(-69.5F, -5.9F, 16F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.3F, -0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0.6F, 0.4F, 0F, 0.6F, 0.4F, -0.2F, 0F, -0.4F); // Box 447
		bodyModel[219].setRotationPoint(-69.5F, -5.9F, -18F);

		bodyModel[220].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 347
		bodyModel[220].setRotationPoint(-44.2F, 0.7F, -22.2F);

		bodyModel[221].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 348
		bodyModel[221].setRotationPoint(-45.2F, 0.7F, -23.5F);
		bodyModel[221].rotateAngleZ = -1.06465084F;

		bodyModel[222].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 3, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 349
		bodyModel[222].setRotationPoint(-44.2F, 0.7F, -22.2F);

		bodyModel[223].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 3, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 350
		bodyModel[223].setRotationPoint(-44.2F, 0.7F, -22.2F);

		bodyModel[224].addShapeBox(-1F, -1.2F, 2.2F, 2, 7, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 368
		bodyModel[224].setRotationPoint(-45.2F, 0.7F, 18F);
		bodyModel[224].rotateAngleZ = -1.06465084F;

		bodyModel[225].addShapeBox(-1F, -1.3F, 0.2F, 2, 1, 4, 0F,-0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 369
		bodyModel[225].setRotationPoint(-44.2F, 0.7F, 18.2F);

		bodyModel[226].addShapeBox(-1F, -1.2F, 0.2F, 2, 2, 4, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F); // Box 370
		bodyModel[226].setRotationPoint(-44.2F, 0.7F, 18.2F);

		bodyModel[227].addShapeBox(-1F, -0.1F, 0.2F, 2, 1, 4, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F); // Box 371
		bodyModel[227].setRotationPoint(-44.2F, 0.7F, 18.2F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 29, 3, 43, 0F,0.5F, -0.5F, -4.3F, -8F, -0.5F, -4.3F, -8F, -0.5F, -4.3F, 0.5F, -0.5F, -4.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F); // Box 372
		bodyModel[228].setRotationPoint(-15F, -21.85F, -21.4F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 7, 8, 27, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 373
		bodyModel[229].setRotationPoint(-22F, -18.7F, -13.4F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 15, 3, 13, 0F,-1F, -0.5F, -4.3F, 0.5F, -0.5F, -4.3F, 0.5F, -0.5F, -4.3F, -1F, -0.5F, -4.3F, 2F, 0.2F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -4.3F, 2F, 0.2F, -4.3F); // Box 374
		bodyModel[230].setRotationPoint(-31F, -21.85F, -21.4F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 15, 3, 13, 0F,-1F, -0.5F, -4.3F, 0.5F, -0.5F, -4.3F, 0.5F, -0.5F, -4.3F, -1F, -0.5F, -4.3F, 2F, 0.2F, -4.3F, 0.5F, 0F, -4.3F, 0.5F, 0F, -0.3F, 2F, 0.2F, -0.3F); // Box 375
		bodyModel[231].setRotationPoint(-31F, -21.85F, 8.6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 7, 3, 26, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.2F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F); // Box 376
		bodyModel[232].setRotationPoint(-22.5F, -21.85F, -12.7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 377
		bodyModel[233].setRotationPoint(-27F, -23F, -19F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 378
		bodyModel[234].setRotationPoint(3.5F, -23F, -19F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 379
		bodyModel[235].setRotationPoint(3.5F, -23F, 18F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 380
		bodyModel[236].setRotationPoint(-26.5F, -23F, 18F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 381
		bodyModel[237].setRotationPoint(-27F, -23F, 18F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 382
		bodyModel[238].setRotationPoint(2.7F, -19.4F, 21.3F);
		bodyModel[238].rotateAngleY = -0.38397244F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 383
		bodyModel[239].setRotationPoint(2.5F, -20F, 21F);
		bodyModel[239].rotateAngleY = -0.38397244F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 384
		bodyModel[240].setRotationPoint(2.5F, -20.5F, 21F);
		bodyModel[240].rotateAngleY = -0.38397244F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 385
		bodyModel[241].setRotationPoint(2.7F, -19.4F, 3.3F);
		bodyModel[241].rotateAngleY = -0.38397244F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 386
		bodyModel[242].setRotationPoint(2.5F, -20F, 3F);
		bodyModel[242].rotateAngleY = -0.38397244F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 387
		bodyModel[243].setRotationPoint(2.5F, -20.5F, 3F);
		bodyModel[243].rotateAngleY = -0.38397244F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 388
		bodyModel[244].setRotationPoint(3F, -19.2F, -22.4F);
		bodyModel[244].rotateAngleY = 0.34906585F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 389
		bodyModel[245].setRotationPoint(2.8F, -19.8F, -22.1F);
		bodyModel[245].rotateAngleY = 0.34906585F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 390
		bodyModel[246].setRotationPoint(2.8F, -20.3F, -22.1F);
		bodyModel[246].rotateAngleY = 0.34906585F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 36, 0F,-0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 391
		bodyModel[247].setRotationPoint(-19.5F, -22F, -18F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 26, 0F,-0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 392
		bodyModel[248].setRotationPoint(-22.5F, -22F, -13F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.1F, -0.8F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 393
		bodyModel[249].setRotationPoint(-26.3F, -22F, -4.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.1F, -0.8F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 394
		bodyModel[250].setRotationPoint(-26.3F, -22F, 3.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 395
		bodyModel[251].setRotationPoint(1F, -22F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[252].setRotationPoint(5F, -22F, -6F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 397
		bodyModel[253].setRotationPoint(8F, -22F, -6F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 398
		bodyModel[254].setRotationPoint(0F, -21.5F, -7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[255].setRotationPoint(5F, -21.5F, -7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 400
		bodyModel[256].setRotationPoint(9F, -21.5F, -7F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[257].setRotationPoint(7.8F, -22.2F, -3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[258].setRotationPoint(7.8F, -22.2F, 2F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 403
		bodyModel[259].setRotationPoint(12F, -23F, 3F);
		bodyModel[259].rotateAngleY = 2.19911486F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 404
		bodyModel[260].setRotationPoint(12F, -22.5F, 3F);
		bodyModel[260].rotateAngleY = 2.19911486F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 405
		bodyModel[261].setRotationPoint(12.25F, -21.9F, 3.2F);
		bodyModel[261].rotateAngleY = 2.19911486F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F); // Box 406
		bodyModel[262].setRotationPoint(12F, -22.9F, -1.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.25F, 0F); // Box 407
		bodyModel[263].setRotationPoint(11.75F, -23.5F, -1.5F);
		bodyModel[263].rotateAngleZ = -0.01745329F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 408
		bodyModel[264].setRotationPoint(11.75F, -24F, -1.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F, 0.3F, -0.25F, 0F); // Box 409
		bodyModel[265].setRotationPoint(10.2F, -21.9F, -5.9F);
		bodyModel[265].rotateAngleY = 0.85521133F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F); // Box 410
		bodyModel[266].setRotationPoint(10F, -22.5F, -5.7F);
		bodyModel[266].rotateAngleY = 0.85521133F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 411
		bodyModel[267].setRotationPoint(10F, -23F, -5.7F);
		bodyModel[267].rotateAngleY = 0.85521133F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 412
		bodyModel[268].setRotationPoint(7F, -20.25F, -17F);
		bodyModel[268].rotateAngleY = -0.10471976F;
		bodyModel[268].rotateAngleZ = 1.29154365F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 414
		bodyModel[269].setRotationPoint(8F, -20.25F, 9F);
		bodyModel[269].rotateAngleY = 0.10471976F;
		bodyModel[269].rotateAngleZ = 1.29154365F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 415
		bodyModel[270].setRotationPoint(8F, -20.4F, 10F);
		bodyModel[270].rotateAngleY = 0.10471976F;
		bodyModel[270].rotateAngleZ = 1.29154365F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 416
		bodyModel[271].setRotationPoint(7.5F, -20.4F, 15F);
		bodyModel[271].rotateAngleY = 0.10471976F;
		bodyModel[271].rotateAngleZ = 1.29154365F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 417
		bodyModel[272].setRotationPoint(7.5F, -20.4F, -11F);
		bodyModel[272].rotateAngleY = -0.10471976F;
		bodyModel[272].rotateAngleZ = 1.29154365F;

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 418
		bodyModel[273].setRotationPoint(7F, -20.4F, -16F);
		bodyModel[273].rotateAngleY = -0.10471976F;
		bodyModel[273].rotateAngleZ = 1.29154365F;

		bodyModel[274].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 419
		bodyModel[274].setRotationPoint(-16F, -22F, -11F);
		bodyModel[274].rotateAngleY = 0.29670597F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 420
		bodyModel[275].setRotationPoint(-18.15F, -22F, -7.45F);
		bodyModel[275].rotateAngleY = 0.29670597F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 16, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[276].setRotationPoint(-15.1F, -22F, -13.85F);
		bodyModel[276].rotateAngleY = 0.29670597F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 422
		bodyModel[277].setRotationPoint(-14.8F, -22F, -14.8F);
		bodyModel[277].rotateAngleY = 0.29670597F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[278].setRotationPoint(-17.2F, -22F, 8.15F);
		bodyModel[278].rotateAngleY = -0.29670597F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 16, 4, 1, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 424
		bodyModel[279].setRotationPoint(-15.1F, -22F, 14.85F);
		bodyModel[279].rotateAngleY = -0.29670597F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 16, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 425
		bodyModel[280].setRotationPoint(-16F, -22F, 12F);
		bodyModel[280].rotateAngleY = -0.29670597F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 18, 4, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[281].setRotationPoint(-18.75F, -22F, 6.55F);
		bodyModel[281].rotateAngleY = -0.29670597F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 427
		bodyModel[282].setRotationPoint(-16.75F, -22.5F, 5.55F);
		bodyModel[282].rotateAngleY = -0.29670597F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 428
		bodyModel[283].setRotationPoint(-6.75F, -22.5F, 2.4F);
		bodyModel[283].rotateAngleY = -0.29670597F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 429
		bodyModel[284].setRotationPoint(-6.25F, -22.5F, -2.6F);
		bodyModel[284].rotateAngleY = 0.29670597F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 430
		bodyModel[285].setRotationPoint(-16.5F, -22.5F, -5.45F);
		bodyModel[285].rotateAngleY = 0.29670597F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 21, 3, 19, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 730
		bodyModel[286].setRotationPoint(-11.4F, -28.7F, -9.45F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 11, 3, 19, 0F,0F, -0.2F, 0F, 0F, -0.2F, -9F, 0F, -0.2F, -9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -9F, 0F, -0.2F, -9F, 0F, -0.2F, 0F); // Box 731
		bodyModel[287].setRotationPoint(9.6F, -28.7F, -9.45F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 732
		bodyModel[288].setRotationPoint(-11.4F, -28.7F, -18.45F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -12F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 733
		bodyModel[289].setRotationPoint(-11.4F, -28.7F, 9.55F);

		bodyModel[290].addShapeBox(-1F, 0F, 3F, 1, 3, 13, 0F,0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F); // Box 1034
		bodyModel[290].setRotationPoint(-11.4F, -28.7F, -9.45F);

		bodyModel[291].addShapeBox(-2F, 0F, 3F, 1, 3, 13, 0F,0F, -0.2F, -3F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -3F); // Box 1035
		bodyModel[291].setRotationPoint(-11.4F, -28.7F, -9.45F);

		bodyModel[292].addShapeBox(-3F, 0F, 3F, 1, 3, 13, 0F,0.1F, -0.2F, -3.8F, 0F, -0.2F, -3F, 0F, -0.2F, -3F, 0.1F, -0.2F, -3.8F, 1.1F, -0.2F, -3.8F, 0F, -0.2F, -3F, 0F, -0.2F, -3F, 1.1F, -0.2F, -3.8F); // Box 1037
		bodyModel[292].setRotationPoint(-11.4F, -28.7F, -9.45F);

		bodyModel[293].addShapeBox(-4.1F, 0F, 3F, 1, 3, 13, 0F,0.1F, 0F, -3.8F, 0F, -0.2F, -3.8F, 0F, -0.2F, -3.8F, 0.1F, 0F, -3.8F, 0.1F, -0.4F, -3.8F, -1F, -0.2F, -3.8F, -1F, -0.2F, -3.8F, 0.1F, -0.4F, -3.8F); // Box 1038
		bodyModel[293].setRotationPoint(-11.4F, -28.7F, -9.45F);

		bodyModel[294].addShapeBox(-12.3F, -0.2F, 3F, 8, 3, 13, 0F,-0.3F, 3F, -5.8F, 0.1F, -0.2F, -3.8F, 0.1F, -0.2F, -3.8F, -0.3F, 3F, -5.8F, -0.3F, -4.6F, -5.8F, 0.1F, -0.2F, -3.8F, 0.1F, -0.2F, -3.8F, -0.3F, -4.6F, -5.8F); // Box 1039
		bodyModel[294].setRotationPoint(-11.4F, -28.7F, -9.45F);

		bodyModel[295].addShapeBox(-4F, 0F, 9F, 2, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 1040
		bodyModel[295].setRotationPoint(-21.4F, -32.1F, -9.45F);

		bodyModel[296].addShapeBox(-4.9F, 0F, 9F, 1, 2, 1, 0F,0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.6F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0F, -0.6F, 0.2F); // Box 1041
		bodyModel[296].setRotationPoint(-21.4F, -32.1F, -9.45F);

		bodyModel[297].addShapeBox(-4F, -0.5F, 9F, 2, 1, 1, 0F,0.1F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.9F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.9F, -0.3F, 0.2F); // Box 1042
		bodyModel[297].setRotationPoint(-21.4F, -32.1F, -9.45F);

		bodyModel[298].addShapeBox(0.4F, -2F, -7.5F, 6, 2, 1, 0F,0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 1043
		bodyModel[298].setRotationPoint(-33.2F, -32F, 7F);
		bodyModel[298].rotateAngleX = 0.19198622F;

		bodyModel[299].addShapeBox(0.4F, -1.6F, -7.5F, 6, 2, 1, 0F,0F, -0.6F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 1044
		bodyModel[299].setRotationPoint(-33.2F, -32F, 7F);
		bodyModel[299].rotateAngleX = 0.19198622F;

		bodyModel[300].addShapeBox(0.4F, -1.6F, -7.5F, 6, 2, 1, 0F,0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 1045
		bodyModel[300].setRotationPoint(-33.2F, -32F, 7F);
		bodyModel[300].rotateAngleX = 0.19198622F;

		bodyModel[301].addShapeBox(-5.4F, 0F, 8F, 3, 1, 1, 0F,0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Box 1046
		bodyModel[301].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[302].addShapeBox(-5.4F, 0F, 10F, 3, 1, 1, 0F,0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Box 1047
		bodyModel[302].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[303].addShapeBox(-3.2F, 0F, 8F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 1048
		bodyModel[303].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[304].addShapeBox(-5.7F, 0F, 8F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 1049
		bodyModel[304].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[305].addShapeBox(-2.3F, -1F, 9F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 1050
		bodyModel[305].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[306].addShapeBox(-2.3F, -1F, 8F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F); // Box 1087
		bodyModel[306].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[307].addShapeBox(-2.25F, -1F, 8F, 5, 1, 1, 0F,-0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1088
		bodyModel[307].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[308].addShapeBox(-2.25F, -1F, 10.05F, 5, 1, 1, 0F,-0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F); // Box 1089
		bodyModel[308].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[309].addShapeBox(8.75F, 2.8F, 11.9F, 4, 1, 1, 0F,-0.2F, 1.4F, 0.2F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, 1.4F, -0.7F, -0.2F, -1.85F, 0.2F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -1.85F, -0.7F); // Box 1090
		bodyModel[309].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[310].addShapeBox(8.2F, 1.15F, 9.95F, 1, 1, 2, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, -0.75F); // Box 1091
		bodyModel[310].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[311].addShapeBox(12.3F, 2.8F, 11.4F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, 0.25F); // Box 1092
		bodyModel[311].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[312].addShapeBox(8.2F, 1.2F, 6.9F, 1, 1, 2, 0F,-0.25F, -0.2F, -0.75F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 1093
		bodyModel[312].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[313].addShapeBox(8.75F, 1.2F, 6.4F, 4, 1, 1, 0F,-0.2F, -0.2F, -0.25F, -0.2F, -1.8F, 0.2F, -0.2F, -1.8F, -0.7F, -0.2F, -0.2F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, 1.35F, 0.2F, -0.2F, 1.35F, -0.7F, -0.2F, -0.25F, -0.25F); // Box 1094
		bodyModel[313].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[314].addShapeBox(12.3F, 2.8F, 6.45F, 1, 1, 1, 0F,-0.25F, -0.2F, 0.25F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, 0.25F, -0.25F, -0.2F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F); // Box 1095
		bodyModel[314].setRotationPoint(-30.4F, -32.1F, -9.45F);

		bodyModel[315].addShapeBox(0F, 0.2F, 0F, 5, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 1104
		bodyModel[315].setRotationPoint(13.5F, -29.5F, -24F);
		bodyModel[315].rotateAngleX = -0.31415927F;

		bodyModel[316].addShapeBox(0F, 0.2F, 0F, 5, 3, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 1105
		bodyModel[316].setRotationPoint(4.5F, -29.5F, -24F);
		bodyModel[316].rotateAngleX = -0.31415927F;

		bodyModel[317].addShapeBox(0F, 0.2F, 0F, 4, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1106
		bodyModel[317].setRotationPoint(9.5F, -29.5F, -24F);
		bodyModel[317].rotateAngleX = -0.31415927F;

		bodyModel[318].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 1107
		bodyModel[318].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[318].rotateAngleX = 0.31415927F;

		bodyModel[319].addShapeBox(0F, 0F, 0F, 5, 3, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 1108
		bodyModel[319].setRotationPoint(4.5F, -25.25F, 11F);
		bodyModel[319].rotateAngleX = 0.31415927F;

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1109
		bodyModel[320].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[320].rotateAngleX = 0.31415927F;

		bodyModel[321].addShapeBox(7F, 0F, 7F, 3, 3, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 702
		bodyModel[321].setRotationPoint(-11.4F, -28.7F, 9.55F);
		bodyModel[321].rotateAngleY = -0.66322512F;

		bodyModel[322].addShapeBox(7.5F, 0.5F, 9F, 2, 2, 3, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -2.3F, 0F, -0.2F, -2.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 1.7F, 0F, -0.2F, 1.7F, 0F); // Box 703
		bodyModel[322].setRotationPoint(-11.4F, -28.7F, 9.55F);
		bodyModel[322].rotateAngleY = -0.66322512F;

		bodyModel[323].addShapeBox(7.5F, 2.5F, 12F, 2, 2, 3, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 1.8F, 1.8F, 0F, -2.2F, 1.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 1.8F, -2.4F, 0F, -2.2F, -2.4F, 0F); // Box 704
		bodyModel[323].setRotationPoint(-11.4F, -28.7F, 9.55F);
		bodyModel[323].rotateAngleY = -0.66322512F;

		bodyModel[324].addShapeBox(9.5F, 0.4F, 15F, 2, 2, 6, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 2.6F, -0.3F, -1F, -3.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 2.6F, -0.3F, -1F, -3.2F, -0.3F, 0F); // Box 705
		bodyModel[324].setRotationPoint(-11.4F, -28.7F, 9.55F);
		bodyModel[324].rotateAngleY = -0.66322512F;

		bodyModel[325].addShapeBox(0F, -0.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		bodyModel[325].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[325].rotateAngleX = 0.31415927F;

		bodyModel[326].addShapeBox(0F, -0.5F, 10F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 708
		bodyModel[326].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[326].rotateAngleX = 0.31415927F;

		bodyModel[327].addShapeBox(0F, -0.5F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 709
		bodyModel[327].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[327].rotateAngleX = 0.31415927F;

		bodyModel[328].addShapeBox(0F, -0.5F, 6F, 5, 1, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 710
		bodyModel[328].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[328].rotateAngleX = 0.31415927F;

		bodyModel[329].addShapeBox(-9F, -0.5F, 6F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 711
		bodyModel[329].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[329].rotateAngleX = 0.31415927F;

		bodyModel[330].addShapeBox(-9F, -0.5F, 0F, 5, 1, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 712
		bodyModel[330].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[330].rotateAngleX = 0.31415927F;

		bodyModel[331].addShapeBox(5F, -0.5F, 4.5F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		bodyModel[331].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[331].rotateAngleX = 0.31415927F;

		bodyModel[332].addShapeBox(-5F, -0.5F, 4.5F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 714
		bodyModel[332].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[332].rotateAngleX = 0.31415927F;

		bodyModel[333].addShapeBox(0F, 6.4F, -34.6F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		bodyModel[333].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[333].rotateAngleX = -0.31415927F;

		bodyModel[334].addShapeBox(-9F, 6.4F, -34.6F, 5, 1, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 716
		bodyModel[334].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[334].rotateAngleX = -0.31415927F;

		bodyModel[335].addShapeBox(-5F, 6.4F, -30.1F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		bodyModel[335].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[335].rotateAngleX = -0.31415927F;

		bodyModel[336].addShapeBox(-9F, 6.4F, -28.6F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 718
		bodyModel[336].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[336].rotateAngleX = -0.31415927F;

		bodyModel[337].addShapeBox(0F, 6.4F, -24.6F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		bodyModel[337].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[337].rotateAngleX = -0.31415927F;

		bodyModel[338].addShapeBox(0F, 6.4F, -28.6F, 5, 1, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 720
		bodyModel[338].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[338].rotateAngleX = -0.31415927F;

		bodyModel[339].addShapeBox(5F, 6.4F, -30.1F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		bodyModel[339].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[339].rotateAngleX = -0.31415927F;

		bodyModel[340].addShapeBox(0F, 6.4F, -34.6F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 722
		bodyModel[340].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[340].rotateAngleX = -0.31415927F;

		bodyModel[341].addShapeBox(5F, 9.4F, -30.1F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
		bodyModel[341].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[341].rotateAngleX = -0.31415927F;

		bodyModel[342].addShapeBox(0F, 9.4F, -28.6F, 5, 1, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 724
		bodyModel[342].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[342].rotateAngleX = -0.31415927F;

		bodyModel[343].addShapeBox(0F, 9.4F, -24.6F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		bodyModel[343].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[343].rotateAngleX = -0.31415927F;

		bodyModel[344].addShapeBox(-9F, 9.4F, -28.6F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 726
		bodyModel[344].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[344].rotateAngleX = -0.31415927F;

		bodyModel[345].addShapeBox(-5F, 9.4F, -30.1F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		bodyModel[345].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[345].rotateAngleX = -0.31415927F;

		bodyModel[346].addShapeBox(-9F, 9.4F, -34.6F, 5, 1, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 728
		bodyModel[346].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[346].rotateAngleX = -0.31415927F;

		bodyModel[347].addShapeBox(0F, 9.4F, -34.6F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		bodyModel[347].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[347].rotateAngleX = -0.31415927F;

		bodyModel[348].addShapeBox(0F, 9.4F, -34.6F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 730
		bodyModel[348].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[348].rotateAngleX = -0.31415927F;

		bodyModel[349].addShapeBox(0F, 2.5F, 10F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		bodyModel[349].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[349].rotateAngleX = 0.31415927F;

		bodyModel[350].addShapeBox(-9F, 2.5F, 6F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 732
		bodyModel[350].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[350].rotateAngleX = 0.31415927F;

		bodyModel[351].addShapeBox(-5F, 2.5F, 4.5F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[351].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[351].rotateAngleX = 0.31415927F;

		bodyModel[352].addShapeBox(-9F, 2.5F, 0F, 5, 1, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 734
		bodyModel[352].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[352].rotateAngleX = 0.31415927F;

		bodyModel[353].addShapeBox(0F, 2.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		bodyModel[353].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[353].rotateAngleX = 0.31415927F;

		bodyModel[354].addShapeBox(0F, 2.5F, 6F, 5, 1, 10, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 736
		bodyModel[354].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[354].rotateAngleX = 0.31415927F;

		bodyModel[355].addShapeBox(5F, 2.5F, 4.5F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		bodyModel[355].setRotationPoint(9.5F, -25.25F, 11F);
		bodyModel[355].rotateAngleX = 0.31415927F;

		bodyModel[356].addShapeBox(0F, 2.5F, 0F, 5, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 738
		bodyModel[356].setRotationPoint(13.5F, -25.25F, 11F);
		bodyModel[356].rotateAngleX = 0.31415927F;

		bodyModel[357].addShapeBox(-2F, 2.77555756156289E-17F, -36.9F, 2, 2, 6, 0F,-3.2F, -0.3F, 0F, 2.6F, -0.3F, -1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -3.2F, -0.3F, 0F, 2.6F, -0.3F, -1F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 739
		bodyModel[357].setRotationPoint(-11.4F, -28.7F, 9.55F);
		bodyModel[357].rotateAngleY = 0.66322512F;

		bodyModel[358].addShapeBox(-4F, 2.1F, -30.9F, 2, 2, 3, 0F,-2.2F, 1.8F, 0F, 1.8F, 1.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -2.2F, -2.4F, 0F, 1.8F, -2.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 740
		bodyModel[358].setRotationPoint(-11.4F, -28.7F, 9.55F);
		bodyModel[358].rotateAngleY = 0.66322512F;

		bodyModel[359].addShapeBox(-4F, 0.1F, -27.9F, 2, 2, 3, 0F,-0.2F, -2.3F, 0F, -0.2F, -2.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 1.7F, 0F, -0.2F, 1.7F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 741
		bodyModel[359].setRotationPoint(-11.4F, -28.7F, 9.55F);
		bodyModel[359].rotateAngleY = 0.66322512F;

		bodyModel[360].addShapeBox(-4.5F, 0F, -24.9F, 3, 3, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 742
		bodyModel[360].setRotationPoint(-11.4F, -28.7F, 9.55F);
		bodyModel[360].rotateAngleY = 0.66322512F;

		bodyModel[361].addShapeBox(0F, 0F, 9F, 3, 3, 1, 0F,0F, -0.3F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -2.4F, -0.2F, 0F, -2.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 744
		bodyModel[361].setRotationPoint(20.6F, -28.7F, -9.45F);

		bodyModel[362].addShapeBox(2.2F, -0.3F, 3.5F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		bodyModel[362].setRotationPoint(20.6F, -28.7F, -9.45F);

		bodyModel[363].addShapeBox(1.2F, -0.3F, 2.5F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[363].setRotationPoint(20.6F, -28.7F, -9.45F);

		bodyModel[364].addShapeBox(-2.8F, -0.3F, 2.5F, 4, 1, 1, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 747
		bodyModel[364].setRotationPoint(20.6F, -28.7F, -9.45F);

		bodyModel[365].addShapeBox(-5.8F, 0.2F, 3.5F, 3, 1, 1, 0F,0F, -0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 1F, 0F, 0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 1F); // Box 748
		bodyModel[365].setRotationPoint(20.6F, -28.7F, -9.45F);

		bodyModel[366].addShapeBox(-5.8F, 0.2F, 14.5F, 3, 1, 1, 0F,0F, -0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -1F, 0F, 0.1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -1F); // Box 749
		bodyModel[366].setRotationPoint(20.6F, -28.7F, -9.45F);

		bodyModel[367].addShapeBox(1.2F, -0.3F, 15.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[367].setRotationPoint(20.6F, -28.7F, -9.45F);

		bodyModel[368].addShapeBox(-2.8F, -0.3F, 15.5F, 4, 1, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Box 751
		bodyModel[368].setRotationPoint(20.6F, -28.7F, -9.45F);

		bodyModel[369].addShapeBox(0.1F, -0.2F, 6F, 2, 8, 2, 0F,-0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 752
		bodyModel[369].setRotationPoint(-11.4F, -28.7F, 9.55F);

		bodyModel[370].addShapeBox(0.1F, 0F, 6F, 2, 7, 2, 0F,-0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F); // Box 753
		bodyModel[370].setRotationPoint(-11.4F, -30F, 9.55F);

		bodyModel[371].addShapeBox(0.1F, -0.2F, -1F, 2, 8, 2, 0F,-0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 754
		bodyModel[371].setRotationPoint(-11.4F, -28.7F, -16.45F);

		bodyModel[372].addShapeBox(0.1F, 0F, -1F, 2, 7, 2, 0F,-0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F); // Box 755
		bodyModel[372].setRotationPoint(-11.4F, -30F, -16.45F);

		bodyModel[373].addShapeBox(0.1F, -0.2F, -1F, 2, 10, 2, 0F,-0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 756
		bodyModel[373].setRotationPoint(17.9F, -28.7F, 0F);

		bodyModel[374].addShapeBox(0.1F, 0F, -1F, 2, 7, 2, 0F,-0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F); // Box 757
		bodyModel[374].setRotationPoint(17.9F, -30F, 0F);

		bodyModel[375].addShapeBox(0.1F, -0.1F, 6F, 4, 1, 4, 0F,-0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 758
		bodyModel[375].setRotationPoint(-12.4F, -22F, 8.55F);

		bodyModel[376].addShapeBox(-1.9F, -0.2F, -2F, 4, 1, 4, 0F,-0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 759
		bodyModel[376].setRotationPoint(-10.4F, -21.9F, -16.45F);

		bodyModel[377].addShapeBox(-1.9F, -0.2F, -2F, 4, 1, 4, 0F,-0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 760
		bodyModel[377].setRotationPoint(19F, -19.4F, 0F);

		bodyModel[378].addShapeBox(-15F, -15F, -2F, 30, 30, 2, 0F,-11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F); // Box 761
		bodyModel[378].setRotationPoint(-4F, -13.2F, 26F);

		bodyModel[379].addShapeBox(-15F, -15F, -2F, 30, 30, 2, 0F,-11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F, -11F, -11F, -0.3F); // Box 762
		bodyModel[379].setRotationPoint(-4F, -13.2F, -23.8F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 746
		turretModel[1] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 747
		turretModel[2] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 748
		turretModel[3] = new ModelRendererTurbo(this, 89, 281, textureX, textureY); // Box 749
		turretModel[4] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 750
		turretModel[5] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Box 751
		turretModel[6] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 752
		turretModel[7] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 753
		turretModel[8] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 754
		turretModel[9] = new ModelRendererTurbo(this, 185, 241, textureX, textureY); // Box 755
		turretModel[10] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 756
		turretModel[11] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); // Box 757
		turretModel[12] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Box 758
		turretModel[13] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 759
		turretModel[14] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Box 760
		turretModel[15] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 761
		turretModel[16] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 762
		turretModel[17] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 763
		turretModel[18] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 764
		turretModel[19] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Box 766
		turretModel[20] = new ModelRendererTurbo(this, 449, 289, textureX, textureY); // Box 767
		turretModel[21] = new ModelRendererTurbo(this, 481, 289, textureX, textureY); // Box 768
		turretModel[22] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 769
		turretModel[23] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 770
		turretModel[24] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 771
		turretModel[25] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 772
		turretModel[26] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 773
		turretModel[27] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 774
		turretModel[28] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 775
		turretModel[29] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Box 776
		turretModel[30] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 777
		turretModel[31] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 779
		turretModel[32] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 780
		turretModel[33] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 781
		turretModel[34] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 782
		turretModel[35] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 783
		turretModel[36] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 784
		turretModel[37] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 785
		turretModel[38] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 786
		turretModel[39] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 787
		turretModel[40] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 788
		turretModel[41] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Box 789
		turretModel[42] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 790
		turretModel[43] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 791
		turretModel[44] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 792
		turretModel[45] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 793
		turretModel[46] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 954
		turretModel[47] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Box 955
		turretModel[48] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Box 956
		turretModel[49] = new ModelRendererTurbo(this, 489, 313, textureX, textureY); // Box 994
		turretModel[50] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Box 995
		turretModel[51] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 996
		turretModel[52] = new ModelRendererTurbo(this, 241, 313, textureX, textureY); // Box 997
		turretModel[53] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Box 998
		turretModel[54] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 999
		turretModel[55] = new ModelRendererTurbo(this, 289, 313, textureX, textureY); // Box 1000
		turretModel[56] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 1001
		turretModel[57] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 1002
		turretModel[58] = new ModelRendererTurbo(this, 17, 321, textureX, textureY); // Box 1003
		turretModel[59] = new ModelRendererTurbo(this, 209, 321, textureX, textureY); // Box 1004
		turretModel[60] = new ModelRendererTurbo(this, 297, 329, textureX, textureY); // Box 1005
		turretModel[61] = new ModelRendererTurbo(this, 313, 329, textureX, textureY); // Box 1006
		turretModel[62] = new ModelRendererTurbo(this, 329, 329, textureX, textureY); // Box 1007
		turretModel[63] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 1008
		turretModel[64] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 1009
		turretModel[65] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 1010
		turretModel[66] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 1011
		turretModel[67] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 1012
		turretModel[68] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 1013
		turretModel[69] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 1014
		turretModel[70] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 1015
		turretModel[71] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 1016
		turretModel[72] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 1017
		turretModel[73] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 1018
		turretModel[74] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 1019
		turretModel[75] = new ModelRendererTurbo(this, 505, 289, textureX, textureY); // Box 1020
		turretModel[76] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Box 1021
		turretModel[77] = new ModelRendererTurbo(this, 129, 289, textureX, textureY); // Box 1022
		turretModel[78] = new ModelRendererTurbo(this, 121, 297, textureX, textureY); // Box 1023
		turretModel[79] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Box 1024
		turretModel[80] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 1025
		turretModel[81] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Box 1026
		turretModel[82] = new ModelRendererTurbo(this, 369, 297, textureX, textureY); // Box 1027
		turretModel[83] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Box 1028
		turretModel[84] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 1029
		turretModel[85] = new ModelRendererTurbo(this, 241, 313, textureX, textureY); // Box 1030
		turretModel[86] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 1031
		turretModel[87] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 1032
		turretModel[88] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 1033
		turretModel[89] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 1051
		turretModel[90] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 1052
		turretModel[91] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Box 1053
		turretModel[92] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Box 1054
		turretModel[93] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 1055
		turretModel[94] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 1056
		turretModel[95] = new ModelRendererTurbo(this, 449, 329, textureX, textureY); // Box 1057
		turretModel[96] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 1058
		turretModel[97] = new ModelRendererTurbo(this, 33, 337, textureX, textureY); // Box 1059
		turretModel[98] = new ModelRendererTurbo(this, 65, 337, textureX, textureY); // Box 1060
		turretModel[99] = new ModelRendererTurbo(this, 409, 329, textureX, textureY); // Box 1061
		turretModel[100] = new ModelRendererTurbo(this, 417, 329, textureX, textureY); // Box 1062
		turretModel[101] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 1063
		turretModel[102] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 1064
		turretModel[103] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 1067
		turretModel[104] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 1068
		turretModel[105] = new ModelRendererTurbo(this, 473, 329, textureX, textureY); // Box 1069
		turretModel[106] = new ModelRendererTurbo(this, 505, 329, textureX, textureY); // Box 1070
		turretModel[107] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 1071
		turretModel[108] = new ModelRendererTurbo(this, 25, 337, textureX, textureY); // Box 1072
		turretModel[109] = new ModelRendererTurbo(this, 33, 337, textureX, textureY); // Box 1073
		turretModel[110] = new ModelRendererTurbo(this, 57, 337, textureX, textureY); // Box 1074
		turretModel[111] = new ModelRendererTurbo(this, 65, 337, textureX, textureY); // Box 1075
		turretModel[112] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 1076
		turretModel[113] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 1077
		turretModel[114] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 1078
		turretModel[115] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Box 1079
		turretModel[116] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 1080
		turretModel[117] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 1081
		turretModel[118] = new ModelRendererTurbo(this, 489, 329, textureX, textureY); // Box 1082
		turretModel[119] = new ModelRendererTurbo(this, 121, 337, textureX, textureY); // Box 1083
		turretModel[120] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 1084
		turretModel[121] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 1085
		turretModel[122] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 1086

		turretModel[0].addShapeBox(-0.2F, 0F, -8F, 3, 3, 16, 0F,-0.2F, -0.2F, 0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0.5F); // Box 746
		turretModel[0].setRotationPoint(0.4F, -30.5F, 0.0499999999999998F);

		turretModel[1].addShapeBox(2.6F, 0F, -8F, 3, 3, 16, 0F,-0.2F, -0.2F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, -0.2F, -0.2F, 0F); // Box 747
		turretModel[1].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[2].addShapeBox(5.4F, 0F, -8F, 2, 3, 16, 0F,-0.2F, -0.2F, -1.5F, 0F, -0.2F, -3.5F, 0F, -0.2F, -3.5F, -0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1.5F, 0F, -0.2F, -3.5F, 0F, -0.2F, -3.5F, -0.2F, -0.2F, -1.5F); // Box 748
		turretModel[2].setRotationPoint(0.4F, -30.5F, 0.0499999999999998F);

		turretModel[3].addShapeBox(7.2F, 0F, -8F, 1, 3, 16, 0F,-0.2F, -0.2F, -3.5F, 0.2F, -0.2F, -7F, 0.2F, -0.2F, -7F, -0.2F, -0.2F, -3.5F, -0.2F, -0.2F, -3.5F, 0.2F, -0.2F, -7F, 0.2F, -0.2F, -7F, -0.2F, -0.2F, -3.5F); // Box 749
		turretModel[3].setRotationPoint(0.4F, -30.5F, 0.0499999999999998F);

		turretModel[4].addShapeBox(-2.8F, 0F, -8F, 3, 3, 16, 0F,0F, -0.2F, 0F, -0.2F, -0.2F, 0.6F, -0.2F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0.6F, -0.2F, -0.2F, 0.5F, 0F, -0.2F, 0F); // Box 750
		turretModel[4].setRotationPoint(0.4F, -30.5F, 0.0499999999999998F);

		turretModel[5].addShapeBox(-5.6F, 0F, -8F, 3, 3, 16, 0F,0F, -0.2F, -1.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, -1.5F); // Box 751
		turretModel[5].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[6].addShapeBox(-7.4F, 0F, -8F, 2, 3, 16, 0F,0F, -0.2F, -3.5F, -0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1.5F, 0F, -0.2F, -3.5F, 0F, -0.2F, -3.5F, -0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1.5F, 0F, -0.2F, -3.5F); // Box 752
		turretModel[6].setRotationPoint(0.4F, -30.5F, 0.0499999999999998F);

		turretModel[7].addShapeBox(-8.2F, 0F, -8F, 1, 3, 16, 0F,0.2F, -0.2F, -7F, -0.2F, -0.2F, -3.5F, -0.2F, -0.2F, -3.5F, 0.2F, -0.2F, -7F, 0.2F, -0.2F, -7F, -0.2F, -0.2F, -3.5F, -0.2F, -0.2F, -3.5F, 0.2F, -0.2F, -7F); // Box 753
		turretModel[7].setRotationPoint(0.4F, -30.5F, 0.0499999999999998F);

		turretModel[8].addShapeBox(-4.5F, -2.5F, -5.2F, 12, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 2F, 0F, -0.1F); // Box 754
		turretModel[8].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[9].addShapeBox(-4.5F, -2.5F, 4.2F, 12, 3, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 2F, 0F, -0.1F); // Box 755
		turretModel[9].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[10].addShapeBox(-4.5F, -4.5F, -5.2F, 12, 2, 1, 0F,-0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 756
		turretModel[10].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[11].addShapeBox(-4.5F, -6.5F, -5.2F, 12, 2, 1, 0F,-0.3F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 757
		turretModel[11].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[12].addShapeBox(-4.5F, -8.3F, -5.2F, 12, 2, 1, 0F,0.55F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0.55F, -0.3F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 758
		turretModel[12].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[13].addShapeBox(-4.5F, -10F, -5.2F, 12, 2, 1, 0F,0.55F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.55F, -0.25F, -0.1F, 0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F); // Box 759
		turretModel[13].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[14].addShapeBox(-4.5F, -10F, 4.2F, 12, 2, 1, 0F,0.55F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0.55F, -0.25F, -0.1F, 0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F); // Box 760
		turretModel[14].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[15].addShapeBox(-4.5F, -4.5F, 4.2F, 12, 2, 1, 0F,-0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 761
		turretModel[15].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[16].addShapeBox(-4.5F, -6.5F, 4.2F, 12, 2, 1, 0F,-0.3F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 762
		turretModel[16].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[17].addShapeBox(-4.5F, -8.3F, 4.2F, 12, 2, 1, 0F,0.55F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0.55F, -0.3F, -0.1F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F); // Box 763
		turretModel[17].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[18].addShapeBox(-4.5F, -10F, -4.4F, 4, 2, 9, 0F,0.55F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.3F, 0.55F, -0.25F, -0.3F, 0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0.55F, 0F, -0.3F); // Box 764
		turretModel[18].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[19].addShapeBox(-4.5F, -8.3F, -4.4F, 4, 2, 9, 0F,0.55F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.3F, 0.55F, -0.25F, -0.3F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F); // Box 766
		turretModel[19].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[20].addShapeBox(-4.5F, -6.6F, -4.4F, 4, 2, 9, 0F,-0.9F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.3F, -0.9F, -0.25F, -0.3F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F); // Box 767
		turretModel[20].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[21].addShapeBox(-4.5F, -4.85F, -4.4F, 4, 2, 9, 0F,-0.9F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.3F, -0.9F, -0.25F, -0.3F, -0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, -0.8F, 0F, -0.3F); // Box 768
		turretModel[21].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[22].addShapeBox(-4.5F, -3.1F, -4.4F, 4, 4, 9, 0F,-0.8F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.3F, -0.8F, -0.25F, -0.3F, 0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 769
		turretModel[22].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[23].addShapeBox(7.5F, -4.5F, -5.2F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 770
		turretModel[23].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[24].addShapeBox(7.5F, -12.6F, -5.2F, 1, 2, 1, 0F,0F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 771
		turretModel[24].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[25].addShapeBox(7.5F, -6.2F, -5.2F, 1, 2, 1, 0F,0F, 0F, -0.1F, 1.5F, 0F, -0.1F, 1.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 772
		turretModel[25].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[26].addShapeBox(7.5F, -10.9F, -5.2F, 1, 2, 1, 0F,0F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, -0.1F, 1.5F, 0F, -0.1F, 1.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 773
		turretModel[26].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[27].addShapeBox(7.5F, -9.2F, -5.2F, 1, 2, 1, 0F,0F, -0.3F, -0.1F, 1.5F, -0.3F, -0.1F, 1.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.1F, 1.7F, -0.4F, -0.1F, 1.7F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 774
		turretModel[27].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[28].addShapeBox(7.5F, -7.9F, -5.2F, 1, 2, 1, 0F,0F, -0.3F, -0.1F, 1.7F, -0.3F, -0.1F, 1.7F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 1.5F, -0.3F, -0.1F, 1.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 775
		turretModel[28].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[29].addShapeBox(0.7F, -12.6F, -5.2F, 7, 2, 1, 0F,-0.9F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, 0.8F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0.8F, 0F, -0.1F); // Box 776
		turretModel[29].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[30].addShapeBox(0.7F, -10.9F, -5.2F, 7, 1, 1, 0F,0.8F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 1.3F, 0.15F, -0.1F, -0.2F, 0.15F, -0.1F, -0.2F, 0.15F, -0.1F, 1.3F, 0.15F, -0.1F); // Box 777
		turretModel[30].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[31].addShapeBox(0.7F, -13.3F, -5.2F, 7, 1, 1, 0F,-2.9F, -0.2F, -0.1F, -2.2F, -0.2F, -0.1F, -2.2F, -0.2F, -0.1F, -2.9F, -0.2F, -0.1F, -0.9F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.9F, 0F, -0.1F); // Box 779
		turretModel[31].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[32].addShapeBox(0.7F, -13.3F, 4.2F, 7, 1, 1, 0F,-2.9F, -0.2F, -0.1F, -2.2F, -0.2F, -0.1F, -2.2F, -0.2F, -0.1F, -2.9F, -0.2F, -0.1F, -0.9F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.9F, 0F, -0.1F); // Box 780
		turretModel[32].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[33].addShapeBox(0.7F, -12.6F, 4.2F, 7, 2, 1, 0F,-0.9F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, 0.8F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0.8F, 0F, -0.1F); // Box 781
		turretModel[33].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[34].addShapeBox(0.7F, -10.9F, 4.2F, 7, 1, 1, 0F,0.8F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 1.3F, 0.15F, -0.1F, -0.2F, 0.15F, -0.1F, -0.2F, 0.15F, -0.1F, 1.3F, 0.15F, -0.1F); // Box 782
		turretModel[34].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[35].addShapeBox(7.5F, -12.6F, 4.2F, 1, 2, 1, 0F,0F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 783
		turretModel[35].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[36].addShapeBox(7.5F, -9.2F, 4.2F, 1, 2, 1, 0F,0F, -0.3F, -0.1F, 1.5F, -0.3F, -0.1F, 1.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.4F, -0.1F, 1.7F, -0.4F, -0.1F, 1.7F, -0.4F, -0.1F, 0F, -0.4F, -0.1F); // Box 784
		turretModel[36].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[37].addShapeBox(7.5F, -10.9F, 4.2F, 1, 2, 1, 0F,0F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, 0F, -0.1F, 1.5F, 0F, -0.1F, 1.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 785
		turretModel[37].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[38].addShapeBox(7.5F, -7.9F, 4.2F, 1, 2, 1, 0F,0F, -0.3F, -0.1F, 1.7F, -0.3F, -0.1F, 1.7F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 1.5F, -0.3F, -0.1F, 1.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 786
		turretModel[38].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[39].addShapeBox(7.5F, -6.2F, 4.2F, 1, 2, 1, 0F,0F, 0F, -0.1F, 1.5F, 0F, -0.1F, 1.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 787
		turretModel[39].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[40].addShapeBox(7.5F, -4.5F, 4.2F, 1, 2, 1, 0F,0F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, -0.9F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 788
		turretModel[40].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[41].addShapeBox(-6.6F, 0F, -9.5F, 13, 1, 19, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F); // Box 789
		turretModel[41].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[42].addShapeBox(6F, -1F, -9.5F, 1, 2, 5, 0F,-0.5F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 790
		turretModel[42].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[43].addShapeBox(6F, -1F, 4.5F, 1, 2, 5, 0F,-0.5F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 791
		turretModel[43].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[44].addShapeBox(6.2F, -3F, 4.5F, 1, 2, 5, 0F,-0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 792
		turretModel[44].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[45].addShapeBox(6.2F, -3F, -9.5F, 1, 2, 5, 0F,-0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 793
		turretModel[45].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[46].addShapeBox(8.4F, -1.2F, -7.4F, 6, 2, 1, 0F,0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 954
		turretModel[46].setRotationPoint(4.8F, -38F, 4.45F);
		turretModel[46].rotateAngleX = 0.19198622F;

		turretModel[47].addShapeBox(8.4F, -1.6F, -7.4F, 6, 2, 1, 0F,0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 955
		turretModel[47].setRotationPoint(4.8F, -38F, 4.45F);
		turretModel[47].rotateAngleX = 0.19198622F;

		turretModel[48].addShapeBox(8.4F, -1.2F, -7.4F, 6, 2, 1, 0F,0F, -0.6F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 956
		turretModel[48].setRotationPoint(4.8F, -38F, 4.45F);
		turretModel[48].rotateAngleX = 0.19198622F;

		turretModel[49].addShapeBox(-5F, -14.6F, -4.4F, 1, 5, 9, 0F,-3.3F, -0.25F, -0.1F, 2.7F, -0.25F, -0.1F, 2.7F, -0.25F, -0.3F, -3.3F, -0.25F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 994
		turretModel[49].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[50].addShapeBox(-4.6F, -14.6F, -4.4F, 1, 5, 1, 0F,-3.3F, -0.25F, -0.1F, 3F, -0.25F, -0.1F, 3F, -0.25F, -0.7F, -3.3F, -0.25F, -0.7F, -0.3F, 0F, -0.1F, 3F, 0F, -0.1F, 3F, 0F, -0.7F, -0.3F, 0F, -0.7F); // Box 995
		turretModel[50].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[51].addShapeBox(-4.6F, -14.6F, 4F, 1, 5, 1, 0F,-3.3F, -0.25F, -0.1F, 3F, -0.25F, -0.1F, 3F, -0.25F, -0.7F, -3.3F, -0.25F, -0.7F, -0.3F, 0F, -0.1F, 3F, 0F, -0.1F, 3F, 0F, -0.7F, -0.3F, 0F, -0.7F); // Box 996
		turretModel[51].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[52].addShapeBox(-2F, -15.35F, -3.4F, 1, 1, 7, 0F,-0.6F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.3F, -0.6F, -0.5F, -0.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 997
		turretModel[52].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[53].addShapeBox(-8F, -10F, -1F, 3, 2, 2, 0F,0.55F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.3F, 0.55F, -0.25F, -0.3F, 0.3F, -1.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0.3F, -1.2F, -0.3F); // Box 998
		turretModel[53].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[54].addShapeBox(-8.3F, -7.75F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F); // Box 999
		turretModel[54].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[55].addShapeBox(-6F, -4.4F, 16.5F, 2, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.1F, 0F, 0.2F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F, -0.1F, 0F); // Box 1000
		turretModel[55].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[56].addShapeBox(-3.6F, -5.6F, 16.5F, 2, 1, 3, 0F,0.2F, -0.2F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.1F, 0F, 0.6F, -0.6F, 0F, 0.6F, -0.6F, 0F, 0.2F, -0.1F, 0F); // Box 1001
		turretModel[56].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[57].addShapeBox(-0.4F, -5.6F, 16.5F, 2, 1, 3, 0F,0.6F, 0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.6F, 0.3F, 0F, 0.6F, -0.6F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.6F, -0.6F, 0F); // Box 1002
		turretModel[57].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[58].addShapeBox(2F, -4.4F, 16.5F, 2, 1, 3, 0F,0.2F, 1F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 1F, 0F, 0.2F, -1.3F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -1.3F, 0F); // Box 1003
		turretModel[58].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[59].addShapeBox(2F, -4.4F, -19.5F, 2, 1, 3, 0F,0.2F, 1F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 1F, 0F, 0.2F, -1.3F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -1.3F, 0F); // Box 1004
		turretModel[59].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[60].addShapeBox(-0.4F, -5.6F, -19.5F, 2, 1, 3, 0F,0.6F, 0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.6F, 0.3F, 0F, 0.6F, -0.6F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.6F, -0.6F, 0F); // Box 1005
		turretModel[60].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[61].addShapeBox(-3.6F, -5.6F, -19.5F, 2, 1, 3, 0F,0.2F, -0.2F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.1F, 0F, 0.6F, -0.6F, 0F, 0.6F, -0.6F, 0F, 0.2F, -0.1F, 0F); // Box 1006
		turretModel[61].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[62].addShapeBox(-6F, -4.4F, -19.5F, 2, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.1F, 0F, 0.2F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F, -0.1F, 0F); // Box 1007
		turretModel[62].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[63].addShapeBox(-0.4F, -5.9F, 17.7F, 2, 1, 1, 0F,0.6F, 0.3F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.6F, 0.3F, -0.3F, 0.6F, -0.6F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.6F, -0.6F, -0.3F); // Box 1008
		turretModel[63].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[64].addShapeBox(-3.6F, -5.9F, 17.7F, 2, 1, 1, 0F,0.2F, -0.2F, -0.3F, 0.6F, 0.3F, -0.3F, 0.6F, 0.3F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.1F, -0.3F, 0.6F, -0.6F, -0.3F, 0.6F, -0.6F, -0.3F, 0.2F, -0.1F, -0.3F); // Box 1009
		turretModel[64].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[65].addShapeBox(2F, -4.7F, 17.7F, 2, 1, 1, 0F,0.2F, 1F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.2F, 1F, -0.3F, 0.2F, -1.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -1.3F, -0.3F); // Box 1010
		turretModel[65].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[66].addShapeBox(-6F, -4.7F, 17.7F, 2, 1, 1, 0F,0F, -0.2F, -0.3F, 0.2F, 1F, -0.3F, 0.2F, 1F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -1.3F, -0.3F, 0.2F, -1.3F, -0.3F, 0F, -0.1F, -0.3F); // Box 1011
		turretModel[66].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[67].addShapeBox(-6F, -4.7F, -18.7F, 2, 1, 1, 0F,0F, -0.2F, -0.3F, 0.2F, 1F, -0.3F, 0.2F, 1F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -1.3F, -0.3F, 0.2F, -1.3F, -0.3F, 0F, -0.1F, -0.3F); // Box 1012
		turretModel[67].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[68].addShapeBox(-0.4F, -5.9F, -18.7F, 2, 1, 1, 0F,0.6F, 0.3F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.6F, 0.3F, -0.3F, 0.6F, -0.6F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.6F, -0.6F, -0.3F); // Box 1013
		turretModel[68].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[69].addShapeBox(-3.6F, -5.9F, -18.7F, 2, 1, 1, 0F,0.2F, -0.2F, -0.3F, 0.6F, 0.3F, -0.3F, 0.6F, 0.3F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.1F, -0.3F, 0.6F, -0.6F, -0.3F, 0.6F, -0.6F, -0.3F, 0.2F, -0.1F, -0.3F); // Box 1014
		turretModel[69].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[70].addShapeBox(2F, -4.7F, -18.7F, 2, 1, 1, 0F,0.2F, 1F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0.2F, 1F, -0.3F, 0.2F, -1.3F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.2F, -1.3F, -0.3F); // Box 1015
		turretModel[70].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[71].addShapeBox(-6F, -5F, 13.7F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1016
		turretModel[71].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[72].addShapeBox(3F, -5F, 13.7F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1017
		turretModel[72].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[73].addShapeBox(3F, -5F, 17.7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1018
		turretModel[73].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[74].addShapeBox(-6F, -5F, 17.7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1019
		turretModel[74].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[75].addShapeBox(-6F, -4.7F, 13F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F); // Box 1020
		turretModel[75].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[76].addShapeBox(3F, -4.7F, 13F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 4F, 0F, 0.7F, -4.6F, 0F, 0.7F, -4.6F, 0F, -1.3F, 4F, 0F, -1.3F); // Box 1021
		turretModel[76].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[77].addShapeBox(-6F, -1F, 8.7F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1022
		turretModel[77].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[78].addShapeBox(-1.3F, -1F, 8.7F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1023
		turretModel[78].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[79].addShapeBox(-6F, -0.7F, 8.7F, 6, 1, 1, 0F,0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F); // Box 1024
		turretModel[79].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[80].addShapeBox(-1.3F, -1F, -12.7F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1025
		turretModel[80].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[81].addShapeBox(-6F, -0.7F, -9.8F, 6, 1, 1, 0F,0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F); // Box 1026
		turretModel[81].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[82].addShapeBox(-6F, -1F, -12.7F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1027
		turretModel[82].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[83].addShapeBox(-6F, -4.7F, -13F, 1, 4, 1, 0F,-0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 1028
		turretModel[83].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[84].addShapeBox(-6F, -5F, -18.3F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1029
		turretModel[84].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[85].addShapeBox(-1.3F, -4.7F, -13F, 1, 4, 1, 0F,-4.6F, 0F, 0.7F, 4F, 0F, 0.7F, 4F, 0F, -1.3F, -4.6F, 0F, -1.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 1030
		turretModel[85].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[86].addShapeBox(3F, -5F, -18.3F, 1, 1, 5, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1031
		turretModel[86].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[87].addShapeBox(-6F, -5F, -18.7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1032
		turretModel[87].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[88].addShapeBox(3F, -5F, -18.7F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1033
		turretModel[88].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[89].addShapeBox(-6F, -0.4F, 7.5F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 1051
		turretModel[89].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[90].addShapeBox(-13F, -1.4F, 7.5F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 1052
		turretModel[90].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[91].addShapeBox(-11F, -1.4F, 7.5F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F); // Box 1053
		turretModel[91].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[92].addShapeBox(-11F, -1.4F, -8.5F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -1.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F); // Box 1054
		turretModel[92].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[93].addShapeBox(-13F, -1.4F, -8.5F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 1055
		turretModel[93].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[94].addShapeBox(-6F, -0.4F, -8.5F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 1056
		turretModel[94].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[95].addShapeBox(-12F, -1.8F, -12.5F, 5, 1, 10, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F); // Box 1057
		turretModel[95].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[96].addShapeBox(-15F, -1.8F, -12.5F, 3, 1, 10, 0F,0F, -0.3F, -3.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -3.3F, 0F, -0.3F, -3.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -3.3F); // Box 1058
		turretModel[96].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[97].addShapeBox(-12F, -1.8F, 2.75F, 5, 1, 10, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F); // Box 1059
		turretModel[97].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[98].addShapeBox(-15F, -1.8F, 2.75F, 3, 1, 10, 0F,0F, -0.3F, -3.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -3.3F, 0F, -0.3F, -3.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -3.3F); // Box 1060
		turretModel[98].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[99].addShapeBox(-12F, -5F, 3F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1061
		turretModel[99].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[100].addShapeBox(-10.5F, -4.4F, 11.2F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1062
		turretModel[100].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[101].addShapeBox(-10.5F, -5.4F, 11.2F, 1, 1, 1, 0F,0.8F, 0F, 0.3F, -1.2F, 0F, 0.3F, -1.2F, 0F, -0.7F, 0.8F, 0F, -1.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1063
		turretModel[101].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[102].addShapeBox(-12F, -6F, 3F, 1, 1, 1, 0F,0.8F, 0F, -1.3F, -1.2F, 0F, -0.7F, -1.2F, 0F, 0.3F, 0.8F, 0F, 0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1064
		turretModel[102].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[103].addShapeBox(-14.7F, -5.7F, 10.7F, 4, 1, 1, 0F,0F, 0.7F, 1.8F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0.7F, -2.3F, 0F, -1.3F, 1.8F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -1.3F, -2.3F); // Box 1067
		turretModel[103].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[104].addShapeBox(-14.7F, -6.3F, 4.2F, 2, 1, 1, 0F,0F, 0.7F, -2.2F, 0.5F, -0.3F, 0.55F, 0.5F, -0.3F, -1F, 0F, 0.7F, 1.8F, 0F, -1.3F, -2.2F, 0.5F, -0.3F, 0.55F, 0.5F, -0.3F, -1F, 0F, -1.3F, 1.8F); // Box 1068
		turretModel[104].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[105].addShapeBox(-15F, -6.7F, 6.4F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.5F, 0.3F, -0.3F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1069
		turretModel[105].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[106].addShapeBox(-15F, -8.4F, 8.7F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1070
		turretModel[106].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[107].addShapeBox(-15F, -8.4F, 6.2F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1071
		turretModel[107].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[108].addShapeBox(-15F, -11.4F, 6.8F, 1, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1072
		turretModel[108].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[109].addShapeBox(-15F, -11.4F, 8.4F, 1, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.4F, 0F, -0.2F, -1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.4F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 1073
		turretModel[109].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[110].addShapeBox(-15F, -11.4F, 5.2F, 1, 3, 2, 0F,-1F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1074
		turretModel[110].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[111].addShapeBox(-15F, -11.4F, -10.1F, 1, 3, 2, 0F,-1F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1075
		turretModel[111].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[112].addShapeBox(-15F, -11.4F, -8.5F, 1, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1076
		turretModel[112].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[113].addShapeBox(-15F, -11.4F, -6.9F, 1, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.4F, 0F, -0.2F, -1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.4F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 1077
		turretModel[113].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[114].addShapeBox(-15F, -8.4F, -9.1F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1078
		turretModel[114].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[115].addShapeBox(-15F, -8.4F, -6.6F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1079
		turretModel[115].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[116].addShapeBox(-14.7F, -5.7F, -11.6F, 4, 1, 1, 0F,0F, 0.7F, -2.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0.7F, 1.8F, 0F, -1.3F, -2.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -1.3F, 1.8F); // Box 1080
		turretModel[116].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[117].addShapeBox(-10.5F, -5.4F, -12.1F, 1, 1, 1, 0F,0.8F, 0F, -1.1F, -1.2F, 0F, -0.7F, -1.2F, 0F, 0.3F, 0.8F, 0F, 0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1081
		turretModel[117].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[118].addShapeBox(-10.5F, -4.4F, -12.1F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1082
		turretModel[118].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[119].addShapeBox(-15F, -6.7F, -8.9F, 1, 1, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.5F, 0.3F, -0.3F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 1083
		turretModel[119].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[120].addShapeBox(-14.7F, -5.7F, -4.8F, 2, 1, 1, 0F,0F, 0.7F, 1.8F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, 0.55F, 0F, 0.7F, -2.2F, 0F, -1.3F, 1.8F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, 0.55F, 0F, -1.3F, -2.2F); // Box 1084
		turretModel[120].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[121].addShapeBox(-12F, -5.4F, -3.6F, 1, 1, 1, 0F,0.8F, 0F, 0.3F, -1.2F, 0F, 0.3F, -1.2F, 0F, -0.7F, 0.8F, 0F, -1.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1085
		turretModel[121].setRotationPoint(0.4F, -30.5F, 0.05F);

		turretModel[122].addShapeBox(-12F, -4.4F, -3.6F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1086
		turretModel[122].setRotationPoint(0.4F, -30.5F, 0.05F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 859
		barrelModel[1] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Box 860
		barrelModel[2] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 861
		barrelModel[3] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 862
		barrelModel[4] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 863
		barrelModel[5] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 864
		barrelModel[6] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Box 865
		barrelModel[7] = new ModelRendererTurbo(this, 113, 289, textureX, textureY); // Box 866
		barrelModel[8] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Box 867
		barrelModel[9] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Box 868
		barrelModel[10] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 869
		barrelModel[11] = new ModelRendererTurbo(this, 353, 297, textureX, textureY); // Box 870
		barrelModel[12] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Box 871
		barrelModel[13] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 872
		barrelModel[14] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 873
		barrelModel[15] = new ModelRendererTurbo(this, 25, 305, textureX, textureY); // Box 874
		barrelModel[16] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 875
		barrelModel[17] = new ModelRendererTurbo(this, 73, 305, textureX, textureY); // Box 876
		barrelModel[18] = new ModelRendererTurbo(this, 97, 305, textureX, textureY); // Box 877
		barrelModel[19] = new ModelRendererTurbo(this, 121, 305, textureX, textureY); // Box 878
		barrelModel[20] = new ModelRendererTurbo(this, 217, 305, textureX, textureY); // Box 879
		barrelModel[21] = new ModelRendererTurbo(this, 241, 305, textureX, textureY); // Box 880
		barrelModel[22] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 881
		barrelModel[23] = new ModelRendererTurbo(this, 289, 305, textureX, textureY); // Box 882
		barrelModel[24] = new ModelRendererTurbo(this, 313, 305, textureX, textureY); // Box 883
		barrelModel[25] = new ModelRendererTurbo(this, 337, 305, textureX, textureY); // Box 884
		barrelModel[26] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Box 885
		barrelModel[27] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Box 886
		barrelModel[28] = new ModelRendererTurbo(this, 361, 305, textureX, textureY); // Box 887
		barrelModel[29] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Box 888
		barrelModel[30] = new ModelRendererTurbo(this, 409, 305, textureX, textureY); // Box 889
		barrelModel[31] = new ModelRendererTurbo(this, 433, 305, textureX, textureY); // Box 890
		barrelModel[32] = new ModelRendererTurbo(this, 457, 305, textureX, textureY); // Box 891
		barrelModel[33] = new ModelRendererTurbo(this, 481, 305, textureX, textureY); // Box 892
		barrelModel[34] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 893
		barrelModel[35] = new ModelRendererTurbo(this, 25, 313, textureX, textureY); // Box 894
		barrelModel[36] = new ModelRendererTurbo(this, 137, 305, textureX, textureY); // Box 895
		barrelModel[37] = new ModelRendererTurbo(this, 41, 313, textureX, textureY); // Box 896
		barrelModel[38] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Box 897
		barrelModel[39] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Box 898
		barrelModel[40] = new ModelRendererTurbo(this, 113, 313, textureX, textureY); // Box 899
		barrelModel[41] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 900
		barrelModel[42] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Box 901
		barrelModel[43] = new ModelRendererTurbo(this, 273, 313, textureX, textureY); // Box 902
		barrelModel[44] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 903
		barrelModel[45] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 904
		barrelModel[46] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 905
		barrelModel[47] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 906
		barrelModel[48] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 907
		barrelModel[49] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 909
		barrelModel[50] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 910
		barrelModel[51] = new ModelRendererTurbo(this, 329, 313, textureX, textureY); // Box 911
		barrelModel[52] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 912
		barrelModel[53] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 913
		barrelModel[54] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 914
		barrelModel[55] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 915
		barrelModel[56] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 916
		barrelModel[57] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Box 917
		barrelModel[58] = new ModelRendererTurbo(this, 345, 313, textureX, textureY); // Box 918
		barrelModel[59] = new ModelRendererTurbo(this, 377, 313, textureX, textureY); // Box 919
		barrelModel[60] = new ModelRendererTurbo(this, 409, 313, textureX, textureY); // Box 920
		barrelModel[61] = new ModelRendererTurbo(this, 441, 313, textureX, textureY); // Box 921
		barrelModel[62] = new ModelRendererTurbo(this, 465, 313, textureX, textureY); // Box 922
		barrelModel[63] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Box 923
		barrelModel[64] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 924
		barrelModel[65] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 925
		barrelModel[66] = new ModelRendererTurbo(this, 497, 273, textureX, textureY); // Box 926
		barrelModel[67] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 927
		barrelModel[68] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 928
		barrelModel[69] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 929
		barrelModel[70] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 931
		barrelModel[71] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 932
		barrelModel[72] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 933
		barrelModel[73] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 934
		barrelModel[74] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Box 935
		barrelModel[75] = new ModelRendererTurbo(this, 361, 321, textureX, textureY); // Box 936
		barrelModel[76] = new ModelRendererTurbo(this, 425, 321, textureX, textureY); // Box 937
		barrelModel[77] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 940
		barrelModel[78] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 941
		barrelModel[79] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 942
		barrelModel[80] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 943
		barrelModel[81] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 944
		barrelModel[82] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 945
		barrelModel[83] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 946
		barrelModel[84] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Box 948
		barrelModel[85] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 949
		barrelModel[86] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 950
		barrelModel[87] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 951
		barrelModel[88] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 953
		barrelModel[89] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 957
		barrelModel[90] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Box 958
		barrelModel[91] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 959
		barrelModel[92] = new ModelRendererTurbo(this, 217, 297, textureX, textureY); // Box 960
		barrelModel[93] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Box 961
		barrelModel[94] = new ModelRendererTurbo(this, 57, 313, textureX, textureY); // Box 962
		barrelModel[95] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 963
		barrelModel[96] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Box 964
		barrelModel[97] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 965
		barrelModel[98] = new ModelRendererTurbo(this, 105, 313, textureX, textureY); // Box 966
		barrelModel[99] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 967
		barrelModel[100] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 968
		barrelModel[101] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 969
		barrelModel[102] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 970
		barrelModel[103] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 971
		barrelModel[104] = new ModelRendererTurbo(this, 265, 265, textureX, textureY); // Box 972
		barrelModel[105] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Box 973
		barrelModel[106] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Box 974
		barrelModel[107] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 975
		barrelModel[108] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 976
		barrelModel[109] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 977
		barrelModel[110] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Box 978
		barrelModel[111] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 979
		barrelModel[112] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 981
		barrelModel[113] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 982
		barrelModel[114] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 983
		barrelModel[115] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 984
		barrelModel[116] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 985
		barrelModel[117] = new ModelRendererTurbo(this, 9, 201, textureX, textureY); // Box 986
		barrelModel[118] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 987
		barrelModel[119] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 988
		barrelModel[120] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 989
		barrelModel[121] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 990
		barrelModel[122] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Box 991
		barrelModel[123] = new ModelRendererTurbo(this, 153, 289, textureX, textureY); // Box 992

		barrelModel[0].addShapeBox(-3.6F, -5.4F, -1.4F, 8, 2, 1, 0F,-2.8F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -2.8F, -0.8F, -0.1F, -1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F); // Box 859
		barrelModel[0].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[1].addShapeBox(-3.6F, -4.4F, -1.4F, 8, 2, 1, 0F,-1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 860
		barrelModel[1].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[2].addShapeBox(-3.6F, -3.4F, -1.4F, 8, 2, 1, 0F,0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F); // Box 861
		barrelModel[2].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[3].addShapeBox(-4.1F, -2.4F, -1.4F, 9, 2, 1, 0F,0.2F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F, 0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F); // Box 862
		barrelModel[3].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[4].addShapeBox(-4.1F, -0.4F, -1.4F, 8, 1, 1, 0F,0.55F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.55F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 0.55F, -0.25F, -0.1F); // Box 863
		barrelModel[4].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[5].addShapeBox(-4.1F, 0.35F, -1.4F, 9, 2, 1, 0F,0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.2F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F); // Box 864
		barrelModel[5].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[6].addShapeBox(-3.6F, 1.35F, -1.4F, 8, 2, 1, 0F,0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 865
		barrelModel[6].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[7].addShapeBox(-3.6F, 2.35F, -1.4F, 8, 2, 1, 0F,0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F); // Box 866
		barrelModel[7].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[8].addShapeBox(-3.6F, 3.35F, -1.4F, 8, 2, 1, 0F,-1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -2.8F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -2.8F, -0.8F, -0.1F); // Box 867
		barrelModel[8].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[9].addShapeBox(-3.6F, -5.4F, -1F, 8, 2, 1, 0F,-2.8F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -2.8F, -0.8F, -0.1F, -1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F); // Box 868
		barrelModel[9].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[10].addShapeBox(-3.6F, -4.4F, -1F, 8, 2, 1, 0F,-1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 869
		barrelModel[10].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[11].addShapeBox(-3.6F, -3.4F, -1F, 8, 2, 1, 0F,0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F); // Box 870
		barrelModel[11].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[12].addShapeBox(-4.1F, -2.4F, -1F, 9, 2, 1, 0F,0.2F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F, 0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F); // Box 871
		barrelModel[12].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[13].addShapeBox(-4.1F, -0.4F, -1F, 8, 1, 1, 0F,0.55F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.55F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 0.55F, -0.25F, -0.1F); // Box 872
		barrelModel[13].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[14].addShapeBox(-4.1F, 0.35F, -1F, 9, 2, 1, 0F,0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.2F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F); // Box 873
		barrelModel[14].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[15].addShapeBox(-3.6F, 1.35F, -1F, 8, 2, 1, 0F,0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 874
		barrelModel[15].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[16].addShapeBox(-3.6F, 2.35F, -1F, 8, 2, 1, 0F,0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F); // Box 875
		barrelModel[16].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[17].addShapeBox(-3.6F, 3.35F, -1F, 8, 2, 1, 0F,-1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -2.8F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -2.8F, -0.8F, -0.1F); // Box 876
		barrelModel[17].setRotationPoint(4.8F, -38F, -3.95F);

		barrelModel[18].addShapeBox(-4.1F, -2.4F, -0.4F, 9, 2, 1, 0F,0.2F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F, 0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F); // Box 877
		barrelModel[18].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[19].addShapeBox(-4.1F, -2.5F, 0F, 9, 2, 1, 0F,0.2F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F, 0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F); // Box 878
		barrelModel[19].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[20].addShapeBox(-3.6F, -3.5F, 0F, 8, 2, 1, 0F,0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F); // Box 879
		barrelModel[20].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[21].addShapeBox(-3.6F, -3.4F, -0.4F, 8, 2, 1, 0F,0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F); // Box 880
		barrelModel[21].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[22].addShapeBox(-3.6F, -4.4F, -0.4F, 8, 2, 1, 0F,-1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 881
		barrelModel[22].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[23].addShapeBox(-3.6F, -4.5F, 0F, 8, 2, 1, 0F,-1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 882
		barrelModel[23].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[24].addShapeBox(-3.6F, -5.5F, 0F, 8, 2, 1, 0F,-2.8F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -2.8F, -0.8F, -0.1F, -1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F); // Box 883
		barrelModel[24].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[25].addShapeBox(-3.6F, -5.4F, -0.4F, 8, 2, 1, 0F,-2.8F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -2.8F, -0.8F, -0.1F, -1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F); // Box 884
		barrelModel[25].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[26].addShapeBox(-4.1F, -0.4F, -0.4F, 8, 1, 1, 0F,0.55F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.55F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 0.55F, -0.25F, -0.1F); // Box 885
		barrelModel[26].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[27].addShapeBox(-4.1F, -0.5F, 0F, 8, 1, 1, 0F,0.55F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.55F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 1F, -0.25F, -0.1F, 0.55F, -0.25F, -0.1F); // Box 886
		barrelModel[27].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[28].addShapeBox(-4.1F, 0.25F, 0F, 9, 2, 1, 0F,0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.2F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F); // Box 887
		barrelModel[28].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[29].addShapeBox(-4.1F, 0.35F, -0.4F, 9, 2, 1, 0F,0.55F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.55F, 0F, -0.1F, 0.2F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, 0.2F, -0.5F, -0.1F); // Box 888
		barrelModel[29].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[30].addShapeBox(-3.6F, 1.35F, -0.4F, 8, 2, 1, 0F,0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 889
		barrelModel[30].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[31].addShapeBox(-3.6F, 1.25F, 0F, 8, 2, 1, 0F,0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, 0.7F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F); // Box 890
		barrelModel[31].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[32].addShapeBox(-3.6F, 2.25F, 0F, 8, 2, 1, 0F,0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F); // Box 891
		barrelModel[32].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[33].addShapeBox(-3.6F, 2.35F, -0.4F, 8, 2, 1, 0F,0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F); // Box 892
		barrelModel[33].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[34].addShapeBox(-3.6F, 3.35F, -0.4F, 8, 2, 1, 0F,-1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -2.8F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -2.8F, -0.8F, -0.1F); // Box 893
		barrelModel[34].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[35].addShapeBox(-3.6F, 3.25F, 0F, 8, 2, 1, 0F,-1F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1.6F, -0.5F, -0.1F, -1F, -0.5F, -0.1F, -2.8F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -3.4F, -0.8F, -0.1F, -2.8F, -0.8F, -0.1F); // Box 894
		barrelModel[35].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[36].addShapeBox(-1.1F, 0F, 0F, 3, 1, 10, 0F,0.5F, -0.4F, 0F, 1.3F, -0.4F, 0F, 1.3F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 1.3F, -0.4F, 0F, 1.3F, -0.4F, 0F, 0.5F, -0.4F, 0F); // Box 895
		barrelModel[36].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[37].addShapeBox(2.7F, -0.5F, 0F, 1, 1, 10, 0F,-0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 896
		barrelModel[37].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[38].addShapeBox(-2.15F, -0.5F, 0F, 1, 1, 10, 0F,-0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 897
		barrelModel[38].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[39].addShapeBox(-2.15F, -2.7F, 0F, 1, 2, 9, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -4F, -0.4F, 0.5F, -4F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 898
		barrelModel[39].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[40].addShapeBox(-1.1F, 0F, -10F, 3, 1, 10, 0F,0.5F, -0.4F, 0F, 1.3F, -0.4F, 0F, 1.3F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 1.3F, -0.4F, 0F, 1.3F, -0.4F, 0F, 0.5F, -0.4F, 0F); // Box 899
		barrelModel[40].setRotationPoint(4.8F, -38F, -4.25F);

		barrelModel[41].addShapeBox(-2.15F, -0.5F, -10F, 1, 1, 10, 0F,-0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 900
		barrelModel[41].setRotationPoint(4.8F, -38F, -4.25F);

		barrelModel[42].addShapeBox(-2.15F, -2.7F, -10F, 1, 2, 9, 0F,-0.4F, 0.5F, -4F, -0.4F, 0.5F, -4F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 901
		barrelModel[42].setRotationPoint(4.8F, -38F, -4.25F);

		barrelModel[43].addShapeBox(2.7F, -0.5F, -10F, 1, 1, 10, 0F,-0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F); // Box 902
		barrelModel[43].setRotationPoint(4.8F, -38F, -4.25F);

		barrelModel[44].addShapeBox(-1.1F, -4.6F, 0.4F, 3, 5, 9, 0F,0.3F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.3F, 0F, -0.4F); // Box 903
		barrelModel[44].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[45].addShapeBox(-1.1F, -4.6F, 8.6F, 3, 1, 2, 0F,0.3F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 1F, -0.4F, 1.1F, 1F, -0.4F, 1.1F, -0.5F, -0.4F, 0.3F, -0.5F, -0.4F); // Box 904
		barrelModel[45].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[46].addShapeBox(-1.1F, -0.6F, 8.6F, 3, 1, 2, 0F,0.3F, 1F, -0.4F, 1.1F, 1F, -0.4F, 1.1F, -0.5F, -0.4F, 0.3F, -0.5F, -0.4F, 0.3F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.3F, 0F, -0.4F); // Box 905
		barrelModel[46].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[47].addShapeBox(2.2F, -4.1F, 8.6F, 1, 4, 2, 0F,1.8F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 1.8F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 906
		barrelModel[47].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[48].addShapeBox(-1.6F, -4.1F, 8.6F, 1, 4, 2, 0F,-0.2F, 0F, -0.4F, 1.8F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 1.8F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 907
		barrelModel[48].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[49].addShapeBox(-0.8F, -2.8F, 9.35F, 3, 1, 1, 0F,0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Box 909
		barrelModel[49].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[50].addShapeBox(-1.1F, -5.3F, 9.5F, 3, 1, 1, 0F,0.3F, -0.5F, -0.3F, 1.1F, -0.5F, -0.3F, 1.1F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.3F, -0.3F, 1.1F, -0.3F, -0.3F, 1.1F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Box 910
		barrelModel[50].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[51].addShapeBox(-1.1F, -4.6F, -18.4F, 3, 5, 9, 0F,0.3F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.3F, 0F, -0.4F); // Box 911
		barrelModel[51].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[52].addShapeBox(2.2F, -4.1F, -19.4F, 1, 4, 2, 0F,-0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 1.8F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 1.8F, 0F, -0.4F); // Box 912
		barrelModel[52].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[53].addShapeBox(-1.1F, -4.6F, -19.4F, 3, 1, 2, 0F,0.3F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, -0.5F, -0.4F, 1.1F, -0.5F, -0.4F, 1.1F, 1F, -0.4F, 0.3F, 1F, -0.4F); // Box 913
		barrelModel[53].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[54].addShapeBox(-1.1F, -5.3F, -19.3F, 3, 1, 1, 0F,0.3F, -0.5F, -0.3F, 1.1F, -0.5F, -0.3F, 1.1F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.3F, -0.3F, 1.1F, -0.3F, -0.3F, 1.1F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Box 914
		barrelModel[54].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[55].addShapeBox(-1.6F, -4.1F, -19.4F, 1, 4, 2, 0F,-0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 1.8F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 1.8F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 915
		barrelModel[55].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[56].addShapeBox(-0.8F, -2.8F, -19F, 3, 1, 1, 0F,0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Box 916
		barrelModel[56].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[57].addShapeBox(-1.1F, -0.6F, -19.4F, 3, 1, 2, 0F,0.3F, -0.5F, -0.4F, 1.1F, -0.5F, -0.4F, 1.1F, 1F, -0.4F, 0.3F, 1F, -0.4F, 0.3F, 0F, -0.4F, 1.1F, 0F, -0.4F, 1.1F, 0F, -0.4F, 0.3F, 0F, -0.4F); // Box 917
		barrelModel[57].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[58].addShapeBox(-2.8F, 2.5F, -1.6F, 11, 1, 2, 0F,0.3F, -0.1F, -0.4F, 1.4F, -0.1F, -0.4F, 1.4F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, 0.7F, -0.4F, 1.4F, -0.1F, -0.4F, 1.4F, -0.1F, -0.4F, 0.3F, 0.7F, -0.4F); // Box 918
		barrelModel[58].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[59].addShapeBox(-2.8F, 2.5F, -9.2F, 11, 1, 2, 0F,0.3F, -0.1F, -0.4F, 1.4F, -0.1F, -0.4F, 1.4F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, 0.7F, -0.4F, 1.4F, -0.1F, -0.4F, 1.4F, -0.1F, -0.4F, 0.3F, 0.7F, -0.4F); // Box 919
		barrelModel[59].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[60].addShapeBox(-2.8F, 2.5F, -8F, 11, 1, 2, 0F,0.3F, -0.1F, -0.4F, 1.4F, -0.1F, -0.4F, 1.4F, -0.5F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, 0.7F, -0.4F, 1.4F, -0.1F, -0.4F, 1.4F, 0.2F, -0.3F, 0.3F, 0.7F, -0.3F); // Box 920
		barrelModel[60].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[61].addShapeBox(-2.8F, 2.5F, -2.8F, 11, 1, 2, 0F,0.3F, -0.1F, -0.3F, 1.4F, -0.5F, -0.3F, 1.4F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.3F, 0.7F, -0.3F, 1.4F, 0.2F, -0.3F, 1.4F, -0.1F, -0.4F, 0.3F, 0.7F, -0.4F); // Box 921
		barrelModel[61].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[62].addShapeBox(-2.8F, 2.5F, -6.2F, 11, 1, 4, 0F,0.3F, -0.1F, 0.1F, 1.4F, -0.5F, 0.1F, 1.4F, -0.5F, -0.3F, 0.3F, -0.1F, -0.3F, 0.3F, 0.7F, 0.1F, 1.4F, 0.2F, 0.1F, 1.4F, 0.2F, -0.3F, 0.3F, 0.7F, -0.3F); // Box 922
		barrelModel[62].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[63].addShapeBox(-2.1F, -1.6F, -3.6F, 4, 3, 3, 0F,0F, 0F, -0.1F, 1.2F, 0F, -0.1F, 1.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 923
		barrelModel[63].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[63].rotateAngleX = 0.19198622F;

		barrelModel[64].addShapeBox(-2.1F, -2.35F, -3.6F, 4, 1, 3, 0F,0F, -0.4F, -0.1F, 1F, -0.4F, -0.1F, 1F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 924
		barrelModel[64].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[64].rotateAngleX = 0.19198622F;

		barrelModel[65].addShapeBox(2.8F, -1.6F, -3.1F, 1, 3, 2, 0F,0F, 0F, 0.1F, 1.2F, 0F, 0.1F, 1.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 1.2F, 0.1F, 0.1F, 1.2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 925
		barrelModel[65].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[65].rotateAngleX = 0.19198622F;

		barrelModel[66].addShapeBox(4.2F, -1.3F, -3.1F, 3, 3, 2, 0F,0F, -0.5F, 0F, 1.2F, -0.5F, 0F, 1.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.2F, -0.5F, 0F, 1.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 926
		barrelModel[66].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[66].rotateAngleX = 0.19198622F;

		barrelModel[67].addShapeBox(4.2F, -1.5F, -3.1F, 3, 1, 2, 0F,0F, -0.1F, -0.5F, 1.2F, -0.1F, -0.5F, 1.2F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 927
		barrelModel[67].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[67].rotateAngleX = 0.19198622F;

		barrelModel[68].addShapeBox(7.4F, -1.1F, -2.6F, 1, 3, 1, 0F,0F, -0.5F, 0.05F, 1F, -0.5F, 0.05F, 1F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 1F, -0.5F, 0.05F, 1F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 928
		barrelModel[68].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[68].rotateAngleX = 0.19198622F;

		barrelModel[69].addShapeBox(7.4F, -1.6F, -2.6F, 1, 2, 1, 0F,0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 929
		barrelModel[69].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[69].rotateAngleX = 0.19198622F;

		barrelModel[70].addShapeBox(7.4F, -1.6F, -2F, 1, 3, 1, 0F,0F, -0.3F, -0.4F, 1F, -0.3F, -0.4F, 1F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1.5F, -0.4F, 1F, -1.5F, -0.4F, 1F, -1.7F, -0.4F, 0F, -1.7F, -0.4F); // Box 931
		barrelModel[70].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[70].rotateAngleX = 0.19198622F;

		barrelModel[71].addShapeBox(7.4F, -1.6F, -3.2F, 1, 3, 1, 0F,0F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -1.7F, -0.4F, 1F, -1.7F, -0.4F, 1F, -1.5F, -0.4F, 0F, -1.5F, -0.4F); // Box 932
		barrelModel[71].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[71].rotateAngleX = 0.19198622F;

		barrelModel[72].addShapeBox(-4.1F, -1.6F, -3.1F, 1, 3, 2, 0F,0.7F, 0F, -0.1F, 1.2F, 0F, -0.1F, 1.2F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0.7F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 0.7F, -0.25F, -0.1F); // Box 933
		barrelModel[72].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[72].rotateAngleX = 0.19198622F;

		barrelModel[73].addShapeBox(4.2F, -0.8F, -3.1F, 3, 1, 2, 0F,0F, -0.1F, 0.4F, 1.2F, -0.1F, 0.4F, 1.2F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.3F, 0.4F, 1.2F, -0.3F, 0.4F, 1.2F, -0.3F, 0.4F, 0F, -0.3F, 0.4F); // Box 934
		barrelModel[73].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[73].rotateAngleX = 0.19198622F;

		barrelModel[74].addShapeBox(8.4F, -1.45F, -2.6F, 28, 2, 1, 0F,0F, -0.6F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 935
		barrelModel[74].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[74].rotateAngleX = 0.19198622F;

		barrelModel[75].addShapeBox(8.4F, -1.85F, -2.6F, 28, 2, 1, 0F,0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 936
		barrelModel[75].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[75].rotateAngleX = 0.19198622F;

		barrelModel[76].addShapeBox(8.4F, -1.45F, -2.6F, 28, 2, 1, 0F,0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 937
		barrelModel[76].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[76].rotateAngleX = 0.19198622F;

		barrelModel[77].addShapeBox(37.4F, -1.4F, -3.1F, 5, 2, 2, 0F,0F, -0.4F, -0.2F, 1F, -0.4F, -0.2F, 1F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -1.1F, -0.2F, 1F, -1.1F, -0.2F, 1F, -1.1F, -0.2F, 0F, -1.1F, -0.2F); // Box 940
		barrelModel[77].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[77].rotateAngleX = 0.19198622F;

		barrelModel[78].addShapeBox(37.4F, -2.2F, -3.1F, 5, 2, 2, 0F,0F, -0.65F, -0.7F, 1F, -0.65F, -0.7F, 1F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.8F, -0.2F, 1F, -0.8F, -0.2F, 1F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 941
		barrelModel[78].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[78].rotateAngleX = 0.19198622F;

		barrelModel[79].addShapeBox(37.4F, -1.1F, -3.1F, 5, 2, 2, 0F,0F, -0.6F, -0.2F, 1F, -0.6F, -0.2F, 1F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.85F, -0.7F, 1F, -0.85F, -0.7F, 1F, -0.85F, -0.7F, 0F, -0.85F, -0.7F); // Box 942
		barrelModel[79].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[79].rotateAngleX = 0.19198622F;

		barrelModel[80].addShapeBox(8.7F, -0.7F, -2.6F, 1, 2, 1, 0F,0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 943
		barrelModel[80].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[80].rotateAngleX = 0.19198622F;

		barrelModel[81].addShapeBox(8.7F, -0.3F, -2.6F, 1, 2, 1, 0F,0F, -0.6F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 944
		barrelModel[81].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[81].rotateAngleX = 0.19198622F;

		barrelModel[82].addShapeBox(8.7F, -0.3F, -2.6F, 1, 2, 1, 0F,0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 945
		barrelModel[82].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[82].rotateAngleX = 0.19198622F;

		barrelModel[83].addShapeBox(10.7F, -0.3F, -2.6F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 946
		barrelModel[83].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[83].rotateAngleX = 0.19198622F;

		barrelModel[84].addShapeBox(6.2F, -1F, -5.8F, 2, 4, 3, 0F,0.3F, 0F, -0.7F, 1.4F, 0F, -0.7F, 1.4F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0.1F, 1.4F, 0F, 0.1F, 1.4F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 948
		barrelModel[84].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[85].addShapeBox(10.6F, -1.85F, -2.6F, 1, 2, 1, 0F,-0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F); // Box 949
		barrelModel[85].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[85].rotateAngleX = 0.19198622F;

		barrelModel[86].addShapeBox(10.6F, -2.5F, -2.6F, 1, 2, 1, 0F,-0.5F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.7F, -0.45F, -0.25F, -0.7F, -0.45F, -0.25F, -0.7F, -0.45F, -0.25F, -0.7F, -0.45F); // Box 950
		barrelModel[86].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[86].rotateAngleX = 0.19198622F;

		barrelModel[87].addShapeBox(14.6F, -2.5F, -2.6F, 1, 2, 1, 0F,-0.05F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F); // Box 951
		barrelModel[87].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[87].rotateAngleX = 0.19198622F;

		barrelModel[88].addShapeBox(11.2F, -2.7F, -2.6F, 3, 1, 1, 0F,-0.25F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F); // Box 953
		barrelModel[88].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[88].rotateAngleX = 0.19198622F;

		barrelModel[89].addShapeBox(8.4F, -2.35F, -7F, 35, 2, 1, 0F,0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F); // Box 957
		barrelModel[89].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[89].rotateAngleX = 0.19198622F;

		barrelModel[90].addShapeBox(8.4F, -2.35F, -7F, 35, 2, 1, 0F,0F, -0.6F, 0F, 1F, -0.6F, 0F, 1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 958
		barrelModel[90].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[90].rotateAngleX = 0.19198622F;

		barrelModel[91].addShapeBox(8.4F, -2.75F, -7F, 35, 2, 1, 0F,0F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 1F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 959
		barrelModel[91].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[91].rotateAngleX = 0.19198622F;

		barrelModel[92].addShapeBox(42F, -3.1F, -7.5F, 5, 2, 2, 0F,0F, -0.65F, -0.7F, 1F, -0.65F, -0.7F, 1F, -0.65F, -0.7F, 0F, -0.65F, -0.7F, 0F, -0.8F, -0.2F, 1F, -0.8F, -0.2F, 1F, -0.8F, -0.2F, 0F, -0.8F, -0.2F); // Box 960
		barrelModel[92].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[92].rotateAngleX = 0.19198622F;

		barrelModel[93].addShapeBox(42F, -2.3F, -7.5F, 5, 2, 2, 0F,0F, -0.4F, -0.2F, 1F, -0.4F, -0.2F, 1F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -1.1F, -0.2F, 1F, -1.1F, -0.2F, 1F, -1.1F, -0.2F, 0F, -1.1F, -0.2F); // Box 961
		barrelModel[93].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[93].rotateAngleX = 0.19198622F;

		barrelModel[94].addShapeBox(42F, -2F, -7.5F, 5, 2, 2, 0F,0F, -0.6F, -0.2F, 1F, -0.6F, -0.2F, 1F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.85F, -0.7F, 1F, -0.85F, -0.7F, 1F, -0.85F, -0.7F, 0F, -0.85F, -0.7F); // Box 962
		barrelModel[94].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[94].rotateAngleX = 0.19198622F;

		barrelModel[95].addShapeBox(15F, 0.5F, -7.1F, 1, 3, 1, 0F,0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F); // Box 963
		barrelModel[95].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[95].rotateAngleX = -0.19198622F;

		barrelModel[96].addShapeBox(-2.1F, -0.65F, -8.05F, 4, 1, 3, 0F,0F, -0.4F, -0.1F, 1F, -0.4F, -0.1F, 1F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 964
		barrelModel[96].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[96].rotateAngleX = -0.19198622F;

		barrelModel[97].addShapeBox(-4.1F, 0.1F, -7.55F, 1, 3, 2, 0F,0.7F, 0F, -0.1F, 1.2F, 0F, -0.1F, 1.2F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0.7F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 0.7F, -0.25F, -0.1F); // Box 965
		barrelModel[97].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[97].rotateAngleX = -0.19198622F;

		barrelModel[98].addShapeBox(-2.1F, 0.1F, -8.05F, 4, 3, 3, 0F,0F, 0F, -0.1F, 1.2F, 0F, -0.1F, 1.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 1.2F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 966
		barrelModel[98].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[98].rotateAngleX = -0.19198622F;

		barrelModel[99].addShapeBox(2.8F, 0.1F, -7.55F, 1, 3, 2, 0F,0F, 0F, 0.1F, 1.2F, 0F, 0.1F, 1.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 1.2F, 0.1F, 0.1F, 1.2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 967
		barrelModel[99].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[99].rotateAngleX = -0.19198622F;

		barrelModel[100].addShapeBox(4.2F, 0.9F, -7.55F, 3, 1, 2, 0F,0F, -0.1F, 0.4F, 1.2F, -0.1F, 0.4F, 1.2F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.3F, 0.4F, 1.2F, -0.3F, 0.4F, 1.2F, -0.3F, 0.4F, 0F, -0.3F, 0.4F); // Box 968
		barrelModel[100].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[100].rotateAngleX = -0.19198622F;

		barrelModel[101].addShapeBox(4.2F, 0.4F, -7.55F, 3, 3, 2, 0F,0F, -0.5F, 0F, 1.2F, -0.5F, 0F, 1.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.2F, -0.5F, 0F, 1.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 969
		barrelModel[101].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[101].rotateAngleX = -0.19198622F;

		barrelModel[102].addShapeBox(7.4F, 0.6F, -7.05F, 1, 3, 1, 0F,0F, -0.5F, 0.05F, 1F, -0.5F, 0.05F, 1F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 1F, -0.5F, 0.05F, 1F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 970
		barrelModel[102].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[102].rotateAngleX = -0.19198622F;

		barrelModel[103].addShapeBox(7.4F, 0.1F, -6.45F, 1, 3, 1, 0F,0F, -0.3F, -0.4F, 1F, -0.3F, -0.4F, 1F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -1.5F, -0.4F, 1F, -1.5F, -0.4F, 1F, -1.7F, -0.4F, 0F, -1.7F, -0.4F); // Box 971
		barrelModel[103].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[103].rotateAngleX = -0.19198622F;

		barrelModel[104].addShapeBox(4.2F, 0.2F, -7.55F, 3, 1, 2, 0F,0F, -0.1F, -0.5F, 1.2F, -0.1F, -0.5F, 1.2F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, 0F, 1.2F, -0.3F, 0F, 1.2F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 972
		barrelModel[104].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[104].rotateAngleX = -0.19198622F;

		barrelModel[105].addShapeBox(7.4F, 0.1F, -7.65F, 1, 3, 1, 0F,0F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -1.7F, -0.4F, 1F, -1.7F, -0.4F, 1F, -1.5F, -0.4F, 0F, -1.5F, -0.4F); // Box 973
		barrelModel[105].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[105].rotateAngleX = -0.19198622F;

		barrelModel[106].addShapeBox(7.4F, 0.1F, -7.05F, 1, 2, 1, 0F,0F, -0.3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Box 974
		barrelModel[106].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[106].rotateAngleX = -0.19198622F;

		barrelModel[107].addShapeBox(15F, -0.8F, -7.1F, 1, 2, 1, 0F,-0.5F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.7F, -0.45F, -0.25F, -0.7F, -0.45F, -0.25F, -0.7F, -0.45F, -0.25F, -0.7F, -0.45F); // Box 975
		barrelModel[107].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[107].rotateAngleX = -0.19198622F;

		barrelModel[108].addShapeBox(15F, -0.15F, -7.1F, 1, 2, 1, 0F,-0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F); // Box 976
		barrelModel[108].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[108].rotateAngleX = -0.19198622F;

		barrelModel[109].addShapeBox(15.6F, -1F, -7.1F, 3, 1, 1, 0F,-0.25F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F); // Box 977
		barrelModel[109].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[109].rotateAngleX = -0.19198622F;

		barrelModel[110].addShapeBox(19F, -0.8F, -7.1F, 1, 2, 1, 0F,-0.05F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.05F, -0.2F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F, -0.25F, -0.6F, -0.45F); // Box 978
		barrelModel[110].setRotationPoint(4.8F, -38F, 4.45F);
		barrelModel[110].rotateAngleX = -0.19198622F;

		barrelModel[111].addShapeBox(9.2F, 0F, -4.9F, 23, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0.2F); // Box 979
		barrelModel[111].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[112].addShapeBox(31.2F, 0.1F, -7.2F, 1, 1, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F); // Box 981
		barrelModel[112].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[113].addShapeBox(31.2F, 0.1F, -7.2F, 1, 1, 1, 0F,-0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 982
		barrelModel[113].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[114].addShapeBox(31.2F, -1.2F, -7.2F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F); // Box 983
		barrelModel[114].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[115].addShapeBox(31.2F, -1.2F, -2.75F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F); // Box 984
		barrelModel[115].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[116].addShapeBox(31.2F, 0.1F, -2.75F, 1, 1, 1, 0F,-0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F); // Box 985
		barrelModel[116].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[117].addShapeBox(25.4F, 0.4F, -7.2F, 1, 1, 5, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0.6F, -0.4F, -0.4F, 0.6F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0.6F, -0.4F, -0.4F, 0.6F); // Box 986
		barrelModel[117].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[118].addShapeBox(26.4F, -1.1F, -9F, 4, 1, 1, 0F,-0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F); // Box 987
		barrelModel[118].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[119].addShapeBox(26.3F, -0.7F, -9F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0.6F, -0.3F, -1.7F, -1.3F, -0.3F, -1.7F, -1.4F, -0.3F, 1F, 0.6F, -0.3F, 1F); // Box 988
		barrelModel[119].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[120].addShapeBox(26.3F, -0.7F, -0.8F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0.6F, -0.3F, 1F, -1.4F, -0.3F, 1F, -1.3F, -0.3F, -1.7F, 0.6F, -0.3F, -1.7F); // Box 989
		barrelModel[120].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[121].addShapeBox(26.4F, -1.1F, -0.8F, 4, 1, 1, 0F,-0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F); // Box 990
		barrelModel[121].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[122].addShapeBox(30F, -0.7F, -0.8F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -1.4F, -0.3F, 1F, 0.6F, -0.3F, 1F, 0.6F, -0.3F, -1.7F, -1.3F, -0.3F, -1.7F); // Box 991
		barrelModel[122].setRotationPoint(4.8F, -38F, 4.45F);

		barrelModel[123].addShapeBox(30F, -0.7F, -9F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -1.3F, -0.3F, -1.7F, 0.6F, -0.3F, -1.7F, 0.6F, -0.3F, 1F, -1.4F, -0.3F, 1F); // Box 992
		barrelModel[123].setRotationPoint(4.8F, -38F, 4.45F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 456
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 457
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 297
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 298
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 299
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 300
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 301
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 302
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 303
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 304
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 305
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 306
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 307
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 308
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 309
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 499
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 500
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 501
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 313
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 314
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 315
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 316
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 317
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 318
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 319
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 320
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 321
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 322
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 323
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 324
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 373
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 374
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 375
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 376
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 377
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 378
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 379
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 380
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 381
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 382
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 383
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 384
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 388
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 389
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 390

		leftTrackWheelModels[0].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 456
		leftTrackWheelModels[0].setRotationPoint(-7F, 5.1F, 24.5F);

		leftTrackWheelModels[1].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 457
		leftTrackWheelModels[1].setRotationPoint(-7F, 5.7F, 24.5F);

		leftTrackWheelModels[2].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 297
		leftTrackWheelModels[2].setRotationPoint(-7F, 11.5F, 24.5F);

		leftTrackWheelModels[3].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 298
		leftTrackWheelModels[3].setRotationPoint(6.5F, 5.7F, 24.5F);

		leftTrackWheelModels[4].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 299
		leftTrackWheelModels[4].setRotationPoint(6.5F, 5.1F, 24.5F);

		leftTrackWheelModels[5].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 300
		leftTrackWheelModels[5].setRotationPoint(6.5F, 11.5F, 24.5F);

		leftTrackWheelModels[6].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 301
		leftTrackWheelModels[6].setRotationPoint(20.5F, 5.7F, 24.5F);

		leftTrackWheelModels[7].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 302
		leftTrackWheelModels[7].setRotationPoint(20.5F, 5.1F, 24.5F);

		leftTrackWheelModels[8].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 303
		leftTrackWheelModels[8].setRotationPoint(20.5F, 11.5F, 24.5F);

		leftTrackWheelModels[9].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 304
		leftTrackWheelModels[9].setRotationPoint(-21F, 5.7F, 24.5F);

		leftTrackWheelModels[10].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 305
		leftTrackWheelModels[10].setRotationPoint(-21F, 5.1F, 24.5F);

		leftTrackWheelModels[11].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 306
		leftTrackWheelModels[11].setRotationPoint(-21F, 11.5F, 24.5F);

		leftTrackWheelModels[12].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 307
		leftTrackWheelModels[12].setRotationPoint(-35F, 5.7F, 24.5F);

		leftTrackWheelModels[13].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 308
		leftTrackWheelModels[13].setRotationPoint(-35F, 5.1F, 24.5F);

		leftTrackWheelModels[14].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 309
		leftTrackWheelModels[14].setRotationPoint(-35F, 11.5F, 24.5F);

		leftTrackWheelModels[15].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 499
		leftTrackWheelModels[15].setRotationPoint(19.5F, 4.6F, 25F);

		leftTrackWheelModels[16].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 500
		leftTrackWheelModels[16].setRotationPoint(19.5F, 4.6F, 25F);

		leftTrackWheelModels[17].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 501
		leftTrackWheelModels[17].setRotationPoint(19.5F, 4.6F, 25F);

		leftTrackWheelModels[18].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 313
		leftTrackWheelModels[18].setRotationPoint(5.5F, 4.6F, 25F);

		leftTrackWheelModels[19].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 314
		leftTrackWheelModels[19].setRotationPoint(5.5F, 4.6F, 25F);

		leftTrackWheelModels[20].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 315
		leftTrackWheelModels[20].setRotationPoint(5.5F, 4.6F, 25F);

		leftTrackWheelModels[21].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 316
		leftTrackWheelModels[21].setRotationPoint(-8F, 4.6F, 25F);

		leftTrackWheelModels[22].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 317
		leftTrackWheelModels[22].setRotationPoint(-8F, 4.6F, 25F);

		leftTrackWheelModels[23].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 318
		leftTrackWheelModels[23].setRotationPoint(-8F, 4.6F, 25F);

		leftTrackWheelModels[24].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 319
		leftTrackWheelModels[24].setRotationPoint(-22F, 4.6F, 25F);

		leftTrackWheelModels[25].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 320
		leftTrackWheelModels[25].setRotationPoint(-22F, 4.6F, 25F);

		leftTrackWheelModels[26].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 321
		leftTrackWheelModels[26].setRotationPoint(-22F, 4.6F, 25F);

		leftTrackWheelModels[27].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 322
		leftTrackWheelModels[27].setRotationPoint(-36F, 4.6F, 25F);

		leftTrackWheelModels[28].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 323
		leftTrackWheelModels[28].setRotationPoint(-36F, 4.6F, 25F);

		leftTrackWheelModels[29].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 324
		leftTrackWheelModels[29].setRotationPoint(-36F, 4.6F, 25F);

		leftTrackWheelModels[30].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 373
		leftTrackWheelModels[30].setRotationPoint(-29F, -4.5F, 22.5F);

		leftTrackWheelModels[31].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 374
		leftTrackWheelModels[31].setRotationPoint(-29F, -4.5F, 22.5F);

		leftTrackWheelModels[32].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 375
		leftTrackWheelModels[32].setRotationPoint(-29F, -4.5F, 22.5F);

		leftTrackWheelModels[33].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 376
		leftTrackWheelModels[33].setRotationPoint(-15.5F, -4.5F, 22.5F);

		leftTrackWheelModels[34].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 377
		leftTrackWheelModels[34].setRotationPoint(-15.5F, -4.5F, 22.5F);

		leftTrackWheelModels[35].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 378
		leftTrackWheelModels[35].setRotationPoint(-15.5F, -4.5F, 22.5F);

		leftTrackWheelModels[36].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 379
		leftTrackWheelModels[36].setRotationPoint(-1.5F, -4.5F, 22.5F);

		leftTrackWheelModels[37].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 380
		leftTrackWheelModels[37].setRotationPoint(-1.5F, -4.5F, 22.5F);

		leftTrackWheelModels[38].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 381
		leftTrackWheelModels[38].setRotationPoint(-1.5F, -4.5F, 22.5F);

		leftTrackWheelModels[39].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 382
		leftTrackWheelModels[39].setRotationPoint(12F, -4.5F, 22.5F);

		leftTrackWheelModels[40].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 383
		leftTrackWheelModels[40].setRotationPoint(12F, -4.5F, 22.5F);

		leftTrackWheelModels[41].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 384
		leftTrackWheelModels[41].setRotationPoint(12F, -4.5F, 22.5F);

		leftTrackWheelModels[42].addShapeBox(-5.5F, -5F, -3F, 8, 2, 3, 0F,-2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 388
		leftTrackWheelModels[42].setRotationPoint(31.5F, -1.2F, 24F);

		leftTrackWheelModels[43].addShapeBox(-5.5F, -2F, -3F, 8, 2, 3, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 389
		leftTrackWheelModels[43].setRotationPoint(31.5F, -1.5F, 24F);

		leftTrackWheelModels[44].addShapeBox(-5.5F, -5F, -3F, 8, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F); // Box 390
		leftTrackWheelModels[44].setRotationPoint(31.5F, 4.2F, 24F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 456
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 457
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 297
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 298
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 299
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 300
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 301
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 302
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 303
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 304
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 305
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 306
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 307
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 308
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 309
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 499
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 500
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 501
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 313
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 314
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 315
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 316
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 317
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 318
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 319
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 320
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 321
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 322
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 323
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 324
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 355
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 356
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 357
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 358
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 359
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 360
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 361
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 362
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 363
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 364
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 365
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 366
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 367
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 368
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 369
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 370
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 371
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 372
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 341
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 342
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 343
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 344
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 345
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 346
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 351
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 352
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 353
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 356
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 357
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 358
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 359
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 360
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 361
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Box 362
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 363
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 364
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 145, 233, textureX, textureY); // Box 365
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 366
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 367

		rightTrackWheelModels[0].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 456
		rightTrackWheelModels[0].setRotationPoint(-7F, 5.1F, -21.5F);

		rightTrackWheelModels[1].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 457
		rightTrackWheelModels[1].setRotationPoint(-7F, 5.7F, -21.5F);

		rightTrackWheelModels[2].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 297
		rightTrackWheelModels[2].setRotationPoint(-7F, 11.5F, -21.5F);

		rightTrackWheelModels[3].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 298
		rightTrackWheelModels[3].setRotationPoint(6.5F, 5.7F, -21.5F);

		rightTrackWheelModels[4].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 299
		rightTrackWheelModels[4].setRotationPoint(6.5F, 5.1F, -21.5F);

		rightTrackWheelModels[5].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 300
		rightTrackWheelModels[5].setRotationPoint(6.5F, 11.5F, -21.5F);

		rightTrackWheelModels[6].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 301
		rightTrackWheelModels[6].setRotationPoint(20.5F, 5.7F, -21.5F);

		rightTrackWheelModels[7].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 302
		rightTrackWheelModels[7].setRotationPoint(20.5F, 5.1F, -21.5F);

		rightTrackWheelModels[8].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 303
		rightTrackWheelModels[8].setRotationPoint(20.5F, 11.5F, -21.5F);

		rightTrackWheelModels[9].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 304
		rightTrackWheelModels[9].setRotationPoint(-21F, 5.7F, -21.5F);

		rightTrackWheelModels[10].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 305
		rightTrackWheelModels[10].setRotationPoint(-21F, 5.1F, -21.5F);

		rightTrackWheelModels[11].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 306
		rightTrackWheelModels[11].setRotationPoint(-21F, 11.5F, -21.5F);

		rightTrackWheelModels[12].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 307
		rightTrackWheelModels[12].setRotationPoint(-35F, 5.7F, -21.5F);

		rightTrackWheelModels[13].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 308
		rightTrackWheelModels[13].setRotationPoint(-35F, 5.1F, -21.5F);

		rightTrackWheelModels[14].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 309
		rightTrackWheelModels[14].setRotationPoint(-35F, 11.5F, -21.5F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 499
		rightTrackWheelModels[15].setRotationPoint(19.5F, 4.6F, -23F);

		rightTrackWheelModels[16].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 500
		rightTrackWheelModels[16].setRotationPoint(19.5F, 4.6F, -23F);

		rightTrackWheelModels[17].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 501
		rightTrackWheelModels[17].setRotationPoint(19.5F, 4.6F, -23F);

		rightTrackWheelModels[18].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 313
		rightTrackWheelModels[18].setRotationPoint(5.5F, 4.6F, -23F);

		rightTrackWheelModels[19].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 314
		rightTrackWheelModels[19].setRotationPoint(5.5F, 4.6F, -23F);

		rightTrackWheelModels[20].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 315
		rightTrackWheelModels[20].setRotationPoint(5.5F, 4.6F, -23F);

		rightTrackWheelModels[21].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 316
		rightTrackWheelModels[21].setRotationPoint(-8F, 4.6F, -23F);

		rightTrackWheelModels[22].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 317
		rightTrackWheelModels[22].setRotationPoint(-8F, 4.6F, -23F);

		rightTrackWheelModels[23].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 318
		rightTrackWheelModels[23].setRotationPoint(-8F, 4.6F, -23F);

		rightTrackWheelModels[24].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 319
		rightTrackWheelModels[24].setRotationPoint(-22F, 4.6F, -23F);

		rightTrackWheelModels[25].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 320
		rightTrackWheelModels[25].setRotationPoint(-22F, 4.6F, -23F);

		rightTrackWheelModels[26].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 321
		rightTrackWheelModels[26].setRotationPoint(-22F, 4.6F, -23F);

		rightTrackWheelModels[27].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 322
		rightTrackWheelModels[27].setRotationPoint(-36F, 4.6F, -23F);

		rightTrackWheelModels[28].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 323
		rightTrackWheelModels[28].setRotationPoint(-36F, 4.6F, -23F);

		rightTrackWheelModels[29].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 324
		rightTrackWheelModels[29].setRotationPoint(-36F, 4.6F, -23F);

		rightTrackWheelModels[30].addShapeBox(-5.5F, -5F, -3F, 8, 2, 3, 0F,-2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 355
		rightTrackWheelModels[30].setRotationPoint(31.5F, -1.2F, -21.5F);

		rightTrackWheelModels[31].addShapeBox(-5.5F, -2F, -3F, 8, 2, 3, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 356
		rightTrackWheelModels[31].setRotationPoint(31.5F, -1.5F, -21.5F);

		rightTrackWheelModels[32].addShapeBox(-5.5F, -5F, -3F, 8, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F); // Box 357
		rightTrackWheelModels[32].setRotationPoint(31.5F, 4.2F, -21.5F);

		rightTrackWheelModels[33].addShapeBox(-5.5F, -5F, -3F, 8, 2, 3, 0F,-2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 358
		rightTrackWheelModels[33].setRotationPoint(-60.8F, -1F, -21.5F);

		rightTrackWheelModels[34].addShapeBox(-5.5F, -2F, -3F, 8, 2, 3, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 359
		rightTrackWheelModels[34].setRotationPoint(-60.8F, -1.3F, -21.5F);

		rightTrackWheelModels[35].addShapeBox(-5.5F, -5F, -3F, 8, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F); // Box 360
		rightTrackWheelModels[35].setRotationPoint(-60.8F, 4.4F, -21.5F);

		rightTrackWheelModels[36].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 361
		rightTrackWheelModels[36].setRotationPoint(12F, -4.5F, -20.5F);

		rightTrackWheelModels[37].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 362
		rightTrackWheelModels[37].setRotationPoint(12F, -4.5F, -20.5F);

		rightTrackWheelModels[38].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 363
		rightTrackWheelModels[38].setRotationPoint(12F, -4.5F, -20.5F);

		rightTrackWheelModels[39].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 364
		rightTrackWheelModels[39].setRotationPoint(-1.5F, -4.5F, -20.5F);

		rightTrackWheelModels[40].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 365
		rightTrackWheelModels[40].setRotationPoint(-1.5F, -4.5F, -20.5F);

		rightTrackWheelModels[41].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 366
		rightTrackWheelModels[41].setRotationPoint(-1.5F, -4.5F, -20.5F);

		rightTrackWheelModels[42].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 367
		rightTrackWheelModels[42].setRotationPoint(-15.5F, -4.5F, -20.5F);

		rightTrackWheelModels[43].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 368
		rightTrackWheelModels[43].setRotationPoint(-15.5F, -4.5F, -20.5F);

		rightTrackWheelModels[44].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 369
		rightTrackWheelModels[44].setRotationPoint(-15.5F, -4.5F, -20.5F);

		rightTrackWheelModels[45].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 370
		rightTrackWheelModels[45].setRotationPoint(-29F, -4.5F, -20.5F);

		rightTrackWheelModels[46].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 371
		rightTrackWheelModels[46].setRotationPoint(-29F, -4.5F, -20.5F);

		rightTrackWheelModels[47].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 372
		rightTrackWheelModels[47].setRotationPoint(-29F, -4.5F, -20.5F);

		rightTrackWheelModels[48].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 341
		rightTrackWheelModels[48].setRotationPoint(-51F, 4.6F, -23F);

		rightTrackWheelModels[49].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 342
		rightTrackWheelModels[49].setRotationPoint(-50F, 5.7F, -21.5F);

		rightTrackWheelModels[50].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 343
		rightTrackWheelModels[50].setRotationPoint(-50F, 5.1F, -21.5F);

		rightTrackWheelModels[51].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 344
		rightTrackWheelModels[51].setRotationPoint(-50F, 11.5F, -21.5F);

		rightTrackWheelModels[52].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 345
		rightTrackWheelModels[52].setRotationPoint(-51F, 4.6F, -23F);

		rightTrackWheelModels[53].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 346
		rightTrackWheelModels[53].setRotationPoint(-51F, 4.6F, -23F);

		rightTrackWheelModels[54].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 351
		rightTrackWheelModels[54].setRotationPoint(-44F, -4.5F, -20.5F);

		rightTrackWheelModels[55].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 352
		rightTrackWheelModels[55].setRotationPoint(-44F, -4.5F, -20.5F);

		rightTrackWheelModels[56].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 353
		rightTrackWheelModels[56].setRotationPoint(-44F, -4.5F, -20.5F);

		rightTrackWheelModels[57].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 356
		rightTrackWheelModels[57].setRotationPoint(-44F, -4.5F, 25.5F);

		rightTrackWheelModels[58].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 357
		rightTrackWheelModels[58].setRotationPoint(-44F, -4.5F, 25.5F);

		rightTrackWheelModels[59].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 358
		rightTrackWheelModels[59].setRotationPoint(-44F, -4.5F, 25.5F);

		rightTrackWheelModels[60].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,-3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 359
		rightTrackWheelModels[60].setRotationPoint(-50F, 5.7F, 24.5F);

		rightTrackWheelModels[61].addShapeBox(-5.5F, -2F, -3F, 9, 3, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 360
		rightTrackWheelModels[61].setRotationPoint(-50F, 5.1F, 24.5F);

		rightTrackWheelModels[62].addShapeBox(-5.5F, -5F, -3F, 9, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F, -3F, 0.6F, 0.2F); // Box 361
		rightTrackWheelModels[62].setRotationPoint(-50F, 11.5F, 24.5F);

		rightTrackWheelModels[63].addShapeBox(-2.5F, 0.45F, -2F, 5, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F); // Box 362
		rightTrackWheelModels[63].setRotationPoint(-51F, 4.6F, 25F);

		rightTrackWheelModels[64].addShapeBox(-2.5F, -1F, -2F, 5, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 363
		rightTrackWheelModels[64].setRotationPoint(-51F, 4.6F, 25F);

		rightTrackWheelModels[65].addShapeBox(-2.5F, -2.45F, -2F, 5, 2, 2, 0F,-1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 364
		rightTrackWheelModels[65].setRotationPoint(-51F, 4.6F, 25F);

		rightTrackWheelModels[66].addShapeBox(-5.5F, -5F, -3F, 8, 2, 3, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F); // Box 365
		rightTrackWheelModels[66].setRotationPoint(-60.8F, 4.4F, 24.5F);

		rightTrackWheelModels[67].addShapeBox(-5.5F, -2F, -3F, 8, 2, 3, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 366
		rightTrackWheelModels[67].setRotationPoint(-60.8F, -1.3F, 24.5F);

		rightTrackWheelModels[68].addShapeBox(-5.5F, -5F, -3F, 8, 2, 3, 0F,-2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, -2.5F, 0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 367
		rightTrackWheelModels[68].setRotationPoint(-60.8F, -1F, 24.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 611
		leftTrackModel[1] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 427
		leftTrackModel[2] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 66
		leftTrackModel[3] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 48
		leftTrackModel[4] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 61
		leftTrackModel[5] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 62
		leftTrackModel[6] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 436
		leftTrackModel[7] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 437

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 58, 1, 4, 0F,1F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 1F, -0.2F, 0.2F, 1.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 1.2F, -0.2F, 0.2F); // Box 611
		leftTrackModel[0].setRotationPoint(-36.5F, 8.8F, 20.7F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 79, 1, 4, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 427
		leftTrackModel[1].setRotationPoint(-47.5F, -7.4F, 20.7F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 5F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 5F, 0.2F, -0.2F, -5.2F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, -0.2F, -5.2F, 0.2F); // Box 66
		leftTrackModel[2].setRotationPoint(-68.6F, 3.9F, 20.7F);
		leftTrackModel[2].rotateAngleZ = -0.33161256F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0.2F, -0.2F, 0.2F, -0.2F, 2F, 0.2F, -0.2F, 2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.1F, -2.35F, 0.2F, -0.1F, -2.35F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 48
		leftTrackModel[3].setRotationPoint(21.3F, 8.8F, 20.7F);
		leftTrackModel[3].rotateAngleZ = 0.50614548F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.6F, -0.2F, 0.2F, 0.25F, -1.1F, 0.2F, 0.25F, -1.1F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.6F, -0.2F, 0.2F); // Box 61
		leftTrackModel[4].setRotationPoint(-66.5F, -5.15F, 20.7F);
		leftTrackModel[4].rotateAngleZ = 0.95993109F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 62
		leftTrackModel[5].setRotationPoint(-67.2F, -0.4F, 20.7F);
		leftTrackModel[5].rotateAngleZ = 1.3962634F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.6F, -0.2F, 0.2F, 0.25F, -1.1F, 0.2F, 0.25F, -1.1F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.6F, -0.2F, 0.2F); // Box 436
		leftTrackModel[6].setRotationPoint(32.35F, -7.05F, 20.7F);
		leftTrackModel[6].rotateAngleZ = -0.54105207F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0.4F, 0.2F, -0.2F, 0.4F, 0.2F, -0.2F, 0F, 0.2F); // Box 437
		leftTrackModel[7].setRotationPoint(33.75F, -4.45F, 20.7F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 438
		rightTrackModel[1] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 439
		rightTrackModel[2] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 440
		rightTrackModel[3] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 441
		rightTrackModel[4] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 442
		rightTrackModel[5] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 443
		rightTrackModel[6] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 444
		rightTrackModel[7] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 445
		rightTrackModel[8] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 354
		rightTrackModel[9] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 355

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0.2F, -0.2F, 0.2F, -0.2F, 2F, 0.2F, -0.2F, 2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.1F, -2.35F, 0.2F, -0.1F, -2.35F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 438
		rightTrackModel[0].setRotationPoint(21.3F, 8.8F, -25.3F);
		rightTrackModel[0].rotateAngleZ = 0.50614548F;

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.6F, -0.2F, 0.2F, 0.25F, -1.1F, 0.2F, 0.25F, -1.1F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.6F, -0.2F, 0.2F); // Box 439
		rightTrackModel[1].setRotationPoint(32.35F, -7.05F, -25.3F);
		rightTrackModel[1].rotateAngleZ = -0.54105207F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0.4F, 0.2F, -0.2F, 0.4F, 0.2F, -0.2F, 0F, 0.2F); // Box 440
		rightTrackModel[2].setRotationPoint(33.75F, -4.45F, -25.3F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 95, 1, 4, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 441
		rightTrackModel[3].setRotationPoint(-63.5F, -7.4F, -25.3F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F,1F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 1F, -0.2F, 0.2F, 1.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 1.2F, -0.2F, 0.2F); // Box 442
		rightTrackModel[4].setRotationPoint(-52.5F, 8.8F, -25.3F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.6F, -0.2F, 0.2F, 0.25F, -1.1F, 0.2F, 0.25F, -1.1F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.6F, -0.2F, 0.2F); // Box 443
		rightTrackModel[5].setRotationPoint(-66.5F, -5.15F, -25.3F);
		rightTrackModel[5].rotateAngleZ = 0.95993109F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 444
		rightTrackModel[6].setRotationPoint(-67.2F, -0.4F, -25.3F);
		rightTrackModel[6].rotateAngleZ = 1.3962634F;

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 5F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 5F, 0.2F, -0.2F, -5.2F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, -0.2F, -5.2F, 0.2F); // Box 445
		rightTrackModel[7].setRotationPoint(-68.6F, 3.9F, -25.3F);
		rightTrackModel[7].rotateAngleZ = -0.33161256F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 74, 1, 4, 0F,1F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 1F, -0.2F, 0.2F, 1.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 1.2F, -0.2F, 0.2F); // Box 354
		rightTrackModel[8].setRotationPoint(-52.5F, 8.8F, 20.7F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 95, 1, 4, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 355
		rightTrackModel[9].setRotationPoint(-63.5F, -7.4F, 20.7F);
	}
}