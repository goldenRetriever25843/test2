//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJapanHat extends ModelCustomArmour
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelJapanHat()
	{
		headModel = new ModelRendererTurbo[11];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		headModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 9
		headModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		headModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 11

		headModel[0].addShapeBox(-4F, -8F, -4F, 4, 3, 4, 0F, 0F, 0.8F, 0F, 0F, 1F, 0.2F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -8F, -4F, 4, 3, 4, 0F, 0F, 1F, 0.2F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8F, 0F, 4, 3, 4, 0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0.2F, 1F, 0.5F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -8F, 0F, 4, 3, 4, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0.5F, 0F, 1.5F, 1F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6.2F, -5F, 8, 1, 5, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.25F, -6F, 4, 1, 2, 0F, 0.2F, -0.4F, -0.7F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0F, 0.2F, -0.2F, 1F, 0.2F, -0.3F, 0F, 0F, -0.2F, 0.7F, 0F, -0.4F, 0F, 0.2F, -0.6F, 0.5F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(0F, -5.25F, -6F, 4, 1, 2, 0F, 0F, -0.4F, 0.5F, 0.2F, -0.4F, -0.7F, 0.2F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0.7F, 0.2F, -0.3F, 0F, 0.2F, -0.6F, 0.5F, 0F, -0.4F, 0F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4F, -4F, 0F, 1, 5, 4, 0F, 0F, 1F, 0F, -0.9F, 1F, 0F, -0.9F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, -1F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F); // Box 8
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -4F, 0F, 1, 5, 4, 0F, -0.9F, 1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, -0.9F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F); // Box 9
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3.5F, -4.5F, 4.2F, 7, 6, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 10
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1F, -8F, -5F, 3, 3, 1, 0F, 0.2F, -0.2F, -0.5F, -0.8F, -0.2F, -0.5F, -0.8F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -1.2F, -0.1F, -0.8F, -1.2F, -0.1F, -0.8F, -1.2F, 0F, 0.2F, -1.2F, 0F); // Box 11
		headModel[10].setRotationPoint(0F, 0F, 0F);


	}
}