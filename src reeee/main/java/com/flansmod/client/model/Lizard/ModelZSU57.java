//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.07.2016 - 17:35:05
// Last changed on: 05.07.2016 - 17:35:05

package com.flansmod.client.model.Lizard; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZSU57 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelZSU57() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[339];
		turretModel = new ModelRendererTurbo[69];
		barrelModel = new ModelRendererTurbo[20];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 19
		bodyModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		bodyModel[27] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 36
		bodyModel[28] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 37
		bodyModel[29] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 3
		bodyModel[41] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 6
		bodyModel[42] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 8
		bodyModel[43] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 9
		bodyModel[44] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 10
		bodyModel[45] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 12
		bodyModel[46] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 13
		bodyModel[47] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 14
		bodyModel[48] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 16
		bodyModel[49] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 17
		bodyModel[50] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 18
		bodyModel[51] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 19
		bodyModel[52] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 21
		bodyModel[53] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 22
		bodyModel[54] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 23
		bodyModel[55] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 24
		bodyModel[56] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 25
		bodyModel[57] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 26
		bodyModel[58] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 27
		bodyModel[59] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 29
		bodyModel[60] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 30
		bodyModel[61] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 31
		bodyModel[62] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 33
		bodyModel[63] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 34
		bodyModel[64] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 35
		bodyModel[65] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 36
		bodyModel[66] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 37
		bodyModel[67] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 38
		bodyModel[68] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 39
		bodyModel[69] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 40
		bodyModel[70] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 41
		bodyModel[71] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 42
		bodyModel[72] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 43
		bodyModel[73] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 44
		bodyModel[74] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 45
		bodyModel[75] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 46
		bodyModel[76] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 47
		bodyModel[77] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 48
		bodyModel[78] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 49
		bodyModel[79] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 50
		bodyModel[80] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 51
		bodyModel[81] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 52
		bodyModel[82] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 53
		bodyModel[83] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 54
		bodyModel[84] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 55
		bodyModel[85] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 58
		bodyModel[86] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 59
		bodyModel[87] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 60
		bodyModel[88] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 61
		bodyModel[89] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 62
		bodyModel[90] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 63
		bodyModel[91] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 64
		bodyModel[92] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 65
		bodyModel[93] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 66
		bodyModel[94] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 67
		bodyModel[95] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 68
		bodyModel[96] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 69
		bodyModel[97] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 70
		bodyModel[98] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 71
		bodyModel[99] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 72
		bodyModel[100] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 73
		bodyModel[101] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 74
		bodyModel[102] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 75
		bodyModel[103] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 77
		bodyModel[104] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 78
		bodyModel[105] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 79
		bodyModel[106] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 81
		bodyModel[107] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 82
		bodyModel[108] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 83
		bodyModel[109] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Box 85
		bodyModel[110] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 86
		bodyModel[111] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 87
		bodyModel[112] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 88
		bodyModel[113] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 89
		bodyModel[114] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 90
		bodyModel[115] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 1
		bodyModel[117] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 2
		bodyModel[118] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 3
		bodyModel[119] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 4
		bodyModel[120] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 5
		bodyModel[121] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 6
		bodyModel[122] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 8
		bodyModel[123] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 9
		bodyModel[124] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 10
		bodyModel[125] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 12
		bodyModel[126] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 13
		bodyModel[127] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 14
		bodyModel[128] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 15
		bodyModel[129] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 16
		bodyModel[130] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 17
		bodyModel[131] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 18
		bodyModel[132] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 19
		bodyModel[133] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 20
		bodyModel[134] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 21
		bodyModel[135] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 22
		bodyModel[136] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24
		bodyModel[137] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 25
		bodyModel[138] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		bodyModel[139] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 27
		bodyModel[140] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 28
		bodyModel[141] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 29
		bodyModel[142] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 30
		bodyModel[143] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 31
		bodyModel[144] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 32
		bodyModel[145] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 33
		bodyModel[146] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 34
		bodyModel[147] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 35
		bodyModel[148] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 36
		bodyModel[149] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 37
		bodyModel[150] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 39
		bodyModel[151] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 40
		bodyModel[152] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 41
		bodyModel[153] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 42
		bodyModel[154] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 43
		bodyModel[155] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 44
		bodyModel[156] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 45
		bodyModel[157] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 46
		bodyModel[158] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 1
		bodyModel[160] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 2
		bodyModel[161] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 3
		bodyModel[162] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 4
		bodyModel[163] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 7
		bodyModel[164] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 8
		bodyModel[165] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 10
		bodyModel[166] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 11
		bodyModel[167] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 12
		bodyModel[168] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 13
		bodyModel[169] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 14
		bodyModel[170] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 15
		bodyModel[171] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 16
		bodyModel[172] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 17
		bodyModel[173] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 18
		bodyModel[174] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 19
		bodyModel[175] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 20
		bodyModel[176] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 21
		bodyModel[177] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 22
		bodyModel[178] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 23
		bodyModel[179] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 24
		bodyModel[180] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 25
		bodyModel[181] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 26
		bodyModel[182] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 27
		bodyModel[183] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 28
		bodyModel[184] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 29
		bodyModel[185] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 30
		bodyModel[186] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 31
		bodyModel[187] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 32
		bodyModel[188] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 15
		bodyModel[189] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 16
		bodyModel[190] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 17
		bodyModel[191] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 18
		bodyModel[192] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 20
		bodyModel[193] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 21
		bodyModel[194] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 22
		bodyModel[195] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 23
		bodyModel[196] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 24
		bodyModel[197] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 0
		bodyModel[198] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 3
		bodyModel[199] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 4
		bodyModel[200] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 5
		bodyModel[201] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Box 6
		bodyModel[202] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 7
		bodyModel[203] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 8
		bodyModel[204] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 24
		bodyModel[205] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 28
		bodyModel[206] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 29
		bodyModel[207] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 31
		bodyModel[208] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 50
		bodyModel[209] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 51
		bodyModel[210] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 53
		bodyModel[211] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 54
		bodyModel[212] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 55
		bodyModel[213] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 56
		bodyModel[214] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 57
		bodyModel[215] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 58
		bodyModel[216] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 59
		bodyModel[217] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 60
		bodyModel[218] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 61
		bodyModel[219] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 62
		bodyModel[220] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 63
		bodyModel[221] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 64
		bodyModel[222] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 65
		bodyModel[223] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 66
		bodyModel[224] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 67
		bodyModel[225] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 68
		bodyModel[226] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 69
		bodyModel[227] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 70
		bodyModel[228] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 71
		bodyModel[229] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 72
		bodyModel[230] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 73
		bodyModel[231] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 74
		bodyModel[232] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 75
		bodyModel[233] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 76
		bodyModel[234] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 77
		bodyModel[235] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 78
		bodyModel[236] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 79
		bodyModel[237] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 80
		bodyModel[238] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 81
		bodyModel[239] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 82
		bodyModel[240] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 83
		bodyModel[241] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 84
		bodyModel[242] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 85
		bodyModel[243] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 86
		bodyModel[244] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 87
		bodyModel[245] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 88
		bodyModel[246] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 89
		bodyModel[247] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 90
		bodyModel[248] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 91
		bodyModel[249] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 92
		bodyModel[250] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 93
		bodyModel[251] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 94
		bodyModel[252] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 95
		bodyModel[253] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 96
		bodyModel[254] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 97
		bodyModel[255] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 98
		bodyModel[256] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 99
		bodyModel[257] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 100
		bodyModel[258] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 101
		bodyModel[259] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 102
		bodyModel[260] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 103
		bodyModel[261] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 104
		bodyModel[262] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 105
		bodyModel[263] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 106
		bodyModel[264] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 107
		bodyModel[265] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 108
		bodyModel[266] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 109
		bodyModel[267] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 111
		bodyModel[268] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 112
		bodyModel[269] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 113
		bodyModel[270] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 114
		bodyModel[271] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 115
		bodyModel[272] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 116
		bodyModel[273] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 117
		bodyModel[274] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 118
		bodyModel[275] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 119
		bodyModel[276] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 138
		bodyModel[277] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 139
		bodyModel[278] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 140
		bodyModel[279] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 141
		bodyModel[280] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 142
		bodyModel[281] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 143
		bodyModel[282] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 144
		bodyModel[283] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 145
		bodyModel[284] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 147
		bodyModel[285] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 148
		bodyModel[286] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 149
		bodyModel[287] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 150
		bodyModel[288] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 151
		bodyModel[289] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 152
		bodyModel[290] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 0
		bodyModel[291] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 451
		bodyModel[292] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 9
		bodyModel[293] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 11
		bodyModel[294] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 12
		bodyModel[295] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 13
		bodyModel[296] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 14
		bodyModel[297] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 15
		bodyModel[298] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 16
		bodyModel[299] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 17
		bodyModel[300] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 18
		bodyModel[301] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 19
		bodyModel[302] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 20
		bodyModel[303] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 21
		bodyModel[304] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 22
		bodyModel[305] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 24
		bodyModel[306] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 25
		bodyModel[307] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 26
		bodyModel[308] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 27
		bodyModel[309] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 28
		bodyModel[310] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 29
		bodyModel[311] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 30
		bodyModel[312] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 31
		bodyModel[313] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 32
		bodyModel[314] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 33
		bodyModel[315] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 34
		bodyModel[316] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 35
		bodyModel[317] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 36
		bodyModel[318] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 38
		bodyModel[319] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 40
		bodyModel[320] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 41
		bodyModel[321] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 42
		bodyModel[322] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 43
		bodyModel[323] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 44
		bodyModel[324] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 45
		bodyModel[325] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 46
		bodyModel[326] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 47
		bodyModel[327] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 48
		bodyModel[328] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 49
		bodyModel[329] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Box 50
		bodyModel[330] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 51
		bodyModel[331] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 120
		bodyModel[332] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 121
		bodyModel[333] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 122
		bodyModel[334] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 123
		bodyModel[335] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 124
		bodyModel[336] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 125
		bodyModel[337] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 126
		bodyModel[338] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 127

		bodyModel[0].addShapeBox(0F, 0F, 0F, 17, 1, 32, 0F,0.3F, 11.45F, 0.1F, 0F, 0.03F, 0.1F, 0F, 0.03F, -0.35F, 0.3F, 11.45F, -0.35F, 1F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, -0.35F, 1F, 0F, -0.35F); // Box 0
		bodyModel[0].setRotationPoint(31.7F, -2.3F, -16.2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 61, 18, 32, 0F,0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F); // Box 1
		bodyModel[1].setRotationPoint(-29.6F, -13.75F, -16.15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 32, 0F,18F, 0F, 0.1F, 0F, 0.02F, 0.1F, 0F, 0.02F, -0.35F, 18F, 0F, -0.35F, 16.3F, 0.15F, 0.1F, -8F, -0.15F, 0.1F, -8F, -0.15F, -0.35F, 16.3F, 0.15F, -0.35F); // Box 6
		bodyModel[2].setRotationPoint(47.7F, -2.3F, -16.2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 12, 32, 0F,2.6F, -0.25F, 0.1F, -0.35F, -0.25F, 0.1F, -0.35F, -0.25F, -0.4F, 2.6F, -0.25F, -0.4F, 0F, 0.05F, 0.1F, -0.35F, 0.05F, 0.1F, -0.35F, 0.05F, -0.4F, 0F, 0.05F, -0.4F); // Box 7
		bodyModel[3].setRotationPoint(-47.3F, -12F, -16.15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 4, 32, 0F,2.6F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -0.4F, 2.6F, -0.25F, -0.4F, -4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 8
		bodyModel[4].setRotationPoint(-44.7F, -0.2F, -16.15F);

		bodyModel[5].addShapeBox(1F, 0F, 0F, 18, 2, 32, 0F,-0.6F, -0.25F, 0.1F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, -0.4F, -0.6F, -0.25F, -0.4F, 1.9F, -0.49F, 0.1F, 0.25F, -0.49F, 0.1F, 0.25F, -0.49F, -0.4F, 1.9F, -0.49F, -0.4F); // Box 10
		bodyModel[5].setRotationPoint(-49F, -13.27F, -16.15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 86, 1, 11, 0F,0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-43.1F, -10F, -27.1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 86, 1, 11, 0F,0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F); // Box 12
		bodyModel[7].setRotationPoint(-43.1F, -10.01F, 15.15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.5F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.5F, -0.12F, 0F, 0.4F, -0.12F, 0F, 0.2F, -0.12F, 0F, 0.2F, -0.12F, 0F, 0.4F, -0.12F, 0F); // Box 14
		bodyModel[8].setRotationPoint(-45.3F, -9.5F, -27.1F);
		bodyModel[8].rotateAngleZ = 0.2268928F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-47.6F, -8.3F, -27.1F);
		bodyModel[9].rotateAngleZ = 0.54105207F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.1F, -0.16F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, 0.1F, -0.16F, 0F, -0.1F, -0.08F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.08F, 0F); // Box 16
		bodyModel[10].setRotationPoint(-49.2F, -7.1F, -27.1F);
		bodyModel[10].rotateAngleZ = 0.64577182F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-50.5F, -5.45F, -27.1F);
		bodyModel[11].rotateAngleZ = 0.89011792F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0F, -0.12F, 0F, -0.3F, -0.12F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, -0.3F, -0.12F, 0F); // Box 18
		bodyModel[12].setRotationPoint(-51.45F, -3.6F, -27.1F);
		bodyModel[12].rotateAngleZ = 1.09955743F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.5F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.5F, -0.12F, 0F, 0.4F, -0.12F, 0F, 0.2F, -0.12F, 0F, 0.2F, -0.12F, 0F, 0.4F, -0.12F, 0F); // Box 19
		bodyModel[13].setRotationPoint(-45.3F, -9.5F, 15.15F);
		bodyModel[13].rotateAngleZ = 0.2268928F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F); // Box 20
		bodyModel[14].setRotationPoint(-47.6F, -8.3F, 15.15F);
		bodyModel[14].rotateAngleZ = 0.54105207F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.1F, -0.16F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, 0.1F, -0.16F, 0F, -0.1F, -0.08F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.08F, 0F); // Box 21
		bodyModel[15].setRotationPoint(-49.2F, -7.1F, 15.15F);
		bodyModel[15].rotateAngleZ = 0.64577182F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F, 0F, -0.12F, 0F); // Box 23
		bodyModel[16].setRotationPoint(-50.5F, -5.45F, 15.15F);
		bodyModel[16].rotateAngleZ = 0.89011792F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0.1F, -0.12F, 0F, 0F, -0.12F, 0F, -0.3F, -0.12F, 0F, -0.1F, -0.12F, 0F, -0.1F, -0.12F, 0F, -0.3F, -0.12F, 0F); // Box 24
		bodyModel[17].setRotationPoint(-51.45F, -3.6F, 15.15F);
		bodyModel[17].rotateAngleZ = 1.09955743F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F); // Box 25
		bodyModel[18].setRotationPoint(43.15F, -9.97F, 15.15F);
		bodyModel[18].rotateAngleZ = -0.15707963F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F); // Box 26
		bodyModel[19].setRotationPoint(45.63F, -9.52F, -27.1F);
		bodyModel[19].rotateAngleZ = -0.38397244F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.25F, -0.12F, 0F, 0.4F, -0.12F, 0F, 0.4F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F); // Box 27
		bodyModel[20].setRotationPoint(47.93F, -8.47F, 15.15F);
		bodyModel[20].rotateAngleZ = -0.80285146F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.25F, -0.12F, 0F, 0.8F, -0.12F, 0F, 0.8F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.5F, -0.12F, 0F, 0.5F, -0.12F, 0F, 0.25F, -0.12F, 0F); // Box 28
		bodyModel[21].setRotationPoint(49.73F, -6.47F, 15.15F);
		bodyModel[21].rotateAngleZ = -1.15191731F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.25F, -0.12F, 0F, 0.8F, -0.12F, 0F, 0.8F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.5F, -0.12F, 0F, 0.5F, -0.12F, 0F, 0.25F, -0.12F, 0F); // Box 29
		bodyModel[22].setRotationPoint(49.73F, -6.47F, -27.1F);
		bodyModel[22].rotateAngleZ = -1.15191731F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.25F, -0.12F, 0F, 0.4F, -0.12F, 0F, 0.4F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F); // Box 30
		bodyModel[23].setRotationPoint(47.93F, -8.47F, -27.1F);
		bodyModel[23].rotateAngleZ = -0.80285146F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F); // Box 31
		bodyModel[24].setRotationPoint(45.63F, -9.52F, 15.15F);
		bodyModel[24].rotateAngleZ = -0.40142573F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 11, 0F,0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F, 0.25F, -0.12F, 0F); // Box 32
		bodyModel[25].setRotationPoint(43.15F, -9.97F, -27.1F);
		bodyModel[25].rotateAngleZ = -0.15707963F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.25F, -0.12F, -0.1F, 0.8F, -0.12F, -0.1F, 0.8F, -0.3F, -0.1F, 0.2F, -0.31F, -0.1F, -1.75F, 0.88F, -0.1F, 1F, -0.12F, -0.1F, 1F, -0.12F, -0.1F, -1.75F, 0.88F, -0.1F); // Box 35
		bodyModel[26].setRotationPoint(49.73F, -6.47F, -16.2F);
		bodyModel[26].rotateAngleZ = -1.15191731F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.15F, -0.06F, -0.1F, 0.8F, -0.12F, -0.1F, 0.8F, -0.3F, -0.1F, -0.15F, -0.3F, -0.1F, -1.75F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, -1.75F, -0.12F, -0.1F); // Box 36
		bodyModel[27].setRotationPoint(47.61F, -8.7F, -16.2F);
		bodyModel[27].rotateAngleZ = -0.78539816F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.15F, -0.18F, -0.1F, 0.85F, -0.1F, -0.1F, 0.8F, -0.32F, -0.1F, -0.15F, -0.5F, -0.1F, -1.75F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, -1.75F, -0.12F, -0.1F); // Box 37
		bodyModel[28].setRotationPoint(45.1F, -9.8F, -16.2F);
		bodyModel[28].rotateAngleZ = -0.41887902F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.55F, -0.3F, -0.1F, 0.85F, -0.1F, -0.1F, 0.8F, -0.4F, -0.1F, -0.55F, -0.5F, -0.1F, -1.75F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, -1.75F, -0.12F, -0.1F); // Box 39
		bodyModel[29].setRotationPoint(42.4F, -10.3F, -16.2F);
		bodyModel[29].rotateAngleZ = -0.2268928F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.55F, -0.3F, -0.1F, 0.6F, 0.18F, -0.1F, 0.6F, -0.04F, -0.1F, -0.6F, -0.45F, -0.1F, -1.75F, -0.12F, -0.1F, 1.9F, -0.3F, -0.1F, 1.9F, -0.3F, -0.1F, -1.75F, -0.12F, -0.1F); // Box 41
		bodyModel[30].setRotationPoint(40.3F, -10.3F, -16.2F);
		bodyModel[30].rotateAngleZ = -0.2268928F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0.17F, -0.1F, 0F, 0.17F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 42
		bodyModel[31].setRotationPoint(36.8F, -9.7F, -16.2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.2F, -0.31F, -0.1F, 0.8F, -0.3F, -0.1F, 0.8F, -0.12F, -0.1F, 0.25F, -0.12F, -0.1F, -1.75F, 0.88F, -0.1F, 1F, -0.12F, -0.1F, 1F, -0.12F, -0.1F, -1.75F, 0.88F, -0.1F); // Box 43
		bodyModel[32].setRotationPoint(49.73F, -6.47F, 14.25F);
		bodyModel[32].rotateAngleZ = -1.15191731F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.15F, -0.3F, -0.1F, 0.8F, -0.3F, -0.1F, 0.8F, -0.12F, -0.1F, -0.15F, -0.06F, -0.1F, -1.75F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, -1.75F, -0.12F, -0.1F); // Box 45
		bodyModel[33].setRotationPoint(47.61F, -8.7F, 14.25F);
		bodyModel[33].rotateAngleZ = -0.78539816F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.15F, -0.5F, -0.1F, 0.8F, -0.32F, -0.1F, 0.85F, -0.1F, -0.1F, -0.15F, -0.18F, -0.1F, -1.75F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, -1.75F, -0.12F, -0.1F); // Box 46
		bodyModel[34].setRotationPoint(45.1F, -9.8F, 14.25F);
		bodyModel[34].rotateAngleZ = -0.41887902F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.55F, -0.5F, -0.1F, 0.8F, -0.4F, -0.1F, 0.85F, -0.1F, -0.1F, -0.55F, -0.3F, -0.1F, -1.75F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, 1.5F, -0.12F, -0.1F, -1.75F, -0.12F, -0.1F); // Box 47
		bodyModel[35].setRotationPoint(42.4F, -10.3F, 14.25F);
		bodyModel[35].rotateAngleZ = -0.2268928F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.6F, -0.45F, -0.1F, 0.6F, -0.04F, -0.1F, 0.6F, 0.18F, -0.1F, -0.55F, -0.3F, -0.1F, -1.75F, -0.12F, -0.1F, 1.9F, -0.3F, -0.1F, 1.9F, -0.3F, -0.1F, -1.75F, -0.12F, -0.1F); // Box 48
		bodyModel[36].setRotationPoint(40.3F, -10.3F, 14.25F);
		bodyModel[36].rotateAngleZ = -0.2268928F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.17F, -0.1F, 0F, 0.17F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 49
		bodyModel[37].setRotationPoint(36.8F, -9.7F, 14.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 0
		bodyModel[38].setRotationPoint(5.5F, 0.5F, -25F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 2
		bodyModel[39].setRotationPoint(5.5F, 4.5F, -25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 3
		bodyModel[40].setRotationPoint(5.5F, -4F, -25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 6
		bodyModel[41].setRotationPoint(23.5F, 0.5F, -25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 8
		bodyModel[42].setRotationPoint(-17.3F, 0.5F, -25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 9
		bodyModel[43].setRotationPoint(-36.5F, 0.5F, -25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 10
		bodyModel[44].setRotationPoint(23.5F, -4F, -25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 12
		bodyModel[45].setRotationPoint(-17.3F, -4F, -25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 13
		bodyModel[46].setRotationPoint(-36.5F, -4F, -25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 14
		bodyModel[47].setRotationPoint(23.5F, 4.5F, -25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 16
		bodyModel[48].setRotationPoint(-17.3F, 4.5F, -25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 17
		bodyModel[49].setRotationPoint(-36.5F, 4.5F, -25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 18
		bodyModel[50].setRotationPoint(-16.5F, -5.5F, -26.3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0.2F, 1F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, -1.4F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -1.4F, 0.2F); // Box 19
		bodyModel[51].setRotationPoint(-39.9F, -5.5F, -26.3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 31, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 21
		bodyModel[52].setRotationPoint(11.9F, -5.5F, -26.3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 61, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 22
		bodyModel[53].setRotationPoint(-31.4F, 8.9F, -26.3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F); // Box 23
		bodyModel[54].setRotationPoint(-42.3F, -6.7F, -26.3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.6F, -0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, -0.1F, 0.2F, 0.4F, -0.3F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 24
		bodyModel[55].setRotationPoint(-44.7F, -6.7F, -26.3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 25
		bodyModel[56].setRotationPoint(-46.9F, -5.75F, -26.3F);
		bodyModel[56].rotateAngleZ = 0.36651914F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.6F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.6F, -0.2F, 0.2F); // Box 26
		bodyModel[57].setRotationPoint(-48.1F, -3.55F, -26.3F);
		bodyModel[57].rotateAngleZ = 0.95993109F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 27
		bodyModel[58].setRotationPoint(-48.45F, -0.71F, -26.3F);
		bodyModel[58].rotateAngleZ = 1.3962634F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 29
		bodyModel[59].setRotationPoint(-47.68F, 1.4F, -26.3F);
		bodyModel[59].rotateAngleZ = 1.74532925F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 30
		bodyModel[60].setRotationPoint(-46.09F, 3.02F, -26.3F);
		bodyModel[60].rotateAngleZ = 2.18166156F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0.4F, 4F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.4F, 4F, 0.2F, 0.4F, -4.4F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.4F, -4.4F, 0.2F); // Box 31
		bodyModel[61].setRotationPoint(-45.9F, 6.32F, -26.3F);
		bodyModel[61].rotateAngleZ = -0.12217305F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, -0.35F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.35F, 0.2F, -0.1F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.1F, 0F, 0.2F); // Box 33
		bodyModel[62].setRotationPoint(-36F, 7.35F, -26.3F);
		bodyModel[62].rotateAngleZ = -0.33161256F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 34
		bodyModel[63].setRotationPoint(29.65F, 8.9F, -26.3F);
		bodyModel[63].rotateAngleZ = 0.2443461F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 35
		bodyModel[64].setRotationPoint(32.75F, 8.1F, -26.3F);
		bodyModel[64].rotateAngleZ = 0.50614548F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 36
		bodyModel[65].setRotationPoint(43F, -7.1F, -26.3F);
		bodyModel[65].rotateAngleZ = -0.10471976F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 37
		bodyModel[66].setRotationPoint(45F, -6.6F, -26.3F);
		bodyModel[66].rotateAngleZ = -0.4712389F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.5F, -0.15F, 0.2F, 0.5F, -0.15F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 38
		bodyModel[67].setRotationPoint(46.57F, -5.5F, -26.3F);
		bodyModel[67].rotateAngleZ = -0.90757121F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.5F, -0.1F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.5F, -0.2F, 0.2F); // Box 39
		bodyModel[68].setRotationPoint(47.1F, -1.4F, -26.3F);
		bodyModel[68].rotateAngleZ = 1.34390352F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.5F, -0.15F, 0.2F, 0.5F, -0.15F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 40
		bodyModel[69].setRotationPoint(46.57F, -5.5F, -26.3F);
		bodyModel[69].rotateAngleZ = -0.90757121F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, 0.2F, 0.2F, 0.4F, -0.15F, 0.2F, 0.4F, -0.15F, 0.2F, 0.2F, 0.2F, 0.2F, 0.3F, -0.6F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.3F, -0.6F, 0.2F); // Box 41
		bodyModel[70].setRotationPoint(45.85F, 1.2F, -26.3F);
		bodyModel[70].rotateAngleZ = 1.08210414F;

		bodyModel[71].addShapeBox(-3F, 0F, 0F, 9, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 42
		bodyModel[71].setRotationPoint(-44F, -3.5F, -25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,-2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 43
		bodyModel[72].setRotationPoint(-47F, -5.5F, -25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F); // Box 44
		bodyModel[73].setRotationPoint(-47F, 0.5F, -25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,-2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 45
		bodyModel[74].setRotationPoint(37.8F, -6F, -25F);

		bodyModel[75].addShapeBox(-3F, 0F, 0F, 9, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 46
		bodyModel[75].setRotationPoint(40.8F, -4F, -25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F); // Box 47
		bodyModel[76].setRotationPoint(37.8F, 0F, -25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 15, 1, 9, 0F,0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 48
		bodyModel[77].setRotationPoint(32.75F, 8.1F, 16.7F);
		bodyModel[77].rotateAngleZ = 0.50614548F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, 0.2F, 0.2F, 0.4F, -0.15F, 0.2F, 0.4F, -0.15F, 0.2F, 0.2F, 0.2F, 0.2F, 0.3F, -0.6F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.3F, -0.6F, 0.2F); // Box 49
		bodyModel[78].setRotationPoint(45.85F, 1.2F, 16.7F);
		bodyModel[78].rotateAngleZ = 1.08210414F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.5F, -0.1F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.5F, -0.1F, 0.2F, 0.5F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.5F, -0.2F, 0.2F); // Box 50
		bodyModel[79].setRotationPoint(47.1F, -1.4F, 16.7F);
		bodyModel[79].rotateAngleZ = 1.34390352F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.5F, -0.15F, 0.2F, 0.5F, -0.15F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 51
		bodyModel[80].setRotationPoint(46.57F, -5.5F, 16.7F);
		bodyModel[80].rotateAngleZ = -0.90757121F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 52
		bodyModel[81].setRotationPoint(45F, -6.6F, 16.7F);
		bodyModel[81].rotateAngleZ = -0.4712389F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0.2F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F); // Box 53
		bodyModel[82].setRotationPoint(43F, -7.1F, 16.7F);
		bodyModel[82].rotateAngleZ = -0.10471976F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 31, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, 1.8F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 54
		bodyModel[83].setRotationPoint(11.9F, -5.5F, 16.7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 55
		bodyModel[84].setRotationPoint(-16.5F, -5.5F, 16.7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F); // Box 58
		bodyModel[85].setRotationPoint(-42.3F, -6.7F, 16.7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.6F, -0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, -0.1F, 0.2F, 0.4F, -0.3F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 59
		bodyModel[86].setRotationPoint(-44.7F, -6.7F, 16.7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.2F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 60
		bodyModel[87].setRotationPoint(-46.9F, -5.75F, 16.7F);
		bodyModel[87].rotateAngleZ = 0.36651914F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0.6F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0.6F, -0.2F, 0.2F); // Box 61
		bodyModel[88].setRotationPoint(-48.1F, -3.55F, 16.7F);
		bodyModel[88].rotateAngleZ = 0.95993109F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 62
		bodyModel[89].setRotationPoint(-48.45F, -0.71F, 16.7F);
		bodyModel[89].rotateAngleZ = 1.3962634F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 63
		bodyModel[90].setRotationPoint(-47.68F, 1.4F, 16.7F);
		bodyModel[90].rotateAngleZ = 1.74532925F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, -0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.2F, -0.6F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.2F, 0.2F); // Box 64
		bodyModel[91].setRotationPoint(-46.09F, 3.02F, 16.7F);
		bodyModel[91].rotateAngleZ = 2.18166156F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 1, 9, 0F,0.4F, 4F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.4F, 4F, 0.2F, 0.4F, -4.4F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.4F, -4.4F, 0.2F); // Box 65
		bodyModel[92].setRotationPoint(-45.9F, 6.32F, 16.7F);
		bodyModel[92].rotateAngleZ = -0.12217305F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, -0.35F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.35F, 0.2F, -0.1F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.1F, 0F, 0.2F); // Box 66
		bodyModel[93].setRotationPoint(-36F, 7.35F, 16.7F);
		bodyModel[93].rotateAngleZ = -0.33161256F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 61, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 67
		bodyModel[94].setRotationPoint(-31.4F, 8.9F, 16.7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 68
		bodyModel[95].setRotationPoint(29.65F, 8.9F, 16.7F);
		bodyModel[95].rotateAngleZ = 0.2443461F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,-2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 69
		bodyModel[96].setRotationPoint(37.8F, -6F, 18F);

		bodyModel[97].addShapeBox(-3F, 0F, 0F, 9, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 70
		bodyModel[97].setRotationPoint(40.8F, -4F, 18F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F); // Box 71
		bodyModel[98].setRotationPoint(37.8F, 0F, 18F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 72
		bodyModel[99].setRotationPoint(23.5F, -4F, 18F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 73
		bodyModel[100].setRotationPoint(23.5F, 0.5F, 18F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 74
		bodyModel[101].setRotationPoint(23.5F, 4.5F, 18F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 75
		bodyModel[102].setRotationPoint(5.5F, -4F, 18F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 77
		bodyModel[103].setRotationPoint(-16.5F, -4F, 18F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,-3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 78
		bodyModel[104].setRotationPoint(-36.5F, -4F, 18F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 79
		bodyModel[105].setRotationPoint(5.5F, 0.5F, 18F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 81
		bodyModel[106].setRotationPoint(-16.5F, 0.5F, 18F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 82
		bodyModel[107].setRotationPoint(-36.5F, 0.5F, 18F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 83
		bodyModel[108].setRotationPoint(5.5F, 4.5F, 18F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 85
		bodyModel[109].setRotationPoint(-16.5F, 4.5F, 18F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F, -3.8F, 0F, 0.2F); // Box 86
		bodyModel[110].setRotationPoint(-36.5F, 4.5F, 18F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,-2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 87
		bodyModel[111].setRotationPoint(-47F, -5.5F, 18F);

		bodyModel[112].addShapeBox(-3F, 0F, 0F, 9, 4, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 88
		bodyModel[112].setRotationPoint(-44F, -3.5F, 18F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 9, 2, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F, -2.8F, 0.5F, 0.2F); // Box 89
		bodyModel[113].setRotationPoint(-47F, 0.5F, 18F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 19, 3, 9, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 90
		bodyModel[114].setRotationPoint(11.7F, -13F, -26.7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 14, 3, 8, 0F,-0.3F, 0.3F, -0.3F, -0.3F, 1.2F, -0.3F, -0.3F, 1.2F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 0
		bodyModel[115].setRotationPoint(-42.7F, -13.1F, -26F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 22, 3, 3, 0F,0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F, 0F, 0.1F, 0.15F); // Box 1
		bodyModel[116].setRotationPoint(-20.2F, -13F, -26.2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 31, 0F,-0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F); // Box 2
		bodyModel[117].setRotationPoint(39.6F, -10F, -16F);
		bodyModel[117].rotateAngleZ = -0.61086524F;

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.2F, -0.33F, -0.3F, -0.2F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, 0.55F, -0.33F, -0.3F, 0.55F); // Box 3
		bodyModel[118].setRotationPoint(39.95F, -10.5F, -16F);
		bodyModel[118].rotateAngleZ = -0.61086524F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.33F, -0.3F, -0.5F, -0.33F, -0.3F, -0.5F, -0.33F, -0.3F, -0.15F, -0.33F, -0.3F, -0.15F, -0.33F, -0.3F, 0.1F, -0.33F, -0.3F, 0.1F, -0.33F, -0.3F, -0.15F, -0.33F, -0.3F, -0.15F); // Box 4
		bodyModel[119].setRotationPoint(39.95F, -10.5F, -2.98F);
		bodyModel[119].rotateAngleZ = -0.61086524F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.15F, -0.33F, -0.3F, -0.15F); // Box 5
		bodyModel[120].setRotationPoint(40.17F, -10.8F, -16F);
		bodyModel[120].rotateAngleZ = -0.61086524F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.4F, -0.33F, -0.3F, -0.5F, -0.33F, -0.3F, -0.5F, -0.33F, -0.3F, -0.15F, -0.33F, -0.3F, -0.15F, -0.33F, -0.3F, -0.5F, -0.33F, -0.3F, -0.5F); // Box 6
		bodyModel[121].setRotationPoint(40.17F, -10.8F, -2.65F);
		bodyModel[121].rotateAngleZ = -0.61086524F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 8
		bodyModel[122].setRotationPoint(33.9F, -11.85F, -16.3F);
		bodyModel[122].rotateAngleZ = 0.99483767F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 9
		bodyModel[123].setRotationPoint(33.9F, -11.85F, 11.45F);
		bodyModel[123].rotateAngleZ = 0.99483767F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 10
		bodyModel[124].setRotationPoint(33.9F, -11.85F, 14.5F);
		bodyModel[124].rotateAngleZ = 0.99483767F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 12
		bodyModel[125].setRotationPoint(45.4F, -6F, -13.43F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.3F, 0.05F, -0.95F, -0.3F, 0.05F, -0.95F, -0.3F, -0.2F, -0.4F, -0.3F, 0.1F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 13
		bodyModel[126].setRotationPoint(45.4F, -7F, -13.43F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.3F, 0.1F, -0.55F, -0.3F, 0.1F, -0.55F, -0.3F, -0.2F, -0.4F, -0.3F, 0.1F, 0F, -0.3F, -0.15F, 0.1F, -0.3F, -0.15F, 0.1F, -0.3F, 0.1F, 0F, -0.3F); // Box 14
		bodyModel[127].setRotationPoint(44.5F, -7.15F, -13.43F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.4F, -0.3F, -0.1F, -1.25F, -0.3F, -0.1F, -1.25F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 15
		bodyModel[128].setRotationPoint(46.25F, -6.45F, -13.43F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.06F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, 0.06F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F); // Box 16
		bodyModel[129].setRotationPoint(46.75F, -5.15F, -13.43F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.06F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, 0.06F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.25F, -0.3F); // Box 17
		bodyModel[130].setRotationPoint(46.95F, -4.7F, -13.43F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.6F, -0.3F); // Box 18
		bodyModel[131].setRotationPoint(46.75F, -4.55F, -13.43F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.6F, -0.3F); // Box 19
		bodyModel[132].setRotationPoint(46.55F, -4.75F, -13.43F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.6F, -0.3F); // Box 20
		bodyModel[133].setRotationPoint(44.7F, -6.4F, -13.43F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.55F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.55F, -0.3F, -0.2F, -0.05F, -0.3F, -0.45F, -0.12F, -0.3F, -0.45F, -0.12F, -0.3F, -0.2F, -0.05F, -0.3F); // Box 21
		bodyModel[134].setRotationPoint(43.9F, -7.05F, -13.43F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.55F, -0.3F, -0.4F, -0.65F, -0.3F, -0.4F, -0.65F, -0.3F, -0.25F, -0.55F, -0.3F, -0.1F, -0.15F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.1F, -0.15F, -0.3F); // Box 22
		bodyModel[135].setRotationPoint(43.5F, -7.15F, -13.43F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.3F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, -0.5F, -0.3F, 0.1F, 0.3F, -0.3F, 2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 2F, 0F, -0.1F); // Box 24
		bodyModel[136].setRotationPoint(45.4F, -4.7F, -13.43F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.3F, -0.3F, 0.05F, -0.5F, -0.3F, 0.05F, -0.5F, -0.3F, 0.1F, 0.3F, -0.3F, 2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 2F, 0F, -0.1F); // Box 25
		bodyModel[137].setRotationPoint(45.4F, -4.7F, 11.57F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 26
		bodyModel[138].setRotationPoint(45.4F, -6F, 11.57F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.3F, 0.05F, -0.95F, -0.3F, 0.05F, -0.95F, -0.3F, -0.2F, -0.4F, -0.3F, 0.1F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.05F, 0F, -0.3F, 0.1F, 0F, -0.3F); // Box 27
		bodyModel[139].setRotationPoint(45.4F, -7F, 11.57F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.3F, 0.1F, -0.55F, -0.3F, 0.1F, -0.55F, -0.3F, -0.2F, -0.4F, -0.3F, 0.1F, 0F, -0.3F, -0.15F, 0.1F, -0.3F, -0.15F, 0.1F, -0.3F, 0.1F, 0F, -0.3F); // Box 28
		bodyModel[140].setRotationPoint(44.5F, -7.15F, 11.57F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.55F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.55F, -0.3F, -0.2F, -0.05F, -0.3F, -0.45F, -0.12F, -0.3F, -0.45F, -0.12F, -0.3F, -0.2F, -0.05F, -0.3F); // Box 29
		bodyModel[141].setRotationPoint(43.9F, -7.05F, 11.57F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.55F, -0.3F, -0.4F, -0.65F, -0.3F, -0.4F, -0.65F, -0.3F, -0.25F, -0.55F, -0.3F, -0.1F, -0.15F, -0.3F, -0.4F, 0.05F, -0.3F, -0.4F, 0.05F, -0.3F, -0.1F, -0.15F, -0.3F); // Box 30
		bodyModel[142].setRotationPoint(43.5F, -7.15F, 11.57F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, -0.4F, -0.3F, -0.1F, -1.25F, -0.3F, -0.1F, -1.25F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 31
		bodyModel[143].setRotationPoint(46.25F, -6.45F, 11.57F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.06F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, 0.06F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F); // Box 32
		bodyModel[144].setRotationPoint(46.75F, -5.15F, 11.57F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.06F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, 0.06F, -0.3F, -0.4F, -0.25F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.25F, -0.3F); // Box 33
		bodyModel[145].setRotationPoint(46.95F, -4.7F, 11.57F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.6F, -0.3F); // Box 34
		bodyModel[146].setRotationPoint(46.75F, -4.55F, 11.57F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.6F, -0.3F); // Box 35
		bodyModel[147].setRotationPoint(46.55F, -4.75F, 11.57F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.4F, -0.6F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.35F, -0.3F, -0.4F, -0.6F, -0.3F); // Box 36
		bodyModel[148].setRotationPoint(44.7F, -6.4F, 11.57F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1.15F, 0F, 0.25F, -0.8F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 37
		bodyModel[149].setRotationPoint(-3.2F, -13.2F, -20.85F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, -0.1F, 0F, -0.4F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.8F, -0.45F, 0.25F, -1.1F, -0.45F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 39
		bodyModel[150].setRotationPoint(0.8F, -13.2F, -20.85F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.4F, -0.1F, 0F, -1.55F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0.25F, -1.1F, -0.45F, 0.25F, -2.9F, -0.45F, 0.25F, 0F, 0.35F, 0.25F, 0F); // Box 40
		bodyModel[151].setRotationPoint(4.7F, -13.2F, -20.85F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -1.55F, 0F, 0F, -3.9F, 1F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0.25F, -2.9F, -0.4F, 0.25F, -5F, -0.4F, 0.25F, 0F, 0.35F, 0.25F, 0F); // Box 41
		bodyModel[152].setRotationPoint(8.6F, -13.2F, -20.85F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, -3.9F, 0F, 0F, -1.55F, 0F, 0F, 0F, 2F, 0F, 0F, -0.4F, 0.25F, -5.5F, 0F, 0.25F, -2.3F, 0.35F, 0.25F, 0F, -0.2F, 0.25F, 1F); // Box 42
		bodyModel[153].setRotationPoint(-9.2F, -13.2F, -22F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.05F, -0.45F, 0F, -0.4F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, -1.1F, -0.8F, -0.15F, -1.8F, -0.8F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 43
		bodyModel[154].setRotationPoint(0.8F, -11.95F, -20.15F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.45F, 0F, -0.4F, 0F, 0F, -0.05F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.8F, -0.15F, -1.8F, 0F, -0.15F, -1.1F, 0F, -0.15F, 0F, -0.8F, -0.15F, 0F); // Box 44
		bodyModel[155].setRotationPoint(-3.2F, -11.95F, -20.15F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, -0.35F, -0.1F, 0F, -2.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.15F, -1.75F, -0.3F, -0.15F, -2.8F, -0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F); // Box 45
		bodyModel[156].setRotationPoint(4.35F, -11.95F, -20.1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -1.9F, 0F, 0F, -3.9F, 1F, 0F, 0F, 0F, 0F, 0F, 0.35F, -0.15F, -2.5F, -0.4F, -0.15F, -5F, -0.4F, -0.15F, 0F, 0.35F, -0.15F, 0F); // Box 46
		bodyModel[157].setRotationPoint(8.35F, -11.95F, -19.85F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.55F, 0F, 0F, -3.9F, -0.2F, 0.25F, 1F, 0.35F, 0.25F, 0F, 0F, 0.25F, -2.3F, -0.4F, 0.25F, -5.5F); // Box 0
		bodyModel[158].setRotationPoint(-9.2F, -13.2F, 15.3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.8F, 0F, 0.25F, -1.15F); // Box 1
		bodyModel[159].setRotationPoint(-3.2F, -13.2F, 15.15F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.45F, 0.25F, 0F, -0.45F, 0.25F, -1.1F, 0F, 0.25F, -0.8F); // Box 2
		bodyModel[160].setRotationPoint(0.8F, -13.2F, 15.15F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -1.55F, 0F, 0F, -0.4F, 0.35F, 0.25F, 0F, -0.45F, 0.25F, 0F, -0.45F, 0.25F, -2.9F, 0.35F, 0.25F, -1.1F); // Box 3
		bodyModel[161].setRotationPoint(4.7F, -13.2F, 15.15F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3.9F, 0F, 0F, -1.55F, 0.35F, 0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F, 0.25F, -5F, 0.35F, 0.25F, -2.9F); // Box 4
		bodyModel[162].setRotationPoint(8.6F, -13.2F, 15.15F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.2F, 1.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 1.4F, -0.3F, 0.8F, -2.3F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0.8F, -2.3F, -0.3F); // Box 7
		bodyModel[163].setRotationPoint(-52F, -6F, -12F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.2F, 1.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 1.4F, -0.3F, 0.8F, -2.3F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0.8F, -2.3F, -0.3F); // Box 8
		bodyModel[164].setRotationPoint(-52F, -6F, 10.3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[165].setRotationPoint(-53.25F, -8.2F, -27F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 53, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[166].setRotationPoint(-53.25F, -9.2F, -27F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 12
		bodyModel[167].setRotationPoint(-53.25F, -7.2F, -27F);

		bodyModel[168].addBox(0F, 0F, 0F, 5, 3, 9, 0F); // Box 13
		bodyModel[168].setRotationPoint(-48.1F, -13F, -26.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F); // Box 14
		bodyModel[169].setRotationPoint(-47.9F, -10F, -25.85F);
		bodyModel[169].rotateAngleZ = 0.34906585F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F); // Box 15
		bodyModel[170].setRotationPoint(-47.9F, -10F, -18.75F);
		bodyModel[170].rotateAngleZ = 0.34906585F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, -2F, -0.2F, -0.4F, -2F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 16
		bodyModel[171].setRotationPoint(32.8F, -11.9F, -26.7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, -2F, -0.2F, -0.4F, -2F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 17
		bodyModel[172].setRotationPoint(-20.9F, -11.9F, -26.7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, -2F, -0.2F, -0.4F, -2F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 18
		bodyModel[173].setRotationPoint(-43.2F, -11.9F, -26.7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 19
		bodyModel[174].setRotationPoint(32.8F, -11.9F, 14.3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 20
		bodyModel[175].setRotationPoint(14F, -11.9F, 14.3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 21
		bodyModel[176].setRotationPoint(-8F, -11.9F, 14.3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 22
		bodyModel[177].setRotationPoint(-25.5F, -11.9F, 14.3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 23
		bodyModel[178].setRotationPoint(-43.3F, -11.9F, 14.3F);

		bodyModel[179].addBox(0F, 0F, 0F, 8, 1, 15, 0F); // Box 24
		bodyModel[179].setRotationPoint(-39.5F, -13.7F, -15.8F);

		bodyModel[180].addBox(0F, 0F, 0F, 6, 1, 31, 0F); // Box 25
		bodyModel[180].setRotationPoint(-46.5F, -13.7F, -15.8F);

		bodyModel[181].addBox(0F, 0F, 0F, 8, 1, 15, 0F); // Box 26
		bodyModel[181].setRotationPoint(-39.5F, -13.7F, 0.2F);

		bodyModel[182].addBox(0F, 0F, 0F, 7, 1, 14, 0F); // Box 27
		bodyModel[182].setRotationPoint(-39F, -13.75F, 0.7F);

		bodyModel[183].addBox(0F, 0F, 0F, 7, 1, 14, 0F); // Box 28
		bodyModel[183].setRotationPoint(-39F, -13.75F, -15.3F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.7F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.7F, 0F, -0.1F); // Box 29
		bodyModel[184].setRotationPoint(-32.9F, -14F, -14.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.6F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.6F, 0F, -0.1F); // Box 30
		bodyModel[185].setRotationPoint(-30.8F, -14.6F, -14.75F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, -0.6F, -0.35F, -0.1F, 0F, -0.35F, -0.1F, 0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, 0.3F, -0.3F, -0.1F); // Box 31
		bodyModel[186].setRotationPoint(-30.8F, -15.3F, -14.75F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 32, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.3F, -0.15F, -0.15F, -0.3F); // Box 32
		bodyModel[187].setRotationPoint(-31.1F, -14.6F, -16.2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 23, 1, 9, 0F,0.2F, 1F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, -1.4F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -1.4F, 0.2F); // Box 15
		bodyModel[188].setRotationPoint(-39.9F, -5.5F, 16.7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0.15F, 0F, 0.35F, 0.15F, 0F, 0.35F, 0.15F, 0.3F, 0F, 0.15F, 0.3F, 0.45F, -0.03F, 0.42F, 0.9F, -0.03F, 0.42F, 0.9F, -0.03F, 0.85F, 0.45F, -0.03F, 0.85F); // Box 16
		bodyModel[189].setRotationPoint(2.2F, -12.48F, 20F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0.45F, -0.03F, 0.42F, 0.9F, -0.03F, 0.42F, 0.9F, -0.03F, 0.85F, 0.45F, -0.03F, 0.85F, 0F, 0.15F, 0F, 0.35F, 0.15F, 0F, 0.35F, 0.15F, 0.3F, 0F, 0.15F, 0.3F); // Box 17
		bodyModel[190].setRotationPoint(2.2F, -11.05F, 20F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,0F, -0.24F, 0F, 0.35F, -0.24F, 0F, 0.35F, -0.24F, 0F, 0F, -0.24F, 0F, 0F, -0.27F, 0F, 0.35F, -0.27F, 0F, 0.35F, -0.27F, 0F, 0F, -0.27F, 0F); // Box 18
		bodyModel[191].setRotationPoint(1.75F, -11.75F, 19.85F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,-0.1F, 0.11F, -0.2F, 0.35F, 0.15F, 0F, 0.35F, 0.15F, 0.3F, -0.01F, 0.11F, 0F, 0.55F, -0.03F, 0.08F, -0.1F, -0.03F, 0.42F, -0.1F, -0.03F, 0.85F, 0.55F, -0.03F, 0.45F); // Box 20
		bodyModel[192].setRotationPoint(1.85F, -12.48F, 20F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0.55F, -0.03F, 0.08F, -0.1F, -0.03F, 0.42F, -0.1F, -0.03F, 0.85F, 0.55F, -0.03F, 0.45F, -0.1F, 0.11F, -0.2F, 0.35F, 0.15F, 0F, 0.35F, 0.15F, 0.3F, -0.01F, 0.11F, 0F); // Box 21
		bodyModel[193].setRotationPoint(1.85F, -11.05F, 20F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0.45F, 0.15F, 0F, -0.08F, 0.11F, -0.2F, -0.08F, 0.11F, 0F, 0.45F, 0.15F, 0.3F, -0.1F, -0.03F, 0.42F, 0.55F, -0.03F, 0.08F, 0.55F, -0.03F, 0.45F, -0.1F, -0.03F, 0.85F); // Box 22
		bodyModel[194].setRotationPoint(10F, -12.48F, 20F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,-0.1F, -0.03F, 0.42F, 0.55F, -0.03F, 0.08F, 0.55F, -0.03F, 0.45F, -0.1F, -0.03F, 0.85F, 0.45F, 0.15F, 0F, -0.08F, 0.11F, -0.2F, -0.08F, 0.11F, 0F, 0.45F, 0.15F, 0.3F); // Box 23
		bodyModel[195].setRotationPoint(10F, -11.05F, 20F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0.1F, -0.24F, 0F, 0.35F, -0.24F, 0F, 0.35F, -0.24F, 0F, 0.1F, -0.24F, -0.4F, 0.1F, -0.27F, 0F, 0.35F, -0.27F, 0F, 0.35F, -0.27F, 0F, 0.1F, -0.27F, -0.4F); // Box 24
		bodyModel[196].setRotationPoint(1.4F, -11.75F, 19.85F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 1, 6, 0F,0.35F, -0.24F, 0F, 0.1F, -0.24F, 0F, 0.1F, -0.24F, -0.4F, 0.35F, -0.24F, 0F, 0.35F, -0.27F, 0F, 0.1F, -0.27F, 0F, 0.1F, -0.27F, -0.4F, 0.35F, -0.27F, 0F); // Box 0
		bodyModel[197].setRotationPoint(10.45F, -11.75F, 19.85F);

		bodyModel[198].addBox(0F, 0F, 0F, 16, 3, 8, 0F); // Box 3
		bodyModel[198].setRotationPoint(-24F, -12.7F, 17F);

		bodyModel[199].addBox(0F, 0F, 0F, 15, 3, 8, 0F); // Box 4
		bodyModel[199].setRotationPoint(-41F, -12.7F, 17F);

		bodyModel[200].addBox(0F, 0F, 0F, 15, 3, 8, 0F); // Box 5
		bodyModel[200].setRotationPoint(17F, -12.7F, 17F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 6
		bodyModel[201].setRotationPoint(-28.6F, -11.7F, -26.7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 7
		bodyModel[202].setRotationPoint(-28.6F, -13.6F, -21.9F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.55F, 0.9F, 0F, -0.55F, 0.9F, 0F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 8
		bodyModel[203].setRotationPoint(-28.1F, -14.05F, -18.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 24
		bodyModel[204].setRotationPoint(33.8F, -11.8F, -11.55F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 28
		bodyModel[205].setRotationPoint(33.65F, -11.8F, -8.45F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 29
		bodyModel[206].setRotationPoint(33.65F, -11.8F, -5.2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -1.35F, -0.35F, -0.2F, -1.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0.65F, -0.35F, -0.2F, 0.65F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 31
		bodyModel[207].setRotationPoint(34.4F, -11.6F, -11.55F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.35F, 0F, -1.55F, -0.35F, 0F, -1.55F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.1F, 0.85F, -0.35F, 0.1F, 0.85F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 50
		bodyModel[208].setRotationPoint(34.4F, -11.6F, -8.5F);
		bodyModel[208].rotateAngleZ = -0.15707963F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.35F, 0F, -1.55F, -0.35F, 0F, -1.55F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.1F, 0.85F, -0.35F, 0.1F, 0.85F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 51
		bodyModel[209].setRotationPoint(34.4F, -11.6F, -5.2F);
		bodyModel[209].rotateAngleZ = -0.15707963F;

		bodyModel[210].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 53
		bodyModel[210].setRotationPoint(-28.1F, -11.55F, -27.6F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 7, 1, 10, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 54
		bodyModel[211].setRotationPoint(-28.1F, -10.25F, -27.6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, 0F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.3F, 0F); // Box 55
		bodyModel[212].setRotationPoint(-28.9F, -10.75F, -27.6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, 0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0.3F, 0F); // Box 56
		bodyModel[213].setRotationPoint(-21.3F, -10.75F, -27.6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 57
		bodyModel[214].setRotationPoint(36.65F, -10.7F, 24.7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F); // Box 58
		bodyModel[215].setRotationPoint(36.65F, -10.7F, 22.05F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F); // Box 59
		bodyModel[216].setRotationPoint(36.2F, -10.7F, 20.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F); // Box 60
		bodyModel[217].setRotationPoint(36.65F, -10.7F, 18.95F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F); // Box 61
		bodyModel[218].setRotationPoint(36.65F, -10.7F, 16.25F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F); // Box 62
		bodyModel[219].setRotationPoint(36.85F, -10.7F, 17.45F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F); // Box 63
		bodyModel[220].setRotationPoint(36.85F, -10.7F, 23.55F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F); // Box 64
		bodyModel[221].setRotationPoint(35.6F, -10.7F, 17.45F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F); // Box 65
		bodyModel[222].setRotationPoint(35.6F, -10.7F, 23.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 66
		bodyModel[223].setRotationPoint(36.3F, -10.7F, 22.91F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 67
		bodyModel[224].setRotationPoint(36.3F, -10.7F, 24.25F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 68
		bodyModel[225].setRotationPoint(36.3F, -10.7F, 16.8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F); // Box 69
		bodyModel[226].setRotationPoint(36.3F, -10.7F, 18.1F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F); // Box 70
		bodyModel[227].setRotationPoint(35.65F, -10.7F, -26.75F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 71
		bodyModel[228].setRotationPoint(35.3F, -10.7F, -26.2F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F); // Box 72
		bodyModel[229].setRotationPoint(35.85F, -10.7F, -25.55F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F); // Box 73
		bodyModel[230].setRotationPoint(34.6F, -10.7F, -25.55F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F); // Box 74
		bodyModel[231].setRotationPoint(35.3F, -10.7F, -24.9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F); // Box 75
		bodyModel[232].setRotationPoint(35.65F, -10.7F, -24.05F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F); // Box 76
		bodyModel[233].setRotationPoint(35.2F, -10.7F, -22.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F); // Box 77
		bodyModel[234].setRotationPoint(35.65F, -10.7F, -20.95F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F); // Box 78
		bodyModel[235].setRotationPoint(34.6F, -10.7F, -19.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 79
		bodyModel[236].setRotationPoint(35.65F, -10.7F, -18.3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F); // Box 80
		bodyModel[237].setRotationPoint(35.85F, -10.7F, -19.45F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 81
		bodyModel[238].setRotationPoint(35.3F, -10.7F, -20.09F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 82
		bodyModel[239].setRotationPoint(35.3F, -10.7F, -18.75F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F); // Box 83
		bodyModel[240].setRotationPoint(36.6F, -10.7F, -25.55F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F); // Box 84
		bodyModel[241].setRotationPoint(37.3F, -10.7F, -24.9F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 85
		bodyModel[242].setRotationPoint(37.3F, -10.7F, -26.2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F); // Box 86
		bodyModel[243].setRotationPoint(37.85F, -10.7F, -25.55F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F); // Box 87
		bodyModel[244].setRotationPoint(37.65F, -10.7F, -26.75F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F); // Box 88
		bodyModel[245].setRotationPoint(37.65F, -10.7F, -24.05F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F); // Box 89
		bodyModel[246].setRotationPoint(37.2F, -10.7F, -22.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F); // Box 90
		bodyModel[247].setRotationPoint(37.65F, -10.7F, -20.95F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F); // Box 91
		bodyModel[248].setRotationPoint(37.85F, -10.7F, -19.45F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 92
		bodyModel[249].setRotationPoint(37.3F, -10.7F, -20.09F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 93
		bodyModel[250].setRotationPoint(37.3F, -10.7F, -18.75F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F); // Box 94
		bodyModel[251].setRotationPoint(36.6F, -10.7F, -19.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 95
		bodyModel[252].setRotationPoint(37.65F, -10.7F, -18.3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F); // Box 96
		bodyModel[253].setRotationPoint(39.65F, -10.7F, -26.75F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 97
		bodyModel[254].setRotationPoint(39.3F, -10.7F, -26.2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F); // Box 98
		bodyModel[255].setRotationPoint(38.6F, -10.7F, -25.55F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F); // Box 99
		bodyModel[256].setRotationPoint(39.85F, -10.7F, -25.55F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, -0.1F, -0.2F, -0.25F); // Box 100
		bodyModel[257].setRotationPoint(39.3F, -10.7F, -24.9F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F); // Box 101
		bodyModel[258].setRotationPoint(39.65F, -10.7F, -24.05F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.3F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F); // Box 102
		bodyModel[259].setRotationPoint(39.2F, -10.7F, -22.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F); // Box 103
		bodyModel[260].setRotationPoint(39.65F, -10.7F, -20.95F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0F, -0.2F, -0.25F); // Box 104
		bodyModel[261].setRotationPoint(39.3F, -10.7F, -20.09F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F, -0.35F, -0.2F, 0.3F); // Box 105
		bodyModel[262].setRotationPoint(39.85F, -10.7F, -19.45F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.2F); // Box 106
		bodyModel[263].setRotationPoint(38.6F, -10.7F, -19.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F); // Box 107
		bodyModel[264].setRotationPoint(31F, -13.9F, 17.3F);
		bodyModel[264].rotateAngleY = -0.64577182F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F); // Box 108
		bodyModel[265].setRotationPoint(33.2F, -12.8F, 16F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[266].setRotationPoint(33.5F, -11.8F, 16F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F); // Box 111
		bodyModel[267].setRotationPoint(31.8F, -12.9F, 16.65F);
		bodyModel[267].rotateAngleY = -0.64577182F;

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 112
		bodyModel[268].setRotationPoint(32F, -11.9F, 16.45F);
		bodyModel[268].rotateAngleY = -0.64577182F;

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 113
		bodyModel[269].setRotationPoint(33.5F, -11.9F, 16F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 114
		bodyModel[270].setRotationPoint(33.5F, -11.9F, -17.9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[271].setRotationPoint(33.5F, -11.8F, -17.9F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F); // Box 116
		bodyModel[272].setRotationPoint(33.2F, -12.8F, -17.9F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 117
		bodyModel[273].setRotationPoint(32.2F, -12.9F, -17.9F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[274].setRotationPoint(32.2F, -12.8F, -17.9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F); // Box 119
		bodyModel[275].setRotationPoint(30.95F, -13.8F, -17.9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.2F, 1.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 1.4F, -0.3F, 0.8F, -2.3F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0.8F, -2.3F, -0.3F); // Box 138
		bodyModel[276].setRotationPoint(-49F, -1.1F, -9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.2F, 1.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 1.4F, -0.3F, 0.8F, -2.3F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0.8F, -2.3F, -0.3F); // Box 139
		bodyModel[277].setRotationPoint(-49F, -1.1F, 7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[278].setRotationPoint(-48.4F, -2.85F, -16.3F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.35F, 0.4F, 0F); // Box 141
		bodyModel[279].setRotationPoint(-48.4F, -0.85F, -16.3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F); // Box 142
		bodyModel[280].setRotationPoint(-48.05F, 1.55F, -16.3F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.6F, 0F, 0F); // Box 143
		bodyModel[281].setRotationPoint(-46.7F, 3.55F, -16.3F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -2.2F, -0.1F, 0F); // Box 144
		bodyModel[282].setRotationPoint(-45.7F, 4.55F, -16.3F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.2F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -2.2F, -0.1F, 0F); // Box 145
		bodyModel[283].setRotationPoint(-45.7F, 4.55F, 13.45F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.6F, 0F, 0F); // Box 147
		bodyModel[284].setRotationPoint(-46.7F, 3.55F, 13.45F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.35F, 0F, 0F); // Box 148
		bodyModel[285].setRotationPoint(-48.05F, 1.55F, 13.45F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.35F, 0.4F, 0F); // Box 149
		bodyModel[286].setRotationPoint(-48.4F, -0.85F, 13.45F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[287].setRotationPoint(-48.4F, -2.85F, 13.45F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 151
		bodyModel[288].setRotationPoint(30.4F, -14.7F, -11.4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 152
		bodyModel[289].setRotationPoint(30.4F, -14.7F, -8.2F);
		bodyModel[289].rotateAngleY = 0.31415927F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 0
		bodyModel[290].setRotationPoint(39.65F, -10.7F, -18.3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F, 0F, -0.05F, -0.1F); // Box 451
		bodyModel[291].setRotationPoint(33.9F, -11.85F, -13.55F);
		bodyModel[291].rotateAngleZ = 0.99483767F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F); // Box 9
		bodyModel[292].setRotationPoint(36.85F, -13.1F, -11.55F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F); // Box 11
		bodyModel[293].setRotationPoint(33.85F, -13.1F, -11.55F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 12
		bodyModel[294].setRotationPoint(34.8F, -14.2F, -11.55F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F); // Box 13
		bodyModel[295].setRotationPoint(35.05F, -14.2F, -8.45F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.2F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F); // Box 14
		bodyModel[296].setRotationPoint(35.05F, -14.2F, -5.2F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F); // Box 15
		bodyModel[297].setRotationPoint(33.7F, -13.1F, -8.45F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F, -0.35F, 0.55F, -0.35F); // Box 16
		bodyModel[298].setRotationPoint(33.7F, -13.1F, -5.2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.6F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.6F, -0.35F, -0.4F, -0.2F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.4F, -0.2F, -0.35F); // Box 17
		bodyModel[299].setRotationPoint(34.2F, -14.2F, -11.55F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.6F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.6F, -0.35F, -0.4F, -0.2F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.4F, -0.2F, -0.35F); // Box 18
		bodyModel[300].setRotationPoint(34.05F, -14.2F, -8.45F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.6F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.6F, -0.35F, -0.4F, -0.2F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.4F, -0.2F, -0.35F); // Box 19
		bodyModel[301].setRotationPoint(34.05F, -14.2F, -5.2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F); // Box 20
		bodyModel[302].setRotationPoint(33.65F, -13.85F, -8.45F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F); // Box 21
		bodyModel[303].setRotationPoint(33.65F, -13.85F, -5.2F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F); // Box 22
		bodyModel[304].setRotationPoint(33.8F, -13.85F, -11.55F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.05F, -0.15F, -0.35F, -0.05F, -0.15F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 24
		bodyModel[305].setRotationPoint(33.8F, -11.8F, -11.55F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, 0.1F, -0.25F, -0.35F, -0.8F, -0.25F, -0.35F, -0.8F, -0.25F, -0.35F, 0.1F, -0.25F, -0.35F); // Box 25
		bodyModel[306].setRotationPoint(36.9F, -10.8F, -11.55F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -0.6F, -0.35F, -0.2F, -0.6F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.4F, -0.2F, -0.35F, -0.4F, -0.2F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 26
		bodyModel[307].setRotationPoint(36.4F, -14.2F, -11.55F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 27
		bodyModel[308].setRotationPoint(36.6F, -13.85F, -11.55F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 28
		bodyModel[309].setRotationPoint(33.65F, -11.8F, -8.45F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.3F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.6F, -0.25F, -0.35F); // Box 29
		bodyModel[310].setRotationPoint(33.65F, -11.8F, -5.2F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F); // Box 30
		bodyModel[311].setRotationPoint(36.2F, -10.6F, -11.55F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.35F, -0.35F, -0.2F, -1.35F, -0.35F, -0.2F, -1.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, 0.65F, -0.35F, -0.2F, 0.65F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 31
		bodyModel[312].setRotationPoint(34.4F, -11.6F, -11.55F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.15F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 32
		bodyModel[313].setRotationPoint(36.2F, -14.2F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 33
		bodyModel[314].setRotationPoint(34.5F, -14.2F, -7.8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, -0.1F, -0.55F, -0.35F, -0.1F, -0.55F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.2F, -0.15F, -0.35F, -0.2F, -0.15F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 34
		bodyModel[315].setRotationPoint(37.2F, -14.2F, -8.45F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, -0.1F, -0.55F, -0.35F, -0.1F, -0.55F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.2F, -0.15F, -0.35F, -0.2F, -0.15F, -0.35F, -0.1F, -0.35F, -0.35F); // Box 35
		bodyModel[316].setRotationPoint(37.2F, -14.2F, -5.2F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, -0.25F, -0.8F, -0.35F, -0.25F, -0.8F, -0.35F, -0.1F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.6F, -0.05F, -0.35F, -0.6F, -0.05F, -0.35F, 0F, -0.35F, -0.35F); // Box 36
		bodyModel[317].setRotationPoint(38F, -14F, -5.2F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.35F, -0.25F, -0.8F, -0.35F, -0.25F, -0.8F, -0.35F, -0.1F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.6F, -0.05F, -0.35F, -0.6F, -0.05F, -0.35F, 0F, -0.35F, -0.35F); // Box 38
		bodyModel[318].setRotationPoint(38F, -14F, -8.45F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.25F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.3F, -0.25F, -0.35F, -0.65F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, -0.65F, -0.2F, -0.35F); // Box 40
		bodyModel[319].setRotationPoint(38.1F, -13.3F, -5.2F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F); // Box 41
		bodyModel[320].setRotationPoint(38.45F, -12.6F, -5.2F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F); // Box 42
		bodyModel[321].setRotationPoint(38.5F, -12F, -5.2F);
		bodyModel[321].rotateAngleZ = -0.29670597F;

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.15F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.15F, -0.35F, 0.1F, -0.25F, -0.35F, -0.75F, -0.25F, -0.35F, -0.75F, -0.25F, -0.35F, 0.1F, -0.25F, -0.35F); // Box 43
		bodyModel[322].setRotationPoint(37.9F, -10.1F, -5.2F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F); // Box 44
		bodyModel[323].setRotationPoint(37.2F, -10F, -5.2F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.25F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.3F, -0.25F, -0.35F, -0.65F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, -0.65F, -0.2F, -0.35F); // Box 45
		bodyModel[324].setRotationPoint(38.1F, -13.3F, -8.45F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F); // Box 46
		bodyModel[325].setRotationPoint(38.45F, -12.6F, -8.45F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.35F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.3F, 0.05F, -0.35F); // Box 47
		bodyModel[326].setRotationPoint(38.5F, -12F, -8.45F);
		bodyModel[326].rotateAngleZ = -0.29670597F;

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.15F, -0.35F, -0.4F, -0.25F, -0.35F, -0.4F, -0.25F, -0.35F, -0.3F, -0.15F, -0.35F, 0.1F, -0.25F, -0.35F, -0.75F, -0.25F, -0.35F, -0.75F, -0.25F, -0.35F, 0.1F, -0.25F, -0.35F); // Box 48
		bodyModel[327].setRotationPoint(37.9F, -10.1F, -8.45F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.25F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F); // Box 49
		bodyModel[328].setRotationPoint(37.2F, -10F, -8.45F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.35F, 0F, -1.55F, -0.35F, 0F, -1.55F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.1F, 0.85F, -0.35F, 0.1F, 0.85F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 50
		bodyModel[329].setRotationPoint(34.4F, -11.6F, -8.5F);
		bodyModel[329].rotateAngleZ = -0.15707963F;

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.35F, -0.35F, 0F, -1.55F, -0.35F, 0F, -1.55F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0.1F, 0.85F, -0.35F, 0.1F, 0.85F, -0.35F, -0.2F, -0.35F, -0.35F); // Box 51
		bodyModel[330].setRotationPoint(34.4F, -11.6F, -5.2F);
		bodyModel[330].rotateAngleZ = -0.15707963F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 120
		bodyModel[331].setRotationPoint(35.2F, -12.4F, -10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 121
		bodyModel[332].setRotationPoint(35.2F, -12.4F, -6.85F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 122
		bodyModel[333].setRotationPoint(35.2F, -13.4F, -6.85F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 123
		bodyModel[334].setRotationPoint(35.2F, -11.4F, -6.85F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 124
		bodyModel[335].setRotationPoint(35.2F, -11.4F, -10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 125
		bodyModel[336].setRotationPoint(35.2F, -13.4F, -10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 126
		bodyModel[337].setRotationPoint(34.3F, -12.9F, -6.9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 127
		bodyModel[338].setRotationPoint(34.3F, -12.9F, -9.9F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 512
		turretModel[1] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 513
		turretModel[2] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 514
		turretModel[3] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 515
		turretModel[4] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 516
		turretModel[5] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 517
		turretModel[6] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Box 518
		turretModel[7] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Box 519
		turretModel[8] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 520
		turretModel[9] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 521
		turretModel[10] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 522
		turretModel[11] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 523
		turretModel[12] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 524
		turretModel[13] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 525
		turretModel[14] = new ModelRendererTurbo(this, 305, 201, textureX, textureY); // Box 526
		turretModel[15] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 527
		turretModel[16] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 532
		turretModel[17] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Box 535
		turretModel[18] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 536
		turretModel[19] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Box 537
		turretModel[20] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 538
		turretModel[21] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 540
		turretModel[22] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 542
		turretModel[23] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Box 543
		turretModel[24] = new ModelRendererTurbo(this, 401, 209, textureX, textureY); // Box 544
		turretModel[25] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 551
		turretModel[26] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 552
		turretModel[27] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 553
		turretModel[28] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Box 554
		turretModel[29] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Box 375
		turretModel[30] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 378
		turretModel[31] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 379
		turretModel[32] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 380
		turretModel[33] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 381
		turretModel[34] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 382
		turretModel[35] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 383
		turretModel[36] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 384
		turretModel[37] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Box 385
		turretModel[38] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 389
		turretModel[39] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 390
		turretModel[40] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 391
		turretModel[41] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 392
		turretModel[42] = new ModelRendererTurbo(this, 273, 265, textureX, textureY); // Box 393
		turretModel[43] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Box 394
		turretModel[44] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Box 395
		turretModel[45] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Box 396
		turretModel[46] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 397
		turretModel[47] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 410
		turretModel[48] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 411
		turretModel[49] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 412
		turretModel[50] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 413
		turretModel[51] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 414
		turretModel[52] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 415
		turretModel[53] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 416
		turretModel[54] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 417
		turretModel[55] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Box 418
		turretModel[56] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 419
		turretModel[57] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Box 420
		turretModel[58] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 421
		turretModel[59] = new ModelRendererTurbo(this, 49, 281, textureX, textureY); // Box 422
		turretModel[60] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 423
		turretModel[61] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 424
		turretModel[62] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 425
		turretModel[63] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Box 426
		turretModel[64] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 427
		turretModel[65] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 428
		turretModel[66] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 429
		turretModel[67] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 430
		turretModel[68] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Box 455

		turretModel[0].addBox(-6.5F, 0F, -14F, 15, 2, 29, 0F); // Box 512
		turretModel[0].setRotationPoint(0F, -16F, 0F);

		turretModel[1].addShapeBox(9.5F, 0F, -14F, 8, 2, 29, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 513
		turretModel[1].setRotationPoint(-1F, -16F, 0F);

		turretModel[2].addShapeBox(-13.5F, 0F, -14F, 8, 2, 29, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 514
		turretModel[2].setRotationPoint(-1F, -16F, 0F);

		turretModel[3].addBox(-17F, -2F, -23F, 33, 2, 46, 0F); // Box 515
		turretModel[3].setRotationPoint(0F, -15.5F, 0F);

		turretModel[4].addShapeBox(-26F, -2F, -23F, 9, 2, 46, 0F,0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Box 516
		turretModel[4].setRotationPoint(0F, -15.5F, 0F);

		turretModel[5].addShapeBox(16F, -2F, -23F, 9, 2, 46, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 517
		turretModel[5].setRotationPoint(0F, -15.5F, 0F);

		turretModel[6].addShapeBox(-17F, -12F, -23F, 33, 10, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		turretModel[6].setRotationPoint(0F, -15.5F, 0F);

		turretModel[7].addShapeBox(-17F, -12F, 22F, 33, 10, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		turretModel[7].setRotationPoint(0F, -15.5F, 0F);

		turretModel[8].addShapeBox(-26F, -12F, -13F, 1, 10, 26, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		turretModel[8].setRotationPoint(0F, -15.5F, 0F);

		turretModel[9].addShapeBox(-26F, -12F, -22F, 1, 10, 9, 0F,-9F, 0F, -2F, 8F, 0F, -3F, 3F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 1F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		turretModel[9].setRotationPoint(0F, -15.5F, 0F);

		turretModel[10].addShapeBox(-26F, -12F, 13F, 1, 10, 9, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 9F, 0F, -3F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, -9F, 0F, 1F); // Box 522
		turretModel[10].setRotationPoint(0F, -15.5F, 0F);

		turretModel[11].addShapeBox(24F, -13F, 13F, 1, 10, 9, 0F,3F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, -2F, 8F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 1F, 8F, 0F, 0F); // Box 523
		turretModel[11].setRotationPoint(0F, -14.5F, 0F);

		turretModel[12].addShapeBox(24F, -13F, -22F, 1, 10, 9, 0F,8F, 0F, -3F, -9F, 0F, -2F, -3F, 0F, 0F, 3F, 0F, 0F, 8F, 0F, 0F, -9F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		turretModel[12].setRotationPoint(0F, -14.5F, 0F);

		turretModel[13].addShapeBox(24F, -13F, -13F, 1, 10, 7, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		turretModel[13].setRotationPoint(0F, -14.5F, 0F);

		turretModel[14].addShapeBox(24F, -13F, 6F, 1, 10, 7, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		turretModel[14].setRotationPoint(0F, -14.5F, 0F);

		turretModel[15].addShapeBox(6F, -17F, -2F, 19, 10, 4, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		turretModel[15].setRotationPoint(0F, -10.5F, 0F);

		turretModel[16].addShapeBox(22F, -17F, -20F, 1, 4, 9, 0F,8F, 0F, -4F, -9F, 0F, -3F, -4F, 0F, 0F, 4F, 0F, 0F, 7F, 0F, -1F, -7F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, -1F); // Box 532
		turretModel[16].setRotationPoint(0F, -14.5F, 0F);

		turretModel[17].addShapeBox(-17F, -17F, -20F, 33, 4, 1, 0F,-2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		turretModel[17].setRotationPoint(0F, -14.5F, 0F);

		turretModel[18].addShapeBox(-17F, -17F, 19F, 33, 4, 1, 0F,-2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 536
		turretModel[18].setRotationPoint(0F, -14.5F, 0F);

		turretModel[19].addShapeBox(-24F, -17F, -11F, 1, 4, 22, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 2F); // Box 537
		turretModel[19].setRotationPoint(0F, -14.5F, 0F);

		turretModel[20].addShapeBox(22F, -17F, -11F, 1, 4, 3, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 2F, 4F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 2F); // Box 538
		turretModel[20].setRotationPoint(0F, -14.5F, 0F);

		turretModel[21].addShapeBox(9F, -17F, 0F, 14, 4, 0, 0F,4F, -3F, 2F, -4F, 0F, 2F, -4F, 0F, 2F, 4F, -3F, 2F, 6F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, 6F, 0F, 2F); // Box 540
		turretModel[21].setRotationPoint(0F, -14.5F, 0F);

		turretModel[22].addShapeBox(22F, -17F, 8F, 1, 4, 3, 0F,4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 2F); // Box 542
		turretModel[22].setRotationPoint(0F, -14.5F, 0F);

		turretModel[23].addShapeBox(-24F, -17F, -20F, 1, 4, 9, 0F,-9F, 0F, -3F, 8F, 0F, -4F, 4F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, -2F); // Box 543
		turretModel[23].setRotationPoint(0F, -14.5F, 0F);

		turretModel[24].addShapeBox(-24F, -17F, 11F, 1, 4, 9, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 8F, 0F, -4F, -9F, 0F, -3F, -1F, 0F, -2F, 1F, 0F, -1F, 7F, 0F, -1F, -7F, 0F, 0F); // Box 544
		turretModel[24].setRotationPoint(0F, -14.5F, 0F);

		turretModel[25].addShapeBox(24F, -6F, -6F, 1, 3, 12, 0F,1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		turretModel[25].setRotationPoint(0F, -14.5F, 0F);

		turretModel[26].addShapeBox(-2F, -14F, -2F, 8, 11, 4, 0F,3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		turretModel[26].setRotationPoint(0F, -14.5F, 0F);

		turretModel[27].addShapeBox(-12F, -14F, -2F, 10, 11, 4, 0F,3F, 1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		turretModel[27].setRotationPoint(0F, -14.5F, 0F);

		turretModel[28].addShapeBox(-19F, -14F, -2F, 7, 11, 4, 0F,2F, 1F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 2F, 1F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Box 554
		turretModel[28].setRotationPoint(0F, -14.5F, 0F);

		turretModel[29].addShapeBox(22F, -17F, 11F, 1, 4, 9, 0F,4F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, -3F, 8F, 0F, -4F, 1F, 0F, -1F, -1F, 0F, -2F, -7F, 0F, 0F, 7F, 0F, -1F); // Box 375
		turretModel[29].setRotationPoint(0F, -14.5F, 0F);

		turretModel[30].addShapeBox(-5F, -14F, 2F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		turretModel[30].setRotationPoint(0F, -12.5F, 0F);

		turretModel[31].addShapeBox(-5F, -18F, 2F, 7, 4, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		turretModel[31].setRotationPoint(0F, -12.5F, 0F);

		turretModel[32].addShapeBox(-5F, -18F, -4F, 7, 4, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		turretModel[32].setRotationPoint(0F, -12.5F, 0F);

		turretModel[33].addShapeBox(-5F, -17F, 4F, 7, 3, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		turretModel[33].setRotationPoint(0F, -12.5F, 0F);

		turretModel[34].addShapeBox(-5F, -17F, -6F, 7, 3, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		turretModel[34].setRotationPoint(0F, -12.5F, 0F);

		turretModel[35].addShapeBox(-5F, -14F, -6F, 7, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		turretModel[35].setRotationPoint(0F, -12.5F, 0F);

		turretModel[36].addShapeBox(-16F, -6F, -22F, 31, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		turretModel[36].setRotationPoint(0F, -12.5F, 0F);

		turretModel[37].addShapeBox(-16F, -6F, 16F, 31, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		turretModel[37].setRotationPoint(0F, -12.5F, 0F);

		turretModel[38].addShapeBox(-6F, -18F, -17.5F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		turretModel[38].setRotationPoint(0F, -12.5F, 0F);

		turretModel[39].addShapeBox(-7F, -18F, -17.5F, 1, 3, 3, 0F,-0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 390
		turretModel[39].setRotationPoint(0F, -12.5F, 0F);

		turretModel[40].addShapeBox(-1F, -18F, -17.5F, 1, 3, 3, 0F,-0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 391
		turretModel[40].setRotationPoint(0F, -12.5F, 0F);

		turretModel[41].addShapeBox(-6F, -15.5F, -17.5F, 5, 1, 3, 0F,0.5F, -0.4F, 0.2F, 0.5F, -0.4F, 0.2F, 0.5F, -0.4F, 0.2F, 0.5F, -0.4F, 0.2F, 0.5F, -0.4F, 0.2F, 0.5F, -0.4F, 0.2F, 0.5F, -0.4F, 0.2F, 0.5F, -0.4F, 0.2F); // Box 392
		turretModel[41].setRotationPoint(0F, -12.5F, 0F);

		turretModel[42].addShapeBox(-15.5F, -13F, -21.5F, 30, 7, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		turretModel[42].setRotationPoint(0F, -12.5F, 0F);

		turretModel[43].addShapeBox(-15.5F, -13F, 16.5F, 30, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		turretModel[43].setRotationPoint(0F, -12.5F, 0F);

		turretModel[44].addShapeBox(-22.5F, -13F, 3.5F, 5, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		turretModel[44].setRotationPoint(0F, -12.5F, 0F);

		turretModel[45].addShapeBox(-22.5F, -13F, -14.5F, 5, 7, 11, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		turretModel[45].setRotationPoint(0F, -12.5F, 0F);

		turretModel[46].addShapeBox(-23F, -6F, -15F, 6, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		turretModel[46].setRotationPoint(0F, -12.5F, 0F);

		turretModel[47].addShapeBox(1F, -9F, 21.5F, 15, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 410
		turretModel[47].setRotationPoint(0F, -15.5F, 0F);

		turretModel[48].addShapeBox(-17F, -9F, 21.5F, 15, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 411
		turretModel[48].setRotationPoint(0F, -15.5F, 0F);

		turretModel[49].addShapeBox(1F, -9F, 20F, 1, 1, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 412
		turretModel[49].setRotationPoint(0F, -15.5F, 0F);

		turretModel[50].addShapeBox(15F, -9F, 20F, 1, 1, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 413
		turretModel[50].setRotationPoint(0F, -15.5F, 0F);

		turretModel[51].addShapeBox(-3F, -9F, 20F, 1, 1, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 414
		turretModel[51].setRotationPoint(0F, -15.5F, 0F);

		turretModel[52].addShapeBox(-17F, -9F, 20F, 1, 1, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 415
		turretModel[52].setRotationPoint(0F, -15.5F, 0F);

		turretModel[53].addShapeBox(-3F, -9F, -22F, 1, 1, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 416
		turretModel[53].setRotationPoint(0F, -15.5F, 0F);

		turretModel[54].addShapeBox(-17F, -9F, -22F, 1, 1, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 417
		turretModel[54].setRotationPoint(0F, -15.5F, 0F);

		turretModel[55].addShapeBox(-17F, -9F, -22.5F, 15, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 418
		turretModel[55].setRotationPoint(0F, -15.5F, 0F);

		turretModel[56].addShapeBox(1F, -9F, -22F, 1, 1, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 419
		turretModel[56].setRotationPoint(0F, -15.5F, 0F);

		turretModel[57].addShapeBox(1F, -9F, -22.5F, 15, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 420
		turretModel[57].setRotationPoint(0F, -15.5F, 0F);

		turretModel[58].addShapeBox(15F, -9F, -22F, 1, 1, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 421
		turretModel[58].setRotationPoint(0F, -15.5F, 0F);

		turretModel[59].addShapeBox(-32F, -5F, -12.5F, 8, 1, 25, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 422
		turretModel[59].setRotationPoint(0F, -15.5F, 0F);

		turretModel[60].addShapeBox(-32F, -14F, -10.5F, 1, 1, 21, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 423
		turretModel[60].setRotationPoint(0F, -15.5F, 0F);

		turretModel[61].addShapeBox(-32F, -14F, -11F, 3, 10, 1, 0F,0F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, 1.3F, -2F, -0.8F, 1.3F, -2F, -0.8F, -1.6F, 0F, -0.8F, -1.6F); // Box 424
		turretModel[61].setRotationPoint(0F, -15.5F, 0F);

		turretModel[62].addShapeBox(-32F, -14F, 10F, 3, 10, 1, 0F,0F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, -1.6F, -2F, -0.8F, -1.6F, -2F, -0.8F, 1.3F, 0F, -0.8F, 1.3F); // Box 425
		turretModel[62].setRotationPoint(0F, -15.5F, 0F);

		turretModel[63].addShapeBox(-24.2F, -14F, -10.5F, 3, 1, 21, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 426
		turretModel[63].setRotationPoint(0F, -15.5F, 0F);

		turretModel[64].addShapeBox(-24F, -14F, -11F, 4, 10, 1, 0F,0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 2F, -0.8F, 1.3F, -4F, -0.8F, 1.3F, -4F, -0.8F, -1.6F, 2F, -0.8F, -1.6F); // Box 427
		turretModel[64].setRotationPoint(0F, -15.5F, 0F);

		turretModel[65].addShapeBox(-24F, -14F, 10F, 4, 10, 1, 0F,0F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 2F, -0.8F, -1.6F, -4F, -0.8F, -1.6F, -4F, -0.8F, 1.3F, 2F, -0.8F, 1.3F); // Box 428
		turretModel[65].setRotationPoint(0F, -15.5F, 0F);

		turretModel[66].addShapeBox(-31.2F, -14F, -11F, 10, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 429
		turretModel[66].setRotationPoint(0F, -15.5F, 0F);

		turretModel[67].addShapeBox(-31.2F, -14F, 10F, 10, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 430
		turretModel[67].setRotationPoint(0F, -15.5F, 0F);

		turretModel[68].addShapeBox(-31F, -11F, -9.5F, 6, 7, 20, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 455
		turretModel[68].setRotationPoint(0F, -15.5F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 546
		barrelModel[1] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 547
		barrelModel[2] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 555
		barrelModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 556
		barrelModel[4] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 373
		barrelModel[5] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 374
		barrelModel[6] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 376
		barrelModel[7] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Box 377
		barrelModel[8] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 398
		barrelModel[9] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 399
		barrelModel[10] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 400
		barrelModel[11] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // Box 401
		barrelModel[12] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 402
		barrelModel[13] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 403
		barrelModel[14] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 404
		barrelModel[15] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box 405
		barrelModel[16] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Box 406
		barrelModel[17] = new ModelRendererTurbo(this, 153, 273, textureX, textureY); // Box 407
		barrelModel[18] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 408
		barrelModel[19] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Box 409

		barrelModel[0].addShapeBox(12F, -6F, -4F, 1, 4, 0, 0F,4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 2F); // Box 546
		barrelModel[0].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[1].addShapeBox(14F, -2F, -6F, 1, 7, 4, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 547
		barrelModel[1].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[2].addShapeBox(14F, -2F, 2F, 1, 7, 4, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 555
		barrelModel[2].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[3].addShapeBox(12F, -6F, 4F, 1, 4, 0, 0F,4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 2F, 4F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2F, 1F, 0F, 2F); // Box 556
		barrelModel[3].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[4].addShapeBox(-6F, -2F, -7F, 17, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 373
		barrelModel[4].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[5].addShapeBox(-6F, -2F, 2F, 17, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 374
		barrelModel[5].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[6].addShapeBox(0F, -2F, 7F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		barrelModel[6].setRotationPoint(9F, -25F, 0F);

		barrelModel[7].addShapeBox(0F, -2F, -12F, 9, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		barrelModel[7].setRotationPoint(9F, -25F, 0F);

		barrelModel[8].addShapeBox(1F, -3F, 7F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		barrelModel[8].setRotationPoint(9F, -25F, 0F);

		barrelModel[9].addShapeBox(1F, -3F, -12F, 8, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		barrelModel[9].setRotationPoint(9F, -25F, 0F);

		barrelModel[10].addShapeBox(11F, 3F, 2.75F, 12, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 400
		barrelModel[10].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[11].addShapeBox(11F, 3F, -4.75F, 12, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 401
		barrelModel[11].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[12].addShapeBox(9F, 5F, 2.75F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 402
		barrelModel[12].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[13].addShapeBox(9F, 5F, -4.75F, 12, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 403
		barrelModel[13].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[14].addShapeBox(22F, 3F, 2.75F, 14, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 404
		barrelModel[14].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[15].addShapeBox(22F, 3F, -4.75F, 14, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 405
		barrelModel[15].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[16].addShapeBox(36F, 3F, -4.75F, 49, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 406
		barrelModel[16].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[17].addShapeBox(36F, 3F, 2.75F, 49, 2, 2, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 407
		barrelModel[17].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[18].addShapeBox(85F, 3F, 2.75F, 5, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 408
		barrelModel[18].setRotationPoint(9F, -25.5F, 0F);

		barrelModel[19].addShapeBox(85F, 3F, -4.75F, 5, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 409
		barrelModel[19].setRotationPoint(9F, -25.5F, 0F);
	}
}