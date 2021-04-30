//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.9
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBombVest extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelBombVest()
	{
		bodyModel = new ModelRendererTurbo[7];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6

		bodyModel[0].addBox(-4F, 0F, -2.5F, 8, 12, 5, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(-3.5F, 9F, -4F, 3, 2, 2, 0F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-3.5F, 6.5F, -4F, 3, 2, 2, 0F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-3.5F, 4F, -4F, 3, 2, 2, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(0.5F, 4F, -4F, 3, 2, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(0.5F, 6.5F, -4F, 3, 2, 2, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(0.5F, 9F, -4F, 3, 2, 2, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, 0F, 0F);


	}
}