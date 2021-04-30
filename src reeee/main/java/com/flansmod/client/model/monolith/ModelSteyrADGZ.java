//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Steyr ADGZ
// Model Creator: 
// Created on: 04.04.2016 - 20:31:24
// Last changed on: 04.04.2016 - 20:31:24

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSteyrADGZ extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSteyrADGZ() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[303];
		turretModel = new ModelRendererTurbo[10];
		barrelModel = new ModelRendererTurbo[4];
		leftFrontWheelModel = new ModelRendererTurbo[20];
		rightFrontWheelModel = new ModelRendererTurbo[20];
		leftBackWheelModel = new ModelRendererTurbo[20];
		rightBackWheelModel = new ModelRendererTurbo[20];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();



		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 202
		bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 202
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 202
		bodyModel[4] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 202
		bodyModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 86
		bodyModel[6] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 87
		bodyModel[7] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 88
		bodyModel[8] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 89
		bodyModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 202
		bodyModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 202
		bodyModel[11] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 94
		bodyModel[12] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 102
		bodyModel[13] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 104
		bodyModel[14] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 105
		bodyModel[15] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 106
		bodyModel[16] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 107
		bodyModel[17] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 110
		bodyModel[18] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 112
		bodyModel[19] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 113
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 121
		bodyModel[21] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 125
		bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 126
		bodyModel[23] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 127
		bodyModel[24] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 129
		bodyModel[26] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 130
		bodyModel[27] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 132
		bodyModel[28] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 135
		bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 136
		bodyModel[30] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 202
		bodyModel[31] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 202
		bodyModel[32] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 202
		bodyModel[33] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 202
		bodyModel[34] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 143
		bodyModel[35] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 144
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 145
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 146
		bodyModel[38] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 147
		bodyModel[39] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 148
		bodyModel[40] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 149
		bodyModel[41] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 150
		bodyModel[42] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 151
		bodyModel[43] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 153
		bodyModel[44] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 154
		bodyModel[45] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 155
		bodyModel[46] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 156
		bodyModel[47] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 163
		bodyModel[48] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 164
		bodyModel[49] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 202
		bodyModel[50] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 175
		bodyModel[51] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 176
		bodyModel[52] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 164
		bodyModel[53] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 165
		bodyModel[54] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 169
		bodyModel[55] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 170
		bodyModel[56] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 171
		bodyModel[57] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 172
		bodyModel[58] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 202
		bodyModel[59] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 202
		bodyModel[60] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 202
		bodyModel[61] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 202
		bodyModel[62] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 177
		bodyModel[63] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 181
		bodyModel[64] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 168
		bodyModel[65] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 169
		bodyModel[66] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 170
		bodyModel[67] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 171
		bodyModel[68] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 175
		bodyModel[69] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 176
		bodyModel[70] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 177
		bodyModel[71] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 178
		bodyModel[72] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 180
		bodyModel[73] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 181
		bodyModel[74] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 182
		bodyModel[75] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 183
		bodyModel[76] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 184
		bodyModel[77] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 185
		bodyModel[78] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 186
		bodyModel[79] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 187
		bodyModel[80] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 188
		bodyModel[81] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 189
		bodyModel[82] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 190
		bodyModel[83] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 191
		bodyModel[84] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 193
		bodyModel[85] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 200
		bodyModel[86] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 202
		bodyModel[87] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 204
		bodyModel[88] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 205
		bodyModel[89] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 206
		bodyModel[90] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 207
		bodyModel[91] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 209
		bodyModel[92] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 210
		bodyModel[93] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 211
		bodyModel[94] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 212
		bodyModel[95] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 214
		bodyModel[96] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 215
		bodyModel[97] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 202
		bodyModel[98] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 202
		bodyModel[99] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 202
		bodyModel[100] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 202
		bodyModel[101] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 202
		bodyModel[102] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 202
		bodyModel[103] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 202
		bodyModel[104] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 202
		bodyModel[105] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 202
		bodyModel[106] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 202
		bodyModel[107] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 202
		bodyModel[108] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 202
		bodyModel[109] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 202
		bodyModel[110] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 202
		bodyModel[111] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 202
		bodyModel[112] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 202
		bodyModel[113] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 202
		bodyModel[114] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 247
		bodyModel[115] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 248
		bodyModel[116] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 250
		bodyModel[117] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 251
		bodyModel[118] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 252
		bodyModel[119] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 253
		bodyModel[120] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 254
		bodyModel[121] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 255
		bodyModel[122] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 256
		bodyModel[123] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 257
		bodyModel[124] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 258
		bodyModel[125] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 259
		bodyModel[126] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 260
		bodyModel[127] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 261
		bodyModel[128] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 262
		bodyModel[129] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 263
		bodyModel[130] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 265
		bodyModel[131] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 266
		bodyModel[132] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 267
		bodyModel[133] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 268
		bodyModel[134] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 269
		bodyModel[135] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 270
		bodyModel[136] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 281
		bodyModel[137] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 287
		bodyModel[138] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 290
		bodyModel[139] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 291
		bodyModel[140] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 292
		bodyModel[141] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 293
		bodyModel[142] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 294
		bodyModel[143] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 295
		bodyModel[144] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 296
		bodyModel[145] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 302
		bodyModel[146] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 303
		bodyModel[147] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 304
		bodyModel[148] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 305
		bodyModel[149] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 307
		bodyModel[150] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 308
		bodyModel[151] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 309
		bodyModel[152] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 310
		bodyModel[153] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 311
		bodyModel[154] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 312
		bodyModel[155] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 313
		bodyModel[156] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 314
		bodyModel[157] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 315
		bodyModel[158] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 316
		bodyModel[159] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 317
		bodyModel[160] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 328
		bodyModel[161] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 329
		bodyModel[162] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 330
		bodyModel[163] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 332
		bodyModel[164] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 333
		bodyModel[165] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 334
		bodyModel[166] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 335
		bodyModel[167] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 337
		bodyModel[168] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 338
		bodyModel[169] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 339
		bodyModel[170] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 340
		bodyModel[171] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 341
		bodyModel[172] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 342
		bodyModel[173] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 343
		bodyModel[174] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 344
		bodyModel[175] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 345
		bodyModel[176] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 346
		bodyModel[177] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 347
		bodyModel[178] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 348
		bodyModel[179] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 349
		bodyModel[180] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 350
		bodyModel[181] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 351
		bodyModel[182] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 352
		bodyModel[183] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 353
		bodyModel[184] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 354
		bodyModel[185] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 355
		bodyModel[186] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 356
		bodyModel[187] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 357
		bodyModel[188] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 358
		bodyModel[189] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 359
		bodyModel[190] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 360
		bodyModel[191] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 361
		bodyModel[192] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 362
		bodyModel[193] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 363
		bodyModel[194] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 364
		bodyModel[195] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 365
		bodyModel[196] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 366
		bodyModel[197] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 367
		bodyModel[198] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 368
		bodyModel[199] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 369
		bodyModel[200] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 370
		bodyModel[201] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 371
		bodyModel[202] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 372
		bodyModel[203] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 373
		bodyModel[204] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 374
		bodyModel[205] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 375
		bodyModel[206] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 376
		bodyModel[207] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 377
		bodyModel[208] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 378
		bodyModel[209] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 379
		bodyModel[210] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 380
		bodyModel[211] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 381
		bodyModel[212] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 383
		bodyModel[213] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 385
		bodyModel[214] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 386
		bodyModel[215] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 387
		bodyModel[216] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 388
		bodyModel[217] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 389
		bodyModel[218] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 390
		bodyModel[219] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 391
		bodyModel[220] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 392
		bodyModel[221] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 393
		bodyModel[222] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 334
		bodyModel[223] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 335
		bodyModel[224] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 336
		bodyModel[225] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 339
		bodyModel[226] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 340
		bodyModel[227] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 341
		bodyModel[228] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 342
		bodyModel[229] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 343
		bodyModel[230] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 344
		bodyModel[231] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 345
		bodyModel[232] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 346
		bodyModel[233] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 347
		bodyModel[234] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 348
		bodyModel[235] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 349
		bodyModel[236] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 350
		bodyModel[237] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 351
		bodyModel[238] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 353
		bodyModel[239] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 354
		bodyModel[240] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 355
		bodyModel[241] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 356
		bodyModel[242] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 357
		bodyModel[243] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 360
		bodyModel[244] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 362
		bodyModel[245] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 363
		bodyModel[246] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 364
		bodyModel[247] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 348
		bodyModel[248] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 349
		bodyModel[249] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 350
		bodyModel[250] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 351
		bodyModel[251] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 352
		bodyModel[252] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 353
		bodyModel[253] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 354
		bodyModel[254] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 355
		bodyModel[255] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 356
		bodyModel[256] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 357
		bodyModel[257] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 358
		bodyModel[258] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 359
		bodyModel[259] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 360
		bodyModel[260] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 361
		bodyModel[261] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 362
		bodyModel[262] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 363
		bodyModel[263] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 364
		bodyModel[264] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 365
		bodyModel[265] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 366
		bodyModel[266] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 367
		bodyModel[267] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 368
		bodyModel[268] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 369
		bodyModel[269] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 370
		bodyModel[270] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 371
		bodyModel[271] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 372
		bodyModel[272] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 373
		bodyModel[273] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 374
		bodyModel[274] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 375
		bodyModel[275] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 376
		bodyModel[276] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 377
		bodyModel[277] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 378
		bodyModel[278] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 379
		bodyModel[279] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 380
		bodyModel[280] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 381
		bodyModel[281] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 382
		bodyModel[282] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 383
		bodyModel[283] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 384
		bodyModel[284] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 385
		bodyModel[285] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 388
		bodyModel[286] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 389
		bodyModel[287] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 390
		bodyModel[288] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 391
		bodyModel[289] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 392
		bodyModel[290] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 395
		bodyModel[291] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 398
		bodyModel[292] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 399
		bodyModel[293] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 400
		bodyModel[294] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 401
		bodyModel[295] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 402
		bodyModel[296] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 403
		bodyModel[297] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 404
		bodyModel[298] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 405
		bodyModel[299] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 401
		bodyModel[300] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 402
		bodyModel[301] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 401
		bodyModel[302] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 402

		bodyModel[0].addShapeBox(0F, 0F, 0F, 112, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -6F, 0F, -6F, -6F, 0F, -6F, -3F, 0F, -3F); // Box 14
		bodyModel[0].setRotationPoint(-55F, -5F, -8.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 3, 36, 0F); // Box 202
		bodyModel[1].setRotationPoint(39.5F, -1F, -18.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 3, 36, 0F); // Box 202
		bodyModel[2].setRotationPoint(-44.5F, -1F, -18.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 3, 40, 0F); // Box 202
		bodyModel[3].setRotationPoint(-12.5F, -1F, -20.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 3, 40, 0F); // Box 202
		bodyModel[4].setRotationPoint(7.5F, -1F, -20.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 22, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, -6F); // Box 86
		bodyModel[5].setRotationPoint(14F, -9.5F, 3.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 22, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, -6F); // Box 87
		bodyModel[6].setRotationPoint(-38F, -9.5F, 3.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 22, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 88
		bodyModel[7].setRotationPoint(-38F, -9.5F, -18.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 22, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -6F, -9F, 0F, -6F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 89
		bodyModel[8].setRotationPoint(14F, -9.5F, -18.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 23, 9, 2, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[9].setRotationPoint(-12.5F, -9F, 7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 23, 9, 2, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[10].setRotationPoint(-12.5F, -9F, -10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 9, 16, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[11].setRotationPoint(-55F, -14F, -8.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 15, 1, 10, 0F); // Box 102
		bodyModel[12].setRotationPoint(-54.3F, -7.4F, 7.5F);
		bodyModel[12].rotateAngleZ = 0.46059239F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[13].setRotationPoint(46F, -10.47F, 7.5F);
		bodyModel[13].rotateAngleZ = -0.45378561F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 10, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[14].setRotationPoint(46F, -10.47F, -18.5F);
		bodyModel[14].rotateAngleZ = -0.45378561F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 80, 4, 3, 0F,-12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 106
		bodyModel[15].setRotationPoint(-41F, -18F, -18.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 56, 7, 5, 0F,-4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 107
		bodyModel[16].setRotationPoint(-29F, -25F, -17.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 7, 1, 25, 0F); // Box 110
		bodyModel[17].setRotationPoint(-4F, -26F, -13F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 112
		bodyModel[18].setRotationPoint(3F, -26F, -13F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 1, 25, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 113
		bodyModel[19].setRotationPoint(-13F, -26F, -13F);

		bodyModel[20].addBox(0F, -1F, 0F, 21, 1, 1, 0F); // Box 121
		bodyModel[20].setRotationPoint(35F, -15.5F, 5.5F);
		bodyModel[20].rotateAngleZ = -0.45378561F;

		bodyModel[21].addBox(0F, 0F, 0F, 0, 4, 14, 0F); // Box 125
		bodyModel[21].setRotationPoint(54.4F, -10.5F, -7.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 0, 4, 14, 0F); // Box 126
		bodyModel[22].setRotationPoint(51.4F, -12F, -7.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 4, 14, 0F); // Box 127
		bodyModel[23].setRotationPoint(48.4F, -13.6F, -7.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 0, 4, 14, 0F); // Box 128
		bodyModel[24].setRotationPoint(45.4F, -15.1F, -7.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 0, 4, 14, 0F); // Box 129
		bodyModel[25].setRotationPoint(42.4F, -16.6F, -7.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 0, 4, 14, 0F); // Box 130
		bodyModel[26].setRotationPoint(39.4F, -18.2F, -7.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 0, 4, 14, 0F); // Box 132
		bodyModel[27].setRotationPoint(36.4F, -19.3F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 22, 3, 16, 0F,-4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, -4F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[28].setRotationPoint(-51F, -17F, -8.5F);

		bodyModel[29].addTrapezoid(0F, 0F, 0F, 3, 3, 3, 0F, 2.00F, ModelRendererTurbo.MR_LEFT); // Box 136
		bodyModel[29].setRotationPoint(-56.5F, -7F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 202
		bodyModel[30].setRotationPoint(-53.9F, -8.9F, 8F);
		bodyModel[30].rotateAngleZ = 0.45378561F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[31].setRotationPoint(-54.35F, -9.8F, 8F);
		bodyModel[31].rotateAngleZ = 0.45378561F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[32].setRotationPoint(-54.8F, -10.7F, 8F);
		bodyModel[32].rotateAngleZ = 0.45378561F;

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 202
		bodyModel[33].setRotationPoint(-55F, -8.8F, 9F);
		bodyModel[33].rotateAngleZ = 0.55850536F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[34].setRotationPoint(-47F, -13F, 7.5F);
		bodyModel[34].rotateAngleZ = 0.43633231F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 144
		bodyModel[35].setRotationPoint(49F, -10.5F, 12.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 145
		bodyModel[36].setRotationPoint(49F, -10.5F, -16.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 146
		bodyModel[37].setRotationPoint(-52F, -10.5F, -17.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 147
		bodyModel[38].setRotationPoint(-52F, -10.5F, 12.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[39].setRotationPoint(49F, -12.5F, 12.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[40].setRotationPoint(49F, -12.5F, -16.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[41].setRotationPoint(-52F, -12.5F, 12.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[42].setRotationPoint(-52F, -12.5F, -17.5F);

		bodyModel[43].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.50F, ModelRendererTurbo.MR_LEFT); // Box 153
		bodyModel[43].setRotationPoint(25F, -24F, -1F);

		bodyModel[44].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.50F, ModelRendererTurbo.MR_LEFT); // Box 154
		bodyModel[44].setRotationPoint(25F, -25F, -3.5F);

		bodyModel[45].addTrapezoid(0F, 0F, 0F, 1, 1, 1, 0F, 0.50F, ModelRendererTurbo.MR_LEFT); // Box 155
		bodyModel[45].setRotationPoint(25F, -25F, 1.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0F); // Box 156
		bodyModel[46].setRotationPoint(23F, -25F, -4F);

		bodyModel[47].addTrapezoid(0F, 0F, 0F, 2, 1, 1, 0F, 1.00F, ModelRendererTurbo.MR_RIGHT); // Box 163
		bodyModel[47].setRotationPoint(26F, -19.5F, 9F);

		bodyModel[48].addTrapezoid(0F, 0F, 0F, 2, 1, 1, 0F, 1.00F, ModelRendererTurbo.MR_LEFT); // Box 164
		bodyModel[48].setRotationPoint(-30F, -19.5F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[49].setRotationPoint(-36F, -19.55F, 9F);
		bodyModel[49].rotateAngleY = -0.01745329F;
		bodyModel[49].rotateAngleZ = 0.01745329F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 175
		bodyModel[50].setRotationPoint(12.5F, -13F, 17.5F);
		bodyModel[50].rotateAngleX = -0.50614548F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 176
		bodyModel[51].setRotationPoint(12.5F, -23.6F, 14.6F);
		bodyModel[51].rotateAngleX = 0.26179939F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 16, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[52].setRotationPoint(-30.5F, -13F, 17.5F);
		bodyModel[52].rotateAngleX = -0.50614548F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 165
		bodyModel[53].setRotationPoint(-30.5F, -23.6F, 14.6F);
		bodyModel[53].rotateAngleX = 0.26179939F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F,0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[54].setRotationPoint(12.5F, -24.1F, -17.6F);
		bodyModel[54].rotateAngleX = -0.26179939F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 16, 12, 2, 0F,0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 170
		bodyModel[55].setRotationPoint(12.5F, -12F, -20.3F);
		bodyModel[55].rotateAngleX = 0.50614548F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 12, 2, 0F,0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[56].setRotationPoint(-30.5F, -12F, -20.3F);
		bodyModel[56].rotateAngleX = 0.50614548F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 16, 11, 2, 0F,-9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[57].setRotationPoint(-30.5F, -24.1F, -17.6F);
		bodyModel[57].rotateAngleX = -0.26179939F;

		bodyModel[58].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 202
		bodyModel[58].setRotationPoint(40.5F, -11F, 9.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 202
		bodyModel[59].setRotationPoint(-43.5F, -11F, 9.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 202
		bodyModel[60].setRotationPoint(-43.5F, -11F, -11.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Box 202
		bodyModel[61].setRotationPoint(40.5F, -11F, -11.5F);

		bodyModel[62].addBox(0F, -1F, 0F, 21, 1, 1, 0F); // Box 177
		bodyModel[62].setRotationPoint(35F, -15.5F, -7.5F);
		bodyModel[62].rotateAngleZ = -0.45378561F;

		bodyModel[63].addShapeBox(-2F, 0F, 0F, 80, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F); // Box 181
		bodyModel[63].setRotationPoint(-39F, -14F, 16.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[64].setRotationPoint(49F, -11F, 12.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[65].setRotationPoint(49F, -11F, 16.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[66].setRotationPoint(49F, -11F, -12.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[67].setRotationPoint(49F, -11F, -16.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[68].setRotationPoint(49F, -12.8F, -15.6F);
		bodyModel[68].rotateAngleX = -0.4712389F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[69].setRotationPoint(49F, -12.8F, 13.4F);
		bodyModel[69].rotateAngleX = -0.4712389F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[70].setRotationPoint(49F, -12.8F, 15.6F);
		bodyModel[70].rotateAngleX = 0.4712389F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[71].setRotationPoint(49F, -12.8F, -13.4F);
		bodyModel[71].rotateAngleX = 0.4712389F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 180
		bodyModel[72].setRotationPoint(49F, -12.8F, 13.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 181
		bodyModel[73].setRotationPoint(49F, -12.8F, -15.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.05F, 0F, 0F); // Box 182
		bodyModel[74].setRotationPoint(-52F, -11F, -17.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.05F, 0F, 0F); // Box 183
		bodyModel[75].setRotationPoint(-52F, -11F, -13.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.05F, 0F, 0F); // Box 184
		bodyModel[76].setRotationPoint(-52F, -11F, 12.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 0, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.05F, 0F, 0F); // Box 185
		bodyModel[77].setRotationPoint(-52F, -11F, 16.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 186
		bodyModel[78].setRotationPoint(-52F, -12.8F, -16.6F);
		bodyModel[78].rotateAngleX = -0.4712389F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 187
		bodyModel[79].setRotationPoint(-52F, -12.8F, -14.4F);
		bodyModel[79].rotateAngleX = 0.4712389F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0.05F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F); // Box 188
		bodyModel[80].setRotationPoint(-52F, -12.8F, -16.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 189
		bodyModel[81].setRotationPoint(-52F, -12.8F, 15.6F);
		bodyModel[81].rotateAngleX = 0.4712389F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0.05F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0.05F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.05F, 0F, 0.1F); // Box 190
		bodyModel[82].setRotationPoint(-52F, -12.8F, 13.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 0, 0F,0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 191
		bodyModel[83].setRotationPoint(-52F, -12.8F, 13.4F);
		bodyModel[83].rotateAngleX = -0.4712389F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 193
		bodyModel[84].setRotationPoint(-52.05F, -9.5F, -17.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 56, 7, 5, 0F,-4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[85].setRotationPoint(-29F, -25F, 11.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 48, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[86].setRotationPoint(-25F, -25F, -15.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 80, 4, 3, 0F,-12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[87].setRotationPoint(-41F, -18F, 14.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 13, 4, 36, 0F,0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[88].setRotationPoint(26F, -18F, -18.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 13, 4, 36, 0F,-12F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[89].setRotationPoint(-41F, -18F, -18.5F);

		bodyModel[90].addShapeBox(-2F, 0F, 0F, 13, 5, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 9F, -0.5F, 0F); // Box 207
		bodyModel[90].setRotationPoint(-39F, -14F, -18.5F);

		bodyModel[91].addShapeBox(-2F, 0F, 0F, 80, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F); // Box 209
		bodyModel[91].setRotationPoint(-39F, -14F, -18.5F);

		bodyModel[92].addShapeBox(-2F, 0F, 0F, 13, 5, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 9F, -0.5F, 0F, 9F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[92].setRotationPoint(28F, -14F, -18.5F);

		bodyModel[93].addShapeBox(-2F, 0F, 0F, 80, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 211
		bodyModel[93].setRotationPoint(-39F, -10F, 7.5F);

		bodyModel[94].addShapeBox(-2F, 0F, 0F, 80, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 212
		bodyModel[94].setRotationPoint(-39F, -10F, -18.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 30, 9, 16, 0F,0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[95].setRotationPoint(27F, -14F, -8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 55, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[96].setRotationPoint(-28F, -10F, -8.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 202
		bodyModel[97].setRotationPoint(22F, -19.4F, 9.1F);
		bodyModel[97].rotateAngleY = -0.01745329F;
		bodyModel[97].rotateAngleZ = 0.01745329F;

		bodyModel[98].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 202
		bodyModel[98].setRotationPoint(-30F, -19.5F, 9F);
		bodyModel[98].rotateAngleY = -0.01745329F;
		bodyModel[98].rotateAngleZ = 0.01745329F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 202
		bodyModel[99].setRotationPoint(-25F, -18.6F, 8.9F);
		bodyModel[99].rotateAngleY = -0.01745329F;
		bodyModel[99].rotateAngleZ = 0.01745329F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 202
		bodyModel[100].setRotationPoint(22.5F, -19.75F, 8.5F);
		bodyModel[100].rotateAngleY = -0.01745329F;
		bodyModel[100].rotateAngleZ = 0.01745329F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 202
		bodyModel[101].setRotationPoint(-25.75F, -19.75F, 9.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 13, 10, 10, 0F,-10F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[102].setRotationPoint(14F, -19F, -5.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 202
		bodyModel[103].setRotationPoint(-15F, -17F, 3.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 202
		bodyModel[104].setRotationPoint(-15F, -17F, -14.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 202
		bodyModel[105].setRotationPoint(12F, -17F, -14.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Box 202
		bodyModel[106].setRotationPoint(12F, -17F, 3.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 5, 35, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[107].setRotationPoint(21F, -15F, -18F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 5, 35, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[108].setRotationPoint(-28F, -15F, -18F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 202
		bodyModel[109].setRotationPoint(22F, -18.5F, 9.07F);
		bodyModel[109].rotateAngleY = -0.01745329F;
		bodyModel[109].rotateAngleZ = 0.01745329F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[110].setRotationPoint(27F, -19.6F, 8.9F);
		bodyModel[110].rotateAngleY = -0.01745329F;
		bodyModel[110].rotateAngleZ = 0.01745329F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.85F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.85F); // Box 202
		bodyModel[111].setRotationPoint(23F, -19.5F, 9.8F);
		bodyModel[111].rotateAngleY = -0.01745329F;
		bodyModel[111].rotateAngleZ = 0.01745329F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 202
		bodyModel[112].setRotationPoint(21.9F, -16F, -11F);
		bodyModel[112].rotateAngleZ = -0.78539816F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 202
		bodyModel[113].setRotationPoint(-26.5F, -13F, -11F);
		bodyModel[113].rotateAngleZ = 0.78539816F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 1F, -1F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, -1F); // Box 247
		bodyModel[114].setRotationPoint(21F, -23F, -5.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 1F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 1F, 1F, 0F); // Box 248
		bodyModel[115].setRotationPoint(-26F, -23F, -5.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 250
		bodyModel[116].setRotationPoint(21.5F, -19F, 2.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 251
		bodyModel[117].setRotationPoint(21.5F, -19F, -4.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[118].setRotationPoint(-24.5F, -19F, -4.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[119].setRotationPoint(-24.5F, -19F, 2.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[120].setRotationPoint(-25.5F, -17F, 2.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 1F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[121].setRotationPoint(-25.5F, -17F, -4.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[122].setRotationPoint(22.5F, -17F, -4.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0.5F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[123].setRotationPoint(22.5F, -17F, 2.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 13, 10, 10, 0F,-1F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[124].setRotationPoint(-29F, -19F, -5.5F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 259
		bodyModel[125].setRotationPoint(20F, -15.5F, 0.5F);
		bodyModel[125].rotateAngleZ = -0.78539816F;

		bodyModel[126].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 260
		bodyModel[126].setRotationPoint(-22.7F, -14.8F, 0.5F);
		bodyModel[126].rotateAngleZ = 0.78539816F;

		bodyModel[127].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 261
		bodyModel[127].setRotationPoint(20.7F, -15.8F, -3.5F);
		bodyModel[127].rotateAngleZ = -0.78539816F;

		bodyModel[128].addBox(0F, 0F, 0F, 1, 6, 4, 0F); // Box 262
		bodyModel[128].setRotationPoint(-23F, -14.8F, -3.5F);
		bodyModel[128].rotateAngleZ = 0.78539816F;

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 263
		bodyModel[129].setRotationPoint(19.2F, -14.8F, -1F);
		bodyModel[129].rotateAngleZ = -0.78539816F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 265
		bodyModel[130].setRotationPoint(18F, -13F, -0.75F);
		bodyModel[130].rotateAngleZ = -0.78539816F;

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 266
		bodyModel[131].setRotationPoint(-21.8F, -13.9F, -1F);
		bodyModel[131].rotateAngleZ = 0.78539816F;

		bodyModel[132].addShapeBox(0F, -1F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 267
		bodyModel[132].setRotationPoint(-19.7F, -11.95F, -0.75F);
		bodyModel[132].rotateAngleZ = 0.78539816F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[133].setRotationPoint(-25.5F, -24F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 269
		bodyModel[134].setRotationPoint(22.5F, -24F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.35F, -0.05F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, -0.35F, -0.35F, -0.05F, -0.35F, -0.6F, -0.7F, 0F, 0F, -1F, 0F, 0F, -1F, -0.35F, -0.6F, -0.7F, -0.35F); // Box 270
		bodyModel[135].setRotationPoint(21F, -15.5F, -12.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.15F, -0.15F, -0.25F, -1.5F, 3.2F, -0.25F, -1.5F, 3.2F, -0.25F, -0.15F, -0.15F, -0.25F, -0.4F, -0.45F, -0.25F, -1.15F, -3.95F, -0.25F, -1.15F, -3.95F, -0.25F, -0.4F, -0.45F, -0.25F); // Box 281
		bodyModel[136].setRotationPoint(19.65F, -14.05F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.36F, 0.02F, -1.5F, -0.29F, 0.35F, -1.5F, -0.29F, 0.35F, -1.5F, -0.36F, 0.02F, -1.5F, -0.7F, -0.65F, -1.5F, 0.05F, -1F, -1.5F, 0.05F, -1F, -1.5F, -0.7F, -0.65F, -1.5F); // Box 287
		bodyModel[137].setRotationPoint(22.5F, -17F, -13F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.36F, 0.02F, -1.5F, -0.29F, 0.35F, -1.5F, -0.29F, 0.35F, -1.5F, -0.36F, 0.02F, -1.5F, -0.7F, -0.65F, -1.5F, 0.05F, -1F, -1.5F, 0.05F, -1F, -1.5F, -0.7F, -0.65F, -1.5F); // Box 290
		bodyModel[138].setRotationPoint(19.3F, -13.8F, -13F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.29F, 0.35F, -1.5F, -0.36F, 0.02F, -1.5F, -0.36F, 0.02F, -1.5F, -0.29F, 0.35F, -1.5F, 0.05F, -1F, -1.5F, -0.7F, -0.65F, -1.5F, -0.7F, -0.65F, -1.5F, 0.05F, -1F, -1.5F); // Box 291
		bodyModel[139].setRotationPoint(-25.1F, -17F, -13F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.29F, 0.35F, -1.5F, -0.36F, 0.02F, -1.5F, -0.36F, 0.02F, -1.5F, -0.29F, 0.35F, -1.5F, 0.05F, -1F, -1.5F, -0.7F, -0.65F, -1.5F, -0.7F, -0.65F, -1.5F, 0.05F, -1F, -1.5F); // Box 292
		bodyModel[140].setRotationPoint(-21.9F, -13.8F, -13F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.25F, 0.9F, -0.25F, -2.16F, 2.48F, -0.25F, -2.16F, 2.48F, -0.25F, -1.25F, 0.9F, -0.25F, -1.55F, -1.55F, -0.25F, -1.8F, -3.1F, -0.25F, -1.8F, -3.1F, -0.25F, -1.55F, -1.55F, -0.25F); // Box 293
		bodyModel[141].setRotationPoint(19.5F, -14F, -13.25F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.25F, 0.9F, -0.25F, -2.16F, 2.48F, -0.25F, -2.16F, 2.48F, -0.25F, -1.25F, 0.9F, -0.25F, -1.55F, -1.55F, -0.25F, -1.8F, -3.1F, -0.25F, -1.8F, -3.1F, -0.25F, -1.55F, -1.55F, -0.25F); // Box 294
		bodyModel[142].setRotationPoint(19.5F, -14F, -8.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.16F, 2.48F, -0.25F, -1.25F, 0.9F, -0.25F, -1.25F, 0.9F, -0.25F, -2.16F, 2.48F, -0.25F, -1.8F, -3.1F, -0.25F, -1.55F, -1.55F, -0.25F, -1.55F, -1.55F, -0.25F, -1.8F, -3.1F, -0.25F); // Box 295
		bodyModel[143].setRotationPoint(-26.1F, -14F, -8.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-2.16F, 2.48F, -0.25F, -1.25F, 0.9F, -0.25F, -1.25F, 0.9F, -0.25F, -2.16F, 2.48F, -0.25F, -1.8F, -3.1F, -0.25F, -1.55F, -1.55F, -0.25F, -1.55F, -1.55F, -0.25F, -1.8F, -3.1F, -0.25F); // Box 296
		bodyModel[144].setRotationPoint(-26.1F, -14F, -13.25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1.45F, 1.1F, -2F, 0.46F, 1.1F, -2.5F, -0.29F, 0.35F, -1.5F, -0.36F, 0.02F, -1.5F, -1.75F, -1.75F, -2F, 0.75F, -1.75F, -2.5F, 0.05F, -1F, -1.5F, -0.7F, -0.65F, -1.5F); // Box 302
		bodyModel[145].setRotationPoint(19.3F, -13.8F, -15F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.36F, 0.02F, -1.5F, -0.29F, 0.35F, -1.5F, 0.46F, 1.1F, -2.5F, -1.45F, 1.1F, -2F, -0.7F, -0.65F, -1.5F, 0.05F, -1F, -1.5F, 0.75F, -1.75F, -2.5F, -1.75F, -1.75F, -2F); // Box 303
		bodyModel[146].setRotationPoint(19.3F, -13.8F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.29F, 0.35F, -1.5F, -0.36F, 0.02F, -1.5F, -1.45F, 1.1F, -2F, 0.46F, 1.1F, -2.5F, 0.05F, -1F, -1.5F, -0.7F, -0.65F, -1.5F, -1.75F, -1.75F, -2F, 0.75F, -1.75F, -2.5F); // Box 304
		bodyModel[147].setRotationPoint(-21.9F, -13.8F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.46F, 1.1F, -2.5F, -1.45F, 1.1F, -2F, -0.36F, 0.02F, -1.5F, -0.29F, 0.35F, -1.5F, 0.75F, -1.75F, -2.5F, -1.75F, -1.75F, -2F, -0.7F, -0.65F, -1.5F, 0.05F, -1F, -1.5F); // Box 305
		bodyModel[148].setRotationPoint(-21.9F, -13.8F, -15F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.15F, -0.52F, -2.5F, -1.15F, -0.52F, -2F, -0.29F, 0.35F, -1.5F, -0.36F, 0.02F, -1.5F, -0.2F, -0.1F, -2.5F, -0.8F, -0.1F, -2F, 0.05F, -1F, -1.5F, -0.7F, -0.65F, -1.5F); // Box 307
		bodyModel[149].setRotationPoint(22.5F, -17F, -15F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.36F, 0.02F, -1.5F, -0.29F, 0.35F, -1.5F, -1.15F, -0.52F, -2F, 0.15F, -0.52F, -2.5F, -0.7F, -0.65F, -1.5F, 0.05F, -1F, -1.5F, -0.8F, -0.1F, -2F, -0.2F, -0.1F, -2.5F); // Box 308
		bodyModel[150].setRotationPoint(22.5F, -17F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.29F, 0.35F, -1.5F, -0.36F, 0.02F, -1.5F, 0.15F, -0.52F, -2.5F, -1.15F, -0.52F, -2F, 0.05F, -1F, -1.5F, -0.7F, -0.65F, -1.5F, -0.2F, -0.1F, -2.5F, -0.8F, -0.1F, -2F); // Box 309
		bodyModel[151].setRotationPoint(-25.1F, -17F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-1.15F, -0.52F, -2F, 0.15F, -0.52F, -2.5F, -0.36F, 0.02F, -1.5F, -0.29F, 0.35F, -1.5F, -0.8F, -0.1F, -2F, -0.2F, -0.1F, -2.5F, -0.7F, -0.65F, -1.5F, 0.05F, -1F, -1.5F); // Box 310
		bodyModel[152].setRotationPoint(-25.1F, -17F, -15F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 311
		bodyModel[153].setRotationPoint(-52.05F, -10F, -17.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 312
		bodyModel[154].setRotationPoint(-52.05F, -10.5F, -17.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 313
		bodyModel[155].setRotationPoint(-52.05F, -11F, -17.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 314
		bodyModel[156].setRotationPoint(-52.05F, -11.5F, -17.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 315
		bodyModel[157].setRotationPoint(-52.05F, -12F, -17.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 316
		bodyModel[158].setRotationPoint(-52.05F, -12.5F, -17.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F); // Box 317
		bodyModel[159].setRotationPoint(-52.05F, -13F, -17.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 328
		bodyModel[160].setRotationPoint(-52.05F, -12.8F, -17.63F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 329
		bodyModel[161].setRotationPoint(-52.05F, -12.8F, -17.13F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 330
		bodyModel[162].setRotationPoint(-52.05F, -12.8F, -16.63F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 332
		bodyModel[163].setRotationPoint(-52.05F, -12.8F, -16.12F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 333
		bodyModel[164].setRotationPoint(-52.05F, -12.8F, -15.12F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 334
		bodyModel[165].setRotationPoint(-52.05F, -12.8F, -15.62F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 335
		bodyModel[166].setRotationPoint(-52.05F, -12.8F, -14.62F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F); // Box 337
		bodyModel[167].setRotationPoint(-52.05F, -13F, 12.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 338
		bodyModel[168].setRotationPoint(-52.05F, -12.8F, 14.88F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 339
		bodyModel[169].setRotationPoint(-52.05F, -12.8F, 15.38F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 340
		bodyModel[170].setRotationPoint(-52.05F, -12.8F, 14.37F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 341
		bodyModel[171].setRotationPoint(-52.05F, -12.8F, 13.37F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 342
		bodyModel[172].setRotationPoint(-52.05F, -12.8F, 13.87F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 343
		bodyModel[173].setRotationPoint(-52.05F, -12.8F, 12.87F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 344
		bodyModel[174].setRotationPoint(-52.05F, -10.5F, 12.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 345
		bodyModel[175].setRotationPoint(-52.05F, -10F, 12.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 346
		bodyModel[176].setRotationPoint(-52.05F, -11.5F, 12.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 347
		bodyModel[177].setRotationPoint(-52.05F, -11F, 12.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 348
		bodyModel[178].setRotationPoint(-52.05F, -9.5F, 12.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 349
		bodyModel[179].setRotationPoint(-52.05F, -12.8F, 12.37F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 350
		bodyModel[180].setRotationPoint(-52.05F, -12F, 12.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 351
		bodyModel[181].setRotationPoint(-52.05F, -12.5F, 12.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 352
		bodyModel[182].setRotationPoint(51.05F, -12.8F, 15.38F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 353
		bodyModel[183].setRotationPoint(51.05F, -12.8F, -13.62F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 354
		bodyModel[184].setRotationPoint(51.05F, -12.8F, -16.63F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.55F, -0.25F, 0F, -0.55F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 355
		bodyModel[185].setRotationPoint(51.05F, -12.8F, 12.37F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 356
		bodyModel[186].setRotationPoint(51.05F, -12.8F, -15.13F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 357
		bodyModel[187].setRotationPoint(51.05F, -12.8F, -16.13F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 358
		bodyModel[188].setRotationPoint(51.05F, -12.8F, 12.87F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 359
		bodyModel[189].setRotationPoint(51.05F, -12.8F, 13.87F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 360
		bodyModel[190].setRotationPoint(51.05F, -12.8F, -15.63F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 361
		bodyModel[191].setRotationPoint(51.05F, -12.8F, -14.62F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 362
		bodyModel[192].setRotationPoint(51.05F, -12.8F, 13.37F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 363
		bodyModel[193].setRotationPoint(51.05F, -12.8F, 14.37F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 364
		bodyModel[194].setRotationPoint(51.05F, -12.8F, 14.87F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 365
		bodyModel[195].setRotationPoint(51.05F, -12.8F, -14.12F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F); // Box 366
		bodyModel[196].setRotationPoint(51.05F, -13F, -16.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F); // Box 367
		bodyModel[197].setRotationPoint(51.05F, -13F, 12.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 368
		bodyModel[198].setRotationPoint(51.05F, -12.5F, 12.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 369
		bodyModel[199].setRotationPoint(51.05F, -12.5F, -16.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 370
		bodyModel[200].setRotationPoint(51.05F, -12F, 12.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 371
		bodyModel[201].setRotationPoint(51.05F, -12F, -16.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 372
		bodyModel[202].setRotationPoint(51.05F, -9.5F, 12.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 373
		bodyModel[203].setRotationPoint(51.05F, -9.5F, -16.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 374
		bodyModel[204].setRotationPoint(51.05F, -11.5F, -16.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 375
		bodyModel[205].setRotationPoint(51.05F, -11.5F, 12.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 376
		bodyModel[206].setRotationPoint(51.05F, -10.5F, 12.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 377
		bodyModel[207].setRotationPoint(51.05F, -10F, 12.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 378
		bodyModel[208].setRotationPoint(51.05F, -11F, 12.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 379
		bodyModel[209].setRotationPoint(51.05F, -11F, -16.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 380
		bodyModel[210].setRotationPoint(51.05F, -10F, -16.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 381
		bodyModel[211].setRotationPoint(51.05F, -10.5F, -16.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 383
		bodyModel[212].setRotationPoint(19.2F, -14.8F, -2.75F);
		bodyModel[212].rotateAngleZ = -0.78539816F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 385
		bodyModel[213].setRotationPoint(51.05F, -9F, -16.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 386
		bodyModel[214].setRotationPoint(51.05F, -9F, 12.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 387
		bodyModel[215].setRotationPoint(-21F, -14.8F, -2.75F);
		bodyModel[215].rotateAngleZ = -0.78539816F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 388
		bodyModel[216].setRotationPoint(-20F, -13.8F, -2.75F);
		bodyModel[216].rotateAngleZ = -0.78539816F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 389
		bodyModel[217].setRotationPoint(18.2F, -13.8F, -2.75F);
		bodyModel[217].rotateAngleZ = -0.78539816F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 390
		bodyModel[218].setRotationPoint(18.45F, -14.8F, -2.85F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 391
		bodyModel[219].setRotationPoint(-21.4F, -14.8F, -2.85F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 392
		bodyModel[220].setRotationPoint(-20.4F, -13.8F, -2.85F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.35F, -0.5F, 0F, -0.35F); // Box 393
		bodyModel[221].setRotationPoint(17.45F, -13.8F, -2.85F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.25F, 0.3F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, -0.35F, -0.25F, 0.3F, -0.35F, 0F, -1F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, -0.35F, 0F, -1F, -0.35F); // Box 334
		bodyModel[222].setRotationPoint(-23.6F, -15.5F, -12.75F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1.5F, 3.2F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -1.5F, 3.2F, -0.25F, -1.15F, -3.95F, -0.25F, -0.4F, -0.45F, -0.25F, -0.4F, -0.45F, -0.25F, -1.15F, -3.95F, -0.25F); // Box 335
		bodyModel[223].setRotationPoint(-26.25F, -14.05F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.85F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.85F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 336
		bodyModel[224].setRotationPoint(-26F, -19.5F, 7.5F);
		bodyModel[224].rotateAngleY = -0.01745329F;
		bodyModel[224].rotateAngleZ = 0.01745329F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 339
		bodyModel[225].setRotationPoint(-22.7F, -14.8F, 1F);
		bodyModel[225].rotateAngleZ = 0.78539816F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340
		bodyModel[226].setRotationPoint(19.8F, -15.7F, 1F);
		bodyModel[226].rotateAngleZ = -0.78539816F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[227].setRotationPoint(24.3F, -17.75F, 12F);

		bodyModel[228].addShapeBox(-2F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 342
		bodyModel[228].setRotationPoint(26F, -16F, 5.5F);

		bodyModel[229].addShapeBox(-2F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 343
		bodyModel[229].setRotationPoint(-27F, -16F, 6.5F);

		bodyModel[230].addShapeBox(-2F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 344
		bodyModel[230].setRotationPoint(-27F, -17F, 6.5F);

		bodyModel[231].addShapeBox(-2F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 345
		bodyModel[231].setRotationPoint(26F, -17F, 5F);

		bodyModel[232].addShapeBox(-2F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 346
		bodyModel[232].setRotationPoint(26F, -17F, 13F);

		bodyModel[233].addShapeBox(-2F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 347
		bodyModel[233].setRotationPoint(-27F, -17F, 13.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 348
		bodyModel[234].setRotationPoint(24.3F, -17.75F, 11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 349
		bodyModel[235].setRotationPoint(24.3F, -17.75F, 10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 350
		bodyModel[236].setRotationPoint(24.3F, -17.75F, 9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 351
		bodyModel[237].setRotationPoint(24.3F, -17.75F, 8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 353
		bodyModel[238].setRotationPoint(-27.4F, -17.75F, 12F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 354
		bodyModel[239].setRotationPoint(-27.4F, -17.75F, 11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 355
		bodyModel[240].setRotationPoint(-27.4F, -17.75F, 13F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 356
		bodyModel[241].setRotationPoint(-27.4F, -17.75F, 10F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 357
		bodyModel[242].setRotationPoint(-27.4F, -17.75F, 9F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 360
		bodyModel[243].setRotationPoint(-22.6F, -16.4F, 1F);
		bodyModel[243].rotateAngleZ = -0.78539816F;

		bodyModel[244].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 362
		bodyModel[244].setRotationPoint(-22.6F, -16.4F, 2F);
		bodyModel[244].rotateAngleZ = -0.78539816F;

		bodyModel[245].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363
		bodyModel[245].setRotationPoint(20.7F, -16.4F, 1F);
		bodyModel[245].rotateAngleZ = -0.78539816F;

		bodyModel[246].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364
		bodyModel[246].setRotationPoint(20.7F, -16.4F, 2F);
		bodyModel[246].rotateAngleZ = -0.78539816F;

		bodyModel[247].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 348
		bodyModel[247].setRotationPoint(53.4F, -7.3F, -7.5F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 349
		bodyModel[248].setRotationPoint(35F, -16.3F, -7.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 350
		bodyModel[249].setRotationPoint(55.5F, -7F, -1F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[250].setRotationPoint(55.5F, -7.5F, -1F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 352
		bodyModel[251].setRotationPoint(-53.5F, -12F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[252].setRotationPoint(-53.5F, -12.5F, -1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 354
		bodyModel[253].setRotationPoint(55.5F, -6F, -1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.8F, 0.25F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, -0.8F, 0.25F, -0.3F); // Box 355
		bodyModel[254].setRotationPoint(-53.5F, -11F, -1F);

		bodyModel[255].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // Box 356
		bodyModel[255].setRotationPoint(-54.3F, -7.4F, -18.5F);
		bodyModel[255].rotateAngleZ = 0.46059239F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 357
		bodyModel[256].setRotationPoint(38F, -15.47F, 14.5F);
		bodyModel[256].rotateAngleZ = -0.45378561F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F); // Box 358
		bodyModel[257].setRotationPoint(36.1F, -16.43F, 13.5F);
		bodyModel[257].rotateAngleZ = -0.45378561F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Box 359
		bodyModel[258].setRotationPoint(37F, -16F, 13.5F);
		bodyModel[258].rotateAngleZ = -0.45378561F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 360
		bodyModel[259].setRotationPoint(43F, -13.47F, 14F);
		bodyModel[259].rotateAngleZ = -0.45378561F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, -0.65F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 361
		bodyModel[260].setRotationPoint(41.5F, -14F, -13.5F);
		bodyModel[260].rotateAngleZ = -0.45378561F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.55F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.55F, -0.25F, -0.5F); // Box 362
		bodyModel[261].setRotationPoint(46F, -12.47F, -14F);
		bodyModel[261].rotateAngleZ = -0.45378561F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.4F, -0.25F, -0.375F, -0.4F, -0.25F, -0.375F, -0.4F, -0.25F, -0.375F, -0.4F, -0.25F, -0.375F, 0.3F, -0.25F, -0.125F, 0.3F, -0.25F, -0.125F, 0.3F, -0.25F, -0.125F, 0.3F, -0.25F, -0.125F); // Box 363
		bodyModel[262].setRotationPoint(43F, -14.27F, -13.5F);
		bodyModel[262].rotateAngleZ = -0.45378561F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.275F, 0F, -0.2F, -0.275F, 0F, -0.2F, -0.275F, 0F, -0.2F, -0.275F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F); // Box 364
		bodyModel[263].setRotationPoint(44.4F, -12.65F, -13.5F);
		bodyModel[263].rotateAngleZ = -0.45378561F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.275F, 0F, -0.2F, -0.275F, 0F, -0.2F, -0.275F, 0F, -0.2F, -0.275F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F, 0F, -0.1F, -0.125F); // Box 365
		bodyModel[264].setRotationPoint(41.8F, -13.9F, -13.5F);
		bodyModel[264].rotateAngleZ = -0.45378561F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.125F, -0.525F, 0F, -0.125F, -0.525F, 0F, -0.125F, 0F, 0.25F, -0.125F, -0.25F, -0.4F, -0.125F, -0.4F, -0.4F, -0.125F, -0.4F, -0.4F, -0.125F, -0.25F, -0.4F, -0.125F); // Box 366
		bodyModel[265].setRotationPoint(41.1F, -14F, -13.5F);
		bodyModel[265].rotateAngleZ = -0.45378561F;

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F, -0.5F, -0.75F, -0.325F); // Box 367
		bodyModel[266].setRotationPoint(43F, -14.37F, -13.3F);
		bodyModel[266].rotateAngleZ = -0.45378561F;

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 368
		bodyModel[267].setRotationPoint(45.5F, -12.5F, -14F);
		bodyModel[267].rotateAngleZ = -0.45378561F;

		bodyModel[268].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 369
		bodyModel[268].setRotationPoint(-49.3F, -10.9F, -17F);
		bodyModel[268].rotateAngleZ = 0.46059239F;

		bodyModel[269].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 370
		bodyModel[269].setRotationPoint(-45.3F, -12.9F, -17F);
		bodyModel[269].rotateAngleZ = 0.46059239F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[270].setRotationPoint(-40.3F, -15.3F, -17F);
		bodyModel[270].rotateAngleZ = 0.32096605F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.125F, -0.25F, 0.875F, -0.75F, -0.25F, 0.875F, -0.75F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, 0.875F, -0.75F, -0.25F, 0.875F, -0.75F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F); // Box 372
		bodyModel[271].setRotationPoint(-35.6F, -16.86F, -16F);
		bodyModel[271].rotateAngleZ = 0.32096605F;

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.25F, -0.375F, -1.25F, -0.25F, -0.375F, -1.25F, -0.25F, -0.125F, 1F, -0.25F, -0.125F, 1F, -0.25F, -0.375F, -1.25F, -0.25F, -0.375F, -1.25F, -0.25F, -0.125F, 1F, -0.25F, -0.125F); // Box 373
		bodyModel[272].setRotationPoint(-35.6F, -16.86F, -14F);
		bodyModel[272].rotateAngleZ = 0.32096605F;

		bodyModel[273].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 374
		bodyModel[273].setRotationPoint(-44.1F, -13.6F, -17F);
		bodyModel[273].rotateAngleZ = 0.46059239F;

		bodyModel[274].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 375
		bodyModel[274].setRotationPoint(-48.1F, -11.6F, -17F);
		bodyModel[274].rotateAngleZ = 0.46059239F;

		bodyModel[275].addBox(0F, 0F, 0F, 1, 0, 4, 0F); // Box 376
		bodyModel[275].setRotationPoint(-39.1F, -15.8F, -17F);
		bodyModel[275].rotateAngleZ = 0.32096605F;

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1.1F, -2.75F, 0F, -1.1F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, -2.75F, 0F, 1.1F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[276].setRotationPoint(-39.1F, -15.8F, -21F);
		bodyModel[276].rotateAngleZ = 0.32096605F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, -2.75F, 0F, -1.1F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, -2.75F, 0F, 1.1F, -2.75F); // Box 378
		bodyModel[277].setRotationPoint(-39.1F, -15.8F, -13F);
		bodyModel[277].rotateAngleZ = 0.32096605F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1F, -2.55F, 0F, -1F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.55F, 0F, 1F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[278].setRotationPoint(-44.1F, -13.6F, -21F);
		bodyModel[278].rotateAngleZ = 0.46059239F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.55F, 0F, -1F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.55F, 0F, 1F, -2.55F); // Box 380
		bodyModel[279].setRotationPoint(-48.1F, -11.6F, -13F);
		bodyModel[279].rotateAngleZ = 0.46059239F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.55F, 0F, -1F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.55F, 0F, 1F, -2.55F); // Box 381
		bodyModel[280].setRotationPoint(-44.1F, -13.6F, -13F);
		bodyModel[280].rotateAngleZ = 0.46059239F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, -1F, -2.55F, 0F, -1F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2.55F, 0F, 1F, -2.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[281].setRotationPoint(-48.1F, -11.6F, -21F);
		bodyModel[281].rotateAngleZ = 0.46059239F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0.375F, 0F, 0F); // Box 383
		bodyModel[282].setRotationPoint(-35.6F, -16.86F, -17F);
		bodyModel[282].rotateAngleZ = 0.32096605F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -0.875F, 0F, 0F, 0F); // Box 384
		bodyModel[283].setRotationPoint(-36.5F, -16.56F, -17F);
		bodyModel[283].rotateAngleZ = 0.32096605F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.125F, 0.375F, -0.25F, -0.125F, 0.375F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.125F, 0.375F, -0.25F, -0.125F); // Box 385
		bodyModel[284].setRotationPoint(-35.6F, -16.86F, -15F);
		bodyModel[284].rotateAngleZ = 0.32096605F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F); // Box 388
		bodyModel[285].setRotationPoint(36.1F, -16.43F, 9.5F);
		bodyModel[285].rotateAngleZ = -0.45378561F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F); // Box 389
		bodyModel[286].setRotationPoint(37F, -16F, 9.5F);
		bodyModel[286].rotateAngleZ = -0.45378561F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 390
		bodyModel[287].setRotationPoint(38F, -15.47F, 10.5F);
		bodyModel[287].rotateAngleZ = -0.45378561F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 391
		bodyModel[288].setRotationPoint(43F, -13.47F, 10F);
		bodyModel[288].rotateAngleZ = -0.45378561F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.175F, 1.05F, 0.575F, -1.175F, 1.05F, 0.575F, -1.175F, 1.05F, 0.575F, 1.175F, 1.05F, 0.575F); // Box 392
		bodyModel[289].setRotationPoint(-25F, -25F, -15.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.175F, 1.05F, 0.575F, 1.175F, 1.05F, 0.575F, 1.175F, 1.05F, 0.575F, -1.175F, 1.05F, 0.575F); // Box 395
		bodyModel[290].setRotationPoint(22F, -25F, -15.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1.15F, -2F, 0.55F, 1.15F, -2F, 0.55F, 1.15F, -2F, 1.5F, -1.15F, -2F, 1.5F, -2.58F, 3.5F, 1.3F, 2.58F, 3.5F, 1.3F, 2.58F, 3.5F, 1.5F, -2.58F, 3.5F, 1.5F); // Box 398
		bodyModel[291].setRotationPoint(22F, -25F, -15.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-1.15F, -2F, 0F, 1.15F, -2F, 0F, 1.15F, -2F, 0F, -1.15F, -2F, 0F, -2.58F, 3.5F, 0F, 2.58F, 3.5F, 0F, 2.58F, 3.5F, 0F, -2.58F, 3.5F, 0F); // Box 399
		bodyModel[292].setRotationPoint(22F, -25F, -7F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1.15F, -2F, 1.5F, 1.15F, -2F, 1.5F, 1.15F, -2F, 0.55F, -1.15F, -2F, 0.55F, -2.58F, 3.5F, 1.5F, 2.58F, 3.5F, 1.5F, 2.58F, 3.5F, 1.3F, -2.58F, 3.5F, 1.3F); // Box 400
		bodyModel[293].setRotationPoint(22F, -25F, 14.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,-2.58F, -4.5F, 1.28F, 2.58F, -4.5F, 1.28F, 2.58F, -4.5F, 1.28F, -2.58F, -4.5F, 1.28F, -4.03F, 6.05F, 2F, 4.03F, 6.05F, 2F, 4.03F, 6.05F, 2F, -4.03F, 6.05F, 2F); // Box 401
		bodyModel[294].setRotationPoint(22F, -25F, -15.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,1.15F, -2F, 0.55F, -1.15F, -2F, 0.55F, -1.15F, -2F, 1.5F, 1.15F, -2F, 1.5F, 2.58F, 3.5F, 1.3F, -2.58F, 3.5F, 1.3F, -2.58F, 3.5F, 1.5F, 2.58F, 3.5F, 1.5F); // Box 402
		bodyModel[295].setRotationPoint(-25F, -25F, -15.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,1.15F, -2F, 0F, -1.15F, -2F, 0F, -1.15F, -2F, 0F, 1.15F, -2F, 0F, 2.58F, 3.5F, 0F, -2.58F, 3.5F, 0F, -2.58F, 3.5F, 0F, 2.58F, 3.5F, 0F); // Box 403
		bodyModel[296].setRotationPoint(-25F, -25F, -7F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,1.15F, -2F, 1.5F, -1.15F, -2F, 1.5F, -1.15F, -2F, 0.55F, 1.15F, -2F, 0.55F, 2.58F, 3.5F, 1.5F, -2.58F, 3.5F, 1.5F, -2.58F, 3.5F, 1.3F, 2.58F, 3.5F, 1.3F); // Box 404
		bodyModel[297].setRotationPoint(-25F, -25F, 14.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,2.58F, -4.5F, 1.28F, -2.58F, -4.5F, 1.28F, -2.58F, -4.5F, 1.28F, 2.58F, -4.5F, 1.28F, 4.03F, 6.05F, 2F, -4.03F, 6.05F, 2F, -4.03F, 6.05F, 2F, 4.03F, 6.05F, 2F); // Box 405
		bodyModel[298].setRotationPoint(-25F, -25F, -15.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F); // Box 401
		bodyModel[299].setRotationPoint(-29F, -23.5F, -14F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F); // Box 402
		bodyModel[300].setRotationPoint(-29F, -23.5F, 6F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[301].setRotationPoint(24F, -23.5F, -14F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[302].setRotationPoint(24F, -23.5F, 6F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 114
		turretModel[1] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 202
		turretModel[2] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 202
		turretModel[3] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 117
		turretModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 118
		turretModel[5] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 112
		turretModel[6] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 114
		turretModel[7] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 120
		turretModel[8] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 243
		turretModel[9] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 246

		turretModel[0].addShapeBox(-1F, 0F, 0F, 16, 5, 27, 0F,0F, 5F, 14F, -16F, 5F, 14F, 0F, 0F, -17F, 0F, 5F, -14F, 0F, -5F, 14F, 0F, -5F, 11F, 0F, -5F, -17F, 0F, -5F, -14F); // Box 114
		turretModel[0].setRotationPoint(0F, -33F, 0F);

		turretModel[1].addShapeBox(-1F, 0F, 0F, 16, 7, 27, 0F,0F, 7F, 14F, 0F, 7F, 11F, 0F, 7F, -17F, 0F, 7F, -14F, 0F, -7F, 14F, 0F, -7F, 11F, 0F, -7F, -17F, 0F, -7F, -14F); // Box 202
		turretModel[1].setRotationPoint(0F, -26F, 0F);

		turretModel[2].addShapeBox(-1F, 0F, 0F, 5, 10, 27, 0F,5F, 10F, 13F, -5F, 10F, 14F, -5F, 10F, -14F, 5F, 10F, -15F, 5F, -10F, 13F, -5F, -10F, 14F, -5F, -10F, -14F, 5F, -10F, -15F); // Box 202
		turretModel[2].setRotationPoint(0F, -26F, 0F);

		turretModel[3].addShapeBox(-1F, 0F, 0F, 5, 8, 25, 0F,10F, 8F, 10F, -10F, 8F, 13F, -10F, 8F, -13F, 10F, 8F, -16F, 10F, -8F, 10F, -10F, -8F, 13F, -10F, -8F, -13F, 10F, -8F, -16F); // Box 117
		turretModel[3].setRotationPoint(0F, -26F, 0F);

		turretModel[4].addShapeBox(-1F, 0F, 0F, 5, 6, 19, 0F,15F, 6F, 3F, -15F, 6F, 10F, -15F, 6F, -10F, 15F, 6F, -17F, 15F, -6F, 3F, -15F, -6F, 10F, -15F, -6F, -10F, 15F, -6F, -17F); // Box 118
		turretModel[4].setRotationPoint(0F, -26F, 0F);

		turretModel[5].addShapeBox(-1F, 0F, 0F, 5, 2, 25, 0F,5F, 2F, 13F, -10F, 2F, 13F, -10F, 2F, -13F, 5F, 2F, -13F, 10F, -2F, 10F, -10F, -2F, 13F, -10F, -2F, -13F, 10F, -2F, -16F); // Box 112
		turretModel[5].setRotationPoint(0F, -34F, 0F);

		turretModel[6].addShapeBox(-1F, 0F, 0F, 5, 2, 19, 0F,10F, 2F, 10F, -15F, 2F, 10F, -15F, 2F, -10F, 10F, 2F, -10F, 15F, -2F, 3F, -15F, -2F, 10F, -15F, -2F, -10F, 15F, -2F, -17F); // Box 114
		turretModel[6].setRotationPoint(0F, -32F, 0F);

		turretModel[7].addShapeBox(-1F, 0F, 0F, 5, 2, 27, 0F,0F, 2F, 14F, -5F, 2F, 14F, -5F, 2F, -14F, 0F, 2F, -14F, 5F, -2F, 13F, -5F, -2F, 14F, -5F, -2F, -14F, 5F, -2F, -15F); // Box 120
		turretModel[7].setRotationPoint(0F, -36F, 0F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-14F, 1.5F, 8.5F, 14F, 0F, 7F, 14F, 0F, -7F, -14F, 1.5F, -5.5F, -14F, 1.5F, 8.5F, 14F, 0F, 7F, 14F, 0F, -7F, -14F, 1.5F, -5.5F); // Box 243
		turretModel[8].setRotationPoint(0F, -31F, 0F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-14F, 1.5F, -2.5F, 14F, 0F, -4F, 14F, 0F, 4F, -14F, 1.5F, 5.5F, -14F, 1.5F, -2.5F, 14F, 0F, -4F, 14F, 0F, 4F, -14F, 1.5F, 5.5F); // Box 246
		turretModel[9].setRotationPoint(0F, -31F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		barrelModel[1] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 202
		barrelModel[2] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 401
		barrelModel[3] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 410

		barrelModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 2.5F, 2.5F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 2.5F, 0.5F, 0F, 0.5F, 2.5F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0.5F, 0.5F); // Box 118
		barrelModel[0].setRotationPoint(16F, -30F, -6F);

		barrelModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.36F, 0.35F, 0F, 0.36F, 0.35F, 0F, 0.36F, -0.6F, 0F, 0.36F, -0.6F, 0F, -0.6F, -0.25F, 0F, -0.6F, 0.35F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 202
		barrelModel[1].setRotationPoint(16F, -30F, 5F);
		barrelModel[1].rotateAngleY = -0.01745329F;
		barrelModel[1].rotateAngleZ = 0.01745329F;

		barrelModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 2F, 2F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 401
		barrelModel[2].setRotationPoint(16F, -30F, 5F);

		barrelModel[3].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 410
		barrelModel[3].setRotationPoint(16F, -30F, -6F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 202
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 202
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 202
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 406
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 394
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 372
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 374
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 375
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 376
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 395
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 396
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 397
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 411
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 412
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 413
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 423
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 424
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 427
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 444
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Box 445

		leftFrontWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,9F, -4F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 9F, -4F, 0F, 4F, 1.5F, 0F, -5.5F, -1F, 0F, -5.5F, -1F, 0F, 4F, 1.5F, 0F); // Box 202
		leftFrontWheelModel[0].setRotationPoint(9F, 0.5F, 17.5F);

		leftFrontWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,9F, 4F, 0F, -9F, 4F, 0F, -9F, 4F, 0F, 9F, 4F, 0F, 9F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 9F, -4F, 0F); // Box 202
		leftFrontWheelModel[1].setRotationPoint(9F, 0.5F, 17.5F);

		leftFrontWheelModel[2].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,4F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 4F, -6F, 0F, 4F, 5.5F, 0F, -4F, 5.5F, 0F, -4F, 5.5F, 0F, 4F, 5.5F, 0F); // Box 202
		leftFrontWheelModel[2].setRotationPoint(9F, 0.5F, 17.5F);

		leftFrontWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 9F, 4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 406
		leftFrontWheelModel[3].setRotationPoint(41F, 0.5F, 12.5F);

		leftFrontWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,4F, 8.5F, 0F, -5F, 8.5F, 0F, -5F, 8.5F, 0F, 4F, 8.5F, 0F, 9F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 9F, -8F, 0F); // Box 394
		leftFrontWheelModel[4].setRotationPoint(41F, 0.5F, 12.5F);

		leftFrontWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 9F, -4F, 0F, 4F, 4.5F, 0F, -5F, 4.5F, 0F, -5F, 4.5F, 0F, 4F, 4.5F, 0F); // Box 372
		leftFrontWheelModel[5].setRotationPoint(41F, 0.5F, 12.5F);

		leftFrontWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 9F, 4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 374
		leftFrontWheelModel[6].setRotationPoint(9F, 0.5F, 12.5F);

		leftFrontWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,4F, 8.5F, 0F, -5F, 8.5F, 0F, -5F, 8.5F, 0F, 4F, 8.5F, 0F, 9F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 9F, -8F, 0F); // Box 375
		leftFrontWheelModel[7].setRotationPoint(9F, 0.5F, 12.5F);

		leftFrontWheelModel[8].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 9F, -4F, 0F, 4F, 4.5F, 0F, -5F, 4.5F, 0F, -5F, 4.5F, 0F, 4F, 4.5F, 0F); // Box 376
		leftFrontWheelModel[8].setRotationPoint(9F, 0.5F, 12.5F);

		leftFrontWheelModel[9].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,6F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 395
		leftFrontWheelModel[9].setRotationPoint(41F, 0.5F, 12F);

		leftFrontWheelModel[10].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,2.5F, 6F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 2.5F, 6F, 0F, 6F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 6F, -7F, 0F); // Box 396
		leftFrontWheelModel[10].setRotationPoint(41F, 0.5F, 12F);

		leftFrontWheelModel[11].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -3F, 0F, 2.5F, 2F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, 2.5F, 2F, 0F); // Box 397
		leftFrontWheelModel[11].setRotationPoint(41F, 0.5F, 12F);

		leftFrontWheelModel[12].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,6F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 411
		leftFrontWheelModel[12].setRotationPoint(9F, 0.5F, 12F);

		leftFrontWheelModel[13].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -3F, 0F, 2.5F, 2F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, 2.5F, 2F, 0F); // Box 412
		leftFrontWheelModel[13].setRotationPoint(9F, 0.5F, 12F);

		leftFrontWheelModel[14].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,2.5F, 6F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 2.5F, 6F, 0F, 6F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 6F, -7F, 0F); // Box 413
		leftFrontWheelModel[14].setRotationPoint(9F, 0.5F, 12F);

		leftFrontWheelModel[15].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,-6F, 4F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, -6F, 4F, 0F, -6F, -4F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, -4F, 0F); // Box 423
		leftFrontWheelModel[15].setRotationPoint(9F, 0.5F, 17.5F);

		leftFrontWheelModel[16].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-6F, -3F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, -3F, 0F, -2.5F, -1F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -2.5F, -1F, 0F); // Box 424
		leftFrontWheelModel[16].setRotationPoint(9F, 0.5F, 17.5F);

		leftFrontWheelModel[17].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-2.5F, 6F, 0F, 1F, 8.5F, 0F, 1F, 8.5F, 0F, -2.5F, 6F, 0F, -6F, -10F, 0F, 6F, -11F, 0F, 6F, -11F, 0F, -6F, -10F, 0F); // Box 427
		leftFrontWheelModel[17].setRotationPoint(9F, 0.5F, 17.5F);

		leftFrontWheelModel[18].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,4F, 8.5F, 0F, -4F, 8.5F, 0F, -4F, 8.5F, 0F, 4F, 8.5F, 0F, 4F, -9F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 4F, -9F, 0F); // Box 444
		leftFrontWheelModel[18].setRotationPoint(9F, 0.5F, 17.5F);

		leftFrontWheelModel[19].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,4F, 8.5F, 0F, -5.5F, 6F, 0F, -5.5F, 6F, 0F, 4F, 8.5F, 0F, 9F, -11F, 0F, -9F, -10F, 0F, -9F, -10F, 0F, 9F, -11F, 0F); // Box 445
		leftFrontWheelModel[19].setRotationPoint(9F, 0.5F, 17.5F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 202
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 383
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 384
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 385
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 386
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Box 387
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Box 388
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 398
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 399
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 400
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 420
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 33, 257, textureX, textureY); // Box 421
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Box 422
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 425
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 446
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 241, 265, textureX, textureY); // Box 447
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Box 448
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 449
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 450
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); // Box 451

		rightFrontWheelModel[0].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,4F, 8.5F, 0F, -4F, 8.5F, 0F, -4F, 8.5F, 0F, 4F, 8.5F, 0F, 4F, -9F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 4F, -9F, 0F); // Box 202
		rightFrontWheelModel[0].setRotationPoint(9F, 0.5F, -22.5F);

		rightFrontWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 9F, 4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 383
		rightFrontWheelModel[1].setRotationPoint(41F, 0.5F, -17.5F);

		rightFrontWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 9F, -4F, 0F, 4F, 4.5F, 0F, -5F, 4.5F, 0F, -5F, 4.5F, 0F, 4F, 4.5F, 0F); // Box 384
		rightFrontWheelModel[2].setRotationPoint(41F, 0.5F, -17.5F);

		rightFrontWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,4F, 8.5F, 0F, -5F, 8.5F, 0F, -5F, 8.5F, 0F, 4F, 8.5F, 0F, 9F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 9F, -8F, 0F); // Box 385
		rightFrontWheelModel[3].setRotationPoint(41F, 0.5F, -17.5F);

		rightFrontWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,4F, 8.5F, 0F, -5F, 8.5F, 0F, -5F, 8.5F, 0F, 4F, 8.5F, 0F, 9F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 9F, -8F, 0F); // Box 386
		rightFrontWheelModel[4].setRotationPoint(9F, 0.5F, -17.5F);

		rightFrontWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 9F, 4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 387
		rightFrontWheelModel[5].setRotationPoint(9F, 0.5F, -17.5F);

		rightFrontWheelModel[6].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 9F, -4F, 0F, 4F, 4.5F, 0F, -5F, 4.5F, 0F, -5F, 4.5F, 0F, 4F, 4.5F, 0F); // Box 388
		rightFrontWheelModel[6].setRotationPoint(9F, 0.5F, -17.5F);

		rightFrontWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -3F, 0F, 2.5F, 2F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, 2.5F, 2F, 0F); // Box 398
		rightFrontWheelModel[7].setRotationPoint(41F, 0.5F, -18F);

		rightFrontWheelModel[8].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,6F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 399
		rightFrontWheelModel[8].setRotationPoint(41F, 0.5F, -18F);

		rightFrontWheelModel[9].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,2.5F, 6F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 2.5F, 6F, 0F, 6F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 6F, -7F, 0F); // Box 400
		rightFrontWheelModel[9].setRotationPoint(41F, 0.5F, -18F);

		rightFrontWheelModel[10].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,6F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 420
		rightFrontWheelModel[10].setRotationPoint(9F, 0.5F, -20F);

		rightFrontWheelModel[11].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,2.5F, 6F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 2.5F, 6F, 0F, 6F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 6F, -7F, 0F); // Box 421
		rightFrontWheelModel[11].setRotationPoint(9F, 0.5F, -20F);

		rightFrontWheelModel[12].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -3F, 0F, 2.5F, 2F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, 2.5F, 2F, 0F); // Box 422
		rightFrontWheelModel[12].setRotationPoint(9F, 0.5F, -20F);

		rightFrontWheelModel[13].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,4F, 8.5F, 0F, -5.5F, 6F, 0F, -5.5F, 6F, 0F, 4F, 8.5F, 0F, 9F, -11F, 0F, -9F, -10F, 0F, -9F, -10F, 0F, 9F, -11F, 0F); // Box 425
		rightFrontWheelModel[13].setRotationPoint(9F, 0.5F, -22.5F);

		rightFrontWheelModel[14].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-2.5F, 6F, 0F, 1F, 8.5F, 0F, 1F, 8.5F, 0F, -2.5F, 6F, 0F, -6F, -10F, 0F, 6F, -11F, 0F, 6F, -11F, 0F, -6F, -10F, 0F); // Box 446
		rightFrontWheelModel[14].setRotationPoint(9F, 0.5F, -22.5F);

		rightFrontWheelModel[15].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,-6F, 4F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, -6F, 4F, 0F, -6F, -4F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, -4F, 0F); // Box 447
		rightFrontWheelModel[15].setRotationPoint(9F, 0.5F, -22.5F);

		rightFrontWheelModel[16].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-6F, -3F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, -3F, 0F, -2.5F, -1F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -2.5F, -1F, 0F); // Box 448
		rightFrontWheelModel[16].setRotationPoint(9F, 0.5F, -22.5F);

		rightFrontWheelModel[17].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,4F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 4F, -6F, 0F, 4F, 5.5F, 0F, -4F, 5.5F, 0F, -4F, 5.5F, 0F, 4F, 5.5F, 0F); // Box 449
		rightFrontWheelModel[17].setRotationPoint(9F, 0.5F, -22.5F);

		rightFrontWheelModel[18].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,9F, -4F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 9F, -4F, 0F, 4F, 1.5F, 0F, -5.5F, -1F, 0F, -5.5F, -1F, 0F, 4F, 1.5F, 0F); // Box 450
		rightFrontWheelModel[18].setRotationPoint(9F, 0.5F, -22.5F);

		rightFrontWheelModel[19].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,9F, 4F, 0F, -9F, 4F, 0F, -9F, 4F, 0F, 9F, 4F, 0F, 9F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 9F, -4F, 0F); // Box 451
		rightFrontWheelModel[19].setRotationPoint(9F, 0.5F, -22.5F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 377
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 378
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 379
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 380
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 381
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 382
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Box 403
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 404
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 405
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 414
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 415
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 416
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 428
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Box 429
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 430
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 97, 257, textureX, textureY); // Box 431
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 432
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 433
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 434
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 435

		leftBackWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,4F, 8.5F, 0F, -5F, 8.5F, 0F, -5F, 8.5F, 0F, 4F, 8.5F, 0F, 9F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 9F, -8F, 0F); // Box 377
		leftBackWheelModel[0].setRotationPoint(-43F, 0.5F, 12.5F);

		leftBackWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 9F, 4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 378
		leftBackWheelModel[1].setRotationPoint(-43F, 0.5F, 12.5F);

		leftBackWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 9F, -4F, 0F, 4F, 4.5F, 0F, -5F, 4.5F, 0F, -5F, 4.5F, 0F, 4F, 4.5F, 0F); // Box 379
		leftBackWheelModel[2].setRotationPoint(-43F, 0.5F, 12.5F);

		leftBackWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 9F, -4F, 0F, 4F, 4.5F, 0F, -5F, 4.5F, 0F, -5F, 4.5F, 0F, 4F, 4.5F, 0F); // Box 380
		leftBackWheelModel[3].setRotationPoint(-11F, 0.5F, 12.5F);

		leftBackWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 9F, 4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 381
		leftBackWheelModel[4].setRotationPoint(-11F, 0.5F, 12.5F);

		leftBackWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,4F, 8.5F, 0F, -5F, 8.5F, 0F, -5F, 8.5F, 0F, 4F, 8.5F, 0F, 9F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 9F, -8F, 0F); // Box 382
		leftBackWheelModel[5].setRotationPoint(-11F, 0.5F, 12.5F);

		leftBackWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,6F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 403
		leftBackWheelModel[6].setRotationPoint(-43F, 0.5F, 12F);

		leftBackWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,2.5F, 6F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 2.5F, 6F, 0F, 6F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 6F, -7F, 0F); // Box 404
		leftBackWheelModel[7].setRotationPoint(-43F, 0.5F, 12F);

		leftBackWheelModel[8].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -3F, 0F, 2.5F, 2F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, 2.5F, 2F, 0F); // Box 405
		leftBackWheelModel[8].setRotationPoint(-43F, 0.5F, 12F);

		leftBackWheelModel[9].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,6F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 414
		leftBackWheelModel[9].setRotationPoint(-11F, 0.5F, 12F);

		leftBackWheelModel[10].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -3F, 0F, 2.5F, 2F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, 2.5F, 2F, 0F); // Box 415
		leftBackWheelModel[10].setRotationPoint(-11F, 0.5F, 12F);

		leftBackWheelModel[11].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,2.5F, 6F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 2.5F, 6F, 0F, 6F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 6F, -7F, 0F); // Box 416
		leftBackWheelModel[11].setRotationPoint(-11F, 0.5F, 12F);

		leftBackWheelModel[12].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,9F, 4F, 0F, -9F, 4F, 0F, -9F, 4F, 0F, 9F, 4F, 0F, 9F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 9F, -4F, 0F); // Box 428
		leftBackWheelModel[12].setRotationPoint(-11F, 0.5F, 17.5F);

		leftBackWheelModel[13].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,4F, 8.5F, 0F, -5.5F, 6F, 0F, -5.5F, 6F, 0F, 4F, 8.5F, 0F, 9F, -11F, 0F, -9F, -10F, 0F, -9F, -10F, 0F, 9F, -11F, 0F); // Box 429
		leftBackWheelModel[13].setRotationPoint(-11F, 0.5F, 17.5F);

		leftBackWheelModel[14].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,4F, 8.5F, 0F, -4F, 8.5F, 0F, -4F, 8.5F, 0F, 4F, 8.5F, 0F, 4F, -9F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 4F, -9F, 0F); // Box 430
		leftBackWheelModel[14].setRotationPoint(-11F, 0.5F, 17.5F);

		leftBackWheelModel[15].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-2.5F, 6F, 0F, 1F, 8.5F, 0F, 1F, 8.5F, 0F, -2.5F, 6F, 0F, -6F, -10F, 0F, 6F, -11F, 0F, 6F, -11F, 0F, -6F, -10F, 0F); // Box 431
		leftBackWheelModel[15].setRotationPoint(-11F, 0.5F, 17.5F);

		leftBackWheelModel[16].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,-6F, 4F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, -6F, 4F, 0F, -6F, -4F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, -4F, 0F); // Box 432
		leftBackWheelModel[16].setRotationPoint(-11F, 0.5F, 17.5F);

		leftBackWheelModel[17].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-6F, -3F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, -3F, 0F, -2.5F, -1F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -2.5F, -1F, 0F); // Box 433
		leftBackWheelModel[17].setRotationPoint(-11F, 0.5F, 17.5F);

		leftBackWheelModel[18].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,9F, -4F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 9F, -4F, 0F, 4F, 1.5F, 0F, -5.5F, -1F, 0F, -5.5F, -1F, 0F, 4F, 1.5F, 0F); // Box 434
		leftBackWheelModel[18].setRotationPoint(-11F, 0.5F, 17.5F);

		leftBackWheelModel[19].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,4F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 4F, -6F, 0F, 4F, 5.5F, 0F, -4F, 5.5F, 0F, -4F, 5.5F, 0F, 4F, 5.5F, 0F); // Box 435
		leftBackWheelModel[19].setRotationPoint(-11F, 0.5F, 17.5F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 389
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 390
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 391
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Box 392
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 393
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 394
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Box 406
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 407
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 408
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 417
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 418
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Box 419
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Box 436
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 437
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 438
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 439
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 440
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 441
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 442
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 473, 257, textureX, textureY); // Box 443

		rightBackWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 9F, -4F, 0F, 4F, 4.5F, 0F, -5F, 4.5F, 0F, -5F, 4.5F, 0F, 4F, 4.5F, 0F); // Box 389
		rightBackWheelModel[0].setRotationPoint(-43F, 0.5F, -17.5F);

		rightBackWheelModel[1].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 9F, 4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 390
		rightBackWheelModel[1].setRotationPoint(-43F, 0.5F, -17.5F);

		rightBackWheelModel[2].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,4F, 8.5F, 0F, -5F, 8.5F, 0F, -5F, 8.5F, 0F, 4F, 8.5F, 0F, 9F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 9F, -8F, 0F); // Box 391
		rightBackWheelModel[2].setRotationPoint(-43F, 0.5F, -17.5F);

		rightBackWheelModel[3].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,4F, 8.5F, 0F, -5F, 8.5F, 0F, -5F, 8.5F, 0F, 4F, 8.5F, 0F, 9F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 9F, -8F, 0F); // Box 392
		rightBackWheelModel[3].setRotationPoint(-11F, 0.5F, -17.5F);

		rightBackWheelModel[4].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 9F, 4F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F); // Box 393
		rightBackWheelModel[4].setRotationPoint(-11F, 0.5F, -17.5F);

		rightBackWheelModel[5].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,9F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 9F, -4F, 0F, 4F, 4.5F, 0F, -5F, 4.5F, 0F, -5F, 4.5F, 0F, 4F, 4.5F, 0F); // Box 394
		rightBackWheelModel[5].setRotationPoint(-11F, 0.5F, -17.5F);

		rightBackWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -3F, 0F, 2.5F, 2F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, 2.5F, 2F, 0F); // Box 406
		rightBackWheelModel[6].setRotationPoint(-43F, 0.5F, -18F);

		rightBackWheelModel[7].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,6F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 407
		rightBackWheelModel[7].setRotationPoint(-43F, 0.5F, -18F);

		rightBackWheelModel[8].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,2.5F, 6F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 2.5F, 6F, 0F, 6F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 6F, -7F, 0F); // Box 408
		rightBackWheelModel[8].setRotationPoint(-43F, 0.5F, -18F);

		rightBackWheelModel[9].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,6F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 6F, 3F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 6F, -1F, 0F); // Box 417
		rightBackWheelModel[9].setRotationPoint(-11F, 0.5F, -20F);

		rightBackWheelModel[10].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,2.5F, 6F, 0F, -3.5F, 6F, 0F, -3.5F, 6F, 0F, 2.5F, 6F, 0F, 6F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 6F, -7F, 0F); // Box 418
		rightBackWheelModel[10].setRotationPoint(-11F, 0.5F, -20F);

		rightBackWheelModel[11].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,6F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 6F, -3F, 0F, 2.5F, 2F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, 2.5F, 2F, 0F); // Box 419
		rightBackWheelModel[11].setRotationPoint(-11F, 0.5F, -20F);

		rightBackWheelModel[12].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,9F, -4F, 0F, -9F, -3F, 0F, -9F, -3F, 0F, 9F, -4F, 0F, 4F, 1.5F, 0F, -5.5F, -1F, 0F, -5.5F, -1F, 0F, 4F, 1.5F, 0F); // Box 436
		rightBackWheelModel[12].setRotationPoint(-11F, 0.5F, -22.5F);

		rightBackWheelModel[13].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,9F, 4F, 0F, -9F, 4F, 0F, -9F, 4F, 0F, 9F, 4F, 0F, 9F, -4F, 0F, -9F, -4F, 0F, -9F, -4F, 0F, 9F, -4F, 0F); // Box 437
		rightBackWheelModel[13].setRotationPoint(-11F, 0.5F, -22.5F);

		rightBackWheelModel[14].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,4F, 8.5F, 0F, -5.5F, 6F, 0F, -5.5F, 6F, 0F, 4F, 8.5F, 0F, 9F, -11F, 0F, -9F, -10F, 0F, -9F, -10F, 0F, 9F, -11F, 0F); // Box 438
		rightBackWheelModel[14].setRotationPoint(-11F, 0.5F, -22.5F);

		rightBackWheelModel[15].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,4F, 8.5F, 0F, -4F, 8.5F, 0F, -4F, 8.5F, 0F, 4F, 8.5F, 0F, 4F, -9F, 0F, -4F, -9F, 0F, -4F, -9F, 0F, 4F, -9F, 0F); // Box 439
		rightBackWheelModel[15].setRotationPoint(-11F, 0.5F, -22.5F);

		rightBackWheelModel[16].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-2.5F, 6F, 0F, 1F, 8.5F, 0F, 1F, 8.5F, 0F, -2.5F, 6F, 0F, -6F, -10F, 0F, 6F, -11F, 0F, 6F, -11F, 0F, -6F, -10F, 0F); // Box 440
		rightBackWheelModel[16].setRotationPoint(-11F, 0.5F, -22.5F);

		rightBackWheelModel[17].addShapeBox(0F, 0F, 0F, 3, 8, 4, 0F,-6F, 4F, 0F, 6F, 4F, 0F, 6F, 4F, 0F, -6F, 4F, 0F, -6F, -4F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, -4F, 0F); // Box 441
		rightBackWheelModel[17].setRotationPoint(-11F, 0.5F, -22.5F);

		rightBackWheelModel[18].addShapeBox(0F, 0F, 0F, 3, 7, 4, 0F,-6F, -3F, 0F, 6F, -4F, 0F, 6F, -4F, 0F, -6F, -3F, 0F, -2.5F, -1F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -2.5F, -1F, 0F); // Box 442
		rightBackWheelModel[18].setRotationPoint(-11F, 0.5F, -22.5F);

		rightBackWheelModel[19].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,4F, -6F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 4F, -6F, 0F, 4F, 5.5F, 0F, -4F, 5.5F, 0F, -4F, 5.5F, 0F, 4F, 5.5F, 0F); // Box 443
		rightBackWheelModel[19].setRotationPoint(-11F, 0.5F, -22.5F);
	}

	
}