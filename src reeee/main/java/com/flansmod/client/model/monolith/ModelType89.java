//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
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

public class ModelType89 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelType89() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[71];
		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel = new ModelRendererTurbo[2];
		turretModel = new ModelRendererTurbo[27];
		barrelModel = new ModelRendererTurbo[10];
		leftTrackWheelModels = new ModelRendererTurbo[99];
		rightTrackWheelModels = new ModelRendererTurbo[99];
		leftTrackModel = new ModelRendererTurbo[12];
		rightTrackModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 13
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 13
		bodyModel[5] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 13
		bodyModel[15] = new ModelRendererTurbo(this, 761, 33, textureX, textureY); // Box 13
		bodyModel[16] = new ModelRendererTurbo(this, 785, 33, textureX, textureY); // Box 13
		bodyModel[17] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 13
		bodyModel[18] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 13
		bodyModel[19] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 13
		bodyModel[20] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 13
		bodyModel[21] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 13
		bodyModel[22] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 13
		bodyModel[23] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 13
		bodyModel[24] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 13
		bodyModel[25] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 13
		bodyModel[26] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 13
		bodyModel[27] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 13
		bodyModel[28] = new ModelRendererTurbo(this, 617, 129, textureX, textureY); // Box 13
		bodyModel[29] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 13
		bodyModel[30] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 13
		bodyModel[31] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 13
		bodyModel[32] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Box 13
		bodyModel[33] = new ModelRendererTurbo(this, 977, 273, textureX, textureY); // Box 13
		bodyModel[34] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 13
		bodyModel[35] = new ModelRendererTurbo(this, 241, 281, textureX, textureY); // Box 13
		bodyModel[36] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 13
		bodyModel[37] = new ModelRendererTurbo(this, 1001, 273, textureX, textureY); // Box 13
		bodyModel[38] = new ModelRendererTurbo(this, 273, 281, textureX, textureY); // Box 13
		bodyModel[39] = new ModelRendererTurbo(this, 929, 273, textureX, textureY); // Box 13
		bodyModel[40] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 13
		bodyModel[41] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Box 13
		bodyModel[42] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Box 13
		bodyModel[43] = new ModelRendererTurbo(this, 745, 281, textureX, textureY); // Box 13
		bodyModel[44] = new ModelRendererTurbo(this, 785, 281, textureX, textureY); // Box 13
		bodyModel[45] = new ModelRendererTurbo(this, 425, 289, textureX, textureY); // Box 13
		bodyModel[46] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 13
		bodyModel[47] = new ModelRendererTurbo(this, 809, 281, textureX, textureY); // Box 13
		bodyModel[48] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 13
		bodyModel[49] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 13
		bodyModel[50] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 13
		bodyModel[51] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 13
		bodyModel[52] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 13
		bodyModel[53] = new ModelRendererTurbo(this, 857, 281, textureX, textureY); // Box 13
		bodyModel[54] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 13
		bodyModel[55] = new ModelRendererTurbo(this, 657, 185, textureX, textureY); // Box 13
		bodyModel[56] = new ModelRendererTurbo(this, 689, 289, textureX, textureY); // Box 13
		bodyModel[57] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Box 13
		bodyModel[58] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Box 13
		bodyModel[59] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 13
		bodyModel[60] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 13
		bodyModel[61] = new ModelRendererTurbo(this, 553, 328, textureX, textureY); // Box 13
		bodyModel[62] = new ModelRendererTurbo(this, 671, 311, textureX, textureY); // Box 13
		bodyModel[63] = new ModelRendererTurbo(this, 491, 309, textureX, textureY); // Box 13
		bodyModel[64] = new ModelRendererTurbo(this, 553, 328, textureX, textureY); // Box 328
		bodyModel[65] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 329
		bodyModel[66] = new ModelRendererTurbo(this, 881, 281, textureX, textureY); // Box 330
		bodyModel[67] = new ModelRendererTurbo(this, 273, 289, textureX, textureY); // Box 331
		bodyModel[68] = new ModelRendererTurbo(this, 961, 289, textureX, textureY); // Box 332
		bodyModel[69] = new ModelRendererTurbo(this, 993, 289, textureX, textureY); // Box 333
		bodyModel[70] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 334

		bodyModel[0].addShapeBox(0F, 0F, 0F, 134, 4, 46, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[0].setRotationPoint(-61F, 0F, -23F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 124, 6, 12, 0F,1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 13
		bodyModel[1].setRotationPoint(-65F, -22F, -35F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 6, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[2].setRotationPoint(59F, -22F, -35F);

		bodyModel[3].addShapeBox(0F, 0F, -4F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[3].setRotationPoint(93F, -21F, 29F);
		bodyModel[3].rotateAngleZ = -0.45378561F;

		bodyModel[4].addShapeBox(0F, 0F, -2F, 156, 8, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[4].setRotationPoint(-65F, -16F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 130, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[5].setRotationPoint(-62F, -18F, -36F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 6, 70, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[6].setRotationPoint(75F, -22F, -35F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(53.5F, 3F, 22F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(34.5F, 3F, 22F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(15.5F, 3F, 22F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(-4.5F, 3F, 22F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-23.5F, 3F, 22F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-42.5F, 3F, 22F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-58.5F, -7F, 26F);

		bodyModel[14].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 13
		bodyModel[14].setRotationPoint(-58.5F, -7F, -26F);

		bodyModel[15].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[15].setRotationPoint(-42.5F, 3F, -22F);

		bodyModel[16].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[16].setRotationPoint(-23.5F, 3F, -22F);

		bodyModel[17].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[17].setRotationPoint(-4.5F, 3F, -22F);

		bodyModel[18].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[18].setRotationPoint(15.5F, 3F, -22F);

		bodyModel[19].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[19].setRotationPoint(34.5F, 3F, -22F);

		bodyModel[20].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[20].setRotationPoint(53.5F, 3F, -22F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 20, 10, 70, 0F,0F, 0F, -6F, 2F, -5F, -4F, 2F, -5F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[21].setRotationPoint(59F, -32F, -35F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 15, 5, 70, 0F,-2F, 0F, -4F, 0F, -5F, -6F, 0F, -5F, -6F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F); // Box 13
		bodyModel[22].setRotationPoint(79F, -27F, -35F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 124, 10, 12, 0F,3.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 3.5F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F); // Box 13
		bodyModel[23].setRotationPoint(-65F, -32F, -35F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 124, 10, 12, 0F,3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 3.5F, 0F, -6F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F); // Box 13
		bodyModel[24].setRotationPoint(-65F, -32F, 23F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 124, 6, 12, 0F,1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F); // Box 13
		bodyModel[25].setRotationPoint(-65F, -22F, 23F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 124, 3, 46, 0F,3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 13
		bodyModel[26].setRotationPoint(-65F, -32F, -23F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 156, 8, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F); // Box 13
		bodyModel[27].setRotationPoint(-65F, -16F, 21F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 150, 8, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[28].setRotationPoint(-65F, -8F, -23F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 150, 8, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -2F, 0F, 0F); // Box 13
		bodyModel[29].setRotationPoint(-65F, -8F, 21F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 32, 4, 62, 0F,0F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 13
		bodyModel[30].setRotationPoint(-65F, -36F, -31F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 30, 8, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[31].setRotationPoint(55F, -8F, -21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 30, 8, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[32].setRotationPoint(61F, -16F, -21F);

		bodyModel[33].addShapeBox(0F, 0F, -4F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[33].setRotationPoint(93F, -21F, -29F);
		bodyModel[33].rotateAngleZ = -0.45378561F;

		bodyModel[34].addShapeBox(4F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[34].setRotationPoint(64F, -18F, -36F);

		bodyModel[35].addShapeBox(4F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[35].setRotationPoint(68F, -18F, -36F);

		bodyModel[36].addShapeBox(4F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 13
		bodyModel[36].setRotationPoint(80F, -22F, -36F);

		bodyModel[37].addShapeBox(4F, 0F, 0F, 8, 12, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		bodyModel[37].setRotationPoint(-74F, -18F, -36F);

		bodyModel[38].addShapeBox(4F, 0F, 0F, 8, 11, 12, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -4F, 0F); // Box 13
		bodyModel[38].setRotationPoint(-74F, -18F, -35F);

		bodyModel[39].addShapeBox(4F, 0F, 0F, 5, 11, 12, 0F,0F, -4F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F); // Box 13
		bodyModel[39].setRotationPoint(-74F, -15F, -35F);

		bodyModel[40].addShapeBox(4F, 0F, 0F, 8, 10, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		bodyModel[40].setRotationPoint(-74F, -17F, -24F);

		bodyModel[41].addShapeBox(4F, 0F, 0F, 8, 10, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		bodyModel[41].setRotationPoint(-74F, -17F, 23F);

		bodyModel[42].addShapeBox(4F, 0F, 0F, 8, 11, 12, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -4F, 0F); // Box 13
		bodyModel[42].setRotationPoint(-74F, -18F, 23F);

		bodyModel[43].addShapeBox(4F, 0F, 0F, 5, 11, 12, 0F,0F, -4F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F); // Box 13
		bodyModel[43].setRotationPoint(-74F, -15F, 23F);

		bodyModel[44].addShapeBox(4F, 0F, 0F, 8, 12, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		bodyModel[44].setRotationPoint(-74F, -18F, 35F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 130, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[45].setRotationPoint(-62F, -18F, 35F);

		bodyModel[46].addShapeBox(4F, 0F, 0F, 4, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[46].setRotationPoint(64F, -18F, 35F);

		bodyModel[47].addShapeBox(4F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[47].setRotationPoint(68F, -18F, 35F);

		bodyModel[48].addShapeBox(4F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 13
		bodyModel[48].setRotationPoint(80F, -22F, 35F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[49].setRotationPoint(90F, -16F, 23F);
		bodyModel[49].rotateAngleZ = 0.52359878F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[50].setRotationPoint(91.4F, -13.7F, 23F);
		bodyModel[50].rotateAngleZ = 0.17453293F;

		bodyModel[51].addShapeBox(0F, 0F, -12F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[51].setRotationPoint(91.4F, -13.7F, -23F);
		bodyModel[51].rotateAngleZ = 0.17453293F;

		bodyModel[52].addShapeBox(0F, 0F, -12F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[52].setRotationPoint(90F, -16F, -23F);
		bodyModel[52].rotateAngleZ = 0.52359878F;

		bodyModel[53].addShapeBox(-6F, -2F, 0F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[53].setRotationPoint(77F, -6F, -24F);

		bodyModel[54].addShapeBox(-6F, 2F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 13
		bodyModel[54].setRotationPoint(77F, -4F, -24F);

		bodyModel[55].addShapeBox(-6F, -6F, 0F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[55].setRotationPoint(77F, -6F, -24F);

		bodyModel[56].addShapeBox(-6F, -2F, 0F, 14, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[56].setRotationPoint(77F, -6F, 21F);

		bodyModel[57].addShapeBox(-6F, 2F, 0F, 14, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 13
		bodyModel[57].setRotationPoint(77F, -4F, 21F);

		bodyModel[58].addShapeBox(-6F, -6F, 0F, 14, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[58].setRotationPoint(77F, -6F, 21F);

		bodyModel[59].addShapeBox(0F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[59].setRotationPoint(76F, -8F, -22F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[60].setRotationPoint(76F, -8F, 22F);

		bodyModel[61].addShapeBox(-7F, 0F, -2F, 66, 20, 2, 0F,0F, -7F, 0F, -20F, -7F, 0F, -20F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -20F, -7F, 0F, -20F, -7F, 0F, 0F, -7F, 0F); // Box 13
		bodyModel[61].setRotationPoint(-53F, -17.5F, 7F);

		bodyModel[62].addShapeBox(-7F, 0F, -2F, 66, 2, 10, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[62].setRotationPoint(-53F, -3.5F, 9F);

		bodyModel[63].addShapeBox(-7F, 0F, -3F, 66, 2, 10, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[63].setRotationPoint(-53F, -3.5F, -14F);

		bodyModel[64].addShapeBox(-7F, 0F, -14F, 66, 20, 2, 0F,0F, -7F, 0F, -20F, -7F, 0F, -20F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -20F, -7F, 0F, -20F, -7F, 0F, 0F, -7F, 0F); // Box 328
		bodyModel[64].setRotationPoint(-53F, -17.5F, 7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 329
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addBox(0F, 0F, 0F, 6, 30, 12, 0F); // Box 330
		bodyModel[66].setRotationPoint(-8F, -29F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 30, 48, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 331
		bodyModel[67].setRotationPoint(-2F, -29F, -24.8F);

		bodyModel[68].addBox(0F, 0F, 0F, 6, 30, 8, 0F); // Box 332
		bodyModel[68].setRotationPoint(-6F, -29F, -16F);

		bodyModel[69].addBox(0F, 0F, 0F, 6, 30, 8, 0F); // Box 333
		bodyModel[69].setRotationPoint(-6F, -29F, 8F);

		bodyModel[70].addBox(0F, 0F, 0F, 44, 6, 12, 0F); // Box 334
		bodyModel[70].setRotationPoint(-60F, -4F, -6F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 326
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 327

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, -11F, 2, 13, 46, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 16F, -11F, 0F, 16F, -11F, 0F, 16F, -11F, 0F, 16F, -11F); // Box 326
		bodyDoorOpenModel[0].setRotationPoint(-68F, -29F, -23F);
		bodyDoorOpenModel[0].rotateAngleX = -0.17453293F;
		bodyDoorOpenModel[0].rotateAngleY = 1.57079633F;

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, -11F, 2, 13, 46, 0F,0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 16F, -11F, 0F, 16F, -11F, 0F, 16F, -11F, 0F, 16F, -11F); // Box 327
		bodyDoorOpenModel[1].setRotationPoint(-68F, -29F, 21F);
		bodyDoorOpenModel[1].rotateAngleX = -0.17453293F;
		bodyDoorOpenModel[1].rotateAngleY = 1.57079633F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 13
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Box 13

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 2, 13, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[0].setRotationPoint(-68F, -29F, -23F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.17453293F;

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 2, 16, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyDoorCloseModel[1].setRotationPoint(-65.8F, -16.2F, -21F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.17453293F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 937, 33, textureX, textureY); // Box 13
		turretModel[1] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 13
		turretModel[2] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Box 13
		turretModel[3] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 13
		turretModel[4] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 13
		turretModel[5] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 13
		turretModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 13
		turretModel[7] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 13
		turretModel[8] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 13
		turretModel[9] = new ModelRendererTurbo(this, 993, 33, textureX, textureY); // Box 13
		turretModel[10] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 13
		turretModel[11] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 13
		turretModel[12] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Box 13
		turretModel[13] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 13
		turretModel[14] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 13
		turretModel[15] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 13
		turretModel[16] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 13
		turretModel[17] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 13
		turretModel[18] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 13
		turretModel[19] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 13
		turretModel[20] = new ModelRendererTurbo(this, 73, 281, textureX, textureY); // Box 13
		turretModel[21] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 13
		turretModel[22] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 13
		turretModel[23] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Box 13
		turretModel[24] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 13
		turretModel[25] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 13
		turretModel[26] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 13

		turretModel[0].addShapeBox(12F, 0F, 12F, 14, 15, 12, 0F,0F, 0F, 0F, -4F, -5F, 0F, -4F, -5F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, -12F, 0F, 0F, 0F); // Box 13
		turretModel[0].setRotationPoint(0F, -48F, 0F);

		turretModel[1].addShapeBox(-10F, 0F, -24F, 22, 15, 48, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[1].setRotationPoint(0F, -48F, 0F);

		turretModel[2].addShapeBox(-26F, 0F, -24F, 16, 13, 48, 0F,0F, 2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 1F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, -2F); // Box 13
		turretModel[2].setRotationPoint(0F, -48F, 0F);

		turretModel[3].addBox(0F, -1F, 2F, 6, 2, 14, 0F); // Box 13
		turretModel[3].setRotationPoint(0F, -51F, 0F);

		turretModel[4].addShapeBox(-4F, -1F, 2F, 4, 2, 14, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 13
		turretModel[4].setRotationPoint(0F, -51F, 0F);

		turretModel[5].addShapeBox(6F, -1F, 2F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 13
		turretModel[5].setRotationPoint(0F, -51F, 0F);

		turretModel[6].addShapeBox(-4F, 4F, 25F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 13
		turretModel[6].setRotationPoint(0F, -48F, 0F);

		turretModel[7].addShapeBox(-14F, -3F, 25F, 28, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[7].setRotationPoint(0F, -48F, 0F);

		turretModel[8].addShapeBox(-25F, -42F, -14.5F, 1, 30, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 13
		turretModel[8].setRotationPoint(0F, -48F, 0F);
		turretModel[8].rotateAngleZ = 0.52359878F;

		turretModel[9].addShapeBox(-25F, -42F, 15.5F, 1, 30, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 13
		turretModel[9].setRotationPoint(0F, -48F, 0F);
		turretModel[9].rotateAngleZ = 0.52359878F;

		turretModel[10].addShapeBox(-11F, 0F, -19.5F, 21, 5, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[10].setRotationPoint(0F, -37F, 0F);

		turretModel[11].addShapeBox(10F, 0F, -19.5F, 6, 5, 40, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 13
		turretModel[11].setRotationPoint(0F, -37F, 0F);

		turretModel[12].addShapeBox(16F, 0F, -15.5F, 4, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 13
		turretModel[12].setRotationPoint(0F, -37F, 0F);

		turretModel[13].addShapeBox(-17F, 0F, -19.5F, 6, 5, 40, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 13
		turretModel[13].setRotationPoint(0F, -37F, 0F);

		turretModel[14].addShapeBox(-21F, 0F, -15.5F, 4, 5, 32, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 13
		turretModel[14].setRotationPoint(0F, -37F, 0F);

		turretModel[15].addShapeBox(-18F, -3.5F, 24.5F, 4, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[15].setRotationPoint(0F, -48F, 0F);

		turretModel[16].addShapeBox(12F, 0F, -24F, 14, 15, 12, 0F,0F, 0F, 0F, -4F, -5F, -12F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -12F, -2F, -1F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[16].setRotationPoint(0F, -48F, 0F);

		turretModel[17].addShapeBox(15F, -8F, -12F, 7, 15, 24, 0F,0F, -1.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 2F, 0F); // Box 13
		turretModel[17].setRotationPoint(0F, -40F, 0F);

		turretModel[18].addShapeBox(12F, 0F, -12F, 7, 15, 24, 0F,0F, 0F, 0F, -4F, -1.5F, 0F, -4F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[18].setRotationPoint(0F, -48F, 0F);

		turretModel[19].addShapeBox(-30F, 0F, -22F, 4, 12, 44, 0F,6F, 2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 6F, 2F, -2F, 6F, -1F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 6F, -1F, -2F); // Box 13
		turretModel[19].setRotationPoint(0F, -48F, 0F);

		turretModel[20].addShapeBox(14F, -3.5F, 24.5F, 4, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[20].setRotationPoint(0F, -48F, 0F);

		turretModel[21].addShapeBox(-4F, 8F, 25F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 13
		turretModel[21].setRotationPoint(0F, -48F, 0F);

		turretModel[22].addShapeBox(-4F, 4F, -27F, 12, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[22].setRotationPoint(0F, -48F, 0F);

		turretModel[23].addShapeBox(-18F, -3.5F, -32.5F, 4, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[23].setRotationPoint(0F, -48F, 0F);

		turretModel[24].addShapeBox(-14F, -3F, -32F, 28, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[24].setRotationPoint(0F, -48F, 0F);

		turretModel[25].addShapeBox(-4F, 8F, -26F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 13
		turretModel[25].setRotationPoint(0F, -48F, 0F);

		turretModel[26].addShapeBox(14F, -3.5F, -32.5F, 4, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		turretModel[26].setRotationPoint(0F, -48F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 13
		barrelModel[1] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 13
		barrelModel[2] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 13
		barrelModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
		barrelModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 13
		barrelModel[5] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 13
		barrelModel[6] = new ModelRendererTurbo(this, 33, 281, textureX, textureY); // Box 13
		barrelModel[7] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 13
		barrelModel[8] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 13
		barrelModel[9] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 13

		barrelModel[0].addShapeBox(10F, 0.5F, -1.5F, 33, 1, 2, 0F,0F, 0F, -0.4F, 22F, -0.5F, -0.7F, 22F, -0.5F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 22F, 0F, -0.5F, 22F, 0F, -0.5F, 0F, 0F, 0F); // Box 13
		barrelModel[0].setRotationPoint(20F, -39F, 0F);

		barrelModel[1].addShapeBox(10F, 1.5F, -1.5F, 33, 1, 2, 0F,0F, 0F, 0F, 22F, 0F, -0.5F, 22F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.4F, 22F, -0.5F, -0.7F, 22F, -0.5F, -0.7F, 0F, 0F, -0.4F); // Box 13
		barrelModel[1].setRotationPoint(20F, -39F, 0F);

		barrelModel[2].addShapeBox(64F, 1F, -1.5F, 5, 1, 2, 0F,0F, 0F, 0F, 4F, 0F, 0.5F, 4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0.5F, 4F, 0F, 0.5F, 0F, 0F, 0F); // Box 13
		barrelModel[2].setRotationPoint(20F, -39F, 0F);

		barrelModel[3].addShapeBox(64F, 0F, -1.5F, 5, 1, 2, 0F,0F, -0.5F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0.5F, 4F, 0F, 0.5F, 0F, 0F, 0F); // Box 13
		barrelModel[3].setRotationPoint(20F, -39F, 0F);

		barrelModel[4].addShapeBox(64F, 2F, -1.5F, 5, 1, 2, 0F,0F, 0F, 0F, 4F, 0F, 0.5F, 4F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 13
		barrelModel[4].setRotationPoint(20F, -39F, 0F);

		barrelModel[5].addShapeBox(2F, -2F, -3.5F, 6, 7, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[5].setRotationPoint(20F, -39F, 0F);

		barrelModel[6].addShapeBox(2F, -2F, -11.5F, 8, 6, 8, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 2F, 0F); // Box 13
		barrelModel[6].setRotationPoint(20F, -40F, 0F);

		barrelModel[7].addShapeBox(10F, -0.5F, -2.5F, 8, 1, 4, 0F,8F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 8F, 0.5F, -1F, 8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, 0F); // Box 13
		barrelModel[7].setRotationPoint(20F, -39F, 0F);

		barrelModel[8].addShapeBox(10F, 0.5F, -2.5F, 8, 2, 4, 0F,8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, 0F); // Box 13
		barrelModel[8].setRotationPoint(20F, -39F, 0F);

		barrelModel[9].addShapeBox(10F, 1.5F, -2.5F, 8, 1, 4, 0F,8F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 8F, 0F, 0F, 8F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 8F, 0.5F, -1F); // Box 13
		barrelModel[9].setRotationPoint(20F, -38F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY); // Box 13
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 673, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 13
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 13
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 937, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 13
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 13
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 13
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 13
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 13
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 13
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Box 13
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 13
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Box 13
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 913, 97, textureX, textureY); // Box 13
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 13
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 13
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 13
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 537, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 625, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 13
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 13
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 977, 113, textureX, textureY); // Box 13
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 13
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 13
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 937, 121, textureX, textureY); // Box 13
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Box 13
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 13
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 13
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 657, 145, textureX, textureY); // Box 13
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Box 13
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 793, 145, textureX, textureY); // Box 13
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 881, 145, textureX, textureY); // Box 13
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 545, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 705, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 13
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 809, 153, textureX, textureY); // Box 13
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 929, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box 13
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 13
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 13
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 13
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 913, 185, textureX, textureY); // Box 13
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 13
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 81, 249, textureX, textureY); // Box 13
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 129, 249, textureX, textureY); // Box 13
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 13
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 753, 265, textureX, textureY); // Box 13
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 13
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 793, 265, textureX, textureY); // Box 13
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 985, 257, textureX, textureY); // Box 13
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 13
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 13
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 833, 265, textureX, textureY); // Box 13
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 865, 265, textureX, textureY); // Box 13
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 953, 265, textureX, textureY); // Box 13
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 897, 265, textureX, textureY); // Box 13
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 13

		leftTrackWheelModels[0].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[0].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[1].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[1].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[2].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[2].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[3].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		leftTrackWheelModels[3].setRotationPoint(55.5F, 4.5F, 25F);

		leftTrackWheelModels[4].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[4].setRotationPoint(55.5F, 4.5F, 25F);

		leftTrackWheelModels[5].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[5].setRotationPoint(55.5F, 4.5F, 25F);

		leftTrackWheelModels[6].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[6].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[7].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[7].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[8].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[8].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[9].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		leftTrackWheelModels[9].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[10].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[10].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[11].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		leftTrackWheelModels[11].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[12].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[12].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[13].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[13].setRotationPoint(55.5F, 4.5F, 27F);

		leftTrackWheelModels[14].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[14].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[15].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[15].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[16].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[16].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[17].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		leftTrackWheelModels[17].setRotationPoint(36.5F, 4.5F, 25F);

		leftTrackWheelModels[18].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[18].setRotationPoint(36.5F, 4.5F, 25F);

		leftTrackWheelModels[19].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[19].setRotationPoint(36.5F, 4.5F, 25F);

		leftTrackWheelModels[20].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[20].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[21].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[21].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[22].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[22].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[23].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		leftTrackWheelModels[23].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[24].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[24].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[25].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		leftTrackWheelModels[25].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[26].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[26].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[27].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[27].setRotationPoint(36.5F, 4.5F, 27F);

		leftTrackWheelModels[28].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[28].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[29].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[29].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[30].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[30].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[31].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		leftTrackWheelModels[31].setRotationPoint(17.5F, 4.5F, 25F);

		leftTrackWheelModels[32].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[32].setRotationPoint(17.5F, 4.5F, 25F);

		leftTrackWheelModels[33].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[33].setRotationPoint(17.5F, 4.5F, 25F);

		leftTrackWheelModels[34].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[34].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[35].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[35].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[36].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[36].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[37].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		leftTrackWheelModels[37].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[38].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[38].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[39].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		leftTrackWheelModels[39].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[40].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[40].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[41].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[41].setRotationPoint(17.5F, 4.5F, 27F);

		leftTrackWheelModels[42].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[42].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[43].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[43].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[44].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[44].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[45].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		leftTrackWheelModels[45].setRotationPoint(-40.5F, 4.5F, 25F);

		leftTrackWheelModels[46].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[46].setRotationPoint(-40.5F, 4.5F, 25F);

		leftTrackWheelModels[47].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[47].setRotationPoint(-40.5F, 4.5F, 25F);

		leftTrackWheelModels[48].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[48].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[49].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[49].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[50].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[50].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[51].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		leftTrackWheelModels[51].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[52].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[52].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[53].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		leftTrackWheelModels[53].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[54].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[54].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[55].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[55].setRotationPoint(-40.5F, 4.5F, 27F);

		leftTrackWheelModels[56].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[56].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[57].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[57].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[58].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[58].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[59].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		leftTrackWheelModels[59].setRotationPoint(-21.5F, 4.5F, 25F);

		leftTrackWheelModels[60].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[60].setRotationPoint(-21.5F, 4.5F, 25F);

		leftTrackWheelModels[61].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[61].setRotationPoint(-21.5F, 4.5F, 25F);

		leftTrackWheelModels[62].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[62].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[63].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[63].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[64].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[64].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[65].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		leftTrackWheelModels[65].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[66].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[66].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[67].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		leftTrackWheelModels[67].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[68].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[68].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[69].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[69].setRotationPoint(-21.5F, 4.5F, 27F);

		leftTrackWheelModels[70].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[70].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[71].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[71].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[72].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[72].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[73].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		leftTrackWheelModels[73].setRotationPoint(-2.5F, 4.5F, 25F);

		leftTrackWheelModels[74].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[74].setRotationPoint(-2.5F, 4.5F, 25F);

		leftTrackWheelModels[75].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[75].setRotationPoint(-2.5F, 4.5F, 25F);

		leftTrackWheelModels[76].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[76].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[77].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[77].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[78].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[78].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[79].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		leftTrackWheelModels[79].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[80].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[80].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[81].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		leftTrackWheelModels[81].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[82].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[82].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[83].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[83].setRotationPoint(-2.5F, 4.5F, 27F);

		leftTrackWheelModels[84].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 13
		leftTrackWheelModels[84].setRotationPoint(78F, -6F, 26F);

		leftTrackWheelModels[85].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[85].setRotationPoint(78F, -6F, 26F);

		leftTrackWheelModels[86].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[86].setRotationPoint(78F, -6F, 26F);

		leftTrackWheelModels[87].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[87].setRotationPoint(-56.5F, -5F, 25F);

		leftTrackWheelModels[88].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[88].setRotationPoint(-56.5F, -5F, 27F);

		leftTrackWheelModels[89].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[89].setRotationPoint(-56.5F, -5F, 27F);

		leftTrackWheelModels[90].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		leftTrackWheelModels[90].setRotationPoint(-56.5F, -5F, 27F);

		leftTrackWheelModels[91].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[91].setRotationPoint(-56.5F, -5F, 26F);

		leftTrackWheelModels[92].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		leftTrackWheelModels[92].setRotationPoint(-56.5F, -5F, 26F);

		leftTrackWheelModels[93].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[93].setRotationPoint(-56.5F, -5F, 26F);

		leftTrackWheelModels[94].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		leftTrackWheelModels[94].setRotationPoint(-56.5F, -5F, 26F);

		leftTrackWheelModels[95].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[95].setRotationPoint(-56.5F, -5F, 26F);

		leftTrackWheelModels[96].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[96].setRotationPoint(-56.5F, -5F, 26F);

		leftTrackWheelModels[97].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[97].setRotationPoint(-56.5F, -5F, 26F);

		leftTrackWheelModels[98].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		leftTrackWheelModels[98].setRotationPoint(-56.5F, -5F, 26F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 13
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 529, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 897, 193, textureX, textureY); // Box 13
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 13
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 913, 201, textureX, textureY); // Box 13
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 993, 201, textureX, textureY); // Box 13
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 13
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 13
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 553, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 641, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 673, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 753, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 793, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 937, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 961, 209, textureX, textureY); // Box 13
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 13
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 13
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 809, 217, textureX, textureY); // Box 13
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 13
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 913, 217, textureX, textureY); // Box 13
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 977, 217, textureX, textureY); // Box 13
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 353, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 521, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 545, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 577, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 609, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 641, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 665, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 729, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 13
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 761, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 937, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 897, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 1001, 225, textureX, textureY); // Box 13
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 13
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 13
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Box 13
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 13
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 13
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 969, 233, textureX, textureY); // Box 13
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 345, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 473, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 513, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 553, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 273, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 593, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 617, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 641, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 665, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 697, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 729, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 761, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 937, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 985, 241, textureX, textureY); // Box 13
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 13
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 713, 257, textureX, textureY); // Box 13
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 913, 257, textureX, textureY); // Box 13
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 13
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 433, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 473, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 513, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 553, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 585, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 617, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 641, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 673, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 705, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 737, 273, textureX, textureY); // Box 13
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 913, 273, textureX, textureY); // Box 13

		rightTrackWheelModels[0].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[0].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[1].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[1].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[2].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[2].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[3].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		rightTrackWheelModels[3].setRotationPoint(55.5F, 4.5F, -35F);

		rightTrackWheelModels[4].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[4].setRotationPoint(55.5F, 4.5F, -35F);

		rightTrackWheelModels[5].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[5].setRotationPoint(55.5F, 4.5F, -35F);

		rightTrackWheelModels[6].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[6].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[7].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[7].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[8].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[8].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[9].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		rightTrackWheelModels[9].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[10].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[10].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[11].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		rightTrackWheelModels[11].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[12].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[12].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[13].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[13].setRotationPoint(55.5F, 4.5F, -33F);

		rightTrackWheelModels[14].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[14].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[15].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[15].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[16].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[16].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[17].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		rightTrackWheelModels[17].setRotationPoint(36.5F, 4.5F, -35F);

		rightTrackWheelModels[18].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[18].setRotationPoint(36.5F, 4.5F, -35F);

		rightTrackWheelModels[19].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[19].setRotationPoint(36.5F, 4.5F, -35F);

		rightTrackWheelModels[20].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[20].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[21].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[21].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[22].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[22].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[23].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		rightTrackWheelModels[23].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[24].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[24].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[25].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		rightTrackWheelModels[25].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[26].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[26].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[27].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[27].setRotationPoint(36.5F, 4.5F, -33F);

		rightTrackWheelModels[28].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[28].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[29].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[29].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[30].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[30].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[31].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		rightTrackWheelModels[31].setRotationPoint(17.5F, 4.5F, -35F);

		rightTrackWheelModels[32].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[32].setRotationPoint(17.5F, 4.5F, -35F);

		rightTrackWheelModels[33].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[33].setRotationPoint(17.5F, 4.5F, -35F);

		rightTrackWheelModels[34].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[34].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[35].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[35].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[36].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[36].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[37].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		rightTrackWheelModels[37].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[38].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[38].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[39].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		rightTrackWheelModels[39].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[40].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[40].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[41].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[41].setRotationPoint(17.5F, 4.5F, -33F);

		rightTrackWheelModels[42].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[42].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[43].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[43].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[44].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[44].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[45].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		rightTrackWheelModels[45].setRotationPoint(-40.5F, 4.5F, -35F);

		rightTrackWheelModels[46].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[46].setRotationPoint(-40.5F, 4.5F, -35F);

		rightTrackWheelModels[47].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[47].setRotationPoint(-40.5F, 4.5F, -35F);

		rightTrackWheelModels[48].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[48].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[49].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[49].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[50].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[50].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[51].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		rightTrackWheelModels[51].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[52].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[52].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[53].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		rightTrackWheelModels[53].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[54].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[54].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[55].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[55].setRotationPoint(-40.5F, 4.5F, -33F);

		rightTrackWheelModels[56].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[56].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[57].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[57].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[58].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[58].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[59].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		rightTrackWheelModels[59].setRotationPoint(-21.5F, 4.5F, -35F);

		rightTrackWheelModels[60].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[60].setRotationPoint(-21.5F, 4.5F, -35F);

		rightTrackWheelModels[61].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[61].setRotationPoint(-21.5F, 4.5F, -35F);

		rightTrackWheelModels[62].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[62].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[63].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[63].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[64].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[64].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[65].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		rightTrackWheelModels[65].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[66].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[66].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[67].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		rightTrackWheelModels[67].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[68].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[68].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[69].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[69].setRotationPoint(-21.5F, 4.5F, -33F);

		rightTrackWheelModels[70].addShapeBox(-6.5F, -3.5F, 0F, 13, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[70].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[71].addShapeBox(-6.5F, -6.5F, 0F, 13, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[71].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[72].addShapeBox(-6.5F, 3.5F, 0F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[72].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[73].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		rightTrackWheelModels[73].setRotationPoint(-2.5F, 4.5F, -35F);

		rightTrackWheelModels[74].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[74].setRotationPoint(-2.5F, 4.5F, -35F);

		rightTrackWheelModels[75].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[75].setRotationPoint(-2.5F, 4.5F, -35F);

		rightTrackWheelModels[76].addShapeBox(6.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[76].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[77].addShapeBox(3.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[77].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[78].addShapeBox(-3.5F, -7.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[78].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[79].addShapeBox(-7.5F, -7.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		rightTrackWheelModels[79].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[80].addShapeBox(-7.5F, -3.5F, -1F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[80].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[81].addShapeBox(-7.5F, 6.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		rightTrackWheelModels[81].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[82].addShapeBox(-3.5F, 6.5F, -1F, 7, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[82].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[83].addShapeBox(3.5F, 6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[83].setRotationPoint(-2.5F, 4.5F, -33F);

		rightTrackWheelModels[84].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[84].setRotationPoint(78F, -6F, -34F);

		rightTrackWheelModels[85].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 13
		rightTrackWheelModels[85].setRotationPoint(78F, -6F, -34F);

		rightTrackWheelModels[86].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[86].setRotationPoint(78F, -6F, -34F);

		rightTrackWheelModels[87].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[87].setRotationPoint(-56.5F, -5F, -35F);

		rightTrackWheelModels[88].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[88].setRotationPoint(-56.5F, -5F, -33F);

		rightTrackWheelModels[89].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[89].setRotationPoint(-56.5F, -5F, -33F);

		rightTrackWheelModels[90].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightTrackWheelModels[90].setRotationPoint(-56.5F, -5F, -33F);

		rightTrackWheelModels[91].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[91].setRotationPoint(-56.5F, -5F, -34F);

		rightTrackWheelModels[92].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 13
		rightTrackWheelModels[92].setRotationPoint(-56.5F, -5F, -34F);

		rightTrackWheelModels[93].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[93].setRotationPoint(-56.5F, -5F, -34F);

		rightTrackWheelModels[94].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 13
		rightTrackWheelModels[94].setRotationPoint(-56.5F, -5F, -34F);

		rightTrackWheelModels[95].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[95].setRotationPoint(-56.5F, -5F, -34F);

		rightTrackWheelModels[96].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[96].setRotationPoint(-56.5F, -5F, -34F);

		rightTrackWheelModels[97].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[97].setRotationPoint(-56.5F, -5F, -34F);

		rightTrackWheelModels[98].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		rightTrackWheelModels[98].setRotationPoint(-56.5F, -5F, -34F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 13
		leftTrackModel[1] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 13
		leftTrackModel[2] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 13
		leftTrackModel[3] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Box 13
		leftTrackModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		leftTrackModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		leftTrackModel[6] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 13
		leftTrackModel[7] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 13
		leftTrackModel[8] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 13
		leftTrackModel[9] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Box 13
		leftTrackModel[10] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Box 13
		leftTrackModel[11] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 13

		leftTrackModel[0].addBox(0F, 0F, -10F, 103, 1, 10, 0F); // Box 13
		leftTrackModel[0].setRotationPoint(-44F, 12F, 35F);

		leftTrackModel[1].addBox(0F, 0F, -10F, 8, 1, 10, 0F); // Box 13
		leftTrackModel[1].setRotationPoint(81.4F, 0.5F, 35F);
		leftTrackModel[1].rotateAngleZ = -2.44346095F;

		leftTrackModel[2].addBox(0F, 0F, -10F, 1, 6, 10, 0F); // Box 13
		leftTrackModel[2].setRotationPoint(-64.1F, -9F, 35F);

		leftTrackModel[3].addBox(1F, 0F, 5F, 20, 1, 10, 0F); // Box 13
		leftTrackModel[3].setRotationPoint(-61.5F, 1.6F, 20F);
		leftTrackModel[3].rotateAngleZ = -0.52359878F;

		leftTrackModel[4].addBox(0F, 0F, -10F, 1, 5, 10, 0F); // Box 13
		leftTrackModel[4].setRotationPoint(84F, -9F, 35F);

		leftTrackModel[5].addBox(0F, 0F, -10F, 3, 1, 10, 0F); // Box 13
		leftTrackModel[5].setRotationPoint(84.4F, -8.2F, 35F);
		leftTrackModel[5].rotateAngleZ = 2.44346095F;

		leftTrackModel[6].addBox(0F, 0F, -10F, 133, 1, 10, 0F); // Box 13
		leftTrackModel[6].setRotationPoint(-58F, -14F, 35F);

		leftTrackModel[7].addBox(0F, 0F, -10F, 8, 1, 10, 0F); // Box 13
		leftTrackModel[7].setRotationPoint(-64F, -9F, 35F);
		leftTrackModel[7].rotateAngleZ = 0.6981317F;

		leftTrackModel[8].addBox(0F, 0F, -10F, 9, 1, 10, 0F); // Box 13
		leftTrackModel[8].setRotationPoint(82.4F, -10F, 35F);
		leftTrackModel[8].rotateAngleZ = 2.7925268F;

		leftTrackModel[9].addBox(-1F, 0F, -10F, 6, 1, 10, 0F); // Box 13
		leftTrackModel[9].setRotationPoint(84.4F, -3.4F, 35F);
		leftTrackModel[9].rotateAngleZ = -2.23402144F;

		leftTrackModel[10].addBox(1F, 0F, 5F, 7, 1, 10, 0F); // Box 13
		leftTrackModel[10].setRotationPoint(-63.8F, -4.4F, 20F);
		leftTrackModel[10].rotateAngleZ = -1.08210414F;

		leftTrackModel[11].addBox(0F, 0F, -10F, 18, 1, 10, 0F); // Box 13
		leftTrackModel[11].setRotationPoint(75.4F, 5.5F, 35F);
		leftTrackModel[11].rotateAngleZ = -2.72271363F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Box 13
		rightTrackModel[1] = new ModelRendererTurbo(this, 777, 249, textureX, textureY); // Box 13
		rightTrackModel[2] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 13
		rightTrackModel[3] = new ModelRendererTurbo(this, 817, 249, textureX, textureY); // Box 13
		rightTrackModel[4] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 13
		rightTrackModel[5] = new ModelRendererTurbo(this, 721, 145, textureX, textureY); // Box 13
		rightTrackModel[6] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 13
		rightTrackModel[7] = new ModelRendererTurbo(this, 881, 249, textureX, textureY); // Box 13
		rightTrackModel[8] = new ModelRendererTurbo(this, 953, 249, textureX, textureY); // Box 13
		rightTrackModel[9] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 13
		rightTrackModel[10] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 13
		rightTrackModel[11] = new ModelRendererTurbo(this, 649, 257, textureX, textureY); // Box 13

		rightTrackModel[0].addBox(0F, 0F, 0F, 103, 1, 10, 0F); // Box 13
		rightTrackModel[0].setRotationPoint(-44F, 12F, -35F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 8, 1, 10, 0F); // Box 13
		rightTrackModel[1].setRotationPoint(81.4F, 0.5F, -35F);
		rightTrackModel[1].rotateAngleZ = -2.44346095F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 6, 10, 0F); // Box 13
		rightTrackModel[2].setRotationPoint(-64.1F, -9F, -35F);

		rightTrackModel[3].addBox(1F, 0F, 15F, 20, 1, 10, 0F); // Box 13
		rightTrackModel[3].setRotationPoint(-61.5F, 1.6F, -50F);
		rightTrackModel[3].rotateAngleZ = -0.52359878F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 13
		rightTrackModel[4].setRotationPoint(84F, -9F, -35F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 13
		rightTrackModel[5].setRotationPoint(84.4F, -8.2F, -35F);
		rightTrackModel[5].rotateAngleZ = 2.44346095F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 133, 1, 10, 0F); // Box 13
		rightTrackModel[6].setRotationPoint(-58F, -14F, -35F);

		rightTrackModel[7].addBox(0F, 0F, 0F, 8, 1, 10, 0F); // Box 13
		rightTrackModel[7].setRotationPoint(-64F, -9F, -35F);
		rightTrackModel[7].rotateAngleZ = 0.6981317F;

		rightTrackModel[8].addBox(0F, 0F, 0F, 9, 1, 10, 0F); // Box 13
		rightTrackModel[8].setRotationPoint(82.4F, -10F, -35F);
		rightTrackModel[8].rotateAngleZ = 2.7925268F;

		rightTrackModel[9].addBox(-1F, 0F, 0F, 6, 1, 10, 0F); // Box 13
		rightTrackModel[9].setRotationPoint(84.4F, -3.4F, -35F);
		rightTrackModel[9].rotateAngleZ = -2.23402144F;

		rightTrackModel[10].addBox(1F, 0F, 15F, 7, 1, 10, 0F); // Box 13
		rightTrackModel[10].setRotationPoint(-63.8F, -4.4F, -50F);
		rightTrackModel[10].rotateAngleZ = -1.08210414F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 18, 1, 10, 0F); // Box 13
		rightTrackModel[11].setRotationPoint(75.4F, 5.5F, -35F);
		rightTrackModel[11].rotateAngleZ = -2.72271363F;
		
		translateAll(0F, -2F, 0F);
		
	}
}