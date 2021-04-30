//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.07.2015 - 01:51:29
// Last changed on: 14.07.2015 - 01:51:29

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBT42 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBT42() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];
		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorCloseModel = new ModelRendererTurbo[1];
		turretModel = new ModelRendererTurbo[24];
		barrelModel = new ModelRendererTurbo[9];
		leftTrackWheelModels = new ModelRendererTurbo[18];
		rightTrackWheelModels = new ModelRendererTurbo[18];
		leftTrackModel = new ModelRendererTurbo[12];
		rightTrackModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 30
		bodyModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 31
		bodyModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 32
		bodyModel[12] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 33
		bodyModel[13] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 34
		bodyModel[14] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 35
		bodyModel[15] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 36
		bodyModel[16] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 37
		bodyModel[17] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 38
		bodyModel[18] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 39
		bodyModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 41
		bodyModel[21] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 42
		bodyModel[22] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 43
		bodyModel[23] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 44
		bodyModel[24] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 45
		bodyModel[25] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 46
		bodyModel[26] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 47
		bodyModel[27] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 48
		bodyModel[28] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 49
		bodyModel[29] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 58
		bodyModel[30] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 59
		bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 60
		bodyModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 64
		bodyModel[36] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 65
		bodyModel[37] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 73
		bodyModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
		bodyModel[39] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 75
		bodyModel[40] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 76
		bodyModel[41] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 77
		bodyModel[42] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 99
		bodyModel[43] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 100
		bodyModel[44] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 101
		bodyModel[45] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 102
		bodyModel[46] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 132
		bodyModel[47] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 133
		bodyModel[48] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 134
		bodyModel[49] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 187
		bodyModel[50] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 188
		bodyModel[51] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 189
		bodyModel[52] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 190
		bodyModel[53] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 191
		bodyModel[54] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 203
		bodyModel[55] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 204
		bodyModel[56] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 207
		bodyModel[57] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 208

		bodyModel[0].addBox(0F, 0F, 0F, 52, 19, 26, 0F); // Box 10
		bodyModel[0].setRotationPoint(-45F, -14.8F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 19, 26, 0F,0F, 0F, 0F, 0F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.3F, 0F, 0F, -4.3F, 0F, 0F, 0F); // Box 11
		bodyModel[1].setRotationPoint(7F, -14.8F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 19, 26, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F); // Box 12
		bodyModel[2].setRotationPoint(-54F, -14.8F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 19, 18, 0F,0F, 0F, -0.3F, -2.5F, -5F, -1.5F, -2.5F, -5F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.3F); // Box 13
		bodyModel[3].setRotationPoint(19F, -14.8F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 14, 16, 0F,2.5F, -0.2F, -0.5F, 0F, -5F, -3F, 0F, -5F, -3F, 2.5F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F); // Box 14
		bodyModel[4].setRotationPoint(24F, -10F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 9, 10, 0F,0F, 0F, 0F, 0F, -3.5F, -1.8F, 0F, -3.5F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, -1.8F, -1F, -1.5F, -1.8F, 0F, 0F, 0F); // Box 15
		bodyModel[5].setRotationPoint(29F, -5F, -5F);

		bodyModel[6].addBox(0F, 0F, 0F, 53, 1, 5, 0F); // Box 27
		bodyModel[6].setRotationPoint(-46F, -10F, -18F);

		bodyModel[7].addBox(0F, 0F, -5F, 53, 1, 5, 0F); // Box 28
		bodyModel[7].setRotationPoint(-46F, -10F, 18F);

		bodyModel[8].addShapeBox(0F, 0F, -5F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[8].setRotationPoint(-53F, -6F, 18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[9].setRotationPoint(-53F, -6F, -18F);

		bodyModel[10].addBox(0F, 0F, 0F, 12, 1, 8, 0F); // Box 31
		bodyModel[10].setRotationPoint(7F, -10F, -18F);

		bodyModel[11].addBox(0F, 0F, -8F, 12, 1, 8, 0F); // Box 32
		bodyModel[11].setRotationPoint(7F, -10F, 18F);

		bodyModel[12].addShapeBox(-2F, -2F, 0F, 4, 2, 28, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[12].setRotationPoint(31.5F, -0.5F, -14F);

		bodyModel[13].addShapeBox(-2F, 0F, 0F, 4, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 34
		bodyModel[13].setRotationPoint(31.5F, -0.5F, -14F);

		bodyModel[14].addShapeBox(-19F, 0F, 0F, 19, 1, 23, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 35
		bodyModel[14].setRotationPoint(32F, -2F, -11.5F);
		bodyModel[14].rotateAngleZ = -0.33161256F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.2F); // Box 36
		bodyModel[15].setRotationPoint(19F, -10F, -18F);
		bodyModel[15].rotateAngleZ = -0.10471976F;

		bodyModel[16].addShapeBox(-4F, 0F, 0F, 18, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.6F, 0F, 0.5F, 0F, 0F, 0F); // Box 37
		bodyModel[16].setRotationPoint(19F, -9.5F, -11.25F);
		bodyModel[16].rotateAngleX = 0.2268928F;
		bodyModel[16].rotateAngleY = -0.19198622F;
		bodyModel[16].rotateAngleZ = -0.10471976F;

		bodyModel[17].addShapeBox(0F, 0F, -8F, 13, 1, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[17].setRotationPoint(19F, -10F, 18F);
		bodyModel[17].rotateAngleZ = -0.10471976F;

		bodyModel[18].addShapeBox(-4F, 0F, -1F, 18, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 39
		bodyModel[18].setRotationPoint(19F, -9.5F, 11.25F);
		bodyModel[18].rotateAngleX = -0.2268928F;
		bodyModel[18].rotateAngleY = 0.19198622F;
		bodyModel[18].rotateAngleZ = -0.10471976F;

		bodyModel[19].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[19].setRotationPoint(19F, 2.5F, -13.5F);

		bodyModel[20].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[20].setRotationPoint(0F, 2.5F, -13.5F);

		bodyModel[21].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[21].setRotationPoint(-18F, 2.5F, -13.5F);

		bodyModel[22].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[22].setRotationPoint(-34F, 2.5F, -13.5F);

		bodyModel[23].addShapeBox(-2F, -2F, 0F, 4, 2, 28, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[23].setRotationPoint(-48F, 1F, -14F);

		bodyModel[24].addShapeBox(-2F, 0F, 0F, 4, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 45
		bodyModel[24].setRotationPoint(-48F, 1F, -14F);

		bodyModel[25].addShapeBox(-2F, -2F, 0F, 4, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[25].setRotationPoint(-34F, 4.5F, -13.5F);

		bodyModel[26].addShapeBox(-2F, 0F, 0F, 4, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyModel[26].setRotationPoint(-18F, 2.5F, -13.5F);

		bodyModel[27].addShapeBox(-2F, 0F, 0F, 4, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 48
		bodyModel[27].setRotationPoint(0F, 2.5F, -13.5F);

		bodyModel[28].addShapeBox(-2F, 0F, 0F, 4, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 49
		bodyModel[28].setRotationPoint(19F, 2.5F, -13.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 13, 1, 14, 0F); // Box 58
		bodyModel[29].setRotationPoint(-28F, -15.3F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 3, 20, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[30].setRotationPoint(-42F, -16.5F, -10F);

		bodyModel[31].addShapeBox(-10F, -1F, 0F, 10, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 60
		bodyModel[31].setRotationPoint(-40F, -15.25F, -7F);

		bodyModel[32].addShapeBox(-10F, -1F, -2F, 10, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 61
		bodyModel[32].setRotationPoint(-40F, -15.25F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[33].setRotationPoint(-42F, -17.5F, -12.5F);

		bodyModel[34].addShapeBox(0F, 0F, -2F, 5, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[34].setRotationPoint(-42F, -17.5F, 12.5F);

		bodyModel[35].addShapeBox(-1F, -0.5F, 0F, 9, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 64
		bodyModel[35].setRotationPoint(-51.25F, -1F, -13F);
		bodyModel[35].rotateAngleZ = -0.82030475F;

		bodyModel[36].addShapeBox(-1F, -0.5F, -4F, 9, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 65
		bodyModel[36].setRotationPoint(-51.25F, -1F, 13F);
		bodyModel[36].rotateAngleZ = -0.82030475F;

		bodyModel[37].addShapeBox(0F, 0F, -4F, 35, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[37].setRotationPoint(-43F, -13.8F, 17.25F);

		bodyModel[38].addBox(0F, 0F, 0F, 9, 2, 3, 0F); // Box 74
		bodyModel[38].setRotationPoint(-32F, -16F, -10.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 12, 2, 5, 0F); // Box 75
		bodyModel[39].setRotationPoint(-23F, -16F, -12.5F);

		bodyModel[40].addBox(0F, 0F, -5F, 12, 2, 5, 0F); // Box 76
		bodyModel[40].setRotationPoint(-23F, -16F, 12.5F);

		bodyModel[41].addBox(0F, 0F, -3F, 9, 2, 3, 0F); // Box 77
		bodyModel[41].setRotationPoint(-32F, -16F, 10.5F);

		bodyModel[42].addShapeBox(0F, -1.5F, -1.5F, 3, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 99
		bodyModel[42].setRotationPoint(27.5F, -7F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 100
		bodyModel[43].setRotationPoint(27F, -8F, -9.5F);

		bodyModel[44].addShapeBox(0F, -1.5F, -1.5F, 3, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 101
		bodyModel[44].setRotationPoint(27.5F, -7F, 9F);

		bodyModel[45].addBox(0F, 0F, -1F, 2, 5, 1, 0F); // Box 102
		bodyModel[45].setRotationPoint(27F, -8F, 9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 4F, 35, 5, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[46].setRotationPoint(-43F, -13.8F, -22.25F);

		bodyModel[47].addShapeBox(0F, 0F, -4F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[47].setRotationPoint(-7.5F, -12.8F, 17.25F);

		bodyModel[48].addShapeBox(0F, 0F, 4F, 12, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[48].setRotationPoint(-7.5F, -12.8F, -21.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 187
		bodyModel[49].setRotationPoint(-20F, -16F, -4.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 188
		bodyModel[50].setRotationPoint(-26F, -16F, -4.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[51].setRotationPoint(-23F, -16F, -4.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[52].setRotationPoint(-31F, -17.3F, -7F);

		bodyModel[53].addShapeBox(-0.9F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[53].setRotationPoint(19F, -14.6F, -4F);
		bodyModel[53].rotateAngleZ = 0.4712389F;

		bodyModel[54].addShapeBox(-0.8F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 203
		bodyModel[54].setRotationPoint(18.5F, -14.9F, -3F);
		bodyModel[54].rotateAngleZ = 1.60570291F;

		bodyModel[55].addShapeBox(-0.8F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 204
		bodyModel[55].setRotationPoint(18.5F, -14.9F, 2F);
		bodyModel[55].rotateAngleZ = 1.60570291F;

		bodyModel[56].addShapeBox(-0.8F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[56].setRotationPoint(21.7F, -9.8F, -4F);
		bodyModel[56].rotateAngleZ = 1.01229097F;

		bodyModel[57].addShapeBox(-0.7F, 0.5F, 2F, 1, 50, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -46F, 0F, 0F, -46F, 0F, -46F, 0F, 0F, -46F, 0F, 0F, -46F, -46F, 0F, -46F, -46F); // Box 208
		bodyModel[57].setRotationPoint(21.7F, -9.8F, -4F);
		bodyModel[57].rotateAngleZ = 1.01229097F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 193

		bodyDoorOpenModel[0].addShapeBox(-0.8F, 0F, 0F, 1, 5, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 193
		bodyDoorOpenModel[0].setRotationPoint(19F, -14.6F, -4F);
		bodyDoorOpenModel[0].rotateAngleZ = 1.60570291F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 192

		bodyDoorCloseModel[0].addShapeBox(-0.8F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyDoorCloseModel[0].setRotationPoint(19F, -14.6F, -4F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.4712389F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 101
		turretModel[1] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 113
		turretModel[2] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 114
		turretModel[3] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 116
		turretModel[4] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 119
		turretModel[5] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 124
		turretModel[6] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 125
		turretModel[7] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 126
		turretModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 127
		turretModel[9] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 128
		turretModel[10] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 129
		turretModel[11] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 130
		turretModel[12] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 131
		turretModel[13] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 194
		turretModel[14] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 195
		turretModel[15] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 196
		turretModel[16] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 197
		turretModel[17] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 198
		turretModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 199
		turretModel[19] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 200
		turretModel[20] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 201
		turretModel[21] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 202
		turretModel[22] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 205
		turretModel[23] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 206

		turretModel[0].addShapeBox(2.25F, -3.5F, -6.5F, 4, 14, 13, 0F,0F, -1.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F); // Box 101
		turretModel[0].setRotationPoint(13F, -25F, 0F);

		turretModel[1].addShapeBox(-3.75F, -3.5F, -6.5F, 9, 14, 13, 0F,4F, -1.5F, 0F, -3F, -1.8F, 0F, -3F, -1.8F, 0F, 4F, -1.5F, 0F, 2F, -1.5F, 0F, -2F, -2.5F, 0F, -2F, -2.5F, 0F, 2F, -1.5F, 0F); // Box 113
		turretModel[1].setRotationPoint(13F, -25F, 0F);

		turretModel[2].addShapeBox(-2.5F, 0F, -12.5F, 5, 13, 25, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		turretModel[2].setRotationPoint(1F, -27.5F, 0F);

		turretModel[3].addShapeBox(2.5F, 0F, -12.5F, 6, 13, 25, 0F,0F, 0F, -5F, -2.5F, 0F, -7F, -2.5F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 116
		turretModel[3].setRotationPoint(1F, -27.5F, 0F);

		turretModel[4].addShapeBox(9.5F, 0F, -12.5F, 5, 13, 25, 0F,2.5F, 0F, -7F, -4F, 0F, -10F, -4F, 0F, -10F, 2.5F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -4F); // Box 119
		turretModel[4].setRotationPoint(0F, -27.5F, 0F);

		turretModel[5].addShapeBox(-12.5F, 0F, -12.5F, 4, 13, 25, 0F,-4F, 0F, -10F, 2.5F, 0F, -7F, 2.5F, 0F, -7F, -4F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -10F); // Box 124
		turretModel[5].setRotationPoint(1F, -27.5F, 0F);

		turretModel[6].addShapeBox(-8.5F, 0F, -12.5F, 6, 13, 25, 0F,-2.5F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, -5F, -2.5F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 125
		turretModel[6].setRotationPoint(1F, -27.5F, 0F);

		turretModel[7].addBox(-13F, 0F, -12F, 15, 15, 24, 0F); // Box 126
		turretModel[7].setRotationPoint(0F, -31.5F, 0F);

		turretModel[8].addShapeBox(-18F, 0F, -12F, 5, 15, 7, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		turretModel[8].setRotationPoint(0F, -31.5F, 0F);

		turretModel[9].addShapeBox(-18F, 0F, -5F, 5, 15, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		turretModel[9].setRotationPoint(0F, -31.5F, 0F);

		turretModel[10].addShapeBox(-18F, 0F, 12F, 5, 15, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 129
		turretModel[10].setRotationPoint(0F, -31.5F, -7F);

		turretModel[11].addShapeBox(2F, 0F, -12F, 10, 15, 24, 0F,0F, 0F, 0F, -1F, -4F, -6F, -1F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -11F, 2F, 0F, -11F, 0F, 0F, 0F); // Box 130
		turretModel[11].setRotationPoint(0F, -31.5F, 0F);

		turretModel[12].addShapeBox(-3.75F, -3.5F, -5.5F, 1, 1, 11, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 131
		turretModel[12].setRotationPoint(17F, -24F, 0F);

		turretModel[13].addShapeBox(3F, -1.4F, -8F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 194
		turretModel[13].setRotationPoint(0F, -31.4F, 0F);
		turretModel[13].rotateAngleZ = -0.41887902F;

		turretModel[14].addShapeBox(3F, -1.4F, 8F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195
		turretModel[14].setRotationPoint(0F, -31.4F, -5F);
		turretModel[14].rotateAngleZ = -0.41887902F;

		turretModel[15].addShapeBox(-16F, -32F, -4.5F, 3, 1, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 196
		turretModel[15].setRotationPoint(0F, 0F, 0F);

		turretModel[16].addShapeBox(-14F, -32F, -4.5F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 197
		turretModel[16].setRotationPoint(6F, 0F, 0F);

		turretModel[17].addShapeBox(-16F, -32F, -4.5F, 5, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		turretModel[17].setRotationPoint(3F, 0F, 0F);

		turretModel[18].addShapeBox(-1F, -1.4F, 8F, 2, 4, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 199
		turretModel[18].setRotationPoint(0F, -32.4F, 0F);

		turretModel[19].addShapeBox(0F, 0.2F, -10F, 4, 4, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 200
		turretModel[19].setRotationPoint(0F, -32.4F, 0F);

		turretModel[20].addShapeBox(-10F, -32.2F, -3.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		turretModel[20].setRotationPoint(6F, 0F, 0F);

		turretModel[21].addShapeBox(-18.5F, 0F, -4F, 5, 13, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		turretModel[21].setRotationPoint(0F, -30.5F, 0F);

		turretModel[22].addShapeBox(-10.5F, 2.5F, 11.1F, 50, 50, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, -42F, -42F, 0F, -42F, -42F, 0F, 0F, -42F, 0F); // Box 205
		turretModel[22].setRotationPoint(0F, -31.5F, 0F);

		turretModel[23].addShapeBox(-10.5F, 2.5F, -12.1F, 50, 50, 1, 0F,0F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, -42F, -42F, 0F, -42F, -42F, 0F, 0F, -42F, 0F); // Box 206
		turretModel[23].setRotationPoint(0F, -31.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 102
		barrelModel[1] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 103
		barrelModel[2] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 104
		barrelModel[3] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 106
		barrelModel[4] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 107
		barrelModel[5] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 108
		barrelModel[6] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 110
		barrelModel[7] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 111
		barrelModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 112

		barrelModel[0].addShapeBox(0.5F, 4F, -2.5F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 102
		barrelModel[0].setRotationPoint(13F, -25F, 0F);

		barrelModel[1].addShapeBox(0F, 2F, -3F, 9, 6, 6, 0F,-1F, 3.25F, 0F, 0F, -2F, -0.75F, 0F, -2F, -0.75F, -1F, 3.25F, 0F, -3F, 0F, 0F, 0.8F, -3F, -0.75F, 0.8F, -3F, -0.75F, -3F, 0F, 0F); // Box 103
		barrelModel[1].setRotationPoint(13.5F, -25F, 0F);

		barrelModel[2].addShapeBox(4F, 2.75F, -1.5F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 104
		barrelModel[2].setRotationPoint(13F, -25F, 0F);

		barrelModel[3].addShapeBox(4F, 0.75F, -1.5F, 16, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		barrelModel[3].setRotationPoint(13F, -25F, 0F);

		barrelModel[4].addShapeBox(4F, 1.75F, -1.5F, 16, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		barrelModel[4].setRotationPoint(13F, -25F, 0F);

		barrelModel[5].addShapeBox(16F, 2.75F, -1.5F, 5, 1, 3, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 108
		barrelModel[5].setRotationPoint(13F, -24.9F, 0F);

		barrelModel[6].addShapeBox(16F, 0.75F, -1.5F, 5, 1, 3, 0F,0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 110
		barrelModel[6].setRotationPoint(13F, -25.1F, 0F);

		barrelModel[7].addShapeBox(16F, 1.75F, -1.5F, 5, 1, 3, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 111
		barrelModel[7].setRotationPoint(13F, -24.9F, 0F);

		barrelModel[8].addShapeBox(11.5F, 4F, -2.5F, 6, 4, 5, 0F,0F, 0.1F, 0F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0F, 0.1F, 0F, 0F, 0.2F, -0.5F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0F, 0.2F, -0.5F); // Box 112
		barrelModel[8].setRotationPoint(13F, -25F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 136
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 137
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 138
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 139
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 140
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 141
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 142
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 143
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 144
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 145
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 146
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 147
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 148
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 150
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 151
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 153
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 155
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 156

		leftTrackWheelModels[0].addShapeBox(-6F, -2F, -6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftTrackWheelModels[0].setRotationPoint(-35F, 3F, 19F);

		leftTrackWheelModels[1].addShapeBox(-6F, -6F, -6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		leftTrackWheelModels[1].setRotationPoint(-35F, 3F, 19F);

		leftTrackWheelModels[2].addShapeBox(-6F, 2F, -6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 138
		leftTrackWheelModels[2].setRotationPoint(-35F, 3F, 19F);

		leftTrackWheelModels[3].addShapeBox(-6F, -2F, -6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		leftTrackWheelModels[3].setRotationPoint(-20F, 3F, 19F);

		leftTrackWheelModels[4].addShapeBox(-6F, -6F, -6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		leftTrackWheelModels[4].setRotationPoint(-20F, 3F, 19F);

		leftTrackWheelModels[5].addShapeBox(-6F, 2F, -6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 141
		leftTrackWheelModels[5].setRotationPoint(-20F, 3F, 19F);

		leftTrackWheelModels[6].addShapeBox(-6F, -2F, -6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftTrackWheelModels[6].setRotationPoint(1F, 3F, 19F);

		leftTrackWheelModels[7].addShapeBox(-6F, -6F, -6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		leftTrackWheelModels[7].setRotationPoint(1F, 3F, 19F);

		leftTrackWheelModels[8].addShapeBox(-6F, 2F, -6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 144
		leftTrackWheelModels[8].setRotationPoint(1F, 3F, 19F);

		leftTrackWheelModels[9].addShapeBox(-6F, -2F, -6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		leftTrackWheelModels[9].setRotationPoint(19F, 3F, 19F);

		leftTrackWheelModels[10].addShapeBox(-6F, -6F, -6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		leftTrackWheelModels[10].setRotationPoint(19F, 3F, 19F);

		leftTrackWheelModels[11].addShapeBox(-6F, 2F, -6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 147
		leftTrackWheelModels[11].setRotationPoint(19F, 3F, 19F);

		leftTrackWheelModels[12].addShapeBox(-3.5F, -1.5F, -6F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		leftTrackWheelModels[12].setRotationPoint(31.5F, -0.8F, 19.5F);

		leftTrackWheelModels[13].addShapeBox(-3.5F, 1.5F, -6F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 150
		leftTrackWheelModels[13].setRotationPoint(31.5F, -0.8F, 19.5F);

		leftTrackWheelModels[14].addShapeBox(-3.5F, -3.5F, -6F, 7, 2, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		leftTrackWheelModels[14].setRotationPoint(31.5F, -0.8F, 19.5F);

		leftTrackWheelModels[15].addShapeBox(-4.5F, -1.5F, -6F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		leftTrackWheelModels[15].setRotationPoint(-47.5F, 0.2F, 19.5F);

		leftTrackWheelModels[16].addShapeBox(-4.5F, 1.5F, -6F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 155
		leftTrackWheelModels[16].setRotationPoint(-47.5F, 0.2F, 19.5F);

		leftTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, -6F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftTrackWheelModels[17].setRotationPoint(-47.5F, 0.2F, 19.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 169
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 170
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 171
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 172
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 173
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 174
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 175
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 176
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 177
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 178
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Box 179
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 180
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 181
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 182
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 183
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 184
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 185
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 186

		rightTrackWheelModels[0].addShapeBox(-6F, -2F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		rightTrackWheelModels[0].setRotationPoint(-35F, 3F, -23F);

		rightTrackWheelModels[1].addShapeBox(-6F, -6F, 6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		rightTrackWheelModels[1].setRotationPoint(-35F, 3F, -23F);

		rightTrackWheelModels[2].addShapeBox(-6F, 2F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 171
		rightTrackWheelModels[2].setRotationPoint(-35F, 3F, -23F);

		rightTrackWheelModels[3].addShapeBox(-6F, -2F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightTrackWheelModels[3].setRotationPoint(-20F, 3F, -23F);

		rightTrackWheelModels[4].addShapeBox(-6F, -6F, 6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		rightTrackWheelModels[4].setRotationPoint(-20F, 3F, -23F);

		rightTrackWheelModels[5].addShapeBox(-6F, 2F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 174
		rightTrackWheelModels[5].setRotationPoint(-20F, 3F, -23F);

		rightTrackWheelModels[6].addShapeBox(-6F, -2F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		rightTrackWheelModels[6].setRotationPoint(1F, 3F, -23F);

		rightTrackWheelModels[7].addShapeBox(-6F, -6F, 6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightTrackWheelModels[7].setRotationPoint(1F, 3F, -23F);

		rightTrackWheelModels[8].addShapeBox(-6F, 2F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 177
		rightTrackWheelModels[8].setRotationPoint(1F, 3F, -23F);

		rightTrackWheelModels[9].addShapeBox(-6F, -2F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rightTrackWheelModels[9].setRotationPoint(19F, 3F, -23F);

		rightTrackWheelModels[10].addShapeBox(-6F, -6F, 6F, 12, 4, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		rightTrackWheelModels[10].setRotationPoint(19F, 3F, -23F);

		rightTrackWheelModels[11].addShapeBox(-6F, 2F, 6F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 180
		rightTrackWheelModels[11].setRotationPoint(19F, 3F, -23F);

		rightTrackWheelModels[12].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		rightTrackWheelModels[12].setRotationPoint(31.5F, -0.8F, -22.5F);

		rightTrackWheelModels[13].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 182
		rightTrackWheelModels[13].setRotationPoint(31.5F, -0.8F, -22.5F);

		rightTrackWheelModels[14].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		rightTrackWheelModels[14].setRotationPoint(31.5F, -0.8F, -22.5F);

		rightTrackWheelModels[15].addShapeBox(-4.5F, -1.5F, 6F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		rightTrackWheelModels[15].setRotationPoint(-47.5F, 0.2F, -22.5F);

		rightTrackWheelModels[16].addShapeBox(-4.5F, 1.5F, 6F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 185
		rightTrackWheelModels[16].setRotationPoint(-47.5F, 0.2F, -22.5F);

		rightTrackWheelModels[17].addShapeBox(-4.5F, -4.5F, 6F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		rightTrackWheelModels[17].setRotationPoint(-47.5F, 0.2F, -22.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 87
		leftTrackModel[1] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 88
		leftTrackModel[2] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 89
		leftTrackModel[3] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 90
		leftTrackModel[4] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 91
		leftTrackModel[5] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 92
		leftTrackModel[6] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 93
		leftTrackModel[7] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 94
		leftTrackModel[8] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 95
		leftTrackModel[9] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 96
		leftTrackModel[10] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 97
		leftTrackModel[11] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 98

		leftTrackModel[0].addBox(-0.4F, 0F, -6F, 4, 1, 4, 0F); // Box 87
		leftTrackModel[0].setRotationPoint(34F, -4.5F, 19F);
		leftTrackModel[0].rotateAngleZ = -1.01229097F;

		leftTrackModel[1].addShapeBox(0F, 0F, -6F, 1, 2, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		leftTrackModel[1].setRotationPoint(35F, -1.25F, 19F);
		leftTrackModel[1].rotateAngleZ = 0.05235988F;

		leftTrackModel[2].addBox(0F, -1F, -6F, 5, 1, 4, 0F); // Box 89
		leftTrackModel[2].setRotationPoint(33.5F, 5F, 19F);
		leftTrackModel[2].rotateAngleZ = 1.01229097F;

		leftTrackModel[3].addBox(0F, -1F, -6F, 13, 1, 4, 0F); // Box 90
		leftTrackModel[3].setRotationPoint(21.5F, 10F, 19F);
		leftTrackModel[3].rotateAngleZ = 0.40142573F;

		leftTrackModel[4].addBox(0F, 0F, -6F, 58, 1, 4, 0F); // Box 91
		leftTrackModel[4].setRotationPoint(-36.5F, 9F, 19F);

		leftTrackModel[5].addShapeBox(-14F, -1F, -6F, 14, 1, 4, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 92
		leftTrackModel[5].setRotationPoint(-36.5F, 10F, 19F);
		leftTrackModel[5].rotateAngleZ = -0.29670597F;

		leftTrackModel[6].addBox(0F, 0F, -6F, 1, 5, 4, 0F); // Box 93
		leftTrackModel[6].setRotationPoint(-53.32F, 2.5F, 19F);
		leftTrackModel[6].rotateAngleZ = 0.80285146F;

		leftTrackModel[7].addBox(0F, 0F, -6F, 1, 4, 4, 0F); // Box 94
		leftTrackModel[7].setRotationPoint(-52.8F, -1.37F, 19F);
		leftTrackModel[7].rotateAngleZ = -0.12217305F;

		leftTrackModel[8].addBox(-5F, 0F, -6F, 5, 1, 4, 0F); // Box 95
		leftTrackModel[8].setRotationPoint(-49.5F, -4.9F, 19F);
		leftTrackModel[8].rotateAngleZ = 0.83775804F;

		leftTrackModel[9].addBox(-13F, 0F, -6F, 13, 1, 4, 0F); // Box 96
		leftTrackModel[9].setRotationPoint(-36.7F, -5F, 19F);
		leftTrackModel[9].rotateAngleZ = -0.01308997F;

		leftTrackModel[10].addBox(-0.2F, 0F, -6F, 58, 1, 4, 0F); // Box 97
		leftTrackModel[10].setRotationPoint(-36.5F, -5F, 19F);
		leftTrackModel[10].rotateAngleZ = -0.00872665F;

		leftTrackModel[11].addBox(-0.2F, 0F, -6F, 13, 1, 4, 0F); // Box 98
		leftTrackModel[11].setRotationPoint(21F, -4.5F, 19F);
		leftTrackModel[11].rotateAngleZ = 0.03490659F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 157
		rightTrackModel[1] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 158
		rightTrackModel[2] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 159
		rightTrackModel[3] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 160
		rightTrackModel[4] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 161
		rightTrackModel[5] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 162
		rightTrackModel[6] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 163
		rightTrackModel[7] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 164
		rightTrackModel[8] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 165
		rightTrackModel[9] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 166
		rightTrackModel[10] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 167
		rightTrackModel[11] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 168

		rightTrackModel[0].addBox(-0.4F, 0F, 6F, 4, 1, 4, 0F); // Box 157
		rightTrackModel[0].setRotationPoint(34F, -4.5F, -23F);
		rightTrackModel[0].rotateAngleZ = -1.01229097F;

		rightTrackModel[1].addShapeBox(0F, 0F, 6F, 1, 2, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		rightTrackModel[1].setRotationPoint(35F, -1.25F, -23F);
		rightTrackModel[1].rotateAngleZ = 0.05235988F;

		rightTrackModel[2].addBox(0F, -1F, 6F, 5, 1, 4, 0F); // Box 159
		rightTrackModel[2].setRotationPoint(33.5F, 5F, -23F);
		rightTrackModel[2].rotateAngleZ = 1.01229097F;

		rightTrackModel[3].addBox(0F, -1F, 6F, 13, 1, 4, 0F); // Box 160
		rightTrackModel[3].setRotationPoint(21.5F, 10F, -23F);
		rightTrackModel[3].rotateAngleZ = 0.40142573F;

		rightTrackModel[4].addBox(0F, 0F, 6F, 58, 1, 4, 0F); // Box 161
		rightTrackModel[4].setRotationPoint(-36.5F, 9F, -23F);

		rightTrackModel[5].addShapeBox(-14F, -1F, 6F, 14, 1, 4, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 162
		rightTrackModel[5].setRotationPoint(-36.5F, 10F, -23F);
		rightTrackModel[5].rotateAngleZ = -0.29670597F;

		rightTrackModel[6].addBox(0F, 0F, 6F, 1, 5, 4, 0F); // Box 163
		rightTrackModel[6].setRotationPoint(-53.32F, 2.5F, -23F);
		rightTrackModel[6].rotateAngleZ = 0.80285146F;

		rightTrackModel[7].addBox(0F, 0F, 6F, 1, 4, 4, 0F); // Box 164
		rightTrackModel[7].setRotationPoint(-52.8F, -1.37F, -23F);
		rightTrackModel[7].rotateAngleZ = -0.12217305F;

		rightTrackModel[8].addBox(-5F, 0F, 6F, 5, 1, 4, 0F); // Box 165
		rightTrackModel[8].setRotationPoint(-49.5F, -4.9F, -23F);
		rightTrackModel[8].rotateAngleZ = 0.83775804F;

		rightTrackModel[9].addBox(-13F, 0F, 6F, 13, 1, 4, 0F); // Box 166
		rightTrackModel[9].setRotationPoint(-36.7F, -5F, -23F);
		rightTrackModel[9].rotateAngleZ = -0.01308997F;

		rightTrackModel[10].addBox(-0.2F, 0F, 6F, 58, 1, 4, 0F); // Box 167
		rightTrackModel[10].setRotationPoint(-36.5F, -5F, -23F);
		rightTrackModel[10].rotateAngleZ = -0.00872665F;

		rightTrackModel[11].addBox(-0.2F, 0F, 6F, 13, 1, 4, 0F); // Box 168
		rightTrackModel[11].setRotationPoint(21F, -4.5F, -23F);
		rightTrackModel[11].rotateAngleZ = 0.03490659F;
	}
}