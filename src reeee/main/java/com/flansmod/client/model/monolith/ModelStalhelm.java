//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStalhelm extends ModelCustomArmour
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelStalhelm()
	{
		headModel = new ModelRendererTurbo[8];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		headModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		headModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		headModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 8
		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 9
		headModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10

		headModel[0].addBox(-4.5F, -8F, -4.5F, 9, 3, 9, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -9F, -4.5F, 9, 1, 9, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 1F, 0F);

		headModel[2].addShapeBox(-4.5F, -5F, -4.5F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0.5F, -5F, -1.5F, 4, 3, 6, 0F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, 1.5F, 0F, 0F, 1F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 5
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, -5F, -1.5F, 4, 3, 6, 0F, 0F, 0F, 0F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, -2F, 1F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 6
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.2F, -3F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 3F, 0F, 2.2F, 3F, 0F, 2.2F, -3F, 0F, 2.2F, -3F); // Box 8
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(3.2F, -3F, -1F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.2F, 3F, 0F, 2.2F, 3F, 0F, 2.2F, -3F, 0F, 2.2F, -3F); // Box 9
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addBox(-3.5F, -0.8F, -3.8F, 7, 1, 1, 0F); // Box 10
		headModel[7].setRotationPoint(0F, 0F, 0F);


	}
}