//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pillbox
// Model Creator: 
// Created on: 01.08.2017 - 22:28:32
// Last changed on: 01.08.2017 - 22:28:32

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPillbox extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPillbox() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[16];
		barrelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 16

		bodyModel[0].addShapeBox(0F, 0F, 0F, 40, 10, 80, 0F,0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-40F, 0F, -40F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 40, 10, 80, 0F,0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Box 1
		bodyModel[1].setRotationPoint(-80F, 0F, -40F);

		bodyModel[2].addBox(0F, 0F, 0F, 8, 18, 40, 0F); // Box 2
		bodyModel[2].setRotationPoint(-8F, -18.01F, -20F);

		bodyModel[3].addBox(0F, 0F, 0F, 8, 32, 40, 0F); // Box 3
		bodyModel[3].setRotationPoint(-80F, -32.01F, -20F);

		bodyModel[4].addBox(0F, 0F, 0F, 8, 32, 45, 0F); // Box 4
		bodyModel[4].setRotationPoint(-80F, -32.01F, 20F);
		bodyModel[4].rotateAngleY = -1.10828408F;

		bodyModel[5].addBox(0F, 0F, -45F, 8, 32, 45, 0F); // Box 5
		bodyModel[5].setRotationPoint(-80F, -32.01F, -20F);
		bodyModel[5].rotateAngleY = 1.10828408F;

		bodyModel[6].addBox(-8F, 0F, 0F, 8, 32, 45, 0F); // Box 6
		bodyModel[6].setRotationPoint(-40F, -32.01F, -40F);
		bodyModel[6].rotateAngleY = -1.10828408F;

		bodyModel[7].addBox(-8F, 0F, -45F, 8, 32, 45, 0F); // Box 7
		bodyModel[7].setRotationPoint(-40F, -32.01F, 40F);
		bodyModel[7].rotateAngleY = 1.10828408F;

		bodyModel[8].addBox(0F, 0F, 0F, 8, 14, 8, 0F); // Box 8
		bodyModel[8].setRotationPoint(-8F, -32F, 12F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 14, 8, 0F); // Box 10
		bodyModel[9].setRotationPoint(-8F, -32F, -20F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 43, 4, 86, 0F,0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-40F, -36.01F, -43F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 43, 4, 86, 0F,0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Box 12
		bodyModel[11].setRotationPoint(-83F, -36.01F, -43F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 40, 15, 80, 0F,0F, 0F, -14F, -14F, 0F, -27F, -14F, 0F, -27F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-40F, -51F, -40F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 40, 15, 80, 0F,-14F, 0F, -27F, 0F, 0F, -14F, 0F, 0F, -14F, -14F, 0F, -27F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Box 14
		bodyModel[13].setRotationPoint(-80F, -51F, -40F);

		bodyModel[14].addShapeBox(-1.5F, 0F, -0.5F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 15
		bodyModel[14].setRotationPoint(1.5F, -23F, 0F);
		bodyModel[14].rotateAngleX = 0.6981317F;
		bodyModel[14].rotateAngleZ = -0.13962634F;

		bodyModel[15].addShapeBox(-1.5F, 0F, -0.5F, 1, 7, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 16
		bodyModel[15].setRotationPoint(1.5F, -23F, 0F);
		bodyModel[15].rotateAngleX = -0.6981317F;
		bodyModel[15].rotateAngleZ = -0.13962634F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		barrelModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 18
		barrelModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		barrelModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 20
		barrelModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 21
		barrelModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 22
		barrelModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 23
		barrelModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 24
		barrelModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 25
		barrelModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 26

		barrelModel[0].addShapeBox(-6F, -1F, -1F, 5, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 17
		barrelModel[0].setRotationPoint(0F, -23.5F, 0F);

		barrelModel[1].addShapeBox(1F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 18
		barrelModel[1].setRotationPoint(0F, -23.5F, 0F);

		barrelModel[2].addShapeBox(9F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Box 19
		barrelModel[2].setRotationPoint(0F, -23.5F, 0F);

		barrelModel[3].addShapeBox(1F, 0F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Box 20
		barrelModel[3].setRotationPoint(0F, -23.5F, 0F);

		barrelModel[4].addShapeBox(-11F, -1F, -1F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.7F, 0F); // Box 21
		barrelModel[4].setRotationPoint(0F, -23.5F, 0F);

		barrelModel[5].addShapeBox(-1F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 22
		barrelModel[5].setRotationPoint(0F, -23.5F, 0F);

		barrelModel[6].addShapeBox(8F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 23
		barrelModel[6].setRotationPoint(0F, -23.5F, 0F);

		barrelModel[7].addShapeBox(-4F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 24
		barrelModel[7].setRotationPoint(0F, -23.5F, 0F);

		barrelModel[8].addShapeBox(-3.5F, -0.8F, 0F, 2, 1, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 25
		barrelModel[8].setRotationPoint(0F, -23.5F, 0F);
		barrelModel[8].rotateAngleX = -0.20943951F;
		barrelModel[8].rotateAngleZ = 0.03490659F;

		barrelModel[9].addShapeBox(-6F, 0.8F, -0.5F, 1, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, -0.3F, 0.1F, -0.1F, -0.3F, 0.1F, -0.1F, 0.3F, -0.1F, -0.1F); // Box 26
		barrelModel[9].setRotationPoint(0F, -23.5F, 0F);
	}
}