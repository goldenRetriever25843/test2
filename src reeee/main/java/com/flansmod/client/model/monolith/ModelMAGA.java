//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: JapanHat
// Model Creator: 
// Created on: 09.08.2016 - 22:08:02
// Last changed on: 09.08.2016 - 22:08:02

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMAGA extends ModelCustomArmour //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelMAGA() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 970, 32, textureX, textureY); // Import Box1
		headModel[1] = new ModelRendererTurbo(this, 713, 12, textureX, textureY); // Import Box3
		headModel[2] = new ModelRendererTurbo(this, 334, 3, textureX, textureY); // Import Box11
		headModel[3] = new ModelRendererTurbo(this, 945, 24, textureX, textureY); // Box 0
		headModel[4] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 2
		headModel[5] = new ModelRendererTurbo(this, 1161, 1, textureX, textureY); // Box 3
		headModel[6] = new ModelRendererTurbo(this, 772, 21, textureX, textureY); // Box 6

		headModel[0].addShapeBox(0F, -8F, -4F, 40, 31, 40, 0F,0F, 1F, 0.2F, -36F, 0.8F, 0F, -36F, 0.6F, -36F, 0F, 0.8F, -36F, 0F, -28F, 1F, -35.8F, -28F, 0.5F, -35.8F, -28F, -36F, 0F, -28F, -36F); // Import Box1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -8F, 0F, 40, 31, 40, 0F,0F, 0.8F, 0F, -36F, 0.6F, 0F, -36F, 0.2F, -36F, 0F, 0.6F, -35.8F, 0F, -28F, 0F, -35.8F, -28F, 0F, -35.8F, -27.4F, -35.5F, 0F, -27.7F, -35F); // Import Box3
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-150.5F, -57.1F, -5.12F, 301, 100, 1, 0F,-147.8F, -51.2F, -0.3F, -147.8F, -51.2F, -0.3F, -147.8F, -51.2F, 0F, -147.8F, -51.2F, 0F, -147.8F, -51.2F, -0.7F, -147.8F, -51.2F, -0.7F, -147.8F, -51.2F, 0F, -147.8F, -51.2F, 0F); // Import Box11
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -5.5F, -7F, 40, 10, 21, 0F,0F, -0.3F, 0.5F, -35.8F, -0.4F, -0.4F, -35.8F, -0.2F, -18F, 0F, -0.1F, -18F, 0F, -9.4F, 0.7F, -35.8F, -9.3F, 0F, -35.8F, -9.5F, -17.9F, 0F, -9.5F, -18F); // Box 0
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-40F, -5.5F, -7F, 40, 10, 21, 0F,-35.8F, -0.4F, -0.4F, 0F, -0.3F, 0.5F, 0F, -0.1F, -18F, -35.8F, -0.2F, -18F, -35.8F, -9.3F, 0F, 0F, -9.4F, 0.7F, 0F, -9.5F, -18F, -35.8F, -9.5F, -17.9F); // Box 2
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-40F, -8F, -4F, 40, 31, 40, 0F,-36F, 0.8F, 0F, 0F, 1F, 0.2F, 0F, 0.8F, -36F, -36F, 0.6F, -36F, -35.8F, -28F, 0.5F, 0F, -28F, 1F, 0F, -28F, -36F, -35.8F, -28F, -36F); // Box 3
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-40F, -8F, 0F, 40, 31, 40, 0F,-36F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, -35.8F, -36F, 0.2F, -36F, -35.8F, -28F, 0F, 0F, -28F, 0F, 0F, -27.7F, -35F, -35.8F, -27.4F, -35.5F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}
}