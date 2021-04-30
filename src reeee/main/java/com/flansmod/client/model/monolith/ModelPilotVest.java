//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPilotVest extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelPilotVest()
	{
		bodyModel = new ModelRendererTurbo[8];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 25

		bodyModel[0].addShapeBox(-4F, 3F, -2F, 8, 8, 4, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 16
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 2, 3, 4, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 17
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(2F, 0F, -2F, 2, 3, 4, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0.2F); // Box 18
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 0F, -2F, 1, 5, 4, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 19
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2F, 0F, -2F, 1, 5, 4, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 20
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 5.3F, -2F, 1, 6, 4, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 1.3F, 0F, 0.3F, -1.5F, 0F, 0.3F, -1.5F, 0F, 0.3F, 1.3F, 0F, 0.3F); // Box 21
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3.3F, 5.3F, -2F, 1, 6, 4, 0F, 1.3F, 0F, 0.3F, -1.3F, 0F, 0.3F, -1.3F, 0F, 0.3F, 1.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 22
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2.5F, 4.5F, -2F, 5, 1, 4, 0F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 25
		bodyModel[7].setRotationPoint(0F, 0F, 0F);


	}
}