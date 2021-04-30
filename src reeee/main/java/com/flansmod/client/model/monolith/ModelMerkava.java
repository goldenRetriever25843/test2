//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.04.2016 - 16:23:40
// Last changed on: 01.04.2016 - 16:23:40

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMerkava extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMerkava() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[67];
		turretModel = new ModelRendererTurbo[62];
		barrelModel = new ModelRendererTurbo[13];
		leftTrackWheelModels = new ModelRendererTurbo[87];
		rightTrackWheelModels = new ModelRendererTurbo[87];
		leftTrackModel = new ModelRendererTurbo[12];
		rightTrackModel = new ModelRendererTurbo[12];

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
		bodyModel[0] = new ModelRendererTurbo(this, 0, 318, textureX, textureY); // Box 34
		bodyModel[1] = new ModelRendererTurbo(this, 329, 434, textureX, textureY); // Box 34
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 474, 331, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 468, 316, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 237, 365, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 392, 319, textureX, textureY); // Box 34
		bodyModel[7] = new ModelRendererTurbo(this, 392, 334, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 397, 325, textureX, textureY); // Box 34
		bodyModel[9] = new ModelRendererTurbo(this, 394, 351, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 318, 340, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 149, 321, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 408, 422, textureX, textureY); // Box 34
		bodyModel[13] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 10, 489, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 34
		bodyModel[16] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 343, 317, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 461, 374, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 452, 376, textureX, textureY); // Box 34
		bodyModel[20] = new ModelRendererTurbo(this, 445, 376, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 146, 323, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 292, 386, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 383, 396, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 415, 396, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 52, 9, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 236, 489, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 40, 489, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 127, 489, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 86, 18, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Box 34
		bodyModel[36] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Box 34
		bodyModel[37] = new ModelRendererTurbo(this, 6, 491, textureX, textureY); // Box 34
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		bodyModel[39] = new ModelRendererTurbo(this, 18, 492, textureX, textureY); // Box 34
		bodyModel[40] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Box 34
		bodyModel[41] = new ModelRendererTurbo(this, 193, 281, textureX, textureY); // Box 34
		bodyModel[42] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Box 34
		bodyModel[43] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 34
		bodyModel[44] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Box 34
		bodyModel[45] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 34
		bodyModel[46] = new ModelRendererTurbo(this, 111, 23, textureX, textureY); // Box 34
		bodyModel[47] = new ModelRendererTurbo(this, 357, 101, textureX, textureY); // Box 34
		bodyModel[48] = new ModelRendererTurbo(this, 97, 22, textureX, textureY); // Box 34
		bodyModel[49] = new ModelRendererTurbo(this, 112, 23, textureX, textureY); // Box 34
		bodyModel[50] = new ModelRendererTurbo(this, 81, 289, textureX, textureY); // Box 34
		bodyModel[51] = new ModelRendererTurbo(this, 273, 289, textureX, textureY); // Box 34
		bodyModel[52] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 34
		bodyModel[53] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 34
		bodyModel[54] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 34
		bodyModel[55] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 34
		bodyModel[56] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 34
		bodyModel[57] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 34
		bodyModel[58] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 34
		bodyModel[59] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 34
		bodyModel[60] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 34
		bodyModel[61] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 34
		bodyModel[62] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 34
		bodyModel[63] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 34
		bodyModel[64] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 34
		bodyModel[65] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 34
		bodyModel[66] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Box 34

		bodyModel[0].addShapeBox(-45F, -14F, -25F, 48, 6, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[0].setRotationPoint(10F, -2F, 0F);

		bodyModel[1].addShapeBox(3F, -14F, 0F, 15, 6, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[1].setRotationPoint(10F, -2F, 0F);

		bodyModel[2].addShapeBox(3F, -14F, 15F, 4, 6, 9, 0F,0F, 0F, 0F, 0F, -1F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[2].setRotationPoint(10F, -2F, 0F);

		bodyModel[3].addShapeBox(3F, -14F, 15F, 4, 6, 9, 0F,0F, 0F, 0F, 11F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F); // Box 34
		bodyModel[3].setRotationPoint(10F, -2F, 0F);

		bodyModel[4].addShapeBox(7F, -13F, 15F, 11, 5, 9, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[4].setRotationPoint(10F, -2F, 0F);

		bodyModel[5].addShapeBox(3F, -14F, -17F, 15, 6, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[5].setRotationPoint(10F, -2F, 0F);

		bodyModel[6].addShapeBox(3F, -14F, -25F, 15, 6, 8, 0F,0F, 0F, 0F, 0F, -1F, -7.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[6].setRotationPoint(10F, -2F, 0F);

		bodyModel[7].addShapeBox(3F, -14F, -25F, 15, 6, 8, 0F,0F, 0F, 0F, 0F, -2.8F, 0F, 0F, -1F, -0.5F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -8F); // Box 34
		bodyModel[7].setRotationPoint(10F, -2F, 0F);

		bodyModel[8].addShapeBox(18F, -13F, -17F, 14, 5, 42, 0F,0F, 0F, 0F, 0F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[8].setRotationPoint(10F, -2F, 0F);

		bodyModel[9].addShapeBox(18F, -12F, -25F, 14, 4, 8, 0F,0F, -0.8F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[9].setRotationPoint(10F, -2F, 0F);

		bodyModel[10].addShapeBox(32F, -10F, -25F, 10, 5, 50, 0F,0F, -1.4F, 0F, 0F, -4.4F, 0F, 0F, -4.4F, 0F, 0F, -1.4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 34
		bodyModel[10].setRotationPoint(10F, -2F, 0F);

		bodyModel[11].addShapeBox(-45F, -8F, -16F, 75, 11, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[11].setRotationPoint(10F, -2F, 0F);

		bodyModel[12].addShapeBox(30F, -8F, -16F, 12, 11, 32, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[12].setRotationPoint(10F, -2F, 0F);

		bodyModel[13].addShapeBox(42F, -5F, -25F, 1, 3, 10, 0F,0F, 0.6F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[13].setRotationPoint(10F, -2F, 0F);

		bodyModel[14].addShapeBox(36F, -6F, -26F, 7, 4, 1, 0F,0F, 1F, -0.65F, -0.7F, -1F, -0.75F, -0.7F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.65F, -0.4F, 0F, -0.75F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[14].setRotationPoint(10F, -2F, 0F);

		bodyModel[15].addShapeBox(32F, -8F, -26F, 4, 6, 1, 0F,0F, 0F, -0.05F, 0F, -1F, -0.65F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, -0.05F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 4F, -0.7F); // Box 34
		bodyModel[15].setRotationPoint(10F, -2F, 0F);

		bodyModel[16].addShapeBox(-30F, -8F, -26F, 62, 10, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, -0.7F); // Box 34
		bodyModel[16].setRotationPoint(10F, -2F, 0F);

		bodyModel[17].addShapeBox(-58F, -14F, -25F, 13, 6, 11, 0F,-1.3F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[17].setRotationPoint(10F, -2F, 0F);

		bodyModel[18].addShapeBox(-58F, -14F, 14F, 13, 6, 11, 0F,-1.3F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[18].setRotationPoint(10F, -2F, 0F);

		bodyModel[19].addShapeBox(3F, -14F, 24F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[19].setRotationPoint(10F, -2F, 0F);

		bodyModel[20].addShapeBox(7F, -13F, 24F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[20].setRotationPoint(10F, -2F, 0F);

		bodyModel[21].addShapeBox(-53F, -14F, -14F, 8, 17, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 34
		bodyModel[21].setRotationPoint(10F, -2F, 0F);

		bodyModel[22].addShapeBox(-60F, -12.5F, -14F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[22].setRotationPoint(10F, -2F, 0F);

		bodyModel[23].addShapeBox(-53F, -14F, 5F, 8, 17, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Box 34
		bodyModel[23].setRotationPoint(10F, -2F, 0F);

		bodyModel[24].addShapeBox(-60F, -12.5F, 5F, 7, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[24].setRotationPoint(10F, -2F, 0F);

		bodyModel[25].addShapeBox(-60F, -11.5F, 5F, 7, 8, 9, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 34
		bodyModel[25].setRotationPoint(10F, -2F, 0F);

		bodyModel[26].addShapeBox(-60F, -11.5F, -14F, 7, 8, 9, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 34
		bodyModel[26].setRotationPoint(10F, -2F, 0F);

		bodyModel[27].addShapeBox(42F, -5F, 15F, 1, 3, 10, 0F,0F, 0.6F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(10F, -2F, 0F);

		bodyModel[28].addShapeBox(36F, -6F, 25F, 7, 4, 1, 0F,0F, 1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, -0.75F, 0F, 1F, -0.65F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.75F, 0F, 0F, -0.65F); // Box 34
		bodyModel[28].setRotationPoint(10F, -2F, 0F);

		bodyModel[29].addShapeBox(32F, -8F, 25F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.65F, 0F, 0F, -0.05F, 0F, 4F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 4F, -0.05F); // Box 34
		bodyModel[29].setRotationPoint(10F, -2F, 0F);

		bodyModel[30].addShapeBox(-30F, -8F, 25F, 62, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0.05F); // Box 34
		bodyModel[30].setRotationPoint(10F, -2F, 0F);

		bodyModel[31].addShapeBox(3F, -15F, 0F, 15, 2, 15, 0F,-1F, -0.5F, -1F, -1F, -1.5F, -1F, -1F, -1.5F, -1F, -1F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 34
		bodyModel[31].setRotationPoint(10F, -2F, 0F);

		bodyModel[32].addShapeBox(-30F, -8F, -26F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(-8F, -2F, 0F);

		bodyModel[33].addShapeBox(-30F, -8F, -26F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-8F, -1F, 0F);

		bodyModel[34].addShapeBox(-30F, -8F, -26F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-8F, 0F, 0F);

		bodyModel[35].addShapeBox(-30F, -8F, -26F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[35].setRotationPoint(-8F, 1F, 0F);

		bodyModel[36].addShapeBox(-30F, -8F, -26F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[36].setRotationPoint(-8F, 2F, 0F);

		bodyModel[37].addShapeBox(-30F, -8F, -26F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -8F, 0F, 0F); // Box 34
		bodyModel[37].setRotationPoint(-6F, 3F, 0F);

		bodyModel[38].addShapeBox(-30F, -8F, -26F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[38].setRotationPoint(2F, -2F, 0F);

		bodyModel[39].addShapeBox(-30F, -8F, 25F, 16, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -8F, 0F, 0F); // Box 34
		bodyModel[39].setRotationPoint(-6F, 3F, 0F);

		bodyModel[40].addShapeBox(-30F, -8F, 25F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[40].setRotationPoint(-8F, 2F, 0F);

		bodyModel[41].addShapeBox(-30F, -8F, 25F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[41].setRotationPoint(-8F, 1F, 0F);

		bodyModel[42].addShapeBox(-30F, -8F, 25F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[42].setRotationPoint(-8F, 0F, 0F);

		bodyModel[43].addShapeBox(-30F, -8F, 25F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[43].setRotationPoint(-8F, -1F, 0F);

		bodyModel[44].addShapeBox(-30F, -8F, 25F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[44].setRotationPoint(-8F, -2F, 0F);

		bodyModel[45].addShapeBox(-30F, -8F, 25F, 0, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[45].setRotationPoint(2F, -2F, 0F);

		bodyModel[46].addShapeBox(27F, -14F, -15F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 34
		bodyModel[46].setRotationPoint(0F, -2F, 0F);

		bodyModel[47].addShapeBox(21F, -15F, -13F, 4, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[47].setRotationPoint(0F, -2F, 0F);

		bodyModel[48].addShapeBox(19F, -14F, -15F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[48].setRotationPoint(0F, -2F, 0F);

		bodyModel[49].addShapeBox(17F, -14F, -15F, 2, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 34
		bodyModel[49].setRotationPoint(0F, -2F, 0F);

		bodyModel[50].addShapeBox(19F, -15F, -13F, 2, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 34
		bodyModel[50].setRotationPoint(0F, -2F, 0F);

		bodyModel[51].addShapeBox(25F, -15F, -13F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 34
		bodyModel[51].setRotationPoint(0F, -2F, 0F);

		bodyModel[52].addShapeBox(4F, -12F, 23.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[52].setRotationPoint(10F, -2F, 0F);

		bodyModel[53].addShapeBox(4F, -10F, 23.5F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[53].setRotationPoint(10F, -2F, 0F);

		bodyModel[54].addShapeBox(6F, -10F, 23.5F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[54].setRotationPoint(10F, -2F, 0F);

		bodyModel[55].addShapeBox(6F, -12F, 23.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[55].setRotationPoint(10F, -2F, 0F);

		bodyModel[56].addShapeBox(8F, -10F, 23.5F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[56].setRotationPoint(10F, -2F, 0F);

		bodyModel[57].addShapeBox(8F, -12F, 23.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[57].setRotationPoint(10F, -2F, 0F);

		bodyModel[58].addShapeBox(10F, -10F, 23.5F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[58].setRotationPoint(10F, -2F, 0F);

		bodyModel[59].addShapeBox(10F, -12F, 23.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[59].setRotationPoint(10F, -2F, 0F);

		bodyModel[60].addShapeBox(12F, -10F, 23.5F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[60].setRotationPoint(10F, -2F, 0F);

		bodyModel[61].addShapeBox(12F, -12F, 23.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[61].setRotationPoint(10F, -2F, 0F);

		bodyModel[62].addShapeBox(14F, -10F, 23.5F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[62].setRotationPoint(10F, -2F, 0F);

		bodyModel[63].addShapeBox(14F, -12F, 23.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[63].setRotationPoint(10F, -2F, 0F);

		bodyModel[64].addShapeBox(16F, -10F, 23.5F, 1, 2, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[64].setRotationPoint(10F, -2F, 0F);

		bodyModel[65].addShapeBox(16F, -12F, 23.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[65].setRotationPoint(10F, -2F, 0F);

		bodyModel[66].addShapeBox(-46F, -13.5F, -4.5F, 1, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[66].setRotationPoint(10F, -2F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 138, 399, textureX, textureY); // Box 34
		turretModel[1] = new ModelRendererTurbo(this, 138, 374, textureX, textureY); // Box 34
		turretModel[2] = new ModelRendererTurbo(this, 31, 375, textureX, textureY); // Box 34
		turretModel[3] = new ModelRendererTurbo(this, -1, 407, textureX, textureY); // Box 34
		turretModel[4] = new ModelRendererTurbo(this, -3, 441, textureX, textureY); // Box 34
		turretModel[5] = new ModelRendererTurbo(this, 0, 441, textureX, textureY); // Box 34
		turretModel[6] = new ModelRendererTurbo(this, 0, 407, textureX, textureY); // Box 34
		turretModel[7] = new ModelRendererTurbo(this, 0, 441, textureX, textureY); // Box 34
		turretModel[8] = new ModelRendererTurbo(this, 20, 474, textureX, textureY); // Box 34
		turretModel[9] = new ModelRendererTurbo(this, 13, 375, textureX, textureY); // Box 34
		turretModel[10] = new ModelRendererTurbo(this, 51, 407, textureX, textureY); // Box 34
		turretModel[11] = new ModelRendererTurbo(this, 154, 442, textureX, textureY); // Box 34
		turretModel[12] = new ModelRendererTurbo(this, 64, 417, textureX, textureY); // Box 34
		turretModel[13] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 34
		turretModel[14] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 34
		turretModel[15] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Box 34
		turretModel[16] = new ModelRendererTurbo(this, 0, 447, textureX, textureY); // Box 34
		turretModel[17] = new ModelRendererTurbo(this, -3, 375, textureX, textureY); // Box 34
		turretModel[18] = new ModelRendererTurbo(this, 43, 440, textureX, textureY); // Box 34
		turretModel[19] = new ModelRendererTurbo(this, 8, 409, textureX, textureY); // Box 34
		turretModel[20] = new ModelRendererTurbo(this, 154, 425, textureX, textureY); // Box 34
		turretModel[21] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 34
		turretModel[22] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 34
		turretModel[23] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 34
		turretModel[24] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 34
		turretModel[25] = new ModelRendererTurbo(this, 95, 441, textureX, textureY); // Box 34
		turretModel[26] = new ModelRendererTurbo(this, 63, 407, textureX, textureY); // Box 34
		turretModel[27] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 34
		turretModel[28] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Box 34
		turretModel[29] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Box 34
		turretModel[30] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Box 34
		turretModel[31] = new ModelRendererTurbo(this, 17, 281, textureX, textureY); // Box 34
		turretModel[32] = new ModelRendererTurbo(this, 169, 281, textureX, textureY); // Box 34
		turretModel[33] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 34
		turretModel[34] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 34
		turretModel[35] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 34
		turretModel[36] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 34
		turretModel[37] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 34
		turretModel[38] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 34
		turretModel[39] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 34
		turretModel[40] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 34
		turretModel[41] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 34
		turretModel[42] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 34
		turretModel[43] = new ModelRendererTurbo(this, 340, 317, textureX, textureY); // Box 34
		turretModel[44] = new ModelRendererTurbo(this, 432, 334, textureX, textureY); // Box 34
		turretModel[45] = new ModelRendererTurbo(this, 357, 101, textureX, textureY); // Box 34
		turretModel[46] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Box 34
		turretModel[47] = new ModelRendererTurbo(this, 425, 281, textureX, textureY); // Box 34
		turretModel[48] = new ModelRendererTurbo(this, 86, 19, textureX, textureY); // Box 34
		turretModel[49] = new ModelRendererTurbo(this, 112, 14, textureX, textureY); // Box 34
		turretModel[50] = new ModelRendererTurbo(this, 98, 14, textureX, textureY); // Box 34
		turretModel[51] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 34
		turretModel[52] = new ModelRendererTurbo(this, 424, 170, textureX, textureY); // Box 34
		turretModel[53] = new ModelRendererTurbo(this, 423, 169, textureX, textureY); // Box 34
		turretModel[54] = new ModelRendererTurbo(this, 113, 23, textureX, textureY); // Box 34
		turretModel[55] = new ModelRendererTurbo(this, 52, 320, textureX, textureY); // Box 34
		turretModel[56] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 34
		turretModel[57] = new ModelRendererTurbo(this, 470, 30, textureX, textureY); // Box 34
		turretModel[58] = new ModelRendererTurbo(this, 423, 17, textureX, textureY); // Box 34
		turretModel[59] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 34
		turretModel[60] = new ModelRendererTurbo(this, 458, 467, textureX, textureY); // Box 34
		turretModel[61] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Box 34

		turretModel[0].addShapeBox(-35F, 1F, -14F, 15, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[0].setRotationPoint(0F, -29F, 0F);

		turretModel[1].addShapeBox(-35F, 1F, 1F, 15, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[1].setRotationPoint(0F, -29F, 0F);

		turretModel[2].addShapeBox(-20F, 0F, 1F, 19, 11, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 34
		turretModel[2].setRotationPoint(0F, -29F, 0F);

		turretModel[3].addShapeBox(-20F, 0F, -14F, 19, 11, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[3].setRotationPoint(0F, -29F, 0F);

		turretModel[4].addShapeBox(-35F, 0F, 1F, 15, 1, 15, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[4].setRotationPoint(0F, -29F, 0F);

		turretModel[5].addShapeBox(-1F, 0F, -9F, 30, 11, 7, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[5].setRotationPoint(0F, -29F, 0F);

		turretModel[6].addShapeBox(-1F, 0F, 4F, 30, 11, 7, 0F,0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[6].setRotationPoint(0F, -29F, 0F);

		turretModel[7].addShapeBox(-1F, 2F, -23F, 27, 9, 9, 0F,4F, -6F, 1F, -15F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 6F, 0F, 1F, -15F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[7].setRotationPoint(0F, -29F, 0F);

		turretModel[8].addShapeBox(-1F, 0F, -14F, 30, 11, 5, 0F,0F, -2F, 0F, -3F, -9.5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[8].setRotationPoint(0F, -29F, 0F);

		turretModel[9].addShapeBox(-20F, 0F, -23F, 19, 11, 9, 0F,0F, -6F, -0.5F, -4F, -8F, 1F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -2F, -0.5F, -6F, 0F, 1F, -6F, 0F, -10F, 0F, 0F, -7F); // Box 34
		turretModel[9].setRotationPoint(0F, -29F, 0F);

		turretModel[10].addShapeBox(-20F, 0F, -14F, 19, 11, 5, 0F,0F, -1F, 7F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 34
		turretModel[10].setRotationPoint(0F, -29F, 0F);

		turretModel[11].addShapeBox(-35F, 1F, -21F, 15, 10, 7, 0F,0F, -1F, -6F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[11].setRotationPoint(0F, -29F, 0F);

		turretModel[12].addShapeBox(-35F, 6F, -22F, 15, 5, 1, 0F,0F, 3F, -6F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 4F, 6F, 0F, -1F, -6F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 34
		turretModel[12].setRotationPoint(0F, -29F, 0F);

		turretModel[13].addShapeBox(-7F, 11F, -24F, 18, 2, 14, 0F,0F, 0F, 0F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[13].setRotationPoint(0F, -29F, 0F);

		turretModel[14].addShapeBox(11F, 11F, -23F, 15, 2, 14, 0F,0F, -0.25F, 0F, 0F, 0F, -9F, 3F, 0.75F, 0F, 0F, -0.25F, 0F, 3F, 0F, -7F, -11F, 0F, -13F, -11F, 0F, 0F, 2F, 0F, 0F); // Box 34
		turretModel[14].setRotationPoint(0F, -29F, 0F);

		turretModel[15].addShapeBox(-1F, 0F, 11F, 30, 11, 5, 0F,0F, 0F, 0F, 0F, -9F, 0F, -3F, -9.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[15].setRotationPoint(0F, -29F, 0F);

		turretModel[16].addShapeBox(-20F, 0F, 11F, 19, 11, 5, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); // Box 34
		turretModel[16].setRotationPoint(0F, -29F, 0F);

		turretModel[17].addShapeBox(-1F, 2F, 16F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, -7.5F, 0F, -15F, -7.5F, 0F, 4F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0.25F, 0F, 6F, 0F, 1F); // Box 34
		turretModel[17].setRotationPoint(0F, -29F, 0F);

		turretModel[18].addShapeBox(-20F, 0F, 16F, 19, 11, 9, 0F,0F, -1F, -7F, 0F, -2F, 0F, -4F, -8F, 1F, 0F, -6F, -0.5F, 0F, 0F, -7F, -6F, 0F, 0F, -6F, 0F, 1F, 0F, -2F, -0.5F); // Box 34
		turretModel[18].setRotationPoint(0F, -29F, 0F);

		turretModel[19].addShapeBox(-35F, 6F, 23F, 15, 5, 1, 0F,0F, 4F, 6F, 0F, 5F, 0F, 0F, 0F, 0.5F, 0F, 3F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -1F, -6F); // Box 34
		turretModel[19].setRotationPoint(0F, -29F, 0F);

		turretModel[20].addShapeBox(-35F, 1F, 16F, 15, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 34
		turretModel[20].setRotationPoint(0F, -29F, 0F);

		turretModel[21].addShapeBox(-20F, 11F, -24F, 13, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 34
		turretModel[21].setRotationPoint(0F, -29F, 0F);

		turretModel[22].addShapeBox(-20F, 11F, 12F, 13, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, -8F); // Box 34
		turretModel[22].setRotationPoint(0F, -29F, 0F);

		turretModel[23].addShapeBox(-7F, 11F, 12F, 18, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, -7F); // Box 34
		turretModel[23].setRotationPoint(0F, -29F, 0F);

		turretModel[24].addShapeBox(-20F, 11F, -10F, 15, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 34
		turretModel[24].setRotationPoint(0F, -29F, 0F);

		turretModel[25].addShapeBox(-1F, 0F, -2F, 15, 11, 6, 0F,0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[25].setRotationPoint(0F, -29F, 0F);

		turretModel[26].addShapeBox(-6F, -6F, -2F, 16, 7, 6, 0F,0F, -0.5F, 0F, 0F, -4.8F, 0F, 0F, -4.8F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[26].setRotationPoint(20F, -19F, 0F);

		turretModel[27].addShapeBox(10F, 10F, -9F, 19, 3, 7, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[27].setRotationPoint(0F, -29F, 0F);

		turretModel[28].addShapeBox(-44F, 8F, -15F, 9, 2, 32, 0F,1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F); // Box 34
		turretModel[28].setRotationPoint(0F, -29F, 0F);

		turretModel[29].addShapeBox(-45F, 8F, -10F, 1, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[29].setRotationPoint(0F, -31F, 0F);

		turretModel[30].addShapeBox(-45F, 7F, -10F, 1, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[30].setRotationPoint(0F, -31F, 0F);

		turretModel[31].addShapeBox(-45F, 6F, -10F, 1, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[31].setRotationPoint(0F, -31F, 0F);

		turretModel[32].addShapeBox(-45F, 5F, -10F, 1, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[32].setRotationPoint(0F, -31F, 0F);

		turretModel[33].addShapeBox(-45F, 6F, 12F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 1F, -1F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -1F, -1F, -10F, -1F, 0F); // Box 34
		turretModel[33].setRotationPoint(0F, -31F, 0F);

		turretModel[34].addShapeBox(-45F, 7F, 12F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 1F, -1F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -1F, -1F, -10F, -1F, 0F); // Box 34
		turretModel[34].setRotationPoint(0F, -31F, 0F);

		turretModel[35].addShapeBox(-45F, 8F, 12F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 1F, -1F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -1F, -1F, -10F, -1F, 0F); // Box 34
		turretModel[35].setRotationPoint(0F, -31F, 0F);

		turretModel[36].addShapeBox(-45F, 9F, 12F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 9F, 1F, -1F, -10F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, -1F, -1F, -10F, -1F, 0F); // Box 34
		turretModel[36].setRotationPoint(0F, -31F, 0F);

		turretModel[37].addShapeBox(-45F, 9F, -10F, 1, 0, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[37].setRotationPoint(0F, -31F, 0F);

		turretModel[38].addShapeBox(-45F, 5F, -15F, 1, 0, 5, 0F,-10F, 1F, 0F, 9F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 9F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[38].setRotationPoint(0F, -31F, 0F);

		turretModel[39].addShapeBox(-45F, 6F, -15F, 1, 0, 5, 0F,-10F, 1F, 0F, 9F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 9F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[39].setRotationPoint(0F, -31F, 0F);

		turretModel[40].addShapeBox(-45F, 7F, -15F, 1, 0, 5, 0F,-10F, 1F, 0F, 9F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 9F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[40].setRotationPoint(0F, -31F, 0F);

		turretModel[41].addShapeBox(-45F, 8F, -15F, 1, 0, 5, 0F,-10F, 1F, 0F, 9F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 9F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[41].setRotationPoint(0F, -31F, 0F);

		turretModel[42].addShapeBox(-45F, 9F, -15F, 1, 0, 5, 0F,-10F, 1F, 0F, 9F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -1F, 0F, 9F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[42].setRotationPoint(0F, -31F, 0F);

		turretModel[43].addShapeBox(-36F, 4F, 16F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[43].setRotationPoint(0F, -31F, 0F);

		turretModel[44].addShapeBox(-36F, 4F, -15F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[44].setRotationPoint(0F, -31F, 0F);

		turretModel[45].addShapeBox(-17F, 0F, 0F, 4, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[45].setRotationPoint(0F, -31F, 0F);

		turretModel[46].addShapeBox(-13F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 34
		turretModel[46].setRotationPoint(0F, -31F, 0F);

		turretModel[47].addShapeBox(-19F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 34
		turretModel[47].setRotationPoint(0F, -31F, 0F);

		turretModel[48].addShapeBox(-19F, 1F, -2F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[48].setRotationPoint(0F, -31F, 0F);

		turretModel[49].addShapeBox(-11F, 1F, -2F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 34
		turretModel[49].setRotationPoint(0F, -31F, 0F);

		turretModel[50].addShapeBox(-21F, 1F, -2F, 2, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 34
		turretModel[50].setRotationPoint(0F, -31F, 0F);

		turretModel[51].addShapeBox(-3F, -1F, 4F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[51].setRotationPoint(0F, -31F, 0F);

		turretModel[52].addShapeBox(4F, -1F, 4F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[52].setRotationPoint(0F, -31F, 0F);

		turretModel[53].addShapeBox(4F, -1F, 10F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[53].setRotationPoint(0F, -31F, 0F);

		turretModel[54].addShapeBox(-7F, -5.85F, -1F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[54].setRotationPoint(20F, -19F, 0F);

		turretModel[55].addShapeBox(-7F, -6.85F, 0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[55].setRotationPoint(20F, -19F, 0F);

		turretModel[56].addShapeBox(-7F, -7.85F, 0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[56].setRotationPoint(20F, -19F, 0F);

		turretModel[57].addShapeBox(-7F, -8.85F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[57].setRotationPoint(20F, -19F, 0F);

		turretModel[58].addShapeBox(-6F, -8.55F, 0.5F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 34
		turretModel[58].setRotationPoint(20F, -19F, 0F);

		turretModel[59].addShapeBox(10F, 10F, 4F, 19, 3, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[59].setRotationPoint(0F, -29F, 0F);

		turretModel[60].addShapeBox(10F, 11F, -2F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[60].setRotationPoint(0F, -29F, 0F);

		turretModel[61].addShapeBox(11F, 11F, 11F, 15, 2, 14, 0F,0F, -0.25F, 0F, 3F, 0.75F, 0F, 0F, 0F, -9F, 0F, -0.25F, 0F, 2F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, -13F, 3F, 0F, -7F); // Box 34
		turretModel[61].setRotationPoint(0F, -29F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 34
		barrelModel[1] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 34
		barrelModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 34
		barrelModel[3] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 34
		barrelModel[4] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 34
		barrelModel[5] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 34
		barrelModel[6] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 34
		barrelModel[7] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 34
		barrelModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 34
		barrelModel[9] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 34
		barrelModel[10] = new ModelRendererTurbo(this, 233, 273, textureX, textureY); // Box 34
		barrelModel[11] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 34
		barrelModel[12] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 34

		barrelModel[0].addShapeBox(10F, -2F, -1F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		barrelModel[0].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[1].addShapeBox(10F, -1F, -1F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		barrelModel[1].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[2].addShapeBox(10F, 0F, -1F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 34
		barrelModel[2].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[3].addShapeBox(23F, -1F, -1F, 25, 1, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 34
		barrelModel[3].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[4].addShapeBox(23F, -2F, -1F, 25, 1, 3, 0F,0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 34
		barrelModel[4].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[5].addShapeBox(23F, 0F, -1F, 25, 1, 3, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F); // Box 34
		barrelModel[5].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[6].addShapeBox(15F, -1.85F, -1.5F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		barrelModel[6].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[7].addShapeBox(15F, -2.85F, -1.5F, 8, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		barrelModel[7].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[8].addShapeBox(15F, 0.149999999999999F, -1.5F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 34
		barrelModel[8].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[9].addShapeBox(46F, -1.5F, -0.5F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 34
		barrelModel[9].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[10].addShapeBox(1F, -1.85F, -1.5F, 9, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		barrelModel[10].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[11].addShapeBox(1F, -2.85F, -1.5F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		barrelModel[11].setRotationPoint(20.5F, -19F, 0F);

		barrelModel[12].addShapeBox(1F, 0.149999999999999F, -1.5F, 9, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 34
		barrelModel[12].setRotationPoint(20.5F, -19F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 34
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 34
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 34
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 34
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 34
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 34
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 34
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 34
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 34
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 34
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 34
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 34
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 34
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 34
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 34
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 34
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 34
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 34
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 34
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 34
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 34
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 34
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 34
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 34
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 34
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 34
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 34
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 34
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 34
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 34
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 34
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 34
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 34
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 34
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 34
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 34
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 34
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Box 34
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 89, 273, textureX, textureY); // Box 34
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 113, 273, textureX, textureY); // Box 34
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Box 34
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 153, 273, textureX, textureY); // Box 34
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Box 34

		leftTrackWheelModels[0].addShapeBox(-1F, -1F, -6F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[0].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[1].addShapeBox(-3.5F, -1.5F, -5F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[1].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[2].addShapeBox(-3.5F, -3.5F, -5F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[2].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[3].addShapeBox(-3.5F, 1.5F, -5F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftTrackWheelModels[3].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[4].addShapeBox(-4.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[4].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[5].addShapeBox(-1.5F, -4.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[5].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[6].addShapeBox(1.5F, -4.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[6].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[7].addShapeBox(3.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[7].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[8].addShapeBox(-5.5F, -4.5F, -6F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		leftTrackWheelModels[8].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[9].addShapeBox(1.5F, 3.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[9].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[10].addShapeBox(-5.5F, 3.5F, -6F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		leftTrackWheelModels[10].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[11].addShapeBox(-1.5F, 3.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[11].setRotationPoint(34F, 3F, 24F);

		leftTrackWheelModels[12].addShapeBox(1.5F, 3.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[12].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[13].addShapeBox(-3.5F, -3.5F, -5F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[13].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[14].addShapeBox(-3.5F, 1.5F, -5F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftTrackWheelModels[14].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[15].addShapeBox(-1.5F, 3.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[15].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[16].addShapeBox(-5.5F, 3.5F, -6F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		leftTrackWheelModels[16].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[17].addShapeBox(-4.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[17].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[18].addShapeBox(-5.5F, -4.5F, -6F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		leftTrackWheelModels[18].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[19].addShapeBox(-1.5F, -4.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[19].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[20].addShapeBox(1.5F, -4.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[20].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[21].addShapeBox(3.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[21].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[22].addShapeBox(-1F, -1F, -6F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[22].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[23].addShapeBox(-3.5F, -1.5F, -5F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[23].setRotationPoint(23F, 3F, 24F);

		leftTrackWheelModels[24].addShapeBox(1.5F, 3.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[24].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[25].addShapeBox(-3.5F, -3.5F, -5F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[25].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[26].addShapeBox(-3.5F, 1.5F, -5F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftTrackWheelModels[26].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[27].addShapeBox(-1.5F, 3.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[27].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[28].addShapeBox(-5.5F, 3.5F, -6F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		leftTrackWheelModels[28].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[29].addShapeBox(-4.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[29].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[30].addShapeBox(-5.5F, -4.5F, -6F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		leftTrackWheelModels[30].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[31].addShapeBox(-1.5F, -4.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[31].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[32].addShapeBox(1.5F, -4.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[32].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[33].addShapeBox(3.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[33].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[34].addShapeBox(-1F, -1F, -6F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[34].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[35].addShapeBox(-3.5F, -1.5F, -5F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[35].setRotationPoint(9F, 3F, 24F);

		leftTrackWheelModels[36].addShapeBox(1.5F, 3.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[36].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[37].addShapeBox(-3.5F, -3.5F, -5F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[37].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[38].addShapeBox(-3.5F, 1.5F, -5F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftTrackWheelModels[38].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[39].addShapeBox(-1.5F, 3.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[39].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[40].addShapeBox(-5.5F, 3.5F, -6F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		leftTrackWheelModels[40].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[41].addShapeBox(-4.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[41].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[42].addShapeBox(-5.5F, -4.5F, -6F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		leftTrackWheelModels[42].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[43].addShapeBox(-1.5F, -4.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[43].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[44].addShapeBox(1.5F, -4.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[44].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[45].addShapeBox(3.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[45].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[46].addShapeBox(-1F, -1F, -6F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[46].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[47].addShapeBox(-3.5F, -1.5F, -5F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[47].setRotationPoint(-2F, 3F, 24F);

		leftTrackWheelModels[48].addShapeBox(1.5F, 3.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[48].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[49].addShapeBox(-3.5F, -3.5F, -5F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[49].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[50].addShapeBox(-3.5F, 1.5F, -5F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftTrackWheelModels[50].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[51].addShapeBox(-1.5F, 3.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[51].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[52].addShapeBox(-5.5F, 3.5F, -6F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		leftTrackWheelModels[52].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[53].addShapeBox(-4.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[53].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[54].addShapeBox(-5.5F, -4.5F, -6F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		leftTrackWheelModels[54].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[55].addShapeBox(-1.5F, -4.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[55].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[56].addShapeBox(1.5F, -4.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[56].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[57].addShapeBox(3.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[57].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[58].addShapeBox(-1F, -1F, -6F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[58].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[59].addShapeBox(-3.5F, -1.5F, -5F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[59].setRotationPoint(-17F, 3F, 24F);

		leftTrackWheelModels[60].addShapeBox(1.5F, 3.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[60].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[61].addShapeBox(-3.5F, -3.5F, -5F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[61].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[62].addShapeBox(-3.5F, 1.5F, -5F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftTrackWheelModels[62].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[63].addShapeBox(-1.5F, 3.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[63].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[64].addShapeBox(-5.5F, 3.5F, -6F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		leftTrackWheelModels[64].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[65].addShapeBox(-4.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[65].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[66].addShapeBox(-5.5F, -4.5F, -6F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		leftTrackWheelModels[66].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[67].addShapeBox(-1.5F, -4.5F, -6F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[67].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[68].addShapeBox(1.5F, -4.5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[68].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[69].addShapeBox(3.5F, -1.5F, -6F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[69].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[70].addShapeBox(-1F, -1F, -6F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[70].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[71].addShapeBox(-3.5F, -1.5F, -5F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[71].setRotationPoint(-28F, 3F, 24F);

		leftTrackWheelModels[72].addShapeBox(-4F, 2F, -6F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftTrackWheelModels[72].setRotationPoint(46F, -3F, 23F);

		leftTrackWheelModels[73].addShapeBox(-4F, -2F, -6F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[73].setRotationPoint(46F, -3F, 23F);

		leftTrackWheelModels[74].addShapeBox(-4F, -4F, -6F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[74].setRotationPoint(46F, -3F, 23F);

		leftTrackWheelModels[75].addShapeBox(-1F, -1F, -6F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[75].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[76].addShapeBox(-4F, -2F, -5F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[76].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[77].addShapeBox(-4F, -4F, -5F, 8, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[77].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[78].addShapeBox(-2F, -5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[78].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[79].addShapeBox(2F, -5F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[79].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[80].addShapeBox(4F, -2F, -6F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[80].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[81].addShapeBox(2F, 4F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[81].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[82].addShapeBox(-2F, 4F, -6F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[82].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[83].addShapeBox(-6F, 4F, -6F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		leftTrackWheelModels[83].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[84].addShapeBox(-5F, -2F, -6F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[84].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[85].addShapeBox(-6F, -5F, -6F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		leftTrackWheelModels[85].setRotationPoint(-39F, -3F, 24F);

		leftTrackWheelModels[86].addShapeBox(-4F, 2F, -5F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftTrackWheelModels[86].setRotationPoint(-39F, -3F, 24F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 34
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Box 34
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 34
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 34
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 25, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 73, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 497, 233, textureX, textureY); // Box 34
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 385, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 433, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 34
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 25, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 41, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Box 34
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 57, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 297, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Box 34
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Box 34
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 337, 265, textureX, textureY); // Box 34

		rightTrackWheelModels[0].addShapeBox(-4F, 2F, -1F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackWheelModels[0].setRotationPoint(46F, -3F, -23F);

		rightTrackWheelModels[1].addShapeBox(-4F, -2F, -1F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[1].setRotationPoint(46F, -3F, -23F);

		rightTrackWheelModels[2].addShapeBox(-4F, -4F, -1F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[2].setRotationPoint(46F, -3F, -23F);

		rightTrackWheelModels[3].addShapeBox(-1F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[3].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[4].addShapeBox(-3.5F, -1.5F, 1F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[4].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[5].addShapeBox(-3.5F, -3.5F, 1F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[5].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[6].addShapeBox(-3.5F, 1.5F, 1F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackWheelModels[6].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[7].addShapeBox(-4.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[7].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[8].addShapeBox(-1.5F, -4.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[8].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[9].addShapeBox(1.5F, -4.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[9].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[10].addShapeBox(3.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[10].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[11].addShapeBox(-5.5F, -4.5F, 0F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		rightTrackWheelModels[11].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[12].addShapeBox(1.5F, 3.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[12].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[13].addShapeBox(-5.5F, 3.5F, 0F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		rightTrackWheelModels[13].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[14].addShapeBox(-1.5F, 3.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[14].setRotationPoint(34F, 3F, -24F);

		rightTrackWheelModels[15].addShapeBox(1.5F, 3.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[15].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[16].addShapeBox(-3.5F, -3.5F, 1F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[16].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[17].addShapeBox(-3.5F, 1.5F, 1F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackWheelModels[17].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[18].addShapeBox(-1.5F, 3.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[18].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[19].addShapeBox(-5.5F, 3.5F, 0F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		rightTrackWheelModels[19].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[20].addShapeBox(-4.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[20].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[21].addShapeBox(-5.5F, -4.5F, 0F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		rightTrackWheelModels[21].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[22].addShapeBox(-1.5F, -4.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[22].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[23].addShapeBox(1.5F, -4.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[23].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[24].addShapeBox(3.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[24].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[25].addShapeBox(-1F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[25].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[26].addShapeBox(-3.5F, -1.5F, 1F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[26].setRotationPoint(23F, 3F, -24F);

		rightTrackWheelModels[27].addShapeBox(1.5F, 3.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[27].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[28].addShapeBox(-3.5F, -3.5F, 1F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[28].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[29].addShapeBox(-3.5F, 1.5F, 1F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackWheelModels[29].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[30].addShapeBox(-1.5F, 3.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[30].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[31].addShapeBox(-5.5F, 3.5F, 0F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		rightTrackWheelModels[31].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[32].addShapeBox(-4.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[32].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[33].addShapeBox(-5.5F, -4.5F, 0F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		rightTrackWheelModels[33].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[34].addShapeBox(-1.5F, -4.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[34].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[35].addShapeBox(1.5F, -4.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[35].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[36].addShapeBox(3.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[36].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[37].addShapeBox(-1F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[37].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[38].addShapeBox(-3.5F, -1.5F, 1F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[38].setRotationPoint(9F, 3F, -24F);

		rightTrackWheelModels[39].addShapeBox(1.5F, 3.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[39].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[40].addShapeBox(-3.5F, -3.5F, 1F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[40].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[41].addShapeBox(-3.5F, 1.5F, 1F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackWheelModels[41].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[42].addShapeBox(-1.5F, 3.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[42].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[43].addShapeBox(-5.5F, 3.5F, 0F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		rightTrackWheelModels[43].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[44].addShapeBox(-4.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[44].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[45].addShapeBox(-5.5F, -4.5F, 0F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		rightTrackWheelModels[45].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[46].addShapeBox(-1.5F, -4.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[46].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[47].addShapeBox(1.5F, -4.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[47].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[48].addShapeBox(3.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[48].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[49].addShapeBox(-1F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[49].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[50].addShapeBox(-3.5F, -1.5F, 1F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[50].setRotationPoint(-2F, 3F, -24F);

		rightTrackWheelModels[51].addShapeBox(1.5F, 3.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[51].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[52].addShapeBox(-3.5F, -3.5F, 1F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[52].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[53].addShapeBox(-3.5F, 1.5F, 1F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackWheelModels[53].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[54].addShapeBox(-1.5F, 3.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[54].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[55].addShapeBox(-5.5F, 3.5F, 0F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		rightTrackWheelModels[55].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[56].addShapeBox(-4.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[56].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[57].addShapeBox(-5.5F, -4.5F, 0F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		rightTrackWheelModels[57].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[58].addShapeBox(-1.5F, -4.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[58].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[59].addShapeBox(1.5F, -4.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[59].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[60].addShapeBox(3.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[60].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[61].addShapeBox(-1F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[61].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[62].addShapeBox(-3.5F, -1.5F, 1F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[62].setRotationPoint(-17F, 3F, -24F);

		rightTrackWheelModels[63].addShapeBox(1.5F, 3.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[63].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[64].addShapeBox(-3.5F, -3.5F, 1F, 7, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[64].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[65].addShapeBox(-3.5F, 1.5F, 1F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackWheelModels[65].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[66].addShapeBox(-1.5F, 3.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[66].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[67].addShapeBox(-5.5F, 3.5F, 0F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		rightTrackWheelModels[67].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[68].addShapeBox(-4.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[68].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[69].addShapeBox(-5.5F, -4.5F, 0F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		rightTrackWheelModels[69].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[70].addShapeBox(-1.5F, -4.5F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[70].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[71].addShapeBox(1.5F, -4.5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[71].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[72].addShapeBox(3.5F, -1.5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[72].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[73].addShapeBox(-1F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[73].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[74].addShapeBox(-3.5F, -1.5F, 1F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[74].setRotationPoint(-28F, 3F, -24F);

		rightTrackWheelModels[75].addShapeBox(-4F, -2F, 1F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[75].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[76].addShapeBox(-4F, -4F, 1F, 8, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[76].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[77].addShapeBox(-4F, 2F, 1F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		rightTrackWheelModels[77].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[78].addShapeBox(-6F, 4F, 0F, 4, 1, 6, 0F,-2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 34
		rightTrackWheelModels[78].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[79].addShapeBox(-5F, -2F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[79].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[80].addShapeBox(-6F, -5F, 0F, 4, 1, 6, 0F,-1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F); // Box 34
		rightTrackWheelModels[80].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[81].addShapeBox(-2F, -5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[81].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[82].addShapeBox(2F, -5F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[82].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[83].addShapeBox(4F, -2F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[83].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[84].addShapeBox(2F, 4F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[84].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[85].addShapeBox(-2F, 4F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[85].setRotationPoint(-39F, -3F, -24F);

		rightTrackWheelModels[86].addShapeBox(-1F, -1F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackWheelModels[86].setRotationPoint(-39F, -3F, -24F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 34
		leftTrackModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 34
		leftTrackModel[2] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 34
		leftTrackModel[3] = new ModelRendererTurbo(this, 268, 192, textureX, textureY); // Box 34
		leftTrackModel[4] = new ModelRendererTurbo(this, 316, 192, textureX, textureY); // Box 34
		leftTrackModel[5] = new ModelRendererTurbo(this, 351, 193, textureX, textureY); // Box 34
		leftTrackModel[6] = new ModelRendererTurbo(this, 2, 210, textureX, textureY); // Box 34
		leftTrackModel[7] = new ModelRendererTurbo(this, 227, 177, textureX, textureY); // Box 34
		leftTrackModel[8] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 34
		leftTrackModel[9] = new ModelRendererTurbo(this, 325, 192, textureX, textureY); // Box 34
		leftTrackModel[10] = new ModelRendererTurbo(this, 394, 193, textureX, textureY); // Box 34
		leftTrackModel[11] = new ModelRendererTurbo(this, 395, 193, textureX, textureY); // Box 34

		leftTrackModel[0].addShapeBox(-50F, -7F, -25F, 80, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackModel[0].setRotationPoint(12F, -2F, 0F);

		leftTrackModel[1].addShapeBox(32F, -7F, -25F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackModel[1].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[2].addShapeBox(38F, -5F, -25F, 3, 1, 8, 0F,-1F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackModel[2].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[3].addShapeBox(40F, -2F, -25F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackModel[3].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[4].addShapeBox(38F, 2F, -25F, 3, 1, 8, 0F,0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -0.5F, 0F); // Box 34
		leftTrackModel[4].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[5].addShapeBox(32F, 4F, -25F, 7, 1, 8, 0F,5F, -5F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 5F, -5F, 0F, 5.6F, 5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 5.6F, 5F, 0F); // Box 34
		leftTrackModel[5].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[6].addShapeBox(-40F, 9F, -25F, 67, 1, 8, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackModel[6].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[7].addShapeBox(-48F, 7F, -25F, 9, 1, 8, 0F,5F, 5F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, 5F, 5F, 0F, 5F, -5F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 5F, -5F, 0F); // Box 34
		leftTrackModel[7].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[8].addShapeBox(-55F, 2F, -25F, 2, 1, 8, 0F,-0.6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 34
		leftTrackModel[8].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[9].addShapeBox(-55F, -2F, -25F, 1, 2, 8, 0F,0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F); // Box 34
		leftTrackModel[9].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[10].addShapeBox(-55F, -5F, -25F, 2, 1, 8, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 2F, 0F); // Box 34
		leftTrackModel[10].setRotationPoint(10F, -2F, 0F);

		leftTrackModel[11].addShapeBox(-53F, -7F, -25F, 5, 1, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 34
		leftTrackModel[11].setRotationPoint(10F, -2F, 0F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 34
		rightTrackModel[1] = new ModelRendererTurbo(this, 266, 193, textureX, textureY); // Box 34
		rightTrackModel[2] = new ModelRendererTurbo(this, 58, 208, textureX, textureY); // Box 34
		rightTrackModel[3] = new ModelRendererTurbo(this, 186, 176, textureX, textureY); // Box 34
		rightTrackModel[4] = new ModelRendererTurbo(this, 346, 193, textureX, textureY); // Box 34
		rightTrackModel[5] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 34
		rightTrackModel[6] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 34
		rightTrackModel[7] = new ModelRendererTurbo(this, 277, 193, textureX, textureY); // Box 34
		rightTrackModel[8] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 34
		rightTrackModel[9] = new ModelRendererTurbo(this, 374, 192, textureX, textureY); // Box 34
		rightTrackModel[10] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 34
		rightTrackModel[11] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 34

		rightTrackModel[0].addShapeBox(-40F, 9F, 17F, 67, 1, 8, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackModel[0].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[1].addShapeBox(-48F, 7F, 17F, 9, 1, 8, 0F,5F, 5F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, 5F, 5F, 0F, 5F, -5F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 5F, -5F, 0F); // Box 34
		rightTrackModel[1].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[2].addShapeBox(-55F, 2F, 17F, 2, 1, 8, 0F,-0.6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 34
		rightTrackModel[2].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[3].addShapeBox(-55F, -2F, 17F, 1, 2, 8, 0F,0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.5F, 0F); // Box 34
		rightTrackModel[3].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[4].addShapeBox(-55F, -5F, 17F, 2, 1, 8, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 2F, 0F); // Box 34
		rightTrackModel[4].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[5].addShapeBox(-53F, -7F, 17F, 5, 1, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 34
		rightTrackModel[5].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[6].addShapeBox(-50F, -7F, 17F, 80, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackModel[6].setRotationPoint(12F, -2F, 0F);

		rightTrackModel[7].addShapeBox(32F, 4F, 17F, 7, 1, 8, 0F,5F, -5F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 5F, -5F, 0F, 5.6F, 5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 5.6F, 5F, 0F); // Box 34
		rightTrackModel[7].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[8].addShapeBox(38F, 2F, 17F, 3, 1, 8, 0F,0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -0.5F, 0F); // Box 34
		rightTrackModel[8].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[9].addShapeBox(40F, -2F, 17F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackModel[9].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[10].addShapeBox(38F, -5F, 17F, 3, 1, 8, 0F,-1F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackModel[10].setRotationPoint(10F, -2F, 0F);

		rightTrackModel[11].addShapeBox(32F, -7F, 17F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F); // Box 34
		rightTrackModel[11].setRotationPoint(10F, -2F, 0F);
	}
}