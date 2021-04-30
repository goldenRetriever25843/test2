//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSsh40 extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelSsh40()
	{
		headModel = new ModelRendererTurbo[6];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		headModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		headModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		headModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 4, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0.6F, 1.5F, 1F, 0.1F, 1.5F, 1F, 0.1F); // Box 3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F, -0.9F, 0F, -1.8F, -0.9F, 0F, -1.8F, -0.9F, 0.2F, -2.4F, -0.9F, 0.2F, -2.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Box 3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8F, 0.2F, 8, 3, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 1.5F, 1F, 0.1F, 1.5F, 1F, 0.1F, 0.1F, 1.6F, 0.6F, 0.1F, 1.6F, 0.6F); // Box 3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -4F, 0.4F, 8, 1, 4, 0F, 1.5F, 0F, 0.3F, 1.5F, 0F, 0.3F, 0.1F, -0.6F, 0.4F, 0.1F, -0.6F, 0.4F, 1.9F, -0.2F, 0.3F, 1.9F, -0.2F, 0.3F, 0.6F, 0.1F, 0.7F, 0.6F, 0.1F, 0.7F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4F, -4.2F, 8, 1, 4, 0F, 0F, 0.7F, 0.4F, 0F, 0.7F, 0.4F, 1.5F, 0F, 0.3F, 1.5F, 0F, 0.3F, 0F, -1.4F, 1.2F, 0F, -1.4F, 1.2F, 1.9F, -0.2F, 0.3F, 1.9F, -0.2F, 0.3F); // Box 3
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -3.7F, -1.5F, 9, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.4F, 2.8F, 2F, -0.4F, 2.8F, 2F, -0.4F, 2.8F, -2.2F, -0.4F, 2.8F, -2.2F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);


	}
}