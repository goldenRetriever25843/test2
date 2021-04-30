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

public class ModelMikadoBanner extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMikadoBanner() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 31
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 32
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 33
		bodyModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 35
		bodyModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 36
		bodyModel[7] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 37
		bodyModel[8] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 38
		bodyModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 41
		bodyModel[10] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 30
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 37

		bodyModel[0].addShapeBox(-4F, 4.5F, -3F, 8, 11, 1, 0F,0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, -0.5F); // Box 30
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0.5F, -3F, 8, 4, 1, 0F,1.5F, 0.8F, -0.3F, 1.5F, 0.8F, -0.3F, 1.5F, 0.8F, -0.3F, 1.5F, 0.8F, -0.3F, 0.5F, -0.51F, -0.3F, 0.5F, -0.51F, -0.3F, 0.5F, -0.51F, -0.3F, 0.5F, -0.51F, -0.3F); // Box 31
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-6F, -0.65F, -2.5F, 12, 1, 5, 0F,-0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F); // Box 32
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0.5F, 2F, 8, 4, 1, 0F,1.5F, 0.8F, -0.3F, 1.5F, 0.8F, -0.3F, 1.5F, 0.8F, -0.3F, 1.5F, 0.8F, -0.3F, 0.5F, -0.51F, -0.6F, 0.5F, -0.51F, -0.6F, 0.5F, -0.51F, 0F, 0.5F, -0.51F, 0F); // Box 33
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 4.5F, 2.3F, 8, 11, 1, 0F,0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.1F, -0.9F, 0.5F, 0.1F, -0.9F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F); // Box 34
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(4F, 0.3F, 1.9F, 4, 14, 1, 0F,0.5F, 0.5F, -0.35F, -1F, 0.5F, -0.35F, -1F, 0.5F, -0.35F, 0.5F, 0.5F, -0.35F, 0.5F, 0.1F, -0.35F, 2.5F, -0.9F, -0.35F, 2.5F, -0.9F, -0.35F, 0.5F, 0.1F, -0.35F); // Box 35
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(5F, -0.65F, -1.65F, 2, 1, 4, 0F,0F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.35F, 0F, -2F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 36
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-7F, -0.65F, -1.65F, 2, 1, 4, 0F,-2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-8F, 0.3F, 1.9F, 4, 14, 1, 0F,-1F, 0.5F, -0.35F, 0.5F, 0.5F, -0.35F, 0.5F, 0.5F, -0.35F, -1F, 0.5F, -0.35F, 2.5F, -0.9F, -0.35F, 0.5F, 0.1F, -0.35F, 0.5F, 0.1F, -0.35F, 2.5F, -0.9F, -0.35F); // Box 38
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.5F, -0.2F, -3.1F, 1, 1, 1, 0F,0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 41
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 0.45F, -2.9F, 1, 4, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.79F, 0F, -0.2F, -0.79F, 1F, -0.7F, 0.8F, 1F, -0.7F, 0.8F, 2F, -1.3F, -0.2F, 2F, -1.3F, -0.2F); // Box 28
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2.5F, -1.7F, -3.4F, 2, 3, 1, 0F,0F, -0.3F, -0.6F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, -0.3F, 0.2F, 0F, -1.4F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, -1.4F, 0F); // Box 29
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, -1.7F, -3.4F, 2, 3, 1, 0F,0F, -0.5F, -0.4F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0F, -0.3F, 0F, -0.2F, 0F, -1.4F, -0.4F, 0F, -1.4F, 0F, -0.3F, 0F, -0.2F); // Box 30
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(1.5F, -2F, -2.25F, 1, 2, 5, 0F,0F, -0.7F, 0F, 0F, -0.55F, 0F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0.19F, 0F, 0F, 0.19F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2.5F, -2F, -2.25F, 1, 2, 5, 0F,0F, -0.55F, 0F, 0F, -0.7F, 0F, -0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0.19F, 0F, 0F, 0.19F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 32
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, -2F, 1.75F, 3, 2, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.4F, 0F, 0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.4F); // Box 33
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3F, -2F, 1.75F, 3, 2, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0.4F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.4F, -0.4F, 0F, 0.4F, 0.4F, 0F, 0F, 0F); // Box 34
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.75F, 4.2F, -3.2F, 46, 80, 1, 0F,0F, 0F, -0.4F, -40.5F, 0F, -0.4F, -40.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -72F, -0.2F, -40.5F, -72F, -0.2F, -40.5F, -72F, -0.4F, 0F, -72F, -0.4F); // Box 35
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 0.3F, 1.9F, 1, 14, 2, 0F,-0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -1.35F, -0.35F, 0.5F, -1.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -1.25F, 1.3F, -0.7F, 0.5F, 1.3F, -0.7F); // Box 36
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3F, 0.3F, 1.9F, 1, 14, 2, 0F,-0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -1.35F, -0.35F, 0.5F, -1.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0.5F, 1.3F, -0.7F, -1.25F, 1.3F, -0.7F); // Box 37
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
	}
}