//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: F35
// Model Creator: 
// Created on: 26.06.2015 - 18:34:05
// Last changed on: 26.06.2015 - 18:34:05

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJ31 extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelJ31() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[134];
		noseModel = new ModelRendererTurbo[7];
		tailModel = new ModelRendererTurbo[28];
		leftWingModel = new ModelRendererTurbo[7];
		rightWingModel = new ModelRendererTurbo[5];
		yawFlapModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel = new ModelRendererTurbo[2];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyWheelModel = new ModelRendererTurbo[9];
		leftWingWheelModel = new ModelRendererTurbo[14];
		rightWingWheelModel = new ModelRendererTurbo[8];
		planeModeParts = new ModelRendererTurbo[41];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();
		initplaneModeParts_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 24
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 24
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 24
		bodyModel[4] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		bodyModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 24
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 24
		bodyModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 24
		bodyModel[8] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 24
		bodyModel[10] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 24
		bodyModel[11] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 24
		bodyModel[26] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 24
		bodyModel[27] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 24
		bodyModel[28] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 24
		bodyModel[29] = new ModelRendererTurbo(this, 785, 49, textureX, textureY); // Box 24
		bodyModel[30] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 24
		bodyModel[31] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 24
		bodyModel[32] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 24
		bodyModel[33] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 24
		bodyModel[34] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 24
		bodyModel[35] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 24
		bodyModel[36] = new ModelRendererTurbo(this, 609, 57, textureX, textureY); // Box 24
		bodyModel[37] = new ModelRendererTurbo(this, 657, 57, textureX, textureY); // Box 24
		bodyModel[38] = new ModelRendererTurbo(this, 689, 57, textureX, textureY); // Box 24
		bodyModel[39] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 24
		bodyModel[40] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 24
		bodyModel[41] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 24
		bodyModel[42] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 24
		bodyModel[43] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 24
		bodyModel[44] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 24
		bodyModel[45] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 24
		bodyModel[46] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 24
		bodyModel[47] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 24
		bodyModel[48] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 24
		bodyModel[49] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 24
		bodyModel[50] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 24
		bodyModel[51] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 24
		bodyModel[52] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 24
		bodyModel[53] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 24
		bodyModel[54] = new ModelRendererTurbo(this, 585, 73, textureX, textureY); // Box 24
		bodyModel[55] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 24
		bodyModel[56] = new ModelRendererTurbo(this, 857, 57, textureX, textureY); // Box 24
		bodyModel[57] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 24
		bodyModel[58] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 24
		bodyModel[59] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 24
		bodyModel[60] = new ModelRendererTurbo(this, 769, 73, textureX, textureY); // Box 24
		bodyModel[61] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 24
		bodyModel[62] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 24
		bodyModel[63] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 24
		bodyModel[64] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 24
		bodyModel[65] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 24
		bodyModel[66] = new ModelRendererTurbo(this, 961, 121, textureX, textureY); // Box 24
		bodyModel[67] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 24
		bodyModel[68] = new ModelRendererTurbo(this, 825, 129, textureX, textureY); // Box 24
		bodyModel[69] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 24
		bodyModel[70] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 24
		bodyModel[71] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 24
		bodyModel[72] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 24
		bodyModel[73] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 24
		bodyModel[74] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 24
		bodyModel[75] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 24
		bodyModel[76] = new ModelRendererTurbo(this, 713, 57, textureX, textureY); // Box 24
		bodyModel[77] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 24
		bodyModel[78] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 24
		bodyModel[79] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 24
		bodyModel[80] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 24
		bodyModel[81] = new ModelRendererTurbo(this, 649, 9, textureX, textureY); // Box 24
		bodyModel[82] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 24
		bodyModel[83] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 24
		bodyModel[84] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 24
		bodyModel[85] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 24
		bodyModel[86] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 24
		bodyModel[87] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 24
		bodyModel[88] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 24
		bodyModel[89] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 24
		bodyModel[90] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 24
		bodyModel[91] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 24
		bodyModel[92] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 24
		bodyModel[93] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 24
		bodyModel[94] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 24
		bodyModel[95] = new ModelRendererTurbo(this, 1009, 65, textureX, textureY); // Box 24
		bodyModel[96] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 24
		bodyModel[97] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 24
		bodyModel[98] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 24
		bodyModel[99] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 24
		bodyModel[100] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 24
		bodyModel[101] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 24
		bodyModel[102] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 24
		bodyModel[103] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 24
		bodyModel[104] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 24
		bodyModel[105] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 24
		bodyModel[106] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 24
		bodyModel[107] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 24
		bodyModel[108] = new ModelRendererTurbo(this, 585, 89, textureX, textureY); // Box 24
		bodyModel[109] = new ModelRendererTurbo(this, 817, 105, textureX, textureY); // Box 24
		bodyModel[110] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 24
		bodyModel[111] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 24
		bodyModel[112] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 24
		bodyModel[113] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 24
		bodyModel[114] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 24
		bodyModel[115] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 24
		bodyModel[116] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 24
		bodyModel[117] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 24
		bodyModel[118] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 24
		bodyModel[119] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 24
		bodyModel[120] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 24
		bodyModel[121] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 24
		bodyModel[122] = new ModelRendererTurbo(this, 545, 177, textureX, textureY); // Box 24
		bodyModel[123] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 24
		bodyModel[124] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 24
		bodyModel[125] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 24
		bodyModel[126] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 24
		bodyModel[127] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 24
		bodyModel[128] = new ModelRendererTurbo(this, 601, 177, textureX, textureY); // Box 24
		bodyModel[129] = new ModelRendererTurbo(this, 521, 209, textureX, textureY); // Box 257
		bodyModel[130] = new ModelRendererTurbo(this, 593, 209, textureX, textureY); // Box 258
		bodyModel[131] = new ModelRendererTurbo(this, 681, 209, textureX, textureY); // Box 259
		bodyModel[132] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 260
		bodyModel[133] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Box 24

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 21, 20, 0F,1F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[0].setRotationPoint(-34F, -34F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 11, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[1].setRotationPoint(-65F, -18F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F,0F, 0F, -2F, 0F, 1F, 0F, -2F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[2].setRotationPoint(-96F, -31F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F,0F, 1F, 0F, -2F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 0F); // Box 24
		bodyModel[3].setRotationPoint(-96F, -31F, 3F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 4, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, -2F, -1F); // Box 24
		bodyModel[4].setRotationPoint(-96F, -18F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[5].setRotationPoint(-80F, -18F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 6, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 2F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[6].setRotationPoint(-82F, -32F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 26, 19, 15, 0F,1F, 2F, -3F, 0F, 2F, -3F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 24
		bodyModel[7].setRotationPoint(-34F, -32F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 16, 16, 3, 0F,4F, -6F, -3F, 0F, -6F, 0F, 0F, -5F, 0F, 4F, -6.5F, 1.5F, 1F, -1F, -7F, 0F, 1F, -6F, 0F, 0F, 3F, 1F, -2F, 5F); // Box 24
		bodyModel[8].setRotationPoint(-63F, -32F, -22F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 30, 21, 26, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[9].setRotationPoint(-8F, -34F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[10].setRotationPoint(-81F, -21F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(-65F, -21F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[12].setRotationPoint(-76F, -22F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[13].setRotationPoint(-76F, -22F, 2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 12, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[14].setRotationPoint(-66F, -29F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 18, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[15].setRotationPoint(-65F, -38F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[16].setRotationPoint(-81F, -23F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[17].setRotationPoint(-83.5F, -32F, -4F);

		bodyModel[18].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[18].setRotationPoint(-80.5F, -37F, -3.5F);
		bodyModel[18].rotateAngleZ = -0.33161256F;

		bodyModel[19].addShapeBox(0F, 1F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(-80.5F, -37F, 2.5F);
		bodyModel[19].rotateAngleZ = -0.33161256F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 0, 0, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[20].setRotationPoint(24F, -13F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 17, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-25F, -36F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 14, 11, 3, 0F,0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 2F, -1F, -2F, 2F, -1F, 1F, 0F, -2F, 2F); // Box 24
		bodyModel[22].setRotationPoint(-96F, -25F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 11, 3, 0F,0F, 0F, 1F, 0F, 1F, 2F, 0F, 1F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 1F); // Box 24
		bodyModel[23].setRotationPoint(-82F, -26F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 11, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, -2F, 2F, 2F, -1F, 1F, 2F, -1F, -2F, 0F, -2F, -5F); // Box 24
		bodyModel[24].setRotationPoint(-96F, -25F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 50, 3, 20, 0F,0F, 0F, -7F, 0F, -2F, -4F, 0F, -2F, -6F, 0F, 0.5F, -5F, 0F, 0F, -4F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, -3F); // Box 24
		bodyModel[25].setRotationPoint(22F, -37F, -16F);

		bodyModel[26].addShapeBox(0F, 1F, -4F, 17, 4, 4, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[26].setRotationPoint(-25F, -39F, -6F);

		bodyModel[27].addShapeBox(0F, 1F, 0F, 30, 2, 8, 0F,0F, 0F, -3F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[27].setRotationPoint(-8F, -40.5F, -9F);

		bodyModel[28].addShapeBox(0F, 1F, 0F, 30, 2, 2, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[28].setRotationPoint(-8F, -41F, -1F);

		bodyModel[29].addShapeBox(0F, 9F, 0F, 50, 2, 2, 0F,0F, 0F, 0F, 0F, -3.5F, 11F, 0F, -3.5F, -3F, 0F, 0F, -1F, 0F, -0.5F, 8F, 0F, 1.5F, 11F, 0F, 1.5F, -3F, 0F, -0.5F, -2F); // Box 24
		bodyModel[29].setRotationPoint(22F, -47.5F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 6, 8, 0F,4F, -8F, 0F, 0F, -8F, 3F, 2F, 0F, 0F, -2F, -2F, 0F, 4F, 2.5F, -1.5F, 0F, 3F, 2F, 2F, -4F, 0F, -2F, -3F, 1F); // Box 24
		bodyModel[30].setRotationPoint(-63F, -34F, -19F);

		bodyModel[31].addShapeBox(2F, 0F, 0F, 2, 8, 6, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 24
		bodyModel[31].setRotationPoint(-61F, -42F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,-2F, 1F, -1F, 0F, 1F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[32].setRotationPoint(-45F, -38F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[33].setRotationPoint(-35F, -38F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 24
		bodyModel[34].setRotationPoint(-35F, -38F, -13F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, -2F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[35].setRotationPoint(-45F, -38F, -13F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 20, 12, 3, 0F,0F, 0F, 2F, -10F, 5F, 3F, -10F, 5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[36].setRotationPoint(-65F, -27F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 10, 17, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 3F, 0F, 0F, 3F, -1F, 0F, -3F, 11F, 2F, -3F, 11F, 2F, 3F, -1F, 0F, 3F); // Box 24
		bodyModel[37].setRotationPoint(-55F, -32F, -13F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F,-1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -1F, -2F, -2F, 0F, -2F, -2F, -1F, -1F, 0F, -1F); // Box 24
		bodyModel[38].setRotationPoint(-56F, -38F, 10F);

		bodyModel[39].addShapeBox(2F, 0F, 0F, 10, 6, 3, 0F,-6F, -1F, 0F, -2F, -0.5F, 0F, -1F, -1F, -1F, -6F, -1F, -3F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 2F, 0F); // Box 24
		bodyModel[39].setRotationPoint(-67F, -42F, 6F);

		bodyModel[40].addShapeBox(2F, 0F, 0F, 10, 4, 5, 0F,0F, -2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F); // Box 24
		bodyModel[40].setRotationPoint(-67F, -36F, 6F);

		bodyModel[41].addShapeBox(2F, 0F, 0F, 2, 8, 6, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[41].setRotationPoint(-59F, -42F, -6F);

		bodyModel[42].addShapeBox(2F, 0F, 0F, 2, 8, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[42].setRotationPoint(-61F, -42F, 0F);

		bodyModel[43].addShapeBox(2F, 0F, 0F, 2, 8, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[43].setRotationPoint(-59F, -42F, 0F);

		bodyModel[44].addShapeBox(2F, 0F, 0F, 10, 6, 3, 0F,-6F, -1F, -3F, -1F, -1F, -1F, -2F, -0.5F, 0F, -6F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 2F, -2F); // Box 24
		bodyModel[44].setRotationPoint(-67F, -42F, -9F);

		bodyModel[45].addShapeBox(2F, 0F, 0F, 10, 4, 5, 0F,0F, -2F, -2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 24
		bodyModel[45].setRotationPoint(-67F, -36F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 13, 6, 4, 0F,-1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, -1F, -2F, -2F, -1F, -2F, -2F, 0F, -1F, 0F, -1F); // Box 24
		bodyModel[46].setRotationPoint(-56F, -38F, -14F);

		bodyModel[47].addShapeBox(0F, -2F, -7F, 21, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[47].setRotationPoint(-55F, -32F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[48].setRotationPoint(-35F, -40F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 6, 3, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[49].setRotationPoint(-35F, -40F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[50].setRotationPoint(-35F, -40F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, -1F, 17, 4, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[51].setRotationPoint(-25F, -40F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 25, 20, 24, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F); // Box 24
		bodyModel[52].setRotationPoint(22F, -34F, -12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 20, 12, 3, 0F,0F, 0F, -1F, -10F, 5F, 0F, -10F, 5F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[53].setRotationPoint(-65F, -27F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 17, 11, 3, 0F,0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 2F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 24
		bodyModel[54].setRotationPoint(-82F, -26F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 17, 6, 3, 0F,0F, 0F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 2F, 0F, 0F, 1F); // Box 24
		bodyModel[55].setRotationPoint(-82F, -32F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -5F, 3F, 0F, 0F, 2F); // Box 24
		bodyModel[56].setRotationPoint(-65F, -32F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 10, 17, 3, 0F,0F, 0F, 3F, 0F, 2F, 3F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 11F, 2F, 3F, 11F, 2F, -3F, -1F, 0F, -3F); // Box 24
		bodyModel[57].setRotationPoint(-55F, -32F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 30, 19, 15, 0F,0F, 2F, -3F, 0F, 2F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 24
		bodyModel[58].setRotationPoint(-8F, -32F, 10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 50, 18, 15, 0F,0F, 2F, -2F, 0F, 0F, 0F, -7F, -6F, -2F, 0F, -6F, 0F, 0F, 1F, -2F, -25F, 0F, -1F, -25F, 0F, -7F, 0F, 1F, -7F); // Box 24
		bodyModel[59].setRotationPoint(22F, -32F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 25, 15, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[60].setRotationPoint(47F, -33F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 25, 15, 5, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[61].setRotationPoint(47F, -33F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 25, 15, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[62].setRotationPoint(47F, -33F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 50, 18, 15, 0F,0F, -6F, 0F, -7F, -6F, -2F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 1F, -7F, -25F, 0F, -7F, -25F, 0F, -1F, 0F, 1F, -2F); // Box 24
		bodyModel[63].setRotationPoint(22F, -32F, -25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 30, 19, 15, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 2F, -2F, 0F, 2F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 24
		bodyModel[64].setRotationPoint(-8F, -32F, -25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 26, 19, 15, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 2F, -3F, 1F, 2F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[65].setRotationPoint(-34F, -32F, -25F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 13, 18, 15, 0F,0F, -6F, -3F, 0F, -6F, 0F, -1F, 2F, -3F, -2F, 2F, -1F, 0F, -1F, -9F, 0F, 1F, -7F, 0F, 1F, 0F, -2F, -0.1F, 2F); // Box 24
		bodyModel[66].setRotationPoint(-47F, -32F, -25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 16, 16, 3, 0F,4F, -6.5F, 1.5F, 0F, -5F, 0F, 0F, -6F, 0F, 4F, -6F, -3F, 1F, -2F, 5F, 0F, 0F, 3F, 0F, 1F, -6F, 1F, -1F, -7F); // Box 24
		bodyModel[67].setRotationPoint(-63F, -32F, 19F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,0F, -1F, -0.15F, 0F, -2F, 0F, -2F, 0F, 0F, 5F, 1F, -2F, 0F, -1F, 0F, 0F, -0.1F, 0F, -2F, -1F, 0F, 5F, -3F, -1F); // Box 24
		bodyModel[68].setRotationPoint(-59F, -17F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 16, 6, 8, 0F,-2F, -2F, 0F, 2F, 0F, 0F, 0F, -8F, 3F, 4F, -8F, 0F, -2F, -3F, 1F, 2F, -4F, 0F, 0F, 3F, 2F, 4F, 2.5F, -1.5F); // Box 24
		bodyModel[69].setRotationPoint(-63F, -34F, 11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 18, 15, 0F,-2F, 2F, -1F, -1F, 2F, -3F, 0F, -6F, 0F, 0F, -6F, -3F, -2F, -0.1F, 2F, 0F, 1F, 0F, 0F, 1F, -7F, 0F, -1F, -9F); // Box 24
		bodyModel[70].setRotationPoint(-47F, -32F, 10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 21, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 0F, -11F, 0F, 0F); // Box 24
		bodyModel[71].setRotationPoint(-45F, -34F, -13F);

		bodyModel[72].addShapeBox(0F, 0F, -3F, 10, 21, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -3F, -11F, 0F, -3F); // Box 24
		bodyModel[72].setRotationPoint(-45F, -34F, 10F);

		bodyModel[73].addShapeBox(0F, -1F, -7F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[73].setRotationPoint(-54F, -16F, 0F);

		bodyModel[74].addShapeBox(0F, -1F, 6F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[74].setRotationPoint(-54F, -15F, 0F);

		bodyModel[75].addShapeBox(0F, -1F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[75].setRotationPoint(-54F, -16F, 0F);

		bodyModel[76].addShapeBox(19F, -1F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[76].setRotationPoint(-54F, -16F, 0F);

		bodyModel[77].addShapeBox(1F, -1F, -1F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[77].setRotationPoint(-54F, -16F, 0F);

		bodyModel[78].addShapeBox(2F, -1F, -6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[78].setRotationPoint(-54F, -16F, 0F);

		bodyModel[79].addShapeBox(5F, -1F, -6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[79].setRotationPoint(-54F, -16F, 0F);

		bodyModel[80].addShapeBox(8F, -1F, -6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[80].setRotationPoint(-54F, -16F, 0F);

		bodyModel[81].addShapeBox(11F, -1F, -6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[81].setRotationPoint(-54F, -16F, 0F);

		bodyModel[82].addShapeBox(14F, -1F, -6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[82].setRotationPoint(-54F, -16F, 0F);

		bodyModel[83].addShapeBox(17F, -1F, -6F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[83].setRotationPoint(-54F, -16F, 0F);

		bodyModel[84].addShapeBox(17F, -1F, 1F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[84].setRotationPoint(-54F, -16F, 0F);

		bodyModel[85].addShapeBox(14F, -1F, 1F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[85].setRotationPoint(-54F, -16F, 0F);

		bodyModel[86].addShapeBox(11F, -1F, 1F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[86].setRotationPoint(-54F, -16F, 0F);

		bodyModel[87].addShapeBox(8F, -1F, 1F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[87].setRotationPoint(-54F, -16F, 0F);

		bodyModel[88].addShapeBox(5F, -1F, 1F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[88].setRotationPoint(-54F, -16F, 0F);

		bodyModel[89].addShapeBox(2F, -1F, 1F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[89].setRotationPoint(-54F, -16F, 0F);

		bodyModel[90].addShapeBox(0F, -2F, -11F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[90].setRotationPoint(-55F, -32F, 0F);

		bodyModel[91].addShapeBox(0F, -2F, 7F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[91].setRotationPoint(-55F, -32F, 0F);

		bodyModel[92].addShapeBox(2F, 0F, 0F, 2, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 24
		bodyModel[92].setRotationPoint(-61F, -34F, -6F);

		bodyModel[93].addShapeBox(2F, 0F, 0F, 2, 16, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[93].setRotationPoint(-61F, -34F, 0F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 10, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F, 3F, 0F, -5F, 1F, 0F, 0F, 0F); // Box 24
		bodyModel[94].setRotationPoint(-65F, -32F, -10F);

		bodyModel[95].addShapeBox(2F, 0F, 0F, 4, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[95].setRotationPoint(-61F, -34F, -8F);

		bodyModel[96].addShapeBox(2F, 0F, 0F, 4, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[96].setRotationPoint(-61F, -34F, 6F);

		bodyModel[97].addShapeBox(2F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[97].setRotationPoint(-61F, -41F, -8F);

		bodyModel[98].addShapeBox(2F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[98].setRotationPoint(-61F, -41F, 6F);

		bodyModel[99].addShapeBox(9F, -3F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[99].setRotationPoint(-55F, -33F, 0F);

		bodyModel[100].addShapeBox(8F, -3F, -2F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[100].setRotationPoint(-55F, -33F, 0F);

		bodyModel[101].addShapeBox(11F, -3F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[101].setRotationPoint(-55F, -33F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[102].setRotationPoint(-55F, -38F, -10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[103].setRotationPoint(-55F, -38F, -7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[104].setRotationPoint(-56F, -38F, -3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[105].setRotationPoint(-55F, -38F, 3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[106].setRotationPoint(-55F, -38F, 7.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[107].setRotationPoint(-37F, -38F, 3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[108].setRotationPoint(-41F, -38F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 24
		bodyModel[109].setRotationPoint(-37F, -38F, -7.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 24
		bodyModel[110].setRotationPoint(-41F, -38F, -10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[111].setRotationPoint(-82F, -34F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 17, 2, 3, 0F,0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[112].setRotationPoint(-82F, -34F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, -7F, 11, 12, 14, 0F,0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[113].setRotationPoint(-89.5F, -31F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[114].setRotationPoint(-82F, -43F, -2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[115].setRotationPoint(-82F, -40.1F, -7.25F);
		bodyModel[115].rotateAngleX = 0.50614548F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[116].setRotationPoint(-82F, -32.1F, -9F);
		bodyModel[116].rotateAngleX = 1.3543755F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[117].setRotationPoint(-82F, -43F, 2F);
		bodyModel[117].rotateAngleX = -0.50614548F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[118].setRotationPoint(-82F, -40.05F, 7.3F);
		bodyModel[118].rotateAngleX = -1.37182879F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 20, 5, 6, 0F,0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 1F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[119].setRotationPoint(47F, -19F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 20, 5, 5, 0F,0F, 0F, 0F, 5F, -1F, -1F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, -4F, -1F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 24
		bodyModel[120].setRotationPoint(47F, -19F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, -6F, 20, 5, 6, 0F,0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 24
		bodyModel[121].setRotationPoint(47F, -19F, 6F);

		bodyModel[122].addShapeBox(0F, 0F, -5F, 20, 5, 5, 0F,0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 5F, -4F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[122].setRotationPoint(47F, -19F, 11F);

		bodyModel[123].addShapeBox(6F, -2F, -8F, 6, 2, 5, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[123].setRotationPoint(-45F, -34F, -13F);
		bodyModel[123].rotateAngleX = 0.62831853F;

		bodyModel[124].addShapeBox(12F, -2F, -8F, 6, 2, 5, 0F,0F, -0.5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[124].setRotationPoint(-45F, -34F, -13F);
		bodyModel[124].rotateAngleX = 0.62831853F;

		bodyModel[125].addShapeBox(3F, -2F, -4F, 3, 2, 1, 0F,-1F, -1.5F, 1F, 0F, -1F, 0.5F, 0F, -0.5F, -1F, -1.5F, -1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		bodyModel[125].setRotationPoint(-45F, -34F, -13F);
		bodyModel[125].rotateAngleX = 0.62831853F;

		bodyModel[126].addShapeBox(4F, -2F, -7F, 2, 1, 3, 0F,-0.5F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -1F); // Box 24
		bodyModel[126].setRotationPoint(-45F, -34F, -13F);
		bodyModel[126].rotateAngleX = 0.62831853F;

		bodyModel[127].addShapeBox(3F, -2F, -8F, 3, 2, 1, 0F,-1.5F, -1F, -1.5F, 0F, -0.5F, -1F, 0F, -1F, 0.5F, -1F, -1.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 24
		bodyModel[127].setRotationPoint(-45F, -34F, -13F);
		bodyModel[127].rotateAngleX = 0.62831853F;

		bodyModel[128].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,5F, 1F, -2F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -0.15F, 5F, -3F, -1F, -2F, -1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F); // Box 24
		bodyModel[128].setRotationPoint(-59F, -17F, -16F);

		bodyModel[129].addShapeBox(0F, 1F, 0F, 30, 2, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[129].setRotationPoint(-8F, -40.5F, 1F);

		bodyModel[130].addShapeBox(0F, 8F, 0F, 50, 2, 2, 0F,0F, 0F, -1F, 0F, -3.5F, -3F, 0F, -3.5F, 11F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, 1.5F, -3F, 0F, 1.5F, 11F, 0F, -0.5F, 8F); // Box 258
		bodyModel[130].setRotationPoint(22F, -46.5F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 50, 3, 20, 0F,0F, 0.5F, -5F, 0F, -2F, -6F, 0F, -2F, -4F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 2F, -2F, 0F, 2F, 0F, 0F, 0F, -4F); // Box 259
		bodyModel[131].setRotationPoint(22F, -37F, -4F);

		bodyModel[132].addShapeBox(0F, 1F, -4F, 17, 4, 4, 0F,0F, 2F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 260
		bodyModel[132].setRotationPoint(-25F, -39F, 10F);

		bodyModel[133].addShapeBox(0F, 2F, 0F, 30, 4, 20, 0F,0F, -0.5F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 3F); // Box 24
		bodyModel[133].setRotationPoint(-8F, -40F, -10F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 673, 25, textureX, textureY); // Box 24
		noseModel[1] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 24
		noseModel[2] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 24
		noseModel[3] = new ModelRendererTurbo(this, 945, 25, textureX, textureY); // Box 24
		noseModel[4] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 24
		noseModel[5] = new ModelRendererTurbo(this, 625, 145, textureX, textureY); // Box 24
		noseModel[6] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 24

		noseModel[0].addShapeBox(0F, 0F, 0F, 10, 5, 10, 0F,0F, -6F, -5F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -6F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -5F); // Box 24
		noseModel[0].setRotationPoint(-121F, -29F, -5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 15, 7, 4, 0F,0F, -3F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 3F, 0F, 0F, -2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 3F); // Box 24
		noseModel[1].setRotationPoint(-111F, -31F, -7F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 15, 8, 14, 0F,0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, -2F, 0F, -2F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -6F); // Box 24
		noseModel[2].setRotationPoint(-111F, -24F, -7F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -5F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -5F, -5F); // Box 24
		noseModel[3].setRotationPoint(-121F, -24F, -5F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 15, 7, 4, 0F,0F, -3F, 3F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, 0F, 3F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, -2F); // Box 24
		noseModel[4].setRotationPoint(-111F, -31F, 3F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 15, 7, 6, 0F,0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 24
		noseModel[5].setRotationPoint(-111F, -32F, -3F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 12, 8, 6, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		noseModel[6].setRotationPoint(-96F, -33F, -3F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 24
		tailModel[1] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 24
		tailModel[2] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 24
		tailModel[3] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 24
		tailModel[4] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 24
		tailModel[5] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 24
		tailModel[6] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 24
		tailModel[7] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 24
		tailModel[8] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 24
		tailModel[9] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 24
		tailModel[10] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 24
		tailModel[11] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 24
		tailModel[12] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 24
		tailModel[13] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 24
		tailModel[14] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 287
		tailModel[15] = new ModelRendererTurbo(this, 881, 185, textureX, textureY); // Box 289
		tailModel[16] = new ModelRendererTurbo(this, 953, 185, textureX, textureY); // Box 290
		tailModel[17] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 291
		tailModel[18] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 292
		tailModel[19] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 293
		tailModel[20] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 294
		tailModel[21] = new ModelRendererTurbo(this, 537, 193, textureX, textureY); // Box 295
		tailModel[22] = new ModelRendererTurbo(this, 601, 193, textureX, textureY); // Box 296
		tailModel[23] = new ModelRendererTurbo(this, 689, 193, textureX, textureY); // Box 297
		tailModel[24] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 302
		tailModel[25] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 303
		tailModel[26] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Box 304
		tailModel[27] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Box 257

		tailModel[0].addShapeBox(0F, 0F, 0F, 32, 6, 5, 0F,0F, -4F, 0F, 0F, -4.5F, -6F, 0F, -4.5F, 1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 1F, -3.5F, 0F, 0F, 2F, 0F, -2F, -1F); // Box 24
		tailModel[0].setRotationPoint(72F, -36F, -16F);

		tailModel[1].addShapeBox(0F, -35F, 0F, 42, 35, 2, 0F,-15F, 0F, -1F, -18F, 0F, -1F, -18F, 0F, -0.5F, -15F, 0F, -0.5F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[1].setRotationPoint(64F, -26F, 16F);
		tailModel[1].rotateAngleX = -0.41887902F;

		tailModel[2].addShapeBox(0F, 0F, 0F, 25, 12, 12, 0F,-25F, 6F, 1F, 0F, 6F, 1F, -6F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -4F, -7F, 0F, 0F, -5F); // Box 24
		tailModel[2].setRotationPoint(47F, -26F, 11F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 25, 12, 12, 0F,-18F, 0F, 0F, -6F, 0F, 0F, 0F, 6F, 1F, -25F, 6F, 1F, 0F, 0F, -5F, 0F, -4F, -7F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 24
		tailModel[3].setRotationPoint(47F, -26F, -23F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 20, 13, 14, 0F,6F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, 0F, -1F, 0F, 1F, -7F, 0F, -2F, -7F, 0F, -2F, -5F, 0F, 1F, -1F); // Box 24
		tailModel[4].setRotationPoint(72F, -32F, -23F);

		tailModel[5].addShapeBox(0F, -35F, -2F, 42, 35, 2, 0F,-15F, 0F, -0.5F, -18F, 0F, -0.5F, -18F, 0F, -1F, -15F, 0F, -1F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[5].setRotationPoint(64F, -26F, -16F);
		tailModel[5].rotateAngleX = 0.41887902F;

		tailModel[6].addShapeBox(0F, 0F, 0F, 32, 6, 2, 0F,0F, 0F, 2F, 0F, -3F, -1.5F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		tailModel[6].setRotationPoint(72F, -32F, -14F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 32, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F); // Box 24
		tailModel[7].setRotationPoint(72F, -26F, 12F);

		tailModel[8].addShapeBox(0F, -7F, 0F, 32, 2, 9, 0F,0F, -1F, 0F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, -1F, 1F, 0F, 2F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 2F, 0F); // Box 24
		tailModel[8].setRotationPoint(72F, -29F, -12F);

		tailModel[9].addShapeBox(0F, 0F, -7F, 32, 6, 5, 0F,0F, -1F, -2F, 0F, -4.5F, 1F, 0F, -4.5F, -6F, 0F, -4F, 0F, 0F, -2F, -1F, 0F, 0F, 2F, 0F, 1F, -3.5F, 0F, -2F, 0F); // Box 24
		tailModel[9].setRotationPoint(72F, -36F, 3F);

		tailModel[10].addShapeBox(0F, 0F, -1F, 32, 6, 2, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -3F, -1.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 2F); // Box 24
		tailModel[10].setRotationPoint(72F, -32F, -2F);

		tailModel[11].addShapeBox(-19F, -7F, -3F, 25, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[11].setRotationPoint(88F, -24F, -7F);

		tailModel[12].addShapeBox(-19F, -7F, -8F, 25, 15, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[12].setRotationPoint(88F, -24F, -7F);

		tailModel[13].addShapeBox(-19F, -7F, 3F, 25, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 24
		tailModel[13].setRotationPoint(88F, -24F, -7F);

		tailModel[14].addShapeBox(-19F, -7F, -8F, 25, 15, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		tailModel[14].setRotationPoint(88F, -24F, -7F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 32, 5, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // Box 289
		tailModel[15].setRotationPoint(72F, -26F, -14F);

		tailModel[16].addShapeBox(0F, 0F, -1F, 32, 5, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 2F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F); // Box 290
		tailModel[16].setRotationPoint(72F, -26F, -2F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 32, 6, 5, 0F,0F, -4F, 0F, 0F, -4.5F, -6F, 0F, -4.5F, 1F, 0F, -1F, -2F, 0F, -2F, 0F, 0F, 1F, -3.5F, 0F, 0F, 2F, 0F, -2F, -1F); // Box 291
		tailModel[17].setRotationPoint(72F, -36F, -1F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 20, 13, 14, 0F,0F, 0F, -1F, 0F, -6F, -5F, 0F, -6F, 0F, 6F, -6F, 0F, 0F, 1F, -1F, 0F, -2F, -5F, 0F, -2F, -7F, 0F, 1F, -7F); // Box 292
		tailModel[18].setRotationPoint(72F, -32F, 9F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 32, 6, 2, 0F,0F, 0F, 2F, 0F, -3F, -1.5F, 0F, -2F, 3F, 0F, 0F, 0F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 293
		tailModel[19].setRotationPoint(72F, -32F, 1F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 32, 5, 2, 0F,0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F); // Box 294
		tailModel[20].setRotationPoint(72F, -26F, 1F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 32, 6, 2, 0F,0F, 0F, 0F, 0F, -2F, 3F, 0F, -3F, -1.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 295
		tailModel[21].setRotationPoint(72F, -32F, 12F);

		tailModel[22].addShapeBox(0F, -7F, 0F, 32, 2, 9, 0F,0F, -1F, 1F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 2F, 0F); // Box 296
		tailModel[22].setRotationPoint(72F, -29F, 3F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 32, 6, 5, 0F,0F, -1F, -1F, 0F, -4.5F, 1F, 0F, -4.5F, -6F, 0F, -4F, 0F, 0F, -2F, -1F, 0F, 0F, 2F, 0F, 1F, -3.5F, 0F, -2F, 0F); // Box 297
		tailModel[23].setRotationPoint(72F, -36F, 11F);

		tailModel[24].addShapeBox(-19F, -7F, 3F, 25, 15, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		tailModel[24].setRotationPoint(88F, -24F, -4F);

		tailModel[25].addShapeBox(-19F, -7F, -3F, 25, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		tailModel[25].setRotationPoint(88F, -24F, 7F);

		tailModel[26].addShapeBox(-19F, -6F, -8F, 25, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 304
		tailModel[26].setRotationPoint(88F, -25F, 18F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 37, 9, 2, 0F,0F, 0F, 2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, 2F); // Box 257
		tailModel[27].setRotationPoint(72F, -28F, -1F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 657, 1, textureX, textureY); // Box 24
		leftWingModel[1] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 24
		leftWingModel[2] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 24
		leftWingModel[3] = new ModelRendererTurbo(this, 673, 41, textureX, textureY); // Box 24
		leftWingModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 24
		leftWingModel[5] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 24
		leftWingModel[6] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 259

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 14, 2, 8, 0F,0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, 0F, -6F, 0F, 1F, 0F, 0F, 0F); // Box 24
		leftWingModel[0].setRotationPoint(-13F, -26F, -32F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingModel[1].setRotationPoint(-34F, -26F, -26F);

		leftWingModel[2].addShapeBox(0F, 0F, -56F, 56, 2, 56, 0F,-50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 24
		leftWingModel[2].setRotationPoint(-5F, -26F, -24F);

		leftWingModel[3].addShapeBox(0F, 0F, -8F, 11, 2, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingModel[3].setRotationPoint(51F, -26F, -72F);

		leftWingModel[4].addShapeBox(0F, 0F, -12F, 26, 2, 12, 0F,0F, 0F, 0F, -10F, 0F, 0F, -7.5F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, -10F, 0F, 0F, -7F, 0F, 4F, 0F, 0F, 2F); // Box 24
		leftWingModel[4].setRotationPoint(51F, -26F, -24F);

		leftWingModel[5].addShapeBox(0F, 0F, -8F, 14, 2, 8, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -6F); // Box 24
		leftWingModel[5].setRotationPoint(-13F, -26F, 32F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 100, 1, 200, 0F,-40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F); // Box 259
		leftWingModel[6].setRotationPoint(-8F, -26.5F, -148F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 24
		rightWingModel[1] = new ModelRendererTurbo(this, 649, 129, textureX, textureY); // Box 24
		rightWingModel[2] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 24
		rightWingModel[3] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 24
		rightWingModel[4] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 258

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 21, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 24
		rightWingModel[0].setRotationPoint(-34F, -26F, 24F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 56, 2, 56, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -50F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, -50F, 0F, 0F); // Box 24
		rightWingModel[1].setRotationPoint(-5F, -26F, 24F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 26, 2, 12, 0F,0F, 0F, 1F, -7.5F, 0F, 2F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -7F, 0F, 4F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[2].setRotationPoint(51F, -26F, 24F);

		rightWingModel[3].addShapeBox(0F, 0F, -8F, 11, 2, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingModel[3].setRotationPoint(51F, -26F, 80F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 100, 1, 200, 0F,-40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F, -40F, 0F, -80F); // Box 258
		rightWingModel[4].setRotationPoint(-8F, -26.5F, -51F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 24

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		yawFlapModel[0].setRotationPoint(-80F, -23F, -0.5F);
		yawFlapModel[0].rotateAngleZ = 0.87266463F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 585, 113, textureX, textureY); // Box 24
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 24

		pitchFlapLeftModel[0].addShapeBox(-12F, -2F, -36F, 32, 1, 25, 0F,-17F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		pitchFlapLeftModel[0].setRotationPoint(92F, -24F, -12F);

		pitchFlapLeftModel[1].addShapeBox(0F, -2F, -8F, 23, 5, 15, 0F,0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, -6F, 0F, 0F, -7F, -3F, -4F, 0F, -3F, -4F, -11F, 0F, 0F, -6F); // Box 24
		pitchFlapLeftModel[1].setRotationPoint(92F, -24F, -15F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 24
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 24

		pitchFlapRightModel[0].addShapeBox(0F, -2F, -7F, 23, 5, 15, 0F,0F, 0F, -6F, -1F, 0F, -9F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, -4F, -11F, -3F, -4F, 0F, 0F, 0F, -7F); // Box 24
		pitchFlapRightModel[0].setRotationPoint(92F, -24F, 15F);

		pitchFlapRightModel[1].addShapeBox(-12F, -2F, 8F, 32, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -17F, 0F, 0F); // Box 24
		pitchFlapRightModel[1].setRotationPoint(92F, -24F, 15F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 24

		pitchFlapLeftWingModel[0].addShapeBox(0F, -1F, -19F, 21, 2, 36, 0F,0F, 0F, 0F, -11F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 24
		pitchFlapLeftWingModel[0].setRotationPoint(51F, -25F, -53F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 24

		pitchFlapRightWingModel[0].addShapeBox(0F, -1F, -17F, 21, 2, 36, 0F,0F, 0F, 0F, -5F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F); // Box 24
		pitchFlapRightWingModel[0].setRotationPoint(51F, -25F, 53F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 24
		bodyWheelModel[1] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 24
		bodyWheelModel[2] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 24
		bodyWheelModel[3] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 24
		bodyWheelModel[4] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Box 24
		bodyWheelModel[5] = new ModelRendererTurbo(this, 705, 9, textureX, textureY); // Box 24
		bodyWheelModel[6] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 24
		bodyWheelModel[7] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 24
		bodyWheelModel[8] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 24

		bodyWheelModel[0].addShapeBox(0F, 0F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyWheelModel[0].setRotationPoint(-64F, 3F, 0F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 24
		bodyWheelModel[1].setRotationPoint(-60.5F, -14F, -1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 24
		bodyWheelModel[2].setRotationPoint(-66.5F, -13.5F, -1F);
		bodyWheelModel[2].rotateAngleZ = 0.66322512F;

		bodyWheelModel[3].addShapeBox(0F, 0F, -1F, 9, 3, 2, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyWheelModel[3].setRotationPoint(-64F, 0F, 0F);

		bodyWheelModel[4].addShapeBox(0F, 0F, -1F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 24
		bodyWheelModel[4].setRotationPoint(-64F, 6F, 0F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 24
		bodyWheelModel[5].setRotationPoint(-80F, -15F, -5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyWheelModel[6].setRotationPoint(-66F, -15F, -5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 24
		bodyWheelModel[7].setRotationPoint(-80F, -15F, 5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyWheelModel[8].setRotationPoint(-66F, -15F, 5F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 993, 9, textureX, textureY); // Box 24
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 24
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 24
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 24
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 24
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 24
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 24
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 24
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 24
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 24
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 24
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 24
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 633, 73, textureX, textureY); // Box 24

		leftWingWheelModel[0].addShapeBox(0F, 0F, -3F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[0].setRotationPoint(30F, -3F, -24F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, -3F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[1].setRotationPoint(30F, 1F, -24F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, -3F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 24
		leftWingWheelModel[2].setRotationPoint(30F, 5F, -24F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[3].setRotationPoint(35F, -17F, -24F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[4].setRotationPoint(20F, -24F, -24F);
		leftWingWheelModel[4].rotateAngleZ = 0.80285146F;

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[5].setRotationPoint(36.5F, -10F, -23.5F);
		leftWingWheelModel[5].rotateAngleZ = -0.38397244F;

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[6].setRotationPoint(36.5F, -5F, -23.5F);
		leftWingWheelModel[6].rotateAngleZ = 0.31415927F;

		leftWingWheelModel[7].addShapeBox(0F, 0F, -1F, 20, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[7].setRotationPoint(24F, -22F, -25F);
		leftWingWheelModel[7].rotateAngleX = -0.38397244F;

		leftWingWheelModel[8].addShapeBox(0F, 0F, -1F, 26, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[8].setRotationPoint(24F, -24F, -26F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, -1F, 14, 3, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 24
		leftWingWheelModel[9].setRotationPoint(10F, -24F, -26F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, -1F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -6F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 24
		leftWingWheelModel[10].setRotationPoint(50F, -24F, -26F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, -5F, 14, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -5F); // Box 24
		leftWingWheelModel[11].setRotationPoint(10F, -24F, 26F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, -5F, 26, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 24
		leftWingWheelModel[12].setRotationPoint(24F, -24F, 26F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, -5F, 6, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, -1F); // Box 24
		leftWingWheelModel[13].setRotationPoint(50F, -24F, 26F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 24
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 24
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 24
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 24
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 24
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 24
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 24

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 24
		rightWingWheelModel[0].setRotationPoint(30F, 5F, 24F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingWheelModel[1].setRotationPoint(30F, -3F, 24F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingWheelModel[2].setRotationPoint(30F, 1F, 24F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingWheelModel[3].setRotationPoint(20F, -24F, 22F);
		rightWingWheelModel[3].rotateAngleZ = 0.80285146F;

		rightWingWheelModel[4].addShapeBox(0F, 0F, -2F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingWheelModel[4].setRotationPoint(36.5F, -10F, 24.5F);
		rightWingWheelModel[4].rotateAngleZ = -0.38397244F;

		rightWingWheelModel[5].addShapeBox(0F, 0F, -2F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingWheelModel[5].setRotationPoint(35F, -17F, 24F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, -2F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingWheelModel[6].setRotationPoint(36.5F, -5F, 24.5F);
		rightWingWheelModel[6].rotateAngleZ = 0.31415927F;

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		rightWingWheelModel[7].setRotationPoint(24F, -22F, 25F);
		rightWingWheelModel[7].rotateAngleX = 0.38397244F;
	}

	private void initplaneModeParts_1()
	{
		planeModeParts[0] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 24
		planeModeParts[1] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 24
		planeModeParts[2] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 24
		planeModeParts[3] = new ModelRendererTurbo(this, 705, 41, textureX, textureY); // Box 24
		planeModeParts[4] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 24
		planeModeParts[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 24
		planeModeParts[6] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 24
		planeModeParts[7] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 24
		planeModeParts[8] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 24
		planeModeParts[9] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 24
		planeModeParts[10] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 24
		planeModeParts[11] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 24
		planeModeParts[12] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 24
		planeModeParts[13] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 24
		planeModeParts[14] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 24
		planeModeParts[15] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 24
		planeModeParts[16] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 24
		planeModeParts[17] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Box 24
		planeModeParts[18] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Box 24
		planeModeParts[19] = new ModelRendererTurbo(this, 825, 169, textureX, textureY); // Box 24
		planeModeParts[20] = new ModelRendererTurbo(this, 881, 169, textureX, textureY); // Box 24
		planeModeParts[21] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 24
		planeModeParts[22] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 24
		planeModeParts[23] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 24
		planeModeParts[24] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 24
		planeModeParts[25] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 24
		planeModeParts[26] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 288
		planeModeParts[27] = new ModelRendererTurbo(this, 769, 193, textureX, textureY); // Box 298
		planeModeParts[28] = new ModelRendererTurbo(this, 825, 193, textureX, textureY); // Box 299
		planeModeParts[29] = new ModelRendererTurbo(this, 881, 193, textureX, textureY); // Box 300
		planeModeParts[30] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 301
		planeModeParts[31] = new ModelRendererTurbo(this, 673, 161, textureX, textureY); // Box 305
		planeModeParts[32] = new ModelRendererTurbo(this, 689, 161, textureX, textureY); // Box 306
		planeModeParts[33] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 307
		planeModeParts[34] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 308
		planeModeParts[35] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 309
		planeModeParts[36] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 310
		planeModeParts[37] = new ModelRendererTurbo(this, 825, 201, textureX, textureY); // Box 311
		planeModeParts[38] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 312
		planeModeParts[39] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 313
		planeModeParts[40] = new ModelRendererTurbo(this, 881, 201, textureX, textureY); // Box 314

		planeModeParts[0].addShapeBox(-8F, 0F, -6F, 8, 1, 12, 0F,0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 24
		planeModeParts[0].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[1].addShapeBox(-8F, 0F, -10F, 8, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, -1F, 2F); // Box 24
		planeModeParts[1].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[2].addShapeBox(-8F, 0F, 6F, 8, 1, 4, 0F,0F, 1F, 2F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 1F, 0F); // Box 24
		planeModeParts[2].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[3].addShapeBox(-21F, 0F, 6F, 13, 1, 4, 0F,1F, 1.5F, 0F, 0F, 1F, 2F, 0F, -1F, 0F, 0F, 1F, -2F, 1F, -1.5F, 0F, 0F, -1F, 2F, 0F, 1F, 0F, 0F, -1F, -2F); // Box 24
		planeModeParts[3].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[4].addShapeBox(-21F, 0F, -10F, 13, 1, 4, 0F,0F, 1F, -2F, 0F, -1F, 0F, 0F, 1F, 2F, 1F, 1.5F, 0F, 0F, -1F, -2F, 0F, 1F, 0F, 0F, -1F, 2F, 1F, -1.5F, 0F); // Box 24
		planeModeParts[4].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[5].addShapeBox(-21F, 0F, 0F, 13, 1, 6, 0F,0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 1F, 1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 1F, -1.5F, 0F); // Box 24
		planeModeParts[5].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[6].addShapeBox(-21F, 0F, -6F, 13, 1, 6, 0F,1F, 1.5F, 0F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 2F, 0F, 1F, -1.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -2F, 0F); // Box 24
		planeModeParts[6].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[7].addShapeBox(-21F, -1F, 8F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, -2F, -2F, 0F, -3F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		planeModeParts[7].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[8].addShapeBox(-21F, -1F, -11F, 13, 3, 3, 0F,0F, 0F, -3F, 0F, -3F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 24
		planeModeParts[8].setRotationPoint(-35F, -40F, 0F);

		planeModeParts[9].addShapeBox(-9F, 0F, -5F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		planeModeParts[9].setRotationPoint(-16F, -40F, 6F);

		planeModeParts[10].addShapeBox(-9F, 0F, 0F, 17, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		planeModeParts[10].setRotationPoint(-16F, -40F, -6F);

		planeModeParts[11].addShapeBox(0F, -1F, 0F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 24
		planeModeParts[11].setRotationPoint(-54F, -15F, -7F);

		planeModeParts[12].addShapeBox(-10F, 1.5F, -8F, 10, 4, 4, 0F,0F, 0F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 5F, 0F, -6F, 0F, -1F, -6F, 0F, -3F, 2F, 3F, -2F, 2F); // Box 24
		planeModeParts[12].setRotationPoint(82F, -19.5F, -9F);

		planeModeParts[13].addShapeBox(-4F, -7F, 2F, 4, 14, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 24
		planeModeParts[13].setRotationPoint(88F, -24F, -7F);

		planeModeParts[14].addShapeBox(-6F, -5F, 2F, 2, 12, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 24
		planeModeParts[14].setRotationPoint(88F, -24F, -7F);

		planeModeParts[15].addShapeBox(-6F, -5F, -2F, 2, 12, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		planeModeParts[15].setRotationPoint(88F, -24F, -7F);

		planeModeParts[16].addShapeBox(-4F, -7F, -2F, 4, 14, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		planeModeParts[16].setRotationPoint(88F, -24F, -7F);

		planeModeParts[17].addShapeBox(-4F, -7F, -7F, 4, 14, 5, 0F,0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		planeModeParts[17].setRotationPoint(88F, -24F, -7F);

		planeModeParts[18].addShapeBox(-6F, -5F, -7F, 2, 12, 5, 0F,0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		planeModeParts[18].setRotationPoint(88F, -24F, -7F);

		planeModeParts[19].addShapeBox(0F, 1.5F, -1F, 22, 4, 4, 0F,0F, 1.5F, -1F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 1.5F, -0.5F, 0F, -1F, -6F, 0F, -3F, -6F, 0F, -5F, 2F, 0F, -3F, 2F); // Box 24
		planeModeParts[19].setRotationPoint(82F, -19.5F, -15F);

		planeModeParts[20].addShapeBox(0F, 2.5F, 5F, 22, 2, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.6F, 0F, 0F, 0.4F, 0F); // Box 24
		planeModeParts[20].setRotationPoint(82F, -19.5F, -15F);

		planeModeParts[21].addShapeBox(-15F, 2.5F, 4F, 27, 2, 4, 0F,-2F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 2F, 0F); // Box 24
		planeModeParts[21].setRotationPoint(82F, -19.5F, -15F);

		planeModeParts[22].addShapeBox(-15F, 2.5F, -16F, 27, 2, 4, 0F,-2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 24
		planeModeParts[22].setRotationPoint(82F, -19.5F, 9F);

		planeModeParts[23].addShapeBox(0F, 1.5F, -2F, 22, 4, 4, 0F,0F, 1.5F, -0.5F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 1.5F, -1F, 0F, -3F, 2F, 0F, -5F, 2F, 0F, -3F, -6F, 0F, -1F, -6F); // Box 24
		planeModeParts[23].setRotationPoint(82F, -19.5F, -1F);

		planeModeParts[24].addShapeBox(-10F, 1.5F, -9F, 22, 4, 4, 0F,0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -1F, 0F, 0F, 0F, 3F, -2F, 2F, 0F, -3F, 2F, 0F, -1F, -6F, 5F, 0F, -6F); // Box 24
		planeModeParts[24].setRotationPoint(82F, -19.5F, 8F);

		planeModeParts[25].addShapeBox(0F, -1F, -7F, 20, 1, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 24
		planeModeParts[25].setRotationPoint(-54F, -15F, 7F);

		planeModeParts[26].addShapeBox(0F, 2.5F, 4F, 22, 2, 3, 0F,0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -1.6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 288
		planeModeParts[26].setRotationPoint(82F, -19.5F, -12F);

		planeModeParts[27].addShapeBox(0F, 1.5F, -1F, 22, 4, 4, 0F,0F, 1.5F, -1F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 1.5F, -0.5F, 0F, -1F, -6F, 0F, -3F, -6F, 0F, -5F, 2F, 0F, -3F, 2F); // Box 298
		planeModeParts[27].setRotationPoint(82F, -19.5F, 0F);

		planeModeParts[28].addShapeBox(0F, 2.5F, 5F, 22, 2, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.6F, 0F, 0F, 0.4F, 0F); // Box 299
		planeModeParts[28].setRotationPoint(82F, -19.5F, 0F);

		planeModeParts[29].addShapeBox(0F, 2.5F, 5F, 22, 2, 3, 0F,0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -1.6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 300
		planeModeParts[29].setRotationPoint(82F, -19.5F, 2F);

		planeModeParts[30].addShapeBox(0F, 1.5F, 13F, 22, 4, 4, 0F,0F, 1.5F, -0.5F, 0F, 3F, 0F, 0F, 3F, -2F, 0F, 1.5F, -1F, 0F, -3F, 2F, 0F, -5F, 2F, 0F, -3F, -6F, 0F, -1F, -6F); // Box 301
		planeModeParts[30].setRotationPoint(82F, -19.5F, -1F);

		planeModeParts[31].addShapeBox(-6F, -5F, -7F, 2, 12, 5, 0F,0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		planeModeParts[31].setRotationPoint(88F, -24F, 7F);

		planeModeParts[32].addShapeBox(-6F, -5F, -2F, 2, 12, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		planeModeParts[32].setRotationPoint(88F, -24F, 7F);

		planeModeParts[33].addShapeBox(-6F, -5F, 2F, 2, 12, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 307
		planeModeParts[33].setRotationPoint(88F, -24F, 7F);

		planeModeParts[34].addShapeBox(-4F, -7F, -7F, 4, 14, 5, 0F,0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		planeModeParts[34].setRotationPoint(88F, -24F, 7F);

		planeModeParts[35].addShapeBox(-4F, -7F, -2F, 4, 14, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		planeModeParts[35].setRotationPoint(88F, -24F, 7F);

		planeModeParts[36].addShapeBox(-4F, -7F, 2F, 4, 14, 5, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 310
		planeModeParts[36].setRotationPoint(88F, -24F, 7F);

		planeModeParts[37].addShapeBox(-10F, 1.5F, -8F, 22, 4, 4, 0F,0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -0.5F, 0F, 0F, 0F, 5F, 0F, -6F, 0F, -1F, -6F, 0F, -3F, 2F, 3F, -2F, 2F); // Box 311
		planeModeParts[37].setRotationPoint(82F, -19.5F, 5F);

		planeModeParts[38].addShapeBox(-15F, 2.5F, 4F, 27, 2, 4, 0F,-2F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 2F, 0F); // Box 312
		planeModeParts[38].setRotationPoint(82F, -19.5F, -1F);

		planeModeParts[39].addShapeBox(-15F, 2.5F, -2F, 27, 2, 4, 0F,-2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 313
		planeModeParts[39].setRotationPoint(82F, -19.5F, 9F);

		planeModeParts[40].addShapeBox(-10F, 1.5F, 22F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 1.5F, -0.5F, 0F, 1.5F, -1F, 0F, 0F, -1F, 3F, -2F, 2F, 0F, -3F, 2F, 0F, -1F, -6F, 5F, 0F, -6F); // Box 314
		planeModeParts[40].setRotationPoint(82F, -19.5F, -9F);
	}
}