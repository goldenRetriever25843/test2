//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
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

public class ModelEliteCargo extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelEliteCargo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];
		bodyDoorCloseModel = new ModelRendererTurbo[261];
		leftFrontWheelModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initbodyDoorCloseModel_1();
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
		bodyModel[23] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 53
		bodyModel[36] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 54
		bodyModel[37] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52

		bodyModel[0].addShapeBox(0F, 0F, 0F, 120, 10, 30, 0F,0F, 0F, 0F, 44F, 0F, 0F, 44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 44F, 0F, -2F, 44F, 0F, -2F, 0F, 0F, -2F); // Box 1
		bodyModel[0].setRotationPoint(-60F, 0F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F); // Box 2
		bodyModel[1].setRotationPoint(-82F, 0F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 10, 30, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -11F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, -11F); // Box 4
		bodyModel[2].setRotationPoint(-97F, 0F, -15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 9, 18, 0F,-6F, 0F, 4F, 0F, 0F, 5F, 0F, 0F, 5F, -6F, 0F, 4F, -7F, -5F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, -7F, -5F, -6F); // Box 5
		bodyModel[3].setRotationPoint(-107F, 0F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // Box 6
		bodyModel[4].setRotationPoint(104F, 0F, -15F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 10, 30, 0F,0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -7F); // Box 7
		bodyModel[5].setRotationPoint(126F, 0F, -15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 10, 10, 18, 0F,0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -6F, -2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, -6F); // Box 8
		bodyModel[6].setRotationPoint(141F, 0F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 8, 18, 0F,0F, 0F, -6F, -2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -8F, -5F, 0F, -9F, -5F, 0F, -9F, 0F, 0F, -8F); // Box 9
		bodyModel[7].setRotationPoint(141F, 10F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 8, 30, 0F,0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -7F, 0F, 0F, -12F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -12F); // Box 10
		bodyModel[8].setRotationPoint(126F, 10F, -15F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 22, 8, 30, 0F,0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -10F); // Box 11
		bodyModel[9].setRotationPoint(104F, 10F, -15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 60, 8, 30, 0F,0F, 0F, -2F, 44F, 0F, -2F, 44F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F, 44F, 0F, -10F, 44F, 0F, -10F, 0F, 0F, -8F); // Box 12
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

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 6, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(-34F, -6F, -15F);

		bodyModel[21].addShapeBox(-30F, 0F, 0F, 12, 10, 24, 0F,0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 24
		bodyModel[21].setRotationPoint(-4F, -16F, -12F);

		bodyModel[22].addShapeBox(-29F, 0F, 0F, 2, 11, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(9.8F, -18F, -13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-22F, -22F, -14F);

		bodyModel[24].addShapeBox(0F, -3F, 0F, 5, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[24].setRotationPoint(-22F, -15F, -14F);

		bodyModel[25].addShapeBox(0F, -3F, 0F, 5, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[25].setRotationPoint(-22F, -15F, 13F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[26].setRotationPoint(-29F, -6F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 31
		bodyModel[27].setRotationPoint(-26.7F, -18F, 1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 32
		bodyModel[28].setRotationPoint(-19.7F, -32F, -0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 33
		bodyModel[29].setRotationPoint(-19.7F, -37F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 34
		bodyModel[30].setRotationPoint(-19.7F, -30.3F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F); // Box 35
		bodyModel[31].setRotationPoint(-21.5F, -30.7F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 22, 3, 30, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(104F, -3F, -15F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 15, 5, 30, 0F,0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -4F); // Box 38
		bodyModel[33].setRotationPoint(126F, -5F, -15F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 5, 18, 0F,0F, 0F, -3F, 1F, 0F, -8F, 1F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -3F); // Box 39
		bodyModel[34].setRotationPoint(141F, -5F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 82, 3, 1, 0F,0F, 0F, 0F, 44F, 0F, 0F, 44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 44F, 0F, 0F, 44F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[35].setRotationPoint(-22F, -3F, 14F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 82, 3, 1, 0F,0F, 0F, 0F, 44F, 0F, 0F, 44F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 44F, 0F, 0F, 44F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[36].setRotationPoint(-22F, -3F, -15F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 4, 28, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[37].setRotationPoint(-22F, -4F, -14F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 50
		bodyModel[38].setRotationPoint(-26.7F, -18F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 51
		bodyModel[39].setRotationPoint(-32.7F, -18F, -5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 1F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 52
		bodyModel[40].setRotationPoint(-32.7F, -18F, 1F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 47
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 53
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 54
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 55
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 56
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 57
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 58
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 59
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 60
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 61
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 62
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 63
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 64
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 65
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 66
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 67
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 68
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 69
		bodyDoorCloseModel[18] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 70
		bodyDoorCloseModel[19] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 71
		bodyDoorCloseModel[20] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 72
		bodyDoorCloseModel[21] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 73
		bodyDoorCloseModel[22] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 74
		bodyDoorCloseModel[23] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Box 75
		bodyDoorCloseModel[24] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 76
		bodyDoorCloseModel[25] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 77
		bodyDoorCloseModel[26] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 78
		bodyDoorCloseModel[27] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 79
		bodyDoorCloseModel[28] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 80
		bodyDoorCloseModel[29] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 81
		bodyDoorCloseModel[30] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 82
		bodyDoorCloseModel[31] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 83
		bodyDoorCloseModel[32] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 84
		bodyDoorCloseModel[33] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 85
		bodyDoorCloseModel[34] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 86
		bodyDoorCloseModel[35] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 87
		bodyDoorCloseModel[36] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 88
		bodyDoorCloseModel[37] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 89
		bodyDoorCloseModel[38] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 90
		bodyDoorCloseModel[39] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 91
		bodyDoorCloseModel[40] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 92
		bodyDoorCloseModel[41] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 93
		bodyDoorCloseModel[42] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 94
		bodyDoorCloseModel[43] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 95
		bodyDoorCloseModel[44] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // Box 96
		bodyDoorCloseModel[45] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 97
		bodyDoorCloseModel[46] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 98
		bodyDoorCloseModel[47] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 99
		bodyDoorCloseModel[48] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 100
		bodyDoorCloseModel[49] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 101
		bodyDoorCloseModel[50] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 102
		bodyDoorCloseModel[51] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 103
		bodyDoorCloseModel[52] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 104
		bodyDoorCloseModel[53] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 105
		bodyDoorCloseModel[54] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 106
		bodyDoorCloseModel[55] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 107
		bodyDoorCloseModel[56] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 108
		bodyDoorCloseModel[57] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 109
		bodyDoorCloseModel[58] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 110
		bodyDoorCloseModel[59] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 111
		bodyDoorCloseModel[60] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 112
		bodyDoorCloseModel[61] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 113
		bodyDoorCloseModel[62] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 114
		bodyDoorCloseModel[63] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 115
		bodyDoorCloseModel[64] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 116
		bodyDoorCloseModel[65] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 117
		bodyDoorCloseModel[66] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 118
		bodyDoorCloseModel[67] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 119
		bodyDoorCloseModel[68] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 120
		bodyDoorCloseModel[69] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 121
		bodyDoorCloseModel[70] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 122
		bodyDoorCloseModel[71] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 123
		bodyDoorCloseModel[72] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 124
		bodyDoorCloseModel[73] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 125
		bodyDoorCloseModel[74] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 126
		bodyDoorCloseModel[75] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 127
		bodyDoorCloseModel[76] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 128
		bodyDoorCloseModel[77] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 129
		bodyDoorCloseModel[78] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Box 121
		bodyDoorCloseModel[79] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Box 122
		bodyDoorCloseModel[80] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 123
		bodyDoorCloseModel[81] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 124
		bodyDoorCloseModel[82] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 125
		bodyDoorCloseModel[83] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 128
		bodyDoorCloseModel[84] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 129
		bodyDoorCloseModel[85] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 131
		bodyDoorCloseModel[86] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 132
		bodyDoorCloseModel[87] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Box 133
		bodyDoorCloseModel[88] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 134
		bodyDoorCloseModel[89] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 135
		bodyDoorCloseModel[90] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 138
		bodyDoorCloseModel[91] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 139
		bodyDoorCloseModel[92] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 141
		bodyDoorCloseModel[93] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 142
		bodyDoorCloseModel[94] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 143
		bodyDoorCloseModel[95] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 144
		bodyDoorCloseModel[96] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 145
		bodyDoorCloseModel[97] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 147
		bodyDoorCloseModel[98] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 148
		bodyDoorCloseModel[99] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 149
		bodyDoorCloseModel[100] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Box 150
		bodyDoorCloseModel[101] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 151
		bodyDoorCloseModel[102] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 152
		bodyDoorCloseModel[103] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 153
		bodyDoorCloseModel[104] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 154
		bodyDoorCloseModel[105] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Box 155
		bodyDoorCloseModel[106] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Box 158
		bodyDoorCloseModel[107] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 159
		bodyDoorCloseModel[108] = new ModelRendererTurbo(this, 433, 265, textureX, textureY); // Box 160
		bodyDoorCloseModel[109] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 161
		bodyDoorCloseModel[110] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 162
		bodyDoorCloseModel[111] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 163
		bodyDoorCloseModel[112] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 164
		bodyDoorCloseModel[113] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Box 165
		bodyDoorCloseModel[114] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Box 166
		bodyDoorCloseModel[115] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Box 168
		bodyDoorCloseModel[116] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Box 169
		bodyDoorCloseModel[117] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 170
		bodyDoorCloseModel[118] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 171
		bodyDoorCloseModel[119] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 172
		bodyDoorCloseModel[120] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 173
		bodyDoorCloseModel[121] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 174
		bodyDoorCloseModel[122] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Box 176
		bodyDoorCloseModel[123] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 177
		bodyDoorCloseModel[124] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Box 179
		bodyDoorCloseModel[125] = new ModelRendererTurbo(this, 81, 281, textureX, textureY); // Box 180
		bodyDoorCloseModel[126] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Box 181
		bodyDoorCloseModel[127] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Box 182
		bodyDoorCloseModel[128] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 184
		bodyDoorCloseModel[129] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Box 185
		bodyDoorCloseModel[130] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Box 187
		bodyDoorCloseModel[131] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 188
		bodyDoorCloseModel[132] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 189
		bodyDoorCloseModel[133] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 190
		bodyDoorCloseModel[134] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Box 191
		bodyDoorCloseModel[135] = new ModelRendererTurbo(this, 161, 297, textureX, textureY); // Box 193
		bodyDoorCloseModel[136] = new ModelRendererTurbo(this, 201, 297, textureX, textureY); // Box 194
		bodyDoorCloseModel[137] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Box 195
		bodyDoorCloseModel[138] = new ModelRendererTurbo(this, 353, 297, textureX, textureY); // Box 197
		bodyDoorCloseModel[139] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 198
		bodyDoorCloseModel[140] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Box 199
		bodyDoorCloseModel[141] = new ModelRendererTurbo(this, 81, 305, textureX, textureY); // Box 200
		bodyDoorCloseModel[142] = new ModelRendererTurbo(this, 281, 305, textureX, textureY); // Box 201
		bodyDoorCloseModel[143] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 202
		bodyDoorCloseModel[144] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 203
		bodyDoorCloseModel[145] = new ModelRendererTurbo(this, 393, 305, textureX, textureY); // Box 204
		bodyDoorCloseModel[146] = new ModelRendererTurbo(this, 121, 313, textureX, textureY); // Box 205
		bodyDoorCloseModel[147] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 206
		bodyDoorCloseModel[148] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 207
		bodyDoorCloseModel[149] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 208
		bodyDoorCloseModel[150] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Box 209
		bodyDoorCloseModel[151] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Box 211
		bodyDoorCloseModel[152] = new ModelRendererTurbo(this, 473, 313, textureX, textureY); // Box 212
		bodyDoorCloseModel[153] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Box 213
		bodyDoorCloseModel[154] = new ModelRendererTurbo(this, 201, 321, textureX, textureY); // Box 214
		bodyDoorCloseModel[155] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Box 215
		bodyDoorCloseModel[156] = new ModelRendererTurbo(this, 361, 321, textureX, textureY); // Box 216
		bodyDoorCloseModel[157] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 219
		bodyDoorCloseModel[158] = new ModelRendererTurbo(this, 41, 329, textureX, textureY); // Box 222
		bodyDoorCloseModel[159] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Box 223
		bodyDoorCloseModel[160] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 224
		bodyDoorCloseModel[161] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 225
		bodyDoorCloseModel[162] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 226
		bodyDoorCloseModel[163] = new ModelRendererTurbo(this, 281, 329, textureX, textureY); // Box 227
		bodyDoorCloseModel[164] = new ModelRendererTurbo(this, 401, 329, textureX, textureY); // Box 229
		bodyDoorCloseModel[165] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 230
		bodyDoorCloseModel[166] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 231
		bodyDoorCloseModel[167] = new ModelRendererTurbo(this, 121, 337, textureX, textureY); // Box 232
		bodyDoorCloseModel[168] = new ModelRendererTurbo(this, 321, 337, textureX, textureY); // Box 235
		bodyDoorCloseModel[169] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 236
		bodyDoorCloseModel[170] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 237
		bodyDoorCloseModel[171] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 238
		bodyDoorCloseModel[172] = new ModelRendererTurbo(this, 441, 337, textureX, textureY); // Box 239
		bodyDoorCloseModel[173] = new ModelRendererTurbo(this, 161, 345, textureX, textureY); // Box 242
		bodyDoorCloseModel[174] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 243
		bodyDoorCloseModel[175] = new ModelRendererTurbo(this, 201, 345, textureX, textureY); // Box 244
		bodyDoorCloseModel[176] = new ModelRendererTurbo(this, 241, 345, textureX, textureY); // Box 246
		bodyDoorCloseModel[177] = new ModelRendererTurbo(this, 361, 345, textureX, textureY); // Box 247
		bodyDoorCloseModel[178] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 248
		bodyDoorCloseModel[179] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 249
		bodyDoorCloseModel[180] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 250
		bodyDoorCloseModel[181] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 251
		bodyDoorCloseModel[182] = new ModelRendererTurbo(this, 41, 353, textureX, textureY); // Box 254
		bodyDoorCloseModel[183] = new ModelRendererTurbo(this, 81, 353, textureX, textureY); // Box 255
		bodyDoorCloseModel[184] = new ModelRendererTurbo(this, 281, 353, textureX, textureY); // Box 257
		bodyDoorCloseModel[185] = new ModelRendererTurbo(this, 401, 353, textureX, textureY); // Box 258
		bodyDoorCloseModel[186] = new ModelRendererTurbo(this, 473, 353, textureX, textureY); // Box 259
		bodyDoorCloseModel[187] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 260
		bodyDoorCloseModel[188] = new ModelRendererTurbo(this, 321, 361, textureX, textureY); // Box 261
		bodyDoorCloseModel[189] = new ModelRendererTurbo(this, 161, 369, textureX, textureY); // Box 262
		bodyDoorCloseModel[190] = new ModelRendererTurbo(this, 201, 369, textureX, textureY); // Box 266
		bodyDoorCloseModel[191] = new ModelRendererTurbo(this, 241, 369, textureX, textureY); // Box 267
		bodyDoorCloseModel[192] = new ModelRendererTurbo(this, 361, 369, textureX, textureY); // Box 268
		bodyDoorCloseModel[193] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Box 270
		bodyDoorCloseModel[194] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 271
		bodyDoorCloseModel[195] = new ModelRendererTurbo(this, 41, 377, textureX, textureY); // Box 272
		bodyDoorCloseModel[196] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 273
		bodyDoorCloseModel[197] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 274
		bodyDoorCloseModel[198] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 275
		bodyDoorCloseModel[199] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 276
		bodyDoorCloseModel[200] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 277
		bodyDoorCloseModel[201] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 278
		bodyDoorCloseModel[202] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Box 279
		bodyDoorCloseModel[203] = new ModelRendererTurbo(this, 281, 377, textureX, textureY); // Box 280
		bodyDoorCloseModel[204] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 281
		bodyDoorCloseModel[205] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 282
		bodyDoorCloseModel[206] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 283
		bodyDoorCloseModel[207] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 284
		bodyDoorCloseModel[208] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Box 285
		bodyDoorCloseModel[209] = new ModelRendererTurbo(this, 321, 385, textureX, textureY); // Box 286
		bodyDoorCloseModel[210] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 287
		bodyDoorCloseModel[211] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 288
		bodyDoorCloseModel[212] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 289
		bodyDoorCloseModel[213] = new ModelRendererTurbo(this, 393, 385, textureX, textureY); // Box 290
		bodyDoorCloseModel[214] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Box 291
		bodyDoorCloseModel[215] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 292
		bodyDoorCloseModel[216] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 293
		bodyDoorCloseModel[217] = new ModelRendererTurbo(this, 201, 393, textureX, textureY); // Box 294
		bodyDoorCloseModel[218] = new ModelRendererTurbo(this, 241, 393, textureX, textureY); // Box 295
		bodyDoorCloseModel[219] = new ModelRendererTurbo(this, 433, 393, textureX, textureY); // Box 296
		bodyDoorCloseModel[220] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 297
		bodyDoorCloseModel[221] = new ModelRendererTurbo(this, 41, 401, textureX, textureY); // Box 298
		bodyDoorCloseModel[222] = new ModelRendererTurbo(this, 81, 401, textureX, textureY); // Box 299
		bodyDoorCloseModel[223] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // Box 300
		bodyDoorCloseModel[224] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 301
		bodyDoorCloseModel[225] = new ModelRendererTurbo(this, 353, 401, textureX, textureY); // Box 302
		bodyDoorCloseModel[226] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 303
		bodyDoorCloseModel[227] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 304
		bodyDoorCloseModel[228] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // Box 305
		bodyDoorCloseModel[229] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 306
		bodyDoorCloseModel[230] = new ModelRendererTurbo(this, 121, 409, textureX, textureY); // Box 307
		bodyDoorCloseModel[231] = new ModelRendererTurbo(this, 393, 409, textureX, textureY); // Box 308
		bodyDoorCloseModel[232] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 310
		bodyDoorCloseModel[233] = new ModelRendererTurbo(this, 161, 417, textureX, textureY); // Box 311
		bodyDoorCloseModel[234] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 312
		bodyDoorCloseModel[235] = new ModelRendererTurbo(this, 201, 417, textureX, textureY); // Box 313
		bodyDoorCloseModel[236] = new ModelRendererTurbo(this, 241, 417, textureX, textureY); // Box 314
		bodyDoorCloseModel[237] = new ModelRendererTurbo(this, 313, 417, textureX, textureY); // Box 315
		bodyDoorCloseModel[238] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 316
		bodyDoorCloseModel[239] = new ModelRendererTurbo(this, 433, 417, textureX, textureY); // Box 317
		bodyDoorCloseModel[240] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 318
		bodyDoorCloseModel[241] = new ModelRendererTurbo(this, 41, 425, textureX, textureY); // Box 319
		bodyDoorCloseModel[242] = new ModelRendererTurbo(this, 81, 425, textureX, textureY); // Box 320
		bodyDoorCloseModel[243] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 321
		bodyDoorCloseModel[244] = new ModelRendererTurbo(this, 353, 425, textureX, textureY); // Box 322
		bodyDoorCloseModel[245] = new ModelRendererTurbo(this, 473, 425, textureX, textureY); // Box 324
		bodyDoorCloseModel[246] = new ModelRendererTurbo(this, 121, 433, textureX, textureY); // Box 325
		bodyDoorCloseModel[247] = new ModelRendererTurbo(this, 273, 433, textureX, textureY); // Box 326
		bodyDoorCloseModel[248] = new ModelRendererTurbo(this, 393, 433, textureX, textureY); // Box 329
		bodyDoorCloseModel[249] = new ModelRendererTurbo(this, 161, 441, textureX, textureY); // Box 331
		bodyDoorCloseModel[250] = new ModelRendererTurbo(this, 201, 441, textureX, textureY); // Box 332
		bodyDoorCloseModel[251] = new ModelRendererTurbo(this, 313, 441, textureX, textureY); // Box 334
		bodyDoorCloseModel[252] = new ModelRendererTurbo(this, 433, 441, textureX, textureY); // Box 335
		bodyDoorCloseModel[253] = new ModelRendererTurbo(this, 1, 449, textureX, textureY); // Box 338
		bodyDoorCloseModel[254] = new ModelRendererTurbo(this, 41, 449, textureX, textureY); // Box 340
		bodyDoorCloseModel[255] = new ModelRendererTurbo(this, 81, 449, textureX, textureY); // Box 341
		bodyDoorCloseModel[256] = new ModelRendererTurbo(this, 241, 449, textureX, textureY); // Box 344
		bodyDoorCloseModel[257] = new ModelRendererTurbo(this, 353, 449, textureX, textureY); // Box 346
		bodyDoorCloseModel[258] = new ModelRendererTurbo(this, 473, 449, textureX, textureY); // Box 349
		bodyDoorCloseModel[259] = new ModelRendererTurbo(this, 121, 457, textureX, textureY); // Box 350
		bodyDoorCloseModel[260] = new ModelRendererTurbo(this, 281, 457, textureX, textureY); // Box 354

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyDoorCloseModel[0].setRotationPoint(-14F, -8F, -17F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyDoorCloseModel[1].setRotationPoint(-14F, -8F, -11.5F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyDoorCloseModel[2].setRotationPoint(-14F, -8F, 6F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyDoorCloseModel[3].setRotationPoint(-14F, -8F, 0.5F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyDoorCloseModel[4].setRotationPoint(-14F, -8F, -5.5F);

		bodyDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyDoorCloseModel[5].setRotationPoint(-3F, -8F, 6F);

		bodyDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyDoorCloseModel[6].setRotationPoint(8F, -8F, 6F);

		bodyDoorCloseModel[7].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyDoorCloseModel[7].setRotationPoint(19F, -8F, 6F);

		bodyDoorCloseModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyDoorCloseModel[8].setRotationPoint(30F, -8F, 6F);

		bodyDoorCloseModel[9].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyDoorCloseModel[9].setRotationPoint(41F, -8F, 6F);

		bodyDoorCloseModel[10].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyDoorCloseModel[10].setRotationPoint(52F, -8F, 6F);

		bodyDoorCloseModel[11].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyDoorCloseModel[11].setRotationPoint(63F, -8F, 6F);

		bodyDoorCloseModel[12].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyDoorCloseModel[12].setRotationPoint(74F, -8F, 6F);

		bodyDoorCloseModel[13].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyDoorCloseModel[13].setRotationPoint(85F, -8F, 6F);

		bodyDoorCloseModel[14].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyDoorCloseModel[14].setRotationPoint(-3F, -8F, -17F);

		bodyDoorCloseModel[15].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyDoorCloseModel[15].setRotationPoint(8F, -8F, -17F);

		bodyDoorCloseModel[16].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyDoorCloseModel[16].setRotationPoint(19F, -8F, -17F);

		bodyDoorCloseModel[17].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyDoorCloseModel[17].setRotationPoint(30F, -8F, -17F);

		bodyDoorCloseModel[18].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyDoorCloseModel[18].setRotationPoint(41F, -8F, -17F);

		bodyDoorCloseModel[19].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyDoorCloseModel[19].setRotationPoint(52F, -8F, -17F);

		bodyDoorCloseModel[20].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyDoorCloseModel[20].setRotationPoint(63F, -8F, -17F);

		bodyDoorCloseModel[21].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyDoorCloseModel[21].setRotationPoint(74F, -8F, -17F);

		bodyDoorCloseModel[22].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyDoorCloseModel[22].setRotationPoint(85F, -8F, -17F);

		bodyDoorCloseModel[23].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyDoorCloseModel[23].setRotationPoint(-45F, -8F, -17F);

		bodyDoorCloseModel[24].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyDoorCloseModel[24].setRotationPoint(-56F, -8F, -17F);

		bodyDoorCloseModel[25].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyDoorCloseModel[25].setRotationPoint(-67F, -8F, -17F);

		bodyDoorCloseModel[26].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyDoorCloseModel[26].setRotationPoint(-45F, -8F, 6F);

		bodyDoorCloseModel[27].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyDoorCloseModel[27].setRotationPoint(-56F, -8F, 6F);

		bodyDoorCloseModel[28].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyDoorCloseModel[28].setRotationPoint(-67F, -8F, 6F);

		bodyDoorCloseModel[29].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyDoorCloseModel[29].setRotationPoint(-78F, -8F, -17F);

		bodyDoorCloseModel[30].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyDoorCloseModel[30].setRotationPoint(-78F, -8F, 6F);

		bodyDoorCloseModel[31].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyDoorCloseModel[31].setRotationPoint(-45F, -8F, -11.5F);

		bodyDoorCloseModel[32].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyDoorCloseModel[32].setRotationPoint(-56F, -8F, -11.5F);

		bodyDoorCloseModel[33].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyDoorCloseModel[33].setRotationPoint(-67F, -8F, -11.5F);

		bodyDoorCloseModel[34].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyDoorCloseModel[34].setRotationPoint(-78F, -8F, -11.5F);

		bodyDoorCloseModel[35].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyDoorCloseModel[35].setRotationPoint(-45F, -8F, -5.5F);

		bodyDoorCloseModel[36].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyDoorCloseModel[36].setRotationPoint(-56F, -8F, -5.5F);

		bodyDoorCloseModel[37].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyDoorCloseModel[37].setRotationPoint(-67F, -8F, -5.5F);

		bodyDoorCloseModel[38].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyDoorCloseModel[38].setRotationPoint(-78F, -8F, -5.5F);

		bodyDoorCloseModel[39].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyDoorCloseModel[39].setRotationPoint(-78F, -8F, 0.5F);

		bodyDoorCloseModel[40].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyDoorCloseModel[40].setRotationPoint(-67F, -8F, 0.5F);

		bodyDoorCloseModel[41].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyDoorCloseModel[41].setRotationPoint(-56F, -8F, 0.5F);

		bodyDoorCloseModel[42].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyDoorCloseModel[42].setRotationPoint(-45F, -8F, 0.5F);

		bodyDoorCloseModel[43].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyDoorCloseModel[43].setRotationPoint(-89F, -8F, 4.5F);

		bodyDoorCloseModel[44].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyDoorCloseModel[44].setRotationPoint(-89F, -8F, -15.5F);

		bodyDoorCloseModel[45].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyDoorCloseModel[45].setRotationPoint(-89F, -8F, -2.4F);

		bodyDoorCloseModel[46].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyDoorCloseModel[46].setRotationPoint(-89F, -8F, -8.6F);

		bodyDoorCloseModel[47].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyDoorCloseModel[47].setRotationPoint(-100F, -8F, 4.5F);

		bodyDoorCloseModel[48].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyDoorCloseModel[48].setRotationPoint(-100F, -8F, -2.4F);

		bodyDoorCloseModel[49].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyDoorCloseModel[49].setRotationPoint(-100F, -8F, -8.6F);

		bodyDoorCloseModel[50].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyDoorCloseModel[50].setRotationPoint(-100F, -8F, -15.5F);

		bodyDoorCloseModel[51].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyDoorCloseModel[51].setRotationPoint(-3F, -8F, -11.5F);

		bodyDoorCloseModel[52].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyDoorCloseModel[52].setRotationPoint(8F, -8F, -11.5F);

		bodyDoorCloseModel[53].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyDoorCloseModel[53].setRotationPoint(19F, -8F, -11.5F);

		bodyDoorCloseModel[54].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyDoorCloseModel[54].setRotationPoint(30F, -8F, -11.5F);

		bodyDoorCloseModel[55].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyDoorCloseModel[55].setRotationPoint(41F, -8F, -11.5F);

		bodyDoorCloseModel[56].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyDoorCloseModel[56].setRotationPoint(52F, -8F, -11.5F);

		bodyDoorCloseModel[57].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyDoorCloseModel[57].setRotationPoint(63F, -8F, -11.5F);

		bodyDoorCloseModel[58].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyDoorCloseModel[58].setRotationPoint(74F, -8F, -11.5F);

		bodyDoorCloseModel[59].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyDoorCloseModel[59].setRotationPoint(85F, -8F, -11.5F);

		bodyDoorCloseModel[60].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyDoorCloseModel[60].setRotationPoint(-3F, -8F, -5.5F);

		bodyDoorCloseModel[61].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyDoorCloseModel[61].setRotationPoint(8F, -8F, -5.5F);

		bodyDoorCloseModel[62].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyDoorCloseModel[62].setRotationPoint(19F, -8F, -5.5F);

		bodyDoorCloseModel[63].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyDoorCloseModel[63].setRotationPoint(30F, -8F, -5.5F);

		bodyDoorCloseModel[64].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyDoorCloseModel[64].setRotationPoint(41F, -8F, -5.5F);

		bodyDoorCloseModel[65].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyDoorCloseModel[65].setRotationPoint(52F, -8F, -5.5F);

		bodyDoorCloseModel[66].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyDoorCloseModel[66].setRotationPoint(63F, -8F, -5.5F);

		bodyDoorCloseModel[67].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyDoorCloseModel[67].setRotationPoint(74F, -8F, -5.5F);

		bodyDoorCloseModel[68].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyDoorCloseModel[68].setRotationPoint(85F, -8F, -5.5F);

		bodyDoorCloseModel[69].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyDoorCloseModel[69].setRotationPoint(-3F, -8F, 0.5F);

		bodyDoorCloseModel[70].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyDoorCloseModel[70].setRotationPoint(8F, -8F, 0.5F);

		bodyDoorCloseModel[71].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyDoorCloseModel[71].setRotationPoint(19F, -8F, 0.5F);

		bodyDoorCloseModel[72].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyDoorCloseModel[72].setRotationPoint(30F, -8F, 0.5F);

		bodyDoorCloseModel[73].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyDoorCloseModel[73].setRotationPoint(41F, -8F, 0.5F);

		bodyDoorCloseModel[74].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyDoorCloseModel[74].setRotationPoint(52F, -8F, 0.5F);

		bodyDoorCloseModel[75].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyDoorCloseModel[75].setRotationPoint(63F, -8F, 0.5F);

		bodyDoorCloseModel[76].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyDoorCloseModel[76].setRotationPoint(74F, -8F, 0.5F);

		bodyDoorCloseModel[77].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyDoorCloseModel[77].setRotationPoint(85F, -8F, 0.5F);

		bodyDoorCloseModel[78].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyDoorCloseModel[78].setRotationPoint(-14F, -13F, -17F);

		bodyDoorCloseModel[79].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyDoorCloseModel[79].setRotationPoint(-14F, -18F, -17F);

		bodyDoorCloseModel[80].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyDoorCloseModel[80].setRotationPoint(-14F, -23F, -17F);

		bodyDoorCloseModel[81].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyDoorCloseModel[81].setRotationPoint(-14F, -13F, -11.5F);

		bodyDoorCloseModel[82].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyDoorCloseModel[82].setRotationPoint(-14F, -18F, -11.5F);

		bodyDoorCloseModel[83].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyDoorCloseModel[83].setRotationPoint(-3F, -13F, -11.5F);

		bodyDoorCloseModel[84].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyDoorCloseModel[84].setRotationPoint(-3F, -18F, -11.5F);

		bodyDoorCloseModel[85].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyDoorCloseModel[85].setRotationPoint(-3F, -13F, -17F);

		bodyDoorCloseModel[86].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyDoorCloseModel[86].setRotationPoint(-3F, -18F, -17F);

		bodyDoorCloseModel[87].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyDoorCloseModel[87].setRotationPoint(-3F, -23F, -17F);

		bodyDoorCloseModel[88].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyDoorCloseModel[88].setRotationPoint(8F, -13F, -17F);

		bodyDoorCloseModel[89].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyDoorCloseModel[89].setRotationPoint(8F, -18F, -17F);

		bodyDoorCloseModel[90].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyDoorCloseModel[90].setRotationPoint(8F, -13F, -11.5F);

		bodyDoorCloseModel[91].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyDoorCloseModel[91].setRotationPoint(8F, -18F, -11.5F);

		bodyDoorCloseModel[92].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyDoorCloseModel[92].setRotationPoint(19F, -13F, -17F);

		bodyDoorCloseModel[93].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyDoorCloseModel[93].setRotationPoint(19F, -18F, -17F);

		bodyDoorCloseModel[94].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyDoorCloseModel[94].setRotationPoint(19F, -23F, -17F);

		bodyDoorCloseModel[95].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyDoorCloseModel[95].setRotationPoint(30F, -13F, -17F);

		bodyDoorCloseModel[96].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyDoorCloseModel[96].setRotationPoint(30F, -18F, -17F);

		bodyDoorCloseModel[97].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyDoorCloseModel[97].setRotationPoint(41F, -13F, -17F);

		bodyDoorCloseModel[98].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyDoorCloseModel[98].setRotationPoint(41F, -18F, -17F);

		bodyDoorCloseModel[99].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyDoorCloseModel[99].setRotationPoint(41F, -23F, -17F);

		bodyDoorCloseModel[100].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyDoorCloseModel[100].setRotationPoint(30F, -18F, -11F);

		bodyDoorCloseModel[101].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyDoorCloseModel[101].setRotationPoint(19F, -18F, -11.5F);

		bodyDoorCloseModel[102].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyDoorCloseModel[102].setRotationPoint(19F, -13F, -11.5F);

		bodyDoorCloseModel[103].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyDoorCloseModel[103].setRotationPoint(30F, -13F, -11F);

		bodyDoorCloseModel[104].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyDoorCloseModel[104].setRotationPoint(41F, -13F, -11.5F);

		bodyDoorCloseModel[105].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyDoorCloseModel[105].setRotationPoint(41F, -18F, -11.5F);

		bodyDoorCloseModel[106].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyDoorCloseModel[106].setRotationPoint(30F, -23F, -5.5F);

		bodyDoorCloseModel[107].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyDoorCloseModel[107].setRotationPoint(30F, -18F, -5F);

		bodyDoorCloseModel[108].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyDoorCloseModel[108].setRotationPoint(19F, -18F, -5.5F);

		bodyDoorCloseModel[109].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyDoorCloseModel[109].setRotationPoint(19F, -13F, -5.5F);

		bodyDoorCloseModel[110].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyDoorCloseModel[110].setRotationPoint(30F, -13F, -5F);

		bodyDoorCloseModel[111].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyDoorCloseModel[111].setRotationPoint(41F, -13F, -5.5F);

		bodyDoorCloseModel[112].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyDoorCloseModel[112].setRotationPoint(41F, -18F, -5.5F);

		bodyDoorCloseModel[113].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyDoorCloseModel[113].setRotationPoint(41F, -23F, -5.5F);

		bodyDoorCloseModel[114].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyDoorCloseModel[114].setRotationPoint(19F, -23F, 0.5F);

		bodyDoorCloseModel[115].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyDoorCloseModel[115].setRotationPoint(30F, -18F, 0.5F);

		bodyDoorCloseModel[116].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyDoorCloseModel[116].setRotationPoint(19F, -18F, 0.5F);

		bodyDoorCloseModel[117].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyDoorCloseModel[117].setRotationPoint(19F, -13F, 0.5F);

		bodyDoorCloseModel[118].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyDoorCloseModel[118].setRotationPoint(30F, -13F, 0.5F);

		bodyDoorCloseModel[119].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyDoorCloseModel[119].setRotationPoint(41F, -13F, 0.5F);

		bodyDoorCloseModel[120].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyDoorCloseModel[120].setRotationPoint(41F, -18F, 0.5F);

		bodyDoorCloseModel[121].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyDoorCloseModel[121].setRotationPoint(41F, -23F, 0.5F);

		bodyDoorCloseModel[122].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyDoorCloseModel[122].setRotationPoint(30F, -23F, 6F);

		bodyDoorCloseModel[123].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyDoorCloseModel[123].setRotationPoint(30F, -18F, 6F);

		bodyDoorCloseModel[124].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyDoorCloseModel[124].setRotationPoint(19F, -13F, 6F);

		bodyDoorCloseModel[125].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyDoorCloseModel[125].setRotationPoint(30F, -13F, 6F);

		bodyDoorCloseModel[126].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyDoorCloseModel[126].setRotationPoint(41F, -13F, 6F);

		bodyDoorCloseModel[127].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyDoorCloseModel[127].setRotationPoint(41F, -18F, 6F);

		bodyDoorCloseModel[128].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyDoorCloseModel[128].setRotationPoint(8F, -13F, 0.5F);

		bodyDoorCloseModel[129].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyDoorCloseModel[129].setRotationPoint(8F, -18F, 0.5F);

		bodyDoorCloseModel[130].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyDoorCloseModel[130].setRotationPoint(-3F, -23F, 0.5F);

		bodyDoorCloseModel[131].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyDoorCloseModel[131].setRotationPoint(-3F, -18F, 0.5F);

		bodyDoorCloseModel[132].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyDoorCloseModel[132].setRotationPoint(-3F, -13F, 0.5F);

		bodyDoorCloseModel[133].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyDoorCloseModel[133].setRotationPoint(-14F, -13F, 0.5F);

		bodyDoorCloseModel[134].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyDoorCloseModel[134].setRotationPoint(-14F, -18F, 0.5F);

		bodyDoorCloseModel[135].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyDoorCloseModel[135].setRotationPoint(8F, -13F, 6F);

		bodyDoorCloseModel[136].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyDoorCloseModel[136].setRotationPoint(8F, -18F, 6F);

		bodyDoorCloseModel[137].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyDoorCloseModel[137].setRotationPoint(8F, -23F, 6F);

		bodyDoorCloseModel[138].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyDoorCloseModel[138].setRotationPoint(-3F, -18F, 6F);

		bodyDoorCloseModel[139].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyDoorCloseModel[139].setRotationPoint(-3F, -13F, 6F);

		bodyDoorCloseModel[140].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyDoorCloseModel[140].setRotationPoint(-14F, -13F, 6F);

		bodyDoorCloseModel[141].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyDoorCloseModel[141].setRotationPoint(-14F, -18F, 6F);

		bodyDoorCloseModel[142].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyDoorCloseModel[142].setRotationPoint(-14F, -23F, 6F);

		bodyDoorCloseModel[143].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyDoorCloseModel[143].setRotationPoint(8F, -13F, -5.5F);

		bodyDoorCloseModel[144].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyDoorCloseModel[144].setRotationPoint(8F, -18F, -5.5F);

		bodyDoorCloseModel[145].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyDoorCloseModel[145].setRotationPoint(8F, -23F, -5.5F);

		bodyDoorCloseModel[146].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyDoorCloseModel[146].setRotationPoint(-3F, -23F, -5.5F);

		bodyDoorCloseModel[147].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyDoorCloseModel[147].setRotationPoint(-3F, -18F, -5.5F);

		bodyDoorCloseModel[148].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyDoorCloseModel[148].setRotationPoint(-3F, -13F, -5.5F);

		bodyDoorCloseModel[149].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyDoorCloseModel[149].setRotationPoint(-14F, -13F, -5.5F);

		bodyDoorCloseModel[150].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyDoorCloseModel[150].setRotationPoint(-14F, -18F, -5.5F);

		bodyDoorCloseModel[151].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyDoorCloseModel[151].setRotationPoint(85F, -13F, 6F);

		bodyDoorCloseModel[152].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyDoorCloseModel[152].setRotationPoint(74F, -13F, 6F);

		bodyDoorCloseModel[153].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyDoorCloseModel[153].setRotationPoint(63F, -13F, 6F);

		bodyDoorCloseModel[154].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyDoorCloseModel[154].setRotationPoint(52F, -13F, 6F);

		bodyDoorCloseModel[155].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyDoorCloseModel[155].setRotationPoint(52F, -18F, 6F);

		bodyDoorCloseModel[156].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyDoorCloseModel[156].setRotationPoint(52F, -23F, 6F);

		bodyDoorCloseModel[157].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyDoorCloseModel[157].setRotationPoint(74F, -18F, 6F);

		bodyDoorCloseModel[158].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyDoorCloseModel[158].setRotationPoint(85F, -18F, 6F);

		bodyDoorCloseModel[159].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyDoorCloseModel[159].setRotationPoint(85F, -13F, 0.5F);

		bodyDoorCloseModel[160].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyDoorCloseModel[160].setRotationPoint(74F, -13F, 0.5F);

		bodyDoorCloseModel[161].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyDoorCloseModel[161].setRotationPoint(63F, -13F, 0.5F);

		bodyDoorCloseModel[162].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyDoorCloseModel[162].setRotationPoint(52F, -13F, 0.5F);

		bodyDoorCloseModel[163].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyDoorCloseModel[163].setRotationPoint(52F, -18F, 0.5F);

		bodyDoorCloseModel[164].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyDoorCloseModel[164].setRotationPoint(63F, -23F, 0.5F);

		bodyDoorCloseModel[165].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyDoorCloseModel[165].setRotationPoint(63F, -18F, 0.5F);

		bodyDoorCloseModel[166].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyDoorCloseModel[166].setRotationPoint(74F, -18F, 0.5F);

		bodyDoorCloseModel[167].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyDoorCloseModel[167].setRotationPoint(74F, -23F, 0.5F);

		bodyDoorCloseModel[168].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyDoorCloseModel[168].setRotationPoint(85F, -13F, -5.5F);

		bodyDoorCloseModel[169].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyDoorCloseModel[169].setRotationPoint(74F, -13F, -5.5F);

		bodyDoorCloseModel[170].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyDoorCloseModel[170].setRotationPoint(63F, -13F, -5.5F);

		bodyDoorCloseModel[171].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyDoorCloseModel[171].setRotationPoint(52F, -13F, -5.5F);

		bodyDoorCloseModel[172].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyDoorCloseModel[172].setRotationPoint(52F, -18F, -5.5F);

		bodyDoorCloseModel[173].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyDoorCloseModel[173].setRotationPoint(63F, -18F, -5.5F);

		bodyDoorCloseModel[174].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyDoorCloseModel[174].setRotationPoint(74F, -18F, -5.5F);

		bodyDoorCloseModel[175].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyDoorCloseModel[175].setRotationPoint(74F, -23F, -5.5F);

		bodyDoorCloseModel[176].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyDoorCloseModel[176].setRotationPoint(85F, -18F, -5.5F);

		bodyDoorCloseModel[177].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyDoorCloseModel[177].setRotationPoint(85F, -13F, -11.5F);

		bodyDoorCloseModel[178].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyDoorCloseModel[178].setRotationPoint(74F, -13F, -11.5F);

		bodyDoorCloseModel[179].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyDoorCloseModel[179].setRotationPoint(63F, -13F, -11.5F);

		bodyDoorCloseModel[180].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyDoorCloseModel[180].setRotationPoint(52F, -13F, -11.5F);

		bodyDoorCloseModel[181].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyDoorCloseModel[181].setRotationPoint(52F, -18F, -11.5F);

		bodyDoorCloseModel[182].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyDoorCloseModel[182].setRotationPoint(63F, -18F, -11.5F);

		bodyDoorCloseModel[183].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyDoorCloseModel[183].setRotationPoint(74F, -18F, -11.5F);

		bodyDoorCloseModel[184].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyDoorCloseModel[184].setRotationPoint(85F, -23F, -11.5F);

		bodyDoorCloseModel[185].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyDoorCloseModel[185].setRotationPoint(85F, -18F, -11.5F);

		bodyDoorCloseModel[186].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyDoorCloseModel[186].setRotationPoint(85F, -13F, -17F);

		bodyDoorCloseModel[187].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyDoorCloseModel[187].setRotationPoint(74F, -13F, -17F);

		bodyDoorCloseModel[188].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyDoorCloseModel[188].setRotationPoint(63F, -13F, -17F);

		bodyDoorCloseModel[189].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyDoorCloseModel[189].setRotationPoint(52F, -13F, -17F);

		bodyDoorCloseModel[190].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyDoorCloseModel[190].setRotationPoint(63F, -18F, -17F);

		bodyDoorCloseModel[191].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyDoorCloseModel[191].setRotationPoint(74F, -18F, -17F);

		bodyDoorCloseModel[192].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyDoorCloseModel[192].setRotationPoint(74F, -23F, -17F);

		bodyDoorCloseModel[193].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyDoorCloseModel[193].setRotationPoint(85F, -18F, -17F);

		bodyDoorCloseModel[194].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyDoorCloseModel[194].setRotationPoint(-45F, -13F, -17F);

		bodyDoorCloseModel[195].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyDoorCloseModel[195].setRotationPoint(-56F, -13F, -17F);

		bodyDoorCloseModel[196].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyDoorCloseModel[196].setRotationPoint(-56F, -13F, -11.5F);

		bodyDoorCloseModel[197].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyDoorCloseModel[197].setRotationPoint(-45F, -13F, -11.5F);

		bodyDoorCloseModel[198].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyDoorCloseModel[198].setRotationPoint(-45F, -13F, -5.5F);

		bodyDoorCloseModel[199].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyDoorCloseModel[199].setRotationPoint(-56F, -13F, -5.5F);

		bodyDoorCloseModel[200].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyDoorCloseModel[200].setRotationPoint(-56F, -13F, 0.5F);

		bodyDoorCloseModel[201].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyDoorCloseModel[201].setRotationPoint(-45F, -13F, 0.5F);

		bodyDoorCloseModel[202].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyDoorCloseModel[202].setRotationPoint(-45F, -13F, 6F);

		bodyDoorCloseModel[203].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyDoorCloseModel[203].setRotationPoint(-56F, -13F, 6F);

		bodyDoorCloseModel[204].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyDoorCloseModel[204].setRotationPoint(-67F, -13F, 6F);

		bodyDoorCloseModel[205].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyDoorCloseModel[205].setRotationPoint(-67F, -13F, 0.5F);

		bodyDoorCloseModel[206].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyDoorCloseModel[206].setRotationPoint(-67F, -13F, -5.5F);

		bodyDoorCloseModel[207].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyDoorCloseModel[207].setRotationPoint(-67F, -13F, -11.5F);

		bodyDoorCloseModel[208].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyDoorCloseModel[208].setRotationPoint(-67F, -13F, -17F);

		bodyDoorCloseModel[209].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyDoorCloseModel[209].setRotationPoint(-78F, -13F, -17F);

		bodyDoorCloseModel[210].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyDoorCloseModel[210].setRotationPoint(-78F, -13F, -11.5F);

		bodyDoorCloseModel[211].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyDoorCloseModel[211].setRotationPoint(-78F, -13F, -5.5F);

		bodyDoorCloseModel[212].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyDoorCloseModel[212].setRotationPoint(-78F, -13F, 0.5F);

		bodyDoorCloseModel[213].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyDoorCloseModel[213].setRotationPoint(-78F, -13F, 6F);

		bodyDoorCloseModel[214].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyDoorCloseModel[214].setRotationPoint(-89F, -13F, 4.5F);

		bodyDoorCloseModel[215].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyDoorCloseModel[215].setRotationPoint(-89F, -13F, -2.4F);

		bodyDoorCloseModel[216].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyDoorCloseModel[216].setRotationPoint(-89F, -13F, -8.6F);

		bodyDoorCloseModel[217].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyDoorCloseModel[217].setRotationPoint(-89F, -13F, -15.5F);

		bodyDoorCloseModel[218].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyDoorCloseModel[218].setRotationPoint(-100F, -13F, -15.5F);

		bodyDoorCloseModel[219].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyDoorCloseModel[219].setRotationPoint(-100F, -13F, -8.6F);

		bodyDoorCloseModel[220].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyDoorCloseModel[220].setRotationPoint(-100F, -13F, -2.4F);

		bodyDoorCloseModel[221].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyDoorCloseModel[221].setRotationPoint(-100F, -13F, 4.5F);

		bodyDoorCloseModel[222].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyDoorCloseModel[222].setRotationPoint(-45F, -18F, -17F);

		bodyDoorCloseModel[223].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyDoorCloseModel[223].setRotationPoint(-56F, -18F, -17F);

		bodyDoorCloseModel[224].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyDoorCloseModel[224].setRotationPoint(-56F, -18F, -11.5F);

		bodyDoorCloseModel[225].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyDoorCloseModel[225].setRotationPoint(-45F, -18F, -11.5F);

		bodyDoorCloseModel[226].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyDoorCloseModel[226].setRotationPoint(-45F, -18F, -5.5F);

		bodyDoorCloseModel[227].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyDoorCloseModel[227].setRotationPoint(-56F, -18F, -5.5F);

		bodyDoorCloseModel[228].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyDoorCloseModel[228].setRotationPoint(-56F, -18F, 0.5F);

		bodyDoorCloseModel[229].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyDoorCloseModel[229].setRotationPoint(-45F, -18F, 0.5F);

		bodyDoorCloseModel[230].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyDoorCloseModel[230].setRotationPoint(-45F, -18F, 6F);

		bodyDoorCloseModel[231].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyDoorCloseModel[231].setRotationPoint(-56F, -18F, 6F);

		bodyDoorCloseModel[232].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyDoorCloseModel[232].setRotationPoint(-67F, -18F, 0.5F);

		bodyDoorCloseModel[233].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyDoorCloseModel[233].setRotationPoint(-67F, -18F, -5.5F);

		bodyDoorCloseModel[234].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyDoorCloseModel[234].setRotationPoint(-67F, -18F, -11.5F);

		bodyDoorCloseModel[235].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyDoorCloseModel[235].setRotationPoint(-67F, -18F, -17F);

		bodyDoorCloseModel[236].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyDoorCloseModel[236].setRotationPoint(-78F, -18F, -17F);

		bodyDoorCloseModel[237].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyDoorCloseModel[237].setRotationPoint(-78F, -18F, -11.5F);

		bodyDoorCloseModel[238].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyDoorCloseModel[238].setRotationPoint(-78F, -18F, -5.5F);

		bodyDoorCloseModel[239].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyDoorCloseModel[239].setRotationPoint(-78F, -18F, 0.5F);

		bodyDoorCloseModel[240].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyDoorCloseModel[240].setRotationPoint(-78F, -18F, 6F);

		bodyDoorCloseModel[241].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyDoorCloseModel[241].setRotationPoint(-89F, -18F, 4.5F);

		bodyDoorCloseModel[242].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyDoorCloseModel[242].setRotationPoint(-89F, -18F, -2.4F);

		bodyDoorCloseModel[243].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyDoorCloseModel[243].setRotationPoint(-89F, -18F, -8.6F);

		bodyDoorCloseModel[244].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyDoorCloseModel[244].setRotationPoint(-89F, -18F, -15.5F);

		bodyDoorCloseModel[245].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyDoorCloseModel[245].setRotationPoint(-100F, -18F, -8.6F);

		bodyDoorCloseModel[246].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyDoorCloseModel[246].setRotationPoint(-100F, -18F, -2.4F);

		bodyDoorCloseModel[247].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyDoorCloseModel[247].setRotationPoint(-100F, -18F, 4.5F);

		bodyDoorCloseModel[248].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyDoorCloseModel[248].setRotationPoint(-56F, -23F, -11.5F);

		bodyDoorCloseModel[249].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyDoorCloseModel[249].setRotationPoint(-45F, -23F, -5.5F);

		bodyDoorCloseModel[250].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 332
		bodyDoorCloseModel[250].setRotationPoint(-56F, -23F, -5.5F);

		bodyDoorCloseModel[251].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyDoorCloseModel[251].setRotationPoint(-45F, -23F, 0.5F);

		bodyDoorCloseModel[252].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyDoorCloseModel[252].setRotationPoint(-45F, -23F, 6F);

		bodyDoorCloseModel[253].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyDoorCloseModel[253].setRotationPoint(-67F, -23F, 0.5F);

		bodyDoorCloseModel[254].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 340
		bodyDoorCloseModel[254].setRotationPoint(-67F, -23F, -11.5F);

		bodyDoorCloseModel[255].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyDoorCloseModel[255].setRotationPoint(-67F, -23F, -17F);

		bodyDoorCloseModel[256].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyDoorCloseModel[256].setRotationPoint(-78F, -23F, -5.5F);

		bodyDoorCloseModel[257].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyDoorCloseModel[257].setRotationPoint(-78F, -23F, 6F);

		bodyDoorCloseModel[258].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyDoorCloseModel[258].setRotationPoint(-89F, -23F, -8.6F);

		bodyDoorCloseModel[259].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 350
		bodyDoorCloseModel[259].setRotationPoint(-89F, -23F, -15.5F);

		bodyDoorCloseModel[260].addShapeBox(0F, 0F, 0F, 8, 8, 8, 0F,0F, -3F, -3F, 2F, -3F, -3F, 2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyDoorCloseModel[260].setRotationPoint(-100F, -23F, 4.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 18
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 36

		leftFrontWheelModel[0].addShapeBox(-4F, -3F, -0.5F, 4, 9, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 18
		leftFrontWheelModel[0].setRotationPoint(-102F, 10F, 0F);

		leftFrontWheelModel[1].addShapeBox(0F, 0F, 0F, 8, 3, 1, 0F,0F, -2F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, 0F, -2F, -0.45F, -0.4F, 1F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 0F, -0.45F, -0.4F, 1F, -0.45F); // Box 36
		leftFrontWheelModel[1].setRotationPoint(-26.9F, -36.5F, -0.5F);
	}
}