//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Adrian
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAdrianRussian extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelAdrianRussian() //Same as Filename
	{
		headModel = new ModelRendererTurbo[46];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 28
		headModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 29
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 31
		headModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 32
		headModel[7] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 34
		headModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 35
		headModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 36
		headModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 37
		headModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 38
		headModel[12] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 39
		headModel[13] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 40
		headModel[14] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 41
		headModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 42
		headModel[16] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 43
		headModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		headModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 45
		headModel[19] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 47
		headModel[20] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 48
		headModel[21] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 23
		headModel[22] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 29
		headModel[23] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 30
		headModel[24] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 31
		headModel[25] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 32
		headModel[26] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 34
		headModel[27] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 35
		headModel[28] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 36
		headModel[29] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 37
		headModel[30] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 38
		headModel[31] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 39
		headModel[32] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 40
		headModel[33] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 41
		headModel[34] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 42
		headModel[35] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 43
		headModel[36] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 44
		headModel[37] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 45
		headModel[38] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 46
		headModel[39] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 47
		headModel[40] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 48
		headModel[41] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 49
		headModel[42] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 50
		headModel[43] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 51
		headModel[44] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 52
		headModel[45] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 53

		headModel[0].addShapeBox(-4F, -8F, -4F, 2, 2, 8, 0F,0.2F, 0.6F, -0.5F, 1F, 0.6F, 0.2F, 1F, -0.1F, 0.8F, 0.2F, -0.1F, 0.3F, 0.9F, -0.5F, 0.7F, 0F, -0.5F, 1.7F, 0F, 0.3F, 1.5F, 0.9F, 0.3F, 1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.9F, -4F, 2, 1, 8, 0F,-1.2F, -0.3F, -2.5F, 1F, 0F, -2.2F, 1F, -0.6F, -0.7F, -1.2F, -0.8F, -1.2F, 0.2F, 0.3F, -0.5F, 1F, 0.3F, 0.2F, 1F, 1F, 0.8F, 0.2F, 1F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.5F, -4F, 1, 2, 8, 0F,0.9F, 0F, 0.7F, 1F, 0F, 1.7F, 1F, -0.8F, 1.5F, 0.9F, -0.8F, 1F, 0.9F, -0.4F, 0.9F, 1F, -0.8F, 1.9F, 1F, 1.2F, 1.4F, 0.9F, 1F, 0.9F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5.4F, 0F, 1, 1, 5, 0F,0.9F, -1.2F, 0F, 1F, -1.3F, 0F, 1F, -2.1F, 0.4F, 0.9F, -1.9F, -0.1F, 1.7F, 0.9F, 0F, 1.3F, 0.5F, 0F, 1.3F, 2.8F, 1.1F, 1.3F, 2.2F, 0.3F); // Box 28
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -5.4F, -5F, 1, 1, 5, 0F,0.8F, -0.5F, -0.1F, 1F, -0.1F, 0.9F, 1F, -1.3F, 0F, 0.9F, -1.2F, 0F, 1.3F, 0.2F, 1.2F, 1F, -0.3F, 2.8F, 1F, 0.5F, 0F, 1.7F, 0.9F, 0F); // Box 29
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1F, -9.9F, -4F, 2, 1, 8, 0F,0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, -0.4F, -0.7F, 0.2F, -0.4F, -0.7F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F); // Box 31
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -8F, -4F, 2, 2, 8, 0F,0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 1F, -0.5F, 1.7F, 1F, -0.5F, 1.7F, 1F, 0.3F, 1.5F, 1F, 0.3F, 1.5F); // Box 32
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-1F, -6.5F, -4F, 2, 2, 8, 0F,1F, 0F, 1.7F, 1F, 0F, 1.7F, 1F, -0.8F, 1.5F, 1F, -0.8F, 1.5F, 1F, -0.8F, 1.9F, 1F, -0.8F, 1.9F, 1F, 1.2F, 1.4F, 1F, 1.2F, 1.4F); // Box 34
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1F, -5.4F, -5F, 2, 1, 5, 0F,1F, -0.1F, 0.9F, 1F, -0.1F, 0.9F, 0.9F, -1.2F, 0F, 1F, -1.3F, 0F, 1F, -0.3F, 2.8F, 1F, -0.3F, 2.8F, 1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 35
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(0F, -5.4F, 0F, 1, 1, 5, 0F,1F, -1.3F, 0F, 0.9F, -1.2F, 0F, 1F, -2.1F, 0.4F, 2F, -2.1F, 0.4F, 1.3F, 0.9F, -1F, 1.7F, 0.9F, -1F, 0.7F, 2.8F, 1.1F, 1.7F, 2.8F, 1.1F); // Box 36
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3F, -5.4F, -5F, 1, 1, 5, 0F,1F, -0.1F, 0.9F, 0.8F, -0.5F, -0.1F, 0.9F, -1.2F, 0F, 1F, -1.3F, 0F, 1F, -0.3F, 2.8F, 1.3F, 0.2F, 1.2F, 1.7F, 0.9F, 0F, 1F, 0.5F, 0F); // Box 37
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3F, -6.5F, -4F, 1, 2, 8, 0F,1F, 0F, 1.7F, 0.9F, 0F, 0.7F, 0.9F, -0.8F, 1F, 1F, -0.8F, 1.5F, 1F, -0.8F, 1.9F, 0.9F, -0.4F, 0.9F, 0.9F, 1F, 0.9F, 1F, 1.2F, 1.4F); // Box 38
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(2F, -8F, -4F, 2, 2, 8, 0F,1F, 0.6F, 0.2F, 0.2F, 0.6F, -0.5F, 0.2F, -0.1F, 0.3F, 1F, -0.1F, 0.8F, 0F, -0.5F, 1.7F, 0.9F, -0.5F, 0.7F, 0.9F, 0.3F, 1F, 0F, 0.3F, 1.5F); // Box 39
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(2F, -9.9F, -4F, 2, 1, 8, 0F,1F, 0F, -2.2F, -1.2F, -0.3F, -2.5F, -1.2F, -0.8F, -1.2F, 1F, -0.6F, -0.7F, 1F, 0.3F, 0.2F, 0.2F, 0.3F, -0.5F, 0.2F, 1F, 0.3F, 1F, 1F, 0.8F); // Box 40
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3F, -5.4F, 0F, 1, 1, 5, 0F,1F, -1.3F, 0F, 0.9F, -1.2F, 0F, 0.9F, -1.9F, -0.1F, 1F, -2.1F, 0.4F, 1.3F, 0.5F, 0F, 1.7F, 0.9F, 0F, 1.3F, 2.2F, 0.3F, 1.3F, 2.8F, 1.1F); // Box 41
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -10.5F, -4F, 1, 1, 8, 0F,-0.1F, 0.1F, -2.6F, -0.1F, 0.1F, -2.6F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1.4F, 1.2F, 0F, 1.4F, 1.2F); // Box 42
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -8.7F, -2F, 1, 2, 6, 0F,0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, -0.6F, 1.2F, 0F, -0.6F, 1.2F, 1F, -0.5F, 1.7F, 1F, -0.5F, 1.7F, 0F, 1F, 1.9F, 0F, 1F, 1.9F); // Box 43
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -5.7F, 4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 44
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1F, -9.9F, -4F, 2, 1, 8, 0F,0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 1F, 0.8F, 0F, 1F, 0.8F); // Box 45
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-1F, -7.3F, 2F, 2, 1, 2, 0F,0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 1.6F, 0.2F, 0.5F, 1.6F); // Box 47
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1F, -5.3F, 2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 1.6F, 0.2F, 0.5F, 1.6F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, -0.2F, 0.4F, 1.5F, -0.2F, 0.4F, 1.5F); // Box 48
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-5F, -4F, -1F, 10, 4, 1, 0F,-0.3F, 0.2F, 1F, -0.3F, 0.2F, 1F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.9F, 0.1F, 2.7F, -0.9F, 0.1F, 2.7F, -0.9F, 0.2F, -3F, -0.9F, 0.2F, -3F); // Box 23
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.5F, -7.75F, -5.5F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F); // Box 29
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-0.5F, -7.35F, -5.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 30
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-0.5F, -6.75F, -5.9F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 31
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-0.5F, -6.65F, -5.9F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-0.5F, -8F, -5.3F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F); // Box 34
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-0.5F, -8.25F, -5.2F, 1, 1, 1, 0F,-0.62F, -0.35F, -0.3F, -0.22F, -0.35F, -0.3F, -0.22F, -0.35F, 0F, -0.62F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 35
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-0.8F, -8.4F, -5F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 36
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-0.2F, -8.4F, -5F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 37
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-0.5F, -8.25F, -5.2F, 1, 1, 1, 0F,-0.22F, -0.35F, -0.3F, -0.62F, -0.35F, -0.3F, -0.62F, -0.35F, 0F, -0.22F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 38
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-0.75F, -8.55F, -4.8F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 39
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-0.25F, -8.55F, -4.8F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 40
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-1F, -7.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, 0F, -0.3F, -0.35F, 0F); // Box 41
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(0F, -7.45F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, 0F); // Box 42
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-1.5F, -7.45F, -5.7F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.3F, -0.05F, -0.35F, -0.3F, -0.05F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F); // Box 43
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-1.5F, -7.75F, -5.45F, 1, 1, 1, 0F,-0.3F, 0.25F, -0.5F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, -0.3F, 0.25F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F); // Box 44
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-0.5F, -8.8F, -4.7F, 1, 1, 1, 0F,-0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F); // Box 45
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(0.5F, -7.45F, -5.7F, 1, 1, 1, 0F,-0.05F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F); // Box 46
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(0.5F, -7.75F, -5.45F, 1, 1, 1, 0F,0F, -0.4F, -0.3F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, 0F, 0F, -0.4F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F); // Box 47
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-0.5F, -6.75F, -5.9F, 1, 1, 1, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F); // Box 48
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-0.5F, -6.75F, -5.9F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F); // Box 49
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-0.5F, -6.75F, -5.8F, 1, 1, 1, 0F,0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F); // Box 50
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-0.5F, -6.75F, -5.8F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F); // Box 51
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(0.45F, -6.7F, -5.9F, 1, 1, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 52
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-2.2F, -6.9F, -5.9F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, -1F, -0.45F, 0F); // Box 53
		headModel[45].setRotationPoint(0F, 0F, 0F);
	}
}