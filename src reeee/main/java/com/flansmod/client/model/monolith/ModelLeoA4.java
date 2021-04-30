//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
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

public class ModelLeoA4 extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelLeoA4() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[119];
		turretModel = new ModelRendererTurbo[36];
		barrelModel = new ModelRendererTurbo[33];
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
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 6
		bodyModel[13] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 6
		bodyModel[15] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 6
		bodyModel[16] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 6
		bodyModel[17] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 753, 97, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 6
		bodyModel[21] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 6
		bodyModel[25] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 6
		bodyModel[26] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 913, 169, textureX, textureY); // Box 6
		bodyModel[30] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 6
		bodyModel[34] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 753, 161, textureX, textureY); // Box 6
		bodyModel[37] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 6
		bodyModel[38] = new ModelRendererTurbo(this, 841, 169, textureX, textureY); // Box 6
		bodyModel[39] = new ModelRendererTurbo(this, 961, 169, textureX, textureY); // Box 6
		bodyModel[40] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 6
		bodyModel[41] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 6
		bodyModel[42] = new ModelRendererTurbo(this, 577, 177, textureX, textureY); // Box 6
		bodyModel[43] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 6
		bodyModel[44] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Box 6
		bodyModel[45] = new ModelRendererTurbo(this, 593, 209, textureX, textureY); // Box 6
		bodyModel[46] = new ModelRendererTurbo(this, 713, 209, textureX, textureY); // Box 6
		bodyModel[47] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Box 6
		bodyModel[48] = new ModelRendererTurbo(this, 153, 217, textureX, textureY); // Box 6
		bodyModel[49] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 6
		bodyModel[50] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 6
		bodyModel[51] = new ModelRendererTurbo(this, 553, 225, textureX, textureY); // Box 6
		bodyModel[52] = new ModelRendererTurbo(this, 633, 225, textureX, textureY); // Box 6
		bodyModel[53] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 6
		bodyModel[54] = new ModelRendererTurbo(this, 1001, 185, textureX, textureY); // Box 6
		bodyModel[55] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 6
		bodyModel[56] = new ModelRendererTurbo(this, 969, 81, textureX, textureY); // Box 6
		bodyModel[57] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 6
		bodyModel[58] = new ModelRendererTurbo(this, 713, 225, textureX, textureY); // Box 6
		bodyModel[59] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 6
		bodyModel[60] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 6
		bodyModel[61] = new ModelRendererTurbo(this, 793, 225, textureX, textureY); // Box 6
		bodyModel[62] = new ModelRendererTurbo(this, 977, 193, textureX, textureY); // Import Box84
		bodyModel[63] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Import Box85
		bodyModel[64] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box86
		bodyModel[65] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import Box87
		bodyModel[66] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box88
		bodyModel[67] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box89
		bodyModel[68] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 6
		bodyModel[69] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 7
		bodyModel[70] = new ModelRendererTurbo(this, 857, 225, textureX, textureY); // Box 8
		bodyModel[71] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 9
		bodyModel[72] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 10
		bodyModel[73] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		bodyModel[74] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box90
		bodyModel[75] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Import Box91
		bodyModel[76] = new ModelRendererTurbo(this, 841, 17, textureX, textureY); // Import Box92
		bodyModel[77] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Import Box93
		bodyModel[78] = new ModelRendererTurbo(this, 937, 17, textureX, textureY); // Import Box94
		bodyModel[79] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Import Box95
		bodyModel[80] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box96
		bodyModel[81] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import Box97
		bodyModel[82] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Import Box98
		bodyModel[83] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box99
		bodyModel[84] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box118
		bodyModel[85] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Import Box119
		bodyModel[86] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 1
		bodyModel[87] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 1
		bodyModel[88] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 1
		bodyModel[89] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 16
		bodyModel[90] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 17
		bodyModel[91] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 18
		bodyModel[92] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Box 19
		bodyModel[93] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 20
		bodyModel[94] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 21
		bodyModel[95] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Box 22
		bodyModel[96] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 3
		bodyModel[97] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 3
		bodyModel[98] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 3
		bodyModel[99] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 3
		bodyModel[100] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 3
		bodyModel[101] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 1
		bodyModel[103] = new ModelRendererTurbo(this, 553, 41, textureX, textureY); // Box 2
		bodyModel[104] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 3
		bodyModel[105] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 4
		bodyModel[106] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 5
		bodyModel[107] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 6
		bodyModel[108] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 7
		bodyModel[109] = new ModelRendererTurbo(this, 513, 49, textureX, textureY); // Box 8
		bodyModel[110] = new ModelRendererTurbo(this, 537, 49, textureX, textureY); // Box 9
		bodyModel[111] = new ModelRendererTurbo(this, 529, 313, textureX, textureY); // Box 3
		bodyModel[112] = new ModelRendererTurbo(this, 177, 257, textureX, textureY); // Box 3
		bodyModel[113] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 1
		bodyModel[115] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 2
		bodyModel[116] = new ModelRendererTurbo(this, 817, 97, textureX, textureY); // Box 3
		bodyModel[117] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 4
		bodyModel[118] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 5

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 6, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(59F, -11F, -20F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(48F, -17F, -20F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F); // Box 6
		bodyModel[2].setRotationPoint(60F, -18F, 21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 74, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-26F, -17F, -20F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 17, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -10F, 3F, 0F, -10F, 3F, 0F, 0F, 3F, 0F); // Box 6
		bodyModel[4].setRotationPoint(42F, -5F, -20F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 104, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-61F, -2F, -20F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 15, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-72F, -14F, -20F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 103, 12, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[7].setRotationPoint(-61F, -14F, -20F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 9, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[8].setRotationPoint(42F, -14F, -20F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[9].setRotationPoint(35F, -20.5F, -3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 6
		bodyModel[10].setRotationPoint(33F, -20.5F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[11].setRotationPoint(33F, -20.5F, 3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[12].setRotationPoint(-51F, 0F, -24F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[13].setRotationPoint(-36F, 0F, -24F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[14].setRotationPoint(-21.5F, 0F, -24F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[15].setRotationPoint(-7.5F, 0F, -24F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[16].setRotationPoint(7.5F, 0F, -24F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[17].setRotationPoint(22.5F, 0F, -24F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[18].setRotationPoint(38.5F, 0F, -24F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[19].setRotationPoint(-51F, 0F, 20F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[20].setRotationPoint(-36F, 0F, 20F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[21].setRotationPoint(-21.5F, 0F, 20F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[22].setRotationPoint(-7.5F, 0F, 20F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[23].setRotationPoint(7.5F, 0F, 20F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[24].setRotationPoint(22.5F, 0F, 20F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[25].setRotationPoint(38.5F, 0F, 20F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 24, 3, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[26].setRotationPoint(-72F, -17F, -20F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[27].setRotationPoint(-61F, -25F, -30.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 6
		bodyModel[28].setRotationPoint(-49F, -25F, -30.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 4, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 6
		bodyModel[29].setRotationPoint(-69F, -25F, -30.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 18, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[30].setRotationPoint(-50F, -17F, 34F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 6
		bodyModel[31].setRotationPoint(-55F, -17F, 34F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[32].setRotationPoint(-71F, -17F, 34F);

		bodyModel[33].addShapeBox(0F, 0F, -28F, 8, 4, 28, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 6
		bodyModel[33].setRotationPoint(-69F, -25F, 30.5F);

		bodyModel[34].addShapeBox(0F, 0F, -28F, 12, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[34].setRotationPoint(-61F, -25F, 30.5F);

		bodyModel[35].addShapeBox(0F, 0F, -28F, 8, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 6
		bodyModel[35].setRotationPoint(-49F, -25F, 30.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[36].setRotationPoint(60F, -18F, 20F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[37].setRotationPoint(70F, -15F, 20F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 4, 13, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F); // Box 6
		bodyModel[38].setRotationPoint(60F, -18F, -34F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 4, 14, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[39].setRotationPoint(70F, -15F, -34F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[40].setRotationPoint(60F, -18F, -21F);

		bodyModel[41].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[41].setRotationPoint(0F, -27F, 0F);

		bodyModel[42].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[42].setRotationPoint(0F, -27F, 0F);
		bodyModel[42].rotateAngleY = 0.31415927F;

		bodyModel[43].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[43].setRotationPoint(0F, -27F, 0F);
		bodyModel[43].rotateAngleY = -0.31415927F;

		bodyModel[44].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[44].setRotationPoint(0F, -27F, 0F);
		bodyModel[44].rotateAngleY = -0.62831853F;

		bodyModel[45].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[45].setRotationPoint(0F, -27F, 0F);
		bodyModel[45].rotateAngleY = -0.9424778F;

		bodyModel[46].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[46].setRotationPoint(0F, -27F, 0F);
		bodyModel[46].rotateAngleY = -1.25663706F;

		bodyModel[47].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[47].setRotationPoint(0F, -27F, 0F);
		bodyModel[47].rotateAngleY = -1.57079633F;

		bodyModel[48].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[48].setRotationPoint(0F, -27F, 0F);
		bodyModel[48].rotateAngleY = -1.88495559F;

		bodyModel[49].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[49].setRotationPoint(0F, -27F, 0F);
		bodyModel[49].rotateAngleY = -2.19911486F;

		bodyModel[50].addShapeBox(-25F, 0F, -4F, 50, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[50].setRotationPoint(0F, -27F, 0F);
		bodyModel[50].rotateAngleY = -2.51327412F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 35, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[51].setRotationPoint(28F, -17F, 34F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 35, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 6
		bodyModel[52].setRotationPoint(28F, -17F, 35F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[53].setRotationPoint(63F, -17F, 34F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, -1F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[54].setRotationPoint(63F, -17F, 35F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 18, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[55].setRotationPoint(-50F, -17F, -35F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 6
		bodyModel[56].setRotationPoint(-55F, -17F, -35F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[57].setRotationPoint(-71F, -17F, -35F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 35, 10, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[58].setRotationPoint(28F, -17F, -36F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, -1F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[59].setRotationPoint(63F, -17F, -36F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[60].setRotationPoint(63F, -17F, -35F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[61].setRotationPoint(28F, -17F, -35F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 14, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[62].setRotationPoint(-76F, -17F, 20F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[63].setRotationPoint(-77F, -15F, 27.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box86
		bodyModel[64].setRotationPoint(-77F, -14F, 27.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box87
		bodyModel[65].setRotationPoint(-77F, -15F, 24F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box88
		bodyModel[66].setRotationPoint(-77F, -14F, 24F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		bodyModel[67].setRotationPoint(-77F, -14.5F, 22F);

		bodyModel[68].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[68].setRotationPoint(-77F, -14F, -27.5F);

		bodyModel[69].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[69].setRotationPoint(-77F, -15F, -27.5F);

		bodyModel[70].addShapeBox(0F, 0F, -14F, 2, 5, 14, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[70].setRotationPoint(-76F, -17F, -20F);

		bodyModel[71].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[71].setRotationPoint(-77F, -14F, -24F);

		bodyModel[72].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 10
		bodyModel[72].setRotationPoint(-77F, -15F, -24F);

		bodyModel[73].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[73].setRotationPoint(-77F, -14.5F, -22F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		bodyModel[74].setRotationPoint(-73F, -16F, -19.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		bodyModel[75].setRotationPoint(-73F, -13F, -19.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box92
		bodyModel[76].setRotationPoint(-73F, -13F, -16.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		bodyModel[77].setRotationPoint(-73F, -16F, -16.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		bodyModel[78].setRotationPoint(-73F, -15F, -12.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[79].setRotationPoint(-73F, -16F, 16.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box96
		bodyModel[80].setRotationPoint(-73F, -13F, 16.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		bodyModel[81].setRotationPoint(-73F, -13F, 13.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		bodyModel[82].setRotationPoint(-73F, -16F, 13.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 5, 10, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[83].setRotationPoint(-73F, -15F, 2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		bodyModel[84].setRotationPoint(-73F, -9F, -2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box119
		bodyModel[85].setRotationPoint(-73F, -8F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, -1F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 1
		bodyModel[86].setRotationPoint(-2F, -7F, 35F);

		bodyModel[87].addShapeBox(0F, 0F, -1F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 1
		bodyModel[87].setRotationPoint(2F, -6F, 35F);

		bodyModel[88].addShapeBox(0F, 0F, -1F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[88].setRotationPoint(16F, -7F, 35F);

		bodyModel[89].addShapeBox(0F, 0F, -1F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 16
		bodyModel[89].setRotationPoint(-28F, -6F, 35F);

		bodyModel[90].addShapeBox(0F, 0F, -1F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 17
		bodyModel[90].setRotationPoint(-32F, -7F, 35F);

		bodyModel[91].addShapeBox(0F, 0F, -1F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[91].setRotationPoint(-14F, -7F, 35F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 30, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[92].setRotationPoint(-32F, -17F, 34F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 30, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[93].setRotationPoint(-2F, -17F, 34F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 30, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[94].setRotationPoint(-2F, -17F, -35F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 30, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[95].setRotationPoint(-32F, -17F, -35F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 8, 68, 0F,3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[96].setRotationPoint(-76F, -25F, -34F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 50, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[97].setRotationPoint(-22F, -22F, -34F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 53, 8, 68, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[98].setRotationPoint(-75F, -25F, -34F);

		bodyModel[99].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[99].setRotationPoint(66F, -15F, 14.5F);

		bodyModel[100].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 3
		bodyModel[100].setRotationPoint(67F, -15F, 14.5F);

		bodyModel[101].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, -0.50F, -1F, 0F, -0.50F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.50F, 0F, 0F, -0.50F, 0F, 0F, 0F); // Box 0
		bodyModel[101].setRotationPoint(67F, -16F, 14.5F);

		bodyModel[102].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[102].setRotationPoint(66F, -16F, 14.5F);

		bodyModel[103].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[103].setRotationPoint(67F, -13F, 14.5F);

		bodyModel[104].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[104].setRotationPoint(66F, -13F, 14.5F);

		bodyModel[105].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 4
		bodyModel[105].setRotationPoint(67F, -15F, -14.5F);

		bodyModel[106].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, -0.50F, -1F, 0F, -0.50F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.50F, 0F, 0F, -0.50F, 0F, 0F, 0F); // Box 5
		bodyModel[106].setRotationPoint(67F, -16F, -14.5F);

		bodyModel[107].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[107].setRotationPoint(66F, -16F, -14.5F);

		bodyModel[108].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[108].setRotationPoint(66F, -15F, -14.5F);

		bodyModel[109].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F); // Box 8
		bodyModel[109].setRotationPoint(67F, -13F, -14.5F);

		bodyModel[110].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 9
		bodyModel[110].setRotationPoint(66F, -13F, -14.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 32, 5, 68, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[111].setRotationPoint(28F, -22F, -34F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 7, 40, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[112].setRotationPoint(60F, -18F, -20F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 0
		bodyModel[113].setRotationPoint(2F, -6F, -35F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[114].setRotationPoint(16F, -7F, -35F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 2
		bodyModel[115].setRotationPoint(-2F, -7F, -35F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[116].setRotationPoint(-14F, -7F, -35F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 4
		bodyModel[117].setRotationPoint(-28F, -6F, -35F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 5
		bodyModel[118].setRotationPoint(-32F, -7F, -35F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 397, textureX, textureY); // Box 6
		turretModel[1] = new ModelRendererTurbo(this, 1, 397, textureX, textureY); // Box 6
		turretModel[2] = new ModelRendererTurbo(this, 97, 397, textureX, textureY); // Box 6
		turretModel[3] = new ModelRendererTurbo(this, 33, 397, textureX, textureY); // Box 6
		turretModel[4] = new ModelRendererTurbo(this, 113, 397, textureX, textureY); // Box 6
		turretModel[5] = new ModelRendererTurbo(this, 201, 397, textureX, textureY); // Box 6
		turretModel[6] = new ModelRendererTurbo(this, 257, 397, textureX, textureY); // Box 6
		turretModel[7] = new ModelRendererTurbo(this, 273, 397, textureX, textureY); // Box 6
		turretModel[8] = new ModelRendererTurbo(this, 329, 397, textureX, textureY); // Box 6
		turretModel[9] = new ModelRendererTurbo(this, 313, 397, textureX, textureY); // Box 6
		turretModel[10] = new ModelRendererTurbo(this, 369, 397, textureX, textureY); // Box 6
		turretModel[11] = new ModelRendererTurbo(this, 97, 397, textureX, textureY); // Box 6
		turretModel[12] = new ModelRendererTurbo(this, 425, 397, textureX, textureY); // Box 6
		turretModel[13] = new ModelRendererTurbo(this, 457, 397, textureX, textureY); // Box 6
		turretModel[14] = new ModelRendererTurbo(this, 489, 397, textureX, textureY); // Box 6
		turretModel[15] = new ModelRendererTurbo(this, 137, 397, textureX, textureY); // Box 6
		turretModel[16] = new ModelRendererTurbo(this, 521, 397, textureX, textureY); // Box 6
		turretModel[17] = new ModelRendererTurbo(this, 441, 397, textureX, textureY); // Box 6
		turretModel[18] = new ModelRendererTurbo(this, 545, 397, textureX, textureY); // Box 6
		turretModel[19] = new ModelRendererTurbo(this, 537, 397, textureX, textureY); // Box 6
		turretModel[20] = new ModelRendererTurbo(this, 601, 397, textureX, textureY); // Box 6
		turretModel[21] = new ModelRendererTurbo(this, 665, 397, textureX, textureY); // Box 6
		turretModel[22] = new ModelRendererTurbo(this, 577, 397, textureX, textureY); // Box 6
		turretModel[23] = new ModelRendererTurbo(this, 641, 397, textureX, textureY); // Box 6
		turretModel[24] = new ModelRendererTurbo(this, 705, 397, textureX, textureY); // Box 6
		turretModel[25] = new ModelRendererTurbo(this, 697, 397, textureX, textureY); // Box 6
		turretModel[26] = new ModelRendererTurbo(this, 825, 397, textureX, textureY); // Box 6
		turretModel[27] = new ModelRendererTurbo(this, 329, 413, textureX, textureY); // Box 6
		turretModel[28] = new ModelRendererTurbo(this, 185, 413, textureX, textureY); // Box 6
		turretModel[29] = new ModelRendererTurbo(this, 769, 397, textureX, textureY); // Box 6
		turretModel[30] = new ModelRendererTurbo(this, 809, 397, textureX, textureY); // Box 6
		turretModel[31] = new ModelRendererTurbo(this, 425, 413, textureX, textureY); // Box 6
		turretModel[32] = new ModelRendererTurbo(this, 929, 397, textureX, textureY); // Box 6
		turretModel[33] = new ModelRendererTurbo(this, 817, 413, textureX, textureY); // Box 6
		turretModel[34] = new ModelRendererTurbo(this, 473, 397, textureX, textureY); // Box 6
		turretModel[35] = new ModelRendererTurbo(this, 489, 421, textureX, textureY); // Box 6

		turretModel[0].addShapeBox(0F, 1F, -28F, 18, 13, 56, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[0].setRotationPoint(0F, -37F, 0F);

		turretModel[1].addShapeBox(18F, 1F, -28F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 6
		turretModel[1].setRotationPoint(0F, -35F, 0F);

		turretModel[2].addShapeBox(18F, 1F, 8F, 7, 11, 20, 0F,0F, 0F, 0F, 4F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		turretModel[2].setRotationPoint(0F, -35F, 0F);

		turretModel[3].addShapeBox(25F, 2F, -26F, 2, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[3].setRotationPoint(0F, -35F, 0F);

		turretModel[4].addShapeBox(0F, -1F, -22F, 18, 4, 44, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 6
		turretModel[4].setRotationPoint(0F, -37F, 0F);

		turretModel[5].addShapeBox(0F, -1F, 22F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 6
		turretModel[5].setRotationPoint(0F, -37F, 0F);

		turretModel[6].addShapeBox(18F, 1F, 22F, 7, 4, 6, 0F,0F, 0F, 0F, 1.1F, -1F, 1F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, -2F, 0F, 1.1F, -1F, 1F, 0F, -1F, -2F, 0F, -2F, 0F); // Box 6
		turretModel[6].setRotationPoint(0F, -37F, 0F);

		turretModel[7].addShapeBox(18F, 1F, 8F, 9, 4, 16, 0F,0F, 0F, 0F, 2F, -2F, 0F, -0.9F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 2F, -1F, 0F, -0.9F, -1F, -3F, 0F, -2F, 0F); // Box 6
		turretModel[7].setRotationPoint(0F, -37F, 0F);

		turretModel[8].addShapeBox(18F, 5F, -28F, 7, 7, 20, 0F,0F, 0F, 0F, 0F, -1F, -2F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[8].setRotationPoint(0F, -35F, 0F);

		turretModel[9].addShapeBox(18F, 1F, -28F, 7, 4, 6, 0F,0F, -1F, 0F, 0F, -2F, -2F, 1.1F, -1F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 1.1F, -1F, 1F, 0F, -2F, 0F); // Box 6
		turretModel[9].setRotationPoint(0F, -37F, 0F);

		turretModel[10].addShapeBox(0F, -1F, -28F, 18, 4, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 6
		turretModel[10].setRotationPoint(0F, -37F, 0F);

		turretModel[11].addShapeBox(18F, 1F, -22F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[11].setRotationPoint(0F, -37F, 0F);

		turretModel[12].addShapeBox(-9F, -13F, -18F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[12].setRotationPoint(0F, -28F, 0F);

		turretModel[13].addShapeBox(-6F, -13F, -18F, 3, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 6
		turretModel[13].setRotationPoint(0F, -28F, 0F);

		turretModel[14].addShapeBox(-12F, -13F, -18F, 3, 4, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 6
		turretModel[14].setRotationPoint(0F, -28F, 0F);

		turretModel[15].addShapeBox(-8.5F, -13F, -18F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[15].setRotationPoint(0F, -34F, 1.5F);

		turretModel[16].addShapeBox(-10.5F, -13F, -18F, 2, 6, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 6
		turretModel[16].setRotationPoint(0F, -34F, 1.5F);

		turretModel[17].addShapeBox(-6.5F, -13F, -18F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		turretModel[17].setRotationPoint(0F, -34F, 1.5F);

		turretModel[18].addShapeBox(-6.5F, -13F, -18F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 6
		turretModel[18].setRotationPoint(0F, -33F, 2.5F);

		turretModel[19].addShapeBox(-20F, -13F, 3F, 7, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[19].setRotationPoint(0F, -26F, 0F);

		turretModel[20].addShapeBox(-13F, -13F, 3F, 7, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 6
		turretModel[20].setRotationPoint(0F, -26F, 0F);

		turretModel[21].addShapeBox(-27F, -13F, 3F, 7, 1, 21, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 6
		turretModel[21].setRotationPoint(0F, -26F, 0F);

		turretModel[22].addShapeBox(-19.5F, -12F, 5.5F, 6, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[22].setRotationPoint(0F, -29F, 0F);

		turretModel[23].addShapeBox(-13.5F, -12F, 5.5F, 5, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 6
		turretModel[23].setRotationPoint(0F, -29F, 0F);

		turretModel[24].addShapeBox(-24.5F, -12F, 5.5F, 5, 2, 16, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 6
		turretModel[24].setRotationPoint(0F, -29F, 0F);

		turretModel[25].addShapeBox(-6F, -1F, -28F, 6, 15, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[25].setRotationPoint(0F, -37F, 0F);

		turretModel[26].addShapeBox(-30F, -1F, -28F, 20, 15, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3F, 0F); // Box 6
		turretModel[26].setRotationPoint(0F, -37F, 0F);

		turretModel[27].addShapeBox(-48F, -1F, -28F, 18, 12, 56, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 6
		turretModel[27].setRotationPoint(0F, -37F, 0F);

		turretModel[28].addShapeBox(-10F, -1F, -28F, 4, 15, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 6
		turretModel[28].setRotationPoint(0F, -37F, 0F);

		turretModel[29].addShapeBox(8.5F, -1F, -19F, 14, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[29].setRotationPoint(0F, -35F, 0F);

		turretModel[30].addShapeBox(18F, 0F, -21F, 8, 7, 2, 0F,0F, 0F, 0F, 0.1F, -1F, 0F, 0.55F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[30].setRotationPoint(0F, -36F, 0F);

		turretModel[31].addShapeBox(-30F, 11F, -18F, 20, 3, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6F, -0.5F, 0F); // Box 6
		turretModel[31].setRotationPoint(0F, -37F, 0F);

		turretModel[32].addShapeBox(-30F, 11F, -26F, 20, 3, 8, 0F,-8F, -1.1F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6F, -0.5F, 0F); // Box 6
		turretModel[32].setRotationPoint(0F, -37F, 0F);

		turretModel[33].addShapeBox(-30F, 11F, 18F, 20, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, -8F, -1.1F, 0F, -6F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -9F, -0.5F, 0F); // Box 6
		turretModel[33].setRotationPoint(0F, -37F, 0F);

		turretModel[34].addShapeBox(18F, -1F, -9F, 11, 6, 1, 0F,0F, 0F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		turretModel[34].setRotationPoint(0F, -35F, 0F);

		turretModel[35].addShapeBox(-58F, -1F, -26F, 10, 12, 52, 0F,0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 6
		turretModel[35].setRotationPoint(0F, -37F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 505, 397, textureX, textureY); // Box 6
		barrelModel[1] = new ModelRendererTurbo(this, 833, 397, textureX, textureY); // Box 6
		barrelModel[2] = new ModelRendererTurbo(this, 1, 413, textureX, textureY); // Box 6
		barrelModel[3] = new ModelRendererTurbo(this, 977, 397, textureX, textureY); // Box 6
		barrelModel[4] = new ModelRendererTurbo(this, 257, 421, textureX, textureY); // Box 6
		barrelModel[5] = new ModelRendererTurbo(this, 857, 397, textureX, textureY); // Box 6
		barrelModel[6] = new ModelRendererTurbo(this, 577, 397, textureX, textureY); // Box 6
		barrelModel[7] = new ModelRendererTurbo(this, 1001, 397, textureX, textureY); // Box 6
		barrelModel[8] = new ModelRendererTurbo(this, 25, 397, textureX, textureY); // Box 6
		barrelModel[9] = new ModelRendererTurbo(this, 249, 397, textureX, textureY); // Box 6
		barrelModel[10] = new ModelRendererTurbo(this, 609, 397, textureX, textureY); // Box 6
		barrelModel[11] = new ModelRendererTurbo(this, 337, 397, textureX, textureY); // Box 6
		barrelModel[12] = new ModelRendererTurbo(this, 641, 397, textureX, textureY); // Box 6
		barrelModel[13] = new ModelRendererTurbo(this, 705, 397, textureX, textureY); // Box 6
		barrelModel[14] = new ModelRendererTurbo(this, 417, 397, textureX, textureY); // Box 6
		barrelModel[15] = new ModelRendererTurbo(this, 569, 421, textureX, textureY); // Box 6
		barrelModel[16] = new ModelRendererTurbo(this, 641, 421, textureX, textureY); // Box 6
		barrelModel[17] = new ModelRendererTurbo(this, 929, 413, textureX, textureY); // Box 6
		barrelModel[18] = new ModelRendererTurbo(this, 769, 421, textureX, textureY); // Box 6
		barrelModel[19] = new ModelRendererTurbo(this, 929, 421, textureX, textureY); // Box 6
		barrelModel[20] = new ModelRendererTurbo(this, 97, 405, textureX, textureY); // Box 6
		barrelModel[21] = new ModelRendererTurbo(this, 201, 413, textureX, textureY); // Box 6
		barrelModel[22] = new ModelRendererTurbo(this, 425, 413, textureX, textureY); // Box 6
		barrelModel[23] = new ModelRendererTurbo(this, 505, 413, textureX, textureY); // Box 6
		barrelModel[24] = new ModelRendererTurbo(this, 441, 421, textureX, textureY); // Box 6
		barrelModel[25] = new ModelRendererTurbo(this, 705, 421, textureX, textureY); // Box 6
		barrelModel[26] = new ModelRendererTurbo(this, 737, 397, textureX, textureY); // Box 6
		barrelModel[27] = new ModelRendererTurbo(this, 729, 421, textureX, textureY); // Box 6
		barrelModel[28] = new ModelRendererTurbo(this, 577, 405, textureX, textureY); // Box 6
		barrelModel[29] = new ModelRendererTurbo(this, 705, 405, textureX, textureY); // Box 6
		barrelModel[30] = new ModelRendererTurbo(this, 97, 429, textureX, textureY); // Box 1
		barrelModel[31] = new ModelRendererTurbo(this, 129, 429, textureX, textureY); // Box 2
		barrelModel[32] = new ModelRendererTurbo(this, 201, 429, textureX, textureY); // Box 3

		barrelModel[0].addShapeBox(29F, -1.5F, -2.5F, 2, 1, 5, 0F,0F, 0F, -1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 6
		barrelModel[0].setRotationPoint(23F, -30F, 0F);

		barrelModel[1].addShapeBox(31F, -3.5F, -3.5F, 8, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[1].setRotationPoint(23F, -30F, 0F);

		barrelModel[2].addShapeBox(-5F, -6F, -8F, 9, 13, 16, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[2].setRotationPoint(23F, -30F, 0F);

		barrelModel[3].addShapeBox(4F, -5F, -8F, 3, 12, 16, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F); // Box 6
		barrelModel[3].setRotationPoint(23F, -30F, 0F);

		barrelModel[4].addShapeBox(45F, -1F, -2F, 30, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[4].setRotationPoint(23F, -30F, 0F);

		barrelModel[5].addShapeBox(76F, -1F, -2F, 4, 2, 4, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 6
		barrelModel[5].setRotationPoint(23F, -30F, 0F);

		barrelModel[6].addShapeBox(75F, -1F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F); // Box 6
		barrelModel[6].setRotationPoint(23F, -30F, 0F);

		barrelModel[7].addShapeBox(76F, 1F, -2F, 4, 2, 4, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 6
		barrelModel[7].setRotationPoint(23F, -30F, 0F);

		barrelModel[8].addShapeBox(76F, 0F, -2F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 6
		barrelModel[8].setRotationPoint(23F, -30F, 0F);

		barrelModel[9].addShapeBox(76F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 6
		barrelModel[9].setRotationPoint(23F, -30F, 0F);

		barrelModel[10].addShapeBox(75F, 1F, -2F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F); // Box 6
		barrelModel[10].setRotationPoint(23F, -30F, 0F);

		barrelModel[11].addShapeBox(75F, 0.5F, -2F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F); // Box 6
		barrelModel[11].setRotationPoint(23F, -30F, 0F);

		barrelModel[12].addShapeBox(44F, 0F, -3F, 1, 2, 6, 0F,0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -0.5F); // Box 6
		barrelModel[12].setRotationPoint(23F, -30F, 0F);

		barrelModel[13].addShapeBox(44F, 2F, -3F, 1, 1, 6, 0F,0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F); // Box 6
		barrelModel[13].setRotationPoint(23F, -30F, 0F);

		barrelModel[14].addShapeBox(44F, -1F, -2F, 1, 1, 4, 0F,0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F); // Box 6
		barrelModel[14].setRotationPoint(23F, -30F, 0F);

		barrelModel[15].addShapeBox(45F, 0F, -2F, 30, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[15].setRotationPoint(23F, -30F, 0F);

		barrelModel[16].addShapeBox(45F, 2F, -2F, 30, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		barrelModel[16].setRotationPoint(23F, -30F, 0F);

		barrelModel[17].addShapeBox(13F, 0F, -2F, 16, 2, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 6
		barrelModel[17].setRotationPoint(23F, -30F, 0F);

		barrelModel[18].addShapeBox(13F, -1F, -2F, 16, 1, 4, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 6
		barrelModel[18].setRotationPoint(23F, -30F, 0F);

		barrelModel[19].addShapeBox(13F, 2F, -2F, 16, 1, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 6
		barrelModel[19].setRotationPoint(23F, -30F, 0F);

		barrelModel[20].addShapeBox(29F, -0.5F, -3.5F, 2, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		barrelModel[20].setRotationPoint(23F, -30F, 0F);

		barrelModel[21].addShapeBox(31F, -0.5F, -3.5F, 8, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[21].setRotationPoint(23F, -30F, 0F);

		barrelModel[22].addShapeBox(29F, 2.5F, -3.5F, 2, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, -2F); // Box 6
		barrelModel[22].setRotationPoint(23F, -30F, 0F);

		barrelModel[23].addShapeBox(31F, 2.5F, -3.5F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 6
		barrelModel[23].setRotationPoint(23F, -30F, 0F);

		barrelModel[24].addShapeBox(39F, 2.5F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -1F); // Box 6
		barrelModel[24].setRotationPoint(23F, -30F, 0F);

		barrelModel[25].addShapeBox(39F, -0.5F, -3.5F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 6
		barrelModel[25].setRotationPoint(23F, -30F, 0F);

		barrelModel[26].addShapeBox(39F, -1.5F, -2.5F, 2, 1, 5, 0F,0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 6
		barrelModel[26].setRotationPoint(23F, -30F, 0F);

		barrelModel[27].addShapeBox(41F, 0F, -3F, 3, 2, 6, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 6
		barrelModel[27].setRotationPoint(23F, -30F, 0F);

		barrelModel[28].addShapeBox(41F, -1F, -2F, 3, 1, 4, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 6
		barrelModel[28].setRotationPoint(23F, -30F, 0F);

		barrelModel[29].addShapeBox(41F, 2F, -2F, 3, 1, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F); // Box 6
		barrelModel[29].setRotationPoint(23F, -30F, 0F);

		barrelModel[30].addShapeBox(7F, -1F, -3.5F, 6, 2, 7, 0F,0F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 1
		barrelModel[30].setRotationPoint(23F, -31F, 0F);

		barrelModel[31].addShapeBox(7F, 1F, -3.5F, 6, 2, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 2
		barrelModel[31].setRotationPoint(23F, -31F, 0F);

		barrelModel[32].addShapeBox(7F, 3F, -3.5F, 6, 2, 7, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.5F, -2F); // Box 3
		barrelModel[32].setRotationPoint(23F, -31F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 6
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 921, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 873, 17, textureX, textureY); // Box 6
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 6
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 961, 33, textureX, textureY); // Box 6
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 6
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 521, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 577, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 601, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 681, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 753, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 6
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 6
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 6
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 6
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 641, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 841, 65, textureX, textureY); // Box 6
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 6
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 673, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 753, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 6
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 6
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 6
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 6
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 897, 161, textureX, textureY); // Box 6
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 6

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
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 6
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 1001, 105, textureX, textureY); // Box 6
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 6
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 817, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 849, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 6
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 545, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 577, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 633, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 665, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 689, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 6
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 353, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 889, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); // Box 6
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 529, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 561, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 593, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 617, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 649, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 681, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 713, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 737, 145, textureX, textureY); // Box 6
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 6
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 6
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 6

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
		leftTrackModel[0] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 6
		leftTrackModel[1] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 6
		leftTrackModel[2] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 6
		leftTrackModel[3] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 6
		leftTrackModel[4] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Box 6
		leftTrackModel[5] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 6
		leftTrackModel[6] = new ModelRendererTurbo(this, 969, 89, textureX, textureY); // Box 6
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 6

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
		rightTrackModel[0] = new ModelRendererTurbo(this, 753, 145, textureX, textureY); // Box 6
		rightTrackModel[1] = new ModelRendererTurbo(this, 905, 145, textureX, textureY); // Box 6
		rightTrackModel[2] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 6
		rightTrackModel[3] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 6
		rightTrackModel[4] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Box 6
		rightTrackModel[5] = new ModelRendererTurbo(this, 865, 153, textureX, textureY); // Box 6
		rightTrackModel[6] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 6
		rightTrackModel[7] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 6

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