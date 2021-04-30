//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelUshanka extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelUshanka() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];
		bodyModel = new ModelRendererTurbo[6];

		initheadModel_1();
		initbodyModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		headModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 102
		headModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 103
		headModel[3] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 104
		headModel[4] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 105
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 109
		headModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 110
		headModel[7] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 111
		headModel[8] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 112
		headModel[9] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 113
		headModel[10] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 114

		headModel[0].addShapeBox(-4F, -8.1F, -4F, 8, 4, 7, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -8.3F, -4.75F, 9, 4, 1, 0F,-0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -8.3F, 3.7F, 9, 4, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 103
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -8.3F, -3.5F, 4, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 104
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0.5F, -8.3F, -3.5F, 4, 4, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 105
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -8.3F, -4.75F, 9, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 109
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -7.5F, -5F, 3, 3, 1, 0F,-0.15F, -0.15F, 0F, -1.15F, -0.15F, 0F, -1.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -1.15F, 0F, -1.15F, -1.15F, 0F, -1.15F, -1.15F, 0F, -0.15F, -1.15F, 0F); // Box 110
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0.5F, -9.3F, -3.5F, 4, 1, 7, 0F,-0.2F, -0.7F, -1.25F, -1F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, -0.2F, -0.7F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 111
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -9.3F, -3.5F, 4, 1, 7, 0F,-1F, -0.7F, -0.5F, -0.2F, -0.7F, -1.25F, -0.2F, -0.7F, -1.25F, -1F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 112
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.5F, -8.3F, 3.7F, 9, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F); // Box 113
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -8.1F, 3.1F, 8, 4, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 114
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 70
		bodyModel[1] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 73
		bodyModel[2] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 74
		bodyModel[3] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 75
		bodyModel[4] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 76
		bodyModel[5] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 77

		bodyModel[0].addShapeBox(0.9F, -0.12F, -1.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 70
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0.9F, -0.12F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 73
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0.9F, -0.12F, 0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 74
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.9F, -0.12F, -1.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 75
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.9F, -0.12F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 76
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.9F, -0.12F, 0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 77
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
	}
}