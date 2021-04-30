//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M7534
// Model Creator: 
// Created on: 18.12.2016 - 21:46:13
// Last changed on: 18.12.2016 - 21:46:13

package com.flansmod.client.model.Aoba; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSemovente75 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSemovente75() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[37];
		barrelModel = new ModelRendererTurbo[6];
		leftTrackModel = new ModelRendererTurbo[148];
		rightTrackModel = new ModelRendererTurbo[148];

		initbodyModel_1();
		initbarrelModel_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Import Box4
		bodyModel[5] = new ModelRendererTurbo(this, 625, 161, textureX, textureY); // Import Box5
		bodyModel[6] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Import Box6
		bodyModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box7
		bodyModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box8
		bodyModel[9] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Import Box9
		bodyModel[10] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import Box10
		bodyModel[11] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box11
		bodyModel[12] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import Box12
		bodyModel[13] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Import Box14
		bodyModel[14] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Import Box15
		bodyModel[15] = new ModelRendererTurbo(this, 657, 353, textureX, textureY); // Import Box16
		bodyModel[16] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Import Box17
		bodyModel[17] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box18
		bodyModel[18] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box19
		bodyModel[19] = new ModelRendererTurbo(this, 817, 161, textureX, textureY); // Import Box20
		bodyModel[20] = new ModelRendererTurbo(this, 817, 185, textureX, textureY); // Import Box21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Import Box22
		bodyModel[22] = new ModelRendererTurbo(this, 361, 393, textureX, textureY); // Import Box23
		bodyModel[23] = new ModelRendererTurbo(this, 721, 409, textureX, textureY); // Import Box24
		bodyModel[24] = new ModelRendererTurbo(this, 1, 521, textureX, textureY); // Import Box25
		bodyModel[25] = new ModelRendererTurbo(this, 745, 681, textureX, textureY); // Import Box1
		bodyModel[26] = new ModelRendererTurbo(this, 1, 713, textureX, textureY); // Import Box1
		bodyModel[27] = new ModelRendererTurbo(this, 81, 713, textureX, textureY); // Import Box1
		bodyModel[28] = new ModelRendererTurbo(this, 161, 713, textureX, textureY); // Import Box1
		bodyModel[29] = new ModelRendererTurbo(this, 905, 729, textureX, textureY); // Import Box15
		bodyModel[30] = new ModelRendererTurbo(this, 65, 753, textureX, textureY); // Import Box16
		bodyModel[31] = new ModelRendererTurbo(this, 377, 753, textureX, textureY); // Import Box16
		bodyModel[32] = new ModelRendererTurbo(this, 529, 753, textureX, textureY); // Import Box25
		bodyModel[33] = new ModelRendererTurbo(this, 129, 769, textureX, textureY); // Import Box16
		bodyModel[34] = new ModelRendererTurbo(this, 609, 753, textureX, textureY); // Import Box16
		bodyModel[35] = new ModelRendererTurbo(this, 281, 777, textureX, textureY); // Import Box16
		bodyModel[36] = new ModelRendererTurbo(this, 377, 753, textureX, textureY); // Import Box16

		bodyModel[0].addShapeBox(0F, 0F, 0F, 87, 44, 110, 0F,0F, 0F, 0F, 0F, 10F, -22F, 0F, 10F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-97F, -74F, -55F);

		bodyModel[1].addBox(0F, 0F, 0F, 7, 15, 35, 0F); // Import Box1
		bodyModel[1].setRotationPoint(10F, -69F, -50F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 197, 43, 110, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import Box2
		bodyModel[2].setRotationPoint(-161F, -30F, -55F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 62, 43, 110, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[3].setRotationPoint(36F, -30F, -55F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 23, 15, 110, 0F,1F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		bodyModel[4].setRotationPoint(13F, -45F, -55F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 37, 41, 110, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F); // Import Box5
		bodyModel[5].setRotationPoint(-198F, -30F, -55F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 296, 8, 28, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[6].setRotationPoint(-208F, -30F, -83F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 31, 8, 28, 0F,4F, -3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box7
		bodyModel[7].setRotationPoint(-239F, -25F, -83F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 22, 8, 28, 0F,0F, 5F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Import Box8
		bodyModel[8].setRotationPoint(88F, -33F, -83F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 296, 8, 28, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Import Box9
		bodyModel[9].setRotationPoint(-208F, -30F, 55F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 31, 8, 28, 0F,4F, -3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Import Box10
		bodyModel[10].setRotationPoint(-239F, -25F, 55F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 8, 28, 0F,0F, 5F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Import Box11
		bodyModel[11].setRotationPoint(88F, -33F, 55F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 16, 66, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 4F, 0F, 22F, 4F, 0F, 22F, 0F, 0F, 22F); // Import Box12
		bodyModel[12].setRotationPoint(-10F, -84F, -33F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 24, 37, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[13].setRotationPoint(-10F, -68F, 55F);

		bodyModel[14].addBox(0F, 0F, 0F, 87, 37, 18, 0F); // Import Box15
		bodyModel[14].setRotationPoint(-97F, -68F, 55F);

		bodyModel[15].addBox(0F, 0F, 0F, 87, 37, 18, 0F); // Import Box16
		bodyModel[15].setRotationPoint(-97F, -68F, -73F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 20, 16, 18, 0F,0F, 0F, 22F, 0F, 0F, 22F, -20F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, 0F, 4F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[16].setRotationPoint(-10F, -84F, 55F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 16, 18, 0F,0F, 0F, -22F, -20F, 0F, -22F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, -20F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[17].setRotationPoint(-10F, -84F, -73F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 24, 37, 18, 0F,0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[18].setRotationPoint(-10F, -68F, -73F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 87, 16, 5, 0F,0F, -10F, 13F, 0F, 0F, 35F, 0F, 0F, -22F, 0F, -10F, -17F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		bodyModel[19].setRotationPoint(-97F, -84F, 68F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 87, 16, 5, 0F,0F, -10F, -17F, 0F, 0F, -22F, 0F, 0F, 35F, 0F, -10F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F); // Import Box21
		bodyModel[20].setRotationPoint(-97F, -84F, -73F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 69, 16, 110, 0F,0F, 0F, -45F, 0F, 3F, -45F, 0F, 3F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[21].setRotationPoint(-166F, -60F, -55F);

		bodyModel[22].addBox(0F, 0F, 0F, 69, 16, 110, 0F); // Import Box23
		bodyModel[22].setRotationPoint(-166F, -44F, -55F);

		bodyModel[23].addBox(0F, 0F, 0F, 33, 10, 110, 0F); // Import Box24
		bodyModel[23].setRotationPoint(-199F, -38F, -55F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 33, 10, 110, 0F,0F, 0F, -45F, 0F, 3F, -45F, 0F, 3F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[24].setRotationPoint(-199F, -48F, -55F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 24, 37, 110, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[25].setRotationPoint(-10F, -68F, -55F);

		bodyModel[26].addBox(0F, 0F, 0F, 8, 14, 30, 0F); // Import Box1
		bodyModel[26].setRotationPoint(10F, -68F, -12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 7, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F); // Import Box1
		bodyModel[27].setRotationPoint(10F, -54F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 7, 30, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[28].setRotationPoint(10F, -75F, -12F);

		bodyModel[29].addBox(0F, 0F, 0F, 33, 14, 15, 0F); // Import Box15
		bodyModel[29].setRotationPoint(-130F, -44F, 55F);

		bodyModel[30].addBox(0F, 0F, 0F, 33, 14, 15, 0F); // Import Box16
		bodyModel[30].setRotationPoint(-130F, -44F, -70F);

		bodyModel[31].addBox(0F, 0F, 0F, 52, 2, 40, 0F); // Import Box16
		bodyModel[31].setRotationPoint(-158F, -47F, -52F);
		bodyModel[31].rotateAngleX = 0.38397244F;

		bodyModel[32].addBox(0F, 0F, 0F, 33, 10, 26, 0F); // Import Box25
		bodyModel[32].setRotationPoint(-195F, -56F, -13F);

		bodyModel[33].addBox(0F, -2F, 0F, 52, 2, 40, 0F); // Import Box16
		bodyModel[33].setRotationPoint(-158F, -47F, 52F);
		bodyModel[33].rotateAngleX = 2.75762022F;

		bodyModel[34].addBox(0F, 0F, 0F, 26, 2, 40, 0F); // Import Box16
		bodyModel[34].setRotationPoint(-195F, -40F, -52F);
		bodyModel[34].rotateAngleX = 0.26179939F;

		bodyModel[35].addBox(0F, -2F, 0F, 26, 2, 40, 0F); // Import Box16
		bodyModel[35].setRotationPoint(-195F, -40F, 52F);
		bodyModel[35].rotateAngleX = 2.87979327F;

		bodyModel[36].addBox(0F, 0F, 0F, 40, 11, 40, 0F); // Import Box16
		bodyModel[36].setRotationPoint(-69F, -82F, -48F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 212, 716, textureX, textureY); // Import Box1
		barrelModel[1] = new ModelRendererTurbo(this, 601, 729, textureX, textureY); // Import Box1
		barrelModel[2] = new ModelRendererTurbo(this, 225, 745, textureX, textureY); // Import Box1
		barrelModel[3] = new ModelRendererTurbo(this, 212, 716, textureX, textureY); // Import Box1
		barrelModel[4] = new ModelRendererTurbo(this, 601, 729, textureX, textureY); // Import Box1
		barrelModel[5] = new ModelRendererTurbo(this, 225, 745, textureX, textureY); // Import Box1

		barrelModel[0].addBox(51F, -4F, -6F, 79, 8, 12, 0F); // Import Box1
		barrelModel[0].setRotationPoint(16F, -61F, 3F);

		barrelModel[1].addShapeBox(51F, 4F, -6F, 79, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box1
		barrelModel[1].setRotationPoint(16F, -61F, 3F);

		barrelModel[2].addShapeBox(51F, -6F, -6F, 79, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		barrelModel[2].setRotationPoint(16F, -61F, 3F);

		barrelModel[3].addBox(-28F, -5F, -7F, 79, 10, 14, 0F); // Import Box1
		barrelModel[3].setRotationPoint(16F, -61F, 3F);

		barrelModel[4].addShapeBox(-28F, 5F, -7F, 79, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Import Box1
		barrelModel[4].setRotationPoint(16F, -61F, 3F);

		barrelModel[5].addShapeBox(-28F, -7F, -7F, 79, 2, 14, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		barrelModel[5].setRotationPoint(16F, -61F, 3F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // Import Box26
		leftTrackModel[1] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Import Box27
		leftTrackModel[2] = new ModelRendererTurbo(this, 857, 353, textureX, textureY); // Import Box28
		leftTrackModel[3] = new ModelRendererTurbo(this, 321, 393, textureX, textureY); // Import Box29
		leftTrackModel[4] = new ModelRendererTurbo(this, 409, 393, textureX, textureY); // Import Box30
		leftTrackModel[5] = new ModelRendererTurbo(this, 441, 393, textureX, textureY); // Import Box31
		leftTrackModel[6] = new ModelRendererTurbo(this, 1, 417, textureX, textureY); // Import Box32
		leftTrackModel[7] = new ModelRendererTurbo(this, 873, 377, textureX, textureY); // Import Box33
		leftTrackModel[8] = new ModelRendererTurbo(this, 937, 377, textureX, textureY); // Import Box34
		leftTrackModel[9] = new ModelRendererTurbo(this, 681, 409, textureX, textureY); // Import Box35
		leftTrackModel[10] = new ModelRendererTurbo(this, 49, 417, textureX, textureY); // Import Box36
		leftTrackModel[11] = new ModelRendererTurbo(this, 81, 417, textureX, textureY); // Import Box37
		leftTrackModel[12] = new ModelRendererTurbo(this, 129, 337, textureX, textureY); // Import Box38
		leftTrackModel[13] = new ModelRendererTurbo(this, 625, 369, textureX, textureY); // Import Box39
		leftTrackModel[14] = new ModelRendererTurbo(this, 417, 417, textureX, textureY); // Import Box40
		leftTrackModel[15] = new ModelRendererTurbo(this, 617, 433, textureX, textureY); // Import Box41
		leftTrackModel[16] = new ModelRendererTurbo(this, 521, 289, textureX, textureY); // Import Box42
		leftTrackModel[17] = new ModelRendererTurbo(this, 1009, 329, textureX, textureY); // Import Box43
		leftTrackModel[18] = new ModelRendererTurbo(this, 657, 433, textureX, textureY); // Import Box44
		leftTrackModel[19] = new ModelRendererTurbo(this, 1, 441, textureX, textureY); // Import Box45
		leftTrackModel[20] = new ModelRendererTurbo(this, 1009, 345, textureX, textureY); // Import Box46
		leftTrackModel[21] = new ModelRendererTurbo(this, 41, 441, textureX, textureY); // Import Box47
		leftTrackModel[22] = new ModelRendererTurbo(this, 377, 441, textureX, textureY); // Import Box48
		leftTrackModel[23] = new ModelRendererTurbo(this, 657, 353, textureX, textureY); // Import Box49
		leftTrackModel[24] = new ModelRendererTurbo(this, 417, 441, textureX, textureY); // Import Box50
		leftTrackModel[25] = new ModelRendererTurbo(this, 945, 353, textureX, textureY); // Import Box51
		leftTrackModel[26] = new ModelRendererTurbo(this, 73, 441, textureX, textureY); // Import Box52
		leftTrackModel[27] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Import Box53
		leftTrackModel[28] = new ModelRendererTurbo(this, 985, 361, textureX, textureY); // Import Box54
		leftTrackModel[29] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Import Box55
		leftTrackModel[30] = new ModelRendererTurbo(this, 41, 465, textureX, textureY); // Import Box56
		leftTrackModel[31] = new ModelRendererTurbo(this, 81, 465, textureX, textureY); // Import Box57
		leftTrackModel[32] = new ModelRendererTurbo(this, 377, 465, textureX, textureY); // Import Box58
		leftTrackModel[33] = new ModelRendererTurbo(this, 257, 393, textureX, textureY); // Import Box59
		leftTrackModel[34] = new ModelRendererTurbo(this, 257, 489, textureX, textureY); // Import Box60
		leftTrackModel[35] = new ModelRendererTurbo(this, 289, 569, textureX, textureY); // Import Box61
		leftTrackModel[36] = new ModelRendererTurbo(this, 433, 569, textureX, textureY); // Import Box62
		leftTrackModel[37] = new ModelRendererTurbo(this, 721, 473, textureX, textureY); // Import Box63
		leftTrackModel[38] = new ModelRendererTurbo(this, 617, 457, textureX, textureY); // Import Box64
		leftTrackModel[39] = new ModelRendererTurbo(this, 1, 489, textureX, textureY); // Import Box65
		leftTrackModel[40] = new ModelRendererTurbo(this, 401, 473, textureX, textureY); // Import Box66
		leftTrackModel[41] = new ModelRendererTurbo(this, 881, 353, textureX, textureY); // Import Box67
		leftTrackModel[42] = new ModelRendererTurbo(this, 353, 393, textureX, textureY); // Import Box68
		leftTrackModel[43] = new ModelRendererTurbo(this, 617, 393, textureX, textureY); // Import Box69
		leftTrackModel[44] = new ModelRendererTurbo(this, 905, 401, textureX, textureY); // Import Box70
		leftTrackModel[45] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Import Box71
		leftTrackModel[46] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Import Box72
		leftTrackModel[47] = new ModelRendererTurbo(this, 737, 489, textureX, textureY); // Import Box73
		leftTrackModel[48] = new ModelRendererTurbo(this, 441, 465, textureX, textureY); // Import Box74
		leftTrackModel[49] = new ModelRendererTurbo(this, 73, 489, textureX, textureY); // Import Box75
		leftTrackModel[50] = new ModelRendererTurbo(this, 761, 489, textureX, textureY); // Import Box76
		leftTrackModel[51] = new ModelRendererTurbo(this, 793, 489, textureX, textureY); // Import Box77
		leftTrackModel[52] = new ModelRendererTurbo(this, 761, 505, textureX, textureY); // Import Box78
		leftTrackModel[53] = new ModelRendererTurbo(this, 905, 505, textureX, textureY); // Import Box79
		leftTrackModel[54] = new ModelRendererTurbo(this, 1, 521, textureX, textureY); // Import Box80
		leftTrackModel[55] = new ModelRendererTurbo(this, 937, 505, textureX, textureY); // Import Box81
		leftTrackModel[56] = new ModelRendererTurbo(this, 969, 505, textureX, textureY); // Import Box82
		leftTrackModel[57] = new ModelRendererTurbo(this, 25, 521, textureX, textureY); // Import Box83
		leftTrackModel[58] = new ModelRendererTurbo(this, 49, 521, textureX, textureY); // Import Box84
		leftTrackModel[59] = new ModelRendererTurbo(this, 81, 521, textureX, textureY); // Import Box85
		leftTrackModel[60] = new ModelRendererTurbo(this, 49, 537, textureX, textureY); // Import Box86
		leftTrackModel[61] = new ModelRendererTurbo(this, 681, 521, textureX, textureY); // Import Box87
		leftTrackModel[62] = new ModelRendererTurbo(this, 633, 393, textureX, textureY); // Import Box88
		leftTrackModel[63] = new ModelRendererTurbo(this, 953, 537, textureX, textureY); // Import Box89
		leftTrackModel[64] = new ModelRendererTurbo(this, 73, 537, textureX, textureY); // Import Box90
		leftTrackModel[65] = new ModelRendererTurbo(this, 809, 409, textureX, textureY); // Import Box91
		leftTrackModel[66] = new ModelRendererTurbo(this, 1, 553, textureX, textureY); // Import Box92
		leftTrackModel[67] = new ModelRendererTurbo(this, 817, 537, textureX, textureY); // Import Box93
		leftTrackModel[68] = new ModelRendererTurbo(this, 993, 537, textureX, textureY); // Import Box94
		leftTrackModel[69] = new ModelRendererTurbo(this, 73, 561, textureX, textureY); // Import Box95
		leftTrackModel[70] = new ModelRendererTurbo(this, 953, 561, textureX, textureY); // Import Box96
		leftTrackModel[71] = new ModelRendererTurbo(this, 41, 569, textureX, textureY); // Import Box97
		leftTrackModel[72] = new ModelRendererTurbo(this, 561, 569, textureX, textureY); // Import Box98
		leftTrackModel[73] = new ModelRendererTurbo(this, 1009, 409, textureX, textureY); // Import Box99
		leftTrackModel[74] = new ModelRendererTurbo(this, 593, 569, textureX, textureY); // Import Box100
		leftTrackModel[75] = new ModelRendererTurbo(this, 633, 569, textureX, textureY); // Import Box101
		leftTrackModel[76] = new ModelRendererTurbo(this, 665, 569, textureX, textureY); // Import Box102
		leftTrackModel[77] = new ModelRendererTurbo(this, 705, 569, textureX, textureY); // Import Box103
		leftTrackModel[78] = new ModelRendererTurbo(this, 737, 569, textureX, textureY); // Import Box104
		leftTrackModel[79] = new ModelRendererTurbo(this, 761, 569, textureX, textureY); // Import Box105
		leftTrackModel[80] = new ModelRendererTurbo(this, 1001, 393, textureX, textureY); // Import Box106
		leftTrackModel[81] = new ModelRendererTurbo(this, 793, 569, textureX, textureY); // Import Box107
		leftTrackModel[82] = new ModelRendererTurbo(this, 977, 569, textureX, textureY); // Import Box108
		leftTrackModel[83] = new ModelRendererTurbo(this, 1, 577, textureX, textureY); // Import Box109
		leftTrackModel[84] = new ModelRendererTurbo(this, 65, 577, textureX, textureY); // Import Box110
		leftTrackModel[85] = new ModelRendererTurbo(this, 305, 585, textureX, textureY); // Import Box111
		leftTrackModel[86] = new ModelRendererTurbo(this, 337, 585, textureX, textureY); // Import Box112
		leftTrackModel[87] = new ModelRendererTurbo(this, 257, 417, textureX, textureY); // Import Box113
		leftTrackModel[88] = new ModelRendererTurbo(this, 369, 585, textureX, textureY); // Import Box114
		leftTrackModel[89] = new ModelRendererTurbo(this, 393, 417, textureX, textureY); // Import Box115
		leftTrackModel[90] = new ModelRendererTurbo(this, 417, 585, textureX, textureY); // Import Box116
		leftTrackModel[91] = new ModelRendererTurbo(this, 185, 593, textureX, textureY); // Import Box117
		leftTrackModel[92] = new ModelRendererTurbo(this, 553, 593, textureX, textureY); // Import Box118
		leftTrackModel[93] = new ModelRendererTurbo(this, 657, 593, textureX, textureY); // Import Box119
		leftTrackModel[94] = new ModelRendererTurbo(this, 753, 593, textureX, textureY); // Import Box120
		leftTrackModel[95] = new ModelRendererTurbo(this, 937, 585, textureX, textureY); // Import Box121
		leftTrackModel[96] = new ModelRendererTurbo(this, 625, 409, textureX, textureY); // Import Box122
		leftTrackModel[97] = new ModelRendererTurbo(this, 449, 417, textureX, textureY); // Import Box123
		leftTrackModel[98] = new ModelRendererTurbo(this, 1001, 505, textureX, textureY); // Import Box124
		leftTrackModel[99] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Import Box125
		leftTrackModel[100] = new ModelRendererTurbo(this, 929, 225, textureX, textureY); // Import Box126
		leftTrackModel[101] = new ModelRendererTurbo(this, 185, 521, textureX, textureY); // Import Box127
		leftTrackModel[102] = new ModelRendererTurbo(this, 457, 433, textureX, textureY); // Import Box128
		leftTrackModel[103] = new ModelRendererTurbo(this, 457, 481, textureX, textureY); // Import Box129
		leftTrackModel[104] = new ModelRendererTurbo(this, 401, 601, textureX, textureY); // Import Box130
		leftTrackModel[105] = new ModelRendererTurbo(this, 1, 601, textureX, textureY); // Import Box131
		leftTrackModel[106] = new ModelRendererTurbo(this, 185, 545, textureX, textureY); // Import Box132
		leftTrackModel[107] = new ModelRendererTurbo(this, 49, 601, textureX, textureY); // Import Box133
		leftTrackModel[108] = new ModelRendererTurbo(this, 993, 593, textureX, textureY); // Import Box134
		leftTrackModel[109] = new ModelRendererTurbo(this, 817, 601, textureX, textureY); // Import Box135
		leftTrackModel[110] = new ModelRendererTurbo(this, 905, 433, textureX, textureY); // Import Box136
		leftTrackModel[111] = new ModelRendererTurbo(this, 1009, 433, textureX, textureY); // Import Box137
		leftTrackModel[112] = new ModelRendererTurbo(this, 857, 601, textureX, textureY); // Import Box138
		leftTrackModel[113] = new ModelRendererTurbo(this, 897, 601, textureX, textureY); // Import Box139
		leftTrackModel[114] = new ModelRendererTurbo(this, 185, 609, textureX, textureY); // Import Box140
		leftTrackModel[115] = new ModelRendererTurbo(this, 257, 441, textureX, textureY); // Import Box141
		leftTrackModel[116] = new ModelRendererTurbo(this, 361, 441, textureX, textureY); // Import Box142
		leftTrackModel[117] = new ModelRendererTurbo(this, 905, 457, textureX, textureY); // Import Box143
		leftTrackModel[118] = new ModelRendererTurbo(this, 289, 617, textureX, textureY); // Import Box144
		leftTrackModel[119] = new ModelRendererTurbo(this, 785, 625, textureX, textureY); // Import Box145
		leftTrackModel[120] = new ModelRendererTurbo(this, 921, 609, textureX, textureY); // Import Box146
		leftTrackModel[121] = new ModelRendererTurbo(this, 921, 633, textureX, textureY); // Import Box147
		leftTrackModel[122] = new ModelRendererTurbo(this, 273, 641, textureX, textureY); // Import Box148
		leftTrackModel[123] = new ModelRendererTurbo(this, 361, 641, textureX, textureY); // Import Box149
		leftTrackModel[124] = new ModelRendererTurbo(this, 1, 665, textureX, textureY); // Import Box150
		leftTrackModel[125] = new ModelRendererTurbo(this, 449, 641, textureX, textureY); // Import Box151
		leftTrackModel[126] = new ModelRendererTurbo(this, 537, 641, textureX, textureY); // Import Box152
		leftTrackModel[127] = new ModelRendererTurbo(this, 625, 641, textureX, textureY); // Import Box153
		leftTrackModel[128] = new ModelRendererTurbo(this, 689, 649, textureX, textureY); // Import Box154
		leftTrackModel[129] = new ModelRendererTurbo(this, 225, 609, textureX, textureY); // Import Box155
		leftTrackModel[130] = new ModelRendererTurbo(this, 849, 649, textureX, textureY); // Import Box156
		leftTrackModel[131] = new ModelRendererTurbo(this, 257, 609, textureX, textureY); // Import Box157
		leftTrackModel[132] = new ModelRendererTurbo(this, 785, 609, textureX, textureY); // Import Box158
		leftTrackModel[133] = new ModelRendererTurbo(this, 873, 649, textureX, textureY); // Import Box159
		leftTrackModel[134] = new ModelRendererTurbo(this, 281, 617, textureX, textureY); // Import Box160
		leftTrackModel[135] = new ModelRendererTurbo(this, 993, 617, textureX, textureY); // Import Box161
		leftTrackModel[136] = new ModelRendererTurbo(this, 897, 649, textureX, textureY); // Import Box162
		leftTrackModel[137] = new ModelRendererTurbo(this, 985, 633, textureX, textureY); // Import Box163
		leftTrackModel[138] = new ModelRendererTurbo(this, 905, 665, textureX, textureY); // Import Box165
		leftTrackModel[139] = new ModelRendererTurbo(this, 633, 673, textureX, textureY); // Import Box167
		leftTrackModel[140] = new ModelRendererTurbo(this, 737, 681, textureX, textureY); // Import Box168
		leftTrackModel[141] = new ModelRendererTurbo(this, 1, 689, textureX, textureY); // Import Box169
		leftTrackModel[142] = new ModelRendererTurbo(this, 121, 689, textureX, textureY); // Import Box170
		leftTrackModel[143] = new ModelRendererTurbo(this, 241, 689, textureX, textureY); // Import Box171
		leftTrackModel[144] = new ModelRendererTurbo(this, 361, 689, textureX, textureY); // Import Box172
		leftTrackModel[145] = new ModelRendererTurbo(this, 481, 689, textureX, textureY); // Import Box173
		leftTrackModel[146] = new ModelRendererTurbo(this, 601, 697, textureX, textureY); // Import Box174
		leftTrackModel[147] = new ModelRendererTurbo(this, 705, 705, textureX, textureY); // Import Box175

		leftTrackModel[0].addBox(0F, 0F, 0F, 15, 12, 5, 0F); // Import Box26
		leftTrackModel[0].setRotationPoint(-127F, 5F, 60F);

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box27
		leftTrackModel[1].setRotationPoint(-132F, 5F, 60F);

		leftTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box28
		leftTrackModel[2].setRotationPoint(-112F, 5F, 60F);

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 11, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box29
		leftTrackModel[3].setRotationPoint(-145F, 10F, 65F);

		leftTrackModel[4].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box30
		leftTrackModel[4].setRotationPoint(-154F, 10F, 65F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box31
		leftTrackModel[5].setRotationPoint(-136F, 6F, 65F);

		leftTrackModel[6].addBox(0F, 0F, 0F, 15, 12, 5, 0F); // Import Box32
		leftTrackModel[6].setRotationPoint(-127F, 5F, 70F);

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box33
		leftTrackModel[7].setRotationPoint(-132F, 5F, 70F);

		leftTrackModel[8].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box34
		leftTrackModel[8].setRotationPoint(-112F, 5F, 70F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box35
		leftTrackModel[9].setRotationPoint(-112F, 6F, 65F);

		leftTrackModel[10].addShapeBox(0F, 0F, 0F, 9, 11, 5, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box36
		leftTrackModel[10].setRotationPoint(-103F, 10F, 65F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box37
		leftTrackModel[11].setRotationPoint(-94F, 10F, 65F);

		leftTrackModel[12].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Import Box38
		leftTrackModel[12].setRotationPoint(-89F, 6F, 66F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Import Box39
		leftTrackModel[13].setRotationPoint(-157F, 6F, 66F);

		leftTrackModel[14].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box40
		leftTrackModel[14].setRotationPoint(-154F, 16F, 60F);

		leftTrackModel[15].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		leftTrackModel[15].setRotationPoint(-145F, 16F, 60F);

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box42
		leftTrackModel[16].setRotationPoint(-131F, 24F, 60F);

		leftTrackModel[17].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box43
		leftTrackModel[17].setRotationPoint(-170F, 24F, 60F);

		leftTrackModel[18].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		leftTrackModel[18].setRotationPoint(-168F, 16F, 60F);

		leftTrackModel[19].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		leftTrackModel[19].setRotationPoint(-108F, 16F, 60F);

		leftTrackModel[20].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box46
		leftTrackModel[20].setRotationPoint(-110F, 24F, 60F);

		leftTrackModel[21].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box47
		leftTrackModel[21].setRotationPoint(-94F, 16F, 60F);

		leftTrackModel[22].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		leftTrackModel[22].setRotationPoint(-85F, 16F, 60F);

		leftTrackModel[23].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box49
		leftTrackModel[23].setRotationPoint(-71F, 24F, 60F);

		leftTrackModel[24].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		leftTrackModel[24].setRotationPoint(-108F, 16F, 70F);

		leftTrackModel[25].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box51
		leftTrackModel[25].setRotationPoint(-110F, 24F, 70F);

		leftTrackModel[26].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box52
		leftTrackModel[26].setRotationPoint(-94F, 16F, 70F);

		leftTrackModel[27].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		leftTrackModel[27].setRotationPoint(-85F, 16F, 70F);

		leftTrackModel[28].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box54
		leftTrackModel[28].setRotationPoint(-71F, 24F, 70F);

		leftTrackModel[29].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box55
		leftTrackModel[29].setRotationPoint(-131F, 24F, 70F);

		leftTrackModel[30].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		leftTrackModel[30].setRotationPoint(-145F, 16F, 70F);

		leftTrackModel[31].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box57
		leftTrackModel[31].setRotationPoint(-154F, 16F, 70F);

		leftTrackModel[32].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		leftTrackModel[32].setRotationPoint(-168F, 16F, 70F);

		leftTrackModel[33].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box59
		leftTrackModel[33].setRotationPoint(-170F, 24F, 70F);

		leftTrackModel[34].addBox(0F, 0F, 0F, 64, 1, 9, 0F); // Import Box60
		leftTrackModel[34].setRotationPoint(-152F, 3F, 63F);

		leftTrackModel[35].addBox(0F, 0F, 0F, 60, 1, 9, 0F); // Import Box61
		leftTrackModel[35].setRotationPoint(-150F, 1F, 63F);

		leftTrackModel[36].addBox(0F, 0F, 0F, 51, 1, 9, 0F); // Import Box62
		leftTrackModel[36].setRotationPoint(-145F, -1F, 63F);

		leftTrackModel[37].addBox(0F, 0F, 0F, 40, 1, 9, 0F); // Import Box63
		leftTrackModel[37].setRotationPoint(-140F, -3F, 63F);

		leftTrackModel[38].addBox(0F, 0F, 0F, 32, 1, 9, 0F); // Import Box64
		leftTrackModel[38].setRotationPoint(-136F, -5F, 63F);

		leftTrackModel[39].addBox(0F, 0F, 0F, 24, 1, 9, 0F); // Import Box65
		leftTrackModel[39].setRotationPoint(-132F, -7F, 63F);

		leftTrackModel[40].addBox(0F, 0F, 0F, 12, 2, 15, 0F); // Import Box66
		leftTrackModel[40].setRotationPoint(-126F, -9F, 60F);

		leftTrackModel[41].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box67
		leftTrackModel[41].setRotationPoint(-125F, -10F, 61F);

		leftTrackModel[42].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box68
		leftTrackModel[42].setRotationPoint(-117F, -10F, 61F);

		leftTrackModel[43].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box69
		leftTrackModel[43].setRotationPoint(-117F, -10F, 72F);

		leftTrackModel[44].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box70
		leftTrackModel[44].setRotationPoint(-125F, -10F, 72F);

		leftTrackModel[45].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Import Box71
		leftTrackModel[45].setRotationPoint(-90F, 2F, 66F);

		leftTrackModel[46].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Import Box72
		leftTrackModel[46].setRotationPoint(-153F, 2F, 66F);

		leftTrackModel[47].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box73
		leftTrackModel[47].setRotationPoint(-72F, 30F, 65F);

		leftTrackModel[48].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box74
		leftTrackModel[48].setRotationPoint(-72F, 30F, 65F);

		leftTrackModel[49].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box75
		leftTrackModel[49].setRotationPoint(-72F, 30F, 65F);

		leftTrackModel[50].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box76
		leftTrackModel[50].setRotationPoint(-107F, 30F, 65F);

		leftTrackModel[51].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box77
		leftTrackModel[51].setRotationPoint(-107F, 30F, 65F);

		leftTrackModel[52].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box78
		leftTrackModel[52].setRotationPoint(-107F, 30F, 65F);

		leftTrackModel[53].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box79
		leftTrackModel[53].setRotationPoint(-132F, 30F, 65F);

		leftTrackModel[54].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box80
		leftTrackModel[54].setRotationPoint(-132F, 30F, 65F);

		leftTrackModel[55].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box81
		leftTrackModel[55].setRotationPoint(-132F, 30F, 65F);

		leftTrackModel[56].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box82
		leftTrackModel[56].setRotationPoint(-167F, 30F, 65F);

		leftTrackModel[57].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box83
		leftTrackModel[57].setRotationPoint(-167F, 30F, 65F);

		leftTrackModel[58].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box84
		leftTrackModel[58].setRotationPoint(-167F, 30F, 65F);

		leftTrackModel[59].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box85
		leftTrackModel[59].setRotationPoint(54F, 30F, 65F);

		leftTrackModel[60].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box86
		leftTrackModel[60].setRotationPoint(54F, 30F, 65F);

		leftTrackModel[61].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box87
		leftTrackModel[61].setRotationPoint(54F, 30F, 65F);

		leftTrackModel[62].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box88
		leftTrackModel[62].setRotationPoint(55F, 24F, 60F);

		leftTrackModel[63].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		leftTrackModel[63].setRotationPoint(41F, 16F, 60F);

		leftTrackModel[64].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box90
		leftTrackModel[64].setRotationPoint(32F, 16F, 60F);

		leftTrackModel[65].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box91
		leftTrackModel[65].setRotationPoint(16F, 24F, 60F);

		leftTrackModel[66].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		leftTrackModel[66].setRotationPoint(18F, 16F, 60F);

		leftTrackModel[67].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box93
		leftTrackModel[67].setRotationPoint(19F, 30F, 65F);

		leftTrackModel[68].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box94
		leftTrackModel[68].setRotationPoint(19F, 30F, 65F);

		leftTrackModel[69].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box95
		leftTrackModel[69].setRotationPoint(19F, 30F, 65F);

		leftTrackModel[70].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box96
		leftTrackModel[70].setRotationPoint(-6F, 30F, 65F);

		leftTrackModel[71].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box97
		leftTrackModel[71].setRotationPoint(-6F, 30F, 65F);

		leftTrackModel[72].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box98
		leftTrackModel[72].setRotationPoint(-6F, 30F, 65F);

		leftTrackModel[73].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box99
		leftTrackModel[73].setRotationPoint(-5F, 24F, 60F);

		leftTrackModel[74].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		leftTrackModel[74].setRotationPoint(-19F, 16F, 60F);

		leftTrackModel[75].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box101
		leftTrackModel[75].setRotationPoint(-28F, 16F, 60F);

		leftTrackModel[76].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		leftTrackModel[76].setRotationPoint(-42F, 16F, 60F);

		leftTrackModel[77].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box103
		leftTrackModel[77].setRotationPoint(-41F, 30F, 65F);

		leftTrackModel[78].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box104
		leftTrackModel[78].setRotationPoint(-41F, 30F, 65F);

		leftTrackModel[79].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box105
		leftTrackModel[79].setRotationPoint(-41F, 30F, 65F);

		leftTrackModel[80].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Import Box106
		leftTrackModel[80].setRotationPoint(-31F, 6F, 66F);

		leftTrackModel[81].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box107
		leftTrackModel[81].setRotationPoint(-28F, 10F, 65F);

		leftTrackModel[82].addShapeBox(0F, 0F, 0F, 9, 11, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box108
		leftTrackModel[82].setRotationPoint(-19F, 10F, 65F);

		leftTrackModel[83].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box109
		leftTrackModel[83].setRotationPoint(-10F, 6F, 65F);

		leftTrackModel[84].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box110
		leftTrackModel[84].setRotationPoint(14F, 6F, 65F);

		leftTrackModel[85].addShapeBox(0F, 0F, 0F, 9, 11, 5, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box111
		leftTrackModel[85].setRotationPoint(23F, 10F, 65F);

		leftTrackModel[86].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box112
		leftTrackModel[86].setRotationPoint(32F, 10F, 65F);

		leftTrackModel[87].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box113
		leftTrackModel[87].setRotationPoint(14F, 5F, 60F);

		leftTrackModel[88].addBox(0F, 0F, 0F, 15, 12, 5, 0F); // Import Box114
		leftTrackModel[88].setRotationPoint(-1F, 5F, 60F);

		leftTrackModel[89].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box115
		leftTrackModel[89].setRotationPoint(-6F, 5F, 60F);

		leftTrackModel[90].addBox(0F, 0F, 0F, 60, 1, 9, 0F); // Import Box116
		leftTrackModel[90].setRotationPoint(-24F, 1F, 63F);

		leftTrackModel[91].addBox(0F, 0F, 0F, 51, 1, 9, 0F); // Import Box117
		leftTrackModel[91].setRotationPoint(-19F, -1F, 63F);

		leftTrackModel[92].addBox(0F, 0F, 0F, 40, 1, 9, 0F); // Import Box118
		leftTrackModel[92].setRotationPoint(-14F, -3F, 63F);

		leftTrackModel[93].addBox(0F, 0F, 0F, 32, 1, 9, 0F); // Import Box119
		leftTrackModel[93].setRotationPoint(-10F, -5F, 63F);

		leftTrackModel[94].addBox(0F, 0F, 0F, 24, 1, 9, 0F); // Import Box120
		leftTrackModel[94].setRotationPoint(-6F, -7F, 63F);

		leftTrackModel[95].addBox(0F, 0F, 0F, 12, 2, 15, 0F); // Import Box121
		leftTrackModel[95].setRotationPoint(0F, -9F, 60F);

		leftTrackModel[96].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box122
		leftTrackModel[96].setRotationPoint(1F, -10F, 61F);

		leftTrackModel[97].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box123
		leftTrackModel[97].setRotationPoint(9F, -10F, 61F);

		leftTrackModel[98].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Import Box124
		leftTrackModel[98].setRotationPoint(37F, 6F, 66F);

		leftTrackModel[99].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Import Box125
		leftTrackModel[99].setRotationPoint(36F, 2F, 66F);

		leftTrackModel[100].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Import Box126
		leftTrackModel[100].setRotationPoint(-27F, 2F, 66F);

		leftTrackModel[101].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box127
		leftTrackModel[101].setRotationPoint(-6F, 5F, 70F);

		leftTrackModel[102].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box128
		leftTrackModel[102].setRotationPoint(1F, -10F, 72F);

		leftTrackModel[103].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box129
		leftTrackModel[103].setRotationPoint(9F, -10F, 72F);

		leftTrackModel[104].addBox(0F, 0F, 0F, 64, 1, 9, 0F); // Import Box130
		leftTrackModel[104].setRotationPoint(-26F, 3F, 63F);

		leftTrackModel[105].addBox(0F, 0F, 0F, 15, 12, 5, 0F); // Import Box131
		leftTrackModel[105].setRotationPoint(-1F, 5F, 70F);

		leftTrackModel[106].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box132
		leftTrackModel[106].setRotationPoint(14F, 5F, 70F);

		leftTrackModel[107].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		leftTrackModel[107].setRotationPoint(41F, 16F, 70F);

		leftTrackModel[108].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box134
		leftTrackModel[108].setRotationPoint(32F, 16F, 70F);

		leftTrackModel[109].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		leftTrackModel[109].setRotationPoint(18F, 16F, 70F);

		leftTrackModel[110].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box136
		leftTrackModel[110].setRotationPoint(16F, 24F, 70F);

		leftTrackModel[111].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box137
		leftTrackModel[111].setRotationPoint(-5F, 24F, 70F);

		leftTrackModel[112].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		leftTrackModel[112].setRotationPoint(-19F, 16F, 70F);

		leftTrackModel[113].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box139
		leftTrackModel[113].setRotationPoint(-28F, 16F, 70F);

		leftTrackModel[114].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		leftTrackModel[114].setRotationPoint(-42F, 16F, 70F);

		leftTrackModel[115].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box141
		leftTrackModel[115].setRotationPoint(-44F, 24F, 70F);

		leftTrackModel[116].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box142
		leftTrackModel[116].setRotationPoint(55F, 24F, 70F);

		leftTrackModel[117].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box143
		leftTrackModel[117].setRotationPoint(-44F, 24F, 60F);

		leftTrackModel[118].addBox(0F, 0F, 0F, 234, 2, 21, 0F); // Import Box144
		leftTrackModel[118].setRotationPoint(-175F, 42F, 57F);

		leftTrackModel[119].addBox(0F, 0F, 0F, 57, 2, 21, 0F); // Import Box145
		leftTrackModel[119].setRotationPoint(58F, 42F, 57F);
		leftTrackModel[119].rotateAngleZ = 0.40142573F;

		leftTrackModel[120].addBox(0F, 0F, 0F, 22, 2, 21, 0F); // Import Box146
		leftTrackModel[120].setRotationPoint(111F, 21F, 57F);
		leftTrackModel[120].rotateAngleZ = 1.06465084F;

		leftTrackModel[121].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box147
		leftTrackModel[121].setRotationPoint(121F, 3F, 57F);
		leftTrackModel[121].rotateAngleZ = 1.85004901F;

		leftTrackModel[122].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box148
		leftTrackModel[122].setRotationPoint(116F, -15F, 57F);
		leftTrackModel[122].rotateAngleZ = 2.58308729F;

		leftTrackModel[123].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box149
		leftTrackModel[123].setRotationPoint(100F, -25F, 57F);
		leftTrackModel[123].rotateAngleZ = 3.0368729F;

		leftTrackModel[124].addBox(0F, 0F, 0F, 302, 2, 21, 0F); // Import Box150
		leftTrackModel[124].setRotationPoint(80F, -27F, 57F);
		leftTrackModel[124].rotateAngleZ = 3.15904595F;

		leftTrackModel[125].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box151
		leftTrackModel[125].setRotationPoint(-240F, 10F, 57F);
		leftTrackModel[125].rotateAngleZ = -0.76794487F;

		leftTrackModel[126].addBox(0F, 0F, 0F, 21, 2, 21, 0F); // Import Box152
		leftTrackModel[126].setRotationPoint(-237F, -9F, 57F);
		leftTrackModel[126].rotateAngleZ = -1.72787596F;

		leftTrackModel[127].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box153
		leftTrackModel[127].setRotationPoint(-239F, -10F, 57F);
		leftTrackModel[127].rotateAngleZ = -5.70722665F;

		leftTrackModel[128].addBox(0F, 0F, 0F, 56, 2, 21, 0F); // Import Box154
		leftTrackModel[128].setRotationPoint(-227F, 23F, 57F);
		leftTrackModel[128].rotateAngleZ = -0.34906585F;

		leftTrackModel[129].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box155
		leftTrackModel[129].setRotationPoint(43F, -16F, 65F);

		leftTrackModel[130].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box156
		leftTrackModel[130].setRotationPoint(43F, -16F, 65F);

		leftTrackModel[131].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box157
		leftTrackModel[131].setRotationPoint(43F, -16F, 65F);

		leftTrackModel[132].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box158
		leftTrackModel[132].setRotationPoint(-56F, -14F, 65F);

		leftTrackModel[133].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box159
		leftTrackModel[133].setRotationPoint(-56F, -14F, 65F);

		leftTrackModel[134].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box160
		leftTrackModel[134].setRotationPoint(-56F, -14F, 65F);

		leftTrackModel[135].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box161
		leftTrackModel[135].setRotationPoint(-159F, -11F, 65F);

		leftTrackModel[136].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box162
		leftTrackModel[136].setRotationPoint(-159F, -11F, 65F);

		leftTrackModel[137].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box163
		leftTrackModel[137].setRotationPoint(-159F, -11F, 65F);

		leftTrackModel[138].addBox(-21F, -20F, 0F, 40, 40, 17, 0F); // Import Box165
		leftTrackModel[138].setRotationPoint(92F, 0F, 57F);

		leftTrackModel[139].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		leftTrackModel[139].setRotationPoint(92F, 0F, 57F);

		leftTrackModel[140].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		leftTrackModel[140].setRotationPoint(91F, -1F, 57F);
		leftTrackModel[140].rotateAngleZ = 1.57079633F;

		leftTrackModel[141].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		leftTrackModel[141].setRotationPoint(91F, 1F, 57F);
		leftTrackModel[141].rotateAngleZ = 4.71238898F;

		leftTrackModel[142].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		leftTrackModel[142].setRotationPoint(90F, 0F, 57F);
		leftTrackModel[142].rotateAngleZ = 3.14159265F;

		leftTrackModel[143].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		leftTrackModel[143].setRotationPoint(-206F, 5F, 57F);
		leftTrackModel[143].rotateAngleZ = 4.71238898F;

		leftTrackModel[144].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		leftTrackModel[144].setRotationPoint(-207F, 4F, 57F);
		leftTrackModel[144].rotateAngleZ = 3.14159265F;

		leftTrackModel[145].addBox(-21F, -20F, 0F, 40, 40, 17, 0F); // Import Box173
		leftTrackModel[145].setRotationPoint(-205F, 4F, 57F);

		leftTrackModel[146].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		leftTrackModel[146].setRotationPoint(-205F, 4F, 57F);

		leftTrackModel[147].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		leftTrackModel[147].setRotationPoint(-206F, 3F, 57F);
		leftTrackModel[147].rotateAngleZ = 1.57079633F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box26
		rightTrackModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box27
		rightTrackModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box28
		rightTrackModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box29
		rightTrackModel[4] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Import Box30
		rightTrackModel[5] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Import Box31
		rightTrackModel[6] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Import Box32
		rightTrackModel[7] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box33
		rightTrackModel[8] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Import Box34
		rightTrackModel[9] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Import Box35
		rightTrackModel[10] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import Box36
		rightTrackModel[11] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Import Box37
		rightTrackModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box38
		rightTrackModel[13] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import Box39
		rightTrackModel[14] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import Box40
		rightTrackModel[15] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Import Box41
		rightTrackModel[16] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box42
		rightTrackModel[17] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box43
		rightTrackModel[18] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Import Box44
		rightTrackModel[19] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Import Box45
		rightTrackModel[20] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Import Box46
		rightTrackModel[21] = new ModelRendererTurbo(this, 913, 81, textureX, textureY); // Import Box47
		rightTrackModel[22] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Import Box48
		rightTrackModel[23] = new ModelRendererTurbo(this, 913, 41, textureX, textureY); // Import Box49
		rightTrackModel[24] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Import Box50
		rightTrackModel[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box51
		rightTrackModel[26] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import Box52
		rightTrackModel[27] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Import Box53
		rightTrackModel[28] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import Box54
		rightTrackModel[29] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box55
		rightTrackModel[30] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Import Box56
		rightTrackModel[31] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Import Box57
		rightTrackModel[32] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Import Box58
		rightTrackModel[33] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import Box59
		rightTrackModel[34] = new ModelRendererTurbo(this, 817, 209, textureX, textureY); // Import Box60
		rightTrackModel[35] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); // Import Box61
		rightTrackModel[36] = new ModelRendererTurbo(this, 817, 225, textureX, textureY); // Import Box62
		rightTrackModel[37] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Import Box63
		rightTrackModel[38] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Import Box64
		rightTrackModel[39] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Import Box65
		rightTrackModel[40] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Import Box66
		rightTrackModel[41] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box67
		rightTrackModel[42] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Import Box68
		rightTrackModel[43] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Import Box69
		rightTrackModel[44] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import Box70
		rightTrackModel[45] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box71
		rightTrackModel[46] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import Box72
		rightTrackModel[47] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Import Box73
		rightTrackModel[48] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Import Box74
		rightTrackModel[49] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Import Box75
		rightTrackModel[50] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Import Box76
		rightTrackModel[51] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Import Box77
		rightTrackModel[52] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Import Box78
		rightTrackModel[53] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Import Box79
		rightTrackModel[54] = new ModelRendererTurbo(this, 969, 209, textureX, textureY); // Import Box80
		rightTrackModel[55] = new ModelRendererTurbo(this, 993, 209, textureX, textureY); // Import Box81
		rightTrackModel[56] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import Box82
		rightTrackModel[57] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Import Box83
		rightTrackModel[58] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Import Box84
		rightTrackModel[59] = new ModelRendererTurbo(this, 657, 217, textureX, textureY); // Import Box85
		rightTrackModel[60] = new ModelRendererTurbo(this, 689, 217, textureX, textureY); // Import Box86
		rightTrackModel[61] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Import Box87
		rightTrackModel[62] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Import Box88
		rightTrackModel[63] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Import Box89
		rightTrackModel[64] = new ModelRendererTurbo(this, 993, 225, textureX, textureY); // Import Box90
		rightTrackModel[65] = new ModelRendererTurbo(this, 513, 161, textureX, textureY); // Import Box91
		rightTrackModel[66] = new ModelRendererTurbo(this, 513, 233, textureX, textureY); // Import Box92
		rightTrackModel[67] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box93
		rightTrackModel[68] = new ModelRendererTurbo(this, 945, 225, textureX, textureY); // Import Box94
		rightTrackModel[69] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Import Box95
		rightTrackModel[70] = new ModelRendererTurbo(this, 553, 233, textureX, textureY); // Import Box96
		rightTrackModel[71] = new ModelRendererTurbo(this, 585, 233, textureX, textureY); // Import Box97
		rightTrackModel[72] = new ModelRendererTurbo(this, 609, 233, textureX, textureY); // Import Box98
		rightTrackModel[73] = new ModelRendererTurbo(this, 713, 161, textureX, textureY); // Import Box99
		rightTrackModel[74] = new ModelRendererTurbo(this, 641, 233, textureX, textureY); // Import Box100
		rightTrackModel[75] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Import Box101
		rightTrackModel[76] = new ModelRendererTurbo(this, 817, 241, textureX, textureY); // Import Box102
		rightTrackModel[77] = new ModelRendererTurbo(this, 857, 241, textureX, textureY); // Import Box103
		rightTrackModel[78] = new ModelRendererTurbo(this, 889, 241, textureX, textureY); // Import Box104
		rightTrackModel[79] = new ModelRendererTurbo(this, 913, 241, textureX, textureY); // Import Box105
		rightTrackModel[80] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Import Box106
		rightTrackModel[81] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import Box107
		rightTrackModel[82] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Import Box108
		rightTrackModel[83] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Import Box109
		rightTrackModel[84] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Import Box110
		rightTrackModel[85] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Import Box111
		rightTrackModel[86] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Import Box112
		rightTrackModel[87] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Import Box113
		rightTrackModel[88] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Import Box114
		rightTrackModel[89] = new ModelRendererTurbo(this, 713, 217, textureX, textureY); // Import Box115
		rightTrackModel[90] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Import Box116
		rightTrackModel[91] = new ModelRendererTurbo(this, 601, 257, textureX, textureY); // Import Box117
		rightTrackModel[92] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Import Box118
		rightTrackModel[93] = new ModelRendererTurbo(this, 921, 273, textureX, textureY); // Import Box119
		rightTrackModel[94] = new ModelRendererTurbo(this, 513, 257, textureX, textureY); // Import Box120
		rightTrackModel[95] = new ModelRendererTurbo(this, 481, 289, textureX, textureY); // Import Box121
		rightTrackModel[96] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Import Box122
		rightTrackModel[97] = new ModelRendererTurbo(this, 1009, 185, textureX, textureY); // Import Box123
		rightTrackModel[98] = new ModelRendererTurbo(this, 713, 241, textureX, textureY); // Import Box124
		rightTrackModel[99] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Import Box125
		rightTrackModel[100] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Import Box126
		rightTrackModel[101] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Import Box127
		rightTrackModel[102] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Import Box128
		rightTrackModel[103] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Import Box129
		rightTrackModel[104] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import Box130
		rightTrackModel[105] = new ModelRendererTurbo(this, 537, 289, textureX, textureY); // Import Box131
		rightTrackModel[106] = new ModelRendererTurbo(this, 1001, 281, textureX, textureY); // Import Box132
		rightTrackModel[107] = new ModelRendererTurbo(this, 585, 289, textureX, textureY); // Import Box133
		rightTrackModel[108] = new ModelRendererTurbo(this, 921, 289, textureX, textureY); // Import Box134
		rightTrackModel[109] = new ModelRendererTurbo(this, 953, 289, textureX, textureY); // Import Box135
		rightTrackModel[110] = new ModelRendererTurbo(this, 969, 241, textureX, textureY); // Import Box136
		rightTrackModel[111] = new ModelRendererTurbo(this, 1009, 249, textureX, textureY); // Import Box137
		rightTrackModel[112] = new ModelRendererTurbo(this, 945, 313, textureX, textureY); // Import Box138
		rightTrackModel[113] = new ModelRendererTurbo(this, 993, 305, textureX, textureY); // Import Box139
		rightTrackModel[114] = new ModelRendererTurbo(this, 153, 321, textureX, textureY); // Import Box140
		rightTrackModel[115] = new ModelRendererTurbo(this, 857, 257, textureX, textureY); // Import Box141
		rightTrackModel[116] = new ModelRendererTurbo(this, 873, 257, textureX, textureY); // Import Box142
		rightTrackModel[117] = new ModelRendererTurbo(this, 1009, 265, textureX, textureY); // Import Box143
		rightTrackModel[118] = new ModelRendererTurbo(this, 185, 521, textureX, textureY); // Import Box144
		rightTrackModel[119] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Import Box145
		rightTrackModel[120] = new ModelRendererTurbo(this, 873, 353, textureX, textureY); // Import Box146
		rightTrackModel[121] = new ModelRendererTurbo(this, 873, 377, textureX, textureY); // Import Box147
		rightTrackModel[122] = new ModelRendererTurbo(this, 937, 385, textureX, textureY); // Import Box148
		rightTrackModel[123] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Import Box149
		rightTrackModel[124] = new ModelRendererTurbo(this, 185, 545, textureX, textureY); // Import Box150
		rightTrackModel[125] = new ModelRendererTurbo(this, 257, 393, textureX, textureY); // Import Box151
		rightTrackModel[126] = new ModelRendererTurbo(this, 345, 393, textureX, textureY); // Import Box152
		rightTrackModel[127] = new ModelRendererTurbo(this, 617, 409, textureX, textureY); // Import Box153
		rightTrackModel[128] = new ModelRendererTurbo(this, 257, 417, textureX, textureY); // Import Box154
		rightTrackModel[129] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Import Box155
		rightTrackModel[130] = new ModelRendererTurbo(this, 985, 329, textureX, textureY); // Import Box156
		rightTrackModel[131] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Import Box157
		rightTrackModel[132] = new ModelRendererTurbo(this, 33, 337, textureX, textureY); // Import Box158
		rightTrackModel[133] = new ModelRendererTurbo(this, 961, 353, textureX, textureY); // Import Box159
		rightTrackModel[134] = new ModelRendererTurbo(this, 65, 337, textureX, textureY); // Import Box160
		rightTrackModel[135] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Import Box161
		rightTrackModel[136] = new ModelRendererTurbo(this, 1001, 361, textureX, textureY); // Import Box162
		rightTrackModel[137] = new ModelRendererTurbo(this, 625, 353, textureX, textureY); // Import Box163
		rightTrackModel[138] = new ModelRendererTurbo(this, 705, 409, textureX, textureY); // Import Box165
		rightTrackModel[139] = new ModelRendererTurbo(this, 905, 409, textureX, textureY); // Import Box167
		rightTrackModel[140] = new ModelRendererTurbo(this, 905, 433, textureX, textureY); // Import Box168
		rightTrackModel[141] = new ModelRendererTurbo(this, 257, 441, textureX, textureY); // Import Box169
		rightTrackModel[142] = new ModelRendererTurbo(this, 905, 457, textureX, textureY); // Import Box170
		rightTrackModel[143] = new ModelRendererTurbo(this, 257, 465, textureX, textureY); // Import Box171
		rightTrackModel[144] = new ModelRendererTurbo(this, 617, 473, textureX, textureY); // Import Box172
		rightTrackModel[145] = new ModelRendererTurbo(this, 833, 537, textureX, textureY); // Import Box173
		rightTrackModel[146] = new ModelRendererTurbo(this, 905, 481, textureX, textureY); // Import Box174
		rightTrackModel[147] = new ModelRendererTurbo(this, 185, 569, textureX, textureY); // Import Box175

		rightTrackModel[0].addBox(0F, 0F, 0F, 15, 12, 5, 0F); // Import Box26
		rightTrackModel[0].setRotationPoint(-127F, 5F, -75F);

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box27
		rightTrackModel[1].setRotationPoint(-132F, 5F, -75F);

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box28
		rightTrackModel[2].setRotationPoint(-112F, 5F, -75F);

		rightTrackModel[3].addShapeBox(0F, 0F, 0F, 9, 11, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box29
		rightTrackModel[3].setRotationPoint(-145F, 10F, -70F);

		rightTrackModel[4].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box30
		rightTrackModel[4].setRotationPoint(-154F, 10F, -70F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box31
		rightTrackModel[5].setRotationPoint(-136F, 6F, -70F);

		rightTrackModel[6].addBox(0F, 0F, 0F, 15, 12, 5, 0F); // Import Box32
		rightTrackModel[6].setRotationPoint(-127F, 5F, -65F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box33
		rightTrackModel[7].setRotationPoint(-132F, 5F, -65F);

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box34
		rightTrackModel[8].setRotationPoint(-112F, 5F, -65F);

		rightTrackModel[9].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box35
		rightTrackModel[9].setRotationPoint(-112F, 6F, -70F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 9, 11, 5, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box36
		rightTrackModel[10].setRotationPoint(-103F, 10F, -70F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box37
		rightTrackModel[11].setRotationPoint(-94F, 10F, -70F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Import Box38
		rightTrackModel[12].setRotationPoint(-89F, 6F, -69F);

		rightTrackModel[13].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Import Box39
		rightTrackModel[13].setRotationPoint(-157F, 6F, -69F);

		rightTrackModel[14].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box40
		rightTrackModel[14].setRotationPoint(-154F, 16F, -75F);

		rightTrackModel[15].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		rightTrackModel[15].setRotationPoint(-145F, 16F, -75F);

		rightTrackModel[16].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box42
		rightTrackModel[16].setRotationPoint(-131F, 24F, -75F);

		rightTrackModel[17].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box43
		rightTrackModel[17].setRotationPoint(-170F, 24F, -75F);

		rightTrackModel[18].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		rightTrackModel[18].setRotationPoint(-168F, 16F, -75F);

		rightTrackModel[19].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		rightTrackModel[19].setRotationPoint(-108F, 16F, -75F);

		rightTrackModel[20].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box46
		rightTrackModel[20].setRotationPoint(-110F, 24F, -75F);

		rightTrackModel[21].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box47
		rightTrackModel[21].setRotationPoint(-94F, 16F, -75F);

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		rightTrackModel[22].setRotationPoint(-85F, 16F, -75F);

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box49
		rightTrackModel[23].setRotationPoint(-71F, 24F, -75F);

		rightTrackModel[24].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		rightTrackModel[24].setRotationPoint(-108F, 16F, -65F);

		rightTrackModel[25].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box51
		rightTrackModel[25].setRotationPoint(-110F, 24F, -65F);

		rightTrackModel[26].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box52
		rightTrackModel[26].setRotationPoint(-94F, 16F, -65F);

		rightTrackModel[27].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		rightTrackModel[27].setRotationPoint(-85F, 16F, -65F);

		rightTrackModel[28].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box54
		rightTrackModel[28].setRotationPoint(-71F, 24F, -65F);

		rightTrackModel[29].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box55
		rightTrackModel[29].setRotationPoint(-131F, 24F, -65F);

		rightTrackModel[30].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		rightTrackModel[30].setRotationPoint(-145F, 16F, -65F);

		rightTrackModel[31].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box57
		rightTrackModel[31].setRotationPoint(-154F, 16F, -65F);

		rightTrackModel[32].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		rightTrackModel[32].setRotationPoint(-168F, 16F, -65F);

		rightTrackModel[33].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box59
		rightTrackModel[33].setRotationPoint(-170F, 24F, -65F);

		rightTrackModel[34].addBox(0F, 0F, 0F, 64, 1, 9, 0F); // Import Box60
		rightTrackModel[34].setRotationPoint(-152F, 3F, -72F);

		rightTrackModel[35].addBox(0F, 0F, 0F, 60, 1, 9, 0F); // Import Box61
		rightTrackModel[35].setRotationPoint(-150F, 1F, -72F);

		rightTrackModel[36].addBox(0F, 0F, 0F, 51, 1, 9, 0F); // Import Box62
		rightTrackModel[36].setRotationPoint(-145F, -1F, -72F);

		rightTrackModel[37].addBox(0F, 0F, 0F, 40, 1, 9, 0F); // Import Box63
		rightTrackModel[37].setRotationPoint(-140F, -3F, -72F);

		rightTrackModel[38].addBox(0F, 0F, 0F, 32, 1, 9, 0F); // Import Box64
		rightTrackModel[38].setRotationPoint(-136F, -5F, -72F);

		rightTrackModel[39].addBox(0F, 0F, 0F, 24, 1, 9, 0F); // Import Box65
		rightTrackModel[39].setRotationPoint(-132F, -7F, -72F);

		rightTrackModel[40].addBox(0F, 0F, 0F, 12, 2, 15, 0F); // Import Box66
		rightTrackModel[40].setRotationPoint(-126F, -9F, -75F);

		rightTrackModel[41].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box67
		rightTrackModel[41].setRotationPoint(-125F, -10F, -74F);

		rightTrackModel[42].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box68
		rightTrackModel[42].setRotationPoint(-117F, -10F, -74F);

		rightTrackModel[43].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box69
		rightTrackModel[43].setRotationPoint(-117F, -10F, -63F);

		rightTrackModel[44].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box70
		rightTrackModel[44].setRotationPoint(-125F, -10F, -63F);

		rightTrackModel[45].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Import Box71
		rightTrackModel[45].setRotationPoint(-90F, 2F, -69F);

		rightTrackModel[46].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Import Box72
		rightTrackModel[46].setRotationPoint(-153F, 2F, -69F);

		rightTrackModel[47].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box73
		rightTrackModel[47].setRotationPoint(-72F, 30F, -70F);

		rightTrackModel[48].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box74
		rightTrackModel[48].setRotationPoint(-72F, 30F, -70F);

		rightTrackModel[49].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box75
		rightTrackModel[49].setRotationPoint(-72F, 30F, -70F);

		rightTrackModel[50].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box76
		rightTrackModel[50].setRotationPoint(-107F, 30F, -70F);

		rightTrackModel[51].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box77
		rightTrackModel[51].setRotationPoint(-107F, 30F, -70F);

		rightTrackModel[52].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box78
		rightTrackModel[52].setRotationPoint(-107F, 30F, -70F);

		rightTrackModel[53].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box79
		rightTrackModel[53].setRotationPoint(-132F, 30F, -70F);

		rightTrackModel[54].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box80
		rightTrackModel[54].setRotationPoint(-132F, 30F, -70F);

		rightTrackModel[55].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box81
		rightTrackModel[55].setRotationPoint(-132F, 30F, -70F);

		rightTrackModel[56].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box82
		rightTrackModel[56].setRotationPoint(-167F, 30F, -70F);

		rightTrackModel[57].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box83
		rightTrackModel[57].setRotationPoint(-167F, 30F, -70F);

		rightTrackModel[58].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box84
		rightTrackModel[58].setRotationPoint(-167F, 30F, -70F);

		rightTrackModel[59].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box85
		rightTrackModel[59].setRotationPoint(54F, 30F, -70F);

		rightTrackModel[60].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box86
		rightTrackModel[60].setRotationPoint(54F, 30F, -70F);

		rightTrackModel[61].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box87
		rightTrackModel[61].setRotationPoint(54F, 30F, -70F);

		rightTrackModel[62].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box88
		rightTrackModel[62].setRotationPoint(55F, 24F, -75F);

		rightTrackModel[63].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		rightTrackModel[63].setRotationPoint(41F, 16F, -75F);

		rightTrackModel[64].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box90
		rightTrackModel[64].setRotationPoint(32F, 16F, -75F);

		rightTrackModel[65].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box91
		rightTrackModel[65].setRotationPoint(16F, 24F, -75F);

		rightTrackModel[66].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		rightTrackModel[66].setRotationPoint(18F, 16F, -75F);

		rightTrackModel[67].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box93
		rightTrackModel[67].setRotationPoint(19F, 30F, -70F);

		rightTrackModel[68].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box94
		rightTrackModel[68].setRotationPoint(19F, 30F, -70F);

		rightTrackModel[69].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box95
		rightTrackModel[69].setRotationPoint(19F, 30F, -70F);

		rightTrackModel[70].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box96
		rightTrackModel[70].setRotationPoint(-6F, 30F, -70F);

		rightTrackModel[71].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box97
		rightTrackModel[71].setRotationPoint(-6F, 30F, -70F);

		rightTrackModel[72].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box98
		rightTrackModel[72].setRotationPoint(-6F, 30F, -70F);

		rightTrackModel[73].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box99
		rightTrackModel[73].setRotationPoint(-5F, 24F, -75F);

		rightTrackModel[74].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		rightTrackModel[74].setRotationPoint(-19F, 16F, -75F);

		rightTrackModel[75].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box101
		rightTrackModel[75].setRotationPoint(-28F, 16F, -75F);

		rightTrackModel[76].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		rightTrackModel[76].setRotationPoint(-42F, 16F, -75F);

		rightTrackModel[77].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box103
		rightTrackModel[77].setRotationPoint(-41F, 30F, -70F);

		rightTrackModel[78].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box104
		rightTrackModel[78].setRotationPoint(-41F, 30F, -70F);

		rightTrackModel[79].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box105
		rightTrackModel[79].setRotationPoint(-41F, 30F, -70F);

		rightTrackModel[80].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Import Box106
		rightTrackModel[80].setRotationPoint(-31F, 6F, -69F);

		rightTrackModel[81].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box107
		rightTrackModel[81].setRotationPoint(-28F, 10F, -70F);

		rightTrackModel[82].addShapeBox(0F, 0F, 0F, 9, 11, 5, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box108
		rightTrackModel[82].setRotationPoint(-19F, 10F, -70F);

		rightTrackModel[83].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box109
		rightTrackModel[83].setRotationPoint(-10F, 6F, -70F);

		rightTrackModel[84].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box110
		rightTrackModel[84].setRotationPoint(14F, 6F, -70F);

		rightTrackModel[85].addShapeBox(0F, 0F, 0F, 9, 11, 5, 0F,0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box111
		rightTrackModel[85].setRotationPoint(23F, 10F, -70F);

		rightTrackModel[86].addBox(0F, 0F, 0F, 9, 11, 5, 0F); // Import Box112
		rightTrackModel[86].setRotationPoint(32F, 10F, -70F);

		rightTrackModel[87].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box113
		rightTrackModel[87].setRotationPoint(14F, 5F, -75F);

		rightTrackModel[88].addBox(0F, 0F, 0F, 15, 12, 5, 0F); // Import Box114
		rightTrackModel[88].setRotationPoint(-1F, 5F, -75F);

		rightTrackModel[89].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box115
		rightTrackModel[89].setRotationPoint(-6F, 5F, -75F);

		rightTrackModel[90].addBox(0F, 0F, 0F, 60, 1, 9, 0F); // Import Box116
		rightTrackModel[90].setRotationPoint(-24F, 1F, -72F);

		rightTrackModel[91].addBox(0F, 0F, 0F, 51, 1, 9, 0F); // Import Box117
		rightTrackModel[91].setRotationPoint(-19F, -1F, -72F);

		rightTrackModel[92].addBox(0F, 0F, 0F, 40, 1, 9, 0F); // Import Box118
		rightTrackModel[92].setRotationPoint(-14F, -3F, -72F);

		rightTrackModel[93].addBox(0F, 0F, 0F, 32, 1, 9, 0F); // Import Box119
		rightTrackModel[93].setRotationPoint(-10F, -5F, -72F);

		rightTrackModel[94].addBox(0F, 0F, 0F, 24, 1, 9, 0F); // Import Box120
		rightTrackModel[94].setRotationPoint(-6F, -7F, -72F);

		rightTrackModel[95].addBox(0F, 0F, 0F, 12, 2, 15, 0F); // Import Box121
		rightTrackModel[95].setRotationPoint(0F, -9F, -75F);

		rightTrackModel[96].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box122
		rightTrackModel[96].setRotationPoint(1F, -10F, -74F);

		rightTrackModel[97].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box123
		rightTrackModel[97].setRotationPoint(9F, -10F, -74F);

		rightTrackModel[98].addBox(0F, 0F, 0F, 7, 7, 3, 0F); // Import Box124
		rightTrackModel[98].setRotationPoint(37F, 6F, -69F);

		rightTrackModel[99].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Import Box125
		rightTrackModel[99].setRotationPoint(36F, 2F, -69F);

		rightTrackModel[100].addBox(0F, 0F, 0F, 4, 4, 3, 0F); // Import Box126
		rightTrackModel[100].setRotationPoint(-27F, 2F, -69F);

		rightTrackModel[101].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box127
		rightTrackModel[101].setRotationPoint(-6F, 5F, -65F);

		rightTrackModel[102].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box128
		rightTrackModel[102].setRotationPoint(1F, -10F, -63F);

		rightTrackModel[103].addBox(0F, 0F, 0F, 2, 15, 2, 0F); // Import Box129
		rightTrackModel[103].setRotationPoint(9F, -10F, -63F);

		rightTrackModel[104].addBox(0F, 0F, 0F, 64, 1, 9, 0F); // Import Box130
		rightTrackModel[104].setRotationPoint(-26F, 3F, -72F);

		rightTrackModel[105].addBox(0F, 0F, 0F, 15, 12, 5, 0F); // Import Box131
		rightTrackModel[105].setRotationPoint(-1F, 5F, -65F);

		rightTrackModel[106].addShapeBox(0F, 0F, 0F, 5, 12, 5, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box132
		rightTrackModel[106].setRotationPoint(14F, 5F, -65F);

		rightTrackModel[107].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		rightTrackModel[107].setRotationPoint(41F, 16F, -65F);

		rightTrackModel[108].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box134
		rightTrackModel[108].setRotationPoint(32F, 16F, -65F);

		rightTrackModel[109].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		rightTrackModel[109].setRotationPoint(18F, 16F, -65F);

		rightTrackModel[110].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box136
		rightTrackModel[110].setRotationPoint(16F, 24F, -65F);

		rightTrackModel[111].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box137
		rightTrackModel[111].setRotationPoint(-5F, 24F, -65F);

		rightTrackModel[112].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		rightTrackModel[112].setRotationPoint(-19F, 16F, -65F);

		rightTrackModel[113].addBox(0F, 0F, 0F, 9, 16, 5, 0F); // Import Box139
		rightTrackModel[113].setRotationPoint(-28F, 16F, -65F);

		rightTrackModel[114].addShapeBox(0F, 0F, 0F, 14, 16, 5, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		rightTrackModel[114].setRotationPoint(-42F, 16F, -65F);

		rightTrackModel[115].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box141
		rightTrackModel[115].setRotationPoint(-44F, 24F, -65F);

		rightTrackModel[116].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Import Box142
		rightTrackModel[116].setRotationPoint(55F, 24F, -65F);

		rightTrackModel[117].addShapeBox(0F, 0F, 0F, 2, 8, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box143
		rightTrackModel[117].setRotationPoint(-44F, 24F, -75F);

		rightTrackModel[118].addBox(0F, 0F, 0F, 234, 2, 21, 0F); // Import Box144
		rightTrackModel[118].setRotationPoint(-175F, 42F, -78F);

		rightTrackModel[119].addBox(0F, 0F, 0F, 57, 2, 21, 0F); // Import Box145
		rightTrackModel[119].setRotationPoint(58F, 42F, -78F);
		rightTrackModel[119].rotateAngleZ = 0.40142573F;

		rightTrackModel[120].addBox(0F, 0F, 0F, 22, 2, 21, 0F); // Import Box146
		rightTrackModel[120].setRotationPoint(111F, 21F, -78F);
		rightTrackModel[120].rotateAngleZ = 1.06465084F;

		rightTrackModel[121].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box147
		rightTrackModel[121].setRotationPoint(121F, 3F, -78F);
		rightTrackModel[121].rotateAngleZ = 1.85004901F;

		rightTrackModel[122].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box148
		rightTrackModel[122].setRotationPoint(116F, -15F, -78F);
		rightTrackModel[122].rotateAngleZ = 2.58308729F;

		rightTrackModel[123].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box149
		rightTrackModel[123].setRotationPoint(100F, -25F, -78F);
		rightTrackModel[123].rotateAngleZ = 3.0368729F;

		rightTrackModel[124].addBox(0F, 0F, 0F, 302, 2, 21, 0F); // Import Box150
		rightTrackModel[124].setRotationPoint(80F, -27F, -78F);
		rightTrackModel[124].rotateAngleZ = 3.15904595F;

		rightTrackModel[125].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box151
		rightTrackModel[125].setRotationPoint(-240F, 10F, -78F);
		rightTrackModel[125].rotateAngleZ = -0.76794487F;

		rightTrackModel[126].addBox(0F, 0F, 0F, 21, 2, 21, 0F); // Import Box152
		rightTrackModel[126].setRotationPoint(-237F, -9F, -78F);
		rightTrackModel[126].rotateAngleZ = -1.72787596F;

		rightTrackModel[127].addBox(0F, 0F, 0F, 20, 2, 21, 0F); // Import Box153
		rightTrackModel[127].setRotationPoint(-239F, -10F, -78F);
		rightTrackModel[127].rotateAngleZ = -5.70722665F;

		rightTrackModel[128].addBox(0F, 0F, 0F, 56, 2, 21, 0F); // Import Box154
		rightTrackModel[128].setRotationPoint(-227F, 23F, -78F);
		rightTrackModel[128].rotateAngleZ = -0.34906585F;

		rightTrackModel[129].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box155
		rightTrackModel[129].setRotationPoint(43F, -16F, -70F);

		rightTrackModel[130].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box156
		rightTrackModel[130].setRotationPoint(43F, -16F, -70F);

		rightTrackModel[131].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box157
		rightTrackModel[131].setRotationPoint(43F, -16F, -70F);

		rightTrackModel[132].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box158
		rightTrackModel[132].setRotationPoint(-56F, -14F, -70F);

		rightTrackModel[133].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box159
		rightTrackModel[133].setRotationPoint(-56F, -14F, -70F);

		rightTrackModel[134].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box160
		rightTrackModel[134].setRotationPoint(-56F, -14F, -70F);

		rightTrackModel[135].addShapeBox(3F, -3F, 0F, 9, 6, 5, 0F,0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F); // Import Box161
		rightTrackModel[135].setRotationPoint(-159F, -11F, -70F);

		rightTrackModel[136].addBox(-3F, -12F, 0F, 6, 24, 5, 0F); // Import Box162
		rightTrackModel[136].setRotationPoint(-159F, -11F, -70F);

		rightTrackModel[137].addShapeBox(-12F, -3F, 0F, 9, 6, 5, 0F,0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F); // Import Box163
		rightTrackModel[137].setRotationPoint(-159F, -11F, -70F);

		rightTrackModel[138].addBox(-21F, -20F, 0F, 40, 40, 17, 0F); // Import Box165
		rightTrackModel[138].setRotationPoint(92F, 0F, -75F);

		rightTrackModel[139].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		rightTrackModel[139].setRotationPoint(92F, 0F, -75F);

		rightTrackModel[140].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		rightTrackModel[140].setRotationPoint(91F, -1F, -75F);
		rightTrackModel[140].rotateAngleZ = 1.57079633F;

		rightTrackModel[141].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		rightTrackModel[141].setRotationPoint(91F, 1F, -75F);
		rightTrackModel[141].rotateAngleZ = 4.71238898F;

		rightTrackModel[142].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		rightTrackModel[142].setRotationPoint(90F, 0F, -75F);
		rightTrackModel[142].rotateAngleZ = 3.14159265F;

		rightTrackModel[143].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		rightTrackModel[143].setRotationPoint(-206F, 5F, -75F);
		rightTrackModel[143].rotateAngleZ = 4.71238898F;

		rightTrackModel[144].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		rightTrackModel[144].setRotationPoint(-207F, 4F, -75F);
		rightTrackModel[144].rotateAngleZ = 3.14159265F;

		rightTrackModel[145].addBox(-21F, -20F, 0F, 40, 40, 17, 0F); // Import Box173
		rightTrackModel[145].setRotationPoint(-205F, 4F, -75F);

		rightTrackModel[146].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box174
		rightTrackModel[146].setRotationPoint(-205F, 4F, -75F);

		rightTrackModel[147].addShapeBox(-21F, -25F, 0F, 40, 5, 17, 0F,-15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		rightTrackModel[147].setRotationPoint(-206F, 3F, -75F);
		rightTrackModel[147].rotateAngleZ = 1.57079633F;
	}
}