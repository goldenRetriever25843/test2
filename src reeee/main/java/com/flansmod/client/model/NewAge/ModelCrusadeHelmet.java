//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCrusadeHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCrusadeHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[12];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 20
		headModel[3] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 21
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 23
		headModel[6] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 24
		headModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 25
		headModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 26
		headModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 27
		headModel[10] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 28
		headModel[11] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 29

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 4, 8, 0F,0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -3F, -4F, 8, 3, 8, 0F,0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0.6F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.2F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F); // Box 20
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -8F, -4F, 1, 4, 1, 0F,0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.5F, 0.9F, 0.2F, 0.5F, 0.9F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F); // Box 21
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -3F, -4F, 1, 2, 1, 0F,0.2F, 0.5F, 0.9F, 0.2F, 0.5F, 0.9F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -4F, -3F, 8, 1, 7, 0F,0.4F, 0.3F, 0.6F, 0.4F, 0.3F, 0.6F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.2F, 0.6F, 0.4F, 0.2F, 0.6F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 23
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -4.5F, -4.5F, 9, 1, 1, 0F,-0.06F, -0.2F, 0.2F, -0.06F, -0.2F, 0.2F, -0.06F, -0.2F, 0F, -0.06F, -0.2F, 0F, -0.06F, -0.3F, 0.3F, -0.06F, -0.3F, 0.3F, -0.06F, -0.3F, 0F, -0.06F, -0.3F, 0F); // Box 24
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -3.5F, -4.5F, 9, 1, 1, 0F,-0.06F, -0.4F, 0.3F, -0.06F, -0.4F, 0.3F, -0.06F, -0.4F, 0F, -0.06F, -0.4F, 0F, -0.06F, -0.2F, 0.25F, -0.06F, -0.2F, 0.25F, -0.06F, -0.2F, 0F, -0.06F, -0.2F, 0F); // Box 25
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.65F, -4F, -4.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.29F, -0.2F, -0.2F, 0.29F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.101F, 0.3F, -0.2F, -0.101F, 0.3F, -0.2F, -0.101F, 0F, -0.2F, -0.101F, 0F); // Box 26
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3.65F, -4F, -4.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.29F, -0.2F, -0.2F, 0.29F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.101F, 0.3F, -0.2F, -0.101F, 0.3F, -0.2F, -0.101F, 0F, -0.2F, -0.101F, 0F); // Box 27
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, 0F, -4F, 4, 1, 8, 0F,0.2F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, -0.8F, 0.35F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.2F, 0.1F, -0.8F, 0.2F); // Box 28
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, 0F, -4F, 4, 1, 8, 0F,0F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.3F, 0.1F, -0.8F, 0.35F, 0.1F, -0.8F, 0.2F, 0F, -0.5F, 0.2F); // Box 29
		headModel[11].setRotationPoint(0F, 0F, 0F);
	}
}