//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKKKTest extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelKKKTest()
	{
		headModel = new ModelRendererTurbo[6];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Test
		headModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Horn

		headModel[0].addShapeBox(0F, -18F, 0F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 18F, 0F,8F, 18F, 0F,6F, 18F, 6F,0F, 18F, 8F); // Test
		headModel[0].setRotationPoint(0F, -9F, -0.5F);

		headModel[1].addShapeBox(0F, -18F, 0F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 18F, 8F,6F, 18F, 6F,8F, 18F, 0F,0F, 18F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, -9F, -1.5F);

		headModel[2].addShapeBox(0F, -18F, 0F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 18F, 8F,6F, 18F, 6F,8F, 18F, 0F,0F, 18F, 0F); // Box 2
		headModel[2].setRotationPoint(-1F, -9F, -0.5F);
		headModel[2].rotateAngleY = -1.57079633F;

		headModel[3].addShapeBox(0F, -18F, 0F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 10F, 0F,5F, 10F, 0F,4F, 10F, 4F,0F, 10F, 5F); // Box 3
		headModel[3].setRotationPoint(-1F, -9F, -0.5F);
		headModel[3].rotateAngleY = -1.57079633F;

		headModel[4].addShapeBox(0F, -18F, 0F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 18F, 0F,8F, 18F, 0F,6F, 18F, 6F,0F, 18F, 8F); // Box 4
		headModel[4].setRotationPoint(0F, -9F, -0.5F);
		headModel[4].rotateAngleY = -4.71238898F;

		headModel[5].addBox(-0.5F, -7F, -15F, 1, 1, 12, 0F); // Horn
		headModel[5].setRotationPoint(0F, -7F, -15F);


	}
}