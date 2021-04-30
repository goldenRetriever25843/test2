//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.06.2015 - 15:29:14
// Last changed on: 11.06.2015 - 15:29:14

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPilotHatNipponFixed extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPilotHatNipponFixed() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		headModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 10
		headModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		headModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 12
		headModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		headModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 14
		headModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		headModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 16
		headModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 17
		headModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 18

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.25F, 0.2F, 0.1F, 0.25F, 0.2F, 1.8F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, 3F, 0.25F, 0.2F, 3F, 0.25F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2.9F, -4.5F, -4.5F, 2, 1, 1, 0F,0.45F, 0.1F, 0F, 0.4F, 0.05F, 0F, 0.4F, 0.05F, 0F, 0.45F, 0.1F, 0F, 0.7F, 0.2F, 0F, 0.35F, 0.2F, 0F, 0.35F, 0.2F, 0F, 0.7F, 0.2F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-2.9F, -3.5F, -4.5F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -9.1F, -4F, 8, 1, 8, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4.5F, -4F, 8, 1, 8, 0F,0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.4F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -8F, -3F, 8, 3, 7, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 5.2F, 0.8F, 0.2F, 5.2F, 0.8F, 0.2F, 4F, 0.2F, 0.2F, 4F, 0.2F); // Box 9
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addBox(-4.8F, -3.5F, -2F, 1, 1, 3, 0F); // Box 10
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.8F, -2.5F, -2F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.8F, -4.5F, -2F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addBox(3.8F, -3.5F, -2F, 1, 1, 3, 0F); // Box 13
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3.8F, -2.5F, -2F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3.8F, -4.5F, -2F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(0.9F, -3.5F, -4.5F, 2, 1, 1, 0F,0.35F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 16
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(0.9F, -4.5F, -4.5F, 2, 1, 1, 0F,0.4F, 0.05F, 0F, 0.45F, 0.1F, 0F, 0.45F, 0.1F, 0F, 0.4F, 0.05F, 0F, 0.35F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.35F, 0.2F, 0F); // Box 17
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -0.8F, -3.8F, 8, 1, 8, 0F,0.1F, -1F, -0.2F, 0.1F, -1F, -0.2F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 18
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}
}