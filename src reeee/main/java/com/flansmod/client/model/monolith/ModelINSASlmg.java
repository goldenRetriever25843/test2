//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.03.2016 - 18:51:19
// Last changed on: 19.03.2016 - 18:51:19

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelINSASlmg extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelINSASlmg() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[33];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 16
		gunModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		gunModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 18
		gunModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 19
		gunModel[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 21
		gunModel[17] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 25
		gunModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 26
		gunModel[21] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 27
		gunModel[22] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 28
		gunModel[23] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 29
		gunModel[24] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 30
		gunModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 31
		gunModel[26] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 32
		gunModel[27] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 33
		gunModel[28] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 34
		gunModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 39
		gunModel[30] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 40
		gunModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 41
		gunModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 42

		gunModel[0].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(32F, -7F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 1
		gunModel[1].setRotationPoint(55F, -7F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(25F, -9F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 3
		gunModel[3].setRotationPoint(36F, -9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 13, 3, 3, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 1F, 0F); // Box 4
		gunModel[4].setRotationPoint(17F, -8.5F, -1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 7
		gunModel[5].setRotationPoint(51F, -7F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 21, 4, 3, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.5F, -0.2F); // Box 8
		gunModel[6].setRotationPoint(-3.5F, -8F, -1.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F, -1.5F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, -1.5F, 0.2F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 9
		gunModel[7].setRotationPoint(-3.5F, -9F, -1.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 14, 2, 3, 0F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 10
		gunModel[8].setRotationPoint(15.5F, -8.75F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 11
		gunModel[9].setRotationPoint(15.5F, -9.75F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[10].setRotationPoint(4.5F, -9.9F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 16
		gunModel[11].setRotationPoint(25F, -9.7F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 17
		gunModel[12].setRotationPoint(36.5F, -10.45F, -1F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 18
		gunModel[13].setRotationPoint(36.5F, -10.45F, 0F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F, -0.2F, 0.2F, -0.44F); // Box 19
		gunModel[14].setRotationPoint(36.5F, -9.75F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 20
		gunModel[15].setRotationPoint(-1.5F, -10.2F, 0F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 21
		gunModel[16].setRotationPoint(-1.5F, -10.2F, -1F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 23
		gunModel[17].setRotationPoint(-1.5F, -11.6F, 0F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, -0.4F, -0.8F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F); // Box 24
		gunModel[18].setRotationPoint(-1.5F, -11.6F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 16, 7, 3, 0F, 0F, 0F, -0.2F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, -5F, -0.4F, 0F, -5F, -0.4F, 0F, 0.5F, -0.2F); // Box 25
		gunModel[19].setRotationPoint(-19.5F, -6F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 3, 9, 3, 0F, 0.5F, -0.3F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.5F, -0.3F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.5F, 0F); // Box 26
		gunModel[20].setRotationPoint(-22.5F, -6.5F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.3F, 0F); // Box 27
		gunModel[21].setRotationPoint(-3F, -4F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F, -0.5F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.5F, 0.3F, 0F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 28
		gunModel[22].setRotationPoint(-3F, -2.4F, -1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F, 0F, 0F, -0.25F, -0.2F, 1F, -0.25F, -0.2F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 29
		gunModel[23].setRotationPoint(-2F, -1.9F, -1F);
		gunModel[23].rotateAngleZ = -0.34906585F;

		gunModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[24].setRotationPoint(6.3F, -4F, -1F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, 0F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 31
		gunModel[25].setRotationPoint(5.8F, -2F, -0.5F);
		gunModel[25].rotateAngleZ = -0.2443461F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F); // Box 32
		gunModel[26].setRotationPoint(5.8F, -1.5F, -0.5F);
		gunModel[26].rotateAngleZ = -1.57079633F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.45F, 0F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0.2F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 33
		gunModel[27].setRotationPoint(1.5F, -2.7F, -0.5F);
		gunModel[27].rotateAngleZ = 0.33161256F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F); // Box 34
		gunModel[28].setRotationPoint(3F, -3.7F, -0.5F);
		gunModel[28].rotateAngleZ = 0.33161256F;

		gunModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 39
		gunModel[29].setRotationPoint(22F, -9.8F, 0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 40
		gunModel[30].setRotationPoint(25F, -9.8F, 0.5F);

		gunModel[31].addShapeBox(1F, 0F, -0.5F, 15, 1, 1, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[31].setRotationPoint(38F, -7.5F, 1F);
		gunModel[31].rotateAngleY = 1.57079633F;
		gunModel[31].rotateAngleZ = -2.02458193F;

		gunModel[32].addShapeBox(0F, 0F, -0.5F, 15, 1, 1, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[32].setRotationPoint(38F, -7F, 0.5F);
		gunModel[32].rotateAngleY = 1.57079633F;
		gunModel[32].rotateAngleZ = -1.13446401F;


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 12
		ammoModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 13
		ammoModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 14
		ammoModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 40

		ammoModel[0].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 12
		ammoModel[0].setRotationPoint(8F, -4.2F, -1F);
		ammoModel[0].rotateAngleZ = 0.08726646F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
		ammoModel[1].setRotationPoint(8.2F, -2.2F, -1F);
		ammoModel[1].rotateAngleZ = 0.12217305F;

		ammoModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 14
		ammoModel[2].setRotationPoint(8.6F, 0.8F, -1F);
		ammoModel[2].rotateAngleZ = 0.27925268F;

		ammoModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 40
		ammoModel[3].setRotationPoint(9.55F, 4.2F, -1F);
		ammoModel[3].rotateAngleZ = 0.40142573F;
		
		animationType = EnumAnimationType.PISTOL_CLIP;
		translateAll(0F, -0.5F, 0F);



		translateAll(0F, -3F, 0F);


		flipAll();
	}
}