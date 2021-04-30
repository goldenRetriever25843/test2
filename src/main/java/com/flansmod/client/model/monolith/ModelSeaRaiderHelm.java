//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SeaRaiderHelm
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSeaRaiderHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelSeaRaiderHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		headModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 133
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		headModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 23
		headModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 24
		headModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 25
		headModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		headModel[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 27
		headModel[11] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 28
		headModel[12] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 29
		headModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 30
		headModel[14] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 31

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.5F, -4F, 8, 2, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0.4F, 0.9F, 0.9F, 0.4F, 0.9F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-2F, -10.8F, -2F, 4, 1, 4, 0F,-1.7F, -0.5F, -1.7F, -1.7F, -0.5F, -1.7F, -1.7F, -0.5F, -1.7F, -1.7F, -0.5F, -1.7F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 5
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -4.5F, -3F, 10, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.7F, 3.6F, 0.8F, -0.7F, 3.6F, 0.8F, -0.7F, 3.6F, -1.4F, -0.7F, 3.6F, -1.4F); // Box 133
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -11.3F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 22
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1.5F, -13.3F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-1.5F, -12.3F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 24
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1.5F, -14.3F, -0.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3.5F, -10.3F, -0.5F, 1, 2, 1, 0F,2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 2F, 0F, 0.2F, 0.5F, 0F, 0.2F, 1.2F, -1F, 0.2F, 1.2F, -1F, 0.2F, 0.5F, 0F, 0.2F); // Box 26
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -12.3F, -0.5F, 2, 2, 1, 0F,1F, 0F, 0.2F, -1.5F, 0F, 0.2F, -1.5F, 0F, 0.2F, 1F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 27
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-6F, -14.3F, -0.5F, 1, 2, 1, 0F,-0.49F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.48F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 28
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(2.5F, -10.3F, -0.5F, 1, 2, 1, 0F,-0.5F, 0F, 0.2F, 2F, 0F, 0.2F, 2F, 0F, 0.2F, -0.5F, 0F, 0.2F, 1.2F, -1F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 1.2F, -1F, 0.2F); // Box 29
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3F, -12.3F, -0.5F, 2, 2, 1, 0F,-1.5F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, -1.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 30
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(5F, -14.3F, -0.5F, 1, 2, 1, 0F,-0.5F, 0F, 0.2F, -0.48F, 0F, 0.2F, -0.49F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 31
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}
}