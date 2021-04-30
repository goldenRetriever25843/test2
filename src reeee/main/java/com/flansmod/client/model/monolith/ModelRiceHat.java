//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRiceHat extends ModelCustomArmour
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelRiceHat()
	{
		headModel = new ModelRendererTurbo[7];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7

		headModel[0].addShapeBox(0F, -12F, 0F, 12, 6, 12, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -12F, -12F, 12, 6, 12, 0F, 0F, -6F, 0F, -5F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-12F, -12F, -12F, 12, 6, 12, 0F, -5F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-12F, -12F, 0F, 12, 6, 12, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -5F, -6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-9.5F, -6.8F, -0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, -2F, -5F, 0F, -2F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3.5F, -6.8F, -2.5F, 1, 7, 1, 0F, -5F, 0F, -2F, 5F, 0F, -2F, 5F, 0F, 2F, -5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addBox(-4F, -0.8F, -2.5F, 8, 1, 1, 0F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);


	}
}