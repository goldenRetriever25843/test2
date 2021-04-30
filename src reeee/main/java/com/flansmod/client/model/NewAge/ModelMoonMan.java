//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MoonMan
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMoonMan extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMoonMan() //Same as Filename
	{
		headModel = new ModelRendererTurbo[23];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 42
		headModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 43
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 44
		headModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 45
		headModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 46
		headModel[5] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 47
		headModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 48
		headModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 49
		headModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 50
		headModel[9] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 51
		headModel[10] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 52
		headModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 53
		headModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 55
		headModel[13] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 56
		headModel[14] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 57
		headModel[15] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 58
		headModel[16] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 59
		headModel[17] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 60
		headModel[18] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 61
		headModel[19] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 62
		headModel[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 63
		headModel[21] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 64
		headModel[22] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 65

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 42
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -5.8F, -5F, 1, 2, 1, 0F,-0.4F, 0.8F, -1.2F, -0.4F, 0.8F, -1.2F, -0.4F, 0.8F, 0.2F, -0.4F, 0.8F, 0.2F, -0.2F, 0.5F, 0.9F, -0.2F, 0.5F, 0.9F, 0.7F, 0.8F, -0.1F, 0.7F, 0.8F, -0.1F); // Box 43
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -11.41F, -4F, 8, 3, 8, 0F,-1.4F, 0.2F, 2.2F, -1.4F, 0.2F, 2.2F, -1.4F, 1.2F, -3.5F, -1.4F, 1.2F, -3.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 44
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -14.82F, -5F, 8, 3, 8, 0F,-3F, -0.8F, 4.2F, -3F, -0.8F, 4.2F, -3F, 0.2F, -11.8F, -3F, 0.2F, -11.8F, -1.4F, 0.2F, 1.2F, -1.4F, 0.2F, 1.2F, -1.4F, -0.8F, -2.5F, -1.4F, -0.8F, -2.5F); // Box 45
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, 0.39F, -4F, 8, 4, 8, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -1.4F, 0.2F, 2.2F, -1.4F, 0.2F, 2.2F, -1.4F, 1.2F, -3.5F, -1.4F, 1.2F, -3.5F); // Box 46
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, 4.81F, -5F, 8, 3, 8, 0F,-1.4F, 0.2F, 1.2F, -1.4F, 0.2F, 1.2F, -1.4F, -0.8F, -2.5F, -1.4F, -0.8F, -2.5F, -3F, -0.8F, 4.2F, -3F, -0.8F, 4.2F, -3F, 0.2F, -11.8F, -3F, 0.2F, -11.8F); // Box 47
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -6F, -4.9F, 2, 1, 1, 0F,0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 48
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0.5F, -6F, -4.9F, 3, 2, 1, 0F,0F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F); // Box 49
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(0.5F, -4.61F, -4.9F, 3, 2, 1, 0F,-0.6F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, -1F, -1F, -0.35F, -0.4F, -1F, -0.35F, -0.4F, -1F, -0.35F, -1F, -1F, -0.35F); // Box 50
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3.5F, -6F, -4.9F, 3, 2, 1, 0F,0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, 0F, -0.3F, -0.35F); // Box 51
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3.5F, -4.61F, -4.9F, 3, 2, 1, 0F,0F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, -0.6F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.4F, -1F, -0.35F, -1F, -1F, -0.35F, -1F, -1F, -0.35F, -0.4F, -1F, -0.35F); // Box 52
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-2.5F, -3.2F, -5F, 5, 1, 1, 0F,0.6F, 0.8F, -1.2F, 0.6F, 0.8F, -1.2F, 0.6F, 0.8F, 0.2F, 0.6F, 0.8F, 0.2F, -0.2F, 0.5F, 0.4F, -0.2F, 0.5F, 0.4F, 1.7F, 0.4F, -0.1F, 1.7F, 0.4F, -0.1F); // Box 53
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -6.2F, -4.9F, 8, 1, 1, 0F,0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 55
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1.5F, -0.2F, -4.8F, 3, 1, 1, 0F,0.8F, 0.5F, 0.4F, 0.8F, 0.5F, 0.4F, 0.8F, 0.4F, -0.1F, 0.8F, 0.4F, -0.1F, 0.6F, 1.8F, -0.2F, 0.6F, 1.8F, -0.2F, 0.6F, 1.8F, 0.2F, 0.6F, 1.8F, 0.2F); // Box 56
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3.21F, -1.2F, -4.8F, 1, 1, 1, 0F,0F, 0.2F, -0.2F, -0.1F, -0.5F, 0.4F, 0F, -0.6F, -0.1F, 0.6F, 0.8F, -0.4F, -0.5F, 1.8F, -0.2F, 0F, 1.8F, 0F, 0F, 1.8F, 0.2F, -0.5F, 1.8F, 0.2F); // Box 57
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(2.19F, -1.2F, -4.8F, 1, 1, 1, 0F,-0.1F, -0.5F, 0.4F, 0F, 0.2F, -0.2F, 0.6F, 0.8F, -0.4F, 0F, -0.6F, -0.1F, 0F, 1.8F, 0F, -0.5F, 1.8F, -0.2F, -0.5F, 1.8F, 0.2F, 0F, 1.8F, 0.2F); // Box 58
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.8F, -6.2F, -4.9F, 1, 1, 6, 0F,-0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F); // Box 59
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(3.7F, -6.2F, -4.9F, 1, 1, 6, 0F,-0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F); // Box 60
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4.8F, -6.2F, 0.49F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.7F, -0.6F, -0.25F, -0.7F, -0.6F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, 0.75F, -0.7F, -0.25F, 0.75F, -0.7F); // Box 61
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(3.7F, -6.2F, 0.49F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.7F, -0.6F, -0.25F, -0.7F, -0.6F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, 0.75F, -0.7F, -0.25F, 0.75F, -0.7F); // Box 62
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-2.5F, -2.2F, -4.7F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(3.7F, -5.2F, -0.51F, 1, 3, 2, 0F,0F, 0F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 64
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4.8F, -5.2F, -0.51F, 1, 3, 2, 0F,0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 65
		headModel[22].setRotationPoint(0F, 0F, 0F);
	}
}