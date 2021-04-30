//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.05.2016 - 08:14:31
// Last changed on: 05.05.2016 - 08:14:31

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWarMongerTog extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelWarMongerTog() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[426];
		turretModel = new ModelRendererTurbo[95];
		barrelModel = new ModelRendererTurbo[17];
		leftTrackWheelModels = new ModelRendererTurbo[17];
		rightTrackWheelModels = new ModelRendererTurbo[17];
		leftTrackModel = new ModelRendererTurbo[20];
		rightTrackModel = new ModelRendererTurbo[20];

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
		bodyModel[0] = new ModelRendererTurbo(this, 188, 341, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 79, 312, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 92, 212, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 16
		bodyModel[10] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 793, 9, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 30
		bodyModel[19] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 53
		bodyModel[43] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 54
		bodyModel[44] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 777, 25, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 59
		bodyModel[49] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 86
		bodyModel[50] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 107
		bodyModel[51] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 108
		bodyModel[52] = new ModelRendererTurbo(this, 873, 33, textureX, textureY); // Box 109
		bodyModel[53] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 152
		bodyModel[54] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 153
		bodyModel[55] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 156
		bodyModel[56] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 157
		bodyModel[57] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 158
		bodyModel[58] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 159
		bodyModel[59] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 160
		bodyModel[60] = new ModelRendererTurbo(this, 537, 129, textureX, textureY); // Box 163
		bodyModel[61] = new ModelRendererTurbo(this, 593, 129, textureX, textureY); // Box 164
		bodyModel[62] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 166
		bodyModel[63] = new ModelRendererTurbo(this, 745, 129, textureX, textureY); // Box 168
		bodyModel[64] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 169
		bodyModel[65] = new ModelRendererTurbo(this, 809, 129, textureX, textureY); // Box 170
		bodyModel[66] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 171
		bodyModel[67] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 172
		bodyModel[68] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 173
		bodyModel[69] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 174
		bodyModel[70] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 175
		bodyModel[71] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 176
		bodyModel[72] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 177
		bodyModel[73] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 178
		bodyModel[74] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 179
		bodyModel[75] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 180
		bodyModel[76] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 181
		bodyModel[77] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 182
		bodyModel[78] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 183
		bodyModel[79] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 184
		bodyModel[80] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 185
		bodyModel[81] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 186
		bodyModel[82] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 187
		bodyModel[83] = new ModelRendererTurbo(this, 929, 129, textureX, textureY); // Box 188
		bodyModel[84] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 193
		bodyModel[85] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 200
		bodyModel[86] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 201
		bodyModel[87] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 202
		bodyModel[88] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 203
		bodyModel[89] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 207
		bodyModel[90] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 208
		bodyModel[91] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 209
		bodyModel[92] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 210
		bodyModel[93] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 211
		bodyModel[94] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 212
		bodyModel[95] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 213
		bodyModel[96] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 214
		bodyModel[97] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 215
		bodyModel[98] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 216
		bodyModel[99] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 217
		bodyModel[100] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 218
		bodyModel[101] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 219
		bodyModel[102] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 220
		bodyModel[103] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 221
		bodyModel[104] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 222
		bodyModel[105] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 223
		bodyModel[106] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 224
		bodyModel[107] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 225
		bodyModel[108] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 226
		bodyModel[109] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 227
		bodyModel[110] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 228
		bodyModel[111] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 229
		bodyModel[112] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 230
		bodyModel[113] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 231
		bodyModel[114] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 232
		bodyModel[115] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 233
		bodyModel[116] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 234
		bodyModel[117] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 235
		bodyModel[118] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 236
		bodyModel[119] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 237
		bodyModel[120] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 238
		bodyModel[121] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 239
		bodyModel[122] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 240
		bodyModel[123] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 241
		bodyModel[124] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 242
		bodyModel[125] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 243
		bodyModel[126] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 244
		bodyModel[127] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 245
		bodyModel[128] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 246
		bodyModel[129] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 247
		bodyModel[130] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 248
		bodyModel[131] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 249
		bodyModel[132] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 250
		bodyModel[133] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 251
		bodyModel[134] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 252
		bodyModel[135] = new ModelRendererTurbo(this, 737, 137, textureX, textureY); // Box 253
		bodyModel[136] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 254
		bodyModel[137] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 255
		bodyModel[138] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 256
		bodyModel[139] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 257
		bodyModel[140] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 258
		bodyModel[141] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 263
		bodyModel[142] = new ModelRendererTurbo(this, 689, 41, textureX, textureY); // Box 264
		bodyModel[143] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 265
		bodyModel[144] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 266
		bodyModel[145] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 268
		bodyModel[146] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 269
		bodyModel[147] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 270
		bodyModel[148] = new ModelRendererTurbo(this, 737, 57, textureX, textureY); // Box 271
		bodyModel[149] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 272
		bodyModel[150] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 273
		bodyModel[151] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 274
		bodyModel[152] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 275
		bodyModel[153] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 276
		bodyModel[154] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 277
		bodyModel[155] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 278
		bodyModel[156] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Box 279
		bodyModel[157] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 280
		bodyModel[158] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 281
		bodyModel[159] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 282
		bodyModel[160] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 283
		bodyModel[161] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 284
		bodyModel[162] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 285
		bodyModel[163] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 286
		bodyModel[164] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 287
		bodyModel[165] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 288
		bodyModel[166] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 289
		bodyModel[167] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 290
		bodyModel[168] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 291
		bodyModel[169] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 292
		bodyModel[170] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 293
		bodyModel[171] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 294
		bodyModel[172] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 295
		bodyModel[173] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 296
		bodyModel[174] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 297
		bodyModel[175] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 298
		bodyModel[176] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 299
		bodyModel[177] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 300
		bodyModel[178] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 301
		bodyModel[179] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 302
		bodyModel[180] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 306
		bodyModel[181] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 307
		bodyModel[182] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 308
		bodyModel[183] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 309
		bodyModel[184] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 310
		bodyModel[185] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 311
		bodyModel[186] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 312
		bodyModel[187] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 313
		bodyModel[188] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 314
		bodyModel[189] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 315
		bodyModel[190] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 316
		bodyModel[191] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 317
		bodyModel[192] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 318
		bodyModel[193] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 319
		bodyModel[194] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 320
		bodyModel[195] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 321
		bodyModel[196] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 322
		bodyModel[197] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 323
		bodyModel[198] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 324
		bodyModel[199] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 325
		bodyModel[200] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 326
		bodyModel[201] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 327
		bodyModel[202] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 328
		bodyModel[203] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 304
		bodyModel[204] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 305
		bodyModel[205] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 306
		bodyModel[206] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 307
		bodyModel[207] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 308
		bodyModel[208] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 309
		bodyModel[209] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 310
		bodyModel[210] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 311
		bodyModel[211] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Box 312
		bodyModel[212] = new ModelRendererTurbo(this, 609, 81, textureX, textureY); // Box 313
		bodyModel[213] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 314
		bodyModel[214] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 315
		bodyModel[215] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 316
		bodyModel[216] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 318
		bodyModel[217] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 319
		bodyModel[218] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 320
		bodyModel[219] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 321
		bodyModel[220] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 322
		bodyModel[221] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 323
		bodyModel[222] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 324
		bodyModel[223] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 325
		bodyModel[224] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 326
		bodyModel[225] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 327
		bodyModel[226] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 328
		bodyModel[227] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Box 329
		bodyModel[228] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 330
		bodyModel[229] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 331
		bodyModel[230] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 332
		bodyModel[231] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 335
		bodyModel[232] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 336
		bodyModel[233] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 337
		bodyModel[234] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 338
		bodyModel[235] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 339
		bodyModel[236] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 340
		bodyModel[237] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 341
		bodyModel[238] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 342
		bodyModel[239] = new ModelRendererTurbo(this, 593, 161, textureX, textureY); // Box 343
		bodyModel[240] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 344
		bodyModel[241] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 345
		bodyModel[242] = new ModelRendererTurbo(this, 649, 89, textureX, textureY); // Box 346
		bodyModel[243] = new ModelRendererTurbo(this, 1017, 89, textureX, textureY); // Box 347
		bodyModel[244] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 348
		bodyModel[245] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 349
		bodyModel[246] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 350
		bodyModel[247] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Box 351
		bodyModel[248] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 352
		bodyModel[249] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 353
		bodyModel[250] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 354
		bodyModel[251] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 355
		bodyModel[252] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 356
		bodyModel[253] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 357
		bodyModel[254] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 358
		bodyModel[255] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 359
		bodyModel[256] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 360
		bodyModel[257] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 361
		bodyModel[258] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 362
		bodyModel[259] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 363
		bodyModel[260] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 364
		bodyModel[261] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 365
		bodyModel[262] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 366
		bodyModel[263] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 367
		bodyModel[264] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 368
		bodyModel[265] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 369
		bodyModel[266] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 370
		bodyModel[267] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 372
		bodyModel[268] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 373
		bodyModel[269] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 374
		bodyModel[270] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 375
		bodyModel[271] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 376
		bodyModel[272] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 377
		bodyModel[273] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 378
		bodyModel[274] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 379
		bodyModel[275] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 380
		bodyModel[276] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 381
		bodyModel[277] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 382
		bodyModel[278] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 383
		bodyModel[279] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 384
		bodyModel[280] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 385
		bodyModel[281] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 386
		bodyModel[282] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 387
		bodyModel[283] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 388
		bodyModel[284] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 389
		bodyModel[285] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 390
		bodyModel[286] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 391
		bodyModel[287] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 392
		bodyModel[288] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 393
		bodyModel[289] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 394
		bodyModel[290] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 395
		bodyModel[291] = new ModelRendererTurbo(this, 149, 300, textureX, textureY); // Box 396
		bodyModel[292] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 397
		bodyModel[293] = new ModelRendererTurbo(this, 118, 285, textureX, textureY); // Box 398
		bodyModel[294] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 399
		bodyModel[295] = new ModelRendererTurbo(this, 536, 358, textureX, textureY); // Box 400
		bodyModel[296] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 401
		bodyModel[297] = new ModelRendererTurbo(this, 429, 269, textureX, textureY); // Box 402
		bodyModel[298] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 403
		bodyModel[299] = new ModelRendererTurbo(this, 703, 356, textureX, textureY); // Box 404
		bodyModel[300] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 405
		bodyModel[301] = new ModelRendererTurbo(this, 393, 296, textureX, textureY); // Box 406
		bodyModel[302] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 407
		bodyModel[303] = new ModelRendererTurbo(this, 375, 288, textureX, textureY); // Box 408
		bodyModel[304] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 409
		bodyModel[305] = new ModelRendererTurbo(this, 383, 251, textureX, textureY); // Box 410
		bodyModel[306] = new ModelRendererTurbo(this, 695, 382, textureX, textureY); // Box 412
		bodyModel[307] = new ModelRendererTurbo(this, 411, 226, textureX, textureY); // Box 413
		bodyModel[308] = new ModelRendererTurbo(this, 683, 305, textureX, textureY); // Box 414
		bodyModel[309] = new ModelRendererTurbo(this, 96, 3, textureX, textureY); // Box 415
		bodyModel[310] = new ModelRendererTurbo(this, 50, 29, textureX, textureY); // Box 416
		bodyModel[311] = new ModelRendererTurbo(this, 16, 34, textureX, textureY); // Box 417
		bodyModel[312] = new ModelRendererTurbo(this, 397, 271, textureX, textureY); // Box 418
		bodyModel[313] = new ModelRendererTurbo(this, 377, 457, textureX, textureY); // Box 419
		bodyModel[314] = new ModelRendererTurbo(this, 281, 403, textureX, textureY); // Box 420
		bodyModel[315] = new ModelRendererTurbo(this, 320, 292, textureX, textureY); // Box 421
		bodyModel[316] = new ModelRendererTurbo(this, 474, 386, textureX, textureY); // Box 422
		bodyModel[317] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 423
		bodyModel[318] = new ModelRendererTurbo(this, 139, 135, textureX, textureY); // Box 424
		bodyModel[319] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 425
		bodyModel[320] = new ModelRendererTurbo(this, 292, 306, textureX, textureY); // Box 426
		bodyModel[321] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 427
		bodyModel[322] = new ModelRendererTurbo(this, 352, 265, textureX, textureY); // Box 428
		bodyModel[323] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 429
		bodyModel[324] = new ModelRendererTurbo(this, 404, 314, textureX, textureY); // Box 430
		bodyModel[325] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 431
		bodyModel[326] = new ModelRendererTurbo(this, 276, 318, textureX, textureY); // Box 432
		bodyModel[327] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 433
		bodyModel[328] = new ModelRendererTurbo(this, 294, 292, textureX, textureY); // Box 434
		bodyModel[329] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 435
		bodyModel[330] = new ModelRendererTurbo(this, 369, 301, textureX, textureY); // Box 436
		bodyModel[331] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 437
		bodyModel[332] = new ModelRendererTurbo(this, 329, 318, textureX, textureY); // Box 438
		bodyModel[333] = new ModelRendererTurbo(this, 380, 230, textureX, textureY); // Box 439
		bodyModel[334] = new ModelRendererTurbo(this, 72, 232, textureX, textureY); // Box 440
		bodyModel[335] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Box 441
		bodyModel[336] = new ModelRendererTurbo(this, 145, 271, textureX, textureY); // Box 442
		bodyModel[337] = new ModelRendererTurbo(this, 189, 8, textureX, textureY); // Box 443
		bodyModel[338] = new ModelRendererTurbo(this, 188, 25, textureX, textureY); // Box 444
		bodyModel[339] = new ModelRendererTurbo(this, 34, 2, textureX, textureY); // Box 471
		bodyModel[340] = new ModelRendererTurbo(this, 84, 31, textureX, textureY); // Box 472
		bodyModel[341] = new ModelRendererTurbo(this, 78, 374, textureX, textureY); // Box 473
		bodyModel[342] = new ModelRendererTurbo(this, 122, 234, textureX, textureY); // Box 474
		bodyModel[343] = new ModelRendererTurbo(this, 263, 235, textureX, textureY); // Box 462
		bodyModel[344] = new ModelRendererTurbo(this, 116, 250, textureX, textureY); // Box 463
		bodyModel[345] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 466
		bodyModel[346] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 467
		bodyModel[347] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 468
		bodyModel[348] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 469
		bodyModel[349] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 470
		bodyModel[350] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 471
		bodyModel[351] = new ModelRendererTurbo(this, 40, 340, textureX, textureY); // Box 472
		bodyModel[352] = new ModelRendererTurbo(this, 13, 215, textureX, textureY); // Box 473
		bodyModel[353] = new ModelRendererTurbo(this, 177, 283, textureX, textureY); // Box 474
		bodyModel[354] = new ModelRendererTurbo(this, 347, 412, textureX, textureY); // Box 475
		bodyModel[355] = new ModelRendererTurbo(this, 361, 221, textureX, textureY); // Box 476
		bodyModel[356] = new ModelRendererTurbo(this, 346, 258, textureX, textureY); // Box 477
		bodyModel[357] = new ModelRendererTurbo(this, 351, 233, textureX, textureY); // Box 478
		bodyModel[358] = new ModelRendererTurbo(this, 360, 248, textureX, textureY); // Box 479
		bodyModel[359] = new ModelRendererTurbo(this, 577, 265, textureX, textureY); // Box 480
		bodyModel[360] = new ModelRendererTurbo(this, 377, 330, textureX, textureY); // Box 481
		bodyModel[361] = new ModelRendererTurbo(this, 162, 340, textureX, textureY); // Box 555
		bodyModel[362] = new ModelRendererTurbo(this, 217, 183, textureX, textureY); // Box 556
		bodyModel[363] = new ModelRendererTurbo(this, 136, 20, textureX, textureY); // Box 557
		bodyModel[364] = new ModelRendererTurbo(this, 330, 239, textureX, textureY); // Box 558
		bodyModel[365] = new ModelRendererTurbo(this, 121, 36, textureX, textureY); // Box 559
		bodyModel[366] = new ModelRendererTurbo(this, 507, 274, textureX, textureY); // Box 560
		bodyModel[367] = new ModelRendererTurbo(this, 203, 275, textureX, textureY); // Box 563
		bodyModel[368] = new ModelRendererTurbo(this, 168, 306, textureX, textureY); // Box 564
		bodyModel[369] = new ModelRendererTurbo(this, 223, 275, textureX, textureY); // Box 565
		bodyModel[370] = new ModelRendererTurbo(this, 315, 221, textureX, textureY); // Box 566
		bodyModel[371] = new ModelRendererTurbo(this, 159, 204, textureX, textureY); // Box 567
		bodyModel[372] = new ModelRendererTurbo(this, 137, 203, textureX, textureY); // Box 568
		bodyModel[373] = new ModelRendererTurbo(this, 256, 321, textureX, textureY); // Box 569
		bodyModel[374] = new ModelRendererTurbo(this, 179, 220, textureX, textureY); // Box 570
		bodyModel[375] = new ModelRendererTurbo(this, 208, 212, textureX, textureY); // Box 571
		bodyModel[376] = new ModelRendererTurbo(this, 308, 304, textureX, textureY); // Box 572
		bodyModel[377] = new ModelRendererTurbo(this, 290, 225, textureX, textureY); // Box 573
		bodyModel[378] = new ModelRendererTurbo(this, 147, 351, textureX, textureY); // Box 574
		bodyModel[379] = new ModelRendererTurbo(this, 104, 304, textureX, textureY); // Box 575
		bodyModel[380] = new ModelRendererTurbo(this, 234, 407, textureX, textureY); // Box 576
		bodyModel[381] = new ModelRendererTurbo(this, 202, 186, textureX, textureY); // Box 577
		bodyModel[382] = new ModelRendererTurbo(this, 53, 54, textureX, textureY); // Box 578
		bodyModel[383] = new ModelRendererTurbo(this, 143, 34, textureX, textureY); // Box 579
		bodyModel[384] = new ModelRendererTurbo(this, 67, 11, textureX, textureY); // Box 580
		bodyModel[385] = new ModelRendererTurbo(this, 22, 9, textureX, textureY); // Box 581
		bodyModel[386] = new ModelRendererTurbo(this, 308, 248, textureX, textureY); // Box 582
		bodyModel[387] = new ModelRendererTurbo(this, 183, 184, textureX, textureY); // Box 583
		bodyModel[388] = new ModelRendererTurbo(this, 110, 36, textureX, textureY); // Box 584
		bodyModel[389] = new ModelRendererTurbo(this, 79, 19, textureX, textureY); // Box 585
		bodyModel[390] = new ModelRendererTurbo(this, 3, 4, textureX, textureY); // Box 586
		bodyModel[391] = new ModelRendererTurbo(this, 113, 342, textureX, textureY); // Box 587
		bodyModel[392] = new ModelRendererTurbo(this, 93, 294, textureX, textureY); // Box 588
		bodyModel[393] = new ModelRendererTurbo(this, 199, 299, textureX, textureY); // Box 589
		bodyModel[394] = new ModelRendererTurbo(this, 187, 35, textureX, textureY); // Box 590
		bodyModel[395] = new ModelRendererTurbo(this, 80, 36, textureX, textureY); // Box 591
		bodyModel[396] = new ModelRendererTurbo(this, 98, 35, textureX, textureY); // Box 592
		bodyModel[397] = new ModelRendererTurbo(this, 36, 213, textureX, textureY); // Box 593
		bodyModel[398] = new ModelRendererTurbo(this, 107, 18, textureX, textureY); // Box 594
		bodyModel[399] = new ModelRendererTurbo(this, 228, 34, textureX, textureY); // Box 595
		bodyModel[400] = new ModelRendererTurbo(this, 63, 53, textureX, textureY); // Box 596
		bodyModel[401] = new ModelRendererTurbo(this, 97, 18, textureX, textureY); // Box 597
		bodyModel[402] = new ModelRendererTurbo(this, 96, 52, textureX, textureY); // Box 598
		bodyModel[403] = new ModelRendererTurbo(this, 10, 33, textureX, textureY); // Box 599
		bodyModel[404] = new ModelRendererTurbo(this, 6, 37, textureX, textureY); // Box 600
		bodyModel[405] = new ModelRendererTurbo(this, 35, 5, textureX, textureY); // Box 601
		bodyModel[406] = new ModelRendererTurbo(this, 42, 30, textureX, textureY); // Box 602
		bodyModel[407] = new ModelRendererTurbo(this, 56, 17, textureX, textureY); // Box 603
		bodyModel[408] = new ModelRendererTurbo(this, 38, 21, textureX, textureY); // Box 604
		bodyModel[409] = new ModelRendererTurbo(this, 58, 2, textureX, textureY); // Box 605
		bodyModel[410] = new ModelRendererTurbo(this, 22, 18, textureX, textureY); // Box 606
		bodyModel[411] = new ModelRendererTurbo(this, 68, 34, textureX, textureY); // Box 607
		bodyModel[412] = new ModelRendererTurbo(this, 9, 22, textureX, textureY); // Box 608
		bodyModel[413] = new ModelRendererTurbo(this, 15, 12, textureX, textureY); // Box 609
		bodyModel[414] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 610
		bodyModel[415] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 611
		bodyModel[416] = new ModelRendererTurbo(this, 20, 14, textureX, textureY); // Box 612
		bodyModel[417] = new ModelRendererTurbo(this, -1, 190, textureX, textureY); // Box 614
		bodyModel[418] = new ModelRendererTurbo(this, 39, 9, textureX, textureY); // Box 615
		bodyModel[419] = new ModelRendererTurbo(this, 149, 214, textureX, textureY); // Box 616
		bodyModel[420] = new ModelRendererTurbo(this, 55, 344, textureX, textureY); // Box 617
		bodyModel[421] = new ModelRendererTurbo(this, 74, 24, textureX, textureY); // Box 618
		bodyModel[422] = new ModelRendererTurbo(this, 102, 202, textureX, textureY); // Box 619
		bodyModel[423] = new ModelRendererTurbo(this, 2, 30, textureX, textureY); // Box 620
		bodyModel[424] = new ModelRendererTurbo(this, 451, 561, textureX, textureY); // Box 610
		bodyModel[425] = new ModelRendererTurbo(this, 109, 230, textureX, textureY); // Box 611

		bodyModel[0].addShapeBox(0F, 0F, 0F, 109, 16, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-79F, -14F, -10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 49, 9, 11, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-25F, -23F, -22F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 8, 46, 0F,-7F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -7F, 0F, 0F, 7F, -2F, 0F, -14F, 1F, 0F, -14F, 1F, 0F, 7F, -2F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-83F, -23F, -23F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(16F, -13F, -24F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 85, 12, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-69F, -13F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 16, 21, 0F,0F, 0F, 0F, 2F, -11F, 0F, 2F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(30F, -14F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 85, 12, 1, 0F,0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-69F, -13F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 14
		bodyModel[7].setRotationPoint(-71F, -13F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 15
		bodyModel[8].setRotationPoint(-71F, -13F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 11, 1, 15, 0F,0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[9].setRotationPoint(-101F, -18F, -24F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[10].setRotationPoint(-101F, -17F, -24F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(-101F, -17F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[12].setRotationPoint(-101F, -17F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 3, 20, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 25
		bodyModel[13].setRotationPoint(-103F, -17F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 16, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[14].setRotationPoint(-91F, -14F, -10.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 27
		bodyModel[15].setRotationPoint(-103F, -13F, -10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 3, 21, 0F,4F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 4F, 2F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 28
		bodyModel[16].setRotationPoint(-101F, -1F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 15, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 29
		bodyModel[17].setRotationPoint(-106F, -10F, -10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 2, 21, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[18].setRotationPoint(-105F, -5F, -10.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 16, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[19].setRotationPoint(-107F, -8F, -10.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 3, 27, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[20].setRotationPoint(22.5F, -23F, -15F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[21].setRotationPoint(23.5F, -20F, -15F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[22].setRotationPoint(23.5F, -20F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[23].setRotationPoint(23.5F, -20F, -3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[24].setRotationPoint(23.5F, -20F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 137, 1, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[25].setRotationPoint(-96F, -14F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 137, 1, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[26].setRotationPoint(-96F, -14F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 118, 13, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 38
		bodyModel[27].setRotationPoint(-89F, -9F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 13, 3, 0F,0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F); // Box 39
		bodyModel[28].setRotationPoint(29F, -9F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F); // Box 40
		bodyModel[29].setRotationPoint(37F, -11F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F); // Box 41
		bodyModel[30].setRotationPoint(39F, -12F, -12F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F,0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F); // Box 42
		bodyModel[31].setRotationPoint(41F, -12F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F); // Box 43
		bodyModel[32].setRotationPoint(43F, -11F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 13, 3, 0F,0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F); // Box 44
		bodyModel[33].setRotationPoint(-97F, -9F, -12F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F); // Box 45
		bodyModel[34].setRotationPoint(-99F, -11F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F); // Box 46
		bodyModel[35].setRotationPoint(-101F, -12F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F,0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F); // Box 47
		bodyModel[36].setRotationPoint(-103F, -12F, -12F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F); // Box 48
		bodyModel[37].setRotationPoint(-104F, -11F, -12F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 118, 13, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 49
		bodyModel[38].setRotationPoint(-89F, -9F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 13, 3, 0F,0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F); // Box 50
		bodyModel[39].setRotationPoint(29F, -9F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F); // Box 51
		bodyModel[40].setRotationPoint(37F, -11F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F); // Box 52
		bodyModel[41].setRotationPoint(39F, -12F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F,0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F); // Box 53
		bodyModel[42].setRotationPoint(41F, -12F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F); // Box 54
		bodyModel[43].setRotationPoint(43F, -11F, 9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 13, 3, 0F,0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F); // Box 55
		bodyModel[44].setRotationPoint(-97F, -9F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F); // Box 56
		bodyModel[45].setRotationPoint(-99F, -11F, 9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 13, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F); // Box 57
		bodyModel[46].setRotationPoint(-101F, -12F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 12, 3, 0F,0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F); // Box 58
		bodyModel[47].setRotationPoint(-103F, -12F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F); // Box 59
		bodyModel[48].setRotationPoint(-104F, -11F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[49].setRotationPoint(29F, -16F, -24F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[50].setRotationPoint(29F, -15F, -24F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[51].setRotationPoint(29F, -15F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[52].setRotationPoint(29F, -15F, 10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 9, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[53].setRotationPoint(16F, -23F, -24F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[54].setRotationPoint(16F, -14F, -24F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 27, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[55].setRotationPoint(-11F, -9F, -24F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 27, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[56].setRotationPoint(-11F, -23F, -24F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[57].setRotationPoint(-11F, -14F, -22F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[58].setRotationPoint(16F, -13F, 23F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 160
		bodyModel[59].setRotationPoint(-71F, -14F, 22F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[60].setRotationPoint(16F, -14F, 23F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 40, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[61].setRotationPoint(-51F, -23F, 22F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 27, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[62].setRotationPoint(-11F, -9F, 22F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 27, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[63].setRotationPoint(-11F, -14F, 21F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 9, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[64].setRotationPoint(16F, -23F, 22F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 27, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[65].setRotationPoint(-11F, -23F, 22F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[66].setRotationPoint(-4.05F, -19F, 22F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[67].setRotationPoint(3.05F, -19F, 22F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 173
		bodyModel[68].setRotationPoint(3.1F, -15F, 22.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 174
		bodyModel[69].setRotationPoint(1.8F, -15F, 22.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 175
		bodyModel[70].setRotationPoint(8.4F, -17.5F, 22.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 176
		bodyModel[71].setRotationPoint(8.4F, -11.5F, 22.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 177
		bodyModel[72].setRotationPoint(-4.4F, -11.5F, 22.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 178
		bodyModel[73].setRotationPoint(-4.4F, -17.5F, 22.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[74].setRotationPoint(-4.05F, -19F, -23F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[75].setRotationPoint(3.05F, -19F, -23F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 181
		bodyModel[76].setRotationPoint(3.1F, -15F, -23.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 182
		bodyModel[77].setRotationPoint(1.8F, -15F, -23.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 183
		bodyModel[78].setRotationPoint(8.4F, -17.5F, -23.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 184
		bodyModel[79].setRotationPoint(8.4F, -11.5F, -23.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 185
		bodyModel[80].setRotationPoint(-4.4F, -11.5F, -23.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 186
		bodyModel[81].setRotationPoint(-4.4F, -17.5F, -23.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 28, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[82].setRotationPoint(-53F, -23F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 188
		bodyModel[83].setRotationPoint(-47F, -23.5F, 13F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 51, 9, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[84].setRotationPoint(-76F, -21F, -22F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 200
		bodyModel[85].setRotationPoint(-34F, -23.5F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 201
		bodyModel[86].setRotationPoint(-32F, -23.5F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F); // Box 202
		bodyModel[87].setRotationPoint(-34F, -22.7F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F); // Box 203
		bodyModel[88].setRotationPoint(-32F, -22.7F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 207
		bodyModel[89].setRotationPoint(-32F, -22.7F, -12F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 208
		bodyModel[90].setRotationPoint(-32F, -23.7F, 12.2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 209
		bodyModel[91].setRotationPoint(-32F, -23.85F, 12.2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 210
		bodyModel[92].setRotationPoint(-32F, -22.5F, 12.2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 211
		bodyModel[93].setRotationPoint(-38F, -22.5F, 12.2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 212
		bodyModel[94].setRotationPoint(-38F, -23.7F, 12.2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 213
		bodyModel[95].setRotationPoint(-38F, -23.85F, 12.2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 214
		bodyModel[96].setRotationPoint(-43F, -22.5F, 12.2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 215
		bodyModel[97].setRotationPoint(-43F, -23.7F, 12.2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 216
		bodyModel[98].setRotationPoint(-43F, -23.85F, 12.2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 217
		bodyModel[99].setRotationPoint(-32F, -23.7F, -13.2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 218
		bodyModel[100].setRotationPoint(-32F, -23.85F, -13.2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 219
		bodyModel[101].setRotationPoint(-32F, -22.5F, -13.2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 220
		bodyModel[102].setRotationPoint(-38F, -22.5F, -13.2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 221
		bodyModel[103].setRotationPoint(-38F, -23.7F, -13.2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 222
		bodyModel[104].setRotationPoint(-38F, -23.85F, -13.2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 223
		bodyModel[105].setRotationPoint(-43F, -22.5F, -13.2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 224
		bodyModel[106].setRotationPoint(-43F, -23.7F, -13.2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 225
		bodyModel[107].setRotationPoint(-43F, -23.85F, -13.2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 226
		bodyModel[108].setRotationPoint(-32F, -23.5F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 227
		bodyModel[109].setRotationPoint(-34F, -23.5F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 228
		bodyModel[110].setRotationPoint(-32F, -23.5F, -12F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 229
		bodyModel[111].setRotationPoint(-34F, -23.5F, -12F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 230
		bodyModel[112].setRotationPoint(-34F, -23.5F, -12F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 231
		bodyModel[113].setRotationPoint(-32F, -23.5F, -12F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F); // Box 232
		bodyModel[114].setRotationPoint(-34F, -22.7F, -12F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F, -0.25F, -0.1F, -0.25F); // Box 233
		bodyModel[115].setRotationPoint(-32F, -22.7F, -12F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 234
		bodyModel[116].setRotationPoint(-40.2F, -23.85F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 235
		bodyModel[117].setRotationPoint(-40.2F, -22.5F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 236
		bodyModel[118].setRotationPoint(-40.2F, -23.7F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 237
		bodyModel[119].setRotationPoint(-40.2F, -23.7F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 238
		bodyModel[120].setRotationPoint(-46.2F, -23.7F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 239
		bodyModel[121].setRotationPoint(-46.2F, -23.85F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 240
		bodyModel[122].setRotationPoint(-46.2F, -23.7F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 241
		bodyModel[123].setRotationPoint(-46.2F, -22.5F, 11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 242
		bodyModel[124].setRotationPoint(-40.2F, -23.85F, -12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 243
		bodyModel[125].setRotationPoint(-40.2F, -22.5F, -12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 244
		bodyModel[126].setRotationPoint(-40.2F, -23.7F, -12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 245
		bodyModel[127].setRotationPoint(-40.2F, -23.7F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 246
		bodyModel[128].setRotationPoint(-46.2F, -23.7F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 247
		bodyModel[129].setRotationPoint(-46.2F, -23.85F, -12F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 248
		bodyModel[130].setRotationPoint(-46.2F, -23.7F, -12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 249
		bodyModel[131].setRotationPoint(-46.2F, -22.5F, -12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 250
		bodyModel[132].setRotationPoint(-47F, -22.5F, 13F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 251
		bodyModel[133].setRotationPoint(-47F, -23F, 13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 252
		bodyModel[134].setRotationPoint(-47F, -23.5F, -22F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 19, 2, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 253
		bodyModel[135].setRotationPoint(-47F, -22.5F, -22F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 254
		bodyModel[136].setRotationPoint(-47F, -23F, -22F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 255
		bodyModel[137].setRotationPoint(-48.5F, -23.7F, 16F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 256
		bodyModel[138].setRotationPoint(-48.5F, -23.85F, 16F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 257
		bodyModel[139].setRotationPoint(-48.5F, -22.5F, 16F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 258
		bodyModel[140].setRotationPoint(-46.5F, -23.7F, 16F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 263
		bodyModel[141].setRotationPoint(-48.5F, -23.7F, -17F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 264
		bodyModel[142].setRotationPoint(-48.5F, -23.85F, -17F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 265
		bodyModel[143].setRotationPoint(-48.5F, -22.5F, -17F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 266
		bodyModel[144].setRotationPoint(-46.5F, -23.7F, -17F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 268
		bodyModel[145].setRotationPoint(-29.5F, -23.85F, 16F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 269
		bodyModel[146].setRotationPoint(-29.5F, -23.7F, 16F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 270
		bodyModel[147].setRotationPoint(-27.5F, -23.7F, 16F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 271
		bodyModel[148].setRotationPoint(-27.5F, -22.5F, 16F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 272
		bodyModel[149].setRotationPoint(-29.5F, -23.85F, -17F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 273
		bodyModel[150].setRotationPoint(-29.5F, -23.7F, -17F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 274
		bodyModel[151].setRotationPoint(-27.5F, -23.7F, -17F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 275
		bodyModel[152].setRotationPoint(-27.5F, -22.5F, -17F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 23, 1, 13, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 276
		bodyModel[153].setRotationPoint(-73F, -23F, 9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 23, 2, 13, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 277
		bodyModel[154].setRotationPoint(-73F, -22.5F, 9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 23, 1, 13, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 278
		bodyModel[155].setRotationPoint(-73F, -23.5F, 9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 23, 1, 13, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 279
		bodyModel[156].setRotationPoint(-73F, -23F, -22F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 23, 2, 13, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 280
		bodyModel[157].setRotationPoint(-73F, -22.5F, -22F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 23, 1, 13, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 281
		bodyModel[158].setRotationPoint(-73F, -23.5F, -22F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 282
		bodyModel[159].setRotationPoint(-61.2F, -23.85F, 8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 283
		bodyModel[160].setRotationPoint(-61.2F, -21.5F, 8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 284
		bodyModel[161].setRotationPoint(-61.2F, -23.7F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 285
		bodyModel[162].setRotationPoint(-67.2F, -23.85F, 8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 286
		bodyModel[163].setRotationPoint(-67.2F, -21.5F, 8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 287
		bodyModel[164].setRotationPoint(-67.2F, -23.7F, 8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 288
		bodyModel[165].setRotationPoint(-61.2F, -23.85F, -9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 289
		bodyModel[166].setRotationPoint(-61.2F, -21.5F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 290
		bodyModel[167].setRotationPoint(-61.2F, -23.7F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 291
		bodyModel[168].setRotationPoint(-67.2F, -23.85F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 292
		bodyModel[169].setRotationPoint(-67.2F, -21.5F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 293
		bodyModel[170].setRotationPoint(-67.2F, -23.7F, -9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 294
		bodyModel[171].setRotationPoint(-47F, -23.5F, 9.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 295
		bodyModel[172].setRotationPoint(-46.8F, -24.2F, 9.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 296
		bodyModel[173].setRotationPoint(-44.6F, -23.5F, 9.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 297
		bodyModel[174].setRotationPoint(-47F, -23.5F, -10.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 298
		bodyModel[175].setRotationPoint(-46.8F, -24.2F, -10.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 299
		bodyModel[176].setRotationPoint(-44.6F, -23.5F, -10.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 300
		bodyModel[177].setRotationPoint(-37.5F, -23.5F, -10.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 301
		bodyModel[178].setRotationPoint(-37.3F, -24.2F, -10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 302
		bodyModel[179].setRotationPoint(-35.1F, -23.5F, -10.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 306
		bodyModel[180].setRotationPoint(-29.5F, -23.5F, -10.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 307
		bodyModel[181].setRotationPoint(-29.3F, -24.2F, -10.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 308
		bodyModel[182].setRotationPoint(-27.1F, -23.5F, -10.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 309
		bodyModel[183].setRotationPoint(-37.5F, -23.5F, 9.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 310
		bodyModel[184].setRotationPoint(-37.3F, -24.2F, 9.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 311
		bodyModel[185].setRotationPoint(-35.1F, -23.5F, 9.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 312
		bodyModel[186].setRotationPoint(-29.5F, -23.5F, 9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 313
		bodyModel[187].setRotationPoint(-29.3F, -24.2F, 9.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 314
		bodyModel[188].setRotationPoint(-27.1F, -23.5F, 9.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 315
		bodyModel[189].setRotationPoint(-59.5F, -21.5F, 6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 316
		bodyModel[190].setRotationPoint(-59.3F, -22.2F, 6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 317
		bodyModel[191].setRotationPoint(-57.1F, -21.5F, 6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 318
		bodyModel[192].setRotationPoint(-59.5F, -21.5F, -7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 319
		bodyModel[193].setRotationPoint(-59.3F, -22.2F, -7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 320
		bodyModel[194].setRotationPoint(-57.1F, -21.5F, -7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 321
		bodyModel[195].setRotationPoint(-70.5F, -21.5F, -7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 322
		bodyModel[196].setRotationPoint(-70.3F, -22.2F, -7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 323
		bodyModel[197].setRotationPoint(-68.1F, -21.5F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 324
		bodyModel[198].setRotationPoint(-70.5F, -21.5F, 6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 325
		bodyModel[199].setRotationPoint(-70.3F, -22.2F, 6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 326
		bodyModel[200].setRotationPoint(-68.1F, -21.5F, 6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 9, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[201].setRotationPoint(-76F, -23F, -22F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 9, 10, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[202].setRotationPoint(-75F, -23F, -5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 304
		bodyModel[203].setRotationPoint(-74.2F, -23.7F, 11.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 305
		bodyModel[204].setRotationPoint(-74.2F, -21.5F, 11.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 306
		bodyModel[205].setRotationPoint(-74.2F, -23.85F, 11.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 307
		bodyModel[206].setRotationPoint(-74.2F, -23.7F, 18.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 308
		bodyModel[207].setRotationPoint(-74.2F, -21.5F, 18.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 309
		bodyModel[208].setRotationPoint(-74.2F, -23.85F, 18.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 310
		bodyModel[209].setRotationPoint(-74.2F, -23.7F, -12.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 311
		bodyModel[210].setRotationPoint(-74.2F, -21.5F, -12.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 312
		bodyModel[211].setRotationPoint(-74.2F, -23.85F, -12.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 313
		bodyModel[212].setRotationPoint(-74.2F, -23.7F, -19.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 314
		bodyModel[213].setRotationPoint(-74.2F, -21.5F, -19.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 315
		bodyModel[214].setRotationPoint(-74.2F, -23.85F, -19.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 25, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[215].setRotationPoint(-76F, -23F, 22F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 18, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[216].setRotationPoint(-69F, -14F, 22F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 319
		bodyModel[217].setRotationPoint(-71F, -14F, -23F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 40, 22, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[218].setRotationPoint(-51F, -23F, -24F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 25, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[219].setRotationPoint(-76F, -23F, -23F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 18, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[220].setRotationPoint(-69F, -14F, -23F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[221].setRotationPoint(-20.4F, -23.35F, -20.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 324
		bodyModel[222].setRotationPoint(-19.4F, -23.35F, -20.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 325
		bodyModel[223].setRotationPoint(-21.4F, -23.35F, -20.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[224].setRotationPoint(-20.4F, -23.35F, 17.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 327
		bodyModel[225].setRotationPoint(-19.4F, -23.35F, 17.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 328
		bodyModel[226].setRotationPoint(-21.4F, -23.35F, 17.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 329
		bodyModel[227].setRotationPoint(3.1F, -14.4F, 22.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 330
		bodyModel[228].setRotationPoint(1.8F, -14.4F, 22.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.8F, -0.2F, 0F); // Box 331
		bodyModel[229].setRotationPoint(3.1F, -14.4F, -23.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0.1F, -0.2F, 0F); // Box 332
		bodyModel[230].setRotationPoint(1.8F, -14.4F, -23.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 335
		bodyModel[231].setRotationPoint(23.5F, -19.5F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[232].setRotationPoint(23.5F, -19.5F, -9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 337
		bodyModel[233].setRotationPoint(23.5F, -20F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[234].setRotationPoint(23.5F, -20F, -4F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[235].setRotationPoint(23.5F, -18F, -6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyModel[236].setRotationPoint(23.5F, -18F, -4F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 49, 9, 25, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[237].setRotationPoint(-25F, -23F, -3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 9, 8, 0F,-4F, -6F, 0F, 3.65F, -6F, 0F, 3.65F, -6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -4F, 0F, 0F); // Box 342
		bodyModel[238].setRotationPoint(23F, -23F, -11F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 48, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[239].setRotationPoint(-25F, -23F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 344
		bodyModel[240].setRotationPoint(-99F, -19.5F, 8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 345
		bodyModel[241].setRotationPoint(-99F, -18.85F, 8F);
		bodyModel[241].rotateAngleZ = -0.20943951F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 346
		bodyModel[242].setRotationPoint(-99F, -17.3F, 8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 347
		bodyModel[243].setRotationPoint(-99F, -19.5F, -9F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 348
		bodyModel[244].setRotationPoint(-99F, -18.85F, -10F);
		bodyModel[244].rotateAngleZ = -0.20943951F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 349
		bodyModel[245].setRotationPoint(-99F, -17.3F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 350
		bodyModel[246].setRotationPoint(-99F, -17.3F, 23F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 351
		bodyModel[247].setRotationPoint(-99F, -19.5F, 24F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 352
		bodyModel[248].setRotationPoint(-99F, -18.85F, 23F);
		bodyModel[248].rotateAngleZ = -0.20943951F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 353
		bodyModel[249].setRotationPoint(-99F, -17.3F, -25F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 354
		bodyModel[250].setRotationPoint(-99F, -19.5F, -25F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 355
		bodyModel[251].setRotationPoint(-99F, -18.85F, -25F);
		bodyModel[251].rotateAngleZ = -0.20943951F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[252].setRotationPoint(30F, -14.5F, -9F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 357
		bodyModel[253].setRotationPoint(39F, -13.5F, -9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, -0.6F, 2F, -0.2F); // Box 358
		bodyModel[254].setRotationPoint(32F, -11.5F, -9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[255].setRotationPoint(30F, -14.5F, 8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 360
		bodyModel[256].setRotationPoint(39F, -13.5F, 8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, -0.6F, 2F, -0.2F); // Box 361
		bodyModel[257].setRotationPoint(32F, -11.5F, 8F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 362
		bodyModel[258].setRotationPoint(38F, -16.5F, -9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 363
		bodyModel[259].setRotationPoint(38F, -15.85F, -11F);
		bodyModel[259].rotateAngleZ = 0.20943951F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 364
		bodyModel[260].setRotationPoint(38F, -14.3F, -10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 365
		bodyModel[261].setRotationPoint(38F, -16.5F, 8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 366
		bodyModel[262].setRotationPoint(38F, -15.85F, 8F);
		bodyModel[262].rotateAngleZ = 0.20943951F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F); // Box 367
		bodyModel[263].setRotationPoint(38F, -14.3F, 8F);

		bodyModel[264].addShapeBox(2F, 0F, -1.5F, 50, 1, 77, 0F,0F, 0F, 0F, -47F, -0.2F, 0F, -47F, -0.2F, -70F, 0F, 0F, -70F, 0F, 0F, 0F, -47F, 0F, 0F, -47F, 0F, -70F, 0F, 0F, -70F); // Box 368
		bodyModel[264].setRotationPoint(30F, -14.5F, -2F);
		bodyModel[264].rotateAngleZ = -0.76794487F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 369
		bodyModel[265].setRotationPoint(23.5F, -20F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[266].setRotationPoint(27F, -23F, -14.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[267].setRotationPoint(27F, -23F, 8.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 373
		bodyModel[268].setRotationPoint(24F, -20F, 1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[269].setRotationPoint(29F, -16F, -23F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[270].setRotationPoint(29F, -16F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[271].setRotationPoint(29F, -16F, 23F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[272].setRotationPoint(29F, -16F, 11F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[273].setRotationPoint(29F, -16F, 10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[274].setRotationPoint(29F, -15F, 23F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 94, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[275].setRotationPoint(-73F, -3.5F, -21F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[276].setRotationPoint(21F, -3.5F, -21F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[277].setRotationPoint(33F, -5.5F, -21F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 383
		bodyModel[278].setRotationPoint(-85F, -3.5F, -21F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 6F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 2.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -4F, 0F); // Box 384
		bodyModel[279].setRotationPoint(-92F, -5.5F, -21F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 94, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[280].setRotationPoint(-73F, -3.5F, 20F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[281].setRotationPoint(21F, -3.5F, 20F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 3F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[282].setRotationPoint(33F, -5.5F, 20F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 388
		bodyModel[283].setRotationPoint(-85F, -3.5F, 20F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 6F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 2.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -4F, 0F); // Box 389
		bodyModel[284].setRotationPoint(-92F, -5.5F, 20F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[285].setRotationPoint(15F, 1F, 20.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[286].setRotationPoint(23.5F, 1F, 20.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[287].setRotationPoint(31F, 0F, 20.5F);
		bodyModel[287].rotateAngleZ = 0.38397244F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[288].setRotationPoint(7F, 1F, 20.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[289].setRotationPoint(-1.2F, 0F, 20.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[290].setRotationPoint(-0.6F, 3F, 20.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[291].setRotationPoint(-8.2F, 0F, 20.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[292].setRotationPoint(-7.6F, 3F, 20.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[293].setRotationPoint(-15.2F, 0F, 20.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[294].setRotationPoint(-14.6F, 3F, 20.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[295].setRotationPoint(-22.2F, 0F, 20.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[296].setRotationPoint(-21.6F, 3F, 20.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[297].setRotationPoint(-29.2F, 0F, 20.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[298].setRotationPoint(-28.6F, 3F, 20.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[299].setRotationPoint(-36.2F, 0F, 20.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[300].setRotationPoint(-35.6F, 3F, 20.5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[301].setRotationPoint(-43.2F, 0F, 20.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[302].setRotationPoint(-42.6F, 3F, 20.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[303].setRotationPoint(-50.2F, 0F, 20.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[304].setRotationPoint(-49.6F, 3F, 20.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[305].setRotationPoint(-58.2F, 0.5F, 20.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[306].setRotationPoint(-64.8F, 0.5F, 20.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[307].setRotationPoint(-71F, 0.5F, 20.5F);
		bodyModel[307].rotateAngleZ = -0.10471976F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[308].setRotationPoint(-78F, 0F, 20.5F);
		bodyModel[308].rotateAngleZ = -0.10471976F;

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 415
		bodyModel[309].setRotationPoint(-81F, -5F, 20.5F);
		bodyModel[309].rotateAngleZ = -0.29670597F;

		bodyModel[310].addShapeBox(-12F, 0F, 0F, 1, 8, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 416
		bodyModel[310].setRotationPoint(-81F, -5F, 20.5F);
		bodyModel[310].rotateAngleZ = -0.29670597F;

		bodyModel[311].addShapeBox(-12F, -1F, 0F, 13, 1, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 417
		bodyModel[311].setRotationPoint(-81F, -5F, 20.5F);
		bodyModel[311].rotateAngleZ = -0.29670597F;

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[312].setRotationPoint(15F, 1F, -21.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[313].setRotationPoint(23.5F, 1F, -21.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[314].setRotationPoint(31F, 0F, -21.5F);
		bodyModel[314].rotateAngleZ = 0.38397244F;

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[315].setRotationPoint(7F, 1F, -21.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[316].setRotationPoint(-1.2F, 0F, -21.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[317].setRotationPoint(-0.6F, 3F, -21.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[318].setRotationPoint(-8.2F, 0F, -21.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[319].setRotationPoint(-7.6F, 3F, -21.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[320].setRotationPoint(-15.2F, 0F, -21.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[321].setRotationPoint(-14.6F, 3F, -21.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[322].setRotationPoint(-22.2F, 0F, -21.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[323].setRotationPoint(-21.6F, 3F, -21.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[324].setRotationPoint(-29.2F, 0F, -21.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[325].setRotationPoint(-28.6F, 3F, -21.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[326].setRotationPoint(-36.2F, 0F, -21.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[327].setRotationPoint(-35.6F, 3F, -21.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[328].setRotationPoint(-43.2F, 0F, -21.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[329].setRotationPoint(-42.6F, 3F, -21.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[330].setRotationPoint(-50.2F, 0F, -21.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[331].setRotationPoint(-49.6F, 3F, -21.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[332].setRotationPoint(-58.2F, 0.5F, -21.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[333].setRotationPoint(-64.8F, 0.5F, -21.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[334].setRotationPoint(-71F, 0.5F, -21.5F);
		bodyModel[334].rotateAngleZ = -0.10471976F;

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[335].setRotationPoint(-78F, 0F, -21.5F);
		bodyModel[335].rotateAngleZ = -0.10471976F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 442
		bodyModel[336].setRotationPoint(-81F, -5F, -22.5F);
		bodyModel[336].rotateAngleZ = -0.29670597F;

		bodyModel[337].addShapeBox(-12F, 0F, 0F, 1, 8, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 443
		bodyModel[337].setRotationPoint(-81F, -5F, -22.5F);
		bodyModel[337].rotateAngleZ = -0.29670597F;

		bodyModel[338].addShapeBox(-12F, -1F, 0F, 13, 1, 2, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 444
		bodyModel[338].setRotationPoint(-81F, -5F, -22.5F);
		bodyModel[338].rotateAngleZ = -0.29670597F;

		bodyModel[339].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 471
		bodyModel[339].setRotationPoint(30F, -14.8F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 472
		bodyModel[340].setRotationPoint(30F, -14.8F, 8F);

		bodyModel[341].addShapeBox(2.8F, -0.2F, -2.9F, 1, 1, 2, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 473
		bodyModel[341].setRotationPoint(30F, -14.5F, -2F);
		bodyModel[341].rotateAngleZ = -0.76794487F;

		bodyModel[342].addShapeBox(2.8F, -0.2F, 5.1F, 1, 1, 2, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 474
		bodyModel[342].setRotationPoint(30F, -14.5F, -2F);
		bodyModel[342].rotateAngleZ = -0.76794487F;

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		bodyModel[343].setRotationPoint(16F, -14F, -23F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[344].setRotationPoint(16F, -14F, 21F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 466
		bodyModel[345].setRotationPoint(8.2F, -11.5F, -23.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 467
		bodyModel[346].setRotationPoint(9.7F, -11.5F, -23.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 468
		bodyModel[347].setRotationPoint(9.7F, -17.5F, -23.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 469
		bodyModel[348].setRotationPoint(8.2F, -17.5F, -23.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 470
		bodyModel[349].setRotationPoint(-3.2F, -17.5F, -23.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 471
		bodyModel[350].setRotationPoint(-4.7F, -17.5F, -23.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 472
		bodyModel[351].setRotationPoint(-4.7F, -11.5F, -23.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 473
		bodyModel[352].setRotationPoint(-3.2F, -11.5F, -23.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 474
		bodyModel[353].setRotationPoint(8.2F, -11.5F, 22.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 475
		bodyModel[354].setRotationPoint(9.7F, -11.5F, 22.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 476
		bodyModel[355].setRotationPoint(9.7F, -17.5F, 22.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 477
		bodyModel[356].setRotationPoint(8.2F, -17.5F, 22.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 478
		bodyModel[357].setRotationPoint(-3.2F, -17.5F, 22.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 479
		bodyModel[358].setRotationPoint(-4.7F, -17.5F, 22.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 480
		bodyModel[359].setRotationPoint(-4.7F, -11.5F, 22.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F); // Box 481
		bodyModel[360].setRotationPoint(-3.2F, -11.5F, 22.5F);

		bodyModel[361].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 555
		bodyModel[361].setRotationPoint(39F, -2.5F, -2.5F);
		bodyModel[361].rotateAngleZ = -0.78539816F;

		bodyModel[362].addShapeBox(-1F, 1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 556
		bodyModel[362].setRotationPoint(39F, -2.5F, -2.5F);
		bodyModel[362].rotateAngleZ = -0.78539816F;

		bodyModel[363].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 557
		bodyModel[363].setRotationPoint(39F, -2.5F, -2.5F);
		bodyModel[363].rotateAngleZ = -0.78539816F;

		bodyModel[364].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 558
		bodyModel[364].setRotationPoint(39F, -2.5F, 1.5F);
		bodyModel[364].rotateAngleZ = -0.78539816F;

		bodyModel[365].addShapeBox(-1F, 1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 559
		bodyModel[365].setRotationPoint(39F, -2.5F, 1.5F);
		bodyModel[365].rotateAngleZ = -0.78539816F;

		bodyModel[366].addShapeBox(1F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 560
		bodyModel[366].setRotationPoint(39F, -2.5F, 1.5F);
		bodyModel[366].rotateAngleZ = -0.78539816F;

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 563
		bodyModel[367].setRotationPoint(27F, -23F, -14.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 564
		bodyModel[368].setRotationPoint(27F, -23F, -12.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 565
		bodyModel[369].setRotationPoint(27F, -23F, -13.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 566
		bodyModel[370].setRotationPoint(27F, -22F, -14.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 567
		bodyModel[371].setRotationPoint(27F, -18F, -14.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 568
		bodyModel[372].setRotationPoint(27F, -19F, -14.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 569
		bodyModel[373].setRotationPoint(27F, -20F, -14.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 570
		bodyModel[374].setRotationPoint(27F, -21F, -14.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 571
		bodyModel[375].setRotationPoint(27F, -22F, -12.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 572
		bodyModel[376].setRotationPoint(27F, -21F, -12.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 573
		bodyModel[377].setRotationPoint(27F, -20F, -12.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 574
		bodyModel[378].setRotationPoint(27F, -19F, -12.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 575
		bodyModel[379].setRotationPoint(27F, -18F, -12.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 576
		bodyModel[380].setRotationPoint(27F, -23F, 10.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 577
		bodyModel[381].setRotationPoint(27F, -23F, 8.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 578
		bodyModel[382].setRotationPoint(27F, -23F, 9.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 579
		bodyModel[383].setRotationPoint(27F, -22F, 10.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 580
		bodyModel[384].setRotationPoint(27F, -18F, 10.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 581
		bodyModel[385].setRotationPoint(27F, -19F, 10.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 582
		bodyModel[386].setRotationPoint(27F, -20F, 10.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 583
		bodyModel[387].setRotationPoint(27F, -21F, 10.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 584
		bodyModel[388].setRotationPoint(27F, -22F, 8.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 585
		bodyModel[389].setRotationPoint(27F, -21F, 8.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 586
		bodyModel[390].setRotationPoint(27F, -20F, 8.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 587
		bodyModel[391].setRotationPoint(27F, -19F, 8.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F); // Box 588
		bodyModel[392].setRotationPoint(27F, -18F, 8.5F);

		bodyModel[393].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 589
		bodyModel[393].setRotationPoint(-88F, -17.5F, -12F);
		bodyModel[393].rotateAngleZ = 2.02458193F;

		bodyModel[394].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 590
		bodyModel[394].setRotationPoint(-88F, -17.5F, -12F);
		bodyModel[394].rotateAngleZ = 2.02458193F;

		bodyModel[395].addShapeBox(1F, -1F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 591
		bodyModel[395].setRotationPoint(-88F, -17.5F, -12F);
		bodyModel[395].rotateAngleZ = 2.02458193F;

		bodyModel[396].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 592
		bodyModel[396].setRotationPoint(-88F, -17.5F, -13F);
		bodyModel[396].rotateAngleZ = 2.02458193F;

		bodyModel[397].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 593
		bodyModel[397].setRotationPoint(-88F, -17.5F, -13F);
		bodyModel[397].rotateAngleZ = 2.02458193F;

		bodyModel[398].addShapeBox(1F, -1F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 594
		bodyModel[398].setRotationPoint(-88F, -17.5F, -13F);
		bodyModel[398].rotateAngleZ = 2.02458193F;

		bodyModel[399].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 595
		bodyModel[399].setRotationPoint(-88F, -17.5F, -21F);
		bodyModel[399].rotateAngleZ = 2.02458193F;

		bodyModel[400].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 596
		bodyModel[400].setRotationPoint(-88F, -17.5F, -21F);
		bodyModel[400].rotateAngleZ = 2.02458193F;

		bodyModel[401].addShapeBox(1F, -1F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 597
		bodyModel[401].setRotationPoint(-88F, -17.5F, -21F);
		bodyModel[401].rotateAngleZ = 2.02458193F;

		bodyModel[402].addShapeBox(1F, -1F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 598
		bodyModel[402].setRotationPoint(-88F, -17.5F, -20F);
		bodyModel[402].rotateAngleZ = 2.02458193F;

		bodyModel[403].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 599
		bodyModel[403].setRotationPoint(-88F, -17.5F, -20F);
		bodyModel[403].rotateAngleZ = 2.02458193F;

		bodyModel[404].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 600
		bodyModel[404].setRotationPoint(-88F, -17.5F, -20F);
		bodyModel[404].rotateAngleZ = 2.02458193F;

		bodyModel[405].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 601
		bodyModel[405].setRotationPoint(-88F, -17.5F, 11F);
		bodyModel[405].rotateAngleZ = 2.02458193F;

		bodyModel[406].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 602
		bodyModel[406].setRotationPoint(-88F, -17.5F, 11F);
		bodyModel[406].rotateAngleZ = 2.02458193F;

		bodyModel[407].addShapeBox(1F, -1F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 603
		bodyModel[407].setRotationPoint(-88F, -17.5F, 11F);
		bodyModel[407].rotateAngleZ = 2.02458193F;

		bodyModel[408].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 604
		bodyModel[408].setRotationPoint(-88F, -17.5F, 12F);
		bodyModel[408].rotateAngleZ = 2.02458193F;

		bodyModel[409].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 605
		bodyModel[409].setRotationPoint(-88F, -17.5F, 12F);
		bodyModel[409].rotateAngleZ = 2.02458193F;

		bodyModel[410].addShapeBox(1F, -1F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 606
		bodyModel[410].setRotationPoint(-88F, -17.5F, 12F);
		bodyModel[410].rotateAngleZ = 2.02458193F;

		bodyModel[411].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 607
		bodyModel[411].setRotationPoint(-88F, -17.5F, 20F);
		bodyModel[411].rotateAngleZ = 2.02458193F;

		bodyModel[412].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 608
		bodyModel[412].setRotationPoint(-88F, -17.5F, 20F);
		bodyModel[412].rotateAngleZ = 2.02458193F;

		bodyModel[413].addShapeBox(1F, -1F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 609
		bodyModel[413].setRotationPoint(-88F, -17.5F, 20F);
		bodyModel[413].rotateAngleZ = 2.02458193F;

		bodyModel[414].addShapeBox(1F, -1F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, -0.6F, -0.2F, -0.6F, -0.6F, -0.2F, 0F, -0.2F, -0.2F); // Box 610
		bodyModel[414].setRotationPoint(-88F, -17.5F, 19F);
		bodyModel[414].rotateAngleZ = 2.02458193F;

		bodyModel[415].addShapeBox(-1F, -1F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 611
		bodyModel[415].setRotationPoint(-88F, -17.5F, 19F);
		bodyModel[415].rotateAngleZ = 2.02458193F;

		bodyModel[416].addShapeBox(-1F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 612
		bodyModel[416].setRotationPoint(-88F, -17.5F, 19F);
		bodyModel[416].rotateAngleZ = 2.02458193F;

		bodyModel[417].addShapeBox(0F, 0F, 0F, 11, 1, 15, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 614
		bodyModel[417].setRotationPoint(-101F, -18F, 9F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 615
		bodyModel[418].setRotationPoint(-101F, -17F, 23F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[419].setRotationPoint(22.5F, -20F, -11F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 617
		bodyModel[420].setRotationPoint(23.5F, -19.5F, -5.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 618
		bodyModel[421].setRotationPoint(23.5F, -20.5F, -5.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 619
		bodyModel[422].setRotationPoint(31.5F, -19.5F, -5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F); // Box 620
		bodyModel[423].setRotationPoint(32.5F, -19.5F, -5F);

		bodyModel[424].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 610
		bodyModel[424].setRotationPoint(0F, -2F, 0F);

		bodyModel[425].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 611
		bodyModel[425].setRotationPoint(0F, -2F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 60
		turretModel[1] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 61
		turretModel[2] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 62
		turretModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 63
		turretModel[4] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 64
		turretModel[5] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 65
		turretModel[6] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 66
		turretModel[7] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 68
		turretModel[8] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 70
		turretModel[9] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 71
		turretModel[10] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 73
		turretModel[11] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 75
		turretModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 76
		turretModel[13] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 80
		turretModel[14] = new ModelRendererTurbo(this, 873, 9, textureX, textureY); // Box 81
		turretModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 82
		turretModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 445
		turretModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 446
		turretModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 447
		turretModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 448
		turretModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 449
		turretModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 450
		turretModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 451
		turretModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 452
		turretModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 453
		turretModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 454
		turretModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 455
		turretModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 456
		turretModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 457
		turretModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 458
		turretModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 459
		turretModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 460
		turretModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 461
		turretModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 462
		turretModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 463
		turretModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 464
		turretModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 465
		turretModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 466
		turretModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 467
		turretModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 468
		turretModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 469
		turretModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 470
		turretModel[42] = new ModelRendererTurbo(this, 152, 264, textureX, textureY); // Box 484
		turretModel[43] = new ModelRendererTurbo(this, 148, 23, textureX, textureY); // Box 485
		turretModel[44] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 486
		turretModel[45] = new ModelRendererTurbo(this, 105, 6, textureX, textureY); // Box 487
		turretModel[46] = new ModelRendererTurbo(this, 109, 24, textureX, textureY); // Box 488
		turretModel[47] = new ModelRendererTurbo(this, -1, 8, textureX, textureY); // Box 490
		turretModel[48] = new ModelRendererTurbo(this, -1, 8, textureX, textureY); // Box 491
		turretModel[49] = new ModelRendererTurbo(this, 250, 266, textureX, textureY); // Box 493
		turretModel[50] = new ModelRendererTurbo(this, 260, 292, textureX, textureY); // Box 495
		turretModel[51] = new ModelRendererTurbo(this, 38, 16, textureX, textureY); // Box 496
		turretModel[52] = new ModelRendererTurbo(this, 111, 208, textureX, textureY); // Box 497
		turretModel[53] = new ModelRendererTurbo(this, 38, 20, textureX, textureY); // Box 499
		turretModel[54] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 500
		turretModel[55] = new ModelRendererTurbo(this, 239, 280, textureX, textureY); // Box 501
		turretModel[56] = new ModelRendererTurbo(this, 87, 52, textureX, textureY); // Box 502
		turretModel[57] = new ModelRendererTurbo(this, 190, 217, textureX, textureY); // Box 503
		turretModel[58] = new ModelRendererTurbo(this, 43, 6, textureX, textureY); // Box 504
		turretModel[59] = new ModelRendererTurbo(this, 163, 31, textureX, textureY); // Box 505
		turretModel[60] = new ModelRendererTurbo(this, 341, 295, textureX, textureY); // Box 506
		turretModel[61] = new ModelRendererTurbo(this, 205, 15, textureX, textureY); // Box 507
		turretModel[62] = new ModelRendererTurbo(this, 64, 210, textureX, textureY); // Box 508
		turretModel[63] = new ModelRendererTurbo(this, 163, 186, textureX, textureY); // Box 509
		turretModel[64] = new ModelRendererTurbo(this, 56, 203, textureX, textureY); // Box 510
		turretModel[65] = new ModelRendererTurbo(this, 603, 315, textureX, textureY); // Box 512
		turretModel[66] = new ModelRendererTurbo(this, 199, 323, textureX, textureY); // Box 513
		turretModel[67] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 514
		turretModel[68] = new ModelRendererTurbo(this, 21, 24, textureX, textureY); // Box 515
		turretModel[69] = new ModelRendererTurbo(this, 223, 297, textureX, textureY); // Box 516
		turretModel[70] = new ModelRendererTurbo(this, 610, 397, textureX, textureY); // Box 517
		turretModel[71] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 518
		turretModel[72] = new ModelRendererTurbo(this, 160, 180, textureX, textureY); // Box 519
		turretModel[73] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 520
		turretModel[74] = new ModelRendererTurbo(this, 450, 239, textureX, textureY); // Box 521
		turretModel[75] = new ModelRendererTurbo(this, 60, 26, textureX, textureY); // Box 522
		turretModel[76] = new ModelRendererTurbo(this, 322, 268, textureX, textureY); // Box 523
		turretModel[77] = new ModelRendererTurbo(this, 8, 2, textureX, textureY); // Box 524
		turretModel[78] = new ModelRendererTurbo(this, 179, 211, textureX, textureY); // Box 525
		turretModel[79] = new ModelRendererTurbo(this, 232, 216, textureX, textureY); // Box 526
		turretModel[80] = new ModelRendererTurbo(this, 144, 208, textureX, textureY); // Box 527
		turretModel[81] = new ModelRendererTurbo(this, 28, 18, textureX, textureY); // Box 528
		turretModel[82] = new ModelRendererTurbo(this, 175, 348, textureX, textureY); // Box 529
		turretModel[83] = new ModelRendererTurbo(this, 132, 223, textureX, textureY); // Box 530
		turretModel[84] = new ModelRendererTurbo(this, 80, 206, textureX, textureY); // Box 531
		turretModel[85] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Box 532
		turretModel[86] = new ModelRendererTurbo(this, 141, 320, textureX, textureY); // Box 533
		turretModel[87] = new ModelRendererTurbo(this, 53, 220, textureX, textureY); // Box 534
		turretModel[88] = new ModelRendererTurbo(this, 58, 35, textureX, textureY); // Box 535
		turretModel[89] = new ModelRendererTurbo(this, 26, 232, textureX, textureY); // Box 536
		turretModel[90] = new ModelRendererTurbo(this, 59, 242, textureX, textureY); // Box 538
		turretModel[91] = new ModelRendererTurbo(this, 66, 3, textureX, textureY); // Box 553
		turretModel[92] = new ModelRendererTurbo(this, 71, 13, textureX, textureY); // Box 554
		turretModel[93] = new ModelRendererTurbo(this, 65, 20, textureX, textureY); // Box 561
		turretModel[94] = new ModelRendererTurbo(this, 29, 1, textureX, textureY); // Box 562

		turretModel[0].addShapeBox(-2F, -12F, -16F, 12, 13, 32, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		turretModel[0].setRotationPoint(0F, -24F, 0F);

		turretModel[1].addShapeBox(10.5F, -12F, -16F, 6, 13, 32, 0F,0F, 0.5F, 0F, 0F, -1F, -7F, 0F, -1F, -7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 61
		turretModel[1].setRotationPoint(0F, -24F, 0F);

		turretModel[2].addShapeBox(16.5F, -1F, -9F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 62
		turretModel[2].setRotationPoint(0F, -24F, 0F);

		turretModel[3].addShapeBox(-19F, -13F, -16F, 17, 13, 32, 0F,0F, 0.5F, -8F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 63
		turretModel[3].setRotationPoint(0F, -23F, 0F);

		turretModel[4].addShapeBox(16.5F, -11F, -9F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 64
		turretModel[4].setRotationPoint(0F, -24F, 0F);

		turretModel[5].addShapeBox(16.5F, -10F, -9F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 65
		turretModel[5].setRotationPoint(0F, -24F, 0F);

		turretModel[6].addShapeBox(16.5F, -5F, -9F, 2, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 66
		turretModel[6].setRotationPoint(0F, -24F, 0F);

		turretModel[7].addShapeBox(16.5F, -7F, -5F, 2, 6, 14, 0F,0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, -0.5F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 68
		turretModel[7].setRotationPoint(0F, -24F, 0F);

		turretModel[8].addShapeBox(16.5F, -9F, -9F, 2, 4, 14, 0F,0F, 0F, 0F, -1.1F, 0F, -3F, -1.1F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, -1.1F, 0F, -3F, -1.1F, 0F, -11F, 0F, 0F, -11F); // Box 70
		turretModel[8].setRotationPoint(0F, -24F, 0F);

		turretModel[9].addShapeBox(16.5F, -10F, -5F, 2, 3, 14, 0F,0F, 0F, -11F, -1.1F, 0F, -11F, -1.1F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, -11F, -1.1F, 0.5F, -11F, -1.1F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 71
		turretModel[9].setRotationPoint(0F, -24F, 0F);

		turretModel[10].addShapeBox(17.5F, -10F, -9F, 2, 3, 14, 0F,1F, 0F, -11F, -1F, 0F, -11F, -1F, 0F, -3F, -0.2F, 0F, 0F, 1F, 0.5F, -11F, -1F, 0.5F, -11F, -1F, 0.5F, -3F, -0.2F, 0.5F, 0F); // Box 73
		turretModel[10].setRotationPoint(0F, -24F, 0F);

		turretModel[11].addShapeBox(17.5F, -9F, -5F, 2, 4, 14, 0F,-0.45F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, -11F, 1F, 0F, -11F, -0.45F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, -11F, 1F, 0F, -11F); // Box 75
		turretModel[11].setRotationPoint(0F, -24F, 0F);

		turretModel[12].addShapeBox(16.5F, -10F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 76
		turretModel[12].setRotationPoint(0F, -24F, 0F);

		turretModel[13].addShapeBox(16.5F, -10F, 0F, 2, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		turretModel[13].setRotationPoint(0F, -24F, 0F);

		turretModel[14].addShapeBox(16.5F, -3F, 0F, 2, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		turretModel[14].setRotationPoint(0F, -24F, 0F);

		turretModel[15].addShapeBox(16.5F, -3F, -2F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		turretModel[15].setRotationPoint(0F, -24F, 0F);

		turretModel[16].addShapeBox(1F, -10.5F, 15.5F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		turretModel[16].setRotationPoint(0F, -24F, 0F);

		turretModel[17].addShapeBox(1F, -1.5F, 15.5F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		turretModel[17].setRotationPoint(0F, -24F, 0F);

		turretModel[18].addShapeBox(7.5F, -1.5F, 15.5F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		turretModel[18].setRotationPoint(0F, -24F, 0F);

		turretModel[19].addShapeBox(7.5F, -10.5F, 15.5F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		turretModel[19].setRotationPoint(0F, -24F, 0F);

		turretModel[20].addShapeBox(2.5F, -10.5F, 14.8F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		turretModel[20].setRotationPoint(0F, -24F, 0F);
		turretModel[20].rotateAngleY = 0.43633231F;

		turretModel[21].addShapeBox(2.5F, -1.5F, 14.8F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		turretModel[21].setRotationPoint(0F, -24F, 0F);
		turretModel[21].rotateAngleY = 0.43633231F;

		turretModel[22].addShapeBox(-4.5F, -5.5F, 14.8F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		turretModel[22].setRotationPoint(0F, -24F, 0F);
		turretModel[22].rotateAngleY = 0.43633231F;

		turretModel[23].addShapeBox(-11.5F, -10.5F, 14.8F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		turretModel[23].setRotationPoint(0F, -24F, 0F);
		turretModel[23].rotateAngleY = 0.43633231F;

		turretModel[24].addShapeBox(-11.5F, -1.5F, 14.8F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		turretModel[24].setRotationPoint(0F, -24F, 0F);
		turretModel[24].rotateAngleY = 0.43633231F;

		turretModel[25].addShapeBox(-2F, -10.5F, 18F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		turretModel[25].setRotationPoint(0F, -24F, 0F);
		turretModel[25].rotateAngleY = -0.80285146F;

		turretModel[26].addShapeBox(-2F, -1.5F, 18F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		turretModel[26].setRotationPoint(0F, -24F, 0F);
		turretModel[26].rotateAngleY = -0.80285146F;

		turretModel[27].addShapeBox(-5.5F, -10.5F, 18.5F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		turretModel[27].setRotationPoint(0F, -24F, 0F);
		turretModel[27].rotateAngleY = 1.57079633F;

		turretModel[28].addShapeBox(4.5F, -10.5F, 18.5F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		turretModel[28].setRotationPoint(0F, -24F, 0F);
		turretModel[28].rotateAngleY = 1.57079633F;

		turretModel[29].addShapeBox(4.5F, -1.5F, 18.5F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		turretModel[29].setRotationPoint(0F, -24F, 0F);
		turretModel[29].rotateAngleY = 1.57079633F;

		turretModel[30].addShapeBox(-5.5F, -1.5F, 18.5F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		turretModel[30].setRotationPoint(0F, -24F, 0F);
		turretModel[30].rotateAngleY = 1.57079633F;

		turretModel[31].addShapeBox(-3.5F, -10.5F, 14.9F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		turretModel[31].setRotationPoint(0F, -24F, 0F);
		turretModel[31].rotateAngleY = 2.68780705F;

		turretModel[32].addShapeBox(10F, -10.5F, 14.9F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		turretModel[32].setRotationPoint(0F, -24F, 0F);
		turretModel[32].rotateAngleY = 2.68780705F;

		turretModel[33].addShapeBox(10F, -1.5F, 14.9F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		turretModel[33].setRotationPoint(0F, -24F, 0F);
		turretModel[33].rotateAngleY = 2.68780705F;

		turretModel[34].addShapeBox(-3.5F, -1.5F, 14.9F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		turretModel[34].setRotationPoint(0F, -24F, 0F);
		turretModel[34].rotateAngleY = 2.68780705F;

		turretModel[35].addShapeBox(-2F, -10.5F, 15.6F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		turretModel[35].setRotationPoint(0F, -24F, 0F);
		turretModel[35].rotateAngleY = 3.14159265F;

		turretModel[36].addShapeBox(-8.5F, -10.5F, 15.6F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		turretModel[36].setRotationPoint(0F, -24F, 0F);
		turretModel[36].rotateAngleY = 3.14159265F;

		turretModel[37].addShapeBox(-8.5F, -1.5F, 15.6F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		turretModel[37].setRotationPoint(0F, -24F, 0F);
		turretModel[37].rotateAngleY = 3.14159265F;

		turretModel[38].addShapeBox(-2F, -1.5F, 15.6F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		turretModel[38].setRotationPoint(0F, -24F, 0F);
		turretModel[38].rotateAngleY = 3.14159265F;

		turretModel[39].addShapeBox(3.7F, -6F, 14.9F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 468
		turretModel[39].setRotationPoint(0F, -24F, 0F);
		turretModel[39].rotateAngleY = 2.68780705F;

		turretModel[40].addShapeBox(2F, -10.5F, 17.8F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		turretModel[40].setRotationPoint(0F, -24F, 0F);
		turretModel[40].rotateAngleY = 3.97935069F;

		turretModel[41].addShapeBox(2F, -1.5F, 17.8F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		turretModel[41].setRotationPoint(0F, -24F, 0F);
		turretModel[41].rotateAngleY = 3.97935069F;

		turretModel[42].addShapeBox(-1F, -13F, -10F, 11, 1, 5, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 484
		turretModel[42].setRotationPoint(0F, -24F, 0F);

		turretModel[43].addShapeBox(-1F, -13F, -13F, 11, 1, 3, 0F,-2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 485
		turretModel[43].setRotationPoint(0F, -24F, 0F);

		turretModel[44].addShapeBox(-1F, -13F, -5F, 11, 1, 3, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 486
		turretModel[44].setRotationPoint(0F, -24F, 0F);

		turretModel[45].addShapeBox(-1F, -22.2F, -2.2F, 11, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.5F, 0F, -0.3F, -2.5F, 0F, -0.3F, -2.5F, 0F, -0.3F, -2.5F, 0F, -0.3F); // Box 487
		turretModel[45].setRotationPoint(0F, -24F, 0F);
		turretModel[45].rotateAngleX = 0.66322512F;

		turretModel[46].addShapeBox(-1F, -13.2F, -10.5F, 11, 4, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -2.5F, 0F, -0.3F, -2.5F, 0F, -0.3F, -2.5F, 0F, -0.3F, -2.5F, 0F, -0.3F); // Box 488
		turretModel[46].setRotationPoint(0F, -24F, 0F);
		turretModel[46].rotateAngleX = -0.66322512F;

		turretModel[47].addShapeBox(-0.5F, -14F, -9F, 1, 1, 3, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 490
		turretModel[47].setRotationPoint(0F, -24F, 0F);

		turretModel[48].addShapeBox(9.2F, -14F, -9F, 1, 1, 3, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 491
		turretModel[48].setRotationPoint(0F, -24F, 0F);

		turretModel[49].addShapeBox(5.5F, -12.5F, 1F, 5, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		turretModel[49].setRotationPoint(0F, -24F, 0F);

		turretModel[50].addShapeBox(5.5F, -12.5F, 0F, 5, 1, 1, 0F,-1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		turretModel[50].setRotationPoint(0F, -24F, 0F);

		turretModel[51].addShapeBox(5.5F, -12.5F, 3F, 5, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 496
		turretModel[51].setRotationPoint(0F, -24F, 0F);

		turretModel[52].addShapeBox(-3.05F, -13F, 5.5F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		turretModel[52].setRotationPoint(0F, -24F, 0F);

		turretModel[53].addShapeBox(1.05F, -13F, 5.5F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		turretModel[53].setRotationPoint(0F, -24F, 0F);

		turretModel[54].addShapeBox(7.5F, -13F, 6.5F, 2, 1, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 500
		turretModel[54].setRotationPoint(0F, -24F, 1F);

		turretModel[55].addShapeBox(4.5F, -13F, 9.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 501
		turretModel[55].setRotationPoint(0F, -24F, 0F);

		turretModel[56].addShapeBox(-3.5F, -13F, 6.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 502
		turretModel[56].setRotationPoint(0F, -24F, 0F);

		turretModel[57].addShapeBox(-3.5F, -13F, 9.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 503
		turretModel[57].setRotationPoint(0F, -24F, 0F);

		turretModel[58].addShapeBox(-3.5F, -12.5F, 0.5F, 5, 1, 1, 0F,-1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		turretModel[58].setRotationPoint(0F, -24F, 0F);
		turretModel[58].rotateAngleY = 0.36651914F;

		turretModel[59].addShapeBox(-3.5F, -12.5F, 1.5F, 5, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		turretModel[59].setRotationPoint(0F, -24F, 0F);
		turretModel[59].rotateAngleY = 0.36651914F;

		turretModel[60].addShapeBox(-3.5F, -12.5F, 3.5F, 5, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 506
		turretModel[60].setRotationPoint(0F, -24F, 0F);
		turretModel[60].rotateAngleY = 0.36651914F;

		turretModel[61].addShapeBox(-11.2F, -12.5F, 1F, 5, 1, 1, 0F,-1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		turretModel[61].setRotationPoint(0F, -24F, 0F);
		turretModel[61].rotateAngleY = 0.36651914F;

		turretModel[62].addShapeBox(-11.2F, -12.5F, 2F, 5, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		turretModel[62].setRotationPoint(0F, -24F, 0F);
		turretModel[62].rotateAngleY = 0.36651914F;

		turretModel[63].addShapeBox(-11.2F, -12.5F, 4F, 5, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F); // Box 509
		turretModel[63].setRotationPoint(0F, -24F, 0F);
		turretModel[63].rotateAngleY = 0.36651914F;

		turretModel[64].addShapeBox(4.5F, -13F, 6.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 510
		turretModel[64].setRotationPoint(0F, -24F, 0F);

		turretModel[65].addShapeBox(7.5F, -14F, 6.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 512
		turretModel[65].setRotationPoint(0F, -24F, 1F);

		turretModel[66].addShapeBox(7.5F, -14F, 8.5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 513
		turretModel[66].setRotationPoint(0F, -24F, 1F);

		turretModel[67].addShapeBox(7.5F, -15F, 6.5F, 2, 1, 3, 0F,0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 514
		turretModel[67].setRotationPoint(0F, -24F, 1F);

		turretModel[68].addShapeBox(6.5F, -15F, 6.5F, 1, 3, 3, 0F,0F, -1.8F, -1.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -1.8F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F); // Box 515
		turretModel[68].setRotationPoint(0F, -24F, 1F);

		turretModel[69].addShapeBox(7.5F, -14F, 7.5F, 2, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 516
		turretModel[69].setRotationPoint(0F, -24F, 1F);

		turretModel[70].addShapeBox(7.5F, -14F, 11F, 2, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 517
		turretModel[70].setRotationPoint(0F, -24F, 1F);

		turretModel[71].addShapeBox(7.5F, -13F, 10F, 2, 1, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 518
		turretModel[71].setRotationPoint(0F, -24F, 1F);

		turretModel[72].addShapeBox(7.5F, -14F, 10F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 519
		turretModel[72].setRotationPoint(0F, -24F, 1F);

		turretModel[73].addShapeBox(7.5F, -15F, 10F, 2, 1, 3, 0F,0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 520
		turretModel[73].setRotationPoint(0F, -24F, 1F);

		turretModel[74].addShapeBox(7.5F, -14F, 12F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 521
		turretModel[74].setRotationPoint(0F, -24F, 1F);

		turretModel[75].addShapeBox(6.5F, -15F, 10F, 1, 3, 3, 0F,0F, -1.8F, -1.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -1.8F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F); // Box 522
		turretModel[75].setRotationPoint(0F, -24F, 1F);

		turretModel[76].addShapeBox(8.5F, -14F, 7F, 2, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 523
		turretModel[76].setRotationPoint(0F, -24F, 1F);
		turretModel[76].rotateAngleY = -3.14159265F;

		turretModel[77].addShapeBox(8.5F, -13F, 6F, 2, 1, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 524
		turretModel[77].setRotationPoint(0F, -24F, 1F);
		turretModel[77].rotateAngleY = -3.14159265F;

		turretModel[78].addShapeBox(8.5F, -14F, 6F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 525
		turretModel[78].setRotationPoint(0F, -24F, 1F);
		turretModel[78].rotateAngleY = -3.14159265F;

		turretModel[79].addShapeBox(8.5F, -15F, 6F, 2, 1, 3, 0F,0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 526
		turretModel[79].setRotationPoint(0F, -24F, 1F);
		turretModel[79].rotateAngleY = -3.14159265F;

		turretModel[80].addShapeBox(8.5F, -14F, 8F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 527
		turretModel[80].setRotationPoint(0F, -24F, 1F);
		turretModel[80].rotateAngleY = -3.14159265F;

		turretModel[81].addShapeBox(7.5F, -15F, 6F, 1, 3, 3, 0F,0F, -1.8F, -1.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -1.8F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F); // Box 528
		turretModel[81].setRotationPoint(0F, -24F, 1F);
		turretModel[81].rotateAngleY = -3.14159265F;

		turretModel[82].addShapeBox(8.5F, -14F, -6F, 2, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 529
		turretModel[82].setRotationPoint(0F, -24F, 1F);
		turretModel[82].rotateAngleY = -3.14159265F;

		turretModel[83].addShapeBox(8.5F, -13F, -7F, 2, 1, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 530
		turretModel[83].setRotationPoint(0F, -24F, 1F);
		turretModel[83].rotateAngleY = -3.14159265F;

		turretModel[84].addShapeBox(8.5F, -14F, -7F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 531
		turretModel[84].setRotationPoint(0F, -24F, 1F);
		turretModel[84].rotateAngleY = -3.14159265F;

		turretModel[85].addShapeBox(8.5F, -15F, -7F, 2, 1, 3, 0F,0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 532
		turretModel[85].setRotationPoint(0F, -24F, 1F);
		turretModel[85].rotateAngleY = -3.14159265F;

		turretModel[86].addShapeBox(8.5F, -14F, -5F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 533
		turretModel[86].setRotationPoint(0F, -24F, 1F);
		turretModel[86].rotateAngleY = -3.14159265F;

		turretModel[87].addShapeBox(7.5F, -15F, -7F, 1, 3, 3, 0F,0F, -1.8F, -1.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -1.8F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F); // Box 534
		turretModel[87].setRotationPoint(0F, -24F, 1F);
		turretModel[87].rotateAngleY = -3.14159265F;

		turretModel[88].addShapeBox(-14.2F, -14.5F, 5.5F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 535
		turretModel[88].setRotationPoint(0F, -24F, 0F);

		turretModel[89].addShapeBox(-12.65F, -40.5F, 5.5F, 1, 25, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 536
		turretModel[89].setRotationPoint(0F, -24F, 0F);
		turretModel[89].rotateAngleZ = 0.10471976F;

		turretModel[90].addShapeBox(-17.65F, -17F, 0.5F, 11, 1, 11, 0F,-4.7F, -0.4F, -4.7F, -4.7F, -0.4F, -4.7F, -4.7F, -0.4F, -4.7F, -4.7F, -0.4F, -4.7F, -4.7F, -0.4F, -4.7F, -4.7F, -0.4F, -4.7F, -4.7F, -0.4F, -4.7F, -4.7F, -0.4F, -4.7F); // Box 538
		turretModel[90].setRotationPoint(0F, -24F, 0F);
		turretModel[90].rotateAngleZ = 0.10471976F;

		turretModel[91].addShapeBox(-1F, -22F, -2.2F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F); // Box 553
		turretModel[91].setRotationPoint(0F, -24F, 0F);
		turretModel[91].rotateAngleX = 0.66322512F;

		turretModel[92].addShapeBox(-1F, -13F, -10.5F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F); // Box 554
		turretModel[92].setRotationPoint(0F, -24F, 0F);
		turretModel[92].rotateAngleX = -0.66322512F;

		turretModel[93].addShapeBox(3.5F, -13F, -10.5F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 561
		turretModel[93].setRotationPoint(0F, -24F, 0F);
		turretModel[93].rotateAngleX = -0.66322512F;

		turretModel[94].addShapeBox(3.5F, -22F, -2.2F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 562
		turretModel[94].setRotationPoint(0F, -24F, 0F);
		turretModel[94].rotateAngleX = 0.66322512F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 83
		barrelModel[1] = new ModelRendererTurbo(this, 873, 25, textureX, textureY); // Box 84
		barrelModel[2] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 267
		barrelModel[3] = new ModelRendererTurbo(this, 7, 10, textureX, textureY); // Box 539
		barrelModel[4] = new ModelRendererTurbo(this, 27, 9, textureX, textureY); // Box 540
		barrelModel[5] = new ModelRendererTurbo(this, 31, 30, textureX, textureY); // Box 541
		barrelModel[6] = new ModelRendererTurbo(this, 10, 17, textureX, textureY); // Box 542
		barrelModel[7] = new ModelRendererTurbo(this, 201, 37, textureX, textureY); // Box 543
		barrelModel[8] = new ModelRendererTurbo(this, 8, 27, textureX, textureY); // Box 544
		barrelModel[9] = new ModelRendererTurbo(this, 521, 325, textureX, textureY); // Box 545
		barrelModel[10] = new ModelRendererTurbo(this, 300, 272, textureX, textureY); // Box 546
		barrelModel[11] = new ModelRendererTurbo(this, 358, 329, textureX, textureY); // Box 547
		barrelModel[12] = new ModelRendererTurbo(this, 300, 257, textureX, textureY); // Box 548
		barrelModel[13] = new ModelRendererTurbo(this, 414, 277, textureX, textureY); // Box 549
		barrelModel[14] = new ModelRendererTurbo(this, 392, 260, textureX, textureY); // Box 550
		barrelModel[15] = new ModelRendererTurbo(this, 303, 329, textureX, textureY); // Box 551
		barrelModel[16] = new ModelRendererTurbo(this, 290, 269, textureX, textureY); // Box 552

		barrelModel[0].addShapeBox(-3F, -1F, -1F, 51, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 83
		barrelModel[0].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[1].addShapeBox(-3F, -1F, -1F, 10, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.5F, 0.5F); // Box 84
		barrelModel[1].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[2].addShapeBox(-1F, -2F, -1F, 1, 6, 2, 0F,0F, 0.5F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.5F, 0.5F); // Box 267
		barrelModel[2].setRotationPoint(17.5F, -30.5F, 0F);

		barrelModel[3].addShapeBox(48F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		barrelModel[3].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[4].addShapeBox(49F, -1F, -1F, 2, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 540
		barrelModel[4].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[5].addShapeBox(51F, -1F, -1F, 1, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.15F, 0F, -1F, -0.15F, 0F, -1F, -0.15F, 0F, -0.15F, -0.15F); // Box 541
		barrelModel[5].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[6].addShapeBox(51F, 0F, -1F, 1, 1, 2, 0F,0F, -0.15F, -0.15F, 0F, -1F, -0.15F, 0F, -1F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.15F, -0.5F); // Box 542
		barrelModel[6].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[7].addShapeBox(52F, 1F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 543
		barrelModel[7].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[8].addShapeBox(52F, -2F, -1F, 3, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		barrelModel[8].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[9].addShapeBox(52F, -1F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 545
		barrelModel[9].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[10].addShapeBox(52F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 546
		barrelModel[10].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[11].addShapeBox(54F, -1F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 547
		barrelModel[11].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[12].addShapeBox(54F, 0F, 0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 548
		barrelModel[12].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[13].addShapeBox(54F, -1F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 549
		barrelModel[13].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[14].addShapeBox(54F, 0F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		barrelModel[14].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[15].addShapeBox(52F, -1F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 551
		barrelModel[15].setRotationPoint(17F, -29.5F, 0F);

		barrelModel[16].addShapeBox(52F, 0F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		barrelModel[16].setRotationPoint(17F, -29.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Shape 6
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Shape 0
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Shape 94
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Shape 95
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Shape 96
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Shape 97
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Shape 98
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 593, 65, textureX, textureY); // Shape 99
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Shape 100
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Shape 101
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Shape 102
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 801, 65, textureX, textureY); // Shape 103
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Shape 104
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Shape 105
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Shape 106
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Shape 110
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 482

		leftTrackWheelModels[0].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 10, 15, 15, 44, 10, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 6
		leftTrackWheelModels[0].setRotationPoint(40.2F, -6F, 21F);

		leftTrackWheelModels[1].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 0
		leftTrackWheelModels[1].setRotationPoint(23.5F, 2F, 20.5F);

		leftTrackWheelModels[2].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 94
		leftTrackWheelModels[2].setRotationPoint(32F, 0.5F, 20.5F);

		leftTrackWheelModels[3].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 95
		leftTrackWheelModels[3].setRotationPoint(15F, 2F, 20.5F);

		leftTrackWheelModels[4].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 96
		leftTrackWheelModels[4].setRotationPoint(6.5F, 2F, 20.5F);

		leftTrackWheelModels[5].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 97
		leftTrackWheelModels[5].setRotationPoint(-10.5F, 2F, 20.5F);

		leftTrackWheelModels[6].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 98
		leftTrackWheelModels[6].setRotationPoint(-2F, 2F, 20.5F);

		leftTrackWheelModels[7].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 99
		leftTrackWheelModels[7].setRotationPoint(-44.5F, 2F, 20.5F);

		leftTrackWheelModels[8].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 100
		leftTrackWheelModels[8].setRotationPoint(-36F, 2F, 20.5F);

		leftTrackWheelModels[9].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 101
		leftTrackWheelModels[9].setRotationPoint(-27.5F, 2F, 20.5F);

		leftTrackWheelModels[10].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 102
		leftTrackWheelModels[10].setRotationPoint(-19F, 2F, 20.5F);

		leftTrackWheelModels[11].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 103
		leftTrackWheelModels[11].setRotationPoint(-78.5F, 1F, 20.5F);

		leftTrackWheelModels[12].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 104
		leftTrackWheelModels[12].setRotationPoint(-70F, 2F, 20.5F);

		leftTrackWheelModels[13].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 105
		leftTrackWheelModels[13].setRotationPoint(-61.5F, 2F, 20.5F);

		leftTrackWheelModels[14].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 106
		leftTrackWheelModels[14].setRotationPoint(-53F, 2F, 20.5F);

		leftTrackWheelModels[15].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 11, 15, 15, 44, 11, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 110
		leftTrackWheelModels[15].setRotationPoint(-99F, -7.5F, 21.5F);

		leftTrackWheelModels[16].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 10, 8, 8, 28, 10, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 482
		leftTrackWheelModels[16].setRotationPoint(40.2F, -6F, 22.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Shape 92
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Shape 111
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Shape 112
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Shape 113
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Shape 114
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Shape 115
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Shape 116
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Shape 117
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Shape 118
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Shape 119
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Shape 120
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Shape 121
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Shape 122
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Shape 123
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Shape 124
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Shape 125
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Shape 483

		rightTrackWheelModels[0].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 10, 15, 15, 44, 10, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 92
		rightTrackWheelModels[0].setRotationPoint(40.2F, -6F, -12F);

		rightTrackWheelModels[1].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 111
		rightTrackWheelModels[1].setRotationPoint(32F, 0.5F, -13.5F);

		rightTrackWheelModels[2].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 112
		rightTrackWheelModels[2].setRotationPoint(23.5F, 2F, -13.5F);

		rightTrackWheelModels[3].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 113
		rightTrackWheelModels[3].setRotationPoint(15F, 2F, -13.5F);

		rightTrackWheelModels[4].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 114
		rightTrackWheelModels[4].setRotationPoint(6.5F, 2F, -13.5F);

		rightTrackWheelModels[5].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 115
		rightTrackWheelModels[5].setRotationPoint(-2F, 2F, -13.5F);

		rightTrackWheelModels[6].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 116
		rightTrackWheelModels[6].setRotationPoint(-10.5F, 2F, -13.5F);

		rightTrackWheelModels[7].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 117
		rightTrackWheelModels[7].setRotationPoint(-19F, 2F, -13.5F);

		rightTrackWheelModels[8].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 118
		rightTrackWheelModels[8].setRotationPoint(-27.5F, 2F, -13.5F);

		rightTrackWheelModels[9].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 119
		rightTrackWheelModels[9].setRotationPoint(-36F, 2F, -13.5F);

		rightTrackWheelModels[10].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 120
		rightTrackWheelModels[10].setRotationPoint(-44.5F, 2F, -13.5F);

		rightTrackWheelModels[11].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 121
		rightTrackWheelModels[11].setRotationPoint(-53F, 2F, -13.5F);

		rightTrackWheelModels[12].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 122
		rightTrackWheelModels[12].setRotationPoint(-61.5F, 2F, -13.5F);

		rightTrackWheelModels[13].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 123
		rightTrackWheelModels[13].setRotationPoint(-70F, 2F, -13.5F);

		rightTrackWheelModels[14].addShape3D(4F, -4.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 7, 8, 8, 28, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 124
		rightTrackWheelModels[14].setRotationPoint(-78.5F, 1F, -13.5F);

		rightTrackWheelModels[15].addShape3D(6F, -6F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(9, 0, 9, 0), new Coord2D(12, 3, 12, 3), new Coord2D(12, 9, 12, 9), new Coord2D(9, 12, 9, 12), new Coord2D(3, 12, 3, 12), new Coord2D(0, 9, 0, 9), new Coord2D(0, 3, 0, 3) }), 11, 15, 15, 44, 11, ModelRendererTurbo.MR_FRONT, new float[] {5 ,6 ,5 ,6 ,5 ,6 ,5 ,6}); // Shape 125
		rightTrackWheelModels[15].setRotationPoint(-99F, -8.5F, -11.5F);

		rightTrackWheelModels[16].addShape3D(4F, -4F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 6, 8, 6), new Coord2D(6, 8, 6, 8), new Coord2D(2, 8, 2, 8), new Coord2D(0, 6, 0, 6), new Coord2D(0, 2, 0, 2) }), 10, 8, 8, 28, 10, ModelRendererTurbo.MR_FRONT, new float[] {3 ,4 ,3 ,4 ,3 ,4 ,3 ,4}); // Shape 483
		rightTrackWheelModels[16].setRotationPoint(40.2F, -6F, -12.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 126
		leftTrackModel[1] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 127
		leftTrackModel[2] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 130
		leftTrackModel[3] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 131
		leftTrackModel[4] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 132
		leftTrackModel[5] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 133
		leftTrackModel[6] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 134
		leftTrackModel[7] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 135
		leftTrackModel[8] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 136
		leftTrackModel[9] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 137
		leftTrackModel[10] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 138
		leftTrackModel[11] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 139
		leftTrackModel[12] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 144
		leftTrackModel[13] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 145
		leftTrackModel[14] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 147
		leftTrackModel[15] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 148
		leftTrackModel[16] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 149
		leftTrackModel[17] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 150
		leftTrackModel[18] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 151
		leftTrackModel[19] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 152

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 94, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 126
		leftTrackModel[0].setRotationPoint(-73F, 6F, 10.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F); // Box 127
		leftTrackModel[1].setRotationPoint(21F, 6F, 10.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 130
		leftTrackModel[2].setRotationPoint(46F, -9F, 10.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, -1F, -2F, -5F, -1F, -2F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F); // Box 131
		leftTrackModel[3].setRotationPoint(43F, -14F, 10.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		leftTrackModel[4].setRotationPoint(37F, -14F, 10.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,-2F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -7F, -1F, -2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 7F, 0F); // Box 133
		leftTrackModel[5].setRotationPoint(27F, -14F, 10.5F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 91, 2, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		leftTrackModel[6].setRotationPoint(-70F, -4F, 10.5F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F); // Box 135
		leftTrackModel[7].setRotationPoint(33F, 4F, 10.5F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 136
		leftTrackModel[8].setRotationPoint(21F, -4F, 10.5F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,0F, 4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 137
		leftTrackModel[9].setRotationPoint(-82F, -4F, 10.5F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 16, 2, 12, 0F,0F, 0F, -1F, -2F, -8F, -1F, -2F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 0F, 0F); // Box 138
		leftTrackModel[10].setRotationPoint(-96F, -16F, 10.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		leftTrackModel[11].setRotationPoint(-102F, -16F, 10.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -1F); // Box 144
		leftTrackModel[12].setRotationPoint(-102F, 2F, 10.5F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 19, 2, 12, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F); // Box 145
		leftTrackModel[13].setRotationPoint(-92F, 4F, 10.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -5F, -1F, -2F, -5F, -1F, 0F, 0F, -1F); // Box 147
		leftTrackModel[14].setRotationPoint(43F, 0F, 10.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 148
		leftTrackModel[15].setRotationPoint(46F, -6F, 10.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,-2F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -5F, -1F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F); // Box 149
		leftTrackModel[16].setRotationPoint(-108F, -16F, 10.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 150
		leftTrackModel[17].setRotationPoint(-107F, -11F, 10.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 151
		leftTrackModel[18].setRotationPoint(-107F, -8F, 10.5F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,-3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -2F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -5F, -1F); // Box 152
		leftTrackModel[19].setRotationPoint(-108F, -2F, 10.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 153
		rightTrackModel[1] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 154
		rightTrackModel[2] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 155
		rightTrackModel[3] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 156
		rightTrackModel[4] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 157
		rightTrackModel[5] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 158
		rightTrackModel[6] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 159
		rightTrackModel[7] = new ModelRendererTurbo(this, 849, 113, textureX, textureY); // Box 160
		rightTrackModel[8] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 161
		rightTrackModel[9] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 164
		rightTrackModel[10] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 165
		rightTrackModel[11] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 166
		rightTrackModel[12] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 167
		rightTrackModel[13] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 168
		rightTrackModel[14] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 169
		rightTrackModel[15] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 170
		rightTrackModel[16] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 171
		rightTrackModel[17] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 172
		rightTrackModel[18] = new ModelRendererTurbo(this, 171, 240, textureX, textureY); // Box 464
		rightTrackModel[19] = new ModelRendererTurbo(this, 22, 282, textureX, textureY); // Box 465

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 94, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 153
		rightTrackModel[0].setRotationPoint(-73F, 6F, -22.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F); // Box 154
		rightTrackModel[1].setRotationPoint(21F, 6F, -22.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F); // Box 155
		rightTrackModel[2].setRotationPoint(46F, -9F, -22.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, -1F, -2F, -5F, -1F, -2F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F); // Box 156
		rightTrackModel[3].setRotationPoint(43F, -14F, -22.5F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		rightTrackModel[4].setRotationPoint(37F, -14F, -22.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,-2F, -7F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -7F, -1F, -2F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 7F, 0F); // Box 158
		rightTrackModel[5].setRotationPoint(27F, -14F, -22.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 91, 2, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		rightTrackModel[6].setRotationPoint(-70F, -4F, -22.5F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, -1F); // Box 160
		rightTrackModel[7].setRotationPoint(33F, 4F, -22.5F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, -1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 161
		rightTrackModel[8].setRotationPoint(21F, -4F, -22.5F);

		rightTrackModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		rightTrackModel[9].setRotationPoint(-102F, -16F, -22.5F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 10, 2, 12, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, -1F); // Box 165
		rightTrackModel[10].setRotationPoint(-102F, 2F, -22.5F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 19, 2, 12, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2F, -1F); // Box 166
		rightTrackModel[11].setRotationPoint(-92F, 4F, -22.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,0F, 0F, 0F, -3F, 3F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -5F, -1F, -2F, -5F, -1F, 0F, 0F, -1F); // Box 167
		rightTrackModel[12].setRotationPoint(43F, 0F, -22.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 168
		rightTrackModel[13].setRotationPoint(46F, -6F, -22.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,-2F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -5F, -1F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F); // Box 169
		rightTrackModel[14].setRotationPoint(-108F, -16F, -22.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 170
		rightTrackModel[15].setRotationPoint(-107F, -11F, -22.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,-0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 171
		rightTrackModel[16].setRotationPoint(-107F, -8F, -22.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 12, 0F,-3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 0F, -2F, -5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -5F, -1F); // Box 172
		rightTrackModel[17].setRotationPoint(-108F, -2F, -22.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 12, 2, 12, 0F,0F, 4F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 464
		rightTrackModel[18].setRotationPoint(-82F, -4F, -22.5F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 16, 2, 12, 0F,0F, 0F, -1F, -2F, -8F, -1F, -2F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 0F, 0F); // Box 465
		rightTrackModel[19].setRotationPoint(-96F, -16F, -22.5F);
	}
}