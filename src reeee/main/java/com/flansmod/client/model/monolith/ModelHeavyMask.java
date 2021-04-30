//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ModernPeakedHat
// Model Creator: 
// Created on: 10.08.2015 - 18:55:57
// Last changed on: 10.08.2015 - 18:55:57

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHeavyMask extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelHeavyMask() //Same as Filename
	{
		headModel = new ModelRendererTurbo[13];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 4
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		headModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 7
		headModel[8] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 0
		headModel[9] = new ModelRendererTurbo(this, 43, 45, textureX, textureY); // Box 2
		headModel[10] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 3
		headModel[11] = new ModelRendererTurbo(this, 50, 45, textureX, textureY); // Box 4
		headModel[12] = new ModelRendererTurbo(this, 46, 45, textureX, textureY); // Box 5

		headModel[0].addShapeBox(-5F, -3F, -6F, 5, 4, 5, 0F,-1F, -1F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0.5F, 0F, 1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, -1F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -8F, -5F, 5, 4, 5, 0F,-1F, 0F, -1F, 0F, 0.5F, -0.8F, 0F, 1F, 0F, -0.8F, 0F, 0F, -1F, -1F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -5F, -5F, 5, 2, 5, 0F,-1F, 0F, 0.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, -0.5F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 4
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -8F, -5F, 5, 4, 5, 0F,0F, 0.5F, -0.8F, -1F, 0F, -1F, -0.8F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, -1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0F, -5F, -5F, 5, 2, 5, 0F,0F, -1F, 1F, -1F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -1F, 1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0F, -3F, -6F, 5, 4, 5, 0F,0F, 0.5F, 0F, -1F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, -2F, 1F, 0.5F, 0F, -1F, -1F, 0F, 0.5F, 0F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(0F, -4F, -6F, 1, 3, 1, 0F,0F, 0F, 0F, -0.7F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-1F, -4F, -6F, 1, 3, 1, 0F,-0.7F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1F, -3.7F, -6.2F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0.6F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 0
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(1F, -4.7F, -6.2F, 2, 1, 1, 0F,0F, -0.7F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0F, -0.7F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F); // Box 2
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3F, -4.7F, -6.2F, 2, 1, 1, 0F,0.2F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0.2F, -0.6F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F); // Box 3
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-3F, -3.7F, -6.2F, 2, 1, 1, 0F,0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.6F, 0.3F, 0F); // Box 4
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -3.7F, -6.15F, 8, 1, 5, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.9F, -0.9F, 0F, 0.9F, -0.9F, 0F); // Box 5
		headModel[12].setRotationPoint(0F, 0F, 0F);
	}
}