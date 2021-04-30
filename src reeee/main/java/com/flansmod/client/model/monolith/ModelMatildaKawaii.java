//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelMatildaKawaii extends ModelVehicle
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMatildaKawaii()
	{
		bodyModel = new ModelRendererTurbo[300];
		bodyModel[0] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Core99
		bodyModel[1] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Core98
		bodyModel[2] = new ModelRendererTurbo(this, 171, 549, textureX, textureY); // Core97
		bodyModel[3] = new ModelRendererTurbo(this, 62, 598, textureX, textureY); // Core96
		bodyModel[4] = new ModelRendererTurbo(this, 436, 300, textureX, textureY); // Core95
		bodyModel[5] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Core94
		bodyModel[6] = new ModelRendererTurbo(this, 143, 486, textureX, textureY); // Core93
		bodyModel[7] = new ModelRendererTurbo(this, 349, 193, textureX, textureY); // Core92
		bodyModel[8] = new ModelRendererTurbo(this, 401, 71, textureX, textureY); // Core91
		bodyModel[9] = new ModelRendererTurbo(this, 208, 304, textureX, textureY); // Core90
		bodyModel[10] = new ModelRendererTurbo(this, 146, 647, textureX, textureY); // Core9
		bodyModel[11] = new ModelRendererTurbo(this, 401, 71, textureX, textureY); // Core89
		bodyModel[12] = new ModelRendererTurbo(this, 153, 486, textureX, textureY); // Core88
		bodyModel[13] = new ModelRendererTurbo(this, 423, 176, textureX, textureY); // Core87
		bodyModel[14] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core86
		bodyModel[15] = new ModelRendererTurbo(this, 171, 450, textureX, textureY); // Core85
		bodyModel[16] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core84
		bodyModel[17] = new ModelRendererTurbo(this, 343, 165, textureX, textureY); // Core83
		bodyModel[18] = new ModelRendererTurbo(this, 208, 318, textureX, textureY); // Core82
		bodyModel[19] = new ModelRendererTurbo(this, 55, 482, textureX, textureY); // Core81
		bodyModel[20] = new ModelRendererTurbo(this, 342, 231, textureX, textureY); // Core80
		bodyModel[21] = new ModelRendererTurbo(this, 117, 677, textureX, textureY); // Core8
		bodyModel[22] = new ModelRendererTurbo(this, 120, 482, textureX, textureY); // Core79
		bodyModel[23] = new ModelRendererTurbo(this, 116, 486, textureX, textureY); // Core78
		bodyModel[24] = new ModelRendererTurbo(this, 224, 490, textureX, textureY); // Core77
		bodyModel[25] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core76
		bodyModel[26] = new ModelRendererTurbo(this, 402, 180, textureX, textureY); // Core75
		bodyModel[27] = new ModelRendererTurbo(this, 208, 310, textureX, textureY); // Core74
		bodyModel[28] = new ModelRendererTurbo(this, 224, 363, textureX, textureY); // Core73
		bodyModel[29] = new ModelRendererTurbo(this, 167, 497, textureX, textureY); // Core72
		bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Core71
		bodyModel[31] = new ModelRendererTurbo(this, 436, 300, textureX, textureY); // Core70
		bodyModel[32] = new ModelRendererTurbo(this, 117, 677, textureX, textureY); // Core7
		bodyModel[33] = new ModelRendererTurbo(this, 230, 363, textureX, textureY); // Core69
		bodyModel[34] = new ModelRendererTurbo(this, 436, 300, textureX, textureY); // Core68
		bodyModel[35] = new ModelRendererTurbo(this, 224, 363, textureX, textureY); // Core67
		bodyModel[36] = new ModelRendererTurbo(this, 192, 446, textureX, textureY); // Core66
		bodyModel[37] = new ModelRendererTurbo(this, 414, 70, textureX, textureY); // Core65
		bodyModel[38] = new ModelRendererTurbo(this, 215, 391, textureX, textureY); // Core64
		bodyModel[39] = new ModelRendererTurbo(this, 405, 87, textureX, textureY); // Core63
		bodyModel[40] = new ModelRendererTurbo(this, 482, 129, textureX, textureY); // Core62
		bodyModel[41] = new ModelRendererTurbo(this, 61, 535, textureX, textureY); // Core61
		bodyModel[42] = new ModelRendererTurbo(this, 447, 118, textureX, textureY); // Core60
		bodyModel[43] = new ModelRendererTurbo(this, 342, 263, textureX, textureY); // Core6
		bodyModel[44] = new ModelRendererTurbo(this, 229, 395, textureX, textureY); // Core59
		bodyModel[45] = new ModelRendererTurbo(this, 193, 434, textureX, textureY); // Core58
		bodyModel[46] = new ModelRendererTurbo(this, 224, 363, textureX, textureY); // Core57
		bodyModel[47] = new ModelRendererTurbo(this, 224, 363, textureX, textureY); // Core56
		bodyModel[48] = new ModelRendererTurbo(this, 192, 429, textureX, textureY); // Core55
		bodyModel[49] = new ModelRendererTurbo(this, 57, 431, textureX, textureY); // Core54
		bodyModel[50] = new ModelRendererTurbo(this, 229, 395, textureX, textureY); // Core53
		bodyModel[51] = new ModelRendererTurbo(this, 447, 118, textureX, textureY); // Core52
		bodyModel[52] = new ModelRendererTurbo(this, 2, 652, textureX, textureY); // Core51
		bodyModel[53] = new ModelRendererTurbo(this, 229, 372, textureX, textureY); // Core50
		bodyModel[54] = new ModelRendererTurbo(this, 342, 253, textureX, textureY); // Core5
		bodyModel[55] = new ModelRendererTurbo(this, 447, 118, textureX, textureY); // Core49
		bodyModel[56] = new ModelRendererTurbo(this, 193, 456, textureX, textureY); // Core48
		bodyModel[57] = new ModelRendererTurbo(this, 229, 395, textureX, textureY); // Core47
		bodyModel[58] = new ModelRendererTurbo(this, 447, 118, textureX, textureY); // Core46
		bodyModel[59] = new ModelRendererTurbo(this, 199, 446, textureX, textureY); // Core45
		bodyModel[60] = new ModelRendererTurbo(this, 217, 397, textureX, textureY); // Core45
		bodyModel[61] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core44
		bodyModel[62] = new ModelRendererTurbo(this, 193, 450, textureX, textureY); // Core43
		bodyModel[63] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core42
		bodyModel[64] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core41
		bodyModel[65] = new ModelRendererTurbo(this, 359, 178, textureX, textureY); // Core40
		bodyModel[66] = new ModelRendererTurbo(this, 342, 274, textureX, textureY); // Core4
		bodyModel[67] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core39
		bodyModel[68] = new ModelRendererTurbo(this, 172, 458, textureX, textureY); // Core38
		bodyModel[69] = new ModelRendererTurbo(this, 336, 140, textureX, textureY); // Core37
		bodyModel[70] = new ModelRendererTurbo(this, 3, 550, textureX, textureY); // Core36
		bodyModel[71] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core35
		bodyModel[72] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core34
		bodyModel[73] = new ModelRendererTurbo(this, 179, 464, textureX, textureY); // Core33
		bodyModel[74] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core32
		bodyModel[75] = new ModelRendererTurbo(this, 395, 118, textureX, textureY); // Core31
		bodyModel[76] = new ModelRendererTurbo(this, 116, 433, textureX, textureY); // Core301
		bodyModel[77] = new ModelRendererTurbo(this, 115, 450, textureX, textureY); // Core300
		bodyModel[78] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // core30
		bodyModel[79] = new ModelRendererTurbo(this, 342, 274, textureX, textureY); // Core3
		bodyModel[80] = new ModelRendererTurbo(this, 161, 437, textureX, textureY); // Core299
		bodyModel[81] = new ModelRendererTurbo(this, 161, 437, textureX, textureY); // Core298
		bodyModel[82] = new ModelRendererTurbo(this, 161, 437, textureX, textureY); // Core297
		bodyModel[83] = new ModelRendererTurbo(this, 161, 437, textureX, textureY); // Core296
		bodyModel[84] = new ModelRendererTurbo(this, 161, 437, textureX, textureY); // Core295
		bodyModel[85] = new ModelRendererTurbo(this, 269, 137, textureX, textureY); // Core294
		bodyModel[86] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core293
		bodyModel[87] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core292
		bodyModel[88] = new ModelRendererTurbo(this, 437, 300, textureX, textureY); // Core291
		bodyModel[89] = new ModelRendererTurbo(this, 222, 298, textureX, textureY); // Core290
		bodyModel[90] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core29
		bodyModel[91] = new ModelRendererTurbo(this, 162, 437, textureX, textureY); // Core289
		bodyModel[92] = new ModelRendererTurbo(this, 199, 184, textureX, textureY); // Core288
		bodyModel[93] = new ModelRendererTurbo(this, 199, 142, textureX, textureY); // Core287
		bodyModel[94] = new ModelRendererTurbo(this, 195, 237, textureX, textureY); // Core286
		bodyModel[95] = new ModelRendererTurbo(this, 195, 237, textureX, textureY); // Core285
		bodyModel[96] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core284
		bodyModel[97] = new ModelRendererTurbo(this, 258, 180, textureX, textureY); // Core283
		bodyModel[98] = new ModelRendererTurbo(this, 523, 236, textureX, textureY); // Core282
		bodyModel[99] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core281
		bodyModel[100] = new ModelRendererTurbo(this, 482, 236, textureX, textureY); // Core280
		bodyModel[101] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core28
		bodyModel[102] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core279
		bodyModel[103] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core278
		bodyModel[104] = new ModelRendererTurbo(this, 440, 236, textureX, textureY); // Core276
		bodyModel[105] = new ModelRendererTurbo(this, 394, 236, textureX, textureY); // Core275
		bodyModel[106] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core274
		bodyModel[107] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core273
		bodyModel[108] = new ModelRendererTurbo(this, 65, 413, textureX, textureY); // Core272
		bodyModel[109] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core271
		bodyModel[110] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core27
		bodyModel[111] = new ModelRendererTurbo(this, 437, 300, textureX, textureY); // Core269
		bodyModel[112] = new ModelRendererTurbo(this, 210, 429, textureX, textureY); // Core268
		bodyModel[113] = new ModelRendererTurbo(this, 343, 236, textureX, textureY); // Core267
		bodyModel[114] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core266
		bodyModel[115] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core265
		bodyModel[116] = new ModelRendererTurbo(this, 523, 236, textureX, textureY); // Core264
		bodyModel[117] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core263
		bodyModel[118] = new ModelRendererTurbo(this, 482, 236, textureX, textureY); // Core262
		bodyModel[119] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core261
		bodyModel[120] = new ModelRendererTurbo(this, 146, 648, textureX, textureY); // Core26
		bodyModel[121] = new ModelRendererTurbo(this, 440, 236, textureX, textureY); // Core259
		bodyModel[122] = new ModelRendererTurbo(this, 121, 701, textureX, textureY); // Core258
		bodyModel[123] = new ModelRendererTurbo(this, 394, 236, textureX, textureY); // Core257
		bodyModel[124] = new ModelRendererTurbo(this, 4, 708, textureX, textureY); // Core256
		bodyModel[125] = new ModelRendererTurbo(this, 340, 236, textureX, textureY); // Core255
		bodyModel[126] = new ModelRendererTurbo(this, 41, 703, textureX, textureY); // Core254
		bodyModel[127] = new ModelRendererTurbo(this, 430, 280, textureX, textureY); // Core253
		bodyModel[128] = new ModelRendererTurbo(this, 430, 280, textureX, textureY); // Core252
		bodyModel[129] = new ModelRendererTurbo(this, 78, 708, textureX, textureY); // Core251
		bodyModel[130] = new ModelRendererTurbo(this, 78, 708, textureX, textureY); // Core250
		bodyModel[131] = new ModelRendererTurbo(this, 3, 611, textureX, textureY); // Core25
		bodyModel[132] = new ModelRendererTurbo(this, 346, 226, textureX, textureY); // Core249
		bodyModel[133] = new ModelRendererTurbo(this, 4, 708, textureX, textureY); // Core248
		bodyModel[134] = new ModelRendererTurbo(this, 209, 438, textureX, textureY); // Core247
		bodyModel[135] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core246
		bodyModel[136] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core245
		bodyModel[137] = new ModelRendererTurbo(this, 65, 413, textureX, textureY); // Core244
		bodyModel[138] = new ModelRendererTurbo(this, 437, 300, textureX, textureY); // Core243
		bodyModel[139] = new ModelRendererTurbo(this, 423, 176, textureX, textureY); // Core242
		bodyModel[140] = new ModelRendererTurbo(this, 41, 703, textureX, textureY); // Core241
		bodyModel[141] = new ModelRendererTurbo(this, 158, 687, textureX, textureY); // Core24
		bodyModel[142] = new ModelRendererTurbo(this, 89, 622, textureX, textureY); // Core239
		bodyModel[143] = new ModelRendererTurbo(this, 402, 180, textureX, textureY); // Core238
		bodyModel[144] = new ModelRendererTurbo(this, 368, 160, textureX, textureY); // Core237
		bodyModel[145] = new ModelRendererTurbo(this, 149, 646, textureX, textureY); // Core236
		bodyModel[146] = new ModelRendererTurbo(this, 381, 158, textureX, textureY); // Core235
		bodyModel[147] = new ModelRendererTurbo(this, 148, 648, textureX, textureY); // Core234
		bodyModel[148] = new ModelRendererTurbo(this, 485, 115, textureX, textureY); // Core233
		bodyModel[149] = new ModelRendererTurbo(this, 396, 156, textureX, textureY); // Core232
		bodyModel[150] = new ModelRendererTurbo(this, 145, 643, textureX, textureY); // Core231
		bodyModel[151] = new ModelRendererTurbo(this, 343, 165, textureX, textureY); // Core230
		bodyModel[152] = new ModelRendererTurbo(this, 158, 653, textureX, textureY); // Core23
		bodyModel[153] = new ModelRendererTurbo(this, 148, 645, textureX, textureY); // Core229
		bodyModel[154] = new ModelRendererTurbo(this, 143, 47, textureX, textureY); // Core228
		bodyModel[155] = new ModelRendererTurbo(this, 148, 646, textureX, textureY); // Core227
		bodyModel[156] = new ModelRendererTurbo(this, 147, 642, textureX, textureY); // Core226
		bodyModel[157] = new ModelRendererTurbo(this, 349, 204, textureX, textureY); // Core225
		bodyModel[158] = new ModelRendererTurbo(this, 142, 647, textureX, textureY); // Core224
		bodyModel[159] = new ModelRendererTurbo(this, 346, 226, textureX, textureY); // Core223
		bodyModel[160] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core222
		bodyModel[161] = new ModelRendererTurbo(this, 199, 363, textureX, textureY); // Core221
		bodyModel[162] = new ModelRendererTurbo(this, 209, 448, textureX, textureY); // Core220
		bodyModel[163] = new ModelRendererTurbo(this, 158, 724, textureX, textureY); // Core22
		bodyModel[164] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core219
		bodyModel[165] = new ModelRendererTurbo(this, 423, 176, textureX, textureY); // Core218
		bodyModel[166] = new ModelRendererTurbo(this, 138, 603, textureX, textureY); // Core217
		bodyModel[167] = new ModelRendererTurbo(this, 402, 180, textureX, textureY); // Core216
		bodyModel[168] = new ModelRendererTurbo(this, 138, 603, textureX, textureY); // Core215
		bodyModel[169] = new ModelRendererTurbo(this, 138, 603, textureX, textureY); // Core214
		bodyModel[170] = new ModelRendererTurbo(this, 368, 160, textureX, textureY); // Core213
		bodyModel[171] = new ModelRendererTurbo(this, 381, 158, textureX, textureY); // Core212
		bodyModel[172] = new ModelRendererTurbo(this, 138, 603, textureX, textureY); // Core211
		bodyModel[173] = new ModelRendererTurbo(this, 138, 603, textureX, textureY); // Core210
		bodyModel[174] = new ModelRendererTurbo(this, 149, 668, textureX, textureY); // Core21
		bodyModel[175] = new ModelRendererTurbo(this, 483, 116, textureX, textureY); // Core209
		bodyModel[176] = new ModelRendererTurbo(this, 396, 156, textureX, textureY); // Core208
		bodyModel[177] = new ModelRendererTurbo(this, 138, 603, textureX, textureY); // Core207
		bodyModel[178] = new ModelRendererTurbo(this, 343, 165, textureX, textureY); // Core206
		bodyModel[179] = new ModelRendererTurbo(this, 211, 367, textureX, textureY); // Core205
		bodyModel[180] = new ModelRendererTurbo(this, 138, 603, textureX, textureY); // Core204
		bodyModel[181] = new ModelRendererTurbo(this, 211, 367, textureX, textureY); // Core203
		bodyModel[182] = new ModelRendererTurbo(this, 142, 54, textureX, textureY); // Core202
		bodyModel[183] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core201
		bodyModel[184] = new ModelRendererTurbo(this, 211, 367, textureX, textureY); // Core200
		bodyModel[185] = new ModelRendererTurbo(this, 149, 668, textureX, textureY); // Core20
		bodyModel[186] = new ModelRendererTurbo(this, 342, 263, textureX, textureY); // Core2
		bodyModel[187] = new ModelRendererTurbo(this, 349, 204, textureX, textureY); // Core199
		bodyModel[188] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core198
		bodyModel[189] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core197
		bodyModel[190] = new ModelRendererTurbo(this, 395, 118, textureX, textureY); // Core196
		bodyModel[191] = new ModelRendererTurbo(this, 203, 367, textureX, textureY); // Core195
		bodyModel[192] = new ModelRendererTurbo(this, 336, 140, textureX, textureY); // Core194
		bodyModel[193] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core193
		bodyModel[194] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core192
		bodyModel[195] = new ModelRendererTurbo(this, 368, 160, textureX, textureY); // Core191
		bodyModel[196] = new ModelRendererTurbo(this, 394, 101, textureX, textureY); // Core190
		bodyModel[197] = new ModelRendererTurbo(this, 149, 668, textureX, textureY); // Core19
		bodyModel[198] = new ModelRendererTurbo(this, 211, 371, textureX, textureY); // Core189
		bodyModel[199] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core188
		bodyModel[200] = new ModelRendererTurbo(this, 211, 371, textureX, textureY); // Core187
		bodyModel[201] = new ModelRendererTurbo(this, 401, 71, textureX, textureY); // Core186
		bodyModel[202] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core185
		bodyModel[203] = new ModelRendererTurbo(this, 401, 71, textureX, textureY); // Core184
		bodyModel[204] = new ModelRendererTurbo(this, 203, 359, textureX, textureY); // Core183
		bodyModel[205] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core182
		bodyModel[206] = new ModelRendererTurbo(this, 211, 367, textureX, textureY); // Core181
		bodyModel[207] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core180
		bodyModel[208] = new ModelRendererTurbo(this, 149, 668, textureX, textureY); // Core18
		bodyModel[209] = new ModelRendererTurbo(this, 405, 87, textureX, textureY); // Core179
		bodyModel[210] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core178
		bodyModel[211] = new ModelRendererTurbo(this, 211, 367, textureX, textureY); // Core177
		bodyModel[212] = new ModelRendererTurbo(this, 414, 70, textureX, textureY); // Core176
		bodyModel[213] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core175
		bodyModel[214] = new ModelRendererTurbo(this, 437, 300, textureX, textureY); // Core174
		bodyModel[215] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core173
		bodyModel[216] = new ModelRendererTurbo(this, 437, 300, textureX, textureY); // Core172
		bodyModel[217] = new ModelRendererTurbo(this, 211, 367, textureX, textureY); // Core171
		bodyModel[218] = new ModelRendererTurbo(this, 203, 367, textureX, textureY); // Core170
		bodyModel[219] = new ModelRendererTurbo(this, 149, 668, textureX, textureY); // Core17
		bodyModel[220] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core169
		bodyModel[221] = new ModelRendererTurbo(this, 437, 300, textureX, textureY); // Core168
		bodyModel[222] = new ModelRendererTurbo(this, 436, 300, textureX, textureY); // Core167
		bodyModel[223] = new ModelRendererTurbo(this, 211, 371, textureX, textureY); // Core166
		bodyModel[224] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core165
		bodyModel[225] = new ModelRendererTurbo(this, 436, 300, textureX, textureY); // Core164
		bodyModel[226] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core163
		bodyModel[227] = new ModelRendererTurbo(this, 211, 371, textureX, textureY); // Core162
		bodyModel[228] = new ModelRendererTurbo(this, 381, 158, textureX, textureY); // Core161
		bodyModel[229] = new ModelRendererTurbo(this, 210, 457, textureX, textureY); // Core161
		bodyModel[230] = new ModelRendererTurbo(this, 149, 668, textureX, textureY); // Core16
		bodyModel[231] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core159
		bodyModel[232] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core158
		bodyModel[233] = new ModelRendererTurbo(this, 436, 300, textureX, textureY); // Core157
		bodyModel[234] = new ModelRendererTurbo(this, 203, 359, textureX, textureY); // Core156
		bodyModel[235] = new ModelRendererTurbo(this, 60, 645, textureX, textureY); // Core155
		bodyModel[236] = new ModelRendererTurbo(this, 138, 616, textureX, textureY); // Core154
		bodyModel[237] = new ModelRendererTurbo(this, 482, 129, textureX, textureY); // Core153
		bodyModel[238] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Core152
		bodyModel[239] = new ModelRendererTurbo(this, 447, 118, textureX, textureY); // Core151
		bodyModel[240] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Core150
		bodyModel[241] = new ModelRendererTurbo(this, 149, 668, textureX, textureY); // Core15
		bodyModel[242] = new ModelRendererTurbo(this, 60, 645, textureX, textureY); // Core149
		bodyModel[243] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Core148
		bodyModel[244] = new ModelRendererTurbo(this, 88, 622, textureX, textureY); // Core146
		bodyModel[245] = new ModelRendererTurbo(this, 447, 118, textureX, textureY); // Core145
		bodyModel[246] = new ModelRendererTurbo(this, 447, 118, textureX, textureY); // Core144
		bodyModel[247] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Core143
		bodyModel[248] = new ModelRendererTurbo(this, 422, 111, textureX, textureY); // Core142
		bodyModel[249] = new ModelRendererTurbo(this, 68, 610, textureX, textureY); // Core141
		bodyModel[250] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Core140
		bodyModel[251] = new ModelRendererTurbo(this, 149, 668, textureX, textureY); // Core14
		bodyModel[252] = new ModelRendererTurbo(this, 208, 318, textureX, textureY); // Core139
		bodyModel[253] = new ModelRendererTurbo(this, 447, 118, textureX, textureY); // Core138
		bodyModel[254] = new ModelRendererTurbo(this, 346, 221, textureX, textureY); // Core137
		bodyModel[255] = new ModelRendererTurbo(this, 68, 618, textureX, textureY); // Core136
		bodyModel[256] = new ModelRendererTurbo(this, 208, 304, textureX, textureY); // Core135
		bodyModel[257] = new ModelRendererTurbo(this, 349, 193, textureX, textureY); // Core134
		bodyModel[258] = new ModelRendererTurbo(this, 68, 628, textureX, textureY); // Core133
		bodyModel[259] = new ModelRendererTurbo(this, 208, 310, textureX, textureY); // Core132
		bodyModel[260] = new ModelRendererTurbo(this, 342, 231, textureX, textureY); // Core131
		bodyModel[261] = new ModelRendererTurbo(this, 68, 610, textureX, textureY); // Core130
		bodyModel[262] = new ModelRendererTurbo(this, 144, 696, textureX, textureY); // Core13
		bodyModel[263] = new ModelRendererTurbo(this, 423, 176, textureX, textureY); // Core129
		bodyModel[264] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Core128
		bodyModel[265] = new ModelRendererTurbo(this, 68, 618, textureX, textureY); // Core127
		bodyModel[266] = new ModelRendererTurbo(this, 173, 442, textureX, textureY); // Core126
		bodyModel[267] = new ModelRendererTurbo(this, 192, 384, textureX, textureY); // Core125
		bodyModel[268] = new ModelRendererTurbo(this, 224, 383, textureX, textureY); // Core124
		bodyModel[269] = new ModelRendererTurbo(this, 396, 156, textureX, textureY); // Core123
		bodyModel[270] = new ModelRendererTurbo(this, 202, 231, textureX, textureY); // Core122
		bodyModel[271] = new ModelRendererTurbo(this, 402, 180, textureX, textureY); // Core121
		bodyModel[272] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Core120
		bodyModel[273] = new ModelRendererTurbo(this, 145, 705, textureX, textureY); // Core12
		bodyModel[274] = new ModelRendererTurbo(this, 68, 628, textureX, textureY); // Core119
		bodyModel[275] = new ModelRendererTurbo(this, 359, 178, textureX, textureY); // Core118
		bodyModel[276] = new ModelRendererTurbo(this, 62, 598, textureX, textureY); // Core117
		bodyModel[277] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Core116
		bodyModel[278] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Core115
		bodyModel[279] = new ModelRendererTurbo(this, 62, 598, textureX, textureY); // Core114
		bodyModel[280] = new ModelRendererTurbo(this, 343, 165, textureX, textureY); // Core113
		bodyModel[281] = new ModelRendererTurbo(this, 396, 156, textureX, textureY); // Core112
		bodyModel[282] = new ModelRendererTurbo(this, 62, 598, textureX, textureY); // Core111
		bodyModel[283] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Core110
		bodyModel[284] = new ModelRendererTurbo(this, 145, 705, textureX, textureY); // Core11
		bodyModel[285] = new ModelRendererTurbo(this, 62, 598, textureX, textureY); // Core109
		bodyModel[286] = new ModelRendererTurbo(this, 215, 432, textureX, textureY); // Core108
		bodyModel[287] = new ModelRendererTurbo(this, 381, 158, textureX, textureY); // Core107
		bodyModel[288] = new ModelRendererTurbo(this, 394, 101, textureX, textureY); // Core106
		bodyModel[289] = new ModelRendererTurbo(this, 368, 160, textureX, textureY); // Core105
		bodyModel[290] = new ModelRendererTurbo(this, 62, 598, textureX, textureY); // Core104
		bodyModel[291] = new ModelRendererTurbo(this, 223, 317, textureX, textureY); // Core103
		bodyModel[292] = new ModelRendererTurbo(this, 346, 221, textureX, textureY); // Core102
		bodyModel[293] = new ModelRendererTurbo(this, 62, 598, textureX, textureY); // Core101
		bodyModel[294] = new ModelRendererTurbo(this, 176, 606, textureX, textureY); // Core100
		bodyModel[295] = new ModelRendererTurbo(this, 144, 696, textureX, textureY); // Core10
		bodyModel[296] = new ModelRendererTurbo(this, 342, 253, textureX, textureY); // Core1
		bodyModel[297] = new ModelRendererTurbo(this, 197, 71, textureX, textureY); // Core1
		bodyModel[298] = new ModelRendererTurbo(this, 393, 390, textureX, textureY); // StGlorianaCore1
		bodyModel[299] = new ModelRendererTurbo(this, 393, 390, textureX, textureY); // StGlorianaCore2

		bodyModel[0].addShapeBox(40F, 9F, -18F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Core99
		bodyModel[0].setRotationPoint(0F, -26F, 0F);

		bodyModel[1].addShapeBox(40F, 7F, -18F, 2, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core98
		bodyModel[1].setRotationPoint(0F, -26F, 0F);

		bodyModel[2].addShapeBox(38F, 16F, -19F, 5, 7, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Core97
		bodyModel[2].setRotationPoint(0F, -26F, 0F);

		bodyModel[3].addShapeBox(-38F, -2F, -20.5F, 18, 2, 5, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core96
		bodyModel[3].setRotationPoint(0F, -26F, 0F);

		bodyModel[4].addShapeBox(-59.5F, 16F, 28F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F); // Core95
		bodyModel[4].setRotationPoint(0F, -26F, 0F);

		bodyModel[5].addShapeBox(40F, 6F, -18F, 2, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core94
		bodyModel[5].setRotationPoint(0F, -26F, 0F);

		bodyModel[6].addShapeBox(-5.5F, -2F, 22F, 1, 2, 3, 0F,0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F); // Core93
		bodyModel[6].setRotationPoint(0F, -26F, 0F);

		bodyModel[7].addBox(-51F, 18F, 28F, 93, 7, 1, 0F); // Core92
		bodyModel[7].setRotationPoint(0F, -26F, 0F);

		bodyModel[8].addShapeBox(50F, 9F, 27F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F); // Core91
		bodyModel[8].setRotationPoint(0F, -26F, 0F);

		bodyModel[9].addShapeBox(42F, 6F, -18F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core90
		bodyModel[9].setRotationPoint(0F, -26F, 0F);

		bodyModel[10].addBox(-59.5F, 14.5F, 13F, 1, 1, 3, 0F); // Core9
		bodyModel[10].setRotationPoint(0F, -26F, 0F);

		bodyModel[11].addShapeBox(50F, 9F, 19F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F); // Core89
		bodyModel[11].setRotationPoint(0F, -26F, 0F);

		bodyModel[12].addBox(-8F, -2F, 22F, 2, 2, 3, 0F); // Core88
		bodyModel[12].setRotationPoint(0F, -26F, 0F);

		bodyModel[13].addShapeBox(42F, 17F, 28F, 8, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F); // Core87
		bodyModel[13].setRotationPoint(0F, -26F, 0F);

		bodyModel[14].addShapeBox(45F, -2F, 26F, 1, 2, 1, 0F,0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F); // Core86
		bodyModel[14].setRotationPoint(0F, -26F, 0F);
		bodyModel[14].rotateAngleZ = -0.15707963F;

		bodyModel[15].addBox(28.5F, 1.5F, -2.5F, 3, 1, 5, 0F); // Core85
		bodyModel[15].setRotationPoint(0F, -26F, 0F);

		bodyModel[16].addShapeBox(46F, 11.5F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, -.5F, -3F, -1.5F, -.5F, -3F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, -.5F, 3.5F, -1.5F, -.5F, 3.5F, 1F, 0F, 0F, 0F); // Core84
		bodyModel[16].setRotationPoint(-1F, -26F, 0F);

		bodyModel[17].addBox(-61F, 6F, 28F, 96, 6, 1, 0F); // Core83
		bodyModel[17].setRotationPoint(0F, -26F, 0F);

		bodyModel[18].addShapeBox(42F, 9F, -18F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core82
		bodyModel[18].setRotationPoint(0F, -26F, 0F);

		bodyModel[19].addShapeBox(36F, 9F, -19F, 9, 6, 38, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core81
		bodyModel[19].setRotationPoint(0F, -26F, 0F);

		bodyModel[20].addBox(-51F, 16F, 28F, 93, 2, 1, 0F); // Core80
		bodyModel[20].setRotationPoint(0F, -26F, 0F);

		bodyModel[21].addShapeBox(-67F, 5F, -6F, 6, 3, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -2F, .2F, 0F); // Core8
		bodyModel[21].setRotationPoint(0F, -22F, 0F);

		bodyModel[22].addBox(-9F, -1.5F, 23F, 20, 1, 1, 0F); // Core79
		bodyModel[22].setRotationPoint(0F, -26F, 0F);

		bodyModel[23].addBox(7F, -2F, 22F, 3, 2, 3, 0F); // Core78
		bodyModel[23].setRotationPoint(0F, -26F, 0F);

		bodyModel[24].addShapeBox(31F, 15F, -19F, 16, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core77
		bodyModel[24].setRotationPoint(0F, -26F, 0F);

		bodyModel[25].addShapeBox(37F, -2F, 21F, 8, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core76
		bodyModel[25].setRotationPoint(0F, -26F, 0F);
		bodyModel[25].rotateAngleZ = -0.15707963F;

		bodyModel[26].addShapeBox(42F, 12F, 28F, 8, 2, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Core75
		bodyModel[26].setRotationPoint(0F, -26F, 0F);

		bodyModel[27].addBox(42F, 7F, -18F, 1, 2, 4, 0F); // Core74
		bodyModel[27].setRotationPoint(0F, -26F, 0F);

		bodyModel[28].addShapeBox(34F, -2.5F, -23.5F, 1, 4, 1, 0F,0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Core73
		bodyModel[28].setRotationPoint(0F, -26F, 0F);
		bodyModel[28].rotateAngleZ = -0.12217305F;

		bodyModel[29].addShapeBox(31F, 16F, -19F, 7, 8, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core72
		bodyModel[29].setRotationPoint(0F, -26F, 0F);

		bodyModel[30].addBox(30F, 0.5F, -0.5F, 1, 1, 1, 0F); // Core71
		bodyModel[30].setRotationPoint(0F, -26F, 0F);

		bodyModel[31].addShapeBox(-61F, 14F, 28F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Core70
		bodyModel[31].setRotationPoint(0F, -26F, 0F);

		bodyModel[32].addShapeBox(-67F, 5F, 5F, 6, 3, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -2F, .2F, 0F); // Core7
		bodyModel[32].setRotationPoint(0F, -22F, 0F);

		bodyModel[33].addBox(28F, 2F, -26F, 4, 3, 4, 0F); // Core69
		bodyModel[33].setRotationPoint(0F, -26F, -0.5F);

		bodyModel[34].addBox(-61F, 12F, 28F, 2, 2, 1, 0F); // Core68
		bodyModel[34].setRotationPoint(0F, -26F, 0F);

		bodyModel[35].addShapeBox(34F, -2.5F, -26.5F, 1, 4, 1, 0F,0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Core67
		bodyModel[35].setRotationPoint(0F, -26F, 0F);
		bodyModel[35].rotateAngleZ = -0.12217305F;

		bodyModel[36].addShapeBox(30.5F, 0.5F, -1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Core66
		bodyModel[36].setRotationPoint(0F, -26F, 0F);

		bodyModel[37].addShapeBox(46F, 7F, 19F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Core65
		bodyModel[37].setRotationPoint(0F, -26F, 0F);

		bodyModel[38].addShapeBox(46.8F, 0F, -27F, 1, 1, 3, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core64
		bodyModel[38].setRotationPoint(0F, -26F, 0F);

		bodyModel[39].addShapeBox(33F, 5F, 19F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Core63
		bodyModel[39].setRotationPoint(0F, -26F, 0F);

		bodyModel[40].addBox(-59F, 12F, 28F, 21, 4, 1, 0F); // Core62
		bodyModel[40].setRotationPoint(0F, -26F, 0F);

		bodyModel[41].addShapeBox(43F, 11F, -19F, 2, 4, 38, 0F,0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core61
		bodyModel[41].setRotationPoint(2F, -26F, 0F);

		bodyModel[42].addBox(-28F, 12F, 19F, 3, 4, 10, 0F); // Core60
		bodyModel[42].setRotationPoint(0F, -26F, 0F);

		bodyModel[43].addBox(-64.5F, 12F, 17F, 13, 5, 3, 0F); // Core6
		bodyModel[43].setRotationPoint(0F, -26F, 0F);

		bodyModel[44].addShapeBox(45.5F, 7.5F, -22.5F, 3, 1, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core59
		bodyModel[44].setRotationPoint(0F, -26F, 0F);

		bodyModel[45].addShapeBox(29F, 0F, -1.5F, 1, 1, 3, 0F,0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F); // Core58
		bodyModel[45].setRotationPoint(0F, -26F, 0F);

		bodyModel[46].addShapeBox(34F, -2.5F, 25.5F, 1, 4, 1, 0F,0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Core57
		bodyModel[46].setRotationPoint(0F, -26F, 0F);
		bodyModel[46].rotateAngleZ = -0.12217305F;

		bodyModel[47].addShapeBox(34F, -2.5F, 22.5F, 1, 4, 1, 0F,0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Core56
		bodyModel[47].setRotationPoint(0F, -26F, 0F);
		bodyModel[47].rotateAngleZ = -0.12217305F;

		bodyModel[48].addShapeBox(30F, 0F, -1.5F, 2, 1, 3, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Core55
		bodyModel[48].setRotationPoint(0F, -26F, 0F);

		bodyModel[49].addShapeBox(31F, 8F, -19F, 5, 7, 38, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core54
		bodyModel[49].setRotationPoint(0F, -26F, 0F);

		bodyModel[50].addShapeBox(45.5F, 7.5F, -26.5F, 3, 1, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core53
		bodyModel[50].setRotationPoint(0F, -26F, 0F);

		bodyModel[51].addBox(-16F, 12F, 19F, 3, 4, 10, 0F); // Core52
		bodyModel[51].setRotationPoint(0F, -26F, 0F);

		bodyModel[52].addBox(-63F, 6F, -19F, 23, 6, 38, 0F); // Core51
		bodyModel[52].setRotationPoint(0F, -27F, 0F);

		bodyModel[53].addBox(26F, 2F, 23F, 6, 3, 3, 0F); // Core50
		bodyModel[53].setRotationPoint(0F, -26F, 0F);

		bodyModel[54].addShapeBox(-64.5F, 8F, 17F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core5
		bodyModel[54].setRotationPoint(0F, -26F, 0F);

		bodyModel[55].addBox(-4F, 12F, 19F, 3, 4, 10, 0F); // Core49
		bodyModel[55].setRotationPoint(0F, -26F, 0F);

		bodyModel[56].addShapeBox(28.5F, 0.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core48
		bodyModel[56].setRotationPoint(0F, -26F, 0F);

		bodyModel[57].addShapeBox(47F, 7.5F, -26.5F, 1, 1, 5, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core47
		bodyModel[57].setRotationPoint(0F, -26F, 0F);

		bodyModel[58].addBox(11F, 12F, 19F, 3, 4, 10, 0F); // Core46
		bodyModel[58].setRotationPoint(0F, -26F, 0F);

		bodyModel[59].addShapeBox(30.5F, 0.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Core45
		bodyModel[59].setRotationPoint(0F, -26F, 0F);

		bodyModel[60].addShapeBox(47F, -0.5F, -26F, 1, 9, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core45
		bodyModel[60].setRotationPoint(0F, -26F, 0F);

		bodyModel[61].addShapeBox(45F, 17.5F, 5F, 4, 1, 1, 0F,0F, 0F, -.5F, -.5F, 1.5F, 1F, -.5F, 1.5F, -1.5F, 0F, 0F, 0F, 0F, 1F, 0F, -.5F, -1.5F, 1F, -.5F, -1.5F, -1.5F, 0F, 1F, 0F); // Core44
		bodyModel[61].setRotationPoint(-1F, -26F, 0F);

		bodyModel[62].addBox(29.5F, 0.5F, -1.5F, 1, 1, 3, 0F); // Core43
		bodyModel[62].setRotationPoint(0F, -26F, 0F);

		bodyModel[63].addShapeBox(48F, 16F, 3.5F, 1, 1, 1, 0F,0F, 1.5F, -.7F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 1.5F, .3F, 0F, 0F, -.7F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, .3F); // Core42
		bodyModel[63].setRotationPoint(-1F, -26F, 0F);

		bodyModel[64].addShapeBox(36F, -2F, -27F, 1, 2, 1, 0F,-.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F); // Core41
		bodyModel[64].setRotationPoint(0F, -26F, 0F);
		bodyModel[64].rotateAngleZ = -0.15707963F;

		bodyModel[65].addBox(30F, 12F, 19F, 12, 4, 10, 0F); // Core40
		bodyModel[65].setRotationPoint(0F, -26F, 0F);

		bodyModel[66].addShapeBox(-64.5F, 17F, 17F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Core4
		bodyModel[66].setRotationPoint(0F, -26F, 0F);

		bodyModel[67].addShapeBox(36F, -2F, 21F, 1, 2, 1, 0F,-.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F); // Core39
		bodyModel[67].setRotationPoint(0F, -26F, 0F);
		bodyModel[67].rotateAngleZ = -0.15707963F;

		bodyModel[68].addShapeBox(27.5F, 1.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core38
		bodyModel[68].setRotationPoint(0F, -26F, 0F);

		bodyModel[69].addBox(-61F, 5F, -29F, 94, 1, 10, 0F); // Core37
		bodyModel[69].setRotationPoint(0F, -26F, 0F);

		bodyModel[70].addShapeBox(-67F, 6F, -19F, 4, 6, 38, 0F,-1.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F); // Core36
		bodyModel[70].setRotationPoint(0F, -27F, 0F);

		bodyModel[71].addShapeBox(37F, 8.5F, -10F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, 3.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 3F, -4F, 0F, 3F, 4F, 0F, 0F, 0F); // Core35
		bodyModel[71].setRotationPoint(-1F, -26F, 0F);

		bodyModel[72].addShapeBox(32F, 7.5F, -13F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 2.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 3F, 0F, 0F, 0F); // Core34
		bodyModel[72].setRotationPoint(-1F, -26F, 0F);

		bodyModel[73].addShapeBox(30F, 2F, -4F, 3, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core33
		bodyModel[73].setRotationPoint(0F, -26F, 0F);

		bodyModel[74].addShapeBox(45F, -2F, 21F, 1, 2, 1, 0F,0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F); // Core32
		bodyModel[74].setRotationPoint(0F, -26F, 0F);
		bodyModel[74].rotateAngleZ = -0.15707963F;

		bodyModel[75].addShapeBox(-66F, 6F, 19F, 2, 1, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F); // Core31
		bodyModel[75].setRotationPoint(1F, -26F, 0F);

		bodyModel[76].addShapeBox(18F, -5F, -7F, 8, 1, 14, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core301
		bodyModel[76].setRotationPoint(0F, -25F, 0F);
		bodyModel[76].rotateAngleZ = -0.13962634F;

		bodyModel[77].addShapeBox(17F, -4F, -7F, 10, 1, 14, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core300
		bodyModel[77].setRotationPoint(0F, -25F, 0F);
		bodyModel[77].rotateAngleZ = -0.13962634F;

		bodyModel[78].addShapeBox(-60F, 17F, 6F, 4, 1, 1, 0F,-1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // core30
		bodyModel[78].setRotationPoint(0F, -26F, 0F);

		bodyModel[79].addShapeBox(-64.5F, 17F, -20F, 13, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Core3
		bodyModel[79].setRotationPoint(0F, -26F, 0F);

		bodyModel[80].addShapeBox(16.5F, -3.5F, -9F, 11, 1, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core299
		bodyModel[80].setRotationPoint(0F, -25F, 0F);
		bodyModel[80].rotateAngleZ = -0.13962634F;

		bodyModel[81].addShapeBox(17F, -4.5F, -9F, 10, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core298
		bodyModel[81].setRotationPoint(0F, -25F, 0F);
		bodyModel[81].rotateAngleZ = -0.13962634F;

		bodyModel[82].addShapeBox(18F, -5.5F, -9F, 8, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core297
		bodyModel[82].setRotationPoint(0F, -25F, 0F);
		bodyModel[82].rotateAngleZ = -0.13962634F;

		bodyModel[83].addShapeBox(16.5F, -3.5F, 7F, 11, 1, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core296
		bodyModel[83].setRotationPoint(0F, -25F, 0F);
		bodyModel[83].rotateAngleZ = -0.13962634F;

		bodyModel[84].addShapeBox(18F, -5.5F, 7F, 8, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core295
		bodyModel[84].setRotationPoint(0F, -25F, 0F);
		bodyModel[84].rotateAngleZ = -0.13962634F;

		bodyModel[85].addShapeBox(-18F, -1F, -19F, 8, 1, 38, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Core294
		bodyModel[85].setRotationPoint(0F, -26F, 0F);

		bodyModel[86].addShapeBox(46F, 11.5F, 5F, 3, 1, 1, 0F,0F, 0F, -.5F, -.5F, -3F, 1F, -.5F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 3.5F, 1F, -.5F, 3.5F, -1.5F, 0F, 0F, 0F); // Core293
		bodyModel[86].setRotationPoint(-1F, -26F, 0F);

		bodyModel[87].addShapeBox(37F, -2F, -27F, 8, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core292
		bodyModel[87].setRotationPoint(0F, -26F, 0F);
		bodyModel[87].rotateAngleZ = -0.15707963F;

		bodyModel[88].addShapeBox(-64F, 9F, 28F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F); // Core291
		bodyModel[88].setRotationPoint(1F, -26F, 0F);

		bodyModel[89].addBox(12F, 5F, -19F, 19, 19, 38, 0F); // Core290
		bodyModel[89].setRotationPoint(0F, -26F, 0F);

		bodyModel[90].addShapeBox(-63F, 16F, 6F, 4, 1, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F); // Core29
		bodyModel[90].setRotationPoint(0F, -26F, 0F);

		bodyModel[91].addShapeBox(17F, -4.5F, 7F, 10, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core289
		bodyModel[91].setRotationPoint(0F, -25F, 0F);
		bodyModel[91].rotateAngleZ = -0.13962634F;

		bodyModel[92].addShapeBox(12F, 0F, -19F, 8, 2, 38, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Core288
		bodyModel[92].setRotationPoint(0F, -26F, 0F);

		bodyModel[93].addShapeBox(12F, -1F, -19F, 8, 1, 38, 0F,0F, 0F, 0F, -.5F, 0F, -5F, -.5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Core287
		bodyModel[93].setRotationPoint(0F, -26F, 0F);

		bodyModel[94].addShapeBox(-10F, -1F, -27F, 22, 1, 8, 0F,0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core286
		bodyModel[94].setRotationPoint(0F, -26F, 0F);

		bodyModel[95].addShapeBox(-10F, -1F, 19F, 22, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core285
		bodyModel[95].setRotationPoint(0F, -26F, 0F);

		bodyModel[96].addShapeBox(-60F, 20F, 6F, 4, 1, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F); // Core284
		bodyModel[96].setRotationPoint(0F, -26F, 0F);

		bodyModel[97].addBox(-10F, -1F, -19F, 22, 1, 38, 0F); // Core283
		bodyModel[97].setRotationPoint(0F, -26F, 0F);

		bodyModel[98].addShapeBox(-38F, 12F, -28F, 10, 4, 9, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core282
		bodyModel[98].setRotationPoint(0F, -26F, 0F);

		bodyModel[99].addShapeBox(-60F, 18F, 6F, 4, 2, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core281
		bodyModel[99].setRotationPoint(0F, -26F, 0F);

		bodyModel[100].addShapeBox(-25F, 12F, -28F, 9, 4, 9, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core280
		bodyModel[100].setRotationPoint(0F, -26F, 0F);

		bodyModel[101].addShapeBox(-63F, 14F, 6F, 4, 2, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core28
		bodyModel[101].setRotationPoint(0F, -26F, 0F);

		bodyModel[102].addShapeBox(-61.5F, 17F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Core279
		bodyModel[102].setRotationPoint(0F, -26F, 0F);

		bodyModel[103].addShapeBox(-61.5F, 17F, -7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Core278
		bodyModel[103].setRotationPoint(0F, -26F, 0F);

		bodyModel[104].addShapeBox(-14F, 12F, -28F, 10, 4, 9, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core276
		bodyModel[104].setRotationPoint(0F, -26F, 0F);

		bodyModel[105].addShapeBox(-1F, 12F, -28F, 12, 4, 9, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core275
		bodyModel[105].setRotationPoint(0F, -26F, 0F);

		bodyModel[106].addShapeBox(-60F, 17F, -7F, 4, 1, 1, 0F,-1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core274
		bodyModel[106].setRotationPoint(0F, -26F, 0F);

		bodyModel[107].addShapeBox(37F, 8.5F, 9F, 9, 1, 1, 0F,0F, 0F, -.5F, 0F, -3F, 3.5F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 4F, 0F, 3F, -4F, 0F, 0F, 0F); // Core273
		bodyModel[107].setRotationPoint(-1F, -26F, 0F);

		bodyModel[108].addShapeBox(-40F, 0F, -29F, 52, 5, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core272
		bodyModel[108].setRotationPoint(0F, -26F, 0F);

		bodyModel[109].addShapeBox(45F, -2F, -27F, 1, 2, 1, 0F,0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F); // Core271
		bodyModel[109].setRotationPoint(0F, -26F, 0F);
		bodyModel[109].rotateAngleZ = -0.15707963F;

		bodyModel[110].addShapeBox(-63F, 13F, 6F, 4, 1, 1, 0F,-1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core27
		bodyModel[110].setRotationPoint(0F, -26F, 0F);

		bodyModel[111].addShapeBox(-66F, 7F, 28F, 2, 2, 1, 0F,-.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, -2.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2.5F, 1.5F, 0F); // Core269
		bodyModel[111].setRotationPoint(1F, -26F, 0F);

		bodyModel[112].addShapeBox(30F, 2F, -12F, 2, 2, 4, 0F,0F, 0F, 0F, -.2F, -2F, -1F, -.2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, .5F, -1F, -.2F, .5F, 0F, 0F, 0F, 0F); // Core268
		bodyModel[112].setRotationPoint(0F, -26F, 0F);

		bodyModel[113].addShapeBox(14F, 12F, -28F, 16, 4, 9, 0F,0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core267
		bodyModel[113].setRotationPoint(0F, -26F, 0F);

		bodyModel[114].addShapeBox(-60F, 18F, -7F, 4, 2, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core266
		bodyModel[114].setRotationPoint(0F, -26F, 0F);

		bodyModel[115].addShapeBox(-60F, 20F, -7F, 4, 1, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F); // Core265
		bodyModel[115].setRotationPoint(0F, -26F, 0F);

		bodyModel[116].addShapeBox(-38F, 12F, 19F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core264
		bodyModel[116].setRotationPoint(0F, -26F, 0F);

		bodyModel[117].addShapeBox(-63F, 13F, -7F, 4, 1, 1, 0F,-1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core263
		bodyModel[117].setRotationPoint(0F, -26F, 0F);

		bodyModel[118].addShapeBox(-25F, 12F, 19F, 9, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core262
		bodyModel[118].setRotationPoint(0F, -26F, 0F);

		bodyModel[119].addShapeBox(-63F, 14F, -7F, 4, 2, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Core261
		bodyModel[119].setRotationPoint(0F, -26F, 0F);

		bodyModel[120].addFlexTrapezoid(-58.5F, 18.5F, -16F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Core26
		bodyModel[120].setRotationPoint(0F, -26F, 0F);

		bodyModel[121].addShapeBox(-14F, 12F, 19F, 10, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core259
		bodyModel[121].setRotationPoint(0F, -26F, 0F);

		bodyModel[122].addShapeBox(-63F, 16F, -7F, 4, 1, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F); // Core258
		bodyModel[122].setRotationPoint(0F, -26F, 0F);

		bodyModel[123].addShapeBox(-1F, 12F, 19F, 12, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core257
		bodyModel[123].setRotationPoint(0F, -26F, 0F);

		bodyModel[124].addShapeBox(-63F, 13F, -13F, 4, 1, 26, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core256
		bodyModel[124].setRotationPoint(0F, -26F, 0F);

		bodyModel[125].addShapeBox(14F, 12F, 19F, 16, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core255
		bodyModel[125].setRotationPoint(0F, -26F, 0F);

		bodyModel[126].addFlexTrapezoid(-63F, 14F, -13F, 4, 2, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Core254
		bodyModel[126].setRotationPoint(0F, -26F, 0F);

		bodyModel[127].addBox(-41F, 12F, -28F, 3, 4, 9, 0F); // Core253
		bodyModel[127].setRotationPoint(0F, -26F, 0F);

		bodyModel[128].addBox(-41F, 12F, 19F, 3, 4, 9, 0F); // Core252
		bodyModel[128].setRotationPoint(0F, -26F, 0F);

		bodyModel[129].addShapeBox(-60F, 20F, -13F, 4, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core251
		bodyModel[129].setRotationPoint(0F, -26F, 0F);

		bodyModel[130].addShapeBox(-63F, 16F, -13F, 4, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core250
		bodyModel[130].setRotationPoint(0F, -26F, 0F);

		bodyModel[131].addBox(-68F, 5F, -14F, 5, 4, 28, 0F); // Core25
		bodyModel[131].setRotationPoint(0F, -26F, 0F);

		bodyModel[132].addShapeBox(-46F, 25F, -20F, 88, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Core249
		bodyModel[132].setRotationPoint(0F, -26F, 0F);

		bodyModel[133].addShapeBox(-60F, 17F, -13F, 4, 1, 26, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core248
		bodyModel[133].setRotationPoint(0F, -26F, 0F);

		bodyModel[134].addShapeBox(30F, 2F, -8F, 2, 2, 4, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core247
		bodyModel[134].setRotationPoint(0F, -26F, 0F);

		bodyModel[135].addShapeBox(37F, -2F, -22F, 8, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core246
		bodyModel[135].setRotationPoint(0F, -26F, 0F);
		bodyModel[135].rotateAngleZ = -0.15707963F;

		bodyModel[136].addShapeBox(32F, 7.5F, 12F, 5, 1, 1, 0F,0F, 0F, -.5F, 0F, -1F, 2.5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3F, 0F, 1F, -3F, 0F, 0F, 0F); // Core245
		bodyModel[136].setRotationPoint(-1F, -26F, 0F);

		bodyModel[137].addShapeBox(-40F, 0F, 19F, 52, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core244
		bodyModel[137].setRotationPoint(0F, -26F, 0F);

		bodyModel[138].addShapeBox(-64F, 6F, 28F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core243
		bodyModel[138].setRotationPoint(1F, -26F, 0F);

		bodyModel[139].addShapeBox(42F, 17F, -20F, 8, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F); // Core242
		bodyModel[139].setRotationPoint(0F, -26F, 0F);

		bodyModel[140].addFlexTrapezoid(-60F, 18F, -13F, 4, 2, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Core241
		bodyModel[140].setRotationPoint(0F, -26F, 0F);

		bodyModel[141].addBox(-74F, 1F, -14F, 7, 3, 28, 0F); // Core24
		bodyModel[141].setRotationPoint(0F, -26F, 0F);

		bodyModel[142].addBox(-62F, -9.3F, -21F, 1, 1, 42, 0F); // Core239
		bodyModel[142].setRotationPoint(0F, -26F, 0F);
		bodyModel[142].rotateAngleZ = 0.19198622F;

		bodyModel[143].addShapeBox(42F, 12F, -20F, 8, 2, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Core238
		bodyModel[143].setRotationPoint(0F, -26F, 0F);

		bodyModel[144].addShapeBox(50F, 10F, -20F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core237
		bodyModel[144].setRotationPoint(0F, -26F, 0F);

		bodyModel[145].addShapeBox(-68F, -3.3F, 15F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Core236
		bodyModel[145].setRotationPoint(0F, -26F, 0F);
		bodyModel[145].rotateAngleZ = 0.19198622F;

		bodyModel[146].addShapeBox(46F, 8F, -20F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core235
		bodyModel[146].setRotationPoint(0F, -26F, 0F);

		bodyModel[147].addShapeBox(-68F, -9.3F, 15F, 1, 6, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core234
		bodyModel[147].setRotationPoint(0F, -26F, 0F);
		bodyModel[147].rotateAngleZ = 0.19198622F;

		bodyModel[148].addBox(30F, 12F, -20F, 12, 4, 1, 0F); // Core233
		bodyModel[148].setRotationPoint(0F, -26F, 0F);

		bodyModel[149].addShapeBox(33F, 6F, -20F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core232
		bodyModel[149].setRotationPoint(0F, -26F, 0F);

		bodyModel[150].addShapeBox(-68F, -9.3F, 16F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core231
		bodyModel[150].setRotationPoint(0F, -26F, 0F);
		bodyModel[150].rotateAngleZ = 0.19198622F;

		bodyModel[151].addBox(-61F, 6F, -20F, 96, 6, 1, 0F); // Core230
		bodyModel[151].setRotationPoint(0F, -26F, 0F);

		bodyModel[152].addShapeBox(-74F, -1F, -14F, 7, 2, 28, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core23
		bodyModel[152].setRotationPoint(0F, -26F, 0F);

		bodyModel[153].addShapeBox(-61F, 3.7F, -16F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F); // Core229
		bodyModel[153].setRotationPoint(0F, -26F, 0F);
		bodyModel[153].rotateAngleZ = 0.19198622F;

		bodyModel[154].addBox(-46F, 16F, -20F, 88, 2, 1, 0F); // Core228
		bodyModel[154].setRotationPoint(0F, -26F, 0F);

		bodyModel[155].addShapeBox(-68F, -3.3F, -16F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Core227
		bodyModel[155].setRotationPoint(0F, -26F, 0F);
		bodyModel[155].rotateAngleZ = 0.19198622F;

		bodyModel[156].addShapeBox(-68F, -9.3F, -16F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core226
		bodyModel[156].setRotationPoint(0F, -26F, 0F);
		bodyModel[156].rotateAngleZ = 0.19198622F;

		bodyModel[157].addBox(-46F, 18F, -20F, 88, 7, 1, 0F); // Core225
		bodyModel[157].setRotationPoint(0F, -26F, 0F);

		bodyModel[158].addShapeBox(-68F, -9.3F, -22F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core224
		bodyModel[158].setRotationPoint(0F, -26F, 0F);
		bodyModel[158].rotateAngleZ = 0.19198622F;

		bodyModel[159].addShapeBox(-46F, 25F, 19F, 88, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Core223
		bodyModel[159].setRotationPoint(0F, -26F, 0F);

		bodyModel[160].addShapeBox(31.5F, 5F, 12.5F, 1, 3, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -.5F, -.2F, 0F, -.5F, .3F, 0F, -.5F, -.7F, 0F, -.5F, -.7F); // Core222
		bodyModel[160].setRotationPoint(-1F, -26F, 0F);

		bodyModel[161].addShapeBox(-62F, 0F, -29F, 22, 5, 58, 0F,0F, -4.5F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4.5F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Core221
		bodyModel[161].setRotationPoint(0F, -26F, 0F);

		bodyModel[162].addBox(30F, 4F, -8F, 2, 2, 4, 0F); // Core220
		bodyModel[162].setRotationPoint(0F, -26F, 0F);

		bodyModel[163].addShapeBox(-74F, 4F, -14F, 7, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Core22
		bodyModel[163].setRotationPoint(0F, -26F, 0F);

		bodyModel[164].addShapeBox(36F, -2F, -22F, 1, 2, 1, 0F,-.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F); // Core219
		bodyModel[164].setRotationPoint(0F, -26F, 0F);
		bodyModel[164].rotateAngleZ = -0.15707963F;

		bodyModel[165].addShapeBox(42F, 17F, 19F, 8, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F); // Core218
		bodyModel[165].setRotationPoint(0F, -26F, 0F);

		bodyModel[166].addBox(-42F, -9.9F, 16F, 2, 3, 4, 0F); // Core217
		bodyModel[166].setRotationPoint(0F, -26F, 0F);
		bodyModel[166].rotateAngleZ = 0.19198622F;

		bodyModel[167].addShapeBox(42F, 12F, 19F, 8, 2, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Core216
		bodyModel[167].setRotationPoint(0F, -26F, 0F);

		bodyModel[168].addBox(-42F, -9.9F, 10F, 2, 3, 4, 0F); // Core215
		bodyModel[168].setRotationPoint(0F, -26F, 0F);
		bodyModel[168].rotateAngleZ = 0.19198622F;

		bodyModel[169].addBox(-42F, -9.9F, 4F, 2, 3, 4, 0F); // Core214
		bodyModel[169].setRotationPoint(0F, -26F, 0F);
		bodyModel[169].rotateAngleZ = 0.19198622F;

		bodyModel[170].addShapeBox(50F, 10F, 19F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core213
		bodyModel[170].setRotationPoint(0F, -26F, 0F);

		bodyModel[171].addShapeBox(46F, 8F, 19F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core212
		bodyModel[171].setRotationPoint(0F, -26F, 0F);

		bodyModel[172].addBox(-42F, -9.9F, -2F, 2, 3, 4, 0F); // Core211
		bodyModel[172].setRotationPoint(0F, -26F, 0F);
		bodyModel[172].rotateAngleZ = 0.19198622F;

		bodyModel[173].addBox(-42F, -9.9F, -8F, 2, 3, 4, 0F); // Core210
		bodyModel[173].setRotationPoint(0F, -26F, 0F);
		bodyModel[173].rotateAngleZ = 0.19198622F;

		bodyModel[174].addShapeBox(-74F, 4F, -7F, 7, 2, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -2F, .2F, 0F, -2F, .2F, 0F, -2F, .2F, 0F, -2F, .2F, 0F); // Core21
		bodyModel[174].setRotationPoint(0F, -26F, 0F);

		bodyModel[175].addBox(30F, 12F, 19F, 12, 4, 1, 0F); // Core209
		bodyModel[175].setRotationPoint(0F, -26F, 0F);

		bodyModel[176].addShapeBox(33F, 6F, 19F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core208
		bodyModel[176].setRotationPoint(0F, -26F, 0F);

		bodyModel[177].addBox(-42F, -9.9F, -14F, 2, 3, 4, 0F); // Core207
		bodyModel[177].setRotationPoint(0F, -26F, 0F);
		bodyModel[177].rotateAngleZ = 0.19198622F;

		bodyModel[178].addBox(-61F, 6F, 19F, 96, 6, 1, 0F); // Core206
		bodyModel[178].setRotationPoint(0F, -26F, 0F);

		bodyModel[179].addShapeBox(46.9F, -7.5F, 10.5F, 1, 1, 1, 0F,-.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F); // Core205
		bodyModel[179].setRotationPoint(0F, -26F, 0F);
		bodyModel[179].rotateAngleZ = -0.40142573F;

		bodyModel[180].addBox(-42F, -9.9F, -20F, 2, 3, 4, 0F); // Core204
		bodyModel[180].setRotationPoint(0F, -26F, 0F);
		bodyModel[180].rotateAngleZ = 0.19198622F;

		bodyModel[181].addShapeBox(44.9F, -7.5F, 9.5F, 3, 1, 1, 0F,0F, -.3F, -.5F, -.5F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Core203
		bodyModel[181].setRotationPoint(0F, -26F, 0F);
		bodyModel[181].rotateAngleZ = -0.40142573F;

		bodyModel[182].addBox(-46F, 16F, 19F, 88, 2, 1, 0F); // Core202
		bodyModel[182].setRotationPoint(0F, -26F, 0F);

		bodyModel[183].addBox(-61F, -9.6F, 15.5F, 20, 2, 2, 0F); // Core201
		bodyModel[183].setRotationPoint(0F, -26F, 0F);
		bodyModel[183].rotateAngleZ = 0.19198622F;

		bodyModel[184].addShapeBox(44.9F, -7.5F, 11.5F, 3, 1, 1, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, -.5F, 0F, -.3F, -.5F); // Core200
		bodyModel[184].setRotationPoint(0F, -26F, 0F);
		bodyModel[184].rotateAngleZ = -0.40142573F;

		bodyModel[185].addShapeBox(-74F, 1F, -7F, 7, 3, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Core20
		bodyModel[185].setRotationPoint(0F, -26F, 0F);

		bodyModel[186].addBox(-64.5F, 12F, -20F, 13, 5, 3, 0F); // Core2
		bodyModel[186].setRotationPoint(0F, -26F, 0F);

		bodyModel[187].addBox(-46F, 18F, 19F, 88, 7, 1, 0F); // Core199
		bodyModel[187].setRotationPoint(0F, -26F, 0F);

		bodyModel[188].addBox(-61F, -9.6F, 18.5F, 20, 2, 2, 0F); // Core198
		bodyModel[188].setRotationPoint(0F, -26F, 0F);
		bodyModel[188].rotateAngleZ = 0.19198622F;

		bodyModel[189].addBox(-61F, -9.6F, 9.5F, 20, 2, 2, 0F); // Core197
		bodyModel[189].setRotationPoint(0F, -26F, 0F);
		bodyModel[189].rotateAngleZ = 0.19198622F;

		bodyModel[190].addShapeBox(-66F, 6F, -29F, 2, 1, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F); // Core196
		bodyModel[190].setRotationPoint(1F, -26F, 0F);

		bodyModel[191].addBox(43.9F, -7.5F, 10F, 1, 1, 2, 0F); // Core195
		bodyModel[191].setRotationPoint(0F, -26F, 0F);
		bodyModel[191].rotateAngleZ = -0.40142573F;

		bodyModel[192].addBox(-61F, 5F, 19F, 94, 1, 10, 0F); // Core194
		bodyModel[192].setRotationPoint(0F, -26F, 0F);

		bodyModel[193].addShapeBox(45F, -2F, -22F, 1, 2, 1, 0F,0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F); // Core193
		bodyModel[193].setRotationPoint(0F, -26F, 0F);
		bodyModel[193].rotateAngleZ = -0.15707963F;

		bodyModel[194].addShapeBox(45F, 17.5F, -6F, 4, 1, 1, 0F,0F, 0F, 0F, -.5F, 1.5F, -1.5F, -.5F, 1.5F, 1F, 0F, 0F, -.5F, 0F, 1F, 0F, -.5F, -1.5F, -1.5F, -.5F, -1.5F, 1F, 0F, 1F, 0F); // Core192
		bodyModel[194].setRotationPoint(-1F, -26F, 0F);

		bodyModel[195].addShapeBox(50F, 10F, 28F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core191
		bodyModel[195].setRotationPoint(0F, -26F, 0F);

		bodyModel[196].addShapeBox(-64F, 5F, -29F, 2, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Core190
		bodyModel[196].setRotationPoint(1F, -26F, 0F);

		bodyModel[197].addShapeBox(-74F, -1F, -7F, 7, 2, 1, 0F,-2F, .2F, 0F, -2F, .2F, 0F, -2F, .2F, 0F, -2F, .2F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Core19
		bodyModel[197].setRotationPoint(0F, -26F, 0F);

		bodyModel[198].addBox(43.5F, -4.1F, 10.5F, 2, 1, 1, 0F); // Core189
		bodyModel[198].setRotationPoint(0F, -25F, 0F);
		bodyModel[198].rotateAngleZ = -0.31415927F;

		bodyModel[199].addBox(-61F, -9.6F, 12.5F, 20, 2, 2, 0F); // Core188
		bodyModel[199].setRotationPoint(0F, -26F, 0F);
		bodyModel[199].rotateAngleZ = 0.19198622F;

		bodyModel[200].addShapeBox(43.5F, -5.1F, 10.5F, 2, 1, 1, 0F,-.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core187
		bodyModel[200].setRotationPoint(0F, -25F, 0F);
		bodyModel[200].rotateAngleZ = -0.31415927F;

		bodyModel[201].addShapeBox(50F, 9F, -21F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F); // Core186
		bodyModel[201].setRotationPoint(0F, -26F, 0F);

		bodyModel[202].addBox(-61F, -9.6F, 3.5F, 20, 2, 2, 0F); // Core185
		bodyModel[202].setRotationPoint(0F, -26F, 0F);
		bodyModel[202].rotateAngleZ = 0.19198622F;

		bodyModel[203].addShapeBox(50F, 9F, -29F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F); // Core184
		bodyModel[203].setRotationPoint(0F, -26F, 0F);

		bodyModel[204].addBox(42.5F, -2.6F, 9F, 4, 1, 4, 0F); // Core183
		bodyModel[204].setRotationPoint(0F, -26F, 0F);
		bodyModel[204].rotateAngleZ = -0.31415927F;

		bodyModel[205].addBox(-61F, -9.6F, 6.5F, 20, 2, 2, 0F); // Core182
		bodyModel[205].setRotationPoint(0F, -26F, 0F);
		bodyModel[205].rotateAngleZ = 0.19198622F;

		bodyModel[206].addShapeBox(46.9F, -7.5F, -11.5F, 1, 1, 1, 0F,-.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F); // Core181
		bodyModel[206].setRotationPoint(0F, -26F, 0F);
		bodyModel[206].rotateAngleZ = -0.40142573F;

		bodyModel[207].addBox(-61F, -9.6F, -2.5F, 20, 2, 2, 0F); // Core180
		bodyModel[207].setRotationPoint(0F, -26F, 0F);
		bodyModel[207].rotateAngleZ = 0.19198622F;

		bodyModel[208].addShapeBox(-74F, 4F, 6F, 7, 2, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -2F, .2F, 0F, -2F, .2F, 0F, -2F, .2F, 0F, -2F, .2F, 0F); // Core18
		bodyModel[208].setRotationPoint(0F, -26F, 0F);

		bodyModel[209].addShapeBox(33F, 5F, -29F, 13, 1, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Core179
		bodyModel[209].setRotationPoint(0F, -26F, 0F);

		bodyModel[210].addBox(-61F, -9.6F, 0.5F, 20, 2, 2, 0F); // Core178
		bodyModel[210].setRotationPoint(0F, -26F, 0F);
		bodyModel[210].rotateAngleZ = 0.19198622F;

		bodyModel[211].addShapeBox(44.9F, -7.5F, -12.5F, 3, 1, 1, 0F,0F, -.3F, -.5F, -.5F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Core177
		bodyModel[211].setRotationPoint(0F, -26F, 0F);
		bodyModel[211].rotateAngleZ = -0.40142573F;

		bodyModel[212].addShapeBox(46F, 7F, -29F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Core176
		bodyModel[212].setRotationPoint(0F, -26F, 0F);

		bodyModel[213].addBox(-61F, -9.6F, -8.5F, 20, 2, 2, 0F); // Core175
		bodyModel[213].setRotationPoint(0F, -26F, 0F);
		bodyModel[213].rotateAngleZ = 0.19198622F;

		bodyModel[214].addShapeBox(-66F, 7F, -29F, 2, 2, 1, 0F,-.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, -2.5F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2.5F, 1.5F, 0F); // Core174
		bodyModel[214].setRotationPoint(1F, -26F, 0F);

		bodyModel[215].addBox(-61F, -9.6F, -5.5F, 20, 2, 2, 0F); // Core173
		bodyModel[215].setRotationPoint(0F, -26F, 0F);
		bodyModel[215].rotateAngleZ = 0.19198622F;

		bodyModel[216].addShapeBox(-64F, 6F, -29F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core172
		bodyModel[216].setRotationPoint(1F, -26F, 0F);

		bodyModel[217].addShapeBox(44.9F, -7.5F, -10.5F, 3, 1, 1, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, -.5F, 0F, -.3F, -.5F); // Core171
		bodyModel[217].setRotationPoint(0F, -26F, 0F);
		bodyModel[217].rotateAngleZ = -0.40142573F;

		bodyModel[218].addBox(43.9F, -7.5F, -12F, 1, 1, 2, 0F); // Core170
		bodyModel[218].setRotationPoint(0F, -26F, 0F);
		bodyModel[218].rotateAngleZ = -0.40142573F;

		bodyModel[219].addShapeBox(-74F, 1F, 6F, 7, 3, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Core17
		bodyModel[219].setRotationPoint(0F, -26F, 0F);

		bodyModel[220].addBox(-61F, -9.6F, -14.5F, 20, 2, 2, 0F); // Core169
		bodyModel[220].setRotationPoint(0F, -26F, 0F);
		bodyModel[220].rotateAngleZ = 0.19198622F;

		bodyModel[221].addShapeBox(-64F, 9F, -29F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F); // Core168
		bodyModel[221].setRotationPoint(1F, -26F, 0F);

		bodyModel[222].addShapeBox(-61F, 14F, -29F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Core167
		bodyModel[222].setRotationPoint(0F, -26F, 0F);

		bodyModel[223].addShapeBox(43.5F, -5.1F, -11.5F, 2, 1, 1, 0F,-.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core166
		bodyModel[223].setRotationPoint(0F, -25F, 0F);
		bodyModel[223].rotateAngleZ = -0.31415927F;

		bodyModel[224].addBox(-61F, -9.6F, -11.5F, 20, 2, 2, 0F); // Core165
		bodyModel[224].setRotationPoint(0F, -26F, 0F);
		bodyModel[224].rotateAngleZ = 0.19198622F;

		bodyModel[225].addBox(-61F, 12F, -29F, 2, 2, 1, 0F); // Core164
		bodyModel[225].setRotationPoint(0F, -26F, 0F);

		bodyModel[226].addBox(-61F, -9.6F, -17.5F, 20, 2, 2, 0F); // Core163
		bodyModel[226].setRotationPoint(0F, -26F, 0F);
		bodyModel[226].rotateAngleZ = 0.19198622F;

		bodyModel[227].addBox(43.5F, -4.1F, -11.5F, 2, 1, 1, 0F); // Core162
		bodyModel[227].setRotationPoint(0F, -25F, 0F);
		bodyModel[227].rotateAngleZ = -0.31415927F;

		bodyModel[228].addShapeBox(46F, 8F, 28F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core161
		bodyModel[228].setRotationPoint(0F, -26F, 0F);

		bodyModel[229].addShapeBox(31F, 6F, -8F, 1, 3, 4, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Core161
		bodyModel[229].setRotationPoint(0F, -26F, 0F);

		bodyModel[230].addShapeBox(-74F, -1F, 6F, 7, 2, 1, 0F,-2F, .2F, 0F, -2F, .2F, 0F, -2F, .2F, 0F, -2F, .2F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Core16
		bodyModel[230].setRotationPoint(0F, -26F, 0F);

		bodyModel[231].addShapeBox(31.5F, 5F, -13.5F, 1, 3, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, -.5F, .3F, 0F, -.5F, -.2F); // Core159
		bodyModel[231].setRotationPoint(-1F, -26F, 0F);

		bodyModel[232].addShapeBox(37F, -2F, 26F, 8, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core158
		bodyModel[232].setRotationPoint(0F, -26F, 0F);
		bodyModel[232].rotateAngleZ = -0.15707963F;

		bodyModel[233].addShapeBox(-59.5F, 16F, -29F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.5F, 0F, 0F); // Core157
		bodyModel[233].setRotationPoint(0F, -26F, 0F);

		bodyModel[234].addBox(42.5F, -2.6F, -13F, 4, 1, 4, 0F); // Core156
		bodyModel[234].setRotationPoint(0F, -26F, 0F);
		bodyModel[234].rotateAngleZ = -0.31415927F;

		bodyModel[235].addShapeBox(-67F, -9.3F, 21F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Core155
		bodyModel[235].setRotationPoint(0F, -26F, 0F);
		bodyModel[235].rotateAngleZ = 0.19198622F;

		bodyModel[236].addBox(-61F, -9.6F, -20.5F, 20, 2, 2, 0F); // Core154
		bodyModel[236].setRotationPoint(0F, -26F, 0F);
		bodyModel[236].rotateAngleZ = 0.19198622F;

		bodyModel[237].addBox(-59F, 12F, -29F, 21, 4, 1, 0F); // Core153
		bodyModel[237].setRotationPoint(0F, -26F, 0F);

		bodyModel[238].addShapeBox(40F, 9F, 14F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Core152
		bodyModel[238].setRotationPoint(0F, -26F, 0F);

		bodyModel[239].addBox(-28F, 12F, -29F, 3, 4, 10, 0F); // Core151
		bodyModel[239].setRotationPoint(0F, -26F, 0F);

		bodyModel[240].addShapeBox(40F, 7F, 14F, 2, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core150
		bodyModel[240].setRotationPoint(0F, -26F, 0F);

		bodyModel[241].addShapeBox(-72F, 6F, -7F, 5, 2, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -2F, .2F, 0F); // Core15
		bodyModel[241].setRotationPoint(0F, -26F, 0F);

		bodyModel[242].addShapeBox(-67F, -9.3F, -22F, 28, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core149
		bodyModel[242].setRotationPoint(0F, -26F, 0F);
		bodyModel[242].rotateAngleZ = 0.19198622F;

		bodyModel[243].addShapeBox(40F, 6F, 14F, 2, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Core148
		bodyModel[243].setRotationPoint(0F, -26F, 0F);

		bodyModel[244].addBox(-40F, -9.3F, -21F, 1, 1, 42, 0F); // Core146
		bodyModel[244].setRotationPoint(0F, -26F, 0F);
		bodyModel[244].rotateAngleZ = 0.19198622F;

		bodyModel[245].addBox(-16F, 12F, -29F, 3, 4, 10, 0F); // Core145
		bodyModel[245].setRotationPoint(0F, -26F, 0F);

		bodyModel[246].addBox(-4F, 12F, -29F, 3, 4, 10, 0F); // Core144
		bodyModel[246].setRotationPoint(0F, -26F, 0F);

		bodyModel[247].addShapeBox(42F, 6.5F, 18F, 1, 3, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F); // Core143
		bodyModel[247].setRotationPoint(0F, -26F, 0F);

		bodyModel[248].addBox(-62F, 0F, -29F, 1, 6, 6, 0F); // Core142
		bodyModel[248].setRotationPoint(0F, -26F, 0F);

		bodyModel[249].addShapeBox(-39F, -3F, 23F, 20, 1, 4, 0F,0F, -.4F, -1F, 0F, -.4F, -1F, 0F, -.4F, -1F, 0F, -.4F, -1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // Core141
		bodyModel[249].setRotationPoint(0F, -26F, 0F);

		bodyModel[250].addShapeBox(42F, 9.5F, 18F, 1, 2, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -.7F, 2F, 0F, -.7F); // Core140
		bodyModel[250].setRotationPoint(0F, -26F, 0F);

		bodyModel[251].addShapeBox(-72F, 6F, 6F, 5, 2, 1, 0F,.2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -2F, .2F, 0F); // Core14
		bodyModel[251].setRotationPoint(0F, -26F, 0F);

		bodyModel[252].addShapeBox(42F, 9F, 14F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core139
		bodyModel[252].setRotationPoint(0F, -26F, 0F);

		bodyModel[253].addBox(11F, 12F, -29F, 3, 4, 10, 0F); // Core138
		bodyModel[253].setRotationPoint(0F, -26F, 0F);

		bodyModel[254].addShapeBox(-51F, 25F, -29F, 93, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Core137
		bodyModel[254].setRotationPoint(0F, -26F, 0F);

		bodyModel[255].addShapeBox(-39F, -2F, 22.5F, 20, 1, 5, 0F,0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core136
		bodyModel[255].setRotationPoint(0F, -26F, 0F);

		bodyModel[256].addShapeBox(42F, 6F, 14F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core135
		bodyModel[256].setRotationPoint(0F, -26F, 0F);

		bodyModel[257].addBox(-51F, 18F, -29F, 93, 7, 1, 0F); // Core134
		bodyModel[257].setRotationPoint(0F, -26F, 0F);

		bodyModel[258].addShapeBox(-39F, -1F, 22F, 20, 2, 6, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core133
		bodyModel[258].setRotationPoint(0F, -26F, 0F);

		bodyModel[259].addBox(42F, 7F, 14F, 1, 2, 4, 0F); // Core132
		bodyModel[259].setRotationPoint(0F, -26F, 0F);

		bodyModel[260].addBox(-51F, 16F, -29F, 93, 2, 1, 0F); // Core131
		bodyModel[260].setRotationPoint(0F, -26F, 0F);

		bodyModel[261].addShapeBox(-39F, -3F, -27F, 20, 1, 4, 0F,0F, -.4F, -1F, 0F, -.4F, -1F, 0F, -.4F, -1F, 0F, -.4F, -1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // Core130
		bodyModel[261].setRotationPoint(0F, -26F, 0F);

		bodyModel[262].addFlexTrapezoid(-61.5F, 14.5F, -13.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Core13
		bodyModel[262].setRotationPoint(0F, -26F, 0F);

		bodyModel[263].addShapeBox(42F, 17F, -29F, 8, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F); // Core129
		bodyModel[263].setRotationPoint(0F, -26F, 0F);

		bodyModel[264].addShapeBox(42F, 6.5F, 13F, 1, 3, 1, 0F,-.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Core128
		bodyModel[264].setRotationPoint(0F, -26F, 0F);

		bodyModel[265].addShapeBox(-39F, -2F, -27.5F, 20, 1, 5, 0F,0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core127
		bodyModel[265].setRotationPoint(0F, -26F, 0F);

		bodyModel[266].addShapeBox(31.5F, 1.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Core126
		bodyModel[266].setRotationPoint(0F, -26F, 0F);

		bodyModel[267].addShapeBox(48F, 16F, -4.5F, 1, 1, 1, 0F,0F, 1.5F, .3F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 1.5F, -.7F, 0F, 0F, .3F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.7F); // Core125
		bodyModel[267].setRotationPoint(-1F, -26F, 0F);

		bodyModel[268].addShapeBox(36F, -2F, 26F, 1, 2, 1, 0F,-.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F, -.2F); // Core124
		bodyModel[268].setRotationPoint(0F, -26F, 0F);
		bodyModel[268].rotateAngleZ = -0.15707963F;

		bodyModel[269].addShapeBox(33F, 6F, 28F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core123
		bodyModel[269].setRotationPoint(0F, -26F, 0F);

		bodyModel[270].addShapeBox(12F, 0F, -29F, 19, 5, 58, 0F,0F, 0F, -2F, -1F, -2F, -14F, -1F, -2F, -14F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Core122
		bodyModel[270].setRotationPoint(0F, -26F, 0F);

		bodyModel[271].addShapeBox(42F, 12F, -29F, 8, 2, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Core121
		bodyModel[271].setRotationPoint(0F, -26F, 0F);

		bodyModel[272].addShapeBox(42F, 9.5F, 13F, 1, 2, 1, 0F,-.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F, 2F, 0F, -.7F, -2.5F, 0F, -.7F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Core120
		bodyModel[272].setRotationPoint(0F, -26F, 0F);

		bodyModel[273].addShapeBox(-61.5F, 14.5F, -14.5F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core12
		bodyModel[273].setRotationPoint(0F, -26F, 0F);

		bodyModel[274].addShapeBox(-39F, -1F, -28F, 20, 2, 6, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core119
		bodyModel[274].setRotationPoint(0F, -26F, 0F);

		bodyModel[275].addBox(30F, 12F, -29F, 12, 4, 10, 0F); // Core118
		bodyModel[275].setRotationPoint(0F, -26F, 0F);

		bodyModel[276].addShapeBox(-38F, -2F, 15.5F, 18, 2, 5, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core117
		bodyModel[276].setRotationPoint(0F, -26F, 0F);

		bodyModel[277].addShapeBox(42F, 6.5F, -19F, 1, 3, 1, 0F,-.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Core116
		bodyModel[277].setRotationPoint(0F, -26F, 0F);

		bodyModel[278].addShapeBox(42F, 9.5F, -19F, 1, 2, 1, 0F,-.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F, 2F, 0F, -.7F, -2.5F, 0F, -.7F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Core115
		bodyModel[278].setRotationPoint(0F, -26F, 0F);

		bodyModel[279].addShapeBox(-38F, -2F, 9.5F, 18, 2, 5, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core114
		bodyModel[279].setRotationPoint(0F, -26F, 0F);

		bodyModel[280].addBox(-61F, 6F, -29F, 96, 6, 1, 0F); // Core113
		bodyModel[280].setRotationPoint(0F, -26F, 0F);

		bodyModel[281].addShapeBox(33F, 6F, -29F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core112
		bodyModel[281].setRotationPoint(0F, -26F, 0F);

		bodyModel[282].addShapeBox(-38F, -2F, 3.5F, 18, 2, 5, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core111
		bodyModel[282].setRotationPoint(0F, -26F, 0F);

		bodyModel[283].addShapeBox(42F, 9.5F, -14F, 1, 2, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -.7F, 2F, 0F, -.7F); // Core110
		bodyModel[283].setRotationPoint(0F, -26F, 0F);

		bodyModel[284].addShapeBox(-58.5F, 18.5F, 13.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core11
		bodyModel[284].setRotationPoint(0F, -26F, 0F);

		bodyModel[285].addShapeBox(-38F, -2F, -2.5F, 18, 2, 5, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core109
		bodyModel[285].setRotationPoint(0F, -26F, 0F);

		bodyModel[286].addShapeBox(-63F, 11F, -19F, 23, 13, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Core108
		bodyModel[286].setRotationPoint(0F, -26F, 0F);

		bodyModel[287].addShapeBox(46F, 8F, -29F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core107
		bodyModel[287].setRotationPoint(0F, -26F, 0F);

		bodyModel[288].addShapeBox(-64F, 5F, 19F, 2, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Core106
		bodyModel[288].setRotationPoint(1F, -26F, 0F);

		bodyModel[289].addShapeBox(50F, 10F, -29F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core105
		bodyModel[289].setRotationPoint(0F, -26F, 0F);

		bodyModel[290].addShapeBox(-38F, -2F, -8.5F, 18, 2, 5, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core104
		bodyModel[290].setRotationPoint(0F, -26F, 0F);

		bodyModel[291].addShapeBox(42F, 6.5F, -14F, 1, 3, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F); // Core103
		bodyModel[291].setRotationPoint(0F, -26F, 0F);

		bodyModel[292].addShapeBox(-51F, 25F, 28F, 93, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Core102
		bodyModel[292].setRotationPoint(0F, -26F, 0F);

		bodyModel[293].addShapeBox(-38F, -2F, -14.5F, 18, 2, 5, 0F,-1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core101
		bodyModel[293].setRotationPoint(0F, -26F, 0F);

		bodyModel[294].addShapeBox(43F, 16F, -19F, 3, 5, 38, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, .5F, 0F); // Core100
		bodyModel[294].setRotationPoint(0F, -26F, 0F);

		bodyModel[295].addFlexTrapezoid(-58.5F, 18.5F, 12.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_TOP); // Core10
		bodyModel[295].setRotationPoint(0F, -26F, 0F);

		bodyModel[296].addShapeBox(-64.5F, 8F, -20F, 13, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core1
		bodyModel[296].setRotationPoint(0F, -26F, 0F);

		bodyModel[297].addBox(-40F, 0F, -19F, 52, 24, 38, 0F); // Core1
		bodyModel[297].setRotationPoint(0F, -26F, 0F);

		bodyModel[298].addShapeBox(29.1F, -32F, -42F, 0, 70, 50, 0F,0F, -60F, 0F, 0F, -60F, 0F, 0F, -60F, -42F, 0F, -60F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F); // StGlorianaCore1
		bodyModel[298].setRotationPoint(0F, -44F, 0F);
		bodyModel[298].rotateAngleY = 1.57079633F;

		bodyModel[299].addShapeBox(29.1F, -32F, 34F, 0, 70, 50, 0F,0F, -60F, 0F, 0F, -60F, 0F, 0F, -60F, -42F, 0F, -60F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F); // StGlorianaCore2
		bodyModel[299].setRotationPoint(0F, -44F, 0F);
		bodyModel[299].rotateAngleY = -1.57079633F;


		turretModel = new ModelRendererTurbo[119];
		turretModel[0] = new ModelRendererTurbo(this, 126, 170, textureX, textureY); // Turret99
		turretModel[1] = new ModelRendererTurbo(this, 166, 133, textureX, textureY); // Turret98
		turretModel[2] = new ModelRendererTurbo(this, 106, 277, textureX, textureY); // Turret97
		turretModel[3] = new ModelRendererTurbo(this, 123, 225, textureX, textureY); // Turret96
		turretModel[4] = new ModelRendererTurbo(this, 2, 490, textureX, textureY); // Turret95
		turretModel[5] = new ModelRendererTurbo(this, 168, 121, textureX, textureY); // Turret94
		turretModel[6] = new ModelRendererTurbo(this, 122, 187, textureX, textureY); // Turret93
		turretModel[7] = new ModelRendererTurbo(this, 2, 474, textureX, textureY); // Turret92
		turretModel[8] = new ModelRendererTurbo(this, 3, 227, textureX, textureY); // Turret91
		turretModel[9] = new ModelRendererTurbo(this, 72, 98, textureX, textureY); // Turret90
		turretModel[10] = new ModelRendererTurbo(this, 144, 130, textureX, textureY); // Turret9
		turretModel[11] = new ModelRendererTurbo(this, 131, 104, textureX, textureY); // Turret89
		turretModel[12] = new ModelRendererTurbo(this, 27, 498, textureX, textureY); // Turret88
		turretModel[13] = new ModelRendererTurbo(this, 144, 162, textureX, textureY); // Turret87
		turretModel[14] = new ModelRendererTurbo(this, 121, 206, textureX, textureY); // Turret86
		turretModel[15] = new ModelRendererTurbo(this, 2, 457, textureX, textureY); // Turret85
		turretModel[16] = new ModelRendererTurbo(this, 82, 83, textureX, textureY); // Turret84
		turretModel[17] = new ModelRendererTurbo(this, 168, 127, textureX, textureY); // Turret83
		turretModel[18] = new ModelRendererTurbo(this, 130, 72, textureX, textureY); // Turret82
		turretModel[19] = new ModelRendererTurbo(this, 178, 145, textureX, textureY); // Turret81
		turretModel[20] = new ModelRendererTurbo(this, 70, 170, textureX, textureY); // Turret80
		turretModel[21] = new ModelRendererTurbo(this, 71, 323, textureX, textureY); // Turret8
		turretModel[22] = new ModelRendererTurbo(this, 2, 437, textureX, textureY); // Turret79
		turretModel[23] = new ModelRendererTurbo(this, 147, 79, textureX, textureY); // Turret78
		turretModel[24] = new ModelRendererTurbo(this, 178, 145, textureX, textureY); // Turret77
		turretModel[25] = new ModelRendererTurbo(this, 71, 208, textureX, textureY); // Turret76
		turretModel[26] = new ModelRendererTurbo(this, 2, 490, textureX, textureY); // Turret75
		turretModel[27] = new ModelRendererTurbo(this, 71, 283, textureX, textureY); // Turret74
		turretModel[28] = new ModelRendererTurbo(this, 2, 474, textureX, textureY); // Turret73
		turretModel[29] = new ModelRendererTurbo(this, 179, 145, textureX, textureY); // Turret72
		turretModel[30] = new ModelRendererTurbo(this, 146, 87, textureX, textureY); // Turret71
		turretModel[31] = new ModelRendererTurbo(this, 147, 95, textureX, textureY); // Turret70
		turretModel[32] = new ModelRendererTurbo(this, 3, 227, textureX, textureY); // Turret7
		turretModel[33] = new ModelRendererTurbo(this, 179, 145, textureX, textureY); // Turret69
		turretModel[34] = new ModelRendererTurbo(this, 2, 457, textureX, textureY); // Turret68
		turretModel[35] = new ModelRendererTurbo(this, 71, 323, textureX, textureY); // Turret67
		turretModel[36] = new ModelRendererTurbo(this, 165, 149, textureX, textureY); // Turret66
		turretModel[37] = new ModelRendererTurbo(this, 129, 94, textureX, textureY); // Turret65
		turretModel[38] = new ModelRendererTurbo(this, 74, 361, textureX, textureY); // Turret64
		turretModel[39] = new ModelRendererTurbo(this, 2, 437, textureX, textureY); // Turret63
		turretModel[40] = new ModelRendererTurbo(this, 128, 86, textureX, textureY); // Turret62
		turretModel[41] = new ModelRendererTurbo(this, 4, 304, textureX, textureY); // Turret61
		turretModel[42] = new ModelRendererTurbo(this, 161, 160, textureX, textureY); // Turret60
		turretModel[43] = new ModelRendererTurbo(this, 3, 158, textureX, textureY); // Turret6
		turretModel[44] = new ModelRendererTurbo(this, 26, 383, textureX, textureY); // Turret59
		turretModel[45] = new ModelRendererTurbo(this, 161, 174, textureX, textureY); // Turret58
		turretModel[46] = new ModelRendererTurbo(this, 130, 79, textureX, textureY); // Turret57
		turretModel[47] = new ModelRendererTurbo(this, 5, 68, textureX, textureY); // Turret56
		turretModel[48] = new ModelRendererTurbo(this, 24, 382, textureX, textureY); // Turret55
		turretModel[49] = new ModelRendererTurbo(this, 143, 116, textureX, textureY); // Turret54
		turretModel[50] = new ModelRendererTurbo(this, 165, 149, textureX, textureY); // Turret53
		turretModel[51] = new ModelRendererTurbo(this, 3, 124, textureX, textureY); // Turret52
		turretModel[52] = new ModelRendererTurbo(this, 5, 370, textureX, textureY); // Turret51
		turretModel[53] = new ModelRendererTurbo(this, 161, 160, textureX, textureY); // Turret50
		turretModel[54] = new ModelRendererTurbo(this, 161, 174, textureX, textureY); // Turret5
		turretModel[55] = new ModelRendererTurbo(this, 3, 193, textureX, textureY); // Turret49
		turretModel[56] = new ModelRendererTurbo(this, 5, 370, textureX, textureY); // Turret48
		turretModel[57] = new ModelRendererTurbo(this, 144, 126, textureX, textureY); // Turret47
		turretModel[58] = new ModelRendererTurbo(this, 131, 162, textureX, textureY); // Turret46
		turretModel[59] = new ModelRendererTurbo(this, 3, 406, textureX, textureY); // Turret45
		turretModel[60] = new ModelRendererTurbo(this, 131, 108, textureX, textureY); // Turret44
		turretModel[61] = new ModelRendererTurbo(this, 3, 124, textureX, textureY); // Turret43
		turretModel[62] = new ModelRendererTurbo(this, 72, 98, textureX, textureY); // Turret42
		turretModel[63] = new ModelRendererTurbo(this, 27, 470, textureX, textureY); // Turret41
		turretModel[64] = new ModelRendererTurbo(this, 82, 83, textureX, textureY); // Turret40
		turretModel[65] = new ModelRendererTurbo(this, 74, 361, textureX, textureY); // Turret4
		turretModel[66] = new ModelRendererTurbo(this, 72, 247, textureX, textureY); // Turret39
		turretModel[67] = new ModelRendererTurbo(this, 27, 438, textureX, textureY); // Turret38
		turretModel[68] = new ModelRendererTurbo(this, 72, 134, textureX, textureY); // Turret37
		turretModel[69] = new ModelRendererTurbo(this, 84, 73, textureX, textureY); // Turret36
		turretModel[70] = new ModelRendererTurbo(this, 131, 166, textureX, textureY); // Turret35
		turretModel[71] = new ModelRendererTurbo(this, 84, 73, textureX, textureY); // Turret34
		turretModel[72] = new ModelRendererTurbo(this, 27, 460, textureX, textureY); // Turret33
		turretModel[73] = new ModelRendererTurbo(this, 3, 158, textureX, textureY); // Turret32
		turretModel[74] = new ModelRendererTurbo(this, 3, 406, textureX, textureY); // Turret31
		turretModel[75] = new ModelRendererTurbo(this, 163, 222, textureX, textureY); // Turret3
		turretModel[76] = new ModelRendererTurbo(this, 144, 122, textureX, textureY); // Turret3
		turretModel[77] = new ModelRendererTurbo(this, 217, 147, textureX, textureY); // Turret29
		turretModel[78] = new ModelRendererTurbo(this, 128, 112, textureX, textureY); // Turret28
		turretModel[79] = new ModelRendererTurbo(this, 70, 170, textureX, textureY); // Turret27
		turretModel[80] = new ModelRendererTurbo(this, 129, 124, textureX, textureY); // Turret26
		turretModel[81] = new ModelRendererTurbo(this, 217, 147, textureX, textureY); // Turret25
		turretModel[82] = new ModelRendererTurbo(this, 71, 208, textureX, textureY); // Turret24
		turretModel[83] = new ModelRendererTurbo(this, 44, 454, textureX, textureY); // Turret23
		turretModel[84] = new ModelRendererTurbo(this, 165, 204, textureX, textureY); // Turret22
		turretModel[85] = new ModelRendererTurbo(this, 3, 295, textureX, textureY); // Turret21
		turretModel[86] = new ModelRendererTurbo(this, 44, 444, textureX, textureY); // Turret20
		turretModel[87] = new ModelRendererTurbo(this, 44, 415, textureX, textureY); // Turret2
		turretModel[88] = new ModelRendererTurbo(this, 169, 189, textureX, textureY); // Turret19
		turretModel[89] = new ModelRendererTurbo(this, 130, 117, textureX, textureY); // Turret18
		turretModel[90] = new ModelRendererTurbo(this, 217, 147, textureX, textureY); // Turret17
		turretModel[91] = new ModelRendererTurbo(this, 72, 247, textureX, textureY); // Turret16
		turretModel[92] = new ModelRendererTurbo(this, 3, 262, textureX, textureY); // Turret15
		turretModel[93] = new ModelRendererTurbo(this, 166, 242, textureX, textureY); // Turret14
		turretModel[94] = new ModelRendererTurbo(this, 71, 283, textureX, textureY); // Turret13
		turretModel[95] = new ModelRendererTurbo(this, 3, 295, textureX, textureY); // Turret120
		turretModel[96] = new ModelRendererTurbo(this, 130, 131, textureX, textureY); // Turret12
		turretModel[97] = new ModelRendererTurbo(this, 27, 480, textureX, textureY); // Turret119
		turretModel[98] = new ModelRendererTurbo(this, 27, 518, textureX, textureY); // Turret118
		turretModel[99] = new ModelRendererTurbo(this, 144, 166, textureX, textureY); // Turret117
		turretModel[100] = new ModelRendererTurbo(this, 136, 103, textureX, textureY); // Turret116
		turretModel[101] = new ModelRendererTurbo(this, 72, 134, textureX, textureY); // Turret115
		turretModel[102] = new ModelRendererTurbo(this, 3, 262, textureX, textureY); // Turret114
		turretModel[103] = new ModelRendererTurbo(this, 176, 132, textureX, textureY); // Turret113
		turretModel[104] = new ModelRendererTurbo(this, 138, 166, textureX, textureY); // Turret110
		turretModel[105] = new ModelRendererTurbo(this, 217, 147, textureX, textureY); // Turret11
		turretModel[106] = new ModelRendererTurbo(this, 138, 162, textureX, textureY); // Turret109
		turretModel[107] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Turret108
		turretModel[108] = new ModelRendererTurbo(this, 134, 158, textureX, textureY); // Turret107
		turretModel[109] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Turret106
		turretModel[110] = new ModelRendererTurbo(this, 221, 306, textureX, textureY); // Turret105
		turretModel[111] = new ModelRendererTurbo(this, 124, 148, textureX, textureY); // Turret104
		turretModel[112] = new ModelRendererTurbo(this, 208, 318, textureX, textureY); // Turret103
		turretModel[113] = new ModelRendererTurbo(this, 208, 310, textureX, textureY); // Turret102
		turretModel[114] = new ModelRendererTurbo(this, 127, 243, textureX, textureY); // Turret101
		turretModel[115] = new ModelRendererTurbo(this, 208, 304, textureX, textureY); // Turret100
		turretModel[116] = new ModelRendererTurbo(this, 170, 262, textureX, textureY); // Turret10
		turretModel[117] = new ModelRendererTurbo(this, 3, 193, textureX, textureY); // Turret1
		turretModel[118] = new ModelRendererTurbo(this, 393, 390, textureX, textureY); // StGlorianaTurret

		turretModel[0].addShapeBox(0F, -1F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Turret99
		turretModel[0].setRotationPoint(0F, -44F, 0F);

		turretModel[1].addShapeBox(-4.2F, -5.8F, 5.5F, 2, 1, 2, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F); // Turret98
		turretModel[1].setRotationPoint(0F, -44F, 0F);

		turretModel[2].addBox(-12F, 16F, -12F, 24, 1, 24, 0F); // Turret97
		turretModel[2].setRotationPoint(0F, -44F, 0F);

		turretModel[3].addShapeBox(-11F, -1F, -1.5F, 3, 1, 16, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Turret96
		turretModel[3].setRotationPoint(0F, -44F, 0F);

		turretModel[4].addShapeBox(16F, 7.5F, -11.5F, 1, 6, 3, 0F,0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F); // Turret95
		turretModel[4].setRotationPoint(0F, -44F, 0F);
		turretModel[4].rotateAngleZ = 0.19198622F;

		turretModel[5].addShapeBox(-2.5F, -5.7F, 5.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F); // Turret94
		turretModel[5].setRotationPoint(0F, -44F, 0F);

		turretModel[6].addShapeBox(-3F, -1F, -1.5F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Turret93
		turretModel[6].setRotationPoint(0F, -44F, 0F);

		turretModel[7].addShapeBox(15F, 6F, -11.5F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Turret92
		turretModel[7].setRotationPoint(0F, -44F, 0F);
		turretModel[7].rotateAngleZ = 0.19198622F;

		turretModel[8].addShapeBox(-12F, 0F, 0F, 6, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret91
		turretModel[8].setRotationPoint(0F, -44F, 0F);

		turretModel[9].addShapeBox(6F, 4F, -18F, 4, 12, 18, 0F,0F, 1.5F, -5F, 0F, -5F, -5.4F, 0F, -5F, 0F, 0F, 1.5F, 0F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret90
		turretModel[9].setRotationPoint(0F, -44F, 0F);

		turretModel[10].addShapeBox(8.5F, -1.3F, 10.5F, 1, 1, 2, 0F,0F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F); // Turret9
		turretModel[10].setRotationPoint(0F, -44F, 0F);

		turretModel[11].addShapeBox(11F, -2.5F, 7.5F, 1, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Turret89
		turretModel[11].setRotationPoint(0F, -44F, 0F);

		turretModel[12].addShapeBox(-20F, 7F, -3F, 3, 9, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret88
		turretModel[12].setRotationPoint(0F, -44F, 0F);

		turretModel[13].addShapeBox(-2F, -0.5F, -11.5F, 1, 1, 1, 0F,.5F, 0F, .1F, .5F, 0F, .1F, -.2F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, .1F, .5F, 0F, .1F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Turret87
		turretModel[13].setRotationPoint(0F, -44F, 0F);

		turretModel[14].addBox(-8F, -1F, -1.5F, 5, 1, 16, 0F); // Turret86
		turretModel[14].setRotationPoint(0F, -44F, 0F);

		turretModel[15].addShapeBox(13F, 5F, -11.5F, 2, 11, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret85
		turretModel[15].setRotationPoint(0F, -44F, 0F);
		turretModel[15].rotateAngleZ = 0.19198622F;

		turretModel[16].addShapeBox(10F, 10F, 11F, 3, 6, 7, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -5.4F, 0F, 1F, -5.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F); // Turret84
		turretModel[16].setRotationPoint(0F, -44F, 0F);

		turretModel[17].addShapeBox(-3.5F, -5.7F, 5.5F, 1, 1, 2, 0F,0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F); // Turret83
		turretModel[17].setRotationPoint(0F, -44F, 0F);

		turretModel[18].addBox(8.5F, -0.2F, -10F, 3, 1, 3, 0F); // Turret82
		turretModel[18].setRotationPoint(0F, -44F, 0F);

		turretModel[19].addBox(-10.5F, -4.8F, 2.5F, 4, 1, 1, 0F); // Turret81
		turretModel[19].setRotationPoint(0F, -44F, 0F);

		turretModel[20].addShapeBox(2F, 1F, 0F, 3, 15, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.8F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret80
		turretModel[20].setRotationPoint(0F, -44F, 0F);

		turretModel[21].addShapeBox(-14F, 1F, -18F, 4, 15, 18, 0F,-1.5F, -12F, -4F, 3F, -9F, -2F, 0F, -8F, 0F, -1.5F, -12F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret8
		turretModel[21].setRotationPoint(0F, -44F, 0F);

		turretModel[22].addShapeBox(12F, 4F, -11.5F, 1, 13, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret79
		turretModel[22].setRotationPoint(0F, -44F, 0F);
		turretModel[22].rotateAngleZ = 0.19198622F;

		turretModel[23].addShapeBox(9.5F, -0.8F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret78
		turretModel[23].setRotationPoint(0F, -44F, 0F);

		turretModel[24].addBox(-10.5F, -4.8F, 9.5F, 4, 1, 1, 0F); // Turret77
		turretModel[24].setRotationPoint(0F, -44F, 0F);

		turretModel[25].addShapeBox(-1F, 1F, 0F, 3, 15, 20, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -3F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret76
		turretModel[25].setRotationPoint(0F, -44F, 0F);

		turretModel[26].addShapeBox(16F, 7.5F, 8.5F, 1, 6, 3, 0F,0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F); // Turret75
		turretModel[26].setRotationPoint(0F, -44F, 0F);
		turretModel[26].rotateAngleZ = 0.19198622F;

		turretModel[27].addShapeBox(-10F, 1F, 0F, 6, 15, 20, 0F,-3.5F, -9F, 0F, 0F, -6F, 0F, 0F, -6F, -3.5F, -3F, -9F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret74
		turretModel[27].setRotationPoint(0F, -44F, 0F);

		turretModel[28].addShapeBox(15F, 6F, 8.5F, 1, 9, 3, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Turret73
		turretModel[28].setRotationPoint(0F, -44F, 0F);
		turretModel[28].rotateAngleZ = 0.19198622F;

		turretModel[29].addBox(-4.5F, -4.8F, 9.5F, 4, 1, 1, 0F); // Turret72
		turretModel[29].setRotationPoint(0F, -44F, 0F);

		turretModel[30].addBox(7.5F, -0.8F, -2F, 2, 1, 4, 0F); // Turret71
		turretModel[30].setRotationPoint(0F, -44F, 0F);

		turretModel[31].addShapeBox(6.5F, -0.8F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret70
		turretModel[31].setRotationPoint(0F, -44F, 0F);

		turretModel[32].addShapeBox(-12F, 0F, -16F, 6, 16, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret7
		turretModel[32].setRotationPoint(0F, -44F, 0F);

		turretModel[33].addBox(-4.5F, -4.8F, 2.5F, 4, 1, 1, 0F); // Turret69
		turretModel[33].setRotationPoint(0F, -44F, 0F);

		turretModel[34].addShapeBox(13F, 5F, 8.5F, 2, 11, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret68
		turretModel[34].setRotationPoint(0F, -44F, 0F);
		turretModel[34].rotateAngleZ = 0.19198622F;

		turretModel[35].addShapeBox(-14F, 1F, 0F, 4, 15, 18, 0F,-1.5F, -12F, 0F, 0F, -8F, 0F, 3F, -9F, -2F, -1.5F, -12F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Turret67
		turretModel[35].setRotationPoint(0F, -44F, 0F);

		turretModel[36].addShapeBox(-11.5F, -4.7F, 2.5F, 1, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret66
		turretModel[36].setRotationPoint(1F, -44F, 0F);

		turretModel[37].addShapeBox(6F, -0.3F, -2.5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret65
		turretModel[37].setRotationPoint(0F, -44F, 0F);

		turretModel[38].addShapeBox(-17F, 13F, 5F, 3, 3, 9, 0F,0F, -2.8F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -.8F, -2.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.8F, 0F, -4.5F); // Turret64
		turretModel[38].setRotationPoint(0F, -44F, 0F);

		turretModel[39].addShapeBox(12F, 4F, 8.5F, 1, 13, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret63
		turretModel[39].setRotationPoint(0F, -44F, 0F);
		turretModel[39].rotateAngleZ = 0.19198622F;

		turretModel[40].addBox(7F, -0.3F, -2.5F, 3, 1, 5, 0F); // Turret62
		turretModel[40].setRotationPoint(0F, -44F, 0F);

		turretModel[41].addShapeBox(12F, 0F, -12.5F, 3, 16, 25, 0F,0F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret61
		turretModel[41].setRotationPoint(0F, -44F, 0F);

		turretModel[42].addShapeBox(-9.5F, -4.7F, 1F, 2, 1, 11, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Turret60
		turretModel[42].setRotationPoint(0F, -44F, 0F);

		turretModel[43].addShapeBox(-1F, 0F, -16F, 6, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret6
		turretModel[43].setRotationPoint(0F, -44F, 0F);

		turretModel[44].addBox(10.5F, 6F, 8.5F, 2, 9, 3, 0F); // Turret59
		turretModel[44].setRotationPoint(0F, -44F, 0F);
		turretModel[44].rotateAngleZ = 0.19198622F;

		turretModel[45].addShapeBox(-7.5F, -4.7F, 1F, 2, 1, 11, 0F,0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret58
		turretModel[45].setRotationPoint(0F, -44F, 0F);

		turretModel[46].addShapeBox(10F, -0.3F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret57
		turretModel[46].setRotationPoint(0F, -44F, 0F);

		turretModel[47].addBox(6F, 0F, -12.5F, 6, 16, 25, 0F); // Turret56
		turretModel[47].setRotationPoint(0F, -44F, 0F);

		turretModel[48].addBox(10.5F, 6F, -11.5F, 2, 9, 3, 0F); // Turret55
		turretModel[48].setRotationPoint(0F, -44F, 0F);
		turretModel[48].rotateAngleZ = 0.19198622F;

		turretModel[49].addShapeBox(8.4F, -1.4F, 10.5F, 1, 1, 2, 0F,0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, -.9F, -.2F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.9F, -.2F); // Turret54
		turretModel[49].setRotationPoint(0F, -44F, 0F);

		turretModel[50].addShapeBox(-1.5F, -4.7F, 2.5F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Turret53
		turretModel[50].setRotationPoint(0F, -44F, 0F);

		turretModel[51].addShapeBox(5F, 0F, -14F, 4, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret52
		turretModel[51].setRotationPoint(0F, -44F, 0F);

		turretModel[52].addBox(10.5F, 3F, -11.5F, 2, 3, 23, 0F); // Turret51
		turretModel[52].setRotationPoint(0F, -44F, 0F);
		turretModel[52].rotateAngleZ = 0.19198622F;

		turretModel[53].addShapeBox(-3.5F, -4.7F, 1F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Turret50
		turretModel[53].setRotationPoint(0F, -44F, 0F);

		turretModel[54].addShapeBox(-5.5F, -4.7F, 1F, 2, 1, 11, 0F,-.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret5
		turretModel[54].setRotationPoint(0F, -44F, 0F);

		turretModel[55].addShapeBox(-6F, 0F, -16F, 5, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret49
		turretModel[55].setRotationPoint(0F, -44F, 0F);

		turretModel[56].addBox(10.5F, 15F, -11.5F, 2, 3, 23, 0F); // Turret48
		turretModel[56].setRotationPoint(0F, -44F, 0F);
		turretModel[56].rotateAngleZ = 0.19198622F;

		turretModel[57].addBox(7.5F, -1.3F, 10.5F, 1, 1, 2, 0F); // Turret47
		turretModel[57].setRotationPoint(0F, -44F, 0F);

		turretModel[58].addShapeBox(-8F, -0.5F, -11.5F, 1, 1, 1, 0F,.5F, 0F, .1F, .5F, 0F, .1F, -.2F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, .1F, .5F, 0F, .1F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Turret46
		turretModel[58].setRotationPoint(0F, -44F, 0F);

		turretModel[59].addShapeBox(12F, 15F, -8.5F, 1, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret45
		turretModel[59].setRotationPoint(0F, -44F, 0F);
		turretModel[59].rotateAngleZ = 0.19198622F;

		turretModel[60].addShapeBox(7F, -2F, 7.5F, 5, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret44
		turretModel[60].setRotationPoint(0F, -44F, 0F);

		turretModel[61].addShapeBox(5F, 0F, 0F, 4, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Turret43
		turretModel[61].setRotationPoint(0F, -44F, 0F);

		turretModel[62].addShapeBox(6F, 4F, 0F, 4, 12, 18, 0F,0F, 1.5F, 0F, 0F, -5F, 0F, 0F, -5F, -5.4F, 0F, 1.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, .5F); // Turret42
		turretModel[62].setRotationPoint(0F, -44F, 0F);

		turretModel[63].addBox(-18.5F, 12.8F, 6.5F, 3, 1, 3, 0F); // Turret41
		turretModel[63].setRotationPoint(0F, -44F, 0F);

		turretModel[64].addShapeBox(10F, 10F, -18F, 3, 6, 7, 0F,0F, 1F, -5.4F, 0F, -3F, -5.4F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret40
		turretModel[64].setRotationPoint(0F, -44F, 0F);

		turretModel[65].addShapeBox(-17F, 13F, -14F, 3, 3, 9, 0F,-.8F, -2.5F, -4.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, -.8F, 0F, -4.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret4
		turretModel[65].setRotationPoint(0F, -44F, 0F);

		turretModel[66].addShapeBox(-4F, 4F, 0F, 3, 12, 20, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -3F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret39
		turretModel[66].setRotationPoint(0F, -44F, 0F);

		turretModel[67].addBox(-18F, 1F, 7F, 2, 15, 2, 0F); // Turret38
		turretModel[67].setRotationPoint(0F, -44F, 0F);

		turretModel[68].addShapeBox(5F, 1F, 0F, 1, 15, 19, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -6F, 0F, 0F, -4.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Turret37
		turretModel[68].setRotationPoint(0F, -44F, 0F);

		turretModel[69].addShapeBox(13F, 13F, 12.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.9F, 0F, 0F, .5F); // Turret36
		turretModel[69].setRotationPoint(0F, -44F, 0F);

		turretModel[70].addBox(-8F, -0.4F, -12F, 1, 1, 1, 0F); // Turret35
		turretModel[70].setRotationPoint(0F, -44F, 0F);

		turretModel[71].addShapeBox(13F, 13F, -13.5F, 2, 3, 1, 0F,0F, 0F, -.9F, 0F, -2.9F, -.9F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret34
		turretModel[71].setRotationPoint(0F, -44F, 0F);

		turretModel[72].addBox(-18.5F, -0.2F, 6.5F, 3, 2, 3, 0F); // Turret33
		turretModel[72].setRotationPoint(0F, -44F, 0F);

		turretModel[73].addShapeBox(-1F, 0F, 0F, 6, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Turret32
		turretModel[73].setRotationPoint(0F, -44F, 0F);

		turretModel[74].addShapeBox(12F, 4F, -8.5F, 1, 2, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret31
		turretModel[74].setRotationPoint(0F, -44F, 0F);
		turretModel[74].rotateAngleZ = 0.19198622F;

		turretModel[75].addBox(-8F, -4.5F, 0.5F, 5, 4, 12, 0F); // Turret3
		turretModel[75].setRotationPoint(0F, -44F, 0F);

		turretModel[76].addShapeBox(6.5F, -1.3F, 10.5F, 1, 1, 2, 0F,-.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.5F); // Turret3
		turretModel[76].setRotationPoint(0F, -44F, 0F);

		turretModel[77].addShapeBox(5F, 0F, 10F, 3, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret29
		turretModel[77].setRotationPoint(0F, -44F, 0F);

		turretModel[78].addShapeBox(2F, -0.5F, -15F, 1, 1, 29, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Turret28
		turretModel[78].setRotationPoint(0F, -44F, 0F);
		turretModel[78].rotateAngleY = -0.17453293F;

		turretModel[79].addShapeBox(2F, 1F, -20F, 3, 15, 20, 0F,0F, 0F, -4.5F, 0F, 0F, -5.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret27
		turretModel[79].setRotationPoint(0F, -44F, 0F);

		turretModel[80].addBox(7F, -0.3F, 9.5F, 2, 1, 4, 0F); // Turret26
		turretModel[80].setRotationPoint(0F, -44F, 0F);

		turretModel[81].addShapeBox(10F, 0F, 10F, 1, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Turret25
		turretModel[81].setRotationPoint(0F, -44F, 0F);

		turretModel[82].addShapeBox(-1F, 1F, -20F, 3, 15, 20, 0F,0F, -3F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret24
		turretModel[82].setRotationPoint(0F, -44F, 0F);

		turretModel[83].addShapeBox(-15F, -2F, -3F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret23
		turretModel[83].setRotationPoint(0F, -44F, 0F);

		turretModel[84].addShapeBox(-3F, -4.5F, 0.5F, 2, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Turret22
		turretModel[84].setRotationPoint(0F, -44F, 0F);

		turretModel[85].addShapeBox(-17F, 0F, -9F, 1, 16, 9, 0F,0F, 0F, -4F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret21
		turretModel[85].setRotationPoint(0F, -44F, 0F);

		turretModel[86].addShapeBox(-15F, -3F, -3F, 2, 1, 2, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret20
		turretModel[86].setRotationPoint(0F, -44F, 0F);

		turretModel[87].addShapeBox(-14.5F, -23F, -2.5F, 1, 20, 1, 0F,-.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret2
		turretModel[87].setRotationPoint(0F, -44F, 0F);

		turretModel[88].addShapeBox(-1F, -4.5F, 2F, 1, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Turret19
		turretModel[88].setRotationPoint(0F, -44F, 0F);

		turretModel[89].addShapeBox(9F, -0.3F, 9.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret18
		turretModel[89].setRotationPoint(0F, -44F, 0F);

		turretModel[90].addBox(8F, 0F, 10F, 2, 15, 4, 0F); // Turret17
		turretModel[90].setRotationPoint(0F, -44F, 0F);

		turretModel[91].addShapeBox(-4F, 4F, -20F, 3, 12, 20, 0F,0F, -3F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret16
		turretModel[91].setRotationPoint(0F, -44F, 0F);

		turretModel[92].addShapeBox(-16F, 0F, -14F, 4, 16, 14, 0F,0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret15
		turretModel[92].setRotationPoint(0F, -44F, 0F);

		turretModel[93].addShapeBox(-10F, -4.5F, 0.5F, 2, 4, 12, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Turret14
		turretModel[93].setRotationPoint(0F, -44F, 0F);

		turretModel[94].addShapeBox(-10F, 1F, -20F, 6, 15, 20, 0F,-3F, -9F, -4F, 0F, -6F, -3.5F, 0F, -6F, 0F, -3.5F, -9F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret13
		turretModel[94].setRotationPoint(0F, -44F, 0F);

		turretModel[95].addShapeBox(-17F, 0F, 0F, 1, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -4F); // Turret120
		turretModel[95].setRotationPoint(0F, -44F, 0F);

		turretModel[96].addShapeBox(6F, -0.3F, 9.5F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret12
		turretModel[96].setRotationPoint(0F, -44F, 0F);

		turretModel[97].addBox(-20F, 7F, 2F, 3, 9, 2, 0F); // Turret119
		turretModel[97].setRotationPoint(0F, -44F, 0F);

		turretModel[98].addShapeBox(-20F, 7F, 4F, 4, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F); // Turret118
		turretModel[98].setRotationPoint(0F, -44F, 0F);

		turretModel[99].addBox(-2F, -0.4F, -12F, 1, 1, 1, 0F); // Turret117
		turretModel[99].setRotationPoint(0F, -44F, 0F);

		turretModel[100].addShapeBox(10.5F, -4F, 7.5F, 1, 3, 1, 0F,-.8F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.8F, 0F, -.2F, -.8F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.8F, 0F, -.2F); // Turret116
		turretModel[100].setRotationPoint(0F, -44F, 0F);

		turretModel[101].addShapeBox(5F, 1F, -19F, 1, 15, 19, 0F,0F, 0F, -4.8F, 0F, -1.5F, -6F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret115
		turretModel[101].setRotationPoint(0F, -44F, 0F);

		turretModel[102].addShapeBox(-16F, 0F, 0F, 4, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Turret114
		turretModel[102].setRotationPoint(0F, -44F, 0F);

		turretModel[103].addBox(-4.5F, -2.5F, 12.5F, 1, 1, 4, 0F); // Turret113
		turretModel[103].setRotationPoint(0F, -44F, 0F);

		turretModel[104].addBox(-5F, -0.4F, -12F, 1, 1, 1, 0F); // Turret110
		turretModel[104].setRotationPoint(0F, -44F, 0F);

		turretModel[105].addShapeBox(11F, 0F, 10F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F); // Turret11
		turretModel[105].setRotationPoint(0F, -44F, 0F);

		turretModel[106].addShapeBox(-5F, -0.5F, -11.5F, 1, 1, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Turret109
		turretModel[106].setRotationPoint(0F, -44F, 0F);

		turretModel[107].addShapeBox(-4F, -1F, 14F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Turret108
		turretModel[107].setRotationPoint(0F, -44F, 0F);

		turretModel[108].addShapeBox(-8.2F, -0.4F, -4.5F, 4, 1, 1, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Turret107
		turretModel[108].setRotationPoint(0F, -44F, 0F);
		turretModel[108].rotateAngleY = 0.38397244F;

		turretModel[109].addShapeBox(-4F, -4F, 14F, 1, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret106
		turretModel[109].setRotationPoint(0F, -44F, 0F);

		turretModel[110].addShapeBox(-4F, -3F, 14F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret105
		turretModel[110].setRotationPoint(0F, -44F, 0F);

		turretModel[111].addBox(-9F, -0.3F, -11.5F, 9, 1, 7, 0F); // Turret104
		turretModel[111].setRotationPoint(0F, -44F, 0F);

		turretModel[112].addShapeBox(-3F, -1F, 14F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Turret103
		turretModel[112].setRotationPoint(0F, -44F, 0F);

		turretModel[113].addBox(-3F, -3F, 14F, 1, 2, 4, 0F); // Turret102
		turretModel[113].setRotationPoint(0F, -44F, 0F);

		turretModel[114].addShapeBox(-13F, -1F, 0F, 2, 1, 13, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Turret101
		turretModel[114].setRotationPoint(0F, -44F, 0F);

		turretModel[115].addShapeBox(-3F, -4F, 14F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret100
		turretModel[115].setRotationPoint(0F, -44F, 0F);

		turretModel[116].addShapeBox(-12F, -4.5F, 2F, 1, 4, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret10
		turretModel[116].setRotationPoint(1F, -44F, 0F);

		turretModel[117].addShapeBox(-6F, 0F, 0F, 5, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret1
		turretModel[117].setRotationPoint(0F, -44F, 0F);

		turretModel[118].addShapeBox(14.3F, -51F, -1F, 0, 70, 50, 0F,0F, -60F, 0F, 0F, -60F, 0F, 0F, -60F, -42F, 0F, -60F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F); // StGlorianaTurret
		turretModel[118].setRotationPoint(0F, -44F, 0F);
		turretModel[118].rotateAngleY = 1.18682389F;
		turretModel[118].rotateAngleZ = 0.27925268F;


		barrelModel = new ModelRendererTurbo[31];
		barrelModel[0] = new ModelRendererTurbo(this, 168, 331, textureX, textureY); // Barrel9
		barrelModel[1] = new ModelRendererTurbo(this, 167, 307, textureX, textureY); // Barrel8
		barrelModel[2] = new ModelRendererTurbo(this, 167, 318, textureX, textureY); // Barrel7
		barrelModel[3] = new ModelRendererTurbo(this, 119, 333, textureX, textureY); // Barrel6
		barrelModel[4] = new ModelRendererTurbo(this, 155, 308, textureX, textureY); // Barrel5
		barrelModel[5] = new ModelRendererTurbo(this, 148, 308, textureX, textureY); // Barrel4
		barrelModel[6] = new ModelRendererTurbo(this, 144, 357, textureX, textureY); // Barrel31
		barrelModel[7] = new ModelRendererTurbo(this, 138, 353, textureX, textureY); // Barrel30
		barrelModel[8] = new ModelRendererTurbo(this, 155, 308, textureX, textureY); // Barrel3
		barrelModel[9] = new ModelRendererTurbo(this, 171, 370, textureX, textureY); // Barrel29
		barrelModel[10] = new ModelRendererTurbo(this, 171, 355, textureX, textureY); // Barrel28
		barrelModel[11] = new ModelRendererTurbo(this, 171, 362, textureX, textureY); // Barrel27
		barrelModel[12] = new ModelRendererTurbo(this, 170, 343, textureX, textureY); // Barrel26
		barrelModel[13] = new ModelRendererTurbo(this, 156, 402, textureX, textureY); // Barrel25
		barrelModel[14] = new ModelRendererTurbo(this, 157, 395, textureX, textureY); // Barrel24
		barrelModel[15] = new ModelRendererTurbo(this, 156, 388, textureX, textureY); // Barrel23
		barrelModel[16] = new ModelRendererTurbo(this, 143, 402, textureX, textureY); // Barrel22
		barrelModel[17] = new ModelRendererTurbo(this, 142, 396, textureX, textureY); // Barrel21
		barrelModel[18] = new ModelRendererTurbo(this, 142, 389, textureX, textureY); // Barrel20
		barrelModel[19] = new ModelRendererTurbo(this, 148, 308, textureX, textureY); // Barrel2
		barrelModel[20] = new ModelRendererTurbo(this, 113, 382, textureX, textureY); // Barrel19
		barrelModel[21] = new ModelRendererTurbo(this, 113, 375, textureX, textureY); // Barrel18
		barrelModel[22] = new ModelRendererTurbo(this, 113, 369, textureX, textureY); // Barrel17
		barrelModel[23] = new ModelRendererTurbo(this, 113, 401, textureX, textureY); // Barrel16
		barrelModel[24] = new ModelRendererTurbo(this, 114, 388, textureX, textureY); // Barrel15
		barrelModel[25] = new ModelRendererTurbo(this, 113, 394, textureX, textureY); // Barrel14
		barrelModel[26] = new ModelRendererTurbo(this, 153, 353, textureX, textureY); // Barrel13
		barrelModel[27] = new ModelRendererTurbo(this, 153, 335, textureX, textureY); // Barrel12
		barrelModel[28] = new ModelRendererTurbo(this, 153, 343, textureX, textureY); // Barrel11
		barrelModel[29] = new ModelRendererTurbo(this, 119, 351, textureX, textureY); // Barrel10
		barrelModel[30] = new ModelRendererTurbo(this, 125, 306, textureX, textureY); // Barrel1

		barrelModel[0].addShapeBox(0F, 1F, -3.5F, 6, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, -2F); // Barrel9
		barrelModel[0].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[1].addShapeBox(0F, -4F, -3.5F, 6, 2, 7, 0F,0F, 0F, -2F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Barrel8
		barrelModel[1].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[2].addShapeBox(0F, -2F, -3.5F, 6, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Barrel7
		barrelModel[2].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[3].addBox(0F, -3.5F, -8F, 4, 6, 9, 0F); // Barrel6
		barrelModel[3].setRotationPoint(14F, -36F, 0F);

		barrelModel[4].addShapeBox(2F, -3.5F, -8.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Barrel5
		barrelModel[4].setRotationPoint(14F, -36F, 0F);

		barrelModel[5].addShapeBox(0F, -4.5F, -8.5F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Barrel4
		barrelModel[5].setRotationPoint(14F, -36F, 0F);

		barrelModel[6].addShapeBox(9F, -1F, -6.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.2F, -.2F); // Barrel31
		barrelModel[6].setRotationPoint(14F, -36F, 0F);

		barrelModel[7].addShapeBox(5F, -1F, -6.5F, 4, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Barrel30
		barrelModel[7].setRotationPoint(14F, -36F, 0F);

		barrelModel[8].addShapeBox(2F, -3.5F, 7.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Barrel3
		barrelModel[8].setRotationPoint(14F, -36F, 0F);

		barrelModel[9].addShapeBox(0.1F, 1F, 4F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Barrel29
		barrelModel[9].setRotationPoint(14F, -36F, 0F);

		barrelModel[10].addShapeBox(0.1F, -2F, 4F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel28
		barrelModel[10].setRotationPoint(14F, -36F, 0F);

		barrelModel[11].addBox(0.1F, -1F, 4F, 4, 2, 4, 0F); // Barrel27
		barrelModel[11].setRotationPoint(14F, -36F, 0F);

		barrelModel[12].addBox(0F, -1.5F, 1F, 4, 3, 6, 0F); // Barrel26
		barrelModel[12].setRotationPoint(14F, -36F, 0F);

		barrelModel[13].addShapeBox(37.5F, 0F, -1.5F, 2, 1, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, -1F); // Barrel25
		barrelModel[13].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[14].addShapeBox(37.5F, -1F, -1.5F, 2, 1, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Barrel24
		barrelModel[14].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[15].addShapeBox(37.5F, -2F, -1.5F, 2, 1, 3, 0F,0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Barrel23
		barrelModel[15].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[16].addShapeBox(15.5F, 0F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, -1F); // Barrel22
		barrelModel[16].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[17].addShapeBox(15.5F, -1F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Barrel21
		barrelModel[17].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[18].addShapeBox(15.5F, -2F, -1.5F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Barrel20
		barrelModel[18].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[19].addShapeBox(0F, -4.5F, 7.5F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Barrel2
		barrelModel[19].setRotationPoint(14F, -36F, 0F);

		barrelModel[20].addShapeBox(17.5F, 0F, -1.5F, 20, 1, 3, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F); // Barrel19
		barrelModel[20].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[21].addShapeBox(17.5F, -1F, -1.5F, 20, 1, 3, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Barrel18
		barrelModel[21].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[22].addShapeBox(17.5F, -2F, -1.5F, 20, 1, 3, 0F,0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Barrel17
		barrelModel[22].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[23].addShapeBox(5.5F, 0F, -1.5F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Barrel16
		barrelModel[23].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[24].addShapeBox(5.5F, -2F, -1.5F, 10, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel15
		barrelModel[24].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[25].addBox(5.5F, -1F, -1.5F, 10, 1, 3, 0F); // Barrel14
		barrelModel[25].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[26].addShapeBox(5.1F, 0.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Barrel13
		barrelModel[26].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[27].addShapeBox(5.1F, -2.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Barrel12
		barrelModel[27].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[28].addBox(5.1F, -1.5F, -2.5F, 1, 2, 5, 0F); // Barrel11
		barrelModel[28].setRotationPoint(13.5F, -36F, 0F);

		barrelModel[29].addShapeBox(4F, -3.5F, -8F, 1, 6, 9, 0F,0F, 0F, 0F, 0F, -2F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F); // Barrel10
		barrelModel[29].setRotationPoint(14F, -36F, 0F);

		barrelModel[30].addBox(-1F, -4.5F, -8.5F, 1, 8, 17, 0F); // Barrel1
		barrelModel[30].setRotationPoint(14F, -36F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[42];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 431, 317, textureX, textureY); // WheelLeft9
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 431, 317, textureX, textureY); // WheelLeft8
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 431, 317, textureX, textureY); // WheelLeft7
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 458, 279, textureX, textureY); // WheelLeft6
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 458, 266, textureX, textureY); // WheelLeft5
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft41
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft40
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 458, 254, textureX, textureY); // WheelLeft4
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft39
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft38
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft37
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft36
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft35
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft34
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 429, 254, textureX, textureY); // WheelLeft33
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 429, 254, textureX, textureY); // WheelLeft33
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 429, 254, textureX, textureY); // WheelLeft32
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft31
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft30
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 392, 282, textureX, textureY); // WheelLeft3
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft29
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft28
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft27
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft26
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft25
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft24
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft23
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft22
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft21
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft20
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 392, 255, textureX, textureY); // WheelLeft2
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft19
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft18
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft17
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft16
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft15
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft14
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft13
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft12
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft11
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelLeft10
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 392, 268, textureX, textureY); // WheelLeft1

		leftTrackWheelModels[0].addShapeBox(-3.5F, 1.5F, -3.5F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft9
		leftTrackWheelModels[0].setRotationPoint(40.5F, -2F, 24F);

		leftTrackWheelModels[1].addShapeBox(-3.5F, -3.5F, -3.5F, 7, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft8
		leftTrackWheelModels[1].setRotationPoint(40.5F, -2F, 24F);

		leftTrackWheelModels[2].addBox(-3.5F, -1.5F, -3.5F, 7, 3, 7, 0F); // WheelLeft7
		leftTrackWheelModels[2].setRotationPoint(40.5F, -2F, 24F);

		leftTrackWheelModels[3].addShapeBox(-5F, 2F, -4.5F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // WheelLeft6
		leftTrackWheelModels[3].setRotationPoint(-58F, -11.5F, 24F);

		leftTrackWheelModels[4].addBox(-5F, -2F, -4.5F, 10, 4, 8, 0F); // WheelLeft5
		leftTrackWheelModels[4].setRotationPoint(-58F, -11.5F, 24F);

		leftTrackWheelModels[5].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft41
		leftTrackWheelModels[5].setRotationPoint(-37.5F, -0.5F, 23.5F);

		leftTrackWheelModels[6].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft40
		leftTrackWheelModels[6].setRotationPoint(-37.5F, -0.5F, 23.5F);

		leftTrackWheelModels[7].addShapeBox(-5F, -5F, -4.5F, 10, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft4
		leftTrackWheelModels[7].setRotationPoint(-58F, -11.5F, 24F);

		leftTrackWheelModels[8].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft39
		leftTrackWheelModels[8].setRotationPoint(-37.5F, -0.5F, 23.5F);

		leftTrackWheelModels[9].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft38
		leftTrackWheelModels[9].setRotationPoint(-46.5F, -0.5F, 23.5F);

		leftTrackWheelModels[10].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft37
		leftTrackWheelModels[10].setRotationPoint(-46.5F, -0.5F, 23.5F);

		leftTrackWheelModels[11].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft36
		leftTrackWheelModels[11].setRotationPoint(-46.5F, -0.5F, 23.5F);

		leftTrackWheelModels[12].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft35
		leftTrackWheelModels[12].setRotationPoint(-20.5F, -0.5F, 23.5F);

		leftTrackWheelModels[13].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft34
		leftTrackWheelModels[13].setRotationPoint(-20.5F, -0.5F, 23.5F);

		leftTrackWheelModels[14].addShapeBox(-1.5F, -1.5F, -4F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft33
		leftTrackWheelModels[14].setRotationPoint(47F, -10.5F, 24F);

		leftTrackWheelModels[15].addShapeBox(-1.5F, 0.5F, -4F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // WheelLeft33
		leftTrackWheelModels[15].setRotationPoint(47F, -10.5F, 24F);

		leftTrackWheelModels[16].addBox(-1.5F, -0.5F, -4F, 3, 1, 8, 0F); // WheelLeft32
		leftTrackWheelModels[16].setRotationPoint(47F, -10.5F, 24F);

		leftTrackWheelModels[17].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft31
		leftTrackWheelModels[17].setRotationPoint(-20.5F, -0.5F, 23.5F);

		leftTrackWheelModels[18].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft30
		leftTrackWheelModels[18].setRotationPoint(-29.5F, -0.5F, 23.5F);

		leftTrackWheelModels[19].addShapeBox(-5F, 2F, -3.5F, 10, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // WheelLeft3
		leftTrackWheelModels[19].setRotationPoint(47F, -10.5F, 24F);

		leftTrackWheelModels[20].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft29
		leftTrackWheelModels[20].setRotationPoint(-29.5F, -0.5F, 23.5F);

		leftTrackWheelModels[21].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft28
		leftTrackWheelModels[21].setRotationPoint(-29.5F, -0.5F, 23.5F);

		leftTrackWheelModels[22].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft27
		leftTrackWheelModels[22].setRotationPoint(-3.5F, -0.5F, 23.5F);

		leftTrackWheelModels[23].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft26
		leftTrackWheelModels[23].setRotationPoint(-3.5F, -0.5F, 23.5F);

		leftTrackWheelModels[24].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft25
		leftTrackWheelModels[24].setRotationPoint(-3.5F, -0.5F, 23.5F);

		leftTrackWheelModels[25].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft24
		leftTrackWheelModels[25].setRotationPoint(-12.5F, -0.5F, 23.5F);

		leftTrackWheelModels[26].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft23
		leftTrackWheelModels[26].setRotationPoint(-12.5F, -0.5F, 23.5F);

		leftTrackWheelModels[27].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft22
		leftTrackWheelModels[27].setRotationPoint(-12.5F, -0.5F, 23.5F);

		leftTrackWheelModels[28].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft21
		leftTrackWheelModels[28].setRotationPoint(4.5F, -0.5F, 23.5F);

		leftTrackWheelModels[29].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft20
		leftTrackWheelModels[29].setRotationPoint(4.5F, -0.5F, 23.5F);

		leftTrackWheelModels[30].addShapeBox(-5F, -5F, -3.5F, 10, 3, 7, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft2
		leftTrackWheelModels[30].setRotationPoint(47F, -10.5F, 24F);

		leftTrackWheelModels[31].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft19
		leftTrackWheelModels[31].setRotationPoint(4.5F, -0.5F, 23.5F);

		leftTrackWheelModels[32].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft18
		leftTrackWheelModels[32].setRotationPoint(13.5F, -0.5F, 23.5F);

		leftTrackWheelModels[33].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft17
		leftTrackWheelModels[33].setRotationPoint(13.5F, -0.5F, 23.5F);

		leftTrackWheelModels[34].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft16
		leftTrackWheelModels[34].setRotationPoint(13.5F, -0.5F, 23.5F);

		leftTrackWheelModels[35].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft15
		leftTrackWheelModels[35].setRotationPoint(22.5F, -0.5F, 23.5F);

		leftTrackWheelModels[36].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft14
		leftTrackWheelModels[36].setRotationPoint(22.5F, -0.5F, 23.5F);

		leftTrackWheelModels[37].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft13
		leftTrackWheelModels[37].setRotationPoint(22.5F, -0.5F, 23.5F);

		leftTrackWheelModels[38].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelLeft12
		leftTrackWheelModels[38].setRotationPoint(31.5F, -0.5F, 23.5F);

		leftTrackWheelModels[39].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelLeft11
		leftTrackWheelModels[39].setRotationPoint(31.5F, -0.5F, 23.5F);

		leftTrackWheelModels[40].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelLeft10
		leftTrackWheelModels[40].setRotationPoint(31.5F, -0.5F, 23.5F);

		leftTrackWheelModels[41].addBox(-5F, -2F, -3.5F, 10, 4, 7, 0F); // WheelLeft1
		leftTrackWheelModels[41].setRotationPoint(47F, -10.5F, 24F);


		rightTrackWheelModels = new ModelRendererTurbo[42];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 408, 326, textureX, textureY); // WheelRight9
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight8
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight7
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight6
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight5
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight42
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight41
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight40
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight4
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 431, 317, textureX, textureY); // WheelRight39
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 431, 317, textureX, textureY); // WheelRight38
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 431, 317, textureX, textureY); // WheelRight37
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 429, 254, textureX, textureY); // WheelRight36
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 429, 254, textureX, textureY); // WheelRight35
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 429, 254, textureX, textureY); // WheelRight34
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 392, 282, textureX, textureY); // WheelRight33
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 392, 268, textureX, textureY); // WheelRight32
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 392, 255, textureX, textureY); // WheelRight31
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight30
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 458, 254, textureX, textureY); // WheelRight3
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight29
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight28
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight27
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight26
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight25
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight24
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight23
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight22
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight21
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight20
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 458, 266, textureX, textureY); // WheelRight2
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight19
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight18
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight17
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight16
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight15
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight14
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight13
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight12
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight11
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 390, 318, textureX, textureY); // WheelRight10
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 458, 279, textureX, textureY); // WheelRight1

		rightTrackWheelModels[0].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight9
		rightTrackWheelModels[0].setRotationPoint(-37.5F, -0.5F, -24.5F);

		rightTrackWheelModels[1].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight8
		rightTrackWheelModels[1].setRotationPoint(-37.5F, -0.5F, -24.5F);

		rightTrackWheelModels[2].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight7
		rightTrackWheelModels[2].setRotationPoint(-37.5F, -0.5F, -24.5F);

		rightTrackWheelModels[3].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight6
		rightTrackWheelModels[3].setRotationPoint(-46.5F, -0.5F, -24.5F);

		rightTrackWheelModels[4].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight5
		rightTrackWheelModels[4].setRotationPoint(-46.5F, -0.5F, -24.5F);

		rightTrackWheelModels[5].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight42
		rightTrackWheelModels[5].setRotationPoint(31.5F, -0.5F, -24.5F);

		rightTrackWheelModels[6].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight41
		rightTrackWheelModels[6].setRotationPoint(31.5F, -0.5F, -24.5F);

		rightTrackWheelModels[7].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight40
		rightTrackWheelModels[7].setRotationPoint(31.5F, -0.5F, -24.5F);

		rightTrackWheelModels[8].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight4
		rightTrackWheelModels[8].setRotationPoint(-46.5F, -0.5F, -24.5F);

		rightTrackWheelModels[9].addShapeBox(-3.5F, 1.5F, -3.5F, 7, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight39
		rightTrackWheelModels[9].setRotationPoint(40.5F, -2F, -24F);

		rightTrackWheelModels[10].addBox(-3.5F, -1.5F, -3.5F, 7, 3, 7, 0F); // WheelRight38
		rightTrackWheelModels[10].setRotationPoint(40.5F, -2F, -24F);

		rightTrackWheelModels[11].addShapeBox(-3.5F, -3.5F, -3.5F, 7, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight37
		rightTrackWheelModels[11].setRotationPoint(40.5F, -2F, -24F);

		rightTrackWheelModels[12].addShapeBox(-1.5F, 0.5F, -4F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // WheelRight36
		rightTrackWheelModels[12].setRotationPoint(47F, -10.5F, -24F);

		rightTrackWheelModels[13].addBox(-1.5F, -0.5F, -4F, 3, 1, 8, 0F); // WheelRight35
		rightTrackWheelModels[13].setRotationPoint(47F, -10.5F, -24F);

		rightTrackWheelModels[14].addShapeBox(-1.5F, -1.5F, -4F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight34
		rightTrackWheelModels[14].setRotationPoint(47F, -10.5F, -24F);

		rightTrackWheelModels[15].addShapeBox(-5F, 2F, -3.5F, 10, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // WheelRight33
		rightTrackWheelModels[15].setRotationPoint(47F, -10.5F, -24F);

		rightTrackWheelModels[16].addBox(-5F, -2F, -3.5F, 10, 4, 7, 0F); // WheelRight32
		rightTrackWheelModels[16].setRotationPoint(47F, -10.5F, -24F);

		rightTrackWheelModels[17].addShapeBox(-5F, -5F, -3.5F, 10, 3, 7, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight31
		rightTrackWheelModels[17].setRotationPoint(47F, -10.5F, -24F);

		rightTrackWheelModels[18].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight30
		rightTrackWheelModels[18].setRotationPoint(22.5F, -0.5F, -24.5F);

		rightTrackWheelModels[19].addShapeBox(-5F, -5F, -3.5F, 10, 3, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight3
		rightTrackWheelModels[19].setRotationPoint(-58F, -11.5F, -24F);

		rightTrackWheelModels[20].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight29
		rightTrackWheelModels[20].setRotationPoint(22.5F, -0.5F, -24.5F);

		rightTrackWheelModels[21].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight28
		rightTrackWheelModels[21].setRotationPoint(22.5F, -0.5F, -24.5F);

		rightTrackWheelModels[22].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight27
		rightTrackWheelModels[22].setRotationPoint(13.5F, -0.5F, -24.5F);

		rightTrackWheelModels[23].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight26
		rightTrackWheelModels[23].setRotationPoint(13.5F, -0.5F, -24.5F);

		rightTrackWheelModels[24].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight25
		rightTrackWheelModels[24].setRotationPoint(13.5F, -0.5F, -24.5F);

		rightTrackWheelModels[25].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight24
		rightTrackWheelModels[25].setRotationPoint(4.5F, -0.5F, -24.5F);

		rightTrackWheelModels[26].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight23
		rightTrackWheelModels[26].setRotationPoint(4.5F, -0.5F, -24.5F);

		rightTrackWheelModels[27].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight22
		rightTrackWheelModels[27].setRotationPoint(4.5F, -0.5F, -24.5F);

		rightTrackWheelModels[28].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight21
		rightTrackWheelModels[28].setRotationPoint(-3.5F, -0.5F, -24.5F);

		rightTrackWheelModels[29].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight20
		rightTrackWheelModels[29].setRotationPoint(-3.5F, -0.5F, -24.5F);

		rightTrackWheelModels[30].addBox(-5F, -2F, -3.5F, 10, 4, 8, 0F); // WheelRight2
		rightTrackWheelModels[30].setRotationPoint(-58F, -11.5F, -24F);

		rightTrackWheelModels[31].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight19
		rightTrackWheelModels[31].setRotationPoint(-3.5F, -0.5F, -24.5F);

		rightTrackWheelModels[32].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight18
		rightTrackWheelModels[32].setRotationPoint(-12.5F, -0.5F, -24.5F);

		rightTrackWheelModels[33].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight17
		rightTrackWheelModels[33].setRotationPoint(-12.5F, -0.5F, -24.5F);

		rightTrackWheelModels[34].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight16
		rightTrackWheelModels[34].setRotationPoint(-12.5F, -0.5F, -24.5F);

		rightTrackWheelModels[35].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight15
		rightTrackWheelModels[35].setRotationPoint(-20.5F, -0.5F, -24.5F);

		rightTrackWheelModels[36].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight14
		rightTrackWheelModels[36].setRotationPoint(-20.5F, -0.5F, -24.5F);

		rightTrackWheelModels[37].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight13
		rightTrackWheelModels[37].setRotationPoint(-20.5F, -0.5F, -24.5F);

		rightTrackWheelModels[38].addShapeBox(-3F, -3F, -2F, 6, 2, 5, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // WheelRight12
		rightTrackWheelModels[38].setRotationPoint(-29.5F, -0.5F, -24.5F);

		rightTrackWheelModels[39].addBox(-3F, -1F, -2F, 6, 2, 5, 0F); // WheelRight11
		rightTrackWheelModels[39].setRotationPoint(-29.5F, -0.5F, -24.5F);

		rightTrackWheelModels[40].addShapeBox(-3F, 1F, -2F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // WheelRight10
		rightTrackWheelModels[40].setRotationPoint(-29.5F, -0.5F, -24.5F);

		rightTrackWheelModels[41].addShapeBox(-5F, 2F, -3.5F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // WheelRight1
		rightTrackWheelModels[41].setRotationPoint(-58F, -11.5F, -24F);


		leftTrackModel = new ModelRendererTurbo[23];
		leftTrackModel[0] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft9
		leftTrackModel[1] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft8
		leftTrackModel[2] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft7
		leftTrackModel[3] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft6
		leftTrackModel[4] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft5
		leftTrackModel[5] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft4
		leftTrackModel[6] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft3
		leftTrackModel[7] = new ModelRendererTurbo(this, 375, 401, textureX, textureY); // TrackLeft23
		leftTrackModel[8] = new ModelRendererTurbo(this, 353, 400, textureX, textureY); // TrackLeft22
		leftTrackModel[9] = new ModelRendererTurbo(this, 353, 388, textureX, textureY); // TrackLeft21
		leftTrackModel[10] = new ModelRendererTurbo(this, 353, 315, textureX, textureY); // TrackLeft20
		leftTrackModel[11] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft2
		leftTrackModel[12] = new ModelRendererTurbo(this, 353, 330, textureX, textureY); // TrackLeft19
		leftTrackModel[13] = new ModelRendererTurbo(this, 353, 363, textureX, textureY); // TrackLeft18
		leftTrackModel[14] = new ModelRendererTurbo(this, 353, 350, textureX, textureY); // TrackLeft17
		leftTrackModel[15] = new ModelRendererTurbo(this, 353, 376, textureX, textureY); // TrackLeft16
		leftTrackModel[16] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft15
		leftTrackModel[17] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft14
		leftTrackModel[18] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft13
		leftTrackModel[19] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft12
		leftTrackModel[20] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft11
		leftTrackModel[21] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft10
		leftTrackModel[22] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackLeft1

		leftTrackModel[0].addBox(-31F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft9
		leftTrackModel[0].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[1].addBox(-5F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft8
		leftTrackModel[1].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[2].addBox(-11F, 24.5F, 21F, 6, 2, 6, 0F); // TrackLeft7
		leftTrackModel[2].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[3].addBox(-14F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft6
		leftTrackModel[3].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[4].addBox(12F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft5
		leftTrackModel[4].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[5].addBox(6F, 24.5F, 21F, 6, 2, 6, 0F); // TrackLeft4
		leftTrackModel[5].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[6].addBox(3F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft3
		leftTrackModel[6].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[7].addBox(-36.07F, 49.45F, 20F, 1, 5, 8, 0F); // TrackLeft23
		leftTrackModel[7].setRotationPoint(0F, -27F, 0F);
		leftTrackModel[7].rotateAngleZ = -0.78539816F;

		leftTrackModel[8].addBox(-64F, 12F, 20F, 1, 5, 8, 0F); // TrackLeft22
		leftTrackModel[8].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[9].addBox(-32.55F, 57F, 20F, 17, 1, 8, 0F); // TrackLeft21
		leftTrackModel[9].setRotationPoint(0F, -27F, 0F);
		leftTrackModel[9].rotateAngleZ = -0.78539816F;

		leftTrackModel[10].addBox(27.1F, 41.5F, 20F, 1, 5, 8, 0F); // TrackLeft20
		leftTrackModel[10].setRotationPoint(0F, -26F, 0F);
		leftTrackModel[10].rotateAngleZ = 0.78539816F;

		leftTrackModel[11].addBox(21F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft2
		leftTrackModel[11].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[12].addBox(51.7F, 12F, 20F, 1, 5, 8, 0F); // TrackLeft19
		leftTrackModel[12].setRotationPoint(0F, -25F, 0F);

		leftTrackModel[13].addBox(29.1F, 31.8F, 20F, 9, 1, 8, 0F); // TrackLeft18
		leftTrackModel[13].setRotationPoint(1F, -26F, 0F);
		leftTrackModel[13].rotateAngleZ = 0.12217305F;

		leftTrackModel[14].addBox(10.5F, 49F, 20F, 14, 1, 8, 0F); // TrackLeft17
		leftTrackModel[14].setRotationPoint(0F, -26F, 0F);
		leftTrackModel[14].rotateAngleZ = 0.78539816F;

		leftTrackModel[15].addBox(-52F, 28F, 20F, 86, 1, 8, 0F); // TrackLeft16
		leftTrackModel[15].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[16].addBox(24F, 24.5F, 21F, 6, 2, 6, 0F); // TrackLeft15
		leftTrackModel[16].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[17].addBox(-39F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft14
		leftTrackModel[17].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[18].addBox(-45F, 24.5F, 21F, 6, 2, 6, 0F); // TrackLeft13
		leftTrackModel[18].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[19].addBox(-48F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft12
		leftTrackModel[19].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[20].addBox(-22F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft11
		leftTrackModel[20].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[21].addBox(-28F, 24.5F, 21F, 6, 2, 6, 0F); // TrackLeft10
		leftTrackModel[21].setRotationPoint(0F, -26F, 0F);

		leftTrackModel[22].addBox(30F, 24F, 21F, 3, 3, 6, 0F); // TrackLeft1
		leftTrackModel[22].setRotationPoint(0F, -26F, 0F);


		rightTrackModel = new ModelRendererTurbo[23];
		rightTrackModel[0] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight9
		rightTrackModel[1] = new ModelRendererTurbo(this, 375, 401, textureX, textureY); // TrackRight8
		rightTrackModel[2] = new ModelRendererTurbo(this, 353, 400, textureX, textureY); // TrackRight7
		rightTrackModel[3] = new ModelRendererTurbo(this, 353, 388, textureX, textureY); // TrackRight6
		rightTrackModel[4] = new ModelRendererTurbo(this, 353, 376, textureX, textureY); // TrackRight5
		rightTrackModel[5] = new ModelRendererTurbo(this, 353, 363, textureX, textureY); // TrackRight4
		rightTrackModel[6] = new ModelRendererTurbo(this, 353, 350, textureX, textureY); // TrackRight3
		rightTrackModel[7] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight23
		rightTrackModel[8] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight22
		rightTrackModel[9] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight21
		rightTrackModel[10] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight20
		rightTrackModel[11] = new ModelRendererTurbo(this, 353, 330, textureX, textureY); // TrackRight2
		rightTrackModel[12] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight19
		rightTrackModel[13] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight18
		rightTrackModel[14] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight17
		rightTrackModel[15] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight16
		rightTrackModel[16] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight15
		rightTrackModel[17] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight14
		rightTrackModel[18] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight13
		rightTrackModel[19] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight12
		rightTrackModel[20] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight11
		rightTrackModel[21] = new ModelRendererTurbo(this, 391, 303, textureX, textureY); // TrackRight10
		rightTrackModel[22] = new ModelRendererTurbo(this, 353, 315, textureX, textureY); // TrackRight1

		rightTrackModel[0].addBox(30F, 24F, -27F, 3, 3, 6, 0F); // TrackRight9
		rightTrackModel[0].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[1].addBox(-36.07F, 49.45F, -28F, 1, 5, 8, 0F); // TrackRight8
		rightTrackModel[1].setRotationPoint(0F, -27F, 0F);
		rightTrackModel[1].rotateAngleZ = -0.78539816F;

		rightTrackModel[2].addBox(-64F, 12F, -28F, 1, 5, 8, 0F); // TrackRight7
		rightTrackModel[2].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[3].addBox(-32.55F, 57F, -28F, 17, 1, 8, 0F); // TrackRight6
		rightTrackModel[3].setRotationPoint(0F, -27F, 0F);
		rightTrackModel[3].rotateAngleZ = -0.78539816F;

		rightTrackModel[4].addBox(-52F, 28F, -28F, 86, 1, 8, 0F); // TrackRight5
		rightTrackModel[4].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[5].addBox(29.1F, 31.8F, -28F, 9, 1, 8, 0F); // TrackRight4
		rightTrackModel[5].setRotationPoint(1F, -26F, 0F);
		rightTrackModel[5].rotateAngleZ = 0.12217305F;

		rightTrackModel[6].addBox(10.5F, 49F, -28F, 14, 1, 8, 0F); // TrackRight3
		rightTrackModel[6].setRotationPoint(0F, -26F, 0F);
		rightTrackModel[6].rotateAngleZ = 0.78539816F;

		rightTrackModel[7].addBox(-48F, 24F, -27F, 3, 3, 6, 0F); // TrackRight23
		rightTrackModel[7].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[8].addBox(-45F, 24.5F, -27F, 6, 2, 6, 0F); // TrackRight22
		rightTrackModel[8].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[9].addBox(-39F, 24F, -27F, 3, 3, 6, 0F); // TrackRight21
		rightTrackModel[9].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[10].addBox(-31F, 24F, -27F, 3, 3, 6, 0F); // TrackRight20
		rightTrackModel[10].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[11].addBox(51.7F, 12F, -28F, 1, 5, 8, 0F); // TrackRight2
		rightTrackModel[11].setRotationPoint(0F, -25F, 0F);

		rightTrackModel[12].addBox(-28F, 24.5F, -27F, 6, 2, 6, 0F); // TrackRight19
		rightTrackModel[12].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[13].addBox(-22F, 24F, -27F, 3, 3, 6, 0F); // TrackRight18
		rightTrackModel[13].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[14].addBox(-14F, 24F, -27F, 3, 3, 6, 0F); // TrackRight17
		rightTrackModel[14].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[15].addBox(-11F, 24.5F, -27F, 6, 2, 6, 0F); // TrackRight16
		rightTrackModel[15].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[16].addBox(-5F, 24F, -27F, 3, 3, 6, 0F); // TrackRight15
		rightTrackModel[16].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[17].addBox(3F, 24F, -27F, 3, 3, 6, 0F); // TrackRight14
		rightTrackModel[17].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[18].addBox(6F, 24.5F, -27F, 6, 2, 6, 0F); // TrackRight13
		rightTrackModel[18].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[19].addBox(12F, 24F, -27F, 3, 3, 6, 0F); // TrackRight12
		rightTrackModel[19].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[20].addBox(21F, 24F, -27F, 3, 3, 6, 0F); // TrackRight11
		rightTrackModel[20].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[21].addBox(24F, 24.5F, -27F, 6, 2, 6, 0F); // TrackRight10
		rightTrackModel[21].setRotationPoint(0F, -26F, 0F);

		rightTrackModel[22].addBox(27.1F, 41.5F, -28F, 1, 5, 8, 0F); // TrackRight1
		rightTrackModel[22].setRotationPoint(0F, -26F, 0F);
		rightTrackModel[22].rotateAngleZ = 0.78539816F;



		translateAll(0F, 10F, 0F);


		flipAll();
	}
}