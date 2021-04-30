//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPaydayMask extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPaydayMask() //Same as Filename
	{
		headModel = new ModelRendererTurbo[8];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 6
		headModel[7] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7

		headModel[0].addBox(-5F, -8F, -5F, 10, 7, 1, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -1F, -5F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, 0F, -5F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -9F, -5F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addBox(-5F, -6F, -4F, 1, 1, 8, 0F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addBox(-5F, -3F, -4F, 1, 1, 8, 0F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addBox(4F, -3F, -4F, 1, 1, 8, 0F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addBox(4F, -6F, -4F, 1, 1, 8, 0F); // Box 7
		headModel[7].setRotationPoint(0F, 0F, 0F);


	}
}