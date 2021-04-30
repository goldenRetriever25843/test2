//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Abrams
// Model Creator: 
// Created on: 07.06.2015 - 18:23:09
// Last changed on: 07.06.2015 - 18:23:09

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelK188 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelK188() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[117];
		turretModel = new ModelRendererTurbo[181];
		barrelModel = new ModelRendererTurbo[26];
		leftTrackWheelModels = new ModelRendererTurbo[154];
		rightTrackWheelModels = new ModelRendererTurbo[154];
		leftTrackModel = new ModelRendererTurbo[11];
		rightTrackModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 15
		bodyModel[17] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 15
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[19] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[21] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 15
		bodyModel[22] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 15
		bodyModel[23] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		bodyModel[24] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		bodyModel[25] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 15
		bodyModel[26] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		bodyModel[27] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
		bodyModel[28] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		bodyModel[29] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		bodyModel[30] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 15
		bodyModel[31] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 15
		bodyModel[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 15
		bodyModel[33] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 15
		bodyModel[34] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 15
		bodyModel[35] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 15
		bodyModel[36] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 15
		bodyModel[37] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 15
		bodyModel[38] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 15
		bodyModel[39] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 15
		bodyModel[40] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 15
		bodyModel[41] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 15
		bodyModel[42] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Box 15
		bodyModel[43] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 15
		bodyModel[44] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 15
		bodyModel[45] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 15
		bodyModel[46] = new ModelRendererTurbo(this, 849, 81, textureX, textureY); // Box 15
		bodyModel[47] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 15
		bodyModel[48] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 15
		bodyModel[49] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 15
		bodyModel[50] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 15
		bodyModel[51] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 15
		bodyModel[52] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 15
		bodyModel[53] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 15
		bodyModel[54] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 15
		bodyModel[55] = new ModelRendererTurbo(this, 817, 137, textureX, textureY); // Box 15
		bodyModel[56] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 15
		bodyModel[57] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 15
		bodyModel[58] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 15
		bodyModel[59] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 15
		bodyModel[60] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 15
		bodyModel[61] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 15
		bodyModel[62] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 15
		bodyModel[63] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Box 15
		bodyModel[64] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 15
		bodyModel[65] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 15
		bodyModel[66] = new ModelRendererTurbo(this, 969, 193, textureX, textureY); // Box 15
		bodyModel[67] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 15
		bodyModel[68] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 15
		bodyModel[69] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 15
		bodyModel[70] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 15
		bodyModel[71] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 15
		bodyModel[72] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 15
		bodyModel[73] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Box 15
		bodyModel[74] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 15
		bodyModel[75] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 15
		bodyModel[76] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 15
		bodyModel[77] = new ModelRendererTurbo(this, 921, 225, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 1
		bodyModel[79] = new ModelRendererTurbo(this, 561, 241, textureX, textureY); // Box 2
		bodyModel[80] = new ModelRendererTurbo(this, 545, 225, textureX, textureY); // Box 3
		bodyModel[81] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 4
		bodyModel[82] = new ModelRendererTurbo(this, 969, 225, textureX, textureY); // Box 5
		bodyModel[83] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 6
		bodyModel[84] = new ModelRendererTurbo(this, 697, 233, textureX, textureY); // Box 7
		bodyModel[85] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 8
		bodyModel[86] = new ModelRendererTurbo(this, 649, 225, textureX, textureY); // Box 9
		bodyModel[87] = new ModelRendererTurbo(this, 817, 241, textureX, textureY); // Box 10
		bodyModel[88] = new ModelRendererTurbo(this, 737, 249, textureX, textureY); // Box 15
		bodyModel[89] = new ModelRendererTurbo(this, 513, 257, textureX, textureY); // Box 15
		bodyModel[90] = new ModelRendererTurbo(this, 849, 257, textureX, textureY); // Box 15
		bodyModel[91] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Box 15
		bodyModel[92] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 15
		bodyModel[93] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 15
		bodyModel[94] = new ModelRendererTurbo(this, 625, 265, textureX, textureY); // Box 15
		bodyModel[95] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 15
		bodyModel[96] = new ModelRendererTurbo(this, 513, 273, textureX, textureY); // Box 15
		bodyModel[97] = new ModelRendererTurbo(this, 737, 273, textureX, textureY); // Box 15
		bodyModel[98] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 529
		bodyModel[99] = new ModelRendererTurbo(this, 977, 177, textureX, textureY); // Box 530
		bodyModel[100] = new ModelRendererTurbo(this, 713, 185, textureX, textureY); // Box 531
		bodyModel[101] = new ModelRendererTurbo(this, 777, 193, textureX, textureY); // Box 532
		bodyModel[102] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 533
		bodyModel[103] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 534
		bodyModel[104] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 545
		bodyModel[105] = new ModelRendererTurbo(this, 841, 273, textureX, textureY); // Box 546
		bodyModel[106] = new ModelRendererTurbo(this, 873, 273, textureX, textureY); // Box 547
		bodyModel[107] = new ModelRendererTurbo(this, 945, 305, textureX, textureY); // Box 639
		bodyModel[108] = new ModelRendererTurbo(this, 409, 313, textureX, textureY); // Box 640
		bodyModel[109] = new ModelRendererTurbo(this, 649, 313, textureX, textureY); // Box 641
		bodyModel[110] = new ModelRendererTurbo(this, 673, 313, textureX, textureY); // Box 642
		bodyModel[111] = new ModelRendererTurbo(this, 825, 313, textureX, textureY); // Box 643
		bodyModel[112] = new ModelRendererTurbo(this, 977, 313, textureX, textureY); // Box 644
		bodyModel[113] = new ModelRendererTurbo(this, 857, 313, textureX, textureY); // Box 645
		bodyModel[114] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 1
		bodyModel[115] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 1
		bodyModel[116] = new ModelRendererTurbo(this, 761, 161, textureX, textureY); // Box 1

		bodyModel[0].addShapeBox(-3F, 0F, 0F, 7, 3, 40, 0F,0F, -0.85F, 0F, -2F, -1.85F, 0F, -2F, -1.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[0].setRotationPoint(57F, -18F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[1].setRotationPoint(57F, -15F, -20F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 5, 40, 0F,0F, 0.2F, 0F, 0F, -2.85F, 0F, 0F, -2.85F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 15
		bodyModel[2].setRotationPoint(34F, -20F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 8, 40, 0F,0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[3].setRotationPoint(20F, -22F, -20F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 5, 14, 0F,0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[4].setRotationPoint(20F, -22F, -34F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 5, 14, 0F,0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[5].setRotationPoint(20F, -22F, 20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 20, 3, 14, 0F,0F, 0.2F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[6].setRotationPoint(34F, -20F, 20F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 8, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[7].setRotationPoint(-28F, -22F, -20F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 20, 11, 40, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[8].setRotationPoint(-48F, -25F, -20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 20, 8, 14, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-48F, -25F, -34F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 30, 6, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[10].setRotationPoint(-78F, -25F, -34F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 2, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[11].setRotationPoint(-78F, -19F, -34F);

		bodyModel[12].addShapeBox(1F, -3F, -27F, 1, 10, 54, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		bodyModel[12].setRotationPoint(-80F, -19F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -16F, 2F, 0F, -16F, 2F, 0F, 0F, 2F, 0F); // Box 15
		bodyModel[13].setRotationPoint(40F, -5F, -20F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 104, 2, 40, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-63F, -2F, -20F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 15, 14, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -12F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-78F, -14F, -20F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 103, 12, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[16].setRotationPoint(-63F, -14F, -20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 16, 9, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[17].setRotationPoint(40F, -14F, -20F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[18].setRotationPoint(58F, -17F, -18.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.50F, -0.50F, 0F, -0.50F, -0.50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.50F, -0.50F, 0F, -0.50F, -0.50F, 0F, 0F, 0F); // Box 15
		bodyModel[19].setRotationPoint(60F, -17F, -18.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.50F, -0.50F, 0F, -0.50F, -0.50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.50F, -0.50F, 0F, -0.50F, -0.50F, 0F, 0F, 0F); // Box 15
		bodyModel[20].setRotationPoint(60F, -17F, -16F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[21].setRotationPoint(58F, -17F, -16F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[22].setRotationPoint(59F, -17F, -13.8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[23].setRotationPoint(59F, -18F, -19.8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[24].setRotationPoint(57F, -17F, -19.8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[25].setRotationPoint(58F, -17F, 16.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.50F, -0.50F, 0F, -0.50F, -0.50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.50F, -0.50F, 0F, -0.50F, -0.50F, 0F, 0F, 0F); // Box 15
		bodyModel[26].setRotationPoint(60F, -17F, 16.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.50F, -0.50F, 0F, -0.50F, -0.50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.50F, -0.50F, 0F, -0.50F, -0.50F, 0F, 0F, 0F); // Box 15
		bodyModel[27].setRotationPoint(60F, -17F, 14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[28].setRotationPoint(58F, -17F, 14F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[29].setRotationPoint(59F, -17F, 12.8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[30].setRotationPoint(59F, -18F, 12.8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[31].setRotationPoint(57F, -17F, 18.8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[32].setRotationPoint(-80F, -21.5F, -33F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[33].setRotationPoint(-80F, -19.5F, -33F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 15
		bodyModel[34].setRotationPoint(-80F, -17.5F, -33F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[35].setRotationPoint(-80F, -21.5F, 27F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[36].setRotationPoint(-80F, -19.5F, 27F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 15
		bodyModel[37].setRotationPoint(-80F, -17.5F, 27F);

		bodyModel[38].addShapeBox(-27F, -1F, 0F, 48, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[38].setRotationPoint(-1F, -21F, -34F);

		bodyModel[39].addShapeBox(-27F, -1F, 0F, 48, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[39].setRotationPoint(-1F, -21F, 20F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 28, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[40].setRotationPoint(-78F, -17F, -20F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 21, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 15
		bodyModel[41].setRotationPoint(-78F, -22F, -35F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 48, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[42].setRotationPoint(-28F, -22F, -35F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[43].setRotationPoint(-57F, -22F, -35F);

		bodyModel[44].addShapeBox(-2F, 0F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[44].setRotationPoint(55.5F, -10.5F, -19F);

		bodyModel[45].addShapeBox(-2F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[45].setRotationPoint(55.5F, -10.5F, 19F);

		bodyModel[46].addShapeBox(-2F, -2F, -4F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[46].setRotationPoint(-67F, -9F, -19F);

		bodyModel[47].addShapeBox(-2F, -2F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[47].setRotationPoint(-67F, -9F, 19F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 15
		bodyModel[48].setRotationPoint(29F, -21F, 1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[49].setRotationPoint(31F, -21F, 1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 15
		bodyModel[50].setRotationPoint(34F, -21F, 1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 15
		bodyModel[51].setRotationPoint(37F, -21F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[52].setRotationPoint(37F, -1F, 19F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[53].setRotationPoint(-54.5F, -1F, 19F);

		bodyModel[54].addShapeBox(0F, 0F, -14F, 20, 8, 14, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[54].setRotationPoint(-48F, -25F, 34F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 30, 3, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[55].setRotationPoint(-78F, -25F, -35F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[56].setRotationPoint(20F, -1F, 19F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[57].setRotationPoint(-1F, -1F, 19F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[58].setRotationPoint(-19F, -1F, 19F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[59].setRotationPoint(-37F, -1F, 19F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 20, 3, 14, 0F,0F, 0.2F, 0F, 0F, -2.4F, 0F, 0F, -2.4F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[60].setRotationPoint(34F, -20F, -34F);

		bodyModel[61].addShapeBox(0F, 1.4F, -7F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.6F, 0F, 1F, 1.6F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[61].setRotationPoint(54F, -19F, -27F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		bodyModel[62].setRotationPoint(-78F, -17F, -35F);

		bodyModel[63].addShapeBox(0F, 0F, -16F, 1, 7, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		bodyModel[63].setRotationPoint(-78F, -17F, 35F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[64].setRotationPoint(-50F, -17F, -20F);

		bodyModel[65].addShapeBox(0F, 0F, 6F, 6, 8, 1, 0F,-1F, -2.6F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2.6F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -4F, 0F, 0F); // Box 15
		bodyModel[65].setRotationPoint(59F, -17.6F, -27F);

		bodyModel[66].addShapeBox(0F, 0F, -7F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0.6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0.6F, 0F); // Box 15
		bodyModel[66].setRotationPoint(59F, -17.6F, -27F);

		bodyModel[67].addShapeBox(3F, -1F, -6F, 1, 8, 12, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, 0.25F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0.25F, 0F); // Box 15
		bodyModel[67].setRotationPoint(59F, -17.6F, -27F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 43, 12, 1, 0F,0F, -1F, 0F, -5F, -6F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[68].setRotationPoint(20F, -22F, -35F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[69].setRotationPoint(20F, -10F, -35F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[70].setRotationPoint(53F, -10F, -35F);

		bodyModel[71].addShapeBox(0F, 0F, -7F, 6, 8, 1, 0F,-1F, -2.6F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2.6F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -4F, 0F, 0F); // Box 15
		bodyModel[71].setRotationPoint(59F, -17.6F, -27F);

		bodyModel[72].addShapeBox(3F, -1F, -6F, 1, 8, 12, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, 0.25F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0.25F, 0F); // Box 15
		bodyModel[72].setRotationPoint(59F, -17.6F, 27F);

		bodyModel[73].addShapeBox(0F, 0F, -7F, 6, 8, 1, 0F,-1F, -2.6F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2.6F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -4F, 0F, 0F); // Box 15
		bodyModel[73].setRotationPoint(59F, -17.6F, 27F);

		bodyModel[74].addShapeBox(0F, 0F, -7F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0.6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0.6F, 0F); // Box 15
		bodyModel[74].setRotationPoint(59F, -17.6F, 27F);

		bodyModel[75].addShapeBox(0F, 0F, 6F, 6, 8, 1, 0F,-1F, -2.6F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2.6F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -4F, 0F, 0F); // Box 15
		bodyModel[75].setRotationPoint(59F, -17.6F, 27F);

		bodyModel[76].addShapeBox(0F, 1.4F, -7F, 5, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.6F, 0F, 1F, 1.6F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[76].setRotationPoint(54F, -19F, 27F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 20, 15, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[77].setRotationPoint(-48F, -22F, -35F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[78].setRotationPoint(-48F, -25F, -35F);

		bodyModel[79].addShapeBox(0F, 0F, -1F, 43, 12, 1, 0F,0F, 0F, 0F, -4F, -5F, 0F, -5F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[79].setRotationPoint(20F, -22F, 35F);

		bodyModel[80].addShapeBox(0F, 0F, -1F, 33, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[80].setRotationPoint(20F, -10F, 35F);

		bodyModel[81].addShapeBox(0F, 0F, -1F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -1F, 0F, 0F, -1F, 0F); // Box 4
		bodyModel[81].setRotationPoint(53F, -10F, 35F);

		bodyModel[82].addShapeBox(0F, 0F, -1F, 20, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 5
		bodyModel[82].setRotationPoint(-48F, -22F, 35F);

		bodyModel[83].addShapeBox(0F, 0F, -1F, 9, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[83].setRotationPoint(-57F, -22F, 35F);

		bodyModel[84].addShapeBox(0F, 0F, -1F, 21, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F); // Box 7
		bodyModel[84].setRotationPoint(-78F, -22F, 35F);

		bodyModel[85].addShapeBox(0F, 0F, -1F, 48, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[85].setRotationPoint(-28F, -22F, 35F);

		bodyModel[86].addShapeBox(0F, 0F, -1F, 20, 3, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[86].setRotationPoint(-48F, -25F, 35F);

		bodyModel[87].addShapeBox(0F, 0F, -1F, 30, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 10
		bodyModel[87].setRotationPoint(-78F, -25F, 35F);

		bodyModel[88].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[88].setRotationPoint(-7F, -26F, 0F);

		bodyModel[89].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[89].setRotationPoint(-7F, -26F, 0F);
		bodyModel[89].rotateAngleY = 0.31415927F;

		bodyModel[90].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[90].setRotationPoint(-7F, -26F, 0F);
		bodyModel[90].rotateAngleY = -0.31415927F;

		bodyModel[91].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[91].setRotationPoint(-7F, -26F, 0F);
		bodyModel[91].rotateAngleY = -0.9424778F;

		bodyModel[92].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[92].setRotationPoint(-7F, -26F, 0F);
		bodyModel[92].rotateAngleY = -1.25663706F;

		bodyModel[93].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[93].setRotationPoint(-7F, -26F, 0F);
		bodyModel[93].rotateAngleY = -1.57079633F;

		bodyModel[94].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[94].setRotationPoint(-7F, -26F, 0F);
		bodyModel[94].rotateAngleY = -1.88495559F;

		bodyModel[95].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[95].setRotationPoint(-7F, -26F, 0F);
		bodyModel[95].rotateAngleY = -2.19911486F;

		bodyModel[96].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[96].setRotationPoint(-7F, -26F, 0F);
		bodyModel[96].rotateAngleY = -2.51327412F;

		bodyModel[97].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[97].setRotationPoint(-7F, -26F, 0F);
		bodyModel[97].rotateAngleY = -0.62831853F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[98].setRotationPoint(37F, -1F, -23F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[99].setRotationPoint(20F, -1F, -23F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[100].setRotationPoint(-1F, -1F, -23F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[101].setRotationPoint(-19F, -1F, -23F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[102].setRotationPoint(-37F, -1F, -23F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[103].setRotationPoint(-55.5F, -1F, -23F);

		bodyModel[104].addShapeBox(-72F, 16F, 8F, 3, 2, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 545
		bodyModel[104].setRotationPoint(0F, -42F, 0F);

		bodyModel[105].addShapeBox(-67F, 16F, 6F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[105].setRotationPoint(2F, -42F, 0F);

		bodyModel[106].addShapeBox(-57F, 16F, 8F, 3, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 547
		bodyModel[106].setRotationPoint(0F, -42F, 0F);

		bodyModel[107].addShapeBox(-64F, 16F, 6F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 639
		bodyModel[107].setRotationPoint(3F, -42F, 0F);

		bodyModel[108].addShapeBox(-65F, 16F, 6F, 4, 2, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 640
		bodyModel[108].setRotationPoint(-4F, -42F, 0F);

		bodyModel[109].addShapeBox(-57F, 16F, -22F, 3, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 641
		bodyModel[109].setRotationPoint(0F, -42F, 0F);

		bodyModel[110].addShapeBox(-67F, 16F, -24F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 642
		bodyModel[110].setRotationPoint(2F, -42F, 0F);

		bodyModel[111].addShapeBox(-64F, 16F, -24F, 4, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 643
		bodyModel[111].setRotationPoint(3F, -42F, 0F);

		bodyModel[112].addShapeBox(-65F, 16F, -24F, 4, 2, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 644
		bodyModel[112].setRotationPoint(-4F, -42F, 0F);

		bodyModel[113].addShapeBox(-72F, 16F, -22F, 3, 2, 14, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 645
		bodyModel[113].setRotationPoint(0F, -42F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[114].setRotationPoint(36.65F, -22.5F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[115].setRotationPoint(35.25F, -22.5F, 5F);
		bodyModel[115].rotateAngleY = -0.78539816F;

		bodyModel[116].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[116].setRotationPoint(35.25F, -22.5F, 13F);
		bodyModel[116].rotateAngleY = 0.78539816F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 15
		turretModel[1] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 15
		turretModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 15
		turretModel[3] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 15
		turretModel[4] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 15
		turretModel[5] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 15
		turretModel[6] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 15
		turretModel[7] = new ModelRendererTurbo(this, 809, 9, textureX, textureY); // Box 15
		turretModel[8] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 15
		turretModel[9] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 15
		turretModel[10] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 15
		turretModel[11] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 15
		turretModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 15
		turretModel[13] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 15
		turretModel[14] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 15
		turretModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		turretModel[16] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 15
		turretModel[17] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 15
		turretModel[18] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 15
		turretModel[19] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 15
		turretModel[20] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 15
		turretModel[21] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 15
		turretModel[22] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 15
		turretModel[23] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 15
		turretModel[24] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 15
		turretModel[25] = new ModelRendererTurbo(this, 609, 49, textureX, textureY); // Box 15
		turretModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		turretModel[27] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 15
		turretModel[28] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 15
		turretModel[29] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 15
		turretModel[30] = new ModelRendererTurbo(this, 617, 57, textureX, textureY); // Box 15
		turretModel[31] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 15
		turretModel[32] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 15
		turretModel[33] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 15
		turretModel[34] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 15
		turretModel[35] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 15
		turretModel[36] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 15
		turretModel[37] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 15
		turretModel[38] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 15
		turretModel[39] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 15
		turretModel[40] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 15
		turretModel[41] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 15
		turretModel[42] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 15
		turretModel[43] = new ModelRendererTurbo(this, 857, 9, textureX, textureY); // Box 15
		turretModel[44] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 15
		turretModel[45] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 15
		turretModel[46] = new ModelRendererTurbo(this, 929, 177, textureX, textureY); // Box 15
		turretModel[47] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 15
		turretModel[48] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Box 15
		turretModel[49] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 15
		turretModel[50] = new ModelRendererTurbo(this, 713, 185, textureX, textureY); // Box 15
		turretModel[51] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 15
		turretModel[52] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 15
		turretModel[53] = new ModelRendererTurbo(this, 777, 193, textureX, textureY); // Box 15
		turretModel[54] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 15
		turretModel[55] = new ModelRendererTurbo(this, 921, 201, textureX, textureY); // Box 15
		turretModel[56] = new ModelRendererTurbo(this, 737, 209, textureX, textureY); // Box 15
		turretModel[57] = new ModelRendererTurbo(this, 849, 209, textureX, textureY); // Box 15
		turretModel[58] = new ModelRendererTurbo(this, 865, 209, textureX, textureY); // Box 15
		turretModel[59] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 15
		turretModel[60] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 15
		turretModel[61] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 15
		turretModel[62] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 15
		turretModel[63] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 15
		turretModel[64] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 15
		turretModel[65] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 15
		turretModel[66] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 15
		turretModel[67] = new ModelRendererTurbo(this, 545, 145, textureX, textureY); // Box 15
		turretModel[68] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 15
		turretModel[69] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 15
		turretModel[70] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 15
		turretModel[71] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 15
		turretModel[72] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 15
		turretModel[73] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 15
		turretModel[74] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 15
		turretModel[75] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 15
		turretModel[76] = new ModelRendererTurbo(this, 601, 153, textureX, textureY); // Box 15
		turretModel[77] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 15
		turretModel[78] = new ModelRendererTurbo(this, 601, 57, textureX, textureY); // Box 15
		turretModel[79] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 15
		turretModel[80] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 15
		turretModel[81] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 15
		turretModel[82] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 15
		turretModel[83] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 15
		turretModel[84] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 15
		turretModel[85] = new ModelRendererTurbo(this, 777, 185, textureX, textureY); // Box 15
		turretModel[86] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 15
		turretModel[87] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 15
		turretModel[88] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 15
		turretModel[89] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 15
		turretModel[90] = new ModelRendererTurbo(this, 401, 217, textureX, textureY); // Box 15
		turretModel[91] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 15
		turretModel[92] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 15
		turretModel[93] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 15
		turretModel[94] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 15
		turretModel[95] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 15
		turretModel[96] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 15
		turretModel[97] = new ModelRendererTurbo(this, 617, 113, textureX, textureY); // Box 15
		turretModel[98] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 15
		turretModel[99] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 15
		turretModel[100] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 15
		turretModel[101] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 15
		turretModel[102] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 15
		turretModel[103] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 15
		turretModel[104] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 15
		turretModel[105] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 15
		turretModel[106] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 15
		turretModel[107] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 15
		turretModel[108] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); // Box 15
		turretModel[109] = new ModelRendererTurbo(this, 553, 217, textureX, textureY); // Box 15
		turretModel[110] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 15
		turretModel[111] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 15
		turretModel[112] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 15
		turretModel[113] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 15
		turretModel[114] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 15
		turretModel[115] = new ModelRendererTurbo(this, 553, 89, textureX, textureY); // Box 15
		turretModel[116] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 15
		turretModel[117] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Box 15
		turretModel[118] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 15
		turretModel[119] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Box 15
		turretModel[120] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 15
		turretModel[121] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 15
		turretModel[122] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // Box 15
		turretModel[123] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 15
		turretModel[124] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 15
		turretModel[125] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 15
		turretModel[126] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 15
		turretModel[127] = new ModelRendererTurbo(this, 793, 217, textureX, textureY); // Box 15
		turretModel[128] = new ModelRendererTurbo(this, 969, 217, textureX, textureY); // Box 15
		turretModel[129] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 15
		turretModel[130] = new ModelRendererTurbo(this, 809, 217, textureX, textureY); // Box 15
		turretModel[131] = new ModelRendererTurbo(this, 761, 217, textureX, textureY); // Box 15
		turretModel[132] = new ModelRendererTurbo(this, 425, 217, textureX, textureY); // Box 15
		turretModel[133] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 15
		turretModel[134] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 15
		turretModel[135] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 15
		turretModel[136] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 15
		turretModel[137] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 15
		turretModel[138] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 15
		turretModel[139] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 15
		turretModel[140] = new ModelRendererTurbo(this, 513, 225, textureX, textureY); // Box 15
		turretModel[141] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 15
		turretModel[142] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 15
		turretModel[143] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 15
		turretModel[144] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 0
		turretModel[145] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 1
		turretModel[146] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 2
		turretModel[147] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 515
		turretModel[148] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 516
		turretModel[149] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 517
		turretModel[150] = new ModelRendererTurbo(this, 657, 241, textureX, textureY); // Box 518
		turretModel[151] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Box 536
		turretModel[152] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 401
		turretModel[153] = new ModelRendererTurbo(this, 793, 225, textureX, textureY); // Box 402
		turretModel[154] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 403
		turretModel[155] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 404
		turretModel[156] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 405
		turretModel[157] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 406
		turretModel[158] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 601
		turretModel[159] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 602
		turretModel[160] = new ModelRendererTurbo(this, 393, 313, textureX, textureY); // Box 270
		turretModel[161] = new ModelRendererTurbo(this, 857, 233, textureX, textureY); // Box 271
		turretModel[162] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 272
		turretModel[163] = new ModelRendererTurbo(this, 841, 233, textureX, textureY); // Box 273
		turretModel[164] = new ModelRendererTurbo(this, 881, 233, textureX, textureY); // Box 274
		turretModel[165] = new ModelRendererTurbo(this, 625, 313, textureX, textureY); // Box 275
		turretModel[166] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 651
		turretModel[167] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 655
		turretModel[168] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Box 659
		turretModel[169] = new ModelRendererTurbo(this, 929, 169, textureX, textureY); // Box 660
		turretModel[170] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 666
		turretModel[171] = new ModelRendererTurbo(this, 177, 241, textureX, textureY); // Box 667
		turretModel[172] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 668
		turretModel[173] = new ModelRendererTurbo(this, 513, 241, textureX, textureY); // Box 669
		turretModel[174] = new ModelRendererTurbo(this, 545, 241, textureX, textureY); // Box 670
		turretModel[175] = new ModelRendererTurbo(this, 881, 241, textureX, textureY); // Box 671
		turretModel[176] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 672
		turretModel[177] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 673
		turretModel[178] = new ModelRendererTurbo(this, 249, 281, textureX, textureY); // Box 1
		turretModel[179] = new ModelRendererTurbo(this, 17, 321, textureX, textureY); // Box 1
		turretModel[180] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 1

		turretModel[0].addShapeBox(-34F, 12F, -32F, 15, 8, 64, 0F,0F, 1F, -18F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 1F, -18F, 4F, 0.5F, -9F, -4F, 1F, 0F, -4F, 1F, 0F, 4F, 0.5F, -9F); // Box 15
		turretModel[0].setRotationPoint(2F, -47F, 0F);

		turretModel[1].addShapeBox(-38F, -2F, -32F, 15, 5, 64, 0F,3F, -2.5F, -9F, 0F, -3F, 0F, 0F, -3F, 0F, 3F, -2.5F, -9F, 3F, -1F, -18F, -2F, 0F, -12F, -2F, 0F, -12F, 3F, -1F, -18F); // Box 15
		turretModel[1].setRotationPoint(2F, -27F, 0F);

		turretModel[2].addShapeBox(-26F, 0F, -0.5F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[2].setRotationPoint(2F, -41F, 0F);

		turretModel[3].addShapeBox(-26F, 0F, -1.5F, 3, 5, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[3].setRotationPoint(2F, -41F, 0F);

		turretModel[4].addShapeBox(-26F, 0F, 0.5F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		turretModel[4].setRotationPoint(2F, -41F, 0F);

		turretModel[5].addShapeBox(-26F, 0F, -1F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[5].setRotationPoint(2.5F, -50F, 0F);

		turretModel[6].addShapeBox(-19F, 0F, -20F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[6].setRotationPoint(2F, -37.5F, 0F);

		turretModel[7].addShapeBox(-12F, 0F, -20F, 7, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 15
		turretModel[7].setRotationPoint(2F, -37.5F, 0F);

		turretModel[8].addShapeBox(-26F, 0F, -20F, 7, 2, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 15
		turretModel[8].setRotationPoint(2F, -37.5F, 0F);

		turretModel[9].addShapeBox(-18F, 0F, -17F, 5, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[9].setRotationPoint(2F, -40F, 0F);

		turretModel[10].addShapeBox(-13F, 0F, -17F, 5, 3, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 15
		turretModel[10].setRotationPoint(2F, -40F, 0F);

		turretModel[11].addShapeBox(-23F, 0F, -17F, 5, 3, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 15
		turretModel[11].setRotationPoint(2F, -40F, 0F);

		turretModel[12].addShapeBox(-21F, -1F, 3F, 5, 2, 15, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 15
		turretModel[12].setRotationPoint(2F, -37F, 0F);

		turretModel[13].addShapeBox(-11F, -1F, 3F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 15
		turretModel[13].setRotationPoint(2F, -37F, 0F);

		turretModel[14].addShapeBox(-16F, -1F, 3F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[14].setRotationPoint(2F, -37F, 0F);

		turretModel[15].addShapeBox(-2.75F, -1F, -20.5F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[15].setRotationPoint(2F, -39F, 0F);

		turretModel[16].addShapeBox(0.25F, -1F, -20.5F, 3, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 15
		turretModel[16].setRotationPoint(2F, -39F, 0F);

		turretModel[17].addShapeBox(-5.75F, -1F, -20.5F, 3, 5, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 15
		turretModel[17].setRotationPoint(2F, -39F, 0F);

		turretModel[18].addShapeBox(-2.25F, 1F, -20F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[18].setRotationPoint(2F, -44.5F, 1F);

		turretModel[19].addShapeBox(-4.25F, 1F, -20F, 2, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 15
		turretModel[19].setRotationPoint(2F, -44.5F, 1F);

		turretModel[20].addShapeBox(-0.25F, 0F, -20F, 2, 1, 6, 0F,0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 15
		turretModel[20].setRotationPoint(2F, -44.5F, 1F);

		turretModel[21].addShapeBox(-0.25F, 0F, -19F, 1, 6, 4, 0F,0F, -1F, 0.75F, 0.75F, -1F, -1F, 0.75F, -1F, -1F, 0F, -1F, 0.75F, 0F, -1F, 0.75F, 0.75F, -1F, -1F, 0.75F, -1F, -1F, 0F, -1F, 0.75F); // Box 15
		turretModel[21].setRotationPoint(2F, -44.5F, 1F);

		turretModel[22].addShapeBox(-4F, 0F, 5F, 20, 11, 27, 0F,0F, 1F, 0F, 0F, -1F, 0F, -2F, -5F, -3F, 0F, 1F, -8F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[22].setRotationPoint(2F, -35F, 0F);

		turretModel[23].addShapeBox(-4F, 0F, -5F, 20, 10, 10, 0F,0F, 1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[23].setRotationPoint(2F, -35F, 0F);

		turretModel[24].addShapeBox(-28F, -27F, -18F, 1, 41, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 15
		turretModel[24].setRotationPoint(2F, -50F, 0F);
		turretModel[24].rotateAngleZ = 0.08726646F;

		turretModel[25].addShapeBox(-28F, -27F, 17F, 1, 41, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 15
		turretModel[25].setRotationPoint(2F, -50F, 0F);
		turretModel[25].rotateAngleZ = 0.08726646F;

		turretModel[26].addShapeBox(21F, 0F, -12F, 12, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 2F, 1F, 4F, 0F, 2F, 0F, 0F, 0F, 0.8F, 0F, -1F, -1F, 2F, 0F, -1.9F, 0F, 0F, 0.8F, 0F); // Box 15
		turretModel[26].setRotationPoint(2F, -24F, 0F);

		turretModel[27].addShapeBox(21F, 0F, 5F, 12, 1, 7, 0F,2F, 0F, 0F, 1F, 4F, 0F, -3.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, -1.9F, 0F, -3.5F, -1F, 2F, 0F, 0.8F, 0F); // Box 15
		turretModel[27].setRotationPoint(2F, -24F, 0F);

		turretModel[28].addShapeBox(16F, 3F, 5F, 17, 6, 5, 0F,0F, 4F, 0F, -3F, 4F, 0F, -5.5F, 1F, 0F, 0F, 4F, -5F, -3F, 0F, 0F, 1F, -4F, 0F, -3.5F, 0F, 4F, -3F, 0F, 2F); // Box 15
		turretModel[28].setRotationPoint(2F, -33F, 0F);

		turretModel[29].addShapeBox(16F, 4F, 12F, 17, 5, 20, 0F,0F, 5F, 7F, -5.5F, 2F, 2F, -5.5F, 2F, -22F, 2F, 1F, -3F, -3F, 0F, 0F, -3.5F, 0F, -2F, -3.5F, 0F, -18F, 0F, 0F, 0F); // Box 15
		turretModel[29].setRotationPoint(2F, -33F, 0F);

		turretModel[30].addShapeBox(16F, 0F, 12F, 17, 2, 20, 0F,-2F, 0F, 0F, -3.5F, 0F, -2F, -17F, 0F, 0F, 0F, 0F, 0F, -2F, -0.2F, 0F, -12F, -0.2F, 0F, -17F, -0.4F, -10F, 0F, -0.4F, -10F); // Box 15
		turretModel[30].setRotationPoint(2F, -24F, 0F);

		turretModel[31].addShapeBox(16F, 5F, -5F, 8, 11, 10, 0F,0F, 0.4F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0.4F, 0F, -3F, 0.5F, 0F, 2F, -0.1F, 0F, 2F, -0.1F, 0F, -3F, 0.5F, 0F); // Box 15
		turretModel[31].setRotationPoint(2F, -40F, 0F);

		turretModel[32].addShapeBox(-3F, 1F, -12F, 12, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[32].setRotationPoint(2F, -25F, 0F);

		turretModel[33].addShapeBox(-4F, 1F, 12F, 20, 2, 20, 0F,0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.4F, -10F, 6F, -0.4F, -8F); // Box 15
		turretModel[33].setRotationPoint(2F, -25F, 0F);

		turretModel[34].addShapeBox(4F, 2.5F, -18F, 10, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[34].setRotationPoint(2F, -40F, 0F);

		turretModel[35].addShapeBox(4F, 1.5F, -18F, 11, 1, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[35].setRotationPoint(2F, -40F, 0F);

		turretModel[36].addShapeBox(14F, 2.5F, -7F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[36].setRotationPoint(2F, -40F, 0F);

		turretModel[37].addShapeBox(-0.25F, 1F, -20F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[37].setRotationPoint(2F, -44.5F, 1F);

		turretModel[38].addShapeBox(-0.25F, 1F, -15F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 15
		turretModel[38].setRotationPoint(2F, -44.5F, 1F);

		turretModel[39].addShapeBox(14F, 2.5F, -18F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		turretModel[39].setRotationPoint(2F, -40F, 0F);

		turretModel[40].addShapeBox(9F, 0F, -12F, 12, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 15
		turretModel[40].setRotationPoint(2F, -25F, 0F);

		turretModel[41].addShapeBox(-19F, -1F, -32F, 15, 12, 27, 0F,0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F); // Box 15
		turretModel[41].setRotationPoint(2F, -35F, 0F);

		turretModel[42].addShapeBox(-4.25F, 0F, -20F, 2, 1, 6, 0F,-1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 15
		turretModel[42].setRotationPoint(2F, -44.5F, 1F);

		turretModel[43].addShapeBox(-2.25F, 0F, -20F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[43].setRotationPoint(2F, -44.5F, 1F);

		turretModel[44].addShapeBox(16F, 3F, -10F, 17, 6, 5, 0F,0F, 4F, -5F, -3.5F, 1F, 0F, -3F, 4F, 0F, 0F, 4F, 0F, -3F, 0F, 2F, -1F, 0F, 4F, 1F, -4F, 0F, -3F, 0F, 0F); // Box 15
		turretModel[44].setRotationPoint(2F, -33F, 0F);

		turretModel[45].addShapeBox(16F, 4F, -32F, 17, 5, 20, 0F,-9F, 1F, -3F, -3.5F, 2F, -22F, -3.5F, 2F, 2F, 0F, 5F, 7F, -11F, 0F, 0F, -1F, 0F, -18F, -1F, 0F, -2F, -3F, 0F, 0F); // Box 15
		turretModel[45].setRotationPoint(2F, -33F, 0F);

		turretModel[46].addShapeBox(-19F, -1F, -5F, 15, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 15
		turretModel[46].setRotationPoint(2F, -35F, 0F);

		turretModel[47].addShapeBox(-4F, 0F, -32F, 20, 11, 27, 0F,0F, 1F, -8F, 9F, -5F, -3F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[47].setRotationPoint(2F, -35F, 0F);

		turretModel[48].addShapeBox(-44F, 13.5F, -23F, 10, 8, 46, 0F,-10F, 0.5F, -9F, 0F, 0.5F, -9F, 0F, 0.5F, -9F, -10F, 0.5F, -9F, 0F, 0F, -8F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -8F); // Box 15
		turretModel[48].setRotationPoint(2F, -49F, 0F);

		turretModel[49].addShapeBox(-19F, -1F, 5F, 15, 12, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -9F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, 0F); // Box 15
		turretModel[49].setRotationPoint(2F, -35F, 0F);

		turretModel[50].addShapeBox(-23F, 1F, 12F, 19, 2, 20, 0F,2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -2F, 0F, -6F, -0.2F, 0F, -6F, -0.4F, -8F, 2F, -2F, -11.8F); // Box 15
		turretModel[50].setRotationPoint(2F, -25F, 0F);

		turretModel[51].addShapeBox(19F, 0F, -32F, 14, 2, 20, 0F,0F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, 0F, 0F, -0.4F, -10F, -14F, -0.4F, -10F, -12F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 15
		turretModel[51].setRotationPoint(2F, -24F, 0F);

		turretModel[52].addShapeBox(-4F, 1F, -32F, 23, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 6F, -0.4F, -8F, 0F, -0.4F, -10F, 2F, -0.4F, 0F, 6F, -0.2F, 0F); // Box 15
		turretModel[52].setRotationPoint(2F, -25F, 0F);

		turretModel[53].addShapeBox(-23F, 1F, -32F, 19, 2, 20, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, -12F, -6F, -0.4F, -8F, -6F, -0.4F, 0F, 2F, -2F, 0F); // Box 15
		turretModel[53].setRotationPoint(2F, -25F, 0F);

		turretModel[54].addShapeBox(-45F, 22.5F, -23F, 10, 1, 46, 0F,0F, 0F, -8F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -8F, -4F, 0.5F, -9F, -6F, 0.5F, -9F, -6F, 0.5F, -9F, -4F, 0.5F, -9F); // Box 15
		turretModel[54].setRotationPoint(2F, -49F, 0F);

		turretModel[55].addShapeBox(-19F, -1F, 24F, 15, 12, 8, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -2F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 4F, -2F, 0F); // Box 15
		turretModel[55].setRotationPoint(2F, -35F, 0F);

		turretModel[56].addShapeBox(-34F, -1F, -32F, 15, 10, 9, 0F,11F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 7F, -0.5F, -9F, -4F, 0F, 0F, -4F, 0F, -8F, 4F, -0.5F, 0F); // Box 15
		turretModel[56].setRotationPoint(2F, -35F, 0F);

		turretModel[57].addShapeBox(-19F, -1F, -32F, 15, 12, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 4F, -2F, -8F); // Box 15
		turretModel[57].setRotationPoint(2F, -35F, 0F);

		turretModel[58].addShapeBox(-42F, -1F, -19F, 8, 8, 38, 0F,3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 3F, 0F, 0F, 3F, 1.5F, -4F, -10F, 1.5F, -4F, -10F, 1.5F, -4F, 3F, 1.5F, -4F); // Box 15
		turretModel[58].setRotationPoint(2F, -35F, 0F);

		turretModel[59].addShapeBox(-42F, 1F, -23F, 8, 8, 9, 0F,3F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, 0F, 3F, 0F, -5F, -1F, 1.5F, 0F, -4F, 1.5F, 0F, 0F, 1.5F, 0F, 3F, 1.5F, -1F); // Box 15
		turretModel[59].setRotationPoint(2F, -37F, 0F);

		turretModel[60].addShapeBox(-4F, 0.5F, 32F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[60].setRotationPoint(2F, -36F, 0F);

		turretModel[61].addShapeBox(-4F, 0F, 24F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[61].setRotationPoint(2F, -36F, 0F);

		turretModel[62].addShapeBox(-18F, 1F, 32F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[62].setRotationPoint(2F, -36F, 0F);

		turretModel[63].addShapeBox(-18F, 10F, 32F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[63].setRotationPoint(2F, -36F, 0F);

		turretModel[64].addShapeBox(-18F, 5.5F, 32F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[64].setRotationPoint(2F, -36F, 0F);

		turretModel[65].addShapeBox(-3F, 5.5F, 32F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[65].setRotationPoint(2F, -36F, 0F);

		turretModel[66].addShapeBox(-3F, 1F, 32F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[66].setRotationPoint(2F, -36F, 0F);

		turretModel[67].addShapeBox(-3F, 10F, 32F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[67].setRotationPoint(2F, -36F, 0F);

		turretModel[68].addShapeBox(13F, 5.5F, 32F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[68].setRotationPoint(2F, -36F, 0F);

		turretModel[69].addShapeBox(-4F, 4F, 26F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[69].setRotationPoint(2F, -36F, 0F);

		turretModel[70].addShapeBox(-4F, 9F, 30F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[70].setRotationPoint(2F, -36.75F, 0F);

		turretModel[71].addShapeBox(13F, 6F, 23F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[71].setRotationPoint(2F, -36F, 0F);

		turretModel[72].addShapeBox(13F, 8F, 25F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[72].setRotationPoint(2F, -36F, 0F);

		turretModel[73].addShapeBox(13F, 10F, 29F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[73].setRotationPoint(2F, -36F, 0F);

		turretModel[74].addShapeBox(-19F, 0.5F, 32F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[74].setRotationPoint(2F, -36F, 0F);

		turretModel[75].addShapeBox(-33F, 1F, 32F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[75].setRotationPoint(2F, -36F, 0F);

		turretModel[76].addShapeBox(-33F, 5.5F, 32F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[76].setRotationPoint(2F, -36F, 0F);

		turretModel[77].addShapeBox(-33F, 10F, 32F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[77].setRotationPoint(2F, -36F, 0F);

		turretModel[78].addShapeBox(-34F, 0.5F, 32F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[78].setRotationPoint(2F, -36F, 0F);

		turretModel[79].addShapeBox(-4F, -1F, -32F, 25, 12, 8, 0F,0F, 0F, 0F, 0F, -5.1F, 0F, 0F, -5.175F, -4.31F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -8F); // Box 15
		turretModel[79].setRotationPoint(2F, -35F, 0F);

		turretModel[80].addShapeBox(-33F, 1F, -33F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[80].setRotationPoint(2F, -36F, 0F);

		turretModel[81].addShapeBox(-33F, 5.5F, -33F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[81].setRotationPoint(2F, -36F, 0F);

		turretModel[82].addShapeBox(-33F, 10F, -33F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[82].setRotationPoint(2F, -36F, 0F);

		turretModel[83].addShapeBox(-34F, 0.5F, -33F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[83].setRotationPoint(2F, -36F, 0F);

		turretModel[84].addShapeBox(-19F, 0.5F, -33F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[84].setRotationPoint(2F, -36F, 0F);

		turretModel[85].addShapeBox(-18F, 5.5F, -33F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[85].setRotationPoint(2F, -36F, 0F);

		turretModel[86].addShapeBox(-18F, 1F, -33F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[86].setRotationPoint(2F, -36F, 0F);

		turretModel[87].addShapeBox(-18F, 10F, -33F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[87].setRotationPoint(2F, -36F, 0F);

		turretModel[88].addShapeBox(-4F, 0.5F, -33F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[88].setRotationPoint(2F, -36F, 0F);

		turretModel[89].addShapeBox(-3F, 10F, -33F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[89].setRotationPoint(2F, -36F, 0F);

		turretModel[90].addShapeBox(-3F, 5.5F, -33F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[90].setRotationPoint(2F, -36F, 0F);

		turretModel[91].addShapeBox(-3F, 1F, -33F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[91].setRotationPoint(2F, -36F, 0F);

		turretModel[92].addShapeBox(21F, 5.5F, -33F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[92].setRotationPoint(2F, -36F, 0F);

		turretModel[93].addShapeBox(-44F, 1F, 32F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[93].setRotationPoint(2F, -36F, 0F);

		turretModel[94].addShapeBox(-54F, 1F, 32F, 10, 1, 1, 0F,0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -11F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -11F); // Box 15
		turretModel[94].setRotationPoint(2F, -36F, 0F);

		turretModel[95].addShapeBox(-55F, 1F, -22F, 1, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[95].setRotationPoint(2F, -36F, 0F);

		turretModel[96].addShapeBox(-54F, 1F, -33F, 10, 1, 1, 0F,1F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 1F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F); // Box 15
		turretModel[96].setRotationPoint(2F, -36F, 0F);

		turretModel[97].addShapeBox(-44F, 1F, -33F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[97].setRotationPoint(2F, -36F, 0F);

		turretModel[98].addShapeBox(-55F, 2F, -22F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[98].setRotationPoint(2F, -36F, 0F);

		turretModel[99].addShapeBox(-55F, 2F, 21F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[99].setRotationPoint(2F, -36F, 0F);

		turretModel[100].addShapeBox(-55F, 2F, 16F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[100].setRotationPoint(2F, -36F, 0F);

		turretModel[101].addShapeBox(-55F, 2F, 11F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[101].setRotationPoint(2F, -36F, 0F);

		turretModel[102].addShapeBox(-55F, 2F, 6F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[102].setRotationPoint(2F, -36F, 0F);

		turretModel[103].addShapeBox(-55F, 2F, 1F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[103].setRotationPoint(2F, -36F, 0F);

		turretModel[104].addShapeBox(-55F, 2F, -2F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[104].setRotationPoint(2F, -36F, 0F);

		turretModel[105].addShapeBox(-55F, 2F, -7F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[105].setRotationPoint(2F, -36F, 0F);

		turretModel[106].addShapeBox(-55F, 2F, -12F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[106].setRotationPoint(2F, -36F, 0F);

		turretModel[107].addShapeBox(-55F, 2F, -17F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[107].setRotationPoint(2F, -36F, 0F);

		turretModel[108].addShapeBox(-54F, 1F, 21F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[108].setRotationPoint(2F, -36F, 0F);

		turretModel[109].addShapeBox(-54F, 1F, -22F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[109].setRotationPoint(2F, -36F, 0F);

		turretModel[110].addShapeBox(-53F, 2F, -24F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[110].setRotationPoint(2F, -36F, 0F);

		turretModel[111].addShapeBox(-50F, 2F, -27F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[111].setRotationPoint(2F, -36F, 0F);

		turretModel[112].addShapeBox(-47F, 2F, -30F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[112].setRotationPoint(2F, -36F, 0F);

		turretModel[113].addShapeBox(-44F, 2F, -33F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[113].setRotationPoint(2F, -36F, 0F);

		turretModel[114].addShapeBox(-39F, 2F, -33F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[114].setRotationPoint(2F, -36F, 0F);

		turretModel[115].addShapeBox(-39F, 2F, 32F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[115].setRotationPoint(2F, -36F, 0F);

		turretModel[116].addShapeBox(-44F, 2F, 32F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[116].setRotationPoint(2F, -36F, 0F);

		turretModel[117].addShapeBox(-47F, 2F, 29F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[117].setRotationPoint(2F, -36F, 0F);

		turretModel[118].addShapeBox(-50F, 2F, 26F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[118].setRotationPoint(2F, -36F, 0F);

		turretModel[119].addShapeBox(-53F, 2F, 23F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[119].setRotationPoint(2F, -36F, 0F);

		turretModel[120].addShapeBox(-55F, 8F, 16F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[120].setRotationPoint(2F, -36F, 0F);

		turretModel[121].addShapeBox(-55F, 8F, 21F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[121].setRotationPoint(2F, -36F, 0F);

		turretModel[122].addShapeBox(-55F, 8F, 11F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[122].setRotationPoint(2F, -36F, 0F);

		turretModel[123].addShapeBox(-55F, 8F, 6F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[123].setRotationPoint(2F, -36F, 0F);

		turretModel[124].addShapeBox(-55F, 8F, 1F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[124].setRotationPoint(2F, -36F, 0F);

		turretModel[125].addShapeBox(-55F, 8F, -2F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[125].setRotationPoint(2F, -36F, 0F);

		turretModel[126].addShapeBox(-55F, 8F, -7F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[126].setRotationPoint(2F, -36F, 0F);

		turretModel[127].addShapeBox(-55F, 8F, -12F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[127].setRotationPoint(2F, -36F, 0F);

		turretModel[128].addShapeBox(-55F, 8F, -17F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[128].setRotationPoint(2F, -36F, 0F);

		turretModel[129].addShapeBox(-55F, 8F, -22F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[129].setRotationPoint(2F, -36F, 0F);

		turretModel[130].addShapeBox(-53F, 8F, -24F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[130].setRotationPoint(2F, -36F, 0F);

		turretModel[131].addShapeBox(-50F, 8F, -27F, 1, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[131].setRotationPoint(2F, -36F, 0F);

		turretModel[132].addShapeBox(-47F, 8F, -30F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[132].setRotationPoint(2F, -36F, 0F);

		turretModel[133].addShapeBox(-44F, 8F, -33F, 1, 1, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[133].setRotationPoint(2F, -36F, 0F);

		turretModel[134].addShapeBox(-39F, 8F, -33F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[134].setRotationPoint(2F, -36F, 0F);

		turretModel[135].addShapeBox(-44F, 8F, 2F, 1, 1, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[135].setRotationPoint(2F, -36F, 0F);

		turretModel[136].addShapeBox(-47F, 8F, 2F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[136].setRotationPoint(2F, -36F, 0F);

		turretModel[137].addShapeBox(-39F, 8F, 20F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[137].setRotationPoint(2F, -36F, 0F);

		turretModel[138].addShapeBox(-50F, 8F, 2F, 1, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[138].setRotationPoint(2F, -36F, 0F);

		turretModel[139].addShapeBox(-55F, 8F, 2F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[139].setRotationPoint(2F, -36F, 0F);

		turretModel[140].addShapeBox(-53F, 8F, 2F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[140].setRotationPoint(2F, -36F, 0F);

		turretModel[141].addShapeBox(-55F, 8F, -22F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[141].setRotationPoint(2F, -36F, 0F);

		turretModel[142].addShapeBox(-38F, 8F, -33F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[142].setRotationPoint(2F, -36F, 0F);

		turretModel[143].addShapeBox(-38F, 8F, 32F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 15
		turretModel[143].setRotationPoint(2F, -36F, 0F);

		turretModel[144].addShapeBox(21F, 6F, -32F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[144].setRotationPoint(2F, -36F, 0F);

		turretModel[145].addShapeBox(21F, 8F, -32F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[145].setRotationPoint(2F, -36F, 0F);

		turretModel[146].addShapeBox(21F, 10F, -32F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		turretModel[146].setRotationPoint(2F, -36F, 0F);

		turretModel[147].addShapeBox(-44F, 8F, -33F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		turretModel[147].setRotationPoint(2F, -36F, 0F);

		turretModel[148].addShapeBox(-44F, 8F, 32F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		turretModel[148].setRotationPoint(2F, -36F, 0F);

		turretModel[149].addShapeBox(-42F, 1F, 14F, 8, 8, 9, 0F,3F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -9F, 3F, 0F, -4F, 3F, 1.5F, -1F, 0F, 1.5F, 0F, -4F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 517
		turretModel[149].setRotationPoint(2F, -37F, 0F);

		turretModel[150].addShapeBox(-34F, -1F, 23F, 15, 10, 9, 0F,0F, 0F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, -13F, 4F, -0.5F, 0F, -4F, 0F, -8F, -4F, 0F, 0F, 7F, -0.5F, -9F); // Box 518
		turretModel[150].setRotationPoint(2F, -35F, 0F);

		turretModel[151].addShapeBox(16F, 6F, -5F, 8, 11, 10, 0F,-5F, -0.5F, 0F, 2F, -1.1F, 0F, 2F, -1.1F, 0F, -5F, -0.5F, 0F, 0F, 0.6F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0.6F, 0F); // Box 536
		turretModel[151].setRotationPoint(2F, -40F, 0F);

		turretModel[152].addShapeBox(21F, 15F, -3F, 8, 1, 8, 0F,0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 401
		turretModel[152].setRotationPoint(0F, -31F, 0F);
		turretModel[152].rotateAngleX = -0.05235988F;
		turretModel[152].rotateAngleY = 0.6981317F;
		turretModel[152].rotateAngleZ = 0.48869219F;

		turretModel[153].addShapeBox(21F, 16F, -3F, 8, 1, 8, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 402
		turretModel[153].setRotationPoint(0F, -31F, 0F);
		turretModel[153].rotateAngleX = -0.05235988F;
		turretModel[153].rotateAngleY = 0.6981317F;
		turretModel[153].rotateAngleZ = 0.48869219F;

		turretModel[154].addShapeBox(21F, 17F, -1F, 8, 1, 5, 0F,0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 403
		turretModel[154].setRotationPoint(0F, -31F, 0F);
		turretModel[154].rotateAngleX = -0.05235988F;
		turretModel[154].rotateAngleY = 0.6981317F;
		turretModel[154].rotateAngleZ = 0.48869219F;

		turretModel[155].addShapeBox(21F, 18F, -1F, 8, 1, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 404
		turretModel[155].setRotationPoint(0F, -31F, 0F);
		turretModel[155].rotateAngleX = -0.05235988F;
		turretModel[155].rotateAngleY = 0.6981317F;
		turretModel[155].rotateAngleZ = 0.48869219F;

		turretModel[156].addShapeBox(25F, 19F, 1F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		turretModel[156].setRotationPoint(0F, -31F, 0F);
		turretModel[156].rotateAngleX = -0.05235988F;
		turretModel[156].rotateAngleY = 0.6981317F;
		turretModel[156].rotateAngleZ = 0.48869219F;

		turretModel[157].addShapeBox(25F, 20F, 1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 406
		turretModel[157].setRotationPoint(0F, -31F, 0F);
		turretModel[157].rotateAngleX = -0.05235988F;
		turretModel[157].rotateAngleY = 0.6981317F;
		turretModel[157].rotateAngleZ = 0.48869219F;

		turretModel[158].addShapeBox(-54F, 1F, 32F, 10, 1, 1, 0F,0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -11F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -11F); // Box 601
		turretModel[158].setRotationPoint(2F, -29F, 0F);

		turretModel[159].addShapeBox(-54F, 1F, -33F, 10, 1, 1, 0F,1F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 1F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F); // Box 602
		turretModel[159].setRotationPoint(2F, -29F, 0F);

		turretModel[160].addShapeBox(25F, 17.5F, -15F, 8, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F); // Box 270
		turretModel[160].setRotationPoint(0F, -31F, 0F);
		turretModel[160].rotateAngleX = 0.05235988F;
		turretModel[160].rotateAngleY = -0.34906585F;
		turretModel[160].rotateAngleZ = 0.48869219F;

		turretModel[161].addShapeBox(25F, 18.5F, -13F, 8, 1, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 271
		turretModel[161].setRotationPoint(0F, -31F, 0F);
		turretModel[161].rotateAngleX = 0.05235988F;
		turretModel[161].rotateAngleY = -0.34906585F;
		turretModel[161].rotateAngleZ = 0.48869219F;

		turretModel[162].addShapeBox(25F, 19.5F, -13F, 8, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F); // Box 272
		turretModel[162].setRotationPoint(0F, -31F, 0F);
		turretModel[162].rotateAngleX = 0.05235988F;
		turretModel[162].rotateAngleY = -0.34906585F;
		turretModel[162].rotateAngleZ = 0.48869219F;

		turretModel[163].addShapeBox(29F, 20.5F, -11F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		turretModel[163].setRotationPoint(0F, -31F, 0F);
		turretModel[163].rotateAngleX = 0.05235988F;
		turretModel[163].rotateAngleY = -0.34906585F;
		turretModel[163].rotateAngleZ = 0.48869219F;

		turretModel[164].addShapeBox(29F, 21.5F, -11F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 274
		turretModel[164].setRotationPoint(0F, -31F, 0F);
		turretModel[164].rotateAngleX = 0.05235988F;
		turretModel[164].rotateAngleY = -0.34906585F;
		turretModel[164].rotateAngleZ = 0.48869219F;

		turretModel[165].addShapeBox(25F, 16.5F, -15F, 8, 1, 8, 0F,0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 275
		turretModel[165].setRotationPoint(0F, -31F, 0F);
		turretModel[165].rotateAngleX = 0.05235988F;
		turretModel[165].rotateAngleY = -0.34906585F;
		turretModel[165].rotateAngleZ = 0.48869219F;

		turretModel[166].addShapeBox(-17.5F, 0F, -1.5F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		turretModel[166].setRotationPoint(2F, -39.5F, 0F);

		turretModel[167].addShapeBox(-17.5F, 0F, -18.5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 655
		turretModel[167].setRotationPoint(2F, -39.5F, 0F);

		turretModel[168].addShapeBox(-20.5F, 0F, -11.5F, 1, 3, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		turretModel[168].setRotationPoint(-2F, -39.5F, 0F);

		turretModel[169].addShapeBox(-3.5F, 0F, -11.5F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		turretModel[169].setRotationPoint(-2F, -39.5F, 0F);

		turretModel[170].addShapeBox(-4F, 0F, -26F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 666
		turretModel[170].setRotationPoint(2F, -39.5F, 0F);
		turretModel[170].rotateAngleY = -0.78539816F;

		turretModel[171].addShapeBox(-8.5F, 0F, -26F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		turretModel[171].setRotationPoint(2F, -39.5F, 0F);
		turretModel[171].rotateAngleY = -0.78539816F;

		turretModel[172].addShapeBox(-4F, 0F, -10.5F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		turretModel[172].setRotationPoint(2F, -39.5F, 0F);
		turretModel[172].rotateAngleY = -0.78539816F;

		turretModel[173].addShapeBox(-8.5F, 0F, -10.5F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		turretModel[173].setRotationPoint(2F, -39.5F, 0F);
		turretModel[173].rotateAngleY = -0.78539816F;

		turretModel[174].addShapeBox(-17.5F, 0F, -4F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		turretModel[174].setRotationPoint(2F, -39.5F, 0F);
		turretModel[174].rotateAngleY = 0.78539816F;

		turretModel[175].addShapeBox(-22F, 0F, -4F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		turretModel[175].setRotationPoint(2F, -39.5F, 0F);
		turretModel[175].rotateAngleY = 0.78539816F;

		turretModel[176].addShapeBox(-17.5F, 0F, 11.5F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		turretModel[176].setRotationPoint(2F, -39.5F, 0F);
		turretModel[176].rotateAngleY = 0.78539816F;

		turretModel[177].addShapeBox(-22F, 0F, 11.5F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		turretModel[177].setRotationPoint(2F, -39.5F, 0F);
		turretModel[177].rotateAngleY = 0.78539816F;

		turretModel[178].addShapeBox(-1F, -45F, -10.5F, 2, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1
		turretModel[178].setRotationPoint(2F, 0F, 0F);

		turretModel[179].addShapeBox(-8F, -43F, -16F, 8, 4, 7, 0F,0F, -2.5F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2.5F, -6F, 0F, -0.5F, 0F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, -0.5F, -6F); // Box 1
		turretModel[179].setRotationPoint(2F, 0F, 0F);

		turretModel[180].addShapeBox(-9F, -41F, -16F, 1, 6, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 1
		turretModel[180].setRotationPoint(2F, 0F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 15
		barrelModel[1] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 15
		barrelModel[2] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 15
		barrelModel[3] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 15
		barrelModel[4] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 15
		barrelModel[5] = new ModelRendererTurbo(this, 673, 57, textureX, textureY); // Box 15
		barrelModel[6] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 15
		barrelModel[7] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 15
		barrelModel[8] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 15
		barrelModel[9] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 15
		barrelModel[10] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 15
		barrelModel[11] = new ModelRendererTurbo(this, 697, 57, textureX, textureY); // Box 15
		barrelModel[12] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 15
		barrelModel[13] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 15
		barrelModel[14] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 15
		barrelModel[15] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 15
		barrelModel[16] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 15
		barrelModel[17] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 15
		barrelModel[18] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 15
		barrelModel[19] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 15
		barrelModel[20] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 15
		barrelModel[21] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 15
		barrelModel[22] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 15
		barrelModel[23] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 15
		barrelModel[24] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 15
		barrelModel[25] = new ModelRendererTurbo(this, 969, 249, textureX, textureY); // Box 535

		barrelModel[0].addShapeBox(-5F, -5.5F, -5F, 7, 6, 10, 0F,-2F, 0F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 15
		barrelModel[0].setRotationPoint(31F, -29.5F, 0F);

		barrelModel[1].addShapeBox(4F, 0F, -2F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[1].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[2].addShapeBox(7F, 0F, -2F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, -1.00F, -1.00F, 0F, -1.00F, -1.00F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.00F, -1.00F, 0F, -1.00F, -1.00F, 0F, 0F, 0F); // Box 15
		barrelModel[2].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[3].addShapeBox(8F, 2F, -1F, 16, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		barrelModel[3].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[4].addShapeBox(23F, -1F, -1F, 2, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F); // Box 15
		barrelModel[4].setRotationPoint(31F, -30.5F, 0F);

		barrelModel[5].addShapeBox(25F, 1F, -2F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[5].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[6].addShapeBox(35F, 2F, -1F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 15
		barrelModel[6].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[7].addShapeBox(36F, 2.5F, -0.5F, 27, 1, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 15
		barrelModel[7].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[8].addShapeBox(61F, 1.5F, -0.5F, 6, 1, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 15
		barrelModel[8].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[9].addShapeBox(61F, 2.5F, -0.75F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 15
		barrelModel[9].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[10].addShapeBox(61F, 2.5F, 1.75F, 6, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		barrelModel[10].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[11].addShapeBox(8F, 1F, -1F, 16, 1, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		barrelModel[11].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[12].addShapeBox(8F, 4F, -1F, 16, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 15
		barrelModel[12].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[13].addShapeBox(36F, 1.5F, -0.5F, 27, 1, 3, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 15
		barrelModel[13].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[14].addShapeBox(36F, 3.5F, -0.5F, 27, 1, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 15
		barrelModel[14].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[15].addShapeBox(35F, 1F, -1F, 3, 1, 4, 0F,0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 15
		barrelModel[15].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[16].addShapeBox(35F, 4F, -1F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -1F); // Box 15
		barrelModel[16].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[17].addShapeBox(25F, -1F, -2F, 8, 1, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[17].setRotationPoint(31F, -30.5F, 0F);

		barrelModel[18].addShapeBox(25F, 3F, -2F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 15
		barrelModel[18].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[19].addShapeBox(23F, 3F, -1F, 2, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		barrelModel[19].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[20].addShapeBox(23F, 1F, -1F, 2, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F); // Box 15
		barrelModel[20].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[21].addShapeBox(33F, 1F, -1F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F); // Box 15
		barrelModel[21].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[22].addShapeBox(33F, 3F, -1F, 2, 2, 4, 0F,0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 15
		barrelModel[22].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[23].addShapeBox(33F, -1F, -1F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F); // Box 15
		barrelModel[23].setRotationPoint(31F, -30.5F, 0F);

		barrelModel[24].addShapeBox(61F, 3.5F, -0.5F, 6, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 15
		barrelModel[24].setRotationPoint(31F, -31.5F, 0F);

		barrelModel[25].addShapeBox(-5F, -5.5F, -5F, 7, 7, 10, 0F,-2F, -0.5F, 0F, 5F, -0.5F, 0F, 5F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 2F, -0.4F, 0F, 2F, -0.4F, 0F, -2F, 0F, 0F); // Box 535
		barrelModel[25].setRotationPoint(31F, -24.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 15
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 15
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Box 15
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 15
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 15
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 15
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 15
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 15
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 15
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 15
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Box 15
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 15
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 15
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 15
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 15
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 15
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 15
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 15
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 15
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 15
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 577, 33, textureX, textureY); // Box 15
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 15
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 15
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 15
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 15
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 15
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Box 15
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 15
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 15
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 15
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 641, 9, textureX, textureY); // Box 15
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 825, 9, textureX, textureY); // Box 15
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 15
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 15
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 12
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Box 12
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Box 29
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 745, 233, textureX, textureY); // Box 30
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 33
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 35
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 36
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 37
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 38
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 39
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 40
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 41
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 42
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 43
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 44
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 45
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 46
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Box 47
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 48
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 49
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 897, 273, textureX, textureY); // Box 50
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Box 51
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 945, 273, textureX, textureY); // Box 52
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Box 53
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Box 54
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 55
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 56
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 57
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 58
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 59
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 60
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 61
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 62
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 63
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 601, 145, textureX, textureY); // Box 64
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 65
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 66
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 67
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 68
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 69
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 70
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 71
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Box 72
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 73
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 385, 281, textureX, textureY); // Box 74
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 75
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 76
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 77
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 78
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 79
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 80
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Box 81
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 82
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 83
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 809, 153, textureX, textureY); // Box 84
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 85
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 86
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 87
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 88
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 89
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Box 90
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 633, 281, textureX, textureY); // Box 91
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 673, 281, textureX, textureY); // Box 92
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 985, 281, textureX, textureY); // Box 93
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 94
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 95
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 1017, 97, textureX, textureY); // Box 96
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 97
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 849, 161, textureX, textureY); // Box 98
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 929, 161, textureX, textureY); // Box 99
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 977, 161, textureX, textureY); // Box 100
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 101
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 102
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 103
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 104
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 105
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 106
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Box 107
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 108
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 109
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 49, 289, textureX, textureY); // Box 110
		leftTrackWheelModels[115] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Box 111
		leftTrackWheelModels[116] = new ModelRendererTurbo(this, 513, 289, textureX, textureY); // Box 112
		leftTrackWheelModels[117] = new ModelRendererTurbo(this, 561, 289, textureX, textureY); // Box 113
		leftTrackWheelModels[118] = new ModelRendererTurbo(this, 713, 289, textureX, textureY); // Box 114
		leftTrackWheelModels[119] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 115
		leftTrackWheelModels[120] = new ModelRendererTurbo(this, 1017, 113, textureX, textureY); // Box 116
		leftTrackWheelModels[121] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 117
		leftTrackWheelModels[122] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 118
		leftTrackWheelModels[123] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // Box 119
		leftTrackWheelModels[124] = new ModelRendererTurbo(this, 809, 177, textureX, textureY); // Box 120
		leftTrackWheelModels[125] = new ModelRendererTurbo(this, 609, 185, textureX, textureY); // Box 121
		leftTrackWheelModels[126] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 122
		leftTrackWheelModels[127] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 123
		leftTrackWheelModels[128] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Box 124
		leftTrackWheelModels[129] = new ModelRendererTurbo(this, 841, 193, textureX, textureY); // Box 125
		leftTrackWheelModels[130] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 126
		leftTrackWheelModels[131] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 127
		leftTrackWheelModels[132] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 128
		leftTrackWheelModels[133] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 129
		leftTrackWheelModels[134] = new ModelRendererTurbo(this, 761, 289, textureX, textureY); // Box 130
		leftTrackWheelModels[135] = new ModelRendererTurbo(this, 601, 289, textureX, textureY); // Box 131
		leftTrackWheelModels[136] = new ModelRendererTurbo(this, 905, 289, textureX, textureY); // Box 132
		leftTrackWheelModels[137] = new ModelRendererTurbo(this, 809, 289, textureX, textureY); // Box 133
		leftTrackWheelModels[138] = new ModelRendererTurbo(this, 89, 297, textureX, textureY); // Box 134
		leftTrackWheelModels[139] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 135
		leftTrackWheelModels[140] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 136
		leftTrackWheelModels[141] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 137
		leftTrackWheelModels[142] = new ModelRendererTurbo(this, 905, 193, textureX, textureY); // Box 138
		leftTrackWheelModels[143] = new ModelRendererTurbo(this, 1009, 193, textureX, textureY); // Box 139
		leftTrackWheelModels[144] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 140
		leftTrackWheelModels[145] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 141
		leftTrackWheelModels[146] = new ModelRendererTurbo(this, 881, 137, textureX, textureY); // Box 142
		leftTrackWheelModels[147] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 143
		leftTrackWheelModels[148] = new ModelRendererTurbo(this, 713, 201, textureX, textureY); // Box 144
		leftTrackWheelModels[149] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Box 145
		leftTrackWheelModels[150] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 146
		leftTrackWheelModels[151] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 147
		leftTrackWheelModels[152] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 148
		leftTrackWheelModels[153] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 149

		leftTrackWheelModels[0].addShapeBox(-5.5F, -2.5F, 0F, 11, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[0].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[1].addShapeBox(-5.5F, -5.5F, 0F, 11, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[1].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[2].addShapeBox(-5.5F, 2.5F, 0F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 15
		leftTrackWheelModels[2].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[3].addShapeBox(-2.5F, -6.5F, -1F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[3].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[4].addShapeBox(2.5F, -6.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[4].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[5].addShapeBox(5.5F, -2.5F, -1F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[5].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[6].addShapeBox(2.5F, 5.5F, -1F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[6].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[7].addShapeBox(-2.5F, 5.5F, -1F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[7].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[8].addShapeBox(-6.5F, 5.5F, -1F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 15
		leftTrackWheelModels[8].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[9].addShapeBox(-6.5F, -2.5F, -1F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[9].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[10].addShapeBox(-6.5F, -6.5F, -1F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 15
		leftTrackWheelModels[10].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[11].addShapeBox(-1F, -1F, -1F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[11].setRotationPoint(55.5F, -8.5F, 24F);

		leftTrackWheelModels[12].addShapeBox(-2F, -1F, -1F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[12].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[13].addShapeBox(6F, -3F, 7F, 1, 6, 3, 0F,1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 15
		leftTrackWheelModels[13].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[14].addShapeBox(3F, 6F, 7F, 4, 1, 3, 0F,0.5F, 1F, 0F, -2F, 3.5F, 0F, -1F, 3.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[14].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[15].addShapeBox(-7F, -7F, 1F, 14, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[15].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[16].addShapeBox(-7F, -3F, 1F, 14, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[16].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[17].addShapeBox(-7F, 3F, 1F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 15
		leftTrackWheelModels[17].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[18].addShapeBox(-7F, 6F, 7F, 4, 1, 3, 0F,-2F, 3.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 3.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 15
		leftTrackWheelModels[18].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[19].addShapeBox(-7F, -3F, 7F, 1, 6, 3, 0F,0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[19].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[20].addShapeBox(3F, -7F, 7F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, -2F, 3.5F, 0F, -1F, 3.5F, 0F, 0.5F, 0F, 0F); // Box 15
		leftTrackWheelModels[20].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[21].addShapeBox(-7F, -7F, 7F, 4, 1, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 3.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 3.5F, 0F); // Box 15
		leftTrackWheelModels[21].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[22].addShapeBox(-3F, 6F, 7F, 6, 1, 3, 0F,-0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[22].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[23].addShapeBox(-3F, -7F, 7F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		leftTrackWheelModels[23].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[24].addShapeBox(-8F, -3F, 9F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[24].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[25].addShapeBox(7F, -3F, 9F, 1, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[25].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[26].addShapeBox(-3F, 7F, 9F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[26].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[27].addShapeBox(-3F, -8F, 9F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[27].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[28].addShapeBox(7F, 3F, 9F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -1F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 4F, -1F, 0F); // Box 15
		leftTrackWheelModels[28].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[29].addShapeBox(7F, -8F, 9F, 1, 5, 1, 0F,4F, -1F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[29].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[30].addShapeBox(-8F, -8F, 9F, 1, 5, 1, 0F,-5F, 0F, -0.5F, 4F, -1F, -0.5F, 4F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[30].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[31].addShapeBox(-8F, 3F, 9F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 4F, -1F, -0.5F, 4F, -1F, 0F, -5F, 0F, 0F); // Box 15
		leftTrackWheelModels[31].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[32].addShapeBox(-2F, -2F, -1F, 4, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftTrackWheelModels[32].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[33].addShapeBox(-2F, 1F, -1F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		leftTrackWheelModels[33].setRotationPoint(-67F, -9F, 23.5F);

		leftTrackWheelModels[34].addShapeBox(-7F, -2F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftTrackWheelModels[34].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[35].addShapeBox(-5F, -7F, 0F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 12
		leftTrackWheelModels[35].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[36].addShapeBox(-7F, 2F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 29
		leftTrackWheelModels[36].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[37].addShapeBox(-5F, 5F, 0F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 30
		leftTrackWheelModels[37].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[38].addShapeBox(-7F, -5F, 0F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		leftTrackWheelModels[38].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[39].addShapeBox(-7F, -2F, 6F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 35
		leftTrackWheelModels[39].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[40].addShapeBox(6F, -2F, 6F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 36
		leftTrackWheelModels[40].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[41].addShapeBox(6F, -5F, 6F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 37
		leftTrackWheelModels[41].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[42].addShapeBox(-2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 38
		leftTrackWheelModels[42].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[43].addShapeBox(-2F, 6F, 6F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		leftTrackWheelModels[43].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[44].addShapeBox(2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 40
		leftTrackWheelModels[44].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[45].addShapeBox(-6F, -7F, 6F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 41
		leftTrackWheelModels[45].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[46].addShapeBox(-7F, -5F, 6F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 42
		leftTrackWheelModels[46].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[47].addShapeBox(-7F, 2F, 6F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 43
		leftTrackWheelModels[47].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[48].addShapeBox(-6F, 6F, 6F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 44
		leftTrackWheelModels[48].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[49].addShapeBox(2F, 6F, 6F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 45
		leftTrackWheelModels[49].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[50].addShapeBox(6F, 2F, 6F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 46
		leftTrackWheelModels[50].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[51].addShapeBox(-1.5F, -0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftTrackWheelModels[51].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[52].addShapeBox(-1.5F, -1.5F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		leftTrackWheelModels[52].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[53].addShapeBox(-1.5F, 0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 49
		leftTrackWheelModels[53].setRotationPoint(39F, 2F, 23F);

		leftTrackWheelModels[54].addShapeBox(-7F, -2F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftTrackWheelModels[54].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[55].addShapeBox(-5F, -7F, 0F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 51
		leftTrackWheelModels[55].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[56].addShapeBox(-7F, 2F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 52
		leftTrackWheelModels[56].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[57].addShapeBox(-5F, 5F, 0F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 53
		leftTrackWheelModels[57].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[58].addShapeBox(-7F, -5F, 0F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftTrackWheelModels[58].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[59].addShapeBox(-7F, -2F, 6F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 55
		leftTrackWheelModels[59].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[60].addShapeBox(6F, -2F, 6F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 56
		leftTrackWheelModels[60].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[61].addShapeBox(6F, -5F, 6F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 57
		leftTrackWheelModels[61].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[62].addShapeBox(-2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 58
		leftTrackWheelModels[62].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[63].addShapeBox(-2F, 6F, 6F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftTrackWheelModels[63].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[64].addShapeBox(2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 60
		leftTrackWheelModels[64].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[65].addShapeBox(-6F, -7F, 6F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 61
		leftTrackWheelModels[65].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[66].addShapeBox(-7F, -5F, 6F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 62
		leftTrackWheelModels[66].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[67].addShapeBox(-7F, 2F, 6F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 63
		leftTrackWheelModels[67].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[68].addShapeBox(-6F, 6F, 6F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 64
		leftTrackWheelModels[68].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[69].addShapeBox(2F, 6F, 6F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 65
		leftTrackWheelModels[69].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[70].addShapeBox(6F, 2F, 6F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 66
		leftTrackWheelModels[70].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[71].addShapeBox(-1.5F, -0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftTrackWheelModels[71].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[72].addShapeBox(-1.5F, -1.5F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftTrackWheelModels[72].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[73].addShapeBox(-1.5F, 0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 69
		leftTrackWheelModels[73].setRotationPoint(22F, 2F, 23F);

		leftTrackWheelModels[74].addShapeBox(-7F, -2F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftTrackWheelModels[74].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[75].addShapeBox(-5F, -7F, 0F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 71
		leftTrackWheelModels[75].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[76].addShapeBox(-7F, 2F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 72
		leftTrackWheelModels[76].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[77].addShapeBox(-5F, 5F, 0F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 73
		leftTrackWheelModels[77].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[78].addShapeBox(-7F, -5F, 0F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftTrackWheelModels[78].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[79].addShapeBox(-7F, -2F, 6F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 75
		leftTrackWheelModels[79].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[80].addShapeBox(6F, -2F, 6F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 76
		leftTrackWheelModels[80].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[81].addShapeBox(6F, -5F, 6F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 77
		leftTrackWheelModels[81].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[82].addShapeBox(-2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 78
		leftTrackWheelModels[82].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[83].addShapeBox(-2F, 6F, 6F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftTrackWheelModels[83].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[84].addShapeBox(2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 80
		leftTrackWheelModels[84].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[85].addShapeBox(-6F, -7F, 6F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 81
		leftTrackWheelModels[85].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[86].addShapeBox(-7F, -5F, 6F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 82
		leftTrackWheelModels[86].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[87].addShapeBox(-7F, 2F, 6F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 83
		leftTrackWheelModels[87].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[88].addShapeBox(-6F, 6F, 6F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 84
		leftTrackWheelModels[88].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[89].addShapeBox(2F, 6F, 6F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 85
		leftTrackWheelModels[89].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[90].addShapeBox(6F, 2F, 6F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 86
		leftTrackWheelModels[90].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[91].addShapeBox(-1.5F, -0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		leftTrackWheelModels[91].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[92].addShapeBox(-1.5F, -1.5F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		leftTrackWheelModels[92].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[93].addShapeBox(-1.5F, 0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 89
		leftTrackWheelModels[93].setRotationPoint(-52F, 2F, 23F);

		leftTrackWheelModels[94].addShapeBox(-7F, -2F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftTrackWheelModels[94].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[95].addShapeBox(-5F, -7F, 0F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 91
		leftTrackWheelModels[95].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[96].addShapeBox(-7F, 2F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 92
		leftTrackWheelModels[96].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[97].addShapeBox(-5F, 5F, 0F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 93
		leftTrackWheelModels[97].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[98].addShapeBox(-7F, -5F, 0F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftTrackWheelModels[98].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[99].addShapeBox(-7F, -2F, 6F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 95
		leftTrackWheelModels[99].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[100].addShapeBox(6F, -2F, 6F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 96
		leftTrackWheelModels[100].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[101].addShapeBox(6F, -5F, 6F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 97
		leftTrackWheelModels[101].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[102].addShapeBox(-2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 98
		leftTrackWheelModels[102].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[103].addShapeBox(-2F, 6F, 6F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		leftTrackWheelModels[103].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[104].addShapeBox(2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 100
		leftTrackWheelModels[104].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[105].addShapeBox(-6F, -7F, 6F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 101
		leftTrackWheelModels[105].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[106].addShapeBox(-7F, -5F, 6F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 102
		leftTrackWheelModels[106].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[107].addShapeBox(-7F, 2F, 6F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 103
		leftTrackWheelModels[107].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[108].addShapeBox(-6F, 6F, 6F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 104
		leftTrackWheelModels[108].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[109].addShapeBox(2F, 6F, 6F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 105
		leftTrackWheelModels[109].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[110].addShapeBox(6F, 2F, 6F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 106
		leftTrackWheelModels[110].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[111].addShapeBox(-1.5F, -0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		leftTrackWheelModels[111].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[112].addShapeBox(-1.5F, -1.5F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		leftTrackWheelModels[112].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[113].addShapeBox(-1.5F, 0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 109
		leftTrackWheelModels[113].setRotationPoint(-35F, 2F, 23F);

		leftTrackWheelModels[114].addShapeBox(-7F, -2F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		leftTrackWheelModels[114].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[115].addShapeBox(-5F, -7F, 0F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 111
		leftTrackWheelModels[115].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[116].addShapeBox(-7F, 2F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 112
		leftTrackWheelModels[116].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[117].addShapeBox(-5F, 5F, 0F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 113
		leftTrackWheelModels[117].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[118].addShapeBox(-7F, -5F, 0F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		leftTrackWheelModels[118].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[119].addShapeBox(-7F, -2F, 6F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 115
		leftTrackWheelModels[119].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[120].addShapeBox(6F, -2F, 6F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 116
		leftTrackWheelModels[120].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[121].addShapeBox(6F, -5F, 6F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 117
		leftTrackWheelModels[121].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[122].addShapeBox(-2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 118
		leftTrackWheelModels[122].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[123].addShapeBox(-2F, 6F, 6F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		leftTrackWheelModels[123].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[124].addShapeBox(2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 120
		leftTrackWheelModels[124].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[125].addShapeBox(-6F, -7F, 6F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 121
		leftTrackWheelModels[125].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[126].addShapeBox(-7F, -5F, 6F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 122
		leftTrackWheelModels[126].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[127].addShapeBox(-7F, 2F, 6F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 123
		leftTrackWheelModels[127].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[128].addShapeBox(-6F, 6F, 6F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 124
		leftTrackWheelModels[128].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[129].addShapeBox(2F, 6F, 6F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 125
		leftTrackWheelModels[129].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[130].addShapeBox(6F, 2F, 6F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 126
		leftTrackWheelModels[130].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[131].addShapeBox(-1.5F, -0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		leftTrackWheelModels[131].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[132].addShapeBox(-1.5F, -1.5F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		leftTrackWheelModels[132].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[133].addShapeBox(-1.5F, 0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 129
		leftTrackWheelModels[133].setRotationPoint(-17F, 2F, 23F);

		leftTrackWheelModels[134].addShapeBox(-7F, -2F, 0F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		leftTrackWheelModels[134].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[135].addShapeBox(-5F, -7F, 0F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 131
		leftTrackWheelModels[135].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[136].addShapeBox(-7F, 2F, 0F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 132
		leftTrackWheelModels[136].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[137].addShapeBox(-5F, 5F, 0F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 133
		leftTrackWheelModels[137].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[138].addShapeBox(-7F, -5F, 0F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		leftTrackWheelModels[138].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[139].addShapeBox(-7F, -2F, 6F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 135
		leftTrackWheelModels[139].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[140].addShapeBox(6F, -2F, 6F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 136
		leftTrackWheelModels[140].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[141].addShapeBox(6F, -5F, 6F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 137
		leftTrackWheelModels[141].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[142].addShapeBox(-2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 138
		leftTrackWheelModels[142].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[143].addShapeBox(-2F, 6F, 6F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		leftTrackWheelModels[143].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[144].addShapeBox(2F, -7F, 6F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 140
		leftTrackWheelModels[144].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[145].addShapeBox(-6F, -7F, 6F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 141
		leftTrackWheelModels[145].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[146].addShapeBox(-7F, -5F, 6F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 142
		leftTrackWheelModels[146].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[147].addShapeBox(-7F, 2F, 6F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 143
		leftTrackWheelModels[147].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[148].addShapeBox(-6F, 6F, 6F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 144
		leftTrackWheelModels[148].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[149].addShapeBox(2F, 6F, 6F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 145
		leftTrackWheelModels[149].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[150].addShapeBox(6F, 2F, 6F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 146
		leftTrackWheelModels[150].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[151].addShapeBox(-1.5F, -0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		leftTrackWheelModels[151].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[152].addShapeBox(-1.5F, -1.5F, 6F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		leftTrackWheelModels[152].setRotationPoint(1F, 2F, 23F);

		leftTrackWheelModels[153].addShapeBox(-1.5F, 0.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		leftTrackWheelModels[153].setRotationPoint(1F, 2F, 23F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 15
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 15
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 15
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 15
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 15
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 15
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 15
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 15
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 809, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 905, 161, textureX, textureY); // Box 15
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 15
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 15
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 937, 161, textureX, textureY); // Box 15
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 15
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 15
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 15
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 15
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 15
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 15
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 15
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 601, 113, textureX, textureY); // Box 15
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 15
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 15
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 15
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 15
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 15
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Box 150
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 953, 289, textureX, textureY); // Box 151
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 185, 297, textureX, textureY); // Box 152
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 233, 297, textureX, textureY); // Box 153
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Box 154
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 155
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 156
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 697, 161, textureX, textureY); // Box 157
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 1009, 201, textureX, textureY); // Box 158
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 159
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 160
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 161
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 162
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 905, 161, textureX, textureY); // Box 163
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 561, 209, textureX, textureY); // Box 164
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 165
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 689, 169, textureX, textureY); // Box 166
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 167
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 168
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 633, 169, textureX, textureY); // Box 169
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 321, 297, textureX, textureY); // Box 170
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 369, 297, textureX, textureY); // Box 171
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 409, 297, textureX, textureY); // Box 172
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 633, 297, textureX, textureY); // Box 173
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 673, 297, textureX, textureY); // Box 174
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 729, 169, textureX, textureY); // Box 175
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Box 176
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 177
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 841, 209, textureX, textureY); // Box 178
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Box 179
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 1009, 209, textureX, textureY); // Box 180
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 593, 217, textureX, textureY); // Box 181
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 529, 177, textureX, textureY); // Box 182
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 577, 177, textureX, textureY); // Box 183
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 609, 217, textureX, textureY); // Box 184
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 1009, 217, textureX, textureY); // Box 185
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 905, 177, textureX, textureY); // Box 186
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 187
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 188
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 857, 177, textureX, textureY); // Box 189
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 841, 297, textureX, textureY); // Box 190
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 985, 297, textureX, textureY); // Box 191
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 192
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Box 193
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Box 194
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 1017, 177, textureX, textureY); // Box 195
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 196
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 197
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 198
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Box 199
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 200
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Box 201
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 202
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 203
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 204
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 205
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 206
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 207
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 561, 185, textureX, textureY); // Box 208
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Box 209
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 497, 305, textureX, textureY); // Box 210
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 545, 305, textureX, textureY); // Box 211
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 585, 305, textureX, textureY); // Box 212
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 713, 305, textureX, textureY); // Box 213
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 753, 305, textureX, textureY); // Box 214
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Box 215
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 216
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 1017, 185, textureX, textureY); // Box 217
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 218
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 513, 225, textureX, textureY); // Box 219
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 220
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 713, 225, textureX, textureY); // Box 221
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 222
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 737, 209, textureX, textureY); // Box 223
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 224
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 225
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 226
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 227
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 228
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 561, 193, textureX, textureY); // Box 229
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 801, 305, textureX, textureY); // Box 230
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 881, 305, textureX, textureY); // Box 231
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 921, 305, textureX, textureY); // Box 232
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Box 233
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 121, 313, textureX, textureY); // Box 234
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 235
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 236
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 841, 217, textureX, textureY); // Box 237
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 238
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 239
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 240
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Box 241
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 242
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Box 243
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Box 244
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 245
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 246
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 649, 193, textureX, textureY); // Box 247
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 665, 193, textureX, textureY); // Box 248
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 857, 193, textureX, textureY); // Box 249
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 169, 313, textureX, textureY); // Box 250
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 251
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 257, 313, textureX, textureY); // Box 252
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 305, 313, textureX, textureY); // Box 253
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 345, 313, textureX, textureY); // Box 254
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 255
		rightTrackWheelModels[140] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 256
		rightTrackWheelModels[141] = new ModelRendererTurbo(this, 729, 225, textureX, textureY); // Box 257
		rightTrackWheelModels[142] = new ModelRendererTurbo(this, 369, 233, textureX, textureY); // Box 258
		rightTrackWheelModels[143] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Box 259
		rightTrackWheelModels[144] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Box 260
		rightTrackWheelModels[145] = new ModelRendererTurbo(this, 513, 233, textureX, textureY); // Box 261
		rightTrackWheelModels[146] = new ModelRendererTurbo(this, 793, 225, textureX, textureY); // Box 262
		rightTrackWheelModels[147] = new ModelRendererTurbo(this, 841, 225, textureX, textureY); // Box 263
		rightTrackWheelModels[148] = new ModelRendererTurbo(this, 545, 233, textureX, textureY); // Box 264
		rightTrackWheelModels[149] = new ModelRendererTurbo(this, 561, 233, textureX, textureY); // Box 265
		rightTrackWheelModels[150] = new ModelRendererTurbo(this, 1017, 225, textureX, textureY); // Box 266
		rightTrackWheelModels[151] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 267
		rightTrackWheelModels[152] = new ModelRendererTurbo(this, 649, 209, textureX, textureY); // Box 268
		rightTrackWheelModels[153] = new ModelRendererTurbo(this, 665, 209, textureX, textureY); // Box 269

		rightTrackWheelModels[0].addShapeBox(-5.5F, -2.5F, -6F, 11, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[0].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[1].addShapeBox(-5.5F, -5.5F, -6F, 11, 3, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[1].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[2].addShapeBox(-5.5F, 2.5F, -6F, 11, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 15
		rightTrackWheelModels[2].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[3].addShapeBox(-2.5F, -6.5F, -7F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[3].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[4].addShapeBox(2.5F, -6.5F, -7F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[4].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[5].addShapeBox(5.5F, -2.5F, -7F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[5].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[6].addShapeBox(2.5F, 5.5F, -7F, 4, 1, 8, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[6].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[7].addShapeBox(-2.5F, 5.5F, -7F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[7].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[8].addShapeBox(-6.5F, 5.5F, -7F, 4, 1, 8, 0F,-1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 15
		rightTrackWheelModels[8].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[9].addShapeBox(-6.5F, -2.5F, -7F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[9].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[10].addShapeBox(-6.5F, -6.5F, -7F, 4, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); // Box 15
		rightTrackWheelModels[10].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[11].addShapeBox(-1F, -1F, -7F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[11].setRotationPoint(55.5F, -8.5F, -24F);

		rightTrackWheelModels[12].addShapeBox(-2F, -1F, -8F, 4, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[12].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[13].addShapeBox(6F, -3F, -10F, 1, 6, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F); // Box 15
		rightTrackWheelModels[13].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[14].addShapeBox(3F, 6F, -10F, 4, 1, 3, 0F,0.5F, 0F, 0F, -1F, 3.5F, 0F, -2F, 3.5F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[14].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[15].addShapeBox(-7F, -7F, -7F, 14, 4, 6, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[15].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[16].addShapeBox(-7F, -3F, -7F, 14, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[16].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[17].addShapeBox(-7F, 3F, -7F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 15
		rightTrackWheelModels[17].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[18].addShapeBox(-7F, 6F, -10F, 4, 1, 3, 0F,-1F, 3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -2F, 3.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 15
		rightTrackWheelModels[18].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[19].addShapeBox(-7F, -3F, -10F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[19].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[20].addShapeBox(3F, -7F, -10F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 3.5F, 0F, -2F, 3.5F, 0F, 0.5F, 1F, 0F); // Box 15
		rightTrackWheelModels[20].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[21].addShapeBox(-7F, -7F, -10F, 4, 1, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3.5F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -2F, 3.5F, 0F); // Box 15
		rightTrackWheelModels[21].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[22].addShapeBox(-3F, 6F, -10F, 6, 1, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[22].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[23].addShapeBox(-3F, -7F, -10F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 15
		rightTrackWheelModels[23].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[24].addShapeBox(-8F, -3F, -10F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		rightTrackWheelModels[24].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[25].addShapeBox(7F, -3F, -10F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		rightTrackWheelModels[25].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[26].addShapeBox(-3F, 7F, -10F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		rightTrackWheelModels[26].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[27].addShapeBox(-3F, -8F, -10F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		rightTrackWheelModels[27].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[28].addShapeBox(7F, 3F, -10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 4F, -1F, -0.5F); // Box 15
		rightTrackWheelModels[28].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[29].addShapeBox(7F, -8F, -10F, 1, 5, 1, 0F,4F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 4F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		rightTrackWheelModels[29].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[30].addShapeBox(-8F, -8F, -10F, 1, 5, 1, 0F,-5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 15
		rightTrackWheelModels[30].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[31].addShapeBox(-8F, 3F, -10F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, -0.5F, -5F, 0F, -0.5F); // Box 15
		rightTrackWheelModels[31].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[32].addShapeBox(-2F, -2F, -8F, 4, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackWheelModels[32].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[33].addShapeBox(-2F, 1F, -8F, 4, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		rightTrackWheelModels[33].setRotationPoint(-67F, -9F, -23.5F);

		rightTrackWheelModels[34].addShapeBox(-7F, -2F, 2F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		rightTrackWheelModels[34].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[35].addShapeBox(-5F, -7F, 2F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 151
		rightTrackWheelModels[35].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[36].addShapeBox(-7F, 2F, 2F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 152
		rightTrackWheelModels[36].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[37].addShapeBox(-5F, 5F, 2F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 153
		rightTrackWheelModels[37].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[38].addShapeBox(-7F, -5F, 2F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightTrackWheelModels[38].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[39].addShapeBox(-7F, -2F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 155
		rightTrackWheelModels[39].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[40].addShapeBox(6F, -2F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 156
		rightTrackWheelModels[40].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[41].addShapeBox(6F, -5F, 0F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 157
		rightTrackWheelModels[41].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[42].addShapeBox(-2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 158
		rightTrackWheelModels[42].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[43].addShapeBox(-2F, 6F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		rightTrackWheelModels[43].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[44].addShapeBox(2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 160
		rightTrackWheelModels[44].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[45].addShapeBox(-6F, -7F, 0F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 161
		rightTrackWheelModels[45].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[46].addShapeBox(-7F, -5F, 0F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 162
		rightTrackWheelModels[46].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[47].addShapeBox(-7F, 2F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 163
		rightTrackWheelModels[47].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[48].addShapeBox(-6F, 6F, 0F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 164
		rightTrackWheelModels[48].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[49].addShapeBox(2F, 6F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 165
		rightTrackWheelModels[49].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[50].addShapeBox(6F, 2F, 0F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 166
		rightTrackWheelModels[50].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[51].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		rightTrackWheelModels[51].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[52].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		rightTrackWheelModels[52].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[53].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 169
		rightTrackWheelModels[53].setRotationPoint(39F, 2F, -31F);

		rightTrackWheelModels[54].addShapeBox(-7F, -2F, 2F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		rightTrackWheelModels[54].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[55].addShapeBox(-5F, -7F, 2F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 171
		rightTrackWheelModels[55].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[56].addShapeBox(-7F, 2F, 2F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 172
		rightTrackWheelModels[56].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[57].addShapeBox(-5F, 5F, 2F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 173
		rightTrackWheelModels[57].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[58].addShapeBox(-7F, -5F, 2F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		rightTrackWheelModels[58].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[59].addShapeBox(-7F, -2F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 175
		rightTrackWheelModels[59].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[60].addShapeBox(6F, -2F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 176
		rightTrackWheelModels[60].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[61].addShapeBox(6F, -5F, 0F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 177
		rightTrackWheelModels[61].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[62].addShapeBox(-2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		rightTrackWheelModels[62].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[63].addShapeBox(-2F, 6F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		rightTrackWheelModels[63].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[64].addShapeBox(2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 180
		rightTrackWheelModels[64].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[65].addShapeBox(-6F, -7F, 0F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 181
		rightTrackWheelModels[65].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[66].addShapeBox(-7F, -5F, 0F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 182
		rightTrackWheelModels[66].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[67].addShapeBox(-7F, 2F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 183
		rightTrackWheelModels[67].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[68].addShapeBox(-6F, 6F, 0F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 184
		rightTrackWheelModels[68].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[69].addShapeBox(2F, 6F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 185
		rightTrackWheelModels[69].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[70].addShapeBox(6F, 2F, 0F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 186
		rightTrackWheelModels[70].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[71].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		rightTrackWheelModels[71].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[72].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		rightTrackWheelModels[72].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[73].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 189
		rightTrackWheelModels[73].setRotationPoint(22F, 2F, -31F);

		rightTrackWheelModels[74].addShapeBox(-7F, -2F, 2F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightTrackWheelModels[74].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[75].addShapeBox(-5F, -7F, 2F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 191
		rightTrackWheelModels[75].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[76].addShapeBox(-7F, 2F, 2F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 192
		rightTrackWheelModels[76].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[77].addShapeBox(-5F, 5F, 2F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 193
		rightTrackWheelModels[77].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[78].addShapeBox(-7F, -5F, 2F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		rightTrackWheelModels[78].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[79].addShapeBox(-7F, -2F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 195
		rightTrackWheelModels[79].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[80].addShapeBox(6F, -2F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 196
		rightTrackWheelModels[80].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[81].addShapeBox(6F, -5F, 0F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 197
		rightTrackWheelModels[81].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[82].addShapeBox(-2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 198
		rightTrackWheelModels[82].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[83].addShapeBox(-2F, 6F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightTrackWheelModels[83].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[84].addShapeBox(2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 200
		rightTrackWheelModels[84].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[85].addShapeBox(-6F, -7F, 0F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 201
		rightTrackWheelModels[85].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[86].addShapeBox(-7F, -5F, 0F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 202
		rightTrackWheelModels[86].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[87].addShapeBox(-7F, 2F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 203
		rightTrackWheelModels[87].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[88].addShapeBox(-6F, 6F, 0F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 204
		rightTrackWheelModels[88].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[89].addShapeBox(2F, 6F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 205
		rightTrackWheelModels[89].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[90].addShapeBox(6F, 2F, 0F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 206
		rightTrackWheelModels[90].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[91].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		rightTrackWheelModels[91].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[92].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		rightTrackWheelModels[92].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[93].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 209
		rightTrackWheelModels[93].setRotationPoint(-52F, 2F, -31F);

		rightTrackWheelModels[94].addShapeBox(-7F, -2F, 2F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightTrackWheelModels[94].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[95].addShapeBox(-5F, -7F, 2F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 211
		rightTrackWheelModels[95].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[96].addShapeBox(-7F, 2F, 2F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 212
		rightTrackWheelModels[96].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[97].addShapeBox(-5F, 5F, 2F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 213
		rightTrackWheelModels[97].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[98].addShapeBox(-7F, -5F, 2F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightTrackWheelModels[98].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[99].addShapeBox(-7F, -2F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 215
		rightTrackWheelModels[99].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[100].addShapeBox(6F, -2F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 216
		rightTrackWheelModels[100].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[101].addShapeBox(6F, -5F, 0F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 217
		rightTrackWheelModels[101].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[102].addShapeBox(-2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 218
		rightTrackWheelModels[102].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[103].addShapeBox(-2F, 6F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		rightTrackWheelModels[103].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[104].addShapeBox(2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 220
		rightTrackWheelModels[104].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[105].addShapeBox(-6F, -7F, 0F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 221
		rightTrackWheelModels[105].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[106].addShapeBox(-7F, -5F, 0F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 222
		rightTrackWheelModels[106].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[107].addShapeBox(-7F, 2F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 223
		rightTrackWheelModels[107].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[108].addShapeBox(-6F, 6F, 0F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 224
		rightTrackWheelModels[108].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[109].addShapeBox(2F, 6F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 225
		rightTrackWheelModels[109].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[110].addShapeBox(6F, 2F, 0F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 226
		rightTrackWheelModels[110].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[111].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		rightTrackWheelModels[111].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[112].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		rightTrackWheelModels[112].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[113].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 229
		rightTrackWheelModels[113].setRotationPoint(-35F, 2F, -31F);

		rightTrackWheelModels[114].addShapeBox(-7F, -2F, 2F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		rightTrackWheelModels[114].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[115].addShapeBox(-5F, -7F, 2F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 231
		rightTrackWheelModels[115].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[116].addShapeBox(-7F, 2F, 2F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 232
		rightTrackWheelModels[116].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[117].addShapeBox(-5F, 5F, 2F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 233
		rightTrackWheelModels[117].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[118].addShapeBox(-7F, -5F, 2F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		rightTrackWheelModels[118].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[119].addShapeBox(-7F, -2F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 235
		rightTrackWheelModels[119].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[120].addShapeBox(6F, -2F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 236
		rightTrackWheelModels[120].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[121].addShapeBox(6F, -5F, 0F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 237
		rightTrackWheelModels[121].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[122].addShapeBox(-2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 238
		rightTrackWheelModels[122].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[123].addShapeBox(-2F, 6F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		rightTrackWheelModels[123].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[124].addShapeBox(2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 240
		rightTrackWheelModels[124].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[125].addShapeBox(-6F, -7F, 0F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 241
		rightTrackWheelModels[125].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[126].addShapeBox(-7F, -5F, 0F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 242
		rightTrackWheelModels[126].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[127].addShapeBox(-7F, 2F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 243
		rightTrackWheelModels[127].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[128].addShapeBox(-6F, 6F, 0F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 244
		rightTrackWheelModels[128].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[129].addShapeBox(2F, 6F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 245
		rightTrackWheelModels[129].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[130].addShapeBox(6F, 2F, 0F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 246
		rightTrackWheelModels[130].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[131].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		rightTrackWheelModels[131].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[132].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		rightTrackWheelModels[132].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[133].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 249
		rightTrackWheelModels[133].setRotationPoint(-17F, 2F, -31F);

		rightTrackWheelModels[134].addShapeBox(-7F, -2F, 2F, 14, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		rightTrackWheelModels[134].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[135].addShapeBox(-5F, -7F, 2F, 10, 2, 6, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 251
		rightTrackWheelModels[135].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[136].addShapeBox(-7F, 2F, 2F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 252
		rightTrackWheelModels[136].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[137].addShapeBox(-5F, 5F, 2F, 10, 2, 6, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 253
		rightTrackWheelModels[137].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[138].addShapeBox(-7F, -5F, 2F, 14, 3, 6, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		rightTrackWheelModels[138].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[139].addShapeBox(-7F, -2F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 255
		rightTrackWheelModels[139].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[140].addShapeBox(6F, -2F, 0F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 256
		rightTrackWheelModels[140].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[141].addShapeBox(6F, -5F, 0F, 1, 3, 2, 0F,1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 257
		rightTrackWheelModels[141].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[142].addShapeBox(-2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 258
		rightTrackWheelModels[142].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[143].addShapeBox(-2F, 6F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightTrackWheelModels[143].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[144].addShapeBox(2F, -7F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F); // Box 260
		rightTrackWheelModels[144].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[145].addShapeBox(-6F, -7F, 0F, 4, 1, 2, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F); // Box 261
		rightTrackWheelModels[145].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[146].addShapeBox(-7F, -5F, 0F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 262
		rightTrackWheelModels[146].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[147].addShapeBox(-7F, 2F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 263
		rightTrackWheelModels[147].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[148].addShapeBox(-6F, 6F, 0F, 4, 1, 2, 0F,-1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F); // Box 264
		rightTrackWheelModels[148].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[149].addShapeBox(2F, 6F, 0F, 4, 1, 2, 0F,0.5F, 0F, 0F, -1.25F, 1.75F, 0F, -1.25F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F); // Box 265
		rightTrackWheelModels[149].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[150].addShapeBox(6F, 2F, 0F, 1, 3, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, -0.75F, 0F); // Box 266
		rightTrackWheelModels[150].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[151].addShapeBox(-1.5F, -0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		rightTrackWheelModels[151].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[152].addShapeBox(-1.5F, -1.5F, 1F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		rightTrackWheelModels[152].setRotationPoint(1F, 2F, -31F);

		rightTrackWheelModels[153].addShapeBox(-1.5F, 0.5F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 269
		rightTrackWheelModels[153].setRotationPoint(1F, 2F, -31F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 792
		leftTrackModel[1] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 793
		leftTrackModel[2] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 794
		leftTrackModel[3] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 795
		leftTrackModel[4] = new ModelRendererTurbo(this, 633, 169, textureX, textureY); // Box 796
		leftTrackModel[5] = new ModelRendererTurbo(this, 697, 169, textureX, textureY); // Box 797
		leftTrackModel[6] = new ModelRendererTurbo(this, 737, 169, textureX, textureY); // Box 798
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 799
		leftTrackModel[8] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 800
		leftTrackModel[9] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Box 801
		leftTrackModel[10] = new ModelRendererTurbo(this, 577, 177, textureX, textureY); // Box 802

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		leftTrackModel[0].setRotationPoint(55.8F, -16.3F, 21F);
		leftTrackModel[0].rotateAngleZ = -0.33161256F;

		leftTrackModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		leftTrackModel[1].setRotationPoint(63F, -11.7F, 21F);
		leftTrackModel[1].rotateAngleZ = -1.57079633F;

		leftTrackModel[2].addShapeBox(0F, -1F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 794
		leftTrackModel[2].setRotationPoint(58.1F, -2.1F, 21F);
		leftTrackModel[2].rotateAngleZ = -2.53945406F;

		leftTrackModel[3].addShapeBox(-2F, 0F, 0F, 94, 1, 12, 0F,1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 795
		leftTrackModel[3].setRotationPoint(39.8F, 9.6F, 21F);
		leftTrackModel[3].rotateAngleZ = -3.14159265F;

		leftTrackModel[4].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 796
		leftTrackModel[4].setRotationPoint(-54.2F, 9.6F, 21F);
		leftTrackModel[4].rotateAngleZ = -3.74373125F;

		leftTrackModel[5].addShapeBox(-5.5F, 0F, 0F, 6, 1, 12, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 797
		leftTrackModel[5].setRotationPoint(-74.75F, -11.62F, 21F);
		leftTrackModel[5].rotateAngleZ = -4.71238898F;

		leftTrackModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 798
		leftTrackModel[6].setRotationPoint(-74.8F, -12.1F, 21F);
		leftTrackModel[6].rotateAngleZ = -5.53269373F;

		leftTrackModel[7].addShapeBox(-1F, 0F, 0F, 123, 1, 12, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 799
		leftTrackModel[7].setRotationPoint(-67.15F, -16.3F, 21F);
		leftTrackModel[7].rotateAngleZ = -6.28318531F;

		leftTrackModel[8].addShapeBox(-1F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 800
		leftTrackModel[8].setRotationPoint(62.3F, -5F, 21F);
		leftTrackModel[8].rotateAngleZ = -2.3387412F;

		leftTrackModel[9].addShapeBox(-4F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		leftTrackModel[9].setRotationPoint(63F, -11.7F, 21F);
		leftTrackModel[9].rotateAngleZ = -0.82030475F;

		leftTrackModel[10].addShapeBox(0F, -1F, 0F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 802
		leftTrackModel[10].setRotationPoint(-74.8F, -6.1F, 21F);
		leftTrackModel[10].rotateAngleZ = 5.49778714F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 15
		rightTrackModel[1] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 15
		rightTrackModel[2] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 15
		rightTrackModel[3] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 15
		rightTrackModel[4] = new ModelRendererTurbo(this, 633, 169, textureX, textureY); // Box 15
		rightTrackModel[5] = new ModelRendererTurbo(this, 697, 169, textureX, textureY); // Box 15
		rightTrackModel[6] = new ModelRendererTurbo(this, 737, 169, textureX, textureY); // Box 15
		rightTrackModel[7] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 15
		rightTrackModel[8] = new ModelRendererTurbo(this, 777, 169, textureX, textureY); // Box 15
		rightTrackModel[9] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Box 15
		rightTrackModel[10] = new ModelRendererTurbo(this, 577, 177, textureX, textureY); // Box 15

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[0].setRotationPoint(55.8F, -16.3F, -33F);
		rightTrackModel[0].rotateAngleZ = -0.33161256F;

		rightTrackModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[1].setRotationPoint(63F, -11.7F, -33F);
		rightTrackModel[1].rotateAngleZ = -1.57079633F;

		rightTrackModel[2].addShapeBox(0F, -1F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[2].setRotationPoint(58.1F, -2.1F, -33F);
		rightTrackModel[2].rotateAngleZ = -2.53945406F;

		rightTrackModel[3].addShapeBox(-2F, 0F, 0F, 94, 1, 12, 0F,1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F); // Box 15
		rightTrackModel[3].setRotationPoint(39.8F, 9.6F, -33F);
		rightTrackModel[3].rotateAngleZ = -3.14159265F;

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 19, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[4].setRotationPoint(-54.2F, 9.6F, -33F);
		rightTrackModel[4].rotateAngleZ = -3.74373125F;

		rightTrackModel[5].addShapeBox(-5.5F, 0F, 0F, 6, 1, 12, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 15
		rightTrackModel[5].setRotationPoint(-74.75F, -11.62F, -33F);
		rightTrackModel[5].rotateAngleZ = -4.71238898F;

		rightTrackModel[6].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[6].setRotationPoint(-74.8F, -12.1F, -33F);
		rightTrackModel[6].rotateAngleZ = -5.53269373F;

		rightTrackModel[7].addShapeBox(-1F, 0F, 0F, 123, 1, 12, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F); // Box 15
		rightTrackModel[7].setRotationPoint(-67.15F, -16.3F, -33F);
		rightTrackModel[7].rotateAngleZ = -6.28318531F;

		rightTrackModel[8].addShapeBox(-1F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[8].setRotationPoint(62.3F, -5F, -33F);
		rightTrackModel[8].rotateAngleZ = -2.3387412F;

		rightTrackModel[9].addShapeBox(-4F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[9].setRotationPoint(63F, -11.7F, -33F);
		rightTrackModel[9].rotateAngleZ = -0.82030475F;

		rightTrackModel[10].addShapeBox(0F, -1F, 0F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		rightTrackModel[10].setRotationPoint(-74.8F, -6.1F, -33F);
		rightTrackModel[10].rotateAngleZ = 5.49778714F;
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[64];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 521, 249, textureX, textureY); // Box 0
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 1
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Box 2
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 3
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 4
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Box 5
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 6
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 7
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Box 8
		gun_1_Model[0][9] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 9
		gun_1_Model[0][10] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 10
		gun_1_Model[0][11] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // Box 11
		gun_1_Model[0][12] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Box 12
		gun_1_Model[0][13] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 13
		gun_1_Model[0][14] = new ModelRendererTurbo(this, 881, 89, textureX, textureY); // Box 14
		gun_1_Model[0][15] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 15
		gun_1_Model[0][16] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 16
		gun_1_Model[0][17] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 17
		gun_1_Model[0][18] = new ModelRendererTurbo(this, 817, 145, textureX, textureY); // Box 18
		gun_1_Model[0][19] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); // Box 19
		gun_1_Model[0][20] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 20
		gun_1_Model[0][21] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Box 21
		gun_1_Model[0][22] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 22
		gun_1_Model[0][23] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 23
		gun_1_Model[0][24] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 24
		gun_1_Model[0][25] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 25
		gun_1_Model[0][26] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 35
		gun_1_Model[0][27] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 36
		gun_1_Model[0][28] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 37
		gun_1_Model[0][29] = new ModelRendererTurbo(this, 777, 233, textureX, textureY); // Box 38
		gun_1_Model[0][30] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 42
		gun_1_Model[0][31] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY); // Box 44
		gun_1_Model[0][32] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 45
		gun_1_Model[0][33] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 46
		gun_1_Model[0][34] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 47
		gun_1_Model[0][35] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Box 48
		gun_1_Model[0][36] = new ModelRendererTurbo(this, 1017, 233, textureX, textureY); // Box 49
		gun_1_Model[0][37] = new ModelRendererTurbo(this, 729, 209, textureX, textureY); // Box 50
		gun_1_Model[0][38] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 51
		gun_1_Model[0][39] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 52
		gun_1_Model[0][40] = new ModelRendererTurbo(this, 313, 241, textureX, textureY); // Box 53
		gun_1_Model[0][41] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 54
		gun_1_Model[0][42] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 55
		gun_1_Model[0][43] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 56
		gun_1_Model[0][44] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 57
		gun_1_Model[0][45] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 58
		gun_1_Model[0][46] = new ModelRendererTurbo(this, 849, 249, textureX, textureY); // Box 59
		gun_1_Model[0][47] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 62
		gun_1_Model[0][48] = new ModelRendererTurbo(this, 737, 265, textureX, textureY); // Box 63
		gun_1_Model[0][49] = new ModelRendererTurbo(this, 657, 241, textureX, textureY); // Box 64
		gun_1_Model[0][50] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 65
		gun_1_Model[0][51] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 66
		gun_1_Model[0][52] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 67
		gun_1_Model[0][53] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 69
		gun_1_Model[0][54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 70
		gun_1_Model[0][55] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 71
		gun_1_Model[0][56] = new ModelRendererTurbo(this, 1001, 265, textureX, textureY); // Box 72
		gun_1_Model[0][57] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Box 73
		gun_1_Model[0][58] = new ModelRendererTurbo(this, 1001, 249, textureX, textureY); // Box 74
		gun_1_Model[0][59] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Box 75
		gun_1_Model[0][60] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Box 76
		gun_1_Model[0][61] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 77
		gun_1_Model[0][62] = new ModelRendererTurbo(this, 249, 257, textureX, textureY); // Box 78
		gun_1_Model[0][63] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Box 79

		gun_1_Model[0][0].addShapeBox(-8.8F, -2.5F, -1.5F, 13, 2, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 0

		gun_1_Model[0][1].addShapeBox(-8.8F, -3.5F, -1.5F, 9, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 1

		gun_1_Model[0][2].addShapeBox(-3F, -4.2F, -1.5F, 4, 1, 2, 0F,0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 2

		gun_1_Model[0][3].addShapeBox(1.3F, -4.2F, -1.5F, 1, 1, 2, 0F,0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 3

		gun_1_Model[0][4].addShapeBox(2.6F, -4.2F, -1.5F, 1, 1, 2, 0F,0F, -0.3F, 0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.1F); // Box 4

		gun_1_Model[0][5].addShapeBox(-8.8F, -4.2F, -1.5F, 5, 1, 2, 0F,0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 5

		gun_1_Model[0][6].addShapeBox(3.6F, -4.2F, -1.5F, 1, 2, 2, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 6

		gun_1_Model[0][7].addShapeBox(-8.8F, -1.2F, -1.5F, 5, 1, 2, 0F,0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 7

		gun_1_Model[0][8].addShapeBox(-0.3F, -1.2F, -1.5F, 4, 1, 2, 0F,0.4F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 8

		gun_1_Model[0][9].addShapeBox(-4.3F, -1.2F, 0F, 4, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -1F, -0.3F, 0.2F); // Box 9

		gun_1_Model[0][10].addShapeBox(-4.3F, -1.2F, -2F, 4, 1, 1, 0F,-1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 10

		gun_1_Model[0][11].addShapeBox(-8.5F, -2.8F, -1.5F, 6, 1, 2, 0F,0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 11

		gun_1_Model[0][12].addShapeBox(-8.5F, -2.1F, -1.5F, 6, 1, 2, 0F,0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 12

		gun_1_Model[0][13].addShapeBox(-4.2F, -3F, -1.5F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 13

		gun_1_Model[0][14].addShapeBox(-3.2F, -3F, -1.5F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 14

		gun_1_Model[0][15].addShapeBox(-5.6F, -3F, -1.5F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 15

		gun_1_Model[0][16].addShapeBox(-8.6F, -3F, -1.5F, 1, 1, 2, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 16

		gun_1_Model[0][17].addShapeBox(-8.6F, -1.7F, -1.5F, 1, 1, 2, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 17

		gun_1_Model[0][18].addShapeBox(-8.9F, -2.3F, -1.5F, 1, 1, 2, 0F,-0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F); // Box 18

		gun_1_Model[0][19].addShapeBox(-5.6F, -1.7F, -1.5F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 19

		gun_1_Model[0][20].addShapeBox(-4.2F, -1.7F, -1.5F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 20

		gun_1_Model[0][21].addShapeBox(-3.2F, -1.9F, -1.5F, 1, 1, 2, 0F,-0.2F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 21

		gun_1_Model[0][22].addShapeBox(-2.4F, -3.7F, 0.300000000000001F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.2F, -0.6F, -0.4F); // Box 22

		gun_1_Model[0][23].addShapeBox(-2.8F, -2.3F, 0.300000000000001F, 1, 1, 1, 0F,-0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Box 23

		gun_1_Model[0][24].addShapeBox(-2.8F, -2.3F, 0.300000000000001F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 24

		gun_1_Model[0][25].addShapeBox(-2.4F, -4F, 0.300000000000001F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F); // Box 25

		gun_1_Model[0][26].addShapeBox(-11F, -3.8F, 0.5F, 1, 3, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 35

		gun_1_Model[0][27].addShapeBox(-11F, -3.8F, -2.5F, 1, 3, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 36

		gun_1_Model[0][28].addShapeBox(-11F, -2.6F, -1F, 3, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 37

		gun_1_Model[0][29].addShapeBox(-9.7F, -4.2F, -1.5F, 1, 1, 2, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 38

		gun_1_Model[0][30].addShapeBox(-10.7F, -4.2F, 0.300000000000001F, 2, 1, 1, 0F,0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F); // Box 42

		gun_1_Model[0][31].addShapeBox(-10.7F, -4.2F, -2.3F, 2, 1, 1, 0F,0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F); // Box 44

		gun_1_Model[0][32].addShapeBox(-11F, -4.2F, 0.5F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 45

		gun_1_Model[0][33].addShapeBox(-11F, -4.2F, -2.5F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 46

		gun_1_Model[0][34].addShapeBox(-10.7F, -4.2F, -2.3F, 2, 1, 1, 0F,0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F); // Box 47

		gun_1_Model[0][35].addShapeBox(-10.7F, -4.2F, 0.300000000000001F, 2, 1, 1, 0F,0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F); // Box 48

		gun_1_Model[0][36].addShapeBox(-9.7F, -4.2F, -1.5F, 1, 1, 2, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 49

		gun_1_Model[0][37].addShapeBox(-10.4F, -3.5F, -0.199999999999999F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F); // Box 50

		gun_1_Model[0][38].addShapeBox(-9.4F, -3.5F, -1F, 1, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 51

		gun_1_Model[0][39].addShapeBox(-10.4F, -3.5F, -1.8F, 2, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.3F); // Box 52

		gun_1_Model[0][40].addShapeBox(-8.2F, -4.45F, -1F, 3, 1, 1, 0F,0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 53

		gun_1_Model[0][41].addShapeBox(-7.2F, -4.9F, -1.4F, 1, 1, 1, 0F,0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 54

		gun_1_Model[0][42].addShapeBox(-7.2F, -4.9F, -0.6F, 1, 1, 1, 0F,0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 55

		gun_1_Model[0][43].addShapeBox(-6.9F, -4.6F, -1F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 56

		gun_1_Model[0][44].addShapeBox(-7.4F, -4.9F, -1.6F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 57

		gun_1_Model[0][45].addShapeBox(-7.4F, -4.9F, -0.4F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 58

		gun_1_Model[0][46].addShapeBox(4.9F, -3.3F, -1.5F, 5, 2, 2, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 59

		gun_1_Model[0][47].addShapeBox(7.9F, -3.3F, -1.5F, 5, 2, 2, 0F,0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F); // Box 62

		gun_1_Model[0][48].addShapeBox(10.9F, -3.3F, -1.5F, 16, 2, 2, 0F,0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F); // Box 63

		gun_1_Model[0][49].addShapeBox(26.9F, -3.3F, -1.5F, 2, 2, 2, 0F,0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F); // Box 64

		gun_1_Model[0][50].addShapeBox(3.7F, -4.6F, -0.6F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 65

		gun_1_Model[0][51].addShapeBox(3.7F, -4.6F, -1.4F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 66

		gun_1_Model[0][52].addShapeBox(3.7F, -5F, -0.6F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 67

		gun_1_Model[0][53].addShapeBox(3.7F, -5F, -1.4F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 69

		gun_1_Model[0][54].addShapeBox(3.7F, -5.15F, -1F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F); // Box 70

		gun_1_Model[0][55].addShapeBox(3.7F, -4.7F, -1F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F); // Box 71

		gun_1_Model[0][56].addShapeBox(0.2F, -2F, 1.3F, 4, 5, 7, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 72

		gun_1_Model[0][57].addShapeBox(0.7F, -1.2F, -0.5F, 2, 1, 2, 0F,0.4F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 73

		gun_1_Model[0][58].addShapeBox(0.2F, -2.7F, 1.3F, 4, 1, 7, 0F,0F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0.3F, -1.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 74

		gun_1_Model[0][59].addShapeBox(0.6F, -2.7F, 1.3F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 75

		gun_1_Model[0][60].addShapeBox(0.6F, -3F, 0.800000000000001F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 76

		gun_1_Model[0][61].addShapeBox(0.6F, -3.5F, 0.300000000000001F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 77

		gun_1_Model[0][62].addShapeBox(0.6F, -3.5F, -0.5F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 78

		gun_1_Model[0][63].addShapeBox(0.6F, -3.5F, -1.5F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 79

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(0F, -44F, -9F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun1", gun_1_Model);
	}
}