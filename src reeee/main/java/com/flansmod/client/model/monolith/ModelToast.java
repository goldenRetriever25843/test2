//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelToast extends ModelCustomArmour //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelToast() //Same as Filename
	{
		headModel = new ModelRendererTurbo[1];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4

		headModel[0].addShapeBox(-0.5F, -1.8F, -7.8F, 3, 1, 4, 0F, -0.8F, -2.1F, 0.4F, 0.7F, -2.2F, -0.3F, 0F, -0.6F, 0.2F, 0F, -0.6F, -0.5F, -0.8F, 1.6F, 0.2F, 0.7F, 1.7F, -0.5F, 0F, 0.1F, 0.2F, 0F, 0.1F, -0.3F); // Box 4
		headModel[0].setRotationPoint(0F, 0F, 0F);


	}
}