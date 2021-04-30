//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CompositeBow
// Model Creator: 
// Created on: 28.03.2019 - 18:38:48
// Last changed on: 28.03.2019 - 18:38:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanjegan extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 64;

	public ModelPanjegan() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		ammoModel = new ModelRendererTurbo[2];
		slideModel = new ModelRendererTurbo[2];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 24
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 27
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 28
		gunModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 9
		gunModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 10
		gunModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		gunModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 16
		gunModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 17
		gunModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 18
		gunModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 19
		gunModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 15

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[0].setRotationPoint(2F, -5F, 0F);
		gunModel[0].rotateAngleZ = -0.45378561F;

		gunModel[1].addShapeBox(-1F, -4F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		gunModel[1].setRotationPoint(3F, -4.5F, 0F);
		gunModel[1].rotateAngleZ = -0.20943951F;

		gunModel[2].addShapeBox(-3F, -12F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 28
		gunModel[2].setRotationPoint(5.5F, -5.2F, 0F);
		gunModel[2].rotateAngleZ = 0.29670597F;

		gunModel[3].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 9
		gunModel[3].setRotationPoint(1F, -2F, 0F);
		gunModel[3].rotateAngleZ = 0.36651914F;

		gunModel[4].addShapeBox(-1F, -4F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 10
		gunModel[4].setRotationPoint(3.7F, -8.5F, 0F);
		gunModel[4].rotateAngleZ = 0.13962634F;

		gunModel[5].addShapeBox(-3F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 11
		gunModel[5].setRotationPoint(0.5F, -20F, 0F);
		gunModel[5].rotateAngleZ = -0.03490659F;

		gunModel[6].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 16
		gunModel[6].setRotationPoint(3.1F, 0.2F, 0F);
		gunModel[6].rotateAngleZ = 0.20943951F;

		gunModel[7].addBox(-1F, 0F, 0F, 1, 4, 1, 0F); // Box 17
		gunModel[7].setRotationPoint(3.6F, 3F, 0F);
		gunModel[7].rotateAngleZ = -0.13962634F;

		gunModel[8].addShapeBox(-3F, 11.8F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 18
		gunModel[8].setRotationPoint(8.3F, -3.7F, 0F);
		gunModel[8].rotateAngleZ = -0.27925268F;

		gunModel[9].addShapeBox(-3F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 19
		gunModel[9].setRotationPoint(2.1F, 10F, 0F);
		gunModel[9].rotateAngleZ = 0.03490659F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 15
		gunModel[10].setRotationPoint(-9F, -2.8F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		ammoModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 31
		ammoModel[0].setRotationPoint(-8.5F, -2.8F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.48F, -0.48F, 0F, -0.48F, -0.48F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.48F, -0.48F, 0F, -0.48F, -0.48F, 0F, -0.3F, -0.3F); // Box 16
		ammoModel[1].setRotationPoint(-5.5F, -2.8F, -0.5F);
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.SHOTGUN;
		numBulletsInReloadAnimation = 5;
		tiltGunTime = 0.204F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.625F;
		untiltGunTime = 0.171F;
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 29
		slideModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 20

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -2.3F, 0F, -0.3F, 1.7F, 0F, -0.3F, 1.7F, 0F, -0.3F, -2.3F, 0F, -0.3F); // Box 29
		slideModel[0].setRotationPoint(-1.5F, -18F, 1F);
		slideModel[0].rotateAngleY = 3.14159265F;

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-2.3F, 0F, -0.3F, 1.7F, 0F, -0.3F, 1.7F, 0F, -0.3F, -2.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 20
		slideModel[1].setRotationPoint(-1.5F, -2F, 1F);
		slideModel[1].rotateAngleY = 3.14159265F;
	}
	

}