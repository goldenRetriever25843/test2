//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEngineerHat extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelEngineerHat()
	{
		headModel = new ModelRendererTurbo[8];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		headModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F, -1F, -0.2F, -1F, -1F, -0.2F, -1F, -1F, -0.2F, -1F, -1F, -0.2F, -1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -4.7F, -4.8F, 8, 1, 9, 0F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F, 0.1F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -9F, -4F, 1, 3, 8, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0.1F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(1F, -4F, -4.5F, 2, 1, 1, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F); // Box 6
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3F, -4F, -4.5F, 2, 1, 1, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4F, -4F, 8, 1, 8, 0F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -5.1F, -4.8F, 8, 1, 9, 0F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.7F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F, 0.1F, 0.5F, -0.8F, 0.1F); // Box 0
		headModel[7].setRotationPoint(0F, 0F, 0F);


	}
}