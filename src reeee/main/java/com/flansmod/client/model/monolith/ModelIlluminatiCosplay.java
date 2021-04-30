//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIlluminatiCosplay extends ModelCustomArmour
{
	int textureX = 512;
	int textureY = 512;

	public ModelIlluminatiCosplay()
	{
		headModel = new ModelRendererTurbo[2];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1

		headModel[0].addShapeBox(-8F, -20F, -8F, 16, 45, 16, 0F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, -8F, 20F, 0F, 20F, 20F, 0F, 20F, 20F, 0F, 20F, 20F, 0F, 20F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-8F, 0F, -13F, 16, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -5F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);


	}
}