//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LAV25
// Model Creator: 
// Created on: 05.06.2015 - 14:22:17
// Last changed on: 05.06.2015 - 14:22:17

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBumerang extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBumerang() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[92];
		turretModel = new ModelRendererTurbo[46];
		barrelModel = new ModelRendererTurbo[6];
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

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 49
		bodyModel[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 49
		bodyModel[2] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 49
		bodyModel[3] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 49
		bodyModel[4] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 49
		bodyModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 49
		bodyModel[6] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 49
		bodyModel[7] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 49
		bodyModel[8] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 49
		bodyModel[9] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 49
		bodyModel[10] = new ModelRendererTurbo(this, 857, 49, textureX, textureY); // Box 49
		bodyModel[11] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 49
		bodyModel[12] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 49
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 49
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 49
		bodyModel[17] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 49
		bodyModel[18] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 49
		bodyModel[19] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 49
		bodyModel[20] = new ModelRendererTurbo(this, 545, 25, textureX, textureY); // Box 49
		bodyModel[21] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 49
		bodyModel[22] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 49
		bodyModel[23] = new ModelRendererTurbo(this, 1017, 9, textureX, textureY); // Box 49
		bodyModel[24] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 49
		bodyModel[25] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 49
		bodyModel[26] = new ModelRendererTurbo(this, 625, 25, textureX, textureY); // Box 49
		bodyModel[27] = new ModelRendererTurbo(this, 633, 25, textureX, textureY); // Box 49
		bodyModel[28] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 49
		bodyModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 49
		bodyModel[30] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 49
		bodyModel[31] = new ModelRendererTurbo(this, 561, 33, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 49
		bodyModel[33] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 625, 33, textureX, textureY); // Box 49
		bodyModel[35] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 545, 41, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 961, 25, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 49
		bodyModel[42] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 1001, 25, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 49
		bodyModel[51] = new ModelRendererTurbo(this, 569, 41, textureX, textureY); // Box 49
		bodyModel[52] = new ModelRendererTurbo(this, 577, 41, textureX, textureY); // Box 49
		bodyModel[53] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 49
		bodyModel[54] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 49
		bodyModel[55] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 49
		bodyModel[56] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 49
		bodyModel[57] = new ModelRendererTurbo(this, 673, 33, textureX, textureY); // Box 49
		bodyModel[58] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 49
		bodyModel[59] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 49
		bodyModel[60] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 49
		bodyModel[61] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 49
		bodyModel[62] = new ModelRendererTurbo(this, 601, 41, textureX, textureY); // Box 49
		bodyModel[63] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 49
		bodyModel[64] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 49
		bodyModel[65] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 49
		bodyModel[66] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 49
		bodyModel[67] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 49
		bodyModel[68] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 49
		bodyModel[69] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 49
		bodyModel[70] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 49
		bodyModel[71] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 49
		bodyModel[72] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 49
		bodyModel[73] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 49
		bodyModel[74] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 49
		bodyModel[75] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 49
		bodyModel[76] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 49
		bodyModel[77] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 49
		bodyModel[78] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 49
		bodyModel[79] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 49
		bodyModel[80] = new ModelRendererTurbo(this, 817, 129, textureX, textureY); // Box 49
		bodyModel[81] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 49
		bodyModel[82] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 49
		bodyModel[83] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 49
		bodyModel[84] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 49
		bodyModel[85] = new ModelRendererTurbo(this, 785, 201, textureX, textureY); // Box 49
		bodyModel[86] = new ModelRendererTurbo(this, 6, 233, textureX, textureY); // Box 49
		bodyModel[87] = new ModelRendererTurbo(this, 6, 259, textureX, textureY); // Box 49
		bodyModel[88] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 49
		bodyModel[89] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 49
		bodyModel[90] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 49
		bodyModel[91] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49

		bodyModel[0].addShapeBox(0F, 0F, -1F, 122, 17, 2, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F); // Box 49
		bodyModel[0].setRotationPoint(-35F, -21F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 39, 10, 64, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 49
		bodyModel[1].setRotationPoint(39F, -33F, -32F);

		bodyModel[2].addShapeBox(-7F, 0F, -3F, 66, 20, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 49
		bodyModel[2].setRotationPoint(-35F, -23.5F, 20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 134, 2, 42, 0F,4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 49
		bodyModel[3].setRotationPoint(-39F, -4F, -21F);

		bodyModel[4].addShapeBox(0F, 0F, -1F, 122, 17, 2, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F); // Box 49
		bodyModel[4].setRotationPoint(-35F, -21F, 20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 13, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[5].setRotationPoint(-49F, -22F, -19F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 88, 14, 12, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[6].setRotationPoint(-49F, -35F, 20F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 14, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[7].setRotationPoint(-49F, -36F, -20F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 84, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[8].setRotationPoint(-45F, -36F, -20F);

		bodyModel[9].addShapeBox(-7F, 0F, -8F, 66, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[9].setRotationPoint(-35F, -7.5F, 14F);

		bodyModel[10].addShapeBox(0F, 0F, 28F, 10, 7, 64, 0F,0F, 2.5F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[10].setRotationPoint(96F, -28F, -60F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 21, 16, 42, 0F,6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -3F, 3F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -3F, 3F, 0F); // Box 49
		bodyModel[11].setRotationPoint(93F, -21F, -21F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 18, 15, 64, 0F,0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[12].setRotationPoint(78F, -36F, -32F);

		bodyModel[13].addShapeBox(-1.5F, 0F, -1.5F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[13].setRotationPoint(78.5F, -21F, 21.5F);

		bodyModel[14].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 49
		bodyModel[14].setRotationPoint(81.5F, -2F, 14.5F);

		bodyModel[15].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 49
		bodyModel[15].setRotationPoint(76.5F, -2F, 14.5F);

		bodyModel[16].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 49
		bodyModel[16].setRotationPoint(47F, -2F, 14.5F);

		bodyModel[17].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 49
		bodyModel[17].setRotationPoint(52F, -2F, 14.5F);

		bodyModel[18].addShapeBox(-1.5F, 0F, -1.5F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[18].setRotationPoint(49F, -21F, 21.5F);

		bodyModel[19].addShapeBox(-1F, 0F, -1F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[19].setRotationPoint(-11F, -21F, -21.5F);
		bodyModel[19].rotateAngleZ = -0.26179939F;

		bodyModel[20].addShapeBox(-1F, 0F, -1F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[20].setRotationPoint(17F, -21F, -21.5F);
		bodyModel[20].rotateAngleZ = -0.26179939F;

		bodyModel[21].addShapeBox(-1F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[21].setRotationPoint(-42F, -18F, -25.5F);

		bodyModel[22].addShapeBox(-1F, 0F, -1.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[22].setRotationPoint(-43F, -18F, -25.5F);

		bodyModel[23].addShapeBox(-1F, 0F, -1.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[23].setRotationPoint(-43F, -18F, -25.5F);
		bodyModel[23].rotateAngleX = -4.1887902F;

		bodyModel[24].addShapeBox(-1F, 0F, -1.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[24].setRotationPoint(-43F, -18F, -25.5F);
		bodyModel[24].rotateAngleX = -2.0943951F;

		bodyModel[25].addShapeBox(-1F, 0F, -1.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[25].setRotationPoint(-43F, -18F, 25.5F);

		bodyModel[26].addShapeBox(-1F, 0F, -1.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[26].setRotationPoint(-43F, -18F, 25.5F);
		bodyModel[26].rotateAngleX = -2.0943951F;

		bodyModel[27].addShapeBox(-1F, 0F, -1.5F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[27].setRotationPoint(-43F, -18F, 25.5F);
		bodyModel[27].rotateAngleX = -4.1887902F;

		bodyModel[28].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[28].setRotationPoint(-19F, -2F, -21.5F);

		bodyModel[29].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[29].setRotationPoint(9F, -2F, -21.5F);

		bodyModel[30].addShapeBox(0F, 0F, -2F, 2, 3, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[30].setRotationPoint(15.5F, -2F, -18.5F);

		bodyModel[31].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[31].setRotationPoint(-19F, -2F, 21.5F);

		bodyModel[32].addShapeBox(-1F, 0F, -1F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[32].setRotationPoint(-11F, -21F, 21.5F);
		bodyModel[32].rotateAngleZ = -0.26179939F;

		bodyModel[33].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[33].setRotationPoint(9F, -2F, 21.5F);

		bodyModel[34].addShapeBox(-1F, 0F, -1F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[34].setRotationPoint(17F, -21F, 21.5F);
		bodyModel[34].rotateAngleZ = -0.26179939F;

		bodyModel[35].addShapeBox(0F, 0F, -1F, 2, 3, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[35].setRotationPoint(-12.5F, -2F, -19.5F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[36].setRotationPoint(-17F, 0.5F, -20F);
		bodyModel[36].rotateAngleX = 0.13962634F;

		bodyModel[37].addShapeBox(0F, 0F, -1F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[37].setRotationPoint(11F, 0.5F, -20F);
		bodyModel[37].rotateAngleX = 0.13962634F;

		bodyModel[38].addShapeBox(0F, 0F, -19F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[38].setRotationPoint(11F, 0.5F, 22F);
		bodyModel[38].rotateAngleX = -0.13962634F;

		bodyModel[39].addShapeBox(0F, 0F, -19F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[39].setRotationPoint(-17F, 0.5F, 22F);
		bodyModel[39].rotateAngleX = -0.13962634F;

		bodyModel[40].addShapeBox(0F, 0F, -12F, 5, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[40].setRotationPoint(-19F, -2F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, -12F, 5, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[41].setRotationPoint(9F, -2F, 6F);

		bodyModel[42].addShapeBox(-12F, 0F, 0F, 44, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[42].setRotationPoint(43F, -38F, -31F);

		bodyModel[43].addShapeBox(5F, 0F, -9F, 4, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 49
		bodyModel[43].setRotationPoint(75F, -36.2F, 10F);

		bodyModel[44].addBox(-5F, 0F, -9F, 10, 3, 18, 0F); // Box 49
		bodyModel[44].setRotationPoint(75F, -36.2F, 10F);

		bodyModel[45].addShapeBox(-9F, 0F, -9F, 4, 3, 18, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 49
		bodyModel[45].setRotationPoint(75F, -36.2F, 10F);

		bodyModel[46].addShapeBox(-1F, -1F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[46].setRotationPoint(-42F, -17F, -24.5F);
		bodyModel[46].rotateAngleX = 0.78539816F;

		bodyModel[47].addShapeBox(-1F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[47].setRotationPoint(-42F, -15.7F, -23.25F);
		bodyModel[47].rotateAngleX = 1.18682389F;

		bodyModel[48].addShapeBox(-1F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[48].setRotationPoint(-42F, -15.7F, 23.25F);
		bodyModel[48].rotateAngleX = -1.18682389F;

		bodyModel[49].addShapeBox(-1F, -1F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(-42F, -17F, 24.5F);
		bodyModel[49].rotateAngleX = -0.78539816F;

		bodyModel[50].addShapeBox(-1F, -1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[50].setRotationPoint(-42F, -18F, 25.5F);

		bodyModel[51].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[51].setRotationPoint(52F, -12F, 21.5F);

		bodyModel[52].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[52].setRotationPoint(81.5F, -12F, 21.5F);

		bodyModel[53].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[53].setRotationPoint(47F, -12F, 21.5F);

		bodyModel[54].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[54].setRotationPoint(76.5F, -12F, 21.5F);

		bodyModel[55].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[55].setRotationPoint(47F, 2F, 21.5F);

		bodyModel[56].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[56].setRotationPoint(76.5F, 2F, 21.5F);

		bodyModel[57].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[57].setRotationPoint(11F, -2F, -25.5F);

		bodyModel[58].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[58].setRotationPoint(-18.5F, -2F, -25.5F);

		bodyModel[59].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[59].setRotationPoint(11F, -2F, 23.5F);

		bodyModel[60].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[60].setRotationPoint(-18.5F, -2F, 23.5F);

		bodyModel[61].addShapeBox(-1.5F, 0F, -1.5F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[61].setRotationPoint(78.5F, -21F, -20.5F);

		bodyModel[62].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[62].setRotationPoint(81.5F, -12F, -19.5F);

		bodyModel[63].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[63].setRotationPoint(76.5F, -12F, -19.5F);

		bodyModel[64].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[64].setRotationPoint(52F, -12F, -19.5F);

		bodyModel[65].addShapeBox(-1.5F, 0F, -1.5F, 2, 24, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[65].setRotationPoint(49F, -21F, -20.5F);

		bodyModel[66].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[66].setRotationPoint(47F, -12F, -19.5F);

		bodyModel[67].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[67].setRotationPoint(47F, 2F, -20.5F);

		bodyModel[68].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[68].setRotationPoint(76.5F, 2F, -20.5F);

		bodyModel[69].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 49
		bodyModel[69].setRotationPoint(81.5F, -2F, -12.5F);

		bodyModel[70].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 49
		bodyModel[70].setRotationPoint(76.5F, -2F, -12.5F);

		bodyModel[71].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 49
		bodyModel[71].setRotationPoint(52F, -2F, -12.5F);

		bodyModel[72].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 49
		bodyModel[72].setRotationPoint(47F, -2F, -12.5F);

		bodyModel[73].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[73].setRotationPoint(48.5F, -2F, 23.5F);

		bodyModel[74].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[74].setRotationPoint(48.5F, -2F, -24.5F);

		bodyModel[75].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[75].setRotationPoint(78F, -2F, 23.5F);

		bodyModel[76].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[76].setRotationPoint(78F, -2F, -24.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 8, 64, 0F,0F, 0.25F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[77].setRotationPoint(106F, -25F, -32F);

		bodyModel[78].addShapeBox(0F, 0F, 2F, 19, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 49
		bodyModel[78].setRotationPoint(87F, -21F, 20F);

		bodyModel[79].addShapeBox(0F, 0F, -1F, 6, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 49
		bodyModel[79].setRotationPoint(-49F, -21F, -20F);

		bodyModel[80].addShapeBox(0F, 0F, -1F, 6, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 49
		bodyModel[80].setRotationPoint(-49F, -21F, 20F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 4, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 49
		bodyModel[81].setRotationPoint(-49F, -8F, -19F);

		bodyModel[82].addShapeBox(-12F, 0F, 0F, 4, 3, 32, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[82].setRotationPoint(87F, -38F, -31F);

		bodyModel[83].addShapeBox(-12F, 0F, 0F, 20, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[83].setRotationPoint(44F, -39F, -30F);

		bodyModel[84].addShapeBox(-12F, 0F, 0F, 20, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[84].setRotationPoint(66F, -39F, -30F);

		bodyModel[85].addShapeBox(-12F, 0F, 0F, 42, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[85].setRotationPoint(44F, -39F, -18F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 100, 22, 0, 0F,-20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F); // Box 49
		bodyModel[86].setRotationPoint(-13F, -39F, 32.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 100, 22, 0, 0F,-20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F, -20F, -4F, 0F); // Box 49
		bodyModel[87].setRotationPoint(-13F, -39F, -32.75F);

		bodyModel[88].addShapeBox(0F, 0F, -12F, 19, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 49
		bodyModel[88].setRotationPoint(87F, -21F, -20F);

		bodyModel[89].addShapeBox(-7F, 0F, 0F, 66, 20, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 49
		bodyModel[89].setRotationPoint(-35F, -23.5F, -20F);

		bodyModel[90].addShapeBox(-7F, 0F, -3F, 66, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[90].setRotationPoint(-35F, -7.5F, -14F);

		bodyModel[91].addShapeBox(0F, -1F, -12F, 88, 14, 12, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[91].setRotationPoint(-49F, -34F, -20F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 49
		turretModel[1] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Box 49
		turretModel[2] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 49
		turretModel[3] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 49
		turretModel[4] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 49
		turretModel[5] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 49
		turretModel[6] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 49
		turretModel[7] = new ModelRendererTurbo(this, 601, 97, textureX, textureY); // Box 49
		turretModel[8] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 49
		turretModel[9] = new ModelRendererTurbo(this, 665, 97, textureX, textureY); // Box 49
		turretModel[10] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 49
		turretModel[11] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 49
		turretModel[12] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 49
		turretModel[13] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 49
		turretModel[14] = new ModelRendererTurbo(this, 897, 129, textureX, textureY); // Box 49
		turretModel[15] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 49
		turretModel[16] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 49
		turretModel[17] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 49
		turretModel[18] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 49
		turretModel[19] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 49
		turretModel[20] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 49
		turretModel[21] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 49
		turretModel[22] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Box 49
		turretModel[23] = new ModelRendererTurbo(this, 641, 137, textureX, textureY); // Box 49
		turretModel[24] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Box 49
		turretModel[25] = new ModelRendererTurbo(this, 761, 137, textureX, textureY); // Box 49
		turretModel[26] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 49
		turretModel[27] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 49
		turretModel[28] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 49
		turretModel[29] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 49
		turretModel[30] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 49
		turretModel[31] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 49
		turretModel[32] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 49
		turretModel[33] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 49
		turretModel[34] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 49
		turretModel[35] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 49
		turretModel[36] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 49
		turretModel[37] = new ModelRendererTurbo(this, 665, 145, textureX, textureY); // Box 49
		turretModel[38] = new ModelRendererTurbo(this, 625, 65, textureX, textureY); // Box 49
		turretModel[39] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 49
		turretModel[40] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 49
		turretModel[41] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 49
		turretModel[42] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 49
		turretModel[43] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 49
		turretModel[44] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 49
		turretModel[45] = new ModelRendererTurbo(this, 609, 193, textureX, textureY); // Box 49

		turretModel[0].addShapeBox(-15F, 0F, -25F, 30, 1, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[0].setRotationPoint(7F, -36F, 0F);

		turretModel[1].addShapeBox(-24F, 6F, 27F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[1].setRotationPoint(7F, -47F, 0F);

		turretModel[2].addShapeBox(-24F, 3F, 27F, 25, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[2].setRotationPoint(7F, -47F, 0F);

		turretModel[3].addBox(-14F, 6F, 23F, 8, 1, 4, 0F); // Box 49
		turretModel[3].setRotationPoint(7F, -47F, 0F);

		turretModel[4].addBox(-14F, 6F, -27F, 8, 1, 4, 0F); // Box 49
		turretModel[4].setRotationPoint(7F, -47F, 0F);

		turretModel[5].addShapeBox(-24F, 6F, 32F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[5].setRotationPoint(7F, -47F, 0F);

		turretModel[6].addShapeBox(-24F, 4F, 26F, 25, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[6].setRotationPoint(7F, -47F, 0F);

		turretModel[7].addShapeBox(-24F, 5F, 35F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[7].setRotationPoint(7F, -47F, 0F);

		turretModel[8].addShapeBox(-24F, 5F, 30F, 25, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[8].setRotationPoint(7F, -47F, 0F);

		turretModel[9].addShapeBox(-24F, 5F, 26F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[9].setRotationPoint(7F, -47F, 0F);

		turretModel[10].addShapeBox(-24F, 6F, 30F, 25, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		turretModel[10].setRotationPoint(7F, -47F, 0F);

		turretModel[11].addShapeBox(-24F, 5F, 32F, 25, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[11].setRotationPoint(7F, -47F, 0F);

		turretModel[12].addShapeBox(-24F, 7F, 32F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		turretModel[12].setRotationPoint(7F, -47F, 0F);

		turretModel[13].addShapeBox(-24F, 7F, 27F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		turretModel[13].setRotationPoint(7F, -47F, 0F);

		turretModel[14].addShapeBox(-24F, 5F, 27F, 25, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[14].setRotationPoint(7F, -47F, 0F);

		turretModel[15].addShapeBox(-24F, 6F, -35F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[15].setRotationPoint(7F, -47F, 0F);

		turretModel[16].addShapeBox(-24F, 5F, -35F, 25, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[16].setRotationPoint(7F, -47F, 0F);

		turretModel[17].addShapeBox(-24F, 7F, -35F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		turretModel[17].setRotationPoint(7F, -47F, 0F);

		turretModel[18].addShapeBox(-24F, 7F, -30F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		turretModel[18].setRotationPoint(7F, -47F, 0F);

		turretModel[19].addShapeBox(-24F, 6F, -30F, 25, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[19].setRotationPoint(7F, -47F, 0F);

		turretModel[20].addShapeBox(-24F, 5F, -30F, 25, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[20].setRotationPoint(7F, -47F, 0F);

		turretModel[21].addShapeBox(-24F, 5F, -27F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[21].setRotationPoint(7F, -47F, 0F);

		turretModel[22].addShapeBox(-24F, 3F, -35F, 25, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[22].setRotationPoint(7F, -47F, 0F);

		turretModel[23].addShapeBox(-24F, 4F, -36F, 25, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[23].setRotationPoint(7F, -47F, 0F);

		turretModel[24].addShapeBox(-24F, 5F, -36F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[24].setRotationPoint(7F, -47F, 0F);

		turretModel[25].addShapeBox(-24F, 5F, -32F, 25, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[25].setRotationPoint(7F, -47F, 0F);

		turretModel[26].addShapeBox(-24F, 6F, -32F, 25, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		turretModel[26].setRotationPoint(7F, -47F, 0F);

		turretModel[27].addShapeBox(15F, 0F, -25F, 10, 1, 50, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 49
		turretModel[27].setRotationPoint(7F, -36F, 0F);

		turretModel[28].addShapeBox(-25F, 0F, -25F, 10, 1, 50, 0F,0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 49
		turretModel[28].setRotationPoint(7F, -36F, 0F);

		turretModel[29].addShapeBox(-8F, -4F, -4F, 23, 4, 29, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[29].setRotationPoint(7F, -36F, 0F);

		turretModel[30].addShapeBox(15F, -4F, -4F, 10, 4, 29, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -10F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 49
		turretModel[30].setRotationPoint(7F, -36F, 0F);

		turretModel[31].addShapeBox(-8F, -10F, -25F, 14, 10, 16, 0F,0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[31].setRotationPoint(7F, -36F, 0F);

		turretModel[32].addShapeBox(6F, -10F, -25F, 4, 10, 16, 0F,0F, 0F, -2F, 0F, -2F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[32].setRotationPoint(7F, -36F, 0F);

		turretModel[33].addShapeBox(10F, -7.5F, -17F, 6, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[33].setRotationPoint(7F, -36F, 0F);

		turretModel[34].addShapeBox(10F, -7F, -21F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[34].setRotationPoint(7F, -36F, 0F);

		turretModel[35].addShapeBox(10F, -7F, -15F, 6, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 49
		turretModel[35].setRotationPoint(7F, -36F, 0F);

		turretModel[36].addShapeBox(16F, -7.5F, -17F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[36].setRotationPoint(7F, -36F, 0F);

		turretModel[37].addShapeBox(-25F, -12F, -25F, 17, 12, 50, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[37].setRotationPoint(7F, -36F, 0F);

		turretModel[38].addShapeBox(-2F, -15.5F, 10F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[38].setRotationPoint(7F, -36F, 0F);

		turretModel[39].addShapeBox(-8F, -15.5F, 10F, 6, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[39].setRotationPoint(7F, -36F, 0F);

		turretModel[40].addShapeBox(-8F, -15F, 6F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[40].setRotationPoint(7F, -36F, 0F);

		turretModel[41].addShapeBox(-8F, -10F, -4F, 3, 4, 28, 0F,0F, 2F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -0.1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.1F, 0F, 0F, 0F); // Box 49
		turretModel[41].setRotationPoint(7F, -36F, 0F);

		turretModel[42].addShapeBox(-8F, -15F, 12F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		turretModel[42].setRotationPoint(7F, -36F, 0F);

		turretModel[43].addShapeBox(-35F, -12F, -25F, 10, 9, 50, 0F,0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -6F, 0F, 0F, -6F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -6F); // Box 49
		turretModel[43].setRotationPoint(7F, -36F, 0F);

		turretModel[44].addShapeBox(-8F, -8F, 5F, 23, 2, 19, 0F,0F, 2F, 0F, -2F, 1F, 0F, -2F, 1F, -0.2F, 0F, 2F, -0.7F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0F); // Box 49
		turretModel[44].setRotationPoint(7F, -36F, 0F);

		turretModel[45].addShapeBox(15F, -9F, 5F, 10, 8, 20, 0F,2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, -10F, 2F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -3F, -0.5F); // Box 49
		turretModel[45].setRotationPoint(7F, -36F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 577, 153, textureX, textureY); // Box 49
		barrelModel[1] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 49
		barrelModel[2] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 49
		barrelModel[3] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 49
		barrelModel[4] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 49
		barrelModel[5] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 49

		barrelModel[0].addShapeBox(2F, -1F, 1F, 50, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 49
		barrelModel[0].setRotationPoint(0F, -46F, 0F);
		barrelModel[0].rotateAngleZ = 0.01745329F;

		barrelModel[1].addShapeBox(52F, -1F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		barrelModel[1].setRotationPoint(0F, -46F, 0F);
		barrelModel[1].rotateAngleZ = 0.01745329F;

		barrelModel[2].addShapeBox(1F, -1.5F, -2F, 16, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		barrelModel[2].setRotationPoint(0F, -46F, 0F);
		barrelModel[2].rotateAngleZ = 0.01745329F;

		barrelModel[3].addShapeBox(-2F, -1F, -3.5F, 4, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		barrelModel[3].setRotationPoint(0F, -46F, 0F);
		barrelModel[3].rotateAngleZ = 0.01745329F;

		barrelModel[4].addShapeBox(-2F, -2F, -3.5F, 4, 1, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		barrelModel[4].setRotationPoint(0F, -46F, 0F);
		barrelModel[4].rotateAngleZ = 0.01745329F;

		barrelModel[5].addShapeBox(-2F, 1F, -3.5F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 49
		barrelModel[5].setRotationPoint(0F, -46F, 0F);
		barrelModel[5].rotateAngleZ = 0.01745329F;
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 49
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 49
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 49
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 49
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 49
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 49
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 49
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 49
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 49
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 49
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 49
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 49
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 49
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 713, 97, textureX, textureY); // Box 49
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 681, 57, textureX, textureY); // Box 49
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 569, 57, textureX, textureY); // Box 49
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 49
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 49
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 49
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 49
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 49
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 49
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 537, 81, textureX, textureY); // Box 49
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 49
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 49
		leftFrontWheelModel[25] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 49
		leftFrontWheelModel[26] = new ModelRendererTurbo(this, 825, 97, textureX, textureY); // Box 49
		leftFrontWheelModel[27] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 49

		leftFrontWheelModel[0].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftFrontWheelModel[0].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[1].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		leftFrontWheelModel[1].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[2].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		leftFrontWheelModel[2].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[3].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		leftFrontWheelModel[3].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[4].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftFrontWheelModel[4].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[5].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[5].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[6].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[6].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[7].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[7].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[8].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[8].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[9].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftFrontWheelModel[9].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[10].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		leftFrontWheelModel[10].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[11].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		leftFrontWheelModel[11].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[12].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		leftFrontWheelModel[12].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[13].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftFrontWheelModel[13].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[14].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[14].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[15].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[15].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[16].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[16].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[17].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[17].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[18].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 49
		leftFrontWheelModel[18].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[19].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[19].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[20].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftFrontWheelModel[20].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[21].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 49
		leftFrontWheelModel[21].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[22].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 49
		leftFrontWheelModel[22].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[23].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 49
		leftFrontWheelModel[23].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[24].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 49
		leftFrontWheelModel[24].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[25].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 49
		leftFrontWheelModel[25].setRotationPoint(78F, -1F, 25F);

		leftFrontWheelModel[26].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 49
		leftFrontWheelModel[26].setRotationPoint(48.5F, -1F, 25F);

		leftFrontWheelModel[27].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 49
		leftFrontWheelModel[27].setRotationPoint(48.5F, -1F, 25F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 49
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 49
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 49
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 49
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 49
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 49
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 49
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 49
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 49
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 49
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 49
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 49
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 49
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 49
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 49
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 49
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 49
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 625, 57, textureX, textureY); // Box 49
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 49
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 49
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 49
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 49
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 49
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 49
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 49
		rightFrontWheelModel[25] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 49
		rightFrontWheelModel[26] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 49
		rightFrontWheelModel[27] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 49

		rightFrontWheelModel[0].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[0].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[1].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		rightFrontWheelModel[1].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[2].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightFrontWheelModel[2].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[3].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[3].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[4].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[4].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[5].addShapeBox(-3.5F, -1.5F, -7F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[5].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[6].addShapeBox(-3.5F, 1.5F, -7F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightFrontWheelModel[6].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[7].addShapeBox(-3.5F, -3.5F, -7F, 7, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[7].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[8].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[8].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[9].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[9].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[10].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		rightFrontWheelModel[10].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[11].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightFrontWheelModel[11].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[12].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[12].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[13].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[13].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[14].addShapeBox(-3.5F, -1.5F, -7F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[14].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[15].addShapeBox(-3.5F, 1.5F, -7F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightFrontWheelModel[15].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[16].addShapeBox(-3.5F, -3.5F, -7F, 7, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[16].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[17].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[17].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[18].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 49
		rightFrontWheelModel[18].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[19].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[19].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[20].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightFrontWheelModel[20].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[21].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 49
		rightFrontWheelModel[21].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[22].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 49
		rightFrontWheelModel[22].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[23].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 49
		rightFrontWheelModel[23].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[24].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 49
		rightFrontWheelModel[24].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[25].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 49
		rightFrontWheelModel[25].setRotationPoint(78F, -1F, -25F);

		rightFrontWheelModel[26].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 49
		rightFrontWheelModel[26].setRotationPoint(48.5F, -1F, -25F);

		rightFrontWheelModel[27].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 49
		rightFrontWheelModel[27].setRotationPoint(48.5F, -1F, -25F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 49
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 49
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 785, 145, textureX, textureY); // Box 49
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 897, 145, textureX, textureY); // Box 49
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 49
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 49
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 969, 65, textureX, textureY); // Box 49
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 969, 73, textureX, textureY); // Box 49
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 49
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 49
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 49
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 49
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 681, 153, textureX, textureY); // Box 49
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 49
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 49
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 49
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 49
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 49
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 49
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 49
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 49
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 641, 161, textureX, textureY); // Box 49
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 753, 169, textureX, textureY); // Box 49
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 49
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 49
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 49
		leftBackWheelModel[26] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 49
		leftBackWheelModel[27] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 49

		leftBackWheelModel[0].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftBackWheelModel[0].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[1].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		leftBackWheelModel[1].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[2].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		leftBackWheelModel[2].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[3].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		leftBackWheelModel[3].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[4].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftBackWheelModel[4].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[5].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftBackWheelModel[5].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[6].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 49
		leftBackWheelModel[6].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[7].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftBackWheelModel[7].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[8].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftBackWheelModel[8].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[9].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftBackWheelModel[9].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[10].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		leftBackWheelModel[10].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[11].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		leftBackWheelModel[11].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[12].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		leftBackWheelModel[12].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[13].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftBackWheelModel[13].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[14].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftBackWheelModel[14].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[15].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 49
		leftBackWheelModel[15].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[16].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftBackWheelModel[16].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[17].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftBackWheelModel[17].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[18].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 49
		leftBackWheelModel[18].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[19].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftBackWheelModel[19].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[20].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 49
		leftBackWheelModel[20].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[21].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 49
		leftBackWheelModel[21].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[22].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 49
		leftBackWheelModel[22].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[23].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 49
		leftBackWheelModel[23].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[24].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 49
		leftBackWheelModel[24].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[25].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 49
		leftBackWheelModel[25].setRotationPoint(11F, -1F, 25F);

		leftBackWheelModel[26].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 49
		leftBackWheelModel[26].setRotationPoint(-18.5F, -1F, 25F);

		leftBackWheelModel[27].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 49
		leftBackWheelModel[27].setRotationPoint(-18.5F, -1F, 25F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // Box 49
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 601, 177, textureX, textureY); // Box 49
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Box 49
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 49
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 833, 177, textureX, textureY); // Box 49
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 49
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 49
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 49
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 49
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 49
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 49
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 49
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 49
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 913, 185, textureX, textureY); // Box 49
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 49
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 689, 105, textureX, textureY); // Box 49
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 825, 113, textureX, textureY); // Box 49
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 49
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 961, 185, textureX, textureY); // Box 49
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 49
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 49
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 993, 185, textureX, textureY); // Box 49
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 49
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 49
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 49
		rightBackWheelModel[25] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 49
		rightBackWheelModel[26] = new ModelRendererTurbo(this, 513, 193, textureX, textureY); // Box 49
		rightBackWheelModel[27] = new ModelRendererTurbo(this, 545, 193, textureX, textureY); // Box 49

		rightBackWheelModel[0].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[0].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[1].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		rightBackWheelModel[1].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[2].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightBackWheelModel[2].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[3].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[3].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[4].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[4].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[5].addShapeBox(-3.5F, -1.5F, -7F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[5].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[6].addShapeBox(-3.5F, 1.5F, -7F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightBackWheelModel[6].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[7].addShapeBox(-3.5F, -3.5F, -7F, 7, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[7].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[8].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[8].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[9].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[9].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[10].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 49
		rightBackWheelModel[10].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[11].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightBackWheelModel[11].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[12].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[12].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[13].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[13].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[14].addShapeBox(-3.5F, -1.5F, -7F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[14].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[15].addShapeBox(-3.5F, 1.5F, -7F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 49
		rightBackWheelModel[15].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[16].addShapeBox(-3.5F, -3.5F, -7F, 7, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[16].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[17].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[17].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[18].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 49
		rightBackWheelModel[18].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[19].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[19].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[20].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		rightBackWheelModel[20].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[21].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 49
		rightBackWheelModel[21].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[22].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 49
		rightBackWheelModel[22].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[23].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 49
		rightBackWheelModel[23].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[24].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 49
		rightBackWheelModel[24].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[25].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 49
		rightBackWheelModel[25].setRotationPoint(11F, -1F, -25F);

		rightBackWheelModel[26].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 49
		rightBackWheelModel[26].setRotationPoint(-18.5F, -1F, -25F);

		rightBackWheelModel[27].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 49
		rightBackWheelModel[27].setRotationPoint(-18.5F, -1F, -25F);
	}
}