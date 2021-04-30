//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.03.2016 - 17:28:40
// Last changed on: 22.03.2016 - 17:28:40

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPT24 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPT24() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[37];
		defaultBarrelModel = new ModelRendererTurbo[1];
		ammoModel = new ModelRendererTurbo[4];
		slideModel = new ModelRendererTurbo[35];

		initgunModel_1();
		initdefaultBarrelModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 90, 99, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 90, 99, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 90, 99, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 90, 135, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[10] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[12] = new ModelRendererTurbo(this, 90, 99, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 90, 99, textureX, textureY); // Box 0
		gunModel[14] = new ModelRendererTurbo(this, 150, 10, textureX, textureY); // Box 0
		gunModel[15] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[18] = new ModelRendererTurbo(this, 99, 199, textureX, textureY); // Box 0
		gunModel[19] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[20] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[21] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[22] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[23] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[24] = new ModelRendererTurbo(this, 80, 135, textureX, textureY); // Box 0
		gunModel[25] = new ModelRendererTurbo(this, 90, 99, textureX, textureY); // Box 0
		gunModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[33] = new ModelRendererTurbo(this, 25, 200, textureX, textureY); // Box 0
		gunModel[34] = new ModelRendererTurbo(this, 25, 200, textureX, textureY); // Box 0
		gunModel[35] = new ModelRendererTurbo(this, 25, 200, textureX, textureY); // Box 0
		gunModel[36] = new ModelRendererTurbo(this, 25, 200, textureX, textureY); // Box 0

		gunModel[0].addBox(0F, 0F, 0F, 22, 40, 13, 0F); // Box 0
		gunModel[0].setRotationPoint(-36F, -29F, -6F);
		gunModel[0].rotateAngleZ = -0.17453293F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 40, 13, 0F,0F, -27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 0
		gunModel[1].setRotationPoint(-42F, -29F, -6F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addBox(0F, 0F, 0F, 24, 5, 13, 0F); // Box 0
		gunModel[2].setRotationPoint(-46F, 10F, -6F);
		gunModel[2].rotateAngleZ = -0.05235988F;

		gunModel[3].addBox(0F, 0F, 0F, 3, 5, 13, 0F); // Box 0
		gunModel[3].setRotationPoint(-46F, 15F, -6F);
		gunModel[3].rotateAngleZ = -0.05235988F;

		gunModel[4].addBox(0F, 0F, 0F, 56, 11, 13, 0F); // Box 0
		gunModel[4].setRotationPoint(-39F, -38F, -6F);

		gunModel[5].addBox(0F, 0F, 0F, 20, 14, 13, 0F); // Box 0
		gunModel[5].setRotationPoint(-35F, -38F, -6F);

		gunModel[6].addBox(0F, 0F, 0F, 31, 4, 13, 0F); // Box 0
		gunModel[6].setRotationPoint(17F, -38F, -6F);

		gunModel[7].addBox(0F, 0F, 0F, 31, 2, 9, 0F); // Box 0
		gunModel[7].setRotationPoint(17F, -34F, -4F);

		gunModel[8].addBox(0F, 0F, 0F, 6, 2, 12, 0F); // Box 0
		gunModel[8].setRotationPoint(42F, -32F, -5.5F);

		gunModel[9].addBox(0F, 0F, 0F, 9, 2, 12, 0F); // Box 0
		gunModel[9].setRotationPoint(30F, -32F, -5.5F);

		gunModel[10].addBox(0F, 0F, 0F, 11, 2, 12, 0F); // Box 0
		gunModel[10].setRotationPoint(17F, -32F, -5.5F);

		gunModel[11].addBox(0F, 0F, 0F, 11, 2, 12, 0F); // Box 0
		gunModel[11].setRotationPoint(16F, -30F, -5.5F);
		gunModel[11].rotateAngleZ = 0.19198622F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 13, 13, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[12].setRotationPoint(-17F, -11F, -6F);
		gunModel[12].rotateAngleZ = -0.17453293F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 13, 13, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[13].setRotationPoint(-19F, -1F, -6F);
		gunModel[13].rotateAngleZ = -0.17453293F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 13, 13, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[14].setRotationPoint(-15F, -23F, -6F);
		gunModel[14].rotateAngleZ = -0.17453293F;

		gunModel[15].addBox(0F, 0F, 0F, 9, 2, 9, 0F); // Box 0
		gunModel[15].setRotationPoint(-14F, -17F, -4F);
		gunModel[15].rotateAngleZ = -0.33161256F;

		gunModel[16].addBox(0F, 0F, 0F, 8, 2, 9, 0F); // Box 0
		gunModel[16].setRotationPoint(-6F, -14.2F, -4F);
		gunModel[16].rotateAngleZ = -0.08726646F;

		gunModel[17].addBox(0F, 0F, 0F, 14, 2, 9, 0F); // Box 0
		gunModel[17].setRotationPoint(1F, -13.5F, -4F);
		gunModel[17].rotateAngleZ = 0.17453293F;

		gunModel[18].addBox(0F, 0F, 0F, 20, 7, 13, 0F); // Box 0
		gunModel[18].setRotationPoint(-34F, -32F, -6F);
		gunModel[18].rotateAngleZ = -0.05235988F;

		gunModel[19].addBox(0F, 0F, 0F, 2, 13, 9, 0F); // Box 0
		gunModel[19].setRotationPoint(12F, -27.5F, -4F);

		gunModel[20].addBox(0F, 0F, 0F, 2, 8, 9, 0F); // Box 0
		gunModel[20].setRotationPoint(14F, -28.5F, -4F);
		gunModel[20].rotateAngleZ = -0.26179939F;

		gunModel[21].addBox(0F, 0F, 0F, 2, 8, 9, 0F); // Box 0
		gunModel[21].setRotationPoint(9F, -28.5F, -4F);
		gunModel[21].rotateAngleZ = 0.45378561F;

		gunModel[22].addBox(0F, 0F, 0F, 2, 5, 9, 0F); // Box 0
		gunModel[22].setRotationPoint(12F, -18.5F, -4F);
		gunModel[22].rotateAngleZ = 0.26179939F;

		gunModel[23].addShapeBox(0F, 0F, 0F, 12, 11, 13, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 0
		gunModel[23].setRotationPoint(-51F, -38F, -6F);

		gunModel[24].addBox(0F, 0F, 0F, 12, 4, 13, 0F); // Box 0
		gunModel[24].setRotationPoint(-51F, -38F, -6F);

		gunModel[25].addBox(0F, 0F, 0F, 14, 7, 13, 0F); // Box 0
		gunModel[25].setRotationPoint(-36.1F, -31F, -6F);
		gunModel[25].rotateAngleZ = -1.04719755F;

		gunModel[26].addBox(0F, 0F, 0F, 31, 3, 3, 0F); // Box 0
		gunModel[26].setRotationPoint(17.5F, -39F, -1F);

		gunModel[27].addBox(0F, 0F, 0F, 4, 7, 5, 0F); // Box 0
		gunModel[27].setRotationPoint(-4F, -28.2F, -2F);
		gunModel[27].rotateAngleZ = -0.2268928F;

		gunModel[28].addBox(0F, 0F, 0F, 4, 5, 5, 0F); // Box 0
		gunModel[28].setRotationPoint(-5.5F, -21.5F, -2F);
		gunModel[28].rotateAngleZ = 0.36651914F;

		gunModel[29].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		gunModel[29].setRotationPoint(-1.5F, -18.5F, -2F);
		gunModel[29].rotateAngleZ = 0.9250245F;

		gunModel[30].addBox(0F, 0F, 0F, 3, 4, 5, 0F); // Box 0
		gunModel[30].setRotationPoint(-3.6F, -16.9F, -2F);
		gunModel[30].rotateAngleZ = 0.99483767F;

		gunModel[31].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 0
		gunModel[31].setRotationPoint(-0.5F, -16.8F, -2F);
		gunModel[31].rotateAngleZ = 0.12217305F;

		gunModel[32].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 0
		gunModel[32].setRotationPoint(0.5F, -15.8F, -2F);
		gunModel[32].rotateAngleZ = 0.43633231F;

		gunModel[33].addBox(0F, 0F, 0F, 9, 4, 13, 0F); // Box 0
		gunModel[33].setRotationPoint(-25F, -37F, -5F);
		gunModel[33].rotateAngleZ = -0.01745329F;

		gunModel[34].addBox(0F, 0F, 0F, 10, 5, 13, 0F); // Box 0
		gunModel[34].setRotationPoint(-38F, -38F, -5F);
		gunModel[34].rotateAngleZ = 0.03490659F;

		gunModel[35].addBox(0F, 0F, 0F, 8, 4, 13, 0F); // Box 0
		gunModel[35].setRotationPoint(-14F, -37F, -5F);
		gunModel[35].rotateAngleZ = 0.03490659F;

		gunModel[36].addBox(0F, 0F, 0F, 4, 5, 13, 0F); // Box 0
		gunModel[36].setRotationPoint(-22F, -19F, -5F);
		gunModel[36].rotateAngleZ = -0.17453293F;
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Box 0

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 31, 5, 5, 0F); // Box 0
		defaultBarrelModel[0].setRotationPoint(17.5F, -48F, -2F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 231, 80, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		ammoModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		ammoModel[3] = new ModelRendererTurbo(this, 14, 221, textureX, textureY); // Box 0

		ammoModel[0].addBox(0F, 0F, 0F, 17, 40, 11, 0F); // Box 0
		ammoModel[0].setRotationPoint(-34F, -24F, -5F);
		ammoModel[0].rotateAngleZ = -0.17453293F;

		ammoModel[1].addBox(0F, 0F, 0F, 18, 5, 13, 0F); // Box 0
		ammoModel[1].setRotationPoint(-42F, 15F, -6F);
		ammoModel[1].rotateAngleZ = -0.10471976F;

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 5, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 0
		ammoModel[2].setRotationPoint(-24F, 17F, -6F);
		ammoModel[2].rotateAngleZ = -0.10471976F;

		ammoModel[3].addBox(0F, 0F, 0F, 15, 6, 6, 0F); // Box 0
		ammoModel[3].setRotationPoint(-33F, -27F, -2F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[12] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[23] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[24] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[27] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[28] = new ModelRendererTurbo(this, 90, 25, textureX, textureY); // Box 0
		slideModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[31] = new ModelRendererTurbo(this, 90, 25, textureX, textureY); // Box 0
		slideModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		slideModel[34] = new ModelRendererTurbo(this, 90, 25, textureX, textureY); // Box 0

		slideModel[0].addBox(0F, 0F, 0F, 45, 10, 11, 0F); // Box 0
		slideModel[0].setRotationPoint(-48F, -48F, -5F);

		slideModel[1].addBox(0F, 0F, 0F, 14, 10, 12, 0F); // Box 0
		slideModel[1].setRotationPoint(-17F, -48F, -5F);

		slideModel[2].addBox(0F, 0F, 0F, 35, 10, 13, 0F); // Box 0
		slideModel[2].setRotationPoint(13F, -48F, -6F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 5, 10, 13, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[3].setRotationPoint(-51F, -48F, -6F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[4].setRotationPoint(-44F, -48F, -6F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[5].setRotationPoint(-41F, -48F, -6F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[6].setRotationPoint(-38F, -48F, -6F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[7].setRotationPoint(-35F, -48F, -6F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[8].setRotationPoint(-32F, -48F, -6F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[9].setRotationPoint(-29F, -48F, -6F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[10].setRotationPoint(-26F, -48F, -6F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 6, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[11].setRotationPoint(-23F, -48F, -6F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 4, 10, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[12].setRotationPoint(-50F, -48F, -6F);

		slideModel[13].addBox(0F, 0F, 0F, 35, 4, 11, 0F); // Box 0
		slideModel[13].setRotationPoint(13F, -52F, -5F);

		slideModel[14].addBox(0F, 0F, 0F, 45, 4, 11, 0F); // Box 0
		slideModel[14].setRotationPoint(-48F, -52F, -5F);

		slideModel[15].addBox(0F, 0F, 0F, 16, 9, 11, 0F); // Box 0
		slideModel[15].setRotationPoint(-3F, -51.5F, -5F);

		slideModel[16].addBox(0F, 0F, 0F, 16, 5, 1, 0F); // Box 0
		slideModel[16].setRotationPoint(-3F, -43F, -6F);

		slideModel[17].addBox(0F, 0F, 0F, 16, 10, 1, 0F); // Box 0
		slideModel[17].setRotationPoint(-3F, -48F, 6F);

		slideModel[18].addBox(0F, 0F, 0F, 11, 10, 11, 0F); // Box 0
		slideModel[18].setRotationPoint(-17F, -48F, -6F);

		slideModel[19].addBox(0F, 0F, 0F, 11, 5, 11, 0F); // Box 0
		slideModel[19].setRotationPoint(-14F, -43F, -6F);

		slideModel[20].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[20].setRotationPoint(-6F, -48F, -6F);

		slideModel[21].addShapeBox(0F, 0F, 0F, 45, 4, 1, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[21].setRotationPoint(-48F, -52F, -6F);

		slideModel[22].addShapeBox(0F, 0F, 0F, 35, 4, 1, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[22].setRotationPoint(13F, -52F, -6F);

		slideModel[23].addShapeBox(0F, 0F, 0F, 35, 0, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[23].setRotationPoint(13F, -48F, 6F);

		slideModel[24].addShapeBox(0F, 0F, 0F, 45, 0, 1, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[24].setRotationPoint(-48F, -48F, 6F);

		slideModel[25].addBox(0F, 0F, 0F, 6, 5, 1, 0F); // Box 0
		slideModel[25].setRotationPoint(9F, -42F, -6F);
		slideModel[25].rotateAngleZ = 0.57595865F;

		slideModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[26].setRotationPoint(43F, -54F, -0.5F);

		slideModel[27].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 0
		slideModel[27].setRotationPoint(37F, -54F, -0.5F);

		slideModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[28].setRotationPoint(36F, -54F, -0.5F);

		slideModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[29].setRotationPoint(-38F, -54F, -3F);

		slideModel[30].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 0
		slideModel[30].setRotationPoint(-44F, -54F, -3F);

		slideModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[31].setRotationPoint(-45F, -54F, -3F);

		slideModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[32].setRotationPoint(-38F, -54F, 2F);

		slideModel[33].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 0
		slideModel[33].setRotationPoint(-44F, -54F, 2F);

		slideModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[34].setRotationPoint(-45F, -54F, 2F);
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(35F, -16F, 0F);
		gunSlideDistance = 1F;
		
		
	}
}