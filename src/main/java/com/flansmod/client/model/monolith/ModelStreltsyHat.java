//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: StreltsyHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStreltsyHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelStreltsyHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 29
		headModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 18
		headModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 6
		headModel[7] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 7
		headModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 23
		headModel[9] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 24
		headModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 25

		headModel[0].addShapeBox(-4F, -1F, -4F, 8, 1, 5, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 5F, 2.2F, 0.2F, 5F, 2.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 20
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-3F, -2.5F, -4F, 3, 1, 1, 0F,0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F); // Box 21
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0F, -2.5F, -4F, 3, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, 0.5F, -4F, 8, 1, 5, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2F, 0.5F, 0.2F, -2F, 0.5F, 0.2F, -2F, 0.5F, 0.2F, -2F, 0.5F, 0.2F); // Box 29
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -12F, -4F, 8, 7, 8, 0F,-1.5F, 1.8F, -3.5F, -1.5F, 1.8F, -3.5F, -1F, 0.8F, 1.4F, -1F, 0.8F, 1.4F, 0.8F, -1.5F, 1F, 0.8F, -1.5F, 1F, 1F, 0F, 1.3F, 1F, 0F, 1.3F); // Box 18
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -6.5F, -5F, 10, 2, 11, 0F,0.9F, 0.5F, 0.9F, 0.9F, 0.5F, 0.9F, 0.9F, -1.2F, 0.3F, 0.9F, -1.2F, 0.3F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, 1.3F, -0.1F, 0.9F, 1.3F, -0.1F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -8.5F, -5F, 10, 1, 11, 0F,0.6F, -0.9F, 0.6F, 0.6F, -0.9F, 0.6F, 0.6F, -2.7F, 0F, 0.6F, -2.7F, 0F, 0.9F, 0.5F, 0.9F, 0.9F, 0.5F, 0.9F, 0.9F, 2.2F, 0.3F, 0.9F, 2.2F, 0.3F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -3.7F, -5F, 10, 1, 11, 0F,0.9F, 1.5F, 0.9F, 0.9F, 1.5F, 0.9F, 0.9F, -0.5F, -0.1F, 0.9F, -0.5F, -0.1F, 0.6F, -2F, 0.6F, 0.6F, -2F, 0.6F, 0.6F, 0.1F, -0.4F, 0.6F, 0.1F, -0.4F); // Box 7
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3F, -8.5F, -4.6F, 6, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 23
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3F, -9.5F, -4F, 6, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 24
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3F, -10.5F, -3.3F, 6, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 25
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}
}