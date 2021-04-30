//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDrillSgtHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelDrillSgtHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[5];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		headModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		headModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 9
		headModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 2
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-1F, -8.8F, -4.6F, 2, 1, 1, 0F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 11
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-6F, -4.5F, -6F, 12, 1, 12, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 8
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -10.5F, -4F, 8, 2, 8, 0F, -2F, 0.4F, -2F, -2F, 0.4F, -2F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 9
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6F, -4F, 8, 1, 8, 0F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 10
		headModel[4].setRotationPoint(0F, 0F, 0F);


	}
}