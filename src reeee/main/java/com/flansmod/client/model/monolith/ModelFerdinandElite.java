//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.05.2016 - 20:25:03
// Last changed on: 31.05.2016 - 20:25:03

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFerdinandElite extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelFerdinandElite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[94];
		barrelModel = new ModelRendererTurbo[12];
		leftTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackModel = new ModelRendererTurbo[14];
		rightTrackModel = new ModelRendererTurbo[14];

		initbodyModel_1();
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 114
		bodyModel[30] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 115
		bodyModel[31] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 116
		bodyModel[32] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 117
		bodyModel[33] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 118
		bodyModel[34] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 119
		bodyModel[35] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 120
		bodyModel[36] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 121
		bodyModel[37] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 122
		bodyModel[38] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 123
		bodyModel[39] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 124
		bodyModel[40] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 125
		bodyModel[41] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 126
		bodyModel[42] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 127
		bodyModel[43] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 128
		bodyModel[44] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 129
		bodyModel[45] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 130
		bodyModel[46] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 131
		bodyModel[47] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 132
		bodyModel[48] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 133
		bodyModel[49] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 134
		bodyModel[50] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 135
		bodyModel[51] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 136
		bodyModel[52] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 137
		bodyModel[53] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 138
		bodyModel[54] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 139
		bodyModel[55] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 140
		bodyModel[56] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 141
		bodyModel[57] = new ModelRendererTurbo(this, 465, 233, textureX, textureY); // Box 142
		bodyModel[58] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 143
		bodyModel[59] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 208
		bodyModel[60] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 209
		bodyModel[61] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Box 210
		bodyModel[62] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 211
		bodyModel[63] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 212
		bodyModel[64] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 213
		bodyModel[65] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 214
		bodyModel[66] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 215
		bodyModel[67] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 216
		bodyModel[68] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 217
		bodyModel[69] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 218
		bodyModel[70] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 219
		bodyModel[71] = new ModelRendererTurbo(this, 17, 257, textureX, textureY); // Box 232
		bodyModel[72] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 233
		bodyModel[73] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 234
		bodyModel[74] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 235
		bodyModel[75] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 236
		bodyModel[76] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 237
		bodyModel[77] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 238
		bodyModel[78] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 239
		bodyModel[79] = new ModelRendererTurbo(this, 441, 289, textureX, textureY); // Box 240
		bodyModel[80] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Box 241
		bodyModel[81] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Box 242
		bodyModel[82] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 243
		bodyModel[83] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 244
		bodyModel[84] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 245
		bodyModel[85] = new ModelRendererTurbo(this, 433, 257, textureX, textureY); // Box 246
		bodyModel[86] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Box 247
		bodyModel[87] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 248
		bodyModel[88] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 249
		bodyModel[89] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 250
		bodyModel[90] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Box 251
		bodyModel[91] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 252
		bodyModel[92] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 253
		bodyModel[93] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 254

		bodyModel[0].addBox(0F, 0F, 0F, 73, 12, 55, 0F); // Box 2
		bodyModel[0].setRotationPoint(-38F, -21.6F, -27.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 101, 12, 35, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-56.99F, -13.6F, -17.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 12, 55, 0F,0F, 0F, 0F, 0.5F, 0F, -8.75F, 0.5F, 0F, -8.75F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7F, -6F, -9.8F, 1.7F, -6F, -9.8F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(34.99F, -21.6F, -27.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-56.99F, -1.6F, -17.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 94, 4, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-50F, -1.6F, -17.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 18, 35, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(44F, -15.6F, -17.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 8, 35, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(54F, -13.6F, -17.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 8, 35, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 2F, 0F, 0F); // Box 10
		bodyModel[7].setRotationPoint(54.01F, -5.61F, -17.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 38, 0F,0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, -2F, 2F, 0.5F, -2F, 0F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(43.5F, -22.2F, -19F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 14, 0F,1F, 0F, -1.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 1F, 0F, -1.5F, 0F, 0F, -2F, 0.3F, 0F, -3.2F, 0F, 0F, -2.5F, 1F, 0.5F, -1F); // Box 12
		bodyModel[9].setRotationPoint(46.5F, -22.2F, -19F);

		bodyModel[10].addShapeBox(0F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 15
		bodyModel[10].setRotationPoint(45.2F, -18.3F, -12.2F);

		bodyModel[11].addShapeBox(5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F); // Box 16
		bodyModel[11].setRotationPoint(45.2F, -18.3F, -12.2F);

		bodyModel[12].addShapeBox(6F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F); // Box 17
		bodyModel[12].setRotationPoint(45.2F, -18.3F, -12.2F);

		bodyModel[13].addBox(0F, 0F, 0F, 73, 1, 14, 0F); // Box 18
		bodyModel[13].setRotationPoint(-37.5F, -10F, 17F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(-51.51F, -13.5F, 17F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(-59.5F, -13.5F, 17F);

		bodyModel[16].addBox(0F, 0F, 0F, 73, 1, 14, 0F); // Box 22
		bodyModel[16].setRotationPoint(-37.5F, -10F, -31F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[17].setRotationPoint(-51.51F, -13.5F, -31F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[18].setRotationPoint(-59.5F, -13.5F, -31F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[19].setRotationPoint(35.51F, -10F, 17F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[20].setRotationPoint(44.5F, -15.5F, 17F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[21].setRotationPoint(57.51F, -15.5F, 17F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(35.51F, -10F, -31F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[23].setRotationPoint(44.5F, -15.5F, -31F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(57.51F, -15.5F, -31F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 32
		bodyModel[25].setRotationPoint(57.51F, -15.5F, 17F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 33
		bodyModel[26].setRotationPoint(57.51F, -15.5F, -18F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(44.5F, -15.5F, 17F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[28].setRotationPoint(44.5F, -15.5F, -18F);

		bodyModel[29].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[29].setRotationPoint(-27.61F, 2.3F, -19F);

		bodyModel[30].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 115
		bodyModel[30].setRotationPoint(-27.61F, -0.71F, -19F);

		bodyModel[31].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[31].setRotationPoint(-30.61F, 0.5F, -20.5F);
		bodyModel[31].rotateAngleZ = 0.2443461F;

		bodyModel[32].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[32].setRotationPoint(-33.61F, 5.5F, -20.5F);

		bodyModel[33].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[33].setRotationPoint(-34.61F, 2.5F, -20.5F);

		bodyModel[34].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[34].setRotationPoint(-4.61F, 2.5F, -20.5F);

		bodyModel[35].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[35].setRotationPoint(-0.609999999999999F, 0.5F, -20.5F);
		bodyModel[35].rotateAngleZ = 0.2443461F;

		bodyModel[36].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[36].setRotationPoint(2.39F, 2.3F, -19F);

		bodyModel[37].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[37].setRotationPoint(-3.61F, 5.5F, -20.5F);

		bodyModel[38].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 123
		bodyModel[38].setRotationPoint(2.39F, -0.71F, -19F);

		bodyModel[39].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[39].setRotationPoint(26.39F, 2.5F, -20.5F);

		bodyModel[40].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[40].setRotationPoint(30.39F, 0.5F, -20.5F);
		bodyModel[40].rotateAngleZ = 0.2443461F;

		bodyModel[41].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[41].setRotationPoint(33.39F, 2.3F, -19F);

		bodyModel[42].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[42].setRotationPoint(27.39F, 5.5F, -20.5F);

		bodyModel[43].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 128
		bodyModel[43].setRotationPoint(33.39F, -0.71F, -19F);

		bodyModel[44].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[44].setRotationPoint(26.39F, 2.5F, 18.5F);

		bodyModel[45].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[45].setRotationPoint(30.39F, 0.5F, 18.5F);
		bodyModel[45].rotateAngleZ = 0.2443461F;

		bodyModel[46].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[46].setRotationPoint(33.39F, 2.3F, 17F);

		bodyModel[47].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[47].setRotationPoint(27.39F, 5.5F, 18.5F);

		bodyModel[48].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 133
		bodyModel[48].setRotationPoint(33.39F, -0.71F, 17F);

		bodyModel[49].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[49].setRotationPoint(-27.61F, 2.3F, 17F);

		bodyModel[50].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 135
		bodyModel[50].setRotationPoint(-27.61F, -0.71F, 17F);

		bodyModel[51].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[51].setRotationPoint(-30.61F, 0.5F, 18.5F);
		bodyModel[51].rotateAngleZ = 0.2443461F;

		bodyModel[52].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[52].setRotationPoint(-33.61F, 5.5F, 18.5F);

		bodyModel[53].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[53].setRotationPoint(-34.61F, 2.5F, 18.5F);

		bodyModel[54].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[54].setRotationPoint(-4.61F, 2.5F, 18.5F);

		bodyModel[55].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[55].setRotationPoint(-0.609999999999999F, 0.5F, 18.5F);
		bodyModel[55].rotateAngleZ = 0.2443461F;

		bodyModel[56].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[56].setRotationPoint(2.39F, 2.3F, 17F);

		bodyModel[57].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[57].setRotationPoint(-3.61F, 5.5F, 18.5F);

		bodyModel[58].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 143
		bodyModel[58].setRotationPoint(2.39F, -0.71F, 17F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 13, 12, 55, 0F,0F, 0F, 0F, 0.51F, 0F, 0F, 0.51F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.51F, 0F, 0F, 0.51F, 0F, 0F, 0F, -4F, 0F); // Box 208
		bodyModel[59].setRotationPoint(-51.5F, -21.6F, -27.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 8, 55, 0F,6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[60].setRotationPoint(-58.51F, -21.6F, -27.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 56, 23, 37, 0F,0F, 0F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, 0F, 0F, 6.5F, -0.5F, 9F, 6F, -0.5F, 9F, 6F, -0.5F, 9F, 6.5F, -0.5F, 9F); // Box 210
		bodyModel[61].setRotationPoint(-58.51F, -44.1F, -18.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F); // Box 211
		bodyModel[62].setRotationPoint(-3F, -40.5F, -5F);
		bodyModel[62].rotateAngleZ = 0.33161256F;

		bodyModel[63].addShapeBox(0F, 5F, 0F, 1, 7, 10, 0F,0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F); // Box 212
		bodyModel[63].setRotationPoint(-3F, -40.5F, -5F);
		bodyModel[63].rotateAngleZ = 0.33161256F;

		bodyModel[64].addShapeBox(0F, 12F, 0F, 1, 5, 10, 0F,0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 213
		bodyModel[64].setRotationPoint(-3F, -40.5F, -5F);
		bodyModel[64].rotateAngleZ = 0.33161256F;

		bodyModel[65].addShapeBox(0F, 5F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[65].setRotationPoint(-1F, -39.5F, -4.5F);

		bodyModel[66].addShapeBox(0F, 5F, 0F, 2, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[66].setRotationPoint(-1F, -42.5F, -5F);

		bodyModel[67].addShapeBox(0F, 5F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 216
		bodyModel[67].setRotationPoint(-1F, -36.5F, -4.5F);

		bodyModel[68].addShapeBox(0F, 5F, 0F, 2, 3, 10, 0F,0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -3F); // Box 217
		bodyModel[68].setRotationPoint(1F, -34.5F, -5F);

		bodyModel[69].addShapeBox(0F, 5F, 0F, 2, 5, 10, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F); // Box 218
		bodyModel[69].setRotationPoint(1F, -39.5F, -5F);

		bodyModel[70].addShapeBox(0F, 5F, 0F, 2, 3, 10, 0F,0F, 0F, -3F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F); // Box 219
		bodyModel[70].setRotationPoint(1F, -42.5F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[71].setRotationPoint(31.99F, -22.5F, -15.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[72].setRotationPoint(31.99F, -22.5F, 4.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[73].setRotationPoint(37.5F, -24.5F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.78F, -2F, 0F, 0.78F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.78F, -2F, 0F, 0.78F); // Box 235
		bodyModel[74].setRotationPoint(35.5F, -24.5F, 5.3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2F, 0F, 0.78F, 2F, 0F, 0.78F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.78F, 2F, 0F, 0.78F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[75].setRotationPoint(35.5F, -24.5F, 12.8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[76].setRotationPoint(11.99F, -23F, -6.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 238
		bodyModel[77].setRotationPoint(10.98F, -23F, -6.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 239
		bodyModel[78].setRotationPoint(28F, -23F, -6.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 9, 25, 0F,0F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, -6F, 3F, 0F, -6F, 3F, 0F, 2F, 0F, 0F); // Box 240
		bodyModel[79].setRotationPoint(-63.99F, -20.6F, -12.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 3, 15, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[80].setRotationPoint(4.98F, -24F, -7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[81].setRotationPoint(4.98F, -24F, -18.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[82].setRotationPoint(4.98F, -24F, 9.5F);

		bodyModel[83].addShapeBox(0F, 0.5F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[83].setRotationPoint(-53.51F, -45.1F, -14.5F);
		bodyModel[83].rotateAngleZ = -0.06108652F;

		bodyModel[84].addShapeBox(0F, 0.5F, 0F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[84].setRotationPoint(-53.51F, -45.1F, 9.5F);
		bodyModel[84].rotateAngleZ = -0.06108652F;

		bodyModel[85].addShapeBox(11.5F, 0.5F, -6.5F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[85].setRotationPoint(-53.51F, -45.1F, 9.5F);
		bodyModel[85].rotateAngleZ = -0.06108652F;

		bodyModel[86].addShapeBox(7.5F, 0.5F, -6.5F, 4, 2, 12, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 247
		bodyModel[86].setRotationPoint(-53.51F, -45.1F, 9.5F);
		bodyModel[86].rotateAngleZ = -0.06108652F;

		bodyModel[87].addShapeBox(15.5F, 0.5F, -6.5F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 248
		bodyModel[87].setRotationPoint(-53.51F, -45.1F, 9.5F);
		bodyModel[87].rotateAngleZ = -0.06108652F;

		bodyModel[88].addShapeBox(25F, 1F, -26.5F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[88].setRotationPoint(-53.51F, -45.1F, 9.5F);
		bodyModel[88].rotateAngleZ = -0.06108652F;

		bodyModel[89].addShapeBox(33F, 1F, -26.5F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 250
		bodyModel[89].setRotationPoint(-53.51F, -45.1F, 9.5F);
		bodyModel[89].rotateAngleZ = -0.06108652F;

		bodyModel[90].addShapeBox(23F, 1F, -26.5F, 2, 2, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 251
		bodyModel[90].setRotationPoint(-53.51F, -45.1F, 9.5F);
		bodyModel[90].rotateAngleZ = -0.06108652F;

		bodyModel[91].addShapeBox(48F, -3F, -26.5F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[91].setRotationPoint(-53.51F, -45.1F, 52.5F);
		bodyModel[91].rotateAngleY = -0.78539816F;
		bodyModel[91].rotateAngleZ = -0.06108652F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 116, 116, 1, 0F,0F, 0F, 0F, -100F, 0F, 0F, -100F, 0F, 0F, 0F, 0F, 0F, 0F, -100F, 0F, -100F, -100F, 0F, -100F, -100F, 0F, 0F, -100F, 0F); // Box 253
		bodyModel[92].setRotationPoint(-37.51F, -38.1F, 19.8F);
		bodyModel[92].rotateAngleX = 0.41887902F;
		bodyModel[92].rotateAngleY = -0.01745329F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 116, 116, 1, 0F,0F, 0F, 0F, -100F, 0F, 0F, -100F, 0F, 0F, 0F, 0F, 0F, 0F, -100F, 0F, -100F, -100F, 0F, -100F, -100F, 0F, 0F, -100F, 0F); // Box 254
		bodyModel[93].setRotationPoint(-37.51F, -38.1F, -21.5F);
		bodyModel[93].rotateAngleX = -0.41887902F;
		bodyModel[93].rotateAngleY = 0.01745329F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 220
		barrelModel[1] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 221
		barrelModel[2] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 222
		barrelModel[3] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 223
		barrelModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 224
		barrelModel[5] = new ModelRendererTurbo(this, 457, 241, textureX, textureY); // Box 225
		barrelModel[6] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 226
		barrelModel[7] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Box 227
		barrelModel[8] = new ModelRendererTurbo(this, 137, 305, textureX, textureY); // Box 228
		barrelModel[9] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 229
		barrelModel[10] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 230
		barrelModel[11] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 231

		barrelModel[0].addShapeBox(0.99F, -3F, -2.5F, 7, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		barrelModel[0].setRotationPoint(0F, -32F, 0F);

		barrelModel[1].addShapeBox(7.5F, -7.2F, -4.5F, 1, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		barrelModel[1].setRotationPoint(0F, -32F, 0F);

		barrelModel[2].addShapeBox(7.5F, -7.2F, 4.49F, 1, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 222
		barrelModel[2].setRotationPoint(0F, -32F, 0F);

		barrelModel[3].addShapeBox(7.5F, -7.2F, -7.51F, 1, 13, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		barrelModel[3].setRotationPoint(0F, -32F, 0F);

		barrelModel[4].addShapeBox(8F, -6.7F, -0.5F, 2, 12, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 224
		barrelModel[4].setRotationPoint(0F, -32F, 0F);

		barrelModel[5].addShapeBox(8F, -0.4F, -7.5F, 2, 1, 15, 0F,0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, 0F); // Box 225
		barrelModel[5].setRotationPoint(0F, -32F, 0F);

		barrelModel[6].addShapeBox(8F, -3.3F, -3.5F, 3, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		barrelModel[6].setRotationPoint(0F, -32F, 0F);

		barrelModel[7].addShapeBox(10.99F, -3.3F, -3.5F, 1, 7, 7, 0F,0F, 0F, 0F, 0.3F, -1.3F, -1.3F, 0.3F, -1.3F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -1.3F, -1.3F, 0.3F, -1.3F, -1.3F, 0F, 0F, 0F); // Box 227
		barrelModel[7].setRotationPoint(0F, -32F, 0F);

		barrelModel[8].addShapeBox(10.99F, -1.8F, -2F, 62, 4, 4, 0F,0F, -0.2F, -0.2F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.2F, -0.2F); // Box 228
		barrelModel[8].setRotationPoint(0F, -32F, 0F);

		barrelModel[9].addShapeBox(73.01F, -1.8F, -2F, 4, 4, 4, 0F,0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F); // Box 229
		barrelModel[9].setRotationPoint(0F, -32F, 0F);

		barrelModel[10].addShapeBox(77.01F, -1.8F, -2F, 2, 4, 4, 0F,0F, -0.2F, -0.2F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, -0.2F, -0.2F); // Box 230
		barrelModel[10].setRotationPoint(0F, -32F, 0F);

		barrelModel[11].addShapeBox(79.01F, -1.8F, -2F, 5, 4, 4, 0F,0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F); // Box 231
		barrelModel[11].setRotationPoint(0F, -32F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 84
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 85
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 86
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 87
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 88
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 89
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 90
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 91
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 92
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 93
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 94
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 95
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 96
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 97
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 98
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 99
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 100
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 101
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 108
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 109
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 110
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 111
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 112
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 113

		leftTrackWheelModels[0].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		leftTrackWheelModels[0].setRotationPoint(-37.61F, 3.3F, 21.5F);

		leftTrackWheelModels[1].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftTrackWheelModels[1].setRotationPoint(-37.61F, 3.3F, 21.5F);

		leftTrackWheelModels[2].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 86
		leftTrackWheelModels[2].setRotationPoint(-37.61F, 3.3F, 21.5F);

		leftTrackWheelModels[3].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 87
		leftTrackWheelModels[3].setRotationPoint(-23.61F, 3.3F, 21.5F);

		leftTrackWheelModels[4].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		leftTrackWheelModels[4].setRotationPoint(-23.61F, 3.3F, 21.5F);

		leftTrackWheelModels[5].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftTrackWheelModels[5].setRotationPoint(-23.61F, 3.3F, 21.5F);

		leftTrackWheelModels[6].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 90
		leftTrackWheelModels[6].setRotationPoint(7.39F, 3.3F, 21.5F);

		leftTrackWheelModels[7].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		leftTrackWheelModels[7].setRotationPoint(7.39F, 3.3F, 21.5F);

		leftTrackWheelModels[8].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftTrackWheelModels[8].setRotationPoint(7.39F, 3.3F, 21.5F);

		leftTrackWheelModels[9].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 93
		leftTrackWheelModels[9].setRotationPoint(-6.61F, 3.3F, 21.5F);

		leftTrackWheelModels[10].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftTrackWheelModels[10].setRotationPoint(-6.61F, 3.3F, 21.5F);

		leftTrackWheelModels[11].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftTrackWheelModels[11].setRotationPoint(-6.61F, 3.3F, 21.5F);

		leftTrackWheelModels[12].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 96
		leftTrackWheelModels[12].setRotationPoint(37.5F, 3.3F, 21.5F);

		leftTrackWheelModels[13].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftTrackWheelModels[13].setRotationPoint(37.5F, 3.3F, 21.5F);

		leftTrackWheelModels[14].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		leftTrackWheelModels[14].setRotationPoint(37.5F, 3.3F, 21.5F);

		leftTrackWheelModels[15].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 99
		leftTrackWheelModels[15].setRotationPoint(23.5F, 3.3F, 21.5F);

		leftTrackWheelModels[16].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftTrackWheelModels[16].setRotationPoint(23.5F, 3.3F, 21.5F);

		leftTrackWheelModels[17].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		leftTrackWheelModels[17].setRotationPoint(23.5F, 3.3F, 21.5F);

		leftTrackWheelModels[18].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 108
		leftTrackWheelModels[18].setRotationPoint(53.5F, -4.3F, 21.5F);

		leftTrackWheelModels[19].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 109
		leftTrackWheelModels[19].setRotationPoint(53.5F, -4.3F, 21.5F);

		leftTrackWheelModels[20].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 110
		leftTrackWheelModels[20].setRotationPoint(53.5F, -4.3F, 21.5F);

		leftTrackWheelModels[21].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 111
		leftTrackWheelModels[21].setRotationPoint(-52F, -2.3F, 21.5F);

		leftTrackWheelModels[22].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 112
		leftTrackWheelModels[22].setRotationPoint(-52F, -2.3F, 21.5F);

		leftTrackWheelModels[23].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 113
		leftTrackWheelModels[23].setRotationPoint(-52F, -2.3F, 21.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 66
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 67
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 68
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 69
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 70
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 71
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 72
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 73
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 74
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 75
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 76
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 77
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 78
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 79
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 80
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 81
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 82
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 83
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 102
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 103
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 104
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 105
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 106
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 107

		rightTrackWheelModels[0].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightTrackWheelModels[0].setRotationPoint(-37.61F, 3.3F, -27.5F);

		rightTrackWheelModels[1].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rightTrackWheelModels[1].setRotationPoint(-37.61F, 3.3F, -27.5F);

		rightTrackWheelModels[2].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 68
		rightTrackWheelModels[2].setRotationPoint(-37.61F, 3.3F, -27.5F);

		rightTrackWheelModels[3].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 69
		rightTrackWheelModels[3].setRotationPoint(-23.61F, 3.3F, -27.5F);

		rightTrackWheelModels[4].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightTrackWheelModels[4].setRotationPoint(-23.61F, 3.3F, -27.5F);

		rightTrackWheelModels[5].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightTrackWheelModels[5].setRotationPoint(-23.61F, 3.3F, -27.5F);

		rightTrackWheelModels[6].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 72
		rightTrackWheelModels[6].setRotationPoint(7.39F, 3.3F, -27.5F);

		rightTrackWheelModels[7].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightTrackWheelModels[7].setRotationPoint(7.39F, 3.3F, -27.5F);

		rightTrackWheelModels[8].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightTrackWheelModels[8].setRotationPoint(7.39F, 3.3F, -27.5F);

		rightTrackWheelModels[9].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 75
		rightTrackWheelModels[9].setRotationPoint(-6.61F, 3.3F, -27.5F);

		rightTrackWheelModels[10].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		rightTrackWheelModels[10].setRotationPoint(-6.61F, 3.3F, -27.5F);

		rightTrackWheelModels[11].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		rightTrackWheelModels[11].setRotationPoint(-6.61F, 3.3F, -27.5F);

		rightTrackWheelModels[12].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 78
		rightTrackWheelModels[12].setRotationPoint(37.5F, 3.3F, -27.5F);

		rightTrackWheelModels[13].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 79
		rightTrackWheelModels[13].setRotationPoint(53.5F, -4.3F, -27.5F);

		rightTrackWheelModels[14].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		rightTrackWheelModels[14].setRotationPoint(37.5F, 3.3F, -27.5F);

		rightTrackWheelModels[15].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 81
		rightTrackWheelModels[15].setRotationPoint(23.5F, 3.3F, -27.5F);

		rightTrackWheelModels[16].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		rightTrackWheelModels[16].setRotationPoint(23.5F, 3.3F, -27.5F);

		rightTrackWheelModels[17].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		rightTrackWheelModels[17].setRotationPoint(23.5F, 3.3F, -27.5F);

		rightTrackWheelModels[18].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightTrackWheelModels[18].setRotationPoint(37.5F, 3.3F, -27.5F);

		rightTrackWheelModels[19].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 103
		rightTrackWheelModels[19].setRotationPoint(53.5F, -4.3F, -27.5F);

		rightTrackWheelModels[20].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 104
		rightTrackWheelModels[20].setRotationPoint(53.5F, -4.3F, -27.5F);

		rightTrackWheelModels[21].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 105
		rightTrackWheelModels[21].setRotationPoint(-52F, -2.3F, -27.5F);

		rightTrackWheelModels[22].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 106
		rightTrackWheelModels[22].setRotationPoint(-52F, -2.3F, -27.5F);

		rightTrackWheelModels[23].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 107
		rightTrackWheelModels[23].setRotationPoint(-52F, -2.3F, -27.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Box 38
		leftTrackModel[1] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 39
		leftTrackModel[2] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 40
		leftTrackModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 41
		leftTrackModel[4] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 42
		leftTrackModel[5] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 43
		leftTrackModel[6] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 44
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 45
		leftTrackModel[8] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 46
		leftTrackModel[9] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 47
		leftTrackModel[10] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 48
		leftTrackModel[11] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 49
		leftTrackModel[12] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 50
		leftTrackModel[13] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 51

		leftTrackModel[0].addBox(0F, 0F, 0F, 68, 1, 11, 0F); // Box 38
		leftTrackModel[0].setRotationPoint(-34.5F, -8.5F, 18.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 39
		leftTrackModel[1].setRotationPoint(-52.5F, -10.5F, 18.5F);
		leftTrackModel[1].rotateAngleZ = -0.10995574F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackModel[2].setRotationPoint(-56.5F, -9F, 18.5F);
		leftTrackModel[2].rotateAngleZ = 0.3577925F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackModel[3].setRotationPoint(-59.5F, -5F, 18.5F);
		leftTrackModel[3].rotateAngleZ = 0.92676983F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftTrackModel[4].setRotationPoint(-60F, 1F, 18.5F);
		leftTrackModel[4].rotateAngleZ = 1.48527519F;

		leftTrackModel[5].addShapeBox(0F, -1F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftTrackModel[5].setRotationPoint(-60F, 1F, 18.5F);
		leftTrackModel[5].rotateAngleZ = -0.75049158F;

		leftTrackModel[6].addShapeBox(0F, -1F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftTrackModel[6].setRotationPoint(-55.61F, 5.1F, 18.5F);
		leftTrackModel[6].rotateAngleZ = -0.29670597F;

		leftTrackModel[7].addShapeBox(0F, -1F, 0F, 78, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftTrackModel[7].setRotationPoint(-38.61F, 10.3F, 18.5F);

		leftTrackModel[8].addShapeBox(0F, -1F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackModel[8].setRotationPoint(39.4F, 10.3F, 18.5F);
		leftTrackModel[8].rotateAngleZ = 0.41887902F;

		leftTrackModel[9].addShapeBox(0F, -1F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftTrackModel[9].setRotationPoint(57.6F, 2.2F, 18.5F);
		leftTrackModel[9].rotateAngleZ = 0.82030475F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 21, 1, 11, 0F); // Box 48
		leftTrackModel[10].setRotationPoint(33.5F, -8.5F, 18.5F);
		leftTrackModel[10].rotateAngleZ = 0.19198622F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 49
		leftTrackModel[11].setRotationPoint(54.1F, -12.5F, 18.5F);
		leftTrackModel[11].rotateAngleZ = -0.34906585F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 5, 1, 11, 0F); // Box 50
		leftTrackModel[12].setRotationPoint(57.8F, -11.2F, 18.5F);
		leftTrackModel[12].rotateAngleZ = -0.87266463F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftTrackModel[13].setRotationPoint(61F, -7.4F, 18.5F);
		leftTrackModel[13].rotateAngleZ = -1.569051F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 52
		rightTrackModel[1] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 53
		rightTrackModel[2] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 54
		rightTrackModel[3] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 55
		rightTrackModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 56
		rightTrackModel[5] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 57
		rightTrackModel[6] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 58
		rightTrackModel[7] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 59
		rightTrackModel[8] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 60
		rightTrackModel[9] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 61
		rightTrackModel[10] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 62
		rightTrackModel[11] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 63
		rightTrackModel[12] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 64
		rightTrackModel[13] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 65

		rightTrackModel[0].addBox(0F, 0F, 0F, 68, 1, 11, 0F); // Box 52
		rightTrackModel[0].setRotationPoint(-34.5F, -8.5F, -29.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightTrackModel[1].setRotationPoint(-52.5F, -10.5F, -29.5F);
		rightTrackModel[1].rotateAngleZ = -0.10995574F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightTrackModel[2].setRotationPoint(-56.5F, -9F, -29.5F);
		rightTrackModel[2].rotateAngleZ = 0.3577925F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightTrackModel[3].setRotationPoint(-59.5F, -5F, -29.5F);
		rightTrackModel[3].rotateAngleZ = 0.92676983F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightTrackModel[4].setRotationPoint(-60F, 1F, -29.5F);
		rightTrackModel[4].rotateAngleZ = 1.48527519F;

		rightTrackModel[5].addShapeBox(0F, -1F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		rightTrackModel[5].setRotationPoint(-60F, 1F, -29.5F);
		rightTrackModel[5].rotateAngleZ = -0.75049158F;

		rightTrackModel[6].addShapeBox(0F, -1F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightTrackModel[6].setRotationPoint(-55.61F, 5.1F, -29.5F);
		rightTrackModel[6].rotateAngleZ = -0.29670597F;

		rightTrackModel[7].addShapeBox(0F, -1F, 0F, 78, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightTrackModel[7].setRotationPoint(-38.61F, 10.3F, -29.5F);

		rightTrackModel[8].addShapeBox(0F, -1F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		rightTrackModel[8].setRotationPoint(39.4F, 10.3F, -29.5F);
		rightTrackModel[8].rotateAngleZ = 0.41887902F;

		rightTrackModel[9].addShapeBox(0F, -1F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightTrackModel[9].setRotationPoint(57.6F, 2.2F, -29.5F);
		rightTrackModel[9].rotateAngleZ = 0.82030475F;

		rightTrackModel[10].addBox(0F, 0F, 0F, 21, 1, 11, 0F); // Box 62
		rightTrackModel[10].setRotationPoint(33.5F, -8.5F, -29.5F);
		rightTrackModel[10].rotateAngleZ = 0.19198622F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 63
		rightTrackModel[11].setRotationPoint(54.1F, -12.5F, -29.5F);
		rightTrackModel[11].rotateAngleZ = -0.34906585F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 5, 1, 11, 0F); // Box 64
		rightTrackModel[12].setRotationPoint(57.8F, -11.2F, -29.5F);
		rightTrackModel[12].rotateAngleZ = -0.87266463F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightTrackModel[13].setRotationPoint(61F, -7.4F, -29.5F);
		rightTrackModel[13].rotateAngleZ = -1.569051F;
	}
}