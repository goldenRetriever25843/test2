//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MBTRev
// Model Creator: 
// Created on: 07.06.2015 - 18:23:09
// Last changed on: 07.06.2015 - 18:23:09

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLeoRev extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLeoRev() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[107];
		turretModel = new ModelRendererTurbo[102];
		barrelModel = new ModelRendererTurbo[68];
		leftTrackWheelModels = new ModelRendererTurbo[95];
		rightTrackWheelModels = new ModelRendererTurbo[85];
		leftTrackModel = new ModelRendererTurbo[8];
		rightTrackModel = new ModelRendererTurbo[8];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 737, 81, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 6
		bodyModel[10] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 6
		bodyModel[13] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 6
		bodyModel[15] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 6
		bodyModel[16] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 6
		bodyModel[17] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 6
		bodyModel[21] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 945, 161, textureX, textureY); // Box 6
		bodyModel[25] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 6
		bodyModel[26] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 6
		bodyModel[30] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 6
		bodyModel[34] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 6
		bodyModel[37] = new ModelRendererTurbo(this, 593, 201, textureX, textureY); // Box 6
		bodyModel[38] = new ModelRendererTurbo(this, 801, 201, textureX, textureY); // Box 6
		bodyModel[39] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 6
		bodyModel[40] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 6
		bodyModel[41] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 6
		bodyModel[42] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // Box 6
		bodyModel[43] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 6
		bodyModel[44] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 6
		bodyModel[45] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 6
		bodyModel[46] = new ModelRendererTurbo(this, 921, 169, textureX, textureY); // Box 6
		bodyModel[47] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[48] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
		bodyModel[49] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 6
		bodyModel[50] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 6
		bodyModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[52] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 6
		bodyModel[53] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 6
		bodyModel[54] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 6
		bodyModel[55] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 6
		bodyModel[56] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 6
		bodyModel[57] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		bodyModel[58] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 6
		bodyModel[59] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 6
		bodyModel[60] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 6
		bodyModel[61] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 6
		bodyModel[62] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 6
		bodyModel[63] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 6
		bodyModel[64] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 6
		bodyModel[65] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 6
		bodyModel[66] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 6
		bodyModel[67] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 6
		bodyModel[68] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 6
		bodyModel[69] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 6
		bodyModel[70] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 6
		bodyModel[71] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 6
		bodyModel[72] = new ModelRendererTurbo(this, 681, 217, textureX, textureY); // Box 6
		bodyModel[73] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 6
		bodyModel[74] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Box 6
		bodyModel[75] = new ModelRendererTurbo(this, 921, 201, textureX, textureY); // Box 6
		bodyModel[76] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 6
		bodyModel[77] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 6
		bodyModel[78] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 6
		bodyModel[79] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Box 6
		bodyModel[80] = new ModelRendererTurbo(this, 617, 217, textureX, textureY); // Box 6
		bodyModel[81] = new ModelRendererTurbo(this, 137, 225, textureX, textureY); // Box 6
		bodyModel[82] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Box 6
		bodyModel[83] = new ModelRendererTurbo(this, 969, 201, textureX, textureY); // Box 6
		bodyModel[84] = new ModelRendererTurbo(this, 1001, 201, textureX, textureY); // Box 6
		bodyModel[85] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 6
		bodyModel[86] = new ModelRendererTurbo(this, 857, 225, textureX, textureY); // Box 6
		bodyModel[87] = new ModelRendererTurbo(this, 617, 241, textureX, textureY); // Box 6
		bodyModel[88] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Box 6
		bodyModel[89] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 6
		bodyModel[90] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // Box 6
		bodyModel[91] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 6
		bodyModel[92] = new ModelRendererTurbo(this, 1001, 217, textureX, textureY); // Box 6
		bodyModel[93] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 6
		bodyModel[94] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 6
		bodyModel[95] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 6
		bodyModel[96] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 6
		bodyModel[97] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 6
		bodyModel[98] = new ModelRendererTurbo(this, 969, 225, textureX, textureY); // Box 6
		bodyModel[99] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 6
		bodyModel[100] = new ModelRendererTurbo(this, 321, 233, textureX, textureY); // Box 6
		bodyModel[101] = new ModelRendererTurbo(this, 969, 233, textureX, textureY); // Box 6
		bodyModel[102] = new ModelRendererTurbo(this, 857, 249, textureX, textureY); // Box 6
		bodyModel[103] = new ModelRendererTurbo(this, 921, 249, textureX, textureY); // Box 6
		bodyModel[104] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 6
		bodyModel[105] = new ModelRendererTurbo(this, 937, 305, textureX, textureY); // Box 6
		bodyModel[106] = new ModelRendererTurbo(this, 729, 249, textureX, textureY); // Box 6

		bodyModel[0].addShapeBox(0F, 0F, 0F, 15, 6, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(59F, -11F, -15F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(48F, -17F, -20F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 74, 3, 40, 0F,22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(-26F, -17F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -8F, 3F, 0F, -8F, 3F, 0F, 0F, 3F, 0F); // Box 6
		bodyModel[3].setRotationPoint(42F, -5F, -20F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 104, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-61F, -2F, -20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 15, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-72F, -14F, -20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 103, 12, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-61F, -14F, -20F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 17, 9, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[7].setRotationPoint(42F, -14F, -20F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[8].setRotationPoint(-51F, 0F, -24F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[9].setRotationPoint(-36F, 0F, -24F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[10].setRotationPoint(-21.5F, 0F, -24F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[11].setRotationPoint(-7.5F, 0F, -24F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[12].setRotationPoint(7.5F, 0F, -24F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[13].setRotationPoint(22.5F, 0F, -24F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[14].setRotationPoint(38.5F, 0F, -24F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[15].setRotationPoint(-51F, 0F, 20F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[16].setRotationPoint(-36F, 0F, 20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[17].setRotationPoint(-21.5F, 0F, 20F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[18].setRotationPoint(-7.5F, 0F, 20F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[19].setRotationPoint(7.5F, 0F, 20F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[20].setRotationPoint(22.5F, 0F, 20F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[21].setRotationPoint(38.5F, 0F, 20F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 24, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[22].setRotationPoint(-72F, -17F, -20F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 12, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[23].setRotationPoint(-61F, -25F, -30.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 6
		bodyModel[24].setRotationPoint(-49F, -25F, -30.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 4, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 6
		bodyModel[25].setRotationPoint(-69F, -25F, -30.5F);

		bodyModel[26].addShapeBox(0F, 0F, -28F, 8, 4, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 6
		bodyModel[26].setRotationPoint(-69F, -25F, 30.5F);

		bodyModel[27].addShapeBox(0F, 0F, -28F, 12, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[27].setRotationPoint(-61F, -25F, 30.5F);

		bodyModel[28].addShapeBox(0F, 0F, -28F, 8, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 6
		bodyModel[28].setRotationPoint(-49F, -25F, 30.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, -2F, 0F); // Box 6
		bodyModel[29].setRotationPoint(60F, -18F, -34F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[30].setRotationPoint(70F, -15F, -34F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[31].setRotationPoint(60F, -18F, -21F);

		bodyModel[32].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[32].setRotationPoint(0F, -27F, 0F);

		bodyModel[33].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[33].setRotationPoint(0F, -27F, 0F);
		bodyModel[33].rotateAngleY = 0.31415927F;

		bodyModel[34].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[34].setRotationPoint(0F, -27F, 0F);
		bodyModel[34].rotateAngleY = -0.31415927F;

		bodyModel[35].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[35].setRotationPoint(0F, -27F, 0F);
		bodyModel[35].rotateAngleY = -0.62831853F;

		bodyModel[36].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[36].setRotationPoint(0F, -27F, 0F);
		bodyModel[36].rotateAngleY = -0.9424778F;

		bodyModel[37].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[37].setRotationPoint(0F, -27F, 0F);
		bodyModel[37].rotateAngleY = -1.25663706F;

		bodyModel[38].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[38].setRotationPoint(0F, -27F, 0F);
		bodyModel[38].rotateAngleY = -1.57079633F;

		bodyModel[39].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[39].setRotationPoint(0F, -27F, 0F);
		bodyModel[39].rotateAngleY = -1.88495559F;

		bodyModel[40].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[40].setRotationPoint(0F, -27F, 0F);
		bodyModel[40].rotateAngleY = -2.19911486F;

		bodyModel[41].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[41].setRotationPoint(0F, -27F, 0F);
		bodyModel[41].rotateAngleY = -2.51327412F;

		bodyModel[42].addShapeBox(0F, 0F, -2F, 32, 18, 3, 0F,0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[42].setRotationPoint(28F, -22F, -36F);

		bodyModel[43].addShapeBox(0F, 0F, -2F, 10, 14, 3, 0F,0F, -1F, 0F, -2F, -3.5F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -9F, -2F, 2F, -9F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[43].setRotationPoint(60F, -18F, -36F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 14, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -9F, 0F, 2F, -9F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[44].setRotationPoint(60F, -18F, -35F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 32, 18, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[45].setRotationPoint(28F, -22F, -35F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[46].setRotationPoint(-76F, -17F, 20F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[47].setRotationPoint(-77F, -15F, 27.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[48].setRotationPoint(-77F, -14F, 27.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 6
		bodyModel[49].setRotationPoint(-77F, -15F, 24F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[50].setRotationPoint(-77F, -14F, 24F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[51].setRotationPoint(-77F, -14.5F, 22F);

		bodyModel[52].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[52].setRotationPoint(-77F, -14F, -27.5F);

		bodyModel[53].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[53].setRotationPoint(-77F, -15F, -27.5F);

		bodyModel[54].addShapeBox(0F, 0F, -14F, 2, 5, 14, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[54].setRotationPoint(-76F, -17F, -20F);

		bodyModel[55].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[55].setRotationPoint(-77F, -14F, -24F);

		bodyModel[56].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 6
		bodyModel[56].setRotationPoint(-77F, -15F, -24F);

		bodyModel[57].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[57].setRotationPoint(-77F, -14.5F, -22F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[58].setRotationPoint(-73F, -16F, -19.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[59].setRotationPoint(-73F, -13F, -19.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 6
		bodyModel[60].setRotationPoint(-73F, -13F, -16.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[61].setRotationPoint(-73F, -16F, -16.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[62].setRotationPoint(-73F, -15F, -12.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[63].setRotationPoint(-73F, -16F, 16.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 6
		bodyModel[64].setRotationPoint(-73F, -13F, 16.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[65].setRotationPoint(-73F, -13F, 13.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[66].setRotationPoint(-73F, -16F, 13.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[67].setRotationPoint(-73F, -15F, 2.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[68].setRotationPoint(-73F, -9F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[69].setRotationPoint(-73F, -8F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 8, 68, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[70].setRotationPoint(-76F, -25F, -34F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 50, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[71].setRotationPoint(-22F, -22F, -34F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 53, 8, 68, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[72].setRotationPoint(-75F, -25F, -34F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 32, 5, 68, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[73].setRotationPoint(28F, -22F, -34F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[74].setRotationPoint(70F, -15F, -21F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F); // Box 6
		bodyModel[75].setRotationPoint(60F, -18F, 21F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6
		bodyModel[76].setRotationPoint(70F, -15F, 21F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[77].setRotationPoint(70F, -15F, 20F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[78].setRotationPoint(60F, -18F, 20F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 7, 30, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[79].setRotationPoint(60F, -18F, -15F);

		bodyModel[80].addShapeBox(0F, 0F, -2F, 51, 18, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[80].setRotationPoint(-23F, -22F, -36F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 51, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[81].setRotationPoint(-23F, -22F, -35F);

		bodyModel[82].addShapeBox(0F, 0F, -1F, 32, 18, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[82].setRotationPoint(28F, -22F, 36F);

		bodyModel[83].addShapeBox(0F, 0F, -1F, 10, 14, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, -2F, -3.5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, -9F, 0F, 0F, -9F, -2F, 0F, -1F, 0F); // Box 6
		bodyModel[83].setRotationPoint(60F, -18F, 36F);

		bodyModel[84].addShapeBox(0F, 0F, -1F, 10, 14, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -9F, 0F, 2F, -9F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[84].setRotationPoint(60F, -18F, 35F);

		bodyModel[85].addShapeBox(0F, 0F, -1F, 32, 18, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[85].setRotationPoint(28F, -22F, 35F);

		bodyModel[86].addShapeBox(0F, 0F, -1F, 51, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[86].setRotationPoint(-23F, -22F, 36F);

		bodyModel[87].addShapeBox(0F, 0F, -1F, 51, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[87].setRotationPoint(-23F, -22F, 35F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 11, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[88].setRotationPoint(-84F, -26F, -36F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 30, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 6
		bodyModel[89].setRotationPoint(-83F, -26F, 35F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 30, 18, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[90].setRotationPoint(-53F, -22F, 35F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F, -0.2F, 0F, 6F, -0.2F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[91].setRotationPoint(-53F, -26F, 35F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[92].setRotationPoint(60F, -18F, -20F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[93].setRotationPoint(59F, -11F, -20F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 7, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[94].setRotationPoint(60F, -18F, -19F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F,0F, 0F, 0F, 6F, -1.5F, 0F, 6F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[95].setRotationPoint(59F, -11F, -19F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0.25F, -2.25F, 0F, 0.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[96].setRotationPoint(70F, -15F, -19F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[97].setRotationPoint(60F, -18F, 19F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 15, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[98].setRotationPoint(59F, -11F, 19F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, 0.25F, -2.25F, 0F, 0.25F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[99].setRotationPoint(70F, -15F, 15F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F,0F, 0F, 0F, 6F, -1.5F, 0F, 6F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[100].setRotationPoint(59F, -11F, 15F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 10, 7, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[101].setRotationPoint(60F, -18F, 15F);

		bodyModel[102].addShapeBox(0F, 0F, -1F, 30, 18, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[102].setRotationPoint(-53F, -22F, -35F);

		bodyModel[103].addShapeBox(0F, 0F, -1F, 30, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); // Box 6
		bodyModel[103].setRotationPoint(-83F, -26F, -35F);

		bodyModel[104].addShapeBox(0F, 0F, -1F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 6F, -0.2F, 0F, 6F, -0.2F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[104].setRotationPoint(-53F, -26F, -35F);

		bodyModel[105].addShapeBox(0F, 0F, -32F, 1, 11, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[105].setRotationPoint(-84F, -26F, 36F);

		bodyModel[106].addShapeBox(0F, 0F, -4F, 1, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[106].setRotationPoint(-84F, -22F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 137, 257, textureX, textureY); // Box 6
		turretModel[1] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Box 6
		turretModel[2] = new ModelRendererTurbo(this, 993, 241, textureX, textureY); // Box 6
		turretModel[3] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 6
		turretModel[4] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 6
		turretModel[5] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Box 6
		turretModel[6] = new ModelRendererTurbo(this, 617, 265, textureX, textureY); // Box 6
		turretModel[7] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Box 6
		turretModel[8] = new ModelRendererTurbo(this, 969, 257, textureX, textureY); // Box 6
		turretModel[9] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 6
		turretModel[10] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 6
		turretModel[11] = new ModelRendererTurbo(this, 673, 265, textureX, textureY); // Box 6
		turretModel[12] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 6
		turretModel[13] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 6
		turretModel[14] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 6
		turretModel[15] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 6
		turretModel[16] = new ModelRendererTurbo(this, 729, 217, textureX, textureY); // Box 6
		turretModel[17] = new ModelRendererTurbo(this, 729, 233, textureX, textureY); // Box 6
		turretModel[18] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 6
		turretModel[19] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 6
		turretModel[20] = new ModelRendererTurbo(this, 905, 273, textureX, textureY); // Box 6
		turretModel[21] = new ModelRendererTurbo(this, 945, 281, textureX, textureY); // Box 6
		turretModel[22] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Box 6
		turretModel[23] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 6
		turretModel[24] = new ModelRendererTurbo(this, 329, 289, textureX, textureY); // Box 6
		turretModel[25] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Box 6
		turretModel[26] = new ModelRendererTurbo(this, 409, 297, textureX, textureY); // Box 6
		turretModel[27] = new ModelRendererTurbo(this, 537, 297, textureX, textureY); // Box 6
		turretModel[28] = new ModelRendererTurbo(this, 697, 297, textureX, textureY); // Box 6
		turretModel[29] = new ModelRendererTurbo(this, 849, 297, textureX, textureY); // Box 6
		turretModel[30] = new ModelRendererTurbo(this, 481, 297, textureX, textureY); // Box 6
		turretModel[31] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Box 6
		turretModel[32] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 6
		turretModel[33] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 6
		turretModel[34] = new ModelRendererTurbo(this, 857, 273, textureX, textureY); // Box 6
		turretModel[35] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Box 6
		turretModel[36] = new ModelRendererTurbo(this, 65, 305, textureX, textureY); // Box 6
		turretModel[37] = new ModelRendererTurbo(this, 537, 297, textureX, textureY); // Box 6
		turretModel[38] = new ModelRendererTurbo(this, 641, 297, textureX, textureY); // Box 6
		turretModel[39] = new ModelRendererTurbo(this, 681, 297, textureX, textureY); // Box 6
		turretModel[40] = new ModelRendererTurbo(this, 793, 297, textureX, textureY); // Box 6
		turretModel[41] = new ModelRendererTurbo(this, 849, 297, textureX, textureY); // Box 6
		turretModel[42] = new ModelRendererTurbo(this, 985, 281, textureX, textureY); // Box 6
		turretModel[43] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 6
		turretModel[44] = new ModelRendererTurbo(this, 921, 305, textureX, textureY); // Box 6
		turretModel[45] = new ModelRendererTurbo(this, 81, 305, textureX, textureY); // Box 6
		turretModel[46] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 6
		turretModel[47] = new ModelRendererTurbo(this, 481, 321, textureX, textureY); // Box 6
		turretModel[48] = new ModelRendererTurbo(this, 521, 321, textureX, textureY); // Box 6
		turretModel[49] = new ModelRendererTurbo(this, 641, 321, textureX, textureY); // Box 6
		turretModel[50] = new ModelRendererTurbo(this, 537, 321, textureX, textureY); // Box 6
		turretModel[51] = new ModelRendererTurbo(this, 689, 321, textureX, textureY); // Box 6
		turretModel[52] = new ModelRendererTurbo(this, 793, 321, textureX, textureY); // Box 6
		turretModel[53] = new ModelRendererTurbo(this, 849, 321, textureX, textureY); // Box 6
		turretModel[54] = new ModelRendererTurbo(this, 145, 329, textureX, textureY); // Box 6
		turretModel[55] = new ModelRendererTurbo(this, 193, 329, textureX, textureY); // Box 6
		turretModel[56] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 6
		turretModel[57] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 6
		turretModel[58] = new ModelRendererTurbo(this, 376, 369, textureX, textureY); // Box 6
		turretModel[59] = new ModelRendererTurbo(this, 297, 339, textureX, textureY); // Box 6
		turretModel[60] = new ModelRendererTurbo(this, 329, 333, textureX, textureY); // Box 6
		turretModel[61] = new ModelRendererTurbo(this, 285, 369, textureX, textureY); // Box 6
		turretModel[62] = new ModelRendererTurbo(this, 359, 323, textureX, textureY); // Box 6
		turretModel[63] = new ModelRendererTurbo(this, 358, 332, textureX, textureY); // Box 6
		turretModel[64] = new ModelRendererTurbo(this, 357, 338, textureX, textureY); // Box 6
		turretModel[65] = new ModelRendererTurbo(this, 376, 333, textureX, textureY); // Box 6
		turretModel[66] = new ModelRendererTurbo(this, 374, 333, textureX, textureY); // Box 6
		turretModel[67] = new ModelRendererTurbo(this, 381, 323, textureX, textureY); // Box 6
		turretModel[68] = new ModelRendererTurbo(this, 379, 355, textureX, textureY); // Box 6
		turretModel[69] = new ModelRendererTurbo(this, 388, 349, textureX, textureY); // Box 6
		turretModel[70] = new ModelRendererTurbo(this, 388, 355, textureX, textureY); // Box 6
		turretModel[71] = new ModelRendererTurbo(this, 397, 349, textureX, textureY); // Box 6
		turretModel[72] = new ModelRendererTurbo(this, 395, 335, textureX, textureY); // Box 6
		turretModel[73] = new ModelRendererTurbo(this, 395, 327, textureX, textureY); // Box 6
		turretModel[74] = new ModelRendererTurbo(this, 376, 333, textureX, textureY); // Box 6
		turretModel[75] = new ModelRendererTurbo(this, 374, 333, textureX, textureY); // Box 6
		turretModel[76] = new ModelRendererTurbo(this, 357, 338, textureX, textureY); // Box 6
		turretModel[77] = new ModelRendererTurbo(this, 379, 355, textureX, textureY); // Box 6
		turretModel[78] = new ModelRendererTurbo(this, 388, 355, textureX, textureY); // Box 6
		turretModel[79] = new ModelRendererTurbo(this, 395, 327, textureX, textureY); // Box 6
		turretModel[80] = new ModelRendererTurbo(this, 395, 335, textureX, textureY); // Box 6
		turretModel[81] = new ModelRendererTurbo(this, 388, 349, textureX, textureY); // Box 6
		turretModel[82] = new ModelRendererTurbo(this, 397, 349, textureX, textureY); // Box 6
		turretModel[83] = new ModelRendererTurbo(this, 381, 323, textureX, textureY); // Box 6
		turretModel[84] = new ModelRendererTurbo(this, 121, 399, textureX, textureY); // Box 6
		turretModel[85] = new ModelRendererTurbo(this, 193, 399, textureX, textureY); // Box 6
		turretModel[86] = new ModelRendererTurbo(this, 209, 399, textureX, textureY); // Box 6
		turretModel[87] = new ModelRendererTurbo(this, 225, 399, textureX, textureY); // Box 6
		turretModel[88] = new ModelRendererTurbo(this, 225, 399, textureX, textureY); // Box 6
		turretModel[89] = new ModelRendererTurbo(this, 49, 399, textureX, textureY); // Box 6
		turretModel[90] = new ModelRendererTurbo(this, 249, 399, textureX, textureY); // Box 6
		turretModel[91] = new ModelRendererTurbo(this, 328, 408, textureX, textureY); // Box 6
		turretModel[92] = new ModelRendererTurbo(this, 353, 399, textureX, textureY); // Box 6
		turretModel[93] = new ModelRendererTurbo(this, 497, 399, textureX, textureY); // Box 6
		turretModel[94] = new ModelRendererTurbo(this, 105, 407, textureX, textureY); // Box 6
		turretModel[95] = new ModelRendererTurbo(this, 121, 407, textureX, textureY); // Box 6
		turretModel[96] = new ModelRendererTurbo(this, 380, 405, textureX, textureY); // Box 6
		turretModel[97] = new ModelRendererTurbo(this, 305, 399, textureX, textureY); // Box 6
		turretModel[98] = new ModelRendererTurbo(this, 719, 328, textureX, textureY); // Box 6
		turretModel[99] = new ModelRendererTurbo(this, 719, 328, textureX, textureY); // Box 6
		turretModel[100] = new ModelRendererTurbo(this, 12, 294, textureX, textureY); // Box 471
		turretModel[101] = new ModelRendererTurbo(this, 12, 294, textureX, textureY); // Box 472

		turretModel[0].addShapeBox(24F, -6F, -8F, 6, 13, 16, 0F,0F, 0F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[0].setRotationPoint(0F, -30F, 0F);

		turretModel[1].addShapeBox(0F, 1F, -28F, 18, 13, 56, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[1].setRotationPoint(0F, -37F, 0F);

		turretModel[2].addShapeBox(18F, 1F, -28F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 6
		turretModel[2].setRotationPoint(0F, -35F, 0F);

		turretModel[3].addShapeBox(18F, 1F, 8F, 7, 11, 20, 0F,0F, 0F, 0F, 4F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		turretModel[3].setRotationPoint(0F, -35F, 0F);

		turretModel[4].addShapeBox(25F, 2F, -26F, 2, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[4].setRotationPoint(0F, -35F, 0F);

		turretModel[5].addShapeBox(0F, -1F, -22F, 18, 4, 44, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 6
		turretModel[5].setRotationPoint(0F, -37F, 0F);

		turretModel[6].addShapeBox(0F, -1F, 22F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 6
		turretModel[6].setRotationPoint(0F, -37F, 0F);

		turretModel[7].addShapeBox(18F, 1F, 22F, 7, 4, 6, 0F,0F, 0F, 0F, 1.1F, -1F, 1F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, -2F, 0F, 1.1F, -1F, 1F, 0F, -1F, -2F, 0F, -2F, 0F); // Box 6
		turretModel[7].setRotationPoint(0F, -37F, 0F);

		turretModel[8].addShapeBox(18F, 1F, 8F, 9, 4, 16, 0F,0F, 0F, 0F, 2F, -2F, 0F, -0.9F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, -1F, 0F, -0.9F, -1F, -3F, 0F, -2F, 0F); // Box 6
		turretModel[8].setRotationPoint(0F, -37F, 0F);

		turretModel[9].addShapeBox(18F, 5F, -28F, 7, 7, 20, 0F,0F, 0F, 0F, 0F, -1F, -2F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[9].setRotationPoint(0F, -35F, 0F);

		turretModel[10].addShapeBox(18F, 1F, -28F, 7, 4, 6, 0F,0F, -1F, 0F, 0F, -2F, -2F, 1.1F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 1.1F, -1F, 1F, 0F, -2F, 0F); // Box 6
		turretModel[10].setRotationPoint(0F, -37F, 0F);

		turretModel[11].addShapeBox(0F, -1F, -28F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 6
		turretModel[11].setRotationPoint(0F, -37F, 0F);

		turretModel[12].addShapeBox(18F, 1F, -22F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[12].setRotationPoint(0F, -37F, 0F);

		turretModel[13].addShapeBox(-9F, -13F, -18F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[13].setRotationPoint(0F, -28F, 0F);

		turretModel[14].addShapeBox(-6F, -13F, -18F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 6
		turretModel[14].setRotationPoint(0F, -28F, 0F);

		turretModel[15].addShapeBox(-12F, -13F, -18F, 3, 4, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 6
		turretModel[15].setRotationPoint(0F, -28F, 0F);

		turretModel[16].addShapeBox(-8.5F, -13F, -18F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[16].setRotationPoint(0F, -34F, 1.5F);

		turretModel[17].addShapeBox(-10.5F, -13F, -18F, 2, 6, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 6
		turretModel[17].setRotationPoint(0F, -34F, 1.5F);

		turretModel[18].addShapeBox(-6.5F, -13F, -18F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		turretModel[18].setRotationPoint(0F, -34F, 1.5F);

		turretModel[19].addShapeBox(-6.5F, -13F, -18F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 6
		turretModel[19].setRotationPoint(0F, -33F, 2.5F);

		turretModel[20].addShapeBox(-20F, -13F, 3F, 7, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[20].setRotationPoint(0F, -26F, 0F);

		turretModel[21].addShapeBox(-13F, -13F, 3F, 7, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 6
		turretModel[21].setRotationPoint(0F, -26F, 0F);

		turretModel[22].addShapeBox(-27F, -13F, 3F, 7, 1, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 6
		turretModel[22].setRotationPoint(0F, -26F, 0F);

		turretModel[23].addShapeBox(-19.5F, -12F, 5.5F, 6, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[23].setRotationPoint(0F, -29F, 0F);

		turretModel[24].addShapeBox(-13.5F, -12F, 5.5F, 5, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 6
		turretModel[24].setRotationPoint(0F, -29F, 0F);

		turretModel[25].addShapeBox(-24.5F, -12F, 5.5F, 5, 2, 16, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 6
		turretModel[25].setRotationPoint(0F, -29F, 0F);

		turretModel[26].addShapeBox(-6F, -1F, -28F, 6, 15, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[26].setRotationPoint(0F, -37F, 0F);

		turretModel[27].addShapeBox(-30F, -1F, -28F, 20, 15, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3F, 0F); // Box 6
		turretModel[27].setRotationPoint(0F, -37F, 0F);

		turretModel[28].addShapeBox(-46F, -1F, -28F, 18, 12, 56, 0F,-2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F); // Box 6
		turretModel[28].setRotationPoint(0F, -37F, 0F);

		turretModel[29].addShapeBox(-10F, -1F, -28F, 4, 15, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 6
		turretModel[29].setRotationPoint(0F, -37F, 0F);

		turretModel[30].addShapeBox(12.5F, -1F, -19F, 14, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[30].setRotationPoint(0F, -35F, 0F);

		turretModel[31].addShapeBox(18F, 0F, -21F, 8, 7, 2, 0F,0F, 0F, 0F, 0.1F, -1F, 0F, 0.55F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[31].setRotationPoint(0F, -36F, 0F);

		turretModel[32].addShapeBox(-30F, 11F, -18F, 20, 3, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6F, -0.5F, 0F); // Box 6
		turretModel[32].setRotationPoint(0F, -37F, 0F);

		turretModel[33].addShapeBox(-30F, 11F, -26F, 20, 3, 8, 0F,-8F, -1.1F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6F, -0.5F, 0F); // Box 6
		turretModel[33].setRotationPoint(0F, -37F, 0F);

		turretModel[34].addShapeBox(-30F, 11F, 18F, 20, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, -8F, -1.1F, 0F, -6F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -9F, -0.5F, 0F); // Box 6
		turretModel[34].setRotationPoint(0F, -37F, 0F);

		turretModel[35].addShapeBox(18F, -1F, -9F, 11, 6, 1, 0F,0F, 0F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[35].setRotationPoint(0F, -35F, 0F);

		turretModel[36].addShapeBox(-54F, -1F, -26F, 10, 12, 52, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 6
		turretModel[36].setRotationPoint(0F, -37F, 0F);

		turretModel[37].addShapeBox(-30F, -1F, -34F, 20, 15, 6, 0F,-6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 6
		turretModel[37].setRotationPoint(0F, -37F, 0F);

		turretModel[38].addShapeBox(-10F, -1F, -34F, 10, 15, 6, 0F,0F, -2F, 0F, 6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[38].setRotationPoint(0F, -37F, 0F);

		turretModel[39].addShapeBox(0F, -1F, -34F, 18, 15, 6, 0F,-6F, -2F, 0F, 6F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[39].setRotationPoint(0F, -37F, 0F);

		turretModel[40].addShapeBox(-30F, -1F, 28F, 20, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 6
		turretModel[40].setRotationPoint(0F, -37F, 0F);

		turretModel[41].addShapeBox(-44F, -1F, -34F, 14, 12, 6, 0F,0F, -2F, -3F, 6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 6
		turretModel[41].setRotationPoint(0F, -37F, 0F);

		turretModel[42].addShapeBox(-53F, -1F, -31F, 8, 12, 5, 0F,1F, -1F, -9F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, -1F, 4F, 1F, 0F, -9F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 4F); // Box 6
		turretModel[42].setRotationPoint(0F, -37F, 0F);

		turretModel[43].addShapeBox(-53F, -1F, 26F, 8, 12, 5, 0F,1F, -1F, 4F, 1F, 0F, 0F, 1F, -2F, 0F, 1F, -1F, -9F, 1F, 0F, 4F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -9F); // Box 6
		turretModel[43].setRotationPoint(0F, -37F, 0F);

		turretModel[44].addShapeBox(-44F, -1F, 28F, 14, 12, 6, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 6
		turretModel[44].setRotationPoint(0F, -37F, 0F);

		turretModel[45].addShapeBox(18F, 3F, -34F, 7, 11, 6, 0F,-6F, 0F, 0F, 7F, -1F, -1F, 0F, 0F, 2F, -7F, 0F, 2F, 0F, 0F, 0F, 7F, -6F, -1F, 0F, 0F, 2F, -7F, 0F, 2F); // Box 6
		turretModel[45].setRotationPoint(0F, -37F, 0F);

		turretModel[46].addShapeBox(25F, 3F, -34F, 11, 6, 8, 0F,-7F, -1F, -1F, -1F, -1.5F, -1.5F, 2F, -0.75F, 0F, 0F, 0F, 0F, -7F, -1F, -1F, -1F, -2.25F, -1.5F, 2F, -1F, 0F, 0F, 5F, 0F); // Box 6
		turretModel[46].setRotationPoint(0F, -37F, 0F);

		turretModel[47].addShapeBox(25F, 3F, -26F, 13, 5, 5, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 1.1F, -0.25F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		turretModel[47].setRotationPoint(0F, -37F, 0F);

		turretModel[48].addShapeBox(26F, 2F, -21F, 12, 6, 2, 0F,0F, 0F, 0F, 1.1F, -1.25F, 0F, 1.55F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1.55F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
		turretModel[48].setRotationPoint(0F, -37F, 0F);

		turretModel[49].addShapeBox(25F, 8F, -26F, 13, 6, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 4F, -4F, 0F, -4F, 0F, 0F); // Box 6
		turretModel[49].setRotationPoint(0F, -37F, 0F);

		turretModel[50].addShapeBox(18F, -6F, -8F, 6, 13, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[50].setRotationPoint(0F, -30F, 0F);

		turretModel[51].addShapeBox(18F, 3F, 28F, 7, 11, 6, 0F,-7F, 0F, 2F, 0F, 0F, 2F, 7F, -1F, -1F, -6F, 0F, 0F, -7F, 0F, 2F, 0F, 0F, 2F, 7F, -6F, -1F, 0F, 0F, 0F); // Box 6
		turretModel[51].setRotationPoint(0F, -37F, 0F);

		turretModel[52].addShapeBox(0F, -1F, 28F, 18, 15, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 6F, -4F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 6
		turretModel[52].setRotationPoint(0F, -37F, 0F);

		turretModel[53].addShapeBox(-10F, -1F, 28F, 10, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[53].setRotationPoint(0F, -37F, 0F);

		turretModel[54].addShapeBox(25F, 3F, 26F, 11, 6, 8, 0F,0F, 0F, 0F, 2F, -0.75F, 0F, -1F, -1.5F, -1.5F, -7F, -1F, -1F, 0F, 5F, 0F, 2F, -1F, 0F, -1F, -2.25F, -1.5F, -7F, -1F, -1F); // Box 6
		turretModel[54].setRotationPoint(0F, -37F, 0F);

		turretModel[55].addShapeBox(25F, 4F, 8F, 13, 10, 18, 0F,-1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[55].setRotationPoint(0F, -37F, 0F);

		turretModel[56].addShapeBox(25F, 3F, 21F, 13, 1, 5, 0F,-1F, 1F, 0F, 1.1F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[56].setRotationPoint(0F, -37F, 0F);

		turretModel[57].addShapeBox(25F, 3F, 8F, 13, 1, 13, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 1.1F, -0.25F, 0F, -1F, 1F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1.1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		turretModel[57].setRotationPoint(0F, -37F, 0F);

		turretModel[58].addShapeBox(-48F, -17F, -34.3F, 90, 22, 1, 0F,-30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F); // Box 6
		turretModel[58].setRotationPoint(0F, -24F, 0F);

		turretModel[59].addShapeBox(28F, 1.5F, -33F, 8, 4, 8, 0F,-1F, -1F, -1F, -1F, -0.5F, -1F, -1F, -1F, -1F, -1F, -1F, -7F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -7F); // Box 6
		turretModel[59].setRotationPoint(0F, -37F, 0F);

		turretModel[60].addShapeBox(28F, 1.5F, 25F, 8, 4, 8, 0F,-1F, -1F, -7F, -1F, -1F, -1F, -1F, -0.5F, -1F, -1F, -1F, -1F, -1F, -1F, -7F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F, -1F); // Box 6
		turretModel[60].setRotationPoint(0F, -37F, 0F);

		turretModel[61].addShapeBox(-48F, -17F, 33.3F, 90, 22, 1, 0F,-30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F); // Box 6
		turretModel[61].setRotationPoint(0F, -24F, 0F);

		turretModel[62].addShapeBox(32F, 5F, -33F, 4, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[62].setRotationPoint(0F, -37F, 0F);

		turretModel[63].addShapeBox(32F, 5F, 30F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F); // Box 6
		turretModel[63].setRotationPoint(0F, -37F, 0F);

		turretModel[64].addShapeBox(-55F, 1F, -21F, 1, 1, 11, 0F,0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 6
		turretModel[64].setRotationPoint(0F, -37F, 0F);

		turretModel[65].addShapeBox(-55F, 9F, -21F, 1, 1, 11, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1F); // Box 6
		turretModel[65].setRotationPoint(0F, -37F, 0F);

		turretModel[66].addShapeBox(-55F, 2F, -21F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[66].setRotationPoint(0F, -37F, 0F);

		turretModel[67].addShapeBox(-55F, 2F, -11F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 6
		turretModel[67].setRotationPoint(0F, -37F, 0F);

		turretModel[68].addShapeBox(-55F, 2F, -20.5F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -3.75F, 0F, 1F, -3.75F, 0F, 0.5F, 2.75F, -0.5F, 0.5F, 2.75F); // Box 6
		turretModel[68].setRotationPoint(0F, -37F, 0F);

		turretModel[69].addShapeBox(-55F, 2F, -11.5F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.5F, 2.75F, 0F, 0.5F, 2.75F, 0F, 1F, -3.75F, -0.5F, 1F, -3.75F); // Box 6
		turretModel[69].setRotationPoint(0F, -37F, 0F);

		turretModel[70].addShapeBox(-55F, 7F, -20.5F, 1, 2, 1, 0F,-0.5F, 1F, -3.75F, 0F, 1F, -3.75F, 0F, 0.5F, 2.75F, -0.5F, 0.5F, 2.75F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 6
		turretModel[70].setRotationPoint(0F, -37F, 0F);

		turretModel[71].addShapeBox(-55F, 7F, -11.5F, 1, 2, 1, 0F,-0.5F, 0.5F, 2.75F, 0F, 0.5F, 2.75F, 0F, 1F, -3.75F, -0.5F, 1F, -3.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 6
		turretModel[71].setRotationPoint(0F, -37F, 0F);

		turretModel[72].addShapeBox(-55F, 4F, -16.5F, 1, 3, 2, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Box 6
		turretModel[72].setRotationPoint(0F, -37F, 0F);

		turretModel[73].addShapeBox(-55.5F, 4F, -16.5F, 1, 3, 2, 0F,-0.75F, -0.75F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.75F, 0F); // Box 6
		turretModel[73].setRotationPoint(0F, -37F, 0F);

		turretModel[74].addShapeBox(-55F, 9F, 10F, 1, 1, 11, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1F); // Box 6
		turretModel[74].setRotationPoint(0F, -37F, 0F);

		turretModel[75].addShapeBox(-55F, 2F, 10F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[75].setRotationPoint(0F, -37F, 0F);

		turretModel[76].addShapeBox(-55F, 1F, 10F, 1, 1, 11, 0F,0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 6
		turretModel[76].setRotationPoint(0F, -37F, 0F);

		turretModel[77].addShapeBox(-55F, 2F, 10.5F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, -3.75F, 0F, 1F, -3.75F, 0F, 0.5F, 2.75F, -0.5F, 0.5F, 2.75F); // Box 6
		turretModel[77].setRotationPoint(0F, -37F, 0F);

		turretModel[78].addShapeBox(-55F, 7F, 10.5F, 1, 2, 1, 0F,-0.5F, 1F, -3.75F, 0F, 1F, -3.75F, 0F, 0.5F, 2.75F, -0.5F, 0.5F, 2.75F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 6
		turretModel[78].setRotationPoint(0F, -37F, 0F);

		turretModel[79].addShapeBox(-55.5F, 4F, 14.5F, 1, 3, 2, 0F,-0.75F, -0.75F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.75F, -0.75F, 0F); // Box 6
		turretModel[79].setRotationPoint(0F, -37F, 0F);

		turretModel[80].addShapeBox(-55F, 4F, 14.5F, 1, 3, 2, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Box 6
		turretModel[80].setRotationPoint(0F, -37F, 0F);

		turretModel[81].addShapeBox(-55F, 2F, 19.5F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.5F, 2.75F, 0F, 0.5F, 2.75F, 0F, 1F, -3.75F, -0.5F, 1F, -3.75F); // Box 6
		turretModel[81].setRotationPoint(0F, -37F, 0F);

		turretModel[82].addShapeBox(-55F, 7F, 19.5F, 1, 2, 1, 0F,-0.5F, 0.5F, 2.75F, 0F, 0.5F, 2.75F, 0F, 1F, -3.75F, -0.5F, 1F, -3.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 6
		turretModel[82].setRotationPoint(0F, -37F, 0F);

		turretModel[83].addShapeBox(-55F, 2F, 20F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F); // Box 6
		turretModel[83].setRotationPoint(0F, -37F, 0F);

		turretModel[84].addShapeBox(-27F, 1F, 2.5F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[84].setRotationPoint(0F, -49F, -2F);

		turretModel[85].addShapeBox(-23F, 6.5F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[85].setRotationPoint(0F, -49F, -2F);

		turretModel[86].addShapeBox(-23F, 6.5F, 3F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 6
		turretModel[86].setRotationPoint(0F, -49F, -2F);

		turretModel[87].addShapeBox(-23F, 6.5F, -5F, 2, 2, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[87].setRotationPoint(0F, -49F, -2F);

		turretModel[88].addShapeBox(-27F, 8.5F, -5F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[88].setRotationPoint(0F, -49F, -2F);

		turretModel[89].addShapeBox(-23F, 8.5F, -5F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		turretModel[89].setRotationPoint(0F, -49F, -2F);

		turretModel[90].addShapeBox(-27F, 8F, -3.5F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 6
		turretModel[90].setRotationPoint(0F, -49F, -2F);

		turretModel[91].addShapeBox(-28F, -4F, 2.5F, 6, 2, 11, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 6
		turretModel[91].setRotationPoint(0F, -49F, -2F);

		turretModel[92].addShapeBox(-26F, 1F, -4.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 6
		turretModel[92].setRotationPoint(0F, -49F, -2F);

		turretModel[93].addShapeBox(-27F, 0F, -3.5F, 4, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[93].setRotationPoint(0F, -49F, -2F);

		turretModel[94].addShapeBox(-27F, 7F, -4.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 6
		turretModel[94].setRotationPoint(0F, -49F, -2F);

		turretModel[95].addShapeBox(-27F, 7F, 2.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		turretModel[95].setRotationPoint(0F, -49F, -2F);

		turretModel[96].addShapeBox(-25F, 9F, -1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[96].setRotationPoint(0F, -49F, -2F);

		turretModel[97].addShapeBox(-28F, -3F, 3.5F, 6, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 6
		turretModel[97].setRotationPoint(0F, -49F, -2F);

		turretModel[98].addShapeBox(18F, 3F, 26F, 7, 11, 8, 0F,0F, 1F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 6
		turretModel[98].setRotationPoint(0F, -37F, 0F);

		turretModel[99].addShapeBox(18F, 3F, -34F, 7, 11, 8, 0F,-6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 6
		turretModel[99].setRotationPoint(0F, -37F, 0F);

		turretModel[100].addShapeBox(-19.5F, -12F, 5.5F, 1, 2, 1, 0F,9.6F, 50F, -0.4F, -10.4F, 50F, -0.4F, -10.4F, 50F, -0.4F, 9.6F, 50F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 471
		turretModel[100].setRotationPoint(-26F, -26F, 18F);

		turretModel[101].addShapeBox(-19.5F, -12F, -5.5F, 1, 2, 1, 0F,9.6F, 50F, -0.4F, -10.4F, 50F, -0.4F, -10.4F, 50F, -0.4F, 9.6F, 50F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 472
		turretModel[101].setRotationPoint(4F, -26F, -15F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 6
		barrelModel[1] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 6
		barrelModel[2] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 6
		barrelModel[3] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 6
		barrelModel[4] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Box 6
		barrelModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		barrelModel[6] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Box 6
		barrelModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 6
		barrelModel[8] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 6
		barrelModel[9] = new ModelRendererTurbo(this, 945, 169, textureX, textureY); // Box 6
		barrelModel[10] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 6
		barrelModel[11] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 6
		barrelModel[12] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Box 6
		barrelModel[13] = new ModelRendererTurbo(this, 561, 209, textureX, textureY); // Box 6
		barrelModel[14] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 6
		barrelModel[15] = new ModelRendererTurbo(this, 857, 17, textureX, textureY); // Box 6
		barrelModel[16] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 6
		barrelModel[17] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 6
		barrelModel[18] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 6
		barrelModel[19] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 6
		barrelModel[20] = new ModelRendererTurbo(this, 753, 209, textureX, textureY); // Box 6
		barrelModel[21] = new ModelRendererTurbo(this, 857, 217, textureX, textureY); // Box 6
		barrelModel[22] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Box 6
		barrelModel[23] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Box 6
		barrelModel[24] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 6
		barrelModel[25] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 6
		barrelModel[26] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 6
		barrelModel[27] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 6
		barrelModel[28] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 6
		barrelModel[29] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 6
		barrelModel[30] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 6
		barrelModel[31] = new ModelRendererTurbo(this, 529, 41, textureX, textureY); // Box 6
		barrelModel[32] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 6
		barrelModel[33] = new ModelRendererTurbo(this, 537, 33, textureX, textureY); // Box 6
		barrelModel[34] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 6
		barrelModel[35] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 6
		barrelModel[36] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 6
		barrelModel[37] = new ModelRendererTurbo(this, 977, 305, textureX, textureY); // Box 6
		barrelModel[38] = new ModelRendererTurbo(this, 1, 399, textureX, textureY); // Box 6
		barrelModel[39] = new ModelRendererTurbo(this, 41, 399, textureX, textureY); // Box 6
		barrelModel[40] = new ModelRendererTurbo(this, 65, 399, textureX, textureY); // Box 6
		barrelModel[41] = new ModelRendererTurbo(this, 105, 399, textureX, textureY); // Box 6
		barrelModel[42] = new ModelRendererTurbo(this, 113, 399, textureX, textureY); // Box 6
		barrelModel[43] = new ModelRendererTurbo(this, 137, 399, textureX, textureY); // Box 6
		barrelModel[44] = new ModelRendererTurbo(this, 153, 399, textureX, textureY); // Box 6
		barrelModel[45] = new ModelRendererTurbo(this, 169, 399, textureX, textureY); // Box 6
		barrelModel[46] = new ModelRendererTurbo(this, 185, 399, textureX, textureY); // Box 6
		barrelModel[47] = new ModelRendererTurbo(this, 249, 399, textureX, textureY); // Box 6
		barrelModel[48] = new ModelRendererTurbo(this, 265, 399, textureX, textureY); // Box 6
		barrelModel[49] = new ModelRendererTurbo(this, 273, 399, textureX, textureY); // Box 6
		barrelModel[50] = new ModelRendererTurbo(this, 281, 399, textureX, textureY); // Box 6
		barrelModel[51] = new ModelRendererTurbo(this, 353, 399, textureX, textureY); // Box 6
		barrelModel[52] = new ModelRendererTurbo(this, 369, 399, textureX, textureY); // Box 6
		barrelModel[53] = new ModelRendererTurbo(this, 393, 399, textureX, textureY); // Box 6
		barrelModel[54] = new ModelRendererTurbo(this, 417, 399, textureX, textureY); // Box 6
		barrelModel[55] = new ModelRendererTurbo(this, 425, 399, textureX, textureY); // Box 6
		barrelModel[56] = new ModelRendererTurbo(this, 441, 399, textureX, textureY); // Box 6
		barrelModel[57] = new ModelRendererTurbo(this, 457, 399, textureX, textureY); // Box 6
		barrelModel[58] = new ModelRendererTurbo(this, 473, 399, textureX, textureY); // Box 6
		barrelModel[59] = new ModelRendererTurbo(this, 473, 399, textureX, textureY); // Box 6
		barrelModel[60] = new ModelRendererTurbo(this, 33, 407, textureX, textureY); // Box 6
		barrelModel[61] = new ModelRendererTurbo(this, 489, 399, textureX, textureY); // Box 6
		barrelModel[62] = new ModelRendererTurbo(this, 137, 407, textureX, textureY); // Box 6
		barrelModel[63] = new ModelRendererTurbo(this, 153, 407, textureX, textureY); // Box 6
		barrelModel[64] = new ModelRendererTurbo(this, 169, 407, textureX, textureY); // Box 6
		barrelModel[65] = new ModelRendererTurbo(this, 177, 407, textureX, textureY); // Box 6
		barrelModel[66] = new ModelRendererTurbo(this, 209, 407, textureX, textureY); // Box 6
		barrelModel[67] = new ModelRendererTurbo(this, 249, 407, textureX, textureY); // Box 6

		barrelModel[0].addShapeBox(0F, -4F, -8F, 7, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 5F, 0F); // Box 6
		barrelModel[0].setRotationPoint(32F, -30F, 0F);

		barrelModel[1].addShapeBox(9F, -1F, -3.5F, 6, 2, 7, 0F,0F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 6
		barrelModel[1].setRotationPoint(32F, -31F, 0F);

		barrelModel[2].addShapeBox(9F, 1F, -3.5F, 6, 2, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 6
		barrelModel[2].setRotationPoint(32F, -31F, 0F);

		barrelModel[3].addShapeBox(9F, 3F, -3.5F, 6, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.5F, -2F); // Box 6
		barrelModel[3].setRotationPoint(32F, -31F, 0F);

		barrelModel[4].addShapeBox(11F, -4F, -8F, 3, 3, 16, 0F,0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 6
		barrelModel[4].setRotationPoint(32F, -30F, 0F);

		barrelModel[5].addShapeBox(11F, -1F, -8F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0.15F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0.15F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 6
		barrelModel[5].setRotationPoint(32F, -30F, 0F);

		barrelModel[6].addShapeBox(11F, -1F, 3F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 6
		barrelModel[6].setRotationPoint(32F, -30F, 0F);

		barrelModel[7].addShapeBox(11F, -1F, -6.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 6
		barrelModel[7].setRotationPoint(32F, -30F, 0F);

		barrelModel[8].addShapeBox(4F, 3F, -3.5F, 5, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F); // Box 6
		barrelModel[8].setRotationPoint(32F, -31F, 0F);

		barrelModel[9].addShapeBox(4F, 1F, -3.5F, 5, 2, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 6
		barrelModel[9].setRotationPoint(32F, -31F, 0F);

		barrelModel[10].addShapeBox(11F, -1F, -4F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[10].setRotationPoint(32F, -30F, 0F);

		barrelModel[11].addShapeBox(11F, -1F, -4.5F, 3, 1, 1, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.35F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 6
		barrelModel[11].setRotationPoint(32F, -30F, 0F);

		barrelModel[12].addShapeBox(12F, -1F, -2F, 15, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[12].setRotationPoint(32F, -30F, 0F);

		barrelModel[13].addShapeBox(65F, -1F, -2F, 4, 2, 4, 0F,0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 6
		barrelModel[13].setRotationPoint(32F, -30F, 0F);

		barrelModel[14].addShapeBox(39F, -1F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F); // Box 6
		barrelModel[14].setRotationPoint(32F, -30F, 0F);

		barrelModel[15].addShapeBox(65F, 0F, -2F, 4, 2, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 6
		barrelModel[15].setRotationPoint(32F, -30F, 0F);

		barrelModel[16].addShapeBox(65F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 6
		barrelModel[16].setRotationPoint(32F, -30F, 0F);

		barrelModel[17].addShapeBox(39F, 1F, -2F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 6
		barrelModel[17].setRotationPoint(32F, -30F, 0F);

		barrelModel[18].addShapeBox(39F, 0.5F, -2F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 6
		barrelModel[18].setRotationPoint(32F, -30F, 0F);

		barrelModel[19].addShapeBox(12F, 0F, -2F, 15, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[19].setRotationPoint(32F, -30F, 0F);

		barrelModel[20].addShapeBox(12F, 2F, -2F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		barrelModel[20].setRotationPoint(32F, -30F, 0F);

		barrelModel[21].addShapeBox(40F, 0.5F, -1.5F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[21].setRotationPoint(32F, -30F, 0F);

		barrelModel[22].addShapeBox(40F, -0.5F, -1.5F, 25, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[22].setRotationPoint(32F, -30F, 0F);

		barrelModel[23].addShapeBox(40F, 1.5F, -1.5F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		barrelModel[23].setRotationPoint(32F, -30F, 0F);

		barrelModel[24].addShapeBox(37F, 0F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[24].setRotationPoint(32F, -30F, 0F);

		barrelModel[25].addShapeBox(37F, 2F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		barrelModel[25].setRotationPoint(32F, -30F, 0F);

		barrelModel[26].addShapeBox(37F, -1F, -2F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[26].setRotationPoint(32F, -30F, 0F);

		barrelModel[27].addShapeBox(28F, -0.5F, -2F, 8, 2, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 6
		barrelModel[27].setRotationPoint(32F, -30F, 0F);

		barrelModel[28].addShapeBox(28F, -2.5F, -2F, 8, 1, 4, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 6
		barrelModel[28].setRotationPoint(32F, -30F, 0F);

		barrelModel[29].addShapeBox(28F, 2.5F, -2F, 8, 1, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 6
		barrelModel[29].setRotationPoint(32F, -30F, 0F);

		barrelModel[30].addShapeBox(27F, -2.5F, -2F, 1, 1, 4, 0F,0F, -1.5F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.5F, -1F, 0F, 1.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0F); // Box 6
		barrelModel[30].setRotationPoint(32F, -30F, 0F);

		barrelModel[31].addShapeBox(27F, -0.5F, -2F, 1, 2, 4, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F); // Box 6
		barrelModel[31].setRotationPoint(32F, -30F, 0F);

		barrelModel[32].addShapeBox(27F, 2.5F, -2F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -1F); // Box 6
		barrelModel[32].setRotationPoint(32F, -30F, 0F);

		barrelModel[33].addShapeBox(36F, 2.5F, -2F, 1, 1, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.25F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.25F, -0.75F); // Box 6
		barrelModel[33].setRotationPoint(32F, -30F, 0F);

		barrelModel[34].addShapeBox(36F, -0.5F, -2F, 1, 2, 4, 0F,0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 6
		barrelModel[34].setRotationPoint(32F, -30F, 0F);

		barrelModel[35].addShapeBox(36F, -2.5F, -2F, 1, 1, 4, 0F,0F, -0.25F, -0.75F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, -0.25F, -0.75F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0.5F); // Box 6
		barrelModel[35].setRotationPoint(32F, -30F, 0F);

		barrelModel[36].addShapeBox(65F, 1F, -2F, 4, 2, 4, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F); // Box 6
		barrelModel[36].setRotationPoint(32F, -30F, 0F);

		barrelModel[37].addShapeBox(7F, -4F, -8F, 4, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[37].setRotationPoint(32F, -30F, 0F);

		barrelModel[38].addShapeBox(-11F, -6F, -2F, 14, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[38].setRotationPoint(-25F, -49F, -2F);

		barrelModel[39].addShapeBox(3F, -5.5F, -1F, 6, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 6
		barrelModel[39].setRotationPoint(-25F, -49F, -2F);

		barrelModel[40].addShapeBox(15F, -4.5F, -0.5F, 10, 1, 1, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 6
		barrelModel[40].setRotationPoint(-25F, -49F, -2F);

		barrelModel[41].addShapeBox(-13F, -7F, 2F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[41].setRotationPoint(-25F, -49F, -2F);

		barrelModel[42].addShapeBox(-13F, -7F, -3F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[42].setRotationPoint(-25F, -49F, -2F);

		barrelModel[43].addShapeBox(3F, -2F, 2.5F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[43].setRotationPoint(-25F, -49F, -2F);

		barrelModel[44].addShapeBox(3F, -2F, -3.5F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[44].setRotationPoint(-25F, -49F, -2F);

		barrelModel[45].addShapeBox(2F, 0.5F, -1.5F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[45].setRotationPoint(-25F, -49F, -2F);

		barrelModel[46].addShapeBox(4F, -0.25F, 1.25F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[46].setRotationPoint(-25F, -49F, -2F);

		barrelModel[47].addShapeBox(-12F, -6F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 6
		barrelModel[47].setRotationPoint(-25F, -49F, -2F);

		barrelModel[48].addShapeBox(-12F, -3F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 6
		barrelModel[48].setRotationPoint(-25F, -49F, -2F);

		barrelModel[49].addShapeBox(-12F, -3F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 6
		barrelModel[49].setRotationPoint(-25F, -49F, -2F);

		barrelModel[50].addShapeBox(-12F, -6F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 6
		barrelModel[50].setRotationPoint(-25F, -49F, -2F);

		barrelModel[51].addShapeBox(-1.5F, -1.5F, -5F, 3, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[51].setRotationPoint(-25F, -49F, -2F);

		barrelModel[52].addShapeBox(3F, -4.5F, -1F, 6, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 6
		barrelModel[52].setRotationPoint(-25F, -49F, -2F);

		barrelModel[53].addShapeBox(3F, -3.5F, -1F, 6, 1, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 6
		barrelModel[53].setRotationPoint(-25F, -49F, -2F);

		barrelModel[54].addShapeBox(9F, -4.5F, -0.5F, 2, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.15F, 0.15F); // Box 6
		barrelModel[54].setRotationPoint(-25F, -49F, -2F);

		barrelModel[55].addShapeBox(2F, 2.5F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		barrelModel[55].setRotationPoint(-25F, -49F, -2F);

		barrelModel[56].addShapeBox(2F, 1.5F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[56].setRotationPoint(-25F, -49F, -2F);

		barrelModel[57].addShapeBox(4F, -0.5F, -2.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[57].setRotationPoint(-25F, -49F, -2F);

		barrelModel[58].addShapeBox(2F, -2F, 2.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[58].setRotationPoint(-25F, -49F, -2F);

		barrelModel[59].addShapeBox(-1.5F, 0.5F, -5F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		barrelModel[59].setRotationPoint(-25F, -49F, -2F);

		barrelModel[60].addShapeBox(-1.5F, -0.5F, -5F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[60].setRotationPoint(-25F, -49F, -2F);

		barrelModel[61].addShapeBox(2F, -2F, -3.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[61].setRotationPoint(-25F, -49F, -2F);

		barrelModel[62].addShapeBox(1.5F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[62].setRotationPoint(-25F, -49F, -2F);

		barrelModel[63].addShapeBox(1.5F, -0.5F, 0.5F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 6
		barrelModel[63].setRotationPoint(-25F, -49F, -2F);

		barrelModel[64].addShapeBox(1.5F, -0.5F, -1.5F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[64].setRotationPoint(-25F, -49F, -2F);

		barrelModel[65].addShapeBox(-2F, -1F, -2.5F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[65].setRotationPoint(-25F, -49F, -2F);

		barrelModel[66].addShapeBox(-2F, -2F, -2.5F, 4, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[66].setRotationPoint(-25F, -49F, -2F);

		barrelModel[67].addShapeBox(-2F, 1F, -2.5F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		barrelModel[67].setRotationPoint(-25F, -49F, -2F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 6
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 529, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 793, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 897, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 6
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 6
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 6
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 6
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 6
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 553, 25, textureX, textureY); // Box 6
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 529, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 569, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 769, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 6
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 6
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 6
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 553, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 841, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 577, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 6
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 6
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 561, 161, textureX, textureY); // Box 6
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 6
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Box 6

		leftTrackWheelModels[0].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[0].setRotationPoint(57.2F, -7.5F, 24F);

		leftTrackWheelModels[1].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[1].setRotationPoint(57.2F, -7.5F, 24F);

		leftTrackWheelModels[2].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 6
		leftTrackWheelModels[2].setRotationPoint(57.2F, -7.5F, 24F);

		leftTrackWheelModels[3].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[3].setRotationPoint(40.5F, 2F, 25F);

		leftTrackWheelModels[4].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[4].setRotationPoint(40.5F, 2F, 25F);

		leftTrackWheelModels[5].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		leftTrackWheelModels[5].setRotationPoint(40.5F, 2F, 25F);

		leftTrackWheelModels[6].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[6].setRotationPoint(40.5F, 2F, 24F);

		leftTrackWheelModels[7].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[7].setRotationPoint(40.5F, 2F, 24F);

		leftTrackWheelModels[8].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[8].setRotationPoint(40.5F, 2F, 24F);

		leftTrackWheelModels[9].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[9].setRotationPoint(40.5F, 2F, 24F);

		leftTrackWheelModels[10].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		leftTrackWheelModels[10].setRotationPoint(40.5F, 2F, 24F);

		leftTrackWheelModels[11].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		leftTrackWheelModels[11].setRotationPoint(40.5F, 2F, 24F);

		leftTrackWheelModels[12].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[12].setRotationPoint(40.5F, 2F, 24F);

		leftTrackWheelModels[13].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[13].setRotationPoint(40.5F, 2F, 24F);

		leftTrackWheelModels[14].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[14].setRotationPoint(40.5F, 2F, 23F);

		leftTrackWheelModels[15].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[15].setRotationPoint(25.5F, 2F, 23F);

		leftTrackWheelModels[16].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[16].setRotationPoint(25.5F, 2F, 25F);

		leftTrackWheelModels[17].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[17].setRotationPoint(25.5F, 2F, 25F);

		leftTrackWheelModels[18].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		leftTrackWheelModels[18].setRotationPoint(25.5F, 2F, 25F);

		leftTrackWheelModels[19].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[19].setRotationPoint(25.5F, 2F, 24F);

		leftTrackWheelModels[20].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		leftTrackWheelModels[20].setRotationPoint(25.5F, 2F, 24F);

		leftTrackWheelModels[21].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[21].setRotationPoint(25.5F, 2F, 24F);

		leftTrackWheelModels[22].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		leftTrackWheelModels[22].setRotationPoint(25.5F, 2F, 24F);

		leftTrackWheelModels[23].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[23].setRotationPoint(25.5F, 2F, 24F);

		leftTrackWheelModels[24].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[24].setRotationPoint(25.5F, 2F, 24F);

		leftTrackWheelModels[25].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[25].setRotationPoint(25.5F, 2F, 24F);

		leftTrackWheelModels[26].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[26].setRotationPoint(25.5F, 2F, 24F);

		leftTrackWheelModels[27].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[27].setRotationPoint(10.5F, 2F, 23F);

		leftTrackWheelModels[28].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[28].setRotationPoint(10.5F, 2F, 25F);

		leftTrackWheelModels[29].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[29].setRotationPoint(10.5F, 2F, 25F);

		leftTrackWheelModels[30].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		leftTrackWheelModels[30].setRotationPoint(10.5F, 2F, 25F);

		leftTrackWheelModels[31].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[31].setRotationPoint(10.5F, 2F, 24F);

		leftTrackWheelModels[32].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		leftTrackWheelModels[32].setRotationPoint(10.5F, 2F, 24F);

		leftTrackWheelModels[33].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[33].setRotationPoint(10.5F, 2F, 24F);

		leftTrackWheelModels[34].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		leftTrackWheelModels[34].setRotationPoint(10.5F, 2F, 24F);

		leftTrackWheelModels[35].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[35].setRotationPoint(10.5F, 2F, 24F);

		leftTrackWheelModels[36].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[36].setRotationPoint(10.5F, 2F, 24F);

		leftTrackWheelModels[37].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[37].setRotationPoint(10.5F, 2F, 24F);

		leftTrackWheelModels[38].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[38].setRotationPoint(10.5F, 2F, 24F);

		leftTrackWheelModels[39].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[39].setRotationPoint(-4.5F, 2F, 23F);

		leftTrackWheelModels[40].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[40].setRotationPoint(-4.5F, 2F, 25F);

		leftTrackWheelModels[41].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[41].setRotationPoint(-4.5F, 2F, 25F);

		leftTrackWheelModels[42].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		leftTrackWheelModels[42].setRotationPoint(-4.5F, 2F, 25F);

		leftTrackWheelModels[43].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[43].setRotationPoint(-4.5F, 2F, 24F);

		leftTrackWheelModels[44].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		leftTrackWheelModels[44].setRotationPoint(-4.5F, 2F, 24F);

		leftTrackWheelModels[45].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[45].setRotationPoint(-4.5F, 2F, 24F);

		leftTrackWheelModels[46].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		leftTrackWheelModels[46].setRotationPoint(-4.5F, 2F, 24F);

		leftTrackWheelModels[47].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[47].setRotationPoint(-4.5F, 2F, 24F);

		leftTrackWheelModels[48].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[48].setRotationPoint(-4.5F, 2F, 24F);

		leftTrackWheelModels[49].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[49].setRotationPoint(-4.5F, 2F, 24F);

		leftTrackWheelModels[50].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[50].setRotationPoint(-4.5F, 2F, 24F);

		leftTrackWheelModels[51].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[51].setRotationPoint(-19.5F, 2F, 23F);

		leftTrackWheelModels[52].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[52].setRotationPoint(-19.5F, 2F, 25F);

		leftTrackWheelModels[53].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[53].setRotationPoint(-19.5F, 2F, 25F);

		leftTrackWheelModels[54].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		leftTrackWheelModels[54].setRotationPoint(-19.5F, 2F, 25F);

		leftTrackWheelModels[55].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[55].setRotationPoint(-19.5F, 2F, 24F);

		leftTrackWheelModels[56].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		leftTrackWheelModels[56].setRotationPoint(-19.5F, 2F, 24F);

		leftTrackWheelModels[57].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[57].setRotationPoint(-19.5F, 2F, 24F);

		leftTrackWheelModels[58].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		leftTrackWheelModels[58].setRotationPoint(-19.5F, 2F, 24F);

		leftTrackWheelModels[59].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[59].setRotationPoint(-19.5F, 2F, 24F);

		leftTrackWheelModels[60].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[60].setRotationPoint(-19.5F, 2F, 24F);

		leftTrackWheelModels[61].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[61].setRotationPoint(-19.5F, 2F, 24F);

		leftTrackWheelModels[62].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[62].setRotationPoint(-19.5F, 2F, 24F);

		leftTrackWheelModels[63].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[63].setRotationPoint(-34.5F, 2F, 23F);

		leftTrackWheelModels[64].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[64].setRotationPoint(-34.5F, 2F, 25F);

		leftTrackWheelModels[65].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[65].setRotationPoint(-34.5F, 2F, 25F);

		leftTrackWheelModels[66].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		leftTrackWheelModels[66].setRotationPoint(-34.5F, 2F, 25F);

		leftTrackWheelModels[67].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[67].setRotationPoint(-34.5F, 2F, 24F);

		leftTrackWheelModels[68].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		leftTrackWheelModels[68].setRotationPoint(-34.5F, 2F, 24F);

		leftTrackWheelModels[69].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[69].setRotationPoint(-34.5F, 2F, 24F);

		leftTrackWheelModels[70].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		leftTrackWheelModels[70].setRotationPoint(-34.5F, 2F, 24F);

		leftTrackWheelModels[71].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[71].setRotationPoint(-34.5F, 2F, 24F);

		leftTrackWheelModels[72].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[72].setRotationPoint(-34.5F, 2F, 24F);

		leftTrackWheelModels[73].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[73].setRotationPoint(-34.5F, 2F, 24F);

		leftTrackWheelModels[74].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[74].setRotationPoint(-34.5F, 2F, 24F);

		leftTrackWheelModels[75].addShapeBox(-1F, -1F, 1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[75].setRotationPoint(-49.5F, 2F, 23F);

		leftTrackWheelModels[76].addShapeBox(-6F, -3F, 0F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[76].setRotationPoint(-49.5F, 2F, 25F);

		leftTrackWheelModels[77].addShapeBox(-6F, -6F, 0F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[77].setRotationPoint(-49.5F, 2F, 25F);

		leftTrackWheelModels[78].addShapeBox(-6F, 3F, 0F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		leftTrackWheelModels[78].setRotationPoint(-49.5F, 2F, 25F);

		leftTrackWheelModels[79].addShapeBox(-3F, 6F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[79].setRotationPoint(-49.5F, 2F, 24F);

		leftTrackWheelModels[80].addShapeBox(-7F, 6F, 0F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		leftTrackWheelModels[80].setRotationPoint(-49.5F, 2F, 24F);

		leftTrackWheelModels[81].addShapeBox(-7F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[81].setRotationPoint(-49.5F, 2F, 24F);

		leftTrackWheelModels[82].addShapeBox(-7F, -7F, 0F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		leftTrackWheelModels[82].setRotationPoint(-49.5F, 2F, 24F);

		leftTrackWheelModels[83].addShapeBox(-3F, -7F, 0F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[83].setRotationPoint(-49.5F, 2F, 24F);

		leftTrackWheelModels[84].addShapeBox(3F, -7F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[84].setRotationPoint(-49.5F, 2F, 24F);

		leftTrackWheelModels[85].addShapeBox(6F, -3F, 0F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[85].setRotationPoint(-49.5F, 2F, 24F);

		leftTrackWheelModels[86].addShapeBox(3F, 6F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[86].setRotationPoint(-49.5F, 2F, 24F);

		leftTrackWheelModels[87].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 6
		leftTrackWheelModels[87].setRotationPoint(-64F, -9F, 24F);

		leftTrackWheelModels[88].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[88].setRotationPoint(-64F, -9F, 24F);

		leftTrackWheelModels[89].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[89].setRotationPoint(-64F, -9F, 24F);

		leftTrackWheelModels[90].addShapeBox(-1F, -1F, -8F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[90].setRotationPoint(25.5F, 2F, -24F);

		leftTrackWheelModels[91].addShapeBox(-6F, -6F, -9F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[91].setRotationPoint(-49.5F, 2F, -22F);

		leftTrackWheelModels[92].addShapeBox(-6F, -2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[92].setRotationPoint(57.2F, -7.5F, -32F);

		leftTrackWheelModels[93].addShapeBox(-6F, -6F, 0F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackWheelModels[93].setRotationPoint(57.2F, -7.5F, -32F);

		leftTrackWheelModels[94].addShapeBox(-6F, 2F, 0F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 6
		leftTrackWheelModels[94].setRotationPoint(57.2F, -7.5F, -32F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 785, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 825, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 977, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 513, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 697, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 793, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 825, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 929, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 969, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 585, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 625, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 745, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 993, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 769, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 793, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 913, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 633, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 6

		rightTrackWheelModels[0].addShapeBox(-6F, -3F, -9F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[0].setRotationPoint(40.5F, 2F, -22F);

		rightTrackWheelModels[1].addShapeBox(-6F, -6F, -9F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[1].setRotationPoint(40.5F, 2F, -22F);

		rightTrackWheelModels[2].addShapeBox(-6F, 3F, -9F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		rightTrackWheelModels[2].setRotationPoint(40.5F, 2F, -22F);

		rightTrackWheelModels[3].addShapeBox(-3F, -7F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[3].setRotationPoint(40.5F, 2F, -23F);

		rightTrackWheelModels[4].addShapeBox(-3F, 6F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[4].setRotationPoint(40.5F, 2F, -23F);

		rightTrackWheelModels[5].addShapeBox(-7F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[5].setRotationPoint(40.5F, 2F, -23F);

		rightTrackWheelModels[6].addShapeBox(6F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[6].setRotationPoint(40.5F, 2F, -23F);

		rightTrackWheelModels[7].addShapeBox(-7F, -7F, -9F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		rightTrackWheelModels[7].setRotationPoint(40.5F, 2F, -23F);

		rightTrackWheelModels[8].addShapeBox(-7F, 6F, -9F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		rightTrackWheelModels[8].setRotationPoint(40.5F, 2F, -23F);

		rightTrackWheelModels[9].addShapeBox(3F, 6F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[9].setRotationPoint(40.5F, 2F, -23F);

		rightTrackWheelModels[10].addShapeBox(3F, -7F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[10].setRotationPoint(40.5F, 2F, -23F);

		rightTrackWheelModels[11].addShapeBox(-1F, -1F, -8F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[11].setRotationPoint(40.5F, 2F, -24F);

		rightTrackWheelModels[12].addShapeBox(-6F, -3F, -9F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[12].setRotationPoint(25.5F, 2F, -22F);

		rightTrackWheelModels[13].addShapeBox(-6F, -6F, -9F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[13].setRotationPoint(25.5F, 2F, -22F);

		rightTrackWheelModels[14].addShapeBox(-6F, 3F, -9F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		rightTrackWheelModels[14].setRotationPoint(25.5F, 2F, -22F);

		rightTrackWheelModels[15].addShapeBox(-3F, 6F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[15].setRotationPoint(25.5F, 2F, -23F);

		rightTrackWheelModels[16].addShapeBox(-7F, 6F, -9F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		rightTrackWheelModels[16].setRotationPoint(25.5F, 2F, -23F);

		rightTrackWheelModels[17].addShapeBox(-7F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[17].setRotationPoint(25.5F, 2F, -23F);

		rightTrackWheelModels[18].addShapeBox(-7F, -7F, -9F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		rightTrackWheelModels[18].setRotationPoint(25.5F, 2F, -23F);

		rightTrackWheelModels[19].addShapeBox(-3F, -7F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[19].setRotationPoint(25.5F, 2F, -23F);

		rightTrackWheelModels[20].addShapeBox(3F, -7F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[20].setRotationPoint(25.5F, 2F, -23F);

		rightTrackWheelModels[21].addShapeBox(6F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[21].setRotationPoint(25.5F, 2F, -23F);

		rightTrackWheelModels[22].addShapeBox(3F, 6F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[22].setRotationPoint(25.5F, 2F, -23F);

		rightTrackWheelModels[23].addShapeBox(-1F, -1F, -8F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[23].setRotationPoint(10.5F, 2F, -24F);

		rightTrackWheelModels[24].addShapeBox(-6F, -3F, -9F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[24].setRotationPoint(10.5F, 2F, -22F);

		rightTrackWheelModels[25].addShapeBox(-6F, -6F, -9F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[25].setRotationPoint(10.5F, 2F, -22F);

		rightTrackWheelModels[26].addShapeBox(-6F, 3F, -9F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		rightTrackWheelModels[26].setRotationPoint(10.5F, 2F, -22F);

		rightTrackWheelModels[27].addShapeBox(-3F, 6F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[27].setRotationPoint(10.5F, 2F, -23F);

		rightTrackWheelModels[28].addShapeBox(-7F, 6F, -9F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		rightTrackWheelModels[28].setRotationPoint(10.5F, 2F, -23F);

		rightTrackWheelModels[29].addShapeBox(-7F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[29].setRotationPoint(10.5F, 2F, -23F);

		rightTrackWheelModels[30].addShapeBox(-7F, -7F, -9F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		rightTrackWheelModels[30].setRotationPoint(10.5F, 2F, -23F);

		rightTrackWheelModels[31].addShapeBox(-3F, -7F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[31].setRotationPoint(10.5F, 2F, -23F);

		rightTrackWheelModels[32].addShapeBox(3F, -7F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[32].setRotationPoint(10.5F, 2F, -23F);

		rightTrackWheelModels[33].addShapeBox(6F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[33].setRotationPoint(10.5F, 2F, -23F);

		rightTrackWheelModels[34].addShapeBox(3F, 6F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[34].setRotationPoint(10.5F, 2F, -23F);

		rightTrackWheelModels[35].addShapeBox(-1F, -1F, -8F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[35].setRotationPoint(-4.5F, 2F, -24F);

		rightTrackWheelModels[36].addShapeBox(-6F, -3F, -9F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[36].setRotationPoint(-4.5F, 2F, -22F);

		rightTrackWheelModels[37].addShapeBox(-6F, -6F, -9F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[37].setRotationPoint(-4.5F, 2F, -22F);

		rightTrackWheelModels[38].addShapeBox(-6F, 3F, -9F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		rightTrackWheelModels[38].setRotationPoint(-4.5F, 2F, -22F);

		rightTrackWheelModels[39].addShapeBox(-3F, 6F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[39].setRotationPoint(-4.5F, 2F, -23F);

		rightTrackWheelModels[40].addShapeBox(-7F, 6F, -9F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		rightTrackWheelModels[40].setRotationPoint(-4.5F, 2F, -23F);

		rightTrackWheelModels[41].addShapeBox(-7F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[41].setRotationPoint(-4.5F, 2F, -23F);

		rightTrackWheelModels[42].addShapeBox(-7F, -7F, -9F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		rightTrackWheelModels[42].setRotationPoint(-4.5F, 2F, -23F);

		rightTrackWheelModels[43].addShapeBox(-3F, -7F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[43].setRotationPoint(-4.5F, 2F, -23F);

		rightTrackWheelModels[44].addShapeBox(3F, -7F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[44].setRotationPoint(-4.5F, 2F, -23F);

		rightTrackWheelModels[45].addShapeBox(6F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[45].setRotationPoint(-4.5F, 2F, -23F);

		rightTrackWheelModels[46].addShapeBox(3F, 6F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[46].setRotationPoint(-4.5F, 2F, -23F);

		rightTrackWheelModels[47].addShapeBox(-1F, -1F, -8F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[47].setRotationPoint(-19.5F, 2F, -24F);

		rightTrackWheelModels[48].addShapeBox(-6F, -3F, -9F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[48].setRotationPoint(-19.5F, 2F, -22F);

		rightTrackWheelModels[49].addShapeBox(-6F, -6F, -9F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[49].setRotationPoint(-19.5F, 2F, -22F);

		rightTrackWheelModels[50].addShapeBox(-6F, 3F, -9F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		rightTrackWheelModels[50].setRotationPoint(-19.5F, 2F, -22F);

		rightTrackWheelModels[51].addShapeBox(-3F, 6F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[51].setRotationPoint(-19.5F, 2F, -23F);

		rightTrackWheelModels[52].addShapeBox(-7F, 6F, -9F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		rightTrackWheelModels[52].setRotationPoint(-19.5F, 2F, -23F);

		rightTrackWheelModels[53].addShapeBox(-7F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[53].setRotationPoint(-19.5F, 2F, -23F);

		rightTrackWheelModels[54].addShapeBox(-7F, -7F, -9F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		rightTrackWheelModels[54].setRotationPoint(-19.5F, 2F, -23F);

		rightTrackWheelModels[55].addShapeBox(-3F, -7F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[55].setRotationPoint(-19.5F, 2F, -23F);

		rightTrackWheelModels[56].addShapeBox(3F, -7F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[56].setRotationPoint(-19.5F, 2F, -23F);

		rightTrackWheelModels[57].addShapeBox(6F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[57].setRotationPoint(-19.5F, 2F, -23F);

		rightTrackWheelModels[58].addShapeBox(3F, 6F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[58].setRotationPoint(-19.5F, 2F, -23F);

		rightTrackWheelModels[59].addShapeBox(-1F, -1F, -8F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[59].setRotationPoint(-34.5F, 2F, -24F);

		rightTrackWheelModels[60].addShapeBox(-6F, -3F, -9F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[60].setRotationPoint(-34.5F, 2F, -22F);

		rightTrackWheelModels[61].addShapeBox(-6F, -6F, -9F, 12, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[61].setRotationPoint(-34.5F, 2F, -22F);

		rightTrackWheelModels[62].addShapeBox(-6F, 3F, -9F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		rightTrackWheelModels[62].setRotationPoint(-34.5F, 2F, -22F);

		rightTrackWheelModels[63].addShapeBox(-3F, 6F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[63].setRotationPoint(-34.5F, 2F, -23F);

		rightTrackWheelModels[64].addShapeBox(-7F, 6F, -9F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		rightTrackWheelModels[64].setRotationPoint(-34.5F, 2F, -23F);

		rightTrackWheelModels[65].addShapeBox(-7F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[65].setRotationPoint(-34.5F, 2F, -23F);

		rightTrackWheelModels[66].addShapeBox(-7F, -7F, -9F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		rightTrackWheelModels[66].setRotationPoint(-34.5F, 2F, -23F);

		rightTrackWheelModels[67].addShapeBox(-3F, -7F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[67].setRotationPoint(-34.5F, 2F, -23F);

		rightTrackWheelModels[68].addShapeBox(3F, -7F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[68].setRotationPoint(-34.5F, 2F, -23F);

		rightTrackWheelModels[69].addShapeBox(6F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[69].setRotationPoint(-34.5F, 2F, -23F);

		rightTrackWheelModels[70].addShapeBox(3F, 6F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[70].setRotationPoint(-34.5F, 2F, -23F);

		rightTrackWheelModels[71].addShapeBox(-1F, -1F, -8F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[71].setRotationPoint(-49.5F, 2F, -24F);

		rightTrackWheelModels[72].addShapeBox(-6F, -3F, -9F, 12, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[72].setRotationPoint(-49.5F, 2F, -22F);

		rightTrackWheelModels[73].addShapeBox(-6F, 3F, -9F, 12, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 6
		rightTrackWheelModels[73].setRotationPoint(-49.5F, 2F, -22F);

		rightTrackWheelModels[74].addShapeBox(-3F, 6F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[74].setRotationPoint(-49.5F, 2F, -23F);

		rightTrackWheelModels[75].addShapeBox(-7F, 6F, -9F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 6
		rightTrackWheelModels[75].setRotationPoint(-49.5F, 2F, -23F);

		rightTrackWheelModels[76].addShapeBox(-7F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[76].setRotationPoint(-49.5F, 2F, -23F);

		rightTrackWheelModels[77].addShapeBox(-7F, -7F, -9F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 6
		rightTrackWheelModels[77].setRotationPoint(-49.5F, 2F, -23F);

		rightTrackWheelModels[78].addShapeBox(-3F, -7F, -9F, 6, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[78].setRotationPoint(-49.5F, 2F, -23F);

		rightTrackWheelModels[79].addShapeBox(3F, -7F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[79].setRotationPoint(-49.5F, 2F, -23F);

		rightTrackWheelModels[80].addShapeBox(6F, -3F, -9F, 1, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[80].setRotationPoint(-49.5F, 2F, -23F);

		rightTrackWheelModels[81].addShapeBox(3F, 6F, -9F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[81].setRotationPoint(-49.5F, 2F, -23F);

		rightTrackWheelModels[82].addShapeBox(-6F, 2F, -9F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 6
		rightTrackWheelModels[82].setRotationPoint(-64F, -9F, -23F);

		rightTrackWheelModels[83].addShapeBox(-6F, -2F, -9F, 12, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[83].setRotationPoint(-64F, -9F, -23F);

		rightTrackWheelModels[84].addShapeBox(-6F, -6F, -9F, 12, 4, 8, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackWheelModels[84].setRotationPoint(-64F, -9F, -23F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 6
		leftTrackModel[1] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 6
		leftTrackModel[2] = new ModelRendererTurbo(this, 785, 89, textureX, textureY); // Box 6
		leftTrackModel[3] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 6
		leftTrackModel[4] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 6
		leftTrackModel[5] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 6
		leftTrackModel[6] = new ModelRendererTurbo(this, 985, 89, textureX, textureY); // Box 6
		leftTrackModel[7] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 6

		leftTrackModel[0].addShapeBox(-5F, 0F, 0F, 7, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[0].setRotationPoint(62.7F, -12.1F, 21F);
		leftTrackModel[0].rotateAngleZ = -0.6981317F;

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[1].setRotationPoint(64.3F, -10.7F, 21F);
		leftTrackModel[1].rotateAngleZ = -1.57079633F;

		leftTrackModel[2].addShapeBox(5F, 0F, 0F, 24, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[2].setRotationPoint(68.3F, -7.6F, 21F);
		leftTrackModel[2].rotateAngleZ = -2.51327412F;

		leftTrackModel[3].addShapeBox(0F, 0F, 0F, 98, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[3].setRotationPoint(44.8F, 9.6F, 21F);
		leftTrackModel[3].rotateAngleZ = -3.14159265F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 24, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[4].setRotationPoint(-53.2F, 9.68F, 21F);
		leftTrackModel[4].rotateAngleZ = -3.89208423F;

		leftTrackModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[5].setRotationPoint(-70.75F, -6.62F, 21F);
		leftTrackModel[5].rotateAngleZ = -4.71238898F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[6].setRotationPoint(-70.75F, -11.62F, 21F);
		leftTrackModel[6].rotateAngleZ = -5.44542727F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 126, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		leftTrackModel[7].setRotationPoint(-67.15F, -15.3F, 21F);
		leftTrackModel[7].rotateAngleZ = -6.28318531F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 6
		rightTrackModel[1] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 6
		rightTrackModel[2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 6
		rightTrackModel[3] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 6
		rightTrackModel[4] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 6
		rightTrackModel[5] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 6
		rightTrackModel[6] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 6
		rightTrackModel[7] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 6

		rightTrackModel[0].addShapeBox(-5F, 0F, -13F, 7, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[0].setRotationPoint(62.7F, -12.1F, -21F);
		rightTrackModel[0].rotateAngleZ = -0.6981317F;

		rightTrackModel[1].addShapeBox(0F, 0F, -13F, 6, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[1].setRotationPoint(64.3F, -10.7F, -21F);
		rightTrackModel[1].rotateAngleZ = -1.57079633F;

		rightTrackModel[2].addShapeBox(5F, 0F, -13F, 24, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[2].setRotationPoint(68.3F, -7.6F, -21F);
		rightTrackModel[2].rotateAngleZ = -2.51327412F;

		rightTrackModel[3].addShapeBox(0F, 0F, -13F, 98, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[3].setRotationPoint(44.8F, 9.6F, -21F);
		rightTrackModel[3].rotateAngleZ = -3.14159265F;

		rightTrackModel[4].addShapeBox(0F, 0F, -13F, 24, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[4].setRotationPoint(-53.2F, 9.68F, -21F);
		rightTrackModel[4].rotateAngleZ = -3.89208423F;

		rightTrackModel[5].addShapeBox(0F, 0F, -13F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[5].setRotationPoint(-70.75F, -6.62F, -21F);
		rightTrackModel[5].rotateAngleZ = -4.71238898F;

		rightTrackModel[6].addShapeBox(0F, 0F, -13F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[6].setRotationPoint(-70.75F, -11.62F, -21F);
		rightTrackModel[6].rotateAngleZ = -5.44542727F;

		rightTrackModel[7].addShapeBox(0F, 0F, -13F, 126, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		rightTrackModel[7].setRotationPoint(-67.15F, -15.3F, -21F);
		rightTrackModel[7].rotateAngleZ = -6.28318531F;
	}
}