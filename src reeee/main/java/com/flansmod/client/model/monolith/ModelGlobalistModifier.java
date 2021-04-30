//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.03.2016 - 22:22:54
// Last changed on: 06.03.2016 - 22:22:54

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGlobalistModifier extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGlobalistModifier() //Same as Filename
	{
		headModel = new ModelRendererTurbo[16];
		bodyModel = new ModelRendererTurbo[2];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 2, 121, textureX, textureY); // Box 4
		headModel[1] = new ModelRendererTurbo(this, 74, 397, textureX, textureY); // Box 79
		headModel[2] = new ModelRendererTurbo(this, 74, 397, textureX, textureY); // Box 108
		headModel[3] = new ModelRendererTurbo(this, 22, 136, textureX, textureY); // Box 107
		headModel[4] = new ModelRendererTurbo(this, 17, 149, textureX, textureY); // Box 108
		headModel[5] = new ModelRendererTurbo(this, 388, 374, textureX, textureY); // Box 106
		headModel[6] = new ModelRendererTurbo(this, 17, 119, textureX, textureY); // Box 107
		headModel[7] = new ModelRendererTurbo(this, 11, 128, textureX, textureY); // Box 108
		headModel[8] = new ModelRendererTurbo(this, 53, 205, textureX, textureY); // Box 113
		headModel[9] = new ModelRendererTurbo(this, 5, 172, textureX, textureY); // Box 114
		headModel[10] = new ModelRendererTurbo(this, 22, 200, textureX, textureY); // Box 119
		headModel[11] = new ModelRendererTurbo(this, 5, 186, textureX, textureY); // Box 113
		headModel[12] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Box 116
		headModel[13] = new ModelRendererTurbo(this, 349, 273, textureX, textureY); // Box 118
		headModel[14] = new ModelRendererTurbo(this, 53, 205, textureX, textureY); // Box 26
		headModel[15] = new ModelRendererTurbo(this, 22, 200, textureX, textureY); // Box 27

		headModel[0].addShapeBox(-4F, -5.7F, -4F, 8, 1, 8, 0F,0.67F, 0.45F, 0.52F, 0.67F, 0.45F, 0.52F, 0.67F, 0.45F, 0.52F, 0.67F, 0.45F, 0.52F, 0.87F, 0.35F, 0.82F, 0.87F, 0.35F, 0.82F, 0.87F, 0.95F, 0.72F, 0.87F, 0.95F, 0.72F); // Box 4
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -5.99F, -1F, 9, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3.6F, -0.5F, 0F, -3.6F); // Box 79
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -5.99F, -1F, 9, 6, 1, 0F,-0.5F, -2F, -0.8F, -0.5F, -2F, -0.8F, -0.5F, -2F, 0.4F, -0.5F, -2F, 0.4F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3.6F, -0.5F, 0F, -3.6F); // Box 108
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7.3F, -4F, 8, 1, 8, 0F,0.52F, 0.15F, 0.22F, 0.52F, 0.15F, 0.22F, 0.52F, 0.15F, 0.27F, 0.52F, 0.15F, 0.27F, 0.67F, 0.25F, 0.52F, 0.67F, 0.25F, 0.52F, 0.67F, 0.25F, 0.52F, 0.67F, 0.25F, 0.52F); // Box 107
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7.97F, -4F, 8, 1, 8, 0F,-0.13F, 0.17F, -0.13F, -0.13F, 0.17F, -0.13F, -0.13F, 0.32F, -0.18F, -0.13F, 0.32F, -0.18F, 0.52F, -0.4F, 0.22F, 0.52F, -0.4F, 0.22F, 0.57F, -0.35F, 0.32F, 0.57F, -0.35F, 0.32F); // Box 108
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.7F, -4F, 8, 1, 8, 0F,0.9F, 0.1F, 0.7F, 0.9F, 0.1F, 0.7F, 0.9F, -0.4F, 0.75F, 0.9F, -0.4F, 0.75F, 0.9F, -0.6F, 0.75F, 0.9F, -0.6F, 0.75F, 0.9F, -0.1F, 0.75F, 0.9F, -0.1F, 0.75F); // Box 106
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-2.98F, -2.7F, -4F, 6, 1, 8, 0F,0F, 1.85F, -1.4F, 0F, 1.85F, -1.4F, 1F, 1.15F, 0.7F, 1F, 1.15F, 0.7F, 0.9F, -0.15F, -3.6F, 0.9F, -0.15F, -3.6F, 1F, -0.7F, 0.65F, 1F, -0.7F, 0.65F); // Box 107
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -5.7F, -4.1F, 8, 1, 8, 0F,0.67F, -0.43F, 0.52F, 0.67F, -0.43F, 0.52F, 0.67F, 0.37F, 0.52F, 0.67F, 0.37F, 0.52F, 0.87F, 0.25F, 0.92F, 0.87F, 0.25F, 0.92F, 0.87F, 0.85F, 0.92F, 0.87F, 0.85F, 0.92F); // Box 108
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4F, -2.7F, -4F, 0, 1, 8, 0F,0.05F, 1.55F, -2.7F, 0.85F, 1.55F, -2.7F, 0.85F, 1.15F, 0.7F, 0.05F, 1.15F, 0.7F, -0.05F, -0.15F, -4.7F, 0.85F, -0.15F, -4.7F, 0.75F, -0.7F, 0.65F, 0.05F, -0.7F, 0.65F); // Box 113
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -2.7F, -4F, 0, 1, 8, 0F,0.05F, 1.6F, -1.5F, 0.85F, 1.6F, -1.5F, 0.85F, 1.15F, 0.7F, 0.05F, 1.15F, 0.7F, -0.05F, -1.45F, -3.6F, 0.85F, -1.45F, -3.7F, 0.75F, -0.7F, 0.55F, 0.05F, -0.7F, 0.55F); // Box 114
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -2.7F, -4F, 0, 1, 8, 0F,0.07F, 1.55F, -2.08F, 0.87F, 1.6F, -2.08F, 0.87F, 1.15F, 0.72F, 0.07F, 1.15F, 0.72F, -0.03F, -1.43F, -3.58F, 0.87F, -1.43F, -3.58F, 0.77F, -0.68F, 0.57F, 0.07F, -0.68F, 0.57F); // Box 119
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -2.7F, -4F, 0, 1, 8, 0F,0.05F, 1.55F, -2.1F, 0.85F, 1.6F, -2.1F, 0.85F, 1.15F, 0.7F, 0.05F, 1.15F, 0.7F, -0.05F, -1.45F, -3.65F, 0.85F, -1.45F, -3.65F, 0.75F, -0.7F, 0.55F, 0.05F, -0.7F, 0.55F); // Box 113
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.99F, -7.45F, -0.7F, 1, 2, 3, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 116
		headModel[12].setRotationPoint(-0.05F, 0F, 0F);

		headModel[13].addShapeBox(4.01F, -7.45F, -0.7F, 1, 2, 3, 0F,0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 118
		headModel[13].setRotationPoint(0.05F, 0F, 0F);

		headModel[14].addShapeBox(-4.8F, -2.7F, -4F, 0, 1, 8, 0F,0.05F, 1.55F, -2.7F, 0.85F, 1.55F, -2.7F, 0.85F, 1.15F, 0.7F, 0.05F, 1.15F, 0.7F, -0.05F, -0.15F, -4.7F, 0.85F, -0.15F, -4.7F, 0.75F, -0.7F, 0.65F, 0.05F, -0.7F, 0.65F); // Box 26
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.8F, -2.7F, -4F, 0, 1, 8, 0F,0.07F, 1.55F, -2.08F, 0.87F, 1.6F, -2.08F, 0.87F, 1.15F, 0.72F, 0.07F, 1.15F, 0.72F, -0.03F, -1.43F, -3.58F, 0.87F, -1.43F, -3.58F, 0.77F, -0.68F, 0.57F, 0.07F, -0.68F, 0.57F); // Box 27
		headModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 342, 261, textureX, textureY); // Box 37
		bodyModel[1] = new ModelRendererTurbo(this, 352, 273, textureX, textureY); // Box 100

		bodyModel[0].addBox(-0.25F, 7.2F, -0.1F, 3, 2, 4, 0F); // Box 37
		bodyModel[0].setRotationPoint(0F, 0F, 0F);
		bodyModel[0].rotateAngleX = 0.03490659F;

		bodyModel[1].addShapeBox(-2.38F, 1.75F, -3.3F, 2, 1, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0.35F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.35F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 349, 262, textureX, textureY); // Box 63
		leftArmModel[1] = new ModelRendererTurbo(this, 366, 367, textureX, textureY); // Box 64

		leftArmModel[0].addBox(2.2F, -1F, -1.45F, 1, 2, 3, 0F); // Box 63
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addBox(2.2F, 1.2F, -1.45F, 1, 1, 3, 0F); // Box 64
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 353, 262, textureX, textureY); // Box 61
		rightArmModel[1] = new ModelRendererTurbo(this, 367, 367, textureX, textureY); // Box 62

		rightArmModel[0].addBox(-3.2F, -1F, -1.45F, 1, 2, 3, 0F); // Box 61
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addBox(-3.2F, 1.2F, -1.45F, 1, 1, 3, 0F); // Box 62
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}
}