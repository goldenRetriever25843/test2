//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SprutSD
// Model Creator: 
// Created on: 29.06.2015 - 13:29:38
// Last changed on: 29.06.2015 - 13:29:38

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSprutTD extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSprutTD() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[45];
		turretModel = new ModelRendererTurbo[35];
		barrelModel = new ModelRendererTurbo[14];
		leftTrackWheelModels = new ModelRendererTurbo[101];
		rightTrackWheelModels = new ModelRendererTurbo[101];
		rightTrackModel = new ModelRendererTurbo[18];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 14
		bodyModel[4] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 14
		bodyModel[16] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 14
		bodyModel[17] = new ModelRendererTurbo(this, 769, 89, textureX, textureY); // Box 14
		bodyModel[18] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 14
		bodyModel[19] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 14
		bodyModel[20] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 14
		bodyModel[21] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 14
		bodyModel[22] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 14
		bodyModel[23] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 14
		bodyModel[24] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 14
		bodyModel[25] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 14
		bodyModel[26] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 14
		bodyModel[27] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 14
		bodyModel[28] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 14
		bodyModel[29] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 14
		bodyModel[30] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 14
		bodyModel[31] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 14
		bodyModel[32] = new ModelRendererTurbo(this, 905, 97, textureX, textureY); // Box 14
		bodyModel[33] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Box 14
		bodyModel[34] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 14
		bodyModel[35] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 14
		bodyModel[36] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 14
		bodyModel[37] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 14
		bodyModel[38] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 14
		bodyModel[39] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 14
		bodyModel[40] = new ModelRendererTurbo(this, 777, 105, textureX, textureY); // Box 14
		bodyModel[41] = new ModelRendererTurbo(this, 801, 105, textureX, textureY); // Box 14
		bodyModel[42] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 14
		bodyModel[43] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 14
		bodyModel[44] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 14

		bodyModel[0].addShapeBox(0F, 0F, 0F, 153, 13, 48, 0F,0F, -8F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -8F, 1F, -6F, 0F, 1F, -22F, 0F, 1F, -22F, 0F, 1F, -6F, 0F, 1F); // Box 14
		bodyModel[0].setRotationPoint(-83F, -8F, -24F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 128, 12, 70, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 14
		bodyModel[1].setRotationPoint(-85F, -24F, -35F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 12, 70, 0F,0F, 0F, -1F, 1.5F, -4F, -0.75F, 1.5F, -4F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[2].setRotationPoint(41F, -24F, -35F);

		bodyModel[3].addShapeBox(0F, 0F, -4F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[3].setRotationPoint(74F, -20F, 25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[4].setRotationPoint(74F, -20F, -25F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 160, 4, 48, 0F,-4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 8F, 1F, -3F, 0F, 1F, -3F, 0F, 1F, -4F, 8F, 1F); // Box 14
		bodyModel[5].setRotationPoint(-87F, -12F, -24F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 144, 1, 12, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 14
		bodyModel[6].setRotationPoint(-79F, -12F, -36.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 14
		bodyModel[7].setRotationPoint(62F, -12F, -36.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(66F, -8F, -36.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 14
		bodyModel[9].setRotationPoint(-78F, -11F, -36.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(-83F, -9.2F, -36.5F);
		bodyModel[10].rotateAngleZ = -0.17453293F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 8, 70, 0F,-1.5F, 0F, -0.75F, 3F, -4F, -8F, 3F, -4F, -8F, -1.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 14
		bodyModel[11].setRotationPoint(57F, -20F, -35F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(66F, -8F, 24.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(62F, -12F, 24.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 144, 1, 12, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-79F, -12F, 24.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[15].setRotationPoint(-83F, -9.2F, 24.5F);
		bodyModel[15].rotateAngleZ = -0.17453293F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[16].setRotationPoint(-83F, -12F, -35F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[17].setRotationPoint(-83F, -12F, 23F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,-1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F); // Box 14
		bodyModel[18].setRotationPoint(-78F, -11F, 24.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[19].setRotationPoint(-83F, -23F, 30F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[20].setRotationPoint(-83F, -19F, 30F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[21].setRotationPoint(-83F, -15F, 30F);

		bodyModel[22].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[22].setRotationPoint(-83F, -15F, -30F);

		bodyModel[23].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[23].setRotationPoint(-83F, -19F, -30F);

		bodyModel[24].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[24].setRotationPoint(-83F, -23F, -30F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 14
		bodyModel[25].setRotationPoint(-84F, -23F, 30F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 14
		bodyModel[26].setRotationPoint(-84F, -19F, 30F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 14
		bodyModel[27].setRotationPoint(-84F, -15F, 30F);

		bodyModel[28].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 14
		bodyModel[28].setRotationPoint(-84F, -15F, -30F);

		bodyModel[29].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 14
		bodyModel[29].setRotationPoint(-84F, -19F, -30F);

		bodyModel[30].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 14
		bodyModel[30].setRotationPoint(-84F, -23F, -30F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[31].setRotationPoint(32F, 5F, 22F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[32].setRotationPoint(16F, 5F, 22F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[33].setRotationPoint(0F, 5F, 22F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[34].setRotationPoint(-16F, 5F, 22F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[35].setRotationPoint(-32F, 5F, 22F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[36].setRotationPoint(-48F, 5F, 22F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[37].setRotationPoint(-64F, 5F, 22F);

		bodyModel[38].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[38].setRotationPoint(-64F, 5F, -22F);

		bodyModel[39].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[39].setRotationPoint(-48F, 5F, -22F);

		bodyModel[40].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[40].setRotationPoint(-32F, 5F, -22F);

		bodyModel[41].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[41].setRotationPoint(-16F, 5F, -22F);

		bodyModel[42].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[42].setRotationPoint(0F, 5F, -22F);

		bodyModel[43].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[43].setRotationPoint(16F, 5F, -22F);

		bodyModel[44].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[44].setRotationPoint(32F, 5F, -22F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 14
		turretModel[1] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 14
		turretModel[2] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Box 14
		turretModel[3] = new ModelRendererTurbo(this, 873, 113, textureX, textureY); // Box 14
		turretModel[4] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 14
		turretModel[5] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 14
		turretModel[6] = new ModelRendererTurbo(this, 889, 153, textureX, textureY); // Box 14
		turretModel[7] = new ModelRendererTurbo(this, 649, 145, textureX, textureY); // Box 14
		turretModel[8] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 14
		turretModel[9] = new ModelRendererTurbo(this, 537, 121, textureX, textureY); // Box 14
		turretModel[10] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 14
		turretModel[11] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 14
		turretModel[12] = new ModelRendererTurbo(this, 737, 201, textureX, textureY); // Box 14
		turretModel[13] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 14
		turretModel[14] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 14
		turretModel[15] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 14
		turretModel[16] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 14
		turretModel[17] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 14
		turretModel[18] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 14
		turretModel[19] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 14
		turretModel[20] = new ModelRendererTurbo(this, 801, 9, textureX, textureY); // Box 14
		turretModel[21] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 14
		turretModel[22] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 14
		turretModel[23] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 14
		turretModel[24] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 14
		turretModel[25] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 14
		turretModel[26] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 14
		turretModel[27] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 14
		turretModel[28] = new ModelRendererTurbo(this, 785, 41, textureX, textureY); // Box 14
		turretModel[29] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Box 14
		turretModel[30] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 14
		turretModel[31] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 14
		turretModel[32] = new ModelRendererTurbo(this, 985, 121, textureX, textureY); // Box 14
		turretModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 312
		turretModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 313

		turretModel[0].addShapeBox(2F, 0F, -34F, 22, 16, 68, 0F,0F, -1F, -14F, -4F, -4F, -28F, -4F, -4F, -28F, 0F, -1F, -14F, -4F, 0F, -2F, 6F, 0F, -23F, 6F, 0F, -23F, -4F, 0F, -2F); // Box 14
		turretModel[0].setRotationPoint(0F, -41F, 0F);

		turretModel[1].addShapeBox(-14F, 0F, -32F, 20, 17, 64, 0F,0F, -1F, -2F, -4F, -2F, -12F, -4F, -2F, -12F, 0F, -1F, -2F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F); // Box 14
		turretModel[1].setRotationPoint(0F, -42F, 0F);

		turretModel[2].addShapeBox(-16F, 0F, -32F, 22, 17, 64, 0F,0F, -1F, -2F, -20F, -1F, -2F, -20F, -1F, -2F, 0F, -1F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 14
		turretModel[2].setRotationPoint(0F, -42F, 0F);

		turretModel[3].addShapeBox(-11F, 0F, -22F, 8, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[3].setRotationPoint(-8F, -40F, 5F);

		turretModel[4].addShapeBox(5F, 0F, -22F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 0.00F, -4.00F, 0F, 0.00F, -4.00F, 0F, 0F, 0F, 0F, 0F, 0.00F, 0F, 0.00F, -4F, 0F, 0.00F, -4.00F, 0F, 0F, 0F); // Box 14
		turretModel[4].setRotationPoint(-16F, -40F, 5F);

		turretModel[5].addShapeBox(-5F, 0F, -22F, 4, 2, 14, 0F,0F, 0.00F, -4F, 0F, 0F, 0.00F, 0F, 0F, 0F, 0F, 0.00F, -4.00F, 0F, 0.00F, -4F, 0F, 0F, 0.00F, 0F, 0F, 0F, 0F, 0.00F, -4.00F); // Box 14
		turretModel[5].setRotationPoint(-18F, -40F, 5F);

		turretModel[6].addShapeBox(-32F, 0F, -24F, 4, 17, 48, 0F,0F, -1F, -7F, 2F, -1F, -2F, 2F, -1F, -2F, 0F, -1F, -7F, 2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F); // Box 14
		turretModel[6].setRotationPoint(0F, -42F, 0F);

		turretModel[7].addShapeBox(-28F, 0F, -32F, 12, 17, 64, 0F,-2F, -1F, -10F, 0F, -1F, -2F, 0F, -1F, -2F, -2F, -1F, -10F, 0F, 0F, -8F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -8F); // Box 14
		turretModel[7].setRotationPoint(0F, -42F, 0F);

		turretModel[8].addShapeBox(-39F, 3F, -10F, 6, 6, 24, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		turretModel[8].setRotationPoint(0F, -43F, 0F);
		turretModel[8].rotateAngleY = -0.52359878F;

		turretModel[9].addShapeBox(-39F, 3F, -14F, 6, 6, 24, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		turretModel[9].setRotationPoint(0F, -43F, 0F);
		turretModel[9].rotateAngleY = 0.52359878F;

		turretModel[10].addShapeBox(-11F, 0F, -33F, 22, 1, 66, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		turretModel[10].setRotationPoint(0F, -25F, 0F);

		turretModel[11].addShapeBox(-33F, 0F, -33F, 22, 1, 66, 0F,-1F, 0F, -22F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -22F, -1F, 0F, -22F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -22F); // Box 14
		turretModel[11].setRotationPoint(0F, -25F, 0F);

		turretModel[12].addShapeBox(11F, 0F, -33F, 22, 1, 66, 0F,0F, 0F, -1F, -1F, 0F, -22F, -1F, 0F, -22F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -22F, -1F, 0F, -22F, 0F, 0F, -1F); // Box 14
		turretModel[12].setRotationPoint(0F, -25F, 0F);

		turretModel[13].addShapeBox(-6F, -4F, -18F, 8, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[13].setRotationPoint(0F, -42F, 0F);

		turretModel[14].addShapeBox(-4F, -2F, 18F, 6, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[14].setRotationPoint(0F, -42F, 0F);

		turretModel[15].addShapeBox(-26F, 26F, -2F, 6, 1, 20, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		turretModel[15].setRotationPoint(0F, -43F, 0F);
		turretModel[15].rotateAngleZ = -0.6981317F;

		turretModel[16].addShapeBox(-26F, 22F, -2F, 6, 4, 13, 0F,-3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		turretModel[16].setRotationPoint(0F, -43F, 0F);
		turretModel[16].rotateAngleZ = -0.6981317F;

		turretModel[17].addShapeBox(-26F, 22F, 5F, 6, 4, 13, 0F,-3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		turretModel[17].setRotationPoint(0F, -43F, 0F);
		turretModel[17].rotateAngleZ = -0.6981317F;

		turretModel[18].addShapeBox(-26F, -26F, 9.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[18].setRotationPoint(0F, -43F, 0F);
		turretModel[18].rotateAngleZ = 0.87266463F;

		turretModel[19].addShapeBox(-26F, -26F, 7.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[19].setRotationPoint(0F, -43F, 0F);
		turretModel[19].rotateAngleZ = 0.87266463F;

		turretModel[20].addShapeBox(-26F, -26F, 5.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[20].setRotationPoint(0F, -43F, 0F);
		turretModel[20].rotateAngleZ = 0.87266463F;

		turretModel[21].addShapeBox(-26F, -24F, 5.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[21].setRotationPoint(0F, -43F, 0F);
		turretModel[21].rotateAngleZ = 0.87266463F;

		turretModel[22].addShapeBox(-26F, -24F, 7.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[22].setRotationPoint(0F, -43F, 0F);
		turretModel[22].rotateAngleZ = 0.87266463F;

		turretModel[23].addShapeBox(-26F, -24F, 9.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[23].setRotationPoint(0F, -43F, 0F);
		turretModel[23].rotateAngleZ = 0.87266463F;

		turretModel[24].addShapeBox(-26F, -24F, -10.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[24].setRotationPoint(0F, -43F, 0F);
		turretModel[24].rotateAngleZ = 0.87266463F;

		turretModel[25].addShapeBox(-26F, -24F, -8.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[25].setRotationPoint(0F, -43F, 0F);
		turretModel[25].rotateAngleZ = 0.87266463F;

		turretModel[26].addShapeBox(-26F, -24F, -6.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[26].setRotationPoint(0F, -43F, 0F);
		turretModel[26].rotateAngleZ = 0.87266463F;

		turretModel[27].addShapeBox(-26F, -26F, -10.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[27].setRotationPoint(0F, -43F, 0F);
		turretModel[27].rotateAngleZ = 0.87266463F;

		turretModel[28].addShapeBox(-26F, -26F, -8.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[28].setRotationPoint(0F, -43F, 0F);
		turretModel[28].rotateAngleZ = 0.87266463F;

		turretModel[29].addShapeBox(-26F, -26F, -6.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[29].setRotationPoint(0F, -43F, 0F);
		turretModel[29].rotateAngleZ = 0.87266463F;

		turretModel[30].addShapeBox(-26F, 22F, -18F, 6, 4, 13, 0F,-3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		turretModel[30].setRotationPoint(0F, -43F, 0F);
		turretModel[30].rotateAngleZ = -0.6981317F;

		turretModel[31].addShapeBox(-26F, 26F, -18F, 6, 1, 20, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		turretModel[31].setRotationPoint(0F, -43F, 0F);
		turretModel[31].rotateAngleZ = -0.6981317F;

		turretModel[32].addShapeBox(-26F, 22F, -11F, 6, 4, 13, 0F,-3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Box 14
		turretModel[32].setRotationPoint(0F, -43F, 0F);
		turretModel[32].rotateAngleZ = -0.6981317F;

		turretModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,11.4F, 50F, -0.4F, -12.4F, 50F, -0.4F, -12.4F, 50F, -0.4F, 11.4F, 50F, -0.4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 312
		turretModel[33].setRotationPoint(-19.1F, -40F, -25F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,11.4F, 50F, -0.4F, -12.4F, 50F, -0.4F, -12.4F, 50F, -0.4F, 11.4F, 50F, -0.4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 313
		turretModel[34].setRotationPoint(-19.1F, -40F, 24F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 14
		barrelModel[1] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 14
		barrelModel[2] = new ModelRendererTurbo(this, 649, 145, textureX, textureY); // Box 14
		barrelModel[3] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 14
		barrelModel[4] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 14
		barrelModel[5] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 14
		barrelModel[6] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 14
		barrelModel[7] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 14
		barrelModel[8] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 14
		barrelModel[9] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 14
		barrelModel[10] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 14
		barrelModel[11] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Box 14
		barrelModel[12] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 14
		barrelModel[13] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 14

		barrelModel[0].addShapeBox(-6.5F, -2.5F, -5F, 12, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[0].setRotationPoint(24F, -30F, 0F);

		barrelModel[1].addShapeBox(-6.5F, -5.5F, -5F, 12, 3, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[1].setRotationPoint(24F, -30F, 0F);

		barrelModel[2].addShapeBox(-6.5F, 2.5F, -5F, 12, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 14
		barrelModel[2].setRotationPoint(24F, -30F, 0F);

		barrelModel[3].addShapeBox(5F, -2F, -2F, 90, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[3].setRotationPoint(24F, -30F, 0F);

		barrelModel[4].addShapeBox(5F, -1F, -2F, 90, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[4].setRotationPoint(24F, -30F, 0F);

		barrelModel[5].addShapeBox(5F, 1F, -2F, 90, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		barrelModel[5].setRotationPoint(24F, -30F, 0F);

		barrelModel[6].addShapeBox(53F, -1F, -2.5F, 20, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[6].setRotationPoint(24F, -30F, 0F);

		barrelModel[7].addShapeBox(53F, 1F, -2.5F, 20, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 14
		barrelModel[7].setRotationPoint(24F, -30F, 0F);

		barrelModel[8].addShapeBox(53F, -2F, -2.5F, 20, 1, 5, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[8].setRotationPoint(24F, -30F, 0F);

		barrelModel[9].addShapeBox(95F, -1F, -2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[9].setRotationPoint(24F, -30F, 0F);

		barrelModel[10].addShapeBox(95F, -2F, -2F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[10].setRotationPoint(24F, -30F, 0F);

		barrelModel[11].addShapeBox(95F, 1F, -2F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		barrelModel[11].setRotationPoint(24F, -30F, 0F);

		barrelModel[12].addShapeBox(95F, -1F, 1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[12].setRotationPoint(24F, -30F, 0F);

		barrelModel[13].addShapeBox(5F, -3.5F, 1.5F, 2, 5, 5, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F); // Box 14
		barrelModel[13].setRotationPoint(24F, -29F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 21
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 22
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 23
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 24
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 513, 137, textureX, textureY); // Box 25
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 26
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 27
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 873, 105, textureX, textureY); // Box 28
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 29
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 30
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 31
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Box 32
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 33
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 34
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Box 35
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 537, 137, textureX, textureY); // Box 36
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Box 37
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 38
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 39
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 40
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Box 41
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 953, 129, textureX, textureY); // Box 42
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 43
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 993, 153, textureX, textureY); // Box 44
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 45
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 46
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 47
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 961, 137, textureX, textureY); // Box 48
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 49
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 50
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 51
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 52
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 53
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 54
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 55
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 56
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 57
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 58
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 59
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 60
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 61
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 62
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 545, 161, textureX, textureY); // Box 63
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 64
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 897, 161, textureX, textureY); // Box 65
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 913, 161, textureX, textureY); // Box 66
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 67
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 68
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 69
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Box 70
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 71
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 689, 145, textureX, textureY); // Box 72
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 73
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 74
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 75
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 76
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 77
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 78
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 79
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Box 80
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 785, 169, textureX, textureY); // Box 81
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 82
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 953, 169, textureX, textureY); // Box 83
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 84
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 85
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 86
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 87
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 88
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 89
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 577, 169, textureX, textureY); // Box 90
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 889, 169, textureX, textureY); // Box 91
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Box 92
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 93
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 94
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 95
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Box 96
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 649, 177, textureX, textureY); // Box 97
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 905, 169, textureX, textureY); // Box 98
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 99
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 977, 169, textureX, textureY); // Box 100
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 101
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 102
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 103
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 104
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 105
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 953, 185, textureX, textureY); // Box 106
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 985, 185, textureX, textureY); // Box 107
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 108
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 109
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 110
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 111
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 112
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 113
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 114
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 115
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 116
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 117
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 118
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 119
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 120
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 121

		leftTrackWheelModels[0].addShapeBox(-2F, -7F, -5F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 21
		leftTrackWheelModels[0].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[1].addShapeBox(-7F, -3F, -5F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftTrackWheelModels[1].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[2].addShapeBox(-2F, 3F, -5F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 23
		leftTrackWheelModels[2].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[3].addShapeBox(-3F, -7F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftTrackWheelModels[3].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[4].addShapeBox(-3F, 6F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		leftTrackWheelModels[4].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[5].addShapeBox(6F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		leftTrackWheelModels[5].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[6].addShapeBox(-7F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftTrackWheelModels[6].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[7].addShapeBox(-7F, -7F, -5F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftTrackWheelModels[7].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[8].addShapeBox(6F, -7F, -5F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		leftTrackWheelModels[8].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[9].addShapeBox(6F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 30
		leftTrackWheelModels[9].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[10].addShapeBox(-7F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 31
		leftTrackWheelModels[10].setRotationPoint(-56F, 5F, 34F);

		leftTrackWheelModels[11].addShapeBox(-2F, -2F, -11F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		leftTrackWheelModels[11].setRotationPoint(-56F, 5F, 36F);

		leftTrackWheelModels[12].addShapeBox(-2F, -7F, -5F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 33
		leftTrackWheelModels[12].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[13].addShapeBox(-7F, -3F, -5F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftTrackWheelModels[13].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[14].addShapeBox(-2F, 3F, -5F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 35
		leftTrackWheelModels[14].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[15].addShapeBox(-3F, -7F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		leftTrackWheelModels[15].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[16].addShapeBox(-3F, 6F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftTrackWheelModels[16].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[17].addShapeBox(6F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftTrackWheelModels[17].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[18].addShapeBox(-7F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		leftTrackWheelModels[18].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[19].addShapeBox(-7F, -7F, -5F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		leftTrackWheelModels[19].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[20].addShapeBox(6F, -7F, -5F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		leftTrackWheelModels[20].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[21].addShapeBox(6F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 42
		leftTrackWheelModels[21].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[22].addShapeBox(-7F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 43
		leftTrackWheelModels[22].setRotationPoint(-41F, 5F, 34F);

		leftTrackWheelModels[23].addShapeBox(-2F, -2F, -11F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftTrackWheelModels[23].setRotationPoint(-40F, 5F, 36F);

		leftTrackWheelModels[24].addShapeBox(-2F, -7F, -5F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 45
		leftTrackWheelModels[24].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[25].addShapeBox(-7F, -3F, -5F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftTrackWheelModels[25].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[26].addShapeBox(-2F, 3F, -5F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 47
		leftTrackWheelModels[26].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[27].addShapeBox(-3F, -7F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		leftTrackWheelModels[27].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[28].addShapeBox(-3F, 6F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftTrackWheelModels[28].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[29].addShapeBox(6F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftTrackWheelModels[29].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[30].addShapeBox(-7F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftTrackWheelModels[30].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[31].addShapeBox(-7F, -7F, -5F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftTrackWheelModels[31].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[32].addShapeBox(6F, -7F, -5F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		leftTrackWheelModels[32].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[33].addShapeBox(6F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 54
		leftTrackWheelModels[33].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[34].addShapeBox(-7F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 55
		leftTrackWheelModels[34].setRotationPoint(-26F, 5F, 34F);

		leftTrackWheelModels[35].addShapeBox(-2F, -2F, -11F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		leftTrackWheelModels[35].setRotationPoint(-24F, 5F, 36F);

		leftTrackWheelModels[36].addShapeBox(-2F, -7F, -5F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 57
		leftTrackWheelModels[36].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[37].addShapeBox(-7F, -3F, -5F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftTrackWheelModels[37].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[38].addShapeBox(-2F, 3F, -5F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 59
		leftTrackWheelModels[38].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[39].addShapeBox(-3F, -7F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftTrackWheelModels[39].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[40].addShapeBox(-3F, 6F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftTrackWheelModels[40].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[41].addShapeBox(6F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftTrackWheelModels[41].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[42].addShapeBox(-7F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		leftTrackWheelModels[42].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[43].addShapeBox(-7F, -7F, -5F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftTrackWheelModels[43].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[44].addShapeBox(6F, -7F, -5F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		leftTrackWheelModels[44].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[45].addShapeBox(6F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 66
		leftTrackWheelModels[45].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[46].addShapeBox(-7F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 67
		leftTrackWheelModels[46].setRotationPoint(-11F, 5F, 34F);

		leftTrackWheelModels[47].addShapeBox(-2F, -2F, -11F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftTrackWheelModels[47].setRotationPoint(-8F, 5F, 36F);

		leftTrackWheelModels[48].addShapeBox(-2F, -7F, -5F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 69
		leftTrackWheelModels[48].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[49].addShapeBox(-7F, -3F, -5F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftTrackWheelModels[49].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[50].addShapeBox(-2F, 3F, -5F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 71
		leftTrackWheelModels[50].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[51].addShapeBox(-3F, -7F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftTrackWheelModels[51].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[52].addShapeBox(-3F, 6F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftTrackWheelModels[52].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[53].addShapeBox(6F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftTrackWheelModels[53].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[54].addShapeBox(-7F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		leftTrackWheelModels[54].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[55].addShapeBox(-7F, -7F, -5F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		leftTrackWheelModels[55].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[56].addShapeBox(6F, -7F, -5F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		leftTrackWheelModels[56].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[57].addShapeBox(6F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 78
		leftTrackWheelModels[57].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[58].addShapeBox(-7F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 79
		leftTrackWheelModels[58].setRotationPoint(4F, 5F, 34F);

		leftTrackWheelModels[59].addShapeBox(-2F, -2F, -11F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftTrackWheelModels[59].setRotationPoint(8F, 5F, 36F);

		leftTrackWheelModels[60].addShapeBox(-2F, -7F, -5F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 81
		leftTrackWheelModels[60].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[61].addShapeBox(-7F, -3F, -5F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		leftTrackWheelModels[61].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[62].addShapeBox(-2F, 3F, -5F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 83
		leftTrackWheelModels[62].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[63].addShapeBox(-3F, -7F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		leftTrackWheelModels[63].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[64].addShapeBox(-3F, 6F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftTrackWheelModels[64].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[65].addShapeBox(6F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		leftTrackWheelModels[65].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[66].addShapeBox(-7F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		leftTrackWheelModels[66].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[67].addShapeBox(-7F, -7F, -5F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		leftTrackWheelModels[67].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[68].addShapeBox(6F, -7F, -5F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		leftTrackWheelModels[68].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[69].addShapeBox(6F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 90
		leftTrackWheelModels[69].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[70].addShapeBox(-7F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 91
		leftTrackWheelModels[70].setRotationPoint(19F, 5F, 34F);

		leftTrackWheelModels[71].addShapeBox(-2F, -2F, -11F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftTrackWheelModels[71].setRotationPoint(18F, 5F, 36F);

		leftTrackWheelModels[72].addShapeBox(-2F, -7F, -5F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 93
		leftTrackWheelModels[72].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[73].addShapeBox(-7F, -3F, -5F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftTrackWheelModels[73].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[74].addShapeBox(-2F, 3F, -5F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 95
		leftTrackWheelModels[74].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[75].addShapeBox(-3F, -7F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		leftTrackWheelModels[75].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[76].addShapeBox(-3F, 6F, -5F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftTrackWheelModels[76].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[77].addShapeBox(6F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		leftTrackWheelModels[77].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[78].addShapeBox(-7F, -3F, -5F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		leftTrackWheelModels[78].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[79].addShapeBox(-7F, -7F, -5F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftTrackWheelModels[79].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[80].addShapeBox(6F, -7F, -5F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		leftTrackWheelModels[80].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[81].addShapeBox(6F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 102
		leftTrackWheelModels[81].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[82].addShapeBox(-7F, 3F, -5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 103
		leftTrackWheelModels[82].setRotationPoint(34F, 5F, 34F);

		leftTrackWheelModels[83].addShapeBox(-2F, -2F, -11F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftTrackWheelModels[83].setRotationPoint(34F, 5F, 36F);

		leftTrackWheelModels[84].addShapeBox(-4F, -2F, -6F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		leftTrackWheelModels[84].setRotationPoint(58F, -4.5F, 34F);

		leftTrackWheelModels[85].addShapeBox(-4F, 2F, -6F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 106
		leftTrackWheelModels[85].setRotationPoint(58F, -4.5F, 34F);

		leftTrackWheelModels[86].addShapeBox(-4F, -4F, -6F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		leftTrackWheelModels[86].setRotationPoint(58F, -4.5F, 34F);

		leftTrackWheelModels[87].addShapeBox(-4F, -4F, -8F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftTrackWheelModels[87].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[88].addShapeBox(-3F, -3F, -7.5F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		leftTrackWheelModels[88].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[89].addShapeBox(-3F, -8F, -8F, 4, 4, 5, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 110
		leftTrackWheelModels[89].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[90].addShapeBox(2F, -4F, -8F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftTrackWheelModels[90].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[91].addShapeBox(-3F, 2F, -8F, 4, 4, 5, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 112
		leftTrackWheelModels[91].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[92].addShapeBox(-8F, -4F, -8F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		leftTrackWheelModels[92].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[93].addShapeBox(-4F, -8F, -3F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackWheelModels[93].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[94].addShapeBox(5F, -8F, -3F, 1, 4, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		leftTrackWheelModels[94].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[95].addShapeBox(5F, -4F, -3F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		leftTrackWheelModels[95].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[96].addShapeBox(5F, 2F, -3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 117
		leftTrackWheelModels[96].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[97].addShapeBox(-4F, 5F, -3F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		leftTrackWheelModels[97].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[98].addShapeBox(-8F, 2F, -3F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 119
		leftTrackWheelModels[98].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[99].addShapeBox(-8F, -4F, -3F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		leftTrackWheelModels[99].setRotationPoint(-71F, -1F, 36F);

		leftTrackWheelModels[100].addShapeBox(-8F, -8F, -3F, 1, 4, 1, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		leftTrackWheelModels[100].setRotationPoint(-71F, -1F, 36F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 14
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 14
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 14
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1009, 17, textureX, textureY); // Box 14
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 769, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 809, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 969, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 14
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 665, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 14
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 14
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 721, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 969, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 14
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 14
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 14
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 14
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 14
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 14
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 14
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 14
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 14
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 14
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 14
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 14
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 14
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 14
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 14
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 14
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 14
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 801, 89, textureX, textureY); // Box 14
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 14
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 14
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 14
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 14

		rightTrackWheelModels[0].addShapeBox(-2F, -7F, 1F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 14
		rightTrackWheelModels[0].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[1].addShapeBox(-7F, -3F, 1F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[1].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[2].addShapeBox(-2F, 3F, 1F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightTrackWheelModels[2].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[3].addShapeBox(-3F, -7F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[3].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[4].addShapeBox(-3F, 6F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[4].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[5].addShapeBox(6F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[5].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[6].addShapeBox(-7F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[6].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[7].addShapeBox(-7F, -7F, 0F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[7].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[8].addShapeBox(6F, -7F, 0F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[8].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[9].addShapeBox(6F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 14
		rightTrackWheelModels[9].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[10].addShapeBox(-7F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 14
		rightTrackWheelModels[10].setRotationPoint(-56F, 5F, -34F);

		rightTrackWheelModels[11].addShapeBox(-2F, -2F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[11].setRotationPoint(-58F, 5F, -32F);

		rightTrackWheelModels[12].addShapeBox(-2F, -7F, 1F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 14
		rightTrackWheelModels[12].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[13].addShapeBox(-7F, -3F, 1F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[13].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[14].addShapeBox(-2F, 3F, 1F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightTrackWheelModels[14].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[15].addShapeBox(-3F, -7F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[15].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[16].addShapeBox(-3F, 6F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[16].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[17].addShapeBox(6F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[17].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[18].addShapeBox(-7F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[18].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[19].addShapeBox(-7F, -7F, 0F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[19].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[20].addShapeBox(6F, -7F, 0F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[20].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[21].addShapeBox(6F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 14
		rightTrackWheelModels[21].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[22].addShapeBox(-7F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 14
		rightTrackWheelModels[22].setRotationPoint(-41F, 5F, -34F);

		rightTrackWheelModels[23].addShapeBox(-2F, -2F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[23].setRotationPoint(-42F, 5F, -32F);

		rightTrackWheelModels[24].addShapeBox(-2F, -7F, 1F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 14
		rightTrackWheelModels[24].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[25].addShapeBox(-7F, -3F, 1F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[25].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[26].addShapeBox(-2F, 3F, 1F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightTrackWheelModels[26].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[27].addShapeBox(-3F, -7F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[27].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[28].addShapeBox(-3F, 6F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[28].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[29].addShapeBox(6F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[29].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[30].addShapeBox(-7F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[30].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[31].addShapeBox(-7F, -7F, 0F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[31].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[32].addShapeBox(6F, -7F, 0F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[32].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[33].addShapeBox(6F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 14
		rightTrackWheelModels[33].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[34].addShapeBox(-7F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 14
		rightTrackWheelModels[34].setRotationPoint(-26F, 5F, -34F);

		rightTrackWheelModels[35].addShapeBox(-2F, -2F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[35].setRotationPoint(-26F, 5F, -32F);

		rightTrackWheelModels[36].addShapeBox(-2F, -7F, 1F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 14
		rightTrackWheelModels[36].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[37].addShapeBox(-7F, -3F, 1F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[37].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[38].addShapeBox(-2F, 3F, 1F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightTrackWheelModels[38].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[39].addShapeBox(-3F, -7F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[39].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[40].addShapeBox(-3F, 6F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[40].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[41].addShapeBox(6F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[41].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[42].addShapeBox(-7F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[42].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[43].addShapeBox(-7F, -7F, 0F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[43].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[44].addShapeBox(6F, -7F, 0F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[44].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[45].addShapeBox(6F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 14
		rightTrackWheelModels[45].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[46].addShapeBox(-7F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 14
		rightTrackWheelModels[46].setRotationPoint(-11F, 5F, -34F);

		rightTrackWheelModels[47].addShapeBox(-2F, -2F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[47].setRotationPoint(-10F, 5F, -32F);

		rightTrackWheelModels[48].addShapeBox(-2F, -7F, 1F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 14
		rightTrackWheelModels[48].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[49].addShapeBox(-7F, -3F, 1F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[49].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[50].addShapeBox(-2F, 3F, 1F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightTrackWheelModels[50].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[51].addShapeBox(-3F, -7F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[51].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[52].addShapeBox(-3F, 6F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[52].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[53].addShapeBox(6F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[53].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[54].addShapeBox(-7F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[54].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[55].addShapeBox(-7F, -7F, 0F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[55].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[56].addShapeBox(6F, -7F, 0F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[56].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[57].addShapeBox(6F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 14
		rightTrackWheelModels[57].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[58].addShapeBox(-7F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 14
		rightTrackWheelModels[58].setRotationPoint(4F, 5F, -34F);

		rightTrackWheelModels[59].addShapeBox(-2F, -2F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[59].setRotationPoint(6F, 5F, -32F);

		rightTrackWheelModels[60].addShapeBox(-2F, -7F, 1F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 14
		rightTrackWheelModels[60].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[61].addShapeBox(-7F, -3F, 1F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[61].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[62].addShapeBox(-2F, 3F, 1F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightTrackWheelModels[62].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[63].addShapeBox(-3F, -7F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[63].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[64].addShapeBox(-3F, 6F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[64].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[65].addShapeBox(6F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[65].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[66].addShapeBox(-7F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[66].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[67].addShapeBox(-7F, -7F, 0F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[67].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[68].addShapeBox(6F, -7F, 0F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[68].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[69].addShapeBox(6F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 14
		rightTrackWheelModels[69].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[70].addShapeBox(-7F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 14
		rightTrackWheelModels[70].setRotationPoint(19F, 5F, -34F);

		rightTrackWheelModels[71].addShapeBox(-2F, -2F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[71].setRotationPoint(22F, 5F, -32F);

		rightTrackWheelModels[72].addShapeBox(-2F, -7F, 1F, 4, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 14
		rightTrackWheelModels[72].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[73].addShapeBox(-7F, -3F, 1F, 14, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[73].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[74].addShapeBox(-2F, 3F, 1F, 4, 4, 4, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightTrackWheelModels[74].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[75].addShapeBox(-3F, -7F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[75].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[76].addShapeBox(-3F, 6F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[76].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[77].addShapeBox(6F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[77].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[78].addShapeBox(-7F, -3F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[78].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[79].addShapeBox(-7F, -7F, 0F, 1, 4, 5, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[79].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[80].addShapeBox(6F, -7F, 0F, 1, 4, 5, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[80].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[81].addShapeBox(6F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 14
		rightTrackWheelModels[81].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[82].addShapeBox(-7F, 3F, 0F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 14
		rightTrackWheelModels[82].setRotationPoint(34F, 5F, -34F);

		rightTrackWheelModels[83].addShapeBox(-2F, -2F, 0F, 4, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[83].setRotationPoint(38F, 5F, -32F);

		rightTrackWheelModels[84].addShapeBox(-4F, -2F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[84].setRotationPoint(58F, -4.5F, -34F);

		rightTrackWheelModels[85].addShapeBox(-4F, 2F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 14
		rightTrackWheelModels[85].setRotationPoint(58F, -4.5F, -34F);

		rightTrackWheelModels[86].addShapeBox(-4F, -4F, 0F, 8, 2, 6, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[86].setRotationPoint(58F, -4.5F, -34F);

		rightTrackWheelModels[87].addShapeBox(-4F, -4F, 0F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[87].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[88].addShapeBox(-3F, -3F, -0.5F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[88].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[89].addShapeBox(-3F, -8F, -1F, 4, 4, 5, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F); // Box 14
		rightTrackWheelModels[89].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[90].addShapeBox(2F, -4F, -1F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[90].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[91].addShapeBox(-3F, 2F, -1F, 4, 4, 5, 0F,5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 5.00F, 0F, 0.00F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 14
		rightTrackWheelModels[91].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[92].addShapeBox(-8F, -4F, -1F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[92].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[93].addShapeBox(-4F, -8F, -2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[93].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[94].addShapeBox(5F, -8F, -2F, 1, 4, 1, 0F,3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[94].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[95].addShapeBox(5F, -4F, -2F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[95].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[96].addShapeBox(5F, 2F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F); // Box 14
		rightTrackWheelModels[96].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[97].addShapeBox(-4F, 5F, -2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[97].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[98].addShapeBox(-8F, 2F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F); // Box 14
		rightTrackWheelModels[98].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[99].addShapeBox(-8F, -4F, -2F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[99].setRotationPoint(-71F, -1F, -32F);

		rightTrackWheelModels[100].addShapeBox(-8F, -8F, -2F, 1, 4, 1, 0F,-4F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackWheelModels[100].setRotationPoint(-71F, -1F, -32F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 14
		rightTrackModel[1] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 14
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		rightTrackModel[3] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 14
		rightTrackModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		rightTrackModel[5] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 14
		rightTrackModel[6] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 14
		rightTrackModel[7] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 14
		rightTrackModel[8] = new ModelRendererTurbo(this, 841, 97, textureX, textureY); // Box 14
		rightTrackModel[9] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 12
		rightTrackModel[10] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 13
		rightTrackModel[11] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 14
		rightTrackModel[12] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 15
		rightTrackModel[13] = new ModelRendererTurbo(this, 945, 113, textureX, textureY); // Box 16
		rightTrackModel[14] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 17
		rightTrackModel[15] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 18
		rightTrackModel[16] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Box 19
		rightTrackModel[17] = new ModelRendererTurbo(this, 953, 153, textureX, textureY); // Box 20

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 102, 1, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 14
		rightTrackModel[0].setRotationPoint(-62F, 12F, -35F);

		rightTrackModel[1].addShapeBox(2F, 0F, 0F, 30, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[1].setRotationPoint(64.7F, -3F, -35F);
		rightTrackModel[1].rotateAngleZ = -2.61799388F;

		rightTrackModel[2].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 14
		rightTrackModel[2].setRotationPoint(-80.1F, -5F, -35F);

		rightTrackModel[3].addShapeBox(1F, 0F, 15F, 24, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[3].setRotationPoint(-80.5F, 0.6F, -50F);
		rightTrackModel[3].rotateAngleZ = -0.4712389F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[4].setRotationPoint(62F, -7F, -35F);

		rightTrackModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[5].setRotationPoint(62.4F, -6.2F, -35F);
		rightTrackModel[5].rotateAngleZ = 2.44346095F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 133, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[6].setRotationPoint(-80F, -10F, -35F);

		rightTrackModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[7].setRotationPoint(-80F, -5F, -35F);
		rightTrackModel[7].rotateAngleZ = 0.6981317F;

		rightTrackModel[8].addShapeBox(0F, 0F, 0F, 9, 1, 8, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightTrackModel[8].setRotationPoint(60.4F, -8F, -35F);
		rightTrackModel[8].rotateAngleZ = 3.00196631F;

		rightTrackModel[9].addShapeBox(0F, 0F, -8F, 102, 1, 8, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 12
		rightTrackModel[9].setRotationPoint(-62F, 12F, 35F);

		rightTrackModel[10].addShapeBox(2F, 0F, -8F, 30, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackModel[10].setRotationPoint(64.7F, -3F, 35F);
		rightTrackModel[10].rotateAngleZ = -2.61799388F;

		rightTrackModel[11].addShapeBox(0F, 0F, -8F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 14
		rightTrackModel[11].setRotationPoint(-80.1F, -5F, 35F);

		rightTrackModel[12].addShapeBox(1F, 0F, 7F, 24, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[12].setRotationPoint(-80.5F, 0.6F, 20F);
		rightTrackModel[12].rotateAngleZ = -0.4712389F;

		rightTrackModel[13].addShapeBox(0F, 0F, -8F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		rightTrackModel[13].setRotationPoint(62F, -7F, 35F);

		rightTrackModel[14].addShapeBox(0F, 0F, -8F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		rightTrackModel[14].setRotationPoint(62.4F, -6.2F, 35F);
		rightTrackModel[14].rotateAngleZ = 2.44346095F;

		rightTrackModel[15].addShapeBox(0F, 0F, -8F, 133, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightTrackModel[15].setRotationPoint(-80F, -10F, 35F);

		rightTrackModel[16].addShapeBox(0F, 0F, -8F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightTrackModel[16].setRotationPoint(-80F, -5F, 35F);
		rightTrackModel[16].rotateAngleZ = 0.6981317F;

		rightTrackModel[17].addShapeBox(0F, 0F, -8F, 9, 1, 8, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightTrackModel[17].setRotationPoint(60.4F, -8F, 35F);
		rightTrackModel[17].rotateAngleZ = 3.00196631F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[0];

		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}