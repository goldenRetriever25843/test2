//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.03.2016 - 09:33:59
// Last changed on: 25.03.2016 - 09:33:59

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMILAN extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMILAN() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[19];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		gunModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 19
		gunModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 21
		gunModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 22
		gunModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 23
		gunModel[16] = new ModelRendererTurbo(this, 118, 5, textureX, textureY); // Box 27
		gunModel[17] = new ModelRendererTurbo(this, 118, 5, textureX, textureY); // Box 28
		gunModel[18] = new ModelRendererTurbo(this, 118, 5, textureX, textureY); // Box 29

		gunModel[0].addShapeBox(0F, 0F, 0F, 33, 1, 4, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F); // Box 0
		gunModel[0].setRotationPoint(-25F, -6F, -2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 33, 2, 4, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-25F, -8F, -2F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 33, 1, 4, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-25F, -9F, -2F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 4
		gunModel[3].setRotationPoint(-28F, -8F, -2F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 5
		gunModel[4].setRotationPoint(-28F, -9F, -2F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 6
		gunModel[5].setRotationPoint(-28F, -6F, -2F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[6].setRotationPoint(0F, -3F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 22, 1, 2, 0F); // Box 8
		gunModel[7].setRotationPoint(-15F, -5F, -1F);

		gunModel[8].addBox(0F, 0F, 0F, 24, 1, 4, 0F); // Box 9
		gunModel[8].setRotationPoint(-16F, -4F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 9, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 10
		gunModel[9].setRotationPoint(-3F, -10F, 2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 9, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 13
		gunModel[10].setRotationPoint(-3F, -10F, 2F);

		gunModel[11].addBox(0F, 0F, 0F, 22, 1, 2, 0F); // Box 18
		gunModel[11].setRotationPoint(-15F, -5F, -1F);

		gunModel[12].addBox(0F, 0F, 0F, 24, 1, 4, 0F); // Box 19
		gunModel[12].setRotationPoint(-16F, -4F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 21
		gunModel[13].setRotationPoint(-28F, -6F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 22
		gunModel[14].setRotationPoint(-28F, -8F, -2F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 23
		gunModel[15].setRotationPoint(-28F, -9F, -2F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[16].setRotationPoint(-2F, -9F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 7F, 0F, 0F); // Box 28
		gunModel[17].setRotationPoint(-3F, -12F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[18].setRotationPoint(-10F, -9F, -0.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 11
		ammoModel[1] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 25
		ammoModel[2] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 26

		ammoModel[0].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 11
		ammoModel[0].setRotationPoint(-9F, -8F, -1F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 25
		ammoModel[1].setRotationPoint(1F, -8F, -1F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 26
		ammoModel[2].setRotationPoint(0F, -8F, -1F);


		animationType = EnumAnimationType.END_LOADED;
		translateAll(2F, 0F, 0F);


		flipAll();
	}
}