//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 26.06.2016 - 10:13:52
// Last changed on: 26.06.2016 - 10:13:52

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTT33Ultimate extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTT33Ultimate() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[22];
		defaultBarrelModel = new ModelRendererTurbo[1];
		ammoModel = new ModelRendererTurbo[8];
		slideModel = new ModelRendererTurbo[31];

		initgunModel_1();
		initdefaultBarrelModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 94, 67, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[10] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[11] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[12] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[13] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[14] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 0
		gunModel[15] = new ModelRendererTurbo(this, 412, 75, textureX, textureY); // Box 0
		gunModel[16] = new ModelRendererTurbo(this, 412, 75, textureX, textureY); // Box 0
		gunModel[17] = new ModelRendererTurbo(this, 50, 2, textureX, textureY); // Box 0
		gunModel[18] = new ModelRendererTurbo(this, 200, 154, textureX, textureY); // Box 0
		gunModel[19] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 0
		gunModel[20] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 0
		gunModel[21] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Box 0

		gunModel[0].addBox(0F, 0F, 0F, 41, 73, 16, 0F); // Box 0
		gunModel[0].setRotationPoint(-68F, -82F, 0F);
		gunModel[0].rotateAngleZ = -0.19198622F;

		gunModel[1].addShapeBox(0F, 0F, 0F, 40, 1, 16, 0F,0F, 9F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[1].setRotationPoint(-81F, -2F, 0F);

		gunModel[2].addBox(0F, 0F, 0F, 133, 13, 16, 0F); // Box 0
		gunModel[2].setRotationPoint(-88F, -87F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 19, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); // Box 0
		gunModel[3].setRotationPoint(-88F, -74F, 0F);

		gunModel[4].addBox(0F, 0F, 0F, 132, 2, 14, 0F); // Box 0
		gunModel[4].setRotationPoint(-87F, -88F, 1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 20, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 0F); // Box 0
		gunModel[5].setRotationPoint(4F, -74F, 2F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 4, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[6].setRotationPoint(10.5F, -67.5F, 2F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 7, 12, 0F); // Box 0
		gunModel[7].setRotationPoint(10.7F, -61.5F, 2F);
		gunModel[7].rotateAngleZ = -0.50614548F;

		gunModel[8].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Box 0
		gunModel[8].setRotationPoint(7.6F, -55.9F, 2F);
		gunModel[8].rotateAngleZ = -0.78539816F;

		gunModel[9].addBox(0F, 0F, 0F, 7, 2, 12, 0F); // Box 0
		gunModel[9].setRotationPoint(-1.6F, -50.5F, 2F);
		gunModel[9].rotateAngleZ = 0.33161256F;

		gunModel[10].addBox(0F, 0F, 0F, 34, 2, 12, 0F); // Box 0
		gunModel[10].setRotationPoint(-34.6F, -50.5F, 2F);
		gunModel[10].rotateAngleZ = 0.00698132F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 20, 7, 12, 0F,0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[11].setRotationPoint(-34.6F, -57.5F, 2F);
		gunModel[11].rotateAngleZ = 0.00698132F;

		gunModel[12].addBox(0F, 0F, 0F, 19, 12, 16, 0F); // Box 0
		gunModel[12].setRotationPoint(-44.6F, -69.5F, 0F);
		gunModel[12].rotateAngleZ = 0.00698132F;

		gunModel[13].addShapeBox(0F, 0F, 0F, 9, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[13].setRotationPoint(-28.6F, -74.5F, 0F);
		gunModel[13].rotateAngleZ = 0.00698132F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		gunModel[14].setRotationPoint(-77.5F, -102F, 3.5F);

		gunModel[15].addBox(0F, 0F, 0F, 35, 67, 1, 0F); // Box 0
		gunModel[15].setRotationPoint(-65F, -80F, 16F);
		gunModel[15].rotateAngleZ = -0.19198622F;

		gunModel[16].addBox(0F, 0F, 0F, 35, 67, 1, 0F); // Box 0
		gunModel[16].setRotationPoint(-65F, -80F, -1F);
		gunModel[16].rotateAngleZ = -0.19198622F;

		gunModel[17].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 0
		gunModel[17].setRotationPoint(-32.6F, -59.5F, 16F);
		gunModel[17].rotateAngleZ = 0.00698132F;

		gunModel[18].addShapeBox(0F, 0F, 0F, 19, 19, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[18].setRotationPoint(-44.6F, -57.5F, 0F);
		gunModel[18].rotateAngleZ = 0.00698132F;

		gunModel[19].addShapeBox(0F, 0F, 0F, 32, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 0
		gunModel[19].setRotationPoint(-35F, -87F, 16F);

		gunModel[20].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 0
		gunModel[20].setRotationPoint(-35F, -89F, 16F);

		gunModel[21].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 0
		gunModel[21].setRotationPoint(-33F, -87F, 18F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 22, 468, textureX, textureY); // Box 0

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 133, 10, 10, 0F); // Box 0
		defaultBarrelModel[0].setRotationPoint(-44F, -101F, 3F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 10, 185, textureX, textureY); // Box 0
		ammoModel[1] = new ModelRendererTurbo(this, 10, 185, textureX, textureY); // Box 0
		ammoModel[2] = new ModelRendererTurbo(this, 92, 279, textureX, textureY); // Box 0
		ammoModel[3] = new ModelRendererTurbo(this, 92, 279, textureX, textureY); // Box 0
		ammoModel[4] = new ModelRendererTurbo(this, 33, 279, textureX, textureY); // Box 0
		ammoModel[5] = new ModelRendererTurbo(this, 285, 279, textureX, textureY); // Box 0
		ammoModel[6] = new ModelRendererTurbo(this, 10, 185, textureX, textureY); // Box 0
		ammoModel[7] = new ModelRendererTurbo(this, 14, 364, textureX, textureY); // Box 0

		ammoModel[0].addBox(0F, 0F, 0F, 8, 67, 10, 0F); // Box 0
		ammoModel[0].setRotationPoint(-67F, -65F, 3F);
		ammoModel[0].rotateAngleZ = -0.19198622F;

		ammoModel[1].addBox(0F, 0F, 0F, 19, 64, 10, 0F); // Box 0
		ammoModel[1].setRotationPoint(-56F, -62F, 3F);
		ammoModel[1].rotateAngleZ = -0.19198622F;

		ammoModel[2].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 0
		ammoModel[2].setRotationPoint(-63F, -66.5F, 8F);
		ammoModel[2].rotateAngleZ = -0.26179939F;

		ammoModel[3].addBox(0F, 0F, 0F, 13, 5, 5, 0F); // Box 0
		ammoModel[3].setRotationPoint(-61F, -67F, 7F);
		ammoModel[3].rotateAngleZ = -0.26179939F;

		ammoModel[4].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 0
		ammoModel[4].setRotationPoint(-63F, -67.8F, 7F);
		ammoModel[4].rotateAngleZ = -0.26179939F;

		ammoModel[5].addTrapezoid(0F, 0F, 0F, 5, 5, 5, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 0
		ammoModel[5].setRotationPoint(-49F, -64F, 7F);
		ammoModel[5].rotateAngleZ = -0.26179939F;

		ammoModel[6].addBox(0F, 0F, 0F, 8, 67, 10, 0F); // Box 0
		ammoModel[6].setRotationPoint(-61F, -63F, 3F);
		ammoModel[6].rotateAngleZ = -0.19198622F;

		ammoModel[7].addBox(0F, 0F, 0F, 37, 6, 14, 0F); // Box 0
		ammoModel[7].setRotationPoint(-80F, 0F, 1F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 20, 305, textureX, textureY); // Box 0
		slideModel[1] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[2] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[3] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[4] = new ModelRendererTurbo(this, 110, 47, textureX, textureY); // Box 0
		slideModel[5] = new ModelRendererTurbo(this, 33, 345, textureX, textureY); // Box 0
		slideModel[6] = new ModelRendererTurbo(this, 251, 318, textureX, textureY); // Box 0
		slideModel[7] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[8] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[9] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[10] = new ModelRendererTurbo(this, 66, 399, textureX, textureY); // Box 0
		slideModel[11] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[12] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[13] = new ModelRendererTurbo(this, 200, 29, textureX, textureY); // Box 0
		slideModel[14] = new ModelRendererTurbo(this, 200, 29, textureX, textureY); // Box 0
		slideModel[15] = new ModelRendererTurbo(this, 200, 29, textureX, textureY); // Box 0
		slideModel[16] = new ModelRendererTurbo(this, 200, 29, textureX, textureY); // Box 0
		slideModel[17] = new ModelRendererTurbo(this, 200, 29, textureX, textureY); // Box 0
		slideModel[18] = new ModelRendererTurbo(this, 200, 29, textureX, textureY); // Box 0
		slideModel[19] = new ModelRendererTurbo(this, 200, 29, textureX, textureY); // Box 0
		slideModel[20] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 0
		slideModel[21] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 0
		slideModel[22] = new ModelRendererTurbo(this, 0, 98, textureX, textureY); // Box 0
		slideModel[23] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[24] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[25] = new ModelRendererTurbo(this, 69, 345, textureX, textureY); // Box 0
		slideModel[26] = new ModelRendererTurbo(this, 69, 345, textureX, textureY); // Box 0
		slideModel[27] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[28] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[29] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0
		slideModel[30] = new ModelRendererTurbo(this, 200, 345, textureX, textureY); // Box 0

		slideModel[0].addBox(0F, 0F, 0F, 41, 14, 14, 0F); // Box 0
		slideModel[0].setRotationPoint(-79F, -102F, 1F);

		slideModel[1].addBox(0F, 0F, 0F, 46, 14, 16, 0F); // Box 0
		slideModel[1].setRotationPoint(-39F, -102F, 0F);

		slideModel[2].addBox(0F, 0F, 0F, 30, 14, 16, 0F); // Box 0
		slideModel[2].setRotationPoint(15F, -102F, 0F);

		slideModel[3].addBox(0F, 0F, 0F, 8, 11, 16, 0F); // Box 0
		slideModel[3].setRotationPoint(7F, -102F, 0F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[4].setRotationPoint(7F, -91F, 15F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 0
		slideModel[5].setRotationPoint(10F, -91F, 15F);

		slideModel[6].addBox(0F, 0F, 0F, 8, 3, 15, 0F); // Box 0
		slideModel[6].setRotationPoint(7F, -91F, 0F);

		slideModel[7].addBox(0F, 0F, 0F, 42, 7, 16, 0F); // Box 0
		slideModel[7].setRotationPoint(45F, -102F, 0F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 42, 8, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		slideModel[8].setRotationPoint(45F, -95F, 0F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 42, 10, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		slideModel[9].setRotationPoint(45F, -87F, 2F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 163, 3, 16, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[10].setRotationPoint(-76F, -105F, 0F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 9, 14, 16, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[11].setRotationPoint(-88F, -102F, 0F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 16, 0F,0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[12].setRotationPoint(-81F, -105F, 0F);

		slideModel[13].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 0
		slideModel[13].setRotationPoint(-52F, -102F, 0F);

		slideModel[14].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 0
		slideModel[14].setRotationPoint(-46F, -102F, 0F);

		slideModel[15].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 0
		slideModel[15].setRotationPoint(-40F, -102F, 0F);

		slideModel[16].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 0
		slideModel[16].setRotationPoint(-58F, -102F, 0F);

		slideModel[17].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 0
		slideModel[17].setRotationPoint(-64F, -102F, 0F);

		slideModel[18].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 0
		slideModel[18].setRotationPoint(-70F, -102F, 0F);

		slideModel[19].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 0
		slideModel[19].setRotationPoint(-76F, -102F, 0F);

		slideModel[20].addBox(0F, 0F, 0F, 19, 24, 6, 0F); // Box 0
		slideModel[20].setRotationPoint(-31.6F, -74.5F, 5F);
		slideModel[20].rotateAngleZ = 0.00698132F;

		slideModel[21].addShapeBox(0F, 0F, 0F, 4, 11, 6, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[21].setRotationPoint(-12.6F, -61.5F, 5F);
		slideModel[21].rotateAngleZ = 0.00698132F;

		slideModel[22].addShapeBox(0F, 0F, 0F, 4, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[22].setRotationPoint(-12.6F, -74.5F, 5F);
		slideModel[22].rotateAngleZ = 0.00698132F;

		slideModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[23].setRotationPoint(-66F, -107F, 3F);

		slideModel[24].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 0
		slideModel[24].setRotationPoint(-65F, -110F, 4F);

		slideModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[25].setRotationPoint(-77.5F, -107F, 3.5F);

		slideModel[26].addBox(0F, 0F, 0F, 7, 3, 9, 0F); // Box 0
		slideModel[26].setRotationPoint(-77.5F, -105F, 3.5F);

		slideModel[27].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 0
		slideModel[27].setRotationPoint(-65F, -110F, 9F);

		slideModel[28].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 0
		slideModel[28].setRotationPoint(77F, -108F, 6.5F);

		slideModel[29].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 0
		slideModel[29].setRotationPoint(83F, -107F, 6.5F);

		slideModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		slideModel[30].setRotationPoint(83F, -108F, 6.5F);
		
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(40F, 4F, -9F);
		gunSlideDistance = 2F;
		
		
	}
}