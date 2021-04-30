//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSchwimmWagenFix extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelSchwimmWagenFix() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[384];
		bodyModel[0] = new ModelRendererTurbo(this, 19, 262, textureX, textureY); // Import Core1
		bodyModel[1] = new ModelRendererTurbo(this, 109, 91, textureX, textureY); // Import Core10
		bodyModel[2] = new ModelRendererTurbo(this, 427, 93, textureX, textureY); // Import Core100
		bodyModel[3] = new ModelRendererTurbo(this, 286, 145, textureX, textureY); // Import Core101
		bodyModel[4] = new ModelRendererTurbo(this, 149, 203, textureX, textureY); // Import Core102
		bodyModel[5] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core103
		bodyModel[6] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[7] = new ModelRendererTurbo(this, 371, 363, textureX, textureY); // Import Core105
		bodyModel[8] = new ModelRendererTurbo(this, 342, 93, textureX, textureY); // Import Core106
		bodyModel[9] = new ModelRendererTurbo(this, 140, 185, textureX, textureY); // Import Core107
		bodyModel[10] = new ModelRendererTurbo(this, 436, 351, textureX, textureY); // Import Core108
		bodyModel[11] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[12] = new ModelRendererTurbo(this, 51, 266, textureX, textureY); // Import Core11
		bodyModel[13] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core110
		bodyModel[14] = new ModelRendererTurbo(this, 140, 194, textureX, textureY); // Import Core111
		bodyModel[15] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[16] = new ModelRendererTurbo(this, 286, 145, textureX, textureY); // Import Core113
		bodyModel[17] = new ModelRendererTurbo(this, 371, 392, textureX, textureY); // Import Core114
		bodyModel[18] = new ModelRendererTurbo(this, 179, 439, textureX, textureY); // Import Core115
		bodyModel[19] = new ModelRendererTurbo(this, 101, 259, textureX, textureY); // Import Core116
		bodyModel[20] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[21] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[22] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Core119
		bodyModel[23] = new ModelRendererTurbo(this, 201, 146, textureX, textureY); // Import Core12
		bodyModel[24] = new ModelRendererTurbo(this, 101, 259, textureX, textureY); // Import Core120
		bodyModel[25] = new ModelRendererTurbo(this, 280, 456, textureX, textureY); // Import Core121
		bodyModel[26] = new ModelRendererTurbo(this, 305, 148, textureX, textureY); // Import Core122
		bodyModel[27] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[28] = new ModelRendererTurbo(this, 101, 292, textureX, textureY); // Import Core124
		bodyModel[29] = new ModelRendererTurbo(this, 286, 155, textureX, textureY); // Import Core125
		bodyModel[30] = new ModelRendererTurbo(this, 101, 259, textureX, textureY); // Import Core126
		bodyModel[31] = new ModelRendererTurbo(this, 7, 299, textureX, textureY); // Import Core80
		bodyModel[32] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core128
		bodyModel[33] = new ModelRendererTurbo(this, 7, 299, textureX, textureY); // Import Core80
		bodyModel[34] = new ModelRendererTurbo(this, 19, 262, textureX, textureY); // Import Core13
		bodyModel[35] = new ModelRendererTurbo(this, 101, 327, textureX, textureY); // Import Core130
		bodyModel[36] = new ModelRendererTurbo(this, 188, 151, textureX, textureY); // Import Core131
		bodyModel[37] = new ModelRendererTurbo(this, 11, 259, textureX, textureY); // Import Core132
		bodyModel[38] = new ModelRendererTurbo(this, 11, 89, textureX, textureY); // Import Core133
		bodyModel[39] = new ModelRendererTurbo(this, 11, 108, textureX, textureY); // Import Core134
		bodyModel[40] = new ModelRendererTurbo(this, 322, 157, textureX, textureY); // Import Core135
		bodyModel[41] = new ModelRendererTurbo(this, 112, 169, textureX, textureY); // Import Core136
		bodyModel[42] = new ModelRendererTurbo(this, 497, 3, textureX, textureY); // Import Core137
		bodyModel[43] = new ModelRendererTurbo(this, 286, 145, textureX, textureY); // Import Core139
		bodyModel[44] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core14
		bodyModel[45] = new ModelRendererTurbo(this, 101, 270, textureX, textureY); // Import Core140
		bodyModel[46] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[47] = new ModelRendererTurbo(this, 101, 259, textureX, textureY); // Import Core142
		bodyModel[48] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core143
		bodyModel[49] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core144
		bodyModel[50] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[51] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[52] = new ModelRendererTurbo(this, 286, 145, textureX, textureY); // Import Core147
		bodyModel[53] = new ModelRendererTurbo(this, 101, 259, textureX, textureY); // Import Core148
		bodyModel[54] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[55] = new ModelRendererTurbo(this, 436, 405, textureX, textureY); // Import Core15
		bodyModel[56] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core150
		bodyModel[57] = new ModelRendererTurbo(this, 101, 270, textureX, textureY); // Import Core151
		bodyModel[58] = new ModelRendererTurbo(this, 5, 239, textureX, textureY); // Import Core152
		bodyModel[59] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[60] = new ModelRendererTurbo(this, 322, 148, textureX, textureY); // Import Core154
		bodyModel[61] = new ModelRendererTurbo(this, 5, 239, textureX, textureY); // Import Core155
		bodyModel[62] = new ModelRendererTurbo(this, 235, 178, textureX, textureY); // Import Core156
		bodyModel[63] = new ModelRendererTurbo(this, 49, 292, textureX, textureY); // Import Core157
		bodyModel[64] = new ModelRendererTurbo(this, 5, 215, textureX, textureY); // Import Core158
		bodyModel[65] = new ModelRendererTurbo(this, 227, 217, textureX, textureY); // Import Core159
		bodyModel[66] = new ModelRendererTurbo(this, 317, 47, textureX, textureY); // Import Core16
		bodyModel[67] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[68] = new ModelRendererTurbo(this, 54, 215, textureX, textureY); // Import Core161
		bodyModel[69] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[70] = new ModelRendererTurbo(this, 227, 217, textureX, textureY); // Import Core163
		bodyModel[71] = new ModelRendererTurbo(this, 181, 76, textureX, textureY); // Import Core164
		bodyModel[72] = new ModelRendererTurbo(this, 227, 217, textureX, textureY); // Import Core165
		bodyModel[73] = new ModelRendererTurbo(this, 109, 91, textureX, textureY); // Import Core166
		bodyModel[74] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Import Core167
		bodyModel[75] = new ModelRendererTurbo(this, 175, 151, textureX, textureY); // Import Core168
		bodyModel[76] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Core169
		bodyModel[77] = new ModelRendererTurbo(this, 247, 96, textureX, textureY); // Import Core17
		bodyModel[78] = new ModelRendererTurbo(this, 90, 108, textureX, textureY); // Import Core170
		bodyModel[79] = new ModelRendererTurbo(this, 11, 259, textureX, textureY); // Import Core171
		bodyModel[80] = new ModelRendererTurbo(this, 394, 3, textureX, textureY); // Import Core172
		bodyModel[81] = new ModelRendererTurbo(this, 90, 89, textureX, textureY); // Import Core173
		bodyModel[82] = new ModelRendererTurbo(this, 113, 95, textureX, textureY); // Import Core174
		bodyModel[83] = new ModelRendererTurbo(this, 227, 228, textureX, textureY); // Import Core175
		bodyModel[84] = new ModelRendererTurbo(this, 227, 235, textureX, textureY); // Import Core176
		bodyModel[85] = new ModelRendererTurbo(this, 181, 89, textureX, textureY); // Import Core177
		bodyModel[86] = new ModelRendererTurbo(this, 7, 197, textureX, textureY); // Import Core178
		bodyModel[87] = new ModelRendererTurbo(this, 181, 67, textureX, textureY); // Import Core179
		bodyModel[88] = new ModelRendererTurbo(this, 247, 96, textureX, textureY); // Import Core18
		bodyModel[89] = new ModelRendererTurbo(this, 35, 197, textureX, textureY); // Import Core180
		bodyModel[90] = new ModelRendererTurbo(this, 54, 197, textureX, textureY); // Import Core181
		bodyModel[91] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Import Core182
		bodyModel[92] = new ModelRendererTurbo(this, 227, 228, textureX, textureY); // Import Core184
		bodyModel[93] = new ModelRendererTurbo(this, 181, 100, textureX, textureY); // Import Core185
		bodyModel[94] = new ModelRendererTurbo(this, 227, 235, textureX, textureY); // Import Core186
		bodyModel[95] = new ModelRendererTurbo(this, 181, 113, textureX, textureY); // Import Core187
		bodyModel[96] = new ModelRendererTurbo(this, 181, 126, textureX, textureY); // Import Core189
		bodyModel[97] = new ModelRendererTurbo(this, 230, 96, textureX, textureY); // Import Core19
		bodyModel[98] = new ModelRendererTurbo(this, 227, 228, textureX, textureY); // Import Core190
		bodyModel[99] = new ModelRendererTurbo(this, 181, 55, textureX, textureY); // Import Core193
		bodyModel[100] = new ModelRendererTurbo(this, 227, 228, textureX, textureY); // Import Core194
		bodyModel[101] = new ModelRendererTurbo(this, 181, 82, textureX, textureY); // Import Core197
		bodyModel[102] = new ModelRendererTurbo(this, 5, 215, textureX, textureY); // Import Core198
		bodyModel[103] = new ModelRendererTurbo(this, 311, 3, textureX, textureY); // Import Core199
		bodyModel[104] = new ModelRendererTurbo(this, 11, 259, textureX, textureY); // Import Core2
		bodyModel[105] = new ModelRendererTurbo(this, 230, 96, textureX, textureY); // Import Core20
		bodyModel[106] = new ModelRendererTurbo(this, 20, 269, textureX, textureY); // Import Core200
		bodyModel[107] = new ModelRendererTurbo(this, 179, 302, textureX, textureY); // Import Core201
		bodyModel[108] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Import Core202
		bodyModel[109] = new ModelRendererTurbo(this, 188, 151, textureX, textureY); // Import Core203
		bodyModel[110] = new ModelRendererTurbo(this, 181, 76, textureX, textureY); // Import Core204
		bodyModel[111] = new ModelRendererTurbo(this, 227, 235, textureX, textureY); // Import Core206
		bodyModel[112] = new ModelRendererTurbo(this, 181, 89, textureX, textureY); // Import Core208
		bodyModel[113] = new ModelRendererTurbo(this, 227, 235, textureX, textureY); // Import Core209
		bodyModel[114] = new ModelRendererTurbo(this, 51, 266, textureX, textureY); // Import Core21
		bodyModel[115] = new ModelRendererTurbo(this, 181, 67, textureX, textureY); // Import Core210
		bodyModel[116] = new ModelRendererTurbo(this, 7, 304, textureX, textureY); // Import Core80
		bodyModel[117] = new ModelRendererTurbo(this, 145, 72, textureX, textureY); // Import Core213
		bodyModel[118] = new ModelRendererTurbo(this, 181, 55, textureX, textureY); // Import Core214
		bodyModel[119] = new ModelRendererTurbo(this, 145, 67, textureX, textureY); // Import Core216
		bodyModel[120] = new ModelRendererTurbo(this, 181, 100, textureX, textureY); // Import Core217
		bodyModel[121] = new ModelRendererTurbo(this, 181, 113, textureX, textureY); // Import Core219
		bodyModel[122] = new ModelRendererTurbo(this, 230, 96, textureX, textureY); // Import Core22
		bodyModel[123] = new ModelRendererTurbo(this, 145, 72, textureX, textureY); // Import Core220
		bodyModel[124] = new ModelRendererTurbo(this, 181, 126, textureX, textureY); // Import Core221
		bodyModel[125] = new ModelRendererTurbo(this, 145, 67, textureX, textureY); // Import Core223
		bodyModel[126] = new ModelRendererTurbo(this, 161, 53, textureX, textureY); // Import Core224
		bodyModel[127] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core226
		bodyModel[128] = new ModelRendererTurbo(this, 161, 53, textureX, textureY); // Import Core228
		bodyModel[129] = new ModelRendererTurbo(this, 161, 53, textureX, textureY); // Import Core229
		bodyModel[130] = new ModelRendererTurbo(this, 234, 103, textureX, textureY); // Import Core23
		bodyModel[131] = new ModelRendererTurbo(this, 37, 204, textureX, textureY); // Import Core230
		bodyModel[132] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core231
		bodyModel[133] = new ModelRendererTurbo(this, 280, 302, textureX, textureY); // Import Core232
		bodyModel[134] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core233
		bodyModel[135] = new ModelRendererTurbo(this, 7, 463, textureX, textureY); // Import Core234
		bodyModel[136] = new ModelRendererTurbo(this, 134, 170, textureX, textureY); // Import Core235
		bodyModel[137] = new ModelRendererTurbo(this, 54, 215, textureX, textureY); // Import Core236
		bodyModel[138] = new ModelRendererTurbo(this, 20, 269, textureX, textureY); // Import Core237
		bodyModel[139] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core238
		bodyModel[140] = new ModelRendererTurbo(this, 161, 60, textureX, textureY); // Import Core239
		bodyModel[141] = new ModelRendererTurbo(this, 266, 103, textureX, textureY); // Import Core24
		bodyModel[142] = new ModelRendererTurbo(this, 50, 204, textureX, textureY); // Import Core240
		bodyModel[143] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core241
		bodyModel[144] = new ModelRendererTurbo(this, 67, 204, textureX, textureY); // Import Core242
		bodyModel[145] = new ModelRendererTurbo(this, 161, 60, textureX, textureY); // Import Core243
		bodyModel[146] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core244
		bodyModel[147] = new ModelRendererTurbo(this, 67, 204, textureX, textureY); // Import Core245
		bodyModel[148] = new ModelRendererTurbo(this, 161, 60, textureX, textureY); // Import Core246
		bodyModel[149] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core247
		bodyModel[150] = new ModelRendererTurbo(this, 11, 184, textureX, textureY); // Import Core248
		bodyModel[151] = new ModelRendererTurbo(this, 103, 245, textureX, textureY); // Import Core249
		bodyModel[152] = new ModelRendererTurbo(this, 248, 103, textureX, textureY); // Import Core25
		bodyModel[153] = new ModelRendererTurbo(this, 11, 177, textureX, textureY); // Import Core250
		bodyModel[154] = new ModelRendererTurbo(this, 126, 245, textureX, textureY); // Import Core251
		bodyModel[155] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core252
		bodyModel[156] = new ModelRendererTurbo(this, 7, 133, textureX, textureY); // Import Core253
		bodyModel[157] = new ModelRendererTurbo(this, 115, 245, textureX, textureY); // Import Core254
		bodyModel[158] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core255
		bodyModel[159] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core256
		bodyModel[160] = new ModelRendererTurbo(this, 56, 150, textureX, textureY); // Import Core257
		bodyModel[161] = new ModelRendererTurbo(this, 143, 252, textureX, textureY); // Import Core258
		bodyModel[162] = new ModelRendererTurbo(this, 79, 149, textureX, textureY); // Import Core259
		bodyModel[163] = new ModelRendererTurbo(this, 267, 85, textureX, textureY); // Import Core26
		bodyModel[164] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core260
		bodyModel[165] = new ModelRendererTurbo(this, 154, 252, textureX, textureY); // Import Core261
		bodyModel[166] = new ModelRendererTurbo(this, 125, 236, textureX, textureY); // Import Core262
		bodyModel[167] = new ModelRendererTurbo(this, 79, 134, textureX, textureY); // Import Core263
		bodyModel[168] = new ModelRendererTurbo(this, 127, 53, textureX, textureY); // Import Core264
		bodyModel[169] = new ModelRendererTurbo(this, 125, 67, textureX, textureY); // Import Core265
		bodyModel[170] = new ModelRendererTurbo(this, 139, 236, textureX, textureY); // Import Core266
		bodyModel[171] = new ModelRendererTurbo(this, 102, 108, textureX, textureY); // Import Core267
		bodyModel[172] = new ModelRendererTurbo(this, 371, 297, textureX, textureY); // Import Core268
		bodyModel[173] = new ModelRendererTurbo(this, 7, 428, textureX, textureY); // Import Core269
		bodyModel[174] = new ModelRendererTurbo(this, 250, 85, textureX, textureY); // Import Core27
		bodyModel[175] = new ModelRendererTurbo(this, 30, 270, textureX, textureY); // Import Core270
		bodyModel[176] = new ModelRendererTurbo(this, 108, 177, textureX, textureY); // Import Core271
		bodyModel[177] = new ModelRendererTurbo(this, 286, 155, textureX, textureY); // Import Core272
		bodyModel[178] = new ModelRendererTurbo(this, 56, 133, textureX, textureY); // Import Core273
		bodyModel[179] = new ModelRendererTurbo(this, 121, 229, textureX, textureY); // Import Core274
		bodyModel[180] = new ModelRendererTurbo(this, 245, 124, textureX, textureY); // Import Core275
		bodyModel[181] = new ModelRendererTurbo(this, 150, 229, textureX, textureY); // Import Core276
		bodyModel[182] = new ModelRendererTurbo(this, 262, 124, textureX, textureY); // Import Core277
		bodyModel[183] = new ModelRendererTurbo(this, 77, 203, textureX, textureY); // Import Core278
		bodyModel[184] = new ModelRendererTurbo(this, 228, 124, textureX, textureY); // Import Core279
		bodyModel[185] = new ModelRendererTurbo(this, 51, 272, textureX, textureY); // Import Core28
		bodyModel[186] = new ModelRendererTurbo(this, 173, 229, textureX, textureY); // Import Core280
		bodyModel[187] = new ModelRendererTurbo(this, 77, 214, textureX, textureY); // Import Core281
		bodyModel[188] = new ModelRendererTurbo(this, 263, 113, textureX, textureY); // Import Core282
		bodyModel[189] = new ModelRendererTurbo(this, 77, 214, textureX, textureY); // Import Core283
		bodyModel[190] = new ModelRendererTurbo(this, 132, 236, textureX, textureY); // Import Core284
		bodyModel[191] = new ModelRendererTurbo(this, 150, 229, textureX, textureY); // Import Core285
		bodyModel[192] = new ModelRendererTurbo(this, 263, 113, textureX, textureY); // Import Core286
		bodyModel[193] = new ModelRendererTurbo(this, 77, 203, textureX, textureY); // Import Core287
		bodyModel[194] = new ModelRendererTurbo(this, 84, 207, textureX, textureY); // Import Core288
		bodyModel[195] = new ModelRendererTurbo(this, 173, 229, textureX, textureY); // Import Core289
		bodyModel[196] = new ModelRendererTurbo(this, 436, 271, textureX, textureY); // Import Core29
		bodyModel[197] = new ModelRendererTurbo(this, 263, 113, textureX, textureY); // Import Core290
		bodyModel[198] = new ModelRendererTurbo(this, 246, 113, textureX, textureY); // Import Core291
		bodyModel[199] = new ModelRendererTurbo(this, 77, 203, textureX, textureY); // Import Core292
		bodyModel[200] = new ModelRendererTurbo(this, 121, 229, textureX, textureY); // Import Core293
		bodyModel[201] = new ModelRendererTurbo(this, 89, 222, textureX, textureY); // Import Core294
		bodyModel[202] = new ModelRendererTurbo(this, 246, 113, textureX, textureY); // Import Core295
		bodyModel[203] = new ModelRendererTurbo(this, 139, 236, textureX, textureY); // Import Core296
		bodyModel[204] = new ModelRendererTurbo(this, 246, 113, textureX, textureY); // Import Core297
		bodyModel[205] = new ModelRendererTurbo(this, 89, 222, textureX, textureY); // Import Core298
		bodyModel[206] = new ModelRendererTurbo(this, 132, 236, textureX, textureY); // Import Core299
		bodyModel[207] = new ModelRendererTurbo(this, 5, 49, textureX, textureY); // Import Core3
		bodyModel[208] = new ModelRendererTurbo(this, 587, 47, textureX, textureY); // Import Core30
		bodyModel[209] = new ModelRendererTurbo(this, 54, 215, textureX, textureY); // Import Core300
		bodyModel[210] = new ModelRendererTurbo(this, 246, 113, textureX, textureY); // Import Core301
		bodyModel[211] = new ModelRendererTurbo(this, 125, 236, textureX, textureY); // Import Core302
		bodyModel[212] = new ModelRendererTurbo(this, 30, 263, textureX, textureY); // Import Core303
		bodyModel[213] = new ModelRendererTurbo(this, 125, 177, textureX, textureY); // Import Core304
		bodyModel[214] = new ModelRendererTurbo(this, 7, 387, textureX, textureY); // Import Core305
		bodyModel[215] = new ModelRendererTurbo(this, 406, 47, textureX, textureY); // Import Core306
		bodyModel[216] = new ModelRendererTurbo(this, 436, 296, textureX, textureY); // Import Core307
		bodyModel[217] = new ModelRendererTurbo(this, 286, 145, textureX, textureY); // Import Core308
		bodyModel[218] = new ModelRendererTurbo(this, 227, 113, textureX, textureY); // Import Core309
		bodyModel[219] = new ModelRendererTurbo(this, 286, 145, textureX, textureY); // Import Core31
		bodyModel[220] = new ModelRendererTurbo(this, 89, 222, textureX, textureY); // Import Core310
		bodyModel[221] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Import Core311
		bodyModel[222] = new ModelRendererTurbo(this, 89, 222, textureX, textureY); // Import Core312
		bodyModel[223] = new ModelRendererTurbo(this, 263, 113, textureX, textureY); // Import Core313
		bodyModel[224] = new ModelRendererTurbo(this, 54, 215, textureX, textureY); // Import Core314
		bodyModel[225] = new ModelRendererTurbo(this, 5, 215, textureX, textureY); // Import Core315
		bodyModel[226] = new ModelRendererTurbo(this, 246, 113, textureX, textureY); // Import Core316
		bodyModel[227] = new ModelRendererTurbo(this, 246, 113, textureX, textureY); // Import Core317
		bodyModel[228] = new ModelRendererTurbo(this, 5, 215, textureX, textureY); // Import Core318
		bodyModel[229] = new ModelRendererTurbo(this, 5, 239, textureX, textureY); // Import Core319
		bodyModel[230] = new ModelRendererTurbo(this, 233, 85, textureX, textureY); // Import Core32
		bodyModel[231] = new ModelRendererTurbo(this, 228, 124, textureX, textureY); // Import Core320
		bodyModel[232] = new ModelRendererTurbo(this, 245, 124, textureX, textureY); // Import Core321
		bodyModel[233] = new ModelRendererTurbo(this, 5, 239, textureX, textureY); // Import Core322
		bodyModel[234] = new ModelRendererTurbo(this, 263, 113, textureX, textureY); // Import Core323
		bodyModel[235] = new ModelRendererTurbo(this, 246, 113, textureX, textureY); // Import Core324
		bodyModel[236] = new ModelRendererTurbo(this, 263, 113, textureX, textureY); // Import Core325
		bodyModel[237] = new ModelRendererTurbo(this, 305, 148, textureX, textureY); // Import Core326
		bodyModel[238] = new ModelRendererTurbo(this, 436, 422, textureX, textureY); // Import Core327
		bodyModel[239] = new ModelRendererTurbo(this, 30, 277, textureX, textureY); // Import Core328
		bodyModel[240] = new ModelRendererTurbo(this, 510, 47, textureX, textureY); // Import Core329
		bodyModel[241] = new ModelRendererTurbo(this, 230, 96, textureX, textureY); // Import Core33
		bodyModel[242] = new ModelRendererTurbo(this, 132, 177, textureX, textureY); // Import Core330
		bodyModel[243] = new ModelRendererTurbo(this, 262, 124, textureX, textureY); // Import Core331
		bodyModel[244] = new ModelRendererTurbo(this, 246, 113, textureX, textureY); // Import Core332
		bodyModel[245] = new ModelRendererTurbo(this, 235, 113, textureX, textureY); // Import Core333
		bodyModel[246] = new ModelRendererTurbo(this, 227, 113, textureX, textureY); // Import Core334
		bodyModel[247] = new ModelRendererTurbo(this, 250, 85, textureX, textureY); // Import Core335
		bodyModel[248] = new ModelRendererTurbo(this, 267, 85, textureX, textureY); // Import Core336
		bodyModel[249] = new ModelRendererTurbo(this, 233, 85, textureX, textureY); // Import Core337
		bodyModel[250] = new ModelRendererTurbo(this, 247, 96, textureX, textureY); // Import Core338
		bodyModel[251] = new ModelRendererTurbo(this, 230, 96, textureX, textureY); // Import Core34
		bodyModel[252] = new ModelRendererTurbo(this, 230, 96, textureX, textureY); // Import Core35
		bodyModel[253] = new ModelRendererTurbo(this, 247, 96, textureX, textureY); // Import Core36
		bodyModel[254] = new ModelRendererTurbo(this, 247, 96, textureX, textureY); // Import Core37
		bodyModel[255] = new ModelRendererTurbo(this, 247, 96, textureX, textureY); // Import Core38
		bodyModel[256] = new ModelRendererTurbo(this, 266, 103, textureX, textureY); // Import Core39
		bodyModel[257] = new ModelRendererTurbo(this, 436, 374, textureX, textureY); // Import Core4
		bodyModel[258] = new ModelRendererTurbo(this, 248, 103, textureX, textureY); // Import Core40
		bodyModel[259] = new ModelRendererTurbo(this, 234, 103, textureX, textureY); // Import Core41
		bodyModel[260] = new ModelRendererTurbo(this, 51, 250, textureX, textureY); // Import Core42
		bodyModel[261] = new ModelRendererTurbo(this, 371, 266, textureX, textureY); // Import Core43
		bodyModel[262] = new ModelRendererTurbo(this, 648, 40, textureX, textureY); // Import Core44
		bodyModel[263] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core45
		bodyModel[264] = new ModelRendererTurbo(this, 163, 78, textureX, textureY); // Import Core46
		bodyModel[265] = new ModelRendererTurbo(this, 163, 71, textureX, textureY); // Import Core47
		bodyModel[266] = new ModelRendererTurbo(this, 163, 71, textureX, textureY); // Import Core48
		bodyModel[267] = new ModelRendererTurbo(this, 163, 71, textureX, textureY); // Import Core49
		bodyModel[268] = new ModelRendererTurbo(this, 280, 415, textureX, textureY); // Import Core5
		bodyModel[269] = new ModelRendererTurbo(this, 163, 71, textureX, textureY); // Import Core50
		bodyModel[270] = new ModelRendererTurbo(this, 163, 71, textureX, textureY); // Import Core51
		bodyModel[271] = new ModelRendererTurbo(this, 163, 71, textureX, textureY); // Import Core52
		bodyModel[272] = new ModelRendererTurbo(this, 163, 78, textureX, textureY); // Import Core53
		bodyModel[273] = new ModelRendererTurbo(this, 283, 61, textureX, textureY); // Import Core54
		bodyModel[274] = new ModelRendererTurbo(this, 293, 61, textureX, textureY); // Import Core55
		bodyModel[275] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core56
		bodyModel[276] = new ModelRendererTurbo(this, 280, 261, textureX, textureY); // Import Core57
		bodyModel[277] = new ModelRendererTurbo(this, 353, 142, textureX, textureY); // Import Core58
		bodyModel[278] = new ModelRendererTurbo(this, 293, 53, textureX, textureY); // Import Core59
		bodyModel[279] = new ModelRendererTurbo(this, 116, 162, textureX, textureY); // Import Core6
		bodyModel[280] = new ModelRendererTurbo(this, 235, 143, textureX, textureY); // Import Core60
		bodyModel[281] = new ModelRendererTurbo(this, 286, 145, textureX, textureY); // Import Core61
		bodyModel[282] = new ModelRendererTurbo(this, 179, 257, textureX, textureY); // Import Core62
		bodyModel[283] = new ModelRendererTurbo(this, 420, 142, textureX, textureY); // Import Core63
		bodyModel[284] = new ModelRendererTurbo(this, 51, 249, textureX, textureY); // Import Core64
		bodyModel[285] = new ModelRendererTurbo(this, 179, 345, textureX, textureY); // Import Core65
		bodyModel[286] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core66
		bodyModel[287] = new ModelRendererTurbo(this, 499, 142, textureX, textureY); // Import Core67
		bodyModel[288] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core68
		bodyModel[289] = new ModelRendererTurbo(this, 51, 249, textureX, textureY); // Import Core69
		bodyModel[290] = new ModelRendererTurbo(this, 576, 3, textureX, textureY); // Import Core7
		bodyModel[291] = new ModelRendererTurbo(this, 280, 339, textureX, textureY); // Import Core70
		bodyModel[292] = new ModelRendererTurbo(this, 548, 142, textureX, textureY); // Import Core71
		bodyModel[293] = new ModelRendererTurbo(this, 51, 249, textureX, textureY); // Import Core72
		bodyModel[294] = new ModelRendererTurbo(this, 371, 328, textureX, textureY); // Import Core73
		bodyModel[295] = new ModelRendererTurbo(this, 589, 142, textureX, textureY); // Import Core74
		bodyModel[296] = new ModelRendererTurbo(this, 286, 145, textureX, textureY); // Import Core75
		bodyModel[297] = new ModelRendererTurbo(this, 648, 71, textureX, textureY); // Import Core76
		bodyModel[298] = new ModelRendererTurbo(this, 51, 249, textureX, textureY); // Import Core77
		bodyModel[299] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core78
		bodyModel[300] = new ModelRendererTurbo(this, 436, 322, textureX, textureY); // Import Core79
		bodyModel[301] = new ModelRendererTurbo(this, 102, 162, textureX, textureY); // Import Core8
		bodyModel[302] = new ModelRendererTurbo(this, 7, 299, textureX, textureY); // Import Core80
		bodyModel[303] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core81
		bodyModel[304] = new ModelRendererTurbo(this, 436, 439, textureX, textureY); // Import Core82
		bodyModel[305] = new ModelRendererTurbo(this, 607, 93, textureX, textureY); // Import Core83
		bodyModel[306] = new ModelRendererTurbo(this, 102, 89, textureX, textureY); // Import Core84
		bodyModel[307] = new ModelRendererTurbo(this, 51, 272, textureX, textureY); // Import Core85
		bodyModel[308] = new ModelRendererTurbo(this, 129, 162, textureX, textureY); // Import Core86
		bodyModel[309] = new ModelRendererTurbo(this, 175, 151, textureX, textureY); // Import Core87
		bodyModel[310] = new ModelRendererTurbo(this, 11, 259, textureX, textureY); // Import Core88
		bodyModel[311] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core89
		bodyModel[312] = new ModelRendererTurbo(this, 436, 462, textureX, textureY); // Import Core9
		bodyModel[313] = new ModelRendererTurbo(this, 436, 479, textureX, textureY); // Import Core90
		bodyModel[314] = new ModelRendererTurbo(this, 179, 390, textureX, textureY); // Import Core92
		bodyModel[315] = new ModelRendererTurbo(this, 7, 299, textureX, textureY); // Import Core80
		bodyModel[316] = new ModelRendererTurbo(this, 286, 137, textureX, textureY); // Import Core94
		bodyModel[317] = new ModelRendererTurbo(this, 149, 203, textureX, textureY); // Import Core95
		bodyModel[318] = new ModelRendererTurbo(this, 528, 93, textureX, textureY); // Import Core96
		bodyModel[319] = new ModelRendererTurbo(this, 7, 344, textureX, textureY); // Import Core80
		bodyModel[320] = new ModelRendererTurbo(this, 280, 380, textureX, textureY); // Import Core98
		bodyModel[321] = new ModelRendererTurbo(this, 149, 203, textureX, textureY); // Import Core99
		bodyModel[322] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel1
		bodyModel[323] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel10
		bodyModel[324] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel11
		bodyModel[325] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import CoreWheel12
		bodyModel[326] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel13
		bodyModel[327] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import CoreWheel14
		bodyModel[328] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel15
		bodyModel[329] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import CoreWheel16
		bodyModel[330] = new ModelRendererTurbo(this, 306, 182, textureX, textureY); // Import CoreWheel17
		bodyModel[331] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel18
		bodyModel[332] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel19
		bodyModel[333] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel2
		bodyModel[334] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel20
		bodyModel[335] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel21
		bodyModel[336] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import CoreWheel22
		bodyModel[337] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import CoreWheel23
		bodyModel[338] = new ModelRendererTurbo(this, 307, 212, textureX, textureY); // Import CoreWheel24
		bodyModel[339] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import CoreWheel25
		bodyModel[340] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel3
		bodyModel[341] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel4
		bodyModel[342] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel5
		bodyModel[343] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel6
		bodyModel[344] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel7
		bodyModel[345] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel8
		bodyModel[346] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import CoreWheel9
		bodyModel[347] = new ModelRendererTurbo(this, 3, 53, textureX, textureY); // Import MGbase1
		bodyModel[348] = new ModelRendererTurbo(this, 3, 60, textureX, textureY); // Import MGbase2
		bodyModel[349] = new ModelRendererTurbo(this, 3, 60, textureX, textureY); // Import MGbase3
		bodyModel[350] = new ModelRendererTurbo(this, 27, 47, textureX, textureY); // Import PassengerMG1
		bodyModel[351] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG10
		bodyModel[352] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG11
		bodyModel[353] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG12
		bodyModel[354] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG13
		bodyModel[355] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG14
		bodyModel[356] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG15
		bodyModel[357] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG16
		bodyModel[358] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG17
		bodyModel[359] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG18
		bodyModel[360] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG19
		bodyModel[361] = new ModelRendererTurbo(this, 27, 51, textureX, textureY); // Import PassengerMG2
		bodyModel[362] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG20
		bodyModel[363] = new ModelRendererTurbo(this, 41, 36, textureX, textureY); // Import PassengerMG21
		bodyModel[364] = new ModelRendererTurbo(this, 31, 32, textureX, textureY); // Import PassengerMG22
		bodyModel[365] = new ModelRendererTurbo(this, 41, 31, textureX, textureY); // Import PassengerMG23
		bodyModel[366] = new ModelRendererTurbo(this, 3, 25, textureX, textureY); // Import PassengerMG24
		bodyModel[367] = new ModelRendererTurbo(this, 3, 25, textureX, textureY); // Import PassengerMG25
		bodyModel[368] = new ModelRendererTurbo(this, 12, 25, textureX, textureY); // Import PassengerMG26
		bodyModel[369] = new ModelRendererTurbo(this, 12, 25, textureX, textureY); // Import PassengerMG27
		bodyModel[370] = new ModelRendererTurbo(this, 12, 25, textureX, textureY); // Import PassengerMG28
		bodyModel[371] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import PassengerMG29
		bodyModel[372] = new ModelRendererTurbo(this, 27, 51, textureX, textureY); // Import PassengerMG3
		bodyModel[373] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Import PassengerMG30
		bodyModel[374] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Import PassengerMG31
		bodyModel[375] = new ModelRendererTurbo(this, 2, 30, textureX, textureY); // Import PassengerMG32
		bodyModel[376] = new ModelRendererTurbo(this, 2, 30, textureX, textureY); // Import PassengerMG33
		bodyModel[377] = new ModelRendererTurbo(this, 2, 30, textureX, textureY); // Import PassengerMG34
		bodyModel[378] = new ModelRendererTurbo(this, 27, 51, textureX, textureY); // Import PassengerMG4
		bodyModel[379] = new ModelRendererTurbo(this, 19, 51, textureX, textureY); // Import PassengerMG5
		bodyModel[380] = new ModelRendererTurbo(this, 19, 55, textureX, textureY); // Import PassengerMG6
		bodyModel[381] = new ModelRendererTurbo(this, 4, 64, textureX, textureY); // Import PassengerMG7
		bodyModel[382] = new ModelRendererTurbo(this, 19, 47, textureX, textureY); // Import PassengerMG8
		bodyModel[383] = new ModelRendererTurbo(this, 43, 42, textureX, textureY); // Import PassengerMG9

		bodyModel[0].addShapeBox(20F, -18F, 16F, 2, 2, 1, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core1
		bodyModel[0].setRotationPoint(0F, 2F, 0F);

		bodyModel[1].addShapeBox(20F, -16F, -18F, 2, 17, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core10
		bodyModel[1].setRotationPoint(0F, 2F, 0F);

		bodyModel[2].addShapeBox(-34F, -7F, -17.5F, 14, 6, 33, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Import Core100
		bodyModel[2].setRotationPoint(0F, 2F, 1F);

		bodyModel[3].addShapeBox(29F, -2.5F, -16F, 2, 1, 5, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core101
		bodyModel[3].setRotationPoint(0F, 2F, 0F);

		bodyModel[4].addShapeBox(0.5F, 4F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core102
		bodyModel[4].setRotationPoint(-47F, -3F, 0F);

		bodyModel[5].addShapeBox(29F, -3F, -13F, 2, 2, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core103
		bodyModel[5].setRotationPoint(0F, 2F, 0F);

		bodyModel[6].addShapeBox(-25.5F, -26F, -15.5F, 11, 1, 2, 0F, 2F, 2F, 0F, 0F, 1.5F, -.5F, 0F, 1.5F, -.5F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Core80
		bodyModel[6].setRotationPoint(0F, 2F, 0F);

		bodyModel[7].addShapeBox(39F, -5F, -10F, 5, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, -2.5F, -3F, 0F, -5.5F, -3F, 0F, -5.5F, 2F, 0F, -2.5F); // Import Core105
		bodyModel[7].setRotationPoint(0F, 2F, 0F);

		bodyModel[8].addShapeBox(-20F, -7F, -18F, 3, 6, 36, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F); // Import Core106
		bodyModel[8].setRotationPoint(0F, 2F, 0F);

		bodyModel[9].addShapeBox(0.7F, 2F, -1.5F, 1, 2, 3, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import Core107
		bodyModel[9].setRotationPoint(-47F, -3F, 0F);

		bodyModel[10].addShapeBox(44F, -5F, -7F, 2, 4, 14, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 0F, -2.5F, -3F, 0F, -4.5F, -3F, 0F, -4.5F, 3F, 0F, -2.5F); // Import Core108
		bodyModel[10].setRotationPoint(0F, 2F, 0F);

		bodyModel[11].addShapeBox(-14.5F, -29F, -18F, 13, 4, 7, 0F, 0F, -1.5F, -3F, 0F, 1F, -2F, 0F, 1F, -4F, 0F, -1.5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F); // Import Core80
		bodyModel[11].setRotationPoint(0F, 2F, 0F);

		bodyModel[12].addShapeBox(-3F, -17.5F, -18F, 1, 2, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core11
		bodyModel[12].setRotationPoint(0F, 2F, 0F);

		bodyModel[13].addShapeBox(33F, -3F, -13F, 2, 2, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core110
		bodyModel[13].setRotationPoint(0F, 2F, 0F);

		bodyModel[14].addShapeBox(0.7F, 3F, -1.5F, 1, 2, 3, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Import Core111
		bodyModel[14].setRotationPoint(-47F, -3F, 0F);

		bodyModel[15].addShapeBox(-1.5F, -25F, -16.5F, 21, 0, 2, 0F, 0F, 5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Core80
		bodyModel[15].setRotationPoint(0F, 2F, 0F);

		bodyModel[16].addShapeBox(33F, -2.5F, -16F, 2, 1, 5, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core113
		bodyModel[16].setRotationPoint(0F, 2F, 0F);

		bodyModel[17].addShapeBox(37F, -1F, -8F, 4, 3, 16, 0F, 0F, 0F, -.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -.5F, 2F, 0F, -2F, -3F, 0F, -5F, -3F, 0F, -5F, 2F, 0F, -2F); // Import Core114
		bodyModel[17].setRotationPoint(0F, 2F, 0F);

		bodyModel[18].addShapeBox(22F, -1F, -18F, 7, 3, 36, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F); // Import Core115
		bodyModel[18].setRotationPoint(0F, 2F, 0F);

		bodyModel[19].addBox(-32F, -20F, 10.5F, 2, 4, 2, 0F); // Import Core116
		bodyModel[19].setRotationPoint(0F, 2F, 1F);

		bodyModel[20].addShapeBox(-22.5F, -25F, 14.5F, 9, 9, 1, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F, 2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, -2.5F, 0F, 1.5F, -1F, 0F, 0F); // Import Core80
		bodyModel[20].setRotationPoint(-1F, 2F, 0F);

		bodyModel[21].addShapeBox(-23.5F, -25F, -14.5F, 1, 9, 29, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core80
		bodyModel[21].setRotationPoint(0F, 2F, 0F);

		bodyModel[22].addShapeBox(31.5F, -0.5F, -17F, 1, 1, 6, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F); // Import Core119
		bodyModel[22].setRotationPoint(0F, 2F, 0F);

		bodyModel[23].addShapeBox(-48F, -6F, -4F, 2, 2, 8, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Import Core12
		bodyModel[23].setRotationPoint(0F, 2F, 0F);

		bodyModel[24].addBox(-32F, -20F, -14.5F, 2, 4, 2, 0F); // Import Core120
		bodyModel[24].setRotationPoint(0F, 2F, 1F);

		bodyModel[25].addShapeBox(32F, -1F, -10F, 6, 3, 20, 0F, 0F, 0F, 0F, -4F, 0F, -2.5F, -4F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, -4F); // Import Core121
		bodyModel[25].setRotationPoint(3F, 2F, 0F);

		bodyModel[26].addShapeBox(31F, -1F, -16F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core122
		bodyModel[26].setRotationPoint(0F, 2F, 0F);

		bodyModel[27].addShapeBox(-27.5F, -29F, -15.5F, 13, 1, 31, 0F, -1F, -.5F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, 0F, 0F); // Import Core80
		bodyModel[27].setRotationPoint(0F, 2F, 0F);

		bodyModel[28].addBox(-33F, -21F, -15.5F, 4, 2, 29, 0F); // Import Core124
		bodyModel[28].setRotationPoint(0F, 2F, 1F);

		bodyModel[29].addShapeBox(29F, -3F, -17F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core125
		bodyModel[29].setRotationPoint(0F, 2F, 0F);

		bodyModel[30].addShapeBox(-33F, -22F, -15.5F, 4, 1, 29, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core126
		bodyModel[30].setRotationPoint(0F, 2F, 1F);

		bodyModel[31].addShapeBox(-1.5F, -25F, -16.5F, 21, 1, 1, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Import Core80
		bodyModel[31].setRotationPoint(0F, 2F, 0F);

		bodyModel[32].addShapeBox(33F, 1F, -13F, 2, 2, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core128
		bodyModel[32].setRotationPoint(0F, 2F, 0F);

		bodyModel[33].addShapeBox(-14.5F, -25F, -18F, 13, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 1F); // Import Core80
		bodyModel[33].setRotationPoint(0F, 2F, 0F);

		bodyModel[34].addShapeBox(20F, -18F, -17F, 2, 2, 1, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core13
		bodyModel[34].setRotationPoint(0F, 2F, 0F);

		bodyModel[35].addShapeBox(-33F, -19F, -15.5F, 4, 1, 29, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Core130
		bodyModel[35].setRotationPoint(0F, 2F, 1F);

		bodyModel[36].addShapeBox(-48.5F, -6.5F, 3.5F, 1, 3, 1, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Import Core131
		bodyModel[36].setRotationPoint(0F, 2F, 0F);

		bodyModel[37].addShapeBox(25.5F, -15.5F, -15F, 1, 1, 30, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core132
		bodyModel[37].setRotationPoint(0F, 2F, 0F);
		bodyModel[37].rotateAngleZ = 0.43633231F;

		bodyModel[38].addShapeBox(-16F, -14F, -18F, 36, 15, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core133
		bodyModel[38].setRotationPoint(0F, 2F, 0F);

		bodyModel[39].addShapeBox(-16F, -14F, 17F, 36, 15, 1, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core134
		bodyModel[39].setRotationPoint(0F, 2F, 0F);

		bodyModel[40].addShapeBox(30F, -1F, 11F, 4, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import Core135
		bodyModel[40].setRotationPoint(0F, 2F, 0F);

		bodyModel[41].addShapeBox(11F, -6F, -1F, 2, 2, 2, 0F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Core136
		bodyModel[41].setRotationPoint(0F, 2F, 0F);

		bodyModel[42].addShapeBox(-42F, -16F, -14.5F, 8, 5, 29, 0F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Import Core137
		bodyModel[42].setRotationPoint(0F, 2F, 0F);

		bodyModel[43].addShapeBox(33F, 1.5F, -16F, 2, 1, 5, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core139
		bodyModel[43].setRotationPoint(0F, 2F, 0F);

		bodyModel[44].addShapeBox(29F, 1F, 14F, 2, 2, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core14
		bodyModel[44].setRotationPoint(0F, 2F, 0F);

		bodyModel[45].addBox(-31.5F, -20.5F, 13.5F, 1, 1, 2, 0F); // Import Core140
		bodyModel[45].setRotationPoint(0F, 2F, 1F);

		bodyModel[46].addShapeBox(-26.5F, -20F, -15.5F, 3, 4, 31, 0F, -2.1F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -2.1F, 0F, -1.5F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F); // Import Core80
		bodyModel[46].setRotationPoint(0F, 2F, 0F);

		bodyModel[47].addShapeBox(-31.5F, -20.5F, 15.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Core142
		bodyModel[47].setRotationPoint(-2F, 2F, 1F);

		bodyModel[48].addShapeBox(33F, 1F, -16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core143
		bodyModel[48].setRotationPoint(0F, 2F, 0F);

		bodyModel[49].addShapeBox(29F, 1F, -13F, 2, 2, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core144
		bodyModel[49].setRotationPoint(0F, 2F, 0F);

		bodyModel[50].addShapeBox(-14.5F, -29F, 11F, 13, 4, 7, 0F, 0F, -1.5F, -3F, 0F, 1F, -4F, 0F, 1F, -2F, 0F, -1.5F, -3F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Core80
		bodyModel[50].setRotationPoint(0F, 2F, 0F);

		bodyModel[51].addShapeBox(-1.5F, -25F, 14.5F, 21, 0, 2, 0F, 0F, 5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Import Core80
		bodyModel[51].setRotationPoint(0F, 2F, 0F);

		bodyModel[52].addShapeBox(29F, 1.5F, -16F, 2, 1, 5, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core147
		bodyModel[52].setRotationPoint(0F, 2F, 0F);

		bodyModel[53].addShapeBox(-31.5F, -20.5F, -18.5F, 3, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core148
		bodyModel[53].setRotationPoint(-2F, 2F, 1F);

		bodyModel[54].addShapeBox(-25.5F, -26F, 13.5F, 11, 1, 2, 0F, 2F, 2F, 0F, 0F, 1.5F, -.5F, 0F, 1.5F, -.5F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Import Core80
		bodyModel[54].setRotationPoint(0F, 2F, 0F);

		bodyModel[55].addShapeBox(49F, -12F, -6F, 1, 1, 12, 0F, 0F, -.5F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Core15
		bodyModel[55].setRotationPoint(0F, 2F, 0F);

		bodyModel[56].addShapeBox(29F, 1F, -16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core150
		bodyModel[56].setRotationPoint(0F, 2F, 0F);

		bodyModel[57].addBox(-31.5F, -20.5F, -17.5F, 1, 1, 2, 0F); // Import Core151
		bodyModel[57].setRotationPoint(0F, 2F, 1F);

		bodyModel[58].addShapeBox(1F, -3F, 3F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core152
		bodyModel[58].setRotationPoint(0F, 2F, 0F);

		bodyModel[59].addShapeBox(-25.5F, -26F, -13.5F, 1, 1, 27, 0F, 2F, 2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core80
		bodyModel[59].setRotationPoint(0F, 2F, 0F);

		bodyModel[60].addShapeBox(30F, -1F, -14F, 4, 2, 3, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core154
		bodyModel[60].setRotationPoint(0F, 2F, 0F);

		bodyModel[61].addShapeBox(1F, -3F, -13F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core155
		bodyModel[61].setRotationPoint(0F, 2F, 0F);

		bodyModel[62].addShapeBox(-31F, -3F, -13F, 6, 6, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core156
		bodyModel[62].setRotationPoint(0F, 2F, 0F);

		bodyModel[63].addShapeBox(-3F, -26.5F, -17F, 1, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core157
		bodyModel[63].setRotationPoint(0F, 2F, 0F);

		bodyModel[64].addShapeBox(1F, -5F, -14F, 10, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core158
		bodyModel[64].setRotationPoint(0F, 2F, 0F);

		bodyModel[65].addShapeBox(-29.5F, -1.5F, -16F, 3, 3, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core159
		bodyModel[65].setRotationPoint(0F, 2F, 0F);

		bodyModel[66].addShapeBox(-20F, -11F, -18F, 3, 4, 36, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Import Core16
		bodyModel[66].setRotationPoint(0F, 2F, 0F);

		bodyModel[67].addShapeBox(-1.5F, -25F, -14.5F, 21, 0, 29, 0F, 0F, 5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, .5F, 0F, -4F, .5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, .5F); // Import Core80
		bodyModel[67].setRotationPoint(0F, 2F, 0F);

		bodyModel[68].addShapeBox(0F, -14F, -14F, 2, 11, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core161
		bodyModel[68].setRotationPoint(0F, 2F, 0F);
		bodyModel[68].rotateAngleZ = 0.20943951F;

		bodyModel[69].addShapeBox(-14.5F, -29F, -15F, 13, 2, 30, 0F, 0F, -1.5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F); // Import Core80
		bodyModel[69].setRotationPoint(0F, 2F, 0F);

		bodyModel[70].addShapeBox(-31F, -3F, 16F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core163
		bodyModel[70].setRotationPoint(0F, 2F, 0F);

		bodyModel[71].addShapeBox(-16F, -8F, 18F, 41, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core164
		bodyModel[71].setRotationPoint(0F, 2F, 0F);

		bodyModel[72].addShapeBox(-31F, -3F, -17F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core165
		bodyModel[72].setRotationPoint(0F, 2F, 0F);

		bodyModel[73].addShapeBox(20F, -16F, 16F, 2, 17, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core166
		bodyModel[73].setRotationPoint(0F, 2F, 0F);

		bodyModel[74].addShapeBox(11.5F, -8F, -0.5F, 1, 2, 1, 0F, -.6F, 0F, -.1F, .4F, 0F, -.1F, .4F, 0F, -.1F, -.6F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Import Core167
		bodyModel[74].setRotationPoint(0F, 2F, 0F);

		bodyModel[75].addShapeBox(-47.5F, -6F, -4.5F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core168
		bodyModel[75].setRotationPoint(0F, 2F, 0F);

		bodyModel[76].addShapeBox(31.5F, -0.5F, 11F, 1, 1, 6, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F); // Import Core169
		bodyModel[76].setRotationPoint(0F, 2F, 0F);

		bodyModel[77].addShapeBox(34F, -16F, 9.5F, 4, 1, 2, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core17
		bodyModel[77].setRotationPoint(0F, 2F, 0F);

		bodyModel[78].addShapeBox(17F, -16F, 17F, 3, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core170
		bodyModel[78].setRotationPoint(0F, 2F, 0F);

		bodyModel[79].addShapeBox(25.5F, -15.5F, -16F, 1, 10, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core171
		bodyModel[79].setRotationPoint(0F, 2F, 0F);
		bodyModel[79].rotateAngleZ = 0.43633231F;

		bodyModel[80].addShapeBox(-34F, -16F, -18.5F, 14, 5, 35, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Core172
		bodyModel[80].setRotationPoint(0F, 2F, 1F);

		bodyModel[81].addShapeBox(17F, -16F, -18F, 3, 2, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core173
		bodyModel[81].setRotationPoint(0F, 2F, 0F);

		bodyModel[82].addShapeBox(20F, -16F, -16F, 2, 2, 32, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core174
		bodyModel[82].setRotationPoint(0F, 2F, 0F);

		bodyModel[83].addShapeBox(-31F, 2F, 13F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core175
		bodyModel[83].setRotationPoint(0F, 2F, 0F);

		bodyModel[84].addShapeBox(-31F, 2F, 14F, 1, 1, 3, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F); // Import Core176
		bodyModel[84].setRotationPoint(0F, 2F, 0F);

		bodyModel[85].addShapeBox(25F, -8F, 16F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Core177
		bodyModel[85].setRotationPoint(0F, 2F, 0F);

		bodyModel[86].addShapeBox(12F, -21F, 2F, 2, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core178
		bodyModel[86].setRotationPoint(0F, 2F, 0F);
		bodyModel[86].rotateAngleZ = -0.43633231F;

		bodyModel[87].addShapeBox(-25F, -8F, 15F, 9, 1, 5, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Core179
		bodyModel[87].setRotationPoint(0F, 2F, 0F);

		bodyModel[88].addShapeBox(34F, -16F, 8.5F, 4, 1, 1, 0F, -1F, -.5F, -.2F, -1F, -.5F, -.2F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core18
		bodyModel[88].setRotationPoint(0F, 2F, 0F);

		bodyModel[89].addShapeBox(11F, -17F, 7F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core180
		bodyModel[89].setRotationPoint(0F, 2F, 0F);
		bodyModel[89].rotateAngleZ = -0.43633231F;

		bodyModel[90].addShapeBox(7F, -17F, 7F, 15, 2, 2, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Import Core181
		bodyModel[90].setRotationPoint(0F, 2F, 0F);
		bodyModel[90].rotateAngleZ = -0.43633231F;

		bodyModel[91].addShapeBox(22F, -8F, 17F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core182
		bodyModel[91].setRotationPoint(0F, 2F, 0F);

		bodyModel[92].addShapeBox(-26F, 2F, 13F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core184
		bodyModel[92].setRotationPoint(0F, 2F, 0F);

		bodyModel[93].addShapeBox(29F, -10F, 12F, 10, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core185
		bodyModel[93].setRotationPoint(0F, 2F, 0F);

		bodyModel[94].addShapeBox(-26F, 2F, 14F, 1, 1, 3, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F); // Import Core186
		bodyModel[94].setRotationPoint(0F, 2F, 0F);

		bodyModel[95].addShapeBox(39F, -10F, 11F, 3, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F); // Import Core187
		bodyModel[95].setRotationPoint(0F, 2F, 0F);

		bodyModel[96].addShapeBox(42F, -10F, 8F, 2, 1, 8, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1.5F); // Import Core189
		bodyModel[96].setRotationPoint(0F, 2F, 0F);

		bodyModel[97].addShapeBox(35.5F, -15.5F, 11.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Import Core19
		bodyModel[97].setRotationPoint(-1F, 2F, 0F);

		bodyModel[98].addShapeBox(-26F, 2F, -14F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core190
		bodyModel[98].setRotationPoint(0F, 2F, 0F);

		bodyModel[99].addShapeBox(-40F, -12F, 12F, 15, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core193
		bodyModel[99].setRotationPoint(0F, 2F, 0F);

		bodyModel[100].addShapeBox(-31F, 2F, -14F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core194
		bodyModel[100].setRotationPoint(0F, 2F, 0F);

		bodyModel[101].addShapeBox(22F, -8F, -18F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core197
		bodyModel[101].setRotationPoint(0F, 2F, 0F);

		bodyModel[102].addShapeBox(1F, -5F, 2F, 10, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core198
		bodyModel[102].setRotationPoint(0F, 2F, 0F);

		bodyModel[103].addShapeBox(-20F, -16F, -18F, 3, 5, 36, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Import Core199
		bodyModel[103].setRotationPoint(0F, 2F, 0F);

		bodyModel[104].addShapeBox(25.5F, -7.5F, -15F, 1, 2, 30, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core2
		bodyModel[104].setRotationPoint(0F, 2F, 0F);
		bodyModel[104].rotateAngleZ = 0.43633231F;

		bodyModel[105].addShapeBox(34.5F, -15.5F, 9.5F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core20
		bodyModel[105].setRotationPoint(0F, 2F, 0F);

		bodyModel[106].addShapeBox(20.5F, -20F, 16F, 1, 3, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import Core200
		bodyModel[106].setRotationPoint(0F, 2F, 0F);

		bodyModel[107].addShapeBox(22F, -11F, -18F, 10, 2, 36, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Core201
		bodyModel[107].setRotationPoint(0F, 2F, 0F);

		bodyModel[108].addShapeBox(12F, -10F, -0.5F, 1, 2, 1, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Import Core202
		bodyModel[108].setRotationPoint(0F, 2F, 0F);

		bodyModel[109].addShapeBox(-48.5F, -6F, -4.5F, 1, 2, 1, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F); // Import Core203
		bodyModel[109].setRotationPoint(0F, 2F, 0F);

		bodyModel[110].addShapeBox(-16F, -8F, -20F, 41, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core204
		bodyModel[110].setRotationPoint(0F, 2F, 0F);

		bodyModel[111].addShapeBox(-26F, 2F, -17F, 1, 1, 3, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Import Core206
		bodyModel[111].setRotationPoint(0F, 2F, 0F);

		bodyModel[112].addShapeBox(25F, -8F, -20F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Core208
		bodyModel[112].setRotationPoint(0F, 2F, 0F);

		bodyModel[113].addShapeBox(-31F, 2F, -17F, 1, 1, 3, 0F, -.2F, .2F, 0F, -.2F, .2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.6F, 0F, -.2F, -.6F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Import Core209
		bodyModel[113].setRotationPoint(0F, 2F, 0F);

		bodyModel[114].addShapeBox(-3F, -17.5F, 17F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core21
		bodyModel[114].setRotationPoint(0F, 2F, 0F);

		bodyModel[115].addShapeBox(-25F, -8F, -20F, 9, 1, 5, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Import Core210
		bodyModel[115].setRotationPoint(0F, 2F, 0F);

		bodyModel[116].addShapeBox(19.5F, -25F, -16.5F, 1, 1, 33, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Core80
		bodyModel[116].setRotationPoint(0F, 2F, 0F);

		bodyModel[117].addBox(43F, -9F, 15.5F, 1, 1, 2, 0F); // Import Core213
		bodyModel[117].setRotationPoint(0F, 2F, 0F);

		bodyModel[118].addShapeBox(-40F, -12F, -20F, 15, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core214
		bodyModel[118].setRotationPoint(0F, 2F, 0F);

		bodyModel[119].addShapeBox(43F, -10F, 16F, 1, 1, 1, 0F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Core216
		bodyModel[119].setRotationPoint(0F, 2F, 0F);

		bodyModel[120].addShapeBox(29F, -10F, -20F, 10, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core217
		bodyModel[120].setRotationPoint(0F, 2F, 0F);

		bodyModel[121].addShapeBox(39F, -10F, -19F, 3, 1, 8, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core219
		bodyModel[121].setRotationPoint(0F, 2F, 0F);

		bodyModel[122].addShapeBox(35.5F, -15.5F, 8.5F, 3, 1, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core22
		bodyModel[122].setRotationPoint(-1F, 2F, 0F);

		bodyModel[123].addBox(43F, -9F, -17.5F, 1, 1, 2, 0F); // Import Core220
		bodyModel[123].setRotationPoint(0F, 2F, 0F);

		bodyModel[124].addShapeBox(42F, -10F, -16F, 2, 1, 8, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Core221
		bodyModel[124].setRotationPoint(0F, 2F, 0F);

		bodyModel[125].addShapeBox(43F, -10F, -17F, 1, 1, 1, 0F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Core223
		bodyModel[125].setRotationPoint(0F, 2F, 0F);

		bodyModel[126].addShapeBox(32.5F, -16F, 5.5F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Import Core224
		bodyModel[126].setRotationPoint(-1F, 2F, 0F);

		bodyModel[127].addShapeBox(39F, -10F, 19F, 4, 1, 1, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, -2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, -2F, 0F, -.2F, 0F); // Import Core226
		bodyModel[127].setRotationPoint(0F, 2F, 0F);

		bodyModel[128].addShapeBox(31.5F, -16F, 3.5F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core228
		bodyModel[128].setRotationPoint(0F, 2F, 0F);

		bodyModel[129].addShapeBox(32.5F, -16F, 2.5F, 3, 2, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core229
		bodyModel[129].setRotationPoint(-1F, 2F, 0F);

		bodyModel[130].addShapeBox(34F, -16.5F, 8.5F, 4, 1, 1, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core23
		bodyModel[130].setRotationPoint(0F, 2F, 0F);

		bodyModel[131].addShapeBox(8F, -17F, 7F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core230
		bodyModel[131].setRotationPoint(0F, 2F, 0F);
		bodyModel[131].rotateAngleZ = -0.43633231F;

		bodyModel[132].addShapeBox(43F, -10F, 17F, 4, 1, 1, 0F, 0F, -.2F, 0F, 0F, -.2F, 4F, 0F, -.2F, -4F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 4F, 0F, -.2F, -4F, 0F, -.2F, 0F); // Import Core231
		bodyModel[132].setRotationPoint(0F, 2F, 0F);

		bodyModel[133].addShapeBox(32F, -11F, -16F, 9, 2, 32, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Core232
		bodyModel[133].setRotationPoint(0F, 2F, 0F);

		bodyModel[134].addShapeBox(29F, -3F, 14F, 2, 2, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core233
		bodyModel[134].setRotationPoint(0F, 2F, 0F);

		bodyModel[135].addShapeBox(-46F, -14.3F, -9.5F, 1, 4, 19, 0F, 0F, -1F, -3.7F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -1F, -3.7F, .5F, .5F, -2.5F, 0F, 0F, .5F, 0F, 0F, .5F, .5F, .5F, -2.5F); // Import Core234
		bodyModel[135].setRotationPoint(0F, 2F, 0F);

		bodyModel[136].addShapeBox(12F, -10.3F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Core235
		bodyModel[136].setRotationPoint(0F, 2F, 0F);

		bodyModel[137].addShapeBox(0F, -14F, 2F, 2, 11, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core236
		bodyModel[137].setRotationPoint(0F, 2F, 0F);
		bodyModel[137].rotateAngleZ = 0.20943951F;

		bodyModel[138].addShapeBox(20.5F, -21.7F, 16.3F, 1, 1, 2, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Import Core237
		bodyModel[138].setRotationPoint(0F, 3F, 0F);

		bodyModel[139].addShapeBox(47F, -10F, 13F, 3, 1, 1, 0F, 0F, -.2F, 0F, 0F, -.2F, 5F, 0F, -.2F, -5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 5F, 0F, -.2F, -5F, 0F, -.2F, 0F); // Import Core238
		bodyModel[139].setRotationPoint(0F, 2F, 0F);

		bodyModel[140].addShapeBox(32F, -17F, 4F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core239
		bodyModel[140].setRotationPoint(0F, 2F, 0F);

		bodyModel[141].addShapeBox(34F, -16.5F, 11.5F, 4, 1, 1, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F); // Import Core24
		bodyModel[141].setRotationPoint(0F, 2F, 0F);

		bodyModel[142].addShapeBox(8.5F, -16.5F, 9F, 1, 1, 4, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core240
		bodyModel[142].setRotationPoint(0F, 2F, 0F);
		bodyModel[142].rotateAngleZ = -0.43633231F;

		bodyModel[143].addShapeBox(50F, -10F, 8F, 2, 1, 1, 0F, 0F, -.2F, 0F, 0F, -.2F, 6F, 0F, -.2F, -6F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 6F, 0F, -.2F, -6F, 0F, -.2F, 0F); // Import Core241
		bodyModel[143].setRotationPoint(0F, 2F, 0F);

		bodyModel[144].addShapeBox(8.5F, -16.5F, 13F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, .3F, 0F, .3F, .3F, 0F); // Import Core242
		bodyModel[144].setRotationPoint(0F, 2F, 0F);
		bodyModel[144].rotateAngleZ = -0.43633231F;

		bodyModel[145].addShapeBox(33F, -17F, 5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Import Core243
		bodyModel[145].setRotationPoint(-1F, 2F, 0F);

		bodyModel[146].addShapeBox(51.3F, -10F, -3F, 1, 1, 6, 0F, -.3F, -.2F, .5F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, .5F, -.3F, -.2F, .5F, -.3F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.2F, .5F); // Import Core244
		bodyModel[146].setRotationPoint(0F, 2F, 0F);

		bodyModel[147].addShapeBox(8.5F, -16.5F, 14F, 1, 1, 2, 0F, .3F, .3F, 0F, .3F, .3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Import Core245
		bodyModel[147].setRotationPoint(0F, 2F, 0F);
		bodyModel[147].rotateAngleZ = -0.43633231F;

		bodyModel[148].addShapeBox(33F, -17F, 3F, 2, 1, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core246
		bodyModel[148].setRotationPoint(-1F, 2F, 0F);

		bodyModel[149].addShapeBox(39F, -10F, -20F, 4, 1, 1, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, 2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, 2F, 0F, -.2F, 0F); // Import Core247
		bodyModel[149].setRotationPoint(0F, 2F, 0F);

		bodyModel[150].addShapeBox(-18F, -2F, -2F, 40, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core248
		bodyModel[150].setRotationPoint(0F, 2F, 0F);

		bodyModel[151].addShapeBox(22F, -9F, 21F, 1, 2, 1, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Import Core249
		bodyModel[151].setRotationPoint(0F, 2F, 0F);
		bodyModel[151].rotateAngleY = -0.13962634F;
		bodyModel[151].rotateAngleZ = 0.17453293F;

		bodyModel[152].addShapeBox(34F, -16.5F, 9.5F, 4, 1, 2, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core25
		bodyModel[152].setRotationPoint(0F, 2F, 0F);

		bodyModel[153].addShapeBox(-18F, -3F, -2F, 40, 1, 4, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core250
		bodyModel[153].setRotationPoint(0F, 2F, 0F);

		bodyModel[154].addShapeBox(17F, -8.5F, 21F, 16, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core251
		bodyModel[154].setRotationPoint(0F, 2F, 0F);
		bodyModel[154].rotateAngleY = -0.13962634F;
		bodyModel[154].rotateAngleZ = 0.17453293F;

		bodyModel[155].addShapeBox(43F, -10F, -18F, 4, 1, 1, 0F, 0F, -.2F, 0F, 0F, -.2F, -4F, 0F, -.2F, 4F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -4F, 0F, -.2F, 4F, 0F, -.2F, 0F); // Import Core252
		bodyModel[155].setRotationPoint(0F, 2F, 0F);

		bodyModel[156].addShapeBox(18F, -5F, -17F, 4, 6, 34, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core253
		bodyModel[156].setRotationPoint(0F, 2F, 0F);

		bodyModel[157].addShapeBox(15F, -8.5F, 21F, 2, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core254
		bodyModel[157].setRotationPoint(0F, 2F, 0F);
		bodyModel[157].rotateAngleY = -0.13962634F;
		bodyModel[157].rotateAngleZ = 0.17453293F;

		bodyModel[158].addShapeBox(47F, -10F, -14F, 3, 1, 1, 0F, 0F, -.2F, 0F, 0F, -.2F, -5F, 0F, -.2F, 5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -5F, 0F, -.2F, 5F, 0F, -.2F, 0F); // Import Core255
		bodyModel[158].setRotationPoint(0F, 2F, 0F);

		bodyModel[159].addShapeBox(50F, -10F, -9F, 2, 1, 1, 0F, 0F, -.2F, 0F, 0F, -.2F, -6F, 0F, -.2F, 6F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -6F, 0F, -.2F, 6F, 0F, -.2F, 0F); // Import Core256
		bodyModel[159].setRotationPoint(0F, 2F, 0F);

		bodyModel[160].addShapeBox(18F, -5F, -17F, 2, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Core257
		bodyModel[160].setRotationPoint(0F, 2F, 0F);

		bodyModel[161].addShapeBox(13F, -10F, 21.5F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core258
		bodyModel[161].setRotationPoint(0F, 2F, 0F);
		bodyModel[161].rotateAngleY = -0.13962634F;
		bodyModel[161].rotateAngleZ = 0.17453293F;

		bodyModel[162].addBox(-17F, -5F, -17F, 35, 6, 2, 0F); // Import Core259
		bodyModel[162].setRotationPoint(0F, 2F, 0F);

		bodyModel[163].addShapeBox(34F, -14.5F, -9.5F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Core26
		bodyModel[163].setRotationPoint(0F, 2F, 0F);

		bodyModel[164].addShapeBox(48.5F, -10F, 4F, 3, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, 0F, -.2F, -.2F); // Import Core260
		bodyModel[164].setRotationPoint(0F, 2F, 0F);

		bodyModel[165].addShapeBox(11F, -10F, 21.5F, 2, 4, 1, 0F, 0F, -1F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Core261
		bodyModel[165].setRotationPoint(0F, 2F, 0F);
		bodyModel[165].rotateAngleY = -0.13962634F;
		bodyModel[165].rotateAngleZ = 0.17453293F;

		bodyModel[166].addShapeBox(-1F, -15F, 18F, 1, 2, 1, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Import Core262
		bodyModel[166].setRotationPoint(0F, 2F, 0F);

		bodyModel[167].addBox(-17F, -5F, 15F, 35, 6, 2, 0F); // Import Core263
		bodyModel[167].setRotationPoint(0F, 2F, 0F);

		bodyModel[168].addShapeBox(48.5F, -10F, -5F, 3, 1, 1, 0F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Import Core264
		bodyModel[168].setRotationPoint(0F, 2F, 0F);

		bodyModel[169].addShapeBox(51.7F, -10.8F, -3F, 1, 2, 6, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Import Core265
		bodyModel[169].setRotationPoint(0F, 2F, 0F);

		bodyModel[170].addShapeBox(-11F, -14.5F, 18F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core266
		bodyModel[170].setRotationPoint(0F, 2F, 0F);

		bodyModel[171].addShapeBox(-17F, -16F, 17F, 1, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core267
		bodyModel[171].setRotationPoint(0F, 2F, 0F);

		bodyModel[172].addShapeBox(41F, -11F, -13F, 5, 2, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Core268
		bodyModel[172].setRotationPoint(0F, 2F, 0F);

		bodyModel[173].addShapeBox(-45F, -15.3F, -12F, 3, 4, 24, 0F, 0F, -1F, -3.8F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -3.8F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Import Core269
		bodyModel[173].setRotationPoint(0F, 2F, 0F);

		bodyModel[174].addShapeBox(34F, -14.5F, -11.5F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core27
		bodyModel[174].setRotationPoint(0F, 2F, 0F);

		bodyModel[175].addShapeBox(20.2F, -20.7F, 17F, 1, 1, 3, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Import Core270
		bodyModel[175].setRotationPoint(0F, 2F, 0F);

		bodyModel[176].addShapeBox(5F, -4F, -2.5F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core271
		bodyModel[176].setRotationPoint(0F, 2F, 1F);

		bodyModel[177].addShapeBox(29F, -3F, 16F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core272
		bodyModel[177].setRotationPoint(0F, 2F, 0F);

		bodyModel[178].addShapeBox(18F, -5F, 13F, 2, 6, 4, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core273
		bodyModel[178].setRotationPoint(0F, 2F, 0F);

		bodyModel[179].addShapeBox(-23F, -14.5F, 18F, 12, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Core274
		bodyModel[179].setRotationPoint(0F, 2F, 0F);

		bodyModel[180].addShapeBox(38F, -14F, 15F, 1, 2, 4, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F); // Import Core275
		bodyModel[180].setRotationPoint(0F, 2F, 0F);

		bodyModel[181].addShapeBox(-31F, -15.5F, 18F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core276
		bodyModel[181].setRotationPoint(0F, 2F, 0F);

		bodyModel[182].addShapeBox(38F, -12F, 15F, 1, 1, 4, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, 0F, 0F, -1F); // Import Core277
		bodyModel[182].setRotationPoint(0F, 2F, 0F);

		bodyModel[183].addShapeBox(16F, -3F, 7F, 1, 4, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core278
		bodyModel[183].setRotationPoint(0F, 2F, 0F);

		bodyModel[184].addShapeBox(38F, -15F, 15F, 1, 1, 4, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F); // Import Core279
		bodyModel[184].setRotationPoint(0F, 2F, 0F);

		bodyModel[185].addShapeBox(-3F, -15.5F, 17F, 1, 1, 1, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core28
		bodyModel[185].setRotationPoint(0F, 2F, 0F);

		bodyModel[186].addShapeBox(-33F, -15.5F, 18F, 2, 3, 1, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Import Core280
		bodyModel[186].setRotationPoint(0F, 2F, 0F);

		bodyModel[187].addShapeBox(15F, -3F, 6.5F, 2, 1, 2, 0F, .5F, 0F, 0F, -.5F, 2F, 0F, -.5F, 2F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Core281
		bodyModel[187].setRotationPoint(0F, 2F, 0F);

		bodyModel[188].addShapeBox(37F, -12F, 15F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Core282
		bodyModel[188].setRotationPoint(0F, 2F, 0F);

		bodyModel[189].addShapeBox(15F, -3F, 9F, 2, 1, 2, 0F, .5F, 0F, 0F, -.5F, 2F, 0F, -.5F, 2F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Core283
		bodyModel[189].setRotationPoint(0F, 2F, 0F);

		bodyModel[190].addShapeBox(1F, -14.5F, 18F, 1, 1, 1, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Import Core284
		bodyModel[190].setRotationPoint(0F, 2F, 0F);

		bodyModel[191].addShapeBox(-31F, -15.5F, -19F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core285
		bodyModel[191].setRotationPoint(0F, 2F, 0F);

		bodyModel[192].addShapeBox(37F, -14F, 15F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core286
		bodyModel[192].setRotationPoint(0F, 2F, 0F);

		bodyModel[193].addShapeBox(16F, -3F, 9.5F, 1, 4, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core287
		bodyModel[193].setRotationPoint(0F, 2F, 0F);

		bodyModel[194].addShapeBox(15F, -2F, 4F, 2, 1, 2, 0F, 1F, 0F, -.2F, -1F, 4F, -.2F, -1F, 4F, -.2F, 1F, 0F, -.2F, 0F, 0F, -.2F, 0F, -4F, -.2F, 0F, -4F, -.2F, 0F, 0F, -.2F); // Import Core288
		bodyModel[194].setRotationPoint(0F, 2F, 0F);

		bodyModel[195].addShapeBox(-33F, -15.5F, -19F, 2, 3, 1, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Import Core289
		bodyModel[195].setRotationPoint(0F, 2F, 0F);

		bodyModel[196].addShapeBox(46F, -12F, -10F, 3, 1, 20, 0F, 0F, 0F, 0F, 0F, -.5F, -4F, 0F, -.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Core29
		bodyModel[196].setRotationPoint(0F, 2F, 0F);

		bodyModel[197].addShapeBox(37F, -15F, 15F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core290
		bodyModel[197].setRotationPoint(0F, 2F, 0F);

		bodyModel[198].addShapeBox(35F, -15F, 15F, 2, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Core291
		bodyModel[198].setRotationPoint(0F, 2F, 0F);

		bodyModel[199].addShapeBox(16F, -3F, 4.5F, 1, 4, 1, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core292
		bodyModel[199].setRotationPoint(0F, 2F, 0F);

		bodyModel[200].addShapeBox(-23F, -14.5F, -19F, 12, 1, 1, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Core293
		bodyModel[200].setRotationPoint(0F, 2F, 0F);

		bodyModel[201].addShapeBox(0F, -16F, 2F, 2, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core294
		bodyModel[201].setRotationPoint(0F, 2F, 0F);
		bodyModel[201].rotateAngleZ = 0.20943951F;

		bodyModel[202].addShapeBox(35F, -14F, 15F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Core295
		bodyModel[202].setRotationPoint(0F, 2F, 0F);

		bodyModel[203].addShapeBox(-11F, -14.5F, -19F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core296
		bodyModel[203].setRotationPoint(0F, 2F, 0F);

		bodyModel[204].addShapeBox(35F, -12F, 15F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Import Core297
		bodyModel[204].setRotationPoint(0F, 2F, 0F);

		bodyModel[205].addShapeBox(0F, -16F, -14F, 2, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core298
		bodyModel[205].setRotationPoint(0F, 2F, 0F);
		bodyModel[205].rotateAngleZ = 0.20943951F;

		bodyModel[206].addShapeBox(1F, -14.5F, -19F, 1, 1, 1, 0F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F, .1F); // Import Core299
		bodyModel[206].setRotationPoint(0F, 2F, 0F);

		bodyModel[207].addShapeBox(-17F, 1F, -18F, 39, 1, 36, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core3
		bodyModel[207].setRotationPoint(0F, 2F, 0F);

		bodyModel[208].addShapeBox(-45F, -11F, -12F, 3, 4, 24, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Import Core30
		bodyModel[208].setRotationPoint(0F, 2F, 0F);

		bodyModel[209].addShapeBox(-14F, -17F, 2F, 2, 11, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core300
		bodyModel[209].setRotationPoint(0F, 2F, 0F);
		bodyModel[209].rotateAngleZ = 0.20943951F;

		bodyModel[210].addShapeBox(36F, -12F, 16.5F, 1, 1, 1, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Import Core301
		bodyModel[210].setRotationPoint(0F, 2F, 0F);

		bodyModel[211].addShapeBox(-1F, -15F, -19F, 1, 2, 1, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Import Core302
		bodyModel[211].setRotationPoint(0F, 2F, 0F);

		bodyModel[212].addShapeBox(20.2F, -21.7F, 17F, 1, 1, 3, 0F, -.4F, 0F, -1F, -.4F, 0F, -1F, -.4F, 0F, -1F, -.4F, 0F, -1F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Import Core303
		bodyModel[212].setRotationPoint(0F, 2F, 0F);

		bodyModel[213].addShapeBox(7F, -7F, -2F, 1, 3, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Import Core304
		bodyModel[213].setRotationPoint(0F, 2F, 1F);

		bodyModel[214].addShapeBox(-42F, -16.3F, -14.5F, 8, 5, 29, 0F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -2.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -2.5F); // Import Core305
		bodyModel[214].setRotationPoint(0F, 2F, 0F);

		bodyModel[215].addShapeBox(-34F, -11F, -18.5F, 14, 4, 35, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Core306
		bodyModel[215].setRotationPoint(0F, 2F, 1F);

		bodyModel[216].addShapeBox(46F, -11F, -10F, 3, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Core307
		bodyModel[216].setRotationPoint(0F, 2F, 0F);

		bodyModel[217].addShapeBox(29F, -2.5F, 11F, 2, 1, 5, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core308
		bodyModel[217].setRotationPoint(0F, 2F, 0F);

		bodyModel[218].addShapeBox(35F, -10.2F, 16.5F, 1, 1, 1, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Import Core309
		bodyModel[218].setRotationPoint(0F, 2F, 0F);

		bodyModel[219].addShapeBox(29F, 1.5F, 11F, 2, 1, 5, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core31
		bodyModel[219].setRotationPoint(0F, 2F, 0F);

		bodyModel[220].addShapeBox(-14F, -19F, 2F, 2, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core310
		bodyModel[220].setRotationPoint(0F, 2F, 0F);
		bodyModel[220].rotateAngleZ = 0.20943951F;

		bodyModel[221].addShapeBox(35F, -12F, 16.5F, 1, 2, 1, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core311
		bodyModel[221].setRotationPoint(0F, 2F, 0F);

		bodyModel[222].addShapeBox(-14F, -19F, -14F, 2, 2, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core312
		bodyModel[222].setRotationPoint(0F, 2F, 0F);
		bodyModel[222].rotateAngleZ = 0.20943951F;

		bodyModel[223].addShapeBox(37F, -15F, -19F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core313
		bodyModel[223].setRotationPoint(0F, 2F, 0F);

		bodyModel[224].addShapeBox(-14F, -17F, -14F, 2, 11, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core314
		bodyModel[224].setRotationPoint(0F, 2F, 0F);
		bodyModel[224].rotateAngleZ = 0.20943951F;

		bodyModel[225].addShapeBox(-14F, -5F, -14F, 10, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core315
		bodyModel[225].setRotationPoint(0F, 2F, 0F);

		bodyModel[226].addShapeBox(35F, -15F, -19F, 2, 1, 4, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Core316
		bodyModel[226].setRotationPoint(0F, 2F, 0F);

		bodyModel[227].addShapeBox(35F, -14F, -19F, 2, 2, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Core317
		bodyModel[227].setRotationPoint(0F, 2F, 0F);

		bodyModel[228].addShapeBox(-14F, -5F, 2F, 10, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core318
		bodyModel[228].setRotationPoint(0F, 2F, 0F);

		bodyModel[229].addShapeBox(-14F, -3F, -13F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core319
		bodyModel[229].setRotationPoint(0F, 2F, 0F);

		bodyModel[230].addShapeBox(34F, -14.5F, -12.5F, 4, 4, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core32
		bodyModel[230].setRotationPoint(0F, 2F, 0F);

		bodyModel[231].addShapeBox(38F, -15F, -19F, 1, 1, 4, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F); // Import Core320
		bodyModel[231].setRotationPoint(0F, 2F, 0F);

		bodyModel[232].addShapeBox(38F, -14F, -19F, 1, 2, 4, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F); // Import Core321
		bodyModel[232].setRotationPoint(0F, 2F, 0F);

		bodyModel[233].addShapeBox(-14F, -3F, 3F, 9, 4, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core322
		bodyModel[233].setRotationPoint(0F, 2F, 0F);

		bodyModel[234].addShapeBox(37F, -14F, -19F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core323
		bodyModel[234].setRotationPoint(0F, 2F, 0F);

		bodyModel[235].addShapeBox(35F, -12F, -19F, 2, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Import Core324
		bodyModel[235].setRotationPoint(0F, 2F, 0F);

		bodyModel[236].addShapeBox(37F, -12F, -19F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Core325
		bodyModel[236].setRotationPoint(0F, 2F, 0F);

		bodyModel[237].addShapeBox(31F, -1F, 15F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core326
		bodyModel[237].setRotationPoint(0F, 2F, 0F);

		bodyModel[238].addShapeBox(49F, -11F, -6F, 1, 2, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Core327
		bodyModel[238].setRotationPoint(0F, 2F, 0F);

		bodyModel[239].addShapeBox(20.2F, -19.7F, 17F, 1, 1, 3, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -1F, -.4F, 0F, -1F, -.4F, 0F, -1F, -.4F, 0F, -1F); // Import Core328
		bodyModel[239].setRotationPoint(0F, 2F, 0F);

		bodyModel[240].addShapeBox(-42F, -11F, -14.5F, 8, 4, 29, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Import Core329
		bodyModel[240].setRotationPoint(0F, 2F, 0F);

		bodyModel[241].addShapeBox(34.5F, -15.5F, -11.5F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core33
		bodyModel[241].setRotationPoint(0F, 2F, 0F);

		bodyModel[242].addShapeBox(7F, -8F, -2F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core330
		bodyModel[242].setRotationPoint(0F, 2F, 1F);

		bodyModel[243].addShapeBox(38F, -12F, -19F, 1, 1, 4, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -1F, 0F, 0F, -1F); // Import Core331
		bodyModel[243].setRotationPoint(0F, 2F, 0F);

		bodyModel[244].addShapeBox(36F, -12F, -17.5F, 1, 1, 1, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Import Core332
		bodyModel[244].setRotationPoint(0F, 2F, 0F);

		bodyModel[245].addShapeBox(35F, -12F, -17.5F, 1, 2, 1, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core333
		bodyModel[245].setRotationPoint(0F, 2F, 0F);

		bodyModel[246].addShapeBox(35F, -10.2F, -17.5F, 1, 1, 1, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Import Core334
		bodyModel[246].setRotationPoint(0F, 2F, 0F);

		bodyModel[247].addShapeBox(34F, -14.5F, 9.5F, 4, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core335
		bodyModel[247].setRotationPoint(0F, 2F, 0F);

		bodyModel[248].addShapeBox(34F, -14.5F, 11.5F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Core336
		bodyModel[248].setRotationPoint(0F, 2F, 0F);

		bodyModel[249].addShapeBox(34F, -14.5F, 8.5F, 4, 4, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core337
		bodyModel[249].setRotationPoint(0F, 2F, 0F);

		bodyModel[250].addShapeBox(34F, -16F, 11.5F, 4, 1, 1, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -1F, -.5F, -.2F, -1F, -.5F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F); // Import Core338
		bodyModel[250].setRotationPoint(0F, 2F, 0F);

		bodyModel[251].addShapeBox(35.5F, -15.5F, -9.5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Import Core34
		bodyModel[251].setRotationPoint(-1F, 2F, 0F);

		bodyModel[252].addShapeBox(35.5F, -15.5F, -12.5F, 3, 1, 1, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core35
		bodyModel[252].setRotationPoint(-1F, 2F, 0F);

		bodyModel[253].addShapeBox(34F, -16F, -12.5F, 4, 1, 1, 0F, -1F, -.5F, -.2F, -1F, -.5F, -.2F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core36
		bodyModel[253].setRotationPoint(0F, 2F, 0F);

		bodyModel[254].addShapeBox(34F, -16F, -11.5F, 4, 1, 2, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core37
		bodyModel[254].setRotationPoint(0F, 2F, 0F);

		bodyModel[255].addShapeBox(34F, -16F, -9.5F, 4, 1, 1, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -1F, -.5F, -.2F, -1F, -.5F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F); // Import Core38
		bodyModel[255].setRotationPoint(0F, 2F, 0F);

		bodyModel[256].addShapeBox(34F, -16.5F, -9.5F, 4, 1, 1, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F); // Import Core39
		bodyModel[256].setRotationPoint(0F, 2F, 0F);

		bodyModel[257].addShapeBox(41F, -1F, -7F, 2, 3, 14, 0F, 0F, 0F, -2.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -2.5F, 3F, 0F, -4F, -3F, -.5F, -5.5F, -3F, -.5F, -5.5F, 3F, 0F, -4F); // Import Core4
		bodyModel[257].setRotationPoint(0F, 2F, 0F);

		bodyModel[258].addShapeBox(34F, -16.5F, -11.5F, 4, 1, 2, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core40
		bodyModel[258].setRotationPoint(0F, 2F, 0F);

		bodyModel[259].addShapeBox(34F, -16.5F, -12.5F, 4, 1, 1, 0F, -1F, -.5F, -.5F, -1F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, 0F, -.2F, -1F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import Core41
		bodyModel[259].setRotationPoint(0F, 2F, 0F);

		bodyModel[260].addShapeBox(-3F, -17.5F, -17F, 1, 1, 34, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core42
		bodyModel[260].setRotationPoint(0F, 2F, 0F);

		bodyModel[261].addShapeBox(41F, -13F, -13F, 5, 2, 26, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Core43
		bodyModel[261].setRotationPoint(0F, 2F, 0F);

		bodyModel[262].addShapeBox(-46F, -11F, -9.5F, 1, 4, 19, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Import Core44
		bodyModel[262].setRotationPoint(0F, 2F, 0F);

		bodyModel[263].addShapeBox(29F, 1F, 11F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core45
		bodyModel[263].setRotationPoint(0F, 2F, 0F);

		bodyModel[264].addShapeBox(32F, -15.2F, 7.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core46
		bodyModel[264].setRotationPoint(0F, 2F, 0F);

		bodyModel[265].addShapeBox(32F, -16.2F, 8F, 1, 1, 1, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F); // Import Core47
		bodyModel[265].setRotationPoint(0F, 2F, 0F);

		bodyModel[266].addShapeBox(32F, -17.4F, 8F, 1, 1, 1, 0F, -.6F, .5F, 0F, -.2F, .5F, 0F, -.2F, .5F, 0F, -.6F, .5F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F); // Import Core48
		bodyModel[266].setRotationPoint(0F, 2F, 0F);

		bodyModel[267].addShapeBox(32F, -17.2F, 8F, 1, 1, 1, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core49
		bodyModel[267].setRotationPoint(0F, 2F, 0F);

		bodyModel[268].addShapeBox(29F, -5F, -13F, 8, 2, 26, 0F, 0F, 0F, 0F, -2F, 0F, -1.8F, -2F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -1F); // Import Core5
		bodyModel[268].setRotationPoint(0F, 2F, 0F);

		bodyModel[269].addShapeBox(32F, -17.4F, -8F, 1, 1, 1, 0F, -.6F, .5F, 0F, -.2F, .5F, 0F, -.2F, .5F, 0F, -.6F, .5F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F); // Import Core50
		bodyModel[269].setRotationPoint(0F, 2F, 0F);

		bodyModel[270].addShapeBox(32F, -17.2F, -8F, 1, 1, 1, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core51
		bodyModel[270].setRotationPoint(0F, 2F, 0F);

		bodyModel[271].addShapeBox(32F, -16.2F, -8F, 1, 1, 1, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F); // Import Core52
		bodyModel[271].setRotationPoint(0F, 2F, 0F);

		bodyModel[272].addShapeBox(32F, -15.2F, -8.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core53
		bodyModel[272].setRotationPoint(0F, 2F, 0F);

		bodyModel[273].addShapeBox(23F, -17.5F, -17.5F, 2, 2, 1, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core54
		bodyModel[273].setRotationPoint(0F, 2F, 0F);

		bodyModel[274].addShapeBox(23F, -17.5F, -16.5F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Import Core55
		bodyModel[274].setRotationPoint(0F, 2F, 0F);

		bodyModel[275].addShapeBox(33F, 1F, 14F, 2, 2, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core56
		bodyModel[275].setRotationPoint(0F, 2F, 0F);

		bodyModel[276].addShapeBox(32F, -15F, -16F, 9, 4, 32, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Core57
		bodyModel[276].setRotationPoint(0F, 2F, 0F);

		bodyModel[277].addShapeBox(-20F, -1F, -18F, 3, 3, 36, 0F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F); // Import Core58
		bodyModel[277].setRotationPoint(0F, 2F, 0F);

		bodyModel[278].addShapeBox(23.5F, -18.5F, -17F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core59
		bodyModel[278].setRotationPoint(0F, 2F, 0F);

		bodyModel[279].addShapeBox(11F, -4F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core6
		bodyModel[279].setRotationPoint(0F, 2F, 0F);

		bodyModel[280].addShapeBox(29F, -3F, -11F, 6, 6, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core60
		bodyModel[280].setRotationPoint(0F, 2F, 0F);

		bodyModel[281].addShapeBox(33F, 1.5F, 11F, 2, 1, 5, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core61
		bodyModel[281].setRotationPoint(0F, 2F, 0F);

		bodyModel[282].addShapeBox(22F, -16F, -18F, 10, 5, 36, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Core62
		bodyModel[282].setRotationPoint(0F, 2F, 0F);

		bodyModel[283].addShapeBox(-34F, -1F, -15.5F, 14, 3, 29, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Core63
		bodyModel[283].setRotationPoint(0F, 2F, 1F);

		bodyModel[284].addShapeBox(-3F, -25.5F, 17.5F, 1, 8, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core64
		bodyModel[284].setRotationPoint(0F, 2F, 0F);

		bodyModel[285].addShapeBox(22F, -9F, -18F, 10, 4, 36, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F); // Import Core65
		bodyModel[285].setRotationPoint(0F, 2F, 0F);

		bodyModel[286].addShapeBox(33F, 1F, 11F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core66
		bodyModel[286].setRotationPoint(0F, 2F, 0F);

		bodyModel[287].addShapeBox(-42F, -1F, -11.5F, 8, 2, 23, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2.5F); // Import Core67
		bodyModel[287].setRotationPoint(0F, 2F, 0F);

		bodyModel[288].addShapeBox(33F, -3F, 11F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core68
		bodyModel[288].setRotationPoint(0F, 2F, 0F);

		bodyModel[289].addShapeBox(-3F, -17.5F, 17.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, -.5F); // Import Core69
		bodyModel[289].setRotationPoint(0F, 2F, 0F);

		bodyModel[290].addShapeBox(-45F, -15F, -12F, 3, 4, 24, 0F, 0F, -1F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -4F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Import Core7
		bodyModel[290].setRotationPoint(0F, 2F, 0F);

		bodyModel[291].addShapeBox(32F, -9F, -16F, 9, 4, 32, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 0F, -3F, -2F, 0F, -6F, -2F, 0F, -6F, 3F, 0F, -3F); // Import Core70
		bodyModel[291].setRotationPoint(0F, 2F, 0F);

		bodyModel[292].addShapeBox(-45F, -1F, -9F, 3, 1, 18, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2.5F); // Import Core71
		bodyModel[292].setRotationPoint(0F, 2F, 0F);

		bodyModel[293].addShapeBox(-3F, -17.5F, -18.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, -.5F); // Import Core72
		bodyModel[293].setRotationPoint(0F, 2F, 0F);

		bodyModel[294].addShapeBox(41F, -9F, -13F, 5, 4, 26, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, -3F, -2F, 0F, -6F, -2F, 0F, -6F, 2F, 0F, -3F); // Import Core73
		bodyModel[294].setRotationPoint(0F, 2F, 0F);

		bodyModel[295].addShapeBox(-46F, -1F, -6.5F, 1, 1, 13, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import Core74
		bodyModel[295].setRotationPoint(0F, 2F, 0F);

		bodyModel[296].addShapeBox(33F, -2.5F, 11F, 2, 1, 5, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Import Core75
		bodyModel[296].setRotationPoint(0F, 2F, 0F);

		bodyModel[297].addShapeBox(-46F, -7F, -8.5F, 1, 6, 17, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F); // Import Core76
		bodyModel[297].setRotationPoint(0F, 2F, 0F);

		bodyModel[298].addShapeBox(-3F, -25.5F, -18.5F, 1, 8, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core77
		bodyModel[298].setRotationPoint(0F, 2F, 0F);

		bodyModel[299].addShapeBox(33F, -3F, 14F, 2, 2, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core78
		bodyModel[299].setRotationPoint(0F, 2F, 0F);

		bodyModel[300].addShapeBox(46F, -9F, -10F, 3, 4, 20, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, 0F, -3F, -3F, 0F, -6F, -3F, 0F, -6F, 2F, 0F, -3F); // Import Core79
		bodyModel[300].setRotationPoint(0F, 2F, 0F);

		bodyModel[301].addShapeBox(13F, -4F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, 0F, 0F, 0F); // Import Core8
		bodyModel[301].setRotationPoint(0F, 2F, 0F);

		bodyModel[302].addShapeBox(-1.5F, -25F, 15.5F, 21, 1, 1, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Import Core80
		bodyModel[302].setRotationPoint(0F, 2F, 0F);

		bodyModel[303].addShapeBox(33F, -3F, -16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core81
		bodyModel[303].setRotationPoint(0F, 2F, 0F);

		bodyModel[304].addShapeBox(49F, -9F, -6F, 1, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 3F, 0F, -2F, -2.5F, 0F, -4.5F, -2.5F, 0F, -4.5F, 3F, 0F, -2F); // Import Core82
		bodyModel[304].setRotationPoint(0F, 2F, 0F);

		bodyModel[305].addShapeBox(-45F, -7F, -11F, 3, 6, 22, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F); // Import Core83
		bodyModel[305].setRotationPoint(0F, 2F, 0F);

		bodyModel[306].addShapeBox(-17F, -16F, -18F, 1, 17, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core84
		bodyModel[306].setRotationPoint(0F, 2F, 0F);

		bodyModel[307].addShapeBox(-3F, -15.5F, -18F, 1, 1, 1, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core85
		bodyModel[307].setRotationPoint(0F, 2F, 0F);

		bodyModel[308].addShapeBox(9F, -4F, -1F, 2, 1, 2, 0F, -.5F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.8F); // Import Core86
		bodyModel[308].setRotationPoint(0F, 2F, 0F);

		bodyModel[309].addShapeBox(-47.5F, -6.5F, 3.5F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core87
		bodyModel[309].setRotationPoint(0F, 2F, 0F);

		bodyModel[310].addShapeBox(25.5F, -15.5F, 15F, 1, 10, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core88
		bodyModel[310].setRotationPoint(0F, 2F, 0F);
		bodyModel[310].rotateAngleZ = 0.43633231F;

		bodyModel[311].addShapeBox(29F, -3F, 11F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core89
		bodyModel[311].setRotationPoint(0F, 2F, 0F);

		bodyModel[312].addShapeBox(46F, -5F, -4F, 1, 4, 8, 0F, 0F, 0F, 0F, .5F, 0F, -2.5F, .5F, 0F, -2.5F, 0F, 0F, 0F, 3F, 0F, -1.5F, -2.5F, 0F, -3F, -2.5F, 0F, -3F, 3F, 0F, -1.5F); // Import Core9
		bodyModel[312].setRotationPoint(0F, 2F, 0F);

		bodyModel[313].addShapeBox(43F, -1F, -2F, 1, 3, 4, 0F, 0F, 0F, .5F, .5F, 0F, -1F, .5F, 0F, -1F, 0F, 0F, .5F, 3F, -.5F, -.5F, -2.5F, -1F, -1.5F, -2.5F, -1F, -1.5F, 3F, -.5F, -.5F); // Import Core90
		bodyModel[313].setRotationPoint(0F, 2F, 0F);

		bodyModel[314].addShapeBox(22F, -5F, -18F, 10, 4, 36, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, -7F, 0F, 0F, 0F); // Import Core92
		bodyModel[314].setRotationPoint(0F, 2F, 0F);

		bodyModel[315].addShapeBox(-14.5F, -25F, 17F, 13, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -1F); // Import Core80
		bodyModel[315].setRotationPoint(0F, 2F, 0F);

		bodyModel[316].addShapeBox(29F, -3F, -16F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import Core94
		bodyModel[316].setRotationPoint(0F, 2F, 0F);

		bodyModel[317].addShapeBox(0.5F, 2F, -1F, 1, 1, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core95
		bodyModel[317].setRotationPoint(-47F, -3F, 0F);

		bodyModel[318].addShapeBox(-42F, -7F, -13.5F, 8, 6, 27, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F); // Import Core96
		bodyModel[318].setRotationPoint(0F, 2F, 0F);

		bodyModel[319].addShapeBox(-22.5F, -25F, -15.5F, 9, 9, 1, 0F, 2F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 2F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 1.5F, -2.5F, 0F, -1F, 0F, 0F, 0F); // Import Core80
		bodyModel[319].setRotationPoint(-1F, 2F, 0F);

		bodyModel[320].addShapeBox(35F, -5F, -13F, 6, 4, 26, 0F, 0F, 0F, -1.8F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -1.8F, 0F, 0F, -3F, -4F, 0F, -5.5F, -4F, 0F, -5.5F, 0F, 0F, -3F); // Import Core98
		bodyModel[320].setRotationPoint(0F, 2F, 0F);

		bodyModel[321].addShapeBox(0.5F, 3F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core99
		bodyModel[321].setRotationPoint(-47F, -3F, 0F);

		bodyModel[322].addShapeBox(15F, -2F, 2F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel1
		bodyModel[322].setRotationPoint(32F, -12F, 0F);
		bodyModel[322].rotateAngleX = 1.57079633F;
		bodyModel[322].rotateAngleZ = -0.13962634F;

		bodyModel[323].addShapeBox(5F, -7F, 0F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel10
		bodyModel[323].setRotationPoint(32F, -12F, 0F);
		bodyModel[323].rotateAngleX = 1.57079633F;
		bodyModel[323].rotateAngleZ = -0.13962634F;

		bodyModel[324].addShapeBox(11F, -5F, 0F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import CoreWheel11
		bodyModel[324].setRotationPoint(32F, -12F, 0F);
		bodyModel[324].rotateAngleX = 1.57079633F;
		bodyModel[324].rotateAngleZ = -0.13962634F;

		bodyModel[325].addShapeBox(3F, -5F, 1F, 14, 3, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel12
		bodyModel[325].setRotationPoint(32F, -12F, 0F);
		bodyModel[325].rotateAngleX = 1.57079633F;
		bodyModel[325].rotateAngleZ = -0.13962634F;

		bodyModel[326].addShapeBox(15F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel13
		bodyModel[326].setRotationPoint(32F, -12F, 0F);
		bodyModel[326].rotateAngleX = 1.57079633F;
		bodyModel[326].rotateAngleZ = -0.13962634F;

		bodyModel[327].addShapeBox(3F, -2F, 1F, 14, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel14
		bodyModel[327].setRotationPoint(32F, -12F, 0F);
		bodyModel[327].rotateAngleX = 1.57079633F;
		bodyModel[327].rotateAngleZ = -0.13962634F;

		bodyModel[328].addShapeBox(11F, 2F, 0F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import CoreWheel15
		bodyModel[328].setRotationPoint(32F, -12F, 0F);
		bodyModel[328].rotateAngleX = 1.57079633F;
		bodyModel[328].rotateAngleZ = -0.13962634F;

		bodyModel[329].addShapeBox(3F, 2F, 1F, 14, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import CoreWheel16
		bodyModel[329].setRotationPoint(32F, -12F, 0F);
		bodyModel[329].rotateAngleX = 1.57079633F;
		bodyModel[329].rotateAngleZ = -0.13962634F;

		bodyModel[330].addShapeBox(5F, 5F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import CoreWheel17
		bodyModel[330].setRotationPoint(32F, -12F, 0F);
		bodyModel[330].rotateAngleX = 1.57079633F;
		bodyModel[330].rotateAngleZ = -0.13962634F;

		bodyModel[331].addShapeBox(5F, 5F, 1F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import CoreWheel18
		bodyModel[331].setRotationPoint(32F, -12F, 0F);
		bodyModel[331].rotateAngleX = 1.57079633F;
		bodyModel[331].rotateAngleZ = -0.13962634F;

		bodyModel[332].addShapeBox(3F, -5F, 0F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel19
		bodyModel[332].setRotationPoint(32F, -12F, 0F);
		bodyModel[332].rotateAngleX = 1.57079633F;
		bodyModel[332].rotateAngleZ = -0.13962634F;

		bodyModel[333].addShapeBox(11F, -5F, 2F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import CoreWheel2
		bodyModel[333].setRotationPoint(32F, -12F, 0F);
		bodyModel[333].rotateAngleX = 1.57079633F;
		bodyModel[333].rotateAngleZ = -0.13962634F;

		bodyModel[334].addShapeBox(3F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel20
		bodyModel[334].setRotationPoint(32F, -12F, 0F);
		bodyModel[334].rotateAngleX = 1.57079633F;
		bodyModel[334].rotateAngleZ = -0.13962634F;

		bodyModel[335].addShapeBox(3F, 2F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import CoreWheel21
		bodyModel[335].setRotationPoint(32F, -12F, 0F);
		bodyModel[335].rotateAngleX = 1.57079633F;
		bodyModel[335].rotateAngleZ = -0.13962634F;

		bodyModel[336].addShapeBox(6F, 2F, -0.5F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import CoreWheel22
		bodyModel[336].setRotationPoint(32F, -12F, 0F);
		bodyModel[336].rotateAngleX = 1.57079633F;
		bodyModel[336].rotateAngleZ = -0.13962634F;

		bodyModel[337].addShapeBox(6F, -2F, -0.5F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel23
		bodyModel[337].setRotationPoint(32F, -12F, 0F);
		bodyModel[337].rotateAngleX = 1.57079633F;
		bodyModel[337].rotateAngleZ = -0.13962634F;

		bodyModel[338].addShapeBox(9F, -1F, -1F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel24
		bodyModel[338].setRotationPoint(32F, -12F, 0F);
		bodyModel[338].rotateAngleX = 1.57079633F;
		bodyModel[338].rotateAngleZ = -0.13962634F;

		bodyModel[339].addShapeBox(6F, -4F, -0.5F, 8, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel25
		bodyModel[339].setRotationPoint(32F, -12F, 0F);
		bodyModel[339].rotateAngleX = 1.57079633F;
		bodyModel[339].rotateAngleZ = -0.13962634F;

		bodyModel[340].addShapeBox(5F, -7F, 2F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel3
		bodyModel[340].setRotationPoint(32F, -12F, 0F);
		bodyModel[340].rotateAngleX = 1.57079633F;
		bodyModel[340].rotateAngleZ = -0.13962634F;

		bodyModel[341].addShapeBox(3F, -5F, 2F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel4
		bodyModel[341].setRotationPoint(32F, -12F, 0F);
		bodyModel[341].rotateAngleX = 1.57079633F;
		bodyModel[341].rotateAngleZ = -0.13962634F;

		bodyModel[342].addShapeBox(3F, -2F, 2F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel5
		bodyModel[342].setRotationPoint(32F, -12F, 0F);
		bodyModel[342].rotateAngleX = 1.57079633F;
		bodyModel[342].rotateAngleZ = -0.13962634F;

		bodyModel[343].addShapeBox(3F, 2F, 2F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import CoreWheel6
		bodyModel[343].setRotationPoint(32F, -12F, 0F);
		bodyModel[343].rotateAngleX = 1.57079633F;
		bodyModel[343].rotateAngleZ = -0.13962634F;

		bodyModel[344].addShapeBox(5F, 5F, 2F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import CoreWheel7
		bodyModel[344].setRotationPoint(32F, -12F, 0F);
		bodyModel[344].rotateAngleX = 1.57079633F;
		bodyModel[344].rotateAngleZ = -0.13962634F;

		bodyModel[345].addShapeBox(11F, 2F, 2F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import CoreWheel8
		bodyModel[345].setRotationPoint(32F, -12F, 0F);
		bodyModel[345].rotateAngleX = 1.57079633F;
		bodyModel[345].rotateAngleZ = -0.13962634F;

		bodyModel[346].addShapeBox(5F, -7F, 1F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CoreWheel9
		bodyModel[346].setRotationPoint(32F, -12F, 0F);
		bodyModel[346].rotateAngleX = 1.57079633F;
		bodyModel[346].rotateAngleZ = -0.13962634F;

		bodyModel[347].addBox(-0.5F, 1F, -2F, 1, 1, 4, 0F); // Import MGbase1
		bodyModel[347].setRotationPoint(0F, 0F, 0F);

		bodyModel[348].addShapeBox(-0.5F, 1F, -2F, 3, 1, 1, 0F, 0F, 0F, 0F, -.3F, .8F, 0F, -.3F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import MGbase2
		bodyModel[348].setRotationPoint(0F, 0F, 0F);

		bodyModel[349].addShapeBox(-0.5F, 1F, 1F, 3, 1, 1, 0F, 0F, 0F, 0F, -.3F, .8F, 0F, -.3F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import MGbase3
		bodyModel[349].setRotationPoint(0F, 0F, 0F);

		bodyModel[350].addShapeBox(-7.5F, 0.2F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PassengerMG1
		bodyModel[350].setRotationPoint(0F, 0F, 0F);

		bodyModel[351].addShapeBox(2.3F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG10
		bodyModel[351].setRotationPoint(0F, 0F, 0F);

		bodyModel[352].addShapeBox(4F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG11
		bodyModel[352].setRotationPoint(0F, 0F, 0F);

		bodyModel[353].addShapeBox(5.5F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG12
		bodyModel[353].setRotationPoint(0F, 0F, 0F);

		bodyModel[354].addShapeBox(7F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG13
		bodyModel[354].setRotationPoint(0F, 0F, 0F);

		bodyModel[355].addShapeBox(8.5F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG14
		bodyModel[355].setRotationPoint(0F, 0F, 0F);

		bodyModel[356].addShapeBox(13F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG15
		bodyModel[356].setRotationPoint(0F, 0F, 0F);

		bodyModel[357].addShapeBox(11.5F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG16
		bodyModel[357].setRotationPoint(0F, 0F, 0F);

		bodyModel[358].addShapeBox(10F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG17
		bodyModel[358].setRotationPoint(0F, 0F, 0F);

		bodyModel[359].addShapeBox(14F, -1.8F, -1F, 1, 2, 2, 0F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F, -.1F, -.2F, -.2F); // Import PassengerMG18
		bodyModel[359].setRotationPoint(0F, 0F, 0F);

		bodyModel[360].addShapeBox(2.3F, -1.6F, -1F, 12, 1, 2, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F); // Import PassengerMG19
		bodyModel[360].setRotationPoint(0F, 0F, 0F);

		bodyModel[361].addShapeBox(-5.5F, 1F, -0.5F, 1, 1, 1, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F); // Import PassengerMG2
		bodyModel[361].setRotationPoint(0F, 0F, 0F);

		bodyModel[362].addShapeBox(2.3F, -1F, -1F, 12, 1, 2, 0F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, -.8F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Import PassengerMG20
		bodyModel[362].setRotationPoint(0F, 0F, 0F);

		bodyModel[363].addShapeBox(14.9F, -1.8F, -1F, 1, 2, 2, 0F, 0F, -.2F, -.2F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.2F, -.2F); // Import PassengerMG21
		bodyModel[363].setRotationPoint(0F, 0F, 0F);

		bodyModel[364].addShapeBox(15.9F, -1.8F, -1F, 2, 2, 2, 0F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F); // Import PassengerMG22
		bodyModel[364].setRotationPoint(0F, 0F, 0F);

		bodyModel[365].addShapeBox(17.9F, -1.8F, -1F, 1, 2, 2, 0F, 0F, -.7F, -.7F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.7F, -.7F); // Import PassengerMG23
		bodyModel[365].setRotationPoint(0F, 0F, 0F);

		bodyModel[366].addShapeBox(14F, -0.8F, -1F, 1, 1, 2, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F); // Import PassengerMG24
		bodyModel[366].setRotationPoint(0F, 0F, 0F);

		bodyModel[367].addShapeBox(14F, 0.2F, -1F, 1, 1, 2, 0F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.25F, -.5F, -.7F, -.25F, -.5F, -.7F, -.25F, -.5F, -.7F, -.25F, -.5F, -.7F); // Import PassengerMG25
		bodyModel[367].setRotationPoint(0F, 0F, 0F);

		bodyModel[368].addShapeBox(14F, 0.1F, -1F, 1, 1, 2, 0F, -.25F, 0F, -.5F, -.25F, 0F, -.5F, -.25F, 0F, -.5F, -.25F, 0F, -.5F, -.25F, -.5F, -.5F, -.25F, -.5F, -.5F, -.25F, -.5F, -.5F, -.25F, -.5F, -.5F); // Import PassengerMG26
		bodyModel[368].setRotationPoint(0F, 0F, 0F);

		bodyModel[369].addShapeBox(6.5F, 0.1F, -1F, 8, 1, 1, 0F, -.25F, 0F, -.3F, -.25F, 0F, -.3F, -.25F, 0F, -.3F, -.25F, 0F, -.3F, -.25F, -.5F, -.3F, -.25F, -.5F, -.3F, -.25F, -.5F, -.3F, -.25F, -.5F, -.3F); // Import PassengerMG27
		bodyModel[369].setRotationPoint(0F, 0F, 0F);

		bodyModel[370].addShapeBox(6.5F, 0.1F, 0F, 8, 1, 1, 0F, -.25F, 0F, -.3F, -.25F, 0F, -.3F, -.25F, 0F, -.3F, -.25F, 0F, -.3F, -.25F, -.5F, -.3F, -.25F, -.5F, -.3F, -.25F, -.5F, -.3F, -.25F, -.5F, -.3F); // Import PassengerMG28
		bodyModel[370].setRotationPoint(0F, 0F, 0F);

		bodyModel[371].addShapeBox(-11.5F, -1.8F, -1F, 13, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PassengerMG29
		bodyModel[371].setRotationPoint(0F, 0F, 0F);

		bodyModel[372].addShapeBox(-4.5F, 1F, -0.5F, 1, 1, 1, 0F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F); // Import PassengerMG3
		bodyModel[372].setRotationPoint(0F, 0F, 0F);

		bodyModel[373].addShapeBox(1.5F, -1.8F, -1F, 1, 2, 2, 0F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Import PassengerMG30
		bodyModel[373].setRotationPoint(0F, 0F, 0F);

		bodyModel[374].addShapeBox(-11.5F, -2.8F, -1F, 13, 1, 2, 0F, -12F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -12F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PassengerMG31
		bodyModel[374].setRotationPoint(0F, 0F, 0F);

		bodyModel[375].addShapeBox(-15.5F, -1.8F, -1F, 4, 2, 2, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Import PassengerMG32
		bodyModel[375].setRotationPoint(0F, 0F, 0F);

		bodyModel[376].addShapeBox(-16.5F, -2.8F, -0.5F, 2, 2, 1, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.2F, 0F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F); // Import PassengerMG33
		bodyModel[376].setRotationPoint(0F, 0F, 0F);

		bodyModel[377].addShapeBox(-17.5F, -0.8F, -0.5F, 3, 2, 1, 0F, -1F, .8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import PassengerMG34
		bodyModel[377].setRotationPoint(0F, 0F, 0F);

		bodyModel[378].addShapeBox(-5.5F, 2F, -0.5F, 2, 1, 1, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F, -.5F, -.5F, -.2F); // Import PassengerMG4
		bodyModel[378].setRotationPoint(0F, 0F, 0F);

		bodyModel[379].addShapeBox(-7.5F, 1.2F, -0.5F, 2, 1, 1, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F); // Import PassengerMG5
		bodyModel[379].setRotationPoint(0F, 0F, 0F);

		bodyModel[380].addShapeBox(-7.5F, 2.2F, -0.5F, 2, 2, 1, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, .7F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .7F, 0F, 0F); // Import PassengerMG6
		bodyModel[380].setRotationPoint(0F, 0F, 0F);

		bodyModel[381].addShapeBox(-8.5F, 4.2F, -0.5F, 2, 1, 1, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.5F, -.8F, 0F, -.2F, -.8F, 0F, -.2F, -.8F, 0F, -.5F, -.8F, 0F); // Import PassengerMG7
		bodyModel[381].setRotationPoint(0F, 0F, 0F);

		bodyModel[382].addShapeBox(-9.5F, 0.2F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F); // Import PassengerMG8
		bodyModel[382].setRotationPoint(0F, 0F, 0F);

		bodyModel[383].addShapeBox(2.5F, -1.3F, -0.5F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import PassengerMG9
		bodyModel[383].setRotationPoint(0F, 0F, 0F);


		bodyDoorOpenModel = new ModelRendererTurbo[25];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 187, 163, textureX, textureY); // Import DoorOpen21
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 200, 163, textureX, textureY); // Import DoorOpen22
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 211, 163, textureX, textureY); // Import DoorOpen23
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 170, 171, textureX, textureY); // Import DoorOpen24
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 183, 171, textureX, textureY); // Import DoorOpen25
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorOpen1
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 156, 179, textureX, textureY); // Import DoorOpen10
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 156, 186, textureX, textureY); // Import DoorOpen11
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 157, 194, textureX, textureY); // Import DoorOpen12
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorOpen13
		bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 195, 184, textureX, textureY); // Import DoorOpen14
		bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 195, 190, textureX, textureY); // Import DoorOpen15
		bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 206, 188, textureX, textureY); // Import DoorOpen16
		bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 206, 183, textureX, textureY); // Import DoorOpen17
		bodyDoorOpenModel[14] = new ModelRendererTurbo(this, 206, 194, textureX, textureY); // Import DoorOpen18
		bodyDoorOpenModel[15] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorOpen19
		bodyDoorOpenModel[16] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorOpen2
		bodyDoorOpenModel[17] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorOpen20
		bodyDoorOpenModel[18] = new ModelRendererTurbo(this, 196, 172, textureX, textureY); // Import DoorOpen3
		bodyDoorOpenModel[19] = new ModelRendererTurbo(this, 209, 172, textureX, textureY); // Import DoorOpen4
		bodyDoorOpenModel[20] = new ModelRendererTurbo(this, 177, 195, textureX, textureY); // Import DoorOpen5
		bodyDoorOpenModel[21] = new ModelRendererTurbo(this, 177, 184, textureX, textureY); // Import DoorOpen6
		bodyDoorOpenModel[22] = new ModelRendererTurbo(this, 177, 184, textureX, textureY); // Import DoorOpen7
		bodyDoorOpenModel[23] = new ModelRendererTurbo(this, 176, 179, textureX, textureY); // Import DoorOpen8
		bodyDoorOpenModel[24] = new ModelRendererTurbo(this, 176, 179, textureX, textureY); // Import DoorOpen9

		bodyDoorOpenModel[0].addShapeBox(-2.5F, -3F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import DoorOpen21
		bodyDoorOpenModel[0].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[1].addShapeBox(-2.5F, -4F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen22
		bodyDoorOpenModel[1].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[1].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[2].addShapeBox(-2.5F, -5F, -1F, 2, 1, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen23
		bodyDoorOpenModel[2].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[2].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[3].addShapeBox(-2.5F, -6F, -0.5F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen24
		bodyDoorOpenModel[3].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[3].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[4].addShapeBox(-2.5F, -7F, -0.5F, 2, 1, 1, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen25
		bodyDoorOpenModel[4].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[4].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[5].addBox(-1F, -2F, 2F, 2, 3, 1, 0F); // Import DoorOpen1
		bodyDoorOpenModel[5].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[5].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[6].addShapeBox(2F, -4F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F); // Import DoorOpen10
		bodyDoorOpenModel[6].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[6].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[7].addShapeBox(-1F, -4F, -2F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import DoorOpen11
		bodyDoorOpenModel[7].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[7].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[8].addShapeBox(-2F, -4F, -2F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F); // Import DoorOpen12
		bodyDoorOpenModel[8].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[8].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[9].addShapeBox(-1F, -4F, -2F, 2, 1, 4, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen13
		bodyDoorOpenModel[9].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[9].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[10].addShapeBox(-1F, -6.5F, -0.5F, 2, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Import DoorOpen14
		bodyDoorOpenModel[10].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[10].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[11].addShapeBox(0F, -6.5F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import DoorOpen15
		bodyDoorOpenModel[11].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[11].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[12].addShapeBox(0F, -7F, -1F, 1, 1, 1, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -.5F, -.4F, 0F, -.5F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Import DoorOpen16
		bodyDoorOpenModel[12].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[12].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[13].addShapeBox(0F, -7F, 0F, 1, 1, 1, 0F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F); // Import DoorOpen17
		bodyDoorOpenModel[13].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[13].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[14].addShapeBox(0F, -5.7F, -0.8F, 1, 1, 1, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -.2F, -.4F, 0F, -.2F); // Import DoorOpen18
		bodyDoorOpenModel[14].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[14].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[15].addBox(-1F, -2F, -3F, 2, 3, 1, 0F); // Import DoorOpen19
		bodyDoorOpenModel[15].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[15].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[16].addShapeBox(-1F, -3F, 2F, 2, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen2
		bodyDoorOpenModel[16].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[16].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[17].addShapeBox(-1F, -3F, -3F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen20
		bodyDoorOpenModel[17].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[17].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[18].addShapeBox(-2.5F, -8F, -0.5F, 2, 2, 1, 0F, -1F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, -1F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Import DoorOpen3
		bodyDoorOpenModel[18].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[18].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[19].addShapeBox(-1.5F, -9F, -0.5F, 3, 1, 1, 0F, -1F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, -1F, -.5F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F); // Import DoorOpen4
		bodyDoorOpenModel[19].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[19].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[20].addShapeBox(0F, -8F, -2F, 1, 1, 4, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import DoorOpen5
		bodyDoorOpenModel[20].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[20].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[21].addShapeBox(0F, -8F, 1F, 1, 4, 1, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import DoorOpen6
		bodyDoorOpenModel[21].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[21].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[22].addShapeBox(0F, -8F, -2F, 1, 4, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import DoorOpen7
		bodyDoorOpenModel[22].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[22].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[23].addShapeBox(-1F, -5F, -2F, 3, 1, 1, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import DoorOpen8
		bodyDoorOpenModel[23].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[23].rotateAngleZ = 3.14159265F;

		bodyDoorOpenModel[24].addShapeBox(-1F, -5F, 1F, 3, 1, 1, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen9
		bodyDoorOpenModel[24].setRotationPoint(-47F, -3F, 0F);
		bodyDoorOpenModel[24].rotateAngleZ = 3.14159265F;


		bodyDoorCloseModel = new ModelRendererTurbo[25];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorClose1
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 187, 163, textureX, textureY); // Import DoorClose10
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 200, 163, textureX, textureY); // Import DoorClose11
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 211, 163, textureX, textureY); // Import DoorClose12
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 170, 171, textureX, textureY); // Import DoorClose13
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorClose2
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorClose3
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorClose4
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 170, 163, textureX, textureY); // Import DoorClose5
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 156, 179, textureX, textureY); // Import DoorClose6
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 156, 186, textureX, textureY); // Import DoorClose7
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 176, 179, textureX, textureY); // Import DoorClose8
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 176, 179, textureX, textureY); // Import DoorClose9
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 183, 171, textureX, textureY); // Import DoorOpen14
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this, 157, 194, textureX, textureY); // Import DoorOpen15
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this, 177, 195, textureX, textureY); // Import DoorOpen16
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this, 206, 194, textureX, textureY); // Import DoorOpen17
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this, 177, 184, textureX, textureY); // Import DoorOpen18
		bodyDoorCloseModel[18] = new ModelRendererTurbo(this, 177, 184, textureX, textureY); // Import DoorOpen19
		bodyDoorCloseModel[19] = new ModelRendererTurbo(this, 196, 172, textureX, textureY); // Import DoorOpen20
		bodyDoorCloseModel[20] = new ModelRendererTurbo(this, 209, 172, textureX, textureY); // Import DoorOpen21
		bodyDoorCloseModel[21] = new ModelRendererTurbo(this, 195, 184, textureX, textureY); // Import DoorOpen22
		bodyDoorCloseModel[22] = new ModelRendererTurbo(this, 195, 190, textureX, textureY); // Import DoorOpen23
		bodyDoorCloseModel[23] = new ModelRendererTurbo(this, 206, 183, textureX, textureY); // Import DoorOpen24
		bodyDoorCloseModel[24] = new ModelRendererTurbo(this, 206, 188, textureX, textureY); // Import DoorOpen25

		bodyDoorCloseModel[0].addBox(-1F, -2F, 2F, 2, 3, 1, 0F); // Import DoorClose1
		bodyDoorCloseModel[0].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[1].addShapeBox(-2.5F, -3F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import DoorClose10
		bodyDoorCloseModel[1].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[2].addShapeBox(-2.5F, -4F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorClose11
		bodyDoorCloseModel[2].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[3].addShapeBox(-2.5F, -5F, -1F, 2, 1, 2, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorClose12
		bodyDoorCloseModel[3].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[4].addShapeBox(-2.5F, -6F, -0.5F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorClose13
		bodyDoorCloseModel[4].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[5].addShapeBox(-1F, -3F, 2F, 2, 1, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorClose2
		bodyDoorCloseModel[5].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[5].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[6].addShapeBox(-1F, -4F, -2F, 2, 1, 4, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorClose3
		bodyDoorCloseModel[6].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[6].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[7].addShapeBox(-1F, -3F, -3F, 2, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorClose4
		bodyDoorCloseModel[7].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[7].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[8].addBox(-1F, -2F, -3F, 2, 3, 1, 0F); // Import DoorClose5
		bodyDoorCloseModel[8].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[8].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[9].addShapeBox(2F, -4F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F); // Import DoorClose6
		bodyDoorCloseModel[9].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[9].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[10].addShapeBox(-1F, -4F, -2F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import DoorClose7
		bodyDoorCloseModel[10].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[10].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[11].addShapeBox(-1F, -5F, 1F, 3, 1, 1, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorClose8
		bodyDoorCloseModel[11].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[11].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[12].addShapeBox(-1F, -5F, -2F, 3, 1, 1, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Import DoorClose9
		bodyDoorCloseModel[12].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[12].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[13].addShapeBox(-2.5F, -7F, -0.5F, 2, 1, 1, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorOpen14
		bodyDoorCloseModel[13].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[13].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[14].addShapeBox(-2F, -4F, -2F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F); // Import DoorOpen15
		bodyDoorCloseModel[14].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[14].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[15].addShapeBox(0F, -8F, -2F, 1, 1, 4, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import DoorOpen16
		bodyDoorCloseModel[15].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[15].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[16].addShapeBox(0F, -5.7F, -0.8F, 1, 1, 1, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -.2F, -.4F, 0F, -.2F); // Import DoorOpen17
		bodyDoorCloseModel[16].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[16].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[17].addShapeBox(0F, -8F, -2F, 1, 4, 1, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Import DoorOpen18
		bodyDoorCloseModel[17].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[17].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[18].addShapeBox(0F, -8F, 1F, 1, 4, 1, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Import DoorOpen19
		bodyDoorCloseModel[18].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[18].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[19].addShapeBox(-2.5F, -8F, -0.5F, 2, 2, 1, 0F, -1F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F, -.3F, -1F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Import DoorOpen20
		bodyDoorCloseModel[19].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[19].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[20].addShapeBox(-1.5F, -9F, -0.5F, 3, 1, 1, 0F, -1F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, -1F, -.5F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, 0F, 0F, -.3F); // Import DoorOpen21
		bodyDoorCloseModel[20].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[20].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[21].addShapeBox(-1F, -6.5F, -0.5F, 2, 1, 1, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Import DoorOpen22
		bodyDoorCloseModel[21].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[21].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[22].addShapeBox(0F, -6.5F, -0.5F, 1, 1, 1, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Import DoorOpen23
		bodyDoorCloseModel[22].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[22].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[23].addShapeBox(0F, -7F, 0F, 1, 1, 1, 0F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F); // Import DoorOpen24
		bodyDoorCloseModel[23].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[23].rotateAngleZ = 0.55850536F;

		bodyDoorCloseModel[24].addShapeBox(0F, -7F, -1F, 1, 1, 1, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -.5F, -.4F, 0F, -.5F, -.4F, -.2F, 0F, -.4F, -.2F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Import DoorOpen25
		bodyDoorCloseModel[24].setRotationPoint(-47F, -3F, 0F);
		bodyDoorCloseModel[24].rotateAngleZ = 0.55850536F;


		leftFrontWheelModel = new ModelRendererTurbo[25];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront1
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheelLeftFront10
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheelLeftFront11
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheelLeftFront12
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront13
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront14
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront15
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront16
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront17
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront18
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheelLeftFront19
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront2
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheelLeftFront20
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheelLeftFront21
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 307, 212, textureX, textureY); // Import WheelLeftFront22
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront23
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront24
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront25
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront3
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront4
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront5
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront6
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront7
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront8
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftFront9

		leftFrontWheelModel[0].addShapeBox(-5F, -7F, 2F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront1
		leftFrontWheelModel[0].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[1].addShapeBox(-7F, -5F, 1F, 14, 3, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront10
		leftFrontWheelModel[1].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[2].addShapeBox(-7F, -2F, 1F, 14, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront11
		leftFrontWheelModel[2].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[3].addShapeBox(-7F, 2F, 1F, 14, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheelLeftFront12
		leftFrontWheelModel[3].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[4].addShapeBox(-5F, 5F, 1F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheelLeftFront13
		leftFrontWheelModel[4].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[5].addShapeBox(-5F, -7F, 0F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront14
		leftFrontWheelModel[5].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[6].addShapeBox(1F, -5F, 0F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheelLeftFront15
		leftFrontWheelModel[6].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[7].addShapeBox(5F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront16
		leftFrontWheelModel[7].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[8].addShapeBox(1F, 2F, 0F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import WheelLeftFront17
		leftFrontWheelModel[8].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[9].addShapeBox(-5F, 5F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheelLeftFront18
		leftFrontWheelModel[9].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[10].addShapeBox(-4F, -4F, -0.5F, 8, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront19
		leftFrontWheelModel[10].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[11].addShapeBox(-7F, -5F, 2F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront2
		leftFrontWheelModel[11].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[12].addShapeBox(-4F, -2F, -0.5F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront20
		leftFrontWheelModel[12].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[13].addShapeBox(-4F, 2F, -0.5F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheelLeftFront21
		leftFrontWheelModel[13].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[14].addShapeBox(-1F, -1F, -1F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront22
		leftFrontWheelModel[14].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[15].addShapeBox(-7F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront23
		leftFrontWheelModel[15].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[16].addShapeBox(-7F, -5F, 0F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront24
		leftFrontWheelModel[16].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[17].addShapeBox(-7F, 2F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import WheelLeftFront25
		leftFrontWheelModel[17].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[18].addShapeBox(-7F, -2F, 2F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront3
		leftFrontWheelModel[18].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[19].addShapeBox(-7F, 2F, 2F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import WheelLeftFront4
		leftFrontWheelModel[19].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[20].addShapeBox(-5F, 5F, 2F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheelLeftFront5
		leftFrontWheelModel[20].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[21].addShapeBox(1F, 2F, 2F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import WheelLeftFront6
		leftFrontWheelModel[21].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[22].addShapeBox(5F, -2F, 2F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront7
		leftFrontWheelModel[22].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[23].addShapeBox(1F, -5F, 2F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheelLeftFront8
		leftFrontWheelModel[23].setRotationPoint(32F, 2F, 17.5F);

		leftFrontWheelModel[24].addShapeBox(-5F, -7F, 1F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftFront9
		leftFrontWheelModel[24].setRotationPoint(32F, 2F, 17.5F);


		rightFrontWheelModel = new ModelRendererTurbo[25];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront1
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheeRightFront10
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 307, 212, textureX, textureY); // Import WheeRightFront11
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheeRightFront12
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront13
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheeRightFront14
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheeRightFront15
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheeRightFront16
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront17
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront18
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront19
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront2
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront20
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront21
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront22
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront23
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront24
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront25
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront3
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront4
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront5
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront6
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront7
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightFront8
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheeRightFront9

		rightFrontWheelModel[0].addShapeBox(-5F, -7F, 1F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront1
		rightFrontWheelModel[0].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[1].addShapeBox(-4F, -4F, -0.5F, 8, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront10
		rightFrontWheelModel[1].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[2].addShapeBox(-1F, -1F, -1F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront11
		rightFrontWheelModel[2].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[3].addShapeBox(-4F, 2F, -0.5F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheeRightFront12
		rightFrontWheelModel[3].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[4].addShapeBox(-5F, -7F, 0F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront13
		rightFrontWheelModel[4].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[5].addShapeBox(-7F, -5F, 0F, 14, 3, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront14
		rightFrontWheelModel[5].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[6].addShapeBox(-7F, -2F, 0F, 14, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront15
		rightFrontWheelModel[6].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[7].addShapeBox(-7F, 2F, 0F, 14, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheeRightFront16
		rightFrontWheelModel[7].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[8].addShapeBox(-5F, 5F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheeRightFront17
		rightFrontWheelModel[8].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[9].addShapeBox(-5F, 5F, -1F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheeRightFront18
		rightFrontWheelModel[9].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[10].addShapeBox(1F, 2F, -1F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import WheeRightFront19
		rightFrontWheelModel[10].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[11].addShapeBox(1F, -5F, 1F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheeRightFront2
		rightFrontWheelModel[11].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[12].addShapeBox(5F, -2F, -1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront20
		rightFrontWheelModel[12].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[13].addShapeBox(1F, -5F, -1F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheeRightFront21
		rightFrontWheelModel[13].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[14].addShapeBox(-5F, -7F, -1F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront22
		rightFrontWheelModel[14].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[15].addShapeBox(-7F, -5F, -1F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront23
		rightFrontWheelModel[15].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[16].addShapeBox(-7F, -2F, -1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront24
		rightFrontWheelModel[16].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[17].addShapeBox(-7F, 2F, -1F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import WheeRightFront25
		rightFrontWheelModel[17].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[18].addShapeBox(-7F, -5F, 1F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront3
		rightFrontWheelModel[18].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[19].addShapeBox(-7F, -2F, 1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront4
		rightFrontWheelModel[19].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[20].addShapeBox(-7F, 2F, 1F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import WheeRightFront5
		rightFrontWheelModel[20].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[21].addShapeBox(-5F, 5F, 1F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheeRightFront6
		rightFrontWheelModel[21].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[22].addShapeBox(1F, 2F, 1F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import WheeRightFront7
		rightFrontWheelModel[22].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[23].addShapeBox(5F, -2F, 1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront8
		rightFrontWheelModel[23].setRotationPoint(32F, 2F, -19.5F);

		rightFrontWheelModel[24].addShapeBox(-4F, -2F, -0.5F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightFront9
		rightFrontWheelModel[24].setRotationPoint(32F, 2F, -19.5F);


		leftBackWheelModel = new ModelRendererTurbo[26];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack1
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheelLeftBack10
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheelLeftBack11
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 307, 212, textureX, textureY); // Import WheelLeftBack12
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack13
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheelLeftBack14
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheelLeftBack15
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheelLeftBack16
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack17
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack18
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack19
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack2
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack20
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack21
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack22
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack23
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack24
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack25
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack3
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack4
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack5
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack6
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack7
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheelLeftBack8
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheelLeftBack9
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack25

		leftBackWheelModel[0].addShapeBox(-5F, -7F, 2F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack1
		leftBackWheelModel[0].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[1].addShapeBox(-4F, -2F, -0.5F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack10
		leftBackWheelModel[1].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[2].addShapeBox(-4F, -4F, -0.5F, 8, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack11
		leftBackWheelModel[2].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[3].addShapeBox(-1F, -1F, -1F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack12
		leftBackWheelModel[3].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[4].addShapeBox(-5F, -7F, 1F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack13
		leftBackWheelModel[4].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[5].addShapeBox(-7F, -5F, 1F, 14, 3, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack14
		leftBackWheelModel[5].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[6].addShapeBox(-7F, -2F, 1F, 14, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack15
		leftBackWheelModel[6].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[7].addShapeBox(-7F, 2F, 1F, 14, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheelLeftBack16
		leftBackWheelModel[7].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[8].addShapeBox(-5F, 5F, 1F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheelLeftBack17
		leftBackWheelModel[8].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[9].addShapeBox(-5F, 5F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheelLeftBack18
		leftBackWheelModel[9].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[10].addShapeBox(1F, 2F, 0F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import WheelLeftBack19
		leftBackWheelModel[10].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[11].addShapeBox(1F, -5F, 2F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheelLeftBack2
		leftBackWheelModel[11].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[12].addShapeBox(5F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack20
		leftBackWheelModel[12].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[13].addShapeBox(1F, -5F, 0F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheelLeftBack21
		leftBackWheelModel[13].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[14].addShapeBox(-5F, -7F, 0F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack22
		leftBackWheelModel[14].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[15].addShapeBox(-7F, -5F, 0F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack23
		leftBackWheelModel[15].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[16].addShapeBox(-7F, -2F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack24
		leftBackWheelModel[16].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[17].addShapeBox(-7F, 2F, 0F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import WheelLeftBack25
		leftBackWheelModel[17].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[18].addShapeBox(5F, -2F, 2F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack3
		leftBackWheelModel[18].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[19].addShapeBox(-7F, -5F, 2F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack4
		leftBackWheelModel[19].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[20].addShapeBox(-7F, -2F, 2F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheelLeftBack5
		leftBackWheelModel[20].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[21].addShapeBox(-7F, 2F, 2F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import WheelLeftBack6
		leftBackWheelModel[21].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[22].addShapeBox(-5F, 5F, 2F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheelLeftBack7
		leftBackWheelModel[22].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[23].addShapeBox(1F, 2F, 2F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import WheelLeftBack8
		leftBackWheelModel[23].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[24].addShapeBox(-4F, 2F, -0.5F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheelLeftBack9
		leftBackWheelModel[24].setRotationPoint(-28F, 2F, 17.5F);

		leftBackWheelModel[25].addShapeBox(-5F, 5F, 0F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheeRightBack25
		leftBackWheelModel[25].setRotationPoint(-28F, 2F, -19.5F);


		rightBackWheelModel = new ModelRendererTurbo[24];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack24
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheeRightBack1
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack10
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack11
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack12
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack13
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack14
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack15
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack16
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack17
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack18
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack19
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheeRightBack2
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheeRightBack20
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheeRightBack21
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 307, 192, textureX, textureY); // Import WheeRightBack22
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 307, 201, textureX, textureY); // Import WheeRightBack23
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 307, 212, textureX, textureY); // Import WheeRightBack3
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack4
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack5
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack6
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack7
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack8
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 307, 181, textureX, textureY); // Import WheeRightBack9

		rightBackWheelModel[0].addShapeBox(-5F, -7F, 0F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack24
		rightBackWheelModel[0].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[1].addShapeBox(-4F, -2F, -0.5F, 8, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack1
		rightBackWheelModel[1].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[2].addShapeBox(-5F, -7F, 1F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack10
		rightBackWheelModel[2].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[3].addShapeBox(1F, -5F, 1F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheeRightBack11
		rightBackWheelModel[3].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[4].addShapeBox(-5F, 5F, -1F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheeRightBack12
		rightBackWheelModel[4].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[5].addShapeBox(1F, 2F, -1F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import WheeRightBack13
		rightBackWheelModel[5].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[6].addShapeBox(5F, -2F, -1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack14
		rightBackWheelModel[6].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[7].addShapeBox(1F, -5F, -1F, 6, 3, 1, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import WheeRightBack15
		rightBackWheelModel[7].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[8].addShapeBox(-5F, -7F, -1F, 10, 2, 1, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack16
		rightBackWheelModel[8].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[9].addShapeBox(-7F, -5F, -1F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack17
		rightBackWheelModel[9].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[10].addShapeBox(-7F, -2F, -1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack18
		rightBackWheelModel[10].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[11].addShapeBox(-7F, 2F, -1F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import WheeRightBack19
		rightBackWheelModel[11].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[12].addShapeBox(-4F, 2F, -0.5F, 8, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheeRightBack2
		rightBackWheelModel[12].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[13].addShapeBox(-7F, 2F, 0F, 14, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import WheeRightBack20
		rightBackWheelModel[13].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[14].addShapeBox(-7F, -2F, 0F, 14, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack21
		rightBackWheelModel[14].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[15].addShapeBox(-7F, -5F, 0F, 14, 3, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack22
		rightBackWheelModel[15].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[16].addShapeBox(-4F, -4F, -0.5F, 8, 2, 3, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack23
		rightBackWheelModel[16].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[17].addShapeBox(-1F, -1F, -1F, 2, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack3
		rightBackWheelModel[17].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[18].addShapeBox(-7F, -2F, 1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack4
		rightBackWheelModel[18].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[19].addShapeBox(-7F, 2F, 1F, 6, 3, 1, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Import WheeRightBack5
		rightBackWheelModel[19].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[20].addShapeBox(-5F, 5F, 1F, 10, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import WheeRightBack6
		rightBackWheelModel[20].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[21].addShapeBox(1F, 2F, 1F, 6, 3, 1, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Import WheeRightBack7
		rightBackWheelModel[21].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[22].addShapeBox(5F, -2F, 1F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack8
		rightBackWheelModel[22].setRotationPoint(-28F, 2F, -19.5F);

		rightBackWheelModel[23].addShapeBox(-7F, -5F, 1F, 6, 3, 1, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import WheeRightBack9
		rightBackWheelModel[23].setRotationPoint(-28F, 2F, -19.5F);


		steeringWheelModel = new ModelRendererTurbo[14];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 96, 204, textureX, textureY); // Import Core183
		steeringWheelModel[1] = new ModelRendererTurbo(this, 96, 197, textureX, textureY); // Import Core188
		steeringWheelModel[2] = new ModelRendererTurbo(this, 96, 211, textureX, textureY); // Import Core191
		steeringWheelModel[3] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Import Core192
		steeringWheelModel[4] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Import Core195
		steeringWheelModel[5] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Import Core196
		steeringWheelModel[6] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Import Core205
		steeringWheelModel[7] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Import Core207
		steeringWheelModel[8] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Import Core212
		steeringWheelModel[9] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Import Core215
		steeringWheelModel[10] = new ModelRendererTurbo(this, 109, 201, textureX, textureY); // Import Core218
		steeringWheelModel[11] = new ModelRendererTurbo(this, 109, 211, textureX, textureY); // Import Core222
		steeringWheelModel[12] = new ModelRendererTurbo(this, 109, 211, textureX, textureY); // Import Core225
		steeringWheelModel[13] = new ModelRendererTurbo(this, 109, 211, textureX, textureY); // Import Core227

		steeringWheelModel[0].addShapeBox(0F, -0.5F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core183
		steeringWheelModel[0].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[0].rotateAngleZ = -0.43633231F;

		steeringWheelModel[1].addShapeBox(0F, -1.5F, -1.5F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core188
		steeringWheelModel[1].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[1].rotateAngleZ = -0.43633231F;

		steeringWheelModel[2].addShapeBox(0F, 0.5F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Core191
		steeringWheelModel[2].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[2].rotateAngleZ = -0.43633231F;

		steeringWheelModel[3].addBox(0F, -4.5F, -1.5F, 1, 1, 3, 0F); // Import Core192
		steeringWheelModel[3].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[3].rotateAngleZ = -0.43633231F;

		steeringWheelModel[4].addBox(0F, 3.5F, -1.5F, 1, 1, 3, 0F); // Import Core195
		steeringWheelModel[4].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[4].rotateAngleZ = -0.43633231F;

		steeringWheelModel[5].addBox(0F, -1.5F, 3.5F, 1, 3, 1, 0F); // Import Core196
		steeringWheelModel[5].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[5].rotateAngleZ = -0.43633231F;

		steeringWheelModel[6].addBox(0F, -1.5F, -4.5F, 1, 3, 1, 0F); // Import Core205
		steeringWheelModel[6].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[6].rotateAngleZ = -0.43633231F;

		steeringWheelModel[7].addShapeBox(0F, -4.5F, 3.5F, 1, 3, 1, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core207
		steeringWheelModel[7].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[7].rotateAngleZ = -0.43633231F;

		steeringWheelModel[8].addShapeBox(0F, 1.5F, 3.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Core212
		steeringWheelModel[8].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[8].rotateAngleZ = -0.43633231F;

		steeringWheelModel[9].addShapeBox(0F, 1.5F, -4.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F); // Import Core215
		steeringWheelModel[9].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[9].rotateAngleZ = -0.43633231F;

		steeringWheelModel[10].addShapeBox(0F, -4.5F, -4.5F, 1, 3, 1, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core218
		steeringWheelModel[10].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[10].rotateAngleZ = -0.43633231F;

		steeringWheelModel[11].addShapeBox(0F, 0.5F, 3.5F, 1, 2, 1, 0F, -.2F, -.5F, 3F, -.2F, -.5F, 3F, -.2F, 0F, -3.5F, -.2F, 0F, -3.5F, -.2F, .5F, 1F, -.2F, .5F, 1F, -.2F, 0F, -1.5F, -.2F, 0F, -1.5F); // Import Core222
		steeringWheelModel[11].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[11].rotateAngleZ = -0.43633231F;

		steeringWheelModel[12].addShapeBox(0F, -3.5F, -0.5F, 1, 2, 1, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Import Core225
		steeringWheelModel[12].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[12].rotateAngleZ = -0.43633231F;

		steeringWheelModel[13].addShapeBox(0F, 0.5F, -4.5F, 1, 2, 1, 0F, -.2F, 0F, -3.5F, -.2F, 0F, -3.5F, -.2F, -.5F, 3F, -.2F, -.5F, 3F, -.2F, 0F, -1.5F, -.2F, 0F, -1.5F, -.2F, .5F, 1F, -.2F, .5F, 1F); // Import Core227
		steeringWheelModel[13].setRotationPoint(12F, -10F, 8F);
		steeringWheelModel[13].rotateAngleZ = -0.43633231F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}