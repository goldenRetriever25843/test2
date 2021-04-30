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

public class ModelPorscheElite extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPorscheElite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[76];
		turretModel = new ModelRendererTurbo[36];
		barrelModel = new ModelRendererTurbo[20];
		leftTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackModel = new ModelRendererTurbo[14];
		rightTrackModel = new ModelRendererTurbo[14];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 114
		bodyModel[37] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 115
		bodyModel[38] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 116
		bodyModel[39] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 117
		bodyModel[40] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 118
		bodyModel[41] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 119
		bodyModel[42] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 120
		bodyModel[43] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 121
		bodyModel[44] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 122
		bodyModel[45] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 123
		bodyModel[46] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 124
		bodyModel[47] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 125
		bodyModel[48] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 126
		bodyModel[49] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 127
		bodyModel[50] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 129
		bodyModel[52] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 130
		bodyModel[53] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 131
		bodyModel[54] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 132
		bodyModel[55] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 133
		bodyModel[56] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 134
		bodyModel[57] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 135
		bodyModel[58] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 136
		bodyModel[59] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 137
		bodyModel[60] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 138
		bodyModel[61] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 139
		bodyModel[62] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 140
		bodyModel[63] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 141
		bodyModel[64] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 142
		bodyModel[65] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 143
		bodyModel[66] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Box 199
		bodyModel[67] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 200
		bodyModel[68] = new ModelRendererTurbo(this, 481, 289, textureX, textureY); // Box 201
		bodyModel[69] = new ModelRendererTurbo(this, 425, 369, textureX, textureY); // Box 202
		bodyModel[70] = new ModelRendererTurbo(this, 425, 369, textureX, textureY); // Box 203
		bodyModel[71] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Box 204
		bodyModel[72] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 205
		bodyModel[73] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 206
		bodyModel[74] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 207
		bodyModel[75] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 208

		bodyModel[0].addBox(0F, 0F, 0F, 70, 12, 55, 0F); // Box 2
		bodyModel[0].setRotationPoint(-53F, -21.6F, -27.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 101, 12, 35, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-74.99F, -13.6F, -17.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 22, 8, 35, 0F,0F, -8F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 4F, 10F, 0F, 4F, 10F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-74.99F, -21.59F, -17.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 12, 55, 0F,0F, 0F, 0F, 0.5F, 0F, -8.75F, 0.5F, 0F, -8.75F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7F, -6F, -9.8F, 1.7F, -6F, -9.8F, 0F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(16.99F, -21.6F, -27.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 4, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-74.99F, -1.6F, -17.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 94, 4, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-68F, -1.6F, -17.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 18, 35, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(26F, -15.6F, -17.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 8, 35, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F); // Box 9
		bodyModel[7].setRotationPoint(36F, -13.6F, -17.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 8, 35, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 2F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(36.01F, -5.61F, -17.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 38, 0F,0F, 0F, 0F, 1F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, -2F, 2F, 0.5F, -2F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(25.5F, -22.2F, -19F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 14, 0F,1F, 0F, -1.5F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 1F, 0F, -1.5F, 0F, 0F, -2F, 0.3F, 0F, -3.2F, 0F, 0F, -2.5F, 1F, 0.5F, -1F); // Box 12
		bodyModel[10].setRotationPoint(28.5F, -22.2F, -19F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0.5F, 0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.5F, 0.4F, 0F, -0.4F, 1F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0F, -0.4F, 1F); // Box 13
		bodyModel[11].setRotationPoint(27.5F, -19.6F, 7.8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(27.5F, -18.6F, 8.3F);

		bodyModel[13].addShapeBox(0F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 15
		bodyModel[13].setRotationPoint(27.2F, -18.3F, -12.2F);

		bodyModel[14].addShapeBox(5F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F); // Box 16
		bodyModel[14].setRotationPoint(27.2F, -18.3F, -12.2F);

		bodyModel[15].addShapeBox(6F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F); // Box 17
		bodyModel[15].setRotationPoint(27.2F, -18.3F, -12.2F);

		bodyModel[16].addBox(0F, 0F, 0F, 73, 1, 14, 0F); // Box 18
		bodyModel[16].setRotationPoint(-55.5F, -10F, 17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-69.51F, -13.5F, 17F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-74.5F, -13.5F, 17F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-81.51F, -7.5F, 17F);

		bodyModel[20].addBox(0F, 0F, 0F, 73, 1, 14, 0F); // Box 22
		bodyModel[20].setRotationPoint(-55.5F, -10F, -31F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[21].setRotationPoint(-69.51F, -13.5F, -31F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-74.5F, -13.5F, -31F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-81.51F, -7.5F, -31F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(17.51F, -10F, 17F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(26.5F, -15.5F, 17F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(39.51F, -15.5F, 17F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 14, 0F,0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(17.51F, -10F, -31F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(26.5F, -15.5F, -31F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(39.51F, -15.5F, -31F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 32
		bodyModel[30].setRotationPoint(39.51F, -15.5F, 17F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F); // Box 33
		bodyModel[31].setRotationPoint(39.51F, -15.5F, -18F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(26.5F, -15.5F, 17F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[33].setRotationPoint(26.5F, -15.5F, -18F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[34].setRotationPoint(-81.51F, -7.5F, 17F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-81.51F, -7.5F, -18F);

		bodyModel[36].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[36].setRotationPoint(-45.61F, 2.3F, -19F);

		bodyModel[37].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 115
		bodyModel[37].setRotationPoint(-45.61F, -0.71F, -19F);

		bodyModel[38].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[38].setRotationPoint(-48.61F, 0.5F, -20.5F);
		bodyModel[38].rotateAngleZ = 0.2443461F;

		bodyModel[39].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[39].setRotationPoint(-51.61F, 5.5F, -20.5F);

		bodyModel[40].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[40].setRotationPoint(-52.61F, 2.5F, -20.5F);

		bodyModel[41].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[41].setRotationPoint(-22.61F, 2.5F, -20.5F);

		bodyModel[42].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[42].setRotationPoint(-18.61F, 0.5F, -20.5F);
		bodyModel[42].rotateAngleZ = 0.2443461F;

		bodyModel[43].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[43].setRotationPoint(-15.61F, 2.3F, -19F);

		bodyModel[44].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[44].setRotationPoint(-21.61F, 5.5F, -20.5F);

		bodyModel[45].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 123
		bodyModel[45].setRotationPoint(-15.61F, -0.71F, -19F);

		bodyModel[46].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[46].setRotationPoint(8.39F, 2.5F, -20.5F);

		bodyModel[47].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[47].setRotationPoint(12.39F, 0.5F, -20.5F);
		bodyModel[47].rotateAngleZ = 0.2443461F;

		bodyModel[48].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[48].setRotationPoint(15.39F, 2.3F, -19F);

		bodyModel[49].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[49].setRotationPoint(9.39F, 5.5F, -20.5F);

		bodyModel[50].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 128
		bodyModel[50].setRotationPoint(15.39F, -0.71F, -19F);

		bodyModel[51].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[51].setRotationPoint(8.39F, 2.5F, 18.5F);

		bodyModel[52].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[52].setRotationPoint(12.39F, 0.5F, 18.5F);
		bodyModel[52].rotateAngleZ = 0.2443461F;

		bodyModel[53].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[53].setRotationPoint(15.39F, 2.3F, 17F);

		bodyModel[54].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[54].setRotationPoint(9.39F, 5.5F, 18.5F);

		bodyModel[55].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 133
		bodyModel[55].setRotationPoint(15.39F, -0.71F, 17F);

		bodyModel[56].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[56].setRotationPoint(-45.61F, 2.3F, 17F);

		bodyModel[57].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 135
		bodyModel[57].setRotationPoint(-45.61F, -0.71F, 17F);

		bodyModel[58].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[58].setRotationPoint(-48.61F, 0.5F, 18.5F);
		bodyModel[58].rotateAngleZ = 0.2443461F;

		bodyModel[59].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[59].setRotationPoint(-51.61F, 5.5F, 18.5F);

		bodyModel[60].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[60].setRotationPoint(-52.61F, 2.5F, 18.5F);

		bodyModel[61].addShapeBox(-6F, -2F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[61].setRotationPoint(-22.61F, 2.5F, 18.5F);

		bodyModel[62].addShapeBox(-6F, -2F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[62].setRotationPoint(-18.61F, 0.5F, 18.5F);
		bodyModel[62].rotateAngleZ = 0.2443461F;

		bodyModel[63].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[63].setRotationPoint(-15.61F, 2.3F, 17F);

		bodyModel[64].addShapeBox(-6F, -2F, 0F, 20, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[64].setRotationPoint(-21.61F, 5.5F, 18.5F);

		bodyModel[65].addShapeBox(-6F, -2F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 143
		bodyModel[65].setRotationPoint(-15.61F, -0.71F, 17F);

		bodyModel[66].addBox(0F, 0F, 0F, 10, 12, 33, 0F); // Box 199
		bodyModel[66].setRotationPoint(-52.5F, -22.6F, -16.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 12, 8, 0F); // Box 200
		bodyModel[67].setRotationPoint(-55F, -22.6F, -13.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 12, 8, 0F); // Box 201
		bodyModel[68].setRotationPoint(-55F, -22.6F, 5.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 29, 2, 10, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 202
		bodyModel[69].setRotationPoint(-52F, -23.4F, -27F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 29, 2, 10, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 203
		bodyModel[70].setRotationPoint(-52F, -23.4F, 17F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 15, 2, 35, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 204
		bodyModel[71].setRotationPoint(-73.99F, -15.4F, -17.5F);
		bodyModel[71].rotateAngleZ = 0.3577925F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 205
		bodyModel[72].setRotationPoint(29.7F, -17.5F, -24.3F);

		bodyModel[73].addShapeBox(0F, 0F, -1F, 1, 3, 3, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F); // Box 206
		bodyModel[73].setRotationPoint(29.7F, -20F, -24.3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 207
		bodyModel[74].setRotationPoint(29.7F, -17.5F, 23.3F);

		bodyModel[75].addShapeBox(0F, 0F, -1F, 1, 3, 3, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F); // Box 208
		bodyModel[75].setRotationPoint(29.7F, -20F, 23.3F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 144
		turretModel[1] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 145
		turretModel[2] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 146
		turretModel[3] = new ModelRendererTurbo(this, 377, 249, textureX, textureY); // Box 147
		turretModel[4] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 148
		turretModel[5] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 149
		turretModel[6] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 150
		turretModel[7] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Box 151
		turretModel[8] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 152
		turretModel[9] = new ModelRendererTurbo(this, 217, 281, textureX, textureY); // Box 153
		turretModel[10] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Box 154
		turretModel[11] = new ModelRendererTurbo(this, 449, 289, textureX, textureY); // Box 156
		turretModel[12] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Box 157
		turretModel[13] = new ModelRendererTurbo(this, 273, 313, textureX, textureY); // Box 158
		turretModel[14] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Box 159
		turretModel[15] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 160
		turretModel[16] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 161
		turretModel[17] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Box 162
		turretModel[18] = new ModelRendererTurbo(this, 393, 305, textureX, textureY); // Box 163
		turretModel[19] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 164
		turretModel[20] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 165
		turretModel[21] = new ModelRendererTurbo(this, 425, 329, textureX, textureY); // Box 166
		turretModel[22] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 167
		turretModel[23] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 168
		turretModel[24] = new ModelRendererTurbo(this, 473, 257, textureX, textureY); // Box 169
		turretModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 170
		turretModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 171
		turretModel[27] = new ModelRendererTurbo(this, 361, 353, textureX, textureY); // Box 193
		turretModel[28] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Box 194
		turretModel[29] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 195
		turretModel[30] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 196
		turretModel[31] = new ModelRendererTurbo(this, 137, 265, textureX, textureY); // Box 197
		turretModel[32] = new ModelRendererTurbo(this, 113, 337, textureX, textureY); // Box 198
		turretModel[33] = new ModelRendererTurbo(this, 281, 369, textureX, textureY); // Box 199
		turretModel[34] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Box 209
		turretModel[35] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Box 210

		turretModel[0].addShapeBox(2F, 5F, 0F, 18, 11, 16, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F); // Box 144
		turretModel[0].setRotationPoint(0F, -39.5F, 0F);

		turretModel[1].addShapeBox(2F, 5F, -16F, 18, 11, 16, 0F,0F, 1F, 5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		turretModel[1].setRotationPoint(0F, -39.5F, 0F);

		turretModel[2].addShapeBox(-1F, 5F, -21F, 5, 14, 42, 0F,0F, 0.2F, 0.4F, 0F, -0.1F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F); // Box 146
		turretModel[2].setRotationPoint(0F, -40.5F, 0F);

		turretModel[3].addShapeBox(4.01F, 5F, -21F, 4, 13, 42, 0F,0F, 0.9F, -0.4F, 0F, 0.66F, -2F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.4F); // Box 147
		turretModel[3].setRotationPoint(0F, -39.5F, 0F);

		turretModel[4].addShapeBox(8F, 5F, -19F, 4, 13, 38, 0F,0F, 0.66F, 0F, 0F, 0.4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 148
		turretModel[4].setRotationPoint(0F, -39.5F, 0F);

		turretModel[5].addShapeBox(12.01F, 5F, -16F, 4, 13, 32, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 149
		turretModel[5].setRotationPoint(0F, -39.5F, 0F);

		turretModel[6].addShapeBox(16F, 5F, -11.5F, 3, 13, 23, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 150
		turretModel[6].setRotationPoint(0F, -39.5F, 0F);

		turretModel[7].addShapeBox(12F, 5F, -11.5F, 4, 13, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		turretModel[7].setRotationPoint(0F, -39.5F, 0F);

		turretModel[8].addShapeBox(-11.99F, 5F, -21F, 4, 15, 42, 0F,0F, 0F, -2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -2F); // Box 152
		turretModel[8].setRotationPoint(0F, -41.1F, 0F);

		turretModel[9].addShapeBox(-16F, 5F, -19F, 4, 15, 38, 0F,0F, 0.2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 153
		turretModel[9].setRotationPoint(0F, -41.1F, 0F);

		turretModel[10].addShapeBox(-19.99F, 5F, -16F, 4, 15, 32, 0F,0F, 0.4F, -4.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Box 154
		turretModel[10].setRotationPoint(0F, -41.1F, 0F);

		turretModel[11].addShapeBox(-23.99F, 5F, -11.5F, 4, 15, 23, 0F,-0.8F, 0.6F, -7F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.8F, 0.6F, -7F, -0.8F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -7F); // Box 156
		turretModel[11].setRotationPoint(0F, -41.1F, 0F);

		turretModel[12].addShapeBox(-8F, 5F, -21F, 7, 14, 42, 0F,0F, 0.4F, -0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.4F); // Box 157
		turretModel[12].setRotationPoint(0F, -40.5F, 0F);

		turretModel[13].addShapeBox(20F, 5F, -16F, 2, 11, 32, 0F,0F, 0F, -1.5F, 0.5F, -5.5F, -2F, 0.5F, -5.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, -5.5F, -2F, 0.5F, -5.5F, -0.5F, 0F, 0F, 0F); // Box 158
		turretModel[13].setRotationPoint(0F, -39.5F, 0F);

		turretModel[14].addShapeBox(-1F, 5F, -6F, 19, 3, 10, 0F,0F, 0F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		turretModel[14].setRotationPoint(0F, -42.2F, 0F);

		turretModel[15].addShapeBox(-18.49F, 5F, -6F, 17, 3, 10, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 160
		turretModel[15].setRotationPoint(0F, -42.2F, 0F);

		turretModel[16].addShapeBox(-22F, 5F, -6F, 3, 3, 10, 0F,0F, -0.7F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 161
		turretModel[16].setRotationPoint(0F, -42.2F, 0F);

		turretModel[17].addShapeBox(-12.49F, 1.5F, 2.5F, 5, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		turretModel[17].setRotationPoint(0F, -41.1F, 0F);

		turretModel[18].addShapeBox(-7.5F, 1.5F, 2.5F, 5, 15, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 163
		turretModel[18].setRotationPoint(0F, -41.1F, 0F);

		turretModel[19].addShapeBox(-17.5F, 1.5F, 2.5F, 5, 15, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 164
		turretModel[19].setRotationPoint(0F, -41.1F, 0F);

		turretModel[20].addShapeBox(-17.5F, 0F, 2.5F, 5, 15, 15, 0F,-1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 165
		turretModel[20].setRotationPoint(0F, -41.1F, 0F);

		turretModel[21].addShapeBox(-12.49F, 0F, 2.5F, 5, 15, 15, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		turretModel[21].setRotationPoint(0F, -41.1F, 0F);

		turretModel[22].addShapeBox(-7.5F, 0F, 2.5F, 5, 15, 15, 0F,0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 167
		turretModel[22].setRotationPoint(0F, -41.1F, 0F);

		turretModel[23].addShapeBox(-8.5F, 4.2F, -18F, 9, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		turretModel[23].setRotationPoint(0F, -40.5F, 0F);

		turretModel[24].addShapeBox(-7.5F, 4.2F, -17F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		turretModel[24].setRotationPoint(0F, -40.8F, 0F);

		turretModel[25].addShapeBox(-4F, 4.2F, -14.5F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		turretModel[25].setRotationPoint(0F, -41F, 0F);

		turretModel[26].addShapeBox(-4F, 4.2F, -11F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		turretModel[26].setRotationPoint(0F, -41F, 0F);

		turretModel[27].addShapeBox(-30.99F, 7F, -9.5F, 15, 2, 18, 0F,0F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, 1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.6F, 0F); // Box 193
		turretModel[27].setRotationPoint(0F, -42.2F, 0F);

		turretModel[28].addShapeBox(-36F, 9F, -3.5F, 20, 9, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 194
		turretModel[28].setRotationPoint(0F, -42.2F, 0F);

		turretModel[29].addShapeBox(-36F, 7.01F, -9.51F, 5, 2, 6, 0F,-1.5F, -2F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -2F, 0F, -1.5F, 2F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 2F, 0F); // Box 195
		turretModel[29].setRotationPoint(0F, -42.2F, 0F);

		turretModel[30].addShapeBox(-36F, 7.01F, -3.5F, 5, 2, 6, 0F,0F, -2F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, 2F, 0F); // Box 196
		turretModel[30].setRotationPoint(0F, -42.2F, 0F);

		turretModel[31].addShapeBox(-36F, 7.01F, 2.51F, 5, 2, 6, 0F,0F, -2F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, -1.5F, -2F, 0F, 0F, 2F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, -1.5F, 2F, 0F); // Box 197
		turretModel[31].setRotationPoint(0F, -42.2F, 0F);

		turretModel[32].addShapeBox(-36F, 9F, 2.51F, 20, 9, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 198
		turretModel[32].setRotationPoint(0F, -42.2F, 0F);

		turretModel[33].addShapeBox(-36F, 9F, -7.51F, 20, 9, 4, 0F,-1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 199
		turretModel[33].setRotationPoint(0F, -42.2F, 0F);

		turretModel[34].addShapeBox(8F, 10F, 18.5F, 80, 80, 1, 0F,0F, 0F, 0F, -72F, 0F, 2F, -72F, 0F, -2F, 0F, 0F, 0F, 0F, -72F, 0F, -72F, -72F, 2F, -72F, -72F, -2F, 0F, -72F, 0F); // Box 209
		turretModel[34].setRotationPoint(0F, -43F, 0F);

		turretModel[35].addShapeBox(8F, 10F, -18F, 80, 80, 1, 0F,0F, 0F, 0F, -72F, 0F, -2.8F, -72F, 0F, 3F, 0F, 0F, 0F, 0F, -72F, 0F, -72F, -72F, -2.8F, -72F, -72F, 3F, 0F, -72F, 0F); // Box 210
		turretModel[35].setRotationPoint(0F, -43F, -1F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 172
		barrelModel[1] = new ModelRendererTurbo(this, 9, 337, textureX, textureY); // Box 173
		barrelModel[2] = new ModelRendererTurbo(this, 313, 329, textureX, textureY); // Box 174
		barrelModel[3] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 175
		barrelModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 176
		barrelModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 177
		barrelModel[6] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 178
		barrelModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 179
		barrelModel[8] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Box 180
		barrelModel[9] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 181
		barrelModel[10] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 182
		barrelModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 183
		barrelModel[12] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 184
		barrelModel[13] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 185
		barrelModel[14] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 186
		barrelModel[15] = new ModelRendererTurbo(this, 145, 369, textureX, textureY); // Box 190
		barrelModel[16] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 191
		barrelModel[17] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 192
		barrelModel[18] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Box 197
		barrelModel[19] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 198

		barrelModel[0].addShapeBox(-0.5F, -0.5F, -16.5F, 1, 1, 35, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 172
		barrelModel[0].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[1].addShapeBox(-0.5F, -0.5F, -15.5F, 1, 1, 33, 0F,0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F); // Box 173
		barrelModel[1].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[2].addShapeBox(3.2F, -5F, -13.5F, 1, 10, 29, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		barrelModel[2].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[3].addShapeBox(4.21F, -5F, -13.5F, 1, 10, 3, 0F,0F, 0F, 0F, -0.3F, -0.8F, -0.5F, -0.3F, -0.8F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.8F, -0.5F, -0.3F, -0.8F, -0.8F, 0F, 0F, 0F); // Box 175
		barrelModel[3].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[4].addShapeBox(4.21F, -5F, 12.5F, 1, 10, 3, 0F,0F, 0F, 0F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.8F, -0.8F, -0.3F, -0.8F, -0.5F, 0F, 0F, 0F); // Box 176
		barrelModel[4].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[5].addShapeBox(3.8F, -2.15F, -9F, 1, 1, 1, 0F,-0.5F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, 0F, -0.24F, -0.24F, -0.5F, -0.24F, -0.24F); // Box 177
		barrelModel[5].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[6].addShapeBox(-1.2F, -2.15F, -9F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 178
		barrelModel[6].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[7].addShapeBox(4.8F, -2.15F, -9F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.3F, -0.3F); // Box 179
		barrelModel[7].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[8].addShapeBox(1.2F, -3F, -11.5F, 2, 6, 25, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 180
		barrelModel[8].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[9].addShapeBox(4.21F, -5F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0F, 0F); // Box 181
		barrelModel[9].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[10].addShapeBox(4.21F, -5.01F, -7.01F, 2, 5, 2, 0F,0F, -1.2F, -0.2F, 0.2F, -1.8F, -0.8F, 0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 182
		barrelModel[10].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[11].addShapeBox(4.21F, 0F, -7.01F, 2, 5, 2, 0F,0F, 0F, 0.8F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, -0.2F, 0.2F, -1.8F, -0.8F, 0.2F, -0.8F, 0F, 0F, 0F, 0F); // Box 183
		barrelModel[11].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[12].addShapeBox(4.21F, -5.01F, 6.99F, 2, 5, 2, 0F,0F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -1.8F, -0.8F, 0F, -1.2F, -0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.8F); // Box 184
		barrelModel[12].setRotationPoint(19.5F, -28.9F, -2F);

		barrelModel[13].addShapeBox(4.21F, 0F, 6.99F, 2, 5, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -1.8F, -0.8F, 0F, -1.2F, -0.2F); // Box 185
		barrelModel[13].setRotationPoint(19.5F, -28.9F, -2F);

		barrelModel[14].addShapeBox(5.7F, -3.5F, -3.5F, 2, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 186
		barrelModel[14].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[15].addShapeBox(7.2F, -1.5F, -1.5F, 62, 3, 3, 0F,0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F); // Box 190
		barrelModel[15].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[16].addShapeBox(64.2F, -1.5F, -1.5F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0F, 0F); // Box 191
		barrelModel[16].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[17].addShapeBox(70.2F, -1.5F, -1.5F, 4, 3, 3, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 192
		barrelModel[17].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[18].addShapeBox(7.2F, -2.5F, -2.5F, 18, 5, 5, 0F,0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F); // Box 197
		barrelModel[18].setRotationPoint(19.5F, -28.9F, 0F);

		barrelModel[19].addShapeBox(25.2F, -2F, -2F, 15, 4, 4, 0F,0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F); // Box 198
		barrelModel[19].setRotationPoint(19.5F, -28.9F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 84
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 85
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 86
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 87
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 88
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 89
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 90
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 91
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Box 92
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 93
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 94
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 95
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 96
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 97
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 98
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 99
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 100
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 101
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 108
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 109
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 110
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Box 111
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 112
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 113

		leftTrackWheelModels[0].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		leftTrackWheelModels[0].setRotationPoint(-55.61F, 3.3F, 21.5F);

		leftTrackWheelModels[1].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftTrackWheelModels[1].setRotationPoint(-55.61F, 3.3F, 21.5F);

		leftTrackWheelModels[2].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 86
		leftTrackWheelModels[2].setRotationPoint(-55.61F, 3.3F, 21.5F);

		leftTrackWheelModels[3].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 87
		leftTrackWheelModels[3].setRotationPoint(-41.61F, 3.3F, 21.5F);

		leftTrackWheelModels[4].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		leftTrackWheelModels[4].setRotationPoint(-41.61F, 3.3F, 21.5F);

		leftTrackWheelModels[5].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftTrackWheelModels[5].setRotationPoint(-41.61F, 3.3F, 21.5F);

		leftTrackWheelModels[6].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 90
		leftTrackWheelModels[6].setRotationPoint(-10.61F, 3.3F, 21.5F);

		leftTrackWheelModels[7].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		leftTrackWheelModels[7].setRotationPoint(-10.61F, 3.3F, 21.5F);

		leftTrackWheelModels[8].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftTrackWheelModels[8].setRotationPoint(-10.61F, 3.3F, 21.5F);

		leftTrackWheelModels[9].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 93
		leftTrackWheelModels[9].setRotationPoint(-24.61F, 3.3F, 21.5F);

		leftTrackWheelModels[10].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftTrackWheelModels[10].setRotationPoint(-24.61F, 3.3F, 21.5F);

		leftTrackWheelModels[11].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftTrackWheelModels[11].setRotationPoint(-24.61F, 3.3F, 21.5F);

		leftTrackWheelModels[12].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 96
		leftTrackWheelModels[12].setRotationPoint(19.5F, 3.3F, 21.5F);

		leftTrackWheelModels[13].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftTrackWheelModels[13].setRotationPoint(19.5F, 3.3F, 21.5F);

		leftTrackWheelModels[14].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		leftTrackWheelModels[14].setRotationPoint(19.5F, 3.3F, 21.5F);

		leftTrackWheelModels[15].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 99
		leftTrackWheelModels[15].setRotationPoint(5.5F, 3.3F, 21.5F);

		leftTrackWheelModels[16].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftTrackWheelModels[16].setRotationPoint(5.5F, 3.3F, 21.5F);

		leftTrackWheelModels[17].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		leftTrackWheelModels[17].setRotationPoint(5.5F, 3.3F, 21.5F);

		leftTrackWheelModels[18].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 108
		leftTrackWheelModels[18].setRotationPoint(35.5F, -4.3F, 21.5F);

		leftTrackWheelModels[19].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 109
		leftTrackWheelModels[19].setRotationPoint(35.5F, -4.3F, 21.5F);

		leftTrackWheelModels[20].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 110
		leftTrackWheelModels[20].setRotationPoint(35.5F, -4.3F, 21.5F);

		leftTrackWheelModels[21].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 111
		leftTrackWheelModels[21].setRotationPoint(-70F, -2.3F, 21.5F);

		leftTrackWheelModels[22].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 112
		leftTrackWheelModels[22].setRotationPoint(-70F, -2.3F, 21.5F);

		leftTrackWheelModels[23].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 113
		leftTrackWheelModels[23].setRotationPoint(-70F, -2.3F, 21.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 66
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 67
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 68
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 69
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 70
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 71
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 72
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 73
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 74
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 75
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 76
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 77
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 78
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 79
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 80
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 81
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 82
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 83
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 102
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 103
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 104
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Box 105
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 106
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 107

		rightTrackWheelModels[0].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightTrackWheelModels[0].setRotationPoint(-55.61F, 3.3F, -27.5F);

		rightTrackWheelModels[1].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		rightTrackWheelModels[1].setRotationPoint(-55.61F, 3.3F, -27.5F);

		rightTrackWheelModels[2].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 68
		rightTrackWheelModels[2].setRotationPoint(-55.61F, 3.3F, -27.5F);

		rightTrackWheelModels[3].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 69
		rightTrackWheelModels[3].setRotationPoint(-41.61F, 3.3F, -27.5F);

		rightTrackWheelModels[4].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightTrackWheelModels[4].setRotationPoint(-41.61F, 3.3F, -27.5F);

		rightTrackWheelModels[5].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		rightTrackWheelModels[5].setRotationPoint(-41.61F, 3.3F, -27.5F);

		rightTrackWheelModels[6].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 72
		rightTrackWheelModels[6].setRotationPoint(-10.61F, 3.3F, -27.5F);

		rightTrackWheelModels[7].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightTrackWheelModels[7].setRotationPoint(-10.61F, 3.3F, -27.5F);

		rightTrackWheelModels[8].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightTrackWheelModels[8].setRotationPoint(-10.61F, 3.3F, -27.5F);

		rightTrackWheelModels[9].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 75
		rightTrackWheelModels[9].setRotationPoint(-24.61F, 3.3F, -27.5F);

		rightTrackWheelModels[10].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		rightTrackWheelModels[10].setRotationPoint(-24.61F, 3.3F, -27.5F);

		rightTrackWheelModels[11].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		rightTrackWheelModels[11].setRotationPoint(-24.61F, 3.3F, -27.5F);

		rightTrackWheelModels[12].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 78
		rightTrackWheelModels[12].setRotationPoint(19.5F, 3.3F, -27.5F);

		rightTrackWheelModels[13].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 79
		rightTrackWheelModels[13].setRotationPoint(35.5F, -4.3F, -27.5F);

		rightTrackWheelModels[14].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		rightTrackWheelModels[14].setRotationPoint(19.5F, 3.3F, -27.5F);

		rightTrackWheelModels[15].addShapeBox(-6F, 2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 81
		rightTrackWheelModels[15].setRotationPoint(5.5F, 3.3F, -27.5F);

		rightTrackWheelModels[16].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		rightTrackWheelModels[16].setRotationPoint(5.5F, 3.3F, -27.5F);

		rightTrackWheelModels[17].addShapeBox(-6F, -6F, 0F, 12, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		rightTrackWheelModels[17].setRotationPoint(5.5F, 3.3F, -27.5F);

		rightTrackWheelModels[18].addShapeBox(-6F, -2F, 0F, 12, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightTrackWheelModels[18].setRotationPoint(19.5F, 3.3F, -27.5F);

		rightTrackWheelModels[19].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 103
		rightTrackWheelModels[19].setRotationPoint(35.5F, -4.3F, -27.5F);

		rightTrackWheelModels[20].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 104
		rightTrackWheelModels[20].setRotationPoint(35.5F, -4.3F, -27.5F);

		rightTrackWheelModels[21].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F); // Box 105
		rightTrackWheelModels[21].setRotationPoint(-70F, -2.3F, -27.5F);

		rightTrackWheelModels[22].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 106
		rightTrackWheelModels[22].setRotationPoint(-70F, -2.3F, -27.5F);

		rightTrackWheelModels[23].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 6, 0F,-5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 107
		rightTrackWheelModels[23].setRotationPoint(-70F, -2.3F, -27.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 38
		leftTrackModel[1] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 39
		leftTrackModel[2] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 40
		leftTrackModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 41
		leftTrackModel[4] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 42
		leftTrackModel[5] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 43
		leftTrackModel[6] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 44
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 45
		leftTrackModel[8] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 46
		leftTrackModel[9] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 47
		leftTrackModel[10] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 48
		leftTrackModel[11] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 49
		leftTrackModel[12] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 50
		leftTrackModel[13] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 51

		leftTrackModel[0].addBox(0F, 0F, 0F, 68, 1, 11, 0F); // Box 38
		leftTrackModel[0].setRotationPoint(-52.5F, -8.5F, 18.5F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 39
		leftTrackModel[1].setRotationPoint(-70.5F, -10.5F, 18.5F);
		leftTrackModel[1].rotateAngleZ = -0.10995574F;

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackModel[2].setRotationPoint(-74.5F, -9F, 18.5F);
		leftTrackModel[2].rotateAngleZ = 0.3577925F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackModel[3].setRotationPoint(-77.5F, -5F, 18.5F);
		leftTrackModel[3].rotateAngleZ = 0.92676983F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftTrackModel[4].setRotationPoint(-78F, 1F, 18.5F);
		leftTrackModel[4].rotateAngleZ = 1.48527519F;

		leftTrackModel[5].addShapeBox(0F, -1F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftTrackModel[5].setRotationPoint(-78F, 1F, 18.5F);
		leftTrackModel[5].rotateAngleZ = -0.75049158F;

		leftTrackModel[6].addShapeBox(0F, -1F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftTrackModel[6].setRotationPoint(-73.61F, 5.1F, 18.5F);
		leftTrackModel[6].rotateAngleZ = -0.29670597F;

		leftTrackModel[7].addShapeBox(0F, -1F, 0F, 78, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		leftTrackModel[7].setRotationPoint(-56.61F, 10.3F, 18.5F);

		leftTrackModel[8].addShapeBox(0F, -1F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackModel[8].setRotationPoint(21.4F, 10.3F, 18.5F);
		leftTrackModel[8].rotateAngleZ = 0.41887902F;

		leftTrackModel[9].addShapeBox(0F, -1F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftTrackModel[9].setRotationPoint(39.6F, 2.2F, 18.5F);
		leftTrackModel[9].rotateAngleZ = 0.82030475F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 21, 1, 11, 0F); // Box 48
		leftTrackModel[10].setRotationPoint(15.5F, -8.5F, 18.5F);
		leftTrackModel[10].rotateAngleZ = 0.19198622F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 49
		leftTrackModel[11].setRotationPoint(36.1F, -12.5F, 18.5F);
		leftTrackModel[11].rotateAngleZ = -0.34906585F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 5, 1, 11, 0F); // Box 50
		leftTrackModel[12].setRotationPoint(39.8F, -11.2F, 18.5F);
		leftTrackModel[12].rotateAngleZ = -0.87266463F;

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftTrackModel[13].setRotationPoint(43F, -7.4F, 18.5F);
		leftTrackModel[13].rotateAngleZ = -1.569051F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 52
		rightTrackModel[1] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 53
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 54
		rightTrackModel[3] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 55
		rightTrackModel[4] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 56
		rightTrackModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 57
		rightTrackModel[6] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 58
		rightTrackModel[7] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 59
		rightTrackModel[8] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 60
		rightTrackModel[9] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 61
		rightTrackModel[10] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 62
		rightTrackModel[11] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 63
		rightTrackModel[12] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 64
		rightTrackModel[13] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 65

		rightTrackModel[0].addBox(0F, 0F, 0F, 68, 1, 11, 0F); // Box 52
		rightTrackModel[0].setRotationPoint(-52.5F, -8.5F, -29.5F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightTrackModel[1].setRotationPoint(-70.5F, -10.5F, -29.5F);
		rightTrackModel[1].rotateAngleZ = -0.10995574F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightTrackModel[2].setRotationPoint(-74.5F, -9F, -29.5F);
		rightTrackModel[2].rotateAngleZ = 0.3577925F;

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightTrackModel[3].setRotationPoint(-77.5F, -5F, -29.5F);
		rightTrackModel[3].rotateAngleZ = 0.92676983F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightTrackModel[4].setRotationPoint(-78F, 1F, -29.5F);
		rightTrackModel[4].rotateAngleZ = 1.48527519F;

		rightTrackModel[5].addShapeBox(0F, -1F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		rightTrackModel[5].setRotationPoint(-78F, 1F, -29.5F);
		rightTrackModel[5].rotateAngleZ = -0.75049158F;

		rightTrackModel[6].addShapeBox(0F, -1F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightTrackModel[6].setRotationPoint(-73.61F, 5.1F, -29.5F);
		rightTrackModel[6].rotateAngleZ = -0.29670597F;

		rightTrackModel[7].addShapeBox(0F, -1F, 0F, 78, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightTrackModel[7].setRotationPoint(-56.61F, 10.3F, -29.5F);

		rightTrackModel[8].addShapeBox(0F, -1F, 0F, 20, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		rightTrackModel[8].setRotationPoint(21.4F, 10.3F, -29.5F);
		rightTrackModel[8].rotateAngleZ = 0.41887902F;

		rightTrackModel[9].addShapeBox(0F, -1F, 0F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightTrackModel[9].setRotationPoint(39.6F, 2.2F, -29.5F);
		rightTrackModel[9].rotateAngleZ = 0.82030475F;

		rightTrackModel[10].addBox(0F, 0F, 0F, 21, 1, 11, 0F); // Box 62
		rightTrackModel[10].setRotationPoint(15.5F, -8.5F, -29.5F);
		rightTrackModel[10].rotateAngleZ = 0.19198622F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Box 63
		rightTrackModel[11].setRotationPoint(36.1F, -12.5F, -29.5F);
		rightTrackModel[11].rotateAngleZ = -0.34906585F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 5, 1, 11, 0F); // Box 64
		rightTrackModel[12].setRotationPoint(39.8F, -11.2F, -29.5F);
		rightTrackModel[12].rotateAngleZ = -0.87266463F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		rightTrackModel[13].setRotationPoint(43F, -7.4F, -29.5F);
		rightTrackModel[13].rotateAngleZ = -1.569051F;
	}
}