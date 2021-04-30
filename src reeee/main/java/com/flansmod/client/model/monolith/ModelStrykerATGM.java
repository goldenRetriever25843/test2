//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M1126
// Model Creator: 
// Created on: 05.06.2015 - 14:22:17
// Last changed on: 05.06.2015 - 14:22:17

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStrykerATGM extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelStrykerATGM() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[388];
		turretModel = new ModelRendererTurbo[3];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 745, 25, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 821, 57, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 985, 17, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 705, 25, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 873, 57, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 609, 33, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 601, 9, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 985, 33, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 681, 73, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 689, 73, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 0
		bodyModel[71] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 0
		bodyModel[76] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 0
		bodyModel[77] = new ModelRendererTurbo(this, 953, 49, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 0
		bodyModel[79] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 0
		bodyModel[80] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 0
		bodyModel[81] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 529, 97, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 865, 97, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 921, 225, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 961, 225, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 777, 161, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 897, 153, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 985, 177, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 49, 233, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 537, 225, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 761, 241, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 801, 241, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 777, 57, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 897, 57, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 801, 249, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 441, 257, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 617, 129, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 641, 129, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 865, 129, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 641, 137, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 1017, 137, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 697, 161, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 829, 65, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 913, 153, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 1001, 233, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 665, 89, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 681, 89, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 0
		bodyModel[180] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 0
		bodyModel[181] = new ModelRendererTurbo(this, 961, 153, textureX, textureY); // Box 0
		bodyModel[182] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 0
		bodyModel[183] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 0
		bodyModel[184] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 0
		bodyModel[185] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		bodyModel[186] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 0
		bodyModel[187] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 0
		bodyModel[188] = new ModelRendererTurbo(this, 761, 89, textureX, textureY); // Box 0
		bodyModel[189] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 0
		bodyModel[190] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 0
		bodyModel[191] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 0
		bodyModel[192] = new ModelRendererTurbo(this, 777, 89, textureX, textureY); // Box 0
		bodyModel[193] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 0
		bodyModel[194] = new ModelRendererTurbo(this, 737, 33, textureX, textureY); // Box 0
		bodyModel[195] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Box 0
		bodyModel[196] = new ModelRendererTurbo(this, 825, 89, textureX, textureY); // Box 0
		bodyModel[197] = new ModelRendererTurbo(this, 841, 89, textureX, textureY); // Box 0
		bodyModel[198] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 0
		bodyModel[199] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 0
		bodyModel[200] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Box 0
		bodyModel[201] = new ModelRendererTurbo(this, 649, 257, textureX, textureY); // Box 0
		bodyModel[202] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 0
		bodyModel[203] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 0
		bodyModel[204] = new ModelRendererTurbo(this, 841, 257, textureX, textureY); // Box 0
		bodyModel[205] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Box 0
		bodyModel[206] = new ModelRendererTurbo(this, 977, 257, textureX, textureY); // Box 0
		bodyModel[207] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 0
		bodyModel[208] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 0
		bodyModel[209] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 0
		bodyModel[210] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 0
		bodyModel[211] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 0
		bodyModel[212] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 0
		bodyModel[213] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 0
		bodyModel[214] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 0
		bodyModel[215] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 0
		bodyModel[216] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 0
		bodyModel[217] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 0
		bodyModel[218] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 0
		bodyModel[219] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Box 0
		bodyModel[220] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 0
		bodyModel[221] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 0
		bodyModel[222] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 0
		bodyModel[223] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 0
		bodyModel[224] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 0
		bodyModel[225] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 649, 209, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 0
		bodyModel[228] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 0
		bodyModel[229] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Box 0
		bodyModel[230] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 0
		bodyModel[231] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 0
		bodyModel[232] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Box 0
		bodyModel[233] = new ModelRendererTurbo(this, 625, 265, textureX, textureY); // Box 0
		bodyModel[234] = new ModelRendererTurbo(this, 641, 265, textureX, textureY); // Box 0
		bodyModel[235] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 0
		bodyModel[236] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 0
		bodyModel[237] = new ModelRendererTurbo(this, 793, 209, textureX, textureY); // Box 0
		bodyModel[238] = new ModelRendererTurbo(this, 825, 209, textureX, textureY); // Box 0
		bodyModel[239] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 0
		bodyModel[240] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 0
		bodyModel[241] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 0
		bodyModel[242] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 0
		bodyModel[243] = new ModelRendererTurbo(this, 857, 209, textureX, textureY); // Box 0
		bodyModel[244] = new ModelRendererTurbo(this, 665, 265, textureX, textureY); // Box 0
		bodyModel[245] = new ModelRendererTurbo(this, 689, 265, textureX, textureY); // Box 0
		bodyModel[246] = new ModelRendererTurbo(this, 713, 265, textureX, textureY); // Box 0
		bodyModel[247] = new ModelRendererTurbo(this, 729, 265, textureX, textureY); // Box 0
		bodyModel[248] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 0
		bodyModel[249] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Box 0
		bodyModel[251] = new ModelRendererTurbo(this, 921, 209, textureX, textureY); // Box 0
		bodyModel[252] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 0
		bodyModel[253] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 0
		bodyModel[254] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 0
		bodyModel[255] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 0
		bodyModel[256] = new ModelRendererTurbo(this, 953, 209, textureX, textureY); // Box 0
		bodyModel[257] = new ModelRendererTurbo(this, 881, 265, textureX, textureY); // Box 0
		bodyModel[258] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 0
		bodyModel[259] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Box 0
		bodyModel[260] = new ModelRendererTurbo(this, 577, 169, textureX, textureY); // Box 0
		bodyModel[261] = new ModelRendererTurbo(this, 745, 265, textureX, textureY); // Box 0
		bodyModel[262] = new ModelRendererTurbo(this, 145, 254, textureX, textureY); // Box 0
		bodyModel[263] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 0
		bodyModel[264] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 0
		bodyModel[265] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 0
		bodyModel[266] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 0
		bodyModel[267] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 0
		bodyModel[268] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 0
		bodyModel[269] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 0
		bodyModel[270] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 0
		bodyModel[271] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 0
		bodyModel[272] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 0
		bodyModel[273] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 0
		bodyModel[274] = new ModelRendererTurbo(this, 977, 257, textureX, textureY); // Box 0
		bodyModel[275] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 0
		bodyModel[276] = new ModelRendererTurbo(this, 841, 257, textureX, textureY); // Box 0
		bodyModel[277] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 0
		bodyModel[278] = new ModelRendererTurbo(this, 649, 257, textureX, textureY); // Box 0
		bodyModel[279] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Box 0
		bodyModel[280] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 0
		bodyModel[281] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 0
		bodyModel[282] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 0
		bodyModel[283] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 0
		bodyModel[284] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 0
		bodyModel[285] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 0
		bodyModel[286] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 0
		bodyModel[287] = new ModelRendererTurbo(this, 977, 257, textureX, textureY); // Box 0
		bodyModel[288] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 0
		bodyModel[289] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 0
		bodyModel[290] = new ModelRendererTurbo(this, 649, 257, textureX, textureY); // Box 0
		bodyModel[291] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 0
		bodyModel[292] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 0
		bodyModel[293] = new ModelRendererTurbo(this, 841, 257, textureX, textureY); // Box 0
		bodyModel[294] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 0
		bodyModel[295] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Box 0
		bodyModel[296] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 0
		bodyModel[297] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 0
		bodyModel[298] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 0
		bodyModel[299] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 0
		bodyModel[300] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 0
		bodyModel[301] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 0
		bodyModel[302] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 0
		bodyModel[303] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 0
		bodyModel[304] = new ModelRendererTurbo(this, 977, 257, textureX, textureY); // Box 0
		bodyModel[305] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 0
		bodyModel[306] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 0
		bodyModel[307] = new ModelRendererTurbo(this, 649, 257, textureX, textureY); // Box 0
		bodyModel[308] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 0
		bodyModel[309] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 0
		bodyModel[310] = new ModelRendererTurbo(this, 841, 257, textureX, textureY); // Box 0
		bodyModel[311] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 0
		bodyModel[312] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Box 0
		bodyModel[313] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 0
		bodyModel[314] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 0
		bodyModel[315] = new ModelRendererTurbo(this, 841, 257, textureX, textureY); // Box 0
		bodyModel[316] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 0
		bodyModel[317] = new ModelRendererTurbo(this, 865, 257, textureX, textureY); // Box 0
		bodyModel[318] = new ModelRendererTurbo(this, 977, 257, textureX, textureY); // Box 0
		bodyModel[319] = new ModelRendererTurbo(this, 993, 257, textureX, textureY); // Box 0
		bodyModel[320] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 0
		bodyModel[321] = new ModelRendererTurbo(this, 649, 257, textureX, textureY); // Box 0
		bodyModel[322] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 0
		bodyModel[323] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 0
		bodyModel[324] = new ModelRendererTurbo(this, 577, 209, textureX, textureY); // Box 0
		bodyModel[325] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Box 0
		bodyModel[326] = new ModelRendererTurbo(this, 609, 209, textureX, textureY); // Box 0
		bodyModel[327] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 0
		bodyModel[328] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 0
		bodyModel[329] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 0
		bodyModel[330] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 0
		bodyModel[331] = new ModelRendererTurbo(this, 339, 283, textureX, textureY); // Box 0
		bodyModel[332] = new ModelRendererTurbo(this, 307, 284, textureX, textureY); // Box 0
		bodyModel[333] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 0
		bodyModel[334] = new ModelRendererTurbo(this, 562, 288, textureX, textureY); // Box 0
		bodyModel[335] = new ModelRendererTurbo(this, 712, 270, textureX, textureY); // Box 0
		bodyModel[336] = new ModelRendererTurbo(this, 630, 270, textureX, textureY); // Box 0
		bodyModel[337] = new ModelRendererTurbo(this, 663, 280, textureX, textureY); // Box 0
		bodyModel[338] = new ModelRendererTurbo(this, 663, 313, textureX, textureY); // Box 0
		bodyModel[339] = new ModelRendererTurbo(this, 670, 324, textureX, textureY); // Box 0
		bodyModel[340] = new ModelRendererTurbo(this, 690, 313, textureX, textureY); // Box 0
		bodyModel[341] = new ModelRendererTurbo(this, 647, 310, textureX, textureY); // Box 0
		bodyModel[342] = new ModelRendererTurbo(this, 663, 280, textureX, textureY); // Box 0
		bodyModel[343] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 0
		bodyModel[344] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 0
		bodyModel[345] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 0
		bodyModel[346] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 0
		bodyModel[347] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 0
		bodyModel[348] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 0
		bodyModel[349] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
		bodyModel[350] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 0
		bodyModel[351] = new ModelRendererTurbo(this, 873, 97, textureX, textureY); // Box 0
		bodyModel[352] = new ModelRendererTurbo(this, 657, 89, textureX, textureY); // Box 0
		bodyModel[353] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 0
		bodyModel[354] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 0
		bodyModel[355] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Box 0
		bodyModel[356] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 0
		bodyModel[357] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Box 0
		bodyModel[358] = new ModelRendererTurbo(this, 465, 265, textureX, textureY); // Box 0
		bodyModel[359] = new ModelRendererTurbo(this, 545, 97, textureX, textureY); // Box 0
		bodyModel[360] = new ModelRendererTurbo(this, 761, 209, textureX, textureY); // Box 0
		bodyModel[361] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 0
		bodyModel[362] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 0
		bodyModel[363] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 0
		bodyModel[364] = new ModelRendererTurbo(this, 649, 209, textureX, textureY); // Box 0
		bodyModel[365] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 0
		bodyModel[366] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 0
		bodyModel[367] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 0
		bodyModel[368] = new ModelRendererTurbo(this, 689, 265, textureX, textureY); // Box 0
		bodyModel[369] = new ModelRendererTurbo(this, 713, 265, textureX, textureY); // Box 0
		bodyModel[370] = new ModelRendererTurbo(this, 729, 265, textureX, textureY); // Box 0
		bodyModel[371] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 0
		bodyModel[372] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 0
		bodyModel[373] = new ModelRendererTurbo(this, 977, 121, textureX, textureY); // Box 0
		bodyModel[374] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 0
		bodyModel[375] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 0
		bodyModel[376] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 0
		bodyModel[377] = new ModelRendererTurbo(this, 953, 209, textureX, textureY); // Box 0
		bodyModel[378] = new ModelRendererTurbo(this, 921, 209, textureX, textureY); // Box 0
		bodyModel[379] = new ModelRendererTurbo(this, 665, 265, textureX, textureY); // Box 0
		bodyModel[380] = new ModelRendererTurbo(this, 889, 209, textureX, textureY); // Box 0
		bodyModel[381] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 0
		bodyModel[382] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 0
		bodyModel[383] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 0
		bodyModel[384] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 0
		bodyModel[385] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 0
		bodyModel[386] = new ModelRendererTurbo(this, 761, 57, textureX, textureY); // Box 0
		bodyModel[387] = new ModelRendererTurbo(this, 1, 382, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, -9F, 87, 16, 14, 0F,4.9F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, 0F, 4.9F, 0F, 0F, -0.1F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -0.1F, 2F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-56F, -38F, -26F);

		bodyModel[1].addShapeBox(0F, 0F, 2F, 128, 14, 2, 0F,9.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.9F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-46F, -20F, -23F);

		bodyModel[2].addShapeBox(0F, 0F, 30F, 14, 8, 20, 0F,6F, 0F, 15F, -2F, 0F, 2F, -2F, 0F, 0F, 6F, 0F, 0F, 0F, 4F, 9F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 4F, 0F); // Box 0
		bodyModel[2].setRotationPoint(94F, -20F, -50F);

		bodyModel[3].addShapeBox(0F, 0F, 30F, 14, 16, 54, 0F,0F, 0F, 8F, -6F, 0F, 8F, -6F, 0F, 8F, 0F, 0F, 8F, -8F, 0F, 0F, 0F, -4F, 2F, 0F, -4F, 2F, -8F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(80F, -20F, -57F);

		bodyModel[4].addShapeBox(0F, 0F, 2F, 8, 18, 35, 0F,2F, -1.7F, -4F, 2F, -3.25F, -4F, 2F, -3.25F, -2.7F, 2F, -1.7F, -2.9F, 2F, -4F, -4F, 2F, -4F, -4F, 2F, -4F, 0F, 2F, -4F, 0F); // Box 0
		bodyModel[4].setRotationPoint(42F, -34F, -2F);

		bodyModel[5].addShapeBox(0F, -2F, -5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(105F, -24F, 20F);

		bodyModel[6].addShapeBox(0F, -2F, 2F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(105F, -24F, -20F);

		bodyModel[7].addShapeBox(0F, 0F, -3F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(102F, -26F, -18F);

		bodyModel[8].addShapeBox(0F, 0F, 11F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(102F, -26F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 2F, 131, 2, 42, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 7.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 7.5F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-44F, -6F, -23F);

		bodyModel[10].addShapeBox(0F, 0F, 2F, 128, 14, 2, 0F,9.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.9F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-46F, -20F, 17F);

		bodyModel[11].addShapeBox(0F, 0F, -1F, 87, 16, 14, 0F,4.9F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -4F, 4.9F, 0F, -4F, -0.1F, 2F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -0.1F, 2F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-56F, -38F, 22F);

		bodyModel[12].addShapeBox(0F, 0F, 2F, 4, 16, 42, 0F,4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 4.9F, 0F, -40F, -0.1F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, -40F, -0.1F, 2F, -40F); // Box 0
		bodyModel[12].setRotationPoint(-56F, -38F, -23F);

		bodyModel[13].addShapeBox(0F, 0F, 2F, 83, 0, 42, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-52F, -38F, -23F);

		bodyModel[14].addShapeBox(0F, 0F, 2F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(104F, -25F, -19.5F);

		bodyModel[15].addShapeBox(0F, 0F, -5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(104F, -25F, 20.5F);

		bodyModel[16].addShapeBox(0F, 0F, 30F, 14, 8, 20, 0F,6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 6F, 0F, 15F, 0F, 4F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 4F, 9F); // Box 0
		bodyModel[16].setRotationPoint(94F, -20F, -30F);

		bodyModel[17].addShapeBox(-4F, 0F, 0F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-56F, -20F, -35F);

		bodyModel[18].addShapeBox(-4F, 1F, 0F, 16, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-55F, -16F, -35F);

		bodyModel[19].addShapeBox(-4F, 1F, 0F, 16, 10, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8F, 0F, -4F); // Box 0
		bodyModel[19].setRotationPoint(-55F, -16F, 20F);

		bodyModel[20].addShapeBox(-4F, 0F, 0F, 17, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-56F, -20F, 29F);

		bodyModel[21].addShapeBox(-4F, 0F, 0F, 4, 4, 6, 0F,0F, -2F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.925F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-56F, -24F, 29F);

		bodyModel[22].addShapeBox(-4F, 0F, 0F, 10, 6, 9, 0F,-0.2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(-56F, -21F, 20F);

		bodyModel[23].addShapeBox(-4F, 0F, 0F, 10, 6, 9, 0F,-0.2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(-56F, -21F, -29F);

		bodyModel[24].addShapeBox(-4F, 0F, 0F, 4, 4, 6, 0F,0F, -2F, -0.5F, -1.1F, 0F, -0.925F, -1.1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-56F, -24F, -35F);

		bodyModel[25].addShapeBox(-5F, 0F, 0F, 10, 7, 13, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 0
		bodyModel[25].setRotationPoint(23F, -20F, 21F);

		bodyModel[26].addShapeBox(-1.5F, 0F, -1.5F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(70.5F, -20F, 23.5F);

		bodyModel[27].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 0
		bodyModel[27].setRotationPoint(73.5F, -5F, 16.5F);

		bodyModel[28].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 0
		bodyModel[28].setRotationPoint(68.5F, -5F, 16.5F);

		bodyModel[29].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 0
		bodyModel[29].setRotationPoint(39F, -5F, 16.5F);

		bodyModel[30].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 0
		bodyModel[30].setRotationPoint(44F, -5F, 16.5F);

		bodyModel[31].addShapeBox(-1.5F, 0F, -1.5F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(41F, -20F, 23.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(-44F, -20F, 20F);

		bodyModel[33].addShapeBox(0F, 0F, -4F, 16, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[33].setRotationPoint(-44F, -20F, -20F);

		bodyModel[34].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[34].setRotationPoint(-21F, -20F, -22.5F);
		bodyModel[34].rotateAngleZ = -0.26179939F;

		bodyModel[35].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(8.5F, -20F, -22.5F);
		bodyModel[35].rotateAngleZ = -0.26179939F;

		bodyModel[36].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-31F, -5F, -22.5F);

		bodyModel[37].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[37].setRotationPoint(-1.5F, -5F, -22.5F);

		bodyModel[38].addShapeBox(0F, 0F, -2F, 2, 3, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[38].setRotationPoint(3.5F, -5F, -19.5F);

		bodyModel[39].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-31F, -5F, 22.5F);

		bodyModel[40].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(-22F, -20F, 22.5F);
		bodyModel[40].rotateAngleZ = -0.26179939F;

		bodyModel[41].addShapeBox(-1F, 0F, -1F, 10, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(-0.5F, -5F, 22.5F);

		bodyModel[42].addShapeBox(-1F, 0F, -1F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(7.5F, -20F, 22.5F);
		bodyModel[42].rotateAngleZ = -0.26179939F;

		bodyModel[43].addShapeBox(0F, 0F, -1F, 2, 3, 43, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[43].setRotationPoint(-26F, -5F, -21.5F);

		bodyModel[44].addShapeBox(0F, 0F, -2F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-1F, -2.5F, -20F);
		bodyModel[44].rotateAngleX = 0.06981317F;

		bodyModel[45].addShapeBox(0F, 0F, -17F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[45].setRotationPoint(-1F, -2.5F, 20F);
		bodyModel[45].rotateAngleX = -0.06981317F;

		bodyModel[46].addShapeBox(0F, 0F, -17F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[46].setRotationPoint(-30.5F, -2.5F, 20F);
		bodyModel[46].rotateAngleX = -0.06981317F;

		bodyModel[47].addShapeBox(0F, 0F, -6.5F, 5, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[47].setRotationPoint(-32.5F, -5F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, -6.5F, 5, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[48].setRotationPoint(-3F, -5F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, -4F, 23, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(-20F, -20F, -20F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 23, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(-20F, -20F, 20F);

		bodyModel[51].addShapeBox(0F, 0F, -4F, 8, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[51].setRotationPoint(10F, -20F, -20F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[52].setRotationPoint(10F, -20F, 20F);

		bodyModel[53].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[53].setRotationPoint(44F, -15F, 23.5F);

		bodyModel[54].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[54].setRotationPoint(73.5F, -15F, 23.5F);

		bodyModel[55].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(39F, -15F, 23.5F);

		bodyModel[56].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(68.5F, -15F, 23.5F);

		bodyModel[57].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(39F, -1F, 23.5F);

		bodyModel[58].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(68.5F, -1F, 23.5F);

		bodyModel[59].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[59].setRotationPoint(5.5F, -3F, -26.5F);

		bodyModel[60].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[60].setRotationPoint(-24F, -3F, -26.5F);

		bodyModel[61].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[61].setRotationPoint(5.5F, -3F, 24.5F);

		bodyModel[62].addShapeBox(-1F, 0F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[62].setRotationPoint(-24F, -3F, 24.5F);

		bodyModel[63].addShapeBox(-1.5F, 0F, -1.5F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[63].setRotationPoint(70.5F, -20F, -22.5F);

		bodyModel[64].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(73.5F, -15F, -21.5F);

		bodyModel[65].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[65].setRotationPoint(68.5F, -15F, -21.5F);

		bodyModel[66].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[66].setRotationPoint(44F, -15F, -21.5F);

		bodyModel[67].addShapeBox(-1.5F, 0F, -1.5F, 2, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[67].setRotationPoint(41F, -20F, -22.5F);

		bodyModel[68].addShapeBox(-1.5F, 0F, -1.5F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[68].setRotationPoint(39F, -15F, -21.5F);

		bodyModel[69].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[69].setRotationPoint(39F, -1F, -22.5F);

		bodyModel[70].addShapeBox(-1.5F, 0F, -1.5F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[70].setRotationPoint(68.5F, -1F, -22.5F);

		bodyModel[71].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 0
		bodyModel[71].setRotationPoint(73.5F, -5F, -14.5F);

		bodyModel[72].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 0
		bodyModel[72].setRotationPoint(68.5F, -5F, -14.5F);

		bodyModel[73].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 0
		bodyModel[73].setRotationPoint(44F, -5F, -14.5F);

		bodyModel[74].addShapeBox(-1.5F, 0F, -1.5F, 1, 2, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 2F, -7F, 0F, 2F, -7F); // Box 0
		bodyModel[74].setRotationPoint(39F, -5F, -14.5F);

		bodyModel[75].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[75].setRotationPoint(40.5F, -3F, 25.5F);

		bodyModel[76].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[76].setRotationPoint(40.5F, -3F, -26.5F);

		bodyModel[77].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 0
		bodyModel[77].setRotationPoint(70F, -3F, 25.5F);

		bodyModel[78].addShapeBox(-1F, 0F, -2F, 2, 2, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[78].setRotationPoint(70F, -3F, -26.5F);

		bodyModel[79].addShapeBox(0F, 0F, -2F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[79].setRotationPoint(-30.5F, -2.5F, -20F);
		bodyModel[79].rotateAngleX = 0.06981317F;

		bodyModel[80].addShapeBox(0F, 0F, 15F, 9, 20, 27, 0F,2F, 0F, 4F, -0.5F, -6.2F, 4F, -0.5F, -6.2F, 0F, 2F, 0F, 0F, 0F, -2F, 8F, 5F, -2F, 8F, 5F, -2F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[80].setRotationPoint(64F, -38F, -42F);

		bodyModel[81].addShapeBox(0F, 0F, 30F, 32, 19, 27, 0F,0F, -1F, 0F, -7F, -6F, 0F, -7F, -6F, 4F, 0F, -1F, 4F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 8F, 0F, -2F, 8F); // Box 0
		bodyModel[81].setRotationPoint(52F, -37F, -30F);

		bodyModel[82].addShapeBox(0F, 0F, 2F, 33, 22, 35, 0F,-1F, -2F, -4F, -3F, -2F, -4F, -3F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F); // Box 0
		bodyModel[82].setRotationPoint(32F, -40F, -37F);

		bodyModel[83].addShapeBox(0F, 0F, 2F, 13, 17, 35, 0F,-3F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -3F, 1F, -4F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 0
		bodyModel[83].setRotationPoint(30F, -37F, -2F);

		bodyModel[84].addShapeBox(0F, 0F, -8F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-48F, -38F, 39F);

		bodyModel[85].addShapeBox(0F, 0F, -8F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[85].setRotationPoint(14F, -38F, 39F);

		bodyModel[86].addShapeBox(0F, 0F, 4F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[86].setRotationPoint(14F, -38F, -41F);

		bodyModel[87].addShapeBox(0F, 0F, 4F, 2, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[87].setRotationPoint(-48F, -38F, -41F);

		bodyModel[88].addShapeBox(-6F, 0F, 0F, 50, 10, 2, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[88].setRotationPoint(-35F, -38F, 30F);

		bodyModel[89].addShapeBox(-6F, -3F, -3F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[89].setRotationPoint(20F, -34F, -38F);
		bodyModel[89].rotateAngleY = -1.57079633F;
		bodyModel[89].rotateAngleZ = 0.22252948F;

		bodyModel[90].addShapeBox(-6F, -4F, -3F, 3, 1, 7, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[90].setRotationPoint(20F, -34F, -38F);
		bodyModel[90].rotateAngleY = -1.57079633F;
		bodyModel[90].rotateAngleZ = 0.22252948F;

		bodyModel[91].addShapeBox(-4F, -4.5F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[91].setRotationPoint(20F, -34F, -37F);
		bodyModel[91].rotateAngleY = -1.57079633F;
		bodyModel[91].rotateAngleZ = 0.22252948F;

		bodyModel[92].addShapeBox(-2F, -3F, -3F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[92].setRotationPoint(20F, -34F, -38F);
		bodyModel[92].rotateAngleY = -1.57079633F;
		bodyModel[92].rotateAngleZ = 0.22252948F;

		bodyModel[93].addShapeBox(-2F, -4F, -3F, 3, 1, 7, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[93].setRotationPoint(20F, -34F, -38F);
		bodyModel[93].rotateAngleY = -1.57079633F;
		bodyModel[93].rotateAngleZ = 0.22252948F;

		bodyModel[94].addShapeBox(0F, -4.5F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[94].setRotationPoint(20F, -34F, -37F);
		bodyModel[94].rotateAngleY = -1.57079633F;
		bodyModel[94].rotateAngleZ = 0.22252948F;

		bodyModel[95].addShapeBox(-6F, 0F, 0F, 50, 10, 2, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[95].setRotationPoint(-36F, -38F, -32F);

		bodyModel[96].addShapeBox(0F, 0F, -22F, 1, 2, 44, 0F,0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 0
		bodyModel[96].setRotationPoint(106F, -22F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, -22F, 1, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, -2F); // Box 0
		bodyModel[97].setRotationPoint(106F, -20F, 0F);

		bodyModel[98].addShapeBox(-6F, 0F, 0F, 48, 2, 4, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[98].setRotationPoint(-34F, -30F, -37F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,1.65F, 0F, -0.35F, -2.35F, 0F, -0.35F, -2.35F, 0F, -0.35F, 1.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 0
		bodyModel[99].setRotationPoint(-62F, -54F, 28F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,1.65F, 0F, -0.35F, -2.35F, 0F, -0.35F, -2.35F, 0F, -0.35F, 1.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 0
		bodyModel[100].setRotationPoint(-62F, -50F, -28F);

		bodyModel[101].addShapeBox(0F, 0F, -10F, 22, 4, 22, 0F,-2F, 0F, -2F, 1F, -3F, -2F, 1F, -3F, -2F, -2F, 0F, -2F, -2F, -2F, 0F, 4F, 2.5F, 0F, 4F, 2.5F, 0F, -2F, -2F, 0F); // Box 0
		bodyModel[101].setRotationPoint(51F, -36.5F, 13F);

		bodyModel[102].addShapeBox(0F, -2F, -8F, 21, 3, 18, 0F,-2F, -1F, -2F, -2F, -2F, -4F, -2F, -2F, -4F, -2F, -1F, -2F, -2F, -1F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -2F, -1F, 0F); // Box 0
		bodyModel[102].setRotationPoint(51F, -36.5F, 13F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,6.65F, 0F, -0.35F, -7.35F, 0F, -0.35F, -7.35F, 0F, -0.35F, 6.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 0
		bodyModel[103].setRotationPoint(-64F, -79F, 28F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,3.65F, 0F, -0.35F, -4.35F, 0F, -0.35F, -4.35F, 0F, -0.35F, 3.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 0
		bodyModel[104].setRotationPoint(-64F, -65F, -28F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,1.65F, 0F, -0.35F, -2.35F, 0F, -0.35F, -2.35F, 0F, -0.35F, 1.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 0
		bodyModel[105].setRotationPoint(-40F, -61F, -30F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,6.65F, 0F, -0.35F, -7.35F, 0F, -0.35F, -7.35F, 0F, -0.35F, 6.65F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 0
		bodyModel[106].setRotationPoint(-42F, -91F, -30F);

		bodyModel[107].addShapeBox(-6F, 0F, 0F, 52, 2, 4, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(-36F, -28F, -37F);

		bodyModel[108].addShapeBox(-6F, 0F, -6F, 52, 2, 4, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, -2F, 0F, 6F, -2F, 0F); // Box 0
		bodyModel[108].setRotationPoint(-36F, -28F, 39F);

		bodyModel[109].addShapeBox(-9F, 0F, 0F, 18, 1, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[109].setRotationPoint(53F, -38F, -34F);

		bodyModel[110].addShapeBox(0F, 0F, -2.5F, 3, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[110].setRotationPoint(-59F, -26F, -26F);

		bodyModel[111].addShapeBox(0F, 0F, -2.5F, 3, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[111].setRotationPoint(-59F, -23F, -26F);

		bodyModel[112].addShapeBox(0F, 0F, -2.5F, 3, 3, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[112].setRotationPoint(-59F, -26F, 26F);

		bodyModel[113].addShapeBox(0F, 0F, -2.5F, 3, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		bodyModel[113].setRotationPoint(-59F, -23F, 26F);

		bodyModel[114].addShapeBox(0F, 0F, -3F, 5, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -2F, 0F); // Box 0
		bodyModel[114].setRotationPoint(-63F, -34F, -28F);

		bodyModel[115].addShapeBox(0F, 0F, -4F, 4, 1, 6, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 0
		bodyModel[115].setRotationPoint(-63F, -34F, 29F);

		bodyModel[116].addShapeBox(-2F, -27F, -18F, 2, 26, 36, 0F,0F, 7F, 0F, 0F, 8F, 1F, 0F, 8F, 1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 0
		bodyModel[116].setRotationPoint(-52F, -6F, 0F);
		bodyModel[116].rotateAngleZ = 0.27052603F;

		bodyModel[117].addShapeBox(-4F, 0F, 0F, 11, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[117].setRotationPoint(-50F, -21F, -29F);

		bodyModel[118].addShapeBox(-4F, 0F, 0F, 11, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[118].setRotationPoint(-50F, -21F, 20F);

		bodyModel[119].addShapeBox(-9F, 0F, 0F, 18, 4, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[119].setRotationPoint(53F, -37F, -34F);

		bodyModel[120].addShapeBox(-8F, 0F, 0F, 2, 4, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[120].setRotationPoint(68F, -38.5F, -30F);

		bodyModel[121].addShapeBox(-9F, 1F, 0F, 14, 2, 7, 0F,0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[121].setRotationPoint(55F, -41F, -33F);

		bodyModel[122].addShapeBox(-9F, 1F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[122].setRotationPoint(55F, -41F, -26F);

		bodyModel[123].addShapeBox(-9F, 1F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 1F, 1F, 0F, 1F); // Box 0
		bodyModel[123].setRotationPoint(55F, -41F, -22F);

		bodyModel[124].addShapeBox(-8F, 0F, 0F, 4, 4, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[124].setRotationPoint(70F, -38.5F, -30F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 5, 13, 35, 0F,0.5F, 0.8F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0.5F, 0.8F, 0F, -5F, -2F, 0F, 8F, -2F, 0F, 8F, -2F, 0F, -5F, -2F, 0F); // Box 0
		bodyModel[125].setRotationPoint(73F, -31F, -35F);

		bodyModel[126].addShapeBox(-5F, 0F, -13F, 10, 7, 13, 0F,1F, 0F, 0.75F, 1F, 0F, 0.75F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[126].setRotationPoint(23F, -20F, -21F);

		bodyModel[127].addShapeBox(-6F, 0F, 0F, 48, 2, 1, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[127].setRotationPoint(-34F, -34F, 36F);

		bodyModel[128].addShapeBox(-6F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[128].setRotationPoint(-40F, -32F, 36F);

		bodyModel[129].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[129].setRotationPoint(-34F, -32F, 36F);

		bodyModel[130].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-30F, -32F, 36F);

		bodyModel[131].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[131].setRotationPoint(-26F, -32F, 36F);

		bodyModel[132].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[132].setRotationPoint(-22F, -32F, 36F);

		bodyModel[133].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[133].setRotationPoint(12F, -32F, 36F);

		bodyModel[134].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[134].setRotationPoint(8F, -32F, 36F);

		bodyModel[135].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[135].setRotationPoint(4F, -32F, 36F);

		bodyModel[136].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[136].setRotationPoint(0F, -32F, 36F);

		bodyModel[137].addShapeBox(-6F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[137].setRotationPoint(16F, -32F, 36F);

		bodyModel[138].addShapeBox(-6F, 0F, 0F, 48, 1, 1, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[138].setRotationPoint(-34F, -38F, 36F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[139].setRotationPoint(13F, -37F, 36F);

		bodyModel[140].addShapeBox(-6F, 0F, 0F, 4, 2, 1, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[140].setRotationPoint(-12F, -32F, 36F);

		bodyModel[141].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[141].setRotationPoint(14F, -37F, 36F);

		bodyModel[142].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[142].setRotationPoint(9F, -37F, 36F);

		bodyModel[143].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[143].setRotationPoint(4F, -37F, 36F);

		bodyModel[144].addShapeBox(-6F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[144].setRotationPoint(-40F, -37F, 36F);

		bodyModel[145].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[145].setRotationPoint(-36F, -37F, 36F);

		bodyModel[146].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[146].setRotationPoint(-31F, -37F, 36F);

		bodyModel[147].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[147].setRotationPoint(-26F, -37F, 36F);

		bodyModel[148].addShapeBox(-6F, 0F, 0F, 10, 3, 1, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-15F, -37F, 36F);

		bodyModel[149].addShapeBox(-6F, 0F, 0F, 48, 2, 1, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[149].setRotationPoint(-34F, -34F, -37F);

		bodyModel[150].addShapeBox(-6F, 0F, 0F, 48, 1, 1, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[150].setRotationPoint(-34F, -38F, -37F);

		bodyModel[151].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[151].setRotationPoint(-36F, -37F, -37F);

		bodyModel[152].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[152].setRotationPoint(-31F, -37F, -37F);

		bodyModel[153].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[153].setRotationPoint(-34F, -32F, -37F);

		bodyModel[154].addShapeBox(-6F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[154].setRotationPoint(-40F, -32F, -37F);

		bodyModel[155].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[155].setRotationPoint(-30F, -32F, -37F);

		bodyModel[156].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[156].setRotationPoint(-26F, -32F, -37F);

		bodyModel[157].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[157].setRotationPoint(-26F, -37F, -37F);

		bodyModel[158].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[158].setRotationPoint(-22F, -32F, -37F);

		bodyModel[159].addShapeBox(-3F, 4F, 0.6F, 7, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[159].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[159].rotateAngleX = 0.08726646F;

		bodyModel[160].addShapeBox(-3F, 3.5F, 0.7F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[160].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[160].rotateAngleX = 0.08726646F;

		bodyModel[161].addShapeBox(-1.5F, 3.4F, 0.8F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[161].setRotationPoint(-31.5F, -40.6F, 35.8F);
		bodyModel[161].rotateAngleX = 0.08726646F;

		bodyModel[162].addShapeBox(2F, 9F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[162].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[162].rotateAngleX = 0.08726646F;

		bodyModel[163].addShapeBox(2F, 8.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[163].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[163].rotateAngleX = 0.08726646F;

		bodyModel[164].addShapeBox(-1F, 9F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[164].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[164].rotateAngleX = 0.08726646F;

		bodyModel[165].addShapeBox(-1F, 8.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[165].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[165].rotateAngleX = 0.08726646F;

		bodyModel[166].addShapeBox(-4F, 9F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[166].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[166].rotateAngleX = 0.08726646F;

		bodyModel[167].addShapeBox(-3F, 9.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[167].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[167].rotateAngleX = 0.08726646F;

		bodyModel[168].addShapeBox(-4F, 8.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[168].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[168].rotateAngleX = 0.08726646F;

		bodyModel[169].addShapeBox(-1.5F, 3.4F, 0.8F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[169].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[169].rotateAngleX = 0.08726646F;

		bodyModel[170].addShapeBox(0F, 9.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[170].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[170].rotateAngleX = 0.08726646F;

		bodyModel[171].addShapeBox(3F, 9.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[171].setRotationPoint(-34.5F, -40.6F, 35.8F);
		bodyModel[171].rotateAngleX = 0.08726646F;

		bodyModel[172].addShapeBox(-3F, 1.5F, 0.7F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[172].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[172].rotateAngleX = 0.08726646F;

		bodyModel[173].addShapeBox(-3F, 2F, 0.6F, 7, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[173].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[173].rotateAngleX = 0.08726646F;

		bodyModel[174].addShapeBox(-1.5F, 1.4F, 0.8F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[174].setRotationPoint(-40.5F, -40.6F, 35.8F);
		bodyModel[174].rotateAngleX = 0.08726646F;

		bodyModel[175].addShapeBox(2F, 7F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[175].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[175].rotateAngleX = 0.08726646F;

		bodyModel[176].addShapeBox(-4F, 7F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[176].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[176].rotateAngleX = 0.08726646F;

		bodyModel[177].addShapeBox(-1F, 7F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[177].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[177].rotateAngleX = 0.08726646F;

		bodyModel[178].addShapeBox(-1.5F, 1.4F, 0.8F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[178].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[178].rotateAngleX = 0.08726646F;

		bodyModel[179].addShapeBox(-4F, 6.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[179].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[179].rotateAngleX = 0.08726646F;

		bodyModel[180].addShapeBox(-1F, 6.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[180].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[180].rotateAngleX = 0.08726646F;

		bodyModel[181].addShapeBox(3F, 7.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[181].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[181].rotateAngleX = 0.08726646F;

		bodyModel[182].addShapeBox(-3F, 7.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[182].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[182].rotateAngleX = 0.08726646F;

		bodyModel[183].addShapeBox(-6F, 4F, -3.5F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 0
		bodyModel[183].setRotationPoint(20F, -34F, -38F);
		bodyModel[183].rotateAngleY = -1.57079633F;
		bodyModel[183].rotateAngleZ = 0.22252948F;

		bodyModel[184].addShapeBox(-3F, -2F, 3.5F, 2, 6, 1, 0F,3F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[184].setRotationPoint(20F, -34F, -38F);
		bodyModel[184].rotateAngleY = -1.57079633F;
		bodyModel[184].rotateAngleZ = 0.22252948F;

		bodyModel[185].addShapeBox(-1F, -0.3F, 4.5F, 1, 1, 1, 0F,-0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F); // Box 0
		bodyModel[185].setRotationPoint(44F, -26F, -34F);
		bodyModel[185].rotateAngleX = 1.37881011F;

		bodyModel[186].addShapeBox(-4F, -0.3F, 4.5F, 14, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 0
		bodyModel[186].setRotationPoint(44F, -26F, -34F);
		bodyModel[186].rotateAngleX = 1.37881011F;

		bodyModel[187].addShapeBox(5F, -0.3F, 4.5F, 1, 1, 1, 0F,-0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F); // Box 0
		bodyModel[187].setRotationPoint(46F, -26F, -34F);
		bodyModel[187].rotateAngleX = 1.37881011F;

		bodyModel[188].addShapeBox(7.4F, -0.3F, 5.3F, 4, 1, 1, 0F,-0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0.7F, -1.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, 0.7F, -1.2F, -0.2F, -0.2F); // Box 0
		bodyModel[188].setRotationPoint(46F, -26F, -34F);
		bodyModel[188].rotateAngleX = 1.37881011F;

		bodyModel[189].addShapeBox(10.8F, -0.3F, 3F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 0
		bodyModel[189].setRotationPoint(46F, -26F, -34F);
		bodyModel[189].rotateAngleX = 1.37881011F;

		bodyModel[190].addShapeBox(-8.6F, -0.3F, 2.5F, 5, 1, 5, 0F,-0.2F, -0.2F, -1F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -1F); // Box 0
		bodyModel[190].setRotationPoint(44F, -26F, -34F);
		bodyModel[190].rotateAngleX = 1.37881011F;

		bodyModel[191].addShapeBox(-9.2F, -0.3F, 3.5F, 1, 1, 3, 0F,-0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F); // Box 0
		bodyModel[191].setRotationPoint(44F, -26F, -34F);
		bodyModel[191].rotateAngleX = 1.37881011F;

		bodyModel[192].addShapeBox(7.4F, -0.3F, 3.7F, 4, 1, 1, 0F,-1.2F, -0.2F, -0.2F, -0.4F, -0.2F, 0.7F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -0.4F, -0.2F, 0.7F, -0.4F, -0.2F, -1F, -0.4F, -0.2F, -0.2F); // Box 0
		bodyModel[192].setRotationPoint(46F, -26F, -34F);
		bodyModel[192].rotateAngleX = 1.37881011F;

		bodyModel[193].addShapeBox(-8F, -0.3F, 0.5F, 18, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 0
		bodyModel[193].setRotationPoint(44F, -26F, -34F);
		bodyModel[193].rotateAngleX = 1.37881011F;

		bodyModel[194].addShapeBox(-4F, -0.3F, 0.5F, 1, 1, 1, 0F,-0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F); // Box 0
		bodyModel[194].setRotationPoint(44F, -26F, -34F);
		bodyModel[194].rotateAngleX = 1.37881011F;

		bodyModel[195].addShapeBox(5F, -0.3F, 0.5F, 1, 1, 1, 0F,-0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F, -0.2F, -0.1F, 0.15F); // Box 0
		bodyModel[195].setRotationPoint(46F, -26F, -34F);
		bodyModel[195].rotateAngleX = 1.37881011F;

		bodyModel[196].addShapeBox(7.5F, -0.3F, 0.5F, 4, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 0
		bodyModel[196].setRotationPoint(46F, -26F, -34F);
		bodyModel[196].rotateAngleX = 1.37881011F;

		bodyModel[197].addShapeBox(7.5F, -0.3F, -0.5F, 4, 1, 1, 0F,-1F, -0.45F, 0.5F, -1F, -0.45F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1F, -0.45F, 0.5F, -1F, -0.45F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 0
		bodyModel[197].setRotationPoint(46F, -26F, -34F);
		bodyModel[197].rotateAngleX = 1.37881011F;

		bodyModel[198].addShapeBox(8.5F, -0.3F, -2F, 2, 1, 1, 0F,0.25F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0.25F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 0
		bodyModel[198].setRotationPoint(46F, -26F, -34F);
		bodyModel[198].rotateAngleX = 1.37881011F;

		bodyModel[199].addShapeBox(-1F, 6.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[199].setRotationPoint(-40.5F, -40.6F, 35.8F);
		bodyModel[199].rotateAngleX = 0.08726646F;

		bodyModel[200].addShapeBox(0F, 7.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[200].setRotationPoint(-43.5F, -40.6F, 35.8F);
		bodyModel[200].rotateAngleX = 0.08726646F;

		bodyModel[201].addShapeBox(-2.5F, -1.5F, -5F, 3, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[201].setRotationPoint(-8F, -35F, 41F);
		bodyModel[201].rotateAngleX = 0.08726646F;

		bodyModel[202].addShapeBox(-2.5F, -4.5F, -5F, 3, 3, 3, 0F,0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[202].setRotationPoint(-8F, -35F, 41F);
		bodyModel[202].rotateAngleX = 0.08726646F;

		bodyModel[203].addShapeBox(-11.5F, -4.5F, -5F, 3, 3, 3, 0F,-2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[203].setRotationPoint(-8F, -35F, 41F);
		bodyModel[203].rotateAngleX = 0.08726646F;

		bodyModel[204].addShapeBox(-8.5F, -4.5F, -5F, 6, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[204].setRotationPoint(-8F, -35F, 41F);
		bodyModel[204].rotateAngleX = 0.08726646F;

		bodyModel[205].addShapeBox(-11.5F, -1.5F, -5F, 3, 6, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[205].setRotationPoint(-8F, -35F, 41F);
		bodyModel[205].rotateAngleX = 0.08726646F;

		bodyModel[206].addShapeBox(-11.5F, 4.5F, -5F, 3, 4, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 0
		bodyModel[206].setRotationPoint(-8F, -35F, 41F);
		bodyModel[206].rotateAngleX = 0.08726646F;

		bodyModel[207].addShapeBox(-8.5F, 4.5F, -5F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[207].setRotationPoint(-8F, -35F, 41F);
		bodyModel[207].rotateAngleX = 0.08726646F;

		bodyModel[208].addShapeBox(-2.5F, 4.5F, -5F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[208].setRotationPoint(-8F, -35F, 41F);
		bodyModel[208].rotateAngleX = 0.08726646F;

		bodyModel[209].addBox(-8.5F, -1.5F, -5F, 6, 6, 6, 0F); // Box 0
		bodyModel[209].setRotationPoint(-8F, -35F, 41F);
		bodyModel[209].rotateAngleX = 0.08726646F;

		bodyModel[210].addShapeBox(-11.5F, 4.5F, -2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F); // Box 0
		bodyModel[210].setRotationPoint(-8F, -35F, 41F);
		bodyModel[210].rotateAngleX = 0.08726646F;

		bodyModel[211].addShapeBox(-8.5F, 4.5F, -2F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 0
		bodyModel[211].setRotationPoint(-8F, -35F, 41F);
		bodyModel[211].rotateAngleX = 0.08726646F;

		bodyModel[212].addShapeBox(-2.5F, 4.5F, -2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F); // Box 0
		bodyModel[212].setRotationPoint(-8F, -35F, 41F);
		bodyModel[212].rotateAngleX = 0.08726646F;

		bodyModel[213].addShapeBox(-2.5F, -1.5F, -2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[213].setRotationPoint(-8F, -35F, 41F);
		bodyModel[213].rotateAngleX = 0.08726646F;

		bodyModel[214].addShapeBox(-2.5F, -4.5F, -2F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[214].setRotationPoint(-8F, -35F, 41F);
		bodyModel[214].rotateAngleX = 0.08726646F;

		bodyModel[215].addShapeBox(-8.5F, -4.5F, -2F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[215].setRotationPoint(-8F, -35F, 41F);
		bodyModel[215].rotateAngleX = 0.08726646F;

		bodyModel[216].addShapeBox(-11.5F, -1.5F, -2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[216].setRotationPoint(-8F, -35F, 41F);
		bodyModel[216].rotateAngleX = 0.08726646F;

		bodyModel[217].addShapeBox(-11.5F, -4.5F, -2F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[217].setRotationPoint(-8F, -35F, 41F);
		bodyModel[217].rotateAngleX = 0.08726646F;

		bodyModel[218].addShapeBox(-3F, 3F, 0.6F, 7, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[218].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[218].rotateAngleX = 0.08726646F;

		bodyModel[219].addShapeBox(-3F, 2.5F, 0.7F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[219].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[219].rotateAngleX = 0.08726646F;

		bodyModel[220].addShapeBox(-1.5F, 2.4F, 0.8F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[220].setRotationPoint(-22.5F, -40.6F, 35.8F);
		bodyModel[220].rotateAngleX = 0.08726646F;

		bodyModel[221].addShapeBox(-1.5F, 2.4F, 0.8F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[221].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[221].rotateAngleX = 0.08726646F;

		bodyModel[222].addShapeBox(-4F, 8F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[222].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[222].rotateAngleX = 0.08726646F;

		bodyModel[223].addShapeBox(-1F, 8F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[223].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[223].rotateAngleX = 0.08726646F;

		bodyModel[224].addShapeBox(-1F, 7.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[224].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[224].rotateAngleX = 0.08726646F;

		bodyModel[225].addShapeBox(2F, 8F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[225].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[225].rotateAngleX = 0.08726646F;

		bodyModel[226].addShapeBox(2F, 7.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[226].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[226].rotateAngleX = 0.08726646F;

		bodyModel[227].addShapeBox(3F, 8.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[227].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[227].rotateAngleX = 0.08726646F;

		bodyModel[228].addShapeBox(0F, 8.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[228].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[228].rotateAngleX = 0.08726646F;

		bodyModel[229].addShapeBox(-4F, 7.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[229].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[229].rotateAngleX = 0.08726646F;

		bodyModel[230].addShapeBox(-3F, 8.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[230].setRotationPoint(-25.5F, -40.6F, 35.8F);
		bodyModel[230].rotateAngleX = 0.08726646F;

		bodyModel[231].addBox(0F, 2F, -3F, 7, 9, 3, 0F); // Box 0
		bodyModel[231].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[231].rotateAngleX = -0.08726646F;

		bodyModel[232].addBox(0F, 1.5F, -3.1F, 7, 2, 3, 0F); // Box 0
		bodyModel[232].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[232].rotateAngleX = -0.08726646F;

		bodyModel[233].addShapeBox(1.5F, 1.4F, -3.2F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[233].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[233].rotateAngleX = -0.08726646F;

		bodyModel[234].addShapeBox(1.5F, 1.4F, -3.2F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[234].setRotationPoint(-8.5F, -39.6F, -36.7F);
		bodyModel[234].rotateAngleX = -0.08726646F;

		bodyModel[235].addShapeBox(5F, 7F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[235].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[235].rotateAngleX = -0.08726646F;

		bodyModel[236].addShapeBox(6F, 7.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[236].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[236].rotateAngleX = -0.08726646F;

		bodyModel[237].addShapeBox(5F, 6.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[237].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[237].rotateAngleX = -0.08726646F;

		bodyModel[238].addShapeBox(2F, 6.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[238].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[238].rotateAngleX = -0.08726646F;

		bodyModel[239].addShapeBox(2F, 7F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[239].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[239].rotateAngleX = -0.08726646F;

		bodyModel[240].addShapeBox(3F, 7.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[240].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[240].rotateAngleX = -0.08726646F;

		bodyModel[241].addShapeBox(0F, 7.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[241].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[241].rotateAngleX = -0.08726646F;

		bodyModel[242].addShapeBox(-1F, 7F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[242].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[242].rotateAngleX = -0.08726646F;

		bodyModel[243].addShapeBox(-1F, 6.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[243].setRotationPoint(-11.5F, -39.6F, -36.7F);
		bodyModel[243].rotateAngleX = -0.08726646F;

		bodyModel[244].addBox(0F, 3F, -3F, 7, 9, 3, 0F); // Box 0
		bodyModel[244].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[244].rotateAngleX = -0.08726646F;

		bodyModel[245].addBox(0F, 2.5F, -3.1F, 7, 2, 3, 0F); // Box 0
		bodyModel[245].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[245].rotateAngleX = -0.08726646F;

		bodyModel[246].addShapeBox(1.5F, 2.4F, -3.2F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[246].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[246].rotateAngleX = -0.08726646F;

		bodyModel[247].addShapeBox(1.5F, 2.4F, -3.2F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[247].setRotationPoint(0.5F, -39.6F, -36.7F);
		bodyModel[247].rotateAngleX = -0.08726646F;

		bodyModel[248].addShapeBox(5F, 8F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[248].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[248].rotateAngleX = -0.08726646F;

		bodyModel[249].addShapeBox(6F, 8.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[249].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[249].rotateAngleX = -0.08726646F;

		bodyModel[250].addShapeBox(5F, 7.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[250].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[250].rotateAngleX = -0.08726646F;

		bodyModel[251].addShapeBox(2F, 7.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[251].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[251].rotateAngleX = -0.08726646F;

		bodyModel[252].addShapeBox(2F, 8F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[252].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[252].rotateAngleX = -0.08726646F;

		bodyModel[253].addShapeBox(3F, 8.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[253].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[253].rotateAngleX = -0.08726646F;

		bodyModel[254].addShapeBox(0F, 8.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[254].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[254].rotateAngleX = -0.08726646F;

		bodyModel[255].addShapeBox(-1F, 8F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[255].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[255].rotateAngleX = -0.08726646F;

		bodyModel[256].addShapeBox(-1F, 7.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[256].setRotationPoint(-2.5F, -39.6F, -36.7F);
		bodyModel[256].rotateAngleX = -0.08726646F;

		bodyModel[257].addShapeBox(-20F, -0.5F, -1F, 40, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[257].setRotationPoint(-20F, -21F, -37.5F);
		bodyModel[257].rotateAngleX = -0.38397244F;

		bodyModel[258].addShapeBox(-20F, 1.5F, -1F, 40, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[258].setRotationPoint(-20F, -21F, -37.5F);
		bodyModel[258].rotateAngleX = -0.38397244F;

		bodyModel[259].addShapeBox(-20F, -1.5F, -1F, 40, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[259].setRotationPoint(-20F, -21F, -37.5F);
		bodyModel[259].rotateAngleX = -0.38397244F;

		bodyModel[260].addShapeBox(-3F, -2F, -3.5F, 2, 6, 1, 0F,3F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[260].setRotationPoint(20F, -34F, -38F);
		bodyModel[260].rotateAngleY = -1.57079633F;
		bodyModel[260].rotateAngleZ = 0.22252948F;

		bodyModel[261].addShapeBox(-1F, 2F, -1.4F, 16, 14, 2, 0F,-1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F); // Box 0
		bodyModel[261].setRotationPoint(18F, -36F, 31F);
		bodyModel[261].rotateAngleX = 0.2268928F;

		bodyModel[262].addShapeBox(0F, 0.5F, 0F, 20, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.3F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[262].setRotationPoint(38F, -39F, -3F);

		bodyModel[263].addBox(-8.5F, -2.5F, -5F, 6, 6, 6, 0F); // Box 0
		bodyModel[263].setRotationPoint(4F, -35F, 41F);
		bodyModel[263].rotateAngleX = 0.08726646F;

		bodyModel[264].addShapeBox(-2.5F, -2.5F, -2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[264].setRotationPoint(4F, -35F, 41F);
		bodyModel[264].rotateAngleX = 0.08726646F;

		bodyModel[265].addShapeBox(-2.5F, -5.5F, -2F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[265].setRotationPoint(4F, -35F, 41F);
		bodyModel[265].rotateAngleX = 0.08726646F;

		bodyModel[266].addShapeBox(-8.5F, -5.5F, -2F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[266].setRotationPoint(4F, -35F, 41F);
		bodyModel[266].rotateAngleX = 0.08726646F;

		bodyModel[267].addShapeBox(-11.5F, -5.5F, -2F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[267].setRotationPoint(4F, -35F, 41F);
		bodyModel[267].rotateAngleX = 0.08726646F;

		bodyModel[268].addShapeBox(-11.5F, -2.5F, -2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[268].setRotationPoint(4F, -35F, 41F);
		bodyModel[268].rotateAngleX = 0.08726646F;

		bodyModel[269].addShapeBox(-11.5F, 3.5F, -2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F); // Box 0
		bodyModel[269].setRotationPoint(4F, -35F, 41F);
		bodyModel[269].rotateAngleX = 0.08726646F;

		bodyModel[270].addShapeBox(-8.5F, 3.5F, -2F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 0
		bodyModel[270].setRotationPoint(4F, -35F, 41F);
		bodyModel[270].rotateAngleX = 0.08726646F;

		bodyModel[271].addShapeBox(-2.5F, 3.5F, -2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F); // Box 0
		bodyModel[271].setRotationPoint(4F, -35F, 41F);
		bodyModel[271].rotateAngleX = 0.08726646F;

		bodyModel[272].addShapeBox(-2.5F, 3.5F, -5F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[272].setRotationPoint(4F, -35F, 41F);
		bodyModel[272].rotateAngleX = 0.08726646F;

		bodyModel[273].addShapeBox(-8.5F, 3.5F, -5F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[273].setRotationPoint(4F, -35F, 41F);
		bodyModel[273].rotateAngleX = 0.08726646F;

		bodyModel[274].addShapeBox(-11.5F, 3.5F, -5F, 3, 4, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 0
		bodyModel[274].setRotationPoint(4F, -35F, 41F);
		bodyModel[274].rotateAngleX = 0.08726646F;

		bodyModel[275].addShapeBox(-11.5F, -5.5F, -5F, 3, 3, 3, 0F,-2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[275].setRotationPoint(4F, -35F, 41F);
		bodyModel[275].rotateAngleX = 0.08726646F;

		bodyModel[276].addShapeBox(-8.5F, -5.5F, -5F, 6, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[276].setRotationPoint(4F, -35F, 41F);
		bodyModel[276].rotateAngleX = 0.08726646F;

		bodyModel[277].addShapeBox(-2.5F, -5.5F, -5F, 3, 3, 3, 0F,0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[277].setRotationPoint(4F, -35F, 41F);
		bodyModel[277].rotateAngleX = 0.08726646F;

		bodyModel[278].addShapeBox(-2.5F, -2.5F, -5F, 3, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[278].setRotationPoint(4F, -35F, 41F);
		bodyModel[278].rotateAngleX = 0.08726646F;

		bodyModel[279].addShapeBox(-11.5F, -2.5F, -5F, 3, 6, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[279].setRotationPoint(4F, -35F, 41F);
		bodyModel[279].rotateAngleX = 0.08726646F;

		bodyModel[280].addShapeBox(-2.5F, -5.5F, 2F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[280].setRotationPoint(-37F, -35F, -41F);
		bodyModel[280].rotateAngleX = -0.08726646F;

		bodyModel[281].addShapeBox(-2.5F, -2.5F, 2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[281].setRotationPoint(-37F, -35F, -41F);
		bodyModel[281].rotateAngleX = -0.08726646F;

		bodyModel[282].addShapeBox(-2.5F, 3.5F, 2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F); // Box 0
		bodyModel[282].setRotationPoint(-37F, -35F, -41F);
		bodyModel[282].rotateAngleX = -0.08726646F;

		bodyModel[283].addShapeBox(-8.5F, 3.5F, 2F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 0
		bodyModel[283].setRotationPoint(-37F, -35F, -41F);
		bodyModel[283].rotateAngleX = -0.08726646F;

		bodyModel[284].addShapeBox(-11.5F, 3.5F, 2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F); // Box 0
		bodyModel[284].setRotationPoint(-37F, -35F, -41F);
		bodyModel[284].rotateAngleX = -0.08726646F;

		bodyModel[285].addShapeBox(-11.5F, -2.5F, 2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[285].setRotationPoint(-37F, -35F, -41F);
		bodyModel[285].rotateAngleX = -0.08726646F;

		bodyModel[286].addShapeBox(-11.5F, -5.5F, 2F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[286].setRotationPoint(-37F, -35F, -41F);
		bodyModel[286].rotateAngleX = -0.08726646F;

		bodyModel[287].addShapeBox(-11.5F, 3.5F, -1F, 3, 4, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 0
		bodyModel[287].setRotationPoint(-37F, -35F, -41F);
		bodyModel[287].rotateAngleX = -0.08726646F;

		bodyModel[288].addShapeBox(-8.5F, 3.5F, -1F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[288].setRotationPoint(-37F, -35F, -41F);
		bodyModel[288].rotateAngleX = -0.08726646F;

		bodyModel[289].addShapeBox(-2.5F, 3.5F, -1F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[289].setRotationPoint(-37F, -35F, -41F);
		bodyModel[289].rotateAngleX = -0.08726646F;

		bodyModel[290].addShapeBox(-2.5F, -2.5F, -1F, 3, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[290].setRotationPoint(-37F, -35F, -41F);
		bodyModel[290].rotateAngleX = -0.08726646F;

		bodyModel[291].addShapeBox(-2.5F, -5.5F, -1F, 3, 3, 3, 0F,0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[291].setRotationPoint(-37F, -35F, -41F);
		bodyModel[291].rotateAngleX = -0.08726646F;

		bodyModel[292].addShapeBox(-8.5F, -5.5F, 2F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[292].setRotationPoint(-37F, -35F, -41F);
		bodyModel[292].rotateAngleX = -0.08726646F;

		bodyModel[293].addShapeBox(-8.5F, -5.5F, -1F, 6, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[293].setRotationPoint(-37F, -35F, -41F);
		bodyModel[293].rotateAngleX = -0.08726646F;

		bodyModel[294].addShapeBox(-11.5F, -5.5F, -1F, 3, 3, 3, 0F,-2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[294].setRotationPoint(-37F, -35F, -41F);
		bodyModel[294].rotateAngleX = -0.08726646F;

		bodyModel[295].addShapeBox(-11.5F, -2.5F, -1F, 3, 6, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[295].setRotationPoint(-37F, -35F, -41F);
		bodyModel[295].rotateAngleX = -0.08726646F;

		bodyModel[296].addBox(-8.5F, -2.5F, -1F, 6, 6, 6, 0F); // Box 0
		bodyModel[296].setRotationPoint(-37F, -35F, -41F);
		bodyModel[296].rotateAngleX = -0.08726646F;

		bodyModel[297].addShapeBox(-2.5F, -4.5F, 2F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[297].setRotationPoint(-25F, -35F, -41F);
		bodyModel[297].rotateAngleX = -0.08726646F;

		bodyModel[298].addShapeBox(-2.5F, -1.5F, 2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[298].setRotationPoint(-25F, -35F, -41F);
		bodyModel[298].rotateAngleX = -0.08726646F;

		bodyModel[299].addShapeBox(-2.5F, 4.5F, 2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F); // Box 0
		bodyModel[299].setRotationPoint(-25F, -35F, -41F);
		bodyModel[299].rotateAngleX = -0.08726646F;

		bodyModel[300].addShapeBox(-8.5F, 4.5F, 2F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 0
		bodyModel[300].setRotationPoint(-25F, -35F, -41F);
		bodyModel[300].rotateAngleX = -0.08726646F;

		bodyModel[301].addShapeBox(-11.5F, 4.5F, 2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F); // Box 0
		bodyModel[301].setRotationPoint(-25F, -35F, -41F);
		bodyModel[301].rotateAngleX = -0.08726646F;

		bodyModel[302].addShapeBox(-11.5F, -1.5F, 2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[302].setRotationPoint(-25F, -35F, -41F);
		bodyModel[302].rotateAngleX = -0.08726646F;

		bodyModel[303].addShapeBox(-11.5F, -4.5F, 2F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[303].setRotationPoint(-25F, -35F, -41F);
		bodyModel[303].rotateAngleX = -0.08726646F;

		bodyModel[304].addShapeBox(-11.5F, 4.5F, -1F, 3, 4, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 0
		bodyModel[304].setRotationPoint(-25F, -35F, -41F);
		bodyModel[304].rotateAngleX = -0.08726646F;

		bodyModel[305].addShapeBox(-8.5F, 4.5F, -1F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[305].setRotationPoint(-25F, -35F, -41F);
		bodyModel[305].rotateAngleX = -0.08726646F;

		bodyModel[306].addShapeBox(-2.5F, 4.5F, -1F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[306].setRotationPoint(-25F, -35F, -41F);
		bodyModel[306].rotateAngleX = -0.08726646F;

		bodyModel[307].addShapeBox(-2.5F, -1.5F, -1F, 3, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[307].setRotationPoint(-25F, -35F, -41F);
		bodyModel[307].rotateAngleX = -0.08726646F;

		bodyModel[308].addShapeBox(-2.5F, -4.5F, -1F, 3, 3, 3, 0F,0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[308].setRotationPoint(-25F, -35F, -41F);
		bodyModel[308].rotateAngleX = -0.08726646F;

		bodyModel[309].addShapeBox(-8.5F, -4.5F, 2F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[309].setRotationPoint(-25F, -35F, -41F);
		bodyModel[309].rotateAngleX = -0.08726646F;

		bodyModel[310].addShapeBox(-8.5F, -4.5F, -1F, 6, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[310].setRotationPoint(-25F, -35F, -41F);
		bodyModel[310].rotateAngleX = -0.08726646F;

		bodyModel[311].addShapeBox(-11.5F, -4.5F, -1F, 3, 3, 3, 0F,-2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[311].setRotationPoint(-25F, -35F, -41F);
		bodyModel[311].rotateAngleX = -0.08726646F;

		bodyModel[312].addShapeBox(-11.5F, -1.5F, -1F, 3, 6, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[312].setRotationPoint(-25F, -35F, -41F);
		bodyModel[312].rotateAngleX = -0.08726646F;

		bodyModel[313].addBox(-8.5F, -1.5F, -1F, 6, 6, 6, 0F); // Box 0
		bodyModel[313].setRotationPoint(-25F, -35F, -41F);
		bodyModel[313].rotateAngleX = -0.08726646F;

		bodyModel[314].addBox(-8.5F, -3.5F, -1F, 6, 6, 6, 0F); // Box 0
		bodyModel[314].setRotationPoint(-13F, -35F, -41F);
		bodyModel[314].rotateAngleX = -0.08726646F;

		bodyModel[315].addShapeBox(-8.5F, -6.5F, -1F, 6, 3, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[315].setRotationPoint(-13F, -35F, -41F);
		bodyModel[315].rotateAngleX = -0.08726646F;

		bodyModel[316].addShapeBox(-11.5F, -6.5F, -1F, 3, 3, 3, 0F,-2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[316].setRotationPoint(-13F, -35F, -41F);
		bodyModel[316].rotateAngleX = -0.08726646F;

		bodyModel[317].addShapeBox(-11.5F, -3.5F, -1F, 3, 6, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[317].setRotationPoint(-13F, -35F, -41F);
		bodyModel[317].rotateAngleX = -0.08726646F;

		bodyModel[318].addShapeBox(-11.5F, 2.5F, -1F, 3, 4, 3, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 0
		bodyModel[318].setRotationPoint(-13F, -35F, -41F);
		bodyModel[318].rotateAngleX = -0.08726646F;

		bodyModel[319].addShapeBox(-8.5F, 2.5F, -1F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[319].setRotationPoint(-13F, -35F, -41F);
		bodyModel[319].rotateAngleX = -0.08726646F;

		bodyModel[320].addShapeBox(-2.5F, 2.5F, -1F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[320].setRotationPoint(-13F, -35F, -41F);
		bodyModel[320].rotateAngleX = -0.08726646F;

		bodyModel[321].addShapeBox(-2.5F, -3.5F, -1F, 3, 6, 3, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[321].setRotationPoint(-13F, -35F, -41F);
		bodyModel[321].rotateAngleX = -0.08726646F;

		bodyModel[322].addShapeBox(-2.5F, -6.5F, -1F, 3, 3, 3, 0F,0F, -1F, -1F, -2F, -2F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[322].setRotationPoint(-13F, -35F, -41F);
		bodyModel[322].rotateAngleX = -0.08726646F;

		bodyModel[323].addShapeBox(-2.5F, -3.5F, 2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[323].setRotationPoint(-13F, -35F, -41F);
		bodyModel[323].rotateAngleX = -0.08726646F;

		bodyModel[324].addShapeBox(-2.5F, -6.5F, 2F, 3, 3, 3, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[324].setRotationPoint(-13F, -35F, -41F);
		bodyModel[324].rotateAngleX = -0.08726646F;

		bodyModel[325].addShapeBox(-8.5F, -6.5F, 2F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[325].setRotationPoint(-13F, -35F, -41F);
		bodyModel[325].rotateAngleX = -0.08726646F;

		bodyModel[326].addShapeBox(-11.5F, -6.5F, 2F, 3, 3, 3, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[326].setRotationPoint(-13F, -35F, -41F);
		bodyModel[326].rotateAngleX = -0.08726646F;

		bodyModel[327].addShapeBox(-11.5F, -3.5F, 2F, 3, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 0
		bodyModel[327].setRotationPoint(-13F, -35F, -41F);
		bodyModel[327].rotateAngleX = -0.08726646F;

		bodyModel[328].addShapeBox(-11.5F, 2.5F, 2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -2F, -2F, -2F); // Box 0
		bodyModel[328].setRotationPoint(-13F, -35F, -41F);
		bodyModel[328].rotateAngleX = -0.08726646F;

		bodyModel[329].addShapeBox(-8.5F, 2.5F, 2F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 0
		bodyModel[329].setRotationPoint(-13F, -35F, -41F);
		bodyModel[329].rotateAngleX = -0.08726646F;

		bodyModel[330].addShapeBox(-2.5F, 2.5F, 2F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, -2F, 0F, -1F, -1F); // Box 0
		bodyModel[330].setRotationPoint(-13F, -35F, -41F);
		bodyModel[330].rotateAngleX = -0.08726646F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 8, 23, 4, 0F,2F, -2F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, 2F, -2F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F); // Box 0
		bodyModel[331].setRotationPoint(42F, -39F, 0F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 94, 3, 62, 0F,0.75F, 0.5F, -0.75F, -3F, 0.5F, -0.75F, -3F, 0.5F, -0.75F, 0.75F, 0.5F, -0.75F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 0
		bodyModel[332].setRotationPoint(-61F, -41F, -31F);

		bodyModel[333].addShapeBox(0F, 0F, -44F, 4, 16, 42, 0F,4.9F, 0F, -39.5F, 0F, 0F, -39.5F, 0F, 0F, 0F, 4.9F, 0F, 0F, -0.1F, 2F, -39.5F, 0F, 2F, -39.5F, 0F, 2F, 0F, -0.1F, 2F, 0F); // Box 0
		bodyModel[333].setRotationPoint(-56F, -38F, 23F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 13, 14, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[334].setRotationPoint(33F, -20F, -19F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 27, 0F,-2F, 0F, 0F, 1F, -1.3F, 0F, 1F, -1.3F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 0
		bodyModel[335].setRotationPoint(39F, -39F, 4F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 3, 27, 0F,1F, -1.3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[336].setRotationPoint(52F, -39F, 4F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 6, 1, 27, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.3F, 0F, 2F, 0.3F, 0F, 2F, 0.3F, 0F, 2F, 0.3F, 0F); // Box 0
		bodyModel[337].setRotationPoint(43F, -39F, 4F);

		bodyModel[338].addShapeBox(-3.5F, -1.5F, -1.5F, 7, 4, 3, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 0
		bodyModel[338].setRotationPoint(46.25F, -35F, 27F);
		bodyModel[338].rotateAngleZ = -0.13962634F;

		bodyModel[339].addShapeBox(-3.5F, -1.5F, 2.5F, 7, 4, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[339].setRotationPoint(46.25F, -35F, 27F);
		bodyModel[339].rotateAngleZ = -0.13962634F;

		bodyModel[340].addShapeBox(-3.5F, -1.5F, -4.5F, 7, 4, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[340].setRotationPoint(46.25F, -35F, 27F);
		bodyModel[340].rotateAngleZ = -0.13962634F;

		bodyModel[341].addShapeBox(-1.5F, -3F, -1.5F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[341].setRotationPoint(46.25F, -35F, 27F);
		bodyModel[341].rotateAngleZ = -0.13962634F;

		bodyModel[342].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,2F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0F, 2F, 0F, 0F, 4.25F, 1F, -0.5F, 4F, 2.2F, -0.5F, 4F, 2.2F, 0F, 4.25F, 1F, 0F); // Box 0
		bodyModel[342].setRotationPoint(43F, -39F, 3F);

		bodyModel[343].addShapeBox(-6F, 0F, -4F, 48, 2, 4, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[343].setRotationPoint(-34F, -30F, 37F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[344].setRotationPoint(13F, -37F, -37F);

		bodyModel[345].addShapeBox(-6F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[345].setRotationPoint(16F, -32F, -37F);

		bodyModel[346].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[346].setRotationPoint(12F, -32F, -37F);

		bodyModel[347].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[347].setRotationPoint(8F, -32F, -37F);

		bodyModel[348].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[348].setRotationPoint(4F, -32F, -37F);

		bodyModel[349].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[349].setRotationPoint(14F, -37F, -37F);

		bodyModel[350].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[350].setRotationPoint(9F, -37F, -37F);

		bodyModel[351].addShapeBox(-6F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[351].setRotationPoint(4F, -37F, -37F);

		bodyModel[352].addShapeBox(-6F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[352].setRotationPoint(0F, -32F, -37F);

		bodyModel[353].addShapeBox(-6F, 0F, 0F, 4, 2, 1, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[353].setRotationPoint(-12F, -32F, -37F);

		bodyModel[354].addShapeBox(-6F, 0F, 0F, 10, 3, 1, 0F,6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F); // Box 0
		bodyModel[354].setRotationPoint(-15F, -37F, -37F);

		bodyModel[355].addShapeBox(-3F, 4.5F, 0.7F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[355].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[355].rotateAngleX = 0.08726646F;

		bodyModel[356].addShapeBox(-3F, 5F, 0.6F, 7, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[356].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[356].rotateAngleX = 0.08726646F;

		bodyModel[357].addShapeBox(-1.5F, 4.4F, 0.8F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[357].setRotationPoint(12.5F, -40.6F, 35.8F);
		bodyModel[357].rotateAngleX = 0.08726646F;

		bodyModel[358].addShapeBox(-1.5F, 4.4F, 0.8F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[358].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[358].rotateAngleX = 0.08726646F;

		bodyModel[359].addShapeBox(-4F, 10F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[359].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[359].rotateAngleX = 0.08726646F;

		bodyModel[360].addShapeBox(-4F, 9.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[360].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[360].rotateAngleX = 0.08726646F;

		bodyModel[361].addShapeBox(-1F, 10F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[361].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[361].rotateAngleX = 0.08726646F;

		bodyModel[362].addShapeBox(-1F, 9.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[362].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[362].rotateAngleX = 0.08726646F;

		bodyModel[363].addShapeBox(2F, 10F, 3F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[363].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[363].rotateAngleX = 0.08726646F;

		bodyModel[364].addShapeBox(2F, 9.8F, 2.85F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[364].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[364].rotateAngleX = 0.08726646F;

		bodyModel[365].addShapeBox(3F, 10.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[365].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[365].rotateAngleX = 0.08726646F;

		bodyModel[366].addShapeBox(0F, 10.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[366].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[366].rotateAngleX = 0.08726646F;

		bodyModel[367].addShapeBox(-3F, 10.8F, 2.8F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[367].setRotationPoint(9.5F, -40.6F, 35.8F);
		bodyModel[367].rotateAngleX = 0.08726646F;

		bodyModel[368].addBox(0F, 0.5F, -3.1F, 7, 2, 3, 0F); // Box 0
		bodyModel[368].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[368].rotateAngleX = -0.08726646F;

		bodyModel[369].addShapeBox(1.5F, 0.4F, -3.2F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[369].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[369].rotateAngleX = -0.08726646F;

		bodyModel[370].addShapeBox(1.5F, 0.4F, -3.2F, 1, 9, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 0
		bodyModel[370].setRotationPoint(9.5F, -39.6F, -36.7F);
		bodyModel[370].rotateAngleX = -0.08726646F;

		bodyModel[371].addShapeBox(5F, 6F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[371].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[371].rotateAngleX = -0.08726646F;

		bodyModel[372].addShapeBox(6F, 6.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[372].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[372].rotateAngleX = -0.08726646F;

		bodyModel[373].addShapeBox(2F, 6F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[373].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[373].rotateAngleX = -0.08726646F;

		bodyModel[374].addShapeBox(3F, 6.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[374].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[374].rotateAngleX = -0.08726646F;

		bodyModel[375].addShapeBox(-1F, 6F, -3.6F, 3, 1, 1, 0F,-0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F); // Box 0
		bodyModel[375].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[375].rotateAngleX = -0.08726646F;

		bodyModel[376].addShapeBox(0F, 6.8F, -4.4F, 1, 3, 2, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 0
		bodyModel[376].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[376].rotateAngleX = -0.08726646F;

		bodyModel[377].addShapeBox(-1F, 5.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[377].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[377].rotateAngleX = -0.08726646F;

		bodyModel[378].addShapeBox(2F, 5.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[378].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[378].rotateAngleX = -0.08726646F;

		bodyModel[379].addBox(0F, 1F, -3F, 7, 9, 3, 0F); // Box 0
		bodyModel[379].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[379].rotateAngleX = -0.08726646F;

		bodyModel[380].addShapeBox(5F, 5.8F, -3.55F, 3, 4, 1, 0F,-0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 0
		bodyModel[380].setRotationPoint(6.5F, -39.6F, -36.7F);
		bodyModel[380].rotateAngleX = -0.08726646F;

		bodyModel[381].addBox(-8.5F, -1.5F, -5F, 6, 6, 6, 0F); // Box 0
		bodyModel[381].setRotationPoint(-8F, -35F, 41F);
		bodyModel[381].rotateAngleX = 0.08726646F;

		bodyModel[382].addBox(-8.5F, -2.5F, -5F, 6, 6, 6, 0F); // Box 0
		bodyModel[382].setRotationPoint(4F, -35F, 41F);
		bodyModel[382].rotateAngleX = 0.08726646F;

		bodyModel[383].addShapeBox(0F, 0F, 30F, 20, 10, 20, 0F,0F, -1.5F, 7F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, -1.5F, 0F, 0F, 0F, 15F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[383].setRotationPoint(88F, -30F, -50F);

		bodyModel[384].addShapeBox(0F, 0F, 30F, 20, 10, 20, 0F,0F, -1.5F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, -1.5F, 7F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 2F, 0F, 0F, 15F); // Box 0
		bodyModel[384].setRotationPoint(88F, -30F, -30F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 11, 13, 35, 0F,0F, 0F, -4F, 0F, -2.5F, -8F, 0F, -2.5F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -9F, -2F, 0F); // Box 0
		bodyModel[385].setRotationPoint(77F, -31F, -35F);

		bodyModel[386].addShapeBox(0F, 0F, 30F, 11, 13, 35, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -8F, 0F, 0F, -4F, -9F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -9F, -2F, 0F); // Box 0
		bodyModel[386].setRotationPoint(77F, -31F, -30F);

		bodyModel[387].addShapeBox(-7F, 0F, -7F, 14, 3, 14, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 0
		bodyModel[387].setRotationPoint(0F, -45F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 65, 382, textureX, textureY); // Box 1
		turretModel[1] = new ModelRendererTurbo(this, 457, 382, textureX, textureY); // Box 16
		turretModel[2] = new ModelRendererTurbo(this, 369, 390, textureX, textureY); // Box 17

		turretModel[0].addShapeBox(-2F, -10F, -5F, 4, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		turretModel[0].setRotationPoint(0F, -47F, 0F);

		turretModel[1].addShapeBox(2F, -10F, -5F, 3, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 16
		turretModel[1].setRotationPoint(0F, -47F, 0F);

		turretModel[2].addShapeBox(-5F, -10F, -5F, 3, 12, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 17
		turretModel[2].setRotationPoint(0F, -47F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 97, 382, textureX, textureY); // Box 2
		barrelModel[1] = new ModelRendererTurbo(this, 193, 382, textureX, textureY); // Box 3
		barrelModel[2] = new ModelRendererTurbo(this, 289, 382, textureX, textureY); // Box 4
		barrelModel[3] = new ModelRendererTurbo(this, 353, 382, textureX, textureY); // Box 5
		barrelModel[4] = new ModelRendererTurbo(this, 409, 382, textureX, textureY); // Box 6
		barrelModel[5] = new ModelRendererTurbo(this, 169, 382, textureX, textureY); // Box 7

		barrelModel[0].addShapeBox(-12F, -7F, 0F, 24, 8, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		barrelModel[0].setRotationPoint(0F, -56F, 0F);

		barrelModel[1].addShapeBox(-12F, -9F, 0F, 24, 2, 20, 0F,-10F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -1F, -10F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		barrelModel[1].setRotationPoint(0F, -56F, 0F);

		barrelModel[2].addShapeBox(-12F, -11F, -12F, 24, 12, 12, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		barrelModel[2].setRotationPoint(0F, -56F, 0F);

		barrelModel[3].addShapeBox(-12F, -2F, -16F, 23, 3, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		barrelModel[3].setRotationPoint(0F, -56F, 0F);

		barrelModel[4].addShapeBox(-12F, -5F, -16F, 23, 3, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[4].setRotationPoint(0F, -56F, 0F);

		barrelModel[5].addShapeBox(-12F, -2F, -18F, 19, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		barrelModel[5].setRotationPoint(0F, -56F, 0F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 0
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 0
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 0
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 0
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Box 0
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 769, 137, textureX, textureY); // Box 0
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 0
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 0
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 0
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 0
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box 0
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 665, 185, textureX, textureY); // Box 0
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 0
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 0
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 849, 137, textureX, textureY); // Box 0
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 0
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 0
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 889, 73, textureX, textureY); // Box 0
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 521, 185, textureX, textureY); // Box 0
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 0
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 993, 81, textureX, textureY); // Box 0
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 585, 185, textureX, textureY); // Box 0
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 713, 193, textureX, textureY); // Box 0
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 777, 193, textureX, textureY); // Box 0
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 809, 193, textureX, textureY); // Box 0
		leftFrontWheelModel[25] = new ModelRendererTurbo(this, 841, 193, textureX, textureY); // Box 0
		leftFrontWheelModel[26] = new ModelRendererTurbo(this, 985, 193, textureX, textureY); // Box 0
		leftFrontWheelModel[27] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 0

		leftFrontWheelModel[0].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftFrontWheelModel[0].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[1].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		leftFrontWheelModel[1].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[2].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		leftFrontWheelModel[2].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[3].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		leftFrontWheelModel[3].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[4].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftFrontWheelModel[4].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[5].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[5].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[6].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[6].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[7].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[7].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[8].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[8].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[9].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftFrontWheelModel[9].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[10].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		leftFrontWheelModel[10].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[11].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		leftFrontWheelModel[11].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[12].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		leftFrontWheelModel[12].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[13].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftFrontWheelModel[13].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[14].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[14].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[15].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[15].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[16].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[16].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[17].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[17].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[18].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 0
		leftFrontWheelModel[18].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[19].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[19].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[20].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftFrontWheelModel[20].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[21].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 0
		leftFrontWheelModel[21].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[22].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 0
		leftFrontWheelModel[22].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[23].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 0
		leftFrontWheelModel[23].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[24].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 0
		leftFrontWheelModel[24].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[25].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 0
		leftFrontWheelModel[25].setRotationPoint(70F, -1F, 28F);

		leftFrontWheelModel[26].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 0
		leftFrontWheelModel[26].setRotationPoint(40.5F, -1F, 28F);

		leftFrontWheelModel[27].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 0
		leftFrontWheelModel[27].setRotationPoint(40.5F, -1F, 28F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 0
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 0
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 0
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 0
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 0
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 545, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 585, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 617, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 657, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 689, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Box 0
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 0
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 553, 137, textureX, textureY); // Box 0
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 545, 81, textureX, textureY); // Box 0
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 737, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 0
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 0
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 769, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 801, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 865, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[25] = new ModelRendererTurbo(this, 897, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[26] = new ModelRendererTurbo(this, 929, 209, textureX, textureY); // Box 0
		rightFrontWheelModel[27] = new ModelRendererTurbo(this, 961, 209, textureX, textureY); // Box 0

		rightFrontWheelModel[0].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[0].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[1].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		rightFrontWheelModel[1].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[2].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		rightFrontWheelModel[2].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[3].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[3].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[4].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[4].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[5].addShapeBox(-3.5F, -1.5F, -7F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[5].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[6].addShapeBox(-3.5F, 1.5F, -7F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		rightFrontWheelModel[6].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[7].addShapeBox(-3.5F, -3.5F, -7F, 7, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[7].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[8].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[8].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[9].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[9].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[10].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		rightFrontWheelModel[10].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[11].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		rightFrontWheelModel[11].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[12].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[12].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[13].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[13].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[14].addShapeBox(-3.5F, -1.5F, -7F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[14].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[15].addShapeBox(-3.5F, 1.5F, -7F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		rightFrontWheelModel[15].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[16].addShapeBox(-3.5F, -3.5F, -7F, 7, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[16].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[17].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[17].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[18].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 0
		rightFrontWheelModel[18].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[19].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[19].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[20].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightFrontWheelModel[20].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[21].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 0
		rightFrontWheelModel[21].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[22].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 0
		rightFrontWheelModel[22].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[23].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 0
		rightFrontWheelModel[23].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[24].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 0
		rightFrontWheelModel[24].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[25].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 0
		rightFrontWheelModel[25].setRotationPoint(70F, -1F, -28F);

		rightFrontWheelModel[26].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 0
		rightFrontWheelModel[26].setRotationPoint(40.5F, -1F, -28F);

		rightFrontWheelModel[27].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 0
		rightFrontWheelModel[27].setRotationPoint(40.5F, -1F, -28F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 0
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 993, 209, textureX, textureY); // Box 0
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Box 0
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 0
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 0
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 0
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Box 0
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 601, 137, textureX, textureY); // Box 0
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 513, 105, textureX, textureY); // Box 0
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 0
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 0
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Box 0
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 0
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 0
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 0
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 0
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 721, 153, textureX, textureY); // Box 0
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 0
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 537, 225, textureX, textureY); // Box 0
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 0
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 0
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 609, 225, textureX, textureY); // Box 0
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 729, 225, textureX, textureY); // Box 0
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 761, 225, textureX, textureY); // Box 0
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 793, 225, textureX, textureY); // Box 0
		leftBackWheelModel[25] = new ModelRendererTurbo(this, 825, 225, textureX, textureY); // Box 0
		leftBackWheelModel[26] = new ModelRendererTurbo(this, 857, 225, textureX, textureY); // Box 0
		leftBackWheelModel[27] = new ModelRendererTurbo(this, 889, 225, textureX, textureY); // Box 0

		leftBackWheelModel[0].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftBackWheelModel[0].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[1].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		leftBackWheelModel[1].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[2].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		leftBackWheelModel[2].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[3].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		leftBackWheelModel[3].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[4].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftBackWheelModel[4].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[5].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftBackWheelModel[5].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[6].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 0
		leftBackWheelModel[6].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[7].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftBackWheelModel[7].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[8].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftBackWheelModel[8].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[9].addShapeBox(-5.5F, 7.5F, 0F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftBackWheelModel[9].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[10].addShapeBox(7.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		leftBackWheelModel[10].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[11].addShapeBox(-5.5F, -13.5F, 0F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		leftBackWheelModel[11].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[12].addShapeBox(-13.5F, -5.5F, 0F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		leftBackWheelModel[12].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[13].addShapeBox(-7.5F, -7.5F, 1F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftBackWheelModel[13].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[14].addShapeBox(-3.5F, -1.5F, 6F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftBackWheelModel[14].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[15].addShapeBox(-3.5F, 1.5F, 6F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F); // Box 0
		leftBackWheelModel[15].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[16].addShapeBox(-3.5F, -3.5F, 6F, 7, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftBackWheelModel[16].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[17].addShapeBox(-1.5F, -1.5F, 6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftBackWheelModel[17].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[18].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 0
		leftBackWheelModel[18].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[19].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftBackWheelModel[19].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[20].addShapeBox(-1.5F, -1.5F, -0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		leftBackWheelModel[20].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[21].addShapeBox(6.5F, -14.5F, 0F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 0
		leftBackWheelModel[21].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[22].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 0
		leftBackWheelModel[22].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[23].addShapeBox(6.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 0
		leftBackWheelModel[23].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[24].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 0
		leftBackWheelModel[24].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[25].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 0
		leftBackWheelModel[25].setRotationPoint(5.5F, -1F, 28F);

		leftBackWheelModel[26].addShapeBox(-14.5F, 6.5F, 0F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 0
		leftBackWheelModel[26].setRotationPoint(-24F, -1F, 28F);

		leftBackWheelModel[27].addShapeBox(-14.5F, -14.5F, 0F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 0
		leftBackWheelModel[27].setRotationPoint(-24F, -1F, 28F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 0
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 0
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 0
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 0
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 0
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 0
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 529, 73, textureX, textureY); // Box 0
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 0
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 0
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 0
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 0
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 521, 169, textureX, textureY); // Box 0
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 0
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 0
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 0
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 0
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 865, 89, textureX, textureY); // Box 0
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 0
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 0
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 0
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 0
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 0
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 0
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 0
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 553, 177, textureX, textureY); // Box 0
		rightBackWheelModel[25] = new ModelRendererTurbo(this, 713, 177, textureX, textureY); // Box 0
		rightBackWheelModel[26] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 0
		rightBackWheelModel[27] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 0

		rightBackWheelModel[0].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[0].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[1].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		rightBackWheelModel[1].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[2].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		rightBackWheelModel[2].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[3].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[3].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[4].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[4].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[5].addShapeBox(-3.5F, -1.5F, -7F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[5].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[6].addShapeBox(-3.5F, 1.5F, -7F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		rightBackWheelModel[6].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[7].addShapeBox(-3.5F, -3.5F, -7F, 7, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[7].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[8].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[8].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[9].addShapeBox(-5.5F, 7.5F, -7F, 11, 6, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[9].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[10].addShapeBox(7.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 0
		rightBackWheelModel[10].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[11].addShapeBox(-5.5F, -13.5F, -7F, 11, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		rightBackWheelModel[11].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[12].addShapeBox(-13.5F, -5.5F, -7F, 6, 11, 7, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[12].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[13].addShapeBox(-7.5F, -7.5F, -6F, 15, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[13].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[14].addShapeBox(-3.5F, -1.5F, -7F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[14].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[15].addShapeBox(-3.5F, 1.5F, -7F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 0
		rightBackWheelModel[15].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[16].addShapeBox(-3.5F, -3.5F, -7F, 7, 2, 1, 0F,-2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[16].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[17].addShapeBox(-1.5F, -1.5F, -7.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[17].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[18].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 0
		rightBackWheelModel[18].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[19].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[19].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[20].addShapeBox(-1.5F, -1.5F, -1.5F, 3, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[20].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[21].addShapeBox(6.5F, -14.5F, -7F, 8, 8, 7, 0F,3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F); // Box 0
		rightBackWheelModel[21].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[22].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 0
		rightBackWheelModel[22].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[23].addShapeBox(6.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 3F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F); // Box 0
		rightBackWheelModel[23].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[24].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 0
		rightBackWheelModel[24].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[25].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 0
		rightBackWheelModel[25].setRotationPoint(5.5F, -1F, -28F);

		rightBackWheelModel[26].addShapeBox(-14.5F, 6.5F, -7F, 8, 8, 7, 0F,-1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, -9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F); // Box 0
		rightBackWheelModel[26].setRotationPoint(-24F, -1F, -28F);

		rightBackWheelModel[27].addShapeBox(-14.5F, -14.5F, -7F, 8, 8, 7, 0F,-9F, -1F, 0F, 3F, -7F, 0F, 3F, -7F, 0F, -9F, -1F, 0F, -1F, 1F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -1F, 1F, 0F); // Box 0
		rightBackWheelModel[27].setRotationPoint(-24F, -1F, -28F);
	}
}