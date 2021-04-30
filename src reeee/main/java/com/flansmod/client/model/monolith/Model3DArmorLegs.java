//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Model3DArmorLegs extends ModelCustomArmour
{
	int textureX = 128;
	int textureY = 64;

	public Model3DArmorLegs()
	{
		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import Box4

		leftLegModel[0].addShapeBox(-4F, -0.1F, -4F, 8, 24, 8, 0F, -1.95F, 0F, -1.95F, -1.95F, 0F, -1.95F, -1.95F, 0F, -1.95F, -1.95F, 0F, -1.95F, -1.95F, -12F, -1.95F, -1.95F, -12F, -1.95F, -1.95F, -12F, -1.95F, -1.95F, -12F, -1.95F); // Import Box4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 1

		rightLegModel[0].addShapeBox(-4F, -0.1F, -4F, 8, 24, 8, 0F, -1.95F, 0F, -1.95F, -1.95F, 0F, -1.95F, -1.95F, 0F, -1.95F, -1.95F, 0F, -1.95F, -1.95F, -12F, -1.95F, -1.95F, -12F, -1.95F, -1.95F, -12F, -1.95F, -1.95F, -12F, -1.95F); // Box 1
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);


	}
}