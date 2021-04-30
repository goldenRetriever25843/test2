//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LeCuck
// Model Creator: 
// Created on: 08.09.2016 - 19:28:21
// Last changed on: 08.09.2016 - 19:28:21

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAMXleclerc extends ModelVehicle //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelAMXleclerc() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[74];
		turretModel = new ModelRendererTurbo[58];
		barrelModel = new ModelRendererTurbo[20];
		leftTrackWheelModels = new ModelRendererTurbo[44];
		rightTrackWheelModels = new ModelRendererTurbo[44];
		leftTrackModel = new ModelRendererTurbo[12];
		rightTrackModel = new ModelRendererTurbo[18];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 12
		bodyModel[2] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 1089, 1, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 1505, 1, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 12
		bodyModel[14] = new ModelRendererTurbo(this, 1065, 73, textureX, textureY); // Box 12
		bodyModel[15] = new ModelRendererTurbo(this, 1561, 9, textureX, textureY); // Box 12
		bodyModel[16] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 12
		bodyModel[17] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 12
		bodyModel[18] = new ModelRendererTurbo(this, 1401, 105, textureX, textureY); // Box 12
		bodyModel[19] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 12
		bodyModel[20] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 12
		bodyModel[21] = new ModelRendererTurbo(this, 1417, 113, textureX, textureY); // Box 12
		bodyModel[22] = new ModelRendererTurbo(this, 1665, 89, textureX, textureY); // Box 12
		bodyModel[23] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 12
		bodyModel[24] = new ModelRendererTurbo(this, 1977, 97, textureX, textureY); // Box 12
		bodyModel[25] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 12
		bodyModel[26] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 12
		bodyModel[27] = new ModelRendererTurbo(this, 929, 169, textureX, textureY); // Box 12
		bodyModel[28] = new ModelRendererTurbo(this, 1201, 169, textureX, textureY); // Box 12
		bodyModel[29] = new ModelRendererTurbo(this, 1321, 169, textureX, textureY); // Box 12
		bodyModel[30] = new ModelRendererTurbo(this, 1441, 169, textureX, textureY); // Box 12
		bodyModel[31] = new ModelRendererTurbo(this, 1561, 169, textureX, textureY); // Box 12
		bodyModel[32] = new ModelRendererTurbo(this, 1681, 169, textureX, textureY); // Box 12
		bodyModel[33] = new ModelRendererTurbo(this, 1801, 169, textureX, textureY); // Box 12
		bodyModel[34] = new ModelRendererTurbo(this, 1921, 169, textureX, textureY); // Box 12
		bodyModel[35] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 12
		bodyModel[36] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 3
		bodyModel[37] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 4
		bodyModel[38] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 5
		bodyModel[39] = new ModelRendererTurbo(this, 1089, 177, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 1137, 177, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 9
		bodyModel[43] = new ModelRendererTurbo(this, 1873, 65, textureX, textureY); // Box 10
		bodyModel[44] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 11
		bodyModel[45] = new ModelRendererTurbo(this, 889, 177, textureX, textureY); // Box 12
		bodyModel[46] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Box 13
		bodyModel[47] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 14
		bodyModel[48] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 15
		bodyModel[49] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 16
		bodyModel[50] = new ModelRendererTurbo(this, 793, 185, textureX, textureY); // Box 17
		bodyModel[51] = new ModelRendererTurbo(this, 945, 185, textureX, textureY); // Box 18
		bodyModel[52] = new ModelRendererTurbo(this, 993, 185, textureX, textureY); // Box 19
		bodyModel[53] = new ModelRendererTurbo(this, 1169, 185, textureX, textureY); // Box 20
		bodyModel[54] = new ModelRendererTurbo(this, 1905, 49, textureX, textureY); // Box 21
		bodyModel[55] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 22
		bodyModel[56] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 23
		bodyModel[57] = new ModelRendererTurbo(this, 1217, 185, textureX, textureY); // Box 24
		bodyModel[58] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 25
		bodyModel[59] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 26
		bodyModel[60] = new ModelRendererTurbo(this, 2017, 153, textureX, textureY); // Box 27
		bodyModel[61] = new ModelRendererTurbo(this, 1689, 113, textureX, textureY); // Box 28
		bodyModel[62] = new ModelRendererTurbo(this, 1289, 121, textureX, textureY); // Box 29
		bodyModel[63] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 30
		bodyModel[64] = new ModelRendererTurbo(this, 1193, 185, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 1057, 177, textureX, textureY); // Box 1
		bodyModel[66] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 1
		bodyModel[68] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 2
		bodyModel[69] = new ModelRendererTurbo(this, 1121, 9, textureX, textureY); // Box 3
		bodyModel[70] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		bodyModel[71] = new ModelRendererTurbo(this, 1937, 9, textureX, textureY); // Box 5
		bodyModel[72] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 6
		bodyModel[73] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 7

		bodyModel[0].addShapeBox(-78F, -12F, -21F, 153, 8, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F); // Box 12
		bodyModel[0].setRotationPoint(-7F, 0F, 0F);

		bodyModel[1].addShapeBox(-74F, -4F, -21F, 142, 5, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -3F, 0F, 0F); // Box 12
		bodyModel[1].setRotationPoint(-7F, 0F, 0F);

		bodyModel[2].addShapeBox(-78F, -18F, -21F, 153, 6, 42, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[2].setRotationPoint(-7F, 0F, 0F);

		bodyModel[3].addShapeBox(-78F, -25F, -38F, 130, 7, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[3].setRotationPoint(-7F, 0F, 0F);

		bodyModel[4].addShapeBox(52F, -25F, -38F, 29, 7, 76, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[4].setRotationPoint(-7F, 0F, 0F);

		bodyModel[5].addShapeBox(-78F, -28F, -38F, 34, 3, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[5].setRotationPoint(-7F, 0F, 0F);

		bodyModel[6].addShapeBox(-78F, -19F, -39F, 19, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 12
		bodyModel[6].setRotationPoint(-7F, 0F, 0F);

		bodyModel[7].addShapeBox(-59F, -19F, -39F, 93, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[7].setRotationPoint(-7F, 0F, 0F);

		bodyModel[8].addShapeBox(-59F, -19F, 38F, 93, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[8].setRotationPoint(-7F, 0F, 0F);

		bodyModel[9].addShapeBox(-78F, -19F, 38F, 19, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 12
		bodyModel[9].setRotationPoint(-7F, 0F, 0F);

		bodyModel[10].addShapeBox(34F, -25F, 39F, 18, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-7F, 0F, 0F);

		bodyModel[11].addShapeBox(52F, -25F, 39F, 28, 18, 1, 0F,0F, 0F, 0F, 0F, -5.8F, 0F, -2F, -6.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-7F, 0F, 0F);

		bodyModel[12].addShapeBox(73F, -18F, 37F, 8, 6, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-7F, 0F, 0F);

		bodyModel[13].addShapeBox(73F, -18F, 21F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 12
		bodyModel[13].setRotationPoint(-7F, 0F, 0F);

		bodyModel[14].addShapeBox(80F, -18F, 21F, 1, 6, 17, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 12
		bodyModel[14].setRotationPoint(-7F, 0F, 0F);

		bodyModel[15].addShapeBox(73F, -18F, -38F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 12
		bodyModel[15].setRotationPoint(-7F, 0F, 0F);

		bodyModel[16].addShapeBox(80F, -18F, -38F, 1, 6, 17, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 12
		bodyModel[16].setRotationPoint(-7F, 0F, 0F);

		bodyModel[17].addShapeBox(73F, -18F, -22F, 8, 6, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[17].setRotationPoint(-7F, 0F, 0F);

		bodyModel[18].addShapeBox(-59F, -7F, 38.5F, 131, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[18].setRotationPoint(-7F, 0F, 0F);

		bodyModel[19].addShapeBox(34F, -25F, 38F, 18, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[19].setRotationPoint(-7F, 0F, 0F);

		bodyModel[20].addShapeBox(52F, -25F, 38F, 28, 18, 1, 0F,0F, 0F, 0F, 0F, -5.8F, 0F, 0F, -5.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[20].setRotationPoint(-7F, 0F, 0F);

		bodyModel[21].addShapeBox(-59F, -7F, -38.5F, 131, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[21].setRotationPoint(-7F, 0F, 0F);

		bodyModel[22].addShapeBox(34F, -25F, -40F, 18, 18, 1, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[22].setRotationPoint(-7F, 0F, 0F);

		bodyModel[23].addShapeBox(52F, -25F, -40F, 28, 18, 1, 0F,0F, -1F, 0F, -2F, -6.8F, 0F, 0F, -5.8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[23].setRotationPoint(-7F, 0F, 0F);

		bodyModel[24].addShapeBox(52F, -25F, -39F, 28, 18, 1, 0F,0F, 0F, 0F, 0F, -5.8F, 0F, 0F, -5.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[24].setRotationPoint(-7F, 0F, 0F);

		bodyModel[25].addShapeBox(34F, -25F, -39F, 18, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[25].setRotationPoint(-7F, 0F, 0F);

		bodyModel[26].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[26].setRotationPoint(0F, -27F, 0F);

		bodyModel[27].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[27].setRotationPoint(0F, -27F, 0F);
		bodyModel[27].rotateAngleY = 0.31415927F;

		bodyModel[28].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[28].setRotationPoint(0F, -27F, 0F);
		bodyModel[28].rotateAngleY = -0.31415927F;

		bodyModel[29].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[29].setRotationPoint(0F, -27F, 0F);
		bodyModel[29].rotateAngleY = -0.9424778F;

		bodyModel[30].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[30].setRotationPoint(0F, -27F, 0F);
		bodyModel[30].rotateAngleY = -1.25663706F;

		bodyModel[31].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[31].setRotationPoint(0F, -27F, 0F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[32].setRotationPoint(0F, -27F, 0F);
		bodyModel[32].rotateAngleY = -1.88495559F;

		bodyModel[33].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[33].setRotationPoint(0F, -27F, 0F);
		bodyModel[33].rotateAngleY = -2.19911486F;

		bodyModel[34].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[34].setRotationPoint(0F, -27F, 0F);
		bodyModel[34].rotateAngleY = -2.51327412F;

		bodyModel[35].addShapeBox(-25F, -2F, -4F, 50, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[35].setRotationPoint(0F, -27F, 0F);
		bodyModel[35].rotateAngleY = -0.62831853F;

		bodyModel[36].addShapeBox(-76.5F, -22F, -38F, 2, 7, 65, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[36].setRotationPoint(-9F, 1F, 1F);

		bodyModel[37].addShapeBox(-80F, -25F, 29F, 4, 7, 7, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 4
		bodyModel[37].setRotationPoint(-9F, 0F, 0F);

		bodyModel[38].addShapeBox(-82F, -27F, 29F, 4, 7, 7, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, 0F, 0F); // Box 5
		bodyModel[38].setRotationPoint(-9F, 0F, 0F);

		bodyModel[39].addShapeBox(-3.5F, -6F, 8F, 10, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-95F, -23F, 0F);

		bodyModel[40].addShapeBox(-3.5F, -8F, 8F, 10, 2, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(-95F, -23F, 0F);

		bodyModel[41].addShapeBox(-3.5F, 0F, 8F, 10, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(-95F, -23F, 0F);

		bodyModel[42].addShapeBox(-3.5F, 0F, 3F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 9
		bodyModel[42].setRotationPoint(-95F, -23F, 0F);

		bodyModel[43].addShapeBox(-3.5F, -6F, 3F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[43].setRotationPoint(-95F, -23F, 0F);

		bodyModel[44].addShapeBox(-3.5F, -8F, 3F, 10, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[44].setRotationPoint(-95F, -23F, 0F);

		bodyModel[45].addShapeBox(-3F, -6F, 7F, 9, 6, 16, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		bodyModel[45].setRotationPoint(-95F, -23F, 0F);

		bodyModel[46].addShapeBox(-3F, -7.5F, 7F, 9, 2, 16, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[46].setRotationPoint(-95F, -23F, 0F);

		bodyModel[47].addShapeBox(-3F, -0.5F, 7F, 9, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 14
		bodyModel[47].setRotationPoint(-95F, -23F, 0F);

		bodyModel[48].addShapeBox(-3F, -0.5F, -19F, 9, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 15
		bodyModel[48].setRotationPoint(-95F, -23F, 0F);

		bodyModel[49].addShapeBox(-3F, -6F, -19F, 9, 6, 16, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		bodyModel[49].setRotationPoint(-95F, -23F, 0F);

		bodyModel[50].addShapeBox(-3F, -7.5F, -19F, 9, 2, 16, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[50].setRotationPoint(-95F, -23F, 0F);

		bodyModel[51].addShapeBox(-3.5F, -6F, -18F, 10, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[51].setRotationPoint(-95F, -23F, 0F);

		bodyModel[52].addShapeBox(-3.5F, -8F, -18F, 10, 2, 10, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[52].setRotationPoint(-95F, -23F, 0F);

		bodyModel[53].addShapeBox(-3.5F, 0F, -18F, 10, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 20
		bodyModel[53].setRotationPoint(-95F, -23F, 0F);

		bodyModel[54].addShapeBox(-3.5F, 0F, -23F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 21
		bodyModel[54].setRotationPoint(-95F, -23F, 0F);

		bodyModel[55].addShapeBox(-3.5F, -6F, -23F, 10, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[55].setRotationPoint(-95F, -23F, 0F);

		bodyModel[56].addShapeBox(-3.5F, -8F, -23F, 10, 2, 4, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[56].setRotationPoint(-95F, -23F, 0F);

		bodyModel[57].addShapeBox(-76.5F, -28F, -39.5F, 14, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[57].setRotationPoint(-9F, 1F, 1F);

		bodyModel[58].addShapeBox(-76.5F, -19F, 27F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[58].setRotationPoint(-9F, 1F, 1F);

		bodyModel[59].addShapeBox(-76.5F, -28F, 35.5F, 14, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[59].setRotationPoint(-9F, 1F, 1F);

		bodyModel[60].addShapeBox(75F, -22.5F, 24F, 3, 3, 12, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 27
		bodyModel[60].setRotationPoint(-7F, 0F, 0F);

		bodyModel[61].addShapeBox(78F, -22.5F, 24F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[61].setRotationPoint(-7F, 0F, 0F);

		bodyModel[62].addShapeBox(78F, -22.5F, -36F, 1, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[62].setRotationPoint(-7F, 0F, 0F);

		bodyModel[63].addShapeBox(75F, -22.5F, -36F, 3, 3, 12, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 30
		bodyModel[63].setRotationPoint(-7F, 0F, 0F);

		bodyModel[64].addShapeBox(-44F, -27F, -38F, 20, 2, 76, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-7F, 0F, 0F);

		bodyModel[65].addShapeBox(-44F, -28F, -38F, 1, 1, 76, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[65].setRotationPoint(-7F, 0F, 0F);

		bodyModel[66].addShapeBox(-1F, -5F, -18F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[66].setRotationPoint(-88F, -23F, 0F);

		bodyModel[67].addShapeBox(2F, -5F, -18F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[67].setRotationPoint(-88F, -23F, 0F);

		bodyModel[68].addShapeBox(2F, -5F, -11F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[68].setRotationPoint(-88F, -23F, 0F);

		bodyModel[69].addShapeBox(-1F, -5F, -11F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[69].setRotationPoint(-88F, -23F, 0F);

		bodyModel[70].addShapeBox(-1F, -5F, 8F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[70].setRotationPoint(-88F, -23F, 0F);

		bodyModel[71].addShapeBox(2F, -5F, 8F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[71].setRotationPoint(-88F, -23F, 0F);

		bodyModel[72].addShapeBox(-1F, -5F, 15F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[72].setRotationPoint(-88F, -23F, 0F);

		bodyModel[73].addShapeBox(2F, -5F, 15F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[73].setRotationPoint(-88F, -23F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 12
		turretModel[1] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 12
		turretModel[2] = new ModelRendererTurbo(this, 649, 57, textureX, textureY); // Box 12
		turretModel[3] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 12
		turretModel[4] = new ModelRendererTurbo(this, 1873, 9, textureX, textureY); // Box 12
		turretModel[5] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Box 12
		turretModel[6] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Box 12
		turretModel[7] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 12
		turretModel[8] = new ModelRendererTurbo(this, 801, 57, textureX, textureY); // Box 12
		turretModel[9] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 12
		turretModel[10] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 12
		turretModel[11] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 12
		turretModel[12] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 12
		turretModel[13] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 12
		turretModel[14] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 12
		turretModel[15] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Box 12
		turretModel[16] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 12
		turretModel[17] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 12
		turretModel[18] = new ModelRendererTurbo(this, 1121, 1, textureX, textureY); // Box 12
		turretModel[19] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 12
		turretModel[20] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 12
		turretModel[21] = new ModelRendererTurbo(this, 1641, 81, textureX, textureY); // Box 12
		turretModel[22] = new ModelRendererTurbo(this, 1041, 89, textureX, textureY); // Box 12
		turretModel[23] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Box 12
		turretModel[24] = new ModelRendererTurbo(this, 1753, 1, textureX, textureY); // Box 12
		turretModel[25] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 12
		turretModel[26] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 12
		turretModel[27] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 12
		turretModel[28] = new ModelRendererTurbo(this, 1977, 1, textureX, textureY); // Box 12
		turretModel[29] = new ModelRendererTurbo(this, 1433, 1, textureX, textureY); // Box 12
		turretModel[30] = new ModelRendererTurbo(this, 1521, 1, textureX, textureY); // Box 12
		turretModel[31] = new ModelRendererTurbo(this, 1561, 1, textureX, textureY); // Box 12
		turretModel[32] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 12
		turretModel[33] = new ModelRendererTurbo(this, 1673, 1, textureX, textureY); // Box 12
		turretModel[34] = new ModelRendererTurbo(this, 1921, 1, textureX, textureY); // Box 12
		turretModel[35] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 12
		turretModel[36] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 12
		turretModel[37] = new ModelRendererTurbo(this, 1977, 17, textureX, textureY); // Box 12
		turretModel[38] = new ModelRendererTurbo(this, 1905, 17, textureX, textureY); // Box 12
		turretModel[39] = new ModelRendererTurbo(this, 1433, 25, textureX, textureY); // Box 12
		turretModel[40] = new ModelRendererTurbo(this, 1641, 25, textureX, textureY); // Box 12
		turretModel[41] = new ModelRendererTurbo(this, 1521, 33, textureX, textureY); // Box 12
		turretModel[42] = new ModelRendererTurbo(this, 1153, 1, textureX, textureY); // Box 12
		turretModel[43] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 12
		turretModel[44] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 12
		turretModel[45] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 12
		turretModel[46] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 12
		turretModel[47] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 12
		turretModel[48] = new ModelRendererTurbo(this, 1489, 137, textureX, textureY); // Box 12
		turretModel[49] = new ModelRendererTurbo(this, 1537, 137, textureX, textureY); // Box 12
		turretModel[50] = new ModelRendererTurbo(this, 1881, 129, textureX, textureY); // Box 12
		turretModel[51] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 12
		turretModel[52] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 12
		turretModel[53] = new ModelRendererTurbo(this, 1969, 1, textureX, textureY); // Box 12
		turretModel[54] = new ModelRendererTurbo(this, 1641, 1, textureX, textureY); // Box 12
		turretModel[55] = new ModelRendererTurbo(this, 1753, 1, textureX, textureY); // Box 12
		turretModel[56] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 12
		turretModel[57] = new ModelRendererTurbo(this, 1393, 185, textureX, textureY); // Box 2

		turretModel[0].addShapeBox(-45F, 8F, -38F, 28, 6, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[0].setRotationPoint(0F, -42F, 0F);

		turretModel[1].addShapeBox(-17F, 8F, -38F, 37, 8, 76, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[1].setRotationPoint(0F, -42F, 0F);

		turretModel[2].addShapeBox(-17F, 1F, -38F, 37, 10, 76, 0F,0F, 0F, -5F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 12
		turretModel[2].setRotationPoint(0F, -42F, 0F);

		turretModel[3].addShapeBox(-45F, -1F, -38F, 17, 9, 76, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[3].setRotationPoint(0F, -42F, 0F);

		turretModel[4].addShapeBox(-28F, -1F, -38F, 11, 9, 76, 0F,0F, 0F, -6F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[4].setRotationPoint(0F, -42F, 0F);

		turretModel[5].addShapeBox(-28F, -1F, -31F, 11, 8, 62, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 12
		turretModel[5].setRotationPoint(0F, -42F, 0F);

		turretModel[6].addShapeBox(-17F, -1F, -27F, 4, 8, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 0F, 0F, 0F); // Box 12
		turretModel[6].setRotationPoint(0F, -42F, 0F);

		turretModel[7].addShapeBox(-13F, -1F, -27F, 8, 8, 52, 0F,0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 0F, -2F, 0F, -2F); // Box 12
		turretModel[7].setRotationPoint(0F, -42F, 0F);

		turretModel[8].addShapeBox(-5F, -1F, -27F, 10, 8, 52, 0F,0F, 0F, 4F, 0F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -6F, 0F, 0F, 2F, 0F, 0F); // Box 12
		turretModel[8].setRotationPoint(0F, -42F, 0F);

		turretModel[9].addShapeBox(-1F, -1F, -27F, 8, 8, 52, 0F,-6F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 12
		turretModel[9].setRotationPoint(0F, -42F, 0F);

		turretModel[10].addShapeBox(6F, -1F, 9F, 8, 8, 13, 0F,0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, -6F, 0F, 0F, 0F); // Box 12
		turretModel[10].setRotationPoint(0F, -42F, 0F);

		turretModel[11].addShapeBox(20F, 11F, -38F, 22, 5, 30, 0F,0F, 0F, 0F, 0F, -2F, -17F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[11].setRotationPoint(0F, -42F, 0F);

		turretModel[12].addShapeBox(20F, 5F, -38F, 22, 7, 30, 0F,0F, 0F, -4F, -5F, -2F, -17F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, -17F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 12
		turretModel[12].setRotationPoint(0F, -42F, 0F);

		turretModel[13].addShapeBox(20F, 11F, 8F, 6, 5, 30, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F); // Box 12
		turretModel[13].setRotationPoint(0F, -42F, 0F);

		turretModel[14].addShapeBox(20F, 5F, 8F, 6, 8, 30, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -9F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F, 0F, -2F, 0F); // Box 12
		turretModel[14].setRotationPoint(0F, -42F, 0F);

		turretModel[15].addShapeBox(26F, 13F, 15F, 10, 3, 20, 0F,0F, 0.5F, 0F, -1F, -1F, -1F, -1F, -1F, -11F, 0F, 0.5F, -1F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -11F, 1F, 0F, 0F); // Box 12
		turretModel[15].setRotationPoint(0F, -42F, 0F);

		turretModel[16].addShapeBox(26F, 6F, 15F, 9, 9, 20, 0F,0F, 0F, 0F, -2F, -1.5F, 0F, -3.5F, -1.5F, -11F, 0F, 0F, -6F, 0F, -2.5F, 0F, 0F, -1F, -1F, 0F, -1F, -11F, 0F, -2.5F, -1F); // Box 12
		turretModel[16].setRotationPoint(0F, -42F, 0F);

		turretModel[17].addShapeBox(26F, 6F, 12F, 9, 9, 3, 0F,0F, 0F, 0F, -5F, -0.75F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, 0F, -1F, 1F, 0F, -2F, 0F); // Box 12
		turretModel[17].setRotationPoint(0F, -42F, 0F);

		turretModel[18].addShapeBox(26F, 13F, 12F, 10, 3, 3, 0F,0F, 0F, 0F, -6F, -2F, 0F, -1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F); // Box 12
		turretModel[18].setRotationPoint(0F, -42F, 0F);

		turretModel[19].addShapeBox(26F, 6F, 8F, 4, 10, 4, 0F,0F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[19].setRotationPoint(0F, -42F, 0F);

		turretModel[20].addShapeBox(-51F, 8F, -38F, 6, 6, 76, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 12
		turretModel[20].setRotationPoint(0F, -42F, 0F);

		turretModel[21].addShapeBox(-51F, -1F, -38F, 6, 9, 76, 0F,0F, 0F, -8F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 12
		turretModel[21].setRotationPoint(0F, -42F, 0F);

		turretModel[22].addShapeBox(-50F, -1F, -38F, 5, 9, 76, 0F,-0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, 0F, -6F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 12
		turretModel[22].setRotationPoint(0F, -42F, 0F);

		turretModel[23].addShapeBox(-12F, -3F, 9F, 5, 2, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 12
		turretModel[23].setRotationPoint(0F, -42F, 0F);

		turretModel[24].addShapeBox(-2F, -3F, 9F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 12
		turretModel[24].setRotationPoint(0F, -42F, 0F);

		turretModel[25].addShapeBox(-7F, -3F, 9F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[25].setRotationPoint(0F, -42F, 0F);

		turretModel[26].addShapeBox(7F, -3F, 8F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[26].setRotationPoint(0F, -44F, 0F);

		turretModel[27].addShapeBox(10F, -3F, 8F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 12
		turretModel[27].setRotationPoint(0F, -44F, 0F);

		turretModel[28].addShapeBox(4F, -3F, 8F, 3, 4, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 12
		turretModel[28].setRotationPoint(0F, -44F, 0F);

		turretModel[29].addShapeBox(7.5F, -1F, 9.5F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[29].setRotationPoint(0F, -49F, 0F);

		turretModel[30].addShapeBox(5.5F, -1F, 9.5F, 2, 3, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 12
		turretModel[30].setRotationPoint(0F, -49F, 0F);

		turretModel[31].addShapeBox(9.5F, -2F, 9.5F, 2, 1, 6, 0F,0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 12
		turretModel[31].setRotationPoint(0F, -49F, 0F);

		turretModel[32].addShapeBox(9.5F, -1F, 14.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		turretModel[32].setRotationPoint(0F, -49F, 0F);

		turretModel[33].addShapeBox(5.5F, -2F, 9.5F, 2, 1, 6, 0F,-1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 12
		turretModel[33].setRotationPoint(0F, -49F, 0F);

		turretModel[34].addShapeBox(7.5F, -2F, 9.5F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[34].setRotationPoint(0F, -49F, 0F);

		turretModel[35].addShapeBox(9.5F, -1F, 9.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[35].setRotationPoint(0F, -49F, 0F);

		turretModel[36].addShapeBox(9.5F, -9F, 10.5F, 1, 5, 4, 0F,0F, -1F, 0.75F, 0.75F, -1F, -1F, 0.75F, -1F, -1F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0.75F, -1F, -1F, 0.75F, -1F, -1F, 0F, -1F, 0.75F); // Box 12
		turretModel[36].setRotationPoint(0F, -42F, 0F);

		turretModel[37].addShapeBox(6F, 0F, -8F, 14, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[37].setRotationPoint(0F, -42F, 0F);

		turretModel[38].addShapeBox(20F, 0F, -8F, 4, 15, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[38].setRotationPoint(0F, -42F, 0F);

		turretModel[39].addShapeBox(24F, 2F, -8F, 2, 13, 16, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[39].setRotationPoint(0F, -42F, 0F);

		turretModel[40].addShapeBox(6F, -3F, -19F, 13, 9, 11, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[40].setRotationPoint(0F, -42F, 0F);

		turretModel[41].addShapeBox(19F, -3F, -19F, 14, 9, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[41].setRotationPoint(0F, -42F, 0F);

		turretModel[42].addShapeBox(33F, -3F, -19F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[42].setRotationPoint(0F, -42F, 0F);

		turretModel[43].addShapeBox(33F, -3F, -9F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[43].setRotationPoint(0F, -42F, 0F);

		turretModel[44].addShapeBox(-13F, -3F, -27F, 5, 2, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 12
		turretModel[44].setRotationPoint(0F, -42F, 0F);

		turretModel[45].addShapeBox(-8F, -3F, -27F, 8, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[45].setRotationPoint(0F, -42F, 0F);

		turretModel[46].addShapeBox(0F, -3F, -27F, 5, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 12
		turretModel[46].setRotationPoint(0F, -42F, 0F);

		turretModel[47].addShapeBox(33F, 6F, -19F, 9, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[47].setRotationPoint(0F, -42F, 0F);

		turretModel[48].addShapeBox(-58F, -1F, 9F, 7, 14, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		turretModel[48].setRotationPoint(0F, -42F, 0F);

		turretModel[49].addShapeBox(-64F, -1F, 9F, 6, 13, 15, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 12
		turretModel[49].setRotationPoint(0F, -42F, 0F);

		turretModel[50].addShapeBox(-56.5F, -0.5F, -27F, 5, 3, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[50].setRotationPoint(0F, -42F, 0F);

		turretModel[51].addShapeBox(-56.5F, -1.5F, -27F, 5, 1, 34, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[51].setRotationPoint(0F, -42F, 0F);

		turretModel[52].addShapeBox(-56.5F, 2.5F, -27F, 5, 1, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		turretModel[52].setRotationPoint(0F, -42F, 0F);

		turretModel[53].addShapeBox(-52.5F, -1.5F, -5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[53].setRotationPoint(0F, -42F, 0F);

		turretModel[54].addShapeBox(-51.75F, -10.5F, -3.5F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[54].setRotationPoint(0F, -42F, 0F);

		turretModel[55].addShapeBox(-51.75F, -10.5F, -4.5F, 3, 9, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		turretModel[55].setRotationPoint(0F, -42F, 0F);

		turretModel[56].addShapeBox(-51.75F, -10.5F, -2.5F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		turretModel[56].setRotationPoint(0F, -42F, 0F);

		turretModel[57].addShapeBox(-29F, 14F, -38F, 12, 2, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 2
		turretModel[57].setRotationPoint(0F, -42F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1121, 9, textureX, textureY); // Box 12
		barrelModel[1] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 12
		barrelModel[2] = new ModelRendererTurbo(this, 1705, 41, textureX, textureY); // Box 12
		barrelModel[3] = new ModelRendererTurbo(this, 1641, 65, textureX, textureY); // Box 12
		barrelModel[4] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 12
		barrelModel[5] = new ModelRendererTurbo(this, 1737, 113, textureX, textureY); // Box 12
		barrelModel[6] = new ModelRendererTurbo(this, 1129, 121, textureX, textureY); // Box 12
		barrelModel[7] = new ModelRendererTurbo(this, 1305, 121, textureX, textureY); // Box 12
		barrelModel[8] = new ModelRendererTurbo(this, 1673, 9, textureX, textureY); // Box 12
		barrelModel[9] = new ModelRendererTurbo(this, 2025, 9, textureX, textureY); // Box 12
		barrelModel[10] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 12
		barrelModel[11] = new ModelRendererTurbo(this, 1705, 17, textureX, textureY); // Box 12
		barrelModel[12] = new ModelRendererTurbo(this, 2025, 17, textureX, textureY); // Box 12
		barrelModel[13] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 12
		barrelModel[14] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 12
		barrelModel[15] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 12
		barrelModel[16] = new ModelRendererTurbo(this, 1721, 1, textureX, textureY); // Box 47
		barrelModel[17] = new ModelRendererTurbo(this, 1041, 177, textureX, textureY); // Box 0
		barrelModel[18] = new ModelRendererTurbo(this, 1065, 97, textureX, textureY); // Box 1
		barrelModel[19] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 2

		barrelModel[0].addShapeBox(7F, -7F, -8F, 4, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[0].setRotationPoint(19F, -35F, 0F);

		barrelModel[1].addShapeBox(1F, -7F, -8F, 6, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F); // Box 12
		barrelModel[1].setRotationPoint(19F, -35F, 0F);

		barrelModel[2].addShapeBox(11F, 0.5F, -6F, 26, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[2].setRotationPoint(19F, -35F, 0F);

		barrelModel[3].addShapeBox(11F, -1.5F, -6F, 26, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[3].setRotationPoint(19F, -35F, 0F);

		barrelModel[4].addShapeBox(11F, 3.5F, -6F, 26, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 12
		barrelModel[4].setRotationPoint(19F, -35F, 0F);

		barrelModel[5].addShapeBox(37F, 1F, -5.5F, 79, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[5].setRotationPoint(19F, -35F, 0F);

		barrelModel[6].addShapeBox(37F, -1F, -5.5F, 79, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[6].setRotationPoint(19F, -35F, 0F);

		barrelModel[7].addShapeBox(37F, 3F, -5.5F, 79, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 12
		barrelModel[7].setRotationPoint(19F, -35F, 0F);

		barrelModel[8].addShapeBox(116F, 1F, -5F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[8].setRotationPoint(19F, -35F, 0F);

		barrelModel[9].addShapeBox(116F, 1F, -1F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[9].setRotationPoint(19F, -35F, 0F);

		barrelModel[10].addShapeBox(116F, -0.5F, -3.5F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[10].setRotationPoint(19F, -35F, 0F);

		barrelModel[11].addShapeBox(116F, 3.5F, -3.5F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[11].setRotationPoint(19F, -35F, 0F);

		barrelModel[12].addShapeBox(116F, -1F, -2F, 9, 2, 2, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[12].setRotationPoint(19F, -35F, 0F);

		barrelModel[13].addShapeBox(116F, 3F, -2F, 9, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 12
		barrelModel[13].setRotationPoint(19F, -35F, 0F);

		barrelModel[14].addShapeBox(116F, 3F, -5F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 12
		barrelModel[14].setRotationPoint(19F, -35F, 0F);

		barrelModel[15].addShapeBox(116F, -1F, -5F, 9, 2, 2, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		barrelModel[15].setRotationPoint(19F, -35F, 0F);

		barrelModel[16].addShapeBox(116F, -2.5F, -3F, 5, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		barrelModel[16].setRotationPoint(19F, -35F, 0F);

		barrelModel[17].addShapeBox(11F, -4.5F, -6F, 16, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		barrelModel[17].setRotationPoint(19F, -35F, 0F);

		barrelModel[18].addShapeBox(11F, -5.5F, -6F, 16, 1, 7, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		barrelModel[18].setRotationPoint(19F, -35F, 0F);

		barrelModel[19].addShapeBox(27F, -4.5F, -3.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		barrelModel[19].setRotationPoint(19F, -35F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 12
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1737, 81, textureX, textureY); // Box 12
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Box 12
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 12
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 12
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 12
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1897, 113, textureX, textureY); // Box 12
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 12
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 12
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 1465, 121, textureX, textureY); // Box 12
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 1521, 121, textureX, textureY); // Box 12
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 1585, 121, textureX, textureY); // Box 12
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 1641, 121, textureX, textureY); // Box 12
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 1937, 121, textureX, textureY); // Box 12
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 12
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 12
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 1737, 129, textureX, textureY); // Box 12
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 1793, 129, textureX, textureY); // Box 12
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 1857, 129, textureX, textureY); // Box 12
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 1985, 129, textureX, textureY); // Box 12
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 1057, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 1129, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 1185, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 1241, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 1305, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 1369, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 1433, 137, textureX, textureY); // Box 12
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 12
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 1073, 121, textureX, textureY); // Box 12
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Box 12
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 1457, 25, textureX, textureY); // Box 12
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 12
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 12
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 12
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 12
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 553, 97, textureX, textureY); // Box 12
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 12
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 1873, 145, textureX, textureY); // Box 12
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Box 12
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 585, 177, textureX, textureY); // Box 12
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Box 12

		leftTrackWheelModels[0].addShapeBox(-8F, -2F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[0].setRotationPoint(39F, 1F, 23F);

		leftTrackWheelModels[1].addShapeBox(-8F, -5F, 0F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[1].setRotationPoint(39F, 1F, 23F);

		leftTrackWheelModels[2].addShapeBox(-6F, -8F, 0F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		leftTrackWheelModels[2].setRotationPoint(39F, 1F, 23F);

		leftTrackWheelModels[3].addShapeBox(-8F, 2F, 0F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		leftTrackWheelModels[3].setRotationPoint(39F, 1F, 23F);

		leftTrackWheelModels[4].addShapeBox(-6F, 5F, 0F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		leftTrackWheelModels[4].setRotationPoint(39F, 1F, 23F);

		leftTrackWheelModels[5].addShapeBox(-8F, 2F, 0F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		leftTrackWheelModels[5].setRotationPoint(19.5F, 1F, 23F);

		leftTrackWheelModels[6].addShapeBox(-6F, 5F, 0F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		leftTrackWheelModels[6].setRotationPoint(19.5F, 1F, 23F);

		leftTrackWheelModels[7].addShapeBox(-8F, -2F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[7].setRotationPoint(19.5F, 1F, 23F);

		leftTrackWheelModels[8].addShapeBox(-8F, -5F, 0F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[8].setRotationPoint(19.5F, 1F, 23F);

		leftTrackWheelModels[9].addShapeBox(-6F, -8F, 0F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		leftTrackWheelModels[9].setRotationPoint(19.5F, 1F, 23F);

		leftTrackWheelModels[10].addShapeBox(-8F, 2F, 0F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		leftTrackWheelModels[10].setRotationPoint(0F, 1F, 23F);

		leftTrackWheelModels[11].addShapeBox(-6F, 5F, 0F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		leftTrackWheelModels[11].setRotationPoint(0F, 1F, 23F);

		leftTrackWheelModels[12].addShapeBox(-8F, -2F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[12].setRotationPoint(0F, 1F, 23F);

		leftTrackWheelModels[13].addShapeBox(-8F, -5F, 0F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[13].setRotationPoint(0F, 1F, 23F);

		leftTrackWheelModels[14].addShapeBox(-6F, -8F, 0F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		leftTrackWheelModels[14].setRotationPoint(0F, 1F, 23F);

		leftTrackWheelModels[15].addShapeBox(-8F, -2F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[15].setRotationPoint(-38.5F, 1F, 23F);

		leftTrackWheelModels[16].addShapeBox(-6F, 5F, 0F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		leftTrackWheelModels[16].setRotationPoint(-38.5F, 1F, 23F);

		leftTrackWheelModels[17].addShapeBox(-8F, 2F, 0F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		leftTrackWheelModels[17].setRotationPoint(-38.5F, 1F, 23F);

		leftTrackWheelModels[18].addShapeBox(-8F, -5F, 0F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[18].setRotationPoint(-38.5F, 1F, 23F);

		leftTrackWheelModels[19].addShapeBox(-6F, -8F, 0F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		leftTrackWheelModels[19].setRotationPoint(-38.5F, 1F, 23F);

		leftTrackWheelModels[20].addShapeBox(-6F, 5F, 0F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		leftTrackWheelModels[20].setRotationPoint(-19F, 1F, 23F);

		leftTrackWheelModels[21].addShapeBox(-8F, 2F, 0F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		leftTrackWheelModels[21].setRotationPoint(-19F, 1F, 23F);

		leftTrackWheelModels[22].addShapeBox(-8F, -2F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[22].setRotationPoint(-19F, 1F, 23F);

		leftTrackWheelModels[23].addShapeBox(-8F, -5F, 0F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[23].setRotationPoint(-19F, 1F, 23F);

		leftTrackWheelModels[24].addShapeBox(-6F, -8F, 0F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		leftTrackWheelModels[24].setRotationPoint(-19F, 1F, 23F);

		leftTrackWheelModels[25].addShapeBox(-6F, -8F, 0F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		leftTrackWheelModels[25].setRotationPoint(-58F, 1F, 23F);

		leftTrackWheelModels[26].addShapeBox(-8F, -5F, 0F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[26].setRotationPoint(-58F, 1F, 23F);

		leftTrackWheelModels[27].addShapeBox(-8F, -2F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[27].setRotationPoint(-58F, 1F, 23F);

		leftTrackWheelModels[28].addShapeBox(-8F, 2F, 0F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		leftTrackWheelModels[28].setRotationPoint(-58F, 1F, 23F);

		leftTrackWheelModels[29].addShapeBox(-6F, 5F, 0F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		leftTrackWheelModels[29].setRotationPoint(-58F, 1F, 23F);

		leftTrackWheelModels[30].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[30].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[31].addShapeBox(-5.5F, -2.5F, 0F, 11, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[31].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[32].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 12
		leftTrackWheelModels[32].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[33].addShapeBox(-2.5F, -6.5F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[33].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[34].addShapeBox(2.5F, -6.5F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[34].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[35].addShapeBox(5.5F, -2.5F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[35].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[36].addShapeBox(2.5F, 5.5F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[36].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[37].addShapeBox(-2.5F, 5.5F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[37].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[38].addShapeBox(-6.5F, 5.5F, 0F, 4, 1, 12, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 12
		leftTrackWheelModels[38].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[39].addShapeBox(-6.5F, -2.5F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[39].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[40].addShapeBox(-6.5F, -6.5F, 0F, 4, 1, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 12
		leftTrackWheelModels[40].setRotationPoint(-74.5F, -6.5F, 23F);

		leftTrackWheelModels[41].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 12
		leftTrackWheelModels[41].setRotationPoint(60.5F, -6.5F, 23F);

		leftTrackWheelModels[42].addShapeBox(-5.5F, -2.5F, 0F, 11, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[42].setRotationPoint(60.5F, -6.5F, 23F);

		leftTrackWheelModels[43].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[43].setRotationPoint(60.5F, -6.5F, 23F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 1585, 137, textureX, textureY); // Box 12
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 1929, 137, textureX, textureY); // Box 12
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 697, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 945, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 1809, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 1977, 145, textureX, textureY); // Box 12
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 12
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 12
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 12
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 1209, 153, textureX, textureY); // Box 12
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 1353, 153, textureX, textureY); // Box 12
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1409, 153, textureX, textureY); // Box 12
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 12
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 1273, 153, textureX, textureY); // Box 12
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 12
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 12
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 12
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 12
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 12
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 12
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 12
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 12
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 12
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 12
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 761, 177, textureX, textureY); // Box 12
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 12

		rightTrackWheelModels[0].addShapeBox(-8F, -2F, -12F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[0].setRotationPoint(39F, 1F, -23F);

		rightTrackWheelModels[1].addShapeBox(-8F, -5F, -12F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[1].setRotationPoint(39F, 1F, -23F);

		rightTrackWheelModels[2].addShapeBox(-6F, -8F, -12F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		rightTrackWheelModels[2].setRotationPoint(39F, 1F, -23F);

		rightTrackWheelModels[3].addShapeBox(-8F, 2F, -12F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		rightTrackWheelModels[3].setRotationPoint(39F, 1F, -23F);

		rightTrackWheelModels[4].addShapeBox(-6F, 5F, -12F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		rightTrackWheelModels[4].setRotationPoint(39F, 1F, -23F);

		rightTrackWheelModels[5].addShapeBox(-8F, 2F, -12F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		rightTrackWheelModels[5].setRotationPoint(19.5F, 1F, -23F);

		rightTrackWheelModels[6].addShapeBox(-6F, 5F, -12F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		rightTrackWheelModels[6].setRotationPoint(19.5F, 1F, -23F);

		rightTrackWheelModels[7].addShapeBox(-8F, -2F, -12F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[7].setRotationPoint(19.5F, 1F, -23F);

		rightTrackWheelModels[8].addShapeBox(-8F, -5F, -12F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[8].setRotationPoint(19.5F, 1F, -23F);

		rightTrackWheelModels[9].addShapeBox(-6F, -8F, -12F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		rightTrackWheelModels[9].setRotationPoint(19.5F, 1F, -23F);

		rightTrackWheelModels[10].addShapeBox(-8F, 2F, -12F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		rightTrackWheelModels[10].setRotationPoint(0F, 1F, -23F);

		rightTrackWheelModels[11].addShapeBox(-6F, 5F, -12F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		rightTrackWheelModels[11].setRotationPoint(0F, 1F, -23F);

		rightTrackWheelModels[12].addShapeBox(-8F, -2F, -12F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[12].setRotationPoint(0F, 1F, -23F);

		rightTrackWheelModels[13].addShapeBox(-8F, -5F, -12F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[13].setRotationPoint(0F, 1F, -23F);

		rightTrackWheelModels[14].addShapeBox(-6F, -8F, -12F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		rightTrackWheelModels[14].setRotationPoint(0F, 1F, -23F);

		rightTrackWheelModels[15].addShapeBox(-8F, -2F, -12F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[15].setRotationPoint(-38.5F, 1F, -23F);

		rightTrackWheelModels[16].addShapeBox(-6F, 5F, -12F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		rightTrackWheelModels[16].setRotationPoint(-38.5F, 1F, -23F);

		rightTrackWheelModels[17].addShapeBox(-8F, 2F, -12F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		rightTrackWheelModels[17].setRotationPoint(-38.5F, 1F, -23F);

		rightTrackWheelModels[18].addShapeBox(-8F, -5F, -12F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[18].setRotationPoint(-38.5F, 1F, -23F);

		rightTrackWheelModels[19].addShapeBox(-6F, -8F, -12F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		rightTrackWheelModels[19].setRotationPoint(-38.5F, 1F, -23F);

		rightTrackWheelModels[20].addShapeBox(-6F, 5F, -12F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		rightTrackWheelModels[20].setRotationPoint(-19F, 1F, -23F);

		rightTrackWheelModels[21].addShapeBox(-8F, 2F, -12F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		rightTrackWheelModels[21].setRotationPoint(-19F, 1F, -23F);

		rightTrackWheelModels[22].addShapeBox(-8F, -2F, -12F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[22].setRotationPoint(-19F, 1F, -23F);

		rightTrackWheelModels[23].addShapeBox(-8F, -5F, -12F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[23].setRotationPoint(-19F, 1F, -23F);

		rightTrackWheelModels[24].addShapeBox(-6F, -8F, -12F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		rightTrackWheelModels[24].setRotationPoint(-19F, 1F, -23F);

		rightTrackWheelModels[25].addShapeBox(-6F, -8F, -12F, 12, 3, 12, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 12
		rightTrackWheelModels[25].setRotationPoint(-58F, 1F, -23F);

		rightTrackWheelModels[26].addShapeBox(-8F, -5F, -12F, 16, 3, 12, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[26].setRotationPoint(-58F, 1F, -23F);

		rightTrackWheelModels[27].addShapeBox(-8F, -2F, -12F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[27].setRotationPoint(-58F, 1F, -23F);

		rightTrackWheelModels[28].addShapeBox(-8F, 2F, -12F, 16, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 12
		rightTrackWheelModels[28].setRotationPoint(-58F, 1F, -23F);

		rightTrackWheelModels[29].addShapeBox(-6F, 5F, -12F, 12, 3, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		rightTrackWheelModels[29].setRotationPoint(-58F, 1F, -23F);

		rightTrackWheelModels[30].addShapeBox(5.5F, -2.5F, -12F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[30].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[31].addShapeBox(2.5F, -6.5F, -12F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[31].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[32].addShapeBox(-2.5F, -6.5F, -12F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[32].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[33].addShapeBox(-6.5F, -6.5F, -12F, 4, 1, 12, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 12
		rightTrackWheelModels[33].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[34].addShapeBox(-6.5F, -2.5F, -12F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[34].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[35].addShapeBox(-6.5F, 5.5F, -12F, 4, 1, 12, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 12
		rightTrackWheelModels[35].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[36].addShapeBox(-2.5F, 5.5F, -12F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[36].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[37].addShapeBox(2.5F, 5.5F, -12F, 4, 1, 12, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[37].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[38].addShapeBox(-5.5F, 2.5F, -10F, 11, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 12
		rightTrackWheelModels[38].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[39].addShapeBox(-5.5F, -2.5F, -10F, 11, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[39].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[40].addShapeBox(-5.5F, -5.5F, -10F, 11, 3, 10, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[40].setRotationPoint(-74.5F, -6.5F, -23F);

		rightTrackWheelModels[41].addShapeBox(-5.5F, 2.5F, -12F, 11, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 12
		rightTrackWheelModels[41].setRotationPoint(60.5F, -6.5F, -23F);

		rightTrackWheelModels[42].addShapeBox(-5.5F, -2.5F, -12F, 11, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[42].setRotationPoint(60.5F, -6.5F, -23F);

		rightTrackWheelModels[43].addShapeBox(-5.5F, -5.5F, -12F, 11, 3, 12, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackWheelModels[43].setRotationPoint(60.5F, -6.5F, -23F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 1129, 89, textureX, textureY); // Box 12
		leftTrackModel[1] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 12
		leftTrackModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		leftTrackModel[3] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 12
		leftTrackModel[4] = new ModelRendererTurbo(this, 1873, 25, textureX, textureY); // Box 12
		leftTrackModel[5] = new ModelRendererTurbo(this, 1369, 89, textureX, textureY); // Box 12
		leftTrackModel[6] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 12
		leftTrackModel[7] = new ModelRendererTurbo(this, 1873, 49, textureX, textureY); // Box 12
		leftTrackModel[8] = new ModelRendererTurbo(this, 1977, 49, textureX, textureY); // Box 12
		leftTrackModel[9] = new ModelRendererTurbo(this, 1457, 41, textureX, textureY); // Box 12
		leftTrackModel[10] = new ModelRendererTurbo(this, 1761, 41, textureX, textureY); // Box 12
		leftTrackModel[11] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 12

		leftTrackModel[0].addShapeBox(-54F, 9F, 22F, 104, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[0].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[1].addShapeBox(50F, 9F, 22F, 20, 1, 14, 0F,0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[1].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[2].addShapeBox(70F, -5F, 22F, 1, 5, 14, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		leftTrackModel[2].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[3].addShapeBox(70F, -13F, 22F, 1, 5, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 12
		leftTrackModel[3].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[4].addShapeBox(73F, -8F, 22F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[4].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[5].addShapeBox(-64F, -17F, 22F, 127, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[5].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[6].addShapeBox(63F, -17F, 22F, 8, 1, 14, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[6].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[7].addShapeBox(-72F, -17F, 22F, 8, 1, 14, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F); // Box 12
		leftTrackModel[7].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[8].addShapeBox(-71F, 9F, 22F, 17, 1, 14, 0F,0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -10F, 0F); // Box 12
		leftTrackModel[8].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[9].addShapeBox(-72F, -5F, 22F, 1, 5, 14, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[9].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[10].addShapeBox(-75F, -8F, 22F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackModel[10].setRotationPoint(-7F, 0F, 0F);

		leftTrackModel[11].addShapeBox(-72F, -13F, 22F, 1, 5, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 12
		leftTrackModel[11].setRotationPoint(-7F, 0F, 0F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 1737, 97, textureX, textureY); // Box 12
		rightTrackModel[1] = new ModelRendererTurbo(this, 1065, 57, textureX, textureY); // Box 12
		rightTrackModel[2] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 12
		rightTrackModel[3] = new ModelRendererTurbo(this, 1905, 57, textureX, textureY); // Box 12
		rightTrackModel[4] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 12
		rightTrackModel[5] = new ModelRendererTurbo(this, 1129, 105, textureX, textureY); // Box 12
		rightTrackModel[6] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 12
		rightTrackModel[7] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 12
		rightTrackModel[8] = new ModelRendererTurbo(this, 1977, 65, textureX, textureY); // Box 12
		rightTrackModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 12
		rightTrackModel[10] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 12
		rightTrackModel[11] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 12
		rightTrackModel[12] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 12
		rightTrackModel[13] = new ModelRendererTurbo(this, 1121, 57, textureX, textureY); // Box 12
		rightTrackModel[14] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 12
		rightTrackModel[15] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 12
		rightTrackModel[16] = new ModelRendererTurbo(this, 1769, 129, textureX, textureY); // Box 12
		rightTrackModel[17] = new ModelRendererTurbo(this, 1161, 137, textureX, textureY); // Box 12

		rightTrackModel[0].addShapeBox(-54F, 9F, -36F, 104, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[0].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[1].addShapeBox(50F, 9F, -36F, 20, 1, 14, 0F,0F, 0F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -10F, 0F, 1F, -10F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[1].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[2].addShapeBox(70F, -5F, -36F, 1, 5, 14, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 12
		rightTrackModel[2].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[3].addShapeBox(70F, -13F, -36F, 1, 5, 14, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 12
		rightTrackModel[3].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[4].addShapeBox(73F, -8F, -36F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[4].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[5].addShapeBox(-64F, -17F, -36F, 127, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[5].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[6].addShapeBox(63F, -17F, -36F, 8, 1, 14, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[6].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[7].addShapeBox(-72F, -17F, -36F, 8, 1, 14, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F); // Box 12
		rightTrackModel[7].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[8].addShapeBox(-71F, 9F, -36F, 17, 1, 14, 0F,0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 1F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -10F, 0F); // Box 12
		rightTrackModel[8].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[9].addShapeBox(-72F, -5F, -36F, 1, 5, 14, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[9].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[10].addShapeBox(-75F, -8F, -36F, 1, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[10].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[11].addShapeBox(-72F, -13F, -36F, 1, 5, 14, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 12
		rightTrackModel[11].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[12].addShapeBox(-80F, -12F, -38F, 1, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[12].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[13].addShapeBox(-80F, -13F, -38F, 1, 1, 17, 0F,-2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[13].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[14].addShapeBox(-80F, -12F, 21F, 1, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[14].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[15].addShapeBox(-80F, -13F, 21F, 1, 1, 17, 0F,-2F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[15].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[16].addShapeBox(-78F, -18F, -38F, 1, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[16].setRotationPoint(-7F, 0F, 0F);

		rightTrackModel[17].addShapeBox(-78F, -18F, 21F, 1, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightTrackModel[17].setRotationPoint(-7F, 0F, 0F);
	}
}