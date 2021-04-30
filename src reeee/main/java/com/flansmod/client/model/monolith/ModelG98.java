//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.02.2016 - 09:30:16
// Last changed on: 24.02.2016 - 09:30:16

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG98 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelG98() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[40];
		defaultBarrelModel = new ModelRendererTurbo[39];
		defaultStockModel = new ModelRendererTurbo[51];
		ammoModel = new ModelRendererTurbo[61];
		pumpModel = new ModelRendererTurbo[10];

		initgunModel_1();
		initdefaultBarrelModel_1();
		initdefaultStockModel_1();
		initammoModel_1();
		initpumpModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, -4, 39, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 2, 50, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 61, 63, textureX, textureY); // Box 1
		gunModel[3] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 37
		gunModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 39
		gunModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 40
		gunModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 41
		gunModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 42
		gunModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 43
		gunModel[9] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 44
		gunModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 45
		gunModel[11] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 46
		gunModel[12] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 47
		gunModel[13] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 48
		gunModel[14] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 49
		gunModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 50
		gunModel[16] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 51
		gunModel[17] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 52
		gunModel[18] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 53
		gunModel[19] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 0
		gunModel[20] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 1
		gunModel[21] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 2
		gunModel[22] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 7
		gunModel[23] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 16
		gunModel[24] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 17
		gunModel[25] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 18
		gunModel[26] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 19
		gunModel[27] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 20
		gunModel[28] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 21
		gunModel[29] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 22
		gunModel[30] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 23
		gunModel[31] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 45
		gunModel[32] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 46
		gunModel[33] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 47
		gunModel[34] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 48
		gunModel[35] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 6
		gunModel[36] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 7
		gunModel[37] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 8
		gunModel[38] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 9
		gunModel[39] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 11

		gunModel[0].addShapeBox(-11.5F, 0F, -0.5F, 42, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 1
		gunModel[0].setRotationPoint(25F, -11.7F, 0F);

		gunModel[1].addShapeBox(-11.5F, 0F, -0.5F, 42, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(25F, -11.7F, 0F);

		gunModel[2].addShapeBox(-11.5F, 0F, -0.5F, 42, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 1
		gunModel[2].setRotationPoint(25F, -11.7F, 0F);

		gunModel[3].addShapeBox(0F, 0.1F, -1F, 1, 1, 2, 0F,0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 37
		gunModel[3].setRotationPoint(45F, -11.7F, 0F);

		gunModel[4].addShapeBox(0F, 1.1F, -1F, 1, 1, 2, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 39
		gunModel[4].setRotationPoint(45F, -11.7F, 0F);

		gunModel[5].addShapeBox(0F, 1.1F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F); // Box 40
		gunModel[5].setRotationPoint(45F, -11.7F, 0F);

		gunModel[6].addShapeBox(0F, 1.1F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F); // Box 41
		gunModel[6].setRotationPoint(47F, -11.7F, 0F);

		gunModel[7].addShapeBox(0F, 1.1F, -1F, 1, 1, 2, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 42
		gunModel[7].setRotationPoint(47F, -11.7F, 0F);

		gunModel[8].addShapeBox(0F, 0.1F, -1F, 1, 1, 2, 0F,0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 43
		gunModel[8].setRotationPoint(47F, -11.7F, 0F);

		gunModel[9].addShapeBox(0F, 1.1F, -1F, 1, 1, 2, 0F,0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 44
		gunModel[9].setRotationPoint(46F, -11.7F, 0F);

		gunModel[10].addShapeBox(0F, 0.1F, -1F, 1, 1, 2, 0F,0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 45
		gunModel[10].setRotationPoint(46F, -11.7F, 0F);

		gunModel[11].addShapeBox(0F, 1.1F, -1F, 1, 1, 2, 0F,0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 46
		gunModel[11].setRotationPoint(46F, -11.7F, 0F);

		gunModel[12].addShapeBox(0F, 0.7F, -0.5F, 3, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 47
		gunModel[12].setRotationPoint(48F, -11.7F, 0F);

		gunModel[13].addShapeBox(0F, 1.3F, -0.5F, 6, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F); // Box 48
		gunModel[13].setRotationPoint(48F, -11.7F, 0F);

		gunModel[14].addShapeBox(0F, 1.3F, -0.5F, 6, 1, 1, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 49
		gunModel[14].setRotationPoint(48F, -11.7F, 0F);

		gunModel[15].addShapeBox(0F, 1.3F, -0.5F, 6, 1, 1, 0F,0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 50
		gunModel[15].setRotationPoint(48F, -11.7F, 0F);

		gunModel[16].addShapeBox(6F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 51
		gunModel[16].setRotationPoint(48F, -11.7F, 0F);

		gunModel[17].addShapeBox(6F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 52
		gunModel[17].setRotationPoint(48F, -11.7F, 0F);

		gunModel[18].addShapeBox(6F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 53
		gunModel[18].setRotationPoint(48F, -11.7F, 0F);

		gunModel[19].addShapeBox(0F, 1F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		gunModel[19].setRotationPoint(37.8F, -12F, 0F);

		gunModel[20].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 1
		gunModel[20].setRotationPoint(37.8F, -12F, 0F);

		gunModel[21].addShapeBox(0F, 2F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 2
		gunModel[21].setRotationPoint(37.8F, -12F, 0F);

		gunModel[22].addShapeBox(0F, 0F, -1.5F, 6, 1, 3, 0F,0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 7
		gunModel[22].setRotationPoint(39F, -11.1F, 0F);

		gunModel[23].addShapeBox(0F, 0.7F, -1F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		gunModel[23].setRotationPoint(12.6F, -13F, 0F);

		gunModel[24].addShapeBox(0F, 0.7F, -1F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[24].setRotationPoint(12.6F, -13F, 0F);

		gunModel[25].addShapeBox(0F, 0.7F, -1F, 12, 1, 2, 0F,0.4F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.4F, 0F, -0.2F); // Box 18
		gunModel[25].setRotationPoint(12.6F, -12.5F, 0F);

		gunModel[26].addShapeBox(0F, 0.7F, -1F, 12, 1, 2, 0F,0.4F, -0.2F, -0.7F, 0.2F, -0.2F, -0.7F, 0.2F, -0.2F, -0.7F, 0.4F, -0.2F, -0.7F, 0.4F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F); // Box 19
		gunModel[26].setRotationPoint(12.6F, -13F, 0F);

		gunModel[27].addShapeBox(0.3F, 0.7F, -1F, 2, 1, 2, 0F,0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 20
		gunModel[27].setRotationPoint(5F, -13F, 0F);

		gunModel[28].addShapeBox(0.3F, 0.7F, -1F, 2, 1, 2, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 21
		gunModel[28].setRotationPoint(5F, -13F, 0F);

		gunModel[29].addShapeBox(0.3F, 0.7F, 0F, 5, 1, 1, 0F,0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 22
		gunModel[29].setRotationPoint(7F, -12F, 0F);

		gunModel[30].addShapeBox(0.3F, 0.7F, -1F, 5, 1, 2, 0F,0F, -0.1F, -1.2F, -0.1F, -0.1F, -1.2F, -0.1F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.5F, -1.2F, -0.1F, -0.5F, -1.2F, -0.1F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 23
		gunModel[30].setRotationPoint(7F, -12.5F, 0F);

		gunModel[31].addShapeBox(0F, 0.7F, -1F, 2, 1, 1, 0F,-0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F); // Box 45
		gunModel[31].setRotationPoint(22.6F, -13.5F, 0F);

		gunModel[32].addShapeBox(0F, 0.7F, -1F, 2, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 46
		gunModel[32].setRotationPoint(22.6F, -13F, 0F);

		gunModel[33].addShapeBox(0F, 0.7F, 0F, 2, 1, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 47
		gunModel[33].setRotationPoint(22.6F, -13F, 0F);

		gunModel[34].addShapeBox(0F, 0.7F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 48
		gunModel[34].setRotationPoint(22.6F, -13.5F, 0F);

		gunModel[35].addShapeBox(-1.5F, 0F, -1F, 4, 1, 2, 0F,0F, 0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, -0.3F, 0F, -1.05F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -1.05F, -0.3F); // Box 6
		gunModel[35].setRotationPoint(21.6F, -12.5F, 0F);

		gunModel[36].addShapeBox(-2.5F, -0.25F, -1F, 1, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F); // Box 7
		gunModel[36].setRotationPoint(21.6F, -12.5F, 0F);

		gunModel[37].addShapeBox(-2.5F, -1.25F, -0.3F, 1, 1, 1, 0F,0F, -0.5F, -0.65F, -0.25F, -0.5F, -0.65F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[37].setRotationPoint(21.6F, -12.5F, 0F);

		gunModel[38].addShapeBox(-2.5F, -1.25F, -0.7F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 9
		gunModel[38].setRotationPoint(21.6F, -12.5F, 0F);

		gunModel[39].addShapeBox(1.5F, -0.3F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 11
		gunModel[39].setRotationPoint(21.6F, -12.5F, 0F);
	}

	private void initdefaultBarrelModel_1()
	{
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 7
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 8
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 9
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 10
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 11
		defaultBarrelModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 12
		defaultBarrelModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 13
		defaultBarrelModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 14
		defaultBarrelModel[12] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 15
		defaultBarrelModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 16
		defaultBarrelModel[14] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		defaultBarrelModel[15] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 18
		defaultBarrelModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 19
		defaultBarrelModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 20
		defaultBarrelModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 21
		defaultBarrelModel[19] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
		defaultBarrelModel[20] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 23
		defaultBarrelModel[21] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 24
		defaultBarrelModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 25
		defaultBarrelModel[23] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 26
		defaultBarrelModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 27
		defaultBarrelModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 28
		defaultBarrelModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 29
		defaultBarrelModel[27] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 30
		defaultBarrelModel[28] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 31
		defaultBarrelModel[29] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 32
		defaultBarrelModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		defaultBarrelModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 34
		defaultBarrelModel[32] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 35
		defaultBarrelModel[33] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 0
		defaultBarrelModel[34] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 1
		defaultBarrelModel[35] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 2
		defaultBarrelModel[36] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 3
		defaultBarrelModel[37] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 4
		defaultBarrelModel[38] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 5

		defaultBarrelModel[0].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.5F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0.5F, -0.75F, 0.1F, 0.5F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0.5F, 0.1F, -0.25F); // Box 3
		defaultBarrelModel[0].setRotationPoint(56F, -11.7F, 0F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.5F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0.5F, -0.25F, 0.1F, 0.5F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0.5F, -0.25F, 0.1F); // Box 4
		defaultBarrelModel[1].setRotationPoint(56F, -11.7F, 0F);

		defaultBarrelModel[2].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0.5F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0.5F, 0.1F, -0.25F, 0.5F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0.5F, -0.75F, 0.1F); // Box 5
		defaultBarrelModel[2].setRotationPoint(56F, -11.7F, 0F);

		defaultBarrelModel[3].addShapeBox(0.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Box 6
		defaultBarrelModel[3].setRotationPoint(59F, -11.7F, 0F);

		defaultBarrelModel[4].addShapeBox(0.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 7
		defaultBarrelModel[4].setRotationPoint(59F, -11.7F, 0F);

		defaultBarrelModel[5].addShapeBox(0.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, 0F, 0.1F, -0.25F); // Box 8
		defaultBarrelModel[5].setRotationPoint(59F, -11.7F, 0F);

		defaultBarrelModel[6].addShapeBox(0.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 9
		defaultBarrelModel[6].setRotationPoint(59F, -11.7F, 0F);

		defaultBarrelModel[7].addShapeBox(0F, 0F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.9F, -0.25F, 0.25F, -0.9F, -0.25F, 0.25F, -0.9F, -0.25F, 0F, -0.9F, -0.25F); // Box 10
		defaultBarrelModel[7].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[8].addShapeBox(0F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.9F, -0.25F, 0.25F, -0.9F, -0.25F, 0.25F, -0.9F, -0.25F, 0F, -0.9F, -0.25F); // Box 11
		defaultBarrelModel[8].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[9].addShapeBox(0.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 12
		defaultBarrelModel[9].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[10].addShapeBox(0.25F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.9F, -0.25F, -0.75F, -0.9F, -0.25F, -0.75F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F, -0.75F, 0.25F, -0.9F, 0F, 0.25F, -0.9F); // Box 13
		defaultBarrelModel[10].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[11].addShapeBox(0.25F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F, -0.75F, 0.25F, -0.9F, 0F, 0.25F, -0.9F, 0F, -0.9F, -0.25F, -0.75F, -0.9F, -0.25F, -0.75F, -1.05F, -0.7F, 0F, -1.05F, -0.7F); // Box 14
		defaultBarrelModel[11].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[12].addShapeBox(0.75F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F, -0.75F, 0.25F, -0.9F, 0F, 0.25F, -0.9F, 0F, -0.9F, -0.25F, -0.75F, -0.9F, -0.25F, -0.75F, -1.05F, -0.7F, 0F, -1.05F, -0.7F); // Box 15
		defaultBarrelModel[12].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[13].addShapeBox(0.75F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 16
		defaultBarrelModel[13].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[14].addShapeBox(0.75F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.9F, -0.25F, -0.75F, -0.9F, -0.25F, -0.75F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F, -0.75F, 0.25F, -0.9F, 0F, 0.25F, -0.9F); // Box 17
		defaultBarrelModel[14].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[15].addShapeBox(1.25F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F, -0.75F, 0.25F, -0.9F, 0F, 0.25F, -0.9F, 0F, -0.9F, -0.25F, -0.75F, -0.9F, -0.25F, -0.75F, -1.05F, -0.7F, 0F, -1.05F, -0.7F); // Box 18
		defaultBarrelModel[15].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[16].addShapeBox(1.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 19
		defaultBarrelModel[16].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[17].addShapeBox(1.25F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.9F, -0.25F, -0.75F, -0.9F, -0.25F, -0.75F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F, -0.75F, 0.25F, -0.9F, 0F, 0.25F, -0.9F); // Box 20
		defaultBarrelModel[17].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[18].addShapeBox(1.75F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F, -0.75F, 0.25F, -0.9F, 0F, 0.25F, -0.9F, 0F, -0.9F, -0.25F, -0.75F, -0.9F, -0.25F, -0.75F, -1.05F, -0.7F, 0F, -1.05F, -0.7F); // Box 21
		defaultBarrelModel[18].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[19].addShapeBox(1.75F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, -0.9F, 0F, -0.25F, -0.9F, 0F, -0.25F, 0.1F, -0.75F, -0.25F, 0.1F, -0.75F, -0.25F, -0.9F, 0F, -0.25F, -0.9F); // Box 22
		defaultBarrelModel[19].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[20].addShapeBox(1.75F, -1F, -0.5F, 1, 1, 1, 0F,0F, -0.9F, -0.25F, -0.75F, -0.9F, -0.25F, -0.75F, -1.05F, -0.7F, 0F, -1.05F, -0.7F, 0F, 0.25F, 0.1F, -0.75F, 0.25F, 0.1F, -0.75F, 0.25F, -0.9F, 0F, 0.25F, -0.9F); // Box 23
		defaultBarrelModel[20].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[21].addShapeBox(0.25F, -1F, -0.5F, 1, 1, 1, 0F,0F, -1.05F, -0.7F, -0.75F, -1.05F, -0.7F, -0.75F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0.25F, -0.9F, -0.75F, 0.25F, -0.9F, -0.75F, 0.25F, 0.1F, 0F, 0.25F, 0.1F); // Box 24
		defaultBarrelModel[21].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[22].addShapeBox(0.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 25
		defaultBarrelModel[22].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[23].addShapeBox(0.25F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, -0.9F, -0.75F, 0.25F, -0.9F, -0.75F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.05F, -0.7F, -0.75F, -1.05F, -0.7F, -0.75F, -0.9F, -0.25F, 0F, -0.9F, -0.25F); // Box 26
		defaultBarrelModel[23].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[24].addShapeBox(0.75F, -1F, -0.5F, 1, 1, 1, 0F,0F, -1.05F, -0.7F, -0.75F, -1.05F, -0.7F, -0.75F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0.25F, -0.9F, -0.75F, 0.25F, -0.9F, -0.75F, 0.25F, 0.1F, 0F, 0.25F, 0.1F); // Box 27
		defaultBarrelModel[24].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[25].addShapeBox(0.75F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 28
		defaultBarrelModel[25].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[26].addShapeBox(0.75F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, -0.9F, -0.75F, 0.25F, -0.9F, -0.75F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.05F, -0.7F, -0.75F, -1.05F, -0.7F, -0.75F, -0.9F, -0.25F, 0F, -0.9F, -0.25F); // Box 29
		defaultBarrelModel[26].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[27].addShapeBox(1.25F, -1F, -0.5F, 1, 1, 1, 0F,0F, -1.05F, -0.7F, -0.75F, -1.05F, -0.7F, -0.75F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0.25F, -0.9F, -0.75F, 0.25F, -0.9F, -0.75F, 0.25F, 0.1F, 0F, 0.25F, 0.1F); // Box 30
		defaultBarrelModel[27].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[28].addShapeBox(1.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 31
		defaultBarrelModel[28].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[29].addShapeBox(1.25F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, -0.9F, -0.75F, 0.25F, -0.9F, -0.75F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.05F, -0.7F, -0.75F, -1.05F, -0.7F, -0.75F, -0.9F, -0.25F, 0F, -0.9F, -0.25F); // Box 32
		defaultBarrelModel[29].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[30].addShapeBox(1.75F, -1F, -0.5F, 1, 1, 1, 0F,0F, -1.05F, -0.7F, -0.75F, -1.05F, -0.7F, -0.75F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0.25F, -0.9F, -0.75F, 0.25F, -0.9F, -0.75F, 0.25F, 0.1F, 0F, 0.25F, 0.1F); // Box 33
		defaultBarrelModel[30].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[31].addShapeBox(1.75F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.9F, -0.75F, -0.25F, -0.9F, -0.75F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 34
		defaultBarrelModel[31].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[32].addShapeBox(1.75F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0.25F, -0.9F, -0.75F, 0.25F, -0.9F, -0.75F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.05F, -0.7F, -0.75F, -1.05F, -0.7F, -0.75F, -0.9F, -0.25F, 0F, -0.9F, -0.25F); // Box 35
		defaultBarrelModel[32].setRotationPoint(57F, -11.7F, 0F);

		defaultBarrelModel[33].addShapeBox(-0.25F, 0F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 0
		defaultBarrelModel[33].setRotationPoint(56F, -12.7F, 0F);

		defaultBarrelModel[34].addShapeBox(-0.25F, -0.25F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.45F, -0.3F, -0.45F, -0.4F, -0.3F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 1
		defaultBarrelModel[34].setRotationPoint(56F, -12.7F, 0F);

		defaultBarrelModel[35].addShapeBox(-0.25F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 2
		defaultBarrelModel[35].setRotationPoint(56F, -12.7F, 0F);

		defaultBarrelModel[36].addShapeBox(-0.25F, -0.4F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F); // Box 3
		defaultBarrelModel[36].setRotationPoint(56F, -12.7F, 0F);

		defaultBarrelModel[37].addShapeBox(-0.25F, -0.2F, -0.4F, 1, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		defaultBarrelModel[37].setRotationPoint(56F, -12.7F, 0F);

		defaultBarrelModel[38].addShapeBox(-0.25F, -0.2F, -0.6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 5
		defaultBarrelModel[38].setRotationPoint(56F, -12.7F, 0F);
	}

	private void initdefaultStockModel_1()
	{
		defaultStockModel[0] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 5
		defaultStockModel[1] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 5
		defaultStockModel[2] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 5
		defaultStockModel[3] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 6
		defaultStockModel[4] = new ModelRendererTurbo(this, 297, 42, textureX, textureY); // Box 8
		defaultStockModel[5] = new ModelRendererTurbo(this, 329, 63, textureX, textureY); // Box 9
		defaultStockModel[6] = new ModelRendererTurbo(this, 361, 47, textureX, textureY); // Box 10
		defaultStockModel[7] = new ModelRendererTurbo(this, 398, 72, textureX, textureY); // Box 11
		defaultStockModel[8] = new ModelRendererTurbo(this, 405, 98, textureX, textureY); // Box 12
		defaultStockModel[9] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 14
		defaultStockModel[10] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 14
		defaultStockModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		defaultStockModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 16
		defaultStockModel[13] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 17
		defaultStockModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 18
		defaultStockModel[15] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 19
		defaultStockModel[16] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 21
		defaultStockModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 22
		defaultStockModel[18] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 23
		defaultStockModel[19] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 24
		defaultStockModel[20] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 25
		defaultStockModel[21] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 26
		defaultStockModel[22] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 27
		defaultStockModel[23] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 28
		defaultStockModel[24] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 29
		defaultStockModel[25] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 30
		defaultStockModel[26] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 31
		defaultStockModel[27] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 32
		defaultStockModel[28] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 33
		defaultStockModel[29] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 34
		defaultStockModel[30] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 35
		defaultStockModel[31] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 36
		defaultStockModel[32] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 37
		defaultStockModel[33] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 38
		defaultStockModel[34] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 39
		defaultStockModel[35] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 40
		defaultStockModel[36] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 0
		defaultStockModel[37] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 1
		defaultStockModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		defaultStockModel[39] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 3
		defaultStockModel[40] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 4
		defaultStockModel[41] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 5
		defaultStockModel[42] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 6
		defaultStockModel[43] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 12
		defaultStockModel[44] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 13
		defaultStockModel[45] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 14
		defaultStockModel[46] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 15
		defaultStockModel[47] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 16
		defaultStockModel[48] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 17
		defaultStockModel[49] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 20
		defaultStockModel[50] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 21

		defaultStockModel[0].addShapeBox(0F, 1F, -1.5F, 6, 1, 3, 0F,0F, 0F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0F, 0F, -0.3F); // Box 5
		defaultStockModel[0].setRotationPoint(38.8F, -12F, 0F);

		defaultStockModel[1].addShapeBox(0F, 2F, -1.5F, 6, 1, 3, 0F,0F, 0F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, -0.1F, -0.8F, 0.2F, -0.4F, -0.8F, 0.2F, -0.4F, -0.8F, 0F, -0.1F, -0.8F); // Box 5
		defaultStockModel[1].setRotationPoint(38.8F, -12F, 0F);

		defaultStockModel[2].addShapeBox(0F, 0F, -1.5F, 6, 1, 3, 0F,-0.5F, -0.6F, -0.51F, 0.2F, -0.6F, -0.5F, 0.2F, -0.6F, -0.5F, -0.5F, -0.6F, -0.51F, -0.5F, 0F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, -0.5F, 0F, -0.3F); // Box 5
		defaultStockModel[2].setRotationPoint(38.8F, -12F, 0F);

		defaultStockModel[3].addShapeBox(0F, 0F, -1.5F, 1, 1, 3, 0F,0F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 6
		defaultStockModel[3].setRotationPoint(38.8F, -12F, 0F);

		defaultStockModel[4].addShapeBox(0F, 2F, -1.5F, 13, 1, 3, 0F,0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0.4F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0.4F, -0.8F); // Box 8
		defaultStockModel[4].setRotationPoint(24.8F, -12F, 0F);

		defaultStockModel[5].addShapeBox(0F, 1F, -1.5F, 13, 1, 3, 0F,0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F); // Box 9
		defaultStockModel[5].setRotationPoint(24.8F, -12F, 0F);

		defaultStockModel[6].addShapeBox(0F, 0F, -1.5F, 13, 1, 3, 0F,0F, 0.2F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F); // Box 10
		defaultStockModel[6].setRotationPoint(24.8F, -12F, 0F);

		defaultStockModel[7].addShapeBox(0F, 2.4F, -1.5F, 12, 1, 3, 0F,0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.5F, -0.8F); // Box 11
		defaultStockModel[7].setRotationPoint(12.8F, -12F, 0F);

		defaultStockModel[8].addShapeBox(0F, 1F, -1.5F, 12, 1, 3, 0F,0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.8F, -0.3F); // Box 12
		defaultStockModel[8].setRotationPoint(12.8F, -12F, 0F);

		defaultStockModel[9].addShapeBox(0F, 2.4F, -1.5F, 6, 1, 3, 0F,0.5F, -1.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.5F, -1.1F, -0.3F, 0.5F, 1F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0.5F, 1F, -0.8F); // Box 14
		defaultStockModel[9].setRotationPoint(6.8F, -12F, 0F);

		defaultStockModel[10].addShapeBox(0F, 1F, -1.5F, 6, 1, 3, 0F,0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0.5F, 1.5F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0.5F, 1.5F, -0.3F); // Box 14
		defaultStockModel[10].setRotationPoint(6.8F, -12F, 0F);

		defaultStockModel[11].addShapeBox(0.5F, 1F, -1.5F, 3, 1, 3, 0F,0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 14
		defaultStockModel[11].setRotationPoint(2.8F, -11F, 0F);

		defaultStockModel[12].addShapeBox(0.5F, 2.4F, -1.5F, 3, 1, 3, 0F,0F, -1.1F, -0.3F, 0F, -1.1F, -0.3F, 0F, -1.1F, -0.3F, 0F, -1.1F, -0.3F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, -0.8F); // Box 16
		defaultStockModel[12].setRotationPoint(2.8F, -12F, 0F);

		defaultStockModel[13].addShapeBox(0.5F, 0.7F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.2F, -0.4F, -0.3F); // Box 17
		defaultStockModel[13].setRotationPoint(4.8F, -12F, 0F);

		defaultStockModel[14].addShapeBox(0.5F, 0.7F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0.3F, -0.6F, -0.3F, 0.3F, -0.6F, -0.3F, 0F, -0.6F, -0.3F); // Box 18
		defaultStockModel[14].setRotationPoint(5.8F, -12F, 0F);

		defaultStockModel[15].addShapeBox(0.7F, 0.7F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.7F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, -0.6F, -0.3F, -0.7F, -0.6F, -0.3F, -0.7F, -0.6F, -0.3F, 0.3F, -0.6F, -0.3F); // Box 19
		defaultStockModel[15].setRotationPoint(11.8F, -12F, 0F);

		defaultStockModel[16].addShapeBox(-1.5F, 0.7F, -1.5F, 3, 1, 3, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 21
		defaultStockModel[16].setRotationPoint(4.8F, -12F, 0F);

		defaultStockModel[17].addShapeBox(0.5F, 2.4F, -1.5F, 2, 1, 3, 0F,0F, -1.1F, -0.3F, 0F, -1.1F, -0.3F, 0F, -1.1F, -0.3F, 0F, -1.1F, -0.3F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, -0.8F); // Box 22
		defaultStockModel[17].setRotationPoint(0.800000000000001F, -12F, 0F);

		defaultStockModel[18].addShapeBox(0.5F, 1F, -1.5F, 1, 1, 3, 0F,0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 23
		defaultStockModel[18].setRotationPoint(1.8F, -11F, 0F);

		defaultStockModel[19].addShapeBox(-0.5F, 0.7F, -1.5F, 1, 1, 3, 0F,0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 24
		defaultStockModel[19].setRotationPoint(2.8F, -12F, 0F);

		defaultStockModel[20].addShapeBox(0.5F, 2.4F, -1.5F, 2, 1, 3, 0F,0F, -2.1F, -0.55F, 0F, -1.1F, -0.3F, 0F, -1.1F, -0.3F, 0F, -2.1F, -0.55F, 0F, 2F, -1.05F, 0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 2F, -1.05F); // Box 25
		defaultStockModel[20].setRotationPoint(-1.2F, -12F, 0F);

		defaultStockModel[21].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, -2.1F, -0.55F, 0F, -1.1F, -0.55F, 0F, -1.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, 2F, -1.05F, 0F, 1F, -1.05F, 0F, 1F, -1.05F, 0F, 2F, -1.05F); // Box 26
		defaultStockModel[21].setRotationPoint(-2.2F, -11F, 0F);

		defaultStockModel[22].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, -2.1F, -0.55F, 0F, -1.1F, -0.55F, 0F, -1.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, 2F, -1.05F, 0F, 1F, -1.05F, 0F, 1F, -1.05F, 0F, 2F, -1.05F); // Box 27
		defaultStockModel[22].setRotationPoint(-3.2F, -10F, 0F);

		defaultStockModel[23].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, -1.6F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -1.6F, -0.55F, 0F, 1.5F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 1.5F, -1.05F); // Box 28
		defaultStockModel[23].setRotationPoint(-5.2F, -10F, 0F);

		defaultStockModel[24].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F); // Box 29
		defaultStockModel[24].setRotationPoint(-4.2F, -10F, 0F);

		defaultStockModel[25].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, 2F, -1.05F, 0F, 1.5F, -1.05F, 0F, 1.5F, -1.05F, 0F, 2F, -1.05F, 0F, -2.1F, -0.55F, 0F, -1.6F, -0.55F, 0F, -1.6F, -0.55F, 0F, -2.1F, -0.55F); // Box 30
		defaultStockModel[25].setRotationPoint(-5.2F, -10F, 0F);

		defaultStockModel[26].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F); // Box 31
		defaultStockModel[26].setRotationPoint(-4.2F, -9.5F, 0F);

		defaultStockModel[27].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, 1F, -1.05F, 0F, 1.5F, -1.05F, 0F, 1.5F, -1.05F, 0F, 1F, -1.05F, 0F, -1.1F, -0.55F, 0F, -1.6F, -0.55F, 0F, -1.6F, -0.55F, 0F, -1.1F, -0.55F); // Box 32
		defaultStockModel[27].setRotationPoint(-3.2F, -10.5F, 0F);

		defaultStockModel[28].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, 1F, -1.05F, 0F, 1.5F, -1.05F, 0F, 1.5F, -1.05F, 0F, 1F, -1.05F, 0F, -1.1F, -0.55F, 0F, -1.6F, -0.55F, 0F, -1.6F, -0.55F, 0F, -1.1F, -0.55F); // Box 33
		defaultStockModel[28].setRotationPoint(-2.2F, -11F, 0F);

		defaultStockModel[29].addShapeBox(0.5F, 2.4F, -1.5F, 2, 1, 3, 0F,0F, 1F, -1.05F, 0F, 1.6F, -0.8F, 0F, 1.6F, -0.8F, 0F, 1F, -1.05F, 0F, -1.1F, -0.55F, 0F, -1.7F, -0.3F, 0F, -1.7F, -0.3F, 0F, -1.1F, -0.55F); // Box 34
		defaultStockModel[29].setRotationPoint(-1.2F, -11.5F, 0F);

		defaultStockModel[30].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, 1.1F, -0.8F, 0F, 1.1F, -0.3F, 0F, 1.1F, -0.3F, 0F, 1.1F, -0.8F, 0F, -1.2F, -0.3F, 0F, -1.7F, -0.3F, 0F, -1.7F, -0.3F, 0F, -1.2F, -0.3F); // Box 35
		defaultStockModel[30].setRotationPoint(0.800000000000001F, -12F, 0F);

		defaultStockModel[31].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F); // Box 36
		defaultStockModel[31].setRotationPoint(-6.2F, -10.5F, 0F);

		defaultStockModel[32].addShapeBox(0.5F, 2.4F, -1.5F, 1, 1, 3, 0F,0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F); // Box 37
		defaultStockModel[32].setRotationPoint(-6.2F, -10F, 0F);

		defaultStockModel[33].addShapeBox(0.5F, 2.4F, -1.5F, 13, 1, 3, 0F,0F, -5.1F, -0.05F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, 0F, -5.1F, -0.05F, 0.25F, 7F, -1.05F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0.25F, 7F, -1.05F); // Box 38
		defaultStockModel[33].setRotationPoint(-19.2F, -10.5F, 0F);

		defaultStockModel[34].addShapeBox(0.5F, 2.4F, -1.5F, 14, 1, 3, 0F,0.1F, 1F, -0.55F, 0F, 2F, -1.05F, 0F, 2F, -1.05F, 0.1F, 1F, -0.55F, -0.35F, -0.6F, -0.05F, 0F, -2.1F, -0.55F, 0F, -2.1F, -0.55F, -0.35F, -0.6F, -0.05F); // Box 39
		defaultStockModel[34].setRotationPoint(-20.2F, -10F, 0F);

		defaultStockModel[35].addShapeBox(0.5F, 1.4F, -1.5F, 13, 5, 3, 0F,0.65F, -1.9F, -0.05F, 0F, -0.4F, -0.55F, 0F, -0.4F, -0.55F, 0.65F, -1.9F, -0.05F, 0F, 1.1F, -0.05F, 0F, -1.9F, -0.55F, 0F, -1.9F, -0.55F, 0F, 1.1F, -0.05F); // Box 40
		defaultStockModel[35].setRotationPoint(-19.2F, -10.5F, 0F);

		defaultStockModel[36].addShapeBox(0.5F, 1F, -1.5F, 1, 1, 3, 0F,0F, -0.2F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, -0.2F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 0
		defaultStockModel[36].setRotationPoint(0.800000000000001F, -11F, 0F);

		defaultStockModel[37].addShapeBox(0.5F, 1F, -1.5F, 2, 1, 3, 0F,0F, -0.8F, -0.55F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.8F, -0.55F, 0F, 1.5F, -0.55F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 1.5F, -0.55F); // Box 1
		defaultStockModel[37].setRotationPoint(-1.2F, -11F, 0F);

		defaultStockModel[38].addShapeBox(0.5F, 1.5F, -1.5F, 1, 1, 3, 0F,0F, -0.8F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.8F, -0.55F, 0F, 2F, -0.55F, 0F, 1F, -0.55F, 0F, 1F, -0.55F, 0F, 2F, -0.55F); // Box 2
		defaultStockModel[38].setRotationPoint(-2.2F, -11F, 0F);

		defaultStockModel[39].addShapeBox(0.5F, 1.5F, -1.5F, 1, 2, 3, 0F,0F, -0.8F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.3F, -0.55F, 0F, -0.8F, -0.55F, 0F, 1.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 0.5F, -0.55F, 0F, 1.5F, -0.55F); // Box 3
		defaultStockModel[39].setRotationPoint(-3.2F, -10.5F, 0F);

		defaultStockModel[40].addShapeBox(0.5F, 1.5F, -1.5F, 1, 2, 3, 0F,0F, -0.8F, -0.55F, 0F, -0.8F, -0.55F, 0F, -0.8F, -0.55F, 0F, -0.8F, -0.55F, 0F, 1.5F, -0.55F, 0F, 1.5F, -0.55F, 0F, 1.5F, -0.55F, 0F, 1.5F, -0.55F); // Box 4
		defaultStockModel[40].setRotationPoint(-4.2F, -10.5F, 0F);

		defaultStockModel[41].addShapeBox(0.5F, 1.5F, -1.5F, 1, 2, 3, 0F,0F, -0.3F, -0.55F, 0F, -0.8F, -0.55F, 0F, -0.8F, -0.55F, 0F, -0.3F, -0.55F, 0F, 1F, -0.55F, 0F, 1.5F, -0.55F, 0F, 1.5F, -0.55F, 0F, 1F, -0.55F); // Box 5
		defaultStockModel[41].setRotationPoint(-5.2F, -10.5F, 0F);

		defaultStockModel[42].addShapeBox(0.5F, 1.5F, -1.5F, 1, 2, 3, 0F,0F, -0.8F, -0.55F, 0F, -0.8F, -0.55F, 0F, -0.8F, -0.55F, 0F, -0.8F, -0.55F, 0F, 1.5F, -0.55F, 0F, 1.5F, -0.55F, 0F, 1.5F, -0.55F, 0F, 1.5F, -0.55F); // Box 6
		defaultStockModel[42].setRotationPoint(-6.2F, -11F, 0F);

		defaultStockModel[43].addShapeBox(-1.5F, 4.4F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F); // Box 12
		defaultStockModel[43].setRotationPoint(2.8F, -12F, 0F);

		defaultStockModel[44].addShapeBox(-0.5F, 5.4F, -0.5F, 2, 1, 1, 0F,0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
		defaultStockModel[44].setRotationPoint(2.8F, -12F, 0F);

		defaultStockModel[45].addShapeBox(-2F, 4.4F, -0.5F, 1, 1, 1, 0F,-0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F); // Box 14
		defaultStockModel[45].setRotationPoint(2.8F, -12F, 0F);

		defaultStockModel[46].addShapeBox(2F, 4.4F, -0.5F, 1, 1, 1, 0F,-0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 15
		defaultStockModel[46].setRotationPoint(2.8F, -12F, 0F);

		defaultStockModel[47].addShapeBox(-2F, 5.4F, -0.5F, 1, 1, 1, 0F,-0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, -1.5F, 0F, -0.2F); // Box 16
		defaultStockModel[47].setRotationPoint(2.8F, -12F, 0F);

		defaultStockModel[48].addShapeBox(2F, 5.4F, -0.5F, 1, 1, 1, 0F,-0.3F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0.5F, -0.2F, -0.2F, -1.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0.5F, -0.2F, -0.2F); // Box 17
		defaultStockModel[48].setRotationPoint(2.8F, -12F, 0F);

		defaultStockModel[49].addShapeBox(-2.4F, 4.4F, -0.5F, 1, 1, 1, 0F,-0.7F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.7F, 0F, -0.3F, -0.55F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.55F, -0.25F, -0.3F); // Box 20
		defaultStockModel[49].setRotationPoint(4.8F, -12F, 0F);

		defaultStockModel[50].addShapeBox(-2.4F, 4.9F, -0.5F, 1, 1, 1, 0F,-0.55F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.55F, -0.25F, -0.3F, -0.9F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.9F, 0F, -0.3F); // Box 21
		defaultStockModel[50].setRotationPoint(4.8F, -12F, 0F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 22
		ammoModel[1] = new ModelRendererTurbo(this, 433, 46, textureX, textureY); // Box 23
		ammoModel[2] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 24
		ammoModel[3] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 25
		ammoModel[4] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 26
		ammoModel[5] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 28
		ammoModel[6] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 29
		ammoModel[7] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 31
		ammoModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		ammoModel[9] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 33
		ammoModel[10] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 34
		ammoModel[11] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 35
		ammoModel[12] = new ModelRendererTurbo(this, 439, 89, textureX, textureY); // Box 0
		ammoModel[13] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 1
		ammoModel[14] = new ModelRendererTurbo(this, 437, 29, textureX, textureY); // Box 2
		ammoModel[15] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 3
		ammoModel[16] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 4
		ammoModel[17] = new ModelRendererTurbo(this, 434, 32, textureX, textureY); // Box 5
		ammoModel[18] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 6
		ammoModel[19] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 7
		ammoModel[20] = new ModelRendererTurbo(this, 437, 53, textureX, textureY); // Box 8
		ammoModel[21] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 9
		ammoModel[22] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 10
		ammoModel[23] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 11
		ammoModel[24] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 12
		ammoModel[25] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 13
		ammoModel[26] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 14
		ammoModel[27] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 15
		ammoModel[28] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 16
		ammoModel[29] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 17
		ammoModel[30] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 18
		ammoModel[31] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 19
		ammoModel[32] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 20
		ammoModel[33] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 21
		ammoModel[34] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 22
		ammoModel[35] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 23
		ammoModel[36] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 24
		ammoModel[37] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 25
		ammoModel[38] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 26
		ammoModel[39] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 27
		ammoModel[40] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 28
		ammoModel[41] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 29
		ammoModel[42] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 30
		ammoModel[43] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 31
		ammoModel[44] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		ammoModel[45] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 33
		ammoModel[46] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 34
		ammoModel[47] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 35
		ammoModel[48] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 36
		ammoModel[49] = new ModelRendererTurbo(this, 459, 69, textureX, textureY); // Box 37
		ammoModel[50] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 38
		ammoModel[51] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 39
		ammoModel[52] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 40
		ammoModel[53] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 41
		ammoModel[54] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 42
		ammoModel[55] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 43
		ammoModel[56] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 44
		ammoModel[57] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 45
		ammoModel[58] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 46
		ammoModel[59] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 47
		ammoModel[60] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 48

		ammoModel[0].addShapeBox(0F, 1.3F, -0.5F, 3, 1, 1, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 22
		ammoModel[0].setRotationPoint(7.4F, -13F, 0F);

		ammoModel[1].addShapeBox(0F, 1.3F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 23
		ammoModel[1].setRotationPoint(7.4F, -13F, 0F);

		ammoModel[2].addShapeBox(0F, 1.3F, -0.5F, 3, 1, 1, 0F,0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 24
		ammoModel[2].setRotationPoint(7.4F, -13F, 0F);

		ammoModel[3].addShapeBox(0F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F); // Box 25
		ammoModel[3].setRotationPoint(10.4F, -13F, 0F);

		ammoModel[4].addShapeBox(0F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F); // Box 26
		ammoModel[4].setRotationPoint(10.4F, -13F, 0F);

		ammoModel[5].addShapeBox(0F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F); // Box 28
		ammoModel[5].setRotationPoint(10.4F, -13F, 0F);

		ammoModel[6].addShapeBox(0.5F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 29
		ammoModel[6].setRotationPoint(10.4F, -13F, 0F);

		ammoModel[7].addShapeBox(0F, 1.3F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F); // Box 31
		ammoModel[7].setRotationPoint(10.4F, -13F, 0F);

		ammoModel[8].addShapeBox(0F, 1.3F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, -0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F); // Box 32
		ammoModel[8].setRotationPoint(10.4F, -13F, 0F);

		ammoModel[9].addShapeBox(0.7F, 1.3F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F); // Box 33
		ammoModel[9].setRotationPoint(10.4F, -13F, 0F);

		ammoModel[10].addShapeBox(0.2F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F); // Box 34
		ammoModel[10].setRotationPoint(11.4F, -13F, 0F);

		ammoModel[11].addShapeBox(0.2F, 1.3F, -0.5F, 1, 1, 1, 0F,0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F, 0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F); // Box 35
		ammoModel[11].setRotationPoint(11.4F, -13F, 0F);

		ammoModel[12].addShapeBox(0F, 1.5F, -0.5F, 1, 3, 1, 0F,-0.9F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, -0.9F, 0.3F, -0.1F, -0.9F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.9F, 0.1F, -0.1F); // Box 0
		ammoModel[12].setRotationPoint(6.4F, -12.5F, 0F);

		ammoModel[13].addShapeBox(0F, 1F, -0.5F, 3, 1, 1, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 1
		ammoModel[13].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[14].addShapeBox(0F, 1F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 2
		ammoModel[14].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[15].addShapeBox(0F, 1F, -0.5F, 3, 1, 1, 0F,0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 3
		ammoModel[15].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[16].addShapeBox(0F, 1.7F, -0.5F, 3, 1, 1, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 4
		ammoModel[16].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[17].addShapeBox(0F, 1.7F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 5
		ammoModel[17].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[18].addShapeBox(0F, 1.7F, -0.5F, 3, 1, 1, 0F,0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 6
		ammoModel[18].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[19].addShapeBox(0F, 2.4F, -0.5F, 3, 1, 1, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 7
		ammoModel[19].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[20].addShapeBox(0F, 2.4F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 8
		ammoModel[20].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[21].addShapeBox(0F, 2.4F, -0.5F, 3, 1, 1, 0F,0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 9
		ammoModel[21].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[22].addShapeBox(0F, 1F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F); // Box 10
		ammoModel[22].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[23].addShapeBox(0F, 1F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F); // Box 11
		ammoModel[23].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[24].addShapeBox(0F, 1F, -0.5F, 1, 1, 1, 0F,0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F); // Box 12
		ammoModel[24].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[25].addShapeBox(0.5F, 1F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 13
		ammoModel[25].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[26].addShapeBox(0F, 1F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, -0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F); // Box 14
		ammoModel[26].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[27].addShapeBox(0.7F, 1F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F); // Box 15
		ammoModel[27].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[28].addShapeBox(0.2F, 1F, -0.5F, 1, 1, 1, 0F,0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F, 0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F); // Box 16
		ammoModel[28].setRotationPoint(11.4F, -12F, 0F);

		ammoModel[29].addShapeBox(0F, 1F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F); // Box 17
		ammoModel[29].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[30].addShapeBox(0.2F, 1F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F); // Box 18
		ammoModel[30].setRotationPoint(11.4F, -12F, 0F);

		ammoModel[31].addShapeBox(0F, 1.7F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F); // Box 19
		ammoModel[31].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[32].addShapeBox(0F, 1.7F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F); // Box 20
		ammoModel[32].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[33].addShapeBox(0F, 1.7F, -0.5F, 1, 1, 1, 0F,0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F); // Box 21
		ammoModel[33].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[34].addShapeBox(0.5F, 1.7F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 22
		ammoModel[34].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[35].addShapeBox(0F, 1.7F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, -0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F); // Box 23
		ammoModel[35].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[36].addShapeBox(0.7F, 1.7F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F); // Box 24
		ammoModel[36].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[37].addShapeBox(0.2F, 1.7F, -0.5F, 1, 1, 1, 0F,0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F, 0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F); // Box 25
		ammoModel[37].setRotationPoint(11.4F, -12F, 0F);

		ammoModel[38].addShapeBox(0F, 1.7F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F); // Box 26
		ammoModel[38].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[39].addShapeBox(0.2F, 1.7F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F); // Box 27
		ammoModel[39].setRotationPoint(11.4F, -12F, 0F);

		ammoModel[40].addShapeBox(0.5F, 2.4F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 28
		ammoModel[40].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[41].addShapeBox(0F, 2.4F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F); // Box 29
		ammoModel[41].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[42].addShapeBox(0F, 2.4F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F); // Box 30
		ammoModel[42].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[43].addShapeBox(0F, 2.4F, -0.5F, 1, 1, 1, 0F,0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F); // Box 31
		ammoModel[43].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[44].addShapeBox(0F, 2.4F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, -0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F); // Box 32
		ammoModel[44].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[45].addShapeBox(0F, 2.4F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F); // Box 33
		ammoModel[45].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[46].addShapeBox(0.7F, 2.4F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F); // Box 34
		ammoModel[46].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[47].addShapeBox(0.2F, 2.4F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F); // Box 35
		ammoModel[47].setRotationPoint(11.4F, -12F, 0F);

		ammoModel[48].addShapeBox(0.2F, 2.4F, -0.5F, 1, 1, 1, 0F,0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F, 0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F); // Box 36
		ammoModel[48].setRotationPoint(11.4F, -12F, 0F);

		ammoModel[49].addShapeBox(0F, 3.1F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 37
		ammoModel[49].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[50].addShapeBox(0F, 3.1F, -0.5F, 3, 1, 1, 0F,0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F); // Box 38
		ammoModel[50].setRotationPoint(7.4F, -12F, 0F);

		ammoModel[51].addShapeBox(0F, 3.1F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F, 0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F); // Box 39
		ammoModel[51].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[52].addShapeBox(0F, 3.1F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.3F, -0.1F); // Box 40
		ammoModel[52].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[53].addShapeBox(0F, 3.1F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F); // Box 41
		ammoModel[53].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[54].addShapeBox(0.5F, 3.1F, -0.5F, 1, 1, 1, 0F,0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, 0F, -0.35F, -0.2F); // Box 42
		ammoModel[54].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[55].addShapeBox(0.2F, 3.1F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F, 0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F); // Box 43
		ammoModel[55].setRotationPoint(11.4F, -12F, 0F);

		ammoModel[56].addShapeBox(0.2F, 3.1F, -0.5F, 1, 1, 1, 0F,0F, -0.65F, -0.2F, -0.5F, -0.55F, -0.35F, -0.5F, -0.55F, -0.35F, 0F, -0.65F, -0.2F, 0F, -0.2F, -0.4F, -0.5F, -0.35F, -0.45F, -0.5F, -0.35F, -0.45F, 0F, -0.2F, -0.4F); // Box 44
		ammoModel[56].setRotationPoint(11.4F, -12F, 0F);

		ammoModel[57].addShapeBox(0.7F, 3.1F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F, -0.5F, -0.35F, -0.2F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, -0.5F, -0.35F, -0.2F); // Box 45
		ammoModel[57].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[58].addShapeBox(0F, 3.1F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, 0.2F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, -0.5F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F); // Box 46
		ammoModel[58].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[59].addShapeBox(0F, 3.1F, -0.5F, 1, 1, 1, 0F,0F, -0.7F, -0.1F, -0.5F, -0.65F, -0.2F, -0.5F, -0.65F, -0.2F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, -0.5F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.1F, -0.3F); // Box 47
		ammoModel[59].setRotationPoint(10.4F, -12F, 0F);

		ammoModel[60].addShapeBox(0F, 3.1F, -0.5F, 3, 1, 1, 0F,0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.7F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F); // Box 48
		ammoModel[60].setRotationPoint(7.4F, -12F, 0F);
	}

	private void initpumpModel_1()
	{
		pumpModel[0] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 31
		pumpModel[1] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 31
		pumpModel[2] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 31
		pumpModel[3] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 32
		pumpModel[4] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 33
		pumpModel[5] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 34
		pumpModel[6] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 35
		pumpModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 36
		pumpModel[8] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 37
		pumpModel[9] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 44

		pumpModel[0].addShapeBox(0F, 1.3F, -0.5F, 11, 1, 1, 0F,0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 31
		pumpModel[0].setRotationPoint(1.6F, -13F, 0F);

		pumpModel[1].addShapeBox(0F, 1.3F, -0.5F, 11, 1, 1, 0F,0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F, 0F, -0.05F, -0.25F); // Box 31
		pumpModel[1].setRotationPoint(1.6F, -13F, 0F);

		pumpModel[2].addShapeBox(0F, 1.3F, -0.5F, 11, 1, 1, 0F,0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F, 0F, -0.3F, -0.05F); // Box 31
		pumpModel[2].setRotationPoint(1.6F, -13F, 0F);

		pumpModel[3].addShapeBox(0.3F, 0.7F, -1F, 2, 1, 2, 0F,0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 32
		pumpModel[3].setRotationPoint(2F, -13F, 0F);

		pumpModel[4].addShapeBox(0.3F, 0.7F, -1F, 2, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 33
		pumpModel[4].setRotationPoint(2F, -12.5F, 0F);

		pumpModel[5].addShapeBox(0.3F, 0.7F, -1F, 2, 1, 2, 0F,0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F); // Box 34
		pumpModel[5].setRotationPoint(2F, -12F, 0F);

		pumpModel[6].addShapeBox(2.7F, 1.3F, -2F, 1, 1, 2, 0F,-0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.7F, 0.5F, -0.1F, -0.7F, 0.5F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F); // Box 35
		pumpModel[6].setRotationPoint(1.6F, -13F, 0F);

		pumpModel[7].addShapeBox(2.7F, 1.3F, -2F, 1, 1, 2, 0F,-0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0.5F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 36
		pumpModel[7].setRotationPoint(1.6F, -13F, 0F);

		pumpModel[8].addShapeBox(2.7F, 1.3F, -2F, 1, 1, 2, 0F,-0.1F, -0.7F, 0.5F, -0.1F, -0.7F, 0.5F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0.5F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F); // Box 37
		pumpModel[8].setRotationPoint(1.6F, -13F, 0F);

		pumpModel[9].addShapeBox(2.7F, 1.3F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		pumpModel[9].setRotationPoint(1.6F, -13F, 0F);
		
		gunSlideDistance = 0.5F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.4F;

		translateAll(0F, 0F, 0F);
	}
}