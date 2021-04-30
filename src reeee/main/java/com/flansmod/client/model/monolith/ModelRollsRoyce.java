//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.06.2016 - 11:20:48
// Last changed on: 16.06.2016 - 11:20:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRollsRoyce extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRollsRoyce() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[400];
		bodyDoorOpenModel = new ModelRendererTurbo[4];
		bodyDoorCloseModel = new ModelRendererTurbo[4];
		turretModel = new ModelRendererTurbo[63];
		barrelModel = new ModelRendererTurbo[76];
		leftFrontWheelModel = new ModelRendererTurbo[28];
		rightFrontWheelModel = new ModelRendererTurbo[25];
		leftBackWheelModel = new ModelRendererTurbo[44];
		rightBackWheelModel = new ModelRendererTurbo[44];
		steeringWheelModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();
		initsteeringWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 63
		bodyModel[1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 64
		bodyModel[2] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 65
		bodyModel[3] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 66
		bodyModel[4] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 67
		bodyModel[5] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 68
		bodyModel[6] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 65
		bodyModel[7] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 66
		bodyModel[8] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 76
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 77
		bodyModel[10] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 78
		bodyModel[11] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 79
		bodyModel[12] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 80
		bodyModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 81
		bodyModel[14] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 82
		bodyModel[15] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 83
		bodyModel[16] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 84
		bodyModel[17] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 85
		bodyModel[18] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 86
		bodyModel[19] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 87
		bodyModel[20] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 88
		bodyModel[21] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 89
		bodyModel[22] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 90
		bodyModel[23] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 91
		bodyModel[24] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 92
		bodyModel[25] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 93
		bodyModel[26] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 94
		bodyModel[27] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 95
		bodyModel[28] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 111
		bodyModel[29] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 112
		bodyModel[30] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 113
		bodyModel[31] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 114
		bodyModel[32] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 115
		bodyModel[33] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 116
		bodyModel[34] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 117
		bodyModel[35] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 118
		bodyModel[36] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 119
		bodyModel[37] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 120
		bodyModel[38] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 121
		bodyModel[39] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 122
		bodyModel[40] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 123
		bodyModel[41] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 124
		bodyModel[42] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 125
		bodyModel[43] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 126
		bodyModel[44] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 127
		bodyModel[45] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 129
		bodyModel[47] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 130
		bodyModel[48] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 131
		bodyModel[49] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 132
		bodyModel[50] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 133
		bodyModel[51] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 134
		bodyModel[52] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 137
		bodyModel[53] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 138
		bodyModel[54] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 145
		bodyModel[55] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 146
		bodyModel[56] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 147
		bodyModel[57] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 148
		bodyModel[58] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 149
		bodyModel[59] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 150
		bodyModel[60] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 151
		bodyModel[61] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 152
		bodyModel[62] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 153
		bodyModel[63] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 155
		bodyModel[64] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 156
		bodyModel[65] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 157
		bodyModel[66] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 159
		bodyModel[67] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 161
		bodyModel[68] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 162
		bodyModel[69] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 164
		bodyModel[70] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 166
		bodyModel[71] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 170
		bodyModel[72] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 171
		bodyModel[73] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 172
		bodyModel[74] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 173
		bodyModel[75] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 174
		bodyModel[76] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 202
		bodyModel[77] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 203
		bodyModel[78] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 204
		bodyModel[79] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 205
		bodyModel[80] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 206
		bodyModel[81] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 207
		bodyModel[82] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 208
		bodyModel[83] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 209
		bodyModel[84] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 210
		bodyModel[85] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 211
		bodyModel[86] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 212
		bodyModel[87] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 213
		bodyModel[88] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 214
		bodyModel[89] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 215
		bodyModel[90] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 216
		bodyModel[91] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 217
		bodyModel[92] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 218
		bodyModel[93] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 219
		bodyModel[94] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 220
		bodyModel[95] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 221
		bodyModel[96] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 222
		bodyModel[97] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 223
		bodyModel[98] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 224
		bodyModel[99] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 225
		bodyModel[100] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 226
		bodyModel[101] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 227
		bodyModel[102] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 228
		bodyModel[103] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 229
		bodyModel[104] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 230
		bodyModel[105] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 231
		bodyModel[106] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 232
		bodyModel[107] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 233
		bodyModel[108] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 234
		bodyModel[109] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 235
		bodyModel[110] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 236
		bodyModel[111] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 237
		bodyModel[112] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 238
		bodyModel[113] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 239
		bodyModel[114] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 240
		bodyModel[115] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 241
		bodyModel[116] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 242
		bodyModel[117] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 243
		bodyModel[118] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 244
		bodyModel[119] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 245
		bodyModel[120] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 246
		bodyModel[121] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 247
		bodyModel[122] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 248
		bodyModel[123] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 249
		bodyModel[124] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 250
		bodyModel[125] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 251
		bodyModel[126] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 252
		bodyModel[127] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 253
		bodyModel[128] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 254
		bodyModel[129] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 255
		bodyModel[130] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 256
		bodyModel[131] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 257
		bodyModel[132] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 258
		bodyModel[133] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 259
		bodyModel[134] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 260
		bodyModel[135] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 261
		bodyModel[136] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 262
		bodyModel[137] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 263
		bodyModel[138] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 264
		bodyModel[139] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 265
		bodyModel[140] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 266
		bodyModel[141] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 267
		bodyModel[142] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 268
		bodyModel[143] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 269
		bodyModel[144] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 270
		bodyModel[145] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 271
		bodyModel[146] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 272
		bodyModel[147] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 273
		bodyModel[148] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 274
		bodyModel[149] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 275
		bodyModel[150] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 276
		bodyModel[151] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 277
		bodyModel[152] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 249
		bodyModel[153] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 250
		bodyModel[154] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 251
		bodyModel[155] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 252
		bodyModel[156] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 253
		bodyModel[157] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 254
		bodyModel[158] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 255
		bodyModel[159] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 256
		bodyModel[160] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 257
		bodyModel[161] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 258
		bodyModel[162] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 259
		bodyModel[163] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 260
		bodyModel[164] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 261
		bodyModel[165] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 262
		bodyModel[166] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 263
		bodyModel[167] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 264
		bodyModel[168] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 265
		bodyModel[169] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 266
		bodyModel[170] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 267
		bodyModel[171] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 268
		bodyModel[172] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 269
		bodyModel[173] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 270
		bodyModel[174] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 271
		bodyModel[175] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 272
		bodyModel[176] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 273
		bodyModel[177] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 274
		bodyModel[178] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 275
		bodyModel[179] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 276
		bodyModel[180] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 277
		bodyModel[181] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 278
		bodyModel[182] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 279
		bodyModel[183] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 280
		bodyModel[184] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 281
		bodyModel[185] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 282
		bodyModel[186] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 283
		bodyModel[187] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 284
		bodyModel[188] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 285
		bodyModel[189] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 286
		bodyModel[190] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 287
		bodyModel[191] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 288
		bodyModel[192] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 289
		bodyModel[193] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 290
		bodyModel[194] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 291
		bodyModel[195] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 292
		bodyModel[196] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 293
		bodyModel[197] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 294
		bodyModel[198] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 295
		bodyModel[199] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 296
		bodyModel[200] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 301
		bodyModel[201] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 312
		bodyModel[202] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 313
		bodyModel[203] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 314
		bodyModel[204] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 315
		bodyModel[205] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 316
		bodyModel[206] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 317
		bodyModel[207] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 318
		bodyModel[208] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 319
		bodyModel[209] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 320
		bodyModel[210] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 321
		bodyModel[211] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 322
		bodyModel[212] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 323
		bodyModel[213] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 330
		bodyModel[214] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 331
		bodyModel[215] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 334
		bodyModel[216] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 335
		bodyModel[217] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 336
		bodyModel[218] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 337
		bodyModel[219] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 338
		bodyModel[220] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 339
		bodyModel[221] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 340
		bodyModel[222] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 341
		bodyModel[223] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 342
		bodyModel[224] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 343
		bodyModel[225] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 344
		bodyModel[226] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 345
		bodyModel[227] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 346
		bodyModel[228] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 347
		bodyModel[229] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 348
		bodyModel[230] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 349
		bodyModel[231] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 350
		bodyModel[232] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 351
		bodyModel[233] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 352
		bodyModel[234] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 353
		bodyModel[235] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 354
		bodyModel[236] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 355
		bodyModel[237] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 356
		bodyModel[238] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 357
		bodyModel[239] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 358
		bodyModel[240] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 359
		bodyModel[241] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 360
		bodyModel[242] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 361
		bodyModel[243] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 362
		bodyModel[244] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 363
		bodyModel[245] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 364
		bodyModel[246] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 365
		bodyModel[247] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 366
		bodyModel[248] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 367
		bodyModel[249] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 368
		bodyModel[250] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 369
		bodyModel[251] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 370
		bodyModel[252] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 371
		bodyModel[253] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 372
		bodyModel[254] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 373
		bodyModel[255] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 374
		bodyModel[256] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 375
		bodyModel[257] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 376
		bodyModel[258] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 377
		bodyModel[259] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 378
		bodyModel[260] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 379
		bodyModel[261] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 380
		bodyModel[262] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 381
		bodyModel[263] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 362
		bodyModel[264] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 363
		bodyModel[265] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 364
		bodyModel[266] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 365
		bodyModel[267] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 366
		bodyModel[268] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 367
		bodyModel[269] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 368
		bodyModel[270] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 369
		bodyModel[271] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 370
		bodyModel[272] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 371
		bodyModel[273] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 363
		bodyModel[274] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Box 364
		bodyModel[275] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 365
		bodyModel[276] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 366
		bodyModel[277] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 367
		bodyModel[278] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 369
		bodyModel[279] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 370
		bodyModel[280] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 371
		bodyModel[281] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 372
		bodyModel[282] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 373
		bodyModel[283] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 374
		bodyModel[284] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 377
		bodyModel[285] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 378
		bodyModel[286] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 379
		bodyModel[287] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 380
		bodyModel[288] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 381
		bodyModel[289] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 382
		bodyModel[290] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 384
		bodyModel[291] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 385
		bodyModel[292] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 386
		bodyModel[293] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 387
		bodyModel[294] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 386
		bodyModel[295] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 387
		bodyModel[296] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 388
		bodyModel[297] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 389
		bodyModel[298] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 390
		bodyModel[299] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 391
		bodyModel[300] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 392
		bodyModel[301] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 393
		bodyModel[302] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 394
		bodyModel[303] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 395
		bodyModel[304] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 396
		bodyModel[305] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 397
		bodyModel[306] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 398
		bodyModel[307] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 399
		bodyModel[308] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 400
		bodyModel[309] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 401
		bodyModel[310] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 402
		bodyModel[311] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 403
		bodyModel[312] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 404
		bodyModel[313] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 405
		bodyModel[314] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 406
		bodyModel[315] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 407
		bodyModel[316] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 408
		bodyModel[317] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 409
		bodyModel[318] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 410
		bodyModel[319] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 411
		bodyModel[320] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 412
		bodyModel[321] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 420
		bodyModel[322] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 421
		bodyModel[323] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 554
		bodyModel[324] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 557
		bodyModel[325] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 558
		bodyModel[326] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 559
		bodyModel[327] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 560
		bodyModel[328] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 561
		bodyModel[329] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 562
		bodyModel[330] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 563
		bodyModel[331] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 564
		bodyModel[332] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 565
		bodyModel[333] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 566
		bodyModel[334] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 567
		bodyModel[335] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 568
		bodyModel[336] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 569
		bodyModel[337] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 570
		bodyModel[338] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 571
		bodyModel[339] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 572
		bodyModel[340] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 573
		bodyModel[341] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 574
		bodyModel[342] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 575
		bodyModel[343] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 576
		bodyModel[344] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 577
		bodyModel[345] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 578
		bodyModel[346] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 579
		bodyModel[347] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Box 912
		bodyModel[348] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 913
		bodyModel[349] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 422
		bodyModel[350] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 476
		bodyModel[351] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 477
		bodyModel[352] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 478
		bodyModel[353] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 479
		bodyModel[354] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 480
		bodyModel[355] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 481
		bodyModel[356] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 482
		bodyModel[357] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 483
		bodyModel[358] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 484
		bodyModel[359] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 485
		bodyModel[360] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 486
		bodyModel[361] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 487
		bodyModel[362] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 488
		bodyModel[363] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 489
		bodyModel[364] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 490
		bodyModel[365] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 491
		bodyModel[366] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 492
		bodyModel[367] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 493
		bodyModel[368] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 494
		bodyModel[369] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 495
		bodyModel[370] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 496
		bodyModel[371] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 497
		bodyModel[372] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 498
		bodyModel[373] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 499
		bodyModel[374] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 500
		bodyModel[375] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 501
		bodyModel[376] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 502
		bodyModel[377] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 503
		bodyModel[378] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 504
		bodyModel[379] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 505
		bodyModel[380] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 506
		bodyModel[381] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 507
		bodyModel[382] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 508
		bodyModel[383] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 509
		bodyModel[384] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 510
		bodyModel[385] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 511
		bodyModel[386] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 512
		bodyModel[387] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 513
		bodyModel[388] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 514
		bodyModel[389] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 515
		bodyModel[390] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 516
		bodyModel[391] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 517
		bodyModel[392] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 518
		bodyModel[393] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 519
		bodyModel[394] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 592
		bodyModel[395] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 593
		bodyModel[396] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Box 594
		bodyModel[397] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 595
		bodyModel[398] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 596
		bodyModel[399] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 597

		bodyModel[0].addBox(0F, 0F, -13F, 1, 1, 26, 0F); // Box 63
		bodyModel[0].setRotationPoint(17F, -24F, 0F);
		bodyModel[0].rotateAngleZ = 0.06981317F;

		bodyModel[1].addBox(0F, 4F, -13F, 1, 1, 26, 0F); // Box 64
		bodyModel[1].setRotationPoint(17F, -25F, 0F);
		bodyModel[1].rotateAngleZ = 0.06981317F;

		bodyModel[2].addShapeBox(0F, 2F, -3F, 1, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[2].setRotationPoint(17F, -25F, 0F);
		bodyModel[2].rotateAngleZ = 0.06981317F;

		bodyModel[3].addShapeBox(0F, 2F, -13F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[3].setRotationPoint(17F, -25F, 0F);
		bodyModel[3].rotateAngleZ = 0.06981317F;

		bodyModel[4].addShapeBox(0F, 2F, 9F, 1, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 67
		bodyModel[4].setRotationPoint(17F, -25F, 0F);
		bodyModel[4].rotateAngleZ = 0.06981317F;

		bodyModel[5].addBox(13F, 0F, -13F, 5, 1, 26, 0F); // Box 68
		bodyModel[5].setRotationPoint(0F, -25F, 0F);

		bodyModel[6].addShapeBox(7F, 0F, -13F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 65
		bodyModel[6].setRotationPoint(0F, -25F, 0F);

		bodyModel[7].addShapeBox(7F, 0F, 5F, 6, 1, 8, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[7].setRotationPoint(0F, -25F, 0F);

		bodyModel[8].addShapeBox(-1F, 1F, -0.5F, 30, 1, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 76
		bodyModel[8].setRotationPoint(28F, -20F, 0F);

		bodyModel[9].addShapeBox(0F, 5F, 6.5F, 29, 14, 1, 0F,0F, -0.5F, -2F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 77
		bodyModel[9].setRotationPoint(28F, -20F, 0F);

		bodyModel[10].addShapeBox(0F, 5F, -7.5F, 29, 14, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 78
		bodyModel[10].setRotationPoint(28F, -20F, 0F);

		bodyModel[11].addShapeBox(-10F, 0F, -14.5F, 9, 1, 29, 0F,0F, 0F, -0.5F, 0F, -1F, -14F, 0F, -1F, -14F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 1F, -14F, 0F, 1F, -14F, 0F, 0F, -1F); // Box 79
		bodyModel[11].setRotationPoint(28F, -20F, 0F);

		bodyModel[12].addShapeBox(0F, 1F, 0.5F, 29, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -3F, 0F, 3.5F, -1F); // Box 80
		bodyModel[12].setRotationPoint(28F, -20F, 0F);

		bodyModel[13].addShapeBox(0F, 1F, -9.5F, 29, 1, 9, 0F,0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -1F, 0F, 3.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[13].setRotationPoint(28F, -20F, 0F);

		bodyModel[14].addShapeBox(-10F, 0F, -14.5F, 10, 1, 14, 0F,0F, 0F, -0.5F, 0F, -5F, -5F, 0F, -1F, 0F, -9F, -1F, 0F, 0F, 0F, -1F, 0F, 5F, -5.5F, 0F, 1F, 0F, -9F, 1F, 0F); // Box 82
		bodyModel[14].setRotationPoint(28F, -20F, 0F);

		bodyModel[15].addShapeBox(-10F, 0F, 0.5F, 10, 1, 14, 0F,-9F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -5F, 0F, 0F, -0.5F, -9F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, -5.5F, 0F, 0F, -1F); // Box 83
		bodyModel[15].setRotationPoint(28F, -20F, 0F);

		bodyModel[16].addShapeBox(2F, 0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[16].setRotationPoint(28F, -20F, 0F);

		bodyModel[17].addShapeBox(2F, 0.6F, -2.5F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[17].setRotationPoint(28F, -20F, 0F);

		bodyModel[18].addShapeBox(2F, 0.6F, 0.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 86
		bodyModel[18].setRotationPoint(28F, -20F, 0F);

		bodyModel[19].addShapeBox(10F, 0.6F, 0.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 87
		bodyModel[19].setRotationPoint(28F, -20F, 0F);

		bodyModel[20].addShapeBox(10F, 0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[20].setRotationPoint(28F, -20F, 0F);

		bodyModel[21].addShapeBox(10F, 0.6F, -2.5F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[21].setRotationPoint(28F, -20F, 0F);

		bodyModel[22].addShapeBox(18F, 0.6F, 0.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 90
		bodyModel[22].setRotationPoint(28F, -20F, 0F);

		bodyModel[23].addShapeBox(18F, 0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[23].setRotationPoint(28F, -20F, 0F);

		bodyModel[24].addShapeBox(18F, 0.6F, -2.5F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[24].setRotationPoint(28F, -20F, 0F);

		bodyModel[25].addShapeBox(26F, 0.6F, 0.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 93
		bodyModel[25].setRotationPoint(28F, -20F, 0F);

		bodyModel[26].addShapeBox(26F, 0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[26].setRotationPoint(28F, -20F, 0F);

		bodyModel[27].addShapeBox(26F, 0.6F, -2.5F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[27].setRotationPoint(28F, -20F, 0F);

		bodyModel[28].addShapeBox(2F, -5.8F, 9.6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 111
		bodyModel[28].setRotationPoint(28F, -20F, 0F);
		bodyModel[28].rotateAngleX = -1.04719755F;
		bodyModel[28].rotateAngleY = -0.06632251F;

		bodyModel[29].addShapeBox(2F, -5.9F, 8.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[29].setRotationPoint(28F, -20F, 0F);
		bodyModel[29].rotateAngleX = -1.04719755F;
		bodyModel[29].rotateAngleY = -0.06632251F;

		bodyModel[30].addShapeBox(2F, -5.8F, 6.6F, 2, 1, 2, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[30].setRotationPoint(28F, -20F, 0F);
		bodyModel[30].rotateAngleX = -1.04719755F;
		bodyModel[30].rotateAngleY = -0.06632251F;

		bodyModel[31].addShapeBox(10F, -5.8F, 9.6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 114
		bodyModel[31].setRotationPoint(28F, -20F, 0F);
		bodyModel[31].rotateAngleX = -1.04719755F;
		bodyModel[31].rotateAngleY = -0.06632251F;

		bodyModel[32].addShapeBox(10F, -5.9F, 8.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[32].setRotationPoint(28F, -20F, 0F);
		bodyModel[32].rotateAngleX = -1.04719755F;
		bodyModel[32].rotateAngleY = -0.06632251F;

		bodyModel[33].addShapeBox(10F, -5.8F, 6.6F, 2, 1, 2, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[33].setRotationPoint(28F, -20F, 0F);
		bodyModel[33].rotateAngleX = -1.04719755F;
		bodyModel[33].rotateAngleY = -0.06632251F;

		bodyModel[34].addShapeBox(18F, -5.8F, 9.6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 117
		bodyModel[34].setRotationPoint(28F, -20F, 0F);
		bodyModel[34].rotateAngleX = -1.04719755F;
		bodyModel[34].rotateAngleY = -0.06632251F;

		bodyModel[35].addShapeBox(18F, -5.9F, 8.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[35].setRotationPoint(28F, -20F, 0F);
		bodyModel[35].rotateAngleX = -1.04719755F;
		bodyModel[35].rotateAngleY = -0.06632251F;

		bodyModel[36].addShapeBox(18F, -5.8F, 6.6F, 2, 1, 2, 0F,0F, -1.4F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[36].setRotationPoint(28F, -20F, 0F);
		bodyModel[36].rotateAngleX = -1.04719755F;
		bodyModel[36].rotateAngleY = -0.06632251F;

		bodyModel[37].addShapeBox(26F, -5.8F, 9.6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 120
		bodyModel[37].setRotationPoint(28F, -20F, 0F);
		bodyModel[37].rotateAngleX = -1.04719755F;
		bodyModel[37].rotateAngleY = -0.06632251F;

		bodyModel[38].addShapeBox(26F, -5.9F, 8.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[38].setRotationPoint(28F, -20F, 0F);
		bodyModel[38].rotateAngleX = -1.04719755F;
		bodyModel[38].rotateAngleY = -0.06632251F;

		bodyModel[39].addShapeBox(26F, -5.8F, 6.6F, 2, 1, 2, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[39].setRotationPoint(28F, -20F, 0F);
		bodyModel[39].rotateAngleX = -1.04719755F;
		bodyModel[39].rotateAngleY = -0.06632251F;

		bodyModel[40].addShapeBox(2F, -5.8F, -11.6F, 2, 1, 2, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[40].setRotationPoint(28F, -20F, 0F);
		bodyModel[40].rotateAngleX = 1.04719755F;
		bodyModel[40].rotateAngleY = 0.06632251F;

		bodyModel[41].addShapeBox(2F, -5.9F, -9.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[41].setRotationPoint(28F, -20F, 0F);
		bodyModel[41].rotateAngleX = 1.04719755F;
		bodyModel[41].rotateAngleY = 0.06632251F;

		bodyModel[42].addShapeBox(2F, -5.8F, -8.6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 125
		bodyModel[42].setRotationPoint(28F, -20F, 0F);
		bodyModel[42].rotateAngleX = 1.04719755F;
		bodyModel[42].rotateAngleY = 0.06632251F;

		bodyModel[43].addShapeBox(10F, -5.8F, -11.6F, 2, 1, 2, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[43].setRotationPoint(28F, -20F, 0F);
		bodyModel[43].rotateAngleX = 1.04719755F;
		bodyModel[43].rotateAngleY = 0.06632251F;

		bodyModel[44].addShapeBox(10F, -5.9F, -9.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[44].setRotationPoint(28F, -20F, 0F);
		bodyModel[44].rotateAngleX = 1.04719755F;
		bodyModel[44].rotateAngleY = 0.06632251F;

		bodyModel[45].addShapeBox(10F, -5.8F, -8.6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 128
		bodyModel[45].setRotationPoint(28F, -20F, 0F);
		bodyModel[45].rotateAngleX = 1.04719755F;
		bodyModel[45].rotateAngleY = 0.06632251F;

		bodyModel[46].addShapeBox(18F, -5.8F, -11.6F, 2, 1, 2, 0F,0F, -1.4F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[46].setRotationPoint(28F, -20F, 0F);
		bodyModel[46].rotateAngleX = 1.04719755F;
		bodyModel[46].rotateAngleY = 0.06632251F;

		bodyModel[47].addShapeBox(18F, -5.9F, -9.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[47].setRotationPoint(28F, -20F, 0F);
		bodyModel[47].rotateAngleX = 1.04719755F;
		bodyModel[47].rotateAngleY = 0.06632251F;

		bodyModel[48].addShapeBox(18F, -5.8F, -8.6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[48].setRotationPoint(28F, -20F, 0F);
		bodyModel[48].rotateAngleX = 1.04719755F;
		bodyModel[48].rotateAngleY = 0.06632251F;

		bodyModel[49].addShapeBox(26F, -5.8F, -11.6F, 2, 1, 2, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[49].setRotationPoint(28F, -20F, 0F);
		bodyModel[49].rotateAngleX = 1.04719755F;
		bodyModel[49].rotateAngleY = 0.06632251F;

		bodyModel[50].addShapeBox(26F, -5.9F, -9.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[50].setRotationPoint(28F, -20F, 0F);
		bodyModel[50].rotateAngleX = 1.04719755F;
		bodyModel[50].rotateAngleY = 0.06632251F;

		bodyModel[51].addShapeBox(26F, -5.8F, -8.6F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 134
		bodyModel[51].setRotationPoint(28F, -20F, 0F);
		bodyModel[51].rotateAngleX = 1.04719755F;
		bodyModel[51].rotateAngleY = 0.06632251F;

		bodyModel[52].addShapeBox(18F, 5F, -14F, 10, 19, 1, 0F,0F, 0F, 0F, 0F, -5F, -4.5F, 0F, -5F, 4.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F); // Box 137
		bodyModel[52].setRotationPoint(0F, -25F, 0F);

		bodyModel[53].addShapeBox(18F, 5F, 13F, 10, 19, 1, 0F,0F, -0.5F, 0F, 0F, -5F, 4.5F, 0F, -5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 138
		bodyModel[53].setRotationPoint(0F, -25F, 0F);

		bodyModel[54].addShapeBox(0F, 3F, 9F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[54].setRotationPoint(17F, -25F, 0F);
		bodyModel[54].rotateAngleZ = 0.06981317F;

		bodyModel[55].addShapeBox(0F, 3F, -3F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 146
		bodyModel[55].setRotationPoint(17F, -25F, 0F);
		bodyModel[55].rotateAngleZ = 0.06981317F;

		bodyModel[56].addShapeBox(0F, 3F, -13F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 147
		bodyModel[56].setRotationPoint(17F, -25F, 0F);
		bodyModel[56].rotateAngleZ = 0.06981317F;

		bodyModel[57].addShapeBox(0F, 2.5F, 9F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[57].setRotationPoint(17F, -25F, 0F);
		bodyModel[57].rotateAngleZ = 0.06981317F;

		bodyModel[58].addShapeBox(0F, 2.5F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[58].setRotationPoint(17F, -25F, 0F);
		bodyModel[58].rotateAngleZ = 0.06981317F;

		bodyModel[59].addShapeBox(0F, 2.5F, -13F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[59].setRotationPoint(17F, -25F, 0F);
		bodyModel[59].rotateAngleZ = 0.06981317F;

		bodyModel[60].addShapeBox(-15F, 0F, 13F, 9, 24, 1, 0F,-0.5F, 0F, 8F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -8F, -0.5F, 0F, 8F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -8F); // Box 151
		bodyModel[60].setRotationPoint(0F, -25F, 0F);

		bodyModel[61].addShapeBox(6F, 4F, 13F, 11, 20, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 152
		bodyModel[61].setRotationPoint(0F, -25F, 0F);

		bodyModel[62].addShapeBox(17F, 0F, 13F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[62].setRotationPoint(0F, -25F, 0F);

		bodyModel[63].addShapeBox(-6F, 1F, 14F, 12, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[63].setRotationPoint(0F, -25F, 0F);

		bodyModel[64].addShapeBox(6F, 0F, 13F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 156
		bodyModel[64].setRotationPoint(0F, -25F, 0F);

		bodyModel[65].addShapeBox(-6F, 0F, 13F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[65].setRotationPoint(0F, -25F, 0F);

		bodyModel[66].addShapeBox(-6F, 1F, -15F, 12, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[66].setRotationPoint(0F, -25F, 0F);

		bodyModel[67].addShapeBox(6F, 0F, -14F, 11, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[67].setRotationPoint(0F, -25F, 0F);

		bodyModel[68].addShapeBox(-6F, 0F, -15F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[68].setRotationPoint(0F, -25F, 0F);

		bodyModel[69].addShapeBox(17F, 0F, -14F, 1, 24, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[69].setRotationPoint(0F, -25F, 0F);

		bodyModel[70].addShapeBox(0F, 4F, 6.5F, 6, 14, 1, 0F,0.5F, 0F, 0F, -1.5F, 0F, 6F, 0F, 0F, -7F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 6F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 166
		bodyModel[70].setRotationPoint(57F, -19F, 0F);

		bodyModel[71].addShapeBox(33.9F, 5F, -0.5F, 1, 14, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 170
		bodyModel[71].setRotationPoint(28F, -20F, 0F);

		bodyModel[72].addShapeBox(0F, 4F, -7.5F, 6, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, -7F, -1.5F, 0F, 6F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1.5F, 0F, 6F, 0.5F, 0F, 0F); // Box 171
		bodyModel[72].setRotationPoint(57F, -19F, 0F);

		bodyModel[73].addShapeBox(0F, 4.5F, -6F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F); // Box 172
		bodyModel[73].setRotationPoint(57F, -19F, 0F);

		bodyModel[74].addShapeBox(-1.5F, 0.5F, -6.5F, 1, 4, 13, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[74].setRotationPoint(57F, -19F, 0F);

		bodyModel[75].addShapeBox(-2F, 4.5F, -6.5F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[75].setRotationPoint(57F, -19F, 0F);

		bodyModel[76].addShapeBox(0F, 0F, 12F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 202
		bodyModel[76].setRotationPoint(50F, -11F, 0F);

		bodyModel[77].addShapeBox(10F, 0F, 12F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 3F, -0.5F, -0.5F, 3F, -0.5F, 0.5F, 0F, 0F); // Box 203
		bodyModel[77].setRotationPoint(50F, -11F, 0F);

		bodyModel[78].addShapeBox(-6F, 0F, 12F, 6, 1, 7, 0F,0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 5.5F, 2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 5.5F, 0F); // Box 204
		bodyModel[78].setRotationPoint(50F, -11F, 0F);

		bodyModel[79].addShapeBox(-6F, 6F, 10F, 1, 8, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[79].setRotationPoint(50F, -11F, 0F);

		bodyModel[80].addShapeBox(-8F, 11F, 10F, 2, 1, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[80].setRotationPoint(50F, -11F, 0F);

		bodyModel[81].addShapeBox(-55F, 11F, 12F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[81].setRotationPoint(50F, -11F, 0F);

		bodyModel[82].addShapeBox(-55F, 11F, 17F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[82].setRotationPoint(50F, -11F, 0F);

		bodyModel[83].addShapeBox(-55F, 11F, 14.5F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[83].setRotationPoint(50F, -11F, 0F);

		bodyModel[84].addShapeBox(0F, 16.5F, -6F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F); // Box 210
		bodyModel[84].setRotationPoint(57F, -19F, 0F);

		bodyModel[85].addShapeBox(-1F, 17F, -5.5F, 1, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[85].setRotationPoint(57F, -19F, 0F);

		bodyModel[86].addShapeBox(-1F, 20F, -7F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[86].setRotationPoint(57F, -19F, 0F);

		bodyModel[87].addShapeBox(-10F, 1F, -10F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 213
		bodyModel[87].setRotationPoint(57F, 1F, 0F);

		bodyModel[88].addShapeBox(-10F, 1F, -10F, 20, 1, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 214
		bodyModel[88].setRotationPoint(57F, 1F, 0F);

		bodyModel[89].addShapeBox(-10F, 2F, -10F, 20, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 215
		bodyModel[89].setRotationPoint(57F, 1F, 0F);

		bodyModel[90].addShapeBox(-10F, 2F, -10F, 20, 1, 2, 0F,-1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 216
		bodyModel[90].setRotationPoint(57F, 1F, 0F);

		bodyModel[91].addShapeBox(-10.5F, 1F, -10F, 1, 1, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 217
		bodyModel[91].setRotationPoint(57F, 1F, 0F);

		bodyModel[92].addShapeBox(9.5F, 1F, -10F, 1, 1, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 218
		bodyModel[92].setRotationPoint(57F, 1F, 0F);

		bodyModel[93].addShapeBox(3.5F, 1F, -10F, 1, 2, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 219
		bodyModel[93].setRotationPoint(57F, 1F, 0F);

		bodyModel[94].addShapeBox(-3.5F, 1F, -10F, 1, 2, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 220
		bodyModel[94].setRotationPoint(57F, 1F, 0F);

		bodyModel[95].addShapeBox(-6F, -2F, -10F, 12, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 221
		bodyModel[95].setRotationPoint(57F, 1F, 0F);

		bodyModel[96].addShapeBox(6F, -2F, -10F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0.5F, -3F, -0.1F, 0.5F, -3F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 2.5F, -0.1F, -0.5F, 2.5F, -0.1F, 0.5F, 0F, -0.1F); // Box 222
		bodyModel[96].setRotationPoint(57F, 1F, 0F);

		bodyModel[97].addShapeBox(-10F, -2F, -10F, 4, 1, 2, 0F,0.5F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -3F, -0.1F, -0.5F, 2.5F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 2.5F, -0.1F); // Box 223
		bodyModel[97].setRotationPoint(57F, 1F, 0F);

		bodyModel[98].addShapeBox(4F, -7.5F, -9.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[98].setRotationPoint(57F, 1F, 0F);

		bodyModel[99].addShapeBox(7F, -14F, -11F, 1, 1, 4, 0F,0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 225
		bodyModel[99].setRotationPoint(57F, 1F, 0F);

		bodyModel[100].addShapeBox(7F, -11F, -11F, 1, 1, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F); // Box 226
		bodyModel[100].setRotationPoint(57F, 1F, 0F);

		bodyModel[101].addShapeBox(7F, -13F, -11F, 1, 2, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[101].setRotationPoint(57F, 1F, 0F);

		bodyModel[102].addShapeBox(7F, -13F, -8F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 228
		bodyModel[102].setRotationPoint(57F, 1F, 0F);

		bodyModel[103].addShapeBox(6F, -14F, -11F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[103].setRotationPoint(57F, 1F, 0F);

		bodyModel[104].addShapeBox(6F, -11F, -11F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 230
		bodyModel[104].setRotationPoint(57F, 1F, 0F);

		bodyModel[105].addShapeBox(6F, -13F, -11F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[105].setRotationPoint(57F, 1F, 0F);

		bodyModel[106].addShapeBox(6.8F, -13F, -10F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[106].setRotationPoint(57F, 1F, 0F);

		bodyModel[107].addShapeBox(4F, -13F, -11F, 2, 2, 4, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 233
		bodyModel[107].setRotationPoint(57F, 1F, 0F);

		bodyModel[108].addShapeBox(4F, -14F, -11F, 2, 1, 4, 0F,0F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.25F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 234
		bodyModel[108].setRotationPoint(57F, 1F, 0F);

		bodyModel[109].addShapeBox(4F, -11F, -11F, 2, 1, 4, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.25F); // Box 235
		bodyModel[109].setRotationPoint(57F, 1F, 0F);

		bodyModel[110].addShapeBox(3F, -13F, -11F, 1, 2, 4, 0F,0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F); // Box 236
		bodyModel[110].setRotationPoint(57F, 1F, 0F);

		bodyModel[111].addShapeBox(3F, -14F, -11F, 1, 1, 4, 0F,0F, -1F, -1.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -1F); // Box 237
		bodyModel[111].setRotationPoint(57F, 1F, 0F);

		bodyModel[112].addShapeBox(3F, -11F, -11F, 1, 1, 4, 0F,0F, 0.5F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -1F, 0F, -1F, -1.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -1.5F); // Box 238
		bodyModel[112].setRotationPoint(57F, 1F, 0F);

		bodyModel[113].addShapeBox(4F, -12.5F, -12F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[113].setRotationPoint(57F, 1F, 0F);

		bodyModel[114].addShapeBox(4F, -11.5F, -12F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[114].setRotationPoint(57F, 1F, 0F);

		bodyModel[115].addShapeBox(4F, -11.5F, -7F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[115].setRotationPoint(57F, 1F, 0F);

		bodyModel[116].addShapeBox(4F, -8.5F, -12F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 242
		bodyModel[116].setRotationPoint(57F, 1F, 0F);

		bodyModel[117].addShapeBox(4F, -7.5F, 8.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[117].setRotationPoint(57F, 1F, 0F);

		bodyModel[118].addShapeBox(4F, -8.5F, 6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		bodyModel[118].setRotationPoint(57F, 1F, 0F);

		bodyModel[119].addShapeBox(4F, -11.5F, 6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[119].setRotationPoint(57F, 1F, 0F);

		bodyModel[120].addShapeBox(4F, -11.5F, 11F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[120].setRotationPoint(57F, 1F, 0F);

		bodyModel[121].addShapeBox(4F, -12.5F, 6F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[121].setRotationPoint(57F, 1F, 0F);

		bodyModel[122].addShapeBox(7F, -13F, 10F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 248
		bodyModel[122].setRotationPoint(57F, 1F, 0F);

		bodyModel[123].addShapeBox(7F, -11F, 7F, 1, 1, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F); // Box 249
		bodyModel[123].setRotationPoint(57F, 1F, 0F);

		bodyModel[124].addShapeBox(6.8F, -13F, 8F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[124].setRotationPoint(57F, 1F, 0F);

		bodyModel[125].addShapeBox(7F, -13F, 7F, 1, 2, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[125].setRotationPoint(57F, 1F, 0F);

		bodyModel[126].addShapeBox(7F, -14F, 7F, 1, 1, 4, 0F,0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 252
		bodyModel[126].setRotationPoint(57F, 1F, 0F);

		bodyModel[127].addShapeBox(6F, -14F, 7F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[127].setRotationPoint(57F, 1F, 0F);

		bodyModel[128].addShapeBox(4F, -14F, 7F, 2, 1, 4, 0F,0F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.25F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F); // Box 254
		bodyModel[128].setRotationPoint(57F, 1F, 0F);

		bodyModel[129].addShapeBox(3F, -14F, 7F, 1, 1, 4, 0F,0F, -1F, -1.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -1.5F, 0F, 0.5F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -1F); // Box 255
		bodyModel[129].setRotationPoint(57F, 1F, 0F);

		bodyModel[130].addShapeBox(3F, -13F, 7F, 1, 2, 4, 0F,0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -1F); // Box 256
		bodyModel[130].setRotationPoint(57F, 1F, 0F);

		bodyModel[131].addShapeBox(4F, -13F, 7F, 2, 2, 4, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Box 257
		bodyModel[131].setRotationPoint(57F, 1F, 0F);

		bodyModel[132].addShapeBox(6F, -13F, 7F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[132].setRotationPoint(57F, 1F, 0F);

		bodyModel[133].addShapeBox(3F, -11F, 7F, 1, 1, 4, 0F,0F, 0.5F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, -1F, 0F, -1F, -1.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -1F, -1.5F); // Box 259
		bodyModel[133].setRotationPoint(57F, 1F, 0F);

		bodyModel[134].addShapeBox(4F, -11F, 7F, 2, 1, 4, 0F,0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.25F); // Box 260
		bodyModel[134].setRotationPoint(57F, 1F, 0F);

		bodyModel[135].addShapeBox(6F, -11F, 7F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 261
		bodyModel[135].setRotationPoint(57F, 1F, 0F);

		bodyModel[136].addShapeBox(-6F, -2F, 8F, 12, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 262
		bodyModel[136].setRotationPoint(57F, 1F, 0F);

		bodyModel[137].addShapeBox(6F, -2F, 8F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0.5F, -3F, -0.1F, 0.5F, -3F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 2.5F, -0.1F, -0.5F, 2.5F, -0.1F, 0.5F, 0F, -0.1F); // Box 263
		bodyModel[137].setRotationPoint(57F, 1F, 0F);

		bodyModel[138].addShapeBox(9.5F, 1F, 8F, 1, 1, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 264
		bodyModel[138].setRotationPoint(57F, 1F, 0F);

		bodyModel[139].addShapeBox(-10F, -2F, 8F, 4, 1, 2, 0F,0.5F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -3F, -0.1F, -0.5F, 2.5F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 2.5F, -0.1F); // Box 265
		bodyModel[139].setRotationPoint(57F, 1F, 0F);

		bodyModel[140].addShapeBox(-10.5F, 1F, 8F, 1, 1, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 266
		bodyModel[140].setRotationPoint(57F, 1F, 0F);

		bodyModel[141].addShapeBox(-10F, 1F, 8F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 267
		bodyModel[141].setRotationPoint(57F, 1F, 0F);

		bodyModel[142].addShapeBox(-10F, 1F, 8F, 20, 1, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 268
		bodyModel[142].setRotationPoint(57F, 1F, 0F);

		bodyModel[143].addShapeBox(-10F, 2F, 8F, 20, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 269
		bodyModel[143].setRotationPoint(57F, 1F, 0F);

		bodyModel[144].addShapeBox(-10F, 2F, 8F, 20, 1, 2, 0F,-1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 270
		bodyModel[144].setRotationPoint(57F, 1F, 0F);

		bodyModel[145].addShapeBox(-3.5F, 1F, 8F, 1, 2, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 271
		bodyModel[145].setRotationPoint(57F, 1F, 0F);

		bodyModel[146].addShapeBox(3.5F, 1F, 8F, 1, 2, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 272
		bodyModel[146].setRotationPoint(57F, 1F, 0F);

		bodyModel[147].addShapeBox(-1F, -1F, -4F, 2, 2, 3, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[147].setRotationPoint(55.5F, 1F, 13F);

		bodyModel[148].addShapeBox(-1F, 3F, -22F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[148].setRotationPoint(55.5F, 1F, 13F);

		bodyModel[149].addShapeBox(-1F, -1F, 5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 275
		bodyModel[149].setRotationPoint(55.5F, 1F, -17F);

		bodyModel[150].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 276
		bodyModel[150].setRotationPoint(55.5F, 1F, 13F);

		bodyModel[151].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[151].setRotationPoint(55.5F, 1F, -13F);

		bodyModel[152].addShapeBox(-7F, 0F, 12F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[152].setRotationPoint(0F, -25F, 0F);

		bodyModel[153].addShapeBox(-7F, 0F, -13F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[153].setRotationPoint(0F, -25F, 0F);

		bodyModel[154].addShapeBox(-12F, 12F, 8F, 2, 1, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[154].setRotationPoint(50F, -11F, 0F);

		bodyModel[155].addShapeBox(-53F, 12F, 8F, 2, 1, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[155].setRotationPoint(50F, -11F, 0F);

		bodyModel[156].addShapeBox(-39F, 12F, 8F, 2, 1, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[156].setRotationPoint(50F, -11F, 0F);

		bodyModel[157].addShapeBox(-26F, 12F, 8F, 2, 1, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[157].setRotationPoint(50F, -11F, 0F);

		bodyModel[158].addShapeBox(-57F, 13F, 18F, 51, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[158].setRotationPoint(50F, -11F, 0F);

		bodyModel[159].addShapeBox(-57F, 14F, 18F, 51, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 256
		bodyModel[159].setRotationPoint(50F, -11F, 0F);

		bodyModel[160].addShapeBox(-52F, 15F, 18F, 41, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 257
		bodyModel[160].setRotationPoint(50F, -11F, 0F);

		bodyModel[161].addShapeBox(4.5F, 0F, 10F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[161].setRotationPoint(50F, -11F, 0F);

		bodyModel[162].addShapeBox(4.5F, 1F, 10F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 259
		bodyModel[162].setRotationPoint(50F, -11F, 0F);

		bodyModel[163].addShapeBox(4.5F, 1F, -11F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 260
		bodyModel[163].setRotationPoint(50F, -11F, 0F);

		bodyModel[164].addShapeBox(4.5F, 0F, -12F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[164].setRotationPoint(50F, -11F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, -19F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 262
		bodyModel[165].setRotationPoint(50F, -11F, 0F);

		bodyModel[166].addShapeBox(10F, 0F, -19F, 5, 1, 7, 0F,0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 3F, -0.5F, -0.5F, 3F, -0.5F, 0.5F, 0F, 0F); // Box 263
		bodyModel[166].setRotationPoint(50F, -11F, 0F);

		bodyModel[167].addShapeBox(-6F, 0F, -19F, 6, 1, 7, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 2F, -1F, 5.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 5.5F, 2F); // Box 264
		bodyModel[167].setRotationPoint(50F, -11F, 0F);

		bodyModel[168].addShapeBox(-6F, 6F, -19F, 1, 8, 9, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[168].setRotationPoint(50F, -11F, 0F);

		bodyModel[169].addShapeBox(-8F, 11F, -19F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 266
		bodyModel[169].setRotationPoint(50F, -11F, 0F);

		bodyModel[170].addShapeBox(-55F, 11F, -16.5F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[170].setRotationPoint(50F, -11F, 0F);

		bodyModel[171].addShapeBox(-55F, 11F, -19F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[171].setRotationPoint(50F, -11F, 0F);

		bodyModel[172].addShapeBox(-12F, 12F, -19F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 269
		bodyModel[172].setRotationPoint(50F, -11F, 0F);

		bodyModel[173].addShapeBox(-26F, 12F, -19F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 270
		bodyModel[173].setRotationPoint(50F, -11F, 0F);

		bodyModel[174].addShapeBox(-55F, 11F, -14F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[174].setRotationPoint(50F, -11F, 0F);

		bodyModel[175].addShapeBox(-53F, 12F, -19F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 272
		bodyModel[175].setRotationPoint(50F, -11F, 0F);

		bodyModel[176].addShapeBox(-39F, 12F, -19F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 273
		bodyModel[176].setRotationPoint(50F, -11F, 0F);

		bodyModel[177].addShapeBox(-57F, 13F, -19F, 51, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[177].setRotationPoint(50F, -11F, 0F);

		bodyModel[178].addShapeBox(-57F, 14F, -19F, 51, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 275
		bodyModel[178].setRotationPoint(50F, -11F, 0F);

		bodyModel[179].addShapeBox(-52F, 15F, -19F, 41, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Box 276
		bodyModel[179].setRotationPoint(50F, -11F, 0F);

		bodyModel[180].addShapeBox(-55F, 11F, 9.5F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[180].setRotationPoint(50F, -11F, 0F);

		bodyModel[181].addShapeBox(-55F, 11F, -11.5F, 47, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[181].setRotationPoint(50F, -11F, 0F);

		bodyModel[182].addShapeBox(-43F, 19F, -7.5F, 73, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[182].setRotationPoint(28F, -20F, 0F);

		bodyModel[183].addShapeBox(-26F, 10F, -8.5F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 280
		bodyModel[183].setRotationPoint(50F, -11F, 0F);

		bodyModel[184].addShapeBox(-12F, 10F, -8.5F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 281
		bodyModel[184].setRotationPoint(50F, -11F, 0F);

		bodyModel[185].addShapeBox(-53F, 10F, -8.5F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282
		bodyModel[185].setRotationPoint(50F, -11F, 0F);

		bodyModel[186].addShapeBox(-39F, 10F, -8.5F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 283
		bodyModel[186].setRotationPoint(50F, -11F, 0F);

		bodyModel[187].addShapeBox(-53F, 10F, 7.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[187].setRotationPoint(50F, -11F, 0F);

		bodyModel[188].addShapeBox(-39F, 10F, 7.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[188].setRotationPoint(50F, -11F, 0F);

		bodyModel[189].addShapeBox(-26F, 10F, 7.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[189].setRotationPoint(50F, -11F, 0F);

		bodyModel[190].addShapeBox(-12F, 10F, 7.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[190].setRotationPoint(50F, -11F, 0F);

		bodyModel[191].addShapeBox(-43F, 19F, 5.5F, 73, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[191].setRotationPoint(28F, -20F, 0F);

		bodyModel[192].addShapeBox(-34F, 18F, -7.5F, 62, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[192].setRotationPoint(28F, -20F, 0F);

		bodyModel[193].addShapeBox(27F, 19.5F, -8.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[193].setRotationPoint(28F, -20F, 0F);

		bodyModel[194].addShapeBox(27F, 19.5F, 7.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[194].setRotationPoint(28F, -20F, 0F);

		bodyModel[195].addShapeBox(-89F, -4F, 14F, 33, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[195].setRotationPoint(50F, -11F, 0F);

		bodyModel[196].addShapeBox(-89F, -4F, 11F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[196].setRotationPoint(50F, -11F, 0F);

		bodyModel[197].addShapeBox(-58F, -3F, 13F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 294
		bodyModel[197].setRotationPoint(50F, -11F, 0F);

		bodyModel[198].addShapeBox(-89F, -4F, -14F, 28, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[198].setRotationPoint(50F, -11F, 0F);

		bodyModel[199].addShapeBox(-89F, -4F, -20F, 33, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[199].setRotationPoint(50F, -11F, 0F);

		bodyModel[200].addShapeBox(-58F, -3F, -19F, 1, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F); // Box 301
		bodyModel[200].setRotationPoint(50F, -11F, 0F);

		bodyModel[201].addShapeBox(-89F, -3F, 11F, 31, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[201].setRotationPoint(50F, -11F, 0F);

		bodyModel[202].addShapeBox(-89F, -3F, -12F, 31, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[202].setRotationPoint(50F, -11F, 0F);

		bodyModel[203].addShapeBox(-89F, 3F, -10F, 24, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[203].setRotationPoint(50F, -11F, 0F);

		bodyModel[204].addShapeBox(-89F, 3F, -11F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[204].setRotationPoint(50F, -11F, 0F);

		bodyModel[205].addShapeBox(-89F, 3F, 10F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[205].setRotationPoint(50F, -11F, 0F);

		bodyModel[206].addShapeBox(-83F, 5F, -12F, 18, 7, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[206].setRotationPoint(50F, -11F, 0F);

		bodyModel[207].addShapeBox(-82F, 2F, -12.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 318
		bodyModel[207].setRotationPoint(50F, -11F, 0F);

		bodyModel[208].addShapeBox(-71F, 2F, -12.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 319
		bodyModel[208].setRotationPoint(50F, -11F, 0F);

		bodyModel[209].addShapeBox(-77F, 2F, -12.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 320
		bodyModel[209].setRotationPoint(50F, -11F, 0F);

		bodyModel[210].addShapeBox(-77F, 2F, 11.5F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[210].setRotationPoint(50F, -11F, 0F);

		bodyModel[211].addShapeBox(-82F, 2F, 11.5F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[211].setRotationPoint(50F, -11F, 0F);

		bodyModel[212].addShapeBox(-71F, 2F, 11.5F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[212].setRotationPoint(50F, -11F, 0F);

		bodyModel[213].addShapeBox(-14F, -18F, 8.5F, 1, 2, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F); // Box 330
		bodyModel[213].setRotationPoint(0F, -5F, 0F);
		bodyModel[213].rotateAngleY = 1.04719755F;

		bodyModel[214].addShapeBox(-14F, -8F, 8.5F, 1, 2, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F); // Box 331
		bodyModel[214].setRotationPoint(0F, -5F, 0F);
		bodyModel[214].rotateAngleY = 1.04719755F;

		bodyModel[215].addShapeBox(-57F, 11F, 10F, 2, 1, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[215].setRotationPoint(50F, -11F, 0F);

		bodyModel[216].addShapeBox(-57F, 11F, -19F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 335
		bodyModel[216].setRotationPoint(50F, -11F, 0F);

		bodyModel[217].addShapeBox(-89.6F, 2.5F, -7.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 336
		bodyModel[217].setRotationPoint(50F, -11F, 0F);

		bodyModel[218].addShapeBox(-89.6F, 2.5F, -0.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 337
		bodyModel[218].setRotationPoint(50F, -11F, 0F);

		bodyModel[219].addShapeBox(-89.6F, 2.5F, 6.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 338
		bodyModel[219].setRotationPoint(50F, -11F, 0F);

		bodyModel[220].addShapeBox(-87F, -3F, 14F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 339
		bodyModel[220].setRotationPoint(50F, -11F, 0F);

		bodyModel[221].addShapeBox(-87F, -3F, 12F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 340
		bodyModel[221].setRotationPoint(50F, -11F, 0F);

		bodyModel[222].addShapeBox(-72F, -3F, 12F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 341
		bodyModel[222].setRotationPoint(50F, -11F, 0F);

		bodyModel[223].addShapeBox(-72F, -3F, 14F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 342
		bodyModel[223].setRotationPoint(50F, -11F, 0F);

		bodyModel[224].addShapeBox(-72F, -3F, -14F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[224].setRotationPoint(50F, -11F, 0F);

		bodyModel[225].addShapeBox(-72F, -3F, -19F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[225].setRotationPoint(50F, -11F, 0F);

		bodyModel[226].addShapeBox(-87F, -3F, -14F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[226].setRotationPoint(50F, -11F, 0F);

		bodyModel[227].addShapeBox(-87F, -3F, -19F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[227].setRotationPoint(50F, -11F, 0F);

		bodyModel[228].addShapeBox(-10.5F, -7F, -14F, 1, 1, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 347
		bodyModel[228].setRotationPoint(-21F, 7F, 0F);

		bodyModel[229].addShapeBox(-10F, -7F, -14F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 348
		bodyModel[229].setRotationPoint(-21F, 7F, 0F);

		bodyModel[230].addShapeBox(-10F, -7F, -14F, 20, 1, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 349
		bodyModel[230].setRotationPoint(-21F, 7F, 0F);

		bodyModel[231].addShapeBox(-10F, -6F, -14F, 20, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 350
		bodyModel[231].setRotationPoint(-21F, 7F, 0F);

		bodyModel[232].addShapeBox(-10F, -6F, -14F, 20, 1, 2, 0F,-1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 351
		bodyModel[232].setRotationPoint(-21F, 7F, 0F);

		bodyModel[233].addShapeBox(-3.5F, -7F, -14F, 1, 2, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 352
		bodyModel[233].setRotationPoint(-21F, 7F, 0F);

		bodyModel[234].addShapeBox(3.5F, -7F, -14F, 1, 2, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 353
		bodyModel[234].setRotationPoint(-21F, 7F, 0F);

		bodyModel[235].addShapeBox(9.5F, -7F, -14F, 1, 1, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 354
		bodyModel[235].setRotationPoint(-21F, 7F, 0F);

		bodyModel[236].addShapeBox(6F, -10F, -14F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0.5F, -3F, -0.1F, 0.5F, -3F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 2.5F, -0.1F, -0.5F, 2.5F, -0.1F, 0.5F, 0F, -0.1F); // Box 355
		bodyModel[236].setRotationPoint(-21F, 7F, 0F);

		bodyModel[237].addShapeBox(-6F, -10F, -14F, 12, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 356
		bodyModel[237].setRotationPoint(-21F, 7F, 0F);

		bodyModel[238].addShapeBox(-10F, -10F, -14F, 4, 1, 2, 0F,0.5F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -3F, -0.1F, -0.5F, 2.5F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 2.5F, -0.1F); // Box 357
		bodyModel[238].setRotationPoint(-21F, 7F, 0F);

		bodyModel[239].addShapeBox(6F, -10F, 12F, 4, 1, 2, 0F,0F, 0F, -0.1F, 0.5F, -3F, -0.1F, 0.5F, -3F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 2.5F, -0.1F, -0.5F, 2.5F, -0.1F, 0.5F, 0F, -0.1F); // Box 358
		bodyModel[239].setRotationPoint(-21F, 7F, 0F);

		bodyModel[240].addShapeBox(-6F, -10F, 12F, 12, 1, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F); // Box 359
		bodyModel[240].setRotationPoint(-21F, 7F, 0F);

		bodyModel[241].addShapeBox(9.5F, -7F, 12F, 1, 1, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 360
		bodyModel[241].setRotationPoint(-21F, 7F, 0F);

		bodyModel[242].addShapeBox(-10F, -7F, 12F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[242].setRotationPoint(-21F, 7F, 0F);

		bodyModel[243].addShapeBox(-10F, -7F, 12F, 20, 1, 2, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 362
		bodyModel[243].setRotationPoint(-21F, 7F, 0F);

		bodyModel[244].addShapeBox(-10F, -6F, 12F, 20, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 363
		bodyModel[244].setRotationPoint(-21F, 7F, 0F);

		bodyModel[245].addShapeBox(-10F, -6F, 12F, 20, 1, 2, 0F,-1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 364
		bodyModel[245].setRotationPoint(-21F, 7F, 0F);

		bodyModel[246].addShapeBox(3.5F, -7F, 12F, 1, 2, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 365
		bodyModel[246].setRotationPoint(-21F, 7F, 0F);

		bodyModel[247].addShapeBox(-10.5F, -7F, 12F, 1, 1, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 366
		bodyModel[247].setRotationPoint(-21F, 7F, 0F);

		bodyModel[248].addShapeBox(-10F, -10F, 12F, 4, 1, 2, 0F,0.5F, -3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -3F, -0.1F, -0.5F, 2.5F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, -0.5F, 2.5F, -0.1F); // Box 367
		bodyModel[248].setRotationPoint(-21F, 7F, 0F);

		bodyModel[249].addShapeBox(-3.5F, -7F, 12F, 1, 2, 2, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 368
		bodyModel[249].setRotationPoint(-21F, 7F, 0F);

		bodyModel[250].addShapeBox(-5F, -8F, -12.1F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[250].setRotationPoint(-21F, 7F, 0F);

		bodyModel[251].addShapeBox(-5F, -8F, 11.1F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[251].setRotationPoint(-21F, 7F, 0F);

		bodyModel[252].addShapeBox(-15F, 0F, -14F, 9, 24, 1, 0F,0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 8F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 8F); // Box 371
		bodyModel[252].setRotationPoint(0F, -25F, 0F);

		bodyModel[253].addShapeBox(-15F, 16F, -6F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 372
		bodyModel[253].setRotationPoint(0F, -25F, 0F);

		bodyModel[254].addShapeBox(-15F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 373
		bodyModel[254].setRotationPoint(0F, -25F, 0F);

		bodyModel[255].addShapeBox(-20F, 16F, -6F, 5, 1, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 374
		bodyModel[255].setRotationPoint(0F, -25F, 0F);

		bodyModel[256].addShapeBox(-20F, 1F, -6F, 5, 1, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 375
		bodyModel[256].setRotationPoint(0F, -25F, 0F);

		bodyModel[257].addShapeBox(-20F, 1.5F, -7F, 5, 15, 1, 0F,1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 376
		bodyModel[257].setRotationPoint(0F, -25F, 0F);

		bodyModel[258].addShapeBox(-21F, 1.5F, -1F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[258].setRotationPoint(0F, -25F, 0F);

		bodyModel[259].addShapeBox(-21F, 1.5F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[259].setRotationPoint(0F, -25F, 0F);

		bodyModel[260].addShapeBox(-20F, 1.5F, 6F, 5, 15, 1, 0F,0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F); // Box 379
		bodyModel[260].setRotationPoint(0F, -25F, 0F);

		bodyModel[261].addShapeBox(-15F, 1.5F, -7F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[261].setRotationPoint(0F, -25F, 0F);

		bodyModel[262].addShapeBox(-15F, 1.5F, 6F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[262].setRotationPoint(0F, -25F, 0F);

		bodyModel[263].addShapeBox(-14F, -18F, -10.5F, 1, 2, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F); // Box 362
		bodyModel[263].setRotationPoint(0F, -5F, 0F);
		bodyModel[263].rotateAngleY = -1.04719755F;

		bodyModel[264].addShapeBox(-14F, -8F, -10.5F, 1, 2, 2, 0F,-0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F); // Box 363
		bodyModel[264].setRotationPoint(0F, -5F, 0F);
		bodyModel[264].rotateAngleY = -1.04719755F;

		bodyModel[265].addShapeBox(-22F, 6.5F, -1F, 1, 3, 1, 0F,-0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.05F); // Box 364
		bodyModel[265].setRotationPoint(0F, -25F, 0F);

		bodyModel[266].addShapeBox(-22F, 6.5F, 0F, 1, 3, 1, 0F,-0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.05F); // Box 365
		bodyModel[266].setRotationPoint(0F, -25F, 0F);

		bodyModel[267].addShapeBox(-20F, 6.5F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Box 366
		bodyModel[267].setRotationPoint(0F, -25F, 0F);

		bodyModel[268].addShapeBox(-20F, 6.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.05F, -0.5F, -0.5F, -0.05F, 0F, 0F, 0F); // Box 367
		bodyModel[268].setRotationPoint(0F, -25F, 0F);

		bodyModel[269].addShapeBox(-61F, -4F, -14F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[269].setRotationPoint(50F, -11F, 0F);

		bodyModel[270].addShapeBox(-61F, -4F, 11F, 4, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[270].setRotationPoint(50F, -11F, 0F);

		bodyModel[271].addShapeBox(12F, 3F, -11F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[271].setRotationPoint(-27F, -11F, 0F);

		bodyModel[272].addShapeBox(12F, 3F, 6F, 5, 1, 5, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[272].setRotationPoint(-27F, -11F, 0F);

		bodyModel[273].addShapeBox(6F, 18F, 7.5F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 363
		bodyModel[273].setRotationPoint(0F, -20F, 0F);

		bodyModel[274].addShapeBox(-6F, 18F, 7.5F, 12, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 364
		bodyModel[274].setRotationPoint(0F, -20F, 0F);

		bodyModel[275].addShapeBox(-15F, 18F, -13.5F, 9, 1, 28, 0F,0F, 0F, -9F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -10F); // Box 365
		bodyModel[275].setRotationPoint(0F, -20F, 0F);

		bodyModel[276].addShapeBox(-6F, 18F, -13.5F, 12, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[276].setRotationPoint(0F, -20F, 0F);

		bodyModel[277].addShapeBox(6F, 18F, -13.5F, 11, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[277].setRotationPoint(0F, -20F, 0F);

		bodyModel[278].addShapeBox(17F, 18F, -13.5F, 1, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[278].setRotationPoint(0F, -20F, 0F);

		bodyModel[279].addShapeBox(18F, 18F, -13.5F, 10, 1, 6, 0F,0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[279].setRotationPoint(0F, -20F, 0F);

		bodyModel[280].addShapeBox(28F, 18F, -8.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[280].setRotationPoint(0F, -20F, 0F);

		bodyModel[281].addShapeBox(28F, 18F, 7.5F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F); // Box 372
		bodyModel[281].setRotationPoint(0F, -20F, 0F);

		bodyModel[282].addShapeBox(18F, 18F, 7.5F, 10, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0.5F); // Box 373
		bodyModel[282].setRotationPoint(0F, -20F, 0F);

		bodyModel[283].addShapeBox(17F, 18F, 7.5F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 374
		bodyModel[283].setRotationPoint(0F, -20F, 0F);

		bodyModel[284].addShapeBox(-89.6F, 2.2F, 6.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 377
		bodyModel[284].setRotationPoint(50F, -11F, 0F);

		bodyModel[285].addShapeBox(-89.6F, 2.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 378
		bodyModel[285].setRotationPoint(50F, -11F, 0F);

		bodyModel[286].addShapeBox(-89.6F, 2.2F, -7.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 379
		bodyModel[286].setRotationPoint(50F, -11F, 0F);

		bodyModel[287].addShapeBox(6F, 1F, 13F, 11, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 380
		bodyModel[287].setRotationPoint(0F, -25F, 0F);

		bodyModel[288].addShapeBox(6F, 2F, 13F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.55F, 0F, 0F, 0.55F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.55F, 0F, 0F, 0.55F, 0F, 0F, 1F); // Box 381
		bodyModel[288].setRotationPoint(0F, -25F, 0F);

		bodyModel[289].addShapeBox(14F, 2F, 13F, 3, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.28F, 0F, 0F, -0.28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.28F); // Box 382
		bodyModel[289].setRotationPoint(0F, -25F, 0F);

		bodyModel[290].addShapeBox(6F, 4F, -14F, 11, 20, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 384
		bodyModel[290].setRotationPoint(0F, -25F, 0F);

		bodyModel[291].addShapeBox(6F, 2F, -14F, 5, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.55F, 0F, 0F, -0.55F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.55F, 0F, 0F, -0.55F, 0F, 0F, -1F); // Box 385
		bodyModel[291].setRotationPoint(0F, -25F, 0F);

		bodyModel[292].addShapeBox(6F, 1F, -14F, 11, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 386
		bodyModel[292].setRotationPoint(0F, -25F, 0F);

		bodyModel[293].addShapeBox(14F, 2F, -14F, 3, 2, 1, 0F,0F, 0F, 0.28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.28F); // Box 387
		bodyModel[293].setRotationPoint(0F, -25F, 0F);

		bodyModel[294].addShapeBox(1F, -1F, -12F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[294].setRotationPoint(17F, -24F, 0F);

		bodyModel[295].addShapeBox(1F, -1F, 11F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[295].setRotationPoint(17F, -24F, 0F);

		bodyModel[296].addShapeBox(1F, -1F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[296].setRotationPoint(17F, -24F, 0F);

		bodyModel[297].addShapeBox(-88F, -8F, 12F, 24, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[297].setRotationPoint(50F, -11F, 0F);

		bodyModel[298].addShapeBox(-88F, -9F, 12F, 24, 1, 6, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 390
		bodyModel[298].setRotationPoint(50F, -11F, 0F);

		bodyModel[299].addShapeBox(-86F, -9F, 17.5F, 2, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F); // Box 391
		bodyModel[299].setRotationPoint(50F, -11F, 0F);

		bodyModel[300].addShapeBox(-68F, -9F, 17.5F, 2, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F); // Box 392
		bodyModel[300].setRotationPoint(50F, -11F, 0F);

		bodyModel[301].addShapeBox(-80F, -9F, 17.5F, 2, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F); // Box 393
		bodyModel[301].setRotationPoint(50F, -11F, 0F);

		bodyModel[302].addShapeBox(-74F, -9F, 17.5F, 2, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F); // Box 394
		bodyModel[302].setRotationPoint(50F, -11F, 0F);

		bodyModel[303].addShapeBox(-78F, -9F, 11.5F, 4, 2, 1, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 395
		bodyModel[303].setRotationPoint(50F, -11F, 0F);

		bodyModel[304].addShapeBox(-78F, -9F, -12.5F, 4, 2, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F); // Box 396
		bodyModel[304].setRotationPoint(50F, -11F, 0F);

		bodyModel[305].addShapeBox(-88F, -9F, -18F, 24, 1, 6, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 397
		bodyModel[305].setRotationPoint(50F, -11F, 0F);

		bodyModel[306].addShapeBox(-88F, -8F, -18F, 24, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[306].setRotationPoint(50F, -11F, 0F);

		bodyModel[307].addShapeBox(-68F, -9F, -18.5F, 2, 2, 1, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 399
		bodyModel[307].setRotationPoint(50F, -11F, 0F);

		bodyModel[308].addShapeBox(-74F, -9F, -18.5F, 2, 2, 1, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 400
		bodyModel[308].setRotationPoint(50F, -11F, 0F);

		bodyModel[309].addShapeBox(-80F, -9F, -18.5F, 2, 2, 1, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 401
		bodyModel[309].setRotationPoint(50F, -11F, 0F);

		bodyModel[310].addShapeBox(-86F, -9F, -18.5F, 2, 2, 1, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 402
		bodyModel[310].setRotationPoint(50F, -11F, 0F);

		bodyModel[311].addShapeBox(-85F, 8F, -9F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		bodyModel[311].setRotationPoint(50F, -11F, 0F);

		bodyModel[312].addShapeBox(-85F, 10F, -9F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 404
		bodyModel[312].setRotationPoint(50F, -11F, 0F);

		bodyModel[313].addShapeBox(-85F, 9F, -9F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[313].setRotationPoint(50F, -11F, 0F);

		bodyModel[314].addShapeBox(-85F, 9F, 6F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[314].setRotationPoint(50F, -11F, 0F);

		bodyModel[315].addShapeBox(-85F, 8F, 6F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[315].setRotationPoint(50F, -11F, 0F);

		bodyModel[316].addShapeBox(-85F, 10F, 6F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 408
		bodyModel[316].setRotationPoint(50F, -11F, 0F);

		bodyModel[317].addShapeBox(-87F, 8.5F, -8.5F, 2, 2, 2, 0F,0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.8F, -0.2F); // Box 409
		bodyModel[317].setRotationPoint(50F, -11F, 0F);

		bodyModel[318].addShapeBox(-87F, 8.5F, 6.5F, 2, 2, 2, 0F,0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.8F, -0.2F); // Box 410
		bodyModel[318].setRotationPoint(50F, -11F, 0F);

		bodyModel[319].addShapeBox(-0.5F, -12.5F, -0.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[319].setRotationPoint(-37F, -10F, 0F);

		bodyModel[320].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 412
		bodyModel[320].setRotationPoint(-37F, -10F, 0F);

		bodyModel[321].addBox(0F, -4F, -8.5F, 1, 13, 17, 0F); // Box 420
		bodyModel[321].setRotationPoint(28F, -11F, 0F);

		bodyModel[322].addShapeBox(0F, -7F, -8.5F, 1, 3, 17, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[322].setRotationPoint(28F, -11F, 0F);

		bodyModel[323].addBox(-5F, -2F, -11F, 5, 2, 10, 0F); // Box 554
		bodyModel[323].setRotationPoint(9F, -4F, 0F);

		bodyModel[324].addBox(-5F, -2F, 1F, 5, 2, 10, 0F); // Box 557
		bodyModel[324].setRotationPoint(9F, -4F, 0F);

		bodyModel[325].addShapeBox(0F, -2F, -11F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 558
		bodyModel[325].setRotationPoint(9F, -4F, 0F);

		bodyModel[326].addShapeBox(0F, -2F, 1F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 559
		bodyModel[326].setRotationPoint(9F, -4F, 0F);

		bodyModel[327].addBox(-7F, -12F, -11F, 2, 12, 10, 0F); // Box 560
		bodyModel[327].setRotationPoint(9F, -4F, 0F);

		bodyModel[328].addBox(-7F, -12F, 1F, 2, 12, 10, 0F); // Box 561
		bodyModel[328].setRotationPoint(9F, -4F, 0F);

		bodyModel[329].addShapeBox(-7F, -13F, -11F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 562
		bodyModel[329].setRotationPoint(9F, -4F, 0F);

		bodyModel[330].addShapeBox(-7F, -13F, 1F, 2, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[330].setRotationPoint(9F, -4F, 0F);

		bodyModel[331].addBox(-5F, 0F, -8F, 4, 1, 4, 0F); // Box 564
		bodyModel[331].setRotationPoint(9F, -4F, 0F);

		bodyModel[332].addBox(-5F, 0F, 4F, 4, 1, 4, 0F); // Box 565
		bodyModel[332].setRotationPoint(9F, -4F, 0F);

		bodyModel[333].addBox(-6F, 1F, 3F, 6, 1, 6, 0F); // Box 566
		bodyModel[333].setRotationPoint(9F, -4F, 0F);

		bodyModel[334].addBox(-6F, 1F, -9F, 6, 1, 6, 0F); // Box 567
		bodyModel[334].setRotationPoint(9F, -4F, 0F);

		bodyModel[335].addBox(14F, 3F, 8F, 5, 1, 2, 0F); // Box 568
		bodyModel[335].setRotationPoint(2F, -4F, -10F);
		bodyModel[335].rotateAngleZ = 0.13962634F;

		bodyModel[336].addBox(16F, 4F, 8.5F, 1, 1, 1, 0F); // Box 569
		bodyModel[336].setRotationPoint(2F, -4F, -10F);
		bodyModel[336].rotateAngleZ = 0.13962634F;

		bodyModel[337].addBox(16F, 4F, 4.5F, 1, 1, 1, 0F); // Box 570
		bodyModel[337].setRotationPoint(2F, -4F, -10F);
		bodyModel[337].rotateAngleZ = 0.13962634F;

		bodyModel[338].addBox(14F, 3F, 4F, 5, 1, 2, 0F); // Box 571
		bodyModel[338].setRotationPoint(2F, -4F, -10F);
		bodyModel[338].rotateAngleZ = 0.13962634F;

		bodyModel[339].addBox(14F, 3F, 1F, 4, 1, 2, 0F); // Box 572
		bodyModel[339].setRotationPoint(2F, -4F, -10F);
		bodyModel[339].rotateAngleZ = 0.13962634F;

		bodyModel[340].addBox(16F, 4F, 1.5F, 1, 1, 1, 0F); // Box 573
		bodyModel[340].setRotationPoint(2F, -4F, -10F);
		bodyModel[340].rotateAngleZ = 0.13962634F;

		bodyModel[341].addShapeBox(8F, 0F, -1F, 3, 1, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[341].setRotationPoint(3F, -4F, 0F);

		bodyModel[342].addShapeBox(8F, 1F, -1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[342].setRotationPoint(3F, -4F, 0F);

		bodyModel[343].addShapeBox(9F, -3F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[343].setRotationPoint(3F, -4F, 0F);

		bodyModel[344].addShapeBox(9F, -6F, 0F, 1, 3, 1, 0F,1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 577
		bodyModel[344].setRotationPoint(3F, -4F, 0F);

		bodyModel[345].addShapeBox(7.5F, -6F, 0F, 1, 1, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 578
		bodyModel[345].setRotationPoint(3F, -4F, 0F);

		bodyModel[346].addBox(-1F, -0.5F, -1.5F, 8, 1, 3, 0F); // Box 579
		bodyModel[346].setRotationPoint(18F, -12F, -6F);
		bodyModel[346].rotateAngleZ = -0.2268928F;

		bodyModel[347].addShapeBox(-1F, -1.5F, -1.5F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 912
		bodyModel[347].setRotationPoint(18F, -12F, -6F);
		bodyModel[347].rotateAngleZ = -0.2268928F;

		bodyModel[348].addShapeBox(-1F, 0.5F, -1.5F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 913
		bodyModel[348].setRotationPoint(18F, -12F, -6F);
		bodyModel[348].rotateAngleZ = -0.2268928F;

		bodyModel[349].addShapeBox(-5F, -4F, -8.5F, 5, 13, 17, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[349].setRotationPoint(28F, -11F, 0F);

		bodyModel[350].addShapeBox(7F, -4F, 0.5F, 2, 8, 2, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F); // Box 476
		bodyModel[350].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[351].addShapeBox(6F, -3.5F, 0.5F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 477
		bodyModel[351].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[352].addShapeBox(6F, 2.5F, 0.5F, 1, 6, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F); // Box 478
		bodyModel[352].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[353].addShapeBox(7F, 3F, 0.5F, 2, 6, 2, 0F,0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F); // Box 479
		bodyModel[353].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[354].addShapeBox(-4F, 7F, 0.5F, 8, 2, 2, 0F,-0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 480
		bodyModel[354].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[355].addShapeBox(-3.5F, 6F, 0.5F, 7, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[355].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[356].addShapeBox(-9F, 3F, 0.5F, 2, 6, 2, 0F,0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F); // Box 482
		bodyModel[356].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[357].addShapeBox(-7F, 2.5F, 0.5F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F); // Box 483
		bodyModel[357].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[358].addShapeBox(-7F, -3.5F, 0.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[358].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[359].addShapeBox(-9F, -4F, 0.5F, 2, 8, 2, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F); // Box 485
		bodyModel[359].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[360].addShapeBox(-9F, -9F, 0.5F, 2, 6, 2, 0F,-5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F); // Box 486
		bodyModel[360].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[361].addShapeBox(-7F, -8.5F, 0.5F, 1, 6, 2, 0F,-3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 487
		bodyModel[361].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[362].addShapeBox(-4F, -9F, 0.5F, 8, 2, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 488
		bodyModel[362].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[363].addShapeBox(-3.5F, -7F, 0.5F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 489
		bodyModel[363].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[364].addShapeBox(7F, -9F, 0.5F, 2, 6, 2, 0F,3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F); // Box 490
		bodyModel[364].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[365].addShapeBox(6F, -8.5F, 0.5F, 1, 6, 2, 0F,3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 491
		bodyModel[365].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[366].addShapeBox(-8F, 3F, 1F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 492
		bodyModel[366].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[367].addShapeBox(-8F, -3F, 1F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[367].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[368].addShapeBox(-8F, -7F, 1F, 16, 4, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[368].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[369].addShapeBox(-3F, 1F, 0.5F, 6, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 495
		bodyModel[369].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[370].addShapeBox(-3F, -1F, 0.5F, 6, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 496
		bodyModel[370].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[371].addShapeBox(-3F, -3F, 0.5F, 6, 2, 2, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 497
		bodyModel[371].setRotationPoint(3.5F, -12F, 15F);

		bodyModel[372].addShapeBox(7F, -4F, 0.5F, 2, 8, 2, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F); // Box 498
		bodyModel[372].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[373].addShapeBox(6F, -3.5F, 0.5F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 499
		bodyModel[373].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[374].addShapeBox(6F, 2.5F, 0.5F, 1, 6, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F); // Box 500
		bodyModel[374].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[375].addShapeBox(7F, 3F, 0.5F, 2, 6, 2, 0F,0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F); // Box 501
		bodyModel[375].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[376].addShapeBox(-4F, 7F, 0.5F, 8, 2, 2, 0F,-0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 502
		bodyModel[376].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[377].addShapeBox(-3.5F, 6F, 0.5F, 7, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[377].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[378].addShapeBox(-9F, 3F, 0.5F, 2, 6, 2, 0F,0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F); // Box 504
		bodyModel[378].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[379].addShapeBox(-7F, 2.5F, 0.5F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F); // Box 505
		bodyModel[379].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[380].addShapeBox(-7F, -3.5F, 0.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[380].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[381].addShapeBox(-9F, -4F, 0.5F, 2, 8, 2, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F); // Box 507
		bodyModel[381].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[382].addShapeBox(-9F, -9F, 0.5F, 2, 6, 2, 0F,-5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F); // Box 508
		bodyModel[382].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[383].addShapeBox(-7F, -8.5F, 0.5F, 1, 6, 2, 0F,-3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 509
		bodyModel[383].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[384].addShapeBox(-4F, -9F, 0.5F, 8, 2, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 510
		bodyModel[384].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[385].addShapeBox(-3.5F, -7F, 0.5F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 511
		bodyModel[385].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[386].addShapeBox(7F, -9F, 0.5F, 2, 6, 2, 0F,3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F); // Box 512
		bodyModel[386].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[387].addShapeBox(6F, -8.5F, 0.5F, 1, 6, 2, 0F,3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 513
		bodyModel[387].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[388].addShapeBox(-8F, -7F, 1F, 16, 4, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[388].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[389].addShapeBox(-8F, -3F, 1F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[389].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[390].addShapeBox(-8F, 3F, 1F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 516
		bodyModel[390].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[391].addShapeBox(-3F, 1F, 0.5F, 6, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 517
		bodyModel[391].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[392].addShapeBox(-3F, -1F, 0.5F, 6, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 518
		bodyModel[392].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[393].addShapeBox(-3F, -3F, 0.5F, 6, 2, 2, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 519
		bodyModel[393].setRotationPoint(3.5F, -12F, -18F);

		bodyModel[394].addBox(2F, 0.5F, 15F, 3, 1, 4, 0F); // Box 592
		bodyModel[394].setRotationPoint(0F, -13F, 0F);

		bodyModel[395].addShapeBox(2F, 1.5F, 15F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 593
		bodyModel[395].setRotationPoint(0F, -13F, 0F);

		bodyModel[396].addShapeBox(2F, -0.5F, 15F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[396].setRotationPoint(0F, -13F, 0F);

		bodyModel[397].addShapeBox(2F, -0.5F, -19F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[397].setRotationPoint(0F, -13F, 0F);

		bodyModel[398].addBox(2F, 0.5F, -19F, 3, 1, 4, 0F); // Box 596
		bodyModel[398].setRotationPoint(0F, -13F, 0F);

		bodyModel[399].addShapeBox(2F, 1.5F, -19F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 597
		bodyModel[399].setRotationPoint(0F, -13F, 0F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 305
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 374
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 375
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 376

		bodyDoorOpenModel[0].addShapeBox(0F, -6F, -11F, 1, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyDoorOpenModel[0].setRotationPoint(-39.1F, -8F, 0F);
		bodyDoorOpenModel[0].rotateAngleZ = 3.01941961F;

		bodyDoorOpenModel[1].addShapeBox(-0.5F, -1.5F, -7.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 374
		bodyDoorOpenModel[1].setRotationPoint(-39.1F, -8F, 0F);
		bodyDoorOpenModel[1].rotateAngleZ = 3.0368729F;

		bodyDoorOpenModel[2].addShapeBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 375
		bodyDoorOpenModel[2].setRotationPoint(-39.1F, -8F, 0F);
		bodyDoorOpenModel[2].rotateAngleZ = 3.0368729F;

		bodyDoorOpenModel[3].addShapeBox(-0.5F, -1.5F, 6.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 376
		bodyDoorOpenModel[3].setRotationPoint(-39.1F, -8F, 0F);
		bodyDoorOpenModel[3].rotateAngleZ = 3.0368729F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 598
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 599
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 600
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 601

		bodyDoorCloseModel[0].addShapeBox(0F, -6F, -11F, 1, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyDoorCloseModel[0].setRotationPoint(-39.1F, -8F, 0F);

		bodyDoorCloseModel[1].addShapeBox(-0.5F, -1.5F, -7.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 599
		bodyDoorCloseModel[1].setRotationPoint(-39.1F, -8F, 0F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.01745329F;

		bodyDoorCloseModel[2].addShapeBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 600
		bodyDoorCloseModel[2].setRotationPoint(-39.1F, -8F, 0F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.01745329F;

		bodyDoorCloseModel[3].addShapeBox(-0.5F, -1.5F, 6.5F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 601
		bodyDoorCloseModel[3].setRotationPoint(-39.1F, -8F, 0F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.01745329F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		turretModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		turretModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		turretModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 8
		turretModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		turretModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
		turretModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 11
		turretModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		turretModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		turretModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 14
		turretModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		turretModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 16
		turretModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
		turretModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 18
		turretModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 19
		turretModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 20
		turretModel[16] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 21
		turretModel[17] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 22
		turretModel[18] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 23
		turretModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 24
		turretModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 25
		turretModel[21] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 26
		turretModel[22] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 27
		turretModel[23] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 28
		turretModel[24] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 29
		turretModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 30
		turretModel[26] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 31
		turretModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 32
		turretModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		turretModel[29] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 35
		turretModel[30] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 36
		turretModel[31] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 37
		turretModel[32] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 39
		turretModel[33] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 40
		turretModel[34] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 41
		turretModel[35] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 42
		turretModel[36] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 43
		turretModel[37] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 44
		turretModel[38] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 45
		turretModel[39] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 46
		turretModel[40] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 47
		turretModel[41] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 48
		turretModel[42] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 49
		turretModel[43] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 51
		turretModel[44] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 52
		turretModel[45] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 53
		turretModel[46] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 54
		turretModel[47] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 55
		turretModel[48] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 56
		turretModel[49] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 57
		turretModel[50] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 58
		turretModel[51] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 59
		turretModel[52] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 60
		turretModel[53] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 61
		turretModel[54] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 62
		turretModel[55] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 68
		turretModel[56] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 69
		turretModel[57] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 70
		turretModel[58] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 71
		turretModel[59] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 72
		turretModel[60] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 73
		turretModel[61] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 74
		turretModel[62] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 75

		turretModel[0].addShapeBox(-14F, 0F, -6F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1
		turretModel[0].setRotationPoint(0F, -37F, 0F);

		turretModel[1].addShapeBox(-6F, 5F, -15F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
		turretModel[1].setRotationPoint(0F, -37F, 0F);

		turretModel[2].addShapeBox(14F, 9F, -6F, 1, 3, 12, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 7
		turretModel[2].setRotationPoint(0F, -37F, 0F);

		turretModel[3].addShapeBox(6F, 6F, -15F, 12, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 8.5F, 0.5F, 0F, 0F); // Box 8
		turretModel[3].setRotationPoint(0F, -37F, 0F);

		turretModel[4].addShapeBox(-18F, 6F, -15F, 12, 6, 1, 0F,-3F, 0F, -9F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 8.5F, -3F, 0F, -9F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 8.5F); // Box 9
		turretModel[4].setRotationPoint(0F, -37F, 0F);

		turretModel[5].addShapeBox(-15F, 10F, -6F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 10
		turretModel[5].setRotationPoint(0F, -37F, 0F);

		turretModel[6].addShapeBox(-18F, 6F, 14F, 12, 6, 1, 0F,-4F, 0F, 8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F); // Box 11
		turretModel[6].setRotationPoint(0F, -37F, 0F);

		turretModel[7].addShapeBox(-6F, 5F, 14F, 12, 7, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[7].setRotationPoint(0F, -37F, 0F);

		turretModel[8].addShapeBox(6F, 6F, 14F, 12, 6, 1, 0F,0.5F, 0F, 0F, -4F, 0F, 8.5F, -3F, 0F, -9F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 8.5F, -3F, 0F, -9F, 0F, 0F, 0F); // Box 13
		turretModel[8].setRotationPoint(0F, -37F, 0F);

		turretModel[9].addShapeBox(14F, 0F, -6F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[9].setRotationPoint(0F, -37F, 0F);

		turretModel[10].addShapeBox(14F, 3F, -6F, 1, 6, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 15
		turretModel[10].setRotationPoint(0F, -37F, 0F);

		turretModel[11].addShapeBox(14F, 3F, 2F, 1, 6, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 16
		turretModel[11].setRotationPoint(0F, -37F, 0F);

		turretModel[12].addShapeBox(-15F, 0F, -6F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[12].setRotationPoint(0F, -37F, 0F);

		turretModel[13].addShapeBox(-15F, 5F, -6F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		turretModel[13].setRotationPoint(0F, -37F, 0F);

		turretModel[14].addShapeBox(-15F, 5F, 5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 19
		turretModel[14].setRotationPoint(0F, -37F, 0F);

		turretModel[15].addShapeBox(6F, 0F, 14F, 12, 6, 1, 0F,0.5F, -5.5F, 0F, -4F, -0.5F, 8.5F, -3F, 0F, -9F, 0F, -5F, 0F, 0.5F, 0F, 0F, -4F, 0F, 8.5F, -3F, 0F, -9F, 0F, 0F, 0F); // Box 20
		turretModel[15].setRotationPoint(0F, -37F, 0F);

		turretModel[16].addShapeBox(-5F, 5F, 5F, 10, 1, 10, 0F,0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F); // Box 21
		turretModel[16].setRotationPoint(0F, -37F, 0F);

		turretModel[17].addShapeBox(5F, 5F, 5F, 9, 1, 10, 0F,0F, 5F, -1F, 1F, 5F, -1F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, -8.5F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Box 22
		turretModel[17].setRotationPoint(0F, -37F, 0F);

		turretModel[18].addShapeBox(-14F, 5F, 5F, 9, 1, 10, 0F,1F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, -5F, -0.5F, 0F, -5F, -0.5F, 0.5F, -0.5F, -1F, -8.5F, -0.5F, -1F); // Box 23
		turretModel[18].setRotationPoint(0F, -37F, 0F);

		turretModel[19].addShapeBox(-18F, 0F, 14F, 12, 6, 1, 0F,-4F, -0.5F, 8.5F, 0.5F, -5.5F, 0F, 0F, -5F, 0F, -3F, 0F, -9F, -4F, 0F, 8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F); // Box 24
		turretModel[19].setRotationPoint(0F, -37F, 0F);

		turretModel[20].addShapeBox(-18F, 0F, -15F, 12, 6, 1, 0F,-3F, 0F, -9F, 0F, -5F, 0F, 0.5F, -5.5F, 0F, -4F, -0.5F, 8.5F, -3F, 0F, -9F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 8.5F); // Box 25
		turretModel[20].setRotationPoint(0F, -37F, 0F);

		turretModel[21].addShapeBox(-14F, 5F, -15F, 9, 1, 10, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 1F, 5F, -1F, -8.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 26
		turretModel[21].setRotationPoint(0F, -37F, 0F);

		turretModel[22].addShapeBox(-5F, 5F, -15F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 27
		turretModel[22].setRotationPoint(0F, -37F, 0F);

		turretModel[23].addShapeBox(5F, 5F, -15F, 9, 1, 10, 0F,0F, 0F, 0F, -8F, 0F, 0F, 1F, 5F, -1F, 0F, 5F, -1F, 0.5F, -0.5F, -1F, -8.5F, -0.5F, -1F, 0F, -5F, -0.5F, 0F, -5F, -0.5F); // Box 28
		turretModel[23].setRotationPoint(0F, -37F, 0F);

		turretModel[24].addShapeBox(6F, 0F, -15F, 12, 6, 1, 0F,0F, -5F, 0F, -3F, 0F, -9F, -4F, -0.5F, 8.5F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 8.5F, 0.5F, 0F, 0F); // Box 29
		turretModel[24].setRotationPoint(0F, -37F, 0F);

		turretModel[25].addShapeBox(-3F, -1F, -3F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 30
		turretModel[25].setRotationPoint(0F, -37F, 0F);

		turretModel[26].addShapeBox(-3F, -1F, -4F, 8, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		turretModel[26].setRotationPoint(0F, -37F, 0F);

		turretModel[27].addShapeBox(-3F, -1F, 2F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 32
		turretModel[27].setRotationPoint(0F, -37F, 0F);

		turretModel[28].addShapeBox(-6F, -0.5F, -3F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		turretModel[28].setRotationPoint(0F, -37F, 0F);

		turretModel[29].addShapeBox(-6F, -0.5F, -6F, 15, 1, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		turretModel[29].setRotationPoint(0F, -37F, 0F);

		turretModel[30].addShapeBox(9F, 0F, -6F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 36
		turretModel[30].setRotationPoint(0F, -37F, 0F);

		turretModel[31].addShapeBox(-6F, 0F, -3F, 1, 1, 6, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Box 37
		turretModel[31].setRotationPoint(0F, -37F, 0F);

		turretModel[32].addShapeBox(-6F, 0F, 3F, 6, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 39
		turretModel[32].setRotationPoint(0F, -37F, 0F);

		turretModel[33].addShapeBox(8F, 0F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Box 40
		turretModel[33].setRotationPoint(0F, -37F, 0F);

		turretModel[34].addShapeBox(3F, 0F, 3F, 6, 1, 3, 0F,0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		turretModel[34].setRotationPoint(0F, -37F, 0F);

		turretModel[35].addShapeBox(-6F, 0F, -6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -1F, 0F, 0F); // Box 42
		turretModel[35].setRotationPoint(0F, -37F, 0F);

		turretModel[36].addShapeBox(3F, 0F, -6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -1.5F); // Box 43
		turretModel[36].setRotationPoint(0F, -37F, 0F);

		turretModel[37].addShapeBox(0F, 0F, 4F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
		turretModel[37].setRotationPoint(0F, -37F, 0F);

		turretModel[38].addShapeBox(0F, 0F, -6F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 45
		turretModel[38].setRotationPoint(0F, -37F, 0F);

		turretModel[39].addShapeBox(-6F, -0.5F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
		turretModel[39].setRotationPoint(0F, -37F, 0F);

		turretModel[40].addShapeBox(-2.5F, -1F, 3F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 47
		turretModel[40].setRotationPoint(0F, -37F, 0F);

		turretModel[41].addShapeBox(5F, -0.5F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 48
		turretModel[41].setRotationPoint(0F, -37F, 0F);

		turretModel[42].addShapeBox(5F, -0.5F, -3F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[42].setRotationPoint(0F, -37F, 0F);

		turretModel[43].addShapeBox(-6F, -0.5F, 3F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 51
		turretModel[43].setRotationPoint(0F, -37F, 0F);

		turretModel[44].addShapeBox(-1.5F, -1.5F, 3F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		turretModel[44].setRotationPoint(0F, -37F, 0F);

		turretModel[45].addShapeBox(2.5F, -1.5F, 3F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		turretModel[45].setRotationPoint(0F, -37F, 0F);

		turretModel[46].addShapeBox(-15.5F, 4F, -4F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		turretModel[46].setRotationPoint(0F, -37F, 0F);

		turretModel[47].addShapeBox(-15.5F, 4F, -5F, 1, 6, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		turretModel[47].setRotationPoint(0F, -37F, 0F);

		turretModel[48].addShapeBox(-15.5F, 4F, 4F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 56
		turretModel[48].setRotationPoint(0F, -37F, 0F);

		turretModel[49].addShapeBox(-15F, 4F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		turretModel[49].setRotationPoint(0F, -37F, 0F);

		turretModel[50].addShapeBox(-15F, 9F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 58
		turretModel[50].setRotationPoint(0F, -37F, 0F);

		turretModel[51].addShapeBox(-15F, 9F, 5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 59
		turretModel[51].setRotationPoint(0F, -37F, 0F);

		turretModel[52].addShapeBox(-15F, 4F, 5F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 60
		turretModel[52].setRotationPoint(0F, -37F, 0F);

		turretModel[53].addShapeBox(-16F, 5F, -6F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 61
		turretModel[53].setRotationPoint(0F, -37F, 0F);

		turretModel[54].addShapeBox(-16F, 8F, -6F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 62
		turretModel[54].setRotationPoint(0F, -37F, 0F);

		turretModel[55].addShapeBox(-6F, 11F, -14F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		turretModel[55].setRotationPoint(0F, -37F, 0F);

		turretModel[56].addShapeBox(6F, 11F, -14F, 12, 1, 1, 0F,0F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 8.5F, 0.5F, 0F, 0F); // Box 69
		turretModel[56].setRotationPoint(0F, -37F, 0F);

		turretModel[57].addShapeBox(13F, 11F, -6F, 1, 1, 12, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 70
		turretModel[57].setRotationPoint(0F, -37F, 0F);

		turretModel[58].addShapeBox(6F, 11F, 13F, 12, 1, 1, 0F,0.5F, 0F, 0F, -4F, 0F, 8.5F, -3F, 0F, -9F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 8.5F, -3F, 0F, -9F, 0F, 0F, 0F); // Box 71
		turretModel[58].setRotationPoint(0F, -37F, 0F);

		turretModel[59].addShapeBox(-6F, 11F, 13F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		turretModel[59].setRotationPoint(0F, -37F, 0F);

		turretModel[60].addShapeBox(-18F, 11F, 13F, 12, 1, 1, 0F,-4F, 0F, 8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F, -4F, 0F, 8.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -9F); // Box 73
		turretModel[60].setRotationPoint(0F, -37F, 0F);

		turretModel[61].addShapeBox(-18F, 11F, -14F, 12, 1, 1, 0F,-3F, 0F, -9F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 8.5F, -3F, 0F, -9F, 0F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, 8.5F); // Box 74
		turretModel[61].setRotationPoint(0F, -37F, 0F);

		turretModel[62].addShapeBox(-14F, 11F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 75
		turretModel[62].setRotationPoint(0F, -37F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 0
		barrelModel[2] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 0
		barrelModel[3] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 0
		barrelModel[4] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 0
		barrelModel[5] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 0
		barrelModel[6] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 0
		barrelModel[7] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 0
		barrelModel[8] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 0
		barrelModel[9] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 0
		barrelModel[10] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 0
		barrelModel[11] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 0
		barrelModel[12] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 0
		barrelModel[13] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 0
		barrelModel[14] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 0
		barrelModel[15] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 0
		barrelModel[16] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 0
		barrelModel[17] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 0
		barrelModel[18] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 0
		barrelModel[19] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Box 0
		barrelModel[20] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 0
		barrelModel[21] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 0
		barrelModel[22] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 0
		barrelModel[23] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Box 0
		barrelModel[24] = new ModelRendererTurbo(this, 17, 193, textureX, textureY); // Box 0
		barrelModel[25] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 0
		barrelModel[26] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 0
		barrelModel[27] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 1
		barrelModel[28] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 2
		barrelModel[29] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 3
		barrelModel[30] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 4
		barrelModel[31] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 5
		barrelModel[32] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 6
		barrelModel[33] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 7
		barrelModel[34] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 8
		barrelModel[35] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 9
		barrelModel[36] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 10
		barrelModel[37] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 11
		barrelModel[38] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 12
		barrelModel[39] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 13
		barrelModel[40] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 14
		barrelModel[41] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 15
		barrelModel[42] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 16
		barrelModel[43] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 17
		barrelModel[44] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 18
		barrelModel[45] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 19
		barrelModel[46] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 0
		barrelModel[47] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 1
		barrelModel[48] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 2
		barrelModel[49] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 3
		barrelModel[50] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 4
		barrelModel[51] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 5
		barrelModel[52] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 6
		barrelModel[53] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 7
		barrelModel[54] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 9
		barrelModel[55] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 13
		barrelModel[56] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 14
		barrelModel[57] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 16
		barrelModel[58] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 17
		barrelModel[59] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 18
		barrelModel[60] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 19
		barrelModel[61] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 20
		barrelModel[62] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 21
		barrelModel[63] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Box 413
		barrelModel[64] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 414
		barrelModel[65] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 415
		barrelModel[66] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 416
		barrelModel[67] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 417
		barrelModel[68] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 418
		barrelModel[69] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 419
		barrelModel[70] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 426
		barrelModel[71] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 427
		barrelModel[72] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 428
		barrelModel[73] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 429
		barrelModel[74] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 430
		barrelModel[75] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 431

		barrelModel[0].addShapeBox(-0.5F, -1F, -1.5F, 1, 1, 3, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 0
		barrelModel[0].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[1].addShapeBox(-0.5F, -2F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 0
		barrelModel[1].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[2].addShapeBox(14.5F, -0.2F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 0
		barrelModel[2].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[3].addShapeBox(14.5F, -0.2F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 0
		barrelModel[3].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[4].addShapeBox(14.5F, -0.2F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 0
		barrelModel[4].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[5].addShapeBox(13.5F, -0.2F, -0.5F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, -0.2F); // Box 0
		barrelModel[5].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[6].addShapeBox(13.5F, -0.2F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F); // Box 0
		barrelModel[6].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[7].addShapeBox(13.5F, -0.2F, -0.5F, 2, 1, 1, 0F,0F, -0.6F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.4F); // Box 0
		barrelModel[7].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[8].addShapeBox(13.25F, 0.8F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F); // Box 0
		barrelModel[8].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[9].addShapeBox(-2F, -1.5F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[9].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[10].addShapeBox(-10.5F, -1.5F, -1F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[10].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[11].addShapeBox(-3F, -1.5F, -1F, 1, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		barrelModel[11].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[12].addShapeBox(-3F, 0F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 0
		barrelModel[12].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[13].addShapeBox(-9.5F, -2.2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0
		barrelModel[13].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[14].addShapeBox(-9.5F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 0
		barrelModel[14].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[15].addShapeBox(-9.5F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.1F, -0.8F, -0.25F, 0.1F, -0.8F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 0
		barrelModel[15].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[16].addShapeBox(-11.5F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F); // Box 0
		barrelModel[16].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[17].addShapeBox(-7.5F, 0.55F, 0.2F, 6, 1, 1, 0F,-0.6F, 0.4F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.6F, 0.4F, 0F, -0.6F, -0.2F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, -0.6F, -0.2F, 0F); // Box 0
		barrelModel[17].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[18].addShapeBox(-7.9F, 0.15F, 0.2F, 1, 1, 1, 0F,0F, -0.35F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.15F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 0.2F, 0F, 0F, -0.15F, 0F); // Box 0
		barrelModel[18].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[19].addShapeBox(-7.9F, 0.15F, 0.2F, 1, 1, 1, 0F,-0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 0
		barrelModel[19].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[20].addShapeBox(-12.5F, -1F, 1F, 1, 3, 1, 0F,-0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F); // Box 0
		barrelModel[20].setRotationPoint(13F, -30F, 0F);

		barrelModel[21].addShapeBox(-12.5F, -1F, 1F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F); // Box 0
		barrelModel[21].setRotationPoint(13F, -30F, 0F);

		barrelModel[22].addShapeBox(-11.5F, -1F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0
		barrelModel[22].setRotationPoint(13F, -30F, 0F);

		barrelModel[23].addShapeBox(-11.5F, 1F, 1F, 2, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[23].setRotationPoint(13F, -30F, 0F);

		barrelModel[24].addShapeBox(-11.5F, 1F, -2F, 2, 1, 1, 0F,0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[24].setRotationPoint(13F, -30F, 0F);

		barrelModel[25].addShapeBox(-11.5F, -1F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 0
		barrelModel[25].setRotationPoint(13F, -30F, 0F);

		barrelModel[26].addShapeBox(-12.5F, -1F, 1F, 1, 3, 1, 0F,0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F); // Box 0
		barrelModel[26].setRotationPoint(13F, -30F, 0F);

		barrelModel[27].addShapeBox(-12.5F, -1F, 1F, 1, 3, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 1
		barrelModel[27].setRotationPoint(13F, -30F, 0F);

		barrelModel[28].addShapeBox(-12.5F, -1F, 1F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F); // Box 2
		barrelModel[28].setRotationPoint(13F, -30F, 0F);

		barrelModel[29].addShapeBox(-12.5F, 1F, 1F, 1, 1, 1, 0F,-0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 3
		barrelModel[29].setRotationPoint(13F, -30F, 0F);

		barrelModel[30].addShapeBox(-12.5F, 1F, 1F, 1, 1, 1, 0F,0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F); // Box 4
		barrelModel[30].setRotationPoint(13F, -30F, 0F);

		barrelModel[31].addShapeBox(-12.5F, 1F, -2F, 1, 1, 1, 0F,-0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 5
		barrelModel[31].setRotationPoint(13F, -30F, 0F);

		barrelModel[32].addShapeBox(-12.5F, 1F, -2F, 1, 1, 1, 0F,0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F); // Box 6
		barrelModel[32].setRotationPoint(13F, -30F, 0F);

		barrelModel[33].addShapeBox(-12.5F, -1F, -2F, 1, 3, 1, 0F,0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F); // Box 7
		barrelModel[33].setRotationPoint(13F, -30F, 0F);

		barrelModel[34].addShapeBox(-12.5F, -1F, -2F, 1, 3, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 8
		barrelModel[34].setRotationPoint(13F, -30F, 0F);

		barrelModel[35].addShapeBox(-12.5F, -1F, -2F, 1, 3, 1, 0F,-0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.7F, -0.2F, 0F); // Box 9
		barrelModel[35].setRotationPoint(13F, -30F, 0F);

		barrelModel[36].addShapeBox(-12.5F, -1F, -2F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.3F, -0.8F, 0F); // Box 10
		barrelModel[36].setRotationPoint(13F, -30F, 0F);

		barrelModel[37].addShapeBox(-12.5F, -1F, -2F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F, -0.7F, -0.8F, 0F, -0.7F, -0.8F, 0F, 0F, -0.8F, -0.2F); // Box 11
		barrelModel[37].setRotationPoint(13F, -30F, 0F);

		barrelModel[38].addShapeBox(-6F, 0.35F, -2F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 12
		barrelModel[38].setRotationPoint(13F, -30F, 0F);

		barrelModel[39].addShapeBox(-7F, 0.35F, -2.1F, 1, 1, 1, 0F,0.1F, 0.9F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, 0.9F, -0.4F, 0.1F, -1.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -1.1F, -0.4F); // Box 13
		barrelModel[39].setRotationPoint(13F, -30F, 0F);

		barrelModel[40].addShapeBox(-8F, -0.65F, -4.9F, 1, 1, 3, 0F,-0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F); // Box 14
		barrelModel[40].setRotationPoint(13F, -30F, 0F);

		barrelModel[41].addShapeBox(-8F, -0.65F, -4.9F, 1, 1, 3, 0F,-0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F); // Box 15
		barrelModel[41].setRotationPoint(13F, -30F, 0F);

		barrelModel[42].addShapeBox(-8F, -0.65F, -4.9F, 1, 1, 3, 0F,-0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 16
		barrelModel[42].setRotationPoint(13F, -30F, 0F);

		barrelModel[43].addShapeBox(-8F, -0.65F, -2.1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F); // Box 17
		barrelModel[43].setRotationPoint(13F, -30F, 0F);

		barrelModel[44].addShapeBox(-6F, 0.35F, -2.1F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F); // Box 18
		barrelModel[44].setRotationPoint(13F, -30F, 0F);

		barrelModel[45].addShapeBox(-7.7F, -0.65F, -2.1F, 1, 1, 1, 0F,0F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 19
		barrelModel[45].setRotationPoint(13F, -30F, 0F);

		barrelModel[46].addShapeBox(-0.5F, 0F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F); // Box 0
		barrelModel[46].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[47].addShapeBox(13.5F, -2F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F, 0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F); // Box 1
		barrelModel[47].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[48].addShapeBox(13.5F, -1F, -1.5F, 1, 1, 3, 0F,0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.5F, 0.1F, 0F); // Box 2
		barrelModel[48].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[49].addShapeBox(13.5F, 0F, -1.5F, 1, 1, 3, 0F,0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0.5F, -0.1F, -0.8F); // Box 3
		barrelModel[49].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[50].addShapeBox(0.5F, -1F, -1.5F, 13, 1, 3, 0F,0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 4
		barrelModel[50].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[51].addShapeBox(0.5F, -1.4F, -1.5F, 13, 1, 3, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 5
		barrelModel[51].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[52].addShapeBox(0.5F, -0.6F, -1.5F, 13, 1, 3, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 6
		barrelModel[52].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[53].addShapeBox(0.5F, -2F, -0.1F, 13, 3, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 7
		barrelModel[53].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[54].addShapeBox(0.5F, -2F, -0.5F, 13, 3, 1, 0F,0F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, -0.5F, -0.15F, -0.3F, 0F, -0.15F, -0.3F); // Box 9
		barrelModel[54].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[55].addShapeBox(0.5F, -1F, -1.5F, 13, 1, 3, 0F,0F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, -1.1F, 0F, 0F, -1.1F, 0F); // Box 13
		barrelModel[55].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[56].addShapeBox(0.5F, -1F, -1.5F, 13, 1, 3, 0F,0F, 0.5F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.5F, -1.1F, 0F, -0.5F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 14
		barrelModel[56].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[57].addShapeBox(0.5F, -2F, -0.9F, 13, 3, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 16
		barrelModel[57].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[58].addShapeBox(0.5F, -2F, -0.5F, 13, 3, 1, 0F,0F, -0.15F, -1.1F, -0.5F, -0.15F, -1.1F, -0.5F, -0.55F, 0.55F, 0F, -0.55F, 0.55F, 0F, -0.55F, 0.55F, -0.5F, -0.55F, 0.55F, -0.5F, -0.15F, -1.1F, 0F, -0.15F, -1.1F); // Box 17
		barrelModel[58].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[59].addShapeBox(0.5F, -2F, -0.5F, 13, 3, 1, 0F,0F, -0.55F, 0.55F, -0.5F, -0.55F, 0.55F, -0.5F, -0.15F, -1.1F, 0F, -0.15F, -1.1F, 0F, -0.15F, -1.1F, -0.5F, -0.15F, -1.1F, -0.5F, -0.55F, 0.55F, 0F, -0.55F, 0.55F); // Box 18
		barrelModel[59].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[60].addShapeBox(13.25F, -2.2F, -0.5F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 19
		barrelModel[60].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[61].addShapeBox(13.25F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 20
		barrelModel[61].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[62].addShapeBox(-10.5F, -2F, -0.5F, 7, 1, 1, 0F,-0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F); // Box 21
		barrelModel[62].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[63].addShapeBox(-0.5F, -0.5F, -7.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F); // Box 413
		barrelModel[63].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[64].addShapeBox(3.5F, -2F, -3F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		barrelModel[64].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[65].addShapeBox(3.5F, -5F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		barrelModel[65].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[66].addShapeBox(3.5F, -4F, -3F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 416
		barrelModel[66].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[67].addShapeBox(3.5F, -4F, 0F, 1, 2, 3, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		barrelModel[67].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[68].addShapeBox(3.5F, -6F, -3F, 1, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		barrelModel[68].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[69].addShapeBox(3.5F, 2F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 419
		barrelModel[69].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[70].addShapeBox(-3.75F, 0F, -6F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		barrelModel[70].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[71].addShapeBox(-3.75F, -1F, -6F, 2, 1, 5, 0F,0.05F, -0.5F, 0.05F, 0.05F, -0.5F, 0.05F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0.05F, 0.05F, 0F, 0F, 0.05F, 0F, 0F); // Box 427
		barrelModel[71].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[72].addShapeBox(-3.25F, -0.75F, -6.6F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		barrelModel[72].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[73].addShapeBox(-3.25F, 3F, -6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 429
		barrelModel[73].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[74].addShapeBox(-3.25F, 2.2F, -7F, 1, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		barrelModel[74].setRotationPoint(13F, -29.5F, 0F);

		barrelModel[75].addShapeBox(-3.25F, 1.2F, -1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 431
		barrelModel[75].setRotationPoint(13F, -29.5F, 0F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 175
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 176
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 177
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 178
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 179
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 180
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 181
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 182
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 183
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 184
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 185
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 188
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 189
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 190
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 191
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 192
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 193
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 194
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 195
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 196
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 197
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 198
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 199
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 200
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 201
		leftFrontWheelModel[25] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 568
		leftFrontWheelModel[26] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 569
		leftFrontWheelModel[27] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 570

		leftFrontWheelModel[0].addShapeBox(-8F, -7F, 0.5F, 16, 4, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		leftFrontWheelModel[0].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[0].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[1].addShapeBox(-8F, -3F, 0.5F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		leftFrontWheelModel[1].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[1].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[2].addShapeBox(-8F, 3F, 0.5F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 177
		leftFrontWheelModel[2].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[2].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[3].addShapeBox(-9F, -4F, 0F, 2, 8, 2, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F); // Box 178
		leftFrontWheelModel[3].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[3].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[4].addShapeBox(-4F, -9F, 0F, 8, 2, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 179
		leftFrontWheelModel[4].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[4].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[5].addShapeBox(-9F, -9F, 0F, 2, 6, 2, 0F,-5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F); // Box 180
		leftFrontWheelModel[5].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[5].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[6].addShapeBox(-9F, 3F, 0F, 2, 6, 2, 0F,0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F); // Box 181
		leftFrontWheelModel[6].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[6].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[7].addShapeBox(7F, 3F, 0F, 2, 6, 2, 0F,0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F); // Box 182
		leftFrontWheelModel[7].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[7].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[8].addShapeBox(7F, -4F, 0F, 2, 8, 2, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F); // Box 183
		leftFrontWheelModel[8].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[8].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[9].addShapeBox(7F, -9F, 0F, 2, 6, 2, 0F,3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F); // Box 184
		leftFrontWheelModel[9].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[9].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[10].addShapeBox(-4F, 7F, 0F, 8, 2, 2, 0F,-0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 185
		leftFrontWheelModel[10].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[10].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[11].addShapeBox(-3.5F, -7F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 188
		leftFrontWheelModel[11].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[11].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[12].addShapeBox(-3.5F, 6F, 0F, 7, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		leftFrontWheelModel[12].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[12].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[13].addShapeBox(-7F, -3.5F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 190
		leftFrontWheelModel[13].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[13].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[14].addShapeBox(6F, -3.5F, 0F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 191
		leftFrontWheelModel[14].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[14].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[15].addShapeBox(-7F, -8.5F, 0F, 1, 6, 2, 0F,-3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 192
		leftFrontWheelModel[15].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[15].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[16].addShapeBox(-7F, 2.5F, 0F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F); // Box 193
		leftFrontWheelModel[16].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[16].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[17].addShapeBox(6F, 2.5F, 0F, 1, 6, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F); // Box 194
		leftFrontWheelModel[17].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[17].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[18].addShapeBox(6F, -8.5F, 0F, 1, 6, 2, 0F,3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 195
		leftFrontWheelModel[18].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[18].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[19].addShapeBox(-3F, -3F, 0F, 6, 2, 2, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		leftFrontWheelModel[19].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[19].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[20].addShapeBox(-3F, -1F, 0F, 6, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 197
		leftFrontWheelModel[20].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[20].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[21].addShapeBox(-3F, 1F, 0F, 6, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 198
		leftFrontWheelModel[21].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[21].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[22].addShapeBox(-1.5F, -0.5F, -1F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		leftFrontWheelModel[22].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[22].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[23].addShapeBox(-1.5F, -1.5F, -1F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftFrontWheelModel[23].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[23].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[24].addShapeBox(-1.5F, 0.5F, -1F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 201
		leftFrontWheelModel[24].setRotationPoint(55.5F, 1F, 14F);
		leftFrontWheelModel[24].rotateAngleX = -0.03490659F;

		leftFrontWheelModel[25].addShapeBox(-3F, -3F, -4.5F, 6, 2, 2, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 568
		leftFrontWheelModel[25].setRotationPoint(-20.5F, 1F, -15F);
		leftFrontWheelModel[25].rotateAngleX = 0.03490659F;

		leftFrontWheelModel[26].addShapeBox(-3F, -1F, -4.5F, 6, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 569
		leftFrontWheelModel[26].setRotationPoint(-20.5F, 1F, -15F);
		leftFrontWheelModel[26].rotateAngleX = 0.03490659F;

		leftFrontWheelModel[27].addShapeBox(-3F, 1F, -4.5F, 6, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 570
		leftFrontWheelModel[27].setRotationPoint(-20.5F, 1F, -15F);
		leftFrontWheelModel[27].rotateAngleX = 0.03490659F;
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 520
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 521
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 522
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 523
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 524
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 525
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 526
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 527
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 528
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 529
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 530
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 531
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 532
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 533
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 534
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 535
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 536
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 537
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 538
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 539
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 540
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 541
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 542
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 543
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 591

		rightFrontWheelModel[0].addShapeBox(-3F, -3F, -2F, 6, 2, 2, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 520
		rightFrontWheelModel[0].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[0].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[1].addShapeBox(-3F, -1F, -2F, 6, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 521
		rightFrontWheelModel[1].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[1].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[2].addShapeBox(-3F, 1F, -2F, 6, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 522
		rightFrontWheelModel[2].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[2].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[3].addShapeBox(-8F, -3F, -1.5F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		rightFrontWheelModel[3].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[3].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[4].addShapeBox(-8F, 3F, -1.5F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 524
		rightFrontWheelModel[4].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[4].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[5].addShapeBox(6F, 2.5F, -2F, 1, 6, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F); // Box 525
		rightFrontWheelModel[5].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[5].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[6].addShapeBox(7F, 3F, -2F, 2, 6, 2, 0F,0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F); // Box 526
		rightFrontWheelModel[6].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[6].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[7].addShapeBox(-3.5F, 6F, -2F, 7, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		rightFrontWheelModel[7].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[7].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[8].addShapeBox(-4F, 7F, -2F, 8, 2, 2, 0F,-0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 528
		rightFrontWheelModel[8].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[8].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[9].addShapeBox(-7F, 2.5F, -2F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F); // Box 529
		rightFrontWheelModel[9].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[9].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[10].addShapeBox(-9F, 3F, -2F, 2, 6, 2, 0F,0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F); // Box 530
		rightFrontWheelModel[10].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[10].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[11].addShapeBox(-7F, -3.5F, -2F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 531
		rightFrontWheelModel[11].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[11].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[12].addShapeBox(-9F, -4F, -2F, 2, 8, 2, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F); // Box 532
		rightFrontWheelModel[12].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[12].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[13].addShapeBox(-7F, -8.5F, -2F, 1, 6, 2, 0F,-3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 533
		rightFrontWheelModel[13].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[13].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[14].addShapeBox(-9F, -9F, -2F, 2, 6, 2, 0F,-5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F); // Box 534
		rightFrontWheelModel[14].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[14].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[15].addShapeBox(-4F, -9F, -2F, 8, 2, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 535
		rightFrontWheelModel[15].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[15].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[16].addShapeBox(-3.5F, -7F, -2F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 536
		rightFrontWheelModel[16].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[16].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[17].addShapeBox(7F, -9F, -2F, 2, 6, 2, 0F,3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F); // Box 537
		rightFrontWheelModel[17].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[17].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[18].addShapeBox(6F, -8.5F, -2F, 1, 6, 2, 0F,3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 538
		rightFrontWheelModel[18].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[18].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[19].addShapeBox(6F, -3.5F, -2F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 539
		rightFrontWheelModel[19].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[19].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[20].addShapeBox(7F, -4F, -2F, 2, 8, 2, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F); // Box 540
		rightFrontWheelModel[20].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[20].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[21].addShapeBox(-1.5F, -1.5F, -3F, 3, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		rightFrontWheelModel[21].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[21].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[22].addShapeBox(-1.5F, -0.5F, -3F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		rightFrontWheelModel[22].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[22].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[23].addShapeBox(-1.5F, 0.5F, -3F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 543
		rightFrontWheelModel[23].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[23].rotateAngleX = 0.03490659F;

		rightFrontWheelModel[24].addShapeBox(-8F, -7F, -1.5F, 16, 4, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		rightFrontWheelModel[24].setRotationPoint(55.5F, 1F, -14F);
		rightFrontWheelModel[24].rotateAngleX = 0.03490659F;
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 432
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 433
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 434
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 435
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 436
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 437
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 438
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 439
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 440
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 441
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 442
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 443
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 444
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 445
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 446
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 447
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 448
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 449
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 450
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 451
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 452
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 453
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 454
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 455
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 456
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 457
		leftBackWheelModel[26] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 458
		leftBackWheelModel[27] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 459
		leftBackWheelModel[28] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 460
		leftBackWheelModel[29] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 461
		leftBackWheelModel[30] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 462
		leftBackWheelModel[31] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 463
		leftBackWheelModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 464
		leftBackWheelModel[33] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 465
		leftBackWheelModel[34] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 466
		leftBackWheelModel[35] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 467
		leftBackWheelModel[36] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 468
		leftBackWheelModel[37] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 469
		leftBackWheelModel[38] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 470
		leftBackWheelModel[39] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 471
		leftBackWheelModel[40] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 472
		leftBackWheelModel[41] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 473
		leftBackWheelModel[42] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 474
		leftBackWheelModel[43] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 475

		leftBackWheelModel[0].addShapeBox(7F, -4F, 0F, 2, 8, 2, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F); // Box 432
		leftBackWheelModel[0].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[0].rotateAngleX = -0.03490659F;

		leftBackWheelModel[1].addShapeBox(6F, -3.5F, 0F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 433
		leftBackWheelModel[1].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[1].rotateAngleX = -0.03490659F;

		leftBackWheelModel[2].addShapeBox(6F, 2.5F, 0F, 1, 6, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F); // Box 434
		leftBackWheelModel[2].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[2].rotateAngleX = -0.03490659F;

		leftBackWheelModel[3].addShapeBox(7F, 3F, 0F, 2, 6, 2, 0F,0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F); // Box 435
		leftBackWheelModel[3].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[3].rotateAngleX = -0.03490659F;

		leftBackWheelModel[4].addShapeBox(-4F, 7F, 0F, 8, 2, 2, 0F,-0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 436
		leftBackWheelModel[4].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[4].rotateAngleX = -0.03490659F;

		leftBackWheelModel[5].addShapeBox(-3.5F, 6F, 0F, 7, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		leftBackWheelModel[5].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[5].rotateAngleX = -0.03490659F;

		leftBackWheelModel[6].addShapeBox(-9F, 3F, 0F, 2, 6, 2, 0F,0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F); // Box 438
		leftBackWheelModel[6].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[6].rotateAngleX = -0.03490659F;

		leftBackWheelModel[7].addShapeBox(-7F, 2.5F, 0F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F); // Box 439
		leftBackWheelModel[7].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[7].rotateAngleX = -0.03490659F;

		leftBackWheelModel[8].addShapeBox(-7F, -3.5F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 440
		leftBackWheelModel[8].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[8].rotateAngleX = -0.03490659F;

		leftBackWheelModel[9].addShapeBox(-9F, -4F, 0F, 2, 8, 2, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F); // Box 441
		leftBackWheelModel[9].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[9].rotateAngleX = -0.03490659F;

		leftBackWheelModel[10].addShapeBox(-9F, -9F, 0F, 2, 6, 2, 0F,-5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F); // Box 442
		leftBackWheelModel[10].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[10].rotateAngleX = -0.03490659F;

		leftBackWheelModel[11].addShapeBox(-7F, -8.5F, 0F, 1, 6, 2, 0F,-3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 443
		leftBackWheelModel[11].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[11].rotateAngleX = -0.03490659F;

		leftBackWheelModel[12].addShapeBox(-4F, -9F, 0F, 8, 2, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 444
		leftBackWheelModel[12].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[12].rotateAngleX = -0.03490659F;

		leftBackWheelModel[13].addShapeBox(-3.5F, -7F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 445
		leftBackWheelModel[13].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[13].rotateAngleX = -0.03490659F;

		leftBackWheelModel[14].addShapeBox(7F, -9F, 0F, 2, 6, 2, 0F,3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F); // Box 446
		leftBackWheelModel[14].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[14].rotateAngleX = -0.03490659F;

		leftBackWheelModel[15].addShapeBox(6F, -8.5F, 0F, 1, 6, 2, 0F,3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 447
		leftBackWheelModel[15].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[15].rotateAngleX = -0.03490659F;

		leftBackWheelModel[16].addShapeBox(-8F, -7F, 0.5F, 16, 4, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		leftBackWheelModel[16].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[16].rotateAngleX = -0.03490659F;

		leftBackWheelModel[17].addShapeBox(-8F, -3F, 0.5F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		leftBackWheelModel[17].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[17].rotateAngleX = -0.03490659F;

		leftBackWheelModel[18].addShapeBox(-8F, 3F, 0.5F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 450
		leftBackWheelModel[18].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[18].rotateAngleX = -0.03490659F;

		leftBackWheelModel[19].addShapeBox(-3F, 1F, 0F, 6, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 451
		leftBackWheelModel[19].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[19].rotateAngleX = -0.03490659F;

		leftBackWheelModel[20].addShapeBox(-3F, -1F, 0F, 6, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 452
		leftBackWheelModel[20].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[20].rotateAngleX = -0.03490659F;

		leftBackWheelModel[21].addShapeBox(-3F, -3F, 0F, 6, 2, 2, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 453
		leftBackWheelModel[21].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[21].rotateAngleX = -0.03490659F;

		leftBackWheelModel[22].addShapeBox(7F, -4F, 2.5F, 2, 8, 2, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F); // Box 454
		leftBackWheelModel[22].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[22].rotateAngleX = -0.03490659F;

		leftBackWheelModel[23].addShapeBox(6F, -3.5F, 2.5F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 455
		leftBackWheelModel[23].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[23].rotateAngleX = -0.03490659F;

		leftBackWheelModel[24].addShapeBox(6F, 2.5F, 2.5F, 1, 6, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F); // Box 456
		leftBackWheelModel[24].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[24].rotateAngleX = -0.03490659F;

		leftBackWheelModel[25].addShapeBox(7F, 3F, 2.5F, 2, 6, 2, 0F,0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F); // Box 457
		leftBackWheelModel[25].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[25].rotateAngleX = -0.03490659F;

		leftBackWheelModel[26].addShapeBox(-4F, 7F, 2.5F, 8, 2, 2, 0F,-0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 458
		leftBackWheelModel[26].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[26].rotateAngleX = -0.03490659F;

		leftBackWheelModel[27].addShapeBox(-3.5F, 6F, 2.5F, 7, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		leftBackWheelModel[27].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[27].rotateAngleX = -0.03490659F;

		leftBackWheelModel[28].addShapeBox(-9F, 3F, 2.5F, 2, 6, 2, 0F,0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F); // Box 460
		leftBackWheelModel[28].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[28].rotateAngleX = -0.03490659F;

		leftBackWheelModel[29].addShapeBox(-7F, 2.5F, 2.5F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F); // Box 461
		leftBackWheelModel[29].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[29].rotateAngleX = -0.03490659F;

		leftBackWheelModel[30].addShapeBox(-7F, -3.5F, 2.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 462
		leftBackWheelModel[30].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[30].rotateAngleX = -0.03490659F;

		leftBackWheelModel[31].addShapeBox(-9F, -4F, 2.5F, 2, 8, 2, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F); // Box 463
		leftBackWheelModel[31].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[31].rotateAngleX = -0.03490659F;

		leftBackWheelModel[32].addShapeBox(-9F, -9F, 2.5F, 2, 6, 2, 0F,-5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F); // Box 464
		leftBackWheelModel[32].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[32].rotateAngleX = -0.03490659F;

		leftBackWheelModel[33].addShapeBox(-7F, -8.5F, 2.5F, 1, 6, 2, 0F,-3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 465
		leftBackWheelModel[33].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[33].rotateAngleX = -0.03490659F;

		leftBackWheelModel[34].addShapeBox(-4F, -9F, 2.5F, 8, 2, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 466
		leftBackWheelModel[34].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[34].rotateAngleX = -0.03490659F;

		leftBackWheelModel[35].addShapeBox(-3.5F, -7F, 2.5F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		leftBackWheelModel[35].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[35].rotateAngleX = -0.03490659F;

		leftBackWheelModel[36].addShapeBox(7F, -9F, 2.5F, 2, 6, 2, 0F,3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F); // Box 468
		leftBackWheelModel[36].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[36].rotateAngleX = -0.03490659F;

		leftBackWheelModel[37].addShapeBox(6F, -8.5F, 2.5F, 1, 6, 2, 0F,3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 469
		leftBackWheelModel[37].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[37].rotateAngleX = -0.03490659F;

		leftBackWheelModel[38].addShapeBox(-8F, -7F, 3F, 16, 4, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		leftBackWheelModel[38].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[38].rotateAngleX = -0.03490659F;

		leftBackWheelModel[39].addShapeBox(-8F, -3F, 3F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		leftBackWheelModel[39].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[39].rotateAngleX = -0.03490659F;

		leftBackWheelModel[40].addShapeBox(-8F, 3F, 3F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 472
		leftBackWheelModel[40].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[40].rotateAngleX = -0.03490659F;

		leftBackWheelModel[41].addShapeBox(-3F, 1F, 2.5F, 6, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 473
		leftBackWheelModel[41].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[41].rotateAngleX = -0.03490659F;

		leftBackWheelModel[42].addShapeBox(-3F, -1F, 2.5F, 6, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 474
		leftBackWheelModel[42].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[42].rotateAngleX = -0.03490659F;

		leftBackWheelModel[43].addShapeBox(-3F, -3F, 2.5F, 6, 2, 2, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 475
		leftBackWheelModel[43].setRotationPoint(-20.5F, 1F, 15F);
		leftBackWheelModel[43].rotateAngleX = -0.03490659F;
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 423
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 424
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 425
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 544
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 545
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 546
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 547
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 548
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 549
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 550
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 551
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 552
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 553
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 554
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 555
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 556
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 557
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 558
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 559
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 560
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 561
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 562
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 563
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 564
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 571
		rightBackWheelModel[25] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 572
		rightBackWheelModel[26] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 573
		rightBackWheelModel[27] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 574
		rightBackWheelModel[28] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 575
		rightBackWheelModel[29] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 576
		rightBackWheelModel[30] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 577
		rightBackWheelModel[31] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 578
		rightBackWheelModel[32] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 579
		rightBackWheelModel[33] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 580
		rightBackWheelModel[34] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 581
		rightBackWheelModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 582
		rightBackWheelModel[36] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 583
		rightBackWheelModel[37] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 584
		rightBackWheelModel[38] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 585
		rightBackWheelModel[39] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 586
		rightBackWheelModel[40] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 587
		rightBackWheelModel[41] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 588
		rightBackWheelModel[42] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 589
		rightBackWheelModel[43] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 590

		rightBackWheelModel[0].addShapeBox(-1.5F, -1.5F, -20F, 3, 1, 40, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		rightBackWheelModel[0].setRotationPoint(-20.5F, 1F, 0F);

		rightBackWheelModel[1].addShapeBox(-1.5F, -0.5F, -20F, 3, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		rightBackWheelModel[1].setRotationPoint(-20.5F, 1F, 0F);

		rightBackWheelModel[2].addShapeBox(-1.5F, 0.5F, -20F, 3, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 425
		rightBackWheelModel[2].setRotationPoint(-20.5F, 1F, 0F);

		rightBackWheelModel[3].addShapeBox(-3F, -3F, -2F, 6, 2, 2, 0F,-1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 544
		rightBackWheelModel[3].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[3].rotateAngleX = 0.03490659F;

		rightBackWheelModel[4].addShapeBox(-3F, -1F, -2F, 6, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 545
		rightBackWheelModel[4].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[4].rotateAngleX = 0.03490659F;

		rightBackWheelModel[5].addShapeBox(-3F, 1F, -2F, 6, 2, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F); // Box 546
		rightBackWheelModel[5].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[5].rotateAngleX = 0.03490659F;

		rightBackWheelModel[6].addShapeBox(-8F, -3F, -1.5F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		rightBackWheelModel[6].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[6].rotateAngleX = 0.03490659F;

		rightBackWheelModel[7].addShapeBox(-8F, 3F, -1.5F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 548
		rightBackWheelModel[7].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[7].rotateAngleX = 0.03490659F;

		rightBackWheelModel[8].addShapeBox(6F, 2.5F, -2F, 1, 6, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F); // Box 549
		rightBackWheelModel[8].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[8].rotateAngleX = 0.03490659F;

		rightBackWheelModel[9].addShapeBox(7F, 3F, -2F, 2, 6, 2, 0F,0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F); // Box 550
		rightBackWheelModel[9].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[9].rotateAngleX = 0.03490659F;

		rightBackWheelModel[10].addShapeBox(-3.5F, 6F, -2F, 7, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		rightBackWheelModel[10].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[10].rotateAngleX = 0.03490659F;

		rightBackWheelModel[11].addShapeBox(-4F, 7F, -2F, 8, 2, 2, 0F,-0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 552
		rightBackWheelModel[11].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[11].rotateAngleX = 0.03490659F;

		rightBackWheelModel[12].addShapeBox(-7F, 2.5F, -2F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F); // Box 553
		rightBackWheelModel[12].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[12].rotateAngleX = 0.03490659F;

		rightBackWheelModel[13].addShapeBox(-9F, 3F, -2F, 2, 6, 2, 0F,0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F); // Box 554
		rightBackWheelModel[13].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[13].rotateAngleX = 0.03490659F;

		rightBackWheelModel[14].addShapeBox(-7F, -3.5F, -2F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 555
		rightBackWheelModel[14].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[14].rotateAngleX = 0.03490659F;

		rightBackWheelModel[15].addShapeBox(-9F, -4F, -2F, 2, 8, 2, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F); // Box 556
		rightBackWheelModel[15].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[15].rotateAngleX = 0.03490659F;

		rightBackWheelModel[16].addShapeBox(-7F, -8.5F, -2F, 1, 6, 2, 0F,-3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 557
		rightBackWheelModel[16].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[16].rotateAngleX = 0.03490659F;

		rightBackWheelModel[17].addShapeBox(-9F, -9F, -2F, 2, 6, 2, 0F,-5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F); // Box 558
		rightBackWheelModel[17].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[17].rotateAngleX = 0.03490659F;

		rightBackWheelModel[18].addShapeBox(-4F, -9F, -2F, 8, 2, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 559
		rightBackWheelModel[18].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[18].rotateAngleX = 0.03490659F;

		rightBackWheelModel[19].addShapeBox(-3.5F, -7F, -2F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 560
		rightBackWheelModel[19].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[19].rotateAngleX = 0.03490659F;

		rightBackWheelModel[20].addShapeBox(7F, -9F, -2F, 2, 6, 2, 0F,3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F); // Box 561
		rightBackWheelModel[20].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[20].rotateAngleX = 0.03490659F;

		rightBackWheelModel[21].addShapeBox(6F, -8.5F, -2F, 1, 6, 2, 0F,3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 562
		rightBackWheelModel[21].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[21].rotateAngleX = 0.03490659F;

		rightBackWheelModel[22].addShapeBox(6F, -3.5F, -2F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 563
		rightBackWheelModel[22].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[22].rotateAngleX = 0.03490659F;

		rightBackWheelModel[23].addShapeBox(7F, -4F, -2F, 2, 8, 2, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F); // Box 564
		rightBackWheelModel[23].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[23].rotateAngleX = 0.03490659F;

		rightBackWheelModel[24].addShapeBox(-8F, -3F, -4F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		rightBackWheelModel[24].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[24].rotateAngleX = 0.03490659F;

		rightBackWheelModel[25].addShapeBox(-8F, 3F, -4F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 572
		rightBackWheelModel[25].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[25].rotateAngleX = 0.03490659F;

		rightBackWheelModel[26].addShapeBox(6F, 2.5F, -4.5F, 1, 6, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F); // Box 573
		rightBackWheelModel[26].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[26].rotateAngleX = 0.03490659F;

		rightBackWheelModel[27].addShapeBox(7F, 3F, -4.5F, 2, 6, 2, 0F,0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F); // Box 574
		rightBackWheelModel[27].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[27].rotateAngleX = 0.03490659F;

		rightBackWheelModel[28].addShapeBox(-3.5F, 6F, -4.5F, 7, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		rightBackWheelModel[28].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[28].rotateAngleX = 0.03490659F;

		rightBackWheelModel[29].addShapeBox(-4F, 7F, -4.5F, 8, 2, 2, 0F,-0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 576
		rightBackWheelModel[29].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[29].rotateAngleX = 0.03490659F;

		rightBackWheelModel[30].addShapeBox(-7F, 2.5F, -4.5F, 1, 6, 2, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F); // Box 577
		rightBackWheelModel[30].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[30].rotateAngleX = 0.03490659F;

		rightBackWheelModel[31].addShapeBox(-9F, 3F, -4.5F, 2, 6, 2, 0F,0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F); // Box 578
		rightBackWheelModel[31].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[31].rotateAngleX = 0.03490659F;

		rightBackWheelModel[32].addShapeBox(-7F, -3.5F, -4.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 579
		rightBackWheelModel[32].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[32].rotateAngleX = 0.03490659F;

		rightBackWheelModel[33].addShapeBox(-9F, -4F, -4.5F, 2, 8, 2, 0F,0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F); // Box 580
		rightBackWheelModel[33].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[33].rotateAngleX = 0.03490659F;

		rightBackWheelModel[34].addShapeBox(-7F, -8.5F, -4.5F, 1, 6, 2, 0F,-3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 3F, -2.5F, 0F, -3.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 581
		rightBackWheelModel[34].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[34].rotateAngleX = 0.03490659F;

		rightBackWheelModel[35].addShapeBox(-9F, -9F, -4.5F, 2, 6, 2, 0F,-5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 3.5F, -2F, 0.1F, -5F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F); // Box 582
		rightBackWheelModel[35].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[35].rotateAngleX = 0.03490659F;

		rightBackWheelModel[36].addShapeBox(-4F, -9F, -4.5F, 8, 2, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F); // Box 583
		rightBackWheelModel[36].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[36].rotateAngleX = 0.03490659F;

		rightBackWheelModel[37].addShapeBox(-3.5F, -7F, -4.5F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 584
		rightBackWheelModel[37].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[37].rotateAngleX = 0.03490659F;

		rightBackWheelModel[38].addShapeBox(7F, -9F, -4.5F, 2, 6, 2, 0F,3.5F, -2F, 0.1F, -5F, 0F, 0.1F, -5F, 0F, 0.1F, 3.5F, -2F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0.1F, 0F, -0.5F, 0.1F); // Box 585
		rightBackWheelModel[38].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[38].rotateAngleX = 0.03490659F;

		rightBackWheelModel[39].addShapeBox(6F, -8.5F, -4.5F, 1, 6, 2, 0F,3F, -2.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, 3F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 586
		rightBackWheelModel[39].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[39].rotateAngleX = 0.03490659F;

		rightBackWheelModel[40].addShapeBox(6F, -3.5F, -4.5F, 1, 7, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 587
		rightBackWheelModel[40].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[40].rotateAngleX = 0.03490659F;

		rightBackWheelModel[41].addShapeBox(7F, -4F, -4.5F, 2, 8, 2, 0F,0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F); // Box 588
		rightBackWheelModel[41].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[41].rotateAngleX = 0.03490659F;

		rightBackWheelModel[42].addShapeBox(-8F, -7F, -4F, 16, 4, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		rightBackWheelModel[42].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[42].rotateAngleX = 0.03490659F;

		rightBackWheelModel[43].addShapeBox(-8F, -7F, -1.5F, 16, 4, 1, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		rightBackWheelModel[43].setRotationPoint(-20.5F, 1F, -15F);
		rightBackWheelModel[43].rotateAngleX = 0.03490659F;
	}

	private void initsteeringWheelModel_1()
	{
		steeringWheelModel[0] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 69
		steeringWheelModel[1] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 71
		steeringWheelModel[2] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 74
		steeringWheelModel[3] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 75
		steeringWheelModel[4] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 81
		steeringWheelModel[5] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 82
		steeringWheelModel[6] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 83
		steeringWheelModel[7] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 84
		steeringWheelModel[8] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 85
		steeringWheelModel[9] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 86
		steeringWheelModel[10] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Box 87

		steeringWheelModel[0].addBox(-3F, -0.5F, -0.5F, 9, 1, 1, 0F); // Box 69
		steeringWheelModel[0].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[0].rotateAngleZ = -0.2268928F;

		steeringWheelModel[1].addShapeBox(-4F, -2.5F, -4.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 71
		steeringWheelModel[1].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[1].rotateAngleZ = -0.2268928F;

		steeringWheelModel[2].addShapeBox(-4F, -4.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 74
		steeringWheelModel[2].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[2].rotateAngleZ = -0.2268928F;

		steeringWheelModel[3].addShapeBox(-4F, -4.5F, -4.5F, 1, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		steeringWheelModel[3].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[3].rotateAngleZ = -0.2268928F;

		steeringWheelModel[4].addShapeBox(-4F, -2.5F, 3.5F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		steeringWheelModel[4].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[4].rotateAngleZ = -0.2268928F;

		steeringWheelModel[5].addShapeBox(-4F, -4.5F, 3.5F, 1, 3, 1, 0F,0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 82
		steeringWheelModel[5].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[5].rotateAngleZ = -0.2268928F;

		steeringWheelModel[6].addShapeBox(-4F, 1.5F, 3.5F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 83
		steeringWheelModel[6].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[6].rotateAngleZ = -0.2268928F;

		steeringWheelModel[7].addShapeBox(-4F, 3.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		steeringWheelModel[7].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[7].rotateAngleZ = -0.2268928F;

		steeringWheelModel[8].addShapeBox(-4F, 1.5F, -4.5F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1.5F, 0F, -1F, 1.5F); // Box 85
		steeringWheelModel[8].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[8].rotateAngleZ = -0.2268928F;

		steeringWheelModel[9].addBox(-4F, -0.5F, -3.5F, 1, 1, 7, 0F); // Box 86
		steeringWheelModel[9].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[9].rotateAngleZ = -0.2268928F;

		steeringWheelModel[10].addBox(-4F, 0.5F, -0.5F, 1, 3, 1, 0F); // Box 87
		steeringWheelModel[10].setRotationPoint(18F, -12F, -6F);
		steeringWheelModel[10].rotateAngleZ = -0.2268928F;
	}

	private void initGuns() {
	}
	{

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[7];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Box 117
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 118
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 57, 297, textureX, textureY); // Box 119
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Box 120
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 73, 297, textureX, textureY); // Box 121
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 81, 297, textureX, textureY); // Box 122
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 89, 297, textureX, textureY); // Box 123

		gun_3_Model[0][0].addShapeBox(-0.5F, -0.4F, 0.5F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 117

		gun_3_Model[0][1].addShapeBox(-0.5F, -0.4F, 0.5F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118

		gun_3_Model[0][2].addShapeBox(-0.5F, -0.4F, -1.5F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119

		gun_3_Model[0][3].addShapeBox(-0.5F, -0.4F, -1.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120

		gun_3_Model[0][4].addShapeBox(-0.5F, 0.6F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 121

		gun_3_Model[0][5].addShapeBox(-0.5F, 0.6F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122

		gun_3_Model[0][6].addShapeBox(-0.5F, 0.6F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-37F, -24F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[105];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 0
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 1
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 2
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 97, 281, textureX, textureY); // Box 3
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 4
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 5
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 6
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 7
		gun_3_Model[1][8] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 8
		gun_3_Model[1][9] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 9
		gun_3_Model[1][10] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Box 10
		gun_3_Model[1][11] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Box 11
		gun_3_Model[1][12] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 12
		gun_3_Model[1][13] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 13
		gun_3_Model[1][14] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Box 14
		gun_3_Model[1][15] = new ModelRendererTurbo(this, 241, 281, textureX, textureY); // Box 15
		gun_3_Model[1][16] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 16
		gun_3_Model[1][17] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 17
		gun_3_Model[1][18] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Box 18
		gun_3_Model[1][19] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 19
		gun_3_Model[1][20] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 20
		gun_3_Model[1][21] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Box 21
		gun_3_Model[1][22] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 22
		gun_3_Model[1][23] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 23
		gun_3_Model[1][24] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Box 24
		gun_3_Model[1][25] = new ModelRendererTurbo(this, 337, 281, textureX, textureY); // Box 25
		gun_3_Model[1][26] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 26
		gun_3_Model[1][27] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Box 27
		gun_3_Model[1][28] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 28
		gun_3_Model[1][29] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 29
		gun_3_Model[1][30] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Box 30
		gun_3_Model[1][31] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 31
		gun_3_Model[1][32] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Box 32
		gun_3_Model[1][33] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 33
		gun_3_Model[1][34] = new ModelRendererTurbo(this, 417, 281, textureX, textureY); // Box 34
		gun_3_Model[1][35] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 35
		gun_3_Model[1][36] = new ModelRendererTurbo(this, 449, 281, textureX, textureY); // Box 36
		gun_3_Model[1][37] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 37
		gun_3_Model[1][38] = new ModelRendererTurbo(this, 481, 281, textureX, textureY); // Box 41
		gun_3_Model[1][39] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 44
		gun_3_Model[1][40] = new ModelRendererTurbo(this, 497, 281, textureX, textureY); // Box 46
		gun_3_Model[1][41] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 47
		gun_3_Model[1][42] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 48
		gun_3_Model[1][43] = new ModelRendererTurbo(this, 9, 289, textureX, textureY); // Box 49
		gun_3_Model[1][44] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Box 50
		gun_3_Model[1][45] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Box 51
		gun_3_Model[1][46] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 52
		gun_3_Model[1][47] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Box 53
		gun_3_Model[1][48] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Box 54
		gun_3_Model[1][49] = new ModelRendererTurbo(this, 65, 289, textureX, textureY); // Box 55
		gun_3_Model[1][50] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 56
		gun_3_Model[1][51] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Box 57
		gun_3_Model[1][52] = new ModelRendererTurbo(this, 89, 289, textureX, textureY); // Box 58
		gun_3_Model[1][53] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 59
		gun_3_Model[1][54] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Box 60
		gun_3_Model[1][55] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Box 61
		gun_3_Model[1][56] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Box 62
		gun_3_Model[1][57] = new ModelRendererTurbo(this, 153, 289, textureX, textureY); // Box 63
		gun_3_Model[1][58] = new ModelRendererTurbo(this, 161, 289, textureX, textureY); // Box 64
		gun_3_Model[1][59] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Box 65
		gun_3_Model[1][60] = new ModelRendererTurbo(this, 177, 289, textureX, textureY); // Box 66
		gun_3_Model[1][61] = new ModelRendererTurbo(this, 185, 289, textureX, textureY); // Box 67
		gun_3_Model[1][62] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Box 68
		gun_3_Model[1][63] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Box 69
		gun_3_Model[1][64] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Box 71
		gun_3_Model[1][65] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Box 72
		gun_3_Model[1][66] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Box 73
		gun_3_Model[1][67] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Box 74
		gun_3_Model[1][68] = new ModelRendererTurbo(this, 241, 289, textureX, textureY); // Box 75
		gun_3_Model[1][69] = new ModelRendererTurbo(this, 249, 289, textureX, textureY); // Box 77
		gun_3_Model[1][70] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Box 79
		gun_3_Model[1][71] = new ModelRendererTurbo(this, 265, 289, textureX, textureY); // Box 80
		gun_3_Model[1][72] = new ModelRendererTurbo(this, 273, 289, textureX, textureY); // Box 81
		gun_3_Model[1][73] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Box 82
		gun_3_Model[1][74] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Box 83
		gun_3_Model[1][75] = new ModelRendererTurbo(this, 297, 289, textureX, textureY); // Box 85
		gun_3_Model[1][76] = new ModelRendererTurbo(this, 305, 289, textureX, textureY); // Box 86
		gun_3_Model[1][77] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Box 87
		gun_3_Model[1][78] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 88
		gun_3_Model[1][79] = new ModelRendererTurbo(this, 329, 289, textureX, textureY); // Box 89
		gun_3_Model[1][80] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Box 90
		gun_3_Model[1][81] = new ModelRendererTurbo(this, 345, 289, textureX, textureY); // Box 91
		gun_3_Model[1][82] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Box 92
		gun_3_Model[1][83] = new ModelRendererTurbo(this, 361, 289, textureX, textureY); // Box 93
		gun_3_Model[1][84] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Box 94
		gun_3_Model[1][85] = new ModelRendererTurbo(this, 377, 289, textureX, textureY); // Box 95
		gun_3_Model[1][86] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Box 96
		gun_3_Model[1][87] = new ModelRendererTurbo(this, 393, 289, textureX, textureY); // Box 97
		gun_3_Model[1][88] = new ModelRendererTurbo(this, 409, 289, textureX, textureY); // Box 98
		gun_3_Model[1][89] = new ModelRendererTurbo(this, 425, 289, textureX, textureY); // Box 99
		gun_3_Model[1][90] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 100
		gun_3_Model[1][91] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Box 102
		gun_3_Model[1][92] = new ModelRendererTurbo(this, 449, 289, textureX, textureY); // Box 103
		gun_3_Model[1][93] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Box 104
		gun_3_Model[1][94] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Box 105
		gun_3_Model[1][95] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Box 106
		gun_3_Model[1][96] = new ModelRendererTurbo(this, 481, 289, textureX, textureY); // Box 107
		gun_3_Model[1][97] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Box 108
		gun_3_Model[1][98] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Box 109
		gun_3_Model[1][99] = new ModelRendererTurbo(this, 505, 289, textureX, textureY); // Box 109
		gun_3_Model[1][100] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 110
		gun_3_Model[1][101] = new ModelRendererTurbo(this, 9, 297, textureX, textureY); // Box 111
		gun_3_Model[1][102] = new ModelRendererTurbo(this, 17, 297, textureX, textureY); // Box 112
		gun_3_Model[1][103] = new ModelRendererTurbo(this, 25, 297, textureX, textureY); // Box 113
		gun_3_Model[1][104] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Box 115

		gun_3_Model[1][0].addShapeBox(-2.8F, -2.5F, -1F, 10, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F); // Box 0

		gun_3_Model[1][1].addShapeBox(-2.8F, -2.5F, -1F, 10, 2, 2, 0F,0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1

		gun_3_Model[1][2].addShapeBox(-2.8F, -2.5F, -1F, 10, 2, 2, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 2

		gun_3_Model[1][3].addShapeBox(7.2F, -2F, -0.5F, 2, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 3

		gun_3_Model[1][4].addShapeBox(7.2F, -2F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F); // Box 4

		gun_3_Model[1][5].addShapeBox(7.2F, -2F, -0.5F, 2, 1, 1, 0F,0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F); // Box 5

		gun_3_Model[1][6].addShapeBox(7.2F, -2.5F, -1F, 1, 2, 2, 0F,0F, -0.6F, 0F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.6F, 0F); // Box 6

		gun_3_Model[1][7].addShapeBox(7.2F, -2.5F, -1F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, -0.5F, 0F, -1.4F, 0F, 0F, -1.3F, -0.2F, 0F, -1.3F, -0.2F, 0F, -1.4F, 0F); // Box 7

		gun_3_Model[1][8].addShapeBox(7.2F, -2.5F, -1F, 1, 2, 2, 0F,0F, -1.4F, 0F, 0F, -1.3F, -0.2F, 0F, -1.3F, -0.2F, 0F, -1.4F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0F, -0.5F); // Box 8

		gun_3_Model[1][9].addShapeBox(8.2F, -2F, -0.8F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F, -0.9F); // Box 9

		gun_3_Model[1][10].addShapeBox(8.2F, -2.3F, -0.5F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 10

		gun_3_Model[1][11].addShapeBox(8.2F, -2.6F, -0.8F, 4, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F); // Box 11

		gun_3_Model[1][12].addShapeBox(8.2F, -1.7F, -0.5F, 4, 1, 1, 0F,0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 12

		gun_3_Model[1][13].addShapeBox(8.2F, -1.4F, -0.8F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 13

		gun_3_Model[1][14].addShapeBox(8.2F, -1.4F, -0.2F, 4, 1, 1, 0F,0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 14

		gun_3_Model[1][15].addShapeBox(8.2F, -2F, -0.2F, 4, 1, 1, 0F,0F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 15

		gun_3_Model[1][16].addShapeBox(8.2F, -2.6F, -0.2F, 4, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 16

		gun_3_Model[1][17].addShapeBox(-3.05F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F); // Box 17

		gun_3_Model[1][18].addShapeBox(-3.05F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F); // Box 18

		gun_3_Model[1][19].addShapeBox(-3.05F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F); // Box 19

		gun_3_Model[1][20].addShapeBox(-2F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F); // Box 20

		gun_3_Model[1][21].addShapeBox(-2F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F); // Box 21

		gun_3_Model[1][22].addShapeBox(-2F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F); // Box 22

		gun_3_Model[1][23].addShapeBox(4.2F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F); // Box 23

		gun_3_Model[1][24].addShapeBox(4.2F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F, -0.3F, -0.55F, 0.05F); // Box 24

		gun_3_Model[1][25].addShapeBox(4.2F, -2.5F, -1F, 1, 2, 2, 0F,-0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, 0.05F, -0.45F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F, -0.3F, -1.45F, 0.05F); // Box 25

		gun_3_Model[1][26].addShapeBox(-12.3F, -1.75F, -0.5F, 2, 1, 1, 0F,0.5F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.6F, 0F, 0.5F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, 0.2F, 0F); // Box 26

		gun_3_Model[1][27].addShapeBox(-6.1F, -0.1F, -0.5F, 1, 1, 1, 0F,0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F, -0.2F, -0.5F, -0.05F); // Box 27

		gun_3_Model[1][28].addShapeBox(-6.1F, -1.1F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, -0.5F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, -0.05F); // Box 28

		gun_3_Model[1][29].addShapeBox(-6.1F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F); // Box 29

		gun_3_Model[1][30].addShapeBox(-6.1F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F); // Box 30

		gun_3_Model[1][31].addShapeBox(-6.1F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.2F, -0.6F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F, -0.4F, -0.2F, 0.05F); // Box 31

		gun_3_Model[1][32].addShapeBox(-10.3F, -1.8F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 32

		gun_3_Model[1][33].addShapeBox(-5F, -0.6F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.7F, -0.05F, -0.5F, -0.9F, -0.05F, -0.5F, -0.9F, -0.05F, 0F, -0.7F, -0.05F); // Box 33

		gun_3_Model[1][34].addShapeBox(-10.3F, -2.8F, -0.5F, 3, 1, 1, 0F,-0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, 0.1F, -0.8F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_3_Model[1][35].addShapeBox(-9.3F, -1.8F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F); // Box 35

		gun_3_Model[1][36].addShapeBox(-4.8F, -2.5F, -1F, 2, 2, 2, 0F,-0.5F, -1.4F, -0.2F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.5F, -1.4F, -0.2F, -0.5F, -0.1F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.1F, -0.7F); // Box 36

		gun_3_Model[1][37].addShapeBox(-4.8F, -2.5F, -1F, 2, 2, 2, 0F,-0.5F, -0.7F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, -0.6F, -0.2F); // Box 37

		gun_3_Model[1][38].addShapeBox(-6.05F, -2.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 41

		gun_3_Model[1][39].addShapeBox(-6.05F, -2.85F, -2.2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 44

		gun_3_Model[1][40].addShapeBox(-3.85F, -2.85F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 46

		gun_3_Model[1][41].addShapeBox(-4.85F, -2.85F, -2.2F, 2, 1, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, -1.2F, -1F, 0F, 0.7F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1.2F, -1F, 0F, 0.7F, -0.3F, 0F, 0F); // Box 47

		gun_3_Model[1][42].addShapeBox(-7.25F, -2.85F, -2.2F, 2, 1, 1, 0F,0F, 0F, -1.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0.7F, 0F, 0F, -1.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0.7F); // Box 48

		gun_3_Model[1][43].addShapeBox(-7.25F, -2.85F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 49

		gun_3_Model[1][44].addShapeBox(-7.25F, -2.85F, 1.2F, 2, 1, 1, 0F,-1F, 0F, 0.7F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1.2F, -1F, 0F, 0.7F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1.2F); // Box 50

		gun_3_Model[1][45].addShapeBox(-4.85F, -2.85F, 1.2F, 2, 1, 1, 0F,-0.3F, 0F, 0F, -1F, 0F, 0.7F, 0F, 0F, -1.2F, -0.8F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0.7F, 0F, 0F, -1.2F, -0.8F, 0F, 0F); // Box 51

		gun_3_Model[1][46].addShapeBox(-6.05F, -2.85F, 1.2F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_3_Model[1][47].addShapeBox(-6.55F, -2.85F, -1.5F, 3, 1, 3, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 53

		gun_3_Model[1][48].addShapeBox(-5.55F, -2.85F, -1F, 1, 1, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F); // Box 54

		gun_3_Model[1][49].addShapeBox(-12.3F, -2.55F, -0.5F, 2, 1, 1, 0F,0.5F, -1.1F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0.5F, -1.1F, -0.2F, 0.5F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.4F, 0F); // Box 55

		gun_3_Model[1][50].addShapeBox(-12.3F, -0.15F, -0.5F, 2, 1, 1, 0F,0.5F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.4F, 0F, 0.5F, -1F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F, -0.2F, 0.5F, -1F, -0.2F); // Box 56

		gun_3_Model[1][51].addShapeBox(-13.8F, -1.55F, -0.5F, 1, 1, 1, 0F,-0.7F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 57

		gun_3_Model[1][52].addShapeBox(-13.8F, -2.15F, -0.5F, 1, 1, 1, 0F,-0.7F, -0.6F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -0.7F, -0.6F, -0.2F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 58

		gun_3_Model[1][53].addShapeBox(-13.8F, -0.55F, -0.5F, 1, 1, 1, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.4F, -0.3F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, -0.7F, -0.4F, -0.3F); // Box 59

		gun_3_Model[1][54].addShapeBox(-16.1F, -1.55F, -0.5F, 3, 1, 1, 0F,-0.5F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.8F, 0F); // Box 60

		gun_3_Model[1][55].addShapeBox(-16.1F, -1.55F, -0.5F, 3, 1, 1, 0F,-0.4F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, -0.2F, -0.2F, -0.5F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, -0.3F, 0F); // Box 61

		gun_3_Model[1][56].addShapeBox(-16.1F, -1.15F, -0.5F, 3, 1, 1, 0F,-0.5F, -1.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, -1.4F, 0F, -0.3F, 1.3F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.3F, 1.3F, -0.3F); // Box 62

		gun_3_Model[1][57].addShapeBox(-9F, 0.4F, -0.5F, 1, 1, 1, 0F,0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.3F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F); // Box 63

		gun_3_Model[1][58].addShapeBox(-9F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.1F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 64

		gun_3_Model[1][59].addShapeBox(-9F, 0.4F, -0.5F, 1, 1, 1, 0F,0.3F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F); // Box 65

		gun_3_Model[1][60].addShapeBox(-9F, 1F, -0.5F, 1, 1, 1, 0F,0.3F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, 0.3F, -0.2F, -0.3F, 0.1F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, 0.1F, -0.5F, -0.3F); // Box 66

		gun_3_Model[1][61].addShapeBox(-8F, -0.9F, -0.5F, 1, 1, 1, 0F,0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 67

		gun_3_Model[1][62].addShapeBox(-7F, -0.9F, -0.5F, 1, 1, 1, 0F,0F, -0.9F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, -0.5F, -1F, -0.3F, -0.5F, -1F, -0.3F, 0F, 0F, -0.3F); // Box 68

		gun_3_Model[1][63].addShapeBox(-8F, -0.9F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F); // Box 69

		gun_3_Model[1][64].addShapeBox(-8F, -0.9F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.4F, -0.5F, -0.35F, -0.6F, -0.2F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.6F, -0.2F, -0.35F); // Box 71

		gun_3_Model[1][65].addShapeBox(-8.8F, -4F, -0.5F, 1, 2, 1, 0F,-0.9F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F, -0.9F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, -0.9F, 0F, -0.2F); // Box 72

		gun_3_Model[1][66].addShapeBox(-8.8F, -4F, -0.5F, 1, 2, 1, 0F,-0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.9F, 0F, -0.7F, -0.9F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, -0.9F, 0F, -0.7F); // Box 73

		gun_3_Model[1][67].addShapeBox(-8.8F, -4F, -0.5F, 1, 1, 1, 0F,-0.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F); // Box 74

		gun_3_Model[1][68].addShapeBox(-8.8F, -3F, -0.5F, 1, 1, 1, 0F,-0.9F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, -0.9F, -0.9F, -0.3F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F); // Box 75

		gun_3_Model[1][69].addShapeBox(-8.8F, -4.5F, -0.5F, 1, 1, 1, 0F,-0.91F, -1F, -0.25F, -0.01F, -1F, -0.25F, -0.01F, -0.9F, -0.6F, -0.91F, -0.9F, -0.6F, -0.91F, 0.1F, -0.35F, -0.01F, 0.1F, -0.35F, -0.01F, 0F, -0.55F, -0.91F, 0F, -0.55F); // Box 77

		gun_3_Model[1][70].addShapeBox(-8.8F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.91F, 0F, -0.55F, -0.01F, 0F, -0.55F, -0.01F, 0.1F, -0.35F, -0.91F, 0.1F, -0.35F, -0.91F, -0.9F, -0.6F, -0.01F, -0.9F, -0.6F, -0.01F, -1F, -0.25F, -0.91F, -1F, -0.25F); // Box 79

		gun_3_Model[1][71].addShapeBox(-8.8F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.91F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.91F, 0F, -0.45F, -0.91F, -0.9F, -0.4F, -0.01F, -0.9F, -0.4F, -0.01F, -0.9F, -0.4F, -0.91F, -0.9F, -0.4F); // Box 80

		gun_3_Model[1][72].addShapeBox(-8.8F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.91F, 0.1F, -0.35F, -0.01F, 0.1F, -0.35F, -0.01F, 0F, -0.55F, -0.91F, 0F, -0.55F, -0.91F, -1F, -0.25F, -0.01F, -1F, -0.25F, -0.01F, -0.9F, -0.6F, -0.91F, -0.9F, -0.6F); // Box 81

		gun_3_Model[1][73].addShapeBox(-8.8F, -4F, -0.5F, 1, 1, 1, 0F,-0.91F, -0.6F, -0.65F, -0.01F, -0.6F, -0.65F, -0.01F, -0.5F, -0.25F, -0.91F, -0.5F, -0.25F, -0.91F, -0.3F, -0.65F, -0.01F, -0.3F, -0.65F, -0.01F, -0.2F, -0.25F, -0.91F, -0.2F, -0.25F); // Box 82

		gun_3_Model[1][74].addShapeBox(-8.8F, -4F, -0.5F, 1, 1, 1, 0F,-0.91F, -0.5F, -0.25F, -0.01F, -0.5F, -0.25F, -0.01F, -0.6F, -0.65F, -0.91F, -0.6F, -0.65F, -0.91F, -0.2F, -0.25F, -0.01F, -0.2F, -0.25F, -0.01F, -0.3F, -0.65F, -0.91F, -0.3F, -0.65F); // Box 83

		gun_3_Model[1][75].addShapeBox(-8.8F, -4.5F, -0.5F, 1, 1, 1, 0F,-0.91F, -0.9F, -0.4F, -0.01F, -0.9F, -0.4F, -0.01F, -0.9F, -0.4F, -0.91F, -0.9F, -0.4F, -0.91F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.91F, 0F, -0.45F); // Box 85

		gun_3_Model[1][76].addShapeBox(-8.8F, -4.5F, -0.5F, 1, 1, 1, 0F,-0.91F, -0.9F, -0.6F, -0.01F, -0.9F, -0.6F, -0.01F, -1F, -0.25F, -0.91F, -1F, -0.25F, -0.91F, 0F, -0.55F, -0.01F, 0F, -0.55F, -0.01F, 0.1F, -0.35F, -0.91F, 0.1F, -0.35F); // Box 86

		gun_3_Model[1][77].addShapeBox(3.7F, -4.5F, -0.5F, 1, 1, 1, 0F,-0.91F, -0.9F, -0.4F, -0.01F, -0.9F, -0.4F, -0.01F, -0.9F, -0.4F, -0.91F, -0.9F, -0.4F, -0.91F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.91F, 0F, -0.45F); // Box 87

		gun_3_Model[1][78].addShapeBox(3.7F, -4.5F, -0.5F, 1, 1, 1, 0F,-0.91F, -0.9F, -0.6F, -0.01F, -0.9F, -0.6F, -0.01F, -1.05F, -0.25F, -0.91F, -1.05F, -0.25F, -0.91F, 0F, -0.55F, -0.01F, 0F, -0.55F, -0.01F, 0.1F, -0.35F, -0.91F, 0.1F, -0.35F); // Box 88

		gun_3_Model[1][79].addShapeBox(3.7F, -4F, -0.5F, 1, 1, 1, 0F,-0.91F, -0.6F, -0.65F, -0.01F, -0.6F, -0.65F, -0.01F, -0.55F, -0.25F, -0.91F, -0.55F, -0.25F, -0.91F, -0.3F, -0.65F, -0.01F, -0.3F, -0.65F, -0.01F, -0.25F, -0.25F, -0.91F, -0.25F, -0.25F); // Box 89

		gun_3_Model[1][80].addShapeBox(3.7F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.91F, 0F, -0.55F, -0.01F, 0F, -0.55F, -0.01F, 0.1F, -0.35F, -0.91F, 0.1F, -0.35F, -0.91F, -0.9F, -0.6F, -0.01F, -0.9F, -0.6F, -0.01F, -1.05F, -0.25F, -0.91F, -1.05F, -0.25F); // Box 90

		gun_3_Model[1][81].addShapeBox(3.7F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.91F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.01F, 0F, -0.45F, -0.91F, 0F, -0.45F, -0.91F, -0.9F, -0.4F, -0.01F, -0.9F, -0.4F, -0.01F, -0.9F, -0.4F, -0.91F, -0.9F, -0.4F); // Box 91

		gun_3_Model[1][82].addShapeBox(3.7F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.91F, 0.1F, -0.35F, -0.01F, 0.1F, -0.35F, -0.01F, 0F, -0.55F, -0.91F, 0F, -0.55F, -0.91F, -1.05F, -0.25F, -0.01F, -1.05F, -0.25F, -0.01F, -0.9F, -0.6F, -0.91F, -0.9F, -0.6F); // Box 92

		gun_3_Model[1][83].addShapeBox(3.7F, -4F, -0.5F, 1, 1, 1, 0F,-0.91F, -0.55F, -0.25F, -0.01F, -0.55F, -0.25F, -0.01F, -0.6F, -0.65F, -0.91F, -0.6F, -0.65F, -0.91F, -0.25F, -0.25F, -0.01F, -0.25F, -0.25F, -0.01F, -0.3F, -0.65F, -0.91F, -0.3F, -0.65F); // Box 93

		gun_3_Model[1][84].addShapeBox(3.7F, -4.5F, -0.5F, 1, 1, 1, 0F,-0.91F, -1.05F, -0.25F, -0.01F, -1.05F, -0.25F, -0.01F, -0.9F, -0.6F, -0.91F, -0.9F, -0.6F, -0.91F, 0.1F, -0.35F, -0.01F, 0.1F, -0.35F, -0.01F, 0F, -0.55F, -0.91F, 0F, -0.55F); // Box 94

		gun_3_Model[1][85].addShapeBox(3.7F, -3F, -0.5F, 1, 1, 1, 0F,-0.9F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, -0.9F, 0.1F, -0.4F, -0.8F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.8F, 0F, -0.3F); // Box 95

		gun_3_Model[1][86].addShapeBox(3.7F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.91F, 0.15F, -0.47F, -0.01F, 0.15F, -0.47F, -0.01F, 0.15F, -0.47F, -0.91F, 0.15F, -0.47F, -0.91F, -1F, -0.45F, -0.01F, -1F, -0.45F, -0.01F, -1F, -0.45F, -0.91F, -1F, -0.45F); // Box 96

		gun_3_Model[1][87].addShapeBox(-10.2F, -3F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.8F, -0.1F, -0.4F, -0.8F, -0.1F, -0.4F, -0.8F, -0.8F, -0.2F, -0.8F, -0.8F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 97

		gun_3_Model[1][88].addShapeBox(-10.2F, -3F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.1F, -0.2F, -0.8F, -0.1F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 98

		gun_3_Model[1][89].addShapeBox(-8.4F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.1F, -0.4F, -0.8F, -0.1F, -0.4F, -0.8F, -0.8F, -0.2F, -0.8F, -0.8F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 99

		gun_3_Model[1][90].addShapeBox(-8.4F, -3.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.8F, -0.8F, -0.4F, -0.8F, -0.8F, -0.4F, -0.8F, -0.1F, -0.2F, -0.8F, -0.1F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 100

		gun_3_Model[1][91].addShapeBox(-9F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.3F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.7F, -0.1F, 0F, -0.7F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.7F, 0.2F, 0F, -0.7F); // Box 102

		gun_3_Model[1][92].addShapeBox(-9F, 0.4F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0.1F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, 0.3F, -0.5F, -0.7F); // Box 103

		gun_3_Model[1][93].addShapeBox(-9F, 0.4F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.2F, -0.5F, -0.7F, 0.3F, -0.5F, -0.7F, 0.1F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.1F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F); // Box 104

		gun_3_Model[1][94].addShapeBox(-9F, 1F, -0.5F, 1, 1, 1, 0F,0.1F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.1F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F, -0.1F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.3F, -0.5F, -0.7F, 0.1F, -0.5F, -0.7F); // Box 105

		gun_3_Model[1][95].addShapeBox(-9F, 1F, -0.5F, 1, 1, 1, 0F,0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.5F, -0.7F, -0.3F, -0.5F, -0.7F, -0.5F, -0.6F, -0.2F, -0.1F, -0.6F, -0.2F); // Box 106

		gun_3_Model[1][96].addShapeBox(-9F, 0.4F, -0.5F, 1, 1, 1, 0F,0.3F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.4F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.3F, -0.2F, -0.7F, -0.1F, -0.2F, -0.7F, -0.3F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F); // Box 107

		gun_3_Model[1][97].addShapeBox(-9F, 0.4F, -0.5F, 1, 1, 1, 0F,0.2F, 0F, -0.7F, 0F, 0F, -0.7F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, -0.5F, -0.7F, -0.2F, -0.5F, -0.7F, -0.4F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F); // Box 108

		gun_3_Model[1][98].addShapeBox(-9F, -0.6F, -0.5F, 1, 1, 1, 0F,-0.1F, 0F, -0.7F, 0.2F, 0F, -0.7F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0.2F, 0F, -0.7F, 0F, 0F, -0.7F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 109

		gun_3_Model[1][99].addShapeBox(-0.5F, -2F, -1F, 1, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.0F, 0.1F, 0F, 0.0F, 0.1F, 0F, 0.0F, 0.1F, 0F, 0.0F, 0.1F, 0F, 0.0F, 0.1F, 0F, 0.0F, 0.1F); // Box 109

		gun_3_Model[1][100].addShapeBox(-0.5F, -2.5F, -1F, 1, 2, 2, 0F,0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F); // Box 110

		gun_3_Model[1][101].addShapeBox(-0.5F, -2.5F, -1F, 1, 2, 2, 0F,0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F, 0F, -1.5F, 0.1F); // Box 111

		gun_3_Model[1][102].addShapeBox(-0.5F, -0.4F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112

		gun_3_Model[1][103].addShapeBox(-0.5F, -0.4F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 113

		gun_3_Model[1][104].addShapeBox(-0.5F, -0.4F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 115

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-37F, -24F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);
	}
}