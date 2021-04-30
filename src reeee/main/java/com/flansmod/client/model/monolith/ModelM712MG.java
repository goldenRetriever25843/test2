//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.10.2017 - 19:16:10
// Last changed on: 28.10.2017 - 19:16:10

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM712MG extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelM712MG() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[35];
		barrelModel = new ModelRendererTurbo[288];

		initbodyModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 22
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 34

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -5.25F, 0F, -0.125F, -5.25F, -0.125F, -1.125F, -0.125F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 4.25F, -0.5F, 0F, 4.25F, -0.5F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 2
		bodyModel[0].setRotationPoint(0.5F, 4F, -4.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, 0.375F, -0.25F, -0.125F, 0.5F, -0.25F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(-11F, 9F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.375F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.5F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[2].setRotationPoint(-12F, 9F, -1F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0.375F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.125F); // Box 8
		bodyModel[3].setRotationPoint(-12F, 9F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0F, 0.5F, -0.25F, 0F, 0.375F, -0.25F, -0.125F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, 0F); // Box 9
		bodyModel[4].setRotationPoint(-11F, 9F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0.25F, -1F, -0.5F, -1.75F, 3.95F, -0.5F, -1.625F, 3.8F, -0.125F, 0.125F, -1F, -0.125F, -0.5F, 0.125F, -0.5F, -1.5F, -4.5F, -0.5F, -1.5F, -4.5F, 0F, -0.5F, 0.125F, 0F); // Box 10
		bodyModel[5].setRotationPoint(-11.5F, 8F, -0.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.5F, -1.125F, -0.5F, -1.5F, 3.5F, -0.5F, -1.5F, 3.5F, 0F, -0.5F, -1.125F, 0F, -1.25F, 0.125F, -0.5F, -1.35F, -4.125F, -0.5F, -1.5F, -4.25F, -0.125F, -1.125F, 0.125F, -0.125F); // Box 11
		bodyModel[6].setRotationPoint(-11.5F, 8F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.5F, -1.125F, 0F, -1.5F, 3.5F, 0F, -1.5F, 3.5F, -0.5F, -0.5F, -1.125F, -0.5F, -1.125F, 0.125F, -0.125F, -1.5F, -4.25F, -0.125F, -1.35F, -4.125F, -0.5F, -1.25F, 0.125F, -0.5F); // Box 12
		bodyModel[7].setRotationPoint(-11.5F, 8F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0.125F, -1F, -0.125F, -1.625F, 3.8F, -0.125F, -1.75F, 3.95F, -0.5F, 0.25F, -1F, -0.5F, -0.5F, 0.125F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, -0.5F, -0.5F, 0.125F, -0.5F); // Box 13
		bodyModel[8].setRotationPoint(-11.5F, 8F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.125F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, -0.125F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-0.5F, 4F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, -0.125F, 0F); // Box 16
		bodyModel[10].setRotationPoint(-0.5F, 4F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-0.5F, 4F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 18
		bodyModel[12].setRotationPoint(-0.5F, 4F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0.125F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[13].setRotationPoint(0F, 9F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.25F, -0.125F, -0.25F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[14].setRotationPoint(1F, 9F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0.125F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.375F, 0F, 0F, -0.25F); // Box 21
		bodyModel[15].setRotationPoint(1F, 9F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.125F, -0.25F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.375F); // Box 22
		bodyModel[16].setRotationPoint(0F, 9F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0.125F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[17].setRotationPoint(0F, 9F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0.25F, -0.125F, -0.25F, 0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(1F, 9F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0.125F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.375F, 0F, 0F, -0.25F); // Box 23
		bodyModel[19].setRotationPoint(1F, 9F, 4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.125F, -0.25F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.375F); // Box 23
		bodyModel[20].setRotationPoint(0F, 9F, 4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.125F, -5.25F, -0.125F, -0.5F, -5.25F, 0F, -1.5F, 0F, -0.5F, 0.875F, -0.125F, -0.5F, 0F, 4.25F, -0.5F, -0.5F, 4.25F, -0.5F, -1.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F); // Box 27
		bodyModel[21].setRotationPoint(0.5F, 4F, -4.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -5.25F, -0.5F, 0F, -5.25F, -0.5F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, 4.25F, -1F, -0.125F, 4.25F, -0.875F, -1.125F, -0.125F, -0.5F, 0.5F, 0F, -0.5F); // Box 28
		bodyModel[22].setRotationPoint(0.5F, 4F, -4.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -5.25F, -0.5F, -0.5F, -5.25F, -0.5F, -1.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, -0.125F, 4.25F, -0.875F, -0.5F, 4.25F, -1F, -1.5F, 0F, -0.5F, 0.875F, -0.125F, -0.5F); // Box 29
		bodyModel[23].setRotationPoint(0.5F, 4F, -4.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, -0.5F, -1.125F, -0.125F, -0.5F, -0.125F, -5.25F, -0.125F, -0.5F, -5.25F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 4.25F, -0.5F, -0.5F, 4.25F, -0.5F); // Box 30
		bodyModel[24].setRotationPoint(0.5F, 4F, 0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.875F, -0.125F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, -5.25F, 0F, -0.125F, -5.25F, -0.125F, 1F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -0.5F, 4.25F, -0.5F, 0F, 4.25F, -0.5F); // Box 30
		bodyModel[25].setRotationPoint(0.5F, 4F, 0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, -5.25F, -0.5F, -0.5F, -5.25F, -0.5F, 0.5F, 0F, -0.5F, -1.125F, -0.125F, -0.5F, -0.125F, 4.25F, -0.875F, -0.5F, 4.25F, -1F); // Box 30
		bodyModel[26].setRotationPoint(0.5F, 4F, 0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,1F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -0.5F, -5.25F, -0.5F, 0F, -5.25F, -0.5F, 0.875F, -0.125F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 4.25F, -1F, -0.125F, 4.25F, -0.875F); // Box 30
		bodyModel[27].setRotationPoint(0.5F, 4F, 0.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0.1F, -0.4F, -0.25F, 1.6F, -2.9F, -0.25F, 1.6F, 2.1F, 0F, 0.1F, -0.4F, 0F, -0.9F, -0.4F, -0.25F, -2.4F, -2.9F, -0.25F, -2.4F, 2.1F, 0F, -0.9F, -0.4F); // Box 34
		bodyModel[28].setRotationPoint(-11F, 9F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0.1F, -0.4F, -0.25F, 1.6F, 2.1F, -0.25F, 1.6F, -2.9F, 0F, 0.1F, -0.4F, 0F, -0.9F, -0.4F, -0.25F, -2.4F, 2.1F, -0.25F, -2.4F, -2.9F, 0F, -0.9F, -0.4F); // Box 35
		bodyModel[29].setRotationPoint(-11F, 9F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 36
		bodyModel[30].setRotationPoint(-0.5F, 3.5F, -0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 37
		bodyModel[31].setRotationPoint(-0.5F, 3.5F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.125F, 0F, -0.125F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.125F, 0F, -0.125F); // Box 38
		bodyModel[32].setRotationPoint(-0.5F, 3.5F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.125F, 0F, -0.125F, -0.5F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(-0.5F, 3.5F, -0.5F);

		bodyModel[34].addShapeBox(-4F, 3F, 0F, 1, 1, 1, 0F,0.5F, -1.225F, 1F, -0.65F, -0.925F, 1F, -0.65F, -0.925F, 0F, 0.5F, -1.225F, 0F, 0.175F, 0.6F, 1F, -0.3F, 0.25F, 1F, -0.3F, 0.25F, 0F, 0.175F, 0.6F, 0F); // Box 34
		bodyModel[34].setRotationPoint(0.5F, 1.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // No Part Selected
		barrelModel[1] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // No Part Selected
		barrelModel[2] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // No Part Selected
		barrelModel[3] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // No Part Selected
		barrelModel[4] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // No Part Selected
		barrelModel[5] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // No Part Selected
		barrelModel[6] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // No Part Selected
		barrelModel[7] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // No Part Selected
		barrelModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // No Part Selected
		barrelModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // No Part Selected
		barrelModel[10] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // No Part Selected
		barrelModel[11] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // No Part Selected
		barrelModel[12] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 62
		barrelModel[13] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 63
		barrelModel[14] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 64
		barrelModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 65
		barrelModel[16] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 66
		barrelModel[17] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 67
		barrelModel[18] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 68
		barrelModel[19] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 42
		barrelModel[20] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 43
		barrelModel[21] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 44
		barrelModel[22] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 45
		barrelModel[23] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 46
		barrelModel[24] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 47
		barrelModel[25] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 48
		barrelModel[26] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 49
		barrelModel[27] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 50
		barrelModel[28] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 51
		barrelModel[29] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 52
		barrelModel[30] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 53
		barrelModel[31] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 55
		barrelModel[32] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 56
		barrelModel[33] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 57
		barrelModel[34] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 58
		barrelModel[35] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 60
		barrelModel[36] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 61
		barrelModel[37] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 62
		barrelModel[38] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 63
		barrelModel[39] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 64
		barrelModel[40] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 64
		barrelModel[41] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 64
		barrelModel[42] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 64
		barrelModel[43] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 68
		barrelModel[44] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 69
		barrelModel[45] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 70
		barrelModel[46] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 71
		barrelModel[47] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 72
		barrelModel[48] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 172
		barrelModel[49] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 75
		barrelModel[50] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 0
		barrelModel[51] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 1
		barrelModel[52] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 2
		barrelModel[53] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 2
		barrelModel[54] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 4
		barrelModel[55] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 5
		barrelModel[56] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 6
		barrelModel[57] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 7
		barrelModel[58] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 8
		barrelModel[59] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		barrelModel[60] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 10
		barrelModel[61] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 11
		barrelModel[62] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		barrelModel[63] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 13
		barrelModel[64] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 14
		barrelModel[65] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 15
		barrelModel[66] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 16
		barrelModel[67] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 17
		barrelModel[68] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 18
		barrelModel[69] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 19
		barrelModel[70] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 20
		barrelModel[71] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 21
		barrelModel[72] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 22
		barrelModel[73] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 23
		barrelModel[74] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 44
		barrelModel[75] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 45
		barrelModel[76] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 46
		barrelModel[77] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 48
		barrelModel[78] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 50
		barrelModel[79] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 0
		barrelModel[80] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 1
		barrelModel[81] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 2
		barrelModel[82] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 3
		barrelModel[83] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 4
		barrelModel[84] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 5
		barrelModel[85] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 6
		barrelModel[86] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 7
		barrelModel[87] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 8
		barrelModel[88] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 9
		barrelModel[89] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 10
		barrelModel[90] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 18
		barrelModel[91] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 19
		barrelModel[92] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 20
		barrelModel[93] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 21
		barrelModel[94] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 23
		barrelModel[95] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 24
		barrelModel[96] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 25
		barrelModel[97] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 26
		barrelModel[98] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 1
		barrelModel[99] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 172
		barrelModel[100] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 1
		barrelModel[101] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 1
		barrelModel[102] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 1
		barrelModel[103] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 1
		barrelModel[104] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 172
		barrelModel[105] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 172
		barrelModel[106] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 172
		barrelModel[107] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 172
		barrelModel[108] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 172
		barrelModel[109] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 1
		barrelModel[110] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 172
		barrelModel[111] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1
		barrelModel[112] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 172
		barrelModel[113] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 1
		barrelModel[114] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 1
		barrelModel[115] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 1
		barrelModel[116] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 1
		barrelModel[117] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 172
		barrelModel[118] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 172
		barrelModel[119] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 172
		barrelModel[120] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 172
		barrelModel[121] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 172
		barrelModel[122] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 172
		barrelModel[123] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 172
		barrelModel[124] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 1
		barrelModel[125] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 172
		barrelModel[126] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 1
		barrelModel[127] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 1
		barrelModel[128] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 1
		barrelModel[129] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 1
		barrelModel[130] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 172
		barrelModel[131] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 172
		barrelModel[132] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 172
		barrelModel[133] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 172
		barrelModel[134] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 172
		barrelModel[135] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 172
		barrelModel[136] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 172
		barrelModel[137] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 172
		barrelModel[138] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 172
		barrelModel[139] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 1
		barrelModel[140] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 1
		barrelModel[141] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 1
		barrelModel[142] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 1
		barrelModel[143] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 172
		barrelModel[144] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 172
		barrelModel[145] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 172
		barrelModel[146] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 172
		barrelModel[147] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 172
		barrelModel[148] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 172
		barrelModel[149] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 172
		barrelModel[150] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 2
		barrelModel[151] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 172
		barrelModel[152] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 172
		barrelModel[153] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 172
		barrelModel[154] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 55
		barrelModel[155] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 55
		barrelModel[156] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 172
		barrelModel[157] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 172
		barrelModel[158] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 172
		barrelModel[159] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 172
		barrelModel[160] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 172
		barrelModel[161] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 172
		barrelModel[162] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 172
		barrelModel[163] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 172
		barrelModel[164] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 68
		barrelModel[165] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 172
		barrelModel[166] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 172
		barrelModel[167] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 172
		barrelModel[168] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 172
		barrelModel[169] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 172
		barrelModel[170] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 172
		barrelModel[171] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 172
		barrelModel[172] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 172
		barrelModel[173] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 172
		barrelModel[174] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 172
		barrelModel[175] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 172
		barrelModel[176] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 172
		barrelModel[177] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 172
		barrelModel[178] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 172
		barrelModel[179] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 172
		barrelModel[180] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 172
		barrelModel[181] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 172
		barrelModel[182] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 172
		barrelModel[183] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 172
		barrelModel[184] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 172
		barrelModel[185] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 172
		barrelModel[186] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 172
		barrelModel[187] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 172
		barrelModel[188] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 172
		barrelModel[189] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 172
		barrelModel[190] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 172
		barrelModel[191] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 172
		barrelModel[192] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 97
		barrelModel[193] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 98
		barrelModel[194] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 172
		barrelModel[195] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 172
		barrelModel[196] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 172
		barrelModel[197] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 172
		barrelModel[198] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 172
		barrelModel[199] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 172
		barrelModel[200] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 172
		barrelModel[201] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 172
		barrelModel[202] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 172
		barrelModel[203] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 172
		barrelModel[204] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 110
		barrelModel[205] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 172
		barrelModel[206] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 172
		barrelModel[207] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 172
		barrelModel[208] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 172
		barrelModel[209] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 172
		barrelModel[210] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 172
		barrelModel[211] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 172
		barrelModel[212] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 172
		barrelModel[213] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 172
		barrelModel[214] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 172
		barrelModel[215] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 172
		barrelModel[216] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 123
		barrelModel[217] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 172
		barrelModel[218] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 172
		barrelModel[219] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 172
		barrelModel[220] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 172
		barrelModel[221] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 172
		barrelModel[222] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 172
		barrelModel[223] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 172
		barrelModel[224] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 172
		barrelModel[225] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 172
		barrelModel[226] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 172
		barrelModel[227] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 172
		barrelModel[228] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 136
		barrelModel[229] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 172
		barrelModel[230] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 172
		barrelModel[231] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 172
		barrelModel[232] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 172
		barrelModel[233] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 172
		barrelModel[234] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 172
		barrelModel[235] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 172
		barrelModel[236] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 172
		barrelModel[237] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 172
		barrelModel[238] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 172
		barrelModel[239] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 172
		barrelModel[240] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 149
		barrelModel[241] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 172
		barrelModel[242] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 172
		barrelModel[243] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 172
		barrelModel[244] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 172
		barrelModel[245] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 172
		barrelModel[246] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 172
		barrelModel[247] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 172
		barrelModel[248] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 172
		barrelModel[249] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 172
		barrelModel[250] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 172
		barrelModel[251] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 172
		barrelModel[252] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 162
		barrelModel[253] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 172
		barrelModel[254] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 172
		barrelModel[255] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 172
		barrelModel[256] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 166
		barrelModel[257] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 172
		barrelModel[258] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 172
		barrelModel[259] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 172
		barrelModel[260] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 172
		barrelModel[261] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 172
		barrelModel[262] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 172
		barrelModel[263] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 172
		barrelModel[264] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 172
		barrelModel[265] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 172
		barrelModel[266] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 174
		barrelModel[267] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 172
		barrelModel[268] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 172
		barrelModel[269] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 172
		barrelModel[270] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 172
		barrelModel[271] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 172
		barrelModel[272] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 172
		barrelModel[273] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 172
		barrelModel[274] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 172
		barrelModel[275] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 172
		barrelModel[276] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 172
		barrelModel[277] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 172
		barrelModel[278] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 172
		barrelModel[279] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 189
		barrelModel[280] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 172
		barrelModel[281] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 172
		barrelModel[282] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 172
		barrelModel[283] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 172
		barrelModel[284] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 172
		barrelModel[285] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 172
		barrelModel[286] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 172
		barrelModel[287] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 172

		barrelModel[0].addShapeBox(-2.5F, -1.75F, 0F, 4, 1, 1, 0F,-3F, 0.625F, 0.625F, 6.5F, 0.625F, 0.625F, 6.5F, 0.625F, -0.375F, -3F, 0.625F, -0.375F, -3F, -0.375F, 0.625F, 6.5F, -0.375F, 0.625F, 6.5F, -0.375F, -0.375F, -3F, -0.375F, -0.375F); // No Part Selected
		barrelModel[0].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[1].addShapeBox(-2.5F, -2.75F, 0F, 4, 1, 1, 0F,-3F, -1.625F, -0.625F, 6.5F, -1.625F, -0.625F, 6.5F, -1.625F, 0F, -3F, -1.625F, 0F, -3F, 1F, -0.625F, 6.5F, 1F, -0.625F, 6.5F, 1F, -0.375F, -3F, 1F, -0.375F); // No Part Selected
		barrelModel[1].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[2].addShapeBox(-2.5F, -1.75F, 0F, 4, 1, 1, 0F,-3F, 1.25F, 0F, 6.5F, 1.25F, 0F, 6.5F, 1F, -0.375F, -3F, 1F, -0.375F, -3F, -1.625F, 0F, 6.5F, -1.625F, 0F, 6.5F, -1.625F, -0.375F, -3F, -1.625F, -0.375F); // No Part Selected
		barrelModel[2].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[3].addShapeBox(-2.5F, -1.75F, 0F, 4, 1, 1, 0F,-3F, 0F, -0.625F, 6.5F, 0F, -0.625F, 6.5F, 0F, 0.25F, -3F, 0F, 0.25F, -3F, -0.375F, -0.625F, 6.5F, -0.375F, -0.625F, 6.5F, -0.375F, 0F, -3F, -0.375F, 0F); // No Part Selected
		barrelModel[3].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[4].addShapeBox(-2.5F, -1.75F, 0F, 4, 1, 1, 0F,-3F, 0.625F, -0.625F, 6.5F, 0.625F, -0.625F, 6.5F, 0.625F, 0F, -3F, 0.625F, 0F, -3F, -1F, -0.625F, 6.5F, -1F, -0.625F, 6.5F, -1F, 0.25F, -3F, -1F, 0.25F); // No Part Selected
		barrelModel[4].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[5].addShapeBox(0.5F, -1.75F, 0F, 2, 1, 1, 0F,-7.5F, -0.325F, 0.175F, 8.5F, -0.125F, 0.375F, 8.5F, 0F, -1F, -7.5F, -0.275F, -1F, -7.5F, -0.5F, 0.225F, 8.5F, -0.5F, 0.5F, 8.5F, -0.5F, -1F, -7.5F, -0.5F, -1F); // No Part Selected
		barrelModel[5].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[6].addShapeBox(0.5F, -1.75F, 0F, 2, 1, 1, 0F,-7.5F, -0.5F, 0.225F, 8.5F, -0.5F, 0.5F, 8.5F, -0.5F, -1F, -7.5F, -0.5F, -1F, -7.5F, -0.325F, 0.175F, 8.5F, -0.125F, 0.375F, 8.5F, 0F, -1F, -7.5F, -0.275F, -1F); // No Part Selected
		barrelModel[6].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[7].addShapeBox(0.5F, -1.75F, 0F, 2, 1, 1, 0F,-7.5F, -0.5F, 0F, 8.5F, -0.5F, 0F, 8.5F, -0.5F, -0.5F, -7.5F, -0.5F, -0.775F, -7.5F, -0.275F, 0F, 8.5F, 0F, 0F, 8.5F, -0.125F, -0.625F, -7.5F, -0.325F, -0.825F); // No Part Selected
		barrelModel[7].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[8].addShapeBox(0.5F, -1.75F, 0F, 2, 1, 1, 0F,-7.5F, -0.275F, 0F, 8.5F, 0F, 0F, 8.5F, -0.125F, -0.625F, -7.5F, -0.325F, -0.825F, -7.5F, -0.5F, 0F, 8.5F, -0.5F, 0F, 8.5F, -0.5F, -0.5F, -7.5F, -0.5F, -0.775F); // No Part Selected
		barrelModel[8].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[9].addShapeBox(-5.5F, -3.5F, -1F, 1, 3, 2, 0F,0F, -0.5F, -0.125F, -0.625F, -0.5F, -0.125F, -0.625F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.2F, -0.125F, -0.625F, -0.075F, -0.125F, -0.625F, -0.075F, -0.125F, 0F, -0.2F, -0.125F); // No Part Selected
		barrelModel[9].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[10].addShapeBox(-6.5F, -3F, -1F, 1, 1, 2, 0F,0.125F, -0.25F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.125F, -0.25F, -0.375F, 0.5F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.5F, 0F, -0.375F); // No Part Selected
		barrelModel[10].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[11].addShapeBox(-7.5F, -2F, -1F, 2, 1, 2, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.375F, -0.5F, 0.3F, -0.375F, 0F, 0.3F, -0.125F, 0F, 0.3F, -0.125F, -0.5F, 0.3F, -0.375F); // No Part Selected
		barrelModel[11].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[12].addShapeBox(0.5F, -1.75F, 0F, 1, 1, 1, 0F,-7.5F, -0.25F, 0.25F, 6.9F, -0.25F, 0.25F, 6.9F, -0.175F, -1F, -7.5F, -0.175F, -1F, -7.5F, -0.5F, 0.325F, 6.9F, -0.5F, 0.325F, 6.9F, -0.5F, -1F, -7.5F, -0.5F, -1F); // Box 62
		barrelModel[12].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[13].addShapeBox(0.5F, -1.75F, 0F, 1, 1, 1, 0F,-7.5F, -0.5F, 0.325F, 6.9F, -0.5F, 0.325F, 6.9F, -0.5F, -1F, -7.5F, -0.5F, -1F, -7.5F, -0.25F, 0.25F, 6.9F, -0.25F, 0.25F, 6.9F, -0.175F, -1F, -7.5F, -0.175F, -1F); // Box 63
		barrelModel[13].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[14].addShapeBox(0.5F, -1.75F, -1F, 1, 1, 1, 0F,-7.5F, -0.5F, -1F, 6.9F, -0.5F, -1F, 6.9F, -0.5F, 0.325F, -7.5F, -0.5F, 0.325F, -7.5F, -0.175F, -1F, 6.9F, -0.175F, -1F, 6.9F, -0.25F, 0.25F, -7.5F, -0.25F, 0.25F); // Box 64
		barrelModel[14].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[15].addShapeBox(0.5F, -1.75F, -1F, 1, 1, 1, 0F,-7.5F, -0.175F, -1F, 6.9F, -0.175F, -1F, 6.9F, -0.25F, 0.25F, -7.5F, -0.25F, 0.25F, -7.5F, -0.5F, -1F, 6.9F, -0.5F, -1F, 6.9F, -0.5F, 0.325F, -7.5F, -0.5F, 0.325F); // Box 65
		barrelModel[15].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[16].addShapeBox(-8.5F, -1.7F, -1F, 1, 1, 2, 0F,0F, -0.625F, -0.5F, 0.5F, -0.625F, -0.5F, 0.5F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 66
		barrelModel[16].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[17].addShapeBox(-8.5F, -1.7F, -1F, 1, 1, 1, 0F,0F, -0.25F, -0.625F, 0.5F, -0.25F, -0.625F, 0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.375F, -0.5F, 0.5F, -0.375F, -0.5F, 0.5F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 67
		barrelModel[17].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[18].addShapeBox(-8.5F, -1.7F, 0F, 1, 1, 1, 0F,0F, -0.05F, 0F, 0.5F, -0.05F, 0F, 0.5F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.375F, 0F, 0.5F, -0.375F, 0F, 0.5F, -0.375F, -0.5F, 0F, -0.375F, -0.5F); // Box 68
		barrelModel[18].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[19].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F,-0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.225F, 0F, -0.225F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.225F, 0F, -0.225F); // Box 42
		barrelModel[19].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[20].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.225F, 0F, -0.225F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.225F, 0F, -0.225F, -0.5F, 0F, -0.1F); // Box 43
		barrelModel[20].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[21].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, -0.1F, -0.225F, 0F, -0.225F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.225F, 0F, -0.225F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 44
		barrelModel[21].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[22].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F,-0.225F, 0F, -0.225F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.225F, 0F, -0.225F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.1F, 0F, -0.5F); // Box 45
		barrelModel[22].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[23].addShapeBox(-2.5F, -2.75F, 0F, 4, 1, 1, 0F,-3F, -1.625F, 0F, 6.5F, -1.625F, 0F, 6.5F, -1.625F, -0.375F, -3F, -1.625F, -0.375F, -3F, 1.25F, 0F, 6.5F, 1.25F, 0F, 6.5F, 1F, -0.375F, -3F, 1F, -0.375F); // Box 46
		barrelModel[23].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[24].addShapeBox(-2.5F, -2.75F, -1F, 4, 1, 1, 0F,-3F, -1.625F, -0.375F, 6.5F, -1.625F, -0.375F, 6.5F, -1.625F, 0F, -3F, -1.625F, 0F, -3F, 1F, -0.375F, 6.5F, 1F, -0.375F, 6.5F, 1.25F, 0F, -3F, 1.25F, 0F); // Box 47
		barrelModel[24].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[25].addShapeBox(-2.5F, -1.75F, -1F, 4, 1, 1, 0F,-3F, 1F, -0.375F, 6.5F, 1F, -0.375F, 6.5F, 1.25F, 0F, -3F, 1.25F, 0F, -3F, -1.625F, -0.375F, 6.5F, -1.625F, -0.375F, 6.5F, -1.625F, 0F, -3F, -1.625F, 0F); // Box 48
		barrelModel[25].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[26].addShapeBox(-2.5F, -1.75F, 0F, 4, 1, 1, 0F,-3F, 1F, -0.625F, 6.5F, 1F, -0.625F, 6.5F, 1F, -0.375F, -3F, 1F, -0.375F, -3F, -1.625F, -0.625F, 6.5F, -1.625F, -0.625F, 6.5F, -1.625F, 0F, -3F, -1.625F, 0F); // Box 49
		barrelModel[26].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[27].addShapeBox(-2.5F, -2.75F, -1F, 4, 1, 1, 0F,-3F, -1.625F, 0F, 6.5F, -1.625F, 0F, 6.5F, -1.625F, -0.625F, -3F, -1.625F, -0.625F, -3F, 1F, -0.375F, 6.5F, 1F, -0.375F, 6.5F, 1F, -0.625F, -3F, 1F, -0.625F); // Box 50
		barrelModel[27].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[28].addShapeBox(-2.5F, -1.75F, -1F, 4, 1, 1, 0F,-3F, 1F, -0.375F, 6.5F, 1F, -0.375F, 6.5F, 1F, -0.625F, -3F, 1F, -0.625F, -3F, -1.625F, 0F, 6.5F, -1.625F, 0F, 6.5F, -1.625F, -0.625F, -3F, -1.625F, -0.625F); // Box 51
		barrelModel[28].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[29].addShapeBox(-2.5F, -1.75F, -1F, 4, 1, 1, 0F,-3F, 0.625F, 0F, 6.5F, 0.625F, 0F, 6.5F, 0.625F, -0.625F, -3F, 0.625F, -0.625F, -3F, -1F, 0.25F, 6.5F, -1F, 0.25F, 6.5F, -1F, -0.625F, -3F, -1F, -0.625F); // Box 52
		barrelModel[29].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[30].addShapeBox(-2.5F, -2.75F, -1F, 4, 1, 1, 0F,-3F, -1F, 0.25F, 6.5F, -1F, 0.25F, 6.5F, -1F, -0.625F, -3F, -1F, -0.625F, -3F, 0.625F, 0F, 6.5F, 0.625F, 0F, 6.5F, 0.625F, -0.625F, -3F, 0.625F, -0.625F); // Box 53
		barrelModel[30].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[31].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.225F, 0F, -0.225F, -0.5F, 0F, -0.1F, -0.5F, -0.625F, -0.5F, -0.15F, -0.75F, -0.5F, -0.275F, -0.75F, -0.275F, -0.5F, -0.75F, -0.15F); // Box 55
		barrelModel[31].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[32].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.1F, -0.225F, 0F, -0.225F, -0.15F, -0.75F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.75F, -0.15F, -0.275F, -0.75F, -0.275F); // Box 56
		barrelModel[32].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[33].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.225F, 0F, -0.225F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.275F, -0.75F, -0.275F, -0.5F, -0.75F, -0.15F, -0.5F, -0.625F, -0.5F, -0.15F, -0.75F, -0.5F); // Box 57
		barrelModel[33].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[34].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, -0.1F, -0.225F, 0F, -0.225F, -0.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.15F, -0.275F, -0.75F, -0.275F, -0.15F, -0.75F, -0.5F, -0.5F, -0.625F, -0.5F); // Box 58
		barrelModel[34].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[35].addShapeBox(-8.5F, -1.45F, -2F, 1, 1, 2, 0F,-0.15F, -0.7F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.15F, -0.7F, -0.5F, -0.15F, -0.15F, -0.25F, -0.7F, -0.15F, -0.25F, -0.7F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F); // Box 60
		barrelModel[35].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[36].addShapeBox(-8.5F, -0.75F, -2F, 1, 1, 2, 0F,-0.15F, -0.15F, -0.25F, -0.7F, -0.15F, -0.25F, -0.7F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.7F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.15F, -0.7F, -0.5F); // Box 61
		barrelModel[36].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[37].addShapeBox(-9.2F, -0.75F, -2F, 1, 1, 2, 0F,-0.7F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.75F, -0.75F, -0.25F, -0.15F, -0.7F, -0.25F, -0.15F, -0.7F, -0.5F, -0.75F, -0.75F, -0.5F); // Box 62
		barrelModel[37].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[38].addShapeBox(-9.2F, -1.45F, -2F, 1, 1, 2, 0F,-0.75F, -0.75F, -0.25F, -0.15F, -0.7F, -0.25F, -0.15F, -0.7F, -0.5F, -0.75F, -0.75F, -0.5F, -0.7F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F); // Box 63
		barrelModel[38].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[39].addShapeBox(-8.5F, -1.45F, 0F, 1, 1, 2, 0F,-0.15F, -0.7F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.25F, -0.15F, -0.7F, -0.25F, -0.15F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F); // Box 64
		barrelModel[39].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[40].addShapeBox(-8.5F, -0.75F, 0F, 1, 1, 2, 0F,-0.15F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.7F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.25F, -0.15F, -0.7F, -0.25F); // Box 64
		barrelModel[40].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[41].addShapeBox(-9.2F, -0.75F, 0F, 1, 1, 2, 0F,-0.7F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.25F, -0.7F, -0.15F, -0.25F, -0.75F, -0.75F, -0.5F, -0.15F, -0.7F, -0.5F, -0.15F, -0.7F, -0.25F, -0.75F, -0.75F, -0.25F); // Box 64
		barrelModel[41].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[42].addShapeBox(-9.2F, -1.45F, 0F, 1, 1, 2, 0F,-0.75F, -0.75F, -0.5F, -0.15F, -0.7F, -0.5F, -0.15F, -0.7F, -0.25F, -0.75F, -0.75F, -0.25F, -0.7F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.25F, -0.7F, -0.15F, -0.25F); // Box 64
		barrelModel[42].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[43].addShapeBox(-9.2F, -0.75F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.75F, 0F, -0.05F, -0.75F, 0F, -0.05F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 68
		barrelModel[43].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[44].addShapeBox(-3F, -1F, -1.87F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		barrelModel[44].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[45].addShapeBox(-3F, -1F, -1.87F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 70
		barrelModel[45].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[46].addShapeBox(-3F, -1F, -1.87F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 71
		barrelModel[46].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[47].addShapeBox(-3F, -1F, -1.87F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.125F, -0.125F, -0.9F, -0.125F, -0.125F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
		barrelModel[47].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[48].addShapeBox(-1F, -1F, -1.87F, 1, 1, 1, 0F,-0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F); // Box 172
		barrelModel[48].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[49].addShapeBox(-3.5F, -2.5F, -1F, 2, 1, 1, 0F,-0.25F, -0.55F, -0.125F, -0.5F, -0.3F, -0.125F, -0.5F, -0.3F, -0.125F, -0.25F, -0.55F, -0.125F, -0.25F, -0.05F, -0.125F, -0.5F, -0.3F, -0.125F, -0.5F, -0.3F, -0.125F, -0.25F, -0.05F, -0.125F); // Box 75
		barrelModel[49].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[50].addShapeBox(-3.5F, -2.5F, -1F, 1, 1, 1, 0F,-0.05F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F, -0.05F, -0.75F, -0.125F, -0.1F, -0.1F, -0.125F, -0.75F, -0.05F, -0.125F, -0.75F, -0.05F, -0.125F, -0.1F, -0.1F, -0.125F); // Box 0
		barrelModel[50].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[51].addShapeBox(-3.5F, -2.5F, -1F, 1, 1, 1, 0F,-0.1F, -0.6F, -0.125F, -0.75F, -0.55F, -0.125F, -0.75F, -0.55F, -0.125F, -0.1F, -0.6F, -0.125F, -0.05F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.05F, -0.25F, -0.125F); // Box 1
		barrelModel[51].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[52].addShapeBox(-2.75F, -2.75F, -1F, 1, 1, 1, 0F,-0.75F, -0.75F, -0.125F, -0.05F, -0.75F, -0.125F, -0.05F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F, -0.75F, -0.05F, -0.125F, -0.1F, -0.1F, -0.125F, -0.1F, -0.1F, -0.125F, -0.75F, -0.05F, -0.125F); // Box 2
		barrelModel[52].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[53].addShapeBox(-2.75F, -2.75F, -1F, 1, 1, 1, 0F,-0.75F, -0.55F, -0.125F, -0.1F, -0.6F, -0.125F, -0.1F, -0.6F, -0.125F, -0.75F, -0.55F, -0.125F, -0.75F, -0.25F, -0.125F, -0.05F, -0.25F, -0.125F, -0.05F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F); // Box 2
		barrelModel[53].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[54].addShapeBox(-2.75F, -2.75F, -1F, 1, 1, 1, 0F,-0.75F, -0.5F, 0F, -0.05F, -0.55F, 0F, -0.05F, -0.55F, -0.875F, -0.75F, -0.5F, -0.875F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, -0.75F, -0.25F, -0.875F); // Box 4
		barrelModel[54].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[55].addShapeBox(-2.75F, -2.25F, -1F, 1, 1, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F, -0.5F, 0F, -0.05F, -0.55F, 0F, -0.05F, -0.55F, -0.875F, -0.75F, -0.5F, -0.875F); // Box 5
		barrelModel[55].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[56].addShapeBox(-2.25F, -2.25F, -1F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.875F, 0F, -0.25F, -0.875F, -0.05F, -0.55F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.875F, -0.05F, -0.55F, -0.875F); // Box 6
		barrelModel[56].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[57].addShapeBox(-2.25F, -2.75F, -1F, 1, 1, 1, 0F,-0.05F, -0.55F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.875F, -0.05F, -0.55F, -0.875F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.875F, 0F, -0.25F, -0.875F); // Box 7
		barrelModel[57].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[58].addShapeBox(-5F, -3.75F, -0.5F, 3, 1, 1, 0F,0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 8
		barrelModel[58].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[59].addShapeBox(-4F, -4.25F, -0.5F, 2, 1, 1, 0F,0.25F, -0.625F, -0.125F, -0.75F, -0.75F, -0.125F, -0.75F, -0.75F, -0.625F, 0.25F, -0.625F, -0.625F, 0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0.25F, 0F, -0.625F); // Box 9
		barrelModel[59].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[60].addShapeBox(-5F, -4.25F, -0.5F, 1, 1, 1, 0F,-0.125F, -0.75F, -0.125F, -0.25F, -0.625F, -0.125F, -0.25F, -0.625F, -0.625F, -0.125F, -0.75F, -0.625F, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, 0F, 0F, -0.625F); // Box 10
		barrelModel[60].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[61].addShapeBox(-4F, -4.25F, -0.5F, 2, 1, 1, 0F,0.25F, -0.625F, -0.625F, -0.75F, -0.75F, -0.625F, -0.75F, -0.75F, -0.125F, 0.25F, -0.625F, -0.125F, 0.25F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0.25F, 0F, -0.125F); // Box 11
		barrelModel[61].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[62].addShapeBox(-5F, -4.25F, -0.5F, 1, 1, 1, 0F,-0.125F, -0.75F, -0.625F, -0.25F, -0.625F, -0.625F, -0.25F, -0.625F, -0.125F, -0.125F, -0.75F, -0.125F, 0F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 12
		barrelModel[62].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[63].addShapeBox(-4.5F, -4.25F, -0.5F, 1, 1, 1, 0F,-0.125F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F, -0.125F, -0.75F, -0.125F, -0.125F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 13
		barrelModel[63].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[64].addShapeBox(-4.5F, -4.25F, -0.5F, 1, 1, 1, 0F,-0.125F, -0.55F, -0.11F, -0.75F, -0.55F, -0.11F, -0.75F, -0.55F, -0.53F, -0.125F, -0.55F, -0.53F, -0.125F, -0.25F, -0.12F, -0.75F, -0.25F, -0.12F, -0.75F, -0.1F, -0.53F, -0.125F, -0.1F, -0.53F); // Box 14
		barrelModel[64].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[65].addShapeBox(-4.5F, -4.25F, -0.5F, 1, 1, 1, 0F,-0.125F, -0.55F, -0.53F, -0.75F, -0.55F, -0.53F, -0.75F, -0.55F, -0.11F, -0.125F, -0.55F, -0.11F, -0.125F, -0.1F, -0.53F, -0.75F, -0.1F, -0.53F, -0.75F, -0.25F, -0.12F, -0.125F, -0.25F, -0.12F); // Box 15
		barrelModel[65].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[66].addShapeBox(-4.75F, -4F, 0.25F, 1, 1, 1, 0F,-0.15F, -0.65F, -0.125F, -0.75F, -0.6F, -0.125F, -0.75F, -0.6F, -0.125F, -0.15F, -0.65F, -0.125F, -0.1F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.1F, -0.25F, -0.125F); // Box 16
		barrelModel[66].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[67].addShapeBox(-4.75F, -3.5F, 0.25F, 1, 1, 1, 0F,-0.1F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.1F, -0.25F, -0.125F, -0.15F, -0.65F, -0.125F, -0.75F, -0.6F, -0.125F, -0.75F, -0.6F, -0.125F, -0.15F, -0.65F, -0.125F); // Box 17
		barrelModel[67].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[68].addShapeBox(-5.25F, -4F, 0.25F, 1, 1, 1, 0F,-0.75F, -0.6F, -0.125F, -0.15F, -0.65F, -0.125F, -0.15F, -0.65F, -0.125F, -0.75F, -0.6F, -0.125F, -0.75F, -0.25F, -0.125F, -0.1F, -0.25F, -0.125F, -0.1F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F); // Box 18
		barrelModel[68].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[69].addShapeBox(-5.25F, -3.5F, 0.25F, 1, 1, 1, 0F,-0.75F, -0.25F, -0.125F, -0.1F, -0.25F, -0.125F, -0.1F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.6F, -0.125F, -0.15F, -0.65F, -0.125F, -0.15F, -0.65F, -0.125F, -0.75F, -0.6F, -0.125F); // Box 19
		barrelModel[69].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[70].addShapeBox(-5.25F, -3.5F, 0.25F, 1, 1, 1, 0F,-0.75F, -0.25F, -0.8F, -0.025F, -0.25F, -0.8F, -0.025F, -0.25F, -0.075F, -0.75F, -0.25F, -0.075F, -0.75F, -0.525F, -0.8F, -0.075F, -0.575F, -0.8F, -0.075F, -0.575F, -0.075F, -0.75F, -0.525F, -0.075F); // Box 20
		barrelModel[70].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[71].addShapeBox(-5.25F, -4F, 0.25F, 1, 1, 1, 0F,-0.75F, -0.525F, -0.8F, -0.075F, -0.575F, -0.8F, -0.075F, -0.575F, -0.075F, -0.75F, -0.525F, -0.075F, -0.75F, -0.25F, -0.8F, -0.025F, -0.25F, -0.8F, -0.025F, -0.25F, -0.075F, -0.75F, -0.25F, -0.075F); // Box 21
		barrelModel[71].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[72].addShapeBox(-4.75F, -4F, 0.25F, 1, 1, 1, 0F,-0.075F, -0.575F, -0.8F, -0.75F, -0.525F, -0.8F, -0.75F, -0.525F, -0.075F, -0.075F, -0.575F, -0.075F, -0.025F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, -0.075F, -0.025F, -0.25F, -0.075F); // Box 22
		barrelModel[72].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[73].addShapeBox(-4.75F, -3.5F, 0.25F, 1, 1, 1, 0F,-0.025F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, -0.075F, -0.025F, -0.25F, -0.075F, -0.075F, -0.575F, -0.8F, -0.75F, -0.525F, -0.8F, -0.75F, -0.525F, -0.075F, -0.075F, -0.575F, -0.075F); // Box 23
		barrelModel[73].setRotationPoint(0F, 3.5F, -0.15F);

		barrelModel[74].addShapeBox(-5F, 0F, -1F, 2, 2, 1, 0F,-0.5F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.75F, -0.875F, -0.25F, -0.875F, -0.875F, -0.25F, -0.875F, -0.875F, -0.625F, -0.75F, -0.875F, -0.625F); // Box 44
		barrelModel[74].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[75].addShapeBox(-5F, 0.25F, -1F, 2, 2, 1, 0F,-0.75F, -0.875F, -0.25F, -0.875F, -0.875F, -0.25F, -0.875F, -0.875F, -0.625F, -0.75F, -0.875F, -0.625F, -1.625F, 0F, -0.25F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, -0.625F, -1.625F, 0F, -0.625F); // Box 45
		barrelModel[75].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[76].addShapeBox(-3.75F, 0.25F, -1F, 2, 2, 1, 0F,-0.375F, -1.5F, -0.25F, -1.625F, -1.5F, -0.25F, -1.625F, -1.5F, -0.625F, -0.375F, -1.5F, -0.625F, -0.375F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.625F, -0.375F, 0F, -0.625F); // Box 46
		barrelModel[76].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[77].addShapeBox(-3.75F, 2.25F, -1F, 2, 2, 1, 0F,-0.875F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.625F, -0.875F, 0F, -0.625F, -0.375F, -2F, -0.25F, -0.5F, -1.125F, -0.25F, -0.5F, -1.125F, -0.625F, -0.375F, -2F, -0.625F); // Box 48
		barrelModel[77].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[78].addShapeBox(-2.75F, 2.25F, -1F, 2, 2, 1, 0F,-0.5F, -0.5F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.625F, -0.5F, -0.5F, -0.625F, -0.5F, -1.125F, -0.25F, -0.375F, -0.875F, -0.25F, -0.375F, -0.875F, -0.625F, -0.5F, -1.125F, -0.625F); // Box 50
		barrelModel[78].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[79].addShapeBox(-5F, -2F, -1F, 2, 2, 1, 0F,-0.5F, -0.875F, -0.25F, -1.125F, -0.875F, -0.25F, -1.125F, -0.875F, -0.625F, -0.5F, -0.875F, -0.625F, -0.5F, 0F, -0.25F, -1.125F, 0F, -0.25F, -1.125F, 0F, -0.625F, -0.5F, 0F, -0.625F); // Box 0
		barrelModel[79].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[80].addShapeBox(-4.5F, -3.5F, -1F, 5, 3, 2, 0F,0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.25F, 0F, -0.125F); // Box 1
		barrelModel[80].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[81].addShapeBox(-5.5F, -3.5F, -1F, 1, 3, 2, 0F,-0.375F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.375F, -0.5F, -0.125F, -0.375F, -0.075F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, -0.075F, -0.125F); // Box 2
		barrelModel[81].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[82].addShapeBox(-5F, -2F, 0F, 2, 2, 1, 0F,-0.5F, -0.875F, -0.625F, -1.125F, -0.875F, -0.625F, -1.125F, -0.875F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, 0F, -0.625F, -1.125F, 0F, -0.625F, -1.125F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 3
		barrelModel[82].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[83].addShapeBox(-5F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.625F, -1.125F, 0F, -0.625F, -1.125F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.75F, -0.875F, -0.625F, -0.875F, -0.875F, -0.625F, -0.875F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F); // Box 4
		barrelModel[83].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[84].addShapeBox(-5F, 0.25F, 0F, 2, 2, 1, 0F,-0.75F, -0.875F, -0.625F, -0.875F, -0.875F, -0.625F, -0.875F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, -1.625F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.25F, -1.625F, 0F, -0.25F); // Box 5
		barrelModel[84].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[85].addShapeBox(-3.75F, 0.25F, 0F, 2, 2, 1, 0F,-0.375F, -1.5F, -0.625F, -1.625F, -1.5F, -0.625F, -1.625F, -1.5F, -0.25F, -0.375F, -1.5F, -0.25F, -0.375F, 0F, -0.625F, -1.125F, 0F, -0.625F, -1.125F, 0F, -0.25F, -0.375F, 0F, -0.25F); // Box 6
		barrelModel[85].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[86].addShapeBox(-3.75F, 2.25F, 0F, 2, 2, 1, 0F,-0.875F, 0F, -0.625F, -0.5F, -0.5F, -0.625F, -0.5F, -0.5F, -0.25F, -0.875F, 0F, -0.25F, -0.375F, -2F, -0.625F, -0.5F, -1.125F, -0.625F, -0.5F, -1.125F, -0.25F, -0.375F, -2F, -0.25F); // Box 7
		barrelModel[86].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[87].addShapeBox(-2.75F, 2.25F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, -0.625F, -0.375F, -0.75F, -0.625F, -0.375F, -0.75F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -1.125F, -0.625F, -0.375F, -0.875F, -0.625F, -0.375F, -0.875F, -0.25F, -0.5F, -1.125F, -0.25F); // Box 8
		barrelModel[87].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[88].addShapeBox(-3.65F, -1.75F, 0F, 4, 1, 1, 0F,0.25F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 9
		barrelModel[88].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[89].addShapeBox(-3.65F, -2.25F, 0F, 4, 1, 1, 0F,0.2F, -0.3F, -0.125F, 0F, -0.3F, -0.125F, 0F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0.2F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F); // Box 10
		barrelModel[89].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[90].addShapeBox(-3.65F, -1.75F, 0F, 1, 1, 1, 0F,0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, 0F, 0.25F, 0F, 0F); // Box 18
		barrelModel[90].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[91].addShapeBox(-0.9F, -1.75F, 0F, 1, 1, 1, 0F,0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.125F, 0.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0.125F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, 0F, 0.125F, 0F, 0F); // Box 19
		barrelModel[91].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[92].addShapeBox(-1.25F, -1F, -1.87F, 1, 1, 1, 0F,0.65F, -0.5F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, -0.95F, 0.65F, -0.5F, -0.95F, 0.65F, -0.125F, 0.05F, -0.875F, -0.125F, 0.05F, -0.875F, -0.125F, -1F, 0.65F, -0.125F, -1F); // Box 20
		barrelModel[92].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[93].addShapeBox(-1.25F, -1F, -1.87F, 1, 1, 1, 0F,-0.275F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, -0.95F, -0.275F, -0.5F, -0.95F, -0.275F, -0.125F, 0.05F, 0.05F, -0.125F, 0.05F, 0.05F, -0.125F, -1F, -0.275F, -0.125F, -1F); // Box 21
		barrelModel[93].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[94].addShapeBox(7.25F, -1.75F, -0.75F, 1, 1, 1, 0F,-0.25F, 1.325F, -0.625F, -0.665F, 1.325F, -0.665F, -0.625F, 1.325F, -0.25F, -0.25F, 1.325F, -0.25F, -0.25F, -1.625F, -0.625F, -0.665F, -1.625F, -0.665F, -0.625F, -1.625F, -0.25F, -0.25F, -1.625F, -0.25F); // Box 23
		barrelModel[94].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[95].addShapeBox(7.25F, -1.75F, -0.25F, 1, 1, 1, 0F,-0.25F, 1.325F, -0.25F, -0.625F, 1.325F, -0.25F, -0.665F, 1.325F, -0.665F, -0.25F, 1.325F, -0.625F, -0.25F, -1.625F, -0.25F, -0.625F, -1.625F, -0.25F, -0.665F, -1.625F, -0.665F, -0.25F, -1.625F, -0.625F); // Box 24
		barrelModel[95].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[96].addShapeBox(6.75F, -1.75F, -0.25F, 1, 1, 1, 0F,-0.625F, 1.325F, -0.25F, -0.25F, 1.325F, -0.25F, -0.25F, 1.325F, -0.625F, -0.665F, 1.325F, -0.665F, -0.625F, -1.625F, -0.25F, -0.25F, -1.625F, -0.25F, -0.25F, -1.625F, -0.625F, -0.665F, -1.625F, -0.665F); // Box 25
		barrelModel[96].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[97].addShapeBox(6.75F, -1.75F, -0.75F, 1, 1, 1, 0F,-0.665F, 1.325F, -0.665F, -0.25F, 1.325F, -0.625F, -0.25F, 1.325F, -0.25F, -0.625F, 1.325F, -0.25F, -0.665F, -1.625F, -0.665F, -0.25F, -1.625F, -0.625F, -0.25F, -1.625F, -0.25F, -0.625F, -1.625F, -0.25F); // Box 26
		barrelModel[97].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[98].addShapeBox(-2.65F, -0.5F, -2.2F, 3, 1, 1, 0F,-1.025F, -0.25F, -0.625F, -0.975F, -0.25F, -0.625F, -0.975F, -0.25F, -0.275F, -1.025F, -0.25F, -0.275F, -1.025F, -0.25F, -0.625F, -0.975F, -0.25F, -0.625F, -0.975F, -0.25F, -0.275F, -1.025F, -0.25F, -0.275F); // Box 1
		barrelModel[98].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[99].addShapeBox(-2.65F, -0.5F, -2F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[99].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[100].addShapeBox(-2.65F, -0.5F, -2F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 1
		barrelModel[100].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[101].addShapeBox(-2.65F, -0.5F, -2F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 1
		barrelModel[101].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[102].addShapeBox(-2.65F, -0.5F, -2F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 1
		barrelModel[102].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[103].addShapeBox(-2.65F, -0.5F, -2F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 1
		barrelModel[103].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[104].addShapeBox(-2.65F, -0.5F, -2F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[104].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[105].addShapeBox(-2.65F, -0.5F, -2F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[105].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[106].addShapeBox(-2.65F, -0.5F, -2F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[106].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[107].addShapeBox(-0.9F, -0.5F, -2F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[107].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[108].addShapeBox(-0.9F, -0.5F, -2F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[108].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[109].addShapeBox(-0.9F, -0.5F, -2F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 1
		barrelModel[109].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[110].addShapeBox(-0.9F, -0.5F, -2F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[110].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[111].addShapeBox(-2.65F, 0F, -2.4F, 3, 1, 1, 0F,-1.025F, -0.25F, -0.825F, -0.975F, -0.25F, -0.825F, -0.975F, -0.25F, -0.075F, -1.025F, -0.25F, -0.075F, -1.025F, -0.25F, -0.625F, -0.975F, -0.25F, -0.625F, -0.975F, -0.25F, -0.275F, -1.025F, -0.25F, -0.275F); // Box 1
		barrelModel[111].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[112].addShapeBox(-2.65F, 0F, -2.2F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[112].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[113].addShapeBox(-2.65F, 0F, -2.2F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 1
		barrelModel[113].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[114].addShapeBox(-2.65F, 0F, -2.2F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 1
		barrelModel[114].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[115].addShapeBox(-2.65F, 0F, -2.2F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 1
		barrelModel[115].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[116].addShapeBox(-2.65F, 0F, -2.2F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 1
		barrelModel[116].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[117].addShapeBox(-2.65F, 0F, -2.2F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[117].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[118].addShapeBox(-2.65F, 0F, -2.2F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[118].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[119].addShapeBox(-2.65F, 0F, -2.2F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[119].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[120].addShapeBox(-0.9F, 0F, -2.2F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[120].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[121].addShapeBox(-0.9F, 0F, -2.2F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[121].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[122].addShapeBox(-0.9F, 0F, -2.2F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[122].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[123].addShapeBox(-0.9F, 0F, -2.2F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[123].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[124].addShapeBox(-2.65F, 0.5F, -2.6F, 3, 1, 1, 0F,-1.025F, -0.25F, -0.825F, -0.975F, -0.25F, -0.825F, -0.975F, -0.25F, -0.075F, -1.025F, -0.25F, -0.075F, -1.025F, -0.25F, -0.575F, -0.975F, -0.25F, -0.575F, -0.975F, -0.25F, -0.325F, -1.025F, -0.25F, -0.325F); // Box 1
		barrelModel[124].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[125].addShapeBox(-2.65F, 0.5F, -2.4F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[125].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[126].addShapeBox(-2.65F, 0.5F, -2.4F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 1
		barrelModel[126].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[127].addShapeBox(-2.65F, 0.5F, -2.4F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 1
		barrelModel[127].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[128].addShapeBox(-2.65F, 0.5F, -2.4F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 1
		barrelModel[128].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[129].addShapeBox(-2.65F, 0.5F, -2.4F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 1
		barrelModel[129].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[130].addShapeBox(-2.65F, 0.5F, -2.4F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[130].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[131].addShapeBox(-2.65F, 0.5F, -2.4F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[131].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[132].addShapeBox(-2.65F, 0.5F, -2.4F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[132].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[133].addShapeBox(-0.9F, 0.5F, -2.4F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[133].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[134].addShapeBox(-0.9F, 0.5F, -2.4F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[134].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[135].addShapeBox(-0.9F, 0.5F, -2.4F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[135].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[136].addShapeBox(-0.9F, 0.5F, -2.4F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[136].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[137].addShapeBox(-2.65F, 1F, -2.8F, 3, 1, 1, 0F,-1.025F, -0.25F, -0.775F, -0.975F, -0.25F, -0.775F, -0.975F, -0.25F, -0.125F, -1.025F, -0.25F, -0.125F, -1.025F, -0.25F, -0.525F, -0.975F, -0.25F, -0.525F, -0.975F, -0.25F, -0.375F, -1.025F, -0.25F, -0.375F); // Box 172
		barrelModel[137].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[138].addShapeBox(-2.65F, 1F, -2.6F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[138].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[139].addShapeBox(-2.65F, 1F, -2.6F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 1
		barrelModel[139].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[140].addShapeBox(-2.65F, 1F, -2.6F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 1
		barrelModel[140].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[141].addShapeBox(-2.65F, 1F, -2.6F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 1
		barrelModel[141].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[142].addShapeBox(-2.65F, 1F, -2.6F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 1
		barrelModel[142].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[143].addShapeBox(-2.65F, 1F, -2.6F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[143].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[144].addShapeBox(-2.65F, 1F, -2.6F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[144].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[145].addShapeBox(-2.65F, 1F, -2.6F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[145].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[146].addShapeBox(-0.9F, 1F, -2.6F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[146].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[147].addShapeBox(-0.9F, 1F, -2.6F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[147].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[148].addShapeBox(-0.9F, 1F, -2.6F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[148].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[149].addShapeBox(-0.9F, 1F, -2.6F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[149].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[150].addShapeBox(-2.5F, 2.5F, -12F, 3, 4, 6, 0F,-0.25F, -0.2F, -0.125F, -0.25F, -0.2F, -0.125F, -0.25F, -0.2F, -0.125F, -0.25F, -0.2F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 2
		barrelModel[150].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[151].addShapeBox(-2.65F, 1.5F, -3F, 3, 1, 1, 0F,-1.025F, -0.25F, -0.725F, -0.975F, -0.25F, -0.725F, -0.975F, -0.25F, -0.175F, -1.025F, -0.25F, -0.175F, -1.025F, -0.25F, -0.575F, -0.975F, -0.25F, -0.575F, -0.975F, -0.25F, -0.325F, -1.025F, -0.25F, -0.325F); // Box 172
		barrelModel[151].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[152].addShapeBox(-2.65F, 1.5F, -2.8F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[152].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[153].addShapeBox(-2.65F, 1.5F, -2.8F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[153].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[154].addShapeBox(-2.65F, 1.5F, -2.8F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 55
		barrelModel[154].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[155].addShapeBox(-2.65F, 1.5F, -2.8F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 55
		barrelModel[155].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[156].addShapeBox(-2.65F, 1.5F, -2.8F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[156].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[157].addShapeBox(-2.65F, 1.5F, -2.8F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[157].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[158].addShapeBox(-2.65F, 1.5F, -2.8F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[158].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[159].addShapeBox(-2.65F, 1.5F, -2.8F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[159].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[160].addShapeBox(-0.9F, 1.5F, -2.8F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[160].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[161].addShapeBox(-0.9F, 1.5F, -2.8F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[161].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[162].addShapeBox(-0.9F, 1.5F, -2.8F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[162].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[163].addShapeBox(-0.9F, 1.5F, -2.8F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[163].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[164].addShapeBox(-2.65F, 2F, -3.2F, 3, 1, 1, 0F,-1.025F, -0.35F, -0.775F, -0.975F, -0.35F, -0.775F, -0.975F, -0.35F, -0.225F, -1.025F, -0.35F, -0.225F, -1.025F, -0.55F, -0.475F, -0.975F, -0.55F, -0.475F, -0.975F, -0.45F, -0.525F, -1.025F, -0.45F, -0.525F); // Box 68
		barrelModel[164].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[165].addShapeBox(-2.65F, 1.9F, -3.1F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[165].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[166].addShapeBox(-2.65F, 1.9F, -3.1F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[166].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[167].addShapeBox(-2.65F, 1.9F, -3.1F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 172
		barrelModel[167].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[168].addShapeBox(-2.65F, 1.9F, -3.1F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 172
		barrelModel[168].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[169].addShapeBox(-2.65F, 1.9F, -3.1F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[169].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[170].addShapeBox(-2.65F, 1.9F, -3.1F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[170].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[171].addShapeBox(-2.65F, 1.9F, -3.1F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[171].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[172].addShapeBox(-2.65F, 1.9F, -3.1F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[172].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[173].addShapeBox(-0.9F, 1.9F, -3.1F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[173].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[174].addShapeBox(-0.9F, 1.9F, -3.1F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[174].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[175].addShapeBox(-0.9F, 1.9F, -3.1F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[175].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[176].addShapeBox(-0.9F, 1.9F, -3.1F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[176].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[177].addShapeBox(-2.65F, 2F, -4.7F, 3, 1, 2, 0F,-1.025F, -0.45F, 2.625F, -0.975F, -0.45F, 2.625F, -0.975F, -0.45F, -0.025F, -1.025F, -0.45F, -0.025F, -1.025F, -0.45F, 2.625F, -0.975F, -0.45F, 2.625F, -0.975F, -0.45F, -0.025F, -1.025F, -0.45F, -0.025F); // Box 172
		barrelModel[177].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[178].addShapeBox(-2.65F, 2F, -3.5F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[178].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[179].addShapeBox(-2.65F, 2F, -3.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[179].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[180].addShapeBox(-2.65F, 2F, -3.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 172
		barrelModel[180].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[181].addShapeBox(-2.65F, 2F, -3.5F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 172
		barrelModel[181].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[182].addShapeBox(-2.65F, 2F, -3.5F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[182].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[183].addShapeBox(-2.65F, 2F, -3.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[183].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[184].addShapeBox(-2.65F, 2F, -3.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[184].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[185].addShapeBox(-2.65F, 2F, -3.5F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[185].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[186].addShapeBox(-0.9F, 2F, -3.5F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[186].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[187].addShapeBox(-0.9F, 2F, -3.5F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[187].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[188].addShapeBox(-0.9F, 2F, -3.5F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[188].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[189].addShapeBox(-0.9F, 2F, -3.5F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[189].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[190].addShapeBox(-2.65F, 2F, -4F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[190].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[191].addShapeBox(-2.65F, 2F, -4F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[191].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[192].addShapeBox(-2.65F, 2F, -4F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 97
		barrelModel[192].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[193].addShapeBox(-2.65F, 2F, -4F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 98
		barrelModel[193].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[194].addShapeBox(-2.65F, 2F, -4F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[194].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[195].addShapeBox(-2.65F, 2F, -4F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[195].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[196].addShapeBox(-2.65F, 2F, -4F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[196].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[197].addShapeBox(-2.65F, 2F, -4F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[197].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[198].addShapeBox(-0.9F, 2F, -4F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[198].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[199].addShapeBox(-0.9F, 2F, -4F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[199].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[200].addShapeBox(-0.9F, 2F, -4F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[200].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[201].addShapeBox(-0.9F, 2F, -4F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[201].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[202].addShapeBox(-2.65F, 2F, -4.5F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[202].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[203].addShapeBox(-2.65F, 2F, -4.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[203].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[204].addShapeBox(-2.65F, 2F, -4.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 110
		barrelModel[204].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[205].addShapeBox(-2.65F, 2F, -4.5F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 172
		barrelModel[205].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[206].addShapeBox(-2.65F, 2F, -4.5F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[206].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[207].addShapeBox(-2.65F, 2F, -4.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[207].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[208].addShapeBox(-2.65F, 2F, -4.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[208].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[209].addShapeBox(-2.65F, 2F, -4.5F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[209].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[210].addShapeBox(-0.9F, 2F, -4.5F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[210].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[211].addShapeBox(-0.9F, 2F, -4.5F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[211].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[212].addShapeBox(-0.9F, 2F, -4.5F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[212].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[213].addShapeBox(-0.9F, 2F, -4.5F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[213].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[214].addShapeBox(-2.65F, 2F, -5F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[214].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[215].addShapeBox(-2.65F, 2F, -5F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[215].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[216].addShapeBox(-2.65F, 2F, -5F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 123
		barrelModel[216].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[217].addShapeBox(-2.65F, 2F, -5F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 172
		barrelModel[217].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[218].addShapeBox(-2.65F, 2F, -5F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[218].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[219].addShapeBox(-2.65F, 2F, -5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[219].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[220].addShapeBox(-2.65F, 2F, -5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[220].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[221].addShapeBox(-2.65F, 2F, -5F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[221].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[222].addShapeBox(-0.9F, 2F, -5F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[222].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[223].addShapeBox(-0.9F, 2F, -5F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[223].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[224].addShapeBox(-0.9F, 2F, -5F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[224].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[225].addShapeBox(-0.9F, 2F, -5F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[225].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[226].addShapeBox(-2.65F, 2F, -5.5F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[226].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[227].addShapeBox(-2.65F, 2F, -5.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[227].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[228].addShapeBox(-2.65F, 2F, -5.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 136
		barrelModel[228].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[229].addShapeBox(-2.65F, 2F, -5.5F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 172
		barrelModel[229].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[230].addShapeBox(-2.65F, 2F, -5.5F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[230].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[231].addShapeBox(-2.65F, 2F, -5.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[231].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[232].addShapeBox(-2.65F, 2F, -5.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[232].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[233].addShapeBox(-2.65F, 2F, -5.5F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[233].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[234].addShapeBox(-0.9F, 2F, -5.5F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[234].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[235].addShapeBox(-0.9F, 2F, -5.5F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[235].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[236].addShapeBox(-0.9F, 2F, -5.5F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[236].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[237].addShapeBox(-0.9F, 2F, -5.5F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[237].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[238].addShapeBox(-2.65F, 2F, -6.5F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[238].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[239].addShapeBox(-2.65F, 2F, -6.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[239].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[240].addShapeBox(-2.65F, 2F, -6.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 149
		barrelModel[240].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[241].addShapeBox(-2.65F, 2F, -6.5F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 172
		barrelModel[241].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[242].addShapeBox(-2.65F, 2F, -6.5F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[242].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[243].addShapeBox(-2.65F, 2F, -6.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[243].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[244].addShapeBox(-2.65F, 2F, -6.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[244].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[245].addShapeBox(-2.65F, 2F, -6.5F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[245].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[246].addShapeBox(-0.9F, 2F, -6.5F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[246].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[247].addShapeBox(-0.9F, 2F, -6.5F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[247].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[248].addShapeBox(-0.9F, 2F, -6.5F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[248].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[249].addShapeBox(-0.9F, 2F, -6.5F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[249].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[250].addShapeBox(-2.65F, 2F, -6F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[250].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[251].addShapeBox(-2.65F, 2F, -6F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[251].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[252].addShapeBox(-2.65F, 2F, -6F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 162
		barrelModel[252].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[253].addShapeBox(-2.65F, 2F, -6F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 172
		barrelModel[253].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[254].addShapeBox(-2.65F, 2F, -6F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[254].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[255].addShapeBox(-2.65F, 2F, -6F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[255].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[256].addShapeBox(-2.65F, 2F, -6F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 166
		barrelModel[256].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[257].addShapeBox(-2.65F, 2F, -6F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[257].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[258].addShapeBox(-0.9F, 2F, -6F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[258].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[259].addShapeBox(-0.9F, 2F, -6F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[259].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[260].addShapeBox(-0.9F, 2F, -6F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[260].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[261].addShapeBox(-0.9F, 2F, -6F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[261].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[262].addShapeBox(-2.5F, 2.5F, -12F, 3, 1, 6, 0F,-0.2F, 0F, -0.075F, -0.2F, 0F, -0.075F, -0.2F, 1F, -0.075F, -0.2F, 1F, -0.075F, -0.2F, -0.25F, -0.075F, -0.2F, -0.25F, -0.075F, -0.2F, -1.25F, -0.075F, -0.2F, -1.25F, -0.075F); // Box 172
		barrelModel[262].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[263].addShapeBox(-2.65F, 2F, -3.2F, 3, 1, 1, 0F,-1.025F, -0.25F, -0.775F, -0.975F, -0.25F, -0.775F, -0.975F, -0.25F, -0.125F, -1.025F, -0.25F, -0.125F, -1.025F, -0.5F, -0.5F, -0.975F, -0.5F, -0.5F, -0.975F, -0.4F, -0.4F, -1.025F, -0.4F, -0.4F); // Box 172
		barrelModel[263].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[264].addShapeBox(-2.65F, 2F, -7F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[264].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[265].addShapeBox(-2.65F, 2F, -7F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[265].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[266].addShapeBox(-2.65F, 2F, -7F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 174
		barrelModel[266].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[267].addShapeBox(-2.65F, 2F, -7F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 172
		barrelModel[267].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[268].addShapeBox(-2.65F, 2F, -7F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[268].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[269].addShapeBox(-2.65F, 2F, -7F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[269].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[270].addShapeBox(-2.65F, 2F, -7F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[270].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[271].addShapeBox(-2.65F, 2F, -7F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[271].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[272].addShapeBox(-0.9F, 2F, -7F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[272].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[273].addShapeBox(-0.9F, 2F, -7F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[273].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[274].addShapeBox(-0.9F, 2F, -7F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[274].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[275].addShapeBox(-0.9F, 2F, -7F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[275].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[276].addShapeBox(-2.65F, 2F, -7.5F, 3, 1, 1, 0F,-0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F, -0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F); // Box 172
		barrelModel[276].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[277].addShapeBox(-2.65F, 2F, -7.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F, -1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F); // Box 172
		barrelModel[277].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[278].addShapeBox(-2.65F, 2F, -7.5F, 3, 1, 1, 0F,-1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F); // Box 172
		barrelModel[278].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[279].addShapeBox(-2.65F, 2F, -7.5F, 3, 1, 1, 0F,-1F, -0.36F, -0.36F, -0.95F, -0.36F, -0.36F, -0.95F, -0.31F, -0.5F, -1F, -0.31F, -0.5F, -1F, -0.5F, -0.31F, -0.95F, -0.5F, -0.31F, -0.95F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 189
		barrelModel[279].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[280].addShapeBox(-2.65F, 2F, -7.5F, 3, 1, 1, 0F,-1F, -0.31F, -0.5F, -0.95F, -0.31F, -0.5F, -0.95F, -0.36F, -0.36F, -1F, -0.36F, -0.36F, -1F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -0.95F, -0.5F, -0.31F, -1F, -0.5F, -0.31F); // Box 172
		barrelModel[280].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[281].addShapeBox(-2.65F, 2F, -7.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.32F, -0.9F, -0.5F, -0.32F, -0.9F, -0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, -0.37F, -0.37F, -0.9F, -0.37F, -0.37F, -0.9F, -0.32F, -0.5F, -0.8F, -0.32F, -0.5F); // Box 172
		barrelModel[281].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[282].addShapeBox(-2.65F, 2F, -7.5F, 3, 1, 1, 0F,-0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F, -0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F); // Box 172
		barrelModel[282].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[283].addShapeBox(-2.65F, 2F, -7.5F, 3, 1, 1, 0F,-0.8F, -0.32F, -0.5F, -0.9F, -0.32F, -0.5F, -0.9F, -0.37F, -0.37F, -0.8F, -0.37F, -0.37F, -0.8F, -0.5F, -0.5F, -0.9F, -0.5F, -0.5F, -0.9F, -0.5F, -0.32F, -0.8F, -0.5F, -0.32F); // Box 172
		barrelModel[283].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[284].addShapeBox(-0.9F, 2F, -7.5F, 1, 1, 1, 0F,-0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F, -0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F); // Box 172
		barrelModel[284].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[285].addShapeBox(-0.9F, 2F, -7.5F, 1, 1, 1, 0F,-0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F); // Box 172
		barrelModel[285].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[286].addShapeBox(-0.9F, 2F, -7.5F, 1, 1, 1, 0F,-0.55F, -0.38F, -0.5F, -0.65F, -0.34F, -0.5F, -0.65F, -0.39F, -0.39F, -0.55F, -0.43F, -0.43F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.34F, -0.55F, -0.5F, -0.38F); // Box 172
		barrelModel[286].setRotationPoint(0F, 3.5F, 0F);

		barrelModel[287].addShapeBox(-0.9F, 2F, -7.5F, 1, 1, 1, 0F,-0.55F, -0.43F, -0.43F, -0.65F, -0.39F, -0.39F, -0.65F, -0.34F, -0.5F, -0.55F, -0.38F, -0.5F, -0.55F, -0.5F, -0.38F, -0.65F, -0.5F, -0.34F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F); // Box 172
		barrelModel[287].setRotationPoint(0F, 3.5F, 0F);
	}
}