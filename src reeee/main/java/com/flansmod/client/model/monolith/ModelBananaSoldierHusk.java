//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBananaSoldierHusk extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBananaSoldierHusk() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 7

		bodyModel[0].addBox(0F, 0F, 0F, 16, 32, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, -22F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 12, 12, 0F); // Box 1
		bodyModel[1].setRotationPoint(8F, -20F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 6, 12, 0F); // Box 2
		bodyModel[2].setRotationPoint(8F, -1F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 15, 10, 10, 0F); // Box 3
		bodyModel[3].setRotationPoint(-5.9F, -19F, -5F);

		bodyModel[4].addBox(0F, 0F, 0F, 4, 8, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(-2F, -18F, 8F);

		bodyModel[5].addBox(0F, 0F, 0F, 4, 8, 2, 0F); // Box 5
		bodyModel[5].setRotationPoint(-2F, -18F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 6
		bodyModel[6].setRotationPoint(-1F, -17F, 8F);
		bodyModel[6].rotateAngleX = -0.78539816F;

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 7
		bodyModel[7].setRotationPoint(1F, -17F, -8F);
		bodyModel[7].rotateAngleX = -0.78539816F;
		bodyModel[7].rotateAngleY = -3.14159265F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}