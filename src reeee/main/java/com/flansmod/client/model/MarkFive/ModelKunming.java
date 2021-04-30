//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kunming
// Model Creator: 
// Created on: 10.07.2015 - 12:02:04
// Last changed on: 10.07.2015 - 12:02:04

package com.flansmod.client.model.MarkFive; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKunming extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 256;

	public ModelKunming() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[202];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 43
		bodyModel[27] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 83
		bodyModel[28] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 96
		bodyModel[29] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 97
		bodyModel[30] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 98
		bodyModel[31] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box 99
		bodyModel[32] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 135
		bodyModel[33] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 136
		bodyModel[34] = new ModelRendererTurbo(this, 961, 49, textureX, textureY); // Box 137
		bodyModel[35] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 139
		bodyModel[36] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 160
		bodyModel[37] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 161
		bodyModel[38] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 162
		bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 163
		bodyModel[40] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 164
		bodyModel[41] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 165
		bodyModel[42] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 166
		bodyModel[43] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 167
		bodyModel[44] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 168
		bodyModel[45] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 169
		bodyModel[46] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 170
		bodyModel[47] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 171
		bodyModel[48] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 172
		bodyModel[49] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 173
		bodyModel[50] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 174
		bodyModel[51] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 175
		bodyModel[52] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 176
		bodyModel[53] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 177
		bodyModel[54] = new ModelRendererTurbo(this, 753, 33, textureX, textureY); // Box 178
		bodyModel[55] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 179
		bodyModel[56] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 180
		bodyModel[57] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 181
		bodyModel[58] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 182
		bodyModel[59] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 183
		bodyModel[60] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 184
		bodyModel[61] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 185
		bodyModel[62] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 186
		bodyModel[63] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 187
		bodyModel[64] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 188
		bodyModel[65] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 189
		bodyModel[66] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 190
		bodyModel[67] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 191
		bodyModel[68] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 192
		bodyModel[69] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 193
		bodyModel[70] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 194
		bodyModel[71] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 195
		bodyModel[72] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 196
		bodyModel[73] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 197
		bodyModel[74] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 198
		bodyModel[75] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 199
		bodyModel[76] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 200
		bodyModel[77] = new ModelRendererTurbo(this, 841, 41, textureX, textureY); // Box 201
		bodyModel[78] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 202
		bodyModel[79] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 203
		bodyModel[80] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 204
		bodyModel[81] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 205
		bodyModel[82] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 206
		bodyModel[83] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 207
		bodyModel[84] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 208
		bodyModel[85] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 209
		bodyModel[86] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 210
		bodyModel[87] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 211
		bodyModel[88] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 212
		bodyModel[89] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 213
		bodyModel[90] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 214
		bodyModel[91] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 215
		bodyModel[92] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 216
		bodyModel[93] = new ModelRendererTurbo(this, 561, 49, textureX, textureY); // Box 217
		bodyModel[94] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 218
		bodyModel[95] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 219
		bodyModel[96] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 220
		bodyModel[97] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 223
		bodyModel[98] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 224
		bodyModel[99] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 225
		bodyModel[100] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 226
		bodyModel[101] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 228
		bodyModel[102] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 257
		bodyModel[103] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 258
		bodyModel[104] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 262
		bodyModel[105] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 308
		bodyModel[106] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 313
		bodyModel[107] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 314
		bodyModel[108] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 315
		bodyModel[109] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 316
		bodyModel[110] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 268
		bodyModel[111] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 269
		bodyModel[112] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 270
		bodyModel[113] = new ModelRendererTurbo(this, 777, 65, textureX, textureY); // Box 271
		bodyModel[114] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 272
		bodyModel[115] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 273
		bodyModel[116] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 274
		bodyModel[117] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 272
		bodyModel[118] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 273
		bodyModel[119] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 274
		bodyModel[120] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 275
		bodyModel[121] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 276
		bodyModel[122] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 277
		bodyModel[123] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 279
		bodyModel[124] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 280
		bodyModel[125] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 281
		bodyModel[126] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 282
		bodyModel[127] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 283
		bodyModel[128] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 284
		bodyModel[129] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 285
		bodyModel[130] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 286
		bodyModel[131] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 287
		bodyModel[132] = new ModelRendererTurbo(this, 641, 73, textureX, textureY); // Box 288
		bodyModel[133] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 289
		bodyModel[134] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 290
		bodyModel[135] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Box 291
		bodyModel[136] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 292
		bodyModel[137] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 293
		bodyModel[138] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 294
		bodyModel[139] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 295
		bodyModel[140] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 296
		bodyModel[141] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 297
		bodyModel[142] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Box 298
		bodyModel[143] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 299
		bodyModel[144] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 300
		bodyModel[145] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 301
		bodyModel[146] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 302
		bodyModel[147] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 303
		bodyModel[148] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 304
		bodyModel[149] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 305
		bodyModel[150] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 306
		bodyModel[151] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 307
		bodyModel[152] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 308
		bodyModel[153] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 309
		bodyModel[154] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 310
		bodyModel[155] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 311
		bodyModel[156] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 312
		bodyModel[157] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 313
		bodyModel[158] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 314
		bodyModel[159] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 315
		bodyModel[160] = new ModelRendererTurbo(this, 641, 73, textureX, textureY); // Box 316
		bodyModel[161] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 317
		bodyModel[162] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 318
		bodyModel[163] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 319
		bodyModel[164] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 320
		bodyModel[165] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 321
		bodyModel[166] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 322
		bodyModel[167] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 323
		bodyModel[168] = new ModelRendererTurbo(this, 665, 105, textureX, textureY); // Box 324
		bodyModel[169] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 325
		bodyModel[170] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 326
		bodyModel[171] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 185
		bodyModel[172] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 186
		bodyModel[173] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 187
		bodyModel[174] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 188
		bodyModel[175] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 189
		bodyModel[176] = new ModelRendererTurbo(this, 777, 73, textureX, textureY); // Box 190
		bodyModel[177] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Box 191
		bodyModel[178] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 192
		bodyModel[179] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 193
		bodyModel[180] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 194
		bodyModel[181] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 195
		bodyModel[182] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 196
		bodyModel[183] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 197
		bodyModel[184] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 198
		bodyModel[185] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 199
		bodyModel[186] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 200
		bodyModel[187] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 201
		bodyModel[188] = new ModelRendererTurbo(this, 641, 81, textureX, textureY); // Box 202
		bodyModel[189] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Box 203
		bodyModel[190] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 204
		bodyModel[191] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 205
		bodyModel[192] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 206
		bodyModel[193] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 207
		bodyModel[194] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 208
		bodyModel[195] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 209
		bodyModel[196] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 210
		bodyModel[197] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 211
		bodyModel[198] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 217
		bodyModel[199] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 218
		bodyModel[200] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 219
		bodyModel[201] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 220

		bodyModel[0].addShapeBox(0F, 0F, 0F, 131, 10, 26, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1
		bodyModel[0].setRotationPoint(-90F, -3.5F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 42, 8, 26, 0F,-1.5F, 0F, -2F, 0F, -2F, -0.8F, 0F, -2F, -0.8F, -1.5F, 0F, -2F, -4F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, -0.5F, -3F); // Box 3
		bodyModel[1].setRotationPoint(-132F, -1.5F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 70, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F); // Box 4
		bodyModel[2].setRotationPoint(-90F, 6.5F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 71, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F); // Box 5
		bodyModel[3].setRotationPoint(-20F, 6.5F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 38, 6, 20, 0F,0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, -2F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, -3F, -6F); // Box 5
		bodyModel[4].setRotationPoint(-128F, 6.5F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 25, 7, 34, 0F,0F, 0F, -4F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -6F); // Box 6
		bodyModel[5].setRotationPoint(51F, -0.5F, -17F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 27, 7, 32, 0F,0F, 2F, -4F, 0F, 4F, -9F, 0F, 4F, -9F, 0F, 2F, -4F, 0F, 0F, -7F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -7F); // Box 7
		bodyModel[6].setRotationPoint(76F, -0.5F, -16F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 11, 14, 0F,0F, 0F, 0F, 0F, 1.5F, -7F, 0F, 1.5F, -7F, 0F, 0F, 0F, 0F, 0F, -4F, -17F, 0F, -7F, -17F, 0F, -7F, 0F, 0F, -4F); // Box 8
		bodyModel[7].setRotationPoint(103F, -4.5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 25, 6, 30, 0F,0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -9F); // Box 9
		bodyModel[8].setRotationPoint(51F, 6.5F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 27, 6, 14, 0F,0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -4F); // Box 10
		bodyModel[9].setRotationPoint(76F, 6.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1.9999F, 0F, -1.999F, -1.9999F, 0F, -1.999F, 0F, 0F, -2F); // Box 11
		bodyModel[10].setRotationPoint(103F, 6.5F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 56, 4, 20, 0F,3F, 0F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4.6F, 1F, -1F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 1F, -1F, -8F); // Box 12
		bodyModel[11].setRotationPoint(-76F, 12.5F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 71, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -8F); // Box 13
		bodyModel[12].setRotationPoint(-20F, 12.5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 25, 4, 20, 0F,0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -9F); // Box 14
		bodyModel[13].setRotationPoint(51F, 12.5F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 27, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 15
		bodyModel[14].setRotationPoint(76F, 12.5F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 2F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -1.3F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		bodyModel[15].setRotationPoint(102F, 13F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, -1.3F, -1.5F, 0F, -1.5F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[16].setRotationPoint(102F, 13F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.8F, -1.5F, 0F, -1.5F, -1.3F, -1.5F, 0F, -1F, -1.3F); // Box 18
		bodyModel[17].setRotationPoint(102F, 17F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.3F, -1.5F, -1.3F, -1.5F, -0.8F, -1.5F, 0F, 0F, -1F, 0F); // Box 19
		bodyModel[18].setRotationPoint(102F, 17F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 23, 5, 3, 0F,0F, 0F, -2F, 0F, 0F, -1.3F, 0F, 2F, 0F, 0F, 0F, 0F, -7F, -0.5F, -1.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, 0F); // Box 20
		bodyModel[19].setRotationPoint(79F, 13F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 23, 5, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1.3F, 0F, 0F, -2F, -7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, -0.5F, -1.8F); // Box 21
		bodyModel[20].setRotationPoint(79F, 13F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, -1.8F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.3F, -6.5F, -1F, -1.5F); // Box 23
		bodyModel[21].setRotationPoint(87F, 17F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,1F, -0.5F, -1.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -6.5F, -1F, -1.5F, 0F, -1F, -1.3F, 0F, -1F, 0F, -6F, -1F, 0F); // Box 24
		bodyModel[22].setRotationPoint(87F, 17F, -3F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 36
		bodyModel[23].setRotationPoint(-131F, -3.5F, -11F);

		bodyModel[24].addBox(0F, -2F, 0F, 40, 2, 1, 0F); // Box 37
		bodyModel[24].setRotationPoint(-131F, -1.5F, -12F);
		bodyModel[24].rotateAngleY = -0.01047198F;
		bodyModel[24].rotateAngleZ = -0.05235988F;

		bodyModel[25].addBox(0F, -2F, 0F, 40, 2, 1, 0F); // Box 38
		bodyModel[25].setRotationPoint(-131F, -1.5F, 11F);
		bodyModel[25].rotateAngleY = 0.01047198F;
		bodyModel[25].rotateAngleZ = -0.05235988F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,0F, 0F, -5.00001F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5.00001F, 0F, -5F, -2.0001F, 0F, 0F, -4.0001F, 0F, 0F, -4.00001F, 0F, -5F, -5.0001F); // Box 43
		bodyModel[26].setRotationPoint(-95F, 11.5F, -6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 83
		bodyModel[27].setRotationPoint(119.5F, -13.5F, -0.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 96
		bodyModel[28].setRotationPoint(-15.7F, -18.5F, 0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F); // Box 97
		bodyModel[29].setRotationPoint(-18.2F, -18.5F, 0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F); // Box 98
		bodyModel[30].setRotationPoint(-15.7F, -18.5F, 2.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F); // Box 99
		bodyModel[31].setRotationPoint(-18.2F, -18.5F, 2.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[32].setRotationPoint(-10.2F, -4F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[33].setRotationPoint(-9.7F, -3.8F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[34].setRotationPoint(-6.2F, -3.8F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[35].setRotationPoint(-65F, -4.8F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 160
		bodyModel[36].setRotationPoint(-63.2F, -5F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 161
		bodyModel[37].setRotationPoint(-63.2F, -5F, -4F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 162
		bodyModel[38].setRotationPoint(-63.2F, -5F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 163
		bodyModel[39].setRotationPoint(-63.2F, -5F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 164
		bodyModel[40].setRotationPoint(-63.2F, -5F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 165
		bodyModel[41].setRotationPoint(-63.2F, -5F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 166
		bodyModel[42].setRotationPoint(-63.2F, -5F, 1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 167
		bodyModel[43].setRotationPoint(-63.2F, -5F, 2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 168
		bodyModel[44].setRotationPoint(-63.2F, -5F, 3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 169
		bodyModel[45].setRotationPoint(-63.2F, -5F, 4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 170
		bodyModel[46].setRotationPoint(-59.7F, -5F, 4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 171
		bodyModel[47].setRotationPoint(-59.7F, -5F, 3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 172
		bodyModel[48].setRotationPoint(-59.7F, -5F, 2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 173
		bodyModel[49].setRotationPoint(-59.7F, -5F, 1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 174
		bodyModel[50].setRotationPoint(-59.7F, -5F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 175
		bodyModel[51].setRotationPoint(-59.7F, -5F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 176
		bodyModel[52].setRotationPoint(-59.7F, -5F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 177
		bodyModel[53].setRotationPoint(-59.7F, -5F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 178
		bodyModel[54].setRotationPoint(-59.7F, -5F, -4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 179
		bodyModel[55].setRotationPoint(-59.7F, -5F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 180
		bodyModel[56].setRotationPoint(-56.7F, -5F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 181
		bodyModel[57].setRotationPoint(-56.7F, -5F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 182
		bodyModel[58].setRotationPoint(-56.7F, -5F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 183
		bodyModel[59].setRotationPoint(-56.7F, -5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 184
		bodyModel[60].setRotationPoint(-56.7F, -5F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 185
		bodyModel[61].setRotationPoint(-56.7F, -5F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 186
		bodyModel[62].setRotationPoint(-56.7F, -5F, 1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 187
		bodyModel[63].setRotationPoint(-56.7F, -5F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 188
		bodyModel[64].setRotationPoint(-56.7F, -5F, 3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 189
		bodyModel[65].setRotationPoint(-56.7F, -5F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 190
		bodyModel[66].setRotationPoint(56F, -2F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 191
		bodyModel[67].setRotationPoint(52.5F, -2F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 192
		bodyModel[68].setRotationPoint(52.5F, -2F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 193
		bodyModel[69].setRotationPoint(52.5F, -2F, 2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 194
		bodyModel[70].setRotationPoint(52.5F, -2F, 1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 195
		bodyModel[71].setRotationPoint(52.5F, -2F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 196
		bodyModel[72].setRotationPoint(52.5F, -2F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 197
		bodyModel[73].setRotationPoint(52.5F, -2F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 198
		bodyModel[74].setRotationPoint(52.5F, -2F, -4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 199
		bodyModel[75].setRotationPoint(56F, -2F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 200
		bodyModel[76].setRotationPoint(56F, -2F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 201
		bodyModel[77].setRotationPoint(56F, -2F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 202
		bodyModel[78].setRotationPoint(52.5F, -2F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 203
		bodyModel[79].setRotationPoint(56F, -2F, -1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 204
		bodyModel[80].setRotationPoint(56F, -2F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 205
		bodyModel[81].setRotationPoint(56F, -2F, 1F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 206
		bodyModel[82].setRotationPoint(56F, -2F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 207
		bodyModel[83].setRotationPoint(56F, -2F, 3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 208
		bodyModel[84].setRotationPoint(56F, -2F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 209
		bodyModel[85].setRotationPoint(52.5F, -2F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 210
		bodyModel[86].setRotationPoint(59F, -2F, -5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 211
		bodyModel[87].setRotationPoint(59F, -2F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 212
		bodyModel[88].setRotationPoint(59F, -2F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 213
		bodyModel[89].setRotationPoint(59F, -2F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[90].setRotationPoint(50.7F, -1.8F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 215
		bodyModel[91].setRotationPoint(59F, -2F, 4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 216
		bodyModel[92].setRotationPoint(59F, -2F, 3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 217
		bodyModel[93].setRotationPoint(59F, -2F, 2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 218
		bodyModel[94].setRotationPoint(59F, -2F, 1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 219
		bodyModel[95].setRotationPoint(59F, -2F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 220
		bodyModel[96].setRotationPoint(59F, -2F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 223
		bodyModel[97].setRotationPoint(73.5F, -4F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 224
		bodyModel[98].setRotationPoint(76.5F, -4F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F); // Box 225
		bodyModel[99].setRotationPoint(73.5F, -4F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0.5F); // Box 226
		bodyModel[100].setRotationPoint(76.5F, -4F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.8F, 1F, -0.8F, -0.8F, 1F, -0.8F, -0.8F, 1F, -0.8F, -0.8F, 1F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 228
		bodyModel[101].setRotationPoint(74F, -5F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 257
		bodyModel[102].setRotationPoint(-48F, -18F, -8.5F);
		bodyModel[102].rotateAngleZ = 0.10471976F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 258
		bodyModel[103].setRotationPoint(-48F, -18F, 7.5F);
		bodyModel[103].rotateAngleZ = 0.10471976F;

		bodyModel[104].addShapeBox(-1F, 0F, -1F, 3, 10, 2, 0F,1.5F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, -0.3F, 1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 262
		bodyModel[104].setRotationPoint(-120.5F, 6F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 308
		bodyModel[105].setRotationPoint(-111F, 13F, 5F);
		bodyModel[105].rotateAngleZ = 0.05235988F;

		bodyModel[106].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[106].setRotationPoint(-103F, 13.5F, 5.5F);
		bodyModel[106].rotateAngleX = 4.1887902F;
		bodyModel[106].rotateAngleZ = 0.05235988F;

		bodyModel[107].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[107].setRotationPoint(-103F, 13.5F, 5.5F);
		bodyModel[107].rotateAngleX = 2.0943951F;
		bodyModel[107].rotateAngleZ = 0.05235988F;

		bodyModel[108].addShapeBox(-10F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[108].setRotationPoint(-104F, 13F, 5F);
		bodyModel[108].rotateAngleZ = 0.05235988F;

		bodyModel[109].addShapeBox(-10F, -1.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[109].setRotationPoint(-103F, 12.5F, 5.5F);
		bodyModel[109].rotateAngleZ = 0.05235988F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 268
		bodyModel[110].setRotationPoint(-111F, 13F, -6F);
		bodyModel[110].rotateAngleZ = 0.05235988F;

		bodyModel[111].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[111].setRotationPoint(-103F, 13.5F, -5.5F);
		bodyModel[111].rotateAngleX = 4.1887902F;
		bodyModel[111].rotateAngleZ = 0.05235988F;

		bodyModel[112].addShapeBox(-10F, -2.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[112].setRotationPoint(-103F, 13.5F, -5.5F);
		bodyModel[112].rotateAngleX = 2.0943951F;
		bodyModel[112].rotateAngleZ = 0.05235988F;

		bodyModel[113].addShapeBox(-10F, 0F, 0F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[113].setRotationPoint(-104F, 13F, -6F);
		bodyModel[113].rotateAngleZ = 0.05235988F;

		bodyModel[114].addShapeBox(-10F, -1.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[114].setRotationPoint(-103F, 12.5F, -5.5F);
		bodyModel[114].rotateAngleZ = 0.05235988F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 273
		bodyModel[115].setRotationPoint(-108F, 8F, 5F);
		bodyModel[115].rotateAngleZ = 0.05235988F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 274
		bodyModel[116].setRotationPoint(-108F, 8F, -6F);
		bodyModel[116].rotateAngleZ = 0.05235988F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F); // Box 272
		bodyModel[117].setRotationPoint(-15.7F, -18.5F, -3.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F); // Box 273
		bodyModel[118].setRotationPoint(-18.2F, -18.5F, -3.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.25F, 0F, 0F, -0.95F, 0F, -0.7F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.3F, -1.25F, 0F, -1F, -0.55F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 274
		bodyModel[119].setRotationPoint(-15.7F, -18.5F, -5.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,-0.95F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1.25F, 0F, -1F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.5F, -0.55F, 0F, -0.5F); // Box 275
		bodyModel[120].setRotationPoint(-18.2F, -18.5F, -5.5F);

		bodyModel[121].addShapeBox(-1F, 0F, -1F, 3, 10, 2, 0F,1.5F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, -0.3F, 1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 276
		bodyModel[121].setRotationPoint(-120.5F, 6F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 7, 26, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 277
		bodyModel[122].setRotationPoint(41F, -0.5F, -13F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 20, 12, 24, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 1.5F, -0.8F, 1F, 1.5F, -0.8F, 1F, 1.5F, -0.8F, 1F, 1.5F, -0.8F, 1F); // Box 279
		bodyModel[123].setRotationPoint(8F, -15.5F, -12F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 2, 23, 0F,0F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[124].setRotationPoint(18F, -17.5F, -11.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 6, 13, 22, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, -5.5F, 0F, 0.5F, -5.5F, 0F, 0.5F, 0.3F, -3F, 0F, 2F, 3F, 0F, -4F, 3F, 0F, -4F, -3F, 0F, 2F); // Box 281
		bodyModel[125].setRotationPoint(26.5F, -17.5F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 12, 24, 0F,-0.5F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -3.5F, 0.5F, -0.8F, -2F, -1.5F, -0.8F, 1F, -1.5F, -0.8F, 1F, 0.5F, -0.8F, -2F); // Box 282
		bodyModel[126].setRotationPoint(2F, -15.5F, -12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 10, 5, 19, 0F,0F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[127].setRotationPoint(17.5F, -20F, -9.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 5, 19, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 284
		bodyModel[128].setRotationPoint(14.5F, -20F, -9.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 12, 5, 15, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 285
		bodyModel[129].setRotationPoint(3F, -20F, -7.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 15, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.8F, 0F, 2.3F, 1.5F, 0F, 2.3F, 1.5F, 0F, 2.3F, 0.8F, 0F, 2.3F); // Box 286
		bodyModel[130].setRotationPoint(4F, -34.5F, -2.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 2, 19, 0F,-1.3F, 0F, 0F, 0.6F, 0F, -4F, 0.6F, 0F, -4F, -1.3F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -0.9F, 0F, 0F); // Box 287
		bodyModel[131].setRotationPoint(27.5F, -20F, -9.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 19, 0F,-1.3F, 0F, 0F, 0.8F, 0F, -4F, 0.8F, 0F, -4F, -1.3F, 0F, 0F, -1.25F, -0.7F, 0F, 0.8F, -0.7F, -4F, 0.8F, -0.7F, -4F, -1.25F, -0.7F, 0F); // Box 288
		bodyModel[132].setRotationPoint(27.5F, -20F, -9.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F); // Box 289
		bodyModel[133].setRotationPoint(-1F, -8.5F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 4, 24, 0F,0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0.3F, -3F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0.3F, -3F); // Box 290
		bodyModel[134].setRotationPoint(-3F, -8.5F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 6, 18, 0F,0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F); // Box 291
		bodyModel[135].setRotationPoint(-6F, -10.5F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[136].setRotationPoint(-11.5F, -11.5F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 11, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 1F); // Box 293
		bodyModel[137].setRotationPoint(33.5F, -9.5F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -6F, 1F, 0F, -6F, 0F, 0F, -0.5F); // Box 294
		bodyModel[138].setRotationPoint(41F, -4.5F, -13F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 25, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 2F, 0F, 0F); // Box 295
		bodyModel[139].setRotationPoint(52F, -4.5F, -12.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 25, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, -1F, 2F, 0F, 0F); // Box 296
		bodyModel[140].setRotationPoint(52F, -4.5F, 11.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 5F, 0F, -2F, -5F, 0F, 0F, 0F); // Box 297
		bodyModel[141].setRotationPoint(77F, -5.5F, 10.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 27, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, 5F, 0F, 0F, 0F); // Box 298
		bodyModel[142].setRotationPoint(77F, -5.5F, -11.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -6F, 0F, -1.5F, 6F, 0F, 0F, 0F); // Box 299
		bodyModel[143].setRotationPoint(104F, -6.5F, -6.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 6F, 0F, -1.5F, -6F, 0F, 0F, 0F); // Box 300
		bodyModel[144].setRotationPoint(104F, -6.5F, 5.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 18, 4, 12, 0F,0F, 0F, -5.00001F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, -5.00001F, 0F, -3.9F, -2.0001F, 0F, 0F, -4.0001F, 0F, 0F, -4.00001F, 0F, -3.9F, -5.0001F); // Box 301
		bodyModel[145].setRotationPoint(-95F, 11.5F, -6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 6, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 302
		bodyModel[146].setRotationPoint(-18.5F, -14.5F, -6.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 6, 11, 13, 0F,0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Box 303
		bodyModel[147].setRotationPoint(-24.5F, -14.5F, -6.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, 4F, 0F, 5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -4F, 0F, 5F, -2F, 0F); // Box 304
		bodyModel[148].setRotationPoint(-28F, 14.5F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 34, 1, 4, 0F,5F, 2F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[149].setRotationPoint(-28F, 14.5F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[150].setRotationPoint(17.2F, -23.5F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[151].setRotationPoint(17.2F, -23.5F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 308
		bodyModel[152].setRotationPoint(17.2F, -23.5F, 1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 309
		bodyModel[153].setRotationPoint(17.2F, -26F, 1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 310
		bodyModel[154].setRotationPoint(17.2F, -26F, -3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 311
		bodyModel[155].setRotationPoint(17.2F, -26F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[156].setRotationPoint(15.2F, -23F, -7.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[157].setRotationPoint(15.2F, -23F, 5.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0F, 1.5F, -0.2F, 0F, 2.3F, 0.5F, 0F, 2.3F, 0.5F, 0F, 2.3F, -0.2F, 0F, 2.3F); // Box 314
		bodyModel[158].setRotationPoint(9F, -24F, -2.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 315
		bodyModel[159].setRotationPoint(3.5F, -39F, 1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 316
		bodyModel[160].setRotationPoint(3.5F, -37.5F, 1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[161].setRotationPoint(3.5F, -37.5F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 318
		bodyModel[162].setRotationPoint(3.5F, -39F, -1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[163].setRotationPoint(3.5F, -37.5F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 320
		bodyModel[164].setRotationPoint(3.5F, -39F, -3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 321
		bodyModel[165].setRotationPoint(-51F, -8F, -8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 5, 16, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 1F); // Box 322
		bodyModel[166].setRotationPoint(-32F, -8F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 29, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0.5F); // Box 323
		bodyModel[167].setRotationPoint(-95.5F, -7.5F, -12F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 26, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 324
		bodyModel[168].setRotationPoint(-95F, -10.5F, -5.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 66, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, -0.5F, 1F, 1F, -0.5F, -1F, 1F, 0F, -0.5F); // Box 325
		bodyModel[169].setRotationPoint(-66.5F, -5.5F, -12F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 66, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, -0.5F, -1F, 1F, -0.5F, 1F, 1F, 0F, 0.5F); // Box 326
		bodyModel[170].setRotationPoint(-66.5F, -5.5F, 11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 1F, 0F, 1F); // Box 185
		bodyModel[171].setRotationPoint(-39.5F, -15.5F, -3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[172].setRotationPoint(-39F, -20.5F, -0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 187
		bodyModel[173].setRotationPoint(-39F, -20.5F, -4.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 188
		bodyModel[174].setRotationPoint(-41.5F, -22.5F, -5.2F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 189
		bodyModel[175].setRotationPoint(-41.5F, -18.5F, -5.2F);

		bodyModel[176].addShapeBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 190
		bodyModel[176].setRotationPoint(-38.5F, -20F, -4.2F);
		bodyModel[176].rotateAngleZ = 0.62831853F;

		bodyModel[177].addShapeBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 191
		bodyModel[177].setRotationPoint(-38.5F, -20F, -4.2F);
		bodyModel[177].rotateAngleZ = -0.62831853F;

		bodyModel[178].addShapeBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 192
		bodyModel[178].setRotationPoint(-38.5F, -20F, 4.2F);
		bodyModel[178].rotateAngleZ = -0.62831853F;

		bodyModel[179].addShapeBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 193
		bodyModel[179].setRotationPoint(-38.5F, -20F, 4.2F);
		bodyModel[179].rotateAngleZ = 0.62831853F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 194
		bodyModel[180].setRotationPoint(-41.5F, -22.5F, 3.2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 195
		bodyModel[181].setRotationPoint(-41.5F, -18.5F, 3.2F);

		bodyModel[182].addShapeBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 196
		bodyModel[182].setRotationPoint(-38.5F, -20F, 1.6F);
		bodyModel[182].rotateAngleZ = -0.62831853F;

		bodyModel[183].addShapeBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 197
		bodyModel[183].setRotationPoint(-38.5F, -20F, 1.6F);
		bodyModel[183].rotateAngleZ = 0.62831853F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 198
		bodyModel[184].setRotationPoint(-41.5F, -22.5F, 0.6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 199
		bodyModel[185].setRotationPoint(-41.5F, -18.5F, 0.6F);

		bodyModel[186].addShapeBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 200
		bodyModel[186].setRotationPoint(-38.5F, -20F, -1.6F);
		bodyModel[186].rotateAngleZ = -0.62831853F;

		bodyModel[187].addShapeBox(-3.5F, -0.5F, -0.5F, 7, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 201
		bodyModel[187].setRotationPoint(-38.5F, -20F, -1.6F);
		bodyModel[187].rotateAngleZ = 0.62831853F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 202
		bodyModel[188].setRotationPoint(-41.5F, -22.5F, -2.6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 203
		bodyModel[189].setRotationPoint(-41.5F, -18.5F, -2.6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[190].setRotationPoint(5.5F, -35F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 3F, 0F, -0.2F, 3F, 0F); // Box 205
		bodyModel[191].setRotationPoint(5.5F, -35F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -3.3F, 0F, -0.2F, -3.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 3F, 0F, -0.2F, 3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 206
		bodyModel[192].setRotationPoint(5.5F, -35F, 1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 207
		bodyModel[193].setRotationPoint(8F, -35F, -2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 208
		bodyModel[194].setRotationPoint(2.5F, -42.5F, -0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 209
		bodyModel[195].setRotationPoint(2.5F, -48.5F, -0.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[196].setRotationPoint(38F, -10F, -2.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[197].setRotationPoint(38F, -10.6F, -2.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[198].setRotationPoint(0.5F, -35F, -2.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[199].setRotationPoint(11.2F, -27F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[200].setRotationPoint(13F, -28F, -1.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 46, 24, 1, 0F,-20F, -10F, -0.35F, -20F, -10F, -0.35F, -20F, -10F, -0.35F, -20F, -10F, -0.35F, -20F, -10F, -0.35F, -20F, -10F, -0.35F, -20F, -10F, -0.35F, -20F, -10F, -0.35F); // Box 220
		bodyModel[201].setRotationPoint(93.8F, -23.5F, -0.5F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[3];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 212
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Box 213
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 214

		gun_1_Model[0][0].addShapeBox(-1F, -2F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 212

		gun_1_Model[0][1].addShapeBox(-1.5F, -1F, -2F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213

		gun_1_Model[0][2].addShapeBox(-1.5F, -1F, 1F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 214

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(40.5F, -11.9F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[2];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 513, 57, textureX, textureY); // Box 215
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 216

		gun_1_Model[2][0].addShapeBox(1F, -0.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, 0F, 0F); // Box 215

		gun_1_Model[2][1].addShapeBox(3F, -0.6F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 216

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(40.5F, -11.9F, 0F);
		}


		registerGunModel("CIWS", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[5];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 229
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 230
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 233
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 234
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 278

		gun_2_Model[0][0].addShapeBox(-2F, -3.5F, -2F, 3, 5, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 229

		gun_2_Model[0][1].addShapeBox(1.5F, -3.5F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 230

		gun_2_Model[0][2].addShapeBox(-3F, -3.5F, -2F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 233

		gun_2_Model[0][3].addShapeBox(-3F, -0.5F, -2F, 1, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234

		gun_2_Model[0][4].addShapeBox(1.5F, -1.5F, -2F, 2, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 278

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(76F, -5.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[1];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 235

		gun_2_Model[2][0].addShapeBox(-2F, -2.3F, -0.5F, 16, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 235

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(76F, -5.5F, 0F);
		}


		registerGunModel("Cannon", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[0];

		gun_3_Model[1] = new ModelRendererTurbo[3];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 238
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 240
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 241

		gun_3_Model[1][0].addShapeBox(-1F, 0F, -2.5F, 2, 4, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 238

		gun_3_Model[1][1].addShapeBox(-1F, 0F, 0.5F, 2, 4, 1, 0F,-0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 240

		gun_3_Model[1][2].addShapeBox(-2F, -1F, -1F, 4, 2, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 241

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-75F, -14F, 0.5F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RIM", gun_3_Model);
	}
}