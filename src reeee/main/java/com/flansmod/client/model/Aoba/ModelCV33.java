//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CV33
// Model Creator: 
// Created on: 18.12.2016 - 21:15:12
// Last changed on: 18.12.2016 - 21:15:12

package com.flansmod.client.model.Aoba; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCV33 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelCV33() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[43];
		leftTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackModel = new ModelRendererTurbo[50];
		rightTrackModel = new ModelRendererTurbo[60];

		initbodyModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		bodyModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box2
		bodyModel[2] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Import Box3
		bodyModel[3] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Import Box4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box5
		bodyModel[5] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Import Box6
		bodyModel[6] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import Box7
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box8
		bodyModel[8] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Import Box9
		bodyModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box10
		bodyModel[10] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box11
		bodyModel[11] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box12
		bodyModel[12] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Import Box13
		bodyModel[13] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box14
		bodyModel[14] = new ModelRendererTurbo(this, 761, 137, textureX, textureY); // Import Box16
		bodyModel[15] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Import Box17
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box18
		bodyModel[17] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box19
		bodyModel[18] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Import Box0
		bodyModel[19] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box1
		bodyModel[20] = new ModelRendererTurbo(this, 873, 193, textureX, textureY); // Import Box21
		bodyModel[21] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Import Box114
		bodyModel[22] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Import Box116
		bodyModel[23] = new ModelRendererTurbo(this, 545, 321, textureX, textureY); // Import Box117
		bodyModel[24] = new ModelRendererTurbo(this, 713, 321, textureX, textureY); // Import Box118
		bodyModel[25] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Import Box119
		bodyModel[26] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Import Box120
		bodyModel[27] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Import Box121
		bodyModel[28] = new ModelRendererTurbo(this, 881, 321, textureX, textureY); // Import Box122
		bodyModel[29] = new ModelRendererTurbo(this, 937, 329, textureX, textureY); // Import Box123
		bodyModel[30] = new ModelRendererTurbo(this, 537, 361, textureX, textureY); // Import Box124
		bodyModel[31] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Import Box0
		bodyModel[32] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Import Box1
		bodyModel[33] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Import Box2
		bodyModel[34] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Import Box3
		bodyModel[35] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Import Box8
		bodyModel[36] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Import Box10
		bodyModel[37] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Import Box4
		bodyModel[38] = new ModelRendererTurbo(this, 88, 230, textureX, textureY); // Import Box9
		bodyModel[39] = new ModelRendererTurbo(this, 830, 227, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 830, 227, textureX, textureY); // Box 1
		bodyModel[41] = new ModelRendererTurbo(this, 815, 227, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 815, 227, textureX, textureY); // Box 3

		bodyModel[0].addShapeBox(0F, 0F, 0F, 62, 12, 72, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F); // Import Box1
		bodyModel[0].setRotationPoint(-104F, 18F, -36F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 59, 36, 72, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[1].setRotationPoint(-42F, -6F, -36F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 23, 72, 0F,-8F, -1F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[2].setRotationPoint(-40F, -49F, -36F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 34, 57, 72, 0F,0F, -1F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[3].setRotationPoint(17F, -27F, -36F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 41, 38, 72, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F); // Import Box5
		bodyModel[4].setRotationPoint(51F, -10F, -36F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 28, 72, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 2F, 0F); // Import Box6
		bodyModel[5].setRotationPoint(92F, -6F, -36F);

		bodyModel[6].addBox(0F, 0F, 0F, 91, 3, 15, 0F); // Import Box7
		bodyModel[6].setRotationPoint(17F, -8F, -51F);
		bodyModel[6].rotateAngleZ = 0.05235988F;

		bodyModel[7].addBox(0F, 0F, 0F, 10, 3, 15, 0F); // Import Box8
		bodyModel[7].setRotationPoint(108F, -13F, -51F);
		bodyModel[7].rotateAngleZ = -0.27925268F;

		bodyModel[8].addBox(0F, 0F, 0F, 91, 3, 15, 0F); // Import Box9
		bodyModel[8].setRotationPoint(17F, -8F, 36F);
		bodyModel[8].rotateAngleZ = 0.05235988F;

		bodyModel[9].addBox(0F, 0F, 0F, 10, 3, 15, 0F); // Import Box10
		bodyModel[9].setRotationPoint(108F, -13F, 36F);
		bodyModel[9].rotateAngleZ = -0.27925268F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 34, 19, 15, 0F,0F, -1F, 0F, 0F, -17F, 0F, 0F, -17F, -15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F); // Import Box11
		bodyModel[10].setRotationPoint(17F, -27F, 36F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 34, 19, 15, 0F,0F, -1F, 0F, 0F, -17F, -15F, 0F, -17F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		bodyModel[11].setRotationPoint(17F, -27F, -51F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 50, 20, 102, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box13
		bodyModel[12].setRotationPoint(-33F, -26F, -51F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 57, 23, 13, 0F,-8F, -1F, 0F, -5F, -5F, 0F, -5F, -5F, -3F, -8F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 2F); // Import Box14
		bodyModel[13].setRotationPoint(-40F, -49F, 36F);

		bodyModel[14].addBox(0F, 0F, 0F, 91, 9, 1, 0F); // Import Box16
		bodyModel[14].setRotationPoint(17F, -8F, -36F);
		bodyModel[14].rotateAngleZ = 0.05235988F;

		bodyModel[15].addBox(0F, 0F, 0F, 91, 9, 1, 0F); // Import Box17
		bodyModel[15].setRotationPoint(17F, -8F, 35F);
		bodyModel[15].rotateAngleZ = 0.05235988F;

		bodyModel[16].addBox(0F, 0F, 0F, 5, 8, 1, 0F); // Import Box18
		bodyModel[16].setRotationPoint(108F, -13F, -36F);
		bodyModel[16].rotateAngleZ = -0.27925268F;

		bodyModel[17].addBox(0F, 0F, 0F, 5, 8, 1, 0F); // Import Box19
		bodyModel[17].setRotationPoint(108F, -13F, 35F);
		bodyModel[17].rotateAngleZ = -0.27925268F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 23, 102, 0F,0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F); // Import Box0
		bodyModel[18].setRotationPoint(-40F, -26F, -51F);

		bodyModel[19].addBox(0F, 0F, 0F, 64, 38, 72, 0F); // Import Box1
		bodyModel[19].setRotationPoint(-104F, -20F, -36F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 57, 23, 13, 0F,-8F, -1F, -3F, -5F, -5F, -3F, -5F, -5F, 0F, -8F, -1F, 0F, -7F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		bodyModel[20].setRotationPoint(-40F, -49F, -49F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 57, 9, 72, 0F,-8F, -1F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -8F, -1F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F); // Import Box114
		bodyModel[21].setRotationPoint(-40F, -49F, -36F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 50, 14, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Import Box116
		bodyModel[22].setRotationPoint(-33F, -40F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 50, 9, 30, 0F,-8F, -1F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -8F, -1F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F); // Import Box117
		bodyModel[23].setRotationPoint(-37F, -52F, -33F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 50, 9, 30, 0F,-8F, -1F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -8F, -1F, 0F, -8F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, 0F); // Import Box118
		bodyModel[24].setRotationPoint(-37F, -52F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 65, 8, 72, 0F,0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		bodyModel[25].setRotationPoint(-104F, -28F, -36F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 14, 2, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box120
		bodyModel[26].setRotationPoint(12F, -40F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 14, 2, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		bodyModel[27].setRotationPoint(12F, -40F, -38F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 4, 36, 0F); // Import Box122
		bodyModel[28].setRotationPoint(12F, -44F, -37F);
		bodyModel[28].rotateAngleZ = -0.34906585F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 17, 35, 0F,0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		bodyModel[29].setRotationPoint(12F, -31F, -36F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 23, 34, 33, 0F,0F, -1F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		bodyModel[30].setRotationPoint(13F, -41F, 3F);

		bodyModel[31].addBox(0F, -6F, -20F, 12, 14, 40, 0F); // Import Box0
		bodyModel[31].setRotationPoint(0F, 9F, 0F);

		bodyModel[32].addShapeBox(12F, -3F, -19F, 2, 4, 38, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box1
		bodyModel[32].setRotationPoint(0F, 9F, 0F);

		bodyModel[33].addShapeBox(12F, -6F, -20F, 12, 4, 40, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box2
		bodyModel[33].setRotationPoint(0F, 9F, 0F);

		bodyModel[34].addShapeBox(12F, 0F, -20F, 12, 6, 40, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import Box3
		bodyModel[34].setRotationPoint(0F, 9F, 0F);

		bodyModel[35].addBox(35F, -2F, -7F, 23, 3, 3, 0F); // Import Box8
		bodyModel[35].setRotationPoint(0F, 9F, 0F);

		bodyModel[36].addBox(35F, -2F, 5F, 23, 3, 3, 0F); // Import Box10
		bodyModel[36].setRotationPoint(0F, 9F, 0F);

		bodyModel[37].addShapeBox(14F, -3F, -8F, 21, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import Box4
		bodyModel[37].setRotationPoint(0F, 9F, 0F);

		bodyModel[38].addShapeBox(14F, -3F, 4F, 21, 5, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Import Box9
		bodyModel[38].setRotationPoint(0F, 9F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, -5F, 7, 1, 1, 0F,30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F); // Box 0
		bodyModel[39].setRotationPoint(45F, -22F, 30F);

		bodyModel[40].addShapeBox(0F, 0F, -5F, 7, 1, 1, 0F,30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F, 30F, 0.6F, 0.6F); // Box 1
		bodyModel[40].setRotationPoint(45F, -22F, 18F);

		bodyModel[41].addShapeBox(0F, 0F, -5F, 7, 1, 1, 0F,15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F); // Box 2
		bodyModel[41].setRotationPoint(35F, -21.5F, 18F);

		bodyModel[42].addShapeBox(0F, 0F, -5F, 7, 1, 1, 0F,15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F, 15F, 2F, 1.6F); // Box 3
		bodyModel[42].setRotationPoint(35F, -21.5F, 30F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Import Box40
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box41
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Import Box42
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Import Box43
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Import Box44
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import Box45
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Import Box46
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 945, 145, textureX, textureY); // Import Box47
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 977, 145, textureX, textureY); // Import Box48
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Import Box49
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Import Box50
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Import Box51
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Import Box62
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Import Box63
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 761, 169, textureX, textureY); // Import Box64
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Import Box69
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 761, 177, textureX, textureY); // Import Box70
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Import Box71
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Import Box73
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 761, 185, textureX, textureY); // Import Box74
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box75
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 945, 233, textureX, textureY); // Import Box82
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Import Box83
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Import Box84

		leftTrackWheelModels[0].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		leftTrackWheelModels[0].setRotationPoint(63F, 35F, 47F);

		leftTrackWheelModels[1].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box41
		leftTrackWheelModels[1].setRotationPoint(63F, 35F, 47F);

		leftTrackWheelModels[2].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		leftTrackWheelModels[2].setRotationPoint(63F, 35F, 47F);

		leftTrackWheelModels[3].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box43
		leftTrackWheelModels[3].setRotationPoint(39F, 35F, 47F);

		leftTrackWheelModels[4].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		leftTrackWheelModels[4].setRotationPoint(39F, 35F, 47F);

		leftTrackWheelModels[5].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		leftTrackWheelModels[5].setRotationPoint(39F, 35F, 47F);

		leftTrackWheelModels[6].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box46
		leftTrackWheelModels[6].setRotationPoint(-56F, 35F, 47F);

		leftTrackWheelModels[7].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		leftTrackWheelModels[7].setRotationPoint(-56F, 35F, 47F);

		leftTrackWheelModels[8].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		leftTrackWheelModels[8].setRotationPoint(-56F, 35F, 47F);

		leftTrackWheelModels[9].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box49
		leftTrackWheelModels[9].setRotationPoint(-34F, 35F, 47F);

		leftTrackWheelModels[10].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		leftTrackWheelModels[10].setRotationPoint(-34F, 35F, 47F);

		leftTrackWheelModels[11].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		leftTrackWheelModels[11].setRotationPoint(-34F, 35F, 47F);

		leftTrackWheelModels[12].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box62
		leftTrackWheelModels[12].setRotationPoint(17F, 35F, 46F);

		leftTrackWheelModels[13].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		leftTrackWheelModels[13].setRotationPoint(17F, 35F, 46F);

		leftTrackWheelModels[14].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		leftTrackWheelModels[14].setRotationPoint(17F, 35F, 46F);

		leftTrackWheelModels[15].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		leftTrackWheelModels[15].setRotationPoint(-13F, 35F, 46F);

		leftTrackWheelModels[16].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		leftTrackWheelModels[16].setRotationPoint(-13F, 35F, 46F);

		leftTrackWheelModels[17].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box71
		leftTrackWheelModels[17].setRotationPoint(-13F, 35F, 46F);

		leftTrackWheelModels[18].addShapeBox(-10.5F, -4F, 0F, 21, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		leftTrackWheelModels[18].setRotationPoint(106F, 6F, 37F);

		leftTrackWheelModels[19].addShapeBox(-10.5F, -11F, 0F, 21, 7, 13, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		leftTrackWheelModels[19].setRotationPoint(106F, 6F, 37F);

		leftTrackWheelModels[20].addShapeBox(-10.5F, 3F, 0F, 21, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Import Box75
		leftTrackWheelModels[20].setRotationPoint(106F, 6F, 37F);

		leftTrackWheelModels[21].addShapeBox(-10.5F, 3F, 0F, 21, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Import Box82
		leftTrackWheelModels[21].setRotationPoint(-103F, 19F, 37F);

		leftTrackWheelModels[22].addShapeBox(-10.5F, -4F, 0F, 21, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		leftTrackWheelModels[22].setRotationPoint(-103F, 19F, 37F);

		leftTrackWheelModels[23].addShapeBox(-10.5F, -11F, 0F, 21, 7, 12, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		leftTrackWheelModels[23].setRotationPoint(-103F, 19F, 37F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box9
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Import Box10
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Import Box11
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Import Box12
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Import Box13
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import Box14
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Import Box15
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Import Box16
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Import Box17
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Import Box18
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Import Box19
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Import Box20
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Import Box56
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Import Box57
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Import Box58
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Import Box59
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Import Box60
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Import Box61
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Import Box76
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 577, 201, textureX, textureY); // Import Box77
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Import Box78
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box79
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Import Box80
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 873, 233, textureX, textureY); // Import Box81

		rightTrackWheelModels[0].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		rightTrackWheelModels[0].setRotationPoint(63F, 35F, -52F);

		rightTrackWheelModels[1].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box10
		rightTrackWheelModels[1].setRotationPoint(63F, 35F, -52F);

		rightTrackWheelModels[2].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		rightTrackWheelModels[2].setRotationPoint(63F, 35F, -52F);

		rightTrackWheelModels[3].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box12
		rightTrackWheelModels[3].setRotationPoint(39F, 35F, -52F);

		rightTrackWheelModels[4].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		rightTrackWheelModels[4].setRotationPoint(39F, 35F, -52F);

		rightTrackWheelModels[5].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		rightTrackWheelModels[5].setRotationPoint(39F, 35F, -52F);

		rightTrackWheelModels[6].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box15
		rightTrackWheelModels[6].setRotationPoint(-56F, 35F, -52F);

		rightTrackWheelModels[7].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		rightTrackWheelModels[7].setRotationPoint(-56F, 35F, -52F);

		rightTrackWheelModels[8].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		rightTrackWheelModels[8].setRotationPoint(-56F, 35F, -52F);

		rightTrackWheelModels[9].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box18
		rightTrackWheelModels[9].setRotationPoint(-34F, 35F, -52F);

		rightTrackWheelModels[10].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		rightTrackWheelModels[10].setRotationPoint(-34F, 35F, -52F);

		rightTrackWheelModels[11].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		rightTrackWheelModels[11].setRotationPoint(-34F, 35F, -52F);

		rightTrackWheelModels[12].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box56
		rightTrackWheelModels[12].setRotationPoint(-13F, 35F, -52F);

		rightTrackWheelModels[13].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		rightTrackWheelModels[13].setRotationPoint(-13F, 35F, -52F);

		rightTrackWheelModels[14].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		rightTrackWheelModels[14].setRotationPoint(-13F, 35F, -52F);

		rightTrackWheelModels[15].addShapeBox(-5F, 2F, 0F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box59
		rightTrackWheelModels[15].setRotationPoint(17F, 35F, -52F);

		rightTrackWheelModels[16].addShapeBox(-5F, -2F, 0F, 10, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		rightTrackWheelModels[16].setRotationPoint(17F, 35F, -52F);

		rightTrackWheelModels[17].addShapeBox(-5F, -5F, 0F, 10, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		rightTrackWheelModels[17].setRotationPoint(17F, 35F, -52F);

		rightTrackWheelModels[18].addShapeBox(-10.5F, 3F, 0F, 21, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Import Box76
		rightTrackWheelModels[18].setRotationPoint(106F, 6F, -50F);

		rightTrackWheelModels[19].addShapeBox(-10.5F, -4F, 0F, 21, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		rightTrackWheelModels[19].setRotationPoint(106F, 6F, -50F);

		rightTrackWheelModels[20].addShapeBox(-10.5F, -11F, 0F, 21, 7, 13, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		rightTrackWheelModels[20].setRotationPoint(106F, 6F, -50F);

		rightTrackWheelModels[21].addShapeBox(-10.5F, 3F, 0F, 21, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F); // Import Box79
		rightTrackWheelModels[21].setRotationPoint(-103F, 19F, -49F);

		rightTrackWheelModels[22].addShapeBox(-10.5F, -4F, 0F, 21, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		rightTrackWheelModels[22].setRotationPoint(-103F, 19F, -49F);

		rightTrackWheelModels[23].addShapeBox(-10.5F, -11F, 0F, 21, 7, 12, 0F,-7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		rightTrackWheelModels[23].setRotationPoint(-103F, 19F, -49F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 745, 9, textureX, textureY); // Import Box47
		leftTrackModel[1] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Import Box48
		leftTrackModel[2] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Import Box49
		leftTrackModel[3] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Box50
		leftTrackModel[4] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import Box51
		leftTrackModel[5] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Import Box52
		leftTrackModel[6] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Import Box53
		leftTrackModel[7] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import Box54
		leftTrackModel[8] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Import Box61
		leftTrackModel[9] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Import Box62
		leftTrackModel[10] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box63
		leftTrackModel[11] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Import Box66
		leftTrackModel[12] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box67
		leftTrackModel[13] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Import Box68
		leftTrackModel[14] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Import Box69
		leftTrackModel[15] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Import Box70
		leftTrackModel[16] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Import Box71
		leftTrackModel[17] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Import Box72
		leftTrackModel[18] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Import Box22
		leftTrackModel[19] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Import Box23
		leftTrackModel[20] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Import Box24
		leftTrackModel[21] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Import Box25
		leftTrackModel[22] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Import Box26
		leftTrackModel[23] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Import Box27
		leftTrackModel[24] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Import Box28
		leftTrackModel[25] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box29
		leftTrackModel[26] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Import Box30
		leftTrackModel[27] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Import Box31
		leftTrackModel[28] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Import Box32
		leftTrackModel[29] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box33
		leftTrackModel[30] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Import Box34
		leftTrackModel[31] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box35
		leftTrackModel[32] = new ModelRendererTurbo(this, 929, 129, textureX, textureY); // Import Box36
		leftTrackModel[33] = new ModelRendererTurbo(this, 953, 137, textureX, textureY); // Import Box37
		leftTrackModel[34] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box38
		leftTrackModel[35] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Import Box39
		leftTrackModel[36] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Import Box85
		leftTrackModel[37] = new ModelRendererTurbo(this, 801, 273, textureX, textureY); // Import Box86
		leftTrackModel[38] = new ModelRendererTurbo(this, 817, 193, textureX, textureY); // Import Box87
		leftTrackModel[39] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Import Box88
		leftTrackModel[40] = new ModelRendererTurbo(this, 817, 217, textureX, textureY); // Import Box89
		leftTrackModel[41] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Import Box90
		leftTrackModel[42] = new ModelRendererTurbo(this, 601, 289, textureX, textureY); // Import Box91
		leftTrackModel[43] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Import Box92
		leftTrackModel[44] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Import Box93
		leftTrackModel[45] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Import Box94
		leftTrackModel[46] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Import Box95
		leftTrackModel[47] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import Box96
		leftTrackModel[48] = new ModelRendererTurbo(this, 33, 257, textureX, textureY); // Import Box97
		leftTrackModel[49] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Import Box98

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 13, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Import Box47
		leftTrackModel[0].setRotationPoint(-84F, 12F, 46F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 13, 3, 2, 0F); // Import Box48
		leftTrackModel[1].setRotationPoint(-84F, 17F, 49F);

		leftTrackModel[2].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Import Box49
		leftTrackModel[2].setRotationPoint(-73F, 20F, 49F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 13, 3, 2, 0F); // Import Box50
		leftTrackModel[3].setRotationPoint(-84F, 26F, 49F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 3, 6, 2, 0F); // Import Box51
		leftTrackModel[4].setRotationPoint(-84F, 20F, 49F);

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box52
		leftTrackModel[5].setRotationPoint(-84F, 29F, 49F);

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box53
		leftTrackModel[6].setRotationPoint(-75F, 29F, 49F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 22, 9, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box54
		leftTrackModel[7].setRotationPoint(-103F, 16F, 49F);
		leftTrackModel[7].rotateAngleZ = -0.20943951F;

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 35, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		leftTrackModel[8].setRotationPoint(20F, 15F, 36F);

		leftTrackModel[9].addShapeBox(0F, 0F, 0F, 35, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		leftTrackModel[9].setRotationPoint(20F, 15F, 43F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 33, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		leftTrackModel[10].setRotationPoint(21F, 16F, 41F);

		leftTrackModel[11].addShapeBox(0F, 0F, 0F, 35, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		leftTrackModel[11].setRotationPoint(-49F, 15F, 36F);

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 33, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		leftTrackModel[12].setRotationPoint(-48F, 16F, 41F);

		leftTrackModel[13].addShapeBox(0F, 0F, 0F, 35, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		leftTrackModel[13].setRotationPoint(-49F, 15F, 43F);

		leftTrackModel[14].addShapeBox(0F, 0F, -5F, 46, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		leftTrackModel[14].setRotationPoint(39F, 9F, 41F);

		leftTrackModel[15].addShapeBox(0F, 0F, -5F, 46, 4, 18, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		leftTrackModel[15].setRotationPoint(39F, 3F, 41F);

		leftTrackModel[16].addShapeBox(0F, 0F, -5F, 42, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		leftTrackModel[16].setRotationPoint(41F, 7F, 41F);

		leftTrackModel[17].addBox(0F, 0F, 0F, 13, 2, 10, 0F); // Import Box72
		leftTrackModel[17].setRotationPoint(-84F, 10F, 36F);

		leftTrackModel[18].addShapeBox(0F, 0F, -5F, 131, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		leftTrackModel[18].setRotationPoint(-64F, 41F, 43F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 70, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		leftTrackModel[19].setRotationPoint(-32F, 22F, 50F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box24
		leftTrackModel[20].setRotationPoint(-36F, 22F, 50F);

		leftTrackModel[21].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box25
		leftTrackModel[21].setRotationPoint(-46F, 21F, 50F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box26
		leftTrackModel[22].setRotationPoint(38F, 22F, 50F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 9, 7, 2, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box27
		leftTrackModel[23].setRotationPoint(42F, 21F, 50F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box28
		leftTrackModel[24].setRotationPoint(-48F, 20F, 50F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box29
		leftTrackModel[25].setRotationPoint(51F, 20F, 50F);

		leftTrackModel[26].addBox(0F, 0F, 0F, 26, 3, 2, 0F); // Import Box30
		leftTrackModel[26].setRotationPoint(-58F, 34F, 50F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		leftTrackModel[27].setRotationPoint(-58F, 29F, 50F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		leftTrackModel[28].setRotationPoint(38F, 29F, 50F);

		leftTrackModel[29].addBox(0F, 0F, 0F, 26, 3, 2, 0F); // Import Box33
		leftTrackModel[29].setRotationPoint(38F, 34F, 50F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,2F, -8F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 2F, -8F, 0F, 0F, 7F, 0F, 5F, -3F, 0F, 5F, -3F, 0F, 0F, 7F, 0F); // Import Box34
		leftTrackModel[30].setRotationPoint(-46F, 21F, 48F);

		leftTrackModel[31].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,-7F, 2F, 0F, 2F, -8F, 0F, 2F, -8F, 0F, -7F, 2F, 0F, 5F, -3F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 5F, -3F, 0F); // Import Box35
		leftTrackModel[31].setRotationPoint(40F, 21F, 48F);

		leftTrackModel[32].addBox(0F, 0F, 0F, 26, 3, 2, 0F); // Import Box36
		leftTrackModel[32].setRotationPoint(38F, 34F, 45F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		leftTrackModel[33].setRotationPoint(38F, 29F, 45F);

		leftTrackModel[34].addBox(0F, 0F, 0F, 26, 3, 2, 0F); // Import Box38
		leftTrackModel[34].setRotationPoint(-58F, 34F, 45F);

		leftTrackModel[35].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		leftTrackModel[35].setRotationPoint(-58F, 29F, 45F);

		leftTrackModel[36].addShapeBox(0F, 0F, -5F, 56, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		leftTrackModel[36].setRotationPoint(67F, 41F, 43F);
		leftTrackModel[36].rotateAngleZ = 0.54105207F;

		leftTrackModel[37].addShapeBox(0F, 0F, -5F, 91, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		leftTrackModel[37].setRotationPoint(19F, -1F, 43F);
		leftTrackModel[37].rotateAngleZ = 0.05235988F;

		leftTrackModel[38].addShapeBox(0F, 0F, -5F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		leftTrackModel[38].setRotationPoint(110F, -6F, 43F);
		leftTrackModel[38].rotateAngleZ = -0.61086524F;

		leftTrackModel[39].addShapeBox(0F, 0F, -5F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		leftTrackModel[39].setRotationPoint(115F, -3F, 43F);
		leftTrackModel[39].rotateAngleZ = -1.08210414F;

		leftTrackModel[40].addShapeBox(0F, 0F, -5F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		leftTrackModel[40].setRotationPoint(118F, 2F, 43F);
		leftTrackModel[40].rotateAngleZ = -1.51843645F;

		leftTrackModel[41].addShapeBox(0F, 0F, -5F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		leftTrackModel[41].setRotationPoint(118F, 8F, 43F);
		leftTrackModel[41].rotateAngleZ = -1.93731547F;

		leftTrackModel[42].addShapeBox(3F, 0F, -5F, 123, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		leftTrackModel[42].setRotationPoint(-106F, 6F, 43F);
		leftTrackModel[42].rotateAngleZ = 0.05235988F;

		leftTrackModel[43].addShapeBox(0F, 0F, -5F, 47, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		leftTrackModel[43].setRotationPoint(-108F, 28F, 43F);
		leftTrackModel[43].rotateAngleZ = -0.27925268F;

		leftTrackModel[44].addShapeBox(-6F, 0F, -5F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		leftTrackModel[44].setRotationPoint(-103F, 6F, 43F);
		leftTrackModel[44].rotateAngleZ = 0.4712389F;

		leftTrackModel[45].addShapeBox(-6F, 0F, -5F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		leftTrackModel[45].setRotationPoint(-108F, 8F, 43F);
		leftTrackModel[45].rotateAngleZ = 0.78539816F;

		leftTrackModel[46].addShapeBox(-6F, 0F, -5F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		leftTrackModel[46].setRotationPoint(-112F, 12F, 43F);
		leftTrackModel[46].rotateAngleZ = 0.89011792F;

		leftTrackModel[47].addShapeBox(-6F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		leftTrackModel[47].setRotationPoint(-115F, 16F, 38F);
		leftTrackModel[47].rotateAngleZ = 1.57079633F;

		leftTrackModel[48].addShapeBox(-6F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		leftTrackModel[48].setRotationPoint(-115F, 21F, 38F);
		leftTrackModel[48].rotateAngleZ = 2.0943951F;

		leftTrackModel[49].addShapeBox(-6F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		leftTrackModel[49].setRotationPoint(-112F, 26F, 38F);
		leftTrackModel[49].rotateAngleZ = 2.26892803F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Import Box2
		rightTrackModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box3
		rightTrackModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box4
		rightTrackModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box5
		rightTrackModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box6
		rightTrackModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box7
		rightTrackModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box8
		rightTrackModel[7] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Import Box9
		rightTrackModel[8] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Import Box10
		rightTrackModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box11
		rightTrackModel[10] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Import Box12
		rightTrackModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box13
		rightTrackModel[12] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Import Box14
		rightTrackModel[13] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Import Box15
		rightTrackModel[14] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box16
		rightTrackModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box17
		rightTrackModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box18
		rightTrackModel[17] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box19
		rightTrackModel[18] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Import Box20
		rightTrackModel[19] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box21
		rightTrackModel[20] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Import Box22
		rightTrackModel[21] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import Box23
		rightTrackModel[22] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Import Box24
		rightTrackModel[23] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box25
		rightTrackModel[24] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Import Box28
		rightTrackModel[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box29
		rightTrackModel[26] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Import Box30
		rightTrackModel[27] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Import Box31
		rightTrackModel[28] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Import Box32
		rightTrackModel[29] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Import Box33
		rightTrackModel[30] = new ModelRendererTurbo(this, 761, 169, textureX, textureY); // Import Box34
		rightTrackModel[31] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Import Box35
		rightTrackModel[32] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Import Box36
		rightTrackModel[33] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Import Box37
		rightTrackModel[34] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import Box38
		rightTrackModel[35] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Import Box39
		rightTrackModel[36] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Import Box40
		rightTrackModel[37] = new ModelRendererTurbo(this, 577, 153, textureX, textureY); // Import Box52
		rightTrackModel[38] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Import Box53
		rightTrackModel[39] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Import Box54
		rightTrackModel[40] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Import Box55
		rightTrackModel[41] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Import Box65
		rightTrackModel[42] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Import Box66
		rightTrackModel[43] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Import Box67
		rightTrackModel[44] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Import Box68
		rightTrackModel[45] = new ModelRendererTurbo(this, 881, 289, textureX, textureY); // Import Box99
		rightTrackModel[46] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Import Box100
		rightTrackModel[47] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Import Box101
		rightTrackModel[48] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Import Box102
		rightTrackModel[49] = new ModelRendererTurbo(this, 969, 257, textureX, textureY); // Import Box103
		rightTrackModel[50] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Import Box104
		rightTrackModel[51] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Import Box105
		rightTrackModel[52] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Import Box106
		rightTrackModel[53] = new ModelRendererTurbo(this, 561, 305, textureX, textureY); // Import Box107
		rightTrackModel[54] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Import Box108
		rightTrackModel[55] = new ModelRendererTurbo(this, 841, 305, textureX, textureY); // Import Box109
		rightTrackModel[56] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Import Box110
		rightTrackModel[57] = new ModelRendererTurbo(this, 969, 313, textureX, textureY); // Import Box111
		rightTrackModel[58] = new ModelRendererTurbo(this, 249, 321, textureX, textureY); // Import Box112
		rightTrackModel[59] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Import Box113

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 70, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		rightTrackModel[0].setRotationPoint(-32F, 22F, -54F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box3
		rightTrackModel[1].setRotationPoint(-36F, 22F, -55F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box4
		rightTrackModel[2].setRotationPoint(-46F, 21F, -54F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box5
		rightTrackModel[3].setRotationPoint(38F, 22F, -55F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 9, 7, 2, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box6
		rightTrackModel[4].setRotationPoint(42F, 21F, -54F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box7
		rightTrackModel[5].setRotationPoint(-48F, 20F, -54F);

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box8
		rightTrackModel[6].setRotationPoint(51F, 20F, -54F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 13, 5, 2, 0F,0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import Box9
		rightTrackModel[7].setRotationPoint(-84F, 12F, -48F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 13, 3, 2, 0F); // Import Box10
		rightTrackModel[8].setRotationPoint(-84F, 17F, -51F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Import Box11
		rightTrackModel[9].setRotationPoint(-73F, 20F, -51F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 13, 3, 2, 0F); // Import Box12
		rightTrackModel[10].setRotationPoint(-84F, 26F, -51F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 3, 6, 2, 0F); // Import Box13
		rightTrackModel[11].setRotationPoint(-84F, 20F, -51F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box14
		rightTrackModel[12].setRotationPoint(-84F, 29F, -51F);

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box15
		rightTrackModel[13].setRotationPoint(-75F, 29F, -51F);

		rightTrackModel[14].addShapeBox(0F, 0F, 0F, 22, 9, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box16
		rightTrackModel[14].setRotationPoint(-103F, 16F, -51F);
		rightTrackModel[14].rotateAngleZ = -0.20943951F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 26, 3, 2, 0F); // Import Box17
		rightTrackModel[15].setRotationPoint(-58F, 34F, -54F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		rightTrackModel[16].setRotationPoint(-58F, 29F, -54F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		rightTrackModel[17].setRotationPoint(38F, 29F, -54F);

		rightTrackModel[18].addBox(0F, 0F, 0F, 26, 3, 2, 0F); // Import Box20
		rightTrackModel[18].setRotationPoint(38F, 34F, -54F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,2F, -8F, 0F, -7F, 2F, 0F, -7F, 2F, 0F, 2F, -8F, 0F, 0F, 7F, 0F, 5F, -3F, 0F, 5F, -3F, 0F, 0F, 7F, 0F); // Import Box21
		rightTrackModel[19].setRotationPoint(-46F, 21F, -52F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,-7F, 2F, 0F, 2F, -8F, 0F, 2F, -8F, 0F, -7F, 2F, 0F, 5F, -3F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 5F, -3F, 0F); // Import Box22
		rightTrackModel[20].setRotationPoint(40F, 21F, -52F);

		rightTrackModel[21].addShapeBox(0F, 0F, 0F, 35, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		rightTrackModel[21].setRotationPoint(20F, 15F, -41F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 35, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		rightTrackModel[22].setRotationPoint(20F, 15F, -48F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 33, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		rightTrackModel[23].setRotationPoint(21F, 16F, -43F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 35, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		rightTrackModel[24].setRotationPoint(-49F, 15F, -41F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 33, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		rightTrackModel[25].setRotationPoint(-48F, 16F, -43F);

		rightTrackModel[26].addShapeBox(0F, 0F, 0F, 35, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		rightTrackModel[26].setRotationPoint(-49F, 15F, -48F);

		rightTrackModel[27].addShapeBox(0F, 0F, -5F, 46, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		rightTrackModel[27].setRotationPoint(39F, 9F, -49F);

		rightTrackModel[28].addShapeBox(0F, 0F, -5F, 46, 4, 18, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		rightTrackModel[28].setRotationPoint(39F, 3F, -49F);

		rightTrackModel[29].addShapeBox(0F, 0F, -5F, 42, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		rightTrackModel[29].setRotationPoint(41F, 7F, -39F);

		rightTrackModel[30].addBox(0F, 0F, 0F, 4, 4, 99, 0F); // Import Box34
		rightTrackModel[30].setRotationPoint(42F, 21F, -51F);

		rightTrackModel[31].addBox(0F, 0F, 0F, 4, 4, 99, 0F); // Import Box35
		rightTrackModel[31].setRotationPoint(-43F, 21F, -50F);

		rightTrackModel[32].addBox(0F, 0F, 0F, 13, 2, 10, 0F); // Import Box36
		rightTrackModel[32].setRotationPoint(-84F, 10F, -46F);

		rightTrackModel[33].addBox(0F, 0F, 0F, 26, 3, 2, 0F); // Import Box37
		rightTrackModel[33].setRotationPoint(38F, 34F, -49F);

		rightTrackModel[34].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		rightTrackModel[34].setRotationPoint(38F, 29F, -49F);

		rightTrackModel[35].addBox(0F, 0F, 0F, 26, 3, 2, 0F); // Import Box39
		rightTrackModel[35].setRotationPoint(-58F, 34F, -49F);

		rightTrackModel[36].addShapeBox(0F, 0F, 0F, 26, 5, 2, 0F,-11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		rightTrackModel[36].setRotationPoint(-58F, 29F, -49F);

		rightTrackModel[37].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		rightTrackModel[37].setRotationPoint(14F, 29F, -54F);

		rightTrackModel[38].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box53
		rightTrackModel[38].setRotationPoint(-20F, 29F, -54F);

		rightTrackModel[39].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box54
		rightTrackModel[39].setRotationPoint(-20F, 29F, -49F);

		rightTrackModel[40].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		rightTrackModel[40].setRotationPoint(14F, 29F, -49F);

		rightTrackModel[41].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		rightTrackModel[41].setRotationPoint(14F, 29F, 49F);

		rightTrackModel[42].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		rightTrackModel[42].setRotationPoint(14F, 29F, 44F);

		rightTrackModel[43].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box67
		rightTrackModel[43].setRotationPoint(-20F, 29F, 49F);

		rightTrackModel[44].addShapeBox(0F, 0F, 0F, 10, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Import Box68
		rightTrackModel[44].setRotationPoint(-20F, 29F, 44F);

		rightTrackModel[45].addShapeBox(0F, 0F, -5F, 47, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		rightTrackModel[45].setRotationPoint(-108F, 28F, -47F);
		rightTrackModel[45].rotateAngleZ = -0.27925268F;

		rightTrackModel[46].addShapeBox(-6F, 0F, -5F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		rightTrackModel[46].setRotationPoint(-103F, 6F, -47F);
		rightTrackModel[46].rotateAngleZ = 0.4712389F;

		rightTrackModel[47].addShapeBox(-6F, 0F, -5F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		rightTrackModel[47].setRotationPoint(-108F, 8F, -47F);
		rightTrackModel[47].rotateAngleZ = 0.78539816F;

		rightTrackModel[48].addShapeBox(-6F, 0F, -5F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		rightTrackModel[48].setRotationPoint(-112F, 12F, -47F);
		rightTrackModel[48].rotateAngleZ = 0.89011792F;

		rightTrackModel[49].addShapeBox(-6F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		rightTrackModel[49].setRotationPoint(-115F, 16F, -52F);
		rightTrackModel[49].rotateAngleZ = 1.57079633F;

		rightTrackModel[50].addShapeBox(-6F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
		rightTrackModel[50].setRotationPoint(-115F, 21F, -52F);
		rightTrackModel[50].rotateAngleZ = 2.0943951F;

		rightTrackModel[51].addShapeBox(-6F, 0F, 0F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		rightTrackModel[51].setRotationPoint(-112F, 26F, -52F);
		rightTrackModel[51].rotateAngleZ = 2.26892803F;

		rightTrackModel[52].addShapeBox(0F, 0F, -5F, 131, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		rightTrackModel[52].setRotationPoint(-64F, 41F, -47F);

		rightTrackModel[53].addShapeBox(3F, 0F, -5F, 123, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		rightTrackModel[53].setRotationPoint(-106F, 6F, -47F);
		rightTrackModel[53].rotateAngleZ = 0.05235988F;

		rightTrackModel[54].addShapeBox(0F, 0F, -5F, 91, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		rightTrackModel[54].setRotationPoint(19F, -1F, -47F);
		rightTrackModel[54].rotateAngleZ = 0.05235988F;

		rightTrackModel[55].addShapeBox(0F, 0F, -5F, 56, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box109
		rightTrackModel[55].setRotationPoint(67F, 41F, -47F);
		rightTrackModel[55].rotateAngleZ = 0.54105207F;

		rightTrackModel[56].addShapeBox(0F, 0F, -5F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		rightTrackModel[56].setRotationPoint(118F, 8F, -47F);
		rightTrackModel[56].rotateAngleZ = -1.93731547F;

		rightTrackModel[57].addShapeBox(0F, 0F, -5F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		rightTrackModel[57].setRotationPoint(118F, 2F, -47F);
		rightTrackModel[57].rotateAngleZ = -1.51843645F;

		rightTrackModel[58].addShapeBox(0F, 0F, -5F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		rightTrackModel[58].setRotationPoint(115F, -3F, -47F);
		rightTrackModel[58].rotateAngleZ = -1.08210414F;

		rightTrackModel[59].addShapeBox(0F, 0F, -5F, 7, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		rightTrackModel[59].setRotationPoint(110F, -6F, -47F);
		rightTrackModel[59].rotateAngleZ = -0.61086524F;
	}
}