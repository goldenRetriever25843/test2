//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSniparHat extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelSniparHat()
	{
		headModel = new ModelRendererTurbo[9];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		headModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		headModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		headModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		headModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
		headModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 9

		headModel[0].addShapeBox(1F, -4F, -4.2F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(1F, -5F, -4.2F, 2, 1, 1, 0F, 0F, -0.7F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0F, -0.7F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3F, -5F, -4.2F, 2, 1, 1, 0F, 0.2F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0.2F, -0.6F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F); // Box 3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3F, -4F, -4.2F, 2, 1, 1, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.6F, 0.3F, 0F); // Box 4
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4F, -4.1F, 8, 1, 5, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F); // Box 5
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5.8F, -6F, -6F, 10, 1, 12, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4F, -9.25F, -6F, 1, 4, 12, 0F, -1.5F, 0F, -2F, 0.75F, 0F, -2F, 0.75F, 0F, -2F, -1.5F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-8.2F, -6F, -6F, 2, 1, 12, 0F, 0.2F, -0.5F, -3F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.5F, -3F, 0.2F, -0.25F, -3F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, 0F, 0.2F, -0.25F, -3F); // Box 8
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -9F, -4F, 8, 3, 8, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 9
		headModel[8].setRotationPoint(0F, 0F, 0F);


	}
}