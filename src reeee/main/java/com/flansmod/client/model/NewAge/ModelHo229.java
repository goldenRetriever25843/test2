//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.08.2017 - 22:19:38
// Last changed on: 05.08.2017 - 22:19:38

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHo229 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelHo229() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[276];
		leftWingModel = new ModelRendererTurbo[51];
		rightWingModel = new ModelRendererTurbo[51];
		bodyWheelModel = new ModelRendererTurbo[25];
		leftWingWheelModel = new ModelRendererTurbo[12];
		rightWingWheelModel = new ModelRendererTurbo[12];
		hudModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		inithudModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 60
		bodyModel[3] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 57
		bodyModel[4] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Box 62
		bodyModel[5] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 69
		bodyModel[6] = new ModelRendererTurbo(this, 857, 113, textureX, textureY); // Box 71
		bodyModel[7] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 72
		bodyModel[8] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 73
		bodyModel[9] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 74
		bodyModel[10] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 75
		bodyModel[11] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 77
		bodyModel[12] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 78
		bodyModel[13] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 81
		bodyModel[14] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 82
		bodyModel[15] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 83
		bodyModel[16] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 84
		bodyModel[17] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 85
		bodyModel[18] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 86
		bodyModel[19] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 87
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 89
		bodyModel[21] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 90
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 95
		bodyModel[23] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 97
		bodyModel[24] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 98
		bodyModel[25] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 99
		bodyModel[26] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 100
		bodyModel[27] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 101
		bodyModel[28] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 102
		bodyModel[29] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 103
		bodyModel[30] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 104
		bodyModel[31] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 105
		bodyModel[32] = new ModelRendererTurbo(this, 729, 185, textureX, textureY); // Box 106
		bodyModel[33] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); // Box 107
		bodyModel[34] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 108
		bodyModel[35] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 109
		bodyModel[36] = new ModelRendererTurbo(this, 849, 201, textureX, textureY); // Box 110
		bodyModel[37] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 111
		bodyModel[38] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 112
		bodyModel[39] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 113
		bodyModel[40] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 114
		bodyModel[41] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 117
		bodyModel[42] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 118
		bodyModel[43] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 119
		bodyModel[44] = new ModelRendererTurbo(this, 849, 137, textureX, textureY); // Box 120
		bodyModel[45] = new ModelRendererTurbo(this, 929, 209, textureX, textureY); // Box 121
		bodyModel[46] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 122
		bodyModel[47] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 123
		bodyModel[48] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 124
		bodyModel[49] = new ModelRendererTurbo(this, 529, 225, textureX, textureY); // Box 125
		bodyModel[50] = new ModelRendererTurbo(this, 849, 209, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 601, 233, textureX, textureY); // Box 129
		bodyModel[52] = new ModelRendererTurbo(this, 697, 233, textureX, textureY); // Box 130
		bodyModel[53] = new ModelRendererTurbo(this, 793, 233, textureX, textureY); // Box 131
		bodyModel[54] = new ModelRendererTurbo(this, 897, 233, textureX, textureY); // Box 132
		bodyModel[55] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 133
		bodyModel[56] = new ModelRendererTurbo(this, 105, 249, textureX, textureY); // Box 134
		bodyModel[57] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 135
		bodyModel[58] = new ModelRendererTurbo(this, 313, 249, textureX, textureY); // Box 136
		bodyModel[59] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 137
		bodyModel[60] = new ModelRendererTurbo(this, 513, 249, textureX, textureY); // Box 138
		bodyModel[61] = new ModelRendererTurbo(this, 609, 257, textureX, textureY); // Box 139
		bodyModel[62] = new ModelRendererTurbo(this, 705, 257, textureX, textureY); // Box 140
		bodyModel[63] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 141
		bodyModel[64] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 144
		bodyModel[65] = new ModelRendererTurbo(this, 529, 265, textureX, textureY); // Box 150
		bodyModel[66] = new ModelRendererTurbo(this, 761, 265, textureX, textureY); // Box 151
		bodyModel[67] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 152
		bodyModel[68] = new ModelRendererTurbo(this, 945, 185, textureX, textureY); // Box 153
		bodyModel[69] = new ModelRendererTurbo(this, 817, 265, textureX, textureY); // Box 154
		bodyModel[70] = new ModelRendererTurbo(this, 873, 265, textureX, textureY); // Box 155
		bodyModel[71] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 158
		bodyModel[72] = new ModelRendererTurbo(this, 937, 265, textureX, textureY); // Box 159
		bodyModel[73] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 160
		bodyModel[74] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 161
		bodyModel[75] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 166
		bodyModel[76] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 167
		bodyModel[77] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 169
		bodyModel[78] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 171
		bodyModel[79] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 172
		bodyModel[80] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 174
		bodyModel[81] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 175
		bodyModel[82] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 176
		bodyModel[83] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 177
		bodyModel[84] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 178
		bodyModel[85] = new ModelRendererTurbo(this, 593, 281, textureX, textureY); // Box 179
		bodyModel[86] = new ModelRendererTurbo(this, 649, 281, textureX, textureY); // Box 180
		bodyModel[87] = new ModelRendererTurbo(this, 753, 289, textureX, textureY); // Box 182
		bodyModel[88] = new ModelRendererTurbo(this, 801, 289, textureX, textureY); // Box 183
		bodyModel[89] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 184
		bodyModel[90] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 185
		bodyModel[91] = new ModelRendererTurbo(this, 865, 297, textureX, textureY); // Box 186
		bodyModel[92] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 187
		bodyModel[93] = new ModelRendererTurbo(this, 409, 297, textureX, textureY); // Box 188
		bodyModel[94] = new ModelRendererTurbo(this, 529, 297, textureX, textureY); // Box 189
		bodyModel[95] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 190
		bodyModel[96] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Box 191
		bodyModel[97] = new ModelRendererTurbo(this, 569, 313, textureX, textureY); // Box 192
		bodyModel[98] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Box 193
		bodyModel[99] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 194
		bodyModel[100] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 195
		bodyModel[101] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 196
		bodyModel[102] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 197
		bodyModel[103] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 198
		bodyModel[104] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 199
		bodyModel[105] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 200
		bodyModel[106] = new ModelRendererTurbo(this, 281, 321, textureX, textureY); // Box 201
		bodyModel[107] = new ModelRendererTurbo(this, 417, 321, textureX, textureY); // Box 202
		bodyModel[108] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 204
		bodyModel[109] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 205
		bodyModel[110] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 206
		bodyModel[111] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 207
		bodyModel[112] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 208
		bodyModel[113] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 209
		bodyModel[114] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 210
		bodyModel[115] = new ModelRendererTurbo(this, 681, 305, textureX, textureY); // Box 215
		bodyModel[116] = new ModelRendererTurbo(this, 793, 321, textureX, textureY); // Box 216
		bodyModel[117] = new ModelRendererTurbo(this, 865, 329, textureX, textureY); // Box 217
		bodyModel[118] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 218
		bodyModel[119] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 219
		bodyModel[120] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 220
		bodyModel[121] = new ModelRendererTurbo(this, 681, 329, textureX, textureY); // Box 229
		bodyModel[122] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 230
		bodyModel[123] = new ModelRendererTurbo(this, 745, 329, textureX, textureY); // Box 231
		bodyModel[124] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 233
		bodyModel[125] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 234
		bodyModel[126] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 235
		bodyModel[127] = new ModelRendererTurbo(this, 529, 337, textureX, textureY); // Box 236
		bodyModel[128] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 240
		bodyModel[129] = new ModelRendererTurbo(this, 593, 337, textureX, textureY); // Box 241
		bodyModel[130] = new ModelRendererTurbo(this, 249, 345, textureX, textureY); // Box 242
		bodyModel[131] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 243
		bodyModel[132] = new ModelRendererTurbo(this, 321, 345, textureX, textureY); // Box 244
		bodyModel[133] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Box 245
		bodyModel[134] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 256
		bodyModel[135] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 257
		bodyModel[136] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 258
		bodyModel[137] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 260
		bodyModel[138] = new ModelRendererTurbo(this, 89, 353, textureX, textureY); // Box 261
		bodyModel[139] = new ModelRendererTurbo(this, 337, 305, textureX, textureY); // Box 262
		bodyModel[140] = new ModelRendererTurbo(this, 977, 313, textureX, textureY); // Box 265
		bodyModel[141] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 266
		bodyModel[142] = new ModelRendererTurbo(this, 705, 353, textureX, textureY); // Box 267
		bodyModel[143] = new ModelRendererTurbo(this, 169, 361, textureX, textureY); // Box 268
		bodyModel[144] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 269
		bodyModel[145] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 270
		bodyModel[146] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 272
		bodyModel[147] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 273
		bodyModel[148] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 274
		bodyModel[149] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 275
		bodyModel[150] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 276
		bodyModel[151] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Box 277
		bodyModel[152] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 278
		bodyModel[153] = new ModelRendererTurbo(this, 793, 105, textureX, textureY); // Box 279
		bodyModel[154] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 280
		bodyModel[155] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 281
		bodyModel[156] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 282
		bodyModel[157] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 283
		bodyModel[158] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 284
		bodyModel[159] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 285
		bodyModel[160] = new ModelRendererTurbo(this, 529, 129, textureX, textureY); // Box 286
		bodyModel[161] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 287
		bodyModel[162] = new ModelRendererTurbo(this, 977, 337, textureX, textureY); // Box 288
		bodyModel[163] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 289
		bodyModel[164] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 290
		bodyModel[165] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 291
		bodyModel[166] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 292
		bodyModel[167] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 293
		bodyModel[168] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 294
		bodyModel[169] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 295
		bodyModel[170] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Box 296
		bodyModel[171] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 297
		bodyModel[172] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 298
		bodyModel[173] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 299
		bodyModel[174] = new ModelRendererTurbo(this, 721, 129, textureX, textureY); // Box 300
		bodyModel[175] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 301
		bodyModel[176] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 302
		bodyModel[177] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 303
		bodyModel[178] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 304
		bodyModel[179] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 305
		bodyModel[180] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 306
		bodyModel[181] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 307
		bodyModel[182] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 308
		bodyModel[183] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 309
		bodyModel[184] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 310
		bodyModel[185] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 311
		bodyModel[186] = new ModelRendererTurbo(this, 665, 169, textureX, textureY); // Box 312
		bodyModel[187] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 314
		bodyModel[188] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 315
		bodyModel[189] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 317
		bodyModel[190] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 318
		bodyModel[191] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 319
		bodyModel[192] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 320
		bodyModel[193] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 321
		bodyModel[194] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 322
		bodyModel[195] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 323
		bodyModel[196] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 324
		bodyModel[197] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 257
		bodyModel[198] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 258
		bodyModel[199] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 259
		bodyModel[200] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 260
		bodyModel[201] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 261
		bodyModel[202] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 262
		bodyModel[203] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 263
		bodyModel[204] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 264
		bodyModel[205] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 265
		bodyModel[206] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 266
		bodyModel[207] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 267
		bodyModel[208] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 268
		bodyModel[209] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 269
		bodyModel[210] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 270
		bodyModel[211] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 271
		bodyModel[212] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 272
		bodyModel[213] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 273
		bodyModel[214] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 274
		bodyModel[215] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 275
		bodyModel[216] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 276
		bodyModel[217] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 277
		bodyModel[218] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 278
		bodyModel[219] = new ModelRendererTurbo(this, 993, 281, textureX, textureY); // Box 279
		bodyModel[220] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Box 280
		bodyModel[221] = new ModelRendererTurbo(this, 729, 313, textureX, textureY); // Box 281
		bodyModel[222] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 282
		bodyModel[223] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 283
		bodyModel[224] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 284
		bodyModel[225] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 286
		bodyModel[226] = new ModelRendererTurbo(this, 473, 345, textureX, textureY); // Box 287
		bodyModel[227] = new ModelRendererTurbo(this, 521, 361, textureX, textureY); // Box 288
		bodyModel[228] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 289
		bodyModel[229] = new ModelRendererTurbo(this, 865, 361, textureX, textureY); // Box 290
		bodyModel[230] = new ModelRendererTurbo(this, 817, 345, textureX, textureY); // Box 291
		bodyModel[231] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 292
		bodyModel[232] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 293
		bodyModel[233] = new ModelRendererTurbo(this, 745, 129, textureX, textureY); // Box 294
		bodyModel[234] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 295
		bodyModel[235] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 296
		bodyModel[236] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 297
		bodyModel[237] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 298
		bodyModel[238] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 299
		bodyModel[239] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 301
		bodyModel[240] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 302
		bodyModel[241] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 303
		bodyModel[242] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 304
		bodyModel[243] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 305
		bodyModel[244] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 306
		bodyModel[245] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 307
		bodyModel[246] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 308
		bodyModel[247] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 309
		bodyModel[248] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 310
		bodyModel[249] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 311
		bodyModel[250] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 312
		bodyModel[251] = new ModelRendererTurbo(this, 697, 9, textureX, textureY); // Box 313
		bodyModel[252] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 314
		bodyModel[253] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 315
		bodyModel[254] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 316
		bodyModel[255] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 317
		bodyModel[256] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 318
		bodyModel[257] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 319
		bodyModel[258] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 320
		bodyModel[259] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 321
		bodyModel[260] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 322
		bodyModel[261] = new ModelRendererTurbo(this, 1001, 233, textureX, textureY); // Box 323
		bodyModel[262] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 324
		bodyModel[263] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 325
		bodyModel[264] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 326
		bodyModel[265] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 327
		bodyModel[266] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 328
		bodyModel[267] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 329
		bodyModel[268] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 330
		bodyModel[269] = new ModelRendererTurbo(this, 1001, 209, textureX, textureY); // Box 331
		bodyModel[270] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 332
		bodyModel[271] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 334
		bodyModel[272] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 335
		bodyModel[273] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 337
		bodyModel[274] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 338
		bodyModel[275] = new ModelRendererTurbo(this, 817, 345, textureX, textureY); // Box 465

		bodyModel[0].addShapeBox(0F, 0F, 0F, 81, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-56F, -21F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 81, 1, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(-56F, -21F, -5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 25, 20, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -1F, 0F); // Box 60
		bodyModel[2].setRotationPoint(44F, -43F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 25, 17, 4, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -1F, 0F); // Box 57
		bodyModel[3].setRotationPoint(44F, -41F, 5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 41, 13, 5, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -5F, 0F, -1F, 0F); // Box 62
		bodyModel[4].setRotationPoint(69F, -40F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 41, 9, 4, 0F,0F, 0F, 0F, 0F, -5F, 5F, 0F, -5F, -9F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -4F, 5F, 0F, -4F, -9F, 0F, 0F, 0F); // Box 69
		bodyModel[5].setRotationPoint(69F, -39F, 5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 15, 3, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F); // Box 71
		bodyModel[6].setRotationPoint(44F, -40F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 25, 14, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[7].setRotationPoint(44F, -40F, 12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 25, 6, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 4F, 0F); // Box 73
		bodyModel[8].setRotationPoint(44F, -37F, 15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 25, 14, 3, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6.5F, 0F, 0F, -1.5F, 0F); // Box 74
		bodyModel[9].setRotationPoint(44F, -40F, 18F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 25, 14, 7, 0F,0F, 0F, -2F, 0F, -4.5F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -6.5F, 0F, 0F, -7F, 0F, 0F, -2F, 0F); // Box 75
		bodyModel[10].setRotationPoint(44F, -40F, 21F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 25, 14, 3, 0F,0F, -4F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[11].setRotationPoint(44F, -40F, -15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 25, 6, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F); // Box 78
		bodyModel[12].setRotationPoint(44F, -37F, -18F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 2F, -9F, 0F, 2F, 2F, 0F, 2.5F, 0F, 0F, -1F, 0F, 0F, -3F, -9F, 0F, -3F, 2F, 0F, -0.5F, 0F); // Box 81
		bodyModel[13].setRotationPoint(69F, -33F, -28F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,4F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 82
		bodyModel[14].setRotationPoint(54F, -38F, -21F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 83
		bodyModel[15].setRotationPoint(54F, -38F, -18F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 2F, 0.5F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 84
		bodyModel[16].setRotationPoint(54F, -38F, -15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 4F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 85
		bodyModel[17].setRotationPoint(54F, -38F, 18F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 86
		bodyModel[18].setRotationPoint(54F, -38F, 15F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,2F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F); // Box 87
		bodyModel[19].setRotationPoint(54F, -38F, 12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, -0.5F, 0F, 0F, -1F, -2F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, -2F, 2F, -3F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[20].setRotationPoint(69F, -36F, -21F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 5, 3, 0F,0F, -1F, 0F, 0F, -2F, 0F, 29F, -3F, 15F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 29F, -2F, 15F, 0F, 0.5F, 0F); // Box 90
		bodyModel[21].setRotationPoint(69F, -37F, -18F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 5, 3, 0F,0F, -0.5F, 0F, 29F, -3F, -15F, 29F, -3F, 12F, 0F, 0F, 0F, 0F, 0.5F, 0F, 29F, -2F, -15F, 29F, -2F, 12F, 0F, 1F, 0F); // Box 95
		bodyModel[22].setRotationPoint(69F, -37F, -15F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 2.5F, 0F, 0F, 2F, 2F, 0F, 2F, -9F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 2F, 0F, -3F, -9F, 0F, -1F, 0F); // Box 97
		bodyModel[23].setRotationPoint(69F, -33F, 21F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 2F, -1F, 0F, 0F, -1F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, 0F, -3F, -2F, 0F, -0.5F, 0F); // Box 98
		bodyModel[24].setRotationPoint(69F, -36F, 18F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 5, 3, 0F,0F, -0.5F, 0F, 29F, -3F, 15F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 29F, -2F, 15F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[25].setRotationPoint(69F, -37F, 15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 5, 3, 0F,0F, 0F, 0F, 29F, -3F, 12F, 29F, -3F, -15F, 0F, -0.5F, 0F, 0F, 1F, 0F, 29F, -2F, 12F, 29F, -2F, -15F, 0F, 0.5F, 0F); // Box 100
		bodyModel[26].setRotationPoint(69F, -37F, 12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 6, 3, 0F,0F, 1F, 0F, 29F, -3F, 9F, 29F, -3F, -12F, 0F, 0F, 0F, 0F, 1F, 0F, 29F, -3F, 9F, 29F, -3F, -12F, 0F, 0F, 0F); // Box 101
		bodyModel[27].setRotationPoint(69F, -37F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 24, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 102
		bodyModel[28].setRotationPoint(-46F, -24F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 25, 20, 5, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[29].setRotationPoint(44F, -43F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 25, 17, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[30].setRotationPoint(44F, -41F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 25, 15, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[31].setRotationPoint(44F, -40F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 41, 13, 5, 0F,0F, -1F, 0F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -7F, -5F, 0F, -7F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[32].setRotationPoint(69F, -40F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 41, 9, 4, 0F,0F, -1F, 0F, 0F, -5F, -9F, 0F, -5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -9F, 0F, -4F, 5F, 0F, 2F, 0F); // Box 107
		bodyModel[33].setRotationPoint(69F, -39F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 12, 6, 3, 0F,0F, 0F, 0F, 29F, -3F, -12F, 29F, -3F, 9F, 0F, 1F, 0F, 0F, 0F, 0F, 29F, -3F, -12F, 29F, -3F, 9F, 0F, 1F, 0F); // Box 108
		bodyModel[34].setRotationPoint(69F, -37F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 81, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 109
		bodyModel[35].setRotationPoint(-56F, -22F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 81, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[36].setRotationPoint(-56F, -22F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 22, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 111
		bodyModel[37].setRotationPoint(-22F, -24F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 25, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -1F, 0F); // Box 112
		bodyModel[38].setRotationPoint(0F, -25F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F); // Box 113
		bodyModel[39].setRotationPoint(25F, -22F, 5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[40].setRotationPoint(25F, -21F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 19, 1, 4, 0F,0F, 2F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[41].setRotationPoint(25F, -22F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, 1F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[42].setRotationPoint(25F, -21F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 19, 1, 19, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 5F, 0F, 0F, 3.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3.25F, 0F); // Box 119
		bodyModel[43].setRotationPoint(25F, -24F, 9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 14, 1, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -3F, 0F); // Box 120
		bodyModel[44].setRotationPoint(44F, -26F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 24, 1, 19, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[45].setRotationPoint(-46F, -24F, -28F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 22, 1, 19, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[46].setRotationPoint(-22F, -24F, -28F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 25, 2, 19, 0F,0F, 1F, 0F, 0F, 3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[47].setRotationPoint(0F, -25F, -28F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 19, 1, 19, 0F,0F, 3.25F, 0F, 0F, 5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[48].setRotationPoint(25F, -24F, -28F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 14, 1, 19, 0F,0F, 3F, 0F, 0F, 6F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[49].setRotationPoint(44F, -26F, -28F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 44, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(0F, -36F, -18F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 44, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[51].setRotationPoint(0F, -36F, -15F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 44, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[52].setRotationPoint(0F, -40F, -12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 44, 21, 4, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[53].setRotationPoint(0F, -45F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 44, 25, 5, 0F,0F, -2F, 0F, 0F, -7F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[54].setRotationPoint(0F, -49F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 44, 21, 4, 0F,0F, 2F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[55].setRotationPoint(0F, -45F, 5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 44, 25, 5, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[56].setRotationPoint(0F, -49F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 44, 19, 5, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[57].setRotationPoint(0F, -44F, 23F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 44, 19, 5, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[58].setRotationPoint(0F, -44F, 18F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 44, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[59].setRotationPoint(0F, -36F, 15F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 44, 9, 3, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[60].setRotationPoint(0F, -36F, 12F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 44, 17, 3, 0F,0F, 5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F); // Box 139
		bodyModel[61].setRotationPoint(0F, -40F, 9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 28, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[62].setRotationPoint(-22F, -52F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 22, 24, 4, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[63].setRotationPoint(-22F, -48F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 22, 28, 5, 0F,0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[64].setRotationPoint(-22F, -52F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 22, 19, 7, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[65].setRotationPoint(-22F, -44F, -28F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 22, 20, 3, 0F,0F, 0F, -3F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[66].setRotationPoint(-22F, -44F, 9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 22, 11, 3, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[67].setRotationPoint(-22F, -36F, 12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 22, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[68].setRotationPoint(-22F, -36F, 15F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 22, 19, 3, 0F,0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[69].setRotationPoint(-22F, -44F, 18F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 22, 19, 7, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[70].setRotationPoint(-22F, -44F, 21F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 24, 17, 2, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[71].setRotationPoint(-46F, -41F, 12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 24, 17, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[72].setRotationPoint(-46F, -41F, 21F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F); // Box 160
		bodyModel[73].setRotationPoint(-56F, -24F, 9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 19, 0F,0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[74].setRotationPoint(-56F, -24F, -28F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 12, 2, 0F,0F, 3F, 0F, 0F, 6F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 166
		bodyModel[75].setRotationPoint(-56F, -38F, 12F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 10, 11, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[76].setRotationPoint(-56F, -38F, 21F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 24, 17, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[77].setRotationPoint(-46F, -41F, -28F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 11, 7, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 171
		bodyModel[78].setRotationPoint(-56F, -38F, -28F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 48, 15, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[79].setRotationPoint(-22F, -41F, 11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 31, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[80].setRotationPoint(-37F, -52F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 15, 31, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[81].setRotationPoint(-37F, -52F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 15, 26, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[82].setRotationPoint(-37F, -50F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 10, 15, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 177
		bodyModel[83].setRotationPoint(-56F, -39F, 14F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 24, 16, 7, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[84].setRotationPoint(-46F, -40F, 14F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 22, 24, 4, 0F,0F, -4F, 3F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[85].setRotationPoint(-22F, -48F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 22, 20, 3, 0F,0F, -4F, 3F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[86].setRotationPoint(-22F, -44F, -12F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 15, 26, 7, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[87].setRotationPoint(-37F, -50F, -12F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 22, 19, 7, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[88].setRotationPoint(-22F, -44F, -28F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 24, 17, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[89].setRotationPoint(-46F, -41F, -28F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 11, 7, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 185
		bodyModel[90].setRotationPoint(-56F, -38F, -28F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 48, 15, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[91].setRotationPoint(-22F, -41F, -21F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 15, 7, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[92].setRotationPoint(-56F, -39F, -21F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 24, 16, 7, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[93].setRotationPoint(-46F, -40F, -21F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 24, 17, 2, 0F,0F, -1F, 0F, 0F, -1F, 1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[94].setRotationPoint(-46F, -41F, -14F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 10, 12, 2, 0F,0F, 1F, 0F, 0F, 2F, 0F, 0F, 6F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 190
		bodyModel[95].setRotationPoint(-56F, -38F, -14F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 48, 7, 16, 0F,0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 191
		bodyModel[96].setRotationPoint(-22F, -45F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 48, 3, 15, 0F,0F, 0F, -5F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, 0F, 1F); // Box 192
		bodyModel[97].setRotationPoint(-22F, -48F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 48, 1, 7, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, 1F, 0F, 0F, 0F); // Box 193
		bodyModel[98].setRotationPoint(-22F, -49F, 15F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 194
		bodyModel[99].setRotationPoint(26F, -46F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 195
		bodyModel[100].setRotationPoint(26F, -43F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 196
		bodyModel[101].setRotationPoint(26F, -48F, 15F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 4F); // Box 197
		bodyModel[102].setRotationPoint(26F, -48F, 18F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 198
		bodyModel[103].setRotationPoint(26F, -46F, 22F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 199
		bodyModel[104].setRotationPoint(26F, -43F, 24F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 1F); // Box 200
		bodyModel[105].setRotationPoint(26F, -48F, 15F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 48, 7, 16, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 201
		bodyModel[106].setRotationPoint(-22F, -45F, -26F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 48, 3, 15, 0F,0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 0F); // Box 202
		bodyModel[107].setRotationPoint(-22F, -48F, -25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 204
		bodyModel[108].setRotationPoint(26F, -46F, -12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 205
		bodyModel[109].setRotationPoint(26F, -43F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -1F, 4F); // Box 206
		bodyModel[110].setRotationPoint(26F, -48F, -16F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 207
		bodyModel[111].setRotationPoint(26F, -48F, -19F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 208
		bodyModel[112].setRotationPoint(26F, -46F, -23F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 209
		bodyModel[113].setRotationPoint(26F, -43F, -25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 0F, 1F); // Box 210
		bodyModel[114].setRotationPoint(26F, -48F, -19F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 25, 14, 3, 0F,0F, 0F, 2F, 0F, -4.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -6.5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F); // Box 215
		bodyModel[115].setRotationPoint(44F, -40F, -21F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 25, 14, 7, 0F,0F, -3F, 0F, 0F, -7F, 0F, 0F, -4.5F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -6.5F, 0F, 0F, -1.5F, 0F); // Box 216
		bodyModel[116].setRotationPoint(44F, -40F, -28F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 44, 19, 5, 0F,0F, -3F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[117].setRotationPoint(0F, -44F, -28F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 44, 19, 5, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[118].setRotationPoint(0F, -44F, -23F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 219
		bodyModel[119].setRotationPoint(26F, -44F, 14F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 220
		bodyModel[120].setRotationPoint(29F, -43F, 15F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 15, 3, 15, 0F,0F, -4F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 1F); // Box 229
		bodyModel[121].setRotationPoint(-37F, -48F, 10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 3F); // Box 230
		bodyModel[122].setRotationPoint(-37F, -49F, 15F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 15, 7, 16, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 231
		bodyModel[123].setRotationPoint(-37F, -45F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 48, 1, 7, 0F,0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 4F, 0F, 0F, 0F); // Box 233
		bodyModel[124].setRotationPoint(-22F, -49F, -22F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 15, 3, 15, 0F,0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, -4F, -2F, 0F, 3F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 234
		bodyModel[125].setRotationPoint(-37F, -48F, -25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 15, 1, 7, 0F,0F, -2F, -2F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 3F); // Box 235
		bodyModel[126].setRotationPoint(-37F, -49F, -22F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 15, 7, 16, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 236
		bodyModel[127].setRotationPoint(-37F, -45F, -26F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, -2F, -1F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 3F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 4F, 2F); // Box 240
		bodyModel[128].setRotationPoint(-56F, -45F, 15F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 19, 3, 15, 0F,0F, -2F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, -3F, -1F, 0F, 3F, -2F, 0F, 0F, -5F, 0F, -2F, 1F, 0F, 3F, 1F); // Box 241
		bodyModel[129].setRotationPoint(-56F, -43F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 19, 7, 14, 0F,0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 242
		bodyModel[130].setRotationPoint(-56F, -40F, 12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 19, 1, 7, 0F,0F, -2F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, -2F, -1F, 0F, 4F, 2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 3F, 3F); // Box 243
		bodyModel[131].setRotationPoint(-56F, -45F, -22F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 19, 3, 15, 0F,0F, -3F, -1F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -2F, -2F, 0F, 3F, 1F, 0F, -2F, 1F, 0F, 0F, -5F, 0F, 3F, -2F); // Box 244
		bodyModel[132].setRotationPoint(-56F, -43F, -25F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 19, 7, 14, 0F,0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[133].setRotationPoint(-56F, -40F, -26F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 9, 22, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 256
		bodyModel[134].setRotationPoint(-46F, -46F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 10, 19, 4, 0F,0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 257
		bodyModel[135].setRotationPoint(-56F, -43F, -12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 258
		bodyModel[136].setRotationPoint(-56F, -24F, 10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 260
		bodyModel[137].setRotationPoint(-56F, -21F, 13F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 21, 3, 16, 0F,0F, 0F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, -2F, -2F); // Box 261
		bodyModel[138].setRotationPoint(-51F, -24F, 10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 21, 1, 11, 0F,0F, 0F, 0F, 0F, 4F, -3F, 0F, 4F, -4F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, -4F, -5F, 0F, -4F, -6F, 0F, 0F, -4F); // Box 262
		bodyModel[139].setRotationPoint(-51F, -21F, 13F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 265
		bodyModel[140].setRotationPoint(-56F, -24F, -26F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 266
		bodyModel[141].setRotationPoint(-56F, -21F, -24F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 21, 3, 16, 0F,0F, 1F, 0F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -3F); // Box 267
		bodyModel[142].setRotationPoint(-51F, -24F, -26F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 21, 1, 11, 0F,0F, 2F, 0F, 0F, 4F, -4F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -6F, 0F, -4F, -5F, 0F, 0F, -3F); // Box 268
		bodyModel[143].setRotationPoint(-51F, -21F, -24F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 8, 6, 4, 0F,-1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[144].setRotationPoint(-64F, -43F, 16F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-1F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F); // Box 270
		bodyModel[145].setRotationPoint(-64F, -43F, 20F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 0F); // Box 272
		bodyModel[146].setRotationPoint(-64F, -33F, 23F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, -1F, -5F, 0F); // Box 273
		bodyModel[147].setRotationPoint(-64F, -26F, 20F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 274
		bodyModel[148].setRotationPoint(-64F, -25F, 16F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 4F, 0F, -1F, 2F, -2F); // Box 275
		bodyModel[149].setRotationPoint(-64F, -29F, 23F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 8, 6, 4, 0F,-1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[150].setRotationPoint(-64F, -43F, -20F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-1F, -6F, 0F, 0F, -3F, 2F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[151].setRotationPoint(-64F, -43F, -22F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,-1F, -7F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, -1F, -3F, 2F, 0F, 1F, -2F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F, 2F); // Box 278
		bodyModel[152].setRotationPoint(-64F, -40F, -25F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[153].setRotationPoint(-64F, -33F, -25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, 0F, -3F, 2F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 280
		bodyModel[154].setRotationPoint(-64F, -26F, -22F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 281
		bodyModel[155].setRotationPoint(-64F, -25F, -20F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-1F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -2F, 0F, 4F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 282
		bodyModel[156].setRotationPoint(-64F, -29F, -24F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 283
		bodyModel[157].setRotationPoint(-58F, -34F, 25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 8, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F); // Box 284
		bodyModel[158].setRotationPoint(-58F, -34F, -28F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,-1F, -4F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[159].setRotationPoint(-64F, -37F, -25F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 286
		bodyModel[160].setRotationPoint(-63F, -23F, 0F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 9, 22, 4, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[161].setRotationPoint(-46F, -46F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 10, 19, 4, 0F,0F, 0.5F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[162].setRotationPoint(-56F, -43F, 8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 7, 16, 4, 0F,0F, 0.5F, 0F, 0F, 3.5F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 289
		bodyModel[163].setRotationPoint(-63F, -40F, 8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 8, 6, 4, 0F,-1F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 290
		bodyModel[164].setRotationPoint(-64F, -41F, 12F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F,0F, -2F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Box 291
		bodyModel[165].setRotationPoint(-70F, -37F, 8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 7, 16, 4, 0F,0F, -3F, 0F, 0F, 1F, 0F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[166].setRotationPoint(-63F, -40F, -12F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 8, 6, 4, 0F,-1F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[167].setRotationPoint(-64F, -41F, -16F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F); // Box 294
		bodyModel[168].setRotationPoint(-70F, -37F, -12F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F); // Box 295
		bodyModel[169].setRotationPoint(-64F, -26F, 13F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -3F, 0F, 0F, -2F, 1F, 0F, 1F, 0F, -1F, -2F, 0F); // Box 296
		bodyModel[170].setRotationPoint(-64F, -27F, 11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,-1F, -3F, 2F, 0F, 0F, 0F, 0F, -3F, 1F, -1F, -7F, 0F, 0F, -1F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 1F, -2F); // Box 297
		bodyModel[171].setRotationPoint(-64F, -40F, 24F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, -4F, 0F, 0F, -3F, 1F, 0F, 0F, 1F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 0F); // Box 298
		bodyModel[172].setRotationPoint(-64F, -37F, 23F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 5, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 299
		bodyModel[173].setRotationPoint(-64F, -26F, -16F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -1F, -3F, 0F); // Box 300
		bodyModel[174].setRotationPoint(-64F, -27F, -13F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 301
		bodyModel[175].setRotationPoint(-62F, -34F, 14.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 302
		bodyModel[176].setRotationPoint(-64F, -33F, 15.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 303
		bodyModel[177].setRotationPoint(-62F, -34F, -20.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 304
		bodyModel[178].setRotationPoint(-64F, -33F, -19.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 1F, 0F, -2F, 0F); // Box 305
		bodyModel[179].setRotationPoint(-63F, -24F, 5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box 306
		bodyModel[180].setRotationPoint(-63F, -25F, 8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[181].setRotationPoint(-63F, -23F, -5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 2F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[182].setRotationPoint(-63F, -24F, -8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 309
		bodyModel[183].setRotationPoint(-63F, -25F, -12F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 310
		bodyModel[184].setRotationPoint(-69F, -24F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, -1F, -2F); // Box 311
		bodyModel[185].setRotationPoint(-74F, -28F, 0F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[186].setRotationPoint(-69F, -24F, -5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, 6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, -6F, 0F); // Box 314
		bodyModel[187].setRotationPoint(-69F, -25F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,1F, 6F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, -6F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[188].setRotationPoint(-69F, -25F, -8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 1F, -2F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[189].setRotationPoint(-74F, -28F, -5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, -4F, -2F, -1F, 2F, 0F, 0F, 3F, -4F, 0F, 0F, 0F, 0F, 4F, -2F, -1F, -2F, 0F, 0F, -3F, -3F); // Box 318
		bodyModel[190].setRotationPoint(-74F, -29F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, 3F, -4F, -1F, 2F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, -3F, -3F, -1F, -2F, 0F, 0F, 4F, -2F, 0F, 0F, 0F); // Box 319
		bodyModel[191].setRotationPoint(-74F, -29F, -8F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[192].setRotationPoint(-74F, -36F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 4F, 0F, 2F, 4F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 0F, 1F, -1F); // Box 321
		bodyModel[193].setRotationPoint(-74F, -36F, 2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 5F, -1F, 5F, 5.5F, 1F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -5F, -1F, 5F, -5.5F, 1F, 0F, 1F, -2F); // Box 322
		bodyModel[194].setRotationPoint(-74F, -35F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, -1F, -1F, 1F, -2F, -4F, 0F, -2F, 1F, 0F, -1F, -2F); // Box 323
		bodyModel[195].setRotationPoint(-74F, -32F, 4F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -1F, -1F, 1F, 1F, -4F, 0F, 1F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 324
		bodyModel[196].setRotationPoint(-74F, -34F, 4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[197].setRotationPoint(-74F, -36F, -2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -1F, -1F, 2F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[198].setRotationPoint(-74F, -36F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -2F, -2F, 5F, 5.5F, 1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 1F, -3F, 5F, -5.5F, 1F, 0F, -5F, -1F, 0F, 0F, 0F); // Box 259
		bodyModel[199].setRotationPoint(-74F, -35F, -7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 1F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, 1F, 1F, -2F, -4F, 0F, -1F, -1F); // Box 260
		bodyModel[200].setRotationPoint(-74F, -32F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -1F, -2F, 0F, 1F, 1F, 1F, 1F, -4F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 1F, 0F, -4F, 0F, 0F, 0F); // Box 261
		bodyModel[201].setRotationPoint(-74F, -34F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 7F, 7.5F, -4F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 7F, -6.5F, -4F, 1F, -3F, 3F, 0F, 0F, 0F); // Box 262
		bodyModel[202].setRotationPoint(-74F, -33F, 4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, 3F, 7F, 7.5F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, -3F, 3F, 7F, -6.5F, -4F, 0F, 0F, -1F); // Box 263
		bodyModel[203].setRotationPoint(-74F, -33F, -5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 0F, 0F); // Box 264
		bodyModel[204].setRotationPoint(-76F, -32F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 3F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F); // Box 265
		bodyModel[205].setRotationPoint(-76F, -33F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -1F, 0F); // Box 266
		bodyModel[206].setRotationPoint(-76F, -31F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, 0F, 0F); // Box 267
		bodyModel[207].setRotationPoint(-76F, -34F, -1F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -1F, 0F); // Box 268
		bodyModel[208].setRotationPoint(-76F, -30F, -1F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 269
		bodyModel[209].setRotationPoint(-48F, -52F, -0.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 270
		bodyModel[210].setRotationPoint(26F, -44F, -20F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 271
		bodyModel[211].setRotationPoint(29F, -43F, -19F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 272
		bodyModel[212].setRotationPoint(-57F, -51F, -0.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[213].setRotationPoint(-58F, -49F, -2.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, 2F, 4F, 0F); // Box 274
		bodyModel[214].setRotationPoint(-58F, -49F, 2.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, 1F, 4F, 0F); // Box 275
		bodyModel[215].setRotationPoint(-60F, -45F, 4.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[216].setRotationPoint(-58F, -49F, -4.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[217].setRotationPoint(-60F, -45F, -8.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 278
		bodyModel[218].setRotationPoint(-71F, -34F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 279
		bodyModel[219].setRotationPoint(-71F, -30F, -7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 280
		bodyModel[220].setRotationPoint(-71F, -26F, -5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 281
		bodyModel[221].setRotationPoint(-71F, -36F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 282
		bodyModel[222].setRotationPoint(-71F, -38F, -4F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[223].setRotationPoint(-66F, -32F, 7F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[224].setRotationPoint(-66F, -32F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 286
		bodyModel[225].setRotationPoint(-66F, -24F, 7F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[226].setRotationPoint(-58F, -41F, -7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 21, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[227].setRotationPoint(-58F, -25F, -8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F); // Box 289
		bodyModel[228].setRotationPoint(-66F, -24F, -8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 290
		bodyModel[229].setRotationPoint(-66F, -25F, -8F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[230].setRotationPoint(-58F, -43F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[231].setRotationPoint(-58F, -33F, -2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[232].setRotationPoint(-70F, -37F, -4F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[233].setRotationPoint(-70F, -37F, 3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 295
		bodyModel[234].setRotationPoint(-62F, -27F, 3F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 296
		bodyModel[235].setRotationPoint(-62F, -27F, -5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[236].setRotationPoint(-62F, -30F, 3.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[237].setRotationPoint(-62F, -30F, -4.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[238].setRotationPoint(-57.9F, -38F, -1.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 301
		bodyModel[239].setRotationPoint(-57.9F, -39F, -0.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[240].setRotationPoint(-57.9F, -37F, -0.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[241].setRotationPoint(-57.9F, -41F, -1.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 304
		bodyModel[242].setRotationPoint(-57.9F, -42F, -0.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[243].setRotationPoint(-57.9F, -40F, -0.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[244].setRotationPoint(-57.9F, -41F, -3.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[245].setRotationPoint(-57.9F, -38.8F, -3.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[246].setRotationPoint(-57.9F, -41F, 1.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[247].setRotationPoint(-57.9F, -38.8F, 1.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[248].setRotationPoint(-57.9F, -39F, 3.8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[249].setRotationPoint(-57.9F, -39F, 5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[250].setRotationPoint(-57.9F, -39F, -4.8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[251].setRotationPoint(-57.9F, -39F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[252].setRotationPoint(-57.9F, -36.5F, -5.5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[253].setRotationPoint(-57.9F, -35.8F, -3.3F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[254].setRotationPoint(-57.9F, -32.8F, -1F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[255].setRotationPoint(-57.9F, -36.5F, 3.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[256].setRotationPoint(-57.9F, -35.8F, 1.3F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 319
		bodyModel[257].setRotationPoint(-53F, -29F, -5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[258].setRotationPoint(-48F, -29F, -5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[259].setRotationPoint(-45F, -29F, -5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[260].setRotationPoint(-42F, -31F, -5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 323
		bodyModel[261].setRotationPoint(-40F, -44F, -5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[262].setRotationPoint(-45F, -31F, -5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[263].setRotationPoint(-48F, -31F, -5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 326
		bodyModel[264].setRotationPoint(-53F, -31F, -5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[265].setRotationPoint(-45F, -31F, 4F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[266].setRotationPoint(-48F, -31F, 4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 329
		bodyModel[267].setRotationPoint(-53F, -31F, 4F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[268].setRotationPoint(-41F, -44F, -1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[269].setRotationPoint(-40F, -47F, -5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[270].setRotationPoint(-42F, -45F, -2F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[271].setRotationPoint(-53F, -37F, 7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[272].setRotationPoint(-45F, -43F, 7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 337
		bodyModel[273].setRotationPoint(-52F, -41F, -8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 338
		bodyModel[274].setRotationPoint(-48F, -42F, -8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[275].setRotationPoint(-58F, -44F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 35
		leftWingModel[1] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 36
		leftWingModel[2] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 37
		leftWingModel[3] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 38
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 39
		leftWingModel[5] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 40
		leftWingModel[6] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 41
		leftWingModel[7] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 42
		leftWingModel[8] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 43
		leftWingModel[9] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 44
		leftWingModel[10] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 45
		leftWingModel[11] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Box 46
		leftWingModel[12] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 47
		leftWingModel[13] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 48
		leftWingModel[14] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 49
		leftWingModel[15] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 50
		leftWingModel[16] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 51
		leftWingModel[17] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 52
		leftWingModel[18] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 53
		leftWingModel[19] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 54
		leftWingModel[20] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 55
		leftWingModel[21] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 56
		leftWingModel[22] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 57
		leftWingModel[23] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 58
		leftWingModel[24] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 59
		leftWingModel[25] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 250
		leftWingModel[26] = new ModelRendererTurbo(this, 473, 345, textureX, textureY); // Box 251
		leftWingModel[27] = new ModelRendererTurbo(this, 777, 345, textureX, textureY); // Box 252
		leftWingModel[28] = new ModelRendererTurbo(this, 769, 345, textureX, textureY); // Box 253
		leftWingModel[29] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 339
		leftWingModel[30] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 401
		leftWingModel[31] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 402
		leftWingModel[32] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 403
		leftWingModel[33] = new ModelRendererTurbo(this, 641, 201, textureX, textureY); // Box 405
		leftWingModel[34] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 407
		leftWingModel[35] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 409
		leftWingModel[36] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 410
		leftWingModel[37] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 412
		leftWingModel[38] = new ModelRendererTurbo(this, 529, 321, textureX, textureY); // Box 452
		leftWingModel[39] = new ModelRendererTurbo(this, 577, 337, textureX, textureY); // Box 453
		leftWingModel[40] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 454
		leftWingModel[41] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 455
		leftWingModel[42] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 456
		leftWingModel[43] = new ModelRendererTurbo(this, 305, 345, textureX, textureY); // Box 457
		leftWingModel[44] = new ModelRendererTurbo(this, 377, 345, textureX, textureY); // Box 458
		leftWingModel[45] = new ModelRendererTurbo(this, 153, 353, textureX, textureY); // Box 459
		leftWingModel[46] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 460
		leftWingModel[47] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Box 461
		leftWingModel[48] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 462
		leftWingModel[49] = new ModelRendererTurbo(this, 769, 353, textureX, textureY); // Box 463
		leftWingModel[50] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 464

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 22, 17, 11, 0F,-2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		leftWingModel[0].setRotationPoint(-22F, -41F, -39F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 22, 15, 38, 0F,-18F, -2F, 0F, 10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -3F, 0F, 10F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		leftWingModel[1].setRotationPoint(-20F, -40F, -77F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 24, 17, 11, 0F,-5F, -5F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftWingModel[2].setRotationPoint(-46F, -41F, -39F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 21, 15, 38, 0F,-22F, -5F, 0F, 18F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -22F, -3F, 0F, 18F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftWingModel[3].setRotationPoint(-41F, -40F, -77F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 44, 17, 11, 0F,-2F, -1F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 39
		leftWingModel[4].setRotationPoint(0F, -41F, -39F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 42, 15, 38, 0F,-10F, -2F, 0F, -6F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -10F, -3F, 0F, -6F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 40
		leftWingModel[5].setRotationPoint(2F, -40F, -77F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 26, 10, 32, 0F,-12F, 0F, 0F, 9F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -12F, -3F, 0F, 9F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 41
		leftWingModel[6].setRotationPoint(12F, -38F, -109F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 14, 10, 32, 0F,-16F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -3F, 0F, 12F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftWingModel[7].setRotationPoint(-2F, -38F, -109F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 17, 7, 32, 0F,-19F, 2F, 0F, 16F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -19F, -3F, 0F, 16F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftWingModel[8].setRotationPoint(-19F, -35F, -109F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 7, 84, 0F,-42F, 3F, 0F, 36F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, -6F, 0F, 36F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftWingModel[9].setRotationPoint(14F, -38F, -193F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 22, 7, 84, 0F,-36F, 3F, 0F, 24F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -36F, -6F, 0F, 24F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		leftWingModel[10].setRotationPoint(25F, -38F, -193F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 14, 6, 84, 0F,-50F, 3F, 0F, 42F, 4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -50F, -6F, 0F, 42F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftWingModel[11].setRotationPoint(0F, -37F, -193F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 10, 12, 11, 0F,-7F, -5F, 0F, 5F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, -7F, -2F, 0F, 5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 47
		leftWingModel[12].setRotationPoint(-56F, -37F, -39F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 8, 5, 38, 0F,-23F, 1F, 0F, 22F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -23F, -2F, 0F, 22F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 48
		leftWingModel[13].setRotationPoint(-49F, -32F, -77F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 7, 4, 32, 0F,-19F, 1F, 0F, 19F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -19F, -3F, 0F, 19F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 49
		leftWingModel[14].setRotationPoint(-26F, -33F, -109F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 7, 2, 84, 0F,-54F, 5F, 0F, 50F, 6F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -54F, -5F, 0F, 50F, -5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 50
		leftWingModel[15].setRotationPoint(-7F, -34F, -193F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 13, 5, 32, 0F,-9F, 1F, 0F, 7F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, 7F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 51
		leftWingModel[16].setRotationPoint(38F, -35F, -109F);

		leftWingModel[17].addShapeBox(0F, -2F, 0F, 11, 5, 84, 0F,-24F, 4F, 0F, 24F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -24F, -7F, 0F, 24F, -8F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 52
		leftWingModel[17].setRotationPoint(47F, -34F, -193F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 15, 5, 38, 0F,-2F, 2F, 0F, 0F, -1F, 0F, 9F, -2F, 0F, -8F, 1F, 0F, -2F, -2F, 0F, 0F, -4F, 0F, 9F, -3F, 0F, -8F, -2F, 0F); // Box 53
		leftWingModel[18].setRotationPoint(36F, -33F, -77F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 16, 9, 11, 0F,0F, -3F, 0F, 0F, -6F, 0F, 9F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 9F, -5F, 0F, 0F, 0F, 0F); // Box 54
		leftWingModel[19].setRotationPoint(44F, -37F, -39F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F,-6F, -2F, -3F, 10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, -3F, 10F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftWingModel[20].setRotationPoint(56F, -41F, -209F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 6, 3, 13, 0F,-3F, -1F, -7F, 6F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, -1F, -7F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		leftWingModel[21].setRotationPoint(50F, -40F, -206F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, -6F, 3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftWingModel[22].setRotationPoint(47F, -39F, -199F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 10, 4, 16, 0F,-10F, -2F, 0F, 5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		leftWingModel[23].setRotationPoint(61F, -41F, -209F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 11, 2, 16, 0F,-5F, -1F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 59
		leftWingModel[24].setRotationPoint(71F, -40F, -209F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F,-6F, -4F, 0F, 7F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, 7F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 250
		leftWingModel[25].setRotationPoint(-58F, -34F, -39F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 3, 6, 38, 0F,-23F, -1F, 0F, 23F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -23F, -4F, 0F, 23F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 251
		leftWingModel[26].setRotationPoint(-52F, -32F, -77F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 3, 5, 32, 0F,-20F, 0F, 0F, 19F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -20F, -4.5F, 0F, 19F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 252
		leftWingModel[27].setRotationPoint(-29F, -33F, -109F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 84, 0F,-56F, 4F, 0F, 54F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -56F, -5.5F, 0F, 54F, -5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 253
		leftWingModel[28].setRotationPoint(-9F, -34F, -193F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		leftWingModel[29].setRotationPoint(-60F, -30F, -40F);

		leftWingModel[30].addBox(-1F, 0F, 0F, 1, 1, 7, 0F); // Box 401
		leftWingModel[30].setRotationPoint(53F, -36F, -161F);
		leftWingModel[30].rotateAngleX = -0.05235988F;
		leftWingModel[30].rotateAngleZ = 0.05235988F;

		leftWingModel[31].addBox(3F, 0F, 0F, 1, 1, 7, 0F); // Box 402
		leftWingModel[31].setRotationPoint(53F, -36F, -161F);
		leftWingModel[31].rotateAngleX = -0.05235988F;
		leftWingModel[31].rotateAngleZ = 0.05235988F;

		leftWingModel[32].addBox(3F, 0F, -10F, 1, 1, 7, 0F); // Box 403
		leftWingModel[32].setRotationPoint(53F, -36F, -161F);
		leftWingModel[32].rotateAngleX = -0.05235988F;
		leftWingModel[32].rotateAngleZ = 0.05235988F;

		leftWingModel[33].addBox(-1F, 0F, -10F, 1, 1, 7, 0F); // Box 405
		leftWingModel[33].setRotationPoint(53F, -36F, -161F);
		leftWingModel[33].rotateAngleX = -0.05235988F;
		leftWingModel[33].rotateAngleZ = 0.05235988F;

		leftWingModel[34].addBox(-7F, 0F, -4F, 7, 1, 1, 0F); // Box 407
		leftWingModel[34].setRotationPoint(53F, -36F, -161F);
		leftWingModel[34].rotateAngleX = -0.05235988F;
		leftWingModel[34].rotateAngleZ = 0.05235988F;

		leftWingModel[35].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 409
		leftWingModel[35].setRotationPoint(53F, -36F, -161F);
		leftWingModel[35].rotateAngleX = -0.05235988F;
		leftWingModel[35].rotateAngleZ = 0.05235988F;

		leftWingModel[36].addBox(3F, 0F, -4F, 7, 1, 1, 0F); // Box 410
		leftWingModel[36].setRotationPoint(53F, -36F, -161F);
		leftWingModel[36].rotateAngleX = -0.05235988F;
		leftWingModel[36].rotateAngleZ = 0.05235988F;

		leftWingModel[37].addBox(3F, 0F, 0F, 7, 1, 1, 0F); // Box 412
		leftWingModel[37].setRotationPoint(53F, -36F, -161F);
		leftWingModel[37].rotateAngleX = -0.05235988F;
		leftWingModel[37].rotateAngleZ = 0.05235988F;

		leftWingModel[38].addBox(0F, 0F, -10F, 3, 1, 7, 0F); // Box 452
		leftWingModel[38].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[38].rotateAngleX = -0.06981317F;
		leftWingModel[38].rotateAngleZ = -0.08726646F;

		leftWingModel[39].addBox(-1F, 0F, -10F, 1, 1, 7, 0F); // Box 453
		leftWingModel[39].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[39].rotateAngleX = -0.06981317F;
		leftWingModel[39].rotateAngleZ = -0.08726646F;

		leftWingModel[40].addBox(-7F, 0F, -3F, 7, 1, 3, 0F); // Box 454
		leftWingModel[40].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[40].rotateAngleX = -0.06981317F;
		leftWingModel[40].rotateAngleZ = -0.08726646F;

		leftWingModel[41].addBox(-7F, 0F, -4F, 7, 1, 1, 0F); // Box 455
		leftWingModel[41].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[41].rotateAngleX = -0.06981317F;
		leftWingModel[41].rotateAngleZ = -0.08726646F;

		leftWingModel[42].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 456
		leftWingModel[42].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[42].rotateAngleX = -0.06981317F;
		leftWingModel[42].rotateAngleZ = -0.08726646F;

		leftWingModel[43].addBox(-1F, 0F, 0F, 1, 1, 7, 0F); // Box 457
		leftWingModel[43].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[43].rotateAngleX = -0.06981317F;
		leftWingModel[43].rotateAngleZ = -0.08726646F;

		leftWingModel[44].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 458
		leftWingModel[44].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[44].rotateAngleX = -0.06981317F;
		leftWingModel[44].rotateAngleZ = -0.08726646F;

		leftWingModel[45].addBox(3F, 0F, 0F, 1, 1, 7, 0F); // Box 459
		leftWingModel[45].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[45].rotateAngleX = -0.06981317F;
		leftWingModel[45].rotateAngleZ = -0.08726646F;

		leftWingModel[46].addBox(3F, 0F, 0F, 7, 1, 1, 0F); // Box 460
		leftWingModel[46].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[46].rotateAngleX = -0.06981317F;
		leftWingModel[46].rotateAngleZ = -0.08726646F;

		leftWingModel[47].addBox(3F, 0F, -3F, 7, 1, 3, 0F); // Box 461
		leftWingModel[47].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[47].rotateAngleX = -0.06981317F;
		leftWingModel[47].rotateAngleZ = -0.08726646F;

		leftWingModel[48].addBox(3F, 0F, -4F, 7, 1, 1, 0F); // Box 462
		leftWingModel[48].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[48].rotateAngleX = -0.06981317F;
		leftWingModel[48].rotateAngleZ = -0.08726646F;

		leftWingModel[49].addBox(3F, 0F, -10F, 1, 1, 7, 0F); // Box 463
		leftWingModel[49].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[49].rotateAngleX = -0.06981317F;
		leftWingModel[49].rotateAngleZ = -0.08726646F;

		leftWingModel[50].addBox(0F, 0F, -3F, 3, 1, 3, 0F); // Box 464
		leftWingModel[50].setRotationPoint(53F, -39.5F, -162F);
		leftWingModel[50].rotateAngleX = -0.06981317F;
		leftWingModel[50].rotateAngleZ = -0.08726646F;
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 10
		rightWingModel[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 11
		rightWingModel[2] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 12
		rightWingModel[3] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 13
		rightWingModel[4] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 14
		rightWingModel[5] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 15
		rightWingModel[6] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 16
		rightWingModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 17
		rightWingModel[8] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 18
		rightWingModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 19
		rightWingModel[10] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 20
		rightWingModel[11] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 21
		rightWingModel[12] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 22
		rightWingModel[13] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Box 23
		rightWingModel[14] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 24
		rightWingModel[15] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 25
		rightWingModel[16] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 26
		rightWingModel[17] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 27
		rightWingModel[18] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 28
		rightWingModel[19] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 29
		rightWingModel[20] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 30
		rightWingModel[21] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 31
		rightWingModel[22] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 32
		rightWingModel[23] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 33
		rightWingModel[24] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 34
		rightWingModel[25] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 246
		rightWingModel[26] = new ModelRendererTurbo(this, 929, 329, textureX, textureY); // Box 247
		rightWingModel[27] = new ModelRendererTurbo(this, 633, 337, textureX, textureY); // Box 248
		rightWingModel[28] = new ModelRendererTurbo(this, 377, 345, textureX, textureY); // Box 249
		rightWingModel[29] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 340
		rightWingModel[30] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 427
		rightWingModel[31] = new ModelRendererTurbo(this, 521, 137, textureX, textureY); // Box 429
		rightWingModel[32] = new ModelRendererTurbo(this, 849, 153, textureX, textureY); // Box 430
		rightWingModel[33] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 431
		rightWingModel[34] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 433
		rightWingModel[35] = new ModelRendererTurbo(this, 1001, 161, textureX, textureY); // Box 434
		rightWingModel[36] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 436
		rightWingModel[37] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 437
		rightWingModel[38] = new ModelRendererTurbo(this, 577, 233, textureX, textureY); // Box 439
		rightWingModel[39] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 440
		rightWingModel[40] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 441
		rightWingModel[41] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 442
		rightWingModel[42] = new ModelRendererTurbo(this, 609, 193, textureX, textureY); // Box 443
		rightWingModel[43] = new ModelRendererTurbo(this, 41, 273, textureX, textureY); // Box 444
		rightWingModel[44] = new ModelRendererTurbo(this, 977, 297, textureX, textureY); // Box 445
		rightWingModel[45] = new ModelRendererTurbo(this, 169, 313, textureX, textureY); // Box 446
		rightWingModel[46] = new ModelRendererTurbo(this, 673, 193, textureX, textureY); // Box 447
		rightWingModel[47] = new ModelRendererTurbo(this, 25, 233, textureX, textureY); // Box 448
		rightWingModel[48] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 449
		rightWingModel[49] = new ModelRendererTurbo(this, 401, 321, textureX, textureY); // Box 450
		rightWingModel[50] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 451

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 22, 17, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F); // Box 10
		rightWingModel[0].setRotationPoint(-22F, -41F, 28F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 22, 15, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 10F, -2F, 0F, -18F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -3F, 0F, -18F, -3F, 0F); // Box 11
		rightWingModel[1].setRotationPoint(-20F, -40F, 39F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 24, 17, 11, 0F,0F, -3F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -5F, -1F, 0F); // Box 12
		rightWingModel[2].setRotationPoint(-46F, -41F, 28F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 21, 15, 38, 0F,0F, -4F, 0F, 0F, 0F, 0F, 18F, -2F, 0F, -22F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, -3F, 0F, -22F, -3F, 0F); // Box 13
		rightWingModel[3].setRotationPoint(-41F, -40F, 39F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 44, 17, 11, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, -2F, -1F, 0F); // Box 14
		rightWingModel[4].setRotationPoint(0F, -41F, 28F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 42, 15, 38, 0F,0F, 0F, 0F, 0F, -6F, 0F, -6F, -5F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, -5F, 0F, -10F, -3F, 0F); // Box 15
		rightWingModel[5].setRotationPoint(2F, -40F, 39F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 26, 10, 32, 0F,0F, 0F, 0F, 0F, -3F, 0F, 9F, -2F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 9F, -4F, 0F, -12F, -3F, 0F); // Box 16
		rightWingModel[6].setRotationPoint(12F, -38F, 77F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 14, 10, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, -3F, 0F, -16F, -3F, 0F); // Box 17
		rightWingModel[7].setRotationPoint(-2F, -38F, 77F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 17, 7, 32, 0F,0F, 0F, 0F, 0F, 3F, 0F, 16F, 3F, 0F, -19F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -3F, 0F, -19F, -3F, 0F); // Box 18
		rightWingModel[8].setRotationPoint(-19F, -35F, 77F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 11, 7, 84, 0F,0F, 0F, 0F, 0F, 0F, 0F, 36F, 3F, 0F, -42F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 36F, -6F, 0F, -42F, -6F, 0F); // Box 19
		rightWingModel[9].setRotationPoint(14F, -38F, 109F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 22, 7, 84, 0F,0F, 0F, 0F, 0F, -2F, 0F, 24F, 2F, 0F, -36F, 3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 24F, -7F, 0F, -36F, -6F, 0F); // Box 20
		rightWingModel[10].setRotationPoint(25F, -38F, 109F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 14, 6, 84, 0F,0F, 0F, 0F, 0F, 1F, 0F, 42F, 4F, 0F, -50F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, -6F, 0F, -50F, -6F, 0F); // Box 21
		rightWingModel[11].setRotationPoint(0F, -37F, 109F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 10, 12, 11, 0F,0F, -3F, 0F, 0F, 1F, 0F, 5F, -1F, 0F, -7F, -5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 5F, 0F, 0F, -7F, -2F, 0F); // Box 22
		rightWingModel[12].setRotationPoint(-56F, -37F, 28F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 8, 5, 38, 0F,0F, 0F, 0F, 0F, 4F, 0F, 22F, 3F, 0F, -23F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 22F, -1F, 0F, -23F, -2F, 0F); // Box 23
		rightWingModel[13].setRotationPoint(-49F, -32F, 39F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 7, 4, 32, 0F,0F, 0F, 0F, 0F, 2F, 0F, 19F, 4F, 0F, -19F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 19F, -2F, 0F, -19F, -3F, 0F); // Box 24
		rightWingModel[14].setRotationPoint(-26F, -33F, 77F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 7, 2, 84, 0F,0F, 0F, 0F, 0F, 3F, 0F, 50F, 6F, 0F, -54F, 5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 50F, -5F, 0F, -54F, -5F, 0F); // Box 25
		rightWingModel[15].setRotationPoint(-7F, -34F, 109F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 13, 5, 32, 0F,0F, 0F, 0F, 0F, -3F, 0F, 7F, -2F, 0F, -9F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 7F, -3F, 0F, -9F, -2F, 0F); // Box 26
		rightWingModel[16].setRotationPoint(38F, -35F, 77F);

		rightWingModel[17].addShapeBox(0F, -2F, 0F, 11, 5, 84, 0F,0F, 0F, 0F, 0F, -3F, 0F, 24F, 3F, 0F, -24F, 4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 24F, -8F, 0F, -24F, -7F, 0F); // Box 27
		rightWingModel[17].setRotationPoint(47F, -34F, 109F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 15, 5, 38, 0F,-8F, 1F, 0F, 9F, -2F, 0F, 0F, -1F, 0F, -2F, 2F, 0F, -8F, -2F, 0F, 9F, -3F, 0F, 0F, -4F, 0F, -2F, -2F, 0F); // Box 28
		rightWingModel[18].setRotationPoint(36F, -33F, 39F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 16, 9, 11, 0F,0F, 0F, 0F, 9F, -4F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 9F, -5F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 29
		rightWingModel[19].setRotationPoint(44F, -37F, 28F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 10F, -2F, 0F, -6F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, -1F, 0F, -6F, -1F, -3F); // Box 30
		rightWingModel[20].setRotationPoint(56F, -41F, 193F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 6, 3, 13, 0F,0F, 0F, 0F, 0F, 1F, 0F, 6F, -1F, 0F, -3F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -1F, 0F, -3F, -1F, -7F); // Box 31
		rightWingModel[21].setRotationPoint(50F, -40F, 193F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, -6F); // Box 32
		rightWingModel[22].setRotationPoint(47F, -39F, 193F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 10, 4, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 5F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 5F, -1F, 0F, -10F, -1F, 0F); // Box 33
		rightWingModel[23].setRotationPoint(61F, -41F, 193F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 11, 2, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, -5F, 0F, 0F); // Box 34
		rightWingModel[24].setRotationPoint(71F, -40F, 193F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 2, 8, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 7F, -2F, 0F, -6F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 7F, -1F, 0F, -6F, -2F, 0F); // Box 246
		rightWingModel[25].setRotationPoint(-58F, -34F, 28F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 3, 6, 38, 0F,0F, -2F, 0F, 0F, 0F, 0F, 23F, 1F, 0F, -23F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 23F, -3F, 0F, -23F, -4F, 0F); // Box 247
		rightWingModel[26].setRotationPoint(-52F, -32F, 39F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 3, 5, 32, 0F,0F, -2F, 0F, 0F, 0F, 0F, 19F, 1F, 0F, -20F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 19F, -4F, 0F, -20F, -4.5F, 0F); // Box 248
		rightWingModel[27].setRotationPoint(-29F, -33F, 77F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 84, 0F,0F, -1F, 0F, 0F, 0F, 0F, 54F, 5F, 0F, -56F, 4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 54F, -5F, 0F, -56F, -5.5F, 0F); // Box 249
		rightWingModel[28].setRotationPoint(-9F, -34F, 109F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		rightWingModel[29].setRotationPoint(-60F, -30F, 39F);

		rightWingModel[30].addBox(-1F, 0F, -10F, 1, 1, 7, 0F); // Box 427
		rightWingModel[30].setRotationPoint(53F, -35.9F, 161F);
		rightWingModel[30].rotateAngleX = 0.05235988F;
		rightWingModel[30].rotateAngleZ = 0.05235988F;

		rightWingModel[31].addBox(-7F, 0F, -4F, 7, 1, 1, 0F); // Box 429
		rightWingModel[31].setRotationPoint(53F, -35.9F, 161F);
		rightWingModel[31].rotateAngleX = 0.05235988F;
		rightWingModel[31].rotateAngleZ = 0.05235988F;

		rightWingModel[32].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 430
		rightWingModel[32].setRotationPoint(53F, -35.9F, 161F);
		rightWingModel[32].rotateAngleX = 0.05235988F;
		rightWingModel[32].rotateAngleZ = 0.05235988F;

		rightWingModel[33].addBox(-1F, 0F, 0F, 1, 1, 7, 0F); // Box 431
		rightWingModel[33].setRotationPoint(53F, -35.9F, 161F);
		rightWingModel[33].rotateAngleX = 0.05235988F;
		rightWingModel[33].rotateAngleZ = 0.05235988F;

		rightWingModel[34].addBox(3F, 0F, 0F, 1, 1, 7, 0F); // Box 433
		rightWingModel[34].setRotationPoint(53F, -35.9F, 161F);
		rightWingModel[34].rotateAngleX = 0.05235988F;
		rightWingModel[34].rotateAngleZ = 0.05235988F;

		rightWingModel[35].addBox(3F, 0F, 0F, 7, 1, 1, 0F); // Box 434
		rightWingModel[35].setRotationPoint(53F, -35.9F, 161F);
		rightWingModel[35].rotateAngleX = 0.05235988F;
		rightWingModel[35].rotateAngleZ = 0.05235988F;

		rightWingModel[36].addBox(3F, 0F, -4F, 7, 1, 1, 0F); // Box 436
		rightWingModel[36].setRotationPoint(53F, -35.9F, 161F);
		rightWingModel[36].rotateAngleX = 0.05235988F;
		rightWingModel[36].rotateAngleZ = 0.05235988F;

		rightWingModel[37].addBox(3F, 0F, -10F, 1, 1, 7, 0F); // Box 437
		rightWingModel[37].setRotationPoint(53F, -35.9F, 161F);
		rightWingModel[37].rotateAngleX = 0.05235988F;
		rightWingModel[37].rotateAngleZ = 0.05235988F;

		rightWingModel[38].addBox(0F, 0F, -10F, 3, 1, 7, 0F); // Box 439
		rightWingModel[38].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[38].rotateAngleX = 0.06981317F;
		rightWingModel[38].rotateAngleZ = -0.08726646F;

		rightWingModel[39].addBox(-1F, 0F, -10F, 1, 1, 7, 0F); // Box 440
		rightWingModel[39].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[39].rotateAngleX = 0.06981317F;
		rightWingModel[39].rotateAngleZ = -0.08726646F;

		rightWingModel[40].addBox(-7F, 0F, -3F, 7, 1, 3, 0F); // Box 441
		rightWingModel[40].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[40].rotateAngleX = 0.06981317F;
		rightWingModel[40].rotateAngleZ = -0.08726646F;

		rightWingModel[41].addBox(-7F, 0F, -4F, 7, 1, 1, 0F); // Box 442
		rightWingModel[41].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[41].rotateAngleX = 0.06981317F;
		rightWingModel[41].rotateAngleZ = -0.08726646F;

		rightWingModel[42].addBox(-7F, 0F, 0F, 7, 1, 1, 0F); // Box 443
		rightWingModel[42].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[42].rotateAngleX = 0.06981317F;
		rightWingModel[42].rotateAngleZ = -0.08726646F;

		rightWingModel[43].addBox(-1F, 0F, 0F, 1, 1, 7, 0F); // Box 444
		rightWingModel[43].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[43].rotateAngleX = 0.06981317F;
		rightWingModel[43].rotateAngleZ = -0.08726646F;

		rightWingModel[44].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 445
		rightWingModel[44].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[44].rotateAngleX = 0.06981317F;
		rightWingModel[44].rotateAngleZ = -0.08726646F;

		rightWingModel[45].addBox(3F, 0F, 0F, 1, 1, 7, 0F); // Box 446
		rightWingModel[45].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[45].rotateAngleX = 0.06981317F;
		rightWingModel[45].rotateAngleZ = -0.08726646F;

		rightWingModel[46].addBox(3F, 0F, 0F, 7, 1, 1, 0F); // Box 447
		rightWingModel[46].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[46].rotateAngleX = 0.06981317F;
		rightWingModel[46].rotateAngleZ = -0.08726646F;

		rightWingModel[47].addBox(3F, 0F, -3F, 7, 1, 3, 0F); // Box 448
		rightWingModel[47].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[47].rotateAngleX = 0.06981317F;
		rightWingModel[47].rotateAngleZ = -0.08726646F;

		rightWingModel[48].addBox(3F, 0F, -4F, 7, 1, 1, 0F); // Box 449
		rightWingModel[48].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[48].rotateAngleX = 0.06981317F;
		rightWingModel[48].rotateAngleZ = -0.08726646F;

		rightWingModel[49].addBox(3F, 0F, -10F, 1, 1, 7, 0F); // Box 450
		rightWingModel[49].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[49].rotateAngleX = 0.06981317F;
		rightWingModel[49].rotateAngleZ = -0.08726646F;

		rightWingModel[50].addBox(0F, 0F, -3F, 3, 1, 3, 0F); // Box 451
		rightWingModel[50].setRotationPoint(53F, -39.5F, 162F);
		rightWingModel[50].rotateAngleX = 0.06981317F;
		rightWingModel[50].rotateAngleZ = -0.08726646F;
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 241, 369, textureX, textureY); // Box 341
		bodyWheelModel[1] = new ModelRendererTurbo(this, 345, 369, textureX, textureY); // Box 342
		bodyWheelModel[2] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 343
		bodyWheelModel[3] = new ModelRendererTurbo(this, 105, 377, textureX, textureY); // Box 344
		bodyWheelModel[4] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 345
		bodyWheelModel[5] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 346
		bodyWheelModel[6] = new ModelRendererTurbo(this, 729, 209, textureX, textureY); // Box 347
		bodyWheelModel[7] = new ModelRendererTurbo(this, 729, 217, textureX, textureY); // Box 348
		bodyWheelModel[8] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 349
		bodyWheelModel[9] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 350
		bodyWheelModel[10] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 351
		bodyWheelModel[11] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 357
		bodyWheelModel[12] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Box 361
		bodyWheelModel[13] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 362
		bodyWheelModel[14] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 363
		bodyWheelModel[15] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 364
		bodyWheelModel[16] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 365
		bodyWheelModel[17] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 366
		bodyWheelModel[18] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 367
		bodyWheelModel[19] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 368
		bodyWheelModel[20] = new ModelRendererTurbo(this, 473, 305, textureX, textureY); // Box 369
		bodyWheelModel[21] = new ModelRendererTurbo(this, 673, 353, textureX, textureY); // Box 370
		bodyWheelModel[22] = new ModelRendererTurbo(this, 609, 201, textureX, textureY); // Box 371
		bodyWheelModel[23] = new ModelRendererTurbo(this, 585, 361, textureX, textureY); // Box 372
		bodyWheelModel[24] = new ModelRendererTurbo(this, 649, 201, textureX, textureY); // Box 373

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 50, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyWheelModel[0].setRotationPoint(-56F, -23F, -9F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 50, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 342
		bodyWheelModel[1].setRotationPoint(-56F, -18F, -9F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 50, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyWheelModel[2].setRotationPoint(-56F, -23F, 8F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 50, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 344
		bodyWheelModel[3].setRotationPoint(-56F, -18F, 8F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 16, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 8F, 0F, 0F); // Box 345
		bodyWheelModel[4].setRotationPoint(-55F, -22F, -1.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 346
		bodyWheelModel[5].setRotationPoint(-63F, -6F, -1.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 347
		bodyWheelModel[6].setRotationPoint(-58F, -10F, -5.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F); // Box 348
		bodyWheelModel[7].setRotationPoint(-58F, -10F, 4.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyWheelModel[8].setRotationPoint(-59F, -10F, -5.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyWheelModel[9].setRotationPoint(-64F, -1F, -2.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyWheelModel[10].setRotationPoint(-63F, -4F, -2.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-3F, -2F, 1F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 1F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyWheelModel[11].setRotationPoint(-63F, -4F, -4.5F);

		bodyWheelModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyWheelModel[12].setRotationPoint(-54F, 2F, -5.5F);

		bodyWheelModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 362
		bodyWheelModel[13].setRotationPoint(-60F, -2F, -5.5F);

		bodyWheelModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 363
		bodyWheelModel[14].setRotationPoint(-61F, 1F, -5.5F);

		bodyWheelModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-3F, -2F, 1F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 1F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyWheelModel[15].setRotationPoint(-64F, -1F, -4.5F);

		bodyWheelModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -3F, 2F, 1F); // Box 365
		bodyWheelModel[16].setRotationPoint(-63F, -4F, 2.5F);

		bodyWheelModel[17].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 366
		bodyWheelModel[17].setRotationPoint(-60F, -2F, 4.5F);

		bodyWheelModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 367
		bodyWheelModel[18].setRotationPoint(-61F, 1F, 4.5F);

		bodyWheelModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -3F, 2F, 1F); // Box 368
		bodyWheelModel[19].setRotationPoint(-64F, -1F, 2.5F);

		bodyWheelModel[20].addShapeBox(0F, 0F, 0F, 14, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyWheelModel[20].setRotationPoint(-60.5F, 0.5F, -4.5F);

		bodyWheelModel[21].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyWheelModel[21].setRotationPoint(-60.5F, -2.5F, -4.5F);

		bodyWheelModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyWheelModel[22].setRotationPoint(-58.5F, -4.5F, -4.5F);

		bodyWheelModel[23].addShapeBox(0F, 0F, 0F, 14, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 372
		bodyWheelModel[23].setRotationPoint(-60.5F, 4.5F, -4.5F);

		bodyWheelModel[24].addShapeBox(0F, 0F, 0F, 10, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 373
		bodyWheelModel[24].setRotationPoint(-58.5F, 7.5F, -4.5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 374
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1009, 337, textureX, textureY); // Box 376
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 377
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 378
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 379
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 380
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 381
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 382
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 383
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 384
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 385
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 388

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 374
		leftWingWheelModel[0].setRotationPoint(24F, -29F, -47F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		leftWingWheelModel[1].setRotationPoint(29F, -29F, -39F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		leftWingWheelModel[2].setRotationPoint(29F, -12F, -42F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		leftWingWheelModel[3].setRotationPoint(29F, -12F, -45F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 379
		leftWingWheelModel[4].setRotationPoint(29F, -11F, -46F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 380
		leftWingWheelModel[5].setRotationPoint(27F, -10F, -46F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 381
		leftWingWheelModel[6].setRotationPoint(25F, -8F, -46F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		leftWingWheelModel[7].setRotationPoint(24F, -5F, -46F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		leftWingWheelModel[8].setRotationPoint(29.5F, -3.5F, -41F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		leftWingWheelModel[9].setRotationPoint(24F, -5F, -44F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 385
		leftWingWheelModel[10].setRotationPoint(28F, -9F, -44F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		leftWingWheelModel[11].setRotationPoint(28F, -1F, -44F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 241, 377, textureX, textureY); // Box 375
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 389
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 390
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 391
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 392
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 393
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 394
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 395
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 396
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 397
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Box 398
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 399

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 375
		rightWingWheelModel[0].setRotationPoint(24F, -29F, 46F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 27, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		rightWingWheelModel[1].setRotationPoint(29F, -29F, 37F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		rightWingWheelModel[2].setRotationPoint(29F, -12F, 39F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 391
		rightWingWheelModel[3].setRotationPoint(29F, -12F, 42F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 392
		rightWingWheelModel[4].setRotationPoint(29F, -11F, 45F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 393
		rightWingWheelModel[5].setRotationPoint(27F, -10F, 45F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 394
		rightWingWheelModel[6].setRotationPoint(25F, -8F, 45F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 12, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		rightWingWheelModel[7].setRotationPoint(24F, -5F, 45F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightWingWheelModel[8].setRotationPoint(29.5F, -3.5F, 39F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		rightWingWheelModel[9].setRotationPoint(24F, -5F, 41F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F); // Box 398
		rightWingWheelModel[10].setRotationPoint(28F, -9F, 41F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		rightWingWheelModel[11].setRotationPoint(28F, -1F, 41F);
	}

	private void inithudModel_1()
	{
		hudModel[0] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 333

		hudModel[0].addShapeBox(0F, -17F, 0F, 1, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		hudModel[0].setRotationPoint(-55.5F, -24F, -0.5F);
		hudModel[0].rotateAngleY = -0.01745329F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][8];
		propellerModels[0] = makeProp1(-58F, -31F, 17.5F);
		propellerModels[1] = makeProp2(-58F, -31F, -17.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[8];
		prop[0] = new ModelRendererTurbo(this, 0, 401, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 401, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 401, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 401, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 0, 401, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 0, 401, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 0, 401, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 0, 401, textureX, textureY);
		prop[0].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[1].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[2].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[3].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[4].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[5].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[6].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[7].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[8];
		prop[0] = new ModelRendererTurbo(this, 0, 402, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 402, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 402, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 402, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 0, 402, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 0, 402, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 0, 402, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 0, 402, textureX, textureY);
		prop[0].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[1].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[2].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[3].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[4].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[5].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[6].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[7].addBox(-3F, -7F, -0.5F, 6, 7, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		return prop;
	}
}