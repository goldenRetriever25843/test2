//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShindenElite extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelShindenElite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[347];
		noseModel = new ModelRendererTurbo[8];
		tailModel = new ModelRendererTurbo[26];
		leftWingModel = new ModelRendererTurbo[22];
		rightWingModel = new ModelRendererTurbo[22];
		topWingModel = new ModelRendererTurbo[36];
		yawFlapModel = new ModelRendererTurbo[20];
		pitchFlapLeftModel = new ModelRendererTurbo[13];
		pitchFlapRightModel = new ModelRendererTurbo[6];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[119];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inittopWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 126, 52, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 197, 145, textureX, textureY); // Core100
		bodyModel[3] = new ModelRendererTurbo(this, 5, 80, textureX, textureY); // Core101
		bodyModel[4] = new ModelRendererTurbo(this, 5, 524, textureX, textureY); // Core103
		bodyModel[5] = new ModelRendererTurbo(this, 6, 495, textureX, textureY); // Core104
		bodyModel[6] = new ModelRendererTurbo(this, 150, 365, textureX, textureY); // Core105
		bodyModel[7] = new ModelRendererTurbo(this, 150, 278, textureX, textureY); // Core106
		bodyModel[8] = new ModelRendererTurbo(this, 5, 91, textureX, textureY); // Core107
		bodyModel[9] = new ModelRendererTurbo(this, 6, 507, textureX, textureY); // Core108
		bodyModel[10] = new ModelRendererTurbo(this, 5, 524, textureX, textureY); // Core109
		bodyModel[11] = new ModelRendererTurbo(this, 5, 422, textureX, textureY); // Core11
		bodyModel[12] = new ModelRendererTurbo(this, 291, 2, textureX, textureY); // Core111
		bodyModel[13] = new ModelRendererTurbo(this, 214, 140, textureX, textureY); // Core112
		bodyModel[14] = new ModelRendererTurbo(this, 82, 364, textureX, textureY); // Core113
		bodyModel[15] = new ModelRendererTurbo(this, 82, 297, textureX, textureY); // Core114
		bodyModel[16] = new ModelRendererTurbo(this, 21, 525, textureX, textureY); // Core115
		bodyModel[17] = new ModelRendererTurbo(this, 203, 420, textureX, textureY); // Core116
		bodyModel[18] = new ModelRendererTurbo(this, 299, 150, textureX, textureY); // Core117
		bodyModel[19] = new ModelRendererTurbo(this, 39, 384, textureX, textureY); // Core118
		bodyModel[20] = new ModelRendererTurbo(this, 259, 134, textureX, textureY); // Core119
		bodyModel[21] = new ModelRendererTurbo(this, 115, 422, textureX, textureY); // Core12
		bodyModel[22] = new ModelRendererTurbo(this, 150, 287, textureX, textureY); // Core120
		bodyModel[23] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core121
		bodyModel[24] = new ModelRendererTurbo(this, 5, 162, textureX, textureY); // Core122
		bodyModel[25] = new ModelRendererTurbo(this, 214, 140, textureX, textureY); // Core123
		bodyModel[26] = new ModelRendererTurbo(this, 29, 495, textureX, textureY); // Core124
		bodyModel[27] = new ModelRendererTurbo(this, 291, 24, textureX, textureY); // Core126
		bodyModel[28] = new ModelRendererTurbo(this, 155, 458, textureX, textureY); // Core128
		bodyModel[29] = new ModelRendererTurbo(this, 5, 371, textureX, textureY); // Core129
		bodyModel[30] = new ModelRendererTurbo(this, 78, 276, textureX, textureY); // Core13
		bodyModel[31] = new ModelRendererTurbo(this, 150, 270, textureX, textureY); // Core130
		bodyModel[32] = new ModelRendererTurbo(this, 318, 2, textureX, textureY); // Core131
		bodyModel[33] = new ModelRendererTurbo(this, 29, 507, textureX, textureY); // Core132
		bodyModel[34] = new ModelRendererTurbo(this, 53, 463, textureX, textureY); // Core135
		bodyModel[35] = new ModelRendererTurbo(this, 56, 520, textureX, textureY); // Core136
		bodyModel[36] = new ModelRendererTurbo(this, 208, 180, textureX, textureY); // Core137
		bodyModel[37] = new ModelRendererTurbo(this, 5, 360, textureX, textureY); // Core138
		bodyModel[38] = new ModelRendererTurbo(this, 5, 52, textureX, textureY); // Core14
		bodyModel[39] = new ModelRendererTurbo(this, 318, 24, textureX, textureY); // Core140
		bodyModel[40] = new ModelRendererTurbo(this, 82, 354, textureX, textureY); // Core142
		bodyModel[41] = new ModelRendererTurbo(this, 208, 172, textureX, textureY); // Core144
		bodyModel[42] = new ModelRendererTurbo(this, 197, 178, textureX, textureY); // Core145
		bodyModel[43] = new ModelRendererTurbo(this, 88, 202, textureX, textureY); // Core146
		bodyModel[44] = new ModelRendererTurbo(this, 56, 509, textureX, textureY); // Core147
		bodyModel[45] = new ModelRendererTurbo(this, 150, 352, textureX, textureY); // Core148
		bodyModel[46] = new ModelRendererTurbo(this, 126, 66, textureX, textureY); // Core15
		bodyModel[47] = new ModelRendererTurbo(this, 264, 2, textureX, textureY); // Core150
		bodyModel[48] = new ModelRendererTurbo(this, 197, 173, textureX, textureY); // Core152
		bodyModel[49] = new ModelRendererTurbo(this, 59, 495, textureX, textureY); // Core153
		bodyModel[50] = new ModelRendererTurbo(this, 264, 24, textureX, textureY); // Core154
		bodyModel[51] = new ModelRendererTurbo(this, 128, 162, textureX, textureY); // Core156
		bodyModel[52] = new ModelRendererTurbo(this, 71, 66, textureX, textureY); // Core16
		bodyModel[53] = new ModelRendererTurbo(this, 205, 24, textureX, textureY); // Core160
		bodyModel[54] = new ModelRendererTurbo(this, 56, 532, textureX, textureY); // Core161
		bodyModel[55] = new ModelRendererTurbo(this, 60, 230, textureX, textureY); // Core162
		bodyModel[56] = new ModelRendererTurbo(this, 241, 138, textureX, textureY); // Core163
		bodyModel[57] = new ModelRendererTurbo(this, 88, 214, textureX, textureY); // Core164
		bodyModel[58] = new ModelRendererTurbo(this, 84, 495, textureX, textureY); // Core165
		bodyModel[59] = new ModelRendererTurbo(this, 234, 138, textureX, textureY); // Core167
		bodyModel[60] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Core169
		bodyModel[61] = new ModelRendererTurbo(this, 24, 66, textureX, textureY); // Core17
		bodyModel[62] = new ModelRendererTurbo(this, 180, 24, textureX, textureY); // Core171
		bodyModel[63] = new ModelRendererTurbo(this, 234, 143, textureX, textureY); // Core172
		bodyModel[64] = new ModelRendererTurbo(this, 203, 64, textureX, textureY); // Core173
		bodyModel[65] = new ModelRendererTurbo(this, 74, 330, textureX, textureY); // Core174
		bodyModel[66] = new ModelRendererTurbo(this, 203, 83, textureX, textureY); // Core175
		bodyModel[67] = new ModelRendererTurbo(this, 53, 477, textureX, textureY); // Core176
		bodyModel[68] = new ModelRendererTurbo(this, 180, 2, textureX, textureY); // Core177
		bodyModel[69] = new ModelRendererTurbo(this, 241, 143, textureX, textureY); // Core178
		bodyModel[70] = new ModelRendererTurbo(this, 230, 24, textureX, textureY); // Core179
		bodyModel[71] = new ModelRendererTurbo(this, 27, 142, textureX, textureY); // Core18
		bodyModel[72] = new ModelRendererTurbo(this, 234, 138, textureX, textureY); // Core180
		bodyModel[73] = new ModelRendererTurbo(this, 203, 102, textureX, textureY); // Core181
		bodyModel[74] = new ModelRendererTurbo(this, 155, 474, textureX, textureY); // Core182
		bodyModel[75] = new ModelRendererTurbo(this, 21, 525, textureX, textureY); // Core183
		bodyModel[76] = new ModelRendererTurbo(this, 178, 289, textureX, textureY); // Core184
		bodyModel[77] = new ModelRendererTurbo(this, 60, 204, textureX, textureY); // Core185
		bodyModel[78] = new ModelRendererTurbo(this, 149, 303, textureX, textureY); // Core186
		bodyModel[79] = new ModelRendererTurbo(this, 39, 402, textureX, textureY); // Core188
		bodyModel[80] = new ModelRendererTurbo(this, 60, 194, textureX, textureY); // Core189
		bodyModel[81] = new ModelRendererTurbo(this, 22, 108, textureX, textureY); // Core19
		bodyModel[82] = new ModelRendererTurbo(this, 299, 156, textureX, textureY); // Core190
		bodyModel[83] = new ModelRendererTurbo(this, 230, 2, textureX, textureY); // Core191
		bodyModel[84] = new ModelRendererTurbo(this, 234, 143, textureX, textureY); // Core192
		bodyModel[85] = new ModelRendererTurbo(this, 203, 102, textureX, textureY); // Core193
		bodyModel[86] = new ModelRendererTurbo(this, 197, 197, textureX, textureY); // Core194
		bodyModel[87] = new ModelRendererTurbo(this, 333, 50, textureX, textureY); // Core195
		bodyModel[88] = new ModelRendererTurbo(this, 197, 155, textureX, textureY); // Core196
		bodyModel[89] = new ModelRendererTurbo(this, 197, 188, textureX, textureY); // Core197
		bodyModel[90] = new ModelRendererTurbo(this, 233, 79, textureX, textureY); // Core198
		bodyModel[91] = new ModelRendererTurbo(this, 333, 72, textureX, textureY); // Core199
		bodyModel[92] = new ModelRendererTurbo(this, 5, 210, textureX, textureY); // Core2
		bodyModel[93] = new ModelRendererTurbo(this, 30, 194, textureX, textureY); // Core20
		bodyModel[94] = new ModelRendererTurbo(this, 359, 50, textureX, textureY); // Core200
		bodyModel[95] = new ModelRendererTurbo(this, 233, 48, textureX, textureY); // Core201
		bodyModel[96] = new ModelRendererTurbo(this, 42, 273, textureX, textureY); // Core202
		bodyModel[97] = new ModelRendererTurbo(this, 359, 72, textureX, textureY); // Core203
		bodyModel[98] = new ModelRendererTurbo(this, 79, 509, textureX, textureY); // Core204
		bodyModel[99] = new ModelRendererTurbo(this, 47, 263, textureX, textureY); // Core205
		bodyModel[100] = new ModelRendererTurbo(this, 251, 75, textureX, textureY); // Core206
		bodyModel[101] = new ModelRendererTurbo(this, 359, 98, textureX, textureY); // Core207
		bodyModel[102] = new ModelRendererTurbo(this, 79, 520, textureX, textureY); // Core208
		bodyModel[103] = new ModelRendererTurbo(this, 42, 286, textureX, textureY); // Core209
		bodyModel[104] = new ModelRendererTurbo(this, 299, 180, textureX, textureY); // Core21
		bodyModel[105] = new ModelRendererTurbo(this, 359, 120, textureX, textureY); // Core210
		bodyModel[106] = new ModelRendererTurbo(this, 251, 82, textureX, textureY); // Core211
		bodyModel[107] = new ModelRendererTurbo(this, 79, 532, textureX, textureY); // Core212
		bodyModel[108] = new ModelRendererTurbo(this, 257, 84, textureX, textureY); // Core213
		bodyModel[109] = new ModelRendererTurbo(this, 282, 96, textureX, textureY); // Core215
		bodyModel[110] = new ModelRendererTurbo(this, 42, 286, textureX, textureY); // Core216
		bodyModel[111] = new ModelRendererTurbo(this, 282, 118, textureX, textureY); // Core217
		bodyModel[112] = new ModelRendererTurbo(this, 257, 84, textureX, textureY); // Core218
		bodyModel[113] = new ModelRendererTurbo(this, 149, 303, textureX, textureY); // Core219
		bodyModel[114] = new ModelRendererTurbo(this, 203, 443, textureX, textureY); // Core22
		bodyModel[115] = new ModelRendererTurbo(this, 149, 314, textureX, textureY); // Core220
		bodyModel[116] = new ModelRendererTurbo(this, 283, 73, textureX, textureY); // Core221
		bodyModel[117] = new ModelRendererTurbo(this, 42, 273, textureX, textureY); // Core222
		bodyModel[118] = new ModelRendererTurbo(this, 251, 82, textureX, textureY); // Core223
		bodyModel[119] = new ModelRendererTurbo(this, 203, 454, textureX, textureY); // Core224
		bodyModel[120] = new ModelRendererTurbo(this, 269, 149, textureX, textureY); // Core225
		bodyModel[121] = new ModelRendererTurbo(this, 178, 270, textureX, textureY); // Core227
		bodyModel[122] = new ModelRendererTurbo(this, 263, 68, textureX, textureY); // Core228
		bodyModel[123] = new ModelRendererTurbo(this, 21, 525, textureX, textureY); // Core229
		bodyModel[124] = new ModelRendererTurbo(this, 150, 278, textureX, textureY); // Core23
		bodyModel[125] = new ModelRendererTurbo(this, 115, 354, textureX, textureY); // Core230
		bodyModel[126] = new ModelRendererTurbo(this, 126, 80, textureX, textureY); // Core231
		bodyModel[127] = new ModelRendererTurbo(this, 149, 314, textureX, textureY); // Core232
		bodyModel[128] = new ModelRendererTurbo(this, 24, 273, textureX, textureY); // Core233
		bodyModel[129] = new ModelRendererTurbo(this, 251, 75, textureX, textureY); // Core234
		bodyModel[130] = new ModelRendererTurbo(this, 283, 51, textureX, textureY); // Core235
		bodyModel[131] = new ModelRendererTurbo(this, 149, 326, textureX, textureY); // Core236
		bodyModel[132] = new ModelRendererTurbo(this, 23, 285, textureX, textureY); // Core237
		bodyModel[133] = new ModelRendererTurbo(this, 308, 73, textureX, textureY); // Core238
		bodyModel[134] = new ModelRendererTurbo(this, 308, 51, textureX, textureY); // Core239
		bodyModel[135] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core24
		bodyModel[136] = new ModelRendererTurbo(this, 30, 263, textureX, textureY); // Core240
		bodyModel[137] = new ModelRendererTurbo(this, 24, 273, textureX, textureY); // Core241
		bodyModel[138] = new ModelRendererTurbo(this, 308, 118, textureX, textureY); // Core242
		bodyModel[139] = new ModelRendererTurbo(this, 308, 96, textureX, textureY); // Core243
		bodyModel[140] = new ModelRendererTurbo(this, 23, 285, textureX, textureY); // Core244
		bodyModel[141] = new ModelRendererTurbo(this, 5, 285, textureX, textureY); // Core245
		bodyModel[142] = new ModelRendererTurbo(this, 268, 100, textureX, textureY); // Core246
		bodyModel[143] = new ModelRendererTurbo(this, 5, 273, textureX, textureY); // Core247
		bodyModel[144] = new ModelRendererTurbo(this, 5, 285, textureX, textureY); // Core248
		bodyModel[145] = new ModelRendererTurbo(this, 261, 94, textureX, textureY); // Core249
		bodyModel[146] = new ModelRendererTurbo(this, 7, 347, textureX, textureY); // Core25
		bodyModel[147] = new ModelRendererTurbo(this, 5, 273, textureX, textureY); // Core250
		bodyModel[148] = new ModelRendererTurbo(this, 268, 94, textureX, textureY); // Core251
		bodyModel[149] = new ModelRendererTurbo(this, 16, 263, textureX, textureY); // Core252
		bodyModel[150] = new ModelRendererTurbo(this, 257, 100, textureX, textureY); // Core253
		bodyModel[151] = new ModelRendererTurbo(this, 71, 80, textureX, textureY); // Core254
		bodyModel[152] = new ModelRendererTurbo(this, 203, 470, textureX, textureY); // Core255
		bodyModel[153] = new ModelRendererTurbo(this, 149, 326, textureX, textureY); // Core256
		bodyModel[154] = new ModelRendererTurbo(this, 263, 68, textureX, textureY); // Core257
		bodyModel[155] = new ModelRendererTurbo(this, 178, 279, textureX, textureY); // Core258
		bodyModel[156] = new ModelRendererTurbo(this, 115, 364, textureX, textureY); // Core259
		bodyModel[157] = new ModelRendererTurbo(this, 21, 525, textureX, textureY); // Core26
		bodyModel[158] = new ModelRendererTurbo(this, 299, 168, textureX, textureY); // Core261
		bodyModel[159] = new ModelRendererTurbo(this, 21, 525, textureX, textureY); // Core262
		bodyModel[160] = new ModelRendererTurbo(this, 22, 253, textureX, textureY); // Core263
		bodyModel[161] = new ModelRendererTurbo(this, 197, 124, textureX, textureY); // Core264
		bodyModel[162] = new ModelRendererTurbo(this, 12, 253, textureX, textureY); // Core265
		bodyModel[163] = new ModelRendererTurbo(this, 7, 315, textureX, textureY); // Core266
		bodyModel[164] = new ModelRendererTurbo(this, 5, 253, textureX, textureY); // Core267
		bodyModel[165] = new ModelRendererTurbo(this, 5, 451, textureX, textureY); // Core268
		bodyModel[166] = new ModelRendererTurbo(this, 51, 253, textureX, textureY); // Core269
		bodyModel[167] = new ModelRendererTurbo(this, 39, 360, textureX, textureY); // Core27
		bodyModel[168] = new ModelRendererTurbo(this, 197, 124, textureX, textureY); // Core270
		bodyModel[169] = new ModelRendererTurbo(this, 22, 253, textureX, textureY); // Core271
		bodyModel[170] = new ModelRendererTurbo(this, 113, 448, textureX, textureY); // Core272
		bodyModel[171] = new ModelRendererTurbo(this, 51, 253, textureX, textureY); // Core273
		bodyModel[172] = new ModelRendererTurbo(this, 70, 108, textureX, textureY); // Core274
		bodyModel[173] = new ModelRendererTurbo(this, 124, 109, textureX, textureY); // Core275
		bodyModel[174] = new ModelRendererTurbo(this, 5, 253, textureX, textureY); // Core276
		bodyModel[175] = new ModelRendererTurbo(this, 12, 253, textureX, textureY); // Core278
		bodyModel[176] = new ModelRendererTurbo(this, 5, 463, textureX, textureY); // Core279
		bodyModel[177] = new ModelRendererTurbo(this, 7, 297, textureX, textureY); // Core28
		bodyModel[178] = new ModelRendererTurbo(this, 113, 458, textureX, textureY); // Core280
		bodyModel[179] = new ModelRendererTurbo(this, 5, 264, textureX, textureY); // Core281
		bodyModel[180] = new ModelRendererTurbo(this, 115, 377, textureX, textureY); // Core282
		bodyModel[181] = new ModelRendererTurbo(this, 317, 162, textureX, textureY); // Core283
		bodyModel[182] = new ModelRendererTurbo(this, 24, 80, textureX, textureY); // Core284
		bodyModel[183] = new ModelRendererTurbo(this, 205, 291, textureX, textureY); // Core285
		bodyModel[184] = new ModelRendererTurbo(this, 21, 537, textureX, textureY); // Core287
		bodyModel[185] = new ModelRendererTurbo(this, 219, 420, textureX, textureY); // Core288
		bodyModel[186] = new ModelRendererTurbo(this, 113, 474, textureX, textureY); // Core289
		bodyModel[187] = new ModelRendererTurbo(this, 5, 477, textureX, textureY); // Core290
		bodyModel[188] = new ModelRendererTurbo(this, 7, 330, textureX, textureY); // Core291
		bodyModel[189] = new ModelRendererTurbo(this, 163, 234, textureX, textureY); // Core296
		bodyModel[190] = new ModelRendererTurbo(this, 163, 249, textureX, textureY); // Core296
		bodyModel[191] = new ModelRendererTurbo(this, 128, 142, textureX, textureY); // Core294
		bodyModel[192] = new ModelRendererTurbo(this, 75, 142, textureX, textureY); // Core295
		bodyModel[193] = new ModelRendererTurbo(this, 118, 234, textureX, textureY); // Core296
		bodyModel[194] = new ModelRendererTurbo(this, 7, 347, textureX, textureY); // Core297
		bodyModel[195] = new ModelRendererTurbo(this, 30, 230, textureX, textureY); // Core298
		bodyModel[196] = new ModelRendererTurbo(this, 30, 217, textureX, textureY); // Core299
		bodyModel[197] = new ModelRendererTurbo(this, 128, 125, textureX, textureY); // Core3
		bodyModel[198] = new ModelRendererTurbo(this, 5, 441, textureX, textureY); // Core30
		bodyModel[199] = new ModelRendererTurbo(this, 87, 236, textureX, textureY); // Core296
		bodyModel[200] = new ModelRendererTurbo(this, 30, 205, textureX, textureY); // Core301
		bodyModel[201] = new ModelRendererTurbo(this, 87, 251, textureX, textureY); // Core296
		bodyModel[202] = new ModelRendererTurbo(this, 137, 191, textureX, textureY); // Core303
		bodyModel[203] = new ModelRendererTurbo(this, 22, 91, textureX, textureY); // Core304
		bodyModel[204] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core305
		bodyModel[205] = new ModelRendererTurbo(this, 115, 394, textureX, textureY); // Core307
		bodyModel[206] = new ModelRendererTurbo(this, 21, 537, textureX, textureY); // Core308
		bodyModel[207] = new ModelRendererTurbo(this, 205, 271, textureX, textureY); // Core309
		bodyModel[208] = new ModelRendererTurbo(this, 39, 371, textureX, textureY); // Core31
		bodyModel[209] = new ModelRendererTurbo(this, 299, 174, textureX, textureY); // Core310
		bodyModel[210] = new ModelRendererTurbo(this, 137, 202, textureX, textureY); // Core311
		bodyModel[211] = new ModelRendererTurbo(this, 137, 214, textureX, textureY); // Core312
		bodyModel[212] = new ModelRendererTurbo(this, 189, 365, textureX, textureY); // Core313
		bodyModel[213] = new ModelRendererTurbo(this, 27, 162, textureX, textureY); // Core314
		bodyModel[214] = new ModelRendererTurbo(this, 205, 280, textureX, textureY); // Core315
		bodyModel[215] = new ModelRendererTurbo(this, 225, 188, textureX, textureY); // Core316
		bodyModel[216] = new ModelRendererTurbo(this, 299, 174, textureX, textureY); // Core317
		bodyModel[217] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core318
		bodyModel[218] = new ModelRendererTurbo(this, 5, 125, textureX, textureY); // Core319
		bodyModel[219] = new ModelRendererTurbo(this, 21, 525, textureX, textureY); // Core32
		bodyModel[220] = new ModelRendererTurbo(this, 189, 352, textureX, textureY); // Core320
		bodyModel[221] = new ModelRendererTurbo(this, 225, 180, textureX, textureY); // Core322
		bodyModel[222] = new ModelRendererTurbo(this, 75, 162, textureX, textureY); // Core323
		bodyModel[223] = new ModelRendererTurbo(this, 299, 168, textureX, textureY); // Core324
		bodyModel[224] = new ModelRendererTurbo(this, 3, 188, textureX, textureY); // Core325
		bodyModel[225] = new ModelRendererTurbo(this, 11, 188, textureX, textureY); // Core326
		bodyModel[226] = new ModelRendererTurbo(this, 118, 249, textureX, textureY); // Core296
		bodyModel[227] = new ModelRendererTurbo(this, 197, 208, textureX, textureY); // Core328
		bodyModel[228] = new ModelRendererTurbo(this, 197, 208, textureX, textureY); // Core329
		bodyModel[229] = new ModelRendererTurbo(this, 113, 439, textureX, textureY); // Core33
		bodyModel[230] = new ModelRendererTurbo(this, 212, 208, textureX, textureY); // Core330
		bodyModel[231] = new ModelRendererTurbo(this, 306, 209, textureX, textureY); // Core331
		bodyModel[232] = new ModelRendererTurbo(this, 306, 202, textureX, textureY); // Core332
		bodyModel[233] = new ModelRendererTurbo(this, 293, 200, textureX, textureY); // Core333
		bodyModel[234] = new ModelRendererTurbo(this, 295, 206, textureX, textureY); // Core334
		bodyModel[235] = new ModelRendererTurbo(this, 293, 200, textureX, textureY); // Core335
		bodyModel[236] = new ModelRendererTurbo(this, 293, 200, textureX, textureY); // Core336
		bodyModel[237] = new ModelRendererTurbo(this, 295, 206, textureX, textureY); // Core337
		bodyModel[238] = new ModelRendererTurbo(this, 293, 200, textureX, textureY); // Core338
		bodyModel[239] = new ModelRendererTurbo(this, 306, 202, textureX, textureY); // Core339
		bodyModel[240] = new ModelRendererTurbo(this, 150, 270, textureX, textureY); // Core34
		bodyModel[241] = new ModelRendererTurbo(this, 306, 209, textureX, textureY); // Core340
		bodyModel[242] = new ModelRendererTurbo(this, 293, 200, textureX, textureY); // Core341
		bodyModel[243] = new ModelRendererTurbo(this, 295, 206, textureX, textureY); // Core342
		bodyModel[244] = new ModelRendererTurbo(this, 293, 200, textureX, textureY); // Core343
		bodyModel[245] = new ModelRendererTurbo(this, 306, 202, textureX, textureY); // Core344
		bodyModel[246] = new ModelRendererTurbo(this, 306, 209, textureX, textureY); // Core345
		bodyModel[247] = new ModelRendererTurbo(this, 293, 200, textureX, textureY); // Core346
		bodyModel[248] = new ModelRendererTurbo(this, 295, 206, textureX, textureY); // Core347
		bodyModel[249] = new ModelRendererTurbo(this, 293, 200, textureX, textureY); // Core348
		bodyModel[250] = new ModelRendererTurbo(this, 306, 202, textureX, textureY); // Core349
		bodyModel[251] = new ModelRendererTurbo(this, 203, 435, textureX, textureY); // Core35
		bodyModel[252] = new ModelRendererTurbo(this, 306, 209, textureX, textureY); // Core350
		bodyModel[253] = new ModelRendererTurbo(this, 267, 200, textureX, textureY); // Core351
		bodyModel[254] = new ModelRendererTurbo(this, 267, 200, textureX, textureY); // Core352
		bodyModel[255] = new ModelRendererTurbo(this, 212, 208, textureX, textureY); // Core353
		bodyModel[256] = new ModelRendererTurbo(this, 220, 208, textureX, textureY); // Core354
		bodyModel[257] = new ModelRendererTurbo(this, 197, 208, textureX, textureY); // Core355
		bodyModel[258] = new ModelRendererTurbo(this, 47, 297, textureX, textureY); // Core36
		bodyModel[259] = new ModelRendererTurbo(this, 269, 166, textureX, textureY); // Core38
		bodyModel[260] = new ModelRendererTurbo(this, 189, 380, textureX, textureY); // Core39
		bodyModel[261] = new ModelRendererTurbo(this, 75, 125, textureX, textureY); // Core4
		bodyModel[262] = new ModelRendererTurbo(this, 70, 91, textureX, textureY); // Core41
		bodyModel[263] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core42
		bodyModel[264] = new ModelRendererTurbo(this, 241, 181, textureX, textureY); // Core43
		bodyModel[265] = new ModelRendererTurbo(this, 299, 156, textureX, textureY); // Core44
		bodyModel[266] = new ModelRendererTurbo(this, 241, 189, textureX, textureY); // Core45
		bodyModel[267] = new ModelRendererTurbo(this, 299, 150, textureX, textureY); // Core46
		bodyModel[268] = new ModelRendererTurbo(this, 189, 396, textureX, textureY); // Core47
		bodyModel[269] = new ModelRendererTurbo(this, 124, 92, textureX, textureY); // Core48
		bodyModel[270] = new ModelRendererTurbo(this, 60, 217, textureX, textureY); // Core49
		bodyModel[271] = new ModelRendererTurbo(this, 27, 125, textureX, textureY); // Core5
		bodyModel[272] = new ModelRendererTurbo(this, 230, 197, textureX, textureY); // Core50
		bodyModel[273] = new ModelRendererTurbo(this, 150, 396, textureX, textureY); // Core51
		bodyModel[274] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core52
		bodyModel[275] = new ModelRendererTurbo(this, 178, 289, textureX, textureY); // Core53
		bodyModel[276] = new ModelRendererTurbo(this, 21, 525, textureX, textureY); // Core54
		bodyModel[277] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core55
		bodyModel[278] = new ModelRendererTurbo(this, 203, 53, textureX, textureY); // Core56
		bodyModel[279] = new ModelRendererTurbo(this, 236, 173, textureX, textureY); // Core57
		bodyModel[280] = new ModelRendererTurbo(this, 21, 525, textureX, textureY); // Core58
		bodyModel[281] = new ModelRendererTurbo(this, 178, 279, textureX, textureY); // Core59
		bodyModel[282] = new ModelRendererTurbo(this, 52, 422, textureX, textureY); // Core6
		bodyModel[283] = new ModelRendererTurbo(this, 88, 191, textureX, textureY); // Core60
		bodyModel[284] = new ModelRendererTurbo(this, 82, 394, textureX, textureY); // Core61
		bodyModel[285] = new ModelRendererTurbo(this, 5, 402, textureX, textureY); // Core62
		bodyModel[286] = new ModelRendererTurbo(this, 21, 537, textureX, textureY); // Core63
		bodyModel[287] = new ModelRendererTurbo(this, 5, 173, textureX, textureY); // Core64
		bodyModel[288] = new ModelRendererTurbo(this, 219, 470, textureX, textureY); // Core65
		bodyModel[289] = new ModelRendererTurbo(this, 203, 108, textureX, textureY); // Core66
		bodyModel[290] = new ModelRendererTurbo(this, 74, 315, textureX, textureY); // Core67
		bodyModel[291] = new ModelRendererTurbo(this, 178, 270, textureX, textureY); // Core68
		bodyModel[292] = new ModelRendererTurbo(this, 227, 173, textureX, textureY); // Core69
		bodyModel[293] = new ModelRendererTurbo(this, 156, 422, textureX, textureY); // Core7
		bodyModel[294] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core70
		bodyModel[295] = new ModelRendererTurbo(this, 53, 451, textureX, textureY); // Core71
		bodyModel[296] = new ModelRendererTurbo(this, 205, 271, textureX, textureY); // Core73
		bodyModel[297] = new ModelRendererTurbo(this, 21, 537, textureX, textureY); // Core74
		bodyModel[298] = new ModelRendererTurbo(this, 263, 53, textureX, textureY); // Core75
		bodyModel[299] = new ModelRendererTurbo(this, 219, 454, textureX, textureY); // Core76
		bodyModel[300] = new ModelRendererTurbo(this, 252, 173, textureX, textureY); // Core77
		bodyModel[301] = new ModelRendererTurbo(this, 5, 66, textureX, textureY); // Core78
		bodyModel[302] = new ModelRendererTurbo(this, 5, 384, textureX, textureY); // Core79
		bodyModel[303] = new ModelRendererTurbo(this, 24, 52, textureX, textureY); // Core8
		bodyModel[304] = new ModelRendererTurbo(this, 219, 443, textureX, textureY); // Core80
		bodyModel[305] = new ModelRendererTurbo(this, 155, 448, textureX, textureY); // Core81
		bodyModel[306] = new ModelRendererTurbo(this, 82, 377, textureX, textureY); // Core82
		bodyModel[307] = new ModelRendererTurbo(this, 205, 280, textureX, textureY); // Core83
		bodyModel[308] = new ModelRendererTurbo(this, 5, 524, textureX, textureY); // Core84
		bodyModel[309] = new ModelRendererTurbo(this, 5, 108, textureX, textureY); // Core85
		bodyModel[310] = new ModelRendererTurbo(this, 346, 24, textureX, textureY); // Core87
		bodyModel[311] = new ModelRendererTurbo(this, 245, 173, textureX, textureY); // Core88
		bodyModel[312] = new ModelRendererTurbo(this, 150, 380, textureX, textureY); // Core89
		bodyModel[313] = new ModelRendererTurbo(this, 71, 52, textureX, textureY); // Core9
		bodyModel[314] = new ModelRendererTurbo(this, 155, 439, textureX, textureY); // Core90
		bodyModel[315] = new ModelRendererTurbo(this, 5, 524, textureX, textureY); // Core91
		bodyModel[316] = new ModelRendererTurbo(this, 219, 435, textureX, textureY); // Core92
		bodyModel[317] = new ModelRendererTurbo(this, 5, 142, textureX, textureY); // Core93
		bodyModel[318] = new ModelRendererTurbo(this, 197, 139, textureX, textureY); // Core94
		bodyModel[319] = new ModelRendererTurbo(this, 205, 291, textureX, textureY); // Core95
		bodyModel[320] = new ModelRendererTurbo(this, 53, 441, textureX, textureY); // Core97
		bodyModel[321] = new ModelRendererTurbo(this, 346, 2, textureX, textureY); // Core98
		bodyModel[322] = new ModelRendererTurbo(this, 150, 287, textureX, textureY); // Core99
		bodyModel[323] = new ModelRendererTurbo(this, 11, 640, textureX, textureY); // LeftWing1
		bodyModel[324] = new ModelRendererTurbo(this, 317, 503, textureX, textureY); // LeftWing17
		bodyModel[325] = new ModelRendererTurbo(this, 317, 520, textureX, textureY); // LeftWing18
		bodyModel[326] = new ModelRendererTurbo(this, 317, 531, textureX, textureY); // LeftWing19
		bodyModel[327] = new ModelRendererTurbo(this, 11, 653, textureX, textureY); // LeftWing2
		bodyModel[328] = new ModelRendererTurbo(this, 317, 542, textureX, textureY); // LeftWing20
		bodyModel[329] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // LeftWing3
		bodyModel[330] = new ModelRendererTurbo(this, 11, 670, textureX, textureY); // LeftWing4
		bodyModel[331] = new ModelRendererTurbo(this, 167, 503, textureX, textureY); // LeftWing5
		bodyModel[332] = new ModelRendererTurbo(this, 167, 520, textureX, textureY); // LeftWing6
		bodyModel[333] = new ModelRendererTurbo(this, 167, 531, textureX, textureY); // LeftWing7
		bodyModel[334] = new ModelRendererTurbo(this, 167, 548, textureX, textureY); // LeftWing8
		bodyModel[335] = new ModelRendererTurbo(this, 317, 503, textureX, textureY); // RightWing1
		bodyModel[336] = new ModelRendererTurbo(this, 317, 542, textureX, textureY); // RightWing10
		bodyModel[337] = new ModelRendererTurbo(this, 11, 670, textureX, textureY); // RightWing11
		bodyModel[338] = new ModelRendererTurbo(this, 167, 548, textureX, textureY); // RightWing12
		bodyModel[339] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // RightWing2
		bodyModel[340] = new ModelRendererTurbo(this, 167, 503, textureX, textureY); // RightWing3
		bodyModel[341] = new ModelRendererTurbo(this, 317, 520, textureX, textureY); // RightWing4
		bodyModel[342] = new ModelRendererTurbo(this, 11, 640, textureX, textureY); // RightWing5
		bodyModel[343] = new ModelRendererTurbo(this, 167, 520, textureX, textureY); // RightWing6
		bodyModel[344] = new ModelRendererTurbo(this, 317, 531, textureX, textureY); // RightWing7
		bodyModel[345] = new ModelRendererTurbo(this, 11, 653, textureX, textureY); // RightWing8
		bodyModel[346] = new ModelRendererTurbo(this, 167, 531, textureX, textureY); // RightWing9

		bodyModel[0].addShapeBox(-21F, -7F, -2F, 55, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core1
		bodyModel[0].setRotationPoint(0F, -20F, 0F);

		bodyModel[1].addShapeBox(-46F, -24F, -2F, 25, 5, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core10
		bodyModel[1].setRotationPoint(0F, -20F, 0F);

		bodyModel[2].addShapeBox(-13.5F, -11F, -7.5F, 3, 1, 3, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core100
		bodyModel[2].setRotationPoint(0F, -20F, 0F);

		bodyModel[3].addShapeBox(-92F, -19F, 2F, 5, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -2F); // Core101
		bodyModel[3].setRotationPoint(1F, -20F, 0F);

		bodyModel[4].addShapeBox(73F, -20.5F, 0F, 3, 5, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Core103
		bodyModel[4].setRotationPoint(0F, -20F, 0F);

		bodyModel[5].addShapeBox(67F, -23.5F, -4F, 5, 5, 2, 0F,0F, -2F, .5F, 0F, -2.5F, .5F, 0F, -1.5F, -1F, 0F, -.4F, -.5F, 0F, -1F, 1.95F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Core104
		bodyModel[5].setRotationPoint(0F, -20F, 0F);

		bodyModel[6].addShapeBox(22F, -26F, 4F, 12, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 0F, 0F, 4F); // Core105
		bodyModel[6].setRotationPoint(0F, -20F, 0F);

		bodyModel[7].addShapeBox(6F, -18F, 11F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Core106
		bodyModel[7].setRotationPoint(0F, -20F, 0F);

		bodyModel[8].addShapeBox(-91F, -17F, 2F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, .5F, 0F, .5F, -2F); // Core107
		bodyModel[8].setRotationPoint(0F, -20F, 0F);

		bodyModel[9].addShapeBox(67F, -11F, -5F, 5, 7, 3, 0F,0F, 1.5F, 2F, 0F, 1.5F, 1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -5F, .5F, 0F, -6F, -.2F, 0F, -4.5F, 0F, 0F, -2F, 0F); // Core108
		bodyModel[9].setRotationPoint(0F, -20F, 0F);

		bodyModel[10].addShapeBox(73F, -15.5F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 1F, 0F, -1F, 1F); // Core109
		bodyModel[10].setRotationPoint(0F, -20F, 0F);

		bodyModel[11].addShapeBox(34F, -26F, -2F, 17, 5, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core11
		bodyModel[11].setRotationPoint(0F, -20F, 0F);

		bodyModel[12].addShapeBox(-17.4F, -27.5F, -5F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core111
		bodyModel[12].setRotationPoint(0F, -20F, 0F);
		bodyModel[12].rotateAngleZ = 0.13962634F;

		bodyModel[13].addShapeBox(-15.5F, -8F, -6F, 1, 2, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core112
		bodyModel[13].setRotationPoint(0F, -20F, 0F);
		bodyModel[13].rotateAngleZ = -0.40142573F;

		bodyModel[14].addShapeBox(14F, -26F, 4F, 8, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Core113
		bodyModel[14].setRotationPoint(0F, -20F, 0F);

		bodyModel[15].addShapeBox(22F, -30F, -4F, 12, 3, 8, 0F,0F, .5F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, .5F, -2F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F); // Core114
		bodyModel[15].setRotationPoint(0F, -20F, 0F);

		bodyModel[16].addShapeBox(76F, -15.5F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -2.5F, .5F, 0F, -1F, 1F); // Core115
		bodyModel[16].setRotationPoint(0F, -20F, 0F);

		bodyModel[17].addShapeBox(65F, -24F, -2F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core116
		bodyModel[17].setRotationPoint(0F, -20F, 0F);

		bodyModel[18].addShapeBox(-2F, -23.5F, -5.5F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core117
		bodyModel[18].setRotationPoint(0F, -20F, 0F);

		bodyModel[19].addShapeBox(6F, -20F, -11F, 8, 7, 6, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Core118
		bodyModel[19].setRotationPoint(0F, -20F, 0F);

		bodyModel[20].addShapeBox(-11F, -8.5F, -0.5F, 4, 1, 1, 0F,0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F); // Core119
		bodyModel[20].setRotationPoint(0F, -20F, 0F);

		bodyModel[21].addShapeBox(51F, -24F, -2F, 14, 3, 4, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core12
		bodyModel[21].setRotationPoint(0F, -20F, 0F);

		bodyModel[22].addShapeBox(5F, -15F, -14F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, .5F, 0F, 0F); // Core120
		bodyModel[22].setRotationPoint(0F, -20F, 0F);

		bodyModel[23].addShapeBox(-17.5F, -21.5F, -1.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core121
		bodyModel[23].setRotationPoint(0F, -20F, 0F);
		bodyModel[23].rotateAngleZ = 0.13962634F;

		bodyModel[24].addShapeBox(-91F, -12.5F, 2F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -2F, -2F); // Core122
		bodyModel[24].setRotationPoint(0F, -20F, 0F);

		bodyModel[25].addShapeBox(-15.5F, -8F, -7F, 1, 2, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core123
		bodyModel[25].setRotationPoint(0F, -20F, 0F);
		bodyModel[25].rotateAngleZ = -0.40142573F;

		bodyModel[26].addShapeBox(67F, -23.5F, 2F, 5, 5, 2, 0F,0F, -.4F, -.5F, 0F, -1.5F, -1F, 0F, -2.5F, .5F, 0F, -2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.95F); // Core124
		bodyModel[26].setRotationPoint(0F, -20F, 0F);

		bodyModel[27].addShapeBox(-17.4F, -27.5F, -5F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core126
		bodyModel[27].setRotationPoint(0F, -20F, 0F);
		bodyModel[27].rotateAngleZ = 0.13962634F;

		bodyModel[28].addShapeBox(51F, -18F, 4F, 14, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Core128
		bodyModel[28].setRotationPoint(0F, -20F, 0F);

		bodyModel[29].addShapeBox(7F, -26F, 4F, 7, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 1.5F, 0F, 4F); // Core129
		bodyModel[29].setRotationPoint(0F, -20F, 0F);

		bodyModel[30].addShapeBox(6F, -28F, -2F, 28, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core13
		bodyModel[30].setRotationPoint(0F, -20F, 0F);

		bodyModel[31].addShapeBox(7F, -20F, 11F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Core130
		bodyModel[31].setRotationPoint(0F, -20F, 0F);

		bodyModel[32].addShapeBox(-17.4F, -28F, -3F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core131
		bodyModel[32].setRotationPoint(0F, -20F, 0F);
		bodyModel[32].rotateAngleZ = 0.13962634F;

		bodyModel[33].addShapeBox(67F, -11F, 2F, 5, 7, 3, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 2F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, -6F, -.2F, 0F, -5F, .5F); // Core132
		bodyModel[33].setRotationPoint(0F, -20F, 0F);

		bodyModel[34].addShapeBox(34F, -18F, 5F, 17, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Core135
		bodyModel[34].setRotationPoint(0F, -20F, 0F);

		bodyModel[35].addShapeBox(67F, -18F, -6F, 6, 5, 3, 0F,0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core136
		bodyModel[35].setRotationPoint(0F, -20F, 0F);

		bodyModel[36].addShapeBox(-10.5F, -11F, 4.5F, 3, 1, 3, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core137
		bodyModel[36].setRotationPoint(0F, -20F, 0F);

		bodyModel[37].addShapeBox(8F, -30F, 4F, 6, 4, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -1F, 0F, -1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F); // Core138
		bodyModel[37].setRotationPoint(0F, -20F, 0F);

		bodyModel[38].addShapeBox(-92F, -19F, -2F, 5, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core14
		bodyModel[38].setRotationPoint(1F, -20F, 0F);

		bodyModel[39].addShapeBox(-17.4F, -28F, -3F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core140
		bodyModel[39].setRotationPoint(0F, -20F, 0F);
		bodyModel[39].rotateAngleZ = 0.13962634F;

		bodyModel[40].addShapeBox(14F, -30F, 4F, 8, 4, 3, 0F,0F, 0F, 2F, 0F, -.5F, 2F, 0F, -1.5F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Core142
		bodyModel[40].setRotationPoint(0F, -20F, 0F);

		bodyModel[41].addShapeBox(-10.5F, -12F, 4.5F, 3, 1, 3, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core144
		bodyModel[41].setRotationPoint(0F, -20F, 0F);

		bodyModel[42].addBox(-9.5F, -16F, 5.5F, 1, 4, 1, 0F); // Core145
		bodyModel[42].setRotationPoint(0F, -20F, 0F);

		bodyModel[43].addShapeBox(-13F, -18F, 8F, 19, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core146
		bodyModel[43].setRotationPoint(0F, -20F, 0F);

		bodyModel[44].addShapeBox(67F, -23F, -4F, 6, 5, 2, 0F,0F, -2F, .5F, 0F, -2.5F, .5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core147
		bodyModel[44].setRotationPoint(0F, -20F, 0F);

		bodyModel[45].addShapeBox(22F, -30F, 4F, 12, 4, 3, 0F,0F, -.5F, 2F, 0F, -2F, 2F, 0F, -3.5F, -2F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -.5F, 0F, 0F, 2F); // Core148
		bodyModel[45].setRotationPoint(0F, -20F, 0F);

		bodyModel[46].addShapeBox(-46F, -24F, -5F, 25, 6, 3, 0F,0F, -1.5F, .5F, 0F, 0F, 1.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Core15
		bodyModel[46].setRotationPoint(0F, -20F, 0F);

		bodyModel[47].addShapeBox(-17.4F, -28F, -7F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core150
		bodyModel[47].setRotationPoint(0F, -20F, 0F);
		bodyModel[47].rotateAngleZ = 0.13962634F;

		bodyModel[48].addShapeBox(-9.5F, -17F, 5.5F, 1, 1, 1, 0F,.1F, -.6F, .1F, .1F, -.6F, .1F, .1F, -.6F, .1F, .1F, -.6F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Core152
		bodyModel[48].setRotationPoint(0F, -20F, 0F);

		bodyModel[49].addShapeBox(67F, -22F, -2F, 6, 4, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core153
		bodyModel[49].setRotationPoint(0F, -20F, 0F);

		bodyModel[50].addShapeBox(-17.4F, -28F, -7F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core154
		bodyModel[50].setRotationPoint(0F, -20F, 0F);
		bodyModel[50].rotateAngleZ = 0.13962634F;

		bodyModel[51].addShapeBox(-46F, -11F, 2F, 25, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1.5F, 1.5F, 0F, -3.5F, 1F); // Core156
		bodyModel[51].setRotationPoint(0F, -20F, 0F);

		bodyModel[52].addShapeBox(-67F, -22F, -5F, 21, 4, 3, 0F,0F, -1F, -.5F, 0F, .5F, .5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, .5F, 1.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Core16
		bodyModel[52].setRotationPoint(0F, -20F, 0F);

		bodyModel[53].addShapeBox(-17.4F, -29.5F, -5F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core160
		bodyModel[53].setRotationPoint(0F, -20F, 0F);
		bodyModel[53].rotateAngleZ = 0.13962634F;

		bodyModel[54].addShapeBox(67F, -13F, -4F, 6, 5, 2, 0F,0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .5F, 0F, -2.5F, .5F, 0F, -1F, 0F, 0F, 1F, 0F); // Core161
		bodyModel[54].setRotationPoint(0F, -20F, 0F);

		bodyModel[55].addShapeBox(-21F, -11F, 2F, 8, 11, 3, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3.5F, 1.5F); // Core162
		bodyModel[55].setRotationPoint(0F, -20F, 0F);

		bodyModel[56].addShapeBox(-15F, -16F, 6.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core163
		bodyModel[56].setRotationPoint(0F, -20F, 0F);

		bodyModel[57].addShapeBox(-13F, -11F, 2F, 19, 11, 3, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F); // Core164
		bodyModel[57].setRotationPoint(0F, -20F, 0F);

		bodyModel[58].addShapeBox(67F, -13F, -2F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Core165
		bodyModel[58].setRotationPoint(0F, -20F, 0F);

		bodyModel[59].addShapeBox(-14.5F, -15.5F, 5.5F, 1, 1, 1, 0F,0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Core167
		bodyModel[59].setRotationPoint(0F, -20F, 0F);

		bodyModel[60].addShapeBox(-17.4F, -29.5F, -5F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core169
		bodyModel[60].setRotationPoint(0F, -20F, 0F);
		bodyModel[60].rotateAngleZ = 0.13962634F;

		bodyModel[61].addShapeBox(-86F, -20F, -5F, 19, 2, 3, 0F,0F, -1.5F, -1.5F, 0F, 1F, -.5F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, -.5F, 0F, .5F, 1.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Core17
		bodyModel[61].setRotationPoint(0F, -20F, 0F);

		bodyModel[62].addShapeBox(-17.4F, -30.5F, -7F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core171
		bodyModel[62].setRotationPoint(0F, -20F, 0F);
		bodyModel[62].rotateAngleZ = 0.13962634F;

		bodyModel[63].addShapeBox(-14.5F, -16F, 5.5F, 1, 2, 1, 0F,-.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, 0F, -.1F, 0F, 0F); // Core172
		bodyModel[63].setRotationPoint(0F, -20F, 0F);

		bodyModel[64].addBox(-21F, -8.5F, -7F, 1, 1, 14, 0F); // Core173
		bodyModel[64].setRotationPoint(0F, -20F, 0F);

		bodyModel[65].addShapeBox(6F, -11F, 2F, 28, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 2F, 0F, -3F, 2F); // Core174
		bodyModel[65].setRotationPoint(0F, -20F, 0F);

		bodyModel[66].addBox(-14F, -8.5F, -7F, 1, 1, 14, 0F); // Core175
		bodyModel[66].setRotationPoint(0F, -20F, 0F);

		bodyModel[67].addShapeBox(34F, -11F, 2F, 17, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 2F, 0F, 0F, .5F, 0F, 0F, -2.5F, 1F, 0F, -1.5F, 2F); // Core176
		bodyModel[67].setRotationPoint(0F, -20F, 0F);

		bodyModel[68].addShapeBox(-17.4F, -30.5F, -7F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core177
		bodyModel[68].setRotationPoint(0F, -20F, 0F);
		bodyModel[68].rotateAngleZ = 0.13962634F;

		bodyModel[69].addShapeBox(-14.5F, -15.5F, 5.5F, 1, 1, 1, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Core178
		bodyModel[69].setRotationPoint(0F, -20F, 0F);

		bodyModel[70].addShapeBox(-17.4F, -30.1F, -2.8F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core179
		bodyModel[70].setRotationPoint(0F, -20F, 0F);
		bodyModel[70].rotateAngleZ = 0.13962634F;

		bodyModel[71].addShapeBox(-86F, -11F, -5F, 19, 1, 3, 0F,0F, 1.5F, -.5F, 0F, .5F, 1.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, -1.5F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, -.5F, 0F); // Core18
		bodyModel[71].setRotationPoint(0F, -20F, 0F);

		bodyModel[72].addShapeBox(-14.5F, -15.5F, 4.5F, 1, 1, 1, 0F,0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Core180
		bodyModel[72].setRotationPoint(0F, -20F, 0F);

		bodyModel[73].addBox(-13F, -8.5F, -3F, 17, 1, 1, 0F); // Core181
		bodyModel[73].setRotationPoint(0F, -20F, 0F);

		bodyModel[74].addShapeBox(51F, -11F, 2F, 14, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -3F, .5F, 0F, -.5F, 1F); // Core182
		bodyModel[74].setRotationPoint(0F, -20F, 0F);

		bodyModel[75].addShapeBox(76F, -20.5F, 0F, 7, 5, 2, 0F,0F, .5F, 0F, 0F, -1F, 0F, 0F, -2.5F, .5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F); // Core183
		bodyModel[75].setRotationPoint(0F, -20F, 0F);

		bodyModel[76].addShapeBox(14F, -15F, -14F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, .5F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -1F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F); // Core184
		bodyModel[76].setRotationPoint(0F, -20F, 0F);

		bodyModel[77].addShapeBox(-21F, -24F, 4F, 8, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Core185
		bodyModel[77].setRotationPoint(0F, -20F, 0F);

		bodyModel[78].addShapeBox(35F, -20.5F, -11F, 5, 2, 4, 0F,-.7F, -.5F, -1F, 0F, -1.5F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F); // Core186
		bodyModel[78].setRotationPoint(0F, -20F, 0F);

		bodyModel[79].addShapeBox(4F, -13F, -7F, 10, 11, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 2F, 0F, 0F); // Core188
		bodyModel[79].setRotationPoint(0F, -20F, 0F);

		bodyModel[80].addShapeBox(-21F, -26F, 2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, -2F, .85F, 0F, -2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, .85F, 0F, 0F, .5F); // Core189
		bodyModel[80].setRotationPoint(0F, -20F, 0F);

		bodyModel[81].addShapeBox(-86F, -18F, -5F, 19, 7, 3, 0F,0F, -1F, -.5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -.5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Core19
		bodyModel[81].setRotationPoint(0F, -20F, 0F);

		bodyModel[82].addShapeBox(-3F, -21.5F, -5.5F, 3, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core190
		bodyModel[82].setRotationPoint(0F, -20F, 0F);

		bodyModel[83].addShapeBox(-17.4F, -30.1F, -2.8F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core191
		bodyModel[83].setRotationPoint(0F, -20F, 0F);
		bodyModel[83].rotateAngleZ = 0.13962634F;

		bodyModel[84].addShapeBox(-14.5F, -16F, 4.5F, 1, 2, 1, 0F,-.1F, 0F, -.6F, -.1F, 0F, -.6F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, -.6F, -.1F, 0F, -.6F, -.1F, 0F, 0F, -.1F, 0F, 0F); // Core192
		bodyModel[84].setRotationPoint(0F, -20F, 0F);

		bodyModel[85].addBox(-13F, -8.5F, 2F, 17, 1, 1, 0F); // Core193
		bodyModel[85].setRotationPoint(0F, -20F, 0F);

		bodyModel[86].addShapeBox(-10F, -19F, 6.5F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core194
		bodyModel[86].setRotationPoint(0F, -20F, 0F);

		bodyModel[87].addShapeBox(-17.4F, -28F, -1F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core195
		bodyModel[87].setRotationPoint(0F, -20F, 0F);
		bodyModel[87].rotateAngleZ = 0.13962634F;

		bodyModel[88].addBox(-20F, -7.5F, -6F, 12, 1, 11, 0F); // Core196
		bodyModel[88].setRotationPoint(0F, -20F, 0F);

		bodyModel[89].addShapeBox(-14F, -12F, 14.5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core197
		bodyModel[89].setRotationPoint(0F, -20F, 0F);
		bodyModel[89].rotateAngleX = 0.55850536F;

		bodyModel[90].addBox(-23F, -15.5F, -5F, 2, 1, 10, 0F); // Core198
		bodyModel[90].setRotationPoint(0F, -20F, 0F);

		bodyModel[91].addShapeBox(-17.4F, -28F, -1F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core199
		bodyModel[91].setRotationPoint(0F, -20F, 0F);
		bodyModel[91].rotateAngleZ = 0.13962634F;

		bodyModel[92].addShapeBox(-21F, -26F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core2
		bodyModel[92].setRotationPoint(0F, -20F, 0F);

		bodyModel[93].addShapeBox(-21F, -26F, -6F, 1, 2, 4, 0F,0F, -2F, .5F, 5F, -2F, .85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 5F, 0F, .85F, 0F, 0F, 0F, 0F, 0F, 0F); // Core20
		bodyModel[93].setRotationPoint(0F, -20F, 0F);

		bodyModel[94].addShapeBox(-17.4F, -28F, 1F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core200
		bodyModel[94].setRotationPoint(0F, -20F, 0F);
		bodyModel[94].rotateAngleZ = 0.13962634F;

		bodyModel[95].addBox(-23F, -17.5F, -5F, 1, 9, 10, 0F); // Core201
		bodyModel[95].setRotationPoint(0F, -22F, 0F);

		bodyModel[96].addShapeBox(5F, -32F, -4F, 1, 5, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Core202
		bodyModel[96].setRotationPoint(0F, -20F, 0F);

		bodyModel[97].addShapeBox(-17.4F, -28F, 1F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core203
		bodyModel[97].setRotationPoint(0F, -20F, 0F);
		bodyModel[97].rotateAngleZ = 0.13962634F;

		bodyModel[98].addShapeBox(67F, -23F, 2F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, .5F, 0F, -2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.5F); // Core204
		bodyModel[98].setRotationPoint(0F, -20F, 0F);

		bodyModel[99].addShapeBox(5F, -32F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core205
		bodyModel[99].setRotationPoint(0F, -20F, 0F);

		bodyModel[100].addBox(-21.5F, -15.7F, -2F, 1, 2, 2, 0F); // Core206
		bodyModel[100].setRotationPoint(0F, -20F, 0F);

		bodyModel[101].addShapeBox(-17.4F, -26F, 1F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core207
		bodyModel[101].setRotationPoint(0F, -20F, 0F);
		bodyModel[101].rotateAngleZ = 0.13962634F;

		bodyModel[102].addShapeBox(67F, -18F, 3F, 6, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Core208
		bodyModel[102].setRotationPoint(0F, -20F, 0F);

		bodyModel[103].addShapeBox(5F, -27F, -5F, 1, 3, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core209
		bodyModel[103].setRotationPoint(0F, -20F, 0F);

		bodyModel[104].addBox(-10F, -11.5F, -5.5F, 10, 3, 11, 0F); // Core21
		bodyModel[104].setRotationPoint(0F, -20F, 0F);

		bodyModel[105].addShapeBox(-17.4F, -26F, 1F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core210
		bodyModel[105].setRotationPoint(0F, -20F, 0F);
		bodyModel[105].rotateAngleZ = 0.13962634F;

		bodyModel[106].addBox(-20.5F, -15.2F, -1.5F, 1, 1, 1, 0F); // Core211
		bodyModel[106].setRotationPoint(0F, -20F, 0F);

		bodyModel[107].addShapeBox(67F, -13F, 2F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2.5F, .5F, 0F, -1F, .5F); // Core212
		bodyModel[107].setRotationPoint(0F, -20F, 0F);

		bodyModel[108].addShapeBox(-19.5F, -15.2F, -1.5F, 1, 1, 1, 0F,0F, .1F, .1F, -.5F, .1F, .1F, -.5F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, -.5F, .1F, .1F, -.5F, .1F, .1F, 0F, .1F, .1F); // Core213
		bodyModel[108].setRotationPoint(0F, -20F, 0F);

		bodyModel[109].addShapeBox(-17.4F, -26F, -11F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core215
		bodyModel[109].setRotationPoint(0F, -20F, 0F);
		bodyModel[109].rotateAngleZ = 0.13962634F;

		bodyModel[110].addShapeBox(5F, -27F, 4F, 1, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Core216
		bodyModel[110].setRotationPoint(0F, -20F, 0F);

		bodyModel[111].addShapeBox(-17.4F, -26F, -11F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core217
		bodyModel[111].setRotationPoint(0F, -20F, 0F);
		bodyModel[111].rotateAngleZ = 0.13962634F;

		bodyModel[112].addShapeBox(-19.5F, -15.2F, 1F, 1, 1, 1, 0F,0F, .1F, .1F, -.5F, .1F, .1F, -.5F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, -.5F, .1F, .1F, -.5F, .1F, .1F, 0F, .1F, .1F); // Core218
		bodyModel[112].setRotationPoint(0F, -20F, 0F);

		bodyModel[113].addShapeBox(35F, -20.5F, 7F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -3F, -.7F, -.5F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, -1F, 0F, 0F); // Core219
		bodyModel[113].setRotationPoint(0F, -20F, 0F);

		bodyModel[114].addShapeBox(65F, -21F, -5F, 2, 3, 3, 0F,0F, 1F, -.5F, 0F, .5F, -.5F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core22
		bodyModel[114].setRotationPoint(0F, -20F, 0F);

		bodyModel[115].addShapeBox(35F, -18.5F, 7F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -1F, 0F, 0F); // Core220
		bodyModel[115].setRotationPoint(0F, -20F, 0F);

		bodyModel[116].addShapeBox(-17.4F, -28F, -11F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core221
		bodyModel[116].setRotationPoint(0F, -20F, 0F);
		bodyModel[116].rotateAngleZ = 0.13962634F;

		bodyModel[117].addShapeBox(5F, -32F, -1F, 1, 5, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Core222
		bodyModel[117].setRotationPoint(0F, -20F, 0F);

		bodyModel[118].addBox(-20.5F, -15.2F, 1F, 1, 1, 1, 0F); // Core223
		bodyModel[118].setRotationPoint(0F, -20F, 0F);

		bodyModel[119].addShapeBox(65F, -18F, -7F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Core224
		bodyModel[119].setRotationPoint(0F, -20F, 0F);

		bodyModel[120].addShapeBox(0F, -25.5F, -5.5F, 1, 2, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core225
		bodyModel[120].setRotationPoint(0F, -20F, 0F);

		bodyModel[121].addShapeBox(14F, -20F, -14F, 8, 2, 3, 0F,0F, -.5F, -1F, 0F, -1F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F); // Core227
		bodyModel[121].setRotationPoint(0F, -20F, 0F);

		bodyModel[122].addShapeBox(-17.5F, -21.5F, -7F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core228
		bodyModel[122].setRotationPoint(0F, -20F, 0F);
		bodyModel[122].rotateAngleZ = 0.13962634F;

		bodyModel[123].addShapeBox(83F, -18.5F, -1F, 4, 3, 1, 0F,0F, -.5F, 1.5F, 0F, -1.5F, .5F, 0F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Core229
		bodyModel[123].setRotationPoint(0F, -20F, 0F);

		bodyModel[124].addShapeBox(6F, -18F, -14F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Core23
		bodyModel[124].setRotationPoint(0F, -20F, 0F);

		bodyModel[125].addShapeBox(14F, -30F, -7F, 8, 4, 3, 0F,0F, -1F, -1F, 0F, -1.5F, -1.5F, 0F, -.5F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core230
		bodyModel[125].setRotationPoint(0F, -20F, 0F);

		bodyModel[126].addShapeBox(-46F, -24F, 2F, 25, 6, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1.5F, 0F, -1.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F); // Core231
		bodyModel[126].setRotationPoint(0F, -20F, 0F);

		bodyModel[127].addShapeBox(35F, -18.5F, -11F, 5, 4, 4, 0F,-1F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Core232
		bodyModel[127].setRotationPoint(0F, -20F, 0F);

		bodyModel[128].addShapeBox(-4F, -33F, -4F, 1, 5, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Core233
		bodyModel[128].setRotationPoint(0F, -20F, 0F);

		bodyModel[129].addBox(-21.5F, -15.7F, 0.5F, 1, 2, 2, 0F); // Core234
		bodyModel[129].setRotationPoint(0F, -20F, 0F);

		bodyModel[130].addShapeBox(-17.4F, -28F, -11F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core235
		bodyModel[130].setRotationPoint(0F, -20F, 0F);
		bodyModel[130].rotateAngleZ = 0.13962634F;

		bodyModel[131].addShapeBox(35F, -14.5F, 7F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -3F, -.7F, -.5F, -1F); // Core236
		bodyModel[131].setRotationPoint(0F, -20F, 0F);

		bodyModel[132].addShapeBox(-4F, -28F, -5F, 1, 4, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core237
		bodyModel[132].setRotationPoint(0F, -20F, 0F);

		bodyModel[133].addShapeBox(-17.4F, -28F, -9F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core238
		bodyModel[133].setRotationPoint(0F, -20F, 0F);
		bodyModel[133].rotateAngleZ = 0.13962634F;

		bodyModel[134].addShapeBox(-17.4F, -28F, -9F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core239
		bodyModel[134].setRotationPoint(0F, -20F, 0F);
		bodyModel[134].rotateAngleZ = 0.13962634F;

		bodyModel[135].addShapeBox(-17.5F, -26.5F, 3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Core24
		bodyModel[135].setRotationPoint(0F, -20F, 0F);
		bodyModel[135].rotateAngleZ = 0.13962634F;

		bodyModel[136].addShapeBox(-4F, -33F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core240
		bodyModel[136].setRotationPoint(0F, -20F, 0F);

		bodyModel[137].addShapeBox(-4F, -33F, -1F, 1, 5, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Core241
		bodyModel[137].setRotationPoint(0F, -20F, 0F);

		bodyModel[138].addShapeBox(-17.4F, -25.5F, -9F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core242
		bodyModel[138].setRotationPoint(0F, -20F, 0F);
		bodyModel[138].rotateAngleZ = 0.13962634F;

		bodyModel[139].addShapeBox(-17.4F, -25.5F, -9F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core243
		bodyModel[139].setRotationPoint(0F, -20F, 0F);
		bodyModel[139].rotateAngleZ = 0.13962634F;

		bodyModel[140].addShapeBox(-4F, -28F, 4F, 1, 4, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Core244
		bodyModel[140].setRotationPoint(0F, -20F, 0F);

		bodyModel[141].addShapeBox(-15F, -27F, -5F, 1, 3, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core245
		bodyModel[141].setRotationPoint(0F, -20F, 0F);

		bodyModel[142].addBox(-17.4F, -20.5F, 3.5F, 1, 3, 1, 0F); // Core246
		bodyModel[142].setRotationPoint(0F, -21F, 0F);
		bodyModel[142].rotateAngleZ = 0.13962634F;

		bodyModel[143].addShapeBox(-15F, -32F, -4F, 1, 5, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Core247
		bodyModel[143].setRotationPoint(0F, -20F, 0F);

		bodyModel[144].addShapeBox(-15F, -27F, 4F, 1, 3, 1, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Core248
		bodyModel[144].setRotationPoint(0F, -20F, 0F);

		bodyModel[145].addShapeBox(-17.4F, -25.4F, -1F, 1, 1, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F); // Core249
		bodyModel[145].setRotationPoint(0F, -21F, 0F);
		bodyModel[145].rotateAngleZ = 0.13962634F;

		bodyModel[146].addShapeBox(6F, -28F, 2F, 2, 4, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, .1F, 0F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2F); // Core25
		bodyModel[146].setRotationPoint(0F, -20F, 0F);

		bodyModel[147].addShapeBox(-15F, -32F, -1F, 1, 5, 5, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Core250
		bodyModel[147].setRotationPoint(0F, -20F, 0F);

		bodyModel[148].addShapeBox(-17.4F, -25.4F, 0F, 1, 1, 1, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core251
		bodyModel[148].setRotationPoint(0F, -21F, 0F);
		bodyModel[148].rotateAngleZ = 0.13962634F;

		bodyModel[149].addShapeBox(-15F, -32F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core252
		bodyModel[149].setRotationPoint(0F, -20F, 0F);

		bodyModel[150].addShapeBox(-17.4F, -19.5F, -7F, 1, 3, 3, 0F,0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F); // Core253
		bodyModel[150].setRotationPoint(0F, -21F, 0F);
		bodyModel[150].rotateAngleZ = 0.13962634F;

		bodyModel[151].addShapeBox(-67F, -22F, 2F, 21, 4, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, .5F, .5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, .5F, 1.5F); // Core254
		bodyModel[151].setRotationPoint(0F, -20F, 0F);

		bodyModel[152].addShapeBox(65F, -11F, -5F, 2, 7, 3, 0F,0F, 0F, 2F, 0F, 1.5F, 2F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -3F, .5F, 0F, -5F, .5F, 0F, -2F, 0F, 0F, 0F, 0F); // Core255
		bodyModel[152].setRotationPoint(0F, -20F, 0F);

		bodyModel[153].addShapeBox(35F, -14.5F, -11F, 5, 2, 4, 0F,-1F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, -.7F, -.5F, -1F, 0F, -1.5F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Core256
		bodyModel[153].setRotationPoint(0F, -20F, 0F);

		bodyModel[154].addShapeBox(-17.5F, -21.5F, 3F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core257
		bodyModel[154].setRotationPoint(0F, -20F, 0F);
		bodyModel[154].rotateAngleZ = 0.13962634F;

		bodyModel[155].addShapeBox(14F, -18F, -14F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F); // Core258
		bodyModel[155].setRotationPoint(0F, -20F, 0F);

		bodyModel[156].addShapeBox(14F, -26F, -7F, 8, 6, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Core259
		bodyModel[156].setRotationPoint(0F, -20F, 0F);

		bodyModel[157].addShapeBox(76F, -15.5F, -2F, 7, 5, 2, 0F,0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -2.5F, .5F, 0F, -1F, 0F, 0F, .5F, 0F); // Core26
		bodyModel[157].setRotationPoint(0F, -20F, 0F);

		bodyModel[158].addShapeBox(-4F, -15.5F, -5.5F, 4, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core261
		bodyModel[158].setRotationPoint(0F, -20F, 0F);

		bodyModel[159].addShapeBox(83F, -15.5F, -1F, 4, 3, 1, 0F,0F, 0F, 3F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -1.5F, .5F, 0F, -.5F, 0F, 0F, 1F, 0F); // Core262
		bodyModel[159].setRotationPoint(0F, -20F, 0F);

		bodyModel[160].addShapeBox(-14F, -32F, -3F, 10, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, .3F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, .4F, 0F, 0F, -.4F, 0F, 0F, 1F); // Core263
		bodyModel[160].setRotationPoint(0F, -20F, 0F);

		bodyModel[161].addShapeBox(-21F, -18F, -8F, 26, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core264
		bodyModel[161].setRotationPoint(0F, -20F, 0F);

		bodyModel[162].addShapeBox(-16F, -32F, -2F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Core265
		bodyModel[162].setRotationPoint(0F, -20F, 0F);

		bodyModel[163].addShapeBox(6F, -24F, -5F, 28, 6, 3, 0F,0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Core266
		bodyModel[163].setRotationPoint(0F, -20F, 0F);

		bodyModel[164].addShapeBox(-21F, -32F, -2F, 1, 7, 1, 0F,-5F, -.5F, 0F, 4F, -1.5F, 0F, 4F, -1.5F, 0F, -5F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core267
		bodyModel[164].setRotationPoint(0F, -20F, 0F);

		bodyModel[165].addShapeBox(34F, -23F, -5F, 17, 5, 3, 0F,0F, 1F, 1.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Core268
		bodyModel[165].setRotationPoint(0F, -20F, 0F);

		bodyModel[166].addShapeBox(-3F, -32F, -3F, 8, 1, 1, 0F,0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, .3F, 0F, 0F, .4F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.4F); // Core269
		bodyModel[166].setRotationPoint(0F, -20F, 0F);

		bodyModel[167].addShapeBox(8F, -30F, -7F, 6, 4, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F); // Core27
		bodyModel[167].setRotationPoint(0F, -20F, 0F);

		bodyModel[168].addShapeBox(-21F, -18F, 7F, 26, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core270
		bodyModel[168].setRotationPoint(0F, -20F, 0F);

		bodyModel[169].addShapeBox(-14F, -32F, 2F, 10, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, .3F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -.4F, 0F, 0F, .4F, 0F, 0F, -.5F); // Core271
		bodyModel[169].setRotationPoint(0F, -20F, 0F);

		bodyModel[170].addShapeBox(51F, -21F, -5F, 14, 3, 3, 0F,0F, 2F, .5F, 0F, 1F, -.5F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core272
		bodyModel[170].setRotationPoint(0F, -20F, 0F);

		bodyModel[171].addShapeBox(-3F, -32F, 2F, 8, 1, 1, 0F,0F, 0F, .3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, .4F); // Core273
		bodyModel[171].setRotationPoint(0F, -20F, 0F);

		bodyModel[172].addShapeBox(-67F, -18F, -7F, 21, 7, 3, 0F,0F, -.5F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core274
		bodyModel[172].setRotationPoint(0F, -20F, 0F);

		bodyModel[173].addShapeBox(-46F, -18F, -9F, 25, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core275
		bodyModel[173].setRotationPoint(0F, -20F, 0F);

		bodyModel[174].addShapeBox(-21F, -32F, 1F, 1, 7, 1, 0F,-5F, -.5F, 0F, 4F, -1.5F, 0F, 4F, -1.5F, 0F, -5F, -.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Core276
		bodyModel[174].setRotationPoint(0F, -20F, 0F);

		bodyModel[175].addShapeBox(-16F, -32F, 1F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Core278
		bodyModel[175].setRotationPoint(0F, -20F, 0F);

		bodyModel[176].addShapeBox(34F, -18F, -8F, 17, 7, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core279
		bodyModel[176].setRotationPoint(0F, -20F, 0F);

		bodyModel[177].addShapeBox(6F, -32F, -4F, 8, 5, 8, 0F,0F, 0F, -2F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Core28
		bodyModel[177].setRotationPoint(0F, -20F, 0F);

		bodyModel[178].addShapeBox(51F, -18F, -7F, 14, 7, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core280
		bodyModel[178].setRotationPoint(0F, -20F, 0F);

		bodyModel[179].addShapeBox(-17F, -31F, -1.5F, 1, 1, 3, 0F,-.3F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.3F, -.5F, 0F, -.3F, .3F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, -.3F, .3F, 0F); // Core281
		bodyModel[179].setRotationPoint(0F, -20F, 0F);

		bodyModel[180].addShapeBox(14F, -20F, -11F, 8, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core282
		bodyModel[180].setRotationPoint(0F, -20F, 0F);

		bodyModel[181].addShapeBox(-9.5F, -12F, -4.5F, 9, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core283
		bodyModel[181].setRotationPoint(0F, -20F, 0F);

		bodyModel[182].addShapeBox(-86F, -20F, 2F, 19, 2, 3, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 1F, -.5F, 0F, -1.5F, -1.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .5F, 1.5F, 0F, 1F, -.5F); // Core284
		bodyModel[182].setRotationPoint(0F, -20F, 0F);

		bodyModel[183].addShapeBox(22F, -15.5F, -14F, 12, 2, 3, 0F,0F, 0F, -.5F, -1F, 1F, -3.5F, 0F, .5F, 2F, 0F, 0F, 0F, 0F, -.5F, -1.5F, -2F, -2F, -3.5F, -1F, -1.5F, 2F, 0F, 0F, 0F); // Core285
		bodyModel[183].setRotationPoint(0F, -20F, 0F);

		bodyModel[184].addShapeBox(87F, -18.5F, -1F, 2, 3, 1, 0F,0F, -1.5F, .5F, -.7F, -2.5F, -.5F, -.5F, -2.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1.5F, -.5F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F); // Core287
		bodyModel[184].setRotationPoint(0F, -20F, 0F);

		bodyModel[185].addShapeBox(65F, -11F, -2F, 2, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Core288
		bodyModel[185].setRotationPoint(0F, -20F, 0F);

		bodyModel[186].addShapeBox(51F, -11F, -5F, 14, 7, 3, 0F,0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, -3F, .5F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Core289
		bodyModel[186].setRotationPoint(0F, -20F, 0F);

		bodyModel[187].addShapeBox(34F, -11F, -5F, 17, 9, 3, 0F,0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, 0F, -2.5F, 1F, 0F, .5F, 0F, 0F, 2F, 0F); // Core290
		bodyModel[187].setRotationPoint(0F, -20F, 0F);

		bodyModel[188].addShapeBox(6F, -11F, -5F, 28, 11, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core291
		bodyModel[188].setRotationPoint(0F, -20F, 0F);

		bodyModel[189].addShapeBox(-3F, -33F, -4F, 8, 5, 8, 0F,0F, 0F, -2.1F, 0F, -1F, -2.1F, 0F, -1F, -2.1F, 0F, 0F, -2.1F, 0F, 0F, 1.5F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, 1.5F); // Core296
		bodyModel[189].setRotationPoint(0F, -20F, 0F);

		bodyModel[190].addShapeBox(-3F, -28F, -5.5F, 8, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.5F); // Core296
		bodyModel[190].setRotationPoint(0F, -20F, 0F);

		bodyModel[191].addShapeBox(-46F, -11F, -5F, 25, 9, 3, 0F,0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 1F, 0F, -1.5F, 1.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Core294
		bodyModel[191].setRotationPoint(0F, -20F, 0F);

		bodyModel[192].addShapeBox(-67F, -11F, -5F, 21, 5, 3, 0F,0F, .5F, 1.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, .5F, 1F, 0F, 4F, 0F, 0F, 0F, 0F); // Core295
		bodyModel[192].setRotationPoint(0F, -20F, 0F);

		bodyModel[193].addShapeBox(-14F, -33F, -4F, 10, 5, 8, 0F,0F, -1F, -2.5F, 0F, 0F, -2.1F, 0F, 0F, -2.1F, 0F, -1F, -2.5F, 0F, 0F, -.1F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -.1F); // Core296
		bodyModel[193].setRotationPoint(0F, -20F, 0F);

		bodyModel[194].addShapeBox(6F, -28F, -5F, 2, 4, 3, 0F,0F, -1F, .5F, 0F, -1F, .1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Core297
		bodyModel[194].setRotationPoint(0F, -20F, 0F);

		bodyModel[195].addShapeBox(-21F, -11F, -5F, 8, 11, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3.5F, 1.5F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core298
		bodyModel[195].setRotationPoint(0F, -20F, 0F);

		bodyModel[196].addShapeBox(-21F, -18F, -9F, 8, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core299
		bodyModel[196].setRotationPoint(0F, -20F, 0F);

		bodyModel[197].addShapeBox(-46F, -11F, -2F, 25, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Core3
		bodyModel[197].setRotationPoint(0F, -20F, 0F);

		bodyModel[198].addShapeBox(34F, -26F, -5F, 17, 2, 3, 0F,0F, .5F, 0F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1.5F, 0F, 1F, .5F, 0F, 1F, 0F, 0F, 0F, 0F); // Core30
		bodyModel[198].setRotationPoint(0F, -20F, 0F);

		bodyModel[199].addShapeBox(-19F, -32F, -4F, 4, 5, 8, 0F,-3.2F, -.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -3.2F, -.5F, -2F, .3F, 0F, -2F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, .3F, 0F, -2F); // Core296
		bodyModel[199].setRotationPoint(0F, -20F, 0F);

		bodyModel[200].addShapeBox(-21F, -24F, -5F, 8, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Core301
		bodyModel[200].setRotationPoint(0F, -20F, 0F);

		bodyModel[201].addShapeBox(-19F, -27F, -5F, 4, 3, 10, 0F,.3F, 0F, -3F, 0F, 0F, .3F, 0F, 0F, .3F, .3F, 0F, -3F, 1.1F, -2F, -3F, 0F, .5F, 2F, 0F, .5F, 2F, 1.1F, -2F, -3F); // Core296
		bodyModel[201].setRotationPoint(0F, -20F, 0F);

		bodyModel[202].addShapeBox(-13F, -24F, -5F, 19, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Core303
		bodyModel[202].setRotationPoint(0F, -20F, 0F);

		bodyModel[203].addShapeBox(-86F, -18F, 2F, 19, 7, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -1F, -.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -1.5F, -.5F); // Core304
		bodyModel[203].setRotationPoint(0F, -20F, 0F);

		bodyModel[204].addShapeBox(-17.5F, -23.5F, 3F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core305
		bodyModel[204].setRotationPoint(0F, -20F, 0F);
		bodyModel[204].rotateAngleZ = 0.13962634F;

		bodyModel[205].addShapeBox(14F, -13F, -7F, 8, 11, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core307
		bodyModel[205].setRotationPoint(0F, -20F, 0F);

		bodyModel[206].addShapeBox(87F, -15.5F, -1F, 2, 3, 1, 0F,0F, 0F, 1.5F, -.5F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, -.7F, -2.5F, -.5F, -.5F, -2.5F, 0F, 0F, -.5F, 0F); // Core308
		bodyModel[206].setRotationPoint(0F, -20F, 0F);

		bodyModel[207].addShapeBox(22F, -19.5F, -14F, 12, 2, 3, 0F,0F, -.5F, -1.5F, -2F, -2F, -4F, -1F, -1.5F, 2F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 1F, -3.5F, 0F, .5F, 2F, 0F, 0F, 0F); // Core309
		bodyModel[207].setRotationPoint(0F, -20F, 0F);

		bodyModel[208].addShapeBox(7F, -26F, -7F, 7, 6, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Core31
		bodyModel[208].setRotationPoint(0F, -20F, 0F);

		bodyModel[209].addShapeBox(-6F, -13.5F, -5.5F, 6, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core310
		bodyModel[209].setRotationPoint(0F, -20F, 0F);

		bodyModel[210].addShapeBox(-13F, -18F, -9F, 19, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core311
		bodyModel[210].setRotationPoint(0F, -20F, 0F);

		bodyModel[211].addShapeBox(-13F, -11F, -5F, 19, 11, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core312
		bodyModel[211].setRotationPoint(0F, -20F, 0F);

		bodyModel[212].addShapeBox(22F, -26F, -7F, 12, 6, 3, 0F,0F, 0F, 2F, 0F, -2F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F); // Core313
		bodyModel[212].setRotationPoint(0F, -20F, 0F);

		bodyModel[213].addShapeBox(-86F, -11F, 2F, 19, 1, 3, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, .5F, 1.5F, 0F, 1.5F, -.5F, 0F, -.5F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, -1F, -1.5F); // Core314
		bodyModel[213].setRotationPoint(0F, -20F, 0F);

		bodyModel[214].addShapeBox(22F, -17.5F, -14F, 12, 2, 5, 0F,0F, 0F, -.5F, -1F, -1F, -3.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, -1F, -3.5F, 0F, -.5F, 0F, 0F, 0F, 0F); // Core315
		bodyModel[214].setRotationPoint(0F, -20F, 0F);

		bodyModel[215].addShapeBox(-13F, -17F, -7.5F, 3, 2, 3, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core316
		bodyModel[215].setRotationPoint(0F, -20F, 0F);

		bodyModel[216].addShapeBox(-6F, -13.5F, 4.5F, 6, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core317
		bodyModel[216].setRotationPoint(0F, -20F, 0F);

		bodyModel[217].addShapeBox(-17.5F, -26.5F, -4F, 1, 3, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Core318
		bodyModel[217].setRotationPoint(0F, -20F, 0F);
		bodyModel[217].rotateAngleZ = 0.13962634F;

		bodyModel[218].addShapeBox(-91F, -12.5F, -2F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Core319
		bodyModel[218].setRotationPoint(0F, -20F, 0F);

		bodyModel[219].addShapeBox(76F, -20.5F, -2F, 7, 5, 2, 0F,0F, -1F, 1F, 0F, -2.5F, .5F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Core32
		bodyModel[219].setRotationPoint(0F, -20F, 0F);

		bodyModel[220].addShapeBox(22F, -30F, -7F, 12, 4, 3, 0F,0F, -1.5F, -1.5F, 0F, -3.5F, -2F, 0F, -2F, 2F, 0F, -.5F, 2F, 0F, 0F, 2F, 0F, 2F, -.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Core320
		bodyModel[220].setRotationPoint(0F, -20F, 0F);

		bodyModel[221].addShapeBox(-13F, -18F, -7.5F, 3, 1, 3, 0F,-.2F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -.2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core322
		bodyModel[221].setRotationPoint(0F, -20F, 0F);

		bodyModel[222].addShapeBox(-67F, -11F, 2F, 21, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, .5F, 1.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, .5F, 1F, 0F, -2F, 0F); // Core323
		bodyModel[222].setRotationPoint(0F, -20F, 0F);

		bodyModel[223].addShapeBox(-4F, -15.5F, 4.5F, 4, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core324
		bodyModel[223].setRotationPoint(0F, -20F, 0F);

		bodyModel[224].addShapeBox(-87F, -12.5F, -0.5F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F); // Core325
		bodyModel[224].setRotationPoint(0F, -20F, 0F);

		bodyModel[225].addShapeBox(-14F, -0.5F, 1.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F); // Core326
		bodyModel[225].setRotationPoint(0F, -20F, 0F);

		bodyModel[226].addShapeBox(-14F, -28F, -5.5F, 10, 4, 11, 0F,0F, 0F, -1.6F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F); // Core296
		bodyModel[226].setRotationPoint(0F, -20F, 0F);

		bodyModel[227].addShapeBox(-18.7F, -27F, 0F, 1, 1, 1, 0F,-.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F); // Core328
		bodyModel[227].setRotationPoint(0F, -20F, 0F);

		bodyModel[228].addShapeBox(-25F, -25.5F, -4F, 1, 8, 8, 0F,-.4F, -3.55F, -3.55F, -.4F, -3.55F, -3.55F, -.4F, -3.55F, -3.55F, -.4F, -3.55F, -3.55F, -.4F, -3.55F, -3.55F, -.4F, -3.55F, -3.55F, -.4F, -3.55F, -3.55F, -.4F, -3.55F, -3.55F); // Core329
		bodyModel[228].setRotationPoint(0F, -20F, 0F);
		bodyModel[228].rotateAngleZ = -0.26179939F;

		bodyModel[229].addShapeBox(51F, -24F, -5F, 14, 1, 3, 0F,0F, 0F, -.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, .5F, 0F, 1F, -.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Core33
		bodyModel[229].setRotationPoint(0F, -20F, 0F);

		bodyModel[230].addShapeBox(-20F, -25.5F, -0.5F, 1, 1, 1, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core330
		bodyModel[230].setRotationPoint(0F, -20F, 0F);

		bodyModel[231].addBox(3F, -24.2F, -4.5F, 2, 8, 2, 0F); // Core331
		bodyModel[231].setRotationPoint(0F, -20F, 0F);

		bodyModel[232].addShapeBox(3F, -25.2F, -4.5F, 2, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core332
		bodyModel[232].setRotationPoint(0F, -20F, 0F);

		bodyModel[233].addShapeBox(3.5F, -26.2F, -4F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core333
		bodyModel[233].setRotationPoint(0F, -20F, 0F);

		bodyModel[234].addShapeBox(3.5F, -26.7F, -4F, 1, 1, 1, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core334
		bodyModel[234].setRotationPoint(0F, -20F, 0F);

		bodyModel[235].addShapeBox(2.5F, -26.2F, -4F, 2, 1, 1, 0F,-.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F); // Core335
		bodyModel[235].setRotationPoint(0F, -20F, 0F);

		bodyModel[236].addShapeBox(2.5F, -26.2F, -1.7F, 2, 1, 1, 0F,-.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F); // Core336
		bodyModel[236].setRotationPoint(0F, -20F, 0F);

		bodyModel[237].addShapeBox(3.5F, -26.7F, -1.7F, 1, 1, 1, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core337
		bodyModel[237].setRotationPoint(0F, -20F, 0F);

		bodyModel[238].addShapeBox(3.5F, -26.2F, -1.7F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core338
		bodyModel[238].setRotationPoint(0F, -20F, 0F);

		bodyModel[239].addShapeBox(3F, -25.2F, -2.2F, 2, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core339
		bodyModel[239].setRotationPoint(0F, -20F, 0F);

		bodyModel[240].addShapeBox(7F, -20F, -14F, 7, 2, 3, 0F,0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Core34
		bodyModel[240].setRotationPoint(0F, -20F, 0F);

		bodyModel[241].addBox(3F, -24.2F, -2.2F, 2, 8, 2, 0F); // Core340
		bodyModel[241].setRotationPoint(0F, -20F, 0F);

		bodyModel[242].addShapeBox(2.5F, -26.2F, 0.7F, 2, 1, 1, 0F,-.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F); // Core341
		bodyModel[242].setRotationPoint(0F, -20F, 0F);

		bodyModel[243].addShapeBox(3.5F, -26.7F, 0.7F, 1, 1, 1, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core342
		bodyModel[243].setRotationPoint(0F, -20F, 0F);

		bodyModel[244].addShapeBox(3.5F, -26.2F, 0.7F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core343
		bodyModel[244].setRotationPoint(0F, -20F, 0F);

		bodyModel[245].addShapeBox(3F, -25.2F, 0.2F, 2, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core344
		bodyModel[245].setRotationPoint(0F, -20F, 0F);

		bodyModel[246].addBox(3F, -24.2F, 0.2F, 2, 8, 2, 0F); // Core345
		bodyModel[246].setRotationPoint(0F, -20F, 0F);

		bodyModel[247].addShapeBox(2.5F, -26.2F, 3F, 2, 1, 1, 0F,-.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F); // Core346
		bodyModel[247].setRotationPoint(0F, -20F, 0F);

		bodyModel[248].addShapeBox(3.5F, -26.7F, 3F, 1, 1, 1, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core347
		bodyModel[248].setRotationPoint(0F, -20F, 0F);

		bodyModel[249].addShapeBox(3.5F, -26.2F, 3F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core348
		bodyModel[249].setRotationPoint(0F, -20F, 0F);

		bodyModel[250].addShapeBox(3F, -25.2F, 2.5F, 2, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core349
		bodyModel[250].setRotationPoint(0F, -20F, 0F);

		bodyModel[251].addShapeBox(65F, -24F, -5F, 2, 1, 3, 0F,0F, -2F, -.5F, 0F, -2.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 1.5F, -.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Core35
		bodyModel[251].setRotationPoint(0F, -20F, 0F);

		bodyModel[252].addBox(3F, -24.2F, 2.5F, 2, 8, 2, 0F); // Core350
		bodyModel[252].setRotationPoint(0F, -20F, 0F);

		bodyModel[253].addShapeBox(2F, -26.2F, -4F, 1, 1, 8, 0F,-.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Core351
		bodyModel[253].setRotationPoint(0F, -20F, 0F);

		bodyModel[254].addShapeBox(2F, -26.2F, 3.4F, 1, 19, 1, 0F,-.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.6F, -.3F, -.3F, -.6F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // Core352
		bodyModel[254].setRotationPoint(0F, -20F, 0F);

		bodyModel[255].addShapeBox(-19F, -26.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core353
		bodyModel[255].setRotationPoint(0F, -20F, 0F);

		bodyModel[256].addShapeBox(-18F, -26.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, -.8F, 0F, -.2F, -.8F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, -.2F, -.8F, 0F, -.2F, 0F, 0F, 0F); // Core354
		bodyModel[256].setRotationPoint(0F, -20F, 0F);

		bodyModel[257].addShapeBox(-18.7F, -27F, -1F, 1, 1, 1, 0F,-.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F, -.3F, 0F, -.45F); // Core355
		bodyModel[257].setRotationPoint(0F, -20F, 0F);

		bodyModel[258].addShapeBox(14F, -31F, -4F, 8, 4, 8, 0F,0F, .5F, -2F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Core36
		bodyModel[258].setRotationPoint(0F, -20F, 0F);

		bodyModel[259].addBox(0F, -23.5F, -5.5F, 1, 15, 11, 0F); // Core38
		bodyModel[259].setRotationPoint(0F, -20F, 0F);

		bodyModel[260].addShapeBox(22F, -20F, -11F, 12, 7, 6, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, 0F); // Core39
		bodyModel[260].setRotationPoint(0F, -20F, 0F);

		bodyModel[261].addShapeBox(-67F, -11F, -2F, 21, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Core4
		bodyModel[261].setRotationPoint(0F, -20F, 0F);

		bodyModel[262].addShapeBox(-67F, -18F, 4F, 21, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -.5F, -.5F); // Core41
		bodyModel[262].setRotationPoint(0F, -20F, 0F);

		bodyModel[263].addShapeBox(-17.5F, -23.5F, -7F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core42
		bodyModel[263].setRotationPoint(0F, -20F, 0F);
		bodyModel[263].rotateAngleZ = 0.13962634F;

		bodyModel[264].addShapeBox(-10F, -17F, -7.5F, 2, 1, 3, 0F,0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core43
		bodyModel[264].setRotationPoint(0F, -20F, 0F);

		bodyModel[265].addShapeBox(-3F, -21.5F, 4.5F, 3, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core44
		bodyModel[265].setRotationPoint(0F, -20F, 0F);

		bodyModel[266].addShapeBox(-10F, -16F, -7.5F, 2, 1, 3, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core45
		bodyModel[266].setRotationPoint(0F, -20F, 0F);

		bodyModel[267].addShapeBox(-2F, -23.5F, 4.5F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core46
		bodyModel[267].setRotationPoint(0F, -20F, 0F);

		bodyModel[268].addShapeBox(22F, -13F, -7F, 12, 11, 3, 0F,0F, 0F, 4F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -4F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Core47
		bodyModel[268].setRotationPoint(0F, -20F, 0F);

		bodyModel[269].addShapeBox(-46F, -18F, 5F, 25, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core48
		bodyModel[269].setRotationPoint(0F, -20F, 0F);

		bodyModel[270].addShapeBox(-21F, -18F, 8F, 8, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core49
		bodyModel[270].setRotationPoint(0F, -20F, 0F);

		bodyModel[271].addShapeBox(-86F, -11F, -2F, 19, 1, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -.5F, 0F); // Core5
		bodyModel[271].setRotationPoint(0F, -20F, 0F);

		bodyModel[272].addBox(4F, -23.95F, -6.5F, 2, 12, 13, 0F); // Core50
		bodyModel[272].setRotationPoint(0F, -20F, 0F);

		bodyModel[273].addShapeBox(22F, -13F, 4F, 12, 11, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, .5F, 0F, -3F, 2F); // Core51
		bodyModel[273].setRotationPoint(0F, -20F, 0F);

		bodyModel[274].addShapeBox(-17.5F, -26.5F, -3F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core52
		bodyModel[274].setRotationPoint(0F, -20F, 0F);
		bodyModel[274].rotateAngleZ = 0.13962634F;

		bodyModel[275].addShapeBox(14F, -15F, 11F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -1.5F, 0F, -.5F, -1F); // Core53
		bodyModel[275].setRotationPoint(0F, -20F, 0F);

		bodyModel[276].addShapeBox(83F, -18.5F, 0F, 4, 3, 1, 0F,0F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.5F, .5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 3F); // Core54
		bodyModel[276].setRotationPoint(0F, -20F, 0F);

		bodyModel[277].addShapeBox(-17.5F, -19.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Core55
		bodyModel[277].setRotationPoint(0F, -20F, 0F);
		bodyModel[277].rotateAngleZ = 0.13962634F;

		bodyModel[278].addBox(-20F, -8.5F, -3F, 6, 1, 6, 0F); // Core56
		bodyModel[278].setRotationPoint(0F, -20F, 0F);

		bodyModel[279].addShapeBox(-12F, -19F, -6.5F, 1, 2, 1, 0F,-.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F); // Core57
		bodyModel[279].setRotationPoint(0F, -20F, 0F);

		bodyModel[280].addShapeBox(83F, -15.5F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 3F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.5F, .5F, 0F, -.5F, 1.5F); // Core58
		bodyModel[280].setRotationPoint(0F, -20F, 0F);

		bodyModel[281].addShapeBox(14F, -18F, 11F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Core59
		bodyModel[281].setRotationPoint(0F, -20F, 0F);

		bodyModel[282].addShapeBox(34F, -11F, -2F, 17, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 2F, 0F); // Core6
		bodyModel[282].setRotationPoint(0F, -20F, 0F);

		bodyModel[283].addShapeBox(-13F, -24F, 4F, 19, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Core60
		bodyModel[283].setRotationPoint(0F, -20F, 0F);

		bodyModel[284].addShapeBox(14F, -13F, 4F, 8, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F); // Core61
		bodyModel[284].setRotationPoint(0F, -20F, 0F);

		bodyModel[285].addShapeBox(4F, -13F, 4F, 10, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 1.5F, -3F, 2F); // Core62
		bodyModel[285].setRotationPoint(0F, -20F, 0F);

		bodyModel[286].addShapeBox(87F, -18.5F, 0F, 2, 3, 1, 0F,0F, -.5F, 0F, -.5F, -2.5F, 0F, -.7F, -2.5F, -.5F, 0F, -1.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 1.5F); // Core63
		bodyModel[286].setRotationPoint(0F, -20F, 0F);

		bodyModel[287].addShapeBox(-92F, -17F, -2F, 1, 4, 4, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, -1F); // Core64
		bodyModel[287].setRotationPoint(0F, -20F, 0F);

		bodyModel[288].addShapeBox(65F, -11F, 2F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, .5F, 0F, -3F, .5F); // Core65
		bodyModel[288].setRotationPoint(0F, -20F, 0F);

		bodyModel[289].addShapeBox(-19F, -9.5F, -2F, 4, 1, 4, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core66
		bodyModel[289].setRotationPoint(0F, -20F, 0F);

		bodyModel[290].addShapeBox(6F, -24F, 2F, 28, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Core67
		bodyModel[290].setRotationPoint(0F, -20F, 0F);

		bodyModel[291].addShapeBox(14F, -20F, 11F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -1.5F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -.5F, 0F, 0F, 0F); // Core68
		bodyModel[291].setRotationPoint(0F, -20F, 0F);

		bodyModel[292].addShapeBox(-12F, -21F, -6.5F, 1, 2, 1, 0F,0F, .3F, -1F, 0F, .3F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F); // Core69
		bodyModel[292].setRotationPoint(0F, -20F, 0F);

		bodyModel[293].addShapeBox(51F, -11F, -2F, 14, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F); // Core7
		bodyModel[293].setRotationPoint(0F, -20F, 0F);

		bodyModel[294].addShapeBox(-17.5F, -18.5F, 3F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Core70
		bodyModel[294].setRotationPoint(0F, -20F, 0F);
		bodyModel[294].rotateAngleZ = 0.13962634F;

		bodyModel[295].addShapeBox(34F, -23F, 2F, 17, 5, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F); // Core71
		bodyModel[295].setRotationPoint(0F, -20F, 0F);

		bodyModel[296].addShapeBox(22F, -19.5F, 11F, 12, 2, 3, 0F,0F, 0F, 0F, -1F, -1.5F, 2F, -2F, -2F, -4F, 0F, -.5F, -1.5F, 0F, 0F, 0F, 0F, .5F, 2F, -1F, 1F, -3.5F, 0F, 0F, -.5F); // Core73
		bodyModel[296].setRotationPoint(0F, -20F, 0F);

		bodyModel[297].addShapeBox(87F, -15.5F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -.3F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 1.5F, 0F, -.5F, 0F, -.5F, -2.5F, 0F, -.7F, -2.5F, -.5F, 0F, -1.5F, .5F); // Core74
		bodyModel[297].setRotationPoint(0F, -20F, 0F);

		bodyModel[298].addShapeBox(-17.5F, -18.5F, -7F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Core75
		bodyModel[298].setRotationPoint(0F, -20F, 0F);
		bodyModel[298].rotateAngleZ = 0.13962634F;

		bodyModel[299].addShapeBox(65F, -18F, 4F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Core76
		bodyModel[299].setRotationPoint(0F, -20F, 0F);

		bodyModel[300].addShapeBox(-9.5F, -19F, -6F, 1, 2, 1, 0F,-.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F); // Core77
		bodyModel[300].setRotationPoint(0F, -20F, 0F);

		bodyModel[301].addShapeBox(-92F, -19F, -4F, 5, 2, 2, 0F,0F, -2F, -2F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Core78
		bodyModel[301].setRotationPoint(1F, -20F, 0F);

		bodyModel[302].addShapeBox(6F, -20F, 5F, 8, 7, 6, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Core79
		bodyModel[302].setRotationPoint(0F, -20F, 0F);

		bodyModel[303].addShapeBox(-86F, -20F, -2F, 19, 2, 4, 0F,0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Core8
		bodyModel[303].setRotationPoint(0F, -20F, 0F);

		bodyModel[304].addShapeBox(65F, -21F, 2F, 2, 3, 3, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, .5F, -.5F, 0F, 1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Core80
		bodyModel[304].setRotationPoint(0F, -20F, 0F);

		bodyModel[305].addShapeBox(51F, -21F, 2F, 14, 3, 3, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, -.5F, 0F, 2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F); // Core81
		bodyModel[305].setRotationPoint(0F, -20F, 0F);

		bodyModel[306].addShapeBox(14F, -20F, 5F, 8, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core82
		bodyModel[306].setRotationPoint(0F, -20F, 0F);

		bodyModel[307].addShapeBox(22F, -17.5F, 9F, 12, 2, 5, 0F,0F, 0F, 0F, 0F, -.5F, 0F, -1F, -1F, -3.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -1F, -3.5F, 0F, 0F, -.5F); // Core83
		bodyModel[307].setRotationPoint(0F, -20F, 0F);

		bodyModel[308].addShapeBox(73F, -20.5F, -2F, 3, 5, 2, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Core84
		bodyModel[308].setRotationPoint(0F, -20F, 0F);

		bodyModel[309].addShapeBox(-91F, -17F, -4F, 5, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, .5F, 0F); // Core85
		bodyModel[309].setRotationPoint(0F, -20F, 0F);

		bodyModel[310].addShapeBox(-17.4F, -25.5F, -5F, 1, 10, 10, 0F,0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F); // Core87
		bodyModel[310].setRotationPoint(0F, -20F, 0F);
		bodyModel[310].rotateAngleZ = 0.13962634F;

		bodyModel[311].addShapeBox(-9.5F, -19F, -7F, 1, 2, 1, 0F,-.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.1F, 0F, -.2F); // Core88
		bodyModel[311].setRotationPoint(0F, -20F, 0F);

		bodyModel[312].addShapeBox(22F, -20F, 5F, 12, 7, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F); // Core89
		bodyModel[312].setRotationPoint(0F, -20F, 0F);

		bodyModel[313].addShapeBox(-67F, -22F, -2F, 21, 3, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core9
		bodyModel[313].setRotationPoint(0F, -20F, 0F);

		bodyModel[314].addShapeBox(51F, -24F, 2F, 14, 1, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -.5F, 0F, 0F, .5F); // Core90
		bodyModel[314].setRotationPoint(0F, -20F, 0F);

		bodyModel[315].addShapeBox(73F, -15.5F, -2F, 3, 5, 2, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, .5F, 0F, 0F, .5F, 0F); // Core91
		bodyModel[315].setRotationPoint(0F, -20F, 0F);

		bodyModel[316].addShapeBox(65F, -24F, 2F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -2.5F, -.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, -.5F, 0F, 1F, -.5F); // Core92
		bodyModel[316].setRotationPoint(0F, -20F, 0F);

		bodyModel[317].addShapeBox(-91F, -12.5F, -4F, 5, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Core93
		bodyModel[317].setRotationPoint(0F, -20F, 0F);

		bodyModel[318].addShapeBox(-13.5F, -12F, -7.5F, 3, 1, 3, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Core94
		bodyModel[318].setRotationPoint(0F, -20F, 0F);

		bodyModel[319].addShapeBox(22F, -15.5F, 11F, 12, 2, 3, 0F,0F, 0F, 0F, 0F, .5F, 2F, -1F, 1F, -3.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -1F, -1.5F, 2F, -2F, -2F, -3.5F, 0F, -.5F, -1.5F); // Core95
		bodyModel[319].setRotationPoint(0F, -20F, 0F);

		bodyModel[320].addShapeBox(34F, -26F, 2F, 17, 2, 3, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, .5F, 0F, 0F, 1.5F); // Core97
		bodyModel[320].setRotationPoint(0F, -20F, 0F);

		bodyModel[321].addShapeBox(-17.4F, -25.5F, -5F, 1, 10, 10, 0F,0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -4.2F, -4.5F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F, 0F, -5.F, -4.F); // Core98
		bodyModel[321].setRotationPoint(0F, -20F, 0F);
		bodyModel[321].rotateAngleZ = 0.13962634F;

		bodyModel[322].addShapeBox(5F, -15F, 11F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, .3F, -.5F, -1F); // Core99
		bodyModel[322].setRotationPoint(0F, -20F, 0F);

		bodyModel[323].addShapeBox(10F, -5F, -13F, 48, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // LeftWing1
		bodyModel[323].setRotationPoint(0F, -20F, 0F);

		bodyModel[324].addShapeBox(8F, -4F, -10F, 52, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, 5F, 0F, 0F); // LeftWing17
		bodyModel[324].setRotationPoint(0F, -20F, 0F);

		bodyModel[325].addShapeBox(10F, -4F, -13F, 48, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F); // LeftWing18
		bodyModel[325].setRotationPoint(0F, -20F, 0F);

		bodyModel[326].addShapeBox(10F, -4F, -18F, 48, 1, 5, 0F,-4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F); // LeftWing19
		bodyModel[326].setRotationPoint(0F, -20F, 0F);

		bodyModel[327].addShapeBox(10F, -5F, -18F, 48, 1, 5, 0F,-4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // LeftWing2
		bodyModel[327].setRotationPoint(0F, -20F, 0F);

		bodyModel[328].addShapeBox(13F, -4F, -43F, 46, 1, 25, 0F,-10F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F); // LeftWing20
		bodyModel[328].setRotationPoint(0F, -20F, 0F);

		bodyModel[329].addShapeBox(8F, -5F, -10F, 52, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F); // LeftWing3
		bodyModel[329].setRotationPoint(0F, -20F, 0F);

		bodyModel[330].addShapeBox(13F, -5F, -43F, 46, 1, 25, 0F,-10F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // LeftWing4
		bodyModel[330].setRotationPoint(0F, -20F, 0F);

		bodyModel[331].addShapeBox(8F, -6F, -10F, 52, 1, 8, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 3F, -1F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 6F, 0F, 0F); // LeftWing5
		bodyModel[331].setRotationPoint(0F, -20F, 0F);

		bodyModel[332].addShapeBox(10F, -6F, -13F, 48, 1, 3, 0F,-3F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // LeftWing6
		bodyModel[332].setRotationPoint(0F, -20F, 0F);

		bodyModel[333].addShapeBox(10F, -6F, -18F, 48, 1, 5, 0F,-6F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // LeftWing7
		bodyModel[333].setRotationPoint(0F, -20F, 0F);

		bodyModel[334].addShapeBox(13F, -6F, -43F, 46, 1, 25, 0F,-12F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // LeftWing8
		bodyModel[334].setRotationPoint(0F, -20F, 0F);

		bodyModel[335].addShapeBox(8F, -4F, 2F, 52, 1, 8, 0F,6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F); // RightWing1
		bodyModel[335].setRotationPoint(0F, -20F, 0F);

		bodyModel[336].addShapeBox(13F, -4F, 18F, 46, 1, 25, 0F,-1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, -12F, 0F, 0F); // RightWing10
		bodyModel[336].setRotationPoint(0F, -20F, 0F);

		bodyModel[337].addShapeBox(13F, -5F, 18F, 46, 1, 25, 0F,-1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWing11
		bodyModel[337].setRotationPoint(0F, -20F, 0F);

		bodyModel[338].addShapeBox(13F, -6F, 18F, 46, 1, 25, 0F,-3F, 0F, 0F, -3F, -1F, 0F, 0F, -1F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWing12
		bodyModel[338].setRotationPoint(0F, -20F, 0F);

		bodyModel[339].addShapeBox(8F, -5F, 2F, 52, 1, 8, 0F,6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWing2
		bodyModel[339].setRotationPoint(0F, -20F, 0F);

		bodyModel[340].addShapeBox(8F, -6F, 2F, 52, 1, 8, 0F,5F, 0F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWing3
		bodyModel[340].setRotationPoint(0F, -20F, 0F);

		bodyModel[341].addShapeBox(10F, -4F, 10F, 48, 1, 3, 0F,2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F); // RightWing4
		bodyModel[341].setRotationPoint(0F, -20F, 0F);

		bodyModel[342].addShapeBox(10F, -5F, 10F, 48, 1, 3, 0F,2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // RightWing5
		bodyModel[342].setRotationPoint(0F, -20F, 0F);

		bodyModel[343].addShapeBox(10F, -6F, 10F, 48, 1, 3, 0F,0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // RightWing6
		bodyModel[343].setRotationPoint(0F, -20F, 0F);

		bodyModel[344].addShapeBox(10F, -4F, 13F, 48, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -6F, 0F, 0F); // RightWing7
		bodyModel[344].setRotationPoint(0F, -20F, 0F);

		bodyModel[345].addShapeBox(10F, -5F, 13F, 48, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // RightWing8
		bodyModel[345].setRotationPoint(0F, -20F, 0F);

		bodyModel[346].addShapeBox(10F, -6F, 13F, 48, 1, 5, 0F,-3F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F); // RightWing9
		bodyModel[346].setRotationPoint(0F, -20F, 0F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 22, 174, textureX, textureY); // Nose1
		noseModel[1] = new ModelRendererTurbo(this, 22, 180, textureX, textureY); // Nose2
		noseModel[2] = new ModelRendererTurbo(this, 22, 180, textureX, textureY); // Nose3
		noseModel[3] = new ModelRendererTurbo(this, 22, 174, textureX, textureY); // Nose4
		noseModel[4] = new ModelRendererTurbo(this, 22, 180, textureX, textureY); // Nose5
		noseModel[5] = new ModelRendererTurbo(this, 22, 174, textureX, textureY); // Nose6
		noseModel[6] = new ModelRendererTurbo(this, 22, 180, textureX, textureY); // Nose7
		noseModel[7] = new ModelRendererTurbo(this, 22, 174, textureX, textureY); // Nose8

		noseModel[0].addShapeBox(-78F, -21F, 1F, 5, 1, 1, 0F,0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F); // Nose1
		noseModel[0].setRotationPoint(0F, -20F, -0.1F);

		noseModel[1].addShapeBox(-78F, -21F, 1F, 5, 1, 1, 0F,0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F); // Nose2
		noseModel[1].setRotationPoint(0F, -20F, -0.1F);

		noseModel[2].addShapeBox(-79F, -20.8F, -1.5F, 5, 1, 1, 0F,0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F); // Nose3
		noseModel[2].setRotationPoint(0F, -20F, -0.4F);

		noseModel[3].addShapeBox(-79F, -20.8F, -1.5F, 5, 1, 1, 0F,0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F); // Nose4
		noseModel[3].setRotationPoint(0F, -20F, -0.4F);

		noseModel[4].addShapeBox(-85F, -20F, 1F, 5, 1, 1, 0F,0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F); // Nose5
		noseModel[4].setRotationPoint(0F, -20F, 0F);

		noseModel[5].addShapeBox(-85F, -20F, 1F, 5, 1, 1, 0F,0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F); // Nose6
		noseModel[5].setRotationPoint(0F, -20F, 0F);

		noseModel[6].addShapeBox(-86F, -19.8F, -2F, 5, 1, 1, 0F,0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F); // Nose7
		noseModel[6].setRotationPoint(0F, -20F, 0F);

		noseModel[7].addShapeBox(-86F, -19.8F, -2F, 5, 1, 1, 0F,0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.15F, -.25F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F); // Nose8
		noseModel[7].setRotationPoint(0F, -20F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 533, 510, textureX, textureY); // Tail1
		tailModel[1] = new ModelRendererTurbo(this, 533, 565, textureX, textureY); // Tail10
		tailModel[2] = new ModelRendererTurbo(this, 533, 510, textureX, textureY); // Tail11
		tailModel[3] = new ModelRendererTurbo(this, 533, 503, textureX, textureY); // Tail12
		tailModel[4] = new ModelRendererTurbo(this, 533, 503, textureX, textureY); // Tail13
		tailModel[5] = new ModelRendererTurbo(this, 533, 510, textureX, textureY); // Tail14
		tailModel[6] = new ModelRendererTurbo(this, 533, 535, textureX, textureY); // Tail15
		tailModel[7] = new ModelRendererTurbo(this, 533, 565, textureX, textureY); // Tail16
		tailModel[8] = new ModelRendererTurbo(this, 533, 565, textureX, textureY); // Tail17
		tailModel[9] = new ModelRendererTurbo(this, 533, 584, textureX, textureY); // Tail18
		tailModel[10] = new ModelRendererTurbo(this, 533, 584, textureX, textureY); // Tail19
		tailModel[11] = new ModelRendererTurbo(this, 533, 535, textureX, textureY); // Tail2
		tailModel[12] = new ModelRendererTurbo(this, 533, 584, textureX, textureY); // Tail20
		tailModel[13] = new ModelRendererTurbo(this, 533, 584, textureX, textureY); // Tail21
		tailModel[14] = new ModelRendererTurbo(this, 533, 573, textureX, textureY); // Tail22
		tailModel[15] = new ModelRendererTurbo(this, 533, 584, textureX, textureY); // Tail23
		tailModel[16] = new ModelRendererTurbo(this, 533, 573, textureX, textureY); // Tail24
		tailModel[17] = new ModelRendererTurbo(this, 533, 565, textureX, textureY); // Tail25
		tailModel[18] = new ModelRendererTurbo(this, 533, 535, textureX, textureY); // Tail26
		tailModel[19] = new ModelRendererTurbo(this, 533, 510, textureX, textureY); // Tail3
		tailModel[20] = new ModelRendererTurbo(this, 533, 503, textureX, textureY); // Tail4
		tailModel[21] = new ModelRendererTurbo(this, 533, 573, textureX, textureY); // Tail5
		tailModel[22] = new ModelRendererTurbo(this, 533, 573, textureX, textureY); // Tail6
		tailModel[23] = new ModelRendererTurbo(this, 533, 584, textureX, textureY); // Tail7
		tailModel[24] = new ModelRendererTurbo(this, 533, 503, textureX, textureY); // Tail8
		tailModel[25] = new ModelRendererTurbo(this, 533, 535, textureX, textureY); // Tail9

		tailModel[0].addShapeBox(48F, -21F, -43F, 17, 17, 1, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Tail1
		tailModel[0].setRotationPoint(0F, -20F, 0F);

		tailModel[1].addShapeBox(59F, 15F, 41F, 2, 1, 1, 0F,-1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Tail10
		tailModel[1].setRotationPoint(0F, -20F, 0F);

		tailModel[2].addShapeBox(48F, -21F, 41F, 17, 17, 1, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Tail11
		tailModel[2].setRotationPoint(0F, -20F, 0F);

		tailModel[3].addShapeBox(59F, -22F, 41F, 6, 1, 1, 0F,-2F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.2F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Tail12
		tailModel[3].setRotationPoint(0F, -20F, 0F);

		tailModel[4].addShapeBox(59F, -22F, 42F, 6, 1, 1, 0F,-1.5F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Tail13
		tailModel[4].setRotationPoint(0F, -20F, 0F);

		tailModel[5].addShapeBox(48F, -21F, 42F, 17, 17, 1, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Tail14
		tailModel[5].setRotationPoint(0F, -20F, 0F);

		tailModel[6].addShapeBox(48F, -4F, 42F, 17, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Tail15
		tailModel[6].setRotationPoint(0F, -20F, 0F);

		tailModel[7].addShapeBox(59F, 15F, 42F, 2, 1, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1.5F, -.5F, 0F); // Tail16
		tailModel[7].setRotationPoint(0F, -20F, 0F);

		tailModel[8].addShapeBox(59F, 15F, -43F, 2, 1, 1, 0F,-1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Tail17
		tailModel[8].setRotationPoint(0F, -20F, 0F);

		tailModel[9].addShapeBox(61.5F, 15.9F, -42.5F, 2, 1, 1, 0F,-.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Tail18
		tailModel[9].setRotationPoint(0F, -20F, 0F);

		tailModel[10].addShapeBox(61.5F, 17.3F, -42.5F, 2, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F); // Tail19
		tailModel[10].setRotationPoint(0F, -20F, 0F);

		tailModel[11].addShapeBox(48F, -4F, -43F, 17, 19, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Tail2
		tailModel[11].setRotationPoint(0F, -20F, 0F);

		tailModel[12].addShapeBox(61.5F, 15.9F, 41.5F, 2, 1, 1, 0F,-.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Tail20
		tailModel[12].setRotationPoint(0F, -20F, 0F);

		tailModel[13].addShapeBox(61.5F, 17.3F, 41.5F, 2, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F); // Tail21
		tailModel[13].setRotationPoint(0F, -20F, 0F);

		tailModel[14].addShapeBox(62F, 17F, 41.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F); // Tail22
		tailModel[14].setRotationPoint(0F, -20F, 0F);

		tailModel[15].addShapeBox(61.5F, 16.6F, 41.5F, 2, 1, 1, 0F,0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F); // Tail23
		tailModel[15].setRotationPoint(0F, -20F, 0F);

		tailModel[16].addBox(62F, 15F, 41.5F, 1, 2, 1, 0F); // Tail24
		tailModel[16].setRotationPoint(0F, -20F, 0F);

		tailModel[17].addShapeBox(59F, 15F, -42F, 2, 1, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1.5F, -.5F, 0F); // Tail25
		tailModel[17].setRotationPoint(0F, -20F, 0F);

		tailModel[18].addShapeBox(48F, -4F, -42F, 17, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Tail26
		tailModel[18].setRotationPoint(0F, -20F, 0F);

		tailModel[19].addShapeBox(48F, -21F, -42F, 17, 17, 1, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Tail3
		tailModel[19].setRotationPoint(0F, -20F, 0F);

		tailModel[20].addShapeBox(59F, -22F, -42F, 6, 1, 1, 0F,-1.5F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Tail4
		tailModel[20].setRotationPoint(0F, -20F, 0F);

		tailModel[21].addBox(62F, 15F, -42.5F, 1, 2, 1, 0F); // Tail5
		tailModel[21].setRotationPoint(0F, -20F, 0F);

		tailModel[22].addShapeBox(62F, 17F, -42.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F); // Tail6
		tailModel[22].setRotationPoint(0F, -20F, 0F);

		tailModel[23].addShapeBox(61.5F, 16.6F, -42.5F, 2, 1, 1, 0F,0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F, 0F, -.1F, -.2F); // Tail7
		tailModel[23].setRotationPoint(0F, -20F, 0F);

		tailModel[24].addShapeBox(59F, -22F, -43F, 6, 1, 1, 0F,-2F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.2F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Tail8
		tailModel[24].setRotationPoint(0F, -20F, 0F);

		tailModel[25].addShapeBox(48F, -4F, 41F, 17, 19, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F); // Tail9
		tailModel[25].setRotationPoint(0F, -20F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 167, 583, textureX, textureY); // LeftWing10
		leftWingModel[1] = new ModelRendererTurbo(this, 185, 620, textureX, textureY); // LeftWing11
		leftWingModel[2] = new ModelRendererTurbo(this, 185, 655, textureX, textureY); // LeftWing12
		leftWingModel[3] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // LeftWing13
		leftWingModel[4] = new ModelRendererTurbo(this, 185, 662, textureX, textureY); // LeftWing14
		leftWingModel[5] = new ModelRendererTurbo(this, 185, 673, textureX, textureY); // LeftWing15
		leftWingModel[6] = new ModelRendererTurbo(this, 185, 684, textureX, textureY); // LeftWing16
		leftWingModel[7] = new ModelRendererTurbo(this, 303, 579, textureX, textureY); // LeftWing21
		leftWingModel[8] = new ModelRendererTurbo(this, 317, 577, textureX, textureY); // LeftWing22
		leftWingModel[9] = new ModelRendererTurbo(this, 322, 609, textureX, textureY); // LeftWing23
		leftWingModel[10] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // LeftWing24
		leftWingModel[11] = new ModelRendererTurbo(this, 322, 644, textureX, textureY); // LeftWing25
		leftWingModel[12] = new ModelRendererTurbo(this, 322, 649, textureX, textureY); // LeftWing26
		leftWingModel[13] = new ModelRendererTurbo(this, 322, 656, textureX, textureY); // LeftWing27
		leftWingModel[14] = new ModelRendererTurbo(this, 322, 664, textureX, textureY); // LeftWing28
		leftWingModel[15] = new ModelRendererTurbo(this, 11, 557, textureX, textureY); // LeftWing29
		leftWingModel[16] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // LeftWing30
		leftWingModel[17] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // LeftWing31
		leftWingModel[18] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // LeftWing32
		leftWingModel[19] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // LeftWing33
		leftWingModel[20] = new ModelRendererTurbo(this, 268, 583, textureX, textureY); // LeftWing9
		leftWingModel[21] = new ModelRendererTurbo(this, 220, 702, textureX, textureY); // LeftWingDecal

		leftWingModel[0].addShapeBox(22F, -6F, -68F, 33, 1, 25, 0F,-12F, 0F, 0F, 1F, -.8F, 0F, -3F, -.8F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // LeftWing10
		leftWingModel[0].setRotationPoint(0F, -20F, 0F);

		leftWingModel[1].addShapeBox(31F, -6F, -93F, 27, 1, 25, 0F,-12F, 0F, 0F, 2F, -.8F, 0F, -2F, -.8F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // LeftWing11
		leftWingModel[1].setRotationPoint(0F, -20F, 0F);

		leftWingModel[2].addShapeBox(41F, -6F, -94F, 23, 1, 1, 0F,-2.5F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing12
		leftWingModel[2].setRotationPoint(0F, -20F, 0F);

		leftWingModel[3].addShapeBox(22F, -5F, -68F, 33, 1, 25, 0F,-10F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // LeftWing13
		leftWingModel[3].setRotationPoint(0F, -20F, 0F);

		leftWingModel[4].addShapeBox(42F, -6F, -96F, 20, 1, 2, 0F,-3F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F); // LeftWing14
		leftWingModel[4].setRotationPoint(0F, -20F, 0F);

		leftWingModel[5].addShapeBox(43F, -6F, -98F, 12, 1, 2, 0F,-4F, 0F, 0F, -2F, -1F, 0F, 3F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F); // LeftWing15
		leftWingModel[5].setRotationPoint(0F, -20F, 0F);

		leftWingModel[6].addShapeBox(46F, -6F, -99F, 7, 1, 1, 0F,-2F, -.5F, -.5F, -3F, -.8F, -.5F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // LeftWing16
		leftWingModel[6].setRotationPoint(0F, -20F, 0F);

		leftWingModel[7].addShapeBox(52F, -4F, -53F, 7, 1, 10, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.8F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -.8F, 0F); // LeftWing21
		leftWingModel[7].setRotationPoint(0F, -20F, 0F);

		leftWingModel[8].addShapeBox(22F, -4F, -68F, 33, 1, 25, 0F,-10F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, 1F, -.8F, 0F, -3F, -.8F, 0F, -3F, 0F, 0F); // LeftWing22
		leftWingModel[8].setRotationPoint(0F, -20F, 0F);

		leftWingModel[9].addShapeBox(31F, -4F, -93F, 27, 1, 25, 0F,-10F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -12F, 0F, 0F, 2F, -.8F, 0F, -2F, -.8F, 0F, -3F, 0F, 0F); // LeftWing23
		leftWingModel[9].setRotationPoint(0F, -20F, 0F);

		leftWingModel[10].addShapeBox(31F, -5F, -93F, 27, 1, 25, 0F,-10F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -10F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // LeftWing24
		leftWingModel[10].setRotationPoint(0F, -20F, 0F);

		leftWingModel[11].addShapeBox(41F, -4F, -94F, 23, 1, 1, 0F,-.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F); // LeftWing25
		leftWingModel[11].setRotationPoint(0F, -20F, 0F);

		leftWingModel[12].addShapeBox(42F, -4F, -96F, 20, 1, 2, 0F,-.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, -3F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F); // LeftWing26
		leftWingModel[12].setRotationPoint(0F, -20F, 0F);

		leftWingModel[13].addShapeBox(43F, -4F, -98F, 12, 1, 2, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, -4F, 0F, 0F, -2F, -1F, 0F, 3F, -1F, 0F, -2F, 0F, 0F); // LeftWing27
		leftWingModel[13].setRotationPoint(0F, -20F, 0F);

		leftWingModel[14].addShapeBox(46F, -4F, -99F, 7, 1, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -.5F, -.5F, -3F, -.8F, -.5F, 0F, -1F, 0F, -1F, 0F, 0F); // LeftWing28
		leftWingModel[14].setRotationPoint(0F, -20F, 0F);

		leftWingModel[15].addShapeBox(52F, -5F, -53F, 7, 1, 10, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing29
		leftWingModel[15].setRotationPoint(0F, -20F, 0F);

		leftWingModel[16].addShapeBox(41F, -5F, -94F, 23, 1, 1, 0F,-.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing30
		leftWingModel[16].setRotationPoint(0F, -20F, 0F);

		leftWingModel[17].addShapeBox(42F, -5F, -96F, 20, 1, 2, 0F,-.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, -.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F); // LeftWing31
		leftWingModel[17].setRotationPoint(0F, -20F, 0F);

		leftWingModel[18].addShapeBox(43F, -5F, -98F, 12, 1, 2, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, .5F, 0F, 0F); // LeftWing32
		leftWingModel[18].setRotationPoint(0F, -20F, 0F);

		leftWingModel[19].addShapeBox(46F, -5F, -99F, 7, 1, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // LeftWing33
		leftWingModel[19].setRotationPoint(0F, -20F, 0F);

		leftWingModel[20].addShapeBox(52F, -6F, -53F, 7, 1, 10, 0F,-1.5F, -.8F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, -.8F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWing9
		leftWingModel[20].setRotationPoint(0F, -20F, 0F);

		leftWingModel[21].addShapeBox(32F, -6F, -63F, 20, 1, 20, 0F,0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWingDecal
		leftWingModel[21].setRotationPoint(0F, -20F, 0F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 167, 583, textureX, textureY); // RightWing13
		rightWingModel[1] = new ModelRendererTurbo(this, 317, 577, textureX, textureY); // RightWing14
		rightWingModel[2] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // RightWing15
		rightWingModel[3] = new ModelRendererTurbo(this, 303, 579, textureX, textureY); // RightWing16
		rightWingModel[4] = new ModelRendererTurbo(this, 11, 557, textureX, textureY); // RightWing17
		rightWingModel[5] = new ModelRendererTurbo(this, 268, 583, textureX, textureY); // RightWing18
		rightWingModel[6] = new ModelRendererTurbo(this, 185, 620, textureX, textureY); // RightWing19
		rightWingModel[7] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // RightWing20
		rightWingModel[8] = new ModelRendererTurbo(this, 322, 609, textureX, textureY); // RightWing21
		rightWingModel[9] = new ModelRendererTurbo(this, 322, 644, textureX, textureY); // RightWing22
		rightWingModel[10] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // RightWing23
		rightWingModel[11] = new ModelRendererTurbo(this, 185, 655, textureX, textureY); // RightWing24
		rightWingModel[12] = new ModelRendererTurbo(this, 185, 662, textureX, textureY); // RightWing25
		rightWingModel[13] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // RightWing26
		rightWingModel[14] = new ModelRendererTurbo(this, 322, 649, textureX, textureY); // RightWing27
		rightWingModel[15] = new ModelRendererTurbo(this, 322, 656, textureX, textureY); // RightWing28
		rightWingModel[16] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // RightWing29
		rightWingModel[17] = new ModelRendererTurbo(this, 185, 673, textureX, textureY); // RightWing30
		rightWingModel[18] = new ModelRendererTurbo(this, 185, 684, textureX, textureY); // RightWing31
		rightWingModel[19] = new ModelRendererTurbo(this, 11, 551, textureX, textureY); // RightWing32
		rightWingModel[20] = new ModelRendererTurbo(this, 322, 664, textureX, textureY); // RightWing33
		rightWingModel[21] = new ModelRendererTurbo(this, 220, 702, textureX, textureY); // RightWingDecal

		rightWingModel[0].addShapeBox(22F, -6F, 43F, 33, 1, 25, 0F,-3F, 0F, 0F, -3F, -.8F, 0F, 1F, -.8F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -10F, 0F, 0F); // RightWing13
		rightWingModel[0].setRotationPoint(0F, -20F, 0F);

		rightWingModel[1].addShapeBox(22F, -4F, 43F, 33, 1, 25, 0F,-1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, -3F, -.8F, 0F, 1F, -.8F, 0F, -12F, 0F, 0F); // RightWing14
		rightWingModel[1].setRotationPoint(0F, -20F, 0F);

		rightWingModel[2].addShapeBox(22F, -5F, 43F, 33, 1, 25, 0F,-1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -10F, 0F, 0F); // RightWing15
		rightWingModel[2].setRotationPoint(0F, -20F, 0F);

		rightWingModel[3].addShapeBox(52F, -4F, 43F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, -.8F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1.5F, -.8F, 0F); // RightWing16
		rightWingModel[3].setRotationPoint(0F, -20F, 0F);

		rightWingModel[4].addShapeBox(52F, -5F, 43F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // RightWing17
		rightWingModel[4].setRotationPoint(0F, -20F, 0F);

		rightWingModel[5].addShapeBox(52F, -6F, 43F, 7, 1, 10, 0F,0F, -.8F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1.5F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // RightWing18
		rightWingModel[5].setRotationPoint(0F, -20F, 0F);

		rightWingModel[6].addShapeBox(31F, -6F, 68F, 27, 1, 25, 0F,-3F, 0F, 0F, -2F, -.8F, 0F, 2F, -.8F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -10F, 0F, 0F); // RightWing19
		rightWingModel[6].setRotationPoint(0F, -20F, 0F);

		rightWingModel[7].addShapeBox(31F, -5F, 68F, 27, 1, 25, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -10F, 0F, 0F); // RightWing20
		rightWingModel[7].setRotationPoint(0F, -20F, 0F);

		rightWingModel[8].addShapeBox(31F, -4F, 68F, 27, 1, 25, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, -2F, -.8F, 0F, 2F, -.8F, 0F, -12F, 0F, 0F); // RightWing21
		rightWingModel[8].setRotationPoint(0F, -20F, 0F);

		rightWingModel[9].addShapeBox(41F, -4F, 93F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -.4F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2.5F, 0F, 0F); // RightWing22
		rightWingModel[9].setRotationPoint(0F, -20F, 0F);

		rightWingModel[10].addShapeBox(41F, -5F, 93F, 23, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -.4F, 0F, 0F); // RightWing23
		rightWingModel[10].setRotationPoint(0F, -20F, 0F);

		rightWingModel[11].addShapeBox(41F, -6F, 93F, 23, 1, 1, 0F,-2F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -.4F, 0F, 0F); // RightWing24
		rightWingModel[11].setRotationPoint(0F, -20F, 0F);

		rightWingModel[12].addShapeBox(42F, -6F, 94F, 20, 1, 2, 0F,-1.5F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -3F, 0F, 0F, .6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F); // RightWing25
		rightWingModel[12].setRotationPoint(0F, -20F, 0F);

		rightWingModel[13].addShapeBox(42F, -5F, 94F, 20, 1, 2, 0F,.6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F, .6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F); // RightWing26
		rightWingModel[13].setRotationPoint(0F, -20F, 0F);

		rightWingModel[14].addShapeBox(42F, -4F, 94F, 20, 1, 2, 0F,.6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, -3F, 0F, 0F); // RightWing27
		rightWingModel[14].setRotationPoint(0F, -20F, 0F);

		rightWingModel[15].addShapeBox(43F, -4F, 96F, 12, 1, 2, 0F,.5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 3F, -1F, 0F, -2F, -1F, 0F, -4F, 0F, 0F); // RightWing28
		rightWingModel[15].setRotationPoint(0F, -20F, 0F);

		rightWingModel[16].addShapeBox(43F, -5F, 96F, 12, 1, 2, 0F,.5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // RightWing29
		rightWingModel[16].setRotationPoint(0F, -20F, 0F);

		rightWingModel[17].addShapeBox(43F, -6F, 96F, 12, 1, 2, 0F,-2F, 0F, 0F, 3F, -1F, 0F, -2F, -1F, 0F, -4F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // RightWing30
		rightWingModel[17].setRotationPoint(0F, -20F, 0F);

		rightWingModel[18].addShapeBox(46F, -6F, 98F, 7, 1, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, -3F, -.8F, -.5F, -2F, -.5F, -.5F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // RightWing31
		rightWingModel[18].setRotationPoint(0F, -20F, 0F);

		rightWingModel[19].addShapeBox(46F, -5F, 98F, 7, 1, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // RightWing32
		rightWingModel[19].setRotationPoint(0F, -20F, 0F);

		rightWingModel[20].addShapeBox(46F, -4F, 98F, 7, 1, 1, 0F,2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -3F, -.8F, -.5F, -2F, -.5F, -.5F); // RightWing33
		rightWingModel[20].setRotationPoint(0F, -20F, 0F);

		rightWingModel[21].addShapeBox(32F, -6F, 43F, 20, 1, 20, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWingDecal
		rightWingModel[21].setRotationPoint(0F, -20F, 0F);
	}

	private void inittopWingModel_1()
	{
		topWingModel[0] = new ModelRendererTurbo(this, 473, 589, textureX, textureY); // TopWing1
		topWingModel[1] = new ModelRendererTurbo(this, 473, 589, textureX, textureY); // TopWing10
		topWingModel[2] = new ModelRendererTurbo(this, 473, 589, textureX, textureY); // TopWing11
		topWingModel[3] = new ModelRendererTurbo(this, 473, 511, textureX, textureY); // TopWing12
		topWingModel[4] = new ModelRendererTurbo(this, 473, 674, textureX, textureY); // TopWing13
		topWingModel[5] = new ModelRendererTurbo(this, 473, 674, textureX, textureY); // TopWing14
		topWingModel[6] = new ModelRendererTurbo(this, 473, 674, textureX, textureY); // TopWing15
		topWingModel[7] = new ModelRendererTurbo(this, 473, 674, textureX, textureY); // TopWing16
		topWingModel[8] = new ModelRendererTurbo(this, 473, 432, textureX, textureY); // TopWing17
		topWingModel[9] = new ModelRendererTurbo(this, 473, 449, textureX, textureY); // TopWing18
		topWingModel[10] = new ModelRendererTurbo(this, 473, 466, textureX, textureY); // TopWing19
		topWingModel[11] = new ModelRendererTurbo(this, 473, 589, textureX, textureY); // TopWing2
		topWingModel[12] = new ModelRendererTurbo(this, 473, 489, textureX, textureY); // TopWing20
		topWingModel[13] = new ModelRendererTurbo(this, 473, 581, textureX, textureY); // TopWing21
		topWingModel[14] = new ModelRendererTurbo(this, 473, 581, textureX, textureY); // TopWing22
		topWingModel[15] = new ModelRendererTurbo(this, 473, 581, textureX, textureY); // TopWing23
		topWingModel[16] = new ModelRendererTurbo(this, 473, 674, textureX, textureY); // TopWing24
		topWingModel[17] = new ModelRendererTurbo(this, 473, 674, textureX, textureY); // TopWing25
		topWingModel[18] = new ModelRendererTurbo(this, 473, 674, textureX, textureY); // TopWing26
		topWingModel[19] = new ModelRendererTurbo(this, 473, 674, textureX, textureY); // TopWing27
		topWingModel[20] = new ModelRendererTurbo(this, 473, 581, textureX, textureY); // TopWing28
		topWingModel[21] = new ModelRendererTurbo(this, 473, 568, textureX, textureY); // TopWing29
		topWingModel[22] = new ModelRendererTurbo(this, 473, 589, textureX, textureY); // TopWing3
		topWingModel[23] = new ModelRendererTurbo(this, 473, 489, textureX, textureY); // TopWing30
		topWingModel[24] = new ModelRendererTurbo(this, 473, 545, textureX, textureY); // TopWing31
		topWingModel[25] = new ModelRendererTurbo(this, 473, 528, textureX, textureY); // TopWing32
		topWingModel[26] = new ModelRendererTurbo(this, 473, 511, textureX, textureY); // TopWing33
		topWingModel[27] = new ModelRendererTurbo(this, 473, 466, textureX, textureY); // TopWing34
		topWingModel[28] = new ModelRendererTurbo(this, 473, 449, textureX, textureY); // TopWing35
		topWingModel[29] = new ModelRendererTurbo(this, 473, 432, textureX, textureY); // TopWing36
		topWingModel[30] = new ModelRendererTurbo(this, 473, 589, textureX, textureY); // TopWing4
		topWingModel[31] = new ModelRendererTurbo(this, 473, 589, textureX, textureY); // TopWing5
		topWingModel[32] = new ModelRendererTurbo(this, 473, 589, textureX, textureY); // TopWing6
		topWingModel[33] = new ModelRendererTurbo(this, 473, 568, textureX, textureY); // TopWing7
		topWingModel[34] = new ModelRendererTurbo(this, 473, 545, textureX, textureY); // TopWing8
		topWingModel[35] = new ModelRendererTurbo(this, 473, 528, textureX, textureY); // TopWing9

		topWingModel[0].addShapeBox(-66F, -15F, 30F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing1
		topWingModel[0].setRotationPoint(0F, -20F, 0F);

		topWingModel[1].addShapeBox(-66F, -15F, -16F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing10
		topWingModel[1].setRotationPoint(0F, -20F, 0F);

		topWingModel[2].addShapeBox(-66F, -15F, -11F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing11
		topWingModel[2].setRotationPoint(0F, -20F, 0F);

		topWingModel[3].addShapeBox(-74F, -15F, -11F, 8, 1, 6, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing12
		topWingModel[3].setRotationPoint(0F, -20F, 0F);

		topWingModel[4].addShapeBox(-66F, -14F, -34F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // TopWing13
		topWingModel[4].setRotationPoint(0F, -20F, 0F);

		topWingModel[5].addShapeBox(-66F, -14F, -30F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // TopWing14
		topWingModel[5].setRotationPoint(0F, -20F, 0F);

		topWingModel[6].addShapeBox(-66F, -14F, -16F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // TopWing15
		topWingModel[6].setRotationPoint(0F, -20F, 0F);

		topWingModel[7].addShapeBox(-66F, -14F, -11F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // TopWing16
		topWingModel[7].setRotationPoint(0F, -20F, 0F);

		topWingModel[8].addShapeBox(-74F, -14F, -11F, 8, 1, 6, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // TopWing17
		topWingModel[8].setRotationPoint(0F, -20F, 0F);

		topWingModel[9].addShapeBox(-73F, -14F, -16F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // TopWing18
		topWingModel[9].setRotationPoint(0F, -20F, 0F);

		topWingModel[10].addShapeBox(-72F, -14F, -30F, 6, 1, 14, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing19
		topWingModel[10].setRotationPoint(0F, -20F, 0F);

		topWingModel[11].addShapeBox(-66F, -15F, 16F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing2
		topWingModel[11].setRotationPoint(0F, -20F, 0F);

		topWingModel[12].addShapeBox(-71F, -14F, -34F, 5, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // TopWing20
		topWingModel[12].setRotationPoint(0F, -20F, 0F);

		topWingModel[13].addShapeBox(-70F, -15F, -35F, 5, 1, 1, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing21
		topWingModel[13].setRotationPoint(0F, -20F, 0F);

		topWingModel[14].addShapeBox(-70F, -14F, -35F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // TopWing22
		topWingModel[14].setRotationPoint(0F, -20F, 0F);

		topWingModel[15].addShapeBox(-70F, -14F, 34F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F); // TopWing23
		topWingModel[15].setRotationPoint(0F, -20F, 0F);

		topWingModel[16].addShapeBox(-66F, -14F, 5F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // TopWing24
		topWingModel[16].setRotationPoint(0F, -20F, 0F);

		topWingModel[17].addShapeBox(-66F, -14F, 11F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // TopWing25
		topWingModel[17].setRotationPoint(0F, -20F, 0F);

		topWingModel[18].addShapeBox(-66F, -14F, 16F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // TopWing26
		topWingModel[18].setRotationPoint(0F, -20F, 0F);

		topWingModel[19].addShapeBox(-66F, -14F, 30F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // TopWing27
		topWingModel[19].setRotationPoint(0F, -20F, 0F);

		topWingModel[20].addShapeBox(-70F, -15F, 34F, 5, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // TopWing28
		topWingModel[20].setRotationPoint(0F, -20F, 0F);

		topWingModel[21].addShapeBox(-71F, -15F, 30F, 5, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // TopWing29
		topWingModel[21].setRotationPoint(0F, -20F, 0F);

		topWingModel[22].addShapeBox(-66F, -15F, 11F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing3
		topWingModel[22].setRotationPoint(0F, -20F, 0F);

		topWingModel[23].addShapeBox(-71F, -14F, 30F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // TopWing30
		topWingModel[23].setRotationPoint(0F, -20F, 0F);

		topWingModel[24].addShapeBox(-72F, -15F, 16F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // TopWing31
		topWingModel[24].setRotationPoint(0F, -20F, 0F);

		topWingModel[25].addShapeBox(-73F, -15F, 11F, 7, 1, 5, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing32
		topWingModel[25].setRotationPoint(0F, -20F, 0F);

		topWingModel[26].addShapeBox(-74F, -15F, 5F, 8, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // TopWing33
		topWingModel[26].setRotationPoint(0F, -20F, 0F);

		topWingModel[27].addShapeBox(-72F, -14F, 16F, 6, 1, 14, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // TopWing34
		topWingModel[27].setRotationPoint(0F, -20F, 0F);

		topWingModel[28].addShapeBox(-73F, -14F, 11F, 7, 1, 5, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // TopWing35
		topWingModel[28].setRotationPoint(0F, -20F, 0F);

		topWingModel[29].addShapeBox(-74F, -14F, 5F, 8, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // TopWing36
		topWingModel[29].setRotationPoint(0F, -20F, 0F);

		topWingModel[30].addShapeBox(-66F, -15F, 5F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing4
		topWingModel[30].setRotationPoint(0F, -20F, 0F);

		topWingModel[31].addShapeBox(-66F, -15F, -30F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing5
		topWingModel[31].setRotationPoint(0F, -20F, 0F);

		topWingModel[32].addShapeBox(-66F, -15F, -34F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing6
		topWingModel[32].setRotationPoint(0F, -20F, 0F);

		topWingModel[33].addShapeBox(-71F, -15F, -34F, 5, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TopWing7
		topWingModel[33].setRotationPoint(0F, -20F, 0F);

		topWingModel[34].addShapeBox(-72F, -15F, -30F, 6, 1, 14, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // TopWing8
		topWingModel[34].setRotationPoint(0F, -20F, 0F);

		topWingModel[35].addShapeBox(-73F, -15F, -16F, 7, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // TopWing9
		topWingModel[35].setRotationPoint(0F, -20F, 0F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core102
		yawFlapModel[1] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core110
		yawFlapModel[2] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core127
		yawFlapModel[3] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core134
		yawFlapModel[4] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core139
		yawFlapModel[5] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core151
		yawFlapModel[6] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core155
		yawFlapModel[7] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core158
		yawFlapModel[8] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core168
		yawFlapModel[9] = new ModelRendererTurbo(this, 224, 107, textureX, textureY); // Core72
		yawFlapModel[10] = new ModelRendererTurbo(this, 236, 107, textureX, textureY); // Core86
		yawFlapModel[11] = new ModelRendererTurbo(this, 208, 118, textureX, textureY); // Core96
		yawFlapModel[12] = new ModelRendererTurbo(this, 539, 599, textureX, textureY); // Yaw1
		yawFlapModel[13] = new ModelRendererTurbo(this, 539, 591, textureX, textureY); // Yaw2
		yawFlapModel[14] = new ModelRendererTurbo(this, 539, 643, textureX, textureY); // Yaw3
		yawFlapModel[15] = new ModelRendererTurbo(this, 539, 655, textureX, textureY); // Yaw4
		yawFlapModel[16] = new ModelRendererTurbo(this, 539, 643, textureX, textureY); // Yaw5
		yawFlapModel[17] = new ModelRendererTurbo(this, 539, 655, textureX, textureY); // Yaw6
		yawFlapModel[18] = new ModelRendererTurbo(this, 539, 599, textureX, textureY); // Yaw7
		yawFlapModel[19] = new ModelRendererTurbo(this, 539, 591, textureX, textureY); // Yaw8

		yawFlapModel[0].addShapeBox(-16F, -11F, -5F, 1, 2, 1, 0F,-.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.5F, -.1F, -.1F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.5F, -.1F, -.1F, -.5F); // Core102
		yawFlapModel[0].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[1].addShapeBox(-16F, -11F, -4F, 1, 2, 1, 0F,-.1F, -.1F, -.5F, -.1F, -.1F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.5F, -.1F, -.1F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Core110
		yawFlapModel[1].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[2].addShapeBox(-16F, -11.8F, -5F, 1, 1, 2, 0F,-.1F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Core127
		yawFlapModel[2].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[3].addShapeBox(-16F, -10F, -5F, 2, 1, 1, 0F,-.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.5F, -.1F, -.1F, -.5F); // Core134
		yawFlapModel[3].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[4].addShapeBox(-16F, -10F, 4F, 2, 1, 1, 0F,-.1F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.1F, -.5F, -.1F, -.1F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Core139
		yawFlapModel[4].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[5].addShapeBox(-16F, -10F, 3F, 1, 1, 2, 0F,-.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F); // Core151
		yawFlapModel[5].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[6].addShapeBox(-16F, -11F, 4F, 1, 2, 1, 0F,-.1F, -.1F, -.5F, -.1F, -.1F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.5F, -.1F, -.1F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Core155
		yawFlapModel[6].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[7].addShapeBox(-16F, -11F, 3F, 1, 2, 1, 0F,-.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.5F, -.1F, -.1F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -.5F, -.1F, -.1F, -.5F); // Core158
		yawFlapModel[7].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[8].addShapeBox(-16F, -11.8F, 3F, 1, 1, 2, 0F,-.1F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, -.5F, -.5F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Core168
		yawFlapModel[8].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[9].addShapeBox(-18F, -10F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core72
		yawFlapModel[9].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[10].addShapeBox(-16F, -10F, -3F, 1, 1, 6, 0F,-.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F); // Core86
		yawFlapModel[10].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[11].addShapeBox(-16F, -10F, -5F, 1, 1, 2, 0F,-.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F); // Core96
		yawFlapModel[11].setRotationPoint(0F, -20F, 0F);

		yawFlapModel[12].addShapeBox(0F, -16F, -1F, 3, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Yaw1
		yawFlapModel[12].setRotationPoint(65F, -24F, -42F);

		yawFlapModel[13].addShapeBox(0F, -17F, -1F, 3, 1, 2, 0F,0F, .5F, 0F, -1F, .5F, -.5F, -1F, .5F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Yaw2
		yawFlapModel[13].setRotationPoint(65F, -24F, -42F);

		yawFlapModel[14].addShapeBox(0F, 18F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F); // Yaw3
		yawFlapModel[14].setRotationPoint(65F, -24F, -42F);

		yawFlapModel[15].addShapeBox(-1F, 19.2F, -0.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Yaw4
		yawFlapModel[15].setRotationPoint(65F, -24F, -42F);

		yawFlapModel[16].addShapeBox(0F, 18F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, 0F, 0F, 0F); // Yaw5
		yawFlapModel[16].setRotationPoint(65F, -24F, 42F);

		yawFlapModel[17].addShapeBox(-1F, 19.2F, -0.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Yaw6
		yawFlapModel[17].setRotationPoint(65F, -24F, 42F);

		yawFlapModel[18].addShapeBox(0F, -16F, -1F, 3, 34, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Yaw7
		yawFlapModel[18].setRotationPoint(65F, -24F, 42F);

		yawFlapModel[19].addShapeBox(0F, -17F, -1F, 3, 1, 2, 0F,0F, .5F, 0F, -1F, .5F, -.5F, -1F, .5F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Yaw8
		yawFlapModel[19].setRotationPoint(65F, -24F, 42F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 259, 135, textureX, textureY); // Core187
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 259, 127, textureX, textureY); // Core226
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 259, 127, textureX, textureY); // Core260
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 259, 127, textureX, textureY); // Core286
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 259, 126, textureX, textureY); // Core29
		pitchFlapLeftModel[5] = new ModelRendererTurbo(this, 259, 122, textureX, textureY); // Core306
		pitchFlapLeftModel[6] = new ModelRendererTurbo(this, 259, 127, textureX, textureY); // Core37
		pitchFlapLeftModel[7] = new ModelRendererTurbo(this, 532, 673, textureX, textureY); // FlapPitchLeft1
		pitchFlapLeftModel[8] = new ModelRendererTurbo(this, 532, 684, textureX, textureY); // FlapPitchLeft2
		pitchFlapLeftModel[9] = new ModelRendererTurbo(this, 532, 695, textureX, textureY); // FlapPitchLeft3
		pitchFlapLeftModel[10] = new ModelRendererTurbo(this, 532, 718, textureX, textureY); // FlapPitchLeft4
		pitchFlapLeftModel[11] = new ModelRendererTurbo(this, 467, 646, textureX, textureY); // FlapPitchLeft5
		pitchFlapLeftModel[12] = new ModelRendererTurbo(this, 467, 657, textureX, textureY); // FlapPitchLeft6

		pitchFlapLeftModel[0].addShapeBox(-12F, -9.5F, -0.5F, 1, 1, 1, 0F,-.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Core187
		pitchFlapLeftModel[0].setRotationPoint(0F, -20F, 0F);

		pitchFlapLeftModel[1].addShapeBox(-12F, -16.5F, -0.5F, 1, 2, 1, 0F,.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core226
		pitchFlapLeftModel[1].setRotationPoint(0F, -20F, 0F);

		pitchFlapLeftModel[2].addShapeBox(-12F, -18.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F); // Core260
		pitchFlapLeftModel[2].setRotationPoint(0F, -20F, 0F);

		pitchFlapLeftModel[3].addShapeBox(-12F, -21.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core286
		pitchFlapLeftModel[3].setRotationPoint(0F, -20F, 0F);

		pitchFlapLeftModel[4].addShapeBox(-12F, -14.5F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core29
		pitchFlapLeftModel[4].setRotationPoint(0F, -20F, 0F);

		pitchFlapLeftModel[5].addShapeBox(-12F, -22.5F, -0.5F, 1, 1, 1, 0F,.1F, -.8F, .1F, .1F, -.8F, .1F, .1F, -.8F, .1F, .1F, -.8F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Core306
		pitchFlapLeftModel[5].setRotationPoint(0F, -20F, 0F);

		pitchFlapLeftModel[6].addShapeBox(-12F, -8.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core37
		pitchFlapLeftModel[6].setRotationPoint(0F, -20F, 0F);

		pitchFlapLeftModel[7].addShapeBox(0F, -0.5F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.4F, 0F, 0F, 0F); // FlapPitchLeft1
		pitchFlapLeftModel[7].setRotationPoint(-63F, -34F, -16F);

		pitchFlapLeftModel[8].addShapeBox(0F, -0.5F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, -.5F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F); // FlapPitchLeft2
		pitchFlapLeftModel[8].setRotationPoint(-63F, -34F, -16F);

		pitchFlapLeftModel[9].addShapeBox(0F, -0.5F, -14F, 4, 1, 14, 0F,0F, 0F, 0F, -2F, -.4F, 0F, -.5F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -.4F, 0F, -.5F, -.4F, 0F, 0F, 0F, 0F); // FlapPitchLeft3
		pitchFlapLeftModel[9].setRotationPoint(-63F, -34F, -16F);

		pitchFlapLeftModel[10].addShapeBox(0F, -0.5F, -18F, 2, 1, 4, 0F,0F, 0F, 0F, -.5F, -.4F, -1F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.4F, -1F, 0F, -.4F, 0F, 0F, 0F, 0F); // FlapPitchLeft4
		pitchFlapLeftModel[10].setRotationPoint(-63F, -34F, -16F);

		pitchFlapLeftModel[11].addShapeBox(0F, -0.5F, -19F, 1, 1, 2, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // FlapPitchLeft5
		pitchFlapLeftModel[11].setRotationPoint(-63F, -34F, -16F);

		pitchFlapLeftModel[12].addShapeBox(-2F, -0.5F, -19.3F, 3, 1, 1, 0F,-.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // FlapPitchLeft6
		pitchFlapLeftModel[12].setRotationPoint(-63F, -34F, -16F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 532, 673, textureX, textureY); // FlapPitchRight1
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 532, 684, textureX, textureY); // FlapPitchRight2
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 532, 695, textureX, textureY); // FlapPitchRight3
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 532, 718, textureX, textureY); // FlapPitchRight4
		pitchFlapRightModel[4] = new ModelRendererTurbo(this, 467, 646, textureX, textureY); // FlapPitchRight5
		pitchFlapRightModel[5] = new ModelRendererTurbo(this, 467, 657, textureX, textureY); // FlapPitchRight6

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, -9F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, -.4F, -.4F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.4F, 0F, -.4F, 0F, 0F, 0F, 0F); // FlapPitchRight1
		pitchFlapRightModel[0].setRotationPoint(-63F, -34F, 16F);

		pitchFlapRightModel[1].addShapeBox(0F, -0.5F, -5F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, -.4F, 0F, -.5F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -.5F, -.4F, 0F, 0F, 0F, 0F); // FlapPitchRight2
		pitchFlapRightModel[1].setRotationPoint(-63F, -34F, 16F);

		pitchFlapRightModel[2].addShapeBox(0F, -0.5F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, -.5F, -.4F, 0F, -2F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.4F, 0F, -2F, -.4F, 0F, 0F, 0F, 0F); // FlapPitchRight3
		pitchFlapRightModel[2].setRotationPoint(-63F, -34F, 16F);

		pitchFlapRightModel[3].addShapeBox(0F, -0.5F, 14F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -.4F, 0F, -.5F, -.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -.5F, -.4F, -1F, 0F, 0F, 0F); // FlapPitchRight4
		pitchFlapRightModel[3].setRotationPoint(-63F, -34F, 16F);

		pitchFlapRightModel[4].addShapeBox(0F, -0.5F, 17F, 1, 1, 2, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // FlapPitchRight5
		pitchFlapRightModel[4].setRotationPoint(-63F, -34F, 16F);

		pitchFlapRightModel[5].addShapeBox(-2F, -0.5F, 18.3F, 3, 1, 1, 0F,-.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F); // FlapPitchRight6
		pitchFlapRightModel[5].setRotationPoint(-63F, -34F, 16F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 5, 589, textureX, textureY); // LeftWingFlap7

		pitchFlapLeftWingModel[0].addShapeBox(0F, -0.5F, -26F, 6, 1, 41, 0F,0F, 0F, -.5F, -2F, -.3F, 0F, 0F, -.3F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, -.3F, 0F, 0F, -.3F, -1F, 0F, 0F, 0F); // LeftWingFlap7
		pitchFlapLeftWingModel[0].setRotationPoint(56F, -24.5F, -68F);
		pitchFlapLeftWingModel[0].rotateAngleY = 0.15707963F;
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 5, 589, textureX, textureY); // RightWingFlap7

		pitchFlapRightWingModel[0].addShapeBox(0F, -0.5F, -15F, 6, 1, 41, 0F,0F, 0F, 0F, 0F, -.3F, -1F, -2F, -.3F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.3F, -1F, -2F, -.3F, 0F, 0F, 0F, -.5F); // RightWingFlap7
		pitchFlapRightWingModel[0].setRotationPoint(56F, -24.5F, 68F);
		pitchFlapRightWingModel[0].rotateAngleY = -0.15707963F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 263, 324, textureX, textureY); // WheelCore1
		bodyWheelModel[1] = new ModelRendererTurbo(this, 264, 268, textureX, textureY); // WheelCore10
		bodyWheelModel[2] = new ModelRendererTurbo(this, 264, 283, textureX, textureY); // WheelCore100
		bodyWheelModel[3] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore101
		bodyWheelModel[4] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore102
		bodyWheelModel[5] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore103
		bodyWheelModel[6] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore104
		bodyWheelModel[7] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore105
		bodyWheelModel[8] = new ModelRendererTurbo(this, 317, 257, textureX, textureY); // WheelCore106
		bodyWheelModel[9] = new ModelRendererTurbo(this, 317, 274, textureX, textureY); // WheelCore107
		bodyWheelModel[10] = new ModelRendererTurbo(this, 317, 281, textureX, textureY); // WheelCore108
		bodyWheelModel[11] = new ModelRendererTurbo(this, 317, 268, textureX, textureY); // WheelCore109
		bodyWheelModel[12] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore11
		bodyWheelModel[13] = new ModelRendererTurbo(this, 317, 289, textureX, textureY); // WheelCore110
		bodyWheelModel[14] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore111
		bodyWheelModel[15] = new ModelRendererTurbo(this, 264, 283, textureX, textureY); // WheelCore112
		bodyWheelModel[16] = new ModelRendererTurbo(this, 317, 298, textureX, textureY); // WheelCore113
		bodyWheelModel[17] = new ModelRendererTurbo(this, 341, 268, textureX, textureY); // WheelCore114
		bodyWheelModel[18] = new ModelRendererTurbo(this, 341, 257, textureX, textureY); // WheelCore115
		bodyWheelModel[19] = new ModelRendererTurbo(this, 341, 274, textureX, textureY); // WheelCore116
		bodyWheelModel[20] = new ModelRendererTurbo(this, 341, 281, textureX, textureY); // WheelCore117
		bodyWheelModel[21] = new ModelRendererTurbo(this, 341, 289, textureX, textureY); // WheelCore118
		bodyWheelModel[22] = new ModelRendererTurbo(this, 341, 298, textureX, textureY); // WheelCore119
		bodyWheelModel[23] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore12
		bodyWheelModel[24] = new ModelRendererTurbo(this, 263, 256, textureX, textureY); // WheelCore13
		bodyWheelModel[25] = new ModelRendererTurbo(this, 262, 258, textureX, textureY); // WheelCore14
		bodyWheelModel[26] = new ModelRendererTurbo(this, 263, 256, textureX, textureY); // WheelCore15
		bodyWheelModel[27] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore16
		bodyWheelModel[28] = new ModelRendererTurbo(this, 287, 255, textureX, textureY); // WheelCore17
		bodyWheelModel[29] = new ModelRendererTurbo(this, 336, 376, textureX, textureY); // WheelCore18
		bodyWheelModel[30] = new ModelRendererTurbo(this, 287, 255, textureX, textureY); // WheelCore19
		bodyWheelModel[31] = new ModelRendererTurbo(this, 336, 349, textureX, textureY); // WheelCore2
		bodyWheelModel[32] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore20
		bodyWheelModel[33] = new ModelRendererTurbo(this, 287, 255, textureX, textureY); // WheelCore21
		bodyWheelModel[34] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore22
		bodyWheelModel[35] = new ModelRendererTurbo(this, 287, 255, textureX, textureY); // WheelCore23
		bodyWheelModel[36] = new ModelRendererTurbo(this, 287, 292, textureX, textureY); // WheelCore24
		bodyWheelModel[37] = new ModelRendererTurbo(this, 287, 255, textureX, textureY); // WheelCore25
		bodyWheelModel[38] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore26
		bodyWheelModel[39] = new ModelRendererTurbo(this, 287, 255, textureX, textureY); // WheelCore27
		bodyWheelModel[40] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore28
		bodyWheelModel[41] = new ModelRendererTurbo(this, 287, 255, textureX, textureY); // WheelCore29
		bodyWheelModel[42] = new ModelRendererTurbo(this, 250, 257, textureX, textureY); // WheelCore3
		bodyWheelModel[43] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore30
		bodyWheelModel[44] = new ModelRendererTurbo(this, 287, 255, textureX, textureY); // WheelCore31
		bodyWheelModel[45] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore32
		bodyWheelModel[46] = new ModelRendererTurbo(this, 287, 266, textureX, textureY); // WheelCore33
		bodyWheelModel[47] = new ModelRendererTurbo(this, 263, 324, textureX, textureY); // WheelCore34
		bodyWheelModel[48] = new ModelRendererTurbo(this, 336, 311, textureX, textureY); // WheelCore35
		bodyWheelModel[49] = new ModelRendererTurbo(this, 263, 324, textureX, textureY); // WheelCore36
		bodyWheelModel[50] = new ModelRendererTurbo(this, 336, 333, textureX, textureY); // WheelCore37
		bodyWheelModel[51] = new ModelRendererTurbo(this, 336, 383, textureX, textureY); // WheelCore38
		bodyWheelModel[52] = new ModelRendererTurbo(this, 241, 245, textureX, textureY); // WheelCore39
		bodyWheelModel[53] = new ModelRendererTurbo(this, 336, 368, textureX, textureY); // WheelCore4
		bodyWheelModel[54] = new ModelRendererTurbo(this, 336, 341, textureX, textureY); // WheelCore40
		bodyWheelModel[55] = new ModelRendererTurbo(this, 263, 313, textureX, textureY); // WheelCore41
		bodyWheelModel[56] = new ModelRendererTurbo(this, 263, 313, textureX, textureY); // WheelCore42
		bodyWheelModel[57] = new ModelRendererTurbo(this, 263, 313, textureX, textureY); // WheelCore43
		bodyWheelModel[58] = new ModelRendererTurbo(this, 263, 313, textureX, textureY); // WheelCore44
		bodyWheelModel[59] = new ModelRendererTurbo(this, 263, 324, textureX, textureY); // WheelCore45
		bodyWheelModel[60] = new ModelRendererTurbo(this, 263, 324, textureX, textureY); // WheelCore46
		bodyWheelModel[61] = new ModelRendererTurbo(this, 263, 324, textureX, textureY); // WheelCore47
		bodyWheelModel[62] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore48
		bodyWheelModel[63] = new ModelRendererTurbo(this, 246, 296, textureX, textureY); // WheelCore49
		bodyWheelModel[64] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore5
		bodyWheelModel[65] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore50
		bodyWheelModel[66] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore51
		bodyWheelModel[67] = new ModelRendererTurbo(this, 336, 392, textureX, textureY); // WheelCore52
		bodyWheelModel[68] = new ModelRendererTurbo(this, 241, 245, textureX, textureY); // WheelCore53
		bodyWheelModel[69] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore54
		bodyWheelModel[70] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore55
		bodyWheelModel[71] = new ModelRendererTurbo(this, 287, 292, textureX, textureY); // WheelCore56
		bodyWheelModel[72] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore57
		bodyWheelModel[73] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore58
		bodyWheelModel[74] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore59
		bodyWheelModel[75] = new ModelRendererTurbo(this, 264, 275, textureX, textureY); // WheelCore6
		bodyWheelModel[76] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore60
		bodyWheelModel[77] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore61
		bodyWheelModel[78] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore62
		bodyWheelModel[79] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore63
		bodyWheelModel[80] = new ModelRendererTurbo(this, 263, 257, textureX, textureY); // WheelCore64
		bodyWheelModel[81] = new ModelRendererTurbo(this, 336, 399, textureX, textureY); // WheelCore65
		bodyWheelModel[82] = new ModelRendererTurbo(this, 287, 278, textureX, textureY); // WheelCore66
		bodyWheelModel[83] = new ModelRendererTurbo(this, 299, 311, textureX, textureY); // WheelCore67
		bodyWheelModel[84] = new ModelRendererTurbo(this, 299, 333, textureX, textureY); // WheelCore68
		bodyWheelModel[85] = new ModelRendererTurbo(this, 299, 341, textureX, textureY); // WheelCore69
		bodyWheelModel[86] = new ModelRendererTurbo(this, 264, 275, textureX, textureY); // WheelCore7
		bodyWheelModel[87] = new ModelRendererTurbo(this, 299, 349, textureX, textureY); // WheelCore70
		bodyWheelModel[88] = new ModelRendererTurbo(this, 299, 361, textureX, textureY); // WheelCore71
		bodyWheelModel[89] = new ModelRendererTurbo(this, 299, 368, textureX, textureY); // WheelCore72
		bodyWheelModel[90] = new ModelRendererTurbo(this, 299, 376, textureX, textureY); // WheelCore73
		bodyWheelModel[91] = new ModelRendererTurbo(this, 299, 383, textureX, textureY); // WheelCore74
		bodyWheelModel[92] = new ModelRendererTurbo(this, 299, 392, textureX, textureY); // WheelCore75
		bodyWheelModel[93] = new ModelRendererTurbo(this, 336, 361, textureX, textureY); // WheelCore76
		bodyWheelModel[94] = new ModelRendererTurbo(this, 263, 257, textureX, textureY); // WheelCore77
		bodyWheelModel[95] = new ModelRendererTurbo(this, 299, 399, textureX, textureY); // WheelCore78
		bodyWheelModel[96] = new ModelRendererTurbo(this, 263, 313, textureX, textureY); // WheelCore79
		bodyWheelModel[97] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore8
		bodyWheelModel[98] = new ModelRendererTurbo(this, 263, 313, textureX, textureY); // WheelCore80
		bodyWheelModel[99] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore81
		bodyWheelModel[100] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore82
		bodyWheelModel[101] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore83
		bodyWheelModel[102] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore84
		bodyWheelModel[103] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore85
		bodyWheelModel[104] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore86
		bodyWheelModel[105] = new ModelRendererTurbo(this, 263, 257, textureX, textureY); // WheelCore87
		bodyWheelModel[106] = new ModelRendererTurbo(this, 246, 296, textureX, textureY); // WheelCore88
		bodyWheelModel[107] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore89
		bodyWheelModel[108] = new ModelRendererTurbo(this, 264, 283, textureX, textureY); // WheelCore9
		bodyWheelModel[109] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore90
		bodyWheelModel[110] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore91
		bodyWheelModel[111] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore92
		bodyWheelModel[112] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore93
		bodyWheelModel[113] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore94
		bodyWheelModel[114] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore95
		bodyWheelModel[115] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore96
		bodyWheelModel[116] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore97
		bodyWheelModel[117] = new ModelRendererTurbo(this, 215, 235, textureX, textureY); // WheelCore98
		bodyWheelModel[118] = new ModelRendererTurbo(this, 263, 296, textureX, textureY); // WheelCore99

		bodyWheelModel[0].addShapeBox(32.5F, 0.5F, -40F, 1, 1, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // WheelCore1
		bodyWheelModel[0].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[0].rotateAngleZ = -0.38397244F;

		bodyWheelModel[1].addShapeBox(-30F, 7F, -1.5F, 5, 1, 1, 0F,0F, 4F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 4F, -.3F, 0F, -4F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, -4F, -.3F); // WheelCore10
		bodyWheelModel[1].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[1].rotateAngleZ = -0.17453293F;

		bodyWheelModel[2].addShapeBox(-25F, 28F, -1F, 2, 1, 2, 0F,-.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F); // WheelCore100
		bodyWheelModel[2].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[2].rotateAngleZ = -0.17453293F;

		bodyWheelModel[3].addShapeBox(22F, -18F, -4.65F, 11, 2, 2, 0F,-2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore101
		bodyWheelModel[3].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[3].rotateAngleX = -1.55334303F;

		bodyWheelModel[4].addShapeBox(20F, -16F, -4.65F, 14, 2, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore102
		bodyWheelModel[4].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[4].rotateAngleX = -1.55334303F;

		bodyWheelModel[5].addShapeBox(20F, -14F, -4.65F, 14, 3, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore103
		bodyWheelModel[5].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[5].rotateAngleX = -1.55334303F;

		bodyWheelModel[6].addShapeBox(20F, -11F, -4.65F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore104
		bodyWheelModel[6].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[6].rotateAngleX = -1.55334303F;

		bodyWheelModel[7].addShapeBox(21F, -10F, -4.65F, 12, 2, 2, 0F,.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // WheelCore105
		bodyWheelModel[7].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[7].rotateAngleX = -1.55334303F;

		bodyWheelModel[8].addShapeBox(22F, -2F, -4F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore106
		bodyWheelModel[8].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[9].addShapeBox(22F, 5F, -4F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // WheelCore107
		bodyWheelModel[9].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[10].addShapeBox(27F, 8F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // WheelCore108
		bodyWheelModel[10].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[11].addShapeBox(18F, 1F, -4F, 4, 4, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F); // WheelCore109
		bodyWheelModel[11].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[12].addShapeBox(34F, 13F, -38F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F); // WheelCore11
		bodyWheelModel[12].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[12].rotateAngleZ = -0.38397244F;

		bodyWheelModel[13].addShapeBox(31F, 4F, -4F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore110
		bodyWheelModel[13].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[14].addShapeBox(34F, -3F, -41F, 3, 1, 3, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // WheelCore111
		bodyWheelModel[14].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[14].rotateAngleZ = -0.38397244F;

		bodyWheelModel[15].addShapeBox(-25F, 23F, -1F, 2, 1, 2, 0F,-.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F, -.2F, .1F, .5F); // WheelCore112
		bodyWheelModel[15].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[15].rotateAngleZ = -0.17453293F;

		bodyWheelModel[16].addShapeBox(31F, 8F, -4F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F); // WheelCore113
		bodyWheelModel[16].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[17].addShapeBox(18F, 1F, 3F, 4, 4, 1, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F); // WheelCore114
		bodyWheelModel[17].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[18].addShapeBox(22F, -2F, 3F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore115
		bodyWheelModel[18].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[19].addShapeBox(22F, 5F, 3F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // WheelCore116
		bodyWheelModel[19].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[20].addShapeBox(27F, 8F, 3F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // WheelCore117
		bodyWheelModel[20].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[21].addShapeBox(31F, 4F, 3F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore118
		bodyWheelModel[21].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[22].addShapeBox(31F, 8F, 3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F); // WheelCore119
		bodyWheelModel[22].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[23].addShapeBox(33F, 8F, -41F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // WheelCore12
		bodyWheelModel[23].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[23].rotateAngleZ = -0.38397244F;

		bodyWheelModel[24].addShapeBox(-26F, 30F, -2F, 2, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore13
		bodyWheelModel[24].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[24].rotateAngleZ = -0.17453293F;

		bodyWheelModel[25].addShapeBox(-26F, 37F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore14
		bodyWheelModel[25].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[25].rotateAngleZ = -0.17453293F;

		bodyWheelModel[26].addShapeBox(-26F, 30F, 1F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore15
		bodyWheelModel[26].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[26].rotateAngleZ = -0.17453293F;

		bodyWheelModel[27].addShapeBox(38F, 11F, -41F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore16
		bodyWheelModel[27].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[27].rotateAngleZ = -0.38397244F;

		bodyWheelModel[28].addShapeBox(-22.5F, 36F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore17
		bodyWheelModel[28].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[28].rotateAngleZ = -0.17453293F;

		bodyWheelModel[29].addShapeBox(20F, 21F, -43F, 14, 2, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore18
		bodyWheelModel[29].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[30].addShapeBox(-29.5F, 33F, -1F, 8, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // WheelCore19
		bodyWheelModel[30].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[30].rotateAngleZ = -0.17453293F;

		bodyWheelModel[31].addShapeBox(29F, 13F, -43F, 6, 5, 2, 0F,.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // WheelCore2
		bodyWheelModel[31].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[32].addShapeBox(33F, 16F, -41F, 5, 3, 3, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore20
		bodyWheelModel[32].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[32].rotateAngleZ = -0.38397244F;

		bodyWheelModel[33].addShapeBox(-29.5F, 39F, -1F, 8, 3, 2, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // WheelCore21
		bodyWheelModel[33].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[33].rotateAngleZ = -0.17453293F;

		bodyWheelModel[34].addShapeBox(30F, 11F, -41F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore22
		bodyWheelModel[34].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[34].rotateAngleZ = -0.38397244F;

		bodyWheelModel[35].addShapeBox(-29.5F, 36F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore23
		bodyWheelModel[35].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[35].rotateAngleZ = -0.17453293F;

		bodyWheelModel[36].addShapeBox(32F, 10F, -41F, 7, 7, 3, 0F,0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // WheelCore24
		bodyWheelModel[36].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[36].rotateAngleZ = -0.38397244F;

		bodyWheelModel[37].addShapeBox(-28.5F, 39F, -1F, 8, 3, 2, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // WheelCore25
		bodyWheelModel[37].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[37].rotateAngleZ = -0.17453293F;

		bodyWheelModel[38].addShapeBox(33F, 11F, -41F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // WheelCore26
		bodyWheelModel[38].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[38].rotateAngleZ = -0.38397244F;

		bodyWheelModel[39].addShapeBox(-28.5F, 33F, -1F, 8, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // WheelCore27
		bodyWheelModel[39].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[39].rotateAngleZ = -0.17453293F;

		bodyWheelModel[40].addShapeBox(33F, 15F, -41F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore28
		bodyWheelModel[40].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[40].rotateAngleZ = -0.38397244F;

		bodyWheelModel[41].addShapeBox(-26.5F, 40F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore29
		bodyWheelModel[41].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[41].rotateAngleZ = -0.17453293F;

		bodyWheelModel[42].addShapeBox(-26F, 1F, -1F, 2, 28, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore3
		bodyWheelModel[42].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[42].rotateAngleZ = -0.17453293F;

		bodyWheelModel[43].addShapeBox(37F, 15F, -41F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore30
		bodyWheelModel[43].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[43].rotateAngleZ = -0.38397244F;

		bodyWheelModel[44].addShapeBox(-26.5F, 33F, -1F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore31
		bodyWheelModel[44].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[44].rotateAngleZ = -0.17453293F;

		bodyWheelModel[45].addShapeBox(37F, 11F, -41F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // WheelCore32
		bodyWheelModel[45].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[45].rotateAngleZ = -0.38397244F;

		bodyWheelModel[46].addShapeBox(-27.5F, 35F, -1F, 5, 5, 2, 0F,0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // WheelCore33
		bodyWheelModel[46].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[46].rotateAngleZ = -0.17453293F;

		bodyWheelModel[47].addShapeBox(33.5F, -2.5F, -41.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore34
		bodyWheelModel[47].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[47].rotateAngleZ = -0.38397244F;

		bodyWheelModel[48].addShapeBox(37F, -4F, -43F, 6, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // WheelCore35
		bodyWheelModel[48].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[49].addShapeBox(33.5F, 3.5F, -41.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore36
		bodyWheelModel[49].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[49].rotateAngleZ = -0.38397244F;

		bodyWheelModel[50].addShapeBox(31F, 9F, -43F, 9, 2, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F); // WheelCore37
		bodyWheelModel[50].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[51].addShapeBox(20F, 23F, -43F, 14, 3, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore38
		bodyWheelModel[51].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[52].addShapeBox(-64F, 3F, -1F, 43, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore39
		bodyWheelModel[52].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[52].rotateAngleX = -1.11701072F;
		bodyWheelModel[52].rotateAngleZ = -0.12217305F;

		bodyWheelModel[53].addShapeBox(22F, 19F, -43F, 11, 2, 2, 0F,-2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore4
		bodyWheelModel[53].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[54].addShapeBox(31F, 11F, -43F, 8, 2, 2, 0F,.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .2F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 2.5F, 0F, 0F); // WheelCore40
		bodyWheelModel[54].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[55].addShapeBox(33.5F, -2F, -40.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, -.5F); // WheelCore41
		bodyWheelModel[55].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[55].rotateAngleZ = -0.38397244F;

		bodyWheelModel[56].addShapeBox(33.5F, 1F, 38.5F, 1, 3, 2, 0F,1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore42
		bodyWheelModel[56].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[56].rotateAngleZ = -0.38397244F;

		bodyWheelModel[57].addShapeBox(33.5F, 1F, -40.5F, 1, 3, 2, 0F,1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore43
		bodyWheelModel[57].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[57].rotateAngleZ = -0.38397244F;

		bodyWheelModel[58].addShapeBox(33.5F, -2F, 38.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, -.5F); // WheelCore44
		bodyWheelModel[58].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[58].rotateAngleZ = -0.38397244F;

		bodyWheelModel[59].addShapeBox(32.5F, 0.5F, 39F, 1, 1, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // WheelCore45
		bodyWheelModel[59].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[59].rotateAngleZ = -0.38397244F;

		bodyWheelModel[60].addShapeBox(33.5F, -2.5F, 37.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore46
		bodyWheelModel[60].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[60].rotateAngleZ = -0.38397244F;

		bodyWheelModel[61].addShapeBox(33.5F, 3.5F, 37.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore47
		bodyWheelModel[61].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[61].rotateAngleZ = -0.38397244F;

		bodyWheelModel[62].addShapeBox(34F, -3F, 38F, 3, 1, 3, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // WheelCore48
		bodyWheelModel[62].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[62].rotateAngleZ = -0.38397244F;

		bodyWheelModel[63].addShapeBox(34F, -19F, 38F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore49
		bodyWheelModel[63].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[63].rotateAngleZ = -0.38397244F;

		bodyWheelModel[64].addShapeBox(34F, 4F, -41F, 3, 3, 3, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // WheelCore5
		bodyWheelModel[64].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[64].rotateAngleZ = -0.38397244F;

		bodyWheelModel[65].addShapeBox(34F, -13F, 38F, 3, 1, 3, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // WheelCore50
		bodyWheelModel[65].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[65].rotateAngleZ = -0.38397244F;

		bodyWheelModel[66].addShapeBox(34F, 4F, 37F, 3, 9, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore51
		bodyWheelModel[66].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[66].rotateAngleZ = -0.38397244F;

		bodyWheelModel[67].addShapeBox(20F, 26F, -43F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore52
		bodyWheelModel[67].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[68].addShapeBox(-64F, 3F, -3F, 43, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore53
		bodyWheelModel[68].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[68].rotateAngleX = 1.09955743F;
		bodyWheelModel[68].rotateAngleZ = -0.12217305F;

		bodyWheelModel[69].addShapeBox(34F, 4F, 38F, 3, 3, 3, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // WheelCore54
		bodyWheelModel[69].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[69].rotateAngleZ = -0.38397244F;

		bodyWheelModel[70].addShapeBox(34F, 13F, 37F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F); // WheelCore55
		bodyWheelModel[70].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[70].rotateAngleZ = -0.38397244F;

		bodyWheelModel[71].addShapeBox(32F, 10F, 38F, 7, 7, 3, 0F,0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // WheelCore56
		bodyWheelModel[71].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[71].rotateAngleZ = -0.38397244F;

		bodyWheelModel[72].addShapeBox(33F, 11F, 38F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // WheelCore57
		bodyWheelModel[72].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[72].rotateAngleZ = -0.38397244F;

		bodyWheelModel[73].addShapeBox(37F, 11F, 38F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // WheelCore58
		bodyWheelModel[73].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[73].rotateAngleZ = -0.38397244F;

		bodyWheelModel[74].addShapeBox(37F, 15F, 38F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore59
		bodyWheelModel[74].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[74].rotateAngleZ = -0.38397244F;

		bodyWheelModel[75].addShapeBox(-24F, 23F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -.5F, 2F, 0F, -.5F, 2F, 0F, -.5F, -2F, 0F, -.5F); // WheelCore6
		bodyWheelModel[75].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[75].rotateAngleZ = -0.17453293F;

		bodyWheelModel[76].addShapeBox(33F, 15F, 38F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore60
		bodyWheelModel[76].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[76].rotateAngleZ = -0.38397244F;

		bodyWheelModel[77].addShapeBox(33F, 16F, 38F, 5, 3, 3, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore61
		bodyWheelModel[77].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[77].rotateAngleZ = -0.38397244F;

		bodyWheelModel[78].addShapeBox(38F, 11F, 38F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore62
		bodyWheelModel[78].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[78].rotateAngleZ = -0.38397244F;

		bodyWheelModel[79].addShapeBox(33F, 8F, 38F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F); // WheelCore63
		bodyWheelModel[79].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[79].rotateAngleZ = -0.38397244F;

		bodyWheelModel[80].addShapeBox(-26F, 7F, -1F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // WheelCore64
		bodyWheelModel[80].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[80].rotateAngleZ = -0.17453293F;

		bodyWheelModel[81].addShapeBox(21F, 27F, -43F, 12, 2, 2, 0F,.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // WheelCore65
		bodyWheelModel[81].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[82].addShapeBox(30F, 11F, 38F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore66
		bodyWheelModel[82].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[82].rotateAngleZ = -0.38397244F;

		bodyWheelModel[83].addShapeBox(37F, -4F, 41F, 6, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // WheelCore67
		bodyWheelModel[83].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[84].addShapeBox(31F, 9F, 41F, 9, 2, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F); // WheelCore68
		bodyWheelModel[84].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[85].addShapeBox(31F, 11F, 41F, 8, 2, 2, 0F,.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .2F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 2.5F, 0F, 0F); // WheelCore69
		bodyWheelModel[85].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[86].addShapeBox(-24F, 26F, -1F, 1, 3, 2, 0F,-2F, 0F, -.5F, 2F, 0F, -.5F, 2F, 0F, -.5F, -2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore7
		bodyWheelModel[86].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[86].rotateAngleZ = -0.17453293F;

		bodyWheelModel[87].addShapeBox(29F, 13F, 41F, 6, 5, 2, 0F,.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // WheelCore70
		bodyWheelModel[87].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[88].addShapeBox(26F, 18F, 41F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F); // WheelCore71
		bodyWheelModel[88].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[89].addShapeBox(22F, 19F, 41F, 11, 2, 2, 0F,-2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore72
		bodyWheelModel[89].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[90].addShapeBox(20F, 21F, 41F, 14, 2, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore73
		bodyWheelModel[90].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[91].addShapeBox(20F, 23F, 41F, 14, 3, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore74
		bodyWheelModel[91].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[92].addShapeBox(20F, 26F, 41F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore75
		bodyWheelModel[92].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[93].addShapeBox(26F, 18F, -43F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F); // WheelCore76
		bodyWheelModel[93].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[94].addShapeBox(-26F, 21F, -1F, 2, 3, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // WheelCore77
		bodyWheelModel[94].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[94].rotateAngleZ = -0.17453293F;

		bodyWheelModel[95].addShapeBox(21F, 27F, 41F, 12, 2, 2, 0F,.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // WheelCore78
		bodyWheelModel[95].setRotationPoint(0F, -20F, 0F);

		bodyWheelModel[96].addShapeBox(35F, -13F, 33F, 1, 1, 5, 0F,0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore79
		bodyWheelModel[96].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[96].rotateAngleZ = -0.38397244F;

		bodyWheelModel[97].addShapeBox(34F, 4F, -38F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore8
		bodyWheelModel[97].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[97].rotateAngleZ = -0.38397244F;

		bodyWheelModel[98].addShapeBox(35F, -13F, -38F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // WheelCore80
		bodyWheelModel[98].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[98].rotateAngleZ = -0.38397244F;

		bodyWheelModel[99].addShapeBox(37F, -41F, 2.65F, 6, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // WheelCore81
		bodyWheelModel[99].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[99].rotateAngleX = 1.55334303F;

		bodyWheelModel[100].addShapeBox(31F, -28F, 2.65F, 9, 2, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F); // WheelCore82
		bodyWheelModel[100].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[100].rotateAngleX = 1.55334303F;

		bodyWheelModel[101].addShapeBox(31F, -26F, 2.65F, 8, 2, 2, 0F,.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .2F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 2.5F, 0F, 0F); // WheelCore83
		bodyWheelModel[101].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[101].rotateAngleX = 1.55334303F;

		bodyWheelModel[102].addShapeBox(29F, -24F, 2.65F, 6, 5, 2, 0F,.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // WheelCore84
		bodyWheelModel[102].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[102].rotateAngleX = 1.55334303F;

		bodyWheelModel[103].addShapeBox(26F, -19F, 2.65F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F); // WheelCore85
		bodyWheelModel[103].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[103].rotateAngleX = 1.55334303F;

		bodyWheelModel[104].addShapeBox(22F, -18F, 2.65F, 11, 2, 2, 0F,-2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore86
		bodyWheelModel[104].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[104].rotateAngleX = 1.55334303F;

		bodyWheelModel[105].addShapeBox(-26F, 28F, -1F, 2, 4, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // WheelCore87
		bodyWheelModel[105].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[105].rotateAngleZ = -0.17453293F;

		bodyWheelModel[106].addShapeBox(34F, -19F, -41F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore88
		bodyWheelModel[106].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[106].rotateAngleZ = -0.38397244F;

		bodyWheelModel[107].addShapeBox(20F, -16F, 2.65F, 14, 2, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore89
		bodyWheelModel[107].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[107].rotateAngleX = 1.55334303F;

		bodyWheelModel[108].addShapeBox(-22F, 25.5F, -1F, 1, 1, 2, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // WheelCore9
		bodyWheelModel[108].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[108].rotateAngleZ = -0.17453293F;

		bodyWheelModel[109].addShapeBox(20F, -14F, 2.65F, 14, 3, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelCore90
		bodyWheelModel[109].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[109].rotateAngleX = 1.55334303F;

		bodyWheelModel[110].addShapeBox(20F, -11F, 2.65F, 14, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // WheelCore91
		bodyWheelModel[110].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[110].rotateAngleX = 1.55334303F;

		bodyWheelModel[111].addShapeBox(21F, -10F, 2.65F, 12, 2, 2, 0F,.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // WheelCore92
		bodyWheelModel[111].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[111].rotateAngleX = 1.55334303F;

		bodyWheelModel[112].addShapeBox(-63.5F, 1.7F, -2.5F, 42, 2, 5, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // WheelCore93
		bodyWheelModel[112].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[112].rotateAngleZ = -0.12217305F;

		bodyWheelModel[113].addShapeBox(37F, -41F, -4.65F, 6, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 4F, 0F, 0F); // WheelCore94
		bodyWheelModel[113].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[113].rotateAngleX = -1.55334303F;

		bodyWheelModel[114].addShapeBox(31F, -28F, -4.65F, 9, 2, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F); // WheelCore95
		bodyWheelModel[114].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[114].rotateAngleX = -1.55334303F;

		bodyWheelModel[115].addShapeBox(31F, -26F, -4.65F, 8, 2, 2, 0F,.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .2F, 0F, 0F, 2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 2.5F, 0F, 0F); // WheelCore96
		bodyWheelModel[115].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[115].rotateAngleX = -1.55334303F;

		bodyWheelModel[116].addShapeBox(29F, -24F, -4.65F, 6, 5, 2, 0F,.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F); // WheelCore97
		bodyWheelModel[116].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[116].rotateAngleX = -1.55334303F;

		bodyWheelModel[117].addShapeBox(26F, -19F, -4.65F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F); // WheelCore98
		bodyWheelModel[117].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[117].rotateAngleX = -1.55334303F;

		bodyWheelModel[118].addShapeBox(34F, -13F, -41F, 3, 1, 3, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // WheelCore99
		bodyWheelModel[118].setRotationPoint(0F, -20F, 0F);
		bodyWheelModel[118].rotateAngleZ = -0.38397244F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[3][6];
		propellerModels[0] = makeProp1(74F, -35.5F, 0F);
		propellerModels[1] = makeProp2(74F, -35.5F, 0F);
		propellerModels[2] = makeProp3(74F, -35.5F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[6];
		prop[0] = new ModelRendererTurbo(this, 134, 493, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 134, 493, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 134, 493, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 134, 493, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 134, 493, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 134, 493, textureX, textureY);
		prop[0].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[1].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[2].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[3].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[4].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[5].addBox(-0.5F, -28F, -1.5F, 1, 28, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[6];
		prop[0] = new ModelRendererTurbo(this, 124, 493, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 124, 493, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 124, 493, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 124, 493, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 124, 493, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 124, 493, textureX, textureY);
		prop[0].addBox(-0.5F, -29F, -1F, 1, 29, 2, 0.0F);
		prop[1].addBox(-0.5F, -29F, -1F, 1, 29, 2, 0.0F);
		prop[2].addBox(-0.5F, -29F, -1F, 1, 29, 2, 0.0F);
		prop[3].addBox(-0.5F, -29F, -1F, 1, 29, 2, 0.0F);
		prop[4].addBox(-0.5F, -29F, -1F, 1, 29, 2, 0.0F);
		prop[5].addBox(-0.5F, -29F, -1F, 1, 29, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[6];
		prop[0] = new ModelRendererTurbo(this, 116, 493, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 116, 493, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 116, 493, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 116, 493, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 116, 493, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 116, 493, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -0.5F, 1, 30, 1, 0.0F);
		prop[1].addBox(-0.5F, -30F, -0.5F, 1, 30, 1, 0.0F);
		prop[2].addBox(-0.5F, -30F, -0.5F, 1, 30, 1, 0.0F);
		prop[3].addBox(-0.5F, -30F, -0.5F, 1, 30, 1, 0.0F);
		prop[4].addBox(-0.5F, -30F, -0.5F, 1, 30, 1, 0.0F);
		prop[5].addBox(-0.5F, -30F, -0.5F, 1, 30, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		return prop;
	}
}