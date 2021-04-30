//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.3.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNipponPilotVest extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelNipponPilotVest()
	{
		bodyModel = new ModelRendererTurbo[15];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 21
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 23
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 24
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 25
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 26
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 27
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 29
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 30
		bodyModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 31
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 32
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 33
		bodyModel[14] = new ModelRendererTurbo(this, 53, 5, textureX, textureY); // Box 34

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 10, 4, 0F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.6F, 0.15F, 0.15F, 0.6F, 0.15F, 0.15F, 0.6F, 0.15F, 0.15F, 0.6F, 0.15F); // Box 19
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3F, 0F, -2F, 1, 5, 4, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F); // Box 21
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(2F, 0F, -2F, 1, 5, 4, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F); // Box 22
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 5.4F, -2F, 1, 2, 3, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, -2.5F, 0.2F, 0.2F, 2.5F, 0.2F, 0.2F, 2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0.2F); // Box 23
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2F, 5.4F, -2F, 1, 2, 3, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0.2F, 2.5F, 0.2F, 0.2F); // Box 24
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 5.4F, -2F, 1, 5, 4, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, -1.5F, 0.2F, 0.2F, -1.5F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F); // Box 25
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(2F, 5.4F, -2F, 1, 5, 4, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, -1.5F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, -1.5F, 0.2F, 0.2F); // Box 26
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3F, 10.8F, -2F, 1, 1, 4, 0F, 1.5F, 0.2F, 0.2F, -1.5F, 0.2F, 0.2F, -1.5F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, -2.5F, 0.5F, 0.2F, 2.5F, 0.5F, 0.2F, 2.5F, 0.5F, 0.2F, -2.5F, 0.5F, 0.2F); // Box 27
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 10.5F, -2F, 8, 2, 4, 0F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, -3.9F, -0.3F, 0.15F, -3.9F, -0.3F, 0.15F, -3.9F, -0.3F, 0.15F, -3.9F, -0.3F, 0.15F); // Box 28
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(2F, 10.8F, -2F, 1, 1, 4, 0F, -1.5F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, 1.5F, 0.2F, 0.2F, -1.5F, 0.2F, 0.2F, 2.5F, 0.5F, 0.2F, -2.5F, 0.5F, 0.2F, -2.5F, 0.5F, 0.2F, 2.5F, 0.5F, 0.2F); // Box 29
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 7.5F, -2F, 1, 3, 3, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 3.5F, 0.2F, 0.2F, -3.5F, 0.2F, 0.2F, -3.5F, 0.2F, 0.2F, 3.5F, 0.2F, 0.2F); // Box 30
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.5F, 7.5F, -2F, 1, 3, 3, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, -3.5F, 0.2F, 0.2F, 3.5F, 0.2F, 0.2F, 3.5F, 0.2F, 0.2F, -3.5F, 0.2F, 0.2F); // Box 31
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 6.4F, -2.5F, 2, 2, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 32
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-1.5F, 0F, -2F, 3, 2, 4, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1.5F, 0F, 0.15F, -1.5F, 0F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 33
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-0.5F, 4.4F, 1.3F, 1, 1, 1, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F); // Box 34
		bodyModel[14].setRotationPoint(0F, 0F, 0F);


	}
}