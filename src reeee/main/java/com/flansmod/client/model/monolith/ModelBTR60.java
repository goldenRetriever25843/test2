//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.06.2016 - 00:45:46
// Last changed on: 12.06.2016 - 00:45:46

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBTR60 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBTR60() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[189];
		turretModel = new ModelRendererTurbo[8];
		barrelModel = new ModelRendererTurbo[9];
		leftFrontWheelModel = new ModelRendererTurbo[6];
		rightFrontWheelModel = new ModelRendererTurbo[6];
		leftBackWheelModel = new ModelRendererTurbo[18];
		rightBackWheelModel = new ModelRendererTurbo[18];

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
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 3
		bodyModel[5] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		bodyModel[10] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 5
		bodyModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 8
		bodyModel[13] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 9
		bodyModel[14] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 11
		bodyModel[15] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 3
		bodyModel[20] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 5
		bodyModel[21] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 7
		bodyModel[22] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 8
		bodyModel[26] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 9
		bodyModel[27] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		bodyModel[28] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 11
		bodyModel[29] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 12
		bodyModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 1
		bodyModel[32] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 3
		bodyModel[33] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 5
		bodyModel[35] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 7
		bodyModel[37] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 8
		bodyModel[38] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		bodyModel[39] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 10
		bodyModel[40] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 11
		bodyModel[41] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		bodyModel[42] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		bodyModel[43] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 14
		bodyModel[44] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 15
		bodyModel[45] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 16
		bodyModel[46] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 17
		bodyModel[47] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 18
		bodyModel[48] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 19
		bodyModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		bodyModel[50] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 21
		bodyModel[51] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 22
		bodyModel[52] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 23
		bodyModel[53] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 24
		bodyModel[54] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 26
		bodyModel[55] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 27
		bodyModel[56] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 28
		bodyModel[57] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 29
		bodyModel[58] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 31
		bodyModel[59] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 32
		bodyModel[60] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 33
		bodyModel[61] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[62] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 35
		bodyModel[63] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 37
		bodyModel[64] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 38
		bodyModel[65] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 39
		bodyModel[66] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 40
		bodyModel[67] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 41
		bodyModel[68] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 42
		bodyModel[69] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 43
		bodyModel[70] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 44
		bodyModel[71] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 46
		bodyModel[72] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 47
		bodyModel[73] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 48
		bodyModel[74] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 49
		bodyModel[75] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 50
		bodyModel[76] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 51
		bodyModel[77] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 3
		bodyModel[78] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 5
		bodyModel[79] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 6
		bodyModel[80] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 8
		bodyModel[81] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 9
		bodyModel[82] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 10
		bodyModel[83] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 11
		bodyModel[84] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 12
		bodyModel[85] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 13
		bodyModel[86] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 14
		bodyModel[87] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 15
		bodyModel[88] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 16
		bodyModel[89] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 17
		bodyModel[90] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 18
		bodyModel[91] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 19
		bodyModel[92] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 20
		bodyModel[93] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 21
		bodyModel[94] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 22
		bodyModel[95] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 23
		bodyModel[96] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 24
		bodyModel[97] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 25
		bodyModel[98] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 26
		bodyModel[99] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 27
		bodyModel[100] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 28
		bodyModel[101] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 29
		bodyModel[102] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 30
		bodyModel[103] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 31
		bodyModel[104] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 32
		bodyModel[105] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 33
		bodyModel[106] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 34
		bodyModel[107] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 1
		bodyModel[109] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 11
		bodyModel[110] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 12
		bodyModel[111] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 13
		bodyModel[112] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 14
		bodyModel[113] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 15
		bodyModel[114] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 16
		bodyModel[115] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 17
		bodyModel[116] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 18
		bodyModel[117] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 19
		bodyModel[118] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 20
		bodyModel[119] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 21
		bodyModel[120] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 22
		bodyModel[121] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 23
		bodyModel[122] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 25
		bodyModel[123] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 26
		bodyModel[124] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 31
		bodyModel[125] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 32
		bodyModel[126] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 33
		bodyModel[127] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 34
		bodyModel[128] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 35
		bodyModel[129] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 36
		bodyModel[130] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 37
		bodyModel[131] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 38
		bodyModel[132] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 39
		bodyModel[133] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 40
		bodyModel[134] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 42
		bodyModel[135] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 43
		bodyModel[136] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 44
		bodyModel[137] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 45
		bodyModel[138] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 47
		bodyModel[139] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 49
		bodyModel[140] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 52
		bodyModel[141] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 53
		bodyModel[142] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 54
		bodyModel[143] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 55
		bodyModel[144] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 57
		bodyModel[145] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 58
		bodyModel[146] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 59
		bodyModel[147] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 60
		bodyModel[148] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 61
		bodyModel[149] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 62
		bodyModel[150] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 63
		bodyModel[151] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 1
		bodyModel[153] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 2
		bodyModel[154] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 4
		bodyModel[155] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 5
		bodyModel[156] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 6
		bodyModel[157] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 7
		bodyModel[158] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 8
		bodyModel[159] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 9
		bodyModel[160] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 10
		bodyModel[161] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 11
		bodyModel[162] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 13
		bodyModel[163] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 14
		bodyModel[164] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 15
		bodyModel[165] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 16
		bodyModel[166] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 17
		bodyModel[167] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 18
		bodyModel[168] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 19
		bodyModel[169] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 20
		bodyModel[170] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 21
		bodyModel[171] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 25
		bodyModel[172] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 32
		bodyModel[173] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 33
		bodyModel[174] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 34
		bodyModel[175] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 35
		bodyModel[176] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 36
		bodyModel[177] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 37
		bodyModel[178] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 38
		bodyModel[179] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 39
		bodyModel[180] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 40
		bodyModel[181] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 46
		bodyModel[182] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 47
		bodyModel[183] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 48
		bodyModel[184] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 49
		bodyModel[185] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 50
		bodyModel[186] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 229
		bodyModel[187] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 292
		bodyModel[188] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 293

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, 1F, 0F, 1.2F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, 2.5F, 0F, 2.5F); // Box 0
		bodyModel[0].setRotationPoint(17.5F, -16.5F, 9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 25, 2, 22, 0F,0F, 0F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 0
		bodyModel[1].setRotationPoint(-40F, -16.5F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 7, 8, 22, 0F,0F, 0.7F, 0.3F, 0F, 3F, 0.3F, 0F, 3F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F); // Box 1
		bodyModel[2].setRotationPoint(-47F, -13.5F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 13, 3, 22, 0F,-1.5F, 0.5F, 0.3F, 0F, 5.7F, 0.3F, 0F, 5.7F, 0.3F, -1.5F, 0.5F, 0.3F, -1.5F, 0F, 1F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, -1.5F, 0F, 1F); // Box 2
		bodyModel[3].setRotationPoint(-60F, -8.5F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 31, 2, 22, 0F,0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 3
		bodyModel[4].setRotationPoint(-15F, -16.5F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[5].setRotationPoint(14.6F, -14.5F, -10.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 32, 9, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 4F, 0F, 5F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-15F, -14.5F, -12.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 25, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[7].setRotationPoint(-40F, -14.5F, -12.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 32, 9, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, 0F, 0F, 5F); // Box 2
		bodyModel[8].setRotationPoint(-15F, -14.5F, 10.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 25, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 3
		bodyModel[9].setRotationPoint(-40F, -14.5F, 10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,3.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -2F, 3.5F, 0F, 0F, 0F, 0F, 0F, 7.5F, 0F, -0.5F, 7.5F, 0F, -1.5F, 0F, 0F, 5F); // Box 5
		bodyModel[10].setRotationPoint(21F, -14.5F, 10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,3.5F, 0F, 0F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0.5F, 3.5F, 0F, 0.5F, 0F, 0F, 5F, 7.5F, 0F, -2.5F, 7.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 6
		bodyModel[11].setRotationPoint(21F, -14.5F, -12.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 7, 21, 0F,3.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 3.5F, 0F, -0.5F, 0F, 0F, 0F, 5.3F, 0F, 0F, 5.3F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 8
		bodyModel[12].setRotationPoint(21.05F, -14.5F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 3, 20, 0F,0F, 2F, 0.5F, -0.1F, 1F, -4F, -0.1F, 1F, -4F, 0F, 2F, 0.5F, 0F, 0.5F, 0F, -1F, -1.5F, -4F, -1F, -1.5F, -4F, 0F, 0.5F, 0F); // Box 9
		bodyModel[13].setRotationPoint(25.5F, -7F, -9.6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 1F, 2F, -3F, 6F, 0F, -0.2F, 6F, 0F, -0.2F, 6F, 2F, -3F, 6F); // Box 11
		bodyModel[14].setRotationPoint(34.45F, -5.9F, -4.6F);
		bodyModel[14].rotateAngleZ = -0.83775804F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 4, 0, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1.5F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 1.1F, 3.7F); // Box 17
		bodyModel[15].setRotationPoint(26.25F, -9F, 10.56F);
		bodyModel[15].rotateAngleX = 0.01745329F;
		bodyModel[15].rotateAngleY = -0.39269908F;
		bodyModel[15].rotateAngleZ = -0.09075712F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 4, 0, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 1F, 1F, 4F, 0F, -4F, 0F, 0F, -4F, 0F, 1F, 1.5F, 1F); // Box 21
		bodyModel[16].setRotationPoint(26.25F, -9F, -9.75F);
		bodyModel[16].rotateAngleY = 0.38397244F;
		bodyModel[16].rotateAngleZ = -0.08726646F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1.1F, 0F, 4.1F, 0.6F, 0F, -0.93F, 0F, 0F, 1F, 1.1F, 0F, 0F, -1.4F, 1.55F, 3F, 1F, 0.15F, 0F, 1F, 0.1F, 1F, -1.4F, 1.5F, 0F); // Box 23
		bodyModel[17].setRotationPoint(22.1F, -5.5F, -13.4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,0F, -4.8F, 11F, 0F, -0.15F, -0.9F, 0F, -0.15F, 0F, 0F, -4.8F, -5F, 0F, 3.5F, 5.3F, -0.9F, -6.5F, -0.9F, -1F, -6.5F, 0F, 0F, 3.5F, -6F); // Box 28
		bodyModel[18].setRotationPoint(24.35F, -7.95F, -5.55F);
		bodyModel[18].rotateAngleX = 0.01745329F;
		bodyModel[18].rotateAngleY = -0.08726646F;
		bodyModel[18].rotateAngleZ = 0.01745329F;

		bodyModel[19].addBox(0F, 0F, 0F, 3, 5, 21, 0F); // Box 3
		bodyModel[19].setRotationPoint(-57.5F, -2F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 9, 1, 0F,2F, -3.8F, -2F, 0F, -0.1F, 0F, 0F, -0.1F, -0.9F, 0F, -4.75F, 11F, 0F, 3.5F, -6F, -1F, -6.5F, 0F, -0.9F, -6.5F, -0.9F, 0F, 3.5F, 5.3F); // Box 5
		bodyModel[20].setRotationPoint(24.4F, -7.9F, 5.25F);
		bodyModel[20].rotateAngleX = -0.01745329F;
		bodyModel[20].rotateAngleY = 0.08726646F;
		bodyModel[20].rotateAngleZ = 0.01745329F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,2.1F, 0F, 0F, 0F, 0F, 1F, 0.6F, 0F, -0.93F, 1F, 0F, 3.3F, -0.4F, 1.5F, 0F, 1F, 0.1F, 1F, 1F, 0.15F, -0.1F, -1.4F, 1.55F, 3F); // Box 7
		bodyModel[21].setRotationPoint(22.1F, -5.5F, 13.1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 81, 9, 23, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(-57.5F, -6F, -11.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0F, -0.2F); // Box 1
		bodyModel[23].setRotationPoint(-49F, -5.5F, 16.1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 70, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[24].setRotationPoint(-49.05F, -5.5F, -18F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 8
		bodyModel[25].setRotationPoint(-57.65F, -5.5F, 12.2F);
		bodyModel[25].rotateAngleY = 0.50614548F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 3F, 1.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 3F, 1.5F, 0F, 0F); // Box 9
		bodyModel[26].setRotationPoint(-58.7F, -5.5F, -12.45F);
		bodyModel[26].rotateAngleY = -0.52359878F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 4, 23, 0F,0F, 0F, 0.4F, 0F, 0F, 2.1F, 0F, 0F, 2.3F, 0F, 0F, 0.7F, 0F, 0F, 0.4F, 0F, 0F, 2.1F, 0F, 0F, 2.3F, 0F, 0F, 0.7F); // Box 10
		bodyModel[27].setRotationPoint(-59.8F, -5.5F, -11.45F);

		bodyModel[28].addBox(0F, 0F, 0F, 82, 9, 2, 0F); // Box 11
		bodyModel[28].setRotationPoint(-57.5F, -6F, 9.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 12
		bodyModel[29].setRotationPoint(-60F, -6F, -3.45F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.2F); // Box 0
		bodyModel[30].setRotationPoint(22F, -4.5F, 16F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.8F); // Box 1
		bodyModel[31].setRotationPoint(22F, -4.5F, -18F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 11, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 3
		bodyModel[32].setRotationPoint(33.5F, -4F, -5F);
		bodyModel[32].rotateAngleZ = -0.82030475F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 4
		bodyModel[33].setRotationPoint(33.5F, -4F, -8F);
		bodyModel[33].rotateAngleZ = -0.82030475F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 5
		bodyModel[34].setRotationPoint(33.5F, -4F, 6F);
		bodyModel[34].rotateAngleZ = -0.82030475F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 6
		bodyModel[35].setRotationPoint(20F, -13F, 2.7F);
		bodyModel[35].rotateAngleZ = 0.83775804F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 7
		bodyModel[36].setRotationPoint(20F, -13F, -8.1F);
		bodyModel[36].rotateAngleZ = 0.83775804F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 8
		bodyModel[37].setRotationPoint(19.9F, -13.2F, 2.3F);
		bodyModel[37].rotateAngleZ = 0.83775804F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 9
		bodyModel[38].setRotationPoint(19.9F, -13.2F, 6.8F);
		bodyModel[38].rotateAngleZ = 0.83775804F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 10
		bodyModel[39].setRotationPoint(19.9F, -13.2F, -3.1F);
		bodyModel[39].rotateAngleZ = 0.83775804F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 11
		bodyModel[40].setRotationPoint(19.9F, -13.2F, -7.1F);
		bodyModel[40].rotateAngleZ = 0.83775804F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.45F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.45F, -0.15F, 0F, 0.1F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, 0.1F, -0.15F); // Box 12
		bodyModel[41].setRotationPoint(20F, -13.2F, -2.1F);
		bodyModel[41].rotateAngleZ = 0.83775804F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.45F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.45F, -0.15F, 0F, 0.1F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, 0.1F, -0.15F); // Box 13
		bodyModel[42].setRotationPoint(20F, -13.2F, 1.3F);
		bodyModel[42].rotateAngleZ = 0.83775804F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 3, 11, 0F,0F, -0.55F, 0.5F, -0.1F, -0.55F, -4.5F, -0.1F, -0.55F, -4.5F, 0F, -0.55F, 0.5F, 0F, -0.55F, 0F, -0.85F, -0.55F, -4.5F, -0.85F, -0.55F, -4.5F, 0F, -0.55F, 0F); // Box 14
		bodyModel[43].setRotationPoint(25.55F, -8.2F, -6.6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,1F, 0F, 1.2F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 2.5F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0F, 1F, 0F, 0F); // Box 15
		bodyModel[44].setRotationPoint(17.5F, -16.5F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,1F, 0F, 1.2F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 3F, -0.25F, 0F, -0.65F, -0.25F, 0F, 0F, 1F, 0F, 0F); // Box 16
		bodyModel[45].setRotationPoint(17.5F, -16.5F, 2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, 1F, 0F, 1.2F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, 3F, 0F, 2.2F); // Box 17
		bodyModel[46].setRotationPoint(17.5F, -16.5F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 18
		bodyModel[47].setRotationPoint(18.3F, -15.6F, 5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 19
		bodyModel[48].setRotationPoint(17.7F, -15.6F, 9.35F);
		bodyModel[48].rotateAngleY = 0.9424778F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 20
		bodyModel[49].setRotationPoint(17.55F, -15.6F, -2.7F);
		bodyModel[49].rotateAngleY = 1.01229097F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 21
		bodyModel[50].setRotationPoint(16.3F, -15.6F, 1.65F);
		bodyModel[50].rotateAngleY = -0.9250245F;
		bodyModel[50].rotateAngleZ = 0.01745329F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 22
		bodyModel[51].setRotationPoint(16.3F, -15.6F, -10.35F);
		bodyModel[51].rotateAngleY = -0.9250245F;
		bodyModel[51].rotateAngleZ = 0.01745329F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F); // Box 23
		bodyModel[52].setRotationPoint(17.55F, -16.6F, -7.48F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, -0.15F, -0.5F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.5F, 0F, -0.65F, -0.5F, 0F, -0.65F, -0.25F, 0F, -0.15F); // Box 24
		bodyModel[53].setRotationPoint(19.2F, -16.6F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, -0.65F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.65F); // Box 26
		bodyModel[54].setRotationPoint(16.4F, -16.6F, -7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0.05F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.05F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0.05F); // Box 27
		bodyModel[55].setRotationPoint(18.2F, -16.6F, -7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, -0.1F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, -0.1F); // Box 28
		bodyModel[56].setRotationPoint(16.9F, -16.6F, -7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, -0.1F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.65F, -0.25F, 0F, -0.1F); // Box 29
		bodyModel[57].setRotationPoint(18.7F, -16.6F, -7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F); // Box 31
		bodyModel[58].setRotationPoint(11.85F, -16.65F, -10.48F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.25F, 0F, 0.07F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.07F, -0.25F, 0F, 0.07F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.07F); // Box 32
		bodyModel[59].setRotationPoint(14.5F, -16.65F, -10.48F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.1F, 0F, -0.93F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.93F, -0.1F, 0F, -0.93F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.93F); // Box 33
		bodyModel[60].setRotationPoint(10.25F, -16.65F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, -1F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.3F, 0F, -1F); // Box 34
		bodyModel[61].setRotationPoint(9.45F, -16.65F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.1F, 0F, -0.5F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, -0.5F); // Box 35
		bodyModel[62].setRotationPoint(11.05F, -16.65F, -10.48F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.25F, 0F, 0.07F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.07F, -0.25F, 0F, 0.07F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.07F); // Box 37
		bodyModel[63].setRotationPoint(14.5F, -16.65F, 2.52F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F); // Box 38
		bodyModel[64].setRotationPoint(11.85F, -16.65F, 2.52F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.1F, 0F, -0.5F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.1F, 0F, -0.5F); // Box 39
		bodyModel[65].setRotationPoint(11.05F, -16.65F, 2.52F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.1F, 0F, -0.93F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.93F, -0.1F, 0F, -0.93F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.93F); // Box 40
		bodyModel[66].setRotationPoint(10.25F, -16.65F, 3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, 0F, -1F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.1F, 0F, 0.07F, -0.1F, 0F, 0.07F, -0.3F, 0F, -1F); // Box 41
		bodyModel[67].setRotationPoint(9.45F, -16.65F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 42
		bodyModel[68].setRotationPoint(17.2F, -17.5F, -6.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.1F, -0.05F, -0.35F, -0.1F, -0.05F, -0.35F, -0.1F, -0.05F, -0.35F, -0.1F, -0.05F, -0.35F, -0.1F, -0.05F, -0.35F, -0.1F, -0.05F, -0.35F, -0.1F, -0.05F, -0.35F, -0.1F, -0.05F); // Box 43
		bodyModel[69].setRotationPoint(18.32F, -17.1F, -6.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F); // Box 44
		bodyModel[70].setRotationPoint(19.5F, -14.1F, 10.6F);
		bodyModel[70].rotateAngleY = 0.80285146F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F); // Box 46
		bodyModel[71].setRotationPoint(18.25F, -14F, -11.9F);
		bodyModel[71].rotateAngleY = -0.80285146F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.1F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F); // Box 47
		bodyModel[72].setRotationPoint(15F, -14.05F, -12.5F);
		bodyModel[72].rotateAngleY = -1.57079633F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F, 0F, -0.05F, 0.05F); // Box 48
		bodyModel[73].setRotationPoint(15F, -14.05F, 13.5F);
		bodyModel[73].rotateAngleY = -1.57079633F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 2, 9, 0F,0F, -0.5F, 0.5F, -0.1F, -0.5F, -4F, -0.1F, -0.5F, -4F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.9F, -0.5F, -4F, -0.9F, -0.5F, -4F, 0F, -0.5F, 0F); // Box 49
		bodyModel[74].setRotationPoint(24.9F, -6.2F, -5.6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[75].setRotationPoint(31.5F, -8.3F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 51
		bodyModel[76].setRotationPoint(30.8F, -8.4F, -3F);
		bodyModel[76].rotateAngleZ = 0.12217305F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 3
		bodyModel[77].setRotationPoint(-1F, -13.5F, -13.5F);
		bodyModel[77].rotateAngleX = 0.38397244F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 5
		bodyModel[78].setRotationPoint(-17F, -13.5F, 11F);
		bodyModel[78].rotateAngleX = 0.52359878F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 6
		bodyModel[79].setRotationPoint(14.6F, -9F, 15F);
		bodyModel[79].rotateAngleX = 0.52359878F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 8
		bodyModel[80].setRotationPoint(0.5F, -9F, 15F);
		bodyModel[80].rotateAngleX = 0.52359878F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 9
		bodyModel[81].setRotationPoint(-6.5F, -9F, 15F);
		bodyModel[81].rotateAngleX = 0.52359878F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.2F, -0.3F, -1.6F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 10
		bodyModel[82].setRotationPoint(7.5F, -9F, 15F);
		bodyModel[82].rotateAngleX = 0.52359878F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.3F, -0.3F, -1.6F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 11
		bodyModel[83].setRotationPoint(-6.5F, -9F, 15F);
		bodyModel[83].rotateAngleX = 0.52359878F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 12
		bodyModel[84].setRotationPoint(7.4F, -9F, 15F);
		bodyModel[84].rotateAngleX = 0.52359878F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 13
		bodyModel[85].setRotationPoint(15.5F, -10F, -16.5F);
		bodyModel[85].rotateAngleX = -0.52359878F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 14
		bodyModel[86].setRotationPoint(8.5F, -10F, -16.5F);
		bodyModel[86].rotateAngleX = -0.52359878F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.3F, -0.3F, -1.6F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 15
		bodyModel[87].setRotationPoint(8.5F, -10.75F, -17.8F);
		bodyModel[87].rotateAngleX = -0.52359878F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 16
		bodyModel[88].setRotationPoint(8.5F, -16F, -13F);
		bodyModel[88].rotateAngleX = -0.52359878F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, -0.15F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 17
		bodyModel[89].setRotationPoint(13.5F, -16F, -13F);
		bodyModel[89].rotateAngleX = -0.52359878F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.3F, -0.3F, -1.6F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 18
		bodyModel[90].setRotationPoint(8.5F, -16.75F, -14.3F);
		bodyModel[90].rotateAngleX = -0.52359878F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 19
		bodyModel[91].setRotationPoint(6.5F, -13F, -14F);
		bodyModel[91].rotateAngleX = -0.52359878F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 20
		bodyModel[92].setRotationPoint(6.5F, -9.5F, -16F);
		bodyModel[92].rotateAngleX = -0.52359878F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 21
		bodyModel[93].setRotationPoint(-7.5F, -16F, -13F);
		bodyModel[93].rotateAngleX = -0.52359878F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,-0.3F, -0.3F, -1.5F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 22
		bodyModel[94].setRotationPoint(-13.5F, -16.75F, -14.3F);
		bodyModel[94].rotateAngleX = -0.52359878F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 23
		bodyModel[95].setRotationPoint(-13.5F, -16F, -13F);
		bodyModel[95].rotateAngleX = -0.52359878F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 24
		bodyModel[96].setRotationPoint(-14.5F, -10F, -16.5F);
		bodyModel[96].rotateAngleX = -0.52359878F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,-0.3F, -0.3F, -1.5F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 25
		bodyModel[97].setRotationPoint(-14.5F, -10.75F, -17.8F);
		bodyModel[97].rotateAngleX = -0.52359878F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 26
		bodyModel[98].setRotationPoint(-6.5F, -10F, -16.5F);
		bodyModel[98].rotateAngleX = -0.52359878F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 27
		bodyModel[99].setRotationPoint(-28.5F, -10F, -16.5F);
		bodyModel[99].rotateAngleX = -0.52359878F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.3F, -0.3F, -1.5F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, -1.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 28
		bodyModel[100].setRotationPoint(-35.5F, -10.75F, -17.8F);
		bodyModel[100].rotateAngleX = -0.52359878F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 29
		bodyModel[101].setRotationPoint(-35.5F, -10F, -16.5F);
		bodyModel[101].rotateAngleX = -0.52359878F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 30
		bodyModel[102].setRotationPoint(-42F, -13.6F, -12.75F);
		bodyModel[102].rotateAngleX = 0.38397244F;
		bodyModel[102].rotateAngleY = -0.12217305F;
		bodyModel[102].rotateAngleZ = 0.05235988F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 31
		bodyModel[103].setRotationPoint(-42F, -13.5F, 11F);
		bodyModel[103].rotateAngleX = 0.50614548F;
		bodyModel[103].rotateAngleY = 0.03490659F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.2F, -0.3F, -1.6F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 32
		bodyModel[104].setRotationPoint(8.5F, -14.9F, 11.25F);
		bodyModel[104].rotateAngleX = 0.52359878F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 33
		bodyModel[105].setRotationPoint(13.6F, -14.9F, 11.25F);
		bodyModel[105].rotateAngleX = 0.52359878F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 34
		bodyModel[106].setRotationPoint(8.4F, -14.9F, 11.25F);
		bodyModel[106].rotateAngleX = 0.52359878F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 0
		bodyModel[107].setRotationPoint(-9.5F, -11.8F, 12.2F);
		bodyModel[107].rotateAngleX = 0.52359878F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 1
		bodyModel[108].setRotationPoint(-9.5F, -8.5F, 14F);
		bodyModel[108].rotateAngleX = 0.52359878F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[109].setRotationPoint(-38.6F, -10.6F, 12.8F);
		bodyModel[109].rotateAngleX = 0.52359878F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 12
		bodyModel[110].setRotationPoint(-38.6F, -11.6F, -14.5F);
		bodyModel[110].rotateAngleX = -0.52359878F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 13
		bodyModel[111].setRotationPoint(6.5F, -13F, -14F);
		bodyModel[111].rotateAngleX = -0.52359878F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 14
		bodyModel[112].setRotationPoint(-42.5F, -13F, -13.3F);
		bodyModel[112].rotateAngleX = -0.52359878F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 15
		bodyModel[113].setRotationPoint(-42.5F, -9.5F, -15.4F);
		bodyModel[113].rotateAngleX = -0.52359878F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 16
		bodyModel[114].setRotationPoint(-42.5F, -9F, 13.6F);
		bodyModel[114].rotateAngleX = 0.52359878F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 17
		bodyModel[115].setRotationPoint(-42.5F, -11.9F, 12F);
		bodyModel[115].rotateAngleX = 0.52359878F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 18
		bodyModel[116].setRotationPoint(-27.5F, -9F, 15F);
		bodyModel[116].rotateAngleX = 0.52359878F;

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,-0.3F, -0.3F, -1.6F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, -1.6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 19
		bodyModel[117].setRotationPoint(-34.5F, -9F, 15F);
		bodyModel[117].rotateAngleX = 0.52359878F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 20
		bodyModel[118].setRotationPoint(-34.5F, -9F, 15F);
		bodyModel[118].rotateAngleX = 0.52359878F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.2F, -0.3F, -1.6F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, -1.6F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 21
		bodyModel[119].setRotationPoint(-24.5F, -14.9F, 11.25F);
		bodyModel[119].rotateAngleX = 0.52359878F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 22
		bodyModel[120].setRotationPoint(-24.6F, -14.9F, 11.25F);
		bodyModel[120].rotateAngleX = 0.52359878F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 23
		bodyModel[121].setRotationPoint(-19.4F, -14.9F, 11.25F);
		bodyModel[121].rotateAngleX = 0.52359878F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 25
		bodyModel[122].setRotationPoint(-42.55F, -16.35F, 5.55F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 26
		bodyModel[123].setRotationPoint(-42.5F, -16.35F, -9.45F);

		bodyModel[124].addShapeBox(0F, 0F, -1F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[124].setRotationPoint(-55F, -8.8F, 13F);
		bodyModel[124].rotateAngleX = 0.36651914F;
		bodyModel[124].rotateAngleY = 0.12217305F;
		bodyModel[124].rotateAngleZ = 0.41887902F;

		bodyModel[125].addShapeBox(0F, 0F, -1F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[125].setRotationPoint(-55.6F, -8.8F, -12.8F);
		bodyModel[125].rotateAngleX = -0.45378561F;
		bodyModel[125].rotateAngleY = -0.08726646F;
		bodyModel[125].rotateAngleZ = 0.41887902F;

		bodyModel[126].addShapeBox(0F, 0F, -1F, 9, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 33
		bodyModel[126].setRotationPoint(-49.5F, -9.65F, 13.9F);
		bodyModel[126].rotateAngleX = 0.6981317F;
		bodyModel[126].rotateAngleY = -0.40142573F;
		bodyModel[126].rotateAngleZ = 0.59341195F;

		bodyModel[127].addShapeBox(0F, 0F, -1F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.4F, 0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.26F, -0.5F, 0.35F); // Box 34
		bodyModel[127].setRotationPoint(-42.5F, -14.32F, 4.9F);
		bodyModel[127].rotateAngleX = 0.6981317F;
		bodyModel[127].rotateAngleY = -0.68067841F;
		bodyModel[127].rotateAngleZ = 1.57079633F;

		bodyModel[128].addShapeBox(0F, 0F, -1F, 2, 1, 11, 0F,0F, 0.4F, 0.25F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.26F, -0.5F, 0.35F, 0F, 0F, -0.4F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 35
		bodyModel[128].setRotationPoint(-42.5F, -14.32F, -11.1F);
		bodyModel[128].rotateAngleX = 0.6981317F;
		bodyModel[128].rotateAngleY = -0.68067841F;
		bodyModel[128].rotateAngleZ = 1.57079633F;

		bodyModel[129].addShapeBox(0F, 0F, -1F, 9, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0.13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.35F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[129].setRotationPoint(-49.95F, -10.3F, -13.5F);
		bodyModel[129].rotateAngleX = -0.71558499F;
		bodyModel[129].rotateAngleY = 0.31066861F;
		bodyModel[129].rotateAngleZ = 0.50614548F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.15F, -0.3F, 0.4F, -0.15F, -0.3F, 0.4F, -0.15F, -0.3F, 0.4F, -0.15F, -0.3F, 0.4F, 0.15F, -0.3F, 0.4F, 0.15F, -0.3F, 0.4F, 0.15F, -0.3F, 0.4F, 0.15F, -0.3F, 0.4F); // Box 37
		bodyModel[130].setRotationPoint(-42.5F, -17.05F, -9.45F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.15F, -0.3F, 0.4F, -0.15F, -0.3F, 0.4F, -0.15F, -0.3F, 0.4F, -0.15F, -0.3F, 0.4F, 0.15F, -0.3F, 0.4F, 0.15F, -0.3F, 0.4F, 0.15F, -0.3F, 0.4F, 0.15F, -0.3F, 0.4F); // Box 38
		bodyModel[131].setRotationPoint(-42.5F, -17.05F, 5.55F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 39
		bodyModel[132].setRotationPoint(-54.15F, -7.5F, 12.9F);
		bodyModel[132].rotateAngleX = 0.36651914F;
		bodyModel[132].rotateAngleY = 0.50614548F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 40
		bodyModel[133].setRotationPoint(-55.2F, -8.4F, -13.6F);
		bodyModel[133].rotateAngleX = -0.20943951F;
		bodyModel[133].rotateAngleY = -0.55850536F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0.15F, -1.4F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, -1.4F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 42
		bodyModel[134].setRotationPoint(-51.5F, -13.9F, -7.45F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0.15F, -1.4F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, -1.4F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 43
		bodyModel[135].setRotationPoint(-51.5F, -13.9F, 1.55F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0.15F, -1.4F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, -1.4F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 44
		bodyModel[136].setRotationPoint(-56.5F, -11.8F, 1.55F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0.15F, -1.4F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, -1.4F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 45
		bodyModel[137].setRotationPoint(-56.5F, -11.8F, -7.45F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 47
		bodyModel[138].setRotationPoint(-18.5F, -16.7F, -9.45F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 49
		bodyModel[139].setRotationPoint(-33.5F, -16.7F, 1.55F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.15F, 0.2F, 0.4F, -0.85F, 0.2F, 0.4F, -0.85F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, -0.85F, 0.2F, 0.4F, -0.85F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F); // Box 52
		bodyModel[140].setRotationPoint(-56.51F, -11.2F, 1.55F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.15F, 0.2F, -0.3F, 0.15F, 0.5F, 0.2F, 0.15F, 0.5F, -0.7F, 0.15F, 0.2F, -0.3F, 0.15F, 0.2F, -0.3F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, -0.7F, 0.15F, 0.2F, -0.3F); // Box 53
		bodyModel[141].setRotationPoint(-56.51F, -11.2F, 0.85F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.15F, 0.2F, -0.3F, 0.15F, 0.5F, -0.7F, 0.15F, 0.5F, 0.2F, 0.15F, 0.2F, -0.3F, 0.15F, 0.2F, -0.3F, 0.15F, 0.2F, -0.7F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, -0.3F); // Box 54
		bodyModel[142].setRotationPoint(-56.51F, -11.2F, 8.3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.15F, 0.2F, -0.3F, 0.15F, 0.5F, -0.7F, 0.15F, 0.5F, 0.2F, 0.15F, 0.2F, -0.3F, 0.15F, 0.2F, -0.3F, 0.15F, 0.2F, -0.7F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, -0.3F); // Box 55
		bodyModel[143].setRotationPoint(-56.51F, -11.2F, -1.65F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0.15F, 0.2F, 0.4F, -0.85F, 0.2F, 0.4F, -0.85F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, -0.85F, 0.2F, 0.4F, -0.85F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F); // Box 57
		bodyModel[144].setRotationPoint(-56.51F, -11.2F, -8.45F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 21, 0F,0.15F, 0F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 58
		bodyModel[145].setRotationPoint(-39.4F, -16.9F, -10.45F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 4, 21, 0F,0.15F, 0.2F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0.2F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 59
		bodyModel[146].setRotationPoint(-36.5F, -16.9F, -10.45F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 21, 0F,0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F); // Box 60
		bodyModel[147].setRotationPoint(-37.95F, -16.9F, -10.45F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F); // Box 61
		bodyModel[148].setRotationPoint(-37.95F, -17F, -9.45F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.3F, 0.2F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F); // Box 62
		bodyModel[149].setRotationPoint(-36.35F, -17F, -9.45F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F); // Box 63
		bodyModel[150].setRotationPoint(-39.55F, -17F, -9.45F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.15F, 0.2F, -0.3F, 0.15F, 0.5F, 0.2F, 0.15F, 0.5F, -0.7F, 0.15F, 0.2F, -0.3F, 0.15F, 0.2F, -0.3F, 0.15F, 0.2F, 0.2F, 0.15F, 0.2F, -0.7F, 0.15F, 0.2F, -0.3F); // Box 0
		bodyModel[151].setRotationPoint(-56.51F, -11.2F, -9.15F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 1
		bodyModel[152].setRotationPoint(-56.51F, -12.2F, -8.65F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 2
		bodyModel[153].setRotationPoint(-56.51F, -12.2F, -0.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 4
		bodyModel[154].setRotationPoint(-56.51F, -12.2F, 7.6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -2.3F, 0.2F, -0.3F, 1.7F, 0.2F, -0.3F, 1.7F, 0.2F, -0.3F, -2.3F, 0.2F, -0.3F); // Box 5
		bodyModel[155].setRotationPoint(-47.46F, -15.22F, -0.35F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -2.3F, 0.2F, -0.3F, 1.7F, 0.2F, -0.3F, 1.7F, 0.2F, -0.3F, -2.3F, 0.2F, -0.3F); // Box 6
		bodyModel[156].setRotationPoint(-47.51F, -15.2F, 7.7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -2.3F, 0.2F, -0.3F, 1.7F, 0.2F, -0.3F, 1.7F, 0.2F, -0.3F, -2.3F, 0.2F, -0.3F); // Box 7
		bodyModel[157].setRotationPoint(-47.51F, -15.2F, -8.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.3F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F); // Box 8
		bodyModel[158].setRotationPoint(-56.51F, -12.6F, -0.51F);
		bodyModel[158].rotateAngleY = 0.01745329F;
		bodyModel[158].rotateAngleZ = 0.32288591F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.3F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F); // Box 9
		bodyModel[159].setRotationPoint(-56.55F, -12.6F, 7.55F);
		bodyModel[159].rotateAngleY = 0.01745329F;
		bodyModel[159].rotateAngleZ = 0.32288591F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.3F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.25F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F); // Box 10
		bodyModel[160].setRotationPoint(-56.51F, -12.6F, -8.65F);
		bodyModel[160].rotateAngleY = 0.01745329F;
		bodyModel[160].rotateAngleZ = 0.32288591F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,-0.3F, -0.3F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F); // Box 11
		bodyModel[161].setRotationPoint(-56.5F, -12.7F, -8.65F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,-0.3F, -0.3F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.3F, -0.35F); // Box 13
		bodyModel[162].setRotationPoint(-52F, -14.2F, -8.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,-0.3F, -0.3F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.2F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F); // Box 14
		bodyModel[163].setRotationPoint(-47.7F, -15.6F, -8.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 15
		bodyModel[164].setRotationPoint(-45.5F, -16.35F, 9.55F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 16
		bodyModel[165].setRotationPoint(-45.5F, -16.35F, -9.45F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F); // Box 17
		bodyModel[166].setRotationPoint(-45.8F, -16.8F, -9.95F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F); // Box 18
		bodyModel[167].setRotationPoint(-45.8F, -16.8F, 9.05F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F); // Box 19
		bodyModel[168].setRotationPoint(-45.9F, -16.8F, 9.05F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F); // Box 20
		bodyModel[169].setRotationPoint(-45.9F, -16.8F, -9.95F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 21
		bodyModel[170].setRotationPoint(24.49F, -8.2F, 12.6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 25
		bodyModel[171].setRotationPoint(24.49F, -9.2F, -12.4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F); // Box 32
		bodyModel[172].setRotationPoint(23.9F, -11.05F, 11.6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F); // Box 33
		bodyModel[173].setRotationPoint(23.9F, -11.6F, 11.6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F); // Box 34
		bodyModel[174].setRotationPoint(23.9F, -10.5F, 11.6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F); // Box 35
		bodyModel[175].setRotationPoint(24.9F, -8.6F, 12.6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F); // Box 36
		bodyModel[176].setRotationPoint(24.9F, -9.15F, 12.6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F); // Box 37
		bodyModel[177].setRotationPoint(24.9F, -9.7F, 12.6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F); // Box 38
		bodyModel[178].setRotationPoint(24.9F, -9.8F, -12.4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F); // Box 39
		bodyModel[179].setRotationPoint(24.9F, -9.25F, -12.4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F); // Box 40
		bodyModel[180].setRotationPoint(24.9F, -8.7F, -12.4F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 46
		bodyModel[181].setRotationPoint(23.49F, -10.2F, -11.4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F); // Box 47
		bodyModel[182].setRotationPoint(23.9F, -11.8F, -11.4F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F); // Box 48
		bodyModel[183].setRotationPoint(23.9F, -11.25F, -11.4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.15F, 0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F, 0.1F, -0.3F, -0.2F); // Box 49
		bodyModel[184].setRotationPoint(23.9F, -10.7F, -11.4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 50
		bodyModel[185].setRotationPoint(23.49F, -10.2F, 11.6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 12, 4, 8, 0F,0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F, 0.15F, 0F, 0.4F); // Box 229
		bodyModel[186].setRotationPoint(-33.5F, -16.7F, -9.45F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 292
		bodyModel[187].setRotationPoint(-60F, -8F, -3.45F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.6F); // Box 293
		bodyModel[188].setRotationPoint(-60F, -2F, -3.45F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 0
		turretModel[1] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 211
		turretModel[2] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 216
		turretModel[3] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 217
		turretModel[4] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 218
		turretModel[5] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 219
		turretModel[6] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 220
		turretModel[7] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 221

		turretModel[0].addShapeBox(22.3F, 0F, -3.58F, 2, 1, 5, 0F,3F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0.55F, 0F, -0.05F, 0.55F, 0F, 0.1F, 0F, 0F, 0F); // Box 0
		turretModel[0].setRotationPoint(-15.5F, -17F, 1F);

		turretModel[1].addShapeBox(13.5F, 0F, -7F, 4, 5, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 3.5F, 1F, 0F, 3.5F, 1F, 0F, 3.5F, 1F, 0F, 3.5F); // Box 211
		turretModel[1].setRotationPoint(-15.5F, -21.5F, 1F);

		turretModel[2].addShapeBox(13.5F, 0F, -7F, 3, 5, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, -1F, 0F, 3.5F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, -1F, 0F, 3.5F); // Box 216
		turretModel[2].setRotationPoint(-11.5F, -21.5F, 1F);

		turretModel[3].addShapeBox(13.5F, 0F, -7F, 3, 5, 12, 0F,0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 2F, 0F, 0.5F, -1F, 0F, 3.5F, -1F, 0F, 3.5F, 2F, 0F, 0.5F); // Box 217
		turretModel[3].setRotationPoint(-18.5F, -21.5F, 1F);

		turretModel[4].addShapeBox(8.5F, 0F, -5F, 2, 5, 8, 0F,-1F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -1F, -0.5F, -2F, 2F, 0F, 0.5F, -2F, 0F, 2.5F, -2F, 0F, 2.5F, 2F, 0F, 0.5F); // Box 218
		turretModel[4].setRotationPoint(-15.5F, -21.5F, 1F);

		turretModel[5].addShapeBox(20.5F, 0F, -5F, 2, 5, 4, 0F,0F, -0.5F, -1F, -1F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, -2F, 0F, 2.5F, 2F, 0F, 0.5F, 2F, 0F, -2F, -2F, 0F, -2F); // Box 219
		turretModel[5].setRotationPoint(-15.5F, -21.5F, 1F);

		turretModel[6].addShapeBox(20.5F, 0F, -1F, 2, 5, 4, 0F,0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, -0.5F, -1F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0.5F, -2F, 0F, 2.5F); // Box 220
		turretModel[6].setRotationPoint(-15.5F, -21.5F, 1F);

		turretModel[7].addShapeBox(20.63F, 0F, -3F, 1, 1, 4, 0F,1F, 0F, 0F, -0.15F, 0F, 0F, -0.14F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.1F, 0.55F, 0F, 0.1F, 0.55F, 0F, 0.1F, 1F, 0F, 0F); // Box 221
		turretModel[7].setRotationPoint(-15.5F, -21F, 1F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Import 
		barrelModel[1] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Import 
		barrelModel[2] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Import 
		barrelModel[3] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Import 
		barrelModel[4] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Import 
		barrelModel[5] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import 
		barrelModel[6] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 226
		barrelModel[7] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 227
		barrelModel[8] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 228

		barrelModel[0].addShapeBox(13F, -0.7F, -1.1F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Import 
		barrelModel[0].setRotationPoint(5F, -18.6F, 1F);

		barrelModel[1].addShapeBox(8F, -0.7F, -1.1F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import 
		barrelModel[1].setRotationPoint(5F, -18.6F, 1F);

		barrelModel[2].addShapeBox(11.75F, -0.7F, -1.1F, 2, 1, 1, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Import 
		barrelModel[2].setRotationPoint(5F, -18.6F, 1F);

		barrelModel[3].addShapeBox(0.25F, -1.7F, -2.1F, 14, 3, 3, 0F,0F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, 0F, -1.2F, -1.2F); // Import 
		barrelModel[3].setRotationPoint(5F, -18.6F, 1F);

		barrelModel[4].addShapeBox(0F, -0.5F, -1.1F, 8, 1, 1, 0F,0F, -0.1F, 0.5F, -0.75F, -0.1F, 0F, -0.75F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F); // Import 
		barrelModel[4].setRotationPoint(5F, -18.6F, 1F);

		barrelModel[5].addShapeBox(1F, -0.5F, -2.55F, 4, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Import 
		barrelModel[5].setRotationPoint(5F, -18.5F, 1F);

		barrelModel[6].addShapeBox(5F, -0.5F, -2.55F, 1, 1, 1, 0F,0.5F, -0.3F, -0.3F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.3F, -0.3F); // Box 226
		barrelModel[6].setRotationPoint(5F, -18.5F, 1F);

		barrelModel[7].addShapeBox(2F, -0.7F, -1.1F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 227
		barrelModel[7].setRotationPoint(5F, -18.6F, 1F);

		barrelModel[8].addShapeBox(5F, -0.7F, -1.1F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 228
		barrelModel[8].setRotationPoint(5F, -18.6F, 1F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 231
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 232
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 233
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 250
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 251
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 252

		leftFrontWheelModel[0].addBox(-6.5F, -2.5F, -2.5F, 13, 5, 5, 0F); // Box 231
		leftFrontWheelModel[0].setRotationPoint(14F, 3.5F, 14.5F);

		leftFrontWheelModel[1].addShapeBox(-6.5F, -6.5F, -2.5F, 13, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftFrontWheelModel[1].setRotationPoint(14F, 3.5F, 14.5F);

		leftFrontWheelModel[2].addShapeBox(-6.5F, 2.5F, -2.5F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 233
		leftFrontWheelModel[2].setRotationPoint(14F, 3.5F, 14.5F);

		leftFrontWheelModel[3].addShapeBox(-5F, -3.5F, -2.3F, 10, 2, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 250
		leftFrontWheelModel[3].setRotationPoint(14F, 3.5F, 14.5F);

		leftFrontWheelModel[4].addBox(-3.5F, -1.5F, -2.3F, 7, 3, 5, 0F); // Box 251
		leftFrontWheelModel[4].setRotationPoint(14F, 3.5F, 14.5F);

		leftFrontWheelModel[5].addShapeBox(-5F, 1.5F, -2.3F, 10, 2, 5, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 252
		leftFrontWheelModel[5].setRotationPoint(14F, 3.5F, 14.5F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 273
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 274
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 275
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 276
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 277
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 278

		rightFrontWheelModel[0].addBox(-6.5F, -2.5F, -2.5F, 13, 5, 5, 0F); // Box 273
		rightFrontWheelModel[0].setRotationPoint(14F, 3.5F, -14.5F);

		rightFrontWheelModel[1].addShapeBox(-6.5F, -6.5F, -2.5F, 13, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		rightFrontWheelModel[1].setRotationPoint(14F, 3.5F, -14.5F);

		rightFrontWheelModel[2].addShapeBox(-6.5F, 2.5F, -2.5F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 275
		rightFrontWheelModel[2].setRotationPoint(14F, 3.5F, -14.5F);

		rightFrontWheelModel[3].addShapeBox(-5F, -3.5F, -2.8F, 10, 2, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 276
		rightFrontWheelModel[3].setRotationPoint(14F, 3.5F, -14.5F);

		rightFrontWheelModel[4].addBox(-3.5F, -1.5F, -2.8F, 7, 3, 5, 0F); // Box 277
		rightFrontWheelModel[4].setRotationPoint(14F, 3.5F, -14.5F);

		rightFrontWheelModel[5].addShapeBox(-5F, 1.5F, -2.8F, 10, 2, 5, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 278
		rightFrontWheelModel[5].setRotationPoint(14F, 3.5F, -14.5F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 254
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 255
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 256
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 257
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 258
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 259
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 261
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 262
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 263
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 264
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 265
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 266
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 267
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 268
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 269
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 270
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 271
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 272

		leftBackWheelModel[0].addShapeBox(-6.5F, 2.5F, -2.5F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 254
		leftBackWheelModel[0].setRotationPoint(-3F, 3.5F, 14.5F);

		leftBackWheelModel[1].addShapeBox(-5F, 1.5F, -2.3F, 10, 2, 5, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 255
		leftBackWheelModel[1].setRotationPoint(-3F, 3.5F, 14.5F);

		leftBackWheelModel[2].addBox(-3.5F, -1.5F, -2.3F, 7, 3, 5, 0F); // Box 256
		leftBackWheelModel[2].setRotationPoint(-3F, 3.5F, 14.5F);

		leftBackWheelModel[3].addBox(-6.5F, -2.5F, -2.5F, 13, 5, 5, 0F); // Box 257
		leftBackWheelModel[3].setRotationPoint(-3F, 3.5F, 14.5F);

		leftBackWheelModel[4].addShapeBox(-5F, -3.5F, -2.3F, 10, 2, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 258
		leftBackWheelModel[4].setRotationPoint(-3F, 3.5F, 14.5F);

		leftBackWheelModel[5].addShapeBox(-6.5F, -6.5F, -2.5F, 13, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		leftBackWheelModel[5].setRotationPoint(-3F, 3.5F, 14.5F);

		leftBackWheelModel[6].addShapeBox(-6.5F, 2.5F, -2.5F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 261
		leftBackWheelModel[6].setRotationPoint(-23F, 3.5F, 14.5F);

		leftBackWheelModel[7].addShapeBox(-5F, 1.5F, -2.3F, 10, 2, 5, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 262
		leftBackWheelModel[7].setRotationPoint(-23F, 3.5F, 14.5F);

		leftBackWheelModel[8].addBox(-3.5F, -1.5F, -2.3F, 7, 3, 5, 0F); // Box 263
		leftBackWheelModel[8].setRotationPoint(-23F, 3.5F, 14.5F);

		leftBackWheelModel[9].addShapeBox(-5F, -3.5F, -2.3F, 10, 2, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 264
		leftBackWheelModel[9].setRotationPoint(-23F, 3.5F, 14.5F);

		leftBackWheelModel[10].addShapeBox(-6.5F, -6.5F, -2.5F, 13, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		leftBackWheelModel[10].setRotationPoint(-23F, 3.5F, 14.5F);

		leftBackWheelModel[11].addBox(-6.5F, -2.5F, -2.5F, 13, 5, 5, 0F); // Box 266
		leftBackWheelModel[11].setRotationPoint(-23F, 3.5F, 14.5F);

		leftBackWheelModel[12].addShapeBox(-6.5F, 2.5F, -2.5F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 267
		leftBackWheelModel[12].setRotationPoint(-40F, 3.5F, 14.5F);

		leftBackWheelModel[13].addShapeBox(-5F, 1.5F, -2.3F, 10, 2, 5, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 268
		leftBackWheelModel[13].setRotationPoint(-40F, 3.5F, 14.5F);

		leftBackWheelModel[14].addBox(-3.5F, -1.5F, -2.3F, 7, 3, 5, 0F); // Box 269
		leftBackWheelModel[14].setRotationPoint(-40F, 3.5F, 14.5F);

		leftBackWheelModel[15].addShapeBox(-5F, -3.5F, -2.3F, 10, 2, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 270
		leftBackWheelModel[15].setRotationPoint(-40F, 3.5F, 14.5F);

		leftBackWheelModel[16].addShapeBox(-6.5F, -6.5F, -2.5F, 13, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		leftBackWheelModel[16].setRotationPoint(-40F, 3.5F, 14.5F);

		leftBackWheelModel[17].addBox(-6.5F, -2.5F, -2.5F, 13, 5, 5, 0F); // Box 272
		leftBackWheelModel[17].setRotationPoint(-40F, 3.5F, 14.5F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 279
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 280
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 281
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 282
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 283
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 284
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 285
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 286
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 287
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 288
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 289
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 290
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 291
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 292
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 293
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 294
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 295
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 296

		rightBackWheelModel[0].addShapeBox(-6.5F, 2.5F, -2.5F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 279
		rightBackWheelModel[0].setRotationPoint(-3F, 3.5F, -14.5F);

		rightBackWheelModel[1].addShapeBox(-5F, 1.5F, -2.8F, 10, 2, 5, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 280
		rightBackWheelModel[1].setRotationPoint(-3F, 3.5F, -14.5F);

		rightBackWheelModel[2].addBox(-3.5F, -1.5F, -2.8F, 7, 3, 5, 0F); // Box 281
		rightBackWheelModel[2].setRotationPoint(-3F, 3.5F, -14.5F);

		rightBackWheelModel[3].addShapeBox(-5F, -3.5F, -2.8F, 10, 2, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 282
		rightBackWheelModel[3].setRotationPoint(-3F, 3.5F, -14.5F);

		rightBackWheelModel[4].addBox(-6.5F, -2.5F, -2.5F, 13, 5, 5, 0F); // Box 283
		rightBackWheelModel[4].setRotationPoint(-3F, 3.5F, -14.5F);

		rightBackWheelModel[5].addShapeBox(-6.5F, -6.5F, -2.5F, 13, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		rightBackWheelModel[5].setRotationPoint(-3F, 3.5F, -14.5F);

		rightBackWheelModel[6].addShapeBox(-6.5F, 2.5F, -2.5F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 285
		rightBackWheelModel[6].setRotationPoint(-23F, 3.5F, -14.5F);

		rightBackWheelModel[7].addShapeBox(-5F, 1.5F, -2.8F, 10, 2, 5, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 286
		rightBackWheelModel[7].setRotationPoint(-23F, 3.5F, -14.5F);

		rightBackWheelModel[8].addBox(-3.5F, -1.5F, -2.8F, 7, 3, 5, 0F); // Box 287
		rightBackWheelModel[8].setRotationPoint(-23F, 3.5F, -14.5F);

		rightBackWheelModel[9].addShapeBox(-5F, -3.5F, -2.8F, 10, 2, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 288
		rightBackWheelModel[9].setRotationPoint(-23F, 3.5F, -14.5F);

		rightBackWheelModel[10].addBox(-6.5F, -2.5F, -2.5F, 13, 5, 5, 0F); // Box 289
		rightBackWheelModel[10].setRotationPoint(-23F, 3.5F, -14.5F);

		rightBackWheelModel[11].addShapeBox(-6.5F, -6.5F, -2.5F, 13, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		rightBackWheelModel[11].setRotationPoint(-23F, 3.5F, -14.5F);

		rightBackWheelModel[12].addShapeBox(-6.5F, 2.5F, -2.5F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 291
		rightBackWheelModel[12].setRotationPoint(-40F, 3.5F, -14.5F);

		rightBackWheelModel[13].addShapeBox(-5F, 1.5F, -2.8F, 10, 2, 5, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 292
		rightBackWheelModel[13].setRotationPoint(-40F, 3.5F, -14.5F);

		rightBackWheelModel[14].addBox(-3.5F, -1.5F, -2.8F, 7, 3, 5, 0F); // Box 293
		rightBackWheelModel[14].setRotationPoint(-40F, 3.5F, -14.5F);

		rightBackWheelModel[15].addShapeBox(-5F, -3.5F, -2.8F, 10, 2, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 294
		rightBackWheelModel[15].setRotationPoint(-40F, 3.5F, -14.5F);

		rightBackWheelModel[16].addBox(-6.5F, -2.5F, -2.5F, 13, 5, 5, 0F); // Box 295
		rightBackWheelModel[16].setRotationPoint(-40F, 3.5F, -14.5F);

		rightBackWheelModel[17].addShapeBox(-6.5F, -6.5F, -2.5F, 13, 4, 5, 0F,-4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		rightBackWheelModel[17].setRotationPoint(-40F, 3.5F, -14.5F);
	}
}