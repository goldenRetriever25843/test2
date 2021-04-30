//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LoinCloth
// Model Creator: 
// Created on: 02.07.2016 - 15:10:05
// Last changed on: 02.07.2016 - 15:10:05

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHeidelbergensis extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelHeidelbergensis() //Same as Filename
	{
		headModel = new ModelRendererTurbo[4];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Box 3

		headModel[0].addShapeBox(-0.5F, -3.2F, -5F, 1, 1, 1, 0F,0.3F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2.5F, -5.2F, -4.5F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -0.3F, 0.1F, 0F, 0F, 0.1F, 0F, 0.8F, -0.2F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0.5F, -5.2F, -4.5F, 2, 1, 1, 0F,0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.3F, 0.1F, 0F, 0.5F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0F, 0.1F, 0F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, 0F, -4F, 1, 1, 1, 0F,3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 3F, 3.5F, 0F, 3F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 3F, 3F, 0F, 3F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);
	}
}