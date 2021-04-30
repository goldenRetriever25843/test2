//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Cargo
// Model Creator: 
// Created on: 20.06.2016 - 22:15:46
// Last changed on: 20.06.2016 - 22:15:46

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCargoShippu extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCargoShippu() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];
		leftFrontWheelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 259
		bodyModel[17] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 260
		bodyModel[18] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 261
		bodyModel[19] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 262
		bodyModel[20] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 53
		bodyModel[46] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 54

		bodyModel[0].addShapeBox(0F, 0F, 0F, 120, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 1
		bodyModel[0].setRotationPoint(-60F, 0F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 10, 30, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F); // Box 2
		bodyModel[1].setRotationPoint(-82F, 0F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 10, 30, 0F,0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, -1F, -13F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, -13F); // Box 4
		bodyModel[2].setRotationPoint(-97F, 0F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 9, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, -5F, -8F, 0F, 0F, -7F, 0F, 0F, -7F, -1F, -5F, -8F); // Box 5
		bodyModel[3].setRotationPoint(-107F, 0F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // Box 6
		bodyModel[4].setRotationPoint(60F, 0F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 10, 30, 0F,0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -7F); // Box 7
		bodyModel[5].setRotationPoint(82F, 0F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 10, 18, 0F,0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -6F, -2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, -6F); // Box 8
		bodyModel[6].setRotationPoint(97F, 0F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 8, 18, 0F,0F, 0F, -6F, -2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -8F, -5F, 0F, -9F, -5F, 0F, -9F, 0F, 0F, -8F); // Box 9
		bodyModel[7].setRotationPoint(97F, 10F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 8, 30, 0F,0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -12F); // Box 10
		bodyModel[8].setRotationPoint(82F, 10F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 22, 8, 30, 0F,0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -10F); // Box 11
		bodyModel[9].setRotationPoint(60F, 10F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 60, 8, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -8F); // Box 12
		bodyModel[10].setRotationPoint(0F, 10F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 60, 8, 30, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -10F); // Box 13
		bodyModel[11].setRotationPoint(-60F, 10F, -15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 22, 8, 30, 0F,0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -13F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -13F); // Box 14
		bodyModel[12].setRotationPoint(-82F, 10F, -15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 15, 8, 30, 0F,0F, 1F, -13F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 1F, -13F, -2.5F, 0F, -14F, 0F, 0F, -13F, 0F, 0F, -13F, -2.5F, 0F, -14F); // Box 15
		bodyModel[13].setRotationPoint(-97F, 10F, -15F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 16
		bodyModel[14].setRotationPoint(-103F, 16F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 17
		bodyModel[15].setRotationPoint(-102.5F, 5F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[16].setRotationPoint(-101F, 11F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[17].setRotationPoint(-100F, 11.5F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[18].setRotationPoint(-100F, 11.5F, 0F);
		bodyModel[18].rotateAngleX = 4.1887902F;

		bodyModel[19].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[19].setRotationPoint(-100F, 11.5F, 0F);
		bodyModel[19].rotateAngleX = 2.0943951F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 38, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(-26F, -6F, -13F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 32, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-23F, -9F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 23, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-13.9F, -13F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 26
		bodyModel[23].setRotationPoint(1F, -16F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(6F, -16F, -14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(6F, -12F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(6F, -12F, 13F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[27].setRotationPoint(-29F, -6F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-3.7F, -25F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 32
		bodyModel[29].setRotationPoint(3.3F, -32F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 33
		bodyModel[30].setRotationPoint(3.3F, -37F, -0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 34
		bodyModel[31].setRotationPoint(3.3F, -30.3F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 35
		bodyModel[32].setRotationPoint(1.8F, -30.7F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, -2F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, 0F, -2F, -0.45F, -0.4F, 1F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 1F, -0.45F); // Box 36
		bodyModel[33].setRotationPoint(-3.9F, -36.5F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 22, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 37
		bodyModel[34].setRotationPoint(60F, -3F, -15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 5, 30, 0F,0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F); // Box 38
		bodyModel[35].setRotationPoint(82F, -5F, -15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 5, 18, 0F,0F, 0F, -3F, 1F, 0F, -8F, 1F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F); // Box 39
		bodyModel[36].setRotationPoint(97F, -5F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(-76F, -1F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(-50F, -1F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[39].setRotationPoint(26F, -8F, -6F);
		bodyModel[39].rotateAngleY = -0.52359878F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[40].setRotationPoint(18F, -8F, -7F);
		bodyModel[40].rotateAngleY = 0.20943951F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[41].setRotationPoint(40F, -8F, -1F);
		bodyModel[41].rotateAngleY = 1.32645023F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[42].setRotationPoint(48F, -8F, -1F);
		bodyModel[42].rotateAngleY = 0.78539816F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[43].setRotationPoint(39F, -8F, -10F);
		bodyModel[43].rotateAngleY = 0.08726646F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[44].setRotationPoint(22F, -8F, 5F);
		bodyModel[44].rotateAngleY = -0.43633231F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[45].setRotationPoint(10F, -3F, 14F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 50, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[46].setRotationPoint(10F, -3F, -15F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 18

		leftFrontWheelModel[0].addShapeBox(-4F, -3F, -0.5F, 4, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 18
		leftFrontWheelModel[0].setRotationPoint(-102F, 10F, 0F);
	}
}