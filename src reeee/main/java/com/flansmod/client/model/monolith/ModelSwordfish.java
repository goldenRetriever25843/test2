//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.07.2016 - 16:54:27
// Last changed on: 20.07.2016 - 16:54:27

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSwordfish extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSwordfish() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[220];
		tailModel = new ModelRendererTurbo[22];
		leftWingModel = new ModelRendererTurbo[20];
		rightWingModel = new ModelRendererTurbo[21];
		yawFlapModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 10
		bodyModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 673, 9, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 37
		bodyModel[27] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 53
		bodyModel[43] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 54
		bodyModel[44] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 109
		bodyModel[53] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 110
		bodyModel[54] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 111
		bodyModel[55] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 132
		bodyModel[56] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 133
		bodyModel[57] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 134
		bodyModel[58] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 152
		bodyModel[59] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 153
		bodyModel[60] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 154
		bodyModel[61] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 155
		bodyModel[62] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 156
		bodyModel[63] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 157
		bodyModel[64] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 158
		bodyModel[65] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 159
		bodyModel[66] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Box 160
		bodyModel[67] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 161
		bodyModel[68] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 162
		bodyModel[69] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 163
		bodyModel[70] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Box 164
		bodyModel[71] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 166
		bodyModel[72] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 167
		bodyModel[73] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 168
		bodyModel[74] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 169
		bodyModel[75] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 170
		bodyModel[76] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 171
		bodyModel[77] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 172
		bodyModel[78] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 173
		bodyModel[79] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 174
		bodyModel[80] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 175
		bodyModel[81] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 176
		bodyModel[82] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 177
		bodyModel[83] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 178
		bodyModel[84] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 179
		bodyModel[85] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 180
		bodyModel[86] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 181
		bodyModel[87] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 182
		bodyModel[88] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 183
		bodyModel[89] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 184
		bodyModel[90] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 185
		bodyModel[91] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 186
		bodyModel[92] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 187
		bodyModel[93] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 188
		bodyModel[94] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 189
		bodyModel[95] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 190
		bodyModel[96] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 191
		bodyModel[97] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 192
		bodyModel[98] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 193
		bodyModel[99] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 194
		bodyModel[100] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 195
		bodyModel[101] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 196
		bodyModel[102] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 211
		bodyModel[103] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 212
		bodyModel[104] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 213
		bodyModel[105] = new ModelRendererTurbo(this, 665, 9, textureX, textureY); // Box 214
		bodyModel[106] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 243
		bodyModel[107] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 197
		bodyModel[108] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 198
		bodyModel[109] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 199
		bodyModel[110] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 203
		bodyModel[111] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 205
		bodyModel[112] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 206
		bodyModel[113] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 207
		bodyModel[114] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 208
		bodyModel[115] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 209
		bodyModel[116] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 210
		bodyModel[117] = new ModelRendererTurbo(this, 609, 113, textureX, textureY); // Box 211
		bodyModel[118] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 212
		bodyModel[119] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 213
		bodyModel[120] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 214
		bodyModel[121] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 215
		bodyModel[122] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 216
		bodyModel[123] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 217
		bodyModel[124] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 218
		bodyModel[125] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 219
		bodyModel[126] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 220
		bodyModel[127] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 221
		bodyModel[128] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 222
		bodyModel[129] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 223
		bodyModel[130] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 224
		bodyModel[131] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 225
		bodyModel[132] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 226
		bodyModel[133] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 227
		bodyModel[134] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 236
		bodyModel[135] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 237
		bodyModel[136] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 238
		bodyModel[137] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 239
		bodyModel[138] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 240
		bodyModel[139] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 241
		bodyModel[140] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 242
		bodyModel[141] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 243
		bodyModel[142] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 260
		bodyModel[143] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 261
		bodyModel[144] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 262
		bodyModel[145] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 263
		bodyModel[146] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 264
		bodyModel[147] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 265
		bodyModel[148] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 266
		bodyModel[149] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 267
		bodyModel[150] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 268
		bodyModel[151] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 269
		bodyModel[152] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 270
		bodyModel[153] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 271
		bodyModel[154] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 272
		bodyModel[155] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 273
		bodyModel[156] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 274
		bodyModel[157] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 275
		bodyModel[158] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 276
		bodyModel[159] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 277
		bodyModel[160] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 279
		bodyModel[161] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 280
		bodyModel[162] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 281
		bodyModel[163] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 282
		bodyModel[164] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 283
		bodyModel[165] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 284
		bodyModel[166] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 285
		bodyModel[167] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 286
		bodyModel[168] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 287
		bodyModel[169] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 288
		bodyModel[170] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 289
		bodyModel[171] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 290
		bodyModel[172] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 291
		bodyModel[173] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 292
		bodyModel[174] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 293
		bodyModel[175] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 294
		bodyModel[176] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 295
		bodyModel[177] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 296
		bodyModel[178] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 297
		bodyModel[179] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 299
		bodyModel[180] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 300
		bodyModel[181] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 301
		bodyModel[182] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 302
		bodyModel[183] = new ModelRendererTurbo(this, 857, 169, textureX, textureY); // Box 303
		bodyModel[184] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 304
		bodyModel[185] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 305
		bodyModel[186] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 310
		bodyModel[187] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 311
		bodyModel[188] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 312
		bodyModel[189] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 314
		bodyModel[190] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 315
		bodyModel[191] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 316
		bodyModel[192] = new ModelRendererTurbo(this, 937, 137, textureX, textureY); // Box 318
		bodyModel[193] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 319
		bodyModel[194] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 320
		bodyModel[195] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 321
		bodyModel[196] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 327
		bodyModel[197] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 328
		bodyModel[198] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 329
		bodyModel[199] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 330
		bodyModel[200] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 331
		bodyModel[201] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 332
		bodyModel[202] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 333
		bodyModel[203] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 334
		bodyModel[204] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 335
		bodyModel[205] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 336
		bodyModel[206] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 337
		bodyModel[207] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 338
		bodyModel[208] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 339
		bodyModel[209] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 340
		bodyModel[210] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 341
		bodyModel[211] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 342
		bodyModel[212] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 343
		bodyModel[213] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 344
		bodyModel[214] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 345
		bodyModel[215] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 346
		bodyModel[216] = new ModelRendererTurbo(this, 4, 275, textureX, textureY); // Box 347
		bodyModel[217] = new ModelRendererTurbo(this, 226, 279, textureX, textureY); // Box 348
		bodyModel[218] = new ModelRendererTurbo(this, 226, 279, textureX, textureY); // Box 352
		bodyModel[219] = new ModelRendererTurbo(this, 4, 275, textureX, textureY); // Box 353

		bodyModel[0].addShapeBox(0F, 0F, 0F, 60, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-50F, -39F, 8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[1].setRotationPoint(-60F, -39F, 8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(-96F, -42F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 25, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 7
		bodyModel[3].setRotationPoint(-96F, -42F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 15, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 8
		bodyModel[4].setRotationPoint(-96F, -37F, 11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[5].setRotationPoint(-96F, -43F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 10
		bodyModel[6].setRotationPoint(-96F, -17F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[7].setRotationPoint(-99F, -43F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-99F, -43F, 3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 4F, -3F); // Box 13
		bodyModel[9].setRotationPoint(-99F, -42F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 4F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -1F); // Box 14
		bodyModel[10].setRotationPoint(-99F, -21F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-99F, -20F, 3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 16
		bodyModel[12].setRotationPoint(-99F, -20F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 17
		bodyModel[13].setRotationPoint(-99F, -32F, 10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -3F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 18
		bodyModel[14].setRotationPoint(-99F, -37F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, -1F, -3F); // Box 19
		bodyModel[15].setRotationPoint(-99F, -27F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 2F, 0F); // Box 20
		bodyModel[16].setRotationPoint(-29F, -48F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 1.5F, -4F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 1.5F, 1F, 0F, 0F, 2F, 0F); // Box 21
		bodyModel[17].setRotationPoint(-29F, -47F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 40, 1, 2, 0F,0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 1F, 6F, -4F, 1.6F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 6F, 3F, 0.6F); // Box 22
		bodyModel[18].setRotationPoint(-30F, -43F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 2F, 0F); // Box 23
		bodyModel[19].setRotationPoint(-60F, -45F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -1F, 0F, 0.5F, 0F, 0F, 1.5F, -1F, 0F, 0F, -2F, 1F, 0F, 1F, 0F, 0.5F, 0F, 0F, 1.5F, 1F, 0F, 0F, 2F, 1F); // Box 24
		bodyModel[20].setRotationPoint(-60F, -44F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -1F, 0F, 0.5F, 0F, 1F, 6F, -4F, 0.6F, 0F, -4F, 1F, 0F, 1F, 0F, 0.5F, 0F, 1F, 6F, 3F, -0.4F, 0F, 3F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-60F, -43F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[22].setRotationPoint(-60F, -19F, 4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[23].setRotationPoint(-60F, -18F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 60, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 33
		bodyModel[24].setRotationPoint(-50F, -19F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[25].setRotationPoint(-50F, -18F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 60, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 37
		bodyModel[26].setRotationPoint(-50F, -39F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[27].setRotationPoint(-60F, -39F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 25, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[28].setRotationPoint(-96F, -42F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 25, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[29].setRotationPoint(-96F, -42F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 15, 2, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-96F, -37F, -13F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[31].setRotationPoint(-96F, -43F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[32].setRotationPoint(-96F, -17F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[33].setRotationPoint(-99F, -43F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[34].setRotationPoint(-99F, -43F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[35].setRotationPoint(-99F, -42F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 5, 0F,0F, 4F, -3F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 47
		bodyModel[36].setRotationPoint(-99F, -21F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[37].setRotationPoint(-99F, -20F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 49
		bodyModel[38].setRotationPoint(-99F, -20F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 50
		bodyModel[39].setRotationPoint(-99F, -32F, -13F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -3F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 51
		bodyModel[40].setRotationPoint(-99F, -37F, -13F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -3F, 2F); // Box 52
		bodyModel[41].setRotationPoint(-99F, -27F, -13F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -2F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 53
		bodyModel[42].setRotationPoint(-29F, -48F, -3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -4F, 0F, 1.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F); // Box 54
		bodyModel[43].setRotationPoint(-29F, -47F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 40, 1, 2, 0F,6F, -4F, 1.6F, 0F, -4F, 1F, 0F, -1F, 0F, 0.5F, 0F, 0F, 6F, 3F, 0.6F, 0F, 3F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F); // Box 55
		bodyModel[44].setRotationPoint(-30F, -43F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, -2F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 56
		bodyModel[45].setRotationPoint(-60F, -45F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, -2F, 1F, 1.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 1F, 1.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F); // Box 57
		bodyModel[46].setRotationPoint(-60F, -44F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -4F, 1F, 6F, -4F, 0.6F, 0.5F, 0F, 1F, 0F, -1F, 0F, 0F, 3F, 0F, 6F, 3F, -0.4F, 0.5F, 0F, 1F, 0F, 1F, 0F); // Box 58
		bodyModel[47].setRotationPoint(-60F, -43F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 64
		bodyModel[48].setRotationPoint(-60F, -19F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[49].setRotationPoint(-60F, -18F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 60, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 66
		bodyModel[50].setRotationPoint(-50F, -19F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[51].setRotationPoint(-50F, -18F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 26, 3, 4, 0F,0F, 0F, 0F, -10F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, -10F, -1F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[52].setRotationPoint(-58F, -58F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[53].setRotationPoint(-76F, -58F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 111
		bodyModel[54].setRotationPoint(-78F, -58F, -2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -6F, 8F, 0F, -6F, 8F, 0F, 6F, -8F, 0F, 6F); // Box 132
		bodyModel[55].setRotationPoint(-59F, -20F, 12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, -6F, -14F, 0F, -6F, -14F, 0F, 6F, 14F, 0F, 6F); // Box 133
		bodyModel[56].setRotationPoint(-37F, -20F, 12F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[57].setRotationPoint(-51F, -1F, 18F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[58].setRotationPoint(-55F, -5F, 20F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[59].setRotationPoint(-55F, -8F, 20F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[60].setRotationPoint(-55F, -9F, 20F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 155
		bodyModel[61].setRotationPoint(-55F, 8F, 20F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[62].setRotationPoint(-55F, 5F, 20F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[63].setRotationPoint(-58F, -5F, 20F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[64].setRotationPoint(-45F, -5F, 20F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 159
		bodyModel[65].setRotationPoint(-59F, -5F, 20F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[66].setRotationPoint(-42F, -5F, 20F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[67].setRotationPoint(-58F, -8F, 20F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[68].setRotationPoint(-45F, -8F, 20F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[69].setRotationPoint(-45F, 5F, 20F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F); // Box 164
		bodyModel[70].setRotationPoint(-58F, 5F, 20F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F); // Box 166
		bodyModel[71].setRotationPoint(-56F, -6F, 22F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[72].setRotationPoint(-98F, -32F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[73].setRotationPoint(-98F, -39F, -1F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[74].setRotationPoint(-98F, -26F, -1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[75].setRotationPoint(-98F, -30F, 3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[76].setRotationPoint(-98F, -30F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 172
		bodyModel[77].setRotationPoint(-98F, -36F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[78].setRotationPoint(-98F, -36F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[79].setRotationPoint(-98F, -24F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, 1F); // Box 175
		bodyModel[80].setRotationPoint(-98F, -24F, -8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[81].setRotationPoint(-103F, -31F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 20, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[82].setRotationPoint(-50F, -39F, -8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[83].setRotationPoint(-50F, -42F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[84].setRotationPoint(-50F, -43F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[85].setRotationPoint(-46F, -43F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[86].setRotationPoint(-46F, -42F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[87].setRotationPoint(-46F, -39F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[88].setRotationPoint(-46F, -44F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 26, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[89].setRotationPoint(-50F, -22F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 17, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[90].setRotationPoint(-29F, -39F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[91].setRotationPoint(-29F, -42F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[92].setRotationPoint(-29F, -43F, -5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[93].setRotationPoint(-29F, -44F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[94].setRotationPoint(-43F, -31F, -0.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 190
		bodyModel[95].setRotationPoint(-43F, -34F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 191
		bodyModel[96].setRotationPoint(-43F, -34F, 0.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[97].setRotationPoint(-43F, -35F, -1.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[98].setRotationPoint(-39F, -28F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[99].setRotationPoint(-30F, -34F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[100].setRotationPoint(-39F, -30F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[101].setRotationPoint(-39F, -30F, 6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[102].setRotationPoint(-45.7F, -40F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[103].setRotationPoint(-45.7F, -40F, 3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[104].setRotationPoint(-45.7F, -37F, 3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[105].setRotationPoint(-45.7F, -42F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 29, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[106].setRotationPoint(-78F, -58F, 2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 29, 20, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 197
		bodyModel[107].setRotationPoint(-89F, -39F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 29, 1, 5, 0F,0F, 2F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 198
		bodyModel[108].setRotationPoint(-89F, -19F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 199
		bodyModel[109].setRotationPoint(-89F, -18F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 29, 1, 2, 0F,0F, -7F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 203
		bodyModel[110].setRotationPoint(-89F, -42F, -8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 29, 1, 6, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 205
		bodyModel[111].setRotationPoint(-89F, -43F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 206
		bodyModel[112].setRotationPoint(-89F, -43F, -6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 29, 20, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 207
		bodyModel[113].setRotationPoint(-89F, -39F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 29, 1, 5, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 208
		bodyModel[114].setRotationPoint(-89F, -19F, 4F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 29, 1, 8, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 209
		bodyModel[115].setRotationPoint(-89F, -18F, -4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 29, 1, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -7F, 1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 6F, 0F); // Box 210
		bodyModel[116].setRotationPoint(-89F, -42F, 6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F); // Box 211
		bodyModel[117].setRotationPoint(-89F, -43F, 3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[118].setRotationPoint(-41F, -50F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 8F, -3F, 0F, 8F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -3F, 0F, -8F, 3F, 0F, 0F, 0F); // Box 213
		bodyModel[119].setRotationPoint(-48F, -42F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 8F, 3F, 0F, 8F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 3F, 0F, -8F, -3F, 0F, 0F, 0F); // Box 214
		bodyModel[120].setRotationPoint(-48F, -42F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 1F, -4F, 0F, 0.2F, -3.2F); // Box 215
		bodyModel[121].setRotationPoint(-41F, -49F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -3.2F, 0F, 1F, -4F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 216
		bodyModel[122].setRotationPoint(-41F, -49F, 2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[123].setRotationPoint(-28F, -39F, -8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 218
		bodyModel[124].setRotationPoint(-24F, -39F, -8F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 219
		bodyModel[125].setRotationPoint(-18F, -39F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[126].setRotationPoint(-24F, -39F, 3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[127].setRotationPoint(-18F, -39F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[128].setRotationPoint(-12F, -39F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 223
		bodyModel[129].setRotationPoint(-3F, -39F, -8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 224
		bodyModel[130].setRotationPoint(-9F, -39F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[131].setRotationPoint(-9F, -39F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[132].setRotationPoint(-3F, -39F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 7, 20, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[133].setRotationPoint(3F, -39F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[134].setRotationPoint(-9F, -33F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 237
		bodyModel[135].setRotationPoint(-8F, -34F, -4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[136].setRotationPoint(-7F, -34F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 239
		bodyModel[137].setRotationPoint(-1F, -34F, -4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 240
		bodyModel[138].setRotationPoint(-15F, -34F, -4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[139].setRotationPoint(-21F, -34F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 242
		bodyModel[140].setRotationPoint(-22F, -34F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[141].setRotationPoint(-19F, -33F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 6F, 8F, 0F, 6F, 8F, 0F, -6F, -8F, 0F, -6F); // Box 260
		bodyModel[142].setRotationPoint(-59F, -20F, -13F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 6F, -14F, 0F, 6F, -14F, 0F, -6F, 14F, 0F, -6F); // Box 261
		bodyModel[143].setRotationPoint(-37F, -20F, -13F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[144].setRotationPoint(-51F, -1F, -20F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[145].setRotationPoint(-55F, -5F, -22F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[146].setRotationPoint(-55F, -8F, -22F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[147].setRotationPoint(-55F, -9F, -22F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 266
		bodyModel[148].setRotationPoint(-55F, 8F, -22F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[149].setRotationPoint(-55F, 5F, -22F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[150].setRotationPoint(-58F, -5F, -22F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[151].setRotationPoint(-45F, -5F, -22F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 270
		bodyModel[152].setRotationPoint(-59F, -5F, -22F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[153].setRotationPoint(-42F, -5F, -22F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[154].setRotationPoint(-58F, -8F, -22F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[155].setRotationPoint(-45F, -8F, -22F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[156].setRotationPoint(-45F, 5F, -22F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F); // Box 275
		bodyModel[157].setRotationPoint(-58F, 5F, -22F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 12, 12, 2, 0F,-4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[158].setRotationPoint(-56F, -6F, -24F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 277
		bodyModel[159].setRotationPoint(-54F, -19F, -9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 279
		bodyModel[160].setRotationPoint(-23F, -19F, -8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[161].setRotationPoint(-54F, -12F, -6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[162].setRotationPoint(-23F, -12F, -6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[163].setRotationPoint(-53F, -12F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[164].setRotationPoint(-38F, -18F, -6F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 284
		bodyModel[165].setRotationPoint(-37F, -12F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 285
		bodyModel[166].setRotationPoint(-54F, -19F, 8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 286
		bodyModel[167].setRotationPoint(-23F, -19F, 7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[168].setRotationPoint(-54F, -12F, 5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[169].setRotationPoint(-23F, -12F, 5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[170].setRotationPoint(-53F, -12F, 5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[171].setRotationPoint(-38F, -18F, 5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 291
		bodyModel[172].setRotationPoint(-37F, -12F, 5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 292
		bodyModel[173].setRotationPoint(-23F, -12F, -5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[174].setRotationPoint(-23F, -14F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[175].setRotationPoint(-23F, -12F, 1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[176].setRotationPoint(-54F, -12F, 1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[177].setRotationPoint(-54F, -14F, -1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 297
		bodyModel[178].setRotationPoint(-54F, -12F, -5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 59, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[179].setRotationPoint(-72F, -13F, -3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 59, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 300
		bodyModel[180].setRotationPoint(-72F, -8F, -3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 59, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 301
		bodyModel[181].setRotationPoint(-72F, -7F, -2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 59, 1, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[182].setRotationPoint(-72F, -14F, -2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 59, 4, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[183].setRotationPoint(-72F, -12F, -4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 59, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 304
		bodyModel[184].setRotationPoint(-72F, -12F, 3F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 305
		bodyModel[185].setRotationPoint(-75F, -12F, -3F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 310
		bodyModel[186].setRotationPoint(-75F, -13F, -3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -2F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2F, -2F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 311
		bodyModel[187].setRotationPoint(-75F, -14F, -2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -2F, -2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -2F, -2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 312
		bodyModel[188].setRotationPoint(-75F, -12F, -4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 314
		bodyModel[189].setRotationPoint(-75F, -8F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -2F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2F, -2F); // Box 315
		bodyModel[190].setRotationPoint(-75F, -7F, -2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -2F); // Box 316
		bodyModel[191].setRotationPoint(-75F, -12F, 3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 20, 4, 6, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 318
		bodyModel[192].setRotationPoint(-13F, -12F, -3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F,0F, 0F, -1F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F); // Box 319
		bodyModel[193].setRotationPoint(-13F, -13F, -3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, -0.5F, -1F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 320
		bodyModel[194].setRotationPoint(-13F, -14F, -2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, -1F, -0.5F, 0F, -2F, -4F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -4F, 0F, -2F, 3F, 0F, 0F, 0F); // Box 321
		bodyModel[195].setRotationPoint(-13F, -12F, -4F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 20, 1, 6, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -1F); // Box 327
		bodyModel[196].setRotationPoint(-13F, -8F, -3F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -0.5F, -1F); // Box 328
		bodyModel[197].setRotationPoint(-13F, -7F, -2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -4F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, -4F, 0F, -1F, -0.5F); // Box 329
		bodyModel[198].setRotationPoint(-13F, -12F, 3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[199].setRotationPoint(-2F, -14F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[200].setRotationPoint(1F, -14F, -0.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[201].setRotationPoint(6F, -13F, -0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[202].setRotationPoint(2F, -12.5F, -0.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[203].setRotationPoint(4F, -12F, -0.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 335
		bodyModel[204].setRotationPoint(-2F, -9F, -0.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[205].setRotationPoint(1F, -7F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[206].setRotationPoint(6F, -10F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[207].setRotationPoint(6F, -10.5F, 0F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[208].setRotationPoint(1F, -10.5F, 3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 340
		bodyModel[209].setRotationPoint(-2F, -10.5F, 1F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[210].setRotationPoint(6F, -10.5F, -3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[211].setRotationPoint(1F, -10.5F, -4F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[212].setRotationPoint(-2F, -10.5F, -4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[213].setRotationPoint(4F, -10.5F, -2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[214].setRotationPoint(2F, -10.5F, -2.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[215].setRotationPoint(7F, -46F, -0.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 101, 100, 1, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, -80F, -80F, 0F, -80F, -80F, 0F, 0F, -80F, 0F); // Box 347
		bodyModel[216].setRotationPoint(-11F, -39F, -8.4F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 100, 0, 100, 0F,0F, 0F, 0F, -75F, 0F, 0F, -75F, 0F, -75F, 0F, 0F, -75F, 0F, 0F, 0F, -75F, 0F, 0F, -75F, 0F, -75F, 0F, 0F, -75F); // Box 348
		bodyModel[217].setRotationPoint(-63F, -58.3F, 66F);
		bodyModel[217].rotateAngleZ = -0.03490659F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 100, 0, 100, 0F,0F, 0F, -75F, -75F, 0F, -75F, -75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -75F, -75F, 0F, -75F, -75F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[218].setRotationPoint(-63F, -58.3F, -166F);
		bodyModel[218].rotateAngleZ = -0.03490659F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 101, 100, 1, 0F,0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, -80F, -80F, 0F, -80F, -80F, 0F, 0F, -80F, 0F); // Box 353
		bodyModel[219].setRotationPoint(-11F, -19F, 8.4F);
		bodyModel[219].rotateAngleX = 3.14159265F;
		bodyModel[219].rotateAngleZ = 0.01745329F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 17
		tailModel[1] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 18
		tailModel[2] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 19
		tailModel[3] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 68
		tailModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 69
		tailModel[5] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 70
		tailModel[6] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 71
		tailModel[7] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 72
		tailModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 73
		tailModel[9] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 122
		tailModel[10] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 124
		tailModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 125
		tailModel[12] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 126
		tailModel[13] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 128
		tailModel[14] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 129
		tailModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 131
		tailModel[16] = new ModelRendererTurbo(this, 873, 41, textureX, textureY); // Box 257
		tailModel[17] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 258
		tailModel[18] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 259
		tailModel[19] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 324
		tailModel[20] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 325
		tailModel[21] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 326

		tailModel[0].addShapeBox(0F, 0F, 0F, 70, 3, 2, 0F,0F, 2F, 0F, 0F, -4F, 4F, 0F, -4F, -6F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, 3F, 4F, 0F, 3F, -7F, 0F, 0F, 0F); // Box 17
		tailModel[0].setRotationPoint(10F, -40F, 5F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 70, 4, 2, 0F,0F, 1F, 0F, 0F, -5F, 3F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 3F, 0F, 5F, -4F, 0F, 0F, 0F); // Box 18
		tailModel[1].setRotationPoint(10F, -42F, 3F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 70, 4, 3, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, -3F, 0F, 0F, 0F); // Box 19
		tailModel[2].setRotationPoint(10F, -43F, 0F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 70, 20, 1, 0F,0F, 0F, 0F, 0F, -3F, -7F, 0F, -3F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, 7F, 0F, 0F, 0F); // Box 68
		tailModel[3].setRotationPoint(10F, -39F, -8F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 70, 3, 2, 0F,0F, -1F, 1F, 0F, -4F, -6F, 0F, -4F, 4F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, -7F, 0F, 3F, 4F, 0F, -2F, 0F); // Box 69
		tailModel[4].setRotationPoint(10F, -40F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 70, 4, 2, 0F,0F, 0F, 0F, 0F, -6F, -4F, 0F, -5F, 3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 5F, -4F, 0F, 5F, 3F, 0F, -1F, 0F); // Box 70
		tailModel[5].setRotationPoint(10F, -42F, -5F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 70, 4, 3, 0F,0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -3F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[6].setRotationPoint(10F, -43F, -3F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, 0F, -1F, 0F, 2F, -8F, 0F, 2F, 4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, -7F, 0F, -2F, 4F, 0F, 1F, 0F); // Box 72
		tailModel[7].setRotationPoint(10F, -19F, -8F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 73
		tailModel[8].setRotationPoint(10F, -18F, -4F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 7, 38, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		tailModel[9].setRotationPoint(80F, -58F, -1F);

		tailModel[10].addShapeBox(-16F, 0F, 0F, 12, 19, 2, 0F,0F, -10F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 2F, -1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, -1F); // Box 124
		tailModel[10].setRotationPoint(84F, -58F, -1F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 11, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		tailModel[11].setRotationPoint(69F, -36F, -29F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 27, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 126
		tailModel[12].setRotationPoint(67F, -36F, -29F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 11, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 128
		tailModel[13].setRotationPoint(69F, -36F, 0F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 27, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 129
		tailModel[14].setRotationPoint(67F, -36F, 2F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 131
		tailModel[15].setRotationPoint(70F, -22F, -0.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		tailModel[16].setRotationPoint(71F, -16F, -0.5F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		tailModel[17].setRotationPoint(71F, -17F, -0.5F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 259
		tailModel[18].setRotationPoint(71F, -14F, -0.5F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 70, 20, 1, 0F,0F, 0F, 0F, 0F, -3F, 7F, 0F, -3F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 7F, 0F, -2F, -7F, 0F, 0F, 0F); // Box 324
		tailModel[19].setRotationPoint(10F, -39F, 7F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, -1F, 0F, 0F, 2F, 4F, 0F, 2F, -8F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -2F, 4F, 0F, -3F, -7F, 0F, -1F, 0F); // Box 325
		tailModel[20].setRotationPoint(10F, -19F, 4F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 70, 1, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, 0F); // Box 326
		tailModel[21].setRotationPoint(10F, -18F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 92
		leftWingModel[1] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 93
		leftWingModel[2] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 94
		leftWingModel[3] = new ModelRendererTurbo(this, 769, 17, textureX, textureY); // Box 101
		leftWingModel[4] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 102
		leftWingModel[5] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 106
		leftWingModel[6] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 107
		leftWingModel[7] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 108
		leftWingModel[8] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 229
		leftWingModel[9] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 230
		leftWingModel[10] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 231
		leftWingModel[11] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 232
		leftWingModel[12] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 234
		leftWingModel[13] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 235
		leftWingModel[14] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 249
		leftWingModel[15] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 250
		leftWingModel[16] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 251
		leftWingModel[17] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 252
		leftWingModel[18] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 255
		leftWingModel[19] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 256

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 2, 3, 85, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92
		leftWingModel[0].setRotationPoint(-78F, -58F, -116F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 85, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftWingModel[1].setRotationPoint(-76F, -58F, -116F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 32, 3, 60, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94
		leftWingModel[2].setRotationPoint(-58F, -58F, -91F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,-13F, -1F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -13F, -1F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 101
		leftWingModel[3].setRotationPoint(-78F, -58F, -125F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		leftWingModel[4].setRotationPoint(-76F, -58F, -125F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 18, 3, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		leftWingModel[5].setRotationPoint(-76F, -58F, -31F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 29, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 107
		leftWingModel[6].setRotationPoint(-78F, -58F, -31F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 26, 3, 29, 0F,0F, 0F, 0F, -3F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -10F, -1F, 0F, 0F, 0F, 0F); // Box 108
		leftWingModel[7].setRotationPoint(-58F, -58F, -31F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 107, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 229
		leftWingModel[8].setRotationPoint(-72F, -22F, -115F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 18, 3, 107, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		leftWingModel[9].setRotationPoint(-70F, -22F, -115F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,-13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		leftWingModel[10].setRotationPoint(-70F, -22F, -124F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,-13F, -1F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -13F, -1F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 232
		leftWingModel[11].setRotationPoint(-72F, -22F, -124F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 32, 3, 68, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 234
		leftWingModel[12].setRotationPoint(-52F, -22F, -90F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 26, 3, 18, 0F,0F, 0F, 0F, -3F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -10F, -1F, 0F, 0F, 0F, 0F); // Box 235
		leftWingModel[13].setRotationPoint(-52F, -22F, -22F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 4F, -4F, 0F, 4F); // Box 249
		leftWingModel[14].setRotationPoint(-50F, -56F, -75F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 3, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, 4F, 0F, -4F, 4F, 0F, 4F, -4F, 0F, 4F); // Box 250
		leftWingModel[15].setRotationPoint(-72F, -55F, -75F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 3, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, 6F, 0F, -4F, 6F, 0F, 4F, -6F, 0F, 4F); // Box 251
		leftWingModel[16].setRotationPoint(-75F, -55F, -27F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, 6F, 0F, -4F, 6F, 0F, 4F, -6F, 0F, 4F); // Box 252
		leftWingModel[17].setRotationPoint(-53F, -56F, -27F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 11F, 6F, 0F, 11F, 6F, 0F, -11F, -6F, 0F, -11F); // Box 255
		leftWingModel[18].setRotationPoint(-56F, -32F, -9F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 11F, -6F, 0F, 11F, -6F, 0F, -11F, 6F, 0F, -11F); // Box 256
		leftWingModel[19].setRotationPoint(-56F, -32F, -9F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 230
		rightWingModel[1] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 231
		rightWingModel[2] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 232
		rightWingModel[3] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 233
		rightWingModel[4] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 234
		rightWingModel[5] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 235
		rightWingModel[6] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 236
		rightWingModel[7] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 237
		rightWingModel[8] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 238
		rightWingModel[9] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 239
		rightWingModel[10] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 240
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 241
		rightWingModel[12] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 242
		rightWingModel[13] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 244
		rightWingModel[14] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 228
		rightWingModel[15] = new ModelRendererTurbo(this, 705, 89, textureX, textureY); // Box 245
		rightWingModel[16] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 246
		rightWingModel[17] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 247
		rightWingModel[18] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 248
		rightWingModel[19] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 253
		rightWingModel[20] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 254

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 2, 3, 107, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 230
		rightWingModel[0].setRotationPoint(-72F, -22F, 8F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 18, 3, 107, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightWingModel[1].setRotationPoint(-70F, -22F, 8F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F); // Box 232
		rightWingModel[2].setRotationPoint(-70F, -22F, 115F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, -1F, 0F); // Box 233
		rightWingModel[3].setRotationPoint(-72F, -22F, 115F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 32, 3, 34, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -12F, 0F, 0F, 0F); // Box 234
		rightWingModel[4].setRotationPoint(-52F, -22F, 90F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 32, 3, 68, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 235
		rightWingModel[5].setRotationPoint(-52F, -22F, 22F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 2, 3, 85, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 236
		rightWingModel[6].setRotationPoint(-78F, -58F, 31F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 18, 3, 85, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightWingModel[7].setRotationPoint(-76F, -58F, 31F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 32, 3, 60, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 238
		rightWingModel[8].setRotationPoint(-58F, -58F, 31F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 32, 3, 34, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -12F, 0F, 0F, 0F); // Box 239
		rightWingModel[9].setRotationPoint(-58F, -58F, 91F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -13F, -1F, 0F); // Box 240
		rightWingModel[10].setRotationPoint(-78F, -58F, 116F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F); // Box 241
		rightWingModel[11].setRotationPoint(-76F, -58F, 116F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 18, 3, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightWingModel[12].setRotationPoint(-76F, -58F, 2F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 26, 3, 29, 0F,0F, 0F, 0F, -10F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F); // Box 244
		rightWingModel[13].setRotationPoint(-58F, -58F, 2F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 26, 3, 18, 0F,0F, 0F, 0F, -10F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F); // Box 228
		rightWingModel[14].setRotationPoint(-52F, -22F, 4F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 3, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 4F, 6F, 0F, 4F, 6F, 0F, -4F, -6F, 0F, -4F); // Box 245
		rightWingModel[15].setRotationPoint(-75F, -55F, 25F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 4F, 6F, 0F, 4F, 6F, 0F, -4F, -6F, 0F, -4F); // Box 246
		rightWingModel[16].setRotationPoint(-53F, -56F, 25F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 3, 35, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, -4F, -4F, 0F, -4F); // Box 247
		rightWingModel[17].setRotationPoint(-50F, -56F, 73F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 3, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 4F, 4F, 0F, 4F, 4F, 0F, -4F, -4F, 0F, -4F); // Box 248
		rightWingModel[18].setRotationPoint(-72F, -55F, 73F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -11F, 6F, 0F, -11F, 6F, 0F, 11F, -6F, 0F, 11F); // Box 253
		rightWingModel[19].setRotationPoint(-56F, -32F, 7F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -11F, -6F, 0F, -11F, -6F, 0F, 11F, 6F, 0F, 11F); // Box 254
		rightWingModel[20].setRotationPoint(-56F, -32F, 7F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 123

		yawFlapModel[0].addShapeBox(7F, 0F, 0F, 15, 38, 2, 0F,0F, 0F, 0F, 0F, -7F, -1F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F); // Box 123
		yawFlapModel[0].setRotationPoint(80F, -58F, -1F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 244

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 11, 2, 32, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 4F); // Box 244
		pitchFlapLeftModel[0].setRotationPoint(80F, -36F, -37F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 130

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 11, 2, 32, 0F,0F, 0F, 4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 130
		pitchFlapRightModel[0].setRotationPoint(80F, -36F, 5F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 97
		pitchFlapLeftWingModel[1] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Box 233

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 32, 3, 34, 0F,0F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 97
		pitchFlapLeftWingModel[0].setRotationPoint(-58F, -58F, -125F);

		pitchFlapLeftWingModel[1].addShapeBox(0F, 0F, 0F, 32, 3, 34, 0F,0F, 0F, 0F, 0F, -2F, -12F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 233
		pitchFlapLeftWingModel[1].setRotationPoint(-52F, -22F, -124F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][3];
		propellerModels[0] = makeProp1(-101F, -29F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 397, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 397, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 397, textureX, textureY);
		prop[0].addBox(-0.5F, -27F, -2F, 1, 27, 4, 0.0F);
		prop[1].addBox(-0.5F, -27F, -2F, 1, 27, 4, 0.0F);
		prop[2].addBox(-0.5F, -27F, -2F, 1, 27, 4, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[0];

		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[17];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 0
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 1
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 2
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 3
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 4
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 5
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 6
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 7
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 8
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 9
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 10
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 11
		gun_2_Model[2][12] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 12
		gun_2_Model[2][13] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 13
		gun_2_Model[2][14] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 14
		gun_2_Model[2][15] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 15
		gun_2_Model[2][16] = new ModelRendererTurbo(this, 1, 407, textureX, textureY); // Box 16

		gun_2_Model[2][0].addShapeBox(-3F, -2F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[2][1].addShapeBox(-3F, -1F, -0.5F, 6, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 1

		gun_2_Model[2][2].addShapeBox(3F, -1.75F, -0.5F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.5F, -0.25F); // Box 2

		gun_2_Model[2][3].addShapeBox(3F, -1.25F, -0.5F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 3

		gun_2_Model[2][4].addShapeBox(10F, -2.25F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 4

		gun_2_Model[2][5].addShapeBox(10F, -4.25F, -0.5F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F); // Box 5

		gun_2_Model[2][6].addShapeBox(-3.5F, -4.25F, -0.5F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F); // Box 6

		gun_2_Model[2][7].addShapeBox(0F, -3F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_2_Model[2][8].addShapeBox(0F, -3F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8

		gun_2_Model[2][9].addShapeBox(0F, -3F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9

		gun_2_Model[2][10].addShapeBox(-6F, -3.25F, -0.5F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 10

		gun_2_Model[2][11].addShapeBox(-5F, -3.25F, -0.5F, 2, 2, 1, 0F,0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F); // Box 11

		gun_2_Model[2][12].addShapeBox(-5F, -1.25F, -0.5F, 2, 2, 1, 0F,0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F); // Box 12

		gun_2_Model[2][13].addShapeBox(-3.25F, -1.25F, -0.5F, 1, 3, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 13

		gun_2_Model[2][14].addShapeBox(-2.75F, -1.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 14

		gun_2_Model[2][15].addShapeBox(-0.75F, -1.3F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 15

		gun_2_Model[2][16].addShapeBox(-1F, -1.3F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(8F, -46F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);
	}
}