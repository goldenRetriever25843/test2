//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.07.2016 - 20:41:31
// Last changed on: 28.07.2016 - 20:41:31

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEliteLancaster extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelEliteLancaster() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[340];
		tailModel = new ModelRendererTurbo[75];
		leftWingModel = new ModelRendererTurbo[58];
		rightWingModel = new ModelRendererTurbo[82];
		yawFlapModel = new ModelRendererTurbo[6];
		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		leftWingWheelModel = new ModelRendererTurbo[22];
		rightWingWheelModel = new ModelRendererTurbo[22];
		bodyDoorOpenModel = new ModelRendererTurbo[6];
		bodyDoorCloseModel = new ModelRendererTurbo[6];
		tailDoorCloseModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		inittailDoorCloseModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 1049, 9, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 1449, 9, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 1449, 25, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 36
		bodyModel[12] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 44
		bodyModel[13] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 115
		bodyModel[14] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 116
		bodyModel[15] = new ModelRendererTurbo(this, 1441, 57, textureX, textureY); // Box 117
		bodyModel[16] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 120
		bodyModel[17] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 122
		bodyModel[18] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 123
		bodyModel[19] = new ModelRendererTurbo(this, 1081, 57, textureX, textureY); // Box 125
		bodyModel[20] = new ModelRendererTurbo(this, 1369, 57, textureX, textureY); // Box 126
		bodyModel[21] = new ModelRendererTurbo(this, 1513, 57, textureX, textureY); // Box 127
		bodyModel[22] = new ModelRendererTurbo(this, 1545, 57, textureX, textureY); // Box 128
		bodyModel[23] = new ModelRendererTurbo(this, 1249, 57, textureX, textureY); // Box 129
		bodyModel[24] = new ModelRendererTurbo(this, 1585, 57, textureX, textureY); // Box 130
		bodyModel[25] = new ModelRendererTurbo(this, 1129, 57, textureX, textureY); // Box 131
		bodyModel[26] = new ModelRendererTurbo(this, 1617, 57, textureX, textureY); // Box 132
		bodyModel[27] = new ModelRendererTurbo(this, 1649, 57, textureX, textureY); // Box 133
		bodyModel[28] = new ModelRendererTurbo(this, 1681, 57, textureX, textureY); // Box 134
		bodyModel[29] = new ModelRendererTurbo(this, 1713, 57, textureX, textureY); // Box 135
		bodyModel[30] = new ModelRendererTurbo(this, 1833, 57, textureX, textureY); // Box 138
		bodyModel[31] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 139
		bodyModel[32] = new ModelRendererTurbo(this, 1905, 57, textureX, textureY); // Box 140
		bodyModel[33] = new ModelRendererTurbo(this, 1937, 57, textureX, textureY); // Box 141
		bodyModel[34] = new ModelRendererTurbo(this, 1985, 57, textureX, textureY); // Box 142
		bodyModel[35] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 143
		bodyModel[36] = new ModelRendererTurbo(this, 2017, 57, textureX, textureY); // Box 144
		bodyModel[37] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 145
		bodyModel[38] = new ModelRendererTurbo(this, 1185, 57, textureX, textureY); // Box 146
		bodyModel[39] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 147
		bodyModel[40] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 140
		bodyModel[41] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 141
		bodyModel[42] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 142
		bodyModel[43] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 143
		bodyModel[44] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 144
		bodyModel[45] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 145
		bodyModel[46] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 146
		bodyModel[47] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 147
		bodyModel[48] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 149
		bodyModel[49] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 150
		bodyModel[50] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 151
		bodyModel[51] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 152
		bodyModel[52] = new ModelRendererTurbo(this, 1081, 65, textureX, textureY); // Box 153
		bodyModel[53] = new ModelRendererTurbo(this, 1129, 65, textureX, textureY); // Box 154
		bodyModel[54] = new ModelRendererTurbo(this, 1225, 65, textureX, textureY); // Box 155
		bodyModel[55] = new ModelRendererTurbo(this, 2041, 9, textureX, textureY); // Box 156
		bodyModel[56] = new ModelRendererTurbo(this, 1041, 9, textureX, textureY); // Box 157
		bodyModel[57] = new ModelRendererTurbo(this, 1041, 17, textureX, textureY); // Box 158
		bodyModel[58] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 159
		bodyModel[59] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 160
		bodyModel[60] = new ModelRendererTurbo(this, 1257, 65, textureX, textureY); // Box 161
		bodyModel[61] = new ModelRendererTurbo(this, 1185, 65, textureX, textureY); // Box 162
		bodyModel[62] = new ModelRendererTurbo(this, 1369, 65, textureX, textureY); // Box 163
		bodyModel[63] = new ModelRendererTurbo(this, 1441, 65, textureX, textureY); // Box 164
		bodyModel[64] = new ModelRendererTurbo(this, 2041, 25, textureX, textureY); // Box 165
		bodyModel[65] = new ModelRendererTurbo(this, 1041, 25, textureX, textureY); // Box 166
		bodyModel[66] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 167
		bodyModel[67] = new ModelRendererTurbo(this, 1281, 57, textureX, textureY); // Box 168
		bodyModel[68] = new ModelRendererTurbo(this, 1473, 57, textureX, textureY); // Box 169
		bodyModel[69] = new ModelRendererTurbo(this, 1681, 65, textureX, textureY); // Box 170
		bodyModel[70] = new ModelRendererTurbo(this, 1545, 65, textureX, textureY); // Box 171
		bodyModel[71] = new ModelRendererTurbo(this, 1721, 65, textureX, textureY); // Box 172
		bodyModel[72] = new ModelRendererTurbo(this, 1833, 65, textureX, textureY); // Box 173
		bodyModel[73] = new ModelRendererTurbo(this, 1905, 65, textureX, textureY); // Box 174
		bodyModel[74] = new ModelRendererTurbo(this, 1929, 65, textureX, textureY); // Box 175
		bodyModel[75] = new ModelRendererTurbo(this, 2017, 65, textureX, textureY); // Box 176
		bodyModel[76] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 177
		bodyModel[77] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 178
		bodyModel[78] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 179
		bodyModel[79] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 180
		bodyModel[80] = new ModelRendererTurbo(this, 1465, 65, textureX, textureY); // Box 181
		bodyModel[81] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 182
		bodyModel[82] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 183
		bodyModel[83] = new ModelRendererTurbo(this, 905, 65, textureX, textureY); // Box 184
		bodyModel[84] = new ModelRendererTurbo(this, 1953, 65, textureX, textureY); // Box 185
		bodyModel[85] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 186
		bodyModel[86] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 187
		bodyModel[87] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 188
		bodyModel[88] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 189
		bodyModel[89] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 190
		bodyModel[90] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 192
		bodyModel[91] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 193
		bodyModel[92] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 194
		bodyModel[93] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 189
		bodyModel[94] = new ModelRendererTurbo(this, 1649, 73, textureX, textureY); // Box 190
		bodyModel[95] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 191
		bodyModel[96] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 192
		bodyModel[97] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 193
		bodyModel[98] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 194
		bodyModel[99] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 195
		bodyModel[100] = new ModelRendererTurbo(this, 1369, 89, textureX, textureY); // Box 196
		bodyModel[101] = new ModelRendererTurbo(this, 1833, 89, textureX, textureY); // Box 197
		bodyModel[102] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 198
		bodyModel[103] = new ModelRendererTurbo(this, 1081, 97, textureX, textureY); // Box 199
		bodyModel[104] = new ModelRendererTurbo(this, 1825, 97, textureX, textureY); // Box 200
		bodyModel[105] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 201
		bodyModel[106] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 203
		bodyModel[107] = new ModelRendererTurbo(this, 1793, 185, textureX, textureY); // Box 204
		bodyModel[108] = new ModelRendererTurbo(this, 1545, 145, textureX, textureY); // Box 205
		bodyModel[109] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 207
		bodyModel[110] = new ModelRendererTurbo(this, 2017, 73, textureX, textureY); // Box 208
		bodyModel[111] = new ModelRendererTurbo(this, 1369, 97, textureX, textureY); // Box 209
		bodyModel[112] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Box 210
		bodyModel[113] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 211
		bodyModel[114] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 212
		bodyModel[115] = new ModelRendererTurbo(this, 1753, 65, textureX, textureY); // Box 213
		bodyModel[116] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 214
		bodyModel[117] = new ModelRendererTurbo(this, 1161, 73, textureX, textureY); // Box 215
		bodyModel[118] = new ModelRendererTurbo(this, 1385, 97, textureX, textureY); // Box 219
		bodyModel[119] = new ModelRendererTurbo(this, 1945, 97, textureX, textureY); // Box 220
		bodyModel[120] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 221
		bodyModel[121] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 222
		bodyModel[122] = new ModelRendererTurbo(this, 1081, 73, textureX, textureY); // Box 223
		bodyModel[123] = new ModelRendererTurbo(this, 873, 73, textureX, textureY); // Box 224
		bodyModel[124] = new ModelRendererTurbo(this, 1129, 73, textureX, textureY); // Box 225
		bodyModel[125] = new ModelRendererTurbo(this, 1257, 81, textureX, textureY); // Box 226
		bodyModel[126] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 230
		bodyModel[127] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 231
		bodyModel[128] = new ModelRendererTurbo(this, 785, 73, textureX, textureY); // Box 233
		bodyModel[129] = new ModelRendererTurbo(this, 1369, 73, textureX, textureY); // Box 234
		bodyModel[130] = new ModelRendererTurbo(this, 1833, 73, textureX, textureY); // Box 235
		bodyModel[131] = new ModelRendererTurbo(this, 1905, 73, textureX, textureY); // Box 238
		bodyModel[132] = new ModelRendererTurbo(this, 1961, 49, textureX, textureY); // Box 240
		bodyModel[133] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 241
		bodyModel[134] = new ModelRendererTurbo(this, 2009, 1, textureX, textureY); // Box 242
		bodyModel[135] = new ModelRendererTurbo(this, 2041, 41, textureX, textureY); // Box 243
		bodyModel[136] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 244
		bodyModel[137] = new ModelRendererTurbo(this, 1753, 57, textureX, textureY); // Box 245
		bodyModel[138] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 246
		bodyModel[139] = new ModelRendererTurbo(this, 1153, 49, textureX, textureY); // Box 247
		bodyModel[140] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 248
		bodyModel[141] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 249
		bodyModel[142] = new ModelRendererTurbo(this, 1985, 9, textureX, textureY); // Box 250
		bodyModel[143] = new ModelRendererTurbo(this, 1289, 65, textureX, textureY); // Box 251
		bodyModel[144] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 252
		bodyModel[145] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 253
		bodyModel[146] = new ModelRendererTurbo(this, 1449, 17, textureX, textureY); // Box 254
		bodyModel[147] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 255
		bodyModel[148] = new ModelRendererTurbo(this, 1481, 65, textureX, textureY); // Box 256
		bodyModel[149] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 257
		bodyModel[150] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 258
		bodyModel[151] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 259
		bodyModel[152] = new ModelRendererTurbo(this, 1857, 65, textureX, textureY); // Box 260
		bodyModel[153] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 261
		bodyModel[154] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 262
		bodyModel[155] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 263
		bodyModel[156] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 264
		bodyModel[157] = new ModelRendererTurbo(this, 1441, 73, textureX, textureY); // Box 265
		bodyModel[158] = new ModelRendererTurbo(this, 1289, 49, textureX, textureY); // Box 266
		bodyModel[159] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 267
		bodyModel[160] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 268
		bodyModel[161] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 269
		bodyModel[162] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 270
		bodyModel[163] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 271
		bodyModel[164] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 272
		bodyModel[165] = new ModelRendererTurbo(this, 1105, 73, textureX, textureY); // Box 273
		bodyModel[166] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 274
		bodyModel[167] = new ModelRendererTurbo(this, 1761, 41, textureX, textureY); // Box 275
		bodyModel[168] = new ModelRendererTurbo(this, 1193, 73, textureX, textureY); // Box 276
		bodyModel[169] = new ModelRendererTurbo(this, 1393, 73, textureX, textureY); // Box 277
		bodyModel[170] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 278
		bodyModel[171] = new ModelRendererTurbo(this, 2009, 41, textureX, textureY); // Box 279
		bodyModel[172] = new ModelRendererTurbo(this, 1945, 73, textureX, textureY); // Box 280
		bodyModel[173] = new ModelRendererTurbo(this, 1961, 73, textureX, textureY); // Box 281
		bodyModel[174] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 279
		bodyModel[175] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 280
		bodyModel[176] = new ModelRendererTurbo(this, 729, 81, textureX, textureY); // Box 281
		bodyModel[177] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Box 279
		bodyModel[178] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 280
		bodyModel[179] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 281
		bodyModel[180] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 282
		bodyModel[181] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 283
		bodyModel[182] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 284
		bodyModel[183] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 285
		bodyModel[184] = new ModelRendererTurbo(this, 1201, 73, textureX, textureY); // Box 286
		bodyModel[185] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 287
		bodyModel[186] = new ModelRendererTurbo(this, 841, 81, textureX, textureY); // Box 288
		bodyModel[187] = new ModelRendererTurbo(this, 1161, 89, textureX, textureY); // Box 289
		bodyModel[188] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 290
		bodyModel[189] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 291
		bodyModel[190] = new ModelRendererTurbo(this, 1641, 57, textureX, textureY); // Box 292
		bodyModel[191] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 293
		bodyModel[192] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 294
		bodyModel[193] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 295
		bodyModel[194] = new ModelRendererTurbo(this, 1673, 89, textureX, textureY); // Box 412
		bodyModel[195] = new ModelRendererTurbo(this, 1793, 185, textureX, textureY); // Box 413
		bodyModel[196] = new ModelRendererTurbo(this, 1457, 89, textureX, textureY); // Box 415
		bodyModel[197] = new ModelRendererTurbo(this, 1745, 89, textureX, textureY); // Box 416
		bodyModel[198] = new ModelRendererTurbo(this, 1481, 89, textureX, textureY); // Box 417
		bodyModel[199] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 418
		bodyModel[200] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 419
		bodyModel[201] = new ModelRendererTurbo(this, 1417, 97, textureX, textureY); // Box 419
		bodyModel[202] = new ModelRendererTurbo(this, 1713, 97, textureX, textureY); // Box 420
		bodyModel[203] = new ModelRendererTurbo(this, 1921, 89, textureX, textureY); // Box 421
		bodyModel[204] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 422
		bodyModel[205] = new ModelRendererTurbo(this, 1441, 97, textureX, textureY); // Box 423
		bodyModel[206] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 424
		bodyModel[207] = new ModelRendererTurbo(this, 1273, 137, textureX, textureY); // Box 425
		bodyModel[208] = new ModelRendererTurbo(this, 1601, 145, textureX, textureY); // Box 426
		bodyModel[209] = new ModelRendererTurbo(this, 1689, 145, textureX, textureY); // Box 427
		bodyModel[210] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 428
		bodyModel[211] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 429
		bodyModel[212] = new ModelRendererTurbo(this, 1961, 137, textureX, textureY); // Box 431
		bodyModel[213] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 432
		bodyModel[214] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 433
		bodyModel[215] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 434
		bodyModel[216] = new ModelRendererTurbo(this, 1081, 105, textureX, textureY); // Box 435
		bodyModel[217] = new ModelRendererTurbo(this, 1121, 105, textureX, textureY); // Box 438
		bodyModel[218] = new ModelRendererTurbo(this, 1817, 169, textureX, textureY); // Box 439
		bodyModel[219] = new ModelRendererTurbo(this, 1945, 169, textureX, textureY); // Box 440
		bodyModel[220] = new ModelRendererTurbo(this, 1993, 169, textureX, textureY); // Box 444
		bodyModel[221] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 445
		bodyModel[222] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 458
		bodyModel[223] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 459
		bodyModel[224] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 460
		bodyModel[225] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 461
		bodyModel[226] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 462
		bodyModel[227] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 463
		bodyModel[228] = new ModelRendererTurbo(this, 1649, 113, textureX, textureY); // Box 464
		bodyModel[229] = new ModelRendererTurbo(this, 2017, 177, textureX, textureY); // Box 465
		bodyModel[230] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 466
		bodyModel[231] = new ModelRendererTurbo(this, 905, 129, textureX, textureY); // Box 467
		bodyModel[232] = new ModelRendererTurbo(this, 1745, 105, textureX, textureY); // Box 520
		bodyModel[233] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Box 521
		bodyModel[234] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 522
		bodyModel[235] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 523
		bodyModel[236] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 524
		bodyModel[237] = new ModelRendererTurbo(this, 1129, 57, textureX, textureY); // Box 525
		bodyModel[238] = new ModelRendererTurbo(this, 1185, 57, textureX, textureY); // Box 526
		bodyModel[239] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 527
		bodyModel[240] = new ModelRendererTurbo(this, 1041, 137, textureX, textureY); // Box 528
		bodyModel[241] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 529
		bodyModel[242] = new ModelRendererTurbo(this, 1441, 57, textureX, textureY); // Box 530
		bodyModel[243] = new ModelRendererTurbo(this, 1545, 57, textureX, textureY); // Box 531
		bodyModel[244] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 532
		bodyModel[245] = new ModelRendererTurbo(this, 1713, 57, textureX, textureY); // Box 533
		bodyModel[246] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 534
		bodyModel[247] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 535
		bodyModel[248] = new ModelRendererTurbo(this, 1369, 225, textureX, textureY); // Box 536
		bodyModel[249] = new ModelRendererTurbo(this, 1449, 225, textureX, textureY); // Box 537
		bodyModel[250] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 538
		bodyModel[251] = new ModelRendererTurbo(this, 1481, 225, textureX, textureY); // Box 539
		bodyModel[252] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 532
		bodyModel[253] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 533
		bodyModel[254] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 534
		bodyModel[255] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 535
		bodyModel[256] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 536
		bodyModel[257] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 537
		bodyModel[258] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 538
		bodyModel[259] = new ModelRendererTurbo(this, 1137, 129, textureX, textureY); // Box 539
		bodyModel[260] = new ModelRendererTurbo(this, 1569, 121, textureX, textureY); // Box 540
		bodyModel[261] = new ModelRendererTurbo(this, 1081, 137, textureX, textureY); // Box 541
		bodyModel[262] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 542
		bodyModel[263] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 543
		bodyModel[264] = new ModelRendererTurbo(this, 1545, 233, textureX, textureY); // Box 544
		bodyModel[265] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 545
		bodyModel[266] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 546
		bodyModel[267] = new ModelRendererTurbo(this, 1881, 137, textureX, textureY); // Box 547
		bodyModel[268] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 548
		bodyModel[269] = new ModelRendererTurbo(this, 1049, 145, textureX, textureY); // Box 549
		bodyModel[270] = new ModelRendererTurbo(this, 1545, 145, textureX, textureY); // Box 550
		bodyModel[271] = new ModelRendererTurbo(this, 1633, 145, textureX, textureY); // Box 551
		bodyModel[272] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 552
		bodyModel[273] = new ModelRendererTurbo(this, 1081, 153, textureX, textureY); // Box 553
		bodyModel[274] = new ModelRendererTurbo(this, 1185, 153, textureX, textureY); // Box 554
		bodyModel[275] = new ModelRendererTurbo(this, 1945, 153, textureX, textureY); // Box 555
		bodyModel[276] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 556
		bodyModel[277] = new ModelRendererTurbo(this, 1793, 233, textureX, textureY); // Box 557
		bodyModel[278] = new ModelRendererTurbo(this, 1369, 153, textureX, textureY); // Box 558
		bodyModel[279] = new ModelRendererTurbo(this, 1585, 193, textureX, textureY); // Box 559
		bodyModel[280] = new ModelRendererTurbo(this, 1121, 209, textureX, textureY); // Box 560
		bodyModel[281] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 561
		bodyModel[282] = new ModelRendererTurbo(this, 1609, 209, textureX, textureY); // Box 562
		bodyModel[283] = new ModelRendererTurbo(this, 1681, 201, textureX, textureY); // Box 563
		bodyModel[284] = new ModelRendererTurbo(this, 1401, 193, textureX, textureY); // Box 564
		bodyModel[285] = new ModelRendererTurbo(this, 1993, 225, textureX, textureY); // Box 565
		bodyModel[286] = new ModelRendererTurbo(this, 1425, 161, textureX, textureY); // Box 566
		bodyModel[287] = new ModelRendererTurbo(this, 1153, 225, textureX, textureY); // Box 567
		bodyModel[288] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 568
		bodyModel[289] = new ModelRendererTurbo(this, 1465, 225, textureX, textureY); // Box 569
		bodyModel[290] = new ModelRendererTurbo(this, 1081, 233, textureX, textureY); // Box 570
		bodyModel[291] = new ModelRendererTurbo(this, 1497, 225, textureX, textureY); // Box 571
		bodyModel[292] = new ModelRendererTurbo(this, 1649, 233, textureX, textureY); // Box 572
		bodyModel[293] = new ModelRendererTurbo(this, 1945, 225, textureX, textureY); // Box 573
		bodyModel[294] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 574
		bodyModel[295] = new ModelRendererTurbo(this, 1121, 201, textureX, textureY); // Box 575
		bodyModel[296] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 576
		bodyModel[297] = new ModelRendererTurbo(this, 1665, 161, textureX, textureY); // Box 577
		bodyModel[298] = new ModelRendererTurbo(this, 1513, 161, textureX, textureY); // Box 578
		bodyModel[299] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 579
		bodyModel[300] = new ModelRendererTurbo(this, 1097, 233, textureX, textureY); // Box 580
		bodyModel[301] = new ModelRendererTurbo(this, 1113, 241, textureX, textureY); // Box 593
		bodyModel[302] = new ModelRendererTurbo(this, 1449, 249, textureX, textureY); // Box 594
		bodyModel[303] = new ModelRendererTurbo(this, 1321, 249, textureX, textureY); // Box 595
		bodyModel[304] = new ModelRendererTurbo(this, 1641, 249, textureX, textureY); // Box 596
		bodyModel[305] = new ModelRendererTurbo(this, 1961, 249, textureX, textureY); // Box 597
		bodyModel[306] = new ModelRendererTurbo(this, 1185, 241, textureX, textureY); // Box 598
		bodyModel[307] = new ModelRendererTurbo(this, 1329, 241, textureX, textureY); // Box 599
		bodyModel[308] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 600
		bodyModel[309] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 601
		bodyModel[310] = new ModelRendererTurbo(this, 625, 177, textureX, textureY); // Box 602
		bodyModel[311] = new ModelRendererTurbo(this, 1601, 177, textureX, textureY); // Box 603
		bodyModel[312] = new ModelRendererTurbo(this, 1673, 185, textureX, textureY); // Box 604
		bodyModel[313] = new ModelRendererTurbo(this, 1505, 129, textureX, textureY); // Box 605
		bodyModel[314] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 606
		bodyModel[315] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 607
		bodyModel[316] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 608
		bodyModel[317] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 609
		bodyModel[318] = new ModelRendererTurbo(this, 2041, 113, textureX, textureY); // Box 610
		bodyModel[319] = new ModelRendererTurbo(this, 1681, 65, textureX, textureY); // Box 611
		bodyModel[320] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 612
		bodyModel[321] = new ModelRendererTurbo(this, 1721, 65, textureX, textureY); // Box 613
		bodyModel[322] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 614
		bodyModel[323] = new ModelRendererTurbo(this, 577, 153, textureX, textureY); // Box 615
		bodyModel[324] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 616
		bodyModel[325] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Box 617
		bodyModel[326] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 618
		bodyModel[327] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 619
		bodyModel[328] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 620
		bodyModel[329] = new ModelRendererTurbo(this, 1953, 73, textureX, textureY); // Box 621
		bodyModel[330] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 622
		bodyModel[331] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 623
		bodyModel[332] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 624
		bodyModel[333] = new ModelRendererTurbo(this, 1289, 89, textureX, textureY); // Box 625
		bodyModel[334] = new ModelRendererTurbo(this, 1369, 89, textureX, textureY); // Box 626
		bodyModel[335] = new ModelRendererTurbo(this, 1833, 89, textureX, textureY); // Box 627
		bodyModel[336] = new ModelRendererTurbo(this, 1633, 161, textureX, textureY); // Box 628
		bodyModel[337] = new ModelRendererTurbo(this, 1049, 153, textureX, textureY); // Box 629
		bodyModel[338] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 630
		bodyModel[339] = new ModelRendererTurbo(this, 1545, 153, textureX, textureY); // Box 631

		bodyModel[0].addBox(0F, 0F, 0F, 195, 22, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-149F, -63F, -17F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 195, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1
		bodyModel[1].setRotationPoint(-149F, -68F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 195, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 2
		bodyModel[2].setRotationPoint(-149F, -72F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 195, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(-149F, -41F, -15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 195, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(-149F, -63F, 16F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 195, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 12
		bodyModel[5].setRotationPoint(-149F, -68F, 14F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 195, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 13
		bodyModel[6].setRotationPoint(-149F, -72F, 11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 195, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[7].setRotationPoint(-149F, -41F, 14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 169, 4, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 22
		bodyModel[8].setRotationPoint(-123F, -76F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 169, 1, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[9].setRotationPoint(-123F, -76F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[10].setRotationPoint(-123F, -78F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 120, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 3F); // Box 36
		bodyModel[11].setRotationPoint(46F, -72F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 120, 4, 1, 0F,0F, 0F, -4F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 4F, 0F, -1F, -1F, 0F, -14F, 2F, 0F, -13F, -3F, 0F, 0F, 0F); // Box 44
		bodyModel[12].setRotationPoint(46F, -36F, 10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[13].setRotationPoint(-163F, -33F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[14].setRotationPoint(-175F, -36F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, -2F); // Box 117
		bodyModel[15].setRotationPoint(-186F, -40F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 0F, 0F); // Box 120
		bodyModel[16].setRotationPoint(-186F, -58F, 9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, -1F, -1F, -5F, -1F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 122
		bodyModel[17].setRotationPoint(-163F, -75F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[18].setRotationPoint(-163F, -76F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 125
		bodyModel[19].setRotationPoint(-163F, -72F, 11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 126
		bodyModel[20].setRotationPoint(-163F, -68F, 14F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[21].setRotationPoint(-163F, -63F, 16F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 128
		bodyModel[22].setRotationPoint(-163F, -33F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 1F, 4F, 0F, -3F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 129
		bodyModel[23].setRotationPoint(-163F, -36F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[24].setRotationPoint(-163F, -41F, 14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 1F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[25].setRotationPoint(-163F, -75F, 3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[26].setRotationPoint(-173F, -75F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 22, 1, 0F,0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -3F, 0F); // Box 133
		bodyModel[27].setRotationPoint(-175F, -63F, 13F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[28].setRotationPoint(-188F, -60F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[29].setRotationPoint(-163F, -33F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 138
		bodyModel[30].setRotationPoint(-163F, -75F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[31].setRotationPoint(-163F, -76F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 140
		bodyModel[32].setRotationPoint(-163F, -72F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 141
		bodyModel[33].setRotationPoint(-163F, -68F, -15F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 14, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[34].setRotationPoint(-163F, -63F, -17F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[35].setRotationPoint(-163F, -33F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 1F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -1F); // Box 144
		bodyModel[36].setRotationPoint(-163F, -36F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 145
		bodyModel[37].setRotationPoint(-163F, -41F, -15F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 146
		bodyModel[38].setRotationPoint(-163F, -75F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[39].setRotationPoint(-173F, -75F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 140
		bodyModel[40].setRotationPoint(-173F, -75F, 3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -2F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 1F, 2F); // Box 141
		bodyModel[41].setRotationPoint(-173F, -75F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 142
		bodyModel[42].setRotationPoint(-173F, -72F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 3F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 2F, 3F, -1F); // Box 143
		bodyModel[43].setRotationPoint(-173F, -68F, 14F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 144
		bodyModel[44].setRotationPoint(-188F, -60F, 4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 0F); // Box 145
		bodyModel[45].setRotationPoint(-186F, -60F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[46].setRotationPoint(-188F, -60F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 1, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[47].setRotationPoint(-188F, -60F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 3F, 1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 3F, -1F, 0F, -3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 149
		bodyModel[48].setRotationPoint(-175F, -41F, 14F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 2F, -1F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 2F, 1F, 0F, -4F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 150
		bodyModel[49].setRotationPoint(-175F, -38F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 11, 1, 6, 0F,0F, 0F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[50].setRotationPoint(-186F, -40F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F); // Box 152
		bodyModel[51].setRotationPoint(-175F, -35F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 2F, -2F, 0F, 2F, 2F, 0F, -1F, -1F); // Box 153
		bodyModel[52].setRotationPoint(-186F, -46F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 2F, -1F, 0F, -1F, -4F, 0F, -1F, 4F, 0F, 2F, 1F, 0F, -4F, 0F, 0F, -1F, -3F, 0F, 0F, 2F, 0F, -3F, -1F); // Box 154
		bodyModel[53].setRotationPoint(-186F, -41F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, -2F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 155
		bodyModel[54].setRotationPoint(-186F, -38F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 156
		bodyModel[55].setRotationPoint(-188F, -58F, 8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 157
		bodyModel[56].setRotationPoint(-188F, -46F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -2F); // Box 158
		bodyModel[57].setRotationPoint(-188F, -43F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F); // Box 159
		bodyModel[58].setRotationPoint(-188F, -40F, 4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 160
		bodyModel[59].setRotationPoint(-188F, -40F, 0F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 11, 12, 1, 0F,0F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 161
		bodyModel[60].setRotationPoint(-186F, -58F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, -1F, 1F); // Box 162
		bodyModel[61].setRotationPoint(-186F, -46F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 2F, 1F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 2F, -1F, 0F, -3F, -1F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, -4F, 0F); // Box 163
		bodyModel[62].setRotationPoint(-186F, -41F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 2F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 2F); // Box 164
		bodyModel[63].setRotationPoint(-186F, -38F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 165
		bodyModel[64].setRotationPoint(-188F, -58F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 166
		bodyModel[65].setRotationPoint(-188F, -46F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -2F, 1F); // Box 167
		bodyModel[66].setRotationPoint(-188F, -43F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 168
		bodyModel[67].setRotationPoint(-188F, -40F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 169
		bodyModel[68].setRotationPoint(-188F, -40F, -4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 12, 1, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[69].setRotationPoint(-175F, -36F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 22, 1, 0F,0F, -3F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, -3F, 0F); // Box 171
		bodyModel[70].setRotationPoint(-175F, -63F, -14F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 1, 5, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[71].setRotationPoint(-173F, -75F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 1F, 2F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 1F, -2F); // Box 173
		bodyModel[72].setRotationPoint(-173F, -75F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 174
		bodyModel[73].setRotationPoint(-173F, -72F, -12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 3F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 2F, 3F, 1F); // Box 175
		bodyModel[74].setRotationPoint(-173F, -68F, -15F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 3F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 3F, 1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F); // Box 176
		bodyModel[75].setRotationPoint(-175F, -41F, -15F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 2F, 1F, 0F, -1F, 4F, 0F, -1F, -4F, 0F, 2F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -4F, 0F); // Box 177
		bodyModel[76].setRotationPoint(-175F, -38F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, 3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F); // Box 178
		bodyModel[77].setRotationPoint(-175F, -35F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 179
		bodyModel[78].setRotationPoint(-188F, -59F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 1, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 4F, 0F, 0F, 0F); // Box 180
		bodyModel[79].setRotationPoint(-186F, -59F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[80].setRotationPoint(-188F, -59F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 1, 10, 0F,0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[81].setRotationPoint(-186F, -59F, -10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -3F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 2F, 0F); // Box 183
		bodyModel[82].setRotationPoint(-176F, -74F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 184
		bodyModel[83].setRotationPoint(-179F, -75F, 1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 185
		bodyModel[84].setRotationPoint(-177F, -75F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-3F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[85].setRotationPoint(-176F, -74F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[86].setRotationPoint(-179F, -75F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[87].setRotationPoint(-177F, -75F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[88].setRotationPoint(-179F, -75F, -1F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,-3F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[89].setRotationPoint(-186F, -60F, -10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, -1F, 0F, 0F); // Box 192
		bodyModel[90].setRotationPoint(-189F, -59F, 2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[91].setRotationPoint(-189F, -59F, -2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 5, 6, 0F,-1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 194
		bodyModel[92].setRotationPoint(-189F, -59F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 195, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[93].setRotationPoint(-149F, -40F, -16F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 14, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[94].setRotationPoint(-163F, -40F, -16F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 12, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 191
		bodyModel[95].setRotationPoint(-175F, -40F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 192
		bodyModel[96].setRotationPoint(-186F, -40F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, 0F); // Box 193
		bodyModel[97].setRotationPoint(-183F, -40F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 40, 4, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 194
		bodyModel[98].setRotationPoint(6F, -36F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 40, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 195
		bodyModel[99].setRotationPoint(6F, -33F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 40, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[100].setRotationPoint(6F, -31F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 40, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[101].setRotationPoint(6F, -31F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 40, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[102].setRotationPoint(6F, -33F, 6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 40, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[103].setRotationPoint(6F, -36F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 19, 2, 79, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 200
		bodyModel[104].setRotationPoint(130F, -55F, 13F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 79, 0F,0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F); // Box 201
		bodyModel[105].setRotationPoint(126F, -55F, 13F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 203
		bodyModel[106].setRotationPoint(149F, -55F, 87F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 19, 2, 79, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[107].setRotationPoint(130F, -55F, -92F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 2, 79, 0F,-4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 205
		bodyModel[108].setRotationPoint(126F, -55F, -92F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[109].setRotationPoint(149F, -55F, -92F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 11, 40, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[110].setRotationPoint(135F, -87F, 92F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 51, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[111].setRotationPoint(146F, -103F, 92F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[112].setRotationPoint(136F, -103F, 92F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[113].setRotationPoint(140F, -107F, 92F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[114].setRotationPoint(142F, -108F, 92F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 213
		bodyModel[115].setRotationPoint(133F, -87F, 92F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 214
		bodyModel[116].setRotationPoint(136F, -93F, 92F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 215
		bodyModel[117].setRotationPoint(135F, -47F, 92F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 11, 40, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[118].setRotationPoint(135F, -87F, -93F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 51, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[119].setRotationPoint(146F, -103F, -93F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 10, 10, 1, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[120].setRotationPoint(136F, -103F, -93F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[121].setRotationPoint(140F, -107F, -93F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[122].setRotationPoint(142F, -108F, -93F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 40, 1, 0F,0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 224
		bodyModel[123].setRotationPoint(133F, -87F, -93F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 225
		bodyModel[124].setRotationPoint(136F, -93F, -93F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F); // Box 226
		bodyModel[125].setRotationPoint(135F, -47F, -93F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 120, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 230
		bodyModel[126].setRotationPoint(46F, -54F, -16F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[127].setRotationPoint(-156F, -77F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[128].setRotationPoint(-153F, -82F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[129].setRotationPoint(-146F, -86F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[130].setRotationPoint(-127F, -86F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, -5.2F, 4F, 0F, -5.6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 4F, 0F, 5F, -4F, 0F, 0F, 0F); // Box 238
		bodyModel[131].setRotationPoint(-114F, -83F, 7.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[132].setRotationPoint(-146F, -86F, 0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 241
		bodyModel[133].setRotationPoint(-146F, -86F, 3.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 242
		bodyModel[134].setRotationPoint(-146F, -85F, 6.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 243
		bodyModel[135].setRotationPoint(-146F, -83F, 7.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[136].setRotationPoint(-146F, -86F, -3.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[137].setRotationPoint(-146F, -86F, -6.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[138].setRotationPoint(-146F, -85F, -7.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 247
		bodyModel[139].setRotationPoint(-146F, -83F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[140].setRotationPoint(-137F, -86F, -3.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[141].setRotationPoint(-137F, -86F, -6.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[142].setRotationPoint(-137F, -85F, -7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 251
		bodyModel[143].setRotationPoint(-137F, -83F, -8.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[144].setRotationPoint(-137F, -86F, 0.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 253
		bodyModel[145].setRotationPoint(-137F, -86F, 3.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 254
		bodyModel[146].setRotationPoint(-137F, -85F, 6.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 255
		bodyModel[147].setRotationPoint(-137F, -83F, 7.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[148].setRotationPoint(-127F, -86F, -3.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[149].setRotationPoint(-127F, -86F, -6.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[150].setRotationPoint(-127F, -85F, -7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 259
		bodyModel[151].setRotationPoint(-127F, -83F, -8.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[152].setRotationPoint(-127F, -86F, 0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 261
		bodyModel[153].setRotationPoint(-127F, -86F, 3.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 262
		bodyModel[154].setRotationPoint(-127F, -85F, 6.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F); // Box 263
		bodyModel[155].setRotationPoint(-127F, -83F, 7.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[156].setRotationPoint(-136F, -86F, -3.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 265
		bodyModel[157].setRotationPoint(-136F, -83F, 7.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 0.8F, -1.3F, 0F, 0F, 0.5F, 0F, 0.3F, 0.8F); // Box 266
		bodyModel[158].setRotationPoint(-115F, -83F, 7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 267
		bodyModel[159].setRotationPoint(-115F, -85F, 6.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 268
		bodyModel[160].setRotationPoint(-115F, -86F, 3.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[161].setRotationPoint(-115F, -86F, 0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -3.1F, 0F, 0.3F, -2.9F, 0F, 0.1F, 2.5F, 0F, 0.3F, 2.8F); // Box 270
		bodyModel[162].setRotationPoint(-123F, -83F, 7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 271
		bodyModel[163].setRotationPoint(-123F, -85F, 6.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 272
		bodyModel[164].setRotationPoint(-123F, -86F, 3.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[165].setRotationPoint(-123F, -86F, 0.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.8F, 0F, 0F, 0.5F, 0F, 0.8F, -1.3F, 0F, 1F, -1.5F); // Box 274
		bodyModel[166].setRotationPoint(-115F, -83F, -8.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[167].setRotationPoint(-115F, -85F, -7.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[168].setRotationPoint(-115F, -86F, -6.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[169].setRotationPoint(-115F, -86F, -3.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 2.8F, 0F, 0.1F, 2.5F, 0F, 0.3F, -2.9F, 0F, 0.6F, -3.1F); // Box 278
		bodyModel[170].setRotationPoint(-123F, -83F, -8.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[171].setRotationPoint(-123F, -85F, -7.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[172].setRotationPoint(-123F, -86F, -6.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[173].setRotationPoint(-123F, -86F, -3.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 169, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 279
		bodyModel[174].setRotationPoint(-123F, -76F, -8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 169, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 280
		bodyModel[175].setRotationPoint(-123F, -76F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 27, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[176].setRotationPoint(-123F, -78F, -3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 133, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[177].setRotationPoint(-87F, -78F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 133, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[178].setRotationPoint(-87F, -78F, 0F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 281
		bodyModel[179].setRotationPoint(-145F, -83F, 7.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 282
		bodyModel[180].setRotationPoint(-126F, -83F, 7.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 283
		bodyModel[181].setRotationPoint(-122F, -83F, 7.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 284
		bodyModel[182].setRotationPoint(-136F, -83F, -8.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 285
		bodyModel[183].setRotationPoint(-145F, -83F, -8.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 286
		bodyModel[184].setRotationPoint(-126F, -83F, -8.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 287
		bodyModel[185].setRotationPoint(-122F, -83F, -8.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[186].setRotationPoint(-136F, -86F, 2.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[187].setRotationPoint(-114F, -86F, 1.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, -5.6F, -4F, 0F, -5.2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -4F, 0F, 5F, 4F, 0F, 0F, 0F); // Box 290
		bodyModel[188].setRotationPoint(-114F, -83F, -8.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[189].setRotationPoint(-114F, -86F, -2.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[190].setRotationPoint(-98F, -85F, 1.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[191].setRotationPoint(-97F, -83F, 1.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[192].setRotationPoint(-98F, -85F, -2.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[193].setRotationPoint(-97F, -83F, -2.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 2F, 0F, -2F); // Box 412
		bodyModel[194].setRotationPoint(-173F, -68F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 413
		bodyModel[195].setRotationPoint(-175F, -60F, -13F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 415
		bodyModel[196].setRotationPoint(-173F, -71F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 3F, 2F, 0F, 2F); // Box 416
		bodyModel[197].setRotationPoint(-173F, -68F, 9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 417
		bodyModel[198].setRotationPoint(-173F, -71F, 8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 418
		bodyModel[199].setRotationPoint(-173F, -73F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 419
		bodyModel[200].setRotationPoint(-173F, -73F, 7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 419
		bodyModel[201].setRotationPoint(37F, -76F, -8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 2F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[202].setRotationPoint(37F, -76F, 3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[203].setRotationPoint(37F, -78F, -3F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[204].setRotationPoint(37F, -78F, 0F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[205].setRotationPoint(43F, -83F, 0F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[206].setRotationPoint(43F, -83F, -3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 425
		bodyModel[207].setRotationPoint(43F, -83F, 3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[208].setRotationPoint(43F, -83F, -8F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 427
		bodyModel[209].setRotationPoint(46F, -83F, -8F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[210].setRotationPoint(53F, -79F, -8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.35F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[211].setRotationPoint(46F, -76F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[212].setRotationPoint(66F, -83F, -8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[213].setRotationPoint(66F, -83F, -3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[214].setRotationPoint(66F, -83F, 0F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 434
		bodyModel[215].setRotationPoint(66F, -83F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 435
		bodyModel[216].setRotationPoint(68F, -76F, -8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[217].setRotationPoint(68F, -78F, -3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[218].setRotationPoint(46F, -76F, -8F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[219].setRotationPoint(46F, -76F, 6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 17, 1, 5, 0F,0F, 7F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[220].setRotationPoint(68F, -76F, 3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 17, 1, 3, 0F,0F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 445
		bodyModel[221].setRotationPoint(68F, -78F, 0F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[222].setRotationPoint(-150F, -39F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 459
		bodyModel[223].setRotationPoint(-150F, -39F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 460
		bodyModel[224].setRotationPoint(-150F, -39F, -16F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		bodyModel[225].setRotationPoint(-150F, -39F, 6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 462
		bodyModel[226].setRotationPoint(-150F, -39F, 11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		bodyModel[227].setRotationPoint(6F, -39F, 6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 464
		bodyModel[228].setRotationPoint(6F, -39F, 11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[229].setRotationPoint(6F, -39F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 466
		bodyModel[230].setRotationPoint(6F, -39F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 467
		bodyModel[231].setRotationPoint(6F, -39F, -16F);

		bodyModel[232].addShapeBox(0F, -6F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[232].setRotationPoint(-193F, -45F, 0F);
		bodyModel[232].rotateAngleZ = 0.75049158F;

		bodyModel[233].addShapeBox(0F, -5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 521
		bodyModel[233].setRotationPoint(-193F, -45F, 0F);
		bodyModel[233].rotateAngleZ = 0.75049158F;

		bodyModel[234].addShapeBox(0F, -5F, -5F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[234].setRotationPoint(-193F, -45F, 0F);
		bodyModel[234].rotateAngleZ = 0.75049158F;

		bodyModel[235].addShapeBox(0F, 2F, 5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 523
		bodyModel[235].setRotationPoint(-193F, -45F, 0F);
		bodyModel[235].rotateAngleZ = 0.75049158F;

		bodyModel[236].addShapeBox(0F, -2F, 5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[236].setRotationPoint(-193F, -45F, 0F);
		bodyModel[236].rotateAngleZ = 0.75049158F;

		bodyModel[237].addShapeBox(0F, 2F, -5F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[237].setRotationPoint(-193F, -45F, 0F);
		bodyModel[237].rotateAngleZ = 0.75049158F;

		bodyModel[238].addShapeBox(0F, 4F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[238].setRotationPoint(-193F, -45F, 0F);
		bodyModel[238].rotateAngleZ = 0.75049158F;

		bodyModel[239].addShapeBox(0F, 4F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 527
		bodyModel[239].setRotationPoint(-193F, -45F, 0F);
		bodyModel[239].rotateAngleZ = 0.75049158F;

		bodyModel[240].addShapeBox(0F, 5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[240].setRotationPoint(-193F, -45F, 0F);
		bodyModel[240].rotateAngleZ = 0.75049158F;

		bodyModel[241].addShapeBox(0F, -5F, 2F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[241].setRotationPoint(-193F, -45F, 0F);
		bodyModel[241].rotateAngleZ = 0.75049158F;

		bodyModel[242].addShapeBox(0F, -5F, 4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[242].setRotationPoint(-193F, -45F, 0F);
		bodyModel[242].rotateAngleZ = 0.75049158F;

		bodyModel[243].addShapeBox(0F, -4F, 4F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 531
		bodyModel[243].setRotationPoint(-193F, -45F, 0F);
		bodyModel[243].rotateAngleZ = 0.75049158F;

		bodyModel[244].addShapeBox(0F, -2F, -6F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[244].setRotationPoint(-193F, -45F, 0F);
		bodyModel[244].rotateAngleZ = 0.75049158F;

		bodyModel[245].addShapeBox(0F, -4F, -6F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[245].setRotationPoint(-193F, -45F, 0F);
		bodyModel[245].rotateAngleZ = 0.75049158F;

		bodyModel[246].addShapeBox(0F, 4F, 4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 534
		bodyModel[246].setRotationPoint(-193F, -45F, 0F);
		bodyModel[246].rotateAngleZ = 0.75049158F;

		bodyModel[247].addShapeBox(0F, 4F, 2F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[247].setRotationPoint(-193F, -45F, 0F);
		bodyModel[247].rotateAngleZ = 0.75049158F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 536
		bodyModel[248].setRotationPoint(60F, -83F, -8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F,0F, 0F, 0F, 0F, -4F, -4F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 537
		bodyModel[249].setRotationPoint(46F, -83F, 3F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[250].setRotationPoint(53F, -79F, 7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -4F, -4F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 539
		bodyModel[251].setRotationPoint(60F, -83F, 3F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[252].setRotationPoint(-158F, -74F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[253].setRotationPoint(-158F, -74F, -8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[254].setRotationPoint(-158F, -76F, -3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[255].setRotationPoint(-158F, -72F, -3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[256].setRotationPoint(-158F, -72F, -8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[257].setRotationPoint(-158F, -72F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[258].setRotationPoint(-158F, -74F, 8F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[259].setRotationPoint(-158F, -74F, 3F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[260].setRotationPoint(-158F, -76F, 0F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[261].setRotationPoint(-158F, -72F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 542
		bodyModel[262].setRotationPoint(-158F, -72F, 3F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 543
		bodyModel[263].setRotationPoint(-158F, -72F, 8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 41, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[264].setRotationPoint(-164F, -65F, -15F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[265].setRotationPoint(-123F, -73F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[266].setRotationPoint(-123F, -75F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[267].setRotationPoint(-123F, -75F, -8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		bodyModel[268].setRotationPoint(-123F, -73F, -8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 549
		bodyModel[269].setRotationPoint(-123F, -73F, -3F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 550
		bodyModel[270].setRotationPoint(-123F, -77F, -3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		bodyModel[271].setRotationPoint(-123F, -75F, 3F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		bodyModel[272].setRotationPoint(-123F, -77F, 0F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[273].setRotationPoint(-123F, -73F, 0F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 554
		bodyModel[274].setRotationPoint(-123F, -73F, 3F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 555
		bodyModel[275].setRotationPoint(-123F, -73F, 8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[276].setRotationPoint(-123F, -75F, 8F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 23, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 557
		bodyModel[277].setRotationPoint(-146F, -65F, 4F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 558
		bodyModel[278].setRotationPoint(-123F, -69F, -8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[279].setRotationPoint(-123F, -69F, -14F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 560
		bodyModel[280].setRotationPoint(-123F, -69F, -3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 561
		bodyModel[281].setRotationPoint(-123F, -69F, 3F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 562
		bodyModel[282].setRotationPoint(-123F, -69F, 8F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 5, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		bodyModel[283].setRotationPoint(-164F, -70F, -13F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 564
		bodyModel[284].setRotationPoint(-151F, -60F, 4F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 5, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[285].setRotationPoint(-163F, -70F, -13F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[286].setRotationPoint(-163F, -69F, 3F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 24, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[287].setRotationPoint(-146F, -64F, 4F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[288].setRotationPoint(-156F, -55F, 4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[289].setRotationPoint(-151F, -59F, 4F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		bodyModel[290].setRotationPoint(-161F, -50F, 4F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 571
		bodyModel[291].setRotationPoint(-156F, -54F, 4F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		bodyModel[292].setRotationPoint(-166F, -45F, 4F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 573
		bodyModel[293].setRotationPoint(-161F, -49F, 4F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[294].setRotationPoint(-166F, -44F, 4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 19, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[295].setRotationPoint(-165F, -44F, 4F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 576
		bodyModel[296].setRotationPoint(-160F, -49F, 4F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[297].setRotationPoint(-155F, -54F, 4F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[298].setRotationPoint(-150F, -59F, 4F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		bodyModel[299].setRotationPoint(-167F, -60F, -15F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[300].setRotationPoint(-164F, -64F, -16F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 13, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[301].setRotationPoint(46F, -53F, -16F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 6, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		bodyModel[302].setRotationPoint(40F, -50F, -16F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[303].setRotationPoint(40F, -49F, -16F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[304].setRotationPoint(35F, -44F, -16F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 6, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 597
		bodyModel[305].setRotationPoint(35F, -45F, -16F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 9, 1, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[306].setRotationPoint(-149F, -67F, -9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 9, 10, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		bodyModel[307].setRotationPoint(-140F, -74F, -9F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		bodyModel[308].setRotationPoint(-141F, -74F, -9F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 601
		bodyModel[309].setRotationPoint(-141F, -74F, 0F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[310].setRotationPoint(-149F, -68F, -9F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 603
		bodyModel[311].setRotationPoint(-149F, -68F, 0F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 604
		bodyModel[312].setRotationPoint(-134F, -67F, 9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[313].setRotationPoint(-153F, -72F, -5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[314].setRotationPoint(-153F, -74F, -5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 607
		bodyModel[315].setRotationPoint(-151F, -73.5F, -4.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 608
		bodyModel[316].setRotationPoint(-151F, -73.5F, -2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[317].setRotationPoint(-151F, -73.5F, -7F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[318].setRotationPoint(-151F, -71.5F, -5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 611
		bodyModel[319].setRotationPoint(-151F, -75.5F, -3F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 612
		bodyModel[320].setRotationPoint(-151F, -75.5F, -6F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 613
		bodyModel[321].setRotationPoint(-151F, -72.5F, -7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F); // Box 614
		bodyModel[322].setRotationPoint(-151F, -72.5F, -2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		bodyModel[323].setRotationPoint(-151F, -73.5F, -4F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 616
		bodyModel[324].setRotationPoint(-157.75F, -72F, -3F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 617
		bodyModel[325].setRotationPoint(-157.75F, -75F, -3F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 618
		bodyModel[326].setRotationPoint(-157.75F, -75F, 0F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		bodyModel[327].setRotationPoint(-157.75F, -75F, 2F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		bodyModel[328].setRotationPoint(-157.75F, -73F, 2F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		bodyModel[329].setRotationPoint(-157.75F, -73F, 0F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		bodyModel[330].setRotationPoint(-157.75F, -72F, 6F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 623
		bodyModel[331].setRotationPoint(-157.75F, -72F, 4F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		bodyModel[332].setRotationPoint(-157.75F, -74F, 4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[333].setRotationPoint(-157.75F, -74F, 6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		bodyModel[334].setRotationPoint(-157.75F, -72F, 2F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 627
		bodyModel[335].setRotationPoint(-157.75F, -71F, 0F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyModel[336].setRotationPoint(-157F, -68F, 2F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyModel[337].setRotationPoint(-157F, -70F, 2F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		bodyModel[338].setRotationPoint(-155F, -73F, 2.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyModel[339].setRotationPoint(-155F, -73F, 1.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 1793, 17, textureX, textureY); // Box 25
		tailModel[1] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 27
		tailModel[2] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 28
		tailModel[3] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 29
		tailModel[4] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 30
		tailModel[5] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 31
		tailModel[6] = new ModelRendererTurbo(this, 1265, 33, textureX, textureY); // Box 32
		tailModel[7] = new ModelRendererTurbo(this, 1513, 33, textureX, textureY); // Box 33
		tailModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 35
		tailModel[9] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 37
		tailModel[10] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 38
		tailModel[11] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 39
		tailModel[12] = new ModelRendererTurbo(this, 1241, 41, textureX, textureY); // Box 40
		tailModel[13] = new ModelRendererTurbo(this, 1761, 41, textureX, textureY); // Box 41
		tailModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 42
		tailModel[15] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 43
		tailModel[16] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 45
		tailModel[17] = new ModelRendererTurbo(this, 1985, 1, textureX, textureY); // Box 65
		tailModel[18] = new ModelRendererTurbo(this, 2017, 1, textureX, textureY); // Box 66
		tailModel[19] = new ModelRendererTurbo(this, 1849, 9, textureX, textureY); // Box 67
		tailModel[20] = new ModelRendererTurbo(this, 1881, 9, textureX, textureY); // Box 68
		tailModel[21] = new ModelRendererTurbo(this, 1905, 9, textureX, textureY); // Box 69
		tailModel[22] = new ModelRendererTurbo(this, 1929, 9, textureX, textureY); // Box 70
		tailModel[23] = new ModelRendererTurbo(this, 1961, 9, textureX, textureY); // Box 71
		tailModel[24] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 73
		tailModel[25] = new ModelRendererTurbo(this, 2017, 41, textureX, textureY); // Box 77
		tailModel[26] = new ModelRendererTurbo(this, 1993, 9, textureX, textureY); // Box 78
		tailModel[27] = new ModelRendererTurbo(this, 1769, 17, textureX, textureY); // Box 79
		tailModel[28] = new ModelRendererTurbo(this, 1761, 33, textureX, textureY); // Box 80
		tailModel[29] = new ModelRendererTurbo(this, 1081, 49, textureX, textureY); // Box 81
		tailModel[30] = new ModelRendererTurbo(this, 1129, 49, textureX, textureY); // Box 83
		tailModel[31] = new ModelRendererTurbo(this, 1137, 49, textureX, textureY); // Box 84
		tailModel[32] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 85
		tailModel[33] = new ModelRendererTurbo(this, 1225, 49, textureX, textureY); // Box 86
		tailModel[34] = new ModelRendererTurbo(this, 1249, 49, textureX, textureY); // Box 87
		tailModel[35] = new ModelRendererTurbo(this, 1185, 49, textureX, textureY); // Box 88
		tailModel[36] = new ModelRendererTurbo(this, 1369, 49, textureX, textureY); // Box 89
		tailModel[37] = new ModelRendererTurbo(this, 1441, 49, textureX, textureY); // Box 90
		tailModel[38] = new ModelRendererTurbo(this, 1833, 49, textureX, textureY); // Box 91
		tailModel[39] = new ModelRendererTurbo(this, 1905, 49, textureX, textureY); // Box 92
		tailModel[40] = new ModelRendererTurbo(this, 1929, 49, textureX, textureY); // Box 93
		tailModel[41] = new ModelRendererTurbo(this, 1985, 49, textureX, textureY); // Box 94
		tailModel[42] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 95
		tailModel[43] = new ModelRendererTurbo(this, 1473, 49, textureX, textureY); // Box 96
		tailModel[44] = new ModelRendererTurbo(this, 1225, 49, textureX, textureY); // Box 97
		tailModel[45] = new ModelRendererTurbo(this, 1105, 49, textureX, textureY); // Box 98
		tailModel[46] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 99
		tailModel[47] = new ModelRendererTurbo(this, 1857, 49, textureX, textureY); // Box 100
		tailModel[48] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 101
		tailModel[49] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 102
		tailModel[50] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 103
		tailModel[51] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 104
		tailModel[52] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 105
		tailModel[53] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 106
		tailModel[54] = new ModelRendererTurbo(this, 1513, 1, textureX, textureY); // Box 107
		tailModel[55] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 108
		tailModel[56] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 109
		tailModel[57] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 110
		tailModel[58] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 111
		tailModel[59] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 112
		tailModel[60] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 113
		tailModel[61] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 191
		tailModel[62] = new ModelRendererTurbo(this, 1201, 97, textureX, textureY); // Box 506
		tailModel[63] = new ModelRendererTurbo(this, 1201, 89, textureX, textureY); // Box 507
		tailModel[64] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 508
		tailModel[65] = new ModelRendererTurbo(this, 1545, 89, textureX, textureY); // Box 511
		tailModel[66] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 512
		tailModel[67] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 513
		tailModel[68] = new ModelRendererTurbo(this, 913, 129, textureX, textureY); // Box 514
		tailModel[69] = new ModelRendererTurbo(this, 1569, 89, textureX, textureY); // Box 515
		tailModel[70] = new ModelRendererTurbo(this, 1025, 137, textureX, textureY); // Box 516
		tailModel[71] = new ModelRendererTurbo(this, 1737, 97, textureX, textureY); // Box 517
		tailModel[72] = new ModelRendererTurbo(this, 1233, 49, textureX, textureY); // Box 518
		tailModel[73] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 519
		tailModel[74] = new ModelRendererTurbo(this, 697, 169, textureX, textureY); // Box 592

		tailModel[0].addShapeBox(0F, 0F, 0F, 120, 22, 1, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -5F, 0F, -10F, 5F, 0F, 0F, 0F); // Box 25
		tailModel[0].setRotationPoint(46F, -63F, -17F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 100, 1, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 27
		tailModel[1].setRotationPoint(66F, -78F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 100, 1, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 28
		tailModel[2].setRotationPoint(66F, -78F, -3F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 100, 1, 5, 0F,0F, -0.35F, -0.15F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0.35F, -0.15F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 29
		tailModel[3].setRotationPoint(66F, -76F, -8F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 120, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, 0F, 0F, -1F, -1F, 0F, 0F, 4F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, -4F); // Box 30
		tailModel[4].setRotationPoint(46F, -76F, -8F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 120, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, -3F); // Box 31
		tailModel[5].setRotationPoint(46F, -72F, -12F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 120, 5, 1, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, -3F, 0F, -3F, 3F, 0F, 0F, -2F); // Box 32
		tailModel[6].setRotationPoint(46F, -68F, -15F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 120, 22, 1, 0F,0F, 0F, 0F, 0F, 3F, 5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 5F, 0F, -10F, -5F, 0F, 0F, 0F); // Box 33
		tailModel[7].setRotationPoint(46F, -63F, 16F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 120, 4, 1, 0F,0F, -1F, -1F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 4F); // Box 35
		tailModel[8].setRotationPoint(46F, -76F, 7F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 120, 5, 1, 0F,0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 3F, 0F, -3F, -3F, 0F, 0F, 2F); // Box 37
		tailModel[9].setRotationPoint(46F, -68F, 14F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 120, 5, 1, 0F,0F, 0F, 2F, 0F, 10F, -3F, 0F, 10F, 3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -12F, -4F, 0F, -12F, 4F, 0F, 0F, 0F); // Box 38
		tailModel[10].setRotationPoint(46F, -41F, -15F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 120, 1, 6, 0F,0F, 0F, 0F, 0F, 14F, -2F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -2F, 0F, -14F, 0F, 0F, 0F, 0F); // Box 39
		tailModel[11].setRotationPoint(46F, -31F, -6F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 120, 4, 1, 0F,0F, 0F, 4F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -13F, -3F, 0F, -14F, 2F, 0F, -1F, -1F); // Box 40
		tailModel[12].setRotationPoint(46F, -36F, -11F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 120, 1, 5, 0F,0F, 0F, 0F, 0F, 13F, -3F, 0F, 12F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -13F, -3F, 0F, -12F, 2F, 0F, 2F, 0F); // Box 41
		tailModel[13].setRotationPoint(46F, -33F, -11F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 120, 5, 1, 0F,0F, 0F, -2F, 0F, 10F, 3F, 0F, 10F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -12F, 4F, 0F, -12F, -4F, 0F, 0F, 0F); // Box 42
		tailModel[14].setRotationPoint(46F, -41F, 14F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 120, 1, 6, 0F,0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, -2F, 0F, 0F, 0F); // Box 43
		tailModel[15].setRotationPoint(46F, -31F, 0F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 120, 1, 5, 0F,0F, -2F, 0F, 0F, 12F, 2F, 0F, 13F, -3F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -12F, 2F, 0F, -13F, -3F, 0F, 0F, 0F); // Box 45
		tailModel[16].setRotationPoint(46F, -33F, 6F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		tailModel[17].setRotationPoint(166F, -75F, 0F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 66
		tailModel[18].setRotationPoint(166F, -66F, 11F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 67
		tailModel[19].setRotationPoint(166F, -75F, 3F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 68
		tailModel[20].setRotationPoint(166F, -69F, 10F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 69
		tailModel[21].setRotationPoint(166F, -71F, 9F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 2F, 0F); // Box 70
		tailModel[22].setRotationPoint(166F, -74F, 7F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		tailModel[23].setRotationPoint(166F, -75F, -3F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		tailModel[24].setRotationPoint(166F, -75F, -7F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 10, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 77
		tailModel[25].setRotationPoint(166F, -66F, -12F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 78
		tailModel[26].setRotationPoint(166F, -69F, -11F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 79
		tailModel[27].setRotationPoint(166F, -71F, -10F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -3F, 1F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		tailModel[28].setRotationPoint(166F, -74F, -9F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		tailModel[29].setRotationPoint(166F, -54F, -12F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 83
		tailModel[30].setRotationPoint(166F, -51F, -12F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 84
		tailModel[31].setRotationPoint(166F, -54F, -11F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 16, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 85
		tailModel[32].setRotationPoint(176F, -54F, -11F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 86
		tailModel[33].setRotationPoint(192F, -54F, -7F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 1F); // Box 87
		tailModel[34].setRotationPoint(176F, -54F, -12F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, -1F, 2F); // Box 88
		tailModel[35].setRotationPoint(166F, -48F, -11F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 89
		tailModel[36].setRotationPoint(166F, -46F, -8F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 90
		tailModel[37].setRotationPoint(166F, -45F, -4F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 91
		tailModel[38].setRotationPoint(166F, -51F, 11F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, -3F); // Box 92
		tailModel[39].setRotationPoint(166F, -48F, 10F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 93
		tailModel[40].setRotationPoint(166F, -46F, 4F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94
		tailModel[41].setRotationPoint(166F, -45F, 0F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 95
		tailModel[42].setRotationPoint(176F, -46F, -4F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 96
		tailModel[43].setRotationPoint(191F, -48F, -4F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		tailModel[44].setRotationPoint(194F, -54F, -4F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -1F, 0F, 1F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 98
		tailModel[45].setRotationPoint(192F, -54F, -7F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -1F); // Box 99
		tailModel[46].setRotationPoint(176F, -54F, 11F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 100
		tailModel[47].setRotationPoint(192F, -54F, 4F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 101
		tailModel[48].setRotationPoint(176F, -46F, 0F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, 0F, 0F); // Box 102
		tailModel[49].setRotationPoint(191F, -48F, 0F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		tailModel[50].setRotationPoint(194F, -54F, 0F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -5F, -1F, -1F, 5F, 0F, 0F, 1F); // Box 104
		tailModel[51].setRotationPoint(176F, -51F, -11F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 2F, -3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 105
		tailModel[52].setRotationPoint(176F, -47F, -8F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, 0F, 1F); // Box 106
		tailModel[53].setRotationPoint(176F, -48F, -10F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, -1F, -3F, 0F, -1F, 2F, 1F, 0F, 1F); // Box 107
		tailModel[54].setRotationPoint(192F, -51F, -7F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, -2F, 0F, -2F, 1F, 0F, 0F, 1F); // Box 108
		tailModel[55].setRotationPoint(191F, -49F, -6F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 16, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -1F, 5F, -1F, -1F, -5F, 0F, 0F, -1F); // Box 109
		tailModel[56].setRotationPoint(176F, -51F, 10F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, -2F, 0F, 0F, 0F); // Box 110
		tailModel[57].setRotationPoint(176F, -47F, 4F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 4F, 0F, -2F, -4F, 0F, 1F, -2F); // Box 111
		tailModel[58].setRotationPoint(176F, -48F, 9F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, -1F, 2F, 1F, -1F, -3F, 1F, 0F, -1F); // Box 112
		tailModel[59].setRotationPoint(192F, -51F, 6F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, 1F, -2F); // Box 113
		tailModel[60].setRotationPoint(191F, -49F, 5F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 100, 1, 5, 0F,0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -0.35F, -0.15F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 2F, -1F, 0F, 0.35F, -0.15F); // Box 191
		tailModel[61].setRotationPoint(66F, -76F, 3F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		tailModel[62].setRotationPoint(148F, -43F, -1F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 507
		tailModel[63].setRotationPoint(148.5F, -37F, 1F);
		tailModel[63].rotateAngleZ = 0.45378561F;

		tailModel[64].addShapeBox(0F, 2F, 1F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		tailModel[64].setRotationPoint(148.5F, -37F, 1F);
		tailModel[64].rotateAngleZ = 0.45378561F;

		tailModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		tailModel[65].setRotationPoint(148.5F, -37F, -3F);
		tailModel[65].rotateAngleZ = 0.45378561F;

		tailModel[66].addShapeBox(0F, 2F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		tailModel[66].setRotationPoint(148.5F, -37F, -3F);
		tailModel[66].rotateAngleZ = 0.45378561F;

		tailModel[67].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		tailModel[67].setRotationPoint(150F, -33F, -1F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		tailModel[68].setRotationPoint(150F, -34F, -1F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 515
		tailModel[69].setRotationPoint(149F, -33F, -1F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 516
		tailModel[70].setRotationPoint(150F, -28F, -1F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 517
		tailModel[71].setRotationPoint(155F, -33F, -1F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		tailModel[72].setRotationPoint(151.5F, -30.7F, 1F);
		tailModel[72].rotateAngleZ = 0.45378561F;

		tailModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		tailModel[73].setRotationPoint(151.5F, -30.7F, -2F);
		tailModel[73].rotateAngleZ = 0.45378561F;

		tailModel[74].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 592
		tailModel[74].setRotationPoint(166F, -54F, 11F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 40
		leftWingModel[1] = new ModelRendererTurbo(this, 1425, 41, textureX, textureY); // Box 41
		leftWingModel[2] = new ModelRendererTurbo(this, 1145, 49, textureX, textureY); // Box 42
		leftWingModel[3] = new ModelRendererTurbo(this, 1697, 49, textureX, textureY); // Box 44
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 46
		leftWingModel[5] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 47
		leftWingModel[6] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 48
		leftWingModel[7] = new ModelRendererTurbo(this, 1081, 49, textureX, textureY); // Box 49
		leftWingModel[8] = new ModelRendererTurbo(this, 1369, 49, textureX, textureY); // Box 50
		leftWingModel[9] = new ModelRendererTurbo(this, 1833, 49, textureX, textureY); // Box 51
		leftWingModel[10] = new ModelRendererTurbo(this, 1937, 49, textureX, textureY); // Box 52
		leftWingModel[11] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Box 335
		leftWingModel[12] = new ModelRendererTurbo(this, 1081, 153, textureX, textureY); // Box 336
		leftWingModel[13] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 337
		leftWingModel[14] = new ModelRendererTurbo(this, 1993, 97, textureX, textureY); // Box 338
		leftWingModel[15] = new ModelRendererTurbo(this, 905, 105, textureX, textureY); // Box 339
		leftWingModel[16] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 340
		leftWingModel[17] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 341
		leftWingModel[18] = new ModelRendererTurbo(this, 1201, 153, textureX, textureY); // Box 342
		leftWingModel[19] = new ModelRendererTurbo(this, 1369, 161, textureX, textureY); // Box 344
		leftWingModel[20] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 346
		leftWingModel[21] = new ModelRendererTurbo(this, 1441, 161, textureX, textureY); // Box 347
		leftWingModel[22] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 349
		leftWingModel[23] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Box 350
		leftWingModel[24] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 352
		leftWingModel[25] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 353
		leftWingModel[26] = new ModelRendererTurbo(this, 1913, 185, textureX, textureY); // Box 354
		leftWingModel[27] = new ModelRendererTurbo(this, 1649, 113, textureX, textureY); // Box 355
		leftWingModel[28] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 356
		leftWingModel[29] = new ModelRendererTurbo(this, 697, 145, textureX, textureY); // Box 357
		leftWingModel[30] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 358
		leftWingModel[31] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 359
		leftWingModel[32] = new ModelRendererTurbo(this, 2001, 153, textureX, textureY); // Box 360
		leftWingModel[33] = new ModelRendererTurbo(this, 625, 161, textureX, textureY); // Box 361
		leftWingModel[34] = new ModelRendererTurbo(this, 1201, 177, textureX, textureY); // Box 362
		leftWingModel[35] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 363
		leftWingModel[36] = new ModelRendererTurbo(this, 1457, 89, textureX, textureY); // Box 365
		leftWingModel[37] = new ModelRendererTurbo(this, 1545, 89, textureX, textureY); // Box 366
		leftWingModel[38] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 368
		leftWingModel[39] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 369
		leftWingModel[40] = new ModelRendererTurbo(this, 1185, 97, textureX, textureY); // Box 370
		leftWingModel[41] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 372
		leftWingModel[42] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 373
		leftWingModel[43] = new ModelRendererTurbo(this, 1273, 97, textureX, textureY); // Box 374
		leftWingModel[44] = new ModelRendererTurbo(this, 1889, 129, textureX, textureY); // Box 387
		leftWingModel[45] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Box 388
		leftWingModel[46] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 392
		leftWingModel[47] = new ModelRendererTurbo(this, 1985, 9, textureX, textureY); // Box 393
		leftWingModel[48] = new ModelRendererTurbo(this, 1745, 73, textureX, textureY); // Box 394
		leftWingModel[49] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 406
		leftWingModel[50] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 407
		leftWingModel[51] = new ModelRendererTurbo(this, 1457, 73, textureX, textureY); // Box 408
		leftWingModel[52] = new ModelRendererTurbo(this, 1953, 73, textureX, textureY); // Box 409
		leftWingModel[53] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 410
		leftWingModel[54] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 411
		leftWingModel[55] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 412
		leftWingModel[56] = new ModelRendererTurbo(this, 1185, 81, textureX, textureY); // Box 413
		leftWingModel[57] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 632

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 37, 15, 65, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 40
		leftWingModel[0].setRotationPoint(-78F, -66F, -82F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 8, 15, 65, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 41
		leftWingModel[1].setRotationPoint(-92F, -66F, -82F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 6, 15, 65, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftWingModel[2].setRotationPoint(-84F, -66F, -82F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 35, 11, 65, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 44
		leftWingModel[3].setRotationPoint(-41F, -64F, -82F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 8, 15, 158, 0F,-16F, -7F, 0F, 12F, -4F, 0F, 0F, -15F, 0F, 0F, -20F, 0F, -16F, -7F, 0F, 12F, -4F, 0F, 0F, 15F, 0F, 0F, 10F, 0F); // Box 46
		leftWingModel[4].setRotationPoint(-92F, -81F, -240F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 37, 15, 158, 0F,-12F, -4F, 0F, 0F, -6F, 0F, 0F, -17F, 0F, 0F, -15F, 0F, -12F, -4F, 0F, 0F, -6F, 0F, 0F, 13F, 0F, 0F, 15F, 0F); // Box 47
		leftWingModel[5].setRotationPoint(-78F, -81F, -240F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 6, 15, 158, 0F,-12F, -4F, 0F, 12F, -4F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, -12F, -4F, 0F, 12F, -4F, 0F, 0F, 15F, 0F, 0F, 15F, 0F); // Box 48
		leftWingModel[6].setRotationPoint(-84F, -81F, -240F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 6, 7, 33, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, -3F, 0F, 6F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 49
		leftWingModel[7].setRotationPoint(-72F, -78F, -273F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 19, 4, 33, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 6F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 6F, 4F, 0F); // Box 50
		leftWingModel[8].setRotationPoint(-60F, -78F, -273F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 2, 33, 0F,0F, 0F, 0F, -8F, -1F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 51
		leftWingModel[9].setRotationPoint(-41F, -77F, -273F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 4, 7, 33, 0F,-6F, -1F, 0F, 6F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -6F, -5F, 0F, 6F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 52
		leftWingModel[10].setRotationPoint(-76F, -78F, -273F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 41, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 335
		leftWingModel[11].setRotationPoint(-113F, -64F, -134F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 45, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		leftWingModel[12].setRotationPoint(-113F, -66F, -147F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 337
		leftWingModel[13].setRotationPoint(-122F, -66F, -147F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F); // Box 338
		leftWingModel[14].setRotationPoint(-122F, -64F, -134F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F,0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 339
		leftWingModel[15].setRotationPoint(-122F, -64F, -149F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 9, 18, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 340
		leftWingModel[16].setRotationPoint(-122F, -64F, -147F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F); // Box 341
		leftWingModel[17].setRotationPoint(-122F, -46F, -147F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 41, 18, 2, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		leftWingModel[18].setRotationPoint(-113F, -64F, -149F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 21, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F); // Box 344
		leftWingModel[19].setRotationPoint(-72F, -64F, -147F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 21, 18, 2, 0F,0F, -6F, 0F, 0F, -2F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -14F, -3F, 0F, -12F, 2F, 0F, 0F, 0F); // Box 346
		leftWingModel[20].setRotationPoint(-72F, -64F, -149F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 21, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -12F, 2F, 0F, -14F, -3F, 0F, -6F, 0F); // Box 347
		leftWingModel[21].setRotationPoint(-72F, -64F, -134F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 45, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		leftWingModel[22].setRotationPoint(-121F, -64F, -72F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 89, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 350
		leftWingModel[23].setRotationPoint(-121F, -44F, -72F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 352
		leftWingModel[24].setRotationPoint(-130F, -64F, -72F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 45, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 353
		leftWingModel[25].setRotationPoint(-121F, -62F, -59F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 45, 18, 2, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		leftWingModel[26].setRotationPoint(-121F, -62F, -74F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F); // Box 355
		leftWingModel[27].setRotationPoint(-130F, -44F, -72F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F,0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 356
		leftWingModel[28].setRotationPoint(-130F, -62F, -74F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F); // Box 357
		leftWingModel[29].setRotationPoint(-130F, -62F, -59F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 15, 18, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 358
		leftWingModel[30].setRotationPoint(-32F, -62F, -72F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 44, 10, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		leftWingModel[31].setRotationPoint(-76F, -54F, -74F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 15, 10, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 360
		leftWingModel[32].setRotationPoint(-32F, -54F, -74F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 15, 10, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, -6F, 0F); // Box 361
		leftWingModel[33].setRotationPoint(-32F, -54F, -59F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 44, 10, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 362
		leftWingModel[34].setRotationPoint(-76F, -54F, -59F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 15, 2, 13, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, -4F); // Box 363
		leftWingModel[35].setRotationPoint(-32F, -44F, -72F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 365
		leftWingModel[36].setRotationPoint(-136F, -61F, -70F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F); // Box 366
		leftWingModel[37].setRotationPoint(-136F, -51F, -70F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F); // Box 368
		leftWingModel[38].setRotationPoint(-136F, -60F, -71F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F); // Box 369
		leftWingModel[39].setRotationPoint(-136F, -60F, -61F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F); // Box 370
		leftWingModel[40].setRotationPoint(-128F, -63F, -136F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 372
		leftWingModel[41].setRotationPoint(-128F, -64F, -145F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F); // Box 373
		leftWingModel[42].setRotationPoint(-128F, -54F, -145F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F); // Box 374
		leftWingModel[43].setRotationPoint(-128F, -63F, -146F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 387
		leftWingModel[44].setRotationPoint(-138F, -58F, -68F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 388
		leftWingModel[45].setRotationPoint(-130F, -61F, -143F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 392
		leftWingModel[46].setRotationPoint(-131F, -45F, -70F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		leftWingModel[47].setRotationPoint(-131F, -44F, -68F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 394
		leftWingModel[48].setRotationPoint(-131F, -45F, -63F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 406
		leftWingModel[49].setRotationPoint(-123F, -52F, -134F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		leftWingModel[50].setRotationPoint(-123F, -53F, -138F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		leftWingModel[51].setRotationPoint(-123F, -52F, -143F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 409
		leftWingModel[52].setRotationPoint(-123F, -53F, -148F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 410
		leftWingModel[53].setRotationPoint(-123F, -52F, -148F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 411
		leftWingModel[54].setRotationPoint(-123F, -47F, -145F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		leftWingModel[55].setRotationPoint(-123F, -46F, -143F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 413
		leftWingModel[56].setRotationPoint(-123F, -47F, -138F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 41, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 632
		leftWingModel[57].setRotationPoint(-113F, -46F, -147F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 53
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 54
		rightWingModel[2] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 55
		rightWingModel[3] = new ModelRendererTurbo(this, 1513, 65, textureX, textureY); // Box 56
		rightWingModel[4] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 58
		rightWingModel[5] = new ModelRendererTurbo(this, 1081, 225, textureX, textureY); // Box 59
		rightWingModel[6] = new ModelRendererTurbo(this, 1369, 145, textureX, textureY); // Box 60
		rightWingModel[7] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 61
		rightWingModel[8] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 62
		rightWingModel[9] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 63
		rightWingModel[10] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 64
		rightWingModel[11] = new ModelRendererTurbo(this, 1401, 129, textureX, textureY); // Box 296
		rightWingModel[12] = new ModelRendererTurbo(this, 905, 137, textureX, textureY); // Box 297
		rightWingModel[13] = new ModelRendererTurbo(this, 1081, 137, textureX, textureY); // Box 298
		rightWingModel[14] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 299
		rightWingModel[15] = new ModelRendererTurbo(this, 1153, 97, textureX, textureY); // Box 300
		rightWingModel[16] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 301
		rightWingModel[17] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 302
		rightWingModel[18] = new ModelRendererTurbo(this, 1241, 97, textureX, textureY); // Box 303
		rightWingModel[19] = new ModelRendererTurbo(this, 1649, 81, textureX, textureY); // Box 304
		rightWingModel[20] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 305
		rightWingModel[21] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 306
		rightWingModel[22] = new ModelRendererTurbo(this, 1977, 121, textureX, textureY); // Box 307
		rightWingModel[23] = new ModelRendererTurbo(this, 1793, 129, textureX, textureY); // Box 308
		rightWingModel[24] = new ModelRendererTurbo(this, 1833, 97, textureX, textureY); // Box 309
		rightWingModel[25] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 310
		rightWingModel[26] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 311
		rightWingModel[27] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 312
		rightWingModel[28] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 316
		rightWingModel[29] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 320
		rightWingModel[30] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 321
		rightWingModel[31] = new ModelRendererTurbo(this, 1857, 97, textureX, textureY); // Box 322
		rightWingModel[32] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 323
		rightWingModel[33] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Box 324
		rightWingModel[34] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 325
		rightWingModel[35] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 326
		rightWingModel[36] = new ModelRendererTurbo(this, 1793, 145, textureX, textureY); // Box 327
		rightWingModel[37] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 329
		rightWingModel[38] = new ModelRendererTurbo(this, 1545, 145, textureX, textureY); // Box 331
		rightWingModel[39] = new ModelRendererTurbo(this, 1633, 145, textureX, textureY); // Box 332
		rightWingModel[40] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 333
		rightWingModel[41] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 334
		rightWingModel[42] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 343
		rightWingModel[43] = new ModelRendererTurbo(this, 1945, 153, textureX, textureY); // Box 345
		rightWingModel[44] = new ModelRendererTurbo(this, 1081, 169, textureX, textureY); // Box 348
		rightWingModel[45] = new ModelRendererTurbo(this, 1633, 161, textureX, textureY); // Box 351
		rightWingModel[46] = new ModelRendererTurbo(this, 1489, 161, textureX, textureY); // Box 364
		rightWingModel[47] = new ModelRendererTurbo(this, 1681, 161, textureX, textureY); // Box 371
		rightWingModel[48] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 375
		rightWingModel[49] = new ModelRendererTurbo(this, 1873, 161, textureX, textureY); // Box 376
		rightWingModel[50] = new ModelRendererTurbo(this, 1793, 169, textureX, textureY); // Box 377
		rightWingModel[51] = new ModelRendererTurbo(this, 1889, 97, textureX, textureY); // Box 378
		rightWingModel[52] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 379
		rightWingModel[53] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 380
		rightWingModel[54] = new ModelRendererTurbo(this, 1545, 177, textureX, textureY); // Box 381
		rightWingModel[55] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 382
		rightWingModel[56] = new ModelRendererTurbo(this, 1577, 177, textureX, textureY); // Box 383
		rightWingModel[57] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 384
		rightWingModel[58] = new ModelRendererTurbo(this, 1681, 113, textureX, textureY); // Box 385
		rightWingModel[59] = new ModelRendererTurbo(this, 2025, 121, textureX, textureY); // Box 386
		rightWingModel[60] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 389
		rightWingModel[61] = new ModelRendererTurbo(this, 1953, 9, textureX, textureY); // Box 390
		rightWingModel[62] = new ModelRendererTurbo(this, 1153, 73, textureX, textureY); // Box 391
		rightWingModel[63] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 395
		rightWingModel[64] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 396
		rightWingModel[65] = new ModelRendererTurbo(this, 1425, 185, textureX, textureY); // Box 405
		rightWingModel[66] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 414
		rightWingModel[67] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 415
		rightWingModel[68] = new ModelRendererTurbo(this, 1193, 81, textureX, textureY); // Box 416
		rightWingModel[69] = new ModelRendererTurbo(this, 1201, 81, textureX, textureY); // Box 417
		rightWingModel[70] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Box 418
		rightWingModel[71] = new ModelRendererTurbo(this, 1481, 81, textureX, textureY); // Box 419
		rightWingModel[72] = new ModelRendererTurbo(this, 1289, 81, textureX, textureY); // Box 420
		rightWingModel[73] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 421
		rightWingModel[74] = new ModelRendererTurbo(this, 1673, 81, textureX, textureY); // Box 422
		rightWingModel[75] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 423
		rightWingModel[76] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 424
		rightWingModel[77] = new ModelRendererTurbo(this, 1193, 89, textureX, textureY); // Box 425
		rightWingModel[78] = new ModelRendererTurbo(this, 1745, 81, textureX, textureY); // Box 426
		rightWingModel[79] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 427
		rightWingModel[80] = new ModelRendererTurbo(this, 1281, 89, textureX, textureY); // Box 428
		rightWingModel[81] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 429

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 37, 15, 65, 0F,0F, 0F, 2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 53
		rightWingModel[0].setRotationPoint(-78F, -66F, 17F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 8, 15, 65, 0F,0F, -5F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 54
		rightWingModel[1].setRotationPoint(-92F, -66F, 17F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 6, 15, 65, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightWingModel[2].setRotationPoint(-84F, -66F, 17F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 35, 11, 65, 0F,0F, 0F, 2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 56
		rightWingModel[3].setRotationPoint(-41F, -64F, 17F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 8, 15, 158, 0F,0F, -20F, 0F, 0F, -15F, 0F, 12F, -4F, 0F, -16F, -7F, 0F, 0F, 10F, 0F, 0F, 15F, 0F, 12F, -4F, 0F, -16F, -7F, 0F); // Box 58
		rightWingModel[4].setRotationPoint(-92F, -81F, 82F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 37, 15, 158, 0F,0F, -15F, 0F, 0F, -17F, 0F, 0F, -6F, 0F, -12F, -4F, 0F, 0F, 15F, 0F, 0F, 13F, 0F, 0F, -6F, 0F, -12F, -4F, 0F); // Box 59
		rightWingModel[5].setRotationPoint(-78F, -81F, 82F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 6, 15, 158, 0F,0F, -15F, 0F, 0F, -15F, 0F, 12F, -4F, 0F, -12F, -4F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 12F, -4F, 0F, -12F, -4F, 0F); // Box 60
		rightWingModel[6].setRotationPoint(-84F, -81F, 82F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 6, 7, 33, 0F,0F, -1F, 0F, 0F, -1F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 6F, -3F, 0F, -6F, -3F, 0F); // Box 61
		rightWingModel[7].setRotationPoint(-72F, -78F, 240F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 19, 4, 33, 0F,6F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, 4F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 62
		rightWingModel[8].setRotationPoint(-60F, -78F, 240F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 17, 2, 33, 0F,0F, -2F, 0F, 0F, -4F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, -8F, -1F, 0F, 0F, 0F, 0F); // Box 63
		rightWingModel[9].setRotationPoint(-41F, -77F, 240F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 4, 7, 33, 0F,0F, -4F, 0F, 0F, -1F, 0F, 6F, 0F, 0F, -6F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 6F, -3F, 0F, -6F, -5F, 0F); // Box 64
		rightWingModel[10].setRotationPoint(-76F, -78F, 240F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 45, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightWingModel[11].setRotationPoint(-121F, -62F, 59F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 45, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		rightWingModel[12].setRotationPoint(-121F, -64F, 59F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 89, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 298
		rightWingModel[13].setRotationPoint(-121F, -44F, 59F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 9, 18, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 299
		rightWingModel[14].setRotationPoint(-130F, -62F, 59F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 300
		rightWingModel[15].setRotationPoint(-130F, -64F, 59F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 45, 18, 2, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		rightWingModel[16].setRotationPoint(-121F, -62F, 57F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 45, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 302
		rightWingModel[17].setRotationPoint(-121F, -62F, 72F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F); // Box 303
		rightWingModel[18].setRotationPoint(-130F, -44F, 59F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F); // Box 304
		rightWingModel[19].setRotationPoint(-130F, -62F, 72F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F,0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 305
		rightWingModel[20].setRotationPoint(-130F, -62F, 57F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 44, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightWingModel[21].setRotationPoint(-76F, -62F, 59F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 15, 18, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 307
		rightWingModel[22].setRotationPoint(-32F, -62F, 59F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 44, 10, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 308
		rightWingModel[23].setRotationPoint(-76F, -54F, 72F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 15, 10, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, -6F, 0F); // Box 309
		rightWingModel[24].setRotationPoint(-32F, -54F, 72F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 15, 10, 2, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 310
		rightWingModel[25].setRotationPoint(-32F, -54F, 57F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 44, 10, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		rightWingModel[26].setRotationPoint(-76F, -54F, 57F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 15, 2, 13, 0F,0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, -4F); // Box 312
		rightWingModel[27].setRotationPoint(-32F, -44F, 59F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 41, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 316
		rightWingModel[28].setRotationPoint(-113F, -46F, 134F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 41, 18, 2, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		rightWingModel[29].setRotationPoint(-113F, -64F, 132F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 45, 2, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		rightWingModel[30].setRotationPoint(-113F, -66F, 134F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 322
		rightWingModel[31].setRotationPoint(-122F, -66F, 134F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F,0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 323
		rightWingModel[32].setRotationPoint(-122F, -64F, 132F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 9, 18, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -1F); // Box 324
		rightWingModel[33].setRotationPoint(-122F, -64F, 147F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 9, 18, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 325
		rightWingModel[34].setRotationPoint(-122F, -64F, 134F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 9, 2, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, -4F); // Box 326
		rightWingModel[35].setRotationPoint(-122F, -46F, 134F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 41, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Box 327
		rightWingModel[36].setRotationPoint(-113F, -64F, 147F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 41, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		rightWingModel[37].setRotationPoint(-113F, -64F, 134F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 21, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, 0F, 0F); // Box 331
		rightWingModel[38].setRotationPoint(-72F, -64F, 134F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 21, 2, 13, 0F,0F, 0F, 0F, 0F, 12F, -2F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F); // Box 332
		rightWingModel[39].setRotationPoint(-72F, -46F, 134F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 21, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -3F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -12F, 2F, 0F, -14F, -3F, 0F, -6F, 0F); // Box 333
		rightWingModel[40].setRotationPoint(-72F, -64F, 147F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 21, 18, 2, 0F,0F, -6F, 0F, 0F, -2F, -3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -14F, -3F, 0F, -12F, 2F, 0F, 0F, 0F); // Box 334
		rightWingModel[41].setRotationPoint(-72F, -64F, 132F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 41, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		rightWingModel[42].setRotationPoint(-113F, -64F, -147F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 21, 2, 13, 0F,0F, 0F, 0F, 0F, 12F, -2F, 0F, 12F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -13F, -4F, 0F, -13F, -4F, 0F, 0F, -4F); // Box 345
		rightWingModel[43].setRotationPoint(-72F, -46F, -147F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 45, 18, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		rightWingModel[44].setRotationPoint(-121F, -62F, -72F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 9, 12, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 351
		rightWingModel[45].setRotationPoint(-130F, -62F, -72F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 6, 9, 9, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 364
		rightWingModel[46].setRotationPoint(-136F, -60F, -70F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 6, 9, 9, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 371
		rightWingModel[47].setRotationPoint(-128F, -63F, -145F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 6, 9, 9, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 375
		rightWingModel[48].setRotationPoint(-136F, -60F, 61F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 376
		rightWingModel[49].setRotationPoint(-136F, -61F, 61F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F); // Box 377
		rightWingModel[50].setRotationPoint(-136F, -51F, 61F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F); // Box 378
		rightWingModel[51].setRotationPoint(-136F, -60F, 70F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F); // Box 379
		rightWingModel[52].setRotationPoint(-136F, -60F, 60F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 2F); // Box 380
		rightWingModel[53].setRotationPoint(-128F, -63F, 135F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 6, 9, 9, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 381
		rightWingModel[54].setRotationPoint(-128F, -63F, 136F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F); // Box 382
		rightWingModel[55].setRotationPoint(-128F, -64F, 136F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -2F); // Box 383
		rightWingModel[56].setRotationPoint(-128F, -54F, 136F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 6, 9, 1, 0F,0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F); // Box 384
		rightWingModel[57].setRotationPoint(-128F, -63F, 145F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 385
		rightWingModel[58].setRotationPoint(-138F, -58F, 63F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 386
		rightWingModel[59].setRotationPoint(-130F, -61F, 138F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		rightWingModel[60].setRotationPoint(-131F, -50F, -68F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 390
		rightWingModel[61].setRotationPoint(-131F, -51F, -73F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 391
		rightWingModel[62].setRotationPoint(-131F, -50F, -73F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 395
		rightWingModel[63].setRotationPoint(-131F, -50F, -59F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		rightWingModel[64].setRotationPoint(-131F, -51F, -63F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 9, 6, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 405
		rightWingModel[65].setRotationPoint(-130F, -50F, -72F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		rightWingModel[66].setRotationPoint(-131F, -50F, 63F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		rightWingModel[67].setRotationPoint(-131F, -51F, 68F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 416
		rightWingModel[68].setRotationPoint(-131F, -50F, 72F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 417
		rightWingModel[69].setRotationPoint(-131F, -45F, 68F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		rightWingModel[70].setRotationPoint(-131F, -44F, 63F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 419
		rightWingModel[71].setRotationPoint(-131F, -45F, 61F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 420
		rightWingModel[72].setRotationPoint(-131F, -50F, 58F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 421
		rightWingModel[73].setRotationPoint(-131F, -51F, 58F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 2F); // Box 422
		rightWingModel[74].setRotationPoint(-123F, -52F, 133F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 423
		rightWingModel[75].setRotationPoint(-123F, -53F, 133F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		rightWingModel[76].setRotationPoint(-123F, -52F, 138F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		rightWingModel[77].setRotationPoint(-123F, -53F, 143F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 426
		rightWingModel[78].setRotationPoint(-123F, -52F, 147F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 427
		rightWingModel[79].setRotationPoint(-123F, -47F, 143F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		rightWingModel[80].setRotationPoint(-123F, -46F, 138F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 429
		rightWingModel[81].setRotationPoint(-123F, -47F, 136F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1225, 73, textureX, textureY); // Box 216
		yawFlapModel[1] = new ModelRendererTurbo(this, 1713, 73, textureX, textureY); // Box 217
		yawFlapModel[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 218
		yawFlapModel[3] = new ModelRendererTurbo(this, 1961, 97, textureX, textureY); // Box 227
		yawFlapModel[4] = new ModelRendererTurbo(this, 1513, 81, textureX, textureY); // Box 228
		yawFlapModel[5] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 229

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 11, 33, 1, 0F,0F, 0F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		yawFlapModel[0].setRotationPoint(152F, -107F, 92F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 11, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		yawFlapModel[1].setRotationPoint(152F, -74F, 92F);

		yawFlapModel[2].addShapeBox(-6F, 0F, 0F, 17, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F); // Box 218
		yawFlapModel[2].setRotationPoint(152F, -52F, 92F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 11, 33, 1, 0F,0F, 0F, 0F, -3F, -14F, 0F, -3F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		yawFlapModel[3].setRotationPoint(152F, -107F, -93F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 11, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		yawFlapModel[4].setRotationPoint(152F, -74F, -93F);

		yawFlapModel[5].addShapeBox(-6F, 0F, 0F, 17, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F); // Box 229
		yawFlapModel[5].setRotationPoint(152F, -52F, -93F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1321, 225, textureX, textureY); // Box 206

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 23, 2, 74, 0F,0F, 0F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 206
		pitchFlapLeftModel[0].setRotationPoint(149F, -55F, -87F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 202

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 23, 2, 74, 0F,0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, -1F, 0F, 0F, 0F, 0F); // Box 202
		pitchFlapRightModel[0].setRotationPoint(149F, -55F, 13F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1137, 49, textureX, textureY); // Box 45

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 35, 11, 158, 0F,0F, -4F, 0F, -18F, -6F, 0F, 0F, -21F, 0F, 0F, -15F, 0F, 0F, -4F, 0F, -18F, -5F, 0F, 0F, 10F, 0F, 0F, 15F, 0F); // Box 45
		pitchFlapLeftWingModel[0].setRotationPoint(-41F, -79F, -240F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 1561, 129, textureX, textureY); // Box 57

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 35, 11, 158, 0F,0F, -15F, 0F, 0F, -21F, 0F, -18F, -6F, 0F, 0F, -4F, 0F, 0F, 15F, 0F, 0F, 10F, 0F, -18F, -5F, 0F, 0F, -4F, 0F); // Box 57
		pitchFlapRightWingModel[0].setRotationPoint(-41F, -79F, 82F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 460
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 462
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 769, 193, textureX, textureY); // Box 463
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1201, 193, textureX, textureY); // Box 464
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1289, 97, textureX, textureY); // Box 465
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 466
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 467
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 468
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 2041, 121, textureX, textureY); // Box 469
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 1473, 185, textureX, textureY); // Box 479
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 1369, 193, textureX, textureY); // Box 480
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 1601, 185, textureX, textureY); // Box 481
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 1793, 185, textureX, textureY); // Box 482
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 1081, 201, textureX, textureY); // Box 483
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 1377, 145, textureX, textureY); // Box 484
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 1545, 201, textureX, textureY); // Box 485
		leftWingWheelModel[16] = new ModelRendererTurbo(this, 1881, 145, textureX, textureY); // Box 486
		leftWingWheelModel[17] = new ModelRendererTurbo(this, 1841, 185, textureX, textureY); // Box 487
		leftWingWheelModel[18] = new ModelRendererTurbo(this, 1633, 201, textureX, textureY); // Box 488
		leftWingWheelModel[19] = new ModelRendererTurbo(this, 1657, 201, textureX, textureY); // Box 489
		leftWingWheelModel[20] = new ModelRendererTurbo(this, 865, 193, textureX, textureY); // Box 491
		leftWingWheelModel[21] = new ModelRendererTurbo(this, 2001, 201, textureX, textureY); // Box 492

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		leftWingWheelModel[0].setRotationPoint(-121F, -44F, -71.5F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 462
		leftWingWheelModel[1].setRotationPoint(-121F, -44F, -72.5F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		leftWingWheelModel[2].setRotationPoint(-121F, -44F, -60.5F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		leftWingWheelModel[3].setRotationPoint(-121F, -44F, -59.5F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 37, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		leftWingWheelModel[4].setRotationPoint(-121F, -43F, -70F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 37, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		leftWingWheelModel[5].setRotationPoint(-121F, -43F, -62F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 467
		leftWingWheelModel[6].setRotationPoint(-121F, -43F, -66F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 468
		leftWingWheelModel[7].setRotationPoint(-121F, -43F, -66F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, -2F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, 25F, -2F, 0F); // Box 469
		leftWingWheelModel[8].setRotationPoint(-95F, -43F, -62F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 13, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		leftWingWheelModel[9].setRotationPoint(-127F, -13F, -69F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		leftWingWheelModel[10].setRotationPoint(-127F, -17F, -69F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		leftWingWheelModel[11].setRotationPoint(-131F, -13F, -69F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		leftWingWheelModel[12].setRotationPoint(-114F, -13F, -69F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		leftWingWheelModel[13].setRotationPoint(-127F, 0F, -69F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		leftWingWheelModel[14].setRotationPoint(-131F, -17F, -69F);

		leftWingWheelModel[15].addShapeBox(0F, 0F, 0F, 13, 1, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 485
		leftWingWheelModel[15].setRotationPoint(-127F, -18F, -69F);

		leftWingWheelModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		leftWingWheelModel[16].setRotationPoint(-114F, -17F, -69F);

		leftWingWheelModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 487
		leftWingWheelModel[17].setRotationPoint(-114F, 0F, -69F);

		leftWingWheelModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 488
		leftWingWheelModel[18].setRotationPoint(-131F, 0F, -69F);

		leftWingWheelModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 489
		leftWingWheelModel[19].setRotationPoint(-127F, 4F, -69F);

		leftWingWheelModel[20].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 491
		leftWingWheelModel[20].setRotationPoint(-132F, -13F, -69F);

		leftWingWheelModel[21].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 492
		leftWingWheelModel[21].setRotationPoint(-110F, -13F, -69F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1633, 193, textureX, textureY); // Box 470
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 471
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 472
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 785, 201, textureX, textureY); // Box 473
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 474
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 475
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1417, 105, textureX, textureY); // Box 476
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 477
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 478
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 1913, 209, textureX, textureY); // Box 493
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 1081, 217, textureX, textureY); // Box 494
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 2025, 201, textureX, textureY); // Box 495
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 1961, 209, textureX, textureY); // Box 496
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 1793, 217, textureX, textureY); // Box 497
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 1585, 209, textureX, textureY); // Box 498
		rightWingWheelModel[15] = new ModelRendererTurbo(this, 1121, 225, textureX, textureY); // Box 499
		rightWingWheelModel[16] = new ModelRendererTurbo(this, 1841, 217, textureX, textureY); // Box 500
		rightWingWheelModel[17] = new ModelRendererTurbo(this, 1985, 217, textureX, textureY); // Box 501
		rightWingWheelModel[18] = new ModelRendererTurbo(this, 1169, 225, textureX, textureY); // Box 502
		rightWingWheelModel[19] = new ModelRendererTurbo(this, 1193, 225, textureX, textureY); // Box 503
		rightWingWheelModel[20] = new ModelRendererTurbo(this, 1321, 225, textureX, textureY); // Box 504
		rightWingWheelModel[21] = new ModelRendererTurbo(this, 1345, 225, textureX, textureY); // Box 505

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		rightWingWheelModel[0].setRotationPoint(-121F, -44F, 70.5F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		rightWingWheelModel[1].setRotationPoint(-121F, -44F, 71.5F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		rightWingWheelModel[2].setRotationPoint(-121F, -44F, 59.5F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 35, 6, 1, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		rightWingWheelModel[3].setRotationPoint(-121F, -44F, 58.5F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 37, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		rightWingWheelModel[4].setRotationPoint(-121F, -43F, 69F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 37, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		rightWingWheelModel[5].setRotationPoint(-121F, -43F, 61F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 476
		rightWingWheelModel[6].setRotationPoint(-121F, -43F, 65F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 477
		rightWingWheelModel[7].setRotationPoint(-121F, -43F, 65F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 2, 29, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, -2F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, 25F, -2F, 0F); // Box 478
		rightWingWheelModel[8].setRotationPoint(-95F, -43F, 61F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 13, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		rightWingWheelModel[9].setRotationPoint(-127F, -13F, 62F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		rightWingWheelModel[10].setRotationPoint(-127F, -17F, 62F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		rightWingWheelModel[11].setRotationPoint(-131F, -13F, 62F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 4, 13, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		rightWingWheelModel[12].setRotationPoint(-114F, -13F, 62F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		rightWingWheelModel[13].setRotationPoint(-127F, 0F, 62F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,-1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		rightWingWheelModel[14].setRotationPoint(-131F, -17F, 62F);

		rightWingWheelModel[15].addShapeBox(0F, 0F, 0F, 13, 1, 7, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		rightWingWheelModel[15].setRotationPoint(-127F, -18F, 62F);

		rightWingWheelModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		rightWingWheelModel[16].setRotationPoint(-114F, -17F, 62F);

		rightWingWheelModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 501
		rightWingWheelModel[17].setRotationPoint(-114F, 0F, 62F);

		rightWingWheelModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F); // Box 502
		rightWingWheelModel[18].setRotationPoint(-131F, 0F, 62F);

		rightWingWheelModel[19].addShapeBox(0F, 0F, 0F, 13, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 503
		rightWingWheelModel[19].setRotationPoint(-127F, 4F, 62F);

		rightWingWheelModel[20].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 504
		rightWingWheelModel[20].setRotationPoint(-132F, -13F, 62F);

		rightWingWheelModel[21].addShapeBox(0F, 0F, 0F, 1, 13, 7, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 505
		rightWingWheelModel[21].setRotationPoint(-110F, -13F, 62F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1449, 17, textureX, textureY); // Box 17
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 19
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 20
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 737, 249, textureX, textureY); // Box 455
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 456
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 737, 257, textureX, textureY); // Box 457

		bodyDoorOpenModel[0].addShapeBox(0F, 5F, -10F, 155, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyDoorOpenModel[0].setRotationPoint(-149F, -32F, 14F);
		bodyDoorOpenModel[0].rotateAngleX = 1.30899694F;

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 155, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyDoorOpenModel[1].setRotationPoint(-149F, -32F, 14F);
		bodyDoorOpenModel[1].rotateAngleX = 1.30899694F;

		bodyDoorOpenModel[2].addShapeBox(0F, 3F, -4F, 155, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyDoorOpenModel[2].setRotationPoint(-149F, -32F, 14F);
		bodyDoorOpenModel[2].rotateAngleX = 1.30899694F;

		bodyDoorOpenModel[3].addShapeBox(0F, 5F, 5F, 155, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyDoorOpenModel[3].setRotationPoint(-149F, -33F, -14F);
		bodyDoorOpenModel[3].rotateAngleX = -1.30899694F;

		bodyDoorOpenModel[4].addShapeBox(0F, 0F, 0F, 155, 4, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 456
		bodyDoorOpenModel[4].setRotationPoint(-149F, -33F, -14F);
		bodyDoorOpenModel[4].rotateAngleX = -1.30899694F;

		bodyDoorOpenModel[5].addShapeBox(0F, 3F, 0F, 155, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 457
		bodyDoorOpenModel[5].setRotationPoint(-149F, -33F, -14F);
		bodyDoorOpenModel[5].rotateAngleX = -1.30899694F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1193, 1, textureX, textureY); // Box 6
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 9
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 721, 9, textureX, textureY); // Box 10
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 737, 233, textureX, textureY); // Box 446
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 447
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 737, 241, textureX, textureY); // Box 448

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 155, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyDoorCloseModel[0].setRotationPoint(-149F, -31F, -6F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 155, 4, 1, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 9
		bodyDoorCloseModel[1].setRotationPoint(-149F, -36F, -11F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 155, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 10
		bodyDoorCloseModel[2].setRotationPoint(-149F, -33F, -11F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 155, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyDoorCloseModel[3].setRotationPoint(-149F, -31F, 0F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 155, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyDoorCloseModel[4].setRotationPoint(-149F, -36F, 10F);

		bodyDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 155, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyDoorCloseModel[5].setRotationPoint(-149F, -33F, 6F);
	}

	private void inittailDoorCloseModel_1()
	{
		tailDoorCloseModel[0] = new ModelRendererTurbo(this, 1689, 233, textureX, textureY); // Box 581
		tailDoorCloseModel[1] = new ModelRendererTurbo(this, 1825, 217, textureX, textureY); // Box 583
		tailDoorCloseModel[2] = new ModelRendererTurbo(this, 1265, 193, textureX, textureY); // Box 584
		tailDoorCloseModel[3] = new ModelRendererTurbo(this, 2025, 225, textureX, textureY); // Box 585
		tailDoorCloseModel[4] = new ModelRendererTurbo(this, 905, 145, textureX, textureY); // Box 586
		tailDoorCloseModel[5] = new ModelRendererTurbo(this, 1913, 233, textureX, textureY); // Box 587
		tailDoorCloseModel[6] = new ModelRendererTurbo(this, 1961, 233, textureX, textureY); // Box 588
		tailDoorCloseModel[7] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 589
		tailDoorCloseModel[8] = new ModelRendererTurbo(this, 1545, 233, textureX, textureY); // Box 590
		tailDoorCloseModel[9] = new ModelRendererTurbo(this, 1081, 145, textureX, textureY); // Box 591

		tailDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		tailDoorCloseModel[0].setRotationPoint(166F, -66F, -12F);

		tailDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		tailDoorCloseModel[1].setRotationPoint(166F, -69F, -12F);

		tailDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		tailDoorCloseModel[2].setRotationPoint(166F, -71F, -11F);

		tailDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 585
		tailDoorCloseModel[3].setRotationPoint(166F, -73F, -8F);

		tailDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		tailDoorCloseModel[4].setRotationPoint(166F, -74F, -3F);

		tailDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		tailDoorCloseModel[5].setRotationPoint(166F, -66F, 0F);

		tailDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		tailDoorCloseModel[6].setRotationPoint(166F, -69F, 0F);

		tailDoorCloseModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		tailDoorCloseModel[7].setRotationPoint(166F, -71F, 0F);

		tailDoorCloseModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 590
		tailDoorCloseModel[8].setRotationPoint(166F, -73F, 0F);

		tailDoorCloseModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 591
		tailDoorCloseModel[9].setRotationPoint(166F, -74F, 0F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[4][3];
		propellerModels[0] = makeProp1(-126F, -58.5F, -140.5F);
		propellerModels[1] = makeProp2(-134F, -55.5F, -65.5F);
		propellerModels[2] = makeProp3(-134F, -55.5F, 65.5F);
		propellerModels[3] = makeProp4(-126F, -58.5F, 140.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[1].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[2].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[1].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[2].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp3(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[1].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[2].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp4(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 550, 60, textureX, textureY);
		prop[0].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[1].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
		prop[2].addBox(-0.5F, -30F, -1.5F, 1, 30, 3, 0.0F);
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

		gun_2_Model[0] = new ModelRendererTurbo[64];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 0
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 3
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 4
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 7
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 8
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 13
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 14
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 15
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 16
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 17
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 18
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 19
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 20
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 21
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 22
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 23
		gun_2_Model[0][16] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 24
		gun_2_Model[0][17] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 30
		gun_2_Model[0][18] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 31
		gun_2_Model[0][19] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 32
		gun_2_Model[0][20] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 33
		gun_2_Model[0][21] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 34
		gun_2_Model[0][22] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 35
		gun_2_Model[0][23] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 36
		gun_2_Model[0][24] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 37
		gun_2_Model[0][25] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 39
		gun_2_Model[0][26] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 46
		gun_2_Model[0][27] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 39
		gun_2_Model[0][28] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 40
		gun_2_Model[0][29] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 41
		gun_2_Model[0][30] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 42
		gun_2_Model[0][31] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 43
		gun_2_Model[0][32] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 44
		gun_2_Model[0][33] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 45
		gun_2_Model[0][34] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 46
		gun_2_Model[0][35] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 47
		gun_2_Model[0][36] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 48
		gun_2_Model[0][37] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 49
		gun_2_Model[0][38] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 50
		gun_2_Model[0][39] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 51
		gun_2_Model[0][40] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 52
		gun_2_Model[0][41] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 53
		gun_2_Model[0][42] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 54
		gun_2_Model[0][43] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 56
		gun_2_Model[0][44] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 57
		gun_2_Model[0][45] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 58
		gun_2_Model[0][46] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 59
		gun_2_Model[0][47] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 60
		gun_2_Model[0][48] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 61
		gun_2_Model[0][49] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 62
		gun_2_Model[0][50] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 63
		gun_2_Model[0][51] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 64
		gun_2_Model[0][52] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 65
		gun_2_Model[0][53] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 66
		gun_2_Model[0][54] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 67
		gun_2_Model[0][55] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 68
		gun_2_Model[0][56] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 69
		gun_2_Model[0][57] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 70
		gun_2_Model[0][58] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 71
		gun_2_Model[0][59] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 72
		gun_2_Model[0][60] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 73
		gun_2_Model[0][61] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 74
		gun_2_Model[0][62] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 75
		gun_2_Model[0][63] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 76

		gun_2_Model[0][0].addShapeBox(-5F, 0F, -5F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_2_Model[0][1].addShapeBox(9F, -6F, -2F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_2_Model[0][2].addShapeBox(9F, -6F, 1F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4

		gun_2_Model[0][3].addShapeBox(8F, -6F, 3F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7

		gun_2_Model[0][4].addShapeBox(8F, -6F, -4F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_2_Model[0][5].addShapeBox(5F, 0F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_2_Model[0][6].addShapeBox(-5F, 0F, -9F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14

		gun_2_Model[0][7].addShapeBox(-9F, 0F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_2_Model[0][8].addShapeBox(-5F, 0F, 5F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_2_Model[0][9].addShapeBox(-9F, 0F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F); // Box 17

		gun_2_Model[0][10].addShapeBox(-9F, 0F, -9F, 4, 1, 4, 0F,-1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18

		gun_2_Model[0][11].addShapeBox(5F, 0F, -9F, 4, 1, 4, 0F,0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19

		gun_2_Model[0][12].addShapeBox(5F, 0F, 5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, 0F); // Box 20

		gun_2_Model[0][13].addShapeBox(-5F, 0F, -10F, 10, 1, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		gun_2_Model[0][14].addShapeBox(-5F, 0F, 9F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 22

		gun_2_Model[0][15].addShapeBox(-10F, 0F, -5F, 1, 1, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23

		gun_2_Model[0][16].addShapeBox(9F, 0F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_2_Model[0][17].addShapeBox(9F, -9F, -2F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30

		gun_2_Model[0][18].addShapeBox(8F, -11F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31

		gun_2_Model[0][19].addShapeBox(7F, -11F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32

		gun_2_Model[0][20].addShapeBox(8F, -9F, -4F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33

		gun_2_Model[0][21].addShapeBox(9F, -9F, 1F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34

		gun_2_Model[0][22].addShapeBox(8F, -11F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35

		gun_2_Model[0][23].addShapeBox(7F, -11F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36

		gun_2_Model[0][24].addShapeBox(8F, -9F, 3F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37

		gun_2_Model[0][25].addShapeBox(6F, -11F, -4F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39

		gun_2_Model[0][26].addShapeBox(6F, -11F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 46

		gun_2_Model[0][27].addShapeBox(8F, -6F, 4F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 39

		gun_2_Model[0][28].addShapeBox(7F, -6F, 7F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F); // Box 40

		gun_2_Model[0][29].addShapeBox(2F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 41

		gun_2_Model[0][30].addShapeBox(-2F, -6F, 9F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_2_Model[0][31].addShapeBox(-8F, -6F, 9F, 6, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 43

		gun_2_Model[0][32].addShapeBox(8F, -6F, -7F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44

		gun_2_Model[0][33].addShapeBox(7F, -6F, -9F, 1, 1, 2, 0F,2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45

		gun_2_Model[0][34].addShapeBox(2F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 46

		gun_2_Model[0][35].addShapeBox(-2F, -6F, -10F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47

		gun_2_Model[0][36].addShapeBox(-8F, -6F, -10F, 6, 1, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 48

		gun_2_Model[0][37].addShapeBox(5F, -13F, -4F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49

		gun_2_Model[0][38].addShapeBox(3F, -15F, -4F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50

		gun_2_Model[0][39].addShapeBox(4F, -15F, -2F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51

		gun_2_Model[0][40].addShapeBox(6F, -13F, -2F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_2_Model[0][41].addShapeBox(5F, -13F, 3F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53

		gun_2_Model[0][42].addShapeBox(3F, -15F, 3F, 1, 2, 1, 0F,2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54

		gun_2_Model[0][43].addShapeBox(6F, -13F, 1F, 1, 2, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56

		gun_2_Model[0][44].addShapeBox(4F, -15F, 1F, 1, 2, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_2_Model[0][45].addShapeBox(0F, -5F, 9F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58

		gun_2_Model[0][46].addShapeBox(0F, -10F, 8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 59

		gun_2_Model[0][47].addShapeBox(0F, -13F, 6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 60

		gun_2_Model[0][48].addShapeBox(0F, -15F, 4F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 61

		gun_2_Model[0][49].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62

		gun_2_Model[0][50].addShapeBox(0F, -5F, -10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63

		gun_2_Model[0][51].addShapeBox(0F, -10F, -9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 64

		gun_2_Model[0][52].addShapeBox(0F, -13F, -7F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 65

		gun_2_Model[0][53].addShapeBox(0F, -15F, -5F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 66

		gun_2_Model[0][54].addShapeBox(0F, -15F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67

		gun_2_Model[0][55].addShapeBox(-4F, -6F, -9F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68

		gun_2_Model[0][56].addShapeBox(-4F, -10F, -8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 69

		gun_2_Model[0][57].addShapeBox(-4F, -13F, -6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 70

		gun_2_Model[0][58].addShapeBox(-4F, -15F, -4F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 71

		gun_2_Model[0][59].addShapeBox(-4F, -15F, -3F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 72

		gun_2_Model[0][60].addShapeBox(-4F, -6F, 8F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73

		gun_2_Model[0][61].addShapeBox(-4F, -10F, 7F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 74

		gun_2_Model[0][62].addShapeBox(-4F, -13F, 5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 75

		gun_2_Model[0][63].addShapeBox(-4F, -15F, 3F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-178F, -60F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[6];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 5
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 25
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 26
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 27
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 28
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 29

		gun_2_Model[1][0].addShapeBox(8F, -6F, -3F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 5

		gun_2_Model[1][1].addShapeBox(8F, -6F, -3.25F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25

		gun_2_Model[1][2].addShapeBox(8F, -6F, -2.75F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 26

		gun_2_Model[1][3].addShapeBox(8F, -6F, 2F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27

		gun_2_Model[1][4].addShapeBox(8F, -6F, 2.25F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 28

		gun_2_Model[1][5].addShapeBox(8F, -6F, 1.75F, 10, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-178F, -60F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[6];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 40
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 41
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 42
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 43
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 44
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 145, 7, textureX, textureY); // Box 45

		gun_2_Model[2][0].addShapeBox(3F, -6F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 40

		gun_2_Model[2][1].addShapeBox(3F, -6.5F, -3F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41

		gun_2_Model[2][2].addShapeBox(5F, -5.5F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42

		gun_2_Model[2][3].addShapeBox(3F, -6F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 43

		gun_2_Model[2][4].addShapeBox(3F, -6.5F, 2F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44

		gun_2_Model[2][5].addShapeBox(5F, -5.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(-178F, -60F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[54];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 0
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 13
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 24
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 76
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 80
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 82
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 84
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 86
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 87
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 88
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 89
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 99
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 100
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 101
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 102
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 103
		gun_3_Model[0][16] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 104
		gun_3_Model[0][17] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 105
		gun_3_Model[0][18] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 106
		gun_3_Model[0][19] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 107
		gun_3_Model[0][20] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 108
		gun_3_Model[0][21] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 109
		gun_3_Model[0][22] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 110
		gun_3_Model[0][23] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 111
		gun_3_Model[0][24] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 112
		gun_3_Model[0][25] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 116
		gun_3_Model[0][26] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 117
		gun_3_Model[0][27] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 118
		gun_3_Model[0][28] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 119
		gun_3_Model[0][29] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 120
		gun_3_Model[0][30] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 121
		gun_3_Model[0][31] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 122
		gun_3_Model[0][32] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 123
		gun_3_Model[0][33] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 124
		gun_3_Model[0][34] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 125
		gun_3_Model[0][35] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 126
		gun_3_Model[0][36] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 127
		gun_3_Model[0][37] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 128
		gun_3_Model[0][38] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 129
		gun_3_Model[0][39] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 130
		gun_3_Model[0][40] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 131
		gun_3_Model[0][41] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 132
		gun_3_Model[0][42] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 133
		gun_3_Model[0][43] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 134
		gun_3_Model[0][44] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 135
		gun_3_Model[0][45] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 136
		gun_3_Model[0][46] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 137
		gun_3_Model[0][47] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 138
		gun_3_Model[0][48] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 139
		gun_3_Model[0][49] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 140
		gun_3_Model[0][50] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 141
		gun_3_Model[0][51] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 142
		gun_3_Model[0][52] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 143
		gun_3_Model[0][53] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 144

		gun_3_Model[0][0].addShapeBox(-8F, 0F, -6F, 14, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_3_Model[0][1].addShapeBox(6F, 0F, -6F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13

		gun_3_Model[0][2].addShapeBox(10F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 24

		gun_3_Model[0][3].addShapeBox(-8F, 0F, -10F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76

		gun_3_Model[0][4].addShapeBox(-8F, 0F, 6F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80

		gun_3_Model[0][5].addShapeBox(6F, 0F, -10F, 4, 1, 4, 0F,0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82

		gun_3_Model[0][6].addShapeBox(6F, 0F, 6F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -1.75F, 0F, 0F, 0F); // Box 84

		gun_3_Model[0][7].addShapeBox(5F, -11F, -10F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_3_Model[0][8].addShapeBox(5F, -11F, 9F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87

		gun_3_Model[0][9].addShapeBox(9F, -11F, 4F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88

		gun_3_Model[0][10].addShapeBox(9F, -11F, -5F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_3_Model[0][11].addShapeBox(1F, -6F, 5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 99

		gun_3_Model[0][12].addShapeBox(4F, -2F, 5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 100

		gun_3_Model[0][13].addShapeBox(1F, -6F, -9F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 101

		gun_3_Model[0][14].addShapeBox(4F, -2F, -9F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -1F, 0F, 0F); // Box 102

		gun_3_Model[0][15].addShapeBox(-1F, -9F, 4F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103

		gun_3_Model[0][16].addShapeBox(-1F, -9F, -5F, 10, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104

		gun_3_Model[0][17].addShapeBox(5F, -3F, -9F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 105

		gun_3_Model[0][18].addShapeBox(5F, -3F, -6F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 106

		gun_3_Model[0][19].addShapeBox(5F, -3F, 8F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 107

		gun_3_Model[0][20].addShapeBox(5F, -3F, 5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 108

		gun_3_Model[0][21].addShapeBox(-4F, -15F, 9F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109

		gun_3_Model[0][22].addShapeBox(-8F, -15F, 9F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110

		gun_3_Model[0][23].addShapeBox(-4F, -15F, -10F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111

		gun_3_Model[0][24].addShapeBox(-8F, -15F, -10F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112

		gun_3_Model[0][25].addShapeBox(8F, -14F, 4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 116

		gun_3_Model[0][26].addShapeBox(6F, -17F, 4F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 117

		gun_3_Model[0][27].addShapeBox(3F, -18F, 4F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 118

		gun_3_Model[0][28].addShapeBox(-3F, -19F, 4F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 119

		gun_3_Model[0][29].addShapeBox(-8F, -19F, 4F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120

		gun_3_Model[0][30].addShapeBox(8F, -14F, -5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 121

		gun_3_Model[0][31].addShapeBox(6F, -17F, -5F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 122

		gun_3_Model[0][32].addShapeBox(3F, -18F, -5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 123

		gun_3_Model[0][33].addShapeBox(-3F, -19F, -5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 124

		gun_3_Model[0][34].addShapeBox(-8F, -19F, -5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125

		gun_3_Model[0][35].addShapeBox(2F, -15F, -10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 126

		gun_3_Model[0][36].addShapeBox(-3F, -15F, -10F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127

		gun_3_Model[0][37].addShapeBox(3F, -14F, -10F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 128

		gun_3_Model[0][38].addShapeBox(-7F, -6F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129

		gun_3_Model[0][39].addShapeBox(-7F, -6F, 9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130

		gun_3_Model[0][40].addShapeBox(2F, -15F, 9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 131

		gun_3_Model[0][41].addShapeBox(-3F, -15F, 9F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132

		gun_3_Model[0][42].addShapeBox(3F, -14F, 9F, 1, 3, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 133

		gun_3_Model[0][43].addShapeBox(-8F, -17F, 9F, 5, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134

		gun_3_Model[0][44].addShapeBox(-7F, -15F, 9F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135

		gun_3_Model[0][45].addShapeBox(-8F, -19F, 8F, 5, 2, 1, 0F,0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136

		gun_3_Model[0][46].addShapeBox(-8F, -19F, 5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137

		gun_3_Model[0][47].addShapeBox(-8F, -19F, -7F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138

		gun_3_Model[0][48].addShapeBox(-8F, -17F, -10F, 5, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139

		gun_3_Model[0][49].addShapeBox(-7F, -15F, -10F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140

		gun_3_Model[0][50].addShapeBox(-8F, -19F, -9F, 5, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141

		gun_3_Model[0][51].addShapeBox(-8F, -19F, -4F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142

		gun_3_Model[0][52].addShapeBox(9F, -11F, -4F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143

		gun_3_Model[0][53].addShapeBox(8F, -11F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(183F, -55F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 96
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 113

		gun_3_Model[1][0].addShapeBox(6F, -9F, 6F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96

		gun_3_Model[1][1].addShapeBox(6F, -9F, -7F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(183F, -55F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[8];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 90
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 91
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 92
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 93
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 94
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 95
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 97
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 77, 0, textureX, textureY); // Box 98

		gun_3_Model[2][0].addShapeBox(2F, -11F, -8F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90

		gun_3_Model[2][1].addShapeBox(5F, -11F, -8F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 91

		gun_3_Model[2][2].addShapeBox(1F, -11F, -8F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92

		gun_3_Model[2][3].addShapeBox(2F, -11F, 5F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_3_Model[2][4].addShapeBox(5F, -11F, 5F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94

		gun_3_Model[2][5].addShapeBox(1F, -11F, 5F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 95

		gun_3_Model[2][6].addShapeBox(2F, -10F, 8F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97

		gun_3_Model[2][7].addShapeBox(2F, -10F, -9F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(183F, -55F, 0F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[61];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 0
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 1
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 2
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 3
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 4
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 5
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 6
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 7
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 8
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 9
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 10
		gun_4_Model[0][11] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 11
		gun_4_Model[0][12] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 12
		gun_4_Model[0][13] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 13
		gun_4_Model[0][14] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 14
		gun_4_Model[0][15] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 15
		gun_4_Model[0][16] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 16
		gun_4_Model[0][17] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 17
		gun_4_Model[0][18] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 18
		gun_4_Model[0][19] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 19
		gun_4_Model[0][20] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 20
		gun_4_Model[0][21] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 21
		gun_4_Model[0][22] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 22
		gun_4_Model[0][23] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 23
		gun_4_Model[0][24] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 24
		gun_4_Model[0][25] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 25
		gun_4_Model[0][26] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 26
		gun_4_Model[0][27] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 27
		gun_4_Model[0][28] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 28
		gun_4_Model[0][29] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 29
		gun_4_Model[0][30] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 30
		gun_4_Model[0][31] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 31
		gun_4_Model[0][32] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 32
		gun_4_Model[0][33] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 34
		gun_4_Model[0][34] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 35
		gun_4_Model[0][35] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 36
		gun_4_Model[0][36] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 37
		gun_4_Model[0][37] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 38
		gun_4_Model[0][38] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 39
		gun_4_Model[0][39] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 40
		gun_4_Model[0][40] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 41
		gun_4_Model[0][41] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 42
		gun_4_Model[0][42] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 43
		gun_4_Model[0][43] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 44
		gun_4_Model[0][44] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 45
		gun_4_Model[0][45] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 52
		gun_4_Model[0][46] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 53
		gun_4_Model[0][47] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 54
		gun_4_Model[0][48] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 55
		gun_4_Model[0][49] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 56
		gun_4_Model[0][50] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 57
		gun_4_Model[0][51] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 58
		gun_4_Model[0][52] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 59
		gun_4_Model[0][53] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 60
		gun_4_Model[0][54] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 61
		gun_4_Model[0][55] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 62
		gun_4_Model[0][56] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 63
		gun_4_Model[0][57] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 64
		gun_4_Model[0][58] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 65
		gun_4_Model[0][59] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 66
		gun_4_Model[0][60] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 67

		gun_4_Model[0][0].addShapeBox(-8F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0

		gun_4_Model[0][1].addShapeBox(7F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1

		gun_4_Model[0][2].addShapeBox(-2F, 0F, -8F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2

		gun_4_Model[0][3].addShapeBox(-2F, 0F, 7F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3

		gun_4_Model[0][4].addShapeBox(-5F, 0F, -7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4

		gun_4_Model[0][5].addShapeBox(-7F, 0F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 5

		gun_4_Model[0][6].addShapeBox(-6F, 0F, -7F, 1, 1, 1, 0F,1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 6

		gun_4_Model[0][7].addShapeBox(-7F, 0F, 5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F); // Box 7

		gun_4_Model[0][8].addShapeBox(-7F, 0F, 2F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8

		gun_4_Model[0][9].addShapeBox(-5F, 0F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 9

		gun_4_Model[0][10].addShapeBox(6F, 0F, -6F, 1, 1, 1, 0F,1F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10

		gun_4_Model[0][11].addShapeBox(6F, 0F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 11

		gun_4_Model[0][12].addShapeBox(2F, 0F, -7F, 3, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 12

		gun_4_Model[0][13].addShapeBox(5F, 0F, 6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 13

		gun_4_Model[0][14].addShapeBox(2F, 0F, 6F, 3, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 14

		gun_4_Model[0][15].addShapeBox(6F, 0F, 2F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15

		gun_4_Model[0][16].addShapeBox(7F, -4F, 1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16

		gun_4_Model[0][17].addShapeBox(7F, -4F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17

		gun_4_Model[0][18].addShapeBox(6F, -7F, -2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 18

		gun_4_Model[0][19].addShapeBox(5F, -9F, -2F, 1, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 19

		gun_4_Model[0][20].addShapeBox(2F, -10F, -2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 20

		gun_4_Model[0][21].addShapeBox(-2F, -10F, -2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		gun_4_Model[0][22].addShapeBox(6F, -7F, 1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 22

		gun_4_Model[0][23].addShapeBox(5F, -9F, 1F, 1, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 23

		gun_4_Model[0][24].addShapeBox(2F, -10F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 24

		gun_4_Model[0][25].addShapeBox(-2F, -10F, 1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_4_Model[0][26].addShapeBox(-2F, -10F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26

		gun_4_Model[0][27].addShapeBox(-5F, -10F, -3F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 27

		gun_4_Model[0][28].addShapeBox(-5F, -10F, 2F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 28

		gun_4_Model[0][29].addShapeBox(-6F, -9F, 2F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 29

		gun_4_Model[0][30].addShapeBox(-7F, -7F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 30

		gun_4_Model[0][31].addShapeBox(-6F, -9F, -3F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 31

		gun_4_Model[0][32].addShapeBox(-7F, -7F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 32

		gun_4_Model[0][33].addShapeBox(-8F, -4F, 2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 34

		gun_4_Model[0][34].addShapeBox(-2F, -10F, 3F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 35

		gun_4_Model[0][35].addShapeBox(-2F, -9F, 5F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 36

		gun_4_Model[0][36].addShapeBox(-2F, -7F, 6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 37

		gun_4_Model[0][37].addShapeBox(-2F, -4F, 7F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38

		gun_4_Model[0][38].addShapeBox(-2F, -10F, -5F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39

		gun_4_Model[0][39].addShapeBox(-2F, -9F, -6F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 40

		gun_4_Model[0][40].addShapeBox(-2F, -7F, -7F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 41

		gun_4_Model[0][41].addShapeBox(-2F, -4F, -8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42

		gun_4_Model[0][42].addShapeBox(-2F, -10F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43

		gun_4_Model[0][43].addShapeBox(-2F, -10F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44

		gun_4_Model[0][44].addShapeBox(-8F, -4F, -3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45

		gun_4_Model[0][45].addShapeBox(-2F, -3F, -8F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52

		gun_4_Model[0][46].addShapeBox(-5F, -3F, -7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 53

		gun_4_Model[0][47].addShapeBox(-6F, -3F, -7F, 1, 1, 1, 0F,1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 54

		gun_4_Model[0][48].addShapeBox(-7F, -3F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 55

		gun_4_Model[0][49].addShapeBox(-8F, -3F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56

		gun_4_Model[0][50].addShapeBox(-7F, -3F, 2F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57

		gun_4_Model[0][51].addShapeBox(-7F, -3F, 5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F); // Box 58

		gun_4_Model[0][52].addShapeBox(-5F, -3F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 59

		gun_4_Model[0][53].addShapeBox(-2F, -3F, 7F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60

		gun_4_Model[0][54].addShapeBox(2F, -3F, 6F, 3, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 61

		gun_4_Model[0][55].addShapeBox(5F, -3F, 6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 62

		gun_4_Model[0][56].addShapeBox(6F, -3F, 2F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63

		gun_4_Model[0][57].addShapeBox(7F, -3F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64

		gun_4_Model[0][58].addShapeBox(6F, -3F, -5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 65

		gun_4_Model[0][59].addShapeBox(6F, -3F, -6F, 1, 1, 1, 0F,1F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66

		gun_4_Model[0][60].addShapeBox(2F, -3F, -7F, 3, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 67

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(57F, -79F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[8];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 46
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 47
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 48
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 49
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 50
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 51
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 68
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 1004, 88, textureX, textureY); // Box 69

		gun_4_Model[1][0].addShapeBox(5F, -4F, -3F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 46

		gun_4_Model[1][1].addShapeBox(5F, -4F, -3.5F, 11, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 47

		gun_4_Model[1][2].addShapeBox(5F, -4F, -2.5F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 48

		gun_4_Model[1][3].addShapeBox(5F, -4F, 2F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 49

		gun_4_Model[1][4].addShapeBox(5F, -4F, 2.5F, 11, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 50

		gun_4_Model[1][5].addShapeBox(5F, -4F, 1.5F, 11, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 51

		gun_4_Model[1][6].addShapeBox(3F, -4F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68

		gun_4_Model[1][7].addShapeBox(3F, -4F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(57F, -79F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);
	}
}