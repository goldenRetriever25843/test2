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

public class ModelCrusadeFrenchBanner extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCrusadeFrenchBanner() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];
		leftLegModel = new ModelRendererTurbo[13];
		rightLegModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 32
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 36
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 25

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 1.9F, -2F, 8, 5, 4, 0F,0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0.1F, 0.25F, 0.17F, 0.1F, 0.25F, 0.17F, 0.1F, 0.25F, 0.17F, 0.1F, 0.25F); // Box 32
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 7.51F, -2F, 8, 1, 4, 0F,0.17F, 0.5F, 0.25F, 0.17F, 0.5F, 0.25F, 0.17F, 0.5F, 0.25F, 0.17F, 0.5F, 0.25F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 33
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.15F, 0.15F, 0.2F, -2.83F, 0.15F, 0.2F, -2.83F, 0.15F, 0.2F, 0.15F, 0.15F, 0.2F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,-2.83F, 0.15F, 0.2F, 0.15F, 0.15F, 0.2F, 0.15F, 0.15F, 0.2F, -2.83F, 0.15F, 0.2F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F, 0.17F, 0F, 0.25F); // Box 35
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-1F, 1.8F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 36
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 8.9F, -2F, 8, 5, 4, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F); // Box 8
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(1.8F, 1.8F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 9
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.8F, 1.8F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 10
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.8F, 5.8F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 11
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 5.8F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 12
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.8F, 5.8F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 13
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2.5F, 3.8F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 14
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.5F, 3.8F, -2.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 15
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.8F, 1.8F, 1.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 18
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1F, 1.8F, 1.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 19
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.8F, 1.8F, 1.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 20
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.5F, 3.8F, 1.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 21
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2.5F, 3.8F, 1.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 22
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.8F, 5.8F, 1.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 23
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1F, 5.8F, 1.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 24
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(1.8F, 5.8F, 1.75F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 25
		bodyModel[21].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 31
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 32
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 33
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 34
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 35
		leftLegModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 36
		leftLegModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 37
		leftLegModel[7] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 44
		leftLegModel[8] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 45
		leftLegModel[9] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 46
		leftLegModel[10] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 47
		leftLegModel[11] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 48
		leftLegModel[12] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 49

		leftLegModel[0].addShapeBox(-2F, -2.3F, -2F, 4, 8, 4, 0F,0.5F, 0.12F, 0.3F, 0.3F, 0.12F, 0.3F, 0.3F, 0.12F, 0.3F, 0.5F, 0.12F, 0.3F, -0.7F, 0.8F, 0.5F, 1.2F, 0F, 0.3F, 1.2F, 0F, 0.3F, -0.7F, 0.8F, 0.5F); // Box 31
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(0.5F, -1.8F, -2.8F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 32
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.6F, -1.3F, -2.8F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 33
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(0.8F, 0.5F, -2.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 34
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.2F, 1.2F, -2.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 35
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-0.999999999999999F, 3.5F, -2.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 36
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(1F, 2.8F, -2.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 37
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.6F, -1.3F, 1.8F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 44
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1.2F, 1.2F, 1.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 45
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-0.999999999999999F, 3.5F, 1.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 46
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(1F, 2.8F, 1.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 47
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(0.8F, 0.5F, 1.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 48
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(0.5F, -1.8F, 1.8F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 49
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 30
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 26
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 27
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 28
		rightLegModel[4] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 29
		rightLegModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 30
		rightLegModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 31
		rightLegModel[7] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 38
		rightLegModel[8] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 39
		rightLegModel[9] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 40
		rightLegModel[10] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 41
		rightLegModel[11] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 42
		rightLegModel[12] = new ModelRendererTurbo(this, 100, 17, textureX, textureY); // Box 43

		rightLegModel[0].addShapeBox(-2F, -2.3F, -2F, 4, 8, 4, 0F,0.3F, 0.12F, 0.3F, 0.5F, 0.12F, 0.3F, 0.5F, 0.12F, 0.3F, 0.3F, 0.12F, 0.3F, 1.2F, 0F, 0.3F, -0.7F, 0.8F, 0.5F, -0.7F, 0.8F, 0.5F, 1.2F, 0F, 0.3F); // Box 30
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(0.1F, -1.3F, -2.8F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 26
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.2F, -1.8F, -2.8F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 27
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.6F, 0.5F, -2.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 28
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-0.4F, 1.2F, -2.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 29
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-3F, 2.8F, -2.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 30
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-0.8F, 3.5F, -2.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 31
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.2F, -1.8F, 1.8F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 38
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.6F, 0.5F, 1.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 39
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-3F, 2.8F, 1.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 40
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-0.8F, 3.5F, 1.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 41
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-0.4F, 1.2F, 1.9F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 42
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(0.1F, -1.3F, 1.8F, 50, 50, 1, 0F,0F, 0F, -0.4F, -48F, 0F, -0.4F, -48F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -48F, -0.4F, -48F, -48F, -0.4F, -48F, -48F, -0.4F, 0F, -48F, -0.4F); // Box 43
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);
	}
}