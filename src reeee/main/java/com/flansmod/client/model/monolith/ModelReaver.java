//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Reaver
// Model Creator: 
// Created on: 19.06.2016 - 11:31:58
// Last changed on: 19.06.2016 - 11:31:58

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelReaver extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelReaver() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[173];
		bodyWheelModel = new ModelRendererTurbo[8];
		leftWingPos1Model = new ModelRendererTurbo[15];
		leftWingPos2Model = new ModelRendererTurbo[15];
		rightWingPos1Model = new ModelRendererTurbo[15];
		rightWingPos2Model = new ModelRendererTurbo[15];

		initbodyModel_1();
		initbodyWheelModel_1();
		initleftWingPos1Model_1();
		initleftWingPos2Model_1();
		initrightWingPos1Model_1();
		initrightWingPos2Model_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 73
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 73
		bodyModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 73
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 73
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 73
		bodyModel[8] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 73
		bodyModel[9] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 73
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 73
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 73
		bodyModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 73
		bodyModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 73
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 73
		bodyModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 73
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 73
		bodyModel[17] = new ModelRendererTurbo(this, 753, 1, textureX, textureY); // Box 73
		bodyModel[18] = new ModelRendererTurbo(this, 769, 1, textureX, textureY); // Box 73
		bodyModel[19] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 73
		bodyModel[20] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 73
		bodyModel[21] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 73
		bodyModel[22] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 73
		bodyModel[23] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 73
		bodyModel[24] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 73
		bodyModel[25] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 73
		bodyModel[26] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 73
		bodyModel[27] = new ModelRendererTurbo(this, 785, 9, textureX, textureY); // Box 73
		bodyModel[28] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 73
		bodyModel[29] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 73
		bodyModel[30] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 73
		bodyModel[31] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 73
		bodyModel[32] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 73
		bodyModel[33] = new ModelRendererTurbo(this, 857, 25, textureX, textureY); // Box 73
		bodyModel[34] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 73
		bodyModel[35] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 73
		bodyModel[36] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 73
		bodyModel[37] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 73
		bodyModel[38] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 73
		bodyModel[39] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 73
		bodyModel[40] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 73
		bodyModel[41] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 73
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 73
		bodyModel[43] = new ModelRendererTurbo(this, 833, 9, textureX, textureY); // Box 73
		bodyModel[44] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 73
		bodyModel[45] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 73
		bodyModel[46] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 73
		bodyModel[47] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 73
		bodyModel[48] = new ModelRendererTurbo(this, 761, 49, textureX, textureY); // Box 73
		bodyModel[49] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 73
		bodyModel[50] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 73
		bodyModel[52] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 73
		bodyModel[53] = new ModelRendererTurbo(this, 585, 81, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 689, 89, textureX, textureY); // Box 73
		bodyModel[57] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 753, 105, textureX, textureY); // Box 73
		bodyModel[59] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 73
		bodyModel[60] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 73
		bodyModel[62] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 73
		bodyModel[63] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 73
		bodyModel[64] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 73
		bodyModel[65] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 73
		bodyModel[66] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 73
		bodyModel[67] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 617, 273, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 73
		bodyModel[70] = new ModelRendererTurbo(this, 97, 289, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 953, 145, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 825, 265, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 897, 289, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Box 73
		bodyModel[75] = new ModelRendererTurbo(this, 993, 49, textureX, textureY); // Box 73
		bodyModel[76] = new ModelRendererTurbo(this, 209, 297, textureX, textureY); // Box 73
		bodyModel[77] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 73
		bodyModel[78] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 73
		bodyModel[79] = new ModelRendererTurbo(this, 737, 89, textureX, textureY); // Box 73
		bodyModel[80] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 73
		bodyModel[81] = new ModelRendererTurbo(this, 857, 105, textureX, textureY); // Box 73
		bodyModel[82] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 73
		bodyModel[83] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 73
		bodyModel[84] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Box 73
		bodyModel[85] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 73
		bodyModel[86] = new ModelRendererTurbo(this, 305, 297, textureX, textureY); // Box 73
		bodyModel[87] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 73
		bodyModel[88] = new ModelRendererTurbo(this, 513, 129, textureX, textureY); // Box 73
		bodyModel[89] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Box 73
		bodyModel[90] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 73
		bodyModel[91] = new ModelRendererTurbo(this, 121, 313, textureX, textureY); // Box 73
		bodyModel[92] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // Box 73
		bodyModel[93] = new ModelRendererTurbo(this, 521, 297, textureX, textureY); // Box 73
		bodyModel[94] = new ModelRendererTurbo(this, 777, 313, textureX, textureY); // Box 73
		bodyModel[95] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 73
		bodyModel[96] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 73
		bodyModel[97] = new ModelRendererTurbo(this, 513, 17, textureX, textureY); // Box 73
		bodyModel[98] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 73
		bodyModel[99] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 73
		bodyModel[100] = new ModelRendererTurbo(this, 721, 337, textureX, textureY); // Box 73
		bodyModel[101] = new ModelRendererTurbo(this, 185, 377, textureX, textureY); // Box 73
		bodyModel[102] = new ModelRendererTurbo(this, 769, 385, textureX, textureY); // Box 73
		bodyModel[103] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Box 73
		bodyModel[104] = new ModelRendererTurbo(this, 777, 17, textureX, textureY); // Box 73
		bodyModel[105] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 73
		bodyModel[106] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 73
		bodyModel[107] = new ModelRendererTurbo(this, 929, 25, textureX, textureY); // Box 73
		bodyModel[108] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 73
		bodyModel[109] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 73
		bodyModel[110] = new ModelRendererTurbo(this, 833, 25, textureX, textureY); // Box 73
		bodyModel[111] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 73
		bodyModel[112] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 73
		bodyModel[113] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 73
		bodyModel[114] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 73
		bodyModel[115] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 73
		bodyModel[116] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 73
		bodyModel[117] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Box 73
		bodyModel[118] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 73
		bodyModel[119] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 73
		bodyModel[120] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 73
		bodyModel[121] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 73
		bodyModel[122] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 73
		bodyModel[123] = new ModelRendererTurbo(this, 745, 49, textureX, textureY); // Box 73
		bodyModel[124] = new ModelRendererTurbo(this, 617, 33, textureX, textureY); // Box 73
		bodyModel[125] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 73
		bodyModel[126] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 73
		bodyModel[127] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Box 73
		bodyModel[128] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 73
		bodyModel[129] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 73
		bodyModel[130] = new ModelRendererTurbo(this, 761, 193, textureX, textureY); // Box 73
		bodyModel[131] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 73
		bodyModel[132] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Box 73
		bodyModel[133] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Box 73
		bodyModel[134] = new ModelRendererTurbo(this, 529, 217, textureX, textureY); // Box 73
		bodyModel[135] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 73
		bodyModel[136] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 73
		bodyModel[137] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 73
		bodyModel[138] = new ModelRendererTurbo(this, 945, 393, textureX, textureY); // Box 73
		bodyModel[139] = new ModelRendererTurbo(this, 729, 233, textureX, textureY); // Box 73
		bodyModel[140] = new ModelRendererTurbo(this, 417, 401, textureX, textureY); // Box 73
		bodyModel[141] = new ModelRendererTurbo(this, 177, 409, textureX, textureY); // Box 73
		bodyModel[142] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Box 73
		bodyModel[143] = new ModelRendererTurbo(this, 241, 409, textureX, textureY); // Box 73
		bodyModel[144] = new ModelRendererTurbo(this, 401, 417, textureX, textureY); // Box 73
		bodyModel[145] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 73
		bodyModel[146] = new ModelRendererTurbo(this, 817, 233, textureX, textureY); // Box 73
		bodyModel[147] = new ModelRendererTurbo(this, 513, 257, textureX, textureY); // Box 73
		bodyModel[148] = new ModelRendererTurbo(this, 809, 161, textureX, textureY); // Box 73
		bodyModel[149] = new ModelRendererTurbo(this, 497, 417, textureX, textureY); // Box 73
		bodyModel[150] = new ModelRendererTurbo(this, 593, 417, textureX, textureY); // Box 73
		bodyModel[151] = new ModelRendererTurbo(this, 713, 417, textureX, textureY); // Box 73
		bodyModel[152] = new ModelRendererTurbo(this, 961, 249, textureX, textureY); // Box 73
		bodyModel[153] = new ModelRendererTurbo(this, 977, 313, textureX, textureY); // Box 73
		bodyModel[154] = new ModelRendererTurbo(this, 13, 447, textureX, textureY); // Box 73
		bodyModel[155] = new ModelRendererTurbo(this, 1, 440, textureX, textureY); // Box 73
		bodyModel[156] = new ModelRendererTurbo(this, 1, 455, textureX, textureY); // Box 73
		bodyModel[157] = new ModelRendererTurbo(this, 1, 430, textureX, textureY); // Box 73
		bodyModel[158] = new ModelRendererTurbo(this, 82, 430, textureX, textureY); // Box 73
		bodyModel[159] = new ModelRendererTurbo(this, 15, 463, textureX, textureY); // Box 73
		bodyModel[160] = new ModelRendererTurbo(this, 1, 422, textureX, textureY); // Box 73
		bodyModel[161] = new ModelRendererTurbo(this, 94, 430, textureX, textureY); // Box 73
		bodyModel[162] = new ModelRendererTurbo(this, 54, 425, textureX, textureY); // Box 73
		bodyModel[163] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 73
		bodyModel[164] = new ModelRendererTurbo(this, 94, 444, textureX, textureY); // Box 73
		bodyModel[165] = new ModelRendererTurbo(this, 94, 444, textureX, textureY); // Box 73
		bodyModel[166] = new ModelRendererTurbo(this, 103, 444, textureX, textureY); // Box 73
		bodyModel[167] = new ModelRendererTurbo(this, 126, 426, textureX, textureY); // Box 73
		bodyModel[168] = new ModelRendererTurbo(this, 126, 426, textureX, textureY); // Box 73
		bodyModel[169] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 73
		bodyModel[170] = new ModelRendererTurbo(this, 54, 425, textureX, textureY); // Box 73
		bodyModel[171] = new ModelRendererTurbo(this, 94, 430, textureX, textureY); // Box 73
		bodyModel[172] = new ModelRendererTurbo(this, 1, 422, textureX, textureY); // Box 73

		bodyModel[0].addShapeBox(-24F, -24F, -15F, 24, 24, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[0].setRotationPoint(0F, -40F, 0F);

		bodyModel[1].addShapeBox(-60F, -24F, -15F, 36, 24, 30, 0F,0F, -18F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 73
		bodyModel[1].setRotationPoint(0F, -40F, 0F);

		bodyModel[2].addShapeBox(-8F, -6F, -13F, 8, 6, 26, 0F,0F, -3.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 73
		bodyModel[2].setRotationPoint(-60F, -40F, 0F);

		bodyModel[3].addShapeBox(-8F, 0F, -15F, 12, 8, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[3].setRotationPoint(0F, -40F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, -17F, 2, 8, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[4].setRotationPoint(0F, -40F, 0F);

		bodyModel[5].addShapeBox(-8F, 0F, 15F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 73
		bodyModel[5].setRotationPoint(0F, -40F, 0F);

		bodyModel[6].addShapeBox(-60F, 0F, -15F, 52, 8, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[6].setRotationPoint(0F, -40F, 0F);

		bodyModel[7].addShapeBox(-68F, 0F, -13F, 8, 8, 26, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 73
		bodyModel[7].setRotationPoint(0F, -40F, 0F);

		bodyModel[8].addShapeBox(-60F, 0F, -15F, 56, 8, 2, 0F,0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 73
		bodyModel[8].setRotationPoint(0F, -40F, 0F);

		bodyModel[9].addShapeBox(-60F, 0F, 13F, 56, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -2F, 0F); // Box 73
		bodyModel[9].setRotationPoint(0F, -40F, 0F);

		bodyModel[10].addShapeBox(-68F, 0F, -15F, 8, 8, 2, 0F,0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); // Box 73
		bodyModel[10].setRotationPoint(0F, -40F, 0F);

		bodyModel[11].addShapeBox(-68F, 0F, 13F, 8, 8, 2, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -6F); // Box 73
		bodyModel[11].setRotationPoint(0F, -40F, 0F);

		bodyModel[12].addShapeBox(-70F, 0F, -7F, 2, 8, 14, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 73
		bodyModel[12].setRotationPoint(0F, -40F, 0F);

		bodyModel[13].addShapeBox(-70F, 0F, -9F, 2, 8, 2, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 73
		bodyModel[13].setRotationPoint(0F, -40F, 0F);

		bodyModel[14].addShapeBox(-70F, 0F, 7F, 2, 8, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F); // Box 73
		bodyModel[14].setRotationPoint(0F, -40F, 0F);

		bodyModel[15].addShapeBox(-20F, 6F, 15F, 14, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[15].setRotationPoint(0F, -40F, 0F);

		bodyModel[16].addShapeBox(-46F, 8F, 15F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 73
		bodyModel[16].setRotationPoint(0F, -40F, 0F);

		bodyModel[17].addShapeBox(-46F, 8F, 22F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 0F); // Box 73
		bodyModel[17].setRotationPoint(0F, -40F, 0F);

		bodyModel[18].addShapeBox(-46F, 6F, 15F, 8, 2, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 73
		bodyModel[18].setRotationPoint(0F, -40F, 0F);

		bodyModel[19].addShapeBox(-43F, 14F, 22F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 73
		bodyModel[19].setRotationPoint(0F, -40F, 0F);

		bodyModel[20].addShapeBox(-43F, 14F, 15F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[20].setRotationPoint(0F, -40F, 0F);

		bodyModel[21].addShapeBox(-43F, 15F, 18F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[21].setRotationPoint(0F, -40F, -1F);

		bodyModel[22].addShapeBox(-20F, -2F, 15F, 14, 8, 11, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[22].setRotationPoint(0F, -40F, 0F);

		bodyModel[23].addShapeBox(-38F, -2F, 15F, 18, 8, 11, 0F,0F, -3F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 73
		bodyModel[23].setRotationPoint(0F, -40F, 0F);

		bodyModel[24].addShapeBox(-47F, 0F, 15F, 9, 6, 9, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 73
		bodyModel[24].setRotationPoint(0F, -40F, 0F);

		bodyModel[25].addShapeBox(-38F, 6F, 15F, 18, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 73
		bodyModel[25].setRotationPoint(0F, -40F, 0F);

		bodyModel[26].addShapeBox(-38F, -2F, 12F, 18, 8, 2, 0F,0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[26].setRotationPoint(0F, -40F, 0F);

		bodyModel[27].addShapeBox(-62F, -1F, -12F, 10, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[27].setRotationPoint(0F, -32F, 0F);

		bodyModel[28].addShapeBox(-68F, -1F, -12F, 6, 8, 24, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 73
		bodyModel[28].setRotationPoint(0F, -32F, 0F);

		bodyModel[29].addShapeBox(-52F, -1F, -12F, 6, 8, 24, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 73
		bodyModel[29].setRotationPoint(0F, -32F, 0F);

		bodyModel[30].addShapeBox(-68F, 1F, -12F, 6, 3, 24, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -6F); // Box 73
		bodyModel[30].setRotationPoint(0F, -26F, 0F);

		bodyModel[31].addShapeBox(-62F, 1F, -12F, 10, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 73
		bodyModel[31].setRotationPoint(0F, -26F, 0F);

		bodyModel[32].addShapeBox(-52F, 1F, -12F, 6, 3, 24, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -2F); // Box 73
		bodyModel[32].setRotationPoint(0F, -26F, 0F);

		bodyModel[33].addShapeBox(-38F, -2F, -26F, 18, 8, 11, 0F,0F, -4F, -1F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[33].setRotationPoint(0F, -40F, 0F);

		bodyModel[34].addShapeBox(-20F, -2F, -26F, 14, 8, 11, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[34].setRotationPoint(0F, -40F, 0F);

		bodyModel[35].addShapeBox(-20F, 6F, -26F, 14, 11, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[35].setRotationPoint(0F, -40F, 0F);

		bodyModel[36].addShapeBox(-38F, 6F, -26F, 18, 11, 11, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[36].setRotationPoint(0F, -40F, 0F);

		bodyModel[37].addShapeBox(-47F, 0F, -24F, 9, 6, 9, 0F,0F, -6F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[37].setRotationPoint(0F, -40F, 0F);

		bodyModel[38].addShapeBox(-46F, 6F, -24F, 8, 2, 9, 0F,1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[38].setRotationPoint(0F, -40F, 0F);

		bodyModel[39].addShapeBox(-43F, 15F, -21F, 5, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[39].setRotationPoint(0F, -40F, -1F);

		bodyModel[40].addShapeBox(-46F, 8F, -17F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 73
		bodyModel[40].setRotationPoint(0F, -40F, 0F);

		bodyModel[41].addShapeBox(-43F, 14F, -17F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[41].setRotationPoint(0F, -40F, 0F);

		bodyModel[42].addShapeBox(-46F, 8F, -24F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 73
		bodyModel[42].setRotationPoint(0F, -40F, 0F);

		bodyModel[43].addShapeBox(-43F, 14F, -24F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[43].setRotationPoint(0F, -40F, 0F);

		bodyModel[44].addShapeBox(-38F, -2F, -14F, 18, 8, 2, 0F,0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 73
		bodyModel[44].setRotationPoint(0F, -40F, 0F);

		bodyModel[45].addShapeBox(-38F, 6F, -15F, 34, 13, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[45].setRotationPoint(0F, -40F, 0F);

		bodyModel[46].addShapeBox(-20F, -24F, -15F, 20, 24, 4, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[46].setRotationPoint(0F, -40F, 0F);

		bodyModel[47].addShapeBox(-6F, -2F, -28F, 16, 19, 13, 0F,0F, -2F, -2F, 0F, -2F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, 0F, 2F, 8F, 0F, 2F, 0F, 4F, 0F, 0F); // Box 73
		bodyModel[47].setRotationPoint(0F, -40F, 0F);

		bodyModel[48].addShapeBox(-6F, -2F, 15F, 16, 19, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 8F, 0F, -2F, -2F, 4F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 8F, 4F, 0F, -2F); // Box 73
		bodyModel[48].setRotationPoint(0F, -40F, 0F);

		bodyModel[49].addShapeBox(0F, -24F, -15F, 39, 22, 30, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[49].setRotationPoint(0F, -40F, 0F);

		bodyModel[50].addShapeBox(-4F, -2F, -15F, 64, 21, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[50].setRotationPoint(0F, -40F, 0F);

		bodyModel[51].addShapeBox(10F, 1F, 15F, 50, 18, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[51].setRotationPoint(0F, -40F, 0F);

		bodyModel[52].addShapeBox(10F, -26F, 15F, 29, 27, 21, 0F,0F, -24F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[52].setRotationPoint(0F, -40F, 0F);

		bodyModel[53].addShapeBox(10F, -26F, -36F, 29, 27, 21, 0F,0F, -26F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[53].setRotationPoint(0F, -40F, 0F);

		bodyModel[54].addShapeBox(10F, 1F, -36F, 50, 18, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[54].setRotationPoint(0F, -40F, 0F);

		bodyModel[55].addShapeBox(39F, -26F, 15F, 10, 27, 21, 0F,0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[55].setRotationPoint(0F, -40F, 0F);

		bodyModel[56].addShapeBox(39F, -26F, -36F, 10, 27, 21, 0F,0F, -2F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[56].setRotationPoint(0F, -40F, 0F);

		bodyModel[57].addShapeBox(49F, -32F, 15F, 40, 24, 21, 0F,0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 10F, 0F, 0F, 0F); // Box 73
		bodyModel[57].setRotationPoint(0F, -40F, 0F);

		bodyModel[58].addShapeBox(49F, -32F, -36F, 40, 24, 21, 0F,0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 8F, 0F, 0F, 0F); // Box 73
		bodyModel[58].setRotationPoint(0F, -40F, 0F);

		bodyModel[59].addShapeBox(49F, -8F, -40F, 20, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -8F, -9F, 0F, 5F, 0F, 0F, 0F); // Box 73
		bodyModel[59].setRotationPoint(0F, -40F, 0F);

		bodyModel[60].addShapeBox(60F, -9F, -15F, 16, 28, 30, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 73
		bodyModel[60].setRotationPoint(0F, -40F, 0F);

		bodyModel[61].addShapeBox(39F, -26F, -15F, 37, 24, 30, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 73
		bodyModel[61].setRotationPoint(0F, -40F, 0F);

		bodyModel[62].addShapeBox(76F, -31F, -15F, 20, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Box 73
		bodyModel[62].setRotationPoint(0F, -40F, 0F);

		bodyModel[63].addShapeBox(89F, -32F, 7F, 16, 6, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[63].setRotationPoint(0F, -40F, 0F);

		bodyModel[64].addShapeBox(89F, -26F, 7F, 16, 18, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[64].setRotationPoint(0F, -40F, 0F);

		bodyModel[65].addShapeBox(89F, -26F, -11F, 16, 18, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[65].setRotationPoint(0F, -40F, 0F);

		bodyModel[66].addShapeBox(89F, -32F, -50F, 16, 24, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[66].setRotationPoint(0F, -40F, 0F);

		bodyModel[67].addShapeBox(89F, -32F, -46F, 16, 6, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[67].setRotationPoint(0F, -40F, 0F);

		bodyModel[68].addShapeBox(108F, -10F, -11F, 80, 23, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -6F, 0F, -10F, -6F, 0F, 0F, 0F); // Box 73
		bodyModel[68].setRotationPoint(0F, -40F, 0F);

		bodyModel[69].addShapeBox(76F, -10F, -13F, 32, 25, 26, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); // Box 73
		bodyModel[69].setRotationPoint(0F, -40F, 0F);

		bodyModel[70].addShapeBox(10F, 1F, 36F, 50, 18, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -29F, 0F, 0F); // Box 73
		bodyModel[70].setRotationPoint(0F, -40F, 0F);

		bodyModel[71].addShapeBox(60F, 1F, 13F, 12, 18, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 73
		bodyModel[71].setRotationPoint(0F, -40F, 0F);

		bodyModel[72].addShapeBox(60F, 1F, -36F, 12, 18, 23, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[72].setRotationPoint(0F, -40F, 0F);

		bodyModel[73].addShapeBox(10F, 1F, -40F, 50, 18, 4, 0F,-29F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[73].setRotationPoint(0F, -40F, 0F);

		bodyModel[74].addShapeBox(10F, -24F, -40F, 29, 25, 4, 0F,0F, -24F, -4F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[74].setRotationPoint(0F, -40F, 0F);

		bodyModel[75].addShapeBox(39F, -32F, -40F, 10, 33, 4, 0F,0F, -15F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[75].setRotationPoint(0F, -40F, 0F);

		bodyModel[76].addShapeBox(49F, -32F, -40F, 40, 24, 4, 0F,0F, -6F, 0F, 0F, -4F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 73
		bodyModel[76].setRotationPoint(0F, -40F, 0F);

		bodyModel[77].addShapeBox(-4F, -8F, -9.5F, 16, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[77].setRotationPoint(93F, -58F, 26F);

		bodyModel[78].addShapeBox(-4F, -8F, -2.5F, 16, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[78].setRotationPoint(93F, -58F, 26F);

		bodyModel[79].addShapeBox(-4F, -8F, 11.5F, 16, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[79].setRotationPoint(93F, -58F, 26F);

		bodyModel[80].addShapeBox(-4F, -8F, 4.5F, 16, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[80].setRotationPoint(93F, -58F, 26F);

		bodyModel[81].addShapeBox(-4F, -8F, -13.5F, 16, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[81].setRotationPoint(93F, -58F, -26F);

		bodyModel[82].addShapeBox(-4F, -8F, -6.5F, 16, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[82].setRotationPoint(93F, -58F, -26F);

		bodyModel[83].addShapeBox(-4F, -8F, 0.5F, 16, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[83].setRotationPoint(93F, -58F, -26F);

		bodyModel[84].addShapeBox(-4F, -8F, 7.5F, 16, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[84].setRotationPoint(93F, -58F, -26F);

		bodyModel[85].addShapeBox(89F, -32F, 46F, 16, 24, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[85].setRotationPoint(0F, -40F, 0F);

		bodyModel[86].addShapeBox(49F, -32F, 36F, 40, 24, 4, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, -4F, 10F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Box 73
		bodyModel[86].setRotationPoint(0F, -40F, 0F);

		bodyModel[87].addShapeBox(10F, -24F, 36F, 29, 25, 4, 0F,0F, -24F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -24F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 73
		bodyModel[87].setRotationPoint(0F, -40F, 0F);

		bodyModel[88].addShapeBox(39F, -32F, 36F, 10, 33, 4, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[88].setRotationPoint(0F, -40F, 0F);

		bodyModel[89].addShapeBox(49F, -8F, 18F, 20, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 5F, -9F, 0F, -8F, 0F, 0F, 0F); // Box 73
		bodyModel[89].setRotationPoint(0F, -40F, 0F);

		bodyModel[90].addShapeBox(188F, -10F, -5F, 30, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[90].setRotationPoint(0F, -40F, 0F);

		bodyModel[91].addShapeBox(188F, -26F, -5F, 30, 16, 10, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[91].setRotationPoint(0F, -40F, 0F);

		bodyModel[92].addShapeBox(199F, -54F, -3F, 18, 28, 6, 0F,-10F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[92].setRotationPoint(0F, -40F, 0F);

		bodyModel[93].addShapeBox(207F, -54F, 0F, 13, 2, 50, 0F,0F, -4F, 0F, 0F, -4F, 0F, 6F, 0F, 0F, -10F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 6F, 0F, 0F, -10F, 0F, 0F); // Box 73
		bodyModel[93].setRotationPoint(0F, -40F, 0F);

		bodyModel[94].addShapeBox(207F, -54F, -50F, 13, 2, 50, 0F,-10F, 0F, 0F, 6F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -10F, 0F, 0F, 6F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 73
		bodyModel[94].setRotationPoint(0F, -40F, 0F);

		bodyModel[95].addShapeBox(217F, -56F, 50F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[95].setRotationPoint(0F, -40F, 0F);

		bodyModel[96].addShapeBox(217F, -54F, 50F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[96].setRotationPoint(0F, -40F, 0F);

		bodyModel[97].addShapeBox(217F, -54F, -51F, 12, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[97].setRotationPoint(0F, -40F, 0F);

		bodyModel[98].addShapeBox(217F, -56F, -51F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[98].setRotationPoint(0F, -40F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 34, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[99].setRotationPoint(18F, -32F, 37F);

		bodyModel[100].addShapeBox(0F, 0F, -10F, 34, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[100].setRotationPoint(18F, -32F, -37F);

		bodyModel[101].addShapeBox(-14F, 17F, -25F, 50, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 2F, 0F); // Box 73
		bodyModel[101].setRotationPoint(0F, -40F, 0F);

		bodyModel[102].addShapeBox(10F, 19F, -36F, 50, 4, 72, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Box 73
		bodyModel[102].setRotationPoint(0F, -40F, 0F);

		bodyModel[103].addShapeBox(-14F, 17F, 7F, 50, 8, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 2F, -4F); // Box 73
		bodyModel[103].setRotationPoint(0F, -40F, 0F);

		bodyModel[104].addShapeBox(-70F, 0.5F, -7F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[104].setRotationPoint(0F, -32F, 0F);

		bodyModel[105].addShapeBox(-70F, 4.5F, -7F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 73
		bodyModel[105].setRotationPoint(0F, -32F, 0F);

		bodyModel[106].addShapeBox(-70F, 1.5F, 2F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[106].setRotationPoint(0F, -32F, 0F);

		bodyModel[107].addShapeBox(31F, -21F, -5F, 4, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[107].setRotationPoint(0F, 0F, 0F);
		bodyModel[107].rotateAngleY = 3.14159265F;

		bodyModel[108].addShapeBox(31F, -18F, -5F, 4, 6, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[108].setRotationPoint(0F, 0F, 0F);
		bodyModel[108].rotateAngleY = 3.14159265F;

		bodyModel[109].addShapeBox(31F, -18F, 3F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[109].setRotationPoint(0F, 0F, 0F);
		bodyModel[109].rotateAngleY = 3.14159265F;

		bodyModel[110].addShapeBox(28F, -16F, -2F, 8, 3, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[110].setRotationPoint(0F, 0F, 0F);
		bodyModel[110].rotateAngleY = 3.14159265F;

		bodyModel[111].addShapeBox(31F, -14F, -3F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[111].setRotationPoint(0F, 0F, 0F);
		bodyModel[111].rotateAngleY = 3.14159265F;

		bodyModel[112].addShapeBox(28F, -14F, -3F, 3, 4, 6, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 73
		bodyModel[112].setRotationPoint(0F, 0F, 0F);
		bodyModel[112].rotateAngleY = 3.14159265F;

		bodyModel[113].addShapeBox(36F, -14F, 1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 73
		bodyModel[113].setRotationPoint(0F, 0F, 0F);
		bodyModel[113].rotateAngleY = 3.14159265F;

		bodyModel[114].addShapeBox(54F, -13F, -1F, 12, 1, 2, 0F,0F, 0F, -0.4F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 73
		bodyModel[114].setRotationPoint(0F, 0F, 0F);
		bodyModel[114].rotateAngleY = 3.14159265F;

		bodyModel[115].addShapeBox(28F, -21F, -5F, 3, 3, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 73
		bodyModel[115].setRotationPoint(0F, 0F, 0F);
		bodyModel[115].rotateAngleY = 3.14159265F;

		bodyModel[116].addShapeBox(35F, -21F, -5F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 73
		bodyModel[116].setRotationPoint(0F, 0F, 0F);
		bodyModel[116].rotateAngleY = 3.14159265F;

		bodyModel[117].addShapeBox(70F, -12.5F, -1F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 73
		bodyModel[117].setRotationPoint(0F, 0F, 0F);
		bodyModel[117].rotateAngleY = 3.14159265F;

		bodyModel[118].addShapeBox(70F, -13.5F, -1F, 5, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[118].setRotationPoint(0F, 0F, 0F);
		bodyModel[118].rotateAngleY = 3.14159265F;

		bodyModel[119].addShapeBox(70F, -11.5F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 73
		bodyModel[119].setRotationPoint(0F, 0F, 0F);
		bodyModel[119].rotateAngleY = 3.14159265F;

		bodyModel[120].addShapeBox(66F, -12.5F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[120].setRotationPoint(0F, 0F, 0F);
		bodyModel[120].rotateAngleY = 3.14159265F;

		bodyModel[121].addShapeBox(70F, -12.5F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[121].setRotationPoint(0F, 0F, 0F);
		bodyModel[121].rotateAngleY = 3.14159265F;

		bodyModel[122].addShapeBox(54F, -12F, -1F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.4F); // Box 73
		bodyModel[122].setRotationPoint(0F, 0F, 0F);
		bodyModel[122].rotateAngleY = 3.14159265F;

		bodyModel[123].addShapeBox(30F, -16F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[123].setRotationPoint(0F, 0F, 0F);
		bodyModel[123].rotateAngleY = 3.14159265F;

		bodyModel[124].addShapeBox(36F, -14F, -3F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[124].setRotationPoint(0F, 0F, 0F);
		bodyModel[124].rotateAngleY = 3.14159265F;

		bodyModel[125].addShapeBox(36F, -14F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[125].setRotationPoint(0F, 0F, 0F);
		bodyModel[125].rotateAngleY = 3.14159265F;

		bodyModel[126].addShapeBox(46F, -13F, -1F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[126].setRotationPoint(0F, 0F, 0F);
		bodyModel[126].rotateAngleY = 3.14159265F;

		bodyModel[127].addShapeBox(-8F, 19F, -42F, 18, 4, 20, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[127].setRotationPoint(0F, -40F, 0F);

		bodyModel[128].addShapeBox(-7F, 23F, -39F, 16, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[128].setRotationPoint(0F, -40F, 0F);

		bodyModel[129].addShapeBox(-10F, 25F, -46.25F, 22, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[129].setRotationPoint(0F, -40F, 0F);

		bodyModel[130].addShapeBox(-10F, 30.25F, -46.25F, 22, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[130].setRotationPoint(0F, -40F, 0F);

		bodyModel[131].addShapeBox(-10F, 30.25F, -36.75F, 22, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[131].setRotationPoint(0F, -40F, 0F);

		bodyModel[132].addShapeBox(-10F, 25F, -36.75F, 22, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[132].setRotationPoint(0F, -40F, 0F);

		bodyModel[133].addShapeBox(-10F, 25F, 27.25F, 22, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[133].setRotationPoint(0F, -40F, 0F);

		bodyModel[134].addShapeBox(-10F, 30.25F, 27.25F, 22, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[134].setRotationPoint(0F, -40F, 0F);

		bodyModel[135].addShapeBox(-10F, 30.25F, 36.75F, 22, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[135].setRotationPoint(0F, -40F, 0F);

		bodyModel[136].addShapeBox(-10F, 25F, 36.75F, 22, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[136].setRotationPoint(0F, -40F, 0F);

		bodyModel[137].addShapeBox(-7F, 23F, 34.5F, 16, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[137].setRotationPoint(0F, -40F, 0F);

		bodyModel[138].addShapeBox(-8F, 19F, 23F, 18, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 73
		bodyModel[138].setRotationPoint(0F, -40F, 0F);

		bodyModel[139].addShapeBox(-20F, -24F, 11F, 20, 24, 4, 0F,-20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[139].setRotationPoint(0F, -40F, 0F);

		bodyModel[140].addShapeBox(-60F, 0F, 11F, 52, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 73
		bodyModel[140].setRotationPoint(0F, -40F, 0F);

		bodyModel[141].addShapeBox(-60F, 6F, -11F, 22, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[141].setRotationPoint(0F, -40F, 0F);

		bodyModel[142].addShapeBox(-60F, -3F, -10F, 4, 9, 20, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[142].setRotationPoint(0F, -40F, 0F);

		bodyModel[143].addShapeBox(49F, -31F, -15F, 27, 10, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[143].setRotationPoint(0F, -40F, 0F);

		bodyModel[144].addShapeBox(10F, -35F, -36F, 29, 35, 16, 0F,0F, -35F, 0F, -6F, -10F, -5F, -6F, -10F, 0F, 0F, -33F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[144].setRotationPoint(0F, -40F, 0F);

		bodyModel[145].addShapeBox(44F, -32F, -36F, 5, 8, 16, 0F,11F, -7F, -5F, -2F, 2F, 0F, -2F, 2F, 0F, 11F, -7F, 0F, 5F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 5F, 0F, 0F); // Box 73
		bodyModel[145].setRotationPoint(0F, -40F, 0F);

		bodyModel[146].addShapeBox(47F, -34F, -36F, 6, 4, 16, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[146].setRotationPoint(0F, -40F, 0F);

		bodyModel[147].addShapeBox(47F, -34F, 20F, 6, 4, 16, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[147].setRotationPoint(0F, -40F, 0F);

		bodyModel[148].addShapeBox(44F, -32F, 20F, 5, 8, 16, 0F,11F, -7F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 11F, -7F, -5F, 5F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 5F, 0F, 0F); // Box 73
		bodyModel[148].setRotationPoint(0F, -40F, 0F);

		bodyModel[149].addShapeBox(10F, -35F, 20F, 29, 35, 16, 0F,0F, -33F, 0F, -6F, -10F, 0F, -6F, -10F, -5F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[149].setRotationPoint(0F, -40F, 0F);

		bodyModel[150].addShapeBox(10F, -32F, -20F, 39, 30, 40, 0F,-27F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -27F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[150].setRotationPoint(0F, -40F, 0F);

		bodyModel[151].addShapeBox(4F, -32F, -8F, 18, 8, 16, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[151].setRotationPoint(0F, -40F, 0F);

		bodyModel[152].addShapeBox(0F, -32F, -8F, 4, 8, 16, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F); // Box 73
		bodyModel[152].setRotationPoint(0F, -40F, 0F);

		bodyModel[153].addShapeBox(22F, -32F, -8F, 4, 8, 16, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F); // Box 73
		bodyModel[153].setRotationPoint(0F, -40F, 0F);

		bodyModel[154].addShapeBox(-24F, -24.5F, -15.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[154].setRotationPoint(0F, -40F, 0F);

		bodyModel[155].addShapeBox(-60F, -24.5F, -15.5F, 36, 2, 2, 0F,0F, -18F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 2F, 0F, 18F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 2F); // Box 73
		bodyModel[155].setRotationPoint(0F, -40F, 0F);

		bodyModel[156].addShapeBox(-60F, -24.5F, 13.5F, 36, 2, 2, 0F,0F, -18F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, -2F, 0F, 18F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, -2F); // Box 73
		bodyModel[156].setRotationPoint(0F, -40F, 0F);

		bodyModel[157].addShapeBox(-24F, -24.5F, 13.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[157].setRotationPoint(0F, -40F, 0F);

		bodyModel[158].addShapeBox(-2F, -24.5F, -15.5F, 2, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -0.5F, 0F, -20F, -0.5F, 0F, -20F, -0.5F, 0F, 20F, -0.5F, 0F); // Box 73
		bodyModel[158].setRotationPoint(0F, -40F, 0F);

		bodyModel[159].addShapeBox(-2F, -24.5F, 13.5F, 2, 25, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, -0.5F, 0F, -20F, -0.5F, 0F, -20F, -0.5F, 0F, 20F, -0.5F, 0F); // Box 73
		bodyModel[159].setRotationPoint(0F, -40F, 0F);

		bodyModel[160].addShapeBox(-18F, -16.5F, -15.5F, 10, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.5F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 1F, 0F); // Box 73
		bodyModel[160].setRotationPoint(0F, -40F, 0F);

		bodyModel[161].addShapeBox(-20F, -15.5F, -15.5F, 2, 8, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 6F, 0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0.5F, 0F); // Box 73
		bodyModel[161].setRotationPoint(0F, -40F, 0F);

		bodyModel[162].addShapeBox(-36F, -7.5F, -15.5F, 12, 2, 2, 0F,0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 2.5F, 0.5F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 2.5F, 0.5F, -0.5F); // Box 73
		bodyModel[162].setRotationPoint(0F, -40F, 0F);

		bodyModel[163].addShapeBox(-24F, -24.5F, -15.5F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0.5F, -0.5F, -22F, 0.5F, -0.5F, -22F, 0.5F, 0.5F, 22F, 0.5F, 0.5F); // Box 73
		bodyModel[163].setRotationPoint(0F, -40F, 0F);

		bodyModel[164].addShapeBox(-68F, -6.5F, -13.5F, 8, 2, 2, 0F,0.5F, -4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, 6F, 0.5F, 4F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 4F, 6F); // Box 73
		bodyModel[164].setRotationPoint(0F, -40F, 0F);

		bodyModel[165].addShapeBox(-68F, -6.5F, 11.5F, 8, 2, 2, 0F,0.5F, -4F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, -6F, 0.5F, 4F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 4F, -6F); // Box 73
		bodyModel[165].setRotationPoint(0F, -40F, 0F);

		bodyModel[166].addShapeBox(-68.5F, -2.5F, -7.5F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[166].setRotationPoint(0F, -40F, 0F);

		bodyModel[167].addShapeBox(-60.5F, -7.5F, -11.5F, 2, 2, 23, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[167].setRotationPoint(0F, -40F, 0F);

		bodyModel[168].addShapeBox(-24F, -24.5F, -13.5F, 2, 2, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[168].setRotationPoint(0F, -40F, 0F);

		bodyModel[169].addShapeBox(-24F, -24.5F, 13.5F, 2, 26, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0.5F, 0.5F, -22F, 0.5F, 0.5F, -22F, 0.5F, -0.5F, 22F, 0.5F, -0.5F); // Box 73
		bodyModel[169].setRotationPoint(0F, -40F, 0F);

		bodyModel[170].addShapeBox(-36F, -7.5F, 13.5F, 12, 2, 2, 0F,1F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, -0.5F, 2.5F, 0.5F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 2.5F, 0.5F, -0.5F); // Box 73
		bodyModel[170].setRotationPoint(0F, -40F, 0F);

		bodyModel[171].addShapeBox(-20F, -15.5F, 13.5F, 2, 8, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 6F, 0.5F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0.5F, 0F); // Box 73
		bodyModel[171].setRotationPoint(0F, -40F, 0F);

		bodyModel[172].addShapeBox(-18F, -16.5F, 13.5F, 10, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.5F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 1F, 0F); // Box 73
		bodyModel[172].setRotationPoint(0F, -40F, 0F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 305, 377, textureX, textureY); // Box 73
		bodyWheelModel[1] = new ModelRendererTurbo(this, 329, 401, textureX, textureY); // Box 73
		bodyWheelModel[2] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 73
		bodyWheelModel[3] = new ModelRendererTurbo(this, 1009, 249, textureX, textureY); // Box 73
		bodyWheelModel[4] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Box 73
		bodyWheelModel[5] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 73
		bodyWheelModel[6] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 73
		bodyWheelModel[7] = new ModelRendererTurbo(this, 945, 377, textureX, textureY); // Box 73

		bodyWheelModel[0].addShapeBox(-14F, -0.5F, 0F, 40, 16, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyWheelModel[0].setRotationPoint(5F, -15F, -20F);
		bodyWheelModel[0].rotateAngleX = -0.26179939F;

		bodyWheelModel[1].addShapeBox(-14F, -0.5F, -1F, 40, 16, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyWheelModel[1].setRotationPoint(5F, -15F, 20F);
		bodyWheelModel[1].rotateAngleX = 0.26179939F;

		bodyWheelModel[2].addShapeBox(0F, -0.5F, -2F, 2, 42, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyWheelModel[2].setRotationPoint(-6F, -15F, 15F);
		bodyWheelModel[2].rotateAngleX = 0.34906585F;
		bodyWheelModel[2].rotateAngleZ = 0.6981317F;

		bodyWheelModel[3].addShapeBox(0F, -0.5F, 0F, 2, 42, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyWheelModel[3].setRotationPoint(-6F, -15F, -15F);
		bodyWheelModel[3].rotateAngleX = -0.34906585F;
		bodyWheelModel[3].rotateAngleZ = 0.6981317F;

		bodyWheelModel[4].addShapeBox(17F, 29F, 7F, 26, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyWheelModel[4].setRotationPoint(-6F, -15F, 15F);

		bodyWheelModel[5].addShapeBox(2F, 29F, 7F, 15, 2, 10, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 73
		bodyWheelModel[5].setRotationPoint(-6F, -15F, 15F);

		bodyWheelModel[6].addShapeBox(2F, 29F, -17F, 15, 2, 10, 0F,0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); // Box 73
		bodyWheelModel[6].setRotationPoint(-6F, -15F, -15F);

		bodyWheelModel[7].addShapeBox(17F, 29F, -17F, 26, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyWheelModel[7].setRotationPoint(-6F, -15F, -15F);
	}

	private void initleftWingPos1Model_1()
	{
		leftWingPos1Model[0] = new ModelRendererTurbo(this, 617, 137, textureX, textureY); // Box 73
		leftWingPos1Model[1] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 73
		leftWingPos1Model[2] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 73
		leftWingPos1Model[3] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Box 73
		leftWingPos1Model[4] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 73
		leftWingPos1Model[5] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 73
		leftWingPos1Model[6] = new ModelRendererTurbo(this, 817, 153, textureX, textureY); // Box 73
		leftWingPos1Model[7] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 73
		leftWingPos1Model[8] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 73
		leftWingPos1Model[9] = new ModelRendererTurbo(this, 873, 169, textureX, textureY); // Box 73
		leftWingPos1Model[10] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Box 73
		leftWingPos1Model[11] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 73
		leftWingPos1Model[12] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 73
		leftWingPos1Model[13] = new ModelRendererTurbo(this, 721, 321, textureX, textureY); // Box 73
		leftWingPos1Model[14] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Box 73

		leftWingPos1Model[0].addShapeBox(4F, -7F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[0].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[1].addShapeBox(4F, -5F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[1].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[2].addShapeBox(4F, -3F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[2].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[3].addShapeBox(4F, 3F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[3].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[4].addShapeBox(4F, 1F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[4].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[5].addShapeBox(4F, -1F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[5].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[6].addShapeBox(4F, 9F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[6].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[7].addShapeBox(4F, 7F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[7].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[8].addShapeBox(4F, 5F, -19F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[8].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[9].addShapeBox(-4F, -7F, -19F, 8, 17, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[9].setRotationPoint(93F, -58F, -27F);

		leftWingPos1Model[10].addShapeBox(-18F, -10F, -20F, 38, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[10].setRotationPoint(34F, -29F, -47F);

		leftWingPos1Model[11].addShapeBox(-16F, -3F, -60F, 34, 6, 40, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[11].setRotationPoint(34F, -29F, -47F);

		leftWingPos1Model[12].addShapeBox(-8F, -7F, -64F, 30, 4, 4, 0F,-6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[12].setRotationPoint(34F, -29F, -47F);

		leftWingPos1Model[13].addShapeBox(-14F, -3F, -64F, 36, 8, 4, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos1Model[13].setRotationPoint(34F, -29F, -47F);

		leftWingPos1Model[14].addShapeBox(-14F, 5F, -64F, 36, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F); // Box 73
		leftWingPos1Model[14].setRotationPoint(34F, -29F, -47F);
	}

	private void initleftWingPos2Model_1()
	{
		leftWingPos2Model[0] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 73
		leftWingPos2Model[1] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 73
		leftWingPos2Model[2] = new ModelRendererTurbo(this, 673, 233, textureX, textureY); // Box 73
		leftWingPos2Model[3] = new ModelRendererTurbo(this, 761, 233, textureX, textureY); // Box 73
		leftWingPos2Model[4] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Box 73
		leftWingPos2Model[5] = new ModelRendererTurbo(this, 905, 249, textureX, textureY); // Box 73
		leftWingPos2Model[6] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Box 73
		leftWingPos2Model[7] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 73
		leftWingPos2Model[8] = new ModelRendererTurbo(this, 457, 257, textureX, textureY); // Box 73
		leftWingPos2Model[9] = new ModelRendererTurbo(this, 545, 257, textureX, textureY); // Box 73
		leftWingPos2Model[10] = new ModelRendererTurbo(this, 185, 329, textureX, textureY); // Box 73
		leftWingPos2Model[11] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 73
		leftWingPos2Model[12] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 73
		leftWingPos2Model[13] = new ModelRendererTurbo(this, 721, 321, textureX, textureY); // Box 73
		leftWingPos2Model[14] = new ModelRendererTurbo(this, 417, 337, textureX, textureY); // Box 73

		leftWingPos2Model[0].addShapeBox(-8F, -12F, -20F, 10, 17, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[0].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[0].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[1].addShapeBox(2F, -12F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[1].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[1].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[2].addShapeBox(2F, -10F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[2].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[2].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[3].addShapeBox(2F, -8F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[3].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[3].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[4].addShapeBox(2F, -6F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[4].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[4].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[5].addShapeBox(2F, -4F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[5].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[5].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[6].addShapeBox(2F, -2F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[6].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[6].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[7].addShapeBox(2F, 0F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[7].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[7].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[8].addShapeBox(2F, 2F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[8].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[8].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[9].addShapeBox(2F, 4F, -20F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[9].setRotationPoint(93F, -58F, -26F);
		leftWingPos2Model[9].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[10].addShapeBox(-18F, -10F, -20F, 38, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[10].setRotationPoint(34F, -29F, -47F);
		leftWingPos2Model[10].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[11].addShapeBox(-16F, -3F, -60F, 34, 6, 40, 0F,-12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[11].setRotationPoint(34F, -29F, -47F);
		leftWingPos2Model[11].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[12].addShapeBox(-8F, -7F, -64F, 30, 4, 4, 0F,-6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[12].setRotationPoint(34F, -29F, -47F);
		leftWingPos2Model[12].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[13].addShapeBox(-14F, -3F, -64F, 36, 8, 4, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftWingPos2Model[13].setRotationPoint(34F, -29F, -47F);
		leftWingPos2Model[13].rotateAngleZ = -1.57079633F;

		leftWingPos2Model[14].addShapeBox(-14F, 5F, -64F, 36, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F); // Box 73
		leftWingPos2Model[14].setRotationPoint(34F, -29F, -47F);
		leftWingPos2Model[14].rotateAngleZ = -1.57079633F;
	}

	private void initrightWingPos1Model_1()
	{
		rightWingPos1Model[0] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 73
		rightWingPos1Model[1] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 73
		rightWingPos1Model[2] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 73
		rightWingPos1Model[3] = new ModelRendererTurbo(this, 593, 177, textureX, textureY); // Box 73
		rightWingPos1Model[4] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 73
		rightWingPos1Model[5] = new ModelRendererTurbo(this, 649, 185, textureX, textureY); // Box 73
		rightWingPos1Model[6] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 73
		rightWingPos1Model[7] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 73
		rightWingPos1Model[8] = new ModelRendererTurbo(this, 705, 193, textureX, textureY); // Box 73
		rightWingPos1Model[9] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Box 73
		rightWingPos1Model[10] = new ModelRendererTurbo(this, 857, 313, textureX, textureY); // Box 73
		rightWingPos1Model[11] = new ModelRendererTurbo(this, 609, 321, textureX, textureY); // Box 73
		rightWingPos1Model[12] = new ModelRendererTurbo(this, 113, 273, textureX, textureY); // Box 73
		rightWingPos1Model[13] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 73
		rightWingPos1Model[14] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 73

		rightWingPos1Model[0].addShapeBox(-4F, -7F, -15F, 8, 17, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[0].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[1].addShapeBox(4F, -7F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[1].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[2].addShapeBox(4F, -5F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[2].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[3].addShapeBox(4F, -3F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[3].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[4].addShapeBox(4F, -1F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[4].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[5].addShapeBox(4F, 1F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[5].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[6].addShapeBox(4F, 3F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[6].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[7].addShapeBox(4F, 5F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[7].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[8].addShapeBox(4F, 7F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[8].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[9].addShapeBox(4F, 9F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[9].setRotationPoint(93F, -58F, 26F);

		rightWingPos1Model[10].addShapeBox(-18F, -10F, 0F, 38, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[10].setRotationPoint(34F, -29F, 47F);

		rightWingPos1Model[11].addShapeBox(-16F, -3F, 20F, 34, 6, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 73
		rightWingPos1Model[11].setRotationPoint(34F, -29F, 47F);

		rightWingPos1Model[12].addShapeBox(-8F, -7F, 60F, 30, 4, 4, 0F,-6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[12].setRotationPoint(34F, -29F, 47F);

		rightWingPos1Model[13].addShapeBox(-14F, -3F, 60F, 36, 8, 4, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos1Model[13].setRotationPoint(34F, -29F, 47F);

		rightWingPos1Model[14].addShapeBox(-14F, 5F, 60F, 36, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F); // Box 73
		rightWingPos1Model[14].setRotationPoint(34F, -29F, 47F);
	}

	private void initrightWingPos2Model_1()
	{
		rightWingPos2Model[0] = new ModelRendererTurbo(this, 929, 193, textureX, textureY); // Box 73
		rightWingPos2Model[1] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 73
		rightWingPos2Model[2] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 73
		rightWingPos2Model[3] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 73
		rightWingPos2Model[4] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 73
		rightWingPos2Model[5] = new ModelRendererTurbo(this, 561, 217, textureX, textureY); // Box 73
		rightWingPos2Model[6] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 73
		rightWingPos2Model[7] = new ModelRendererTurbo(this, 617, 225, textureX, textureY); // Box 73
		rightWingPos2Model[8] = new ModelRendererTurbo(this, 849, 225, textureX, textureY); // Box 73
		rightWingPos2Model[9] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 73
		rightWingPos2Model[10] = new ModelRendererTurbo(this, 857, 313, textureX, textureY); // Box 73
		rightWingPos2Model[11] = new ModelRendererTurbo(this, 609, 321, textureX, textureY); // Box 73
		rightWingPos2Model[12] = new ModelRendererTurbo(this, 113, 273, textureX, textureY); // Box 73
		rightWingPos2Model[13] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Box 73
		rightWingPos2Model[14] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 73

		rightWingPos2Model[0].addShapeBox(-8F, -12F, -15F, 10, 17, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[0].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[0].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[1].addShapeBox(2F, -12F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[1].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[1].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[2].addShapeBox(2F, -10F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[2].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[2].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[3].addShapeBox(2F, -8F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[3].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[3].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[4].addShapeBox(2F, -6F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[4].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[4].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[5].addShapeBox(2F, -4F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[5].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[5].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[6].addShapeBox(2F, -2F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[6].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[6].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[7].addShapeBox(2F, 0F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[7].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[7].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[8].addShapeBox(2F, 2F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[8].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[8].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[9].addShapeBox(2F, 4F, -15F, 8, 1, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[9].setRotationPoint(93F, -58F, 26F);
		rightWingPos2Model[9].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[10].addShapeBox(-18F, -10F, 0F, 38, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[10].setRotationPoint(34F, -29F, 47F);
		rightWingPos2Model[10].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[11].addShapeBox(-16F, -3F, 20F, 34, 6, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Box 73
		rightWingPos2Model[11].setRotationPoint(34F, -29F, 47F);
		rightWingPos2Model[11].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[12].addShapeBox(-8F, -7F, 60F, 30, 4, 4, 0F,-6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[12].setRotationPoint(34F, -29F, 47F);
		rightWingPos2Model[12].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[13].addShapeBox(-14F, -3F, 60F, 36, 8, 4, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightWingPos2Model[13].setRotationPoint(34F, -29F, 47F);
		rightWingPos2Model[13].rotateAngleZ = -1.57079633F;

		rightWingPos2Model[14].addShapeBox(-14F, 5F, 60F, 36, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F); // Box 73
		rightWingPos2Model[14].setRotationPoint(34F, -29F, 47F);
		rightWingPos2Model[14].rotateAngleZ = -1.57079633F;
	}
}