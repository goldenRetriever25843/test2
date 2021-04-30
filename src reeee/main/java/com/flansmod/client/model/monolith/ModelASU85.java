//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.06.2016 - 00:37:21
// Last changed on: 29.06.2016 - 00:37:21

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelASU85 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelASU85() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[117];
		barrelModel = new ModelRendererTurbo[34];
		leftTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackModel = new ModelRendererTurbo[23];
		rightTrackModel = new ModelRendererTurbo[23];

		initbodyModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 9
		bodyModel[2] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 10
		bodyModel[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 251
		bodyModel[12] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 254
		bodyModel[13] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Box 266
		bodyModel[14] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 129
		bodyModel[16] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 130
		bodyModel[17] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 131
		bodyModel[18] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 132
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 133
		bodyModel[20] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 134
		bodyModel[21] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 135
		bodyModel[22] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 136
		bodyModel[23] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 137
		bodyModel[24] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 138
		bodyModel[25] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 139
		bodyModel[26] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 140
		bodyModel[27] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 141
		bodyModel[28] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 142
		bodyModel[29] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Box 143
		bodyModel[30] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 144
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 145
		bodyModel[32] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 146
		bodyModel[33] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 147
		bodyModel[34] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 148
		bodyModel[35] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 149
		bodyModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 150
		bodyModel[37] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 151
		bodyModel[38] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 152
		bodyModel[39] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 153
		bodyModel[40] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 154
		bodyModel[41] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 155
		bodyModel[42] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 156
		bodyModel[43] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 157
		bodyModel[44] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 158
		bodyModel[45] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 159
		bodyModel[46] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 160
		bodyModel[47] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 161
		bodyModel[48] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 162
		bodyModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 163
		bodyModel[50] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 164
		bodyModel[51] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 165
		bodyModel[52] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 166
		bodyModel[53] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 167
		bodyModel[54] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 168
		bodyModel[55] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 169
		bodyModel[56] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 170
		bodyModel[57] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 171
		bodyModel[58] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 172
		bodyModel[59] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 173
		bodyModel[60] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 174
		bodyModel[61] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 175
		bodyModel[62] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 176
		bodyModel[63] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 177
		bodyModel[64] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 178
		bodyModel[65] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 179
		bodyModel[66] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 180
		bodyModel[67] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 181
		bodyModel[68] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 182
		bodyModel[69] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 183
		bodyModel[70] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 184
		bodyModel[71] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 185
		bodyModel[72] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 186
		bodyModel[73] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 187
		bodyModel[74] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 188
		bodyModel[75] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 189
		bodyModel[76] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 190
		bodyModel[77] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 191
		bodyModel[78] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 192
		bodyModel[79] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 193
		bodyModel[80] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 194
		bodyModel[81] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Box 195
		bodyModel[82] = new ModelRendererTurbo(this, 73, 305, textureX, textureY); // Box 196
		bodyModel[83] = new ModelRendererTurbo(this, 73, 313, textureX, textureY); // Box 197
		bodyModel[84] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 198
		bodyModel[85] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 199
		bodyModel[86] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 200
		bodyModel[87] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 201
		bodyModel[88] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 129
		bodyModel[89] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 130
		bodyModel[90] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 131
		bodyModel[91] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 132
		bodyModel[92] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 133
		bodyModel[93] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 134
		bodyModel[94] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 135
		bodyModel[95] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 136
		bodyModel[96] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 210
		bodyModel[97] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 211
		bodyModel[98] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 212
		bodyModel[99] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 213
		bodyModel[100] = new ModelRendererTurbo(this, 289, 313, textureX, textureY); // Box 214
		bodyModel[101] = new ModelRendererTurbo(this, 361, 313, textureX, textureY); // Box 215
		bodyModel[102] = new ModelRendererTurbo(this, 481, 313, textureX, textureY); // Box 216
		bodyModel[103] = new ModelRendererTurbo(this, 73, 321, textureX, textureY); // Box 217
		bodyModel[104] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Box 218
		bodyModel[105] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 219
		bodyModel[106] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 220
		bodyModel[107] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); // Box 221
		bodyModel[108] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Box 256
		bodyModel[109] = new ModelRendererTurbo(this, 249, 337, textureX, textureY); // Box 257
		bodyModel[110] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 258
		bodyModel[111] = new ModelRendererTurbo(this, 193, 345, textureX, textureY); // Box 259
		bodyModel[112] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 260
		bodyModel[113] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 261
		bodyModel[114] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 262
		bodyModel[115] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 263
		bodyModel[116] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 249

		bodyModel[0].addShapeBox(0F, 0F, 0F, 78, 16, 54, 0F,0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -3.5F); // Box 8
		bodyModel[0].setRotationPoint(-75F, -15F, -30F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 7, 54, 0F,0F, -1F, -3.5F, 5.5F, -1F, -4.1F, 5.5F, -1F, -4.1F, 0F, -1F, -3.5F, 0F, 0.5F, -3.5F, -0.5F, 0.5F, -4F, -0.5F, 0.5F, -4F, 0F, 0.5F, -3.5F); // Box 9
		bodyModel[1].setRotationPoint(8F, -6F, -30F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 15, 54, 0F,3F, -1F, -4F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 3F, -1F, -4F, 0F, -2.3F, -4F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, -2.3F, -4F); // Box 10
		bodyModel[2].setRotationPoint(-89F, -15F, -30F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 127, 1, 10, 0F,0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[3].setRotationPoint(-94F, -14.45F, -36F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 127, 1, 10, 0F,0F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[4].setRotationPoint(-94F, -14.45F, 20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1.4F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, -1.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 13
		bodyModel[5].setRotationPoint(-95F, -14.8F, -36F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 14
		bodyModel[6].setRotationPoint(-95F, -14.2F, -35.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 15
		bodyModel[7].setRotationPoint(-95F, -14.2F, 20.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1.4F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.6F, -0.2F, 0F, -1.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 16
		bodyModel[8].setRotationPoint(-95F, -14.8F, 20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F); // Box 17
		bodyModel[9].setRotationPoint(32.6F, -13.2F, -36F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 18
		bodyModel[10].setRotationPoint(32.6F, -13.2F, 21F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 4, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0.2F, 3.2F, 19F, 0.2F, 3.2F, 19F, 0.2F, 3.8F, 2F, 0.2F, 3.8F); // Box 251
		bodyModel[11].setRotationPoint(-53F, -32.6F, -21.3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 64, 15, 59, 0F,0F, -0.6F, -8F, 4.8F, -0.6F, -8F, 4.8F, -0.6F, -8F, 0F, -0.6F, -8F, -10F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 3F, -10F, 0F, 3F); // Box 254
		bodyModel[12].setRotationPoint(-86F, -29F, -32.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 25, 15, 59, 0F,0.2F, -0.6F, -8F, -25F, -0.6F, -8F, -25F, -0.6F, -8F, 0.2F, -0.6F, -8F, 5F, 0F, 0F, 1F, 1.2F, -6.5F, 1F, 1.2F, -6.5F, 5F, 0F, 3F); // Box 266
		bodyModel[13].setRotationPoint(-17F, -29F, -32.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 15, 54, 0F,0F, -1F, -3.5F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -1F, -3.5F, 0F, 0.3F, -3.5F, 0F, 0.3F, -4F, 0F, 0.3F, -4F, 0F, 0.3F, -3.5F); // Box 128
		bodyModel[14].setRotationPoint(3F, -13.8F, -30F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 14, 8, 54, 0F,0.5F, -1F, -4F, -0.1F, -9F, -4F, 0F, -9F, -4F, 0.5F, -1F, -4F, 0.5F, 0.8F, -4F, 0F, 0.8F, -4F, 0F, 0.8F, -4F, 0.5F, 0.8F, -4F); // Box 129
		bodyModel[15].setRotationPoint(9.5F, -13.8F, -30F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 15, 54, 0F,1.3F, -10F, -3F, 0F, -1.6F, -5.5F, 0F, -1.6F, -5.5F, 1.3F, -10F, -3F, 0F, 1F, 0F, 10F, 1F, 2.5F, 10F, 1F, 5.5F, 0F, 1F, 0F); // Box 130
		bodyModel[16].setRotationPoint(-92F, -30F, -30F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[17].setRotationPoint(-51.5F, -33.2F, -0.3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[18].setRotationPoint(-51.5F, -33.2F, -19.6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[19].setRotationPoint(-52.5F, -33.4F, 2.7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[20].setRotationPoint(-52.5F, -33.4F, 8.7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[21].setRotationPoint(-52.5F, -33.4F, -10.8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[22].setRotationPoint(-52.5F, -33.4F, -16.8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[23].setRotationPoint(-73F, -29.2F, -2.3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 16, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[24].setRotationPoint(-73F, -29.2F, -22.7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[25].setRotationPoint(-73.5F, -29.4F, 1.7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[26].setRotationPoint(-73.5F, -29.4F, 10.7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[27].setRotationPoint(-73.5F, -29.4F, -19.3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[28].setRotationPoint(-73.5F, -29.4F, -10.3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 1, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[29].setRotationPoint(-86F, -29.2F, -10.3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 144
		bodyModel[30].setRotationPoint(-54.5F, -34.2F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[31].setRotationPoint(-52.5F, -34.2F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[32].setRotationPoint(-37.5F, -34.2F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 8, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[33].setRotationPoint(-98F, -28.2F, -14.3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[34].setRotationPoint(-98.2F, -27.8F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[35].setRotationPoint(-98.2F, -27.8F, -4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[36].setRotationPoint(-98.2F, -27.8F, 3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 151
		bodyModel[37].setRotationPoint(-101.2F, -27.2F, -26F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 152
		bodyModel[38].setRotationPoint(-101.2F, -25.2F, -26F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 153
		bodyModel[39].setRotationPoint(-100.7F, -23.2F, -26F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 154
		bodyModel[40].setRotationPoint(-100.7F, -29.2F, -26F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,-2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[41].setRotationPoint(-98.7F, -30.2F, -26F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F); // Box 156
		bodyModel[42].setRotationPoint(-98.7F, -21.2F, -26F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F); // Box 157
		bodyModel[43].setRotationPoint(-98.7F, -21.2F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 158
		bodyModel[44].setRotationPoint(-100.7F, -23.2F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 159
		bodyModel[45].setRotationPoint(-101.2F, -25.2F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 2, 11, 0F,-0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 160
		bodyModel[46].setRotationPoint(-101.2F, -27.2F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 2, 11, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 161
		bodyModel[47].setRotationPoint(-100.7F, -29.2F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,-2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[48].setRotationPoint(-98.7F, -30.2F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[49].setRotationPoint(-97F, -26F, -18F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[50].setRotationPoint(-97F, -26F, -24F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[51].setRotationPoint(-97F, -26F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 11, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[52].setRotationPoint(-97F, -26F, 16F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 11, 5, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[53].setRotationPoint(-96F, -19.5F, -11.3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, 0F, 0F); // Box 168
		bodyModel[54].setRotationPoint(-92F, -11.5F, -19.3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, 0F, 0F); // Box 169
		bodyModel[55].setRotationPoint(-92F, -11.5F, 2.7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 24, 6, 1, 0F,0F, 0F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, 0F, -0.45F, 0F, 2F, -0.45F, 0F, 1F, -0.45F, 0F, 1F, -0.45F, 0F, 2F, -0.45F); // Box 170
		bodyModel[56].setRotationPoint(9F, -13.45F, 19.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 24, 6, 1, 0F,0F, 0F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, 0F, -0.45F, 0F, 2F, -0.45F, 0F, 1F, -0.45F, 0F, 1F, -0.45F, 0F, 2F, -0.45F); // Box 171
		bodyModel[57].setRotationPoint(9F, -13.45F, -26.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[58].setRotationPoint(-46.5F, -27F, 16.7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[59].setRotationPoint(-38.5F, -27F, 16.7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[60].setRotationPoint(-30.5F, -27F, 16.7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[61].setRotationPoint(-54.5F, -27F, 16.7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[62].setRotationPoint(-63.5F, -27F, 16.7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 177
		bodyModel[63].setRotationPoint(-28F, -19.8F, 22.2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 178
		bodyModel[64].setRotationPoint(-53F, -19.8F, 22.2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 179
		bodyModel[65].setRotationPoint(-52F, -19.4F, 25.8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 180
		bodyModel[66].setRotationPoint(-52F, -18.7F, 26.3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 181
		bodyModel[67].setRotationPoint(-52F, -18F, 26.9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 182
		bodyModel[68].setRotationPoint(-52F, -17.3F, 27.4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 183
		bodyModel[69].setRotationPoint(-52F, -16.6F, 28F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 1.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.8F, 0F, 0F, 3.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 3.2F); // Box 184
		bodyModel[70].setRotationPoint(-16.8F, -27.8F, 13.7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[71].setRotationPoint(-26.5F, -32.2F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F); // Box 186
		bodyModel[72].setRotationPoint(-19.5F, -30.7F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 12, 0F,0F, 1.8F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1.8F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F); // Box 187
		bodyModel[73].setRotationPoint(-31.7F, -30.5F, -20.6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[74].setRotationPoint(-22.2F, -30.2F, -18F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 189
		bodyModel[75].setRotationPoint(-22.2F, -31.8F, -17.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-0.1F, 0.2F, -1F, -0.1F, 0.2F, -2F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, -1F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F); // Box 190
		bodyModel[76].setRotationPoint(-9F, -19.2F, -28.4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, -2F, -0.1F, 0.2F, -1F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, -1F, -0.1F, 0.2F, 0F); // Box 191
		bodyModel[77].setRotationPoint(-9F, -19.2F, 19.1F);
		bodyModel[77].rotateAngleY = -0.10471976F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, 5F, 0F, -0.2F, 5F, 0F); // Box 192
		bodyModel[78].setRotationPoint(-70F, -27F, -33.3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, 5F, 0F, -0.2F, 5F, 0F); // Box 193
		bodyModel[79].setRotationPoint(-46.5F, -27F, -33.3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,-0.2F, -3F, 0F, -0.2F, -3F, 0F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, 5F, 0F, -0.2F, 5F, 0F); // Box 194
		bodyModel[80].setRotationPoint(-23F, -27F, -33.3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 57, 1, 3, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 195
		bodyModel[81].setRotationPoint(-74F, -22.7F, -33F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 57, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[82].setRotationPoint(-74F, -23.9F, -33F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 57, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 197
		bodyModel[83].setRotationPoint(-74F, -21.5F, -33F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 7, 9, 0F,-1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[84].setRotationPoint(-10F, -23.5F, -22F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[85].setRotationPoint(-7.5F, -24.8F, -20F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[86].setRotationPoint(-3.5F, -20.8F, -19.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[87].setRotationPoint(-4.3F, -24.5F, -19F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 129
		bodyModel[88].setRotationPoint(-1.3F, -22F, 16.6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 130
		bodyModel[89].setRotationPoint(-1.3F, -23F, 16.6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 131
		bodyModel[90].setRotationPoint(-1.3F, -21F, 16.6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 132
		bodyModel[91].setRotationPoint(-1F, -22F, 17F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[92].setRotationPoint(-1.3F, -21F, -24.8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 134
		bodyModel[93].setRotationPoint(-1.3F, -22F, -24.8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 135
		bodyModel[94].setRotationPoint(-1.3F, -23F, -24.8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 136
		bodyModel[95].setRotationPoint(-1F, -22F, -24.4F);

		bodyModel[96].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 210
		bodyModel[96].setRotationPoint(-17F, -28F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[97].setRotationPoint(-17F, -28F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[98].setRotationPoint(-17F, -28F, 4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -2.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F); // Box 213
		bodyModel[99].setRotationPoint(-11F, -28F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 8, 7, 0F,0F, -2F, -1F, 0F, -2F, -2.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[100].setRotationPoint(-11F, -28F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 8, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[101].setRotationPoint(-11F, -28F, -4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 12, 6, 0F,0F, -2F, -1.5F, 0F, -3F, -2.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 1.9F, 0F, 0F, -1.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[102].setRotationPoint(-5F, -28F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 12, 6, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, -2.5F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.9F); // Box 217
		bodyModel[103].setRotationPoint(-5F, -28F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[104].setRotationPoint(-5F, -27F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 11, 5, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, -3F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -2F, 0F, 0F, -0.5F); // Box 219
		bodyModel[105].setRotationPoint(1F, -27F, 4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 11, 5, 0F,0F, -2F, -1.5F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[106].setRotationPoint(1F, -27F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[107].setRotationPoint(1F, -27F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[108].setRotationPoint(-9.5F, -29.5F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[109].setRotationPoint(-7.5F, -34.5F, -4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 258
		bodyModel[110].setRotationPoint(-7.5F, -36.5F, -3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 259
		bodyModel[111].setRotationPoint(-7.5F, -32.5F, -3.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F); // Box 260
		bodyModel[112].setRotationPoint(-7.5F, -30.5F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 261
		bodyModel[113].setRotationPoint(-7.5F, -37.5F, -2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 262
		bodyModel[114].setRotationPoint(-9F, -34.2F, -0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 263
		bodyModel[115].setRotationPoint(-8.5F, -34.5F, -0.5F);

		bodyModel[116].addBox(-1F, -0.6F, -1F, 2, 4, 2, 0F); // Box 249
		bodyModel[116].setRotationPoint(-34F, -34F, -13F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 298
		barrelModel[1] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 299
		barrelModel[2] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 300
		barrelModel[3] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 301
		barrelModel[4] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 302
		barrelModel[5] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 303
		barrelModel[6] = new ModelRendererTurbo(this, 121, 297, textureX, textureY); // Box 304
		barrelModel[7] = new ModelRendererTurbo(this, 457, 305, textureX, textureY); // Box 305
		barrelModel[8] = new ModelRendererTurbo(this, 393, 321, textureX, textureY); // Box 307
		barrelModel[9] = new ModelRendererTurbo(this, 153, 321, textureX, textureY); // Box 308
		barrelModel[10] = new ModelRendererTurbo(this, 161, 329, textureX, textureY); // Box 309
		barrelModel[11] = new ModelRendererTurbo(this, 201, 329, textureX, textureY); // Box 310
		barrelModel[12] = new ModelRendererTurbo(this, 393, 329, textureX, textureY); // Box 314
		barrelModel[13] = new ModelRendererTurbo(this, 161, 337, textureX, textureY); // Box 315
		barrelModel[14] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Box 316
		barrelModel[15] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 286
		barrelModel[16] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 287
		barrelModel[17] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 288
		barrelModel[18] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 289
		barrelModel[19] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 291
		barrelModel[20] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 293
		barrelModel[21] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 295
		barrelModel[22] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 298
		barrelModel[23] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 299
		barrelModel[24] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 300
		barrelModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 301
		barrelModel[26] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 302
		barrelModel[27] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 303
		barrelModel[28] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 304
		barrelModel[29] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 305
		barrelModel[30] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 306
		barrelModel[31] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 307
		barrelModel[32] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 309
		barrelModel[33] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 310

		barrelModel[0].addShapeBox(5F, -1F, -2F, 10, 2, 4, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 298
		barrelModel[0].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[1].addShapeBox(5F, -1.9F, -2F, 10, 1, 4, 0F,0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		barrelModel[1].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[2].addShapeBox(5F, 0.9F, -2F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F); // Box 300
		barrelModel[2].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[3].addShapeBox(-1F, -1.9F, -2F, 6, 1, 4, 0F,0F, 1.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 1.1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 301
		barrelModel[3].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[4].addShapeBox(-1F, -1F, -2F, 6, 2, 4, 0F,0F, -0.1F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 1F); // Box 302
		barrelModel[4].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[5].addShapeBox(-1F, 0.9F, -2F, 6, 1, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 1F, -1F); // Box 303
		barrelModel[5].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[6].addShapeBox(13F, -1.65F, -2F, 20, 1, 4, 0F,0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 304
		barrelModel[6].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[7].addShapeBox(13F, -1F, -2F, 20, 2, 4, 0F,0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F); // Box 305
		barrelModel[7].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[8].addShapeBox(13F, 0.65F, -2F, 20, 1, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F); // Box 307
		barrelModel[8].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[9].addShapeBox(50F, -1.85F, -2F, 12, 1, 4, 0F,0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 308
		barrelModel[9].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[10].addShapeBox(50F, -1F, -2F, 12, 2, 4, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 309
		barrelModel[10].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[11].addShapeBox(50F, 0.849999999999999F, -2F, 12, 1, 4, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		barrelModel[11].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[12].addShapeBox(33F, -1.65F, -2F, 41, 1, 4, 0F,0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 314
		barrelModel[12].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[13].addShapeBox(33F, -1F, -2F, 41, 2, 4, 0F,0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F); // Box 315
		barrelModel[13].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[14].addShapeBox(33F, 0.65F, -2F, 41, 1, 4, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F, 0F, -0.1F, -1.3F); // Box 316
		barrelModel[14].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[15].addShapeBox(73F, -1.85F, -2F, 2, 1, 4, 0F,0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 286
		barrelModel[15].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[16].addShapeBox(73F, -1F, -2F, 2, 2, 4, 0F,0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F, 0F, -0.15F, -0.1F); // Box 287
		barrelModel[16].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[17].addShapeBox(73F, 0.849999999999999F, -2F, 2, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 288
		barrelModel[17].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[18].addShapeBox(75F, -1.9F, -2F, 2, 1, 4, 0F,0F, -0.15F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, -1F, 0F, -0.3F, -0.3F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 0F, -0.3F, -0.3F); // Box 289
		barrelModel[18].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[19].addShapeBox(77F, -2.25F, -2F, 5, 1, 4, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F); // Box 291
		barrelModel[19].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[20].addShapeBox(77F, 1.3F, -2F, 5, 1, 4, 0F,0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 293
		barrelModel[20].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[21].addShapeBox(77.5F, -1.8F, 1F, 2, 3, 1, 0F,0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0.7F, 0F, -0.35F, 0.25F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.25F); // Box 295
		barrelModel[21].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[22].addShapeBox(82F, -1.9F, -1.7F, 1, 1, 1, 0F,0F, 0.2F, 0.3F, 0F, -0.35F, 0.25F, 0.5F, -0.35F, 0F, 0F, 0.2F, 0F, 0F, -0.55F, 0.55F, 0F, -0.55F, 0.25F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F); // Box 298
		barrelModel[22].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[23].addShapeBox(82F, 0.95F, -1.7F, 1, 1, 1, 0F,0F, -0.55F, 0.55F, 0F, -0.55F, 0.25F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0F, 0.2F, 0.3F, 0F, -0.35F, 0.25F, 0.5F, -0.35F, 0F, 0F, 0.2F, 0F); // Box 299
		barrelModel[23].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[24].addShapeBox(82F, -1.9F, 0.7F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0.25F, 0F, 0.2F, 0.3F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.55F); // Box 300
		barrelModel[24].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[25].addShapeBox(82F, 0.95F, 0.7F, 1, 1, 1, 0F,0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.55F, 0F, 0.2F, 0F, 0.5F, -0.35F, 0F, 0F, -0.35F, 0.25F, 0F, 0.2F, 0.3F); // Box 301
		barrelModel[25].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[26].addShapeBox(82F, -1.45F, 0.7F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.55F, 0.5F, 0.95F, 0F, 0.5F, 0.95F, 0F, 0F, 0.95F, 0.25F, 0F, 0.95F, 0.55F); // Box 302
		barrelModel[26].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[27].addShapeBox(82F, -1.45F, -1.7F, 1, 2, 1, 0F,0F, 0F, 0.55F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.95F, 0.55F, 0F, 0.95F, 0.25F, 0.5F, 0.95F, 0F, 0.5F, 0.95F, 0F); // Box 303
		barrelModel[27].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[28].addShapeBox(82F, -1.9F, -0.3F, 1, 1, 1, 0F,0F, 0.2F, 0.4F, 0.5F, -0.35F, 0.4F, 0.5F, -0.35F, 0F, 0F, 0.2F, 0F, 0F, -0.55F, 0.4F, 0.5F, -0.55F, 0.4F, 0.5F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 304
		barrelModel[28].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[29].addShapeBox(82F, 0.95F, -0.3F, 1, 1, 1, 0F,0F, -0.55F, 0.4F, 0.5F, -0.55F, 0.4F, 0.5F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0.2F, 0.4F, 0.5F, -0.35F, 0.4F, 0.5F, -0.35F, 0F, 0F, 0.2F, 0F); // Box 305
		barrelModel[29].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[30].addShapeBox(82.9F, -1.55F, -0.3F, 1, 1, 1, 0F,-0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F); // Box 306
		barrelModel[30].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[31].addShapeBox(82.9F, 0.599999999999999F, -0.3F, 1, 1, 1, 0F,-0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0.4F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F); // Box 307
		barrelModel[31].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[32].addShapeBox(75F, 0.95F, -2F, 2, 1, 4, 0F,0F, -0.3F, -0.3F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 0F, -0.3F, -0.3F, 0F, -0.15F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.15F, -1F); // Box 309
		barrelModel[32].setRotationPoint(4F, -21.5F, 0F);

		barrelModel[33].addShapeBox(77.5F, -1.8F, -2F, 2, 3, 1, 0F,0F, -0.35F, 0.25F, 0F, -0.35F, 0.7F, 0.5F, -0.35F, 0F, 0.5F, -0.35F, 0F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.7F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F); // Box 310
		barrelModel[33].setRotationPoint(4F, -21.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 13
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 14
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 15
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 200
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 201
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 202
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 203
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 204
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 205
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 206
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 207
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 208
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 215
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 216
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 217
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 218
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 219
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 220
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 221
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 222
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 223
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 224
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 225
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 226

		leftTrackWheelModels[0].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[0].setRotationPoint(-38.5F, 2F, 25.2F);

		leftTrackWheelModels[1].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftTrackWheelModels[1].setRotationPoint(-38.5F, 2F, 25.2F);

		leftTrackWheelModels[2].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[2].setRotationPoint(-38.5F, 2F, 25.2F);

		leftTrackWheelModels[3].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		leftTrackWheelModels[3].setRotationPoint(-22.5F, 2F, 25.2F);

		leftTrackWheelModels[4].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftTrackWheelModels[4].setRotationPoint(-22.5F, 2F, 25.2F);

		leftTrackWheelModels[5].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 202
		leftTrackWheelModels[5].setRotationPoint(-22.5F, 2F, 25.2F);

		leftTrackWheelModels[6].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		leftTrackWheelModels[6].setRotationPoint(-5.5F, 2F, 25.2F);

		leftTrackWheelModels[7].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftTrackWheelModels[7].setRotationPoint(-5.5F, 2F, 25.2F);

		leftTrackWheelModels[8].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 205
		leftTrackWheelModels[8].setRotationPoint(-5.5F, 2F, 25.2F);

		leftTrackWheelModels[9].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftTrackWheelModels[9].setRotationPoint(10.5F, 2F, 25.2F);

		leftTrackWheelModels[10].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftTrackWheelModels[10].setRotationPoint(10.5F, 2F, 25.2F);

		leftTrackWheelModels[11].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 208
		leftTrackWheelModels[11].setRotationPoint(10.5F, 2F, 25.2F);

		leftTrackWheelModels[12].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 215
		leftTrackWheelModels[12].setRotationPoint(-55.5F, 2F, 25.2F);

		leftTrackWheelModels[13].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		leftTrackWheelModels[13].setRotationPoint(-55.5F, 2F, 25.2F);

		leftTrackWheelModels[14].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		leftTrackWheelModels[14].setRotationPoint(-55.5F, 2F, 25.2F);

		leftTrackWheelModels[15].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		leftTrackWheelModels[15].setRotationPoint(-71.5F, 2F, 25.2F);

		leftTrackWheelModels[16].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 219
		leftTrackWheelModels[16].setRotationPoint(-71.5F, 2F, 25.2F);

		leftTrackWheelModels[17].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		leftTrackWheelModels[17].setRotationPoint(-71.5F, 2F, 25.2F);

		leftTrackWheelModels[18].addShapeBox(-6F, -1.5F, -3F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		leftTrackWheelModels[18].setRotationPoint(-86.5F, -2F, 25.2F);

		leftTrackWheelModels[19].addShapeBox(-6F, 1.5F, -3F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 222
		leftTrackWheelModels[19].setRotationPoint(-86.5F, -2F, 25.2F);

		leftTrackWheelModels[20].addShapeBox(-6F, -5.5F, -3F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		leftTrackWheelModels[20].setRotationPoint(-86.5F, -2F, 25.2F);

		leftTrackWheelModels[21].addShapeBox(-5F, -4.5F, -3F, 10, 3, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftTrackWheelModels[21].setRotationPoint(26.5F, -2.5F, 25.2F);

		leftTrackWheelModels[22].addShapeBox(-5F, -1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		leftTrackWheelModels[22].setRotationPoint(26.5F, -2.5F, 25.2F);

		leftTrackWheelModels[23].addShapeBox(-5F, 1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 226
		leftTrackWheelModels[23].setRotationPoint(26.5F, -2.5F, 25.2F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 227
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 228
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 229
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 230
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 231
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 232
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 233
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 234
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 235
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 236
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 237
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 238
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 239
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 240
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 241
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 242
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 243
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 244
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 245
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 246
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 247
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 248
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 249
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 250

		rightTrackWheelModels[0].addShapeBox(-6F, -1.5F, -3F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackWheelModels[0].setRotationPoint(-86.5F, -2F, -30.8F);

		rightTrackWheelModels[1].addShapeBox(-6F, -5.5F, -3F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackWheelModels[1].setRotationPoint(-86.5F, -2F, -30.8F);

		rightTrackWheelModels[2].addShapeBox(-6F, 1.5F, -3F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 229
		rightTrackWheelModels[2].setRotationPoint(-86.5F, -2F, -30.8F);

		rightTrackWheelModels[3].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 230
		rightTrackWheelModels[3].setRotationPoint(-71.5F, 2F, -30.8F);

		rightTrackWheelModels[4].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		rightTrackWheelModels[4].setRotationPoint(-71.5F, 2F, -30.8F);

		rightTrackWheelModels[5].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		rightTrackWheelModels[5].setRotationPoint(-71.5F, 2F, -30.8F);

		rightTrackWheelModels[6].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 233
		rightTrackWheelModels[6].setRotationPoint(-55.5F, 2F, -30.8F);

		rightTrackWheelModels[7].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackWheelModels[7].setRotationPoint(-55.5F, 2F, -30.8F);

		rightTrackWheelModels[8].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		rightTrackWheelModels[8].setRotationPoint(-55.5F, 2F, -30.8F);

		rightTrackWheelModels[9].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 236
		rightTrackWheelModels[9].setRotationPoint(-38.5F, 2F, -30.8F);

		rightTrackWheelModels[10].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightTrackWheelModels[10].setRotationPoint(-38.5F, 2F, -30.8F);

		rightTrackWheelModels[11].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		rightTrackWheelModels[11].setRotationPoint(-38.5F, 2F, -30.8F);

		rightTrackWheelModels[12].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 239
		rightTrackWheelModels[12].setRotationPoint(-22.5F, 2F, -30.8F);

		rightTrackWheelModels[13].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		rightTrackWheelModels[13].setRotationPoint(-22.5F, 2F, -30.8F);

		rightTrackWheelModels[14].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		rightTrackWheelModels[14].setRotationPoint(-22.5F, 2F, -30.8F);

		rightTrackWheelModels[15].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 242
		rightTrackWheelModels[15].setRotationPoint(-5.5F, 2F, -30.8F);

		rightTrackWheelModels[16].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		rightTrackWheelModels[16].setRotationPoint(-5.5F, 2F, -30.8F);

		rightTrackWheelModels[17].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		rightTrackWheelModels[17].setRotationPoint(-5.5F, 2F, -30.8F);

		rightTrackWheelModels[18].addShapeBox(-5F, -4.5F, -3F, 10, 3, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackWheelModels[18].setRotationPoint(26.5F, -2.5F, -30.8F);

		rightTrackWheelModels[19].addShapeBox(-5F, -1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		rightTrackWheelModels[19].setRotationPoint(26.5F, -2.5F, -30.8F);

		rightTrackWheelModels[20].addShapeBox(-5F, 1.5F, -3F, 10, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 247
		rightTrackWheelModels[20].setRotationPoint(26.5F, -2.5F, -30.8F);

		rightTrackWheelModels[21].addShapeBox(-7F, -7F, -3F, 14, 5, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightTrackWheelModels[21].setRotationPoint(10.5F, 2F, -30.8F);

		rightTrackWheelModels[22].addShapeBox(-7F, -2F, -3F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		rightTrackWheelModels[22].setRotationPoint(10.5F, 2F, -30.8F);

		rightTrackWheelModels[23].addShapeBox(-7F, 2F, -3F, 14, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 250
		rightTrackWheelModels[23].setRotationPoint(10.5F, 2F, -30.8F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 165
		leftTrackModel[1] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 166
		leftTrackModel[2] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 167
		leftTrackModel[3] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 168
		leftTrackModel[4] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 169
		leftTrackModel[5] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 170
		leftTrackModel[6] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 171
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 172
		leftTrackModel[8] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 173
		leftTrackModel[9] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 174
		leftTrackModel[10] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 175
		leftTrackModel[11] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 176
		leftTrackModel[12] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 177
		leftTrackModel[13] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 178
		leftTrackModel[14] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 179
		leftTrackModel[15] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 180
		leftTrackModel[16] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 181
		leftTrackModel[17] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 182
		leftTrackModel[18] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 183
		leftTrackModel[19] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 184
		leftTrackModel[20] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 185
		leftTrackModel[21] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 186
		leftTrackModel[22] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 187

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1.05F, 0.8F, 0F, -1.05F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 165
		leftTrackModel[0].setRotationPoint(31F, -1.3F, 20.5F);
		leftTrackModel[0].rotateAngleZ = -0.54105207F;

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 166
		leftTrackModel[1].setRotationPoint(30.7F, -4F, 20.5F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0.6F, -2F, 0F, 0.6F, -2F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.2F, 0F, 0F); // Box 167
		leftTrackModel[2].setRotationPoint(30F, -7F, 20.5F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0F, -0.1F, 0F); // Box 168
		leftTrackModel[3].setRotationPoint(26F, -7.8F, 20.5F);

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.2F, 0F); // Box 169
		leftTrackModel[4].setRotationPoint(11F, -6.6F, 20.5F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, -0.8F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0.7F, 0F); // Box 170
		leftTrackModel[5].setRotationPoint(11F, 8.45F, 20.5F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 171
		leftTrackModel[6].setRotationPoint(-6F, 9.2F, 20.5F);

		leftTrackModel[7].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 172
		leftTrackModel[7].setRotationPoint(-22F, 9.2F, 20.5F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 173
		leftTrackModel[8].setRotationPoint(-39F, 9.2F, 20.5F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 174
		leftTrackModel[9].setRotationPoint(-55F, 9.2F, 20.5F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 175
		leftTrackModel[10].setRotationPoint(-72F, 9.2F, 20.5F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -6F, 0F); // Box 176
		leftTrackModel[11].setRotationPoint(-90F, 8.45F, 20.5F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.95F, 0F, 0F); // Box 177
		leftTrackModel[12].setRotationPoint(-92.5F, 1F, 20.5F);
		leftTrackModel[12].rotateAngleZ = 0.54105207F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		leftTrackModel[13].setRotationPoint(-93F, -2F, 20.5F);

		leftTrackModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 179
		leftTrackModel[14].setRotationPoint(-93F, -5F, 20.5F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0.05F, 2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 2.8F, 0F); // Box 180
		leftTrackModel[15].setRotationPoint(-92F, -7.8F, 20.5F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 181
		leftTrackModel[16].setRotationPoint(-85F, -6.8F, 20.5F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 182
		leftTrackModel[17].setRotationPoint(-71F, -5.8F, 20.5F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		leftTrackModel[18].setRotationPoint(-89F, -7.8F, 20.5F);

		leftTrackModel[19].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 184
		leftTrackModel[19].setRotationPoint(-55F, -5.8F, 20.5F);

		leftTrackModel[20].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 185
		leftTrackModel[20].setRotationPoint(-39F, -5.8F, 20.5F);

		leftTrackModel[21].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 186
		leftTrackModel[21].setRotationPoint(-22F, -5.8F, 20.5F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 187
		leftTrackModel[22].setRotationPoint(-5F, -5.8F, 20.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 140
		rightTrackModel[1] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 141
		rightTrackModel[2] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 142
		rightTrackModel[3] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 143
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 144
		rightTrackModel[5] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 145
		rightTrackModel[6] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 146
		rightTrackModel[7] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 147
		rightTrackModel[8] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 148
		rightTrackModel[9] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 149
		rightTrackModel[10] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 150
		rightTrackModel[11] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 151
		rightTrackModel[12] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 152
		rightTrackModel[13] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 153
		rightTrackModel[14] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 154
		rightTrackModel[15] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 155
		rightTrackModel[16] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 157
		rightTrackModel[17] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 158
		rightTrackModel[18] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 159
		rightTrackModel[19] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 160
		rightTrackModel[20] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 161
		rightTrackModel[21] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 162
		rightTrackModel[22] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 163

		rightTrackModel[0].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 140
		rightTrackModel[0].setRotationPoint(-39F, -5.8F, -34.5F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 141
		rightTrackModel[1].setRotationPoint(-55F, -5.8F, -34.5F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 142
		rightTrackModel[2].setRotationPoint(-71F, -5.8F, -34.5F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 14, 1, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 143
		rightTrackModel[3].setRotationPoint(-85F, -6.8F, -34.5F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 144
		rightTrackModel[4].setRotationPoint(-22F, -5.8F, -34.5F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.2F, 0F); // Box 145
		rightTrackModel[5].setRotationPoint(11F, -6.6F, -34.5F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 16, 1, 8, 0F,0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 146
		rightTrackModel[6].setRotationPoint(-5F, -5.8F, -34.5F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 16, 1, 8, 0F); // Box 147
		rightTrackModel[7].setRotationPoint(-55F, 9.2F, -34.5F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 148
		rightTrackModel[8].setRotationPoint(-39F, 9.2F, -34.5F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 149
		rightTrackModel[9].setRotationPoint(-22F, 9.2F, -34.5F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 150
		rightTrackModel[10].setRotationPoint(-72F, 9.2F, -34.5F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 17, 1, 8, 0F); // Box 151
		rightTrackModel[11].setRotationPoint(-6F, 9.2F, -34.5F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, 6F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -6F, 0F); // Box 152
		rightTrackModel[12].setRotationPoint(-90F, 8.45F, -34.5F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 18, 1, 8, 0F,0F, -0.8F, 0F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0.7F, 0F); // Box 153
		rightTrackModel[13].setRotationPoint(11F, 8.45F, -34.5F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightTrackModel[14].setRotationPoint(-89F, -7.8F, -34.5F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0.05F, 2.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 2.8F, 0F); // Box 155
		rightTrackModel[15].setRotationPoint(-92F, -7.8F, -34.5F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 157
		rightTrackModel[16].setRotationPoint(-93F, -5F, -34.5F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
		rightTrackModel[17].setRotationPoint(-93F, -2F, -34.5F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.95F, 0F, 0F); // Box 159
		rightTrackModel[18].setRotationPoint(-92.5F, 1F, -34.5F);
		rightTrackModel[18].rotateAngleZ = 0.54105207F;

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 160
		rightTrackModel[19].setRotationPoint(30.7F, -4F, -34.5F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1.05F, 0.8F, 0F, -1.05F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 161
		rightTrackModel[20].setRotationPoint(31F, -1.3F, -34.5F);
		rightTrackModel[20].rotateAngleZ = -0.54105207F;

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0.6F, -2F, 0F, 0.6F, -2F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.2F, 0F, 0F); // Box 162
		rightTrackModel[21].setRotationPoint(30F, -7F, -34.5F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0F, -0.1F, 0F); // Box 163
		rightTrackModel[22].setRotationPoint(26F, -7.8F, -34.5F);
	}

	private void initGuns() {
	}
	{

		// Driver/Pilot
		ModelRendererTurbo[][] gun_0_Model = new ModelRendererTurbo[3][];

		gun_0_Model[0] = new ModelRendererTurbo[21];
		gun_0_Model[0][0] = new ModelRendererTurbo(this, 49, 297, textureX, textureY); // Box 227
		gun_0_Model[0][1] = new ModelRendererTurbo(this, 73, 297, textureX, textureY); // Box 228
		gun_0_Model[0][2] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Box 231
		gun_0_Model[0][3] = new ModelRendererTurbo(this, 177, 297, textureX, textureY); // Box 234
		gun_0_Model[0][4] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Box 235
		gun_0_Model[0][5] = new ModelRendererTurbo(this, 193, 297, textureX, textureY); // Box 236
		gun_0_Model[0][6] = new ModelRendererTurbo(this, 497, 297, textureX, textureY); // Box 237
		gun_0_Model[0][7] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Box 238
		gun_0_Model[0][8] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 239
		gun_0_Model[0][9] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 240
		gun_0_Model[0][10] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Box 241
		gun_0_Model[0][11] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Box 242
		gun_0_Model[0][12] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 243
		gun_0_Model[0][13] = new ModelRendererTurbo(this, 33, 313, textureX, textureY); // Box 244
		gun_0_Model[0][14] = new ModelRendererTurbo(this, 41, 313, textureX, textureY); // Box 245
		gun_0_Model[0][15] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Box 246
		gun_0_Model[0][16] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 247
		gun_0_Model[0][17] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 248
		gun_0_Model[0][18] = new ModelRendererTurbo(this, 193, 313, textureX, textureY); // Box 250
		gun_0_Model[0][19] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 251
		gun_0_Model[0][20] = new ModelRendererTurbo(this, 225, 313, textureX, textureY); // Box 252

		gun_0_Model[0][0].addShapeBox(-1F, -2.7F, -1.35F, 1, 2, 1, 0F,1.2F, -0.3F, -0.4F, -0.94F, 0F, -0.4F, -0.94F, 0F, -0.4F, 1.2F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 227

		gun_0_Model[0][1].addShapeBox(-1F, -2.7F, 0.3F, 1, 2, 1, 0F,1.2F, -0.3F, -0.4F, -0.94F, 0F, -0.4F, -0.94F, 0F, -0.4F, 1.2F, -0.3F, -0.4F, 0F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 228

		gun_0_Model[0][2].addShapeBox(-1.4F, -3.3F, -1.35F, 1, 1, 1, 0F,0.8F, -0.2F, -0.4F, -0.94F, -0.2F, -0.4F, -0.94F, -0.2F, -0.4F, 0.8F, -0.2F, -0.4F, 0.8F, -0.1F, -0.4F, -0.55F, -0.4F, -0.4F, -0.55F, -0.4F, -0.4F, 0.8F, -0.1F, -0.4F); // Box 231

		gun_0_Model[0][3].addShapeBox(-3.1F, -3.1F, 0.5F, 2, 1, 1, 0F,0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F); // Box 234

		gun_0_Model[0][4].addShapeBox(-3.1F, -4.1F, 0.5F, 2, 1, 1, 0F,-0.8F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.8F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F); // Box 235

		gun_0_Model[0][5].addShapeBox(-3.1F, -2.1F, 0.5F, 2, 1, 1, 0F,0.2F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.2F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.8F, 0F, -0.35F); // Box 236

		gun_0_Model[0][6].addShapeBox(-0.8F, -3.1F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 237

		gun_0_Model[0][7].addShapeBox(-3.7F, -3.1F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 238

		gun_0_Model[0][8].addShapeBox(-0.8F, -4.1F, 0.6F, 1, 1, 1, 0F,0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 239

		gun_0_Model[0][9].addShapeBox(-3.7F, -4.1F, 0.6F, 1, 1, 1, 0F,-1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 240

		gun_0_Model[0][10].addShapeBox(-0.8F, -2.1F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F); // Box 241

		gun_0_Model[0][11].addShapeBox(-3.7F, -2.1F, 0.6F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -1.35F, 0F, -0.35F, 0.65F, 0F, -0.35F, 0.65F, 0F, -0.35F, -1.35F, 0F, -0.35F); // Box 242

		gun_0_Model[0][12].addShapeBox(-2.75F, -1.75F, 0.6F, 2, 1, 1, 0F,-0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F); // Box 243

		gun_0_Model[0][13].addShapeBox(-2.75F, -4.5F, 0.6F, 2, 1, 1, 0F,-0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F); // Box 244

		gun_0_Model[0][14].addShapeBox(-2.28F, -2.92F, 0.8F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F); // Box 245

		gun_0_Model[0][15].addShapeBox(-2.28F, -3.23F, 0.8F, 1, 1, 1, 0F,-0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.3F, -0.33F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 246

		gun_0_Model[0][16].addBox(-1F, -1F, -1F, 2, 1, 2, 0F); // Box 247

		gun_0_Model[0][17].addBox(-1F, -0.8F, -1F, 2, 1, 2, 0F); // Box 248

		gun_0_Model[0][18].addShapeBox(0.25F, -1.6F, -1.6F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 250

		gun_0_Model[0][19].addShapeBox(0.25F, -1.6F, 0.55F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 251

		gun_0_Model[0][20].addShapeBox(0.25F, -1.3F, 0.3F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, -0.2F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F, -0.25F, 0.1F, -0.38F); // Box 252

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_0_Model[0])
		{
			gunPart.setRotationPoint(-34F, -34F, -13F);
		}


		gun_0_Model[1] = new ModelRendererTurbo[0];

		gun_0_Model[2] = new ModelRendererTurbo[224];
		gun_0_Model[2][0] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 172
		gun_0_Model[2][1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 173
		gun_0_Model[2][2] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 174
		gun_0_Model[2][3] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 175
		gun_0_Model[2][4] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 176
		gun_0_Model[2][5] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 177
		gun_0_Model[2][6] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 178
		gun_0_Model[2][7] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 179
		gun_0_Model[2][8] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 180
		gun_0_Model[2][9] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 181
		gun_0_Model[2][10] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 182
		gun_0_Model[2][11] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 183
		gun_0_Model[2][12] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 184
		gun_0_Model[2][13] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 187
		gun_0_Model[2][14] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 189
		gun_0_Model[2][15] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 190
		gun_0_Model[2][16] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 191
		gun_0_Model[2][17] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 192
		gun_0_Model[2][18] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 193
		gun_0_Model[2][19] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 194
		gun_0_Model[2][20] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 195
		gun_0_Model[2][21] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 196
		gun_0_Model[2][22] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 197
		gun_0_Model[2][23] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 198
		gun_0_Model[2][24] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 199
		gun_0_Model[2][25] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Box 25
		gun_0_Model[2][26] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 26
		gun_0_Model[2][27] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 28
		gun_0_Model[2][28] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 29
		gun_0_Model[2][29] = new ModelRendererTurbo(this, 33, 265, textureX, textureY); // Box 30
		gun_0_Model[2][30] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 31
		gun_0_Model[2][31] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 32
		gun_0_Model[2][32] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 33
		gun_0_Model[2][33] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 34
		gun_0_Model[2][34] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 35
		gun_0_Model[2][35] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 36
		gun_0_Model[2][36] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 37
		gun_0_Model[2][37] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 38
		gun_0_Model[2][38] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 39
		gun_0_Model[2][39] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 40
		gun_0_Model[2][40] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 42
		gun_0_Model[2][41] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 43
		gun_0_Model[2][42] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 44
		gun_0_Model[2][43] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 45
		gun_0_Model[2][44] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 46
		gun_0_Model[2][45] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 47
		gun_0_Model[2][46] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 48
		gun_0_Model[2][47] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Box 49
		gun_0_Model[2][48] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 50
		gun_0_Model[2][49] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 51
		gun_0_Model[2][50] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 52
		gun_0_Model[2][51] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 53
		gun_0_Model[2][52] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 54
		gun_0_Model[2][53] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 55
		gun_0_Model[2][54] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 54
		gun_0_Model[2][55] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 55
		gun_0_Model[2][56] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 56
		gun_0_Model[2][57] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 57
		gun_0_Model[2][58] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 58
		gun_0_Model[2][59] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 59
		gun_0_Model[2][60] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 60
		gun_0_Model[2][61] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 64
		gun_0_Model[2][62] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 65
		gun_0_Model[2][63] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 66
		gun_0_Model[2][64] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 67
		gun_0_Model[2][65] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 68
		gun_0_Model[2][66] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 69
		gun_0_Model[2][67] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 70
		gun_0_Model[2][68] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 71
		gun_0_Model[2][69] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 72
		gun_0_Model[2][70] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 73
		gun_0_Model[2][71] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 74
		gun_0_Model[2][72] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 75
		gun_0_Model[2][73] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 76
		gun_0_Model[2][74] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 77
		gun_0_Model[2][75] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 78
		gun_0_Model[2][76] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 79
		gun_0_Model[2][77] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 80
		gun_0_Model[2][78] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 81
		gun_0_Model[2][79] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 82
		gun_0_Model[2][80] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 83
		gun_0_Model[2][81] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 84
		gun_0_Model[2][82] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 85
		gun_0_Model[2][83] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 86
		gun_0_Model[2][84] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 87
		gun_0_Model[2][85] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 88
		gun_0_Model[2][86] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 89
		gun_0_Model[2][87] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 90
		gun_0_Model[2][88] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 91
		gun_0_Model[2][89] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 92
		gun_0_Model[2][90] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 108
		gun_0_Model[2][91] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 92
		gun_0_Model[2][92] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 93
		gun_0_Model[2][93] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 94
		gun_0_Model[2][94] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 95
		gun_0_Model[2][95] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 96
		gun_0_Model[2][96] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 97
		gun_0_Model[2][97] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 98
		gun_0_Model[2][98] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 99
		gun_0_Model[2][99] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 100
		gun_0_Model[2][100] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 101
		gun_0_Model[2][101] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 102
		gun_0_Model[2][102] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 103
		gun_0_Model[2][103] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 105
		gun_0_Model[2][104] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 106
		gun_0_Model[2][105] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 107
		gun_0_Model[2][106] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 108
		gun_0_Model[2][107] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 109
		gun_0_Model[2][108] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 110
		gun_0_Model[2][109] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 111
		gun_0_Model[2][110] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 112
		gun_0_Model[2][111] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 113
		gun_0_Model[2][112] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 114
		gun_0_Model[2][113] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 115
		gun_0_Model[2][114] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 116
		gun_0_Model[2][115] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 117
		gun_0_Model[2][116] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 118
		gun_0_Model[2][117] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 119
		gun_0_Model[2][118] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 120
		gun_0_Model[2][119] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 121
		gun_0_Model[2][120] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 122
		gun_0_Model[2][121] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 123
		gun_0_Model[2][122] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 124
		gun_0_Model[2][123] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 126
		gun_0_Model[2][124] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 127
		gun_0_Model[2][125] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 128
		gun_0_Model[2][126] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Box 129
		gun_0_Model[2][127] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 130
		gun_0_Model[2][128] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Box 131
		gun_0_Model[2][129] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 132
		gun_0_Model[2][130] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 133
		gun_0_Model[2][131] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 134
		gun_0_Model[2][132] = new ModelRendererTurbo(this, 9, 201, textureX, textureY); // Box 135
		gun_0_Model[2][133] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 136
		gun_0_Model[2][134] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 137
		gun_0_Model[2][135] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 138
		gun_0_Model[2][136] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Box 139
		gun_0_Model[2][137] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 140
		gun_0_Model[2][138] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Box 141
		gun_0_Model[2][139] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 107
		gun_0_Model[2][140] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 16
		gun_0_Model[2][141] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 17
		gun_0_Model[2][142] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 18
		gun_0_Model[2][143] = new ModelRendererTurbo(this, 9, 209, textureX, textureY); // Box 19
		gun_0_Model[2][144] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 20
		gun_0_Model[2][145] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 21
		gun_0_Model[2][146] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 22
		gun_0_Model[2][147] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 23
		gun_0_Model[2][148] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Box 24
		gun_0_Model[2][149] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 25
		gun_0_Model[2][150] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 26
		gun_0_Model[2][151] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 27
		gun_0_Model[2][152] = new ModelRendererTurbo(this, 505, 209, textureX, textureY); // Box 28
		gun_0_Model[2][153] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 29
		gun_0_Model[2][154] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 159
		gun_0_Model[2][155] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 160
		gun_0_Model[2][156] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 161
		gun_0_Model[2][157] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 162
		gun_0_Model[2][158] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 163
		gun_0_Model[2][159] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 164
		gun_0_Model[2][160] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 165
		gun_0_Model[2][161] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 166
		gun_0_Model[2][162] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 167
		gun_0_Model[2][163] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 168
		gun_0_Model[2][164] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 169
		gun_0_Model[2][165] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 170
		gun_0_Model[2][166] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 171
		gun_0_Model[2][167] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Box 172
		gun_0_Model[2][168] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 173
		gun_0_Model[2][169] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 174
		gun_0_Model[2][170] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 175
		gun_0_Model[2][171] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 176
		gun_0_Model[2][172] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 177
		gun_0_Model[2][173] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 178
		gun_0_Model[2][174] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 179
		gun_0_Model[2][175] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 180
		gun_0_Model[2][176] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Box 181
		gun_0_Model[2][177] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 182
		gun_0_Model[2][178] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 183
		gun_0_Model[2][179] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 184
		gun_0_Model[2][180] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 185
		gun_0_Model[2][181] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 186
		gun_0_Model[2][182] = new ModelRendererTurbo(this, 193, 249, textureX, textureY); // Box 187
		gun_0_Model[2][183] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 188
		gun_0_Model[2][184] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 189
		gun_0_Model[2][185] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 190
		gun_0_Model[2][186] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Box 191
		gun_0_Model[2][187] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 192
		gun_0_Model[2][188] = new ModelRendererTurbo(this, 505, 249, textureX, textureY); // Box 193
		gun_0_Model[2][189] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 194
		gun_0_Model[2][190] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 195
		gun_0_Model[2][191] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 196
		gun_0_Model[2][192] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 197
		gun_0_Model[2][193] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 198
		gun_0_Model[2][194] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 199
		gun_0_Model[2][195] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 200
		gun_0_Model[2][196] = new ModelRendererTurbo(this, 273, 273, textureX, textureY); // Box 201
		gun_0_Model[2][197] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 202
		gun_0_Model[2][198] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 203
		gun_0_Model[2][199] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 204
		gun_0_Model[2][200] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 205
		gun_0_Model[2][201] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 206
		gun_0_Model[2][202] = new ModelRendererTurbo(this, 321, 281, textureX, textureY); // Box 207
		gun_0_Model[2][203] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Box 208
		gun_0_Model[2][204] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Box 209
		gun_0_Model[2][205] = new ModelRendererTurbo(this, 409, 281, textureX, textureY); // Box 210
		gun_0_Model[2][206] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 211
		gun_0_Model[2][207] = new ModelRendererTurbo(this, 457, 281, textureX, textureY); // Box 212
		gun_0_Model[2][208] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Box 213
		gun_0_Model[2][209] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 214
		gun_0_Model[2][210] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Box 215
		gun_0_Model[2][211] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Box 216
		gun_0_Model[2][212] = new ModelRendererTurbo(this, 49, 289, textureX, textureY); // Box 217
		gun_0_Model[2][213] = new ModelRendererTurbo(this, 73, 289, textureX, textureY); // Box 218
		gun_0_Model[2][214] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 219
		gun_0_Model[2][215] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Box 220
		gun_0_Model[2][216] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Box 221
		gun_0_Model[2][217] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Box 222
		gun_0_Model[2][218] = new ModelRendererTurbo(this, 505, 289, textureX, textureY); // Box 223
		gun_0_Model[2][219] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 224
		gun_0_Model[2][220] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Box 225
		gun_0_Model[2][221] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Box 226
		gun_0_Model[2][222] = new ModelRendererTurbo(this, 105, 297, textureX, textureY); // Box 229
		gun_0_Model[2][223] = new ModelRendererTurbo(this, 169, 297, textureX, textureY); // Box 232

		gun_0_Model[2][0].addBox(-2.8F, -5.8F, -0.5F, 3, 1, 1, 0F); // Box 172

		gun_0_Model[2][1].addShapeBox(-2.8F, -4.8F, -0.5F, 3, 1, 1, 0F,0F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0.45F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 173

		gun_0_Model[2][2].addShapeBox(-10.4F, -6.05F, -0.5F, 4, 2, 1, 0F,0F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.1F, 0F, 0.45F, -0.1F, 0F, 0.45F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 174

		gun_0_Model[2][3].addShapeBox(-5.95F, -5.05F, -0.5F, 3, 1, 1, 0F,0F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0.15F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 175

		gun_0_Model[2][4].addShapeBox(-6.85F, -6.45F, -0.5F, 1, 1, 1, 0F,0F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, -0.1F, 0.2F, -0.05F, 0F, 0.2F, -0.05F, 0F, -0.2F, -0.05F, -0.1F, -0.2F, -0.05F, -0.1F, -0.2F, -0.05F, 0F, -0.2F, -0.05F); // Box 176

		gun_0_Model[2][5].addShapeBox(-5.95F, -6.95F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.1F, -0.05F, -0.3F, -0.1F, -0.05F, -0.3F, -0.1F, -0.05F, 0F, -0.1F, -0.05F); // Box 177

		gun_0_Model[2][6].addShapeBox(-4.25F, -6.95F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.05F, -0.3F, -0.6F, -0.05F, -0.3F, -0.6F, -0.05F, 0F, -0.3F, -0.05F, 0F, 0F, -0.05F, -0.3F, 0F, -0.05F, -0.3F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 178

		gun_0_Model[2][7].addShapeBox(-3.2F, -6.38F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F, -0.35F, -0.42F, -0.05F); // Box 179

		gun_0_Model[2][8].addShapeBox(-5.88F, -6.95F, 0.15F, 2, 1, 1, 0F,-0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 180

		gun_0_Model[2][9].addShapeBox(-5.98F, -6.65F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 181

		gun_0_Model[2][10].addShapeBox(-4.79F, -6.65F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 182

		gun_0_Model[2][11].addShapeBox(-5.95F, -6.55F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, -0.5F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 183

		gun_0_Model[2][12].addShapeBox(-6.28F, -6.5F, 0.15F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 184

		gun_0_Model[2][13].addShapeBox(-6.3F, -5.8F, -1.15F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 187

		gun_0_Model[2][14].addShapeBox(-3.1F, -6.1F, -1.2F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 189

		gun_0_Model[2][15].addShapeBox(-5.88F, -6.95F, -1.15F, 2, 1, 1, 0F,-0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 190

		gun_0_Model[2][16].addShapeBox(-5.98F, -6.65F, -1.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 191

		gun_0_Model[2][17].addShapeBox(-6.28F, -6.5F, -1.15F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 192

		gun_0_Model[2][18].addShapeBox(-6.43F, -6.25F, -1.15F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F); // Box 193

		gun_0_Model[2][19].addShapeBox(-4.79F, -6.65F, -1.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 194

		gun_0_Model[2][20].addShapeBox(-6.3F, -5.8F, 0.15F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F); // Box 195

		gun_0_Model[2][21].addShapeBox(-3.1F, -6.1F, 0.15F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 196

		gun_0_Model[2][22].addShapeBox(-6.43F, -6.25F, 0.15F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F); // Box 197

		gun_0_Model[2][23].addShapeBox(-6.25F, -5.85F, -1.35F, 4, 1, 1, 0F,-0.3F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.5F, -0.45F, -0.35F, -0.8F, -0.45F, -0.35F, -0.8F, -0.45F, -0.61F, -0.5F, -0.45F, -0.61F); // Box 198

		gun_0_Model[2][24].addShapeBox(-5.8F, -5.7F, -1.48F, 3, 1, 1, 0F,-0.3F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.6F, -0.4F, -0.48F, -0.3F, -0.4F, -0.48F, -0.5F, -0.3F, -0.46F, -0.8F, -0.3F, -0.46F, -0.8F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F); // Box 199

		gun_0_Model[2][25].addShapeBox(0.2F, -5.75F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 25

		gun_0_Model[2][26].addShapeBox(12.65F, -6.05F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.35F, 0.9F, -0.45F, -0.35F, 0.9F, -0.45F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F); // Box 26

		gun_0_Model[2][27].addShapeBox(0.2F, -5.45F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 28

		gun_0_Model[2][28].addShapeBox(12.65F, -5.75F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F); // Box 29

		gun_0_Model[2][29].addShapeBox(0.2F, -6.05F, -0.5F, 12, 1, 1, 0F,0F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0.45F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0.45F, -0.35F, -0.05F, 0F, -0.35F, -0.05F); // Box 30

		gun_0_Model[2][30].addShapeBox(12.65F, -5.45F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.05F, 0.9F, -0.35F, -0.15F, 0.9F, -0.35F, -0.15F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.35F, 0.9F, -0.45F, -0.35F, 0.9F, -0.45F, -0.35F, 0F, -0.35F, -0.35F); // Box 31

		gun_0_Model[2][31].addShapeBox(15.1F, -6.05F, -0.5F, 1, 1, 1, 0F,0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 32

		gun_0_Model[2][32].addShapeBox(15.1F, -5.45F, -0.5F, 1, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F); // Box 33

		gun_0_Model[2][33].addShapeBox(15.1F, -5.75F, -0.5F, 1, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 34

		gun_0_Model[2][34].addShapeBox(16.7F, -6.05F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F); // Box 35

		gun_0_Model[2][35].addShapeBox(16.7F, -5.75F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F); // Box 36

		gun_0_Model[2][36].addShapeBox(16.7F, -5.45F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0F, -0.35F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.5F, -0.4F); // Box 37

		gun_0_Model[2][37].addShapeBox(17.15F, -6.05F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F); // Box 38

		gun_0_Model[2][38].addShapeBox(17.15F, -5.45F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.35F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F); // Box 39

		gun_0_Model[2][39].addShapeBox(17.15F, -5.75F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F); // Box 40

		gun_0_Model[2][40].addShapeBox(17.8F, -6.05F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F); // Box 42

		gun_0_Model[2][41].addShapeBox(17.8F, -5.75F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F, -0.45F, -0.4F, 0.2F); // Box 43

		gun_0_Model[2][42].addShapeBox(17.8F, -5.45F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.3F, 0.2F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F, -0.45F, -0.2F, -0.1F); // Box 44

		gun_0_Model[2][43].addShapeBox(17.5F, -6.3F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 45

		gun_0_Model[2][44].addShapeBox(17.5F, -5.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F, -0.2F, -0.45F, -0.1F); // Box 46

		gun_0_Model[2][45].addShapeBox(1.1F, -4.9F, -0.5F, 11, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 47

		gun_0_Model[2][46].addShapeBox(1.1F, -5.2F, -0.5F, 11, 1, 1, 0F,0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F); // Box 48

		gun_0_Model[2][47].addShapeBox(1.1F, -4.6F, -0.5F, 11, 1, 1, 0F,0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.35F, -0.2F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F); // Box 49

		gun_0_Model[2][48].addShapeBox(11.6F, -5.2F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 50

		gun_0_Model[2][49].addShapeBox(9.6F, -5.2F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F); // Box 51

		gun_0_Model[2][50].addShapeBox(17.9F, -5.75F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 52

		gun_0_Model[2][51].addShapeBox(17.9F, -5.45F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F); // Box 53

		gun_0_Model[2][52].addShapeBox(17.9F, -6.05F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 54

		gun_0_Model[2][53].addShapeBox(17.5F, -5.75F, 0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 55

		gun_0_Model[2][54].addShapeBox(17.5F, -5.75F, -1.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 54

		gun_0_Model[2][55].addShapeBox(-2.7F, -3.9F, -0.5F, 3, 1, 1, 0F,0F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0.85F, -0.25F, 0.2F, 0F, -0.25F, 0.2F); // Box 55

		gun_0_Model[2][56].addShapeBox(-1.7F, -3.4F, -0.5F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.85F, -0.25F, 0F, 0.85F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.25F, 0.85F, -0.5F, -0.25F, 0.85F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 56

		gun_0_Model[2][57].addShapeBox(-2.2F, -4.4F, -1.1F, 1, 1, 1, 0F,-0.15F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, 0.15F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F); // Box 57

		gun_0_Model[2][58].addShapeBox(-2.2F, -4.4F, 0.1F, 1, 1, 1, 0F,-0.15F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, -0.15F, 0.3F, -0.4F, 0.15F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.15F, -0.25F, -0.4F); // Box 58

		gun_0_Model[2][59].addShapeBox(-11.2F, -6.1F, 0F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.35F, -0.35F, -0.2F, -0.55F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.55F, -0.35F); // Box 59

		gun_0_Model[2][60].addShapeBox(-11.2F, -6.1F, -1F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.35F, -0.4F, -0.2F, -0.55F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.55F, -0.4F); // Box 60

		gun_0_Model[2][61].addShapeBox(-11.2F, -4.7F, -1F, 1, 1, 1, 0F,-0.2F, -0.55F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.55F, -0.4F, -0.2F, -0.35F, -0.35F, -0.2F, -0.45F, -0.5F, -0.2F, -0.45F, -0.25F, -0.2F, -0.35F, -0.4F); // Box 64

		gun_0_Model[2][62].addShapeBox(-11.2F, -4.7F, 0F, 1, 1, 1, 0F,-0.2F, -0.55F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.55F, -0.35F, -0.2F, -0.35F, -0.4F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.5F, -0.2F, -0.35F, -0.35F); // Box 65

		gun_0_Model[2][63].addShapeBox(-11.8F, -6.1F, 0.15F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.75F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.5F, -0.1F, -0.35F, 0.25F, -0.1F, -0.55F, -0.75F, -0.2F, -0.55F, -0.25F, -0.2F, -0.55F, -0.5F, -0.1F, -0.55F, 0.25F); // Box 66

		gun_0_Model[2][64].addShapeBox(-11.8F, -6.1F, -1.15F, 1, 1, 1, 0F,-0.1F, -0.35F, 0.25F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.25F, -0.1F, -0.35F, -0.75F, -0.1F, -0.55F, 0.25F, -0.2F, -0.55F, -0.5F, -0.2F, -0.55F, -0.25F, -0.1F, -0.55F, -0.75F); // Box 67

		gun_0_Model[2][65].addShapeBox(-11.8F, -4.5F, 0.15F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.75F, -0.2F, -0.35F, -0.25F, -0.2F, -0.35F, -0.5F, -0.1F, -0.35F, 0.25F, -0.1F, -0.55F, -0.75F, -0.2F, -0.55F, -0.25F, -0.2F, -0.55F, -0.5F, -0.1F, -0.55F, 0.25F); // Box 68

		gun_0_Model[2][66].addShapeBox(-11.8F, -4.5F, -1.15F, 1, 1, 1, 0F,-0.1F, -0.35F, 0.25F, -0.2F, -0.35F, -0.5F, -0.2F, -0.35F, -0.25F, -0.1F, -0.35F, -0.75F, -0.1F, -0.55F, 0.25F, -0.2F, -0.55F, -0.5F, -0.2F, -0.55F, -0.25F, -0.1F, -0.55F, -0.75F); // Box 69

		gun_0_Model[2][67].addShapeBox(-12.35F, -6.1F, 0.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.3F, -0.35F, -0.4F, -0.3F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.3F, -0.55F, -0.4F); // Box 70

		gun_0_Model[2][68].addShapeBox(-12.35F, -6.1F, -1.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.3F, -0.35F, -0.4F, -0.3F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.3F, -0.55F, -0.4F); // Box 71

		gun_0_Model[2][69].addShapeBox(-12.35F, -4.5F, -1.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.4F); // Box 72

		gun_0_Model[2][70].addShapeBox(-12.35F, -4.5F, 0.65F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.4F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.25F, -0.35F, -0.35F, -0.4F, -0.35F, -0.55F, -0.4F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.25F, -0.35F, -0.55F, -0.4F); // Box 73

		gun_0_Model[2][71].addShapeBox(-12.35F, -5.9F, 0.78F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 74

		gun_0_Model[2][72].addShapeBox(-12.35F, -5.9F, 0.57F, 1, 2, 1, 0F,-0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 75

		gun_0_Model[2][73].addShapeBox(-12.35F, -5.9F, -1.76F, 1, 2, 1, 0F,-0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F); // Box 76

		gun_0_Model[2][74].addShapeBox(-12.35F, -5.9F, -1.55F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F, -0.4F, -0.25F, -0.4F); // Box 77

		gun_0_Model[2][75].addShapeBox(-4.75F, -6.35F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F); // Box 78

		gun_0_Model[2][76].addShapeBox(-4.75F, -6F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F); // Box 79

		gun_0_Model[2][77].addShapeBox(-4.75F, -6.53F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F); // Box 80

		gun_0_Model[2][78].addShapeBox(-5.9F, -6.53F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F, -0.48F, -0.4F, -0.15F); // Box 81

		gun_0_Model[2][79].addShapeBox(-5.9F, -6.35F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.42F, -0.15F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F, -0.48F, -0.45F, -0.35F); // Box 82

		gun_0_Model[2][80].addShapeBox(-5.9F, -6F, -0.9F, 1, 1, 1, 0F,-0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.35F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F, -0.48F, -0.2F, -0.4F); // Box 83

		gun_0_Model[2][81].addShapeBox(-5.88F, -6.8F, 0F, 2, 1, 1, 0F,-0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F); // Box 84

		gun_0_Model[2][82].addShapeBox(-2.1F, -6.45F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.6F, -0.3F, -0.2F, -0.25F, -0.3F, -0.1F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 85

		gun_0_Model[2][83].addShapeBox(-5.35F, -5.96F, -1.25F, 1, 1, 1, 0F,-0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F, -0.1F, -0.48F, -0.3F); // Box 86

		gun_0_Model[2][84].addShapeBox(-5.35F, -5.96F, -1.5F, 1, 1, 1, 0F,-0.1F, -0.55F, -0.45F, -0.1F, -0.55F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.4F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F); // Box 87

		gun_0_Model[2][85].addShapeBox(-5.35F, -5.89F, -1.6F, 1, 1, 1, 0F,-0.1F, -0.8F, -0.4F, -0.1F, -0.8F, -0.4F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, -0.48F, -0.45F, -0.1F, -0.48F, -0.45F); // Box 88

		gun_0_Model[2][86].addShapeBox(-10.4F, -4.65F, -0.5F, 7, 1, 1, 0F,0F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0.85F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 89

		gun_0_Model[2][87].addShapeBox(-7.4F, -7F, -0.53F, 1, 1, 1, 0F,-0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F, -0.45F, -0.38F, -0.15F); // Box 90

		gun_0_Model[2][88].addShapeBox(-9.8F, -4.2F, -0.5F, 6, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, 0.85F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 91

		gun_0_Model[2][89].addShapeBox(-3.5F, -4.3F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F); // Box 92

		gun_0_Model[2][90].addShapeBox(-11.7F, -5.2F, -0.5F, 7, 1, 1, 0F,0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F, 0F, -0.28F, -0.28F); // Box 108

		gun_0_Model[2][91].addShapeBox(-2.1F, -5.5F, 0.1F, 1, 1, 1, 0F,-0.06F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.06F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F); // Box 92

		gun_0_Model[2][92].addShapeBox(-2.1F, -5.5F, -1.1F, 1, 1, 1, 0F,-0.06F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.06F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.05F, -0.2F, -0.4F); // Box 93

		gun_0_Model[2][93].addShapeBox(-9.8F, -4.3F, -0.55F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F, -0.3F, -0.3F, 0.25F); // Box 94

		gun_0_Model[2][94].addShapeBox(-9.9F, -4.3F, -1.4F, 1, 1, 1, 0F,-0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F); // Box 95

		gun_0_Model[2][95].addShapeBox(-10.9F, -4.3F, -1.4F, 1, 1, 1, 0F,0.2F, -0.88F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.88F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, 0.2F, -0.4F); // Box 96

		gun_0_Model[2][96].addShapeBox(-11.75F, -3.75F, -1.4F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 97

		gun_0_Model[2][97].addShapeBox(-11.75F, -3.75F, 0.3F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 98

		gun_0_Model[2][98].addShapeBox(-10.9F, -4.3F, 0.3F, 1, 1, 1, 0F,0.2F, -0.88F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.88F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, -0.38F, -0.4F, 0.2F, 0.2F, -0.4F); // Box 99

		gun_0_Model[2][99].addShapeBox(-9.9F, -4.3F, 0.3F, 1, 1, 1, 0F,-0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F, -0.2F, -0.38F, -0.4F); // Box 100

		gun_0_Model[2][100].addShapeBox(-8.6F, -4.45F, -0.9F, 1, 1, 1, 0F,0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F, -0.3F, -0.3F, -0.42F); // Box 101

		gun_0_Model[2][101].addShapeBox(-9.1F, -4.6F, -0.9F, 1, 1, 1, 0F,0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F, 0.1F, -0.3F, -0.42F); // Box 102

		gun_0_Model[2][102].addShapeBox(-11.8F, -3.68F, -1.1F, 1, 1, 2, 0F,-0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F); // Box 103

		gun_0_Model[2][103].addShapeBox(-11.8F, -3.88F, -1.1F, 1, 1, 2, 0F,-0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F); // Box 105

		gun_0_Model[2][104].addShapeBox(-11.1F, -5F, -0.2F, 1, 1, 1, 0F,0F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, -0.45F, 0F, 0F, -0.45F, -0.6F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.6F, -0.2F, -0.45F); // Box 106

		gun_0_Model[2][105].addShapeBox(-11.1F, -5F, -0.8F, 1, 1, 1, 0F,0F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, -0.45F, 0F, 0F, -0.45F, -0.6F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.6F, -0.2F, -0.45F); // Box 107

		gun_0_Model[2][106].addShapeBox(-11.5F, -5.7F, -0.8F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // Box 108

		gun_0_Model[2][107].addShapeBox(-11.5F, -5.7F, -0.2F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F); // Box 109

		gun_0_Model[2][108].addShapeBox(-8.4F, -6.5F, -0.2F, 1, 2, 1, 0F,-0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F); // Box 110

		gun_0_Model[2][109].addShapeBox(-8.4F, -6.5F, -0.8F, 1, 2, 1, 0F,-0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F, -0.45F); // Box 111

		gun_0_Model[2][110].addShapeBox(-8.4F, -6.9F, -0.8F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 112

		gun_0_Model[2][111].addShapeBox(-8.4F, -6.9F, -0.2F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 113

		gun_0_Model[2][112].addShapeBox(-8.4F, -9.5F, -0.2F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 114

		gun_0_Model[2][113].addShapeBox(-8.4F, -9.5F, -0.8F, 1, 4, 1, 0F,-0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F, -0.4F, -0.35F, -0.45F); // Box 115

		gun_0_Model[2][114].addShapeBox(-8.4F, -9.5F, -0.55F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F); // Box 116

		gun_0_Model[2][115].addShapeBox(-8.4F, -7.4F, -0.55F, 1, 1, 1, 0F,-0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F); // Box 117

		gun_0_Model[2][116].addShapeBox(-6.7F, -5.4F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, -0.5F, -0.2F, -0.45F, -0.64F, -0.2F, -0.45F, 0.02F, -0.4F, -0.45F, 0.02F, -0.4F, -0.45F, -0.64F, -0.2F, -0.45F); // Box 118

		gun_0_Model[2][117].addShapeBox(-6.8F, -6.4F, -1.1F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.4F, -0.4F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F); // Box 119

		gun_0_Model[2][118].addShapeBox(-6.45F, -4.35F, -1.1F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.45F, -0.32F, -0.3F, -0.45F, -0.32F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.76F, -0.25F, -0.45F, 0.05F, -0.4F, -0.45F, 0.05F, -0.4F, -0.45F, -0.76F, -0.25F, -0.45F); // Box 120

		gun_0_Model[2][119].addShapeBox(-6.8F, -5.4F, -1.1F, 1, 1, 1, 0F,-0.3F, 0.35F, -0.45F, -0.32F, 0.35F, -0.45F, -0.32F, 0.35F, -0.45F, -0.3F, 0.35F, -0.45F, -0.64F, 0.35F, -0.45F, 0.02F, 0.35F, -0.45F, 0.02F, 0.35F, -0.45F, -0.64F, 0.35F, -0.45F); // Box 121

		gun_0_Model[2][120].addShapeBox(-6.2F, -5.4F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.4F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.5F, -0.4F, -0.45F, -0.5F, -0.4F, -0.45F, 0.02F, -0.2F, -0.45F, 0.02F, -0.2F, -0.45F, -0.5F, -0.4F, -0.45F); // Box 122

		gun_0_Model[2][121].addShapeBox(-5.7F, -5.2F, -1.1F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.45F, -0.1F, -0.7F, -0.45F, -0.1F, -0.7F, -0.45F, -0.5F, -0.25F, -0.45F, -0.5F, -0.4F, -0.45F, -0.25F, -0.1F, -0.45F, -0.25F, -0.1F, -0.45F, -0.5F, -0.4F, -0.45F); // Box 123

		gun_0_Model[2][122].addShapeBox(-8.9F, -6.5F, 0.25F, 1, 2, 1, 0F,0.8F, -0.25F, -0.45F, -0.6F, -0.25F, -0.45F, -0.6F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, 0.8F, -0.25F, -0.45F, -0.4F, -0.25F, -0.45F); // Box 124

		gun_0_Model[2][123].addShapeBox(-9F, -4.75F, 0.25F, 5, 1, 1, 0F,0.8F, 0F, -0.45F, 1F, 0F, -0.45F, 1F, 0F, -0.45F, 0.8F, 0F, -0.45F, 0.8F, 0F, -0.45F, 1.8F, 0F, -0.45F, 1.8F, 0F, -0.45F, 0.8F, 0F, -0.45F); // Box 126

		gun_0_Model[2][124].addShapeBox(-9F, -3.95F, 0.25F, 5, 1, 1, 0F,0.8F, -0.2F, -0.45F, 1.8F, -0.2F, -0.45F, 1.8F, -0.2F, -0.45F, 0.8F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, 1.2F, -0.2F, -0.45F, 1.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F); // Box 127

		gun_0_Model[2][125].addShapeBox(-9.8F, -5.2F, 0.25F, 1, 1, 1, 0F,0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F, 0.1F, -0.35F, -0.35F); // Box 128

		gun_0_Model[2][126].addShapeBox(-9.8F, -6.8F, 0.25F, 1, 1, 1, 0F,0.2F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.3F, -0.42F, -0.35F, 0.2F, -0.42F, -0.35F); // Box 129

		gun_0_Model[2][127].addShapeBox(-9.5F, -4.2F, 0.4F, 1, 1, 1, 0F,0F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F, -0.1F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 130

		gun_0_Model[2][128].addShapeBox(-9F, -4F, 0.4F, 6, 1, 1, 0F,0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 131

		gun_0_Model[2][129].addShapeBox(-7.1F, -4.8F, 0.4F, 4, 1, 1, 0F,0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F); // Box 132

		gun_0_Model[2][130].addShapeBox(-7F, -4.35F, 0.6F, 1, 1, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.15F, -0.2F, -0.3F, -0.15F, -0.2F); // Box 133

		gun_0_Model[2][131].addShapeBox(-7.35F, -4.65F, 0.7F, 1, 1, 1, 0F,0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F); // Box 134

		gun_0_Model[2][132].addShapeBox(-7.8F, -4.35F, 0.75F, 1, 3, 1, 0F,-0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -0.45F, -0.25F, -0.35F, -1.45F, -0.25F, -0.35F, -1.45F, -0.25F, -0.35F, 0.55F, -0.25F, -0.35F, 0.55F); // Box 135

		gun_0_Model[2][133].addShapeBox(-8.8F, -4.1F, 0.7F, 1, 1, 1, 0F,-0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F, -0.35F, 0.7F, -0.35F); // Box 136

		gun_0_Model[2][134].addShapeBox(-8.8F, -2.8F, 0.7F, 1, 1, 1, 0F,-0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F); // Box 137

		gun_0_Model[2][135].addShapeBox(-8.8F, -4.1F, -0.2F, 1, 1, 2, 0F,-0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F); // Box 138

		gun_0_Model[2][136].addShapeBox(-5.9F, -5.05F, 1.75F, 3, 2, 4, 0F,0F, -1.2F, 0.3F, 0.2F, -1.2F, 0.3F, 0.2F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 1.1F, -0.2F, 0.2F, 1.1F, -0.2F, 0.2F, 0F, 0.35F, 0F, 0F, 0.35F); // Box 139

		gun_0_Model[2][137].addShapeBox(-5.9F, -6.05F, 1.3F, 3, 1, 4, 0F,0F, -1.3F, -0.7F, 0.2F, -1.3F, -0.7F, 0.2F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, 1.2F, -0.15F, 0.2F, 1.2F, -0.15F, 0.2F, -0.2F, 0.35F, 0F, -0.2F, 0.35F); // Box 140

		gun_0_Model[2][138].addShapeBox(-5.9F, -3.25F, 1.95F, 3, 1, 4, 0F,0F, -1.3F, 0F, 0.2F, -1.3F, 0F, 0.2F, -0.2F, 0.15F, 0F, -0.2F, 0.15F, 0F, 0.6F, -0.4F, 0.2F, 0.6F, -0.4F, 0.2F, -0.4F, -0.1F, 0F, -0.4F, 0.1F); // Box 141

		gun_0_Model[2][139].addShapeBox(-5.85F, -5.55F, 1.7F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 107

		gun_0_Model[2][140].addShapeBox(-5.85F, -5.4F, 1.7F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 16

		gun_0_Model[2][141].addShapeBox(-5.85F, -5.25F, 1.7F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 17

		gun_0_Model[2][142].addShapeBox(-4.55F, -5.55F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 18

		gun_0_Model[2][143].addShapeBox(-4.55F, -5.25F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 19

		gun_0_Model[2][144].addShapeBox(-4.55F, -5.4F, 1.7F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 20

		gun_0_Model[2][145].addShapeBox(-4.05F, -5.55F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 21

		gun_0_Model[2][146].addShapeBox(-4.05F, -5.25F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 22

		gun_0_Model[2][147].addShapeBox(-4.05F, -5.35F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 23

		gun_0_Model[2][148].addShapeBox(-3.8F, -5.55F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 24

		gun_0_Model[2][149].addShapeBox(-3.8F, -5.26F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 25

		gun_0_Model[2][150].addShapeBox(-3.8F, -5.46F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 26

		gun_0_Model[2][151].addShapeBox(-3.4F, -5.55F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 27

		gun_0_Model[2][152].addShapeBox(-3.4F, -5.46F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 28

		gun_0_Model[2][153].addShapeBox(-3.4F, -5.26F, 1.7F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 29

		gun_0_Model[2][154].addShapeBox(-5.85F, -5.85F, 1.25F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 159

		gun_0_Model[2][155].addShapeBox(-5.85F, -5.7F, 1.25F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 160

		gun_0_Model[2][156].addShapeBox(-5.85F, -5.55F, 1.25F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 161

		gun_0_Model[2][157].addShapeBox(-4.55F, -5.85F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 162

		gun_0_Model[2][158].addShapeBox(-4.55F, -5.55F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 163

		gun_0_Model[2][159].addShapeBox(-4.55F, -5.7F, 1.25F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 164

		gun_0_Model[2][160].addShapeBox(-4.05F, -5.85F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 165

		gun_0_Model[2][161].addShapeBox(-4.05F, -5.55F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 166

		gun_0_Model[2][162].addShapeBox(-4.05F, -5.65F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 167

		gun_0_Model[2][163].addShapeBox(-3.8F, -5.85F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 168

		gun_0_Model[2][164].addShapeBox(-3.8F, -5.56F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 169

		gun_0_Model[2][165].addShapeBox(-3.8F, -5.76F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 170

		gun_0_Model[2][166].addShapeBox(-3.4F, -5.85F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 171

		gun_0_Model[2][167].addShapeBox(-3.4F, -5.76F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 172

		gun_0_Model[2][168].addShapeBox(-3.4F, -5.56F, 1.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 173

		gun_0_Model[2][169].addShapeBox(-5.85F, -6.3F, 0.95F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 174

		gun_0_Model[2][170].addShapeBox(-5.85F, -6.15F, 0.95F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 175

		gun_0_Model[2][171].addShapeBox(-5.85F, -6F, 0.95F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 176

		gun_0_Model[2][172].addShapeBox(-4.55F, -6.3F, 0.95F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 177

		gun_0_Model[2][173].addShapeBox(-4.55F, -6F, 0.95F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 178

		gun_0_Model[2][174].addShapeBox(-4.55F, -6.15F, 0.95F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 179

		gun_0_Model[2][175].addShapeBox(-4.05F, -6.3F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 180

		gun_0_Model[2][176].addShapeBox(-4.05F, -6F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 181

		gun_0_Model[2][177].addShapeBox(-4.05F, -6.1F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 182

		gun_0_Model[2][178].addShapeBox(-3.8F, -6.3F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 183

		gun_0_Model[2][179].addShapeBox(-3.8F, -6.01F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 184

		gun_0_Model[2][180].addShapeBox(-3.8F, -6.21F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 185

		gun_0_Model[2][181].addShapeBox(-3.4F, -6.3F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 186

		gun_0_Model[2][182].addShapeBox(-3.4F, -6.21F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 187

		gun_0_Model[2][183].addShapeBox(-3.4F, -6.01F, 0.95F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 188

		gun_0_Model[2][184].addShapeBox(-5.85F, -6.3F, 0.4F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 189

		gun_0_Model[2][185].addShapeBox(-5.85F, -6.15F, 0.4F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 190

		gun_0_Model[2][186].addShapeBox(-5.85F, -6F, 0.4F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 191

		gun_0_Model[2][187].addShapeBox(-4.55F, -6.3F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 192

		gun_0_Model[2][188].addShapeBox(-4.55F, -6F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 193

		gun_0_Model[2][189].addShapeBox(-4.55F, -6.15F, 0.4F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 194

		gun_0_Model[2][190].addShapeBox(-4.05F, -6.3F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 195

		gun_0_Model[2][191].addShapeBox(-4.05F, -6F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 196

		gun_0_Model[2][192].addShapeBox(-4.05F, -6.1F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 197

		gun_0_Model[2][193].addShapeBox(-3.8F, -6.3F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 198

		gun_0_Model[2][194].addShapeBox(-3.8F, -6.01F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 199

		gun_0_Model[2][195].addShapeBox(-3.8F, -6.21F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 200

		gun_0_Model[2][196].addShapeBox(-3.4F, -6.3F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 201

		gun_0_Model[2][197].addShapeBox(-3.4F, -6.21F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 202

		gun_0_Model[2][198].addShapeBox(-3.4F, -6.01F, 0.4F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 203

		gun_0_Model[2][199].addShapeBox(-5.85F, -6.3F, -0.1F, 1, 1, 1, 0F,0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F, 0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F); // Box 204

		gun_0_Model[2][200].addShapeBox(-5.85F, -6.15F, -0.1F, 1, 1, 1, 0F,0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F, 0F, -0.45F, -0.23F, 0.6F, -0.45F, -0.25F, 0.6F, -0.45F, -0.25F, 0F, -0.45F, -0.23F); // Box 205

		gun_0_Model[2][201].addShapeBox(-5.85F, -6F, -0.1F, 1, 1, 1, 0F,0F, -0.4F, -0.23F, 0.6F, -0.4F, -0.25F, 0.6F, -0.4F, -0.25F, 0F, -0.4F, -0.23F, 0F, -0.4F, -0.38F, 0.6F, -0.42F, -0.4F, 0.6F, -0.42F, -0.4F, 0F, -0.4F, -0.38F); // Box 206

		gun_0_Model[2][202].addShapeBox(-4.55F, -6.3F, -0.1F, 1, 1, 1, 0F,-0.3F, -0.42F, -0.4F, -0.3F, -0.51F, -0.42F, -0.3F, -0.51F, -0.42F, -0.3F, -0.42F, -0.4F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F); // Box 207

		gun_0_Model[2][203].addShapeBox(-4.55F, -6F, -0.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.25F, -0.3F, -0.42F, -0.38F, -0.3F, -0.53F, -0.42F, -0.3F, -0.53F, -0.42F, -0.3F, -0.42F, -0.38F); // Box 208

		gun_0_Model[2][204].addShapeBox(-4.55F, -6.15F, -0.1F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.35F, -0.3F, -0.45F, -0.25F); // Box 209

		gun_0_Model[2][205].addShapeBox(-4.05F, -6.3F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.5F, -0.51F, -0.42F, -0.2F, -0.51F, -0.42F, -0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F); // Box 210

		gun_0_Model[2][206].addShapeBox(-4.05F, -6F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.5F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 211

		gun_0_Model[2][207].addShapeBox(-4.05F, -6.1F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.5F, -0.4F, -0.35F, -0.2F, -0.4F, -0.35F, -0.2F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F); // Box 212

		gun_0_Model[2][208].addShapeBox(-3.8F, -6.3F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 213

		gun_0_Model[2][209].addShapeBox(-3.8F, -6.01F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.4F, -0.52F, -0.43F, -0.2F, -0.52F, -0.43F); // Box 214

		gun_0_Model[2][210].addShapeBox(-3.8F, -6.21F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.4F, -0.51F, -0.36F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.4F, -0.4F, -0.36F, -0.2F, -0.4F, -0.36F); // Box 215

		gun_0_Model[2][211].addShapeBox(-3.4F, -6.3F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F, -0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 216

		gun_0_Model[2][212].addShapeBox(-3.4F, -6.21F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.51F, -0.36F, -0.3F, -0.55F, -0.48F, -0.3F, -0.55F, -0.48F, -0.2F, -0.51F, -0.36F, -0.2F, -0.4F, -0.36F, -0.3F, -0.44F, -0.48F, -0.3F, -0.44F, -0.48F, -0.2F, -0.4F, -0.36F); // Box 217

		gun_0_Model[2][213].addShapeBox(-3.4F, -6.01F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.36F, -0.3F, -0.36F, -0.48F, -0.3F, -0.36F, -0.48F, -0.2F, -0.4F, -0.36F, -0.2F, -0.52F, -0.43F, -0.3F, -0.63F, -0.48F, -0.3F, -0.63F, -0.48F, -0.2F, -0.52F, -0.43F); // Box 218

		gun_0_Model[2][214].addShapeBox(-5.35F, -4F, 0F, 1, 1, 2, 0F,0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F, 0.3F, -0.35F, -0.35F); // Box 219

		gun_0_Model[2][215].addShapeBox(13.4F, -6.4F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.15F, 0F, -0.1F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 220

		gun_0_Model[2][216].addShapeBox(13.4F, -7.4F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 221

		gun_0_Model[2][217].addShapeBox(13.4F, -7.75F, -0.25F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F); // Box 222

		gun_0_Model[2][218].addShapeBox(13.4F, -7.75F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F, -0.2F, -0.35F, -0.45F); // Box 223

		gun_0_Model[2][219].addShapeBox(13.4F, -8F, -0.25F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 224

		gun_0_Model[2][220].addShapeBox(13.4F, -8F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F, -0.2F, -0.4F, -0.45F); // Box 225

		gun_0_Model[2][221].addShapeBox(13.4F, -7.8F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F, -0.35F, -0.35F, -0.45F); // Box 226

		gun_0_Model[2][222].addShapeBox(-2.5F, -3.4F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F); // Box 229

		gun_0_Model[2][223].addShapeBox(-2.5F, -2.95F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.15F, -0.3F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F, -0.35F, -0.4F, 0.2F); // Box 232

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_0_Model[2])
		{
			gunPart.setRotationPoint(-34F, -34F, -13F);
		}


		registerGunModel("PassengerGun0", gun_0_Model);
	}
}