//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Manuever Combat Vehicle
// Model Creator: 
// Created on: 05.06.2015 - 14:22:17
// Last changed on: 05.06.2015 - 14:22:17

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMCVelite extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelMCVelite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[131];
		turretModel = new ModelRendererTurbo[90];
		barrelModel = new ModelRendererTurbo[26];
		leftFrontWheelModel = new ModelRendererTurbo[28];
		rightFrontWheelModel = new ModelRendererTurbo[28];
		leftBackWheelModel = new ModelRendererTurbo[28];
		rightBackWheelModel = new ModelRendererTurbo[28];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 122
		bodyModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 122
		bodyModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 122
		bodyModel[3] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 122
		bodyModel[4] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 122
		bodyModel[5] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 122
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 122
		bodyModel[7] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 122
		bodyModel[8] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 122
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 122
		bodyModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 122
		bodyModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 122
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 122
		bodyModel[13] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 122
		bodyModel[14] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 122
		bodyModel[15] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 122
		bodyModel[16] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 122
		bodyModel[17] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 122
		bodyModel[18] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 122
		bodyModel[19] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 122
		bodyModel[20] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 122
		bodyModel[21] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 122
		bodyModel[22] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 122
		bodyModel[23] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 122
		bodyModel[24] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 122
		bodyModel[25] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 122
		bodyModel[26] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 122
		bodyModel[27] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 122
		bodyModel[28] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 122
		bodyModel[29] = new ModelRendererTurbo(this, 873, 49, textureX, textureY); // Box 122
		bodyModel[30] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 122
		bodyModel[31] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 122
		bodyModel[32] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 122
		bodyModel[33] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 122
		bodyModel[34] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 122
		bodyModel[35] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 122
		bodyModel[36] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 122
		bodyModel[37] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 122
		bodyModel[38] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 122
		bodyModel[39] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 122
		bodyModel[40] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 122
		bodyModel[41] = new ModelRendererTurbo(this, 609, 25, textureX, textureY); // Box 122
		bodyModel[42] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 122
		bodyModel[43] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Box 122
		bodyModel[44] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 122
		bodyModel[45] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 122
		bodyModel[46] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 122
		bodyModel[47] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 122
		bodyModel[48] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 122
		bodyModel[49] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 122
		bodyModel[50] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 122
		bodyModel[51] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 122
		bodyModel[52] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 122
		bodyModel[53] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 122
		bodyModel[54] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 122
		bodyModel[55] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 122
		bodyModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 122
		bodyModel[57] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 122
		bodyModel[58] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 122
		bodyModel[59] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 122
		bodyModel[60] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 122
		bodyModel[61] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 122
		bodyModel[62] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 122
		bodyModel[63] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 122
		bodyModel[64] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 122
		bodyModel[65] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 122
		bodyModel[66] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 122
		bodyModel[67] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 122
		bodyModel[68] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 122
		bodyModel[69] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 122
		bodyModel[70] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 122
		bodyModel[71] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 122
		bodyModel[72] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 122
		bodyModel[73] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 122
		bodyModel[74] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 122
		bodyModel[75] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 122
		bodyModel[76] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 122
		bodyModel[77] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 122
		bodyModel[78] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 122
		bodyModel[79] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 122
		bodyModel[80] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 122
		bodyModel[81] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 122
		bodyModel[82] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 122
		bodyModel[83] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 122
		bodyModel[84] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 122
		bodyModel[85] = new ModelRendererTurbo(this, 961, 137, textureX, textureY); // Box 122
		bodyModel[86] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 122
		bodyModel[87] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 122
		bodyModel[88] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 122
		bodyModel[89] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Box 122
		bodyModel[90] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 122
		bodyModel[91] = new ModelRendererTurbo(this, 609, 137, textureX, textureY); // Box 122
		bodyModel[92] = new ModelRendererTurbo(this, 753, 265, textureX, textureY); // Box 122
		bodyModel[93] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Box 122
		bodyModel[94] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 122
		bodyModel[95] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 122
		bodyModel[96] = new ModelRendererTurbo(this, 753, 281, textureX, textureY); // Box 122
		bodyModel[97] = new ModelRendererTurbo(this, 129, 289, textureX, textureY); // Box 122
		bodyModel[98] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Box 122
		bodyModel[99] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 122
		bodyModel[100] = new ModelRendererTurbo(this, 129, 305, textureX, textureY); // Box 122
		bodyModel[101] = new ModelRendererTurbo(this, 449, 313, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 641, 249, textureX, textureY); // Box 1
		bodyModel[103] = new ModelRendererTurbo(this, 881, 193, textureX, textureY); // Import Box586
		bodyModel[104] = new ModelRendererTurbo(this, 801, 193, textureX, textureY); // Import Box586
		bodyModel[105] = new ModelRendererTurbo(this, 961, 193, textureX, textureY); // Import Box586
		bodyModel[106] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box586
		bodyModel[107] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Import Box586
		bodyModel[108] = new ModelRendererTurbo(this, 513, 41, textureX, textureY); // Import Box586
		bodyModel[109] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import Box586
		bodyModel[110] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box586
		bodyModel[111] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box586
		bodyModel[112] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Import Box586
		bodyModel[113] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Box 13
		bodyModel[114] = new ModelRendererTurbo(this, 553, 273, textureX, textureY); // Box 19
		bodyModel[115] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 20
		bodyModel[116] = new ModelRendererTurbo(this, 953, 249, textureX, textureY); // Box 21
		bodyModel[117] = new ModelRendererTurbo(this, 737, 194, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 737, 194, textureX, textureY); // Box 4
		bodyModel[119] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 352
		bodyModel[120] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 353
		bodyModel[121] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 354
		bodyModel[122] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 355
		bodyModel[123] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 356
		bodyModel[124] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 357
		bodyModel[125] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 358
		bodyModel[126] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 359
		bodyModel[127] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 360
		bodyModel[128] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 361
		bodyModel[129] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 362
		bodyModel[130] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 363

		bodyModel[0].addShapeBox(0F, 0F, 0F, 48, 10, 40, 0F,0F, 0F, 0F, -5F, -10F, 0F, -5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[0].setRotationPoint(44F, -27F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 132, 3, 46, 0F,0F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[1].setRotationPoint(-55F, -5F, -23F);

		bodyModel[2].addShapeBox(-1F, 0F, 4F, 139, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[2].setRotationPoint(-54F, -17F, 17F);

		bodyModel[3].addShapeBox(0F, 0F, -1F, 84, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.825F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.825F, 0F, 0F); // Box 122
		bodyModel[3].setRotationPoint(-61F, -27F, 24F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 24, 46, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 122
		bodyModel[4].setRotationPoint(-59F, -27F, -23F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 76, 2, 46, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[5].setRotationPoint(-55F, -27F, -23F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 14, 12, 0F,0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -3F, 0F, 0F); // Box 122
		bodyModel[6].setRotationPoint(-59F, -17F, 23F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 16, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 122
		bodyModel[7].setRotationPoint(40F, -17F, 21F);

		bodyModel[8].addShapeBox(-1.5F, 0F, -1.5F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[8].setRotationPoint(60.5F, -19F, 23.5F);

		bodyModel[9].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 122
		bodyModel[9].setRotationPoint(63.5F, -4F, 16.5F);

		bodyModel[10].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 122
		bodyModel[10].setRotationPoint(58.5F, -4F, 16.5F);

		bodyModel[11].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 122
		bodyModel[11].setRotationPoint(27.5F, -4F, 16.5F);

		bodyModel[12].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 122
		bodyModel[12].setRotationPoint(32.5F, -4F, 16.5F);

		bodyModel[13].addShapeBox(-1.5F, 0F, -1.5F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[13].setRotationPoint(29.5F, -19F, 23.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[14].setRotationPoint(-54F, -19F, 20F);

		bodyModel[15].addShapeBox(0F, 0F, -4F, 16, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[15].setRotationPoint(-54F, -19F, -20F);

		bodyModel[16].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[16].setRotationPoint(-33F, -19F, -22.5F);
		bodyModel[16].rotateAngleZ = -0.26179939F;

		bodyModel[17].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[17].setRotationPoint(-2F, -19F, -22.5F);
		bodyModel[17].rotateAngleZ = -0.26179939F;

		bodyModel[18].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[18].setRotationPoint(-41F, -4F, -22.5F);

		bodyModel[19].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[19].setRotationPoint(-10F, -4F, -22.5F);

		bodyModel[20].addShapeBox(0F, 0F, -2F, 2, 3, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 122
		bodyModel[20].setRotationPoint(-5F, -4F, -19.5F);

		bodyModel[21].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[21].setRotationPoint(-41F, -4F, 22.5F);

		bodyModel[22].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[22].setRotationPoint(-33F, -19F, 22.5F);
		bodyModel[22].rotateAngleZ = -0.26179939F;

		bodyModel[23].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[23].setRotationPoint(-10F, -4F, 22.5F);

		bodyModel[24].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[24].setRotationPoint(-2F, -19F, 22.5F);
		bodyModel[24].rotateAngleZ = -0.26179939F;

		bodyModel[25].addShapeBox(0F, 0F, -1F, 2, 3, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 122
		bodyModel[25].setRotationPoint(-36F, -4F, -21.5F);

		bodyModel[26].addShapeBox(0F, 0F, -2F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[26].setRotationPoint(-9.5F, -1.5F, -20F);
		bodyModel[26].rotateAngleX = 0.06981317F;

		bodyModel[27].addShapeBox(0F, 0F, -17F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[27].setRotationPoint(-9.5F, -1.5F, 20F);
		bodyModel[27].rotateAngleX = -0.06981317F;

		bodyModel[28].addShapeBox(0F, 0F, -17F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[28].setRotationPoint(-40.5F, -1.5F, 20F);
		bodyModel[28].rotateAngleX = -0.06981317F;

		bodyModel[29].addShapeBox(0F, 0F, -6.5F, 5, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[29].setRotationPoint(-42.5F, -4F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, -6.5F, 5, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[30].setRotationPoint(-11.5F, -4F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, -4F, 23, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[31].setRotationPoint(-30F, -19F, -20F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 23, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[32].setRotationPoint(-30F, -19F, 20F);

		bodyModel[33].addShapeBox(0F, 0F, -4F, 8, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[33].setRotationPoint(0F, -19F, -20F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[34].setRotationPoint(0F, -19F, 20F);

		bodyModel[35].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[35].setRotationPoint(32.5F, -14F, 23.5F);

		bodyModel[36].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[36].setRotationPoint(63.5F, -14F, 23.5F);

		bodyModel[37].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[37].setRotationPoint(27.5F, -14F, 23.5F);

		bodyModel[38].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[38].setRotationPoint(58.5F, -14F, 23.5F);

		bodyModel[39].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[39].setRotationPoint(27.5F, 0F, 23.5F);

		bodyModel[40].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[40].setRotationPoint(58.5F, 0F, 23.5F);

		bodyModel[41].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[41].setRotationPoint(-4F, -2F, -26.5F);

		bodyModel[42].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[42].setRotationPoint(-35F, -2F, -26.5F);

		bodyModel[43].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[43].setRotationPoint(-4F, -2F, 24.5F);

		bodyModel[44].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[44].setRotationPoint(-35F, -2F, 24.5F);

		bodyModel[45].addShapeBox(-1.5F, 0F, -1.5F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[45].setRotationPoint(60.5F, -19F, -22.5F);

		bodyModel[46].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[46].setRotationPoint(63.5F, -14F, -21.5F);

		bodyModel[47].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[47].setRotationPoint(58.5F, -14F, -21.5F);

		bodyModel[48].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[48].setRotationPoint(32.5F, -14F, -21.5F);

		bodyModel[49].addShapeBox(-1.5F, 0F, -1.5F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[49].setRotationPoint(29.5F, -19F, -22.5F);

		bodyModel[50].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[50].setRotationPoint(27.5F, -14F, -21.5F);

		bodyModel[51].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[51].setRotationPoint(27.5F, 0F, -22.5F);

		bodyModel[52].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[52].setRotationPoint(58.5F, 0F, -22.5F);

		bodyModel[53].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 122
		bodyModel[53].setRotationPoint(63.5F, -4F, -14.5F);

		bodyModel[54].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 122
		bodyModel[54].setRotationPoint(58.5F, -4F, -14.5F);

		bodyModel[55].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 122
		bodyModel[55].setRotationPoint(32.5F, -4F, -14.5F);

		bodyModel[56].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 122
		bodyModel[56].setRotationPoint(27.5F, -4F, -14.5F);

		bodyModel[57].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[57].setRotationPoint(29F, -2F, 25.5F);

		bodyModel[58].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[58].setRotationPoint(29F, -2F, -26.5F);

		bodyModel[59].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[59].setRotationPoint(60F, -2F, 25.5F);

		bodyModel[60].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[60].setRotationPoint(60F, -2F, -26.5F);

		bodyModel[61].addShapeBox(0F, 0F, -2F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[61].setRotationPoint(-40.5F, -1.5F, -20F);
		bodyModel[61].rotateAngleX = 0.06981317F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 21, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[62].setRotationPoint(23F, -27F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, -14F, 16, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 122
		bodyModel[63].setRotationPoint(40F, -17F, -21F);

		bodyModel[64].addShapeBox(-1F, 0F, -6F, 139, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[64].setRotationPoint(-54F, -17F, -17F);

		bodyModel[65].addShapeBox(0F, 0F, 30F, 14, 6, 70, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F); // Box 122
		bodyModel[65].setRotationPoint(78F, -17F, -65F);

		bodyModel[66].addShapeBox(0F, 0F, -4F, 10, 6, 46, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F); // Box 122
		bodyModel[66].setRotationPoint(81F, -11F, -19F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 4, 70, 0F,0F, 0F, 0F, 5F, -1.5F, -11F, 5F, -1.5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -12F, 5F, 0F, -12F, 0F, 0F, 0F); // Box 122
		bodyModel[67].setRotationPoint(87F, -17F, -35F);

		bodyModel[68].addShapeBox(0F, -2F, -23F, 7, 4, 46, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[68].setRotationPoint(86F, -11F, 0F);

		bodyModel[69].addShapeBox(0F, 2F, -23F, 3, 4, 46, 0F,0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[69].setRotationPoint(86F, -11F, 0F);

		bodyModel[70].addShapeBox(1F, -2F, 23F, 6, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.675F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[70].setRotationPoint(86F, -11F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, -15F, 13, 14, 12, 0F,0.175F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.175F, 0F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F); // Box 122
		bodyModel[71].setRotationPoint(-59F, -17F, -20F);

		bodyModel[72].addShapeBox(0F, 0F, -16F, 84, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.825F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.825F, 0F, 0F); // Box 122
		bodyModel[72].setRotationPoint(-61F, -27F, -19F);

		bodyModel[73].addShapeBox(0F, 0F, -4F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[73].setRotationPoint(9F, -17F, -30.75F);

		bodyModel[74].addShapeBox(0F, 0F, -4F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[74].setRotationPoint(15F, -17F, -30.75F);

		bodyModel[75].addShapeBox(0F, 0F, -4F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[75].setRotationPoint(11.5F, -5F, -30.75F);

		bodyModel[76].addShapeBox(0F, 0F, -4F, 2, 1, 1, 0F,-1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F); // Box 122
		bodyModel[76].setRotationPoint(9F, -5F, -30.75F);

		bodyModel[77].addShapeBox(0F, 0F, -4F, 2, 1, 1, 0F,0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F); // Box 122
		bodyModel[77].setRotationPoint(14F, -5F, -30.75F);

		bodyModel[78].addShapeBox(0F, 0F, -4F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[78].setRotationPoint(10F, -11F, -30.75F);

		bodyModel[79].addShapeBox(0F, 0F, 3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[79].setRotationPoint(10F, -11F, 30.75F);

		bodyModel[80].addShapeBox(0F, 0F, 3F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[80].setRotationPoint(9F, -17F, 30.75F);

		bodyModel[81].addShapeBox(0F, 0F, 3F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[81].setRotationPoint(15F, -17F, 30.75F);

		bodyModel[82].addShapeBox(0F, 0F, 3F, 2, 1, 1, 0F,0.5F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F); // Box 122
		bodyModel[82].setRotationPoint(14F, -5F, 30.75F);

		bodyModel[83].addShapeBox(0F, 0F, 3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[83].setRotationPoint(11.5F, -5F, 30.75F);

		bodyModel[84].addShapeBox(0F, 0F, 3F, 2, 1, 1, 0F,-1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F); // Box 122
		bodyModel[84].setRotationPoint(9F, -5F, 30.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 6, 12, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, -3F, 0F, 0F); // Box 122
		bodyModel[85].setRotationPoint(81F, -11F, -35F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 6, 12, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, -2F, 0F, -2F, -2F, 0F); // Box 122
		bodyModel[86].setRotationPoint(81F, -11F, 23F);

		bodyModel[87].addShapeBox(0F, -2F, 23F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 2F, 0F, 0F, 2F); // Box 122
		bodyModel[87].setRotationPoint(86F, -11F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 25F, 4, 1, 1, 0F,0F, 0F, 0F, 1.325F, 0F, 0F, 0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[88].setRotationPoint(86F, -11F, 0F);

		bodyModel[89].addShapeBox(0F, -2F, -24F, 7, 4, 1, 0F,0F, -3F, 2F, -2.5F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3.5F, 0F, 2F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[89].setRotationPoint(86F, -11F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, -26F, 4, 1, 1, 0F,0F, 0F, 0F, 0.875F, 0F, 0F, 1.325F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[90].setRotationPoint(86F, -11F, 0F);

		bodyModel[91].addShapeBox(1F, -2F, -35F, 6, 2, 12, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1.675F, 0F, -2F, 0F, 0F, -2F); // Box 122
		bodyModel[91].setRotationPoint(86F, -11F, 0F);

		bodyModel[92].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[92].setRotationPoint(0F, -29F, 0F);

		bodyModel[93].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[93].setRotationPoint(0F, -29F, 0F);
		bodyModel[93].rotateAngleY = -0.34906585F;

		bodyModel[94].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[94].setRotationPoint(0F, -29F, 0F);
		bodyModel[94].rotateAngleY = -0.6981317F;

		bodyModel[95].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[95].setRotationPoint(0F, -29F, 0F);
		bodyModel[95].rotateAngleY = -1.04719755F;

		bodyModel[96].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[96].setRotationPoint(0F, -29F, 0F);
		bodyModel[96].rotateAngleY = -1.3962634F;

		bodyModel[97].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[97].setRotationPoint(0F, -29F, 0F);
		bodyModel[97].rotateAngleY = -1.74532925F;

		bodyModel[98].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[98].setRotationPoint(0F, -29F, 0F);
		bodyModel[98].rotateAngleY = -2.0943951F;

		bodyModel[99].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[99].setRotationPoint(0F, -29F, 0F);
		bodyModel[99].rotateAngleY = -2.44346095F;

		bodyModel[100].addShapeBox(-28F, 0F, -5F, 56, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[100].setRotationPoint(0F, -29F, 0F);
		bodyModel[100].rotateAngleY = -2.7925268F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 52, 10, 30, 0F,0F, 0F, 0F, -5F, -10F, 0F, -5F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[101].setRotationPoint(40F, -27F, -35F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[102].setRotationPoint(23F, -27F, -35F);

		bodyModel[103].addShapeBox(27F, 1.5F, 2F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box586
		bodyModel[103].setRotationPoint(21F, -27F, -28F);

		bodyModel[104].addShapeBox(26F, 0F, 2.5F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box586
		bodyModel[104].setRotationPoint(21F, -27F, -28F);

		bodyModel[105].addBox(22F, 0F, 2.5F, 4, 3, 12, 0F); // Import Box586
		bodyModel[105].setRotationPoint(21F, -27F, -28F);

		bodyModel[106].addShapeBox(19F, 0F, 2.5F, 3, 2, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box586
		bodyModel[106].setRotationPoint(21F, -27F, -28F);

		bodyModel[107].addShapeBox(24.5F, -0.3F, 6.5F, 2, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Import Box586
		bodyModel[107].setRotationPoint(21F, -27F, -28F);

		bodyModel[108].addBox(23.5F, -0.3F, 6.5F, 1, 1, 4, 0F); // Import Box586
		bodyModel[108].setRotationPoint(21F, -27F, -28F);

		bodyModel[109].addShapeBox(21.5F, -0.3F, 6.5F, 2, 1, 4, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import Box586
		bodyModel[109].setRotationPoint(21F, -27F, -28F);

		bodyModel[110].addBox(28.3F, 0.5F, -12.25F, 1, 1, 4, 0F); // Import Box586
		bodyModel[110].setRotationPoint(21F, -27F, -28F);
		bodyModel[110].rotateAngleY = 0.78539816F;

		bodyModel[111].addBox(28.5F, 0.5F, 6F, 1, 1, 5, 0F); // Import Box586
		bodyModel[111].setRotationPoint(21F, -27F, -28F);

		bodyModel[112].addBox(16.5F, 0.5F, 20.25F, 1, 1, 4, 0F); // Import Box586
		bodyModel[112].setRotationPoint(21F, -27F, -28F);
		bodyModel[112].rotateAngleY = -0.78539816F;

		bodyModel[113].addShapeBox(0F, -0.4F, 0F, 25, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[113].setRotationPoint(40F, -27F, -26F);
		bodyModel[113].rotateAngleZ = -0.19198622F;

		bodyModel[114].addShapeBox(28F, -0.25F, 0F, 12, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[114].setRotationPoint(44F, -27F, 0F);
		bodyModel[114].rotateAngleZ = -0.20943951F;

		bodyModel[115].addShapeBox(13F, -0.25F, 0F, 10, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[115].setRotationPoint(44F, -27F, 0F);
		bodyModel[115].rotateAngleZ = -0.20943951F;

		bodyModel[116].addShapeBox(31F, -0.25F, -2F, 15, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[116].setRotationPoint(40F, -27F, -26F);
		bodyModel[116].rotateAngleZ = -0.19198622F;

		bodyModel[117].addShapeBox(-1F, 1F, 0F, 3, 3, 3, 0F,0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F); // Box 0
		bodyModel[117].setRotationPoint(-57.5F, -12F, -30F);
		bodyModel[117].rotateAngleZ = 0.13962634F;

		bodyModel[118].addShapeBox(-1F, 1F, -3F, 3, 3, 3, 0F,0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F, 0F, 0.5F, 2.5F); // Box 4
		bodyModel[118].setRotationPoint(-57.5F, -12F, 30F);
		bodyModel[118].rotateAngleZ = 0.13962634F;

		bodyModel[119].addShapeBox(0F, -4F, 0F, 13, 14, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 352
		bodyModel[119].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[119].rotateAngleZ = 0.20943951F;

		bodyModel[120].addShapeBox(-0.5F, -7F, -8.5F, 13, 14, 12, 0F,0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F); // Box 353
		bodyModel[120].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[120].rotateAngleZ = 0.20943951F;

		bodyModel[121].addShapeBox(-0.5F, 0F, -8.5F, 13, 14, 12, 0F,0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F); // Box 354
		bodyModel[121].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[121].rotateAngleZ = 0.20943951F;

		bodyModel[122].addShapeBox(-2.5F, 4F, -15.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 355
		bodyModel[122].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[122].rotateAngleZ = 0.20943951F;

		bodyModel[123].addShapeBox(-2.5F, -6F, -15.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 356
		bodyModel[123].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[123].rotateAngleZ = 0.20943951F;

		bodyModel[124].addShapeBox(-2.5F, -16F, -15.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -11.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 357
		bodyModel[124].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[124].rotateAngleZ = 0.20943951F;

		bodyModel[125].addShapeBox(-2.5F, -16F, -15.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 358
		bodyModel[125].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[125].rotateAngleZ = 0.20943951F;

		bodyModel[126].addShapeBox(-2.5F, -16F, -22.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 359
		bodyModel[126].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[126].rotateAngleZ = 0.20943951F;

		bodyModel[127].addShapeBox(-2.5F, -6F, -22.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 360
		bodyModel[127].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[127].rotateAngleZ = 0.20943951F;

		bodyModel[128].addShapeBox(-2.5F, 4F, -22.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 361
		bodyModel[128].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[128].rotateAngleZ = 0.20943951F;

		bodyModel[129].addShapeBox(-2.5F, -6F, -15.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 362
		bodyModel[129].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[129].rotateAngleZ = 0.20943951F;

		bodyModel[130].addShapeBox(-2.5F, 4F, -15.5F, 13, 14, 12, 0F,-0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F, -0.7F, -6.7F, -9F, -8.7F, -6.7F, -9F, -8.7F, -6.7F, -2.5F, -0.7F, -6.7F, -2.5F); // Box 363
		bodyModel[130].setRotationPoint(-59.2F, -17F, -6F);
		bodyModel[130].rotateAngleZ = 0.20943951F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 122
		turretModel[1] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 122
		turretModel[2] = new ModelRendererTurbo(this, 753, 121, textureX, textureY); // Box 122
		turretModel[3] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 122
		turretModel[4] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 122
		turretModel[5] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 122
		turretModel[6] = new ModelRendererTurbo(this, 897, 113, textureX, textureY); // Box 122
		turretModel[7] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 122
		turretModel[8] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 122
		turretModel[9] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 122
		turretModel[10] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 122
		turretModel[11] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 122
		turretModel[12] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 122
		turretModel[13] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 122
		turretModel[14] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Box 122
		turretModel[15] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Box 122
		turretModel[16] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 122
		turretModel[17] = new ModelRendererTurbo(this, 993, 113, textureX, textureY); // Box 122
		turretModel[18] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 122
		turretModel[19] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 122
		turretModel[20] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 122
		turretModel[21] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 122
		turretModel[22] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Box 122
		turretModel[23] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 122
		turretModel[24] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 122
		turretModel[25] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 122
		turretModel[26] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 122
		turretModel[27] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 122
		turretModel[28] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 122
		turretModel[29] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 122
		turretModel[30] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 122
		turretModel[31] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 122
		turretModel[32] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 122
		turretModel[33] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 122
		turretModel[34] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 122
		turretModel[35] = new ModelRendererTurbo(this, 633, 113, textureX, textureY); // Box 122
		turretModel[36] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 122
		turretModel[37] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 122
		turretModel[38] = new ModelRendererTurbo(this, 713, 113, textureX, textureY); // Box 122
		turretModel[39] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 122
		turretModel[40] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 122
		turretModel[41] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Box 122
		turretModel[42] = new ModelRendererTurbo(this, 817, 145, textureX, textureY); // Box 122
		turretModel[43] = new ModelRendererTurbo(this, 945, 169, textureX, textureY); // Box 122
		turretModel[44] = new ModelRendererTurbo(this, 569, 193, textureX, textureY); // Box 122
		turretModel[45] = new ModelRendererTurbo(this, 769, 193, textureX, textureY); // Box 122
		turretModel[46] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 122
		turretModel[47] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 122
		turretModel[48] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 122
		turretModel[49] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 122
		turretModel[50] = new ModelRendererTurbo(this, 609, 193, textureX, textureY); // Box 122
		turretModel[51] = new ModelRendererTurbo(this, 881, 193, textureX, textureY); // Box 122
		turretModel[52] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 122
		turretModel[53] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 122
		turretModel[54] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 122
		turretModel[55] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 122
		turretModel[56] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 122
		turretModel[57] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 122
		turretModel[58] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 122
		turretModel[59] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 122
		turretModel[60] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 122
		turretModel[61] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 122
		turretModel[62] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 122
		turretModel[63] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 122
		turretModel[64] = new ModelRendererTurbo(this, 313, 249, textureX, textureY); // Box 122
		turretModel[65] = new ModelRendererTurbo(this, 681, 193, textureX, textureY); // Box 122
		turretModel[66] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 122
		turretModel[67] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 122
		turretModel[68] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 122
		turretModel[69] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 122
		turretModel[70] = new ModelRendererTurbo(this, 577, 249, textureX, textureY); // Box 122
		turretModel[71] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 122
		turretModel[72] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 122
		turretModel[73] = new ModelRendererTurbo(this, 697, 249, textureX, textureY); // Box 122
		turretModel[74] = new ModelRendererTurbo(this, 897, 249, textureX, textureY); // Box 122
		turretModel[75] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 122
		turretModel[76] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 122
		turretModel[77] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // No Part Selected
		turretModel[78] = new ModelRendererTurbo(this, 993, 169, textureX, textureY); // Box 23
		turretModel[79] = new ModelRendererTurbo(this, 785, 185, textureX, textureY); // Box 23
		turretModel[80] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 23
		turretModel[81] = new ModelRendererTurbo(this, 817, 145, textureX, textureY); // Box 23
		turretModel[82] = new ModelRendererTurbo(this, 625, 169, textureX, textureY); // Box 23
		turretModel[83] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 23
		turretModel[84] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 23
		turretModel[85] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 14
		turretModel[86] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 15
		turretModel[87] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 16
		turretModel[88] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 17
		turretModel[89] = new ModelRendererTurbo(this, 569, 201, textureX, textureY); // Box 18

		turretModel[0].addShapeBox(2F, 6F, -7F, 20, 12, 36, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 122
		turretModel[0].setRotationPoint(0F, -50F, 0F);

		turretModel[1].addShapeBox(-16F, 2F, -7F, 18, 12, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[1].setRotationPoint(0F, -46F, 0F);

		turretModel[2].addShapeBox(-47F, 5F, -29F, 1, 1, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[2].setRotationPoint(0F, -44F, 0F);

		turretModel[3].addShapeBox(-47F, 8F, -29F, 1, 1, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[3].setRotationPoint(0F, -44F, 0F);

		turretModel[4].addShapeBox(-47F, 8F, -29F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[4].setRotationPoint(0F, -47F, 0F);

		turretModel[5].addShapeBox(-47F, 8F, -29F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[5].setRotationPoint(0F, -44F, 0F);

		turretModel[6].addShapeBox(-34F, 9F, 29F, 8, 4, 4, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 122
		turretModel[6].setRotationPoint(0F, -53F, 0F);

		turretModel[7].addShapeBox(-16F, -2F, 29F, 18, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[7].setRotationPoint(0F, -38F, 0F);

		turretModel[8].addShapeBox(2F, 0F, 29F, 20, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -5.5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1.5F, 4F, 0F, 1.5F, -4F, 0F, 0F, 0F); // Box 122
		turretModel[8].setRotationPoint(0F, -44F, 0F);

		turretModel[9].addShapeBox(2F, -2F, 29F, 20, 8, 4, 0F,0F, 0F, 0F, 0F, -1.5F, 4F, 0F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 122
		turretModel[9].setRotationPoint(0F, -38F, 0F);

		turretModel[10].addShapeBox(-16F, -2F, -33F, 18, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[10].setRotationPoint(0F, -38F, 0F);

		turretModel[11].addShapeBox(-34F, 0F, -33F, 8, 4, 4, 0F,0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 122
		turretModel[11].setRotationPoint(0F, -44F, 0F);

		turretModel[12].addShapeBox(-34F, 9F, -29F, 8, 5, 58, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 122
		turretModel[12].setRotationPoint(0F, -53F, 0F);

		turretModel[13].addShapeBox(-34F, 5F, -29F, 8, 7, 58, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 122
		turretModel[13].setRotationPoint(0F, -44F, 0F);

		turretModel[14].addShapeBox(-34F, -2F, -33F, 8, 8, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[14].setRotationPoint(0F, -38F, 0F);

		turretModel[15].addShapeBox(-34F, -2F, 29F, 8, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 122
		turretModel[15].setRotationPoint(0F, -38F, 0F);

		turretModel[16].addShapeBox(-26F, 12F, -33F, 28, 2, 66, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 122
		turretModel[16].setRotationPoint(0F, -44F, 0F);

		turretModel[17].addShapeBox(-47F, 11F, -29F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[17].setRotationPoint(0F, -44F, 0F);

		turretModel[18].addShapeBox(-47F, 11F, -29F, 1, 1, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[18].setRotationPoint(0F, -44F, 0F);

		turretModel[19].addShapeBox(-47F, 8F, 28F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[19].setRotationPoint(0F, -47F, 0F);

		turretModel[20].addShapeBox(-47F, 8F, 28F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[20].setRotationPoint(0F, -44F, 0F);

		turretModel[21].addShapeBox(-47F, 11F, 28F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[21].setRotationPoint(0F, -44F, 0F);

		turretModel[22].addShapeBox(-46F, 11F, -28F, 12, 1, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[22].setRotationPoint(0F, -44F, 0F);

		turretModel[23].addShapeBox(-47F, 2F, -29F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[23].setRotationPoint(0F, -44F, 0F);

		turretModel[24].addShapeBox(-43F, 2F, -29F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[24].setRotationPoint(0F, -44F, 0F);

		turretModel[25].addShapeBox(-39F, 2F, -29F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[25].setRotationPoint(0F, -44F, 0F);

		turretModel[26].addShapeBox(-47F, 2F, 28F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[26].setRotationPoint(0F, -44F, 0F);

		turretModel[27].addShapeBox(-43F, 2F, 28F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[27].setRotationPoint(0F, -44F, 0F);

		turretModel[28].addShapeBox(-39F, 2F, 28F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[28].setRotationPoint(0F, -44F, 0F);

		turretModel[29].addShapeBox(-47F, 2F, 22F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[29].setRotationPoint(0F, -44F, 0F);

		turretModel[30].addShapeBox(-47F, 2F, -23F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[30].setRotationPoint(0F, -44F, 0F);

		turretModel[31].addShapeBox(-47F, 2F, -18F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[31].setRotationPoint(0F, -44F, 0F);

		turretModel[32].addShapeBox(-47F, 2F, 17F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[32].setRotationPoint(0F, -44F, 0F);

		turretModel[33].addShapeBox(-47F, 2F, 12F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[33].setRotationPoint(0F, -44F, 0F);

		turretModel[34].addShapeBox(-47F, 2F, -13F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[34].setRotationPoint(0F, -44F, 0F);

		turretModel[35].addShapeBox(-47F, 2F, -8F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[35].setRotationPoint(0F, -44F, 0F);

		turretModel[36].addShapeBox(-47F, 2F, 7F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[36].setRotationPoint(0F, -44F, 0F);

		turretModel[37].addShapeBox(-47F, 2F, 2F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[37].setRotationPoint(0F, -44F, 0F);

		turretModel[38].addShapeBox(-47F, 2F, -3F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[38].setRotationPoint(0F, -44F, 0F);

		turretModel[39].addShapeBox(-24F, -63F, -32F, 1, 50, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 122
		turretModel[39].setRotationPoint(0F, -46F, 0F);
		turretModel[39].rotateAngleZ = 0.6981317F;

		turretModel[40].addShapeBox(-24F, -63F, 31F, 1, 50, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 122
		turretModel[40].setRotationPoint(0F, -46F, 0F);
		turretModel[40].rotateAngleZ = 0.6981317F;

		turretModel[41].addShapeBox(-18F, -14F, -7F, 5, 2, 20, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 122
		turretModel[41].setRotationPoint(0F, -31F, 0F);

		turretModel[42].addShapeBox(-3F, -14F, -7F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 122
		turretModel[42].setRotationPoint(0F, -31F, 0F);

		turretModel[43].addShapeBox(-13F, -14F, -7F, 10, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[43].setRotationPoint(0F, -31F, 0F);

		turretModel[44].addShapeBox(22F, -6F, -7F, 12, 7, 32, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 122
		turretModel[44].setRotationPoint(0F, -36F, 0F);

		turretModel[45].addShapeBox(2F, 12F, -33F, 20, 2, 66, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 122
		turretModel[45].setRotationPoint(0F, -44F, 0F);

		turretModel[46].addShapeBox(2F, -2F, -33F, 20, 8, 4, 0F,0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 122
		turretModel[46].setRotationPoint(0F, -38F, 0F);

		turretModel[47].addShapeBox(2F, 0F, -33F, 20, 4, 4, 0F,0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 4F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 2F, 0F); // Box 122
		turretModel[47].setRotationPoint(0F, -44F, 0F);

		turretModel[48].addShapeBox(-22F, 14F, -33F, 24, 2, 66, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 122
		turretModel[48].setRotationPoint(0F, -44F, 0F);

		turretModel[49].addShapeBox(2F, 14F, -33F, 20, 2, 66, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -5F); // Box 122
		turretModel[49].setRotationPoint(0F, -44F, 0F);

		turretModel[50].addShapeBox(-30F, 14F, -25F, 8, 2, 50, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 122
		turretModel[50].setRotationPoint(0F, -44F, 0F);

		turretModel[51].addShapeBox(-33F, 12F, -25F, 11, 2, 50, 0F,0F, 0F, 4F, -4F, 0F, 4F, -4F, 0F, 4F, 0F, 0F, 4F, -3F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -3F, 0F, 2F); // Box 122
		turretModel[51].setRotationPoint(0F, -44F, 0F);

		turretModel[52].addShapeBox(34F, -3F, -19F, 10, 4, 10, 0F,0F, 1F, 0F, 0F, -3F, -10F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[52].setRotationPoint(0F, -36F, 0F);

		turretModel[53].addShapeBox(34F, 1F, -19F, 10, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, -10F, 0F, -3F, 0F, 0F, 1F, 0F); // Box 122
		turretModel[53].setRotationPoint(0F, -36F, 0F);

		turretModel[54].addShapeBox(22F, 6F, -25F, 12, 7, 50, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 0F, 0F); // Box 122
		turretModel[54].setRotationPoint(0F, -41F, 0F);

		turretModel[55].addShapeBox(34F, 0F, 19F, 10, 8, 3, 0F,0F, 0F, 0F, 0F, -2F, 10F, 0F, -2F, -13F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -4F, 10F, 0F, -4F, -13F, 0F, -1F, 0F); // Box 122
		turretModel[55].setRotationPoint(0F, -38F, 0F);

		turretModel[56].addShapeBox(34F, -2F, 19F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, -4F, 10F, 0F, -4F, -13F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 1F, 10F, 0F, 1F, -13F, 0F, -0.5F, 0F); // Box 122
		turretModel[56].setRotationPoint(0F, -38F, 0F);

		turretModel[57].addShapeBox(22F, 0F, 25F, 12, 8, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 6F, 0F, -0.5F, -7F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 0F, 6F, 0F, -1F, -7F, 0F, 0F, 0F); // Box 122
		turretModel[57].setRotationPoint(0F, -38F, 0F);

		turretModel[58].addShapeBox(22F, -4F, 25F, 12, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 6F, 0F, -4.5F, -7F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0.5F, -7F, 0F, -0.5F, 0F); // Box 122
		turretModel[58].setRotationPoint(0F, -38F, 0F);

		turretModel[59].addShapeBox(22F, 0F, -29F, 12, 8, 4, 0F,0F, 0F, 0F, 0F, -0.5F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, 6F, 0F, 2F, 0F); // Box 122
		turretModel[59].setRotationPoint(0F, -38F, 0F);

		turretModel[60].addShapeBox(22F, -4F, -29F, 12, 4, 4, 0F,0F, -3F, 0F, 0F, -4.5F, -7F, 0F, -2F, 6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -7F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 122
		turretModel[60].setRotationPoint(0F, -38F, 0F);

		turretModel[61].addShapeBox(34F, -2F, -22F, 10, 3, 3, 0F,0F, -2.5F, 0F, 0F, -4F, -13F, 0F, -4F, 10F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, -13F, 0F, 1F, 10F, 0F, 0F, 0F); // Box 122
		turretModel[61].setRotationPoint(0F, -38F, 0F);

		turretModel[62].addShapeBox(34F, 0F, -22F, 10, 8, 3, 0F,0F, -0.5F, 0F, 0F, -2F, -13F, 0F, -2F, 10F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -13F, 0F, -4F, 10F, 0F, 0F, 0F); // Box 122
		turretModel[62].setRotationPoint(0F, -38F, 0F);

		turretModel[63].addShapeBox(2F, 10F, -29F, 20, 8, 22, 0F,0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[63].setRotationPoint(0F, -50F, 0F);

		turretModel[64].addShapeBox(-16F, 4F, -29F, 18, 8, 22, 0F,0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[64].setRotationPoint(0F, -44F, 0F);

		turretModel[65].addShapeBox(22F, -6F, -25F, 12, 7, 18, 0F,0F, -2F, 0F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[65].setRotationPoint(0F, -36F, 0F);

		turretModel[66].addShapeBox(-26F, 0F, -29F, 10, 12, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[66].setRotationPoint(0F, -44F, 0F);

		turretModel[67].addShapeBox(34F, 1F, 9F, 10, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -10F, 0F, 1F, 0F); // Box 122
		turretModel[67].setRotationPoint(0F, -36F, 0F);

		turretModel[68].addShapeBox(34F, -3F, 9F, 10, 4, 10, 0F,0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -10F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 122
		turretModel[68].setRotationPoint(0F, -36F, 0F);

		turretModel[69].addShapeBox(-47F, 5F, 28F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[69].setRotationPoint(0F, -47F, 0F);

		turretModel[70].addShapeBox(-47F, 2F, -29F, 1, 1, 57, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[70].setRotationPoint(0F, -44F, 0F);

		turretModel[71].addShapeBox(-47F, 5F, -29F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[71].setRotationPoint(0F, -47F, 0F);

		turretModel[72].addShapeBox(-52F, -9F, -1F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[72].setRotationPoint(0F, -41F, 0F);

		turretModel[73].addShapeBox(-49F, -3F, -24F, 2, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[73].setRotationPoint(0F, -41F, 0F);

		turretModel[74].addShapeBox(-50F, -3F, -24F, 1, 12, 48, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 122
		turretModel[74].setRotationPoint(0F, -41F, 0F);

		turretModel[75].addShapeBox(-51.5F, -21F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		turretModel[75].setRotationPoint(0F, -41F, 0F);

		turretModel[76].addShapeBox(-52F, -3F, -1.5F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		turretModel[76].setRotationPoint(0F, -41F, 0F);

		turretModel[77].addShapeBox(12F, -2F, -21F, 10, 4, 12, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // No Part Selected
		turretModel[77].setRotationPoint(0F, -42F, 0F);

		turretModel[78].addShapeBox(16F, -16F, 12F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[78].setRotationPoint(0F, -28F, 0F);

		turretModel[79].addShapeBox(19F, -16F, 12F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 23
		turretModel[79].setRotationPoint(0F, -28F, 0F);

		turretModel[80].addShapeBox(13F, -16F, 12F, 3, 4, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23
		turretModel[80].setRotationPoint(0F, -28F, 0F);

		turretModel[81].addShapeBox(16.5F, -16F, 12F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		turretModel[81].setRotationPoint(0F, -34F, 1.5F);

		turretModel[82].addShapeBox(15F, -16F, 12F, 2, 6, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 23
		turretModel[82].setRotationPoint(-0.5F, -34F, 1.5F);

		turretModel[83].addShapeBox(18.5F, -16F, 12F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 23
		turretModel[83].setRotationPoint(0F, -34F, 1.5F);

		turretModel[84].addShapeBox(18.5F, -16F, 12F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 23
		turretModel[84].setRotationPoint(0F, -33F, 2.5F);

		turretModel[85].addShapeBox(-16F, 9F, 29F, 18, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		turretModel[85].setRotationPoint(0F, -53F, 0F);

		turretModel[86].addShapeBox(-26F, -2F, -33F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[86].setRotationPoint(0F, -38F, 0F);

		turretModel[87].addShapeBox(-26F, 0F, -33F, 10, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		turretModel[87].setRotationPoint(0F, -44F, 0F);

		turretModel[88].addShapeBox(-26F, 9F, 29F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		turretModel[88].setRotationPoint(0F, -53F, 0F);

		turretModel[89].addShapeBox(-26F, -2F, 29F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		turretModel[89].setRotationPoint(0F, -38F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 122
		barrelModel[1] = new ModelRendererTurbo(this, 897, 145, textureX, textureY); // Box 122
		barrelModel[2] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Box 122
		barrelModel[3] = new ModelRendererTurbo(this, 897, 169, textureX, textureY); // Box 122
		barrelModel[4] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 122
		barrelModel[5] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 122
		barrelModel[6] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Box 122
		barrelModel[7] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 122
		barrelModel[8] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 122
		barrelModel[9] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 122
		barrelModel[10] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 122
		barrelModel[11] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 122
		barrelModel[12] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 122
		barrelModel[13] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 122
		barrelModel[14] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Box 122
		barrelModel[15] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 122
		barrelModel[16] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 122
		barrelModel[17] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 122
		barrelModel[18] = new ModelRendererTurbo(this, 545, 177, textureX, textureY); // Box 122
		barrelModel[19] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 122
		barrelModel[20] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 122
		barrelModel[21] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 122
		barrelModel[22] = new ModelRendererTurbo(this, 817, 169, textureX, textureY); // Box 122
		barrelModel[23] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 122
		barrelModel[24] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 122
		barrelModel[25] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 12

		barrelModel[0].addShapeBox(0F, -5F, -9F, 10, 10, 18, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 122
		barrelModel[0].setRotationPoint(34F, -35F, 0F);

		barrelModel[1].addShapeBox(-2.8F, -4F, -4F, 13, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		barrelModel[1].setRotationPoint(34F, -35F, 0F);

		barrelModel[2].addShapeBox(-2.8F, 2F, -4F, 13, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 122
		barrelModel[2].setRotationPoint(34F, -35F, 0F);

		barrelModel[3].addShapeBox(-2.8F, -2F, -4F, 13, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		barrelModel[3].setRotationPoint(34F, -35F, 0F);

		barrelModel[4].addShapeBox(40F, -2F, -2F, 32, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		barrelModel[4].setRotationPoint(34F, -35F, 0F);

		barrelModel[5].addShapeBox(24F, -1.5F, -3F, 14, 2, 6, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 122
		barrelModel[5].setRotationPoint(34F, -35F, 0F);

		barrelModel[6].addShapeBox(73F, -2F, -2F, 10, 2, 4, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 122
		barrelModel[6].setRotationPoint(34F, -35F, 0F);

		barrelModel[7].addShapeBox(24F, -4F, -1.5F, 14, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 122
		barrelModel[7].setRotationPoint(34F, -35F, 0F);

		barrelModel[8].addShapeBox(72F, -2F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F); // Box 122
		barrelModel[8].setRotationPoint(34F, -35F, 0F);

		barrelModel[9].addShapeBox(73F, 0F, -2F, 10, 2, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 122
		barrelModel[9].setRotationPoint(34F, -35F, 0F);

		barrelModel[10].addShapeBox(73F, -1F, -2F, 10, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 122
		barrelModel[10].setRotationPoint(34F, -35F, 0F);

		barrelModel[11].addShapeBox(73F, -1F, 0F, 10, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 122
		barrelModel[11].setRotationPoint(34F, -35F, 0F);

		barrelModel[12].addShapeBox(72F, 0F, -2F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 122
		barrelModel[12].setRotationPoint(34F, -35F, 0F);

		barrelModel[13].addShapeBox(72F, -0.5F, -2F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 122
		barrelModel[13].setRotationPoint(34F, -35F, 0F);

		barrelModel[14].addShapeBox(38F, -1F, -3F, 2, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 122
		barrelModel[14].setRotationPoint(34F, -35F, 0F);

		barrelModel[15].addShapeBox(38F, 1F, -3F, 2, 1, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F); // Box 122
		barrelModel[15].setRotationPoint(34F, -35F, 0F);

		barrelModel[16].addShapeBox(38F, -2F, -2F, 2, 1, 4, 0F,0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 122
		barrelModel[16].setRotationPoint(34F, -35F, 0F);

		barrelModel[17].addShapeBox(40F, -1F, -2F, 32, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		barrelModel[17].setRotationPoint(34F, -35F, 0F);

		barrelModel[18].addShapeBox(40F, 1F, -2F, 32, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		barrelModel[18].setRotationPoint(34F, -35F, 0F);

		barrelModel[19].addShapeBox(10F, -1F, -2F, 14, 2, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 122
		barrelModel[19].setRotationPoint(34F, -35F, 0F);

		barrelModel[20].addShapeBox(10F, -2F, -2F, 14, 1, 4, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 122
		barrelModel[20].setRotationPoint(34F, -35F, 0F);

		barrelModel[21].addShapeBox(10F, 1F, -2F, 14, 1, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 122
		barrelModel[21].setRotationPoint(34F, -35F, 0F);

		barrelModel[22].addShapeBox(24F, -3.5F, -3F, 14, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 122
		barrelModel[22].setRotationPoint(34F, -35F, 0F);

		barrelModel[23].addShapeBox(24F, 1.5F, -3F, 14, 1, 6, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 122
		barrelModel[23].setRotationPoint(34F, -35F, 0F);

		barrelModel[24].addShapeBox(24F, 2F, -1.5F, 14, 1, 3, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		barrelModel[24].setRotationPoint(34F, -35F, 0F);

		barrelModel[25].addShapeBox(-2.8F, -3F, 4F, 13, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 12
		barrelModel[25].setRotationPoint(34F, -35F, 0F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 122
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 122
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 122
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 122
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 122
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 122
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 122
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 122
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 122
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 122
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 122
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 122
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 122
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 122
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 122
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 122
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 122
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 122
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 122
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 122
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 122
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 122
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 122
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 122
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 122
		leftFrontWheelModel[25] = new ModelRendererTurbo(this, 849, 65, textureX, textureY); // Box 122
		leftFrontWheelModel[26] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 122
		leftFrontWheelModel[27] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 122

		leftFrontWheelModel[0].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftFrontWheelModel[0].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[1].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		leftFrontWheelModel[1].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[2].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		leftFrontWheelModel[2].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[3].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 122
		leftFrontWheelModel[3].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[4].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftFrontWheelModel[4].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[5].addShapeBox(-5.5F, -3.5F, 6F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[5].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[6].addShapeBox(-5.5F, 3.5F, 6F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[6].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[7].addShapeBox(-5.5F, -5.5F, 6F, 11, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[7].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[8].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[8].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[9].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftFrontWheelModel[9].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[10].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		leftFrontWheelModel[10].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[11].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		leftFrontWheelModel[11].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[12].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 122
		leftFrontWheelModel[12].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[13].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftFrontWheelModel[13].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[14].addShapeBox(-5.5F, -3.5F, 6F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[14].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[15].addShapeBox(-5.5F, 3.5F, 6F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[15].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[16].addShapeBox(-5.5F, -5.5F, 6F, 11, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[16].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[17].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[17].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[18].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 122
		leftFrontWheelModel[18].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[19].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[19].setRotationPoint(62F, -1F, 28F);

		leftFrontWheelModel[20].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftFrontWheelModel[20].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[21].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 122
		leftFrontWheelModel[21].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[22].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 122
		leftFrontWheelModel[22].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[23].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 122
		leftFrontWheelModel[23].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[24].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 122
		leftFrontWheelModel[24].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[25].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 122
		leftFrontWheelModel[25].setRotationPoint(65F, -1F, 28F);

		leftFrontWheelModel[26].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 122
		leftFrontWheelModel[26].setRotationPoint(31F, -1F, 28F);

		leftFrontWheelModel[27].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 122
		leftFrontWheelModel[27].setRotationPoint(31F, -1F, 28F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 122
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 122
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 122
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 122
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 122
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 122
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 122
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 122
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 122
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 122
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 122
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 122
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 521, 105, textureX, textureY); // Box 122
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 122
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 122
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 122
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 122
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[25] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[26] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 122
		rightFrontWheelModel[27] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 122

		rightFrontWheelModel[0].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[0].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[1].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		rightFrontWheelModel[1].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[2].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		rightFrontWheelModel[2].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[3].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[3].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[4].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[4].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[5].addShapeBox(-5.5F, -3.5F, -7F, 11, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[5].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[6].addShapeBox(-5.5F, 3.5F, -7F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		rightFrontWheelModel[6].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[7].addShapeBox(-5.5F, -5.5F, -7F, 11, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[7].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[8].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[8].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[9].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[9].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[10].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		rightFrontWheelModel[10].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[11].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		rightFrontWheelModel[11].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[12].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[12].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[13].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[13].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[14].addShapeBox(-5.5F, -3.5F, -7F, 11, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[14].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[15].addShapeBox(-5.5F, 3.5F, -7F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		rightFrontWheelModel[15].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[16].addShapeBox(-5.5F, -5.5F, -7F, 11, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[16].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[17].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[17].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[18].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 122
		rightFrontWheelModel[18].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[19].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[19].setRotationPoint(62F, -1F, -28F);

		rightFrontWheelModel[20].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightFrontWheelModel[20].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[21].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 122
		rightFrontWheelModel[21].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[22].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 122
		rightFrontWheelModel[22].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[23].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 122
		rightFrontWheelModel[23].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[24].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 122
		rightFrontWheelModel[24].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[25].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 122
		rightFrontWheelModel[25].setRotationPoint(65F, -1F, -28F);

		rightFrontWheelModel[26].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 122
		rightFrontWheelModel[26].setRotationPoint(31F, -1F, -28F);

		rightFrontWheelModel[27].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 122
		rightFrontWheelModel[27].setRotationPoint(31F, -1F, -28F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 122
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 122
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 122
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 122
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 122
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 122
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 122
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 122
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 122
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 122
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 122
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 122
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 122
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 122
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 122
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 122
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 122
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 122
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 122
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 122
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 122
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 122
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 122
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 625, 81, textureX, textureY); // Box 122
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 122
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 689, 81, textureX, textureY); // Box 122
		leftBackWheelModel[26] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 122
		leftBackWheelModel[27] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 122

		leftBackWheelModel[0].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftBackWheelModel[0].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[1].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		leftBackWheelModel[1].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[2].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		leftBackWheelModel[2].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[3].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 122
		leftBackWheelModel[3].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[4].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftBackWheelModel[4].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[5].addShapeBox(-5.5F, -3.5F, 6F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftBackWheelModel[5].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[6].addShapeBox(-5.5F, 3.5F, 6F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 122
		leftBackWheelModel[6].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[7].addShapeBox(-5.5F, -5.5F, 6F, 11, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftBackWheelModel[7].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[8].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftBackWheelModel[8].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[9].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftBackWheelModel[9].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[10].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		leftBackWheelModel[10].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[11].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		leftBackWheelModel[11].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[12].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 122
		leftBackWheelModel[12].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[13].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		leftBackWheelModel[13].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[14].addShapeBox(-5.5F, -3.5F, 6F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftBackWheelModel[14].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[15].addShapeBox(-5.5F, 3.5F, 6F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 122
		leftBackWheelModel[15].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[16].addShapeBox(-5.5F, -5.5F, 6F, 11, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftBackWheelModel[16].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[17].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftBackWheelModel[17].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[18].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 122
		leftBackWheelModel[18].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[19].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftBackWheelModel[19].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[20].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		leftBackWheelModel[20].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[21].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 122
		leftBackWheelModel[21].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[22].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 122
		leftBackWheelModel[22].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[23].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 122
		leftBackWheelModel[23].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[24].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 122
		leftBackWheelModel[24].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[25].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 122
		leftBackWheelModel[25].setRotationPoint(-6F, -1F, 28F);

		leftBackWheelModel[26].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 122
		leftBackWheelModel[26].setRotationPoint(-37F, -1F, 28F);

		leftBackWheelModel[27].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 122
		leftBackWheelModel[27].setRotationPoint(-37F, -1F, 28F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Box 122
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 122
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 122
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 122
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 122
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 122
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 122
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 122
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 122
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 122
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 122
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 537, 89, textureX, textureY); // Box 122
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 122
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 122
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 122
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 122
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 122
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 122
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 122
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 122
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 122
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 122
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 569, 97, textureX, textureY); // Box 122
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 122
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 633, 97, textureX, textureY); // Box 122
		rightBackWheelModel[25] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 122
		rightBackWheelModel[26] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 122
		rightBackWheelModel[27] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 122

		rightBackWheelModel[0].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[0].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[1].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		rightBackWheelModel[1].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[2].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		rightBackWheelModel[2].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[3].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[3].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[4].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[4].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[5].addShapeBox(-5.5F, -3.5F, -7F, 11, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[5].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[6].addShapeBox(-5.5F, 3.5F, -7F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		rightBackWheelModel[6].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[7].addShapeBox(-5.5F, -5.5F, -7F, 11, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[7].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[8].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[8].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[9].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[9].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[10].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 122
		rightBackWheelModel[10].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[11].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		rightBackWheelModel[11].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[12].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[12].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[13].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[13].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[14].addShapeBox(-5.5F, -3.5F, -7F, 11, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[14].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[15].addShapeBox(-5.5F, 3.5F, -7F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 122
		rightBackWheelModel[15].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[16].addShapeBox(-5.5F, -5.5F, -7F, 11, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[16].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[17].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[17].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[18].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 122
		rightBackWheelModel[18].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[19].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[19].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[20].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		rightBackWheelModel[20].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[21].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 122
		rightBackWheelModel[21].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[22].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 122
		rightBackWheelModel[22].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[23].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 122
		rightBackWheelModel[23].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[24].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 122
		rightBackWheelModel[24].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[25].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 122
		rightBackWheelModel[25].setRotationPoint(-6F, -1F, -28F);

		rightBackWheelModel[26].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 122
		rightBackWheelModel[26].setRotationPoint(-37F, -1F, -28F);

		rightBackWheelModel[27].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 122
		rightBackWheelModel[27].setRotationPoint(-37F, -1F, -28F);
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