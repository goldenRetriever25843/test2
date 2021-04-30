//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Arisaka99
// Model Creator: 
// Created on: 08.07.2016 - 14:41:04
// Last changed on: 08.07.2016 - 14:41:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArisaka99elite extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelArisaka99elite() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		defaultScopeModel = new ModelRendererTurbo[9];
		ammoModel = new ModelRendererTurbo[11];
		pumpModel = new ModelRendererTurbo[3];

		initgunModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();
		initpumpModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 295, 95, textureX, textureY); // Import Box5
		gunModel[1] = new ModelRendererTurbo(this, 313, 93, textureX, textureY); // Import Box6
		gunModel[2] = new ModelRendererTurbo(this, 325, 87, textureX, textureY); // Import Box7
		gunModel[3] = new ModelRendererTurbo(this, 297, 101, textureX, textureY); // Import Box8
		gunModel[4] = new ModelRendererTurbo(this, 111, 61, textureX, textureY); // Import Box9
		gunModel[5] = new ModelRendererTurbo(this, 311, 109, textureX, textureY); // Import Box10
		gunModel[6] = new ModelRendererTurbo(this, 361, 86, textureX, textureY); // Import Box11
		gunModel[7] = new ModelRendererTurbo(this, 126, 44, textureX, textureY); // Import Box12
		gunModel[8] = new ModelRendererTurbo(this, 86, 49, textureX, textureY); // Import Box12
		gunModel[9] = new ModelRendererTurbo(this, 153, 37, textureX, textureY); // Import Box12
		gunModel[10] = new ModelRendererTurbo(this, 117, 48, textureX, textureY); // Import Box12
		gunModel[11] = new ModelRendererTurbo(this, 141, 67, textureX, textureY); // Import Box12
		gunModel[12] = new ModelRendererTurbo(this, 108, 72, textureX, textureY); // Import Box12
		gunModel[13] = new ModelRendererTurbo(this, 127, 63, textureX, textureY); // Import Box12
		gunModel[14] = new ModelRendererTurbo(this, 111, 66, textureX, textureY); // Import Box12
		gunModel[15] = new ModelRendererTurbo(this, 134, 116, textureX, textureY); // Import Box12
		gunModel[16] = new ModelRendererTurbo(this, 91, 93, textureX, textureY); // Import Box12
		gunModel[17] = new ModelRendererTurbo(this, 139, 51, textureX, textureY); // Import Box12
		gunModel[18] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import Box12
		gunModel[19] = new ModelRendererTurbo(this, 290, 70, textureX, textureY); // Import Box24
		gunModel[20] = new ModelRendererTurbo(this, 345, 94, textureX, textureY); // Import Box25
		gunModel[21] = new ModelRendererTurbo(this, 106, 59, textureX, textureY); // Import Box26
		gunModel[22] = new ModelRendererTurbo(this, 123, 65, textureX, textureY); // Import Box12
		gunModel[23] = new ModelRendererTurbo(this, 94, 83, textureX, textureY); // Import Box12
		gunModel[24] = new ModelRendererTurbo(this, 129, 67, textureX, textureY); // Import Box12
		gunModel[25] = new ModelRendererTurbo(this, 157, 78, textureX, textureY); // Import Box12
		gunModel[26] = new ModelRendererTurbo(this, 133, 67, textureX, textureY); // Import Box12
		gunModel[27] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Import Box12
		gunModel[28] = new ModelRendererTurbo(this, 108, 56, textureX, textureY); // Import Box12
		gunModel[29] = new ModelRendererTurbo(this, 160, 77, textureX, textureY); // Import Box12
		gunModel[30] = new ModelRendererTurbo(this, 131, 58, textureX, textureY); // Import Box12
		gunModel[31] = new ModelRendererTurbo(this, 138, 57, textureX, textureY); // Import Box12
		gunModel[32] = new ModelRendererTurbo(this, 220, 151, textureX, textureY); // Box 0
		gunModel[33] = new ModelRendererTurbo(this, 150, 57, textureX, textureY); // Import Box12

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, -0.2F, 1.2F, 0F, -0.2F, 1.2F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, 1.2F, 0F); // Import Box5
		gunModel[0].setRotationPoint(-5.5F, -3.5F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 1F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, -2.2F, 1F, 0F); // Import Box6
		gunModel[1].setRotationPoint(-9.5F, -3.5F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 13, 2, 2, 0F,0F, 0F, 0.5F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0.5F, -0.6F, 4.2F, 0.5F, -2.2F, 1F, 0F, -2.2F, 1F, 0F, -0.6F, 4.2F, 0.5F); // Import Box7
		gunModel[2].setRotationPoint(-18.1F, -3.5F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[3].setRotationPoint(-1.7F, -4.5F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, 0.2F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0.3F, 0F, 0F); // Import Box9
		gunModel[4].setRotationPoint(6.3F, -4.5F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-0.4F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -0.2F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.8F, 0F, -0.4F, -0.2F, 0F); // Import Box10
		gunModel[5].setRotationPoint(6.5F, -4.5F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0F, -0.8F, 0F); // Import Box11
		gunModel[6].setRotationPoint(17.5F, -4.5F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box12
		gunModel[7].setRotationPoint(0.8F, -3F, -1F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box12
		gunModel[8].setRotationPoint(-2F, -3F, -1F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0.8F, -0.2F, -0.4F, 1F, -0.2F, -0.4F, 1F, -0.2F, -0.4F, 0.8F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.5F, -0.2F); // Import Box12
		gunModel[9].setRotationPoint(-0.6F, -0.4F, -1F);
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F); // Import Box12
		gunModel[10].setRotationPoint(-1F, -3.3F, -1F);
		gunModel[10].rotateAngleZ = -0.19198622F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Import Box12
		gunModel[11].setRotationPoint(36.7F, -4.5F, -1F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import Box12
		gunModel[12].setRotationPoint(37.7F, -4.4F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Import Box12
		gunModel[13].setRotationPoint(36.7F, -5.3F, -1F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import Box12
		gunModel[14].setRotationPoint(37.7F, -5.3F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0F, -0.2F, -0.2F); // Import Box12
		gunModel[15].setRotationPoint(42.2F, -5.3F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F); // Import Box12
		gunModel[16].setRotationPoint(41.1F, -6.1F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Import Box12
		gunModel[17].setRotationPoint(19.7F, -4.5F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F, 0F, -0.7F, 0.1F); // Import Box12
		gunModel[18].setRotationPoint(19.7F, -5.3F, -1F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0.5F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0.5F, -0.8F, 0F); // Import Box24
		gunModel[19].setRotationPoint(21F, -5.2F, -1F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Import Box25
		gunModel[20].setRotationPoint(15F, -5.29F, -1F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Import Box26
		gunModel[21].setRotationPoint(14.3F, -5.29F, -1F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Import Box12
		gunModel[22].setRotationPoint(0.3F, -5.8F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Import Box12
		gunModel[23].setRotationPoint(-3F, -5.8F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		gunModel[24].setRotationPoint(-2.7F, -5.7F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.025F, 0F, 0.8F, -0.025F, 0F, 0.8F, -0.025F, 0F, 0F, -0.025F, 0F, 0F, 0.1F, 0.1F, 0.8F, 0.1F, 0.1F, 0.8F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Import Box12
		gunModel[25].setRotationPoint(6.1F, -5.8F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.075F, -0.075F, 0.8F, -0.075F, -0.075F, 0.8F, -0.075F, -0.075F, 0F, -0.075F, -0.075F, 0F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0F, 0.05F, 0.05F); // Import Box12
		gunModel[26].setRotationPoint(6.9F, -5.8F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.075F, -0.075F, 0.8F, -0.075F, -0.075F, 0.8F, -0.075F, -0.075F, 0F, -0.075F, -0.075F, 0F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0.8F, 0.05F, 0.05F, 0F, 0.05F, 0.05F); // Import Box12
		gunModel[27].setRotationPoint(10.5F, -5.7F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.075F, -0.225F, 1F, -0.075F, -0.225F, 1F, -0.075F, -0.225F, 0F, -0.075F, -0.225F, 0F, 0.05F, -0.1F, 1F, 0.05F, -0.1F, 1F, 0.05F, -0.1F, 0F, 0.05F, -0.1F); // Import Box12
		gunModel[28].setRotationPoint(11F, -5.9F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, -0.8F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F); // Import Box12
		gunModel[29].setRotationPoint(11F, -6.2F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.05F, -0.8F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.8F, 0F, 0.05F, -0.1F, 0F, 0.05F, -0.1F); // Import Box12
		gunModel[30].setRotationPoint(11F, -6.2F, -1.2F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F); // Import Box12
		gunModel[31].setRotationPoint(37.1F, -4.1F, -0.5F);

		gunModel[32].addShapeBox(-0.4F, 0F, 0F, 13, 2, 2, 0F,-11.7F, 3.8F, 0F, -0.6F, 4.2F, 0.5F, -0.6F, 4.2F, 0.5F, -11.7F, 3.8F, 0F, -12.3F, -0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -12.3F, -0.3F, 0F); // Box 0
		gunModel[32].setRotationPoint(-30.1F, 0.7F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.075F, -0.075F, -0.2F, -0.175F, -0.07F, -0.2F, -0.175F, -0.07F, 0F, -0.075F, -0.075F, 0F, 0.05F, 0.05F, -0.2F, -0.05F, -0.05F, -0.2F, -0.05F, -0.05F, 0F, 0.05F, 0.05F); // Import Box12
		gunModel[33].setRotationPoint(9.7F, -5.8F, -0.5F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 66, 66, textureX, textureY); // Import Box51
		defaultScopeModel[1] = new ModelRendererTurbo(this, 121, 74, textureX, textureY); // Import Box52
		defaultScopeModel[2] = new ModelRendererTurbo(this, 112, 77, textureX, textureY); // Import Box53
		defaultScopeModel[3] = new ModelRendererTurbo(this, 124, 114, textureX, textureY); // Import Box54
		defaultScopeModel[4] = new ModelRendererTurbo(this, 126, 78, textureX, textureY); // Import Box55
		defaultScopeModel[5] = new ModelRendererTurbo(this, 132, 74, textureX, textureY); // Import Box56
		defaultScopeModel[6] = new ModelRendererTurbo(this, 150, 75, textureX, textureY); // Import Box57
		defaultScopeModel[7] = new ModelRendererTurbo(this, 257, 29, textureX, textureY); // Box 1
		defaultScopeModel[8] = new ModelRendererTurbo(this, 257, 29, textureX, textureY); // Box 2

		defaultScopeModel[0].addShapeBox(0F, 0F, -0.4F, 4, 1, 2, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		defaultScopeModel[0].setRotationPoint(3.3F, -5.5F, 0.5F);
		defaultScopeModel[0].rotateAngleX = 0.26179939F;

		defaultScopeModel[1].addShapeBox(0F, -0.8F, 0.6F, 4, 1, 1, 0F,0F, 0F, -0.8F, 0.4F, 0F, -0.8F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.4F, 0F, -0.8F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		defaultScopeModel[1].setRotationPoint(3.3F, -5.5F, 0.5F);
		defaultScopeModel[1].rotateAngleX = 0.26179939F;

		defaultScopeModel[2].addShapeBox(0F, 0F, 0.6F, 5, 1, 1, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		defaultScopeModel[2].setRotationPoint(2.3F, -7.3F, 0.3F);
		defaultScopeModel[2].rotateAngleX = 0.26179939F;

		defaultScopeModel[3].addShapeBox(0F, 0F, 0.6F, 6, 1, 1, 0F,0F, 0.2F, 0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.2F, 0.2F); // Import Box54
		defaultScopeModel[3].setRotationPoint(-3.7F, -7.3F, 0.3F);
		defaultScopeModel[3].rotateAngleX = 0.26179939F;

		defaultScopeModel[4].addShapeBox(0F, 0F, 0.6F, 1, 1, 1, 0F,0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Import Box55
		defaultScopeModel[4].setRotationPoint(-4.7F, -7.3F, 0.3F);
		defaultScopeModel[4].rotateAngleX = 0.26179939F;

		defaultScopeModel[5].addShapeBox(0F, 0F, 0.6F, 1, 1, 1, 0F,0F, 0.6F, 0.6F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0F, 0.6F, 0.6F); // Import Box56
		defaultScopeModel[5].setRotationPoint(-5.7F, -7.3F, 0.3F);
		defaultScopeModel[5].rotateAngleX = 0.26179939F;

		defaultScopeModel[6].addShapeBox(0F, 0F, 0.6F, 1, 1, 1, 0F,0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Import Box57
		defaultScopeModel[6].setRotationPoint(7.3F, -7.3F, 0.3F);
		defaultScopeModel[6].rotateAngleX = 0.26179939F;

		defaultScopeModel[7].addShapeBox(0.1F, 0F, 0.6F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 1
		defaultScopeModel[7].setRotationPoint(7.3F, -7.3F, 0.3F);
		defaultScopeModel[7].rotateAngleX = 0.26179939F;

		defaultScopeModel[8].addShapeBox(-0.1F, 0F, 0.6F, 1, 1, 1, 0F,0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 2
		defaultScopeModel[8].setRotationPoint(-5.7F, -7.3F, 0.3F);
		defaultScopeModel[8].rotateAngleX = 0.26179939F;
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 273, 206, textureX, textureY); // Import Box40
		ammoModel[1] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Import Box41
		ammoModel[2] = new ModelRendererTurbo(this, 270, 173, textureX, textureY); // Import Box42
		ammoModel[3] = new ModelRendererTurbo(this, 275, 178, textureX, textureY); // Import Box43
		ammoModel[4] = new ModelRendererTurbo(this, 259, 188, textureX, textureY); // Import Box44
		ammoModel[5] = new ModelRendererTurbo(this, 276, 181, textureX, textureY); // Import Box45
		ammoModel[6] = new ModelRendererTurbo(this, 322, 170, textureX, textureY); // Import Box46
		ammoModel[7] = new ModelRendererTurbo(this, 318, 179, textureX, textureY); // Import Box47
		ammoModel[8] = new ModelRendererTurbo(this, 322, 182, textureX, textureY); // Import Box48
		ammoModel[9] = new ModelRendererTurbo(this, 330, 163, textureX, textureY); // Import Box49
		ammoModel[10] = new ModelRendererTurbo(this, 310, 179, textureX, textureY); // Import Box50

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F); // Import Box40
		ammoModel[0].setRotationPoint(1.5F, -5.8F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import Box41
		ammoModel[1].setRotationPoint(1.9F, -5.8F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import Box42
		ammoModel[2].setRotationPoint(1.9F, -5.3F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import Box43
		ammoModel[3].setRotationPoint(1.9F, -4.8F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import Box44
		ammoModel[4].setRotationPoint(1.9F, -4.3F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Import Box45
		ammoModel[5].setRotationPoint(1.9F, -3.8F, -0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Import Box46
		ammoModel[6].setRotationPoint(4.3F, -3.8F, -0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Import Box47
		ammoModel[7].setRotationPoint(4.3F, -4.3F, -0.5F);

		ammoModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Import Box48
		ammoModel[8].setRotationPoint(4.3F, -4.8F, -0.5F);

		ammoModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Import Box49
		ammoModel[9].setRotationPoint(4.3F, -5.3F, -0.5F);

		ammoModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F, -0.3F, -0.32F, -0.32F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, -0.3F, -0.32F, -0.32F); // Import Box50
		ammoModel[10].setRotationPoint(4.3F, -5.8F, -0.5F);
	}

	private void initpumpModel_1()
	{
		pumpModel[0] = new ModelRendererTurbo(this, 88, 82, textureX, textureY); // Import Box30
		pumpModel[1] = new ModelRendererTurbo(this, 143, 66, textureX, textureY); // Import Box38
		pumpModel[2] = new ModelRendererTurbo(this, 143, 66, textureX, textureY); // Box 7

		pumpModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0.4F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		pumpModel[0].setRotationPoint(1.3F, -5.7F, -0.5F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Import Box38
		pumpModel[1].setRotationPoint(-1F, -6F, -1.5F);
		pumpModel[1].rotateAngleX = -0.17453293F;

		pumpModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.075F, -0.075F, 0F, -0.075F, -0.075F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.075F, -0.075F, 0F, -0.075F, -0.075F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 7
		pumpModel[2].setRotationPoint(-1F, -6.17F, -2.5F);
		pumpModel[2].rotateAngleX = -0.17453293F;
		
		gunSlideDistance = 0.05F;
		pumpDelayAfterReload = 65;
		pumpDelay = 11;
		pumpTime = 9;
		animationType = EnumAnimationType.RIFLE_TOP;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.25F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.35F;
		untiltGunTime = 0.4F;
		
		translateAll(2F, -4.3F, 0F);
	}
}